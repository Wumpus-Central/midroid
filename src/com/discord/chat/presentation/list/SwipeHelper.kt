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
      // 004: ifnull 524
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
      // 031: fstore 6
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
      // 0cf: fstore 8
      // 0d1: getstatic com/discord/chat/presentation/list/SwipeHelper.MAX_RIGHT_BEVEL_WIDTH I
      // 0d4: i2f
      // 0d5: fload 2
      // 0d6: fmul
      // 0d7: fstore 11
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
      // 117: fstore 3
      // 118: fload 3
      // 119: fload 8
      // 11b: fsub
      // 11c: fstore 10
      // 11e: fload 3
      // 11f: fload 6
      // 121: fadd
      // 122: fstore 4
      // 124: fload 4
      // 126: fload 11
      // 128: fsub
      // 129: fstore 12
      // 12b: aload 0
      // 12c: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 12f: astore 20
      // 131: aload 20
      // 133: astore 19
      // 135: aload 20
      // 137: ifnonnull 143
      // 13a: ldc_w "mView"
      // 13d: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 140: aconst_null
      // 141: astore 19
      // 143: aload 19
      // 145: invokevirtual android/view/View.getTop ()I
      // 148: i2f
      // 149: fstore 7
      // 14b: getstatic com/discord/chat/presentation/list/SwipeHelper.RIGHT_BEVEL_HEIGHT I
      // 14e: istore 16
      // 150: fload 7
      // 152: iload 16
      // 154: i2f
      // 155: fsub
      // 156: fstore 15
      // 158: fload 15
      // 15a: iload 16
      // 15c: i2f
      // 15d: fadd
      // 15e: fstore 7
      // 160: fload 15
      // 162: fload 5
      // 164: fadd
      // 165: iload 16
      // 167: bipush 2
      // 168: imul
      // 169: i2f
      // 16a: fadd
      // 16b: fstore 14
      // 16d: fload 14
      // 16f: iload 16
      // 171: i2f
      // 172: fsub
      // 173: fstore 13
      // 175: new android/graphics/Path
      // 178: dup
      // 179: invokespecial android/graphics/Path.<init> ()V
      // 17c: astore 19
      // 17e: aload 19
      // 180: fload 12
      // 182: fload 13
      // 184: invokevirtual android/graphics/Path.moveTo (FF)V
      // 187: aload 19
      // 189: fload 3
      // 18a: fload 13
      // 18c: invokevirtual android/graphics/Path.lineTo (FF)V
      // 18f: aload 19
      // 191: fload 3
      // 192: fload 7
      // 194: fload 8
      // 196: fadd
      // 197: invokevirtual android/graphics/Path.lineTo (FF)V
      // 19a: bipush 2
      // 19b: i2f
      // 19c: fstore 9
      // 19e: aload 19
      // 1a0: fload 10
      // 1a2: fload 8
      // 1a4: fsub
      // 1a5: fload 7
      // 1a7: fload 3
      // 1a8: fload 7
      // 1aa: fload 9
      // 1ac: fload 8
      // 1ae: fmul
      // 1af: fadd
      // 1b0: fconst_0
      // 1b1: ldc_w -90.0
      // 1b4: invokevirtual android/graphics/Path.addArc (FFFFFF)V
      // 1b7: aload 19
      // 1b9: fload 12
      // 1bb: fload 7
      // 1bd: invokevirtual android/graphics/Path.lineTo (FF)V
      // 1c0: fload 12
      // 1c2: fload 11
      // 1c4: ldc_w 0.55
      // 1c7: fmul
      // 1c8: fadd
      // 1c9: fstore 11
      // 1cb: aload 19
      // 1cd: fload 11
      // 1cf: fload 7
      // 1d1: fload 4
      // 1d3: fload 15
      // 1d5: iload 16
      // 1d7: i2f
      // 1d8: ldc_w 0.55
      // 1db: fmul
      // 1dc: fadd
      // 1dd: fload 4
      // 1df: fload 15
      // 1e1: invokevirtual android/graphics/Path.cubicTo (FFFFFF)V
      // 1e4: aload 19
      // 1e6: fload 4
      // 1e8: fload 14
      // 1ea: invokevirtual android/graphics/Path.lineTo (FF)V
      // 1ed: aload 19
      // 1ef: fload 4
      // 1f1: fload 14
      // 1f3: iload 16
      // 1f5: i2f
      // 1f6: ldc_w 0.55
      // 1f9: fmul
      // 1fa: fsub
      // 1fb: fload 11
      // 1fd: fload 13
      // 1ff: fload 12
      // 201: fload 13
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
      // 215: fload 15
      // 217: fload 4
      // 219: fload 14
      // 21b: aload 21
      // 21d: invokevirtual android/graphics/Canvas.drawRect (FFFFLandroid/graphics/Paint;)V
      // 220: aload 1
      // 221: invokevirtual android/graphics/Canvas.restore ()V
      // 224: aload 1
      // 225: invokevirtual android/graphics/Canvas.save ()I
      // 228: pop
      // 229: aload 19
      // 22b: invokevirtual android/graphics/Path.reset ()V
      // 22e: fload 13
      // 230: fload 8
      // 232: fsub
      // 233: fstore 11
      // 235: aload 19
      // 237: fload 10
      // 239: fload 11
      // 23b: fload 8
      // 23d: getstatic android/graphics/Path$Direction.CW Landroid/graphics/Path$Direction;
      // 240: invokevirtual android/graphics/Path.addCircle (FFFLandroid/graphics/Path$Direction;)V
      // 243: getstatic android/os/Build$VERSION.SDK_INT I
      // 246: bipush 26
      // 248: if_icmplt 255
      // 24b: aload 1
      // 24c: aload 19
      // 24e: invokevirtual android/graphics/Canvas.clipOutPath (Landroid/graphics/Path;)Z
      // 251: pop
      // 252: goto 262
      // 255: aload 1
      // 256: aload 19
      // 258: getstatic android/graphics/Region$Op.DIFFERENCE Landroid/graphics/Region$Op;
      // 25b: invokevirtual android/graphics/Canvas.clipPath (Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
      // 25e: pop
      // 25f: goto 252
      // 262: aload 1
      // 263: fload 10
      // 265: fload 11
      // 267: fload 3
      // 268: fload 13
      // 26a: aload 21
      // 26c: invokevirtual android/graphics/Canvas.drawRect (FFFFLandroid/graphics/Paint;)V
      // 26f: aload 1
      // 270: invokevirtual android/graphics/Canvas.restore ()V
      // 273: aload 0
      // 274: fload 5
      // 276: invokespecial com/discord/chat/presentation/list/SwipeHelper.getArrowContainerBaseSize (F)F
      // 279: fload 9
      // 27b: fdiv
      // 27c: fstore 8
      // 27e: fload 6
      // 280: fload 9
      // 282: fdiv
      // 283: fstore 6
      // 285: fload 7
      // 287: fload 5
      // 289: fload 9
      // 28b: fdiv
      // 28c: fadd
      // 28d: fload 8
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
      // 2a1: invokestatic kotlin/ranges/e.m (III)I
      // 2a4: istore 16
      // 2a6: aload 1
      // 2a7: invokevirtual android/graphics/Canvas.save ()I
      // 2aa: pop
      // 2ab: aload 1
      // 2ac: fload 3
      // 2ad: fconst_0
      // 2ae: fload 4
      // 2b0: aload 1
      // 2b1: invokevirtual android/graphics/Canvas.getHeight ()I
      // 2b4: i2f
      // 2b5: invokevirtual android/graphics/Canvas.clipRect (FFFF)Z
      // 2b8: pop
      // 2b9: aload 1
      // 2ba: fload 3
      // 2bb: fload 6
      // 2bd: fadd
      // 2be: fload 8
      // 2c0: fsub
      // 2c1: fload 8
      // 2c3: fadd
      // 2c4: iload 17
      // 2c6: i2f
      // 2c7: fload 8
      // 2c9: fadd
      // 2ca: invokevirtual android/graphics/Canvas.translate (FF)V
      // 2cd: aload 0
      // 2ce: getfield com/discord/chat/presentation/list/SwipeHelper.easterEggArrowScale F
      // 2d1: fstore 3
      // 2d2: aload 1
      // 2d3: fload 3
      // 2d4: fload 3
      // 2d5: invokevirtual android/graphics/Canvas.scale (FF)V
      // 2d8: aload 0
      // 2d9: getfield com/discord/chat/presentation/list/SwipeHelper.isCompleted Z
      // 2dc: ifeq 2e4
      // 2df: fconst_1
      // 2e0: fstore 3
      // 2e1: goto 2e6
      // 2e4: fload 2
      // 2e5: fstore 3
      // 2e6: aload 21
      // 2e8: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 2eb: invokevirtual com/discord/theme/DiscordThemeObject.getBgSurfaceOverlay ()I
      // 2ee: aload 0
      // 2ef: getfield com/discord/chat/presentation/list/SwipeHelper.context Landroid/content/Context;
      // 2f2: getstatic com/discord/theme/R$color.brand_500 I
      // 2f5: invokestatic com/discord/theme/utils/ColorUtilsKt.getColorCompat (Landroid/content/Context;I)I
      // 2f8: fload 3
      // 2f9: ldc_w 0.8
      // 2fc: fconst_1
      // 2fd: invokestatic com/discord/theme/utils/ColorUtilsKt.interpolateColors (IIFFF)I
      // 300: invokevirtual android/graphics/Paint.setColor (I)V
      // 303: aload 21
      // 305: aload 22
      // 307: invokevirtual android/graphics/Paint.setStyle (Landroid/graphics/Paint$Style;)V
      // 30a: aload 21
      // 30c: iload 16
      // 30e: invokevirtual android/graphics/Paint.setAlpha (I)V
      // 311: getstatic com/discord/theme/ThemeManager.INSTANCE Lcom/discord/theme/ThemeManager;
      // 314: invokevirtual com/discord/theme/ThemeManager.isThemeLight ()Z
      // 317: ifeq 322
      // 31a: ldc_w "#16000000"
      // 31d: astore 19
      // 31f: goto 327
      // 322: ldc_w "#24000000"
      // 325: astore 19
      // 327: aload 21
      // 329: ldc_w 10.0
      // 32c: fconst_0
      // 32d: ldc_w 5.0
      // 330: aload 19
      // 332: invokestatic android/graphics/Color.parseColor (Ljava/lang/String;)I
      // 335: invokevirtual android/graphics/Paint.setShadowLayer (FFFI)V
      // 338: aload 1
      // 339: fconst_0
      // 33a: fconst_0
      // 33b: fload 8
      // 33d: aload 21
      // 33f: invokevirtual android/graphics/Canvas.drawCircle (FFFLandroid/graphics/Paint;)V
      // 342: aload 21
      // 344: invokevirtual android/graphics/Paint.clearShadowLayer ()V
      // 347: aload 0
      // 348: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 34b: fstore 4
      // 34d: fload 4
      // 34f: fconst_0
      // 350: fcmpl
      // 351: ifle 3bb
      // 354: aload 1
      // 355: invokevirtual android/graphics/Canvas.save ()I
      // 358: istore 17
      // 35a: aload 1
      // 35b: fload 4
      // 35d: fload 4
      // 35f: fconst_0
      // 360: fconst_0
      // 361: invokevirtual android/graphics/Canvas.scale (FFFF)V
      // 364: aload 0
      // 365: getfield com/discord/chat/presentation/list/SwipeHelper.isCompleted Z
      // 368: ifeq 371
      // 36b: fconst_1
      // 36c: fstore 4
      // 36e: goto 374
      // 371: fload 2
      // 372: fstore 4
      // 374: aload 21
      // 376: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 379: invokevirtual com/discord/theme/DiscordThemeObject.getBgSurfaceOverlay ()I
      // 37c: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 37f: invokevirtual com/discord/theme/DiscordThemeObject.getBackgroundAccent ()I
      // 382: fload 4
      // 384: ldc_w 0.8
      // 387: fconst_1
      // 388: invokestatic com/discord/theme/utils/ColorUtilsKt.interpolateColors (IIFFF)I
      // 38b: invokevirtual android/graphics/Paint.setColor (I)V
      // 38e: aload 21
      // 390: aload 22
      // 392: invokevirtual android/graphics/Paint.setStyle (Landroid/graphics/Paint$Style;)V
      // 395: aload 21
      // 397: sipush 255
      // 39a: invokevirtual android/graphics/Paint.setAlpha (I)V
      // 39d: aload 1
      // 39e: fconst_0
      // 39f: fconst_0
      // 3a0: fload 8
      // 3a2: aload 21
      // 3a4: invokevirtual android/graphics/Canvas.drawCircle (FFFLandroid/graphics/Paint;)V
      // 3a7: aload 1
      // 3a8: iload 17
      // 3aa: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 3ad: goto 3bb
      // 3b0: astore 19
      // 3b2: aload 1
      // 3b3: iload 17
      // 3b5: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 3b8: aload 19
      // 3ba: athrow
      // 3bb: aload 1
      // 3bc: invokevirtual android/graphics/Canvas.save ()I
      // 3bf: pop
      // 3c0: fconst_0
      // 3c1: fconst_1
      // 3c2: bipush 1
      // 3c3: i2f
      // 3c4: aload 0
      // 3c5: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 3c8: fsub
      // 3c9: invokestatic java/lang/Float.min (FF)F
      // 3cc: invokestatic java/lang/Math.max (FF)F
      // 3cf: fstore 4
      // 3d1: aload 0
      // 3d2: fload 5
      // 3d4: invokespecial com/discord/chat/presentation/list/SwipeHelper.getArrowIconBaseSize (F)F
      // 3d7: fstore 5
      // 3d9: new android/graphics/PorterDuffColorFilter
      // 3dc: dup
      // 3dd: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 3e0: invokevirtual com/discord/theme/DiscordThemeObject.getInteractiveNormal ()I
      // 3e3: aload 0
      // 3e4: getfield com/discord/chat/presentation/list/SwipeHelper.context Landroid/content/Context;
      // 3e7: getstatic com/discord/theme/R$color.white I
      // 3ea: invokestatic com/discord/theme/utils/ColorUtilsKt.getColorCompat (Landroid/content/Context;I)I
      // 3ed: fload 3
      // 3ee: ldc_w 0.8
      // 3f1: fconst_1
      // 3f2: invokestatic com/discord/theme/utils/ColorUtilsKt.interpolateColors (IIFFF)I
      // 3f5: getstatic android/graphics/PorterDuff$Mode.SRC_ATOP Landroid/graphics/PorterDuff$Mode;
      // 3f8: invokespecial android/graphics/PorterDuffColorFilter.<init> (ILandroid/graphics/PorterDuff$Mode;)V
      // 3fb: astore 20
      // 3fd: aload 0
      // 3fe: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 401: astore 19
      // 403: aload 19
      // 405: ifnull 40f
      // 408: aload 19
      // 40a: aload 20
      // 40c: invokevirtual android/graphics/drawable/Drawable.setColorFilter (Landroid/graphics/ColorFilter;)V
      // 40f: getstatic com/discord/device/utils/DeviceReducedMotion.INSTANCE Lcom/discord/device/utils/DeviceReducedMotion;
      // 412: aload 0
      // 413: getfield com/discord/chat/presentation/list/SwipeHelper.context Landroid/content/Context;
      // 416: invokevirtual com/discord/device/utils/DeviceReducedMotion.isReducedMotionEnabled (Landroid/content/Context;)Z
      // 419: ifeq 421
      // 41c: fconst_0
      // 41d: fstore 2
      // 41e: goto 429
      // 421: fconst_1
      // 422: fload 2
      // 423: fsub
      // 424: ldc_w 90.0
      // 427: fmul
      // 428: fstore 2
      // 429: aload 0
      // 42a: getfield com/discord/chat/presentation/list/SwipeHelper.easterEggArrowRotationDegrees F
      // 42d: fstore 3
      // 42e: aload 1
      // 42f: ldc_w -1.0
      // 432: ldc_w -1.0
      // 435: invokevirtual android/graphics/Canvas.translate (FF)V
      // 438: fload 2
      // 439: fload 3
      // 43a: fadd
      // 43b: fstore 2
      // 43c: aload 1
      // 43d: fload 2
      // 43e: invokevirtual android/graphics/Canvas.rotate (F)V
      // 441: aload 1
      // 442: fload 4
      // 444: fload 4
      // 446: invokevirtual android/graphics/Canvas.scale (FF)V
      // 449: fload 5
      // 44b: fconst_2
      // 44c: fdiv
      // 44d: f2i
      // 44e: istore 17
      // 450: iload 17
      // 452: ineg
      // 453: istore 18
      // 455: new android/graphics/Rect
      // 458: dup
      // 459: iload 18
      // 45b: iload 18
      // 45d: iload 17
      // 45f: iload 17
      // 461: invokespecial android/graphics/Rect.<init> (IIII)V
      // 464: astore 19
      // 466: aload 0
      // 467: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 46a: astore 21
      // 46c: aload 21
      // 46e: ifnull 478
      // 471: aload 21
      // 473: aload 19
      // 475: invokevirtual android/graphics/drawable/Drawable.setBounds (Landroid/graphics/Rect;)V
      // 478: aload 0
      // 479: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 47c: astore 21
      // 47e: aload 21
      // 480: ifnull 48a
      // 483: aload 21
      // 485: iload 16
      // 487: invokevirtual android/graphics/drawable/Drawable.setAlpha (I)V
      // 48a: aload 0
      // 48b: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 48e: astore 21
      // 490: aload 21
      // 492: ifnull 49b
      // 495: aload 21
      // 497: aload 1
      // 498: invokevirtual android/graphics/drawable/Drawable.draw (Landroid/graphics/Canvas;)V
      // 49b: aload 1
      // 49c: invokevirtual android/graphics/Canvas.restore ()V
      // 49f: aload 0
      // 4a0: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 4a3: fconst_0
      // 4a4: fcmpl
      // 4a5: ifle 520
      // 4a8: aload 1
      // 4a9: invokevirtual android/graphics/Canvas.save ()I
      // 4ac: istore 16
      // 4ae: aload 0
      // 4af: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 4b2: astore 21
      // 4b4: aload 21
      // 4b6: ifnull 4c8
      // 4b9: aload 21
      // 4bb: aload 20
      // 4bd: invokevirtual android/graphics/drawable/Drawable.setColorFilter (Landroid/graphics/ColorFilter;)V
      // 4c0: goto 4c8
      // 4c3: astore 19
      // 4c5: goto 517
      // 4c8: aload 1
      // 4c9: fload 2
      // 4ca: invokevirtual android/graphics/Canvas.rotate (F)V
      // 4cd: aload 0
      // 4ce: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 4d1: fstore 2
      // 4d2: aload 1
      // 4d3: fload 2
      // 4d4: fload 2
      // 4d5: invokevirtual android/graphics/Canvas.scale (FF)V
      // 4d8: aload 0
      // 4d9: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 4dc: astore 20
      // 4de: aload 20
      // 4e0: ifnull 4ea
      // 4e3: aload 20
      // 4e5: aload 19
      // 4e7: invokevirtual android/graphics/drawable/Drawable.setBounds (Landroid/graphics/Rect;)V
      // 4ea: aload 0
      // 4eb: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 4ee: astore 19
      // 4f0: aload 19
      // 4f2: ifnull 4fd
      // 4f5: aload 19
      // 4f7: sipush 255
      // 4fa: invokevirtual android/graphics/drawable/Drawable.setAlpha (I)V
      // 4fd: aload 0
      // 4fe: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 501: astore 19
      // 503: aload 19
      // 505: ifnull 50e
      // 508: aload 19
      // 50a: aload 1
      // 50b: invokevirtual android/graphics/drawable/Drawable.draw (Landroid/graphics/Canvas;)V
      // 50e: aload 1
      // 50f: iload 16
      // 511: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 514: goto 520
      // 517: aload 1
      // 518: iload 16
      // 51a: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 51d: aload 19
      // 51f: athrow
      // 520: aload 1
      // 521: invokevirtual android/graphics/Canvas.restore ()V
      // 524: return
   }

   private fun easterEggStartAnimation(recyclerView: RecyclerView, viewHolder: ViewHolder) {
      if (!DeviceReducedMotion.INSTANCE.isReducedMotionEnabled(this.context)) {
         var var3: View = this.mView;
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            var3 = null;
         }

         var var7: PropertyValuesHolder = PropertyValuesHolder.ofFloat(
            "arrow-scale", new float[]{1.0F, this.getArrowContainerGrowthRatio((float)var3.getMeasuredHeight()), 1.0F}
         );
         val var5: ValueAnimator = new ValueAnimator();
         var5.setValues(new PropertyValuesHolder[]{var7});
         var5.setDuration(300L);
         var5.setInterpolator(new AccelerateDecelerateInterpolator());
         var5.addUpdateListener(new b0(this, var1));
         this.easterEggArrowAnimator = var5;
         var5.start();
         var7 = PropertyValuesHolder.ofFloat("arrow-rotation", new float[]{720.0F, 0.0F});
         val var6: ValueAnimator = new ValueAnimator();
         var6.setValues(new PropertyValuesHolder[]{var7});
         var6.setDuration(800L);
         var6.setInterpolator(new PathInterpolator(0.0F, 0.0F, 0.25F, 1.0F));
         var6.addUpdateListener(new c0(this, var1));
         var6.addListener(new AnimatorListener(this, var2, var1) {
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

      val var8: PropertyValuesHolder = PropertyValuesHolder.ofFloat(
         "edit-circle-scale", new float[]{this.editCircleScale, this.getArrowContainerGrowthRatio((float)var3.getMeasuredHeight()), 1.0F}
      );
      val var7: ValueAnimator = new ValueAnimator();
      var7.setValues(new PropertyValuesHolder[]{var8});
      var7.setDuration(300L);
      var7.setInterpolator(new AccelerateDecelerateInterpolator());
      var7.addUpdateListener(new e0(this, var1));
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
         val var3: Float = SizeUtilsKt.getDpToPx(12);
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
         } else {
            var6 = this.mView;
         }

         val var2: Float = this.getLeftBevelRadius(var4, (float)var6.getMeasuredHeight());
         val var10: java.lang.String;
         if (ThemeManager.INSTANCE.isThemeLight()) {
            var10 = "#1F000000";
         } else {
            var10 = "#3E000000";
         }

         var9.getShadowView().setParams(var3 * var4, var2, var10);
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
                  throw new fm.p();
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
