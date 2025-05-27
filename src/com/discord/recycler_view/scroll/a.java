package com.discord.recycler_view.scroll;

import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class a implements Function1 {
   public final DebouncedScrollListener j;

   public final Object invoke(Object var1) {
      return DebouncedScrollListener.b(this.j, (DebouncedScrollListener.ScrollEvent)var1);
   }
}
