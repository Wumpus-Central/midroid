package com.discord.async_init

public class AsyncInitThreadChecker(name: String) {
   private final val name: String
   private final var thread: Thread?

   init {
      this.name = var1;
   }

   public fun checkIsOnValidThread() {
      if (this.thread == null) {
         this.thread = Thread.currentThread();
      }

      if (Thread.currentThread() != this.thread) {
         val var2: java.lang.String = this.name;
         val var1: Thread = this.thread;
         val var4: Thread = Thread.currentThread();
         val var3: StringBuilder = new StringBuilder();
         var3.append("Expected all calls to async-initialized component: ");
         var3.append(var2);
         var3.append(" to be from the same thread: ");
         var3.append(var1);
         var3.append(", called on ");
         var3.append(var4);
         throw new IllegalStateException(var3.toString().toString());
      }
   }

   public fun detachThread() {
      this.thread = null;
   }
}
