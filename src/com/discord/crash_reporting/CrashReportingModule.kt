package com.discord.crash_reporting

import B9.s
import com.discord.crash_reporting.react_events.CrashReportEvent
import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason
import com.discord.crash_reporting.system_logs.SystemLogReport
import com.discord.crash_reporting.system_logs.SystemLogUtils
import com.discord.logging.Log
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReactSoftExceptionLogger
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.bridge.ReactSoftExceptionLogger.ReactSoftExceptionListener
import io.sentry.react.RNSentryModule

public class CrashReportingModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   public final val reactContext: ReactApplicationContext

   private final val sentryModule: RNSentryModule
      private final get() {
         val var1: NativeModule = this.getReactApplicationContext().getCatalystInstance().getNativeModule("RNSentry");
         return var1 as RNSentryModule;
      }


   private final val reactEvents: ReactEvents
   private final val reactSoftExceptionListener: <unrepresentable>

   init {
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(s.a("onCrashReportsReceived", CrashReportEvent::class));
      this.reactSoftExceptionListener = new ReactSoftExceptionListener() {
         public void logSoftException(java.lang.String var1, java.lang.Throwable var2) {
            val var5: CrashReporting = CrashReporting.INSTANCE;
            val var3: StringBuilder = new StringBuilder();
            var3.append("SoftException: ");
            var3.append(var1);
            val var6: java.lang.String = var3.toString();
            val var4: java.lang.String = var2.getMessage();
            var var7: java.lang.String = var4;
            if (var4 == null) {
               var7 = "No message";
            }

            var5.addBreadcrumb(
               var6, L.l(new Pair[]{s.a("message", var7), s.a("stacktrace", B9.c.b(var2))}), "react.softexception", CrashReporting.BreadcrumbLevel.ERROR
            );
            Log.INSTANCE.e(var1, "Unhandled SoftException", var2);
         }
      };
   }

   @JvmStatic
   fun `addListener$lambda$0`(
      var0: CrashReportingModule, var1: HistoricalProcessExitReason.Reason, var2: SystemLogUtils.Tombstone, var3: SystemLogReport.SentryCrashData
   ): Unit {
      val var4: ReactEvents = var0.reactEvents;
      val var5: ReactApplicationContext = var0.getReactApplicationContext();
      var4.emitModuleEvent(var5, new CrashReportEvent(java.lang.Boolean.TRUE, var3, var1, var2));
      return Unit.a;
   }

   @ReactMethod
   public fun addListener(type: String) {
      if (CrashReporting.INSTANCE.isCrashedLastRun() == java.lang.Boolean.TRUE) {
         val var3: SystemLogReport = SystemLogReport.INSTANCE;
         val var2: ReactApplicationContext = this.getReactApplicationContext();
         var3.reportLastCrash$crash_reporting_release(var2, new d(this));
      }
   }

   @ReactMethod
   public fun crash() {
      this.getSentryModule().crash();
   }

   @ReactMethod
   public fun getDidCrashDuringPreviousExecution(callback: Callback) {
      val var2: java.lang.Boolean = CrashReporting.INSTANCE.isCrashedLastRun();
      if (var2 != null) {
         var1.invoke(new Object[]{var2});
      }
   }

   @ReactMethod
   public fun getIsUserStaffForCrashReporting(callback: Callback) {
      val var3: CrashReportingCache.Companion = CrashReportingCache.Companion;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      var1.invoke(new Object[]{var3.getInstance(var2).isStaff()});
   }

   public open fun getName(): String {
      return "CrashReportingManager";
   }

   @ReactMethod
   public fun getSystemLog(callback: Callback) {
      val var2: SystemLogUtils = SystemLogUtils.INSTANCE;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      var1.invoke(new Object[]{var2.fetch(var3)});
   }

   @ReactMethod
   public fun initializeManager() {
      val var2: SystemLogUtils = SystemLogUtils.INSTANCE;
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      var2.initSystemLogCapture(var1);
      ReactSoftExceptionLogger.addListener(this.reactSoftExceptionListener);
      r2.a.x(new FLogDelegate());
   }

   public open fun invalidate() {
      super.invalidate();
      ReactSoftExceptionLogger.removeListener(this.reactSoftExceptionListener);
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun setUser(user: ReadableMap) {
      val var2: Boolean = var1.getBoolean("staff");
      val var3: CrashReportingCache.Companion = CrashReportingCache.Companion;
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      var3.getInstance(var4).setStaff(var2);
   }
}
