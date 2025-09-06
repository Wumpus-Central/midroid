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
import com.discord.chat.presentation.message.messagepart.SharedCustomThemeMessageAccessory
import com.discord.chat.presentation.message.messagepart.StickerMessageAccessory
import com.discord.chat.presentation.message.messagepart.SurveyIndicationMessageAccessory
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory
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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nMessageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageView.kt\ncom/discord/chat/presentation/message/MessageView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,1005:1\n257#2,2:1006\n257#2,2:1008\n257#2,2:1010\n257#2,2:1012\n257#2,2:1048\n257#2,2:1050\n257#2,2:1052\n257#2,2:1054\n257#2,2:1056\n257#2,2:1058\n257#2,2:1060\n257#2,2:1062\n257#2,2:1064\n257#2,2:1066\n257#2,2:1068\n257#2,2:1070\n257#2,2:1072\n257#2,2:1074\n257#2,2:1076\n257#2,2:1078\n257#2,2:1080\n257#2,2:1082\n257#2,2:1084\n257#2,2:1086\n257#2,2:1088\n257#2,2:1090\n257#2,2:1092\n257#2,2:1094\n257#2,2:1096\n257#2,2:1098\n257#2,2:1100\n257#2,2:1102\n257#2,2:1104\n257#2,2:1106\n257#2,2:1108\n257#2,2:1110\n257#2,2:1112\n257#2,2:1122\n257#2,2:1124\n1755#3,3:1014\n3193#3,10:1017\n1557#3:1027\n1628#3,3:1028\n1628#3,3:1031\n1872#3,3:1034\n1872#3,3:1037\n1872#3,3:1040\n1872#3,3:1043\n1863#3,2:1046\n199#4,8:1114\n*S KotlinDebug\n*F\n+ 1 MessageView.kt\ncom/discord/chat/presentation/message/MessageView\n*L\n244#1:1006,2\n248#1:1008,2\n266#1:1010,2\n366#1:1012,2\n811#1:1048,2\n814#1:1050,2\n817#1:1052,2\n818#1:1054,2\n819#1:1056,2\n822#1:1058,2\n825#1:1060,2\n830#1:1062,2\n832#1:1064,2\n837#1:1066,2\n839#1:1068,2\n844#1:1070,2\n846#1:1072,2\n857#1:1074,2\n859#1:1076,2\n866#1:1078,2\n876#1:1080,2\n879#1:1082,2\n892#1:1084,2\n895#1:1086,2\n896#1:1088,2\n904#1:1090,2\n905#1:1092,2\n906#1:1094,2\n907#1:1096,2\n908#1:1098,2\n909#1:1100,2\n910#1:1102,2\n911#1:1104,2\n912#1:1106,2\n913#1:1108,2\n914#1:1110,2\n915#1:1112,2\n959#1:1122,2\n977#1:1124,2\n460#1:1014,3\n462#1:1017,10\n474#1:1027\n474#1:1028,3\n490#1:1031,3\n514#1:1034,3\n530#1:1037,3\n564#1:1040,3\n603#1:1043,3\n660#1:1046,2\n944#1:1114,8\n*E\n"])
public class MessageView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListRelativeLayout(var1, var2),
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
         return var1;
      }


   fun MessageView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var4: MessageViewBinding = MessageViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var4;
      this.setPadding(0, SizeUtilsKt.getDpToPx(2), 0, SizeUtilsKt.getDpToPx(2));
      RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
      var var3: TextView = var4.timestamp;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryMedium);
      var4.timestamp.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      var3 = var4.timestamp;
      SetTextSizeSpKt.setTextSizeSp(var3, 12.0F, 15.0F);
      var3 = var4.authorName;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimarySemibold);
      var3 = var4.authorName;
      SetTextSizeSpKt.setTextSizeSp(var3, 16.0F, 20.0F);
      val var8: SimpleDraweeView = var4.authorAvatar;
      ViewClippingUtilsKt.clipToCircle(var8);
      var4.messageHeaderDivider.setBackgroundColor(ColorUtilsKt.getThemeColor(var1, R.color.message_divider_light, R.color.message_divider_dark));
      this.setShadowView(var4.shadowView);
      this.getShadowView().setVisibility(4);
      this.setClipToPadding(false);
      this.onChainPart = new W();
      this.allowChildGestures = true;
      this.onInitiateReply = new X();
      this.onInitiateThread = new Y();
      this.onInitiateEdit = new Z();
      this.accessories = new ArrayList<>(2);
   }

   private fun configureAccessoriesMargin(items: List<MessageAccessory>) {
      val var7: Boolean = CollectionsKt.firstOrNull(var1) is MessageContentAccessory;
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
         this.configureAuthorClickListeners(var10, var1, var2);
         var10.setTextColor(MessageKt.usernameColor$default(var1, 0, 1, null));
         MessageUtilsKt.clearOrSetRoleColors(var10, var1);
         val var11: RoleDotView = this.binding.roleDot;
         this.configureAuthorClickListeners(var11, var1, var2);
         this.binding.timestamp.setText(var1.getTimestamp());
         val var4: SimpleDraweeView = this.binding.authorAvatar;
         val var12: Context = this.binding.authorAvatar.getContext();
         var4.setImageURI(MessageKt.avatarUrl(var1, var12));
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var4, false, new a0(var1, var2), 1, null);
         NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var4, false, new b0(var1, var2), 1, null);
         if (var1.getAvatarDecorationURL() != null) {
            val var13: SimpleDraweeView = this.binding.authorAvatarDecoration;
            var13.setVisibility(0);
            this.binding.authorAvatarDecoration.setImageURI(var1.getAvatarDecorationURL());
         } else {
            val var14: SimpleDraweeView = this.binding.authorAvatarDecoration;
            var14.setVisibility(8);
            this.binding.authorAvatarDecoration.setImageURI(null);
         }

         val var15: TextView = this.binding.timestamp;
         var15.setVisibility(0);
         val var16: TextView = this.binding.authorName;
         var16.setVisibility(0);
         val var17: SimpleDraweeView = this.binding.authorAvatar;
         var17.setVisibility(0);
         if (var1.getShouldShowRoleDot()) {
            val var18: RoleDotView = this.binding.roleDot;
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
            var20.setVisibility(8);
         }

         if (var1.getClanTag() != null && var1.getClanTagGuildId-qOKuAAo() != null) {
            ClanTagChipletView.configure-D0ylKIU$default(
               this.binding.clanTagChiplet, var1.getClanTag(), var1.getClanBadgeUrl(), var1.getClanTagGuildId-qOKuAAo().unbox-impl(), var2, 0.0F, 16, null
            );
            val var22: ClanTagChipletView = this.binding.clanTagChiplet;
            var22.setVisibility(0);
         } else {
            val var21: ClanTagChipletView = this.binding.clanTagChiplet;
            var21.setVisibility(8);
         }

         if (var1.getRoleIcon() != null) {
            this.binding.roleIcon.configureRoleIcon(var1.getRoleIcon(), var2);
            val var23: RoleIconView = this.binding.roleIcon;
            var23.setVisibility(0);
         } else {
            val var24: RoleIconView = this.binding.roleIcon;
            var24.setVisibility(8);
         }

         if (var1.getGameApplicationId() != null && var1.getTimestamp() != null) {
            this.binding.gameIcon.configureGameIcon(var1.getGameApplicationId(), var1.getTimestamp(), var2);
            val var26: GameIconView = this.binding.gameIcon;
            var26.setVisibility(0);
         } else {
            val var25: GameIconView = this.binding.gameIcon;
            var25.setVisibility(8);
         }

         if (var1.getConnectionsRoleTag() != null) {
            this.binding
               .connectionsRoleTag
               .configureConnectionsRoleTag-uESh2Cg(
                  var1.getAuthorId-wUX8bhU(), var1.getGuildId-qOKuAAo(), ChannelId.box-impl(var1.getChannelId-o4g7jtM()), var1.getConnectionsRoleTag(), var2
               );
            val var27: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
            var27.setVisibility(0);
         } else {
            val var28: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
            var28.setVisibility(8);
         }

         if (var1.getTagText() == null && var1.getOpTagText() == null) {
            val var8: MessageTagView = this.binding.messageTagView;
            var8.setVisibility(8);
            val var9: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
            var9.setVisibility(8);
         } else if (var1.getTagType() != null && var1.getTagType() == "f") {
            val var30: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
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
            var7.setVisibility(8);
         } else {
            val var29: MessageTagView = this.binding.messageTagView;
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
            var6.setVisibility(8);
         }
      }
   }

   @JvmStatic
   fun `configureAuthor$lambda$49$lambda$47`(var0: Message, var1: ChatEventHandler, var2: View) {
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onTapAvatar-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }
   }

   @JvmStatic
   fun `configureAuthor$lambda$49$lambda$48`(var0: Message, var1: ChatEventHandler, var2: View): Boolean {
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onLongPressAvatar-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }

      return true;
   }

   private fun View.configureAuthorClickListeners(message: Message, eventHandler: ChatEventHandler) {
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var1, false, new e0(var2, var3), 1, null);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var1, false, new f0(var2, var3), 1, null);
   }

   @JvmStatic
   fun `configureAuthorClickListeners$lambda$16`(var0: Message, var1: ChatEventHandler, var2: View) {
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onTapUsername-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }
   }

   @JvmStatic
   fun `configureAuthorClickListeners$lambda$17`(var0: Message, var1: ChatEventHandler, var2: View): Boolean {
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
      if (!var5) {
         var6 = 8;
      }

      var7.setVisibility(var6);
      val var8: SimpleDraweeView = this.binding.guildCommunicationDisabledIcon;
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
      val var5: Byte;
      if (var4) {
         var5 = 0;
      } else {
         var5 = 8;
      }

      var6.setVisibility(var5);
      if (var4) {
         val var7: SimpleDraweeView = this.binding.suppressNotificationsIcon;
         ReactAssetUtilsKt.setReactAsset(var7, ReactAsset.BellSnooze);
         val var8: SimpleDraweeView = this.binding.suppressNotificationsIcon;
         ColorUtilsKt.setTintColor(var8, ThemeManagerKt.getTheme().getInteractiveNormal());
      }

      val var9: SimpleDraweeView = this.binding.suppressNotificationsIcon;
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var9, false, new o0(var2), 1, null);
   }

   @JvmStatic
   fun `configureSuppressNotifications$lambda$50`(var0: ChatEventHandler, var1: View) {
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

      val var65: StructurableText = var1.getContent();
      if (var65 != null && var65.getHasContent() && var1.getType() != MessageType.CUSTOM_GIFT) {
         val var66: ArrayList = this.accessories;
         val var20: java.lang.String = var1.getId-3Eiw7ao();
         val var19: StructurableText = var1.getContent();
         val var12: Boolean = MessageKt.shouldAnimateEmoji(var1);
         val var13: Boolean = MessageKt.shouldShowLinkDecorations(var1);
         val var15: Boolean = var1.getShouldShowRoleDot();
         val var14: Boolean = var1.getShouldShowRoleOnName();
         val var9: Int = this.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing);
         val var21: Int = var1.getLinkColor();
         val var8: Int;
         if (var21 != null) {
            var8 = var21;
         } else {
            var8 = ThemeManagerKt.getTheme().getTextLink();
         }

         val var113: DiscordFont = DiscordFont.PrimaryMedium;
         val var22: Context = this.getContext();
         val var10: Int = MessageUtilsKt.getChatTextSizeSp(var22);
         val var118: MessageState = var1.getState();
         var var6: Int;
         if (var118 == null) {
            var6 = -1;
         } else {
            var6 = MessageView.WhenMappings.$EnumSwitchMapping$0[var118.ordinal()];
         }

         if (var6 != 1 && var6 != 2) {
            val var119: Int = var1.getTextColor();
            if (var119 != null) {
               var6 = var119;
            } else {
               var6 = ThemeManagerKt.getTheme().getTextNormal();
            }
         } else {
            var6 = ThemeManagerKt.getTheme().getTextMuted();
         }

         var66.add(
            new MessageContentAccessory(
               var20,
               var19,
               var12,
               var13,
               var15,
               var14,
               var9,
               var8,
               var6,
               var113,
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
         val var102: ArrayList = this.accessories;
         val var67: PollMessageAccessory.Companion = PollMessageAccessory.Companion;
         val var88: Context = this.getContext();
         var102.add(var67.create(var88, var1, var1.getPollData()));
      }

      if (var1.getSharedClientTheme() != null) {
         this.accessories.add(SharedCustomThemeMessageAccessory.Companion.create(var1, var1.getSharedClientTheme()));
      }

      var var59: Int;
      if (var1.getAttachments() != null && var1.getPollData() == null && !MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.IS_COMPONENTS_V2)) {
         var var60: Boolean;
         label417: {
            val var68: java.util.List = var1.getAttachments();
            if (var68 == null || !var68.isEmpty()) {
               val var69: java.util.Iterator = var68.iterator();

               while (var69.hasNext()) {
                  if ((var69.next() as Attachment).getObscure() == java.lang.Boolean.TRUE) {
                     var60 = true;
                     break label417;
                  }
               }
            }

            var60 = false;
         }

         val var103: java.lang.Iterable = CollectionsKt.Z0(var1.getAttachments());
         val var70: ArrayList = new ArrayList();
         var var89: ArrayList = new ArrayList();

         for (Object var114 : var103) {
            if (((var114 as IndexedValue).d() as Attachment).type() != AttachmentType.Image
               && ((var114 as IndexedValue).d() as Attachment).type() != AttachmentType.Video) {
               var89.add(var114);
            } else {
               var70.add(var114);
            }
         }

         val var71: Pair = new Pair(var70, var89);
         val var105: java.util.List = var71.a() as java.util.List;
         val var115: java.util.List = var71.b() as java.util.List;
         if (!var105.isEmpty() && var2.getUseAttachmentGridLayout()) {
            label345: {
               if (var1.isCurrentUserMessageAuthor() == java.lang.Boolean.TRUE) {
                  val var90: java.lang.String = var1.getNonce-N_6c4I0();
                  var72 = var90;
                  if (var90 != null) {
                     break label345;
                  }
               }

               var72 = var1.getId-3Eiw7ao();
            }

            val var23: ArrayList = this.accessories;
            val var16: Long = var1.getChannelId-o4g7jtM();
            val var121: ArrayList = new ArrayList(CollectionsKt.v(var105, 10));

            for (IndexedValue var106 : var105) {
               var121.add(
                  CreateAttachmentAccessoryKt.createAttachmentAccessory(
                     var106.d() as Attachment,
                     var1,
                     var106.c(),
                     var5,
                     this.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius),
                     (var106.d() as Attachment).getVerifyAge()
                  )
               );
            }

            val var107: MessageState = var1.getState();
            var var92: MessageState = var107;
            if (var107 == null) {
               var92 = MessageState.Unknown;
            }

            val var108: java.lang.Boolean = var1.getGifAutoPlay();
            val var62: Boolean;
            if (var108 != null) {
               var62 = var108;
            } else {
               var62 = false;
            }

            var23.add(new MediaMosaicAttachmentMessageAccessory(var72, var16, var121, var5, var11, var92, var62, null));
         }

         val var73: ArrayList = this.accessories;

         for (IndexedValue var109 : var115) {
            var73.add(
               CreateAttachmentAccessoryKt.createAttachmentAccessory(
                  var109.d() as Attachment, var1, var109.c(), var5, var7, (var109.d() as Attachment).getVerifyAge()
               )
            );
         }

         var59 = var5;
         if (var60) {
            var89 = this.accessories;
            val var110: java.lang.String = var1.getId-3Eiw7ao();
            val var63: Long = var1.getChannelId-o4g7jtM();
            var var74: java.lang.String = var1.getObscureLearnMoreLabel();
            if (var74 == null) {
               var74 = "";
            }

            var89.add(new InfoLinkMessageAccessory(var110, var63, null, null, var74, ReactAsset.Info, null));
            var59 = var5;
         }
      } else {
         var59 = var5;
      }

      val var75: java.util.List = var1.getPostPreviewEmbeds();
      if (var75 != null) {
         val var76: java.util.Iterator = var75.iterator();

         for (int var54 = 0; var76.hasNext(); var54++) {
            val var95: Any = var76.next();
            if (var54 < 0) {
               CollectionsKt.u();
            }

            this.accessories
               .add(
                  new PostPreviewEmbedMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var95 as PostPreviewEmbed,
                     var54,
                     SpoilerAttributes.Companion.forMediaPostPreviewEmbed(var95 as PostPreviewEmbed, var1, var54, (var95 as PostPreviewEmbed).getVerifyAge()),
                     null
                  )
               );
         }
      }

      val var78: java.util.List = var1.getEmbeds();
      if (var78 != null) {
         val var111: java.util.Iterator = var78.iterator();

         for (int var55 = 0; var111.hasNext(); var55++) {
            var var79: StringBuilder = (StringBuilder)var111.next();
            if (var55 < 0) {
               CollectionsKt.u();
            }

            val var80: Embed = var79 as Embed;
            this.accessories
               .add(
                  new EmbedMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var55,
                     var1.getChannelId-o4g7jtM(),
                     var59,
                     var7,
                     var79 as Embed,
                     MessageKt.shouldAutoPlayGifs(var1),
                     MessageKt.shouldAnimateEmoji(var1),
                     MessageKt.shouldShowLinkDecorations(var1),
                     var1.getShouldShowRoleDot(),
                     var1.getShouldShowRoleOnName(),
                     SpoilerAttributes.Companion.forEmbed(var79 as Embed, var1, var55, (var79 as Embed).getVerifyAge()),
                     generateMessageAccessories$getLongClickListener(var4, var1, var55, MediaType.Embed),
                     var11,
                     null
                  )
               );
            if (var80.getObscureOrNull() != null) {
               val var122: ArrayList = this.accessories;
               val var116: java.lang.String = var1.getId-3Eiw7ao();
               val var64: Long = var1.getChannelId-o4g7jtM();
               var var97: java.lang.String = var80.getId();
               if (var97 != null && !StringsKt.c0(var97)) {
                  var79 = var80.getId();
               } else {
                  var79 = new StringBuilder();
                  var79.append("index_");
                  var79.append(var55);
                  var79 = var79.toString();
               }

               var97 = var1.getObscureLearnMoreLabel();
               if (var97 == null) {
                  var97 = "";
               }

               var122.add(new InfoLinkMessageAccessory(var116, var64, null, (java.lang.String)var79, var97, ReactAsset.Info, null));
            }
         }
      }

      val var29: java.util.List = var1.getGiftCodes();
      if (var29 != null) {
         val var30: java.util.Iterator = var29.iterator();

         for (int var56 = 0; var30.hasNext(); var56++) {
            val var83: Any = var30.next();
            if (var56 < 0) {
               CollectionsKt.u();
            }

            this.accessories.add(new GiftMessageAccessory(var1.getId-3Eiw7ao(), var56, var83 as GiftEmbed, null));
         }
      }

      val var32: GiftEmbed = var1.getReferralTrialOffer();
      if (var32 != null) {
         this.accessories.add(new GiftMessageAccessory(var1.getId-3Eiw7ao(), 0, var32, null));
      }

      val var33: ReferralEmbed = var1.getReferralTrialOfferInfo();
      if (var33 != null) {
         this.accessories.add(new ReferralMessageAccessory(var1.getId-3Eiw7ao(), var33, null));
      }

      val var34: ActivityInstanceEmbed = var1.getActivityInstanceEmbed();
      if (var34 != null) {
         this.accessories.add(new ActivityInstanceEmbedMessageAccessory(var1.getId-3Eiw7ao(), var34, var59, null));
      }

      val var35: java.util.List = var1.getCodedLinks();
      if (var35 != null) {
         val var85: java.util.Iterator = var35.iterator();

         for (int var57 = 0; var85.hasNext(); var57++) {
            var var36: Any = var85.next();
            if (var57 < 0) {
               CollectionsKt.u();
            }

            var36 = var36 as CodedLinkEmbed;
            if (var36 as CodedLinkEmbed != null) {
               val var99: ArrayList = this.accessories;
               if (var36 is GuildEventInviteEmbedImpl) {
                  var36 = new GuildEventInviteMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var57,
                     var36 as GuildEventInviteEmbedImpl,
                     MessageKt.shouldAnimateEmoji(var1),
                     MessageKt.shouldShowLinkDecorations(var1),
                     var1.getShouldShowRoleDot(),
                     var1.getShouldShowRoleDot(),
                     null
                  );
               } else if (var36 is GuildInviteDisabledEmbedImpl) {
                  var36 = new GuildInviteDisabledMessageAccessory(var1.getId-3Eiw7ao(), var57, var36 as GuildInviteDisabledEmbedImpl, null);
               } else if (var36 is GuildInviteEmbedImpl) {
                  var36 = new GuildInviteMessageAccessory(var1.getId-3Eiw7ao(), var57, var36 as GuildInviteEmbedImpl, null);
               } else if (var36 is AppMessageEmbedImpl) {
                  var36 = new AppMessageEmbedAccessory(var1.getId-3Eiw7ao(), var57, var36 as AppMessageEmbedImpl, var59, null);
               } else if (var36 is EmbeddedActivityInviteEmbedImpl) {
                  var36 = new EmbeddedActivityInviteMessageAccessory(var1.getId-3Eiw7ao(), var57, var36 as EmbeddedActivityInviteEmbedImpl, var59, null);
               } else {
                  if (var36 !is GuildProfileInviteEmbedImpl) {
                     throw new B9.n();
                  }

                  var36 = new GuildProfileInviteMessageAccessory(var1.getId-3Eiw7ao(), var57, var36 as GuildProfileInviteEmbedImpl, null);
               }

               var99.add(var36);
            }
         }
      }

      val var41: java.util.List = var1.getStickers();
      if (var41 != null) {
         for (Sticker var86 : var41) {
            this.accessories.add(new StickerMessageAccessory(var1.getId-3Eiw7ao(), var86, null));
         }
      }

      if (var1.getComponents() != null) {
         this.accessories.add(new MessageComponentsAccessory(var1.getId-3Eiw7ao(), var1, var1.getComponents(), var59, null));
      }

      val var44: java.util.List = var1.getReactions();
      if (var44 != null && var44.isEmpty() xor true && !var1.isFirstForumPostMessage() || var3 is MessageFrameMediaViewer) {
         val var45: java.util.List = var1.getEmbeds();
         val var46: java.lang.String;
         if (var45 != null && !var45.isEmpty()) {
            var46 = "embed";
         } else {
            var46 = "shortcut";
         }

         val var112: ArrayList = this.accessories;
         val var117: java.lang.String = var1.getId-3Eiw7ao();
         val var100: java.util.List = var1.getReactions();
         var var87: java.util.List = var100;
         if (var100 == null) {
            var87 = CollectionsKt.k();
         }

         var11 = var2.getCanAddNewReactions();
         val var124: java.lang.String = var2.getAddReactionLabel();
         val var123: java.lang.String = var2.getAddNewReactionAccessibilityLabel();
         val var24: ReactionsTheme = var2.getReactionsTheme();
         val var101: Int;
         if (var46 == "embed") {
            var101 = 0;
         } else {
            var101 = null;
         }

         var112.add(new ReactionsMessageAccessory(var117, var87, var11, var124, var123, var24, null, var46, var101, 64, null));
      }

      val var47: ActivityInviteEmbed = var1.getActivityInviteEmbed();
      if (var47 != null) {
         this.accessories.add(new ActivityInviteEmbedMessageAccessory(var1.getId-3Eiw7ao(), var47, null));
      }

      val var48: ActivityRichPresenceInviteEmbed = var1.getActivityRichPresenceInviteEmbed();
      if (var48 != null) {
         this.accessories.add(new ActivityRichPresenceInviteEmbedMessageAccessory(var1.getId-3Eiw7ao(), var48, null));
      }

      val var49: ThreadEmbed = var1.getThreadEmbed();
      if (var49 != null) {
         this.accessories.add(new ThreadEmbedMessageAccessory(var1.getId-3Eiw7ao(), var49, null));
      }

      val var50: InteractionStatus = var1.getInteractionStatus();
      if (var50 != null) {
         this.accessories.add(new InteractionStatusMessageAccessory(var1.getId-3Eiw7ao(), var50, null));
      }

      val var51: CtaButton = var1.getCtaButton();
      if (var51 != null) {
         this.accessories.add(new CtaButtonMessageAccessory(var1.getChannelId-o4g7jtM(), var1.getId-3Eiw7ao(), var51, null));
      }

      val var52: EphemeralIndication = var1.getEphemeralIndication();
      if (var52 != null) {
         this.accessories.add(new EphemeralIndicationMessageAccessory(var1.getId-3Eiw7ao(), var52, null));
      }

      val var53: SurveyIndication = var1.getSurveyIndication();
      if (var53 != null) {
         this.accessories.add(new SurveyIndicationMessageAccessory(var1.getId-3Eiw7ao(), var53, null));
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

      val var27: ForwardInfo = var1.getForwardInfo();
      if (var27 != null && var27.getFooterInfo() != null) {
         this.accessories.add(new ForwardBreadcrumbMessageAccessory(var1.getId-3Eiw7ao(), var1.getChannelId-o4g7jtM(), var1.getForwardInfo(), null));
      }

      if (var1.getForwardInfo() != null) {
         CollectionsKt.z(this.accessories, new n0(new m0()));
      }

      return this.accessories;
   }

   @JvmStatic
   fun `generateMessageAccessories$getLongClickListener`(var0: Function6, var1: Message, var2: Int, var3: MediaType): OnLongClickListener {
      val var4: c0;
      if (var0 != null) {
         var4 = new c0(var0, var1, var2, var3);
      } else {
         var4 = null;
      }

      return var4;
   }

   @JvmStatic
   fun `generateMessageAccessories$getLongClickListener$lambda$19$lambda$18`(var0: Function6, var1: Message, var2: Int, var3: MediaType, var4: View): Boolean {
      var0.invoke(MessageId.box-impl(var1.getId-3Eiw7ao()), ChannelId.box-impl(var1.getChannelId-o4g7jtM()), var2, var3, null, null);
      return true;
   }

   @JvmStatic
   fun `generateMessageAccessories$lambda$44`(var0: MessageAccessory, var1: MessageAccessory): Int {
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
   fun `generateMessageAccessories$lambda$45`(var0: Function2, var1: Any, var2: Any): Int {
      return (var0.invoke(var1, var2) as java.lang.Number).intValue();
   }

   private fun hideHeader() {
      var var1: TextView = this.binding.timestamp;
      var1.setVisibility(8);
      var1 = this.binding.authorName;
      var1.setVisibility(8);
      val var3: SimpleDraweeView = this.binding.authorAvatar;
      var3.setVisibility(8);
      val var4: SimpleDraweeView = this.binding.authorAvatarDecoration;
      var4.setVisibility(8);
      val var5: RoleDotView = this.binding.roleDot;
      var5.setVisibility(8);
      val var6: ClanTagChipletView = this.binding.clanTagChiplet;
      var6.setVisibility(8);
      val var7: RoleIconView = this.binding.roleIcon;
      var7.setVisibility(8);
      val var8: GameIconView = this.binding.gameIcon;
      var8.setVisibility(8);
      val var9: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
      var9.setVisibility(8);
      val var10: MessageTagView = this.binding.messageTagView;
      var10.setVisibility(8);
      val var11: MessageAltRemixTagView = this.binding.messageAltRemixTagView;
      var11.setVisibility(8);
      val var12: SimpleDraweeView = this.binding.suppressNotificationsIcon;
      var12.setVisibility(8);
   }

   private fun initReplyView() {
      val var1: View = this.binding.replyPreviewView.inflate();
      this.setReplyPreview(var1 as MessageViewReplyPreview);
   }

   private fun initThreadStarterMessageHeaderView() {
      val var1: View = this.binding.threadStarterHeaderView.inflate();
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
   fun `setMessage$lambda$15$lambda$14`(var0: Function2, var1: Message, var2: View) {
      var0.invoke(MessageId.box-impl(var1.getId-3Eiw7ao()), ChannelId.box-impl(var1.getChannelId-o4g7jtM()));
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
      this.binding.accessoriesView.setRecycledViewPool(var1);
   }

   public fun setMessage(
      message: Message,
      messageContext: MessageContext,
      messageFrame: MessageFrame? = null,
      eventHandler: ChatEventHandler = ChatEventHandler.Empty.INSTANCE,
      componentProvider: ComponentProvider? = null,
      onChainPart: () -> com.discord.chat.presentation.message.MessageView.ChainPart = new d0(),
      allowChildGestures: Boolean = true,
      renderContentOnly: Boolean = false
   ) {
      this.bindKey(MessageId.box-impl(var1.getId-3Eiw7ao()));
      var var14: java.lang.String = this.messageId;
      val var15: java.lang.String = var1.getId-3Eiw7ao();
      val var10: Boolean;
      if (var14 == null) {
         var10 = false;
      } else {
         var10 = MessageId.equals-impl0(var14, var15);
      }

      this.messageId = var1.getId-3Eiw7ao();
      var var31: l0 = null;
      if (!var10 && var2.getContextType() === MessageContextType.SEARCH) {
         MessageAccessoriesView.clear$default(this.binding.accessoriesView, false, 1, null);
      }

      this.onChainPart = var6;
      this.setOnInitiateReply(new V(var4, var1));
      this.onInitiateThread = new g0(var4, var1);
      this.setOnInitiateEdit(new h0(var4, var1));
      this.setEnableSwipeToReply(var2.getEnableSwipeToReply());
      this.setEnableSwipeToEdit(var2.getEnableSwipeToEdit());
      this.setUsingGradientTheme(var2.getUsingGradientTheme());
      this.allowChildGestures = var7;
      val var16: MessageView.ChainPart = var6.invoke() as MessageView.ChainPart;
      val var20: Int = var1.getTimestampColor();
      if (var20 != null) {
         this.binding.timestamp.setTextColor(var20.intValue());
      }

      if (var3 != null && var3 !is UnknownMessageFrame) {
         val var22: MessageFrameHeaderView = this.binding.messageFrameHeader;
         var22.setVisibility(0);
         this.binding.messageFrameHeader.configure(var3);
      } else {
         val var21: MessageFrameHeaderView = this.binding.messageFrameHeader;
         var21.setVisibility(8);
      }

      this.configureDivider(var2.getShowDivider());
      var14 = var1.getThreadStarterMessageHeader();
      if (var14 != null) {
         if (this.threadStarterMessageHeaderView == null) {
            this.initThreadStarterMessageHeaderView();
         }

         val var23: ThreadStarterMessageHeaderView = this.getThreadStarterMessageHeaderView();
         if (var1.getReferencedMessage() != null) {
            var7 = true;
         } else {
            var7 = false;
         }

         var23.configure(var14, var7);
      } else if (this.threadStarterMessageHeaderView != null) {
         this.getThreadStarterMessageHeaderView().setVisibility(8);
      }

      if (var1.getReferencedMessage() != null) {
         if (this.replyPreview == null) {
            this.initReplyView();
         }

         MessageViewReplyPreview.configureReply$default(this.getReplyPreview(), var1.getReferencedMessage(), false, new i0(var4, var1), 2, null);
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
      val var25: j0;
      if (var24 != null) {
         var25 = new j0(var24, var1);
      } else {
         var25 = null;
      }

      val var29: Function6 = var4.getOnMessageLongPressed();
      val var30: k0;
      if (var29 != null) {
         var30 = new k0(var29, var1);
      } else {
         var30 = null;
      }

      val var17: Function2 = var4.getOnMessageDoubleTapped();
      if (var17 != null) {
         var31 = new l0(var17, var1);
      }

      NestedScrollOnTouchUtilsKt.setOnDoubleClickListenerNested(this, true, var31);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested(this, true, var25);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested(this, true, var30);
      val var32: java.util.List = this.generateMessageAccessories(var1, var2, var3, var4.getOnMessageLongPressed());
      val var18: MessageAccessoriesView = this.binding.accessoriesView;
      val var19: java.lang.String = var1.getId-3Eiw7ao();
      val var12: Long = var1.getChannelId-o4g7jtM();
      val var33: GuildId = var1.getGuildId-qOKuAAo();
      if (var1.getForwardInfo() != null) {
         var7 = true;
      } else {
         var7 = false;
      }

      var18.setAccessories-mFdI1tY(var19, var12, var33, var32, var4, var5, var2, var8, var7);
      this.configureAccessoriesMargin(var32);
      this.configureCommunicationDisabled(var1.getCommunicationDisabled() == java.lang.Boolean.TRUE, var16);
      this.configureSuppressNotifications(MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.SUPPRESS_NOTIFICATIONS), var4, var16);
      if (var2.getContextType() === MessageContextType.SEARCH) {
         this.hideHeader();
      } else {
         this.configureAuthor(var1, var4, var16);
      }

      androidx.core.view.Z.o0(this, new MessageViewAccessibilityDelegate(var1, var25, var30));
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
            throw new B9.n();
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
