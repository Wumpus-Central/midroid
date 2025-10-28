package com.discord.reactevents

import Dc.a
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.WritableMap
import wc.w

public interface ReactEvent {
   public open fun serialize(): WritableMap {
   }

   // $VF: Class flags could not be determined
   internal class DefaultImpls {
      @JvmStatic
      fun serialize(var0: ReactEvent): WritableMap {
         return NativeMapExtensionsKt.toNativeMap(a.b.e(w.d(var0.getClass()), var0));
      }
   }
}
