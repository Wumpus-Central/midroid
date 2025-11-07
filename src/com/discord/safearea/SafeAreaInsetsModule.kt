package com.discord.safearea

import android.app.Activity
import android.os.Build.VERSION
import android.view.Window
import androidx.core.graphics.Insets
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsCompat.n
import com.discord.codegen.NativeSafeAreaInsetsModuleSpec
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.safearea.extensions.WindowInsetsCompatExtensionsKt
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.UiThreadUtil
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import g9.a
import g9.b
import ht.v
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSafeAreaInsetsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeAreaInsetsModule.kt\ncom/discord/safearea/SafeAreaInsetsModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"])
internal class SafeAreaInsetsModule(reactContext: ReactApplicationContext) : NativeSafeAreaInsetsModuleSpec(var1) {
   public final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   @JvmStatic
   fun `getStableSafeAreaInsets$lambda$1`(var0: Int, var1: Int, var2: Int, var3: Int): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         v.a("left", SizeUtilsKt.getPxToDp(var0)),
         v.a("top", SizeUtilsKt.getPxToDp(var1)),
         v.a("right", SizeUtilsKt.getPxToDp(var2)),
         v.a("bottom", SizeUtilsKt.getPxToDp(var3))
      );
   }

   @JvmStatic
   fun `setNavigationBarContrastEnforced$lambda$4`(var0: SafeAreaInsetsModule, var1: Boolean) {
      if (VERSION.SDK_INT < 35) {
         var var3: Activity = var0.reactContext.getCurrentActivity();
         if (var3 != null) {
            val var6: Window = var3.getWindow();
            if (var6 != null) {
               var6.setStatusBarColor(0);
            }
         }

         var3 = var0.reactContext.getCurrentActivity();
         if (var3 != null) {
            val var8: Window = var3.getWindow();
            if (var8 != null) {
               var8.setNavigationBarColor(0);
            }
         }
      }

      if (VERSION.SDK_INT >= 29) {
         val var4: Activity = var0.reactContext.getCurrentActivity();
         if (var4 != null) {
            val var5: Window = var4.getWindow();
            if (var5 != null) {
               var5.setNavigationBarContrastEnforced(var1);
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
            WindowInsetsCompatExtensionsKt.setInsetsType(var3, n.f(), var1);
         }
      }
   }

   @JvmStatic
   fun `setStatusBarVisible$lambda$2`(var0: SafeAreaInsetsModule, var1: Boolean) {
      val var2: Activity = var0.getReactApplicationContext().getCurrentActivity();
      if (var2 != null) {
         val var3: Window = var2.getWindow();
         if (var3 != null) {
            WindowInsetsCompatExtensionsKt.setInsetsType(var3, n.g(), var1);
         }
      }
   }

   public override fun getImeInsets(exludeSytemBars: Boolean): Double {
      val var6: Activity = this.reactContext.getCurrentActivity();
      var var7: Insets = null;
      val var9: WindowInsetsCompat;
      if (var6 != null) {
         var9 = WindowInsetsCompatExtensionsKt.getWindowInsetsCompat(var6);
      } else {
         var9 = null;
      }

      var var3: Int;
      label41: {
         if (var9 != null) {
            val var8: Insets = WindowInsetsCompatExtensionsKt.getImeInsets$default(var9, false, 1, null);
            if (var8 != null) {
               var3 = var8.d;
               break label41;
            }
         }

         var3 = 0;
      }

      if (var3 <= 0) {
         return 0.0;
      } else {
         val var10: Activity = this.reactContext.getCurrentActivity();
         var var4: Int = 0;
         if (var10 != null) {
            if (var9 != null) {
               var7 = WindowInsetsCompatExtensionsKt.getSystemBarInsets$default(var9, var10, false, 2, null);
            }

            var4 = 0;
            if (var7 != null) {
               var4 = var7.d;
            }
         }

         if (var4 == var3 && VERSION.SDK_INT <= 29) {
            return 0.0;
         } else {
            val var2: Float;
            if (var1) {
               var2 = SizeUtilsKt.getPxToDp(var3 - var4);
            } else {
               var2 = SizeUtilsKt.getPxToDp(var3);
            }

            return var2;
         }
      }
   }

   public override fun getStableSafeAreaInsets(): WritableMap? {
      val var2: g9.c = new g9.c();
      val var4: Activity = this.reactContext.getCurrentActivity();
      if (var4 == null) {
         return null;
      } else {
         val var3: WindowInsetsCompat = WindowInsetsCompatExtensionsKt.getWindowInsetsCompat(var4);
         if (var3 == null) {
            return null;
         } else {
            val var1: Insets = WindowInsetsCompatExtensionsKt.getDisplayCutoutInsets(var3, true);
            val var5: Insets = WindowInsetsCompatExtensionsKt.getSystemBarInsets(var3, var4, true);
            return var2.invoke(Math.max(var1.a, var5.a), Math.max(var1.b, var5.b), Math.max(var1.c, var5.c), Math.max(var1.d, var5.d)) as WritableMap;
         }
      }
   }

   public override fun setNavigationBarContrastEnforced(enforced: Boolean) {
      UiThreadUtil.runOnUiThread(new a(this, var1));
   }

   public override fun setNavigationBarVisible(visible: Boolean) {
      UiThreadUtil.runOnUiThread(new g9.d(this, var1));
   }

   public override fun setStatusBarVisible(visible: Boolean) {
      UiThreadUtil.runOnUiThread(new b(this, var1));
   }
}
