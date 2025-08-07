package com.discord.bundle_updater

import B9.q
import java.net.URLDecoder
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.r
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import okhttp3.Cookie
import okio.ByteString

public object CookieValidator {
   public fun parseBuildOverrideCookie(buildOverrideCookie: Cookie?): BuildOverrideCookieContents? {
      if (var1 == null) {
         return null;
      } else {
         val var8: java.lang.String = kotlin.collections.i.k0(kotlin.text.h.B0(var1.i(), new java.lang.String[]{"."}, false, 0, 6, null), 1) as java.lang.String;
         if (var8 == null) {
            return null;
         } else {
            val var9: java.lang.String = URLDecoder.decode(var8, "UTF-8");
            val var2: okio.ByteString.a = ByteString.n;
            r.e(var9);
            val var10: ByteString = var2.b(var9);
            if (var10 != null) {
               val var13: java.lang.String = var10.H();
               if (var13 != null) {
                  try {
                     var11 = Json.d;
                     var14 = Json.d.g(var13);
                  } catch (var7: tb.h) {
                     return null;
                  }

                  val var3: JsonElement = xb.g.o(var14).get("$meta") as JsonElement;
                  if (var3 == null) {
                     return null;
                  }

                  var11.a();
                  val var12: BuildOverrideCookieMeta = var11.d(BuildOverrideCookieMeta.Companion.serializer(), var3) as BuildOverrideCookieMeta;
                  val var15: JsonObject = xb.g.o(var14);
                  val var18: LinkedHashMap = new LinkedHashMap();

                  for (Entry var4 : var15.entrySet()) {
                     if (!r.c(var4.getKey() as java.lang.String, "$meta")) {
                        var18.put(var4.getKey(), var4.getValue());
                     }
                  }

                  val var17: LinkedHashMap = new LinkedHashMap(q.d(var18.size()));

                  for (Entry var5 : var18.entrySet()) {
                     val var20: Any = var5.getKey();
                     val var21: JsonElement = var5.getValue() as JsonElement;
                     val var6: kotlinx.serialization.json.Json.a = Json.d;
                     Json.d.a();
                     var17.put(var20, var6.d(BuildOverrideCookieBuild.Companion.serializer(), var21) as BuildOverrideCookieBuild);
                  }

                  return new BuildOverrideCookieContents(var12, var17);
               }
            }

            return null;
         }
      }
   }

   public fun validateBuildOverrideCookie(buildOverrideCookie: Cookie?, version: String): Boolean {
      r.h(var2, "version");
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

                  if (r.c(var7.next() as java.lang.String, var2)) {
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
