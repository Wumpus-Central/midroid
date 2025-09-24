package com.discord.image.fresco

import G2.d
import android.content.Context
import com.discord.image.fresco.config.FrescoConfigKt
import com.discord.image.fresco.config.FrescoMemoryTrimmer
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.modules.fresco.FrescoModule
import java.util.concurrent.CountDownLatch

public class FrescoModuleDiscord(reactContext: ReactApplicationContext) : FrescoModule(var1, false, null, 6) {
   init {
      Companion.initializeFresco(var1);
      FrescoMemoryTrimmer.INSTANCE.initialize(var1);
      this.initializeSkinny();
   }

   private fun initializeSkinny() {
      this.getReactApplicationContext().addLifecycleEventListener(this);
   }

   public open fun canOverrideExistingModule(): Boolean {
      return true;
   }

   public companion object {
      private final val initLatch: CountDownLatch
      private final var asyncInitStarted: Boolean
      private final var isFrescoExternallyInitialized: Boolean

      private fun isFrescoInitialized(): Boolean {
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
         // 02: invokestatic com/discord/image/fresco/FrescoModuleDiscord.access$isFrescoExternallyInitialized$cp ()Z
         // 05: ifne 1c
         // 08: invokestatic com/discord/image/fresco/FrescoModuleDiscord.access$getAsyncInitStarted$cp ()Z
         // 0b: istore 1
         // 0c: iload 1
         // 0d: ifeq 13
         // 10: goto 1c
         // 13: bipush 0
         // 14: istore 1
         // 15: goto 1e
         // 18: astore 2
         // 19: goto 22
         // 1c: bipush 1
         // 1d: istore 1
         // 1e: aload 0
         // 1f: monitorexit
         // 20: iload 1
         // 21: ireturn
         // 22: aload 0
         // 23: monitorexit
         // 24: aload 2
         // 25: athrow
      }

      private fun performInit(context: Context) {
         d.c(var1, FrescoConfigKt.frescoConfig(var1));
      }

      @JvmStatic
      fun `startFrescoInitializationAsync$lambda$1`(var0: Context): Unit {
         label10: {
            try {
               FrescoModuleDiscord.Companion.performInit(var0);
            } catch (var1: java.lang.Throwable) {
               FrescoModuleDiscord.access$getInitLatch$cp().countDown();
            }

            FrescoModuleDiscord.access$getInitLatch$cp().countDown();
         }
      }

      public fun initializeFresco(context: Context) {
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
         // 03: ldc "context"
         // 05: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
         // 08: aload 0
         // 09: invokespecial com/discord/image/fresco/FrescoModuleDiscord$Companion.isFrescoInitialized ()Z
         // 0c: ifeq 25
         // 0f: invokestatic com/discord/image/fresco/FrescoModuleDiscord.access$getAsyncInitStarted$cp ()Z
         // 12: ifeq 22
         // 15: invokestatic com/discord/image/fresco/FrescoModuleDiscord.access$getInitLatch$cp ()Ljava/util/concurrent/CountDownLatch;
         // 18: invokevirtual java/util/concurrent/CountDownLatch.await ()V
         // 1b: goto 22
         // 1e: astore 1
         // 1f: goto 40
         // 22: aload 0
         // 23: monitorexit
         // 24: return
         // 25: bipush 1
         // 26: invokestatic com/discord/image/fresco/FrescoModuleDiscord.access$setFrescoExternallyInitialized$cp (Z)V
         // 29: aload 0
         // 2a: aload 1
         // 2b: invokespecial com/discord/image/fresco/FrescoModuleDiscord$Companion.performInit (Landroid/content/Context;)V
         // 2e: invokestatic com/discord/image/fresco/FrescoModuleDiscord.access$getInitLatch$cp ()Ljava/util/concurrent/CountDownLatch;
         // 31: invokevirtual java/util/concurrent/CountDownLatch.countDown ()V
         // 34: aload 0
         // 35: monitorexit
         // 36: return
         // 37: astore 1
         // 38: invokestatic com/discord/image/fresco/FrescoModuleDiscord.access$getInitLatch$cp ()Ljava/util/concurrent/CountDownLatch;
         // 3b: invokevirtual java/util/concurrent/CountDownLatch.countDown ()V
         // 3e: aload 1
         // 3f: athrow
         // 40: aload 0
         // 41: monitorexit
         // 42: aload 1
         // 43: athrow
      }

      public fun startFrescoInitializationAsync(context: Context) {
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
         // 01: ldc "context"
         // 03: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
         // 06: aload 0
         // 07: monitorenter
         // 08: invokestatic com/discord/image/fresco/FrescoModuleDiscord.access$getAsyncInitStarted$cp ()Z
         // 0b: istore 2
         // 0c: iload 2
         // 0d: ifeq 13
         // 10: aload 0
         // 11: monitorexit
         // 12: return
         // 13: bipush 1
         // 14: invokestatic com/discord/image/fresco/FrescoModuleDiscord.access$setAsyncInitStarted$cp (Z)V
         // 17: getstatic kotlin/Unit.a Lkotlin/Unit;
         // 1a: astore 3
         // 1b: aload 0
         // 1c: monitorexit
         // 1d: bipush 1
         // 1e: bipush 0
         // 1f: aconst_null
         // 20: ldc "FrescoInitThread"
         // 22: bipush 0
         // 23: new com/discord/image/fresco/a
         // 26: dup
         // 27: aload 1
         // 28: invokespecial com/discord/image/fresco/a.<init> (Landroid/content/Context;)V
         // 2b: bipush 22
         // 2d: aconst_null
         // 2e: invokestatic F9/a.b (ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;
         // 31: pop
         // 32: return
         // 33: astore 1
         // 34: aload 0
         // 35: monitorexit
         // 36: aload 1
         // 37: athrow
      }
   }
}
