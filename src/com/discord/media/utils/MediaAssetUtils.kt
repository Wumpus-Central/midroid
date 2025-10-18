package com.discord.media.utils

import android.webkit.URLUtil

public object MediaAssetUtils {
   public fun guessFileName(uri: String, contentType: String?): String {
      val var3: java.lang.String = CollectionsKt.t0(StringsKt.split$default(var1, new java.lang.String[]{"/"}, false, 0, 6, null)) as java.lang.String;
      val var4: StringBuilder = new StringBuilder();
      var4.append("https://fake-website.com/");
      var4.append(var3);
      var1 = URLUtil.guessFileName(var4.toString(), null, var2);
      return var1;
   }
}
