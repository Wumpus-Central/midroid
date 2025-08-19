package com.discord.codegen;

import I3.a;
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
      Map var3 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var2 = new HashSet<>(Arrays.asList("Language", "Languages"));
         HashSet var4 = new HashSet();
         HashSet var1 = new HashSet(var3.keySet());
         var1.removeAll(var2);
         var1.removeAll(var4);
         if (!var1.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", var1));
         }

         var2.removeAll(var3.keySet());
         if (!var2.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", var2));
         }
      }

      return var3;
   }

   public String getName() {
      return "NativeDeviceLocaleModule";
   }

   protected abstract Map<String, Object> getTypedExportedConstants();
}
