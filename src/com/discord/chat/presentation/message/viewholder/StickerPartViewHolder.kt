package com.discord.chat.presentation.message.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView.LayoutParams
import com.discord.chat.bridge.sticker.Sticker
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.ripple.RippleUtilsKt
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nStickerPartViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerPartViewHolder.kt\ncom/discord/chat/presentation/message/viewholder/StickerPartViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,35:1\n176#2,2:36\n*S KotlinDebug\n*F\n+ 1 StickerPartViewHolder.kt\ncom/discord/chat/presentation/message/viewholder/StickerPartViewHolder\n*L\n18#1:36,2\n*E\n"])
public abstract class StickerPartViewHolder : MessagePartViewHolder {
   open fun StickerPartViewHolder(var1: View) {
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
