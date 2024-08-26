package com.discord.bridge

import com.discord.animated_png.react.APNGPackage
import com.discord.avatar.react.AvatarPackage
import com.discord.blur.BlurViewPackage
import com.discord.chat.ChatPackage
import com.discord.emoji_picker.react.EmojiPickerPackage
import com.discord.fastest_list.react.FastestListPackage
import com.discord.flipper.FlipperUtils
import com.discord.portals.PortalsPackage
import com.discord.react_gesture_handler.DiscordGestureHandlerPackage
import com.discord.sticker.react.StickerPackage
import com.discord.sticker_picker.react.StickerPickerPackage
import com.discord.thumbhash.ThumbhashPackage
import com.facebook.react.PackageList
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import java.util.ArrayList
import kotlin.jvm.internal.r

public class DCDPackageList(host: ReactNativeHost) : PackageList {
   init {
      r.h(var1, "host");
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
      var2.add(new APNGPackage());
      var2.add(new AvatarPackage());
      var2.add(new BlurViewPackage());
      var2.add(new ChatPackage());
      var2.add(new DiscordGestureHandlerPackage());
      var2.add(new EmojiPickerPackage());
      var2.add(new FastestListPackage());
      var2.add(new PortalsPackage());
      var2.add(new StickerPackage());
      var2.add(new StickerPickerPackage());
      var2.add(new ThumbhashPackage());
      var2.add(FlipperUtils.INSTANCE.getFlipperPackage());
      var2.add(var1.getLegacyPackageForModuleWithViewManager(<unrepresentable>.INSTANCE, <unrepresentable>.INSTANCE));
      var2.add(var1.getLegacyPackageForModuleWithViewManager(<unrepresentable>.INSTANCE, <unrepresentable>.INSTANCE));
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
            <unrepresentable>.INSTANCE
         )
      );
      var2.add(var1.getTurboPackageForModule("RTNAppIconManager", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNApplicationReadyManager", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNAppRatingRequestManager", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNAudioRouteEmitter", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNClientInfoManager", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNClipboardManager", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("CPUPnQModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNDeviceLocaleManager", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNDeviceManager", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNDevicePerformanceManager", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNFileManager", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("JankStatsModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("JSWatchdogModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNKeyboardManager", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNNativeMetricMonitor", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNMobileVoiceOverlay", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNOnDemandResource", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNNativePushNotificationMonitor", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNStartupFlags", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNThemeManager", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("TimersModule", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNArchitectureProvider", <unrepresentable>.INSTANCE));
      var2.add(var1.getTurboPackageForModule("RTNAudioManager", <unrepresentable>.INSTANCE));
      r.g(var2, "packages");
      return var2;
   }
}
