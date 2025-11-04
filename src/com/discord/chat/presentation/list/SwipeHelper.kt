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
      // 004: ifnull 52a
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
      // 031: fstore 3
      // 032: aload 0
      // 033: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 036: astore 20
      // 038: aload 20
      // 03a: astore 19
      // 03c: aload 20
      // 03e: ifnonnull 04a
      // 041: ldc_w "mView"
      // 044: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 047: aconst_null
      // 048: astore 19
      // 04a: aload 19
      // 04c: invokevirtual android/view/View.getMeasuredHeight ()I
      // 04f: i2f
      // 050: fstore 5
      // 052: new android/graphics/Paint
      // 055: dup
      // 056: invokespecial android/graphics/Paint.<init> ()V
      // 059: astore 21
      // 05b: aload 0
      // 05c: getfield com/discord/chat/presentation/list/SwipeHelper.currentItemViewHolder Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
      // 05f: astore 19
      // 061: aload 19
      // 063: ifnull 070
      // 066: aload 19
      // 068: getfield androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView Landroid/view/View;
      // 06b: astore 19
      // 06d: goto 073
      // 070: aconst_null
      // 071: astore 19
      // 073: aload 19
      // 075: instanceof com/discord/chat/presentation/list/SwipeReplyInitiator
      // 078: ifeq 085
      // 07b: aload 19
      // 07d: checkcast com/discord/chat/presentation/list/SwipeReplyInitiator
      // 080: astore 19
      // 082: goto 088
      // 085: aconst_null
      // 086: astore 19
      // 088: getstatic android/graphics/Paint$Style.FILL Landroid/graphics/Paint$Style;
      // 08b: astore 22
      // 08d: aload 21
      // 08f: aload 22
      // 091: invokevirtual android/graphics/Paint.setStyle (Landroid/graphics/Paint$Style;)V
      // 094: aload 19
      // 096: ifnull 0b2
      // 099: aload 19
      // 09b: invokeinterface com/discord/chat/presentation/list/SwipeReplyInitiator.getUsingGradientTheme ()Z 1
      // 0a0: bipush 1
      // 0a1: if_icmpne 0b2
      // 0a4: aload 21
      // 0a6: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 0a9: invokevirtual com/discord/theme/DiscordThemeObject.getChatSwipeToReplyGradientBackground ()I
      // 0ac: invokevirtual android/graphics/Paint.setColor (I)V
      // 0af: goto 0bd
      // 0b2: aload 21
      // 0b4: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 0b7: invokevirtual com/discord/theme/DiscordThemeObject.getChatSwipeToReplyBackground ()I
      // 0ba: invokevirtual android/graphics/Paint.setColor (I)V
      // 0bd: aload 1
      // 0be: invokevirtual android/graphics/Canvas.save ()I
      // 0c1: pop
      // 0c2: aload 0
      // 0c3: invokespecial com/discord/chat/presentation/list/SwipeHelper.getSwipeProgress ()F
      // 0c6: fstore 2
      // 0c7: aload 0
      // 0c8: fload 2
      // 0c9: fload 5
      // 0cb: invokespecial com/discord/chat/presentation/list/SwipeHelper.getLeftBevelRadius (FF)F
      // 0ce: fstore 7
      // 0d0: getstatic com/discord/chat/presentation/list/SwipeHelper.MAX_RIGHT_BEVEL_WIDTH I
      // 0d3: i2f
      // 0d4: fload 2
      // 0d5: fmul
      // 0d6: fstore 11
      // 0d8: aload 0
      // 0d9: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 0dc: astore 20
      // 0de: aload 20
      // 0e0: astore 19
      // 0e2: aload 20
      // 0e4: ifnonnull 0f0
      // 0e7: ldc_w "mView"
      // 0ea: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 0ed: aconst_null
      // 0ee: astore 19
      // 0f0: aload 19
      // 0f2: invokevirtual android/view/View.getMeasuredWidth ()I
      // 0f5: i2f
      // 0f6: fstore 4
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
      // 110: fload 4
      // 112: aload 19
      // 114: invokevirtual android/view/View.getTranslationX ()F
      // 117: fadd
      // 118: fstore 4
      // 11a: fload 4
      // 11c: fload 7
      // 11e: fsub
      // 11f: fstore 10
      // 121: fload 4
      // 123: fload 3
      // 124: fadd
      // 125: fstore 6
      // 127: fload 6
      // 129: fload 11
      // 12b: fsub
      // 12c: fstore 13
      // 12e: aload 0
      // 12f: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 132: astore 20
      // 134: aload 20
      // 136: astore 19
      // 138: aload 20
      // 13a: ifnonnull 146
      // 13d: ldc_w "mView"
      // 140: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 143: aconst_null
      // 144: astore 19
      // 146: aload 19
      // 148: invokevirtual android/view/View.getTop ()I
      // 14b: i2f
      // 14c: fstore 8
      // 14e: getstatic com/discord/chat/presentation/list/SwipeHelper.RIGHT_BEVEL_HEIGHT I
      // 151: istore 16
      // 153: fload 8
      // 155: iload 16
      // 157: i2f
      // 158: fsub
      // 159: fstore 15
      // 15b: fload 15
      // 15d: iload 16
      // 15f: i2f
      // 160: fadd
      // 161: fstore 9
      // 163: fload 15
      // 165: fload 5
      // 167: fadd
      // 168: iload 16
      // 16a: bipush 2
      // 16b: imul
      // 16c: i2f
      // 16d: fadd
      // 16e: fstore 14
      // 170: fload 14
      // 172: iload 16
      // 174: i2f
      // 175: fsub
      // 176: fstore 12
      // 178: new android/graphics/Path
      // 17b: dup
      // 17c: invokespecial android/graphics/Path.<init> ()V
      // 17f: astore 19
      // 181: aload 19
      // 183: fload 13
      // 185: fload 12
      // 187: invokevirtual android/graphics/Path.moveTo (FF)V
      // 18a: aload 19
      // 18c: fload 4
      // 18e: fload 12
      // 190: invokevirtual android/graphics/Path.lineTo (FF)V
      // 193: aload 19
      // 195: fload 4
      // 197: fload 9
      // 199: fload 7
      // 19b: fadd
      // 19c: invokevirtual android/graphics/Path.lineTo (FF)V
      // 19f: bipush 2
      // 1a0: i2f
      // 1a1: fstore 8
      // 1a3: aload 19
      // 1a5: fload 10
      // 1a7: fload 7
      // 1a9: fsub
      // 1aa: fload 9
      // 1ac: fload 4
      // 1ae: fload 9
      // 1b0: fload 8
      // 1b2: fload 7
      // 1b4: fmul
      // 1b5: fadd
      // 1b6: fconst_0
      // 1b7: ldc_w -90.0
      // 1ba: invokevirtual android/graphics/Path.addArc (FFFFFF)V
      // 1bd: aload 19
      // 1bf: fload 13
      // 1c1: fload 9
      // 1c3: invokevirtual android/graphics/Path.lineTo (FF)V
      // 1c6: fload 13
      // 1c8: fload 11
      // 1ca: ldc_w 0.55
      // 1cd: fmul
      // 1ce: fadd
      // 1cf: fstore 11
      // 1d1: aload 19
      // 1d3: fload 11
      // 1d5: fload 9
      // 1d7: fload 6
      // 1d9: fload 15
      // 1db: iload 16
      // 1dd: i2f
      // 1de: ldc_w 0.55
      // 1e1: fmul
      // 1e2: fadd
      // 1e3: fload 6
      // 1e5: fload 15
      // 1e7: invokevirtual android/graphics/Path.cubicTo (FFFFFF)V
      // 1ea: aload 19
      // 1ec: fload 6
      // 1ee: fload 14
      // 1f0: invokevirtual android/graphics/Path.lineTo (FF)V
      // 1f3: aload 19
      // 1f5: fload 6
      // 1f7: fload 14
      // 1f9: iload 16
      // 1fb: i2f
      // 1fc: ldc_w 0.55
      // 1ff: fmul
      // 200: fsub
      // 201: fload 11
      // 203: fload 12
      // 205: fload 13
      // 207: fload 12
      // 209: invokevirtual android/graphics/Path.cubicTo (FFFFFF)V
      // 20c: aload 1
      // 20d: invokevirtual android/graphics/Canvas.save ()I
      // 210: pop
      // 211: aload 1
      // 212: aload 19
      // 214: invokevirtual android/graphics/Canvas.clipPath (Landroid/graphics/Path;)Z
      // 217: pop
      // 218: aload 1
      // 219: fload 10
      // 21b: fload 15
      // 21d: fload 6
      // 21f: fload 14
      // 221: aload 21
      // 223: invokevirtual android/graphics/Canvas.drawRect (FFFFLandroid/graphics/Paint;)V
      // 226: aload 1
      // 227: invokevirtual android/graphics/Canvas.restore ()V
      // 22a: aload 1
      // 22b: invokevirtual android/graphics/Canvas.save ()I
      // 22e: pop
      // 22f: aload 19
      // 231: invokevirtual android/graphics/Path.reset ()V
      // 234: fload 12
      // 236: fload 7
      // 238: fsub
      // 239: fstore 11
      // 23b: aload 19
      // 23d: fload 10
      // 23f: fload 11
      // 241: fload 7
      // 243: getstatic android/graphics/Path$Direction.CW Landroid/graphics/Path$Direction;
      // 246: invokevirtual android/graphics/Path.addCircle (FFFLandroid/graphics/Path$Direction;)V
      // 249: getstatic android/os/Build$VERSION.SDK_INT I
      // 24c: bipush 26
      // 24e: if_icmplt 25b
      // 251: aload 1
      // 252: aload 19
      // 254: invokevirtual android/graphics/Canvas.clipOutPath (Landroid/graphics/Path;)Z
      // 257: pop
      // 258: goto 268
      // 25b: aload 1
      // 25c: aload 19
      // 25e: getstatic android/graphics/Region$Op.DIFFERENCE Landroid/graphics/Region$Op;
      // 261: invokevirtual android/graphics/Canvas.clipPath (Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
      // 264: pop
      // 265: goto 258
      // 268: aload 1
      // 269: fload 10
      // 26b: fload 11
      // 26d: fload 4
      // 26f: fload 12
      // 271: aload 21
      // 273: invokevirtual android/graphics/Canvas.drawRect (FFFFLandroid/graphics/Paint;)V
      // 276: aload 1
      // 277: invokevirtual android/graphics/Canvas.restore ()V
      // 27a: aload 0
      // 27b: fload 5
      // 27d: invokespecial com/discord/chat/presentation/list/SwipeHelper.getArrowContainerBaseSize (F)F
      // 280: fload 8
      // 282: fdiv
      // 283: fstore 7
      // 285: fload 3
      // 286: fload 8
      // 288: fdiv
      // 289: fstore 3
      // 28a: fload 9
      // 28c: fload 5
      // 28e: fload 8
      // 290: fdiv
      // 291: fadd
      // 292: fload 7
      // 294: fsub
      // 295: f2i
      // 296: istore 17
      // 298: sipush 192
      // 29b: i2f
      // 29c: fload 2
      // 29d: fmul
      // 29e: f2i
      // 29f: bipush 64
      // 2a1: iadd
      // 2a2: bipush 0
      // 2a3: sipush 255
      // 2a6: invokestatic kotlin/ranges/e.n (III)I
      // 2a9: istore 16
      // 2ab: aload 1
      // 2ac: invokevirtual android/graphics/Canvas.save ()I
      // 2af: pop
      // 2b0: aload 1
      // 2b1: fload 4
      // 2b3: fconst_0
      // 2b4: fload 6
      // 2b6: aload 1
      // 2b7: invokevirtual android/graphics/Canvas.getHeight ()I
      // 2ba: i2f
      // 2bb: invokevirtual android/graphics/Canvas.clipRect (FFFF)Z
      // 2be: pop
      // 2bf: aload 1
      // 2c0: fload 4
      // 2c2: fload 3
      // 2c3: fadd
      // 2c4: fload 7
      // 2c6: fsub
      // 2c7: fload 7
      // 2c9: fadd
      // 2ca: iload 17
      // 2cc: i2f
      // 2cd: fload 7
      // 2cf: fadd
      // 2d0: invokevirtual android/graphics/Canvas.translate (FF)V
      // 2d3: aload 0
      // 2d4: getfield com/discord/chat/presentation/list/SwipeHelper.easterEggArrowScale F
      // 2d7: fstore 3
      // 2d8: aload 1
      // 2d9: fload 3
      // 2da: fload 3
      // 2db: invokevirtual android/graphics/Canvas.scale (FF)V
      // 2de: aload 0
      // 2df: getfield com/discord/chat/presentation/list/SwipeHelper.isCompleted Z
      // 2e2: ifeq 2ea
      // 2e5: fconst_1
      // 2e6: fstore 3
      // 2e7: goto 2ec
      // 2ea: fload 2
      // 2eb: fstore 3
      // 2ec: aload 21
      // 2ee: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 2f1: invokevirtual com/discord/theme/DiscordThemeObject.getBgSurfaceOverlay ()I
      // 2f4: aload 0
      // 2f5: getfield com/discord/chat/presentation/list/SwipeHelper.context Landroid/content/Context;
      // 2f8: getstatic com/discord/theme/R$color.brand_500 I
      // 2fb: invokestatic com/discord/theme/utils/ColorUtilsKt.getColorCompat (Landroid/content/Context;I)I
      // 2fe: fload 3
      // 2ff: ldc_w 0.8
      // 302: fconst_1
      // 303: invokestatic com/discord/theme/utils/ColorUtilsKt.interpolateColors (IIFFF)I
      // 306: invokevirtual android/graphics/Paint.setColor (I)V
      // 309: aload 21
      // 30b: aload 22
      // 30d: invokevirtual android/graphics/Paint.setStyle (Landroid/graphics/Paint$Style;)V
      // 310: aload 21
      // 312: iload 16
      // 314: invokevirtual android/graphics/Paint.setAlpha (I)V
      // 317: getstatic com/discord/theme/ThemeManager.INSTANCE Lcom/discord/theme/ThemeManager;
      // 31a: invokevirtual com/discord/theme/ThemeManager.isThemeLight ()Z
      // 31d: ifeq 328
      // 320: ldc_w "#16000000"
      // 323: astore 19
      // 325: goto 32d
      // 328: ldc_w "#24000000"
      // 32b: astore 19
      // 32d: aload 21
      // 32f: ldc_w 10.0
      // 332: fconst_0
      // 333: ldc_w 5.0
      // 336: aload 19
      // 338: invokestatic android/graphics/Color.parseColor (Ljava/lang/String;)I
      // 33b: invokevirtual android/graphics/Paint.setShadowLayer (FFFI)V
      // 33e: aload 1
      // 33f: fconst_0
      // 340: fconst_0
      // 341: fload 7
      // 343: aload 21
      // 345: invokevirtual android/graphics/Canvas.drawCircle (FFFLandroid/graphics/Paint;)V
      // 348: aload 21
      // 34a: invokevirtual android/graphics/Paint.clearShadowLayer ()V
      // 34d: aload 0
      // 34e: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 351: fstore 4
      // 353: fload 4
      // 355: fconst_0
      // 356: fcmpl
      // 357: ifle 3c1
      // 35a: aload 1
      // 35b: invokevirtual android/graphics/Canvas.save ()I
      // 35e: istore 17
      // 360: aload 1
      // 361: fload 4
      // 363: fload 4
      // 365: fconst_0
      // 366: fconst_0
      // 367: invokevirtual android/graphics/Canvas.scale (FFFF)V
      // 36a: aload 0
      // 36b: getfield com/discord/chat/presentation/list/SwipeHelper.isCompleted Z
      // 36e: ifeq 377
      // 371: fconst_1
      // 372: fstore 4
      // 374: goto 37a
      // 377: fload 2
      // 378: fstore 4
      // 37a: aload 21
      // 37c: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 37f: invokevirtual com/discord/theme/DiscordThemeObject.getBgSurfaceOverlay ()I
      // 382: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 385: invokevirtual com/discord/theme/DiscordThemeObject.getBackgroundAccent ()I
      // 388: fload 4
      // 38a: ldc_w 0.8
      // 38d: fconst_1
      // 38e: invokestatic com/discord/theme/utils/ColorUtilsKt.interpolateColors (IIFFF)I
      // 391: invokevirtual android/graphics/Paint.setColor (I)V
      // 394: aload 21
      // 396: aload 22
      // 398: invokevirtual android/graphics/Paint.setStyle (Landroid/graphics/Paint$Style;)V
      // 39b: aload 21
      // 39d: sipush 255
      // 3a0: invokevirtual android/graphics/Paint.setAlpha (I)V
      // 3a3: aload 1
      // 3a4: fconst_0
      // 3a5: fconst_0
      // 3a6: fload 7
      // 3a8: aload 21
      // 3aa: invokevirtual android/graphics/Canvas.drawCircle (FFFLandroid/graphics/Paint;)V
      // 3ad: aload 1
      // 3ae: iload 17
      // 3b0: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 3b3: goto 3c1
      // 3b6: astore 19
      // 3b8: aload 1
      // 3b9: iload 17
      // 3bb: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 3be: aload 19
      // 3c0: athrow
      // 3c1: aload 1
      // 3c2: invokevirtual android/graphics/Canvas.save ()I
      // 3c5: pop
      // 3c6: fconst_0
      // 3c7: fconst_1
      // 3c8: bipush 1
      // 3c9: i2f
      // 3ca: aload 0
      // 3cb: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 3ce: fsub
      // 3cf: invokestatic java/lang/Float.min (FF)F
      // 3d2: invokestatic java/lang/Math.max (FF)F
      // 3d5: fstore 4
      // 3d7: aload 0
      // 3d8: fload 5
      // 3da: invokespecial com/discord/chat/presentation/list/SwipeHelper.getArrowIconBaseSize (F)F
      // 3dd: fstore 5
      // 3df: new android/graphics/PorterDuffColorFilter
      // 3e2: dup
      // 3e3: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 3e6: invokevirtual com/discord/theme/DiscordThemeObject.getInteractiveNormal ()I
      // 3e9: aload 0
      // 3ea: getfield com/discord/chat/presentation/list/SwipeHelper.context Landroid/content/Context;
      // 3ed: getstatic com/discord/theme/R$color.white I
      // 3f0: invokestatic com/discord/theme/utils/ColorUtilsKt.getColorCompat (Landroid/content/Context;I)I
      // 3f3: fload 3
      // 3f4: ldc_w 0.8
      // 3f7: fconst_1
      // 3f8: invokestatic com/discord/theme/utils/ColorUtilsKt.interpolateColors (IIFFF)I
      // 3fb: getstatic android/graphics/PorterDuff$Mode.SRC_ATOP Landroid/graphics/PorterDuff$Mode;
      // 3fe: invokespecial android/graphics/PorterDuffColorFilter.<init> (ILandroid/graphics/PorterDuff$Mode;)V
      // 401: astore 20
      // 403: aload 0
      // 404: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 407: astore 19
      // 409: aload 19
      // 40b: ifnull 415
      // 40e: aload 19
      // 410: aload 20
      // 412: invokevirtual android/graphics/drawable/Drawable.setColorFilter (Landroid/graphics/ColorFilter;)V
      // 415: getstatic com/discord/device/utils/DeviceReducedMotion.INSTANCE Lcom/discord/device/utils/DeviceReducedMotion;
      // 418: aload 0
      // 419: getfield com/discord/chat/presentation/list/SwipeHelper.context Landroid/content/Context;
      // 41c: invokevirtual com/discord/device/utils/DeviceReducedMotion.isReducedMotionEnabled (Landroid/content/Context;)Z
      // 41f: ifeq 427
      // 422: fconst_0
      // 423: fstore 2
      // 424: goto 42f
      // 427: fconst_1
      // 428: fload 2
      // 429: fsub
      // 42a: ldc_w 90.0
      // 42d: fmul
      // 42e: fstore 2
      // 42f: aload 0
      // 430: getfield com/discord/chat/presentation/list/SwipeHelper.easterEggArrowRotationDegrees F
      // 433: fstore 3
      // 434: aload 1
      // 435: ldc_w -1.0
      // 438: ldc_w -1.0
      // 43b: invokevirtual android/graphics/Canvas.translate (FF)V
      // 43e: fload 2
      // 43f: fload 3
      // 440: fadd
      // 441: fstore 2
      // 442: aload 1
      // 443: fload 2
      // 444: invokevirtual android/graphics/Canvas.rotate (F)V
      // 447: aload 1
      // 448: fload 4
      // 44a: fload 4
      // 44c: invokevirtual android/graphics/Canvas.scale (FF)V
      // 44f: fload 5
      // 451: fconst_2
      // 452: fdiv
      // 453: f2i
      // 454: istore 18
      // 456: iload 18
      // 458: ineg
      // 459: istore 17
      // 45b: new android/graphics/Rect
      // 45e: dup
      // 45f: iload 17
      // 461: iload 17
      // 463: iload 18
      // 465: iload 18
      // 467: invokespecial android/graphics/Rect.<init> (IIII)V
      // 46a: astore 19
      // 46c: aload 0
      // 46d: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 470: astore 21
      // 472: aload 21
      // 474: ifnull 47e
      // 477: aload 21
      // 479: aload 19
      // 47b: invokevirtual android/graphics/drawable/Drawable.setBounds (Landroid/graphics/Rect;)V
      // 47e: aload 0
      // 47f: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 482: astore 21
      // 484: aload 21
      // 486: ifnull 490
      // 489: aload 21
      // 48b: iload 16
      // 48d: invokevirtual android/graphics/drawable/Drawable.setAlpha (I)V
      // 490: aload 0
      // 491: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 494: astore 21
      // 496: aload 21
      // 498: ifnull 4a1
      // 49b: aload 21
      // 49d: aload 1
      // 49e: invokevirtual android/graphics/drawable/Drawable.draw (Landroid/graphics/Canvas;)V
      // 4a1: aload 1
      // 4a2: invokevirtual android/graphics/Canvas.restore ()V
      // 4a5: aload 0
      // 4a6: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 4a9: fconst_0
      // 4aa: fcmpl
      // 4ab: ifle 526
      // 4ae: aload 1
      // 4af: invokevirtual android/graphics/Canvas.save ()I
      // 4b2: istore 16
      // 4b4: aload 0
      // 4b5: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 4b8: astore 21
      // 4ba: aload 21
      // 4bc: ifnull 4ce
      // 4bf: aload 21
      // 4c1: aload 20
      // 4c3: invokevirtual android/graphics/drawable/Drawable.setColorFilter (Landroid/graphics/ColorFilter;)V
      // 4c6: goto 4ce
      // 4c9: astore 19
      // 4cb: goto 51d
      // 4ce: aload 1
      // 4cf: fload 2
      // 4d0: invokevirtual android/graphics/Canvas.rotate (F)V
      // 4d3: aload 0
      // 4d4: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 4d7: fstore 2
      // 4d8: aload 1
      // 4d9: fload 2
      // 4da: fload 2
      // 4db: invokevirtual android/graphics/Canvas.scale (FF)V
      // 4de: aload 0
      // 4df: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 4e2: astore 20
      // 4e4: aload 20
      // 4e6: ifnull 4f0
      // 4e9: aload 20
      // 4eb: aload 19
      // 4ed: invokevirtual android/graphics/drawable/Drawable.setBounds (Landroid/graphics/Rect;)V
      // 4f0: aload 0
      // 4f1: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 4f4: astore 19
      // 4f6: aload 19
      // 4f8: ifnull 503
      // 4fb: aload 19
      // 4fd: sipush 255
      // 500: invokevirtual android/graphics/drawable/Drawable.setAlpha (I)V
      // 503: aload 0
      // 504: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 507: astore 19
      // 509: aload 19
      // 50b: ifnull 514
      // 50e: aload 19
      // 510: aload 1
      // 511: invokevirtual android/graphics/drawable/Drawable.draw (Landroid/graphics/Canvas;)V
      // 514: aload 1
      // 515: iload 16
      // 517: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 51a: goto 526
      // 51d: aload 1
      // 51e: iload 16
      // 520: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 523: aload 19
      // 525: athrow
      // 526: aload 1
      // 527: invokevirtual android/graphics/Canvas.restore ()V
      // 52a: return
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
         var7.addUpdateListener(new b0(this, var1));
         this.easterEggArrowAnimator = var7;
         var7.start();
         val var6: PropertyValuesHolder = PropertyValuesHolder.ofFloat("arrow-rotation", new float[]{720.0F, 0.0F});
         var7 = new ValueAnimator();
         var7.setValues(new PropertyValuesHolder[]{var6});
         var7.setDuration(800L);
         var7.setInterpolator(new PathInterpolator(0.0F, 0.0F, 0.25F, 1.0F));
         var7.addUpdateListener(new c0(this, var1));
         var7.addListener(new AnimatorListener(this, var2, var1) {
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
      val var3: PropertyValuesHolder = PropertyValuesHolder.ofFloat("edit-circle-scale", new float[]{this.editCircleScale, 0.0F});
      val var2: ValueAnimator = new ValueAnimator();
      var2.setValues(new PropertyValuesHolder[]{var3});
      var2.setDuration(200L);
      var2.setInterpolator(new AccelerateDecelerateInterpolator());
      var2.addUpdateListener(new d0(this, var1));
      var2.addListener(new AnimatorListener(this) {
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
      this.editCircleScaleAnimator = var2;
      var2.start();
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
