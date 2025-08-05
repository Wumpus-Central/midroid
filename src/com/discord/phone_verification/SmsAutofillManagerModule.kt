package com.discord.phone_verification

import B9.s
import a2.d
import com.discord.phone_verification.reactevents.VerificationCodeReceivedEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r

public class SmsAutofillManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactEvents: ReactEvents
   private final val smsAutofillManager: SmsAutofillManager

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactEvents = new ReactEvents(s.a("verificationCodeReceived", H.b(VerificationCodeReceivedEvent.class)));
      this.smsAutofillManager = new SmsAutofillManager(var1, new d(this, var1));
   }

   @JvmStatic
   fun `smsAutofillManager$lambda$0`(var0: SmsAutofillManagerModule, var1: ReactApplicationContext, var2: java.lang.String): Unit {
      r.h(var2, "it");
      var0.reactEvents.emitModuleEvent(var1, new VerificationCodeReceivedEvent(var2));
      return Unit.a;
   }

   @ReactMethod
   public fun addListener(type: String) {
      r.h(var1, "type");
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
