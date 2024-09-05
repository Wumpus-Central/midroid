package com.discord.app_ready

import com.discord.codegen.NativeApplicationReadyManagerSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q
import u4.a

public class ApplicationReadyModule(reactContext: ReactApplicationContext) : NativeApplicationReadyManagerSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   @JvmStatic
   fun `applicationReady$lambda$0`(var0: Promise) {
      if (var0 != null) {
         var0.resolve(null);
      }
   }

   public override fun applicationReady(promise: Promise?) {
      this.getReactApplicationContext().runOnNativeModulesQueueThread(new a(var1));
   }

   public companion object {
      public const val NAME: String
   }
}
