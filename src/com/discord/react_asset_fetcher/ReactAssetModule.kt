package com.discord.react_asset_fetcher

import com.discord.react_resource_cache.ReactResourceCache
import com.discord.react_resource_cache.ReactResourceModule
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableArray
import kotlin.jvm.internal.r

public class ReactAssetModule(reactContext: ReactApplicationContext) : ReactResourceModule<ReactAsset> {
   private final val reactContext: ReactApplicationContext

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   public override fun cache(): ReactResourceCache<ReactAsset> {
      val var1: ReactAssetCache = ReactAssetCache.INSTANCE;
      r.f(
         ReactAssetCache.INSTANCE,
         "null cannot be cast to non-null type com.discord.react_resource_cache.ReactResourceCache<com.discord.react_asset_fetcher.ReactAsset>"
      );
      return var1;
   }

   public open fun getName(): String {
      return "ReactAssetModule";
   }

   public open fun keys(): Array<ReactAsset> {
      return ReactAsset.values();
   }

   @ReactMethod
   public fun keysRequest(callback: Callback) {
      r.h(var1, "callback");
      var1.invoke(new Object[]{this.keysArray()});
   }

   @ReactMethod
   public fun valuesResult(values: ReadableArray) {
      r.h(var1, "values");
      this.cache().set(this.reactContext, this.reactResources(var1));
   }
}
