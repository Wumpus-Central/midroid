package com.discord.image.fresco.config

import J2.d
import android.content.ComponentCallbacks2
import android.content.Context
import android.content.res.Configuration
import kotlin.jvm.internal.q

internal object FrescoMemoryTrimmer {
   public fun initialize(context: Context) {
      q.h(var1, "context");
      var1.registerComponentCallbacks(new ComponentCallbacks2() {
         private final void clearMemoryCaches() {
            d.a().e();
         }

         public void onConfigurationChanged(Configuration var1) {
            q.h(var1, "newConfig");
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
