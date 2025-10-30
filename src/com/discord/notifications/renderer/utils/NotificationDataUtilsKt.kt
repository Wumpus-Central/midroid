@file:SourceDebugExtension(["SMAP\nNotificationDataUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDataUtils.kt\ncom/discord/notifications/renderer/utils/NotificationDataUtilsKt\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,830:1\n29#2:831\n87#3:832\n74#3,2:833\n115#3:835\n74#3,4:836\n1557#4:840\n1628#4,3:841\n27#5,4:844\n27#5,4:848\n1#6:852\n*S KotlinDebug\n*F\n+ 1 NotificationDataUtils.kt\ncom/discord/notifications/renderer/utils/NotificationDataUtilsKt\n*L\n607#1:831\n648#1:832\n648#1:833,2\n648#1:835\n648#1:836,4\n724#1:840\n724#1:841,3\n768#1:844,4\n794#1:848,4\n*E\n"])

package com.discord.notifications.renderer.utils

import android.app.PendingIntent
import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
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
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject

@JvmSynthetic
fun a(var0: java.lang.String, var1: RenderContext): Unit {
   return getSystemMessageUserJoin__NT_lnE$lambda$25$lambda$24(var0, var1);
}

@JvmSynthetic
fun b(var0: NotificationData, var1: RenderContext): Unit {
   return renderMessageContent$lambda$9(var0, var1);
}

@JvmSynthetic
fun c(var0: NotificationData, var1: RenderContext): Unit {
   return getTitle$lambda$6(var0, var1);
}

@JvmSynthetic
fun d(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$17(var0, var1);
}

@JvmSynthetic
fun e(var0: NotificationData, var1: RenderContext): Unit {
   return renderMessageContent$lambda$10(var0, var1);
}

@JvmSynthetic
fun f(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$15(var0, var1);
}

@JvmSynthetic
fun g(var0: NotificationData, var1: RenderContext): Unit {
   return getTitle$lambda$3(var0, var1);
}

public fun NotificationData.getAuthor(): JsonObject {
   val var3: java.lang.String = var0.getUserAvatar();
   val var4: UserId = var0.getUserId-wUX8bhU();
   val var1: Long = var4.unbox-impl();
   val var5: java.lang.String = var0.getUserUsername();
   val var6: xp.x = new xp.x();
   if (var3 != null) {
      xp.g.c(var6, "avatar", var3);
   }

   xp.g.c(var6, "id", UserId.toString-impl(var1));
   xp.g.c(var6, "username", var5);
   xp.g.c(var6, "globalName", var0.getUserGlobalName());
   xp.g.a(var6, "incomplete", java.lang.Boolean.TRUE);
   return var6.a();
}

public fun NotificationData.getBotDMMuteAction(context: Context): Action? {
   if (var0.getType() == "MESSAGE_CREATE" && var0.getAppDm()) {
      val var4: ChannelId = var0.getChannelId-qMVnFVQ();
      if (var4 != null) {
         return new androidx.core.app.NotificationCompat.Action.a(
               R.drawable.ic_notifications_off_24dp,
               I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_MUTE_APP_DM, new r(var0)),
               NotificationAction.DefaultImpls.toPendingIntent$default(
                  new MuteAction(getTag(var0), var0.getGuildId-qOKuAAo(), var4.unbox-impl(), -1, null), var1, 0, false, 6, null
               )
            )
            .c();
      }
   }

   return null;
}

fun `getBotDMMuteAction$lambda$31`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("app", var0.getUserUsername());
   return Unit.a;
}

internal fun NotificationData.getButtonPendingIntent(context: Context, notificationDataMap: Map<String, String>): PendingIntent {
   val var3: java.lang.String = getTag(var0);
   val var4: StringBuilder = new StringBuilder();
   var4.append(var3);
   var4.append("button");
   return getPendingIntent(var1, var2, var4.toString());
}

public fun NotificationData.getCallAction(context: Context, isAcceptAction: Boolean, notificationDataMap: Map<String, String>): Action? {
   if (!(var0.getType() == "CALL_RING")) {
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
               var3 = n0.y(var3);
               var3.put("type", "CALL_CONNECT");
               var12 = getPendingIntent(var1, var3, getTag(var0));
            } else {
               var12 = NotificationAction.DefaultImpls.toPendingIntent$default(
                  new DismissCallAction(getTag(var0), var6, false, var0.getGuildId-qOKuAAo(), var8, null), var1, 0, false, 6, null
               );
            }

            val var13: Pair;
            if (var2) {
               var13 = fm.v.a(
                  I18nUtilsKt.i18nFormat$default(var1, I18nMessage.JOIN_CALL, null, 2, null),
                  ColorUtilsKt.getColorCompat(var1, com.discord.theme.R.color.green_360)
               );
            } else {
               var13 = fm.v.a(
                  I18nUtilsKt.i18nFormat$default(var1, I18nMessage.DECLINE, null, 2, null),
                  ColorUtilsKt.getColorCompat(var1, com.discord.theme.R.color.red_400)
               );
            }

            val var16: java.lang.CharSequence = var13.a() as java.lang.CharSequence;
            var var5: Int = (var13.b() as java.lang.Number).intValue();
            val var20: SpannableStringBuilder = new SpannableStringBuilder();
            val var11: StyleSpan = new StyleSpan(1);
            var var4: Int = var20.length();
            val var14: ForegroundColorSpan = new ForegroundColorSpan(var5);
            var5 = var20.length();
            var20.append(var16);
            var20.setSpan(var14, var5, var20.length(), 17);
            var20.setSpan(var11, var4, var20.length(), 17);
            if (var2) {
               var4 = R.drawable.ic_call_24dp;
            } else {
               var4 = R.drawable.ic_call_disconnect_24dp;
            }

            return new androidx.core.app.NotificationCompat.Action.a(var4, var20, var12).c();
         }
      }

      return null;
   }
}

public fun NotificationData.getContent(context: Context, forLogs: Boolean): CharSequence? {
   val var3: java.lang.String = var0.getType();
   switch (var3.hashCode()) {
      case -1502317553:
         if (var3.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
            val var5: java.lang.String = var0.getSubtitle();
            if (var5 == null) {
               return "";
            }

            return var5;
         }
         break;
      case -1489275252:
         if (var3.equals("GUILD_SCHEDULED_EVENT_UPDATE")) {
            val var11: Int = var0.getGuildScheduledEventEntityType();
            if ((var11 == null || var11 != 2) && (var11 == null || var11 != 1)) {
               if (var11 != null && var11 == 3) {
                  return I18nUtilsKt.i18nFormat(var1, I18nMessage.GUILD_SCHEDULED_EVENT_EXTERNAL_START_BODY, new q(var0));
               }

               return "";
            }

            return I18nUtilsKt.i18nFormat(var1, I18nMessage.GUILD_SCHEDULED_EVENT_STAGE_START_BODY, new p(var0));
         }
         break;
      case -1327124998:
         if (var3.equals("RELATIONSHIP_ADD")) {
            val var4: Int = var0.getRelationshipType();
            if (var4 != null && var4 == 1) {
               return I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_ACCEPTED_FRIEND_REQUEST, null, 2, null);
            }

            if (var4 != null && var4 == 3) {
               return I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_PENDING_FRIEND_REQUEST, null, 2, null);
            }

            return "";
         }
         break;
      case -1263316859:
         if (var3.equals("STAGE_INSTANCE_CREATE")) {
            return I18nUtilsKt.i18nFormat(var1, I18nMessage.STAGE_START_PUSH_NOTIFICATION_BODY, new n(var0));
         }
         break;
      case -1237752112:
         if (var3.equals("APPLICATION_LIBRARY_INSTALL_COMPLETE")) {
            return I18nUtilsKt.i18nFormat(var1, I18nMessage.GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_BODY, new m(var0));
         }
         break;
      case -437641071:
         if (var3.equals("FORUM_THREAD_CREATED")) {
            return I18nUtilsKt.i18nFormat(var1, I18nMessage.FORUM_CHANNEL_THREAD_CREATED_PUSH_BODY_MOBILE, new o(var0));
         }
         break;
      case -45642698:
         if (var3.equals("FRIEND_SUGGESTION_CREATE")) {
            return I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_FRIEND_SUGGESTION_BODY, null, 2, null);
         }
         break;
      case 974015250:
         if (var3.equals("ACTIVITY_START")) {
            val var10: Int = var0.getActivityType();
            if (var10 != null && var10 == 0) {
               return I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_BODY_START_GAME, new j(var0));
            }

            return "";
         }
         break;
      case 998188116:
         if (var3.equals("MESSAGE_CREATE")) {
            val var6: Int = var0.getChannelType();
            if ((var6 == null || var6 != 0)
               && (var6 == null || var6 != 2)
               && (var6 == null || var6 != 5)
               && (var6 == null || var6 != 10)
               && (var6 == null || var6 != 11)
               && (var6 == null || var6 != 12)) {
               if (var6 != null && var6 == 3 || var6 != null && var6 == 1) {
                  val var9: Int = var0.getMessageActivityType();
                  if (var9 != null && var9 == 1) {
                     return I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_MESSAGE_CREATE_DM_ACTIVITY_JOIN, new i(var0));
                  }

                  return renderMessageContent(var0, var1, var2);
               }

               return "";
            }

            val var7: Int = var0.getMessageType();
            if (var7 != null && var7 == 7) {
               return getSystemMessageUserJoin-_NT-lnE(var1, var0.getUserId-wUX8bhU(), var0.getUserUsername());
            }

            val var8: Int = var0.getMessageActivityType();
            if (var8 != null && var8 == 1) {
               return I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_MESSAGE_CREATE_GUILD_ACTIVITY_JOIN, new h(var0));
            }

            return renderMessageContent(var0, var1, var2);
         }
         break;
      case 1770025841:
         if (var3.equals("CALL_RING")) {
            return I18nUtilsKt.i18nFormat(var1, I18nMessage.OVERLAY_FRIEND_CALLING, new k(var0));
         }
      default:
   }

   return "";
}

fun `getContent$lambda$15`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("user", var0.getUserUsername());
   var1.getArgs().put("game", var0.getMessageApplicationName());
   return Unit.a;
}

fun `getContent$lambda$16`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("user", var0.getUserUsername());
   var1.getArgs().put("game", var0.getMessageApplicationName());
   return Unit.a;
}

fun `getContent$lambda$17`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("username", var0.getUserUsername());
   var1.getArgs().put("gameName", var0.getActivityName());
   return Unit.a;
}

fun `getContent$lambda$18`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("name", var0.getUserUsername());
   return Unit.a;
}

fun `getContent$lambda$19`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("name", var0.getApplicationName());
   return Unit.a;
}

fun `getContent$lambda$20`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("username", var0.getUserUsername());
   var1.getArgs().put("topic", var0.getStageInstanceTopic());
   return Unit.a;
}

fun `getContent$lambda$21`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("channelName", var0.getChannelName());
   var1.getArgs().put("userUsername", var0.getUserUsername());
   return Unit.a;
}

fun `getContent$lambda$22`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("topic", var0.getStageInstanceTopic());
   var1.getArgs().put("username", var0.getUserUsername());
   return Unit.a;
}

fun `getContent$lambda$23`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("topic", var0.getStageInstanceTopic());
   return Unit.a;
}

internal fun NotificationData.getContentPendingIntent(context: Context, notificationDataMap: Map<String, String>): PendingIntent {
   val var4: java.lang.String = getTag(var0);
   val var3: StringBuilder = new StringBuilder();
   var3.append(var4);
   var3.append("content");
   return getPendingIntent(var1, var2, var3.toString());
}

internal fun NotificationData.getConversationTitle(): CharSequence? {
   if (!(var0.getType() == "MESSAGE_CREATE")) {
      return null;
   } else {
      val var1: Int = var0.getChannelType();
      if ((var1 == null || var1 != 0)
         && (var1 == null || var1 != 2)
         && (var1 == null || var1 != 5)
         && (var1 == null || var1 != 10)
         && (var1 == null || var1 != 11)
         && (var1 == null || var1 != 12)) {
         if (var1 != null && var1 == 3) {
            val var5: java.lang.String = var0.getChannelName();
            return if (var5 == null) var0.getUserUsername() else var5;
         } else {
            return null;
         }
      } else {
         val var4: java.lang.String = var0.getGuildName();
         val var2: java.lang.String = var0.getChannelName();
         val var3: StringBuilder = new StringBuilder();
         var3.append(var4);
         var3.append(" #");
         var3.append(var2);
         return var3.toString();
      }
   }
}

internal fun NotificationData.getDeletePendingIntent(context: Context): PendingIntent {
   return NotificationAction.DefaultImpls.toPendingIntent$default(new DeleteAction(getTag(var0)), var1, 0, false, 6, null);
}

internal fun NotificationData.getDirectReplyAction(context: Context): Action? {
   if (var0.getType() == "MESSAGE_CREATE" && var0.getCanReply() && !var0.getAppDm()) {
      val var4: ChannelId = var0.getChannelId-qMVnFVQ();
      if (var4 != null) {
         return new androidx.core.app.NotificationCompat.Action.a(
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
   val var2: java.lang.String = var0.getType();
   val var1: StringBuilder = new StringBuilder();
   var1.append("GROUP_");
   var1.append(var2);
   return var1.toString();
}

internal fun NotificationData.getIconUrl(context: Context): String {
   var var3: java.lang.String = var0.getType();
   switch (var3.hashCode()) {
      case -1502317553:
         if (var3.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
            val var7: java.lang.String = var0.getIconUrl();
            if (var7 == null) {
               return "";
            }

            return var7;
         }

         return "";
      case -1489275252:
         if (var3.equals("GUILD_SCHEDULED_EVENT_UPDATE")) {
            return IconUrlUtils.getForGuild-14CJxO4$default(IconUrlUtils.INSTANCE, var0.getGuildId-qOKuAAo(), var0.getGuildIcon(), "", false, null, 24, null);
         }

         return "";
      case -1327124998:
         if (var3.equals("RELATIONSHIP_ADD")) {
            return IconUrlUtils.getApplicationIcon-weIltyw$default(
               IconUrlUtils.INSTANCE, var0.getApplicationId-UtIrSio(), var0.getApplicationIcon(), 0, 4, null
            );
         }

         return "";
      case -1263316859:
         if (var3.equals("STAGE_INSTANCE_CREATE")) {
            return IconUrlUtils.getForGuild-14CJxO4$default(IconUrlUtils.INSTANCE, var0.getGuildId-qOKuAAo(), var0.getGuildIcon(), "", false, null, 24, null);
         }

         return "";
      case -1237752112:
         if (var3.equals("APPLICATION_LIBRARY_INSTALL_COMPLETE")) {
            return IconUrlUtils.getApplicationIcon-weIltyw$default(
               IconUrlUtils.INSTANCE, var0.getApplicationId-UtIrSio(), var0.getApplicationIcon(), 0, 4, null
            );
         }

         return "";
      case -437641071:
         if (var3.equals("FORUM_THREAD_CREATED")) {
            return IconUrlUtils.getForGuild-14CJxO4$default(IconUrlUtils.INSTANCE, var0.getGuildId-qOKuAAo(), var0.getGuildIcon(), "", false, null, 24, null);
         }

         return "";
      case -45642698:
         if (var3.equals("FRIEND_SUGGESTION_CREATE")) {
            return IconUrlUtils.getForUser-_fRzTXg$default(
               IconUrlUtils.INSTANCE, var1, var0.getUserId-wUX8bhU(), var0.getUserAvatar(), null, false, null, 40, null
            );
         }

         return "";
      case 974015250:
         if (var3.equals("ACTIVITY_START")) {
            return IconUrlUtils.getApplicationIcon-weIltyw$default(
               IconUrlUtils.INSTANCE, var0.getApplicationId-UtIrSio(), var0.getApplicationIcon(), 0, 4, null
            );
         }

         return "";
      case 998188116:
         if (!var3.equals("MESSAGE_CREATE")) {
            return "";
         }
         break;
      case 1770025841:
         if (!var3.equals("CALL_RING")) {
            return "";
         }
         break;
      default:
         return "";
   }

   val var8: Int = var0.getChannelType();
   var var2: Boolean = true;
   if (var8 != null && var8 == 1) {
      return IconUrlUtils.getForUser-_fRzTXg$default(
         IconUrlUtils.INSTANCE, var1, var0.getUserId-wUX8bhU(), var0.getUserAvatar(), var0.getUserDiscriminator(), false, null, 32, null
      );
   } else if ((var8 == null || var8 != 0)
      && (var8 == null || var8 != 2)
      && (var8 == null || var8 != 5)
      && (var8 == null || var8 != 10)
      && (var8 == null || var8 != 11)
      && (var8 == null || var8 != 12)) {
      val var5: IconUrlUtils = IconUrlUtils.INSTANCE;
      val var4: ChannelId = var0.getChannelId-qMVnFVQ();
      var3 = var0.getChannelIcon();
      val var6: Int = var0.getChannelType();
      if (var6 == null || var6 != 3) {
         var2 = false;
      }

      return IconUrlUtils.getForChannel-JYSGpIY$default(var5, var1, var4, var3, var2, null, 16, null);
   } else {
      return IconUrlUtils.getForGuild-14CJxO4$default(IconUrlUtils.INSTANCE, var0.getGuildId-qOKuAAo(), var0.getGuildIcon(), "", false, null, 24, null);
   }
}

internal fun NotificationData.getIconUrlForAvatar(context: Context): String {
   val var3: IconUrlUtils = IconUrlUtils.INSTANCE;
   val var2: java.lang.String = IconUrlUtils.getForGuildMember-2tNb6hE$default(
      IconUrlUtils.INSTANCE, var0.getUserGuildAvatar(), var0.getGuildId-qOKuAAo(), var0.getUserId-wUX8bhU(), null, false, 24, null
   );
   return if (var2.length() == 0)
      IconUrlUtils.getForUser-_fRzTXg$default(var3, var1, var0.getUserId-wUX8bhU(), var0.getUserAvatar(), var0.getUserDiscriminator(), false, null, 32, null)
      else
      var2;
}

public fun NotificationData.getKvMessage(rawMessage: String?): KvMessageEntry? {
   val var2: java.lang.String = var0.getMessageId-N_6c4I0();
   val var3: ChannelId = var0.getChannelId-qMVnFVQ();
   if (var2 != null && var3 != null && var0.getType() == "MESSAGE_CREATE") {
      val var4: NotificationMessage = var0.getMessage();
      if (var1 != null && var4 != null) {
         val var11: JsonElement = Json.d.g(var1);
         val var9: java.util.List = CollectionsKt.k();
         val var5: JsonObject = var4.getAuthor();
         val var13: java.util.List = CollectionsKt.C0(CollectionsKt.e(var5), var4.getMentions());
         val var12: ArrayList = new ArrayList(CollectionsKt.v(var13, 10));
         val var14: java.util.Iterator = var13.iterator();

         while (var14.hasNext()) {
            val var6: java.util.Map = n0.y(var14.next() as JsonObject);
            var6.put("incomplete", xp.h.b(java.lang.Boolean.TRUE));
            var12.add(new JsonObject(var6));
         }

         return new KvMessageEntry(var9, var12, xp.h.n(var11), var2, var3.unbox-impl(), null);
      }

      try {
         val var10: JsonObject = getAuthor(var0);
         return new KvMessageEntry(CollectionsKt.k(), CollectionsKt.e(var10), toNotificationMessage(var0, var10), var2, var3.unbox-impl(), null);
      } catch (var7: Exception) {
         CrashReporting.captureException$default(CrashReporting.INSTANCE, var7, false, 2, null);
      }
   }

   return null;
}

internal fun NotificationData.getMarkAsReadAction(context: Context): Action? {
   if (!(var0.getType() == "MESSAGE_CREATE")) {
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
            new androidx.core.app.NotificationCompat.Action.a(
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
   return if (var2)
      I18nUtilsKt.i18nFormat$default(var0, I18nMessage.MISSED_CALL_NOTIFICATION, null, 2, null).toString()
      else
      I18nUtilsKt.i18nFormat(var0, I18nMessage.MISSED_CALL_NOTIFICATION_FROM, new y(var1)).toString();
}

fun `getMissedCallText$lambda$36`(var0: java.lang.String, var1: RenderContext): Unit {
   var1.getArgs().put("name", var0);
   return Unit.a;
}

internal fun NotificationData.getNotificationCategory(): String {
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
   val var1: java.lang.String = var0.getMessageId-N_6c4I0();
   if (var1 != null) {
      val var2: MessageIdSnowflake = MessageId.toSnowflake-wDbSO-A(var1);
      if (var2 != null) {
         return SnowflakeUtilsKt.toTimestamp(var2);
      }
   }

   return System.currentTimeMillis();
}

internal fun NotificationData.getSender(icon: Bitmap?): Person {
   val var6: androidx.core.app.Person.c = new androidx.core.app.Person.c();
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

   val var10: androidx.core.app.Person.c = var9.d(var3);
   val var8: IconCompat;
   if (var1 != null) {
      var8 = toIconCompat(var1);
   } else {
      var8 = null;
   }

   return var10.c(var8).a();
}

internal fun NotificationData.getSenderForMessageNotification(icon: Bitmap?): Person? {
   return if (var0.isFromCurrentUser()) null else getSender(var0, var1);
}

internal fun NotificationData.getShortcutInfo(context: Context, notificationDataMap: Map<String, String>, icon: Bitmap?, avatar: Bitmap?): ShortcutInfoCompat {
   return ShortcutUtilsKt.createShortcut$default(
      var1,
      java.lang.String.valueOf(var0.getChannelId-qMVnFVQ()),
      getTitle(var0, var1),
      getTitle(var0, var1),
      var3,
      CollectionsKt.e(getSender(var0, var4)),
      ShortcutData.Companion.createShortcutIntent(var1, "android.intent.action.VIEW", NotificationAction.Companion.getActivityClass(), getTag(var0), var2),
      0,
      64,
      null
   );
}

internal fun NotificationData.getSmallIcon(): Int {
   val var1: java.lang.String = var0.getType();
   switch (var1.hashCode()) {
      case -1327124998:
         if (var1.equals("RELATIONSHIP_ADD")) {
            return R.drawable.ic_notification_friends_24dp;
         }
         break;
      case -45642698:
         if (var1.equals("FRIEND_SUGGESTION_CREATE")) {
            return R.drawable.ic_notification_friends_24dp;
         }
         break;
      case 998188116:
         if (var1.equals("MESSAGE_CREATE")) {
            return R.drawable.ic_notification_message_24dp;
         }
         break;
      case 1770025841:
         if (var1.equals("CALL_RING")) {
            return R.drawable.ic_notification_call_24dp;
         }
      default:
   }

   return R.drawable.ic_notification_24dp;
}

internal fun NotificationData.getSound(context: Context): Uri? {
   if (var0.getType() == "CALL_RING") {
      val var4: StringBuilder = new StringBuilder();
      var4.append("android.resource://");
      val var3: java.lang.String = var1.getPackageName();
      val var2: Int = com.discord.sounds.R.raw.call_ringing;
      val var6: StringBuilder = new StringBuilder();
      var6.append(var3);
      var6.append("/");
      var6.append(var2);
      var4.append(var6.toString());
      val var5: java.lang.String = var4.toString();
      return Uri.parse(var5);
   } else {
      return null;
   }
}

private fun getSystemMessageUserJoin(context: Context, userId: UserId?, userName: String?): CharSequence {
   val var5: java.util.List = CollectionsKt.n(
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

   return I18nUtilsKt.i18nFormat(var0, var5.get((int)(var3 % (long)var5.size())) as I18nMessage, new x(var2));
}

fun `getSystemMessageUserJoin__NT_lnE$lambda$25$lambda$24`(var0: java.lang.String, var1: RenderContext): Unit {
   var1.getArgs().put("username", var0);
   return Unit.a;
}

public fun NotificationData.getTag(): String {
   label53: {
      label52: {
         var var1: java.lang.String = var0.getType();
         switch (var1.hashCode()) {
            case -1502317553:
               if (var1.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
                  var1 = var0.getType();
                  val var29: java.lang.String = var0.getDeeplink();
                  val var13: StringBuilder = new StringBuilder();
                  var13.append(var1);
                  var13.append(var29);
                  return var13.toString();
               }
               break;
            case -1489275252:
               if (var1.equals("GUILD_SCHEDULED_EVENT_UPDATE")) {
                  break label52;
               }
               break;
            case -1327124998:
               if (var1.equals("RELATIONSHIP_ADD")) {
                  var1 = var0.getType();
                  val var27: UserId = var0.getUserId-wUX8bhU();
                  val var10: StringBuilder = new StringBuilder();
                  var10.append(var1);
                  var10.append(var27);
                  return var10.toString();
               }
               break;
            case -1263316859:
               if (var1.equals("STAGE_INSTANCE_CREATE")) {
                  break label52;
               }
               break;
            case -1237752112:
               if (var1.equals("APPLICATION_LIBRARY_INSTALL_COMPLETE")) {
                  var1 = var0.getType();
                  val var9: ApplicationId = var0.getApplicationId-UtIrSio();
                  val var26: StringBuilder = new StringBuilder();
                  var26.append(var1);
                  var26.append(var9);
                  return var26.toString();
               }
               break;
            case -437641071:
               if (var1.equals("FORUM_THREAD_CREATED")) {
                  break label52;
               }
               break;
            case -45642698:
               if (var1.equals("FRIEND_SUGGESTION_CREATE")) {
                  var1 = var0.getType();
                  val var8: UserId = var0.getUserId-wUX8bhU();
                  val var25: StringBuilder = new StringBuilder();
                  var25.append(var1);
                  var25.append(var8);
                  return var25.toString();
               }
               break;
            case 74682093:
               if (var1.equals("CALL_RING_END")) {
                  break label53;
               }
               break;
            case 974015250:
               if (var1.equals("ACTIVITY_START")) {
                  val var23: java.lang.String = var0.getType();
                  val var15: Int = var0.getActivityType();
                  val var30: java.lang.String = var0.getActivityName();
                  val var6: StringBuilder = new StringBuilder();
                  var6.append(var23);
                  var6.append(var15);
                  var6.append(var30);
                  return var6.toString();
               }
               break;
            case 998188116:
               if (var1.equals("MESSAGE_CREATE")) {
                  break label52;
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
               break;
            case 1770025841:
               if (var1.equals("CALL_RING")) {
                  break label53;
               }
            default:
         }

         val var12: java.lang.String = var0.getType();
         val var21: StringBuilder = new StringBuilder();
         var21.append("Unknown notification type: ");
         var21.append(var12);
         var21.append(".");
         throw new IllegalArgumentException(var21.toString());
      }

      val var20: java.lang.String = var0.getType();
      val var11: ChannelId = var0.getChannelId-qMVnFVQ();
      val var28: StringBuilder = new StringBuilder();
      var28.append(var20);
      var28.append(var11);
      return var28.toString();
   }

   val var24: java.lang.String = var0.getType();
   val var16: ChannelId = var0.getChannelId-qMVnFVQ();
   val var31: java.lang.String = var0.getTimeReceived();
   val var7: StringBuilder = new StringBuilder();
   var7.append(var24);
   var7.append(var16);
   var7.append(var31);
   return var7.toString();
}

public fun NotificationData.getTimedMuteAction(context: Context, numMessages: Int): Action? {
   if (var0.getType() == "MESSAGE_CREATE" && var2 >= 2 && !var0.getAppDm()) {
      val var5: ChannelId = var0.getChannelId-qMVnFVQ();
      if (var5 != null) {
         return new androidx.core.app.NotificationCompat.Action.a(
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
   var var2: java.lang.String = var0.getType();
   switch (var2.hashCode()) {
      case -1502317553:
         if (var2.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
            val var12: java.lang.String = var0.getTitle();
            if (var12 == null) {
               return "";
            }

            return var12;
         }
         break;
      case -1489275252:
         if (var2.equals("GUILD_SCHEDULED_EVENT_UPDATE")) {
            val var22: Int = var0.getGuildScheduledEventEntityType();
            if (var22 != null && var22 == 1) {
               return I18nUtilsKt.i18nFormat(var1, I18nMessage.GUILD_SCHEDULED_EVENT_STAGE_START_TITLE, new u(var0));
            }

            return "";
         }
         break;
      case -1327124998:
         if (var2.equals("RELATIONSHIP_ADD")) {
            val var11: java.lang.String = var0.getUserUsername();
            if (var11 == null) {
               return "";
            }

            return var11;
         }
         break;
      case -1263316859:
         if (var2.equals("STAGE_INSTANCE_CREATE")) {
            return I18nUtilsKt.i18nFormat(var1, I18nMessage.STAGE_START_PUSH_NOTIFICATION_TITLE, new s(var0));
         }
         break;
      case -1237752112:
         if (var2.equals("APPLICATION_LIBRARY_INSTALL_COMPLETE")) {
            return I18nUtilsKt.i18nFormat$default(var1, I18nMessage.GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_TITLE, null, 2, null);
         }
         break;
      case -437641071:
         if (var2.equals("FORUM_THREAD_CREATED")) {
            return I18nUtilsKt.i18nFormat(var1, I18nMessage.FORUM_CHANNEL_THREAD_CREATED_PUSH_TITLE_MOBILE, new t(var0));
         }
         break;
      case -45642698:
         if (var2.equals("FRIEND_SUGGESTION_CREATE")) {
            if (StringsKt.v(var0.getPlatformUserUsername(), var0.getUserUsername(), false, 2, null)) {
               return I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_FRIEND_SUGGESTION_CONTACT_TITLE, new v(var0));
            }

            return I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_FRIEND_SUGGESTION_TITLE, new w(var0));
         }
         break;
      case 974015250:
         if (var2.equals("ACTIVITY_START")) {
            val var10: Int = var0.getActivityType();
            if (var10 != null && var10 == 0) {
               return I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_TITLE_START_GAME, null, 2, null);
            }

            return "";
         }
         break;
      case 998188116:
         if (var2.equals("MESSAGE_CREATE")) {
            val var19: Int = var0.getChannelType();
            if (var19 != null && var19 == 0
               || var19 != null && var19 == 2
               || var19 != null && var19 == 5
               || var19 != null && var19 == 10
               || var19 != null && var19 == 11
               || var19 != null && var19 == 12) {
               val var15: Int = var0.getMessageType();
               if (var15 != null && var15 == 63) {
                  val var9: java.lang.String = var0.getUserUsername();
                  if (var9 == null) {
                     return "";
                  }

                  return var9;
               }

               val var16: java.lang.String = var0.getGuildName();
               var2 = var0.getChannelName();
               val var8: StringBuilder = new StringBuilder();
               var8.append(var16);
               var8.append(" #");
               var8.append(var2);
               return var8.toString();
            }

            if (var19 != null && var19 == 1) {
               if (var0.getInviteGuildName() != null && var0.getUserUsername() != null) {
                  val var20: Int = var0.getInviteTitleVariant();
                  if (var20 != null && var20 == 1) {
                     return I18nUtilsKt.i18nFormat(var1, I18nMessage.INVITED_YOU_TO_GUILD, new a(var0));
                  }

                  if (var20 != null && var20 == 2) {
                     return I18nUtilsKt.i18nFormat(var1, I18nMessage.GUILD_INVITE_FROM_EMOJI, new l(var0));
                  }

                  val var7: java.lang.String = var0.getUserUsername();
                  if (var7 == null) {
                     return "";
                  }

                  return var7;
               }

               val var6: java.lang.String = var0.getUserUsername();
               if (var6 == null) {
                  return "";
               }

               return var6;
            }

            if (var19 != null && var19 == 3) {
               val var14: java.lang.String = var0.getChannelName();
               if (var14 == null) {
                  val var5: java.lang.String = var0.getUserUsername();
                  if (var5 == null) {
                     return "";
                  }

                  return var5;
               }

               return var14;
            }

            return "";
         }
         break;
      case 1770025841:
         if (var2.equals("CALL_RING")) {
            val var17: Int = var0.getChannelType();
            if (var17 != null && var17 == 1) {
               return I18nUtilsKt.i18nFormat$default(var1, I18nMessage.INCOMING_CALL, null, 2, null);
            }

            if (var17 != null && var17 == 3) {
               val var4: java.lang.String = var0.getChannelName();
               if (var4 == null) {
                  return "";
               }

               return var4;
            }

            val var13: java.lang.String = var0.getChannelName();
            var2 = var0.getGuildName();
            val var3: StringBuilder = new StringBuilder();
            var3.append(var13);
            var3.append(", ");
            var3.append(var2);
            return var3.toString();
         }
      default:
   }

   return "";
}

fun `getTitle$lambda$0`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("userName", var0.getUserUsername());
   return Unit.a;
}

fun `getTitle$lambda$1`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("userName", var0.getUserUsername());
   return Unit.a;
}

fun `getTitle$lambda$2`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("guildName", var0.getGuildName());
   return Unit.a;
}

fun `getTitle$lambda$3`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("guildName", var0.getGuildName());
   var1.getArgs().put("channelName", var0.getParentName());
   return Unit.a;
}

fun `getTitle$lambda$4`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("guildName", var0.getGuildName());
   return Unit.a;
}

fun `getTitle$lambda$5`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("contact", var0.getPlatformUserUsername());
   return Unit.a;
}

fun `getTitle$lambda$6`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("contact", var0.getPlatformUserUsername());
   return Unit.a;
}

@JvmSynthetic
fun h(var0: NotificationData, var1: RenderContext): Unit {
   return getTitle$lambda$0(var0, var1);
}

@JvmSynthetic
fun i(var0: NotificationData, var1: RenderContext): Unit {
   return renderMessageContent$lambda$14(var0, var1);
}

internal fun NotificationData.isCall(): Boolean {
   val var1: Int = var0.getChannelType();
   if (var1 == null || var1 != 1) {
      val var2: Int = var0.getChannelType();
      if (var2 == null || var2 != 3) {
         return false;
      }
   }

   return true;
}

internal fun NotificationData.isCallRinging(): Boolean {
   return var0.getType() == "CALL_RING";
}

internal fun NotificationData.isGroupConversation(): Boolean {
   if (var0.getType() == "MESSAGE_CREATE") {
      val var1: Int = var0.getChannelType();
      if (var1 == null || var1 != 1) {
         return true;
      }
   }

   return false;
}

@JvmSynthetic
fun j(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$18(var0, var1);
}

@JvmSynthetic
fun k(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$19(var0, var1);
}

@JvmSynthetic
fun l(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$23(var0, var1);
}

@JvmSynthetic
fun m(var0: Embed, var1: RenderContext): Unit {
   return renderMessageContent$lambda$12(var0, var1);
}

@JvmSynthetic
fun n(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$22(var0, var1);
}

@JvmSynthetic
fun o(var0: NotificationData, var1: RenderContext): Unit {
   return getBotDMMuteAction$lambda$31(var0, var1);
}

@JvmSynthetic
fun p(var0: NotificationData, var1: RenderContext): Unit {
   return getTitle$lambda$2(var0, var1);
}

@JvmSynthetic
fun q(var0: NotificationData, var1: RenderContext): Unit {
   return getTitle$lambda$1(var0, var1);
}

@JvmSynthetic
fun r(var0: NotificationData, var1: RenderContext): Unit {
   return getTitle$lambda$5(var0, var1);
}

private fun renderLogAwareNotificationMessageContent(forLogs: Boolean, messageContent: String?): CharSequence? {
   if (var1 == null || var1.length() == 0) {
      return var1;
   } else {
      return if (var0) "<Message>" else RenderNotificationMessageContentKt.renderNotificationMessageContent(var1);
   }
}

internal fun NotificationData.renderMessageContent(context: Context, forLogs: Boolean): CharSequence? {
   var var3: NotificationMessage = var0.getMessage();
   val var4: Sticker;
   if (var3 != null) {
      var4 = var3.getSticker();
   } else {
      var4 = null;
   }

   var3 = var0.getMessage();
   val var8: Embed;
   if (var3 != null) {
      var8 = var3.getEmbed();
   } else {
      var8 = null;
   }

   if (var4 != null) {
      return I18nUtilsKt.i18nFormat(var1, I18nMessage.STICKER_NOTIFICATION_BODY, new z(var4));
   } else if (var0.getAttachmentTextVariant() != null) {
      val var10: Int = var0.getAttachmentTextVariant();
      if (var10 != null && var10 == 1) {
         return I18nUtilsKt.i18nFormat$default(var1, I18nMessage.SENT_AN_IMAGE, null, 2, null);
      } else if (var10 != null && var10 == 2) {
         return I18nUtilsKt.i18nFormat(var1, I18nMessage.SENT_IMAGES, new b(var0));
      } else {
         return (java.lang.CharSequence)(if (var10 != null && var10 == 3)
            I18nUtilsKt.i18nFormat$default(var1, I18nMessage.SENT_A_GIF, null, 2, null)
            else
            var0.getMessageContent());
      }
   } else {
      val var11: Int = var0.getMessageReferenceType();
      if (var11 != null && var11 == 1) {
         return I18nUtilsKt.i18nFormat$default(var1, I18nMessage.MESSAGE_FORWARDED_NOTIFICATION_BODY, null, 2, null);
      } else if (var0.getActivityInstanceId() == null || var0.getMessageContent() != null && !(var0.getMessageContent() == "")) {
         if (MessageFlagKt.hasMessageFlag(var0.getMessageFlags(), MessageFlag.IS_VOICE_MESSAGE)) {
            return I18nUtilsKt.i18nFormat$default(var1, I18nMessage.VOICE_MESSAGES_SENT_NOTIFICATION, null, 2, null);
         } else {
            val var6: NotificationMessage = var0.getMessage();
            var var12: Poll = null;
            if (var6 != null) {
               var12 = var6.getPoll();
            }

            if (var12 != null) {
               return I18nUtilsKt.i18nFormat(var1, I18nMessage.POLL_SENT_NOTIFICATION, new d(var0));
            } else {
               val var13: Int = var0.getMessageType();
               if (var13 != null && var13 == 46) {
                  return I18nUtilsKt.i18nFormat(var1, I18nMessage.POLL_RESULTS_NOTIFICATION, new e(var8));
               } else {
                  val var9: Int = var0.getMessageType();
                  if (var9 != null && var9 == 63) {
                     return I18nUtilsKt.i18nFormat(var1, I18nMessage.EMOJI_ADDED_NOTIFICATION_BODY, new f(var0));
                  } else {
                     return if (var0.getInviteGuildName() != null)
                        I18nUtilsKt.i18nFormat(var1, I18nMessage.JOIN_GUILD_NAME, new g(var0))
                        else
                        renderLogAwareNotificationMessageContent(var2, var0.getMessageContent());
                  }
               }
            }
         }
      } else {
         return I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_MESSAGE_ACTIVITY_INSTANCE, new c(var0));
      }
   }
}

fun `renderMessageContent$lambda$10`(var0: NotificationData, var1: RenderContext): Unit {
   var var2: java.util.Map;
   label15: {
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

fun `renderMessageContent$lambda$12`(var0: Embed, var1: RenderContext): Unit {
   var var2: java.util.Map;
   label27: {
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
            } while (!(((EmbedField)var4).getName() == "poll_question_text"));

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

fun `renderMessageContent$lambda$13`(var0: NotificationData, var1: RenderContext): Unit {
   val var5: java.util.Map = var1.getArgs();
   val var4: java.lang.String = var0.getMessageContent();
   var var2: java.lang.String = var4;
   if (var4 == null) {
      var2 = "???";
   }

   var5.put("emoji", var2);
   val var7: java.util.Map = var1.getArgs();
   var var6: java.lang.String = var0.getGuildName();
   if (var6 == null) {
      var6 = "???";
   }

   var7.put("guildName", var6);
   return Unit.a;
}

fun `renderMessageContent$lambda$14`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("guildName", var0.getInviteGuildName());
   return Unit.a;
}

fun `renderMessageContent$lambda$7`(var0: Sticker, var1: RenderContext): Unit {
   var1.getArgs().put("stickerName", var0.getName());
   return Unit.a;
}

fun `renderMessageContent$lambda$8`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("count", java.lang.String.valueOf(var0.getImageAttachmentCount()));
   return Unit.a;
}

fun `renderMessageContent$lambda$9`(var0: NotificationData, var1: RenderContext): Unit {
   var1.getArgs().put("user", var0.getUserUsername());
   return Unit.a;
}

@JvmSynthetic
fun s(var0: java.lang.String, var1: RenderContext): Unit {
   return getMissedCallText$lambda$36(var0, var1);
}

internal fun NotificationData.shouldUseBigText(): Boolean {
   return var0.getType() == "GENERIC_PUSH_NOTIFICATION_SENT" && var0.getExpandSubtitle() == java.lang.Boolean.TRUE;
}

internal fun NotificationData.shouldUseMessagingStyle(): Boolean {
   return var0.getType() == "MESSAGE_CREATE" || var0.getType() == "GENERIC_PUSH_NOTIFICATION_SENT" && var0.getUserAvatar() != null;
}

@JvmSynthetic
fun t(var0: Sticker, var1: RenderContext): Unit {
   return renderMessageContent$lambda$7(var0, var1);
}

private fun Bitmap.toIconCompat(): IconCompat {
   return IconCompat.h(var0);
}

public fun NotificationData.toNotificationMessage(author: JsonObject): JsonObject {
   val var6: java.lang.String = var0.getMessageContent();
   val var7: java.lang.Long = var0.getMessageFlags();
   val var2: Long;
   if (var7 != null) {
      var2 = var7;
   } else {
      var2 = 0L;
   }

   val var12: Int = var0.getMessageType();
   var12;
   val var8: java.lang.String = var0.getMessageId-N_6c4I0();
   val var9: ChannelId = var0.getChannelId-qMVnFVQ();
   val var4: Long = var9.unbox-impl();
   val var10: GuildId = var0.getGuildId-qOKuAAo();
   val var11: java.lang.String = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS", Locale.getDefault()).format(new Date());
   val var13: xp.x = new xp.x();
   xp.g.c(var13, "content", var6);
   xp.g.b(var13, "flags", var2);
   xp.g.b(var13, "type", var12);
   xp.g.c(var13, "id", MessageId.toString-impl(var8));
   xp.g.c(var13, "channel_id", ChannelId.toString-impl(var4));
   xp.g.c(var13, "timestamp", var11);
   var13.b("author", var1);
   if (var10 != null) {
      xp.g.c(var13, "guild_id", GuildId.toString-impl(var10.unbox-impl()));
   }

   return var13.a();
}

@JvmSynthetic
fun u(var0: NotificationData, var1: RenderContext): Unit {
   return getTitle$lambda$4(var0, var1);
}

@JvmSynthetic
fun v(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$20(var0, var1);
}

@JvmSynthetic
fun w(var0: NotificationData, var1: RenderContext): Unit {
   return renderMessageContent$lambda$8(var0, var1);
}

@JvmSynthetic
fun x(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$16(var0, var1);
}

@JvmSynthetic
fun y(var0: NotificationData, var1: RenderContext): Unit {
   return renderMessageContent$lambda$13(var0, var1);
}

@JvmSynthetic
fun z(var0: NotificationData, var1: RenderContext): Unit {
   return getContent$lambda$21(var0, var1);
}
