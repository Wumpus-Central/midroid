package com.discord.react.utilities

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.uimanager.ReactStylesDiffMap

public fun ReactStylesDiffMap.getBoolean(key: String): Boolean {
   if (!var0.isNull(var1)) {
      return var0.getBoolean(var1, false);
   } else {
      throw new IllegalArgumentException("Failed requirement.");
   }
}

public fun ReactStylesDiffMap.getNonNullArray(key: String): ReadableArray {
   val var2: ReadableArray = var0.getArray(var1);
   return var2;
}

public fun ReactStylesDiffMap.getNonNullInt(key: String): Int {
   if (!var0.isNull(var1)) {
      return var0.getInt(var1, Integer.MAX_VALUE);
   } else {
      throw new IllegalArgumentException("Failed requirement.");
   }
}

public fun ReactStylesDiffMap.getNonNullMap(key: String): ReadableMap {
   val var2: ReadableMap = var0.getMap(var1);
   return var2;
}

public fun ReactStylesDiffMap.getNonNullString(key: String): String {
   val var2: java.lang.String = var0.getString(var1);
   return var2;
}
