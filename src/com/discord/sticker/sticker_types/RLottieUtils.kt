package com.discord.sticker.sticker_types

import com.discord.logging.Log
import com.discord.rlottie.RLottie

public object RLottieUtils {
   internal final var initialized: Boolean

   @JvmStatic
   fun `init$lambda$0`(): Unit {
      INSTANCE.initAsync();
      return Unit.a;
   }

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
      Ba.a.b(false, false, null, "RLottieLoader", 0, new f(), 23, null);
   }
}
