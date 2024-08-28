package com.discord.notifications.fcm

import com.discord.notifications.client.NotificationClient
import com.discord.notifications.fcm.utils.FCMTokenHelper
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public class MessagingService : FirebaseMessagingService {
   public open fun onMessageReceived(remoteMessage: RemoteMessage) {
      q.h(var1, "remoteMessage");
      val var2: NotificationClient = NotificationClient.Companion.getInstance();
      val var3: java.util.Map = var1.m();
      q.g(var3, "getData(...)");
      var2.onNotificationReceived(this, var3);
   }

   public open fun onNewToken(token: String) {
      q.h(var1, "token");
      NotificationClient.Companion.getInstance().setToken(var1);
   }

   public companion object {
      public fun init() {
         FCMTokenHelper.INSTANCE.getToken(new Function1(NotificationClient.Companion.getInstance()) {
            {
               super(1, var1, NotificationClient::class.java, "setToken", "setToken(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               q.h(var1, "p0");
               (super.receiver as NotificationClient).setToken(var1);
            }
         });
      }
   }
}
