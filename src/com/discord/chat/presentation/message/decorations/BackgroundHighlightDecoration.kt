package com.discord.chat.presentation.message.decorations

import android.content.Context
import kotlin.jvm.internal.r

public class BackgroundHighlightDecoration(context: Context) : HighlightedMessageDecoration {
   init {
      r.h(var1, "context");
      super(new BackgroundHighlightDrawer(var1));
   }
}
