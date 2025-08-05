package com.discord;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Locale;

public class DiscordMediaCodec {
   static final String[] KNOWN_BAD_ENCODER_MODELS = new String[]{"samsung-sgh-i337", "nexus 4", "nexus 7"};
   static final String[] KNOWN_HARDWARE_ENCODER_PREFIXES = new String[]{
      "omx.qcom.", "omx.exynos.", "omx.intel.", "omx.nvidia.", "omx.mtk.", "omx.hisi.", "omx.img.topaz."
   };

   private static boolean isHardwareAccelerated_API29(MediaCodecInfo var0) {
      return a.a(var0);
   }

   public static boolean supportsHardwareEncoding(MediaCodecInfo var0) {
      String[] var3 = KNOWN_BAD_ENCODER_MODELS;
      int var2 = var3.length;

      for (int var1 = 0; var1 < var2; var1++) {
         if (var3[var1].equalsIgnoreCase(Build.MODEL)) {
            return false;
         }
      }

      if (VERSION.SDK_INT >= 29) {
         return isHardwareAccelerated_API29(var0);
      } else {
         String var7 = var0.getName().toLowerCase(Locale.ROOT);
         String[] var4 = KNOWN_HARDWARE_ENCODER_PREFIXES;
         var2 = var4.length;

         for (int var5 = 0; var5 < var2; var5++) {
            if (var7.startsWith(var4[var5])) {
               return true;
            }
         }

         return false;
      }
   }
}
