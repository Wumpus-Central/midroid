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
import eh.w
import io.sentry.react.RNSentryModule
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r

public class CrashReportingModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   public final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents

   private final val sentryModule: RNSentryModule
      private final get() {
         val var1: NativeModule = this.getReactApplicationContext().getNativeModule(RNSentryModule.class);
         r.e(var1);
         return var1 as RNSentryModule;
      }


   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(new Pair[]{w.a("onCrashReportsReceived", h0.b(CrashReportEvent.class))});
   }

   @ReactMethod
   public fun addListener(type: String) {
      r.h(var1, "type");
      if (r.c(CrashReporting.INSTANCE.isCrashedLastRun(), java.lang.Boolean.TRUE)) {
         val var2: SystemLogReport = SystemLogReport.INSTANCE;
         val var3: ReactApplicationContext = this.getReactApplicationContext();
         r.g(var3, "reactApplicationContext");
         var2.reportLastCrash$crash_reporting_release(var3, new Function2<HistoricalProcessExitReason.Reason, SystemLogUtils.Tombstone, Unit>(this) {
            final CrashReportingModule this$0;

            {
               super(2);
               this.this$0 = var1;
            }

            public final void invoke(HistoricalProcessExitReason.Reason var1, SystemLogUtils.Tombstone var2) {
               val var4: ReactEvents = CrashReportingModule.access$getReactEvents$p(this.this$0);
               val var3: ReactApplicationContext = CrashReportingModule.access$getReactApplicationContext(this.this$0);
               r.g(var3, "reactApplicationContext");
               var4.emitModuleEvent(var3, new CrashReportEvent(java.lang.Boolean.TRUE, var1, var2));
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
      r.h(var1, "callback");
      val var2: java.lang.Boolean = CrashReporting.INSTANCE.isCrashedLastRun();
      if (var2 != null) {
         var1.invoke(new Object[]{var2});
      }
   }

   @ReactMethod
   public fun getIsUserStaffForCrashReporting(callback: Callback) {
      r.h(var1, "callback");
      val var3: CrashReportingCache.Companion = CrashReportingCache.Companion;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "reactApplicationContext");
      var1.invoke(new Object[]{var3.getInstance(var2).isStaff()});
   }

   public open fun getName(): String {
      return "CrashReportingManager";
   }

   @ReactMethod
   public fun getSystemLog(callback: Callback) {
      r.h(var1, "callback");
      val var3: SystemLogUtils = SystemLogUtils.INSTANCE;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "reactApplicationContext");
      var1.invoke(new Object[]{var3.fetch(var2)});
   }

   @ReactMethod
   public fun initializeManager() {
      val var2: SystemLogUtils = SystemLogUtils.INSTANCE;
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var1, "reactApplicationContext");
      var2.initSystemLogCapture(var1);
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun setUser(user: ReadableMap) {
      r.h(var1, "user");
      val var2: Boolean = var1.getBoolean("staff");
      val var3: CrashReportingCache.Companion = CrashReportingCache.Companion;
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var4, "reactApplicationContext");
      var3.getInstance(var4).setStaff(var2);
   }
}
