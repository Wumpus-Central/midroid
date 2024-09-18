package com.discord.reactevents

import cl.j
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.WritableMap
import jl.a

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
