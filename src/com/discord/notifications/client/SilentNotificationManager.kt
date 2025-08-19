package com.discord.notifications.client

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import com.discord.notifications.api.NotificationData
import com.discord.primitives.ChannelId
import java.util.concurrent.TimeUnit
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSilentNotificationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SilentNotificationManager.kt\ncom/discord/notifications/client/SilentNotificationManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,109:1\n1863#2,2:110\n41#3,12:112\n41#3,12:124\n*S KotlinDebug\n*F\n+ 1 SilentNotificationManager.kt\ncom/discord/notifications/client/SilentNotificationManager\n*L\n27#1:110,2\n84#1:112,12\n104#1:124,12\n*E\n"])
public class SilentNotificationManager(reactContext: Context) {
   private final val sharedPrefs: SharedPreferences

   init {
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
      val var2: java.util.Iterator = var1.getAckChannelIds().iterator();

      while (var2.hasNext()) {
         this.setNumAccumulatedMessagesForChannel-LJLSWy8((var2.next() as ChannelId).unbox-impl(), 0);
      }
   }

   public fun onDisplayNotification(notificationData: NotificationData) {
      val var2: Int = var1.getChannelType();
      if (var2 == null || var2 != 1) {
         this.setMessageReceivedForChannel(var1);
      }
   }

   public fun onSilentNotification(notificationData: NotificationData) {
      this.setMessageReceivedForChannel(var1);
   }

   public fun shouldDisplayNotification(notificationData: NotificationData): Boolean {
      if (var1.getType() == "MESSAGE_CREATE") {
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

   @SourceDebugExtension(["SMAP\nSilentNotificationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SilentNotificationManager.kt\ncom/discord/notifications/client/SilentNotificationManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"])
   public companion object {
      public const val SILENT_NOTIFICATION_CACHE_STORE_NAME: String
      public const val IDLE_TIME_TO_RECEIVE_PUSH_FROM_GDM_OR_SMALL_GUILD_MINS: Int
      public const val MAX_MESSAGES_BEFORE_THROTTLE: Int
      private final var instance: SilentNotificationManager?

      public fun get(context: Context): SilentNotificationManager {
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
