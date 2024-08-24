package com.discord.react_strings

import com.discord.react_resource_cache.ReactResourceCache

public object I18nCache : ReactResourceCache<I18nMessage> {
   public open val cacheKey: String = "i18nCache"
}
