package com.discord.device

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
import kotlin.jvm.internal.q
import m8.w

internal class DeviceModule(reactContext: ReactApplicationContext) : NativeDeviceModuleSpec {
   private final val reactContext: ReactApplicationContext

   init {
      q.h(var1, "reactContext");
      super(var1);
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
      val var8: Pair = w.a("systemVersion", java.lang.String.valueOf(VERSION.SDK_INT));
      val var6: Pair = w.a("device", Build.DEVICE);
      val var10: Pair = w.a("deviceModel", Build.MODEL);
      val var9: Pair = w.a("deviceBrand", Build.BRAND);
      val var5: Pair = w.a("deviceProduct", Build.PRODUCT);
      val var2: Pair = w.a("deviceManufacturer", Build.MANUFACTURER);
      val var3: Pair = w.a("isGestureNavigationEnabled", IsGestureNavigationEnabledKt.isGestureNavigationEnabled(this.reactContext));
      val var7: Pair = w.a("smallestScreenWidth", IsTabletKt.smallestScreenWidthDp(this.reactContext));
      val var1: Pair = w.a("socName", DeviceHardwareInfoKt.socName());
      val var4: Context = this.reactContext.getApplicationContext();
      q.g(var4, "getApplicationContext(...)");
      return n8.q.m(
         new Pair[]{
            var8,
            var6,
            var10,
            var9,
            var5,
            var2,
            var3,
            var7,
            var1,
            w.a("ramSize", DeviceHardwareInfoKt.ramSize(var4)),
            w.a("maxCpuFreq", DeviceHardwareInfoKt.maxCpuFreq()),
            w.a("timeZone", TimeZone.getDefault().getID())
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
