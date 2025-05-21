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
import java.util.concurrent.CountDownLatch
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

public class MainApplication : TTILoggingApplication, ReactApplication {
   private final var initializeReactNativeLatch: CountDownLatch

   public open val reactHost: ReactHost
      public open get() {
         val var1: Context = this.getApplicationContext();
         q.g(var1, "getApplicationContext(...)");
         return DefaultReactHost.getDefaultReactHost(var1, this.getReactNativeHost());
      }


   public open val reactNativeHost: ReactNativeHost = new DCDReactNativeHost(this)

   public override fun initialize() {
      var var3: TTIMetrics;
      var var5: java.lang.String;
      label11: {
         t8.a.b(false, false, null, "ReactNativeLoader", 10, new Function0(this) {
            final MainApplication this$0;

            {
               super(0);
               this.this$0 = var1;
            }

            public final void invoke() {
               SoLoaderUtils.INSTANCE.init(this.this$0);
               DefaultNewArchitectureEntryPoint.load(false, false, false);
               MainApplication.access$getInitializeReactNativeLatch$p(this.this$0).countDown();
               HermesExecutor.loadLibrary();
            }
         }, 7, null);
         var3 = TTIMetrics.INSTANCE;
         TTIMetrics.record$default(TTIMetrics.INSTANCE, "Start MainApplication.initialize()", 0L, null, false, 14, null);
         ReactMarkerListener.INSTANCE.start();
         Cache.Companion.quickInitCache(this);
         TTIMetrics.record$default(var3, "quickInitCache()", 0L, null, false, 14, null);
         AppDatabase.INSTANCE.initializeAppDatabase(this);
         TTIMetrics.record$default(var3, "initializeAppDatabase()", 0L, null, false, 14, null);
         I18nUtil.Companion.getInstance().allowRTL(this, false);
         TTIMetrics.record$default(var3, "I18nUtil.allowRtl()", 0L, null, false, 14, null);
         val var1: BundleUpdater.Companion = BundleUpdater.Companion;
         BundleUpdater.Companion.init(this);
         TTIMetrics.record$default(var3, "BundlerUpdater.init()", 0L, null, false, 14, null);
         ClientInfo.INSTANCE.init(this, "281.8", 281108, "beta", "release", var1.instance().getManifestETag(), var1.instance().getOtaVersion());
         TTIMetrics.record$default(var3, "ClientInfo.init()", 0L, null, false, 14, null);
         CacheDataSourceFactory.Companion.init(this);
         TTIMetrics.record$default(var3, "CacheDataSourceFactory.init()", 0L, null, false, 14, null);
         val var4: BundleUpdater.OtaBundle = var1.instance().getBundle();
         if (var4 != null) {
            val var2: java.lang.String = var4.getReleaseName();
            var5 = var2;
            if (var2 != null) {
               break label11;
            }
         }

         var5 = "discord_android@281.8.0-1+281108";
      }

      CrashReporting.INSTANCE.init(this, var5);
      TTIMetrics.record$default(var3, "CrashReporting.init()", 0L, null, false, 14, null);
      PerformanceTracing.Companion.get().start();
      ReactNetworking.INSTANCE.patchReactNetworking();
      RLottieUtils.INSTANCE.init();
      FontManager.INSTANCE.init(this);
      ThemeManager.INSTANCE.init(this);
      AppLifecycle.INSTANCE.init();
      ReactForkOverrides.INSTANCE.init();
      AudioPlayerManager.INSTANCE.init(this);
      TTIMetrics.record$default(var3, "AudioPlayerManager.init()", 0L, null, false, 14, null);
      PlayAssetDelivery.INSTANCE.initialize(this);
      this.initializeReactNativeLatch.await();
      TTIMetrics.record$default(var3, "Finish MainApplication.initialize()", 0L, null, false, 14, null);
   }
}
