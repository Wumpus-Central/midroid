package com.discord.react_strings

import android.content.Context
import android.widget.ImageView
import android.widget.TextView
import d2.b
import d2.c
import d2.d
import d2.e
import d2.f
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

@JvmSynthetic
fun a(var0: RenderContext): Unit {
   return i18nSetText$lambda$1(var0);
}

@JvmSynthetic
fun b(var0: RenderContext): Unit {
   return i18nContentDescription$lambda$2(var0);
}

@JvmSynthetic
fun c(var0: RenderContext): Unit {
   return i18nContentDescription$lambda$0(var0);
}

@JvmSynthetic
fun d(var0: RenderContext): Unit {
   return i18nFormat$lambda$3(var0);
}

@JvmSynthetic
fun e(var0: RenderContext, var1: java.lang.String, var2: java.lang.String, var3: Boolean): java.lang.CharSequence {
   return i18nFormat$lambda$5(var0, var1, var2, var3);
}

public fun ImageView.i18nContentDescription(i18nMessage: I18nMessage, initializer: (RenderContext) -> Unit = new c()) {
   q.h(var0, "<this>");
   q.h(var1, "i18nMessage");
   q.h(var2, "initializer");
   val var3: Context = var0.getContext();
   q.g(var3, "getContext(...)");
   var0.setContentDescription(i18nFormat(var3, var1, var2));
}

public fun TextView.i18nContentDescription(i18nMessage: I18nMessage, initializer: (RenderContext) -> Unit = new d()) {
   q.h(var0, "<this>");
   q.h(var1, "i18nMessage");
   q.h(var2, "initializer");
   val var3: Context = var0.getContext();
   q.g(var3, "getContext(...)");
   var0.setContentDescription(i18nFormat(var3, var1, var2));
}

@JvmSynthetic
fun `i18nContentDescription$default`(var0: ImageView, var1: I18nMessage, var2: Function1, var3: Int, var4: Any) {
   if ((var3 and 2) != 0) {
      var2 = new c();
   }

   i18nContentDescription(var0, var1, (Function1)var2);
}

@JvmSynthetic
fun `i18nContentDescription$default`(var0: TextView, var1: I18nMessage, var2: Function1, var3: Int, var4: Any) {
   if ((var3 and 2) != 0) {
      var2 = new d();
   }

   i18nContentDescription(var0, var1, (Function1)var2);
}

fun `i18nContentDescription$lambda$0`(var0: RenderContext): Unit {
   q.h(var0, "<this>");
   return Unit.a;
}

fun `i18nContentDescription$lambda$2`(var0: RenderContext): Unit {
   q.h(var0, "<this>");
   return Unit.a;
}

public fun Context.i18nFormat(i18nMessage: I18nMessage, initializer: (RenderContext) -> Unit = new b()): CharSequence {
   q.h(var0, "<this>");
   q.h(var1, "i18nMessage");
   q.h(var2, "initializer");
   val var3: RenderContext = new RenderContext();
   var2.invoke(var3);
   return RenderContext.Argument.INSTANCE.replace(var1.format$react_strings_release(var0), new e(var3));
}

@JvmSynthetic
fun `i18nFormat$default`(var0: Context, var1: I18nMessage, var2: Function1, var3: Int, var4: Any): java.lang.CharSequence {
   if ((var3 and 2) != 0) {
      var2 = new b();
   }

   return i18nFormat(var0, var1, (Function1)var2);
}

fun `i18nFormat$lambda$3`(var0: RenderContext): Unit {
   q.h(var0, "<this>");
   return Unit.a;
}

fun `i18nFormat$lambda$5`(var0: RenderContext, var1: java.lang.String, var2: java.lang.String, var3: Boolean): java.lang.CharSequence {
   q.h(var1, "argName");
   val var4: java.lang.String = var0.getArgs().get(var1);
   if (var4 != null) {
      var1 = var4;
   }

   return var1;
}

public fun TextView.i18nSetText(i18nMessage: I18nMessage, initializer: (RenderContext) -> Unit = new f()) {
   q.h(var0, "<this>");
   q.h(var1, "i18nMessage");
   q.h(var2, "initializer");
   val var3: Context = var0.getContext();
   q.g(var3, "getContext(...)");
   var0.setText(i18nFormat(var3, var1, var2));
}

@JvmSynthetic
fun `i18nSetText$default`(var0: TextView, var1: I18nMessage, var2: Function1, var3: Int, var4: Any) {
   if ((var3 and 2) != 0) {
      var2 = new f();
   }

   i18nSetText(var0, var1, (Function1)var2);
}

fun `i18nSetText$lambda$1`(var0: RenderContext): Unit {
   q.h(var0, "<this>");
   return Unit.a;
}
