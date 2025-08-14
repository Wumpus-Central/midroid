package com.discord.blur

import com.discord.blur.BlurViewAPI.Target
import java.util.HashSet
import java.util.WeakHashMap

internal object BlurViewTargetRegistry {
   private final val registryBlurViewTargets: WeakHashMap<String, Target> = new WeakHashMap()
   private final val registryChangeListeners: HashSet<() -> Unit> = new HashSet()

   public fun add(nativeId: String, blurViewTarget: Target) {
      registryBlurViewTargets.put(var1, var2);
   }

   public fun addChangeListener(onChange: () -> Unit) {
      registryChangeListeners.add(var1);
   }

   public fun get(nativeId: String): Target? {
      return registryBlurViewTargets.get(var1);
   }

   public fun remove(nativeId: String) {
      registryBlurViewTargets.remove(var1);
   }

   public fun removeChangeListener(onChange: () -> Unit) {
      registryChangeListeners.remove(var1);
   }
}
