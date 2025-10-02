package com.discord

import android.content.Context
import com.discord.app_database.AppDatabase
import com.discord.bridge.DCDReactNativeHost
import com.discord.bundle_updater.BundleUpdater
import com.discord.cache.Cache
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager
import com.discord.client_info.ClientInfo
import com.discord.crash_reporting.CrashReporting
import com.discord.crash_reporting.PerformanceTracing
import com.discord.deep_link.DeepLinks
import com.discord.image.fresco.FrescoModuleDiscord
import com.discord.lifecycle.AppLifecycle
import com.discord.media_player.CacheDataSourceFactory
import com.discord.networking.ReactNetworking
import com.discord.play_delivery.PlayAssetDelivery
import com.discord.react.FontManager
import com.discord.react_fork_overrides.ReactForkOverrides
import com.discord.sticker.sticker_types.RLottieUtils
import com.discord.theme.ThemeManager
import com.discord.tti_manager.TTILoggingApplication
import com.discord.tti_manager.TTIMetrics
import com.discord.tti_manager.react.ReactMarkerListener
import com.discord.utils.SoLoaderUtils
import com.facebook.hermes.reactexecutor.HermesExecutor
import com.facebook.react.ReactApplication
import com.facebook.react.ReactHost
import com.facebook.react.ReactNativeHost
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint
import com.facebook.react.defaults.DefaultReactHost
import com.facebook.react.modules.i18nmanager.I18nUtil
import com.facebook.react.uimanager.UIManagerConstantsCache
import java.util.concurrent.CountDownLatch

public class MainApplication : TTILoggingApplication, ReactApplication {
   public open val reactNativeHost: ReactNativeHost = new DCDReactNativeHost(this)

   public open val reactHost: ReactHost
      public open get() {
         val var1: Context = this.getApplicationContext();
         return DefaultReactHost.getDefaultReactHost(var1, this.getReactNativeHost());
      }


   private final var initializeReactNativeLatch: CountDownLatch
   private final var soloaderLoaded: CountDownLatch

   @JvmStatic
   fun `attachBaseContext$lambda$0`(var0: Context, var1: MainApplication): Unit {
      SoLoaderUtils.INSTANCE.init(var0);
      var1.soloaderLoaded.countDown();
      return Unit.a;
   }

   @JvmStatic
   fun `initialize$lambda$2`(var0: MainApplication): Unit {
      var0.soloaderLoaded.await();
      FrescoModuleDiscord.Companion.startFrescoInitializationAsync(var0);
      DefaultNewArchitectureEntryPoint.load(true, true, true);
      UIManagerConstantsCache.getInstance().init(var0);
      var0.initializeReactNativeLatch.countDown();
      HermesExecutor.loadLibrary();
      return Unit.a;
   }

   @JvmStatic
   fun `initialize$lambda$3`(var0: MainApplication): Unit {
      var var3: TTIMetrics;
      var var4: java.lang.String;
      label11: {
         AppDatabase.INSTANCE.initializeAppDatabase(var0);
         var3 = TTIMetrics.INSTANCE;
         TTIMetrics.record$default(TTIMetrics.INSTANCE, "initializeAppDatabase()", 0L, null, false, 14, null);
         I18nUtil.Companion.getInstance().allowRTL(var0, false);
         TTIMetrics.record$default(var3, "I18nUtil.allowRtl()", 0L, null, false, 14, null);
         val var1: BundleUpdater.OtaBundle = BundleUpdater.Companion.instance().getBundle();
         if (var1 != null) {
            val var2: java.lang.String = var1.getReleaseName();
            var4 = var2;
            if (var2 != null) {
               break label11;
            }
         }

         var4 = "discord_android@301.2.0-2+301202";
      }

      CrashReporting.INSTANCE.init(var0, var4);
      TTIMetrics.record$default(var3, "CrashReporting.init()", 0L, null, false, 14, null);
      return Unit.a;
   }

   @JvmStatic
   fun `onCreate$lambda$1`(var0: MainApplication): Unit {
      DeepLinks.INSTANCE.init(var0);
      return Unit.a;
   }

   protected open fun attachBaseContext(base: Context) {
      super.attachBaseContext(var1);
      F9.a.b(false, false, null, "helperReactNativeLoader", 10, new c(var1, this), 7, null);
   }

   public override fun initialize() {
      F9.a.b(false, false, null, "ReactNativeLoader", 10, new d(this), 7, null);
      val var1: TTIMetrics = TTIMetrics.INSTANCE;
      TTIMetrics.record$default(TTIMetrics.INSTANCE, "Start MainApplication.initialize()", 0L, null, false, 14, null);
      ReactMarkerListener.INSTANCE.start();
      Cache.Companion.quickInitCache(this);
      TTIMetrics.record$default(var1, "quickInitCache()", 0L, null, false, 14, null);
      val var2: BundleUpdater.Companion = BundleUpdater.Companion;
      BundleUpdater.Companion.init(this);
      TTIMetrics.record$default(var1, "BundlerUpdater.init()", 0L, null, false, 14, null);
      ClientInfo.INSTANCE.init(this, "301.2", 301202, "canary", "release", var2.instance().getManifestETag(), var2.instance().getOtaVersion());
      TTIMetrics.record$default(var1, "ClientInfo.init()", 0L, null, false, 14, null);
      CacheDataSourceFactory.Companion.init(this);
      TTIMetrics.record$default(var1, "CacheDataSourceFactory.init()", 0L, null, false, 14, null);
      F9.a.b(false, false, null, null, 0, new e(this), 31, null);
      PerformanceTracing.Companion.get().start();
      ReactNetworking.INSTANCE.patchReactNetworking();
      RLottieUtils.INSTANCE.init();
      FontManager.INSTANCE.init(this);
      ThemeManager.INSTANCE.init(this);
      AppLifecycle.INSTANCE.init();
      ReactForkOverrides.INSTANCE.init();
      AudioPlayerManager.INSTANCE.init(this);
      TTIMetrics.record$default(var1, "AudioPlayerManager.init()", 0L, null, false, 14, null);
      PlayAssetDelivery.INSTANCE.initialize(this);
      this.initializeReactNativeLatch.await();
      TTIMetrics.record$default(var1, "Finish MainApplication.initialize()", 0L, null, false, 14, null);
   }

   public override fun onCreate() {
      super.onCreate();
      F9.a.b(false, false, null, null, 0, new b(this), 31, null);
   }
}
