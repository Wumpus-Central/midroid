package com.discord.native.engine

import android.content.Context
import co.discord.media_engine.CameraEnumeratorProvider
import co.discord.media_engine.SharedEglBaseContext
import kotlin.jvm.internal.r
import org.webrtc.VideoFrame

public class NativeEngine(context: Context, logLevel: Int) {
   private final val logLevel: Int
   private final val nativeInstance: Long

   @JvmStatic
   fun {
      System.loadLibrary("discord");
   }

   init {
      r.h(var1, "context");
      super();
      this.logLevel = var2;
      var var3: Context = var1.getApplicationContext();
      r.g(var3, "context.applicationContext");
      CameraEnumeratorProvider.maybeInit(var3);
      var3 = var1.getApplicationContext();
      r.g(var3, "context.applicationContext");
      val var4: org.webrtc.EglBase.Context = SharedEglBaseContext.getEglContext();
      r.g(var4, "getEglContext()");
      this.nativeInstance = this.nativeCreateInstance(var3, var4, var2);
   }

   private external fun nativeCreateInstance(context: Context, eglContext: org.webrtc.EglBase.Context, logLevel: Int): Long {
   }

   private external fun nativeDestroyInstance() {
   }

   public external fun createSpeedTestConnection(
      userId: String,
      connectionOptionsJSON: String,
      callback: com.discord.native.engine.NativeEngine.ConnectToServerCallback
   ): NativeSpeedTestConnection {
   }

   public external fun createVoiceConnection(
      userId: String,
      connectionOptionsJSON: String,
      callback: com.discord.native.engine.NativeEngine.ConnectToServerCallback
   ): NativeConnection {
   }

   public fun dispose() {
      this.nativeDestroyInstance();
   }

   public external fun enableBuiltInAEC(enable: Boolean) {
   }

   public external fun getAudioSubsystem(callback: com.discord.native.engine.NativeEngine.GetAudioSubsystemCallback) {
   }

   public external fun getCodecCapabilities(callback: com.discord.native.engine.NativeEngine.GetCodecCapabilitiesCallback) {
   }

   public external fun getCodecSurvey(callback: com.discord.native.engine.NativeEngine.GetCodecSurveyCallback) {
   }

   public external fun getInputDevices(callback: com.discord.native.engine.NativeEngine.GetAudioInputDevicesCallback) {
   }

   public external fun getMLSSigningKeyB64(sessionId: String, signatureVersion: Int, callback: com.discord.native.engine.NativeEngine.MLSSigningKeyCallback) {
   }

   public external fun getMaxSupportedProtocolVersion(): Int {
   }

   public external fun getOutputDevices(callback: com.discord.native.engine.NativeEngine.GetAudioOutputDevicesCallback) {
   }

   public external fun getSupportedVideoCodecs(callback: com.discord.native.engine.NativeEngine.GetSupportedVideoCodecsCallback) {
   }

   public external fun getVideoInputDevices(callback: com.discord.native.engine.NativeEngine.GetVideoInputDevicesCallback) {
   }

   public external fun rankRtcRegions(regionsWithIpsJSON: String, callback: com.discord.native.engine.NativeEngine.GetRankedRtcRegionsCallback) {
   }

   public external fun setAudioInputEnabled(enable: Boolean) {
   }

   public external fun setEmitVADLevel2(enable: Boolean) {
   }

   public external fun setHasFullbandPerformance(hasFullbandPerformance: Boolean) {
   }

   public external fun setInputDevice(deviceIndex: String) {
   }

   public external fun setInputDeviceIndex(deviceIndex: Int) {
   }

   public external fun setInputVolume(volume: Float) {
   }

   public external fun setNoInputThreshold(threshold: Float) {
   }

   public external fun setOnDeviceChangeCallback(callback: com.discord.native.engine.NativeEngine.DeviceChangeCallback) {
   }

   public external fun setOnNoInputCallback(callback: com.discord.native.engine.NativeEngine.OnNoInputCallback) {
   }

   public external fun setOnVoiceCallback(callback: com.discord.native.engine.NativeEngine.OnVoiceCallback) {
   }

   public external fun setOutputDevice(deviceIndex: String) {
   }

   public external fun setOutputDeviceIndex(deviceIndex: Int) {
   }

   public external fun setOutputVolume(volume: Float) {
   }

   public external fun setSidechainCompression(enabled: Boolean) {
   }

   public external fun setTransportOptions(optionsJSON: String) {
   }

   public external fun setVideoInputDevice(deviceIndex: String) {
   }

   public external fun setVideoInputDeviceIndex(deviceIndex: Int) {
   }

   public external fun setVideoOutputSink(streamIdentifier: String, callback: com.discord.native.engine.NativeEngine.VideoFrameCallback?) {
   }

   public external fun startLocalAudioRecording(optionsJSON: String, callback: com.discord.native.engine.NativeEngine.StartLocalAudioRecordingCallback) {
   }

   public external fun stopLocalAudioRecording(callback: com.discord.native.engine.NativeEngine.StopLocalAudioRecordingCallback) {
   }

   public companion object {
      public const val LOGLEVEL_DEBUG: Int
      public const val LOGLEVEL_DEFAULT: Int
   }

   public fun interface ConnectToServerCallback {
      public abstract fun onConnectToServer(info: ConnectionInfo, error: String) {
      }
   }

   public fun interface DeviceChangeCallback {
      public abstract fun onChange(
         audioInputDevices: Array<AudioInputDeviceDescription>,
         audioOutputDevices: Array<AudioOutputDeviceDescription>,
         videoInputDevices: Array<VideoInputDeviceDescription>
      ) {
      }
   }

   public fun interface GetAudioInputDevicesCallback {
      public abstract fun onDevices(devices: Array<AudioInputDeviceDescription>) {
      }
   }

   public fun interface GetAudioOutputDevicesCallback {
      public abstract fun onDevices(devices: Array<AudioOutputDeviceDescription>) {
      }
   }

   public fun interface GetAudioSubsystemCallback {
      public abstract fun onAudioSubsystem(subsystem: String, audioLayer: String) {
      }
   }

   public fun interface GetCodecCapabilitiesCallback {
      public abstract fun onCodecCapabilities(codecs: String) {
      }
   }

   public fun interface GetCodecSurveyCallback {
      public abstract fun onCodecSurvey(jsonStr: String) {
      }
   }

   public fun interface GetRankedRtcRegionsCallback {
      public abstract fun onRankedRtcRegions(regions: Array<String>) {
      }
   }

   public fun interface GetSupportedVideoCodecsCallback {
      public abstract fun onSupportedVideoCodecs(codecs: Array<String>) {
      }
   }

   public fun interface GetVideoInputDevicesCallback {
      public abstract fun onDevices(devices: Array<VideoInputDeviceDescription>) {
      }
   }

   public fun interface MLSSigningKeyCallback {
      public abstract fun onMLSSigningKey(key: String, signature: String) {
      }
   }

   public fun interface OnNoInputCallback {
      public abstract fun onNoInput(input: Boolean) {
      }
   }

   public fun interface OnVoiceCallback {
      public abstract fun onVoice(level: Float, speaking: Int) {
      }
   }

   public fun interface StartLocalAudioRecordingCallback {
      public abstract fun onStartLocalAudioRecording(started: Boolean) {
      }
   }

   public fun interface StopLocalAudioRecordingCallback {
      public abstract fun onStopLocalAudioRecording(fileName: String, durationMs: Int) {
      }
   }

   public fun interface VideoFrameCallback {
      public abstract fun onFrame(frame: VideoFrame): Boolean {
      }
   }
}
