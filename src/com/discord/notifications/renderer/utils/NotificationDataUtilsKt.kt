package com.discord.notifications.renderer.utils

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
import com.discord.primitives.UserId
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.react_strings.RenderContext
import com.discord.shortcuts.ShortcutData
import com.discord.shortcuts.ShortcutUtilsKt
import com.discord.sounds.R.raw
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Date
import java.util.Locale
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import rn.f
import rn.g
import rn.p
import vj.w
import wj.r

public fun NotificationData.getAuthor(): JsonObject {
   q.h(var0, "<this>");
   val var3: java.lang.String = var0.getUserAvatar();
   val var4: UserId = var0.getUserId-wUX8bhU();
   q.e(var4);
   val var1: Long = var4.unbox-impl();
   val var5: java.lang.String = var0.getUserUsername();
   q.e(var5);
   val var6: p = new p();
   if (var3 != null) {
      f.c(var6, "avatar", var3);
   }

   f.c(var6, "id", UserId.toString-impl(var1));
   f.c(var6, "username", var5);
   f.c(var6, "globalName", var0.getUserGlobalName());
   f.a(var6, "incomplete", java.lang.Boolean.TRUE);
   return var6.a();
}

internal fun NotificationData.getButtonPendingIntent(context: Context, notificationDataMap: Map<String, String>): PendingIntent {
   q.h(var0, "<this>");
   q.h(var1, "context");
   q.h(var2, "notificationDataMap");
   val var3: java.lang.String = getTag(var0);
   val var4: StringBuilder = new StringBuilder();
   var4.append(var3);
   var4.append("button");
   return getPendingIntent(var1, var2, var4.toString());
}

public fun NotificationData.getCallAction(context: Context, isAcceptAction: Boolean, notificationDataMap: Map<String, String>): Action? {
   q.h(var0, "<this>");
   q.h(var1, "context");
   q.h(var3, "notificationDataMap");
   if (!q.c(var0.getType(), "CALL_RING")) {
      return null;
   } else {
      val var8: ChannelId = var0.getChannelId-qMVnFVQ();
      if (var8 != null) {
         val var6: Long = var8.unbox-impl();
         val var10: PendingIntent;
         if (var2) {
            var3 = r.x(var3);
            var3.put("type", "CALL_CONNECT");
            var10 = getPendingIntent(var1, var3, getTag(var0));
         } else {
            var10 = NotificationAction.DefaultImpls.toPendingIntent$default(new DismissCallAction(getTag(var0), var6, null), var1, 0, false, 6, null);
         }

         val var11: Pair;
         if (var2) {
            var11 = w.a(I18nUtilsKt.i18nFormat$default(var1, I18nMessage.JOIN_CALL, null, 2, null), ColorUtilsKt.getColorCompat(var1, color.green_360));
         } else {
            var11 = w.a(I18nUtilsKt.i18nFormat$default(var1, I18nMessage.DECLINE, null, 2, null), ColorUtilsKt.getColorCompat(var1, color.red_400));
         }

         val var14: java.lang.CharSequence = var11.a() as java.lang.CharSequence;
         var var5: Int = (var11.b() as java.lang.Number).intValue();
         val var12: SpannableStringBuilder = new SpannableStringBuilder();
         val var9: StyleSpan = new StyleSpan(1);
         var var4: Int = var12.length();
         val var17: ForegroundColorSpan = new ForegroundColorSpan(var5);
         var5 = var12.length();
         var12.append(var14);
         var12.setSpan(var17, var5, var12.length(), 17);
         var12.setSpan(var9, var4, var12.length(), 17);
         if (var2) {
            var4 = R.drawable.ic_call_24dp;
         } else {
            var4 = R.drawable.ic_call_disconnect_24dp;
         }

         return new NotificationCompat.Action.a(var4, var12, var10).c();
      } else {
         return null;
      }
   }
}

public fun NotificationData.getContent(context: Context, forLogs: Boolean): CharSequence? {
   q.h(var0, "<this>");
   q.h(var1, "context");
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
                  var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.GUILD_SCHEDULED_EVENT_EXTERNAL_START_BODY, new Function1(var0) {
                     final NotificationData $this_getContent;

                     {
                        super(1);
                        this.$this_getContent = var1;
                     }

                     public final void invoke(RenderContext var1) {
                        q.h(var1, "$this$i18nFormat");
                        var1.getArgs().put("topic", this.$this_getContent.getStageInstanceTopic());
                     }
                  });
               }
            } else {
               var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.GUILD_SCHEDULED_EVENT_STAGE_START_BODY, new Function1(var0) {
                  final NotificationData $this_getContent;

                  {
                     super(1);
                     this.$this_getContent = var1;
                  }

                  public final void invoke(RenderContext var1) {
                     q.h(var1, "$this$i18nFormat");
                     var1.getArgs().put("topic", this.$this_getContent.getStageInstanceTopic());
                     var1.getArgs().put("username", this.$this_getContent.getUserUsername());
                  }
               });
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
            var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.STAGE_START_PUSH_NOTIFICATION_BODY, new Function1(var0) {
               final NotificationData $this_getContent;

               {
                  super(1);
                  this.$this_getContent = var1;
               }

               public final void invoke(RenderContext var1) {
                  q.h(var1, "$this$i18nFormat");
                  var1.getArgs().put("username", this.$this_getContent.getUserUsername());
                  var1.getArgs().put("topic", this.$this_getContent.getStageInstanceTopic());
               }
            });
         }
         break;
      case -1237752112:
         if (var5.equals("APPLICATION_LIBRARY_INSTALL_COMPLETE")) {
            var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_BODY, new Function1(var0) {
               final NotificationData $this_getContent;

               {
                  super(1);
                  this.$this_getContent = var1;
               }

               public final void invoke(RenderContext var1) {
                  q.h(var1, "$this$i18nFormat");
                  var1.getArgs().put("name", this.$this_getContent.getApplicationName());
               }
            });
         }
         break;
      case -437641071:
         if (var5.equals("FORUM_THREAD_CREATED")) {
            var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.FORUM_CHANNEL_THREAD_CREATED_PUSH_BODY_MOBILE, new Function1(var0) {
               final NotificationData $this_getContent;

               {
                  super(1);
                  this.$this_getContent = var1;
               }

               public final void invoke(RenderContext var1) {
                  q.h(var1, "$this$i18nFormat");
                  var1.getArgs().put("channelName", this.$this_getContent.getChannelName());
                  var1.getArgs().put("userUsername", this.$this_getContent.getUserUsername());
               }
            });
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
               var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_BODY_START_GAME, new Function1(var0) {
                  final NotificationData $this_getContent;

                  {
                     super(1);
                     this.$this_getContent = var1;
                  }

                  public final void invoke(RenderContext var1) {
                     q.h(var1, "$this$i18nFormat");
                     var1.getArgs().put("username", this.$this_getContent.getUserUsername());
                     var1.getArgs().put("gameName", this.$this_getContent.getActivityName());
                  }
               });
            }
         }
         break;
      case 998188116:
         if (var5.equals("MESSAGE_CREATE")) {
            val var11: Int = var0.getChannelType();
            if (var11 != null && var11 == 0
               || var11 != null && var11 == 2
               || var11 != null && var11 == 5
               || var11 != null && var11 == 10
               || var11 != null && var11 == 11
               || var11 != null && var11 == 12) {
               var var9: Int = var0.getMessageType();
               if (var9 != null && var9 == 7) {
                  var4 = getSystemMessageUserJoin-_NT-lnE(var1, var0.getUserId-wUX8bhU(), var0.getUserUsername());
               } else {
                  var9 = var0.getMessageActivityType();
                  if (var9 != null && var9 == 1) {
                     var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_MESSAGE_CREATE_GUILD_ACTIVITY_JOIN, new Function1(var0) {
                        final NotificationData $this_getContent;

                        {
                           super(1);
                           this.$this_getContent = var1;
                        }

                        public final void invoke(RenderContext var1) {
                           q.h(var1, "$this$i18nFormat");
                           var1.getArgs().put("user", this.$this_getContent.getUserUsername());
                           var1.getArgs().put("game", this.$this_getContent.getMessageApplicationName());
                        }
                     });
                  } else {
                     var4 = renderMessageContent(var0, var1, var2);
                  }
               }
            } else if (var11 != null && var11 == 3 || var11 != null && var11 == 1) {
               val var8: Int = var0.getMessageActivityType();
               if (var8 != null && var8 == 1) {
                  var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_MESSAGE_CREATE_DM_ACTIVITY_JOIN, new Function1(var0) {
                     final NotificationData $this_getContent;

                     {
                        super(1);
                        this.$this_getContent = var1;
                     }

                     public final void invoke(RenderContext var1) {
                        q.h(var1, "$this$i18nFormat");
                        var1.getArgs().put("user", this.$this_getContent.getUserUsername());
                        var1.getArgs().put("game", this.$this_getContent.getMessageApplicationName());
                     }
                  });
               } else {
                  var4 = renderMessageContent(var0, var1, var2);
               }
            }
         }
         break;
      case 1770025841:
         if (var5.equals("CALL_RING")) {
            var4 = I18nUtilsKt.i18nFormat(var1, I18nMessage.OVERLAY_FRIEND_CALLING, new Function1(var0) {
               final NotificationData $this_getContent;

               {
                  super(1);
                  this.$this_getContent = var1;
               }

               public final void invoke(RenderContext var1) {
                  q.h(var1, "$this$i18nFormat");
                  var1.getArgs().put("name", this.$this_getContent.getUserUsername());
               }
            });
         }
      default:
   }

   return (java.lang.CharSequence)var4;
}

internal fun NotificationData.getContentPendingIntent(context: Context, notificationDataMap: Map<String, String>): PendingIntent {
   q.h(var0, "<this>");
   q.h(var1, "context");
   q.h(var2, "notificationDataMap");
   val var4: java.lang.String = getTag(var0);
   val var3: StringBuilder = new StringBuilder();
   var3.append(var4);
   var3.append("content");
   return getPendingIntent(var1, var2, var3.toString());
}

internal fun NotificationData.getConversationTitle(): CharSequence? {
   q.h(var0, "<this>");
   val var1: Boolean = q.c(var0.getType(), "MESSAGE_CREATE");
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
   q.h(var0, "<this>");
   q.h(var1, "context");
   return NotificationAction.DefaultImpls.toPendingIntent$default(new DeleteAction(getTag(var0)), var1, 0, false, 6, null);
}

internal fun NotificationData.getDirectReplyAction(context: Context): Action? {
   q.h(var0, "<this>");
   q.h(var1, "context");
   if (q.c(var0.getType(), "MESSAGE_CREATE") && var0.getCanReply()) {
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
   q.h(var0, "<this>");
   val var1: java.lang.String = var0.getType();
   val var2: StringBuilder = new StringBuilder();
   var2.append("GROUP_");
   var2.append(var1);
   return var2.toString();
}

internal fun NotificationData.getIconUrl(context: Context): String {
   q.h(var0, "<this>");
   q.h(var1, "context");
   var var5: java.lang.String = var0.getType();
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
      val var6: IconUrlUtils = IconUrlUtils.INSTANCE;
      val var10: ChannelId = var0.getChannelId-qMVnFVQ();
      var5 = var0.getChannelIcon();
      val var8: Int = var0.getChannelType();
      if (var8 == null || var8 != 3) {
         var3 = false;
      }

      return IconUrlUtils.getForChannel-JYSGpIY$default(var6, var1, var10, var5, var3, null, 16, null);
   } else {
      return IconUrlUtils.getForGuild-14CJxO4$default(IconUrlUtils.INSTANCE, var0.getGuildId-qOKuAAo(), var0.getGuildIcon(), "", false, null, 24, null);
   }
}

internal fun NotificationData.getIconUrlForAvatar(context: Context): String {
   q.h(var0, "<this>");
   q.h(var1, "context");
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
   q.h(var0, "<this>");
   val var2: java.lang.String = var0.getMessageId-N_6c4I0();
   val var3: ChannelId = var0.getChannelId-qMVnFVQ();
   if (var2 != null && var3 != null && q.c(var0.getType(), "MESSAGE_CREATE")) {
      val var4: NotificationMessage = var0.getMessage();
      if (var1 != null && var4 != null) {
         val var11: JsonElement = Json.d.g(var1);
         val var9: java.util.List = i.j();
         val var5: JsonObject = var4.getAuthor();
         q.e(var5);
         val var13: java.util.List = i.y0(i.e(var5), var4.getMentions());
         val var12: ArrayList = new ArrayList(i.u(var13, 10));
         val var6: java.util.Iterator = var13.iterator();

         while (var6.hasNext()) {
            val var14: java.util.Map = r.x(var6.next() as JsonObject);
            var14.put("incomplete", g.b(java.lang.Boolean.TRUE));
            var12.add(new JsonObject(var14));
         }

         return new KvMessageEntry(var9, var12, g.o(var11), var2, var3.unbox-impl(), null);
      }

      try {
         val var10: JsonObject = getAuthor(var0);
         return new KvMessageEntry(i.j(), i.e(var10), toNotificationMessage(var0, var10), var2, var3.unbox-impl(), null);
      } catch (var7: Exception) {
         CrashReporting.captureException$default(CrashReporting.INSTANCE, var7, false, 2, null);
      }
   }

   return null;
}

internal fun NotificationData.getMarkAsReadAction(context: Context): Action? {
   q.h(var0, "<this>");
   q.h(var1, "context");
   if (!q.c(var0.getType(), "MESSAGE_CREATE")) {
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

internal fun NotificationData.getNotificationCategory(): String {
   q.h(var0, "<this>");
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
   q.h(var0, "<this>");
   return System.currentTimeMillis();
}

internal fun NotificationData.getSender(icon: Bitmap?): Person {
   var var3: Boolean;
   var var4: Person.c;
   label18: {
      q.h(var0, "<this>");
      var4 = new Person.c().f(var0.getUserUsername()).e(java.lang.String.valueOf(var0.getUserId-wUX8bhU()));
      val var5: Int = var0.getRelationshipType();
      if (var5 != null) {
         val var2: Int = var5;
         var3 = true;
         if (var2 == 1) {
            break label18;
         }
      }

      var3 = false;
   }

   var4 = var4.d(var3);
   val var6: IconCompat;
   if (var1 != null) {
      var6 = toIconCompat(var1);
   } else {
      var6 = null;
   }

   val var7: Person = var4.c(var6).a();
   q.g(var7, "build(...)");
   return var7;
}

internal fun NotificationData.getSenderForMessageNotification(icon: Bitmap?): Person? {
   q.h(var0, "<this>");
   val var2: Person;
   if (var0.isFromCurrentUser()) {
      var2 = null;
   } else {
      var2 = getSender(var0, var1);
   }

   return var2;
}

internal fun NotificationData.getShortcutInfo(context: Context, notificationDataMap: Map<String, String>, icon: Bitmap?, avatar: Bitmap?): ShortcutInfoCompat {
   q.h(var0, "<this>");
   q.h(var1, "context");
   q.h(var2, "notificationDataMap");
   return ShortcutUtilsKt.createShortcut$default(
      var1,
      java.lang.String.valueOf(var0.getChannelId-qMVnFVQ()),
      getTitle(var0, var1),
      getTitle(var0, var1),
      var3,
      i.e(getSender(var0, var4)),
      ShortcutData.Companion.createShortcutIntent(var1, "android.intent.action.VIEW", NotificationAction.Companion.getActivityClass(), getTag(var0), var2),
      0,
      64,
      null
   );
}

internal fun NotificationData.getSmallIcon(): Int {
   q.h(var0, "<this>");
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
   q.h(var0, "<this>");
   q.h(var1, "context");
   val var5: Uri;
   if (q.c(var0.getType(), "CALL_RING")) {
      val var4: StringBuilder = new StringBuilder();
      var4.append("android.resource://");
      val var6: java.lang.String = var1.getPackageName();
      val var2: Int = raw.call_ringing;
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
   val var5: java.util.List = i.m(
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

   return I18nUtilsKt.i18nFormat(var0, var5.get((int)(var3 % (long)var5.size())) as I18nMessage, new Function1(var2) {
      final java.lang.String $userName;

      {
         super(1);
         this.$userName = var1;
      }

      public final void invoke(RenderContext var1) {
         q.h(var1, "$this$i18nFormat");
         var1.getArgs().put("username", this.$userName);
      }
   });
}

public fun NotificationData.getTag(): String {
   label70: {
      q.h(var0, "<this>");
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
            break label70;
         case -1489275252:
            if (!var1.equals("GUILD_SCHEDULED_EVENT_UPDATE")) {
               break label70;
            }
            break;
         case -1327124998:
            if (var1.equals("RELATIONSHIP_ADD")) {
               var1 = var0.getType();
               val var28: UserId = var0.getUserId-wUX8bhU();
               val var11: StringBuilder = new StringBuilder();
               var11.append(var1);
               var11.append(var28);
               return var11.toString();
            }
            break label70;
         case -1263316859:
            if (!var1.equals("STAGE_INSTANCE_CREATE")) {
               break label70;
            }
            break;
         case -1237752112:
            if (var1.equals("APPLICATION_LIBRARY_INSTALL_COMPLETE")) {
               var1 = var0.getType();
               val var27: ApplicationId = var0.getApplicationId-UtIrSio();
               val var10: StringBuilder = new StringBuilder();
               var10.append(var1);
               var10.append(var27);
               return var10.toString();
            }
            break label70;
         case -437641071:
            if (!var1.equals("FORUM_THREAD_CREATED")) {
               break label70;
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
            break label70;
         case 974015250:
            if (var1.equals("ACTIVITY_START")) {
               var1 = var0.getType();
               val var25: Int = var0.getActivityType();
               val var32: java.lang.String = var0.getActivityName();
               val var8: StringBuilder = new StringBuilder();
               var8.append(var1);
               var8.append(var25);
               var8.append(var32);
               return var8.toString();
            }
            break label70;
         case 998188116:
            if (!var1.equals("MESSAGE_CREATE")) {
               break label70;
            }
            break;
         case 1471047007:
            if (var1.equals("LOCAL_NOTIFICATION")) {
               var1 = var0.getType();
               val var24: ChannelId = var0.getChannelId-qMVnFVQ();
               val var6: java.lang.String = var0.getMessageId-N_6c4I0();
               val var7: java.lang.String;
               if (var6 == null) {
                  var7 = "null";
               } else {
                  var7 = MessageId.toString-impl(var6);
               }

               val var31: StringBuilder = new StringBuilder();
               var31.append(var1);
               var31.append(var24);
               var31.append(var7);
               return var31.toString();
            }
            break label70;
         case 1770025841:
            if (var1.equals("CALL_RING")) {
               val var2: java.lang.String = var0.getType();
               val var15: ChannelId = var0.getChannelId-qMVnFVQ();
               val var4: java.lang.String = var0.getTimeReceived();
               val var3: StringBuilder = new StringBuilder();
               var3.append(var2);
               var3.append(var15);
               var3.append(var4);
               return var3.toString();
            }
         default:
            break label70;
      }

      var1 = var0.getType();
      val var12: ChannelId = var0.getChannelId-qMVnFVQ();
      val var29: StringBuilder = new StringBuilder();
      var29.append(var1);
      var29.append(var12);
      return var29.toString();
   }

   val var22: java.lang.String = var0.getType();
   val var13: StringBuilder = new StringBuilder();
   var13.append("Unknown notification type: ");
   var13.append(var22);
   var13.append(".");
   throw new IllegalArgumentException(var13.toString());
}

public fun NotificationData.getTimedMuteAction(context: Context, numMessages: Int): Action? {
   q.h(var0, "<this>");
   q.h(var1, "context");
   if (q.c(var0.getType(), "MESSAGE_CREATE") && var2 >= 2) {
      val var5: ChannelId = var0.getChannelId-qMVnFVQ();
      if (var5 != null) {
         return new NotificationCompat.Action.a(
               R.drawable.ic_notifications_off_24dp,
               I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_MUTE_1_HOUR, null, 2, null),
               NotificationAction.DefaultImpls.toPendingIntent$default(
                  new MuteAction(getTag(var0), var0.getGuildId-qOKuAAo(), var5.unbox-impl(), null), var1, 0, false, 6, null
               )
            )
            .c();
      }
   }

   return null;
}

public fun NotificationData.getTitle(context: Context): CharSequence {
   q.h(var0, "<this>");
   q.h(var1, "context");
   var var3: java.lang.String = var0.getType();
   var var6: java.lang.String;
   switch (var3.hashCode()) {
      case -1502317553:
         if (!var3.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
            return "";
         }

         val var15: java.lang.String = var0.getTitle();
         var6 = var15;
         if (var15 == null) {
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
                  return I18nUtilsKt.i18nFormat(var1, I18nMessage.GUILD_SCHEDULED_EVENT_STAGE_START_TITLE, new Function1(var0) {
                     final NotificationData $this_getTitle;

                     {
                        super(1);
                        this.$this_getTitle = var1;
                     }

                     public final void invoke(RenderContext var1) {
                        q.h(var1, "$this$i18nFormat");
                        var1.getArgs().put("guildName", this.$this_getTitle.getGuildName());
                     }
                  });
               }
            }

            return var3;
         }
      case -1327124998:
         if (!var3.equals("RELATIONSHIP_ADD")) {
            return "";
         }

         val var14: java.lang.String = var0.getUserUsername();
         var6 = var14;
         if (var14 == null) {
            return "";
         }
         break;
      case -1263316859:
         val var22: Any;
         if (!var3.equals("STAGE_INSTANCE_CREATE")) {
            var22 = "";
         } else {
            var22 = I18nUtilsKt.i18nFormat(var1, I18nMessage.STAGE_START_PUSH_NOTIFICATION_TITLE, new Function1(var0) {
               final NotificationData $this_getTitle;

               {
                  super(1);
                  this.$this_getTitle = var1;
               }

               public final void invoke(RenderContext var1) {
                  q.h(var1, "$this$i18nFormat");
                  var1.getArgs().put("guildName", this.$this_getTitle.getGuildName());
               }
            });
         }

         return (java.lang.CharSequence)var22;
      case -1237752112:
         val var21: Any;
         if (!var3.equals("APPLICATION_LIBRARY_INSTALL_COMPLETE")) {
            var21 = "";
         } else {
            var21 = I18nUtilsKt.i18nFormat$default(var1, I18nMessage.GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_TITLE, null, 2, null);
         }

         return (java.lang.CharSequence)var21;
      case -437641071:
         val var20: Any;
         if (!var3.equals("FORUM_THREAD_CREATED")) {
            var20 = "";
         } else {
            var20 = I18nUtilsKt.i18nFormat(var1, I18nMessage.FORUM_CHANNEL_THREAD_CREATED_PUSH_TITLE_MOBILE, new Function1(var0) {
               final NotificationData $this_getTitle;

               {
                  super(1);
                  this.$this_getTitle = var1;
               }

               public final void invoke(RenderContext var1) {
                  q.h(var1, "$this$i18nFormat");
                  var1.getArgs().put("guildName", this.$this_getTitle.getGuildName());
                  var1.getArgs().put("channelName", this.$this_getTitle.getParentName());
               }
            });
         }

         return (java.lang.CharSequence)var20;
      case -45642698:
         if (!var3.equals("FRIEND_SUGGESTION_CREATE")) {
            return "";
         } else {
            val var24: java.lang.CharSequence;
            if (h.v(var0.getPlatformUserUsername(), var0.getUserUsername(), false, 2, null)) {
               var24 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_FRIEND_SUGGESTION_CONTACT_TITLE, new Function1(var0) {
                  final NotificationData $this_getTitle;

                  {
                     super(1);
                     this.$this_getTitle = var1;
                  }

                  public final void invoke(RenderContext var1) {
                     q.h(var1, "$this$i18nFormat");
                     var1.getArgs().put("contact", this.$this_getTitle.getPlatformUserUsername());
                  }
               });
            } else {
               var24 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_FRIEND_SUGGESTION_TITLE, new Function1(var0) {
                  final NotificationData $this_getTitle;

                  {
                     super(1);
                     this.$this_getTitle = var1;
                  }

                  public final void invoke(RenderContext var1) {
                     q.h(var1, "$this$i18nFormat");
                     var1.getArgs().put("contact", this.$this_getTitle.getPlatformUserUsername());
                  }
               });
            }

            return var24;
         }
      case 974015250:
         if (!var3.equals("ACTIVITY_START")) {
            return "";
         } else {
            val var8: Int = var0.getActivityType();
            if (var8 == null) {
               var3 = "";
            } else {
               var3 = "";
               if (var8 == 0) {
                  return I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_TITLE_START_GAME, null, 2, null);
               }
            }

            return var3;
         }
      case 998188116:
         if (!var3.equals("MESSAGE_CREATE")) {
            return "";
         }

         val var10: Int = var0.getChannelType();
         if ((var10 == null || var10 != 0)
            && (var10 == null || var10 != 2)
            && (var10 == null || var10 != 5)
            && (var10 == null || var10 != 10)
            && (var10 == null || var10 != 11)
            && (var10 == null || var10 != 12)) {
            if (var10 != null && var10 == 1) {
               val var13: java.lang.String = var0.getUserUsername();
               var6 = var13;
               if (var13 == null) {
                  return "";
               }
               break;
            }

            if (var10 == null) {
               return "";
            }

            if (var10 != 3) {
               return "";
            }

            var3 = var0.getChannelName();
            if (var3 != null) {
               return var3;
            }

            val var12: java.lang.String = var0.getUserUsername();
            var6 = var12;
            if (var12 == null) {
               return "";
            }
            break;
         }

         val var11: java.lang.String = var0.getGuildName();
         val var7: java.lang.String = var0.getChannelName();
         val var18: StringBuilder = new StringBuilder();
         var18.append(var11);
         var18.append(" #");
         var18.append(var7);
         return var18.toString();
      case 1770025841:
         if (!var3.equals("CALL_RING")) {
            return "";
         }

         val var17: Int = var0.getChannelType();
         if (var17 != null && var17 == 1) {
            return I18nUtilsKt.i18nFormat$default(var1, I18nMessage.INCOMING_CALL, null, 2, null);
         }

         val var9: java.lang.String = var0.getChannelName();
         var6 = var9;
         if (var9 == null) {
            return "";
         }
         break;
      default:
         return "";
   }

   return var6;
}

internal fun NotificationData.isConversation(): Boolean {
   q.h(var0, "<this>");
   return q.c(var0.getType(), "MESSAGE_CREATE");
}

internal fun NotificationData.isGroupConversation(): Boolean {
   q.h(var0, "<this>");
   if (q.c(var0.getType(), "MESSAGE_CREATE")) {
      val var2: Int = var0.getChannelType();
      if (var2 == null || var2 != 1) {
         return true;
      }
   }

   return false;
}

private fun renderLogAwareNotificationMessageContent(forLogs: Boolean, messageContent: String?): CharSequence? {
   if (var1 == null || var1.length() == 0) {
      return var1;
   } else {
      return if (var0) "<Message>" else RenderNotificationMessageContentKt.renderNotificationMessageContent(var1);
   }
}

internal fun NotificationData.renderMessageContent(context: Context, forLogs: Boolean): CharSequence? {
   q.h(var0, "<this>");
   q.h(var1, "context");
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
      var7 = I18nUtilsKt.i18nFormat(var1, I18nMessage.STICKER_NOTIFICATION_BODY, new Function1(var4) {
         final Sticker $sticker;

         {
            super(1);
            this.$sticker = var1;
         }

         public final void invoke(RenderContext var1) {
            q.h(var1, "$this$i18nFormat");
            var1.getArgs().put("stickerName", this.$sticker.getName());
         }
      });
   } else {
      val var10: Int = var0.getMessageReferenceType();
      if (var10 != null && var10 == 1) {
         var7 = I18nUtilsKt.i18nFormat$default(var1, I18nMessage.MESSAGE_FORWARDED_NOTIFICATION_BODY, null, 2, null);
      } else if (var0.getActivityInstanceId() == null || var0.getMessageContent() != null && !q.c(var0.getMessageContent(), "")) {
         if (MessageFlagKt.hasMessageFlag(var0.getMessageFlags(), MessageFlag.IS_VOICE_MESSAGE)) {
            var7 = I18nUtilsKt.i18nFormat$default(var1, I18nMessage.VOICE_MESSAGES_SENT_NOTIFICATION, null, 2, null);
         } else {
            val var6: NotificationMessage = var0.getMessage();
            var var11: Poll = null;
            if (var6 != null) {
               var11 = var6.getPoll();
            }

            if (var11 != null) {
               var7 = I18nUtilsKt.i18nFormat(var1, I18nMessage.POLL_SENT_NOTIFICATION, new Function1(var0) {
                  final NotificationData $this_renderMessageContent;

                  {
                     super(1);
                     this.$this_renderMessageContent = var1;
                  }

                  public final void invoke(RenderContext var1) {
                     var var3: java.util.Map;
                     label15: {
                        q.h(var1, "$this$i18nFormat");
                        var3 = var1.getArgs();
                        val var4: NotificationMessage = this.$this_renderMessageContent.getMessage();
                        if (var4 != null) {
                           val var5: Poll = var4.getPoll();
                           if (var5 != null) {
                              val var6: PollMedia = var5.getQuestion();
                              if (var6 != null) {
                                 val var2: java.lang.String = var6.getText();
                                 var7 = var2;
                                 if (var2 != null) {
                                    break label15;
                                 }
                              }
                           }
                        }

                        var7 = "???";
                     }

                     var3.put("question", var7);
                  }
               });
            } else {
               val var12: Int = var0.getMessageType();
               if (var12 != null && var12 == 46) {
                  var7 = I18nUtilsKt.i18nFormat(var1, I18nMessage.POLL_RESULTS_NOTIFICATION, new Function1(var9) {
                     final Embed $embed;

                     {
                        super(1);
                        this.$embed = var1;
                     }

                     public final void invoke(RenderContext var1) {
                        var var3: java.util.Map;
                        label27: {
                           q.h(var1, "$this$i18nFormat");
                           var3 = var1.getArgs();
                           if (this.$embed != null) {
                              val var5: java.util.List = this.$embed.getFields();
                              if (var5 != null) {
                                 val var2: java.util.Iterator = var5.iterator();

                                 do {
                                    if (!var2.hasNext()) {
                                       var6 = null;
                                       break;
                                    }

                                    var6 = var2.next();
                                 } while (!q.c(((EmbedField)var6).getName(), "poll_question_text"));

                                 val var7: EmbedField = var6 as EmbedField;
                                 if (var6 as EmbedField != null) {
                                    val var9: java.lang.String = var7.getValue();
                                    var8 = var9;
                                    if (var9 != null) {
                                       break label27;
                                    }
                                 }
                              }
                           }

                           var8 = "";
                        }

                        var3.put("question", var8);
                     }
                  });
               } else {
                  var7 = renderLogAwareNotificationMessageContent(var2, var0.getMessageContent());
               }
            }
         }
      } else {
         var7 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_MESSAGE_ACTIVITY_INSTANCE, new Function1(var0) {
            final NotificationData $this_renderMessageContent;

            {
               super(1);
               this.$this_renderMessageContent = var1;
            }

            public final void invoke(RenderContext var1) {
               q.h(var1, "$this$i18nFormat");
               var1.getArgs().put("user", this.$this_renderMessageContent.getUserUsername());
            }
         });
      }
   }

   return var7;
}

internal fun NotificationData.shouldUseBigText(): Boolean {
   q.h(var0, "<this>");
   val var1: Boolean;
   if (q.c(var0.getType(), "GENERIC_PUSH_NOTIFICATION_SENT") && q.c(var0.getExpandSubtitle(), java.lang.Boolean.TRUE)) {
      var1 = true;
   } else {
      var1 = false;
   }

   return var1;
}

private fun Bitmap.toIconCompat(): IconCompat {
   val var1: IconCompat = IconCompat.h(var0);
   q.g(var1, "createWithBitmap(...)");
   return var1;
}

public fun NotificationData.toNotificationMessage(author: JsonObject): JsonObject {
   q.h(var0, "<this>");
   q.h(var1, "author");
   val var7: java.lang.String = var0.getMessageContent();
   q.e(var7);
   val var8: java.lang.Long = var0.getMessageFlags();
   val var3: Long;
   if (var8 != null) {
      var3 = var8;
   } else {
      var3 = 0L;
   }

   val var12: Int = var0.getMessageType();
   q.e(var12);
   val var2: Int = var12;
   val var13: java.lang.String = var0.getMessageId-N_6c4I0();
   q.e(var13);
   val var9: ChannelId = var0.getChannelId-qMVnFVQ();
   q.e(var9);
   val var5: Long = var9.unbox-impl();
   val var14: GuildId = var0.getGuildId-qOKuAAo();
   val var10: java.lang.String = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS", Locale.getDefault()).format(new Date());
   val var11: p = new p();
   f.c(var11, "content", var7);
   f.b(var11, "flags", var3);
   f.b(var11, "type", var2);
   f.c(var11, "id", MessageId.toString-impl(var13));
   f.c(var11, "channel_id", ChannelId.toString-impl(var5));
   f.c(var11, "timestamp", var10);
   var11.b("author", var1);
   if (var14 != null) {
      f.c(var11, "guild_id", GuildId.toString-impl(var14.unbox-impl()));
   }

   return var11.a();
}
