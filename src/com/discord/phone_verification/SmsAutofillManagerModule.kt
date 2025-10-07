package com.discord.phone_verification

import B9.s
import X1.d
import com.discord.phone_verification.reactevents.VerificationCodeReceivedEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

public class SmsAutofillManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val reactEvents: ReactEvents = new ReactEvents(s.a("verificationCodeReceived", VerificationCodeReceivedEvent::class))
   private final val smsAutofillManager: SmsAutofillManager

   init {
      this.smsAutofillManager = new SmsAutofillManager(var1, new d(this, var1));
   }

   @JvmStatic
   fun `smsAutofillManager$lambda$0`(var0: SmsAutofillManagerModule, var1: ReactApplicationContext, var2: java.lang.String): Unit {
      var0.reactEvents.emitModuleEvent(var1, new VerificationCodeReceivedEvent(var2));
      return Unit.a;
   }

   @ReactMethod
   public fun addListener(type: String) {
   }

   public open fun getName(): String {
      return "SmsAutofillManager";
   }

   public open fun initialize() {
      super.initialize();
      this.smsAutofillManager.registerReceiver();
   }

   public open fun invalidate() {
      this.smsAutofillManager.unregisterReceiver();
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun startSmsRetriever() {
      this.smsAutofillManager.startSmsRetriever();
   }
}
