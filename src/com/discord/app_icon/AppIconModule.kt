package com.discord.app_icon

import B9.s
import com.discord.codegen.NativeAppIconModuleSpec
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import java.util.ArrayList
import kotlin.jvm.internal.r

public class AppIconModule(reactContext: ReactApplicationContext) : NativeAppIconModuleSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public override fun getAvailableIcons(promise: Promise) {
      r.h(var1, "promise");
      val var4: Array<AppIcon> = AppIconUtil.INSTANCE.getAvailableIcons();
      val var5: ArrayList = new ArrayList(var4.length);
      val var3: Int = var4.length;

      for (int var2 = 0; var2 < var3; var2++) {
         var5.add(NativeMapExtensionsKt.nativeMapOf(s.a("id", var4[var2].getId())));
      }

      var1.resolve(NativeArrayExtensionsKt.toNativeArray$default(var5, null, 1, null));
   }

   public override fun getCurrentIcon(promise: Promise) {
      r.h(var1, "promise");
      val var2: AppIconUtil = AppIconUtil.INSTANCE;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var3, "getReactApplicationContext(...)");
      var1.resolve(NativeMapExtensionsKt.nativeMapOf(s.a("id", var2.getCurrentAppIcon(var3).getId())));
   }

   public override fun setIcon(id: String, promise: Promise) {
      r.h(var1, "id");
      r.h(var2, "promise");

      try {
         val var3: AppIconUtil = AppIconUtil.INSTANCE;
         val var4: ReactApplicationContext = this.getReactApplicationContext();
         r.g(var4, "getReactApplicationContext(...)");
         var3.setAppIcon(var4, var1);
         var2.resolve(java.lang.Boolean.TRUE);
      } catch (var5: Exception) {
         var2.reject(var5);
      }
   }
}
