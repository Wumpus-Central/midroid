package com.discord.device

import A9.s
import android.content.Context
import android.os.Build
import android.os.Build.VERSION
import com.discord.codegen.NativeDeviceModuleSpec
import com.discord.device.react_events.MetricsSize
import com.discord.device.utils.DeviceHardwareInfoKt
import com.discord.device.utils.DeviceMetrics
import com.discord.device.utils.DevicePerformance
import com.discord.device.utils.IsGestureNavigationEnabledKt
import com.discord.device.utils.IsTabletKt
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.WritableNativeMap
import java.util.TimeZone

internal class DeviceModule(reactContext: ReactApplicationContext) : NativeDeviceModuleSpec(var1) {
   private final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   public override fun getMediaPerformanceClass(): Double {
      val var1: DevicePerformance = DevicePerformance.INSTANCE;
      DevicePerformance.INSTANCE.initializePlayServicesDevicePerformance(this.reactContext);
      return var1.getMediaPerformanceClass();
   }

   public open fun getScreenSize(): WritableNativeMap {
      val var1: MetricsSize = DeviceMetrics.INSTANCE.getScreenSize(this.getCurrentActivity());
      if (var1 != null) {
         val var2: WritableNativeMap = var1.serialize();
         if (var2 != null) {
            return var2;
         }
      }

      return MetricsSize.Companion.createScreenFallback();
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, out Any> {
      val var9: Pair = s.a("systemVersion", java.lang.String.valueOf(VERSION.SDK_INT));
      val var1: Pair = s.a("device", Build.DEVICE);
      val var3: Pair = s.a("deviceModel", Build.MODEL);
      val var10: Pair = s.a("deviceBrand", Build.BRAND);
      val var5: Pair = s.a("deviceProduct", Build.PRODUCT);
      val var4: Pair = s.a("deviceManufacturer", Build.MANUFACTURER);
      val var7: Pair = s.a("isGestureNavigationEnabled", IsGestureNavigationEnabledKt.isGestureNavigationEnabled(this.reactContext));
      val var6: Pair = s.a("smallestScreenWidth", IsTabletKt.smallestScreenWidthDp(this.reactContext));
      val var8: Pair = s.a("socName", DeviceHardwareInfoKt.socName());
      val var2: Context = this.reactContext.getApplicationContext();
      return L.m(
         new Pair[]{
            var9,
            var1,
            var3,
            var10,
            var5,
            var4,
            var7,
            var6,
            var8,
            s.a("ramSize", DeviceHardwareInfoKt.ramSize(var2)),
            s.a("maxCpuFreq", DeviceHardwareInfoKt.maxCpuFreq()),
            s.a("timeZone", TimeZone.getDefault().getID())
         }
      );
   }

   public open fun getWindowSize(): WritableNativeMap {
      val var1: MetricsSize = DeviceMetrics.INSTANCE.getWindowSize(this.getCurrentActivity());
      if (var1 != null) {
         val var2: WritableNativeMap = var1.serialize();
         if (var2 != null) {
            return var2;
         }
      }

      return MetricsSize.Companion.createWindowFallback();
   }
}
