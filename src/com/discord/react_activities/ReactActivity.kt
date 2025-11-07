package com.discord.react_activities

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.os.Build.VERSION
import android.view.Window
import com.discord.bundle_updater.BundleUpdater
import com.discord.crash_reporting.CrashReporting
import com.discord.jank_stats.JankStatsAggregator
import com.discord.js_watchdog.JSWatchdogManager
import com.discord.logging.Log
import com.discord.safearea.extensions.ImmersiveMode
import com.discord.scale.FontScaleUtilsKt
import com.discord.theme.ThemeManager
import com.discord.tti_manager.TTILoggingApplication
import com.discord.tti_manager.TTIModule
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.ReactRootView
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint
import fd.b
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

public abstract class ReactActivity : com.facebook.react.ReactActivity {
   protected open fun attachBaseContext(newBase: Context) {
      if (VERSION.SDK_INT < 28) {
         val var2: java.lang.String = this.getClass().getName();
         if (StringsKt.y(var2, ".MainActivity", false, 2, null)) {
            TTIModule.Companion.markMainActivityCreation$default(TTIModule.Companion, null, 1, null);
         } else {
            TTIModule.Companion.markActivityBeforeMain(var2);
         }
      }

      if (!prepareEverythingForActivity.await(30L, TimeUnit.SECONDS)) {
         Log.e$default(Log.INSTANCE, "ReactActivity", "Timeout waiting for application initialization - proceeding anyway", null, 4, null);
      }

      super.attachBaseContext(FontScaleUtilsKt.getFontScaledContext(var1));
      var1 = this.getApplicationContext();
      FontScaleUtilsKt.setFontScaleDeprecated(var1);
   }

   protected fun createReactActivityDelegate(): com.discord.react_activities.ReactActivity.ActivityDelegate {
      return this.getActivityDelegate();
   }

   public abstract fun getActivityDelegate(): com.discord.react_activities.ReactActivity.ActivityDelegate {
   }

   protected override fun getMainComponentName(): String {
      return this.getNameOfComponent();
   }

   public abstract fun getNameOfComponent(): String {
   }

   public override fun onConfigurationChanged(newConfig: Configuration) {
      super.onConfigurationChanged(var1);
      b.t.a(this, var1);
      val var2: Context = this.getApplicationContext();
      FontScaleUtilsKt.setFontScaleDeprecated(var2);
   }

   protected override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(null);
      if (VERSION.SDK_INT < 28) {
         val var3: java.lang.String = this.getClass().getName();
         if (StringsKt.y(var3, ".MainActivity", false, 2, null)) {
            TTIModule.Companion.setMainActivityIntent(this.getIntent());
         }
      }

      BundleUpdater.Companion.checkForOta();
      ImmersiveMode.INSTANCE.enableImmersiveMode(this);
      val var4: JankStatsAggregator = JankStatsAggregator.INSTANCE;
      val var2: Window = this.getWindow();
      var4.initialize(var2);
      JSWatchdogManager.INSTANCE.initialize(this);
      val var5: ThemeManager = ThemeManager.INSTANCE;
      ThemeManager.INSTANCE.updateSystemUi(this);
      var5.updateWindowBackground(this, true);
   }

   protected override fun onDestroy() {
      super.onDestroy();
      val var1: java.lang.String = this.getClass().getName();
      if (StringsKt.y(var1, ".MainActivity", false, 2, null) && !this.isChangingConfigurations()) {
         TTIModule.Companion.clearMainActivityCreation();
      }
   }

   protected override fun onPause() {
      super.onPause();
      JankStatsAggregator.INSTANCE.disableTracking();
      JSWatchdogManager.INSTANCE.disable();
   }

   protected override fun onResume() {
      super.onResume();
      JankStatsAggregator.INSTANCE.enableTracking();
      JSWatchdogManager.INSTANCE.enable();
   }

   public open inner class ActivityDelegate(activity: ReactActivity) : ReactActivityDelegate(var2, var1.getNameOfComponent()) {
      init {
         this.this$0 = var1;
         TTILoggingApplication.Companion.trackActivityDelegateInitialized();
         val var3: CrashReporting = CrashReporting.INSTANCE;
         if (CrashReporting.INSTANCE.isCrashedLastRun() == java.lang.Boolean.TRUE) {
            CrashReporting.addBreadcrumb$default(var3, "Checking for blocking OTA update", null, null, null, 14, null);
            val var4: Future = BundleUpdater.checkForUpdate$default(BundleUpdater.Companion.instance(), 0, null, 2, null);
            if (var4 != null) {
               var4.get();
            }
         }
      }

      protected override fun createRootView(): ReactRootView? {
         val var1: Context = this.getContext();
         val var2: com.discord.react_rootview.ReactRootView = new com.discord.react_rootview.ReactRootView(var1);
         var2.setIsFabric(this.isFabricEnabled());
         return var2;
      }

      protected override fun isFabricEnabled(): Boolean {
         return DefaultNewArchitectureEntryPoint.getFabricEnabled();
      }
   }

   public companion object Registry {
      public final val prepareEverythingForActivity: CountDownLatch
      public final val mainActivity: Class<*>
      public final val shareActivity: Class<*>
   }
}
