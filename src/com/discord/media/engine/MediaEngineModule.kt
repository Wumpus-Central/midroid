package com.discord.media.engine

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.media.projection.MediaProjectionManager
import android.net.Uri
import com.discord.media.engine.types.Debug
import com.discord.media.engine.video.events.ActiveSinksChangeEvent
import com.discord.media.engine.video.events.DeviceChangedEvent
import com.discord.media.engine.video.events.FirstFrameCallbackEvent
import com.discord.media.engine.video.events.MlsFailureCallbackEvent
import com.discord.media.engine.video.events.NoInputCallbackEvent
import com.discord.media.engine.video.events.OnBroadcastRequestedEvent
import com.discord.media.engine.video.events.OnBroadcastThumbnailEvent
import com.discord.media.engine.video.events.OnVideoCallbackEvent
import com.discord.media.engine.video.events.OnVoiceEvent
import com.discord.media.engine.video.events.PingCallbackEvent
import com.discord.media.engine.video.events.PingTimeoutCallbackEvent
import com.discord.media.engine.video.events.SecureFramesStateUpdateCallbackEvent
import com.discord.media.engine.video.events.UserSpeakingEvent
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ActivityEventListener
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.Dynamic
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.bridge.ReadableType
import com.facebook.react.module.annotations.ReactModule
import java.io.File
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4
import kotlin.jvm.internal.g0
import mj.r

@ReactModule(name = "VoiceEngine")
public class MediaEngineModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val activityEventListener: ActivityEventListener
   public final val mediaEngine: MediaEngine
   public final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents
   private final val startNs: Long
   private final var streamConnectionId: Int?
   private final var streamPermissions: Intent?

   init {
      kotlin.jvm.internal.q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.startNs = System.nanoTime();
      this.mediaEngine = new MediaEngine(var1, null, 2, null);
      Debug.INSTANCE.logDebugLoggingConfig();
      this.reactEvents = new ReactEvents(
         new Pair[]{
            lj.w.a("no-input-callback", g0.b(NoInputCallbackEvent.class)),
            lj.w.a("on-voice", g0.b(OnVoiceEvent.class)),
            lj.w.a("device-changed", g0.b(DeviceChangedEvent.class)),
            lj.w.a("on-broadcast-requested", g0.b(OnBroadcastRequestedEvent.class)),
            lj.w.a("on-broadcast-thumbnail", g0.b(OnBroadcastThumbnailEvent.class)),
            lj.w.a("user-speaking", g0.b(UserSpeakingEvent.class)),
            lj.w.a("ping-callback", g0.b(PingCallbackEvent.class)),
            lj.w.a("ping-timeout-callback", g0.b(PingTimeoutCallbackEvent.class)),
            lj.w.a("on-video-callback", g0.b(OnVideoCallbackEvent.class)),
            lj.w.a("active-sinks-change", g0.b(ActiveSinksChangeEvent.class)),
            lj.w.a("on-first-frame-callback", g0.b(FirstFrameCallbackEvent.class)),
            lj.w.a("mls-failure-callback", g0.b(MlsFailureCallbackEvent.class)),
            lj.w.a("secure-frames-state-update-callback", g0.b(SecureFramesStateUpdateCallbackEvent.class))
         }
      );
      this.activityEventListener = new ActivityEventListener(this) {
         final MediaEngineModule this$0;

         {
            this.this$0 = var1;
         }

         public void onActivityResult(Activity var1, int var2, int var3, Intent var4) {
            if (var3 == -1 && var2 == 420 && var4 != null) {
               MediaEngineModule.access$setStreamPermissions$p(this.this$0, var4);
               MediaEngineModule.access$getReactEvents$p(this.this$0).emitModuleEvent(this.this$0.getReactContext(), new OnBroadcastRequestedEvent());
            }
         }

         public void onNewIntent(Intent var1) {
         }
      };
   }

   private fun addConnectionCallbacks(connectionId: Int) {
      this.mediaEngine
         .connectionInstanceSetOnSpeakingCallback$media_engine_release(
            var1,
            new Function2(this, var1) {
               final int $connectionId;
               final MediaEngineModule this$0;

               {
                  super(2);
                  this.this$0 = var1;
                  this.$connectionId = var2;
               }

               public final void invoke(java.lang.String var1, int var2) {
                  kotlin.jvm.internal.q.h(var1, "userId");
                  MediaEngineModule.access$getReactEvents$p(this.this$0)
                     .emitModuleEvent(this.this$0.getReactContext(), new UserSpeakingEvent(this.$connectionId, var1, var2));
               }
            }
         );
      this.mediaEngine
         .connectionInstanceSetOnPingCallback$media_engine_release(
            var1,
            new Function4(this, var1) {
               final int $connectionId;
               final MediaEngineModule this$0;

               {
                  super(4);
                  this.this$0 = var1;
                  this.$connectionId = var2;
               }

               public final void invoke(int var1, java.lang.String var2, int var3, int var4) {
                  kotlin.jvm.internal.q.h(var2, "server");
                  MediaEngineModule.access$getReactEvents$p(this.this$0)
                     .emitModuleEvent(this.this$0.getReactContext(), new PingCallbackEvent(this.$connectionId, var1, var2, var3, var4));
               }
            }
         );
      this.mediaEngine
         .connectionInstanceSetOnPingTimeoutCallback$media_engine_release(
            var1,
            new Function4(this, var1) {
               final int $connectionId;
               final MediaEngineModule this$0;

               {
                  super(4);
                  this.this$0 = var1;
                  this.$connectionId = var2;
               }

               public final void invoke(java.lang.String var1, int var2, int var3, int var4) {
                  kotlin.jvm.internal.q.h(var1, "server");
                  MediaEngineModule.access$getReactEvents$p(this.this$0)
                     .emitModuleEvent(this.this$0.getReactContext(), new PingTimeoutCallbackEvent(this.$connectionId, var1, var2, var3, var4));
               }
            }
         );
      this.mediaEngine
         .connectionInstanceSetOnFirstFrameCallback$media_engine_release(
            var1,
            new Function3(this, var1) {
               final int $connectionId;
               final MediaEngineModule this$0;

               {
                  super(3);
                  this.this$0 = var1;
                  this.$connectionId = var2;
               }

               public final void invoke(java.lang.String var1, long var2, java.lang.String var4) {
                  kotlin.jvm.internal.q.h(var1, "userId");
                  kotlin.jvm.internal.q.h(var4, "streamId");
                  MediaEngineModule.access$getReactEvents$p(this.this$0)
                     .emitModuleEvent(this.this$0.getReactContext(), new FirstFrameCallbackEvent(this.$connectionId, var1, var2, var4));
               }
            }
         );
      this.mediaEngine
         .connectionInstanceSetOnMLSFailureCallback$media_engine_release(
            var1,
            new Function2(this, var1) {
               final int $connectionId;
               final MediaEngineModule this$0;

               {
                  super(2);
                  this.this$0 = var1;
                  this.$connectionId = var2;
               }

               public final void invoke(java.lang.String var1, java.lang.String var2) {
                  kotlin.jvm.internal.q.h(var1, "source");
                  kotlin.jvm.internal.q.h(var2, "reason");
                  MediaEngineModule.access$getReactEvents$p(this.this$0)
                     .emitModuleEvent(this.this$0.getReactContext(), new MlsFailureCallbackEvent(this.$connectionId, var1, var2));
               }
            }
         );
      this.mediaEngine
         .connectionInstanceSetSecureFramesStateUpdateCallback$media_engine_release(
            var1,
            new Function1(this, var1) {
               final int $connectionId;
               final MediaEngineModule this$0;

               {
                  super(1);
                  this.this$0 = var1;
                  this.$connectionId = var2;
               }

               public final void invoke(java.lang.String var1) {
                  kotlin.jvm.internal.q.h(var1, "stateUpdateJSON");
                  MediaEngineModule.access$getReactEvents$p(this.this$0)
                     .emitModuleEvent(this.this$0.getReactContext(), new SecureFramesStateUpdateCallbackEvent(this.$connectionId, var1));
               }
            }
         );
   }

   private fun createConnection(connectionId: Int, userId: String, connectionOptions: ReadableMap, callback: (String, Map<String, Any>) -> Unit) {
      this.mediaEngine.createVoiceConnection(var1, var2, NativeMapExtensionsKt.toJsonString(var3), var4);
   }

   @ReactMethod
   public fun addListener(type: String) {
      kotlin.jvm.internal.q.h(var1, "type");
   }

   @ReactMethod
   public fun connectionInstanceConfigureConnectionRetries(connectionId: Int, baseDelayMs: Int, maxDelayMs: Int, maxAttempts: Int): Unit? {
      return this.mediaEngine.connectionInstanceConfigureConnectionRetries$media_engine_release(var1, var2, var3, var4);
   }

   @ReactMethod
   public fun connectionInstanceDestroy(connectionId: Int) {
      this.mediaEngine.connectionInstanceDestroy$media_engine_release(var1);
      if (this.streamConnectionId != null && var1 == this.streamConnectionId) {
         this.streamConnectionId = null;
      }
   }

   @ReactMethod
   public fun connectionInstanceDestroyUser(connectionId: Int, userId: String): Unit? {
      kotlin.jvm.internal.q.h(var2, "userId");
      return this.mediaEngine.connectionInstanceDestroyUser$media_engine_release(var1, var2);
   }

   @ReactMethod
   public fun connectionInstanceExecuteSecureFramesTransition(connectionId: Int, transitionId: Int): Unit? {
      return this.mediaEngine.connectionInstanceExecuteSecureFramesTransition$media_engine_release(var1, var2);
   }

   @ReactMethod
   public fun connectionInstanceFastUdpReconnect(connectionId: Int): Unit? {
      return this.mediaEngine.connectionInstanceFastUdpReconnect$media_engine_release(var1);
   }

   @ReactMethod
   public fun connectionInstanceGetEncryptionModes(connectionId: Int, callback: Callback): Unit? {
      kotlin.jvm.internal.q.h(var2, "callback");
      return this.mediaEngine.connectionInstanceGetEncryptionModes$media_engine_release(var1, new Function1(var2) {
         final Callback $callback;

         {
            super(1);
            this.$callback = var1;
         }

         public final void invoke(java.lang.String[] var1) {
            kotlin.jvm.internal.q.h(var1, "modes");
            this.$callback.invoke(new Object[]{NativeArrayExtensionsKt.toNativeArray(var1)});
         }
      });
   }

   @ReactMethod
   public fun connectionInstanceGetFilteredStats(connectionId: Int, filter: Int, callback: Callback): Unit? {
      kotlin.jvm.internal.q.h(var3, "callback");
      return this.mediaEngine.connectionInstanceGetFilteredStats$media_engine_release(var1, var2, new Function1(var3) {
         final Callback $callback;

         {
            super(1);
            this.$callback = var1;
         }

         public final void invoke(java.lang.String var1) {
            kotlin.jvm.internal.q.h(var1, "stats");
            this.$callback.invoke(new Object[]{var1});
         }
      });
   }

   @ReactMethod
   public fun connectionInstanceGetMLSKeyPackageB64(connectionId: Int, callback: Callback): Unit? {
      kotlin.jvm.internal.q.h(var2, "callback");
      return this.mediaEngine.connectionInstanceGetMLSKeyPackageB64$media_engine_release(var1, new Function1(var2) {
         final Callback $callback;

         {
            super(1);
            this.$callback = var1;
         }

         public final void invoke(java.lang.String var1) {
            kotlin.jvm.internal.q.h(var1, "keyPackageB64");
            this.$callback.invoke(new Object[]{var1});
         }
      });
   }

   @ReactMethod
   public fun connectionInstanceGetStats(connectionId: Int, callback: Callback): Unit? {
      kotlin.jvm.internal.q.h(var2, "callback");
      return this.mediaEngine.connectionInstanceGetStats$media_engine_release(var1, new Function1(var2) {
         final Callback $callback;

         {
            super(1);
            this.$callback = var1;
         }

         public final void invoke(java.lang.String var1) {
            kotlin.jvm.internal.q.h(var1, "stats");
            this.$callback.invoke(new Object[]{var1});
         }
      });
   }

   @ReactMethod
   public fun connectionInstanceMergeUsers(connectionId: Int, users: ReadableArray): Unit? {
      kotlin.jvm.internal.q.h(var2, "users");
      return this.mediaEngine.connectionInstanceMergeUsers$media_engine_release(var1, NativeArrayExtensionsKt.toJsonString(var2));
   }

   @ReactMethod
   public fun connectionInstancePrepareMLSCommitTransitionB64(connectionId: Int, transitionId: Int, commit: String, callback: Callback): Unit? {
      kotlin.jvm.internal.q.h(var3, "commit");
      kotlin.jvm.internal.q.h(var4, "callback");
      return this.mediaEngine.connectionInstancePrepareMLSCommitTransitionB64$media_engine_release(var1, var2, var3, new Function3(var4) {
         final Callback $callback;

         {
            super(3);
            this.$callback = var1;
         }

         public final void invoke(boolean var1, int var2, java.lang.String var3) {
            kotlin.jvm.internal.q.h(var3, "rosterChange");
            this.$callback.invoke(new Object[]{var1, var2, var3});
         }
      });
   }

   @ReactMethod
   public fun connectionInstancePrepareSecureFramesEpoch(connectionId: Int, epoch: String, transitionId: Int, groupId: String): Unit? {
      kotlin.jvm.internal.q.h(var2, "epoch");
      kotlin.jvm.internal.q.h(var4, "groupId");
      return this.mediaEngine.connectionInstancePrepareSecureFramesEpoch$media_engine_release(var1, var2, var3, var4);
   }

   @ReactMethod
   public fun connectionInstancePrepareSecureFramesTransition(connectionId: Int, transitionId: Int, protocolVersion: Int, callback: Callback): Unit? {
      kotlin.jvm.internal.q.h(var4, "callback");
      return this.mediaEngine.connectionInstancePrepareSecureFramesTransition$media_engine_release(var1, var2, var3, new Function0(var4) {
         final Callback $callback;

         {
            super(0);
            this.$callback = var1;
         }

         public final void invoke() {
            this.$callback.invoke(new Object[0]);
         }
      });
   }

   @ReactMethod
   public fun connectionInstanceProcessMLSProposalsB64(connectionId: Int, proposals: String, callback: Callback): Unit? {
      kotlin.jvm.internal.q.h(var2, "proposals");
      kotlin.jvm.internal.q.h(var3, "callback");
      return this.mediaEngine.connectionInstanceProcessMLSProposalsB64$media_engine_release(var1, var2, new Function1(var3) {
         final Callback $callback;

         {
            super(1);
            this.$callback = var1;
         }

         public final void invoke(java.lang.String var1) {
            kotlin.jvm.internal.q.h(var1, "commitWelcome");
            this.$callback.invoke(new Object[]{var1});
         }
      });
   }

   @ReactMethod
   public fun connectionInstanceProcessMLSWelcomeB64(connectionId: Int, transitionId: Int, welcome: String, callback: Callback): Unit? {
      kotlin.jvm.internal.q.h(var3, "welcome");
      kotlin.jvm.internal.q.h(var4, "callback");
      return this.mediaEngine.connectionInstanceProcessMLSWelcomeB64$media_engine_release(var1, var2, var3, new Function3(var4) {
         final Callback $callback;

         {
            super(3);
            this.$callback = var1;
         }

         public final void invoke(boolean var1, int var2, java.lang.String var3) {
            kotlin.jvm.internal.q.h(var3, "rosterChange");
            this.$callback.invoke(new Object[]{var1, var2, var3});
         }
      });
   }

   @ReactMethod
   public fun connectionInstanceSetDesktopSource(connectionId: Int, stringId: String, useVideoHook: Boolean, type: String) {
      kotlin.jvm.internal.q.h(var2, "stringId");
      kotlin.jvm.internal.q.h(var4, "type");
   }

   @ReactMethod
   public fun connectionInstanceSetLocalMute(connectionId: Int, userId: String, mute: Boolean): Unit? {
      kotlin.jvm.internal.q.h(var2, "userId");
      return this.mediaEngine.connectionInstanceSetLocalMute$media_engine_release(var1, var2, var3);
   }

   @ReactMethod
   public fun connectionInstanceSetLocalPan(connectionId: Int, userId: String, left: Float, right: Float): Unit? {
      kotlin.jvm.internal.q.h(var2, "userId");
      return this.mediaEngine.connectionInstanceSetLocalPan$media_engine_release(var1, var2, var3, var4);
   }

   @ReactMethod
   public fun connectionInstanceSetLocalVolume(connectionId: Int, userId: String, volume: Float): Unit? {
      kotlin.jvm.internal.q.h(var2, "userId");
      return this.mediaEngine.connectionInstanceSetLocalVolume$media_engine_release(var1, var2, var3);
   }

   @ReactMethod
   public fun connectionInstanceSetMinimumOutputDelay(connectionId: Int, delay: Int): Unit? {
      return this.mediaEngine.connectionInstanceSetMinimumOutputDelay$media_engine_release(var1, var2);
   }

   @ReactMethod
   public fun connectionInstanceSetNoInputThreshold(connectionId: Int, threshold: Float): Unit? {
      return this.mediaEngine.connectionInstanceSetNoInputThreshold$media_engine_release(var1, var2);
   }

   @ReactMethod
   public fun connectionInstanceSetPTTActive(connectionId: Int, active: Boolean, priority: Boolean): Unit? {
      return this.mediaEngine.connectionInstanceSetPTTActive$media_engine_release(var1, var2, var3);
   }

   @ReactMethod
   public fun connectionInstanceSetPingInterval(connectionId: Int, pingInterval: Int): Unit? {
      return this.mediaEngine.connectionInstanceSetPingInterval$media_engine_release(var1, var2);
   }

   @ReactMethod
   public fun connectionInstanceSetSelfDeafen(connectionId: Int, deafened: Boolean): Unit? {
      return this.mediaEngine.connectionInstanceSetSelfDeafen$media_engine_release(var1, var2);
   }

   @ReactMethod
   public fun connectionInstanceSetSelfMute(connectionId: Int, muted: Boolean): Unit? {
      return this.mediaEngine.connectionInstanceSetSelfMute$media_engine_release(var1, var2);
   }

   @ReactMethod
   public fun connectionInstanceSetTransportOptions(connectionId: Int, options: ReadableMap): Unit? {
      kotlin.jvm.internal.q.h(var2, "options");
      return this.mediaEngine.connectionInstanceSetTransportOptions$media_engine_release(var1, NativeMapExtensionsKt.toJsonString(var2));
   }

   @ReactMethod
   public fun connectionInstanceSetVideoBroadcast(connectionId: Int, broadcasting: Boolean): Unit? {
      return this.mediaEngine.connectionInstanceSetVideoBroadcast$media_engine_release(var1, var2);
   }

   @ReactMethod
   public fun connectionInstanceTriggerOnVideoCallback(connectionId: Int) {
      this.mediaEngine
         .connectionInstanceSetOnVideoCallback$media_engine_release(
            var1,
            new Function4(this, var1) {
               final int $connectionId;
               final MediaEngineModule this$0;

               {
                  super(4);
                  this.this$0 = var1;
                  this.$connectionId = var2;
               }

               public final void invoke(java.lang.String var1, long var2, java.lang.String var4, java.lang.String var5) {
                  kotlin.jvm.internal.q.h(var1, "userId");
                  kotlin.jvm.internal.q.h(var4, "streamId");
                  kotlin.jvm.internal.q.h(var5, "videoStreamParametersJSON");
                  MediaEngineModule.access$getReactEvents$p(this.this$0)
                     .emitModuleEvent(this.this$0.getReactContext(), new OnVideoCallbackEvent(this.$connectionId, var1, var2, var4, var5));
               }
            }
         );
   }

   @ReactMethod
   public fun connectionInstanceUpdateMLSExternalSenderB64(connectionId: Int, externalSenderB64: String): Unit? {
      kotlin.jvm.internal.q.h(var2, "externalSenderB64");
      return this.mediaEngine.connectionInstanceUpdateMLSExternalSenderB64$media_engine_release(var1, var2);
   }

   @ReactMethod
   public fun connectionInstanceWasRemoteDisconnected(connectionId: Int) {
   }

   @ReactMethod
   public fun createOwnStreamConnectionWithOptions(connectionId: Int, userId: String, connectionOptions: ReadableMap, callback: Callback) {
      kotlin.jvm.internal.q.h(var2, "userId");
      kotlin.jvm.internal.q.h(var3, "connectionOptions");
      kotlin.jvm.internal.q.h(var4, "callback");
      this.createConnection(var1, var2, var3, new Function2(var4, this, var1) {
         final Callback $callback;
         final int $connectionId;
         final MediaEngineModule this$0;

         {
            super(2);
            this.$callback = var1;
            this.this$0 = var2;
            this.$connectionId = var3;
         }

         public final void invoke(java.lang.String var1, java.util.Map<java.lang.String, ? extends Object> var2) {
            kotlin.jvm.internal.q.h(var1, "errorMessage");
            kotlin.jvm.internal.q.h(var2, "connectionInfo");
            this.$callback.invoke(new Object[]{var1, NativeMapExtensionsKt.toNativeMap(var2)});
            val var5: Intent = MediaEngineModule.access$getStreamPermissions$p(this.this$0);
            if (var5 != null) {
               val var4: MediaEngineModule = this.this$0;
               val var3: Int = this.$connectionId;
               this.this$0.getMediaEngine().connectionInstanceStartBroadcast$media_engine_release(var3, var5);
               MediaEngineModule.access$setStreamPermissions$p(var4, null);
            }
         }
      });
      this.streamConnectionId = var1;
      this.addConnectionCallbacks(var1);
   }

   @ReactMethod
   public fun createVoiceConnectionWithOptions(connectionId: Int, userId: String, connectionOptions: ReadableMap, callback: Callback) {
      kotlin.jvm.internal.q.h(var2, "userId");
      kotlin.jvm.internal.q.h(var3, "connectionOptions");
      kotlin.jvm.internal.q.h(var4, "callback");
      this.createConnection(var1, var2, var3, new Function2(var4) {
         final Callback $callback;

         {
            super(2);
            this.$callback = var1;
         }

         public final void invoke(java.lang.String var1, java.util.Map<java.lang.String, ? extends Object> var2) {
            kotlin.jvm.internal.q.h(var1, "errorMessage");
            kotlin.jvm.internal.q.h(var2, "connectionInfo");
            this.$callback.invoke(new Object[]{var1, NativeMapExtensionsKt.toNativeMap(var2)});
         }
      });
      this.addConnectionCallbacks(var1);
   }

   @ReactMethod
   public fun getAudioSubsystem(callback: Callback) {
      kotlin.jvm.internal.q.h(var1, "callback");
      this.mediaEngine.getAudioSubsystem$media_engine_release(new Function2(var1) {
         final Callback $callback;

         {
            super(2);
            this.$callback = var1;
         }

         public final void invoke(java.lang.String var1, java.lang.String var2) {
            kotlin.jvm.internal.q.h(var1, "subsystem");
            kotlin.jvm.internal.q.h(var2, "audioLayer");
            this.$callback.invoke(new Object[]{var1, var2});
         }
      });
   }

   @ReactMethod
   public fun getCodecCapabilities(callback: Callback) {
      kotlin.jvm.internal.q.h(var1, "callback");
      this.mediaEngine.getCodecCapabilities$media_engine_release(new Function1(var1) {
         final Callback $callback;

         {
            super(1);
            this.$callback = var1;
         }

         public final void invoke(java.lang.String var1) {
            kotlin.jvm.internal.q.h(var1, "codecs");
            this.$callback.invoke(new Object[]{var1});
         }
      });
   }

   @ReactMethod
   public fun getCodecSurvey(callback: Callback) {
      kotlin.jvm.internal.q.h(var1, "callback");
      this.mediaEngine.getCodecSurvey$media_engine_release(new Function1(var1) {
         final Callback $callback;

         {
            super(1);
            this.$callback = var1;
         }

         public final void invoke(java.lang.String var1) {
            kotlin.jvm.internal.q.h(var1, "jsonStr");
            this.$callback.invoke(new Object[]{var1});
         }
      });
   }

   public open fun getConstants(): MutableMap<String, Any?> {
      return r.m(
         new Pair[]{
            lj.w.a("DegradationPreference", r.l(new Pair[]{lj.w.a("MAINTAIN_RESOLUTION", 0), lj.w.a("MAINTAIN_FRAMERATE", 1), lj.w.a("BALANCED", 2)})),
            lj.w.a(
               "AVAudioSessionMode",
               r.l(
                  new Pair[]{
                     lj.w.a("VOICE", "AVAudioSessionModeVoiceChat"),
                     lj.w.a("VIDEO", "AVAudioSessionModeVideoChat"),
                     lj.w.a("LISTEN", "AVAudioSessionModeSpokenAudio"),
                     lj.w.a("DEFAULT", "AVAudioSessionModeDefault")
                  }
               )
            ),
            lj.w.a("SupportedSecureFramesProtocolVersion", 113),
            lj.w.a(
               "supportedFeatures",
               kotlin.collections.i.m(
                  new java.lang.String[]{
                     "voice_sound_stop_loop",
                     "voice_relative_sounds",
                     "voice_legacy_subsystem",
                     "voice_experimental_subsystem",
                     "elevated_hook",
                     "soundshare",
                     "soundshare_loopback",
                     "set_audio_device_by_id",
                     "set_video_device_by_id",
                     "loopback",
                     "wumpus_video",
                     "hybrid_video",
                     "experimental_encoders",
                     "experiment_config",
                     "remote_locus_network_control",
                     "screen_previews",
                     "window_previews",
                     "audio_debug_state",
                     "connection_replay",
                     "simulcast_bugfix",
                     "RTC_REGION_RANKING",
                     "video_effects",
                     "direct_video",
                     "electron_video",
                     "mediapipe",
                     "fixed_keyframe_interval",
                     "clips",
                     "first_frame_callback",
                     "remote_user_multi_stream"
                  }
               )
            )
         }
      );
   }

   @ReactMethod
   public fun getInputDevices(callback: Callback) {
      kotlin.jvm.internal.q.h(var1, "callback");
      this.mediaEngine.getInputDevices$media_engine_release(new Function1(var1) {
         final Callback $callback;

         {
            super(1);
            this.$callback = var1;
         }

         public final void invoke(java.util.List<? extends java.util.Map<java.lang.String, ? extends Object>> var1) {
            kotlin.jvm.internal.q.h(var1, "devices");
            this.$callback.invoke(new Object[]{NativeArrayExtensionsKt.toNativeArrayOfMaps(var1)});
         }
      });
   }

   @ReactMethod
   public fun getMLSSigningKeyB64(sessionId: String, signatureVersion: Int, callback: Callback) {
      kotlin.jvm.internal.q.h(var1, "sessionId");
      kotlin.jvm.internal.q.h(var3, "callback");
      this.mediaEngine.getMLSSigningKeyB64$media_engine_release(var1, var2, new Function2(var3) {
         final Callback $callback;

         {
            super(2);
            this.$callback = var1;
         }

         public final void invoke(java.lang.String var1, java.lang.String var2) {
            kotlin.jvm.internal.q.h(var1, "key");
            kotlin.jvm.internal.q.h(var2, "signature");
            this.$callback.invoke(new Object[]{var1, var2});
         }
      });
   }

   public open fun getName(): String {
      return "VoiceEngine";
   }

   @ReactMethod
   public fun getOutputDevices(callback: Callback) {
      kotlin.jvm.internal.q.h(var1, "callback");
      this.mediaEngine.getOutputDevices$media_engine_release(new Function1(var1) {
         final Callback $callback;

         {
            super(1);
            this.$callback = var1;
         }

         public final void invoke(java.util.List<? extends java.util.Map<java.lang.String, ? extends Object>> var1) {
            kotlin.jvm.internal.q.h(var1, "devices");
            this.$callback.invoke(new Object[]{NativeArrayExtensionsKt.toNativeArrayOfMaps(var1)});
         }
      });
   }

   @ReactMethod
   public fun getSupportedVideoCodecs(callback: Callback) {
      kotlin.jvm.internal.q.h(var1, "callback");
      this.mediaEngine.getSupportedVideoCodecs$media_engine_release(new Function1(var1) {
         final Callback $callback;

         {
            super(1);
            this.$callback = var1;
         }

         public final void invoke(java.lang.String[] var1) {
            kotlin.jvm.internal.q.h(var1, "codecs");
            this.$callback.invoke(new Object[]{NativeArrayExtensionsKt.toNativeArray(var1)});
         }
      });
   }

   @ReactMethod
   public fun getVideoInputDevices(callback: Callback) {
      kotlin.jvm.internal.q.h(var1, "callback");
      this.mediaEngine.getVideoInputDevices$media_engine_release(new Function1(var1) {
         final Callback $callback;

         {
            super(1);
            this.$callback = var1;
         }

         public final void invoke(java.util.List<? extends java.util.Map<java.lang.String, ? extends Object>> var1) {
            kotlin.jvm.internal.q.h(var1, "devices");
            this.$callback.invoke(new Object[]{NativeArrayExtensionsKt.toNativeArrayOfMaps(var1)});
         }
      });
   }

   @ReactMethod
   public fun initializeEngine() {
      this.mediaEngine.setOnNoInputCallback$media_engine_release(new Function1(this) {
         final MediaEngineModule this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(boolean var1) {
            MediaEngineModule.access$getReactEvents$p(this.this$0).emitModuleEvent(this.this$0.getReactContext(), new NoInputCallbackEvent(var1));
         }
      });
      this.mediaEngine.setOnVoiceCallback$media_engine_release(new Function2(this) {
         final MediaEngineModule this$0;

         {
            super(2);
            this.this$0 = var1;
         }

         public final void invoke(float var1, int var2) {
            MediaEngineModule.access$getReactEvents$p(this.this$0).emitModuleEvent(this.this$0.getReactContext(), new OnVoiceEvent(var1, var2));
         }
      });
      this.mediaEngine.setActiveSinksChangeCallback$media_engine_release(new Function2(this) {
         final MediaEngineModule this$0;

         {
            super(2);
            this.this$0 = var1;
         }

         public final void invoke(java.lang.String var1, boolean var2) {
            kotlin.jvm.internal.q.h(var1, "streamId");
            MediaEngineModule.access$getReactEvents$p(this.this$0).emitModuleEvent(this.this$0.getReactContext(), new ActiveSinksChangeEvent(var1, var2));
         }
      });
      this.mediaEngine
         .setDeviceChangeCallback$media_engine_release(
            new Function3(this) {
               final MediaEngineModule this$0;

               {
                  super(3);
                  this.this$0 = var1;
               }

               public final void invoke(
                  java.util.List<? extends java.util.Map<java.lang.String, ? extends Object>> var1,
                  java.util.List<? extends java.util.Map<java.lang.String, ? extends Object>> var2,
                  java.util.List<? extends java.util.Map<java.lang.String, ? extends Object>> var3
               ) {
                  kotlin.jvm.internal.q.h(var1, "inputDevices");
                  kotlin.jvm.internal.q.h(var2, "outputDevices");
                  kotlin.jvm.internal.q.h(var3, "videoInputDevices");
                  MediaEngineModule.access$getReactEvents$p(this.this$0)
                     .emitModuleEvent(this.this$0.getReactContext(), new DeviceChangedEvent(var1, var2, var3));
               }
            }
         );
      this.reactContext.addActivityEventListener(this.activityEventListener);
   }

   public open fun invalidate() {
      super.invalidate();
      this.reactContext.removeActivityEventListener(this.activityEventListener);
      this.mediaEngine.reset();
   }

   @ReactMethod
   public fun rankRtcRegions(regionsWithIps: ReadableArray, callback: Callback) {
      kotlin.jvm.internal.q.h(var1, "regionsWithIps");
      kotlin.jvm.internal.q.h(var2, "callback");
      this.mediaEngine.rankRtcRegions$media_engine_release(NativeArrayExtensionsKt.toJsonString(var1), new Function1(var2) {
         final Callback $callback;

         {
            super(1);
            this.$callback = var1;
         }

         public final void invoke(java.lang.String[] var1) {
            kotlin.jvm.internal.q.h(var1, "regions");
            this.$callback.invoke(new Object[]{NativeArrayExtensionsKt.toNativeArray(var1)});
         }
      });
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun setAVAudioSessionMode(mode: String) {
      kotlin.jvm.internal.q.h(var1, "mode");
   }

   @ReactMethod
   public fun setAudioInputEnabled(enabled: Boolean) {
      this.mediaEngine.setAudioInputEnabled$media_engine_release(var1);
   }

   @ReactMethod
   public fun setBroadcastThumbnailParams(width: Int, height: Int, intervalSeconds: Int) {
      this.mediaEngine.setBroadcastThumbnailParams$media_engine_release(var1, var2, var3, new Function1(this) {
         final MediaEngineModule this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(java.lang.String var1) {
            kotlin.jvm.internal.q.h(var1, "imgdata");
            MediaEngineModule.access$getReactEvents$p(this.this$0).emitModuleEvent(this.this$0.getReactContext(), new OnBroadcastThumbnailEvent(var1));
         }
      });
   }

   @ReactMethod
   public fun setEmitVADLevel2(enable: Boolean) {
      this.mediaEngine.setEmitVADLevel2$media_engine_release(var1);
   }

   @ReactMethod
   public fun setHasFullbandPerformance(hasFullbandPerformance: Boolean) {
      this.mediaEngine.setHasFullbandPerformance$media_engine_release(var1);
   }

   @ReactMethod
   public fun setInputDevice(deviceIndex: Dynamic) {
      kotlin.jvm.internal.q.h(var1, "deviceIndex");
      val var3: MediaEngine = this.mediaEngine;
      val var4: ReadableType = var1.getType();
      val var2: Int;
      if (var4 == null) {
         var2 = -1;
      } else {
         var2 = MediaEngineModule.Companion.WhenMappings.$EnumSwitchMapping$0[var4.ordinal()];
      }

      if (var2 != 1) {
         if (var2 != 2) {
            val var7: ReadableType = var1.getType();
            val var6: StringBuilder = new StringBuilder();
            var6.append("Unexpected deviceIndex type: ");
            var6.append(var7);
            throw new IllegalArgumentException(var6.toString());
         }

         val var5: java.lang.String = var1.asString();
         kotlin.jvm.internal.q.g(var5, "asString(...)");
         var3.setInputDevice$media_engine_release(var5);
      } else {
         var3.setInputDevice$media_engine_release(var1.asInt());
      }
   }

   @ReactMethod
   public fun setInputVolume(volume: Float) {
      this.mediaEngine.setInputVolume$media_engine_release(var1);
   }

   @ReactMethod
   public fun setNoInputThreshold(threshold: Float) {
      this.mediaEngine.setNoInputThreshold$media_engine_release(var1);
   }

   @ReactMethod
   public fun setOutputDevice(deviceIndex: Dynamic) {
      kotlin.jvm.internal.q.h(var1, "deviceIndex");
      val var3: MediaEngine = this.mediaEngine;
      val var4: ReadableType = var1.getType();
      val var2: Int;
      if (var4 == null) {
         var2 = -1;
      } else {
         var2 = MediaEngineModule.Companion.WhenMappings.$EnumSwitchMapping$0[var4.ordinal()];
      }

      if (var2 != 1) {
         if (var2 != 2) {
            val var6: ReadableType = var1.getType();
            val var7: StringBuilder = new StringBuilder();
            var7.append("Unexpected deviceIndex type: ");
            var7.append(var6);
            throw new IllegalArgumentException(var7.toString());
         }

         val var5: java.lang.String = var1.asString();
         kotlin.jvm.internal.q.g(var5, "asString(...)");
         var3.setOutputDevice$media_engine_release(var5);
      } else {
         var3.setOutputDevice$media_engine_release(var1.asInt());
      }
   }

   @ReactMethod
   public fun setOutputVolume(volume: Float) {
      this.mediaEngine.setOutputVolume$media_engine_release(var1);
   }

   @ReactMethod
   public fun setSidechainCompression(enabled: Boolean) {
      this.mediaEngine.setSidechainCompression$media_engine_release(var1);
   }

   @ReactMethod
   public fun setTransportOptions(options: ReadableMap) {
      kotlin.jvm.internal.q.h(var1, "options");
      this.mediaEngine.setTransportOptions$media_engine_release(NativeMapExtensionsKt.toJsonString(var1));
   }

   @ReactMethod
   public fun setVideoInputDevice(deviceIndex: Dynamic) {
      kotlin.jvm.internal.q.h(var1, "deviceIndex");
      val var3: MediaEngine = this.mediaEngine;
      val var4: ReadableType = var1.getType();
      val var2: Int;
      if (var4 == null) {
         var2 = -1;
      } else {
         var2 = MediaEngineModule.Companion.WhenMappings.$EnumSwitchMapping$0[var4.ordinal()];
      }

      if (var2 != 1) {
         if (var2 != 2) {
            val var7: ReadableType = var1.getType();
            val var6: StringBuilder = new StringBuilder();
            var6.append("Unexpected deviceIndex type: ");
            var6.append(var7);
            throw new IllegalArgumentException(var6.toString());
         }

         val var5: java.lang.String = var1.asString();
         kotlin.jvm.internal.q.g(var5, "asString(...)");
         var3.setVideoInputDevice$media_engine_release(var5);
      } else {
         var3.setVideoInputDevice$media_engine_release(var1.asInt());
      }
   }

   @ReactMethod
   public fun startBroadcast() {
      val var1: Activity = this.getCurrentActivity();
      if (var1 != null) {
         var1.startActivityForResult(MediaEngineModule.Companion.access$createScreenCaptureIntent(Companion, var1), 420);
      }
   }

   @ReactMethod
   public fun startLocalAudioRecording(options: ReadableMap, callback: Callback) {
      kotlin.jvm.internal.q.h(var1, "options");
      kotlin.jvm.internal.q.h(var2, "callback");
      this.mediaEngine.startLocalAudioRecording$media_engine_release(NativeMapExtensionsKt.toJsonString(var1), new Function1(var2) {
         final Callback $callback;

         {
            super(1);
            this.$callback = var1;
         }

         public final void invoke(boolean var1) {
            this.$callback.invoke(new Object[]{var1});
         }
      });
   }

   @ReactMethod
   public fun stopBroadcast(): Unit? {
      val var2: Unit;
      if (this.streamConnectionId != null) {
         this.mediaEngine.connectionInstanceStopBroadcast$media_engine_release(this.streamConnectionId.intValue());
         var2 = Unit.a;
      } else {
         var2 = null;
      }

      return var2;
   }

   @ReactMethod
   public fun stopBroadcastWithError(errorCode: Int, errorMessage: String): Unit? {
      kotlin.jvm.internal.q.h(var2, "errorMessage");
      val var5: Unit;
      if (this.streamConnectionId != null) {
         this.mediaEngine.connectionInstanceStopBroadcastWithError$media_engine_release(this.streamConnectionId.intValue(), var1, var2);
         var5 = Unit.a;
      } else {
         var5 = null;
      }

      return var5;
   }

   @ReactMethod
   public fun stopLocalAudioRecording(callback: Callback) {
      kotlin.jvm.internal.q.h(var1, "callback");
      this.mediaEngine.stopLocalAudioRecording$media_engine_release(new Function2(var1) {
         final Callback $callback;

         {
            super(2);
            this.$callback = var1;
         }

         public final void invoke(java.lang.String var1, int var2) {
            kotlin.jvm.internal.q.h(var1, "fileName");
            val var3: Uri = Uri.fromFile(new File(var1));
            kotlin.jvm.internal.q.g(var3, "fromFile(this)");
            this.$callback.invoke(new Object[]{var3.toString(), var2});
         }
      });
   }

   public companion object {
      public const val NAME: String
      private const val START_SCREENSHARE_REQUEST_CODE: Int
      private const val TAG: String

      private fun Context.createScreenCaptureIntent(): Intent {
         var var2: Intent = (Intent)var1.getSystemService("media_projection");
         kotlin.jvm.internal.q.f(var2, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
         var2 = (var2 as MediaProjectionManager).createScreenCaptureIntent();
         kotlin.jvm.internal.q.g(var2, "createScreenCaptureIntent(...)");
         return var2;
      }

      private inline fun setDeviceIndex(deviceIndex: Dynamic, setInt: (Int) -> Unit, setString: (String) -> Unit) {
         val var5: ReadableType = var1.getType();
         val var4: Int;
         if (var5 == null) {
            var4 = -1;
         } else {
            var4 = MediaEngineModule.Companion.WhenMappings.$EnumSwitchMapping$0[var5.ordinal()];
         }

         if (var4 != 1) {
            if (var4 != 2) {
               val var8: ReadableType = var1.getType();
               val var7: StringBuilder = new StringBuilder();
               var7.append("Unexpected deviceIndex type: ");
               var7.append(var8);
               throw new IllegalArgumentException(var7.toString());
            }

            val var6: java.lang.String = var1.asString();
            kotlin.jvm.internal.q.g(var6, "asString(...)");
            var3.invoke(var6);
         } else {
            var2.invoke(var1.asInt());
         }
      }
   }
}
