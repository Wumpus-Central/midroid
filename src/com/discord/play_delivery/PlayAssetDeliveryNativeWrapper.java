package com.discord.play_delivery;

public class PlayAssetDeliveryNativeWrapper {
   public static String getKrispAssetPackLocation() {
      String var1 = PlayAssetDelivery.INSTANCE.getOrFetchAssetPackLocation("krisp", null);
      String var0 = var1;
      if (var1 == null) {
         var0 = "";
      }

      return var0;
   }
}
