package com.discord.device

import Ca.v
import android.os.PowerManager
import android.os.Build.VERSION
import com.discord.codegen.NativeDeviceThermalStateModuleSpec
import com.discord.device.react_events.DeviceThermalStateChangedEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nDeviceThermalStateModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceThermalStateModule.kt\ncom/discord/device/DeviceThermalStateModule\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,50:1\n31#2:51\n31#2:52\n*S KotlinDebug\n*F\n+ 1 DeviceThermalStateModule.kt\ncom/discord/device/DeviceThermalStateModule\n*L\n23#1:51\n43#1:52\n*E\n"])
internal class DeviceThermalStateModule(reactContext: ReactApplicationContext) : NativeDeviceThermalStateModuleSpec(var1) {
   private final val reactEvents: ReactEvents = new ReactEvents(new Pair[]{v.a("DeviceThermalStateDidChange", DeviceThermalStateChangedEvent::class)})

   @JvmStatic
   fun `initialize$lambda$0`(var0: DeviceThermalStateModule, var1: Int) {
      val var2: ReactEvents = var0.reactEvents;
      val var3: ReactApplicationContext = var0.getReactApplicationContext();
      var2.emitModuleEvent(var3, new DeviceThermalStateChangedEvent(var1));
   }

   public override fun addListener(type: String) {
   }

   public override fun getThermalState(): Double? {
      var var2: java.lang.Double = null;
      if (VERSION.SDK_INT >= 29) {
         val var5: ReactApplicationContext = this.getReactApplicationContext();
         val var4: PowerManager = androidx.core.content.b.i(var5, PowerManager.class) as PowerManager;
         var2 = null;
         if (var4 != null) {
            var2 = (double)e.a(var4);
         }
      }

      return var2;
   }

   public open fun initialize() {
      super.initialize();
      if (VERSION.SDK_INT >= 29) {
         val var1: ReactApplicationContext = this.getReactApplicationContext();
         val var2: PowerManager = androidx.core.content.b.i(var1, PowerManager.class) as PowerManager;
         if (var2 != null) {
            d.a(var2, new f(this));
         }
      }
   }

   public override fun removeListeners(count: Double) {
   }
}
