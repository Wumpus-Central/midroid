package com.discord.crash_reporting.system_logs

import android.app.ActivityManager
import android.app.ActivityManager.MemoryInfo
import android.content.Context
import com.discord.misc.utilities.collections.CircularByteBuffer
import java.io.File
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSystemLogCapture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemLogCapture.kt\ncom/discord/crash_reporting/system_logs/SystemLogCapture\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,124:1\n13409#2,2:125\n*S KotlinDebug\n*F\n+ 1 SystemLogCapture.kt\ncom/discord/crash_reporting/system_logs/SystemLogCapture\n*L\n106#1:125,2\n*E\n"])
internal class SystemLogCapture {
   private final val buffer: CircularByteBuffer = new CircularByteBuffer(262144)
   private final val tombstoneBuffer: CircularByteBuffer = new CircularByteBuffer(51200)
   private final val memoryInfo: MemoryInfo
   private final lateinit var activityManager: ActivityManager

   private fun addExceptionToBuffer(e: Exception) {
      val var4: Array<StackTraceElement> = var1.getStackTrace();
      val var3: Int = var4.length;

      for (int var2 = 0; var2 < var3; var2++) {
         val var6: StackTraceElement = var4[var2];
         val var5: CircularByteBuffer = this.buffer;
         val var7: StringBuilder = new StringBuilder();
         var7.append("    ");
         var7.append(var6);
         var5.addLine(var7.toString());
      }
   }

   private fun isLowMemory(): Boolean {
      val var3: MemoryInfo = this.memoryInfo;
      var var1: ActivityManager = this.activityManager;
      if (this.activityManager == null) {
         Intrinsics.throwUninitializedPropertyAccessException("activityManager");
         var1 = null;
      }

      var1.getMemoryInfo(this.memoryInfo);
      return var3.lowMemory;
   }

   private fun readFromLogcat() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: new java/lang/ProcessBuilder
      // 03: astore 1
      // 04: aload 1
      // 05: bipush 1
      // 06: anewarray 146
      // 09: dup
      // 0a: bipush 0
      // 0b: ldc "/system/bin/logcat"
      // 0d: aastore
      // 0e: invokespecial java/lang/ProcessBuilder.<init> ([Ljava/lang/String;)V
      // 11: aload 1
      // 12: bipush 1
      // 13: invokevirtual java/lang/ProcessBuilder.redirectErrorStream (Z)Ljava/lang/ProcessBuilder;
      // 16: invokevirtual java/lang/ProcessBuilder.start ()Ljava/lang/Process;
      // 19: astore 1
      // 1a: new java/io/BufferedReader
      // 1d: astore 2
      // 1e: new java/io/InputStreamReader
      // 21: astore 3
      // 22: aload 3
      // 23: aload 1
      // 24: invokevirtual java/lang/Process.getInputStream ()Ljava/io/InputStream;
      // 27: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 2a: aload 2
      // 2b: aload 3
      // 2c: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 2f: new com/discord/crash_reporting/system_logs/d
      // 32: astore 3
      // 33: aload 3
      // 34: aload 0
      // 35: invokespecial com/discord/crash_reporting/system_logs/d.<init> (Lcom/discord/crash_reporting/system_logs/SystemLogCapture;)V
      // 38: aload 2
      // 39: aload 3
      // 3a: invokestatic Ma/q.c (Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)V
      // 3d: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 40: astore 3
      // 41: aload 2
      // 42: aconst_null
      // 43: invokestatic Ma/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 46: aload 1
      // 47: invokevirtual java/lang/Process.destroy ()V
      // 4a: return
      // 4b: astore 2
      // 4c: goto 5d
      // 4f: astore 4
      // 51: aload 4
      // 53: athrow
      // 54: astore 3
      // 55: aload 2
      // 56: aload 4
      // 58: invokestatic Ma/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 5b: aload 3
      // 5c: athrow
      // 5d: aload 1
      // 5e: invokevirtual java/lang/Process.destroy ()V
      // 61: aload 2
      // 62: athrow
      // 63: astore 1
      // 64: aload 0
      // 65: getfield com/discord/crash_reporting/system_logs/SystemLogCapture.buffer Lcom/discord/misc/utilities/collections/CircularByteBuffer;
      // 68: astore 2
      // 69: new java/lang/StringBuilder
      // 6c: dup
      // 6d: invokespecial java/lang/StringBuilder.<init> ()V
      // 70: astore 3
      // 71: aload 3
      // 72: ldc "Exception starting logcat process '"
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: pop
      // 78: aload 3
      // 79: aload 1
      // 7a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 7d: pop
      // 7e: aload 3
      // 7f: ldc "'"
      // 81: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 84: pop
      // 85: aload 2
      // 86: aload 3
      // 87: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8a: invokevirtual com/discord/misc/utilities/collections/CircularByteBuffer.addLine (Ljava/lang/String;)V
      // 8d: aload 0
      // 8e: aload 1
      // 8f: invokespecial com/discord/crash_reporting/system_logs/SystemLogCapture.addExceptionToBuffer (Ljava/lang/Exception;)V
      // 92: return
   }

   @JvmStatic
   fun `readFromLogcat$lambda$2$lambda$1`(var0: SystemLogCapture, var1: java.lang.String): Unit {
      if (Companion.shouldIncludeLogLine$crash_reporting_release(var1)) {
         var0.buffer.addLine(var1);
      }

      if (SystemLogUtils.INSTANCE.getRegexExtractTombstone$crash_reporting_release().g(var1)) {
         var0.tombstoneBuffer.addLine(var1);
      }

      return Unit.a;
   }

   private fun start() {
      if (!new File("/system/bin/logcat").exists()) {
         this.buffer.addLine("Unable to locate '/system/bin/logcat'");
      } else {
         while (true) {
            try {
               try {
                  if (!this.isLowMemory()) {
                     this.readFromLogcat();
                  } else {
                     this.buffer.addLine("Low memory. Skipping logcat read for 2000ms");
                  }
               } catch (var4: Exception) {
                  val var2: CircularByteBuffer = this.buffer;
                  val var1: StringBuilder = new StringBuilder();
                  var1.append("Exception getting system logs, will restart logcat. '");
                  val var3: Any;
                  var1.append(var3);
                  var1.append("'");
                  var2.addLine(var1.toString());
                  this.addExceptionToBuffer((Exception)var3);
               }
            } catch (var5: java.lang.Throwable) {
               Thread.sleep(2000L);
            }

            Thread.sleep(2000L);
         }
      }
   }

   @JvmStatic
   fun `startThread$lambda$0`(var0: SystemLogCapture): Unit {
      var0.start();
      return Unit.a;
   }

   public fun appendOutput(sb: StringBuilder) {
      this.tombstoneBuffer.appendString(var1);
      this.buffer.appendString(var1);
   }

   public fun startThread(context: Context) {
      this.activityManager = var1.getSystemService(ActivityManager.class) as ActivityManager;
      Ga.a.b(true, true, null, SystemLogCapture.class.getSimpleName(), 0, new e(this), 20, null);
   }

   public companion object {
      private const val THREAD_SLEEP_MS: Long

      internal fun shouldIncludeLogLine(line: String): Boolean {
         return StringsKt.N(var1, "chatty  : uid=", false, 2, null) xor true;
      }
   }
}
