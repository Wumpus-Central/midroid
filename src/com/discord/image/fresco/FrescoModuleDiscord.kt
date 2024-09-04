package com.discord.image.fresco

import android.content.Context
import com.discord.image.fresco.config.FrescoConfigKt
import com.discord.image.fresco.config.FrescoMemoryTrimmer
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.modules.fresco.FrescoModule
import kotlin.jvm.internal.r
import l4.c

public class FrescoModuleDiscord(reactContext: ReactApplicationContext) : FrescoModule {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   private fun initializeSkinny() {
      this.getReactApplicationContext().addLifecycleEventListener(this);
   }

   public open fun canOverrideExistingModule(): Boolean {
      return true;
   }

   public open fun initialize() {
      val var2: FrescoModuleDiscord.Companion = Companion;
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var1, "reactApplicationContext");
      var2.initializeFresco(var1);
      this.initializeSkinny();
   }

   public companion object {
      private final var isFrescoExternallyInitialized: Boolean

      private fun isFrescoInitialized(): Boolean {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
         //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
         //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
         //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
         //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
         //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
         //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.initExprents(IfStatement.java:276)
         //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.initStatementExprents(ExprProcessor.java:189)
         //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.initStatementExprents(ExprProcessor.java:192)
         //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.initStatementExprents(ExprProcessor.java:192)
         //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.initStatementExprents(ExprProcessor.java:192)
         //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.initStatementExprents(ExprProcessor.java:192)
         //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.initStatementExprents(ExprProcessor.java:192)
         //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.initStatementExprents(ExprProcessor.java:192)
         //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processStatement(ExprProcessor.java:148)
         //
         // Bytecode:
         // 00: aload 0
         // 01: monitorenter
         // 02: invokestatic com/discord/image/fresco/FrescoModuleDiscord.access$isFrescoExternallyInitialized$cp ()Z
         // 05: ifne 18
         // 08: invokestatic com/facebook/react/modules/fresco/FrescoModule.hasBeenInitialized ()Z
         // 0b: istore 1
         // 0c: iload 1
         // 0d: ifeq 13
         // 10: goto 18
         // 13: bipush 0
         // 14: istore 1
         // 15: goto 1a
         // 18: bipush 1
         // 19: istore 1
         // 1a: aload 0
         // 1b: monitorexit
         // 1c: iload 1
         // 1d: ireturn
         // 1e: astore 2
         // 1f: aload 0
         // 20: monitorexit
         // 21: aload 2
         // 22: athrow
      }

      public fun initializeFresco(context: Context) {
         label17: {
            synchronized (this){} // $VF: monitorenter 

            try {
               r.h(var1, "context");
               if (!this.isFrescoInitialized()) {
                  FrescoModuleDiscord.access$setFrescoExternallyInitialized$cp(true);
                  c.c(var1, FrescoConfigKt.frescoConfig(var1));
                  FrescoMemoryTrimmer.INSTANCE.initialize(var1);
               }
            } catch (var2: java.lang.Throwable) {
               // $VF: monitorexit
            }

            // $VF: monitorexit
         }
      }
   }
}
