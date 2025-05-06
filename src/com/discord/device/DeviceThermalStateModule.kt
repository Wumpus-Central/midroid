package com.discord.device

import android.os.PowerManager
import android.os.Build.VERSION
import com.discord.codegen.NativeDeviceThermalStateModuleSpec
import com.discord.device.react_events.DeviceThermalStateChangedEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q
import l8.w

internal class DeviceThermalStateModule(reactContext: ReactApplicationContext) : NativeDeviceThermalStateModuleSpec {
   private final val reactEvents: ReactEvents

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactEvents = new ReactEvents(w.a("DeviceThermalStateDidChange", G.b(DeviceThermalStateChangedEvent.class)));
   }

   @JvmStatic
   fun `initialize$lambda$0`(var0: DeviceThermalStateModule, var1: Int) {
      q.h(var0, "this$0");
      val var2: ReactEvents = var0.reactEvents;
      val var3: ReactApplicationContext = var0.getReactApplicationContext();
      q.g(var3, "getReactApplicationContext(...)");
      var2.emitModuleEvent(var3, new DeviceThermalStateChangedEvent(var1));
   }

   public override fun addListener(type: String) {
      q.h(var1, "type");
   }

   public override fun getThermalState(): Double? {
      var var2: java.lang.Double = null;
      if (VERSION.SDK_INT >= 29) {
         val var5: ReactApplicationContext = this.getReactApplicationContext();
         q.g(var5, "getReactApplicationContext(...)");
         val var4: PowerManager = androidx.core.content.a.i(var5, PowerManager.class) as PowerManager;
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
         q.g(var1, "getReactApplicationContext(...)");
         val var2: PowerManager = androidx.core.content.a.i(var1, PowerManager.class) as PowerManager;
         if (var2 != null) {
            d.a(var2, new f(this));
         }
      }
   }

   public override fun removeListeners(count: Double) {
   }
}
