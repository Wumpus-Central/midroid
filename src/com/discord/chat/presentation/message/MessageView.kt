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
import androidx.core.view.r0
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
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import java.util.ArrayList
import kotlin.enums.EnumEntries
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function6

public class MessageView  public constructor(context: Context, attrs: AttributeSet? = null)
   : ChatListRelativeLayout,
   VerticalSpacingItemDecoration.SpacingProviderView,
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


   public open var shadowView: MaskedShadowView
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
         kotlin.jvm.internal.q.g(this.binding.authorAvatar, "authorAvatar");
         return var1;
      }


   fun MessageView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var5: MessageViewBinding = MessageViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var5, "inflate(...)");
      this.binding = var5;
      this.replyPreview$delegate = kh.l.b(new Function0(this) {
         final MessageView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final MessageViewReplyPreview invoke() {
            val var1: View = MessageView.access$getBinding$p(this.this$0).replyPreviewView.inflate();
            kotlin.jvm.internal.q.f(var1, "null cannot be cast to non-null type com.discord.chat.presentation.message.MessageViewReplyPreview");
            return var1 as MessageViewReplyPreview;
         }
      });
      this.threadStarterMessageHeaderView$delegate = kh.l.b(new Function0(this) {
         final MessageView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final ThreadStarterMessageHeaderView invoke() {
            val var1: View = MessageView.access$getBinding$p(this.this$0).threadStarterHeaderView.inflate();
            kotlin.jvm.internal.q.f(var1, "null cannot be cast to non-null type com.discord.chat.presentation.message.ThreadStarterMessageHeaderView");
            return var1 as ThreadStarterMessageHeaderView;
         }
      });
      this.messageHighlightHeader$delegate = kh.l.b(new Function0(this) {
         final MessageView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final MessageHighlightHeader invoke() {
            val var1: View = MessageView.access$getBinding$p(this.this$0).highlightHeaderView.inflate();
            kotlin.jvm.internal.q.f(var1, "null cannot be cast to non-null type com.discord.chat.presentation.message.MessageHighlightHeader");
            return var1 as MessageHighlightHeader;
         }
      });
      this.setPadding(0, SizeUtilsKt.getDpToPx(2), 0, SizeUtilsKt.getDpToPx(2));
      RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
      var var3: TextView = var5.timestamp;
      kotlin.jvm.internal.q.g(var5.timestamp, "timestamp");
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryMedium);
      var5.timestamp.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      var3 = var5.timestamp;
      kotlin.jvm.internal.q.g(var5.timestamp, "timestamp");
      SetTextSizeSpKt.setTextSizeSp(var3, 12.0F, 15.0F);
      var3 = var5.authorName;
      kotlin.jvm.internal.q.g(var5.authorName, "authorName");
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimarySemibold);
      var3 = var5.authorName;
      kotlin.jvm.internal.q.g(var5.authorName, "authorName");
      SetTextSizeSpKt.setTextSizeSp(var3, 16.0F, 20.0F);
      val var9: SimpleDraweeView = var5.authorAvatar;
      kotlin.jvm.internal.q.g(var5.authorAvatar, "authorAvatar");
      ViewClippingUtilsKt.clipToCircle(var9);
      var5.messageHeaderDivider.setBackgroundColor(ColorUtilsKt.getThemeColor(var1, R.color.message_divider_light, R.color.message_divider_dark));
      val var4: MaskedShadowView = var5.shadowView;
      kotlin.jvm.internal.q.g(var5.shadowView, "shadowView");
      this.setShadowView(var4);
      this.getShadowView().setVisibility(4);
      this.setClipToPadding(false);
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
      if (var2 !is java.util.Collection || !var2.isEmpty()) {
         val var5: java.util.Iterator = var2.iterator();

         while (var5.hasNext()) {
            if (var5.next() as MessageAccessory is MessageContentAccessory) {
               this.binding.accessoriesView.setOnCurrentContentViewChanged(new Function1(this, var1, var3, var4) {
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
                     kotlin.jvm.internal.q.h(var1, "it");
                     r0.q0(this.this$0, new MessageViewAccessibilityDelegate(this.$message, var1, this.$onClick, this.$messageLongPress));
                  }
               });
               return;
            }
         }
      }

      r0.q0(this, new MessageViewAccessibilityDelegate(var1, null, var3, var4));
   }

   private fun configureAccessoriesMargin(items: List<MessageAccessory>) {
      val var7: Boolean = kotlin.collections.i.g0(var1) is MessageContentAccessory;
      val var11: Boolean;
      if (var1.size() <= 1 && var7) {
         var11 = false;
      } else {
         var11 = true;
      }

      val var8: MessageView.ChainPart = this.onChainPart.invoke() as MessageView.ChainPart;
      var var3: Boolean = true;
      if (var8 != MessageView.ChainPart.MIDDLE) {
         if (var8 === MessageView.ChainPart.START) {
            var3 = true;
         } else {
            var3 = false;
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
         if (var3) {
            var5 = SizeUtilsKt.getDpToPx(4);
         }
      }

      val var9: LayoutParams = this.binding.accessoriesView.getLayoutParams();
      kotlin.jvm.internal.q.f(var9, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
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
         kotlin.jvm.internal.q.e(var9);
         this.configureAuthorClickListeners(var9, var1, var2);
         val var10: RoleDotView = this.binding.roleDot;
         kotlin.jvm.internal.q.g(this.binding.roleDot, "roleDot");
         this.configureAuthorClickListeners(var10, var1, var2);
         this.binding.timestamp.setText(var1.getTimestamp());
         val var4: SimpleDraweeView = this.binding.authorAvatar;
         val var11: Context = this.binding.authorAvatar.getContext();
         kotlin.jvm.internal.q.g(var11, "getContext(...)");
         var4.setImageURI(MessageKt.avatarUrl(var1, var11));
         kotlin.jvm.internal.q.e(var4);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var4, false, new q(var1, var2), 1, null);
         NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var4, false, new r(var1, var2), 1, null);
         if (var1.getAvatarDecorationURL() != null) {
            val var12: SimpleDraweeView = this.binding.authorAvatarDecoration;
            kotlin.jvm.internal.q.g(this.binding.authorAvatarDecoration, "authorAvatarDecoration");
            var12.setVisibility(0);
            this.binding.authorAvatarDecoration.setImageURI(var1.getAvatarDecorationURL());
         } else {
            val var13: SimpleDraweeView = this.binding.authorAvatarDecoration;
            kotlin.jvm.internal.q.g(this.binding.authorAvatarDecoration, "authorAvatarDecoration");
            var13.setVisibility(8);
            this.binding.authorAvatarDecoration.setImageURI(null);
         }

         val var14: TextView = this.binding.timestamp;
         kotlin.jvm.internal.q.g(this.binding.timestamp, "timestamp");
         var14.setVisibility(0);
         val var15: TextView = this.binding.authorName;
         kotlin.jvm.internal.q.g(this.binding.authorName, "authorName");
         var15.setVisibility(0);
         val var16: SimpleDraweeView = this.binding.authorAvatar;
         kotlin.jvm.internal.q.g(this.binding.authorAvatar, "authorAvatar");
         var16.setVisibility(0);
         if (var1.getShouldShowRoleDot()) {
            val var17: RoleDotView = this.binding.roleDot;
            kotlin.jvm.internal.q.g(this.binding.roleDot, "roleDot");
            var17.setVisibility(0);
            val var18: RoleDotView = this.binding.roleDot;
            kotlin.jvm.internal.q.g(this.binding.roleDot, "roleDot");
            RoleDotView.configure$default(var18, MessageKt.roleDotColor$default(var1, 0, 1, null), 0, 2, null);
         } else {
            val var19: RoleDotView = this.binding.roleDot;
            kotlin.jvm.internal.q.g(this.binding.roleDot, "roleDot");
            var19.setVisibility(8);
         }

         if (var1.getClanTag() != null && var1.getClanTagGuildId-qOKuAAo() != null) {
            val var21: ClanTagChipletView = this.binding.clanTagChiplet;
            kotlin.jvm.internal.q.g(this.binding.clanTagChiplet, "clanTagChiplet");
            ClanTagChipletView.configure-D0ylKIU$default(
               var21, var1.getClanTag(), var1.getClanBadgeUrl(), var1.getClanTagGuildId-qOKuAAo().unbox-impl(), var2, 0.0F, 16, null
            );
            val var22: ClanTagChipletView = this.binding.clanTagChiplet;
            kotlin.jvm.internal.q.g(this.binding.clanTagChiplet, "clanTagChiplet");
            var22.setVisibility(0);
         } else {
            val var20: ClanTagChipletView = this.binding.clanTagChiplet;
            kotlin.jvm.internal.q.g(this.binding.clanTagChiplet, "clanTagChiplet");
            var20.setVisibility(8);
         }

         if (var1.getRoleIcon() != null) {
            this.binding.roleIcon.configureRoleIcon(var1.getRoleIcon(), var2);
            val var23: RoleIconView = this.binding.roleIcon;
            kotlin.jvm.internal.q.g(this.binding.roleIcon, "roleIcon");
            var23.setVisibility(0);
         } else {
            val var24: RoleIconView = this.binding.roleIcon;
            kotlin.jvm.internal.q.g(this.binding.roleIcon, "roleIcon");
            var24.setVisibility(8);
         }

         if (var1.getGameApplicationId() != null && var1.getTimestamp() != null) {
            this.binding.gameIcon.configureGameIcon(var1.getGameApplicationId(), var1.getTimestamp(), var2);
            val var26: GameIconView = this.binding.gameIcon;
            kotlin.jvm.internal.q.g(this.binding.gameIcon, "gameIcon");
            var26.setVisibility(0);
         } else {
            val var25: GameIconView = this.binding.gameIcon;
            kotlin.jvm.internal.q.g(this.binding.gameIcon, "gameIcon");
            var25.setVisibility(8);
         }

         if (var1.getConnectionsRoleTag() != null) {
            this.binding
               .connectionsRoleTag
               .configureConnectionsRoleTag-uESh2Cg(
                  var1.getAuthorId-wUX8bhU(), var1.getGuildId-qOKuAAo(), ChannelId.box-impl(var1.getChannelId-o4g7jtM()), var1.getConnectionsRoleTag(), var2
               );
            val var27: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
            kotlin.jvm.internal.q.g(this.binding.connectionsRoleTag, "connectionsRoleTag");
            var27.setVisibility(0);
         } else {
            val var28: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
            kotlin.jvm.internal.q.g(this.binding.connectionsRoleTag, "connectionsRoleTag");
            var28.setVisibility(8);
         }

         if (var1.getTagText() == null && var1.getOpTagText() == null) {
            val var7: MessageTagView = this.binding.messageTagView;
            kotlin.jvm.internal.q.g(this.binding.messageTagView, "messageTagView");
            var7.setVisibility(8);
            val var8: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
            kotlin.jvm.internal.q.g(this.binding.messageAltRemixTagView, "messageAltRemixTagView");
            var8.setVisibility(8);
         } else if (var1.getTagType() != null && kotlin.jvm.internal.q.c(var1.getTagType(), "f")) {
            val var30: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
            kotlin.jvm.internal.q.g(this.binding.messageAltRemixTagView, "messageAltRemixTagView");
            var30.setVisibility(0);
            this.binding
               .messageAltRemixTagView
               .configureTagView-e2j04IU(
                  var1.getTagText(),
                  var1.getTagTextColor(),
                  var1.getTagBackgroundColor(),
                  var2,
                  var1.getId-3Eiw7ao(),
                  var1.getChannelId-o4g7jtM(),
                  var1.getTagType()
               );
            val var6: MessageTagView = this.binding.messageTagView;
            kotlin.jvm.internal.q.g(this.binding.messageTagView, "messageTagView");
            var6.setVisibility(8);
         } else {
            val var29: MessageTagView = this.binding.messageTagView;
            kotlin.jvm.internal.q.g(this.binding.messageTagView, "messageTagView");
            var29.setVisibility(0);
            this.binding
               .messageTagView
               .configureTagView-Ul7AT2Q(
                  var1.getTagText(),
                  var1.getTagVerified(),
                  var1.getTagTextColor(),
                  var1.getTagBackgroundColor(),
                  var1.getOpTagText(),
                  var2,
                  var1.getId-3Eiw7ao(),
                  var1.getChannelId-o4g7jtM(),
                  var1.getTagType(),
                  var1.getTagIconUrl()
               );
            val var5: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
            kotlin.jvm.internal.q.g(this.binding.messageAltRemixTagView, "messageAltRemixTagView");
            var5.setVisibility(8);
         }
      }
   }

   @JvmStatic
   fun `configureAuthor$lambda$38$lambda$36`(var0: Message, var1: ChatEventHandler, var2: View) {
      kotlin.jvm.internal.q.h(var0, "$message");
      kotlin.jvm.internal.q.h(var1, "$eventHandler");
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onTapAvatar-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }
   }

   @JvmStatic
   fun `configureAuthor$lambda$38$lambda$37`(var0: Message, var1: ChatEventHandler, var2: View): Boolean {
      kotlin.jvm.internal.q.h(var0, "$message");
      kotlin.jvm.internal.q.h(var1, "$eventHandler");
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onLongPressAvatar-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }

      return true;
   }

   private fun View.configureAuthorClickListeners(message: Message, eventHandler: ChatEventHandler) {
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var1, false, new u(var2, var3), 1, null);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var1, false, new v(var2, var3), 1, null);
   }

   @JvmStatic
   fun `configureAuthorClickListeners$lambda$6`(var0: Message, var1: ChatEventHandler, var2: View) {
      kotlin.jvm.internal.q.h(var0, "$message");
      kotlin.jvm.internal.q.h(var1, "$eventHandler");
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onTapUsername-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }
   }

   @JvmStatic
   fun `configureAuthorClickListeners$lambda$7`(var0: Message, var1: ChatEventHandler, var2: View): Boolean {
      kotlin.jvm.internal.q.h(var0, "$message");
      kotlin.jvm.internal.q.h(var1, "$eventHandler");
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onLongPressUsername-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
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
      kotlin.jvm.internal.q.g(this.binding.guildCommunicationDisabledIcon, "guildCommunicationDisabledIcon");
      if (!var5) {
         var6 = 8;
      }

      var7.setVisibility(var6);
      val var8: SimpleDraweeView = this.binding.guildCommunicationDisabledIcon;
      kotlin.jvm.internal.q.g(this.binding.guildCommunicationDisabledIcon, "guildCommunicationDisabledIcon");
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

      this.binding.gameIcon.setAlpha(var3);
      if (var5) {
         var3 = 0.5F;
      } else {
         var3 = 1.0F;
      }

      this.binding.authorAvatarDecoration.setAlpha(var3);
      var3 = 1.0F;
      if (var5) {
         var3 = 0.5F;
      }

      this.binding.suppressNotificationsIcon.setAlpha(var3);
   }

   private fun configureDivider(showDivider: Boolean) {
      val var3: View = this.binding.messageHeaderDivider;
      kotlin.jvm.internal.q.g(this.binding.messageHeaderDivider, "messageHeaderDivider");
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
      kotlin.jvm.internal.q.g(this.binding.suppressNotificationsIcon, "suppressNotificationsIcon");
      val var5: Byte;
      if (var4) {
         var5 = 0;
      } else {
         var5 = 8;
      }

      var6.setVisibility(var5);
      if (var4) {
         val var7: SimpleDraweeView = this.binding.suppressNotificationsIcon;
         kotlin.jvm.internal.q.g(this.binding.suppressNotificationsIcon, "suppressNotificationsIcon");
         ReactAssetUtilsKt.setReactAsset(var7, ReactAsset.BellSnooze);
         val var8: SimpleDraweeView = this.binding.suppressNotificationsIcon;
         kotlin.jvm.internal.q.g(this.binding.suppressNotificationsIcon, "suppressNotificationsIcon");
         ColorUtilsKt.setTintColor(var8, ThemeManagerKt.getTheme().getInteractiveNormal());
      }

      val var9: SimpleDraweeView = this.binding.suppressNotificationsIcon;
      kotlin.jvm.internal.q.g(this.binding.suppressNotificationsIcon, "suppressNotificationsIcon");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var9, false, new p(var2), 1, null);
   }

   @JvmStatic
   fun `configureSuppressNotifications$lambda$39`(var0: ChatEventHandler, var1: View) {
      kotlin.jvm.internal.q.h(var0, "$eventHandler");
      var0.onTapSuppressNotificationsIcon();
   }

   private fun generateMessageAccessories(
      message: Message,
      messageContext: MessageContext,
      messageFrame: MessageFrame?,
      onLongClick: ((MessageId, ChannelId, Int?, MediaType?, String?, Int?) -> Unit)?
   ): List<MessageAccessory> {
      this.accessories.clear();
      val var12: Boolean;
      if (var1.getForwardInfo() != null) {
         var12 = true;
      } else {
         var12 = false;
      }

      var var11: Boolean;
      if (var1.getForwardInfo() != null && var1.getForwardInfo().getUseOldIcon()) {
         var11 = true;
      } else {
         var11 = false;
      }

      if (var12) {
         this.accessories.add(new ForwardHeaderMessageAccessory(var1.getId-3Eiw7ao(), var11, null));
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

      var var22: StructurableText = var1.getContent();
      var var80: java.lang.String = "getContext(...)";
      if (var22 != null && var22.getHasContent() && var1.getType() != MessageType.CUSTOM_GIFT) {
         val var97: ArrayList = this.accessories;
         val var23: java.lang.String = var1.getId-3Eiw7ao();
         val var24: StructurableText = var1.getContent();
         val var15: Boolean = MessageKt.shouldAnimateEmoji(var1);
         val var14: Boolean = MessageKt.shouldShowLinkDecorations(var1);
         val var16: Boolean = var1.getShouldShowRoleDot();
         val var13: Boolean = var1.getShouldShowRoleOnName();
         val var9: Int = this.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing);
         val var25: Int = var1.getLinkColor();
         val var8: Int;
         if (var25 != null) {
            var8 = var25;
         } else {
            var8 = ThemeManagerKt.getTheme().getTextLink();
         }

         val var133: DiscordFont = DiscordFont.PrimaryMedium;
         val var26: Context = this.getContext();
         kotlin.jvm.internal.q.g(var26, "getContext(...)");
         val var10: Int = MessageUtilsKt.getChatTextSizeSp(var26);
         val var140: MessageState = var1.getState();
         var var5: Int;
         if (var140 == null) {
            var5 = -1;
         } else {
            var5 = MessageView.WhenMappings.$EnumSwitchMapping$0[var140.ordinal()];
         }

         if (var5 != 1 && var5 != 2) {
            val var141: Int = var1.getTextColor();
            if (var141 != null) {
               var5 = var141;
            } else {
               var5 = ThemeManagerKt.getTheme().getTextNormal();
            }
         } else {
            var5 = ThemeManagerKt.getTheme().getTextMuted();
         }

         var97.add(
            new MessageContentAccessory(
               var23,
               var24,
               var15,
               var14,
               var16,
               var13,
               var9,
               var8,
               var5,
               var133,
               var10,
               false,
               var6,
               var1.getEdited(),
               var1.getEditedColor(),
               var12,
               var2.getTruncation(),
               null,
               131072,
               null
            )
         );
      }

      if (var1.getPollData() != null && var1.getPollData().getLayoutType() != PollLayoutType.UNKNOWN) {
         val var123: ArrayList = this.accessories;
         val var98: PollMessageAccessory.Companion = PollMessageAccessory.Companion;
         val var113: Context = this.getContext();
         kotlin.jvm.internal.q.g(var113, "getContext(...)");
         var123.add(var98.create(var113, var1, var1.getPollData()));
      }

      var var71: Boolean;
      if (var1.getAttachments() != null && var1.getPollData() == null && !MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.IS_UIKIT_COMPONENTS)) {
         var var60: Boolean;
         label429: {
            val var99: java.util.List = var1.getAttachments();
            if (var99 !is java.util.Collection || !var99.isEmpty()) {
               val var100: java.util.Iterator = var99.iterator();

               while (var100.hasNext()) {
                  if (kotlin.jvm.internal.q.c((var100.next() as Attachment).getObscure(), java.lang.Boolean.TRUE)) {
                     var60 = true;
                     break label429;
                  }
               }
            }

            var60 = false;
         }

         val var124: java.lang.Iterable = kotlin.collections.i.X0(var1.getAttachments());
         val var101: ArrayList = new ArrayList();
         val var114: ArrayList = new ArrayList();

         for (Object var142 : var124) {
            if (((var142 as lh.l).d() as Attachment).type() != AttachmentType.Image && ((var142 as lh.l).d() as Attachment).type() != AttachmentType.Video) {
               var114.add(var142);
            } else {
               var101.add(var142);
            }
         }

         val var102: Pair = new Pair(var101, var114);
         val var126: java.util.List = var102.a() as java.util.List;
         val var135: java.util.List = var102.b() as java.util.List;
         if (var126.isEmpty() xor true && var2.getUseAttachmentGridLayout()) {
            label351: {
               if (kotlin.jvm.internal.q.c(var1.isCurrentUserMessageAuthor(), java.lang.Boolean.TRUE)) {
                  val var115: java.lang.String = var1.getNonce-N_6c4I0();
                  var103 = var115;
                  if (var115 != null) {
                     break label351;
                  }
               }

               var103 = var1.getId-3Eiw7ao();
            }

            val var27: ArrayList = this.accessories;
            val var19: Long = var1.getChannelId-o4g7jtM();
            val var143: ArrayList = new ArrayList(kotlin.collections.i.v(var126, 10));

            for (lh.l var28 : var126) {
               val var127: Attachment = var28.d() as Attachment;
               val var67: Int = var28.c();
               val var69: Int = this.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius);
               val var146: Context = this.getContext();
               kotlin.jvm.internal.q.g(var146, var80);
               var143.add(CreateAttachmentAccessoryKt.createAttachmentAccessory(var127, var1, var67, var6, var69, var146));
            }

            val var117: java.lang.Boolean = var1.getShowInlineForwardButton();
            if (var117 != null) {
               var71 = var117;
            } else {
               var71 = false;
            }

            val var128: MessageState = var1.getState();
            var var118: MessageState = var128;
            if (var128 == null) {
               var118 = MessageState.Unknown;
            }

            val var129: java.lang.Boolean = var1.getGifAutoPlay();
            val var73: Boolean;
            if (var129 != null) {
               var73 = var129;
            } else {
               var73 = false;
            }

            var27.add(new MediaMosaicAttachmentMessageAccessory(var103, var19, var143, var6, var12, var71, var118, var73, var11, null));
         } else {
            var80 = "getContext(...)";
         }

         val var104: ArrayList = this.accessories;

         for (lh.l var136 : var135) {
            val var130: Attachment = var136.d() as Attachment;
            val var68: Int = var136.c();
            val var137: Context = this.getContext();
            kotlin.jvm.internal.q.g(var137, var80);
            var104.add(CreateAttachmentAccessoryKt.createAttachmentAccessory(var130, var1, var68, var6, var7, var137));
         }

         var71 = var11;
         if (var60) {
            val var105: ArrayList = this.accessories;
            val var120: java.lang.String = var1.getId-3Eiw7ao();
            val var77: Long = var1.getChannelId-o4g7jtM();
            var var81: java.lang.String = var1.getObscureLearnMoreLabel();
            if (var81 == null) {
               var81 = "";
            }

            var105.add(new InfoLinkMessageAccessory(var120, var77, null, null, var81, ReactAsset.Info, null));
            var71 = var11;
         }
      } else {
         var71 = var11;
      }

      val var82: java.util.List = var1.getPostPreviewEmbeds();
      if (var82 != null) {
         val var83: java.util.Iterator = var82.iterator();

         for (int var61 = 0; var83.hasNext(); var61++) {
            var22 = (StructurableText)var83.next();
            if (var61 < 0) {
               kotlin.collections.i.u();
            }

            this.accessories
               .add(
                  new PostPreviewEmbedMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var22 as PostPreviewEmbed,
                     var61,
                     SpoilerAttributes.Companion.forMediaPostPreviewEmbed(var22 as PostPreviewEmbed, var1, var61),
                     null
                  )
               );
         }
      }

      val var85: java.util.List = var1.getEmbeds();
      if (var85 != null) {
         val var121: java.util.Iterator = var85.iterator();

         for (int var62 = 0; var121.hasNext(); var62++) {
            var var86: Embed = (Embed)var121.next();
            if (var62 < 0) {
               kotlin.collections.i.u();
            }

            var86 = var86;
            val var131: ArrayList = this.accessories;
            val var145: java.lang.String = var1.getId-3Eiw7ao();
            var var78: Long = var1.getChannelId-o4g7jtM();
            val var74: Boolean = MessageKt.shouldAutoPlayGifs(var1);
            val var75: Boolean = MessageKt.shouldAnimateEmoji(var1);
            val var18: Boolean = MessageKt.shouldShowLinkDecorations(var1);
            val var76: Boolean = var1.getShouldShowRoleDot();
            val var17: Boolean = var1.getShouldShowRoleOnName();
            val var144: SpoilerAttributes = SpoilerAttributes.Companion.forEmbed(var86, var1, var62);
            val var108: OnLongClickListener = generateMessageAccessories$getLongClickListener(var4, var1, var62, MediaType.Embed);
            val var138: java.lang.Boolean = var1.getShowInlineForwardButton();
            if (var138 != null) {
               var11 = var138;
            } else {
               var11 = false;
            }

            var131.add(
               new EmbedMessageAccessory(var145, var62, var78, var6, var7, var86, var74, var75, var18, var76, var17, var144, var108, var12, var11, var71, null)
            );
            if (var86.getObscureOrNull() != null) {
               val var139: ArrayList = this.accessories;
               val var132: java.lang.String = var1.getId-3Eiw7ao();
               var78 = var1.getChannelId-o4g7jtM();
               val var109: java.lang.String = var86.getId();
               val var89: java.lang.String;
               if (var109 != null && !kotlin.text.h.x(var109)) {
                  var89 = var86.getId();
               } else {
                  val var88: StringBuilder = new StringBuilder();
                  var88.append("index_");
                  var88.append(var62);
                  var89 = var88.toString();
               }

               var var110: java.lang.String = var1.getObscureLearnMoreLabel();
               if (var110 == null) {
                  var110 = "";
               }

               var139.add(new InfoLinkMessageAccessory(var132, var78, null, var89, var110, ReactAsset.Info, null));
            }
         }
      }

      val var34: java.util.List = var1.getGiftCodes();
      if (var34 != null) {
         val var35: java.util.Iterator = var34.iterator();

         for (int var63 = 0; var35.hasNext(); var63++) {
            val var90: Any = var35.next();
            if (var63 < 0) {
               kotlin.collections.i.u();
            }

            this.accessories.add(new GiftMessageAccessory(var1.getId-3Eiw7ao(), var63, var90 as GiftEmbed, null));
         }
      }

      val var37: GiftEmbed = var1.getReferralTrialOffer();
      if (var37 != null) {
         this.accessories.add(new GiftMessageAccessory(var1.getId-3Eiw7ao(), 0, var37, null));
      }

      val var38: java.util.List = var1.getProgress();
      if (var38 != null) {
         val var39: java.util.Iterator = var38.iterator();

         for (int var64 = 0; var39.hasNext(); var64++) {
            val var92: Any = var39.next();
            if (var64 < 0) {
               kotlin.collections.i.u();
            }

            this.accessories.add(new UploadProgressMessageAccessory(var1.getId-3Eiw7ao(), var64, var92 as UploadProgress, null));
         }
      }

      val var41: ActivityInstanceEmbed = var1.getActivityInstanceEmbed();
      if (var41 != null) {
         this.accessories.add(new ActivityInstanceEmbedMessageAccessory(var1.getId-3Eiw7ao(), var41, var6, null));
      }

      val var42: java.util.List = var1.getCodedLinks();
      if (var42 != null) {
         val var94: java.util.Iterator = var42.iterator();

         for (int var65 = 0; var94.hasNext(); var65++) {
            var var43: Any = var94.next();
            if (var65 < 0) {
               kotlin.collections.i.u();
            }

            var43 = var43 as CodedLinkEmbed;
            if (var43 as CodedLinkEmbed != null) {
               val var111: ArrayList = this.accessories;
               if (var43 is GuildEventInviteEmbedImpl) {
                  var43 = new GuildEventInviteMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var65,
                     var43 as GuildEventInviteEmbedImpl,
                     MessageKt.shouldAnimateEmoji(var1),
                     MessageKt.shouldShowLinkDecorations(var1),
                     var1.getShouldShowRoleDot(),
                     var1.getShouldShowRoleDot(),
                     null
                  );
               } else if (var43 is GuildInviteDisabledEmbedImpl) {
                  var43 = new GuildInviteDisabledMessageAccessory(var1.getId-3Eiw7ao(), var65, var43 as GuildInviteDisabledEmbedImpl, null);
               } else if (var43 is GuildInviteEmbedImpl) {
                  var43 = new GuildInviteMessageAccessory(var1.getId-3Eiw7ao(), var65, var43 as GuildInviteEmbedImpl, null);
               } else if (var43 is ActivityBookmarkEmbedImpl) {
                  var43 = new ActivityBookmarkMessageAccessory(var1.getId-3Eiw7ao(), var65, var43 as ActivityBookmarkEmbedImpl, var6, null);
               } else {
                  if (var43 !is EmbeddedActivityInviteEmbedImpl) {
                     throw new kh.p();
                  }

                  var43 = new EmbeddedActivityInviteMessageAccessory(var1.getId-3Eiw7ao(), var65, var43 as EmbeddedActivityInviteEmbedImpl, var6, null);
               }

               var111.add(var43);
            }
         }
      }

      val var48: java.util.List = var1.getStickers();
      if (var48 != null) {
         for (Sticker var49 : var48) {
            this.accessories.add(new StickerMessageAccessory(var1.getId-3Eiw7ao(), var49, null));
         }
      }

      if (var1.getComponents() != null) {
         this.accessories.add(new MessageComponentsAccessory(var1.getId-3Eiw7ao(), var1, var1.getComponents(), var6, null));
      }

      val var51: java.util.List = var1.getReactions();
      if (var51 != null && var51.isEmpty() xor true && !var1.isFirstForumPostMessage() || var3 is MessageFrameMediaViewer) {
         val var112: ArrayList = this.accessories;
         val var122: java.lang.String = var1.getId-3Eiw7ao();
         val var96: java.util.List = var1.getReactions();
         var var52: java.util.List = var96;
         if (var96 == null) {
            var52 = kotlin.collections.i.k();
         }

         var112.add(
            new ReactionsMessageAccessory(
               var122,
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
         this.accessories.add(new ActivityInviteEmbedMessageAccessory(var1.getId-3Eiw7ao(), var53, null));
      }

      val var54: ThreadEmbed = var1.getThreadEmbed();
      if (var54 != null) {
         this.accessories.add(new ThreadEmbedMessageAccessory(var1.getId-3Eiw7ao(), var54, null));
      }

      val var55: InteractionStatus = var1.getInteractionStatus();
      if (var55 != null) {
         this.accessories.add(new InteractionStatusMessageAccessory(var1.getId-3Eiw7ao(), var55, null));
      }

      val var56: CtaButton = var1.getCtaButton();
      if (var56 != null) {
         this.accessories.add(new CtaButtonMessageAccessory(var1.getChannelId-o4g7jtM(), var1.getId-3Eiw7ao(), var56, null));
      }

      val var57: EphemeralIndication = var1.getEphemeralIndication();
      if (var57 != null) {
         this.accessories.add(new EphemeralIndicationMessageAccessory(var1.getId-3Eiw7ao(), var57, null));
      }

      val var58: SurveyIndication = var1.getSurveyIndication();
      if (var58 != null) {
         this.accessories.add(new SurveyIndicationMessageAccessory(var1.getId-3Eiw7ao(), var58, null));
      }

      if (var1.isFirstForumPostMessage() && var1.getPostActions() != null && var3 !is MessageFrameMediaViewer) {
         this.accessories
            .add(
               new ForumPostActionBar(
                  var1.getId-3Eiw7ao(),
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
         this.accessories.add(new SafetyPolicyNoticeMessageAccessory(var1.getId-3Eiw7ao(), var29, null));
      }

      val var30: SafetySystemNotificationEmbed = var1.getSafetySystemNotificationEmbed();
      if (var30 != null) {
         this.accessories.add(new SafetySystemNotificationMessageAccessory(var1.getId-3Eiw7ao(), var30, null));
      }

      val var31: VoiceInviteEmbed = var1.getVoiceChannelInviteEmbed();
      if (var31 != null) {
         this.accessories.add(new VoiceInviteMessageAccessory(var1.getId-3Eiw7ao(), var31, null));
      }

      val var32: ForwardInfo = var1.getForwardInfo();
      if (var32 != null && var32.getFooterInfo() != null) {
         this.accessories.add(new ForwardBreadcrumbMessageAccessory(var1.getId-3Eiw7ao(), var1.getChannelId-o4g7jtM(), var1.getForwardInfo(), null));
      }

      if (var1.getForwardInfo() != null) {
         kotlin.collections.i.z(this.accessories, new s(<unrepresentable>.INSTANCE));
      }

      return this.accessories;
   }

   @JvmStatic
   fun `generateMessageAccessories$getLongClickListener`(var0: Function6, var1: Message, var2: Int, var3: MediaType): OnLongClickListener {
      val var4: t;
      if (var0 != null) {
         var4 = new t(var0, var1, var2, var3);
      } else {
         var4 = null;
      }

      return var4;
   }

   @JvmStatic
   fun `generateMessageAccessories$getLongClickListener$lambda$9$lambda$8`(var0: Function6, var1: Message, var2: Int, var3: MediaType, var4: View): Boolean {
      kotlin.jvm.internal.q.h(var1, "$message");
      kotlin.jvm.internal.q.h(var3, "$mediaType");
      var0.invoke(MessageId.box-impl(var1.getId-3Eiw7ao()), ChannelId.box-impl(var1.getChannelId-o4g7jtM()), var2, var3, null, null);
      return true;
   }

   @JvmStatic
   fun `generateMessageAccessories$lambda$34`(var0: Function2, var1: Any, var2: Any): Int {
      kotlin.jvm.internal.q.h(var0, "$tmp0");
      return (var0.invoke(var1, var2) as java.lang.Number).intValue();
   }

   private fun hideHeader() {
      var var1: TextView = this.binding.timestamp;
      kotlin.jvm.internal.q.g(this.binding.timestamp, "timestamp");
      var1.setVisibility(8);
      var1 = this.binding.authorName;
      kotlin.jvm.internal.q.g(this.binding.authorName, "authorName");
      var1.setVisibility(8);
      val var3: SimpleDraweeView = this.binding.authorAvatar;
      kotlin.jvm.internal.q.g(this.binding.authorAvatar, "authorAvatar");
      var3.setVisibility(8);
      val var4: SimpleDraweeView = this.binding.authorAvatarDecoration;
      kotlin.jvm.internal.q.g(this.binding.authorAvatarDecoration, "authorAvatarDecoration");
      var4.setVisibility(8);
      val var5: RoleDotView = this.binding.roleDot;
      kotlin.jvm.internal.q.g(this.binding.roleDot, "roleDot");
      var5.setVisibility(8);
      val var6: ClanTagChipletView = this.binding.clanTagChiplet;
      kotlin.jvm.internal.q.g(this.binding.clanTagChiplet, "clanTagChiplet");
      var6.setVisibility(8);
      val var7: RoleIconView = this.binding.roleIcon;
      kotlin.jvm.internal.q.g(this.binding.roleIcon, "roleIcon");
      var7.setVisibility(8);
      val var8: GameIconView = this.binding.gameIcon;
      kotlin.jvm.internal.q.g(this.binding.gameIcon, "gameIcon");
      var8.setVisibility(8);
      val var9: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
      kotlin.jvm.internal.q.g(this.binding.connectionsRoleTag, "connectionsRoleTag");
      var9.setVisibility(8);
      val var10: MessageTagView = this.binding.messageTagView;
      kotlin.jvm.internal.q.g(this.binding.messageTagView, "messageTagView");
      var10.setVisibility(8);
      val var11: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
      kotlin.jvm.internal.q.g(this.binding.messageAltRemixTagView, "messageAltRemixTagView");
      var11.setVisibility(8);
   }

   @JvmStatic
   fun `setMessage$lambda$2$lambda$1`(var0: Function2, var1: Message, var2: View) {
      kotlin.jvm.internal.q.h(var0, "$onMessageTapped");
      kotlin.jvm.internal.q.h(var1, "$message");
      var0.invoke(MessageId.box-impl(var1.getId-3Eiw7ao()), ChannelId.box-impl(var1.getChannelId-o4g7jtM()));
   }

   @JvmStatic
   fun `setMessage$lambda$4$lambda$3`(var0: Function6, var1: Message, var2: View): Boolean {
      kotlin.jvm.internal.q.h(var0, "$it");
      kotlin.jvm.internal.q.h(var1, "$message");
      var0.invoke(MessageId.box-impl(var1.getId-3Eiw7ao()), ChannelId.box-impl(var1.getChannelId-o4g7jtM()), null, null, null, null);
      return true;
   }

   public open fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
      kotlin.jvm.internal.q.h(var1, "ev");
      return this.allowChildGestures xor true;
   }

   public fun onRecycledHint() {
      this.binding.accessoriesView.clear(false);
   }

   public override fun onSwipeEnd() {
      this.setClipChildren(true);
      this.getShadowView().setVisibility(4);
   }

   public override fun onSwipeStart() {
      this.setClipChildren(false);
      this.getShadowView().setVisibility(0);
   }

   public fun setAccessoriesRecycledViewPool(recycledViewPool: RecycledViewPool) {
      kotlin.jvm.internal.q.h(var1, "recycledViewPool");
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
      kotlin.jvm.internal.q.h(var1, "message");
      kotlin.jvm.internal.q.h(var2, "messageContext");
      kotlin.jvm.internal.q.h(var4, "eventHandler");
      kotlin.jvm.internal.q.h(var6, "onChainPart");
      this.bindKey(MessageId.box-impl(var1.getId-3Eiw7ao()));
      val var15: java.lang.String = this.messageId;
      val var14: java.lang.String = var1.getId-3Eiw7ao();
      val var11: Boolean;
      if (var15 == null) {
         var11 = false;
      } else {
         var11 = MessageId.equals-impl0(var15, var14);
      }

      this.messageId = var1.getId-3Eiw7ao();
      var var30: o = null;
      if (var11 xor true && var2.getContextType() === MessageContextType.SEARCH) {
         val var31: MessageAccessoriesView = this.binding.accessoriesView;
         kotlin.jvm.internal.q.g(this.binding.accessoriesView, "accessoriesView");
         MessageAccessoriesView.clear$default(var31, false, 1, null);
      }

      this.onChainPart = var6;
      this.setOnInitiateReply(new Function0(var4, var1) {
         final ChatEventHandler $eventHandler;
         final Message $message;

         {
            super(0);
            this.$eventHandler = var1;
            this.$message = var2;
         }

         public final void invoke() {
            this.$eventHandler.onInitiateReply-pfaIj0E(this.$message.getId-3Eiw7ao(), this.$message.getChannelId-o4g7jtM());
         }
      });
      this.setOnInitiateEdit(new Function0(var4, var1) {
         final ChatEventHandler $eventHandler;
         final Message $message;

         {
            super(0);
            this.$eventHandler = var1;
            this.$message = var2;
         }

         public final void invoke() {
            this.$eventHandler.onInitiateEdit-pfaIj0E(this.$message.getId-3Eiw7ao(), this.$message.getChannelId-o4g7jtM());
         }
      });
      this.setEnableSwipeToReply(var2.getEnableSwipeToReply());
      this.setEnableSwipeToEdit(var2.getEnableSwipeToEdit());
      this.setUsingGradientTheme(var2.getUsingGradientTheme());
      this.allowChildGestures = var7;
      val var32: MessageView.ChainPart = var6.invoke() as MessageView.ChainPart;
      val var20: Int = var1.getTimestampColor();
      if (var20 != null) {
         this.binding.timestamp.setTextColor(var20.intValue());
      }

      var var29: Byte = 8;
      if (var3 != null && var3 !is UnknownMessageFrame) {
         val var22: MessageFrameHeaderView = this.binding.messageFrameHeader;
         kotlin.jvm.internal.q.g(this.binding.messageFrameHeader, "messageFrameHeader");
         var22.setVisibility(0);
         this.binding.messageFrameHeader.configure(var3);
      } else {
         val var21: MessageFrameHeaderView = this.binding.messageFrameHeader;
         kotlin.jvm.internal.q.g(this.binding.messageFrameHeader, "messageFrameHeader");
         var21.setVisibility(8);
      }

      if (var2.getContextType() === MessageContextType.SEARCH) {
         this.hideHeader();
      } else {
         this.configureAuthor(var1, var4, var32);
      }

      this.configureDivider(var2.getShowDivider());
      val var16: java.lang.String = var1.getThreadStarterMessageHeader();
      if (var16 != null) {
         val var23: ThreadStarterMessageHeaderView = this.getThreadStarterMessageHeaderView();
         if (var1.getReferencedMessage() != null) {
            var7 = true;
         } else {
            var7 = false;
         }

         var23.configure(var16, var7);
      } else {
         this.getThreadStarterMessageHeaderView().setVisibility(8);
      }

      val var24: MessageHighlightHeader = this.getMessageHighlightHeader();
      if (var8) {
         var29 = 0;
      }

      var24.setVisibility(var29);
      if (var1.getReferencedMessage() != null) {
         MessageViewReplyPreview.configureReply$default(this.getReplyPreview(), var1.getReferencedMessage(), false, new Function0(var4, var1) {
            final ChatEventHandler $eventHandler;
            final Message $message;

            {
               super(0);
               this.$eventHandler = var1;
               this.$message = var2;
            }

            public final void invoke() {
               this.$eventHandler.onTapMessageReply-0eiqbug(this.$message.getChannelId-o4g7jtM(), this.$message.getId-3Eiw7ao());
            }
         }, 2, null);
      } else if (var1.getExecutedCommand() != null) {
         this.getReplyPreview()
            .configureExecutedCommand-dB0-bEw(
               var1.getId-3Eiw7ao(),
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

      val var25: Function2 = var4.getOnMessageTapped();
      val var26: n;
      if (var25 != null) {
         var26 = new n(var25, var1);
      } else {
         var26 = null;
      }

      val var33: Function6 = var4.getOnMessageLongPressed();
      if (var33 != null) {
         var30 = new o(var33, var1);
      }

      NestedScrollOnTouchUtilsKt.setOnClickListenerNested(this, true, var26);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested(this, true, var30);
      val var34: java.util.List = this.generateMessageAccessories(var1, var2, var3, var4.getOnMessageLongPressed());
      val var17: MessageAccessoriesView = this.binding.accessoriesView;
      val var18: java.lang.String = var1.getId-3Eiw7ao();
      val var12: Long = var1.getChannelId-o4g7jtM();
      val var19: GuildId = var1.getGuildId-qOKuAAo();
      if (var1.getForwardInfo() != null) {
         var7 = true;
      } else {
         var7 = false;
      }

      var17.setAccessories-mFdI1tY(var18, var12, var19, var34, var4, var5, var2, var9, var7);
      this.configureAccessoriesMargin(var34);
      this.configureCommunicationDisabled(kotlin.jvm.internal.q.c(var1.getCommunicationDisabled(), java.lang.Boolean.TRUE), var32);
      this.configureSuppressNotifications(MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.SUPPRESS_NOTIFICATIONS), var4, var32);
      this.configureAccessibilityDelegate(var1, this.accessories, var26, var30);
   }

   public open fun setPressed(pressed: Boolean) {
      if (!var1 || !this.isClickable() && !this.isFocusable()) {
         var1 = false;
      } else {
         var1 = true;
      }

      super.setPressed(var1);
   }

   public override fun spacingPxOverride(): Int {
      var var1: Int = MessageView.WhenMappings.$EnumSwitchMapping$1[(this.onChainPart.invoke() as MessageView.ChainPart).ordinal()];
      if (var1 != 1 && var1 != 2) {
         if (var1 != 3 && var1 != 4) {
            throw new kh.p();
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
      private EnumEntries $ENTRIES;
      @JvmStatic
      private MessageView.ChainPart[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<MessageView.ChainPart> = $values();
         $VALUES = var0;
         $ENTRIES = rh.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }
}
