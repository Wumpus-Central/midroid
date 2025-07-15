package com.discord.key_commands

import com.discord.codegen.NativeKeyCommandsModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.r
import r9.s
import s9.q

public class KeyCommandsModule(reactContext: ReactApplicationContext) : NativeKeyCommandsModuleSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      return q.m(
         new Pair[]{
            s.a("keyModifierAlphaShift", 65536),
            s.a("keyModifierShift", 131072),
            s.a("keyModifierControl", 262144),
            s.a("keyModifierAlternate", 524288),
            s.a("keyModifierCommand", 1048576),
            s.a("keyModifierNumericPad", 2097152)
         }
      );
   }
}
