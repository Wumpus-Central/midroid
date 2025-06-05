package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import v3.a;

public abstract class NativeKeyCommandsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "RTNKeyCommandsModule";

   public NativeKeyCommandsModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @a
   public final Map<String, Object> getConstants() {
      Map var1 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var3 = new HashSet<>(
            Arrays.asList(
               "keyModifierAlphaShift", "keyModifierAlternate", "keyModifierCommand", "keyModifierControl", "keyModifierNumericPad", "keyModifierShift"
            )
         );
         HashSet var4 = new HashSet();
         HashSet var2 = new HashSet(var1.keySet());
         var2.removeAll(var3);
         var2.removeAll(var4);
         if (!var2.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", var2));
         }

         var3.removeAll(var1.keySet());
         if (!var3.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", var3));
         }
      }

      return var1;
   }

   public String getName() {
      return "RTNKeyCommandsModule";
   }

   protected abstract Map<String, Object> getTypedExportedConstants();
}
