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
import androidx.core.app.NotificationCompat.Action.a
import androidx.core.app.Person.c
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
import eh.w
import fh.s
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Date
import java.util.Locale
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.f
import kotlinx.serialization.json.g

public fun NotificationData.getAuthor(): JsonObject {
   r.h(var0, "<this>");
   val var3: java.lang.String = var0.getUserAvatar();
   val var4: UserId = var0.getUserId-wUX8bhU();
   r.e(var4);
   val var1: Long = var4.unbox-impl();
   val var6: java.lang.String = var0.getUserUsername();
   r.e(var6);
   val var5: kotlinx.serialization.json.r = new kotlinx.serialization.json.r();
   if (var3 != null) {
      f.c(var5, "avatar", var3);
   }

   f.c(var5, "id", UserId.toString-impl(var1));
   f.c(var5, "username", var6);
   f.c(var5, "globalName", var0.getUserGlobalName());
   f.a(var5, "incomplete", java.lang.Boolean.TRUE);
   return var5.a();
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
      val var8: ChannelId = var0.getChannelId-qMVnFVQ();
      if (var8 != null) {
         val var6: Long = var8.unbox-impl();
         val var10: PendingIntent;
         if (var2) {
            var3 = s.x(var3);
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
         val var17: SpannableStringBuilder = new SpannableStringBuilder();
         val var9: StyleSpan = new StyleSpan(1);
         var var4: Int = var17.length();
         val var12: ForegroundColorSpan = new ForegroundColorSpan(var5);
         var5 = var17.length();
         var17.append(var14);
         var17.setSpan(var12, var5, var17.length(), 17);
         var17.setSpan(var9, var4, var17.length(), 17);
         if (var2) {
            var4 = R.drawable.ic_call_24dp;
         } else {
            var4 = R.drawable.ic_call_disconnect_24dp;
         }

         return new a(var4, var17, var10).c();
      } else {
         return null;
      }
   }
}

public fun NotificationData.getContent(context: Context, forLogs: Boolean): CharSequence? {
   r.h(var0, "<this>");
   r.h(var1, "context");
   val var7: java.lang.String = var0.getType();
   val var5: Int = var7.hashCode();
   var var6: Any = "";
   var var3: Boolean = false;
   switch (var5) {
      case -1502317553:
         if (var7.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
            val var9: java.lang.String = var0.getSubtitle();
            if (var9 != null) {
               var6 = var9;
            }
         }
         break;
      case -1489275252:
         if (var7.equals("GUILD_SCHEDULED_EVENT_UPDATE")) {
            val var21: Int = var0.getGuildScheduledEventEntityType();
            if (var21 != null && var21 == 2 || var21 != null && var21 == 1) {
               var3 = true;
            }

            if (var3) {
               var6 = I18nUtilsKt.i18nFormat(var1, I18nMessage.GUILD_SCHEDULED_EVENT_STAGE_START_BODY, new Function1<RenderContext, Unit>(var0) {
                  final NotificationData $this_getContent;

                  {
                     super(1);
                     this.$this_getContent = var1;
                  }

                  public final void invoke(RenderContext var1) {
                     r.h(var1, "$this$i18nFormat");
                     var1.getArgs().put("topic", this.$this_getContent.getStageInstanceTopic());
                     var1.getArgs().put("username", this.$this_getContent.getUserUsername());
                  }
               });
            } else if (var21 != null && var21 == 3) {
               var6 = I18nUtilsKt.i18nFormat(var1, I18nMessage.GUILD_SCHEDULED_EVENT_EXTERNAL_START_BODY, new Function1<RenderContext, Unit>(var0) {
                  final NotificationData $this_getContent;

                  {
                     super(1);
                     this.$this_getContent = var1;
                  }

                  public final void invoke(RenderContext var1) {
                     r.h(var1, "$this$i18nFormat");
                     var1.getArgs().put("topic", this.$this_getContent.getStageInstanceTopic());
                  }
               });
            }
         }
         break;
      case -1327124998:
         if (var7.equals("RELATIONSHIP_ADD")) {
            val var8: Int = var0.getRelationshipType();
            if (var8 != null && var8 == 1) {
               var6 = I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_ACCEPTED_FRIEND_REQUEST, null, 2, null);
            } else if (var8 != null && var8 == 3) {
               var6 = I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_PENDING_FRIEND_REQUEST, null, 2, null);
            }
         }
         break;
      case -1263316859:
         if (var7.equals("STAGE_INSTANCE_CREATE")) {
            var6 = I18nUtilsKt.i18nFormat(var1, I18nMessage.STAGE_START_PUSH_NOTIFICATION_BODY, new Function1<RenderContext, Unit>(var0) {
               final NotificationData $this_getContent;

               {
                  super(1);
                  this.$this_getContent = var1;
               }

               public final void invoke(RenderContext var1) {
                  r.h(var1, "$this$i18nFormat");
                  var1.getArgs().put("username", this.$this_getContent.getUserUsername());
                  var1.getArgs().put("topic", this.$this_getContent.getStageInstanceTopic());
               }
            });
         }
         break;
      case -1237752112:
         if (var7.equals("APPLICATION_LIBRARY_INSTALL_COMPLETE")) {
            var6 = I18nUtilsKt.i18nFormat(var1, I18nMessage.GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_BODY, new Function1<RenderContext, Unit>(var0) {
               final NotificationData $this_getContent;

               {
                  super(1);
                  this.$this_getContent = var1;
               }

               public final void invoke(RenderContext var1) {
                  r.h(var1, "$this$i18nFormat");
                  var1.getArgs().put("name", this.$this_getContent.getApplicationName());
               }
            });
         }
         break;
      case -437641071:
         if (var7.equals("FORUM_THREAD_CREATED")) {
            var6 = I18nUtilsKt.i18nFormat(var1, I18nMessage.FORUM_CHANNEL_THREAD_CREATED_PUSH_BODY_MOBILE, new Function1<RenderContext, Unit>(var0) {
               final NotificationData $this_getContent;

               {
                  super(1);
                  this.$this_getContent = var1;
               }

               public final void invoke(RenderContext var1) {
                  r.h(var1, "$this$i18nFormat");
                  var1.getArgs().put("channelName", this.$this_getContent.getChannelName());
                  var1.getArgs().put("userUsername", this.$this_getContent.getUserUsername());
               }
            });
         }
         break;
      case -45642698:
         if (var7.equals("FRIEND_SUGGESTION_CREATE")) {
            var6 = I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_FRIEND_SUGGESTION_BODY, null, 2, null);
         }
         break;
      case 974015250:
         if (var7.equals("ACTIVITY_START")) {
            val var20: Int = var0.getActivityType();
            if (var20 != null && var20 == 0) {
               var6 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_BODY_START_GAME, new Function1<RenderContext, Unit>(var0) {
                  final NotificationData $this_getContent;

                  {
                     super(1);
                     this.$this_getContent = var1;
                  }

                  public final void invoke(RenderContext var1) {
                     r.h(var1, "$this$i18nFormat");
                     var1.getArgs().put("username", this.$this_getContent.getUserUsername());
                     var1.getArgs().put("gameName", this.$this_getContent.getActivityName());
                  }
               });
            }
         }
         break;
      case 998188116:
         if (var7.equals("MESSAGE_CREATE")) {
            val var19: Int = var0.getChannelType();
            if ((var19 == null || var19 != 0) && (var19 == null || var19 != 2)) {
               var3 = false;
            } else {
               var3 = true;
            }

            if (!var3 && (var19 == null || var19 != 5)) {
               var3 = false;
            } else {
               var3 = true;
            }

            if (!var3 && (var19 == null || var19 != 10)) {
               var3 = false;
            } else {
               var3 = true;
            }

            if (!var3 && (var19 == null || var19 != 11)) {
               var3 = false;
            } else {
               var3 = true;
            }

            if (!var3 && (var19 == null || var19 != 12)) {
               var3 = false;
            } else {
               var3 = true;
            }

            if (var3) {
               var var16: Int = var0.getMessageType();
               if (var16 != null && var16 == 7) {
                  var6 = getSystemMessageUserJoin-_NT-lnE(var1, var0.getUserId-wUX8bhU(), var0.getUserUsername());
               } else {
                  var16 = var0.getMessageActivityType();
                  if (var16 != null && var16 == 1) {
                     var6 = I18nUtilsKt.i18nFormat(
                        var1, I18nMessage.NOTIFICATION_MESSAGE_CREATE_GUILD_ACTIVITY_JOIN, new Function1<RenderContext, Unit>(var0) {
                           final NotificationData $this_getContent;

                           {
                              super(1);
                              this.$this_getContent = var1;
                           }

                           public final void invoke(RenderContext var1) {
                              r.h(var1, "$this$i18nFormat");
                              var1.getArgs().put("user", this.$this_getContent.getUserUsername());
                              var1.getArgs().put("game", this.$this_getContent.getMessageApplicationName());
                           }
                        }
                     );
                  } else {
                     var6 = renderMessageContent(var0, var1, var2);
                  }
               }
            } else {
               label250: {
                  if (var19 == null || var19 != 3) {
                     if (var19 == null) {
                        var3 = false;
                        break label250;
                     }

                     var3 = false;
                     if (var19 != 1) {
                        break label250;
                     }
                  }

                  var3 = true;
               }

               if (var3) {
                  val var18: Int = var0.getMessageActivityType();
                  if (var18 != null && var18 == 1) {
                     var6 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_MESSAGE_CREATE_DM_ACTIVITY_JOIN, new Function1<RenderContext, Unit>(var0) {
                        final NotificationData $this_getContent;

                        {
                           super(1);
                           this.$this_getContent = var1;
                        }

                        public final void invoke(RenderContext var1) {
                           r.h(var1, "$this$i18nFormat");
                           var1.getArgs().put("user", this.$this_getContent.getUserUsername());
                           var1.getArgs().put("game", this.$this_getContent.getMessageApplicationName());
                        }
                     });
                  } else {
                     var6 = renderMessageContent(var0, var1, var2);
                  }
               }
            }
         }
         break;
      case 1770025841:
         if (var7.equals("CALL_RING")) {
            var6 = I18nUtilsKt.i18nFormat(var1, I18nMessage.OVERLAY_FRIEND_CALLING, new Function1<RenderContext, Unit>(var0) {
               final NotificationData $this_getContent;

               {
                  super(1);
                  this.$this_getContent = var1;
               }

               public final void invoke(RenderContext var1) {
                  r.h(var1, "$this$i18nFormat");
                  var1.getArgs().put("name", this.$this_getContent.getUserUsername());
               }
            });
         }
      default:
   }

   return (java.lang.CharSequence)var6;
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
   val var3: Boolean = r.c(var0.getType(), "MESSAGE_CREATE");
   var var4: java.lang.String = null;
   if (var3) {
      val var6: Int = var0.getChannelType();
      var var1: Boolean;
      if ((var6 == null || var6 != 0) && (var6 == null || var6 != 2)) {
         var1 = false;
      } else {
         var1 = true;
      }

      if (!var1 && (var6 == null || var6 != 5)) {
         var1 = false;
      } else {
         var1 = true;
      }

      if (!var1 && (var6 == null || var6 != 10)) {
         var1 = false;
      } else {
         var1 = true;
      }

      if (!var1 && (var6 == null || var6 != 11)) {
         var1 = false;
      } else {
         var1 = true;
      }

      label64: {
         if (!var1) {
            if (var6 == null) {
               var1 = false;
               break label64;
            }

            var1 = false;
            if (var6 != 12) {
               break label64;
            }
         }

         var1 = true;
      }

      val var8: java.lang.String;
      if (var1) {
         var4 = var0.getGuildName();
         val var7: java.lang.String = var0.getChannelName();
         val var14: StringBuilder = new StringBuilder();
         var14.append(var4);
         var14.append(" #");
         var14.append(var7);
         var8 = var14.toString();
      } else {
         if (var6 == null) {
            return null;
         }

         if (var6 != 3) {
            return null;
         }

         var4 = var0.getChannelName();
         if (var4 != null) {
            return var4;
         }

         var8 = var0.getUserUsername();
      }

      var4 = var8;
   }

   return var4;
}

internal fun NotificationData.getDeletePendingIntent(context: Context): PendingIntent {
   r.h(var0, "<this>");
   r.h(var1, "context");
   return NotificationAction.DefaultImpls.toPendingIntent$default(new DeleteAction(getTag(var0)), var1, 0, false, 6, null);
}

internal fun NotificationData.getDirectReplyAction(context: Context): Action? {
   r.h(var0, "<this>");
   r.h(var1, "context");
   if (r.c(var0.getType(), "MESSAGE_CREATE") && var0.getCanReply()) {
      val var4: ChannelId = var0.getChannelId-qMVnFVQ();
      if (var4 != null) {
         return new a(
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
   val var1: java.lang.String = var0.getType();
   val var2: StringBuilder = new StringBuilder();
   var2.append("GROUP_");
   var2.append(var1);
   return var2.toString();
}

internal fun NotificationData.getIconUrl(context: Context): String {
   r.h(var0, "<this>");
   r.h(var1, "context");
   val var5: java.lang.String = var0.getType();
   switch (var5.hashCode()) {
      case -1502317553:
         val var21: java.lang.String;
         if (!var5.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
            var21 = "";
         } else {
            var21 = var0.getIconUrl();
            if (var21 == null) {
               return "";
            }
         }

         return var21;
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
         val var18: java.lang.String;
         if (!var5.equals("FRIEND_SUGGESTION_CREATE")) {
            var18 = "";
         } else {
            var18 = IconUrlUtils.getForUser-_fRzTXg$default(
               IconUrlUtils.INSTANCE, var1, var0.getUserId-wUX8bhU(), var0.getUserAvatar(), null, false, null, 40, null
            );
         }

         return var18;
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

   val var14: Int = var0.getChannelType();
   if (var14 != null && var14 == 1) {
      return IconUrlUtils.getForUser-_fRzTXg$default(
         IconUrlUtils.INSTANCE, var1, var0.getUserId-wUX8bhU(), var0.getUserAvatar(), var0.getUserDiscriminator(), false, null, 32, null
      );
   } else {
      var var9: Boolean;
      if ((var14 == null || var14 != 0) && (var14 == null || var14 != 2)) {
         var9 = false;
      } else {
         var9 = true;
      }

      if (!var9 && (var14 == null || var14 != 5)) {
         var9 = false;
      } else {
         var9 = true;
      }

      if (!var9 && (var14 == null || var14 != 10)) {
         var9 = false;
      } else {
         var9 = true;
      }

      if (!var9 && (var14 == null || var14 != 11)) {
         var9 = false;
      } else {
         var9 = true;
      }

      if (!var9 && (var14 == null || var14 != 12)) {
         var9 = false;
      } else {
         var9 = true;
      }

      val var7: java.lang.String;
      if (var9) {
         var7 = IconUrlUtils.getForGuild-14CJxO4$default(IconUrlUtils.INSTANCE, var0.getGuildId-qOKuAAo(), var0.getGuildIcon(), "", false, null, 24, null);
      } else {
         val var16: IconUrlUtils = IconUrlUtils.INSTANCE;
         val var6: ChannelId = var0.getChannelId-qMVnFVQ();
         val var15: java.lang.String = var0.getChannelIcon();
         val var8: Int = var0.getChannelType();
         val var3: Boolean;
         if (var8 != null && var8 == 3) {
            var3 = true;
         } else {
            var3 = false;
         }

         var7 = IconUrlUtils.getForChannel-JYSGpIY$default(var16, var1, var6, var15, var3, null, 16, null);
      }

      return var7;
   }
}

internal fun NotificationData.getIconUrlForAvatar(context: Context): String {
   r.h(var0, "<this>");
   r.h(var1, "context");
   val var4: IconUrlUtils = IconUrlUtils.INSTANCE;
   var var3: java.lang.String = IconUrlUtils.getForGuildMember-2tNb6hE$default(
      IconUrlUtils.INSTANCE, var0.getUserGuildAvatar(), var0.getGuildId-qOKuAAo(), var0.getUserId-wUX8bhU(), null, false, 24, null
   );
   val var2: Boolean;
   if (var3.length() == 0) {
      var2 = true;
   } else {
      var2 = false;
   }

   if (var2) {
      var3 = IconUrlUtils.getForUser-_fRzTXg$default(
         var4, var1, var0.getUserId-wUX8bhU(), var0.getUserAvatar(), var0.getUserDiscriminator(), false, null, 32, null
      );
   }

   return var3;
}

public fun NotificationData.getKvMessage(rawMessage: String?): KvMessageEntry? {
   r.h(var0, "<this>");
   val var3: java.lang.String = var0.getMessageId-N_6c4I0();
   val var2: ChannelId = var0.getChannelId-qMVnFVQ();
   if (var3 != null && var2 != null && r.c(var0.getType(), "MESSAGE_CREATE")) {
      val var4: NotificationMessage = var0.getMessage();
      if (var1 != null && var4 != null) {
         val var9: JsonElement = Json.d.g(var1);
         val var11: java.util.List = h.i();
         val var5: JsonObject = var4.getAuthor();
         r.e(var5);
         val var13: java.util.List = h.v0(h.d(var5), var4.getMentions());
         val var12: ArrayList = new ArrayList(h.t(var13, 10));
         val var6: java.util.Iterator = var13.iterator();

         while (var6.hasNext()) {
            val var14: java.util.Map = s.x(var6.next() as JsonObject);
            var14.put("incomplete", g.b(java.lang.Boolean.TRUE));
            var12.add(new JsonObject(var14));
         }

         return new KvMessageEntry(var11, var12, g.o(var9), var3, var2.unbox-impl(), null);
      }

      try {
         val var10: JsonObject = getAuthor(var0);
         return new KvMessageEntry(h.i(), h.d(var10), toNotificationMessage(var0, var10), var3, var2.unbox-impl(), null);
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
            new a(
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
   r.h(var0, "<this>");
   val var1: java.lang.String = var0.getType();
   switch (var1.hashCode()) {
      case -1502317553:
         if (var1.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
            return "social";
         }
         break;
      case -1489275252:
         if (var1.equals("GUILD_SCHEDULED_EVENT_UPDATE")) {
            return "social";
         }
         break;
      case -1327124998:
         if (var1.equals("RELATIONSHIP_ADD")) {
            return "social";
         }
         break;
      case -1263316859:
         if (var1.equals("STAGE_INSTANCE_CREATE")) {
            return "social";
         }
         break;
      case -1237752112:
         if (var1.equals("APPLICATION_LIBRARY_INSTALL_COMPLETE")) {
            return "progress";
         }
         break;
      case -437641071:
         if (var1.equals("FORUM_THREAD_CREATED")) {
            return "social";
         }
         break;
      case 974015250:
         if (var1.equals("ACTIVITY_START")) {
            return "social";
         }
         break;
      case 1471047007:
         if (var1.equals("LOCAL_NOTIFICATION")) {
            return "status";
         }
         break;
      case 1770025841:
         if (var1.equals("CALL_RING")) {
            return "call";
         }
      default:
   }

   return "msg";
}

private fun getPendingIntent(context: Context, notificationDataMap: Map<String, String>, tag: String): PendingIntent {
   return NotificationAction.DefaultImpls.toPendingIntent$default(new ContentAction(var2, var1), var0, 0, true, 2, null);
}

internal fun NotificationData.getSendTime(): Long {
   r.h(var0, "<this>");
   return System.currentTimeMillis();
}

internal fun NotificationData.getSender(icon: Bitmap?): Person {
   var var3: Boolean;
   var var4: c;
   label18: {
      r.h(var0, "<this>");
      var4 = new c().f(var0.getUserUsername()).e(java.lang.String.valueOf(var0.getUserId-wUX8bhU()));
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
   r.g(var7, "Builder()\n        .setNa…ompat())\n        .build()");
   return var7;
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
      h.d(getSender(var0, var4)),
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
      val var3: java.lang.String = var1.getPackageName();
      val var2: Int = raw.call_ringing;
      val var6: StringBuilder = new StringBuilder();
      var6.append(var3);
      var6.append("/");
      var6.append(var2);
      var4.append(var6.toString());
      var5 = Uri.parse(var4.toString());
   } else {
      var5 = null;
   }

   return var5;
}

private fun getSystemMessageUserJoin(context: Context, userId: UserId?, userName: String?): CharSequence {
   val var5: java.util.List = h.l(
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

   return I18nUtilsKt.i18nFormat(var0, var5.get((int)(var3 % (long)var5.size())) as I18nMessage, new Function1<RenderContext, Unit>(var2) {
      final java.lang.String $userName;

      {
         super(1);
         this.$userName = var1;
      }

      public final void invoke(RenderContext var1) {
         r.h(var1, "$this$i18nFormat");
         var1.getArgs().put("username", this.$userName);
      }
   });
}

public fun NotificationData.getTag(): String {
   label70: {
      r.h(var0, "<this>");
      var var1: java.lang.String = var0.getType();
      switch (var1.hashCode()) {
         case -1502317553:
            if (var1.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
               var1 = var0.getType();
               val var14: java.lang.String = var0.getDeeplink();
               val var30: StringBuilder = new StringBuilder();
               var30.append(var1);
               var30.append(var14);
               return var30.toString();
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
               val var11: UserId = var0.getUserId-wUX8bhU();
               val var28: StringBuilder = new StringBuilder();
               var28.append(var1);
               var28.append(var11);
               return var28.toString();
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
               val var25: java.lang.String = var0.getType();
               val var17: Int = var0.getActivityType();
               val var8: java.lang.String = var0.getActivityName();
               val var32: StringBuilder = new StringBuilder();
               var32.append(var25);
               var32.append(var17);
               var32.append(var8);
               return var32.toString();
            }
            break label70;
         case 998188116:
            if (!var1.equals("MESSAGE_CREATE")) {
               break label70;
            }
            break;
         case 1471047007:
            if (var1.equals("LOCAL_NOTIFICATION")) {
               val var24: java.lang.String = var0.getType();
               val var16: ChannelId = var0.getChannelId-qMVnFVQ();
               val var6: java.lang.String = var0.getMessageId-N_6c4I0();
               val var7: java.lang.String;
               if (var6 == null) {
                  var7 = "null";
               } else {
                  var7 = MessageId.toString-impl(var6);
               }

               val var31: StringBuilder = new StringBuilder();
               var31.append(var24);
               var31.append(var16);
               var31.append(var7);
               return var31.toString();
            }
            break label70;
         case 1770025841:
            if (var1.equals("CALL_RING")) {
               var1 = var0.getType();
               val var2: ChannelId = var0.getChannelId-qMVnFVQ();
               val var4: java.lang.String = var0.getTimeReceived();
               val var3: StringBuilder = new StringBuilder();
               var3.append(var1);
               var3.append(var2);
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
   r.h(var0, "<this>");
   r.h(var1, "context");
   if (r.c(var0.getType(), "MESSAGE_CREATE") && var2 >= 2) {
      val var5: ChannelId = var0.getChannelId-qMVnFVQ();
      if (var5 != null) {
         return new a(
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
   r.h(var0, "<this>");
   r.h(var1, "context");
   var var4: java.lang.String = var0.getType();
   var var7: java.lang.String;
   switch (var4.hashCode()) {
      case -1502317553:
         if (!var4.equals("GENERIC_PUSH_NOTIFICATION_SENT")) {
            return "";
         }

         val var16: java.lang.String = var0.getTitle();
         var7 = var16;
         if (var16 == null) {
            return "";
         }
         break;
      case -1489275252:
         if (!var4.equals("GUILD_SCHEDULED_EVENT_UPDATE")) {
            return "";
         } else {
            val var6: Int = var0.getGuildScheduledEventEntityType();
            if (var6 == null) {
               var4 = "";
            } else {
               var4 = "";
               if (var6 == 1) {
                  return I18nUtilsKt.i18nFormat(var1, I18nMessage.GUILD_SCHEDULED_EVENT_STAGE_START_TITLE, new Function1<RenderContext, Unit>(var0) {
                     final NotificationData $this_getTitle;

                     {
                        super(1);
                        this.$this_getTitle = var1;
                     }

                     public final void invoke(RenderContext var1) {
                        r.h(var1, "$this$i18nFormat");
                        var1.getArgs().put("guildName", this.$this_getTitle.getGuildName());
                     }
                  });
               }
            }

            return var4;
         }
      case -1327124998:
         if (!var4.equals("RELATIONSHIP_ADD")) {
            return "";
         }

         val var15: java.lang.String = var0.getUserUsername();
         var7 = var15;
         if (var15 == null) {
            return "";
         }
         break;
      case -1263316859:
         val var28: Any;
         if (!var4.equals("STAGE_INSTANCE_CREATE")) {
            var28 = "";
         } else {
            var28 = I18nUtilsKt.i18nFormat(var1, I18nMessage.STAGE_START_PUSH_NOTIFICATION_TITLE, new Function1<RenderContext, Unit>(var0) {
               final NotificationData $this_getTitle;

               {
                  super(1);
                  this.$this_getTitle = var1;
               }

               public final void invoke(RenderContext var1) {
                  r.h(var1, "$this$i18nFormat");
                  var1.getArgs().put("guildName", this.$this_getTitle.getGuildName());
               }
            });
         }

         return (java.lang.CharSequence)var28;
      case -1237752112:
         val var27: Any;
         if (!var4.equals("APPLICATION_LIBRARY_INSTALL_COMPLETE")) {
            var27 = "";
         } else {
            var27 = I18nUtilsKt.i18nFormat$default(var1, I18nMessage.GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_TITLE, null, 2, null);
         }

         return (java.lang.CharSequence)var27;
      case -437641071:
         val var26: Any;
         if (!var4.equals("FORUM_THREAD_CREATED")) {
            var26 = "";
         } else {
            var26 = I18nUtilsKt.i18nFormat(var1, I18nMessage.FORUM_CHANNEL_THREAD_CREATED_PUSH_TITLE_MOBILE, new Function1<RenderContext, Unit>(var0) {
               final NotificationData $this_getTitle;

               {
                  super(1);
                  this.$this_getTitle = var1;
               }

               public final void invoke(RenderContext var1) {
                  r.h(var1, "$this$i18nFormat");
                  var1.getArgs().put("guildName", this.$this_getTitle.getGuildName());
                  var1.getArgs().put("channelName", this.$this_getTitle.getParentName());
               }
            });
         }

         return (java.lang.CharSequence)var26;
      case -45642698:
         if (!var4.equals("FRIEND_SUGGESTION_CREATE")) {
            return "";
         } else {
            val var30: java.lang.CharSequence;
            if (kotlin.text.f.v(var0.getPlatformUserUsername(), var0.getUserUsername(), false, 2, null)) {
               var30 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_FRIEND_SUGGESTION_CONTACT_TITLE, new Function1<RenderContext, Unit>(var0) {
                  final NotificationData $this_getTitle;

                  {
                     super(1);
                     this.$this_getTitle = var1;
                  }

                  public final void invoke(RenderContext var1) {
                     r.h(var1, "$this$i18nFormat");
                     var1.getArgs().put("contact", this.$this_getTitle.getPlatformUserUsername());
                  }
               });
            } else {
               var30 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_FRIEND_SUGGESTION_TITLE, new Function1<RenderContext, Unit>(var0) {
                  final NotificationData $this_getTitle;

                  {
                     super(1);
                     this.$this_getTitle = var1;
                  }

                  public final void invoke(RenderContext var1) {
                     r.h(var1, "$this$i18nFormat");
                     var1.getArgs().put("contact", this.$this_getTitle.getPlatformUserUsername());
                  }
               });
            }

            return var30;
         }
      case 974015250:
         if (!var4.equals("ACTIVITY_START")) {
            return "";
         } else {
            val var9: Int = var0.getActivityType();
            if (var9 == null) {
               var4 = "";
            } else {
               var4 = "";
               if (var9 == 0) {
                  return I18nUtilsKt.i18nFormat$default(var1, I18nMessage.NOTIFICATION_TITLE_START_GAME, null, 2, null);
               }
            }

            return var4;
         }
      case 998188116:
         if (!var4.equals("MESSAGE_CREATE")) {
            return "";
         }

         val var11: Int = var0.getChannelType();
         var var17: Boolean;
         if ((var11 == null || var11 != 0) && (var11 == null || var11 != 2)) {
            var17 = false;
         } else {
            var17 = true;
         }

         if (!var17 && (var11 == null || var11 != 5)) {
            var17 = false;
         } else {
            var17 = true;
         }

         if (!var17 && (var11 == null || var11 != 10)) {
            var17 = false;
         } else {
            var17 = true;
         }

         if (!var17 && (var11 == null || var11 != 11)) {
            var17 = false;
         } else {
            var17 = true;
         }

         label145: {
            if (!var17) {
               if (var11 == null) {
                  var17 = false;
                  break label145;
               }

               var17 = false;
               if (var11 != 12) {
                  break label145;
               }
            }

            var17 = true;
         }

         if (var17) {
            val var12: java.lang.String = var0.getGuildName();
            val var8: java.lang.String = var0.getChannelName();
            val var24: StringBuilder = new StringBuilder();
            var24.append(var12);
            var24.append(" #");
            var24.append(var8);
            var7 = var24.toString();
         } else if (var11 != null && var11 == 1) {
            val var14: java.lang.String = var0.getUserUsername();
            var7 = var14;
            if (var14 == null) {
               return "";
            }
         } else {
            if (var11 == null) {
               return "";
            }

            if (var11 != 3) {
               return "";
            }

            var4 = var0.getChannelName();
            if (var4 != null) {
               return var4;
            }

            val var13: java.lang.String = var0.getUserUsername();
            var7 = var13;
            if (var13 == null) {
               return "";
            }
         }
         break;
      case 1770025841:
         if (!var4.equals("CALL_RING")) {
            return "";
         }

         val var23: Int = var0.getChannelType();
         if (var23 != null && var23 == 1) {
            return I18nUtilsKt.i18nFormat$default(var1, I18nMessage.INCOMING_CALL, null, 2, null);
         }

         val var10: java.lang.String = var0.getChannelName();
         var7 = var10;
         if (var10 == null) {
            return "";
         }
         break;
      default:
         return "";
   }

   return var7;
}

internal fun NotificationData.isConversation(): Boolean {
   r.h(var0, "<this>");
   return r.c(var0.getType(), "MESSAGE_CREATE");
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

private fun renderLogAwareNotificationMessageContent(forLogs: Boolean, messageContent: String?): CharSequence? {
   val var2: Boolean;
   if (var1 != null && var1.length() != 0) {
      var2 = false;
   } else {
      var2 = true;
   }

   if (var2) {
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
      var7 = I18nUtilsKt.i18nFormat(var1, I18nMessage.STICKER_NOTIFICATION_BODY, new Function1<RenderContext, Unit>(var4) {
         final Sticker $sticker;

         {
            super(1);
            this.$sticker = var1;
         }

         public final void invoke(RenderContext var1) {
            r.h(var1, "$this$i18nFormat");
            var1.getArgs().put("stickerName", this.$sticker.getName());
         }
      });
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
               var7 = I18nUtilsKt.i18nFormat(var1, I18nMessage.POLL_SENT_NOTIFICATION, new Function1<RenderContext, Unit>(var0) {
                  final NotificationData $this_renderMessageContent;

                  {
                     super(1);
                     this.$this_renderMessageContent = var1;
                  }

                  public final void invoke(RenderContext var1) {
                     var var3: java.util.Map;
                     label15: {
                        r.h(var1, "$this$i18nFormat");
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
                  var7 = I18nUtilsKt.i18nFormat(var1, I18nMessage.POLL_RESULTS_NOTIFICATION, new Function1<RenderContext, Unit>(var9) {
                     final Embed $embed;

                     {
                        super(1);
                        this.$embed = var1;
                     }

                     public final void invoke(RenderContext var1) {
                        var var3: java.util.Map;
                        label27: {
                           r.h(var1, "$this$i18nFormat");
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
                                 } while (!r.c(((EmbedField)var6).getName(), "poll_question_text"));

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
         var7 = I18nUtilsKt.i18nFormat(var1, I18nMessage.NOTIFICATION_MESSAGE_ACTIVITY_INSTANCE, new Function1<RenderContext, Unit>(var0) {
            final NotificationData $this_renderMessageContent;

            {
               super(1);
               this.$this_renderMessageContent = var1;
            }

            public final void invoke(RenderContext var1) {
               r.h(var1, "$this$i18nFormat");
               var1.getArgs().put("user", this.$this_renderMessageContent.getUserUsername());
            }
         });
      }
   }

   return var7;
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

private fun Bitmap.toIconCompat(): IconCompat {
   val var1: IconCompat = IconCompat.h(var0);
   r.g(var1, "createWithBitmap(this)");
   return var1;
}

public fun NotificationData.toNotificationMessage(author: JsonObject): JsonObject {
   r.h(var0, "<this>");
   r.h(var1, "author");
   val var7: java.lang.String = var0.getMessageContent();
   r.e(var7);
   val var8: java.lang.Long = var0.getMessageFlags();
   val var3: Long;
   if (var8 != null) {
      var3 = var8;
   } else {
      var3 = 0L;
   }

   val var12: Int = var0.getMessageType();
   r.e(var12);
   val var2: Int = var12;
   val var13: java.lang.String = var0.getMessageId-N_6c4I0();
   r.e(var13);
   val var9: ChannelId = var0.getChannelId-qMVnFVQ();
   r.e(var9);
   val var5: Long = var9.unbox-impl();
   val var14: GuildId = var0.getGuildId-qOKuAAo();
   val var11: java.lang.String = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS", Locale.getDefault()).format(new Date());
   val var10: kotlinx.serialization.json.r = new kotlinx.serialization.json.r();
   f.c(var10, "content", var7);
   f.b(var10, "flags", var3);
   f.b(var10, "type", var2);
   f.c(var10, "id", MessageId.toString-impl(var13));
   f.c(var10, "channel_id", ChannelId.toString-impl(var5));
   f.c(var10, "timestamp", var11);
   var10.b("author", var1);
   if (var14 != null) {
      f.c(var10, "guild_id", GuildId.toString-impl(var14.unbox-impl()));
   }

   return var10.a();
}
