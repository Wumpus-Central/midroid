@file:SourceDebugExtension(["SMAP\nNotificationManagerUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationManagerUtils.kt\ncom/discord/notifications/renderer/utils/NotificationManagerUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,118:1\n1#2:119\n1310#3,2:120\n3829#3:122\n4344#3,2:123\n3829#3:125\n4344#3,2:126\n*S KotlinDebug\n*F\n+ 1 NotificationManagerUtils.kt\ncom/discord/notifications/renderer/utils/NotificationManagerUtilsKt\n*L\n55#1:120,2\n63#1:122\n63#1:123,2\n78#1:125\n78#1:126,2\n*E\n"])

package com.discord.notifications.renderer.utils

import android.app.Notification
import android.app.NotificationManager
import android.content.Context
import android.net.Uri
import android.service.notification.StatusBarNotification
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.app.NotificationCompat.Builder
import androidx.core.app.NotificationCompat.MessagingStyle
import com.discord.notifications.renderer.NotificationBehaviors
import com.discord.primitives.ChannelId
import com.discord.theme.R
import com.discord.theme.utils.ColorUtilsKt
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

private const val NOTIFICATION_LIGHT_PERIOD: Int = 1500
private final val messageRegex: Regex = new Regex("/channels/(\\d+|@me)(?:/)(\\d+)(?:/)(\\d+)")

internal final val notificationManager: NotificationManager?
   internal final get() {
      return var0.getSystemService("notification") as NotificationManager;
   }


internal final val notificationManagerCompat: NotificationManagerCompat
   internal final get() {
      val var1: NotificationManagerCompat = NotificationManagerCompat.g(var0);
      return var1;
   }


internal final val messagingStyle: MessagingStyle?
   internal final get() {
      return NotificationCompat.MessagingStyle.p(var0);
   }


internal fun Context.getActiveNotification(tag: String): Notification? {
   var var4: NotificationManager = getNotificationManager(var0);
   var var8: Notification = null;
   if (var4 != null) {
      label35:
      try {
         val var10: kotlin.Result.a = Result.e;
         var9 = Result.b(var4.getActiveNotifications());
      } catch (var6: java.lang.Throwable) {
         val var13: kotlin.Result.a = Result.e;
         var9 = Result.b(kotlin.c.a(var6));
         break label35;
      }

      var4 = (NotificationManager)var9;
      if (Result.g(var9)) {
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
            if (var15[var2].getTag() == var1) {
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
   val var3: Notification = getActiveNotification(var0, var1);
   if (var3 != null) {
      val var4: NotificationCompat.MessagingStyle = getMessagingStyle(var3);
      if (var4 != null) {
         val var5: java.util.List = var4.q();
         if (var5 != null) {
            return var5.size();
         }
      }
   }

   return 0;
}

internal fun Context.getActiveReactionNotifications(channelId: String): List<StatusBarNotification>? {
   var var5: NotificationManager = getNotificationManager(var0);
   var var11: ArrayList = null;
   if (var5 != null) {
      label58:
      try {
         val var13: kotlin.Result.a = Result.e;
         var12 = Result.b(var5.getActiveNotifications());
      } catch (var9: java.lang.Throwable) {
         val var18: kotlin.Result.a = Result.e;
         var12 = Result.b(kotlin.c.a(var9));
         break label58;
      }

      var5 = (NotificationManager)var12;
      if (Result.g(var12)) {
         var5 = null;
      }

      val var7: Array<StatusBarNotification> = var5 as Array<StatusBarNotification>;
      var11 = null;
      if (var7 != null) {
         val var20: ArrayList = new ArrayList();
         val var4: Int = var7.length;

         for (int var2 = 0; var2 < var4; var2++) {
            val var21: StatusBarNotification = var7[var2];
            if (var7[var2].getTag() != null) {
               var var3: Int;
               label45: {
                  val var8: Regex = messageRegex;
                  val var14: java.lang.String = var21.getTag();
                  var15 = Regex.c(var8, var14, 0, 2, null);
                  if (var15 != null) {
                     val var22: java.util.List = var15.b();
                     if (var22 != null) {
                        var3 = var22.size();
                        break label45;
                     }
                  }

                  var3 = 0;
               }

               val var23: java.lang.String = var21.getTag();
               if (StringsKt.I(var23, "GENERIC_PUSH_NOTIFICATION_SENT", false, 2, null) && var3 == 4) {
                  label38: {
                     if (var15 != null) {
                        val var16: java.util.List = var15.b();
                        if (var16 != null) {
                           var17 = var16.get(2) as java.lang.String;
                           break label38;
                        }
                     }

                     var17 = null;
                  }

                  if (var17 == var1) {
                     var20.add(var21);
                  }
               }
            }
         }

         var11 = var20;
      }
   }

   return var11;
}

internal fun Context.getCallNotifications(channelId: ChannelId): List<StatusBarNotification>? {
   var var6: NotificationManager = getNotificationManager(var0);
   var var12: ArrayList = null;
   if (var6 != null) {
      label35:
      try {
         val var15: kotlin.Result.a = Result.e;
         var14 = Result.b(var6.getActiveNotifications());
      } catch (var10: java.lang.Throwable) {
         val var13: kotlin.Result.a = Result.e;
         var14 = Result.b(kotlin.c.a(var10));
         break label35;
      }

      var6 = (NotificationManager)var14;
      if (Result.g(var14)) {
         var6 = null;
      }

      val var17: Array<StatusBarNotification> = var6 as Array<StatusBarNotification>;
      var12 = null;
      if (var17 != null) {
         var12 = new ArrayList();
         val var4: Int = var17.length;

         for (int var3 = 0; var3 < var4; var3++) {
            val var18: StatusBarNotification = var17[var3];
            val var5: Boolean;
            if (var17[var3].getTag() == null) {
               var5 = false;
            } else {
               var var9: java.lang.String = ChannelId.toString-impl(var1);
               val var8: StringBuilder = new StringBuilder();
               var8.append("CALL_RING");
               var8.append(var9);
               var9 = var8.toString();
               val var19: java.lang.String = var18.getTag();
               var5 = StringsKt.I(var19, var9, false, 2, null);
            }

            if (var5) {
               var12.add(var18);
            }
         }
      }
   }

   return var12;
}

internal fun Context.getNotificationBuilderOrCreate(notificationChannelId: String, notificationExisting: Notification?): Builder {
   val var3: NotificationCompat.Builder;
   if (var2 != null) {
      var3 = new NotificationCompat.Builder(var0, var2);
   } else {
      var3 = new NotificationCompat.Builder(var0, var1);
   }

   return var3;
}

internal fun NotificationManagerCompat.notify(tag: String, notificationBuilder: Builder, additionalFlags: Int = 0) {
   val var4: Notification = var2.g();
   var4.flags |= var3;
   var0.o(var1, 0, var4);
}

@JvmSynthetic
fun `notify$default`(var0: NotificationManagerCompat, var1: java.lang.String, var2: NotificationCompat.Builder, var3: Int, var4: Int, var5: Any) {
   if ((var4 and 4) != 0) {
      var3 = 0;
   }

   notify(var0, var1, var2, var3);
}

internal fun Builder.setLegacyNotificationBehaviors(context: Context, behaviors: NotificationBehaviors?, sound: Uri?): Builder {
   if (var2 == null) {
      return var0;
   } else {
      val var5: Byte = var2.getSoundsEnabled();
      var var4: Int = var5;
      if (var2.getVibrationsEnabled()) {
         var4 = var5 or 2;
      }

      if (var2.getLightsEnabled()) {
         var0.G(ColorUtilsKt.getColorCompat(var1, R.color.brand_500), 1500, 1500);
      }

      if (var2.getSoundsEnabled() && var3 != null) {
         var0 = var0.W(var3).y(var4 and -2);
      } else {
         var0 = var0.y(var4);
      }

      return var0;
   }
}
