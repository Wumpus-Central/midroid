package com.discord.key_commands

import Ca.v
import com.discord.codegen.NativeKeyCommandsModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class KeyCommandsModule(reactContext: ReactApplicationContext) : NativeKeyCommandsModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      return O.n(
         new Pair[]{
            v.a("keyModifierAlphaShift", 65536),
            v.a("keyModifierShift", 131072),
            v.a("keyModifierControl", 262144),
            v.a("keyModifierAlternate", 524288),
            v.a("keyModifierCommand", 1048576),
            v.a("keyModifierNumericPad", 2097152)
         }
      );
   }
}
