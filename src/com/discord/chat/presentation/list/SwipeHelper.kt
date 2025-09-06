package com.discord.chat.presentation.list

import android.animation.Animator
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import android.animation.Animator.AnimatorListener
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.PorterDuffColorFilter
import android.graphics.Rect
import android.graphics.Paint.Style
import android.graphics.Path.Direction
import android.graphics.PorterDuff.Mode
import android.graphics.Region.Op
import android.graphics.drawable.Drawable
import android.os.Handler
import android.os.Build.VERSION
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
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSwipeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeHelper.kt\ncom/discord/chat/presentation/list/SwipeHelper\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,543:1\n29#2:544\n85#2,18:545\n29#2:563\n85#2,18:564\n*S KotlinDebug\n*F\n+ 1 SwipeHelper.kt\ncom/discord/chat/presentation/list/SwipeHelper\n*L\n265#1:544\n265#1:545,18\n342#1:563\n342#1:564,18\n*E\n"])
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
      if (this.currentItemViewHolder != null && this.dX != 0.0F) {
         var var19: View = this.mView;
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            var19 = null;
         }

         var var4: Float = Math.abs(var19.getTranslationX());
         var19 = this.mView;
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            var19 = null;
         }

         var var5: Float = var19.getMeasuredHeight();
         val var21: Paint = new Paint();
         if (this.currentItemViewHolder != null) {
            var19 = this.currentItemViewHolder.itemView;
         } else {
            var19 = null;
         }

         val var44: SwipeReplyInitiator;
         if (var19 is SwipeReplyInitiator) {
            var44 = var19 as SwipeReplyInitiator;
         } else {
            var44 = null;
         }

         val var22: Style = Style.FILL;
         var21.setStyle(Style.FILL);
         if (var44 != null && var44.getUsingGradientTheme()) {
            var21.setColor(ThemeManagerKt.getTheme().getChatSwipeToReplyGradientBackground());
         } else {
            var21.setColor(ThemeManagerKt.getTheme().getChatSwipeToReplyBackground());
         }

         var1.save();
         var var2: Float = this.getSwipeProgress();
         var var9: Float = this.getLeftBevelRadius(var2, var5);
         val var13: Float = MAX_RIGHT_BEVEL_WIDTH * var2;
         var19 = this.mView;
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            var19 = null;
         }

         var var3: Float = var19.getMeasuredWidth();
         var19 = this.mView;
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            var19 = null;
         }

         val var6: Float = var3 + var19.getTranslationX();
         val var10: Float = var6 - var9;
         var3 = var6 + var4;
         var var12: Float = var6 + var4 - var13;
         var19 = this.mView;
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            var19 = null;
         }

         val var7: Float = var19.getTop();
         var var16: Int = RIGHT_BEVEL_HEIGHT;
         val var15: Float = var7 - RIGHT_BEVEL_HEIGHT;
         val var35: Float = RIGHT_BEVEL_HEIGHT + (var7 - RIGHT_BEVEL_HEIGHT);
         val var14: Float = var7 - RIGHT_BEVEL_HEIGHT + var5 + RIGHT_BEVEL_HEIGHT * 2;
         val var11: Float = var15 + var5 + RIGHT_BEVEL_HEIGHT * 2 - RIGHT_BEVEL_HEIGHT;
         val var48: Path = new Path();
         var48.moveTo(var12, var11);
         var48.lineTo(var6, var11);
         var48.lineTo(var6, var35 + var9);
         val var8: Float = 2;
         var48.addArc(var10 - var9, var35, var6, var35 + (float)2 * var9, 0.0F, -90.0F);
         var48.lineTo(var12, var35);
         val var38: Float = var13 * 0.55F + var12;
         var48.cubicTo(var13 * 0.55F + var12, var35, var3, var15 + (float)var16 * 0.55F, var3, var15);
         var48.lineTo(var3, var14);
         var48.cubicTo(var3, var14 - (float)var16 * 0.55F, var38, var11, var12, var11);
         var1.save();
         var1.clipPath(var48);
         var1.drawRect(var10, var15, var3, var14, var21);
         var1.restore();
         var1.save();
         var48.reset();
         var12 = var11 - var9;
         var48.addCircle(var10, var11 - var9, var9, Direction.CW);
         if (VERSION.SDK_INT >= 26) {
            p.a(var1, var48);
         } else {
            var1.clipPath(var48, Op.DIFFERENCE);
         }

         var1.drawRect(var10, var12, var6, var11, var21);
         var1.restore();
         var9 = this.getArrowContainerBaseSize(var5) / var8;
         var4 = var4 / var8;
         val var17: Int = (int)(var5 / var8 + var35 - var9);
         var16 = kotlin.ranges.d.l((int)((float)192 * var2) + 64, 0, 255);
         var1.save();
         var1.clipRect(var6, 0.0F, var3, (float)var1.getHeight());
         var1.translate(var6 + var4 - var9 + var9, (float)var17 + var9);
         var1.scale(this.easterEggArrowScale, this.easterEggArrowScale);
         if (this.isCompleted) {
            var3 = 1.0F;
         } else {
            var3 = var2;
         }

         var21.setColor(
            ColorUtilsKt.interpolateColors(
               ThemeManagerKt.getTheme().getBgSurfaceOverlay(),
               ColorUtilsKt.getColorCompat(this.context, com.discord.theme.R.color.brand_500),
               var3,
               0.8F,
               1.0F
            )
         );
         var21.setStyle(var22);
         var21.setAlpha(var16);
         val var49: java.lang.String;
         if (ThemeManager.INSTANCE.isThemeLight()) {
            var49 = "#16000000";
         } else {
            var49 = "#24000000";
         }

         var21.setShadowLayer(10.0F, 0.0F, 5.0F, Color.parseColor(var49));
         var1.drawCircle(0.0F, 0.0F, var9, var21);
         var21.clearShadowLayer();
         if (this.editCircleScale > 0.0F) {
            var1.save();
            var1.scale(this.editCircleScale, this.editCircleScale);
            if (this.isCompleted) {
               var4 = 1.0F;
            } else {
               var4 = var2;
            }

            var21.setColor(
               ColorUtilsKt.interpolateColors(
                  ThemeManagerKt.getTheme().getBgSurfaceOverlay(), ThemeManagerKt.getTheme().getBackgroundAccent(), var4, 0.8F, 1.0F
               )
            );
            var21.setStyle(var22);
            var21.setAlpha(255);
            var1.drawCircle(0.0F, 0.0F, var9, var21);
            var1.restore();
         }

         var1.save();
         var4 = Math.max(0.0F, java.lang.Float.min(1.0F, (float)1 - this.editCircleScale));
         var5 = this.getArrowIconBaseSize(var5);
         val var50: PorterDuffColorFilter = new PorterDuffColorFilter(
            ColorUtilsKt.interpolateColors(
               ThemeManagerKt.getTheme().getInteractiveNormal(), ColorUtilsKt.getColorCompat(this.context, com.discord.theme.R.color.white), var3, 0.8F, 1.0F
            ),
            Mode.SRC_ATOP
         );
         if (this.replyIcon != null) {
            this.replyIcon.setColorFilter(var50);
         }

         if (DeviceReducedMotion.INSTANCE.isReducedMotionEnabled(this.context)) {
            var2 = 0.0F;
         } else {
            var2 = 90.0F * (1.0F - var2);
         }

         var3 = this.easterEggArrowRotationDegrees;
         var1.translate(-1.0F, -1.0F);
         val var24: Float = var2 + var3;
         var1.rotate(var2 + var3);
         var1.scale(var4, var4);
         val var58: Rect = new Rect(-((int)(var5 / 2.0F)), -((int)(var5 / 2.0F)), (int)(var5 / 2.0F), (int)(var5 / 2.0F));
         if (this.replyIcon != null) {
            this.replyIcon.setBounds(var58);
         }

         if (this.replyIcon != null) {
            this.replyIcon.setAlpha(var16);
         }

         if (this.replyIcon != null) {
            this.replyIcon.draw(var1);
         }

         var1.restore();
         if (this.editCircleScale > 0.0F) {
            var1.save();
            if (this.editIcon != null) {
               this.editIcon.setColorFilter(var50);
            }

            var1.rotate(var24);
            var1.scale(this.editCircleScale, this.editCircleScale);
            if (this.editIcon != null) {
               this.editIcon.setBounds(var58);
            }

            if (this.editIcon != null) {
               this.editIcon.setAlpha(255);
            }

            if (this.editIcon != null) {
               this.editIcon.draw(var1);
            }

            var1.restore();
         }

         var1.restore();
      }
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
         var5.addUpdateListener(new s(this, var1));
         this.easterEggArrowAnimator = var5;
         var5.start();
         val var6: PropertyValuesHolder = PropertyValuesHolder.ofFloat("arrow-rotation", new float[]{720.0F, 0.0F});
         val var8: ValueAnimator = new ValueAnimator();
         var8.setValues(new PropertyValuesHolder[]{var6});
         var8.setDuration(800L);
         var8.setInterpolator(new PathInterpolator(0.0F, 0.0F, 0.25F, 1.0F));
         var8.addUpdateListener(new t(this, var1));
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
      var8.addUpdateListener(new v(this, var1));
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
      var2.addUpdateListener(new u(this, var1));
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
         val var3: Float = this.getSwipeProgress();
         val var2: Float = SizeUtilsKt.getDpToPx(12);
         if (this.mView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
         } else {
            var6 = this.mView;
         }

         val var4: Float = this.getLeftBevelRadius(var3, (float)var6.getMeasuredHeight());
         val var10: java.lang.String;
         if (ThemeManager.INSTANCE.isThemeLight()) {
            var10 = "#1F000000";
         } else {
            var10 = "#3E000000";
         }

         var9.getShadowView().setParams(var2 * var3, var4, var10);
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
                  throw new B9.n();
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
