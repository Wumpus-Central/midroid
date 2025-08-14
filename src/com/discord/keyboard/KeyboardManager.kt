package com.discord.keyboard

import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nKeyboardManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardManager.kt\ncom/discord/keyboard/KeyboardManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1863#2,2:25\n*S KotlinDebug\n*F\n+ 1 KeyboardManager.kt\ncom/discord/keyboard/KeyboardManager\n*L\n20#1:25,2\n*E\n"])
public object KeyboardManager {
   private final val keyboardListeners: MutableList<KeyboardEvent> = new ArrayList()

   public fun addKeyboardListener(listener: KeyboardEvent) {
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
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc "listener"
      // 05: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 08: getstatic com/discord/keyboard/KeyboardManager.keyboardListeners Ljava/util/List;
      // 0b: aload 1
      // 0c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 11: pop
      // 12: aload 0
      // 13: monitorexit
      // 14: return
      // 15: astore 1
      // 16: aload 0
      // 17: monitorexit
      // 18: aload 1
      // 19: athrow
   }

   internal fun onKeyboardChanged(opened: Boolean) {
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
      // 00: aload 0
      // 01: monitorenter
      // 02: getstatic com/discord/keyboard/KeyboardManager.keyboardListeners Ljava/util/List;
      // 05: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0a: astore 2
      // 0b: aload 2
      // 0c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11: ifeq 2a
      // 14: aload 2
      // 15: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a: checkcast com/discord/keyboard/KeyboardEvent
      // 1d: iload 1
      // 1e: invokeinterface com/discord/keyboard/KeyboardEvent.onKeyboardStateChanged (Z)V 2
      // 23: goto 0b
      // 26: astore 2
      // 27: goto 2d
      // 2a: aload 0
      // 2b: monitorexit
      // 2c: return
      // 2d: aload 0
      // 2e: monitorexit
      // 2f: aload 2
      // 30: athrow
   }

   public fun removeKeyboardListener(listener: KeyboardEvent) {
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
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc "listener"
      // 05: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 08: getstatic com/discord/keyboard/KeyboardManager.keyboardListeners Ljava/util/List;
      // 0b: aload 1
      // 0c: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 11: pop
      // 12: aload 0
      // 13: monitorexit
      // 14: return
      // 15: astore 1
      // 16: aload 0
      // 17: monitorexit
      // 18: aload 1
      // 19: athrow
   }
}
