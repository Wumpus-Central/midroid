package com.discord.react_activities

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.view.Window
import com.discord.bundle_updater.BundleUpdater
import com.discord.crash_reporting.CrashReporting
import com.discord.jank_stats.JankStatsAggregator
import com.discord.js_watchdog.JSWatchdogManager
import com.discord.safearea.extensions.ImmersiveMode
import com.discord.scale.FontScaleUtilsKt
import com.discord.theme.ThemeManager
import com.discord.tti_manager.TTILoggingApplication
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.bridge.ReactContext
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint
import java.util.concurrent.Future

public abstract class ReactActivity : com.facebook.react.ReactActivity {
   protected open fun attachBaseContext(newBase: Context) {
      super.attachBaseContext(FontScaleUtilsKt.getFontScaledContext(var1));
      var1 = this.getApplicationContext();
      FontScaleUtilsKt.setFontScaleDeprecated(var1);
   }

   protected fun createReactActivityDelegate(): com.discord.react_activities.ReactActivity.ActivityDelegate {
      return this.getActivityDelegate();
   }

   public abstract fun getActivityDelegate(): com.discord.react_activities.ReactActivity.ActivityDelegate {
   }

   protected fun getMainComponentName(): String {
      return this.getNameOfComponent();
   }

   public abstract fun getNameOfComponent(): String {
   }

   public open fun onConfigurationChanged(newConfig: Configuration) {
      super.onConfigurationChanged(var1);
      a4.b.m.a(this, var1);
   }

   protected open fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(null);
      BundleUpdater.Companion.checkForOta();
      ImmersiveMode.INSTANCE.enableImmersiveMode(this);
      val var2: JankStatsAggregator = JankStatsAggregator.INSTANCE;
      val var3: Window = this.getWindow();
      var2.initialize(var3);
      JSWatchdogManager.INSTANCE.initialize(this);
      val var4: ThemeManager = ThemeManager.INSTANCE;
      ThemeManager.INSTANCE.updateSystemUi(this);
      var4.updateWindowBackground(this, true);
   }

   protected open fun onPause() {
      super.onPause();
      JankStatsAggregator.INSTANCE.disableTracking();
      JSWatchdogManager.INSTANCE.disable();
   }

   protected open fun onResume() {
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

      protected open fun createRootView(): com.facebook.react.ReactRootView? {
         val var1: Context = this.getContext();
         val var2: ReactRootView = new ReactRootView(var1);
         var2.setIsFabric(this.isFabricEnabled());
         return var2;
      }

      protected open fun isFabricEnabled(): Boolean {
         return DefaultNewArchitectureEntryPoint.getFabricEnabled();
      }

      @SuppressLint(["VisibleForTests"])
      public open fun onPause() {
         val var1: ReactContext = this.getReactNativeHost().getReactInstanceManager().getCurrentReactContext();
         val var2: Activity;
         if (var1 != null) {
            var2 = var1.getCurrentActivity();
         } else {
            var2 = null;
         }

         if (this.this$0 === var2) {
            super.onPause();
         }
      }
   }

   public companion object Registry {
      public final val mainActivity: Class<*>
      public final val shareActivity: Class<*>
   }
}
