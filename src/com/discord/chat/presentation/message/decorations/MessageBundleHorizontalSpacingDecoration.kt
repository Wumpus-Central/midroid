package com.discord.chat.presentation.message.decorations

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.State
import com.discord.chat.presentation.message.MessageView
import com.discord.misc.utilities.measure.NativeViewMeasuringWrapper
import kotlin.jvm.internal.q

public class MessageBundleHorizontalSpacingDecoration(leftMarginPx: Int, rightMarginPx: Int) : RecyclerView.ItemDecoration {
   private final val leftMarginPx: Int
   private final val rightMarginPx: Int

   init {
      this.leftMarginPx = var1;
      this.rightMarginPx = var2;
   }

   public override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: State) {
      q.h(var1, "outRect");
      q.h(var2, "view");
      q.h(var3, "parent");
      q.h(var4, "state");
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
