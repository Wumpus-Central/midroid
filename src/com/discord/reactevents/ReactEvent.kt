package com.discord.reactevents

import cl.a
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.WritableMap
import vk.j

public interface ReactEvent {
   public open fun serialize(): WritableMap {
   }

   // $VF: Class flags could not be determined
   internal class DefaultImpls {
      @JvmStatic
      fun serialize(var0: ReactEvent): WritableMap {
         return NativeMapExtensionsKt.toNativeMap(a.b.e(j.d(var0.getClass()), var0));
      }
   }
}
