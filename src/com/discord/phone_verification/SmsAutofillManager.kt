package com.discord.phone_verification

import android.content.Context
import android.content.IntentFilter
import androidx.core.content.a
import kotlin.jvm.internal.q
import y9.b

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
      a.k(this.context, this.broadcastReceiver, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), 2);
   }

   public fun startSmsRetriever() {
      val var1: b = y9.a.a(this.context);
      q.g(var1, "getClient(...)");
      var1.H();
   }

   public fun unregisterReceiver() {
      try {
         this.context.unregisterReceiver(this.broadcastReceiver);
      } catch (var2: Exception) {
      }
   }
}
