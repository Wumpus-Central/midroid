package com.discord.device

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.net.Uri.Builder
import android.os.Build.VERSION
import android.view.Window
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.core.view.d1
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react_activities.ReactRootView
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.bridge.UiThreadUtil
import dh.o
import java.util.ArrayList
import kotlin.jvm.internal.q

public class DeviceSettingsManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   private fun Context.openAccessibilitySettings() {
      val var2: Intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
      var2.setFlags(268435456);
      var1.startActivity(var2);
   }

   private fun Context.openApplicationDetailSettings() {
      val var2: Intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", new Builder().scheme("package").opaquePart(var1.getPackageName()).build());
      var2.setFlags(268435456);
      var1.startActivity(var2);
   }

   private fun Context.openApplicationNotificationSettings() {
      var1.startActivity(new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", var1.getPackageName()));
   }

   private fun setInsetsVisible(visible: Boolean, insetType: Int): Boolean {
      return UiThreadUtil.runOnUiThread(new c(this, var1, var2));
   }

   @JvmStatic
   fun `setInsetsVisible$lambda$3`(var0: DeviceSettingsManagerModule, var1: Boolean, var2: Int) {
      q.h(var0, "this$0");
      val var3: Activity = var0.getReactApplicationContext().getCurrentActivity();
      val var4: Window;
      if (var3 != null) {
         var4 = var3.getWindow();
      } else {
         var4 = null;
      }

      if (var4 != null) {
         val var5: WindowInsetsControllerCompat = d1.a(var4, var4.getDecorView());
         q.g(var5, "getInsetsController(...)");
         var5.d(2);
         if (var1) {
            var5.e(var2);
         } else {
            var5.a(var2);
         }
      }
   }

   @JvmStatic
   fun `setSystemGestureExclusionRects$lambda$2`(var0: DeviceSettingsManagerModule, var1: ReadableArray) {
      q.h(var0, "this$0");
      q.h(var1, "$rects");
      val var2: ReactRootView.Companion = ReactRootView.Companion;
      val var6: ReactApplicationContext = var0.getReactApplicationContext();
      q.g(var6, "getReactApplicationContext(...)");
      val var4: IntRange = NativeArrayExtensionsKt.sizeRange(var1);
      val var3: ArrayList = new ArrayList(i.u(var4, 10));
      val var7: java.util.Iterator = var4.iterator();

      while (var7.hasNext()) {
         val var5: ReadableMap = var1.getMap((var7 as o).c());
         var3.add(
            new Rect(
               SizeUtilsKt.getDpToPx(var5.getInt("left")),
               SizeUtilsKt.getDpToPx(var5.getInt("top")),
               SizeUtilsKt.getDpToPx(var5.getInt("right")),
               SizeUtilsKt.getDpToPx(var5.getInt("bottom"))
            )
         );
      }

      var2.setSystemGestureExclusionRects(var6, var3);
   }

   public open fun getName(): String {
      return "DeviceSettingsManager";
   }

   @ReactMethod
   public fun openAccessibilitySettings(): Unit? {
      val var1: Activity = this.getReactApplicationContext().getCurrentActivity();
      val var2: Unit;
      if (var1 != null) {
         this.openAccessibilitySettings(var1);
         var2 = Unit.a;
      } else {
         var2 = null;
      }

      return var2;
   }

   @ReactMethod
   public fun openNotificationSettings(): Unit? {
      var var2: Unit = null;
      if (VERSION.SDK_INT >= 26) {
         val var3: Activity = this.getReactApplicationContext().getCurrentActivity();
         if (var3 != null) {
            this.openApplicationNotificationSettings(var3);
            var2 = Unit.a;
         }
      } else {
         val var4: Activity = this.getReactApplicationContext().getCurrentActivity();
         if (var4 != null) {
            this.openApplicationDetailSettings(var4);
            var2 = Unit.a;
         }
      }

      return var2;
   }

   @ReactMethod
   public fun openPrivacySettings() {
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var1, "getReactApplicationContext(...)");
      this.openApplicationDetailSettings(var1);
   }

   @ReactMethod
   public fun setNavigationBarVisible(visible: Boolean): Boolean {
      return this.setInsetsVisible(var1, WindowInsetsCompat.m.e());
   }

   @ReactMethod
   public fun setStatusBarVisible(visible: Boolean): Boolean {
      return this.setInsetsVisible(var1, WindowInsetsCompat.m.f());
   }

   @ReactMethod
   public fun setSystemGestureExclusionRects(rects: ReadableArray): Boolean {
      q.h(var1, "rects");
      return UiThreadUtil.runOnUiThread(new d(this, var1));
   }
}
