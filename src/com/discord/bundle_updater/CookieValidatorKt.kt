@file:SourceDebugExtension(["SMAP\nCookieValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieValidator.kt\ncom/discord/bundle_updater/CookieValidatorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1611#2,9:107\n1863#2:116\n1864#2:118\n1620#2:119\n1#3:117\n*S KotlinDebug\n*F\n+ 1 CookieValidator.kt\ncom/discord/bundle_updater/CookieValidatorKt\n*L\n102#1:107,9\n102#1:116\n102#1:118\n102#1:119\n102#1:117\n*E\n"])

package com.discord.bundle_updater

import android.webkit.CookieManager
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension
import okhttp3.Cookie
import okhttp3.HttpUrl

public fun CookieManager.getCookiesForUrl(url: String): List<Cookie> {
   val var4: java.lang.String = var0.getCookie(var1);
   if (var4 == null) {
      return CollectionsKt.l();
   } else {
      val var2: java.lang.Iterable = StringsKt.split$default(var4, new java.lang.String[]{"; "}, false, 0, 6, null);
      val var5: ArrayList = new ArrayList();

      for (java.lang.String var3 : var2) {
         val var7: Cookie = Cookie.j.c(HttpUrl.k.d(var1), var3);
         if (var7 != null) {
            var5.add(var7);
         }
      }

      return var5;
   }
}
