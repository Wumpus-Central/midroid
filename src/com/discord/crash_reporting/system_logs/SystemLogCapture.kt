package com.discord.crash_reporting.system_logs

import kotlin.jvm.internal.q

internal class SystemLogCapture {
   private final val buffer: FixedSizeLineBuffer = new FixedSizeLineBuffer(524288)
   private final val tombstoneBuffer: FixedSizeLineBuffer = new FixedSizeLineBuffer(102400)

   private fun start() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
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
      // 035: anewarray 83
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
      // 05e: astore 8
      // 060: aload 5
      // 062: astore 4
      // 064: aload 5
      // 066: astore 3
      // 067: aload 8
      // 069: ldc "getInputStream(...)"
      // 06b: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 06e: aload 5
      // 070: astore 4
      // 072: aload 5
      // 074: astore 3
      // 075: getstatic ya/a.b Ljava/nio/charset/Charset;
      // 078: astore 7
      // 07a: aload 5
      // 07c: astore 4
      // 07e: aload 5
      // 080: astore 3
      // 081: new java/io/InputStreamReader
      // 084: astore 6
      // 086: aload 5
      // 088: astore 4
      // 08a: aload 5
      // 08c: astore 3
      // 08d: aload 6
      // 08f: aload 8
      // 091: aload 7
      // 093: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
      // 096: aload 5
      // 098: astore 4
      // 09a: aload 5
      // 09c: astore 3
      // 09d: new java/io/BufferedReader
      // 0a0: astore 7
      // 0a2: aload 5
      // 0a4: astore 4
      // 0a6: aload 5
      // 0a8: astore 3
      // 0a9: aload 7
      // 0ab: aload 6
      // 0ad: sipush 8192
      // 0b0: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;I)V
      // 0b3: aload 5
      // 0b5: astore 4
      // 0b7: aload 5
      // 0b9: astore 3
      // 0ba: aload 7
      // 0bc: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 0bf: astore 6
      // 0c1: aload 6
      // 0c3: ifnonnull 0c9
      // 0c6: goto 11f
      // 0c9: aload 5
      // 0cb: astore 4
      // 0cd: aload 5
      // 0cf: astore 3
      // 0d0: getstatic com/discord/crash_reporting/system_logs/SystemLogCapture.Companion Lcom/discord/crash_reporting/system_logs/SystemLogCapture$Companion;
      // 0d3: aload 6
      // 0d5: invokevirtual com/discord/crash_reporting/system_logs/SystemLogCapture$Companion.shouldIncludeLogLine$crash_reporting_release (Ljava/lang/String;)Z
      // 0d8: ifeq 0f7
      // 0db: aload 5
      // 0dd: astore 4
      // 0df: aload 5
      // 0e1: astore 3
      // 0e2: aload 0
      // 0e3: getfield com/discord/crash_reporting/system_logs/SystemLogCapture.buffer Lcom/discord/crash_reporting/system_logs/FixedSizeLineBuffer;
      // 0e6: aload 6
      // 0e8: invokevirtual com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.addLine (Ljava/lang/String;)V
      // 0eb: goto 0f7
      // 0ee: astore 3
      // 0ef: goto 1f6
      // 0f2: astore 5
      // 0f4: goto 135
      // 0f7: aload 5
      // 0f9: astore 4
      // 0fb: aload 5
      // 0fd: astore 3
      // 0fe: getstatic com/discord/crash_reporting/system_logs/SystemLogUtils.INSTANCE Lcom/discord/crash_reporting/system_logs/SystemLogUtils;
      // 101: invokevirtual com/discord/crash_reporting/system_logs/SystemLogUtils.getRegexExtractTombstone$crash_reporting_release ()Lkotlin/text/Regex;
      // 104: aload 6
      // 106: invokevirtual kotlin/text/Regex.g (Ljava/lang/CharSequence;)Z
      // 109: ifeq 0b3
      // 10c: aload 5
      // 10e: astore 4
      // 110: aload 5
      // 112: astore 3
      // 113: aload 0
      // 114: getfield com/discord/crash_reporting/system_logs/SystemLogCapture.tombstoneBuffer Lcom/discord/crash_reporting/system_logs/FixedSizeLineBuffer;
      // 117: aload 6
      // 119: invokevirtual com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.addLine (Ljava/lang/String;)V
      // 11c: goto 0b3
      // 11f: aload 5
      // 121: astore 4
      // 123: aload 5
      // 125: astore 3
      // 126: aload 7
      // 128: invokevirtual java/io/BufferedReader.close ()V
      // 12b: aload 5
      // 12d: astore 3
      // 12e: aload 3
      // 12f: invokevirtual java/lang/Process.destroy ()V
      // 132: goto 1ed
      // 135: aload 3
      // 136: astore 4
      // 138: aload 0
      // 139: getfield com/discord/crash_reporting/system_logs/SystemLogCapture.buffer Lcom/discord/crash_reporting/system_logs/FixedSizeLineBuffer;
      // 13c: astore 6
      // 13e: aload 3
      // 13f: astore 4
      // 141: new java/lang/StringBuilder
      // 144: astore 7
      // 146: aload 3
      // 147: astore 4
      // 149: aload 7
      // 14b: invokespecial java/lang/StringBuilder.<init> ()V
      // 14e: aload 3
      // 14f: astore 4
      // 151: aload 7
      // 153: ldc "Exception getting system logs '"
      // 155: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 158: pop
      // 159: aload 3
      // 15a: astore 4
      // 15c: aload 7
      // 15e: aload 5
      // 160: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 163: pop
      // 164: aload 3
      // 165: astore 4
      // 167: aload 7
      // 169: ldc "'"
      // 16b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16e: pop
      // 16f: aload 3
      // 170: astore 4
      // 172: aload 6
      // 174: aload 7
      // 176: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 179: invokevirtual com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.addLine (Ljava/lang/String;)V
      // 17c: aload 3
      // 17d: astore 4
      // 17f: aload 5
      // 181: invokevirtual java/lang/Throwable.getStackTrace ()[Ljava/lang/StackTraceElement;
      // 184: astore 5
      // 186: aload 3
      // 187: astore 4
      // 189: aload 5
      // 18b: ldc "getStackTrace(...)"
      // 18d: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 190: aload 3
      // 191: astore 4
      // 193: aload 5
      // 195: arraylength
      // 196: istore 2
      // 197: bipush 0
      // 198: istore 1
      // 199: iload 1
      // 19a: iload 2
      // 19b: if_icmpge 1e6
      // 19e: aload 5
      // 1a0: iload 1
      // 1a1: aaload
      // 1a2: astore 7
      // 1a4: aload 3
      // 1a5: astore 4
      // 1a7: aload 0
      // 1a8: getfield com/discord/crash_reporting/system_logs/SystemLogCapture.buffer Lcom/discord/crash_reporting/system_logs/FixedSizeLineBuffer;
      // 1ab: astore 8
      // 1ad: aload 3
      // 1ae: astore 4
      // 1b0: new java/lang/StringBuilder
      // 1b3: astore 6
      // 1b5: aload 3
      // 1b6: astore 4
      // 1b8: aload 6
      // 1ba: invokespecial java/lang/StringBuilder.<init> ()V
      // 1bd: aload 3
      // 1be: astore 4
      // 1c0: aload 6
      // 1c2: ldc "    "
      // 1c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c7: pop
      // 1c8: aload 3
      // 1c9: astore 4
      // 1cb: aload 6
      // 1cd: aload 7
      // 1cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1d2: pop
      // 1d3: aload 3
      // 1d4: astore 4
      // 1d6: aload 8
      // 1d8: aload 6
      // 1da: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1dd: invokevirtual com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.addLine (Ljava/lang/String;)V
      // 1e0: iinc 1 1
      // 1e3: goto 199
      // 1e6: aload 3
      // 1e7: ifnull 1ed
      // 1ea: goto 12e
      // 1ed: ldc2_w 1000
      // 1f0: invokestatic java/lang/Thread.sleep (J)V
      // 1f3: goto 019
      // 1f6: aload 4
      // 1f8: ifnull 200
      // 1fb: aload 4
      // 1fd: invokevirtual java/lang/Process.destroy ()V
      // 200: aload 3
      // 201: athrow
      // 202: astore 3
      // 203: goto 11f
   }

   @JvmStatic
   fun `startThread$lambda$0`(var0: SystemLogCapture): Unit {
      var0.start();
      return Unit.a;
   }

   public fun appendOutput(sb: StringBuilder) {
      q.h(var1, "sb");
      this.tombstoneBuffer.appendString(var1);
      this.buffer.appendString(var1);
   }

   public fun startThread(): Thread {
      return W8.a.b(true, true, null, SystemLogCapture.class.getSimpleName(), 0, new g(this), 20, null);
   }

   public companion object {
      internal fun shouldIncludeLogLine(line: String): Boolean {
         q.h(var1, "line");
         return kotlin.text.h.N(var1, "chatty  : uid=", false, 2, null) xor true;
      }
   }
}
