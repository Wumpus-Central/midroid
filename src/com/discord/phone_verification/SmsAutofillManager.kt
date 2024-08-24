package com.discord.phone_verification

import android.content.Context
import android.content.IntentFilter
import kotlin.jvm.internal.r

internal class SmsAutofillManager(context: Context, onSMSRetrieved: (String) -> Unit) {
   private final val context: Context
   private final val broadcastReceiver: SmsAuthCodeBroadcastReceiver

   init {
      r.h(var1, "context");
      r.h(var2, "onSMSRetrieved");
      super();
      this.context = var1;
      this.broadcastReceiver = new SmsAuthCodeBroadcastReceiver(var2);
   }

   public fun registerReceiver() {
      androidx.core.content.a.k(this.context, this.broadcastReceiver, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), 2);
   }

   public fun startSmsRetriever() {
      val var1: r9.b = r9.a.a(this.context);
      r.g(var1, "getClient(context)");
      var1.H();
   }

   public fun unregisterReceiver() {
      try {
         this.context.unregisterReceiver(this.broadcastReceiver);
      } catch (var2: Exception) {
      }
   }
}
