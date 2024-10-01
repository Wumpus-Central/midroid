package com.discord.notifications.client

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import com.discord.notifications.api.NotificationData
import com.discord.primitives.ChannelId
import java.util.concurrent.TimeUnit
import kotlin.jvm.internal.q

public class SilentNotificationManager(reactContext: Context) {
   private final val sharedPrefs: SharedPreferences

   init {
      q.h(var1, "reactContext");
      super();
      this.sharedPrefs = var1.getSharedPreferences("silent_notifications", 0);
   }

   private fun getNumAccumulatedMessagesForChannel(channelId: ChannelId): Int {
      return this.sharedPrefs.getInt(this.toMessageCountKey-R7gqayM(var1), 0);
   }

   private fun lastMessagedReceivedAgoInMins(channelId: ChannelId): Long {
      return TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - this.sharedPrefs.getLong(ChannelId.toString-impl(var1), 0L));
   }

   private fun setLastMessageReceivedForChannel(channelId: ChannelId, timestamp: Long) {
      val var5: SharedPreferences = this.sharedPrefs;
      q.g(this.sharedPrefs, "sharedPrefs");
      val var6: Editor = var5.edit();
      var6.putLong(ChannelId.toString-impl(var1), var3);
      var6.apply();
   }

   private fun setMessageReceivedForChannel(notificationData: NotificationData) {
      val var4: ChannelId = var1.getChannelId-qMVnFVQ();
      if (var4 != null) {
         val var2: Long = var4.unbox-impl();
         this.setNumAccumulatedMessagesForChannel-LJLSWy8(var2, this.getNumAccumulatedMessagesForChannel-R7gqayM(var2) + 1);
         this.updateLastMessageReceivedForChannel-R7gqayM(var2);
      }
   }

   private fun setNumAccumulatedMessagesForChannel(channelId: ChannelId, number: Int) {
      val var4: SharedPreferences = this.sharedPrefs;
      q.g(this.sharedPrefs, "sharedPrefs");
      val var5: Editor = var4.edit();
      var5.putInt(this.toMessageCountKey-R7gqayM(var1), var3);
      var5.apply();
   }

   private fun ChannelId.toMessageCountKey(): String {
      val var4: java.lang.String = ChannelId.toString-impl(var1);
      val var3: StringBuilder = new StringBuilder();
      var3.append(var4);
      var3.append("_num");
      return var3.toString();
   }

   private fun updateLastMessageReceivedForChannel(channelId: ChannelId) {
      this.setLastMessageReceivedForChannel-LJLSWy8(var1, System.currentTimeMillis());
   }

   public fun handleAcks(notificationData: NotificationData) {
      q.h(var1, "notificationData");
      val var2: java.util.Iterator = var1.getAckChannelIds().iterator();

      while (var2.hasNext()) {
         this.setNumAccumulatedMessagesForChannel-LJLSWy8((var2.next() as ChannelId).unbox-impl(), 0);
      }
   }

   public fun onDisplayNotification(notificationData: NotificationData) {
      q.h(var1, "notificationData");
      val var2: Int = var1.getChannelType();
      if (var2 == null || var2 != 1) {
         this.setMessageReceivedForChannel(var1);
      }
   }

   public fun onSilentNotification(notificationData: NotificationData) {
      q.h(var1, "notificationData");
      this.setMessageReceivedForChannel(var1);
   }

   public fun shouldDisplayNotification(notificationData: NotificationData): Boolean {
      q.h(var1, "notificationData");
      if (q.c(var1.getType(), "MESSAGE_CREATE")) {
         val var4: Int = var1.getChannelType();
         if (var4 == null || var4 != 1) {
            val var5: ChannelId = var1.getChannelId-qMVnFVQ();
            if (var5 != null) {
               val var2: Long = var5.unbox-impl();
               if (this.getNumAccumulatedMessagesForChannel-R7gqayM(var2) < 3) {
                  return true;
               }

               if (this.lastMessagedReceivedAgoInMins-R7gqayM(var2) >= 15L) {
                  this.setNumAccumulatedMessagesForChannel-LJLSWy8(var2, 0);
                  return true;
               }
            }

            return false;
         }
      }

      return true;
   }

   public companion object {
      public const val IDLE_TIME_TO_RECEIVE_PUSH_FROM_GDM_OR_SMALL_GUILD_MINS: Int
      public const val MAX_MESSAGES_BEFORE_THROTTLE: Int
      public const val SILENT_NOTIFICATION_CACHE_STORE_NAME: String
      private final var instance: SilentNotificationManager?

      public fun get(context: Context): SilentNotificationManager {
         q.h(var1, "context");
         val var3: SilentNotificationManager = SilentNotificationManager.access$getInstance$cp();
         var var2: SilentNotificationManager = var3;
         if (var3 == null) {
            var2 = new SilentNotificationManager(var1);
            SilentNotificationManager.access$setInstance$cp(var2);
         }

         return var2;
      }
   }
}
