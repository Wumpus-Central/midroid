package com.discord.chat.presentation.message.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView.LayoutParams
import com.discord.chat.bridge.sticker.Sticker
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.ripple.RippleUtilsKt

public abstract class StickerPartViewHolder : MessagePartViewHolder {
   open fun StickerPartViewHolder(var1: View) {
      kotlin.jvm.internal.r.h(var1, "view");
      super(var1, null);
      var1.setLayoutParams(new LayoutParams(SizeUtilsKt.getDpToPx(160), SizeUtilsKt.getDpToPx(160)));
      var1.setPadding(DEFAULT_STICKER_PADDING_PX, DEFAULT_STICKER_PADDING_PX, DEFAULT_STICKER_PADDING_PX, DEFAULT_STICKER_PADDING_PX);
      RippleUtilsKt.addRipple$default(var1, false, 0, 3, null);
   }

   public abstract fun bind(sticker: Sticker, onStickerClicked: (Sticker) -> Unit, onStickerLongClicked: (Sticker) -> Unit, widthDp: Int, heightDp: Int) {
   }

   public companion object {
      public const val DEFAULT_CHAT_STICKER_SIZE_DP: Int
      public final val DEFAULT_STICKER_PADDING_PX: Int
   }
}
