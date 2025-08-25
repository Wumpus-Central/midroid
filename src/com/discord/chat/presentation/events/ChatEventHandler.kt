package com.discord.chat.presentation.events

import com.discord.chat.bridge.MediaType
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
import com.discord.chat.bridge.sticker.Sticker
import com.discord.chat.presentation.list.ScrollState
import com.discord.chat.reactevents.ViewResizeMode
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import com.discord.reactions.ReactionView.Reaction

public interface ChatEventHandler {
   public val onMessageLongPressed: ((MessageId, ChannelId, Int?, MediaType?, String?, Int?) -> Unit)?
   public val onMessageTapped: ((MessageId, ChannelId) -> Unit)?
   public val onMessageDoubleTapped: ((MessageId, ChannelId) -> Unit)?

   public abstract fun mediaAttachmentPlaybackEnded(
      messageId: MessageId,
      totalDurationSecs: Float,
      endDurationSecs: Float,
      senderUserId: UserId,
      durationListeningSecs: Float,
      isVoiceMessage: Boolean,
      attachmentId: String
   ) {
   }

   public abstract fun mediaAttachmentPlaybackStarted(
      messageId: MessageId,
      totalDurationSecs: Float,
      startDurationSecs: Float,
      senderUserId: UserId,
      isVoiceMessage: Boolean,
      attachmentId: String
   ) {
   }

   public abstract fun onCompleteFirstLayout() {
   }

   public abstract fun onFirstLayout(
      firstVisibleMessageIndex: Int,
      firstVisibleMessagePercentVisible: Double?,
      lastVisibleMessageIndex: Int,
      lastVisibleMessagePercentVisible: Double?
   ) {
   }

   public abstract fun onInitiateEdit(messageId: MessageId, channelId: ChannelId) {
   }

   public abstract fun onInitiateReply(messageId: MessageId, channelId: ChannelId, triggerHaptic: Boolean? = ..., location: String? = ...) {
   }

   public abstract fun onInitiateThread(messageId: MessageId, channelId: ChannelId) {
   }

   public abstract fun onLinkClicked(messageId: MessageId, node: LinkContentNode) {
   }

   public abstract fun onLinkClicked(messageId: MessageId, url: String, title: String? = ...) {
   }

   public abstract fun onLinkLongClicked(node: LinkContentNode) {
   }

   public abstract fun onLongPressAttachmentLink(attachmentUrl: String, attachmentName: String) {
   }

   public abstract fun onLongPressAvatar(messageId: MessageId, userId: UserId) {
   }

   public abstract fun onLongPressChannel(channelId: String, guildId: String?, messageId: String?, originalLink: String?) {
   }

   public abstract fun onLongPressCommand(node: CommandMentionContentNode) {
   }

   public abstract fun onLongPressPollImage(
      channelId: ChannelId,
      messageId: MessageId,
      attachmentId: String,
      viewWidth: Int,
      viewHeight: Int,
      viewX: Int,
      viewY: Int,
      viewResizeMode: ViewResizeMode
   ) {
   }

   public abstract fun onLongPressReaction(messageId: MessageId, channelId: ChannelId, reaction: Reaction?) {
   }

   public abstract fun onLongPressUsername(messageId: MessageId, userId: UserId) {
   }

   public abstract fun onMediaPlayFinishedAnalytics(analytics: MediaPlayFinishedAnalytics) {
   }

   public abstract fun onScrollStateChanged(scrollState: ScrollState, changesetUpdateId: Int) {
   }

   public abstract fun onStickerClicked(sticker: Sticker, messageId: MessageId) {
   }

   public abstract fun onStickerLongClicked(sticker: Sticker, messageId: MessageId) {
   }

   public abstract fun onTapAppMessageEmbed(messageId: String, actionId: String, appId: String, embedUrl: String) {
   }

   public abstract fun onTapAttachmentLink(attachmentUrl: String) {
   }

   public abstract fun onTapAutoModerationActions(messageId: MessageId, channelId: ChannelId) {
   }

   public abstract fun onTapAutoModerationFeedback(messageId: MessageId, channelId: ChannelId) {
   }

   public abstract fun onTapAvatar(messageId: MessageId, userId: UserId) {
   }

   public abstract fun onTapButtonActionComponent(messageId: MessageId, componentId: String) {
   }

   public abstract fun onTapCall(messageId: MessageId, channelId: ChannelId) {
   }

   public abstract fun onTapCancelUploadItem(uploaderId: String, itemId: String) {
   }

   public abstract fun onTapChannel(channelId: String, guildId: String?, messageId: String?) {
   }

   public abstract fun onTapChannelPromptButton(messageId: MessageId, channelId: ChannelId, buttonType: String) {
   }

   public abstract fun onTapClanTagChiplet(guildId: GuildId) {
   }

   public abstract fun onTapCommand(node: CommandMentionContentNode) {
   }

   public abstract fun onTapConnectionsRoleTag(userId: String, guildId: String, channelId: String, roleId: String) {
   }

   public abstract fun onTapContentInventoryEntryEmbed(messageId: MessageId, authorId: UserId, contentId: String, tappedElement: String) {
   }

   public abstract fun onTapCopyText(text: CharSequence) {
   }

   public abstract fun onTapCtaButton(channelId: ChannelId, messageId: MessageId, callback: String) {
   }

   public abstract fun onTapDismissMediaPostSharePrompt(messageId: MessageId) {
   }

   public abstract fun onTapEmoji(emoji: EmojiContentNode) {
   }

   public abstract fun onTapFollowForumPost(messageId: MessageId, channelId: ChannelId) {
   }

   public abstract fun onTapForwardFooter(snapshotIndex: Int, channelId: ChannelId, messageId: MessageId) {
   }

   public abstract fun onTapGameIcon(gameApplicationId: String, timestamp: String) {
   }

   public abstract fun onTapGiftCodeAccept(giftCode: String, messageId: MessageId?) {
   }

   public abstract fun onTapGiftCodeEmbed(giftCode: String) {
   }

   public abstract fun onTapImage(
      messageId: MessageId,
      attachmentIndex: Int,
      type: String,
      viewWidth: Int,
      viewHeight: Int,
      viewX: Int,
      viewY: Int,
      viewResizeMode: ViewResizeMode,
      portal: Double?,
      embedIndex: Int?,
      componentId: String?,
      componentMediaIndex: Int?
   ) {
   }

   public abstract fun onTapInlineCode(node: InlineCodeContentNode) {
   }

   public abstract fun onTapInlineForward(
      channelId: ChannelId,
      messageId: MessageId,
      targetKind: String,
      embedIndex: Int?,
      triggerHaptic: Boolean? = ...,
      location: String? = ...
   ) {
   }

   public abstract fun onTapInviteEmbed(messageId: MessageId, index: Int, primary: Boolean?, secondary: Boolean?) {
   }

   public abstract fun onTapInviteEmbedAccept(messageId: MessageId, index: Int) {
   }

   public abstract fun onTapInviteToSpeak(messageId: MessageId) {
   }

   public abstract fun onTapJoinActivity(messageId: MessageId) {
   }

   public abstract fun onTapJoinRichPresence(messageId: MessageId) {
   }

   public abstract fun onTapLoadMessagesAfter() {
   }

   public abstract fun onTapLoadMessagesBefore() {
   }

   public abstract fun onTapMention(userId: String?, channelId: String, roleName: String?, parsedUserId: String?) {
   }

   public abstract fun onTapMessageReply(channelId: ChannelId, originId: MessageId) {
   }

   public abstract fun onTapObscuredMediaLearnMore(messageId: MessageId, channelId: ChannelId, attachmentId: String?, embedId: String?) {
   }

   public abstract fun onTapObscuredMediaToggle(messageId: MessageId, channelId: ChannelId, isReveal: Boolean, attachmentId: String?, embedId: String?) {
   }

   public abstract fun onTapOpTag() {
   }

   public abstract fun onTapPollAction(channelId: ChannelId, messageId: MessageId, type: String) {
   }

   public abstract fun onTapPollAnswer(channelId: ChannelId, messageId: MessageId, answerId: String) {
   }

   public abstract fun onTapPollSubmitVote(channelId: ChannelId, messageId: MessageId) {
   }

   public abstract fun onTapPostPreviewEmbed(guildId: GuildId, parentChannelId: ChannelId, threadId: ChannelId, messageId: MessageId) {
   }

   public abstract fun onTapReaction(messageId: MessageId, reaction: Reaction?, isBurst: Boolean? = ..., location: String? = ...) {
   }

   public abstract fun onTapReactionOverflow(messageId: MessageId, channelId: ChannelId) {
   }

   public abstract fun onTapReferralRedeem(referralId: String?) {
   }

   public abstract fun onTapRemix(messageId: MessageId) {
   }

   public abstract fun onTapRoleIcon(roleName: String, roleIconSource: String) {
   }

   public abstract fun onTapSafetyPolicyNoticeEmbed(classificationId: String) {
   }

   public abstract fun onTapSafetySystemNotificationCta(ctaType: String, ctaKey: String) {
   }

   public abstract fun onTapSeeMore(messageId: MessageId) {
   }

   public abstract fun onTapSelectActionComponent(messageId: MessageId, componentId: String) {
   }

   public abstract fun onTapShareForumPost(channelId: ChannelId, guildId: GuildId) {
   }

   public abstract fun onTapShowAltText(description: String) {
   }

   public abstract fun onTapSoundmoji(node: SoundmojiContentNode) {
   }

   public abstract fun onTapSummary(channelId: ChannelId, messageId: MessageId, summaryId: String) {
   }

   public abstract fun onTapSummaryJump(channelId: ChannelId, messageId: MessageId, summaryId: String) {
   }

   public abstract fun onTapSuppressNotificationsIcon() {
   }

   public abstract fun onTapTag(messageId: MessageId, channelId: ChannelId, tagType: String?) {
   }

   public abstract fun onTapThreadEmbed(messageId: MessageId) {
   }

   public abstract fun onTapTimestamp(timestamp: String) {
   }

   public abstract fun onTapToggleBlockedMessages(messageId: MessageId) {
   }

   public abstract fun onTapUsername(messageId: MessageId, userId: UserId) {
   }

   public abstract fun onWelcomeReplyClicked(sticker: Sticker, messageId: MessageId) {
   }

   public abstract fun voiceMessagePlaybackFailed(messageId: MessageId, errorMessage: String?) {
   }

   // $VF: Class flags could not be determined
   internal class DefaultImpls

   public object Empty : ChatEventHandler {
      public open val onMessageLongPressed: Nothing?
      public open val onMessageTapped: Nothing?
      public open val onMessageDoubleTapped: Nothing?

      public override fun mediaAttachmentPlaybackEnded(
         messageId: MessageId,
         totalDurationSecs: Float,
         endDurationSecs: Float,
         senderUserId: UserId,
         durationListeningSecs: Float,
         isVoiceMessage: Boolean,
         attachmentId: String
      ) {
      }

      public override fun mediaAttachmentPlaybackStarted(
         messageId: MessageId,
         totalDurationSecs: Float,
         startDurationSecs: Float,
         senderUserId: UserId,
         isVoiceMessage: Boolean,
         attachmentId: String
      ) {
      }

      public override fun onCompleteFirstLayout() {
      }

      public override fun onFirstLayout(
         firstVisibleMessageIndex: Int,
         firstVisibleMessagePercentVisible: Double?,
         lastVisibleMessageIndex: Int,
         lastVisibleMessagePercentVisible: Double?
      ) {
      }

      public override fun onInitiateEdit(messageId: MessageId, channelId: ChannelId) {
      }

      public override fun onInitiateReply(messageId: MessageId, channelId: ChannelId, triggerHaptic: Boolean?, location: String?) {
      }

      public override fun onInitiateThread(messageId: MessageId, channelId: ChannelId) {
      }

      public override fun onLinkClicked(messageId: MessageId, node: LinkContentNode) {
      }

      public override fun onLinkClicked(messageId: MessageId, url: String, title: String?) {
      }

      public override fun onLinkLongClicked(node: LinkContentNode) {
      }

      public override fun onLongPressAttachmentLink(attachmentUrl: String, attachmentName: String) {
      }

      public override fun onLongPressAvatar(messageId: MessageId, userId: UserId) {
      }

      public override fun onLongPressChannel(channelId: String, guildId: String?, messageId: String?, originalLink: String?) {
      }

      public override fun onLongPressCommand(node: CommandMentionContentNode) {
      }

      public override fun onLongPressPollImage(
         channelId: ChannelId,
         messageId: MessageId,
         attachmentId: String,
         viewWidth: Int,
         viewHeight: Int,
         viewX: Int,
         viewY: Int,
         viewResizeMode: ViewResizeMode
      ) {
      }

      public override fun onLongPressReaction(messageId: MessageId, channelId: ChannelId, reaction: Reaction?) {
      }

      public override fun onLongPressUsername(messageId: MessageId, userId: UserId) {
      }

      public override fun onMediaPlayFinishedAnalytics(analytics: MediaPlayFinishedAnalytics) {
      }

      public override fun onScrollStateChanged(scrollState: ScrollState, changesetUpdateId: Int) {
      }

      public override fun onStickerClicked(sticker: Sticker, messageId: MessageId) {
      }

      public override fun onStickerLongClicked(sticker: Sticker, messageId: MessageId) {
      }

      public override fun onTapAppMessageEmbed(messageId: String, actionId: String, appId: String, embedUrl: String) {
      }

      public override fun onTapAttachmentLink(attachmentUrl: String) {
      }

      public override fun onTapAutoModerationActions(messageId: MessageId, channelId: ChannelId) {
      }

      public override fun onTapAutoModerationFeedback(messageId: MessageId, channelId: ChannelId) {
      }

      public override fun onTapAvatar(messageId: MessageId, userId: UserId) {
      }

      public override fun onTapButtonActionComponent(messageId: MessageId, componentId: String) {
      }

      public override fun onTapCall(messageId: MessageId, channelId: ChannelId) {
      }

      public override fun onTapCancelUploadItem(uploaderId: String, itemId: String) {
      }

      public override fun onTapChannel(channelId: String, guildId: String?, messageId: String?) {
      }

      public override fun onTapChannelPromptButton(messageId: MessageId, channelId: ChannelId, buttonType: String) {
      }

      public override fun onTapClanTagChiplet(guildId: GuildId) {
      }

      public override fun onTapCommand(node: CommandMentionContentNode) {
      }

      public override fun onTapConnectionsRoleTag(userId: String, guildId: String, channelId: String, roleId: String) {
      }

      public override fun onTapContentInventoryEntryEmbed(messageId: MessageId, authorId: UserId, contentId: String, tappedElement: String) {
      }

      public override fun onTapCopyText(text: CharSequence) {
      }

      public override fun onTapCtaButton(channelId: ChannelId, messageId: MessageId, callback: String) {
      }

      public override fun onTapDismissMediaPostSharePrompt(messageId: MessageId) {
      }

      public override fun onTapEmoji(emoji: EmojiContentNode) {
      }

      public override fun onTapFollowForumPost(messageId: MessageId, channelId: ChannelId) {
      }

      public override fun onTapForwardFooter(snapshotIndex: Int, channelId: ChannelId, messageId: MessageId) {
      }

      public override fun onTapGameIcon(gameApplicationId: String, timestamp: String) {
      }

      public override fun onTapGiftCodeAccept(giftCode: String, messageId: MessageId?) {
      }

      public override fun onTapGiftCodeEmbed(giftCode: String) {
      }

      public override fun onTapImage(
         messageId: MessageId,
         attachmentIndex: Int,
         type: String,
         viewWidth: Int,
         viewHeight: Int,
         viewX: Int,
         viewY: Int,
         viewResizeMode: ViewResizeMode,
         portal: Double?,
         embedIndex: Int?,
         componentId: String?,
         componentMediaIndex: Int?
      ) {
      }

      public override fun onTapInlineCode(node: InlineCodeContentNode) {
      }

      public override fun onTapInlineForward(
         channelId: ChannelId,
         messageId: MessageId,
         targetKind: String,
         embedIndex: Int?,
         triggerHaptic: Boolean?,
         location: String?
      ) {
      }

      public override fun onTapInviteEmbed(messageId: MessageId, index: Int, primary: Boolean?, secondary: Boolean?) {
      }

      public override fun onTapInviteEmbedAccept(messageId: MessageId, index: Int) {
      }

      public override fun onTapInviteToSpeak(messageId: MessageId) {
      }

      public override fun onTapJoinActivity(messageId: MessageId) {
      }

      public override fun onTapJoinRichPresence(messageId: MessageId) {
      }

      public override fun onTapLoadMessagesAfter() {
      }

      public override fun onTapLoadMessagesBefore() {
      }

      public override fun onTapMention(userId: String?, channelId: String, roleName: String?, parsedUserId: String?) {
      }

      public override fun onTapMessageReply(channelId: ChannelId, originId: MessageId) {
      }

      public override fun onTapObscuredMediaLearnMore(messageId: MessageId, channelId: ChannelId, attachmentId: String?, embedId: String?) {
      }

      public override fun onTapObscuredMediaToggle(messageId: MessageId, channelId: ChannelId, isReveal: Boolean, attachmentId: String?, embedId: String?) {
      }

      public override fun onTapOpTag() {
      }

      public override fun onTapPollAction(channelId: ChannelId, messageId: MessageId, type: String) {
      }

      public override fun onTapPollAnswer(channelId: ChannelId, messageId: MessageId, answerId: String) {
      }

      public override fun onTapPollSubmitVote(channelId: ChannelId, messageId: MessageId) {
      }

      public override fun onTapPostPreviewEmbed(guildId: GuildId, parentChannelId: ChannelId, threadId: ChannelId, messageId: MessageId) {
      }

      public override fun onTapReaction(messageId: MessageId, reaction: Reaction?, isBurst: Boolean?, location: String?) {
      }

      public override fun onTapReactionOverflow(messageId: MessageId, channelId: ChannelId) {
      }

      public override fun onTapReferralRedeem(referralId: String?) {
      }

      public override fun onTapRemix(messageId: MessageId) {
      }

      public override fun onTapRoleIcon(roleName: String, roleIconSource: String) {
      }

      public override fun onTapSafetyPolicyNoticeEmbed(classificationId: String) {
      }

      public override fun onTapSafetySystemNotificationCta(ctaType: String, ctaKey: String) {
      }

      public override fun onTapSeeMore(messageId: MessageId) {
      }

      public override fun onTapSelectActionComponent(messageId: MessageId, componentId: String) {
      }

      public override fun onTapShareForumPost(channelId: ChannelId, guildId: GuildId) {
      }

      public override fun onTapShowAltText(description: String) {
      }

      public override fun onTapSoundmoji(node: SoundmojiContentNode) {
      }

      public override fun onTapSummary(channelId: ChannelId, messageId: MessageId, summaryId: String) {
      }

      public override fun onTapSummaryJump(channelId: ChannelId, messageId: MessageId, summaryId: String) {
      }

      public override fun onTapSuppressNotificationsIcon() {
      }

      public override fun onTapTag(messageId: MessageId, channelId: ChannelId, tagType: String?) {
      }

      public override fun onTapThreadEmbed(messageId: MessageId) {
      }

      public override fun onTapTimestamp(timestamp: String) {
      }

      public override fun onTapToggleBlockedMessages(messageId: MessageId) {
      }

      public override fun onTapUsername(messageId: MessageId, userId: UserId) {
      }

      public override fun onWelcomeReplyClicked(sticker: Sticker, messageId: MessageId) {
      }

      public override fun voiceMessagePlaybackFailed(messageId: MessageId, errorMessage: String?) {
      }
   }
}
