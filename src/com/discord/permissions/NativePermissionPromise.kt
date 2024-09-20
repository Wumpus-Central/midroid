package com.discord.permissions

import com.discord.crash_reporting.CrashReporting
import com.facebook.react.bridge.PromiseImpl
import java.util.Locale
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

public object NativePermissionPromise {
   @JvmStatic
   fun `generate$lambda$0`(var0: Function0, var1: Function0, var2: Any) {
      q.h(var0, "$onAuthorized");
      q.h(var1, "$onRejected");
      q.h(var2, "result");
      var var3: Any;
      if (var2 is Array<Any>) {
         var3 = (StringBuilder)(var2 as Array<Any>)[0];
      } else {
         var3 = (StringBuilder)var2;
      }

      if (var3 is java.lang.String) {
         var3 = var3 as java.lang.String;
      } else {
         var3 = null;
      }

      val var4: java.lang.String = "AUTHORIZED".toLowerCase(Locale.ROOT);
      q.g(var4, "toLowerCase(...)");
      if (q.c(var3, var4)) {
         var0.invoke();
      } else {
         val var5: CrashReporting = CrashReporting.INSTANCE;
         var3 = new StringBuilder();
         var3.append("NativePermissionPromise: Unknown Result: ");
         var3.append(var2);
         CrashReporting.addBreadcrumb$default(var5, var3.toString(), null, null, 6, null);
         var1.invoke();
      }
   }

   @JvmStatic
   fun `generate$lambda$1`(var0: Function0, var1: Array<Any>) {
      q.h(var0, "$onRejected");
      val var2: CrashReporting = CrashReporting.INSTANCE;
      val var3: StringBuilder = new StringBuilder();
      var3.append("NativePermissionPromise: Rejection: ");
      var3.append(var1);
      CrashReporting.addBreadcrumb$default(var2, var3.toString(), null, null, 6, null);
      var0.invoke();
   }

   public fun generate(onAuthorized: () -> Unit, onRejected: () -> Unit): PromiseImpl {
      q.h(var1, "onAuthorized");
      q.h(var2, "onRejected");
      return new PromiseImpl(new a(var1, var2), new b(var2));
   }
}
