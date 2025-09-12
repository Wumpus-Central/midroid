@file:SourceDebugExtension(["SMAP\nDeviceHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceHardwareInfo.kt\ncom/discord/device/utils/DeviceHardwareInfoKt\n+ 2 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n54#2,4:73\n1#3:77\n1#3:78\n*S KotlinDebug\n*F\n+ 1 DeviceHardwareInfo.kt\ncom/discord/device/utils/DeviceHardwareInfoKt\n*L\n10#1:73,4\n10#1:77\n*E\n"])

package com.discord.device.utils

import android.app.ActivityManager
import android.app.ActivityManager.MemoryInfo
import android.content.Context
import android.os.Build.VERSION
import java.util.Arrays
import java.util.Locale
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.jvm.internal.StringCompanionObject

internal fun getNumCpuCores(): Int {
   return Runtime.getRuntime().availableProcessors();
}

internal fun getSocFromProcCpuInfo(): String {
   // $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
   //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
   //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
   //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
   //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
   //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
   //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
   //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
   //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
   //
   // Bytecode:
   // 00: ldc ""
   // 02: astore 1
   // 03: new java/io/File
   // 06: astore 3
   // 07: aload 3
   // 08: ldc "/proc/cpuinfo"
   // 0a: invokespecial java/io/File.<init> (Ljava/lang/String;)V
   // 0d: getstatic kotlin/text/Charsets.UTF_8 Ljava/nio/charset/Charset;
   // 10: astore 2
   // 11: new java/io/InputStreamReader
   // 14: astore 0
   // 15: new java/io/FileInputStream
   // 18: astore 4
   // 1a: aload 4
   // 1c: aload 3
   // 1d: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
   // 20: aload 0
   // 21: aload 4
   // 23: aload 2
   // 24: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
   // 27: new java/io/BufferedReader
   // 2a: astore 2
   // 2b: aload 2
   // 2c: aload 0
   // 2d: sipush 8192
   // 30: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;I)V
   // 33: aload 2
   // 34: invokestatic L9/p.d (Ljava/io/BufferedReader;)Lkotlin/sequences/Sequence;
   // 37: invokeinterface kotlin/sequences/Sequence.iterator ()Ljava/util/Iterator; 1
   // 3c: astore 3
   // 3d: aload 3
   // 3e: invokeinterface java/util/Iterator.hasNext ()Z 1
   // 43: ifeq 63
   // 46: aload 3
   // 47: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
   // 4c: astore 0
   // 4d: aload 0
   // 4e: checkcast java/lang/String
   // 51: ldc "Hardware"
   // 53: bipush 0
   // 54: bipush 2
   // 55: aconst_null
   // 56: invokestatic kotlin/text/StringsKt.I (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
   // 59: ifeq 3d
   // 5c: goto 65
   // 5f: astore 0
   // 60: goto 9e
   // 63: aconst_null
   // 64: astore 0
   // 65: aload 0
   // 66: checkcast java/lang/String
   // 69: astore 0
   // 6a: aload 0
   // 6b: ifnull 93
   // 6e: aload 0
   // 6f: bipush 1
   // 70: anewarray 95
   // 73: dup
   // 74: bipush 0
   // 75: ldc ":"
   // 77: aastore
   // 78: bipush 0
   // 79: bipush 0
   // 7a: bipush 6
   // 7c: aconst_null
   // 7d: invokestatic kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
   // 80: bipush 1
   // 81: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
   // 86: checkcast java/lang/String
   // 89: invokestatic kotlin/text/StringsKt.Y0 (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
   // 8c: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
   // 8f: astore 0
   // 90: goto 96
   // 93: ldc ""
   // 95: astore 0
   // 96: aload 2
   // 97: aconst_null
   // 98: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
   // 9b: goto a8
   // 9e: aload 0
   // 9f: athrow
   // a0: astore 3
   // a1: aload 2
   // a2: aload 0
   // a3: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
   // a6: aload 3
   // a7: athrow
   // a8: aload 0
   // a9: areturn
   // aa: astore 0
   // ab: aload 1
   // ac: astore 0
   // ad: goto a8
}

internal fun maxCpuFreq(): String {
   // $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
   //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
   //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
   //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
   //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
   //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
   //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
   //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
   //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
   //
   // Bytecode:
   // 000: invokestatic com/discord/device/utils/DeviceHardwareInfoKt.getNumCpuCores ()I
   // 003: istore 3
   // 004: bipush 0
   // 005: istore 2
   // 006: lconst_0
   // 007: lstore 4
   // 009: iload 2
   // 00a: iload 3
   // 00b: if_icmpge 127
   // 00e: lload 4
   // 010: lstore 8
   // 012: new java/io/File
   // 015: astore 12
   // 017: lload 4
   // 019: lstore 8
   // 01b: new java/lang/StringBuilder
   // 01e: astore 13
   // 020: lload 4
   // 022: lstore 8
   // 024: aload 13
   // 026: invokespecial java/lang/StringBuilder.<init> ()V
   // 029: lload 4
   // 02b: lstore 8
   // 02d: aload 13
   // 02f: ldc "/sys/devices/system/cpu/cpu"
   // 031: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
   // 034: pop
   // 035: lload 4
   // 037: lstore 8
   // 039: aload 13
   // 03b: iload 2
   // 03c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
   // 03f: pop
   // 040: lload 4
   // 042: lstore 8
   // 044: aload 13
   // 046: ldc "/cpufreq/cpuinfo_max_freq"
   // 048: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
   // 04b: pop
   // 04c: lload 4
   // 04e: lstore 8
   // 050: aload 12
   // 052: aload 13
   // 054: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
   // 057: invokespecial java/io/File.<init> (Ljava/lang/String;)V
   // 05a: lload 4
   // 05c: lstore 8
   // 05e: getstatic kotlin/text/Charsets.UTF_8 Ljava/nio/charset/Charset;
   // 061: astore 15
   // 063: lload 4
   // 065: lstore 8
   // 067: new java/io/InputStreamReader
   // 06a: astore 13
   // 06c: lload 4
   // 06e: lstore 8
   // 070: new java/io/FileInputStream
   // 073: astore 14
   // 075: lload 4
   // 077: lstore 8
   // 079: aload 14
   // 07b: aload 12
   // 07d: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
   // 080: lload 4
   // 082: lstore 8
   // 084: aload 13
   // 086: aload 14
   // 088: aload 15
   // 08a: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
   // 08d: lload 4
   // 08f: lstore 8
   // 091: new java/io/BufferedReader
   // 094: astore 12
   // 096: lload 4
   // 098: lstore 8
   // 09a: aload 12
   // 09c: aload 13
   // 09e: sipush 8192
   // 0a1: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;I)V
   // 0a4: lload 4
   // 0a6: lstore 10
   // 0a8: aload 12
   // 0aa: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
   // 0ad: astore 13
   // 0af: lload 4
   // 0b1: lstore 10
   // 0b3: aload 13
   // 0b5: ldc "readLine(...)"
   // 0b7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
   // 0ba: lload 4
   // 0bc: lstore 10
   // 0be: aload 13
   // 0c0: invokestatic kotlin/text/StringsKt.o (Ljava/lang/String;)Ljava/lang/Long;
   // 0c3: astore 13
   // 0c5: aload 13
   // 0c7: ifnull 0dd
   // 0ca: lload 4
   // 0cc: lstore 10
   // 0ce: aload 13
   // 0d0: invokevirtual java/lang/Long.longValue ()J
   // 0d3: lstore 8
   // 0d5: goto 0e0
   // 0d8: astore 13
   // 0da: goto 10a
   // 0dd: lconst_0
   // 0de: lstore 8
   // 0e0: lload 4
   // 0e2: lstore 6
   // 0e4: lload 8
   // 0e6: lload 4
   // 0e8: lcmp
   // 0e9: ifle 0f0
   // 0ec: lload 8
   // 0ee: lstore 6
   // 0f0: lload 6
   // 0f2: lstore 10
   // 0f4: getstatic kotlin/Unit.a Lkotlin/Unit;
   // 0f7: astore 13
   // 0f9: lload 6
   // 0fb: lstore 8
   // 0fd: aload 12
   // 0ff: aconst_null
   // 100: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
   // 103: lload 6
   // 105: lstore 4
   // 107: goto 121
   // 10a: aload 13
   // 10c: athrow
   // 10d: astore 14
   // 10f: lload 10
   // 111: lstore 8
   // 113: aload 12
   // 115: aload 13
   // 117: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
   // 11a: lload 10
   // 11c: lstore 8
   // 11e: aload 14
   // 120: athrow
   // 121: iinc 2 1
   // 124: goto 009
   // 127: lload 4
   // 129: lconst_0
   // 12a: lcmp
   // 12b: ifle 15e
   // 12e: lload 4
   // 130: l2d
   // 131: ldc2_w 1000000.0
   // 134: ddiv
   // 135: dstore 0
   // 136: getstatic kotlin/jvm/internal/StringCompanionObject.INSTANCE Lkotlin/jvm/internal/StringCompanionObject;
   // 139: astore 12
   // 13b: invokestatic java/util/Locale.getDefault ()Ljava/util/Locale;
   // 13e: ldc "%.2f"
   // 140: bipush 1
   // 141: anewarray 4
   // 144: dup
   // 145: bipush 0
   // 146: dload 0
   // 147: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
   // 14a: aastore
   // 14b: bipush 1
   // 14c: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
   // 14f: invokestatic java/lang/String.format (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   // 152: astore 12
   // 154: aload 12
   // 156: ldc "format(...)"
   // 158: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
   // 15b: goto 162
   // 15e: ldc ""
   // 160: astore 12
   // 162: aload 12
   // 164: areturn
   // 165: astore 12
   // 167: lload 8
   // 169: lstore 4
   // 16b: goto 121
}

internal fun ramSize(context: Context): String {
   var var4: ActivityManager = (ActivityManager)var0.getSystemService("activity");
   var4 = var4;
   val var3: MemoryInfo = new MemoryInfo();
   var4.getMemoryInfo(var3);
   val var1: Double = var3.totalMem / 1.0737418E9F;
   val var6: StringCompanionObject = StringCompanionObject.INSTANCE;
   val var7: java.lang.String = java.lang.String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{var1}, 1));
   return var7;
}

internal fun socName(): String {
   if (VERSION.SDK_INT >= 31) {
      var var0: java.lang.String = a.a();
      if (var0.length() == 0) {
         var0 = b.a();
         if (var0.length() == 0) {
            return getSocFromProcCpuInfo();
         }
      }

      val var2: java.lang.String = a.a();
      var0 = b.a();
      val var1: StringBuilder = new StringBuilder();
      var1.append(var2);
      var1.append("_");
      var1.append(var0);
      return var1.toString();
   } else {
      return getSocFromProcCpuInfo();
   }
}
