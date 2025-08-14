package com.discord.span.utilities.spannable

import com.discord.span.utilities.common.BackgroundStyle
import com.discord.span.utilities.common.BorderStyle
import com.discord.span.utilities.common.ShadowStyle

public open class BackgroundSpan(background: BackgroundStyle, border: BorderStyle? = null, shadow: ShadowStyle? = null) {
   public final val background: BackgroundStyle
   public final val border: BorderStyle?
   public final val shadow: ShadowStyle?

   init {
      this.background = var1;
      this.border = var2;
      this.shadow = var3;
   }
}
