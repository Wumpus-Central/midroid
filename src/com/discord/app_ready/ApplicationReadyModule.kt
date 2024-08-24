package com.discord.app_ready

import c3.a
import com.discord.codegen.NativeApplicationReadyManagerSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.r

public class ApplicationReadyModule(reactContext: ReactApplicationContext) : NativeApplicationReadyManagerSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   @JvmStatic
   fun `applicationReady$lambda$0`(var0: Promise) {
      if (var0 != null) {
         var0.resolve(null);
      }
   }

   public open fun applicationReady(promise: Promise?) {
      this.getReactApplicationContext().runOnNativeModulesQueueThread(new a(var1));
   }

   public companion object {
      public const val NAME: String
   }
}
