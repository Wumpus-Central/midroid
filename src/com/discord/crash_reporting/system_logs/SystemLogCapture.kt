package com.discord.crash_reporting.system_logs

import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

internal class SystemLogCapture {
   private final val buffer: FixedSizeLineBuffer = new FixedSizeLineBuffer(524288)
   private final val tombstoneBuffer: FixedSizeLineBuffer = new FixedSizeLineBuffer(102400)

   private fun start() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.createStatement(DomHelper.java:27)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:157)
      //
      // Bytecode:
      // 000: new java/io/File
      // 003: dup
      // 004: ldc "/system/bin/logcat"
      // 006: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 009: invokevirtual java/io/File.exists ()Z
      // 00c: ifne 019
      // 00f: aload 0
      // 010: getfield com/discord/crash_reporting/system_logs/SystemLogCapture.buffer Lcom/discord/crash_reporting/system_logs/FixedSizeLineBuffer;
      // 013: ldc "Unable to locate '/system/bin/logcat'"
      // 015: invokevirtual com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.addLine (Ljava/lang/String;)V
      // 018: return
      // 019: bipush 0
      // 01a: istore 1
      // 01b: aconst_null
      // 01c: astore 6
      // 01e: aconst_null
      // 01f: astore 5
      // 021: aload 5
      // 023: astore 4
      // 025: aload 6
      // 027: astore 3
      // 028: new java/lang/ProcessBuilder
      // 02b: astore 7
      // 02d: aload 5
      // 02f: astore 4
      // 031: aload 6
      // 033: astore 3
      // 034: aload 7
      // 036: bipush 1
      // 037: anewarray 84
      // 03a: dup
      // 03b: bipush 0
      // 03c: ldc "/system/bin/logcat"
      // 03e: aastore
      // 03f: invokespecial java/lang/ProcessBuilder.<init> ([Ljava/lang/String;)V
      // 042: aload 5
      // 044: astore 4
      // 046: aload 6
      // 048: astore 3
      // 049: aload 7
      // 04b: bipush 1
      // 04c: invokevirtual java/lang/ProcessBuilder.redirectErrorStream (Z)Ljava/lang/ProcessBuilder;
      // 04f: invokevirtual java/lang/ProcessBuilder.start ()Ljava/lang/Process;
      // 052: astore 5
      // 054: aload 5
      // 056: astore 4
      // 058: aload 5
      // 05a: astore 3
      // 05b: aload 5
      // 05d: invokevirtual java/lang/Process.getInputStream ()Ljava/io/InputStream;
      // 060: astore 8
      // 062: aload 5
      // 064: astore 4
      // 066: aload 5
      // 068: astore 3
      // 069: aload 8
      // 06b: ldc "getInputStream(...)"
      // 06d: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 070: aload 5
      // 072: astore 4
      // 074: aload 5
      // 076: astore 3
      // 077: getstatic qk/a.b Ljava/nio/charset/Charset;
      // 07a: astore 6
      // 07c: aload 5
      // 07e: astore 4
      // 080: aload 5
      // 082: astore 3
      // 083: new java/io/InputStreamReader
      // 086: astore 7
      // 088: aload 5
      // 08a: astore 4
      // 08c: aload 5
      // 08e: astore 3
      // 08f: aload 7
      // 091: aload 8
      // 093: aload 6
      // 095: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
      // 098: aload 5
      // 09a: astore 4
      // 09c: aload 5
      // 09e: astore 3
      // 09f: aload 7
      // 0a1: instanceof java/io/BufferedReader
      // 0a4: ifeq 0c1
      // 0a7: aload 5
      // 0a9: astore 4
      // 0ab: aload 5
      // 0ad: astore 3
      // 0ae: aload 7
      // 0b0: checkcast java/io/BufferedReader
      // 0b3: astore 6
      // 0b5: goto 0d6
      // 0b8: astore 3
      // 0b9: goto 20b
      // 0bc: astore 6
      // 0be: goto 14c
      // 0c1: aload 5
      // 0c3: astore 4
      // 0c5: aload 5
      // 0c7: astore 3
      // 0c8: new java/io/BufferedReader
      // 0cb: dup
      // 0cc: aload 7
      // 0ce: sipush 8192
      // 0d1: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;I)V
      // 0d4: astore 6
      // 0d6: aload 5
      // 0d8: astore 4
      // 0da: aload 5
      // 0dc: astore 3
      // 0dd: aload 6
      // 0df: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 0e2: astore 7
      // 0e4: aload 7
      // 0e6: ifnonnull 0ec
      // 0e9: goto 136
      // 0ec: aload 5
      // 0ee: astore 4
      // 0f0: aload 5
      // 0f2: astore 3
      // 0f3: getstatic com/discord/crash_reporting/system_logs/SystemLogCapture.Companion Lcom/discord/crash_reporting/system_logs/SystemLogCapture$Companion;
      // 0f6: aload 7
      // 0f8: invokevirtual com/discord/crash_reporting/system_logs/SystemLogCapture$Companion.shouldIncludeLogLine$crash_reporting_release (Ljava/lang/String;)Z
      // 0fb: ifeq 10e
      // 0fe: aload 5
      // 100: astore 4
      // 102: aload 5
      // 104: astore 3
      // 105: aload 0
      // 106: getfield com/discord/crash_reporting/system_logs/SystemLogCapture.buffer Lcom/discord/crash_reporting/system_logs/FixedSizeLineBuffer;
      // 109: aload 7
      // 10b: invokevirtual com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.addLine (Ljava/lang/String;)V
      // 10e: aload 5
      // 110: astore 4
      // 112: aload 5
      // 114: astore 3
      // 115: getstatic com/discord/crash_reporting/system_logs/SystemLogUtils.INSTANCE Lcom/discord/crash_reporting/system_logs/SystemLogUtils;
      // 118: invokevirtual com/discord/crash_reporting/system_logs/SystemLogUtils.getRegexExtractTombstone$crash_reporting_release ()Lkotlin/text/Regex;
      // 11b: aload 7
      // 11d: invokevirtual kotlin/text/Regex.g (Ljava/lang/CharSequence;)Z
      // 120: ifeq 0d6
      // 123: aload 5
      // 125: astore 4
      // 127: aload 5
      // 129: astore 3
      // 12a: aload 0
      // 12b: getfield com/discord/crash_reporting/system_logs/SystemLogCapture.tombstoneBuffer Lcom/discord/crash_reporting/system_logs/FixedSizeLineBuffer;
      // 12e: aload 7
      // 130: invokevirtual com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.addLine (Ljava/lang/String;)V
      // 133: goto 0d6
      // 136: aload 5
      // 138: astore 4
      // 13a: aload 5
      // 13c: astore 3
      // 13d: aload 6
      // 13f: invokevirtual java/io/BufferedReader.close ()V
      // 142: aload 5
      // 144: astore 3
      // 145: aload 3
      // 146: invokevirtual java/lang/Process.destroy ()V
      // 149: goto 202
      // 14c: aload 3
      // 14d: astore 4
      // 14f: aload 0
      // 150: getfield com/discord/crash_reporting/system_logs/SystemLogCapture.buffer Lcom/discord/crash_reporting/system_logs/FixedSizeLineBuffer;
      // 153: astore 7
      // 155: aload 3
      // 156: astore 4
      // 158: new java/lang/StringBuilder
      // 15b: astore 5
      // 15d: aload 3
      // 15e: astore 4
      // 160: aload 5
      // 162: invokespecial java/lang/StringBuilder.<init> ()V
      // 165: aload 3
      // 166: astore 4
      // 168: aload 5
      // 16a: ldc "Exception getting system logs '"
      // 16c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16f: pop
      // 170: aload 3
      // 171: astore 4
      // 173: aload 5
      // 175: aload 6
      // 177: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 17a: pop
      // 17b: aload 3
      // 17c: astore 4
      // 17e: aload 5
      // 180: ldc "'"
      // 182: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 185: pop
      // 186: aload 3
      // 187: astore 4
      // 189: aload 7
      // 18b: aload 5
      // 18d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 190: invokevirtual com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.addLine (Ljava/lang/String;)V
      // 193: aload 3
      // 194: astore 4
      // 196: aload 6
      // 198: invokevirtual java/lang/Throwable.getStackTrace ()[Ljava/lang/StackTraceElement;
      // 19b: astore 7
      // 19d: aload 3
      // 19e: astore 4
      // 1a0: aload 7
      // 1a2: ldc "getStackTrace(...)"
      // 1a4: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 1a7: aload 3
      // 1a8: astore 4
      // 1aa: aload 7
      // 1ac: arraylength
      // 1ad: istore 2
      // 1ae: iload 1
      // 1af: iload 2
      // 1b0: if_icmpge 1fb
      // 1b3: aload 7
      // 1b5: iload 1
      // 1b6: aaload
      // 1b7: astore 6
      // 1b9: aload 3
      // 1ba: astore 4
      // 1bc: aload 0
      // 1bd: getfield com/discord/crash_reporting/system_logs/SystemLogCapture.buffer Lcom/discord/crash_reporting/system_logs/FixedSizeLineBuffer;
      // 1c0: astore 8
      // 1c2: aload 3
      // 1c3: astore 4
      // 1c5: new java/lang/StringBuilder
      // 1c8: astore 5
      // 1ca: aload 3
      // 1cb: astore 4
      // 1cd: aload 5
      // 1cf: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d2: aload 3
      // 1d3: astore 4
      // 1d5: aload 5
      // 1d7: ldc "    "
      // 1d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1dc: pop
      // 1dd: aload 3
      // 1de: astore 4
      // 1e0: aload 5
      // 1e2: aload 6
      // 1e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1e7: pop
      // 1e8: aload 3
      // 1e9: astore 4
      // 1eb: aload 8
      // 1ed: aload 5
      // 1ef: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f2: invokevirtual com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.addLine (Ljava/lang/String;)V
      // 1f5: iinc 1 1
      // 1f8: goto 1ae
      // 1fb: aload 3
      // 1fc: ifnull 202
      // 1ff: goto 145
      // 202: ldc2_w 1000
      // 205: invokestatic java/lang/Thread.sleep (J)V
      // 208: goto 019
      // 20b: aload 4
      // 20d: ifnull 215
      // 210: aload 4
      // 212: invokevirtual java/lang/Process.destroy ()V
      // 215: aload 3
      // 216: athrow
      // 217: astore 3
      // 218: goto 136
   }

   public fun appendOutput(sb: StringBuilder) {
      q.h(var1, "sb");
      this.tombstoneBuffer.appendString(var1);
      this.buffer.appendString(var1);
   }

   public fun startThread(): Thread {
      return oh.a.b(true, true, null, SystemLogCapture.class.getSimpleName(), 0, new Function0(this) {
         final SystemLogCapture this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            SystemLogCapture.access$start(this.this$0);
         }
      }, 20, null);
   }

   public companion object {
      internal fun shouldIncludeLogLine(line: String): Boolean {
         q.h(var1, "line");
         return h.M(var1, "chatty  : uid=", false, 2, null) xor true;
      }
   }
}
