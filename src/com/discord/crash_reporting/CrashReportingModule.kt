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
import e9.s
import io.sentry.react.RNSentryModule
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q

public class CrashReportingModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   public final val reactContext: ReactApplicationContext

   private final val sentryModule: RNSentryModule
      private final get() {
         val var1: NativeModule = this.getReactApplicationContext().getCatalystInstance().getNativeModule("RNSentry");
         q.f(var1, "null cannot be cast to non-null type io.sentry.react.RNSentryModule");
         return var1 as RNSentryModule;
      }


   private final val reactEvents: ReactEvents

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(s.a("onCrashReportsReceived", G.b(CrashReportEvent.class)));
   }

   @JvmStatic
   fun `addListener$lambda$0`(
      var0: CrashReportingModule, var1: HistoricalProcessExitReason.Reason, var2: SystemLogUtils.Tombstone, var3: SystemLogReport.SentryCrashData
   ): Unit {
      val var4: ReactEvents = var0.reactEvents;
      val var5: ReactApplicationContext = var0.getReactApplicationContext();
      q.g(var5, "getReactApplicationContext(...)");
      var4.emitModuleEvent(var5, new CrashReportEvent(java.lang.Boolean.TRUE, var3, var1, var2));
      return Unit.a;
   }

   @ReactMethod
   public fun addListener(type: String) {
      q.h(var1, "type");
      if (q.c(CrashReporting.INSTANCE.isCrashedLastRun(), java.lang.Boolean.TRUE)) {
         val var3: SystemLogReport = SystemLogReport.INSTANCE;
         val var2: ReactApplicationContext = this.getReactApplicationContext();
         q.g(var2, "getReactApplicationContext(...)");
         var3.reportLastCrash$crash_reporting_release(var2, new d(this));
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
      val var3: CrashReportingCache.Companion = CrashReportingCache.Companion;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      var1.invoke(new Object[]{var3.getInstance(var2).isStaff()});
   }

   public open fun getName(): String {
      return "CrashReportingManager";
   }

   @ReactMethod
   public fun getSystemLog(callback: Callback) {
      q.h(var1, "callback");
      val var3: SystemLogUtils = SystemLogUtils.INSTANCE;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      var1.invoke(new Object[]{var3.fetch(var2)});
   }

   @ReactMethod
   public fun initializeManager() {
      val var2: SystemLogUtils = SystemLogUtils.INSTANCE;
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var1, "getReactApplicationContext(...)");
      var2.initSystemLogCapture(var1);
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
