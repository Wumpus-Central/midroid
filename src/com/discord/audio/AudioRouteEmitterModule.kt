package com.discord.audio

import A9.s
import android.content.Context
import android.os.Build.VERSION
import com.discord.audio.react.events.AudioRouteEmitterAudioRouteChanged
import com.discord.codegen.NativeAudioRouteEmitterModuleSpec
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q

public class AudioRouteEmitterModule(reactContext: ReactApplicationContext) : NativeAudioRouteEmitterModuleSpec {
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
      this.reactEvents = new ReactEvents(s.a("audio-route-changed", G.b(AudioRouteEmitterAudioRouteChanged.class)));
   }

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
               s.a("routeType", AudioRouteEmitterModule.Companion.access$toRouteTypeString(Companion, var2.getEffectiveAudioDevice())),
               s.a("multipleRoutesAvailable", java.lang.Boolean.FALSE)
            )
         );
      }
   }

   public open fun initialize() {
      super.initialize();
      var var3: Any;
      if (VERSION.SDK_INT >= 33) {
         val var2: DiscordAudioManager2.Companion = DiscordAudioManager2.Companion;
         var3 = this.getReactApplicationContext();
         q.g(var3, "getReactApplicationContext(...)");
         var3 = var2.getInstance((Context)var3);
      } else {
         val var5: DiscordAudioManager.Companion = DiscordAudioManager.Companion;
         var3 = this.getReactApplicationContext();
         q.g(var3, "getReactApplicationContext(...)");
         var3 = var5.getInstance((Context)var3);
      }

      this.audioManager = (DiscordAudioManagerInterface)var3;
      var var6: Any = var3;
      if (var3 == null) {
         q.y("audioManager");
         var6 = null;
      }

      ((DiscordAudioManagerInterface)var6).addListener(this.audioManagerListener);
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

   public fun removeListeners(count: Int) {
   }

   public companion object {
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
