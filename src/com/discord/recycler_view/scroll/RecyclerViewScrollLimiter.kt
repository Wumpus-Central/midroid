package com.discord.recycler_view.scroll

public object RecyclerViewScrollLimiter {
   public const val MAX_FLING_VELOCITY: Int = 12500

   public fun getClampedVelocity(velocity: Int): Int {
      return if (var1 < 0) Math.max(var1, -12500) else Math.min(var1, 12500);
   }
}
