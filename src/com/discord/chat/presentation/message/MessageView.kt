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

@SourceDebugExtension(["SMAP\nMessageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageView.kt\ncom/discord/chat/presentation/message/MessageView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,993:1\n257#2,2:994\n257#2,2:996\n257#2,2:998\n257#2,2:1000\n257#2,2:1036\n257#2,2:1038\n257#2,2:1040\n257#2,2:1042\n257#2,2:1044\n257#2,2:1046\n257#2,2:1048\n257#2,2:1050\n257#2,2:1052\n257#2,2:1054\n257#2,2:1056\n257#2,2:1058\n257#2,2:1060\n257#2,2:1062\n257#2,2:1064\n257#2,2:1066\n257#2,2:1068\n257#2,2:1070\n257#2,2:1072\n257#2,2:1074\n257#2,2:1076\n257#2,2:1078\n257#2,2:1080\n257#2,2:1082\n257#2,2:1084\n257#2,2:1086\n257#2,2:1088\n257#2,2:1090\n257#2,2:1092\n257#2,2:1094\n257#2,2:1096\n257#2,2:1098\n257#2,2:1100\n257#2,2:1110\n257#2,2:1112\n1755#3,3:1002\n3193#3,10:1005\n1557#3:1015\n1628#3,3:1016\n1628#3,3:1019\n1872#3,3:1022\n1872#3,3:1025\n1872#3,3:1028\n1872#3,3:1031\n1863#3,2:1034\n199#4,8:1102\n*S KotlinDebug\n*F\n+ 1 MessageView.kt\ncom/discord/chat/presentation/message/MessageView\n*L\n241#1:994,2\n245#1:996,2\n263#1:998,2\n363#1:1000,2\n799#1:1036,2\n802#1:1038,2\n805#1:1040,2\n806#1:1042,2\n807#1:1044,2\n810#1:1046,2\n813#1:1048,2\n818#1:1050,2\n820#1:1052,2\n825#1:1054,2\n827#1:1056,2\n832#1:1058,2\n834#1:1060,2\n845#1:1062,2\n847#1:1064,2\n854#1:1066,2\n864#1:1068,2\n867#1:1070,2\n880#1:1072,2\n883#1:1074,2\n884#1:1076,2\n892#1:1078,2\n893#1:1080,2\n894#1:1082,2\n895#1:1084,2\n896#1:1086,2\n897#1:1088,2\n898#1:1090,2\n899#1:1092,2\n900#1:1094,2\n901#1:1096,2\n902#1:1098,2\n903#1:1100,2\n947#1:1110,2\n965#1:1112,2\n457#1:1002,3\n459#1:1005,10\n471#1:1015\n471#1:1016,3\n487#1:1019,3\n511#1:1022,3\n527#1:1025,3\n561#1:1028,3\n600#1:1031,3\n657#1:1034,2\n932#1:1102,8\n*E\n"])
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
         val var10: TextView = this.binding.authorName;
         this.binding.authorName.setText(var1.getUsername());
         this.configureAuthorClickListeners(var10, var1, var2);
         var10.setTextColor(MessageKt.usernameColor$default(var1, 0, 1, null));
         MessageUtilsKt.clearOrSetRoleColors(var10, var1);
         val var11: RoleDotView = this.binding.roleDot;
         this.configureAuthorClickListeners(var11, var1, var2);
         this.binding.timestamp.setText(var1.getTimestamp());
         val var12: SimpleDraweeView = this.binding.authorAvatar;
         val var4: Context = this.binding.authorAvatar.getContext();
         var12.setImageURI(MessageKt.avatarUrl(var1, var4));
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var12, false, new a0(var1, var2), 1, null);
         NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var12, false, new b0(var1, var2), 1, null);
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

      val var64: StructurableText = var1.getContent();
      if (var64 != null && var64.getHasContent() && var1.getType() != MessageType.CUSTOM_GIFT) {
         val var19: ArrayList = this.accessories;
         val var20: java.lang.String = var1.getId-3Eiw7ao();
         val var65: StructurableText = var1.getContent();
         val var15: Boolean = MessageKt.shouldAnimateEmoji(var1);
         val var14: Boolean = MessageKt.shouldShowLinkDecorations(var1);
         val var12: Boolean = var1.getShouldShowRoleDot();
         val var13: Boolean = var1.getShouldShowRoleOnName();
         val var9: Int = this.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing);
         val var21: Int = var1.getLinkColor();
         val var8: Int;
         if (var21 != null) {
            var8 = var21;
         } else {
            var8 = ThemeManagerKt.getTheme().getTextLink();
         }

         val var112: DiscordFont = DiscordFont.PrimaryMedium;
         val var22: Context = this.getContext();
         val var10: Int = MessageUtilsKt.getChatTextSizeSp(var22);
         val var117: MessageState = var1.getState();
         var var6: Int;
         if (var117 == null) {
            var6 = -1;
         } else {
            var6 = MessageView.WhenMappings.$EnumSwitchMapping$0[var117.ordinal()];
         }

         if (var6 != 1 && var6 != 2) {
            val var118: Int = var1.getTextColor();
            if (var118 != null) {
               var6 = var118;
            } else {
               var6 = ThemeManagerKt.getTheme().getTextNormal();
            }
         } else {
            var6 = ThemeManagerKt.getTheme().getTextMuted();
         }

         var19.add(
            new MessageContentAccessory(
               var20,
               var65,
               var15,
               var14,
               var12,
               var13,
               var9,
               var8,
               var6,
               var112,
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
         val var66: ArrayList = this.accessories;
         val var87: PollMessageAccessory.Companion = PollMessageAccessory.Companion;
         val var101: Context = this.getContext();
         var66.add(var87.create(var101, var1, var1.getPollData()));
      }

      if (var1.getSharedClientTheme() != null) {
         this.accessories.add(SharedCustomThemeMessageAccessory.Companion.create(var1, var1.getSharedClientTheme()));
      }

      var var58: Int;
      if (var1.getAttachments() != null && var1.getPollData() == null && !MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.IS_COMPONENTS_V2)) {
         var var59: Boolean;
         label413: {
            val var67: java.util.List = var1.getAttachments();
            if (var67 == null || !var67.isEmpty()) {
               val var68: java.util.Iterator = var67.iterator();

               while (var68.hasNext()) {
                  if ((var68.next() as Attachment).getObscure() == java.lang.Boolean.TRUE) {
                     var59 = true;
                     break label413;
                  }
               }
            }

            var59 = false;
         }

         val var102: java.lang.Iterable = CollectionsKt.Z0(var1.getAttachments());
         val var69: ArrayList = new ArrayList();
         var var88: ArrayList = new ArrayList();

         for (Object var113 : var102) {
            if (((var113 as IndexedValue).d() as Attachment).type() != AttachmentType.Image
               && ((var113 as IndexedValue).d() as Attachment).type() != AttachmentType.Video) {
               var88.add(var113);
            } else {
               var69.add(var113);
            }
         }

         val var70: Pair = new Pair(var69, var88);
         val var104: java.util.List = var70.a() as java.util.List;
         val var114: java.util.List = var70.b() as java.util.List;
         if (!var104.isEmpty() && var2.getUseAttachmentGridLayout()) {
            label341: {
               if (var1.isCurrentUserMessageAuthor() == java.lang.Boolean.TRUE) {
                  val var89: java.lang.String = var1.getNonce-N_6c4I0();
                  var71 = var89;
                  if (var89 != null) {
                     break label341;
                  }
               }

               var71 = var1.getId-3Eiw7ao();
            }

            val var23: ArrayList = this.accessories;
            val var16: Long = var1.getChannelId-o4g7jtM();
            val var120: ArrayList = new ArrayList(CollectionsKt.v(var104, 10));

            for (IndexedValue var105 : var104) {
               var120.add(
                  CreateAttachmentAccessoryKt.createAttachmentAccessory(
                     var105.d() as Attachment,
                     var1,
                     var105.c(),
                     var5,
                     this.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius),
                     (var105.d() as Attachment).getVerifyAge()
                  )
               );
            }

            val var106: MessageState = var1.getState();
            var var91: MessageState = var106;
            if (var106 == null) {
               var91 = MessageState.Unknown;
            }

            val var107: java.lang.Boolean = var1.getGifAutoPlay();
            val var61: Boolean;
            if (var107 != null) {
               var61 = var107;
            } else {
               var61 = false;
            }

            var23.add(new MediaMosaicAttachmentMessageAccessory(var71, var16, var120, var5, var11, var91, var61, null));
         }

         val var72: ArrayList = this.accessories;

         for (IndexedValue var108 : var114) {
            var72.add(
               CreateAttachmentAccessoryKt.createAttachmentAccessory(
                  var108.d() as Attachment, var1, var108.c(), var5, var7, (var108.d() as Attachment).getVerifyAge()
               )
            );
         }

         var58 = var5;
         if (var59) {
            var88 = this.accessories;
            val var109: java.lang.String = var1.getId-3Eiw7ao();
            val var62: Long = var1.getChannelId-o4g7jtM();
            var var73: java.lang.String = var1.getObscureLearnMoreLabel();
            if (var73 == null) {
               var73 = "";
            }

            var88.add(new InfoLinkMessageAccessory(var109, var62, null, null, var73, ReactAsset.Info, null));
            var58 = var5;
         }
      } else {
         var58 = var5;
      }

      val var74: java.util.List = var1.getPostPreviewEmbeds();
      if (var74 != null) {
         val var75: java.util.Iterator = var74.iterator();

         for (int var53 = 0; var75.hasNext(); var53++) {
            val var94: Any = var75.next();
            if (var53 < 0) {
               CollectionsKt.u();
            }

            this.accessories
               .add(
                  new PostPreviewEmbedMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var94 as PostPreviewEmbed,
                     var53,
                     SpoilerAttributes.Companion.forMediaPostPreviewEmbed(var94 as PostPreviewEmbed, var1, var53, (var94 as PostPreviewEmbed).getVerifyAge()),
                     null
                  )
               );
         }
      }

      val var77: java.util.List = var1.getEmbeds();
      if (var77 != null) {
         val var110: java.util.Iterator = var77.iterator();

         for (int var54 = 0; var110.hasNext(); var54++) {
            var var78: StringBuilder = (StringBuilder)var110.next();
            if (var54 < 0) {
               CollectionsKt.u();
            }

            val var96: Embed = var78 as Embed;
            this.accessories
               .add(
                  new EmbedMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var54,
                     var1.getChannelId-o4g7jtM(),
                     var58,
                     var7,
                     var78 as Embed,
                     MessageKt.shouldAutoPlayGifs(var1),
                     MessageKt.shouldAnimateEmoji(var1),
                     MessageKt.shouldShowLinkDecorations(var1),
                     var1.getShouldShowRoleDot(),
                     var1.getShouldShowRoleOnName(),
                     SpoilerAttributes.Companion.forEmbed(var78 as Embed, var1, var54, (var78 as Embed).getVerifyAge()),
                     generateMessageAccessories$getLongClickListener(var4, var1, var54, MediaType.Embed),
                     var11,
                     null
                  )
               );
            if (var96.getObscureOrNull() != null) {
               val var121: ArrayList = this.accessories;
               val var115: java.lang.String = var1.getId-3Eiw7ao();
               val var63: Long = var1.getChannelId-o4g7jtM();
               var78 = var96.getId();
               if (var78 != null && !StringsKt.c0((java.lang.CharSequence)var78)) {
                  var78 = var96.getId();
               } else {
                  var78 = new StringBuilder();
                  var78.append("index_");
                  var78.append(var54);
                  var78 = var78.toString();
               }

               var var97: java.lang.String = var1.getObscureLearnMoreLabel();
               if (var97 == null) {
                  var97 = "";
               }

               var121.add(new InfoLinkMessageAccessory(var115, var63, null, (java.lang.String)var78, var97, ReactAsset.Info, null));
            }
         }
      }

      val var29: java.util.List = var1.getGiftCodes();
      if (var29 != null) {
         val var30: java.util.Iterator = var29.iterator();

         for (int var55 = 0; var30.hasNext(); var55++) {
            val var82: Any = var30.next();
            if (var55 < 0) {
               CollectionsKt.u();
            }

            this.accessories.add(new GiftMessageAccessory(var1.getId-3Eiw7ao(), var55, var82 as GiftEmbed, null));
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
         this.accessories.add(new ActivityInstanceEmbedMessageAccessory(var1.getId-3Eiw7ao(), var34, var58, null));
      }

      val var35: java.util.List = var1.getCodedLinks();
      if (var35 != null) {
         val var84: java.util.Iterator = var35.iterator();

         for (int var56 = 0; var84.hasNext(); var56++) {
            var var36: Any = var84.next();
            if (var56 < 0) {
               CollectionsKt.u();
            }

            var36 = var36 as CodedLinkEmbed;
            if (var36 as CodedLinkEmbed != null) {
               val var98: ArrayList = this.accessories;
               if (var36 is GuildEventInviteEmbedImpl) {
                  var36 = new GuildEventInviteMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var56,
                     var36 as GuildEventInviteEmbedImpl,
                     MessageKt.shouldAnimateEmoji(var1),
                     MessageKt.shouldShowLinkDecorations(var1),
                     var1.getShouldShowRoleDot(),
                     var1.getShouldShowRoleDot(),
                     null
                  );
               } else if (var36 is GuildInviteDisabledEmbedImpl) {
                  var36 = new GuildInviteDisabledMessageAccessory(var1.getId-3Eiw7ao(), var56, var36 as GuildInviteDisabledEmbedImpl, null);
               } else if (var36 is GuildInviteEmbedImpl) {
                  var36 = new GuildInviteMessageAccessory(var1.getId-3Eiw7ao(), var56, var36 as GuildInviteEmbedImpl, null);
               } else if (var36 is AppMessageEmbedImpl) {
                  var36 = new AppMessageEmbedAccessory(var1.getId-3Eiw7ao(), var56, var36 as AppMessageEmbedImpl, var58, null);
               } else if (var36 is EmbeddedActivityInviteEmbedImpl) {
                  var36 = new EmbeddedActivityInviteMessageAccessory(var1.getId-3Eiw7ao(), var56, var36 as EmbeddedActivityInviteEmbedImpl, var58, null);
               } else {
                  if (var36 !is GuildProfileInviteEmbedImpl) {
                     throw new B9.n();
                  }

                  var36 = new GuildProfileInviteMessageAccessory(var1.getId-3Eiw7ao(), var56, var36 as GuildProfileInviteEmbedImpl, null);
               }

               var98.add(var36);
            }
         }
      }

      val var41: java.util.List = var1.getStickers();
      if (var41 != null) {
         for (Sticker var85 : var41) {
            this.accessories.add(new StickerMessageAccessory(var1.getId-3Eiw7ao(), var85, null));
         }
      }

      if (var1.getComponents() != null) {
         this.accessories.add(new MessageComponentsAccessory(var1.getId-3Eiw7ao(), var1, var1.getComponents(), var58, null));
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

         val var116: ArrayList = this.accessories;
         val var111: java.lang.String = var1.getId-3Eiw7ao();
         val var99: java.util.List = var1.getReactions();
         var var86: java.util.List = var99;
         if (var99 == null) {
            var86 = CollectionsKt.k();
         }

         var11 = var2.getCanAddNewReactions();
         val var24: java.lang.String = var2.getAddReactionLabel();
         val var122: java.lang.String = var2.getAddNewReactionAccessibilityLabel();
         val var123: ReactionsTheme = var2.getReactionsTheme();
         val var100: Int;
         if (var46 == "embed") {
            var100 = 0;
         } else {
            var100 = null;
         }

         var116.add(new ReactionsMessageAccessory(var111, var86, var11, var24, var122, var123, null, var46, var100, 64, null));
      }

      val var47: ActivityRichPresenceInviteEmbed = var1.getActivityRichPresenceInviteEmbed();
      if (var47 != null) {
         this.accessories.add(new ActivityRichPresenceInviteEmbedMessageAccessory(var1.getId-3Eiw7ao(), var47, null));
      }

      val var48: ThreadEmbed = var1.getThreadEmbed();
      if (var48 != null) {
         this.accessories.add(new ThreadEmbedMessageAccessory(var1.getId-3Eiw7ao(), var48, null));
      }

      val var49: InteractionStatus = var1.getInteractionStatus();
      if (var49 != null) {
         this.accessories.add(new InteractionStatusMessageAccessory(var1.getId-3Eiw7ao(), var49, null));
      }

      val var50: CtaButton = var1.getCtaButton();
      if (var50 != null) {
         this.accessories.add(new CtaButtonMessageAccessory(var1.getChannelId-o4g7jtM(), var1.getId-3Eiw7ao(), var50, null));
      }

      val var51: EphemeralIndication = var1.getEphemeralIndication();
      if (var51 != null) {
         this.accessories.add(new EphemeralIndicationMessageAccessory(var1.getId-3Eiw7ao(), var51, null));
      }

      val var52: SurveyIndication = var1.getSurveyIndication();
      if (var52 != null) {
         this.accessories.add(new SurveyIndicationMessageAccessory(var1.getId-3Eiw7ao(), var52, null));
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
      var var15: java.lang.String = this.messageId;
      val var14: java.lang.String = var1.getId-3Eiw7ao();
      val var10: Boolean;
      if (var15 == null) {
         var10 = false;
      } else {
         var10 = MessageId.equals-impl0(var15, var14);
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
      val var23: java.lang.String = var1.getThreadStarterMessageHeader();
      if (var23 != null) {
         if (this.threadStarterMessageHeaderView == null) {
            this.initThreadStarterMessageHeaderView();
         }

         val var28: ThreadStarterMessageHeaderView = this.getThreadStarterMessageHeaderView();
         if (var1.getReferencedMessage() != null) {
            var7 = true;
         } else {
            var7 = false;
         }

         var28.configure(var23, var7);
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
      val var19: java.util.List = this.generateMessageAccessories(var1, var2, var3, var4.getOnMessageLongPressed());
      val var33: MessageAccessoriesView = this.binding.accessoriesView;
      var15 = var1.getId-3Eiw7ao();
      val var12: Long = var1.getChannelId-o4g7jtM();
      val var18: GuildId = var1.getGuildId-qOKuAAo();
      if (var1.getForwardInfo() != null) {
         var7 = true;
      } else {
         var7 = false;
      }

      var33.setAccessories-mFdI1tY(var15, var12, var18, var19, var4, var5, var2, var8, var7);
      this.configureAccessoriesMargin(var19);
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
