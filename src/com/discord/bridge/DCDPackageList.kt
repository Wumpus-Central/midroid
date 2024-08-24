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
      val var1: ArrayList = super.getPackages();
      val var2: DCDModuleProvider = DCDModuleProvider.INSTANCE;
      var1.add(DCDModuleProvider.INSTANCE.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModule(<unrepresentable>.INSTANCE));
      var1.add(new APNGPackage());
      var1.add(new AvatarPackage());
      var1.add(new BlurViewPackage());
      var1.add(new ChatPackage());
      var1.add(new DiscordGestureHandlerPackage());
      var1.add(new EmojiPickerPackage());
      var1.add(new FastestListPackage());
      var1.add(new PortalsPackage());
      var1.add(new StickerPackage());
      var1.add(new StickerPickerPackage());
      var1.add(new ThumbhashPackage());
      var1.add(FlipperUtils.INSTANCE.getFlipperPackage());
      var1.add(var2.getLegacyPackageForModuleWithViewManager(<unrepresentable>.INSTANCE, <unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModuleWithViewManager(<unrepresentable>.INSTANCE, <unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModuleWithViewManager(<unrepresentable>.INSTANCE, <unrepresentable>.INSTANCE));
      var1.add(var2.getLegacyPackageForModuleWithViewManager(<unrepresentable>.INSTANCE, <unrepresentable>.INSTANCE));
      var1.add(
         var2.getViewManagers(
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
      var1.add(var2.getTurboPackageForModule("RTNAppIconManager", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNApplicationReadyManager", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNAppRatingRequestManager", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNAudioRouteEmitter", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNClientInfoManager", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNClipboardManager", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("CPUPnQModule", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNDeviceLocaleManager", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNDeviceManager", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNDevicePerformanceManager", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNFileManager", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("JankStatsModule", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("JSWatchdogModule", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNKeyboardManager", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNNativeMetricMonitor", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNMobileVoiceOverlay", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNOnDemandResource", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNNativePushNotificationMonitor", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNStartupFlags", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNThemeManager", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("TimersModule", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNArchitectureProvider", <unrepresentable>.INSTANCE));
      var1.add(var2.getTurboPackageForModule("RTNAudioManager", <unrepresentable>.INSTANCE));
      r.g(var1, "packages");
      return var1;
   }
}
