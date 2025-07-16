package com.discord.chat.presentation.message

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Point
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.View.OnLongClickListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.activity_invites.ActivityInviteEmbedView
import com.discord.activity_invites.ActivityRichPresenceInviteEmbedView
import com.discord.chat.R
import com.discord.chat.bridge.MediaType
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
import com.discord.chat.bridge.ctabutton.CtaButton
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.chat.bridge.safetysystemnotification.SafetySystemNotificationEmbed
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.bridge.sticker.Sticker
import com.discord.chat.bridge.voiceinviteembed.VoiceInviteEmbed
import com.discord.chat.databinding.TimestampViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.invitetospeak.InviteToSpeakView
import com.discord.chat.presentation.message.messagepart.ActivityInstanceEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.ActivityInviteEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.ActivityRichPresenceInviteEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.AppMessageEmbedAccessory
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.AutoModerationNotificationEmbedAccessory
import com.discord.chat.presentation.message.messagepart.ChannelPromptActionsAccessory
import com.discord.chat.presentation.message.messagepart.CtaButtonMessageAccessory
import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.EmbeddedActivityInviteMessageAccessory
import com.discord.chat.presentation.message.messagepart.EphemeralIndicationMessageAccessory
import com.discord.chat.presentation.message.messagepart.FileAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.FlaggedMessageActionBarAccessory
import com.discord.chat.presentation.message.messagepart.FlaggedMessageEmbedAccessory
import com.discord.chat.presentation.message.messagepart.ForumPostActionBar
import com.discord.chat.presentation.message.messagepart.ForwardBreadcrumbMessageAccessory
import com.discord.chat.presentation.message.messagepart.ForwardHeaderMessageAccessory
import com.discord.chat.presentation.message.messagepart.GiftMessageAccessory
import com.discord.chat.presentation.message.messagepart.GuildEventInviteMessageAccessory
import com.discord.chat.presentation.message.messagepart.GuildInviteDisabledMessageAccessory
import com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory
import com.discord.chat.presentation.message.messagepart.GuildProfileInviteMessageAccessory
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.InfoLinkMessageAccessory
import com.discord.chat.presentation.message.messagepart.InteractionStatusMessageAccessory
import com.discord.chat.presentation.message.messagepart.InviteToSpeakAccessory
import com.discord.chat.presentation.message.messagepart.MediaMosaicAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageComponentsAccessory
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory
import com.discord.chat.presentation.message.messagepart.PostPreviewEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.ReactionsMessageAccessory
import com.discord.chat.presentation.message.messagepart.ReferralMessageAccessory
import com.discord.chat.presentation.message.messagepart.RoleSubscriptionPurchaseAccessory
import com.discord.chat.presentation.message.messagepart.SafetyPolicyNoticeMessageAccessory
import com.discord.chat.presentation.message.messagepart.SafetySystemNotificationMessageAccessory
import com.discord.chat.presentation.message.messagepart.StickerMessageAccessory
import com.discord.chat.presentation.message.messagepart.SurveyIndicationMessageAccessory
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.TimestampMessageAccessory
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.VoiceInviteMessageAccessory
import com.discord.chat.presentation.message.messagepart.WelcomeStickerAccessory
import com.discord.chat.presentation.message.view.ActivityInstanceEmbedView
import com.discord.chat.presentation.message.view.AppMessageEmbedView
import com.discord.chat.presentation.message.view.AutoModerationNotificationEmbedView
import com.discord.chat.presentation.message.view.ChannelPromptActionsView
import com.discord.chat.presentation.message.view.CtaButtonView
import com.discord.chat.presentation.message.view.EmbedView
import com.discord.chat.presentation.message.view.EmbeddedActivityInviteView
import com.discord.chat.presentation.message.view.EphemeralIndicationView
import com.discord.chat.presentation.message.view.FileAttachmentView
import com.discord.chat.presentation.message.view.FlaggedMessageActionBarView
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedView
import com.discord.chat.presentation.message.view.ForumPostActionBarView
import com.discord.chat.presentation.message.view.ForwardBreadcrumbView
import com.discord.chat.presentation.message.view.ForwardHeaderView
import com.discord.chat.presentation.message.view.GiftView
import com.discord.chat.presentation.message.view.GuildEventInviteView
import com.discord.chat.presentation.message.view.GuildInviteDisabledView
import com.discord.chat.presentation.message.view.GuildInviteView
import com.discord.chat.presentation.message.view.GuildProfileInviteView
import com.discord.chat.presentation.message.view.InfoLinkView
import com.discord.chat.presentation.message.view.InteractionStatusView
import com.discord.chat.presentation.message.view.MediaImageView
import com.discord.chat.presentation.message.view.MediaVideoView
import com.discord.chat.presentation.message.view.MessageContentView
import com.discord.chat.presentation.message.view.PostPreviewEmbedView
import com.discord.chat.presentation.message.view.ReferralView
import com.discord.chat.presentation.message.view.RoleSubscriptionPurchaseView
import com.discord.chat.presentation.message.view.SafetyPolicyNoticeView
import com.discord.chat.presentation.message.view.SafetySystemNotificationView
import com.discord.chat.presentation.message.view.SurveyIndicationView
import com.discord.chat.presentation.message.view.ThreadEmbedView
import com.discord.chat.presentation.message.view.VoiceInviteEmbedView
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.MessageComponentsView
import com.discord.chat.presentation.message.view.mosaic.AttachmentMediaMosaicContainerView
import com.discord.chat.presentation.message.view.polls.PollImageOnlyView
import com.discord.chat.presentation.message.view.polls.PollTextAndImageView
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView
import com.discord.chat.presentation.message.viewholder.ActivityInstanceEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.ActivityInviteEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.AppMessageEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.AttachmentMediaMosaicViewHolder
import com.discord.chat.presentation.message.viewholder.AudioPlayerViewHolder
import com.discord.chat.presentation.message.viewholder.AutoModerationNotificationEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.ChannelPromptActionsViewHolder
import com.discord.chat.presentation.message.viewholder.CtaButtonViewHolder
import com.discord.chat.presentation.message.viewholder.EmbedViewHolder
import com.discord.chat.presentation.message.viewholder.EmbeddedActivityInviteViewHolder
import com.discord.chat.presentation.message.viewholder.EphemeralIndicationViewHolder
import com.discord.chat.presentation.message.viewholder.FileAttachmentViewHolder
import com.discord.chat.presentation.message.viewholder.FlaggedMessageActionBarViewHolder
import com.discord.chat.presentation.message.viewholder.FlaggedMessageEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.ForumPostActionBarViewHolder
import com.discord.chat.presentation.message.viewholder.ForwardBreadcrumbViewHolder
import com.discord.chat.presentation.message.viewholder.ForwardHeaderViewHolder
import com.discord.chat.presentation.message.viewholder.GiftViewHolder
import com.discord.chat.presentation.message.viewholder.GuildEventInviteViewHolder
import com.discord.chat.presentation.message.viewholder.GuildInviteDisabledViewHolder
import com.discord.chat.presentation.message.viewholder.GuildInviteViewHolder
import com.discord.chat.presentation.message.viewholder.GuildProfileInviteViewHolder
import com.discord.chat.presentation.message.viewholder.InfoLinkViewHolder
import com.discord.chat.presentation.message.viewholder.InteractionStatusViewHolder
import com.discord.chat.presentation.message.viewholder.InviteToSpeakViewHolder
import com.discord.chat.presentation.message.viewholder.MessageComponentsViewHolder
import com.discord.chat.presentation.message.viewholder.MessageContentViewHolder
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder
import com.discord.chat.presentation.message.viewholder.PollViewHolder
import com.discord.chat.presentation.message.viewholder.PostPreviewEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.ReactionsViewHolder
import com.discord.chat.presentation.message.viewholder.ReferralViewHolder
import com.discord.chat.presentation.message.viewholder.RoleSubscriptionPurchaseViewHolder
import com.discord.chat.presentation.message.viewholder.SafetyPolicyNoticeViewHolder
import com.discord.chat.presentation.message.viewholder.SafetySystemNotificationViewHolder
import com.discord.chat.presentation.message.viewholder.StickerApngViewHolder
import com.discord.chat.presentation.message.viewholder.StickerGifViewHolder
import com.discord.chat.presentation.message.viewholder.StickerLottieViewHolder
import com.discord.chat.presentation.message.viewholder.StickerPartViewHolder
import com.discord.chat.presentation.message.viewholder.StickerPngViewHolder
import com.discord.chat.presentation.message.viewholder.SurveyIndicationViewHolder
import com.discord.chat.presentation.message.viewholder.ThreadEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.TimestampViewHolder
import com.discord.chat.presentation.message.viewholder.VoiceInviteEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.WelcomeStickerViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentImageViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentVideoViewHolder
import com.discord.chat.presentation.stickers.WelcomeStickerView
import com.discord.chat.reactevents.ViewResizeMode
import com.discord.misc.utilities.kotlin.ForceExhaustiveKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewLocationUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.reactions.ReactionView
import com.discord.reactions.ShortcutsFlexbox
import com.discord.sticker.StickerView
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4
import kotlin.jvm.functions.Function6
import kotlin.jvm.functions.Function8

public class MessageAccessoriesAdapter(measureAndLayout: () -> Unit = new f()) : RecyclerView.Adapter {
   private final val measureAndLayout: () -> Unit
   private final lateinit var eventHandler: ChatEventHandler
   private final var botComponentProvider: ComponentProvider?
   private final var recyclerViewPool: RecycledViewPool?
   private final var items: List<MessageAccessory>
   private final var messageId: MessageId?
   private final var channelId: ChannelId?
   private final var guildId: GuildId?
   private final var onTapSpoiler: (MessagePartViewHolder) -> Unit

   fun MessageAccessoriesAdapter() {
      this(null, 1, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "measureAndLayout");
      super();
      this.measureAndLayout = var1;
      this.items = kotlin.collections.i.k();
      this.onTapSpoiler = new N(this);
      this.setHasStableIds(true);
   }

   @JvmStatic
   fun `_init_$lambda$0`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$10`(var0: MessageAccessoriesAdapter, var1: java.lang.String): Unit {
      var var2: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var2 = null;
      }

      var2.onTapReferralRedeem(null);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$11`(var0: MessageAccessoriesAdapter, var1: MessageAccessory, var2: java.lang.String): Unit {
      kotlin.jvm.internal.r.h(var2, "giftCode");
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      var4.onTapGiftCodeAccept-NU4t8f8(var2, (var1 as GiftMessageAccessory).getMessageId-3Eiw7ao());
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$12`(var0: MessageAccessoriesAdapter, var1: MessagePartViewHolder): Unit {
      var0.onTapSpoiler.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$13`(var0: MessageAccessoriesAdapter, var1: Int, var2: MessageAccessory, var3: MessagePartViewHolder): Unit {
      kotlin.jvm.internal.r.h(var2, "attachment");
      kotlin.jvm.internal.r.h(var3, "attachmentViewHolder");
      val var4: View = var3.itemView;
      kotlin.jvm.internal.r.g(var3.itemView, "itemView");
      val var7: java.lang.String = var2.getMessageId-3Eiw7ao();
      val var6: java.lang.Double;
      if (var2 is ImageAttachmentMessageAccessory) {
         var6 = null;
      } else {
         if (var2 !is VideoAttachmentMessageAccessory) {
            val var5: StringBuilder = new StringBuilder();
            var5.append("Unsupported accessory: ");
            var5.append(var2);
            throw new IllegalStateException(var5.toString().toString());
         }

         var6 = (var2 as VideoAttachmentMessageAccessory).getPortal();
      }

      var0.onMediaClicked-mdVZsaY(var4, var7, "attachment", ViewResizeMode.Cover, var6, var1, null, null, null);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$15$lambda$14`(var0: Function4, var1: Int): Unit {
      var0.invoke(MediaType.Attachment, var1, null, null);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$16`(var0: MessageAccessoriesAdapter, var1: MessagePartViewHolder): Unit {
      var0.onTapSpoiler.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$17`(var0: MessageAccessoriesAdapter, var1: MessageAccessory, var2: Boolean): Unit {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      var4.onTapObscuredMediaToggle-ZQwuxwg(
         (var1 as MediaMosaicAttachmentMessageAccessory).getMessageId-3Eiw7ao(),
         (var1 as MediaMosaicAttachmentMessageAccessory).getChannelId-o4g7jtM(),
         var2,
         null,
         null
      );
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$18`(var0: MessageAccessoriesAdapter, var1: View) {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      val var3: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      ChatEventHandler.DefaultImpls.onTapReaction-AFFcxXc$default(var4, var3, null, null, "Message Shortcut", 4, null);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$19`(var0: MessageAccessoriesAdapter, var1: View) {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      val var3: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      ChatEventHandler.DefaultImpls.onTapReaction-AFFcxXc$default(var4, var3, null, java.lang.Boolean.TRUE, null, 8, null);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$20`(var0: MessageAccessoriesAdapter, var1: ReactionView.Reaction): Unit {
      kotlin.jvm.internal.r.h(var1, "reaction");
      var var2: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var2 = null;
      }

      val var4: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      ChatEventHandler.DefaultImpls.onTapReaction-AFFcxXc$default(var2, var4, var1, null, null, 12, null);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$21`(var0: MessageAccessoriesAdapter, var1: ReactionView.Reaction): Unit {
      kotlin.jvm.internal.r.h(var1, "reaction");
      var var2: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var2 = null;
      }

      val var5: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      val var4: ChannelId = var0.channelId;
      kotlin.jvm.internal.r.e(var0.channelId);
      var2.onLongPressReaction-Eqy5D80(var5, var4.unbox-impl(), var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$22`(var0: MessageAccessoriesAdapter, var1: View) {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      val var5: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      val var3: ChannelId = var0.channelId;
      kotlin.jvm.internal.r.e(var0.channelId);
      var4.onInitiateReply-8a0ehIg(var5, var3.unbox-impl(), java.lang.Boolean.TRUE, "message_shortcut");
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$23`(var0: MessageAccessoriesAdapter, var1: MessageAccessory, var2: View) {
      var var9: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var9 = null;
      }

      val var10: ChannelId = var0.channelId;
      kotlin.jvm.internal.r.e(var0.channelId);
      val var3: Long = var10.unbox-impl();
      val var11: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      val var6: ReactionsMessageAccessory = var1 as ReactionsMessageAccessory;
      val var8: java.lang.String = (var1 as ReactionsMessageAccessory).getTargetKind();
      var var7: java.lang.String = var8;
      if (var8 == null) {
         var7 = "";
      }

      var9.onTapInlineForward-j8a4Y88(var3, var11, var7, var6.getEmbedIndex(), java.lang.Boolean.TRUE, "message-shortcut");
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$24`(var0: MessageAccessoriesAdapter, var1: View) {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      val var5: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      val var3: ChannelId = var0.channelId;
      kotlin.jvm.internal.r.e(var0.channelId);
      var4.onInitiateThread-pfaIj0E(var5, var3.unbox-impl());
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$25`(var0: MessageAccessoriesAdapter, var1: MessageAccessory, var2: Sticker): Unit {
      kotlin.jvm.internal.r.h(var2, "it");
      var var3: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var3 = null;
      }

      var3.onStickerClicked-Ayv7vGE((var1 as StickerMessageAccessory).getSticker(), (var1 as StickerMessageAccessory).getMessageId-3Eiw7ao());
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$26`(var0: MessageAccessoriesAdapter, var1: MessageAccessory, var2: Sticker): Unit {
      kotlin.jvm.internal.r.h(var2, "it");
      var var3: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var3 = null;
      }

      var3.onStickerLongClicked-Ayv7vGE((var1 as StickerMessageAccessory).getSticker(), (var1 as StickerMessageAccessory).getMessageId-3Eiw7ao());
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$27`(var0: MessageAccessoriesAdapter, var1: View) {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      val var5: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      val var3: ChannelId = var0.channelId;
      kotlin.jvm.internal.r.e(var0.channelId);
      var4.onTapFollowForumPost-pfaIj0E(var5, var3.unbox-impl());
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$28`(var0: MessageAccessoriesAdapter, var1: View) {
      var var6: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var6 = null;
      }

      val var7: ChannelId = var0.channelId;
      kotlin.jvm.internal.r.e(var0.channelId);
      val var2: Long = var7.unbox-impl();
      val var5: GuildId = var0.guildId;
      kotlin.jvm.internal.r.e(var0.guildId);
      var6.onTapShareForumPost-mgk6anA(var2, var5.unbox-impl());
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$29`(var0: MessageAccessoriesAdapter, var1: View) {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      val var3: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      ChatEventHandler.DefaultImpls.onTapReaction-AFFcxXc$default(var4, var3, null, null, null, 12, null);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$30`(var0: MessageAccessoriesAdapter, var1: View) {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      val var5: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      val var3: ChannelId = var0.channelId;
      kotlin.jvm.internal.r.e(var0.channelId);
      var4.onTapReactionOverflow-pfaIj0E(var5, var3.unbox-impl());
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$31`(var0: MessageAccessoriesAdapter, var1: ReactionView.Reaction): Unit {
      kotlin.jvm.internal.r.h(var1, "reaction");
      var var2: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var2 = null;
      }

      val var4: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      ChatEventHandler.DefaultImpls.onTapReaction-AFFcxXc$default(var2, var4, var1, null, null, 12, null);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$32`(var0: MessageAccessoriesAdapter, var1: ReactionView.Reaction): Unit {
      kotlin.jvm.internal.r.h(var1, "reaction");
      var var2: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var2 = null;
      }

      val var5: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      val var4: ChannelId = var0.channelId;
      kotlin.jvm.internal.r.e(var0.channelId);
      var2.onLongPressReaction-Eqy5D80(var5, var4.unbox-impl(), var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$34`(var0: MessageAccessoriesAdapter, var1: View) {
      if (var0.messageId != null) {
         var var3: ChatEventHandler = var0.eventHandler;
         if (var0.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var3 = null;
         }

         var3.onTapDismissMediaPostSharePrompt-1xi1bu0(var0.messageId);
      }
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$35`(var0: MessageAccessoriesAdapter, var1: java.lang.String, var2: java.lang.String): Unit {
      kotlin.jvm.internal.r.h(var1, "url");
      kotlin.jvm.internal.r.h(var2, "filename");
      var var3: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var3 = null;
      }

      val var5: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      var3.onLinkClicked-u7_MRrM(var5, var1, var2);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$36`(var0: MessageAccessoriesAdapter, var1: MessagePartViewHolder): Unit {
      var0.onTapSpoiler.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$38$lambda$37`(var0: Function4, var1: java.lang.String, var2: Int): Unit {
      kotlin.jvm.internal.r.h(var1, "componentId");
      var0.invoke(MediaType.Component, null, var1, var2);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$39`(
      var0: MessageAccessory, var1: MessageAccessoriesAdapter, var2: View, var3: java.lang.String, var4: Int, var5: java.lang.Double
   ): Unit {
      kotlin.jvm.internal.r.h(var2, "view");
      kotlin.jvm.internal.r.h(var3, "componentId");
      var1.onMediaClicked-mdVZsaY(
         var2, (var0 as MessageComponentsAccessory).getMessageId-3Eiw7ao(), "component", ViewResizeMode.Fill, var5, 0, null, var3, var4
      );
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$4$lambda$3`(var0: Function6, var1: MessageAccessoriesAdapter, var2: MediaType, var3: Int, var4: java.lang.String, var5: Int): Unit {
      kotlin.jvm.internal.r.h(var2, "mediaType");
      val var6: java.lang.String = var1.messageId;
      kotlin.jvm.internal.r.e(var1.messageId);
      val var8: MessageId;
      if (var6 != null) {
         var8 = MessageId.box-impl(var6);
      } else {
         var8 = null;
      }

      val var7: ChannelId = var1.channelId;
      kotlin.jvm.internal.r.e(var1.channelId);
      var0.invoke(var8, var7, var3, var2, var4, var5);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$40`(var0: MessageAccessoriesAdapter, var1: MessagePartViewHolder): Unit {
      var0.onTapSpoiler.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$41`(var0: MessageAccessoriesAdapter, var1: MessageAccessory, var2: Boolean): Unit {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      var4.onTapObscuredMediaToggle-ZQwuxwg(
         (var1 as MessageComponentsAccessory).getMessageId-3Eiw7ao(),
         (var1 as MessageComponentsAccessory).getMessage().getChannelId-o4g7jtM(),
         var2,
         null,
         null
      );
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$43$lambda$42`(var0: Function4, var1: java.lang.String, var2: Int): Unit {
      kotlin.jvm.internal.r.h(var1, "componentId");
      var0.invoke(MediaType.Attachment, null, var1, var2);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$44`(var0: MessageAccessoriesAdapter, var1: MessagePartViewHolder): Unit {
      var0.onTapSpoiler.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$45`(var0: MessageAccessoriesAdapter, var1: MessageAccessory, var2: Boolean): Unit {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      var4.onTapObscuredMediaToggle-ZQwuxwg(
         (var1 as PostPreviewEmbedMessageAccessory).getMessageId-3Eiw7ao(),
         (var1 as PostPreviewEmbedMessageAccessory).getPostPreviewEmbed().getThreadId-o4g7jtM(),
         var2,
         null,
         null
      );
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$5`(var0: MessageAccessoriesAdapter, var1: MessagePartViewHolder): Unit {
      var0.onTapSpoiler.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$6`(var0: MessageAccessoriesAdapter, var1: MessageAccessory, var2: Boolean): Unit {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      var4.onTapObscuredMediaToggle-ZQwuxwg(
         (var1 as EmbedMessageAccessory).getMessageId-3Eiw7ao(),
         (var1 as EmbedMessageAccessory).getChannelId-o4g7jtM(),
         var2,
         null,
         (var1 as EmbedMessageAccessory).getEmbed().getId()
      );
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$7`(var0: MessageAccessoriesAdapter, var1: MessagePartViewHolder): Unit {
      var0.onTapSpoiler.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$8`(var0: MessagePartViewHolder, var1: MessageAccessory, var2: MessageAccessoriesAdapter, var3: java.lang.Double, var4: Int): Unit {
      val var7: View = var0.itemView;
      kotlin.jvm.internal.r.g(var0.itemView, "itemView");
      var2.onMediaClicked-mdVZsaY(
         var7,
         (var1 as EmbedMessageAccessory).getMessageId-3Eiw7ao(),
         "embed",
         ViewResizeMode.Fill,
         var3,
         (var1 as EmbedMessageAccessory).getIndex(),
         var4,
         null,
         null
      );
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$9`(var0: MessageAccessoriesAdapter, var1: MessageAccessory): Unit {
      var var3: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var3 = null;
      }

      var3.onTapObscuredMediaLearnMore-8a0ehIg(
         (var1 as InfoLinkMessageAccessory).getMessageId-3Eiw7ao(),
         (var1 as InfoLinkMessageAccessory).getChannelId-o4g7jtM(),
         (var1 as InfoLinkMessageAccessory).getAttachmentId(),
         (var1 as InfoLinkMessageAccessory).getEmbedId()
      );
      return Unit.a;
   }

   @JvmStatic
   fun `onCreateViewHolder$lambda$2`(var0: MessageAccessoriesAdapter, var1: MessagePartViewHolder): Unit {
      kotlin.jvm.internal.r.h(var1, "holder");
      var0.onTapSpoiler.invoke(var1);
      return Unit.a;
   }

   private fun View.onMediaClicked(
      messageId: MessageId,
      type: String,
      viewResizeMode: ViewResizeMode,
      portal: Double?,
      attachmentIndex: Int,
      embedIndex: Int?,
      componentId: String?,
      componentMediaIndex: Int?
   ) {
      val var12: Point = ViewLocationUtilsKt.getLocationInWindow(var1);
      var var10: ChatEventHandler = this.eventHandler;
      if (this.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var10 = null;
      }

      var10.onTapImage-JR3bP6M(
         var2,
         var6,
         var3,
         (int)SizeUtilsKt.getPxToDp(var1.getWidth()),
         (int)SizeUtilsKt.getPxToDp(var1.getHeight()),
         (int)SizeUtilsKt.getPxToDp(var12.x),
         (int)SizeUtilsKt.getPxToDp(var12.y),
         var4,
         var5,
         var7,
         var8,
         var9
      );
   }

   @JvmStatic
   fun `onTapSpoiler$lambda$1`(var0: MessageAccessoriesAdapter, var1: MessagePartViewHolder): Unit {
      kotlin.jvm.internal.r.h(var1, "holder");
      var0.notifyItemChanged(var1.getBindingAdapterPosition());
      var0.measureAndLayout.invoke();
      return Unit.a;
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun clear() {
      this.items = kotlin.collections.i.k();
      this.messageId = null;
      this.channelId = null;
      this.guildId = null;
      this.notifyDataSetChanged();
   }

   public override fun getItemCount(): Int {
      return this.items.size();
   }

   public override fun getItemId(position: Int): Long {
      return this.items.get(var1).getItemId();
   }

   public override fun getItemViewType(position: Int): Int {
      val var3: MessageAccessory = this.items.get(var1);
      val var2: Boolean = var3 is EmbedMessageAccessory;
      var var4: Int = 1;
      if (!var2) {
         if (var3 is GiftMessageAccessory) {
            var4 = 16;
         } else if (var3 is ReferralMessageAccessory) {
            var4 = 52;
         } else if (var3 is MessageContentAccessory) {
            var4 = 0;
         } else if (var3 is GuildInviteMessageAccessory) {
            var4 = 5;
         } else if (var3 is AppMessageEmbedAccessory) {
            var4 = 54;
         } else if (var3 is ActivityInstanceEmbedMessageAccessory) {
            var4 = 40;
         } else if (var3 is EmbeddedActivityInviteMessageAccessory) {
            var4 = 31;
         } else if (var3 is GuildInviteDisabledMessageAccessory) {
            var4 = 25;
         } else if (var3 is GuildEventInviteMessageAccessory) {
            var4 = 15;
         } else if (var3 is ReactionsMessageAccessory) {
            var4 = 4;
         } else if (var3 is StickerMessageAccessory) {
            var4 = MessageAccessoriesAdapter.WhenMappings.$EnumSwitchMapping$0[(var3 as StickerMessageAccessory).getSticker().getFormatType().ordinal()];
            if (var4 != 1) {
               if (var4 != 2) {
                  if (var4 != 3) {
                     if (var4 != 4) {
                        throw new z9.n();
                     }

                     var4 = 27;
                  } else {
                     var4 = 8;
                  }
               } else {
                  var4 = 7;
               }
            } else {
               var4 = 6;
            }
         } else if (var3 is ThreadEmbedMessageAccessory) {
            var4 = 9;
         } else if (var3 is FileAttachmentMessageAccessory) {
            var4 = 11;
         } else if (var3 is MessageComponentsAccessory) {
            var4 = 12;
         } else if (var3 is TimestampMessageAccessory) {
            var4 = 13;
         } else if (var3 is WelcomeStickerAccessory) {
            var4 = 14;
         } else if (var3 is ActivityInviteEmbedMessageAccessory) {
            var4 = 17;
         } else if (var3 is ActivityRichPresenceInviteEmbedMessageAccessory) {
            var4 = 55;
         } else if (var3 is EphemeralIndicationMessageAccessory) {
            var4 = 18;
         } else if (var3 is SurveyIndicationMessageAccessory) {
            var4 = 24;
         } else if (var3 is InteractionStatusMessageAccessory) {
            var4 = 19;
         } else if (var3 is ForumPostActionBar) {
            var4 = 20;
         } else if (var3 is FlaggedMessageEmbedAccessory) {
            var4 = 21;
         } else if (var3 is FlaggedMessageActionBarAccessory) {
            var4 = 22;
         } else if (var3 is AutoModerationNotificationEmbedAccessory) {
            var4 = 33;
         } else if (var3 is RoleSubscriptionPurchaseAccessory) {
            var4 = 23;
         } else if (var3 is MediaMosaicAttachmentMessageAccessory) {
            var4 = 26;
         } else if (var3 is InviteToSpeakAccessory) {
            var4 = 28;
         } else if (var3 is AudioAttachmentMessageAccessory) {
            var4 = 29;
         } else if (var3 is PostPreviewEmbedMessageAccessory) {
            var4 = 32;
         } else if (var3 is ChannelPromptActionsAccessory) {
            var4 = 34;
         } else if (var3 is InfoLinkMessageAccessory) {
            var4 = 35;
         } else if (var3 is SafetyPolicyNoticeMessageAccessory) {
            var4 = 36;
         } else if (var3 is SafetySystemNotificationMessageAccessory) {
            var4 = 39;
         } else if (var3 is PollMessageAccessory) {
            var4 = MessageAccessoriesAdapter.WhenMappings.$EnumSwitchMapping$1[(var3 as PollMessageAccessory).getData().getLayoutType().ordinal()];
            if (var4 == 1) {
               throw new IllegalStateException("UNKNOWN Layouts should not be presented");
            }

            if (var4 != 2) {
               if (var4 != 3) {
                  throw new z9.n();
               }

               var4 = 38;
            } else {
               var4 = 37;
            }
         } else if (var3 is CtaButtonMessageAccessory) {
            var4 = 41;
         } else if (var3 is VoiceInviteMessageAccessory) {
            var4 = 42;
         } else if (var3 is ForwardHeaderMessageAccessory) {
            var4 = 43;
         } else if (var3 is ForwardBreadcrumbMessageAccessory) {
            var4 = 44;
         } else {
            if (var3 !is GuildProfileInviteMessageAccessory) {
               if (var3 !is ImageAttachmentMessageAccessory) {
                  if (var3 is VideoAttachmentMessageAccessory) {
                     throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
                  }

                  throw new z9.n();
               }

               throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
            }

            var4 = 53;
         }
      }

      return var4;
   }

   public open fun onBindViewHolder(holder: MessagePartViewHolder, position: Int) {
      kotlin.jvm.internal.r.h(var1, "holder");
      var var8: ChatEventHandler = this.eventHandler;
      if (this.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var8 = null;
      }

      val var51: Function6 = var8.getOnMessageLongPressed();
      val var52: q;
      if (var51 != null) {
         var52 = new q(var51, this);
      } else {
         var52 = null;
      }

      val var10: MessageAccessory = this.items.get(var2);
      if (var10 is EmbedMessageAccessory) {
         val var11: EmbedViewHolder = var1 as EmbedViewHolder;
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var13: EmbedMessageAccessory = var10 as EmbedMessageAccessory;
         val var5: Int = var1.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_max_height);
         var2 = var13.getRadiusPx();
         val var12: OnLongClickListener = var13.getOnLongClick();
         val var96: SpoilerAttributes = var13.getSpoilerAttributes();
         val var97: SpoilerConfig;
         if (var96 != null) {
            var97 = var96.configure(new i(this, var1), new u(this, var10));
         } else {
            var97 = null;
         }

         var11.bind(var8, var13, var5, var2, new E(this, var1), var97, new F(var1, var10, this), var12, var13.getPortal());
      } else if (var10 is InfoLinkMessageAccessory) {
         (var1 as InfoLinkViewHolder).bind((var10 as InfoLinkMessageAccessory).getText(), (var10 as InfoLinkMessageAccessory).getIcon(), new G(this, var10));
      } else if (var10 is ReferralMessageAccessory) {
         (var1 as ReferralViewHolder).bind(var10 as ReferralMessageAccessory, new H(this), new Function2(this) {
            final MessageAccessoriesAdapter this$0;

            {
               this.this$0 = var1;
            }

            public final void invoke_ntcYbpo/* $VF was: invoke-ntcYbpo*/(java.lang.String var1, LinkContentNode var2) {
               kotlin.jvm.internal.r.h(var1, "messageId");
               kotlin.jvm.internal.r.h(var2, "node");
               val var4: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
               var var3: ChatEventHandler = var4;
               if (var4 == null) {
                  kotlin.jvm.internal.r.y("eventHandler");
                  var3 = null;
               }

               var3.onLinkClicked-ntcYbpo(var1, var2);
            }
         });
      } else if (var10 is GiftMessageAccessory) {
         val var98: GiftViewHolder = var1 as GiftViewHolder;
         val var55: GiftMessageAccessory = var10 as GiftMessageAccessory;
         var var26: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var26 = null;
         }

         var98.bind(var55, new Function1(var26) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapGiftCodeEmbed", "onTapGiftCodeEmbed(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapGiftCodeEmbed(var1);
            }
         }, new I(this, var10));
      } else if (var10 is MessageContentAccessory) {
         val var148: MessageContentViewHolder = var1 as MessageContentViewHolder;
         val var132: MessageContentAccessory = var10 as MessageContentAccessory;
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var158: Function2 = new Function2(var8) {
            {
               super(
                  2,
                  var1,
                  ChatEventHandler::class.java,
                  "onLinkClicked",
                  "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V",
                  0
               );
            }

            public final void invoke_ntcYbpo/* $VF was: invoke-ntcYbpo*/(java.lang.String var1, LinkContentNode var2) {
               kotlin.jvm.internal.r.h(var1, "p0");
               kotlin.jvm.internal.r.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLinkClicked-ntcYbpo(var1, var2);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var164: Function1 = new Function1(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
            }

            public final void invoke(LinkContentNode var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLinkLongClicked(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var14: Function3 = new Function3(var8) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapChannel(var1, var2, var3);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var15: Function4 = new Function4(var8) {
            {
               super(
                  4,
                  var1,
                  ChatEventHandler::class.java,
                  "onLongPressChannel",
                  "onLongPressChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
                  0
               );
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3, java.lang.String var4) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLongPressChannel(var1, var2, var3, var4);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var16: Function1 = new Function1(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapAttachmentLink", "onTapAttachmentLink(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAttachmentLink(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var17: Function2 = new Function2(var8) {
            {
               super(2, var1, ChatEventHandler::class.java, "onLongPressAttachmentLink", "onLongPressAttachmentLink(Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2) {
               kotlin.jvm.internal.r.h(var1, "p0");
               kotlin.jvm.internal.r.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLongPressAttachmentLink(var1, var2);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var18: Function4 = new Function4(var8) {
            {
               super(
                  4,
                  var1,
                  ChatEventHandler::class.java,
                  "onTapMention",
                  "onTapMention(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
                  0
               );
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3, java.lang.String var4) {
               kotlin.jvm.internal.r.h(var2, "p1");
               (super.receiver as ChatEventHandler).onTapMention(var1, var2, var3, var4);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var19: Function1 = new Function1(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapCommand", "onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
            }

            public final void invoke(CommandMentionContentNode var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapCommand(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var20: Function1 = new Function1(var8) {
            {
               super(
                  1,
                  var1,
                  ChatEventHandler::class.java,
                  "onLongPressCommand",
                  "onLongPressCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V",
                  0
               );
            }

            public final void invoke(CommandMentionContentNode var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLongPressCommand(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var21: Function1 = new Function1(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapTimestamp", "onTapTimestamp(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapTimestamp(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var22: Function1 = new Function1(var8) {
            {
               super(
                  1, var1, ChatEventHandler::class.java, "onTapInlineCode", "onTapInlineCode(Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;)V", 0
               );
            }

            public final void invoke(InlineCodeContentNode var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapInlineCode(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var23: Function1 = new Function1(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapEmoji", "onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", 0);
            }

            public final void invoke(EmojiContentNode var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapEmoji(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var24: Function1 = new Function1(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapSeeMore", "onTapSeeMore-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapSeeMore-1xi1bu0(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         var148.bind(
            var132,
            var158,
            var164,
            var14,
            var15,
            var16,
            var17,
            var18,
            var19,
            var20,
            new J(this, var1),
            var21,
            var22,
            var23,
            var24,
            new Function1(var8) {
               {
                  super(
                     1, var1, ChatEventHandler::class.java, "onTapSoundmoji", "onTapSoundmoji(Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;)V", 0
                  );
               }

               public final void invoke(SoundmojiContentNode var1) {
                  kotlin.jvm.internal.r.h(var1, "p0");
                  (super.receiver as ChatEventHandler).onTapSoundmoji(var1);
               }
            }
         );
      } else if (var10 is MediaMosaicAttachmentMessageAccessory) {
         val var149: AttachmentMediaMosaicViewHolder = var1 as AttachmentMediaMosaicViewHolder;
         var var113: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var113 = null;
         }

         val var159: MediaMosaicAttachmentMessageAccessory = var10 as MediaMosaicAttachmentMessageAccessory;
         val var169: java.util.List = (var10 as MediaMosaicAttachmentMessageAccessory).getAttachments();
         val var165: K = new K(this);
         val var71: B;
         if (var52 != null) {
            var71 = new B(var52);
         } else {
            var71 = null;
         }

         var149.bind(
            var113,
            var169,
            var165,
            var71,
            new M(this, var1),
            new O(this, var10),
            var159.isForwardedContent(),
            var159.getShouldAutoPlayGif(),
            var159.getConstrainedWidth()
         );
      } else if (var10 is ReactionsMessageAccessory) {
         (var1 as ReactionsViewHolder)
            .bind(
               (var10 as ReactionsMessageAccessory).getReactions(),
               (var10 as ReactionsMessageAccessory).getCanAddNewReactions(),
               (var10 as ReactionsMessageAccessory).getCanAddNewBurstReactions(),
               (var10 as ReactionsMessageAccessory).getAddReactionLabel(),
               (var10 as ReactionsMessageAccessory).getAddNewReactionAccessibilityLabel(),
               (var10 as ReactionsMessageAccessory).getAddNewBurstReactionAccessibilityLabel(),
               (var10 as ReactionsMessageAccessory).getReactionsTheme(),
               new P(this),
               new Q(this),
               new S(this),
               new T(this),
               (var10 as ReactionsMessageAccessory).getTheme(),
               (var10 as ReactionsMessageAccessory).getShowReactionShortcut(),
               (var10 as ReactionsMessageAccessory).getShowReplyShortcut(),
               (var10 as ReactionsMessageAccessory).getShowForwardShortcut(),
               (var10 as ReactionsMessageAccessory).getShowThreadShortcut(),
               (var10 as ReactionsMessageAccessory).getShortcutsEnabled(),
               new U(this),
               new g(this, var10),
               new h(this),
               (var10 as ReactionsMessageAccessory).getReplyAccessibilityLabel(),
               (var10 as ReactionsMessageAccessory).getForwardAccessibilityLabel(),
               (var10 as ReactionsMessageAccessory).getThreadAccessibilityLabel()
            );
      } else if (var10 is StickerMessageAccessory) {
         (var1 as StickerPartViewHolder).bind((var10 as StickerMessageAccessory).getSticker(), new j(this, var10), new k(this, var10), 160, 160);
      } else if (var10 is GuildInviteMessageAccessory) {
         (var1 as GuildInviteViewHolder).bind(var10 as GuildInviteMessageAccessory);
      } else if (var10 is AppMessageEmbedAccessory) {
         (var1 as AppMessageEmbedViewHolder).bind(var10 as AppMessageEmbedAccessory);
      } else if (var10 is ActivityInstanceEmbedMessageAccessory) {
         (var1 as ActivityInstanceEmbedViewHolder).bind(var10 as ActivityInstanceEmbedMessageAccessory);
      } else if (var10 is EmbeddedActivityInviteMessageAccessory) {
         (var1 as EmbeddedActivityInviteViewHolder).bind(var10 as EmbeddedActivityInviteMessageAccessory);
      } else if (var10 is GuildProfileInviteMessageAccessory) {
         val var114: GuildProfileInviteViewHolder = var1 as GuildProfileInviteViewHolder;
         val var133: GuildProfileInviteMessageAccessory = var10 as GuildProfileInviteMessageAccessory;
         var var28: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var28 = null;
         }

         var114.bind(var133, var28);
      } else if (var10 is GuildInviteDisabledMessageAccessory) {
         (var1 as GuildInviteDisabledViewHolder).bind(var10 as GuildInviteDisabledMessageAccessory);
      } else if (var10 is GuildEventInviteMessageAccessory) {
         (var1 as GuildEventInviteViewHolder).bind(var10 as GuildEventInviteMessageAccessory);
      } else if (var10 is ThreadEmbedMessageAccessory) {
         val var115: ThreadEmbedViewHolder = var1 as ThreadEmbedViewHolder;
         val var134: ThreadEmbedMessageAccessory = var10 as ThreadEmbedMessageAccessory;
         var var29: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var29 = null;
         }

         var115.bind(var134, new Function1(var29) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapThreadEmbed", "onTapThreadEmbed-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapThreadEmbed-1xi1bu0(var1);
            }
         });
      } else if (var10 is ForumPostActionBar) {
         val var116: ForumPostActionBarViewHolder = var1 as ForumPostActionBarViewHolder;
         val var173: ForumPostActionBar = var10 as ForumPostActionBar;
         val var160: ReactionsTheme = (var10 as ForumPostActionBar).getReactionsTheme();
         val var171: l = new l(this);
         val var170: m = new m(this);
         val var166: n = new n(this);
         val var174: o = new o(this);
         val var172: p = new p(this);
         val var135: r = new r(this);
         val var150: s = new s(this);
         var var30: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var30 = null;
         }

         var116.bind(
            var173,
            var160,
            var171,
            var170,
            var166,
            var174,
            var172,
            var135,
            var150,
            new Function2(var30) {
               {
                  super(
                     2,
                     var1,
                     ChatEventHandler::class.java,
                     "onLinkClicked",
                     "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V",
                     0
                  );
               }

               public final void invoke_ntcYbpo/* $VF was: invoke-ntcYbpo*/(java.lang.String var1, LinkContentNode var2) {
                  kotlin.jvm.internal.r.h(var1, "p0");
                  kotlin.jvm.internal.r.h(var2, "p1");
                  (super.receiver as ChatEventHandler).onLinkClicked-ntcYbpo(var1, var2);
               }
            }
         );
      } else if (var10 is FileAttachmentMessageAccessory) {
         val var76: FileAttachmentViewHolder = var1 as FileAttachmentViewHolder;
         val var136: FileAttachmentMessageAccessory = var10 as FileAttachmentMessageAccessory;
         val var117: t = new t(this);
         val var151: SpoilerAttributes = var136.getSpoilerAttributes();
         val var31: SpoilerConfig;
         if (var151 != null) {
            var31 = SpoilerAttributes.configure$default(var151, new v(this, var1), null, 2, null);
         } else {
            var31 = null;
         }

         var76.bind(var136, var117, var31);
      } else if (var10 is MessageComponentsAccessory) {
         val var161: MessageComponentsViewHolder = var1 as MessageComponentsViewHolder;
         val var152: MessageComponentsAccessory = var10 as MessageComponentsAccessory;
         var var119: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var119 = null;
         }

         val var77: w;
         if (var52 != null) {
            var77 = new w(var52);
         } else {
            var77 = null;
         }

         var161.bind(var152, this.botComponentProvider, new x(var10, this), var77, new y(this, var1), new z(this, var10), var119);
      } else if (var10 is FlaggedMessageEmbedAccessory) {
         (var1 as FlaggedMessageEmbedViewHolder).bind(var10 as FlaggedMessageEmbedAccessory);
      } else if (var10 is FlaggedMessageActionBarAccessory) {
         val var120: FlaggedMessageActionBarViewHolder = var1 as FlaggedMessageActionBarViewHolder;
         val var137: FlaggedMessageActionBarAccessory = var10 as FlaggedMessageActionBarAccessory;
         var var32: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var32 = null;
         }

         val var153: Function2 = new Function2(var32) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAutoModerationActions-pfaIj0E(var1, var2);
            }
         };
         var var33: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var33 = null;
         }

         var120.bind(var137, var153, new Function2(var33) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationFeedback", "onTapAutoModerationFeedback-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAutoModerationFeedback-pfaIj0E(var1, var2);
            }
         });
      } else if (var10 is AutoModerationNotificationEmbedAccessory) {
         val var121: AutoModerationNotificationEmbedViewHolder = var1 as AutoModerationNotificationEmbedViewHolder;
         val var138: AutoModerationNotificationEmbedAccessory = var10 as AutoModerationNotificationEmbedAccessory;
         var var34: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var34 = null;
         }

         val var154: Function2 = new Function2(var34) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAutoModerationActions-pfaIj0E(var1, var2);
            }
         };
         var var35: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var35 = null;
         }

         var121.bind(var138, var154, new Function2(var35) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationFeedback", "onTapAutoModerationFeedback-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAutoModerationFeedback-pfaIj0E(var1, var2);
            }
         });
      } else if (var10 is TimestampMessageAccessory) {
         (var1 as TimestampViewHolder).bind(var10 as TimestampMessageAccessory);
      } else if (var10 is WelcomeStickerAccessory) {
         (var1 as WelcomeStickerViewHolder).bind(var10 as WelcomeStickerAccessory);
      } else if (var10 is ActivityInviteEmbedMessageAccessory) {
         val var122: ActivityInviteEmbedViewHolder = var1 as ActivityInviteEmbedViewHolder;
         val var139: ActivityInviteEmbedMessageAccessory = var10 as ActivityInviteEmbedMessageAccessory;
         var var36: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var36 = null;
         }

         var122.bind(var139, new Function1(var36) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapJoinActivity", "onTapJoinActivity-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapJoinActivity-1xi1bu0(var1);
            }
         });
      } else if (var10 is ActivityRichPresenceInviteEmbedMessageAccessory) {
         (var1 as ActivityRichPresenceInviteEmbedViewHolder).bind(var10 as ActivityRichPresenceInviteEmbedMessageAccessory);
      } else if (var10 is EphemeralIndicationMessageAccessory) {
         (var1 as EphemeralIndicationViewHolder).bind(var10 as EphemeralIndicationMessageAccessory);
      } else if (var10 is SurveyIndicationMessageAccessory) {
         (var1 as SurveyIndicationViewHolder).bind(var10 as SurveyIndicationMessageAccessory);
      } else if (var10 is InteractionStatusMessageAccessory) {
         (var1 as InteractionStatusViewHolder).bind(var10 as InteractionStatusMessageAccessory);
      } else if (var10 is RoleSubscriptionPurchaseAccessory) {
         (var1 as RoleSubscriptionPurchaseViewHolder)
            .bind(
               var10 as RoleSubscriptionPurchaseAccessory,
               MessageAccessoriesView.Companion
                  .getWidth(
                     (var10 as RoleSubscriptionPurchaseAccessory).getConstrainedWidth(), (var10 as RoleSubscriptionPurchaseAccessory).isForwardedContent()
                  )
            );
      } else if (var10 is InviteToSpeakAccessory) {
         (var1 as InviteToSpeakViewHolder).bind(var10 as InviteToSpeakAccessory);
      } else if (var10 is AudioAttachmentMessageAccessory) {
         val var155: AudioPlayerViewHolder = var1 as AudioPlayerViewHolder;
         val var140: AudioAttachmentMessageAccessory = var10 as AudioAttachmentMessageAccessory;
         var var38: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var38 = null;
         }

         val var84: A;
         if (var52 != null) {
            var84 = new A(var52);
         } else {
            var84 = null;
         }

         var155.bind(var140, var38, var84);
      } else if (var10 is PostPreviewEmbedMessageAccessory) {
         val var162: PostPreviewEmbedViewHolder = var1 as PostPreviewEmbedViewHolder;
         val var168: PostPreviewEmbedMessageAccessory = var10 as PostPreviewEmbedMessageAccessory;
         val var156: PostPreviewEmbed = (var10 as PostPreviewEmbedMessageAccessory).getPostPreviewEmbed();
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var86: Function4 = new Function4(var8) {
            {
               super(4, var1, ChatEventHandler::class.java, "onTapPostPreviewEmbed", "onTapPostPreviewEmbed-kUTrp-s(JJJLjava/lang/String;)V", 0);
            }

            public final void invoke_kUTrp_s/* $VF was: invoke-kUTrp-s*/(long var1, long var3, long var5, java.lang.String var7) {
               kotlin.jvm.internal.r.h(var7, "p3");
               (super.receiver as ChatEventHandler).onTapPostPreviewEmbed-kUTrp-s(var1, var3, var5, var7);
            }
         };
         val var125: SpoilerAttributes = var168.getSpoilerAttributes();
         val var39: SpoilerConfig;
         if (var125 != null) {
            var39 = var125.configure(new C(this, var1), new D(this, var10));
         } else {
            var39 = null;
         }

         var162.bind(var156, var86, var39);
      } else if (var10 is ChannelPromptActionsAccessory) {
         val var126: ChannelPromptActionsViewHolder = var1 as ChannelPromptActionsViewHolder;
         val var141: ChannelPromptActionsAccessory = var10 as ChannelPromptActionsAccessory;
         var var40: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var40 = null;
         }

         var126.bind(
            var141,
            new Function3(var40) {
               {
                  super(
                     3,
                     var1,
                     ChatEventHandler::class.java,
                     "onTapChannelPromptButton",
                     "onTapChannelPromptButton-Eqy5D80(Ljava/lang/String;JLjava/lang/String;)V",
                     0
                  );
               }

               public final void invoke_Eqy5D80/* $VF was: invoke-Eqy5D80*/(java.lang.String var1, long var2, java.lang.String var4) {
                  kotlin.jvm.internal.r.h(var1, "p0");
                  kotlin.jvm.internal.r.h(var4, "p2");
                  (super.receiver as ChatEventHandler).onTapChannelPromptButton-Eqy5D80(var1, var2, var4);
               }
            }
         );
      } else if (var10 is SafetyPolicyNoticeMessageAccessory) {
         val var127: SafetyPolicyNoticeViewHolder = var1 as SafetyPolicyNoticeViewHolder;
         val var142: SafetyPolicyNoticeMessageAccessory = var10 as SafetyPolicyNoticeMessageAccessory;
         var var41: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var41 = null;
         }

         var127.bind(var142, new Function1(var41) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapSafetyPolicyNoticeEmbed", "onTapSafetyPolicyNoticeEmbed(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapSafetyPolicyNoticeEmbed(var1);
            }
         });
      } else if (var10 is SafetySystemNotificationMessageAccessory) {
         val var128: SafetySystemNotificationViewHolder = var1 as SafetySystemNotificationViewHolder;
         val var143: SafetySystemNotificationEmbed = (var10 as SafetySystemNotificationMessageAccessory).getSafetySystemNotificationEmbed();
         var var42: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var42 = null;
         }

         var128.bind(
            var143,
            new Function2(var42) {
               {
                  super(
                     2,
                     var1,
                     ChatEventHandler::class.java,
                     "onTapSafetySystemNotificationCta",
                     "onTapSafetySystemNotificationCta(Ljava/lang/String;Ljava/lang/String;)V",
                     0
                  );
               }

               public final void invoke(java.lang.String var1, java.lang.String var2) {
                  kotlin.jvm.internal.r.h(var1, "p0");
                  kotlin.jvm.internal.r.h(var2, "p1");
                  (super.receiver as ChatEventHandler).onTapSafetySystemNotificationCta(var1, var2);
               }
            }
         );
      } else if (var10 is PollMessageAccessory) {
         val var157: PollViewHolder = var1 as PollViewHolder;
         val var144: PollMessageAccessory = var10 as PollMessageAccessory;
         var var43: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var43 = null;
         }

         val var163: Function3 = new Function3(var43) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapPollAnswer", "onTapPollAnswer-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke_sekaTiM/* $VF was: invoke-sekaTiM*/(long var1, java.lang.String var3, java.lang.String var4) {
               kotlin.jvm.internal.r.h(var3, "p1");
               kotlin.jvm.internal.r.h(var4, "p2");
               (super.receiver as ChatEventHandler).onTapPollAnswer-sekaTiM(var1, var3, var4);
            }
         };
         var var44: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var44 = null;
         }

         val var92: Function3 = new Function3(var44) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapPollAction", "onTapPollAction-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke_sekaTiM/* $VF was: invoke-sekaTiM*/(long var1, java.lang.String var3, java.lang.String var4) {
               kotlin.jvm.internal.r.h(var3, "p1");
               kotlin.jvm.internal.r.h(var4, "p2");
               (super.receiver as ChatEventHandler).onTapPollAction-sekaTiM(var1, var3, var4);
            }
         };
         var var45: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var45 = null;
         }

         var157.bind(
            var144,
            var163,
            var92,
            new Function8(var45) {
               {
                  super(
                     8,
                     var1,
                     ChatEventHandler::class.java,
                     "onLongPressPollImage",
                     "onLongPressPollImage-YVExdug(JLjava/lang/String;Ljava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;)V",
                     0
                  );
               }

               public final void invoke_YVExdug/* $VF was: invoke-YVExdug*/(
                  long var1, java.lang.String var3, java.lang.String var4, int var5, int var6, int var7, int var8, ViewResizeMode var9
               ) {
                  kotlin.jvm.internal.r.h(var3, "p1");
                  kotlin.jvm.internal.r.h(var4, "p2");
                  kotlin.jvm.internal.r.h(var9, "p7");
                  (super.receiver as ChatEventHandler).onLongPressPollImage-YVExdug(var1, var3, var4, var5, var6, var7, var8, var9);
               }
            }
         );
      } else if (var10 is CtaButtonMessageAccessory) {
         val var93: CtaButtonViewHolder = var1 as CtaButtonViewHolder;
         val var46: CtaButtonMessageAccessory = var10 as CtaButtonMessageAccessory;
         val var6: Long = (var10 as CtaButtonMessageAccessory).getChannelId-o4g7jtM();
         val var129: java.lang.String = (var10 as CtaButtonMessageAccessory).getMessageId-3Eiw7ao();
         val var145: CtaButton = var46.getCtaButton();
         var var47: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var47 = null;
         }

         var93.bind-JjTCmh4(var6, var129, var145, new Function3(var47) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapCtaButton", "onTapCtaButton-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke_sekaTiM/* $VF was: invoke-sekaTiM*/(long var1, java.lang.String var3, java.lang.String var4) {
               kotlin.jvm.internal.r.h(var3, "p1");
               kotlin.jvm.internal.r.h(var4, "p2");
               (super.receiver as ChatEventHandler).onTapCtaButton-sekaTiM(var1, var3, var4);
            }
         });
      } else if (var10 is VoiceInviteMessageAccessory) {
         val var130: VoiceInviteEmbedViewHolder = var1 as VoiceInviteEmbedViewHolder;
         val var146: VoiceInviteEmbed = (var10 as VoiceInviteMessageAccessory).getEmbed();
         var var48: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var48 = null;
         }

         var130.bind(var146, new Function3(var48) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapChannel(var1, var2, var3);
            }
         });
      } else if (var10 is ForwardHeaderMessageAccessory) {
         (var1 as ForwardHeaderViewHolder).bind();
      } else {
         if (var10 !is ForwardBreadcrumbMessageAccessory) {
            if (var10 !is ImageAttachmentMessageAccessory) {
               if (var10 is VideoAttachmentMessageAccessory) {
                  throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
               }

               throw new z9.n();
            }

            throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
         }

         val var131: ForwardBreadcrumbViewHolder = var1 as ForwardBreadcrumbViewHolder;
         val var147: ForwardBreadcrumbMessageAccessory = var10 as ForwardBreadcrumbMessageAccessory;
         var var49: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var49 = null;
         }

         var131.bind(var147, new Function3(var49) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapForwardFooter", "onTapForwardFooter-SHRpUJI(IJLjava/lang/String;)V", 0);
            }

            public final void invoke_SHRpUJI/* $VF was: invoke-SHRpUJI*/(int var1, long var2, java.lang.String var4) {
               kotlin.jvm.internal.r.h(var4, "p2");
               (super.receiver as ChatEventHandler).onTapForwardFooter-SHRpUJI(var1, var2, var4);
            }
         });
      }

      ForceExhaustiveKt.forceExhaustive(Unit.a);
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessagePartViewHolder {
      kotlin.jvm.internal.r.h(var1, "parent");
      var var16: Any;
      switch (var2) {
         case 0:
            val var75: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var75, "getContext(...)");
            var16 = new MessageContentViewHolder(new MessageContentView(var75, null, 0, 6, null));
            break;
         case 1:
            val var74: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var74, "getContext(...)");
            var16 = new EmbedViewHolder(new EmbedView(var74, null, 2, null));
            break;
         case 2:
         case 3:
         case 10:
         case 30:
         case 45:
         case 46:
         case 47:
         case 48:
         case 51:
         default:
            val var73: StringBuilder = new StringBuilder();
            var73.append("Unknown view type: ");
            var73.append(var2);
            throw new IllegalArgumentException(var73.toString());
         case 4:
            val var72: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var72, "getContext(...)");
            var16 = new ReactionsViewHolder(new ShortcutsFlexbox(var72, null, 2, null));
            break;
         case 5:
            val var70: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var70, "getContext(...)");
            val var86: GuildInviteView = new GuildInviteView(var70, null, 0, 6, null);
            var var71: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var71 = null;
            }

            var16 = new GuildInviteViewHolder(var86, var71);
            break;
         case 6:
            val var69: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var69, "getContext(...)");
            var16 = new StickerPngViewHolder(new StickerView(var69, null, 0, 6, null));
            break;
         case 7:
            val var68: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var68, "getContext(...)");
            var16 = new StickerApngViewHolder(new StickerView(var68, null, 0, 6, null));
            break;
         case 8:
            val var67: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var67, "getContext(...)");
            var16 = new StickerLottieViewHolder(new StickerView(var67, null, 0, 6, null));
            break;
         case 9:
            val var66: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var66, "getContext(...)");
            var16 = new ThreadEmbedViewHolder(new ThreadEmbedView(var66, null, 0, 6, null));
            break;
         case 11:
            val var64: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var64, "getContext(...)");
            val var85: FileAttachmentView = new FileAttachmentView(var64, null, 2, null);
            var var65: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var65 = null;
            }

            var16 = new FileAttachmentViewHolder(var85, var65);
            break;
         case 12:
            val var63: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var63, "getContext(...)");
            var16 = new MessageComponentsViewHolder(new MessageComponentsView(var63, null, 0, 6, null));
            break;
         case 13:
            val var62: TextView = TimestampViewBinding.inflate(LayoutInflater.from(var1.getContext()), var1, false).getRoot();
            kotlin.jvm.internal.r.g(var62, "getRoot(...)");
            var16 = new TimestampViewHolder(var62);
            break;
         case 14:
            val var60: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var60, "getContext(...)");
            val var84: WelcomeStickerView = new WelcomeStickerView(var60, null, 2, null);
            var var61: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var61 = null;
            }

            var16 = new WelcomeStickerViewHolder(
               var84,
               new Function2(var61) {
                  {
                     super(
                        2,
                        var1,
                        ChatEventHandler::class.java,
                        "onWelcomeReplyClicked",
                        "onWelcomeReplyClicked-Ayv7vGE(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V",
                        0
                     );
                  }

                  public final void invoke_Ayv7vGE/* $VF was: invoke-Ayv7vGE*/(Sticker var1, java.lang.String var2) {
                     kotlin.jvm.internal.r.h(var1, "p0");
                     kotlin.jvm.internal.r.h(var2, "p1");
                     (super.receiver as ChatEventHandler).onWelcomeReplyClicked-Ayv7vGE(var1, var2);
                  }
               }
            );
            break;
         case 15:
            val var58: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var58, "getContext(...)");
            val var83: GuildEventInviteView = new GuildEventInviteView(var58, null, 0, 6, null);
            var var59: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var59 = null;
            }

            var16 = new GuildEventInviteViewHolder(var83, var59, new L(this));
            break;
         case 16:
            val var57: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var57, "getContext(...)");
            var16 = new GiftViewHolder(new GiftView(var57, null, 2, null));
            break;
         case 17:
            val var56: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var56, "getContext(...)");
            var16 = new ActivityInviteEmbedViewHolder(new ActivityInviteEmbedView(var56, null, 0, 6, null));
            break;
         case 18:
            val var54: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var54, "getContext(...)");
            val var82: EphemeralIndicationView = new EphemeralIndicationView(var54, null, 0, 6, null);
            var var55: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var55 = null;
            }

            var16 = new EphemeralIndicationViewHolder(var82, var55);
            break;
         case 19:
            val var53: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var53, "getContext(...)");
            var16 = new InteractionStatusViewHolder(new InteractionStatusView(var53, null, 2, null));
            break;
         case 20:
            val var52: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var52, "getContext(...)");
            var16 = new ForumPostActionBarViewHolder(new ForumPostActionBarView(var52, null, 0, 6, null));
            break;
         case 21:
            val var50: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var50, "getContext(...)");
            val var81: FlaggedMessageEmbedView = new FlaggedMessageEmbedView(var50, null, 2, null);
            var var51: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var51 = null;
            }

            var16 = new FlaggedMessageEmbedViewHolder(var81, var51);
            break;
         case 22:
            val var49: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var49, "getContext(...)");
            var16 = new FlaggedMessageActionBarViewHolder(new FlaggedMessageActionBarView(var49, null, 0, 6, null));
            break;
         case 23:
            val var48: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var48, "getContext(...)");
            var16 = new RoleSubscriptionPurchaseViewHolder(new RoleSubscriptionPurchaseView(var48, null, 0, 6, null));
            break;
         case 24:
            val var46: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var46, "getContext(...)");
            val var87: SurveyIndicationView = new SurveyIndicationView(var46, null, 0, 6, null);
            var var47: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var47 = null;
            }

            var16 = new SurveyIndicationViewHolder(var87, var47);
            break;
         case 25:
            val var44: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var44, "getContext(...)");
            val var80: GuildInviteDisabledView = new GuildInviteDisabledView(var44, null, 0, 6, null);
            var var45: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var45 = null;
            }

            var16 = new GuildInviteDisabledViewHolder(var80, var45);
            break;
         case 26:
            val var43: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var43, "getContext(...)");
            var16 = new AttachmentMediaMosaicViewHolder(new AttachmentMediaMosaicContainerView(var43, null, 2, null));
            break;
         case 27:
            val var42: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var42, "getContext(...)");
            var16 = new StickerGifViewHolder(new StickerView(var42, null, 0, 6, null));
            break;
         case 28:
            val var40: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var40, "getContext(...)");
            val var79: InviteToSpeakView = new InviteToSpeakView(var40, null, 2, null);
            var var41: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var41 = null;
            }

            var16 = new InviteToSpeakViewHolder(var79, new Function1(var41) {
               {
                  super(1, var1, ChatEventHandler::class.java, "onTapInviteToSpeak", "onTapInviteToSpeak-1xi1bu0(Ljava/lang/String;)V", 0);
               }

               public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
                  kotlin.jvm.internal.r.h(var1, "p0");
                  (super.receiver as ChatEventHandler).onTapInviteToSpeak-1xi1bu0(var1);
               }
            });
            break;
         case 29:
            val var39: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var39, "getContext(...)");
            var16 = new AudioPlayerViewHolder(new AudioPlayerView(var39, null, 0, 6, null));
            break;
         case 31:
            val var37: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var37, "getContext(...)");
            val var78: EmbeddedActivityInviteView = new EmbeddedActivityInviteView(var37, null, 0, 6, null);
            var var38: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var38 = null;
            }

            var16 = new EmbeddedActivityInviteViewHolder(var78, var38);
            break;
         case 32:
            val var36: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var36, "getContext(...)");
            var16 = new PostPreviewEmbedViewHolder(new PostPreviewEmbedView(var36, null, 0, 6, null));
            break;
         case 33:
            val var35: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var35, "getContext(...)");
            var16 = new AutoModerationNotificationEmbedViewHolder(new AutoModerationNotificationEmbedView(var35, null, 2, null));
            break;
         case 34:
            val var34: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var34, "getContext(...)");
            var16 = new ChannelPromptActionsViewHolder(new ChannelPromptActionsView(var34, null, 2, null));
            break;
         case 35:
            val var33: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var33, "getContext(...)");
            var16 = new InfoLinkViewHolder(new InfoLinkView(var33, null, 2, null));
            break;
         case 36:
            val var32: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var32, "getContext(...)");
            var16 = new SafetyPolicyNoticeViewHolder(new SafetyPolicyNoticeView(var32, null, 2, null));
            break;
         case 37:
            val var31: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var31, "getContext(...)");
            var16 = new PollViewHolder(new PollTextAndImageView(var31, null, 0, 6, null));
            break;
         case 38:
            val var30: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var30, "getContext(...)");
            var16 = new PollViewHolder(new PollImageOnlyView(var30, null, 0, 6, null));
            break;
         case 39:
            val var29: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var29, "getContext(...)");
            var16 = new SafetySystemNotificationViewHolder(new SafetySystemNotificationView(var29, null, 2, null));
            break;
         case 40:
            val var27: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var27, "getContext(...)");
            val var77: ActivityInstanceEmbedView = new ActivityInstanceEmbedView(var27, null, 0, 6, null);
            var var28: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var28 = null;
            }

            var16 = new ActivityInstanceEmbedViewHolder(var77, var28);
            break;
         case 41:
            val var26: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var26, "getContext(...)");
            var16 = new CtaButtonViewHolder(new CtaButtonView(var26, null, 2, null));
            break;
         case 42:
            val var25: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var25, "getContext(...)");
            var16 = new VoiceInviteEmbedViewHolder(new VoiceInviteEmbedView(var25, null, 2, null));
            break;
         case 43:
            val var24: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var24, "getContext(...)");
            var16 = new ForwardHeaderViewHolder(new ForwardHeaderView(var24, null, 2, null));
            break;
         case 44:
            val var23: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var23, "getContext(...)");
            var16 = new ForwardBreadcrumbViewHolder(new ForwardBreadcrumbView(var23, null, 2, null));
            break;
         case 49:
            val var22: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var22, "getContext(...)");
            var16 = new MosaicItemMessageAttachmentImageViewHolder(new MediaImageView(var22, null, 2, null));
            break;
         case 50:
            val var21: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var21, "getContext(...)");
            var16 = new MosaicItemMessageAttachmentVideoViewHolder(new MediaVideoView(var21, null, 2, null));
            break;
         case 52:
            val var20: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var20, "getContext(...)");
            var16 = new ReferralViewHolder(new ReferralView(var20, null, 2, null));
            break;
         case 53:
            val var19: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var19, "getContext(...)");
            var16 = new GuildProfileInviteViewHolder(new GuildProfileInviteView(var19, null, 0, 6, null));
            break;
         case 54:
            val var17: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var17, "getContext(...)");
            val var76: AppMessageEmbedView = new AppMessageEmbedView(var17, null, 0, 6, null);
            var var18: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var18 = null;
            }

            var16 = new AppMessageEmbedViewHolder(var76, var18);
            break;
         case 55:
            val var15: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var15, "getContext(...)");
            var16 = new ActivityRichPresenceInviteEmbedViewHolder(new ActivityRichPresenceInviteEmbedView(var15, null, 0, 6, null));
      }

      return (MessagePartViewHolder)var16;
   }

   public open fun onViewRecycled(holder: MessagePartViewHolder) {
      kotlin.jvm.internal.r.h(var1, "holder");
      if (var1 is AudioPlayerViewHolder) {
         (var1 as AudioPlayerViewHolder).onViewRecycled();
      }

      super.onViewRecycled(var1);
   }

   public fun setComponentProvider(botComponentProvider: ComponentProvider?) {
      this.botComponentProvider = var1;
   }

   public fun setEventHandler(eventHandler: ChatEventHandler) {
      kotlin.jvm.internal.r.h(var1, "eventHandler");
      this.eventHandler = var1;
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setItems(messageId: MessageId, channelId: ChannelId, guildId: GuildId?, items: List<MessageAccessory>) {
      kotlin.jvm.internal.r.h(var1, "messageId");
      kotlin.jvm.internal.r.h(var5, "items");
      this.messageId = var1;
      this.channelId = ChannelId.box-impl(var2);
      this.guildId = var4;
      this.items = var5;
      this.notifyDataSetChanged();
   }

   public fun setNestedAccessoriesRecycledViewPool(recyclerViewPool: RecycledViewPool?) {
      this.recyclerViewPool = var1;
   }
}
