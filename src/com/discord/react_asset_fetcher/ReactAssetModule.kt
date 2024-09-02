package com.discord.react_asset_fetcher

import com.discord.react_resource_cache.ReactResourceCache
import com.discord.react_resource_cache.ReactResourceModule
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableArray
import kotlin.jvm.internal.q

public class ReactAssetModule(reactContext: ReactApplicationContext) : ReactResourceModule<ReactAsset> {
   private final val reactContext: ReactApplicationContext

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   public override fun cache(): ReactResourceCache<ReactAsset> {
      val var1: ReactAssetCache = ReactAssetCache.INSTANCE;
      q.f(
         ReactAssetCache.INSTANCE,
         "null cannot be cast to non-null type com.discord.react_resource_cache.ReactResourceCache<com.discord.react_asset_fetcher.ReactAsset>"
      );
      return var1;
   }

   public override fun getName(): String {
      return "ReactAssetModule";
   }

   public open fun keys(): Array<ReactAsset> {
      return ReactAsset.values();
   }

   @ReactMethod
   public fun keysRequest(callback: Callback) {
      q.h(var1, "callback");
      var1.invoke(this.keysArray());
   }

   @ReactMethod
   public fun valuesResult(values: ReadableArray) {
      q.h(var1, "values");
      this.cache().set(this.reactContext, this.reactResources(var1));
   }
}
