package com.discord.hosts

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import kotlin.jvm.internal.r

public object Hosts {
   public final var API: String
      public final get() {
         return this.requireHost("host_api");
      }

      public final set(value) {
         this.setHost("host_api", var1);
      }


   public final var CDN: String
      public final get() {
         return this.requireHost("host_cdn");
      }

      public final set(value) {
         this.setHost("host_cdn", var1);
      }


   private final lateinit var prefs: SharedPreferences

   private fun requireHost(key: String): String {
      var var2: SharedPreferences = prefs;
      if (prefs == null) {
         r.y("prefs");
         var2 = null;
      }

      val var4: java.lang.String = var2.getString(var1, null);
      if (var4 != null) {
         return var4;
      } else {
         val var5: StringBuilder = new StringBuilder();
         var5.append("No value for '");
         var5.append(var1);
         var5.append("'");
         throw new IllegalArgumentException(var5.toString());
      }
   }

   private fun setHost(key: String, value: String) {
      var var3: SharedPreferences = prefs;
      if (prefs == null) {
         r.y("prefs");
         var3 = null;
      }

      val var5: Editor = var3.edit();
      r.g(var5, "editor");
      var5.putString(var1, var2);
      var5.apply();
   }

   public fun init(context: Context, api: String? = null, cdn: String? = null) {
      r.h(var1, "context");
      if (prefs == null) {
         val var4: SharedPreferences = var1.getSharedPreferences("discord_hosts", 0);
         r.g(var4, "context.getSharedPrefere…s\", Context.MODE_PRIVATE)");
         prefs = var4;
      }

      if (var2 != null) {
         this.setAPI(var2);
      }

      if (var3 != null) {
         this.setCDN(var3);
      }
   }
}
