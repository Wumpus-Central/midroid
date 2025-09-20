package com.discord.crash_reporting

import A9.s
import com.discord.crash_reporting.CrashReporting.BreadcrumbLevel
import com.discord.logging.Log

public class FLogDelegate : r2.c {
   private fun addSentryBreadcrumb(level: BreadcrumbLevel, message: String, throwable: Throwable? = null) {
      label11: {
         if (var3 != null) {
            val var4: java.lang.String = A9.c.b(var3);
            var6 = var4;
            if (var4 != null) {
               break label11;
            }
         }

         var6 = "No stacktrace";
      }

      CrashReporting.INSTANCE.addBreadcrumb(var2, L.e(s.a("stacktrace", var6)), "react.native", var1);
   }

   public override fun d(tag: String, msg: String) {
      r2.b.a().d(var1, var2);
   }

   public override fun d(tag: String, msg: String, tr: Throwable) {
      r2.b.a().d(var1, var2, var3);
   }

   public override fun e(tag: String, msg: String) {
      Log.e$default(Log.INSTANCE, var1, var2, null, 4, null);
      addSentryBreadcrumb$default(this, CrashReporting.BreadcrumbLevel.ERROR, var2, null, 4, null);
   }

   public override fun e(tag: String, msg: String, tr: Throwable) {
      Log.INSTANCE.e(var1, var2, var3);
      this.addSentryBreadcrumb(CrashReporting.BreadcrumbLevel.ERROR, var2, var3);
   }

   public open fun getMinimumLoggingLevel(): Int {
      return r2.b.a().b();
   }

   public override fun i(tag: String, msg: String) {
      Log.i$default(Log.INSTANCE, var1, var2, null, 4, null);
   }

   public open fun i(tag: String, msg: String, tr: Throwable) {
      Log.INSTANCE.i(var1, var2, var3);
   }

   public override fun isLoggable(level: Int): Boolean {
      return r2.b.a().isLoggable(var1);
   }

   public open fun log(priority: Int, tag: String, msg: String) {
      switch (var1) {
         case 2:
            this.v(var2, var3);
            break;
         case 3:
            this.d(var2, var3);
            break;
         case 4:
            this.i(var2, var3);
            break;
         case 5:
            this.w(var2, var3);
            break;
         case 6:
            this.e(var2, var3);
            break;
         case 7:
            this.wtf(var2, var3);
            break;
         default:
            this.d(var2, var3);
      }
   }

   public open fun setMinimumLoggingLevel(level: Int) {
      r2.b.a().k(var1);
   }

   public override fun v(tag: String, msg: String) {
      r2.b.a().v(var1, var2);
   }

   public open fun v(tag: String, msg: String, tr: Throwable) {
      r2.b.a().l(var1, var2, var3);
   }

   public override fun w(tag: String, msg: String) {
      Log.w$default(Log.INSTANCE, var1, var2, null, 4, null);
      addSentryBreadcrumb$default(this, CrashReporting.BreadcrumbLevel.WARNING, var2, null, 4, null);
   }

   public override fun w(tag: String, msg: String, tr: Throwable) {
      Log.INSTANCE.w(var1, var2, var3);
      this.addSentryBreadcrumb(CrashReporting.BreadcrumbLevel.WARNING, var2, var3);
   }

   public override fun wtf(tag: String, msg: String) {
      Log.e$default(Log.INSTANCE, var1, var2, null, 4, null);
      addSentryBreadcrumb$default(this, CrashReporting.BreadcrumbLevel.WARNING, var2, null, 4, null);
   }

   public override fun wtf(tag: String, msg: String, tr: Throwable) {
      Log.INSTANCE.e(var1, var2, var3);
      this.addSentryBreadcrumb(CrashReporting.BreadcrumbLevel.ERROR, var2, var3);
   }
}
