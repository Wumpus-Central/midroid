package com.discord.modules.fastconnectmanager

import com.discord.app_database.DatabaseVersions
import com.discord.app_database.GuildVersion
import com.discord.app_database.NonGuildVersion
import com.discord.logging.Log
import eh.w
import fh.s
import java.util.LinkedHashMap
import kotlin.jvm.internal.r
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.g

public object IdentifyPayload {
   private fun JsonObject.put(path: List<String>, value: JsonElement?): JsonObject {
      val var4: Int = var2.size();
      if (var4 == 0) {
         throw new IllegalArgumentException("path cannot have zero elements");
      } else {
         if (var4 != 1) {
            val var6: java.lang.String = var2.get(0) as java.lang.String;
            val var7: JsonElement = var1.get(var6) as JsonElement;
            if (var7 !is JsonObject) {
               return var1;
            }

            val var8: java.util.Map = s.x(var1);
            var8.put(var6, INSTANCE.put(var7 as JsonObject, var2.subList(1, var2.size()), var3));
            var1 = new JsonObject(var8);
         } else {
            val var11: java.lang.String = var2.get(0) as java.lang.String;
            val var12: java.util.Map = s.x(var1);
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
      r.h(var1, "json");
      r.h(var2, "versions");

      var var16: Any;
      label38:
      try {
         var16 = eh.r.k;
         var16 = eh.r.b(Json.d.g(var1));
      } catch (var9: java.lang.Throwable) {
         var16 = eh.r.k;
         var16 = eh.r.b(eh.s.a(var9));
         break label38;
      }

      var var6: java.util.Map = (java.util.Map)var16;
      if (eh.r.g(var16)) {
         var6 = null;
      }

      var16 = var6 as JsonElement;
      if ((var6 as JsonElement) !is JsonObject) {
         Log.w$default(Log.INSTANCE, "IdentifyPayload", "skipping identify mutation: root is not a json object", null, 4, null);
         return var1;
      } else {
         var16 = var16 as JsonObject;
         val var7: java.util.List = h.l(new java.lang.String[]{"d", "client_state", "guild_versions"});
         val var11: Array<GuildVersion> = var2.getGuildVersions();
         var6 = new LinkedHashMap(vh.h.c(s.d(var11.length), 16));
         var var4: Int = var11.length;

         for (int var3 = 0; var3 < var4; var3++) {
            val var23: Pair = w.a(var11[var3].getId(), g.c(var11[var3].getVersion()));
            var6.put(var23.c(), var23.d());
         }

         var var12: JsonObject = this.put((JsonObject)var16, var7, new JsonObject(var6));
         val var13: Array<NonGuildVersion> = var2.getNonGuildVersions();
         var4 = var13.length;

         for (int var14 = 0; var14 < var4; var14++) {
            val var22: NonGuildVersion = var13[var14];
            var16 = INSTANCE;
            var12 = INSTANCE.put(var12, h.l(new java.lang.String[]{"d", "client_state", var22.getId()}), ((IdentifyPayload)var16).toJson(var22));
         }

         return var12.toString();
      }
   }
}
