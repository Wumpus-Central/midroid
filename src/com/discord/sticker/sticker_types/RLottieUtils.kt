package com.discord.sticker.sticker_types

import com.discord.logging.Log
import com.discord.rlottie.RLottie

public object RLottieUtils {
   internal final var initialized: Boolean

   private fun UnsatisfiedLinkError.warn() {
      Log.INSTANCE.w("RLottie", "Unable to load animated sticker library.", var1);
   }

   public fun init() {
      try {
         RLottie.INSTANCE.init();
         initialized = true;
      } catch (var2: UnsatisfiedLinkError) {
         this.warn(var2);
      }
   }
}
