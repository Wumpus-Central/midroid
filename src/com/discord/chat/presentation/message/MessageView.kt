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
import com.discord.chat.presentation.list.ChatListConstraintLayout
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
   : ChatListConstraintLayout,
   SpacingProviderView,
   SpineParentMessage,
   SwipeReplyInitiator {
   private final val binding: MessageViewBinding
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
      val var7: Boolean = kotlin.collections.h.b0(var1) is MessageContentAccessory;
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
         val var4: SimpleDraweeView = this.binding.authorAvatar;
         val var11: Context = this.binding.authorAvatar.getContext();
         kotlin.jvm.internal.r.g(var11, "context");
         var4.setImageURI(MessageKt.avatarUrl(var1, var11));
         kotlin.jvm.internal.r.g(var4, "configureAuthor$lambda$38");
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var4, false, new p(var1, var2), 1, null);
         NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var4, false, new q(var1, var2), 1, null);
         if (var1.getAvatarDecorationURL() != null) {
            val var12: SimpleDraweeView = this.binding.authorAvatarDecoration;
            kotlin.jvm.internal.r.g(this.binding.authorAvatarDecoration, "binding.authorAvatarDecoration");
            var12.setVisibility(0);
            this.binding.authorAvatarDecoration.setImageURI(var1.getAvatarDecorationURL());
         } else {
            val var13: SimpleDraweeView = this.binding.authorAvatarDecoration;
            kotlin.jvm.internal.r.g(this.binding.authorAvatarDecoration, "binding.authorAvatarDecoration");
            var13.setVisibility(8);
         }

         val var14: TextView = this.binding.timestamp;
         kotlin.jvm.internal.r.g(this.binding.timestamp, "binding.timestamp");
         var14.setVisibility(0);
         val var15: TextView = this.binding.authorName;
         kotlin.jvm.internal.r.g(this.binding.authorName, "binding.authorName");
         var15.setVisibility(0);
         val var16: SimpleDraweeView = this.binding.authorAvatar;
         kotlin.jvm.internal.r.g(this.binding.authorAvatar, "binding.authorAvatar");
         var16.setVisibility(0);
         if (var1.getShouldShowRoleDot()) {
            val var17: RoleDotView = this.binding.roleDot;
            kotlin.jvm.internal.r.g(this.binding.roleDot, "binding.roleDot");
            var17.setVisibility(0);
            val var18: RoleDotView = this.binding.roleDot;
            kotlin.jvm.internal.r.g(this.binding.roleDot, "binding.roleDot");
            RoleDotView.configure$default(var18, MessageKt.roleDotColor$default(var1, 0, 1, null), 0, 2, null);
         } else {
            val var19: RoleDotView = this.binding.roleDot;
            kotlin.jvm.internal.r.g(this.binding.roleDot, "binding.roleDot");
            var19.setVisibility(8);
         }

         if (var1.getClanTag() != null && var1.getClanTagGuildId-qOKuAAo() != null) {
            val var21: ClanTagChipletView = this.binding.clanTagChiplet;
            kotlin.jvm.internal.r.g(this.binding.clanTagChiplet, "binding.clanTagChiplet");
            ClanTagChipletView.configure-D0ylKIU$default(
               var21, var1.getClanTag(), var1.getClanBadgeUrl(), var1.getClanTagGuildId-qOKuAAo().unbox-impl(), var2, 0.0F, 16, null
            );
            val var22: ClanTagChipletView = this.binding.clanTagChiplet;
            kotlin.jvm.internal.r.g(this.binding.clanTagChiplet, "binding.clanTagChiplet");
            var22.setVisibility(0);
         } else {
            val var20: ClanTagChipletView = this.binding.clanTagChiplet;
            kotlin.jvm.internal.r.g(this.binding.clanTagChiplet, "binding.clanTagChiplet");
            var20.setVisibility(8);
         }

         if (var1.getRoleIcon() != null) {
            this.binding.roleIcon.configureRoleIcon(var1.getRoleIcon(), var2);
            val var23: RoleIconView = this.binding.roleIcon;
            kotlin.jvm.internal.r.g(this.binding.roleIcon, "binding.roleIcon");
            var23.setVisibility(0);
         } else {
            val var24: RoleIconView = this.binding.roleIcon;
            kotlin.jvm.internal.r.g(this.binding.roleIcon, "binding.roleIcon");
            var24.setVisibility(8);
         }

         if (var1.getConnectionsRoleTag() != null) {
            this.binding
               .connectionsRoleTag
               .configureConnectionsRoleTag-uESh2Cg(
                  var1.getAuthorId-wUX8bhU(), var1.getGuildId-qOKuAAo(), ChannelId.box-impl(var1.getChannelId-o4g7jtM()), var1.getConnectionsRoleTag(), var2
               );
            val var25: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
            kotlin.jvm.internal.r.g(this.binding.connectionsRoleTag, "binding.connectionsRoleTag");
            var25.setVisibility(0);
         } else {
            val var26: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
            kotlin.jvm.internal.r.g(this.binding.connectionsRoleTag, "binding.connectionsRoleTag");
            var26.setVisibility(8);
         }

         if (var1.getTagText() == null && var1.getOpTagText() == null) {
            val var7: MessageTagView = this.binding.messageTagView;
            kotlin.jvm.internal.r.g(this.binding.messageTagView, "binding.messageTagView");
            var7.setVisibility(8);
            val var8: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
            kotlin.jvm.internal.r.g(this.binding.messageAltRemixTagView, "binding.messageAltRemixTagView");
            var8.setVisibility(8);
         } else if (var1.getTagType() != null && kotlin.jvm.internal.r.c(var1.getTagType(), "f")) {
            val var28: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
            kotlin.jvm.internal.r.g(this.binding.messageAltRemixTagView, "binding.messageAltRemixTagView");
            var28.setVisibility(0);
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
            kotlin.jvm.internal.r.g(this.binding.messageTagView, "binding.messageTagView");
            var6.setVisibility(8);
         } else {
            val var27: MessageTagView = this.binding.messageTagView;
            kotlin.jvm.internal.r.g(this.binding.messageTagView, "binding.messageTagView");
            var27.setVisibility(0);
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
            kotlin.jvm.internal.r.g(this.binding.messageAltRemixTagView, "binding.messageAltRemixTagView");
            var5.setVisibility(8);
         }
      }
   }

   @JvmStatic
   fun `configureAuthor$lambda$38$lambda$36`(var0: Message, var1: ChatEventHandler, var2: View) {
      kotlin.jvm.internal.r.h(var0, "$message");
      kotlin.jvm.internal.r.h(var1, "$eventHandler");
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onTapAvatar-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }
   }

   @JvmStatic
   fun `configureAuthor$lambda$38$lambda$37`(var0: Message, var1: ChatEventHandler, var2: View): Boolean {
      kotlin.jvm.internal.r.h(var0, "$message");
      kotlin.jvm.internal.r.h(var1, "$eventHandler");
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onLongPressAvatar-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
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
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onTapUsername-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }
   }

   @JvmStatic
   fun `configureAuthorClickListeners$lambda$7`(var0: Message, var1: ChatEventHandler, var2: View): Boolean {
      kotlin.jvm.internal.r.h(var0, "$message");
      kotlin.jvm.internal.r.h(var1, "$eventHandler");
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
   fun `configureSuppressNotifications$lambda$39`(var0: ChatEventHandler, var1: View) {
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
      val var11: Boolean;
      if (var1.getForwardInfo() != null) {
         var11 = true;
      } else {
         var11 = false;
      }

      val var12: Boolean;
      if (var1.getForwardInfo() != null && var1.getForwardInfo().getUseOldIcon()) {
         var12 = true;
      } else {
         var12 = false;
      }

      if (var11) {
         this.accessories.add(new ForwardHeaderMessageAccessory(var1.getId-3Eiw7ao(), var12, null));
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

      val var79: StructurableText = var1.getContent();
      var var5: Boolean;
      if (var79 != null && var79.getHasContent()) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      if (var5 && var1.getType() != MessageType.CUSTOM_GIFT) {
         val var23: ArrayList = this.accessories;
         val var80: java.lang.String = var1.getId-3Eiw7ao();
         val var22: StructurableText = var1.getContent();
         val var15: Boolean = MessageKt.shouldAnimateEmoji(var1);
         val var16: Boolean = MessageKt.shouldShowLinkDecorations(var1);
         val var14: Boolean = var1.getShouldShowRoleDot();
         val var13: Boolean = var1.getShouldShowRoleOnName();
         val var9: Int = this.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing);
         val var24: Int = var1.getLinkColor();
         val var8: Int;
         if (var24 != null) {
            var8 = var24;
         } else {
            var8 = ThemeManagerKt.getTheme().getTextLink();
         }

         val var128: DiscordFont = DiscordFont.PrimaryMedium;
         val var25: Context = this.getContext();
         kotlin.jvm.internal.r.g(var25, "context");
         val var10: Int = MessageUtilsKt.getChatTextSizeSp(var25);
         val var135: MessageState = var1.getState();
         if (var135 == null) {
            var5 = -1;
         } else {
            var5 = MessageView.WhenMappings.$EnumSwitchMapping$0[var135.ordinal()];
         }

         if (var5 != 1 && var5 != 2) {
            val var136: Int = var1.getTextColor();
            if (var136 != null) {
               var5 = var136;
            } else {
               var5 = ThemeManagerKt.getTheme().getTextNormal();
            }
         } else {
            var5 = ThemeManagerKt.getTheme().getTextMuted();
         }

         var23.add(
            new MessageContentAccessory(
               var80,
               var22,
               var15,
               var16,
               var14,
               var13,
               var9,
               var8,
               var5,
               var128,
               var10,
               false,
               var6,
               var1.getEdited(),
               var1.getEditedColor(),
               var11,
               var2.getTruncation(),
               null,
               131072,
               null
            )
         );
      }

      if (var1.getPollData() != null && var1.getPollData().getLayoutType() != PollLayoutType.UNKNOWN) {
         val var104: ArrayList = this.accessories;
         val var117: PollMessageAccessory.Companion = PollMessageAccessory.Companion;
         val var81: Context = this.getContext();
         kotlin.jvm.internal.r.g(var81, "context");
         var104.add(var117.create(var81, var1, var1.getPollData()));
      }

      if (var1.getAttachments() != null && var1.getPollData() == null && !MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.IS_UIKIT_COMPONENTS)) {
         label447: {
            val var82: java.util.List = var1.getAttachments();
            if (var82 !is java.util.Collection || !var82.isEmpty()) {
               val var83: java.util.Iterator = var82.iterator();

               while (var83.hasNext()) {
                  if (kotlin.jvm.internal.r.c((var83.next() as Attachment).getObscure(), java.lang.Boolean.TRUE)) {
                     var60 = true;
                     break label447;
                  }
               }
            }

            var60 = false;
         }

         val var118: java.lang.Iterable = kotlin.collections.h.S0(var1.getAttachments());
         var var105: ArrayList = new ArrayList();
         val var84: ArrayList = new ArrayList();

         for (var118 : var118) {
            val var68: Boolean;
            if (((var118 as fh.m).d() as Attachment).type() != AttachmentType.Image && ((var118 as fh.m).d() as Attachment).type() != AttachmentType.Video) {
               var68 = false;
            } else {
               var68 = true;
            }

            if (var68) {
               var105.add(var118);
            } else {
               var84.add(var118);
            }
         }

         val var85: Pair = new Pair(var105, var84);
         val var120: java.util.List = var85.a() as java.util.List;
         val var138: java.util.List = var85.b() as java.util.List;
         if (var120.isEmpty() xor true && var2.getUseAttachmentGridLayout()) {
            label365: {
               if (kotlin.jvm.internal.r.c(var1.isCurrentUserMessageAuthor(), java.lang.Boolean.TRUE)) {
                  val var106: java.lang.String = var1.getNonce-N_6c4I0();
                  var86 = var106;
                  if (var106 != null) {
                     break label365;
                  }
               }

               var86 = var1.getId-3Eiw7ao();
            }

            var105 = this.accessories;
            val var19: Long = var1.getChannelId-o4g7jtM();
            val var26: ArrayList = new ArrayList(kotlin.collections.h.t(var120, 10));

            for (fh.m var130 : var120) {
               var26.add(
                  CreateAttachmentAccessoryKt.createAttachmentAccessory(
                     var130.d() as Attachment,
                     var1,
                     var130.c(),
                     var6,
                     this.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius)
                  )
               );
            }

            val var122: java.lang.Boolean = var1.getShowInlineForwardButton();
            val var70: Boolean;
            if (var122 != null) {
               var70 = var122;
            } else {
               var70 = false;
            }

            val var131: MessageState = var1.getState();
            var var123: MessageState = var131;
            if (var131 == null) {
               var123 = MessageState.Unknown;
            }

            val var132: java.lang.Boolean = var1.getGifAutoPlay();
            val var72: Boolean;
            if (var132 != null) {
               var72 = var132;
            } else {
               var72 = false;
            }

            var105.add(new MediaMosaicAttachmentMessageAccessory(var86, var19, var26, var6, var11, var70, var123, var72, var12, null));
         }

         val var87: ArrayList = this.accessories;

         for (fh.m var124 : var138) {
            var87.add(CreateAttachmentAccessoryKt.createAttachmentAccessory(var124.d() as Attachment, var1, var124.c(), var6, var7));
         }

         if (var60) {
            val var125: ArrayList = this.accessories;
            val var109: java.lang.String = var1.getId-3Eiw7ao();
            val var76: Long = var1.getChannelId-o4g7jtM();
            var var88: java.lang.String = var1.getObscureLearnMoreLabel();
            if (var88 == null) {
               var88 = "";
            }

            var125.add(new InfoLinkMessageAccessory(var109, var76, null, null, var88, ReactAsset.Info, null));
         }
      }

      val var89: java.util.List = var1.getPostPreviewEmbeds();
      if (var89 != null) {
         val var90: java.util.Iterator = var89.iterator();

         for (int var61 = 0; var90.hasNext(); var61++) {
            val var110: Any = var90.next();
            if (var61 < 0) {
               kotlin.collections.h.s();
            }

            this.accessories
               .add(
                  new PostPreviewEmbedMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var110 as PostPreviewEmbed,
                     var61,
                     SpoilerAttributes.Companion.forMediaPostPreviewEmbed(var110 as PostPreviewEmbed, var1, var61),
                     null
                  )
               );
         }
      }

      val var92: java.util.List = var1.getEmbeds();
      if (var92 != null) {
         val var126: java.util.Iterator = var92.iterator();

         for (int var62 = 0; var126.hasNext(); var62++) {
            var var93: Embed = (Embed)var126.next();
            if (var62 < 0) {
               kotlin.collections.h.s();
            }

            var93 = var93;
            val var27: ArrayList = this.accessories;
            var var112: java.lang.String = var1.getId-3Eiw7ao();
            var var77: Long = var1.getChannelId-o4g7jtM();
            val var18: Boolean = MessageKt.shouldAutoPlayGifs(var1);
            val var74: Boolean = MessageKt.shouldAnimateEmoji(var1);
            val var75: Boolean = MessageKt.shouldShowLinkDecorations(var1);
            val var73: Boolean = var1.getShouldShowRoleDot();
            val var17: Boolean = var1.getShouldShowRoleOnName();
            val var133: SpoilerAttributes = SpoilerAttributes.Companion.forEmbed(var93, var1, var62);
            val var139: OnLongClickListener = generateMessageAccessories$getLongClickListener(var4, var1, var62, MediaType.Embed);
            val var141: java.lang.Boolean = var1.getShowInlineForwardButton();
            val var71: Boolean;
            if (var141 != null) {
               var71 = var141;
            } else {
               var71 = false;
            }

            var27.add(
               new EmbedMessageAccessory(var112, var62, var77, var6, var7, var93, var18, var74, var75, var73, var17, var133, var139, var11, var71, var12, null)
            );
            if (var93.getObscureOrNull() != null) {
               val var134: ArrayList = this.accessories;
               val var140: java.lang.String = var1.getId-3Eiw7ao();
               var77 = var1.getChannelId-o4g7jtM();
               var112 = var93.getId();
               val var69: Boolean;
               if (var112 != null && !kotlin.text.f.x(var112)) {
                  var69 = false;
               } else {
                  var69 = true;
               }

               val var95: java.lang.String;
               if (!var69) {
                  var95 = var93.getId();
               } else {
                  val var96: StringBuilder = new StringBuilder();
                  var96.append("index_");
                  var96.append(var62);
                  var95 = var96.toString();
               }

               var112 = var1.getObscureLearnMoreLabel();
               if (var112 == null) {
                  var112 = "";
               }

               var134.add(new InfoLinkMessageAccessory(var140, var77, null, var95, var112, ReactAsset.Info, null));
            }
         }
      }

      val var33: java.util.List = var1.getGiftCodes();
      if (var33 != null) {
         val var34: java.util.Iterator = var33.iterator();

         for (int var63 = 0; var34.hasNext(); var63++) {
            val var97: Any = var34.next();
            if (var63 < 0) {
               kotlin.collections.h.s();
            }

            this.accessories.add(new GiftMessageAccessory(var1.getId-3Eiw7ao(), var63, var97 as GiftEmbed, null));
         }
      }

      val var36: GiftEmbed = var1.getReferralTrialOffer();
      if (var36 != null) {
         this.accessories.add(new GiftMessageAccessory(var1.getId-3Eiw7ao(), 0, var36, null));
      }

      val var37: java.util.List = var1.getProgress();
      if (var37 != null) {
         val var38: java.util.Iterator = var37.iterator();

         for (int var64 = 0; var38.hasNext(); var64++) {
            val var99: Any = var38.next();
            if (var64 < 0) {
               kotlin.collections.h.s();
            }

            this.accessories.add(new UploadProgressMessageAccessory(var1.getId-3Eiw7ao(), var64, var99 as UploadProgress, null));
         }
      }

      val var40: ActivityInstanceEmbed = var1.getActivityInstanceEmbed();
      if (var40 != null) {
         this.accessories.add(new ActivityInstanceEmbedMessageAccessory(var1.getId-3Eiw7ao(), var40, var6, null));
      }

      val var41: java.util.List = var1.getCodedLinks();
      if (var41 != null) {
         val var101: java.util.Iterator = var41.iterator();

         for (int var65 = 0; var101.hasNext(); var65++) {
            var var42: Any = var101.next();
            if (var65 < 0) {
               kotlin.collections.h.s();
            }

            var42 = var42 as CodedLinkEmbed;
            if (var42 as CodedLinkEmbed != null) {
               val var115: ArrayList = this.accessories;
               if (var42 is GuildEventInviteEmbedImpl) {
                  var42 = new GuildEventInviteMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var65,
                     var42 as GuildEventInviteEmbedImpl,
                     MessageKt.shouldAnimateEmoji(var1),
                     MessageKt.shouldShowLinkDecorations(var1),
                     var1.getShouldShowRoleDot(),
                     var1.getShouldShowRoleDot(),
                     null
                  );
               } else if (var42 is GuildInviteDisabledEmbedImpl) {
                  var42 = new GuildInviteDisabledMessageAccessory(var1.getId-3Eiw7ao(), var65, var42 as GuildInviteDisabledEmbedImpl, null);
               } else if (var42 is GuildInviteEmbedImpl) {
                  var42 = new GuildInviteMessageAccessory(var1.getId-3Eiw7ao(), var65, var42 as GuildInviteEmbedImpl, null);
               } else if (var42 is ActivityBookmarkEmbedImpl) {
                  var42 = new ActivityBookmarkMessageAccessory(var1.getId-3Eiw7ao(), var65, var42 as ActivityBookmarkEmbedImpl, var6, null);
               } else {
                  if (var42 !is EmbeddedActivityInviteEmbedImpl) {
                     throw new eh.p();
                  }

                  var42 = new EmbeddedActivityInviteMessageAccessory(var1.getId-3Eiw7ao(), var65, var42 as EmbeddedActivityInviteEmbedImpl, var6, null);
               }

               var115.add(var42);
            }
         }
      }

      val var47: java.util.List = var1.getStickers();
      if (var47 != null) {
         for (Sticker var48 : var47) {
            this.accessories.add(new StickerMessageAccessory(var1.getId-3Eiw7ao(), var48, null));
         }
      }

      if (var1.getComponents() != null) {
         this.accessories.add(new MessageComponentsAccessory(var1.getId-3Eiw7ao(), var1, var1.getComponents(), var6, null));
      }

      val var50: java.util.List = var1.getReactions();
      var var66: Boolean = false;
      if (var50 != null) {
         var66 = false;
         if (var50.isEmpty() xor true) {
            var66 = true;
         }
      }

      if (var66 && !var1.isFirstForumPostMessage() || var3 is MessageFrameMediaViewer) {
         val var116: ArrayList = this.accessories;
         val var127: java.lang.String = var1.getId-3Eiw7ao();
         val var103: java.util.List = var1.getReactions();
         var var51: java.util.List = var103;
         if (var103 == null) {
            var51 = kotlin.collections.h.i();
         }

         var116.add(
            new ReactionsMessageAccessory(
               var127,
               var51,
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

      val var52: ActivityInviteEmbed = var1.getActivityInviteEmbed();
      if (var52 != null) {
         this.accessories.add(new ActivityInviteEmbedMessageAccessory(var1.getId-3Eiw7ao(), var52, null));
      }

      val var53: ThreadEmbed = var1.getThreadEmbed();
      if (var53 != null) {
         this.accessories.add(new ThreadEmbedMessageAccessory(var1.getId-3Eiw7ao(), var53, null));
      }

      val var54: InteractionStatus = var1.getInteractionStatus();
      if (var54 != null) {
         this.accessories.add(new InteractionStatusMessageAccessory(var1.getId-3Eiw7ao(), var54, null));
      }

      val var55: CtaButton = var1.getCtaButton();
      if (var55 != null) {
         this.accessories.add(new CtaButtonMessageAccessory(var1.getChannelId-o4g7jtM(), var1.getId-3Eiw7ao(), var55, null));
      }

      val var56: EphemeralIndication = var1.getEphemeralIndication();
      if (var56 != null) {
         this.accessories.add(new EphemeralIndicationMessageAccessory(var1.getId-3Eiw7ao(), var56, null));
      }

      val var57: SurveyIndication = var1.getSurveyIndication();
      if (var57 != null) {
         this.accessories.add(new SurveyIndicationMessageAccessory(var1.getId-3Eiw7ao(), var57, null));
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

      val var28: SafetyPolicyNoticeEmbed = var1.getSafetyPolicyNoticeEmbed();
      if (var28 != null) {
         this.accessories.add(new SafetyPolicyNoticeMessageAccessory(var1.getId-3Eiw7ao(), var28, null));
      }

      val var29: SafetySystemNotificationEmbed = var1.getSafetySystemNotificationEmbed();
      if (var29 != null) {
         this.accessories.add(new SafetySystemNotificationMessageAccessory(var1.getId-3Eiw7ao(), var29, null));
      }

      val var30: VoiceInviteEmbed = var1.getVoiceChannelInviteEmbed();
      if (var30 != null) {
         this.accessories.add(new VoiceInviteMessageAccessory(var1.getId-3Eiw7ao(), var30, null));
      }

      val var31: ForwardInfo = var1.getForwardInfo();
      if (var31 != null && var31.getFooterInfo() != null) {
         this.accessories.add(new ForwardBreadcrumbMessageAccessory(var1.getId-3Eiw7ao(), var1.getChannelId-o4g7jtM(), var1.getForwardInfo(), null));
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
      var0.invoke(MessageId.box-impl(var1.getId-3Eiw7ao()), ChannelId.box-impl(var1.getChannelId-o4g7jtM()), var2, var3, null, null);
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
      var0.invoke(MessageId.box-impl(var1.getId-3Eiw7ao()), ChannelId.box-impl(var1.getChannelId-o4g7jtM()));
   }

   @JvmStatic
   fun `setMessage$lambda$4$lambda$3`(var0: Function6, var1: Message, var2: View): Boolean {
      kotlin.jvm.internal.r.h(var0, "$it");
      kotlin.jvm.internal.r.h(var1, "$message");
      var0.invoke(MessageId.box-impl(var1.getId-3Eiw7ao()), ChannelId.box-impl(var1.getChannelId-o4g7jtM()), null, null, null, null);
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
      val var16: java.lang.String = this.messageId;
      var var15: java.lang.String = var1.getId-3Eiw7ao();
      val var11: Boolean;
      if (var16 == null) {
         var11 = false;
      } else {
         var11 = MessageId.equals-impl0(var16, var15);
      }

      this.messageId = var1.getId-3Eiw7ao();
      if (var11 xor true && var2.getContextType() === MessageContextType.SEARCH) {
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
            this.$eventHandler.onInitiateReply-pfaIj0E(this.$message.getId-3Eiw7ao(), this.$message.getChannelId-o4g7jtM());
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
            this.$eventHandler.onInitiateEdit-pfaIj0E(this.$message.getId-3Eiw7ao(), this.$message.getChannelId-o4g7jtM());
         }
      });
      this.setEnableSwipeToReply(var2.getEnableSwipeToReply());
      this.setEnableSwipeToEdit(var2.getEnableSwipeToEdit());
      this.setUsingGradientTheme(var2.getUsingGradientTheme());
      this.allowChildGestures = var7;
      val var34: MessageView.ChainPart = var6.invoke() as MessageView.ChainPart;
      val var21: Int = var1.getTimestampColor();
      if (var21 != null) {
         this.binding.timestamp.setTextColor(var21.intValue());
      }

      this.binding.accessoriesView.updateLeftMargin(this.getAccessoryLeftMargin(var2, var9));
      var var31: Byte = 8;
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
         this.configureAuthor(var1, var4, var34);
      }

      this.configureDivider(var2.getShowDivider());
      var15 = var1.getThreadStarterMessageHeader();
      val var24: ThreadStarterMessageHeaderView = this.binding.threadStarterHeader;
      if (var1.getReferencedMessage() != null) {
         var7 = true;
      } else {
         var7 = false;
      }

      var24.configure(var15, var7);
      val var25: MessageHighlightHeader = this.binding.highlightHeader;
      kotlin.jvm.internal.r.g(this.binding.highlightHeader, "binding.highlightHeader");
      if (var8) {
         var31 = 0;
      }

      var25.setVisibility(var31);
      if (var1.getReferencedMessage() != null) {
         val var26: MessageViewReplyPreview = this.binding.replyPreview;
         kotlin.jvm.internal.r.g(this.binding.replyPreview, "binding.replyPreview");
         MessageViewReplyPreview.configureReply$default(var26, var1.getReferencedMessage(), false, new Function0<Unit>(var4, var1) {
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
         this.binding
            .replyPreview
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
         this.binding.replyPreview.clear();
      }

      val var27: Function2 = var4.getOnMessageTapped();
      var var33: n = null;
      val var28: m;
      if (var27 != null) {
         var28 = new m(var27, var1);
      } else {
         var28 = null;
      }

      val var17: Function6 = var4.getOnMessageLongPressed();
      if (var17 != null) {
         var33 = new n(var17, var1);
      }

      NestedScrollOnTouchUtilsKt.setOnClickListenerNested(this, true, var28);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested(this, true, var33);
      val var35: java.util.List = this.generateMessageAccessories(var1, var2, var3, var4.getOnMessageLongPressed());
      val var18: MessageAccessoriesView = this.binding.accessoriesView;
      val var20: java.lang.String = var1.getId-3Eiw7ao();
      val var13: Long = var1.getChannelId-o4g7jtM();
      val var19: GuildId = var1.getGuildId-qOKuAAo();
      var7 = false;
      if (var1.getForwardInfo() != null) {
         var7 = true;
      }

      var18.setAccessories-MNg-vQI(var20, var13, var19, var35, var4, var5, var7);
      this.configureAccessoriesMargin(var35);
      this.configureCommunicationDisabled(kotlin.jvm.internal.r.c(var1.getCommunicationDisabled(), java.lang.Boolean.TRUE), var34);
      this.configureSuppressNotifications(MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.SUPPRESS_NOTIFICATIONS), var4, var34);
      this.configureAccessibilityDelegate(var1, this.accessories, var28, var33);
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
}
