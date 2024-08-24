package com.discord.crash_reporting.system_logs

import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.r

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
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:156)
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
      // 019: aconst_null
      // 01a: astore 5
      // 01c: aconst_null
      // 01d: astore 6
      // 01f: aload 6
      // 021: astore 4
      // 023: aload 5
      // 025: astore 3
      // 026: new java/lang/ProcessBuilder
      // 029: astore 7
      // 02b: aload 6
      // 02d: astore 4
      // 02f: aload 5
      // 031: astore 3
      // 032: aload 7
      // 034: bipush 1
      // 035: anewarray 84
      // 038: dup
      // 039: bipush 0
      // 03a: ldc "/system/bin/logcat"
      // 03c: aastore
      // 03d: invokespecial java/lang/ProcessBuilder.<init> ([Ljava/lang/String;)V
      // 040: aload 6
      // 042: astore 4
      // 044: aload 5
      // 046: astore 3
      // 047: aload 7
      // 049: bipush 1
      // 04a: invokevirtual java/lang/ProcessBuilder.redirectErrorStream (Z)Ljava/lang/ProcessBuilder;
      // 04d: invokevirtual java/lang/ProcessBuilder.start ()Ljava/lang/Process;
      // 050: astore 5
      // 052: aload 5
      // 054: astore 4
      // 056: aload 5
      // 058: astore 3
      // 059: aload 5
      // 05b: invokevirtual java/lang/Process.getInputStream ()Ljava/io/InputStream;
      // 05e: astore 6
      // 060: aload 5
      // 062: astore 4
      // 064: aload 5
      // 066: astore 3
      // 067: aload 6
      // 069: ldc "logcatProcess.inputStream"
      // 06b: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 06e: aload 5
      // 070: astore 4
      // 072: aload 5
      // 074: astore 3
      // 075: getstatic ik/a.b Ljava/nio/charset/Charset;
      // 078: astore 7
      // 07a: aload 5
      // 07c: astore 4
      // 07e: aload 5
      // 080: astore 3
      // 081: new java/io/InputStreamReader
      // 084: astore 8
      // 086: aload 5
      // 088: astore 4
      // 08a: aload 5
      // 08c: astore 3
      // 08d: aload 8
      // 08f: aload 6
      // 091: aload 7
      // 093: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
      // 096: aload 5
      // 098: astore 4
      // 09a: aload 5
      // 09c: astore 3
      // 09d: aload 8
      // 09f: instanceof java/io/BufferedReader
      // 0a2: ifeq 0b6
      // 0a5: aload 5
      // 0a7: astore 4
      // 0a9: aload 5
      // 0ab: astore 3
      // 0ac: aload 8
      // 0ae: checkcast java/io/BufferedReader
      // 0b1: astore 6
      // 0b3: goto 0cb
      // 0b6: aload 5
      // 0b8: astore 4
      // 0ba: aload 5
      // 0bc: astore 3
      // 0bd: new java/io/BufferedReader
      // 0c0: dup
      // 0c1: aload 8
      // 0c3: sipush 8192
      // 0c6: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;I)V
      // 0c9: astore 6
      // 0cb: aload 5
      // 0cd: astore 4
      // 0cf: aload 5
      // 0d1: astore 3
      // 0d2: aload 6
      // 0d4: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 0d7: astore 7
      // 0d9: aload 7
      // 0db: ifnonnull 0e1
      // 0de: goto 12b
      // 0e1: aload 5
      // 0e3: astore 4
      // 0e5: aload 5
      // 0e7: astore 3
      // 0e8: getstatic com/discord/crash_reporting/system_logs/SystemLogCapture.Companion Lcom/discord/crash_reporting/system_logs/SystemLogCapture$Companion;
      // 0eb: aload 7
      // 0ed: invokevirtual com/discord/crash_reporting/system_logs/SystemLogCapture$Companion.shouldIncludeLogLine$crash_reporting_release (Ljava/lang/String;)Z
      // 0f0: ifeq 103
      // 0f3: aload 5
      // 0f5: astore 4
      // 0f7: aload 5
      // 0f9: astore 3
      // 0fa: aload 0
      // 0fb: getfield com/discord/crash_reporting/system_logs/SystemLogCapture.buffer Lcom/discord/crash_reporting/system_logs/FixedSizeLineBuffer;
      // 0fe: aload 7
      // 100: invokevirtual com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.addLine (Ljava/lang/String;)V
      // 103: aload 5
      // 105: astore 4
      // 107: aload 5
      // 109: astore 3
      // 10a: getstatic com/discord/crash_reporting/system_logs/SystemLogUtils.INSTANCE Lcom/discord/crash_reporting/system_logs/SystemLogUtils;
      // 10d: invokevirtual com/discord/crash_reporting/system_logs/SystemLogUtils.getRegexExtractTombstone$crash_reporting_release ()Lkotlin/text/Regex;
      // 110: aload 7
      // 112: invokevirtual kotlin/text/Regex.g (Ljava/lang/CharSequence;)Z
      // 115: ifeq 0cb
      // 118: aload 5
      // 11a: astore 4
      // 11c: aload 5
      // 11e: astore 3
      // 11f: aload 0
      // 120: getfield com/discord/crash_reporting/system_logs/SystemLogCapture.tombstoneBuffer Lcom/discord/crash_reporting/system_logs/FixedSizeLineBuffer;
      // 123: aload 7
      // 125: invokevirtual com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.addLine (Ljava/lang/String;)V
      // 128: goto 0cb
      // 12b: aload 5
      // 12d: astore 4
      // 12f: aload 5
      // 131: astore 3
      // 132: aload 6
      // 134: invokevirtual java/io/BufferedReader.close ()V
      // 137: aload 5
      // 139: astore 3
      // 13a: aload 3
      // 13b: invokevirtual java/lang/Process.destroy ()V
      // 13e: goto 1ff
      // 141: astore 3
      // 142: goto 208
      // 145: astore 5
      // 147: aload 3
      // 148: astore 4
      // 14a: aload 0
      // 14b: getfield com/discord/crash_reporting/system_logs/SystemLogCapture.buffer Lcom/discord/crash_reporting/system_logs/FixedSizeLineBuffer;
      // 14e: astore 6
      // 150: aload 3
      // 151: astore 4
      // 153: new java/lang/StringBuilder
      // 156: astore 7
      // 158: aload 3
      // 159: astore 4
      // 15b: aload 7
      // 15d: invokespecial java/lang/StringBuilder.<init> ()V
      // 160: aload 3
      // 161: astore 4
      // 163: aload 7
      // 165: ldc "Exception getting system logs '"
      // 167: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16a: pop
      // 16b: aload 3
      // 16c: astore 4
      // 16e: aload 7
      // 170: aload 5
      // 172: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 175: pop
      // 176: aload 3
      // 177: astore 4
      // 179: aload 7
      // 17b: ldc "'"
      // 17d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 180: pop
      // 181: aload 3
      // 182: astore 4
      // 184: aload 6
      // 186: aload 7
      // 188: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 18b: invokevirtual com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.addLine (Ljava/lang/String;)V
      // 18e: aload 3
      // 18f: astore 4
      // 191: aload 5
      // 193: invokevirtual java/lang/Throwable.getStackTrace ()[Ljava/lang/StackTraceElement;
      // 196: astore 7
      // 198: aload 3
      // 199: astore 4
      // 19b: aload 7
      // 19d: ldc "e.stackTrace"
      // 19f: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 1a2: aload 3
      // 1a3: astore 4
      // 1a5: aload 7
      // 1a7: arraylength
      // 1a8: istore 2
      // 1a9: bipush 0
      // 1aa: istore 1
      // 1ab: iload 1
      // 1ac: iload 2
      // 1ad: if_icmpge 1f8
      // 1b0: aload 7
      // 1b2: iload 1
      // 1b3: aaload
      // 1b4: astore 6
      // 1b6: aload 3
      // 1b7: astore 4
      // 1b9: aload 0
      // 1ba: getfield com/discord/crash_reporting/system_logs/SystemLogCapture.buffer Lcom/discord/crash_reporting/system_logs/FixedSizeLineBuffer;
      // 1bd: astore 8
      // 1bf: aload 3
      // 1c0: astore 4
      // 1c2: new java/lang/StringBuilder
      // 1c5: astore 5
      // 1c7: aload 3
      // 1c8: astore 4
      // 1ca: aload 5
      // 1cc: invokespecial java/lang/StringBuilder.<init> ()V
      // 1cf: aload 3
      // 1d0: astore 4
      // 1d2: aload 5
      // 1d4: ldc "    "
      // 1d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d9: pop
      // 1da: aload 3
      // 1db: astore 4
      // 1dd: aload 5
      // 1df: aload 6
      // 1e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1e4: pop
      // 1e5: aload 3
      // 1e6: astore 4
      // 1e8: aload 8
      // 1ea: aload 5
      // 1ec: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ef: invokevirtual com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.addLine (Ljava/lang/String;)V
      // 1f2: iinc 1 1
      // 1f5: goto 1ab
      // 1f8: aload 3
      // 1f9: ifnull 1ff
      // 1fc: goto 13a
      // 1ff: ldc2_w 1000
      // 202: invokestatic java/lang/Thread.sleep (J)V
      // 205: goto 019
      // 208: aload 4
      // 20a: ifnull 212
      // 20d: aload 4
      // 20f: invokevirtual java/lang/Process.destroy ()V
      // 212: aload 3
      // 213: athrow
      // 214: astore 3
      // 215: goto 12b
   }

   public fun appendOutput(sb: StringBuilder) {
      r.h(var1, "sb");
      this.tombstoneBuffer.appendString(var1);
      this.buffer.appendString(var1);
   }

   public fun startThread(): Thread {
      return ih.a.b(true, true, null, SystemLogCapture.class.getSimpleName(), 0, new Function0<Unit>(this) {
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
         r.h(var1, "line");
         return f.N(var1, "chatty  : uid=", false, 2, null) xor true;
      }
   }
}
