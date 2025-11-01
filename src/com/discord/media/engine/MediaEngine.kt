package com.discord.media.engine

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Bitmap.CompressFormat
import android.os.Build
import android.util.Base64
import com.discord.async_init.AsyncInitDispatcher
import com.discord.logging.Log
import com.discord.media.engine.types.Debug
import com.discord.media.engine.types.NativeTypeExtensionsKt
import com.discord.media.engine.video.screen_capture.ScreenCapturer
import com.discord.media.engine.video.screen_capture.ThumbnailEmitter
import com.discord.native.engine.AudioInputDeviceDescription
import com.discord.native.engine.AudioInputInitializationInfo
import com.discord.native.engine.AudioOutputDeviceDescription
import com.discord.native.engine.ConnectionInfo
import com.discord.native.engine.NativeConnection
import com.discord.native.engine.NativeEngine
import com.discord.native.engine.VideoInputDeviceDescription
import gu.x1
import java.io.ByteArrayOutputStream
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import org.jetbrains.annotations.NotNull
import org.webrtc.VideoFrame

@SourceDebugExtension(["SMAP\nMediaEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaEngine.kt\ncom/discord/media/engine/MediaEngine\n+ 2 Debug.kt\ncom/discord/media/engine/types/Debug\n+ 3 AsyncInitDispatcher.kt\ncom/discord/async_init/AsyncInitDispatcher\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,761:1\n38#2,4:762\n58#2,4:766\n44#2,7:770\n44#2,7:777\n41#3,13:784\n41#3,13:797\n41#3,13:810\n41#3,13:823\n41#3,13:836\n41#3,13:849\n59#3,7:862\n41#3,13:869\n41#3,13:882\n59#3,7:895\n41#3,13:902\n41#3,13:915\n59#3,7:928\n41#3,13:935\n41#3,13:948\n41#3,13:961\n41#3,13:974\n45#3,9:987\n41#3,13:996\n41#3,13:1009\n59#3,7:1022\n59#3,7:1029\n59#3,3:1036\n63#3,3:1042\n59#3,7:1045\n59#3,7:1052\n41#3,13:1059\n41#3,13:1073\n3829#4:1039\n4344#4,2:1040\n1#5:1072\n*S KotlinDebug\n*F\n+ 1 MediaEngine.kt\ncom/discord/media/engine/MediaEngine\n*L\n77#1:762,4\n91#1:766,4\n100#1:770,7\n115#1:777,7\n123#1:784,13\n128#1:797,13\n140#1:810,13\n145#1:823,13\n150#1:836,13\n155#1:849,13\n160#1:862,7\n170#1:869,13\n175#1:882,13\n180#1:895,7\n192#1:902,13\n197#1:915,13\n202#1:928,7\n214#1:935,13\n219#1:948,13\n229#1:961,13\n244#1:974,13\n261#1:987,9\n272#1:996,13\n275#1:1009,13\n280#1:1022,7\n290#1:1029,7\n300#1:1036,3\n300#1:1042,3\n332#1:1045,7\n352#1:1052,7\n366#1:1059,13\n726#1:1073,13\n308#1:1039\n308#1:1040,2\n*E\n"])
public class MediaEngine(context: Context, coroutineDispatcher: CoroutineDispatcher = gu.m0.a()) {
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
            var var4: Debug = Debug.INSTANCE;
            System.nanoTime();

            try {
               Class.forName("org.webrtc.voiceengine.WebRtcAudioManager")
                  .getDeclaredMethod("setBlacklistDeviceForOpenSLESUsage", boolean.class)
                  .invoke(null, OPEN_SL_DEVICE_ALLOW_LIST.contains(Build.MODEL) xor true);
            } catch (var3: ClassNotFoundException) {
               var4 = Debug.INSTANCE;
            }

            val var7: NativeEngine = new NativeEngine(this.context, 2);
            var7.enableBuiltInAEC(true);
            var7.setAudioInputEnabled(false);
            this.engineInstance = var7;
            this.dispatcher.setInitialized(true);
            return var7;
         }
      }


   init {
      this.context = var1;
      this.instanceCreationNs = System.nanoTime();
      this.engineConnections = new MediaEngineNativeConnections();
      this.dispatcher = new AsyncInitDispatcher("MediaEngine", 0L, 2, null);
      this.coroutineScope = kotlinx.coroutines.i.a(var2.Q0(new gu.b0("MediaEngine")));
   }

   @JvmStatic
   fun `connectionInstanceGetEncryptionModes$lambda$58`(var0: Function1, var1: Array<java.lang.String>) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `connectionInstanceGetFilteredStats$lambda$60`(var0: Function1, var1: java.lang.String) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `connectionInstanceGetMLSKeyPackageB64$lambda$62`(var0: Function1, var1: java.lang.String) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `connectionInstanceGetMLSPairwiseFingerprintB64$lambda$66`(var0: Function1, var1: java.lang.String) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `connectionInstanceGetStats$lambda$59`(var0: Function1, var1: java.lang.String) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `connectionInstancePrepareMLSCommitTransitionB64$lambda$64`(var0: Function3, var1: Boolean, var2: Int, var3: java.lang.String) {
      var0.invoke(var1, var2, var3);
   }

   @JvmStatic
   fun `connectionInstancePrepareSecureFramesTransition$lambda$61`(var0: Function0) {
      var0.invoke();
   }

   @JvmStatic
   fun `connectionInstanceProcessMLSProposalsB64$lambda$63`(var0: Function1, var1: java.lang.String) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `connectionInstanceProcessMLSWelcomeB64$lambda$65`(var0: Function3, var1: Boolean, var2: Int, var3: java.lang.String) {
      var0.invoke(var1, var2, var3);
   }

   @JvmStatic
   fun `connectionInstanceSetOnFirstFrameCallback$lambda$51`(var0: Function3, var1: java.lang.String, var2: Long, var4: java.lang.String) {
      var0.invoke(var1, var2, var4);
   }

   @JvmStatic
   fun `connectionInstanceSetOnMLSFailureCallback$lambda$53`(var0: Function2, var1: java.lang.String, var2: java.lang.String) {
      var0.invoke(var1, var2);
   }

   @JvmStatic
   fun `connectionInstanceSetOnPingCallback$lambda$49`(var0: Function4, var1: Int, var2: java.lang.String, var3: Int, var4: Int) {
      var0.invoke(var1, var2, var3, var4);
   }

   @JvmStatic
   fun `connectionInstanceSetOnPingTimeoutCallback$lambda$50`(var0: Function4, var1: java.lang.String, var2: Int, var3: Int, var4: Int) {
      var0.invoke(var1, var2, var3, var4);
   }

   @JvmStatic
   fun `connectionInstanceSetOnSpeakingCallback$lambda$48`(var0: Function2, var1: java.lang.String, var2: Int) {
      var0.invoke(var1, var2);
   }

   @JvmStatic
   fun `connectionInstanceSetOnVideoCallback$lambda$52`(var0: Function4, var1: java.lang.String, var2: Long, var4: java.lang.String, var5: java.lang.String) {
      var0.invoke(var1, var2, var4, var5);
   }

   @JvmStatic
   fun `connectionInstanceSetSecureFramesStateUpdateCallback$lambda$54`(var0: Function1, var1: java.lang.String) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `createVoiceConnection$lambda$46`(var0: Function2, var1: ConnectionInfo, var2: java.lang.String) {
      val var4: Log = Log.INSTANCE;
      val var3: StringBuilder = new StringBuilder();
      var3.append("On created with ");
      var3.append(var1);
      var3.append(", ");
      var3.append(var2);
      Log.i$default(var4, "MediaEngine", var3.toString(), null, 4, null);
      val var5: java.util.Map = kotlin.collections.s0.y(NativeTypeExtensionsKt.toMap(var1));
      var5.put("connectCallbackScheduledMs", System.nanoTime() / (long)1000000);
      var0.invoke(var2, var5);
   }

   private fun forceStopScreenCapturer() {
      if (this.screenCapturer != null) {
         this.screenCapturer.release();
      }

      this.screenCapturer = null;
   }

   @JvmStatic
   fun `getCodecCapabilities$lambda$33$lambda$32`(var0: Function1, var1: java.lang.String) {
      var0.invoke(var1);
   }

   private fun getConnection(connectionId: Int, methodName: String): NativeConnection? {
      val var4: NativeConnection = this.engineConnections.get(var1);
      if (var4 == null) {
         val var5: Log = Log.INSTANCE;
         val var3: StringBuilder = new StringBuilder();
         var3.append("[");
         var3.append(var2);
         var3.append("] no NativeConnection for connectionId=");
         var3.append(var1);
         var3.append(", returning null");
         Log.w$default(var5, "MediaEngine", var3.toString(), null, 4, null);
      }

      return var4;
   }

   @JvmStatic
   fun `getInputDevices$lambda$10$lambda$9`(var0: Function1, var1: Array<AudioInputDeviceDescription>) {
      var0.invoke(NativeTypeExtensionsKt.toListOfMaps(var1));
   }

   @JvmStatic
   fun `getMLSSigningKeyB64$lambda$67`(var0: Function2, var1: java.lang.String, var2: java.lang.String) {
      var0.invoke(var1, var2);
   }

   @JvmStatic
   fun `getOutputDevices$lambda$15$lambda$14`(var0: Function1, var1: Array<AudioOutputDeviceDescription>) {
      var0.invoke(NativeTypeExtensionsKt.toListOfMaps(var1));
   }

   @JvmStatic
   fun `getSupportedVideoCodecs$lambda$30$lambda$29`(var0: Function1, var1: Array<java.lang.String>) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `getVideoInputDevices$lambda$20$lambda$19`(var0: Function1, var1: Array<VideoInputDeviceDescription>) {
      var0.invoke(NativeTypeExtensionsKt.toListOfMaps(var1));
   }

   @JvmStatic
   fun `rankRtcRegions$lambda$39$lambda$38`(var0: Function1, var1: Array<java.lang.String>) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `setBroadcastThumbnailParams$lambda$57$lambda$56`(var0: MediaEngine, var1: Function1, var2: Bitmap): Unit {
      gu.g.d(var0.coroutineScope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(var2, var1, null) {
         final Bitmap $bitmap;
         final Function1<java.lang.String, Unit> $callback;
         int label;

         {
            super(2, var3);
            this.$bitmap = var1;
            this.$callback = var2x;
         }

         public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
            return new <anonymous constructor>(this.$bitmap, this.$callback, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            val var4: Any = ot.b.f();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               kotlin.c.b(var1);
            } else {
               kotlin.c.b(var1);
               var1 = MediaEngine.Companion;
               var var3: Bitmap = this.$bitmap;
               this.label = 1;
               var3 = (Bitmap)MediaEngine.Companion.access$encodeThumbnail(var1, var3, this);
               var1 = var3;
               if (var3 === var4) {
                  return var4;
               }
            }

            this.$callback.invoke(var1 as java.lang.String);
            return Unit.a;
         }
      }, 3, null);
      return Unit.a;
   }

   @JvmStatic
   fun `startLocalAudioRecording$lambda$41`(var0: Function1, var1: Boolean) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `stopLocalAudioRecording$lambda$43$lambda$42`(var0: Function2, var1: java.lang.String, var2: Int) {
      var0.invoke(var1, var2);
   }

   private fun stopScreenCapturerForConnection(connectionId: Int) {
      if (this.screenCapturer != null && this.screenCapturer.getConnectionId() == var1) {
         if (this.screenCapturer != null) {
            this.screenCapturer.release();
         }

         this.screenCapturer = null;
      }
   }

   internal fun activeSinksChanged(streamId: String, active: Boolean): Unit? {
      if (this.activeSinksChangeCallback != null) {
         this.activeSinksChangeCallback.invoke(var1, var2);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceConfigureConnectionRetries(connectionId: Int, baseDelayMs: Int, maxDelayMs: Int, maxAttempts: Int): Unit? {
      val var5: NativeConnection = this.getConnection(var1, "configureConnectionRetries");
      if (var5 != null) {
         var5.configureConnectionRetries(var2, var3, var4);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceDestroy(connectionId: Int) {
      this.stopScreenCapturerForConnection(var1);
      this.engineConnections.removeAndDispose(var1);
   }

   internal fun connectionInstanceDestroyUser(connectionId: Int, userId: String): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "destroyUser");
      if (var3 != null) {
         var3.destroyUser(var2);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceExecuteSecureFramesTransition(connectionId: Int, transitionId: Int): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "executeSecureFramesTransition");
      if (var3 != null) {
         var3.executeSecureFramesTransition(var2);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceFastUdpReconnect(connectionId: Int): Unit? {
      val var2: NativeConnection = this.getConnection(var1, "fastUdpReconnect");
      if (var2 != null) {
         var2.fastUdpReconnect();
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceGetEncryptionModes(connectionId: Int, callback: (Array<String>) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "getEncryptionModes");
      if (var3 != null) {
         var3.getEncryptionModes(new a(var2));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceGetFilteredStats(connectionId: Int, filter: Int, callback: (String) -> Unit): Unit? {
      val var4: NativeConnection = this.getConnection(var1, "getFilteredStats");
      if (var4 != null) {
         var4.getFilteredStats(var2, new o(var3));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceGetMLSKeyPackageB64(connectionId: Int, callback: (String) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "getMLSKeyPackageB64");
      if (var3 != null) {
         var3.getMLSKeyPackageB64(new z(var2));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceGetMLSPairwiseFingerprintB64(connectionId: Int, version: Int, userId: String, callback: (String) -> Unit): Unit? {
      val var5: NativeConnection = this.getConnection(var1, "getMLSPairwiseFingerprintB64");
      if (var5 != null) {
         var5.getMLSPairwiseFingerprintB64(var2, var3, new b(var4));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceGetStats(connectionId: Int, callback: (String) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "getStats");
      if (var3 != null) {
         var3.getStats(new p(var2));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceMergeUsers(connectionId: Int, usersJSON: String): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "mergeUsers");
      if (var3 != null) {
         var3.mergeUsers(var2);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstancePrepareMLSCommitTransitionB64(connectionId: Int, transitionId: Int, commit: String, callback: (Boolean, Int, String) -> Unit): Unit? {
      val var5: NativeConnection = this.getConnection(var1, "prepareMLSCommitTransitionB64");
      if (var5 != null) {
         var5.prepareMLSCommitTransitionB64(var2, var3, new h(var4));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstancePrepareSecureFramesEpoch(connectionId: Int, epoch: String, transitionId: Int, groupId: String): Unit? {
      val var5: NativeConnection = this.getConnection(var1, "prepareSecureFramesEpoch");
      if (var5 != null) {
         var5.prepareSecureFramesEpoch(var2, var3, var4);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstancePrepareSecureFramesTransition(connectionId: Int, transitionId: Int, protocolVersion: Int, callback: () -> Unit): Unit? {
      val var5: NativeConnection = this.getConnection(var1, "prepareSecureFramesTransition");
      if (var5 != null) {
         var5.prepareSecureFramesTransition(var2, var3, new t(var4));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceProcessMLSProposalsB64(connectionId: Int, proposals: String, callback: (String) -> Unit): Unit? {
      val var4: NativeConnection = this.getConnection(var1, "processMLSProposalsB64");
      if (var4 != null) {
         var4.processMLSProposalsB64(var2, new l(var3));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceProcessMLSWelcomeB64(connectionId: Int, transitionId: Int, welcome: String, callback: (Boolean, Int, String) -> Unit): Unit? {
      val var5: NativeConnection = this.getConnection(var1, "processMLSWelcomeB64");
      if (var5 != null) {
         var5.processMLSWelcomeB64(var2, var3, new d(var4));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetLocalMute(connectionId: Int, userId: String, mute: Boolean): Unit? {
      val var4: NativeConnection = this.getConnection(var1, "setLocalMute");
      if (var4 != null) {
         var4.setLocalMute(var2, var3);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetLocalPan(connectionId: Int, userId: String, left: Float, right: Float): Unit? {
      val var5: NativeConnection = this.getConnection(var1, "setLocalPan");
      if (var5 != null) {
         var5.setLocalPan(var2, var3, var4);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetLocalVolume(connectionId: Int, userId: String, volume: Float): Unit? {
      val var4: NativeConnection = this.getConnection(var1, "setLocalVolume");
      if (var4 != null) {
         var4.setLocalVolume(var2, var3);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetMinimumOutputDelay(connectionId: Int, delay: Int): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setMinimumOutputDelay");
      if (var3 != null) {
         var3.setMinimumOutputDelay(var2);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetNoInputThreshold(connectionId: Int, threshold: Float): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setNoInputThreshold");
      if (var3 != null) {
         var3.setNoInputThreshold(var2);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetOnFirstFrameCallback(connectionId: Int, cb: (String, Long, String) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setOnFirstFrameCallback");
      if (var3 != null) {
         var3.setOnFirstFrameCallback(new n(var2));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetOnMLSFailureCallback(connectionId: Int, cb: (String, String) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setOnMLSFailureCallback");
      if (var3 != null) {
         var3.setOnMLSFailureCallback(new w(var2));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetOnPingCallback(connectionId: Int, cb: (Int, String, Int, Int) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setOnPingCallback");
      if (var3 != null) {
         var3.setOnPingCallback(new q(var2));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetOnPingTimeoutCallback(connectionId: Int, cb: (String, Int, Int, Int) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setOnPingTimeoutCallback");
      if (var3 != null) {
         var3.setOnPingTimeoutCallback(new s(var2));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetOnSpeakingCallback(connectionId: Int, cb: (String, Int) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setOnSpeakingCallback");
      if (var3 != null) {
         var3.setOnSpeakingCallback(new f(var2));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetOnVideoCallback(connectionId: Int, cb: (String, Long, String, String) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setOnVideoCallback");
      if (var3 != null) {
         var3.setOnVideoCallback(new k(var2));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetPTTActive(connectionId: Int, active: Boolean, priority: Boolean, muteOverride: Boolean): Unit? {
      val var5: NativeConnection = this.getConnection(var1, "setPTTActive");
      if (var5 != null) {
         var5.setPTTActive(var2, var3, var4);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetPingInterval(connectionId: Int, pingInterval: Int): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setPingInterval");
      if (var3 != null) {
         var3.setPingInterval(var2);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetSecureFramesStateUpdateCallback(connectionId: Int, cb: (String) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setSecureFramesStateUpdateCallback");
      if (var3 != null) {
         var3.setSecureFramesStateUpdateCallback(new b0(var2));
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetSelfDeafen(connectionId: Int, deafened: Boolean): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setSelfDeafen");
      if (var3 != null) {
         var3.setSelfDeafen(var2);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetSelfMute(connectionId: Int, muted: Boolean): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setSelfMute");
      if (var3 != null) {
         var3.setSelfMute(var2);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetTransportOptions(connectionId: Int, optionsJSON: String): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setTransportOptions");
      if (var3 != null) {
         var3.setTransportOptions(var2);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceSetVideoBroadcast(connectionId: Int, broadcasting: Boolean): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setVideoBroadcast");
      if (var3 != null) {
         var3.setVideoBroadcast(var2);
         return Unit.a;
      } else {
         return null;
      }
   }

   internal fun connectionInstanceStartBroadcast(connectionId: Int, permissions: Intent) {
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
      val var4: NativeConnection = this.getConnection(var1, "stopBroadcastWithError");
      if (var4 != null) {
         var4.stopBroadcast();
      }

      this.stopScreenCapturerForConnection(var1);
   }

   internal fun connectionInstanceUpdateMLSExternalSenderB64(connectionId: Int, externalSender: String): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "updateMLSExternalSenderB64");
      if (var3 != null) {
         var3.updateMLSExternalSenderB64(var2);
         return Unit.a;
      } else {
         return null;
      }
   }

   public fun createVoiceConnection(connectionId: Int, userId: String, connectionOptionsJSON: String, callback: (String, Map<String, Any>) -> Unit) {
      this.engineConnections.register(var1, this.getEngine().createVoiceConnection(var2, var3, new g(var4)));
   }

   internal fun getAudioSubsystem(cb: (String, String) -> Unit) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).getAudioSubsystem(new NativeEngine.GetAudioSubsystemCallback(var1) {
            final Function2<java.lang.String, java.lang.String, Unit> $cb;

            {
               this.$cb = var1;
            }

            @Override
            public final void onAudioSubsystem(java.lang.String var1, java.lang.String var2) {
               this.$cb.invoke(var1, var2);
            }
         });
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final Function2 $cb$inlined;
            final MediaEngine this$0;

            {
               this.this$0 = var1;
               this.$cb$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).getAudioSubsystem(new NativeEngine.GetAudioSubsystemCallback(this.$cb$inlined) {
                  final Function2<java.lang.String, java.lang.String, Unit> $cb;

                  {
                     this.$cb = var1;
                  }

                  @Override
                  public final void onAudioSubsystem(java.lang.String var1, java.lang.String var2) {
                     this.$cb.invoke(var1, var2);
                  }
               });
            }
         });
      }
   }

   internal fun getCodecCapabilities(callback: (String) -> Unit) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().getCodecCapabilities(new j(var1));
      } else {
         var1.invoke("{}");
      }
   }

   internal fun getCodecSurvey(callback: (String) -> Unit) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot read field "bytecode" because the return value of "org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.getInstance()" is null
      //   at org.vineflower.kotlin.pass.KMergePass.matchForEach(KMergePass.java:165)
      //   at org.vineflower.kotlin.pass.KMergePass.enhanceLoop(KMergePass.java:52)
      //   at org.vineflower.kotlin.pass.KMergePass.enhanceLoopsRec(KMergePass.java:39)
      //   at org.vineflower.kotlin.pass.KMergePass.enhanceLoopsRec(KMergePass.java:34)
      //   at org.vineflower.kotlin.pass.KMergePass.enhanceLoopsRec(KMergePass.java:34)
      //   at org.vineflower.kotlin.pass.KMergePass.enhanceLoopsRec(KMergePass.java:34)
      //   at org.vineflower.kotlin.pass.KMergePass.run(KMergePass.java:23)
      //   at org.jetbrains.java.decompiler.api.plugin.pass.NamedPass.run(NamedPass.java:18)
      //   at org.jetbrains.java.decompiler.api.plugin.pass.LoopingPassBuilder$CompiledPass.run(LoopingPassBuilder.java:43)
      //   at org.jetbrains.java.decompiler.api.plugin.pass.NamedPass.run(NamedPass.java:18)
      //   at org.jetbrains.java.decompiler.api.plugin.pass.LoopingPassBuilder$CompiledPass.run(LoopingPassBuilder.java:43)
      //   at org.jetbrains.java.decompiler.api.plugin.pass.NamedPass.run(NamedPass.java:18)
      //   at org.jetbrains.java.decompiler.api.plugin.pass.MainPassBuilder$CompiledPass.run(MainPassBuilder.java:34)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:160)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ldc_w "callback"
      // 004: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 007: aload 0
      // 008: getfield com/discord/media/engine/MediaEngine.dispatcher Lcom/discord/async_init/AsyncInitDispatcher;
      // 00b: astore 4
      // 00d: aload 4
      // 00f: invokevirtual com/discord/async_init/AsyncInitDispatcher.validateState ()V
      // 012: aload 4
      // 014: invokevirtual com/discord/async_init/AsyncInitDispatcher.getInitialized ()Z
      // 017: ifeq 183
      // 01a: new org/json/JSONObject
      // 01d: dup
      // 01e: invokespecial org/json/JSONObject.<init> ()V
      // 021: astore 8
      // 023: bipush 0
      // 024: anewarray 368
      // 027: astore 6
      // 029: bipush 0
      // 02a: anewarray 368
      // 02d: astore 5
      // 02f: new android/media/MediaCodecList
      // 032: dup
      // 033: bipush 0
      // 034: invokespecial android/media/MediaCodecList.<init> (I)V
      // 037: invokevirtual android/media/MediaCodecList.getCodecInfos ()[Landroid/media/MediaCodecInfo;
      // 03a: invokestatic kotlin/jvm/internal/ArrayIteratorKt.iterator ([Ljava/lang/Object;)Ljava/util/Iterator;
      // 03d: astore 7
      // 03f: aload 7
      // 041: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 046: ifeq 146
      // 049: aload 7
      // 04b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 050: checkcast android/media/MediaCodecInfo
      // 053: astore 10
      // 055: aload 10
      // 057: invokevirtual android/media/MediaCodecInfo.getName ()Ljava/lang/String;
      // 05a: astore 9
      // 05c: aload 9
      // 05e: ldc_w "getName(...)"
      // 061: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 064: aload 10
      // 066: invokevirtual android/media/MediaCodecInfo.getSupportedTypes ()[Ljava/lang/String;
      // 069: astore 4
      // 06b: aload 4
      // 06d: ldc_w "getSupportedTypes(...)"
      // 070: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 073: new java/util/ArrayList
      // 076: dup
      // 077: invokespecial java/util/ArrayList.<init> ()V
      // 07a: astore 11
      // 07c: aload 4
      // 07e: arraylength
      // 07f: istore 3
      // 080: bipush 0
      // 081: istore 2
      // 082: iload 2
      // 083: iload 3
      // 084: if_icmpge 0b0
      // 087: aload 4
      // 089: iload 2
      // 08a: aaload
      // 08b: astore 12
      // 08d: aload 12
      // 08f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 092: aload 12
      // 094: ldc_w "video"
      // 097: bipush 0
      // 098: bipush 2
      // 099: aconst_null
      // 09a: invokestatic kotlin/text/StringsKt.N (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
      // 09d: ifeq 0aa
      // 0a0: aload 11
      // 0a2: aload 12
      // 0a4: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 0a9: pop
      // 0aa: iinc 2 1
      // 0ad: goto 082
      // 0b0: aload 11
      // 0b2: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b7: astore 11
      // 0b9: aload 11
      // 0bb: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c0: ifeq 143
      // 0c3: aload 11
      // 0c5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ca: checkcast java/lang/String
      // 0cd: astore 12
      // 0cf: getstatic android/os/Build$VERSION.SDK_INT I
      // 0d2: bipush 29
      // 0d4: if_icmplt 0ef
      // 0d7: aload 10
      // 0d9: invokevirtual android/media/MediaCodecInfo.isHardwareAccelerated ()Z
      // 0dc: ifeq 0e7
      // 0df: ldc_w "(HW)"
      // 0e2: astore 4
      // 0e4: goto 0f4
      // 0e7: ldc_w "(SW)"
      // 0ea: astore 4
      // 0ec: goto 0f4
      // 0ef: ldc_w ""
      // 0f2: astore 4
      // 0f4: bipush 3
      // 0f5: anewarray 368
      // 0f8: dup
      // 0f9: bipush 0
      // 0fa: aload 12
      // 0fc: aastore
      // 0fd: dup
      // 0fe: bipush 1
      // 0ff: aload 9
      // 101: aastore
      // 102: dup
      // 103: bipush 2
      // 104: aload 4
      // 106: aastore
      // 107: invokestatic kotlin/collections/CollectionsKt.o ([Ljava/lang/Object;)Ljava/util/List;
      // 10a: checkcast java/lang/Iterable
      // 10d: ldc_w " "
      // 110: aconst_null
      // 111: aconst_null
      // 112: bipush 0
      // 113: aconst_null
      // 114: aconst_null
      // 115: bipush 62
      // 117: aconst_null
      // 118: invokestatic kotlin/collections/CollectionsKt.x0 (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
      // 11b: astore 4
      // 11d: aload 10
      // 11f: invokevirtual android/media/MediaCodecInfo.isEncoder ()Z
      // 122: ifeq 134
      // 125: aload 6
      // 127: aload 4
      // 129: invokestatic kotlin/collections/m.E ([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 12c: checkcast [Ljava/lang/String;
      // 12f: astore 6
      // 131: goto 0b9
      // 134: aload 5
      // 136: aload 4
      // 138: invokestatic kotlin/collections/m.E ([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 13b: checkcast [Ljava/lang/String;
      // 13e: astore 5
      // 140: goto 0b9
      // 143: goto 03f
      // 146: aload 8
      // 148: ldc_w "available_video_encoders"
      // 14b: new org/json/JSONArray
      // 14e: dup
      // 14f: aload 6
      // 151: invokespecial org/json/JSONArray.<init> (Ljava/lang/Object;)V
      // 154: invokevirtual org/json/JSONObject.put (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      // 157: pop
      // 158: aload 8
      // 15a: ldc_w "available_video_decoders"
      // 15d: new org/json/JSONArray
      // 160: dup
      // 161: aload 5
      // 163: invokespecial org/json/JSONArray.<init> (Ljava/lang/Object;)V
      // 166: invokevirtual org/json/JSONObject.put (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      // 169: pop
      // 16a: aload 8
      // 16c: invokevirtual org/json/JSONObject.toString ()Ljava/lang/String;
      // 16f: astore 4
      // 171: aload 4
      // 173: ldc_w "toString(...)"
      // 176: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 179: aload 1
      // 17a: aload 4
      // 17c: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 181: pop
      // 182: return
      // 183: aload 1
      // 184: ldc_w "{}"
      // 187: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 18c: pop
      // 18d: return
   }

   internal fun getInputDevices(callback: (List<Map<String, Any>>) -> Unit) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().getInputDevices(new x(var1));
      } else {
         var1.invoke(CollectionsKt.l());
      }
   }

   internal fun getMLSSigningKeyB64(sessionId: String, signatureVersion: Int, callback: (String, String) -> Unit) {
      this.getEngine().getMLSSigningKeyB64(var1, var2, new m(var3));
   }

   internal fun getOutputDevices(callback: (List<Map<String, Any>>) -> Unit) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().getOutputDevices(new e(var1));
      } else {
         var1.invoke(CollectionsKt.l());
      }
   }

   internal fun getSupportedVideoCodecs(callback: (Array<String>) -> Unit) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().getSupportedVideoCodecs(new u(var1));
      } else {
         var1.invoke(new java.lang.String[0]);
      }
   }

   internal fun getVideoInputDevices(callback: (List<Map<String, Any>>) -> Unit) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().getVideoInputDevices(new a0(var1));
      } else {
         var1.invoke(CollectionsKt.l());
      }
   }

   internal fun rankRtcRegions(regionsWithIpsJSON: String, callback: (Array<String>) -> Unit) {
      val var3: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var3.getInitialized()) {
         this.getEngine().rankRtcRegions(var1, new c(var2));
      } else {
         var2.invoke(new java.lang.String[0]);
      }
   }

   public fun reset() {
      System.nanoTime();
      kotlinx.coroutines.i.f(this.coroutineScope, null, 1, null);
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
               this.this$0 = var1;
               this.$enabled$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setAudioInputEnabled(this.$enabled$inlined);
            }
         });
      }
   }

   internal fun setAudioInputInitializationCallback(callback: (Double, Map<String, Any>) -> Unit) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setAudioInputInitializationCallback(new NativeEngine.AudioInputInitializationCallback(var1) {
            final Function2<java.lang.Double, java.util.Map<java.lang.String, ? extends Object>, Unit> $callback;

            {
               this.$callback = var1;
            }

            @Override
            public final void onAudioInputInitialized(AudioInputInitializationInfo var1) {
               this.$callback.invoke((double)var1.getTimeToInitializedNanos() / 1.0E9, NativeTypeExtensionsKt.toMap(var1.getDescription()));
            }
         });
      } else {
         var2.getDelayedTasks()
            .add(
               new Function0<Unit>(this, var1) {
                  final Function2 $callback$inlined;
                  final MediaEngine this$0;

                  {
                     this.this$0 = var1;
                     this.$callback$inlined = var2;
                  }

                  public final void invoke() {
                     MediaEngine.access$getEngine(this.this$0)
                        .setAudioInputInitializationCallback(new NativeEngine.AudioInputInitializationCallback(this.$callback$inlined) {
                           final Function2<java.lang.Double, java.util.Map<java.lang.String, ? extends Object>, Unit> $callback;

                           {
                              this.$callback = var1;
                           }

                           @Override
                           public final void onAudioInputInitialized(AudioInputInitializationInfo var1) {
                              this.$callback.invoke((double)var1.getTimeToInitializedNanos() / 1.0E9, NativeTypeExtensionsKt.toMap(var1.getDescription()));
                           }
                        });
                  }
               }
            );
      }
   }

   internal fun setBroadcastThumbnailParams(width: Int, height: Int, intervalSeconds: Int, callback: (String) -> Unit) {
      if (this.screenCapturer != null) {
         this.screenCapturer.component1().setThumbnailEmitter(new ThumbnailEmitter(var1, var2, 1000L * (long)var3, new i(this, var4)));
      }
   }

   internal fun setDeviceChangeCallback(callback: (List<Map<String, Any>>, List<Map<String, Any>>, List<Map<String, Any>>) -> Unit) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this)
            .setOnDeviceChangeCallback(
               new NativeEngine.DeviceChangeCallback(var1) {
                  final Function3 $callback;

                  {
                     this.$callback = var1;
                  }

                  @Override
                  public final void onChange(AudioInputDeviceDescription[] var1, AudioOutputDeviceDescription[] var2, VideoInputDeviceDescription[] var3) {
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
                     this.this$0 = var1;
                     this.$callback$inlined = var2;
                  }

                  public final void invoke() {
                     MediaEngine.access$getEngine(this.this$0)
                        .setOnDeviceChangeCallback(
                           new NativeEngine.DeviceChangeCallback(this.$callback$inlined) {
                              final Function3 $callback;

                              {
                                 this.$callback = var1;
                              }

                              @Override
                              public final void onChange(
                                 AudioInputDeviceDescription[] var1, AudioOutputDeviceDescription[] var2, VideoInputDeviceDescription[] var3
                              ) {
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
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setInputDevice(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final java.lang.String $deviceIndex$inlined;
            final MediaEngine this$0;

            {
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
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setOnNoInputCallback(new NativeEngine.OnNoInputCallback(var1) {
            final Function1<java.lang.Boolean, Unit> $cb;

            {
               this.$cb = var1;
            }

            @Override
            public final void onNoInput(boolean var1) {
               this.$cb.invoke(var1);
            }
         });
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final Function1 $cb$inlined;
            final MediaEngine this$0;

            {
               this.this$0 = var1;
               this.$cb$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setOnNoInputCallback(new NativeEngine.OnNoInputCallback(this.$cb$inlined) {
                  final Function1<java.lang.Boolean, Unit> $cb;

                  {
                     this.$cb = var1;
                  }

                  @Override
                  public final void onNoInput(boolean var1) {
                     this.$cb.invoke(var1);
                  }
               });
            }
         });
      }
   }

   internal fun setOnVoiceCallback(cb: (Float, Int) -> Unit) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setOnVoiceCallback(new NativeEngine.OnVoiceCallback(var1) {
            final Function2<java.lang.Float, Integer, Unit> $cb;

            {
               this.$cb = var1;
            }

            @Override
            public final void onVoice(float var1, int var2) {
               this.$cb.invoke(var1, var2);
            }
         });
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final Function2 $cb$inlined;
            final MediaEngine this$0;

            {
               this.this$0 = var1;
               this.$cb$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setOnVoiceCallback(new NativeEngine.OnVoiceCallback(this.$cb$inlined) {
                  final Function2<java.lang.Float, Integer, Unit> $cb;

                  {
                     this.$cb = var1;
                  }

                  @Override
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
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setOutputDevice(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final java.lang.String $deviceIndex$inlined;
            final MediaEngine this$0;

            {
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
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setTransportOptions(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final java.lang.String $optionsJSON$inlined;
            final MediaEngine this$0;

            {
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
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         access$getEngine(this).setVideoInputDevice(var1);
      } else {
         var2.getDelayedTasks().add(new Function0<Unit>(this, var1) {
            final java.lang.String $deviceName$inlined;
            final MediaEngine this$0;

            {
               this.this$0 = var1;
               this.$deviceName$inlined = var2;
            }

            public final void invoke() {
               MediaEngine.access$getEngine(this.this$0).setVideoInputDevice(this.$deviceName$inlined);
            }
         });
      }
   }

   internal fun setVideoOutputSink(streamIdentifier: String, callback: ((VideoFrame, Boolean) -> Boolean)?) {
      val var3: AsyncInitDispatcher = this.dispatcher;
      if (this.dispatcher.getInitialized()) {
         if (var2 == null) {
            access$getEngine(this).setVideoOutputSink(var1, null);
         } else {
            access$getEngine(this).setVideoOutputSink(var1, new NativeEngine.VideoFrameCallback(var2) {
               final Function2<VideoFrame, java.lang.Boolean, java.lang.Boolean> $callback;

               {
                  this.$callback = var1;
               }

               @Override
               public final boolean onFrame(VideoFrame var1, boolean var2) {
                  return this.$callback.invoke(var1, var2) as java.lang.Boolean;
               }
            });
         }
      } else {
         var3.getDelayedTasks()
            .add(
               new Function0<Unit>(var2, this, var1) {
                  final Function2 $callback$inlined;
                  final java.lang.String $streamIdentifier$inlined;
                  final MediaEngine this$0;

                  {
                     this.$callback$inlined = var1;
                     this.this$0 = var2;
                     this.$streamIdentifier$inlined = var3;
                  }

                  public final void invoke() {
                     if (this.$callback$inlined == null) {
                        MediaEngine.access$getEngine(this.this$0).setVideoOutputSink(this.$streamIdentifier$inlined, null);
                     } else {
                        MediaEngine.access$getEngine(this.this$0)
                           .setVideoOutputSink(this.$streamIdentifier$inlined, new NativeEngine.VideoFrameCallback(this.$callback$inlined) {
                              final Function2<VideoFrame, java.lang.Boolean, java.lang.Boolean> $callback;

                              {
                                 this.$callback = var1;
                              }

                              @Override
                              public final boolean onFrame(VideoFrame var1, boolean var2) {
                                 return this.$callback.invoke(var1, var2) as java.lang.Boolean;
                              }
                           });
                     }
                  }
               }
            );
      }
   }

   internal fun startLocalAudioRecording(optionsJSON: String, callback: (Boolean) -> Unit) {
      this.getEngine().startLocalAudioRecording(var1, new v(var2));
   }

   internal fun stopLocalAudioRecording(callback: (String, Int) -> Unit) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().stopLocalAudioRecording(new y(var1));
      } else {
         var1.invoke("", 0);
      }
   }

   internal fun updateFieldTrial(key: String, value: String) {
      this.getEngine().updateFieldTrial(var1, var2);
   }

   @SourceDebugExtension(["SMAP\nMediaEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaEngine.kt\ncom/discord/media/engine/MediaEngine$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,761:1\n1#2:762\n*E\n"])
   public companion object {
      private const val TAG: String
      private const val THUMBNAIL_JPEG_QUALITY: Int
      private final val OPEN_SL_DEVICE_ALLOW_LIST: Set<String>
      public const val MAX_SUPPORTED_PROTOCOL_VERSION: Int

      private fun Bitmap.compressToJpegBytes(): ByteArray {
         val var2: ByteArrayOutputStream = new ByteArrayOutputStream();
         var1.compress(CompressFormat.JPEG, 92, var2);
         val var3: ByteArray = var2.toByteArray();
         return var3;
      }

      private suspend fun encodeThumbnail(bitmap: Bitmap): String {
         label35: {
            if (var2 is <unrepresentable>) {
               val var4: <unrepresentable> = var2 as <unrepresentable>;
               if (((var2 as <unrepresentable>).label and Integer.MIN_VALUE) != 0) {
                  var4.label = (var2 as <unrepresentable>).label + Integer.MIN_VALUE;
                  var8 = var4;
                  break label35;
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

               public final Object invokeSuspend(@NotNull Object var1) {
                  this.result = var1;
                  this.label |= Integer.MIN_VALUE;
                  return MediaEngine.Companion.access$encodeThumbnail(this.this$0, null, this);
               }
            };
         }

         label29: {
            val var5: Any = ((<unrepresentable>)var8).result;
            val var10: Any = ot.b.f();
            val var6: ByteArray;
            if (((<unrepresentable>)var8).label != 0) {
               if (((<unrepresentable>)var8).label != 1) {
                  if (((<unrepresentable>)var8).label != 2) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  var7 = ((<unrepresentable>)var8).L$0 as java.lang.String;
                  kotlin.c.b(var5);
                  break label29;
               }

               var6 = ((<unrepresentable>)var8).L$0 as ByteArray;
               kotlin.c.b(var5);
            } else {
               kotlin.c.b(var5);
               var6 = this.compressToJpegBytes(var1);
               ((<unrepresentable>)var8).L$0 = var6;
               ((<unrepresentable>)var8).label = 1;
               if (x1.a((Continuation)var8) === var10) {
                  return var10;
               }
            }

            var7 = Base64.encodeToString(var6, 0);
            ((<unrepresentable>)var8).L$0 = var7;
            ((<unrepresentable>)var8).label = 2;
            if (x1.a((Continuation)var8) === var10) {
               return var10;
            }
         }

         return var7;
      }
   }

   private data class ScreenCapturerForConnection(screenCapturer: ScreenCapturer, connectionId: Int) {
      public final val screenCapturer: ScreenCapturer
      public final val connectionId: Int

      init {
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
         return new MediaEngine.ScreenCapturerForConnection(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is MediaEngine.ScreenCapturerForConnection) {
            return false;
         } else {
            var1 = var1;
            if (!(this.screenCapturer == var1.screenCapturer)) {
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
         val var3: ScreenCapturer = this.screenCapturer;
         val var1: Int = this.connectionId;
         val var2: StringBuilder = new StringBuilder();
         var2.append("ScreenCapturerForConnection(screenCapturer=");
         var2.append(var3);
         var2.append(", connectionId=");
         var2.append(var1);
         var2.append(")");
         return var2.toString();
      }
   }
}
