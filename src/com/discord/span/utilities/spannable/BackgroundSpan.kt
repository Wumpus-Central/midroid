package com.discord.span.utilities.spannable

import com.discord.span.utilities.common.BackgroundStyle
import kotlin.jvm.internal.q

public open class BackgroundSpan(style: BackgroundStyle) {
   public final val style: BackgroundStyle

   init {
      q.h(var1, "style");
      super();
      this.style = var1;
   }
}
