package com.discord.misc.utilities.intent

import android.content.Intent
import android.os.Parcelable
import androidx.core.content.d
import java.util.ArrayList
import kotlin.jvm.internal.r
import kotlin.reflect.KClass
import ph.a

@JvmSynthetic
public inline fun <reified T : Parcelable> Intent.getIntentParcelable(parcelableKey: String): T? {
   r.h(var0, "<this>");
   r.h(var1, "parcelableKey");
   r.m(4, "T");
   return (T)(d.b(var0, var1, Parcelable.class) as Parcelable);
}

@JvmSynthetic
public inline fun <reified T : Parcelable> Intent.getIntentParcelableArrayList(parcelableKey: String): ArrayList<T>? {
   r.h(var0, "<this>");
   r.h(var1, "parcelableKey");
   r.m(4, "T");
   return d.a(var0, var1, Parcelable.class);
}

public fun Intent.hasExtra(className: KClass<*>): Boolean {
   r.h(var0, "<this>");
   r.h(var1, "className");
   return var0.hasExtra(key(var1));
}

private fun KClass<*>.key(): String {
   return a.b(var0).getName();
}

public fun Intent.putExtra(className: KClass<*>): Intent {
   r.h(var0, "<this>");
   r.h(var1, "className");
   var0 = var0.putExtra(key(var1), true);
   r.g(var0, "putExtra(className.key(), true)");
   return var0;
}

public fun Intent.putIntentParcelable(parcelableKey: String, actionIntent: Parcelable): Intent {
   r.h(var0, "<this>");
   r.h(var1, "parcelableKey");
   r.h(var2, "actionIntent");
   var0 = var0.putExtra(var1, var2);
   r.g(var0, "putExtra(parcelableKey, actionIntent)");
   return var0;
}
