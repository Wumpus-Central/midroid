package com.discord.react.utilities

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.uimanager.ReactStylesDiffMap
import kotlin.jvm.internal.q

public fun ReactStylesDiffMap.getBoolean(key: String): Boolean {
   q.h(var0, "<this>");
   q.h(var1, "key");
   if (var0.isNull(var1) xor true) {
      return var0.getBoolean(var1, false);
   } else {
      throw new IllegalArgumentException("Failed requirement.".toString());
   }
}

public fun ReactStylesDiffMap.getNonNullArray(key: String): ReadableArray {
   q.h(var0, "<this>");
   q.h(var1, "key");
   val var2: ReadableArray = var0.getArray(var1);
   q.e(var2);
   return var2;
}

public fun ReactStylesDiffMap.getNonNullInt(key: String): Int {
   q.h(var0, "<this>");
   q.h(var1, "key");
   if (var0.isNull(var1) xor true) {
      return var0.getInt(var1, Integer.MAX_VALUE);
   } else {
      throw new IllegalArgumentException("Failed requirement.".toString());
   }
}

public fun ReactStylesDiffMap.getNonNullMap(key: String): ReadableMap {
   q.h(var0, "<this>");
   q.h(var1, "key");
   val var2: ReadableMap = var0.getMap(var1);
   q.e(var2);
   return var2;
}

public fun ReactStylesDiffMap.getNonNullString(key: String): String {
   q.h(var0, "<this>");
   q.h(var1, "key");
   val var2: java.lang.String = var0.getString(var1);
   q.e(var2);
   return var2;
}
