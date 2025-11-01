package com.discord.phone_verification

import android.content.Context
import android.content.IntentFilter
import androidx.core.content.a
import hg.b

internal class SmsAutofillManager(context: Context, onSMSRetrieved: (String) -> Unit) {
   private final val context: Context
   private final val broadcastReceiver: SmsAuthCodeBroadcastReceiver

   init {
      this.context = var1;
      this.broadcastReceiver = new SmsAuthCodeBroadcastReceiver(var2);
   }

   public fun registerReceiver() {
      a.l(this.context, this.broadcastReceiver, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), 2);
   }

   public fun startSmsRetriever() {
      val var1: b = hg.a.a(this.context);
      var1.C();
   }

   public fun unregisterReceiver() {
      try {
         this.context.unregisterReceiver(this.broadcastReceiver);
      } catch (var2: Exception) {
      }
   }
}
