package com.discord.phone_verification

import C5.a
import android.content.Context
import android.content.IntentFilter
import androidx.core.content.b

internal class SmsAutofillManager(context: Context, onSMSRetrieved: (String) -> Unit) {
   private final val context: Context
   private final val broadcastReceiver: SmsAuthCodeBroadcastReceiver

   init {
      this.context = var1;
      this.broadcastReceiver = new SmsAuthCodeBroadcastReceiver(var2);
   }

   public fun registerReceiver() {
      b.k(this.context, this.broadcastReceiver, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), 2);
   }

   public fun startSmsRetriever() {
      val var1: C5.b = a.a(this.context);
      var1.I();
   }

   public fun unregisterReceiver() {
      try {
         this.context.unregisterReceiver(this.broadcastReceiver);
      } catch (var2: Exception) {
      }
   }
}
