package com.discord.audio

import android.os.Build.VERSION
import com.discord.audio.react.events.AudioRouteEmitterAudioRouteChanged
import com.discord.codegen.NativeAudioRouteEmitterSpec
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import kh.w
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

public class AudioRouteEmitterModule(reactContext: ReactApplicationContext) : NativeAudioRouteEmitterSpec {
   private final lateinit var audioManager: DiscordAudioManagerInterface
   private final val audioManagerListener: <unrepresentable>
   private final val reactEvents: ReactEvents

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.audioManagerListener = new DiscordAudioManagerListener(this) {
         final AudioRouteEmitterModule this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public void onActiveAudioDeviceChanged(AndroidAudioDevice var1) {
            q.h(var1, "activeAudioDevice");
            val var2: AudioRouteEmitterAudioRouteChanged = new AudioRouteEmitterAudioRouteChanged(
               AudioRouteEmitterModule.Companion.access$toRouteTypeString(AudioRouteEmitterModule.Companion, var1), false
            );
            val var3: ReactEvents = AudioRouteEmitterModule.access$getReactEvents$p(this.this$0);
            val var4: ReactApplicationContext = AudioRouteEmitterModule.access$getReactApplicationContext(this.this$0);
            q.g(var4, "access$getReactApplicationContext(...)");
            var3.emitModuleEvent(var4, var2);
         }

         @Override
         public void onAudioDevicesUpdated(java.util.List<AndroidAudioDevice> var1) {
            q.h(var1, "audioDevices");
         }
      };
      this.reactEvents = new ReactEvents(w.a("audio-route-changed", g0.b(AudioRouteEmitterAudioRouteChanged.class)));
   }

   @ReactMethod
   public fun addListener(type: String) {
      q.h(var1, "type");
   }

   public override fun getCurrentRoute(promise: Promise?) {
      if (var1 != null) {
         var var2: DiscordAudioManagerInterface = this.audioManager;
         if (this.audioManager == null) {
            q.y("audioManager");
            var2 = null;
         }

         var1.resolve(
            NativeMapExtensionsKt.nativeMapOf(
               w.a("routeType", AudioRouteEmitterModule.Companion.access$toRouteTypeString(Companion, var2.getEffectiveAudioDevice())),
               w.a("multipleRoutesAvailable", java.lang.Boolean.FALSE)
            )
         );
      }
   }

   public override fun getName(): String {
      return "RTNAudioRouteEmitter";
   }

   public open fun initialize() {
      super.initialize();
      if (VERSION.SDK_INT >= 33) {
         val var2: DiscordAudioManager2.Companion = DiscordAudioManager2.Companion;
         val var1: ReactApplicationContext = this.getReactApplicationContext();
         q.g(var1, "getReactApplicationContext(...)");
         this.audioManager = var2.getInstance(var1);
      } else {
         val var5: DiscordAudioManager.Companion = DiscordAudioManager.Companion;
         val var3: ReactApplicationContext = this.getReactApplicationContext();
         q.g(var3, "getReactApplicationContext(...)");
         this.audioManager = var5.getInstance(var3);
      }

      var var4: DiscordAudioManagerInterface = this.audioManager;
      if (this.audioManager == null) {
         q.y("audioManager");
         var4 = null;
      }

      var4.addListener(this.audioManagerListener);
   }

   public open fun invalidate() {
      super.invalidate();
      var var1: DiscordAudioManagerInterface = this.audioManager;
      if (this.audioManager == null) {
         q.y("audioManager");
         var1 = null;
      }

      var1.removeListener(this.audioManagerListener);
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   public companion object {
      public const val NAME: String

      private fun AndroidAudioDevice.toRouteTypeString(): String {
         val var2: Int = AudioRouteEmitterModule.Companion.WhenMappings.$EnumSwitchMapping$0[var1.getSimpleDeviceType().ordinal()];
         val var4: java.lang.String;
         if (var2 != 1) {
            if (var2 != 2) {
               if (var2 != 3) {
                  if (var2 != 4) {
                     var4 = "Unknown";
                  } else {
                     var4 = "WiredHeadset";
                  }
               } else {
                  var4 = "Speaker";
               }
            } else {
               var4 = "Bluetooth";
            }
         } else {
            var4 = "Receiver";
         }

         return var4;
      }

      private fun SimpleDeviceType.toRouteTypeString(): String {
         val var2: Int = AudioRouteEmitterModule.Companion.WhenMappings.$EnumSwitchMapping$0[var1.ordinal()];
         val var3: java.lang.String;
         if (var2 != 1) {
            if (var2 != 2) {
               if (var2 != 3) {
                  if (var2 != 4) {
                     var3 = "Unknown";
                  } else {
                     var3 = "WiredHeadset";
                  }
               } else {
                  var3 = "Speaker";
               }
            } else {
               var3 = "Bluetooth";
            }
         } else {
            var3 = "Receiver";
         }

         return var3;
      }
   }
}
