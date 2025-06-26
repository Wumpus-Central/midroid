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
         val var2: java.lang.String = this.name;
         val var3: Thread = this.thread;
         val var4: Thread = Thread.currentThread();
         val var1: StringBuilder = new StringBuilder();
         var1.append("Expected all calls to async-initialized component: ");
         var1.append(var2);
         var1.append(" to be from the same thread: ");
         var1.append(var3);
         var1.append(", called on ");
         var1.append(var4);
         throw new IllegalStateException(var1.toString().toString());
      }
   }

   public fun detachThread() {
      this.thread = null;
   }
}
