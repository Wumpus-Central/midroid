package com.discord.image.fresco

import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import kotlin.jvm.internal.q

public fun SimpleDraweeSpanTextView.setOptionalText(builder: DraweeSpanStringBuilder?) {
   q.h(var0, "<this>");
   val var2: Byte;
   if (var1 != null) {
      var0.setDraweeSpanStringBuilder(var1);
      var2 = 0;
   } else {
      var2 = 8;
   }

   var0.setVisibility(var2);
}
