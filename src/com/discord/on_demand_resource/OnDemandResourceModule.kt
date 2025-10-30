package com.discord.on_demand_resource

import b7.a
import com.discord.codegen.NativeOnDemandResourceModuleSpec
import com.discord.play_delivery.PlayAssetDelivery
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext

public class OnDemandResourceModule(reactContext: ReactApplicationContext) : NativeOnDemandResourceModuleSpec(var1) {
   @JvmStatic
   fun `fetchOnDemandResource$lambda$1$lambda$0`(var0: Promise, var1: Boolean): Unit {
      var0.resolve(var1);
      return Unit.a;
   }

   public open fun fetchOnDemandResource(resourceName: String?, promise: Promise?) {
      if (var1 != null) {
         val var3: a;
         if (var2 != null) {
            var3 = new a(var2);
         } else {
            var3 = null;
         }

         PlayAssetDelivery.INSTANCE.getAssetPackLocation(var1, true, var3);
      }
   }

   public open fun hasOnDemandResource(resourceName: String?): Boolean {
      if (var1 == null) {
         return false;
      } else {
         return PlayAssetDelivery.getAssetPackLocation$default(PlayAssetDelivery.INSTANCE, var1, false, null, 4, null) != null;
      }
   }

   public open fun isOnDemandResourcingAvailable(): Boolean {
      return PlayAssetDelivery.INSTANCE.isAssetDeliveryAvailable();
   }
}
