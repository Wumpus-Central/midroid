package com.discord.sticker.sticker_types

import com.discord.logging.Log
import com.discord.rlottie.RLottie
import l8.a

public object RLottieUtils {
   internal final var initialized: Boolean

   private fun initAsync() {
      try {
         RLottie.INSTANCE.init();
         initialized = true;
      } catch (var2: UnsatisfiedLinkError) {
         this.warn(var2);
      }
   }

   private fun UnsatisfiedLinkError.warn() {
      Log.INSTANCE.w("RLottie", "Unable to load animated sticker library.", var1);
   }

   public fun init() {
      a.b(false, false, null, "RLottieLoader", 0, <unrepresentable>.INSTANCE, 23, null);
   }
}
