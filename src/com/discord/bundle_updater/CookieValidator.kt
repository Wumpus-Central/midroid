package com.discord.bundle_updater

import java.net.URLDecoder
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import nn.g
import okhttp3.Cookie
import okio.ByteString
import wj.r

public object CookieValidator {
   public fun parseBuildOverrideCookie(buildOverrideCookie: Cookie?): BuildOverrideCookieContents? {
      if (var1 == null) {
         return null;
      } else {
         val var8: java.lang.String = i.g0(h.z0(var1.g(), new java.lang.String[]{"."}, false, 0, 6, null), 1) as java.lang.String;
         if (var8 == null) {
            return null;
         } else {
            var var2: java.lang.String = URLDecoder.decode(var8, "UTF-8");
            val var9: okio.ByteString.a = ByteString.n;
            q.e(var2);
            val var10: ByteString = var9.a(var2);
            if (var10 != null) {
               var2 = var10.D();
               if (var2 != null) {
                  try {
                     var11 = Json.d;
                     var14 = Json.d.g(var2);
                  } catch (var7: g) {
                     return null;
                  }

                  var var3: JsonElement = rn.g.o(var14).get("$meta") as JsonElement;
                  if (var3 == null) {
                     return null;
                  }

                  var11.a();
                  val var12: BuildOverrideCookieMeta = var11.d(BuildOverrideCookieMeta.Companion.serializer(), var3) as BuildOverrideCookieMeta;
                  val var15: JsonObject = rn.g.o(var14);
                  val var18: LinkedHashMap = new LinkedHashMap();

                  for (Entry var4 : var15.entrySet()) {
                     if (q.c(var4.getKey() as java.lang.String, "$meta") xor true) {
                        var18.put(var4.getKey(), var4.getValue());
                     }
                  }

                  val var17: LinkedHashMap = new LinkedHashMap(r.d(var18.size()));

                  for (Entry var5 : var18.entrySet()) {
                     var3 = (JsonElement)var5.getKey();
                     val var21: JsonElement = var5.getValue() as JsonElement;
                     val var6: kotlinx.serialization.json.Json.a = Json.d;
                     Json.d.a();
                     var17.put(var3, var6.d(BuildOverrideCookieBuild.Companion.serializer(), var21) as BuildOverrideCookieBuild);
                  }

                  return new BuildOverrideCookieContents(var12, var17);
               }
            }

            return null;
         }
      }
   }

   public fun validateBuildOverrideCookie(buildOverrideCookie: Cookie?, version: String): Boolean {
      q.h(var2, "version");
      val var5: BuildOverrideCookieContents = this.parseBuildOverrideCookie(var1);
      val var4: Boolean = false;
      if (var5 == null) {
         return false;
      } else {
         val var6: java.util.List = var5.getMeta().getAllowedVersions();
         if (var6 == null) {
            return false;
         } else {
            var var3: Boolean;
            if (var6.isEmpty()) {
               var3 = false;
            } else {
               val var7: java.util.Iterator = var6.iterator();

               while (true) {
                  var3 = var4;
                  if (!var7.hasNext()) {
                     break;
                  }

                  if (q.c(var7.next() as java.lang.String, var2)) {
                     var3 = true;
                     break;
                  }
               }
            }

            return var3;
         }
      }
   }
}
