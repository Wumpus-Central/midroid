package com.discord.image.fresco.config

import android.app.ActivityManager
import android.app.ActivityManager.MemoryInfo
import android.content.ComponentCallbacks2
import android.content.Context
import android.content.res.Configuration
import fm.c
import l8.d

internal object FrescoMemoryTrimmer {
   public fun initialize(context: Context) {
      var1.registerComponentCallbacks(new ComponentCallbacks2(var1) {
         private final ActivityManager activityManager;
         private final MemoryInfo memoryInfo;

         {
            this.activityManager = var1.getSystemService(ActivityManager.class) as ActivityManager;
            this.memoryInfo = new MemoryInfo();
         }

         private final void clearMemoryCaches() {
            d.a().e();
         }

         private final boolean getMemoryIsLow() {
            this.activityManager.getMemoryInfo(this.memoryInfo);
            return this.memoryInfo.lowMemory;
         }

         public void onConfigurationChanged(Configuration var1) {
         }

         @c
         public void onLowMemory() {
            this.clearMemoryCaches();
         }

         public void onTrimMemory(int var1) {
            if ((var1 == 20 || var1 == 40) && this.getMemoryIsLow()) {
               this.clearMemoryCaches();
            }

            if (var1 == 5 || var1 == 10 || var1 == 15 || var1 == 60 || var1 == 80) {
               this.clearMemoryCaches();
            }
         }
      });
   }
}
