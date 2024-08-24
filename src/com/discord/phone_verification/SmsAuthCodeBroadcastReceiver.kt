package com.discord.phone_verification

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.core.os.d
import com.discord.logging.Log
import com.google.android.gms.common.api.Status
import kotlin.jvm.internal.r

public class SmsAuthCodeBroadcastReceiver(onReceiveCallback: (String) -> Unit) : BroadcastReceiver {
   private final val onReceiveCallback: (String) -> Unit
   private final var handled: Boolean

   init {
      r.h(var1, "onReceiveCallback");
      super();
      this.onReceiveCallback = var1;
   }

   private fun extractCode(message: String): String {
      val var6: Regex = new Regex("[\\d-]{6,11}");
      var var3: Int = 0;
      val var10: MatchResult = Regex.c(var6, var1, 0, 2, null);
      var1 = null;
      if (var10 != null) {
         val var11: java.lang.String = var10.getValue();
         var1 = null;
         if (var11 != null) {
            val var8: StringBuilder = new StringBuilder();

            for (int var4 = var11.length(); var3 < var4; var3++) {
               val var2: Char = var11.charAt(var3);
               if (Character.isDigit(var2)) {
                  var8.append(var2);
               }
            }

            var1 = var8.toString();
            r.g(var1, "filterTo(StringBuilder(), predicate).toString()");
         }
      }

      var var9: java.lang.String = var1;
      if (var1 == null) {
         var9 = "";
      }

      return var9;
   }

   private fun Bundle.extractSecurityCode() {
      val var4: java.lang.String;
      if (var1.containsKey("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE")) {
         var4 = var1.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
      } else {
         var4 = null;
      }

      var var6: java.lang.String = null;
      if (var4 != null) {
         var6 = this.extractCode(var4);
      }

      val var2: Boolean;
      if (var6 != null && var6.length() != 0) {
         var2 = false;
      } else {
         var2 = true;
      }

      if (var2) {
         Log.i$default(Log.INSTANCE, "SmsAuthCodeBroadcastReceiver", "Failed to extract code from SMS.", null, 4, null);
      } else {
         val var8: Log = Log.INSTANCE;
         val var7: StringBuilder = new StringBuilder();
         var7.append("Successfully extracted code from SMS: ");
         var7.append(var6);
         Log.i$default(var8, "SmsAuthCodeBroadcastReceiver", var7.toString(), null, 4, null);
         this.onReceiveCallback.invoke(var6);
         this.handled = true;
      }
   }

   public open fun onReceive(context: Context, intent: Intent) {
      r.h(var1, "context");
      r.h(var2, "intent");
      if (!this.handled) {
         val var4: Bundle = var2.getExtras();
         val var5: Status;
         if (var4 != null) {
            var5 = d.b(var4, "com.google.android.gms.auth.api.phone.EXTRA_STATUS", Status.class) as Status;
         } else {
            var5 = null;
         }

         val var7: Int;
         if (var5 != null) {
            var7 = var5.s();
         } else {
            var7 = null;
         }

         if (var7 != null && var7 == 0) {
            Log.i$default(Log.INSTANCE, "SmsAuthCodeBroadcastReceiver", "Successfully caught SMS code.", null, 4, null);
            this.extractSecurityCode(var4);
         } else if (var7 != null && var7 == 15) {
            Log.i$default(Log.INSTANCE, "SmsAuthCodeBroadcastReceiver", "Timeout waiting for SMS code.", null, 4, null);
         } else {
            val var9: Log = Log.INSTANCE;
            var var8: Int = null;
            if (var5 != null) {
               var8 = var5.s();
            }

            val var6: StringBuilder = new StringBuilder();
            var6.append("Unexpected status code while waiting for SMS code: ");
            var6.append(var8);
            Log.i$default(var9, "SmsAuthCodeBroadcastReceiver", var6.toString(), null, 4, null);
         }
      }
   }

   public companion object {
      private const val TAG: String
   }
}
