package com.discord.chatreplay.logger

import H1.a
import L9.c
import L9.p
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.nio.charset.Charset
import java.nio.file.Path
import kotlin.jvm.internal.Ref.BooleanRef

public class DebugRowLogger(logsFolderPath: Path, tag: Int) : RowLogger {
   private final val replayFile: File
   private final val jsonFile: File
   private final var lastUpdateTimestamp: Long?

   init {
      var var3: java.lang.String = var1.toString();
      var var4: StringBuilder = new StringBuilder();
      var4.append(var2);
      var4.append(".replay");
      new File(var3, var4.toString()).delete();
      var3 = var1.toString();
      var4 = new StringBuilder();
      var4.append(var2);
      var4.append(".json");
      new File(var3, var4.toString()).delete();
      var3 = var1.toString();
      var4 = new StringBuilder();
      var4.append(var2);
      var4.append(".replay");
      this.replayFile = new File(var3, var4.toString());
      val var5: java.lang.String = var1.toString();
      val var8: StringBuilder = new StringBuilder();
      var8.append(var2);
      var8.append(".json");
      this.jsonFile = new File(var5, var8.toString());
   }

   private fun appendLine(line: String) {
      label21: {
         if (!StringsKt.c0(var1)) {
            val var2: OutputStreamWriter = new OutputStreamWriter(DebugRowLoggerKt.outputStream(this.replayFile, true), Charsets.UTF_8);

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
      val var3: Long = System.currentTimeMillis();
      if (this.lastUpdateTimestamp != null) {
         val var1: Long = this.lastUpdateTimestamp.longValue();
         val var6: StringBuilder = new StringBuilder();
         var6.append("{\"delayMs\":");
         var6.append(var3 - var1);
         var6.append("}");
         this.appendLine(var6.toString());
      }

      this.lastUpdateTimestamp = var3;
   }

   private fun writeJson() {
      label18: {
         val var2: BooleanRef = new BooleanRef();
         val var1: FileOutputStream = new FileOutputStream(this.jsonFile);
         val var4: Charset = Charsets.UTF_8;
         val var12: OutputStreamWriter = new OutputStreamWriter(var1, Charsets.UTF_8);

         try {
            var12.write("[\n");
            p.c(new InputStreamReader(new FileInputStream(this.replayFile), var4), new a(var2, var12));
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

   @JvmStatic
   fun `writeJson$lambda$3$lambda$2`(var0: BooleanRef, var1: OutputStreamWriter, var2: java.lang.String): Unit {
      if (var0.element) {
         var1.write(",\n");
      }

      var1.write(var2);
      var0.element = true;
      return Unit.a;
   }

   public override fun logRowsClear() {
      this.maybeInsertDelay();
      this.appendLine("{\"type\":\"clear\"}");
   }

   public override fun logRowsUpdate(rowsJson: String) {
      this.maybeInsertDelay();
      this.appendLine(var1);
   }
}
