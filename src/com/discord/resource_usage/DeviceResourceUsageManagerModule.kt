package com.discord.resource_usage

import android.os.Process
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.q

public class DeviceResourceUsageManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val deviceResourceUsageManager: DeviceResourceUsageManager

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.deviceResourceUsageManager = new DeviceResourceUsageManager(0L, 1, null);
   }

   @ReactMethod
   public fun getCpuCoreCount(callback: Callback) {
      q.h(var1, "callback");
      var1.invoke(this.deviceResourceUsageManager.getCpuCoreCount());
   }

   @ReactMethod
   public fun getCumulativeCpuUsage(callback: Callback) {
      q.h(var1, "callback");
      var1.invoke((double)Process.getElapsedCpuTime() / (double)f.c(this.deviceResourceUsageManager.getCpuCoreCount(), 1) / (double)1000);
   }

   @ReactMethod
   public fun getCurrentCpuUsagePercent(callback: Callback) {
      q.h(var1, "callback");
      var1.invoke(this.deviceResourceUsageManager.getCpuUsagePercent());
   }

   @ReactMethod
   public fun getCurrentMemoryUsageKb(callback: Callback) {
      q.h(var1, "callback");
      var1.invoke(this.deviceResourceUsageManager.getMemoryRssKB());
   }

   public override fun getName(): String {
      return "SystemResourceManager";
   }

   @ReactMethod
   public fun getNetworkUsage(callback: Callback) {
      q.h(var1, "callback");
      val var3: DeviceResourceUsageRecorder.Companion = DeviceResourceUsageRecorder.Companion;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      var1.invoke(var3.getNetworkUsage(var2));
   }

   public override fun initialize() {
      super.initialize();
      this.deviceResourceUsageManager.start();
   }

   public override fun invalidate() {
      super.invalidate();
      this.deviceResourceUsageManager.stop();
   }
}
