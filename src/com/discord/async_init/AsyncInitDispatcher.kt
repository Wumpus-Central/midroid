package com.discord.async_init

import com.discord.logging.Log
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nAsyncInitDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncInitDispatcher.kt\ncom/discord/async_init/AsyncInitDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1863#2,2:101\n*S KotlinDebug\n*F\n+ 1 AsyncInitDispatcher.kt\ncom/discord/async_init/AsyncInitDispatcher\n*L\n28#1:101,2\n*E\n"])
public class AsyncInitDispatcher(name: String, longDispatchThresholdMs: Long = 1000L) {
   private final val name: String
   private final val longDispatchThresholdMs: Long

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


   public final val delayedTasks: MutableList<() -> Unit>
   private final val threadChecker: AsyncInitThreadChecker
   private final var initStartMs: Long

   init {
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
         val var1: Long = System.currentTimeMillis() - this.initStartMs;
         val var3: Long = this.longDispatchThresholdMs;
         if (var1 < this.longDispatchThresholdMs) {
            val var5: Log = Log.INSTANCE;
            val var7: java.lang.String = this.name;
            val var6: StringBuilder = new StringBuilder();
            var6.append(var7);
            var6.append(": queued tasks  took ");
            var6.append(var1);
            var6.append(" ms");
            Log.i$default(var5, var7, var6.toString(), null, 4, null);
         } else {
            val var10: Log = Log.INSTANCE;
            val var8: java.lang.String = this.name;
            val var9: StringBuilder = new StringBuilder();
            var9.append(var8);
            var9.append(": running queued tasks on init took ");
            var9.append(var1);
            var9.append(" ms which exceeds threshold=");
            var9.append(var3);
            var9.append(" ms");
            Log.w$default(var10, var8, var9.toString(), null, 4, null);
         }
      }
   }

   public inline fun post(validate: Boolean = true, crossinline task: () -> Unit) {
      if (var1) {
         this.validateState();
      }

      if (this.getInitialized()) {
         var2.invoke();
      } else {
         this.getDelayedTasks().add(new Function0<Unit>(var2) {
            final Function0<Unit> $task;

            {
               this.$task = var1;
            }

            public final void invoke() {
               this.$task.invoke();
            }
         });
      }
   }

   public inline fun postOrElse(task: () -> Unit, fallback: () -> Unit) {
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
