package com.discord.app_icon

import com.discord.codegen.NativeAppIconManagerSpec
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import eh.w
import java.util.ArrayList
import kotlin.jvm.internal.r

public class AppIconManagerModule(reactContext: ReactApplicationContext) : NativeAppIconManagerSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public open fun getAvailableIcons(promise: Promise) {
      r.h(var1, "promise");
      val var4: Array<AppIcon> = AppIconUtil.INSTANCE.getAvailableIcons();
      val var5: ArrayList = new ArrayList(var4.length);
      val var3: Int = var4.length;

      for (int var2 = 0; var2 < var3; var2++) {
         var5.add(NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("id", var4[var2].getId())}));
      }

      var1.resolve(NativeArrayExtensionsKt.toNativeArray(var5));
   }

   public open fun getCurrentIcon(promise: Promise) {
      r.h(var1, "promise");
      val var2: AppIconUtil = AppIconUtil.INSTANCE;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var3, "reactApplicationContext");
      var1.resolve(NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("id", var2.getCurrentAppIcon(var3).getId())}));
   }

   public open fun setIcon(id: String, promise: Promise) {
      r.h(var1, "id");
      r.h(var2, "promise");

      try {
         val var3: AppIconUtil = AppIconUtil.INSTANCE;
         val var4: ReactApplicationContext = this.getReactApplicationContext();
         r.g(var4, "reactApplicationContext");
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
