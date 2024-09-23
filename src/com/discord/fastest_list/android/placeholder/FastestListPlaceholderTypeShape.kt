package com.discord.fastest_list.android.placeholder

import android.graphics.Canvas
import android.graphics.Paint
import android.view.ViewGroup
import com.discord.fastest_list.android.FastestListSections.Entry
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Shape
import com.discord.misc.utilities.drawable.CustomDrawDrawable
import fh.p
import kotlin.jvm.internal.q

internal class FastestListPlaceholderTypeShape(config: Shape) : FastestListPlaceholder {
   private final val placeholder: com.discord.fastest_list.android.placeholder.FastestListPlaceholderTypeShape.ShapeDrawable

   init {
      q.h(var1, "config");
      super(null);
      this.placeholder = new FastestListPlaceholderTypeShape.ShapeDrawable(var1);
   }

   public override fun onPlaceholderShouldBind(view: ViewGroup, item: Entry) {
      q.h(var1, "view");
      q.h(var2, "item");
      var1.setBackground(this.placeholder);
   }

   public override fun onPlaceholderShouldUnbind(view: ViewGroup) {
      q.h(var1, "view");
      var1.setBackground(null);
   }

   private class ShapeDrawable(config: Shape) : CustomDrawDrawable {
      private final val config: Shape
      private final val paint: Paint

      init {
         q.h(var1, "config");
         super();
         this.config = var1;
         val var2: Paint = new Paint();
         var2.setAntiAlias(true);
         var2.setColor(var1.getColor());
         this.paint = var2;
      }

      public override fun draw(canvas: Canvas) {
         q.h(var1, "canvas");
         var var2: Float = this.getBounds().width();
         val var7: Float = this.getBounds().height();
         var var11: java.lang.Float = this.config.getWidth();
         val var3: Float;
         if (var11 != null) {
            var3 = var11;
         } else {
            var3 = (var2 - this.config.getPaddingHorizontal() * 2 - this.config.getGap() * (this.config.getCount() - 1)) / this.config.getCount();
         }

         var11 = this.config.getHeight();
         val var4: Float;
         if (var11 != null) {
            var4 = var11;
         } else {
            var4 = var7 - this.config.getPaddingVertical() * 2;
         }

         var var5: Float;
         if (this.config.getCount() > 1) {
            var2 = var2 - this.config.getCount() * var3;
            var5 = this.config.getCount() - 1;
         } else {
            var2 = var2 - var3;
            var5 = 2;
         }

         val var6: Float = var2 / var5;
         val var8: Int = this.config.getCount();

         for (int var9 = 0; var9 < var8; var9++) {
            if (this.config.getCount() == 1) {
               var5 = var6;
            } else {
               var5 = var9 * (var3 + var6);
            }

            var var10: Int = FastestListPlaceholderTypeShape.ShapeDrawable.WhenMappings.$EnumSwitchMapping$1[this.config.getType().ordinal()];
            if (var10 != 1) {
               if (var10 == 2) {
                  var10 = FastestListPlaceholderTypeShape.ShapeDrawable.WhenMappings.$EnumSwitchMapping$0[this.config.getVerticalAlignment().ordinal()];
                  if (var10 != 1) {
                     if (var10 != 2) {
                        if (var10 != 3) {
                           throw new p();
                        }

                        var2 = var7 / 2.0F - var4 / 2.0F;
                     } else {
                        var2 = var7 - var4;
                     }
                  } else {
                     var2 = 0.0F;
                  }

                  var1.drawRoundRect(var5, var2, var5 + var3, var2 + var4, this.config.getBorderRadius(), this.config.getBorderRadius(), this.paint);
               }
            } else {
               var1.drawCircle(var5 + var3 / 2.0F, var7 / 2.0F, var3 / 2.0F, this.paint);
            }
         }
      }
   }
}
