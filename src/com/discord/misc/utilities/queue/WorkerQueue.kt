package com.discord.misc.utilities.queue

import java.util.LinkedHashSet
import kotlin.jvm.internal.r

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
      r.h(var3, "onWorkerActive");
      if (var2) {
         if (this.currWorker != null && !r.c(this.currWorker, var1)) {
            this.nextWorkers.add((T)var1);
         } else {
            this.currWorker = (T)var1;
         }
      } else if (r.c(this.currWorker, var1)) {
         val var4: Any;
         if (this.popFromEnd) {
            var4 = h.n0(this.nextWorkers);
         } else {
            var4 = h.b0(this.nextWorkers);
         }

         this.currWorker = (T)var4;
         if (var4 != null) {
            var3.invoke(var4);
            this.nextWorkers.remove(var4);
         }
      } else {
         this.nextWorkers.remove(var1);
      }

      return r.c(this.currWorker, var1);
   }
}
