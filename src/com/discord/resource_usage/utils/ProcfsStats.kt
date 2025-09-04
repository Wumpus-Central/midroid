package com.discord.resource_usage.utils

import android.os.Process
import java.io.File
import kotlin.jvm.internal.SourceDebugExtension

internal data class ProcfsStats(totalTime: Long, rssPages: Long) {
   public final val totalTime: Long
   public final val rssPages: Long

   init {
      this.totalTime = var1;
      this.rssPages = var3;
   }

   @JvmStatic
   fun `readBuffer$lambda$1`(): CharArray {
      return new char[1024];
   }

   @JvmStatic
   fun `statFile_delegate$lambda$0`(): File {
      val var0: Int = Process.myPid();
      val var1: StringBuilder = new StringBuilder();
      var1.append("/proc/");
      var1.append(var0);
      var1.append("/stat");
      return new File(var1.toString());
   }

   public operator fun component1(): Long {
      return this.totalTime;
   }

   public operator fun component2(): Long {
      return this.rssPages;
   }

   public fun copy(totalTime: Long = var0.totalTime, rssPages: Long = var0.rssPages): ProcfsStats {
      return new ProcfsStats(var1, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ProcfsStats) {
         return false;
      } else {
         var1 = var1;
         if (this.totalTime != var1.totalTime) {
            return false;
         } else {
            return this.rssPages == var1.rssPages;
         }
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Long.hashCode(this.totalTime) * 31 + java.lang.Long.hashCode(this.rssPages);
   }

   public override fun toString(): String {
      val var3: Long = this.totalTime;
      val var1: Long = this.rssPages;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ProcfsStats(totalTime=");
      var5.append(var3);
      var5.append(", rssPages=");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
   }

   @SourceDebugExtension(["SMAP\nProcfsStats.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcfsStats.kt\ncom/discord/resource_usage/utils/ProcfsStats$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"])
   public companion object {
      private final val statFile: File
         private final get() {
            return ProcfsStats.access$getStatFile$delegate$cp().getValue() as File;
         }


      private final val readBuffer: ThreadLocal<CharArray>

      private fun File.parsePidStats(): ProcfsStats? {
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
         // 000: aconst_null
         // 001: astore 11
         // 003: aload 11
         // 005: astore 10
         // 007: aload 1
         // 008: invokevirtual java/io/File.exists ()Z
         // 00b: ifeq 112
         // 00e: getstatic kotlin/text/Charsets.UTF_8 Ljava/nio/charset/Charset;
         // 011: astore 10
         // 013: new java/io/InputStreamReader
         // 016: astore 12
         // 018: new java/io/FileInputStream
         // 01b: astore 13
         // 01d: aload 13
         // 01f: aload 1
         // 020: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
         // 023: aload 12
         // 025: aload 13
         // 027: aload 10
         // 029: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
         // 02c: new java/io/BufferedReader
         // 02f: astore 10
         // 031: aload 10
         // 033: aload 12
         // 035: sipush 8192
         // 038: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;I)V
         // 03b: new java/lang/StringBuilder
         // 03e: astore 1
         // 03f: aload 1
         // 040: invokespecial java/lang/StringBuilder.<init> ()V
         // 043: invokestatic com/discord/resource_usage/utils/ProcfsStats.access$getReadBuffer$cp ()Ljava/lang/ThreadLocal;
         // 046: invokevirtual java/lang/ThreadLocal.get ()Ljava/lang/Object;
         // 049: astore 12
         // 04b: aload 12
         // 04d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
         // 050: aload 12
         // 052: checkcast [C
         // 055: astore 12
         // 057: bipush 0
         // 058: istore 2
         // 059: aload 10
         // 05b: aload 12
         // 05d: invokevirtual java/io/Reader.read ([C)I
         // 060: istore 3
         // 061: iload 3
         // 062: bipush -1
         // 063: if_icmpeq 08c
         // 066: iload 2
         // 067: iload 3
         // 068: iadd
         // 069: istore 2
         // 06a: iload 2
         // 06b: ldc 1048576
         // 06d: if_icmple 075
         // 070: aconst_null
         // 071: astore 1
         // 072: goto 091
         // 075: aload 1
         // 076: aload 12
         // 078: bipush 0
         // 079: iload 3
         // 07a: invokevirtual java/lang/StringBuilder.append ([CII)Ljava/lang/StringBuilder;
         // 07d: pop
         // 07e: aload 1
         // 07f: ldc "append(...)"
         // 081: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 084: goto 059
         // 087: astore 12
         // 089: goto 105
         // 08c: aload 1
         // 08d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 090: astore 1
         // 091: aload 10
         // 093: aconst_null
         // 094: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
         // 097: aload 11
         // 099: astore 10
         // 09b: aload 1
         // 09c: ifnull 112
         // 09f: aload 11
         // 0a1: astore 10
         // 0a3: aload 1
         // 0a4: invokeinterface java/lang/CharSequence.length ()I 1
         // 0a9: ifle 112
         // 0ac: aload 1
         // 0ad: bipush 1
         // 0ae: newarray 5
         // 0b0: dup
         // 0b1: bipush 0
         // 0b2: bipush 32
         // 0b4: castore
         // 0b5: bipush 0
         // 0b6: bipush 0
         // 0b7: bipush 6
         // 0b9: aconst_null
         // 0ba: invokestatic kotlin/text/StringsKt.A0 (Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;
         // 0bd: astore 1
         // 0be: aload 1
         // 0bf: bipush 13
         // 0c1: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
         // 0c6: checkcast java/lang/String
         // 0c9: lconst_0
         // 0ca: invokestatic Jb/c.T (Ljava/lang/String;J)J
         // 0cd: lstore 6
         // 0cf: aload 1
         // 0d0: bipush 14
         // 0d2: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
         // 0d7: checkcast java/lang/String
         // 0da: lconst_0
         // 0db: invokestatic Jb/c.T (Ljava/lang/String;J)J
         // 0de: lstore 8
         // 0e0: aload 1
         // 0e1: bipush 23
         // 0e3: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
         // 0e8: checkcast java/lang/String
         // 0eb: lconst_0
         // 0ec: invokestatic Jb/c.T (Ljava/lang/String;J)J
         // 0ef: lstore 4
         // 0f1: new com/discord/resource_usage/utils/ProcfsStats
         // 0f4: astore 10
         // 0f6: aload 10
         // 0f8: lload 6
         // 0fa: lload 8
         // 0fc: ladd
         // 0fd: lload 4
         // 0ff: invokespecial com/discord/resource_usage/utils/ProcfsStats.<init> (JJ)V
         // 102: goto 112
         // 105: aload 12
         // 107: athrow
         // 108: astore 1
         // 109: aload 10
         // 10b: aload 12
         // 10d: invokestatic L9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
         // 110: aload 1
         // 111: athrow
         // 112: aload 10
         // 114: areturn
         // 115: astore 1
         // 116: aload 11
         // 118: astore 10
         // 11a: goto 112
      }

      public fun readStatFile(): ProcfsStats? {
         return this.parsePidStats(this.getStatFile());
      }
   }
}
