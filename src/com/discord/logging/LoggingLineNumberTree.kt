package com.discord.logging

import java.util.NoSuchElementException
import kotlin.jvm.internal.r
import timber.log.a

internal class LoggingLineNumberTree : a.c {
   private final val ignoreClasses: List<String> =
      h.l(
         new java.lang.String[]{
            a.class.getName(), a.b.class.getName(), a.c.class.getName(), a.a.class.getName(), LoggingLineNumberTree.class.getName(), Log.class.getName()
         }
      )

   private fun getCalleStackTraceElement(): StackTraceElement {
      val var4: Array<StackTraceElement> = new java.lang.Throwable().getStackTrace();
      r.g(var4, "Throwable().stackTrace");
      val var2: Int = var4.length;

      for (int var1 = 0; var1 < var2; var1++) {
         val var3: StackTraceElement = var4[var1];
         if (this.ignoreClasses.contains(var4[var1].getClassName()) xor true) {
            r.g(var3, "Throwable().stackTrace\n …sName !in ignoreClasses }");
            return var3;
         }
      }

      throw new NoSuchElementException("Array contains no element matching the predicate.");
   }

   protected override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
      r.h(var3, "message");
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
