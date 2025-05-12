package com.discord.safearea

import android.app.Activity
import android.os.Build.VERSION
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
import kotlin.jvm.internal.q
import o8.w

internal class SafeAreaInsetsModule(reactContext: ReactApplicationContext) : NativeSafeAreaInsetsModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   @JvmStatic
   fun `setNavigationBarVisible$lambda$3`(var0: SafeAreaInsetsModule, var1: Boolean) {
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
   fun `setStatusBarVisible$lambda$2`(var0: SafeAreaInsetsModule, var1: Boolean) {
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
      var var9: Insets = null;
      val var11: WindowInsetsCompat;
      if (var8 != null) {
         var11 = WindowInsetsCompatExtensionsKt.getWindowInsetsCompat(var8);
      } else {
         var11 = null;
      }

      var var5: Int;
      label41: {
         if (var11 != null) {
            val var10: Insets = var11.f(WindowInsetsCompat.m.c());
            if (var10 != null) {
               var5 = var10.d;
               break label41;
            }
         }

         var5 = 0;
      }

      if (var5 <= 0) {
         return 0.0;
      } else {
         val var12: Activity = this.getCurrentActivity();
         var var6: Int = 0;
         if (var12 != null) {
            if (var11 != null) {
               var9 = WindowInsetsCompatExtensionsKt.getSystemBarInsets$default(var11, var12, false, 2, null);
            }

            var6 = 0;
            if (var9 != null) {
               var6 = var9.d;
            }
         }

         if (var6 == var5 && VERSION.SDK_INT <= 29) {
            return 0.0;
         } else {
            val var4: Float;
            if (var1) {
               var4 = SizeUtilsKt.getPxToDp(var5 - var6);
            } else {
               var4 = SizeUtilsKt.getPxToDp(var5);
            }

            return var4;
         }
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
