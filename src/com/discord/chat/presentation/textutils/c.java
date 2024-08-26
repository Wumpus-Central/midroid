package com.discord.chat.presentation.textutils;

import com.discord.simpleast.core.node.StyleNode.SpanProvider;

public final class c implements SpanProvider {
   public final Iterable get(Object var1) {
      return CodeStyle.g((RenderContext)var1);
   }
}
