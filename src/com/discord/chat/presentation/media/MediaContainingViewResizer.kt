package com.discord.chat.presentation.media

import android.view.View
import android.view.ViewGroup.LayoutParams
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q
import sj.a

public object MediaContainingViewResizer {
   public fun View.resizeLayoutParams(
      targetWidthPx: Int,
      targetHeightPx: Int,
      maxWidthPx: Int,
      maxHeightPx: Int,
      resizeMode: com.discord.chat.presentation.media.MediaContainingViewResizer.ResizeMode = MediaContainingViewResizer.ResizeMode.Fill
   ) {
      q.h(var1, "<this>");
      q.h(var6, "resizeMode");
      val var11: Boolean;
      if (var6 != MediaContainingViewResizer.ResizeMode.Fill && var6 != MediaContainingViewResizer.ResizeMode.Cover && var2 <= var4 && var3 <= var5) {
         var11 = false;
      } else {
         var11 = true;
      }

      val var9: Float = var1.getResources().getDisplayMetrics().density;
      var var8: Float = 1.0F;
      var var17: Float;
      if (var11) {
         var17 = Math.min((float)var4, (float)var2 * var9) / var2;
      } else {
         var17 = 1.0F;
      }

      if (var11) {
         var8 = Math.min((float)var5, var9 * (float)var3) / var3;
      }

      var17 = Math.min(var8, var17);
      var4 = (int)(var2 * var17);
      var5 = (int)(var3 * var17);
      var3 = var4;
      var2 = var5;
      if (var6 === MediaContainingViewResizer.ResizeMode.Cover) {
         var3 = Math.max(var4, var5);
         var2 = var3;
      }

      val var16: LayoutParams = var1.getLayoutParams();
      if (var16 != null) {
         if (var3 != var16.width || var2 != var16.height) {
            var16.width = var3;
            var16.height = var2;
         }

         var1.setLayoutParams(var16);
      } else {
         var1.setLayoutParams(new LayoutParams(var3, var2));
      }
   }

   public enum class ResizeMode {
      Cover,
      Fill,
      Wrap      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private MediaContainingViewResizer.ResizeMode[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<MediaContainingViewResizer.ResizeMode> = $values();
         $VALUES = var0;
         $ENTRIES = a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }
}
