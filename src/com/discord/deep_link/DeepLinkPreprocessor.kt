package com.discord.deep_link

import android.content.Intent
import android.net.Uri
import kotlin.jvm.internal.r

public class DeepLinkPreprocessor {
   public fun handleAndUpdateIntent(intent: Intent) {
      r.h(var1, "intent");
      if (r.c(var1.getAction(), "android.intent.action.VIEW")) {
         val var4: Uri = var1.getData();
         if (var4 != null) {
            var var2: java.lang.String = var4.getHost();
            val var3: java.util.List = var4.getPathSegments();
            if (r.c(var2, "discordapp.onelink.me")) {
               r.e(var3);
               if (!var3.isEmpty()) {
                  var2 = var4.getQueryParameter("deep_link_value");
                  if (var2 != null) {
                     var1.setData(Uri.parse(var2));
                  }
               }
            }
         }
      }
   }

   public companion object {
      private const val ONELINK_HOST: String
      private const val DEEP_LINK_VALUE_PARAM: String
   }
}
