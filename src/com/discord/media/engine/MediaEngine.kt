package com.discord.media.engine

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Bitmap.CompressFormat
import android.media.MediaCodecInfo
import android.media.MediaCodecList
import android.os.Build
import android.os.Build.VERSION
import android.util.Base64
import com.discord.async_init.AsyncInitDispatcher
import com.discord.logging.Log
import com.discord.media.engine.types.Debug
import com.discord.media.engine.types.NativeTypeExtensionsKt
import com.discord.media.engine.video.screen_capture.ScreenCapturer
import com.discord.media.engine.video.screen_capture.ThumbnailEmitter
import com.discord.native.engine.AudioInputDeviceDescription
import com.discord.native.engine.AudioOutputDeviceDescription
import com.discord.native.engine.ConnectionInfo
import com.discord.native.engine.NativeConnection
import com.discord.native.engine.NativeEngine
import com.discord.native.engine.VideoInputDeviceDescription
import com.discord.native.engine.NativeEngine.DeviceChangeCallback
import com.discord.native.engine.NativeEngine.GetAudioSubsystemCallback
import com.discord.native.engine.NativeEngine.OnNoInputCallback
import com.discord.native.engine.NativeEngine.OnVoiceCallback
import com.discord.native.engine.NativeEngine.VideoFrameCallback
import java.io.ByteArrayOutputStream
import java.util.ArrayList
import kk.c0
import kk.n0
import kk.v1
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4
import kotlin.jvm.internal.r
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import org.json.JSONArray
import org.json.JSONObject
import org.webrtc.VideoFrame
import org.webrtc.voiceengine.WebRtcAudioManager

public class MediaEngine(context: Context, coroutineDispatcher: CoroutineDispatcher = n0.a()) {
   private final val context: Context
   private final val instanceCreationNs: Long
   private final val engineConnections: MediaEngineNativeConnections
   private final var screenCapturer: com.discord.media.engine.MediaEngine.ScreenCapturerForConnection?
   private final var activeSinksChangeCallback: ((String, Boolean) -> Unit)?
   private final val dispatcher: AsyncInitDispatcher
   private final val coroutineScope: CoroutineScope
   private final var engineInstance: NativeEngine?

   private final val engine: NativeEngine
      private final get() {
         if (this.engineInstance != null) {
            return this.engineInstance;
         } else {
            val var2: Debug = Debug.INSTANCE;
            System.nanoTime();
            WebRtcAudioManager.setBlacklistDeviceForOpenSLESUsage(OPEN_SL_DEVICE_ALLOW_LIST.contains(Build.MODEL) xor true);
            val var3: NativeEngine = new NativeEngine(this.context, 2);
            var3.enableBuiltInAEC(true);
            var3.setAudioInputEnabled(false);
            this.engineInstance = var3;
            this.dispatcher.setInitialized(true);
            return var3;
         }
      }


   init {
      r.h(var1, "context");
      r.h(var2, "coroutineDispatcher");
      super();
      this.context = var1;
      this.instanceCreationNs = System.nanoTime();
      this.engineConnections = new MediaEngineNativeConnections();
      this.dispatcher = new AsyncInitDispatcher("MediaEngine", 0L, 2, null);
      this.coroutineScope = kotlinx.coroutines.g.a(var2.N0(new c0("MediaEngine")));
   }

   @JvmStatic
   fun `connectionInstanceGetEncryptionModes$lambda$56`(var0: Function1, var1: Array<java.lang.String>) {
      r.h(var0, "$callback");
      r.h(var1, "modes");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `connectionInstanceGetFilteredStats$lambda$58`(var0: Function1, var1: java.lang.String) {
      r.h(var0, "$callback");
      r.h(var1, "stats");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `connectionInstanceGetMLSKeyPackageB64$lambda$60`(var0: Function1, var1: java.lang.String) {
      r.h(var0, "$callback");
      r.h(var1, "keyPackageB64");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `connectionInstanceGetStats$lambda$57`(var0: Function1, var1: java.lang.String) {
      r.h(var0, "$callback");
      r.h(var1, "stats");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `connectionInstancePrepareMLSCommitTransitionB64$lambda$62`(var0: Function3, var1: Boolean, var2: Int, var3: java.lang.String) {
      r.h(var0, "$callback");
      r.h(var3, "rosterChange");
      var0.invoke(var1, var2, var3);
   }

   @JvmStatic
   fun `connectionInstancePrepareSecureFramesTransition$lambda$59`(var0: Function0) {
      r.h(var0, "$callback");
      var0.invoke();
   }

   @JvmStatic
   fun `connectionInstanceProcessMLSProposalsB64$lambda$61`(var0: Function1, var1: java.lang.String) {
      r.h(var0, "$callback");
      r.h(var1, "commitWelcome");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `connectionInstanceProcessMLSWelcomeB64$lambda$63`(var0: Function3, var1: Boolean, var2: Int, var3: java.lang.String) {
      r.h(var0, "$callback");
      r.h(var3, "rosterChange");
      var0.invoke(var1, var2, var3);
   }

   @JvmStatic
   fun `connectionInstanceSetOnFirstFrameCallback$lambda$50`(var0: Function3, var1: java.lang.String, var2: Long, var4: java.lang.String) {
      r.h(var0, "$cb");
      r.h(var1, "userId");
      r.h(var4, "streamId");
      var0.invoke(var1, var2, var4);
   }

   @JvmStatic
   fun `connectionInstanceSetOnMLSFailureCallback$lambda$52`(var0: Function2, var1: java.lang.String, var2: java.lang.String) {
      r.h(var0, "$cb");
      r.h(var1, "source");
      r.h(var2, "reason");
      var0.invoke(var1, var2);
   }

   @JvmStatic
   fun `connectionInstanceSetOnPingCallback$lambda$48`(var0: Function4, var1: Int, var2: java.lang.String, var3: Int, var4: Int) {
      r.h(var0, "$cb");
      r.h(var2, "server");
      var0.invoke(var1, var2, var3, var4);
   }

   @JvmStatic
   fun `connectionInstanceSetOnPingTimeoutCallback$lambda$49`(var0: Function4, var1: java.lang.String, var2: Int, var3: Int, var4: Int) {
      r.h(var0, "$cb");
      r.h(var1, "server");
      var0.invoke(var1, var2, var3, var4);
   }

   @JvmStatic
   fun `connectionInstanceSetOnSpeakingCallback$lambda$47`(var0: Function2, var1: java.lang.String, var2: Int) {
      r.h(var0, "$cb");
      r.h(var1, "userId");
      var0.invoke(var1, var2);
   }

   @JvmStatic
   fun `connectionInstanceSetOnVideoCallback$lambda$51`(var0: Function4, var1: java.lang.String, var2: Long, var4: java.lang.String, var5: java.lang.String) {
      r.h(var0, "$cb");
      r.h(var1, "userId");
      r.h(var4, "streamId");
      r.h(var5, "videoStreamParametersJSON");
      var0.invoke(var1, var2, var4, var5);
   }

   @JvmStatic
   fun `connectionInstanceSetSecureFramesStateUpdateCallback$lambda$53`(var0: Function1, var1: java.lang.String) {
      r.h(var0, "$cb");
      r.h(var1, "stateUpdateJSON");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `createVoiceConnection$lambda$45`(var0: Function2, var1: ConnectionInfo, var2: java.lang.String) {
      r.h(var0, "$callback");
      r.h(var1, "connectionInfo");
      r.h(var2, "errorMessage");
      val var4: Log = Log.INSTANCE;
      val var3: StringBuilder = new StringBuilder();
      var3.append("On created with ");
      var3.append(var1);
      var3.append(", ");
      var3.append(var2);
      Log.i$default(var4, "MediaEngine", var3.toString(), null, 4, null);
      var0.invoke(var2, NativeTypeExtensionsKt.toMap(var1));
   }

   private fun forceStopScreenCapturer() {
      if (this.screenCapturer != null) {
         this.screenCapturer.release();
      }

      this.screenCapturer = null;
   }

   @JvmStatic
   fun `getCodecCapabilities$lambda$32$lambda$31`(var0: Function1, var1: java.lang.String) {
      r.h(var0, "$callback");
      r.h(var1, "codecs");
      var0.invoke(var1);
   }

   private fun getConnection(connectionId: Int, methodName: String): NativeConnection? {
      val var3: NativeConnection = this.engineConnections.get(var1);
      if (var3 == null) {
         val var4: Log = Log.INSTANCE;
         val var5: StringBuilder = new StringBuilder();
         var5.append("[");
         var5.append(var2);
         var5.append("] no NativeConnection for connectionId=");
         var5.append(var1);
         var5.append(", returning null");
         Log.w$default(var4, "MediaEngine", var5.toString(), null, 4, null);
      }

      return var3;
   }

   @JvmStatic
   fun `getInputDevices$lambda$10$lambda$9`(var0: Function1, var1: Array<AudioInputDeviceDescription>) {
      r.h(var0, "$callback");
      r.h(var1, "devices");
      var0.invoke(NativeTypeExtensionsKt.toListOfMaps(var1));
   }

   @JvmStatic
   fun `getMLSSigningKeyB64$lambda$64`(var0: Function2, var1: java.lang.String, var2: java.lang.String) {
      r.h(var0, "$callback");
      r.h(var1, "key");
      r.h(var2, "signature");
      var0.invoke(var1, var2);
   }

   @JvmStatic
   fun `getOutputDevices$lambda$15$lambda$14`(var0: Function1, var1: Array<AudioOutputDeviceDescription>) {
      r.h(var0, "$callback");
      r.h(var1, "devices");
      var0.invoke(NativeTypeExtensionsKt.toListOfMaps(var1));
   }

   @JvmStatic
   fun `getSupportedVideoCodecs$lambda$29$lambda$28`(var0: Function1, var1: Array<java.lang.String>) {
      r.h(var0, "$callback");
      r.h(var1, "codecs");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `getVideoInputDevices$lambda$20$lambda$19`(var0: Function1, var1: Array<VideoInputDeviceDescription>) {
      r.h(var0, "$callback");
      r.h(var1, "videoInputDevices");
      var0.invoke(NativeTypeExtensionsKt.toListOfMaps(var1));
   }

   @JvmStatic
   fun `rankRtcRegions$lambda$38$lambda$37`(var0: Function1, var1: Array<java.lang.String>) {
      r.h(var0, "$callback");
      r.h(var1, "regions");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `startLocalAudioRecording$lambda$40`(var0: Function1, var1: Boolean) {
      r.h(var0, "$callback");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `stopLocalAudioRecording$lambda$42$lambda$41`(var0: Function2, var1: java.lang.String, var2: Int) {
      r.h(var0, "$callback");
      r.h(var1, "fileName");
      var0.invoke(var1, var2);
   }

   private fun stopScreenCapturerForConnection(connectionId: Int) {
      var var2: Boolean = false;
      if (this.screenCapturer != null) {
         var2 = false;
         if (this.screenCapturer.getConnectionId() == var1) {
            var2 = true;
         }
      }

      if (var2) {
         if (this.screenCapturer != null) {
            this.screenCapturer.release();
         }

         this.screenCapturer = null;
      }
   }

   internal fun activeSinksChanged(streamId: String, active: Boolean): Unit? {
      r.h(var1, "streamId");
      val var4: Unit;
      if (this.activeSinksChangeCallback != null) {
         this.activeSinksChangeCallback.invoke(var1, var2);
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceConfigureConnectionRetries(connectionId: Int, baseDelayMs: Int, maxDelayMs: Int, maxAttempts: Int): Unit? {
      val var5: NativeConnection = this.getConnection(var1, "configureConnectionRetries");
      val var6: Unit;
      if (var5 != null) {
         var5.configureConnectionRetries(var2, var3, var4);
         var6 = Unit.a;
      } else {
         var6 = null;
      }

      return var6;
   }

   internal fun connectionInstanceDestroy(connectionId: Int) {
      this.stopScreenCapturerForConnection(var1);
      this.engineConnections.removeAndDispose(var1);
   }

   internal fun connectionInstanceDestroyUser(connectionId: Int, userId: String): Unit? {
      r.h(var2, "userId");
      val var3: NativeConnection = this.getConnection(var1, "destroyUser");
      val var4: Unit;
      if (var3 != null) {
         var3.destroyUser(var2);
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceExecuteSecureFramesTransition(connectionId: Int, transitionId: Int): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "executeSecureFramesTransition");
      val var4: Unit;
      if (var3 != null) {
         var3.executeSecureFramesTransition(var2);
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceFastUdpReconnect(connectionId: Int): Unit? {
      val var2: NativeConnection = this.getConnection(var1, "fastUdpReconnect");
      val var3: Unit;
      if (var2 != null) {
         var2.fastUdpReconnect();
         var3 = Unit.a;
      } else {
         var3 = null;
      }

      return var3;
   }

   internal fun connectionInstanceGetEncryptionModes(connectionId: Int, callback: (Array<String>) -> Unit): Unit? {
      r.h(var2, "callback");
      val var3: NativeConnection = this.getConnection(var1, "getEncryptionModes");
      val var4: Unit;
      if (var3 != null) {
         var3.getEncryptionModes(new w(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceGetFilteredStats(connectionId: Int, filter: Int, callback: (String) -> Unit): Unit? {
      r.h(var3, "callback");
      val var4: NativeConnection = this.getConnection(var1, "getFilteredStats");
      val var5: Unit;
      if (var4 != null) {
         var4.getFilteredStats(var2, new e(var3));
         var5 = Unit.a;
      } else {
         var5 = null;
      }

      return var5;
   }

   internal fun connectionInstanceGetMLSKeyPackageB64(connectionId: Int, callback: (String) -> Unit): Unit? {
      r.h(var2, "callback");
      val var3: NativeConnection = this.getConnection(var1, "getMLSKeyPackageB64");
      val var4: Unit;
      if (var3 != null) {
         var3.getMLSKeyPackageB64(new j(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceGetStats(connectionId: Int, callback: (String) -> Unit): Unit? {
      r.h(var2, "callback");
      val var3: NativeConnection = this.getConnection(var1, "getStats");
      val var4: Unit;
      if (var3 != null) {
         var3.getStats(new p(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceMergeUsers(connectionId: Int, usersJSON: String): Unit? {
      r.h(var2, "usersJSON");
      val var3: NativeConnection = this.getConnection(var1, "mergeUsers");
      val var4: Unit;
      if (var3 != null) {
         var3.mergeUsers(var2);
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstancePrepareMLSCommitTransitionB64(connectionId: Int, transitionId: Int, commit: String, callback: (Boolean, Int, String) -> Unit): Unit? {
      r.h(var3, "commit");
      r.h(var4, "callback");
      val var5: NativeConnection = this.getConnection(var1, "prepareMLSCommitTransitionB64");
      val var6: Unit;
      if (var5 != null) {
         var5.prepareMLSCommitTransitionB64(var2, var3, new x(var4));
         var6 = Unit.a;
      } else {
         var6 = null;
      }

      return var6;
   }

   internal fun connectionInstancePrepareSecureFramesEpoch(connectionId: Int, epoch: String, transitionId: Int, groupId: String): Unit? {
      r.h(var2, "epoch");
      r.h(var4, "groupId");
      val var5: NativeConnection = this.getConnection(var1, "prepareSecureFramesEpoch");
      val var6: Unit;
      if (var5 != null) {
         var5.prepareSecureFramesEpoch(var2, var3, var4);
         var6 = Unit.a;
      } else {
         var6 = null;
      }

      return var6;
   }

   internal fun connectionInstancePrepareSecureFramesTransition(connectionId: Int, transitionId: Int, protocolVersion: Int, callback: () -> Unit): Unit? {
      r.h(var4, "callback");
      val var5: NativeConnection = this.getConnection(var1, "prepareSecureFramesTransition");
      val var6: Unit;
      if (var5 != null) {
         var5.prepareSecureFramesTransition(var2, var3, new u(var4));
         var6 = Unit.a;
      } else {
         var6 = null;
      }

      return var6;
   }

   internal fun connectionInstanceProcessMLSProposalsB64(connectionId: Int, proposals: String, callback: (String) -> Unit): Unit? {
      r.h(var2, "proposals");
      r.h(var3, "callback");
      val var4: NativeConnection = this.getConnection(var1, "processMLSProposalsB64");
      val var5: Unit;
      if (var4 != null) {
         var4.processMLSProposalsB64(var2, new n(var3));
         var5 = Unit.a;
      } else {
         var5 = null;
      }

      return var5;
   }

   internal fun connectionInstanceProcessMLSWelcomeB64(connectionId: Int, transitionId: Int, welcome: String, callback: (Boolean, Int, String) -> Unit): Unit? {
      r.h(var3, "welcome");
      r.h(var4, "callback");
      val var5: NativeConnection = this.getConnection(var1, "processMLSWelcomeB64");
      val var6: Unit;
      if (var5 != null) {
         var5.processMLSWelcomeB64(var2, var3, new m(var4));
         var6 = Unit.a;
      } else {
         var6 = null;
      }

      return var6;
   }

   internal fun connectionInstanceSetLocalMute(connectionId: Int, userId: String, mute: Boolean): Unit? {
      r.h(var2, "userId");
      val var4: NativeConnection = this.getConnection(var1, "setLocalMute");
      val var5: Unit;
      if (var4 != null) {
         var4.setLocalMute(var2, var3);
         var5 = Unit.a;
      } else {
         var5 = null;
      }

      return var5;
   }

   internal fun connectionInstanceSetLocalPan(connectionId: Int, userId: String, left: Float, right: Float): Unit? {
      r.h(var2, "userId");
      val var5: NativeConnection = this.getConnection(var1, "setLocalPan");
      val var6: Unit;
      if (var5 != null) {
         var5.setLocalPan(var2, var3, var4);
         var6 = Unit.a;
      } else {
         var6 = null;
      }

      return var6;
   }

   internal fun connectionInstanceSetLocalVolume(connectionId: Int, userId: String, volume: Float): Unit? {
      r.h(var2, "userId");
      val var4: NativeConnection = this.getConnection(var1, "setLocalVolume");
      val var5: Unit;
      if (var4 != null) {
         var4.setLocalVolume(var2, var3);
         var5 = Unit.a;
      } else {
         var5 = null;
      }

      return var5;
   }

   internal fun connectionInstanceSetMinimumOutputDelay(connectionId: Int, delay: Int): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setMinimumOutputDelay");
      val var4: Unit;
      if (var3 != null) {
         var3.setMinimumOutputDelay(var2);
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetNoInputThreshold(connectionId: Int, threshold: Float): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setNoInputThreshold");
      val var4: Unit;
      if (var3 != null) {
         var3.setNoInputThreshold(var2);
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetOnFirstFrameCallback(connectionId: Int, cb: (String, Long, String) -> Unit): Unit? {
      r.h(var2, "cb");
      val var3: NativeConnection = this.getConnection(var1, "setOnFirstFrameCallback");
      val var4: Unit;
      if (var3 != null) {
         var3.setOnFirstFrameCallback(new b(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetOnMLSFailureCallback(connectionId: Int, cb: (String, String) -> Unit): Unit? {
      r.h(var2, "cb");
      val var3: NativeConnection = this.getConnection(var1, "setOnMLSFailureCallback");
      val var4: Unit;
      if (var3 != null) {
         var3.setOnMLSFailureCallback(new a(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetOnPingCallback(connectionId: Int, cb: (Int, String, Int, Int) -> Unit): Unit? {
      r.h(var2, "cb");
      val var3: NativeConnection = this.getConnection(var1, "setOnPingCallback");
      val var4: Unit;
      if (var3 != null) {
         var3.setOnPingCallback(new c(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetOnPingTimeoutCallback(connectionId: Int, cb: (String, Int, Int, Int) -> Unit): Unit? {
      r.h(var2, "cb");
      val var3: NativeConnection = this.getConnection(var1, "setOnPingTimeoutCallback");
      val var4: Unit;
      if (var3 != null) {
         var3.setOnPingTimeoutCallback(new g(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetOnSpeakingCallback(connectionId: Int, cb: (String, Int) -> Unit): Unit? {
      r.h(var2, "cb");
      val var3: NativeConnection = this.getConnection(var1, "setOnSpeakingCallback");
      val var4: Unit;
      if (var3 != null) {
         var3.setOnSpeakingCallback(new v(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetOnVideoCallback(connectionId: Int, cb: (String, Long, String, String) -> Unit): Unit? {
      r.h(var2, "cb");
      val var3: NativeConnection = this.getConnection(var1, "setOnVideoCallback");
      val var4: Unit;
      if (var3 != null) {
         var3.setOnVideoCallback(new z(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetPTTActive(connectionId: Int, active: Boolean, priority: Boolean): Unit? {
      val var4: NativeConnection = this.getConnection(var1, "setPTTActive");
      val var5: Unit;
      if (var4 != null) {
         var4.setPTTActive(var2, var3);
         var5 = Unit.a;
      } else {
         var5 = null;
      }

      return var5;
   }

   internal fun connectionInstanceSetPingInterval(connectionId: Int, pingInterval: Int): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setPingInterval");
      val var4: Unit;
      if (var3 != null) {
         var3.setPingInterval(var2);
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetSecureFramesStateUpdateCallback(connectionId: Int, cb: (String) -> Unit): Unit? {
      r.h(var2, "cb");
      val var3: NativeConnection = this.getConnection(var1, "setSecureFramesStateUpdateCallback");
      val var4: Unit;
      if (var3 != null) {
         var3.setSecureFramesStateUpdateCallback(new q(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetSelfDeafen(connectionId: Int, deafened: Boolean): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setSelfDeafen");
      val var4: Unit;
      if (var3 != null) {
         var3.setSelfDeafen(var2);
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetSelfMute(connectionId: Int, muted: Boolean): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setSelfMute");
      val var4: Unit;
      if (var3 != null) {
         var3.setSelfMute(var2);
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetTransportOptions(connectionId: Int, optionsJSON: String): Unit? {
      r.h(var2, "optionsJSON");
      val var3: NativeConnection = this.getConnection(var1, "setTransportOptions");
      val var4: Unit;
      if (var3 != null) {
         var3.setTransportOptions(var2);
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetVideoBroadcast(connectionId: Int, broadcasting: Boolean): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setVideoBroadcast");
      val var4: Unit;
      if (var3 != null) {
         var3.setVideoBroadcast(var2);
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceStartBroadcast(connectionId: Int, permissions: Intent) {
      r.h(var2, "permissions");
      val var3: NativeConnection = this.getConnection(var1, "startBroadcast");
      if (var3 != null) {
         this.forceStopScreenCapturer();
         val var4: ScreenCapturer = new ScreenCapturer(var2);
         this.screenCapturer = new MediaEngine.ScreenCapturerForConnection(var4, var1);
         var3.startBroadcast(var4, var4.getSoundshare().getNativeInstance());
      }
   }

   internal fun connectionInstanceStopBroadcast(connectionId: Int) {
      val var2: NativeConnection = this.getConnection(var1, "stopBroadcast");
      if (var2 != null) {
         var2.stopBroadcast();
      }

      this.stopScreenCapturerForConnection(var1);
   }

   internal fun connectionInstanceStopBroadcastWithError(connectionId: Int, errorCode: Int, errorMessage: String) {
      r.h(var3, "errorMessage");
      val var4: NativeConnection = this.getConnection(var1, "stopBroadcastWithError");
      if (var4 != null) {
         var4.stopBroadcast();
      }

      this.stopScreenCapturerForConnection(var1);
   }

   internal fun connectionInstanceUpdateMLSExternalSenderB64(connectionId: Int, externalSender: String): Unit? {
      r.h(var2, "externalSender");
      val var3: NativeConnection = this.getConnection(var1, "updateMLSExternalSenderB64");
      val var4: Unit;
      if (var3 != null) {
         var3.updateMLSExternalSenderB64(var2);
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   public fun createVoiceConnection(connectionId: Int, userId: String, connectionOptionsJSON: String, callback: (String, Map<String, Any>) -> Unit) {
      r.h(var2, "userId");
      r.h(var3, "connectionOptionsJSON");
      r.h(var4, "callback");
      this.engineConnections.register(var1, this.getEngine().createVoiceConnection(var2, var3, new d(var4)));
   }

   internal fun getAudioSubsystem(cb: (String, String) -> Unit) {
      r.h(var1, "cb");
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).getAudioSubsystem(new GetAudioSubsystemCallback(var1) {
            final Function2<java.lang.String, java.lang.String, Unit> $cb;

            {
               this.$cb = var1;
            }

            public final void onAudioSubsystem(java.lang.String var1, java.lang.String var2) {
               r.h(var1, "subsystem");
               r.h(var2, "audioLayer");
               this.$cb.invoke(var1, var2);
            }
         });
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final Function2 $cb$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$cb$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).getAudioSubsystem(new GetAudioSubsystemCallback(this.$cb$inlined) {
                  final Function2<java.lang.String, java.lang.String, Unit> $cb;

                  {
                     this.$cb = var1;
                  }

                  public final void onAudioSubsystem(java.lang.String var1, java.lang.String var2) {
                     r.h(var1, "subsystem");
                     r.h(var2, "audioLayer");
                     this.$cb.invoke(var1, var2);
                  }
               });
            }
         });
      }
   }

   internal fun getCodecCapabilities(callback: (String) -> Unit) {
      r.h(var1, "callback");
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().getCodecCapabilities(new y(var1));
      } else {
         var1.invoke("{}");
      }
   }

   internal fun getCodecSurvey(callback: (String) -> Unit) {
      r.h(var1, "callback");
      val var6: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var6.getInitialized()) {
         val var10: JSONObject = new JSONObject();
         var var9: Array<java.lang.String> = new java.lang.String[0];
         var var8: Array<java.lang.String> = new java.lang.String[0];
         val var15: Array<MediaCodecInfo> = new MediaCodecList(0).getCodecInfos();
         r.g(var15, "codecList.codecInfos");
         val var2: Int = var15.length;

         for (int var3 = 0; var3 < var2; var3++) {
            val var11: MediaCodecInfo = var15[var3];
            val var12: java.lang.String = var15[var3].getName();
            r.g(var12, "codecInfo.name");
            val var13: Array<java.lang.String> = var11.getSupportedTypes();
            r.g(var13, "codecInfo.supportedTypes");
            val var7: ArrayList = new ArrayList();
            val var5: Int = var13.length;

            for (int var4 = 0; var4 < var5; var4++) {
               val var14: java.lang.String = var13[var4];
               r.g(var13[var4], "type");
               if (kotlin.text.f.I(var14, "video", false, 2, null)) {
                  var7.add(var14);
               }
            }

            for (java.lang.String var20 : var7) {
               val var17: java.lang.String;
               if (VERSION.SDK_INT >= 29) {
                  if (com.discord.a.a(var11)) {
                     var17 = "(HW)";
                  } else {
                     var17 = "(SW)";
                  }
               } else {
                  var17 = "";
               }

               val var18: java.lang.String = kotlin.collections.h.k0(
                  kotlin.collections.h.l(new java.lang.String[]{var20, var12, var17}), " ", null, null, 0, null, null, 62, null
               );
               if (var11.isEncoder()) {
                  var9 = kotlin.collections.b.p(var9, var18) as java.lang.String[];
               } else {
                  var8 = kotlin.collections.b.p(var8, var18) as java.lang.String[];
               }
            }
         }

         var10.put("available_video_encoders", new JSONArray(var9));
         var10.put("available_video_decoders", new JSONArray(var8));
         val var16: java.lang.String = var10.toString();
         r.g(var16, "codecJson.toString()");
         var1.invoke(var16);
      } else {
         var1.invoke("{}");
      }
   }

   internal fun getInputDevices(callback: (List<Map<String, Any>>) -> Unit) {
      r.h(var1, "callback");
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().getInputDevices(new k(var1));
      } else {
         var1.invoke(kotlin.collections.h.i());
      }
   }

   internal fun getMLSSigningKeyB64(sessionId: String, signatureVersion: Int, callback: (String, String) -> Unit) {
      r.h(var1, "sessionId");
      r.h(var3, "callback");
      this.getEngine().getMLSSigningKeyB64(var1, var2, new i(var3));
   }

   internal fun getOutputDevices(callback: (List<Map<String, Any>>) -> Unit) {
      r.h(var1, "callback");
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().getOutputDevices(new t(var1));
      } else {
         var1.invoke(kotlin.collections.h.i());
      }
   }

   internal fun getSupportedVideoCodecs(callback: (Array<String>) -> Unit) {
      r.h(var1, "callback");
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().getSupportedVideoCodecs(new s(var1));
      } else {
         var1.invoke(new java.lang.String[0]);
      }
   }

   internal fun getVideoInputDevices(callback: (List<Map<String, Any>>) -> Unit) {
      r.h(var1, "callback");
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().getVideoInputDevices(new l(var1));
      } else {
         var1.invoke(kotlin.collections.h.i());
      }
   }

   internal fun rankRtcRegions(regionsWithIpsJSON: String, callback: (Array<String>) -> Unit) {
      r.h(var1, "regionsWithIpsJSON");
      r.h(var2, "callback");
      val var3: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var3.getInitialized()) {
         this.getEngine().rankRtcRegions(var1, new o(var2));
      } else {
         var2.invoke(new java.lang.String[0]);
      }
   }

   public fun reset() {
      System.nanoTime();
      kotlinx.coroutines.g.f(this.coroutineScope, null, 1, null);
      this.dispatcher.reset();
      this.forceStopScreenCapturer();
      this.engineConnections.removeAndDisposeAll();
      if (this.engineInstance != null) {
         this.engineInstance.dispose();
      }

      this.engineInstance = null;
      val var2: Debug = Debug.INSTANCE;
   }

   internal fun setActiveSinksChangeCallback(cb: (String, Boolean) -> Unit) {
      r.h(var1, "cb");
      this.activeSinksChangeCallback = var1;
   }

   internal fun setAudioInputEnabled(enabled: Boolean) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setAudioInputEnabled(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final boolean $enabled$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$enabled$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setAudioInputEnabled(this.$enabled$inlined);
            }
         });
      }
   }

   internal fun setBroadcastThumbnailParams(width: Int, height: Int, intervalSeconds: Int, callback: (String) -> Unit) {
      r.h(var4, "callback");
      if (this.screenCapturer != null) {
         this.screenCapturer
            .component1()
            .setThumbnailEmitter(
               new ThumbnailEmitter(
                  var1,
                  var2,
                  (long)var3 * 1000L,
                  new Function1<Bitmap, Unit>(this, var4)// $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.StackOverflowError
         //   at org.jetbrains.java.decompiler.struct.gen.MethodDescriptor.parseDescriptor(MethodDescriptor.java:80)
         //   at org.jetbrains.java.decompiler.struct.StructMethod.methodDescriptor(StructMethod.java:371)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1649)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
         
               )
            );
      }
   }

   internal fun setDeviceChangeCallback(callback: (List<Map<String, Any>>, List<Map<String, Any>>, List<Map<String, Any>>) -> Unit) {
      r.h(var1, "callback");
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this)
            .setOnDeviceChangeCallback(
               new DeviceChangeCallback(var1) {
                  final Function3<java.util.List<? extends java.util.Map<java.lang.String, ? extends Object>>, java.util.List<? extends java.util.Map<java.lang.String, ? extends Object>>, java.util.List<? extends java.util.Map<java.lang.String, ? extends Object>>, Unit> $callback;

                  {
                     this.$callback = var1;
                  }

                  public final void onChange(AudioInputDeviceDescription[] var1, AudioOutputDeviceDescription[] var2, VideoInputDeviceDescription[] var3) {
                     r.h(var1, "inputDevices");
                     r.h(var2, "outputDevices");
                     r.h(var3, "videoInputDevices");
                     this.$callback
                        .invoke(NativeTypeExtensionsKt.toListOfMaps(var1), NativeTypeExtensionsKt.toListOfMaps(var2), NativeTypeExtensionsKt.toListOfMaps(var3));
                  }
               }
            );
      } else {
         var2.getDelayedTasks()
            .add(
               new Function0<Unit>(this, var1) {
                  final Function3 $callback$inlined;
                  final MediaEngine this$0;

                  {
                     super(0);
                     this.this$0 = var1;
                     this.$callback$inlined = var2;
                  }

                  public final void invoke() {
                     MediaEngine.access$getEngine(this.this$0)
                        .setOnDeviceChangeCallback(
                           new DeviceChangeCallback(this.$callback$inlined) {
                              final Function3<java.util.List<? extends java.util.Map<java.lang.String, ? extends Object>>, java.util.List<? extends java.util.Map<java.lang.String, ? extends Object>>, java.util.List<? extends java.util.Map<java.lang.String, ? extends Object>>, Unit> $callback;

                              {
                                 this.$callback = var1;
                              }

                              public final void onChange(
                                 AudioInputDeviceDescription[] var1, AudioOutputDeviceDescription[] var2, VideoInputDeviceDescription[] var3
                              ) {
                                 r.h(var1, "inputDevices");
                                 r.h(var2, "outputDevices");
                                 r.h(var3, "videoInputDevices");
                                 this.$callback
                                    .invoke(
                                       NativeTypeExtensionsKt.toListOfMaps(var1),
                                       NativeTypeExtensionsKt.toListOfMaps(var2),
                                       NativeTypeExtensionsKt.toListOfMaps(var3)
                                    );
                              }
                           }
                        );
                  }
               }
            );
      }
   }

   internal fun setEmitVADLevel2(enable: Boolean) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setEmitVADLevel2(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final boolean $enable$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$enable$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setEmitVADLevel2(this.$enable$inlined);
            }
         });
      }
   }

   internal fun setHasFullbandPerformance(hasFullbandPerformance: Boolean) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setHasFullbandPerformance(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final boolean $hasFullbandPerformance$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$hasFullbandPerformance$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setHasFullbandPerformance(this.$hasFullbandPerformance$inlined);
            }
         });
      }
   }

   internal fun setInputDevice(deviceIndex: Int) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setInputDeviceIndex(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final int $deviceIndex$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$deviceIndex$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setInputDeviceIndex(this.$deviceIndex$inlined);
            }
         });
      }
   }

   internal fun setInputDevice(deviceIndex: String) {
      r.h(var1, "deviceIndex");
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setInputDevice(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final java.lang.String $deviceIndex$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$deviceIndex$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setInputDevice(this.$deviceIndex$inlined);
            }
         });
      }
   }

   internal fun setInputVolume(volume: Float) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setInputVolume(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final float $volume$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$volume$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setInputVolume(this.$volume$inlined);
            }
         });
      }
   }

   internal fun setNoInputThreshold(threshold: Float) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setNoInputThreshold(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final float $threshold$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$threshold$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setNoInputThreshold(this.$threshold$inlined);
            }
         });
      }
   }

   internal fun setOnNoInputCallback(cb: (Boolean) -> Unit) {
      r.h(var1, "cb");
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setOnNoInputCallback(new OnNoInputCallback(var1) {
            final Function1<java.lang.Boolean, Unit> $cb;

            {
               this.$cb = var1;
            }

            public final void onNoInput(boolean var1) {
               this.$cb.invoke(var1);
            }
         });
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final Function1 $cb$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$cb$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setOnNoInputCallback(new OnNoInputCallback(this.$cb$inlined) {
                  final Function1<java.lang.Boolean, Unit> $cb;

                  {
                     this.$cb = var1;
                  }

                  public final void onNoInput(boolean var1) {
                     this.$cb.invoke(var1);
                  }
               });
            }
         });
      }
   }

   internal fun setOnVoiceCallback(cb: (Float, Int) -> Unit) {
      r.h(var1, "cb");
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setOnVoiceCallback(new OnVoiceCallback(var1) {
            final Function2<java.lang.Float, Integer, Unit> $cb;

            {
               this.$cb = var1;
            }

            public final void onVoice(float var1, int var2) {
               this.$cb.invoke(var1, var2);
            }
         });
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final Function2 $cb$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$cb$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setOnVoiceCallback(new OnVoiceCallback(this.$cb$inlined) {
                  final Function2<java.lang.Float, Integer, Unit> $cb;

                  {
                     this.$cb = var1;
                  }

                  public final void onVoice(float var1, int var2) {
                     this.$cb.invoke(var1, var2);
                  }
               });
            }
         });
      }
   }

   internal fun setOutputDevice(deviceIndex: Int) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setOutputDeviceIndex(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final int $deviceIndex$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$deviceIndex$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setOutputDeviceIndex(this.$deviceIndex$inlined);
            }
         });
      }
   }

   internal fun setOutputDevice(deviceIndex: String) {
      r.h(var1, "deviceIndex");
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setOutputDevice(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final java.lang.String $deviceIndex$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$deviceIndex$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setOutputDevice(this.$deviceIndex$inlined);
            }
         });
      }
   }

   internal fun setOutputVolume(volume: Float) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setOutputVolume(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final float $volume$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$volume$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setOutputVolume(this.$volume$inlined);
            }
         });
      }
   }

   internal fun setSidechainCompression(enabled: Boolean) {
      this.getEngine().setSidechainCompression(var1);
   }

   internal fun setTransportOptions(optionsJSON: String) {
      r.h(var1, "optionsJSON");
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setTransportOptions(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final java.lang.String $optionsJSON$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$optionsJSON$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setTransportOptions(this.$optionsJSON$inlined);
            }
         });
      }
   }

   internal fun setVideoInputDevice(deviceIndex: Int) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setVideoInputDeviceIndex(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final int $deviceIndex$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$deviceIndex$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setVideoInputDeviceIndex(this.$deviceIndex$inlined);
            }
         });
      }
   }

   internal fun setVideoInputDevice(deviceName: String) {
      r.h(var1, "deviceName");
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setVideoInputDevice(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final java.lang.String $deviceName$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$deviceName$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setVideoInputDevice(this.$deviceName$inlined);
            }
         });
      }
   }

   internal fun setVideoOutputSink(streamIdentifier: String, callback: ((VideoFrame) -> Boolean)?) {
      r.h(var1, "streamIdentifier");
      val var3: AsyncInitDispatcher = this.dispatcher;
      if (this.dispatcher.getInitialized()) {
         if (var2 == null) {
            access$getEngine(this).setVideoOutputSink(var1, null);
         } else {
            access$getEngine(this).setVideoOutputSink(var1, new VideoFrameCallback(var2) {
               final Function1<VideoFrame, java.lang.Boolean> $callback;

               {
                  this.$callback = var1;
               }

               public final boolean onFrame(VideoFrame var1) {
                  r.h(var1, "videoFrame");
                  return this.$callback.invoke(var1) as java.lang.Boolean;
               }
            });
         }
      } else {
         var3.getDelayedTasks().add(new Function0<Unit>(var2, this, var1) {
            final Function1 $callback$inlined;
            final java.lang.String $streamIdentifier$inlined;
            final MediaEngine this$0;

            {
               super(0);
               this.$callback$inlined = var1;
               this.this$0 = var2;
               this.$streamIdentifier$inlined = var3;
            }

            public final void invoke() {
               if (this.$callback$inlined == null) {
                  MediaEngine.access$getEngine(this.this$0).setVideoOutputSink(this.$streamIdentifier$inlined, null);
               } else {
                  MediaEngine.access$getEngine(this.this$0).setVideoOutputSink(this.$streamIdentifier$inlined, new VideoFrameCallback(this.$callback$inlined) {
                     final Function1<VideoFrame, java.lang.Boolean> $callback;

                     {
                        this.$callback = var1;
                     }

                     public final boolean onFrame(VideoFrame var1) {
                        r.h(var1, "videoFrame");
                        return this.$callback.invoke(var1) as java.lang.Boolean;
                     }
                  });
               }
            }
         });
      }
   }

   internal fun startLocalAudioRecording(optionsJSON: String, callback: (Boolean) -> Unit) {
      r.h(var1, "optionsJSON");
      r.h(var2, "callback");
      this.getEngine().startLocalAudioRecording(var1, new f(var2));
   }

   internal fun stopLocalAudioRecording(callback: (String, Int) -> Unit) {
      r.h(var1, "callback");
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().stopLocalAudioRecording(new h(var1));
      } else {
         var1.invoke("", 0);
      }
   }

   public companion object {
      public const val MAX_SUPPORTED_PROTOCOL_VERSION: Int
      private final val OPEN_SL_DEVICE_ALLOW_LIST: Set<String>
      private const val TAG: String
      private const val THUMBNAIL_JPEG_QUALITY: Int

      private fun Bitmap.compressToJpegBytes(): ByteArray {
         val var2: ByteArrayOutputStream = new ByteArrayOutputStream();
         var1.compress(CompressFormat.JPEG, 92, var2);
         val var3: ByteArray = var2.toByteArray();
         r.g(var3, "ByteArrayOutputStream()\n…           .toByteArray()");
         return var3;
      }

      private suspend fun encodeThumbnail(bitmap: Bitmap): String {
         label32: {
            if (var2 is <unrepresentable>) {
               val var4: <unrepresentable> = var2 as <unrepresentable>;
               if (((var2 as <unrepresentable>).label and Integer.MIN_VALUE) != 0) {
                  var4.label = (var2 as <unrepresentable>).label + Integer.MIN_VALUE;
                  var8 = var4;
                  break label32;
               }
            }

            var8 = new kotlin.coroutines.jvm.internal.d(this, var2) {
               Object L$0;
               int label;
               Object result;
               final MediaEngine.Companion this$0;

               {
                  super(var2);
                  this.this$0 = var1;
               }

               public final Object invokeSuspend(Object var1) {
                  this.result = var1;
                  this.label |= Integer.MIN_VALUE;
                  return MediaEngine.Companion.access$encodeThumbnail(this.this$0, null, this);
               }
            };
         }

         label27: {
            val var5: Any = ((<unrepresentable>)var8).result;
            val var10: Any = kh.b.c();
            val var6: ByteArray;
            if (((<unrepresentable>)var8).label != 0) {
               if (((<unrepresentable>)var8).label != 1) {
                  if (((<unrepresentable>)var8).label != 2) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  var7 = ((<unrepresentable>)var8).L$0 as java.lang.String;
                  eh.s.b(var5);
                  break label27;
               }

               var6 = ((<unrepresentable>)var8).L$0 as byte[];
               eh.s.b(var5);
            } else {
               eh.s.b(var5);
               var6 = this.compressToJpegBytes(var1);
               ((<unrepresentable>)var8).L$0 = var6;
               ((<unrepresentable>)var8).label = 1;
               if (v1.a((Continuation)var8) === var10) {
                  return var10;
               }
            }

            var7 = Base64.encodeToString(var6, 0);
            ((<unrepresentable>)var8).L$0 = var7;
            ((<unrepresentable>)var8).label = 2;
            if (v1.a((Continuation)var8) === var10) {
               return var10;
            }
         }

         r.g(var7, "string");
         return var7;
      }
   }

   private data class ScreenCapturerForConnection(screenCapturer: ScreenCapturer, connectionId: Int) {
      public final val connectionId: Int
      public final val screenCapturer: ScreenCapturer

      init {
         r.h(var1, "screenCapturer");
         super();
         this.screenCapturer = var1;
         this.connectionId = var2;
      }

      public operator fun component1(): ScreenCapturer {
         return this.screenCapturer;
      }

      public operator fun component2(): Int {
         return this.connectionId;
      }

      public fun copy(screenCapturer: ScreenCapturer = var0.screenCapturer, connectionId: Int = var0.connectionId): com.discord.media.engine.MediaEngine.ScreenCapturerForConnection {
         r.h(var1, "screenCapturer");
         return new MediaEngine.ScreenCapturerForConnection(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is MediaEngine.ScreenCapturerForConnection) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.screenCapturer, var1.screenCapturer)) {
               return false;
            } else {
               return this.connectionId == var1.connectionId;
            }
         }
      }

      public override fun hashCode(): Int {
         return this.screenCapturer.hashCode() * 31 + Integer.hashCode(this.connectionId);
      }

      public fun release() {
         this.screenCapturer.release();
      }

      public override fun toString(): String {
         val var2: ScreenCapturer = this.screenCapturer;
         val var1: Int = this.connectionId;
         val var3: StringBuilder = new StringBuilder();
         var3.append("ScreenCapturerForConnection(screenCapturer=");
         var3.append(var2);
         var3.append(", connectionId=");
         var3.append(var1);
         var3.append(")");
         return var3.toString();
      }
   }
}
