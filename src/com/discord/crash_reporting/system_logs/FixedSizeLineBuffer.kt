package com.discord.crash_reporting.system_logs

internal class FixedSizeLineBuffer(maxCharacterCount: Int) {
   private final val maxCharacterCount: Int
   private final val output: ArrayDeque<String>
   private final var outputLength: Int
   private final val sync: Any

   init {
      this.maxCharacterCount = var1;
      this.output = new ArrayDeque();
      this.sync = new Object();
   }

   public fun addLine(line: String) {
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
      // 01: ldc "line"
      // 03: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 06: aload 0
      // 07: getfield com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.sync Ljava/lang/Object;
      // 0a: astore 2
      // 0b: aload 2
      // 0c: monitorenter
      // 0d: aload 0
      // 0e: getfield com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.output Lkotlin/collections/ArrayDeque;
      // 11: aload 1
      // 12: invokevirtual kotlin/collections/ArrayDeque.add (Ljava/lang/Object;)Z
      // 15: pop
      // 16: aload 0
      // 17: aload 0
      // 18: getfield com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.outputLength I
      // 1b: aload 1
      // 1c: invokevirtual java/lang/String.length ()I
      // 1f: bipush 1
      // 20: iadd
      // 21: iadd
      // 22: putfield com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.outputLength I
      // 25: aload 0
      // 26: getfield com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.outputLength I
      // 29: aload 0
      // 2a: getfield com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.maxCharacterCount I
      // 2d: if_icmple 58
      // 30: aload 0
      // 31: getfield com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.output Lkotlin/collections/ArrayDeque;
      // 34: invokevirtual kotlin/collections/ArrayDeque.F ()Ljava/lang/Object;
      // 37: checkcast java/lang/String
      // 3a: astore 1
      // 3b: aload 1
      // 3c: ifnonnull 42
      // 3f: goto 58
      // 42: aload 0
      // 43: aload 0
      // 44: getfield com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.outputLength I
      // 47: aload 1
      // 48: invokevirtual java/lang/String.length ()I
      // 4b: bipush 1
      // 4c: isub
      // 4d: isub
      // 4e: putfield com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.outputLength I
      // 51: goto 25
      // 54: astore 1
      // 55: goto 5f
      // 58: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 5b: astore 1
      // 5c: aload 2
      // 5d: monitorexit
      // 5e: return
      // 5f: aload 2
      // 60: monitorexit
      // 61: aload 1
      // 62: athrow
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
      // 03: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 06: aload 0
      // 07: getfield com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.sync Ljava/lang/Object;
      // 0a: astore 2
      // 0b: aload 2
      // 0c: monitorenter
      // 0d: aload 0
      // 0e: getfield com/discord/crash_reporting/system_logs/FixedSizeLineBuffer.output Lkotlin/collections/ArrayDeque;
      // 11: invokevirtual java/util/AbstractCollection.iterator ()Ljava/util/Iterator;
      // 14: astore 3
      // 15: aload 3
      // 16: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b: ifeq 46
      // 1e: aload 1
      // 1f: aload 3
      // 20: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 25: checkcast java/lang/String
      // 28: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b: pop
      // 2c: aload 1
      // 2d: ldc "append(...)"
      // 2f: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 32: aload 1
      // 33: bipush 10
      // 35: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 38: pop
      // 39: aload 1
      // 3a: ldc "append(...)"
      // 3c: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 3f: goto 15
      // 42: astore 1
      // 43: goto 4d
      // 46: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 49: astore 1
      // 4a: aload 2
      // 4b: monitorexit
      // 4c: return
      // 4d: aload 2
      // 4e: monitorexit
      // 4f: aload 1
      // 50: athrow
   }
}
