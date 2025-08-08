package com.discord.bundle_updater

import A9.s
import android.app.Activity
import android.app.Application
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ProgressBar
import android.widget.FrameLayout.LayoutParams
import com.discord.bundle_updater.react.events.BundleDownloadedEvent
import com.discord.bundle_updater.react.events.OtaCheckAttemptEvent
import com.discord.main.MainActivity
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import com.discord.reactevents.ReactEvents
import com.discord.theme.ThemeManagerKt
import com.facebook.react.ReactActivity
import com.facebook.react.ReactApplication
import com.facebook.react.ReactDelegate
import com.facebook.react.ReactHost
import com.facebook.react.ReactInstanceManager
import com.facebook.react.ReactNativeHost
import com.facebook.react.bridge.JSBundleLoader
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.WritableNativeMap
import com.facebook.react.runtime.ReactHostImpl
import com.facebook.react.runtime.internal.bolts.Task
import com.jakewharton.processphoenix.ProcessPhoenix
import java.io.File
import java.lang.reflect.Field
import java.lang.reflect.Method
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r

public class BundleUpdaterManager(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents
   private final var progressLayout: ViewGroup?

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(s.a("BundleDownloaded", H.b(BundleDownloadedEvent.class)), s.a("OtaUpdateChecked", H.b(OtaCheckAttemptEvent.class)));
   }

   @JvmStatic
   fun `addListener$lambda$6`(var0: BundleUpdaterManager, var1: Boolean): Unit {
      var0.reactEvents.emitModuleEvent(var0.reactContext, new BundleDownloadedEvent(var1));
      return Unit.a;
   }

   @JvmStatic
   fun `addListener$lambda$7`(var0: BundleUpdaterManager, var1: java.util.List): Unit {
      r.h(var1, "metrics");
      var0.reactEvents.emitModuleEvent(var0.reactContext, new OtaCheckAttemptEvent(var1));
      return Unit.a;
   }

   @JvmStatic
   fun `checkForUpdateAndReload$lambda$1`(var0: BundleUpdaterManager): Unit {
      var0.removeSpinnerView();
      var0.runOnActivity(new i(var0));
      return Unit.a;
   }

   @JvmStatic
   fun `checkForUpdateAndReload$lambda$1$lambda$0`(var0: BundleUpdaterManager, var1: ViewGroup): Unit {
      r.h(var1, "$this$runOnActivity");
      if (var0.reactContext.isBridgeless()) {
         var0.updateBridgeless();
      } else {
         var0.updateLegacy();
      }

      return Unit.a;
   }

   private fun removeSpinnerView() {
      this.runOnActivity(new f(this));
   }

   @JvmStatic
   fun `removeSpinnerView$lambda$12`(var0: BundleUpdaterManager, var1: ViewGroup): Unit {
      r.h(var1, "$this$runOnActivity");
      if (var0.progressLayout != null) {
         var1.removeView(var0.progressLayout);
      }

      var0.progressLayout = null;
      return Unit.a;
   }

   private fun runOnActivity(callback: (ViewGroup) -> Unit) {
      val var2: Activity = this.reactContext.getCurrentActivity();
      if (var2 != null) {
         var2.runOnUiThread(new h(var2, var1));
      }
   }

   @JvmStatic
   fun `runOnActivity$lambda$14$lambda$13`(var0: Activity, var1: Function1) {
      val var2: View = ActivityExtensionsKt.getRootView(var0);
      if (var2 != null) {
         var var3: View = var2;
         if (var2 !is ViewGroup) {
            var3 = null;
         }

         val var4: ViewGroup = var3 as ViewGroup;
         if (var3 as ViewGroup != null) {
            var1.invoke(var4);
         }
      }
   }

   private fun ReactInstanceManager.setJSBundle(bundleLocation: String?) {
      label24: {
         if (var2 != null) {
            var var3: JSBundleLoader;
            try {
               var3 = JSBundleLoader.createFileLoader(var2);
            } catch (var6: Exception) {
               throw new IllegalAccessException("Could not setJSBundle");
            }

            var7 = var3;
            if (var3 != null) {
               break label24;
            }
         }

         try {
            var7 = JSBundleLoader.createAssetLoader(this.getReactApplicationContext(), "assets://index.android.bundle", false);
            r.g(var7, "createAssetLoader(...)");
         } catch (var5: Exception) {
            throw new IllegalAccessException("Could not setJSBundle");
         }
      }

      try {
         val var8: Field = var1.getClass().getDeclaredField("mBundleLoader");
         var8.setAccessible(true);
         var8.set(var1, var7);
      } catch (var4: Exception) {
         throw new IllegalAccessException("Could not setJSBundle");
      }
   }

   private fun showSpinnerView() {
      val var1: ProgressBar = new ProgressBar(this.reactContext);
      var1.setLayoutParams(new LayoutParams(-2, -2, 17));
      var1.setIndeterminate(true);
      val var2: FrameLayout = new FrameLayout(this.reactContext);
      var2.setLayoutParams(new LayoutParams(-1, -1));
      var2.addView(var1);
      var2.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierSelected());
      var2.setClickable(true);
      this.progressLayout = var2;
      this.runOnActivity(new l(this));
   }

   @JvmStatic
   fun `showSpinnerView$lambda$10`(var0: BundleUpdaterManager, var1: ViewGroup): Unit {
      r.h(var1, "$this$runOnActivity");
      var1.addView(var0.progressLayout);
      return Unit.a;
   }

   private fun updateBridgeless() {
      val var2: Activity = this.reactContext.getCurrentActivity();
      val var7: ReactActivity;
      if (var2 is ReactActivity) {
         var7 = var2 as ReactActivity;
      } else {
         var7 = null;
      }

      var var9: ReactHost;
      label66: {
         if (var7 != null) {
            val var3: ReactDelegate = var7.getReactDelegate();
            if (var3 != null) {
               var9 = var3.getReactHost();
               break label66;
            }
         }

         var9 = null;
      }

      val var10: ReactHostImpl;
      if (var9 is ReactHostImpl) {
         var10 = var9 as ReactHostImpl;
      } else {
         var10 = null;
      }

      var var13: java.lang.String;
      label60: {
         val var4: BundleUpdater.OtaBundle = BundleUpdater.Companion.instance().getBundle();
         if (var4 != null) {
            val var12: File = var4.getLocation();
            if (var12 != null) {
               var13 = var12.getAbsolutePath();
               break label60;
            }
         }

         var13 = null;
      }

      label55: {
         if (var13 != null) {
            val var5: JSBundleLoader = JSBundleLoader.createFileLoader(var13);
            var14 = var5;
            if (var5 != null) {
               break label55;
            }
         }

         var14 = JSBundleLoader.createAssetLoader(this.getReactApplicationContext(), "assets://index.android.bundle", false);
         r.g(var14, "createAssetLoader(...)");
      }

      val var16: Method;
      if (var10 != null) {
         var16 = var10.getClass().getDeclaredMethod("loadBundle", JSBundleLoader.class);
      } else {
         var16 = null;
      }

      if (var16 != null) {
         var16.setAccessible(true);
      }

      if (var16 != null) {
         var9 = (ReactHost)var16.invoke(var10, var14);
      } else {
         var9 = null;
      }

      var var15: Task = null;
      if (var9 is Task) {
         var15 = var9 as Task;
      }

      if (var15 != null) {
         var15.waitForCompletion();
      }

      if (var7 != null) {
         val var8: ReactDelegate = var7.getReactDelegate();
         if (var8 != null) {
            var8.reload();
         }
      }
   }

   private fun updateLegacy() {
      val var2: Activity = this.reactContext.getCurrentActivity();
      if (var2 != null) {
         var var6: Application = var2.getApplication();
         if (var6 != null) {
            if (var6 !is ReactApplication) {
               var6 = null;
            }

            val var7: ReactApplication = var6 as ReactApplication;
            if (var6 as ReactApplication != null) {
               val var8: ReactNativeHost = var7.getReactNativeHost();
               if (var8 != null) {
                  val var4: ReactInstanceManager = var8.getReactInstanceManager();
                  if (var4 != null) {
                     val var5: BundleUpdater.OtaBundle = BundleUpdater.Companion.instance().getBundle();
                     var var9: java.lang.String = null;
                     if (var5 != null) {
                        val var10: File = var5.getLocation();
                        var9 = null;
                        if (var10 != null) {
                           var9 = var10.getAbsolutePath();
                        }
                     }

                     this.setJSBundle(var4, var9);
                     var4.recreateReactContextInBackground();
                  }
               }
            }
         }
      }
   }

   @ReactMethod
   public fun addListener(type: String) {
      r.h(var1, "type");
      if (r.c(var1, "BundleDownloaded")) {
         BundleUpdater.Companion.instance().setOnBundleDownloadedListener(new j(this));
      } else if (r.c(var1, "OtaUpdateChecked")) {
         BundleUpdater.Companion.instance().setOnOtaUpdateCheckedListener(new k(this));
      }
   }

   @ReactMethod
   public fun checkForUpdateAndReload() {
      this.showSpinnerView();
      val var3: BundleUpdater.Companion = BundleUpdater.Companion;
      BundleUpdater.checkForUpdate$default(BundleUpdater.Companion.instance(), 0, new g(this), 1, null);
      val var2: ReactApplicationContext = this.reactContext;
      val var1: Int = MainActivity.j;
      r.g(MainActivity::class.java, "forName(...)");
      var3.addClearBuildOverrideShortcut(var2, MainActivity::class.java);
   }

   @ReactMethod
   public fun getBuildOverrideCookieContents(promise: Promise) {
      r.h(var1, "promise");
      val var2: BuildOverrideCookieContents = CookieValidator.INSTANCE.parseBuildOverrideCookie(BundleUpdater.Companion.instance().getBuildOverrideCookie());
      val var3: WritableNativeMap;
      if (var2 != null) {
         var3 = var2.toNativeMap();
      } else {
         var3 = null;
      }

      var1.resolve(var3);
   }

   @ReactMethod
   public fun getInitialBundleDownloaded(promise: Promise) {
      r.h(var1, "promise");
      var1.resolve(new BundleDownloadedEvent(BundleUpdater.Companion.instance().isVersionRequired()).serialize());
   }

   @ReactMethod
   public fun getInitialOtaUpdateChecked(promise: Promise) {
      r.h(var1, "promise");
      var1.resolve(new OtaCheckAttemptEvent(BundleUpdater.Companion.instance().getOtaMetrics()).serialize());
   }

   @ReactMethod
   public fun getManifestInfo(promise: Promise) {
      r.h(var1, "promise");
      val var2: BundleUpdater.ManifestInfo = BundleUpdater.Companion.instance().manifestInfo();
      val var3: WritableNativeMap;
      if (var2 != null) {
         var3 = var2.toNativeMap();
      } else {
         var3 = null;
      }

      var1.resolve(var3);
   }

   public open fun getName(): String {
      return "BundleUpdaterManager";
   }

   @ReactMethod
   public fun getOtaRootPath(promise: Promise) {
      r.h(var1, "promise");
      var1.resolve(BundleUpdater.Companion.instance().getOtasRootDirectory().getAbsolutePath());
   }

   @ReactMethod
   public fun reload() {
      ProcessPhoenix.b(this.reactContext);
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun setBuildOverrideCookieHeader(cookieHeader: String) {
      r.h(var1, "cookieHeader");
      BundleUpdater.Companion.instance().setBuildOverrideCookieHeader(var1);
   }

   public companion object {
      private const val BUNDLE_DOWNLOADED: String
      private const val OTA_UPDATE_CHECKED: String
   }
}
