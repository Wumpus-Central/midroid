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
      // 010: goto 523
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
      // 033: fstore 6
      // 035: aload 0
      // 036: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 039: astore 20
      // 03b: aload 20
      // 03d: astore 19
      // 03f: aload 20
      // 041: ifnonnull 04d
      // 044: ldc_w "mView"
      // 047: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 04a: aconst_null
      // 04b: astore 19
      // 04d: aload 19
      // 04f: invokevirtual android/view/View.getMeasuredHeight ()I
      // 052: i2f
      // 053: fstore 5
      // 055: new android/graphics/Paint
      // 058: dup
      // 059: invokespecial android/graphics/Paint.<init> ()V
      // 05c: astore 21
      // 05e: aload 0
      // 05f: getfield com/discord/chat/presentation/list/SwipeHelper.currentItemViewHolder Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
      // 062: astore 19
      // 064: aload 19
      // 066: ifnull 073
      // 069: aload 19
      // 06b: getfield androidx/recyclerview/widget/RecyclerView$ViewHolder.itemView Landroid/view/View;
      // 06e: astore 19
      // 070: goto 076
      // 073: aconst_null
      // 074: astore 19
      // 076: aload 19
      // 078: instanceof com/discord/chat/presentation/list/SwipeReplyInitiator
      // 07b: ifeq 088
      // 07e: aload 19
      // 080: checkcast com/discord/chat/presentation/list/SwipeReplyInitiator
      // 083: astore 19
      // 085: goto 08b
      // 088: aconst_null
      // 089: astore 19
      // 08b: getstatic android/graphics/Paint$Style.FILL Landroid/graphics/Paint$Style;
      // 08e: astore 22
      // 090: aload 21
      // 092: aload 22
      // 094: invokevirtual android/graphics/Paint.setStyle (Landroid/graphics/Paint$Style;)V
      // 097: aload 19
      // 099: ifnull 0b5
      // 09c: aload 19
      // 09e: invokeinterface com/discord/chat/presentation/list/SwipeReplyInitiator.getUsingGradientTheme ()Z 1
      // 0a3: bipush 1
      // 0a4: if_icmpne 0b5
      // 0a7: aload 21
      // 0a9: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 0ac: invokevirtual com/discord/theme/DiscordThemeObject.getChatSwipeToReplyGradientBackground ()I
      // 0af: invokevirtual android/graphics/Paint.setColor (I)V
      // 0b2: goto 0c0
      // 0b5: aload 21
      // 0b7: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 0ba: invokevirtual com/discord/theme/DiscordThemeObject.getChatSwipeToReplyBackground ()I
      // 0bd: invokevirtual android/graphics/Paint.setColor (I)V
      // 0c0: aload 1
      // 0c1: invokevirtual android/graphics/Canvas.save ()I
      // 0c4: pop
      // 0c5: aload 0
      // 0c6: invokespecial com/discord/chat/presentation/list/SwipeHelper.getSwipeProgress ()F
      // 0c9: fstore 2
      // 0ca: aload 0
      // 0cb: fload 2
      // 0cc: fload 5
      // 0ce: invokespecial com/discord/chat/presentation/list/SwipeHelper.getLeftBevelRadius (FF)F
      // 0d1: fstore 8
      // 0d3: getstatic com/discord/chat/presentation/list/SwipeHelper.MAX_RIGHT_BEVEL_WIDTH I
      // 0d6: i2f
      // 0d7: fload 2
      // 0d8: fmul
      // 0d9: fstore 12
      // 0db: aload 0
      // 0dc: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 0df: astore 20
      // 0e1: aload 20
      // 0e3: astore 19
      // 0e5: aload 20
      // 0e7: ifnonnull 0f3
      // 0ea: ldc_w "mView"
      // 0ed: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 0f0: aconst_null
      // 0f1: astore 19
      // 0f3: aload 19
      // 0f5: invokevirtual android/view/View.getMeasuredWidth ()I
      // 0f8: i2f
      // 0f9: fstore 3
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
      // 112: fload 3
      // 113: aload 19
      // 115: invokevirtual android/view/View.getTranslationX ()F
      // 118: fadd
      // 119: fstore 4
      // 11b: fload 4
      // 11d: fload 8
      // 11f: fsub
      // 120: fstore 10
      // 122: fload 4
      // 124: fload 6
      // 126: fadd
      // 127: fstore 3
      // 128: fload 3
      // 129: fload 12
      // 12b: fsub
      // 12c: fstore 11
      // 12e: aload 0
      // 12f: getfield com/discord/chat/presentation/list/SwipeHelper.mView Landroid/view/View;
      // 132: astore 19
      // 134: aload 19
      // 136: ifnonnull 145
      // 139: ldc_w "mView"
      // 13c: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 13f: aconst_null
      // 140: astore 19
      // 142: goto 145
      // 145: aload 19
      // 147: invokevirtual android/view/View.getTop ()I
      // 14a: i2f
      // 14b: fstore 7
      // 14d: getstatic com/discord/chat/presentation/list/SwipeHelper.RIGHT_BEVEL_HEIGHT I
      // 150: istore 16
      // 152: fload 7
      // 154: iload 16
      // 156: i2f
      // 157: fsub
      // 158: fstore 15
      // 15a: iload 16
      // 15c: i2f
      // 15d: fload 15
      // 15f: fadd
      // 160: fstore 9
      // 162: fload 15
      // 164: fload 5
      // 166: fadd
      // 167: iload 16
      // 169: bipush 2
      // 16a: imul
      // 16b: i2f
      // 16c: fadd
      // 16d: fstore 14
      // 16f: fload 14
      // 171: iload 16
      // 173: i2f
      // 174: fsub
      // 175: fstore 13
      // 177: new android/graphics/Path
      // 17a: dup
      // 17b: invokespecial android/graphics/Path.<init> ()V
      // 17e: astore 19
      // 180: aload 19
      // 182: fload 11
      // 184: fload 13
      // 186: invokevirtual android/graphics/Path.moveTo (FF)V
      // 189: aload 19
      // 18b: fload 4
      // 18d: fload 13
      // 18f: invokevirtual android/graphics/Path.lineTo (FF)V
      // 192: aload 19
      // 194: fload 4
      // 196: fload 9
      // 198: fload 8
      // 19a: fadd
      // 19b: invokevirtual android/graphics/Path.lineTo (FF)V
      // 19e: bipush 2
      // 19f: i2f
      // 1a0: fstore 7
      // 1a2: aload 19
      // 1a4: fload 10
      // 1a6: fload 8
      // 1a8: fsub
      // 1a9: fload 9
      // 1ab: fload 4
      // 1ad: fload 9
      // 1af: fload 7
      // 1b1: fload 8
      // 1b3: fmul
      // 1b4: fadd
      // 1b5: fconst_0
      // 1b6: ldc_w -90.0
      // 1b9: invokevirtual android/graphics/Path.addArc (FFFFFF)V
      // 1bc: aload 19
      // 1be: fload 11
      // 1c0: fload 9
      // 1c2: invokevirtual android/graphics/Path.lineTo (FF)V
      // 1c5: fload 12
      // 1c7: ldc_w 0.55
      // 1ca: fmul
      // 1cb: fload 11
      // 1cd: fadd
      // 1ce: fstore 12
      // 1d0: aload 19
      // 1d2: fload 12
      // 1d4: fload 9
      // 1d6: fload 3
      // 1d7: fload 15
      // 1d9: iload 16
      // 1db: i2f
      // 1dc: ldc_w 0.55
      // 1df: fmul
      // 1e0: fadd
      // 1e1: fload 3
      // 1e2: fload 15
      // 1e4: invokevirtual android/graphics/Path.cubicTo (FFFFFF)V
      // 1e7: aload 19
      // 1e9: fload 3
      // 1ea: fload 14
      // 1ec: invokevirtual android/graphics/Path.lineTo (FF)V
      // 1ef: aload 19
      // 1f1: fload 3
      // 1f2: fload 14
      // 1f4: iload 16
      // 1f6: i2f
      // 1f7: ldc_w 0.55
      // 1fa: fmul
      // 1fb: fsub
      // 1fc: fload 12
      // 1fe: fload 13
      // 200: fload 11
      // 202: fload 13
      // 204: invokevirtual android/graphics/Path.cubicTo (FFFFFF)V
      // 207: aload 1
      // 208: invokevirtual android/graphics/Canvas.save ()I
      // 20b: pop
      // 20c: aload 1
      // 20d: aload 19
      // 20f: invokevirtual android/graphics/Canvas.clipPath (Landroid/graphics/Path;)Z
      // 212: pop
      // 213: aload 1
      // 214: fload 10
      // 216: fload 15
      // 218: fload 3
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
      // 24e: invokestatic com/discord/chat/presentation/list/x.a (Landroid/graphics/Canvas;Landroid/graphics/Path;)Z
      // 251: pop
      // 252: goto 25f
      // 255: aload 1
      // 256: aload 19
      // 258: getstatic android/graphics/Region$Op.DIFFERENCE Landroid/graphics/Region$Op;
      // 25b: invokevirtual android/graphics/Canvas.clipPath (Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
      // 25e: pop
      // 25f: aload 1
      // 260: fload 10
      // 262: fload 11
      // 264: fload 4
      // 266: fload 13
      // 268: aload 21
      // 26a: invokevirtual android/graphics/Canvas.drawRect (FFFFLandroid/graphics/Paint;)V
      // 26d: aload 1
      // 26e: invokevirtual android/graphics/Canvas.restore ()V
      // 271: aload 0
      // 272: fload 5
      // 274: invokespecial com/discord/chat/presentation/list/SwipeHelper.getArrowContainerBaseSize (F)F
      // 277: fload 7
      // 279: fdiv
      // 27a: fstore 8
      // 27c: fload 6
      // 27e: fload 7
      // 280: fdiv
      // 281: fstore 6
      // 283: fload 5
      // 285: fload 7
      // 287: fdiv
      // 288: fload 9
      // 28a: fadd
      // 28b: fload 8
      // 28d: fsub
      // 28e: f2i
      // 28f: istore 17
      // 291: sipush 192
      // 294: i2f
      // 295: fload 2
      // 296: fmul
      // 297: f2i
      // 298: bipush 64
      // 29a: iadd
      // 29b: bipush 0
      // 29c: sipush 255
      // 29f: invokestatic kotlin/ranges/e.m (III)I
      // 2a2: istore 16
      // 2a4: aload 1
      // 2a5: invokevirtual android/graphics/Canvas.save ()I
      // 2a8: pop
      // 2a9: aload 1
      // 2aa: fload 4
      // 2ac: fconst_0
      // 2ad: fload 3
      // 2ae: aload 1
      // 2af: invokevirtual android/graphics/Canvas.getHeight ()I
      // 2b2: i2f
      // 2b3: invokevirtual android/graphics/Canvas.clipRect (FFFF)Z
      // 2b6: pop
      // 2b7: aload 1
      // 2b8: fload 4
      // 2ba: fload 6
      // 2bc: fadd
      // 2bd: fload 8
      // 2bf: fsub
      // 2c0: fload 8
      // 2c2: fadd
      // 2c3: iload 17
      // 2c5: i2f
      // 2c6: fload 8
      // 2c8: fadd
      // 2c9: invokevirtual android/graphics/Canvas.translate (FF)V
      // 2cc: aload 0
      // 2cd: getfield com/discord/chat/presentation/list/SwipeHelper.easterEggArrowScale F
      // 2d0: fstore 3
      // 2d1: aload 1
      // 2d2: fload 3
      // 2d3: fload 3
      // 2d4: invokevirtual android/graphics/Canvas.scale (FF)V
      // 2d7: aload 0
      // 2d8: getfield com/discord/chat/presentation/list/SwipeHelper.isCompleted Z
      // 2db: ifeq 2e3
      // 2de: fconst_1
      // 2df: fstore 3
      // 2e0: goto 2e5
      // 2e3: fload 2
      // 2e4: fstore 3
      // 2e5: aload 21
      // 2e7: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 2ea: invokevirtual com/discord/theme/DiscordThemeObject.getBgSurfaceOverlay ()I
      // 2ed: aload 0
      // 2ee: getfield com/discord/chat/presentation/list/SwipeHelper.context Landroid/content/Context;
      // 2f1: getstatic com/discord/theme/R$color.brand_500 I
      // 2f4: invokestatic com/discord/theme/utils/ColorUtilsKt.getColorCompat (Landroid/content/Context;I)I
      // 2f7: fload 3
      // 2f8: ldc_w 0.8
      // 2fb: fconst_1
      // 2fc: invokestatic com/discord/theme/utils/ColorUtilsKt.interpolateColors (IIFFF)I
      // 2ff: invokevirtual android/graphics/Paint.setColor (I)V
      // 302: aload 21
      // 304: aload 22
      // 306: invokevirtual android/graphics/Paint.setStyle (Landroid/graphics/Paint$Style;)V
      // 309: aload 21
      // 30b: iload 16
      // 30d: invokevirtual android/graphics/Paint.setAlpha (I)V
      // 310: getstatic com/discord/theme/ThemeManager.INSTANCE Lcom/discord/theme/ThemeManager;
      // 313: invokevirtual com/discord/theme/ThemeManager.isThemeLight ()Z
      // 316: ifeq 321
      // 319: ldc_w "#16000000"
      // 31c: astore 19
      // 31e: goto 326
      // 321: ldc_w "#24000000"
      // 324: astore 19
      // 326: aload 21
      // 328: ldc_w 10.0
      // 32b: fconst_0
      // 32c: ldc_w 5.0
      // 32f: aload 19
      // 331: invokestatic android/graphics/Color.parseColor (Ljava/lang/String;)I
      // 334: invokevirtual android/graphics/Paint.setShadowLayer (FFFI)V
      // 337: aload 1
      // 338: fconst_0
      // 339: fconst_0
      // 33a: fload 8
      // 33c: aload 21
      // 33e: invokevirtual android/graphics/Canvas.drawCircle (FFFLandroid/graphics/Paint;)V
      // 341: aload 21
      // 343: invokevirtual android/graphics/Paint.clearShadowLayer ()V
      // 346: aload 0
      // 347: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 34a: fstore 4
      // 34c: fload 4
      // 34e: fconst_0
      // 34f: fcmpl
      // 350: ifle 3ba
      // 353: aload 1
      // 354: invokevirtual android/graphics/Canvas.save ()I
      // 357: istore 17
      // 359: aload 1
      // 35a: fload 4
      // 35c: fload 4
      // 35e: fconst_0
      // 35f: fconst_0
      // 360: invokevirtual android/graphics/Canvas.scale (FFFF)V
      // 363: aload 0
      // 364: getfield com/discord/chat/presentation/list/SwipeHelper.isCompleted Z
      // 367: ifeq 370
      // 36a: fconst_1
      // 36b: fstore 4
      // 36d: goto 373
      // 370: fload 2
      // 371: fstore 4
      // 373: aload 21
      // 375: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 378: invokevirtual com/discord/theme/DiscordThemeObject.getBgSurfaceOverlay ()I
      // 37b: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 37e: invokevirtual com/discord/theme/DiscordThemeObject.getBackgroundAccent ()I
      // 381: fload 4
      // 383: ldc_w 0.8
      // 386: fconst_1
      // 387: invokestatic com/discord/theme/utils/ColorUtilsKt.interpolateColors (IIFFF)I
      // 38a: invokevirtual android/graphics/Paint.setColor (I)V
      // 38d: aload 21
      // 38f: aload 22
      // 391: invokevirtual android/graphics/Paint.setStyle (Landroid/graphics/Paint$Style;)V
      // 394: aload 21
      // 396: sipush 255
      // 399: invokevirtual android/graphics/Paint.setAlpha (I)V
      // 39c: aload 1
      // 39d: fconst_0
      // 39e: fconst_0
      // 39f: fload 8
      // 3a1: aload 21
      // 3a3: invokevirtual android/graphics/Canvas.drawCircle (FFFLandroid/graphics/Paint;)V
      // 3a6: aload 1
      // 3a7: iload 17
      // 3a9: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 3ac: goto 3ba
      // 3af: astore 19
      // 3b1: aload 1
      // 3b2: iload 17
      // 3b4: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 3b7: aload 19
      // 3b9: athrow
      // 3ba: aload 1
      // 3bb: invokevirtual android/graphics/Canvas.save ()I
      // 3be: pop
      // 3bf: fconst_0
      // 3c0: fconst_1
      // 3c1: bipush 1
      // 3c2: i2f
      // 3c3: aload 0
      // 3c4: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 3c7: fsub
      // 3c8: invokestatic java/lang/Float.min (FF)F
      // 3cb: invokestatic java/lang/Math.max (FF)F
      // 3ce: fstore 4
      // 3d0: aload 0
      // 3d1: fload 5
      // 3d3: invokespecial com/discord/chat/presentation/list/SwipeHelper.getArrowIconBaseSize (F)F
      // 3d6: fstore 5
      // 3d8: new android/graphics/PorterDuffColorFilter
      // 3db: dup
      // 3dc: invokestatic com/discord/theme/ThemeManagerKt.getTheme ()Lcom/discord/theme/DiscordThemeObject;
      // 3df: invokevirtual com/discord/theme/DiscordThemeObject.getInteractiveNormal ()I
      // 3e2: aload 0
      // 3e3: getfield com/discord/chat/presentation/list/SwipeHelper.context Landroid/content/Context;
      // 3e6: getstatic com/discord/theme/R$color.white I
      // 3e9: invokestatic com/discord/theme/utils/ColorUtilsKt.getColorCompat (Landroid/content/Context;I)I
      // 3ec: fload 3
      // 3ed: ldc_w 0.8
      // 3f0: fconst_1
      // 3f1: invokestatic com/discord/theme/utils/ColorUtilsKt.interpolateColors (IIFFF)I
      // 3f4: getstatic android/graphics/PorterDuff$Mode.SRC_ATOP Landroid/graphics/PorterDuff$Mode;
      // 3f7: invokespecial android/graphics/PorterDuffColorFilter.<init> (ILandroid/graphics/PorterDuff$Mode;)V
      // 3fa: astore 20
      // 3fc: aload 0
      // 3fd: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 400: astore 19
      // 402: aload 19
      // 404: ifnull 40e
      // 407: aload 19
      // 409: aload 20
      // 40b: invokevirtual android/graphics/drawable/Drawable.setColorFilter (Landroid/graphics/ColorFilter;)V
      // 40e: getstatic com/discord/device/utils/DeviceReducedMotion.INSTANCE Lcom/discord/device/utils/DeviceReducedMotion;
      // 411: aload 0
      // 412: getfield com/discord/chat/presentation/list/SwipeHelper.context Landroid/content/Context;
      // 415: invokevirtual com/discord/device/utils/DeviceReducedMotion.isReducedMotionEnabled (Landroid/content/Context;)Z
      // 418: ifeq 420
      // 41b: fconst_0
      // 41c: fstore 2
      // 41d: goto 428
      // 420: ldc_w 90.0
      // 423: fconst_1
      // 424: fload 2
      // 425: fsub
      // 426: fmul
      // 427: fstore 2
      // 428: aload 0
      // 429: getfield com/discord/chat/presentation/list/SwipeHelper.easterEggArrowRotationDegrees F
      // 42c: fstore 3
      // 42d: aload 1
      // 42e: ldc_w -1.0
      // 431: ldc_w -1.0
      // 434: invokevirtual android/graphics/Canvas.translate (FF)V
      // 437: fload 2
      // 438: fload 3
      // 439: fadd
      // 43a: fstore 2
      // 43b: aload 1
      // 43c: fload 2
      // 43d: invokevirtual android/graphics/Canvas.rotate (F)V
      // 440: aload 1
      // 441: fload 4
      // 443: fload 4
      // 445: invokevirtual android/graphics/Canvas.scale (FF)V
      // 448: fload 5
      // 44a: fconst_2
      // 44b: fdiv
      // 44c: f2i
      // 44d: istore 17
      // 44f: iload 17
      // 451: ineg
      // 452: istore 18
      // 454: new android/graphics/Rect
      // 457: dup
      // 458: iload 18
      // 45a: iload 18
      // 45c: iload 17
      // 45e: iload 17
      // 460: invokespecial android/graphics/Rect.<init> (IIII)V
      // 463: astore 19
      // 465: aload 0
      // 466: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 469: astore 21
      // 46b: aload 21
      // 46d: ifnull 477
      // 470: aload 21
      // 472: aload 19
      // 474: invokevirtual android/graphics/drawable/Drawable.setBounds (Landroid/graphics/Rect;)V
      // 477: aload 0
      // 478: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 47b: astore 21
      // 47d: aload 21
      // 47f: ifnull 489
      // 482: aload 21
      // 484: iload 16
      // 486: invokevirtual android/graphics/drawable/Drawable.setAlpha (I)V
      // 489: aload 0
      // 48a: getfield com/discord/chat/presentation/list/SwipeHelper.replyIcon Landroid/graphics/drawable/Drawable;
      // 48d: astore 21
      // 48f: aload 21
      // 491: ifnull 49a
      // 494: aload 21
      // 496: aload 1
      // 497: invokevirtual android/graphics/drawable/Drawable.draw (Landroid/graphics/Canvas;)V
      // 49a: aload 1
      // 49b: invokevirtual android/graphics/Canvas.restore ()V
      // 49e: aload 0
      // 49f: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 4a2: fconst_0
      // 4a3: fcmpl
      // 4a4: ifle 51f
      // 4a7: aload 1
      // 4a8: invokevirtual android/graphics/Canvas.save ()I
      // 4ab: istore 16
      // 4ad: aload 0
      // 4ae: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 4b1: astore 21
      // 4b3: aload 21
      // 4b5: ifnull 4c7
      // 4b8: aload 21
      // 4ba: aload 20
      // 4bc: invokevirtual android/graphics/drawable/Drawable.setColorFilter (Landroid/graphics/ColorFilter;)V
      // 4bf: goto 4c7
      // 4c2: astore 19
      // 4c4: goto 516
      // 4c7: aload 1
      // 4c8: fload 2
      // 4c9: invokevirtual android/graphics/Canvas.rotate (F)V
      // 4cc: aload 0
      // 4cd: getfield com/discord/chat/presentation/list/SwipeHelper.editCircleScale F
      // 4d0: fstore 2
      // 4d1: aload 1
      // 4d2: fload 2
      // 4d3: fload 2
      // 4d4: invokevirtual android/graphics/Canvas.scale (FF)V
      // 4d7: aload 0
      // 4d8: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 4db: astore 20
      // 4dd: aload 20
      // 4df: ifnull 4e9
      // 4e2: aload 20
      // 4e4: aload 19
      // 4e6: invokevirtual android/graphics/drawable/Drawable.setBounds (Landroid/graphics/Rect;)V
      // 4e9: aload 0
      // 4ea: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 4ed: astore 19
      // 4ef: aload 19
      // 4f1: ifnull 4fc
      // 4f4: aload 19
      // 4f6: sipush 255
      // 4f9: invokevirtual android/graphics/drawable/Drawable.setAlpha (I)V
      // 4fc: aload 0
      // 4fd: getfield com/discord/chat/presentation/list/SwipeHelper.editIcon Landroid/graphics/drawable/Drawable;
      // 500: astore 19
      // 502: aload 19
      // 504: ifnull 50d
      // 507: aload 19
      // 509: aload 1
      // 50a: invokevirtual android/graphics/drawable/Drawable.draw (Landroid/graphics/Canvas;)V
      // 50d: aload 1
      // 50e: iload 16
      // 510: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 513: goto 51f
      // 516: aload 1
      // 517: iload 16
      // 519: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 51c: aload 19
      // 51e: athrow
      // 51f: aload 1
      // 520: invokevirtual android/graphics/Canvas.restore ()V
      // 523: return
   }

   private fun easterEggStartAnimation(recyclerView: RecyclerView, viewHolder: ViewHolder) {
      if (!DeviceReducedMotion.INSTANCE.isReducedMotionEnabled(this.context)) {
         var var3: View = this.mView;
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            var3 = null;
         }

         val var7: PropertyValuesHolder = PropertyValuesHolder.ofFloat(
            "arrow-scale", new float[]{1.0F, this.getArrowContainerGrowthRatio((float)var3.getMeasuredHeight()), 1.0F}
         );
         val var5: ValueAnimator = new ValueAnimator();
         var5.setValues(new PropertyValuesHolder[]{var7});
         var5.setDuration(300L);
         var5.setInterpolator(new AccelerateDecelerateInterpolator());
         var5.addUpdateListener(new C(this, var1));
         this.easterEggArrowAnimator = var5;
         var5.start();
         val var6: PropertyValuesHolder = PropertyValuesHolder.ofFloat("arrow-rotation", new float[]{720.0F, 0.0F});
         val var8: ValueAnimator = new ValueAnimator();
         var8.setValues(new PropertyValuesHolder[]{var6});
         var8.setDuration(800L);
         var8.setInterpolator(new PathInterpolator(0.0F, 0.0F, 0.25F, 1.0F));
         var8.addUpdateListener(new D(this, var1));
         var8.addListener(new AnimatorListener(this, var2, var1) {
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
         this.easterEggArrowRotationAnimator = var8;
         var8.start();
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

      val var7: PropertyValuesHolder = PropertyValuesHolder.ofFloat(
         "edit-circle-scale", new float[]{this.editCircleScale, this.getArrowContainerGrowthRatio((float)var3.getMeasuredHeight()), 1.0F}
      );
      val var8: ValueAnimator = new ValueAnimator();
      var8.setValues(new PropertyValuesHolder[]{var7});
      var8.setDuration(300L);
      var8.setInterpolator(new AccelerateDecelerateInterpolator());
      var8.addUpdateListener(new F(this, var1));
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
                  throw new xa.p();
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
