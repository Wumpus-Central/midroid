package com.discord.notifications.client

import android.content.Context
import android.content.Intent
import android.os.Parcelable
import android.os.Build.VERSION
import androidx.core.content.b
import com.discord.crash_reporting.CrashReporting
import com.discord.kvstorage.discordapp.DiscordMobileApi
import com.discord.logging.Log
import com.discord.misc.utilities.intent.IntentUtilsKt
import com.discord.notifications.actions.intents.ContentAction
import com.discord.notifications.actions.intents.NotificationAction
import com.discord.notifications.api.DirectReplyMessage
import com.discord.notifications.api.KvMessageEntry
import com.discord.notifications.api.NotificationData
import com.discord.notifications.renderer.NotificationBehaviors
import com.discord.notifications.renderer.NotificationRenderer
import com.discord.notifications.renderer.utils.NotificationDataUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import com.discord.push_notification_monitor.PushNotificationMeta
import com.discord.push_notification_monitor.PushNotificationMonitor
import com.discord.react.headless_tasks.api.HeadlessTasks
import com.discord.shortcuts.ShortcutData
import kh.w
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.Json.a
import lh.r

public class NotificationClient {
   public final var shouldDisplayNotification: () -> Boolean = <unrepresentable>.INSTANCE
   private final var token: String?
   private final var tokenListener: (String) -> Unit = <unrepresentable>.INSTANCE
   private final var notificationPending: Map<String, String?>?
   private final var notificationListener: ((Map<String, String?>) -> Unit)?
   private final var notificationLocalListener: ((Map<String, String?>) -> Unit)?
   private final var cache: NotificationCache
   private final var renderer: NotificationRenderer

   private fun getBehaviors(context: Context): NotificationBehaviors? {
      val var2: NotificationBehaviors;
      if (VERSION.SDK_INT >= 26) {
         var2 = null;
      } else {
         var2 = new NotificationBehaviors(this.isSoundsEnabled(var1), this.isVibrationsEnabled(var1), this.isLightsEnabled(var1));
      }

      return var2;
   }

   private fun setLocalNotification(notification: Map<String, String?>) {
      if (this.notificationLocalListener != null) {
         if (this.notificationLocalListener != null) {
            this.notificationLocalListener.invoke(var1);
         }
      } else {
         this.notificationPending = var1;
      }
   }

   private fun setNotification(notification: Map<String, String?>?) {
      if (var1 == null) {
         this.notificationPending = null;
      } else {
         if (this.notificationListener != null) {
            if (this.notificationListener != null) {
               this.notificationListener.invoke(var1);
            }
         } else {
            this.notificationPending = var1;
         }
      }
   }

   private fun showNotification(context: Context, notificationData: NotificationData, notificationDataMap: Map<String, String>, makeOrUpdateShortcut: Boolean) {
      var var12: CrashReporting = CrashReporting.INSTANCE;
      val var11: Pair = w.a("type", var2.getType());
      val var9: Pair = w.a("channelId", java.lang.String.valueOf(var2.getChannelId-qMVnFVQ()));
      var var8: java.lang.String = var2.getMessageId-N_6c4I0();
      var var10: java.lang.String = "null";
      if (var8 == null) {
         var8 = "null";
      } else {
         var8 = MessageId.toString-impl(var8);
      }

      CrashReporting.addBreadcrumb$default(
         var12, "Kotlin NotificationClient received Notification.", r.l(new Pair[]{var11, var9, w.a("messageId", var8)}), null, 4, null
      );
      if (this.cache.isAuthed(var1)) {
         val var82: SilentNotificationManager = SilentNotificationManager.Companion.get(var1);
         if (q.c(var2.getType(), "CHANNEL_ACK")) {
            this.renderer.handleAcks(var1, var2);
            var82.handleAcks(var2);
         } else {
            if (this.shouldDisplayNotification.invoke() as java.lang.Boolean || q.c(var2.getType(), "CALL_RING")) {
               var var5: Boolean;
               try {
                  var5 = var82.shouldDisplayNotification(var2);
                  var70 = var2.getReceivingUserId-wUX8bhU();
               } catch (var33: Exception) {
                  val var51: Log = Log.INSTANCE;
                  val var34: java.lang.String = NotificationClient.class.getSimpleName();
                  q.g(var34, "getSimpleName(...)");
                  var51.e(var34, "Unable to display notification", var33);
                  return;
               }

               label133: {
                  if (var70 != null) {
                     try {
                        var73 = UserId.toString-impl(var70.unbox-impl());
                     } catch (var32: Exception) {
                        val var52: Log = Log.INSTANCE;
                        val var35: java.lang.String = NotificationClient.class.getSimpleName();
                        q.g(var35, "getSimpleName(...)");
                        var52.e(var35, "Unable to display notification", var32);
                        return;
                     }

                     var8 = var73;
                     if (var73 != null) {
                        break label133;
                     }
                  }

                  try {
                     var8 = this.cache.getCurrentUserId(var1);
                  } catch (var31: Exception) {
                     val var53: Log = Log.INSTANCE;
                     val var36: java.lang.String = NotificationClient.class.getSimpleName();
                     q.g(var36, "getSimpleName(...)");
                     var53.e(var36, "Unable to display notification", var31);
                     return;
                  }
               }

               if (var8 != null) {
                  var var6: Long;
                  var var13: java.lang.String;
                  var var14: java.lang.String;
                  var var15: PushNotificationMonitor;
                  try {
                     var15 = PushNotificationMonitor.INSTANCE;
                     var14 = var2.getType();
                     var6 = System.currentTimeMillis();
                     var13 = NotificationDataUtilsKt.getTitle(var2, var1).toString();
                     var74 = NotificationDataUtilsKt.getContent(var2, var1, true);
                  } catch (var30: Exception) {
                     val var54: Log = Log.INSTANCE;
                     val var37: java.lang.String = NotificationClient.class.getSimpleName();
                     q.g(var37, "getSimpleName(...)");
                     var54.e(var37, "Unable to display notification", var30);
                     return;
                  }

                  val var75: java.lang.String;
                  if (var74 != null) {
                     try {
                        var75 = var74.toString();
                     } catch (var29: Exception) {
                        val var55: Log = Log.INSTANCE;
                        val var38: java.lang.String = NotificationClient.class.getSimpleName();
                        q.g(var38, "getSimpleName(...)");
                        var55.e(var38, "Unable to display notification", var29);
                        return;
                     }
                  } else {
                     var75 = null;
                  }

                  var var16: java.lang.String;
                  var var17: java.lang.String;
                  try {
                     var16 = java.lang.String.valueOf(var2.getChannelId-qMVnFVQ());
                     var17 = var2.getMessageId-N_6c4I0();
                  } catch (var28: Exception) {
                     val var56: Log = Log.INSTANCE;
                     val var39: java.lang.String = NotificationClient.class.getSimpleName();
                     q.g(var39, "getSimpleName(...)");
                     var56.e(var39, "Unable to display notification", var28);
                     return;
                  }

                  if (var17 != null) {
                     try {
                        var10 = MessageId.toString-impl(var17);
                     } catch (var27: Exception) {
                        val var57: Log = Log.INSTANCE;
                        val var40: java.lang.String = NotificationClient.class.getSimpleName();
                        q.g(var40, "getSimpleName(...)");
                        var57.e(var40, "Unable to display notification", var27);
                        return;
                     }
                  }

                  try {
                     var15.logPushNotification(var1, var8, new PushNotificationMeta(var6, var5 xor true, var14, var13, var75, var16, var10));
                  } catch (var26: Exception) {
                     val var58: Log = Log.INSTANCE;
                     val var41: java.lang.String = NotificationClient.class.getSimpleName();
                     q.g(var41, "getSimpleName(...)");
                     var58.e(var41, "Unable to display notification", var26);
                     return;
                  }
               }

               if (var5) {
                  try {
                     this.renderer.initIconUrlUtils(var1);
                     this.renderer.initFresco(var1);
                     this.renderer
                        .display(var1, var2, this.cache.getCurrentUsername(var1), var3, this.getBehaviors(var1), var4, this.shouldNotifyEveryTime(var1));
                     var82.onDisplayNotification(var2);
                  } catch (var25: Exception) {
                     val var59: Log = Log.INSTANCE;
                     val var42: java.lang.String = NotificationClient.class.getSimpleName();
                     q.g(var42, "getSimpleName(...)");
                     var59.e(var42, "Unable to display notification", var25);
                     return;
                  }
               } else {
                  try {
                     var82.onSilentNotification(var2);
                  } catch (var24: Exception) {
                     val var60: Log = Log.INSTANCE;
                     val var43: java.lang.String = NotificationClient.class.getSimpleName();
                     q.g(var43, "getSimpleName(...)");
                     var60.e(var43, "Unable to display notification", var24);
                     return;
                  }
               }

               try {
                  if (!q.c(var2.getType(), "MESSAGE_CREATE")) {
                     return;
                  }

                  var72 = NotificationDataUtilsKt.getKvMessage(var2, var3.get("message") as java.lang.String);
               } catch (var23: Exception) {
                  val var61: Log = Log.INSTANCE;
                  val var44: java.lang.String = NotificationClient.class.getSimpleName();
                  q.g(var44, "getSimpleName(...)");
                  var61.e(var44, "Unable to display notification", var23);
                  return;
               }

               if (var72 != null) {
                  try {
                     var76 = var2.getMessageId-N_6c4I0();
                     var78 = var2.getChannelId-qMVnFVQ();
                  } catch (var22: Exception) {
                     val var62: Log = Log.INSTANCE;
                     val var45: java.lang.String = NotificationClient.class.getSimpleName();
                     q.g(var45, "getSimpleName(...)");
                     var62.e(var45, "Unable to display notification", var22);
                     return;
                  }

                  if (var76 != null && var78 != null) {
                     try {
                        var12 = (CrashReporting)var3.get("receiving_user_id");
                        val var64: StringBuilder = new StringBuilder();
                        var64.append("@account.");
                        var64.append(var12);
                        var65 = var64.toString();
                        var84 = var2.getGuildId-qOKuAAo();
                     } catch (var21: Exception) {
                        val var63: Log = Log.INSTANCE;
                        val var46: java.lang.String = NotificationClient.class.getSimpleName();
                        q.g(var46, "getSimpleName(...)");
                        var63.e(var46, "Unable to display notification", var21);
                        return;
                     }

                     var var47: java.lang.String = null;
                     if (var84 != null) {
                        try {
                           var47 = GuildId.toString-impl(var84.unbox-impl());
                        } catch (var20: Exception) {
                           val var66: Log = Log.INSTANCE;
                           val var48: java.lang.String = NotificationClient.class.getSimpleName();
                           q.g(var48, "getSimpleName(...)");
                           var66.e(var48, "Unable to display notification", var20);
                           return;
                        }
                     }

                     try {
                        var10 = ChannelId.toString-impl(var78.unbox-impl());
                        val var81: java.lang.String = MessageId.toString-impl(var76);
                        val var77: a = Json.d;
                        Json.d.a();
                        DiscordMobileApi.putMessage(var65, var47, var10, var81, var77.c(KvMessageEntry.Companion.serializer(), var72));
                     } catch (var19: Exception) {
                        val var67: Log = Log.INSTANCE;
                        val var49: java.lang.String = NotificationClient.class.getSimpleName();
                        q.g(var49, "getSimpleName(...)");
                        var67.e(var49, "Unable to display notification", var19);
                        return;
                     }
                  }
               }

               try {
                  if (this.updateAndComputeIfShouldRunBackgroundSync(var1)) {
                     HeadlessTasks.Companion.startHeadlessTask$default(HeadlessTasks.Companion, var1, "BackgroundSync", 30000L, false, null, true, 24, null);
                  }
               } catch (var18: Exception) {
                  val var68: Log = Log.INSTANCE;
                  val var50: java.lang.String = NotificationClient.class.getSimpleName();
                  q.g(var50, "getSimpleName(...)");
                  var68.e(var50, "Unable to display notification", var18);
               }
            }
         }
      }
   }

   private fun updateAndComputeIfShouldRunBackgroundSync(context: Context): Boolean {
      val var2: Long = System.currentTimeMillis();
      if (var2 < this.cache.getBackgroundSyncRan(var1)) {
         this.cache.setBackgroundSyncRan(var1);
         return true;
      } else if (var2 > this.cache.getBackgroundSyncRan(var1) + 3600000L) {
         this.cache.setBackgroundSyncRan(var1);
         return true;
      } else {
         return false;
      }
   }

   public fun clearAllNotifications(context: Context) {
      q.h(var1, "context");
      this.renderer.clearAllNotifications(var1);
   }

   public fun getPendingNotification(): Map<String, String?>? {
      var var1: java.util.Map = this.notificationPending;
      if (this.notificationPending != null) {
         this.notificationPending = null;
      } else {
         var1 = null;
      }

      return var1;
   }

   public fun handleIntent(context: Context, intent: Intent) {
      q.h(var1, "context");
      q.h(var2, "intent");
      val var3: NotificationAction.Companion = NotificationAction.Companion;
      val var7: NotificationAction;
      if (IntentUtilsKt.hasExtra(var2, g0.b(ContentAction.class))) {
         var7 = (b.b(var2, "action_intent_arg_key", ContentAction.class) as Parcelable) as NotificationAction;
      } else {
         var7 = null;
      }

      val var4: ContentAction = var7 as ContentAction;
      val var5: ShortcutData = ShortcutData.Companion.getShortcutIntentData(var2);
      val var6: ContentAction;
      if (var5 != null) {
         var6 = new ContentAction(var5.getTag(), var5.getData());
      } else {
         var6 = null;
      }

      var var8: ContentAction = var4;
      if (var4 == null) {
         var8 = var6;
      }

      if (var8 == null) {
         this.setNotification(null);
      } else {
         if (var8.isLocal()) {
            this.setLocalNotification(var8.getData());
         } else {
            this.setNotification(var8.getData());
         }

         var8.onNotificationActionComplete(var1);
      }
   }

   public fun initNotificationCategories(context: Context, localizedCategoryNames: Map<String, String>, localizedGroupNames: Map<String, String>) {
      q.h(var1, "context");
      q.h(var2, "localizedCategoryNames");
      q.h(var3, "localizedGroupNames");
      this.renderer.initNotificationCategories(var1, var2, var3);
   }

   public fun isLightsEnabled(context: Context): Boolean {
      q.h(var1, "context");
      return this.cache.isLightsEnabled(var1);
   }

   public fun isSoundsEnabled(context: Context): Boolean {
      q.h(var1, "context");
      return this.cache.isSoundsEnabled(var1);
   }

   public fun isVibrationsEnabled(context: Context): Boolean {
      q.h(var1, "context");
      return this.cache.isVibrationsEnabled(var1);
   }

   public fun markNotificationAsDirectReply(context: Context, channelId: Long) {
      q.h(var1, "context");
      val var4: NotificationRenderer = this.renderer;
      val var5: StringBuilder = new StringBuilder();
      var5.append("MESSAGE_CREATE");
      var5.append(var2);
      var4.markNotificationAsDirectReply(var1, var5.toString(), "", true);
   }

   public fun onDirectReplySuccess(context: Context, data: String) {
      q.h(var1, "context");
      q.h(var2, "data");
      val var3: NotificationData = DirectReplyMessage.Companion.toNotificationData(var2);
      val var5: Pair = w.a("type", var3.getType());
      val var4: Pair = w.a("channel_id", java.lang.String.valueOf(var3.getChannelId-qMVnFVQ()));
      var2 = var3.getMessageId-N_6c4I0();
      if (var2 == null) {
         var2 = "null";
      } else {
         var2 = MessageId.toString-impl(var2);
      }

      this.showNotification(var1, var3, r.l(new Pair[]{var5, var4, w.a("message_id", var2)}), false);
   }

   public fun onNotificationReceived(context: Context, data: Map<String, String>) {
      q.h(var1, "context");
      q.h(var2, "data");
      val var3: jl.a.a = jl.a.b;
      val var6: KSerializer = NotificationData.Companion.serializer();
      val var5: java.util.Map = r.x(var2);
      var5.put("time_received", java.lang.String.valueOf(System.currentTimeMillis()));
      this.showNotification(var1, var3.d(var6, var5) as NotificationData, var2, true);
   }

   public fun setCurrentUser(context: Context, username: String?, userId: String?) {
      q.h(var1, "context");
      this.cache.setCurrentUsername(var1, var2);
      this.cache.setCurrentUserId(var1, var3);
   }

   public fun setIncomingRingtone(context: Context, name: String) {
      q.h(var1, "context");
      q.h(var2, "name");
      this.renderer.setIncomingRingtone(var1, var2);
   }

   public fun setIsAuthed(context: Context, isAuthed: Boolean) {
      q.h(var1, "context");
      this.cache.setIsAuthed(var1, var2);
   }

   public fun setLightsEnabled(context: Context, lightsEnabled: Boolean) {
      q.h(var1, "context");
      this.cache.setLightsEnabled(var1, var2);
   }

   public fun setLocalNotificationListener(notificationListener: (Map<String, String?>) -> Unit) {
      q.h(var1, "notificationListener");
      this.notificationLocalListener = var1;
   }

   public fun setNotificationListener(notificationListener: (Map<String, String?>) -> Unit) {
      q.h(var1, "notificationListener");
      this.notificationListener = var1;
   }

   public fun setNotifyEveryTime(context: Context, notifyEveryTime: Boolean) {
      q.h(var1, "context");
      this.cache.setNotifyEveryTime(var1, var2);
   }

   public fun setSoundsEnabled(context: Context, soundsEnabled: Boolean) {
      q.h(var1, "context");
      this.cache.setSoundsEnabled(var1, var2);
   }

   public fun setToken(token: String) {
      q.h(var1, "token");
      if (!q.c(this.token, var1)) {
         this.token = var1;
         this.tokenListener.invoke(var1);
      }
   }

   public fun setTokenListener(tokenListener: (String) -> Unit) {
      q.h(var1, "tokenListener");
      this.tokenListener = var1;
      if (this.token != null) {
         var1.invoke(this.token);
      }
   }

   public fun setVibrationsEnabled(context: Context, vibrationsEnabled: Boolean) {
      q.h(var1, "context");
      this.cache.setVibrationsEnabled(var1, var2);
   }

   public fun shouldNotifyEveryTime(context: Context): Boolean {
      q.h(var1, "context");
      return this.cache.shouldNotifyEveryTime(var1);
   }

   public fun showLocalNotification(context: Context, notification: Map<String, Any>) {
      q.h(var1, "context");
      q.h(var2, "notification");
      this.renderer.displayLocal(var1, var2);
   }

   public companion object {
      private const val NOTIFICATION_BACKGROUND_SYNC_INTERVAL_MS: Long
      public final val instance: NotificationClient
   }
}
