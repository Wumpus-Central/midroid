package com.discord.app_database

import android.content.Context
import com.discord.cache.CacheModule
import com.discord.kvstorage.discordapp.DiscordMobileApi
import com.discord.logging.Log
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule
import eh.w
import fh.s
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.Json.a
import xk.v1

@ReactModule(name = "AppDatabase")
public class AppDatabaseModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public open fun getConstants(): MutableMap<String, String?> {
      val var1: com.discord.cache.CacheModule.Companion = CacheModule.Companion;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "reactApplicationContext");
      return s.m(new Pair[]{w.a("userId", var1.get(var2).getItem("_databaseUserId"))});
   }

   public open fun getName(): String {
      return "AppDatabase";
   }

   @ReactMethod
   public fun setUserId(userId: String?) {
      if (var1 != null) {
         val var2: com.discord.cache.CacheModule.Companion = CacheModule.Companion;
         val var3: ReactApplicationContext = this.getReactApplicationContext();
         r.g(var3, "reactApplicationContext");
         var2.get(var3).setItem("_databaseUserId", var1);
      } else {
         val var4: com.discord.cache.CacheModule.Companion = CacheModule.Companion;
         val var5: ReactApplicationContext = this.getReactApplicationContext();
         r.g(var5, "reactApplicationContext");
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
         if (var4 != null && !r.c(var4, "")) {
            val var2: java.lang.String = this.databaseName(var4);
            DiscordMobileApi.openAsync(var2);
            val var3: Log = Log.INSTANCE;
            val var5: StringBuilder = new StringBuilder();
            var5.append("speculatively opening ");
            var5.append(var2);
            Log.i$default(var3, "AppDatabase", var5.toString(), null, 4, null);
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

            var var6: Int;
            var var31: Array<NonGuildVersion>;
            var var32: Array<GuildVersion>;
            try {
               var1 = this.databaseName(var1);
               val var9: java.lang.String = DiscordMobileApi.getGuildVersions(var1, "guild_versions");
               val var8: java.lang.String = DiscordMobileApi.getGuildVersions(var1, "non_guild_versions");
               var1 = DiscordMobileApi.getGuildVersions(var1, "force_resync_version");
               val var27: a = Json.d;
               r.g(var9, "guildJson");
               var27.a();
               var32 = var27.b(new v1(h0.b(GuildVersion.class), GuildVersion.$serializer.INSTANCE), var9) as Array<GuildVersion>;
               r.g(var8, "nonGuildJson");
               var27.a();
               var31 = var27.b(new v1(h0.b(NonGuildVersion.class), NonGuildVersion.$serializer.INSTANCE), var8) as Array<NonGuildVersion>;
               r.g(var1, "cacheVersionJson");
               var27.a();
               var19 = var27.b(new v1(h0.b(CacheVersion.class), CacheVersion.$serializer.INSTANCE), var1) as Array<CacheVersion>;
               var6 = var19.length;
            } catch (var14: Exception) {
               val var15: Log = Log.INSTANCE;
               var2 = var14.getMessage();
               val var7: StringBuilder = new StringBuilder();
               var7.append("couldn't load guild versions: ");
               var7.append(var2);
               Log.e$default(var15, "AppDatabase", var7.toString(), null, 4, null);
               return DatabaseVersions.Companion.getEMPTY();
            }

            val var5: Boolean = false;
            var var4: Int = 0;

            var var3: Boolean;
            while (true) {
               var3 = var5;
               if (var4 >= var6) {
                  break;
               }

               label43: {
                  try {
                     if (r.c(var19[var4].getVersion(), var2)) {
                        break label43;
                     }
                  } catch (var13: Exception) {
                     val var20: Log = Log.INSTANCE;
                     var2 = var13.getMessage();
                     val var28: StringBuilder = new StringBuilder();
                     var28.append("couldn't load guild versions: ");
                     var28.append(var2);
                     Log.e$default(var20, "AppDatabase", var28.toString(), null, 4, null);
                     return DatabaseVersions.Companion.getEMPTY();
                  }

                  var4++;
                  continue;
               }

               var3 = true;
               break;
            }

            var var16: DatabaseVersions;
            if (!var3) {
               try {
                  Log.e$default(Log.INSTANCE, "AppDatabase", "cache version mismatch, skipping guild versions", null, 4, null);
                  var16 = DatabaseVersions.Companion.getEMPTY();
               } catch (var12: Exception) {
                  val var21: Log = Log.INSTANCE;
                  var2 = var12.getMessage();
                  val var29: StringBuilder = new StringBuilder();
                  var29.append("couldn't load guild versions: ");
                  var29.append(var2);
                  Log.e$default(var21, "AppDatabase", var29.toString(), null, 4, null);
                  var16 = DatabaseVersions.Companion.getEMPTY();
               }
            } else {
               try {
                  var16 = new DatabaseVersions(var32, var31);
               } catch (var11: Exception) {
                  val var22: Log = Log.INSTANCE;
                  var2 = var11.getMessage();
                  val var30: StringBuilder = new StringBuilder();
                  var30.append("couldn't load guild versions: ");
                  var30.append(var2);
                  Log.e$default(var22, "AppDatabase", var30.toString(), null, 4, null);
                  var16 = DatabaseVersions.Companion.getEMPTY();
               }
            }

            return var16;
         }
      }

      public fun initializeAppDatabase(context: Context) {
         r.h(var1, "context");
         AppDatabaseModule.access$setDataDirectory$cp(var1.getFilesDir().getAbsolutePath());
         ih.a.b(false, false, null, null, 0, new Function0<Unit>(var1) {
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
