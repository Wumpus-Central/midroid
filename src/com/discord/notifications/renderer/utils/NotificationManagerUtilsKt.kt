package com.discord.notifications.renderer.utils

import android.app.Notification
import android.app.NotificationManager
import android.content.Context
import android.net.Uri
import android.service.notification.StatusBarNotification
import androidx.core.app.NotificationManagerCompat
import androidx.core.app.NotificationCompat.Builder
import androidx.core.app.NotificationCompat.MessagingStyle
import com.discord.notifications.renderer.NotificationBehaviors
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import eh.s
import eh.r.a
import kotlin.jvm.internal.r

private const val NOTIFICATION_LIGHT_PERIOD: Int = 1500

internal final val messagingStyle: MessagingStyle?
   internal final get() {
      r.h(var0, "<this>");
      return MessagingStyle.q(var0);
   }


internal final val notificationManager: NotificationManager?
   internal final get() {
      r.h(var0, "<this>");
      return var0.getSystemService("notification") as NotificationManager;
   }


internal final val notificationManagerCompat: NotificationManagerCompat
   internal final get() {
      r.h(var0, "<this>");
      val var1: NotificationManagerCompat = NotificationManagerCompat.g(var0);
      r.g(var1, "from(this)");
      return var1;
   }


internal fun Context.getActiveNotification(tag: String): Notification? {
   r.h(var0, "<this>");
   r.h(var1, "tag");
   var var4: NotificationManager = getNotificationManager(var0);
   var var8: Notification = null;
   if (var4 != null) {
      label35:
      try {
         val var10: a = eh.r.k;
         var9 = eh.r.b(var4.getActiveNotifications());
      } catch (var6: java.lang.Throwable) {
         val var13: a = eh.r.k;
         var9 = eh.r.b(s.a(var6));
         break label35;
      }

      var4 = (NotificationManager)var9;
      if (eh.r.g(var9)) {
         var4 = null;
      }

      val var15: Array<StatusBarNotification> = var4 as Array<StatusBarNotification>;
      var8 = null;
      if (var15 != null) {
         val var3: Int = var15.length;
         var var2: Int = 0;

         while (true) {
            if (var2 >= var3) {
               var12 = null;
               break;
            }

            val var11: StatusBarNotification = var15[var2];
            if (r.c(var15[var2].getTag(), var1)) {
               var12 = var11;
               break;
            }

            var2++;
         }

         var8 = null;
         if (var12 != null) {
            var8 = var12.getNotification();
         }
      }
   }

   return var8;
}

internal fun Context.getActiveNotificationMessageCount(tag: String): Int {
   r.h(var0, "<this>");
   r.h(var1, "tag");
   val var3: Notification = getActiveNotification(var0, var1);
   if (var3 != null) {
      val var4: MessagingStyle = getMessagingStyle(var3);
      if (var4 != null) {
         val var5: java.util.List = var4.r();
         if (var5 != null) {
            return var5.size();
         }
      }
   }

   return 0;
}

internal fun Context.getNotificationBuilderOrCreate(notificationChannelId: String, notificationExisting: Notification?): Builder {
   r.h(var0, "<this>");
   r.h(var1, "notificationChannelId");
   val var3: Builder;
   if (var2 != null) {
      var3 = new Builder(var0, var2);
   } else {
      var3 = new Builder(var0, var1);
   }

   return var3;
}

internal fun NotificationManagerCompat.notify(tag: String, notificationBuilder: Builder, additionalFlags: Int = 0) {
   r.h(var0, "<this>");
   r.h(var1, "tag");
   r.h(var2, "notificationBuilder");
   val var4: Notification = var2.g();
   r.g(var4, "notificationBuilder.build()");
   var4.flags |= var3;
   var0.o(var1, 0, var4);
}

@JvmSynthetic
fun `notify$default`(var0: NotificationManagerCompat, var1: java.lang.String, var2: Builder, var3: Int, var4: Int, var5: Any) {
   if ((var4 and 4) != 0) {
      var3 = 0;
   }

   notify(var0, var1, var2, var3);
}

internal fun Builder.setLegacyNotificationBehaviors(context: Context, behaviors: NotificationBehaviors?, sound: Uri?): Builder {
   r.h(var0, "<this>");
   r.h(var1, "context");
   if (var2 == null) {
      return var0;
   } else {
      val var5: Byte = var2.getSoundsEnabled();
      var var4: Int = var5;
      if (var2.getVibrationsEnabled()) {
         var4 = var5 or 2;
      }

      if (var2.getLightsEnabled()) {
         var0.F(ColorUtilsKt.getColorCompat(var1, color.brand_500), 1500, 1500);
      }

      if (var2.getSoundsEnabled() && var3 != null) {
         var0 = var0.V(var3).y(var4 and -2);
         r.g(var0, "{\n        // remove the …EFAULT_SOUND.inv())\n    }");
      } else {
         var0 = var0.y(var4);
         r.g(var0, "{\n        setDefaults(defaults)\n    }");
      }

      return var0;
   }
}
