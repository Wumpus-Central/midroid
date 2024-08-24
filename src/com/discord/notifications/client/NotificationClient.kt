package com.discord.notifications.client

import al.a
import android.content.Context
import android.content.Intent
import android.os.Parcelable
import android.os.Build.VERSION
import androidx.core.content.d
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
import eh.w
import fh.s
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json

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
      val var10: CrashReporting = CrashReporting.INSTANCE;
      val var12: Pair = w.a("type", var2.getType());
      var var13: Pair = w.a("channelId", java.lang.String.valueOf(var2.getChannelId-qMVnFVQ()));
      var var9: java.lang.String = var2.getMessageId-N_6c4I0();
      var var11: java.lang.String = "null";
      if (var9 == null) {
         var9 = "null";
      } else {
         var9 = MessageId.toString-impl(var9);
      }

      CrashReporting.addBreadcrumb$default(
         var10, "Kotlin NotificationClient received Notification.", s.l(new Pair[]{var12, var13, w.a("messageId", var9)}), null, 4, null
      );
      if (this.cache.isAuthed(var1)) {
         val var86: SilentNotificationManager = SilentNotificationManager.Companion.get(var1);
         if (r.c(var2.getType(), "CHANNEL_ACK")) {
            this.renderer.handleAcks(var1, var2);
            var86.handleAcks(var2);
         } else {
            if (this.shouldDisplayNotification.invoke() as java.lang.Boolean || r.c(var2.getType(), "CALL_RING")) {
               var var6: Boolean;
               try {
                  var6 = var86.shouldDisplayNotification(var2);
                  var74 = var2.getReceivingUserId-wUX8bhU();
               } catch (var35: Exception) {
                  val var36: Log = Log.INSTANCE;
                  val var54: java.lang.String = NotificationClient.class.getSimpleName();
                  r.g(var54, "javaClass.simpleName");
                  var36.e(var54, "Unable to display notification", var35);
                  return;
               }

               label140: {
                  if (var74 != null) {
                     try {
                        var77 = UserId.toString-impl(var74.unbox-impl());
                     } catch (var34: Exception) {
                        val var37: Log = Log.INSTANCE;
                        val var55: java.lang.String = NotificationClient.class.getSimpleName();
                        r.g(var55, "javaClass.simpleName");
                        var37.e(var55, "Unable to display notification", var34);
                        return;
                     }

                     var9 = var77;
                     if (var77 != null) {
                        break label140;
                     }
                  }

                  try {
                     var9 = this.cache.getCurrentUserId(var1);
                  } catch (var33: Exception) {
                     val var38: Log = Log.INSTANCE;
                     val var56: java.lang.String = NotificationClient.class.getSimpleName();
                     r.g(var56, "javaClass.simpleName");
                     var38.e(var56, "Unable to display notification", var33);
                     return;
                  }
               }

               if (var9 != null) {
                  var var15: java.lang.String;
                  var var16: PushNotificationMonitor;
                  try {
                     var16 = PushNotificationMonitor.INSTANCE;
                     var15 = var2.getType();
                  } catch (var32: Exception) {
                     val var39: Log = Log.INSTANCE;
                     val var57: java.lang.String = NotificationClient.class.getSimpleName();
                     r.g(var57, "javaClass.simpleName");
                     var39.e(var57, "Unable to display notification", var32);
                     return;
                  }

                  val var5: Boolean;
                  if (!var6) {
                     var5 = true;
                  } else {
                     var5 = false;
                  }

                  var var7: Long;
                  var var14: java.lang.String;
                  try {
                     var7 = System.currentTimeMillis();
                     var14 = NotificationDataUtilsKt.getTitle(var2, var1).toString();
                     var78 = NotificationDataUtilsKt.getContent(var2, var1, true);
                  } catch (var31: Exception) {
                     val var40: Log = Log.INSTANCE;
                     val var58: java.lang.String = NotificationClient.class.getSimpleName();
                     r.g(var58, "javaClass.simpleName");
                     var40.e(var58, "Unable to display notification", var31);
                     return;
                  }

                  val var79: java.lang.String;
                  if (var78 != null) {
                     try {
                        var79 = var78.toString();
                     } catch (var30: Exception) {
                        val var41: Log = Log.INSTANCE;
                        val var59: java.lang.String = NotificationClient.class.getSimpleName();
                        r.g(var59, "javaClass.simpleName");
                        var41.e(var59, "Unable to display notification", var30);
                        return;
                     }
                  } else {
                     var79 = null;
                  }

                  var var17: java.lang.String;
                  var var18: java.lang.String;
                  try {
                     var17 = java.lang.String.valueOf(var2.getChannelId-qMVnFVQ());
                     var18 = var2.getMessageId-N_6c4I0();
                  } catch (var29: Exception) {
                     val var42: Log = Log.INSTANCE;
                     val var60: java.lang.String = NotificationClient.class.getSimpleName();
                     r.g(var60, "javaClass.simpleName");
                     var42.e(var60, "Unable to display notification", var29);
                     return;
                  }

                  if (var18 != null) {
                     try {
                        var11 = MessageId.toString-impl(var18);
                     } catch (var28: Exception) {
                        val var43: Log = Log.INSTANCE;
                        val var61: java.lang.String = NotificationClient.class.getSimpleName();
                        r.g(var61, "javaClass.simpleName");
                        var43.e(var61, "Unable to display notification", var28);
                        return;
                     }
                  }

                  try {
                     var16.logPushNotification(var1, var9, new PushNotificationMeta(var7, var5, var15, var14, var79, var17, var11));
                  } catch (var27: Exception) {
                     val var44: Log = Log.INSTANCE;
                     val var62: java.lang.String = NotificationClient.class.getSimpleName();
                     r.g(var62, "javaClass.simpleName");
                     var44.e(var62, "Unable to display notification", var27);
                     return;
                  }
               }

               if (var6) {
                  try {
                     this.renderer.initIconUrlUtils(var1);
                     this.renderer.initFresco(var1);
                     this.renderer
                        .display(var1, var2, this.cache.getCurrentUsername(var1), var3, this.getBehaviors(var1), var4, this.shouldNotifyEveryTime(var1));
                     var86.onDisplayNotification(var2);
                  } catch (var26: Exception) {
                     val var45: Log = Log.INSTANCE;
                     val var63: java.lang.String = NotificationClient.class.getSimpleName();
                     r.g(var63, "javaClass.simpleName");
                     var45.e(var63, "Unable to display notification", var26);
                     return;
                  }
               } else {
                  try {
                     var86.onSilentNotification(var2);
                  } catch (var25: Exception) {
                     val var46: Log = Log.INSTANCE;
                     val var64: java.lang.String = NotificationClient.class.getSimpleName();
                     r.g(var64, "javaClass.simpleName");
                     var46.e(var64, "Unable to display notification", var25);
                     return;
                  }
               }

               try {
                  if (!r.c(var2.getType(), "MESSAGE_CREATE")) {
                     return;
                  }

                  var76 = NotificationDataUtilsKt.getKvMessage(var2, var3.get("message") as java.lang.String);
               } catch (var24: Exception) {
                  val var47: Log = Log.INSTANCE;
                  val var65: java.lang.String = NotificationClient.class.getSimpleName();
                  r.g(var65, "javaClass.simpleName");
                  var47.e(var65, "Unable to display notification", var24);
                  return;
               }

               if (var76 != null) {
                  try {
                     var80 = var2.getMessageId-N_6c4I0();
                     var82 = var2.getChannelId-qMVnFVQ();
                  } catch (var23: Exception) {
                     val var48: Log = Log.INSTANCE;
                     val var66: java.lang.String = NotificationClient.class.getSimpleName();
                     r.g(var66, "javaClass.simpleName");
                     var48.e(var66, "Unable to display notification", var23);
                     return;
                  }

                  if (var80 != null && var82 != null) {
                     try {
                        var13 = (Pair)var3.get("receiving_user_id");
                        val var68: StringBuilder = new StringBuilder();
                        var68.append("@account.");
                        var68.append(var13);
                        var69 = var68.toString();
                        var88 = var2.getGuildId-qOKuAAo();
                     } catch (var22: Exception) {
                        val var49: Log = Log.INSTANCE;
                        val var67: java.lang.String = NotificationClient.class.getSimpleName();
                        r.g(var67, "javaClass.simpleName");
                        var49.e(var67, "Unable to display notification", var22);
                        return;
                     }

                     var var53: java.lang.String = null;
                     if (var88 != null) {
                        try {
                           var53 = GuildId.toString-impl(var88.unbox-impl());
                        } catch (var21: Exception) {
                           val var50: Log = Log.INSTANCE;
                           val var70: java.lang.String = NotificationClient.class.getSimpleName();
                           r.g(var70, "javaClass.simpleName");
                           var50.e(var70, "Unable to display notification", var21);
                           return;
                        }
                     }

                     try {
                        var11 = ChannelId.toString-impl(var82.unbox-impl());
                        val var85: java.lang.String = MessageId.toString-impl(var80);
                        val var81: Json.a = Json.d;
                        Json.d.a();
                        DiscordMobileApi.putMessage(var69, var53, var11, var85, var81.c(KvMessageEntry.Companion.serializer(), var76));
                     } catch (var20: Exception) {
                        val var51: Log = Log.INSTANCE;
                        val var71: java.lang.String = NotificationClient.class.getSimpleName();
                        r.g(var71, "javaClass.simpleName");
                        var51.e(var71, "Unable to display notification", var20);
                        return;
                     }
                  }
               }

               try {
                  if (this.updateAndComputeIfShouldRunBackgroundSync(var1)) {
                     com.discord.react.headless_tasks.api.HeadlessTasks.Companion.startHeadlessTask$default(
                        HeadlessTasks.Companion, var1, "BackgroundSync", 30000L, false, null, true, 24, null
                     );
                  }
               } catch (var19: Exception) {
                  val var52: Log = Log.INSTANCE;
                  val var72: java.lang.String = NotificationClient.class.getSimpleName();
                  r.g(var72, "javaClass.simpleName");
                  var52.e(var72, "Unable to display notification", var19);
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
      r.h(var1, "context");
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
      r.h(var1, "context");
      r.h(var2, "intent");
      val var3: NotificationAction.Companion = NotificationAction.Companion;
      val var7: NotificationAction;
      if (IntentUtilsKt.hasExtra(var2, h0.b(ContentAction.class))) {
         var7 = (d.b(var2, "action_intent_arg_key", ContentAction.class) as Parcelable) as NotificationAction;
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
      r.h(var1, "context");
      r.h(var2, "localizedCategoryNames");
      r.h(var3, "localizedGroupNames");
      this.renderer.initNotificationCategories(var1, var2, var3);
   }

   public fun isLightsEnabled(context: Context): Boolean {
      r.h(var1, "context");
      return this.cache.isLightsEnabled(var1);
   }

   public fun isSoundsEnabled(context: Context): Boolean {
      r.h(var1, "context");
      return this.cache.isSoundsEnabled(var1);
   }

   public fun isVibrationsEnabled(context: Context): Boolean {
      r.h(var1, "context");
      return this.cache.isVibrationsEnabled(var1);
   }

   public fun markNotificationAsDirectReply(context: Context, channelId: Long) {
      r.h(var1, "context");
      val var4: NotificationRenderer = this.renderer;
      val var5: StringBuilder = new StringBuilder();
      var5.append("MESSAGE_CREATE");
      var5.append(var2);
      var4.markNotificationAsDirectReply(var1, var5.toString(), "", true);
   }

   public fun onDirectReplySuccess(context: Context, data: String) {
      r.h(var1, "context");
      r.h(var2, "data");
      val var4: NotificationData = DirectReplyMessage.Companion.toNotificationData(var2);
      val var5: Pair = w.a("type", var4.getType());
      val var3: Pair = w.a("channel_id", java.lang.String.valueOf(var4.getChannelId-qMVnFVQ()));
      var2 = var4.getMessageId-N_6c4I0();
      if (var2 == null) {
         var2 = "null";
      } else {
         var2 = MessageId.toString-impl(var2);
      }

      this.showNotification(var1, var4, s.l(new Pair[]{var5, var3, w.a("message_id", var2)}), false);
   }

   public fun onNotificationReceived(context: Context, data: Map<String, String>) {
      r.h(var1, "context");
      r.h(var2, "data");
      val var5: a.a = a.b;
      val var4: KSerializer = NotificationData.Companion.serializer();
      val var3: java.util.Map = s.x(var2);
      var3.put("time_received", java.lang.String.valueOf(System.currentTimeMillis()));
      this.showNotification(var1, var5.d(var4, var3), var2, true);
   }

   public fun setCurrentUser(context: Context, username: String?, userId: String?) {
      r.h(var1, "context");
      this.cache.setCurrentUsername(var1, var2);
      this.cache.setCurrentUserId(var1, var3);
   }

   public fun setIncomingRingtone(context: Context, name: String) {
      r.h(var1, "context");
      r.h(var2, "name");
      this.renderer.setIncomingRingtone(var1, var2);
   }

   public fun setIsAuthed(context: Context, isAuthed: Boolean) {
      r.h(var1, "context");
      this.cache.setIsAuthed(var1, var2);
   }

   public fun setLightsEnabled(context: Context, lightsEnabled: Boolean) {
      r.h(var1, "context");
      this.cache.setLightsEnabled(var1, var2);
   }

   public fun setLocalNotificationListener(notificationListener: (Map<String, String?>) -> Unit) {
      r.h(var1, "notificationListener");
      this.notificationLocalListener = var1;
   }

   public fun setNotificationListener(notificationListener: (Map<String, String?>) -> Unit) {
      r.h(var1, "notificationListener");
      this.notificationListener = var1;
   }

   public fun setNotifyEveryTime(context: Context, notifyEveryTime: Boolean) {
      r.h(var1, "context");
      this.cache.setNotifyEveryTime(var1, var2);
   }

   public fun setSoundsEnabled(context: Context, soundsEnabled: Boolean) {
      r.h(var1, "context");
      this.cache.setSoundsEnabled(var1, var2);
   }

   public fun setToken(token: String) {
      r.h(var1, "token");
      if (!r.c(this.token, var1)) {
         this.token = var1;
         this.tokenListener.invoke(var1);
      }
   }

   public fun setTokenListener(tokenListener: (String) -> Unit) {
      r.h(var1, "tokenListener");
      this.tokenListener = var1;
      if (this.token != null) {
         var1.invoke(this.token);
      }
   }

   public fun setVibrationsEnabled(context: Context, vibrationsEnabled: Boolean) {
      r.h(var1, "context");
      this.cache.setVibrationsEnabled(var1, var2);
   }

   public fun shouldNotifyEveryTime(context: Context): Boolean {
      r.h(var1, "context");
      return this.cache.shouldNotifyEveryTime(var1);
   }

   public fun showLocalNotification(context: Context, notification: Map<String, Any>) {
      r.h(var1, "context");
      r.h(var2, "notification");
      this.renderer.displayLocal(var1, var2);
   }

   public companion object {
      private const val NOTIFICATION_BACKGROUND_SYNC_INTERVAL_MS: Long
      public final val instance: NotificationClient
   }
}
