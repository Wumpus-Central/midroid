package com.discord.bridge

import com.discord.animated_png.react.APNGPackage
import com.discord.audio.AudioManagerModule
import com.discord.avatar.react.AvatarPackage
import com.discord.blur.BlurViewPackage
import com.discord.chat.ChatPackage
import com.discord.device.DevicePackage
import com.discord.emoji_picker.react.EmojiPickerPackage
import com.discord.fast_connect.FastConnectPackage
import com.discord.fastest_list.react.FastestListPackage
import com.discord.intents.IntentsPackage
import com.discord.portals.PortalsPackage
import com.discord.react_gesture_handler.DiscordGestureHandlerPackage
import com.discord.safearea.SafeAreaPackage
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
import java.util.ArrayList
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public class DCDPackageList(host: ReactNativeHost) : PackageList {
   init {
      q.h(var1, "host");
      super(var1);
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
      var2.add(var1.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModuleWithViewManager(<unrepresentable>.INSTANCE, <unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModuleWithViewManager(<unrepresentable>.INSTANCE, <unrepresentable>.INSTANCE));
      var2.add(
         var1.getViewManagers(
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE
         )
      );
      var2.add(var1.getTurboPackageForModule("NativeAppDatabaseModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeAppIconModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeApplicationReadyModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeAppLifecycleModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("NativeAppRatingRequestModule", <unrepresentable>.INSTANCE));
      var2.add(
         var1.getTurboPackageForModule(
            "NativeAudioManagerModule",
            new Function1(AudioManagerModule.Companion) {
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
                  q.h(var1, "p0");
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
      var2.add(var1.getTurboPackageForModule("NativeCPUPnQModule", <unrepresentable>.INSTANCE));
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
      var2.add(var1.getTurboPackageForModule("NativeArchitectureProvider", <unrepresentable>.INSTANCE));
      q.e(var2);
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
