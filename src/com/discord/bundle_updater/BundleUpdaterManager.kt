package com.discord.bundle_updater

import B9.s
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
import db.I
import db.K
import db.k0
import java.io.File
import java.lang.reflect.Field
import java.lang.reflect.Method
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope

@SourceDebugExtension(["SMAP\nBundleUpdaterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleUpdaterManager.kt\ncom/discord/bundle_updater/BundleUpdaterManager\n+ 2 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,253:1\n8#2:254\n8#2:256\n1#3:255\n*S KotlinDebug\n*F\n+ 1 BundleUpdaterManager.kt\ncom/discord/bundle_updater/BundleUpdaterManager\n*L\n115#1:254\n243#1:256\n*E\n"])
public class BundleUpdaterManager(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents
   private final val coroutineScope: CoroutineScope
   private final var progressLayout: ViewGroup?

   init {
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(s.a("BundleDownloaded", BundleDownloadedEvent::class), s.a("OtaUpdateChecked", OtaCheckAttemptEvent::class));
      this.coroutineScope = kotlinx.coroutines.g.a(K.c().X0(k0.b(null, 1, null)));
   }

   @JvmStatic
   fun `addListener$lambda$6`(var0: BundleUpdaterManager, var1: Boolean): Unit {
      var0.reactEvents.emitModuleEvent(var0.reactContext, new BundleDownloadedEvent(var1));
      return Unit.a;
   }

   @JvmStatic
   fun `addListener$lambda$7`(var0: BundleUpdaterManager, var1: java.util.List): Unit {
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
   fun `showSpinnerView$lambda$10`(var0: BundleUpdaterManager, var1: ViewGroup): Unit {
      var1.addView(var0.progressLayout);
      return Unit.a;
   }

   private fun updateBridgeless() {
      var var1: Activity = this.reactContext.getCurrentActivity();
      val var4: ReactActivity;
      if (var1 is ReactActivity) {
         var4 = var1 as ReactActivity;
      } else {
         var4 = null;
      }

      label61: {
         if (var4 != null) {
            val var5: ReactDelegate = var4.getReactDelegate();
            if (var5 != null) {
               var6 = var5.getReactHost();
               break label61;
            }
         }

         var6 = null;
      }

      val var7: ReactHostImpl;
      if (var6 is ReactHostImpl) {
         var7 = var6 as ReactHostImpl;
      } else {
         var7 = null;
      }

      var var11: java.lang.String;
      label55: {
         val var2: BundleUpdater.OtaBundle = BundleUpdater.Companion.instance().getBundle();
         if (var2 != null) {
            val var10: File = var2.getLocation();
            if (var10 != null) {
               var11 = var10.getAbsolutePath();
               break label55;
            }
         }

         var11 = null;
      }

      label50: {
         if (var11 != null) {
            val var3: JSBundleLoader = JSBundleLoader.createFileLoader(var11);
            var12 = var3;
            if (var3 != null) {
               break label50;
            }
         }

         var12 = JSBundleLoader.createAssetLoader(this.getReactApplicationContext(), "assets://index.android.bundle", false);
      }

      val var13: Method;
      if (var7 != null) {
         var13 = var7.getClass().getDeclaredMethod("loadBundle", JSBundleLoader.class);
      } else {
         var13 = null;
      }

      if (var13 != null) {
         var13.setAccessible(true);
      }

      if (var13 != null) {
         var1 = (Activity)var13.invoke(var7, var12);
      } else {
         var1 = null;
      }

      val var9: Task;
      if (var1 is Task) {
         var9 = var1 as Task;
      } else {
         var9 = null;
      }

      if (var9 != null) {
         var9.waitForCompletion();
      }

      db.f.d(this.coroutineScope, null, null, new Function2<CoroutineScope, Continuation, Object>(this, null) {
         int label;
         final BundleUpdaterManager this$0;

         {
            super(2, var2x);
            this.this$0 = var1;
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(this.this$0, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            val var3: Any = G9.b.e();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               kotlin.c.b(var1);
            } else {
               kotlin.c.b(var1);
               this.label = 1;
               if (I.a(1000L, this) === var3) {
                  return var3;
               }
            }

            ProcessPhoenix.b(BundleUpdaterManager.access$getReactContext$p(this.this$0));
            return Unit.a;
         }
      }, 3, null);
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
      if (var1 == "BundleDownloaded") {
         BundleUpdater.Companion.instance().setOnBundleDownloadedListener(new j(this));
      } else if (var1 == "OtaUpdateChecked") {
         BundleUpdater.Companion.instance().setOnOtaUpdateCheckedListener(new k(this));
      }
   }

   @ReactMethod
   public fun checkForUpdateAndReload() {
      this.showSpinnerView();
      val var3: BundleUpdater.Companion = BundleUpdater.Companion;
      BundleUpdater.checkForUpdate$default(BundleUpdater.Companion.instance(), 0, new g(this), 1, null);
      val var2: ReactApplicationContext = this.reactContext;
      val var1: Int = MainActivity.d;
      var3.addClearBuildOverrideShortcut(var2, MainActivity::class.java);
   }

   @ReactMethod
   public fun getBuildOverrideCookieContents(promise: Promise) {
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
      var1.resolve(new BundleDownloadedEvent(BundleUpdater.Companion.instance().isVersionRequired()).serialize());
   }

   @ReactMethod
   public fun getInitialOtaUpdateChecked(promise: Promise) {
      var1.resolve(new OtaCheckAttemptEvent(BundleUpdater.Companion.instance().getOtaMetrics()).serialize());
   }

   @ReactMethod
   public fun getManifestInfo(promise: Promise) {
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
      BundleUpdater.Companion.instance().setBuildOverrideCookieHeader(var1);
   }

   public companion object {
      private const val BUNDLE_DOWNLOADED: String
      private const val OTA_UPDATE_CHECKED: String
   }
}
