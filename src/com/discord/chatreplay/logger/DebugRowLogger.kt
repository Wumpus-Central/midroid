package com.discord.chatreplay.logger

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.nio.charset.Charset
import java.nio.file.Path
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import kotlin.jvm.internal.Ref.BooleanRef
import qk.a
import vh.c

public class DebugRowLogger(logsFolderPath: Path, tag: Int) : RowLogger {
   private final val jsonFile: File
   private final var lastUpdateTimestamp: Long?
   private final val replayFile: File

   init {
      q.h(var1, "logsFolderPath");
      super();
      val var4: java.lang.String = var1.toString();
      var var3: StringBuilder = new StringBuilder();
      var3.append(var2);
      var3.append(".replay");
      new File(var4, var3.toString()).delete();
      val var6: java.lang.String = var1.toString();
      val var9: StringBuilder = new StringBuilder();
      var9.append(var2);
      var9.append(".json");
      new File(var6, var9.toString()).delete();
      val var7: java.lang.String = var1.toString();
      val var10: StringBuilder = new StringBuilder();
      var10.append(var2);
      var10.append(".replay");
      this.replayFile = new File(var7, var10.toString());
      val var5: java.lang.String = var1.toString();
      var3 = new StringBuilder();
      var3.append(var2);
      var3.append(".json");
      this.jsonFile = new File(var5, var3.toString());
   }

   private fun appendLine(line: String) {
      label21: {
         if (h.x(var1) xor true) {
            val var2: OutputStreamWriter = new OutputStreamWriter(DebugRowLoggerKt.outputStream(this.replayFile, true), a.b);

            try {
               val var11: StringBuilder = new StringBuilder();
               var11.append(var1);
               var11.append("\n");
               var2.write(var11.toString());
               var2.flush();
            } catch (var5: java.lang.Throwable) {
               val var3: java.lang.Throwable = var5;

               try {
                  throw var3;
               } catch (var4: java.lang.Throwable) {
                  c.a(var2, var5);
               }
            }

            c.a(var2, null);
            this.writeJson();
         }
      }
   }

   private fun maybeInsertDelay() {
      val var1: Long = System.currentTimeMillis();
      if (this.lastUpdateTimestamp != null) {
         val var3: Long = this.lastUpdateTimestamp.longValue();
         val var6: StringBuilder = new StringBuilder();
         var6.append("{\"delayMs\":");
         var6.append(var1 - var3);
         var6.append("}");
         this.appendLine(var6.toString());
      }

      this.lastUpdateTimestamp = var1;
   }

   private fun writeJson() {
      label18: {
         val var2: BooleanRef = new BooleanRef();
         val var1: FileOutputStream = new FileOutputStream(this.jsonFile);
         val var3: Charset = a.b;
         val var12: OutputStreamWriter = new OutputStreamWriter(var1, a.b);

         try {
            var12.write("[\n");
            vh.q.c(new InputStreamReader(new FileInputStream(this.replayFile), var3), new Function1(var2, var12) {
               final BooleanRef $existingLine;
               final OutputStreamWriter $writer;

               {
                  super(1);
                  this.$existingLine = var1;
                  this.$writer = var2;
               }

               public final void invoke(java.lang.String var1) {
                  q.h(var1, "line");
                  if (this.$existingLine.j) {
                     this.$writer.write(",\n");
                  }

                  this.$writer.write(var1);
                  this.$existingLine.j = true;
               }
            });
            var12.write("\n]");
            var12.flush();
         } catch (var7: java.lang.Throwable) {
            val var13: java.lang.Throwable = var7;

            try {
               throw var13;
            } catch (var6: java.lang.Throwable) {
               c.a(var12, var7);
            }
         }

         c.a(var12, null);
      }
   }

   public override fun logRowsClear() {
      this.maybeInsertDelay();
      this.appendLine("{\"type\":\"clear\"}");
   }

   public override fun logRowsUpdate(rowsJson: String) {
      q.h(var1, "rowsJson");
      this.maybeInsertDelay();
      this.appendLine(var1);
   }
}
