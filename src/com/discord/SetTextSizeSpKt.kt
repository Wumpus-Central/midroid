package com.discord

import android.widget.TextView
import kotlin.jvm.internal.q

public fun TextView.setTextSizeSp(textSizeSp: Float) {
   q.h(var0, "<this>");
   var0.setTextSize(2, var1);
}

public fun TextView.setTextSizeSp(sizeSp: Float, maxScaledSizeSp: Float = java.lang.Float.MAX_VALUE) {
   q.h(var0, "<this>");
   val var3: Float = var0.getContext().getResources().getConfiguration().fontScale;
   setTextSizeSp(var0, var1 / var3 * Math.min(var3, var2 / (var1 / var3)));
}

@JvmSynthetic
fun `setTextSizeSp$default`(var0: TextView, var1: Float, var2: Float, var3: Int, var4: Any) {
   if ((var3 and 2) != 0) {
      var2 = java.lang.Float.MAX_VALUE;
   }

   setTextSizeSp(var0, var1, var2);
}
