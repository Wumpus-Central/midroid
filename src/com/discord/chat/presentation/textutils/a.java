package com.discord.chat.presentation.textutils;

import com.discord.simpleast.core.node.StyleNode.SpanProvider;

public final class a implements SpanProvider {
   public final Iterable get(Object var1) {
      return CodeStyle.h((RenderContext)var1);
   }
}
