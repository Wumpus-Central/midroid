package com.discord.chat.presentation.textutils;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.discord.chat.bridge.contentnode.ContentNode;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class T implements Function1 {
   public final DraweeSpanStringBuilder j;
   public final ContentNode k;
   public final Context l;
   public final RenderContext m;

   public final Object invoke(Object var1) {
      return TextUtilsKt.D(this.j, this.k, this.l, this.m, (SpannableStringBuilder)var1);
   }
}
