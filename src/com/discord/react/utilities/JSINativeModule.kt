package com.discord.react.utilities

import kotlin.jvm.internal.q

public object JSINativeModule {
   private final var loaded: Boolean?

   @JvmStatic
   private external fun nativeInstall(jsi: Long) {
   }

   public fun install(jsi: Long): Boolean {
      if (loaded == null) {
         var var3: java.lang.Boolean;
         try {
            System.loadLibrary("react_utilities");
            nativeInstall(var1);
            var3 = java.lang.Boolean.TRUE;
         } catch (var4: Exception) {
            var3 = java.lang.Boolean.FALSE;
         }

         loaded = var3;
      }

      val var5: java.lang.Boolean = loaded;
      q.e(loaded);
      return var5;
   }
}
