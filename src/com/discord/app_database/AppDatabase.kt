package com.discord.app_database

import Na.z0
import android.content.Context
import com.discord.kvstorage.discordapp.DiscordMobileApi
import com.discord.logging.Log
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json

public object AppDatabase {
   internal const val LAST_DATABASE_USER_ID_PREFERENCES_KEY: String = "_databaseUserId"
   private const val LAST_DATABASE_USER_ID_PREFERENCES_STORE: String = "FastCacheStore"
   private const val LOG_TAG: String = "AppDatabase"
   private final var dataDirectory: String?

   private fun databaseName(userId: String): String {
      val var2: StringBuilder = new StringBuilder();
      var2.append("@account.");
      var2.append(var1);
      return var2.toString();
   }

   @JvmStatic
   fun `initializeAppDatabase$lambda$0`(var0: Context): Unit {
      INSTANCE.initializeAppDatabaseAsync(var0);
      return Unit.a;
   }

   private fun initializeAppDatabaseAsync(context: Context) {
      DiscordMobileApi.initialize(dataDirectory);
      val var4: java.lang.String = var1.getSharedPreferences("FastCacheStore", 0).getString("_databaseUserId", null);
      if (var4 != null && !q.c(var4, "")) {
         val var3: java.lang.String = this.databaseName(var4);
         DiscordMobileApi.openAsync(var3);
         val var5: Log = Log.INSTANCE;
         val var2: StringBuilder = new StringBuilder();
         var2.append("speculatively opening ");
         var2.append(var3);
         Log.i$default(var5, "AppDatabase", var2.toString(), null, 4, null);
      } else {
         Log.i$default(Log.INSTANCE, "AppDatabase", "speculative database open skipped: userId was empty.", null, 4, null);
      }
   }

   public fun getGuildVersions(userId: String?, requiredCacheVersion: String?): DatabaseVersions {
      if (var1 == null) {
         Log.e$default(Log.INSTANCE, "AppDatabase", "couldn't load guild versions: userId is null", null, 4, null);
         return DatabaseVersions.Companion.getEMPTY();
      } else if (dataDirectory == null) {
         Log.e$default(Log.INSTANCE, "AppDatabase", "couldn't load guild versions: data directory is unavailable", null, 4, null);
         return DatabaseVersions.Companion.getEMPTY();
      } else if (var2 == null) {
         Log.e$default(Log.INSTANCE, "AppDatabase", "couldn't load guild versions: requiredCacheVersion was null", null, 4, null);
         return DatabaseVersions.Companion.getEMPTY();
      } else {
         DiscordMobileApi.initialize(dataDirectory);

         var var4: Int;
         var var24: Array<GuildVersion>;
         var var27: Array<NonGuildVersion>;
         try {
            var1 = this.databaseName(var1);
            val var23: java.lang.String = DiscordMobileApi.getGuildVersions(var1, "guild_versions");
            val var7: java.lang.String = DiscordMobileApi.getGuildVersions(var1, "non_guild_versions");
            var1 = DiscordMobileApi.getGuildVersions(var1, "force_resync_version");
            val var6: kotlinx.serialization.json.Json.a = Json.d;
            q.e(var23);
            var6.a();
            var24 = var6.b(new z0(G.b(GuildVersion.class), GuildVersion.Companion.serializer()), var23) as Array<GuildVersion>;
            q.e(var7);
            var6.a();
            var27 = var6.b(new z0(G.b(NonGuildVersion.class), NonGuildVersion.Companion.serializer()), var7) as Array<NonGuildVersion>;
            q.e(var1);
            var6.a();
            var16 = var6.b(new z0(G.b(CacheVersion.class), CacheVersion.Companion.serializer()), var1) as Array<CacheVersion>;
            var4 = var16.length;
         } catch (var11: Exception) {
            val var12: Log = Log.INSTANCE;
            var2 = var11.getMessage();
            val var22: StringBuilder = new StringBuilder();
            var22.append("couldn't load guild versions: ");
            var22.append(var2);
            Log.e$default(var12, "AppDatabase", var22.toString(), null, 4, null);
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
                  var2 = var9.getMessage();
                  val var26: StringBuilder = new StringBuilder();
                  var26.append("couldn't load guild versions: ");
                  var26.append(var2);
                  Log.e$default(var18, "AppDatabase", var26.toString(), null, 4, null);
                  var13 = DatabaseVersions.Companion.getEMPTY();
               }
               break;
            }

            try {
               if (q.c(var16[var3].getVersion(), var2)) {
                  var13 = new DatabaseVersions(var24, var27);
                  break;
               }
            } catch (var10: Exception) {
               val var17: Log = Log.INSTANCE;
               var2 = var10.getMessage();
               val var25: StringBuilder = new StringBuilder();
               var25.append("couldn't load guild versions: ");
               var25.append(var2);
               Log.e$default(var17, "AppDatabase", var25.toString(), null, 4, null);
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
      dataDirectory = var1.getFilesDir().getAbsolutePath();
      W8.a.b(false, false, null, "AppDatabaseLoader", 0, new a(var1), 23, null);
   }
}
