package com.discord.span.utilities

import android.text.Spannable
import kotlin.jvm.internal.r

public fun Spannable.coverWithSpan(what: Any) {
   r.h(var0, "<this>");
   r.h(var1, "what");
   var0.setSpan(var1, 0, var0.length(), 18);
}

@JvmSynthetic
public inline fun <reified T> Spannable.hasSpan(): Boolean {
   r.h(var0, "<this>");
   val var2: Int = var0.length();
   r.m(4, "T");
   var var1: Boolean = false;
   val var3: Array<Any> = var0.getSpans(0, var2, Object.class);
   r.g(var3, "getSpans(0, length, T::class.java)");
   if (var3.length == 0) {
      var1 = true;
   }

   return var1 xor true;
}
