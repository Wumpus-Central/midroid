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
import com.discord.chat.R.drawable
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
      this.replyIcon = GetDrawableCompatKt.getDrawableCompat(var1, drawable.ic_swipe_reply);
      this.editIcon = GetDrawableCompatKt.getDrawableCompat(var1, drawable.ic_swipe_edit);
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
      // 004: ifnull 525
      // 007: aload 0
      // 008: getfield com/discord/chat/presentation/list/SwipeHelper.dX F
      // 00b: fconst_0
      // 00c: fcmpg
      // 00d: ifne 011
      // 010: return
      // 011: aload 0
      // 012: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 015: astore 20
      // 017: aload 20
      // 019: astore 19
      // 01b: aload 20
      // 01d: ifnonnull 029
      // 020: ldc_w "mView"
      // 023: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 026: aconst_null
      // 027: astore 19
      // 029: aload 19
      // 02b: invokevirtual android/view/View.getTranslationX ()F
      // 02e: invokestatic java/lang/Math.abs (F)F
      // 031: fstore 4
      // 033: aload 0
      // 034: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 037: astore 20
      // 039: aload 20
      // 03b: astore 19
      // 03d: aload 20
      // 03f: ifnonnull 04b
      // 042: ldc_w "mView"
      // 045: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 048: aconst_null
      // 049: astore 19
      // 04b: aload 19
      // 04d: invokevirtual android/view/View.getMeasuredHeight ()I
      // 050: i2f
      // 051: fstore 5
      // 053: new android/graphics/Paint
      // 056: dup
      // 057: invokespecial android/graphics/Paint.<init> ()V
      // 05a: astore 21
      // 05c: aload 0
      // 05d: getfield com/discord/chat/presentation/list/SwipeHelper.currentItemViewHolder Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
      // 060: astore 19
      // 062: aload 19
      // 064: ifnull 071
      // 067: aload 19
      // 069: getfield androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView Landroid/view/View;
      // 06c: astore 19
      // 06e: goto 074
      // 071: aconst_null
      // 072: astore 19
      // 074: aload 19
      // 076: instanceof com/discord/chat/presentation/list/SwipeReplyInitiator
      // 079: ifeq 086
      // 07c: aload 19
      // 07e: checkcast com/discord/chat/presentation/list/SwipeReplyInitiator
      // 081: astore 19
      // 083: goto 089
      // 086: aconst_null
      // 087: astore 19
      // 089: getstatic android/graphics/Paint$Style.FILL Landroid/graphics/Paint$Style;
      // 08c: astore 22
      // 08e: aload 21
      // 090: aload 22
      // 092: invokevirtual android/graphics/Paint.setStyle (Landroid/graphics/Paint$Style;)V
      // 095: aload 19
      // 097: ifnull 0b3
      // 09a: aload 19
      // 09c: invokeinterface com/discord/chat/presentation/list/SwipeReplyInitiator.getUsingGradientTheme ()Z 1
      // 0a1: bipush 1
      // 0a2: if_icmpne 0b3
      // 0a5: aload 21
      // 0a7: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 0aa: invokevirtual com/discord/theme/DiscordThemeObject.getChatSwipeToReplyGradientBackground ()I
      // 0ad: invokevirtual android/graphics/Paint.setColor (I)V
      // 0b0: goto 0be
      // 0b3: aload 21
      // 0b5: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 0b8: invokevirtual com/discord/theme/DiscordThemeObject.getChatSwipeToReplyBackground ()I
      // 0bb: invokevirtual android/graphics/Paint.setColor (I)V
      // 0be: aload 1
      // 0bf: invokevirtual android/graphics/Canvas.save ()I
      // 0c2: pop
      // 0c3: aload 0
      // 0c4: invokespecial com/discord/chat/presentation/list/SwipeHelper.getSwipeProgress ()F
      // 0c7: fstore 2
      // 0c8: aload 0
      // 0c9: fload 2
      // 0ca: fload 5
      // 0cc: invokespecial com/discord/chat/presentation/list/SwipeHelper.getLeftBevelRadius (FF)F
      // 0cf: fstore 7
      // 0d1: getstatic com/discord/chat/presentation/list/SwipeHelper.MAX_RIGHT_BEVEL_WIDTH I
      // 0d4: i2f
      // 0d5: fload 2
      // 0d6: fmul
      // 0d7: fstore 12
      // 0d9: aload 0
      // 0da: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 0dd: astore 20
      // 0df: aload 20
      // 0e1: astore 19
      // 0e3: aload 20
      // 0e5: ifnonnull 0f1
      // 0e8: ldc_w "mView"
      // 0eb: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 0ee: aconst_null
      // 0ef: astore 19
      // 0f1: aload 19
      // 0f3: invokevirtual android/view/View.getMeasuredWidth ()I
      // 0f6: i2f
      // 0f7: fstore 3
      // 0f8: aload 0
      // 0f9: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 0fc: astore 20
      // 0fe: aload 20
      // 100: astore 19
      // 102: aload 20
      // 104: ifnonnull 110
      // 107: ldc_w "mView"
      // 10a: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 10d: aconst_null
      // 10e: astore 19
      // 110: fload 3
      // 111: aload 19
      // 113: invokevirtual android/view/View.getTranslationX ()F
      // 116: fadd
      // 117: fstore 6
      // 119: fload 6
      // 11b: fload 7
      // 11d: fsub
      // 11e: fstore 10
      // 120: fload 6
      // 122: fload 4
      // 124: fadd
      // 125: fstore 3
      // 126: fload 3
      // 127: fload 12
      // 129: fsub
      // 12a: fstore 13
      // 12c: aload 0
      // 12d: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 130: astore 20
      // 132: aload 20
      // 134: astore 19
      // 136: aload 20
      // 138: ifnonnull 144
      // 13b: ldc_w "mView"
      // 13e: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 141: aconst_null
      // 142: astore 19
      // 144: aload 19
      // 146: invokevirtual android/view/View.getTop ()I
      // 149: i2f
      // 14a: fstore 8
      // 14c: getstatic com/discord/chat/presentation/list/SwipeHelper.RIGHT_BEVEL_HEIGHT I
      // 14f: istore 16
      // 151: fload 8
      // 153: iload 16
      // 155: i2f
      // 156: fsub
      // 157: fstore 14
      // 159: fload 14
      // 15b: iload 16
      // 15d: i2f
      // 15e: fadd
      // 15f: fstore 9
      // 161: fload 14
      // 163: fload 5
      // 165: fadd
      // 166: iload 16
      // 168: bipush 2
      // 169: imul
      // 16a: i2f
      // 16b: fadd
      // 16c: fstore 15
      // 16e: fload 15
      // 170: iload 16
      // 172: i2f
      // 173: fsub
      // 174: fstore 11
      // 176: new android/graphics/Path
      // 179: dup
      // 17a: invokespecial android/graphics/Path.<init> ()V
      // 17d: astore 19
      // 17f: aload 19
      // 181: fload 13
      // 183: fload 11
      // 185: invokevirtual android/graphics/Path.moveTo (FF)V
      // 188: aload 19
      // 18a: fload 6
      // 18c: fload 11
      // 18e: invokevirtual android/graphics/Path.lineTo (FF)V
      // 191: aload 19
      // 193: fload 6
      // 195: fload 9
      // 197: fload 7
      // 199: fadd
      // 19a: invokevirtual android/graphics/Path.lineTo (FF)V
      // 19d: bipush 2
      // 19e: i2f
      // 19f: fstore 8
      // 1a1: aload 19
      // 1a3: fload 10
      // 1a5: fload 7
      // 1a7: fsub
      // 1a8: fload 9
      // 1aa: fload 6
      // 1ac: fload 9
      // 1ae: fload 8
      // 1b0: fload 7
      // 1b2: fmul
      // 1b3: fadd
      // 1b4: fconst_0
      // 1b5: ldc_w -90.0
      // 1b8: invokevirtual android/graphics/Path.addArc (FFFFFF)V
      // 1bb: aload 19
      // 1bd: fload 13
      // 1bf: fload 9
      // 1c1: invokevirtual android/graphics/Path.lineTo (FF)V
      // 1c4: fload 13
      // 1c6: fload 12
      // 1c8: ldc_w 0.55
      // 1cb: fmul
      // 1cc: fadd
      // 1cd: fstore 12
      // 1cf: aload 19
      // 1d1: fload 12
      // 1d3: fload 9
      // 1d5: fload 3
      // 1d6: fload 14
      // 1d8: iload 16
      // 1da: i2f
      // 1db: ldc_w 0.55
      // 1de: fmul
      // 1df: fadd
      // 1e0: fload 3
      // 1e1: fload 14
      // 1e3: invokevirtual android/graphics/Path.cubicTo (FFFFFF)V
      // 1e6: aload 19
      // 1e8: fload 3
      // 1e9: fload 15
      // 1eb: invokevirtual android/graphics/Path.lineTo (FF)V
      // 1ee: aload 19
      // 1f0: fload 3
      // 1f1: fload 15
      // 1f3: iload 16
      // 1f5: i2f
      // 1f6: ldc_w 0.55
      // 1f9: fmul
      // 1fa: fsub
      // 1fb: fload 12
      // 1fd: fload 11
      // 1ff: fload 13
      // 201: fload 11
      // 203: invokevirtual android/graphics/Path.cubicTo (FFFFFF)V
      // 206: aload 1
      // 207: invokevirtual android/graphics/Canvas.save ()I
      // 20a: pop
      // 20b: aload 1
      // 20c: aload 19
      // 20e: invokevirtual android/graphics/Canvas.clipPath (Landroid/graphics/Path;)Z
      // 211: pop
      // 212: aload 1
      // 213: fload 10
      // 215: fload 14
      // 217: fload 3
      // 218: fload 15
      // 21a: aload 21
      // 21c: invokevirtual android/graphics/Canvas.drawRect (FFFFLandroid/graphics/Paint;)V
      // 21f: aload 1
      // 220: invokevirtual android/graphics/Canvas.restore ()V
      // 223: aload 1
      // 224: invokevirtual android/graphics/Canvas.save ()I
      // 227: pop
      // 228: aload 19
      // 22a: invokevirtual android/graphics/Path.reset ()V
      // 22d: fload 11
      // 22f: fload 7
      // 231: fsub
      // 232: fstore 12
      // 234: aload 19
      // 236: fload 10
      // 238: fload 12
      // 23a: fload 7
      // 23c: getstatic android/graphics/Path$Direction.CW Landroid/graphics/Path$Direction;
      // 23f: invokevirtual android/graphics/Path.addCircle (FFFLandroid/graphics/Path$Direction;)V
      // 242: getstatic android/os/Build$VERSION.SDK_INT I
      // 245: bipush 26
      // 247: if_icmplt 254
      // 24a: aload 1
      // 24b: aload 19
      // 24d: invokevirtual android/graphics/Canvas.clipOutPath (Landroid/graphics/Path;)Z
      // 250: pop
      // 251: goto 261
      // 254: aload 1
      // 255: aload 19
      // 257: getstatic android/graphics/Region$Op.DIFFERENCE Landroid/graphics/Region$Op;
      // 25a: invokevirtual android/graphics/Canvas.clipPath (Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
      // 25d: pop
      // 25e: goto 251
      // 261: aload 1
      // 262: fload 10
      // 264: fload 12
      // 266: fload 6
      // 268: fload 11
      // 26a: aload 21
      // 26c: invokevirtual android/graphics/Canvas.drawRect (FFFFLandroid/graphics/Paint;)V
      // 26f: aload 1
      // 270: invokevirtual android/graphics/Canvas.restore ()V
      // 273: aload 0
      // 274: fload 5
      // 276: invokespecial com/discord/chat/presentation/list/SwipeHelper.getArrowContainerBaseSize (F)F
      // 279: fload 8
      // 27b: fdiv
      // 27c: fstore 7
      // 27e: fload 4
      // 280: fload 8
      // 282: fdiv
      // 283: fstore 4
      // 285: fload 9
      // 287: fload 5
      // 289: fload 8
      // 28b: fdiv
      // 28c: fadd
      // 28d: fload 7
      // 28f: fsub
      // 290: f2i
      // 291: istore 17
      // 293: sipush 192
      // 296: i2f
      // 297: fload 2
      // 298: fmul
      // 299: f2i
      // 29a: bipush 64
      // 29c: iadd
      // 29d: bipush 0
      // 29e: sipush 255
      // 2a1: invokestatic kotlin/ranges/e.n (III)I
      // 2a4: istore 16
      // 2a6: aload 1
      // 2a7: invokevirtual android/graphics/Canvas.save ()I
      // 2aa: pop
      // 2ab: aload 1
      // 2ac: fload 6
      // 2ae: fconst_0
      // 2af: fload 3
      // 2b0: aload 1
      // 2b1: invokevirtual android/graphics/Canvas.getHeight ()I
      // 2b4: i2f
      // 2b5: invokevirtual android/graphics/Canvas.clipRect (FFFF)Z
      // 2b8: pop
      // 2b9: aload 1
      // 2ba: fload 6
      // 2bc: fload 4
      // 2be: fadd
      // 2bf: fload 7
      // 2c1: fsub
      // 2c2: fload 7
      // 2c4: fadd
      // 2c5: iload 17
      // 2c7: i2f
      // 2c8: fload 7
      // 2ca: fadd
      // 2cb: invokevirtual android/graphics/Canvas.translate (FF)V
      // 2ce: aload 0
      // 2cf: getfield com/discord/chat/presentation/list/SwipeHelper.easterEggArrowScale F
      // 2d2: fstore 3
      // 2d3: aload 1
      // 2d4: fload 3
      // 2d5: fload 3
      // 2d6: invokevirtual android/graphics/Canvas.scale (FF)V
      // 2d9: aload 0
      // 2da: getfield com/discord/chat/presentation/list/SwipeHelper.isCompleted Z
      // 2dd: ifeq 2e5
      // 2e0: fconst_1
      // 2e1: fstore 3
      // 2e2: goto 2e7
      // 2e5: fload 2
      // 2e6: fstore 3
      // 2e7: aload 21
      // 2e9: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 2ec: invokevirtual com/discord/theme/DiscordThemeObject.getBgSurfaceOverlay ()I
      // 2ef: aload 0
      // 2f0: getfield com/discord/chat/presentation/list/SwipeHelper.context Landroid/content/Context;
      // 2f3: getstatic com/discord/theme/R$color.brand_500 I
      // 2f6: invokestatic com/discord/theme/utils/ColorUtilsKt.getColorCompat (Landroid/content/Context;I)I
      // 2f9: fload 3
      // 2fa: ldc_w 0.8
      // 2fd: fconst_1
      // 2fe: invokestatic com/discord/theme/utils/ColorUtilsKt.interpolateColors (IIFFF)I
      // 301: invokevirtual android/graphics/Paint.setColor (I)V
      // 304: aload 21
      // 306: aload 22
      // 308: invokevirtual android/graphics/Paint.setStyle (Landroid/graphics/Paint$Style;)V
      // 30b: aload 21
      // 30d: iload 16
      // 30f: invokevirtual android/graphics/Paint.setAlpha (I)V
      // 312: getstatic com/discord/theme/ThemeManager.INSTANCE Lcom/discord/theme/ThemeManager;
      // 315: invokevirtual com/discord/theme/ThemeManager.isThemeLight ()Z
      // 318: ifeq 323
      // 31b: ldc_w "#16000000"
      // 31e: astore 19
      // 320: goto 328
      // 323: ldc_w "#24000000"
      // 326: astore 19
      // 328: aload 21
      // 32a: ldc_w 10.0
      // 32d: fconst_0
      // 32e: ldc_w 5.0
      // 331: aload 19
      // 333: invokestatic android/graphics/Color.parseColor (Ljava/lang/String;)I
      // 336: invokevirtual android/graphics/Paint.setShadowLayer (FFFI)V
      // 339: aload 1
      // 33a: fconst_0
      // 33b: fconst_0
      // 33c: fload 7
      // 33e: aload 21
      // 340: invokevirtual android/graphics/Canvas.drawCircle (FFFLandroid/graphics/Paint;)V
      // 343: aload 21
      // 345: invokevirtual android/graphics/Paint.clearShadowLayer ()V
      // 348: aload 0
      // 349: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 34c: fstore 4
      // 34e: fload 4
      // 350: fconst_0
      // 351: fcmpl
      // 352: ifle 3bc
      // 355: aload 1
      // 356: invokevirtual android/graphics/Canvas.save ()I
      // 359: istore 17
      // 35b: aload 1
      // 35c: fload 4
      // 35e: fload 4
      // 360: fconst_0
      // 361: fconst_0
      // 362: invokevirtual android/graphics/Canvas.scale (FFFF)V
      // 365: aload 0
      // 366: getfield com/discord/chat/presentation/list/SwipeHelper.isCompleted Z
      // 369: ifeq 372
      // 36c: fconst_1
      // 36d: fstore 4
      // 36f: goto 375
      // 372: fload 2
      // 373: fstore 4
      // 375: aload 21
      // 377: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 37a: invokevirtual com/discord/theme/DiscordThemeObject.getBgSurfaceOverlay ()I
      // 37d: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 380: invokevirtual com/discord/theme/DiscordThemeObject.getBackgroundAccent ()I
      // 383: fload 4
      // 385: ldc_w 0.8
      // 388: fconst_1
      // 389: invokestatic com/discord/theme/utils/ColorUtilsKt.interpolateColors (IIFFF)I
      // 38c: invokevirtual android/graphics/Paint.setColor (I)V
      // 38f: aload 21
      // 391: aload 22
      // 393: invokevirtual android/graphics/Paint.setStyle (Landroid/graphics/Paint$Style;)V
      // 396: aload 21
      // 398: sipush 255
      // 39b: invokevirtual android/graphics/Paint.setAlpha (I)V
      // 39e: aload 1
      // 39f: fconst_0
      // 3a0: fconst_0
      // 3a1: fload 7
      // 3a3: aload 21
      // 3a5: invokevirtual android/graphics/Canvas.drawCircle (FFFLandroid/graphics/Paint;)V
      // 3a8: aload 1
      // 3a9: iload 17
      // 3ab: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 3ae: goto 3bc
      // 3b1: astore 19
      // 3b3: aload 1
      // 3b4: iload 17
      // 3b6: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 3b9: aload 19
      // 3bb: athrow
      // 3bc: aload 1
      // 3bd: invokevirtual android/graphics/Canvas.save ()I
      // 3c0: pop
      // 3c1: fconst_0
      // 3c2: fconst_1
      // 3c3: bipush 1
      // 3c4: i2f
      // 3c5: aload 0
      // 3c6: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 3c9: fsub
      // 3ca: invokestatic java/lang/Float.min (FF)F
      // 3cd: invokestatic java/lang/Math.max (FF)F
      // 3d0: fstore 4
      // 3d2: aload 0
      // 3d3: fload 5
      // 3d5: invokespecial com/discord/chat/presentation/list/SwipeHelper.getArrowIconBaseSize (F)F
      // 3d8: fstore 5
      // 3da: new android/graphics/PorterDuffColorFilter
      // 3dd: dup
      // 3de: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 3e1: invokevirtual com/discord/theme/DiscordThemeObject.getInteractiveNormal ()I
      // 3e4: aload 0
      // 3e5: getfield com/discord/chat/presentation/list/SwipeHelper.context Landroid/content/Context;
      // 3e8: getstatic com/discord/theme/R$color.white I
      // 3eb: invokestatic com/discord/theme/utils/ColorUtilsKt.getColorCompat (Landroid/content/Context;I)I
      // 3ee: fload 3
      // 3ef: ldc_w 0.8
      // 3f2: fconst_1
      // 3f3: invokestatic com/discord/theme/utils/ColorUtilsKt.interpolateColors (IIFFF)I
      // 3f6: getstatic android/graphics/PorterDuff$Mode.SRC_ATOP Landroid/graphics/PorterDuff$Mode;
      // 3f9: invokespecial android/graphics/PorterDuffColorFilter.<init> (ILandroid/graphics/PorterDuff$Mode;)V
      // 3fc: astore 19
      // 3fe: aload 0
      // 3ff: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 402: astore 20
      // 404: aload 20
      // 406: ifnull 410
      // 409: aload 20
      // 40b: aload 19
      // 40d: invokevirtual android/graphics/drawable/Drawable.setColorFilter (Landroid/graphics/ColorFilter;)V
      // 410: getstatic com/discord/device/utils/DeviceReducedMotion.INSTANCE Lcom/discord/device/utils/DeviceReducedMotion;
      // 413: aload 0
      // 414: getfield com/discord/chat/presentation/list/SwipeHelper.context Landroid/content/Context;
      // 417: invokevirtual com/discord/device/utils/DeviceReducedMotion.isReducedMotionEnabled (Landroid/content/Context;)Z
      // 41a: ifeq 422
      // 41d: fconst_0
      // 41e: fstore 2
      // 41f: goto 42a
      // 422: fconst_1
      // 423: fload 2
      // 424: fsub
      // 425: ldc_w 90.0
      // 428: fmul
      // 429: fstore 2
      // 42a: aload 0
      // 42b: getfield com/discord/chat/presentation/list/SwipeHelper.easterEggArrowRotationDegrees F
      // 42e: fstore 3
      // 42f: aload 1
      // 430: ldc_w -1.0
      // 433: ldc_w -1.0
      // 436: invokevirtual android/graphics/Canvas.translate (FF)V
      // 439: fload 2
      // 43a: fload 3
      // 43b: fadd
      // 43c: fstore 2
      // 43d: aload 1
      // 43e: fload 2
      // 43f: invokevirtual android/graphics/Canvas.rotate (F)V
      // 442: aload 1
      // 443: fload 4
      // 445: fload 4
      // 447: invokevirtual android/graphics/Canvas.scale (FF)V
      // 44a: fload 5
      // 44c: fconst_2
      // 44d: fdiv
      // 44e: f2i
      // 44f: istore 18
      // 451: iload 18
      // 453: ineg
      // 454: istore 17
      // 456: new android/graphics/Rect
      // 459: dup
      // 45a: iload 17
      // 45c: iload 17
      // 45e: iload 18
      // 460: iload 18
      // 462: invokespecial android/graphics/Rect.<init> (IIII)V
      // 465: astore 20
      // 467: aload 0
      // 468: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 46b: astore 21
      // 46d: aload 21
      // 46f: ifnull 479
      // 472: aload 21
      // 474: aload 20
      // 476: invokevirtual android/graphics/drawable/Drawable.setBounds (Landroid/graphics/Rect;)V
      // 479: aload 0
      // 47a: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 47d: astore 21
      // 47f: aload 21
      // 481: ifnull 48b
      // 484: aload 21
      // 486: iload 16
      // 488: invokevirtual android/graphics/drawable/Drawable.setAlpha (I)V
      // 48b: aload 0
      // 48c: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 48f: astore 21
      // 491: aload 21
      // 493: ifnull 49c
      // 496: aload 21
      // 498: aload 1
      // 499: invokevirtual android/graphics/drawable/Drawable.draw (Landroid/graphics/Canvas;)V
      // 49c: aload 1
      // 49d: invokevirtual android/graphics/Canvas.restore ()V
      // 4a0: aload 0
      // 4a1: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 4a4: fconst_0
      // 4a5: fcmpl
      // 4a6: ifle 521
      // 4a9: aload 1
      // 4aa: invokevirtual android/graphics/Canvas.save ()I
      // 4ad: istore 16
      // 4af: aload 0
      // 4b0: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 4b3: astore 21
      // 4b5: aload 21
      // 4b7: ifnull 4c9
      // 4ba: aload 21
      // 4bc: aload 19
      // 4be: invokevirtual android/graphics/drawable/Drawable.setColorFilter (Landroid/graphics/ColorFilter;)V
      // 4c1: goto 4c9
      // 4c4: astore 19
      // 4c6: goto 518
      // 4c9: aload 1
      // 4ca: fload 2
      // 4cb: invokevirtual android/graphics/Canvas.rotate (F)V
      // 4ce: aload 0
      // 4cf: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 4d2: fstore 2
      // 4d3: aload 1
      // 4d4: fload 2
      // 4d5: fload 2
      // 4d6: invokevirtual android/graphics/Canvas.scale (FF)V
      // 4d9: aload 0
      // 4da: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 4dd: astore 19
      // 4df: aload 19
      // 4e1: ifnull 4eb
      // 4e4: aload 19
      // 4e6: aload 20
      // 4e8: invokevirtual android/graphics/drawable/Drawable.setBounds (Landroid/graphics/Rect;)V
      // 4eb: aload 0
      // 4ec: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 4ef: astore 19
      // 4f1: aload 19
      // 4f3: ifnull 4fe
      // 4f6: aload 19
      // 4f8: sipush 255
      // 4fb: invokevirtual android/graphics/drawable/Drawable.setAlpha (I)V
      // 4fe: aload 0
      // 4ff: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 502: astore 19
      // 504: aload 19
      // 506: ifnull 50f
      // 509: aload 19
      // 50b: aload 1
      // 50c: invokevirtual android/graphics/drawable/Drawable.draw (Landroid/graphics/Canvas;)V
      // 50f: aload 1
      // 510: iload 16
      // 512: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 515: goto 521
      // 518: aload 1
      // 519: iload 16
      // 51b: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 51e: aload 19
      // 520: athrow
      // 521: aload 1
      // 522: invokevirtual android/graphics/Canvas.restore ()V
      // 525: return
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
         val var7: ValueAnimator = new ValueAnimator();
         var7.setValues(new PropertyValuesHolder[]{var5});
         var7.setDuration(300L);
         var7.setInterpolator(new AccelerateDecelerateInterpolator());
         var7.addUpdateListener(new b0(this, var1));
         this.easterEggArrowAnimator = var7;
         var7.start();
         val var8: PropertyValuesHolder = PropertyValuesHolder.ofFloat("arrow-rotation", new float[]{720.0F, 0.0F});
         val var6: ValueAnimator = new ValueAnimator();
         var6.setValues(new PropertyValuesHolder[]{var8});
         var6.setDuration(800L);
         var6.setInterpolator(new PathInterpolator(0.0F, 0.0F, 0.25F, 1.0F));
         var6.addUpdateListener(new c0(this, var1));
         var6.addListener(new AnimatorListener(this, var2, var1) {
            final RecyclerView $recyclerView$inlined;
            final ViewHolder $viewHolder$inlined;
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
         this.easterEggArrowRotationAnimator = var6;
         var6.start();
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
      if (this.actionType === SwipeActionType.Reply) {
         var var2: View = this.mView;
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            var2 = null;
         }

         if (var2.getTranslationX() <= EDIT_OFFSET_X
            && (this.editCircleScaleAnimator == null || !this.editCircleScaleAnimator.isRunning())
            && !this.easterEggIsAnimating) {
            var var5: SwipeReplyInitiator = null;
            if (var1.itemView is SwipeReplyInitiator) {
               var5 = var1.itemView as SwipeReplyInitiator;
            }

            if (var5 != null && var5.getEnableSwipeToEdit()) {
               return true;
            }
         }
      }

      return false;
   }

   private fun triggerEditEntranceTransition(recyclerView: RecyclerView) {
      var var3: View = this.mView;
      if (this.mView == null) {
         Intrinsics.throwUninitializedPropertyAccessException("mView");
         var3 = null;
      }

      val var7: PropertyValuesHolder = PropertyValuesHolder.ofFloat(
         "edit-circle-scale", new float[]{this.editCircleScale, this.getArrowContainerGrowthRatio((float)var3.getMeasuredHeight()), 1.0F}
      );
      val var8: ValueAnimator = new ValueAnimator();
      var8.setValues(new PropertyValuesHolder[]{var7});
      var8.setDuration(300L);
      var8.setInterpolator(new AccelerateDecelerateInterpolator());
      var8.addUpdateListener(new e0(this, var1));
      this.editCircleScaleAnimator = var8;
      var8.start();
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
      var3.addUpdateListener(new d0(this, var1));
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
               return;
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
         val var4: Float = this.getSwipeProgress();
         val var2: Float = SizeUtilsKt.getDpToPx(12);
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
         } else {
            var6 = this.mView;
         }

         val var3: Float = this.getLeftBevelRadius(var4, (float)var6.getMeasuredHeight());
         val var10: java.lang.String;
         if (ThemeManager.INSTANCE.isThemeLight()) {
            var10 = "#1F000000";
         } else {
            var10 = "#3E000000";
         }

         var9.getShadowView().setParams(var2 * var4, var3, var10);
      }
   }

   public open fun getAnimationDuration(recyclerView: RecyclerView, animationType: Int, animateDx: Float, animateDy: Float): Long {
      return 300L;
   }

   public override fun getEffectiveDxDy(rawDx: Float, rawDy: Float): Pair<Float, Float> {
      return if (var1 >= SWIPE_STOP_OFFSET_X)
         new Pair(var1, var2)
         else
         new Pair((float)SWIPE_STOP_OFFSET_X - (float)Math.atan((double)(Math.abs(var1 - (float)SWIPE_STOP_OFFSET_X) / 120.0F)) * 120.0F, var2);
   }

   public open fun getMovementFlags(recyclerView: RecyclerView, viewHolder: ViewHolder): Int {
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

      return androidx.recyclerview.widget.h.makeMovementFlags(0, var3);
   }

   public open fun onChildDraw(
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

   public open fun onMove(recyclerView: RecyclerView, viewHolder: ViewHolder, target: ViewHolder): Boolean {
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
                  throw new ht.p();
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

   public open fun onSelectedChanged(viewHolder: ViewHolder?, actionState: Int) {
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

   public open fun onSwiped(viewHolder: ViewHolder, direction: Int) {
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
