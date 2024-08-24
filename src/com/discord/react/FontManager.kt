package com.discord.react

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import com.discord.misc.utilities.size.SizeUtilsKt
import kotlin.jvm.internal.r
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
            r.h(var1, "context");
            val var2: Float = this.getCache(var1).getFloat("FONT_SCALE_KEY", 1.0F);
         } catch (var3: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public fun getIsClassicChatFontScaleEnabled(context: Context): Boolean {
      label20: {
         synchronized (this){} // $VF: monitorenter 

         try {
            r.h(var1, "context");
            if (!this.getCache(var1).contains("FONT_SCALE_CHAT_CLASSIC_KEY")) {
               val var3: SharedPreferences = this.getCache(var1);
               r.g(var3, "context.getCache()");
               val var6: Editor = var3.edit();
               r.g(var6, "editor");
               var6.putBoolean("FONT_SCALE_CHAT_CLASSIC_KEY", false);
               var6.apply();
            }

            val var2: Boolean = this.getCache(var1).getBoolean("FONT_SCALE_CHAT_CLASSIC_KEY", false);
         } catch (var4: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public fun getScaledDpToPx(dp: Int, context: Context): Int {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            r.h(var2, "context");
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
            r.h(var1, "context");
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1047)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.insertSemaphore(FinallyProcessor.java:340)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:100)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 2
      // 03: ldc "context"
      // 05: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
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
            r.h(var2, "context");
            var1 = this.getScaledPx(SizeUtilsKt.getSpToPx(var1), var2);
         } catch (var3: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public fun init(context: Context) {
      r.h(var1, "context");
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
            r.h(var1, "context");
            val var6: SharedPreferences = this.getCache(var1);
            r.g(var6, "context.getCache()");
            val var7: Editor = var6.edit();
            r.g(var7, "editor");
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
