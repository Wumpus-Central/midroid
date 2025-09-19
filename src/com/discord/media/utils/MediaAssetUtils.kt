package com.discord.media.utils

import android.webkit.URLUtil

public object MediaAssetUtils {
   public fun guessFileName(uri: String, contentType: String?): String {
      var1 = CollectionsKt.r0(StringsKt.split$default(var1, new java.lang.String[]{"/"}, false, 0, 6, null)) as java.lang.String;
      val var3: StringBuilder = new StringBuilder();
      var3.append("https://fake-website.com/");
      var3.append(var1);
      var1 = URLUtil.guessFileName(var3.toString(), null, var2);
      return var1;
   }
}
