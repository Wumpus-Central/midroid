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
import androidx.core.view.a0
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
import com.discord.chat.presentation.message.messagepart.ActivityBookmarkMessageAccessory
import com.discord.chat.presentation.message.messagepart.ActivityInstanceEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.ActivityInviteEmbedMessageAccessory
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
      this.onInitiateThread = <unrepresentable>.INSTANCE;
      this.onInitiateEdit = <unrepresentable>.INSTANCE;
      this.accessories = new ArrayList<>(2);
   }

   private fun configureAccessibilityDelegate(
      message: Message,
      accessories: List<MessageAccessory>,
      onClick: OnClickListener?,
      messageLongPress: OnLongClickListener?
   ) {
      if (var2 == null || !var2.isEmpty()) {
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
                     a0.p0(this.this$0, new MessageViewAccessibilityDelegate(this.$message, var1, this.$onClick, this.$messageLongPress));
                  }
               });
               return;
            }
         }
      }

      a0.p0(this, new MessageViewAccessibilityDelegate(var1, null, var3, var4));
   }

   private fun configureAccessoriesMargin(items: List<MessageAccessory>) {
      val var7: Boolean = kotlin.collections.i.h0(var1) is MessageContentAccessory;
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
      kotlin.jvm.internal.q.f(var9, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
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
         kotlin.jvm.internal.q.e(var10);
         this.configureAuthorClickListeners(var10, var1, var2);
         var10.setTextColor(MessageKt.usernameColor$default(var1, 0, 1, null));
         MessageUtilsKt.clearOrSetRoleColors(var10, var1);
         val var11: RoleDotView = this.binding.roleDot;
         kotlin.jvm.internal.q.g(this.binding.roleDot, "roleDot");
         this.configureAuthorClickListeners(var11, var1, var2);
         this.binding.timestamp.setText(var1.getTimestamp());
         val var12: SimpleDraweeView = this.binding.authorAvatar;
         val var4: Context = this.binding.authorAvatar.getContext();
         kotlin.jvm.internal.q.g(var4, "getContext(...)");
         var12.setImageURI(MessageKt.avatarUrl(var1, var4));
         kotlin.jvm.internal.q.e(var12);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var12, false, new v(var1, var2), 1, null);
         NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var12, false, new w(var1, var2), 1, null);
         if (var1.getAvatarDecorationURL() != null) {
            val var13: SimpleDraweeView = this.binding.authorAvatarDecoration;
            kotlin.jvm.internal.q.g(this.binding.authorAvatarDecoration, "authorAvatarDecoration");
            var13.setVisibility(0);
            this.binding.authorAvatarDecoration.setImageURI(var1.getAvatarDecorationURL());
         } else {
            val var14: SimpleDraweeView = this.binding.authorAvatarDecoration;
            kotlin.jvm.internal.q.g(this.binding.authorAvatarDecoration, "authorAvatarDecoration");
            var14.setVisibility(8);
            this.binding.authorAvatarDecoration.setImageURI(null);
         }

         val var15: TextView = this.binding.timestamp;
         kotlin.jvm.internal.q.g(this.binding.timestamp, "timestamp");
         var15.setVisibility(0);
         val var16: TextView = this.binding.authorName;
         kotlin.jvm.internal.q.g(this.binding.authorName, "authorName");
         var16.setVisibility(0);
         val var17: SimpleDraweeView = this.binding.authorAvatar;
         kotlin.jvm.internal.q.g(this.binding.authorAvatar, "authorAvatar");
         var17.setVisibility(0);
         if (var1.getShouldShowRoleDot()) {
            val var18: RoleDotView = this.binding.roleDot;
            kotlin.jvm.internal.q.g(this.binding.roleDot, "roleDot");
            var18.setVisibility(0);
            val var5: RoleDotView = this.binding.roleDot;
            kotlin.jvm.internal.q.g(this.binding.roleDot, "roleDot");
            val var32: RoleColors = RoleColorsKt.toAndroidColors(var1.getRoleColors());
            var var19: RoleColors = var32;
            if (var32 == null) {
               var19 = new RoleColors(MessageKt.roleDotColor$default(var1, 0, 1, null), null, null, 6, null);
            }

            RoleDotView.configure$default(var5, var19, 0, 2, null);
         } else {
            val var20: RoleDotView = this.binding.roleDot;
            kotlin.jvm.internal.q.g(this.binding.roleDot, "roleDot");
            var20.setVisibility(8);
         }

         if (var1.getClanTag() != null && var1.getClanTagGuildId-qOKuAAo() != null) {
            val var22: ClanTagChipletView = this.binding.clanTagChiplet;
            kotlin.jvm.internal.q.g(this.binding.clanTagChiplet, "clanTagChiplet");
            ClanTagChipletView.configure-D0ylKIU$default(
               var22, var1.getClanTag(), var1.getClanBadgeUrl(), var1.getClanTagGuildId-qOKuAAo().unbox-impl(), var2, 0.0F, 16, null
            );
            val var23: ClanTagChipletView = this.binding.clanTagChiplet;
            kotlin.jvm.internal.q.g(this.binding.clanTagChiplet, "clanTagChiplet");
            var23.setVisibility(0);
         } else {
            val var21: ClanTagChipletView = this.binding.clanTagChiplet;
            kotlin.jvm.internal.q.g(this.binding.clanTagChiplet, "clanTagChiplet");
            var21.setVisibility(8);
         }

         if (var1.getRoleIcon() != null) {
            this.binding.roleIcon.configureRoleIcon(var1.getRoleIcon(), var2);
            val var24: RoleIconView = this.binding.roleIcon;
            kotlin.jvm.internal.q.g(this.binding.roleIcon, "roleIcon");
            var24.setVisibility(0);
         } else {
            val var25: RoleIconView = this.binding.roleIcon;
            kotlin.jvm.internal.q.g(this.binding.roleIcon, "roleIcon");
            var25.setVisibility(8);
         }

         if (var1.getGameApplicationId() != null && var1.getTimestamp() != null) {
            this.binding.gameIcon.configureGameIcon(var1.getGameApplicationId(), var1.getTimestamp(), var2);
            val var27: GameIconView = this.binding.gameIcon;
            kotlin.jvm.internal.q.g(this.binding.gameIcon, "gameIcon");
            var27.setVisibility(0);
         } else {
            val var26: GameIconView = this.binding.gameIcon;
            kotlin.jvm.internal.q.g(this.binding.gameIcon, "gameIcon");
            var26.setVisibility(8);
         }

         if (var1.getConnectionsRoleTag() != null) {
            this.binding
               .connectionsRoleTag
               .configureConnectionsRoleTag-uESh2Cg(
                  var1.getAuthorId-wUX8bhU(), var1.getGuildId-qOKuAAo(), ChannelId.box-impl(var1.getChannelId-o4g7jtM()), var1.getConnectionsRoleTag(), var2
               );
            val var28: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
            kotlin.jvm.internal.q.g(this.binding.connectionsRoleTag, "connectionsRoleTag");
            var28.setVisibility(0);
         } else {
            val var29: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
            kotlin.jvm.internal.q.g(this.binding.connectionsRoleTag, "connectionsRoleTag");
            var29.setVisibility(8);
         }

         if (var1.getTagText() == null && var1.getOpTagText() == null) {
            val var8: MessageTagView = this.binding.messageTagView;
            kotlin.jvm.internal.q.g(this.binding.messageTagView, "messageTagView");
            var8.setVisibility(8);
            val var9: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
            kotlin.jvm.internal.q.g(this.binding.messageAltRemixTagView, "messageAltRemixTagView");
            var9.setVisibility(8);
         } else if (var1.getTagType() != null && kotlin.jvm.internal.q.c(var1.getTagType(), "f")) {
            val var31: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
            kotlin.jvm.internal.q.g(this.binding.messageAltRemixTagView, "messageAltRemixTagView");
            var31.setVisibility(0);
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
            kotlin.jvm.internal.q.g(this.binding.messageTagView, "messageTagView");
            var7.setVisibility(8);
         } else {
            val var30: MessageTagView = this.binding.messageTagView;
            kotlin.jvm.internal.q.g(this.binding.messageTagView, "messageTagView");
            var30.setVisibility(0);
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
            kotlin.jvm.internal.q.g(this.binding.messageAltRemixTagView, "messageAltRemixTagView");
            var6.setVisibility(8);
         }
      }
   }

   @JvmStatic
   fun `configureAuthor$lambda$40$lambda$38`(var0: Message, var1: ChatEventHandler, var2: View) {
      kotlin.jvm.internal.q.h(var0, "$message");
      kotlin.jvm.internal.q.h(var1, "$eventHandler");
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onTapAvatar-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }
   }

   @JvmStatic
   fun `configureAuthor$lambda$40$lambda$39`(var0: Message, var1: ChatEventHandler, var2: View): Boolean {
      kotlin.jvm.internal.q.h(var0, "$message");
      kotlin.jvm.internal.q.h(var1, "$eventHandler");
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onLongPressAvatar-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }

      return true;
   }

   private fun View.configureAuthorClickListeners(message: Message, eventHandler: ChatEventHandler) {
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var1, false, new y(var2, var3), 1, null);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var1, false, new z(var2, var3), 1, null);
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
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var9, false, new u(var2), 1, null);
   }

   @JvmStatic
   fun `configureSuppressNotifications$lambda$41`(var0: ChatEventHandler, var1: View) {
      kotlin.jvm.internal.q.h(var0, "$eventHandler");
      var0.onTapSuppressNotificationsIcon();
   }

   private fun generateMessageAccessories(
      message: Message,
      messageContext: MessageContext,
      messageFrame: MessageFrame?,
      onLongClick: ((MessageId, ChannelId, Int?, MediaType?, String?, Int?) -> Unit)?,
      chainPart: com.discord.chat.presentation.message.MessageView.ChainPart
   ): List<MessageAccessory> {
      this.accessories.clear();
      var var12: Boolean;
      if (var1.getForwardInfo() != null) {
         var12 = true;
      } else {
         var12 = false;
      }

      if (var12) {
         this.accessories.add(new ForwardHeaderMessageAccessory(var1.getId-3Eiw7ao(), null));
      }

      var var21: Int = var1.getConstrainedWidth();
      val var6: Int;
      if (var21 != null) {
         var6 = var21;
      } else {
         var6 = this.getResources().getDisplayMetrics().widthPixels;
      }

      val var8: Int;
      if (var2.getUseAttachmentGridLayout()) {
         var8 = this.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_radius);
      } else {
         var8 = this.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_non_mosaic_radius);
      }

      val var84: StructurableText = var1.getContent();
      if (var84 != null && var84.getHasContent() && var1.getType() != MessageType.CUSTOM_GIFT) {
         val var22: ArrayList = this.accessories;
         val var85: java.lang.String = var1.getId-3Eiw7ao();
         val var23: StructurableText = var1.getContent();
         val var15: Boolean = MessageKt.shouldAnimateEmoji(var1);
         val var14: Boolean = MessageKt.shouldShowLinkDecorations(var1);
         val var13: Boolean = var1.getShouldShowRoleDot();
         val var16: Boolean = var1.getShouldShowRoleOnName();
         val var10: Int = this.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing);
         val var24: Int = var1.getLinkColor();
         val var9: Int;
         if (var24 != null) {
            var9 = var24;
         } else {
            var9 = ThemeManagerKt.getTheme().getTextLink();
         }

         val var138: DiscordFont = DiscordFont.PrimaryMedium;
         val var25: Context = this.getContext();
         kotlin.jvm.internal.q.g(var25, "getContext(...)");
         val var11: Int = MessageUtilsKt.getChatTextSizeSp(var25);
         val var144: MessageState = var1.getState();
         var var7: Int;
         if (var144 == null) {
            var7 = -1;
         } else {
            var7 = MessageView.WhenMappings.$EnumSwitchMapping$0[var144.ordinal()];
         }

         if (var7 != 1 && var7 != 2) {
            val var145: Int = var1.getTextColor();
            if (var145 != null) {
               var7 = var145;
            } else {
               var7 = ThemeManagerKt.getTheme().getTextNormal();
            }
         } else {
            var7 = ThemeManagerKt.getTheme().getTextMuted();
         }

         var22.add(
            new MessageContentAccessory(
               var85,
               var23,
               var15,
               var14,
               var13,
               var16,
               var10,
               var9,
               var7,
               var138,
               var11,
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
         val var126: ArrayList = this.accessories;
         val var86: PollMessageAccessory.Companion = PollMessageAccessory.Companion;
         val var112: Context = this.getContext();
         kotlin.jvm.internal.q.g(var112, "getContext(...)");
         var126.add(var86.create(var112, var1, var1.getPollData()));
      }

      var var72: Int;
      if (var1.getAttachments() != null && var1.getPollData() == null && !MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.IS_COMPONENTS_V2)) {
         var var75: Boolean;
         label552: {
            val var87: java.util.List = var1.getAttachments();
            if (var87 == null || !var87.isEmpty()) {
               val var88: java.util.Iterator = var87.iterator();

               while (var88.hasNext()) {
                  if (kotlin.jvm.internal.q.c((var88.next() as Attachment).getObscure(), java.lang.Boolean.TRUE)) {
                     var75 = true;
                     break label552;
                  }
               }
            }

            var75 = false;
         }

         val var127: java.lang.Iterable = kotlin.collections.i.X0(var1.getAttachments());
         var var113: ArrayList = new ArrayList();
         val var89: ArrayList = new ArrayList();

         for (Object var146 : var127) {
            if (((var146 as n8.k).d() as Attachment).type() != AttachmentType.Image && ((var146 as n8.k).d() as Attachment).type() != AttachmentType.Video) {
               var89.add(var146);
            } else {
               var113.add(var146);
            }
         }

         val var90: Pair = new Pair(var113, var89);
         val var129: java.util.List = var90.a() as java.util.List;
         val var140: java.util.List = var90.b() as java.util.List;
         if (!var129.isEmpty() && var2.getUseAttachmentGridLayout()) {
            label473: {
               if (kotlin.jvm.internal.q.c(var1.isCurrentUserMessageAuthor(), java.lang.Boolean.TRUE)) {
                  val var114: java.lang.String = var1.getNonce-N_6c4I0();
                  var91 = var114;
                  if (var114 != null) {
                     break label473;
                  }
               }

               var91 = var1.getId-3Eiw7ao();
            }

            val var147: ArrayList = this.accessories;
            val var19: Long = var1.getChannelId-o4g7jtM();
            val var26: ArrayList = new ArrayList(kotlin.collections.i.v(var129, 10));

            for (n8.k var115 : var129) {
               var26.add(
                  CreateAttachmentAccessoryKt.createAttachmentAccessory(
                     var115.d() as Attachment,
                     var1,
                     var115.c(),
                     var6,
                     this.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius),
                     (var115.d() as Attachment).getVerifyAge()
                  )
               );
            }

            val var131: MessageState = var1.getState();
            var var116: MessageState = var131;
            if (var131 == null) {
               var116 = MessageState.Unknown;
            }

            val var132: java.lang.Boolean = var1.getGifAutoPlay();
            val var77: Boolean;
            if (var132 != null) {
               var77 = var132;
            } else {
               var77 = false;
            }

            var147.add(new MediaMosaicAttachmentMessageAccessory(var91, var19, var26, var6, var12, var116, var77, null));
         }

         val var92: ArrayList = this.accessories;

         for (n8.k var117 : var140) {
            var92.add(
               CreateAttachmentAccessoryKt.createAttachmentAccessory(
                  var117.d() as Attachment, var1, var117.c(), var6, var8, (var117.d() as Attachment).getVerifyAge()
               )
            );
         }

         var72 = var6;
         if (var75) {
            var113 = this.accessories;
            val var134: java.lang.String = var1.getId-3Eiw7ao();
            val var82: Long = var1.getChannelId-o4g7jtM();
            var var93: java.lang.String = var1.getObscureLearnMoreLabel();
            if (var93 == null) {
               var93 = "";
            }

            var113.add(new InfoLinkMessageAccessory(var134, var82, null, null, var93, ReactAsset.Info, null));
            var72 = var6;
         }
      } else {
         var72 = var6;
      }

      val var94: java.util.List = var1.getPostPreviewEmbeds();
      if (var94 != null) {
         val var95: java.util.Iterator = var94.iterator();

         for (int var64 = 0; var95.hasNext(); var64++) {
            val var119: Any = var95.next();
            if (var64 < 0) {
               kotlin.collections.i.u();
            }

            this.accessories
               .add(
                  new PostPreviewEmbedMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var119 as PostPreviewEmbed,
                     var64,
                     SpoilerAttributes.Companion.forMediaPostPreviewEmbed(var119 as PostPreviewEmbed, var1, var64, (var119 as PostPreviewEmbed).getVerifyAge()),
                     null
                  )
               );
         }
      }

      val var97: java.util.List = var1.getEmbeds();
      if (var97 != null) {
         val var135: java.util.Iterator = var97.iterator();

         for (int var65 = 0; var135.hasNext(); var65++) {
            var var98: StringBuilder = (StringBuilder)var135.next();
            if (var65 < 0) {
               kotlin.collections.i.u();
            }

            val var121: Embed = var98 as Embed;
            this.accessories
               .add(
                  new EmbedMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var65,
                     var1.getChannelId-o4g7jtM(),
                     var72,
                     var8,
                     var98 as Embed,
                     MessageKt.shouldAutoPlayGifs(var1),
                     MessageKt.shouldAnimateEmoji(var1),
                     MessageKt.shouldShowLinkDecorations(var1),
                     var1.getShouldShowRoleDot(),
                     var1.getShouldShowRoleOnName(),
                     SpoilerAttributes.Companion.forEmbed(var98 as Embed, var1, var65, (var98 as Embed).getVerifyAge()),
                     generateMessageAccessories$getLongClickListener(var4, var1, var65, MediaType.Embed),
                     var12,
                     null
                  )
               );
            if (var121.getObscureOrNull() != null) {
               val var148: ArrayList = this.accessories;
               val var141: java.lang.String = var1.getId-3Eiw7ao();
               val var83: Long = var1.getChannelId-o4g7jtM();
               var98 = var121.getId();
               if (var98 != null && !kotlin.text.h.d0((java.lang.CharSequence)var98)) {
                  var98 = var121.getId();
               } else {
                  var98 = new StringBuilder();
                  var98.append("index_");
                  var98.append(var65);
                  var98 = var98.toString();
               }

               var var122: java.lang.String = var1.getObscureLearnMoreLabel();
               if (var122 == null) {
                  var122 = "";
               }

               var148.add(new InfoLinkMessageAccessory(var141, var83, null, (java.lang.String)var98, var122, ReactAsset.Info, null));
            }
         }
      }

      val var33: java.util.List = var1.getGiftCodes();
      if (var33 != null) {
         val var34: java.util.Iterator = var33.iterator();

         for (int var66 = 0; var34.hasNext(); var66++) {
            val var102: Any = var34.next();
            if (var66 < 0) {
               kotlin.collections.i.u();
            }

            this.accessories.add(new GiftMessageAccessory(var1.getId-3Eiw7ao(), var66, var102 as GiftEmbed, null));
         }
      }

      val var36: GiftEmbed = var1.getReferralTrialOffer();
      if (var36 != null) {
         this.accessories.add(new GiftMessageAccessory(var1.getId-3Eiw7ao(), 0, var36, null));
      }

      val var37: ReferralEmbed = var1.getReferralTrialOfferInfo();
      if (var37 != null) {
         this.accessories.add(new ReferralMessageAccessory(var1.getId-3Eiw7ao(), var37, null));
      }

      val var38: java.util.List = var1.getProgress();
      if (var38 != null) {
         val var39: java.util.Iterator = var38.iterator();

         for (int var67 = 0; var39.hasNext(); var67++) {
            val var104: Any = var39.next();
            if (var67 < 0) {
               kotlin.collections.i.u();
            }

            this.accessories.add(new UploadProgressMessageAccessory(var1.getId-3Eiw7ao(), var67, var104 as UploadProgress, null));
         }
      }

      val var41: ActivityInstanceEmbed = var1.getActivityInstanceEmbed();
      if (var41 != null) {
         this.accessories.add(new ActivityInstanceEmbedMessageAccessory(var1.getId-3Eiw7ao(), var41, var72, null));
      }

      val var42: java.util.List = var1.getCodedLinks();
      if (var42 != null) {
         val var106: java.util.Iterator = var42.iterator();

         for (int var68 = 0; var106.hasNext(); var68++) {
            var var43: Any = var106.next();
            if (var68 < 0) {
               kotlin.collections.i.u();
            }

            var43 = var43 as CodedLinkEmbed;
            if (var43 as CodedLinkEmbed != null) {
               val var123: ArrayList = this.accessories;
               if (var43 is GuildEventInviteEmbedImpl) {
                  var43 = new GuildEventInviteMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var68,
                     var43 as GuildEventInviteEmbedImpl,
                     MessageKt.shouldAnimateEmoji(var1),
                     MessageKt.shouldShowLinkDecorations(var1),
                     var1.getShouldShowRoleDot(),
                     var1.getShouldShowRoleDot(),
                     null
                  );
               } else if (var43 is GuildInviteDisabledEmbedImpl) {
                  var43 = new GuildInviteDisabledMessageAccessory(var1.getId-3Eiw7ao(), var68, var43 as GuildInviteDisabledEmbedImpl, null);
               } else if (var43 is GuildInviteEmbedImpl) {
                  var43 = new GuildInviteMessageAccessory(var1.getId-3Eiw7ao(), var68, var43 as GuildInviteEmbedImpl, null);
               } else if (var43 is ActivityBookmarkEmbedImpl) {
                  var43 = new ActivityBookmarkMessageAccessory(var1.getId-3Eiw7ao(), var68, var43 as ActivityBookmarkEmbedImpl, var72, null);
               } else if (var43 is AppMessageEmbedImpl) {
                  var43 = new AppMessageEmbedAccessory(var1.getId-3Eiw7ao(), var68, var43 as AppMessageEmbedImpl, var72, null);
               } else if (var43 is EmbeddedActivityInviteEmbedImpl) {
                  var43 = new EmbeddedActivityInviteMessageAccessory(var1.getId-3Eiw7ao(), var68, var43 as EmbeddedActivityInviteEmbedImpl, var72, null);
               } else {
                  if (var43 !is GuildProfileInviteEmbedImpl) {
                     throw new m8.p();
                  }

                  var43 = new GuildProfileInviteMessageAccessory(var1.getId-3Eiw7ao(), var68, var43 as GuildProfileInviteEmbedImpl, null);
               }

               var123.add(var43);
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
         this.accessories.add(new MessageComponentsAccessory(var1.getId-3Eiw7ao(), var1, var1.getComponents(), var72, null));
      }

      var var73: Boolean;
      if (!var1.getShowReplyShortcut() && !var1.getShowForwardShortcut() && !var1.getShowReactionShortcut() && !var1.getShowThreadShortcut()) {
         var73 = false;
      } else {
         var73 = true;
      }

      val var51: java.util.List = var1.getReactions();
      var var69: Boolean;
      if (var51 != null && var51.isEmpty() xor true) {
         var69 = true;
      } else {
         var69 = false;
      }

      if (!var69 && !var73) {
         var73 = false;
      } else {
         var73 = true;
      }

      if (var5 != MessageView.ChainPart.ONLY && var5 != MessageView.ChainPart.END && !var69 && var1.isAnnouncementChannel()) {
         var69 = false;
      } else {
         var69 = true;
      }

      if (var73 && !var1.isFirstForumPostMessage() || var3 is MessageFrameMediaViewer) {
         var var52: java.lang.String = "shortcut";
         if (var69) {
            var52 = "shortcut";
            if (var1.getShowForwardShortcut()) {
               var52 = "shortcut";
               if (var1.getAttachments() != null) {
                  val var53: java.lang.Iterable = kotlin.collections.i.X0(var1.getAttachments());
                  val var124: ArrayList = new ArrayList();
                  val var108: ArrayList = new ArrayList();

                  for (Object var54 : var53) {
                     if (((var54 as n8.k).d() as Attachment).type() != AttachmentType.Image
                        && ((var54 as n8.k).d() as Attachment).type() != AttachmentType.Video) {
                        var108.add(var54);
                     } else {
                        var124.add(var54);
                     }
                  }

                  var52 = "shortcut";
                  if (!(new Pair(var124, var108).a() as java.util.List).isEmpty()) {
                     var52 = "media";
                  }
               }
            }
         }

         val var109: java.util.List = var1.getEmbeds();
         var var63: java.lang.String = var52;
         if (var109 != null) {
            if (var109.isEmpty()) {
               var63 = var52;
            } else {
               var63 = "embed";
            }
         }

         val var137: ArrayList = this.accessories;
         val var125: java.lang.String = var1.getId-3Eiw7ao();
         val var110: java.util.List = var1.getReactions();
         var var55: java.util.List = var110;
         if (var110 == null) {
            var55 = kotlin.collections.i.k();
         }

         val var81: Boolean = var2.getCanAddNewReactions();
         val var17: Boolean = var2.getUseAddBurstReaction();
         val var27: java.lang.String = var2.getAddReactionLabel();
         val var149: java.lang.String = var2.getAddNewReactionAccessibilityLabel();
         val var143: java.lang.String = var2.getAddNewBurstReactionAccessibilityLabel();
         val var150: ReactionsTheme = var2.getReactionsTheme();
         if (var69 && var1.getShowReactionShortcut()) {
            var12 = true;
         } else {
            var12 = false;
         }

         val var78: Boolean;
         if (var69 && var1.getShowReplyShortcut()) {
            var78 = true;
         } else {
            var78 = false;
         }

         val var79: Boolean;
         if (var69 && var1.getShowForwardShortcut()) {
            var79 = true;
         } else {
            var79 = false;
         }

         val var80: Boolean;
         if (var69 && var1.getShowThreadShortcut()) {
            var80 = true;
         } else {
            var80 = false;
         }

         val var18: Boolean = var1.getShortcutsEnabled();
         if (kotlin.jvm.internal.q.c(var63, "embed")) {
            var21 = 0;
         } else {
            var21 = null;
         }

         var137.add(
            new ReactionsMessageAccessory(
               var125,
               var55,
               var81,
               var17,
               var27,
               var149,
               var143,
               var150,
               null,
               var12,
               var78,
               var79,
               var80,
               var18,
               var63,
               var21,
               var2.getReplyAccessibilityLabel(),
               var2.getForwardAccessibilityLabel(),
               var2.getThreadAccessibilityLabel(),
               256,
               null
            )
         );
      }

      val var56: ActivityInviteEmbed = var1.getActivityInviteEmbed();
      if (var56 != null) {
         this.accessories.add(new ActivityInviteEmbedMessageAccessory(var1.getId-3Eiw7ao(), var56, null));
      }

      val var57: ThreadEmbed = var1.getThreadEmbed();
      if (var57 != null) {
         this.accessories.add(new ThreadEmbedMessageAccessory(var1.getId-3Eiw7ao(), var57, null));
      }

      val var58: InteractionStatus = var1.getInteractionStatus();
      if (var58 != null) {
         this.accessories.add(new InteractionStatusMessageAccessory(var1.getId-3Eiw7ao(), var58, null));
      }

      val var59: CtaButton = var1.getCtaButton();
      if (var59 != null) {
         this.accessories.add(new CtaButtonMessageAccessory(var1.getChannelId-o4g7jtM(), var1.getId-3Eiw7ao(), var59, null));
      }

      val var60: EphemeralIndication = var1.getEphemeralIndication();
      if (var60 != null) {
         this.accessories.add(new EphemeralIndicationMessageAccessory(var1.getId-3Eiw7ao(), var60, null));
      }

      val var61: SurveyIndication = var1.getSurveyIndication();
      if (var61 != null) {
         this.accessories.add(new SurveyIndicationMessageAccessory(var1.getId-3Eiw7ao(), var61, null));
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
         kotlin.collections.i.z(this.accessories, new t(<unrepresentable>.INSTANCE));
      }

      return this.accessories;
   }

   @JvmStatic
   fun `generateMessageAccessories$getLongClickListener`(var0: Function6, var1: Message, var2: Int, var3: MediaType): OnLongClickListener {
      val var4: x;
      if (var0 != null) {
         var4 = new x(var0, var1, var2, var3);
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
   fun `generateMessageAccessories$lambda$36`(var0: Function2, var1: Any, var2: Any): Int {
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

   private fun initReplyView() {
      val var1: View = this.binding.replyPreviewView.inflate();
      kotlin.jvm.internal.q.f(var1, "null cannot be cast to non-null type com.discord.chat.presentation.message.MessageViewReplyPreview");
      this.setReplyPreview(var1 as MessageViewReplyPreview);
   }

   private fun initThreadStarterMessageHeaderView() {
      val var1: View = this.binding.threadStarterHeaderView.inflate();
      kotlin.jvm.internal.q.f(var1, "null cannot be cast to non-null type com.discord.chat.presentation.message.ThreadStarterMessageHeaderView");
      this.setThreadStarterMessageHeaderView(var1 as ThreadStarterMessageHeaderView);
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

   public override fun onFactoryCreate() {
      this.initReplyView();
      this.initThreadStarterMessageHeaderView();
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
      renderContentOnly: Boolean = false
   ) {
      kotlin.jvm.internal.q.h(var1, "message");
      kotlin.jvm.internal.q.h(var2, "messageContext");
      kotlin.jvm.internal.q.h(var4, "eventHandler");
      kotlin.jvm.internal.q.h(var6, "onChainPart");
      this.bindKey(MessageId.box-impl(var1.getId-3Eiw7ao()));
      val var14: java.lang.String = this.messageId;
      val var13: java.lang.String = var1.getId-3Eiw7ao();
      val var10: Boolean;
      if (var14 == null) {
         var10 = false;
      } else {
         var10 = MessageId.equals-impl0(var14, var13);
      }

      this.messageId = var1.getId-3Eiw7ao();
      var var27: s = null;
      if (!var10 && var2.getContextType() === MessageContextType.SEARCH) {
         val var28: MessageAccessoriesView = this.binding.accessoriesView;
         kotlin.jvm.internal.q.g(this.binding.accessoriesView, "accessoriesView");
         MessageAccessoriesView.clear$default(var28, false, 1, null);
      }

      this.onChainPart = var6;
      this.setOnInitiateReply(
         new Function0(var4, var1) {
            final ChatEventHandler $eventHandler;
            final Message $message;

            {
               super(0);
               this.$eventHandler = var1;
               this.$message = var2;
            }

            public final void invoke() {
               ChatEventHandler.DefaultImpls.onInitiateReply-8a0ehIg$default(
                  this.$eventHandler, this.$message.getId-3Eiw7ao(), this.$message.getChannelId-o4g7jtM(), null, null, 12, null
               );
            }
         }
      );
      this.onInitiateThread = new Function0(var4, var1) {
         final ChatEventHandler $eventHandler;
         final Message $message;

         {
            super(0);
            this.$eventHandler = var1;
            this.$message = var2;
         }

         public final void invoke() {
            this.$eventHandler.onInitiateThread-pfaIj0E(this.$message.getId-3Eiw7ao(), this.$message.getChannelId-o4g7jtM());
         }
      };
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
      val var29: MessageView.ChainPart = var6.invoke() as MessageView.ChainPart;
      val var19: Int = var1.getTimestampColor();
      if (var19 != null) {
         this.binding.timestamp.setTextColor(var19.intValue());
      }

      if (var3 != null && var3 !is UnknownMessageFrame) {
         val var21: MessageFrameHeaderView = this.binding.messageFrameHeader;
         kotlin.jvm.internal.q.g(this.binding.messageFrameHeader, "messageFrameHeader");
         var21.setVisibility(0);
         this.binding.messageFrameHeader.configure(var3);
      } else {
         val var20: MessageFrameHeaderView = this.binding.messageFrameHeader;
         kotlin.jvm.internal.q.g(this.binding.messageFrameHeader, "messageFrameHeader");
         var20.setVisibility(8);
      }

      if (var2.getContextType() === MessageContextType.SEARCH) {
         this.hideHeader();
      } else {
         this.configureAuthor(var1, var4, var29);
      }

      this.configureDivider(var2.getShowDivider());
      var var15: java.lang.String = var1.getThreadStarterMessageHeader();
      if (var15 != null) {
         if (this.threadStarterMessageHeaderView == null) {
            this.initThreadStarterMessageHeaderView();
         }

         val var22: ThreadStarterMessageHeaderView = this.getThreadStarterMessageHeaderView();
         if (var1.getReferencedMessage() != null) {
            var7 = true;
         } else {
            var7 = false;
         }

         var22.configure(var15, var7);
      } else if (this.threadStarterMessageHeaderView != null) {
         this.getThreadStarterMessageHeaderView().setVisibility(8);
      }

      if (var1.getReferencedMessage() != null) {
         if (this.replyPreview == null) {
            this.initReplyView();
         }

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

      val var23: Function2 = var4.getOnMessageTapped();
      val var24: r;
      if (var23 != null) {
         var24 = new r(var23, var1);
      } else {
         var24 = null;
      }

      val var30: Function6 = var4.getOnMessageLongPressed();
      if (var30 != null) {
         var27 = new s(var30, var1);
      }

      NestedScrollOnTouchUtilsKt.setOnClickListenerNested(this, true, var24);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested(this, true, var27);
      val var18: java.util.List = this.generateMessageAccessories(var1, var2, var3, var4.getOnMessageLongPressed(), var29);
      val var17: MessageAccessoriesView = this.binding.accessoriesView;
      var15 = var1.getId-3Eiw7ao();
      val var11: Long = var1.getChannelId-o4g7jtM();
      val var16: GuildId = var1.getGuildId-qOKuAAo();
      if (var1.getForwardInfo() != null) {
         var7 = true;
      } else {
         var7 = false;
      }

      var17.setAccessories-mFdI1tY(var15, var11, var16, var18, var4, var5, var2, var8, var7);
      this.configureAccessoriesMargin(var18);
      this.configureCommunicationDisabled(kotlin.jvm.internal.q.c(var1.getCommunicationDisabled(), java.lang.Boolean.TRUE), var29);
      this.configureSuppressNotifications(MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.SUPPRESS_NOTIFICATIONS), var4, var29);
      this.configureAccessibilityDelegate(var1, this.accessories, var24, var27);
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
            throw new m8.p();
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
         $ENTRIES = u8.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }
}
