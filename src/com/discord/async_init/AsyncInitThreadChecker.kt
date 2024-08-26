package com.discord.async_init

import kotlin.jvm.internal.r

public class AsyncInitThreadChecker(name: String) {
   private final val name: String
   private final var thread: Thread?

   init {
      r.h(var1, "name");
      super();
      this.name = var1;
   }

   public fun checkIsOnValidThread() {
      if (this.thread == null) {
         this.thread = Thread.currentThread();
      }

      if (Thread.currentThread() != this.thread) {
         val var1: java.lang.String = this.name;
         val var4: Thread = this.thread;
         val var3: Thread = Thread.currentThread();
         val var2: StringBuilder = new StringBuilder();
         var2.append("Expected all calls to async-initialized component: ");
         var2.append(var1);
         var2.append(" to be from the same thread: ");
         var2.append(var4);
         var2.append(", called on ");
         var2.append(var3);
         throw new IllegalStateException(var2.toString().toString());
      }
   }

   public fun detachThread() {
      this.thread = null;
   }
}
