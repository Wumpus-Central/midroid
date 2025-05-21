package com.discord.chat.presentation.textutils;

import android.text.style.ForegroundColorSpan;
import com.discord.chat.bridge.contentnode.ContentNode;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class N implements Function2 {
   public final DraweeSpanStringBuilder j;
   public final ForegroundColorSpan k;
   public final ContentNode l;
   public final boolean m;

   public final Object invoke(Object var1, Object var2) {
      return TextUtilsKt.h(this.j, this.k, this.l, this.m, (DraweeSpanStringBuilder)var1, (RenderContext)var2);
   }
}
