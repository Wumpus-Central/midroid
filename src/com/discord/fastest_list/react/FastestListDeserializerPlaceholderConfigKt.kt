package com.discord.fastest_list.react

import com.discord.fastest_list.android.placeholder.FastestListPlaceholderConfig
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderType
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderConfig.Companion
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableMap
import kotlin.jvm.internal.r

internal operator fun Companion.invoke(value: ReadableMap): FastestListPlaceholderConfig {
   r.h(var0, "<this>");
   r.h(var1, "value");
   val var2: FastestListPlaceholderType.Companion = FastestListPlaceholderType.Companion;
   return new FastestListPlaceholderConfig(
      FastestListDeserializerPlaceholderTypeKt.invoke(FastestListPlaceholderType.Companion, NativeMapExtensionsKt.getNonNullMap(var1, "listFooter")),
      FastestListDeserializerPlaceholderTypeKt.invoke(var2, NativeMapExtensionsKt.getNonNullMap(var1, "listHeader")),
      FastestListDeserializerPlaceholderTypeKt.invoke(var2, NativeMapExtensionsKt.getNonNullMap(var1, "sectionFooter")),
      FastestListDeserializerPlaceholderTypeKt.invoke(var2, NativeMapExtensionsKt.getNonNullMap(var1, "sectionHeader")),
      FastestListDeserializerPlaceholderTypeKt.invoke(var2, NativeMapExtensionsKt.getNonNullMap(var1, "sectionItem")),
      FastestListDeserializerPlaceholderTypeKt.invoke(var2, NativeMapExtensionsKt.getNonNullMap(var1, "sectionItemAtFront")),
      FastestListDeserializerPlaceholderTypeKt.invoke(var2, NativeMapExtensionsKt.getNonNullMap(var1, "sectionItemAtRear")),
      FastestListDeserializerPlaceholderTypeKt.invoke(var2, NativeMapExtensionsKt.getNonNullMap(var1, "sectionItemSingleton"))
   );
}
