package com.discord.intents.packages

import kotlin.jvm.internal.r

internal enum class InstalledPackage(appName: String, appPackage: String?) {
   GMAIL("googlegmail", null),
   LINE("line", "jp.naver.line.android"),
   MESSENGER("fb-messenger", "com.facebook.orca"),
   TELEGRAM("tg", "org.telegram.messenger"),
   TWITTER("twitter", "com.twitter.android"),
   WHATSAPP("whatsapp", "com.whatsapp")
   private final val appName: String
   public final val appPackage: String?
   @JvmStatic
   private InstalledPackage[] $VALUES = $values();
   @JvmStatic
   public InstalledPackage.Companion Companion = new InstalledPackage.Companion(null);

   init {
      this.appName = var3;
      this.appPackage = var4;
   }

   public companion object {
      public fun parse(appName: String): InstalledPackage {
         r.h(var1, "appName");
         val var5: Array<InstalledPackage> = InstalledPackage.values();
         val var3: Int = var5.length;
         var var2: Int = 0;

         var var4: InstalledPackage;
         while (true) {
            if (var2 >= var3) {
               var4 = null;
               break;
            }

            var4 = var5[var2];
            if (r.c(InstalledPackage.access$getAppName$p(var5[var2]), var1)) {
               break;
            }

            var2++;
         }

         if (var4 != null) {
            return var4;
         } else {
            val var6: StringBuilder = new StringBuilder();
            var6.append("Unknown app name ");
            var6.append(var1);
            throw new IllegalArgumentException(var6.toString());
         }
      }
   }
}
