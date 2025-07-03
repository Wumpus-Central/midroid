package com.discord.device

import A9.n
import android.app.Activity
import android.view.View
import com.discord.codegen.NativeDeviceAccessibilityModuleSpec
import com.discord.device.utils.DeviceFocusLockManager
import com.discord.device.utils.DeviceReducedMotion
import com.discord.misc.utilities.threading.ThreadUtilsKt
import com.discord.react.utilities.FindViewByReactTagKt
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.ReactContextFindViewKt
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableArray
import java.util.ArrayList
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

internal class DeviceAccessibilityModule(reactContext: ReactApplicationContext) : NativeDeviceAccessibilityModuleSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   @JvmStatic
   fun `disableFocusLock$lambda$5`() {
      DeviceFocusLockManager.INSTANCE.disableFocusLock();
   }

   @JvmStatic
   fun `enableFocusLock$lambda$4`(var0: ReadableArray, var1: DeviceAccessibilityModule) {
      val var4: DeviceFocusLockManager = DeviceFocusLockManager.INSTANCE;
      val var5: IntRange = NativeArrayExtensionsKt.sizeRange(var0);
      val var3: ArrayList = new ArrayList();
      val var8: java.util.Iterator = var5.iterator();

      while (var8.hasNext()) {
         val var2: Int = (var8 as n).a();
         val var7: ReactApplicationContext = var1.getReactApplicationContext();
         r.g(var7, "getReactApplicationContext(...)");
         val var6: java.lang.String = var0.getString(var2);
         r.e(var6);
         val var9: View = ReactContextFindViewKt.findView(var7, var6);
         if (var9 != null) {
            var3.add(var9);
         }
      }

      var4.enableFocusLock(var3);
   }

   public override fun disableFocusLock() {
      val var1: Activity = this.getCurrentActivity();
      if (var1 != null) {
         var1.runOnUiThread(new b());
      }
   }

   public override fun enableFocusLock(nativeIds: ReadableArray, focus: Boolean) {
      r.h(var1, "nativeIds");
      val var3: Activity = this.getCurrentActivity();
      if (var3 != null) {
         var3.runOnUiThread(new a(var1, this));
      }
   }

   public override fun handleSetPrefersReducedMotion(prefersReducedMotion: String) {
      r.h(var1, "prefersReducedMotion");
      DeviceReducedMotion.INSTANCE.setMotionPreference$device_release(var1);
   }

   public override fun setAccessibilityFocus(tag: Double, promise: Promise) {
      r.h(var3, "promise");
      if (ThreadUtilsKt.isOnMainThread()) {
         val var4: ReactApplicationContext = access$getReactApplicationContext(this);
         r.g(var4, "access$getReactApplicationContext(...)");
         val var5: View = FindViewByReactTagKt.findViewByReactTag(var4, (int)var1, new Function1(var3) {
            final Promise $promise;

            {
               this.$promise = var1;
            }

            public final void invoke(Exception var1) {
               r.h(var1, "error");
               this.$promise.reject(var1);
            }
         });
         if (var5 != null) {
            var5.sendAccessibilityEvent(8);
            var3.resolve("");
         }
      } else {
         ThreadUtilsKt.getUiHandler().post(new Runnable(this, var1, var3) {
            final Promise $promise$inlined;
            final double $tag$inlined;
            final DeviceAccessibilityModule this$0;

            {
               this.this$0 = var1;
               this.$tag$inlined = var2;
               this.$promise$inlined = var4;
            }

            @Override
            public final void run() {
               val var1: ReactApplicationContext = DeviceAccessibilityModule.access$getReactApplicationContext(this.this$0);
               r.g(var1, "access$getReactApplicationContext(...)");
               val var2: View = FindViewByReactTagKt.findViewByReactTag(var1, (int)this.$tag$inlined, new Function1(this.$promise$inlined) {
                  final Promise $promise;

                  {
                     this.$promise = var1;
                  }

                  public final void invoke(Exception var1) {
                     r.h(var1, "error");
                     this.$promise.reject(var1);
                  }
               });
               if (var2 != null) {
                  var2.sendAccessibilityEvent(8);
                  this.$promise$inlined.resolve("");
               }
            }
         });
      }
   }
}
