package com.discord.react_resource_cache

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.q

public abstract class ReactResourceCache<T extends java.lang.Enum<?>> {
   public abstract val cacheKey: String
   private final var reactResources: MutableMap<String, String> = new LinkedHashMap()

   private final val cache: SharedPreferences
      private final get() {
         val var2: SharedPreferences = var1.getSharedPreferences(this.getCacheKey(), 0);
         q.g(var2, "getSharedPreferences(...)");
         return var2;
      }


   public fun get(context: Context, reactResource: Any): String {
      q.h(var1, "context");
      q.h(var2, "reactResource");
      val var4: java.lang.String = this.reactResources.get(var2.name());
      var var3: java.lang.String = var4;
      if (var4 == null) {
         var var5: java.lang.String = this.getCache(var1).getString(var2.name(), null);
         if (var5 != null) {
            this.reactResources.put(var2.name(), var5);
         } else {
            var5 = null;
         }

         if (var5 == null) {
            val var7: java.lang.String = var2.name();
            val var6: StringBuilder = new StringBuilder();
            var6.append("Unable to access ");
            var6.append(var7);
            var6.append(" as it has not yet been provided.");
            throw new IllegalAccessException(var6.toString());
         }

         var3 = var5;
      }

      return var3;
   }

   public fun set(context: Context, newReactResources: Map<String, String>) {
      q.h(var1, "context");
      q.h(var2, "newReactResources");
      val var4: Editor = this.getCache(var1).edit();
      q.g(var4, "editor");
      var4.clear();

      for (Entry var5 : var2.entrySet()) {
         var4.putString(var5.getKey() as java.lang.String, var5.getValue() as java.lang.String);
      }

      this.reactResources = new HashMap<>(var2);
      var4.apply();
   }
}
