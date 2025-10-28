package com.discord.chat.presentation.list

import android.animation.Animator
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import android.animation.Animator.AnimatorListener
import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.os.Handler
import android.util.Pair
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.PathInterpolator
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.chat.R
import com.discord.device.utils.DeviceReducedMotion
import com.discord.misc.utilities.drawable.GetDrawableCompatKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.theme.ThemeManager
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSwipeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeHelper.kt\ncom/discord/chat/presentation/list/SwipeHelper\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,543:1\n29#2:544\n85#2,18:545\n29#2:563\n85#2,18:564\n404#3:582\n74#4,15:583\n27#4,7:598\n*S KotlinDebug\n*F\n+ 1 SwipeHelper.kt\ncom/discord/chat/presentation/list/SwipeHelper\n*L\n267#1:544\n267#1:545,18\n344#1:563\n344#1:564,18\n463#1:582\n468#1:583,15\n509#1:598,7\n*E\n"])
internal class SwipeHelper(context: Context, onStart: () -> Unit, onEnd: () -> Unit) : ChatListCallback {
   private final val context: Context
   private final val onStart: () -> Unit
   private final val onEnd: () -> Unit
   private final var replyIcon: Drawable?
   private final var editIcon: Drawable?
   private final var currentItemViewHolder: ViewHolder?
   private final lateinit var mView: View
   private final var dX: Float
   private final var easterEggArrowAnimator: ValueAnimator?
   private final var easterEggArrowScale: Float
   private final var easterEggArrowRotationAnimator: ValueAnimator?
   private final var easterEggArrowRotationDegrees: Float
   private final var easterEggPullCount: Int
   private final var easterEggIsAnimating: Boolean
   private final var swipeBack: Boolean
   private final var shouldPerformHapticFeedback: Boolean
   private final var shouldTriggerReply: Boolean
   private final var isActive: Boolean
   private final var isCompleted: Boolean
   private final var actionType: SwipeActionType
   private final var editCircleScaleAnimator: ValueAnimator?
   private final var editCircleScale: Float
   private final val handler: Handler

   @JvmStatic
   fun {
      var var0: Int = SizeUtilsKt.getDpToPx(80);
      MAX_CONTEXT_AREA_WIDTH = var0;
      SWIPE_STOP_OFFSET_X = -var0;
      HAPTIC_TRIGGER_X = -var0;
      var0 = SizeUtilsKt.getDpToPx(-60);
      HAPTIC_RESET_X = var0;
      REPLY_RESET_X = var0;
   }

   init {
      this.context = var1;
      this.onStart = var2;
      this.onEnd = var3;
      this.replyIcon = GetDrawableCompatKt.getDrawableCompat(var1, R.drawable.ic_swipe_reply);
      this.editIcon = GetDrawableCompatKt.getDrawableCompat(var1, R.drawable.ic_swipe_edit);
      this.easterEggArrowScale = 1.0F;
      this.shouldPerformHapticFeedback = true;
      this.actionType = SwipeActionType.Reply;
      this.handler = new Handler(var1.getMainLooper());
   }

   private fun drawContextArea(canvas: Canvas) {
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
      // 000: aload 0
      // 001: getfield com/discord/chat/presentation/list/SwipeHelper.currentItemViewHolder Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
      // 004: ifnull 010
      // 007: aload 0
      // 008: getfield com/discord/chat/presentation/list/SwipeHelper.dX F
      // 00b: fconst_0
      // 00c: fcmpg
      // 00d: ifne 013
      // 010: goto 528
      // 013: aload 0
      // 014: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 017: astore 20
      // 019: aload 20
      // 01b: astore 19
      // 01d: aload 20
      // 01f: ifnonnull 02b
      // 022: ldc_w "mView"
      // 025: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 028: aconst_null
      // 029: astore 19
      // 02b: aload 19
      // 02d: invokevirtual android/view/View.getTranslationX ()F
      // 030: invokestatic java/lang/Math.abs (F)F
      // 033: fstore 3
      // 034: aload 0
      // 035: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 038: astore 20
      // 03a: aload 20
      // 03c: astore 19
      // 03e: aload 20
      // 040: ifnonnull 04c
      // 043: ldc_w "mView"
      // 046: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 049: aconst_null
      // 04a: astore 19
      // 04c: aload 19
      // 04e: invokevirtual android/view/View.getMeasuredHeight ()I
      // 051: i2f
      // 052: fstore 5
      // 054: new android/graphics/Paint
      // 057: dup
      // 058: invokespecial android/graphics/Paint.<init> ()V
      // 05b: astore 21
      // 05d: aload 0
      // 05e: getfield com/discord/chat/presentation/list/SwipeHelper.currentItemViewHolder Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
      // 061: astore 19
      // 063: aload 19
      // 065: ifnull 072
      // 068: aload 19
      // 06a: getfield androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView Landroid/view/View;
      // 06d: astore 19
      // 06f: goto 075
      // 072: aconst_null
      // 073: astore 19
      // 075: aload 19
      // 077: instanceof com/discord/chat/presentation/list/SwipeReplyInitiator
      // 07a: ifeq 087
      // 07d: aload 19
      // 07f: checkcast com/discord/chat/presentation/list/SwipeReplyInitiator
      // 082: astore 19
      // 084: goto 08a
      // 087: aconst_null
      // 088: astore 19
      // 08a: getstatic android/graphics/Paint$Style.FILL Landroid/graphics/Paint$Style;
      // 08d: astore 22
      // 08f: aload 21
      // 091: aload 22
      // 093: invokevirtual android/graphics/Paint.setStyle (Landroid/graphics/Paint$Style;)V
      // 096: aload 19
      // 098: ifnull 0b4
      // 09b: aload 19
      // 09d: invokeinterface com/discord/chat/presentation/list/SwipeReplyInitiator.getUsingGradientTheme ()Z 1
      // 0a2: bipush 1
      // 0a3: if_icmpne 0b4
      // 0a6: aload 21
      // 0a8: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 0ab: invokevirtual com/discord/theme/DiscordThemeObject.getChatSwipeToReplyGradientBackground ()I
      // 0ae: invokevirtual android/graphics/Paint.setColor (I)V
      // 0b1: goto 0bf
      // 0b4: aload 21
      // 0b6: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 0b9: invokevirtual com/discord/theme/DiscordThemeObject.getChatSwipeToReplyBackground ()I
      // 0bc: invokevirtual android/graphics/Paint.setColor (I)V
      // 0bf: aload 1
      // 0c0: invokevirtual android/graphics/Canvas.save ()I
      // 0c3: pop
      // 0c4: aload 0
      // 0c5: invokespecial com/discord/chat/presentation/list/SwipeHelper.getSwipeProgress ()F
      // 0c8: fstore 2
      // 0c9: aload 0
      // 0ca: fload 2
      // 0cb: fload 5
      // 0cd: invokespecial com/discord/chat/presentation/list/SwipeHelper.getLeftBevelRadius (FF)F
      // 0d0: fstore 7
      // 0d2: getstatic com/discord/chat/presentation/list/SwipeHelper.MAX_RIGHT_BEVEL_WIDTH I
      // 0d5: i2f
      // 0d6: fload 2
      // 0d7: fmul
      // 0d8: fstore 13
      // 0da: aload 0
      // 0db: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 0de: astore 20
      // 0e0: aload 20
      // 0e2: astore 19
      // 0e4: aload 20
      // 0e6: ifnonnull 0f2
      // 0e9: ldc_w "mView"
      // 0ec: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 0ef: aconst_null
      // 0f0: astore 19
      // 0f2: aload 19
      // 0f4: invokevirtual android/view/View.getMeasuredWidth ()I
      // 0f7: i2f
      // 0f8: fstore 4
      // 0fa: aload 0
      // 0fb: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 0fe: astore 20
      // 100: aload 20
      // 102: astore 19
      // 104: aload 20
      // 106: ifnonnull 112
      // 109: ldc_w "mView"
      // 10c: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 10f: aconst_null
      // 110: astore 19
      // 112: fload 4
      // 114: aload 19
      // 116: invokevirtual android/view/View.getTranslationX ()F
      // 119: fadd
      // 11a: fstore 4
      // 11c: fload 4
      // 11e: fload 7
      // 120: fsub
      // 121: fstore 10
      // 123: fload 4
      // 125: fload 3
      // 126: fadd
      // 127: fstore 6
      // 129: fload 6
      // 12b: fload 13
      // 12d: fsub
      // 12e: fstore 12
      // 130: aload 0
      // 131: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 134: astore 19
      // 136: aload 19
      // 138: ifnonnull 147
      // 13b: ldc_w "mView"
      // 13e: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 141: aconst_null
      // 142: astore 19
      // 144: goto 147
      // 147: aload 19
      // 149: invokevirtual android/view/View.getTop ()I
      // 14c: i2f
      // 14d: fstore 8
      // 14f: getstatic com/discord/chat/presentation/list/SwipeHelper.RIGHT_BEVEL_HEIGHT I
      // 152: istore 16
      // 154: fload 8
      // 156: iload 16
      // 158: i2f
      // 159: fsub
      // 15a: fstore 15
      // 15c: iload 16
      // 15e: i2f
      // 15f: fload 15
      // 161: fadd
      // 162: fstore 9
      // 164: fload 15
      // 166: fload 5
      // 168: fadd
      // 169: iload 16
      // 16b: bipush 2
      // 16c: imul
      // 16d: i2f
      // 16e: fadd
      // 16f: fstore 14
      // 171: fload 14
      // 173: iload 16
      // 175: i2f
      // 176: fsub
      // 177: fstore 11
      // 179: new android/graphics/Path
      // 17c: dup
      // 17d: invokespecial android/graphics/Path.<init> ()V
      // 180: astore 19
      // 182: aload 19
      // 184: fload 12
      // 186: fload 11
      // 188: invokevirtual android/graphics/Path.moveTo (FF)V
      // 18b: aload 19
      // 18d: fload 4
      // 18f: fload 11
      // 191: invokevirtual android/graphics/Path.lineTo (FF)V
      // 194: aload 19
      // 196: fload 4
      // 198: fload 9
      // 19a: fload 7
      // 19c: fadd
      // 19d: invokevirtual android/graphics/Path.lineTo (FF)V
      // 1a0: bipush 2
      // 1a1: i2f
      // 1a2: fstore 8
      // 1a4: aload 19
      // 1a6: fload 10
      // 1a8: fload 7
      // 1aa: fsub
      // 1ab: fload 9
      // 1ad: fload 4
      // 1af: fload 9
      // 1b1: fload 8
      // 1b3: fload 7
      // 1b5: fmul
      // 1b6: fadd
      // 1b7: fconst_0
      // 1b8: ldc_w -90.0
      // 1bb: invokevirtual android/graphics/Path.addArc (FFFFFF)V
      // 1be: aload 19
      // 1c0: fload 12
      // 1c2: fload 9
      // 1c4: invokevirtual android/graphics/Path.lineTo (FF)V
      // 1c7: fload 13
      // 1c9: ldc_w 0.55
      // 1cc: fmul
      // 1cd: fload 12
      // 1cf: fadd
      // 1d0: fstore 13
      // 1d2: aload 19
      // 1d4: fload 13
      // 1d6: fload 9
      // 1d8: fload 6
      // 1da: fload 15
      // 1dc: iload 16
      // 1de: i2f
      // 1df: ldc_w 0.55
      // 1e2: fmul
      // 1e3: fadd
      // 1e4: fload 6
      // 1e6: fload 15
      // 1e8: invokevirtual android/graphics/Path.cubicTo (FFFFFF)V
      // 1eb: aload 19
      // 1ed: fload 6
      // 1ef: fload 14
      // 1f1: invokevirtual android/graphics/Path.lineTo (FF)V
      // 1f4: aload 19
      // 1f6: fload 6
      // 1f8: fload 14
      // 1fa: iload 16
      // 1fc: i2f
      // 1fd: ldc_w 0.55
      // 200: fmul
      // 201: fsub
      // 202: fload 13
      // 204: fload 11
      // 206: fload 12
      // 208: fload 11
      // 20a: invokevirtual android/graphics/Path.cubicTo (FFFFFF)V
      // 20d: aload 1
      // 20e: invokevirtual android/graphics/Canvas.save ()I
      // 211: pop
      // 212: aload 1
      // 213: aload 19
      // 215: invokevirtual android/graphics/Canvas.clipPath (Landroid/graphics/Path;)Z
      // 218: pop
      // 219: aload 1
      // 21a: fload 10
      // 21c: fload 15
      // 21e: fload 6
      // 220: fload 14
      // 222: aload 21
      // 224: invokevirtual android/graphics/Canvas.drawRect (FFFFLandroid/graphics/Paint;)V
      // 227: aload 1
      // 228: invokevirtual android/graphics/Canvas.restore ()V
      // 22b: aload 1
      // 22c: invokevirtual android/graphics/Canvas.save ()I
      // 22f: pop
      // 230: aload 19
      // 232: invokevirtual android/graphics/Path.reset ()V
      // 235: fload 11
      // 237: fload 7
      // 239: fsub
      // 23a: fstore 12
      // 23c: aload 19
      // 23e: fload 10
      // 240: fload 12
      // 242: fload 7
      // 244: getstatic android/graphics/Path$Direction.CW Landroid/graphics/Path$Direction;
      // 247: invokevirtual android/graphics/Path.addCircle (FFFLandroid/graphics/Path$Direction;)V
      // 24a: getstatic android/os/Build$VERSION.SDK_INT I
      // 24d: bipush 26
      // 24f: if_icmplt 25c
      // 252: aload 1
      // 253: aload 19
      // 255: invokestatic com/discord/chat/presentation/list/x.a (Landroid/graphics/Canvas;Landroid/graphics/Path;)Z
      // 258: pop
      // 259: goto 266
      // 25c: aload 1
      // 25d: aload 19
      // 25f: getstatic android/graphics/Region$Op.DIFFERENCE Landroid/graphics/Region$Op;
      // 262: invokevirtual android/graphics/Canvas.clipPath (Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
      // 265: pop
      // 266: aload 1
      // 267: fload 10
      // 269: fload 12
      // 26b: fload 4
      // 26d: fload 11
      // 26f: aload 21
      // 271: invokevirtual android/graphics/Canvas.drawRect (FFFFLandroid/graphics/Paint;)V
      // 274: aload 1
      // 275: invokevirtual android/graphics/Canvas.restore ()V
      // 278: aload 0
      // 279: fload 5
      // 27b: invokespecial com/discord/chat/presentation/list/SwipeHelper.getArrowContainerBaseSize (F)F
      // 27e: fload 8
      // 280: fdiv
      // 281: fstore 7
      // 283: fload 3
      // 284: fload 8
      // 286: fdiv
      // 287: fstore 3
      // 288: fload 5
      // 28a: fload 8
      // 28c: fdiv
      // 28d: fload 9
      // 28f: fadd
      // 290: fload 7
      // 292: fsub
      // 293: f2i
      // 294: istore 17
      // 296: sipush 192
      // 299: i2f
      // 29a: fload 2
      // 29b: fmul
      // 29c: f2i
      // 29d: bipush 64
      // 29f: iadd
      // 2a0: bipush 0
      // 2a1: sipush 255
      // 2a4: invokestatic kotlin/ranges/e.m (III)I
      // 2a7: istore 16
      // 2a9: aload 1
      // 2aa: invokevirtual android/graphics/Canvas.save ()I
      // 2ad: pop
      // 2ae: aload 1
      // 2af: fload 4
      // 2b1: fconst_0
      // 2b2: fload 6
      // 2b4: aload 1
      // 2b5: invokevirtual android/graphics/Canvas.getHeight ()I
      // 2b8: i2f
      // 2b9: invokevirtual android/graphics/Canvas.clipRect (FFFF)Z
      // 2bc: pop
      // 2bd: aload 1
      // 2be: fload 4
      // 2c0: fload 3
      // 2c1: fadd
      // 2c2: fload 7
      // 2c4: fsub
      // 2c5: fload 7
      // 2c7: fadd
      // 2c8: iload 17
      // 2ca: i2f
      // 2cb: fload 7
      // 2cd: fadd
      // 2ce: invokevirtual android/graphics/Canvas.translate (FF)V
      // 2d1: aload 0
      // 2d2: getfield com/discord/chat/presentation/list/SwipeHelper.easterEggArrowScale F
      // 2d5: fstore 3
      // 2d6: aload 1
      // 2d7: fload 3
      // 2d8: fload 3
      // 2d9: invokevirtual android/graphics/Canvas.scale (FF)V
      // 2dc: aload 0
      // 2dd: getfield com/discord/chat/presentation/list/SwipeHelper.isCompleted Z
      // 2e0: ifeq 2e8
      // 2e3: fconst_1
      // 2e4: fstore 3
      // 2e5: goto 2ea
      // 2e8: fload 2
      // 2e9: fstore 3
      // 2ea: aload 21
      // 2ec: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 2ef: invokevirtual com/discord/theme/DiscordThemeObject.getBgSurfaceOverlay ()I
      // 2f2: aload 0
      // 2f3: getfield com/discord/chat/presentation/list/SwipeHelper.context Landroid/content/Context;
      // 2f6: getstatic com/discord/theme/R$color.brand_500 I
      // 2f9: invokestatic com/discord/theme/utils/ColorUtilsKt.getColorCompat (Landroid/content/Context;I)I
      // 2fc: fload 3
      // 2fd: ldc_w 0.8
      // 300: fconst_1
      // 301: invokestatic com/discord/theme/utils/ColorUtilsKt.interpolateColors (IIFFF)I
      // 304: invokevirtual android/graphics/Paint.setColor (I)V
      // 307: aload 21
      // 309: aload 22
      // 30b: invokevirtual android/graphics/Paint.setStyle (Landroid/graphics/Paint$Style;)V
      // 30e: aload 21
      // 310: iload 16
      // 312: invokevirtual android/graphics/Paint.setAlpha (I)V
      // 315: getstatic com/discord/theme/ThemeManager.INSTANCE Lcom/discord/theme/ThemeManager;
      // 318: invokevirtual com/discord/theme/ThemeManager.isThemeLight ()Z
      // 31b: ifeq 326
      // 31e: ldc_w "#16000000"
      // 321: astore 19
      // 323: goto 32b
      // 326: ldc_w "#24000000"
      // 329: astore 19
      // 32b: aload 21
      // 32d: ldc_w 10.0
      // 330: fconst_0
      // 331: ldc_w 5.0
      // 334: aload 19
      // 336: invokestatic android/graphics/Color.parseColor (Ljava/lang/String;)I
      // 339: invokevirtual android/graphics/Paint.setShadowLayer (FFFI)V
      // 33c: aload 1
      // 33d: fconst_0
      // 33e: fconst_0
      // 33f: fload 7
      // 341: aload 21
      // 343: invokevirtual android/graphics/Canvas.drawCircle (FFFLandroid/graphics/Paint;)V
      // 346: aload 21
      // 348: invokevirtual android/graphics/Paint.clearShadowLayer ()V
      // 34b: aload 0
      // 34c: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 34f: fstore 4
      // 351: fload 4
      // 353: fconst_0
      // 354: fcmpl
      // 355: ifle 3bf
      // 358: aload 1
      // 359: invokevirtual android/graphics/Canvas.save ()I
      // 35c: istore 17
      // 35e: aload 1
      // 35f: fload 4
      // 361: fload 4
      // 363: fconst_0
      // 364: fconst_0
      // 365: invokevirtual android/graphics/Canvas.scale (FFFF)V
      // 368: aload 0
      // 369: getfield com/discord/chat/presentation/list/SwipeHelper.isCompleted Z
      // 36c: ifeq 375
      // 36f: fconst_1
      // 370: fstore 4
      // 372: goto 378
      // 375: fload 2
      // 376: fstore 4
      // 378: aload 21
      // 37a: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 37d: invokevirtual com/discord/theme/DiscordThemeObject.getBgSurfaceOverlay ()I
      // 380: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 383: invokevirtual com/discord/theme/DiscordThemeObject.getBackgroundAccent ()I
      // 386: fload 4
      // 388: ldc_w 0.8
      // 38b: fconst_1
      // 38c: invokestatic com/discord/theme/utils/ColorUtilsKt.interpolateColors (IIFFF)I
      // 38f: invokevirtual android/graphics/Paint.setColor (I)V
      // 392: aload 21
      // 394: aload 22
      // 396: invokevirtual android/graphics/Paint.setStyle (Landroid/graphics/Paint$Style;)V
      // 399: aload 21
      // 39b: sipush 255
      // 39e: invokevirtual android/graphics/Paint.setAlpha (I)V
      // 3a1: aload 1
      // 3a2: fconst_0
      // 3a3: fconst_0
      // 3a4: fload 7
      // 3a6: aload 21
      // 3a8: invokevirtual android/graphics/Canvas.drawCircle (FFFLandroid/graphics/Paint;)V
      // 3ab: aload 1
      // 3ac: iload 17
      // 3ae: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 3b1: goto 3bf
      // 3b4: astore 19
      // 3b6: aload 1
      // 3b7: iload 17
      // 3b9: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 3bc: aload 19
      // 3be: athrow
      // 3bf: aload 1
      // 3c0: invokevirtual android/graphics/Canvas.save ()I
      // 3c3: pop
      // 3c4: fconst_0
      // 3c5: fconst_1
      // 3c6: bipush 1
      // 3c7: i2f
      // 3c8: aload 0
      // 3c9: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 3cc: fsub
      // 3cd: invokestatic java/lang/Float.min (FF)F
      // 3d0: invokestatic java/lang/Math.max (FF)F
      // 3d3: fstore 4
      // 3d5: aload 0
      // 3d6: fload 5
      // 3d8: invokespecial com/discord/chat/presentation/list/SwipeHelper.getArrowIconBaseSize (F)F
      // 3db: fstore 5
      // 3dd: new android/graphics/PorterDuffColorFilter
      // 3e0: dup
      // 3e1: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 3e4: invokevirtual com/discord/theme/DiscordThemeObject.getInteractiveNormal ()I
      // 3e7: aload 0
      // 3e8: getfield com/discord/chat/presentation/list/SwipeHelper.context Landroid/content/Context;
      // 3eb: getstatic com/discord/theme/R$color.white I
      // 3ee: invokestatic com/discord/theme/utils/ColorUtilsKt.getColorCompat (Landroid/content/Context;I)I
      // 3f1: fload 3
      // 3f2: ldc_w 0.8
      // 3f5: fconst_1
      // 3f6: invokestatic com/discord/theme/utils/ColorUtilsKt.interpolateColors (IIFFF)I
      // 3f9: getstatic android/graphics/PorterDuff$Mode.SRC_ATOP Landroid/graphics/PorterDuff$Mode;
      // 3fc: invokespecial android/graphics/PorterDuffColorFilter.<init> (ILandroid/graphics/PorterDuff$Mode;)V
      // 3ff: astore 19
      // 401: aload 0
      // 402: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 405: astore 20
      // 407: aload 20
      // 409: ifnull 413
      // 40c: aload 20
      // 40e: aload 19
      // 410: invokevirtual android/graphics/drawable/Drawable.setColorFilter (Landroid/graphics/ColorFilter;)V
      // 413: getstatic com/discord/device/utils/DeviceReducedMotion.INSTANCE Lcom/discord/device/utils/DeviceReducedMotion;
      // 416: aload 0
      // 417: getfield com/discord/chat/presentation/list/SwipeHelper.context Landroid/content/Context;
      // 41a: invokevirtual com/discord/device/utils/DeviceReducedMotion.isReducedMotionEnabled (Landroid/content/Context;)Z
      // 41d: ifeq 425
      // 420: fconst_0
      // 421: fstore 2
      // 422: goto 42d
      // 425: ldc_w 90.0
      // 428: fconst_1
      // 429: fload 2
      // 42a: fsub
      // 42b: fmul
      // 42c: fstore 2
      // 42d: aload 0
      // 42e: getfield com/discord/chat/presentation/list/SwipeHelper.easterEggArrowRotationDegrees F
      // 431: fstore 3
      // 432: aload 1
      // 433: ldc_w -1.0
      // 436: ldc_w -1.0
      // 439: invokevirtual android/graphics/Canvas.translate (FF)V
      // 43c: fload 2
      // 43d: fload 3
      // 43e: fadd
      // 43f: fstore 2
      // 440: aload 1
      // 441: fload 2
      // 442: invokevirtual android/graphics/Canvas.rotate (F)V
      // 445: aload 1
      // 446: fload 4
      // 448: fload 4
      // 44a: invokevirtual android/graphics/Canvas.scale (FF)V
      // 44d: fload 5
      // 44f: fconst_2
      // 450: fdiv
      // 451: f2i
      // 452: istore 17
      // 454: iload 17
      // 456: ineg
      // 457: istore 18
      // 459: new android/graphics/Rect
      // 45c: dup
      // 45d: iload 18
      // 45f: iload 18
      // 461: iload 17
      // 463: iload 17
      // 465: invokespecial android/graphics/Rect.<init> (IIII)V
      // 468: astore 20
      // 46a: aload 0
      // 46b: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 46e: astore 21
      // 470: aload 21
      // 472: ifnull 47c
      // 475: aload 21
      // 477: aload 20
      // 479: invokevirtual android/graphics/drawable/Drawable.setBounds (Landroid/graphics/Rect;)V
      // 47c: aload 0
      // 47d: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 480: astore 21
      // 482: aload 21
      // 484: ifnull 48e
      // 487: aload 21
      // 489: iload 16
      // 48b: invokevirtual android/graphics/drawable/Drawable.setAlpha (I)V
      // 48e: aload 0
      // 48f: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 492: astore 21
      // 494: aload 21
      // 496: ifnull 49f
      // 499: aload 21
      // 49b: aload 1
      // 49c: invokevirtual android/graphics/drawable/Drawable.draw (Landroid/graphics/Canvas;)V
      // 49f: aload 1
      // 4a0: invokevirtual android/graphics/Canvas.restore ()V
      // 4a3: aload 0
      // 4a4: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 4a7: fconst_0
      // 4a8: fcmpl
      // 4a9: ifle 524
      // 4ac: aload 1
      // 4ad: invokevirtual android/graphics/Canvas.save ()I
      // 4b0: istore 16
      // 4b2: aload 0
      // 4b3: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 4b6: astore 21
      // 4b8: aload 21
      // 4ba: ifnull 4cc
      // 4bd: aload 21
      // 4bf: aload 19
      // 4c1: invokevirtual android/graphics/drawable/Drawable.setColorFilter (Landroid/graphics/ColorFilter;)V
      // 4c4: goto 4cc
      // 4c7: astore 19
      // 4c9: goto 51b
      // 4cc: aload 1
      // 4cd: fload 2
      // 4ce: invokevirtual android/graphics/Canvas.rotate (F)V
      // 4d1: aload 0
      // 4d2: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 4d5: fstore 2
      // 4d6: aload 1
      // 4d7: fload 2
      // 4d8: fload 2
      // 4d9: invokevirtual android/graphics/Canvas.scale (FF)V
      // 4dc: aload 0
      // 4dd: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 4e0: astore 19
      // 4e2: aload 19
      // 4e4: ifnull 4ee
      // 4e7: aload 19
      // 4e9: aload 20
      // 4eb: invokevirtual android/graphics/drawable/Drawable.setBounds (Landroid/graphics/Rect;)V
      // 4ee: aload 0
      // 4ef: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 4f2: astore 19
      // 4f4: aload 19
      // 4f6: ifnull 501
      // 4f9: aload 19
      // 4fb: sipush 255
      // 4fe: invokevirtual android/graphics/drawable/Drawable.setAlpha (I)V
      // 501: aload 0
      // 502: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 505: astore 19
      // 507: aload 19
      // 509: ifnull 512
      // 50c: aload 19
      // 50e: aload 1
      // 50f: invokevirtual android/graphics/drawable/Drawable.draw (Landroid/graphics/Canvas;)V
      // 512: aload 1
      // 513: iload 16
      // 515: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 518: goto 524
      // 51b: aload 1
      // 51c: iload 16
      // 51e: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 521: aload 19
      // 523: athrow
      // 524: aload 1
      // 525: invokevirtual android/graphics/Canvas.restore ()V
      // 528: return
   }

   private fun easterEggStartAnimation(recyclerView: RecyclerView, viewHolder: ViewHolder) {
      if (!DeviceReducedMotion.INSTANCE.isReducedMotionEnabled(this.context)) {
         var var3: View = this.mView;
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            var3 = null;
         }

         val var5: PropertyValuesHolder = PropertyValuesHolder.ofFloat(
            "arrow-scale", new float[]{1.0F, this.getArrowContainerGrowthRatio((float)var3.getMeasuredHeight()), 1.0F}
         );
         var var7: ValueAnimator = new ValueAnimator();
         var7.setValues(new PropertyValuesHolder[]{var5});
         var7.setDuration(300L);
         var7.setInterpolator(new AccelerateDecelerateInterpolator());
         var7.addUpdateListener(new C(this, var1));
         this.easterEggArrowAnimator = var7;
         var7.start();
         val var6: PropertyValuesHolder = PropertyValuesHolder.ofFloat("arrow-rotation", new float[]{720.0F, 0.0F});
         var7 = new ValueAnimator();
         var7.setValues(new PropertyValuesHolder[]{var6});
         var7.setDuration(800L);
         var7.setInterpolator(new PathInterpolator(0.0F, 0.0F, 0.25F, 1.0F));
         var7.addUpdateListener(new D(this, var1));
         var7.addListener(new AnimatorListener(this, var2, var1) {
            final RecyclerView $recyclerView$inlined;
            final RecyclerView.ViewHolder $viewHolder$inlined;
            final SwipeHelper this$0;

            {
               this.this$0 = var1;
               this.$viewHolder$inlined = var2;
               this.$recyclerView$inlined = var3;
            }

            public void onAnimationCancel(Animator var1) {
            }

            public void onAnimationEnd(Animator var1) {
               SwipeHelper.access$setEasterEggIsAnimating$p(this.this$0, false);
               SwipeHelper.access$setEasterEggPullCount$p(this.this$0, 0);
               if (SwipeHelper.access$shouldStartEditEntrance(this.this$0, this.$viewHolder$inlined)) {
                  SwipeHelper.access$triggerEditEntranceTransition(this.this$0, this.$recyclerView$inlined);
               }
            }

            public void onAnimationRepeat(Animator var1) {
            }

            public void onAnimationStart(Animator var1) {
            }
         });
         this.easterEggArrowRotationAnimator = var7;
         var7.start();
         this.easterEggIsAnimating = true;
      }
   }

   @JvmStatic
   fun `easterEggStartAnimation$lambda$6$lambda$5`(var0: SwipeHelper, var1: RecyclerView, var2: ValueAnimator) {
      val var3: Any = var2.getAnimatedValue("arrow-scale");
      var0.easterEggArrowScale = var3 as java.lang.Float;
      var1.invalidate();
   }

   @JvmStatic
   fun `easterEggStartAnimation$lambda$9$lambda$7`(var0: SwipeHelper, var1: RecyclerView, var2: ValueAnimator) {
      val var3: Any = var2.getAnimatedValue("arrow-rotation");
      var0.easterEggArrowRotationDegrees = var3 as java.lang.Float;
      var1.invalidate();
   }

   private fun getArrowContainerBaseSize(contentHeight: Float): Float {
      return java.lang.Float.min(var1 - (float)SizeUtilsKt.getDpToPx(6), (float)SizeUtilsKt.getDpToPx(40));
   }

   private fun getArrowContainerGrowthRatio(contentHeight: Float): Float {
      val var2: Float = this.getArrowContainerBaseSize(var1);
      return if (var2 * 1.3F > var1) var1 / var2 else 1.3F;
   }

   private fun getArrowIconBaseSize(contentHeight: Float): Float {
      return this.getArrowContainerBaseSize(var1) * 0.6F;
   }

   private fun getLeftBevelRadius(progress: Float, contentHeight: Float): Float {
      return var1 * java.lang.Float.min((float)MAX_LEFT_BEVEL_RADIUS, (var2 - (float)8) / 2.0F);
   }

   private fun getSwipeProgress(): Float {
      var var1: View = this.mView;
      if (this.mView == null) {
         Intrinsics.throwUninitializedPropertyAccessException("mView");
         var1 = null;
      }

      return Math.max(0.0F, java.lang.Float.min(var1.getTranslationX() / (float)SWIPE_STOP_OFFSET_X, 1.0F));
   }

   private fun shouldStartEditEntrance(viewHolder: ViewHolder): Boolean {
      var var2: Boolean = false;
      if (this.actionType === SwipeActionType.Reply) {
         var var8: View = this.mView;
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            var8 = null;
         }

         var2 = false;
         if (var8.getTranslationX() <= EDIT_OFFSET_X) {
            if (this.editCircleScaleAnimator != null && this.editCircleScaleAnimator.isRunning()) {
               var2 = false;
            } else {
               var2 = false;
               if (!this.easterEggIsAnimating) {
                  var var7: SwipeReplyInitiator = null;
                  if (var1.itemView is SwipeReplyInitiator) {
                     var7 = var1.itemView as SwipeReplyInitiator;
                  }

                  var2 = false;
                  if (var7 != null) {
                     var2 = false;
                     if (var7.getEnableSwipeToEdit()) {
                        var2 = true;
                     }
                  }
               }
            }
         }
      }

      return var2;
   }

   private fun triggerEditEntranceTransition(recyclerView: RecyclerView) {
      var var3: View = this.mView;
      if (this.mView == null) {
         Intrinsics.throwUninitializedPropertyAccessException("mView");
         var3 = null;
      }

      val var8: PropertyValuesHolder = PropertyValuesHolder.ofFloat(
         "edit-circle-scale", new float[]{this.editCircleScale, this.getArrowContainerGrowthRatio((float)var3.getMeasuredHeight()), 1.0F}
      );
      val var7: ValueAnimator = new ValueAnimator();
      var7.setValues(new PropertyValuesHolder[]{var8});
      var7.setDuration(300L);
      var7.setInterpolator(new AccelerateDecelerateInterpolator());
      var7.addUpdateListener(new F(this, var1));
      this.editCircleScaleAnimator = var7;
      var7.start();
      this.actionType = SwipeActionType.Edit;
      var var6: View = this.mView;
      if (this.mView == null) {
         Intrinsics.throwUninitializedPropertyAccessException("mView");
         var6 = null;
      }

      var6.performHapticFeedback(0);
   }

   @JvmStatic
   fun `triggerEditEntranceTransition$lambda$4$lambda$3`(var0: SwipeHelper, var1: RecyclerView, var2: ValueAnimator) {
      val var3: Any = var2.getAnimatedValue("edit-circle-scale");
      var0.editCircleScale = var3 as java.lang.Float;
      var1.invalidate();
   }

   private fun triggerEditExitTransition(recyclerView: RecyclerView) {
      val var2: PropertyValuesHolder = PropertyValuesHolder.ofFloat("edit-circle-scale", new float[]{this.editCircleScale, 0.0F});
      val var3: ValueAnimator = new ValueAnimator();
      var3.setValues(new PropertyValuesHolder[]{var2});
      var3.setDuration(200L);
      var3.setInterpolator(new AccelerateDecelerateInterpolator());
      var3.addUpdateListener(new E(this, var1));
      var3.addListener(new AnimatorListener(this) {
         final SwipeHelper this$0;

         {
            this.this$0 = var1;
         }

         public void onAnimationCancel(Animator var1) {
         }

         public void onAnimationEnd(Animator var1) {
            SwipeHelper.access$setActionType$p(this.this$0, SwipeActionType.Reply);
         }

         public void onAnimationRepeat(Animator var1) {
         }

         public void onAnimationStart(Animator var1) {
         }
      });
      this.editCircleScaleAnimator = var3;
      var3.start();
   }

   @JvmStatic
   fun `triggerEditExitTransition$lambda$2$lambda$0`(var0: SwipeHelper, var1: RecyclerView, var2: ValueAnimator) {
      val var3: Any = var2.getAnimatedValue("edit-circle-scale");
      var0.editCircleScale = var3 as java.lang.Float;
      var1.invalidate();
   }

   private fun updateEditTransition(recyclerView: RecyclerView, viewHolder: ViewHolder) {
      if (!this.isCompleted) {
         if (this.actionType === SwipeActionType.Edit) {
            var var3: View = this.mView;
            if (this.mView == null) {
               Intrinsics.throwUninitializedPropertyAccessException("mView");
               var3 = null;
            }

            if (var3.getTranslationX() > REPLY_RESET_X && (this.editCircleScaleAnimator == null || !this.editCircleScaleAnimator.isRunning())) {
               this.triggerEditExitTransition(var1);
               return;
            }
         }

         if (this.shouldStartEditEntrance(var2)) {
            this.triggerEditEntranceTransition(var1);
         }
      }
   }

   private fun updateHapticFeedbackTrigger(recyclerView: RecyclerView, viewHolder: ViewHolder) {
      if (this.shouldPerformHapticFeedback) {
         var var5: View = this.mView;
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            var5 = null;
         }

         if (var5.getTranslationX() <= HAPTIC_TRIGGER_X) {
            var5 = this.mView;
            if (this.mView == null) {
               Intrinsics.throwUninitializedPropertyAccessException("mView");
               var5 = null;
            }

            var5.performHapticFeedback(0);
            this.shouldPerformHapticFeedback = false;
            val var3: Int = this.easterEggPullCount + 1;
            this.easterEggPullCount += 1;
            if (var3 == 3 && !this.easterEggIsAnimating) {
               this.easterEggStartAnimation(var1, var2);
            }

            return;
         }
      }

      if (!this.shouldPerformHapticFeedback) {
         var var9: View = this.mView;
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            var9 = null;
         }

         if (var9.getTranslationX() >= HAPTIC_RESET_X) {
            this.shouldPerformHapticFeedback = true;
         }
      }
   }

   private fun updateReplyTrigger() {
      if (this.shouldTriggerReply) {
         var var2: View = this.mView;
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            var2 = null;
         }

         if (var2.getTranslationX() > REPLY_RESET_X) {
            this.shouldTriggerReply = false;
            return;
         }
      }

      if (!this.shouldTriggerReply) {
         var var5: View = this.mView;
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            var5 = null;
         }

         if (var5.getTranslationX() <= HAPTIC_TRIGGER_X) {
            this.shouldTriggerReply = true;
         }
      }
   }

   private fun updateShadow(viewHolder: ViewHolder) {
      val var5: Boolean = var1.itemView is SwipeReplyInitiator;
      var var6: View = null;
      val var9: SwipeReplyInitiator;
      if (var5) {
         var9 = var1.itemView as SwipeReplyInitiator;
      } else {
         var9 = null;
      }

      if (var9 != null) {
         val var2: Float = this.getSwipeProgress();
         val var4: Float = SizeUtilsKt.getDpToPx(12);
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
         } else {
            var6 = this.mView;
         }

         val var3: Float = this.getLeftBevelRadius(var2, (float)var6.getMeasuredHeight());
         val var10: java.lang.String;
         if (ThemeManager.INSTANCE.isThemeLight()) {
            var10 = "#1F000000";
         } else {
            var10 = "#3E000000";
         }

         var9.getShadowView().setParams(var4 * var2, var3, var10);
      }
   }

   public override fun getAnimationDuration(recyclerView: RecyclerView, animationType: Int, animateDx: Float, animateDy: Float): Long {
      return 300L;
   }

   public override fun getEffectiveDxDy(rawDx: Float, rawDy: Float): Pair<Float, Float> {
      return if (var1 >= SWIPE_STOP_OFFSET_X)
         new Pair(var1, var2)
         else
         new Pair((float)SWIPE_STOP_OFFSET_X - (float)Math.atan((double)(Math.abs(var1 - (float)SWIPE_STOP_OFFSET_X) / 120.0F)) * 120.0F, var2);
   }

   public override fun getMovementFlags(recyclerView: RecyclerView, viewHolder: ViewHolder): Int {
      val var4: View = var2.itemView;
      this.mView = var2.itemView;
      val var5: SwipeReplyInitiator;
      if (var4 is SwipeReplyInitiator) {
         var5 = var4 as SwipeReplyInitiator;
      } else {
         var5 = null;
      }

      val var3: Byte;
      if (var5 != null && var5.getEnableSwipeToReply()) {
         var3 = 4;
      } else {
         var3 = 0;
      }

      return androidx.recyclerview.widget.e.makeMovementFlags(0, var3);
   }

   public override fun onChildDraw(
      c: Canvas,
      recyclerView: RecyclerView,
      viewHolder: ViewHolder,
      dX: Float,
      dY: Float,
      actionState: Int,
      isCurrentlyActive: Boolean
   ) {
      super.onChildDraw(var1, var2, var3, var4, var5, var6, var7);
      this.dX = var4;
      this.currentItemViewHolder = var3;
      this.drawContextArea(var1);
      this.updateHapticFeedbackTrigger(var2, var3);
      this.updateReplyTrigger();
      this.updateShadow(var3);
      this.updateEditTransition(var2, var3);
      if (this.swipeBack && this.isActive && var4 >= -1.0F) {
         this.onEnd.invoke();
         val var9: SwipeReplyInitiator;
         if (var3.itemView is SwipeReplyInitiator) {
            var9 = var3.itemView as SwipeReplyInitiator;
         } else {
            var9 = null;
         }

         if (var9 != null) {
            var9.onSwipeEnd();
         }

         this.isActive = false;
      }
   }

   public override fun onMove(recyclerView: RecyclerView, viewHolder: ViewHolder, target: ViewHolder): Boolean {
      return false;
   }

   public override fun onReleased(recyclerView: RecyclerView, viewHolder: ViewHolder?) {
      this.swipeBack = true;
      if (this.shouldTriggerReply) {
         val var4: View;
         if (var2 != null) {
            var4 = var2.itemView;
         } else {
            var4 = null;
         }

         val var5: SwipeReplyInitiator;
         if (var4 is SwipeReplyInitiator) {
            var5 = var4 as SwipeReplyInitiator;
         } else {
            var5 = null;
         }

         if (var5 != null) {
            val var3: Int = SwipeHelper.WhenMappings.$EnumSwitchMapping$0[this.actionType.ordinal()];
            if (var3 != 1) {
               if (var3 != 2) {
                  throw new Ja.p();
               }

               var5.getOnInitiateEdit().invoke();
            } else {
               var5.getOnInitiateReply().invoke();
            }

            this.isCompleted = true;
         }
      }

      this.handler.removeCallbacksAndMessages(null);
   }

   public override fun onSelectedChanged(viewHolder: ViewHolder?, actionState: Int) {
      super.onSelectedChanged(var1, var2);
      val var3: Boolean;
      if (var1 == null && var2 == 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.swipeBack = var3;
      if (var2 == 1 && !this.isActive) {
         this.onStart.invoke();
         var var4: SwipeReplyInitiator = null;
         val var5: View;
         if (var1 != null) {
            var5 = var1.itemView;
         } else {
            var5 = null;
         }

         if (var5 is SwipeReplyInitiator) {
            var4 = var5 as SwipeReplyInitiator;
         }

         if (var4 != null) {
            var4.onSwipeStart();
            this.isCompleted = false;
            this.actionType = SwipeActionType.Reply;
            this.editCircleScale = 0.0F;
         }

         this.easterEggPullCount = 0;
         this.isActive = true;
      }
   }

   public override fun onSwiped(viewHolder: ViewHolder, direction: Int) {
   }

   public override fun shouldReturnToOriginalPosition(): Boolean {
      return true;
   }

   public override fun shouldUseSpringyExit(): Boolean {
      return this.shouldTriggerReply;
   }

   public companion object {
      private final val MAX_CONTEXT_AREA_WIDTH: Int
      private final val SWIPE_STOP_OFFSET_X: Int
      private final val HAPTIC_TRIGGER_X: Int
      private final val HAPTIC_RESET_X: Int
      private final val REPLY_RESET_X: Int
      private final val EDIT_OFFSET_X: Int
      private final val MAX_RIGHT_BEVEL_WIDTH: Int
      private final val RIGHT_BEVEL_HEIGHT: Int
      private final val MAX_LEFT_BEVEL_RADIUS: Int
      private const val ANIM_VALUE_ARROW_SCALE: String
      private const val ANIM_VALUE_ARROW_ROTATION: String
      private const val ANIM_RETURN_DURATION: Long
      private const val ANIM_VALUE_EDIT_CIRCLE_SCALE: String
   }
}
