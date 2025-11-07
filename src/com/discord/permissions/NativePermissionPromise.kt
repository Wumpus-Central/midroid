package com.discord.permissions

import com.discord.crash_reporting.CrashReporting
import com.facebook.react.bridge.PromiseImpl
import java.util.Locale
import kotlin.jvm.functions.Function0

public object NativePermissionPromise {
   @JvmStatic
   fun `generate$lambda$0`(var0: Function0, var1: Function0, var2: Any) {
      var var3: Any;
      if (var2 is Array<Any>) {
         var3 = (var2 as Array<Any>)[0];
      } else {
         var3 = var2;
      }

      if (var3 is java.lang.String) {
         var3 = var3 as java.lang.String;
      } else {
         var3 = null;
      }

      val var4: java.lang.String = "AUTHORIZED".toLowerCase(Locale.ROOT);
      if (var3 == var4) {
         var0.invoke();
      } else {
         var3 = CrashReporting.INSTANCE;
         val var5: StringBuilder = new StringBuilder();
         var5.append("NativePermissionPromise: Unknown Result: ");
         var5.append(var2);
         CrashReporting.addBreadcrumb$default((CrashReporting)var3, var5.toString(), null, null, null, 14, null);
         var1.invoke();
      }
   }

   @JvmStatic
   fun `generate$lambda$1`(var0: Function0, var1: Array<Any>) {
      val var2: CrashReporting = CrashReporting.INSTANCE;
      val var3: StringBuilder = new StringBuilder();
      var3.append("NativePermissionPromise: Rejection: ");
      var3.append(var1);
      CrashReporting.addBreadcrumb$default(var2, var3.toString(), null, null, null, 14, null);
      var0.invoke();
   }

   public fun generate(onAuthorized: () -> Unit, onRejected: () -> Unit): PromiseImpl {
      return new PromiseImpl(new t(var1, var2), new u(var2));
   }
}
