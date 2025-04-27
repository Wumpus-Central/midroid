package com.discord.device

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.net.Uri.Builder
import android.os.Build.VERSION
import com.discord.codegen.NativeDeviceSettingsModuleSpec
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.bridge.UiThreadUtil
import g8.n
import java.util.ArrayList
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q

internal class DeviceSettingsModule(reactContext: ReactApplicationContext) : NativeDeviceSettingsModuleSpec {
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

   private fun Context.openNotificationSettings() {
      if (VERSION.SDK_INT >= 26) {
         this.openApplicationNotificationSettings(var1);
      } else {
         this.openApplicationDetailSettings(var1);
      }
   }

   @JvmStatic
   fun `setSystemGestureExclusionRects$lambda$2`(var0: DeviceSettingsModule, var1: ReadableArray) {
      q.h(var0, "this$0");
      q.h(var1, "$rects");
      val var2: Function2 = ReactRootViewProxy.INSTANCE.getSetSystemGestureExclusionRects();
      if (var2 != null) {
         val var6: ReactApplicationContext = var0.getReactApplicationContext();
         q.g(var6, "getReactApplicationContext(...)");
         val var4: IntRange = NativeArrayExtensionsKt.sizeRange(var1);
         val var3: ArrayList = new ArrayList(i.v(var4, 10));
         val var7: java.util.Iterator = var4.iterator();

         while (var7.hasNext()) {
            val var5: ReadableMap = var1.getMap((var7 as n).a());
            var3.add(
               new Rect(
                  SizeUtilsKt.getDpToPx(var5.getInt("left")),
                  SizeUtilsKt.getDpToPx(var5.getInt("top")),
                  SizeUtilsKt.getDpToPx(var5.getInt("right")),
                  SizeUtilsKt.getDpToPx(var5.getInt("bottom"))
               )
            );
         }

         var2.invoke(var6, var3);
      }
   }

   public override fun openAccessibilitySettings() {
      val var1: Activity = this.getReactApplicationContext().getCurrentActivity();
      if (var1 != null) {
         this.openAccessibilitySettings(var1);
      }
   }

   public override fun openNotificationSettings() {
      val var1: Activity = this.getReactApplicationContext().getCurrentActivity();
      if (var1 != null) {
         this.openNotificationSettings(var1);
      }
   }

   public override fun openPrivacySettings() {
      val var1: Activity = this.getReactApplicationContext().getCurrentActivity();
      if (var1 != null) {
         this.openApplicationDetailSettings(var1);
      }
   }

   public override fun setSystemGestureExclusionRects(rects: ReadableArray) {
      q.h(var1, "rects");
      UiThreadUtil.runOnUiThread(new c(this, var1));
   }
}
