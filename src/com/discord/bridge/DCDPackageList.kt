package com.discord.bridge

import com.discord.animatable_underlay.AnimatableUnderlayViewManager
import com.discord.animated_png.react.APNGPackage
import com.discord.audio.AudioManagerModule
import com.discord.avatar.react.AvatarPackage
import com.discord.blur.BlurViewPackage
import com.discord.channel_spine.ChannelSpineViewManager
import com.discord.chat.ChatPackage
import com.discord.chat.input.ChatInputViewManager
import com.discord.clip.ClipViewManager
import com.discord.codegen.NativeArchitectureProviderSpec
import com.discord.core.LocalImageThumbnailViewManager
import com.discord.device.DevicePackage
import com.discord.emoji_picker.react.EmojiPickerPackage
import com.discord.fast_connect.FastConnectPackage
import com.discord.fastest_list.react.FastestListPackage
import com.discord.intents.IntentsPackage
import com.discord.key_commands.KeyCommandsViewManager
import com.discord.media.engine.video.VideoStreamViewManager
import com.discord.portals.PortalsPackage
import com.discord.qr.scanner.QRScannerViewManager
import com.discord.react.FontPackage
import com.discord.react_gesture_handler.DiscordGestureHandlerPackage
import com.discord.reanimatedview.ReanimatedViewManager
import com.discord.safearea.SafeAreaPackage
import com.discord.segmented.control.SegmentedControlViewManager
import com.discord.self_measured_view.SelfMeasuredViewManager
import com.discord.sticker.react.StickerPackage
import com.discord.sticker_picker.react.StickerPickerPackage
import com.discord.suspense_visible_view.SuspenseVisibleViewPackage
import com.discord.thumbhash.ThumbhashPackage
import com.discord.tti_measurement_view.TTIMeasurementViewPackage
import com.discord.wakelock.WakelockPackage
import com.discord.zoom_layout.ZoomLayoutPackage
import com.facebook.react.PackageList
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import java.util.ArrayList
import kotlin.jvm.functions.Function1

public class DCDPackageList(host: ReactNativeHost) : PackageList(var1) {
   @JvmStatic
   fun `getPackages$lambda$0`(var0: ReactApplicationContext): ViewManager {
      return new VideoStreamViewManager();
   }

   @JvmStatic
   fun `getPackages$lambda$1`(var0: ReactApplicationContext): ViewManager {
      return new AnimatableUnderlayViewManager();
   }

   @JvmStatic
   fun `getPackages$lambda$10`(var0: ReactApplicationContext): ViewManager {
      return new ReanimatedViewManager();
   }

   @JvmStatic
   fun `getPackages$lambda$11`(var0: ReactApplicationContext): NativeModule {
      return new NativeArchitectureProviderSpec(var0) {
         {
            super(var1);
         }

         @Override
         public boolean isFabric() {
            return true;
         }
      };
   }

   @JvmStatic
   fun `getPackages$lambda$2`(var0: ReactApplicationContext): ViewManager {
      return new ChannelSpineViewManager();
   }

   @JvmStatic
   fun `getPackages$lambda$3`(var0: ReactApplicationContext): ViewManager {
      return new ChatInputViewManager();
   }

   @JvmStatic
   fun `getPackages$lambda$4`(var0: ReactApplicationContext): ViewManager {
      return new ClipViewManager();
   }

   @JvmStatic
   fun `getPackages$lambda$5`(var0: ReactApplicationContext): ViewManager {
      return new KeyCommandsViewManager();
   }

   @JvmStatic
   fun `getPackages$lambda$6`(var0: ReactApplicationContext): ViewManager {
      return new LocalImageThumbnailViewManager();
   }

   @JvmStatic
   fun `getPackages$lambda$7`(var0: ReactApplicationContext): ViewManager {
      return new QRScannerViewManager();
   }

   @JvmStatic
   fun `getPackages$lambda$8`(var0: ReactApplicationContext): ViewManager {
      return new SegmentedControlViewManager();
   }

   @JvmStatic
   fun `getPackages$lambda$9`(var0: ReactApplicationContext): ViewManager {
      return new SelfMeasuredViewManager();
   }

   public open fun getPackages(): ArrayList<ReactPackage> {
      val var2: ArrayList = super.getPackages();
      val var1: DCDModuleProvider = DCDModuleProvider.INSTANCE;
      var2.add(DCDModuleProvider.INSTANCE.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(DCDModuleProvider.getLegacyPackageForModuleWithViewManager$default(var1, null, new a(), 1, null));
      var2.add(var1.getViewManagers(new f(), new g(), new h(), new i(), new j(), new k(), new l(), new b(), new c(), new d()));
      var2.add(var1.getTurboPackageForModule("NativeAdsModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeAppDatabaseModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeAppIconModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeApplicationReadyModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeAppLifecycleModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeAppRatingRequestModule", <unrepresentable>.INSTANCE));
      var2.add(
         var1.getTurboPackageForModule(
            "NativeAudioManagerModule",
            new Function1<ReactApplicationContext, NativeModule>(AudioManagerModule.Companion) {
               {
                  super(
                     1,
                     var1,
                     AudioManagerModule.Companion::class.java,
                     "create",
                     "create(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;",
                     0
                  );
               }

               public final NativeModule invoke(ReactApplicationContext var1) {
                  return (super.receiver as AudioManagerModule.Companion).create(var1);
               }
            }
         )
      );
      var2.add(var1.getTurboPackageForModule("NativeAudioPlayerModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeAudioRouteEmitterModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeBrowserManagerModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeCacheModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeClientInfoModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeCommandClipboardModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeCompressionModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeDateFormatUtilsModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeFileModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeI18nModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeJankStatsModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeJSWatchdogModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNKeyCommandsModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeKeyboardModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeMetricMonitorModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeMobileVoiceOverlayModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeOnDemandResourceModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativePushNotificationMonitorModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeReactAssetModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeStartupFlagsModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeThemeModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeTimersModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeMediaEngineModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeArchitectureProvider", new e()));
      var1.addTurboPackages(
         var2,
         new APNGPackage(),
         new AvatarPackage(),
         new BlurViewPackage(),
         new ChatPackage(),
         new DevicePackage(),
         new DiscordGestureHandlerPackage(),
         new EmojiPickerPackage(),
         new FastConnectPackage(),
         new FastestListPackage(),
         new FontPackage(),
         new IntentsPackage(),
         new PortalsPackage(),
         new SafeAreaPackage(),
         new SuspenseVisibleViewPackage(),
         new StickerPackage(),
         new StickerPickerPackage(),
         new ThumbhashPackage(),
         new TTIMeasurementViewPackage(),
         new WakelockPackage(),
         new ZoomLayoutPackage()
      );
      return var2;
   }
}
