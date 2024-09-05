package com.discord.chat.reactevents

import android.content.Context
import com.discord.chat.bridge.MediaType
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.sticker.Sticker
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.events.TapReactionOverflow
import com.discord.chat.presentation.list.ScrollDirection
import com.discord.chat.presentation.list.ScrollState
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics
import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvents
import com.discord.reactions.ReactionView.Reaction
import com.facebook.react.bridge.ReactContext
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function6
import kotlin.jvm.internal.q

public open class ChatViewEventHandler(context: Context, reactEvents: ReactEvents, reactTag: () -> Int) : ChatEventHandler {
   private final val emitReactEvent: (ReactEvent) -> Unit
   public open val onMessageLongPressed: ((MessageId, ChannelId, Int?, MediaType?, String?, Int?) -> Unit)?
   public open val onMessageTapped: ((MessageId, ChannelId) -> Unit)?

   init {
      q.h(var1, "context");
      q.h(var2, "reactEvents");
      q.h(var3, "reactTag");
      super();
      this.emitReactEvent = new Function1(var2, var1, var3) {
         final Context $context;
         final ReactEvents $reactEvents;
         final Function0 $reactTag;

         {
            super(1);
            this.$reactEvents = var1;
            this.$context = var2;
            this.$reactTag = var3;
         }

         public final void invoke(ReactEvent var1) {
            q.h(var1, "event");
            val var3: ReactEvents = this.$reactEvents;
            val var2: Context = this.$context;
            q.f(this.$context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            var3.emitEvent(var2 as ReactContext, (this.$reactTag.invoke() as java.lang.Number).intValue(), var1);
         }
      };
      this.onMessageLongPressed = new Function6(this) {
         final ChatViewEventHandler this$0;

         {
            super(6);
            this.this$0 = var1;
         }

         public final void invoke_eTS4JUY/* $VF was: invoke-eTS4JUY*/(
            java.lang.String var1, long var2, Integer var4, MediaType var5, java.lang.String var6, Integer var7
         ) {
            q.h(var1, "messageId");
            val var9: Function1 = ChatViewEventHandler.access$getEmitReactEvent$p(this.this$0);
            val var11: java.lang.String = MessageId.toString-impl(var1);
            val var10: java.lang.String = ChannelId.toString-impl(var2);
            val var8: Int;
            if (var4 != null) {
               var8 = var4;
            } else {
               var8 = 0;
            }

            label18: {
               if (var5 != null) {
                  val var13: java.lang.String = var5.getType();
                  var1 = var13;
                  if (var13 != null) {
                     break label18;
                  }
               }

               var1 = "";
            }

            var9.invoke(new LongPressMessageEvent(var11, var10, var8, var1, var6, var7));
         }
      };
      this.onMessageTapped = new Function2(this) {
         final ChatViewEventHandler this$0;

         {
            super(2);
            this.this$0 = var1;
         }

         public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
            q.h(var1, "messageId");
            ChatViewEventHandler.access$getEmitReactEvent$p(this.this$0)
               .invoke(new TapMessageData(MessageId.toString-impl(var1), ChannelId.toString-impl(var2)));
         }
      };
   }

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
      this.emitReactEvent.invoke(new MediaAttachmentPlaybackEndedData(var1, var2, var3, var4, var6, var7, var8, null));
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
      this.emitReactEvent.invoke(new MediaAttachmentPlaybackStartedData(var1, var2, var3, var4, var6, var7, null));
   }

   public override fun onCompleteFirstLayout() {
      this.emitReactEvent.invoke(new CompleteFirstLayoutData());
   }

   public override fun onFirstLayout(firstVisibleMessageIndex: Int, lastVisibleMessageIndex: Int) {
      this.emitReactEvent.invoke(new FirstLayoutData(var1, var2));
   }

   public override fun onInitiateEdit(messageId: MessageId, channelId: ChannelId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new InitiateEditData(var1, var2, null));
   }

   public override fun onInitiateReply(messageId: MessageId, channelId: ChannelId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new InitiateReplyData(var1, var2, null));
   }

   public override fun onLinkClicked(messageId: MessageId, node: LinkContentNode) {
      q.h(var1, "messageId");
      q.h(var2, "node");
      this.emitReactEvent.invoke(new TapLinkData(var1, var2, null));
   }

   public override fun onLinkClicked(messageId: MessageId, url: String, title: String?) {
      q.h(var1, "messageId");
      q.h(var2, "url");
      var var4: java.lang.String = var3;
      if (var3 == null) {
         var4 = "";
      }

      this.emitReactEvent.invoke(new TapLinkData(var1, var4, var2, null, null, 24, null));
   }

   public override fun onLinkLongClicked(node: LinkContentNode) {
      q.h(var1, "node");
      this.emitReactEvent.invoke(new LongPressLinkData(var1.getTarget()));
   }

   public override fun onLongPressAttachmentLink(attachmentUrl: String, attachmentName: String) {
      q.h(var1, "attachmentUrl");
      q.h(var2, "attachmentName");
      this.emitReactEvent.invoke(new LongPressAttachmentLinkData(var1, var2));
   }

   public override fun onLongPressAvatar(messageId: MessageId, userId: UserId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new LongPressAvatarData(MessageId.toString-impl(var1), UserId.toString-impl(var2)));
   }

   public override fun onLongPressChannel(channelId: String, guildId: String?, messageId: String?, originalLink: String?) {
      q.h(var1, "channelId");
      this.emitReactEvent.invoke(new LongPressChannelData(var2, var1, var3, var4));
   }

   public override fun onLongPressCommand(node: CommandMentionContentNode) {
      q.h(var1, "node");
      this.emitReactEvent.invoke(new LongPressCommandData(var1));
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
      this.emitReactEvent
         .invoke(
            new LongPressPollImageData(
               ChannelId.toString-impl(var1), MessageId.toString-impl(var3), var4, new TapImageData.Layout(var5, var6, var7, var8, var9)
            )
         );
   }

   public override fun onLongPressReaction(messageId: MessageId, channelId: ChannelId, reaction: Reaction?) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new LongPressReactionData(var1, var2, var4, null));
   }

   public override fun onLongPressUsername(messageId: MessageId, userId: UserId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new LongPressUsernameData(MessageId.toString-impl(var1), UserId.toString-impl(var2)));
   }

   public override fun onMediaPlayFinishedAnalytics(analytics: MediaPlayFinishedAnalytics) {
      q.h(var1, "analytics");
      this.emitReactEvent.invoke(var1);
   }

   public override fun onScrollStateChanged(scrollState: ScrollState, changesetUpdateId: Int) {
      q.h(var1, "scrollState");
      val var3: Boolean;
      if (var1.isNearBottom() && var1.getScrollDirection() === ScrollDirection.DOWN) {
         var3 = true;
      } else {
         var3 = false;
      }

      val var4: Boolean;
      if (var1.isNearTop() && var1.getScrollDirection() === ScrollDirection.UP) {
         var4 = true;
      } else {
         var4 = false;
      }

      val var9: Function1 = this.emitReactEvent;
      val var7: Boolean = var1.isAtBottom();
      val var8: Boolean = var1.isDragging();
      val var6: Boolean = var1.isSettling();
      val var5: Boolean;
      if (!var1.isNearBottom() && !var1.isAtBottom()) {
         var5 = true;
      } else {
         var5 = false;
      }

      var9.invoke(
         new ChatScrollPositionEvent(
            var7, var3, var4, var8, var6, var5, var1.isFirstMessageVisible(), var1.getFirstVisibleMessageIndex(), var1.getLastVisibleMessageIndex(), var2
         )
      );
   }

   public override fun onStickerClicked(sticker: Sticker, messageId: MessageId) {
      q.h(var1, "sticker");
      q.h(var2, "messageId");
      this.emitReactEvent.invoke(new TapStickerData(var1, var2, null));
   }

   public override fun onStickerLongClicked(sticker: Sticker, messageId: MessageId) {
      q.h(var1, "sticker");
      q.h(var2, "messageId");
      this.emitReactEvent.invoke(new LongPressStickerData(var2, var1, null));
   }

   public override fun onTapActivityBookmarkEmbed(applicationId: ApplicationId, channelId: ChannelId) {
      this.emitReactEvent.invoke(new TapActivityBookmarkEmbedData(ApplicationId.toString-impl(var1), ChannelId.toString-impl(var3)));
   }

   public override fun onTapActivityInstanceEmbed(applicationId: ApplicationId, channelId: ChannelId, instanceId: String, messageId: MessageId) {
      q.h(var5, "instanceId");
      q.h(var6, "messageId");
      this.emitReactEvent
         .invoke(new TapActivityInstanceEmbedData(ApplicationId.toString-impl(var1), ChannelId.toString-impl(var3), var5, MessageId.toString-impl(var6)));
   }

   public override fun onTapAttachmentLink(attachmentUrl: String) {
      q.h(var1, "attachmentUrl");
      this.emitReactEvent.invoke(new TapAttachmentLinkData(var1));
   }

   public override fun onTapAutoModerationActions(messageId: MessageId, channelId: ChannelId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapAutoModerationActionsData(MessageId.toString-impl(var1), ChannelId.toString-impl(var2)));
   }

   public override fun onTapAutoModerationFeedback(messageId: MessageId, channelId: ChannelId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapAutoModerationFeedbackData(MessageId.toString-impl(var1), ChannelId.toString-impl(var2)));
   }

   public override fun onTapAvatar(messageId: MessageId, userId: UserId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapAvatarData(MessageId.toString-impl(var1), UserId.toString-impl(var2)));
   }

   public override fun onTapButtonActionComponent(messageId: MessageId, componentId: String) {
      q.h(var1, "messageId");
      q.h(var2, "componentId");
      this.emitReactEvent.invoke(new TapButtonActionComponent(var1, var2, null));
   }

   public override fun onTapCall(messageId: MessageId, channelId: ChannelId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapCallData(var1, var2, null));
   }

   public override fun onTapCancelUploadItem(uploaderId: String, itemId: String) {
      q.h(var1, "uploaderId");
      q.h(var2, "itemId");
      this.emitReactEvent.invoke(new TapCancelUploadItemData(var1, var2));
   }

   public override fun onTapChannel(channelId: String, guildId: String?, messageId: String?) {
      q.h(var1, "channelId");
      this.emitReactEvent.invoke(new TapChannelData(var2, var1, var3));
   }

   public override fun onTapChannelPromptButton(messageId: MessageId, channelId: ChannelId, buttonType: String) {
      q.h(var1, "messageId");
      q.h(var4, "buttonType");
      this.emitReactEvent.invoke(new TapChannelPromptButtonData(MessageId.toString-impl(var1), ChannelId.toString-impl(var2), var4));
   }

   public override fun onTapClanTagChiplet(guildId: GuildId) {
      this.emitReactEvent.invoke(new TapClanTagChipletData(GuildId.toString-impl(var1)));
   }

   public override fun onTapCommand(node: CommandMentionContentNode) {
      q.h(var1, "node");
      this.emitReactEvent.invoke(new TapCommandData(var1));
   }

   public override fun onTapConnectionsRoleTag(userId: String, guildId: String, channelId: String, roleId: String) {
      q.h(var1, "userId");
      q.h(var2, "guildId");
      q.h(var3, "channelId");
      q.h(var4, "roleId");
      this.emitReactEvent.invoke(new TapConnectionsRoleTagData(var1, var2, var3, var4));
   }

   public override fun onTapContentInventoryEntryEmbed(messageId: MessageId, authorId: UserId, contentId: String, tappedElement: String) {
      q.h(var1, "messageId");
      q.h(var4, "contentId");
      q.h(var5, "tappedElement");
      this.emitReactEvent.invoke(new TapContentInventoryEntryEmbedData(MessageId.toString-impl(var1), UserId.toString-impl(var2), var4, var5));
   }

   public override fun onTapCopyText(text: CharSequence) {
      q.h(var1, "text");
      this.emitReactEvent.invoke(new TapCopyText(var1));
   }

   public override fun onTapCtaButton(channelId: ChannelId, messageId: MessageId, callback: String) {
      q.h(var3, "messageId");
      q.h(var4, "callback");
      this.emitReactEvent.invoke(new TapCtaButton(ChannelId.toString-impl(var1), MessageId.toString-impl(var3), var4));
   }

   public override fun onTapDismissMediaPostSharePrompt(messageId: MessageId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapDismissMediaPostSharePromptData(var1, null));
   }

   public override fun onTapEmoji(emoji: EmojiContentNode) {
      q.h(var1, "emoji");
      this.emitReactEvent.invoke(new TapEmojiData(var1));
   }

   public override fun onTapFollowForumPost(messageId: MessageId, channelId: ChannelId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapFollowForumPost(MessageId.toString-impl(var1), ChannelId.toString-impl(var2)));
   }

   public override fun onTapForwardFooter(snapshotIndex: Int, channelId: ChannelId, messageId: MessageId) {
      q.h(var4, "messageId");
      this.emitReactEvent.invoke(new TapForwardFooterData(var1, ChannelId.toString-impl(var2), MessageId.toString-impl(var4)));
   }

   public override fun onTapGiftCodeAccept(giftCode: String, messageId: MessageId?) {
      q.h(var1, "giftCode");
      this.emitReactEvent.invoke(new TapGiftCodeAcceptData(var1, var2, null));
   }

   public override fun onTapGiftCodeEmbed(giftCode: String) {
      q.h(var1, "giftCode");
      this.emitReactEvent.invoke(new TapGiftCodeEmbedData(var1));
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
      this.emitReactEvent
         .invoke(new TapImageData(MessageId.toString-impl(var1), var2, var3, new TapImageData.Layout(var4, var5, var6, var7, var8), var9, var10, var11, var12));
   }

   public override fun onTapInlineForward(channelId: ChannelId, messageId: MessageId, targetKind: String, embedIndex: Int?) {
      q.h(var3, "messageId");
      q.h(var4, "targetKind");
      this.emitReactEvent.invoke(new TapInlineForwardData(ChannelId.toString-impl(var1), MessageId.toString-impl(var3), var4, var5));
   }

   public override fun onTapInviteEmbed(messageId: MessageId, index: Int, primary: Boolean?, secondary: Boolean?) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapInviteEvent(var1, var2, var3, var4));
   }

   public override fun onTapInviteToSpeak(messageId: MessageId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapInviteToSpeakData(var1, null));
   }

   public override fun onTapJoinActivity(messageId: MessageId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapJoinActivityData(var1, null));
   }

   public override fun onTapLoadMessagesAfter() {
      this.emitReactEvent.invoke(new TapSeparatorData("load_more_after", null, 2, null));
   }

   public override fun onTapLoadMessagesBefore() {
      this.emitReactEvent.invoke(new TapSeparatorData("load_more_before", null, 2, null));
   }

   public override fun onTapMention(userId: String?, channelId: String, roleName: String?, parsedUserId: String?) {
      q.h(var2, "channelId");
      this.emitReactEvent.invoke(new TapMentionData(var1, var2, var3, var4));
   }

   public override fun onTapMessageReply(channelId: ChannelId, originId: MessageId) {
      q.h(var3, "originId");
      this.emitReactEvent.invoke(new TapMessageReplyData(ChannelId.toString-impl(var1), MessageId.toString-impl(var3)));
   }

   public override fun onTapObscuredMediaLearnMore(messageId: MessageId, channelId: ChannelId, attachmentId: String?, embedId: String?) {
      q.h(var1, "messageId");
      this.emitReactEvent
         .invoke(
            new TapObscuredMediaLearnMoreData(
               MessageId.toString-impl(var1), ChannelId.toString-impl(var2), java.lang.String.valueOf(var4), java.lang.String.valueOf(var5)
            )
         );
   }

   public override fun onTapOpTag() {
      this.emitReactEvent.invoke(TapOpTagData.INSTANCE);
   }

   public override fun onTapPollAction(channelId: ChannelId, messageId: MessageId, type: String) {
      q.h(var3, "messageId");
      q.h(var4, "type");
      this.emitReactEvent.invoke(new TapPollAction(ChannelId.toString-impl(var1), MessageId.toString-impl(var3), var4));
   }

   public override fun onTapPollAnswer(channelId: ChannelId, messageId: MessageId, answerId: String) {
      q.h(var3, "messageId");
      q.h(var4, "answerId");
      this.emitReactEvent.invoke(new TapPollAnswer(ChannelId.toString-impl(var1), MessageId.toString-impl(var3), var4));
   }

   public override fun onTapPollSubmitVote(channelId: ChannelId, messageId: MessageId) {
      q.h(var3, "messageId");
      this.emitReactEvent.invoke(new TapPollSubmitVote(ChannelId.toString-impl(var1), MessageId.toString-impl(var3)));
   }

   public override fun onTapPostPreviewEmbed(guildId: GuildId, parentChannelId: ChannelId, threadId: ChannelId, messageId: MessageId) {
      q.h(var7, "messageId");
      this.emitReactEvent
         .invoke(new TapPostPreviewEmbedData(GuildId.toString-impl(var1), ChannelId.toString-impl(var3), ChannelId.toString-impl(var5), var7, null));
   }

   public override fun onTapReaction(messageId: MessageId, reaction: Reaction?, isBurst: Boolean?) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapReactionData(var1, var2, var3, null));
   }

   public override fun onTapReactionOverflow(messageId: MessageId, channelId: ChannelId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapReactionOverflow(MessageId.toString-impl(var1), ChannelId.toString-impl(var2)));
   }

   public override fun onTapRemix(messageId: MessageId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapRemixData(var1, null));
   }

   public override fun onTapRoleIcon(roleName: String, roleIconSource: String) {
      q.h(var1, "roleName");
      q.h(var2, "roleIconSource");
      this.emitReactEvent.invoke(new TapRoleIconData(var1, var2));
   }

   public override fun onTapSafetyPolicyNoticeEmbed(classificationId: String) {
      q.h(var1, "classificationId");
      this.emitReactEvent.invoke(new TapSafetyPolicyNoticeEmbed(var1));
   }

   public override fun onTapSafetySystemNotificationCta(ctaType: String, ctaKey: String) {
      q.h(var1, "ctaType");
      q.h(var2, "ctaKey");
      this.emitReactEvent.invoke(new TapSafetySystemNotificationCta(var1, var2));
   }

   public override fun onTapSeeMore(messageId: MessageId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapSeeMoreData(var1, null));
   }

   public override fun onTapSelectActionComponent(messageId: MessageId, componentId: String) {
      q.h(var1, "messageId");
      q.h(var2, "componentId");
      this.emitReactEvent.invoke(new TapSelectActionComponent(var1, var2, null));
   }

   public override fun onTapShareForumPost(channelId: ChannelId, guildId: GuildId) {
      this.emitReactEvent.invoke(new TapShareForumPost(ChannelId.toString-impl(var1), GuildId.toString-impl(var3)));
   }

   public override fun onTapShowAltText(description: String) {
      q.h(var1, "description");
      this.emitReactEvent.invoke(new TapShowAltTextData(var1));
   }

   public override fun onTapSummary(channelId: ChannelId, messageId: MessageId, summaryId: String) {
      q.h(var3, "messageId");
      q.h(var4, "summaryId");
      this.emitReactEvent.invoke(new TapSummaryData(ChannelId.toString-impl(var1), MessageId.toString-impl(var3), var4));
   }

   public override fun onTapSummaryJump(channelId: ChannelId, messageId: MessageId, summaryId: String) {
      q.h(var3, "messageId");
      q.h(var4, "summaryId");
      this.emitReactEvent.invoke(new TapSummaryJumpData(ChannelId.toString-impl(var1), MessageId.toString-impl(var3), var4));
   }

   public override fun onTapSuppressNotificationsIcon() {
      this.emitReactEvent.invoke(TapSuppressNotificationsIconData.INSTANCE);
   }

   public override fun onTapTag(messageId: MessageId, channelId: ChannelId, tagType: String?) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapTagData(var1, var2, var4, null));
   }

   public override fun onTapThreadEmbed(messageId: MessageId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapThreadEmbedEvent(var1));
   }

   public override fun onTapTimestamp(timestamp: String) {
      q.h(var1, "timestamp");
      this.emitReactEvent.invoke(new TapTimestampEvent(var1));
   }

   public override fun onTapToggleBlockedMessages(messageId: MessageId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapSeparatorData("toggle", MessageId.toString-impl(var1)));
   }

   public override fun onTapUploadProgressClose(fileId: String) {
      q.h(var1, "fileId");
      this.emitReactEvent.invoke(new TapUploadProgressCloseData(var1));
   }

   public override fun onTapUsername(messageId: MessageId, userId: UserId) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new TapUsernameData(MessageId.toString-impl(var1), UserId.toString-impl(var2)));
   }

   public override fun onWelcomeReplyClicked(sticker: Sticker, messageId: MessageId) {
      q.h(var1, "sticker");
      q.h(var2, "messageId");
      this.emitReactEvent.invoke(new TapWelcomeReplyData(var1.getId(), var2, null));
   }

   public override fun voiceMessagePlaybackFailed(messageId: MessageId, errorMessage: String?) {
      q.h(var1, "messageId");
      this.emitReactEvent.invoke(new VoiceMessagePlaybackFailedData(var1, var2, null));
   }
}
