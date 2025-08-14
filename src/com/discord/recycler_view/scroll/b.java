package com.discord.recycler_view.scroll;

import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class b implements Function1 {
   public final DebouncedScrollListener d;

   public final Object invoke(Object var1) {
      return DebouncedScrollListener.a(this.d, (DebouncedScrollListener.ScrollEvent)var1);
   }
}
