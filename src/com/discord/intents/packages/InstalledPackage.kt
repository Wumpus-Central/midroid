package com.discord.intents.packages

import Y8.a
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
         val var3: java.util.Iterator = InstalledPackage.getEntries().iterator();

         var var2: Any;
         do {
            if (!var3.hasNext()) {
               var2 = null;
               break;
            }

            var2 = (InstalledPackage)var3.next();
         } while (!q.c(InstalledPackage.access$getAppName$p(var2), var1));

         var2 = var2;
         if (var2 != null) {
            return var2;
         } else {
            val var5: StringBuilder = new StringBuilder();
            var5.append("Unknown app name ");
            var5.append(var1);
            throw new IllegalArgumentException(var5.toString());
         }
      }
   }
}
