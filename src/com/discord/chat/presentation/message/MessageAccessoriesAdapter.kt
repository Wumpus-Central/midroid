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
import com.discord.chat.databinding.TimestampViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.invitetospeak.InviteToSpeakView
import com.discord.chat.presentation.message.messagepart.ActivityInstanceEmbedMessageAccessory
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
import com.discord.chat.presentation.message.messagepart.SharedCustomThemeMessageAccessory
import com.discord.chat.presentation.message.messagepart.StickerMessageAccessory
import com.discord.chat.presentation.message.messagepart.SurveyIndicationMessageAccessory
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.TimestampMessageAccessory
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory
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
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.MessageComponentsView
import com.discord.chat.presentation.message.view.customthemes.SharedCustomThemeView
import com.discord.chat.presentation.message.view.mosaic.AttachmentMediaMosaicContainerView
import com.discord.chat.presentation.message.view.polls.PollImageOnlyView
import com.discord.chat.presentation.message.view.polls.PollTextAndImageView
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView
import com.discord.chat.presentation.message.viewholder.ActivityInstanceEmbedViewHolder
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
import com.discord.chat.presentation.message.viewholder.SharedCustomThemeViewHolder
import com.discord.chat.presentation.message.viewholder.StickerApngViewHolder
import com.discord.chat.presentation.message.viewholder.StickerGifViewHolder
import com.discord.chat.presentation.message.viewholder.StickerLottieViewHolder
import com.discord.chat.presentation.message.viewholder.StickerPartViewHolder
import com.discord.chat.presentation.message.viewholder.StickerPngViewHolder
import com.discord.chat.presentation.message.viewholder.SurveyIndicationViewHolder
import com.discord.chat.presentation.message.viewholder.ThreadEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.TimestampViewHolder
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
import kotlin.jvm.internal.Intrinsics

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
      this.measureAndLayout = var1;
      this.items = CollectionsKt.k();
      this.onTapSpoiler = new H(this);
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
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var2 = null;
      }

      var2.onTapReferralRedeem(null);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$11`(var0: MessageAccessoriesAdapter, var1: MessageAccessory, var2: java.lang.String): Unit {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var4 = null;
      }

      var4.onTapGiftCodeAccept-NU4t8f8(var2, (var1 as GiftMessageAccessory).getMessageId-3Eiw7ao());
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$12`(var0: MessageAccessoriesAdapter, var1: Int, var2: MessageAccessory, var3: MessagePartViewHolder): Unit {
      val var7: View = var3.itemView;
      val var4: java.lang.String = var2.getMessageId-3Eiw7ao();
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

      var0.onMediaClicked-mdVZsaY(var7, var4, "attachment", ViewResizeMode.Cover, var6, var1, null, null, null);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$14$lambda$13`(var0: Function4, var1: Int): Unit {
      var0.invoke(MediaType.Attachment, var1, null, null);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$15`(var0: MessageAccessoriesAdapter, var1: MessagePartViewHolder): Unit {
      var0.onTapSpoiler.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$16`(var0: MessageAccessoriesAdapter, var1: MessageAccessory, var2: Boolean): Unit {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
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
   fun `onBindViewHolder$lambda$17`(var0: MessageAccessoriesAdapter, var1: View) {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var4 = null;
      }

      val var3: java.lang.String = var0.messageId;
      ChatEventHandler.DefaultImpls.onTapReaction-AFFcxXc$default(var4, var3, null, null, "Message Shortcut", 4, null);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$18`(var0: MessageAccessoriesAdapter, var1: ReactionView.Reaction): Unit {
      var var2: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var2 = null;
      }

      val var4: java.lang.String = var0.messageId;
      ChatEventHandler.DefaultImpls.onTapReaction-AFFcxXc$default(var2, var4, var1, null, null, 12, null);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$19`(var0: MessageAccessoriesAdapter, var1: ReactionView.Reaction): Unit {
      var var2: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var2 = null;
      }

      val var5: java.lang.String = var0.messageId;
      val var4: ChannelId = var0.channelId;
      var2.onLongPressReaction-Eqy5D80(var5, var4.unbox-impl(), var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$20`(var0: MessageAccessoriesAdapter, var1: MessageAccessory, var2: Sticker): Unit {
      var var3: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var3 = null;
      }

      var3.onStickerClicked-Ayv7vGE((var1 as StickerMessageAccessory).getSticker(), (var1 as StickerMessageAccessory).getMessageId-3Eiw7ao());
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$21`(var0: MessageAccessoriesAdapter, var1: MessageAccessory, var2: Sticker): Unit {
      var var3: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var3 = null;
      }

      var3.onStickerLongClicked-Ayv7vGE((var1 as StickerMessageAccessory).getSticker(), (var1 as StickerMessageAccessory).getMessageId-3Eiw7ao());
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$22`(var0: MessageAccessoriesAdapter, var1: View) {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var4 = null;
      }

      val var5: java.lang.String = var0.messageId;
      val var3: ChannelId = var0.channelId;
      var4.onTapFollowForumPost-pfaIj0E(var5, var3.unbox-impl());
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$23`(var0: MessageAccessoriesAdapter, var1: View) {
      var var6: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var6 = null;
      }

      val var7: ChannelId = var0.channelId;
      val var2: Long = var7.unbox-impl();
      val var5: GuildId = var0.guildId;
      var6.onTapShareForumPost-mgk6anA(var2, var5.unbox-impl());
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$24`(var0: MessageAccessoriesAdapter, var1: View) {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var4 = null;
      }

      val var3: java.lang.String = var0.messageId;
      ChatEventHandler.DefaultImpls.onTapReaction-AFFcxXc$default(var4, var3, null, null, null, 12, null);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$25`(var0: MessageAccessoriesAdapter, var1: View) {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var4 = null;
      }

      val var5: java.lang.String = var0.messageId;
      val var3: ChannelId = var0.channelId;
      var4.onTapReactionOverflow-pfaIj0E(var5, var3.unbox-impl());
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$26`(var0: MessageAccessoriesAdapter, var1: ReactionView.Reaction): Unit {
      var var2: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var2 = null;
      }

      val var4: java.lang.String = var0.messageId;
      ChatEventHandler.DefaultImpls.onTapReaction-AFFcxXc$default(var2, var4, var1, null, null, 12, null);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$27`(var0: MessageAccessoriesAdapter, var1: ReactionView.Reaction): Unit {
      var var2: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var2 = null;
      }

      val var5: java.lang.String = var0.messageId;
      val var4: ChannelId = var0.channelId;
      var2.onLongPressReaction-Eqy5D80(var5, var4.unbox-impl(), var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$29`(var0: MessageAccessoriesAdapter, var1: View) {
      if (var0.messageId != null) {
         var var3: ChatEventHandler = var0.eventHandler;
         if (var0.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var3 = null;
         }

         var3.onTapDismissMediaPostSharePrompt-1xi1bu0(var0.messageId);
      }
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$30`(var0: MessageAccessoriesAdapter, var1: java.lang.String, var2: java.lang.String): Unit {
      var var3: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var3 = null;
      }

      val var5: java.lang.String = var0.messageId;
      var3.onLinkClicked-u7_MRrM(var5, var1, var2);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$31`(var0: MessageAccessoriesAdapter, var1: MessagePartViewHolder): Unit {
      var0.onTapSpoiler.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$33$lambda$32`(var0: Function4, var1: java.lang.String, var2: Int): Unit {
      var0.invoke(MediaType.Component, null, var1, var2);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$34`(
      var0: MessageAccessory, var1: MessageAccessoriesAdapter, var2: View, var3: java.lang.String, var4: Int, var5: java.lang.Double
   ): Unit {
      var1.onMediaClicked-mdVZsaY(
         var2, (var0 as MessageComponentsAccessory).getMessageId-3Eiw7ao(), "component", ViewResizeMode.Fill, var5, 0, null, var3, var4
      );
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$35`(var0: MessageAccessoriesAdapter, var1: MessagePartViewHolder): Unit {
      var0.onTapSpoiler.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$36`(var0: MessageAccessoriesAdapter, var1: MessageAccessory, var2: Boolean): Unit {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
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
   fun `onBindViewHolder$lambda$38$lambda$37`(var0: Function4, var1: MessageAccessory, var2: java.lang.String, var3: Int): Unit {
      var0.invoke(MediaType.Attachment, (var1 as AudioAttachmentMessageAccessory).getAttachmentIndex(), null, null);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$39`(var0: MessageAccessoriesAdapter, var1: MessagePartViewHolder): Unit {
      var0.onTapSpoiler.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$4$lambda$3`(var0: Function6, var1: MessageAccessoriesAdapter, var2: MediaType, var3: Int, var4: java.lang.String, var5: Int): Unit {
      val var6: java.lang.String = var1.messageId;
      val var8: MessageId;
      if (var6 != null) {
         var8 = MessageId.box-impl(var6);
      } else {
         var8 = null;
      }

      val var7: ChannelId = var1.channelId;
      var0.invoke(var8, var7, var3, var2, var4, var5);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$40`(var0: MessageAccessoriesAdapter, var1: MessageAccessory, var2: Boolean): Unit {
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
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
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
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
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
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
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
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
      var0.notifyItemChanged(var1.getBindingAdapterPosition());
      var0.measureAndLayout.invoke();
      return Unit.a;
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun clear() {
      this.items = CollectionsKt.k();
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
                        throw new B9.n();
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
                  throw new B9.n();
               }

               var4 = 38;
            } else {
               var4 = 37;
            }
         } else if (var3 is CtaButtonMessageAccessory) {
            var4 = 41;
         } else if (var3 is ForwardHeaderMessageAccessory) {
            var4 = 43;
         } else if (var3 is ForwardBreadcrumbMessageAccessory) {
            var4 = 44;
         } else if (var3 is GuildProfileInviteMessageAccessory) {
            var4 = 53;
         } else {
            if (var3 !is SharedCustomThemeMessageAccessory) {
               if (var3 !is ImageAttachmentMessageAccessory) {
                  if (var3 is VideoAttachmentMessageAccessory) {
                     throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
                  }

                  throw new B9.n();
               }

               throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
            }

            var4 = 56;
         }
      }

      return var4;
   }

   public open fun onBindViewHolder(holder: MessagePartViewHolder, position: Int) {
      var var8: ChatEventHandler = this.eventHandler;
      if (this.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var8 = null;
      }

      val var66: Function6 = var8.getOnMessageLongPressed();
      val var67: q;
      if (var66 != null) {
         var67 = new q(var66, this);
      } else {
         var67 = null;
      }

      val var10: MessageAccessory = this.items.get(var2);
      if (var10 is EmbedMessageAccessory) {
         val var11: EmbedViewHolder = var1 as EmbedViewHolder;
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var8 = null;
         }

         val var13: EmbedMessageAccessory = var10 as EmbedMessageAccessory;
         val var5: Int = var1.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_max_height);
         var2 = var13.getRadiusPx();
         val var12: OnLongClickListener = var13.getOnLongClick();
         val var111: SpoilerAttributes = var13.getSpoilerAttributes();
         val var112: SpoilerConfig;
         if (var111 != null) {
            var112 = var111.configure(new i(this, var1), new u(this, var10));
         } else {
            var112 = null;
         }

         var11.bind(var8, var13, var5, var2, new y(this, var1), var112, new z(var1, var10, this), var12, var13.getPortal());
      } else if (var10 is InfoLinkMessageAccessory) {
         (var1 as InfoLinkViewHolder).bind((var10 as InfoLinkMessageAccessory).getText(), (var10 as InfoLinkMessageAccessory).getIcon(), new A(this, var10));
      } else if (var10 is ReferralMessageAccessory) {
         (var1 as ReferralViewHolder).bind(var10 as ReferralMessageAccessory, new C(this), new Function2<MessageId, LinkContentNode, Unit>(this) {
            final MessageAccessoriesAdapter this$0;

            {
               this.this$0 = var1;
            }

            public final void invoke_ntcYbpo/* $VF was: invoke-ntcYbpo*/(java.lang.String var1, LinkContentNode var2) {
               val var4: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
               var var3: ChatEventHandler = var4;
               if (var4 == null) {
                  Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                  var3 = null;
               }

               var3.onLinkClicked-ntcYbpo(var1, var2);
            }
         });
      } else if (var10 is GiftMessageAccessory) {
         val var113: GiftViewHolder = var1 as GiftViewHolder;
         val var70: GiftMessageAccessory = var10 as GiftMessageAccessory;
         var var26: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var26 = null;
         }

         var113.bind(var70, new Function1<java.lang.String, Unit>(var26) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapGiftCodeEmbed", "onTapGiftCodeEmbed(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               (super.receiver as ChatEventHandler).onTapGiftCodeEmbed(var1);
            }
         }, new D(this, var10));
      } else if (var10 is MessageContentAccessory) {
         val var114: MessageContentViewHolder = var1 as MessageContentViewHolder;
         val var134: MessageContentAccessory = var10 as MessageContentAccessory;
         var var27: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var27 = null;
         }

         val var149: Function2 = new Function2<MessageId, LinkContentNode, Unit>(var27) {
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
               (super.receiver as ChatEventHandler).onLinkClicked-ntcYbpo(var1, var2);
            }
         };
         var var28: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var28 = null;
         }

         val var160: Function1 = new Function1<LinkContentNode, Unit>(var28) {
            {
               super(1, var1, ChatEventHandler::class.java, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
            }

            public final void invoke(LinkContentNode var1) {
               (super.receiver as ChatEventHandler).onLinkLongClicked(var1);
            }
         };
         var var29: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var29 = null;
         }

         val var167: Function3 = new Function3(var29) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               (super.receiver as ChatEventHandler).onTapChannel(var1, var2, var3);
            }
         };
         var var30: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var30 = null;
         }

         val var14: Function4 = new Function4(var30) {
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
               (super.receiver as ChatEventHandler).onLongPressChannel(var1, var2, var3, var4);
            }
         };
         var var31: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var31 = null;
         }

         val var15: Function1 = new Function1<java.lang.String, Unit>(var31) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapAttachmentLink", "onTapAttachmentLink(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               (super.receiver as ChatEventHandler).onTapAttachmentLink(var1);
            }
         };
         var var32: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var32 = null;
         }

         val var16: Function2 = new Function2<java.lang.String, java.lang.String, Unit>(var32) {
            {
               super(2, var1, ChatEventHandler::class.java, "onLongPressAttachmentLink", "onLongPressAttachmentLink(Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2) {
               (super.receiver as ChatEventHandler).onLongPressAttachmentLink(var1, var2);
            }
         };
         var var33: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var33 = null;
         }

         val var18: Function4 = new Function4(var33) {
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
               (super.receiver as ChatEventHandler).onTapMention(var1, var2, var3, var4);
            }
         };
         val var17: Function1 = this.onTapSpoiler;
         var var34: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var34 = null;
         }

         val var19: Function1 = new Function1<CommandMentionContentNode, Unit>(var34) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapCommand", "onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
            }

            public final void invoke(CommandMentionContentNode var1) {
               (super.receiver as ChatEventHandler).onTapCommand(var1);
            }
         };
         var var35: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var35 = null;
         }

         val var20: Function1 = new Function1<CommandMentionContentNode, Unit>(var35) {
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
               (super.receiver as ChatEventHandler).onLongPressCommand(var1);
            }
         };
         var var36: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var36 = null;
         }

         val var21: Function1 = new Function1<java.lang.String, Unit>(var36) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapTimestamp", "onTapTimestamp(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               (super.receiver as ChatEventHandler).onTapTimestamp(var1);
            }
         };
         var var37: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var37 = null;
         }

         val var22: Function1 = new Function1<InlineCodeContentNode, Unit>(var37) {
            {
               super(
                  1, var1, ChatEventHandler::class.java, "onTapInlineCode", "onTapInlineCode(Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;)V", 0
               );
            }

            public final void invoke(InlineCodeContentNode var1) {
               (super.receiver as ChatEventHandler).onTapInlineCode(var1);
            }
         };
         var var38: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var38 = null;
         }

         val var23: Function1 = new Function1<EmojiContentNode, Unit>(var38) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapEmoji", "onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", 0);
            }

            public final void invoke(EmojiContentNode var1) {
               (super.receiver as ChatEventHandler).onTapEmoji(var1);
            }
         };
         var var39: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var39 = null;
         }

         val var24: Function1 = new Function1<MessageId, Unit>(var39) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapSeeMore", "onTapSeeMore-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               (super.receiver as ChatEventHandler).onTapSeeMore-1xi1bu0(var1);
            }
         };
         var var40: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var40 = null;
         }

         var114.bind(
            var134,
            var149,
            var160,
            var167,
            var14,
            var15,
            var16,
            var18,
            var19,
            var20,
            var17,
            var21,
            var22,
            var23,
            var24,
            new Function1<SoundmojiContentNode, Unit>(var40) {
               {
                  super(
                     1, var1, ChatEventHandler::class.java, "onTapSoundmoji", "onTapSoundmoji(Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;)V", 0
                  );
               }

               public final void invoke(SoundmojiContentNode var1) {
                  (super.receiver as ChatEventHandler).onTapSoundmoji(var1);
               }
            }
         );
      } else if (var10 is MediaMosaicAttachmentMessageAccessory) {
         val var150: AttachmentMediaMosaicViewHolder = var1 as AttachmentMediaMosaicViewHolder;
         var var115: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var115 = null;
         }

         val var168: MediaMosaicAttachmentMessageAccessory = var10 as MediaMosaicAttachmentMessageAccessory;
         val var172: java.util.List = (var10 as MediaMosaicAttachmentMessageAccessory).getAttachments();
         val var161: E = new E(this);
         val var85: F;
         if (var67 != null) {
            var85 = new F(var67);
         } else {
            var85 = null;
         }

         var150.bind(
            var115,
            var172,
            var161,
            var85,
            new B(this, var1),
            new I(this, var10),
            var168.isForwardedContent(),
            var168.getShouldAutoPlayGif(),
            var168.getConstrainedWidth()
         );
      } else if (var10 is ReactionsMessageAccessory) {
         (var1 as ReactionsViewHolder)
            .bind(
               (var10 as ReactionsMessageAccessory).getReactions(),
               (var10 as ReactionsMessageAccessory).getCanAddNewReactions(),
               (var10 as ReactionsMessageAccessory).getAddReactionLabel(),
               (var10 as ReactionsMessageAccessory).getAddNewReactionAccessibilityLabel(),
               (var10 as ReactionsMessageAccessory).getReactionsTheme(),
               new J(this),
               new K(this),
               new L(this),
               (var10 as ReactionsMessageAccessory).getTheme()
            );
      } else if (var10 is StickerMessageAccessory) {
         (var1 as StickerPartViewHolder).bind((var10 as StickerMessageAccessory).getSticker(), new M(this, var10), new N(this, var10), 160, 160);
      } else if (var10 is GuildInviteMessageAccessory) {
         (var1 as GuildInviteViewHolder).bind(var10 as GuildInviteMessageAccessory);
      } else if (var10 is AppMessageEmbedAccessory) {
         (var1 as AppMessageEmbedViewHolder).bind(var10 as AppMessageEmbedAccessory);
      } else if (var10 is ActivityInstanceEmbedMessageAccessory) {
         (var1 as ActivityInstanceEmbedViewHolder).bind(var10 as ActivityInstanceEmbedMessageAccessory);
      } else if (var10 is EmbeddedActivityInviteMessageAccessory) {
         (var1 as EmbeddedActivityInviteViewHolder).bind(var10 as EmbeddedActivityInviteMessageAccessory);
      } else if (var10 is GuildProfileInviteMessageAccessory) {
         val var116: GuildProfileInviteViewHolder = var1 as GuildProfileInviteViewHolder;
         val var135: GuildProfileInviteMessageAccessory = var10 as GuildProfileInviteMessageAccessory;
         var var42: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var42 = null;
         }

         var116.bind(var135, var42);
      } else if (var10 is GuildInviteDisabledMessageAccessory) {
         (var1 as GuildInviteDisabledViewHolder).bind(var10 as GuildInviteDisabledMessageAccessory);
      } else if (var10 is GuildEventInviteMessageAccessory) {
         (var1 as GuildEventInviteViewHolder).bind(var10 as GuildEventInviteMessageAccessory);
      } else if (var10 is ThreadEmbedMessageAccessory) {
         val var117: ThreadEmbedViewHolder = var1 as ThreadEmbedViewHolder;
         val var136: ThreadEmbedMessageAccessory = var10 as ThreadEmbedMessageAccessory;
         var var43: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var43 = null;
         }

         var117.bind(var136, new Function1<MessageId, Unit>(var43) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapThreadEmbed", "onTapThreadEmbed-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               (super.receiver as ChatEventHandler).onTapThreadEmbed-1xi1bu0(var1);
            }
         });
      } else if (var10 is ForumPostActionBar) {
         val var118: ForumPostActionBarViewHolder = var1 as ForumPostActionBarViewHolder;
         val var176: ForumPostActionBar = var10 as ForumPostActionBar;
         val var137: ReactionsTheme = (var10 as ForumPostActionBar).getReactionsTheme();
         val var169: O = new O(this);
         val var173: g = new g(this);
         val var174: h = new h(this);
         val var177: j = new j(this);
         val var151: k = new k(this);
         val var162: l = new l(this);
         val var175: m = new m(this);
         var var44: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var44 = null;
         }

         var118.bind(
            var176,
            var137,
            var169,
            var173,
            var174,
            var177,
            var151,
            var162,
            var175,
            new Function2<MessageId, LinkContentNode, Unit>(var44) {
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
                  (super.receiver as ChatEventHandler).onLinkClicked-ntcYbpo(var1, var2);
               }
            }
         );
      } else if (var10 is FileAttachmentMessageAccessory) {
         val var90: FileAttachmentViewHolder = var1 as FileAttachmentViewHolder;
         val var138: FileAttachmentMessageAccessory = var10 as FileAttachmentMessageAccessory;
         val var119: n = new n(this);
         val var152: SpoilerAttributes = var138.getSpoilerAttributes();
         val var45: SpoilerConfig;
         if (var152 != null) {
            var45 = SpoilerAttributes.configure$default(var152, new o(this, var1), null, 2, null);
         } else {
            var45 = null;
         }

         var90.bind(var138, var119, var45);
      } else if (var10 is MessageComponentsAccessory) {
         val var163: MessageComponentsViewHolder = var1 as MessageComponentsViewHolder;
         val var153: MessageComponentsAccessory = var10 as MessageComponentsAccessory;
         var var121: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var121 = null;
         }

         val var91: p;
         if (var67 != null) {
            var91 = new p(var67);
         } else {
            var91 = null;
         }

         var163.bind(var153, this.botComponentProvider, new r(var10, this), var91, new s(this, var1), new t(this, var10), var121);
      } else if (var10 is FlaggedMessageEmbedAccessory) {
         (var1 as FlaggedMessageEmbedViewHolder).bind(var10 as FlaggedMessageEmbedAccessory);
      } else if (var10 is FlaggedMessageActionBarAccessory) {
         val var122: FlaggedMessageActionBarViewHolder = var1 as FlaggedMessageActionBarViewHolder;
         val var139: FlaggedMessageActionBarAccessory = var10 as FlaggedMessageActionBarAccessory;
         var var46: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var46 = null;
         }

         val var154: Function2 = new Function2<MessageId, ChannelId, Unit>(var46) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               (super.receiver as ChatEventHandler).onTapAutoModerationActions-pfaIj0E(var1, var2);
            }
         };
         var var47: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var47 = null;
         }

         var122.bind(var139, var154, new Function2<MessageId, ChannelId, Unit>(var47) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationFeedback", "onTapAutoModerationFeedback-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               (super.receiver as ChatEventHandler).onTapAutoModerationFeedback-pfaIj0E(var1, var2);
            }
         });
      } else if (var10 is AutoModerationNotificationEmbedAccessory) {
         val var123: AutoModerationNotificationEmbedViewHolder = var1 as AutoModerationNotificationEmbedViewHolder;
         val var140: AutoModerationNotificationEmbedAccessory = var10 as AutoModerationNotificationEmbedAccessory;
         var var48: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var48 = null;
         }

         val var155: Function2 = new Function2<MessageId, ChannelId, Unit>(var48) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               (super.receiver as ChatEventHandler).onTapAutoModerationActions-pfaIj0E(var1, var2);
            }
         };
         var var49: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var49 = null;
         }

         var123.bind(var140, var155, new Function2<MessageId, ChannelId, Unit>(var49) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationFeedback", "onTapAutoModerationFeedback-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               (super.receiver as ChatEventHandler).onTapAutoModerationFeedback-pfaIj0E(var1, var2);
            }
         });
      } else if (var10 is TimestampMessageAccessory) {
         (var1 as TimestampViewHolder).bind(var10 as TimestampMessageAccessory);
      } else if (var10 is WelcomeStickerAccessory) {
         (var1 as WelcomeStickerViewHolder).bind(var10 as WelcomeStickerAccessory);
      } else if (var10 is ActivityRichPresenceInviteEmbedMessageAccessory) {
         val var124: ActivityRichPresenceInviteEmbedViewHolder = var1 as ActivityRichPresenceInviteEmbedViewHolder;
         val var141: ActivityRichPresenceInviteEmbedMessageAccessory = var10 as ActivityRichPresenceInviteEmbedMessageAccessory;
         var var50: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var50 = null;
         }

         var124.bind(var141, new Function1<MessageId, Unit>(var50) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapJoinRichPresence", "onTapJoinRichPresence-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               (super.receiver as ChatEventHandler).onTapJoinRichPresence-1xi1bu0(var1);
            }
         });
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
         val var164: AudioPlayerViewHolder = var1 as AudioPlayerViewHolder;
         val var156: AudioAttachmentMessageAccessory = var10 as AudioAttachmentMessageAccessory;
         var var52: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var52 = null;
         }

         val var98: v;
         if (var67 != null) {
            var98 = new v(var67, var10);
         } else {
            var98 = null;
         }

         var164.bind(var156, var52, var98);
      } else if (var10 is PostPreviewEmbedMessageAccessory) {
         val var157: PostPreviewEmbedViewHolder = var1 as PostPreviewEmbedViewHolder;
         val var171: PostPreviewEmbedMessageAccessory = var10 as PostPreviewEmbedMessageAccessory;
         val var165: PostPreviewEmbed = (var10 as PostPreviewEmbedMessageAccessory).getPostPreviewEmbed();
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var8 = null;
         }

         val var100: Function4 = new Function4(var8) {
            {
               super(4, var1, ChatEventHandler::class.java, "onTapPostPreviewEmbed", "onTapPostPreviewEmbed-kUTrp-s(JJJLjava/lang/String;)V", 0);
            }

            public final void invoke_kUTrp_s/* $VF was: invoke-kUTrp-s*/(long var1, long var3, long var5, java.lang.String var7) {
               (super.receiver as ChatEventHandler).onTapPostPreviewEmbed-kUTrp-s(var1, var3, var5, var7);
            }
         };
         val var127: SpoilerAttributes = var171.getSpoilerAttributes();
         val var53: SpoilerConfig;
         if (var127 != null) {
            var53 = var127.configure(new w(this, var1), new x(this, var10));
         } else {
            var53 = null;
         }

         var157.bind(var165, var100, var53);
      } else if (var10 is ChannelPromptActionsAccessory) {
         val var128: ChannelPromptActionsViewHolder = var1 as ChannelPromptActionsViewHolder;
         val var142: ChannelPromptActionsAccessory = var10 as ChannelPromptActionsAccessory;
         var var54: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var54 = null;
         }

         var128.bind(
            var142,
            new Function3(var54) {
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
                  (super.receiver as ChatEventHandler).onTapChannelPromptButton-Eqy5D80(var1, var2, var4);
               }
            }
         );
      } else if (var10 is SafetyPolicyNoticeMessageAccessory) {
         val var129: SafetyPolicyNoticeViewHolder = var1 as SafetyPolicyNoticeViewHolder;
         val var143: SafetyPolicyNoticeMessageAccessory = var10 as SafetyPolicyNoticeMessageAccessory;
         var var55: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var55 = null;
         }

         var129.bind(var143, new Function1<java.lang.String, Unit>(var55) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapSafetyPolicyNoticeEmbed", "onTapSafetyPolicyNoticeEmbed(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               (super.receiver as ChatEventHandler).onTapSafetyPolicyNoticeEmbed(var1);
            }
         });
      } else if (var10 is SafetySystemNotificationMessageAccessory) {
         val var130: SafetySystemNotificationViewHolder = var1 as SafetySystemNotificationViewHolder;
         val var144: SafetySystemNotificationEmbed = (var10 as SafetySystemNotificationMessageAccessory).getSafetySystemNotificationEmbed();
         var var56: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var56 = null;
         }

         var130.bind(
            var144,
            new Function2<java.lang.String, java.lang.String, Unit>(var56) {
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
                  (super.receiver as ChatEventHandler).onTapSafetySystemNotificationCta(var1, var2);
               }
            }
         );
      } else if (var10 is PollMessageAccessory) {
         val var158: PollViewHolder = var1 as PollViewHolder;
         val var145: PollMessageAccessory = var10 as PollMessageAccessory;
         var var57: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var57 = null;
         }

         val var166: Function3 = new Function3(var57) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapPollAnswer", "onTapPollAnswer-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke_sekaTiM/* $VF was: invoke-sekaTiM*/(long var1, java.lang.String var3, java.lang.String var4) {
               (super.receiver as ChatEventHandler).onTapPollAnswer-sekaTiM(var1, var3, var4);
            }
         };
         var var58: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var58 = null;
         }

         val var106: Function3 = new Function3(var58) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapPollAction", "onTapPollAction-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke_sekaTiM/* $VF was: invoke-sekaTiM*/(long var1, java.lang.String var3, java.lang.String var4) {
               (super.receiver as ChatEventHandler).onTapPollAction-sekaTiM(var1, var3, var4);
            }
         };
         var var59: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var59 = null;
         }

         var158.bind(
            var145,
            var166,
            var106,
            new Function8(var59) {
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
                  (super.receiver as ChatEventHandler).onLongPressPollImage-YVExdug(var1, var3, var4, var5, var6, var7, var8, var9);
               }
            }
         );
      } else if (var10 is SharedCustomThemeMessageAccessory) {
         val var131: SharedCustomThemeViewHolder = var1 as SharedCustomThemeViewHolder;
         val var146: SharedCustomThemeMessageAccessory = var10 as SharedCustomThemeMessageAccessory;
         var var60: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var60 = null;
         }

         val var159: Function1 = new Function1<MessageId, Unit>(var60) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapPreviewSharedClientTheme", "onTapPreviewSharedClientTheme-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               (super.receiver as ChatEventHandler).onTapPreviewSharedClientTheme-1xi1bu0(var1);
            }
         };
         var var61: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var61 = null;
         }

         var131.bind(var146, var159, new Function1<MessageId, Unit>(var61) {
            {
               super(1, var1, ChatEventHandler::class.java, "onSharedClientThemeViewed", "onSharedClientThemeViewed-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               (super.receiver as ChatEventHandler).onSharedClientThemeViewed-1xi1bu0(var1);
            }
         });
      } else if (var10 is CtaButtonMessageAccessory) {
         val var109: CtaButtonViewHolder = var1 as CtaButtonViewHolder;
         val var62: CtaButtonMessageAccessory = var10 as CtaButtonMessageAccessory;
         val var6: Long = (var10 as CtaButtonMessageAccessory).getChannelId-o4g7jtM();
         val var132: java.lang.String = (var10 as CtaButtonMessageAccessory).getMessageId-3Eiw7ao();
         val var147: CtaButton = var62.getCtaButton();
         var var63: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var63 = null;
         }

         var109.bind-JjTCmh4(var6, var132, var147, new Function3(var63) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapCtaButton", "onTapCtaButton-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke_sekaTiM/* $VF was: invoke-sekaTiM*/(long var1, java.lang.String var3, java.lang.String var4) {
               (super.receiver as ChatEventHandler).onTapCtaButton-sekaTiM(var1, var3, var4);
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

               throw new B9.n();
            }

            throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
         }

         val var133: ForwardBreadcrumbViewHolder = var1 as ForwardBreadcrumbViewHolder;
         val var148: ForwardBreadcrumbMessageAccessory = var10 as ForwardBreadcrumbMessageAccessory;
         var var64: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            var64 = null;
         }

         var133.bind(var148, new Function3(var64) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapForwardFooter", "onTapForwardFooter-SHRpUJI(IJLjava/lang/String;)V", 0);
            }

            public final void invoke_SHRpUJI/* $VF was: invoke-SHRpUJI*/(int var1, long var2, java.lang.String var4) {
               (super.receiver as ChatEventHandler).onTapForwardFooter-SHRpUJI(var1, var2, var4);
            }
         });
      }

      ForceExhaustiveKt.forceExhaustive(Unit.a);
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessagePartViewHolder {
      var var16: Any;
      switch (var2) {
         case 0:
            val var74: Context = var1.getContext();
            var16 = new MessageContentViewHolder(new MessageContentView(var74, null, 0, 6, null));
            break;
         case 1:
            val var73: Context = var1.getContext();
            var16 = new EmbedViewHolder(new EmbedView(var73, null, 2, null));
            break;
         case 2:
         case 3:
         case 10:
         case 17:
         case 30:
         case 42:
         case 45:
         case 46:
         case 47:
         case 48:
         case 51:
         default:
            val var72: StringBuilder = new StringBuilder();
            var72.append("Unknown view type: ");
            var72.append(var2);
            throw new IllegalArgumentException(var72.toString());
         case 4:
            val var71: Context = var1.getContext();
            var16 = new ReactionsViewHolder(new ShortcutsFlexbox(var71, null, 2, null));
            break;
         case 5:
            val var69: Context = var1.getContext();
            val var85: GuildInviteView = new GuildInviteView(var69, null, 0, 6, null);
            var var70: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
               var70 = null;
            }

            var16 = new GuildInviteViewHolder(var85, var70);
            break;
         case 6:
            val var68: Context = var1.getContext();
            var16 = new StickerPngViewHolder(new StickerView(var68, null, 0, 6, null));
            break;
         case 7:
            val var67: Context = var1.getContext();
            var16 = new StickerApngViewHolder(new StickerView(var67, null, 0, 6, null));
            break;
         case 8:
            val var66: Context = var1.getContext();
            var16 = new StickerLottieViewHolder(new StickerView(var66, null, 0, 6, null));
            break;
         case 9:
            val var65: Context = var1.getContext();
            var16 = new ThreadEmbedViewHolder(new ThreadEmbedView(var65, null, 0, 6, null));
            break;
         case 11:
            val var63: Context = var1.getContext();
            val var84: FileAttachmentView = new FileAttachmentView(var63, null, 2, null);
            var var64: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
               var64 = null;
            }

            var16 = new FileAttachmentViewHolder(var84, var64);
            break;
         case 12:
            val var62: Context = var1.getContext();
            var16 = new MessageComponentsViewHolder(new MessageComponentsView(var62, null, 0, 6, null));
            break;
         case 13:
            val var61: TextView = TimestampViewBinding.inflate(LayoutInflater.from(var1.getContext()), var1, false).getRoot();
            var16 = new TimestampViewHolder(var61);
            break;
         case 14:
            val var59: Context = var1.getContext();
            val var83: WelcomeStickerView = new WelcomeStickerView(var59, null, 2, null);
            var var60: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
               var60 = null;
            }

            var16 = new WelcomeStickerViewHolder(
               var83,
               new Function2<Sticker, MessageId, Unit>(var60) {
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
                     (super.receiver as ChatEventHandler).onWelcomeReplyClicked-Ayv7vGE(var1, var2);
                  }
               }
            );
            break;
         case 15:
            val var57: Context = var1.getContext();
            val var82: GuildEventInviteView = new GuildEventInviteView(var57, null, 0, 6, null);
            var var58: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
               var58 = null;
            }

            var16 = new GuildEventInviteViewHolder(var82, var58, new G(this));
            break;
         case 16:
            val var56: Context = var1.getContext();
            var16 = new GiftViewHolder(new GiftView(var56, null, 2, null));
            break;
         case 18:
            val var54: Context = var1.getContext();
            val var86: EphemeralIndicationView = new EphemeralIndicationView(var54, null, 0, 6, null);
            var var55: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
               var55 = null;
            }

            var16 = new EphemeralIndicationViewHolder(var86, var55);
            break;
         case 19:
            val var53: Context = var1.getContext();
            var16 = new InteractionStatusViewHolder(new InteractionStatusView(var53, null, 2, null));
            break;
         case 20:
            val var52: Context = var1.getContext();
            var16 = new ForumPostActionBarViewHolder(new ForumPostActionBarView(var52, null, 0, 6, null));
            break;
         case 21:
            val var50: Context = var1.getContext();
            val var81: FlaggedMessageEmbedView = new FlaggedMessageEmbedView(var50, null, 2, null);
            var var51: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
               var51 = null;
            }

            var16 = new FlaggedMessageEmbedViewHolder(var81, var51);
            break;
         case 22:
            val var49: Context = var1.getContext();
            var16 = new FlaggedMessageActionBarViewHolder(new FlaggedMessageActionBarView(var49, null, 0, 6, null));
            break;
         case 23:
            val var48: Context = var1.getContext();
            var16 = new RoleSubscriptionPurchaseViewHolder(new RoleSubscriptionPurchaseView(var48, null, 0, 6, null));
            break;
         case 24:
            val var46: Context = var1.getContext();
            val var80: SurveyIndicationView = new SurveyIndicationView(var46, null, 0, 6, null);
            var var47: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
               var47 = null;
            }

            var16 = new SurveyIndicationViewHolder(var80, var47);
            break;
         case 25:
            val var44: Context = var1.getContext();
            val var79: GuildInviteDisabledView = new GuildInviteDisabledView(var44, null, 0, 6, null);
            var var45: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
               var45 = null;
            }

            var16 = new GuildInviteDisabledViewHolder(var79, var45);
            break;
         case 26:
            val var43: Context = var1.getContext();
            var16 = new AttachmentMediaMosaicViewHolder(new AttachmentMediaMosaicContainerView(var43, null, 2, null));
            break;
         case 27:
            val var42: Context = var1.getContext();
            var16 = new StickerGifViewHolder(new StickerView(var42, null, 0, 6, null));
            break;
         case 28:
            val var40: Context = var1.getContext();
            val var78: InviteToSpeakView = new InviteToSpeakView(var40, null, 2, null);
            var var41: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
               var41 = null;
            }

            var16 = new InviteToSpeakViewHolder(var78, new Function1<MessageId, Unit>(var41) {
               {
                  super(1, var1, ChatEventHandler::class.java, "onTapInviteToSpeak", "onTapInviteToSpeak-1xi1bu0(Ljava/lang/String;)V", 0);
               }

               public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
                  (super.receiver as ChatEventHandler).onTapInviteToSpeak-1xi1bu0(var1);
               }
            });
            break;
         case 29:
            val var39: Context = var1.getContext();
            var16 = new AudioPlayerViewHolder(new AudioPlayerView(var39, null, 0, 6, null));
            break;
         case 31:
            val var37: Context = var1.getContext();
            val var77: EmbeddedActivityInviteView = new EmbeddedActivityInviteView(var37, null, 0, 6, null);
            var var38: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
               var38 = null;
            }

            var16 = new EmbeddedActivityInviteViewHolder(var77, var38);
            break;
         case 32:
            val var36: Context = var1.getContext();
            var16 = new PostPreviewEmbedViewHolder(new PostPreviewEmbedView(var36, null, 0, 6, null));
            break;
         case 33:
            val var35: Context = var1.getContext();
            var16 = new AutoModerationNotificationEmbedViewHolder(new AutoModerationNotificationEmbedView(var35, null, 2, null));
            break;
         case 34:
            val var34: Context = var1.getContext();
            var16 = new ChannelPromptActionsViewHolder(new ChannelPromptActionsView(var34, null, 2, null));
            break;
         case 35:
            val var33: Context = var1.getContext();
            var16 = new InfoLinkViewHolder(new InfoLinkView(var33, null, 2, null));
            break;
         case 36:
            val var32: Context = var1.getContext();
            var16 = new SafetyPolicyNoticeViewHolder(new SafetyPolicyNoticeView(var32, null, 2, null));
            break;
         case 37:
            val var31: Context = var1.getContext();
            var16 = new PollViewHolder(new PollTextAndImageView(var31, null, 0, 6, null));
            break;
         case 38:
            val var30: Context = var1.getContext();
            var16 = new PollViewHolder(new PollImageOnlyView(var30, null, 0, 6, null));
            break;
         case 39:
            val var29: Context = var1.getContext();
            var16 = new SafetySystemNotificationViewHolder(new SafetySystemNotificationView(var29, null, 2, null));
            break;
         case 40:
            val var27: Context = var1.getContext();
            val var76: ActivityInstanceEmbedView = new ActivityInstanceEmbedView(var27, null, 0, 6, null);
            var var28: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
               var28 = null;
            }

            var16 = new ActivityInstanceEmbedViewHolder(var76, var28);
            break;
         case 41:
            val var26: Context = var1.getContext();
            var16 = new CtaButtonViewHolder(new CtaButtonView(var26, null, 2, null));
            break;
         case 43:
            val var25: Context = var1.getContext();
            var16 = new ForwardHeaderViewHolder(new ForwardHeaderView(var25, null, 2, null));
            break;
         case 44:
            val var24: Context = var1.getContext();
            var16 = new ForwardBreadcrumbViewHolder(new ForwardBreadcrumbView(var24, null, 2, null));
            break;
         case 49:
            val var23: Context = var1.getContext();
            var16 = new MosaicItemMessageAttachmentImageViewHolder(new MediaImageView(var23, null, 2, null));
            break;
         case 50:
            val var22: Context = var1.getContext();
            var16 = new MosaicItemMessageAttachmentVideoViewHolder(new MediaVideoView(var22, null, 2, null));
            break;
         case 52:
            val var21: Context = var1.getContext();
            var16 = new ReferralViewHolder(new ReferralView(var21, null, 2, null));
            break;
         case 53:
            val var20: Context = var1.getContext();
            var16 = new GuildProfileInviteViewHolder(new GuildProfileInviteView(var20, null, 0, 6, null));
            break;
         case 54:
            val var18: Context = var1.getContext();
            val var75: AppMessageEmbedView = new AppMessageEmbedView(var18, null, 0, 6, null);
            var var19: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
               var19 = null;
            }

            var16 = new AppMessageEmbedViewHolder(var75, var19);
            break;
         case 55:
            val var17: Context = var1.getContext();
            var16 = new ActivityRichPresenceInviteEmbedViewHolder(new ActivityRichPresenceInviteEmbedView(var17, null, 0, 6, null));
            break;
         case 56:
            val var15: Context = var1.getContext();
            var16 = new SharedCustomThemeViewHolder(new SharedCustomThemeView(var15, null, 2, null));
      }

      return (MessagePartViewHolder)var16;
   }

   public open fun onViewRecycled(holder: MessagePartViewHolder) {
      if (var1 is AudioPlayerViewHolder) {
         (var1 as AudioPlayerViewHolder).onViewRecycled();
      }

      super.onViewRecycled(var1);
   }

   public fun setComponentProvider(botComponentProvider: ComponentProvider?) {
      this.botComponentProvider = var1;
   }

   public fun setEventHandler(eventHandler: ChatEventHandler) {
      this.eventHandler = var1;
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setItems(messageId: MessageId, channelId: ChannelId, guildId: GuildId?, items: List<MessageAccessory>) {
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
