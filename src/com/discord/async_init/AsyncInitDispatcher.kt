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

      val var4: Log = Log.INSTANCE;
      val var3: java.lang.String = this.name;
      val var2: StringBuilder = new StringBuilder();
      var2.append("Initializing async dispatcher for ");
      var2.append(var3);
      var2.append(", ");
      var2.append(var1);
      var2.append(" queued tasks");
      Log.i$default(var4, var3, var2.toString(), null, 4, null);
   }

   private fun onInitFinish() {
      if (this.initStartMs != 0L) {
         val var3: Long = System.currentTimeMillis() - this.initStartMs;
         val var1: Long = this.longDispatchThresholdMs;
         if (var3 < this.longDispatchThresholdMs) {
            val var5: Log = Log.INSTANCE;
            val var7: java.lang.String = this.name;
            val var6: StringBuilder = new StringBuilder();
            var6.append(var7);
            var6.append(": queued tasks  took ");
            var6.append(var3);
            var6.append(" ms");
            Log.i$default(var5, var7, var6.toString(), null, 4, null);
         } else {
            val var9: Log = Log.INSTANCE;
            val var10: java.lang.String = this.name;
            val var8: StringBuilder = new StringBuilder();
            var8.append(var10);
            var8.append(": running queued tasks on init took ");
            var8.append(var3);
            var8.append(" ms which exceeds threshold=");
            var8.append(var1);
            var8.append(" ms");
            Log.w$default(var9, var10, var8.toString(), null, 4, null);
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
