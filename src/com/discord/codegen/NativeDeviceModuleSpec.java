package com.discord.codegen;

import K3.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public abstract class NativeDeviceModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeDeviceModule";

   public NativeDeviceModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @a
   public final Map<String, Object> getConstants() {
      Map var4 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var1 = new HashSet<>(
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
         HashSet var2 = new HashSet();
         HashSet var3 = new HashSet(var4.keySet());
         var3.removeAll(var1);
         var3.removeAll(var2);
         if (!var3.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", var3));
         }

         var1.removeAll(var4.keySet());
         if (!var1.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", var1));
         }
      }

      return var4;
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract double getMediaPerformanceClass();

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
