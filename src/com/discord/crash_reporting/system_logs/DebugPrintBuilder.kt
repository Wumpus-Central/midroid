package com.discord.crash_reporting.system_logs

import kotlin.jvm.internal.r

private class DebugPrintBuilder(sb: StringBuilder) {
   private final var indentation: Int
   public final val sb: StringBuilder

   init {
      r.h(var1, "sb");
      super();
      this.sb = var1;
   }

   public fun appendKeyValue(key: String, value: Any?) {
      r.h(var1, "key");
      val var4: Int = this.indentation;

      for (int var3 = 0; var3 < var4; var3++) {
         this.sb.append("  ");
      }

      label14: {
         this.sb.append(" - ");
         this.sb.append(var1);
         this.sb.append(": ");
         if (var2 != null) {
            var2 = var2.toString();
            var1 = var2;
            if (var2 != null) {
               break label14;
            }
         }

         var1 = "{null}";
      }

      this.sb.append(var1);
      val var7: StringBuilder = this.sb;
      this.sb.append('\n');
      r.g(var7, "append('\\n')");
   }

   public fun appendLine(s: String? = null) {
      val var2: StringBuilder = this.sb;
      this.sb.append(var1);
      r.g(var2, "append(value)");
      var2.append('\n');
      r.g(var2, "append('\\n')");
   }
}
