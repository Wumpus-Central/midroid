package com.discord.chat.presentation.textutils;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.discord.chat.bridge.contentnode.ContentNode;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class s0 implements Function1 {
   public final DraweeSpanStringBuilder d;
   public final ContentNode e;
   public final Context i;
   public final RenderContext t;

   public final Object invoke(Object var1) {
      return TextUtilsKt.j(this.d, this.e, this.i, this.t, (SpannableStringBuilder)var1);
   }
}
