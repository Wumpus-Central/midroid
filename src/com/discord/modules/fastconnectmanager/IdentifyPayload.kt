package com.discord.modules.fastconnectmanager

import bl.g
import com.discord.app_database.DatabaseVersions
import com.discord.app_database.GuildVersion
import com.discord.app_database.NonGuildVersion
import com.discord.logging.Log
import fh.s
import fh.w
import gh.r
import java.util.LinkedHashMap
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

public object IdentifyPayload {
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

            val var8: java.util.Map = r.x(var1);
            var8.put(var7, INSTANCE.put(var6 as JsonObject, var2.subList(1, var2.size()), var3));
            var1 = new JsonObject(var8);
         } else {
            val var11: java.lang.String = var2.get(0) as java.lang.String;
            val var12: java.util.Map = r.x(var1);
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
      q.h(var1, "json");
      q.h(var2, "versions");

      var var17: Any;
      label38:
      try {
         var17 = fh.r.k;
         var17 = fh.r.b(Json.d.g(var1));
      } catch (var10: java.lang.Throwable) {
         var17 = fh.r.k;
         var17 = fh.r.b(s.a(var10));
         break label38;
      }

      var var7: java.util.Map = (java.util.Map)var17;
      if (fh.r.g(var17)) {
         var7 = null;
      }

      var17 = var7 as JsonElement;
      if ((var7 as JsonElement) !is JsonObject) {
         Log.w$default(Log.INSTANCE, "IdentifyPayload", "skipping identify mutation: root is not a json object", null, 4, null);
         return var1;
      } else {
         var17 = var17 as JsonObject;
         val var8: java.util.List = i.m(new java.lang.String[]{"d", "client_state", "guild_versions"});
         val var12: Array<GuildVersion> = var2.getGuildVersions();
         var7 = new LinkedHashMap(f.c(r.d(var12.length), 16));
         var var5: Int = var12.length;

         for (int var3 = 0; var3 < var5; var3++) {
            val var24: Pair = w.a(var12[var3].getId(), g.c(var12[var3].getVersion()));
            var7.put(var24.c(), var24.d());
         }

         var var13: JsonObject = this.put((JsonObject)var17, var8, new JsonObject(var7));
         val var14: Array<NonGuildVersion> = var2.getNonGuildVersions();
         var5 = var14.length;

         for (int var15 = 0; var15 < var5; var15++) {
            val var23: NonGuildVersion = var14[var15];
            var17 = INSTANCE;
            var13 = INSTANCE.put(var13, i.m(new java.lang.String[]{"d", "client_state", var23.getId()}), ((IdentifyPayload)var17).toJson(var23));
         }

         return var13.toString();
      }
   }
}
