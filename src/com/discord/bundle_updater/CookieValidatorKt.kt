package com.discord.bundle_updater

import android.webkit.CookieManager
import java.util.ArrayList
import kotlin.jvm.internal.r
import okhttp3.Cookie
import okhttp3.HttpUrl

public fun CookieManager.getCookiesForUrl(url: String): List<Cookie> {
   r.h(var0, "<this>");
   r.h(var1, "url");
   val var4: java.lang.String = var0.getCookie(var1);
   if (var4 == null) {
      return h.i();
   } else {
      val var2: java.util.List = f.A0(var4, new java.lang.String[]{"; "}, false, 0, 6, null);
      val var5: ArrayList = new ArrayList();

      for (java.lang.String var3 : var2) {
         val var7: Cookie = Cookie.n.c(HttpUrl.l.d(var1), var3);
         if (var7 != null) {
            var5.add(var7);
         }
      }

      return var5;
   }
}
