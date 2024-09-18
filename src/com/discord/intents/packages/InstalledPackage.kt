package com.discord.intents.packages

import jh.a
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q

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
   private EnumEntries $ENTRIES;
   @JvmStatic
   private InstalledPackage[] $VALUES;
   @JvmStatic
   public InstalledPackage.Companion Companion = new InstalledPackage.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<InstalledPackage> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   init {
      this.appName = var3;
      this.appPackage = var4;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun parse(appName: String): InstalledPackage {
         q.h(var1, "appName");
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
            if (q.c(InstalledPackage.access$getAppName$p(var5[var2]), var1)) {
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
