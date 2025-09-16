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
      var1.invoke(new Object[]{this.deviceResourceUsageManager.getCpuCoreCount()});
   }

   @ReactMethod
   public fun getCumulativeCpuUsage(callback: Callback) {
      var1.invoke(new Object[]{(double)Process.getElapsedCpuTime() / (double)d.d(this.deviceResourceUsageManager.getCpuCoreCount(), 1) / (double)1000});
   }

   @ReactMethod
   public fun getCurrentCpuUsagePercent(callback: Callback) {
      var1.invoke(new Object[]{this.deviceResourceUsageManager.getCpuUsagePercent()});
   }

   @ReactMethod
   public fun getCurrentMemoryUsageKb(callback: Callback) {
      var1.invoke(new Object[]{this.deviceResourceUsageManager.getMemoryRssKB()});
   }

   public open fun getName(): String {
      return "SystemResourceManager";
   }

   @ReactMethod
   public fun getNetworkUsage(callback: Callback) {
      val var3: DeviceResourceUsageRecorder.Companion = DeviceResourceUsageRecorder.Companion;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      var1.invoke(new Object[]{var3.getNetworkUsage(var2)});
   }

   public open fun initialize() {
      super.initialize();
      this.deviceResourceUsageManager.start();
   }

   public open fun invalidate() {
      super.invalidate();
      this.deviceResourceUsageManager.stop();
   }
}
