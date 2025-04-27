package com.discord.image.fresco.config

import V1.c
import android.content.ComponentCallbacks2
import android.content.Context
import android.content.res.Configuration
import kotlin.jvm.internal.q

internal object FrescoMemoryTrimmer {
   public fun initialize(context: Context) {
      q.h(var1, "context");
      var1.registerComponentCallbacks(new ComponentCallbacks2() {
         private final void clearMemoryCaches() {
            c.a().e();
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
