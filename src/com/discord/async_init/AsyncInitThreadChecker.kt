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
         val var3: java.lang.String = this.name;
         val var1: Thread = this.thread;
         val var4: Thread = Thread.currentThread();
         val var2: StringBuilder = new StringBuilder();
         var2.append("Expected all calls to async-initialized component: ");
         var2.append(var3);
         var2.append(" to be from the same thread: ");
         var2.append(var1);
         var2.append(", called on ");
         var2.append(var4);
         throw new IllegalStateException(var2.toString().toString());
      }
   }

   public fun detachThread() {
      this.thread = null;
   }
}
