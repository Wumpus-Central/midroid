package com.discord.image.fresco

import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.span.SimpleDraweeSpanTextView

public fun SimpleDraweeSpanTextView.setOptionalText(builder: DraweeSpanStringBuilder?) {
   val var2: Byte;
   if (var1 != null) {
      var0.setDraweeSpanStringBuilder(var1);
      var2 = 0;
   } else {
      var2 = 8;
   }

   var0.setVisibility(var2);
}
