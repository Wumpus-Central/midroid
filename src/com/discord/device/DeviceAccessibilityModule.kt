package com.discord.device

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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nDeviceAccessibilityModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceAccessibilityModule.kt\ncom/discord/device/DeviceAccessibilityModule\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n22#2,8:55\n1611#3,9:63\n1863#3:72\n1864#3:74\n1620#3:75\n1#4:73\n*S KotlinDebug\n*F\n+ 1 DeviceAccessibilityModule.kt\ncom/discord/device/DeviceAccessibilityModule\n*L\n25#1:55,8\n44#1:63,9\n44#1:72\n44#1:74\n44#1:75\n44#1:73\n*E\n"])
internal class DeviceAccessibilityModule(reactContext: ReactApplicationContext) : NativeDeviceAccessibilityModuleSpec(var1) {
   public final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   @JvmStatic
   fun `disableFocusLock$lambda$5`() {
      DeviceFocusLockManager.INSTANCE.disableFocusLock();
   }

   @JvmStatic
   fun `enableFocusLock$lambda$4`(var0: ReadableArray, var1: DeviceAccessibilityModule) {
      val var3: DeviceFocusLockManager = DeviceFocusLockManager.INSTANCE;
      val var5: IntRange = NativeArrayExtensionsKt.sizeRange(var0);
      val var4: ArrayList = new ArrayList();
      val var8: java.util.Iterator = var5.iterator();

      while (var8.hasNext()) {
         val var2: Int = (var8 as I).nextInt();
         val var7: ReactApplicationContext = var1.getReactApplicationContext();
         val var6: java.lang.String = var0.getString(var2);
         val var9: View = ReactContextFindViewKt.findView(var7, var6);
         if (var9 != null) {
            var4.add(var9);
         }
      }

      var3.enableFocusLock(var4);
   }

   public override fun disableFocusLock() {
      val var1: Activity = this.reactContext.getCurrentActivity();
      if (var1 != null) {
         var1.runOnUiThread(new b());
      }
   }

   public override fun enableFocusLock(nativeIds: ReadableArray, focus: Boolean) {
      val var3: Activity = this.reactContext.getCurrentActivity();
      if (var3 != null) {
         var3.runOnUiThread(new a(var1, this));
      }
   }

   public override fun handleSetPrefersReducedMotion(prefersReducedMotion: String) {
      DeviceReducedMotion.INSTANCE.setMotionPreference$device_release(var1);
   }

   public override fun setAccessibilityFocus(tag: Double, promise: Promise) {
      if (ThreadUtilsKt.isOnMainThread()) {
         val var4: ReactApplicationContext = access$getReactApplicationContext(this);
         val var5: View = FindViewByReactTagKt.findViewByReactTag(var4, (int)var1, new Function1<Exception, Unit>(var3) {
            final Promise $promise;

            {
               this.$promise = var1;
            }

            public final void invoke(Exception var1) {
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
               val var2: View = FindViewByReactTagKt.findViewByReactTag(var1, (int)this.$tag$inlined, new Function1<Exception, Unit>(this.$promise$inlined) {
                  final Promise $promise;

                  {
                     this.$promise = var1;
                  }

                  public final void invoke(Exception var1) {
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
