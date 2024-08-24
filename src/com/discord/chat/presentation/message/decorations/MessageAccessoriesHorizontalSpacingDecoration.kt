package com.discord.chat.presentation.message.decorations

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.State
import com.discord.chat.presentation.message.MessageAccessoriesView
import com.discord.chat.presentation.message.view.ForumPostActionBarView
import com.discord.chat.presentation.message.view.ThreadEmbedView
import com.discord.reactions.ReactionsView
import kotlin.jvm.internal.r

public class MessageAccessoriesHorizontalSpacingDecoration(leftMarginPx: Int, rightMarginPx: Int, isForwardedMessage: Boolean) : ItemDecoration {
   private final val isForwardedMessage: Boolean
   private final val leftMarginPx: Int
   private final val rightMarginPx: Int

   init {
      this.leftMarginPx = var1;
      this.rightMarginPx = var2;
      this.isForwardedMessage = var3;
   }

   private fun computeLeftMarginPx(view: View): Int {
      if (!this.isForwardedMessage) {
         return this.leftMarginPx;
      } else if (var1 is ReactionsView) {
         return this.leftMarginPx;
      } else {
         return if (var1 is ThreadEmbedView) this.leftMarginPx else this.leftMarginPx + MessageAccessoriesView.Companion.getFORWARD_BAR_SPACING();
      }
   }

   public fun getIsForwardedMessage(): Boolean {
      return this.isForwardedMessage;
   }

   public open fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: State) {
      r.h(var1, "outRect");
      r.h(var2, "view");
      r.h(var3, "parent");
      r.h(var4, "state");
      if (var2 !is ForumPostActionBarView) {
         var1.left = this.computeLeftMarginPx(var2);
         var1.right = this.rightMarginPx;
      }
   }

   public fun getLeftMarginPx(): Int {
      return this.leftMarginPx;
   }
}
