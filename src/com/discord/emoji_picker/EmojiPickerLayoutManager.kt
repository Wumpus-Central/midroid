package com.discord.emoji_picker

import android.content.Context
import androidx.recyclerview.widget.GridLayoutManager
import com.discord.recycler_view.utils.TransitionResilientGridLayoutManager

internal class EmojiPickerLayoutManager(context: Context, rowSize: Int, onGetSpanSize: (Int) -> Int) : TransitionResilientGridLayoutManager(var1, var2, null, 4) {
   private final val onGetSpanSize: (Int) -> Int
   private final var isScrollEnabled: Boolean

   init {
      this.onGetSpanSize = var3;
      this.isScrollEnabled = true;
      this.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(this) {
         final EmojiPickerLayoutManager this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public int getSpanSize(int var1) {
            return (EmojiPickerLayoutManager.access$getOnGetSpanSize$p(this.this$0).invoke(var1) as java.lang.Number).intValue();
         }
      });
   }

   public override fun canScrollVertically(): Boolean {
      val var1: Boolean;
      if (this.isScrollEnabled && super.canScrollVertically()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public fun setScrollingEnabled(enabled: Boolean) {
      this.isScrollEnabled = var1;
   }
}
