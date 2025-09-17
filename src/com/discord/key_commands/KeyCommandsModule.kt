package com.discord.key_commands

import A9.s
import com.discord.codegen.NativeKeyCommandsModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class KeyCommandsModule(reactContext: ReactApplicationContext) : NativeKeyCommandsModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      return L.m(
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
