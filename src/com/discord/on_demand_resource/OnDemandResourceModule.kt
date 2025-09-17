package com.discord.on_demand_resource

import W1.a
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

   public override fun fetchOnDemandResource(resourceName: String?, promise: Promise?) {
      if (var1 != null) {
         val var3: a;
         if (var2 != null) {
            var3 = new a(var2);
         } else {
            var3 = null;
         }

         PlayAssetDelivery.INSTANCE.getOrFetchAssetPackLocation(var1, var3);
      }
   }

   public override fun hasOnDemandResource(resourceName: String?): Boolean {
      var var2: Boolean = false;
      if (var1 != null && PlayAssetDelivery.getOrFetchAssetPackLocation$default(PlayAssetDelivery.INSTANCE, var1, null, 2, null) != null) {
         var2 = true;
      }

      return var2;
   }

   public override fun isOnDemandResourcingAvailable(): Boolean {
      return PlayAssetDelivery.INSTANCE.isAssetDeliveryAvailable();
   }
}
