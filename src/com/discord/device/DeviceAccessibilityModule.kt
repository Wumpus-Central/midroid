package com.discord.device

import android.app.Activity
import android.view.View
import com.discord.device.utils.DeviceFocusLockManager
import com.discord.device.utils.DeviceReducedMotion
import com.discord.misc.utilities.threading.ThreadUtilsKt
import com.discord.react.utilities.FindViewByReactTagKt
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.ReactContextFindViewKt
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableArray
import java.util.ArrayList
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import lh.o

public class DeviceAccessibilityModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   @JvmStatic
   fun `disableFocusLock$lambda$5`() {
      DeviceFocusLockManager.INSTANCE.disableFocusLock();
   }

   @JvmStatic
   fun `enableFocusLock$lambda$4`(var0: ReadableArray, var1: DeviceAccessibilityModule) {
      q.h(var0, "$nativeIds");
      q.h(var1, "this$0");
      val var4: DeviceFocusLockManager = DeviceFocusLockManager.INSTANCE;
      val var5: IntRange = NativeArrayExtensionsKt.sizeRange(var0);
      val var3: ArrayList = new ArrayList();
      val var8: java.util.Iterator = var5.iterator();

      while (var8.hasNext()) {
         val var2: Int = (var8 as o).a();
         val var6: ReactApplicationContext = var1.getReactApplicationContext();
         q.g(var6, "getReactApplicationContext(...)");
         val var7: java.lang.String = var0.getString(var2);
         q.g(var7, "getString(...)");
         val var9: View = ReactContextFindViewKt.findView(var6, var7);
         if (var9 != null) {
            var3.add(var9);
         }
      }

      var4.enableFocusLock(var3);
   }

   @ReactMethod
   public fun disableFocusLock(): Unit? {
      val var1: Activity = this.getCurrentActivity();
      val var2: Unit;
      if (var1 != null) {
         var1.runOnUiThread(new a());
         var2 = Unit.a;
      } else {
         var2 = null;
      }

      return var2;
   }

   @ReactMethod
   public fun enableFocusLock(nativeIds: ReadableArray, focus: Boolean): Unit? {
      q.h(var1, "nativeIds");
      val var3: Activity = this.getCurrentActivity();
      val var4: Unit;
      if (var3 != null) {
         var3.runOnUiThread(new b(var1, this));
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      return var4;
   }

   public open fun getName(): String {
      return "DCDAccessibilityManager";
   }

   @ReactMethod
   public fun handleSetPrefersReducedMotion(prefersReducedMotion: String) {
      q.h(var1, "prefersReducedMotion");
      DeviceReducedMotion.INSTANCE.setMotionPreference$device_release(var1);
   }

   @ReactMethod
   public fun setAccessibilityFocus(tag: Int, promise: Promise) {
      q.h(var2, "promise");
      if (ThreadUtilsKt.isOnMainThread()) {
         val var3: ReactApplicationContext = access$getReactApplicationContext(this);
         q.g(var3, "access$getReactApplicationContext(...)");
         val var4: View = FindViewByReactTagKt.findViewByReactTag(var3, var1, new Function1(var2) {
            final Promise $promise;

            {
               super(1);
               this.$promise = var1;
            }

            public final void invoke(Exception var1) {
               q.h(var1, "error");
               this.$promise.reject(var1);
            }
         });
         if (var4 != null) {
            var4.sendAccessibilityEvent(8);
            var2.resolve("");
         }
      } else {
         ThreadUtilsKt.getUiHandler().post(new Runnable(this, var1, var2) {
            final Promise $promise$inlined;
            final int $tag$inlined;
            final DeviceAccessibilityModule this$0;

            {
               this.this$0 = var1;
               this.$tag$inlined = var2;
               this.$promise$inlined = var3;
            }

            @Override
            public final void run() {
               val var1: ReactApplicationContext = DeviceAccessibilityModule.access$getReactApplicationContext(this.this$0);
               q.g(var1, "access$getReactApplicationContext(...)");
               val var2: View = FindViewByReactTagKt.findViewByReactTag(var1, this.$tag$inlined, new Function1(this.$promise$inlined) {
                  final Promise $promise;

                  {
                     super(1);
                     this.$promise = var1;
                  }

                  public final void invoke(Exception var1) {
                     q.h(var1, "error");
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
