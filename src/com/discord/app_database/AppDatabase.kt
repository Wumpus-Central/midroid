package com.discord.app_database

import android.content.Context
import com.discord.kvstorage.discordapp.DiscordMobileApi
import com.discord.logging.Log
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json
import qb.z0

@SourceDebugExtension(["SMAP\nAppDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDatabase.kt\ncom/discord/app_database/AppDatabase\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,91:1\n123#2:92\n123#2:93\n123#2:94\n12574#3,2:95\n*S KotlinDebug\n*F\n+ 1 AppDatabase.kt\ncom/discord/app_database/AppDatabase\n*L\n69#1:92\n70#1:93\n71#1:94\n78#1:95,2\n*E\n"])
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
      if (var4 != null && !(var4 == "")) {
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
      } else if (dataDirectory == null) {
         Log.e$default(Log.INSTANCE, "AppDatabase", "couldn't load guild versions: data directory is unavailable", null, 4, null);
         return DatabaseVersions.Companion.getEMPTY();
      } else if (var2 == null) {
         Log.e$default(Log.INSTANCE, "AppDatabase", "couldn't load guild versions: requiredCacheVersion was null", null, 4, null);
         return DatabaseVersions.Companion.getEMPTY();
      } else {
         DiscordMobileApi.initialize(dataDirectory);

         var var4: Int;
         var var26: Array<GuildVersion>;
         var var27: Array<NonGuildVersion>;
         try {
            var1 = this.databaseName(var1);
            val var6: java.lang.String = DiscordMobileApi.getGuildVersions(var1, "guild_versions");
            val var7: java.lang.String = DiscordMobileApi.getGuildVersions(var1, "non_guild_versions");
            var1 = DiscordMobileApi.getGuildVersions(var1, "force_resync_version");
            val var23: kotlinx.serialization.json.Json.a = Json.d;
            var23.a();
            var26 = var23.b(new z0(GuildVersion::class, GuildVersion.Companion.serializer()), var6) as Array<GuildVersion>;
            var23.a();
            var27 = var23.b(new z0(NonGuildVersion::class, NonGuildVersion.Companion.serializer()), var7) as Array<NonGuildVersion>;
            var23.a();
            var16 = var23.b(new z0(CacheVersion::class, CacheVersion.Companion.serializer()), var1) as Array<CacheVersion>;
            var4 = var16.length;
         } catch (var11: Exception) {
            val var12: Log = Log.INSTANCE;
            val var22: java.lang.String = var11.getMessage();
            val var19: StringBuilder = new StringBuilder();
            var19.append("couldn't load guild versions: ");
            var19.append(var22);
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
               if (var16[var3].getVersion() == var2) {
                  var13 = new DatabaseVersions(var26, var27);
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
      dataDirectory = var1.getFilesDir().getAbsolutePath();
      F9.a.b(false, false, null, "AppDatabaseLoader", 0, new a(var1), 23, null);
   }
}
