package com.discord.app_ready

import com.discord.codegen.NativeApplicationReadyModuleSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext

public class ApplicationReadyModule(reactContext: ReactApplicationContext) : NativeApplicationReadyModuleSpec(var1) {
   @JvmStatic
   fun `applicationReady$lambda$0`(var0: Promise) {
      if (var0 != null) {
         var0.resolve(null);
      }
   }

   public open fun applicationReady(promise: Promise?) {
      this.getReactApplicationContext().runOnNativeModulesQueueThread(new p7.a(var1));
   }
}
