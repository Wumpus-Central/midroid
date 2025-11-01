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
         // 00: aload 1
         // 01: invokevirtual java/io/File.exists ()Z
         // 04: ifeq f6
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
         // 5c: if_icmpeq 85
         // 5f: iload 2
         // 60: iload 3
         // 61: iadd
         // 62: istore 2
         // 63: iload 2
         // 64: ldc 1048576
         // 66: if_icmple 6e
         // 69: aconst_null
         // 6a: astore 1
         // 6b: goto 8a
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
         // 80: astore 5
         // 82: goto e9
         // 85: aload 1
         // 86: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 89: astore 1
         // 8a: aload 4
         // 8c: aconst_null
         // 8d: invokestatic tt/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
         // 90: aload 1
         // 91: ifnull e7
         // 94: aload 1
         // 95: invokeinterface java/lang/CharSequence.length ()I 1
         // 9a: ifle e7
         // 9d: aload 1
         // 9e: bipush 1
         // 9f: newarray 5
         // a1: dup
         // a2: bipush 0
         // a3: bipush 32
         // a5: castore
         // a6: bipush 0
         // a7: bipush 0
         // a8: bipush 6
         // aa: aconst_null
         // ab: invokestatic kotlin/text/StringsKt.J0 (Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;
         // ae: astore 1
         // af: new com/discord/resource_usage/utils/ProcfsStats
         // b2: dup
         // b3: aload 1
         // b4: bipush 13
         // b6: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
         // bb: checkcast java/lang/String
         // be: lconst_0
         // bf: invokestatic tv/e.X (Ljava/lang/String;J)J
         // c2: aload 1
         // c3: bipush 14
         // c5: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
         // ca: checkcast java/lang/String
         // cd: lconst_0
         // ce: invokestatic tv/e.X (Ljava/lang/String;J)J
         // d1: ladd
         // d2: aload 1
         // d3: bipush 23
         // d5: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
         // da: checkcast java/lang/String
         // dd: lconst_0
         // de: invokestatic tv/e.X (Ljava/lang/String;J)J
         // e1: invokespecial com/discord/resource_usage/utils/ProcfsStats.<init> (JJ)V
         // e4: astore 1
         // e5: aload 1
         // e6: areturn
         // e7: aconst_null
         // e8: areturn
         // e9: aload 5
         // eb: athrow
         // ec: astore 1
         // ed: aload 4
         // ef: aload 5
         // f1: invokestatic tt/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
         // f4: aload 1
         // f5: athrow
         // f6: aconst_null
         // f7: areturn
         // f8: astore 1
         // f9: goto f6
      }

      public fun readStatFile(): ProcfsStats? {
         return this.parsePidStats(this.getStatFile());
      }
   }
}
