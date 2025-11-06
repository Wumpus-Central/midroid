package com.discord.notifications.fcm

import android.os.Build.VERSION
import com.discord.notifications.client.NotificationClient
import com.discord.notifications.fcm.utils.FCMTokenHelper
import com.discord.tti_manager.TTIModule
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import kotlin.jvm.functions.Function1

public class MessagingService : FirebaseMessagingService {
   public open fun onCreate() {
      super.onCreate();
      if (VERSION.SDK_INT < 28) {
         TTIModule.Companion.markServiceInstantiation();
      }
   }

   public open fun onMessageReceived(remoteMessage: RemoteMessage) {
      val var2: NotificationClient = NotificationClient.Companion.getInstance();
      val var3: java.util.Map = var1.b();
      var2.onNotificationReceived(this, var3);
   }

   public open fun onNewToken(token: String) {
      NotificationClient.Companion.getInstance().setToken(var1);
   }

   public companion object {
      public fun init() {
         FCMTokenHelper.INSTANCE.getToken(new Function1<java.lang.String, Unit>(NotificationClient.Companion.getInstance()) {
            {
               super(1, var1, NotificationClient::class.java, "setToken", "setToken(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               (super.receiver as NotificationClient).setToken(var1);
            }
         });
      }
   }
}
