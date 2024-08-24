package com.discord.notifications.fcm.utils

import com.discord.logging.Log
import com.google.android.gms.tasks.Task
import com.google.firebase.messaging.FirebaseMessaging
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r
import n3.a
import n3.b

internal object FCMTokenHelper {
   @JvmStatic
   fun `getToken$lambda$0`(var0: Exception) {
      r.h(var0, "e");
      INSTANCE.logError(var0);
   }

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @JvmStatic
   fun `getToken$lambda$1`(var0: Function1, var1: Task) {
      r.h(var0, "$onToken");
      r.h(var1, "task");

      var var2: java.lang.String;
      try {
         var2 = var1.l() as java.lang.String;
      } catch (var6: Exception) {
         INSTANCE.logError(var6);
         return;
      }

      if (var2 != null) {
         try {
            if (var1.p()) {
               var0.invoke(var2);
               return;
            }
         } catch (var5: Exception) {
            INSTANCE.logError(var5);
            return;
         }
      }

      try {
         var7 = var1.k();
      } catch (var4: Exception) {
         INSTANCE.logError(var4);
         return;
      }

      if (var7 != null) {
         try {
            INSTANCE.logError(var7);
         } catch (var3: Exception) {
            INSTANCE.logError(var3);
         }
      }
   }

   private fun Throwable.logError() {
      val var2: Log = Log.INSTANCE;
      val var3: java.lang.String = var1.getClass().getSimpleName();
      r.g(var3, "javaClass.simpleName");
      var2.w(var3, "Fetching FCM registration token failed", var1);
   }

   public fun getToken(onToken: (String) -> Unit) {
      r.h(var1, "onToken");

      try {
         FirebaseMessaging.l().o().e(new a()).c(new b(var1));
      } catch (var4: Exception) {
         this.logError(var4);
      }
   }
}
