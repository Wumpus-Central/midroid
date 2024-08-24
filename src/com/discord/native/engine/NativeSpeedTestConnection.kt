package com.discord.native.engine

public class NativeSpeedTestConnection {
   private final val nativeInstance: Long

   private external fun nativeDestroyInstance() {
   }

   public fun dispose() {
      this.nativeDestroyInstance();
   }

   public external fun getEncryptionModes(callback: com.discord.native.engine.NativeSpeedTestConnection.GetEncryptionModesCallback) {
   }

   public external fun getNetworkOverhead(callback: com.discord.native.engine.NativeSpeedTestConnection.GetNetworkOverheadCallback) {
   }

   public external fun setOnPingCallback(callback: com.discord.native.engine.NativeSpeedTestConnection.OnPingCallback) {
   }

   public external fun setOnPingTimeoutCallback(callback: com.discord.native.engine.NativeSpeedTestConnection.OnPingTimeoutCallback) {
   }

   public external fun setPingInterval(pingInterval: Int) {
   }

   public external fun setTransportOptions(optionsJSON: String) {
   }

   public external fun startSpeedTestReceiver(optionsJSON: String, callback: com.discord.native.engine.NativeSpeedTestConnection.StartSpeedTestReceiverCallback) {
   }

   public external fun startSpeedTestSender(optionsJSON: String, callback: com.discord.native.engine.NativeSpeedTestConnection.StartSpeedTestSenderCallback) {
   }

   public external fun stopSpeedTestReceiver(callback: com.discord.native.engine.NativeSpeedTestConnection.StopSpeedTestReceiverCallback) {
   }

   public external fun stopSpeedTestSender() {
   }

   public fun interface GetEncryptionModesCallback {
      public abstract fun onEncryptionModes(modes: Array<String>) {
      }
   }

   public fun interface GetNetworkOverheadCallback {
      public abstract fun onNetworkOverhead(overhead: Int) {
      }
   }

   public fun interface OnPingCallback {
      public abstract fun onPing(ping: Int, server: String, port: Int, seq: Int) {
      }
   }

   public fun interface OnPingTimeoutCallback {
      public abstract fun onPingTimeout(server: String, port: Int, seq: Int, timeout: Int) {
      }
   }

   public fun interface StartSpeedTestReceiverCallback {
      public abstract fun onReady() {
      }
   }

   public fun interface StartSpeedTestSenderCallback {
      public abstract fun onDone(code: Int, description: String) {
      }
   }

   public fun interface StopSpeedTestReceiverCallback {
      public abstract fun onResults(version: Int, results: String) {
      }
   }
}
