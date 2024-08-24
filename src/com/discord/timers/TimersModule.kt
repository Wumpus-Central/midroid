package com.discord.timers

import com.discord.codegen.NativeTimersSpec
import com.discord.reactevents.ReactEvents
import com.discord.timers.reactevents.IntervalEvent
import com.discord.timers.reactevents.TimerEvent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import eh.w
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r

public class TimersModule(reactContext: ReactApplicationContext) : NativeTimersSpec {
   private final val reactEvents: ReactEvents
   private final val timersManager: TimersManager

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactEvents = new ReactEvents(new Pair[]{w.a("timer", h0.b(TimerEvent.class)), w.a("interval", h0.b(IntervalEvent.class))});
      this.timersManager = new TimersManager(var1);
   }

   @ReactMethod
   public open fun addListener(type: String) {
      r.h(var1, "type");
   }

   public open fun clearInterval(id: Double) {
      this.timersManager.clearInterval((int)var1);
   }

   public open fun clearTimeout(id: Double) {
      this.timersManager.clearTimeout((int)var1);
   }

   public open fun getName(): String {
      return "TimersModule";
   }

   public open fun onCatalystInstanceDestroy() {
      this.timersManager.clean();
   }

   @ReactMethod
   public open fun removeListeners(count: Double) {
   }

   public open fun setInterval(id: Double, timeout: Double) {
      this.timersManager.setInterval((int)var1, var3, new Function0<Unit>(this, var1) {
         final double $id;
         final TimersModule this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$id = var2;
         }

         public final void invoke() {
            val var2: ReactEvents = TimersModule.access$getReactEvents$p(this.this$0);
            val var1: ReactApplicationContext = TimersModule.access$getReactApplicationContext(this.this$0);
            r.g(var1, "reactApplicationContext");
            var2.emitModuleEvent(var1, new IntervalEvent((int)this.$id));
         }
      });
   }

   public open fun setTimeout(id: Double, timeout: Double) {
      this.timersManager.setTimeout((int)var1, var3, new Function0<Unit>(this, var1) {
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
            r.g(var2, "reactApplicationContext");
            var1.emitModuleEvent(var2, new TimerEvent((int)this.$id));
         }
      });
   }

   public companion object {
      public const val NAME: String
   }
}
