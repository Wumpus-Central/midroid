package com.discord.chat.presentation.message.decorations

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.State
import com.discord.chat.presentation.message.MessageView
import com.discord.misc.utilities.measure.NativeViewMeasuringWrapper
import kotlin.jvm.internal.r

public class MessageBundleHorizontalSpacingDecoration(leftMarginPx: Int, rightMarginPx: Int) : ItemDecoration {
   private final val leftMarginPx: Int
   private final val rightMarginPx: Int

   init {
      this.leftMarginPx = var1;
      this.rightMarginPx = var2;
   }

   public open fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: State) {
      r.h(var1, "outRect");
      r.h(var2, "view");
      r.h(var3, "parent");
      r.h(var4, "state");
      if (var2 !is NativeViewMeasuringWrapper) {
         var2 = null;
      }

      val var8: NativeViewMeasuringWrapper = var2 as NativeViewMeasuringWrapper;
      var2 = null;
      if (var8 != null) {
         var2 = var8.getView();
      }

      if (var2 !is MessageView) {
         var1.left = this.leftMarginPx;
         var1.right = this.rightMarginPx;
      }
   }
}
