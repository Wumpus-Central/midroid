package com.discord.chat.presentation.message.utils

import android.text.style.StyleSpan
import android.text.style.LeadingMarginSpan.Standard
import android.view.View
import com.facebook.drawee.span.DraweeSpanStringBuilder
import kotlin.jvm.internal.q

public fun createReplyContent(referenceView: View, builder: DraweeSpanStringBuilder): DraweeSpanStringBuilder {
   q.h(var0, "referenceView");
   q.h(var1, "builder");
   var0.measure(0, 0);
   var1.setSpan(new Standard(var0.getMeasuredWidth(), 0), 0, var1.length(), 33);
   return var1;
}

public fun createSystemReplyContent(referenceView: View, content: String): DraweeSpanStringBuilder {
   q.h(var0, "referenceView");
   q.h(var1, "content");
   return createSystemReplyContentFromBuilder(var0, new DraweeSpanStringBuilder(var1));
}

public fun createSystemReplyContentFromBuilder(referenceView: View, builder: DraweeSpanStringBuilder): DraweeSpanStringBuilder {
   q.h(var0, "referenceView");
   q.h(var1, "builder");
   var1.setSpan(new StyleSpan(2), 0, var1.length(), 33);
   return createReplyContent(var0, var1);
}
