package com.discord.chat.presentation.message.decorations

import android.content.Context
import kotlin.jvm.internal.q

public class BackgroundHighlightDecoration(context: Context) : HighlightedMessageDecoration {
   init {
      q.h(var1, "context");
      super(new BackgroundHighlightDrawer(var1));
   }
}
