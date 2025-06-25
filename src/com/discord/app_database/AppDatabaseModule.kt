package com.discord.app_database

import com.discord.cache.Cache
import com.discord.codegen.NativeAppDatabaseModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q
import z9.s

public class AppDatabaseModule(reactContext: ReactApplicationContext) : NativeAppDatabaseModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): Map<String, String?> {
      return A9.q.e(s.a("userId", Cache.Companion.get().getItem("_databaseUserId")));
   }

   public override fun setUserId(userId: String?) {
      if (var1 != null) {
         Cache.Companion.get().setItem("_databaseUserId", var1);
      } else {
         Cache.Companion.get().removeItem("_databaseUserId");
      }
   }
}
