package com.discord.misc.utilities.intent

import Oa.a
import android.content.Intent
import android.os.Parcelable
import androidx.core.content.c
import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics
import kotlin.reflect.KClass

@JvmSynthetic
public inline fun <reified T : Parcelable> Intent.getIntentParcelable(parcelableKey: String): Any {
   Intrinsics.reifiedOperationMarker(4, "T");
   return (T)(c.b(var0, var1, Parcelable.class) as Parcelable);
}

@JvmSynthetic
public inline fun <reified T : Parcelable> Intent.getIntentParcelableArrayList(parcelableKey: String): ArrayList<Any> {
   Intrinsics.reifiedOperationMarker(4, "T");
   return c.a(var0, var1, Parcelable.class);
}

public fun Intent.hasExtra(className: KClass<*>): Boolean {
   return var0.hasExtra(key(var1));
}

private fun KClass<*>.key(): String {
   return a.b(var0).getName();
}

public fun Intent.putExtra(className: KClass<*>): Intent {
   var0 = var0.putExtra(key(var1), true);
   return var0;
}

public fun Intent.putIntentParcelable(parcelableKey: String, actionIntent: Parcelable): Intent {
   var0 = var0.putExtra(var1, var2);
   return var0;
}
