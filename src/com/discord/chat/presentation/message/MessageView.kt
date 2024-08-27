package com.discord.chat.presentation.message

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import android.view.ViewGroup.LayoutParams
import android.view.ViewGroup.MarginLayoutParams
import android.widget.TextView
import androidx.core.view.f1
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.SetTextSizeSpKt
import com.discord.chat.R
import com.discord.chat.bridge.MediaType
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.bridge.MessageState
import com.discord.chat.bridge.MessageType
import com.discord.chat.bridge.UploadProgress
import com.discord.chat.bridge.activities.ActivityInstanceEmbed
import com.discord.chat.bridge.activities.ActivityInviteEmbed
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.attachment.AttachmentType
import com.discord.chat.bridge.codedlinks.ActivityBookmarkEmbedImpl
import com.discord.chat.bridge.codedlinks.CodedLinkEmbed
import com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbedImpl
import com.discord.chat.bridge.codedlinks.GuildEventInviteEmbedImpl
import com.discord.chat.bridge.codedlinks.GuildInviteDisabledEmbedImpl
import com.discord.chat.bridge.codedlinks.GuildInviteEmbedImpl
import com.discord.chat.bridge.ctabutton.CtaButton
import com.discord.chat.bridge.embed.Embed
import com.discord.chat.bridge.ephemeral.EphemeralIndication
import com.discord.chat.bridge.feedback.SurveyIndication
import com.discord.chat.bridge.forwarding.ForwardInfo
import com.discord.chat.bridge.gift.GiftEmbed
import com.discord.chat.bridge.interaction.InteractionStatus
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.bridge.messageframe.MessageFrameMediaViewer
import com.discord.chat.bridge.messageframe.UnknownMessageFrame
import com.discord.chat.bridge.policynotice.SafetyPolicyNoticeEmbed
import com.discord.chat.bridge.polls.PollLayoutType
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed
import com.discord.chat.bridge.safetysystemnotification.SafetySystemNotificationEmbed
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.bridge.sticker.Sticker
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.threads.ThreadEmbed
import com.discord.chat.bridge.voiceinviteembed.VoiceInviteEmbed
import com.discord.chat.databinding.MessageViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.ChatListRelativeLayout
import com.discord.chat.presentation.list.MaskedShadowView
import com.discord.chat.presentation.list.SwipeReplyInitiator
import com.discord.chat.presentation.message.messagepart.ActivityBookmarkMessageAccessory
import com.discord.chat.presentation.message.messagepart.ActivityInstanceEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.ActivityInviteEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.CtaButtonMessageAccessory
import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.EmbeddedActivityInviteMessageAccessory
import com.discord.chat.presentation.message.messagepart.EphemeralIndicationMessageAccessory
import com.discord.chat.presentation.message.messagepart.ForumPostActionBar
import com.discord.chat.presentation.message.messagepart.ForwardBreadcrumbMessageAccessory
import com.discord.chat.presentation.message.messagepart.ForwardHeaderMessageAccessory
import com.discord.chat.presentation.message.messagepart.GiftMessageAccessory
import com.discord.chat.presentation.message.messagepart.GuildEventInviteMessageAccessory
import com.discord.chat.presentation.message.messagepart.GuildInviteDisabledMessageAccessory
import com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory
import com.discord.chat.presentation.message.messagepart.InfoLinkMessageAccessory
import com.discord.chat.presentation.message.messagepart.InteractionStatusMessageAccessory
import com.discord.chat.presentation.message.messagepart.MediaMosaicAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageComponentsAccessory
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory
import com.discord.chat.presentation.message.messagepart.PostPreviewEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.ReactionsMessageAccessory
import com.discord.chat.presentation.message.messagepart.SafetyPolicyNoticeMessageAccessory
import com.discord.chat.presentation.message.messagepart.SafetySystemNotificationMessageAccessory
import com.discord.chat.presentation.message.messagepart.StickerMessageAccessory
import com.discord.chat.presentation.message.messagepart.SurveyIndicationMessageAccessory
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.UploadProgressMessageAccessory
import com.discord.chat.presentation.message.messagepart.VoiceInviteMessageAccessory
import com.discord.chat.presentation.message.view.MessageContentView
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.root.MessageContext
import com.discord.chat.presentation.root.MessageContextType
import com.discord.chat.presentation.spine.SpineParentMessage
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageFlag
import com.discord.primitives.MessageFlagKt
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function6

public class MessageView  public constructor(context: Context, attrs: AttributeSet? = null)
   : ChatListRelativeLayout,
   SpacingProviderView,
   SpineParentMessage,
   SwipeReplyInitiator {
   private final val binding: MessageViewBinding

   private final val replyPreview: MessageViewReplyPreview
      private final get() {
         return this.replyPreview$delegate.getValue() as MessageViewReplyPreview;
      }


   private final val threadStarterMessageHeaderView: ThreadStarterMessageHeaderView
      private final get() {
         return this.threadStarterMessageHeaderView$delegate.getValue() as ThreadStarterMessageHeaderView;
      }


   private final val messageHighlightHeader: MessageHighlightHeader
      private final get() {
         return this.messageHighlightHeader$delegate.getValue() as MessageHighlightHeader;
      }


   public open lateinit var shadowView: MaskedShadowView
   private final var messageId: MessageId?
   private final var onChainPart: () -> com.discord.chat.presentation.message.MessageView.ChainPart
   private final var allowChildGestures: Boolean
   public open var onInitiateReply: () -> Unit
   public open var onInitiateEdit: () -> Unit
   public open var enableSwipeToReply: Boolean
   public open var enableSwipeToEdit: Boolean
   public open var usingGradientTheme: Boolean
   private final var accessories: ArrayList<MessageAccessory>

   public open val spineOriginView: View
      public open get() {
         val var1: SimpleDraweeView = this.binding.authorAvatar;
         kotlin.jvm.internal.r.g(this.binding.authorAvatar, "binding.authorAvatar");
         return var1;
      }


   fun MessageView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      val var5: MessageViewBinding = MessageViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var5, "inflate(LayoutInflater.from(context), this)");
      this.binding = var5;
      this.replyPreview$delegate = eh.l.b(new Function0<MessageViewReplyPreview>(this) {
         final MessageView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final MessageViewReplyPreview invoke() {
            val var1: View = MessageView.access$getBinding$p(this.this$0).replyPreviewView.inflate();
            kotlin.jvm.internal.r.f(var1, "null cannot be cast to non-null type com.discord.chat.presentation.message.MessageViewReplyPreview");
            return var1 as MessageViewReplyPreview;
         }
      });
      this.threadStarterMessageHeaderView$delegate = eh.l.b(new Function0<ThreadStarterMessageHeaderView>(this) {
         final MessageView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final ThreadStarterMessageHeaderView invoke() {
            val var1: View = MessageView.access$getBinding$p(this.this$0).threadStarterHeaderView.inflate();
            kotlin.jvm.internal.r.f(var1, "null cannot be cast to non-null type com.discord.chat.presentation.message.ThreadStarterMessageHeaderView");
            return var1 as ThreadStarterMessageHeaderView;
         }
      });
      this.messageHighlightHeader$delegate = eh.l.b(new Function0<MessageHighlightHeader>(this) {
         final MessageView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final MessageHighlightHeader invoke() {
            val var1: View = MessageView.access$getBinding$p(this.this$0).highlightHeaderView.inflate();
            kotlin.jvm.internal.r.f(var1, "null cannot be cast to non-null type com.discord.chat.presentation.message.MessageHighlightHeader");
            return var1 as MessageHighlightHeader;
         }
      });
      this.setPadding(0, SizeUtilsKt.getDpToPx(2), 0, SizeUtilsKt.getDpToPx(2));
      RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
      var var3: TextView = var5.timestamp;
      kotlin.jvm.internal.r.g(var5.timestamp, "binding.timestamp");
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryMedium);
      var5.timestamp.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      var3 = var5.timestamp;
      kotlin.jvm.internal.r.g(var5.timestamp, "binding.timestamp");
      SetTextSizeSpKt.setTextSizeSp(var3, 12.0F, 15.0F);
      var3 = var5.authorName;
      kotlin.jvm.internal.r.g(var5.authorName, "binding.authorName");
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimarySemibold);
      var3 = var5.authorName;
      kotlin.jvm.internal.r.g(var5.authorName, "binding.authorName");
      SetTextSizeSpKt.setTextSizeSp(var3, 16.0F, 20.0F);
      val var9: SimpleDraweeView = var5.authorAvatar;
      kotlin.jvm.internal.r.g(var5.authorAvatar, "binding.authorAvatar");
      ViewClippingUtilsKt.clipToCircle(var9);
      var5.messageHeaderDivider.setBackgroundColor(ColorUtilsKt.getThemeColor(var1, R.color.message_divider_light, R.color.message_divider_dark));
      val var4: MaskedShadowView = var5.shadowView;
      kotlin.jvm.internal.r.g(var5.shadowView, "binding.shadowView");
      this.setShadowView(var4);
      this.getShadowView().setVisibility(4);
      this.onChainPart = <unrepresentable>.INSTANCE;
      this.allowChildGestures = true;
      this.onInitiateReply = <unrepresentable>.INSTANCE;
      this.onInitiateEdit = <unrepresentable>.INSTANCE;
      this.accessories = new ArrayList<>(2);
   }

   private fun configureAccessibilityDelegate(
      message: Message,
      accessories: List<MessageAccessory>,
      onClick: OnClickListener?,
      messageLongPress: OnLongClickListener?
   ) {
      val var7: Boolean = var2 is java.util.Collection;
      val var6: Boolean = true;
      var var5: Boolean;
      if (var7 && var2.isEmpty()) {
         var5 = true;
      } else {
         val var8: java.util.Iterator = var2.iterator();

         while (true) {
            var5 = var6;
            if (!var8.hasNext()) {
               break;
            }

            if (var8.next() as MessageAccessory is MessageContentAccessory) {
               var5 = false;
               break;
            }
         }
      }

      if (var5) {
         f1.q0(this, new MessageViewAccessibilityDelegate(var1, null, var3, var4));
      } else {
         this.binding.accessoriesView.setOnCurrentContentViewChanged(new Function1<MessageContentView, Unit>(this, var1, var3, var4) {
            final Message $message;
            final OnLongClickListener $messageLongPress;
            final OnClickListener $onClick;
            final MessageView this$0;

            {
               super(1);
               this.this$0 = var1;
               this.$message = var2;
               this.$onClick = var3;
               this.$messageLongPress = var4;
            }

            public final void invoke(MessageContentView var1) {
               kotlin.jvm.internal.r.h(var1, "it");
               f1.q0(this.this$0, new MessageViewAccessibilityDelegate(this.$message, var1, this.$onClick, this.$messageLongPress));
            }
         });
      }
   }

   private fun configureAccessoriesMargin(items: List<MessageAccessory>) {
      val var7: Boolean = kotlin.collections.h.c0(var1) is MessageContentAccessory;
      var var11: Boolean;
      if (var1.size() > 1) {
         var11 = true;
      } else {
         var11 = false;
      }

      if (!var11 && var7) {
         var11 = false;
      } else {
         var11 = true;
      }

      val var8: MessageView.ChainPart = this.onChainPart.invoke() as MessageView.ChainPart;
      var var4: Boolean = true;
      if (var8 != MessageView.ChainPart.MIDDLE) {
         if (var8 === MessageView.ChainPart.START) {
            var4 = true;
         } else {
            var4 = false;
         }
      }

      val var14: Int;
      if (var7) {
         var14 = 0;
      } else {
         var14 = SizeUtilsKt.getDpToPx(8);
      }

      var var5: Int = 0;
      if (var11) {
         var5 = 0;
         if (var4) {
            var5 = SizeUtilsKt.getDpToPx(4);
         }
      }

      val var9: LayoutParams = this.binding.accessoriesView.getLayoutParams();
      kotlin.jvm.internal.r.f(var9, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
      val var10: MarginLayoutParams = var9 as MarginLayoutParams;
      if ((var9 as MarginLayoutParams).topMargin != var14 || (var9 as MarginLayoutParams).bottomMargin != var5) {
         var10.setMargins(var10.leftMargin, var14, var10.rightMargin, var5);
         this.binding.accessoriesView.setLayoutParams(var10);
      }
   }

   private fun configureAuthor(message: Message, eventHandler: ChatEventHandler, chainPart: com.discord.chat.presentation.message.MessageView.ChainPart) {
      if (var3 != MessageView.ChainPart.START && var3 != MessageView.ChainPart.ONLY) {
         this.hideHeader();
      } else {
         val var9: TextView = this.binding.authorName;
         this.binding.authorName.setTextColor(MessageKt.usernameColor$default(var1, 0, 1, null));
         var9.setText(var1.getUsername());
         kotlin.jvm.internal.r.g(var9, "configureAuthor$lambda$35");
         this.configureAuthorClickListeners(var9, var1, var2);
         val var10: RoleDotView = this.binding.roleDot;
         kotlin.jvm.internal.r.g(this.binding.roleDot, "binding.roleDot");
         this.configureAuthorClickListeners(var10, var1, var2);
         this.binding.timestamp.setText(var1.getTimestamp());
         val var11: SimpleDraweeView = this.binding.authorAvatar;
         val var4: Context = this.binding.authorAvatar.getContext();
         kotlin.jvm.internal.r.g(var4, "context");
         var11.setImageURI(MessageKt.avatarUrl(var1, var4));
         kotlin.jvm.internal.r.g(var11, "configureAuthor$lambda$38");
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var11, false, new p(var1, var2), 1, null);
         NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var11, false, new q(var1, var2), 1, null);
         if (var1.getAvatarDecorationURL() != null) {
            val var12: SimpleDraweeView = this.binding.authorAvatarDecoration;
            kotlin.jvm.internal.r.g(this.binding.authorAvatarDecoration, "binding.authorAvatarDecoration");
            var12.setVisibility(0);
            this.binding.authorAvatarDecoration.setImageURI(var1.getAvatarDecorationURL());
            val var13: SimpleDraweeView = this.binding.authorAvatar;
            kotlin.jvm.internal.r.g(this.binding.authorAvatar, "binding.authorAvatar");
            val var31: LayoutParams = var13.getLayoutParams();
            if (var31 == null) {
               throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }

            val var32: MarginLayoutParams = var31 as MarginLayoutParams;
            (var31 as MarginLayoutParams).topMargin = SizeUtilsKt.getDpToPx(6);
            var32.bottomMargin = SizeUtilsKt.getDpToPx(6);
            var13.setLayoutParams(var32);
         } else {
            val var14: SimpleDraweeView = this.binding.authorAvatarDecoration;
            kotlin.jvm.internal.r.g(this.binding.authorAvatarDecoration, "binding.authorAvatarDecoration");
            var14.setVisibility(8);
            val var15: SimpleDraweeView = this.binding.authorAvatar;
            kotlin.jvm.internal.r.g(this.binding.authorAvatar, "binding.authorAvatar");
            val var33: LayoutParams = var15.getLayoutParams();
            if (var33 == null) {
               throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }

            val var34: MarginLayoutParams = var33 as MarginLayoutParams;
            (var33 as MarginLayoutParams).topMargin = 0;
            var34.bottomMargin = 0;
            var15.setLayoutParams(var34);
         }

         val var16: TextView = this.binding.timestamp;
         kotlin.jvm.internal.r.g(this.binding.timestamp, "binding.timestamp");
         var16.setVisibility(0);
         val var17: TextView = this.binding.authorName;
         kotlin.jvm.internal.r.g(this.binding.authorName, "binding.authorName");
         var17.setVisibility(0);
         val var18: SimpleDraweeView = this.binding.authorAvatar;
         kotlin.jvm.internal.r.g(this.binding.authorAvatar, "binding.authorAvatar");
         var18.setVisibility(0);
         if (var1.getShouldShowRoleDot()) {
            val var19: RoleDotView = this.binding.roleDot;
            kotlin.jvm.internal.r.g(this.binding.roleDot, "binding.roleDot");
            var19.setVisibility(0);
            val var20: RoleDotView = this.binding.roleDot;
            kotlin.jvm.internal.r.g(this.binding.roleDot, "binding.roleDot");
            RoleDotView.configure$default(var20, MessageKt.roleDotColor$default(var1, 0, 1, null), 0, 2, null);
         } else {
            val var21: RoleDotView = this.binding.roleDot;
            kotlin.jvm.internal.r.g(this.binding.roleDot, "binding.roleDot");
            var21.setVisibility(8);
         }

         if (var1.getClanTag() != null && var1.getClanTagGuildId_qOKuAAo() != null) {
            val var23: ClanTagChipletView = this.binding.clanTagChiplet;
            kotlin.jvm.internal.r.g(this.binding.clanTagChiplet, "binding.clanTagChiplet");
            ClanTagChipletView.configure_D0ylKIU$default(
               var23, var1.getClanTag(), var1.getClanBadgeUrl(), var1.getClanTagGuildId_qOKuAAo().unbox_impl(), var2, 0.0F, 16, null
            );
            val var24: ClanTagChipletView = this.binding.clanTagChiplet;
            kotlin.jvm.internal.r.g(this.binding.clanTagChiplet, "binding.clanTagChiplet");
            var24.setVisibility(0);
         } else {
            val var22: ClanTagChipletView = this.binding.clanTagChiplet;
            kotlin.jvm.internal.r.g(this.binding.clanTagChiplet, "binding.clanTagChiplet");
            var22.setVisibility(8);
         }

         if (var1.getRoleIcon() != null) {
            this.binding.roleIcon.configureRoleIcon(var1.getRoleIcon(), var2);
            val var25: RoleIconView = this.binding.roleIcon;
            kotlin.jvm.internal.r.g(this.binding.roleIcon, "binding.roleIcon");
            var25.setVisibility(0);
         } else {
            val var26: RoleIconView = this.binding.roleIcon;
            kotlin.jvm.internal.r.g(this.binding.roleIcon, "binding.roleIcon");
            var26.setVisibility(8);
         }

         if (var1.getConnectionsRoleTag() != null) {
            this.binding
               .connectionsRoleTag
               .configureConnectionsRoleTag_uESh2Cg(
                  var1.getAuthorId_wUX8bhU(), var1.getGuildId_qOKuAAo(), ChannelId.box_impl(var1.getChannelId_o4g7jtM()), var1.getConnectionsRoleTag(), var2
               );
            val var27: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
            kotlin.jvm.internal.r.g(this.binding.connectionsRoleTag, "binding.connectionsRoleTag");
            var27.setVisibility(0);
         } else {
            val var28: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
            kotlin.jvm.internal.r.g(this.binding.connectionsRoleTag, "binding.connectionsRoleTag");
            var28.setVisibility(8);
         }

         if (var1.getTagText() == null && var1.getOpTagText() == null) {
            val var7: MessageTagView = this.binding.messageTagView;
            kotlin.jvm.internal.r.g(this.binding.messageTagView, "binding.messageTagView");
            var7.setVisibility(8);
            val var8: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
            kotlin.jvm.internal.r.g(this.binding.messageAltRemixTagView, "binding.messageAltRemixTagView");
            var8.setVisibility(8);
         } else if (var1.getTagType() != null && kotlin.jvm.internal.r.c(var1.getTagType(), "f")) {
            val var30: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
            kotlin.jvm.internal.r.g(this.binding.messageAltRemixTagView, "binding.messageAltRemixTagView");
            var30.setVisibility(0);
            this.binding
               .messageAltRemixTagView
               .configureTagView_e2j04IU(
                  var1.getTagText(),
                  var1.getTagTextColor(),
                  var1.getTagBackgroundColor(),
                  var2,
                  var1.getId_3Eiw7ao(),
                  var1.getChannelId_o4g7jtM(),
                  var1.getTagType()
               );
            val var6: MessageTagView = this.binding.messageTagView;
            kotlin.jvm.internal.r.g(this.binding.messageTagView, "binding.messageTagView");
            var6.setVisibility(8);
         } else {
            val var29: MessageTagView = this.binding.messageTagView;
            kotlin.jvm.internal.r.g(this.binding.messageTagView, "binding.messageTagView");
            var29.setVisibility(0);
            this.binding
               .messageTagView
               .configureTagView_Ul7AT2Q(
                  var1.getTagText(),
                  var1.getTagVerified(),
                  var1.getTagTextColor(),
                  var1.getTagBackgroundColor(),
                  var1.getOpTagText(),
                  var2,
                  var1.getId_3Eiw7ao(),
                  var1.getChannelId_o4g7jtM(),
                  var1.getTagType(),
                  var1.getTagIconUrl()
               );
            val var5: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
            kotlin.jvm.internal.r.g(this.binding.messageAltRemixTagView, "binding.messageAltRemixTagView");
            var5.setVisibility(8);
         }
      }
   }

   @JvmStatic
   fun `configureAuthor$lambda$38$lambda$36`(var0: Message, var1: ChatEventHandler, var2: View) {
      kotlin.jvm.internal.r.h(var0, "$message");
      kotlin.jvm.internal.r.h(var1, "$eventHandler");
      if (var0.getAuthorId_wUX8bhU() != null) {
         var1.onTapAvatar_x5gers8(var0.getId_3Eiw7ao(), var0.getAuthorId_wUX8bhU().unbox_impl());
      }
   }

   @JvmStatic
   fun `configureAuthor$lambda$38$lambda$37`(var0: Message, var1: ChatEventHandler, var2: View): Boolean {
      kotlin.jvm.internal.r.h(var0, "$message");
      kotlin.jvm.internal.r.h(var1, "$eventHandler");
      if (var0.getAuthorId_wUX8bhU() != null) {
         var1.onLongPressAvatar_x5gers8(var0.getId_3Eiw7ao(), var0.getAuthorId_wUX8bhU().unbox_impl());
      }

      return true;
   }

   private fun View.configureAuthorClickListeners(message: Message, eventHandler: ChatEventHandler) {
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var1, false, new t(var2, var3), 1, null);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var1, false, new u(var2, var3), 1, null);
   }

   @JvmStatic
   fun `configureAuthorClickListeners$lambda$6`(var0: Message, var1: ChatEventHandler, var2: View) {
      kotlin.jvm.internal.r.h(var0, "$message");
      kotlin.jvm.internal.r.h(var1, "$eventHandler");
      if (var0.getAuthorId_wUX8bhU() != null) {
         var1.onTapUsername_x5gers8(var0.getId_3Eiw7ao(), var0.getAuthorId_wUX8bhU().unbox_impl());
      }
   }

   @JvmStatic
   fun `configureAuthorClickListeners$lambda$7`(var0: Message, var1: ChatEventHandler, var2: View): Boolean {
      kotlin.jvm.internal.r.h(var0, "$message");
      kotlin.jvm.internal.r.h(var1, "$eventHandler");
      if (var0.getAuthorId_wUX8bhU() != null) {
         var1.onLongPressUsername_x5gers8(var0.getId_3Eiw7ao(), var0.getAuthorId_wUX8bhU().unbox_impl());
      }

      return true;
   }

   private fun configureCommunicationDisabled(isCommunicationDisabled: Boolean, chainPart: com.discord.chat.presentation.message.MessageView.ChainPart) {
      var var6: Byte = 0;
      val var5: Boolean;
      if (!var1 || var2 != MessageView.ChainPart.START && var2 != MessageView.ChainPart.ONLY) {
         var5 = false;
      } else {
         var5 = true;
      }

      val var7: SimpleDraweeView = this.binding.guildCommunicationDisabledIcon;
      kotlin.jvm.internal.r.g(this.binding.guildCommunicationDisabledIcon, "binding.guildCommunicationDisabledIcon");
      if (!var5) {
         var6 = 8;
      }

      var7.setVisibility(var6);
      val var8: SimpleDraweeView = this.binding.guildCommunicationDisabledIcon;
      kotlin.jvm.internal.r.g(this.binding.guildCommunicationDisabledIcon, "binding.guildCommunicationDisabledIcon");
      ReactAssetUtilsKt.setReactAsset(var8, ReactAsset.ClockTimeout);
      var var3: Float;
      if (var5) {
         var3 = 0.5F;
      } else {
         var3 = 1.0F;
      }

      this.binding.authorAvatar.setAlpha(var3);
      if (var5) {
         var3 = 0.5F;
      } else {
         var3 = 1.0F;
      }

      this.binding.clanTagChiplet.setAlpha(var3);
      if (var5) {
         var3 = 0.5F;
      } else {
         var3 = 1.0F;
      }

      this.binding.roleIcon.setAlpha(var3);
      if (var5) {
         var3 = 0.5F;
      } else {
         var3 = 1.0F;
      }

      this.binding.authorAvatarDecoration.setAlpha(var3);
      if (var5) {
         var3 = 0.5F;
      } else {
         var3 = 1.0F;
      }

      this.binding.suppressNotificationsIcon.setAlpha(var3);
   }

   private fun configureDivider(showDivider: Boolean) {
      val var3: View = this.binding.messageHeaderDivider;
      kotlin.jvm.internal.r.g(this.binding.messageHeaderDivider, "binding.messageHeaderDivider");
      val var2: Byte;
      if (var1) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var3.setVisibility(var2);
   }

   private fun configureSuppressNotifications(
      isSuppressNotifications: Boolean,
      eventHandler: ChatEventHandler,
      chainPart: com.discord.chat.presentation.message.MessageView.ChainPart
   ) {
      val var4: Boolean;
      if (!var1 || var3 != MessageView.ChainPart.START && var3 != MessageView.ChainPart.ONLY) {
         var4 = false;
      } else {
         var4 = true;
      }

      val var6: SimpleDraweeView = this.binding.suppressNotificationsIcon;
      kotlin.jvm.internal.r.g(this.binding.suppressNotificationsIcon, "binding.suppressNotificationsIcon");
      val var5: Byte;
      if (var4) {
         var5 = 0;
      } else {
         var5 = 8;
      }

      var6.setVisibility(var5);
      if (var4) {
         val var7: SimpleDraweeView = this.binding.suppressNotificationsIcon;
         kotlin.jvm.internal.r.g(this.binding.suppressNotificationsIcon, "binding.suppressNotificationsIcon");
         ReactAssetUtilsKt.setReactAsset(var7, ReactAsset.BellSnooze);
         val var8: SimpleDraweeView = this.binding.suppressNotificationsIcon;
         kotlin.jvm.internal.r.g(this.binding.suppressNotificationsIcon, "binding.suppressNotificationsIcon");
         ColorUtilsKt.setTintColor(var8, ThemeManagerKt.getTheme().getInteractiveNormal());
      }

      val var9: SimpleDraweeView = this.binding.suppressNotificationsIcon;
      kotlin.jvm.internal.r.g(this.binding.suppressNotificationsIcon, "binding.suppressNotificationsIcon");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var9, false, new o(var2), 1, null);
   }

   @JvmStatic
   fun `configureSuppressNotifications$lambda$41`(var0: ChatEventHandler, var1: View) {
      kotlin.jvm.internal.r.h(var0, "$eventHandler");
      var0.onTapSuppressNotificationsIcon();
   }

   private fun generateMessageAccessories(
      message: Message,
      messageContext: MessageContext,
      messageFrame: MessageFrame?,
      onLongClick: ((MessageId, ChannelId, Int?, MediaType?, String?, Int?) -> Unit)?
   ): List<MessageAccessory> {
      this.accessories.clear();
      val var14: Boolean;
      if (var1.getForwardInfo() != null) {
         var14 = true;
      } else {
         var14 = false;
      }

      var var13: Boolean;
      if (var1.getForwardInfo() != null && var1.getForwardInfo().getUseOldIcon()) {
         var13 = true;
      } else {
         var13 = false;
      }

      if (var14) {
         this.accessories.add(new ForwardHeaderMessageAccessory(var1.getId_3Eiw7ao(), var13, null));
      }

      val var21: Int = var1.getConstrainedWidth();
      val var6: Int;
      if (var21 != null) {
         var6 = var21;
      } else {
         var6 = this.getResources().getDisplayMetrics().widthPixels;
      }

      val var7: Int;
      if (var2.getUseAttachmentGridLayout()) {
         var7 = this.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_radius);
      } else {
         var7 = this.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_non_mosaic_radius);
      }

      val var84: StructurableText = var1.getContent();
      var var5: Boolean;
      if (var84 != null && var84.getHasContent()) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      var var85: java.lang.String = "context";
      if (var5 && var1.getType() != MessageType.CUSTOM_GIFT) {
         val var24: ArrayList = this.accessories;
         val var23: java.lang.String = var1.getId_3Eiw7ao();
         val var22: StructurableText = var1.getContent();
         val var15: Boolean = MessageKt.shouldAnimateEmoji(var1);
         val var18: Boolean = MessageKt.shouldShowLinkDecorations(var1);
         val var17: Boolean = var1.getShouldShowRoleDot();
         val var16: Boolean = var1.getShouldShowRoleOnName();
         val var9: Int = this.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing);
         val var25: Int = var1.getLinkColor();
         val var8: Int;
         if (var25 != null) {
            var8 = var25;
         } else {
            var8 = ThemeManagerKt.getTheme().getTextLink();
         }

         val var137: DiscordFont = DiscordFont.PrimaryMedium;
         val var26: Context = this.getContext();
         kotlin.jvm.internal.r.g(var26, "context");
         val var10: Int = MessageUtilsKt.getChatTextSizeSp(var26);
         val var144: MessageState = var1.getState();
         if (var144 == null) {
            var5 = -1;
         } else {
            var5 = MessageView.WhenMappings.$EnumSwitchMapping$0[var144.ordinal()];
         }

         if (var5 != 1 && var5 != 2) {
            val var145: Int = var1.getTextColor();
            if (var145 != null) {
               var5 = var145;
            } else {
               var5 = ThemeManagerKt.getTheme().getTextNormal();
            }
         } else {
            var5 = ThemeManagerKt.getTheme().getTextMuted();
         }

         var24.add(
            new MessageContentAccessory(
               var23,
               var22,
               var15,
               var18,
               var17,
               var16,
               var9,
               var8,
               var5,
               var137,
               var10,
               false,
               var6,
               var1.getEdited(),
               var1.getEditedColor(),
               var14,
               var2.getTruncation(),
               null,
               131072,
               null
            )
         );
      }

      if (var1.getPollData() != null && var1.getPollData().getLayoutType() != PollLayoutType.UNKNOWN) {
         val var127: ArrayList = this.accessories;
         val var102: PollMessageAccessory.Companion = PollMessageAccessory.Companion;
         val var117: Context = this.getContext();
         kotlin.jvm.internal.r.g(var117, "context");
         var127.add(var102.create(var117, var1, var1.getPollData()));
      }

      var var78: Boolean;
      if (var1.getAttachments() != null && var1.getPollData() == null && !MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.IS_UIKIT_COMPONENTS)) {
         label445: {
            val var103: java.util.List = var1.getAttachments();
            if (var103 !is java.util.Collection || !var103.isEmpty()) {
               val var104: java.util.Iterator = var103.iterator();

               while (var104.hasNext()) {
                  if (kotlin.jvm.internal.r.c((var104.next() as Attachment).getObscure(), java.lang.Boolean.TRUE)) {
                     var61 = true;
                     break label445;
                  }
               }
            }

            var61 = false;
         }

         val var128: java.lang.Iterable = kotlin.collections.h.T0(var1.getAttachments());
         val var118: ArrayList = new ArrayList();
         var var105: ArrayList = new ArrayList();

         for (Object var146 : var128) {
            val var69: Boolean;
            if (((var146 as fh.m).d() as Attachment).type() != AttachmentType.Image && ((var146 as fh.m).d() as Attachment).type() != AttachmentType.Video) {
               var69 = false;
            } else {
               var69 = true;
            }

            if (var69) {
               var118.add(var146);
            } else {
               var105.add(var146);
            }
         }

         val var106: Pair = new Pair(var118, var105);
         val var130: java.util.List = var106.a() as java.util.List;
         val var139: java.util.List = var106.b() as java.util.List;
         if (var130.isEmpty() xor true && var2.getUseAttachmentGridLayout()) {
            label361: {
               if (kotlin.jvm.internal.r.c(var1.isCurrentUserMessageAuthor(), java.lang.Boolean.TRUE)) {
                  val var119: java.lang.String = var1.getNonce_N_6c4I0();
                  var107 = var119;
                  if (var119 != null) {
                     break label361;
                  }
               }

               var107 = var1.getId_3Eiw7ao();
            }

            val var27: ArrayList = this.accessories;
            val var11: Long = var1.getChannelId_o4g7jtM();
            val var147: ArrayList = new ArrayList(kotlin.collections.h.t(var130, 10));

            for (fh.m var28 : var130) {
               val var131: Attachment = var28.d() as Attachment;
               val var70: Int = var28.c();
               val var73: Int = this.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius);
               val var150: Context = this.getContext();
               kotlin.jvm.internal.r.g(var150, var85);
               var147.add(CreateAttachmentAccessoryKt.createAttachmentAccessory(var131, var1, var70, var6, var73, var150));
            }

            val var121: java.lang.Boolean = var1.getShowInlineForwardButton();
            if (var121 != null) {
               var78 = var121;
            } else {
               var78 = false;
            }

            val var132: MessageState = var1.getState();
            var var122: MessageState = var132;
            if (var132 == null) {
               var122 = MessageState.Unknown;
            }

            val var133: java.lang.Boolean = var1.getGifAutoPlay();
            val var80: Boolean;
            if (var133 != null) {
               var80 = var133;
            } else {
               var80 = false;
            }

            var27.add(new MediaMosaicAttachmentMessageAccessory(var107, var11, var147, var6, var14, var78, var122, var80, var13, null));
         } else {
            var85 = "context";
         }

         var105 = this.accessories;

         for (fh.m var140 : var139) {
            val var134: Attachment = var140.d() as Attachment;
            val var71: Int = var140.c();
            val var141: Context = this.getContext();
            kotlin.jvm.internal.r.g(var141, var85);
            var105.add(CreateAttachmentAccessoryKt.createAttachmentAccessory(var134, var1, var71, var6, var7, var141));
         }

         var78 = var13;
         if (var61) {
            var105 = this.accessories;
            val var124: java.lang.String = var1.getId_3Eiw7ao();
            val var74: Long = var1.getChannelId_o4g7jtM();
            var var86: java.lang.String = var1.getObscureLearnMoreLabel();
            if (var86 == null) {
               var86 = "";
            }

            var105.add(new InfoLinkMessageAccessory(var124, var74, null, null, var86, ReactAsset.Info, null));
            var78 = var13;
         }
      } else {
         var78 = var13;
      }

      val var87: java.util.List = var1.getPostPreviewEmbeds();
      if (var87 != null) {
         val var88: java.util.Iterator = var87.iterator();

         for (int var62 = 0; var88.hasNext(); var62++) {
            val var110: Any = var88.next();
            if (var62 < 0) {
               kotlin.collections.h.s();
            }

            this.accessories
               .add(
                  new PostPreviewEmbedMessageAccessory(
                     var1.getId_3Eiw7ao(),
                     var110 as PostPreviewEmbed,
                     var62,
                     SpoilerAttributes.Companion.forMediaPostPreviewEmbed(var110 as PostPreviewEmbed, var1, var62),
                     null
                  )
               );
         }
      }

      val var90: java.util.List = var1.getEmbeds();
      if (var90 != null) {
         val var125: java.util.Iterator = var90.iterator();

         for (int var63 = 0; var125.hasNext(); var63++) {
            var var91: Embed = (Embed)var125.next();
            if (var63 < 0) {
               kotlin.collections.h.s();
            }

            var91 = var91;
            val var135: ArrayList = this.accessories;
            val var148: java.lang.String = var1.getId_3Eiw7ao();
            var var75: Long = var1.getChannelId_o4g7jtM();
            val var82: Boolean = MessageKt.shouldAutoPlayGifs(var1);
            val var19: Boolean = MessageKt.shouldAnimateEmoji(var1);
            val var81: Boolean = MessageKt.shouldShowLinkDecorations(var1);
            val var83: Boolean = var1.getShouldShowRoleDot();
            val var20: Boolean = var1.getShouldShowRoleOnName();
            val var149: SpoilerAttributes = SpoilerAttributes.Companion.forEmbed(var91, var1, var63);
            val var142: OnLongClickListener = generateMessageAccessories$getLongClickListener(var4, var1, var63, MediaType.Embed);
            val var112: java.lang.Boolean = var1.getShowInlineForwardButton();
            if (var112 != null) {
               var13 = var112;
            } else {
               var13 = false;
            }

            var135.add(
               new EmbedMessageAccessory(var148, var63, var75, var6, var7, var91, var82, var19, var81, var83, var20, var149, var142, var14, var13, var78, null)
            );
            if (var91.getObscureOrNull() != null) {
               val var143: ArrayList = this.accessories;
               val var136: java.lang.String = var1.getId_3Eiw7ao();
               var75 = var1.getChannelId_o4g7jtM();
               val var113: java.lang.String = var91.getId();
               val var72: Boolean;
               if (var113 != null && !kotlin.text.f.x(var113)) {
                  var72 = false;
               } else {
                  var72 = true;
               }

               val var93: java.lang.String;
               if (!var72) {
                  var93 = var91.getId();
               } else {
                  val var94: StringBuilder = new StringBuilder();
                  var94.append("index_");
                  var94.append(var63);
                  var93 = var94.toString();
               }

               var var114: java.lang.String = var1.getObscureLearnMoreLabel();
               if (var114 == null) {
                  var114 = "";
               }

               var143.add(new InfoLinkMessageAccessory(var136, var75, null, var93, var114, ReactAsset.Info, null));
            }
         }
      }

      val var34: java.util.List = var1.getGiftCodes();
      if (var34 != null) {
         val var35: java.util.Iterator = var34.iterator();

         for (int var64 = 0; var35.hasNext(); var64++) {
            val var95: Any = var35.next();
            if (var64 < 0) {
               kotlin.collections.h.s();
            }

            this.accessories.add(new GiftMessageAccessory(var1.getId_3Eiw7ao(), var64, var95 as GiftEmbed, null));
         }
      }

      val var37: GiftEmbed = var1.getReferralTrialOffer();
      if (var37 != null) {
         this.accessories.add(new GiftMessageAccessory(var1.getId_3Eiw7ao(), 0, var37, null));
      }

      val var38: java.util.List = var1.getProgress();
      if (var38 != null) {
         val var39: java.util.Iterator = var38.iterator();

         for (int var65 = 0; var39.hasNext(); var65++) {
            val var97: Any = var39.next();
            if (var65 < 0) {
               kotlin.collections.h.s();
            }

            this.accessories.add(new UploadProgressMessageAccessory(var1.getId_3Eiw7ao(), var65, var97 as UploadProgress, null));
         }
      }

      val var41: ActivityInstanceEmbed = var1.getActivityInstanceEmbed();
      if (var41 != null) {
         this.accessories.add(new ActivityInstanceEmbedMessageAccessory(var1.getId_3Eiw7ao(), var41, var6, null));
      }

      val var42: java.util.List = var1.getCodedLinks();
      if (var42 != null) {
         val var99: java.util.Iterator = var42.iterator();

         for (int var66 = 0; var99.hasNext(); var66++) {
            var var43: Any = var99.next();
            if (var66 < 0) {
               kotlin.collections.h.s();
            }

            var43 = var43 as CodedLinkEmbed;
            if (var43 as CodedLinkEmbed != null) {
               val var115: ArrayList = this.accessories;
               if (var43 is GuildEventInviteEmbedImpl) {
                  var43 = new GuildEventInviteMessageAccessory(
                     var1.getId_3Eiw7ao(),
                     var66,
                     var43 as GuildEventInviteEmbedImpl,
                     MessageKt.shouldAnimateEmoji(var1),
                     MessageKt.shouldShowLinkDecorations(var1),
                     var1.getShouldShowRoleDot(),
                     var1.getShouldShowRoleDot(),
                     null
                  );
               } else if (var43 is GuildInviteDisabledEmbedImpl) {
                  var43 = new GuildInviteDisabledMessageAccessory(var1.getId_3Eiw7ao(), var66, var43 as GuildInviteDisabledEmbedImpl, null);
               } else if (var43 is GuildInviteEmbedImpl) {
                  var43 = new GuildInviteMessageAccessory(var1.getId_3Eiw7ao(), var66, var43 as GuildInviteEmbedImpl, null);
               } else if (var43 is ActivityBookmarkEmbedImpl) {
                  var43 = new ActivityBookmarkMessageAccessory(var1.getId_3Eiw7ao(), var66, var43 as ActivityBookmarkEmbedImpl, var6, null);
               } else {
                  if (var43 !is EmbeddedActivityInviteEmbedImpl) {
                     throw new eh.p();
                  }

                  var43 = new EmbeddedActivityInviteMessageAccessory(var1.getId_3Eiw7ao(), var66, var43 as EmbeddedActivityInviteEmbedImpl, var6, null);
               }

               var115.add(var43);
            }
         }
      }

      val var48: java.util.List = var1.getStickers();
      if (var48 != null) {
         for (Sticker var100 : var48) {
            this.accessories.add(new StickerMessageAccessory(var1.getId_3Eiw7ao(), var100, null));
         }
      }

      if (var1.getComponents() != null) {
         this.accessories.add(new MessageComponentsAccessory(var1.getId_3Eiw7ao(), var1, var1.getComponents(), var6, null));
      }

      val var51: java.util.List = var1.getReactions();
      var var67: Boolean = false;
      if (var51 != null) {
         var67 = false;
         if (var51.isEmpty() xor true) {
            var67 = true;
         }
      }

      if (var67 && !var1.isFirstForumPostMessage() || var3 is MessageFrameMediaViewer) {
         val var126: ArrayList = this.accessories;
         val var116: java.lang.String = var1.getId_3Eiw7ao();
         val var101: java.util.List = var1.getReactions();
         var var52: java.util.List = var101;
         if (var101 == null) {
            var52 = kotlin.collections.h.i();
         }

         var126.add(
            new ReactionsMessageAccessory(
               var116,
               var52,
               var2.getCanAddNewReactions(),
               var2.getUseAddBurstReaction(),
               var2.getAddReactionLabel(),
               var2.getAddNewReactionAccessibilityLabel(),
               var2.getAddNewBurstReactionAccessibilityLabel(),
               var2.getReactionsTheme(),
               null,
               256,
               null
            )
         );
      }

      val var53: ActivityInviteEmbed = var1.getActivityInviteEmbed();
      if (var53 != null) {
         this.accessories.add(new ActivityInviteEmbedMessageAccessory(var1.getId_3Eiw7ao(), var53, null));
      }

      val var54: ThreadEmbed = var1.getThreadEmbed();
      if (var54 != null) {
         this.accessories.add(new ThreadEmbedMessageAccessory(var1.getId_3Eiw7ao(), var54, null));
      }

      val var55: InteractionStatus = var1.getInteractionStatus();
      if (var55 != null) {
         this.accessories.add(new InteractionStatusMessageAccessory(var1.getId_3Eiw7ao(), var55, null));
      }

      val var56: CtaButton = var1.getCtaButton();
      if (var56 != null) {
         this.accessories.add(new CtaButtonMessageAccessory(var1.getChannelId_o4g7jtM(), var1.getId_3Eiw7ao(), var56, null));
      }

      val var57: EphemeralIndication = var1.getEphemeralIndication();
      if (var57 != null) {
         this.accessories.add(new EphemeralIndicationMessageAccessory(var1.getId_3Eiw7ao(), var57, null));
      }

      val var58: SurveyIndication = var1.getSurveyIndication();
      if (var58 != null) {
         this.accessories.add(new SurveyIndicationMessageAccessory(var1.getId_3Eiw7ao(), var58, null));
      }

      if (var1.isFirstForumPostMessage() && var1.getPostActions() != null && var3 !is MessageFrameMediaViewer) {
         this.accessories
            .add(
               new ForumPostActionBar(
                  var1.getId_3Eiw7ao(),
                  var1.getPostActions(),
                  var1.getReactions(),
                  var2.getCanAddNewReactions(),
                  var2.getAddNewReactionAccessibilityLabel(),
                  var2.getReactionsTheme(),
                  null
               )
            );
      }

      val var29: SafetyPolicyNoticeEmbed = var1.getSafetyPolicyNoticeEmbed();
      if (var29 != null) {
         this.accessories.add(new SafetyPolicyNoticeMessageAccessory(var1.getId_3Eiw7ao(), var29, null));
      }

      val var30: SafetySystemNotificationEmbed = var1.getSafetySystemNotificationEmbed();
      if (var30 != null) {
         this.accessories.add(new SafetySystemNotificationMessageAccessory(var1.getId_3Eiw7ao(), var30, null));
      }

      val var31: VoiceInviteEmbed = var1.getVoiceChannelInviteEmbed();
      if (var31 != null) {
         this.accessories.add(new VoiceInviteMessageAccessory(var1.getId_3Eiw7ao(), var31, null));
      }

      val var32: ForwardInfo = var1.getForwardInfo();
      if (var32 != null && var32.getFooterInfo() != null) {
         this.accessories.add(new ForwardBreadcrumbMessageAccessory(var1.getId_3Eiw7ao(), var1.getChannelId_o4g7jtM(), var1.getForwardInfo(), null));
      }

      if (var1.getForwardInfo() != null) {
         kotlin.collections.h.x(this.accessories, new r(<unrepresentable>.INSTANCE));
      }

      return this.accessories;
   }

   @JvmStatic
   fun `generateMessageAccessories$getLongClickListener`(
      var0: (MessageId?, ChannelId?, Int?, MediaType?, java.lang.String?, Int?) -> Unit, var1: Message, var2: Int, var3: MediaType
   ): OnLongClickListener {
      val var4: s;
      if (var0 != null) {
         var4 = new s(var0, var1, var2, var3);
      } else {
         var4 = null;
      }

      return var4;
   }

   @JvmStatic
   fun `generateMessageAccessories$getLongClickListener$lambda$9$lambda$8`(var0: Function6, var1: Message, var2: Int, var3: MediaType, var4: View): Boolean {
      kotlin.jvm.internal.r.h(var1, "$message");
      kotlin.jvm.internal.r.h(var3, "$mediaType");
      var0.invoke(MessageId.box_impl(var1.getId_3Eiw7ao()), ChannelId.box_impl(var1.getChannelId_o4g7jtM()), var2, var3, null, null);
      return true;
   }

   @JvmStatic
   fun `generateMessageAccessories$lambda$34`(var0: Function2, var1: Any, var2: Any): Int {
      kotlin.jvm.internal.r.h(var0, "$tmp0");
      return (var0.invoke(var1, var2) as java.lang.Number).intValue();
   }

   private fun getAccessoryLeftMargin(messageContext: MessageContext, renderContentOnly: Boolean): Int {
      if (var1.getContextType() === MessageContextType.SEARCH) {
         return 0;
      } else {
         val var3: Int;
         if (var2) {
            var3 = this.getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
         } else {
            var3 = this.getResources().getDimensionPixelSize(R.dimen.message_start_guideline);
         }

         return var3 + 0;
      }
   }

   private fun hideHeader() {
      var var1: TextView = this.binding.timestamp;
      kotlin.jvm.internal.r.g(this.binding.timestamp, "binding.timestamp");
      var1.setVisibility(8);
      var1 = this.binding.authorName;
      kotlin.jvm.internal.r.g(this.binding.authorName, "binding.authorName");
      var1.setVisibility(8);
      val var3: SimpleDraweeView = this.binding.authorAvatar;
      kotlin.jvm.internal.r.g(this.binding.authorAvatar, "binding.authorAvatar");
      var3.setVisibility(8);
      val var4: SimpleDraweeView = this.binding.authorAvatarDecoration;
      kotlin.jvm.internal.r.g(this.binding.authorAvatarDecoration, "binding.authorAvatarDecoration");
      var4.setVisibility(8);
      val var5: RoleDotView = this.binding.roleDot;
      kotlin.jvm.internal.r.g(this.binding.roleDot, "binding.roleDot");
      var5.setVisibility(8);
      val var6: ClanTagChipletView = this.binding.clanTagChiplet;
      kotlin.jvm.internal.r.g(this.binding.clanTagChiplet, "binding.clanTagChiplet");
      var6.setVisibility(8);
      val var7: RoleIconView = this.binding.roleIcon;
      kotlin.jvm.internal.r.g(this.binding.roleIcon, "binding.roleIcon");
      var7.setVisibility(8);
      val var8: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
      kotlin.jvm.internal.r.g(this.binding.connectionsRoleTag, "binding.connectionsRoleTag");
      var8.setVisibility(8);
      val var9: MessageTagView = this.binding.messageTagView;
      kotlin.jvm.internal.r.g(this.binding.messageTagView, "binding.messageTagView");
      var9.setVisibility(8);
      val var10: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
      kotlin.jvm.internal.r.g(this.binding.messageAltRemixTagView, "binding.messageAltRemixTagView");
      var10.setVisibility(8);
   }

   @JvmStatic
   fun `setMessage$lambda$2$lambda$1`(var0: Function2, var1: Message, var2: View) {
      kotlin.jvm.internal.r.h(var0, "$onMessageTapped");
      kotlin.jvm.internal.r.h(var1, "$message");
      var0.invoke(MessageId.box_impl(var1.getId_3Eiw7ao()), ChannelId.box_impl(var1.getChannelId_o4g7jtM()));
   }

   @JvmStatic
   fun `setMessage$lambda$4$lambda$3`(var0: Function6, var1: Message, var2: View): Boolean {
      kotlin.jvm.internal.r.h(var0, "$it");
      kotlin.jvm.internal.r.h(var1, "$message");
      var0.invoke(MessageId.box_impl(var1.getId_3Eiw7ao()), ChannelId.box_impl(var1.getChannelId_o4g7jtM()), null, null, null, null);
      return true;
   }

   public open fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
      kotlin.jvm.internal.r.h(var1, "ev");
      return this.allowChildGestures xor true;
   }

   public override fun onSwipeEnd() {
      this.setClipChildren(true);
      this.setClipToPadding(true);
      this.getShadowView().setVisibility(4);
   }

   public override fun onSwipeStart() {
      this.setClipChildren(false);
      this.setClipToPadding(false);
      this.getShadowView().setVisibility(0);
   }

   public fun setAccessoriesRecycledViewPool(recycledViewPool: RecycledViewPool) {
      kotlin.jvm.internal.r.h(var1, "recycledViewPool");
      this.binding.accessoriesView.setRecycledViewPool(var1);
   }

   public fun setMessage(
      message: Message,
      messageContext: MessageContext,
      messageFrame: MessageFrame? = null,
      eventHandler: ChatEventHandler = ChatEventHandler.Empty.INSTANCE,
      componentProvider: ComponentProvider? = null,
      onChainPart: () -> com.discord.chat.presentation.message.MessageView.ChainPart = <unrepresentable>.INSTANCE,
      allowChildGestures: Boolean = true,
      isHighlight: Boolean = false,
      renderContentOnly: Boolean = false
   ) {
      kotlin.jvm.internal.r.h(var1, "message");
      kotlin.jvm.internal.r.h(var2, "messageContext");
      kotlin.jvm.internal.r.h(var4, "eventHandler");
      kotlin.jvm.internal.r.h(var6, "onChainPart");
      var var15: java.lang.String = this.messageId;
      val var16: java.lang.String = var1.getId_3Eiw7ao();
      val var13: Boolean;
      if (var15 == null) {
         var13 = false;
      } else {
         var13 = MessageId.equals_impl0(var15, var16);
      }

      this.messageId = var1.getId_3Eiw7ao();
      if (var13 xor true && var2.getContextType() === MessageContextType.SEARCH) {
         this.binding.accessoriesView.clear();
      }

      this.onChainPart = var6;
      this.setOnInitiateReply(new Function0<Unit>(var4, var1) {
         final ChatEventHandler $eventHandler;
         final Message $message;

         {
            super(0);
            this.$eventHandler = var1;
            this.$message = var2;
         }

         public final void invoke() {
            this.$eventHandler.onInitiateReply_pfaIj0E(this.$message.getId_3Eiw7ao(), this.$message.getChannelId_o4g7jtM());
         }
      });
      this.setOnInitiateEdit(new Function0<Unit>(var4, var1) {
         final ChatEventHandler $eventHandler;
         final Message $message;

         {
            super(0);
            this.$eventHandler = var1;
            this.$message = var2;
         }

         public final void invoke() {
            this.$eventHandler.onInitiateEdit_pfaIj0E(this.$message.getId_3Eiw7ao(), this.$message.getChannelId_o4g7jtM());
         }
      });
      this.setEnableSwipeToReply(var2.getEnableSwipeToReply());
      this.setEnableSwipeToEdit(var2.getEnableSwipeToEdit());
      this.setUsingGradientTheme(var2.getUsingGradientTheme());
      this.allowChildGestures = var7;
      val var33: MessageView.ChainPart = var6.invoke() as MessageView.ChainPart;
      val var21: Int = var1.getTimestampColor();
      if (var21 != null) {
         this.binding.timestamp.setTextColor(var21.intValue());
      }

      this.binding.accessoriesView.updateLeftMargin(this.getAccessoryLeftMargin(var2, var9));
      var var30: Byte = 8;
      if (var3 != null && var3 !is UnknownMessageFrame) {
         val var23: MessageFrameHeaderView = this.binding.messageFrameHeader;
         kotlin.jvm.internal.r.g(this.binding.messageFrameHeader, "binding.messageFrameHeader");
         var23.setVisibility(0);
         this.binding.messageFrameHeader.configure(var3);
      } else {
         val var22: MessageFrameHeaderView = this.binding.messageFrameHeader;
         kotlin.jvm.internal.r.g(this.binding.messageFrameHeader, "binding.messageFrameHeader");
         var22.setVisibility(8);
      }

      if (var2.getContextType() === MessageContextType.SEARCH) {
         this.hideHeader();
      } else {
         this.configureAuthor(var1, var4, var33);
      }

      this.configureDivider(var2.getShowDivider());
      var15 = var1.getThreadStarterMessageHeader();
      if (var15 != null) {
         val var24: ThreadStarterMessageHeaderView = this.getThreadStarterMessageHeaderView();
         if (var1.getReferencedMessage() != null) {
            var7 = true;
         } else {
            var7 = false;
         }

         var24.configure(var15, var7);
      } else {
         this.getThreadStarterMessageHeaderView().setVisibility(8);
      }

      val var25: MessageHighlightHeader = this.getMessageHighlightHeader();
      if (var8) {
         var30 = 0;
      }

      var25.setVisibility(var30);
      if (var1.getReferencedMessage() != null) {
         MessageViewReplyPreview.configureReply$default(this.getReplyPreview(), var1.getReferencedMessage(), false, new Function0<Unit>(var4, var1) {
            final ChatEventHandler $eventHandler;
            final Message $message;

            {
               super(0);
               this.$eventHandler = var1;
               this.$message = var2;
            }

            public final void invoke() {
               this.$eventHandler.onTapMessageReply_0eiqbug(this.$message.getChannelId_o4g7jtM(), this.$message.getId_3Eiw7ao());
            }
         }, 2, null);
      } else if (var1.getExecutedCommand() != null) {
         this.getReplyPreview()
            .configureExecutedCommand_dB0_bEw(
               var1.getId_3Eiw7ao(),
               var1.getExecutedCommand(),
               MessageKt.shouldAnimateEmoji(var1),
               MessageKt.shouldShowLinkDecorations(var1),
               var1.getShouldShowRoleDot(),
               var1.getShouldShowRoleOnName(),
               var4
            );
      } else {
         this.getReplyPreview().clear();
      }

      val var26: Function2 = var4.getOnMessageTapped();
      var var32: n = null;
      val var27: m;
      if (var26 != null) {
         var27 = new m(var26, var1);
      } else {
         var27 = null;
      }

      val var17: Function6 = var4.getOnMessageLongPressed();
      if (var17 != null) {
         var32 = new n(var17, var1);
      }

      NestedScrollOnTouchUtilsKt.setOnClickListenerNested(this, true, var27);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested(this, true, var32);
      val var20: java.util.List = this.generateMessageAccessories(var1, var2, var3, var4.getOnMessageLongPressed());
      val var19: MessageAccessoriesView = this.binding.accessoriesView;
      val var18: java.lang.String = var1.getId_3Eiw7ao();
      val var11: Long = var1.getChannelId_o4g7jtM();
      val var34: GuildId = var1.getGuildId_qOKuAAo();
      var7 = false;
      if (var1.getForwardInfo() != null) {
         var7 = true;
      }

      var19.setAccessories_MNg_vQI(var18, var11, var34, var20, var4, var5, var7);
      this.configureAccessoriesMargin(var20);
      this.configureCommunicationDisabled(kotlin.jvm.internal.r.c(var1.getCommunicationDisabled(), java.lang.Boolean.TRUE), var33);
      this.configureSuppressNotifications(MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.SUPPRESS_NOTIFICATIONS), var4, var33);
      this.configureAccessibilityDelegate(var1, this.accessories, var27, var32);
   }

   public open fun setPressed(pressed: Boolean) {
      if (!var1 || !this.isClickable() && !this.isFocusable()) {
         var1 = false;
      } else {
         var1 = true;
      }

      super.setPressed(var1);
   }

   public open fun spacingPxOverride(): Int {
      var var1: Int = MessageView.WhenMappings.$EnumSwitchMapping$1[(this.onChainPart.invoke() as MessageView.ChainPart).ordinal()];
      if (var1 != 1 && var1 != 2) {
         if (var1 != 3 && var1 != 4) {
            throw new eh.p();
         }

         var1 = 0;
      } else {
         var1 = SizeUtilsKt.getDpToPx(16);
      }

      return var1;
   }

   public enum class ChainPart {
      END,
      MIDDLE,
      ONLY,
      START      @JvmStatic
      private MessageView.ChainPart[] $VALUES = $values();
   }

   // $VF: Class flags could not be determined
   internal class WhenMappings {
      @JvmStatic
      public int[] $EnumSwitchMapping$0;
      @JvmStatic
      public int[] $EnumSwitchMapping$1;

      @JvmStatic
      fun {
         var var0: IntArray = new int[MessageState.values().length];

         try {
            var0[MessageState.SendFailed.ordinal()] = 1;
         } catch (var7: NoSuchFieldError) {
         }

         try {
            var0[MessageState.Sending.ordinal()] = 2;
         } catch (var6: NoSuchFieldError) {
         }

         $EnumSwitchMapping$0 = var0;
         var0 = new int[MessageView.ChainPart.values().length];

         try {
            var0[MessageView.ChainPart.END.ordinal()] = 1;
         } catch (var5: NoSuchFieldError) {
         }

         try {
            var0[MessageView.ChainPart.ONLY.ordinal()] = 2;
         } catch (var4: NoSuchFieldError) {
         }

         try {
            var0[MessageView.ChainPart.START.ordinal()] = 3;
         } catch (var3: NoSuchFieldError) {
         }

         try {
            var0[MessageView.ChainPart.MIDDLE.ordinal()] = 4;
         } catch (var2: NoSuchFieldError) {
         }

         $EnumSwitchMapping$1 = var0;
      }
   }
}
