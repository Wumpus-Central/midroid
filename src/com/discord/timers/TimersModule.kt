package com.discord.timers

import com.discord.codegen.NativeTimersModuleSpec
import com.discord.reactevents.ReactEvents
import com.discord.timers.reactevents.IntervalEvent
import com.discord.timers.reactevents.TimerEvent
import com.facebook.react.bridge.ReactApplicationContext
import h8.w
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.E
import kotlin.jvm.internal.q

public class TimersModule(reactContext: ReactApplicationContext) : NativeTimersModuleSpec {
   private final val reactEvents: ReactEvents
   private final val timersManager: TimersManager

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactEvents = new ReactEvents(w.a("timer", E.b(TimerEvent.class)), w.a("interval", E.b(IntervalEvent.class)));
      this.timersManager = new TimersManager(var1);
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
      this.timersManager.setInterval((int)var1, var3, new Function0(this, var1) {
         final double $id;
         final TimersModule this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$id = var2;
         }

         public final void invoke() {
            val var1: ReactEvents = TimersModule.access$getReactEvents$p(this.this$0);
            val var2: ReactApplicationContext = TimersModule.access$getReactApplicationContext(this.this$0);
            q.g(var2, "access$getReactApplicationContext(...)");
            var1.emitModuleEvent(var2, new IntervalEvent((int)this.$id));
         }
      });
   }

   public override fun setTimeout(id: Double, timeout: Double) {
      this.timersManager.setTimeout((int)var1, var3, new Function0(this, var1) {
         final double $id;
         final TimersModule this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$id = var2;
         }

         public final void invoke() {
            val var1: ReactEvents = TimersModule.access$getReactEvents$p(this.this$0);
            val var2: ReactApplicationContext = TimersModule.access$getReactApplicationContext(this.this$0);
            q.g(var2, "access$getReactApplicationContext(...)");
            var1.emitModuleEvent(var2, new TimerEvent((int)this.$id));
         }
      });
   }
}
