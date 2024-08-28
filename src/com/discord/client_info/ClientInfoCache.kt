package com.discord.client_info

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import java.util.UUID
import kotlin.jvm.internal.q

internal object ClientInfoCache {
   private const val DEVICE_VENDOR_ID_KEY: String = "DeviceVendorID"

   private final val cache: SharedPreferences
      private final get() {
         val var2: SharedPreferences = var1.getSharedPreferences("ClientInfoCache", 0);
         q.g(var2, "getSharedPreferences(...)");
         return var2;
      }


   public fun getDeviceVendorId(context: Context): String {
      q.h(var1, "context");
      val var3: java.lang.String = this.getCache(var1).getString("DeviceVendorID", null);
      var var2: java.lang.String = var3;
      if (var3 == null) {
         var2 = UUID.randomUUID().toString();
         q.g(var2, "toString(...)");
         val var4: Editor = INSTANCE.getCache(var1).edit();
         q.g(var4, "editor");
         var4.putString("DeviceVendorID", var2);
         var4.apply();
      }

      return var2;
   }
}
