package com.discord.chat.presentation.media

import android.view.View
import android.view.ViewGroup.LayoutParams
import kotlin.jvm.internal.r

public object MediaContainingViewResizer {
   public fun View.resizeLayoutParams(
      targetWidthPx: Int,
      targetHeightPx: Int,
      maxWidthPx: Int,
      maxHeightPx: Int,
      resizeMode: com.discord.chat.presentation.media.MediaContainingViewResizer.ResizeMode = MediaContainingViewResizer.ResizeMode.Fill
   ) {
      r.h(var1, "<this>");
      r.h(var6, "resizeMode");
      val var11: Boolean;
      if (var6 != MediaContainingViewResizer.ResizeMode.Fill && var6 != MediaContainingViewResizer.ResizeMode.Cover && var2 <= var4 && var3 <= var5) {
         var11 = false;
      } else {
         var11 = true;
      }

      val var9: Float = var1.getResources().getDisplayMetrics().density;
      var var8: Float = 1.0F;
      var var20: Float;
      if (var11) {
         var20 = Math.min((float)var4, (float)var2 * var9) / var2;
      } else {
         var20 = 1.0F;
      }

      if (var11) {
         var8 = Math.min((float)var5, var9 * (float)var3) / var3;
      }

      var20 = Math.min(var8, var20);
      var4 = (int)(var2 * var20);
      var5 = (int)(var3 * var20);
      var3 = var4;
      var2 = var5;
      if (var6 === MediaContainingViewResizer.ResizeMode.Cover) {
         var3 = Math.max(var4, var5);
         var2 = var3;
      }

      val var19: LayoutParams = var1.getLayoutParams();
      if (var19 != null) {
         label34: {
            if (var3 == var19.width) {
               var17 = false;
               if (var2 == var19.height) {
                  break label34;
               }
            }

            var17 = true;
         }

         if (var17) {
            var19.width = var3;
            var19.height = var2;
         }

         var1.setLayoutParams(var19);
      } else {
         var1.setLayoutParams(new LayoutParams(var3, var2));
      }
   }

   public enum class ResizeMode {
      Cover,
      Fill,
      Wrap      @JvmStatic
      private MediaContainingViewResizer.ResizeMode[] $VALUES = $values();
   }
}
