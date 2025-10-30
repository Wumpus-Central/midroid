@file:SourceDebugExtension(["SMAP\nSpannableStringBuilderExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableStringBuilderExtensions.kt\ncom/discord/span/utilities/SpannableStringBuilderExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n32#1,4:152\n36#1:159\n32#1,4:165\n36#1:172\n32#1,4:173\n36#1:180\n32#1,4:181\n36#1:188\n32#1,4:189\n36#1:196\n13409#2:156\n13410#2:158\n13409#2:160\n13410#2:162\n13409#2,2:163\n13409#2:169\n13410#2:171\n13409#2:177\n13410#2:179\n13409#2:185\n13410#2:187\n13409#2:193\n13410#2:195\n1#3:157\n1#3:161\n1#3:170\n1#3:178\n1#3:186\n1#3:194\n*S KotlinDebug\n*F\n+ 1 SpannableStringBuilderExtensions.kt\ncom/discord/span/utilities/SpannableStringBuilderExtensionsKt\n*L\n19#1:152,4\n19#1:159\n59#1:165,4\n59#1:172\n67#1:173,4\n67#1:180\n74#1:181,4\n74#1:188\n81#1:189,4\n81#1:196\n19#1:156\n19#1:158\n35#1:160\n35#1:162\n50#1:163,2\n59#1:169\n59#1:171\n67#1:177\n67#1:179\n74#1:185\n74#1:187\n81#1:193\n81#1:195\n19#1:157\n59#1:170\n67#1:178\n74#1:186\n81#1:194\n*E\n"])

package com.discord.span.utilities

import android.content.Context
import android.text.SpannableStringBuilder
import android.text.style.StrikethroughSpan
import android.text.style.UnderlineSpan
import k7.e
import kotlin.jvm.internal.SourceDebugExtension

@JvmSynthetic
fun a(var0: Any): java.lang.CharSequence {
   return debugSpans$lambda$7(var0);
}

public inline fun SpannableStringBuilder.bold(context: Context, action: (SpannableStringBuilder) -> Unit): SpannableStringBuilder {
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
   val var1: Array<Any> = var0.getSpans(0, var0.length(), Object.class);
   return k.t0(var1, null, null, null, 0, null, new e(), 31, null);
}

fun `debugSpans$lambda$7`(var0: Any): java.lang.CharSequence {
   var0 = var0.getClass().getSimpleName();
   return var0;
}

public fun SpannableStringBuilder.ensureNewline(span: Any? = null) {
   if (var0.length() > 0) {
      val var3: Character = StringsKt.c1(var0);
      if (var3 == null || var3 != '\n') {
         if (var1 != null) {
            val var2: Int = var0.length();
            var1 = new Object[]{var1}[0];
            if (var1 != null) {
               var0.setSpan(var1, var2, var0.length(), 33);
            }

            return;
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
   val var4: Int = var0.length();
   var2.invoke(var0);
   val var5: Int = var1.length;

   for (int var3 = 0; var3 < var5; var3++) {
      val var6: Any = var1[var3];
      if (var1[var3] != null) {
         var0.setSpan(var6, var4, var0.length(), 33);
      }
   }

   return var0;
}
