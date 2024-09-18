package com.discord.async_init

import com.discord.logging.Log
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

public class AsyncInitDispatcher(name: String, longDispatchThresholdMs: Long = 1000L) {
   public final val delayedTasks: MutableList<() -> Unit>
   private final var initStartMs: Long

   public final var initialized: Boolean
      internal final set(value) {
         this.validateState();
         if (this.initialized != var1) {
            if (var1) {
               this.onInit(this.delayedTasks.size());
               val var2: java.util.Iterator = this.delayedTasks.iterator();

               while (var2.hasNext()) {
                  (var2.next() as Function0).invoke();
               }

               this.delayedTasks.clear();
               this.onInitFinish();
            }

            this.initialized = var1;
         }
      }


   private final val longDispatchThresholdMs: Long
   private final val name: String
   private final val threadChecker: AsyncInitThreadChecker

   init {
      q.h(var1, "name");
      super();
      this.name = var1;
      this.longDispatchThresholdMs = var2;
      this.delayedTasks = new ArrayList<>();
      this.threadChecker = new AsyncInitThreadChecker(var1);
   }

   private fun onInit(numTasks: Int) {
      if (var1 > 0) {
         this.initStartMs = System.currentTimeMillis();
      }

      val var2: Log = Log.INSTANCE;
      val var4: java.lang.String = this.name;
      val var3: StringBuilder = new StringBuilder();
      var3.append("Initializing async dispatcher for ");
      var3.append(var4);
      var3.append(", ");
      var3.append(var1);
      var3.append(" queued tasks");
      Log.i$default(var2, var4, var3.toString(), null, 4, null);
   }

   private fun onInitFinish() {
      if (this.initStartMs != 0L) {
         val var3: Long = System.currentTimeMillis() - this.initStartMs;
         val var1: Long = this.longDispatchThresholdMs;
         if (var3 < this.longDispatchThresholdMs) {
            val var6: Log = Log.INSTANCE;
            val var7: java.lang.String = this.name;
            val var5: StringBuilder = new StringBuilder();
            var5.append(var7);
            var5.append(": queued tasks  took ");
            var5.append(var3);
            var5.append(" ms");
            Log.i$default(var6, var7, var5.toString(), null, 4, null);
         } else {
            val var9: Log = Log.INSTANCE;
            val var8: java.lang.String = this.name;
            val var10: StringBuilder = new StringBuilder();
            var10.append(var8);
            var10.append(": running queued tasks on init took ");
            var10.append(var3);
            var10.append(" ms which exceeds threshold=");
            var10.append(var1);
            var10.append(" ms");
            Log.w$default(var9, var8, var10.toString(), null, 4, null);
         }
      }
   }

   public inline fun post(validate: Boolean = true, crossinline task: () -> Unit) {
      q.h(var2, "task");
      if (var1) {
         this.validateState();
      }

      if (this.getInitialized()) {
         var2.invoke();
      } else {
         this.getDelayedTasks().add(new Function0(var2) {
            final Function0 $task;

            {
               super(0);
               this.$task = var1;
            }

            public final void invoke() {
               this.$task.invoke();
            }
         });
      }
   }

   public inline fun postOrElse(task: () -> Unit, fallback: () -> Unit) {
      q.h(var1, "task");
      q.h(var2, "fallback");
      this.validateState();
      if (this.getInitialized()) {
         var1.invoke();
      } else {
         var2.invoke();
      }
   }

   public fun reset() {
      this.threadChecker.detachThread();
      this.setInitialized(false);
      this.delayedTasks.clear();
      this.initStartMs = 0L;
   }

   public fun validateState() {
      this.threadChecker.checkIsOnValidThread();
   }
}
