package com.discord.emoji_picker

import android.content.Context
import androidx.recyclerview.widget.GridLayoutManager

internal class EmojiPickerLayoutManager(context: Context, rowSize: Int, onGetSpanSize: (Int) -> Int) : GridLayoutManager {
   private final val onGetSpanSize: (Int) -> Int
   private final var isScrollEnabled: Boolean

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      kotlin.jvm.internal.q.h(var3, "onGetSpanSize");
      super(var1, var2);
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
