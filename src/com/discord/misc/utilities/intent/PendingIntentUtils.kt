package com.discord.misc.utilities.intent

import android.os.Build.VERSION

public object PendingIntentUtils {
   public fun immutablePendingIntentFlag(flags: Int = 134217728): Int {
      return var1 or 67108864;
   }

   public fun mutablePendingIntentFlag(flags: Int = 134217728): Int {
      var var2: Int = var1;
      if (VERSION.SDK_INT >= 31) {
         var2 = var1 or 33554432;
      }

      return var2;
   }
}
