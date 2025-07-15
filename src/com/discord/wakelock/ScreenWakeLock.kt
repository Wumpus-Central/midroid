package com.discord.wakelock

import android.app.Activity
import com.discord.misc.utilities.threading.ThreadUtilsKt
import java.util.LinkedHashSet
import kotlin.jvm.internal.r

public object ScreenWakeLock {
   private final var keys: MutableSet<String> = new LinkedHashSet()

   public fun releaseLock(activity: Activity, key: String) {
      r.h(var1, "activity");
      r.h(var2, "key");
      if (ThreadUtilsKt.isOnMainThread()) {
         access$getKeys$p().remove(var2);
         if (access$getKeys$p().isEmpty()) {
            var1.getWindow().clearFlags(128);
         }
      } else {
         ThreadUtilsKt.getUiHandler().post(new Runnable(var2, var1) {
            final Activity $activity$inlined;
            final java.lang.String $key$inlined;

            {
               this.$key$inlined = var1;
               this.$activity$inlined = var2;
            }

            @Override
            public final void run() {
               ScreenWakeLock.access$getKeys$p().remove(this.$key$inlined);
               if (ScreenWakeLock.access$getKeys$p().isEmpty()) {
                  this.$activity$inlined.getWindow().clearFlags(128);
               }
            }
         });
      }
   }

   public fun requestLock(activity: Activity, key: String) {
      r.h(var1, "activity");
      r.h(var2, "key");
      if (ThreadUtilsKt.isOnMainThread()) {
         if (access$getKeys$p().add(var2)) {
            var1.getWindow().addFlags(128);
         }
      } else {
         ThreadUtilsKt.getUiHandler().post(new Runnable(var2, var1) {
            final Activity $activity$inlined;
            final java.lang.String $key$inlined;

            {
               this.$key$inlined = var1;
               this.$activity$inlined = var2;
            }

            @Override
            public final void run() {
               if (ScreenWakeLock.access$getKeys$p().add(this.$key$inlined)) {
                  this.$activity$inlined.getWindow().addFlags(128);
               }
            }
         });
      }
   }
}
