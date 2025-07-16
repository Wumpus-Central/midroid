package com.discord.js_watchdog

import G9.b
import android.content.Context
import com.discord.crash_reporting.CrashReporting
import com.discord.logging.Log
import com.facebook.react.bridge.Promise
import ib.U
import ib.f
import java.io.File
import java.util.Timer
import java.util.TimerTask
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r
import kotlin.jvm.internal.Ref.BooleanRef
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.Job.a

public object JSWatchdogManager {
   private final lateinit var storage: JSWatchdogStorage
   private final lateinit var cacheDir: File
   private final var enabled: Boolean
   private final var recentPingTS: Long?
   private final var previousPingTS: Long?
   private final var freezeTimer: TimerTask?
   private final var pingCoroutineJob: Job?

   private fun cancelExistingJobs() {
      if (pingCoroutineJob != null) {
         a.a(pingCoroutineJob, null, 1, null);
      }

      pingCoroutineJob = null;
      if (freezeTimer != null) {
         freezeTimer.cancel();
      }

      freezeTimer = null;
   }

   private fun saveStallReport(stallTime: Int, sessionId: String, enableTrace: Boolean) {
      if (storage != null) {
         var var5: JSWatchdogStorage;
         var var9: java.lang.String;
         label40: {
            var5 = null;
            if (var3) {
               var var4: JSWatchdogStorage = storage;
               if (storage == null) {
                  r.y("storage");
                  var4 = null;
               }

               var9 = var4.getTrace();
               if (var9 == null || var9.length() == 0) {
                  var var10: File = cacheDir;
                  if (cacheDir == null) {
                     r.y("cacheDir");
                     var10 = null;
                  }

                  var9 = HermesSamplingProfilerUtil.INSTANCE.findSampleTrace(var10);
                  break label40;
               }
            }

            var9 = null;
         }

         if (storage == null) {
            r.y("storage");
         } else {
            var5 = storage;
         }

         var5.update(var1, var2, var9);
      }
   }

   private fun updateStallTime(sentTimestamp: Long, sessionId: String, enableTrace: Boolean) {
      var1 = System.currentTimeMillis() - var1 - 500;
      val var6: Log = Log.INSTANCE;
      val var5: StringBuilder = new StringBuilder();
      var5.append("updateStallTime: ");
      var5.append(var1);
      Log.i$default(var6, "JSWatchdogManager", var5.toString(), null, 4, null);
      this.saveStallReport((int)var1, var3, var4);
   }

   public fun checkForExistingReport(): StallReport? {
      var var1: StallReport = null;
      if (storage != null) {
         var var3: JSWatchdogStorage = storage;
         if (storage == null) {
            r.y("storage");
            var3 = null;
         }

         var1 = var3.getStallReportAndClear();
      }

      return var1;
   }

   public fun disable() {
      enabled = false;
      this.cancelExistingJobs();
      Log.i$default(Log.INSTANCE, "JSWatchdogManager", "JS Watchdog disabled.", null, 4, null);
   }

   public fun enable() {
      enabled = true;
      Log.i$default(Log.INSTANCE, "JSWatchdogManager", "JS Watchdog enabled.", null, 4, null);
   }

   public fun initialize(context: Context) {
      label13: {
         r.h(var1, "context");
         synchronized (this){} // $VF: monitorenter 

         try {
            storage = JSWatchdogStorage.Companion.getInstance(var1);
            cacheDir = var1.getCacheDir();
         } catch (var2: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public fun ping(resetTimestamps: Boolean, sentTimestamp: Long, sessionId: String, enableTrace: Boolean, promise: Promise) {
      r.h(var4, "sessionId");
      r.h(var6, "promise");
      this.cancelExistingJobs();
      pingCoroutineJob = f.d(
         U.j,
         null,
         null,
         new Function2(var1, var2, var6, var4, var5, null) {
            final boolean $enableTrace;
            final Promise $promise;
            final boolean $resetTimestamps;
            final long $sentTimestamp;
            final java.lang.String $sessionId;
            int label;

            {
               super(2, var7);
               this.$resetTimestamps = var1;
               this.$sentTimestamp = var2x;
               this.$promise = var4;
               this.$sessionId = var5;
               this.$enableTrace = var6;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.$resetTimestamps, this.$sentTimestamp, this.$promise, this.$sessionId, this.$enableTrace, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            public final Object invokeSuspend(Object var1) {
               b.e();
               if (this.label == 0) {
                  c.b(var1);

                  try {
                     var1 = new BooleanRef();
                     if (this.$resetTimestamps) {
                        JSWatchdogManager.access$setRecentPingTS$p(null);
                        JSWatchdogManager.access$setPreviousPingTS$p(null);
                     }
                  } catch (var13: Exception) {
                     CrashReporting.INSTANCE.captureMessage("Failed to process JSWatchdog ping", var13);
                     this.$promise.reject(var13);
                     return Unit.a;
                  }

                  var var6: java.lang.Long;
                  try {
                     JSWatchdogManager.access$setPreviousPingTS$p(JSWatchdogManager.access$getRecentPingTS$p());
                     JSWatchdogManager.access$setRecentPingTS$p(kotlin.coroutines.jvm.internal.b.e(this.$sentTimestamp));
                     var6 = JSWatchdogManager.access$getPreviousPingTS$p();
                  } catch (var12: Exception) {
                     CrashReporting.INSTANCE.captureMessage("Failed to process JSWatchdog ping", var12);
                     this.$promise.reject(var12);
                     return Unit.a;
                  }

                  if (var6 != null) {
                     var var2x: Boolean;
                     var var5: java.lang.String;
                     var var16: Long;
                     try {
                        var5 = this.$sessionId;
                        var2x = this.$enableTrace;
                        var16 = this.$sentTimestamp - var6.longValue() - 500;
                     } catch (var11: Exception) {
                        CrashReporting.INSTANCE.captureMessage("Failed to process JSWatchdog ping", var11);
                        this.$promise.reject(var11);
                        return Unit.a;
                     }

                     if (var16 > 1000L) {
                        try {
                           val var7: Log = Log.INSTANCE;
                           val var19: StringBuilder = new StringBuilder();
                           var19.append("Exceeded JS stall threshold [based on previous ping]: ");
                           var19.append(var16);
                           Log.i$default(var7, "JSWatchdogManager", var19.toString(), null, 4, null);
                           var1.j = true;
                           JSWatchdogManager.access$saveStallReport(JSWatchdogManager.INSTANCE, (int)var16, var5, var2x);
                        } catch (var10: Exception) {
                           CrashReporting.INSTANCE.captureMessage("Failed to process JSWatchdog ping", var10);
                           this.$promise.reject(var10);
                           return Unit.a;
                        }
                     }
                  }

                  try {
                     if (JSWatchdogManager.access$getEnabled$p()) {
                        val var20: Timer = new Timer();
                        val var21: TimerTask = new TimerTask(this.$sentTimestamp, this.$sessionId, this.$enableTrace) {
                           final boolean $enableTrace$inlined;
                           final long $sentTimestamp$inlined;
                           final java.lang.String $sessionId$inlined;

                           {
                              this.$sentTimestamp$inlined = var1;
                              this.$sessionId$inlined = var3;
                              this.$enableTrace$inlined = var4;
                           }

                           @Override
                           public void run() {
                              JSWatchdogManager.access$updateStallTime(
                                 JSWatchdogManager.INSTANCE, this.$sentTimestamp$inlined, this.$sessionId$inlined, this.$enableTrace$inlined
                              );
                           }
                        };
                        var20.scheduleAtFixedRate(var21, 1500L, 1000L);
                        JSWatchdogManager.access$setFreezeTimer$p(var21);
                     }
                  } catch (var9: Exception) {
                     CrashReporting.INSTANCE.captureMessage("Failed to process JSWatchdog ping", var9);
                     this.$promise.reject(var9);
                     return Unit.a;
                  }

                  try {
                     this.$promise.resolve(kotlin.coroutines.jvm.internal.b.a(var1.j));
                  } catch (var8: Exception) {
                     CrashReporting.INSTANCE.captureMessage("Failed to process JSWatchdog ping", var8);
                     this.$promise.reject(var8);
                  }

                  return Unit.a;
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         },
         3,
         null
      );
   }
}
