package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.media.MediaContainingViewResizer.ResizeMode
import com.discord.chat.presentation.message.view.MediaVisualPlaceholderView
import com.discord.chat.presentation.message.view.VisualPlaceholderState

public open class MediaVisualPlaceholderViewHolder(view: MediaVisualPlaceholderView) : MessagePartViewHolder {
   private final val view: MediaVisualPlaceholderView

   init {
      kotlin.jvm.internal.r.h(var1, "view");
      super(var1, null);
      this.view = var1;
   }

   public fun bind(state: VisualPlaceholderState, width: Int, height: Int, radiusPx: Int, resizeMode: ResizeMode) {
      kotlin.jvm.internal.r.h(var1, "state");
      kotlin.jvm.internal.r.h(var5, "resizeMode");
      this.view.setContent(var1, var2, var3, var5, var4);
   }
}
