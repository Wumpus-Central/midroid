package com.discord.app_database

import com.discord.cache.Cache
import com.discord.codegen.NativeAppDatabaseModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import ht.v

public class AppDatabaseModule(reactContext: ReactApplicationContext) : NativeAppDatabaseModuleSpec(var1) {
   protected open fun getTypedExportedConstants(): Map<String, String?> {
      return s0.f(v.a("userId", Cache.Companion.get().getItem("_databaseUserId")));
   }

   public open fun setUserId(userId: String?) {
      if (var1 != null) {
         Cache.Companion.get().setItem("_databaseUserId", var1);
      } else {
         Cache.Companion.get().removeItem("_databaseUserId");
      }
   }
}
