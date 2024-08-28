package com.discord.misc.utilities.view

import android.graphics.Outline
import android.view.View
import android.view.ViewOutlineProvider
import kotlin.jvm.internal.q

private final val circleOutlineProvider: <unrepresentable> = new ViewOutlineProvider() {
   public void getOutline(View var1, Outline var2) {
      q.h(var1, "view");
      q.h(var2, "outline");
      var2.setRoundRect(0, 0, var1.getWidth(), var1.getHeight(), (float)var1.getHeight() / 2.0F);
   }
}

public fun View.clipToCircle() {
   q.h(var0, "<this>");
   clipToOutline(var0, circleOutlineProvider);
}

private fun View.clipToOutline(outlineProvider: ViewOutlineProvider) {
   var0.setClipToOutline(true);
   var0.setOutlineProvider(var1);
}

public fun View.clipToRoundedRectangle(radiusPx: Int) {
   q.h(var0, "<this>");
   clipToOutline(var0, new ViewOutlineProvider(var1) {
      final int $radiusPx;

      {
         this.$radiusPx = var1;
      }

      public void getOutline(View var1, Outline var2) {
         q.h(var1, "view");
         q.h(var2, "outline");
         var2.setRoundRect(0, 0, var1.getWidth(), var1.getHeight(), (float)this.$radiusPx);
      }
   });
}

public fun View.clipToRoundedStartEdge(radiusPx: Int) {
   q.h(var0, "<this>");
   clipToOutline(var0, new ViewOutlineProvider(var1) {
      final int $radiusPx;

      {
         this.$radiusPx = var1;
      }

      public void getOutline(View var1, Outline var2) {
         q.h(var1, "view");
         q.h(var2, "outline");
         val var3: Int = var1.getLayoutDirection();
         if (var3 != 0) {
            if (var3 == 1) {
               var2.setRoundRect(-this.$radiusPx, 0, var1.getWidth(), var1.getHeight(), (float)this.$radiusPx);
            }
         } else {
            var2.setRoundRect(0, 0, var1.getWidth() + this.$radiusPx, var1.getHeight(), (float)this.$radiusPx);
         }
      }
   });
}
