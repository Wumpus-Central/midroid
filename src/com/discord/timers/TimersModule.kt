package com.discord.timers

import com.discord.codegen.NativeTimersModuleSpec
import com.discord.reactevents.ReactEvents
import com.discord.timers.reactevents.IntervalEvent
import com.discord.timers.reactevents.TimerEvent
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q
import s9.s

public class TimersModule(reactContext: ReactApplicationContext) : NativeTimersModuleSpec {
   private final val reactEvents: ReactEvents
   private final val timersManager: TimersManager

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactEvents = new ReactEvents(s.a("timer", G.b(TimerEvent.class)), s.a("interval", G.b(IntervalEvent.class)));
      this.timersManager = new TimersManager(var1);
   }

   @JvmStatic
   fun `setInterval$lambda$1`(var0: TimersModule, var1: Double): Unit {
      val var3: ReactEvents = var0.reactEvents;
      val var4: ReactApplicationContext = var0.getReactApplicationContext();
      q.g(var4, "getReactApplicationContext(...)");
      var3.emitModuleEvent(var4, new IntervalEvent((int)var1));
      return Unit.a;
   }

   @JvmStatic
   fun `setTimeout$lambda$0`(var0: TimersModule, var1: Double): Unit {
      val var3: ReactEvents = var0.reactEvents;
      val var4: ReactApplicationContext = var0.getReactApplicationContext();
      q.g(var4, "getReactApplicationContext(...)");
      var3.emitModuleEvent(var4, new TimerEvent((int)var1));
      return Unit.a;
   }

   public override fun addListener(type: String) {
      q.h(var1, "type");
   }

   public override fun clearInterval(id: Double) {
      this.timersManager.clearInterval((int)var1);
   }

   public override fun clearTimeout(id: Double) {
      this.timersManager.clearTimeout((int)var1);
   }

   public override fun removeListeners(count: Double) {
   }

   public override fun setInterval(id: Double, timeout: Double) {
      this.timersManager.setInterval((int)var1, var3, new b(this, var1));
   }

   public override fun setTimeout(id: Double, timeout: Double) {
      this.timersManager.setTimeout((int)var1, var3, new c(this, var1));
   }
}
