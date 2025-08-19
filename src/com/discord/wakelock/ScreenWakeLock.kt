package com.discord.wakelock

import android.app.Activity
import com.discord.misc.utilities.threading.ThreadUtilsKt
import java.util.LinkedHashSet
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nScreenWakeLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenWakeLock.kt\ncom/discord/wakelock/ScreenWakeLock\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n*L\n1#1,30:1\n22#2,8:31\n22#2,8:39\n*S KotlinDebug\n*F\n+ 1 ScreenWakeLock.kt\ncom/discord/wakelock/ScreenWakeLock\n*L\n13#1:31,8\n22#1:39,8\n*E\n"])
public object ScreenWakeLock {
   private final var keys: MutableSet<String> = new LinkedHashSet()

   public fun releaseLock(activity: Activity, key: String) {
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
