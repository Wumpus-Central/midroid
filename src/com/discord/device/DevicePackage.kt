package com.discord.device

import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager
import kotlin.jvm.internal.r

public class DevicePackage : BaseReactPackage {
   public open fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, LayoutShadowNode>> {
      r.h(var1, "reactContext");
      return i.k();
   }

   public open fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
      r.h(var1, "name");
      r.h(var2, "reactContext");
      switch (var1.hashCode()) {
         case -2084303303:
            if (var1.equals("NativeDeviceModule")) {
               return new DeviceModule(var2);
            }
            break;
         case -1818315972:
            if (var1.equals("NativeDeviceSettingsModule")) {
               return new DeviceSettingsModule(var2);
            }
            break;
         case -140406925:
            if (var1.equals("NativeDeviceLocaleModule")) {
               return new DeviceLocaleModule(var2);
            }
            break;
         case 63901357:
            if (var1.equals("NativeDeviceAccessibilityModule")) {
               return new DeviceAccessibilityModule(var2);
            }
            break;
         case 1229995667:
            if (var1.equals("NativeDeviceThermalStateModule")) {
               return new DeviceThermalStateModule(var2);
            }
         default:
      }

      return null;
   }

   public open fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
      return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(
         i.n(
            new java.lang.String[]{
               "NativeDeviceAccessibilityModule",
               "NativeDeviceLocaleModule",
               "NativeDeviceModule",
               "NativeDeviceSettingsModule",
               "NativeDeviceThermalStateModule"
            }
         ),
         false,
         2,
         null
      );
   }
}
