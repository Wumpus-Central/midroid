package com.discord.crash_reporting

import com.discord.crash_reporting.react_events.CrashReportEvent
import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason
import com.discord.crash_reporting.system_logs.SystemLogReport
import com.discord.crash_reporting.system_logs.SystemLogUtils
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableMap
import io.sentry.react.RNSentryModule
import kh.w
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

public class CrashReportingModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   public final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents

   private final val sentryModule: RNSentryModule
      private final get() {
         val var1: NativeModule = this.getReactApplicationContext().getCatalystInstance().getNativeModule("RNSentry");
         q.f(var1, "null cannot be cast to non-null type io.sentry.react.RNSentryModule");
         return var1 as RNSentryModule;
      }


   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(w.a("onCrashReportsReceived", g0.b(CrashReportEvent.class)));
   }

   @ReactMethod
   public fun addListener(type: String) {
      q.h(var1, "type");
      if (q.c(CrashReporting.INSTANCE.isCrashedLastRun(), java.lang.Boolean.TRUE)) {
         val var2: SystemLogReport = SystemLogReport.INSTANCE;
         val var3: ReactApplicationContext = this.getReactApplicationContext();
         q.g(var3, "getReactApplicationContext(...)");
         var2.reportLastCrash$crash_reporting_release(var3, new Function2(this) {
            final CrashReportingModule this$0;

            {
               super(2);
               this.this$0 = var1;
            }

            public final void invoke(HistoricalProcessExitReason.Reason var1, SystemLogUtils.Tombstone var2) {
               val var3: ReactEvents = CrashReportingModule.access$getReactEvents$p(this.this$0);
               val var4: ReactApplicationContext = CrashReportingModule.access$getReactApplicationContext(this.this$0);
               q.g(var4, "access$getReactApplicationContext(...)");
               var3.emitModuleEvent(var4, new CrashReportEvent(java.lang.Boolean.TRUE, var1, var2));
            }
         });
      }
   }

   @ReactMethod
   public fun crash() {
      this.getSentryModule().crash();
   }

   @ReactMethod
   public fun getDidCrashDuringPreviousExecution(callback: Callback) {
      q.h(var1, "callback");
      val var2: java.lang.Boolean = CrashReporting.INSTANCE.isCrashedLastRun();
      if (var2 != null) {
         var1.invoke(new Object[]{var2});
      }
   }

   @ReactMethod
   public fun getIsUserStaffForCrashReporting(callback: Callback) {
      q.h(var1, "callback");
      val var2: CrashReportingCache.Companion = CrashReportingCache.Companion;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var3, "getReactApplicationContext(...)");
      var1.invoke(new Object[]{var2.getInstance(var3).isStaff()});
   }

   public open fun getName(): String {
      return "CrashReportingManager";
   }

   @ReactMethod
   public fun getSystemLog(callback: Callback) {
      q.h(var1, "callback");
      val var2: SystemLogUtils = SystemLogUtils.INSTANCE;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var3, "getReactApplicationContext(...)");
      var1.invoke(new Object[]{var2.fetch(var3)});
   }

   @ReactMethod
   public fun initializeManager() {
      val var1: SystemLogUtils = SystemLogUtils.INSTANCE;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      var1.initSystemLogCapture(var2);
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun setUser(user: ReadableMap) {
      q.h(var1, "user");
      val var2: Boolean = var1.getBoolean("staff");
      val var4: CrashReportingCache.Companion = CrashReportingCache.Companion;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var3, "getReactApplicationContext(...)");
      var4.getInstance(var3).setStaff(var2);
   }
}
