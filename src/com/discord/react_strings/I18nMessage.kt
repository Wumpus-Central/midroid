package com.discord.react_strings

import android.content.Context
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q
import rh.a

public enum class I18nMessage {
   A11Y_ROLE_BUTTON,
   AUDIO_FILE_A11Y_LABEL,
   AUDIO_FILE_NOT_PLAYING_VALUE,
   AUDIO_FILE_PLAYING_VALUE,
   CANCEL,
   DECLINE,
   DISMISS,
   DOWNLOAD,
   FORUM_CHANNEL_THREAD_CREATED_PUSH_BODY_MOBILE,
   FORUM_CHANNEL_THREAD_CREATED_PUSH_TITLE_MOBILE,
   FORUM_REACTIONS_OVERFLOW,
   GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_BODY,
   GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_TITLE,
   GUILD_SCHEDULED_EVENT_EXTERNAL_START_BODY,
   GUILD_SCHEDULED_EVENT_STAGE_START_BODY,
   GUILD_SCHEDULED_EVENT_STAGE_START_TITLE,
   HIGHLIGHT,
   INCOMING_CALL,
   JOIN_CALL,
   MARK_AS_READ,
   ME,
   MEDIA_MOSAIC_ALT_TEXT_CTA,
   MEDIA_MOSAIC_ALT_TEXT_POPOUT_TITLE,
   MESSAGE_FORWARDED,
   MESSAGE_FORWARDED_NOTIFICATION_BODY,
   MOBILE_REPLYING_TO,
   MOBILE_REPLYING_TO_A11Y_LABEL,
   MOBILE_REPLY_PREVIEW_A11Y_LABEL,
   MOBILE_SCROLL_TO_MESSAGE_ACTION_A11Y_LABEL,
   NOTIFICATION_ACCEPTED_FRIEND_REQUEST,
   NOTIFICATION_BODY_START_GAME,
   NOTIFICATION_FRIEND_SUGGESTION_BODY,
   NOTIFICATION_FRIEND_SUGGESTION_CONTACT_TITLE,
   NOTIFICATION_FRIEND_SUGGESTION_TITLE,
   NOTIFICATION_MESSAGE_ACTIVITY_INSTANCE,
   NOTIFICATION_MESSAGE_CREATE_DM_ACTIVITY_JOIN,
   NOTIFICATION_MESSAGE_CREATE_GUILD_ACTIVITY_JOIN,
   NOTIFICATION_MUTE_1_HOUR,
   NOTIFICATION_PENDING_FRIEND_REQUEST,
   NOTIFICATION_REPLY,
   NOTIFICATION_TITLE_START_GAME,
   OBSCURED_CONTENT_HIDE_CONTENT_ALT,
   OBSCURED_CONTENT_INFO_LINK_TEXT,
   OBSCURED_CONTENT_SHOW_CONTENT_ALT,
   OVERLAY_FRIEND_CALLING,
   PAUSE,
   PLAY,
   PLAY_FULL_VIDEO,
   POLL_ANSWER_VOTED_ARIA,
   POLL_OPTIONS_ARIA,
   POLL_RESULTS_NOTIFICATION,
   POLL_SENT_NOTIFICATION,
   REMIXING_TITLE,
   REPLY_QUOTE_NO_TEXT_CONTENT_MOBILE,
   REPLY_QUOTE_STICKER_MOBILE,
   REPLY_QUOTE_VOICE_MESSAGE_MOBILE,
   ROLE_SUBSCRIPTION_WELCOME_LABEL,
   SEND_MESSAGE,
   SOUND_MUTE,
   SOUND_UNMUTE,
   SPOILER_HIDDEN_A11Y_LABEL,
   STAGE_START_PUSH_NOTIFICATION_BODY,
   STAGE_START_PUSH_NOTIFICATION_TITLE,
   STICKER_NOTIFICATION_BODY,
   SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_001,
   SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_002,
   SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_003,
   SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_004,
   SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_005,
   SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_006,
   SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_007,
   SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_008,
   SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_009,
   SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_010,
   SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_011,
   SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_012,
   SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_013,
   UPLOAD_COMPLETE,
   VOICE_MESSAGES_A11Y_LABEL,
   VOICE_MESSAGES_A11Y_STATUS,
   VOICE_MESSAGES_PLAYING_A11Y_STATUS,
   VOICE_MESSAGES_SENT_NOTIFICATION   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private I18nMessage[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<I18nMessage> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   internal fun format(context: Context): String {
      q.h(var1, "context");
      return I18nCache.INSTANCE.get(var1, this);
   }
}
