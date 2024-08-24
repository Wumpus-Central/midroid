package com.discord.modules.proximitysensor

import android.content.Context
import android.os.PowerManager
import kotlin.jvm.internal.r

public interface ProximityWakeLock {
   public abstract fun acquire() {
   }

   public abstract fun release() {
   }

   public companion object {
      public fun create(context: Context, timeout: Long, tag: String): ProximityWakeLock {
         r.h(var1, "context");
         r.h(var4, "tag");
         val var5: Any = var1.getSystemService("power");
         r.f(var5, "null cannot be cast to non-null type android.os.PowerManager");
         return new ProximityWakeLockImpl(var5 as PowerManager, var2, var4);
      }
   }
}
