package com.discord.sticker.sticker_types

import android.content.Context
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.drawable.ScalingUtils.ScaleType
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.r
import l4.c

internal class PNGStickerView(context: Context) : SimpleDraweeView {
   private final val placeholder: ShapeDrawable

   init {
      r.h(var1, "context");
      super(var1);
      val var2: ShapeDrawable = new ShapeDrawable();
      var2.setShape(new OvalShape());
      var2.getPaint().setColor(ThemeManagerKt.getTheme().getBackgroundAccent());
      this.placeholder = var2;
   }

   public fun loadGifImage(url: String, widthDp: Int?, heightDp: Int?, animate: Boolean) {
      r.h(var1, "url");
      this.setController((c.g().O(var1).z(var4) as PipelineDraweeControllerBuilder).c());
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
      r.h(var1, "url");
      this.setImageURI(var1);
      (this.getHierarchy() as GenericDraweeHierarchy).t(ScaleType.e);
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
