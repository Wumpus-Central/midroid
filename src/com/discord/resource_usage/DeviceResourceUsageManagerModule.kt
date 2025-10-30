package com.discord.resource_usage

import android.os.Process
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

public class DeviceResourceUsageManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val deviceResourceUsageManager: DeviceResourceUsageManager

   init {
      this.deviceResourceUsageManager = new DeviceResourceUsageManager(var1);
   }

   @ReactMethod
   public fun getCpuCoreCount(callback: Callback) {
      var1.invoke(this.deviceResourceUsageManager.getCpuCoreCount());
   }

   @ReactMethod
   public fun getCumulativeCpuUsage(callback: Callback) {
      var1.invoke((double)Process.getElapsedCpuTime() / (double)e.e(this.deviceResourceUsageManager.getCpuCoreCount(), 1) / (double)1000);
   }

   @ReactMethod
   public fun getCurrentCpuUsagePercent(callback: Callback) {
      var1.invoke(this.deviceResourceUsageManager.getCpuUsagePercent());
   }

   @ReactMethod
   public fun getCurrentMemoryUsageKb(callback: Callback) {
      var1.invoke(this.deviceResourceUsageManager.getMemoryRssKB());
   }

   public override fun getName(): String {
      return "SystemResourceManager";
   }

   @ReactMethod
   public fun getNetworkUsage(callback: Callback) {
      val var2: DeviceResourceUsageRecorder.Companion = DeviceResourceUsageRecorder.Companion;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      var1.invoke(var2.getNetworkUsage(var3));
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
