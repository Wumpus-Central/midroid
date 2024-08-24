package com.discord.react_asset_fetcher

import com.discord.react_resource_cache.ReactResourceCache

internal object ReactAssetCache : ReactResourceCache<ReactAsset> {
   public open val cacheKey: String = "ReactAssetCache"
}
