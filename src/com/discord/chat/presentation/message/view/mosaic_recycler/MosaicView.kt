package com.discord.chat.presentation.message.view.mosaic_recycler

public interface MosaicView {
   public abstract fun getSingleAspectRatio(): Float {
   }

   public abstract fun setMosaicSize(width: Int, height: Int) {
   }
}
