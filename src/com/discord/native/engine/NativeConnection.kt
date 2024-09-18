package com.discord.native.engine

import org.webrtc.VideoCapturer

public class NativeConnection {
   private final val nativeInstance: Long

   private external fun nativeDestroyInstance() {
   }

   public external fun configureConnectionRetries(baseDelayMs: Int, maxDelayMs: Int, maxAttempts: Int) {
   }

   public external fun destroyUser(userId: String) {
   }

   public fun dispose() {
      this.nativeDestroyInstance();
   }

   public external fun executeSecureFramesTransition(transitionId: Int) {
   }

   public external fun fastUdpReconnect() {
   }

   public external fun getEncryptionModes(callback: com.discord.native.engine.NativeConnection.GetEncryptionModesCallback) {
   }

   public external fun getFilteredStats(filter: Int, callback: com.discord.native.engine.NativeConnection.GetStatsCallback) {
   }

   public external fun getMLSKeyPackageB64(callback: com.discord.native.engine.NativeConnection.MLSKeyPackageCallback) {
   }

   public external fun getStats(callback: com.discord.native.engine.NativeConnection.GetStatsCallback) {
   }

   public external fun mergeUsers(usersJSON: String) {
   }

   public external fun prepareMLSCommitTransitionB64(
      transitionId: Int,
      commit: String,
      callback: com.discord.native.engine.NativeConnection.MLSCommitTransitionCallback
   ) {
   }

   public external fun prepareSecureFramesEpoch(epoch: String, transitionId: Int, groupId: String) {
   }

   public external fun prepareSecureFramesTransition(
      transitionId: Int,
      protocolVersion: Int,
      callback: com.discord.native.engine.NativeConnection.SecureFramesTransitionReadyCallback
   ) {
   }

   public external fun processMLSProposalsB64(proposals: String, callback: com.discord.native.engine.NativeConnection.MLSProcessProposalsCallback) {
   }

   public external fun processMLSWelcomeB64(transitionId: Int, welcome: String, callback: com.discord.native.engine.NativeConnection.MLSWelcomeCallback) {
   }

   public external fun setDesktopSource(stringId: String, useVideoHook: Boolean, type: String) {
   }

   public external fun setLocalMute(userId: String, mute: Boolean) {
   }

   public external fun setLocalPan(userId: String, left: Float, right: Float) {
   }

   public external fun setLocalVolume(userId: String, volume: Float) {
   }

   public external fun setMinimumOutputDelay(delay: Int) {
   }

   public external fun setNoInputThreshold(threshold: Float) {
   }

   public external fun setOnFirstFrameCallback(callback: com.discord.native.engine.NativeConnection.OnFirstFrameCallback) {
   }

   public external fun setOnMLSFailureCallback(callback: com.discord.native.engine.NativeConnection.MLSFailureCallback) {
   }

   public external fun setOnPingCallback(callback: com.discord.native.engine.NativeConnection.OnPingCallback) {
   }

   public external fun setOnPingTimeoutCallback(callback: com.discord.native.engine.NativeConnection.OnPingTimeoutCallback) {
   }

   public external fun setOnSpeakingCallback(callback: com.discord.native.engine.NativeConnection.OnSpeakingCallback) {
   }

   public external fun setOnVideoCallback(callback: com.discord.native.engine.NativeConnection.OnVideoCallback) {
   }

   public external fun setPTTActive(active: Boolean, priority: Boolean) {
   }

   public external fun setPingInterval(pingInterval: Int) {
   }

   public external fun setSecureFramesStateUpdateCallback(callback: com.discord.native.engine.NativeConnection.SecureFramesStateUpdateCallback) {
   }

   public external fun setSelfDeafen(deafened: Boolean) {
   }

   public external fun setSelfMute(muted: Boolean) {
   }

   public external fun setTransportOptions(optionsJSON: String) {
   }

   public external fun setVideoBroadcast(broadcasting: Boolean) {
   }

   public external fun startBroadcast(capturer: VideoCapturer, soundshareNativeInstance: Long) {
   }

   public external fun stopBroadcast() {
   }

   public external fun updateMLSExternalSenderB64(externalSenderB64: String) {
   }

   public fun interface GetEncryptionModesCallback {
      public abstract fun onEncryptionModes(modes: Array<String>) {
      }
   }

   public fun interface GetStatsCallback {
      public abstract fun onStats(stats: String) {
      }
   }

   public fun interface MLSCommitTransitionCallback {
      public abstract fun onMLSProcessedCommit(processedCommit: Boolean, protocolVersion: Int, rosterChange: String) {
      }
   }

   public fun interface MLSFailureCallback {
      public abstract fun onMLSFailureCallback(source: String, reason: String) {
      }
   }

   public fun interface MLSKeyPackageCallback {
      public abstract fun onMLSKeyPackage(keyPackageB64: String) {
      }
   }

   public fun interface MLSProcessProposalsCallback {
      public abstract fun onMLSCommitWelcome(commitWelcome: String) {
      }
   }

   public fun interface MLSWelcomeCallback {
      public abstract fun onMLSProcessedWelcome(joinedGroup: Boolean, protocolVersion: Int, rosterChange: String) {
      }
   }

   public fun interface OnFirstFrameCallback {
      public abstract fun onFirstFrame(userId: String, videoSsrc: Long, streamId: String) {
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

   public fun interface OnSpeakingCallback {
      public abstract fun onSpeaking(userId: String, speakingFlags: Int) {
      }
   }

   public fun interface OnVideoCallback {
      public abstract fun onVideo(userId: String, ssrc: Long, streamId: String, videoStreamParametersJson: String) {
      }
   }

   public fun interface SecureFramesStateUpdateCallback {
      public abstract fun onSecureFramesStateUpdateCallback(stateUpdateJSON: String) {
      }
   }

   public fun interface SecureFramesTransitionReadyCallback {
      public abstract fun onTransitionReady() {
      }
   }
}
