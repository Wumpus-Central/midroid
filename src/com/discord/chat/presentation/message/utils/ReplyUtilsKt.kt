package com.discord.chat.presentation.message.utils

import android.text.style.StyleSpan
import android.text.style.LeadingMarginSpan.Standard
import android.view.View
import com.facebook.drawee.span.DraweeSpanStringBuilder

public fun createReplyContent(referenceView: View, builder: DraweeSpanStringBuilder): DraweeSpanStringBuilder {
   var0.measure(0, 0);
   var1.setSpan(new Standard(var0.getMeasuredWidth(), 0), 0, var1.length(), 33);
   return var1;
}

public fun createSystemReplyContent(referenceView: View, content: String): DraweeSpanStringBuilder {
   return createSystemReplyContentFromBuilder(var0, new DraweeSpanStringBuilder(var1));
}

public fun createSystemReplyContentFromBuilder(referenceView: View, builder: DraweeSpanStringBuilder): DraweeSpanStringBuilder {
   var1.setSpan(new StyleSpan(2), 0, var1.length(), 33);
   return createReplyContent(var0, var1);
}
