package com.discord.react

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import com.discord.misc.utilities.size.SizeUtilsKt
import kotlin.jvm.internal.q
import kotlin.properties.a

public object FontManager {
   private const val FONT_SCALE_CHAT_CLASSIC_DEFAULT: Boolean = false
   private const val FONT_SCALE_CHAT_CLASSIC_KEY: String = "FONT_SCALE_CHAT_CLASSIC_KEY"
   private const val FONT_SCALE_KEY: String = "FONT_SCALE_KEY"

   private final var initialFontSize: Float by a.a.a()
      private final get() {
         return (initialFontSize$delegate.getValue(this, $$delegatedProperties[0]) as java.lang.Number).floatValue();
      }

      private final set(<set-?>) {
         initialFontSize$delegate.setValue(this, $$delegatedProperties[0], var1);
      }


   private fun Context.getCache(): SharedPreferences {
      return var1.getSharedPreferences("FontScaleManager", 0);
   }

   public fun getFontScale(context: Context): Float {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            q.h(var1, "context");
            val var2: Float = this.getCache(var1).getFloat("FONT_SCALE_KEY", 1.0F);
         } catch (var3: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public fun getIsClassicChatFontScaleEnabled(context: Context): Boolean {
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
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc "context"
      // 05: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 08: aload 0
      // 09: aload 1
      // 0a: invokespecial com/discord/react/FontManager.getCache (Landroid/content/Context;)Landroid/content/SharedPreferences;
      // 0d: ldc "FONT_SCALE_CHAT_CLASSIC_KEY"
      // 0f: invokeinterface android/content/SharedPreferences.contains (Ljava/lang/String;)Z 2
      // 14: ifne 47
      // 17: aload 0
      // 18: aload 1
      // 19: invokespecial com/discord/react/FontManager.getCache (Landroid/content/Context;)Landroid/content/SharedPreferences;
      // 1c: astore 3
      // 1d: aload 3
      // 1e: ldc "getCache(...)"
      // 20: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 23: aload 3
      // 24: invokeinterface android/content/SharedPreferences.edit ()Landroid/content/SharedPreferences$Editor; 1
      // 29: astore 3
      // 2a: aload 3
      // 2b: ldc "editor"
      // 2d: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 30: aload 3
      // 31: ldc "FONT_SCALE_CHAT_CLASSIC_KEY"
      // 33: bipush 0
      // 34: invokeinterface android/content/SharedPreferences$Editor.putBoolean (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor; 3
      // 39: pop
      // 3a: aload 3
      // 3b: invokeinterface android/content/SharedPreferences$Editor.apply ()V 1
      // 40: goto 47
      // 43: astore 1
      // 44: goto 59
      // 47: aload 0
      // 48: aload 1
      // 49: invokespecial com/discord/react/FontManager.getCache (Landroid/content/Context;)Landroid/content/SharedPreferences;
      // 4c: ldc "FONT_SCALE_CHAT_CLASSIC_KEY"
      // 4e: bipush 0
      // 4f: invokeinterface android/content/SharedPreferences.getBoolean (Ljava/lang/String;Z)Z 3
      // 54: istore 2
      // 55: aload 0
      // 56: monitorexit
      // 57: iload 2
      // 58: ireturn
      // 59: aload 0
      // 5a: monitorexit
      // 5b: aload 1
      // 5c: athrow
   }

   public fun getScaledDpToPx(dp: Int, context: Context): Int {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            q.h(var2, "context");
            var1 = this.getScaledPx(SizeUtilsKt.getDpToPx(var1), var2);
         } catch (var3: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public fun getScaledFontSize(context: Context): Float {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            q.h(var1, "context");
            val var2: Float = this.getInitialFontSize();
            val var3: Float = this.getFontScale(var1);
         } catch (var4: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public fun getScaledPx(px: Int, context: Context): Int {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.insertSemaphore(FinallyProcessor.java:350)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:99)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 2
      // 03: ldc "context"
      // 05: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 08: iload 1
      // 09: i2f
      // 0a: fstore 3
      // 0b: aload 0
      // 0c: aload 2
      // 0d: invokevirtual com/discord/react/FontManager.getFontScale (Landroid/content/Context;)F
      // 10: fstore 4
      // 12: fload 3
      // 13: fload 4
      // 15: fmul
      // 16: f2i
      // 17: istore 1
      // 18: aload 0
      // 19: monitorexit
      // 1a: iload 1
      // 1b: ireturn
      // 1c: astore 2
      // 1d: aload 0
      // 1e: monitorexit
      // 1f: aload 2
      // 20: athrow
   }

   public fun getScaledSpToPx(sp: Int, context: Context): Int {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            q.h(var2, "context");
            var1 = this.getScaledPx(SizeUtilsKt.getSpToPx(var1), var2);
         } catch (var3: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public fun init(context: Context) {
      q.h(var1, "context");
      this.setInitialFontSize(var1.getResources().getConfiguration().fontScale);
   }

   public fun setFontSize(
      context: Context,
      fontScale: Float = var0.getFontScale(var1),
      isClassicChatFontScaleEnabled: Boolean = var0.getIsClassicChatFontScaleEnabled(var1)
   ) {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            q.h(var1, "context");
            val var6: SharedPreferences = this.getCache(var1);
            q.g(var6, "getCache(...)");
            val var7: Editor = var6.edit();
            q.g(var7, "editor");
            var7.putFloat("FONT_SCALE_KEY", var2);
            var7.putBoolean("FONT_SCALE_CHAT_CLASSIC_KEY", var3);
            var7.commit();
         } catch (var4: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }
}
