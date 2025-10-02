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
import db.x0
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

@SourceDebugExtension(["SMAP\nMediaEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaEngine.kt\ncom/discord/media/engine/MediaEngine\n+ 2 Debug.kt\ncom/discord/media/engine/types/Debug\n+ 3 AsyncInitDispatcher.kt\ncom/discord/async_init/AsyncInitDispatcher\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,755:1\n38#2,4:756\n58#2,4:760\n44#2,7:764\n44#2,7:771\n41#3,13:778\n41#3,13:791\n41#3,13:804\n41#3,13:817\n41#3,13:830\n41#3,13:843\n59#3,7:856\n41#3,13:863\n41#3,13:876\n59#3,7:889\n41#3,13:896\n41#3,13:909\n59#3,7:922\n41#3,13:929\n41#3,13:942\n41#3,13:955\n41#3,13:968\n45#3,9:981\n41#3,13:990\n41#3,13:1003\n59#3,7:1016\n59#3,7:1023\n59#3,3:1030\n63#3,3:1036\n59#3,7:1039\n59#3,7:1046\n41#3,13:1053\n41#3,13:1067\n3829#4:1033\n4344#4,2:1034\n1#5:1066\n*S KotlinDebug\n*F\n+ 1 MediaEngine.kt\ncom/discord/media/engine/MediaEngine\n*L\n77#1:756,4\n91#1:760,4\n100#1:764,7\n115#1:771,7\n123#1:778,13\n128#1:791,13\n140#1:804,13\n145#1:817,13\n150#1:830,13\n155#1:843,13\n160#1:856,7\n170#1:863,13\n175#1:876,13\n180#1:889,7\n192#1:896,13\n197#1:909,13\n202#1:922,7\n214#1:929,13\n219#1:942,13\n229#1:955,13\n244#1:968,13\n261#1:981,9\n272#1:990,13\n275#1:1003,13\n280#1:1016,7\n290#1:1023,7\n300#1:1030,3\n300#1:1036,3\n332#1:1039,7\n352#1:1046,7\n364#1:1053,13\n720#1:1067,13\n308#1:1033\n308#1:1034,2\n*E\n"])
public class MediaEngine(context: Context, coroutineDispatcher: CoroutineDispatcher = db.K.a()) {
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
      this.coroutineScope = kotlinx.coroutines.g.a(var2.X0(new db.B("MediaEngine")));
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
      val var3: Log = Log.INSTANCE;
      val var4: StringBuilder = new StringBuilder();
      var4.append("On created with ");
      var4.append(var1);
      var4.append(", ");
      var4.append(var2);
      Log.i$default(var3, "MediaEngine", var4.toString(), null, 4, null);
      val var5: java.util.Map = kotlin.collections.L.x(NativeTypeExtensionsKt.toMap(var1));
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
         val var3: Log = Log.INSTANCE;
         val var5: StringBuilder = new StringBuilder();
         var5.append("[");
         var5.append(var2);
         var5.append("] no NativeConnection for connectionId=");
         var5.append(var1);
         var5.append(", returning null");
         Log.w$default(var3, "MediaEngine", var5.toString(), null, 4, null);
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
      db.f.d(var0.coroutineScope, null, null, new Function2<CoroutineScope, Continuation, Object>(var2, var1, null) {
         final Bitmap $bitmap;
         final Function1<java.lang.String, Unit> $callback;
         int label;

         {
            super(2, var3);
            this.$bitmap = var1;
            this.$callback = var2x;
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(this.$bitmap, this.$callback, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            val var4: Any = G9.b.e();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               kotlin.c.b(var1);
            } else {
               kotlin.c.b(var1);
               var var3: MediaEngine.Companion = MediaEngine.Companion;
               var1 = this.$bitmap;
               this.label = 1;
               var3 = (MediaEngine.Companion)MediaEngine.Companion.access$encodeThumbnail(var3, var1, this);
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
      val var3: NativeConnection = this.getConnection(var1, "getEncryptionModes");
      val var4: Unit;
      if (var3 != null) {
         var3.getEncryptionModes(new a(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceGetFilteredStats(connectionId: Int, filter: Int, callback: (String) -> Unit): Unit? {
      val var4: NativeConnection = this.getConnection(var1, "getFilteredStats");
      val var5: Unit;
      if (var4 != null) {
         var4.getFilteredStats(var2, new o(var3));
         var5 = Unit.a;
      } else {
         var5 = null;
      }

      return var5;
   }

   internal fun connectionInstanceGetMLSKeyPackageB64(connectionId: Int, callback: (String) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "getMLSKeyPackageB64");
      val var4: Unit;
      if (var3 != null) {
         var3.getMLSKeyPackageB64(new y(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceGetMLSPairwiseFingerprintB64(connectionId: Int, version: Int, userId: String, callback: (String) -> Unit): Unit? {
      val var5: NativeConnection = this.getConnection(var1, "getMLSPairwiseFingerprintB64");
      val var6: Unit;
      if (var5 != null) {
         var5.getMLSPairwiseFingerprintB64(var2, var3, new b(var4));
         var6 = Unit.a;
      } else {
         var6 = null;
      }

      return var6;
   }

   internal fun connectionInstanceGetStats(connectionId: Int, callback: (String) -> Unit): Unit? {
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
      val var5: NativeConnection = this.getConnection(var1, "prepareMLSCommitTransitionB64");
      val var6: Unit;
      if (var5 != null) {
         var5.prepareMLSCommitTransitionB64(var2, var3, new h(var4));
         var6 = Unit.a;
      } else {
         var6 = null;
      }

      return var6;
   }

   internal fun connectionInstancePrepareSecureFramesEpoch(connectionId: Int, epoch: String, transitionId: Int, groupId: String): Unit? {
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
      val var5: NativeConnection = this.getConnection(var1, "prepareSecureFramesTransition");
      val var6: Unit;
      if (var5 != null) {
         var5.prepareSecureFramesTransition(var2, var3, new s(var4));
         var6 = Unit.a;
      } else {
         var6 = null;
      }

      return var6;
   }

   internal fun connectionInstanceProcessMLSProposalsB64(connectionId: Int, proposals: String, callback: (String) -> Unit): Unit? {
      val var4: NativeConnection = this.getConnection(var1, "processMLSProposalsB64");
      val var5: Unit;
      if (var4 != null) {
         var4.processMLSProposalsB64(var2, new l(var3));
         var5 = Unit.a;
      } else {
         var5 = null;
      }

      return var5;
   }

   internal fun connectionInstanceProcessMLSWelcomeB64(connectionId: Int, transitionId: Int, welcome: String, callback: (Boolean, Int, String) -> Unit): Unit? {
      val var5: NativeConnection = this.getConnection(var1, "processMLSWelcomeB64");
      val var6: Unit;
      if (var5 != null) {
         var5.processMLSWelcomeB64(var2, var3, new d(var4));
         var6 = Unit.a;
      } else {
         var6 = null;
      }

      return var6;
   }

   internal fun connectionInstanceSetLocalMute(connectionId: Int, userId: String, mute: Boolean): Unit? {
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
      val var3: NativeConnection = this.getConnection(var1, "setOnFirstFrameCallback");
      val var4: Unit;
      if (var3 != null) {
         var3.setOnFirstFrameCallback(new n(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetOnMLSFailureCallback(connectionId: Int, cb: (String, String) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setOnMLSFailureCallback");
      val var4: Unit;
      if (var3 != null) {
         var3.setOnMLSFailureCallback(new v(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetOnPingCallback(connectionId: Int, cb: (Int, String, Int, Int) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setOnPingCallback");
      val var4: Unit;
      if (var3 != null) {
         var3.setOnPingCallback(new q(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetOnPingTimeoutCallback(connectionId: Int, cb: (String, Int, Int, Int) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setOnPingTimeoutCallback");
      val var4: Unit;
      if (var3 != null) {
         var3.setOnPingTimeoutCallback(new r(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetOnSpeakingCallback(connectionId: Int, cb: (String, Int) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setOnSpeakingCallback");
      val var4: Unit;
      if (var3 != null) {
         var3.setOnSpeakingCallback(new f(var2));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   internal fun connectionInstanceSetOnVideoCallback(connectionId: Int, cb: (String, Long, String, String) -> Unit): Unit? {
      val var3: NativeConnection = this.getConnection(var1, "setOnVideoCallback");
      val var4: Unit;
      if (var3 != null) {
         var3.setOnVideoCallback(new k(var2));
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
      val var3: NativeConnection = this.getConnection(var1, "setSecureFramesStateUpdateCallback");
      val var4: Unit;
      if (var3 != null) {
         var3.setSecureFramesStateUpdateCallback(new A(var2));
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
      // 017: ifeq 182
      // 01a: new org/json/JSONObject
      // 01d: dup
      // 01e: invokespecial org/json/JSONObject.<init> ()V
      // 021: astore 7
      // 023: bipush 0
      // 024: anewarray 363
      // 027: astore 6
      // 029: bipush 0
      // 02a: anewarray 363
      // 02d: astore 5
      // 02f: new android/media/MediaCodecList
      // 032: dup
      // 033: bipush 0
      // 034: invokespecial android/media/MediaCodecList.<init> (I)V
      // 037: invokevirtual android/media/MediaCodecList.getCodecInfos ()[Landroid/media/MediaCodecInfo;
      // 03a: invokestatic kotlin/jvm/internal/ArrayIteratorKt.iterator ([Ljava/lang/Object;)Ljava/util/Iterator;
      // 03d: astore 8
      // 03f: aload 8
      // 041: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 046: ifeq 143
      // 049: aload 8
      // 04b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 050: checkcast android/media/MediaCodecInfo
      // 053: astore 9
      // 055: aload 9
      // 057: invokevirtual android/media/MediaCodecInfo.getName ()Ljava/lang/String;
      // 05a: astore 10
      // 05c: aload 10
      // 05e: ldc_w "getName(...)"
      // 061: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 064: aload 9
      // 066: invokevirtual android/media/MediaCodecInfo.getSupportedTypes ()[Ljava/lang/String;
      // 069: astore 12
      // 06b: aload 12
      // 06d: ldc_w "getSupportedTypes(...)"
      // 070: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 073: new java/util/ArrayList
      // 076: dup
      // 077: invokespecial java/util/ArrayList.<init> ()V
      // 07a: astore 4
      // 07c: aload 12
      // 07e: arraylength
      // 07f: istore 3
      // 080: bipush 0
      // 081: istore 2
      // 082: iload 2
      // 083: iload 3
      // 084: if_icmpge 0b0
      // 087: aload 12
      // 089: iload 2
      // 08a: aaload
      // 08b: astore 11
      // 08d: aload 11
      // 08f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 092: aload 11
      // 094: ldc_w "video"
      // 097: bipush 0
      // 098: bipush 2
      // 099: aconst_null
      // 09a: invokestatic kotlin/text/StringsKt.I (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
      // 09d: ifeq 0aa
      // 0a0: aload 4
      // 0a2: aload 11
      // 0a4: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 0a9: pop
      // 0aa: iinc 2 1
      // 0ad: goto 082
      // 0b0: aload 4
      // 0b2: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b7: astore 11
      // 0b9: aload 11
      // 0bb: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c0: ifeq 140
      // 0c3: aload 11
      // 0c5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ca: checkcast java/lang/String
      // 0cd: astore 12
      // 0cf: getstatic android/os/Build$VERSION.SDK_INT I
      // 0d2: bipush 29
      // 0d4: if_icmplt 0ef
      // 0d7: aload 9
      // 0d9: invokestatic com/discord/a.a (Landroid/media/MediaCodecInfo;)Z
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
      // 0f5: anewarray 363
      // 0f8: dup
      // 0f9: bipush 0
      // 0fa: aload 12
      // 0fc: aastore
      // 0fd: dup
      // 0fe: bipush 1
      // 0ff: aload 10
      // 101: aastore
      // 102: dup
      // 103: bipush 2
      // 104: aload 4
      // 106: aastore
      // 107: invokestatic kotlin/collections/CollectionsKt.n ([Ljava/lang/Object;)Ljava/util/List;
      // 10a: ldc_w " "
      // 10d: aconst_null
      // 10e: aconst_null
      // 10f: bipush 0
      // 110: aconst_null
      // 111: aconst_null
      // 112: bipush 62
      // 114: aconst_null
      // 115: invokestatic kotlin/collections/CollectionsKt.p0 (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
      // 118: astore 4
      // 11a: aload 9
      // 11c: invokevirtual android/media/MediaCodecInfo.isEncoder ()Z
      // 11f: ifeq 131
      // 122: aload 6
      // 124: aload 4
      // 126: invokestatic kotlin/collections/h.v ([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 129: checkcast [Ljava/lang/String;
      // 12c: astore 6
      // 12e: goto 0b9
      // 131: aload 5
      // 133: aload 4
      // 135: invokestatic kotlin/collections/h.v ([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 138: checkcast [Ljava/lang/String;
      // 13b: astore 5
      // 13d: goto 0b9
      // 140: goto 03f
      // 143: aload 7
      // 145: ldc_w "available_video_encoders"
      // 148: new org/json/JSONArray
      // 14b: dup
      // 14c: aload 6
      // 14e: invokespecial org/json/JSONArray.<init> (Ljava/lang/Object;)V
      // 151: invokevirtual org/json/JSONObject.put (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      // 154: pop
      // 155: aload 7
      // 157: ldc_w "available_video_decoders"
      // 15a: new org/json/JSONArray
      // 15d: dup
      // 15e: aload 5
      // 160: invokespecial org/json/JSONArray.<init> (Ljava/lang/Object;)V
      // 163: invokevirtual org/json/JSONObject.put (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      // 166: pop
      // 167: aload 7
      // 169: invokevirtual org/json/JSONObject.toString ()Ljava/lang/String;
      // 16c: astore 4
      // 16e: aload 4
      // 170: ldc_w "toString(...)"
      // 173: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 176: aload 1
      // 177: aload 4
      // 179: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 17e: pop
      // 17f: goto 18c
      // 182: aload 1
      // 183: ldc_w "{}"
      // 186: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 18b: pop
      // 18c: return
   }

   internal fun getInputDevices(callback: (List<Map<String, Any>>) -> Unit) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().getInputDevices(new w(var1));
      } else {
         var1.invoke(CollectionsKt.k());
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
         var1.invoke(CollectionsKt.k());
      }
   }

   internal fun getSupportedVideoCodecs(callback: (Array<String>) -> Unit) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().getSupportedVideoCodecs(new t(var1));
      } else {
         var1.invoke(new java.lang.String[0]);
      }
   }

   internal fun getVideoInputDevices(callback: (List<Map<String, Any>>) -> Unit) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().getVideoInputDevices(new z(var1));
      } else {
         var1.invoke(CollectionsKt.k());
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
         this.screenCapturer.component1().setThumbnailEmitter(new ThumbnailEmitter(var1, var2, (long)var3 * 1000L, new i(this, var4)));
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
      this.getEngine().startLocalAudioRecording(var1, new u(var2));
   }

   internal fun stopLocalAudioRecording(callback: (String, Int) -> Unit) {
      val var2: AsyncInitDispatcher = this.dispatcher;
      this.dispatcher.validateState();
      if (var2.getInitialized()) {
         this.getEngine().stopLocalAudioRecording(new x(var1));
      } else {
         var1.invoke("", 0);
      }
   }

   @SourceDebugExtension(["SMAP\nMediaEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaEngine.kt\ncom/discord/media/engine/MediaEngine$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,755:1\n1#2:756\n*E\n"])
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

               public final Object invokeSuspend(@NotNull Object var1) {
                  this.result = var1;
                  this.label |= Integer.MIN_VALUE;
                  return MediaEngine.Companion.access$encodeThumbnail(this.this$0, null, this);
               }
            };
         }

         label27: {
            val var5: Any = ((<unrepresentable>)var8).result;
            val var10: Any = G9.b.e();
            val var6: ByteArray;
            if (((<unrepresentable>)var8).label != 0) {
               if (((<unrepresentable>)var8).label != 1) {
                  if (((<unrepresentable>)var8).label != 2) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  var7 = ((<unrepresentable>)var8).L$0 as java.lang.String;
                  kotlin.c.b(var5);
                  break label27;
               }

               var6 = ((<unrepresentable>)var8).L$0 as ByteArray;
               kotlin.c.b(var5);
            } else {
               kotlin.c.b(var5);
               var6 = this.compressToJpegBytes(var1);
               ((<unrepresentable>)var8).L$0 = var6;
               ((<unrepresentable>)var8).label = 1;
               if (x0.a((Continuation)var8) === var10) {
                  return var10;
               }
            }

            var7 = Base64.encodeToString(var6, 0);
            ((<unrepresentable>)var8).L$0 = var7;
            ((<unrepresentable>)var8).label = 2;
            if (x0.a((Continuation)var8) === var10) {
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
