package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import kc.a;

public abstract class NativeDeviceModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeDeviceModule";

   public NativeDeviceModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @a
   @Override
   public final Map<String, Object> getConstants() {
      Map var1 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var2 = new HashSet<>(
            Arrays.asList(
               "device",
               "deviceBrand",
               "deviceManufacturer",
               "deviceModel",
               "deviceProduct",
               "isGestureNavigationEnabled",
               "maxCpuFreq",
               "ramSize",
               "smallestScreenWidth",
               "socName",
               "systemVersion",
               "timeZone"
            )
         );
         HashSet var4 = new HashSet();
         HashSet var3 = new HashSet(var1.keySet());
         var3.removeAll(var2);
         var3.removeAll(var4);
         if (!var3.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", var3));
         }

         var2.removeAll(var1.keySet());
         if (!var2.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", var2));
         }
      }

      return var1;
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract double getMediaPerformanceClass();

   @Override
   public String getName() {
      return "NativeDeviceModule";
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract WritableMap getScreenSize();

   protected abstract Map<String, Object> getTypedExportedConstants();

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract WritableMap getWindowSize();
}
