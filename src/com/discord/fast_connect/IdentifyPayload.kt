package com.discord.fast_connect

import Oa.g
import R8.s
import S8.q
import com.discord.app_database.DatabaseVersions
import com.discord.app_database.GuildVersion
import com.discord.app_database.NonGuildVersion
import com.discord.logging.Log
import java.util.LinkedHashMap
import kotlin.Result.a
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object IdentifyPayload {
   private fun JsonObject.put(path: List<String>, value: JsonElement?): JsonObject {
      val var4: Int = var2.size();
      if (var4 == 0) {
         throw new IllegalArgumentException("path cannot have zero elements");
      } else {
         if (var4 != 1) {
            val var7: java.lang.String = var2.get(0) as java.lang.String;
            val var6: JsonElement = var1.get(var7) as JsonElement;
            if (var6 !is JsonObject) {
               return var1;
            }

            val var8: java.util.Map = q.w(var1);
            var8.put(var7, INSTANCE.put(var6 as JsonObject, var2.subList(1, var2.size()), var3));
            var1 = new JsonObject(var8);
         } else {
            val var11: java.lang.String = var2.get(0) as java.lang.String;
            val var12: java.util.Map = q.w(var1);
            var var10: Any = var3;
            if (var3 == null) {
               var10 = g.a(null);
            }

            var12.put(var11, var10);
            var1 = new JsonObject(var12);
         }

         return var1;
      }
   }

   private fun NonGuildVersion.toJson(): JsonPrimitive {
      val var2: JsonPrimitive;
      if (var1.getVersionString() == null) {
         var2 = g.c(var1.getVersion());
      } else {
         var2 = g.d(var1.getVersionString());
      }

      return var2;
   }

   public fun withGuildVersions(json: String, versions: DatabaseVersions): String {
      kotlin.jvm.internal.q.h(var1, "json");
      kotlin.jvm.internal.q.h(var2, "versions");

      var var6: Any;
      label38:
      try {
         var6 = Result.k;
         var6 = (java.util.Map)Result.b(Json.d.g(var1));
      } catch (var10: java.lang.Throwable) {
         val var7: a = Result.k;
         var6 = (java.util.Map)Result.b(c.a(var10));
         break label38;
      }

      var var21: Any = var6;
      if (Result.g(var6)) {
         var21 = null;
      }

      var6 = var21 as JsonElement;
      if ((var21 as JsonElement) !is JsonObject) {
         Log.w$default(Log.INSTANCE, "IdentifyPayload", "skipping identify mutation: root is not a json object", null, 4, null);
         return var1;
      } else {
         var21 = var6 as JsonObject;
         val var8: java.util.List = i.n(new java.lang.String[]{"d", "client_state", "guild_versions"});
         val var12: Array<GuildVersion> = var2.getGuildVersions();
         var6 = new LinkedHashMap(d.c(q.d(var12.length), 16));
         var var5: Int = var12.length;

         for (int var3 = 0; var3 < var5; var3++) {
            val var24: Pair = s.a(var12[var3].getId(), g.c(var12[var3].getVersion()));
            var6.put(var24.c(), var24.d());
         }

         var var13: JsonObject = this.put((JsonObject)var21, var8, new JsonObject(var6));
         val var14: Array<NonGuildVersion> = var2.getNonGuildVersions();
         var5 = var14.length;

         for (int var15 = 0; var15 < var5; var15++) {
            val var20: NonGuildVersion = var14[var15];
            var21 = INSTANCE;
            var13 = INSTANCE.put(var13, i.n(new java.lang.String[]{"d", "client_state", var20.getId()}), ((IdentifyPayload)var21).toJson(var20));
         }

         return var13.toString();
      }
   }
}
