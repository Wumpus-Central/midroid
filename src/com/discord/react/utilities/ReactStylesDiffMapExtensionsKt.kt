package com.discord.react.utilities

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.uimanager.ReactStylesDiffMap
import kotlin.jvm.internal.r

public fun ReactStylesDiffMap.getBoolean(key: String): Boolean {
   r.h(var0, "<this>");
   r.h(var1, "key");
   if (var0.isNull(var1) xor true) {
      return var0.getBoolean(var1, false);
   } else {
      throw new IllegalArgumentException("Failed requirement.".toString());
   }
}

public fun ReactStylesDiffMap.getNonNullArray(key: String): ReadableArray {
   r.h(var0, "<this>");
   r.h(var1, "key");
   val var2: ReadableArray = var0.getArray(var1);
   r.e(var2);
   return var2;
}

public fun ReactStylesDiffMap.getNonNullInt(key: String): Int {
   r.h(var0, "<this>");
   r.h(var1, "key");
   if (var0.isNull(var1) xor true) {
      return var0.getInt(var1, Integer.MAX_VALUE);
   } else {
      throw new IllegalArgumentException("Failed requirement.".toString());
   }
}

public fun ReactStylesDiffMap.getNonNullMap(key: String): ReadableMap {
   r.h(var0, "<this>");
   r.h(var1, "key");
   val var2: ReadableMap = var0.getMap(var1);
   r.e(var2);
   return var2;
}

public fun ReactStylesDiffMap.getNonNullString(key: String): String {
   r.h(var0, "<this>");
   r.h(var1, "key");
   val var2: java.lang.String = var0.getString(var1);
   r.e(var2);
   return var2;
}
