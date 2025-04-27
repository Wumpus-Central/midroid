package com.discord.phone_verification

import android.content.Context
import android.content.IntentFilter
import kotlin.jvm.internal.q

internal class SmsAutofillManager(context: Context, onSMSRetrieved: (String) -> Unit) {
   private final val context: Context
   private final val broadcastReceiver: SmsAuthCodeBroadcastReceiver

   init {
      q.h(var1, "context");
      q.h(var2, "onSMSRetrieved");
      super();
      this.context = var1;
      this.broadcastReceiver = new SmsAuthCodeBroadcastReceiver(var2);
   }

   public fun registerReceiver() {
      androidx.core.content.a.k(this.context, this.broadcastReceiver, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), 2);
   }

   public fun startSmsRetriever() {
      val var1: G4.b = G4.a.a(this.context);
      q.g(var1, "getClient(...)");
      var1.I();
   }

   public fun unregisterReceiver() {
      try {
         this.context.unregisterReceiver(this.broadcastReceiver);
      } catch (var2: Exception) {
      }
   }
}
