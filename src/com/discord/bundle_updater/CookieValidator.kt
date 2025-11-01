package com.discord.bundle_updater

import java.net.URLDecoder
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import okhttp3.Cookie
import okio.ByteString
import xu.n

@SourceDebugExtension(["SMAP\nCookieValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieValidator.kt\ncom/discord/bundle_updater/CookieValidator\n+ 2 Json.kt\nkotlinx/serialization/json/JsonKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n212#2:107\n212#2:119\n487#3,7:108\n462#3:115\n412#3:116\n1246#4,2:117\n1249#4:120\n1755#4,3:121\n*S KotlinDebug\n*F\n+ 1 CookieValidator.kt\ncom/discord/bundle_updater/CookieValidator\n*L\n84#1:107\n87#1:119\n86#1:108,7\n87#1:115\n87#1:116\n87#1:117,2\n87#1:120\n96#1:121,3\n*E\n"])
public object CookieValidator {
   public fun parseBuildOverrideCookie(buildOverrideCookie: Cookie?): BuildOverrideCookieContents? {
      if (var1 == null) {
         return null;
      } else {
         val var8: java.lang.String = CollectionsKt.q0(StringsKt.split$default(var1.i(), new java.lang.String[]{"."}, false, 0, 6, null), 1) as java.lang.String;
         if (var8 == null) {
            return null;
         } else {
            var var2: java.lang.String = URLDecoder.decode(var8, "UTF-8");
            val var9: okio.ByteString.a = ByteString.t;
            val var10: ByteString = var9.b(var2);
            if (var10 != null) {
               var2 = var10.N();
               if (var2 != null) {
                  try {
                     var11 = Json.d;
                     var14 = Json.d.g(var2);
                  } catch (var7: n) {
                     return null;
                  }

                  var var3: JsonElement = bv.h.n(var14).get("$meta") as JsonElement;
                  if (var3 == null) {
                     return null;
                  }

                  var11.a();
                  val var12: BuildOverrideCookieMeta = var11.d(BuildOverrideCookieMeta.Companion.serializer(), var3) as BuildOverrideCookieMeta;
                  val var15: JsonObject = bv.h.n(var14);
                  val var18: LinkedHashMap = new LinkedHashMap();

                  for (Entry var16 : var15.entrySet()) {
                     if (!(var16.getKey() as java.lang.String == "$meta")) {
                        var18.put(var16.getKey(), var16.getValue());
                     }
                  }

                  val var17: LinkedHashMap = new LinkedHashMap(s0.e(var18.size()));

                  for (Entry var5 : var18.entrySet()) {
                     var3 = (JsonElement)var5.getKey();
                     val var6: JsonElement = var5.getValue() as JsonElement;
                     val var21: kotlinx.serialization.json.Json.a = Json.d;
                     Json.d.a();
                     var17.put(var3, var21.d(BuildOverrideCookieBuild.Companion.serializer(), var6) as BuildOverrideCookieBuild);
                  }

                  return new BuildOverrideCookieContents(var12, var17);
               }
            }

            return null;
         }
      }
   }

   public fun validateBuildOverrideCookie(buildOverrideCookie: Cookie?, version: String): Boolean {
      val var3: BuildOverrideCookieContents = this.parseBuildOverrideCookie(var1);
      if (var3 == null) {
         return false;
      } else {
         val var4: java.util.List = var3.getMeta().getAllowedVersions();
         if (var4 == null) {
            return false;
         } else {
            val var5: java.lang.Iterable = var4;
            if (var4 is java.util.Collection && (var4 as java.util.Collection).isEmpty()) {
               return false;
            } else {
               val var6: java.util.Iterator = var5.iterator();

               while (var6.hasNext()) {
                  if (var6.next() as java.lang.String == var2) {
                     return true;
                  }
               }

               return false;
            }
         }
      }
   }
}
