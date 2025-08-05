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
import com.facebook.react.ReactApplication
import com.facebook.react.ReactInstanceManager
import com.facebook.react.ReactNativeHost
import com.facebook.react.bridge.JSBundleLoader
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.WritableNativeMap
import com.jakewharton.processphoenix.ProcessPhoenix
import java.io.File
import java.lang.reflect.Field
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
   fun `addListener$lambda$5`(var0: BundleUpdaterManager, var1: Boolean): Unit {
      var0.reactEvents.emitModuleEvent(var0.reactContext, new BundleDownloadedEvent(var1));
      return Unit.a;
   }

   @JvmStatic
   fun `addListener$lambda$6`(var0: BundleUpdaterManager, var1: java.util.List): Unit {
      r.h(var1, "metrics");
      var0.reactEvents.emitModuleEvent(var0.reactContext, new OtaCheckAttemptEvent(var1));
      return Unit.a;
   }

   @JvmStatic
   fun `checkForUpdateAndReload$lambda$2`(var0: BundleUpdaterManager): Unit {
      var0.removeSpinnerView();
      var0.runOnActivity(new i(var0));
      return Unit.a;
   }

   @JvmStatic
   fun `checkForUpdateAndReload$lambda$2$lambda$1`(var0: BundleUpdaterManager, var1: ViewGroup): Unit {
      r.h(var1, "$this$runOnActivity");
      val var6: Activity = var0.reactContext.getCurrentActivity();
      if (var6 != null) {
         var var7: Application = var6.getApplication();
         if (var7 != null) {
            if (var7 !is ReactApplication) {
               var7 = null;
            }

            val var8: ReactApplication = var7 as ReactApplication;
            if (var7 as ReactApplication != null) {
               val var9: ReactNativeHost = var8.getReactNativeHost();
               if (var9 != null) {
                  val var4: ReactInstanceManager = var9.getReactInstanceManager();
                  if (var4 != null) {
                     val var5: BundleUpdater.OtaBundle = BundleUpdater.Companion.instance().getBundle();
                     var var10: java.lang.String = null;
                     if (var5 != null) {
                        val var11: File = var5.getLocation();
                        var10 = null;
                        if (var11 != null) {
                           var10 = var11.getAbsolutePath();
                        }
                     }

                     var0.setJSBundle(var4, var10);
                     var4.recreateReactContextInBackground();
                  }
               }
            }
         }
      }

      return Unit.a;
   }

   private fun removeSpinnerView() {
      this.runOnActivity(new f(this));
   }

   @JvmStatic
   fun `removeSpinnerView$lambda$11`(var0: BundleUpdaterManager, var1: ViewGroup): Unit {
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
   fun `runOnActivity$lambda$13$lambda$12`(var0: Activity, var1: Function1) {
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
      val var2: ProgressBar = new ProgressBar(this.reactContext);
      var2.setLayoutParams(new LayoutParams(-2, -2, 17));
      var2.setIndeterminate(true);
      val var1: FrameLayout = new FrameLayout(this.reactContext);
      var1.setLayoutParams(new LayoutParams(-1, -1));
      var1.addView(var2);
      var1.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierSelected());
      var1.setClickable(true);
      this.progressLayout = var1;
      this.runOnActivity(new l(this));
   }

   @JvmStatic
   fun `showSpinnerView$lambda$9`(var0: BundleUpdaterManager, var1: ViewGroup): Unit {
      r.h(var1, "$this$runOnActivity");
      var1.addView(var0.progressLayout);
      return Unit.a;
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
      val var2: BundleUpdater.Companion = BundleUpdater.Companion;
      BundleUpdater.checkForUpdate$default(BundleUpdater.Companion.instance(), 0, new g(this), 1, null);
      val var3: ReactApplicationContext = this.reactContext;
      val var1: Int = MainActivity.j;
      r.g(MainActivity::class.java, "forName(...)");
      var2.addClearBuildOverrideShortcut(var3, MainActivity::class.java);
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
