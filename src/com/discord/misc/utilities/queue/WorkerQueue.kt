package com.discord.misc.utilities.queue

import java.util.LinkedHashSet
import kotlin.jvm.internal.q

public class WorkerQueue<T>(popFromEnd: Boolean = true) {
   private final var currWorker: Any?
   private final val nextWorkers: LinkedHashSet<Any>
   private final val popFromEnd: Boolean

   fun WorkerQueue() {
      this(false, 1, null);
   }

   init {
      this.popFromEnd = var1;
      this.nextWorkers = new LinkedHashSet<>();
   }

   public fun updateWorker(worker: Any, active: Boolean, onWorkerActive: (Any) -> Unit): Boolean {
      q.h(var3, "onWorkerActive");
      if (var2) {
         if (this.currWorker != null && !q.c(this.currWorker, var1)) {
            this.nextWorkers.add((T)var1);
         } else {
            this.currWorker = (T)var1;
         }
      } else if (q.c(this.currWorker, var1)) {
         val var4: Any;
         if (this.popFromEnd) {
            var4 = i.q0(this.nextWorkers);
         } else {
            var4 = i.e0(this.nextWorkers);
         }

         this.currWorker = (T)var4;
         if (var4 != null) {
            var3.invoke(var4);
            this.nextWorkers.remove(var4);
         }
      } else {
         this.nextWorkers.remove(var1);
      }

      return q.c(this.currWorker, var1);
   }
}
