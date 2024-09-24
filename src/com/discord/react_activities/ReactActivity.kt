package com.discord.react_activities

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.view.Window
import com.discord.bundle_updater.BundleUpdater
import com.discord.cpu_pnq.CPUPnQManager
import com.discord.crash_reporting.CrashReporting
import com.discord.jank_stats.JankStatsAggregator
import com.discord.js_watchdog.JSWatchdogManager
import com.discord.main.MainActivity
import com.discord.safearea.extensions.ImmersiveMode
import com.discord.scale.FontScaleUtilsKt
import com.discord.share.ShareActivity
import com.discord.theme.ThemeManager
import com.discord.tti_manager.TTILoggingApplication
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint
import h7.b
import java.util.concurrent.Future
import kotlin.jvm.internal.q

public abstract class ReactActivity : com.facebook.react.ReactActivity {
   internal final lateinit var rootView: ReactRootView

   @JvmStatic
   fun {
      q.g(MainActivity::class.java, "forName(...)");
      q.g(ShareActivity::class.java, "forName(...)");
   }

   protected open fun attachBaseContext(newBase: Context) {
      q.h(var1, "newBase");
      super.attachBaseContext(FontScaleUtilsKt.getFontScaledContext(var1));
      var1 = this.getApplicationContext();
      q.g(var1, "getApplicationContext(...)");
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
      q.h(var1, "newConfig");
      super.onConfigurationChanged(var1);
      b.m.a(this, var1);
   }

   protected open fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(null);
      BundleUpdater.Companion.checkForOta();
      ImmersiveMode.INSTANCE.enableImmersiveMode(this);
      val var2: JankStatsAggregator = JankStatsAggregator.INSTANCE;
      val var3: Window = this.getWindow();
      q.g(var3, "getWindow(...)");
      var2.initialize(var3);
      CPUPnQManager.INSTANCE.initialize();
      JSWatchdogManager.INSTANCE.initialize(this);
      val var4: ThemeManager = ThemeManager.INSTANCE;
      ThemeManager.INSTANCE.updateSystemUi(this);
      var4.updateWindowBackground(this, true);
   }

   protected open fun onPause() {
      super.onPause();
      JankStatsAggregator.INSTANCE.disableTracking();
      JSWatchdogManager.INSTANCE.disable();
      CPUPnQManager.INSTANCE.onPause();
   }

   protected open fun onResume() {
      super.onResume();
      JankStatsAggregator.INSTANCE.enableTracking();
      JSWatchdogManager.INSTANCE.enable();
      CPUPnQManager.INSTANCE.onResume();
   }

   public open inner class ActivityDelegate(activity: ReactActivity) : ReactActivityDelegate {
      init {
         q.h(var2, "activity");
         this.this$0 = var1;
         super(var2, var1.getNameOfComponent());
         TTILoggingApplication.Companion.trackActivityDelegateInitialized();
         val var3: CrashReporting = CrashReporting.INSTANCE;
         if (q.c(CrashReporting.INSTANCE.isCrashedLastRun(), java.lang.Boolean.TRUE)) {
            CrashReporting.addBreadcrumb$default(var3, "Checking for blocking OTA update", null, null, 6, null);
            val var4: Future = BundleUpdater.checkForUpdate$default(BundleUpdater.Companion.instance(), 0, null, 2, null);
            if (var4 != null) {
               var4.get();
            }
         }
      }

      protected open fun createRootView(): com.facebook.react.ReactRootView {
         val var1: Context = this.getContext();
         q.g(var1, "getContext(...)");
         val var2: ReactRootView = new ReactRootView(var1);
         var2.setIsFabric(DefaultNewArchitectureEntryPoint.getFabricEnabled());
         this.this$0.setRootView$react_activity_release(var2);
         return var2;
      }

      protected open fun createRootView(initialProps: Bundle?): com.facebook.react.ReactRootView {
         return this.createRootView();
      }

      protected open fun isFabricEnabled(): Boolean {
         return DefaultNewArchitectureEntryPoint.getFabricEnabled();
      }
   }

   public companion object Registry {
      public final val mainActivity: Class<*>
      public final val shareActivity: Class<*>
   }
}
