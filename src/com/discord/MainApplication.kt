package com.discord

import com.discord.app_database.AppDatabaseModule
import com.discord.bridge.DCDReactNativeHost
import com.discord.bundle_updater.BundleUpdater
import com.discord.cache.CacheModule
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager
import com.discord.client_info.ClientInfo
import com.discord.crash_reporting.CrashReporting
import com.discord.crash_reporting.PerformanceTracing
import com.discord.media_player.CacheDataSourceFactory
import com.discord.play_delivery.PlayAssetDelivery
import com.discord.react.FontManager
import com.discord.react_fork_overrides.ReactForkOverrides
import com.discord.resource_usage.DeviceResourceUsageRecorder
import com.discord.sticker.sticker_types.RLottieUtils
import com.discord.theme.ThemeManager
import com.discord.tti_manager.TTILoggingApplication
import com.discord.tti_manager.TTIMetrics
import com.discord.tti_manager.react.ReactMarkerListener
import com.discord.utils.OkHttpDNSSelector
import com.discord.utils.SoLoaderUtils
import com.discord.utils.OkHttpDNSSelector.IPvMode
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint
import com.facebook.react.modules.i18nmanager.I18nUtil
import com.facebook.react.modules.network.NetworkingModule
import com.facebook.react.modules.websocket.WebSocketModule
import kotlin.jvm.internal.q
import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.Interceptor.Chain
import okhttp3.OkHttpClient.Builder

public class MainApplication : TTILoggingApplication, ReactApplication {
   public open val reactNativeHost: ReactNativeHost = new DCDReactNativeHost(this)

   @JvmStatic
   fun `initialize$lambda$0`(var0: Builder) {
      var0.b(new Interceptor(DeviceResourceUsageRecorder.Companion) {
         final DeviceResourceUsageRecorder.Companion $receiver$inlined;

         {
            this.$receiver$inlined = var1;
         }

         public final Response intercept(Chain var1) {
            q.h(var1, "chain");
            return this.$receiver$inlined.clientXHRInterceptor(var1);
         }
      });
   }

   @JvmStatic
   fun `initialize$lambda$1`(var0: Builder) {
      var0.i(new OkHttpDNSSelector(IPvMode.IPV4_FIRST));
   }

   public open fun initialize() {
      var var3: TTIMetrics;
      var var5: java.lang.String;
      label11: {
         var3 = TTIMetrics.INSTANCE;
         TTIMetrics.record$default(TTIMetrics.INSTANCE, "Start MainApplication.initialize()", 0L, null, false, 14, null);
         ReactMarkerListener.INSTANCE.start();
         CacheModule.Companion.quickInitCache(this);
         TTIMetrics.record$default(var3, "quickInitCache()", 0L, null, false, 14, null);
         AppDatabaseModule.Companion.initializeAppDatabase(this);
         TTIMetrics.record$default(var3, "initializeAppDatabase()", 0L, null, false, 14, null);
         I18nUtil.getInstance().allowRTL(this, false);
         TTIMetrics.record$default(var3, "I18nUtil.allowRtl()", 0L, null, false, 14, null);
         val var1: BundleUpdater.Companion = BundleUpdater.Companion;
         BundleUpdater.Companion.init(this);
         TTIMetrics.record$default(var3, "BundlerUpdater.init()", 0L, null, false, 14, null);
         ClientInfo.INSTANCE.init(this, "249.20", 249020, "google", "release", var1.instance().getManifestETag(), var1.instance().getOtaVersion());
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

         var5 = "discord_android@249.20.0-0+249020";
      }

      CrashReporting.INSTANCE.init(this, var5);
      TTIMetrics.record$default(var3, "CrashReporting.init()", 0L, null, false, 14, null);
      PerformanceTracing.Companion.get().start();
      SoLoaderUtils.init$default(SoLoaderUtils.INSTANCE, this, false, 2, null);
      TTIMetrics.record$default(var3, "SoLoaderUtils.init()", 0L, null, false, 14, null);
      NetworkingModule.setCustomClientBuilder(new b());
      WebSocketModule.setCustomClientBuilder(new c());
      RLottieUtils.INSTANCE.init();
      FontManager.INSTANCE.init(this);
      ThemeManager.INSTANCE.init(this);
      ReactForkOverrides.INSTANCE.init();
      AudioPlayerManager.INSTANCE.init(this);
      TTIMetrics.record$default(var3, "AudioPlayerManager.init()", 0L, null, false, 14, null);
      DefaultNewArchitectureEntryPoint.load(false, false, false);
      PlayAssetDelivery.INSTANCE.initialize(this);
      TTIMetrics.record$default(var3, "DefaultNewArchitectureEntryPoint.load()", 0L, null, false, 14, null);
      TTIMetrics.record$default(var3, "Finish MainApplication.initialize()", 0L, null, false, 14, null);
      this.getReactNativeHost().getReactInstanceManager();
   }
}
