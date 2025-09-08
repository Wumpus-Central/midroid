package com.discord.app_database

import A9.s
import com.discord.cache.Cache
import com.discord.codegen.NativeAppDatabaseModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class AppDatabaseModule(reactContext: ReactApplicationContext) : NativeAppDatabaseModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): Map<String, String?> {
      return L.e(s.a("userId", Cache.Companion.get().getItem("_databaseUserId")));
   }

   public override fun setUserId(userId: String?) {
      if (var1 != null) {
         Cache.Companion.get().setItem("_databaseUserId", var1);
      } else {
         Cache.Companion.get().removeItem("_databaseUserId");
      }
   }
}
