package com.discord.bundle_updater

import android.app.Activity
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
import com.facebook.react.ReactDelegate
import com.facebook.react.bridge.JSBundleLoader
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.WritableNativeMap
import com.facebook.react.runtime.ReactHostImpl
import com.facebook.react.runtime.internal.bolts.Task
import com.jakewharton.processphoenix.ProcessPhoenix
import gu.i0
import gu.j1
import gu.m0
import ht.v
import java.io.File
import java.lang.reflect.Method
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope

@SourceDebugExtension(["SMAP\nBundleUpdaterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleUpdaterManager.kt\ncom/discord/bundle_updater/BundleUpdaterManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n*L\n1#1,202:1\n1#2:203\n8#3:204\n*S KotlinDebug\n*F\n+ 1 BundleUpdaterManager.kt\ncom/discord/bundle_updater/BundleUpdaterManager\n*L\n192#1:204\n*E\n"])
public class BundleUpdaterManager(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents
   private final val coroutineScope: CoroutineScope
   private final var progressLayout: ViewGroup?

   init {
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(
         new Pair[]{v.a("BundleDownloaded", BundleDownloadedEvent::class), v.a("OtaUpdateChecked", OtaCheckAttemptEvent::class)}
      );
      this.coroutineScope = kotlinx.coroutines.i.a(m0.c().Q0(j1.b(null, 1, null)));
   }

   @JvmStatic
   fun `addListener$lambda$3`(var0: BundleUpdaterManager, var1: Boolean): Unit {
      var0.reactEvents.emitModuleEvent(var0.reactContext, new BundleDownloadedEvent(var1));
      return Unit.a;
   }

   @JvmStatic
   fun `addListener$lambda$4`(var0: BundleUpdaterManager, var1: java.util.List): Unit {
      var0.reactEvents.emitModuleEvent(var0.reactContext, new OtaCheckAttemptEvent(var1));
      return Unit.a;
   }

   @JvmStatic
   fun `checkForUpdateAndReload$lambda$1`(var0: BundleUpdaterManager): Unit {
      var0.removeSpinnerView();
      var0.runOnActivity(new com.discord.bundle_updater.i(var0));
      return Unit.a;
   }

   @JvmStatic
   fun `checkForUpdateAndReload$lambda$1$lambda$0`(var0: BundleUpdaterManager, var1: ViewGroup): Unit {
      var0.update();
      return Unit.a;
   }

   private fun removeSpinnerView() {
      this.runOnActivity(new com.discord.bundle_updater.f(this));
   }

   @JvmStatic
   fun `removeSpinnerView$lambda$9`(var0: BundleUpdaterManager, var1: ViewGroup): Unit {
      if (var0.progressLayout != null) {
         var1.removeView(var0.progressLayout);
      }

      var0.progressLayout = null;
      return Unit.a;
   }

   private fun runOnActivity(callback: (ViewGroup) -> Unit) {
      val var2: Activity = this.reactContext.getCurrentActivity();
      if (var2 != null) {
         var2.runOnUiThread(new com.discord.bundle_updater.h(var2, var1));
      }
   }

   @JvmStatic
   fun `runOnActivity$lambda$11$lambda$10`(var0: Activity, var1: Function1) {
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
   fun `showSpinnerView$lambda$7`(var0: BundleUpdaterManager, var1: ViewGroup): Unit {
      var1.addView(var0.progressLayout);
      return Unit.a;
   }

   private fun update() {
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

      gu.g.d(this.coroutineScope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null) {
         int label;
         final BundleUpdaterManager this$0;

         {
            super(2, var2x);
            this.this$0 = var1;
         }

         @Override
         public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
            return new <anonymous constructor>(this.this$0, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         @Override
         public final Object invokeSuspend(Object var1) {
            val var3: Any = ot.b.f();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               kotlin.c.b(var1);
            } else {
               kotlin.c.b(var1);
               this.label = 1;
               if (i0.a(1000L, this) === var3) {
                  return var3;
               }
            }

            ProcessPhoenix.b(BundleUpdaterManager.access$getReactContext$p(this.this$0));
            return Unit.a;
         }
      }, 3, null);
   }

   @ReactMethod
   public fun addListener(type: String) {
      if (var1 == "BundleDownloaded") {
         BundleUpdater.Companion.instance().setOnBundleDownloadedListener(new com.discord.bundle_updater.j(this));
      } else {
         if (var1 == "OtaUpdateChecked") {
            BundleUpdater.Companion.instance().setOnOtaUpdateCheckedListener(new k(this));
         }
      }
   }

   @ReactMethod
   public fun checkForUpdateAndReload() {
      this.showSpinnerView();
      val var2: BundleUpdater.Companion = BundleUpdater.Companion;
      BundleUpdater.checkForUpdate$default(BundleUpdater.Companion.instance(), 0, new com.discord.bundle_updater.g(this), 1, null);
      val var3: ReactApplicationContext = this.reactContext;
      val var1: Int = MainActivity.d;
      var2.addClearBuildOverrideShortcut(var3, MainActivity::class.java);
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
