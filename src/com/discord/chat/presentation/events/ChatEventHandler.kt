package com.discord.chat.presentation.events

import com.discord.chat.bridge.MediaType
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.sticker.Sticker
import com.discord.chat.presentation.list.ScrollState
import com.discord.chat.reactevents.ViewResizeMode
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics
import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import com.discord.reactions.ReactionView.Reaction
import kotlin.jvm.internal.q

public interface ChatEventHandler {
   public val onMessageLongPressed: ((MessageId, ChannelId, Int?, MediaType?, String?, Int?) -> Unit)?
   public val onMessageTapped: ((MessageId, ChannelId) -> Unit)?

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

   public abstract fun onFirstLayout(firstVisibleMessageIndex: Int, lastVisibleMessageIndex: Int) {
   }

   public abstract fun onInitiateEdit(messageId: MessageId, channelId: ChannelId) {
   }

   public abstract fun onInitiateReply(messageId: MessageId, channelId: ChannelId) {
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

   public abstract fun onTapActivityBookmarkEmbed(applicationId: ApplicationId, channelId: ChannelId) {
   }

   public abstract fun onTapActivityInstanceEmbed(applicationId: ApplicationId, channelId: ChannelId, instanceId: String, messageId: MessageId) {
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

   public abstract fun onTapInlineForward(channelId: ChannelId, messageId: MessageId, targetKind: String, embedIndex: Int?) {
   }

   public abstract fun onTapInviteEmbed(messageId: MessageId, index: Int, primary: Boolean?, secondary: Boolean?) {
   }

   public abstract fun onTapInviteToSpeak(messageId: MessageId) {
   }

   public abstract fun onTapJoinActivity(messageId: MessageId) {
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

   public abstract fun onTapReaction(messageId: MessageId, reaction: Reaction?, isBurst: Boolean? = ...) {
   }

   public abstract fun onTapReactionOverflow(messageId: MessageId, channelId: ChannelId) {
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

   public abstract fun onTapUploadProgressClose(fileId: String) {
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

      public override fun mediaAttachmentPlaybackEnded(
         messageId: MessageId,
         totalDurationSecs: Float,
         endDurationSecs: Float,
         senderUserId: UserId,
         durationListeningSecs: Float,
         isVoiceMessage: Boolean,
         attachmentId: String
      ) {
         q.h(var1, "messageId");
         q.h(var8, "attachmentId");
      }

      public override fun mediaAttachmentPlaybackStarted(
         messageId: MessageId,
         totalDurationSecs: Float,
         startDurationSecs: Float,
         senderUserId: UserId,
         isVoiceMessage: Boolean,
         attachmentId: String
      ) {
         q.h(var1, "messageId");
         q.h(var7, "attachmentId");
      }

      public override fun onCompleteFirstLayout() {
      }

      public override fun onFirstLayout(firstVisibleMessageIndex: Int, lastVisibleMessageIndex: Int) {
      }

      public override fun onInitiateEdit(messageId: MessageId, channelId: ChannelId) {
         q.h(var1, "messageId");
      }

      public override fun onInitiateReply(messageId: MessageId, channelId: ChannelId) {
         q.h(var1, "messageId");
      }

      public override fun onLinkClicked(messageId: MessageId, node: LinkContentNode) {
         q.h(var1, "messageId");
         q.h(var2, "node");
      }

      public override fun onLinkClicked(messageId: MessageId, url: String, title: String?) {
         q.h(var1, "messageId");
         q.h(var2, "url");
      }

      public override fun onLinkLongClicked(node: LinkContentNode) {
         q.h(var1, "node");
      }

      public override fun onLongPressAttachmentLink(attachmentUrl: String, attachmentName: String) {
         q.h(var1, "attachmentUrl");
         q.h(var2, "attachmentName");
      }

      public override fun onLongPressAvatar(messageId: MessageId, userId: UserId) {
         q.h(var1, "messageId");
      }

      public override fun onLongPressChannel(channelId: String, guildId: String?, messageId: String?, originalLink: String?) {
         q.h(var1, "channelId");
      }

      public override fun onLongPressCommand(node: CommandMentionContentNode) {
         q.h(var1, "node");
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
         q.h(var3, "messageId");
         q.h(var4, "attachmentId");
         q.h(var9, "viewResizeMode");
      }

      public override fun onLongPressReaction(messageId: MessageId, channelId: ChannelId, reaction: Reaction?) {
         q.h(var1, "messageId");
      }

      public override fun onLongPressUsername(messageId: MessageId, userId: UserId) {
         q.h(var1, "messageId");
      }

      public override fun onMediaPlayFinishedAnalytics(analytics: MediaPlayFinishedAnalytics) {
         q.h(var1, "analytics");
      }

      public override fun onScrollStateChanged(scrollState: ScrollState, changesetUpdateId: Int) {
         q.h(var1, "scrollState");
      }

      public override fun onStickerClicked(sticker: Sticker, messageId: MessageId) {
         q.h(var1, "sticker");
         q.h(var2, "messageId");
      }

      public override fun onStickerLongClicked(sticker: Sticker, messageId: MessageId) {
         q.h(var1, "sticker");
         q.h(var2, "messageId");
      }

      public override fun onTapActivityBookmarkEmbed(applicationId: ApplicationId, channelId: ChannelId) {
      }

      public override fun onTapActivityInstanceEmbed(applicationId: ApplicationId, channelId: ChannelId, instanceId: String, messageId: MessageId) {
         q.h(var5, "instanceId");
         q.h(var6, "messageId");
      }

      public override fun onTapAttachmentLink(attachmentUrl: String) {
         q.h(var1, "attachmentUrl");
      }

      public override fun onTapAutoModerationActions(messageId: MessageId, channelId: ChannelId) {
         q.h(var1, "messageId");
      }

      public override fun onTapAutoModerationFeedback(messageId: MessageId, channelId: ChannelId) {
         q.h(var1, "messageId");
      }

      public override fun onTapAvatar(messageId: MessageId, userId: UserId) {
         q.h(var1, "messageId");
      }

      public override fun onTapButtonActionComponent(messageId: MessageId, componentId: String) {
         q.h(var1, "messageId");
         q.h(var2, "componentId");
      }

      public override fun onTapCall(messageId: MessageId, channelId: ChannelId) {
         q.h(var1, "messageId");
      }

      public override fun onTapCancelUploadItem(uploaderId: String, itemId: String) {
         q.h(var1, "uploaderId");
         q.h(var2, "itemId");
      }

      public override fun onTapChannel(channelId: String, guildId: String?, messageId: String?) {
         q.h(var1, "channelId");
      }

      public override fun onTapChannelPromptButton(messageId: MessageId, channelId: ChannelId, buttonType: String) {
         q.h(var1, "messageId");
         q.h(var4, "buttonType");
      }

      public override fun onTapClanTagChiplet(guildId: GuildId) {
      }

      public override fun onTapCommand(node: CommandMentionContentNode) {
         q.h(var1, "node");
      }

      public override fun onTapConnectionsRoleTag(userId: String, guildId: String, channelId: String, roleId: String) {
         q.h(var1, "userId");
         q.h(var2, "guildId");
         q.h(var3, "channelId");
         q.h(var4, "roleId");
      }

      public override fun onTapContentInventoryEntryEmbed(messageId: MessageId, authorId: UserId, contentId: String, tappedElement: String) {
         q.h(var1, "messageId");
         q.h(var4, "contentId");
         q.h(var5, "tappedElement");
      }

      public override fun onTapCopyText(text: CharSequence) {
         q.h(var1, "text");
      }

      public override fun onTapCtaButton(channelId: ChannelId, messageId: MessageId, callback: String) {
         q.h(var3, "messageId");
         q.h(var4, "callback");
      }

      public override fun onTapDismissMediaPostSharePrompt(messageId: MessageId) {
         q.h(var1, "messageId");
      }

      public override fun onTapEmoji(emoji: EmojiContentNode) {
         q.h(var1, "emoji");
      }

      public override fun onTapFollowForumPost(messageId: MessageId, channelId: ChannelId) {
         q.h(var1, "messageId");
      }

      public override fun onTapForwardFooter(snapshotIndex: Int, channelId: ChannelId, messageId: MessageId) {
         q.h(var4, "messageId");
      }

      public override fun onTapGameIcon(gameApplicationId: String, timestamp: String) {
         q.h(var1, "gameApplicationId");
         q.h(var2, "timestamp");
      }

      public override fun onTapGiftCodeAccept(giftCode: String, messageId: MessageId?) {
         q.h(var1, "giftCode");
      }

      public override fun onTapGiftCodeEmbed(giftCode: String) {
         q.h(var1, "giftCode");
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
         q.h(var1, "messageId");
         q.h(var3, "type");
         q.h(var8, "viewResizeMode");
      }

      public override fun onTapInlineForward(channelId: ChannelId, messageId: MessageId, targetKind: String, embedIndex: Int?) {
         q.h(var3, "messageId");
         q.h(var4, "targetKind");
      }

      public override fun onTapInviteEmbed(messageId: MessageId, index: Int, primary: Boolean?, secondary: Boolean?) {
         q.h(var1, "messageId");
      }

      public override fun onTapInviteToSpeak(messageId: MessageId) {
         q.h(var1, "messageId");
      }

      public override fun onTapJoinActivity(messageId: MessageId) {
         q.h(var1, "messageId");
      }

      public override fun onTapLoadMessagesAfter() {
      }

      public override fun onTapLoadMessagesBefore() {
      }

      public override fun onTapMention(userId: String?, channelId: String, roleName: String?, parsedUserId: String?) {
         q.h(var2, "channelId");
      }

      public override fun onTapMessageReply(channelId: ChannelId, originId: MessageId) {
         q.h(var3, "originId");
      }

      public override fun onTapObscuredMediaLearnMore(messageId: MessageId, channelId: ChannelId, attachmentId: String?, embedId: String?) {
         q.h(var1, "messageId");
      }

      public override fun onTapOpTag() {
      }

      public override fun onTapPollAction(channelId: ChannelId, messageId: MessageId, type: String) {
         q.h(var3, "messageId");
         q.h(var4, "type");
      }

      public override fun onTapPollAnswer(channelId: ChannelId, messageId: MessageId, answerId: String) {
         q.h(var3, "messageId");
         q.h(var4, "answerId");
      }

      public override fun onTapPollSubmitVote(channelId: ChannelId, messageId: MessageId) {
         q.h(var3, "messageId");
      }

      public override fun onTapPostPreviewEmbed(guildId: GuildId, parentChannelId: ChannelId, threadId: ChannelId, messageId: MessageId) {
         q.h(var7, "messageId");
      }

      public override fun onTapReaction(messageId: MessageId, reaction: Reaction?, isBurst: Boolean?) {
         q.h(var1, "messageId");
      }

      public override fun onTapReactionOverflow(messageId: MessageId, channelId: ChannelId) {
         q.h(var1, "messageId");
      }

      public override fun onTapRemix(messageId: MessageId) {
         q.h(var1, "messageId");
      }

      public override fun onTapRoleIcon(roleName: String, roleIconSource: String) {
         q.h(var1, "roleName");
         q.h(var2, "roleIconSource");
      }

      public override fun onTapSafetyPolicyNoticeEmbed(classificationId: String) {
         q.h(var1, "classificationId");
      }

      public override fun onTapSafetySystemNotificationCta(ctaType: String, ctaKey: String) {
         q.h(var1, "ctaType");
         q.h(var2, "ctaKey");
      }

      public override fun onTapSeeMore(messageId: MessageId) {
         q.h(var1, "messageId");
      }

      public override fun onTapSelectActionComponent(messageId: MessageId, componentId: String) {
         q.h(var1, "messageId");
         q.h(var2, "componentId");
      }

      public override fun onTapShareForumPost(channelId: ChannelId, guildId: GuildId) {
      }

      public override fun onTapShowAltText(description: String) {
         q.h(var1, "description");
      }

      public override fun onTapSummary(channelId: ChannelId, messageId: MessageId, summaryId: String) {
         q.h(var3, "messageId");
         q.h(var4, "summaryId");
      }

      public override fun onTapSummaryJump(channelId: ChannelId, messageId: MessageId, summaryId: String) {
         q.h(var3, "messageId");
         q.h(var4, "summaryId");
      }

      public override fun onTapSuppressNotificationsIcon() {
      }

      public override fun onTapTag(messageId: MessageId, channelId: ChannelId, tagType: String?) {
         q.h(var1, "messageId");
      }

      public override fun onTapThreadEmbed(messageId: MessageId) {
         q.h(var1, "messageId");
      }

      public override fun onTapTimestamp(timestamp: String) {
         q.h(var1, "timestamp");
      }

      public override fun onTapToggleBlockedMessages(messageId: MessageId) {
         q.h(var1, "messageId");
      }

      public override fun onTapUploadProgressClose(fileId: String) {
         q.h(var1, "fileId");
      }

      public override fun onTapUsername(messageId: MessageId, userId: UserId) {
         q.h(var1, "messageId");
      }

      public override fun onWelcomeReplyClicked(sticker: Sticker, messageId: MessageId) {
         q.h(var1, "sticker");
         q.h(var2, "messageId");
      }

      public override fun voiceMessagePlaybackFailed(messageId: MessageId, errorMessage: String?) {
         q.h(var1, "messageId");
      }
   }
}
