package com.discord.chat.presentation.message.view.mosaic

import android.view.View.OnClickListener
import android.view.View.OnLongClickListener

public interface MediaMosaicVideoViewHolder<T> {
   public abstract fun bind(
      containerId: String,
      mosaicId: String,
      item: MosaicMediaItem<Any>,
      maxWidthPx: Int,
      maxHeightPx: Int,
      isSingleItemMosaic: Boolean,
      onClicked: OnClickListener,
      onLongClicked: OnLongClickListener?,
      onTapSpoiler: () -> Unit
   ) {
   }
}
