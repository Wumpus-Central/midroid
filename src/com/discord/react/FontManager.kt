package com.discord.react

import android.content.Context
import android.content.SharedPreferences
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.properties.a

@SourceDebugExtension(["SMAP\nFontManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontManager.kt\ncom/discord/react/FontManager\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,89:1\n45#2,8:90\n41#2,12:98\n*S KotlinDebug\n*F\n+ 1 FontManager.kt\ncom/discord/react/FontManager\n*L\n22#1:90,8\n74#1:98,12\n*E\n"])
public object FontManager {
   private final var initialFontSize: Float by a.a.a()
      private final get() {
         return (initialFontSize$delegate.getValue(this, $$delegatedProperties[0]) as java.lang.Number).floatValue();
      }

      private final set(<set-?>) {
         initialFontSize$delegate.setValue(this, $$delegatedProperties[0], var1);
      }


   private const val FONT_SCALE_KEY: String = "FONT_SCALE_KEY"
   private const val FONT_SCALE_CHAT_CLASSIC_KEY: String = "FONT_SCALE_CHAT_CLASSIC_KEY"
   private const val FONT_SCALE_CHAT_CLASSIC_DEFAULT: Boolean = false

   private fun Context.getCache(): SharedPreferences {
      return var1.getSharedPreferences("FontScaleManager", 0);
   }

   public fun getFontScale(context: Context): Float {
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
      // 09: aload 1
      // 0a: invokespecial com/discord/react/FontManager.getCache (Landroid/content/Context;)Landroid/content/SharedPreferences;
      // 0d: ldc "FONT_SCALE_KEY"
      // 0f: fconst_1
      // 10: invokeinterface android/content/SharedPreferences.getFloat (Ljava/lang/String;F)F 3
      // 15: fstore 2
      // 16: aload 0
      // 17: monitorexit
      // 18: fload 2
      // 19: freturn
      // 1a: astore 1
      // 1b: aload 0
      // 1c: monitorexit
      // 1d: aload 1
      // 1e: athrow
   }

   public fun getIsClassicChatFontScaleEnabled(context: Context): Boolean {
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
      // 09: aload 1
      // 0a: invokespecial com/discord/react/FontManager.getCache (Landroid/content/Context;)Landroid/content/SharedPreferences;
      // 0d: ldc "FONT_SCALE_CHAT_CLASSIC_KEY"
      // 0f: invokeinterface android/content/SharedPreferences.contains (Ljava/lang/String;)Z 2
      // 14: ifne 41
      // 17: aload 0
      // 18: aload 1
      // 19: invokespecial com/discord/react/FontManager.getCache (Landroid/content/Context;)Landroid/content/SharedPreferences;
      // 1c: astore 3
      // 1d: aload 3
      // 1e: ldc "getCache(...)"
      // 20: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 23: aload 3
      // 24: invokeinterface android/content/SharedPreferences.edit ()Landroid/content/SharedPreferences$Editor; 1
      // 29: astore 3
      // 2a: aload 3
      // 2b: ldc "FONT_SCALE_CHAT_CLASSIC_KEY"
      // 2d: bipush 0
      // 2e: invokeinterface android/content/SharedPreferences$Editor.putBoolean (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor; 3
      // 33: pop
      // 34: aload 3
      // 35: invokeinterface android/content/SharedPreferences$Editor.apply ()V 1
      // 3a: goto 41
      // 3d: astore 1
      // 3e: goto 53
      // 41: aload 0
      // 42: aload 1
      // 43: invokespecial com/discord/react/FontManager.getCache (Landroid/content/Context;)Landroid/content/SharedPreferences;
      // 46: ldc "FONT_SCALE_CHAT_CLASSIC_KEY"
      // 48: bipush 0
      // 49: invokeinterface android/content/SharedPreferences.getBoolean (Ljava/lang/String;Z)Z 3
      // 4e: istore 2
      // 4f: aload 0
      // 50: monitorexit
      // 51: iload 2
      // 52: ireturn
      // 53: aload 0
      // 54: monitorexit
      // 55: aload 1
      // 56: athrow
   }

   public fun getScaledDpToPx(dp: Int, context: Context): Int {
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
      // 02: aload 2
      // 03: ldc "context"
      // 05: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 08: aload 0
      // 09: iload 1
      // 0a: invokestatic com/discord/misc/utilities/size/SizeUtilsKt.getDpToPx (I)I
      // 0d: aload 2
      // 0e: invokevirtual com/discord/react/FontManager.getScaledPx (ILandroid/content/Context;)I
      // 11: istore 1
      // 12: aload 0
      // 13: monitorexit
      // 14: iload 1
      // 15: ireturn
      // 16: astore 2
      // 17: aload 0
      // 18: monitorexit
      // 19: aload 2
      // 1a: athrow
   }

   public fun getScaledFontSize(context: Context): Float {
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
      // 09: invokespecial com/discord/react/FontManager.getInitialFontSize ()F
      // 0c: fstore 2
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokevirtual com/discord/react/FontManager.getFontScale (Landroid/content/Context;)F
      // 12: fstore 3
      // 13: aload 0
      // 14: monitorexit
      // 15: fload 2
      // 16: fload 3
      // 17: fmul
      // 18: freturn
      // 19: astore 1
      // 1a: aload 0
      // 1b: monitorexit
      // 1c: aload 1
      // 1d: athrow
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 2
      // 03: ldc "context"
      // 05: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
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
      // 02: aload 2
      // 03: ldc "context"
      // 05: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 08: aload 0
      // 09: iload 1
      // 0a: invokestatic com/discord/misc/utilities/size/SizeUtilsKt.getSpToPx (I)I
      // 0d: aload 2
      // 0e: invokevirtual com/discord/react/FontManager.getScaledPx (ILandroid/content/Context;)I
      // 11: istore 1
      // 12: aload 0
      // 13: monitorexit
      // 14: iload 1
      // 15: ireturn
      // 16: astore 2
      // 17: aload 0
      // 18: monitorexit
      // 19: aload 2
      // 1a: athrow
   }

   public fun init(context: Context) {
      this.setInitialFontSize(var1.getResources().getConfiguration().fontScale);
   }

   public fun setFontSize(
      context: Context,
      fontScale: Float = var0.getFontScale(var1),
      isClassicChatFontScaleEnabled: Boolean = var0.getIsClassicChatFontScaleEnabled(var1)
   ) {
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
      // 09: aload 1
      // 0a: invokespecial com/discord/react/FontManager.getCache (Landroid/content/Context;)Landroid/content/SharedPreferences;
      // 0d: astore 1
      // 0e: aload 1
      // 0f: ldc "getCache(...)"
      // 11: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 14: aload 1
      // 15: invokeinterface android/content/SharedPreferences.edit ()Landroid/content/SharedPreferences$Editor; 1
      // 1a: astore 1
      // 1b: aload 1
      // 1c: ldc "FONT_SCALE_KEY"
      // 1e: fload 2
      // 1f: invokeinterface android/content/SharedPreferences$Editor.putFloat (Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor; 3
      // 24: pop
      // 25: aload 1
      // 26: ldc "FONT_SCALE_CHAT_CLASSIC_KEY"
      // 28: iload 3
      // 29: invokeinterface android/content/SharedPreferences$Editor.putBoolean (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor; 3
      // 2e: pop
      // 2f: aload 1
      // 30: invokeinterface android/content/SharedPreferences$Editor.commit ()Z 1
      // 35: pop
      // 36: aload 0
      // 37: monitorexit
      // 38: return
      // 39: astore 1
      // 3a: aload 0
      // 3b: monitorexit
      // 3c: aload 1
      // 3d: athrow
   }
}
