package com.discord.mobile_voice_overlay.views

import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.animation.Animator.AnimatorListener
import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager.LayoutParams
import android.view.animation.OvershootInterpolator
import android.view.animation.ScaleAnimation
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData
import com.discord.mobile_voice_overlay.R
import com.discord.mobile_voice_overlay.databinding.TrashWrapBinding
import com.discord.mobile_voice_overlay.utils.WindowUtils
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.q

public class OverlayTrashWrap : OverlayView {
   private final val binding: TrashWrapBinding
   private final val hideAnimator: Animator
   private final val locationOnScreen: IntArray
   private final var previousBubbleOverTrashZone: OverlayBubbleWrap?
   private final val showAnimator: Animator
   private final val trashZoneRect: Rect
   private final var windowLayoutParams: LayoutParams

   public constructor(context: Context) : q.h(var1, "context") {
      super(var1);
      val var2: WindowUtils = WindowUtils.INSTANCE;
      val var5: LayoutParams = WindowUtils.INSTANCE.createWindowLayoutParams();
      var5.width = -1;
      var5.gravity = 81;
      var2.addFlag(var5, 16);
      this.windowLayoutParams = var5;
      val var6: TrashWrapBinding = TrashWrapBinding.inflate(LayoutInflater.from(this.getContext()), this);
      q.g(var6, "inflate(...)");
      this.binding = var6;
      this.setBackgroundResource(R.drawable.trash_bg);
      this.setVisibility(4);
      var6.trashWrapTargetContainer.setActivated(false);
      val var7: AnimatorSet = new AnimatorSet();
      var var3: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.fade_in);
      var3.setTarget(this);
      var var10: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.slide_in_bottom);
      var10.setTarget(var6.trashWrapTargetZone);
      var7.playTogether(new Animator[]{var3, var10});
      var7.addListener(new AnimatorListener(this) {
         final OverlayTrashWrap this$0;

         {
            this.this$0 = var1;
         }

         public void onAnimationCancel(Animator var1) {
         }

         public void onAnimationEnd(Animator var1) {
         }

         public void onAnimationRepeat(Animator var1) {
         }

         public void onAnimationStart(Animator var1) {
            this.this$0.setVisibility(0);
         }
      });
      this.showAnimator = var7;
      val var8: AnimatorSet = new AnimatorSet();
      var10 = AnimatorInflater.loadAnimator(this.getContext(), R.animator.fade_out);
      var10.setTarget(this);
      var3 = AnimatorInflater.loadAnimator(this.getContext(), R.animator.slide_out_bottom);
      var3.setTarget(var6.trashWrapTargetZone);
      var8.playTogether(new Animator[]{var10, var3});
      var8.addListener(new AnimatorListener(this) {
         final OverlayTrashWrap this$0;

         {
            this.this$0 = var1;
         }

         public void onAnimationCancel(Animator var1) {
         }

         public void onAnimationEnd(Animator var1) {
            this.this$0.setVisibility(4);
         }

         public void onAnimationRepeat(Animator var1) {
         }

         public void onAnimationStart(Animator var1) {
         }
      });
      this.hideAnimator = var8;
      this.trashZoneRect = new Rect();
      this.locationOnScreen = new int[]{0, 0};
   }

   public constructor(context: Context, attrs: AttributeSet?) : q.h(var1, "context") {
      super(var1, var2);
      val var5: WindowUtils = WindowUtils.INSTANCE;
      val var7: LayoutParams = WindowUtils.INSTANCE.createWindowLayoutParams();
      var7.width = -1;
      var7.gravity = 81;
      var5.addFlag(var7, 16);
      this.windowLayoutParams = var7;
      val var6: TrashWrapBinding = TrashWrapBinding.inflate(LayoutInflater.from(this.getContext()), this);
      q.g(var6, "inflate(...)");
      this.binding = var6;
      this.setBackgroundResource(R.drawable.trash_bg);
      this.setVisibility(4);
      var6.trashWrapTargetContainer.setActivated(false);
      val var3: AnimatorSet = new AnimatorSet();
      val var8: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.fade_in);
      var8.setTarget(this);
      var var11: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.slide_in_bottom);
      var11.setTarget(var6.trashWrapTargetZone);
      var3.playTogether(new Animator[]{var8, var11});
      var3.addListener(new AnimatorListener(this) {
         final OverlayTrashWrap this$0;

         {
            this.this$0 = var1;
         }

         public void onAnimationCancel(Animator var1) {
         }

         public void onAnimationEnd(Animator var1) {
         }

         public void onAnimationRepeat(Animator var1) {
         }

         public void onAnimationStart(Animator var1) {
            this.this$0.setVisibility(0);
         }
      });
      this.showAnimator = var3;
      val var9: AnimatorSet = new AnimatorSet();
      val var10: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.fade_out);
      var10.setTarget(this);
      var11 = AnimatorInflater.loadAnimator(this.getContext(), R.animator.slide_out_bottom);
      var11.setTarget(var6.trashWrapTargetZone);
      var9.playTogether(new Animator[]{var10, var11});
      var9.addListener(new AnimatorListener(this) {
         final OverlayTrashWrap this$0;

         {
            this.this$0 = var1;
         }

         public void onAnimationCancel(Animator var1) {
         }

         public void onAnimationEnd(Animator var1) {
            this.this$0.setVisibility(4);
         }

         public void onAnimationRepeat(Animator var1) {
         }

         public void onAnimationStart(Animator var1) {
         }
      });
      this.hideAnimator = var9;
      this.trashZoneRect = new Rect();
      this.locationOnScreen = new int[]{0, 0};
   }

   public constructor(context: Context, attrs: AttributeSet?, attributeSetId: Int) : q.h(var1, "context") {
      super(var1, var2, var3);
      val var6: WindowUtils = WindowUtils.INSTANCE;
      val var8: LayoutParams = WindowUtils.INSTANCE.createWindowLayoutParams();
      var8.width = -1;
      var8.gravity = 81;
      var6.addFlag(var8, 16);
      this.windowLayoutParams = var8;
      val var7: TrashWrapBinding = TrashWrapBinding.inflate(LayoutInflater.from(this.getContext()), this);
      q.g(var7, "inflate(...)");
      this.binding = var7;
      this.setBackgroundResource(R.drawable.trash_bg);
      this.setVisibility(4);
      var7.trashWrapTargetContainer.setActivated(false);
      val var4: AnimatorSet = new AnimatorSet();
      val var9: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.fade_in);
      var9.setTarget(this);
      val var12: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.slide_in_bottom);
      var12.setTarget(var7.trashWrapTargetZone);
      var4.playTogether(new Animator[]{var9, var12});
      var4.addListener(new AnimatorListener(this) {
         final OverlayTrashWrap this$0;

         {
            this.this$0 = var1;
         }

         public void onAnimationCancel(Animator var1) {
         }

         public void onAnimationEnd(Animator var1) {
         }

         public void onAnimationRepeat(Animator var1) {
         }

         public void onAnimationStart(Animator var1) {
            this.this$0.setVisibility(0);
         }
      });
      this.showAnimator = var4;
      val var13: AnimatorSet = new AnimatorSet();
      val var11: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.fade_out);
      var11.setTarget(this);
      val var10: Animator = AnimatorInflater.loadAnimator(this.getContext(), R.animator.slide_out_bottom);
      var10.setTarget(var7.trashWrapTargetZone);
      var13.playTogether(new Animator[]{var11, var10});
      var13.addListener(new AnimatorListener(this) {
         final OverlayTrashWrap this$0;

         {
            this.this$0 = var1;
         }

         public void onAnimationCancel(Animator var1) {
         }

         public void onAnimationEnd(Animator var1) {
            this.this$0.setVisibility(4);
         }

         public void onAnimationRepeat(Animator var1) {
         }

         public void onAnimationStart(Animator var1) {
         }
      });
      this.hideAnimator = var13;
      this.trashZoneRect = new Rect();
      this.locationOnScreen = new int[]{0, 0};
   }

   private fun handleViewDraggedIntoTrashZone(view: View) {
      this.binding.trashWrapTargetContainer.setActivated(true);
      val var2: Float = (float)Math.max(Math.max(var1.getWidth(), var1.getHeight()), this.binding.trashWrapTargetContainer.getWidth())
            / this.binding.trashWrapTargetContainer.getWidth()
         + 0.5F;
      val var3: ScaleAnimation = new ScaleAnimation(
         this.binding.trashWrapTargetContainer.getScaleX(),
         var2,
         this.binding.trashWrapTargetContainer.getScaleY(),
         var2,
         this.binding.trashWrapTargetContainer.getPivotX(),
         this.binding.trashWrapTargetContainer.getPivotY()
      );
      var3.setDuration(200L);
      var3.setInterpolator(new OvershootInterpolator());
      var3.setFillAfter(true);
      this.binding.trashWrapTargetContainer.startAnimation(var3);
   }

   private fun handleViewDraggedOutOfTrashZone() {
      this.binding.trashWrapTargetContainer.setActivated(false);
      this.setActivated(false);
      val var1: ScaleAnimation = new ScaleAnimation(
         this.binding.trashWrapTargetContainer.getScaleX(), 1.0F, this.binding.trashWrapTargetContainer.getScaleY(), 1.0F
      );
      var1.setDuration(200L);
      var1.setInterpolator(this.getContext(), 17563655);
      var1.setFillAfter(true);
      this.binding.trashWrapTargetContainer.startAnimation(var1);
   }

   public override fun getInitialLayoutParams(): LayoutParams {
      return this.windowLayoutParams;
   }

   public fun hide() {
      this.hideAnimator.start();
   }

   protected open fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (var1) {
         this.binding.trashWrapTargetZone.getLocationOnScreen(this.locationOnScreen);
         var3 = this.locationOnScreen[0];
         var2 = this.locationOnScreen[1];
         this.trashZoneRect
            .set(var3, this.locationOnScreen[1], this.binding.trashWrapTargetZone.getWidth() + var3, this.binding.trashWrapTargetZone.getHeight() + var2);
      }
   }

   public fun processMotionEvent(bubble: OverlayBubbleWrap, motionEvent: MotionEvent): Boolean {
      q.h(var1, "bubble");
      q.h(var2, "motionEvent");
      if (!this.trashZoneRect.contains((int)var2.getRawX(), (int)var2.getRawY())) {
         var1 = null;
      }

      var var3: Boolean = this.binding.trashWrapTargetContainer.isActivated();
      if (var1 != null && !var3) {
         this.handleViewDraggedIntoTrashZone(var1);
      } else if (var1 == null && var3) {
         this.handleViewDraggedOutOfTrashZone();
      }

      if (!q.c(var1, this.previousBubbleOverTrashZone)) {
         if (var1 != null) {
            val var5: SimpleDraweeView = this.binding.trashWrapIcon;
            q.g(this.binding.trashWrapIcon, "trashWrapIcon");
            var1.anchorOn(var5);
         }

         this.performHapticFeedback(6);
         if (this.previousBubbleOverTrashZone != null) {
            OverlayBubbleWrap.anchorOff$default(this.previousBubbleOverTrashZone, false, 1, null);
         }

         this.previousBubbleOverTrashZone = var1;
      }

      var3 = false;
      if (var1 != null) {
         var3 = false;
         if (var2.getAction() == 1) {
            var3 = true;
         }
      }

      return var3;
   }

   public override fun setAssets(assets: MobileVoiceOverlayAssets) {
      q.h(var1, "assets");
      super.setAssets(var1);
      val var2: SimpleDraweeView = this.binding.trashWrapIcon;
      q.g(this.binding.trashWrapIcon, "trashWrapIcon");
      ReactAssetUtilsKt.setReactAsset(var2, ReactAsset.Close);
      val var3: SimpleDraweeView = this.binding.trashWrapIcon;
      q.g(this.binding.trashWrapIcon, "trashWrapIcon");
      ColorUtilsKt.setTintColor(var3, ThemeManagerKt.getTheme().getInteractiveNormal());
   }

   public override fun setData(data: MobileVoiceOverlayData) {
      q.h(var1, "data");
   }

   public fun show() {
      this.showAnimator.start();
   }
}
