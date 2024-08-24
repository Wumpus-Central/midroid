package com.discord.audio

import android.os.Build.VERSION
import com.discord.audio.react.events.AudioManagerAudioDeviceChanged
import com.discord.audio.react.events.AudioManagerAudioDevicesUpdated
import com.discord.codegen.NativeAudioManagerSpec
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableMap
import java.util.ArrayList
import kotlin.jvm.internal.r

public class AudioManagerModule(reactContext: ReactApplicationContext) : NativeAudioManagerSpec {
   private final lateinit var audioManager: DiscordAudioManagerInterface
   private final val reactContext: ReactApplicationContext

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   public open fun addListener(eventType: String) {
      r.h(var1, "eventType");
   }

   public open fun getActiveAudioDevice(promise: Promise) {
      r.h(var1, "promise");
      var var2: DiscordAudioManagerInterface = this.audioManager;
      if (this.audioManager == null) {
         r.y("audioManager");
         var2 = null;
      }

      var1.resolve(var2.getEffectiveAudioDevice().toNativeMap());
   }

   public open fun getAudioDevices(promise: Promise) {
      r.h(var1, "promise");
      var var2: DiscordAudioManagerInterface = this.audioManager;
      if (this.audioManager == null) {
         r.y("audioManager");
         var2 = null;
      }

      val var5: java.util.Set = var2.getAudioDevices();
      val var4: ArrayList = new ArrayList(h.t(var5, 10));
      val var6: java.util.Iterator = var5.iterator();

      while (var6.hasNext()) {
         var4.add((var6.next() as AndroidAudioDevice).toNativeMap());
      }

      var1.resolve(NativeArrayExtensionsKt.toNativeArray(var4));
   }

   public open fun removeListeners(count: Double) {
   }

   public open fun setActiveAudioDevice(deviceMap: ReadableMap) {
      r.h(var1, "deviceMap");
      val var3: AndroidAudioDevice = AndroidAudioDevice.Companion.fromReadableMap(var1);
      var var4: DiscordAudioManagerInterface = this.audioManager;
      if (this.audioManager == null) {
         r.y("audioManager");
         var4 = null;
      }

      var4.setActiveAudioDevice(var3);
   }

   public open fun setCommunicationModeOn(on: Boolean) {
      var var2: DiscordAudioManagerInterface = this.audioManager;
      if (this.audioManager == null) {
         r.y("audioManager");
         var2 = null;
      }

      var2.setCommunicationModeOn(var1);
   }

   public open fun setSCORetryCount(count: Double) {
      var var3: DiscordAudioManagerInterface = this.audioManager;
      if (this.audioManager == null) {
         r.y("audioManager");
         var3 = null;
      }

      var3.setSCORetryCount((int)var1);
   }

   public companion object {
      public const val NAME: String
      private final val reactEvents: ReactEvents

      public fun create(reactContext: ReactApplicationContext): NativeModule {
         r.h(var1, "reactContext");
         val var3: AudioManagerModule = new AudioManagerModule(var1);
         if (VERSION.SDK_INT >= 33) {
            AudioManagerModule.access$setAudioManager$p(var3, DiscordAudioManager2.Companion.getInstance(var1));
         } else {
            AudioManagerModule.access$setAudioManager$p(var3, DiscordAudioManager.Companion.getInstance(var1));
         }

         val var4: DiscordAudioManagerListener = new DiscordAudioManagerListener(var1) {
            final ReactApplicationContext $reactContext;

            {
               this.$reactContext = var1;
            }

            @Override
            public void onActiveAudioDeviceChanged(AndroidAudioDevice var1) {
               r.h(var1, "activeAudioDevice");
               AudioManagerModule.access$getReactEvents$cp().emitModuleEvent(this.$reactContext, new AudioManagerAudioDeviceChanged(var1));
            }

            @Override
            public void onAudioDevicesUpdated(java.util.List<AndroidAudioDevice> var1) {
               r.h(var1, "audioDevices");
               AudioManagerModule.access$getReactEvents$cp().emitModuleEvent(this.$reactContext, new AudioManagerAudioDevicesUpdated(var1));
            }
         };
         val var2: DiscordAudioManagerInterface = AudioManagerModule.access$getAudioManager$p(var3);
         var var5: DiscordAudioManagerInterface = var2;
         if (var2 == null) {
            r.y("audioManager");
            var5 = null;
         }

         var5.addListener(var4);
         return var3;
      }
   }
}
