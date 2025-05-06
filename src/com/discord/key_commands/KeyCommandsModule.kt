package com.discord.key_commands

import com.discord.codegen.NativeKeyCommandsModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q
import l8.w

public class KeyCommandsModule(reactContext: ReactApplicationContext) : NativeKeyCommandsModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      return m8.q.m(
         new Pair[]{
            w.a("keyModifierAlphaShift", 65536),
            w.a("keyModifierShift", 131072),
            w.a("keyModifierControl", 262144),
            w.a("keyModifierAlternate", 524288),
            w.a("keyModifierCommand", 1048576),
            w.a("keyModifierNumericPad", 2097152)
         }
      );
   }
}
