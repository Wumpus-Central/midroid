package com.discord.misc.utilities.collections

import ht.v
import java.nio.charset.Charset
import java.util.Arrays
import java.util.Locale
import kotlin.jvm.internal.StringCompanionObject

public class CircularByteBuffer(maxByteCount: Int) {
   private final val maxByteCount: Int
   private final val buffer: ByteArray
   private final var head: Int
   private final var tail: Int
   private final var size: Int
   private final var isEmpty: Boolean
   private final val lines: ArrayDeque<Pair<Int, Int>>
   private final val sync: Any
   private final val newlineByte: Byte

   init {
      this.maxByteCount = var1;
      this.buffer = new byte[var1];
      this.isEmpty = true;
      this.lines = new ArrayDeque();
      this.sync = new Object();
      this.newlineByte = 10;
   }

   private fun addLineBytes(lineBytes: ByteArray) {
      val var2: Int = var1.length + 1;
      this.makeSpace(var1.length + 1);
      val var3: Int = this.tail;
      this.writeBytes(var1);
      this.writeByte(this.newlineByte);
      this.lines.addLast(v.a(var3, var1.length));
      this.size += var2;
      this.isEmpty = false;
   }

   private fun makeSpace(needed: Int) {
      while (this.size + var1 > this.maxByteCount && !this.lines.isEmpty()) {
         this.removeFrontLine();
      }
   }

   private fun readLine(start: Int, length: Int): String {
      if (var1 + var2 <= this.buffer.length) {
         return new java.lang.String(this.buffer, var1, var2, CHARSET);
      } else {
         val var3: Int = this.buffer.length - var1;
         val var5: ByteArray = new byte[var2];
         System.arraycopy(this.buffer, var1, var5, 0, var3);
         System.arraycopy(this.buffer, 0, var5, var3, var2 - var3);
         return new java.lang.String(var5, CHARSET);
      }
   }

   private fun removeFrontLine() {
      if (!this.lines.isEmpty()) {
         val var1: Int = ((this.lines.removeFirst() as Pair).b() as java.lang.Number).intValue() + 1;
         this.head = (this.head + var1) % this.buffer.length;
         val var2: Int = this.size - var1;
         this.size -= var1;
         if (var2 == 0) {
            this.isEmpty = true;
            this.head = 0;
            this.tail = 0;
         }
      }
   }

   private fun writeByte(byte: Byte) {
      this.buffer[this.tail] = var1;
      this.tail = (this.tail + 1) % this.buffer.length;
   }

   private fun writeBytes(bytes: ByteArray) {
      val var3: Int = var1.length;

      for (int var2 = 0; var2 < var3; var2++) {
         this.writeByte(var1[var2]);
      }
   }

   public fun addLine(line: String) {
      label13: {
         val var2: Any = this.sync;
         synchronized (this.sync){} // $VF: monitorenter 

         try {
            val var5: ByteArray = var1.getBytes(CHARSET);
            this.addLineBytes(var5);
         } catch (var3: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public fun appendString(sb: StringBuilder) {
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
      // 00: aload 1
      // 01: ldc "sb"
      // 03: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 06: aload 0
      // 07: getfield com/discord/misc/utilities/collections/CircularByteBuffer.sync Ljava/lang/Object;
      // 0a: astore 2
      // 0b: aload 2
      // 0c: monitorenter
      // 0d: aload 0
      // 0e: getfield com/discord/misc/utilities/collections/CircularByteBuffer.lines Lkotlin/collections/ArrayDeque;
      // 11: invokevirtual java/util/AbstractCollection.iterator ()Ljava/util/Iterator;
      // 14: astore 3
      // 15: aload 3
      // 16: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b: ifeq 62
      // 1e: aload 3
      // 1f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 24: checkcast kotlin/Pair
      // 27: astore 4
      // 29: aload 1
      // 2a: aload 0
      // 2b: aload 4
      // 2d: invokevirtual kotlin/Pair.a ()Ljava/lang/Object;
      // 30: checkcast java/lang/Number
      // 33: invokevirtual java/lang/Number.intValue ()I
      // 36: aload 4
      // 38: invokevirtual kotlin/Pair.b ()Ljava/lang/Object;
      // 3b: checkcast java/lang/Number
      // 3e: invokevirtual java/lang/Number.intValue ()I
      // 41: invokespecial com/discord/misc/utilities/collections/CircularByteBuffer.readLine (II)Ljava/lang/String;
      // 44: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 47: pop
      // 48: aload 1
      // 49: ldc "append(...)"
      // 4b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 4e: aload 1
      // 4f: bipush 10
      // 51: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 54: pop
      // 55: aload 1
      // 56: ldc "append(...)"
      // 58: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 5b: goto 15
      // 5e: astore 1
      // 5f: goto 69
      // 62: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 65: astore 1
      // 66: aload 2
      // 67: monitorexit
      // 68: return
      // 69: aload 2
      // 6a: monitorexit
      // 6b: aload 1
      // 6c: athrow
   }

   public fun clear() {
      label13: {
         val var1: Any = this.sync;
         synchronized (this.sync){} // $VF: monitorenter 

         try {
            this.head = 0;
            this.tail = 0;
            this.size = 0;
            this.isEmpty = true;
            this.lines.clear();
         } catch (var3: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public fun getStats(): com.discord.misc.utilities.collections.CircularByteBuffer.BufferStats {
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
      // 00: aload 0
      // 01: getfield com/discord/misc/utilities/collections/CircularByteBuffer.sync Ljava/lang/Object;
      // 04: astore 5
      // 06: aload 5
      // 08: monitorenter
      // 09: aload 0
      // 0a: getfield com/discord/misc/utilities/collections/CircularByteBuffer.lines Lkotlin/collections/ArrayDeque;
      // 0d: invokevirtual kotlin/collections/h.size ()I
      // 10: istore 3
      // 11: aload 0
      // 12: getfield com/discord/misc/utilities/collections/CircularByteBuffer.size I
      // 15: istore 4
      // 17: aload 0
      // 18: getfield com/discord/misc/utilities/collections/CircularByteBuffer.maxByteCount I
      // 1b: istore 2
      // 1c: iload 2
      // 1d: ifle 2a
      // 20: iload 4
      // 22: i2f
      // 23: iload 2
      // 24: i2f
      // 25: fdiv
      // 26: fstore 1
      // 27: goto 2f
      // 2a: fconst_0
      // 2b: fstore 1
      // 2c: goto 27
      // 2f: new com/discord/misc/utilities/collections/CircularByteBuffer$BufferStats
      // 32: dup
      // 33: iload 3
      // 34: iload 4
      // 36: iload 2
      // 37: fload 1
      // 38: aload 0
      // 39: getfield com/discord/misc/utilities/collections/CircularByteBuffer.head I
      // 3c: aload 0
      // 3d: getfield com/discord/misc/utilities/collections/CircularByteBuffer.tail I
      // 40: invokespecial com/discord/misc/utilities/collections/CircularByteBuffer$BufferStats.<init> (IIIFII)V
      // 43: astore 6
      // 45: aload 5
      // 47: monitorexit
      // 48: aload 6
      // 4a: areturn
      // 4b: astore 6
      // 4d: aload 5
      // 4f: monitorexit
      // 50: aload 6
      // 52: athrow
   }

   public data class BufferStats(linesCount: Int, bytesUsed: Int, bytesCapacity: Int, memoryEfficiency: Float, headPosition: Int, tailPosition: Int) {
      public final val linesCount: Int
      public final val bytesUsed: Int
      public final val bytesCapacity: Int
      public final val memoryEfficiency: Float
      public final val headPosition: Int
      public final val tailPosition: Int

      init {
         this.linesCount = var1;
         this.bytesUsed = var2;
         this.bytesCapacity = var3;
         this.memoryEfficiency = var4;
         this.headPosition = var5;
         this.tailPosition = var6;
      }

      public operator fun component1(): Int {
         return this.linesCount;
      }

      public operator fun component2(): Int {
         return this.bytesUsed;
      }

      public operator fun component3(): Int {
         return this.bytesCapacity;
      }

      public operator fun component4(): Float {
         return this.memoryEfficiency;
      }

      public operator fun component5(): Int {
         return this.headPosition;
      }

      public operator fun component6(): Int {
         return this.tailPosition;
      }

      public fun copy(
         linesCount: Int = var0.linesCount,
         bytesUsed: Int = var0.bytesUsed,
         bytesCapacity: Int = var0.bytesCapacity,
         memoryEfficiency: Float = var0.memoryEfficiency,
         headPosition: Int = var0.headPosition,
         tailPosition: Int = var0.tailPosition
      ): com.discord.misc.utilities.collections.CircularByteBuffer.BufferStats {
         return new CircularByteBuffer.BufferStats(var1, var2, var3, var4, var5, var6);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is CircularByteBuffer.BufferStats) {
            return false;
         } else {
            var1 = var1;
            if (this.linesCount != var1.linesCount) {
               return false;
            } else if (this.bytesUsed != var1.bytesUsed) {
               return false;
            } else if (this.bytesCapacity != var1.bytesCapacity) {
               return false;
            } else if (java.lang.Float.compare(this.memoryEfficiency, var1.memoryEfficiency) != 0) {
               return false;
            } else if (this.headPosition != var1.headPosition) {
               return false;
            } else {
               return this.tailPosition == var1.tailPosition;
            }
         }
      }

      public override fun hashCode(): Int {
         return (
                  (
                           ((Integer.hashCode(this.linesCount) * 31 + Integer.hashCode(this.bytesUsed)) * 31 + Integer.hashCode(this.bytesCapacity)) * 31
                              + java.lang.Float.hashCode(this.memoryEfficiency)
                        )
                        * 31
                     + Integer.hashCode(this.headPosition)
               )
               * 31
            + Integer.hashCode(this.tailPosition);
      }

      public override fun toString(): String {
         val var5: Int = this.linesCount;
         val var1: Int = this.bytesUsed;
         val var4: Int = this.bytesCapacity;
         val var6: StringCompanionObject = StringCompanionObject.INSTANCE;
         val var7: java.lang.String = java.lang.String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{this.memoryEfficiency * (float)100}, 1));
         val var3: Int = this.headPosition;
         val var2: Int = this.tailPosition;
         val var8: StringBuilder = new StringBuilder();
         var8.append("BufferStats(lines=");
         var8.append(var5);
         var8.append(", used=");
         var8.append(var1);
         var8.append("B/");
         var8.append(var4);
         var8.append("B (");
         var8.append(var7);
         var8.append("%), head=");
         var8.append(var3);
         var8.append(", tail=");
         var8.append(var2);
         var8.append(")");
         return var8.toString();
      }
   }

   public companion object {
      private final val CHARSET: Charset
   }
}
