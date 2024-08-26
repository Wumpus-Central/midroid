package com.discord.fastest_list.android.placeholder

import android.graphics.Canvas
import android.graphics.Paint
import android.view.ViewGroup
import com.discord.fastest_list.android.FastestListSections.Entry
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Shape
import com.discord.misc.utilities.drawable.CustomDrawDrawable
import kotlin.jvm.internal.r

internal class FastestListPlaceholderTypeShape(config: Shape) : FastestListPlaceholder {
   private final val placeholder: com.discord.fastest_list.android.placeholder.FastestListPlaceholderTypeShape.ShapeDrawable

   init {
      r.h(var1, "config");
      super(null);
      this.placeholder = new FastestListPlaceholderTypeShape.ShapeDrawable(var1);
   }

   public override fun onPlaceholderShouldBind(view: ViewGroup, item: Entry) {
      r.h(var1, "view");
      r.h(var2, "item");
      var1.setBackground(this.placeholder);
   }

   public override fun onPlaceholderShouldUnbind(view: ViewGroup) {
      r.h(var1, "view");
      var1.setBackground(null);
   }

   private class ShapeDrawable(config: Shape) : CustomDrawDrawable {
      private final val config: Shape
      private final val paint: Paint

      init {
         r.h(var1, "config");
         super();
         this.config = var1;
         val var2: Paint = new Paint();
         var2.setAntiAlias(true);
         var2.setColor(var1.getColor());
         this.paint = var2;
      }

      public open fun draw(canvas: Canvas) {
         r.h(var1, "canvas");
         var var4: Float = this.getBounds().width();
         val var6: Float = this.getBounds().height();
         var var11: java.lang.Float = this.config.getWidth();
         val var2: Float;
         if (var11 != null) {
            var2 = var11;
         } else {
            var2 = var4 - this.config.getPaddingHorizontal() * 2;
         }

         var11 = this.config.getHeight();
         val var3: Float;
         if (var11 != null) {
            var3 = var11;
         } else {
            var3 = var6 - this.config.getPaddingVertical() * 2;
         }

         var var5: Float;
         if (this.config.getCount() > 1) {
            var5 = var4 - this.config.getCount() * var2;
            var4 = this.config.getCount() - 1;
         } else {
            var5 = var4 - var2;
            var4 = 2;
         }

         var5 = var5 / var4;
         val var8: Int = this.config.getCount();

         for (int var9 = 0; var9 < var8; var9++) {
            if (this.config.getCount() == 1) {
               var4 = var5;
            } else {
               var4 = var9 * (var2 + var5);
            }

            val var10: Int = FastestListPlaceholderTypeShape.ShapeDrawable.WhenMappings.$EnumSwitchMapping$0[this.config.getType().ordinal()];
            if (var10 != 1) {
               if (var10 == 2) {
                  var1.drawRoundRect(
                     var4,
                     var6 / 2.0F - var3 / 2.0F,
                     var4 + var2,
                     var6 / 2.0F - var3 / 2.0F + var3,
                     this.config.getBorderRadius(),
                     this.config.getBorderRadius(),
                     this.paint
                  );
               }
            } else {
               var1.drawCircle(var4 + var2 / 2.0F, var6 / 2.0F, var2 / 2.0F, this.paint);
            }
         }
      }

      // $VF: Class flags could not be determined
      internal class WhenMappings {
         @JvmStatic
         public int[] $EnumSwitchMapping$0;

         @JvmStatic
         fun {
            val var0: IntArray = new int[FastestListPlaceholderType.Shape.Type.values().length];

            try {
               var0[FastestListPlaceholderType.Shape.Type.CIRCLE.ordinal()] = 1;
            } catch (var3: NoSuchFieldError) {
            }

            try {
               var0[FastestListPlaceholderType.Shape.Type.RECT.ordinal()] = 2;
            } catch (var2: NoSuchFieldError) {
            }

            $EnumSwitchMapping$0 = var0;
         }
      }
   }
}
