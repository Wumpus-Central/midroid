package com.discord.recycler_view.scroll

public object RecyclerViewScrollLimiter {
   public const val MAX_FLING_VELOCITY: Int = 12500

   public fun getClampedVelocity(velocity: Int): Int {
      if (var1 < 0) {
         var1 = Math.max(var1, -12500);
      } else {
         var1 = Math.min(var1, 12500);
      }

      return var1;
   }
}
