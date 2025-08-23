package com.discord.safearea

import B9.s
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
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import e2.a
import e2.b
import e2.c
import e2.d
import e2.e
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSafeAreaInsetsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeAreaInsetsModule.kt\ncom/discord/safearea/SafeAreaInsetsModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"])
internal class SafeAreaInsetsModule(reactContext: ReactApplicationContext) : NativeSafeAreaInsetsModuleSpec(var1) {
   @JvmStatic
   fun `getStableSafeAreaInsets$lambda$1`(var0: Int, var1: Int, var2: Int, var3: Int): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         s.a("left", SizeUtilsKt.getPxToDp(var0)),
         s.a("top", SizeUtilsKt.getPxToDp(var1)),
         s.a("right", SizeUtilsKt.getPxToDp(var2)),
         s.a("bottom", SizeUtilsKt.getPxToDp(var3))
      );
   }

   @JvmStatic
   fun `setNavigationBarContrastEnforced$lambda$4`(var0: SafeAreaInsetsModule, var1: Boolean) {
      if (VERSION.SDK_INT < 35) {
         var var3: Activity = var0.getCurrentActivity();
         if (var3 != null) {
            val var6: Window = var3.getWindow();
            if (var6 != null) {
               var6.setStatusBarColor(0);
            }
         }

         var3 = var0.getCurrentActivity();
         if (var3 != null) {
            val var8: Window = var3.getWindow();
            if (var8 != null) {
               var8.setNavigationBarColor(0);
            }
         }
      }

      if (VERSION.SDK_INT >= 29) {
         val var4: Activity = var0.getCurrentActivity();
         if (var4 != null) {
            val var5: Window = var4.getWindow();
            if (var5 != null) {
               a.a(var5, var1);
            }
         }
      }
   }

   @JvmStatic
   fun `setNavigationBarVisible$lambda$3`(var0: SafeAreaInsetsModule, var1: Boolean) {
      val var2: Activity = var0.getReactApplicationContext().getCurrentActivity();
      if (var2 != null) {
         val var3: Window = var2.getWindow();
         if (var3 != null) {
            WindowInsetsCompatExtensionsKt.setInsetsType(var3, WindowInsetsCompat.n.f(), var1);
         }
      }
   }

   @JvmStatic
   fun `setStatusBarVisible$lambda$2`(var0: SafeAreaInsetsModule, var1: Boolean) {
      val var2: Activity = var0.getReactApplicationContext().getCurrentActivity();
      if (var2 != null) {
         val var3: Window = var2.getWindow();
         if (var3 != null) {
            WindowInsetsCompatExtensionsKt.setInsetsType(var3, WindowInsetsCompat.n.g(), var1);
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
            val var10: Insets = WindowInsetsCompatExtensionsKt.getImeInsets$default(var11, false, 1, null);
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

   public override fun getStableSafeAreaInsets(): WritableMap {
      val var1: d = new d();
      val var3: Activity = this.getCurrentActivity();
      val var4: Int = 0;
      if (var3 == null) {
         return var1.invoke(var4, var4, var4, var4) as WritableMap;
      } else {
         val var2: WindowInsetsCompat = WindowInsetsCompatExtensionsKt.getWindowInsetsCompat(var3);
         if (var2 == null) {
            return var1.invoke(var4, var4, var4, var4) as WritableMap;
         } else {
            val var6: Insets = WindowInsetsCompatExtensionsKt.getDisplayCutoutInsets(var2, true);
            val var5: Insets = WindowInsetsCompatExtensionsKt.getSystemBarInsets(var2, var3, true);
            return var1.invoke(Math.max(var6.a, var5.a), Math.max(var6.b, var5.b), Math.max(var6.c, var5.c), Math.max(var6.d, var5.d)) as WritableMap;
         }
      }
   }

   public override fun setNavigationBarContrastEnforced(enforced: Boolean) {
      UiThreadUtil.runOnUiThread(new b(this, var1));
   }

   public override fun setNavigationBarVisible(visible: Boolean) {
      UiThreadUtil.runOnUiThread(new e(this, var1));
   }

   public override fun setStatusBarVisible(visible: Boolean) {
      UiThreadUtil.runOnUiThread(new c(this, var1));
   }
}
