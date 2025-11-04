package com.discord.audio

import android.os.Build.VERSION
import com.discord.audio.react.events.AudioManagerAudioDeviceChanged
import com.discord.audio.react.events.AudioManagerAudioDevicesUpdated
import com.discord.codegen.NativeAudioManagerModuleSpec
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableMap
import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nAudioManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioManagerModule.kt\ncom/discord/audio/AudioManagerModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1557#2:88\n1628#2,3:89\n*S KotlinDebug\n*F\n+ 1 AudioManagerModule.kt\ncom/discord/audio/AudioManagerModule\n*L\n20#1:88\n20#1:89,3\n*E\n"])
public class AudioManagerModule(reactContext: ReactApplicationContext) : NativeAudioManagerModuleSpec(var1) {
   private final lateinit var audioManager: DiscordAudioManagerInterface

   public override fun addListener(eventType: String) {
   }

   public override fun getActiveAudioDevice(promise: Promise) {
      var var2: DiscordAudioManagerInterface = this.audioManager;
      if (this.audioManager == null) {
         Intrinsics.throwUninitializedPropertyAccessException("audioManager");
         var2 = null;
      }

      var1.resolve(var2.getEffectiveAudioDevice().toNativeMap());
   }

   public override fun getAudioDevices(promise: Promise) {
      var var2: DiscordAudioManagerInterface = this.audioManager;
      if (this.audioManager == null) {
         Intrinsics.throwUninitializedPropertyAccessException("audioManager");
         var2 = null;
      }

      val var5: java.lang.Iterable = var2.getAudioDevices();
      val var4: ArrayList = new ArrayList(CollectionsKt.v(var5, 10));
      val var6: java.util.Iterator = var5.iterator();

      while (var6.hasNext()) {
         var4.add((var6.next() as AndroidAudioDevice).toNativeMap());
      }

      var1.resolve(NativeArrayExtensionsKt.toNativeArray$default(var4, null, 1, null));
   }

   public override fun removeListeners(count: Double) {
   }

   public override fun setActiveAudioDevice(deviceMap: ReadableMap) {
      val var3: AndroidAudioDevice = AndroidAudioDevice.Companion.fromReadableMap(var1);
      var var4: DiscordAudioManagerInterface = this.audioManager;
      if (this.audioManager == null) {
         Intrinsics.throwUninitializedPropertyAccessException("audioManager");
         var4 = null;
      }

      var4.setActiveAudioDevice(var3);
   }

   public override fun setCommunicationModeOn(on: Boolean) {
      var var2: DiscordAudioManagerInterface = this.audioManager;
      if (this.audioManager == null) {
         Intrinsics.throwUninitializedPropertyAccessException("audioManager");
         var2 = null;
      }

      var2.setCommunicationModeOn(var1);
   }

   public override fun setSCORetryCount(count: Double) {
      var var3: DiscordAudioManagerInterface = this.audioManager;
      if (this.audioManager == null) {
         Intrinsics.throwUninitializedPropertyAccessException("audioManager");
         var3 = null;
      }

      var3.setSCORetryCount((int)var1);
   }

   public companion object {
      private final val reactEvents: ReactEvents

      public fun create(reactContext: ReactApplicationContext): NativeModule {
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
               AudioManagerModule.access$getReactEvents$cp().emitModuleEvent(this.$reactContext, new AudioManagerAudioDeviceChanged(var1));
            }

            @Override
            public void onAudioDevicesUpdated(java.util.List<AndroidAudioDevice> var1) {
               AudioManagerModule.access$getReactEvents$cp().emitModuleEvent(this.$reactContext, new AudioManagerAudioDevicesUpdated(var1));
            }
         };
         val var2: DiscordAudioManagerInterface = AudioManagerModule.access$getAudioManager$p(var3);
         var var5: DiscordAudioManagerInterface = var2;
         if (var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audioManager");
            var5 = null;
         }

         var5.addListener(var4);
         return var3;
      }
   }
}
