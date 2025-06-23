package com.discord.chat.presentation.textutils;

import com.discord.chat.bridge.contentnode.ContentNode;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class P implements Function2 {
   public final ContentNode j;
   public final DraweeSpanStringBuilder k;

   public final Object invoke(Object var1, Object var2) {
      return TextUtilsKt.E(this.j, this.k, (DraweeSpanStringBuilder)var1, (RenderContext)var2);
   }
}
