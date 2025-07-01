package com.discord.codegen;

import J3.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public abstract class NativeDeviceLocaleModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeDeviceLocaleModule";

   public NativeDeviceLocaleModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @a
   public final Map<String, Object> getConstants() {
      Map var1 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var2 = new HashSet<>(Arrays.asList("Language", "Languages"));
         HashSet var3 = new HashSet();
         HashSet var4 = new HashSet(var1.keySet());
         var4.removeAll(var2);
         var4.removeAll(var3);
         if (!var4.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", var4));
         }

         var2.removeAll(var1.keySet());
         if (!var2.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", var2));
         }
      }

      return var1;
   }

   public String getName() {
      return "NativeDeviceLocaleModule";
   }

   protected abstract Map<String, Object> getTypedExportedConstants();
}
