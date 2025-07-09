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
import kotlin.jvm.internal.r
import r9.s
import s9.q

internal class DeviceModule(reactContext: ReactApplicationContext) : NativeDeviceModuleSpec {
   private final val reactContext: ReactApplicationContext

   init {
      r.h(var1, "reactContext");
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
      val var8: Pair = s.a("systemVersion", java.lang.String.valueOf(VERSION.SDK_INT));
      val var3: Pair = s.a("device", Build.DEVICE);
      val var10: Pair = s.a("deviceModel", Build.MODEL);
      val var2: Pair = s.a("deviceBrand", Build.BRAND);
      val var6: Pair = s.a("deviceProduct", Build.PRODUCT);
      val var9: Pair = s.a("deviceManufacturer", Build.MANUFACTURER);
      val var7: Pair = s.a("isGestureNavigationEnabled", IsGestureNavigationEnabledKt.isGestureNavigationEnabled(this.reactContext));
      val var5: Pair = s.a("smallestScreenWidth", IsTabletKt.smallestScreenWidthDp(this.reactContext));
      val var1: Pair = s.a("socName", DeviceHardwareInfoKt.socName());
      val var4: Context = this.reactContext.getApplicationContext();
      r.g(var4, "getApplicationContext(...)");
      return q.m(
         new Pair[]{
            var8,
            var3,
            var10,
            var2,
            var6,
            var9,
            var7,
            var5,
            var1,
            s.a("ramSize", DeviceHardwareInfoKt.ramSize(var4)),
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
