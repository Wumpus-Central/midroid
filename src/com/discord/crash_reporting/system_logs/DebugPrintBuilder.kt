package com.discord.crash_reporting.system_logs

import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nDebugPrintable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugPrintable.kt\ncom/discord/crash_reporting/system_logs/DebugPrintBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"])
private class DebugPrintBuilder(sb: StringBuilder) {
   public final val sb: StringBuilder
   private final var indentation: Int

   init {
      this.sb = var1;
   }

   public fun appendKeyValue(key: String, value: Any?) {
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
   }

   public fun appendLine(s: String? = null) {
      val var2: StringBuilder = this.sb;
      this.sb.append(var1);
      var2.append('\n');
   }
}
