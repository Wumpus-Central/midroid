package com.discord.app_icon

import com.discord.codegen.NativeAppIconManagerSpec
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import dh.w
import java.util.ArrayList
import kotlin.jvm.internal.q

public class AppIconManagerModule(reactContext: ReactApplicationContext) : NativeAppIconManagerSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public override fun getAvailableIcons(promise: Promise) {
      q.h(var1, "promise");
      val var5: Array<AppIcon> = AppIconUtil.INSTANCE.getAvailableIcons();
      val var4: ArrayList = new ArrayList(var5.length);
      val var3: Int = var5.length;

      for (int var2 = 0; var2 < var3; var2++) {
         var4.add(NativeMapExtensionsKt.nativeMapOf(w.a("id", var5[var2].getId())));
      }

      var1.resolve(NativeArrayExtensionsKt.toNativeArray(var4));
   }

   public override fun getCurrentIcon(promise: Promise) {
      q.h(var1, "promise");
      val var3: AppIconUtil = AppIconUtil.INSTANCE;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      var1.resolve(NativeMapExtensionsKt.nativeMapOf(w.a("id", var3.getCurrentAppIcon(var2).getId())));
   }

   public override fun setIcon(id: String, promise: Promise) {
      q.h(var1, "id");
      q.h(var2, "promise");

      try {
         val var3: AppIconUtil = AppIconUtil.INSTANCE;
         val var4: ReactApplicationContext = this.getReactApplicationContext();
         q.g(var4, "getReactApplicationContext(...)");
         var3.setAppIcon(var4, var1);
         var2.resolve(java.lang.Boolean.TRUE);
      } catch (var5: Exception) {
         var2.reject(var5);
      }
   }

   public companion object {
      public const val NAME: String
   }
}
