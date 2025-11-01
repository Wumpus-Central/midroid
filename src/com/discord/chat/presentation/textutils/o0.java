package com.discord.chat.presentation.textutils;

import android.text.style.ForegroundColorSpan;
import com.discord.chat.bridge.contentnode.ContentNode;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class o0 implements Function2 {
   public final DraweeSpanStringBuilder d;
   public final ForegroundColorSpan e;
   public final ContentNode i;
   public final boolean t;

   public final Object invoke(Object var1, Object var2) {
      return TextUtilsKt.c(this.d, this.e, this.i, this.t, (DraweeSpanStringBuilder)var1, (RenderContext)var2);
   }
}
