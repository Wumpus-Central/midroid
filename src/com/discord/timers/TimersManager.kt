package com.discord.timers

import android.content.Context
import android.os.Handler
import java.util.concurrent.ConcurrentHashMap
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nTimersManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimersManager.kt\ncom/discord/timers/TimersManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"])
internal class TimersManager(context: Context) {
   private final val timeoutHandler: Handler
   private final val timeouts: ConcurrentHashMap<Int, Runnable>
   private final val intervals: ConcurrentHashMap<Int, Runnable>

   init {
      this.timeoutHandler = new Handler(var1.getMainLooper());
      this.timeouts = new ConcurrentHashMap<>();
      this.intervals = new ConcurrentHashMap<>();
   }

   @JvmStatic
   fun `setTimeout$lambda$0`(var0: TimersManager, var1: Int, var2: Function0) {
      var0.timeouts.remove(var1);
      var2.invoke();
   }

   public fun clean() {
      this.timeoutHandler.removeCallbacksAndMessages(null);
      this.timeouts.clear();
      this.intervals.clear();
   }

   public fun clearInterval(id: Int) {
      val var2: Runnable = this.intervals.remove(var1);
      if (var2 != null) {
         this.timeoutHandler.removeCallbacks(var2);
      }
   }

   public fun clearTimeout(id: Int) {
      val var2: Runnable = this.timeouts.remove(var1);
      if (var2 != null) {
         this.timeoutHandler.removeCallbacks(var2);
      }
   }

   public fun setInterval(id: Int, timeout: Double, onInterval: () -> Unit) {
      val var5: Long = (long)var2;
      val var7: Runnable = new Runnable(var4, this, (long)var2) {
         final Function0<Unit> $onInterval;
         final long $timeoutLong;
         final TimersManager this$0;

         {
            this.$onInterval = var1;
            this.this$0 = var2;
            this.$timeoutLong = var3;
         }

         @Override
         public void run() {
            this.$onInterval.invoke();
            TimersManager.access$getTimeoutHandler$p(this.this$0).postDelayed(this, this.$timeoutLong);
         }
      };
      this.intervals.put(var1, var7);
      this.timeoutHandler.postDelayed(var7, var5);
   }

   public fun setTimeout(id: Int, timeout: Double, onTimeout: () -> Unit) {
      val var5: Long = (long)var2;
      val var7: a = new a(this, var1, var4);
      this.timeouts.put(var1, var7);
      this.timeoutHandler.postDelayed(var7, var5);
   }
}
