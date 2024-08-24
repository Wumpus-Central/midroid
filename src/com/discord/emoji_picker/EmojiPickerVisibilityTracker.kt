package com.discord.emoji_picker

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlin.jvm.internal.r

internal class EmojiPickerVisibilityTracker(onShowNitroUpsell: (Boolean) -> Unit) {
   private final val onShowNitroUpsell: (Boolean) -> Unit
   public final var trackingEnabled: Boolean
   private final var totalNitroSectionsVisible: Int
   private final var previouslyVisible: Boolean

   init {
      r.h(var1, "onShowNitroUpsell");
      super();
      this.onShowNitroUpsell = var1;
   }

   private fun ViewHolder.getWidth(parent: EmojiPickerView): Int {
      val var3: Int;
      if (var1 is EmojiPickerViewHolder.Emoji) {
         var3 = (var1 as EmojiPickerViewHolder.Emoji).getWidth();
      } else {
         var3 = var2.getWidth();
      }

      return var3;
   }

   public fun trackViewVisibilityChanged(parent: EmojiPickerView, child: View, visible: Boolean) {
      r.h(var1, "parent");
      r.h(var2, "child");
      if (this.trackingEnabled) {
         val var8: ViewHolder = var1.getChildViewHolder(var2);
         val var7: EmojiPickerVisibilityTracker.Companion = Companion;
         r.g(var8, "viewHolder");
         val var6: Boolean = var7.isNitroSectionLocked(var8);
         var var4: Int;
         if (var6 && var3) {
            var4 = this.getWidth(var8, var1);
         } else if (var6 && !var3) {
            var4 = -this.getWidth(var8, var1);
         } else {
            var4 = 0;
         }

         var4 = Math.max(0, this.totalNitroSectionsVisible + var4);
         this.totalNitroSectionsVisible = var4;
         var3 = false;
         if (var4 >= var1.getWidth() * 6) {
            var3 = true;
         }

         if (this.previouslyVisible != var3) {
            this.onShowNitroUpsell.invoke(var3);
            this.previouslyVisible = var3;
         }
      }
   }

   public companion object {
      private const val ROWS_VISIBLE_THRESHOLD: Int

      public fun ViewHolder.isNitroSectionLocked(): Boolean {
         r.h(var1, "<this>");
         var var4: ViewHolder = var1;
         if (var1 !is EmojiPickerViewHolder) {
            var4 = null;
         }

         val var5: EmojiPickerViewHolder = var4 as EmojiPickerViewHolder;
         var var2: Boolean = false;
         if (var5 != null) {
            var2 = false;
            if (EmojiPickerViewHolder.Companion.isNitroLocked(var5)) {
               var2 = true;
            }
         }

         return var2;
      }
   }
}
