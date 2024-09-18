package com.discord.sticker

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.discord.image.animated_image.apng.APNGImageView
import com.discord.image.animated_image.apng.APNGView
import com.discord.sticker.sticker_types.PNGStickerView
import com.discord.sticker.sticker_types.RLottieImageView
import com.discord.sticker.sticker_types.RLottieStubView
import com.discord.sticker.sticker_types.RLottieUtils
import kotlin.jvm.internal.q

public class StickerView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : APNGImageView {
   private final lateinit var lottieView: View
   private final lateinit var pngView: PNGStickerView

   fun StickerView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun StickerView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
   }

   public fun asApng(url: String, widthDp: Int?, heightDp: Int?, animate: Boolean) {
      q.h(var1, "url");
      APNGImageView.inflateApngView$default(this, false, 1, null);
      this.getApngView().loadImage(new APNGView.Config(var1, var4, false, var2, var3, "stickers", 4, null));
      APNGImageView.resetViews$default(this, this.getApngView(), false, 2, null);
   }

   public fun asGif(url: String, widthDp: Int?, heightDp: Int?, animate: Boolean) {
      q.h(var1, "url");
      this.inflatePngView();
      var var5: PNGStickerView = this.pngView;
      if (this.pngView == null) {
         q.y("pngView");
         var5 = null;
      }

      var5.loadGifImage(var1, var2, var3, var4);
      var var7: PNGStickerView = this.pngView;
      if (this.pngView == null) {
         q.y("pngView");
         var7 = null;
      }

      APNGImageView.resetViews$default(this, var7, false, 2, null);
   }

   public fun asLottie(url: String, widthDp: Int, heightDp: Int, animate: Boolean, asset: String, renderMode: Int) {
      q.h(var1, "url");
      q.h(var5, "asset");
      this.inflateLottieView();
      var var7: View = this.lottieView;
      if (this.lottieView == null) {
         q.y("lottieView");
         var7 = null;
      }

      val var9: RLottieImageView;
      if (var7 is RLottieImageView) {
         var9 = var7 as RLottieImageView;
      } else {
         var9 = null;
      }

      if (var9 != null) {
         var9.loadImage(new RLottieImageView.Config(var1, var4, var2, var3, var5, var6));
         APNGImageView.resetViews$default(this, var9, false, 2, null);
      }
   }

   public fun asPng(url: String, widthDp: Int?, heightDp: Int?) {
      q.h(var1, "url");
      this.inflatePngView();
      var var4: PNGStickerView = this.pngView;
      if (this.pngView == null) {
         q.y("pngView");
         var4 = null;
      }

      var4.loadImage(var1, var2, var3);
      var var6: PNGStickerView = this.pngView;
      if (this.pngView == null) {
         q.y("pngView");
         var6 = null;
      }

      APNGImageView.resetViews$default(this, var6, false, 2, null);
   }

   public fun inflateLottieView() {
      if (this.lottieView == null) {
         val var1: Boolean = RLottieUtils.INSTANCE.getInitialized$sticker_release();
         var var2: View = null;
         if (var1) {
            val var3: Context = this.getContext();
            q.g(var3, "getContext(...)");
            val var4: RLottieImageView = new RLottieImageView(var3);
            RLottieImageView.recycle$default(var4, false, 1, null);
            this.lottieView = var4;
         } else {
            val var5: Context = this.getContext();
            q.g(var5, "getContext(...)");
            this.lottieView = new RLottieStubView(var5);
         }

         if (this.lottieView == null) {
            q.y("lottieView");
         } else {
            var2 = this.lottieView;
         }

         this.addView(var2);
      }
   }

   public fun inflatePngView() {
      if (this.pngView == null) {
         val var1: Context = this.getContext();
         q.g(var1, "getContext(...)");
         val var2: PNGStickerView = new PNGStickerView(var1);
         this.pngView = var2;
         this.addView(var2);
      }
   }

   public override fun recycleChild(child: View) {
      q.h(var1, "child");
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
