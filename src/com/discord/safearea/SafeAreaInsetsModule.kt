package com.discord.safearea

import android.app.Activity
import android.view.Window
import androidx.core.graphics.Insets
import androidx.core.view.WindowInsetsCompat
import com.discord.codegen.NativeSafeAreaInsetsModuleSpec
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.safearea.extensions.WindowInsetsCompatExtensionsKt
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.UiThreadUtil
import com.facebook.react.bridge.WritableNativeMap
import f8.w
import kotlin.jvm.internal.q

internal class SafeAreaInsetsModule(reactContext: ReactApplicationContext) : NativeSafeAreaInsetsModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   @JvmStatic
   fun `setNavigationBarVisible$lambda$2`(var0: SafeAreaInsetsModule, var1: Boolean) {
      q.h(var0, "this$0");
      val var2: Activity = var0.getReactApplicationContext().getCurrentActivity();
      if (var2 != null) {
         val var3: Window = var2.getWindow();
         if (var3 != null) {
            WindowInsetsCompatExtensionsKt.setInsetsType(var3, WindowInsetsCompat.m.f(), var1);
         }
      }
   }

   @JvmStatic
   fun `setStatusBarVisible$lambda$1`(var0: SafeAreaInsetsModule, var1: Boolean) {
      q.h(var0, "this$0");
      val var2: Activity = var0.getReactApplicationContext().getCurrentActivity();
      if (var2 != null) {
         val var3: Window = var2.getWindow();
         if (var3 != null) {
            WindowInsetsCompatExtensionsKt.setInsetsType(var3, WindowInsetsCompat.m.g(), var1);
         }
      }
   }

   public override fun getImeInsets(exludeSytemBars: Boolean): Double {
      val var8: Activity = this.getCurrentActivity();
      val var10: WindowInsetsCompat;
      if (var8 != null) {
         var10 = WindowInsetsCompatExtensionsKt.getWindowInsetsCompat(var8);
      } else {
         var10 = null;
      }

      var var5: Int;
      label31: {
         if (var10 != null) {
            val var9: Insets = var10.f(WindowInsetsCompat.m.c());
            if (var9 != null) {
               var5 = var9.d;
               break label31;
            }
         }

         var5 = 0;
      }

      if (var5 <= 0) {
         return 0.0;
      } else {
         var var6: Int = 0;
         if (var10 != null) {
            val var11: Insets = var10.f(WindowInsetsCompat.m.h());
            var6 = 0;
            if (var11 != null) {
               var6 = var11.d;
            }
         }

         val var4: Float;
         if (var1) {
            var4 = SizeUtilsKt.getPxToDp(var5 - var6);
         } else {
            var4 = SizeUtilsKt.getPxToDp(var5);
         }

         return var4;
      }
   }

   public open fun getStableSafeAreaInsets(): WritableNativeMap {
      val var1: SafeAreaEdgeInsets = SafeAreaEdgeInsets.Companion.fromRootViewAsStableInsets(this.getCurrentActivity());
      return NativeMapExtensionsKt.nativeMapOf(
         w.a("top", var1.getTopDp()), w.a("bottom", var1.getBottomDp()), w.a("left", var1.getLeftDp()), w.a("right", var1.getRightDp())
      );
   }

   public override fun setNavigationBarVisible(visible: Boolean) {
      UiThreadUtil.runOnUiThread(new b(this, var1));
   }

   public override fun setStatusBarVisible(visible: Boolean) {
      UiThreadUtil.runOnUiThread(new a(this, var1));
   }
}
