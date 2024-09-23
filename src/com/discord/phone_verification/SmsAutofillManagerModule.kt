package com.discord.phone_verification

import com.discord.phone_verification.reactevents.VerificationCodeReceivedEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import fh.w
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

public class SmsAutofillManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactEvents: ReactEvents
   private final val smsAutofillManager: SmsAutofillManager

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactEvents = new ReactEvents(w.a("verificationCodeReceived", g0.b(VerificationCodeReceivedEvent.class)));
      this.smsAutofillManager = new SmsAutofillManager(var1, new Function1(this, var1) {
         final ReactApplicationContext $reactContext;
         final SmsAutofillManagerModule this$0;

         {
            super(1);
            this.this$0 = var1;
            this.$reactContext = var2;
         }

         public final void invoke(java.lang.String var1) {
            q.h(var1, "it");
            SmsAutofillManagerModule.access$getReactEvents$p(this.this$0).emitModuleEvent(this.$reactContext, new VerificationCodeReceivedEvent(var1));
         }
      });
   }

   @ReactMethod
   public fun addListener(type: String) {
      q.h(var1, "type");
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
