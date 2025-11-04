package com.discord.sticker

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.discord.image.animated_image.apng.APNGImageView
import com.discord.image.animated_image.apng.APNGView.Config
import com.discord.sticker.sticker_types.PNGStickerView
import com.discord.sticker.sticker_types.RLottieImageView
import com.discord.sticker.sticker_types.RLottieStubView
import com.discord.sticker.sticker_types.RLottieUtils
import kotlin.jvm.internal.Intrinsics

public class StickerView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : APNGImageView(var1, var2, var3) {
   private final lateinit var pngView: PNGStickerView
   private final lateinit var lottieView: View

   fun StickerView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun StickerView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   public fun asApng(url: String, widthDp: Int?, heightDp: Int?, animate: Boolean, accessibilityLabel: String?) {
      APNGImageView.inflateApngView$default(this, false, 1, null);
      this.getApngView().loadImage(new Config(var1, var4, false, var2, var3, "stickers", 4, null));
      if (var5 != null) {
         this.getApngView().setContentDescription(var5);
      }

      APNGImageView.resetViews$default(this, this.getApngView(), false, 2, null);
   }

   public fun asGif(url: String, widthDp: Int?, heightDp: Int?, animate: Boolean, accessibilityLabel: String) {
      this.inflatePngView();
      var var6: PNGStickerView = this.pngView;
      if (this.pngView == null) {
         Intrinsics.throwUninitializedPropertyAccessException("pngView");
         var6 = null;
      }

      var6.loadGifImage(var1, var2, var3, var4);
      var var8: PNGStickerView = this.pngView;
      if (this.pngView == null) {
         Intrinsics.throwUninitializedPropertyAccessException("pngView");
         var8 = null;
      }

      var8.setContentDescription(var5);
      var var9: PNGStickerView = this.pngView;
      if (this.pngView == null) {
         Intrinsics.throwUninitializedPropertyAccessException("pngView");
         var9 = null;
      }

      APNGImageView.resetViews$default(this, var9, false, 2, null);
   }

   public fun asLottie(url: String, widthDp: Int, heightDp: Int, animate: Boolean, asset: String, renderMode: Int, accessibilityLabel: String?) {
      this.inflateLottieView();
      var var8: View = this.lottieView;
      if (this.lottieView == null) {
         Intrinsics.throwUninitializedPropertyAccessException("lottieView");
         var8 = null;
      }

      val var10: RLottieImageView;
      if (var8 is RLottieImageView) {
         var10 = var8 as RLottieImageView;
      } else {
         var10 = null;
      }

      if (var10 != null) {
         var10.loadImage(new RLottieImageView.Config(var1, var4, var2, var3, var5, var6));
         if (var7 != null) {
            var10.setContentDescription(var7);
         }

         APNGImageView.resetViews$default(this, var10, false, 2, null);
      }
   }

   public fun asPng(url: String, widthDp: Int?, heightDp: Int?, accessibilityLabel: String) {
      this.inflatePngView();
      var var5: PNGStickerView = this.pngView;
      if (this.pngView == null) {
         Intrinsics.throwUninitializedPropertyAccessException("pngView");
         var5 = null;
      }

      var5.loadImage(var1, var2, var3);
      var var7: PNGStickerView = this.pngView;
      if (this.pngView == null) {
         Intrinsics.throwUninitializedPropertyAccessException("pngView");
         var7 = null;
      }

      var7.setContentDescription(var4);
      var var8: PNGStickerView = this.pngView;
      if (this.pngView == null) {
         Intrinsics.throwUninitializedPropertyAccessException("pngView");
         var8 = null;
      }

      APNGImageView.resetViews$default(this, var8, false, 2, null);
   }

   public fun inflateLottieView() {
      if (this.lottieView == null) {
         val var1: Boolean = RLottieUtils.INSTANCE.getInitialized$sticker_release();
         var var2: View = null;
         if (var1) {
            val var3: Context = this.getContext();
            val var4: RLottieImageView = new RLottieImageView(var3);
            RLottieImageView.recycle$default(var4, false, 1, null);
            this.lottieView = var4;
         } else {
            val var5: Context = this.getContext();
            this.lottieView = new RLottieStubView(var5);
         }

         if (this.lottieView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lottieView");
         } else {
            var2 = this.lottieView;
         }

         this.addView(var2);
      }
   }

   public fun inflatePngView() {
      if (this.pngView == null) {
         val var1: Context = this.getContext();
         val var2: PNGStickerView = new PNGStickerView(var1);
         this.pngView = var2;
         this.addView(var2);
      }
   }

   public open fun recycleChild(child: View) {
      super.recycleChild(var1);
      val var2: RLottieImageView;
      if (var1 is RLottieImageView) {
         var2 = var1 as RLottieImageView;
      } else {
         var2 = null;
      }

      if (var2 != null) {
         var2.recycle(true);
      }
   }
}
