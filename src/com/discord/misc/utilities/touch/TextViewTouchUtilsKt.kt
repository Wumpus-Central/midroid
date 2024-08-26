package com.discord.misc.utilities.touch

import android.text.Spannable
import android.view.MotionEvent
import android.widget.TextView
import kotlin.jvm.internal.r

@JvmSynthetic
public inline fun <reified T> TextView.getSpansUnderMotionEvent(event: MotionEvent): Array<T> {
   r.h(var0, "<this>");
   r.h(var1, "event");
   val var9: java.lang.CharSequence = var0.getText();
   val var13: Spannable;
   if (var9 is Spannable) {
      var13 = var9 as Spannable;
   } else {
      var13 = null;
   }

   if (var13 == null) {
      r.m(0, "T?");
      return (T[])(new Object[0]);
   } else {
      var var5: Int = (int)var1.getX() - var0.getTotalPaddingLeft() + var0.getScrollX();
      val var12: Int = var0.getLayout().getLineForVertical((int)var1.getY() - var0.getTotalPaddingTop() + var0.getScrollY());
      val var2: Float = var0.getLayout().getLineRight(var12);
      val var4: Float = var0.getLayout().getLineLeft(var12);
      val var3: Float = var5;
      if (var5 > var2 || var5 >= 0 && var5 < var4) {
         r.m(0, "T?");
         return (T[])(new Object[0]);
      } else {
         var5 = var0.getLayout().getOffsetForHorizontal(var12, var3);
         r.m(4, "T");
         val var10: Array<Any> = var13.getSpans(var5, var5, Object.class);
         r.g(var10, "spannableText.getSpans(\n…     T::class.java,\n    )");
         return (T[])var10;
      }
   }
}
