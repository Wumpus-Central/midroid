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
import com.discord.chat.R.color
import com.discord.chat.R.dimen
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
      var4.messageHeaderDivider.setBackgroundColor(ColorUtilsKt.getThemeColor(var1, color.message_divider_light, color.message_divider_dark));
      this.setShadowView(var4.shadowView);
      this.getShadowView().setVisibility(4);
      this.setClipToPadding(false);
      this.onChainPart = new u0();
      this.allowChildGestures = true;
      this.onInitiateReply = new v0();
      this.onInitiateThread = new w0();
      this.onInitiateEdit = new x0();
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
         val var12: SimpleDraweeView = this.binding.authorAvatar;
         val var4: Context = this.binding.authorAvatar.getContext();
         var12.setImageURI(MessageKt.avatarUrl(var1, var4));
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var12, false, new y0(var1, var2), 1, null);
         NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var12, false, new z0(var1, var2), 1, null);
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
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var1, false, new c1(var2, var3), 1, null);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var1, false, new d1(var2, var3), 1, null);
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
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var9, false, new m1(var2), 1, null);
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
      var var5: Int;
      if (var18 != null) {
         var5 = var18;
      } else {
         var5 = this.getResources().getDisplayMetrics().widthPixels;
      }

      var var6: Int;
      if (var2.getUseAttachmentGridLayout()) {
         var6 = this.getContext().getResources().getDimensionPixelSize(dimen.message_media_radius);
      } else {
         var6 = this.getContext().getResources().getDimensionPixelSize(dimen.message_media_non_mosaic_radius);
      }

      val var67: StructurableText = var1.getContent();
      if (var67 != null && var67.getHasContent() && var1.getType() != MessageType.CUSTOM_GIFT) {
         val var19: ArrayList = this.accessories;
         val var20: java.lang.String = var1.getId-3Eiw7ao();
         val var68: StructurableText = var1.getContent();
         val var15: Boolean = MessageKt.shouldAnimateEmoji(var1);
         val var13: Boolean = MessageKt.shouldShowLinkDecorations(var1);
         val var12: Boolean = var1.getShouldShowRoleDot();
         val var14: Boolean = var1.getShouldShowRoleOnName();
         val var9: Int = this.getResources().getDimensionPixelSize(dimen.message_accessories_vertical_spacing);
         val var21: Int = var1.getLinkColor();
         val var8: Int;
         if (var21 != null) {
            var8 = var21;
         } else {
            var8 = ThemeManagerKt.getTheme().getTextLink();
         }

         val var116: DiscordFont = DiscordFont.PrimaryMedium;
         val var22: Context = this.getContext();
         val var10: Int = MessageUtilsKt.getChatTextSizeSp(var22);
         val var123: MessageState = var1.getState();
         var var7: Int;
         if (var123 == null) {
            var7 = -1;
         } else {
            var7 = MessageView.WhenMappings.$EnumSwitchMapping$0[var123.ordinal()];
         }

         if (var7 != 1 && var7 != 2) {
            val var124: Int = var1.getTextColor();
            if (var124 != null) {
               var7 = var124;
            } else {
               var7 = ThemeManagerKt.getTheme().getTextNormal();
            }
         } else {
            var7 = ThemeManagerKt.getTheme().getTextMuted();
         }

         var19.add(
            new MessageContentAccessory(
               var20,
               var68,
               var15,
               var13,
               var12,
               var14,
               var9,
               var8,
               var7,
               var116,
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
         val var99: ArrayList = this.accessories;
         val var78: PollMessageAccessory.Companion = PollMessageAccessory.Companion;
         val var69: Context = this.getContext();
         var99.add(var78.create(var69, var1, var1.getPollData()));
      }

      if (var1.getSharedClientTheme() != null) {
         this.accessories.add(SharedCustomThemeMessageAccessory.Companion.create(var1, var1.getSharedClientTheme()));
      }

      var var70: Any;
      if (var1.getAttachments() != null && var1.getPollData() == null && !MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.IS_COMPONENTS_V2)) {
         var var58: Boolean;
         label415: {
            var70 = var1.getAttachments();
            if (var70 !is java.util.Collection || !(var70 as java.util.Collection).isEmpty()) {
               val var72: java.util.Iterator = var70.iterator();

               while (var72.hasNext()) {
                  if ((var72.next() as Attachment).getObscure() == java.lang.Boolean.TRUE) {
                     var58 = true;
                     break label415;
                  }
               }
            }

            var58 = false;
         }

         var var100: java.lang.Iterable = CollectionsKt.o1(var1.getAttachments());
         var var79: ArrayList = new ArrayList();
         val var73: ArrayList = new ArrayList();

         for (var100 : var100) {
            if (((var100 as IndexedValue).d() as Attachment).type() != AttachmentType.Image
               && ((var100 as IndexedValue).d() as Attachment).type() != AttachmentType.Video) {
               var73.add(var100);
            } else {
               var79.add(var100);
            }
         }

         val var74: Pair = new Pair(var79, var73);
         val var102: java.util.List = var74.a() as java.util.List;
         val var118: java.util.List = var74.b() as java.util.List;
         if (!var102.isEmpty() && var2.getUseAttachmentGridLayout()) {
            label343: {
               if (var1.isCurrentUserMessageAuthor() == java.lang.Boolean.TRUE) {
                  val var80: java.lang.String = var1.getNonce-N_6c4I0();
                  var75 = var80;
                  if (var80 != null) {
                     break label343;
                  }
               }

               var75 = var1.getId-3Eiw7ao();
            }

            val var126: ArrayList = this.accessories;
            val var16: Long = var1.getChannelId-o4g7jtM();
            val var81: java.lang.Iterable = var102;
            val var23: ArrayList = new ArrayList(CollectionsKt.w(var102, 10));

            for (IndexedValue var82 : var81) {
               var23.add(
                  CreateAttachmentAccessoryKt.createAttachmentAccessory(
                     var82.d() as Attachment,
                     var1,
                     var82.c(),
                     var5,
                     this.getContext().getResources().getDimensionPixelSize(dimen.message_media_grid_inner_radius),
                     (var82.d() as Attachment).getVerifyAge()
                  )
               );
            }

            val var104: MessageState = var1.getState();
            var var83: MessageState = var104;
            if (var104 == null) {
               var83 = MessageState.Unknown;
            }

            val var105: java.lang.Boolean = var1.getGifAutoPlay();
            val var64: Boolean;
            if (var105 != null) {
               var64 = var105;
            } else {
               var64 = false;
            }

            var126.add(new MediaMosaicAttachmentMessageAccessory(var75, var16, var23, var5, var11, var83, var64, null));
         }

         var100 = var118;
         var79 = this.accessories;

         for (IndexedValue var119 : var100) {
            var79.add(
               CreateAttachmentAccessoryKt.createAttachmentAccessory(
                  var119.d() as Attachment, var1, var119.c(), var5, var6, (var119.d() as Attachment).getVerifyAge()
               )
            );
         }

         val var62: Int = var6;
         var6 = var6;
         var70 = null;
         if (var58) {
            val var120: ArrayList = this.accessories;
            val var108: java.lang.String = var1.getId-3Eiw7ao();
            val var65: Long = var1.getChannelId-o4g7jtM();
            var var77: java.lang.String = var1.getObscureLearnMoreLabel();
            if (var77 == null) {
               var77 = "";
            }

            var120.add(new InfoLinkMessageAccessory(var108, var65, null, null, var77, ReactAsset.Info, null));
            var6 = var62;
            var70 = null;
         }
      } else {
         var70 = null;
      }

      var var86: java.util.List = var1.getPostPreviewEmbeds();
      if (var86 != null) {
         val var87: java.util.Iterator = var86.iterator();

         for (int var59 = 0; var87.hasNext(); var59++) {
            val var109: Any = var87.next();
            if (var59 < 0) {
               CollectionsKt.v();
            }

            this.accessories
               .add(
                  new PostPreviewEmbedMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var109 as PostPreviewEmbed,
                     var59,
                     SpoilerAttributes.Companion.forMediaPostPreviewEmbed(var109 as PostPreviewEmbed, var1, var59, (var109 as PostPreviewEmbed).getVerifyAge()),
                     null
                  )
               );
         }
      }

      var86 = var1.getEmbeds();
      if (var86 != null) {
         val var121: java.util.Iterator = var86.iterator();

         for (int var60 = 0; var121.hasNext(); var60++) {
            var86 = (java.util.List)var121.next();
            if (var60 < 0) {
               CollectionsKt.v();
            }

            val var111: Embed = var86 as Embed;
            this.accessories
               .add(
                  new EmbedMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var60,
                     var1.getChannelId-o4g7jtM(),
                     var5,
                     var6,
                     var86 as Embed,
                     MessageKt.shouldAutoPlayGifs(var1),
                     MessageKt.shouldAnimateEmoji(var1),
                     MessageKt.shouldShowLinkDecorations(var1),
                     var1.getShouldShowRoleDot(),
                     var1.getShouldShowRoleOnName(),
                     SpoilerAttributes.Companion.forEmbed(var86 as Embed, var1, var60, (var86 as Embed).getVerifyAge()),
                     generateMessageAccessories$getLongClickListener(var4, var1, var60, MediaType.Embed),
                     var11,
                     null
                  )
               );
            if (var111.getObscureOrNull() != null) {
               val var127: ArrayList = this.accessories;
               val var129: java.lang.String = var1.getId-3Eiw7ao();
               val var66: Long = var1.getChannelId-o4g7jtM();
               val var91: java.lang.String = var111.getId();
               val var93: java.lang.String;
               if (var91 != null && !StringsKt.i0(var91)) {
                  var93 = var111.getId();
               } else {
                  val var92: StringBuilder = new StringBuilder();
                  var92.append("index_");
                  var92.append(var60);
                  var93 = var92.toString();
               }

               var var112: java.lang.String = var1.getObscureLearnMoreLabel();
               if (var112 == null) {
                  var112 = "";
               }

               var127.add(new InfoLinkMessageAccessory(var129, var66, null, var93, var112, ReactAsset.Info, null));
            }
         }
      }

      val var30: java.util.List = var1.getGiftCodes();
      if (var30 != null) {
         val var31: java.util.Iterator = var30.iterator();

         for (int var54 = 0; var31.hasNext(); var54++) {
            var86 = (java.util.List)var31.next();
            if (var54 < 0) {
               CollectionsKt.v();
            }

            this.accessories.add(new GiftMessageAccessory(var1.getId-3Eiw7ao(), var54, var86 as GiftEmbed, var70));
         }
      }

      val var33: GiftEmbed = var1.getReferralTrialOffer();
      if (var33 != null) {
         this.accessories.add(new GiftMessageAccessory(var1.getId-3Eiw7ao(), 0, var33, var70));
      }

      val var34: ReferralEmbed = var1.getReferralTrialOfferInfo();
      if (var34 != null) {
         this.accessories.add(new ReferralMessageAccessory(var1.getId-3Eiw7ao(), var34, var70));
      }

      val var35: ActivityInstanceEmbed = var1.getActivityInstanceEmbed();
      if (var35 != null) {
         this.accessories.add(new ActivityInstanceEmbedMessageAccessory(var1.getId-3Eiw7ao(), var35, var5, var70));
      }

      val var36: java.util.List = var1.getCodedLinks();
      var6 = var5;
      if (var36 != null) {
         val var96: java.util.Iterator = var36.iterator();
         var6 = 0;

         while (var96.hasNext()) {
            var var37: Any = var96.next();
            if (var6 < 0) {
               CollectionsKt.v();
            }

            var37 = var37 as CodedLinkEmbed;
            var var61: Int = var5;
            if (var37 != null) {
               val var113: ArrayList = this.accessories;
               if (var37 is GuildEventInviteEmbedImpl) {
                  var37 = new GuildEventInviteMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var6,
                     var37 as GuildEventInviteEmbedImpl,
                     MessageKt.shouldAnimateEmoji(var1),
                     MessageKt.shouldShowLinkDecorations(var1),
                     var1.getShouldShowRoleDot(),
                     var1.getShouldShowRoleDot(),
                     null
                  );
               } else if (var37 is GuildInviteDisabledEmbedImpl) {
                  var37 = new GuildInviteDisabledMessageAccessory(var1.getId-3Eiw7ao(), var6, var37 as GuildInviteDisabledEmbedImpl, var70);
               } else if (var37 is GuildInviteEmbedImpl) {
                  var37 = new GuildInviteMessageAccessory(var1.getId-3Eiw7ao(), var6, var37 as GuildInviteEmbedImpl, var70);
               } else if (var37 is AppMessageEmbedImpl) {
                  var37 = new AppMessageEmbedAccessory(var1.getId-3Eiw7ao(), var6, var37 as AppMessageEmbedImpl, var5, null);
               } else if (var37 is EmbeddedActivityInviteEmbedImpl) {
                  var37 = new EmbeddedActivityInviteMessageAccessory(var1.getId-3Eiw7ao(), var6, var37 as EmbeddedActivityInviteEmbedImpl, var5, null);
               } else {
                  if (var37 !is GuildProfileInviteEmbedImpl) {
                     throw new ht.p();
                  }

                  var37 = new GuildProfileInviteMessageAccessory(var1.getId-3Eiw7ao(), var6, var37 as GuildProfileInviteEmbedImpl, var70);
               }

               var113.add(var37);
               var61 = var5;
            }

            var6++;
            var5 = var61;
         }

         var6 = var5;
      }

      val var42: java.util.List = var1.getStickers();
      if (var42 != null) {
         for (Sticker var43 : var42) {
            this.accessories.add(new StickerMessageAccessory(var1.getId-3Eiw7ao(), var43, var70));
         }
      }

      if (var1.getComponents() != null) {
         this.accessories.add(new MessageComponentsAccessory(var1.getId-3Eiw7ao(), var1, var1.getComponents(), var6, null));
      }

      val var45: java.util.List = var1.getReactions();
      if (var45 != null && var45.isEmpty() xor true && !var1.isFirstForumPostMessage() || var3 is MessageFrameMediaViewer) {
         val var46: java.util.Collection = var1.getEmbeds();
         val var47: java.lang.String;
         if (var46 != null && !var46.isEmpty()) {
            var47 = "embed";
         } else {
            var47 = "shortcut";
         }

         val var128: ArrayList = this.accessories;
         val var122: java.lang.String = var1.getId-3Eiw7ao();
         val var114: java.util.List = var1.getReactions();
         var86 = var114;
         if (var114 == null) {
            var86 = CollectionsKt.l();
         }

         var11 = var2.getCanAddNewReactions();
         val var130: java.lang.String = var2.getAddReactionLabel();
         val var25: java.lang.String = var2.getAddNewReactionAccessibilityLabel();
         val var24: ReactionsTheme = var2.getReactionsTheme();
         val var115: Int;
         if (var47 == "embed") {
            var115 = 0;
         } else {
            var115 = var70;
         }

         var128.add(new ReactionsMessageAccessory(var122, var86, var11, var130, var25, var24, null, var47, var115, 64, null));
      }

      val var48: ActivityRichPresenceInviteEmbed = var1.getActivityRichPresenceInviteEmbed();
      if (var48 != null) {
         this.accessories.add(new ActivityRichPresenceInviteEmbedMessageAccessory(var1.getId-3Eiw7ao(), var48, var70));
      }

      val var49: ThreadEmbed = var1.getThreadEmbed();
      if (var49 != null) {
         this.accessories.add(new ThreadEmbedMessageAccessory(var1.getId-3Eiw7ao(), var49, var70));
      }

      val var50: InteractionStatus = var1.getInteractionStatus();
      if (var50 != null) {
         this.accessories.add(new InteractionStatusMessageAccessory(var1.getId-3Eiw7ao(), var50, var70));
      }

      val var51: CtaButton = var1.getCtaButton();
      if (var51 != null) {
         this.accessories.add(new CtaButtonMessageAccessory(var1.getChannelId-o4g7jtM(), var1.getId-3Eiw7ao(), var51, null));
      }

      val var52: EphemeralIndication = var1.getEphemeralIndication();
      if (var52 != null) {
         this.accessories.add(new EphemeralIndicationMessageAccessory(var1.getId-3Eiw7ao(), var52, var70));
      }

      val var53: SurveyIndication = var1.getSurveyIndication();
      if (var53 != null) {
         this.accessories.add(new SurveyIndicationMessageAccessory(var1.getId-3Eiw7ao(), var53, var70));
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

      val var26: SafetyPolicyNoticeEmbed = var1.getSafetyPolicyNoticeEmbed();
      if (var26 != null) {
         this.accessories.add(new SafetyPolicyNoticeMessageAccessory(var1.getId-3Eiw7ao(), var26, var70));
      }

      val var27: SafetySystemNotificationEmbed = var1.getSafetySystemNotificationEmbed();
      if (var27 != null) {
         this.accessories.add(new SafetySystemNotificationMessageAccessory(var1.getId-3Eiw7ao(), var27, var70));
      }

      val var28: ForwardInfo = var1.getForwardInfo();
      if (var28 != null && var28.getFooterInfo() != null) {
         this.accessories.add(new ForwardBreadcrumbMessageAccessory(var1.getId-3Eiw7ao(), var1.getChannelId-o4g7jtM(), var1.getForwardInfo(), null));
      }

      if (var1.getForwardInfo() != null) {
         CollectionsKt.A(this.accessories, new l1(new k1()));
      }

      return this.accessories;
   }

   @JvmStatic
   fun `generateMessageAccessories$getLongClickListener`(var0: Function6, var1: Message, var2: Int, var3: MediaType): OnLongClickListener {
      return if (var0 != null) new a1(var0, var1, var2, var3) else null;
   }

   @JvmStatic
   fun `generateMessageAccessories$getLongClickListener$lambda$19$lambda$18`(var0: Function6, var1: Message, var2: Int, var3: MediaType, var4: View): Boolean {
      var0.invoke(MessageId.box-impl(var1.getId-3Eiw7ao()), ChannelId.box-impl(var1.getChannelId-o4g7jtM()), var2, var3, null, null);
      return true;
   }

   @JvmStatic
   fun `generateMessageAccessories$lambda$43`(var0: MessageAccessory, var1: MessageAccessory): Int {
      if (!var0.isForwardInner() && var1.isForwardInner()) {
         return 1;
      } else {
         return if (var0.isForwardInner() && !var1.isForwardInner()) -1 else 0;
      }
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
      onChainPart: () -> com.discord.chat.presentation.message.MessageView.ChainPart = new b1(),
      allowChildGestures: Boolean = true,
      renderContentOnly: Boolean = false
   ) {
      this.bindKey(MessageId.box-impl(var1.getId-3Eiw7ao()));
      var var13: java.lang.String = this.messageId;
      val var14: java.lang.String = var1.getId-3Eiw7ao();
      val var10: Boolean;
      if (var13 == null) {
         var10 = false;
      } else {
         var10 = MessageId.equals-impl0(var13, var14);
      }

      this.messageId = var1.getId-3Eiw7ao();
      var var30: j1 = null;
      if (!var10 && var2.getContextType() === MessageContextType.SEARCH) {
         MessageAccessoriesView.clear$default(this.binding.accessoriesView, false, 1, null);
      }

      this.onChainPart = var6;
      this.setOnInitiateReply(new t0(var4, var1));
      this.onInitiateThread = new e1(var4, var1);
      this.setOnInitiateEdit(new f1(var4, var1));
      this.setEnableSwipeToReply(var2.getEnableSwipeToReply());
      this.setEnableSwipeToEdit(var2.getEnableSwipeToEdit());
      this.setUsingGradientTheme(var2.getUsingGradientTheme());
      this.allowChildGestures = var7;
      val var15: MessageView.ChainPart = var6.invoke() as MessageView.ChainPart;
      val var19: Int = var1.getTimestampColor();
      if (var19 != null) {
         this.binding.timestamp.setTextColor(var19.intValue());
      }

      if (var3 != null && var3 !is UnknownMessageFrame) {
         val var21: MessageFrameHeaderView = this.binding.messageFrameHeader;
         var21.setVisibility(0);
         this.binding.messageFrameHeader.configure(var3);
      } else {
         val var20: MessageFrameHeaderView = this.binding.messageFrameHeader;
         var20.setVisibility(8);
      }

      this.configureDivider(var2.getShowDivider());
      var13 = var1.getThreadStarterMessageHeader();
      if (var13 != null) {
         if (this.threadStarterMessageHeaderView == null) {
            this.initThreadStarterMessageHeaderView();
         }

         val var22: ThreadStarterMessageHeaderView = this.getThreadStarterMessageHeaderView();
         if (var1.getReferencedMessage() != null) {
            var7 = true;
         } else {
            var7 = false;
         }

         var22.configure(var13, var7);
      } else if (this.threadStarterMessageHeaderView != null) {
         this.getThreadStarterMessageHeaderView().setVisibility(8);
      }

      if (var1.getReferencedMessage() != null) {
         if (this.replyPreview == null) {
            this.initReplyView();
         }

         MessageViewReplyPreview.configureReply$default(this.getReplyPreview(), var1.getReferencedMessage(), false, new g1(var4, var1), 2, null);
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
      val var24: h1;
      if (var23 != null) {
         var24 = new h1(var23, var1);
      } else {
         var24 = null;
      }

      val var28: Function6 = var4.getOnMessageLongPressed();
      val var29: i1;
      if (var28 != null) {
         var29 = new i1(var28, var1);
      } else {
         var29 = null;
      }

      val var16: Function2 = var4.getOnMessageDoubleTapped();
      if (var16 != null) {
         var30 = new j1(var16, var1);
      }

      NestedScrollOnTouchUtilsKt.setOnDoubleClickListenerNested(this, true, var30);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested(this, true, var24);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested(this, true, var29);
      val var17: java.util.List = this.generateMessageAccessories(var1, var2, var3, var4.getOnMessageLongPressed());
      val var31: MessageAccessoriesView = this.binding.accessoriesView;
      val var32: java.lang.String = var1.getId-3Eiw7ao();
      val var11: Long = var1.getChannelId-o4g7jtM();
      val var18: GuildId = var1.getGuildId-qOKuAAo();
      if (var1.getForwardInfo() != null) {
         var7 = true;
      } else {
         var7 = false;
      }

      var31.setAccessories-mFdI1tY(var32, var11, var18, var17, var4, var5, var2, var8, var7);
      this.configureAccessoriesMargin(var17);
      this.configureCommunicationDisabled(var1.getCommunicationDisabled() == java.lang.Boolean.TRUE, var15);
      this.configureSuppressNotifications(MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.SUPPRESS_NOTIFICATIONS), var4, var15);
      if (var2.getContextType() === MessageContextType.SEARCH) {
         this.hideHeader();
      } else {
         this.configureAuthor(var1, var4, var15);
      }

      androidx.core.view.h0.n0(this, new MessageViewAccessibilityDelegate(var1, var24, var29));
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
            throw new ht.p();
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
         $ENTRIES = pt.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }
}
