package com.discord.hosts

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nHosts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hosts.kt\ncom/discord/hosts/Hosts\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,36:1\n41#2,12:37\n*S KotlinDebug\n*F\n+ 1 Hosts.kt\ncom/discord/hosts/Hosts\n*L\n26#1:37,12\n*E\n"])
public object Hosts {
   private final lateinit var prefs: SharedPreferences

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


   private fun requireHost(key: String): String {
      var var2: SharedPreferences = prefs;
      if (prefs == null) {
         Intrinsics.throwUninitializedPropertyAccessException("prefs");
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
         Intrinsics.throwUninitializedPropertyAccessException("prefs");
         var3 = null;
      }

      val var5: Editor = var3.edit();
      var5.putString(var1, var2);
      var5.apply();
   }

   public fun init(context: Context, api: String? = null, cdn: String? = null) {
      if (prefs == null) {
         prefs = var1.getSharedPreferences("discord_hosts", 0);
      }

      if (var2 != null) {
         this.setAPI(var2);
      }

      if (var3 != null) {
         this.setCDN(var3);
      }
   }
}
