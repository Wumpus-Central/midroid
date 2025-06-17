package com.discord.misc.utilities.intent

import E9.a
import android.content.Intent
import android.os.Parcelable
import androidx.core.content.c
import java.util.ArrayList
import kotlin.jvm.internal.q
import kotlin.reflect.KClass

@JvmSynthetic
public inline fun <reified T : Parcelable> Intent.getIntentParcelable(parcelableKey: String): Any {
   q.h(var0, "<this>");
   q.h(var1, "parcelableKey");
   q.m(4, "T");
   return (T)(c.b(var0, var1, Parcelable.class) as Parcelable);
}

@JvmSynthetic
public inline fun <reified T : Parcelable> Intent.getIntentParcelableArrayList(parcelableKey: String): ArrayList<Any> {
   q.h(var0, "<this>");
   q.h(var1, "parcelableKey");
   q.m(4, "T");
   return c.a(var0, var1, Parcelable.class);
}

public fun Intent.hasExtra(className: KClass<*>): Boolean {
   q.h(var0, "<this>");
   q.h(var1, "className");
   return var0.hasExtra(key(var1));
}

private fun KClass<*>.key(): String {
   return a.b(var0).getName();
}

public fun Intent.putExtra(className: KClass<*>): Intent {
   q.h(var0, "<this>");
   q.h(var1, "className");
   var0 = var0.putExtra(key(var1), true);
   q.g(var0, "putExtra(...)");
   return var0;
}

public fun Intent.putIntentParcelable(parcelableKey: String, actionIntent: Parcelable): Intent {
   q.h(var0, "<this>");
   q.h(var1, "parcelableKey");
   q.h(var2, "actionIntent");
   var0 = var0.putExtra(var1, var2);
   q.g(var0, "putExtra(...)");
   return var0;
}
