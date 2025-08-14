package com.discord.chat.presentation.message.viewholder.mosaicitem.attachments

import com.discord.chat.R
import com.discord.chat.bridge.botuikit.MediaGalleryItem
import com.discord.chat.presentation.media.MediaContainingViewResizer
import com.discord.chat.presentation.message.view.MediaVisualPlaceholderView
import com.discord.chat.presentation.message.view.VisualPlaceholderState
import com.discord.chat.presentation.message.viewholder.MediaVisualPlaceholderViewHolder

public class MosaicItemVisualPlaceholderViewHolder(view: MediaVisualPlaceholderView) : MediaVisualPlaceholderViewHolder(var1) {
   public fun bindGalleryItem(mediaGalleryItem: MediaGalleryItem, isSingleItemMosaic: Boolean) {
      var var3: Int = MosaicItemVisualPlaceholderViewHolder.WhenMappings.$EnumSwitchMapping$0[var1.getMedia().getLoadingState().ordinal()];
      val var6: VisualPlaceholderState;
      if (var3 != 1) {
         if (var3 != 2) {
            var6 = VisualPlaceholderState.ERROR;
         } else {
            var6 = VisualPlaceholderState.NOT_FOUND;
         }
      } else {
         var6 = VisualPlaceholderState.LOADING;
      }

      var3 = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius);
      val var4: MediaContainingViewResizer.ResizeMode;
      if (var2) {
         var4 = MediaContainingViewResizer.ResizeMode.Fill;
      } else {
         var4 = MediaContainingViewResizer.ResizeMode.Cover;
      }

      super.bind(var6, 200, 200, var3, var4);
   }
}
