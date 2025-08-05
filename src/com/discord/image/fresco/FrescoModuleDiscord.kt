package com.discord.image.fresco

import android.content.Context
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.modules.fresco.FrescoModule
import kotlin.jvm.internal.r

public class FrescoModuleDiscord(reactContext: ReactApplicationContext) : FrescoModule {
   init {
      r.h(var1, "reactContext");
      super(var1, false, null, 6, null);
      Companion.initializeFresco(var1);
      this.initializeSkinny();
   }

   private fun initializeSkinny() {
      this.getReactApplicationContext().addLifecycleEventListener(this);
   }

   public open fun canOverrideExistingModule(): Boolean {
      return true;
   }

   public companion object {
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
         // 05: ifne 1f
         // 08: getstatic com/facebook/react/modules/fresco/FrescoModule.Companion Lcom/facebook/react/modules/fresco/FrescoModule$Companion;
         // 0b: invokevirtual com/facebook/react/modules/fresco/FrescoModule$Companion.hasBeenInitialized ()Z
         // 0e: istore 1
         // 0f: iload 1
         // 10: ifeq 16
         // 13: goto 1f
         // 16: bipush 0
         // 17: istore 1
         // 18: goto 21
         // 1b: astore 2
         // 1c: goto 25
         // 1f: bipush 1
         // 20: istore 1
         // 21: aload 0
         // 22: monitorexit
         // 23: iload 1
         // 24: ireturn
         // 25: aload 0
         // 26: monitorexit
         // 27: aload 2
         // 28: athrow
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
         // 05: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
         // 08: aload 0
         // 09: invokespecial com/discord/image/fresco/FrescoModuleDiscord$Companion.isFrescoInitialized ()Z
         // 0c: ifne 29
         // 0f: bipush 1
         // 10: invokestatic com/discord/image/fresco/FrescoModuleDiscord.access$setFrescoExternallyInitialized$cp (Z)V
         // 13: aload 1
         // 14: aload 1
         // 15: invokestatic com/discord/image/fresco/config/FrescoConfigKt.frescoConfig (Landroid/content/Context;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig;
         // 18: invokestatic J2/d.c (Landroid/content/Context;Lcom/facebook/imagepipeline/core/ImagePipelineConfig;)V
         // 1b: getstatic com/discord/image/fresco/config/FrescoMemoryTrimmer.INSTANCE Lcom/discord/image/fresco/config/FrescoMemoryTrimmer;
         // 1e: aload 1
         // 1f: invokevirtual com/discord/image/fresco/config/FrescoMemoryTrimmer.initialize (Landroid/content/Context;)V
         // 22: goto 29
         // 25: astore 1
         // 26: goto 2c
         // 29: aload 0
         // 2a: monitorexit
         // 2b: return
         // 2c: aload 0
         // 2d: monitorexit
         // 2e: aload 1
         // 2f: athrow
      }
   }
}
