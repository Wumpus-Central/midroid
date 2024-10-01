package com.discord.logging

import java.util.NoSuchElementException
import kotlin.jvm.internal.q
import timber.log.a
import timber.log.a.b
import timber.log.a.c

internal class LoggingLineNumberTree : c {
   private final val ignoreClasses: List<String> =
      i.n(
         new java.lang.String[]{
            a.class.getName(), b.class.getName(), c.class.getName(), timber.log.a.a.class.getName(), LoggingLineNumberTree.class.getName(), Log.class.getName()
         }
      )

   private fun getCalleStackTraceElement(): StackTraceElement {
      val var3: Array<StackTraceElement> = new java.lang.Throwable().getStackTrace();
      q.g(var3, "getStackTrace(...)");
      val var2: Int = var3.length;

      for (int var1 = 0; var1 < var2; var1++) {
         val var4: StackTraceElement = var3[var1];
         if (this.ignoreClasses.contains(var3[var1].getClassName()) xor true) {
            q.g(var4, "first(...)");
            return var4;
         }
      }

      throw new NoSuchElementException("Array contains no element matching the predicate.");
   }

   protected open fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
      q.h(var3, "message");
      val var6: StackTraceElement = this.getCalleStackTraceElement();
      val var7: java.lang.String = var6.getFileName();
      val var5: Int = var6.getLineNumber();
      val var8: StringBuilder = new StringBuilder();
      var8.append(var2);
      var8.append("/(");
      var8.append(var7);
      var8.append(":");
      var8.append(var5);
      var8.append(")");
      android.util.Log.println(var1, var8.toString(), var3);
   }
}
