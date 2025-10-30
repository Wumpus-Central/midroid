package com.discord.fast_connect

import com.discord.app_database.DatabaseVersions
import com.discord.app_database.GuildVersion
import com.discord.app_database.NonGuildVersion
import com.discord.logging.Log
import fm.v
import java.util.LinkedHashMap
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import xp.h

@SourceDebugExtension(["SMAP\nIdentifyPayload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentifyPayload.kt\ncom/discord/fast_connect/IdentifyPayload\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,82:1\n1#2:83\n8506#3,2:84\n9188#3,4:86\n13409#3,2:90\n*S KotlinDebug\n*F\n+ 1 IdentifyPayload.kt\ncom/discord/fast_connect/IdentifyPayload\n*L\n24#1:84,2\n24#1:86,4\n27#1:90,2\n*E\n"])
internal object IdentifyPayload {
   private fun JsonObject.put(path: List<String>, value: JsonElement?): JsonObject {
      val var4: Int = var2.size();
      if (var4 != 0) {
         if (var4 != 1) {
            val var10: java.lang.String = var2.get(0) as java.lang.String;
            val var6: JsonElement = var1.get(var10) as JsonElement;
            if (var6 is JsonObject) {
               val var8: java.util.Map = n0.y(var1);
               var8.put(var10, INSTANCE.put(var6 as JsonObject, var2.subList(1, var2.size()), var3));
               return new JsonObject(var8);
            } else {
               return var1;
            }
         } else {
            val var9: java.lang.String = var2.get(0) as java.lang.String;
            val var5: java.util.Map = n0.y(var1);
            var var7: Any = var3;
            if (var3 == null) {
               var7 = h.a(null);
            }

            var5.put(var9, var7);
            return new JsonObject(var5);
         }
      } else {
         throw new IllegalArgumentException("path cannot have zero elements");
      }
   }

   private fun NonGuildVersion.toJson(): JsonPrimitive {
      return if (var1.getVersionString() == null) h.c(var1.getVersion()) else h.d(var1.getVersionString());
   }

   public fun withGuildVersions(json: String, versions: DatabaseVersions): String {
      var var17: Any;
      label38:
      try {
         var17 = Result.e;
         var17 = Result.b(Json.d.g(var1));
      } catch (var10: java.lang.Throwable) {
         var17 = Result.e;
         var17 = Result.b(c.a(var10));
         break label38;
      }

      var var7: Any = var17;
      if (Result.g(var17)) {
         var7 = null;
      }

      var17 = var7 as JsonElement;
      if ((var7 as JsonElement) !is JsonObject) {
         Log.w$default(Log.INSTANCE, "IdentifyPayload", "skipping identify mutation: root is not a json object", null, 4, null);
         return var1;
      } else {
         val var8: JsonObject = var17 as JsonObject;
         var7 = CollectionsKt.n(new java.lang.String[]{"d", "client_state", "guild_versions"});
         var17 = var2.getGuildVersions();
         val var12: LinkedHashMap = new LinkedHashMap(e.e(n0.e(((Object[])var17).length), 16));
         var var5: Int = ((Object[])var17).length;

         for (int var3 = 0; var3 < var5; var3++) {
            val var24: Pair = v.a(((GuildVersion)((Object[])var17)[var3]).getId(), h.c(((GuildVersion)((Object[])var17)[var3]).getVersion()));
            var12.put(var24.c(), var24.d());
         }

         var var13: JsonObject = this.put(var8, (java.util.List<java.lang.String>)var7, new JsonObject(var12));
         val var14: Array<NonGuildVersion> = var2.getNonGuildVersions();
         var5 = var14.length;

         for (int var15 = 0; var15 < var5; var15++) {
            var17 = var14[var15];
            var7 = INSTANCE;
            var13 = INSTANCE.put(
               var13,
               CollectionsKt.n(new java.lang.String[]{"d", "client_state", ((NonGuildVersion)var17).getId()}),
               ((IdentifyPayload)var7).toJson((NonGuildVersion)var17)
            );
         }

         return var13.toString();
      }
   }
}
