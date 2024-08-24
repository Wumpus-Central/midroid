package com.discord.wakelock

import android.app.Activity
import com.discord.misc.utilities.threading.ThreadUtilsKt
import java.util.LinkedHashSet
import kotlin.jvm.internal.r

public object ScreenWakeLock {
   public final var keys: MutableSet<String> = new LinkedHashSet()
      internal set

   public fun releaseLock(activity: Activity, key: String) {
      r.h(var1, "activity");
      r.h(var2, "key");
      if (ThreadUtilsKt.isOnMainThread()) {
         val var3: ScreenWakeLock = INSTANCE;
         INSTANCE.getKeys().remove(var2);
         if (var3.getKeys().isEmpty()) {
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
               val var1: ScreenWakeLock = ScreenWakeLock.INSTANCE;
               ScreenWakeLock.INSTANCE.getKeys().remove(this.$key$inlined);
               if (var1.getKeys().isEmpty()) {
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
         if (INSTANCE.getKeys().add(var2)) {
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
               if (ScreenWakeLock.INSTANCE.getKeys().add(this.$key$inlined)) {
                  this.$activity$inlined.getWindow().addFlags(128);
               }
            }
         });
      }
   }
}
