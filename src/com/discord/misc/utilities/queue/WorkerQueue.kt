package com.discord.misc.utilities.queue

import java.util.LinkedHashSet

public class WorkerQueue<T>(popFromEnd: Boolean = true) {
   private final val popFromEnd: Boolean
   private final val nextWorkers: LinkedHashSet<Any>
   private final var currWorker: Any?

   fun WorkerQueue() {
      this(false, 1, null);
   }

   init {
      this.popFromEnd = var1;
      this.nextWorkers = new LinkedHashSet<>();
   }

   public fun updateWorker(worker: Any, active: Boolean, onWorkerActive: (Any) -> Unit): Boolean {
      if (var2) {
         if (this.currWorker != null && !(this.currWorker == var1)) {
            this.nextWorkers.add((T)var1);
         } else {
            this.currWorker = (T)var1;
         }
      } else if (this.currWorker == var1) {
         val var4: Any;
         if (this.popFromEnd) {
            var4 = CollectionsKt.u0(this.nextWorkers);
         } else {
            var4 = CollectionsKt.k0(this.nextWorkers);
         }

         this.currWorker = (T)var4;
         if (var4 != null) {
            var3.invoke(var4);
            this.nextWorkers.remove(var4);
         }
      } else {
         this.nextWorkers.remove(var1);
      }

      return this.currWorker == var1;
   }
}
