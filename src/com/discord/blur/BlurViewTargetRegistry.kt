package com.discord.blur

import com.discord.blur.BlurViewAPI.Target
import java.util.HashSet
import java.util.WeakHashMap
import kotlin.jvm.internal.q

internal object BlurViewTargetRegistry {
   private final val registryBlurViewTargets: WeakHashMap<String, Target> = new WeakHashMap()
   private final val registryChangeListeners: HashSet<() -> Unit> = new HashSet()

   public fun add(nativeId: String, blurViewTarget: Target) {
      q.h(var1, "nativeId");
      q.h(var2, "blurViewTarget");
      registryBlurViewTargets.put(var1, var2);
   }

   public fun addChangeListener(onChange: () -> Unit) {
      q.h(var1, "onChange");
      registryChangeListeners.add(var1);
   }

   public fun get(nativeId: String): Target? {
      q.h(var1, "nativeId");
      return registryBlurViewTargets.get(var1);
   }

   public fun remove(nativeId: String) {
      q.h(var1, "nativeId");
      registryBlurViewTargets.remove(var1);
   }

   public fun removeChangeListener(onChange: () -> Unit) {
      q.h(var1, "onChange");
      registryChangeListeners.remove(var1);
   }
}
