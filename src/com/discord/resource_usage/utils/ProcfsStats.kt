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
      val var1: Long = this.totalTime;
      val var3: Long = this.rssPages;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ProcfsStats(totalTime=");
      var5.append(var1);
      var5.append(", rssPages=");
      var5.append(var3);
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
         // 00: aload 1
         // 01: invokevirtual java/io/File.exists ()Z
         // 04: ifeq f5
         // 07: getstatic kotlin/text/Charsets.UTF_8 Ljava/nio/charset/Charset;
         // 0a: astore 6
         // 0c: new java/io/InputStreamReader
         // 0f: astore 5
         // 11: new java/io/FileInputStream
         // 14: astore 4
         // 16: aload 4
         // 18: aload 1
         // 19: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
         // 1c: aload 5
         // 1e: aload 4
         // 20: aload 6
         // 22: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
         // 25: new java/io/BufferedReader
         // 28: astore 4
         // 2a: aload 4
         // 2c: aload 5
         // 2e: sipush 8192
         // 31: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;I)V
         // 34: new java/lang/StringBuilder
         // 37: astore 1
         // 38: aload 1
         // 39: invokespecial java/lang/StringBuilder.<init> ()V
         // 3c: invokestatic com/discord/resource_usage/utils/ProcfsStats.access$getReadBuffer$cp ()Ljava/lang/ThreadLocal;
         // 3f: invokevirtual java/lang/ThreadLocal.get ()Ljava/lang/Object;
         // 42: astore 5
         // 44: aload 5
         // 46: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
         // 49: aload 5
         // 4b: checkcast [C
         // 4e: astore 5
         // 50: bipush 0
         // 51: istore 2
         // 52: aload 4
         // 54: aload 5
         // 56: invokevirtual java/io/Reader.read ([C)I
         // 59: istore 3
         // 5a: iload 3
         // 5b: bipush -1
         // 5c: if_icmpeq 84
         // 5f: iload 2
         // 60: iload 3
         // 61: iadd
         // 62: istore 2
         // 63: iload 2
         // 64: ldc 1048576
         // 66: if_icmple 6e
         // 69: aconst_null
         // 6a: astore 1
         // 6b: goto 89
         // 6e: aload 1
         // 6f: aload 5
         // 71: bipush 0
         // 72: iload 3
         // 73: invokevirtual java/lang/StringBuilder.append ([CII)Ljava/lang/StringBuilder;
         // 76: pop
         // 77: aload 1
         // 78: ldc "append(...)"
         // 7a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 7d: goto 52
         // 80: astore 1
         // 81: goto e8
         // 84: aload 1
         // 85: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 88: astore 1
         // 89: aload 4
         // 8b: aconst_null
         // 8c: invokestatic pm/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
         // 8f: aload 1
         // 90: ifnull e6
         // 93: aload 1
         // 94: invokeinterface java/lang/CharSequence.length ()I 1
         // 99: ifle e6
         // 9c: aload 1
         // 9d: bipush 1
         // 9e: newarray 5
         // a0: dup
         // a1: bipush 0
         // a2: bipush 32
         // a4: castore
         // a5: bipush 0
         // a6: bipush 0
         // a7: bipush 6
         // a9: aconst_null
         // aa: invokestatic kotlin/text/StringsKt.A0 (Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;
         // ad: astore 1
         // ae: new com/discord/resource_usage/utils/ProcfsStats
         // b1: dup
         // b2: aload 1
         // b3: bipush 13
         // b5: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
         // ba: checkcast java/lang/String
         // bd: lconst_0
         // be: invokestatic pq/c.T (Ljava/lang/String;J)J
         // c1: aload 1
         // c2: bipush 14
         // c4: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
         // c9: checkcast java/lang/String
         // cc: lconst_0
         // cd: invokestatic pq/c.T (Ljava/lang/String;J)J
         // d0: ladd
         // d1: aload 1
         // d2: bipush 23
         // d4: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
         // d9: checkcast java/lang/String
         // dc: lconst_0
         // dd: invokestatic pq/c.T (Ljava/lang/String;J)J
         // e0: invokespecial com/discord/resource_usage/utils/ProcfsStats.<init> (JJ)V
         // e3: astore 1
         // e4: aload 1
         // e5: areturn
         // e6: aconst_null
         // e7: areturn
         // e8: aload 1
         // e9: athrow
         // ea: astore 5
         // ec: aload 4
         // ee: aload 1
         // ef: invokestatic pm/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
         // f2: aload 5
         // f4: athrow
         // f5: aconst_null
         // f6: areturn
         // f7: astore 1
         // f8: goto f5
      }

      public fun readStatFile(): ProcfsStats? {
         return this.parsePidStats(this.getStatFile());
      }
   }
}
