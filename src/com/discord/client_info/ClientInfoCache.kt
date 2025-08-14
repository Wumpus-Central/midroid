package com.discord.client_info

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import java.util.UUID
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nClientInfoCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientInfoCache.kt\ncom/discord/client_info/ClientInfoCache\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,35:1\n41#2,12:36\n*S KotlinDebug\n*F\n+ 1 ClientInfoCache.kt\ncom/discord/client_info/ClientInfoCache\n*L\n26#1:36,12\n*E\n"])
internal object ClientInfoCache {
   private const val DEVICE_VENDOR_ID_KEY: String = "DeviceVendorID"

   private final val cache: SharedPreferences
      private final get() {
         val var2: SharedPreferences = var1.getSharedPreferences("ClientInfoCache", 0);
         return var2;
      }


   public fun getDeviceVendorId(context: Context): String {
      val var3: java.lang.String = this.getCache(var1).getString("DeviceVendorID", null);
      var var2: java.lang.String = var3;
      if (var3 == null) {
         var2 = UUID.randomUUID().toString();
         val var4: Editor = INSTANCE.getCache(var1).edit();
         var4.putString("DeviceVendorID", var2);
         var4.apply();
      }

      return var2;
   }
}
