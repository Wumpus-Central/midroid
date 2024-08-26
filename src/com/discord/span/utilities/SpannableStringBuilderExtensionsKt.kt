package com.discord.span.utilities

import android.content.Context
import android.text.SpannableStringBuilder
import android.text.style.StrikethroughSpan
import android.text.style.UnderlineSpan
import kotlin.jvm.internal.r

public inline fun SpannableStringBuilder.bold(context: Context, action: (SpannableStringBuilder) -> Unit): SpannableStringBuilder {
   r.h(var0, "<this>");
   r.h(var1, "context");
   r.h(var2, "action");
   val var4: GGSansBoldSpan = new GGSansBoldSpan(var1);
   val var3: Int = var0.length();
   var2.invoke(var0);
   val var5: Any = new Object[]{var4}[0];
   if (var5 != null) {
      var0.setSpan(var5, var3, var0.length(), 33);
   }

   return var0;
}

public fun SpannableStringBuilder.debugSpans(): String {
   r.h(var0, "<this>");
   val var1: Array<Any> = var0.getSpans(0, var0.length(), Object.class);
   r.g(var1, "getSpans(\n        0,\n   …Object::class.java,\n    )");
   return b.c0(var1, null, null, null, 0, null, <unrepresentable>.INSTANCE, 31, null);
}

public fun SpannableStringBuilder.ensureNewline(span: Any? = null) {
   r.h(var0, "<this>");
   var var2: Boolean;
   if (var0.length() > 0) {
      var2 = 1;
   } else {
      var2 = 0;
   }

   if (var2) {
      val var3: Character = f.Z0(var0);
      if (var3 == null || var3 != '\n') {
         if (var1 != null) {
            var2 = var0.length();
            r.g(var0.append('\n'), "append('\\n')");
            var1 = new Object[]{var1}[0];
            if (var1 != null) {
               var0.setSpan(var1, var2, var0.length(), 33);
            }
         } else {
            r.g(var0.append('\n'), "append('\\n')");
         }
      }
   }
}

@JvmSynthetic
fun `ensureNewline$default`(var0: SpannableStringBuilder, var1: Any, var2: Int, var3: Any) {
   if ((var2 and 1) != 0) {
      var1 = null;
   }

   ensureNewline(var0, var1);
}

public inline fun SpannableStringBuilder.italic(context: Context, action: (SpannableStringBuilder) -> Unit): SpannableStringBuilder {
   r.h(var0, "<this>");
   r.h(var1, "context");
   r.h(var2, "action");
   val var4: GGSansItalicSpan = new GGSansItalicSpan(var1);
   val var3: Int = var0.length();
   var2.invoke(var0);
   val var5: Any = new Object[]{var4}[0];
   if (var5 != null) {
      var0.setSpan(var5, var3, var0.length(), 33);
   }

   return var0;
}

public inline fun SpannableStringBuilder.strikeThrough(action: (SpannableStringBuilder) -> Unit): SpannableStringBuilder {
   r.h(var0, "<this>");
   r.h(var1, "action");
   val var3: StrikethroughSpan = new StrikethroughSpan();
   val var2: Int = var0.length();
   var1.invoke(var0);
   val var4: Any = new Object[]{var3}[0];
   if (var4 != null) {
      var0.setSpan(var4, var2, var0.length(), 33);
   }

   return var0;
}

public inline fun SpannableStringBuilder.underline(action: (SpannableStringBuilder) -> Unit): SpannableStringBuilder {
   r.h(var0, "<this>");
   r.h(var1, "action");
   val var3: UnderlineSpan = new UnderlineSpan();
   val var2: Int = var0.length();
   var1.invoke(var0);
   val var4: Any = new Object[]{var3}[0];
   if (var4 != null) {
      var0.setSpan(var4, var2, var0.length(), 33);
   }

   return var0;
}

public inline fun SpannableStringBuilder.wrapIn(vararg spans: Any?, priority: Int, action: (SpannableStringBuilder) -> Unit): SpannableStringBuilder {
   r.h(var0, "<this>");
   r.h(var1, "spans");
   r.h(var3, "action");
   val var5: Int = var0.length();
   var3.invoke(var0);
   val var6: Int = var1.length;

   for (int var4 = 0; var4 < var6; var4++) {
      val var7: Any = var1[var4];
      if (var1[var4] != null) {
         var0.setSpan(var7, var5, var0.length(), var2 shl 16 or 33);
      }
   }

   return var0;
}

public inline fun SpannableStringBuilder.wrapIn(vararg spans: Any?, action: (SpannableStringBuilder) -> Unit): SpannableStringBuilder {
   r.h(var0, "<this>");
   r.h(var1, "spans");
   r.h(var2, "action");
   val var5: Int = var0.length();
   var2.invoke(var0);
   val var4: Int = var1.length;

   for (int var3 = 0; var3 < var4; var3++) {
      val var6: Any = var1[var3];
      if (var1[var3] != null) {
         var0.setSpan(var6, var5, var0.length(), 33);
      }
   }

   return var0;
}
