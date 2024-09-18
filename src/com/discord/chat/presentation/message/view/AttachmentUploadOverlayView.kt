package com.discord.chat.presentation.message.view

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ValueAnimator
import android.animation.Animator.AnimatorListener
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.animation.OvershootInterpolator
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.discord.chat.databinding.AttachmentUploadOverlayViewBinding
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import com.google.android.material.card.MaterialCardView

internal class AttachmentUploadOverlayView  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout {
   private final val animationStartDelay: Long
   private final val binding: AttachmentUploadOverlayViewBinding
   private final var completeViewConfig: com.discord.chat.presentation.message.view.AttachmentUploadOverlayView.CompleteViewConfig?
   private final var onAnimationComplete: () -> Unit
   private final var progressViewConfig: com.discord.chat.presentation.message.view.AttachmentUploadOverlayView.ProgressViewConfig?
   private final val transitionDelay: Long
   private final val transitionInDuration: Long
   private final val transitionOutDuration: Long
   private final var uploadContext: UploadContext?

   fun AttachmentUploadOverlayView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      this.transitionInDuration = 250L;
      this.transitionOutDuration = 175L;
      this.transitionDelay = 400L;
      this.animationStartDelay = 1000L;
      val var3: AttachmentUploadOverlayViewBinding = AttachmentUploadOverlayViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var3, "inflate(...)");
      this.binding = var3;
      this.onAnimationComplete = <unrepresentable>.INSTANCE;
      val var5: SimpleDraweeView = var3.uploadCancel;
      kotlin.jvm.internal.q.e(var3.uploadCancel);
      ReactAssetUtilsKt.setReactAsset(var5, ReactAsset.Cancel);
      ColorUtilsKt.setTintColor(var5, Color.argb(255, 255, 255, 255));
      I18nUtilsKt.i18nContentDescription$default(var5, I18nMessage.CANCEL, null, 2, null);
      val var4: SimpleDraweeView = var3.uploadComplete;
      kotlin.jvm.internal.q.e(var3.uploadComplete);
      ReactAssetUtilsKt.setReactAsset(var4, ReactAsset.Checkmark);
      ColorUtilsKt.setTintColor(var4, Color.argb(255, 88, 101, 242));
      I18nUtilsKt.i18nContentDescription$default(var4, I18nMessage.UPLOAD_COMPLETE, null, 2, null);
   }

   private fun resetUploadOverlay() {
      this.binding.uploadProgressLayout.setAlpha(1.0F);
      this.binding.uploadComplete.setAlpha(0.0F);
      this.binding.uploadProgress.setProgress(0);
   }

   private fun setSquareLayoutParam(view: View, dimension: Int) {
      val var3: android.view.ViewGroup.LayoutParams = var1.getLayoutParams();
      kotlin.jvm.internal.q.g(var3, "getLayoutParams(...)");
      var3.width = var2;
      var3.height = var2;
      var1.setLayoutParams(var3);
   }

   @JvmStatic
   fun `setUploadCancel$lambda$19`(var0: UploadItemProps, var1: View) {
      var0.getOnCancelUploadItem().invoke();
   }

   @JvmStatic
   fun `setUploadCancel$lambda$20`(var0: View) {
   }

   private fun setUploadCompleteBackgroundVisible(): ValueAnimator {
      val var1: ValueAnimator = new ValueAnimator();
      var1.setStartDelay(this.animationStartDelay);
      var1.setFloatValues(new float[]{0.0F, 1.0F});
      var1.setDuration(0L);
      var1.addUpdateListener(new g(this));
      return var1;
   }

   @JvmStatic
   fun `setUploadCompleteBackgroundVisible$lambda$3$lambda$2`(var0: AttachmentUploadOverlayView, var1: ValueAnimator) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      kotlin.jvm.internal.q.h(var1, "it");
      val var3: Any = var1.getAnimatedValue();
      kotlin.jvm.internal.q.f(var3, "null cannot be cast to non-null type kotlin.Float");
      var0.binding.uploadCompleteLayout.setAlpha(var3 as java.lang.Float);
   }

   private fun uploadCompleteAnimationSequence(): AnimatorSet {
      val var1: AnimatorSet = new AnimatorSet();
      var1.playSequentially(
         new Animator[]{this.setUploadCompleteBackgroundVisible(), this.uploadCompleteCheckmarkFadeInAnim(), this.uploadCompleteCheckmarkFadeOutAnim()}
      );
      var1.addListener(new AnimatorListener(this) {
         final AttachmentUploadOverlayView this$0;

         {
            this.this$0 = var1;
         }

         public void onAnimationCancel(Animator var1) {
         }

         public void onAnimationEnd(Animator var1) {
            AttachmentUploadOverlayView.access$getOnAnimationComplete$p(this.this$0).invoke();
         }

         public void onAnimationRepeat(Animator var1) {
         }

         public void onAnimationStart(Animator var1) {
         }
      });
      return var1;
   }

   private fun uploadCompleteCheckmarkFadeInAnim(): AnimatorSet {
      val var1: AnimatorSet = new AnimatorSet();
      var1.setDuration(this.transitionInDuration);
      val var2: ValueAnimator = new ValueAnimator();
      var2.setFloatValues(new float[]{0.0F, 1.0F});
      var2.addUpdateListener(new d(this));
      val var5: ValueAnimator = new ValueAnimator();
      var5.setFloatValues(new float[]{0.8F, 0.9F});
      var5.setInterpolator(new OvershootInterpolator(8.0F));
      var5.addUpdateListener(new e(this));
      val var4: ValueAnimator = new ValueAnimator();
      var4.setFloatValues(new float[]{1.0F, 0.0F});
      var4.addUpdateListener(new f(this));
      var1.playTogether(new Animator[]{var2, var5, var4});
      return var1;
   }

   @JvmStatic
   fun `uploadCompleteCheckmarkFadeInAnim$lambda$10$lambda$5$lambda$4`(var0: AttachmentUploadOverlayView, var1: ValueAnimator) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      kotlin.jvm.internal.q.h(var1, "it");
      val var3: Any = var1.getAnimatedValue();
      kotlin.jvm.internal.q.f(var3, "null cannot be cast to non-null type kotlin.Float");
      var0.binding.uploadComplete.setAlpha(var3 as java.lang.Float);
   }

   @JvmStatic
   fun `uploadCompleteCheckmarkFadeInAnim$lambda$10$lambda$7$lambda$6`(var0: AttachmentUploadOverlayView, var1: ValueAnimator) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      kotlin.jvm.internal.q.h(var1, "it");
      val var3: Any = var1.getAnimatedValue();
      kotlin.jvm.internal.q.f(var3, "null cannot be cast to non-null type kotlin.Float");
      val var2: Float = var3 as java.lang.Float;
      var0.binding.uploadCompleteBackground.setScaleX(var2);
      var0.binding.uploadCompleteBackground.setScaleY(var2);
   }

   @JvmStatic
   fun `uploadCompleteCheckmarkFadeInAnim$lambda$10$lambda$9$lambda$8`(var0: AttachmentUploadOverlayView, var1: ValueAnimator) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      kotlin.jvm.internal.q.h(var1, "it");
      val var3: Any = var1.getAnimatedValue();
      kotlin.jvm.internal.q.f(var3, "null cannot be cast to non-null type kotlin.Float");
      var0.binding.uploadProgressLayout.setAlpha(var3 as java.lang.Float);
   }

   private fun uploadCompleteCheckmarkFadeOutAnim(): AnimatorSet {
      val var2: AnimatorSet = new AnimatorSet();
      var2.setDuration(this.transitionOutDuration);
      var2.setStartDelay(this.transitionDelay);
      val var1: ValueAnimator = new ValueAnimator();
      var1.setFloatValues(new float[]{0.9F, 0.8F});
      var1.addUpdateListener(new h(this));
      val var4: ValueAnimator = new ValueAnimator();
      var4.setFloatValues(new float[]{1.0F, 0.0F});
      var4.addUpdateListener(new i(this));
      var2.playTogether(new Animator[]{var1, var4});
      var2.addListener(new AnimatorListener(this) {
         final AttachmentUploadOverlayView this$0;

         {
            this.this$0 = var1;
         }

         public void onAnimationCancel(Animator var1) {
         }

         public void onAnimationEnd(Animator var1) {
            val var2: ConstraintLayout = AttachmentUploadOverlayView.access$getBinding$p(this.this$0).uploadProgressLayout;
            kotlin.jvm.internal.q.g(var2, "uploadProgressLayout");
            var2.setVisibility(8);
            val var3: ConstraintLayout = AttachmentUploadOverlayView.access$getBinding$p(this.this$0).uploadCompleteLayout;
            kotlin.jvm.internal.q.g(var3, "uploadCompleteLayout");
            var3.setVisibility(8);
         }

         public void onAnimationRepeat(Animator var1) {
         }

         public void onAnimationStart(Animator var1) {
         }
      });
      return var2;
   }

   @JvmStatic
   fun `uploadCompleteCheckmarkFadeOutAnim$lambda$16$lambda$12$lambda$11`(var0: AttachmentUploadOverlayView, var1: ValueAnimator) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      kotlin.jvm.internal.q.h(var1, "it");
      val var3: Any = var1.getAnimatedValue();
      kotlin.jvm.internal.q.f(var3, "null cannot be cast to non-null type kotlin.Float");
      val var2: Float = var3 as java.lang.Float;
      var0.binding.uploadCompleteLayout.setScaleX(var2);
      var0.binding.uploadCompleteLayout.setScaleY(var2);
   }

   @JvmStatic
   fun `uploadCompleteCheckmarkFadeOutAnim$lambda$16$lambda$14$lambda$13`(var0: AttachmentUploadOverlayView, var1: ValueAnimator) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      kotlin.jvm.internal.q.h(var1, "it");
      val var3: Any = var1.getAnimatedValue();
      kotlin.jvm.internal.q.f(var3, "null cannot be cast to non-null type kotlin.Float");
      var0.binding.uploadCompleteLayout.setAlpha(var3 as java.lang.Float);
   }

   public fun configureCompleteView(backgroundSize: Int? = null, checkmarkButtonSize: Int? = null) {
      val var3: AttachmentUploadOverlayView.CompleteViewConfig = new AttachmentUploadOverlayView.CompleteViewConfig(var1, var2);
      if (!kotlin.jvm.internal.q.c(this.completeViewConfig, var3)) {
         if (var1 != null) {
            val var4: MaterialCardView = this.binding.uploadCompleteBackground;
            kotlin.jvm.internal.q.g(this.binding.uploadCompleteBackground, "uploadCompleteBackground");
            this.setSquareLayoutParam(var4, var1);
         }

         if (var2 != null) {
            val var5: SimpleDraweeView = this.binding.uploadComplete;
            kotlin.jvm.internal.q.g(this.binding.uploadComplete, "uploadComplete");
            this.setSquareLayoutParam(var5, var2);
         }

         this.completeViewConfig = var3;
      }
   }

   public fun configureProgressView(
      backgroundSize: Int? = null,
      backgroundDrawable: Drawable? = null,
      cancelButtonSize: Int? = null,
      primaryColor: Int? = null,
      progressIndicatorSize: Int? = null,
      trackColor: Int? = null
   ) {
      val var7: AttachmentUploadOverlayView.ProgressViewConfig = new AttachmentUploadOverlayView.ProgressViewConfig(var1, var2, var3, var4, var5, var6);
      if (!kotlin.jvm.internal.q.c(this.progressViewConfig, var7)) {
         if (var1 != null) {
            val var8: View = this.binding.uploadProgressBackground;
            kotlin.jvm.internal.q.g(this.binding.uploadProgressBackground, "uploadProgressBackground");
            this.setSquareLayoutParam(var8, var1);
         }

         if (var2 != null) {
            this.binding.uploadProgressBackground.setBackground(var2);
         }

         if (var3 != null) {
            val var9: SimpleDraweeView = this.binding.uploadCancel;
            kotlin.jvm.internal.q.g(this.binding.uploadCancel, "uploadCancel");
            this.setSquareLayoutParam(var9, var3);
         }

         if (var4 != null) {
            val var10: SimpleDraweeView = this.binding.uploadCancel;
            kotlin.jvm.internal.q.g(this.binding.uploadCancel, "uploadCancel");
            ColorUtilsKt.setTintColor(var10, var4);
            this.binding.uploadProgress.setIndicatorColor(new int[]{var4});
         }

         if (var5 != null) {
            this.binding.uploadProgress.setIndicatorSize(var5);
         }

         if (var6 != null) {
            this.binding.uploadProgress.setTrackColor(var6);
         }

         this.progressViewConfig = var7;
      }
   }

   public fun setOnProgressAnimationComplete(onAnimationComplete: () -> Unit) {
      kotlin.jvm.internal.q.h(var1, "onAnimationComplete");
      this.onAnimationComplete = var1;
   }

   public fun setProgress(uploadItemProps: UploadItemProps?) {
      var var3: UploadContext;
      if (var1 != null) {
         var3 = var1.getUploadContext();
      } else {
         var3 = null;
      }

      if (!kotlin.jvm.internal.q.c(this.uploadContext, var3)) {
         var3 = null;
         if (var1 != null) {
            var3 = var1.getUploadContext();
         }

         this.uploadContext = var3;
         this.resetUploadOverlay();
      }

      val var2: Boolean;
      if (var1 != null && var1.getUploadProgress() == this.binding.uploadProgress.getProgress()) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (var1 != null && var2 xor true) {
         val var8: ConstraintLayout = this.binding.uploadProgressLayout;
         kotlin.jvm.internal.q.g(this.binding.uploadProgressLayout, "uploadProgressLayout");
         var8.setVisibility(0);
         this.binding.uploadProgress.o(var1.getUploadProgress(), true);
         if (var1.getUploadProgress() >= 100) {
            val var6: ConstraintLayout = this.binding.uploadCompleteLayout;
            kotlin.jvm.internal.q.g(this.binding.uploadCompleteLayout, "uploadCompleteLayout");
            var6.setVisibility(0);
            this.uploadCompleteAnimationSequence().start();
         }
      }
   }

   public fun setUploadCancel(uploadItemProps: UploadItemProps?) {
      if (var1 == null) {
         val var4: ConstraintLayout = this.binding.uploadProgressLayout;
         kotlin.jvm.internal.q.g(this.binding.uploadProgressLayout, "uploadProgressLayout");
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var4, false, null, 1, null);
      } else {
         if (this.binding.uploadProgress.getProgress() != 100) {
            val var2: ConstraintLayout = this.binding.uploadProgressLayout;
            kotlin.jvm.internal.q.g(this.binding.uploadProgressLayout, "uploadProgressLayout");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var2, false, new b(var1), 1, null);
         } else {
            val var3: ConstraintLayout = this.binding.uploadProgressLayout;
            kotlin.jvm.internal.q.g(this.binding.uploadProgressLayout, "uploadProgressLayout");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var3, false, new c(), 1, null);
         }
      }
   }

   public companion object {
      public fun ConstraintLayout.createAndAttachUploadOverlayView(radiusPx: Int): AttachmentUploadOverlayView {
         kotlin.jvm.internal.q.h(var1, "<this>");
         val var3: Context = var1.getContext();
         kotlin.jvm.internal.q.g(var3, "getContext(...)");
         val var5: AttachmentUploadOverlayView = new AttachmentUploadOverlayView(var3, null, 2, null);
         var5.setId(View.generateViewId());
         ViewClippingUtilsKt.clipToRoundedRectangle(var5, var2);
         val var4: ConstraintLayout.LayoutParams = new ConstraintLayout.LayoutParams(-2, -2);
         var4.setMargins(0, SizeUtilsKt.getDpToPx(2), SizeUtilsKt.getDpToPx(2), 0);
         var5.setLayoutParams(var4);
         var1.addView(var5);
         val var6: ConstraintSet = new ConstraintSet();
         var6.f(var1);
         var6.g(var5.getId(), 7, 0, 7, 0);
         var6.g(var5.getId(), 3, 0, 3, 0);
         var6.c(var1);
         return var5;
      }
   }

   public data class CompleteViewConfig(backgroundSize: Int?, checkmarkButtonSize: Int?) {
      public final val backgroundSize: Int?
      public final val checkmarkButtonSize: Int?

      init {
         this.backgroundSize = var1;
         this.checkmarkButtonSize = var2;
      }

      public operator fun component1(): Int? {
         return this.backgroundSize;
      }

      public operator fun component2(): Int? {
         return this.checkmarkButtonSize;
      }

      public fun copy(backgroundSize: Int? = var0.backgroundSize, checkmarkButtonSize: Int? = var0.checkmarkButtonSize): com.discord.chat.presentation.message.view.AttachmentUploadOverlayView.CompleteViewConfig {
         return new AttachmentUploadOverlayView.CompleteViewConfig(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is AttachmentUploadOverlayView.CompleteViewConfig) {
            return false;
         } else {
            var1 = var1;
            if (!kotlin.jvm.internal.q.c(this.backgroundSize, var1.backgroundSize)) {
               return false;
            } else {
               return kotlin.jvm.internal.q.c(this.checkmarkButtonSize, var1.checkmarkButtonSize);
            }
         }
      }

      public override fun hashCode(): Int {
         var var2: Int = 0;
         val var1: Int;
         if (this.backgroundSize == null) {
            var1 = 0;
         } else {
            var1 = this.backgroundSize.hashCode();
         }

         if (this.checkmarkButtonSize != null) {
            var2 = this.checkmarkButtonSize.hashCode();
         }

         return var1 * 31 + var2;
      }

      public override fun toString(): String {
         val var3: Int = this.backgroundSize;
         val var1: Int = this.checkmarkButtonSize;
         val var2: StringBuilder = new StringBuilder();
         var2.append("CompleteViewConfig(backgroundSize=");
         var2.append(var3);
         var2.append(", checkmarkButtonSize=");
         var2.append(var1);
         var2.append(")");
         return var2.toString();
      }
   }

   public data class ProgressViewConfig(backgroundSize: Int?,
      backgroundDrawable: Drawable?,
      cancelButtonSize: Int?,
      primaryColor: Int?,
      progressIndicatorSize: Int?,
      trackColor: Int?
   ) {
      public final val backgroundDrawable: Drawable?
      public final val backgroundSize: Int?
      public final val cancelButtonSize: Int?
      public final val primaryColor: Int?
      public final val progressIndicatorSize: Int?
      public final val trackColor: Int?

      init {
         this.backgroundSize = var1;
         this.backgroundDrawable = var2;
         this.cancelButtonSize = var3;
         this.primaryColor = var4;
         this.progressIndicatorSize = var5;
         this.trackColor = var6;
      }

      public operator fun component1(): Int? {
         return this.backgroundSize;
      }

      public operator fun component2(): Drawable? {
         return this.backgroundDrawable;
      }

      public operator fun component3(): Int? {
         return this.cancelButtonSize;
      }

      public operator fun component4(): Int? {
         return this.primaryColor;
      }

      public operator fun component5(): Int? {
         return this.progressIndicatorSize;
      }

      public operator fun component6(): Int? {
         return this.trackColor;
      }

      public fun copy(
         backgroundSize: Int? = var0.backgroundSize,
         backgroundDrawable: Drawable? = var0.backgroundDrawable,
         cancelButtonSize: Int? = var0.cancelButtonSize,
         primaryColor: Int? = var0.primaryColor,
         progressIndicatorSize: Int? = var0.progressIndicatorSize,
         trackColor: Int? = var0.trackColor
      ): com.discord.chat.presentation.message.view.AttachmentUploadOverlayView.ProgressViewConfig {
         return new AttachmentUploadOverlayView.ProgressViewConfig(var1, var2, var3, var4, var5, var6);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is AttachmentUploadOverlayView.ProgressViewConfig) {
            return false;
         } else {
            var1 = var1;
            if (!kotlin.jvm.internal.q.c(this.backgroundSize, var1.backgroundSize)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.backgroundDrawable, var1.backgroundDrawable)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.cancelButtonSize, var1.cancelButtonSize)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.primaryColor, var1.primaryColor)) {
               return false;
            } else if (!kotlin.jvm.internal.q.c(this.progressIndicatorSize, var1.progressIndicatorSize)) {
               return false;
            } else {
               return kotlin.jvm.internal.q.c(this.trackColor, var1.trackColor);
            }
         }
      }

      public override fun hashCode(): Int {
         var var6: Int = 0;
         val var1: Int;
         if (this.backgroundSize == null) {
            var1 = 0;
         } else {
            var1 = this.backgroundSize.hashCode();
         }

         val var2: Int;
         if (this.backgroundDrawable == null) {
            var2 = 0;
         } else {
            var2 = this.backgroundDrawable.hashCode();
         }

         val var3: Int;
         if (this.cancelButtonSize == null) {
            var3 = 0;
         } else {
            var3 = this.cancelButtonSize.hashCode();
         }

         val var4: Int;
         if (this.primaryColor == null) {
            var4 = 0;
         } else {
            var4 = this.primaryColor.hashCode();
         }

         val var5: Int;
         if (this.progressIndicatorSize == null) {
            var5 = 0;
         } else {
            var5 = this.progressIndicatorSize.hashCode();
         }

         if (this.trackColor != null) {
            var6 = this.trackColor.hashCode();
         }

         return ((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6;
      }

      public override fun toString(): String {
         val var6: Int = this.backgroundSize;
         val var5: Drawable = this.backgroundDrawable;
         val var2: Int = this.cancelButtonSize;
         val var3: Int = this.primaryColor;
         val var4: Int = this.progressIndicatorSize;
         val var1: Int = this.trackColor;
         val var7: StringBuilder = new StringBuilder();
         var7.append("ProgressViewConfig(backgroundSize=");
         var7.append(var6);
         var7.append(", backgroundDrawable=");
         var7.append(var5);
         var7.append(", cancelButtonSize=");
         var7.append(var2);
         var7.append(", primaryColor=");
         var7.append(var3);
         var7.append(", progressIndicatorSize=");
         var7.append(var4);
         var7.append(", trackColor=");
         var7.append(var1);
         var7.append(")");
         return var7.toString();
      }
   }
}
