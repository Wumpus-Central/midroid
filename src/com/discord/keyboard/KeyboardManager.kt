package com.discord.keyboard

import java.util.ArrayList
import kotlin.jvm.internal.q

public object KeyboardManager {
   private final val keyboardListeners: MutableList<KeyboardEvent> = new ArrayList()

   public fun addKeyboardListener(listener: KeyboardEvent) {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            q.h(var1, "listener");
            keyboardListeners.add(var1);
         } catch (var2: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1047)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.insertSemaphore(FinallyProcessor.java:340)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:100)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: getstatic com/discord/keyboard/KeyboardManager.keyboardListeners Ljava/util/List;
      // 05: checkcast java/lang/Iterable
      // 08: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 2
      // 0e: aload 2
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 2d
      // 17: aload 2
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast com/discord/keyboard/KeyboardEvent
      // 20: iload 1
      // 21: invokeinterface com/discord/keyboard/KeyboardEvent.onKeyboardStateChanged (Z)V 2
      // 26: goto 0e
      // 29: astore 2
      // 2a: goto 30
      // 2d: aload 0
      // 2e: monitorexit
      // 2f: return
      // 30: aload 0
      // 31: monitorexit
      // 32: aload 2
      // 33: athrow
   }

   public fun removeKeyboardListener(listener: KeyboardEvent) {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            q.h(var1, "listener");
            keyboardListeners.remove(var1);
         } catch (var2: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }
}
