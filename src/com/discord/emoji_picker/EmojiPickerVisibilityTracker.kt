package com.discord.emoji_picker

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlin.jvm.internal.SourceDebugExtension

internal class EmojiPickerVisibilityTracker(onShowNitroUpsell: (Boolean) -> Unit) {
   private final val onShowNitroUpsell: (Boolean) -> Unit
   public final var trackingEnabled: Boolean
   private final var totalNitroSectionsVisible: Int
   private final var previouslyVisible: Boolean

   init {
      this.onShowNitroUpsell = var1;
   }

   private fun ViewHolder.getWidth(parent: EmojiPickerView): Int {
      return if (var1 is EmojiPickerViewHolder.Emoji) (var1 as EmojiPickerViewHolder.Emoji).getWidth() else var2.getWidth();
   }

   public fun trackViewVisibilityChanged(parent: EmojiPickerView, child: View, visible: Boolean) {
      if (this.trackingEnabled) {
         val var7: ViewHolder = var1.getChildViewHolder(var2);
         val var8: EmojiPickerVisibilityTracker.Companion = Companion;
         val var6: Boolean = var8.isNitroSectionLocked(var7);
         var var4: Int;
         if (var6 && var3) {
            var4 = this.getWidth(var7, var1);
         } else if (var6 && !var3) {
            var4 = -this.getWidth(var7, var1);
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

   @SourceDebugExtension(["SMAP\nEmojiPickerVisibilityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerVisibilityTracker.kt\ncom/discord/emoji_picker/EmojiPickerVisibilityTracker$Companion\n+ 2 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n*L\n1#1,52:1\n8#2:53\n*S KotlinDebug\n*F\n+ 1 EmojiPickerVisibilityTracker.kt\ncom/discord/emoji_picker/EmojiPickerVisibilityTracker$Companion\n*L\n49#1:53\n*E\n"])
   public companion object {
      private const val ROWS_VISIBLE_THRESHOLD: Int

      public fun ViewHolder.isNitroSectionLocked(): Boolean {
         var var2: ViewHolder = var1;
         if (var1 !is EmojiPickerViewHolder) {
            var2 = null;
         }

         return var2 as EmojiPickerViewHolder != null && EmojiPickerViewHolder.Companion.isNitroLocked(var2 as EmojiPickerViewHolder);
      }
   }
}
