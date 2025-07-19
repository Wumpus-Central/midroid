package com.discord.chat.presentation.message

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.View.OnLongClickListener
import android.view.ViewGroup.LayoutParams
import android.view.ViewGroup.MarginLayoutParams
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.SetTextSizeSpKt
import com.discord.chat.R
import com.discord.chat.bridge.MediaType
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.bridge.MessageState
import com.discord.chat.bridge.MessageType
import com.discord.chat.bridge.activities.ActivityInstanceEmbed
import com.discord.chat.bridge.activities.ActivityInviteEmbed
import com.discord.chat.bridge.activities.ActivityRichPresenceInviteEmbed
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.attachment.AttachmentType
import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl
import com.discord.chat.bridge.codedlinks.CodedLinkEmbed
import com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbedImpl
import com.discord.chat.bridge.codedlinks.GuildEventInviteEmbedImpl
import com.discord.chat.bridge.codedlinks.GuildInviteDisabledEmbedImpl
import com.discord.chat.bridge.codedlinks.GuildInviteEmbedImpl
import com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbedImpl
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
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.chat.bridge.referral.ReferralEmbed
import com.discord.chat.bridge.rolecolors.RoleColors
import com.discord.chat.bridge.rolecolors.RoleColorsKt
import com.discord.chat.bridge.safetysystemnotification.SafetySystemNotificationEmbed
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.bridge.sticker.Sticker
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.threads.ThreadEmbed
import com.discord.chat.bridge.voiceinviteembed.VoiceInviteEmbed
import com.discord.chat.databinding.MessageViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.ChatListRelativeLayout
import com.discord.chat.presentation.list.FactoryCreatable
import com.discord.chat.presentation.list.MaskedShadowView
import com.discord.chat.presentation.list.SwipeReplyInitiator
import com.discord.chat.presentation.message.messagepart.ActivityInstanceEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.ActivityInviteEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.ActivityRichPresenceInviteEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.AppMessageEmbedAccessory
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
import com.discord.chat.presentation.message.messagepart.GuildProfileInviteMessageAccessory
import com.discord.chat.presentation.message.messagepart.InfoLinkMessageAccessory
import com.discord.chat.presentation.message.messagepart.InteractionStatusMessageAccessory
import com.discord.chat.presentation.message.messagepart.MediaMosaicAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageComponentsAccessory
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory
import com.discord.chat.presentation.message.messagepart.PostPreviewEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.ReactionsMessageAccessory
import com.discord.chat.presentation.message.messagepart.ReferralMessageAccessory
import com.discord.chat.presentation.message.messagepart.SafetyPolicyNoticeMessageAccessory
import com.discord.chat.presentation.message.messagepart.SafetySystemNotificationMessageAccessory
import com.discord.chat.presentation.message.messagepart.StickerMessageAccessory
import com.discord.chat.presentation.message.messagepart.SurveyIndicationMessageAccessory
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.VoiceInviteMessageAccessory
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
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function6

public class MessageView  public constructor(context: Context, attrs: AttributeSet? = null)
   : ChatListRelativeLayout,
   VerticalSpacingItemDecoration.SpacingProviderView,
   SpineParentMessage,
   SwipeReplyInitiator,
   FactoryCreatable {
   private final val binding: MessageViewBinding
   public final lateinit var replyPreview: MessageViewReplyPreview
   public final lateinit var threadStarterMessageHeaderView: ThreadStarterMessageHeaderView
   public open var shadowView: MaskedShadowView
   private final var messageId: MessageId?
   private final var onChainPart: () -> com.discord.chat.presentation.message.MessageView.ChainPart
   private final var allowChildGestures: Boolean
   public open var onInitiateReply: () -> Unit
   private final var onInitiateThread: () -> Unit
   public open var onInitiateEdit: () -> Unit
   public open var enableSwipeToReply: Boolean
   public open var enableSwipeToEdit: Boolean
   public open var usingGradientTheme: Boolean
   private final var accessories: ArrayList<MessageAccessory>

   public open val spineOriginView: View
      public open get() {
         val var1: SimpleDraweeView = this.binding.authorAvatar;
         kotlin.jvm.internal.r.g(this.binding.authorAvatar, "authorAvatar");
         return var1;
      }


   fun MessageView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      val var4: MessageViewBinding = MessageViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var4, "inflate(...)");
      this.binding = var4;
      this.setPadding(0, SizeUtilsKt.getDpToPx(2), 0, SizeUtilsKt.getDpToPx(2));
      RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
      var var3: TextView = var4.timestamp;
      kotlin.jvm.internal.r.g(var4.timestamp, "timestamp");
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryMedium);
      var4.timestamp.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      var3 = var4.timestamp;
      kotlin.jvm.internal.r.g(var4.timestamp, "timestamp");
      SetTextSizeSpKt.setTextSizeSp(var3, 12.0F, 15.0F);
      var3 = var4.authorName;
      kotlin.jvm.internal.r.g(var4.authorName, "authorName");
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimarySemibold);
      var3 = var4.authorName;
      kotlin.jvm.internal.r.g(var4.authorName, "authorName");
      SetTextSizeSpKt.setTextSizeSp(var3, 16.0F, 20.0F);
      val var8: SimpleDraweeView = var4.authorAvatar;
      kotlin.jvm.internal.r.g(var4.authorAvatar, "authorAvatar");
      ViewClippingUtilsKt.clipToCircle(var8);
      var4.messageHeaderDivider.setBackgroundColor(ColorUtilsKt.getThemeColor(var1, R.color.message_divider_light, R.color.message_divider_dark));
      this.setShadowView(var4.shadowView);
      this.getShadowView().setVisibility(4);
      this.setClipToPadding(false);
      this.onChainPart = new n0();
      this.allowChildGestures = true;
      this.onInitiateReply = new W();
      this.onInitiateThread = new X();
      this.onInitiateEdit = new Y();
      this.accessories = new ArrayList<>(2);
   }

   private fun configureAccessoriesMargin(items: List<MessageAccessory>) {
      val var7: Boolean = kotlin.collections.i.j0(var1) is MessageContentAccessory;
      val var11: Boolean;
      if (var1.size() <= 1 && var7) {
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

      val var13: Int;
      if (var7) {
         var13 = 0;
      } else {
         var13 = SizeUtilsKt.getDpToPx(8);
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
      if ((var9 as MarginLayoutParams).topMargin != var13 || (var9 as MarginLayoutParams).bottomMargin != var5) {
         var10.setMargins(var10.leftMargin, var13, var10.rightMargin, var5);
         this.binding.accessoriesView.setLayoutParams(var10);
      }
   }

   private fun configureAuthor(message: Message, eventHandler: ChatEventHandler, chainPart: com.discord.chat.presentation.message.MessageView.ChainPart) {
      if (var3 != MessageView.ChainPart.START && var3 != MessageView.ChainPart.ONLY) {
         this.hideHeader();
      } else {
         val var10: TextView = this.binding.authorName;
         this.binding.authorName.setText(var1.getUsername());
         kotlin.jvm.internal.r.e(var10);
         this.configureAuthorClickListeners(var10, var1, var2);
         var10.setTextColor(MessageKt.usernameColor$default(var1, 0, 1, null));
         MessageUtilsKt.clearOrSetRoleColors(var10, var1);
         val var11: RoleDotView = this.binding.roleDot;
         kotlin.jvm.internal.r.g(this.binding.roleDot, "roleDot");
         this.configureAuthorClickListeners(var11, var1, var2);
         this.binding.timestamp.setText(var1.getTimestamp());
         val var4: SimpleDraweeView = this.binding.authorAvatar;
         val var12: Context = this.binding.authorAvatar.getContext();
         kotlin.jvm.internal.r.g(var12, "getContext(...)");
         var4.setImageURI(MessageKt.avatarUrl(var1, var12));
         kotlin.jvm.internal.r.e(var4);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var4, false, new Z(var1, var2), 1, null);
         NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var4, false, new a0(var1, var2), 1, null);
         if (var1.getAvatarDecorationURL() != null) {
            val var13: SimpleDraweeView = this.binding.authorAvatarDecoration;
            kotlin.jvm.internal.r.g(this.binding.authorAvatarDecoration, "authorAvatarDecoration");
            var13.setVisibility(0);
            this.binding.authorAvatarDecoration.setImageURI(var1.getAvatarDecorationURL());
         } else {
            val var14: SimpleDraweeView = this.binding.authorAvatarDecoration;
            kotlin.jvm.internal.r.g(this.binding.authorAvatarDecoration, "authorAvatarDecoration");
            var14.setVisibility(8);
            this.binding.authorAvatarDecoration.setImageURI(null);
         }

         val var15: TextView = this.binding.timestamp;
         kotlin.jvm.internal.r.g(this.binding.timestamp, "timestamp");
         var15.setVisibility(0);
         val var16: TextView = this.binding.authorName;
         kotlin.jvm.internal.r.g(this.binding.authorName, "authorName");
         var16.setVisibility(0);
         val var17: SimpleDraweeView = this.binding.authorAvatar;
         kotlin.jvm.internal.r.g(this.binding.authorAvatar, "authorAvatar");
         var17.setVisibility(0);
         if (var1.getShouldShowRoleDot()) {
            val var18: RoleDotView = this.binding.roleDot;
            kotlin.jvm.internal.r.g(this.binding.roleDot, "roleDot");
            var18.setVisibility(0);
            val var5: RoleDotView = this.binding.roleDot;
            val var31: RoleColors = RoleColorsKt.toAndroidColors(var1.getRoleColors());
            var var19: RoleColors = var31;
            if (var31 == null) {
               var19 = new RoleColors(MessageKt.roleDotColor$default(var1, 0, 1, null), null, null, 6, null);
            }

            RoleDotView.configure$default(var5, var19, 0, 2, null);
         } else {
            val var20: RoleDotView = this.binding.roleDot;
            kotlin.jvm.internal.r.g(this.binding.roleDot, "roleDot");
            var20.setVisibility(8);
         }

         if (var1.getClanTag() != null && var1.getClanTagGuildId-qOKuAAo() != null) {
            ClanTagChipletView.configure-D0ylKIU$default(
               this.binding.clanTagChiplet, var1.getClanTag(), var1.getClanBadgeUrl(), var1.getClanTagGuildId-qOKuAAo().unbox-impl(), var2, 0.0F, 16, null
            );
            val var22: ClanTagChipletView = this.binding.clanTagChiplet;
            kotlin.jvm.internal.r.g(this.binding.clanTagChiplet, "clanTagChiplet");
            var22.setVisibility(0);
         } else {
            val var21: ClanTagChipletView = this.binding.clanTagChiplet;
            kotlin.jvm.internal.r.g(this.binding.clanTagChiplet, "clanTagChiplet");
            var21.setVisibility(8);
         }

         if (var1.getRoleIcon() != null) {
            this.binding.roleIcon.configureRoleIcon(var1.getRoleIcon(), var2);
            val var23: RoleIconView = this.binding.roleIcon;
            kotlin.jvm.internal.r.g(this.binding.roleIcon, "roleIcon");
            var23.setVisibility(0);
         } else {
            val var24: RoleIconView = this.binding.roleIcon;
            kotlin.jvm.internal.r.g(this.binding.roleIcon, "roleIcon");
            var24.setVisibility(8);
         }

         if (var1.getGameApplicationId() != null && var1.getTimestamp() != null) {
            this.binding.gameIcon.configureGameIcon(var1.getGameApplicationId(), var1.getTimestamp(), var2);
            val var26: GameIconView = this.binding.gameIcon;
            kotlin.jvm.internal.r.g(this.binding.gameIcon, "gameIcon");
            var26.setVisibility(0);
         } else {
            val var25: GameIconView = this.binding.gameIcon;
            kotlin.jvm.internal.r.g(this.binding.gameIcon, "gameIcon");
            var25.setVisibility(8);
         }

         if (var1.getConnectionsRoleTag() != null) {
            this.binding
               .connectionsRoleTag
               .configureConnectionsRoleTag-uESh2Cg(
                  var1.getAuthorId-wUX8bhU(), var1.getGuildId-qOKuAAo(), ChannelId.box-impl(var1.getChannelId-o4g7jtM()), var1.getConnectionsRoleTag(), var2
               );
            val var27: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
            kotlin.jvm.internal.r.g(this.binding.connectionsRoleTag, "connectionsRoleTag");
            var27.setVisibility(0);
         } else {
            val var28: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
            kotlin.jvm.internal.r.g(this.binding.connectionsRoleTag, "connectionsRoleTag");
            var28.setVisibility(8);
         }

         if (var1.getTagText() == null && var1.getOpTagText() == null) {
            val var8: MessageTagView = this.binding.messageTagView;
            kotlin.jvm.internal.r.g(this.binding.messageTagView, "messageTagView");
            var8.setVisibility(8);
            val var9: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
            kotlin.jvm.internal.r.g(this.binding.messageAltRemixTagView, "messageAltRemixTagView");
            var9.setVisibility(8);
         } else if (var1.getTagType() != null && kotlin.jvm.internal.r.c(var1.getTagType(), "f")) {
            val var30: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
            kotlin.jvm.internal.r.g(this.binding.messageAltRemixTagView, "messageAltRemixTagView");
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
            val var7: MessageTagView = this.binding.messageTagView;
            kotlin.jvm.internal.r.g(this.binding.messageTagView, "messageTagView");
            var7.setVisibility(8);
         } else {
            val var29: MessageTagView = this.binding.messageTagView;
            kotlin.jvm.internal.r.g(this.binding.messageTagView, "messageTagView");
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
            val var6: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
            kotlin.jvm.internal.r.g(this.binding.messageAltRemixTagView, "messageAltRemixTagView");
            var6.setVisibility(8);
         }
      }
   }

   @JvmStatic
   fun `configureAuthor$lambda$48$lambda$46`(var0: Message, var1: ChatEventHandler, var2: View) {
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onTapAvatar-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }
   }

   @JvmStatic
   fun `configureAuthor$lambda$48$lambda$47`(var0: Message, var1: ChatEventHandler, var2: View): Boolean {
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onLongPressAvatar-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }

      return true;
   }

   private fun View.configureAuthorClickListeners(message: Message, eventHandler: ChatEventHandler) {
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var1, false, new d0(var2, var3), 1, null);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var1, false, new e0(var2, var3), 1, null);
   }

   @JvmStatic
   fun `configureAuthorClickListeners$lambda$14`(var0: Message, var1: ChatEventHandler, var2: View) {
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onTapUsername-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }
   }

   @JvmStatic
   fun `configureAuthorClickListeners$lambda$15`(var0: Message, var1: ChatEventHandler, var2: View): Boolean {
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
      kotlin.jvm.internal.r.g(this.binding.guildCommunicationDisabledIcon, "guildCommunicationDisabledIcon");
      if (!var5) {
         var6 = 8;
      }

      var7.setVisibility(var6);
      val var8: SimpleDraweeView = this.binding.guildCommunicationDisabledIcon;
      kotlin.jvm.internal.r.g(this.binding.guildCommunicationDisabledIcon, "guildCommunicationDisabledIcon");
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
      kotlin.jvm.internal.r.g(this.binding.messageHeaderDivider, "messageHeaderDivider");
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
      kotlin.jvm.internal.r.g(this.binding.suppressNotificationsIcon, "suppressNotificationsIcon");
      val var5: Byte;
      if (var4) {
         var5 = 0;
      } else {
         var5 = 8;
      }

      var6.setVisibility(var5);
      if (var4) {
         val var7: SimpleDraweeView = this.binding.suppressNotificationsIcon;
         kotlin.jvm.internal.r.g(this.binding.suppressNotificationsIcon, "suppressNotificationsIcon");
         ReactAssetUtilsKt.setReactAsset(var7, ReactAsset.BellSnooze);
         val var8: SimpleDraweeView = this.binding.suppressNotificationsIcon;
         kotlin.jvm.internal.r.g(this.binding.suppressNotificationsIcon, "suppressNotificationsIcon");
         ColorUtilsKt.setTintColor(var8, ThemeManagerKt.getTheme().getInteractiveNormal());
      }

      val var9: SimpleDraweeView = this.binding.suppressNotificationsIcon;
      kotlin.jvm.internal.r.g(this.binding.suppressNotificationsIcon, "suppressNotificationsIcon");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var9, false, new m0(var2), 1, null);
   }

   @JvmStatic
   fun `configureSuppressNotifications$lambda$49`(var0: ChatEventHandler, var1: View) {
      var0.onTapSuppressNotificationsIcon();
   }

   private fun generateMessageAccessories(
      message: Message,
      messageContext: MessageContext,
      messageFrame: MessageFrame?,
      onLongClick: ((MessageId, ChannelId, Int?, MediaType?, String?, Int?) -> Unit)?
   ): List<MessageAccessory> {
      this.accessories.clear();
      var var11: Boolean;
      if (var1.getForwardInfo() != null) {
         var11 = true;
      } else {
         var11 = false;
      }

      if (var11) {
         this.accessories.add(new ForwardHeaderMessageAccessory(var1.getId-3Eiw7ao(), null));
      }

      val var18: Int = var1.getConstrainedWidth();
      val var5: Int;
      if (var18 != null) {
         var5 = var18;
      } else {
         var5 = this.getResources().getDisplayMetrics().widthPixels;
      }

      val var7: Int;
      if (var2.getUseAttachmentGridLayout()) {
         var7 = this.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_radius);
      } else {
         var7 = this.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_non_mosaic_radius);
      }

      val var66: StructurableText = var1.getContent();
      if (var66 != null && var66.getHasContent() && var1.getType() != MessageType.CUSTOM_GIFT) {
         val var20: ArrayList = this.accessories;
         val var19: java.lang.String = var1.getId-3Eiw7ao();
         val var67: StructurableText = var1.getContent();
         val var12: Boolean = MessageKt.shouldAnimateEmoji(var1);
         val var15: Boolean = MessageKt.shouldShowLinkDecorations(var1);
         val var14: Boolean = var1.getShouldShowRoleDot();
         val var13: Boolean = var1.getShouldShowRoleOnName();
         val var9: Int = this.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing);
         val var21: Int = var1.getLinkColor();
         val var8: Int;
         if (var21 != null) {
            var8 = var21;
         } else {
            var8 = ThemeManagerKt.getTheme().getTextLink();
         }

         val var114: DiscordFont = DiscordFont.PrimaryMedium;
         val var22: Context = this.getContext();
         kotlin.jvm.internal.r.g(var22, "getContext(...)");
         val var10: Int = MessageUtilsKt.getChatTextSizeSp(var22);
         val var119: MessageState = var1.getState();
         var var6: Int;
         if (var119 == null) {
            var6 = -1;
         } else {
            var6 = MessageView.WhenMappings.$EnumSwitchMapping$0[var119.ordinal()];
         }

         if (var6 != 1 && var6 != 2) {
            val var120: Int = var1.getTextColor();
            if (var120 != null) {
               var6 = var120;
            } else {
               var6 = ThemeManagerKt.getTheme().getTextNormal();
            }
         } else {
            var6 = ThemeManagerKt.getTheme().getTextMuted();
         }

         var20.add(
            new MessageContentAccessory(
               var19,
               var67,
               var12,
               var15,
               var14,
               var13,
               var9,
               var8,
               var6,
               var114,
               var10,
               false,
               var5,
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
         val var103: ArrayList = this.accessories;
         val var89: PollMessageAccessory.Companion = PollMessageAccessory.Companion;
         val var68: Context = this.getContext();
         kotlin.jvm.internal.r.g(var68, "getContext(...)");
         var103.add(var89.create(var68, var1, var1.getPollData()));
      }

      var var60: Int;
      if (var1.getAttachments() != null && var1.getPollData() == null && !MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.IS_COMPONENTS_V2)) {
         var var61: Boolean;
         label417: {
            val var69: java.util.List = var1.getAttachments();
            if (var69 == null || !var69.isEmpty()) {
               val var70: java.util.Iterator = var69.iterator();

               while (var70.hasNext()) {
                  if (kotlin.jvm.internal.r.c((var70.next() as Attachment).getObscure(), java.lang.Boolean.TRUE)) {
                     var61 = true;
                     break label417;
                  }
               }
            }

            var61 = false;
         }

         val var104: java.lang.Iterable = kotlin.collections.i.a1(var1.getAttachments());
         var var90: ArrayList = new ArrayList();
         val var71: ArrayList = new ArrayList();

         for (Object var121 : var104) {
            if (((var121 as A9.k).d() as Attachment).type() != AttachmentType.Image && ((var121 as A9.k).d() as Attachment).type() != AttachmentType.Video) {
               var71.add(var121);
            } else {
               var90.add(var121);
            }
         }

         val var72: Pair = new Pair(var90, var71);
         val var106: java.util.List = var72.a() as java.util.List;
         val var116: java.util.List = var72.b() as java.util.List;
         if (!var106.isEmpty() && var2.getUseAttachmentGridLayout()) {
            label347: {
               if (kotlin.jvm.internal.r.c(var1.isCurrentUserMessageAuthor(), java.lang.Boolean.TRUE)) {
                  val var91: java.lang.String = var1.getNonce-N_6c4I0();
                  var73 = var91;
                  if (var91 != null) {
                     break label347;
                  }
               }

               var73 = var1.getId-3Eiw7ao();
            }

            val var122: ArrayList = this.accessories;
            val var16: Long = var1.getChannelId-o4g7jtM();
            val var23: ArrayList = new ArrayList(kotlin.collections.i.v(var106, 10));

            for (A9.k var107 : var106) {
               var23.add(
                  CreateAttachmentAccessoryKt.createAttachmentAccessory(
                     var107.d() as Attachment,
                     var1,
                     var107.c(),
                     var5,
                     this.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius),
                     (var107.d() as Attachment).getVerifyAge()
                  )
               );
            }

            val var108: MessageState = var1.getState();
            var var93: MessageState = var108;
            if (var108 == null) {
               var93 = MessageState.Unknown;
            }

            val var109: java.lang.Boolean = var1.getGifAutoPlay();
            val var63: Boolean;
            if (var109 != null) {
               var63 = var109;
            } else {
               var63 = false;
            }

            var122.add(new MediaMosaicAttachmentMessageAccessory(var73, var16, var23, var5, var11, var93, var63, null));
         }

         val var74: ArrayList = this.accessories;

         for (A9.k var110 : var116) {
            var74.add(
               CreateAttachmentAccessoryKt.createAttachmentAccessory(
                  var110.d() as Attachment, var1, var110.c(), var5, var7, (var110.d() as Attachment).getVerifyAge()
               )
            );
         }

         var60 = var5;
         if (var61) {
            var90 = this.accessories;
            val var111: java.lang.String = var1.getId-3Eiw7ao();
            val var64: Long = var1.getChannelId-o4g7jtM();
            var var75: java.lang.String = var1.getObscureLearnMoreLabel();
            if (var75 == null) {
               var75 = "";
            }

            var90.add(new InfoLinkMessageAccessory(var111, var64, null, null, var75, ReactAsset.Info, null));
            var60 = var5;
         }
      } else {
         var60 = var5;
      }

      val var76: java.util.List = var1.getPostPreviewEmbeds();
      if (var76 != null) {
         val var77: java.util.Iterator = var76.iterator();

         for (int var55 = 0; var77.hasNext(); var55++) {
            val var96: Any = var77.next();
            if (var55 < 0) {
               kotlin.collections.i.u();
            }

            this.accessories
               .add(
                  new PostPreviewEmbedMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var96 as PostPreviewEmbed,
                     var55,
                     SpoilerAttributes.Companion.forMediaPostPreviewEmbed(var96 as PostPreviewEmbed, var1, var55, (var96 as PostPreviewEmbed).getVerifyAge()),
                     null
                  )
               );
         }
      }

      val var79: java.util.List = var1.getEmbeds();
      if (var79 != null) {
         val var112: java.util.Iterator = var79.iterator();

         for (int var56 = 0; var112.hasNext(); var56++) {
            var var80: StringBuilder = (StringBuilder)var112.next();
            if (var56 < 0) {
               kotlin.collections.i.u();
            }

            val var98: Embed = var80 as Embed;
            this.accessories
               .add(
                  new EmbedMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var56,
                     var1.getChannelId-o4g7jtM(),
                     var60,
                     var7,
                     var80 as Embed,
                     MessageKt.shouldAutoPlayGifs(var1),
                     MessageKt.shouldAnimateEmoji(var1),
                     MessageKt.shouldShowLinkDecorations(var1),
                     var1.getShouldShowRoleDot(),
                     var1.getShouldShowRoleOnName(),
                     SpoilerAttributes.Companion.forEmbed(var80 as Embed, var1, var56, (var80 as Embed).getVerifyAge()),
                     generateMessageAccessories$getLongClickListener(var4, var1, var56, MediaType.Embed),
                     var11,
                     null
                  )
               );
            if (var98.getObscureOrNull() != null) {
               val var123: ArrayList = this.accessories;
               val var117: java.lang.String = var1.getId-3Eiw7ao();
               val var65: Long = var1.getChannelId-o4g7jtM();
               var80 = var98.getId();
               if (var80 != null && !kotlin.text.h.c0((java.lang.CharSequence)var80)) {
                  var80 = var98.getId();
               } else {
                  var80 = new StringBuilder();
                  var80.append("index_");
                  var80.append(var56);
                  var80 = var80.toString();
               }

               var var99: java.lang.String = var1.getObscureLearnMoreLabel();
               if (var99 == null) {
                  var99 = "";
               }

               var123.add(new InfoLinkMessageAccessory(var117, var65, null, (java.lang.String)var80, var99, ReactAsset.Info, null));
            }
         }
      }

      val var30: java.util.List = var1.getGiftCodes();
      if (var30 != null) {
         val var31: java.util.Iterator = var30.iterator();

         for (int var57 = 0; var31.hasNext(); var57++) {
            val var84: Any = var31.next();
            if (var57 < 0) {
               kotlin.collections.i.u();
            }

            this.accessories.add(new GiftMessageAccessory(var1.getId-3Eiw7ao(), var57, var84 as GiftEmbed, null));
         }
      }

      val var33: GiftEmbed = var1.getReferralTrialOffer();
      if (var33 != null) {
         this.accessories.add(new GiftMessageAccessory(var1.getId-3Eiw7ao(), 0, var33, null));
      }

      val var34: ReferralEmbed = var1.getReferralTrialOfferInfo();
      if (var34 != null) {
         this.accessories.add(new ReferralMessageAccessory(var1.getId-3Eiw7ao(), var34, null));
      }

      val var35: ActivityInstanceEmbed = var1.getActivityInstanceEmbed();
      if (var35 != null) {
         this.accessories.add(new ActivityInstanceEmbedMessageAccessory(var1.getId-3Eiw7ao(), var35, var60, null));
      }

      val var36: java.util.List = var1.getCodedLinks();
      if (var36 != null) {
         val var86: java.util.Iterator = var36.iterator();

         for (int var58 = 0; var86.hasNext(); var58++) {
            var var37: Any = var86.next();
            if (var58 < 0) {
               kotlin.collections.i.u();
            }

            var37 = var37 as CodedLinkEmbed;
            if (var37 as CodedLinkEmbed != null) {
               val var100: ArrayList = this.accessories;
               if (var37 is GuildEventInviteEmbedImpl) {
                  var37 = new GuildEventInviteMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var58,
                     var37 as GuildEventInviteEmbedImpl,
                     MessageKt.shouldAnimateEmoji(var1),
                     MessageKt.shouldShowLinkDecorations(var1),
                     var1.getShouldShowRoleDot(),
                     var1.getShouldShowRoleDot(),
                     null
                  );
               } else if (var37 is GuildInviteDisabledEmbedImpl) {
                  var37 = new GuildInviteDisabledMessageAccessory(var1.getId-3Eiw7ao(), var58, var37 as GuildInviteDisabledEmbedImpl, null);
               } else if (var37 is GuildInviteEmbedImpl) {
                  var37 = new GuildInviteMessageAccessory(var1.getId-3Eiw7ao(), var58, var37 as GuildInviteEmbedImpl, null);
               } else if (var37 is AppMessageEmbedImpl) {
                  var37 = new AppMessageEmbedAccessory(var1.getId-3Eiw7ao(), var58, var37 as AppMessageEmbedImpl, var60, null);
               } else if (var37 is EmbeddedActivityInviteEmbedImpl) {
                  var37 = new EmbeddedActivityInviteMessageAccessory(var1.getId-3Eiw7ao(), var58, var37 as EmbeddedActivityInviteEmbedImpl, var60, null);
               } else {
                  if (var37 !is GuildProfileInviteEmbedImpl) {
                     throw new z9.n();
                  }

                  var37 = new GuildProfileInviteMessageAccessory(var1.getId-3Eiw7ao(), var58, var37 as GuildProfileInviteEmbedImpl, null);
               }

               var100.add(var37);
            }
         }
      }

      val var42: java.util.List = var1.getStickers();
      if (var42 != null) {
         for (Sticker var43 : var42) {
            this.accessories.add(new StickerMessageAccessory(var1.getId-3Eiw7ao(), var43, null));
         }
      }

      if (var1.getComponents() != null) {
         this.accessories.add(new MessageComponentsAccessory(var1.getId-3Eiw7ao(), var1, var1.getComponents(), var60, null));
      }

      val var45: java.util.List = var1.getReactions();
      if (var45 != null && var45.isEmpty() xor true && !var1.isFirstForumPostMessage() || var3 is MessageFrameMediaViewer) {
         val var46: java.util.List = var1.getEmbeds();
         val var47: java.lang.String;
         if (var46 != null && !var46.isEmpty()) {
            var47 = "embed";
         } else {
            var47 = "shortcut";
         }

         val var113: ArrayList = this.accessories;
         val var118: java.lang.String = var1.getId-3Eiw7ao();
         val var101: java.util.List = var1.getReactions();
         var var88: java.util.List = var101;
         if (var101 == null) {
            var88 = kotlin.collections.i.k();
         }

         var11 = var2.getCanAddNewReactions();
         val var24: java.lang.String = var2.getAddReactionLabel();
         val var125: java.lang.String = var2.getAddNewReactionAccessibilityLabel();
         val var124: ReactionsTheme = var2.getReactionsTheme();
         val var102: Int;
         if (kotlin.jvm.internal.r.c(var47, "embed")) {
            var102 = 0;
         } else {
            var102 = null;
         }

         var113.add(new ReactionsMessageAccessory(var118, var88, var11, var24, var125, var124, null, var47, var102, 64, null));
      }

      val var48: ActivityInviteEmbed = var1.getActivityInviteEmbed();
      if (var48 != null) {
         this.accessories.add(new ActivityInviteEmbedMessageAccessory(var1.getId-3Eiw7ao(), var48, null));
      }

      val var49: ActivityRichPresenceInviteEmbed = var1.getActivityRichPresenceInviteEmbed();
      if (var49 != null) {
         this.accessories.add(new ActivityRichPresenceInviteEmbedMessageAccessory(var1.getId-3Eiw7ao(), var49, null));
      }

      val var50: ThreadEmbed = var1.getThreadEmbed();
      if (var50 != null) {
         this.accessories.add(new ThreadEmbedMessageAccessory(var1.getId-3Eiw7ao(), var50, null));
      }

      val var51: InteractionStatus = var1.getInteractionStatus();
      if (var51 != null) {
         this.accessories.add(new InteractionStatusMessageAccessory(var1.getId-3Eiw7ao(), var51, null));
      }

      val var52: CtaButton = var1.getCtaButton();
      if (var52 != null) {
         this.accessories.add(new CtaButtonMessageAccessory(var1.getChannelId-o4g7jtM(), var1.getId-3Eiw7ao(), var52, null));
      }

      val var53: EphemeralIndication = var1.getEphemeralIndication();
      if (var53 != null) {
         this.accessories.add(new EphemeralIndicationMessageAccessory(var1.getId-3Eiw7ao(), var53, null));
      }

      val var54: SurveyIndication = var1.getSurveyIndication();
      if (var54 != null) {
         this.accessories.add(new SurveyIndicationMessageAccessory(var1.getId-3Eiw7ao(), var54, null));
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

      val var25: SafetyPolicyNoticeEmbed = var1.getSafetyPolicyNoticeEmbed();
      if (var25 != null) {
         this.accessories.add(new SafetyPolicyNoticeMessageAccessory(var1.getId-3Eiw7ao(), var25, null));
      }

      val var26: SafetySystemNotificationEmbed = var1.getSafetySystemNotificationEmbed();
      if (var26 != null) {
         this.accessories.add(new SafetySystemNotificationMessageAccessory(var1.getId-3Eiw7ao(), var26, null));
      }

      val var27: VoiceInviteEmbed = var1.getVoiceChannelInviteEmbed();
      if (var27 != null) {
         this.accessories.add(new VoiceInviteMessageAccessory(var1.getId-3Eiw7ao(), var27, null));
      }

      val var28: ForwardInfo = var1.getForwardInfo();
      if (var28 != null && var28.getFooterInfo() != null) {
         this.accessories.add(new ForwardBreadcrumbMessageAccessory(var1.getId-3Eiw7ao(), var1.getChannelId-o4g7jtM(), var1.getForwardInfo(), null));
      }

      if (var1.getForwardInfo() != null) {
         kotlin.collections.i.z(this.accessories, new l0(new k0()));
      }

      return this.accessories;
   }

   @JvmStatic
   fun `generateMessageAccessories$getLongClickListener`(var0: Function6, var1: Message, var2: Int, var3: MediaType): OnLongClickListener {
      val var4: b0;
      if (var0 != null) {
         var4 = new b0(var0, var1, var2, var3);
      } else {
         var4 = null;
      }

      return var4;
   }

   @JvmStatic
   fun `generateMessageAccessories$getLongClickListener$lambda$17$lambda$16`(var0: Function6, var1: Message, var2: Int, var3: MediaType, var4: View): Boolean {
      var0.invoke(MessageId.box-impl(var1.getId-3Eiw7ao()), ChannelId.box-impl(var1.getChannelId-o4g7jtM()), var2, var3, null, null);
      return true;
   }

   @JvmStatic
   fun `generateMessageAccessories$lambda$43`(var0: MessageAccessory, var1: MessageAccessory): Int {
      val var2: Byte;
      if (!var0.isForwardInner() && var1.isForwardInner()) {
         var2 = 1;
      } else if (var0.isForwardInner() && !var1.isForwardInner()) {
         var2 = -1;
      } else {
         var2 = 0;
      }

      return var2;
   }

   @JvmStatic
   fun `generateMessageAccessories$lambda$44`(var0: Function2, var1: Any, var2: Any): Int {
      return (var0.invoke(var1, var2) as java.lang.Number).intValue();
   }

   private fun hideHeader() {
      var var1: TextView = this.binding.timestamp;
      kotlin.jvm.internal.r.g(this.binding.timestamp, "timestamp");
      var1.setVisibility(8);
      var1 = this.binding.authorName;
      kotlin.jvm.internal.r.g(this.binding.authorName, "authorName");
      var1.setVisibility(8);
      val var3: SimpleDraweeView = this.binding.authorAvatar;
      kotlin.jvm.internal.r.g(this.binding.authorAvatar, "authorAvatar");
      var3.setVisibility(8);
      val var4: SimpleDraweeView = this.binding.authorAvatarDecoration;
      kotlin.jvm.internal.r.g(this.binding.authorAvatarDecoration, "authorAvatarDecoration");
      var4.setVisibility(8);
      val var5: RoleDotView = this.binding.roleDot;
      kotlin.jvm.internal.r.g(this.binding.roleDot, "roleDot");
      var5.setVisibility(8);
      val var6: ClanTagChipletView = this.binding.clanTagChiplet;
      kotlin.jvm.internal.r.g(this.binding.clanTagChiplet, "clanTagChiplet");
      var6.setVisibility(8);
      val var7: RoleIconView = this.binding.roleIcon;
      kotlin.jvm.internal.r.g(this.binding.roleIcon, "roleIcon");
      var7.setVisibility(8);
      val var8: GameIconView = this.binding.gameIcon;
      kotlin.jvm.internal.r.g(this.binding.gameIcon, "gameIcon");
      var8.setVisibility(8);
      val var9: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
      kotlin.jvm.internal.r.g(this.binding.connectionsRoleTag, "connectionsRoleTag");
      var9.setVisibility(8);
      val var10: MessageTagView = this.binding.messageTagView;
      kotlin.jvm.internal.r.g(this.binding.messageTagView, "messageTagView");
      var10.setVisibility(8);
      val var11: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
      kotlin.jvm.internal.r.g(this.binding.messageAltRemixTagView, "messageAltRemixTagView");
      var11.setVisibility(8);
      val var12: SimpleDraweeView = this.binding.suppressNotificationsIcon;
      kotlin.jvm.internal.r.g(this.binding.suppressNotificationsIcon, "suppressNotificationsIcon");
      var12.setVisibility(8);
   }

   private fun initReplyView() {
      val var1: View = this.binding.replyPreviewView.inflate();
      kotlin.jvm.internal.r.f(var1, "null cannot be cast to non-null type com.discord.chat.presentation.message.MessageViewReplyPreview");
      this.setReplyPreview(var1 as MessageViewReplyPreview);
   }

   private fun initThreadStarterMessageHeaderView() {
      val var1: View = this.binding.threadStarterHeaderView.inflate();
      kotlin.jvm.internal.r.f(var1, "null cannot be cast to non-null type com.discord.chat.presentation.message.ThreadStarterMessageHeaderView");
      this.setThreadStarterMessageHeaderView(var1 as ThreadStarterMessageHeaderView);
   }

   @JvmStatic
   fun `onChainPart$lambda$0`(): MessageView.ChainPart {
      return MessageView.ChainPart.ONLY;
   }

   @JvmStatic
   fun `onInitiateEdit$lambda$3`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `onInitiateReply$lambda$1`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `onInitiateThread$lambda$2`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `setMessage$lambda$11$lambda$10`(var0: Function2, var1: Message, var2: View) {
      var0.invoke(MessageId.box-impl(var1.getId-3Eiw7ao()), ChannelId.box-impl(var1.getChannelId-o4g7jtM()));
   }

   @JvmStatic
   fun `setMessage$lambda$13$lambda$12`(var0: Function6, var1: Message, var2: View): Boolean {
      var0.invoke(MessageId.box-impl(var1.getId-3Eiw7ao()), ChannelId.box-impl(var1.getChannelId-o4g7jtM()), null, null, null, null);
      return true;
   }

   @JvmStatic
   fun `setMessage$lambda$4`(): MessageView.ChainPart {
      return MessageView.ChainPart.ONLY;
   }

   @JvmStatic
   fun `setMessage$lambda$5`(var0: ChatEventHandler, var1: Message): Unit {
      ChatEventHandler.DefaultImpls.onInitiateReply-8a0ehIg$default(var0, var1.getId-3Eiw7ao(), var1.getChannelId-o4g7jtM(), null, null, 12, null);
      return Unit.a;
   }

   @JvmStatic
   fun `setMessage$lambda$6`(var0: ChatEventHandler, var1: Message): Unit {
      var0.onInitiateThread-pfaIj0E(var1.getId-3Eiw7ao(), var1.getChannelId-o4g7jtM());
      return Unit.a;
   }

   @JvmStatic
   fun `setMessage$lambda$7`(var0: ChatEventHandler, var1: Message): Unit {
      var0.onInitiateEdit-pfaIj0E(var1.getId-3Eiw7ao(), var1.getChannelId-o4g7jtM());
      return Unit.a;
   }

   @JvmStatic
   fun `setMessage$lambda$9`(var0: ChatEventHandler, var1: Message): Unit {
      var0.onTapMessageReply-0eiqbug(var1.getChannelId-o4g7jtM(), var1.getId-3Eiw7ao());
      return Unit.a;
   }

   public override fun onFactoryCreate() {
      this.initReplyView();
      this.initThreadStarterMessageHeaderView();
   }

   public open fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
      kotlin.jvm.internal.r.h(var1, "ev");
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
      kotlin.jvm.internal.r.h(var1, "recycledViewPool");
      this.binding.accessoriesView.setRecycledViewPool(var1);
   }

   public fun setMessage(
      message: Message,
      messageContext: MessageContext,
      messageFrame: MessageFrame? = null,
      eventHandler: ChatEventHandler = ChatEventHandler.Empty.INSTANCE,
      componentProvider: ComponentProvider? = null,
      onChainPart: () -> com.discord.chat.presentation.message.MessageView.ChainPart = new c0(),
      allowChildGestures: Boolean = true,
      renderContentOnly: Boolean = false
   ) {
      kotlin.jvm.internal.r.h(var1, "message");
      kotlin.jvm.internal.r.h(var2, "messageContext");
      kotlin.jvm.internal.r.h(var4, "eventHandler");
      kotlin.jvm.internal.r.h(var6, "onChainPart");
      this.bindKey(MessageId.box-impl(var1.getId-3Eiw7ao()));
      val var15: java.lang.String = this.messageId;
      val var14: java.lang.String = var1.getId-3Eiw7ao();
      val var10: Boolean;
      if (var15 == null) {
         var10 = false;
      } else {
         var10 = MessageId.equals-impl0(var15, var14);
      }

      this.messageId = var1.getId-3Eiw7ao();
      var var28: j0 = null;
      if (!var10 && var2.getContextType() === MessageContextType.SEARCH) {
         MessageAccessoriesView.clear$default(this.binding.accessoriesView, false, 1, null);
      }

      this.onChainPart = var6;
      this.setOnInitiateReply(new V(var4, var1));
      this.onInitiateThread = new f0(var4, var1);
      this.setOnInitiateEdit(new g0(var4, var1));
      this.setEnableSwipeToReply(var2.getEnableSwipeToReply());
      this.setEnableSwipeToEdit(var2.getEnableSwipeToEdit());
      this.setUsingGradientTheme(var2.getUsingGradientTheme());
      this.allowChildGestures = var7;
      val var29: MessageView.ChainPart = var6.invoke() as MessageView.ChainPart;
      val var20: Int = var1.getTimestampColor();
      if (var20 != null) {
         this.binding.timestamp.setTextColor(var20.intValue());
      }

      if (var3 != null && var3 !is UnknownMessageFrame) {
         val var22: MessageFrameHeaderView = this.binding.messageFrameHeader;
         kotlin.jvm.internal.r.g(this.binding.messageFrameHeader, "messageFrameHeader");
         var22.setVisibility(0);
         this.binding.messageFrameHeader.configure(var3);
      } else {
         val var21: MessageFrameHeaderView = this.binding.messageFrameHeader;
         kotlin.jvm.internal.r.g(this.binding.messageFrameHeader, "messageFrameHeader");
         var21.setVisibility(8);
      }

      this.configureDivider(var2.getShowDivider());
      val var16: java.lang.String = var1.getThreadStarterMessageHeader();
      if (var16 != null) {
         if (this.threadStarterMessageHeaderView == null) {
            this.initThreadStarterMessageHeaderView();
         }

         val var23: ThreadStarterMessageHeaderView = this.getThreadStarterMessageHeaderView();
         if (var1.getReferencedMessage() != null) {
            var7 = true;
         } else {
            var7 = false;
         }

         var23.configure(var16, var7);
      } else if (this.threadStarterMessageHeaderView != null) {
         this.getThreadStarterMessageHeaderView().setVisibility(8);
      }

      if (var1.getReferencedMessage() != null) {
         if (this.replyPreview == null) {
            this.initReplyView();
         }

         MessageViewReplyPreview.configureReply$default(this.getReplyPreview(), var1.getReferencedMessage(), false, new h0(var4, var1), 2, null);
      } else if (var1.getExecutedCommand() != null) {
         if (this.replyPreview == null) {
            this.initReplyView();
         }

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
      } else if (this.replyPreview != null) {
         this.getReplyPreview().clear();
      }

      val var24: Function2 = var4.getOnMessageTapped();
      val var25: i0;
      if (var24 != null) {
         var25 = new i0(var24, var1);
      } else {
         var25 = null;
      }

      val var30: Function6 = var4.getOnMessageLongPressed();
      if (var30 != null) {
         var28 = new j0(var30, var1);
      }

      NestedScrollOnTouchUtilsKt.setOnClickListenerNested(this, true, var25);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested(this, true, var28);
      val var31: java.util.List = this.generateMessageAccessories(var1, var2, var3, var4.getOnMessageLongPressed());
      val var19: MessageAccessoriesView = this.binding.accessoriesView;
      val var18: java.lang.String = var1.getId-3Eiw7ao();
      val var12: Long = var1.getChannelId-o4g7jtM();
      val var17: GuildId = var1.getGuildId-qOKuAAo();
      if (var1.getForwardInfo() != null) {
         var7 = true;
      } else {
         var7 = false;
      }

      var19.setAccessories-mFdI1tY(var18, var12, var17, var31, var4, var5, var2, var8, var7);
      this.configureAccessoriesMargin(var31);
      this.configureCommunicationDisabled(kotlin.jvm.internal.r.c(var1.getCommunicationDisabled(), java.lang.Boolean.TRUE), var29);
      this.configureSuppressNotifications(MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.SUPPRESS_NOTIFICATIONS), var4, var29);
      if (var2.getContextType() === MessageContextType.SEARCH) {
         this.hideHeader();
      } else {
         this.configureAuthor(var1, var4, var29);
      }

      androidx.core.view.Z.o0(this, new MessageViewAccessibilityDelegate(var1, var25, var28));
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
            throw new z9.n();
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
         $ENTRIES = H9.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }
}
