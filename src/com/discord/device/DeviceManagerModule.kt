package com.discord.device

import android.os.Build
import android.os.Build.VERSION
import com.discord.codegen.NativeDeviceManagerSpec
import com.discord.device.utils.DeviceHardwareInfoKt
import com.discord.device.utils.IsGestureNavigationEnabledKt
import com.discord.device.utils.IsTabletKt
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import kotlin.jvm.internal.q
import vj.w
import wj.r

@ReactModule(name = "RTNDeviceManager")
public class DeviceManagerModule(reactContext: ReactApplicationContext) : NativeDeviceManagerSpec {
   private final val reactContext: ReactApplicationContext

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   public override fun getName(): String {
      return "RTNDeviceManager";
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, out Any> {
      return r.m(
         new Pair[]{
            w.a("systemVersion", java.lang.String.valueOf(VERSION.SDK_INT)),
            w.a("device", Build.DEVICE),
            w.a("deviceModel", Build.MODEL),
            w.a("deviceBrand", Build.BRAND),
            w.a("deviceProduct", Build.PRODUCT),
            w.a("deviceManufacturer", Build.MANUFACTURER),
            w.a("isTablet", IsTabletKt.isTablet(this.reactContext)),
            w.a("isGestureNavigationEnabled", IsGestureNavigationEnabledKt.isGestureNavigationEnabled(this.reactContext)),
            w.a("isTaskBarEnabled", java.lang.Boolean.FALSE),
            w.a("smallestScreenWidth", IsTabletKt.smallestScreenWidthDp(this.reactContext)),
            w.a("socName", DeviceHardwareInfoKt.socName()),
            w.a("ramSize", DeviceHardwareInfoKt.ramSize()),
            w.a("maxCpuFreq", DeviceHardwareInfoKt.maxCpuFreq())
         }
      );
   }

   public companion object {
      public const val NAME: String
   }
}
