package com.discord.sticker.sticker_types

import android.content.Context
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.drawable.ScalingUtils$ScaleType
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView

internal class PNGStickerView(context: Context) : SimpleDraweeView(var1) {
   private final val placeholder: ShapeDrawable

   init {
      val var2: ShapeDrawable = new ShapeDrawable();
      var2.setShape(new OvalShape());
      var2.getPaint().setColor(ThemeManagerKt.getTheme().getBackgroundAccent());
      this.placeholder = var2;
   }

   public fun loadGifImage(url: String, widthDp: Int?, heightDp: Int?, animate: Boolean) {
      this.setController((l8.d.g().P(var1).A(var4) as PipelineDraweeControllerBuilder).c());
      var var5: Int;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = Integer.MAX_VALUE;
      }

      this.setMaxWidth(var5);
      var5 = Integer.MAX_VALUE;
      if (var3 != null) {
         var5 = var3;
      }

      this.setMaxHeight(var5);
   }

   public fun loadImage(url: String, widthDp: Int?, heightDp: Int?) {
      this.setImageURI(var1);
      (this.getHierarchy() as GenericDraweeHierarchy).t(ScalingUtils$ScaleType.e);
      (this.getHierarchy() as GenericDraweeHierarchy).z(this.placeholder);
      var var4: Int;
      if (var2 != null) {
         var4 = var2;
      } else {
         var4 = Integer.MAX_VALUE;
      }

      this.setMaxWidth(var4);
      var4 = Integer.MAX_VALUE;
      if (var3 != null) {
         var4 = var3;
      }

      this.setMaxHeight(var4);
   }
}
