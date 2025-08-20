package com.discord.foreground_service.utils

import android.content.Context

public object MediaProjectionConsent {
   private const val PREFS_NAME: String = "ForegroundServiceGrants"
   private const val KEY_MEDIA_PROJECTION_GRANTED: String = "mediaProjectionGranted"

   public fun isGranted(context: Context): Boolean {
      return var1.getSharedPreferences("ForegroundServiceGrants", 0).getBoolean("mediaProjectionGranted", false);
   }
}
