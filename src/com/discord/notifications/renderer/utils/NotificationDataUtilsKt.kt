package com.discord.notifications.renderer.utils

import A9.q
import X1.a
import X1.b
import X1.c
import X1.d
import X1.e
import X1.g
import X1.h
import X1.i
import X1.j
import X1.k
import X1.l
import X1.m
import X1.n
import X1.o
import X1.t
import X1.u
import android.app.PendingIntent
import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import androidx.core.app.NotificationCompat
import androidx.core.app.Person
import androidx.core.app.NotificationCompat.Action
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.graphics.drawable.IconCompat
import com.discord.crash_reporting.CrashReporting
import com.discord.icons.IconUrlUtils
import com.discord.misc.utilities.intent.PendingIntentUtils
import com.discord.notifications.actions.intents.ContentAction
import com.discord.notifications.actions.intents.DeleteAction
import com.discord.notifications.actions.intents.DirectReplyAction
import com.discord.notifications.actions.intents.DismissCallAction
import com.discord.notifications.actions.intents.MarkAsReadAction
import com.discord.notifications.actions.intents.MuteAction
import com.discord.notifications.actions.intents.NotificationAction
import com.discord.notifications.api.Embed
import com.discord.notifications.api.EmbedField
import com.discord.notifications.api.KvMessageEntry
import com.discord.notifications.api.NotificationData
import com.discord.notifications.api.NotificationMessage
import com.discord.notifications.api.Poll
import com.discord.notifications.api.PollMedia
import com.discord.notifications.api.Sticker
import com.discord.notifications.renderer.R
import com.discord.primitives.ApplicationId
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageFlag
import com.discord.primitives.MessageFlagKt
import com.discord.primitives.MessageId
import com.discord.primitives.MessageIdSnowflake
import com.discord.primitives.UserId
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.react_strings.RenderContext
import com.discord.shortcuts.ShortcutData
import com.discord.shortcuts.ShortcutUtilsKt
import com.discord.snowflake.SnowflakeUtilsKt
import com.discord.theme.utils.ColorUtilsKt
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Date
import java.util.Locale
import kotlin.jvm.internal.r
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import wb.f
import wb.p
import z9.s

@JvmSynthetic
fun a(var0: java.lang.String, var1: RenderContext): Unit {
   return getMissedCallText$lambda$31(var0, var1);
}

@JvmSynthetic
fun b(var0: Sticker, var1: RenderContext): Unit {
   return renderMessageContent$lambda$5(var0, var1);
}

@JvmSynthetic
fun c(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$17(var0, var1);
}

@JvmSynthetic
fun d(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$15(var0, var1);
}

@JvmSynthetic
fun e(var0: NotificationData, var1: RenderContext): Unit {
   return getTitle$lambda$3(var0, var1);
}

@JvmSynthetic
fun f(var0: Embed, var1: RenderContext): Unit {
   return renderMessageContent$lambda$9(var0, var1);
}

@JvmSynthetic
fun g(var0: NotificationData, var1: RenderContext): Unit {
   return getTitle$lambda$0(var0, var1);
}

public fun NotificationData.getAuthor(): JsonObject {
   r.h(var0, "<this>");
   val var3: java.lang.String = var0.getUserAvatar();
   val var4: UserId = var0.getUserId-wUX8bhU();
   r.e(var4);
   val var1: Long = var4.unbox-impl();
   val var6: java.lang.String = var0.getUserUsername();
   r.e(var6);
   val var5: p = new p();
   if (var3 != null) {
      f.c(var5, "avatar", var3);
   }

   f.c(var5, "id", UserId.toString-impl(var1));
   f.c(var5, "username", var6);
   f.c(var5, "globalName", var0.getUserGlobalName());
   f.a(var5, "incomplete", java.lang.Boolean.TRUE);
   return var5.a();
}

public fun NotificationData.getBotDMMuteAction(context: Context): Action? {
   r.h(var0, "<this>");
   r.h(var1, "context");
   if (r.c(var0.getType(), "MESSAGE_CREATE") && var0.getAppDm()) {
      val var4: ChannelId = var0.getChannelId-qMVnFVQ();
      if (var4 != null) {
         return new NotificationCompat.Action.a(
               R.drawable.ic_notifications_off_24dp,
               I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_MUTE_APP_DM, new m(var0)),
               NotificationAction.DefaultImpls.toPendingIntent$default(
                  new MuteAction(getTag(var0), var0.getGuildId-qOKuAAo(), var4.unbox-impl(), -1, null), var1, 0, false, 6, null
               )
            )
            .c();
      }
   }

   return null;
}

fun `getBotDMMuteAction$lambda$26`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("app", var0.getUserUsername());
   return Unit.a;
}

internal fun NotificationData.getButtonPendingIntent(context: Context, notificationDataMap: Map<String, String>): PendingIntent {
   r.h(var0, "<this>");
   r.h(var1, "context");
   r.h(var2, "notificationDataMap");
   val var3: java.lang.String = getTag(var0);
   val var4: StringBuilder = new StringBuilder();
   var4.append(var3);
   var4.append("button");
   return getPendingIntent(var1, var2, var4.toString());
}

public fun NotificationData.getCallAction(context: Context, isAcceptAction: Boolean, notificationDataMap: Map<String, String>): Action? {
   r.h(var0, "<this>");
   r.h(var1, "context");
   r.h(var3, "notificationDataMap");
   if (!r.c(var0.getType(), "CALL_RING")) {
      return null;
   } else {
      val var10: ChannelId = var0.getChannelId-qMVnFVQ();
      if (var10 != null) {
         val var6: Long = var10.unbox-impl();
         val var19: UserId = var0.getUserId-wUX8bhU();
         if (var19 != null) {
            val var8: Long = var19.unbox-impl();
            val var12: PendingIntent;
            if (var2) {
               var3 = q.x(var3);
               var3.put("type", "CALL_CONNECT");
               var12 = getPendingIntent(var1, var3, getTag(var0));
            } else {
               var12 = NotificationAction.DefaultImpls.toPendingIntent$default(
                  new DismissCallAction(getTag(var0), var6, false, var0.getGuildId-qOKuAAo(), var8, null), var1, 0, false, 6, null
               );
            }

            val var13: Pair;
            if (var2) {
               var13 = s.a(
                  I18nUtilsKt.i18nFormat$default(var1, I18nMessage.JOIN_CALL, null, 2, null),
                  ColorUtilsKt.getColorCompat(var1, com.discord.theme.R.color.green_360)
               );
            } else {
               var13 = s.a(
                  I18nUtilsKt.i18nFormat$default(var1, I18nMessage.DECLINE, null, 2, null),
                  ColorUtilsKt.getColorCompat(var1, com.discord.theme.R.color.red_400)
               );
            }

            val var16: java.lang.CharSequence = var13.a() as java.lang.CharSequence;
            var var5: Int = (var13.b() as java.lang.Number).intValue();
            val var11: SpannableStringBuilder = new SpannableStringBuilder();
            val var20: StyleSpan = new StyleSpan(1);
            var var4: Int = var11.length();
            val var14: ForegroundColorSpan = new ForegroundColorSpan(var5);
            var5 = var11.length();
            var11.append(var16);
            var11.setSpan(var14, var5, var11.length(), 17);
            var11.setSpan(var20, var4, var11.length(), 17);
            if (var2) {
               var4 = R.drawable.ic_call_24dp;
            } else {
               var4 = R.drawable.ic_call_disconnect_24dp;
            }

            return new NotificationCompat.Action.a(var4, var11, var12).c();
         }
      }

      return null;
   }
}

public fun NotificationData.getContent(context: Context, forLogs: Boolean): CharSequence? {
   r.h(var0, "<this>");
   r.h(var1, "context");
   val var5: java.lang.String = var0.getType();
   val var3: Int = var5.hashCode();
   var var4: Any = "";
   switch (var3) {
      case -1502317553:
         if (var5.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
            val var7: java.lang.String = var0.getSubtitle();
            if (var7 != null) {
               var4 = var7;
            }
         }
         break;
      case -1489275252:
         if (var5.equals("GUILD_SCHEDULED_EVENT_UPDATE")) {
            val var13: Int = var0.getGuildScheduledEventEntityType();
            if ((var13 == null || var13 != 2) && (var13 == null || var13 != 1)) {
               if (var13 != null && var13 == 3) {
                  var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.GUILD_SCHEDULED_EVENT_EXTERNAL_START_BODY, new k(var0));
               }
            } else {
               var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.GUILD_SCHEDULED_EVENT_STAGE_START_BODY, new j(var0));
            }
         }
         break;
      case -1327124998:
         if (var5.equals("RELATIONSHIP_ADD")) {
            val var6: Int = var0.getRelationshipType();
            if (var6 != null && var6 == 1) {
               var4 = I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_ACCEPTED_FRIEND_REQUEST, null, 2, null);
            } else if (var6 != null && var6 == 3) {
               var4 = I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_PENDING_FRIEND_REQUEST, null, 2, null);
            }
         }
         break;
      case -1263316859:
         if (var5.equals("STAGE_INSTANCE_CREATE")) {
            var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.STAGE_START_PUSH_NOTIFICATION_BODY, new h(var0));
         }
         break;
      case -1237752112:
         if (var5.equals("APPLICATION_LIBRARY_INSTALL_COMPLETE")) {
            var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_BODY, new g(var0));
         }
         break;
      case -437641071:
         if (var5.equals("FORUM_THREAD_CREATED")) {
            var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.FORUM_CHANNEL_THREAD_CREATED_PUSH_BODY_MOBILE, new i(var0));
         }
         break;
      case -45642698:
         if (var5.equals("FRIEND_SUGGESTION_CREATE")) {
            var4 = I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_FRIEND_SUGGESTION_BODY, null, 2, null);
         }
         break;
      case 974015250:
         if (var5.equals("ACTIVITY_START")) {
            val var12: Int = var0.getActivityType();
            if (var12 != null && var12 == 0) {
               var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_BODY_START_GAME, new e(var0));
            }
         }
         break;
      case 998188116:
         if (var5.equals("MESSAGE_CREATE")) {
            val var11: Int = var0.getChannelType();
            if ((var11 == null || var11 != 0)
               && (var11 == null || var11 != 2)
               && (var11 == null || var11 != 5)
               && (var11 == null || var11 != 10)
               && (var11 == null || var11 != 11)
               && (var11 == null || var11 != 12)) {
               if (var11 != null && var11 == 3 || var11 != null && var11 == 1) {
                  val var10: Int = var0.getMessageActivityType();
                  if (var10 != null && var10 == 1) {
                     var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_MESSAGE_CREATE_DM_ACTIVITY_JOIN, new d(var0));
                  } else {
                     var4 = renderMessageContent(var0, var1, var2);
                  }
               }
            } else {
               var var8: Int = var0.getMessageType();
               if (var8 != null && var8 == 7) {
                  var4 = getSystemMessageUserJoin-_NT-lnE(var1, var0.getUserId-wUX8bhU(), var0.getUserUsername());
               } else {
                  var8 = var0.getMessageActivityType();
                  if (var8 != null && var8 == 1) {
                     var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_MESSAGE_CREATE_GUILD_ACTIVITY_JOIN, new c(var0));
                  } else {
                     var4 = renderMessageContent(var0, var1, var2);
                  }
               }
            }
         }
         break;
      case 1770025841:
         if (var5.equals("CALL_RING")) {
            var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.OVERLAY_FRIEND_CALLING, new X1.f(var0));
         }
      default:
   }

   return (java.lang.CharSequence)var4;
}

fun `getContent$lambda$10`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("user", var0.getUserUsername());
   var1.getArgs().put("game", var0.getMessageApplicationName());
   return Unit.a;
}

fun `getContent$lambda$11`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("user", var0.getUserUsername());
   var1.getArgs().put("game", var0.getMessageApplicationName());
   return Unit.a;
}

fun `getContent$lambda$12`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("username", var0.getUserUsername());
   var1.getArgs().put("gameName", var0.getActivityName());
   return Unit.a;
}

fun `getContent$lambda$13`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("name", var0.getUserUsername());
   return Unit.a;
}

fun `getContent$lambda$14`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("name", var0.getApplicationName());
   return Unit.a;
}

fun `getContent$lambda$15`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("username", var0.getUserUsername());
   var1.getArgs().put("topic", var0.getStageInstanceTopic());
   return Unit.a;
}

fun `getContent$lambda$16`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("channelName", var0.getChannelName());
   var1.getArgs().put("userUsername", var0.getUserUsername());
   return Unit.a;
}

fun `getContent$lambda$17`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("topic", var0.getStageInstanceTopic());
   var1.getArgs().put("username", var0.getUserUsername());
   return Unit.a;
}

fun `getContent$lambda$18`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("topic", var0.getStageInstanceTopic());
   return Unit.a;
}

internal fun NotificationData.getContentPendingIntent(context: Context, notificationDataMap: Map<String, String>): PendingIntent {
   r.h(var0, "<this>");
   r.h(var1, "context");
   r.h(var2, "notificationDataMap");
   val var3: java.lang.String = getTag(var0);
   val var4: StringBuilder = new StringBuilder();
   var4.append(var3);
   var4.append("content");
   return getPendingIntent(var1, var2, var4.toString());
}

internal fun NotificationData.getConversationTitle(): CharSequence? {
   r.h(var0, "<this>");
   val var1: Boolean = r.c(var0.getType(), "MESSAGE_CREATE");
   var var2: java.lang.String = null;
   if (var1) {
      val var4: Int = var0.getChannelType();
      if ((var4 == null || var4 != 0)
         && (var4 == null || var4 != 2)
         && (var4 == null || var4 != 5)
         && (var4 == null || var4 != 10)
         && (var4 == null || var4 != 11)
         && (var4 == null || var4 != 12)) {
         if (var4 == null) {
            var2 = null;
         } else {
            var2 = null;
            if (var4 == 3) {
               val var8: java.lang.String = var0.getChannelName();
               var2 = var8;
               if (var8 == null) {
                  var2 = var0.getUserUsername();
               }
            }
         }
      } else {
         var2 = var0.getGuildName();
         val var5: java.lang.String = var0.getChannelName();
         val var7: StringBuilder = new StringBuilder();
         var7.append(var2);
         var7.append(" #");
         var7.append(var5);
         var2 = var7.toString();
      }
   }

   return var2;
}

internal fun NotificationData.getDeletePendingIntent(context: Context): PendingIntent {
   r.h(var0, "<this>");
   r.h(var1, "context");
   return NotificationAction.DefaultImpls.toPendingIntent$default(new DeleteAction(getTag(var0)), var1, 0, false, 6, null);
}

internal fun NotificationData.getDirectReplyAction(context: Context): Action? {
   r.h(var0, "<this>");
   r.h(var1, "context");
   if (r.c(var0.getType(), "MESSAGE_CREATE") && var0.getCanReply() && !var0.getAppDm()) {
      val var4: ChannelId = var0.getChannelId-qMVnFVQ();
      if (var4 != null) {
         return new NotificationCompat.Action.a(
               R.drawable.ic_send_white_24dp,
               I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_REPLY, null, 2, null),
               NotificationAction.DefaultImpls.toPendingIntent$default(
                  new DirectReplyAction(getTag(var0), var4.unbox-impl(), var0.getChannelName(), var0.getChannelType(), var0.getGuildName(), null),
                  var1,
                  PendingIntentUtils.mutablePendingIntentFlag$default(PendingIntentUtils.INSTANCE, 0, 1, null),
                  false,
                  4,
                  null
               )
            )
            .b(DirectReplyAction.Companion.toRemoteInput(I18nUtilsKt.i18nFormat$default(var1, I18nMessage.SEND_MESSAGE, null, 2, null).toString()))
            .f(true)
            .i(1)
            .j(false)
            .c();
      }
   }

   return null;
}

internal fun NotificationData.getGroupKey(): String {
   r.h(var0, "<this>");
   val var2: java.lang.String = var0.getType();
   val var1: StringBuilder = new StringBuilder();
   var1.append("GROUP_");
   var1.append(var2);
   return var1.toString();
}

internal fun NotificationData.getIconUrl(context: Context): String {
   r.h(var0, "<this>");
   r.h(var1, "context");
   val var5: java.lang.String = var0.getType();
   switch (var5.hashCode()) {
      case -1502317553:
         val var14: java.lang.String;
         if (!var5.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
            var14 = "";
         } else {
            var14 = var0.getIconUrl();
            if (var14 == null) {
               return "";
            }
         }

         return var14;
      case -1489275252:
         if (!var5.equals("GUILD_SCHEDULED_EVENT_UPDATE")) {
            return "";
         }

         return IconUrlUtils.getForGuild-14CJxO4$default(IconUrlUtils.INSTANCE, var0.getGuildId-qOKuAAo(), var0.getGuildIcon(), "", false, null, 24, null);
      case -1327124998:
         if (!var5.equals("RELATIONSHIP_ADD")) {
            return "";
         }

         return IconUrlUtils.getApplicationIcon-weIltyw$default(IconUrlUtils.INSTANCE, var0.getApplicationId-UtIrSio(), var0.getApplicationIcon(), 0, 4, null);
      case -1263316859:
         if (!var5.equals("STAGE_INSTANCE_CREATE")) {
            return "";
         }

         return IconUrlUtils.getForGuild-14CJxO4$default(IconUrlUtils.INSTANCE, var0.getGuildId-qOKuAAo(), var0.getGuildIcon(), "", false, null, 24, null);
      case -1237752112:
         if (!var5.equals("APPLICATION_LIBRARY_INSTALL_COMPLETE")) {
            return "";
         }

         return IconUrlUtils.getApplicationIcon-weIltyw$default(IconUrlUtils.INSTANCE, var0.getApplicationId-UtIrSio(), var0.getApplicationIcon(), 0, 4, null);
      case -437641071:
         if (!var5.equals("FORUM_THREAD_CREATED")) {
            return "";
         }

         return IconUrlUtils.getForGuild-14CJxO4$default(IconUrlUtils.INSTANCE, var0.getGuildId-qOKuAAo(), var0.getGuildIcon(), "", false, null, 24, null);
      case -45642698:
         val var7: java.lang.String;
         if (!var5.equals("FRIEND_SUGGESTION_CREATE")) {
            var7 = "";
         } else {
            var7 = IconUrlUtils.getForUser-_fRzTXg$default(
               IconUrlUtils.INSTANCE, var1, var0.getUserId-wUX8bhU(), var0.getUserAvatar(), null, false, null, 40, null
            );
         }

         return var7;
      case 974015250:
         if (!var5.equals("ACTIVITY_START")) {
            return "";
         }

         return IconUrlUtils.getApplicationIcon-weIltyw$default(IconUrlUtils.INSTANCE, var0.getApplicationId-UtIrSio(), var0.getApplicationIcon(), 0, 4, null);
      case 998188116:
         if (!var5.equals("MESSAGE_CREATE")) {
            return "";
         }
         break;
      case 1770025841:
         if (!var5.equals("CALL_RING")) {
            return "";
         }
         break;
      default:
         return "";
   }

   val var9: Int = var0.getChannelType();
   var var3: Boolean = true;
   if (var9 != null && var9 == 1) {
      return IconUrlUtils.getForUser-_fRzTXg$default(
         IconUrlUtils.INSTANCE, var1, var0.getUserId-wUX8bhU(), var0.getUserAvatar(), var0.getUserDiscriminator(), false, null, 32, null
      );
   } else if ((var9 == null || var9 != 0)
      && (var9 == null || var9 != 2)
      && (var9 == null || var9 != 5)
      && (var9 == null || var9 != 10)
      && (var9 == null || var9 != 11)
      && (var9 == null || var9 != 12)) {
      val var11: IconUrlUtils = IconUrlUtils.INSTANCE;
      val var10: ChannelId = var0.getChannelId-qMVnFVQ();
      val var6: java.lang.String = var0.getChannelIcon();
      val var8: Int = var0.getChannelType();
      if (var8 == null || var8 != 3) {
         var3 = false;
      }

      return IconUrlUtils.getForChannel-JYSGpIY$default(var11, var1, var10, var6, var3, null, 16, null);
   } else {
      return IconUrlUtils.getForGuild-14CJxO4$default(IconUrlUtils.INSTANCE, var0.getGuildId-qOKuAAo(), var0.getGuildIcon(), "", false, null, 24, null);
   }
}

internal fun NotificationData.getIconUrlForAvatar(context: Context): String {
   r.h(var0, "<this>");
   r.h(var1, "context");
   val var4: IconUrlUtils = IconUrlUtils.INSTANCE;
   val var3: java.lang.String = IconUrlUtils.getForGuildMember-2tNb6hE$default(
      IconUrlUtils.INSTANCE, var0.getUserGuildAvatar(), var0.getGuildId-qOKuAAo(), var0.getUserId-wUX8bhU(), null, false, 24, null
   );
   var var2: java.lang.String = var3;
   if (var3.length() == 0) {
      var2 = IconUrlUtils.getForUser-_fRzTXg$default(
         var4, var1, var0.getUserId-wUX8bhU(), var0.getUserAvatar(), var0.getUserDiscriminator(), false, null, 32, null
      );
   }

   return var2;
}

public fun NotificationData.getKvMessage(rawMessage: String?): KvMessageEntry? {
   r.h(var0, "<this>");
   val var2: java.lang.String = var0.getMessageId-N_6c4I0();
   val var3: ChannelId = var0.getChannelId-qMVnFVQ();
   if (var2 != null && var3 != null && r.c(var0.getType(), "MESSAGE_CREATE")) {
      val var4: NotificationMessage = var0.getMessage();
      if (var1 != null && var4 != null) {
         val var11: JsonElement = Json.d.g(var1);
         val var9: java.util.List = kotlin.collections.i.k();
         val var5: JsonObject = var4.getAuthor();
         r.e(var5);
         val var13: java.util.List = kotlin.collections.i.B0(kotlin.collections.i.e(var5), var4.getMentions());
         val var12: ArrayList = new ArrayList(kotlin.collections.i.v(var13, 10));
         val var14: java.util.Iterator = var13.iterator();

         while (var14.hasNext()) {
            val var6: java.util.Map = q.x(var14.next() as JsonObject);
            var6.put("incomplete", wb.g.b(java.lang.Boolean.TRUE));
            var12.add(new JsonObject(var6));
         }

         return new KvMessageEntry(var9, var12, wb.g.o(var11), var2, var3.unbox-impl(), null);
      }

      try {
         val var10: JsonObject = getAuthor(var0);
         return new KvMessageEntry(kotlin.collections.i.k(), kotlin.collections.i.e(var10), toNotificationMessage(var0, var10), var2, var3.unbox-impl(), null);
      } catch (var7: Exception) {
         CrashReporting.captureException$default(CrashReporting.INSTANCE, var7, false, 2, null);
      }
   }

   return null;
}

internal fun NotificationData.getMarkAsReadAction(context: Context): Action? {
   r.h(var0, "<this>");
   r.h(var1, "context");
   if (!r.c(var0.getType(), "MESSAGE_CREATE")) {
      return null;
   } else {
      val var4: ChannelId = var0.getChannelId-qMVnFVQ();
      label13:
      if (var4 != null) {
         val var2: Long = var4.unbox-impl();
         val var6: java.lang.String = var0.getMessageId-N_6c4I0();
         return if (var6 == null)
            null
            else
            new NotificationCompat.Action.a(
                  R.drawable.ic_check_grey_24dp,
                  I18nUtilsKt.i18nFormat$default(var1, I18nMessage.MARK_AS_READ, null, 2, null),
                  NotificationAction.DefaultImpls.toPendingIntent$default(new MarkAsReadAction(getTag(var0), var2, var6, null), var1, 0, false, 6, null)
               )
               .i(2)
               .j(false)
               .c();
      } else {
         return null;
      }
   }
}

public fun getMissedCallText(context: Context, username: String, isDM: Boolean): String {
   r.h(var0, "context");
   r.h(var1, "username");
   return if (var2)
      I18nUtilsKt.i18nFormat$default(var0, I18nMessage.MISSED_CALL_NOTIFICATION, null, 2, null).toString()
      else
      I18nUtilsKt.i18nFormat(var0, I18nMessage.MISSED_CALL_NOTIFICATION_FROM, new X1.r(var1)).toString();
}

fun `getMissedCallText$lambda$31`(var0: java.lang.String, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("name", var0);
   return Unit.a;
}

internal fun NotificationData.getNotificationCategory(): String {
   r.h(var0, "<this>");
   val var1: java.lang.String = var0.getType();
   switch (var1.hashCode()) {
      case -1502317553:
         if (!var1.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
            return "msg";
         }
         break;
      case -1489275252:
         if (!var1.equals("GUILD_SCHEDULED_EVENT_UPDATE")) {
            return "msg";
         }
         break;
      case -1327124998:
         if (!var1.equals("RELATIONSHIP_ADD")) {
            return "msg";
         }
         break;
      case -1263316859:
         if (!var1.equals("STAGE_INSTANCE_CREATE")) {
            return "msg";
         }
         break;
      case -1237752112:
         if (var1.equals("APPLICATION_LIBRARY_INSTALL_COMPLETE")) {
            return "progress";
         }

         return "msg";
      case -437641071:
         if (!var1.equals("FORUM_THREAD_CREATED")) {
            return "msg";
         }
         break;
      case 974015250:
         if (!var1.equals("ACTIVITY_START")) {
            return "msg";
         }
         break;
      case 1471047007:
         if (var1.equals("LOCAL_NOTIFICATION")) {
            return "status";
         }

         return "msg";
      case 1770025841:
         if (var1.equals("CALL_RING")) {
            return "call";
         }

         return "msg";
      default:
         return "msg";
   }

   return "social";
}

private fun getPendingIntent(context: Context, notificationDataMap: Map<String, String>, tag: String): PendingIntent {
   return NotificationAction.DefaultImpls.toPendingIntent$default(new ContentAction(var2, var1), var0, 0, true, 2, null);
}

internal fun NotificationData.getSendTime(): Long {
   r.h(var0, "<this>");
   val var3: java.lang.String = var0.getMessageId-N_6c4I0();
   if (var3 != null) {
      val var4: MessageIdSnowflake = MessageId.toSnowflake-wDbSO-A(var3);
      if (var4 != null) {
         return SnowflakeUtilsKt.toTimestamp(var4);
      }
   }

   return System.currentTimeMillis();
}

internal fun NotificationData.getSender(icon: Bitmap?): Person {
   r.h(var0, "<this>");
   val var6: Person.c = new Person.c();
   val var5: java.lang.String = var0.getUserUsername();
   var var4: java.lang.String = var5;
   if (var5 == null) {
      var4 = "";
   }

   var var3: Boolean;
   label21: {
      var9 = var6.f(var4).e(java.lang.String.valueOf(var0.getUserId-wUX8bhU()));
      val var7: Int = var0.getRelationshipType();
      if (var7 != null) {
         val var2: Int = var7;
         var3 = true;
         if (var2 == 1) {
            break label21;
         }
      }

      var3 = false;
   }

   val var10: Person.c = var9.d(var3);
   val var8: IconCompat;
   if (var1 != null) {
      var8 = toIconCompat(var1);
   } else {
      var8 = null;
   }

   return var10.c(var8).a();
}

internal fun NotificationData.getSenderForMessageNotification(icon: Bitmap?): Person? {
   r.h(var0, "<this>");
   val var2: Person;
   if (var0.isFromCurrentUser()) {
      var2 = null;
   } else {
      var2 = getSender(var0, var1);
   }

   return var2;
}

internal fun NotificationData.getShortcutInfo(context: Context, notificationDataMap: Map<String, String>, icon: Bitmap?, avatar: Bitmap?): ShortcutInfoCompat {
   r.h(var0, "<this>");
   r.h(var1, "context");
   r.h(var2, "notificationDataMap");
   return ShortcutUtilsKt.createShortcut$default(
      var1,
      java.lang.String.valueOf(var0.getChannelId-qMVnFVQ()),
      getTitle(var0, var1),
      getTitle(var0, var1),
      var3,
      kotlin.collections.i.e(getSender(var0, var4)),
      ShortcutData.Companion.createShortcutIntent(var1, "android.intent.action.VIEW", NotificationAction.Companion.getActivityClass(), getTag(var0), var2),
      0,
      64,
      null
   );
}

internal fun NotificationData.getSmallIcon(): Int {
   r.h(var0, "<this>");
   val var2: java.lang.String = var0.getType();
   switch (var2.hashCode()) {
      case -1327124998:
         if (var2.equals("RELATIONSHIP_ADD")) {
            return R.drawable.ic_notification_friends_24dp;
         }
         break;
      case -45642698:
         if (var2.equals("FRIEND_SUGGESTION_CREATE")) {
            return R.drawable.ic_notification_friends_24dp;
         }
         break;
      case 998188116:
         if (var2.equals("MESSAGE_CREATE")) {
            return R.drawable.ic_notification_message_24dp;
         }
         break;
      case 1770025841:
         if (var2.equals("CALL_RING")) {
            return R.drawable.ic_notification_call_24dp;
         }
      default:
   }

   return R.drawable.ic_notification_24dp;
}

internal fun NotificationData.getSound(context: Context): Uri? {
   r.h(var0, "<this>");
   r.h(var1, "context");
   val var5: Uri;
   if (r.c(var0.getType(), "CALL_RING")) {
      val var4: StringBuilder = new StringBuilder();
      var4.append("android.resource://");
      val var6: java.lang.String = var1.getPackageName();
      val var2: Int = com.discord.sounds.R.raw.call_ringing;
      val var3: StringBuilder = new StringBuilder();
      var3.append(var6);
      var3.append("/");
      var3.append(var2);
      var4.append(var3.toString());
      var5 = Uri.parse(var4.toString());
   } else {
      var5 = null;
   }

   return var5;
}

private fun getSystemMessageUserJoin(context: Context, userId: UserId?, userName: String?): CharSequence {
   val var5: java.util.List = kotlin.collections.i.n(
      new I18nMessage[]{
         I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_001,
         I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_002,
         I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_003,
         I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_004,
         I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_005,
         I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_006,
         I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_007,
         I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_008,
         I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_009,
         I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_010,
         I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_011,
         I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_012,
         I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_013
      }
   );
   val var3: Long;
   if (var1 != null) {
      var3 = var1.unbox-impl();
   } else {
      var3 = 0L;
   }

   return I18nUtilsKt.i18nFormat(var0, var5.get((int)(var3 % (long)var5.size())) as I18nMessage, new X1.q(var2));
}

fun `getSystemMessageUserJoin__NT_lnE$lambda$20$lambda$19`(var0: java.lang.String, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("username", var0);
   return Unit.a;
}

public fun NotificationData.getTag(): String {
   label75: {
      label76: {
         r.h(var0, "<this>");
         var var1: java.lang.String = var0.getType();
         switch (var1.hashCode()) {
            case -1502317553:
               if (var1.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
                  var1 = var0.getType();
                  val var30: java.lang.String = var0.getDeeplink();
                  val var14: StringBuilder = new StringBuilder();
                  var14.append(var1);
                  var14.append(var30);
                  return var14.toString();
               }
               break label75;
            case -1489275252:
               if (!var1.equals("GUILD_SCHEDULED_EVENT_UPDATE")) {
                  break label75;
               }
               break;
            case -1327124998:
               if (var1.equals("RELATIONSHIP_ADD")) {
                  var1 = var0.getType();
                  val var11: UserId = var0.getUserId-wUX8bhU();
                  val var28: StringBuilder = new StringBuilder();
                  var28.append(var1);
                  var28.append(var11);
                  return var28.toString();
               }
               break label75;
            case -1263316859:
               if (!var1.equals("STAGE_INSTANCE_CREATE")) {
                  break label75;
               }
               break;
            case -1237752112:
               if (var1.equals("APPLICATION_LIBRARY_INSTALL_COMPLETE")) {
                  var1 = var0.getType();
                  val var10: ApplicationId = var0.getApplicationId-UtIrSio();
                  val var27: StringBuilder = new StringBuilder();
                  var27.append(var1);
                  var27.append(var10);
                  return var27.toString();
               }
               break label75;
            case -437641071:
               if (!var1.equals("FORUM_THREAD_CREATED")) {
                  break label75;
               }
               break;
            case -45642698:
               if (var1.equals("FRIEND_SUGGESTION_CREATE")) {
                  var1 = var0.getType();
                  val var26: UserId = var0.getUserId-wUX8bhU();
                  val var9: StringBuilder = new StringBuilder();
                  var9.append(var1);
                  var9.append(var26);
                  return var9.toString();
               }
               break label75;
            case 74682093:
               if (!var1.equals("CALL_RING_END")) {
                  break label75;
               }
               break label76;
            case 974015250:
               if (var1.equals("ACTIVITY_START")) {
                  val var24: java.lang.String = var0.getType();
                  val var16: Int = var0.getActivityType();
                  val var31: java.lang.String = var0.getActivityName();
                  val var7: StringBuilder = new StringBuilder();
                  var7.append(var24);
                  var7.append(var16);
                  var7.append(var31);
                  return var7.toString();
               }
               break label75;
            case 998188116:
               if (!var1.equals("MESSAGE_CREATE")) {
                  break label75;
               }
               break;
            case 1471047007:
               if (var1.equals("LOCAL_NOTIFICATION")) {
                  var1 = var0.getType();
                  val var2: ChannelId = var0.getChannelId-qMVnFVQ();
                  val var4: java.lang.String = var0.getMessageId-N_6c4I0();
                  val var5: java.lang.String;
                  if (var4 == null) {
                     var5 = "null";
                  } else {
                     var5 = MessageId.toString-impl(var4);
                  }

                  val var3: StringBuilder = new StringBuilder();
                  var3.append(var1);
                  var3.append(var2);
                  var3.append(var5);
                  return var3.toString();
               }
               break label75;
            case 1770025841:
               if (!var1.equals("CALL_RING")) {
                  break label75;
               }
               break label76;
            default:
               break label75;
         }

         var1 = var0.getType();
         val var12: ChannelId = var0.getChannelId-qMVnFVQ();
         val var29: StringBuilder = new StringBuilder();
         var29.append(var1);
         var29.append(var12);
         return var29.toString();
      }

      val var25: java.lang.String = var0.getType();
      val var17: ChannelId = var0.getChannelId-qMVnFVQ();
      val var8: java.lang.String = var0.getTimeReceived();
      val var32: StringBuilder = new StringBuilder();
      var32.append(var25);
      var32.append(var17);
      var32.append(var8);
      return var32.toString();
   }

   val var22: java.lang.String = var0.getType();
   val var13: StringBuilder = new StringBuilder();
   var13.append("Unknown notification type: ");
   var13.append(var22);
   var13.append(".");
   throw new IllegalArgumentException(var13.toString());
}

public fun NotificationData.getTimedMuteAction(context: Context, numMessages: Int): Action? {
   r.h(var0, "<this>");
   r.h(var1, "context");
   if (r.c(var0.getType(), "MESSAGE_CREATE") && var2 >= 2 && !var0.getAppDm()) {
      val var5: ChannelId = var0.getChannelId-qMVnFVQ();
      if (var5 != null) {
         return new NotificationCompat.Action.a(
               R.drawable.ic_notifications_off_24dp,
               I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_MUTE_1_HOUR, null, 2, null),
               NotificationAction.DefaultImpls.toPendingIntent$default(
                  new MuteAction(getTag(var0), var0.getGuildId-qOKuAAo(), var5.unbox-impl(), null, null), var1, 0, false, 6, null
               )
            )
            .c();
      }
   }

   return null;
}

public fun NotificationData.getTitle(context: Context): CharSequence {
   r.h(var0, "<this>");
   r.h(var1, "context");
   var var3: java.lang.String = var0.getType();
   var var7: java.lang.String;
   switch (var3.hashCode()) {
      case -1502317553:
         if (!var3.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
            return "";
         }

         val var17: java.lang.String = var0.getTitle();
         var7 = var17;
         if (var17 == null) {
            return "";
         }
         break;
      case -1489275252:
         if (!var3.equals("GUILD_SCHEDULED_EVENT_UPDATE")) {
            return "";
         } else {
            val var5: Int = var0.getGuildScheduledEventEntityType();
            if (var5 == null) {
               var3 = "";
            } else {
               var3 = "";
               if (var5 == 1) {
                  return I18nUtilsKt.i18nFormat(var1, I18nMessage.GUILD_SCHEDULED_EVENT_STAGE_START_TITLE, new n(var0));
               }
            }

            return var3;
         }
      case -1327124998:
         if (!var3.equals("RELATIONSHIP_ADD")) {
            return "";
         }

         val var16: java.lang.String = var0.getUserUsername();
         var7 = var16;
         if (var16 == null) {
            return "";
         }
         break;
      case -1263316859:
         val var25: Any;
         if (!var3.equals("STAGE_INSTANCE_CREATE")) {
            var25 = "";
         } else {
            var25 = I18nUtilsKt.i18nFormat(var1, I18nMessage.STAGE_START_PUSH_NOTIFICATION_TITLE, new a(var0));
         }

         return (java.lang.CharSequence)var25;
      case -1237752112:
         val var24: Any;
         if (!var3.equals("APPLICATION_LIBRARY_INSTALL_COMPLETE")) {
            var24 = "";
         } else {
            var24 = I18nUtilsKt.i18nFormat$default(var1, I18nMessage.GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_TITLE, null, 2, null);
         }

         return (java.lang.CharSequence)var24;
      case -437641071:
         val var23: Any;
         if (!var3.equals("FORUM_THREAD_CREATED")) {
            var23 = "";
         } else {
            var23 = I18nUtilsKt.i18nFormat(var1, I18nMessage.FORUM_CHANNEL_THREAD_CREATED_PUSH_TITLE_MOBILE, new l(var0));
         }

         return (java.lang.CharSequence)var23;
      case -45642698:
         if (!var3.equals("FRIEND_SUGGESTION_CREATE")) {
            return "";
         } else {
            val var27: java.lang.CharSequence;
            if (kotlin.text.h.v(var0.getPlatformUserUsername(), var0.getUserUsername(), false, 2, null)) {
               var27 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_FRIEND_SUGGESTION_CONTACT_TITLE, new o(var0));
            } else {
               var27 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_FRIEND_SUGGESTION_TITLE, new X1.p(var0));
            }

            return var27;
         }
      case 974015250:
         if (!var3.equals("ACTIVITY_START")) {
            return "";
         } else {
            val var9: Int = var0.getActivityType();
            if (var9 == null) {
               var3 = "";
            } else {
               var3 = "";
               if (var9 == 0) {
                  return I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_TITLE_START_GAME, null, 2, null);
               }
            }

            return var3;
         }
      case 998188116:
         if (!var3.equals("MESSAGE_CREATE")) {
            return "";
         }

         val var12: Int = var0.getChannelType();
         if ((var12 == null || var12 != 0)
            && (var12 == null || var12 != 2)
            && (var12 == null || var12 != 5)
            && (var12 == null || var12 != 10)
            && (var12 == null || var12 != 11)
            && (var12 == null || var12 != 12)) {
            if (var12 != null && var12 == 1) {
               val var15: java.lang.String = var0.getUserUsername();
               var7 = var15;
               if (var15 == null) {
                  return "";
               }
               break;
            }

            if (var12 == null) {
               return "";
            }

            if (var12 != 3) {
               return "";
            }

            var3 = var0.getChannelName();
            if (var3 != null) {
               return var3;
            }

            val var14: java.lang.String = var0.getUserUsername();
            var7 = var14;
            if (var14 == null) {
               return "";
            }
            break;
         }

         val var13: java.lang.String = var0.getGuildName();
         val var8: java.lang.String = var0.getChannelName();
         val var21: StringBuilder = new StringBuilder();
         var21.append(var13);
         var21.append(" #");
         var21.append(var8);
         return var21.toString();
      case 1770025841:
         if (!var3.equals("CALL_RING")) {
            return "";
         }

         val var19: Int = var0.getChannelType();
         if (var19 != null && var19 == 1) {
            return I18nUtilsKt.i18nFormat$default(var1, I18nMessage.INCOMING_CALL, null, 2, null);
         }

         if (var19 != null && var19 == 3) {
            val var11: java.lang.String = var0.getChannelName();
            var7 = var11;
            if (var11 == null) {
               return "";
            }
            break;
         }

         val var10: java.lang.String = var0.getChannelName();
         var3 = var0.getGuildName();
         val var6: StringBuilder = new StringBuilder();
         var6.append(var10);
         var6.append(", ");
         var6.append(var3);
         return var6.toString();
      default:
         return "";
   }

   return var7;
}

fun `getTitle$lambda$0`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("guildName", var0.getGuildName());
   return Unit.a;
}

fun `getTitle$lambda$1`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("guildName", var0.getGuildName());
   var1.getArgs().put("channelName", var0.getParentName());
   return Unit.a;
}

fun `getTitle$lambda$2`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("guildName", var0.getGuildName());
   return Unit.a;
}

fun `getTitle$lambda$3`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("contact", var0.getPlatformUserUsername());
   return Unit.a;
}

fun `getTitle$lambda$4`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("contact", var0.getPlatformUserUsername());
   return Unit.a;
}

@JvmSynthetic
fun h(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$13(var0, var1);
}

@JvmSynthetic
fun i(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$18(var0, var1);
}

internal fun NotificationData.isCall(): Boolean {
   r.h(var0, "<this>");
   val var3: Int = var0.getChannelType();
   if (var3 != null && var3 == 1) {
      return true;
   } else {
      val var4: Int = var0.getChannelType();
      val var1: Boolean;
      if (var4 != null && var4 == 3) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}

internal fun NotificationData.isCallRinging(): Boolean {
   r.h(var0, "<this>");
   return r.c(var0.getType(), "CALL_RING");
}

internal fun NotificationData.isGroupConversation(): Boolean {
   r.h(var0, "<this>");
   if (r.c(var0.getType(), "MESSAGE_CREATE")) {
      val var2: Int = var0.getChannelType();
      if (var2 == null || var2 != 1) {
         return true;
      }
   }

   return false;
}

@JvmSynthetic
fun j(var0: NotificationData, var1: RenderContext): Unit {
   return getBotDMMuteAction$lambda$26(var0, var1);
}

@JvmSynthetic
fun k(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$11(var0, var1);
}

@JvmSynthetic
fun l(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$12(var0, var1);
}

@JvmSynthetic
fun m(var0: java.lang.String, var1: RenderContext): Unit {
   return getSystemMessageUserJoin__NT_lnE$lambda$20$lambda$19(var0, var1);
}

@JvmSynthetic
fun n(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$10(var0, var1);
}

@JvmSynthetic
fun o(var0: NotificationData, var1: RenderContext): Unit {
   return getTitle$lambda$2(var0, var1);
}

@JvmSynthetic
fun p(var0: NotificationData, var1: RenderContext): Unit {
   return getTitle$lambda$1(var0, var1);
}

@JvmSynthetic
fun q(var0: NotificationData, var1: RenderContext): Unit {
   return renderMessageContent$lambda$7(var0, var1);
}

@JvmSynthetic
fun r(var0: NotificationData, var1: RenderContext): Unit {
   return getTitle$lambda$4(var0, var1);
}

private fun renderLogAwareNotificationMessageContent(forLogs: Boolean, messageContent: String?): CharSequence? {
   if (var1 == null || var1.length() == 0) {
      return var1;
   } else {
      return if (var0) "<Message>" else RenderNotificationMessageContentKt.renderNotificationMessageContent(var1);
   }
}

internal fun NotificationData.renderMessageContent(context: Context, forLogs: Boolean): CharSequence? {
   r.h(var0, "<this>");
   r.h(var1, "context");
   var var3: NotificationMessage = var0.getMessage();
   val var4: Sticker;
   if (var3 != null) {
      var4 = var3.getSticker();
   } else {
      var4 = null;
   }

   var3 = var0.getMessage();
   val var9: Embed;
   if (var3 != null) {
      var9 = var3.getEmbed();
   } else {
      var9 = null;
   }

   val var7: java.lang.CharSequence;
   if (var4 != null) {
      var7 = I18nUtilsKt.i18nFormat(var1, I18nMessage.STICKER_NOTIFICATION_BODY, new X1.s(var4));
   } else {
      val var10: Int = var0.getMessageReferenceType();
      if (var10 != null && var10 == 1) {
         var7 = I18nUtilsKt.i18nFormat$default(var1, I18nMessage.MESSAGE_FORWARDED_NOTIFICATION_BODY, null, 2, null);
      } else if (var0.getActivityInstanceId() == null || var0.getMessageContent() != null && !r.c(var0.getMessageContent(), "")) {
         if (MessageFlagKt.hasMessageFlag(var0.getMessageFlags(), MessageFlag.IS_VOICE_MESSAGE)) {
            var7 = I18nUtilsKt.i18nFormat$default(var1, I18nMessage.VOICE_MESSAGES_SENT_NOTIFICATION, null, 2, null);
         } else {
            val var6: NotificationMessage = var0.getMessage();
            var var11: Poll = null;
            if (var6 != null) {
               var11 = var6.getPoll();
            }

            if (var11 != null) {
               var7 = I18nUtilsKt.i18nFormat(var1, I18nMessage.POLL_SENT_NOTIFICATION, new u(var0));
            } else {
               val var12: Int = var0.getMessageType();
               if (var12 != null && var12 == 46) {
                  var7 = I18nUtilsKt.i18nFormat(var1, I18nMessage.POLL_RESULTS_NOTIFICATION, new b(var9));
               } else {
                  var7 = renderLogAwareNotificationMessageContent(var2, var0.getMessageContent());
               }
            }
         }
      } else {
         var7 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_MESSAGE_ACTIVITY_INSTANCE, new t(var0));
      }
   }

   return var7;
}

fun `renderMessageContent$lambda$5`(var0: Sticker, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("stickerName", var0.getName());
   return Unit.a;
}

fun `renderMessageContent$lambda$6`(var0: NotificationData, var1: RenderContext): Unit {
   r.h(var1, "$this$i18nFormat");
   var1.getArgs().put("user", var0.getUserUsername());
   return Unit.a;
}

fun `renderMessageContent$lambda$7`(var0: NotificationData, var1: RenderContext): Unit {
   var var2: java.util.Map;
   label15: {
      r.h(var1, "$this$i18nFormat");
      var2 = var1.getArgs();
      val var3: NotificationMessage = var0.getMessage();
      if (var3 != null) {
         val var4: Poll = var3.getPoll();
         if (var4 != null) {
            val var5: PollMedia = var4.getQuestion();
            if (var5 != null) {
               val var7: java.lang.String = var5.getText();
               var6 = var7;
               if (var7 != null) {
                  break label15;
               }
            }
         }
      }

      var6 = "???";
   }

   var2.put("question", var6);
   return Unit.a;
}

fun `renderMessageContent$lambda$9`(var0: Embed, var1: RenderContext): Unit {
   var var2: java.util.Map;
   label27: {
      r.h(var1, "$this$i18nFormat");
      var2 = var1.getArgs();
      if (var0 != null) {
         val var3: java.util.List = var0.getFields();
         if (var3 != null) {
            val var7: java.util.Iterator = var3.iterator();

            do {
               if (!var7.hasNext()) {
                  var4 = null;
                  break;
               }

               var4 = var7.next();
            } while (!r.c(((EmbedField)var4).getName(), "poll_question_text"));

            val var5: EmbedField = var4 as EmbedField;
            if (var4 as EmbedField != null) {
               val var8: java.lang.String = var5.getValue();
               var6 = var8;
               if (var8 != null) {
                  break label27;
               }
            }
         }
      }

      var6 = "";
   }

   var2.put("question", var6);
   return Unit.a;
}

@JvmSynthetic
fun s(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$16(var0, var1);
}

internal fun NotificationData.shouldUseBigText(): Boolean {
   r.h(var0, "<this>");
   val var1: Boolean;
   if (r.c(var0.getType(), "GENERIC_PUSH_NOTIFICATION_SENT") && r.c(var0.getExpandSubtitle(), java.lang.Boolean.TRUE)) {
      var1 = true;
   } else {
      var1 = false;
   }

   return var1;
}

internal fun NotificationData.shouldUseMessagingStyle(): Boolean {
   r.h(var0, "<this>");
   val var1: Boolean;
   if (r.c(var0.getType(), "MESSAGE_CREATE") || r.c(var0.getType(), "GENERIC_PUSH_NOTIFICATION_SENT") && var0.getUserAvatar() != null) {
      var1 = true;
   } else {
      var1 = false;
   }

   return var1;
}

@JvmSynthetic
fun t(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$14(var0, var1);
}

private fun Bitmap.toIconCompat(): IconCompat {
   return IconCompat.h(var0);
}

public fun NotificationData.toNotificationMessage(author: JsonObject): JsonObject {
   r.h(var0, "<this>");
   r.h(var1, "author");
   val var6: java.lang.String = var0.getMessageContent();
   r.e(var6);
   val var7: java.lang.Long = var0.getMessageFlags();
   val var2: Long;
   if (var7 != null) {
      var2 = var7;
   } else {
      var2 = 0L;
   }

   val var8: Int = var0.getMessageType();
   r.e(var8);
   var8;
   val var12: java.lang.String = var0.getMessageId-N_6c4I0();
   r.e(var12);
   val var9: ChannelId = var0.getChannelId-qMVnFVQ();
   r.e(var9);
   val var4: Long = var9.unbox-impl();
   val var10: GuildId = var0.getGuildId-qOKuAAo();
   val var13: java.lang.String = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS", Locale.getDefault()).format(new Date());
   val var11: p = new p();
   f.c(var11, "content", var6);
   f.b(var11, "flags", var2);
   f.b(var11, "type", var8);
   f.c(var11, "id", MessageId.toString-impl(var12));
   f.c(var11, "channel_id", ChannelId.toString-impl(var4));
   f.c(var11, "timestamp", var13);
   var11.b("author", var1);
   if (var10 != null) {
      f.c(var11, "guild_id", GuildId.toString-impl(var10.unbox-impl()));
   }

   return var11.a();
}

@JvmSynthetic
fun u(var0: NotificationData, var1: RenderContext): Unit {
   return renderMessageContent$lambda$6(var0, var1);
}
