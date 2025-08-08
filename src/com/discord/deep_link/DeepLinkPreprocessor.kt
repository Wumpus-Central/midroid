package com.discord.deep_link

import android.content.Intent
import android.net.Uri
import kotlin.jvm.internal.r

public class DeepLinkPreprocessor {
   public fun handleAndUpdateIntent(intent: Intent) {
      r.h(var1, "intent");
      if (r.c(var1.getAction(), "android.intent.action.VIEW")) {
         val var2: Uri = var1.getData();
         if (var2 != null) {
            val var3: java.lang.String = var2.getHost();
            val var4: java.util.List = var2.getPathSegments();
            if (r.c(var3, "discordapp.onelink.me")) {
               r.e(var4);
               if (!var4.isEmpty()) {
                  val var5: java.lang.String = var2.getQueryParameter("deep_link_value");
                  if (var5 != null) {
                     var1.setData(Uri.parse(var5));
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
