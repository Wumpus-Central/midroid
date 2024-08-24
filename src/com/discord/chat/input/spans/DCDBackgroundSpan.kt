package com.discord.chat.input.spans

import com.discord.span.utilities.common.BackgroundStyle
import com.discord.span.utilities.spannable.BackgroundSpan
import kotlin.jvm.internal.r

internal class DCDBackgroundSpan(style: BackgroundStyle) : BackgroundSpan, DCDInputSpan {
   init {
      r.h(var1, "style");
      super(var1);
   }
}
