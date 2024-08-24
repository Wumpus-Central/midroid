package com.discord.cache.legacy

import android.content.Context
import android.content.SharedPreferences
import kotlin.jvm.internal.r

public fun Context.getLegacyAuthToken(): String? {
   r.h(var0, "<this>");
   return getLegacySharedPrefs(var0).getString("STORE_AUTHED_TOKEN", null);
}

private fun Context.getLegacySharedPrefs(): SharedPreferences {
   val var2: java.lang.String = var0.getPackageName();
   val var1: StringBuilder = new StringBuilder();
   var1.append(var2);
   var1.append("_preferences");
   val var3: SharedPreferences = var0.getSharedPreferences(var1.toString(), 0);
   r.g(var3, "getSharedPreferences(\"${…s\", Context.MODE_PRIVATE)");
   return var3;
}
