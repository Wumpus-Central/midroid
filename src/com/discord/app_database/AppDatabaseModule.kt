package com.discord.app_database

import android.content.Context
import bl.w1
import com.discord.cache.CacheModule
import com.discord.kvstorage.discordapp.DiscordMobileApi
import com.discord.logging.Log
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule
import gh.w
import hh.r
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.Json.a

@ReactModule(name = "AppDatabase")
public class AppDatabaseModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public open fun getConstants(): MutableMap<String, String?> {
      val var1: CacheModule.Companion = CacheModule.Companion;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      return r.m(new Pair[]{w.a("userId", var1.get(var2).getItem("_databaseUserId"))});
   }

   public open fun getName(): String {
      return "AppDatabase";
   }

   @ReactMethod
   public fun setUserId(userId: String?) {
      if (var1 != null) {
         val var3: CacheModule.Companion = CacheModule.Companion;
         val var2: ReactApplicationContext = this.getReactApplicationContext();
         q.g(var2, "getReactApplicationContext(...)");
         var3.get(var2).setItem("_databaseUserId", var1);
      } else {
         val var4: CacheModule.Companion = CacheModule.Companion;
         val var5: ReactApplicationContext = this.getReactApplicationContext();
         q.g(var5, "getReactApplicationContext(...)");
         var4.get(var5).removeItem("_databaseUserId");
      }
   }

   public companion object {
      public const val LAST_DATABASE_USER_ID_PREFERENCES_KEY: String
      private const val LAST_DATABASE_USER_ID_PREFERENCES_STORE: String
      private const val LOG_TAG: String
      private final var dataDirectory: String?

      private fun databaseName(userId: String): String {
         val var2: StringBuilder = new StringBuilder();
         var2.append("@account.");
         var2.append(var1);
         return var2.toString();
      }

      private fun initializeAppDatabaseAsync(context: Context) {
         DiscordMobileApi.initialize(AppDatabaseModule.access$getDataDirectory$cp());
         val var4: java.lang.String = var1.getSharedPreferences("FastCacheStore", 0).getString("_databaseUserId", null);
         if (var4 != null && !q.c(var4, "")) {
            val var5: java.lang.String = this.databaseName(var4);
            DiscordMobileApi.openAsync(var5);
            val var2: Log = Log.INSTANCE;
            val var3: StringBuilder = new StringBuilder();
            var3.append("speculatively opening ");
            var3.append(var5);
            Log.i$default(var2, "AppDatabase", var3.toString(), null, 4, null);
         } else {
            Log.i$default(Log.INSTANCE, "AppDatabase", "speculative database open skipped: userId was empty.", null, 4, null);
         }
      }

      public fun getGuildVersions(userId: String?, requiredCacheVersion: String?): DatabaseVersions {
         if (var1 == null) {
            Log.e$default(Log.INSTANCE, "AppDatabase", "couldn't load guild versions: userId is null", null, 4, null);
            return DatabaseVersions.Companion.getEMPTY();
         } else if (AppDatabaseModule.access$getDataDirectory$cp() == null) {
            Log.e$default(Log.INSTANCE, "AppDatabase", "couldn't load guild versions: data directory is unavailable", null, 4, null);
            return DatabaseVersions.Companion.getEMPTY();
         } else if (var2 == null) {
            Log.e$default(Log.INSTANCE, "AppDatabase", "couldn't load guild versions: requiredCacheVersion was null", null, 4, null);
            return DatabaseVersions.Companion.getEMPTY();
         } else {
            DiscordMobileApi.initialize(AppDatabaseModule.access$getDataDirectory$cp());

            var var4: Int;
            var var23: Array<GuildVersion>;
            var var26: Array<NonGuildVersion>;
            try {
               var1 = this.databaseName(var1);
               val var22: java.lang.String = DiscordMobileApi.getGuildVersions(var1, "guild_versions");
               val var7: java.lang.String = DiscordMobileApi.getGuildVersions(var1, "non_guild_versions");
               val var6: java.lang.String = DiscordMobileApi.getGuildVersions(var1, "force_resync_version");
               val var15: a = Json.d;
               q.e(var22);
               var15.a();
               var23 = var15.b(new w1(g0.b(GuildVersion.class), GuildVersion.Companion.serializer()), var22) as Array<GuildVersion>;
               q.e(var7);
               var15.a();
               var26 = var15.b(new w1(g0.b(NonGuildVersion.class), NonGuildVersion.Companion.serializer()), var7) as Array<NonGuildVersion>;
               q.e(var6);
               var15.a();
               var16 = var15.b(new w1(g0.b(CacheVersion.class), CacheVersion.Companion.serializer()), var6) as Array<CacheVersion>;
               var4 = var16.length;
            } catch (var11: Exception) {
               val var12: Log = Log.INSTANCE;
               val var5: java.lang.String = var11.getMessage();
               val var19: StringBuilder = new StringBuilder();
               var19.append("couldn't load guild versions: ");
               var19.append(var5);
               Log.e$default(var12, "AppDatabase", var19.toString(), null, 4, null);
               return DatabaseVersions.Companion.getEMPTY();
            }

            var var3: Int = 0;

            while (true) {
               if (var3 >= var4) {
                  try {
                     Log.e$default(Log.INSTANCE, "AppDatabase", "cache version mismatch, skipping guild versions", null, 4, null);
                     var13 = DatabaseVersions.Companion.getEMPTY();
                  } catch (var9: Exception) {
                     val var18: Log = Log.INSTANCE;
                     val var25: java.lang.String = var9.getMessage();
                     val var21: StringBuilder = new StringBuilder();
                     var21.append("couldn't load guild versions: ");
                     var21.append(var25);
                     Log.e$default(var18, "AppDatabase", var21.toString(), null, 4, null);
                     var13 = DatabaseVersions.Companion.getEMPTY();
                  }
                  break;
               }

               try {
                  if (q.c(var16[var3].getVersion(), var2)) {
                     var13 = new DatabaseVersions(var23, var26);
                     break;
                  }
               } catch (var10: Exception) {
                  val var17: Log = Log.INSTANCE;
                  val var24: java.lang.String = var10.getMessage();
                  val var20: StringBuilder = new StringBuilder();
                  var20.append("couldn't load guild versions: ");
                  var20.append(var24);
                  Log.e$default(var17, "AppDatabase", var20.toString(), null, 4, null);
                  var13 = DatabaseVersions.Companion.getEMPTY();
                  break;
               }

               var3++;
            }

            return var13;
         }
      }

      public fun initializeAppDatabase(context: Context) {
         q.h(var1, "context");
         AppDatabaseModule.access$setDataDirectory$cp(var1.getFilesDir().getAbsolutePath());
         kh.a.b(false, false, null, null, 0, new Function0(var1) {
            final Context $context;

            {
               super(0);
               this.$context = var1;
            }

            public final void invoke() {
               AppDatabaseModule.Companion.access$initializeAppDatabaseAsync(AppDatabaseModule.Companion, this.$context);
            }
         }, 31, null);
      }
   }
}
