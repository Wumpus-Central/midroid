package com.discord.chat.input.spans

import com.discord.span.utilities.common.BackgroundStyle
import com.discord.span.utilities.spannable.BackgroundSpan
import kotlin.jvm.internal.q

internal class DCDBackgroundSpan(style: BackgroundStyle) : BackgroundSpan, DCDInputSpan {
   init {
      q.h(var1, "style");
      super(var1);
   }
}
