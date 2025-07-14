package com.discord.image.fresco.config

import H2.d
import android.content.ComponentCallbacks2
import android.content.Context
import android.content.res.Configuration
import kotlin.jvm.internal.r

internal object FrescoMemoryTrimmer {
   public fun initialize(context: Context) {
      r.h(var1, "context");
      var1.registerComponentCallbacks(new ComponentCallbacks2() {
         private final void clearMemoryCaches() {
            d.a().e();
         }

         public void onConfigurationChanged(Configuration var1) {
            r.h(var1, "newConfig");
         }

         public void onLowMemory() {
            this.clearMemoryCaches();
         }

         public void onTrimMemory(int var1) {
            if (var1 == 40) {
               this.clearMemoryCaches();
            }
         }
      });
   }
}
