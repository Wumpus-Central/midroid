package com.discord.bundle_updater

import android.app.Activity
import android.app.Application
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ProgressBar
import android.widget.FrameLayout.LayoutParams
import com.discord.bundle_updater.react.events.BundleDownloadedEvent
import com.discord.bundle_updater.react.events.OtaCheckAttemptEvent
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
import fh.w
import java.io.File
import java.lang.reflect.Field
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

public class BundleUpdaterManager(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents
   private final var progressLayout: ViewGroup?

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(w.a("BundleDownloaded", g0.b(BundleDownloadedEvent.class)), w.a("OtaUpdateChecked", g0.b(OtaCheckAttemptEvent.class)));
   }

   private fun removeSpinnerView() {
      this.runOnActivity(new Function1(this) {
         final BundleUpdaterManager this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(ViewGroup var1) {
            q.h(var1, "$this$runOnActivity");
            val var2: ViewGroup = BundleUpdaterManager.access$getProgressLayout$p(this.this$0);
            if (var2 != null) {
               var1.removeView(var2);
            }

            BundleUpdaterManager.access$setProgressLayout$p(this.this$0, null);
         }
      });
   }

   private fun runOnActivity(callback: (ViewGroup) -> Unit) {
      val var2: Activity = this.reactContext.getCurrentActivity();
      if (var2 != null) {
         var2.runOnUiThread(new c(var2, var1));
      }
   }

   @JvmStatic
   fun `runOnActivity$lambda$5$lambda$4`(var0: Activity, var1: Function1) {
      q.h(var0, "$this_apply");
      q.h(var1, "$callback");
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
      val var7: JSBundleLoader;
      if (var2 != null) {
         try {
            var7 = JSBundleLoader.createFileLoader(var2);
         } catch (var6: Exception) {
            throw new IllegalAccessException("Could not setJSBundle");
         }
      } else {
         var7 = null;
      }

      var var3: JSBundleLoader = var7;
      if (var7 == null) {
         try {
            var3 = JSBundleLoader.createAssetLoader(this.getReactApplicationContext(), "assets://index.android.bundle", false);
            q.g(var3, "createAssetLoader(...)");
         } catch (var5: Exception) {
            throw new IllegalAccessException("Could not setJSBundle");
         }
      }

      try {
         val var8: Field = var1.getClass().getDeclaredField("mBundleLoader");
         var8.setAccessible(true);
         var8.set(var1, var3);
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
      this.runOnActivity(new Function1(this) {
         final BundleUpdaterManager this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(ViewGroup var1) {
            q.h(var1, "$this$runOnActivity");
            var1.addView(BundleUpdaterManager.access$getProgressLayout$p(this.this$0));
         }
      });
   }

   @ReactMethod
   public fun addListener(type: String) {
      q.h(var1, "type");
      if (q.c(var1, "BundleDownloaded")) {
         BundleUpdater.Companion
            .instance()
            .setOnBundleDownloadedListener(
               new Function1(this) {
                  final BundleUpdaterManager this$0;

                  {
                     super(1);
                     this.this$0 = var1;
                  }

                  public final void invoke(boolean var1) {
                     BundleUpdaterManager.access$getReactEvents$p(this.this$0)
                        .emitModuleEvent(BundleUpdaterManager.access$getReactContext$p(this.this$0), new BundleDownloadedEvent(var1));
                  }
               }
            );
      } else if (q.c(var1, "OtaUpdateChecked")) {
         BundleUpdater.Companion
            .instance()
            .setOnOtaUpdateCheckedListener(
               new Function1(this) {
                  final BundleUpdaterManager this$0;

                  {
                     super(1);
                     this.this$0 = var1;
                  }

                  public final void invoke(java.util.List<? extends BundleUpdater.OtaMetric> var1) {
                     q.h(var1, "metrics");
                     BundleUpdaterManager.access$getReactEvents$p(this.this$0)
                        .emitModuleEvent(BundleUpdaterManager.access$getReactContext$p(this.this$0), new OtaCheckAttemptEvent(var1));
                  }
               }
            );
      }
   }

   @ReactMethod
   public fun checkForUpdateAndReload() {
      this.showSpinnerView();
      BundleUpdater.checkForUpdate$default(BundleUpdater.Companion.instance(), 0, new Function0(this) {
         final BundleUpdaterManager this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            BundleUpdaterManager.access$removeSpinnerView(this.this$0);
            BundleUpdaterManager.access$runOnActivity(this.this$0, new Function1(this.this$0) {
               final BundleUpdaterManager this$0;

               {
                  super(1);
                  this.this$0 = var1;
               }

               public final void invoke(ViewGroup var1) {
                  q.h(var1, "$this$runOnActivity");
                  val var7: Activity = BundleUpdaterManager.access$getReactContext$p(this.this$0).getCurrentActivity();
                  if (var7 != null) {
                     var var8: Application = var7.getApplication();
                     if (var8 != null) {
                        if (var8 !is ReactApplication) {
                           var8 = null;
                        }

                        val var9: ReactApplication = var8 as ReactApplication;
                        if (var8 as ReactApplication != null) {
                           val var10: ReactNativeHost = var9.getReactNativeHost();
                           if (var10 != null) {
                              val var4: ReactInstanceManager = var10.getReactInstanceManager();
                              if (var4 != null) {
                                 val var5: BundleUpdaterManager = this.this$0;
                                 val var6: BundleUpdater.OtaBundle = BundleUpdater.Companion.instance().getBundle();
                                 var var11: java.lang.String = null;
                                 if (var6 != null) {
                                    val var12: File = var6.getLocation();
                                    var11 = null;
                                    if (var12 != null) {
                                       var11 = var12.getAbsolutePath();
                                    }
                                 }

                                 BundleUpdaterManager.access$setJSBundle(var5, var4, var11);
                                 var4.recreateReactContextInBackground();
                              }
                           }
                        }
                     }
                  }
               }
            });
         }
      }, 1, null);
   }

   @ReactMethod
   public fun getBuildOverrideCookieContents(promise: Promise) {
      q.h(var1, "promise");
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
      q.h(var1, "promise");
      var1.resolve(new BundleDownloadedEvent(BundleUpdater.Companion.instance().isVersionRequired()).serialize());
   }

   @ReactMethod
   public fun getInitialOtaUpdateChecked(promise: Promise) {
      q.h(var1, "promise");
      var1.resolve(new OtaCheckAttemptEvent(BundleUpdater.Companion.instance().getOtaMetrics()).serialize());
   }

   @ReactMethod
   public fun getManifestInfo(promise: Promise) {
      q.h(var1, "promise");
      var1.resolve(BundleUpdater.Companion.instance().manifestInfo().toNativeMap());
   }

   public open fun getName(): String {
      return "BundleUpdaterManager";
   }

   @ReactMethod
   public fun getOtaRootPath(promise: Promise) {
      q.h(var1, "promise");
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
      q.h(var1, "cookieHeader");
      BundleUpdater.Companion.instance().setBuildOverrideCookieHeader(var1);
   }

   public companion object {
      private const val BUNDLE_DOWNLOADED: String
      private const val OTA_UPDATE_CHECKED: String
   }
}
