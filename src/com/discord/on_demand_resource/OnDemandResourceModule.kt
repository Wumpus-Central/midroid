package com.discord.on_demand_resource

import com.discord.codegen.NativeOnDemandResourceSpec
import com.discord.play_delivery.PlayAssetDelivery
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

public class OnDemandResourceModule(reactContext: ReactApplicationContext) : NativeOnDemandResourceSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public open fun fetchOnDemandResource(resourceName: String?, promise: Promise?) {
      if (var1 != null) {
         val var3: Function1;
         if (var2 != null) {
            var3 = new Function1<java.lang.Boolean, Unit>(var2) {
               final Promise $it;

               {
                  super(1);
                  this.$it = var1;
               }

               public final void invoke(boolean var1) {
                  this.$it.resolve(var1);
               }
            };
         } else {
            var3 = null;
         }

         PlayAssetDelivery.INSTANCE.getOrFetchAssetPackLocation(var1, var3);
      }
   }

   public open fun hasOnDemandResource(resourceName: String?): Boolean {
      var var2: Boolean = false;
      if (var1 != null && PlayAssetDelivery.getOrFetchAssetPackLocation$default(PlayAssetDelivery.INSTANCE, var1, null, 2, null) != null) {
         var2 = true;
      }

      return var2;
   }

   public open fun isOnDemandResourcingAvailable(): Boolean {
      return PlayAssetDelivery.INSTANCE.isAssetDeliveryAvailable();
   }

   public companion object {
      public const val NAME: String
   }
}
