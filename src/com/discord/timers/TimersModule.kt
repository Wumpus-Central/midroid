package com.discord.timers

import Da.v
import com.discord.codegen.NativeTimersModuleSpec
import com.discord.reactevents.ReactEvents
import com.discord.timers.reactevents.IntervalEvent
import com.discord.timers.reactevents.TimerEvent
import com.facebook.react.bridge.ReactApplicationContext

public class TimersModule(reactContext: ReactApplicationContext) : NativeTimersModuleSpec(var1) {
   private final val reactEvents: ReactEvents = new ReactEvents(v.a("timer", TimerEvent::class), v.a("interval", IntervalEvent::class))
   private final val timersManager: TimersManager

   init {
      this.timersManager = new TimersManager(var1);
   }

   @JvmStatic
   fun `setInterval$lambda$1`(var0: TimersModule, var1: Double): Unit {
      val var3: ReactEvents = var0.reactEvents;
      val var4: ReactApplicationContext = var0.getReactApplicationContext();
      var3.emitModuleEvent(var4, new IntervalEvent((int)var1));
      return Unit.a;
   }

   @JvmStatic
   fun `setTimeout$lambda$0`(var0: TimersModule, var1: Double): Unit {
      val var3: ReactEvents = var0.reactEvents;
      val var4: ReactApplicationContext = var0.getReactApplicationContext();
      var3.emitModuleEvent(var4, new TimerEvent((int)var1));
      return Unit.a;
   }

   public open fun addListener(type: String) {
   }

   public open fun clearInterval(id: Double) {
      this.timersManager.clearInterval((int)var1);
   }

   public open fun clearTimeout(id: Double) {
      this.timersManager.clearTimeout((int)var1);
   }

   public open fun removeListeners(count: Double) {
   }

   public open fun setInterval(id: Double, timeout: Double) {
      this.timersManager.setInterval((int)var1, var3, new b(this, var1));
   }

   public open fun setTimeout(id: Double, timeout: Double) {
      this.timersManager.setTimeout((int)var1, var3, new c(this, var1));
   }
}
