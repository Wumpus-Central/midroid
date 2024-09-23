package com.discord.device

import android.os.PowerManager
import android.os.Build.VERSION
import com.discord.device.events.DeviceThermalStateChangedEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import fh.w
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

public class DeviceThermalStateManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactEvents: ReactEvents

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactEvents = new ReactEvents(w.a("DeviceThermalStateDidChange", g0.b(DeviceThermalStateChangedEvent.class)));
   }

   @JvmStatic
   fun `initialize$lambda$0`(var0: DeviceThermalStateManagerModule, var1: Int) {
      q.h(var0, "this$0");
      val var2: ReactEvents = var0.reactEvents;
      val var3: ReactApplicationContext = var0.getReactApplicationContext();
      q.g(var3, "getReactApplicationContext(...)");
      var2.emitModuleEvent(var3, new DeviceThermalStateChangedEvent(var1));
   }

   @ReactMethod
   public fun addListener(type: String) {
      q.h(var1, "type");
   }

   public open fun getName(): String {
      return "DCDDeviceThermalStateManager";
   }

   @ReactMethod
   public fun getThermalState(promise: Promise) {
      q.h(var1, "promise");
      var var2: Any = this.getReactApplicationContext().getSystemService("power");
      q.f(var2, "null cannot be cast to non-null type android.os.PowerManager");
      var2 = var2 as PowerManager;
      if (VERSION.SDK_INT >= 29) {
         var1.resolve(e.a((PowerManager)var2));
      } else {
         var1.reject(new Exception("getThermalState() requires OS Android 10 or up."));
      }
   }

   public open fun initialize() {
      super.initialize();
      var var1: Any = this.getReactApplicationContext().getSystemService("power");
      q.f(var1, "null cannot be cast to non-null type android.os.PowerManager");
      var1 = var1 as PowerManager;
      if (VERSION.SDK_INT >= 29) {
         f.a((PowerManager)var1, new g(this));
      }
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }
}
