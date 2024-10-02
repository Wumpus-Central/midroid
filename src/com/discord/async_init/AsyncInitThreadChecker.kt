package com.discord.async_init

import kotlin.jvm.internal.q

public class AsyncInitThreadChecker(name: String) {
   private final val name: String
   private final var thread: Thread?

   init {
      q.h(var1, "name");
      super();
      this.name = var1;
   }

   public fun checkIsOnValidThread() {
      if (this.thread == null) {
         this.thread = Thread.currentThread();
      }

      if (Thread.currentThread() != this.thread) {
         val var1: java.lang.String = this.name;
         val var3: Thread = this.thread;
         val var2: Thread = Thread.currentThread();
         val var4: StringBuilder = new StringBuilder();
         var4.append("Expected all calls to async-initialized component: ");
         var4.append(var1);
         var4.append(" to be from the same thread: ");
         var4.append(var3);
         var4.append(", called on ");
         var4.append(var2);
         throw new IllegalStateException(var4.toString().toString());
      }
   }

   public fun detachThread() {
      this.thread = null;
   }
}
