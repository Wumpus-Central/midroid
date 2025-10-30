@file:SourceDebugExtension(["SMAP\nReactModuleInfoProviderExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactModuleInfoProviderExtensions.kt\ncom/discord/react/utilities/ReactModuleInfoProviderExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1279#2,2:33\n1293#2,4:35\n*S KotlinDebug\n*F\n+ 1 ReactModuleInfoProviderExtensions.kt\ncom/discord/react/utilities/ReactModuleInfoProviderExtensionsKt\n*L\n10#1:33,2\n10#1:35,4\n*E\n"])

package com.discord.react.utilities

import com.facebook.react.module.model.ReactModuleInfo
import com.facebook.react.module.model.ReactModuleInfoProvider
import java.util.LinkedHashMap
import kotlin.jvm.internal.SourceDebugExtension

@JvmSynthetic
fun a(var0: java.util.List, var1: Boolean): java.util.Map {
   return createReactModuleInfoProvider$lambda$1(var0, var1);
}

public fun createReactModuleInfo(reactModuleName: String, needsEagerInit: Boolean): ReactModuleInfo {
   return new ReactModuleInfo(var0, var0, false, var1, false, true);
}

public fun createReactModuleInfoProvider(moduleName: String, needsEagerInit: Boolean = false): ReactModuleInfoProvider {
   return createReactModuleInfoProvider(CollectionsKt.e(var0), var1);
}

public fun createReactModuleInfoProvider(moduleNames: List<String> = CollectionsKt.k(), needsEagerInit: Boolean = false): ReactModuleInfoProvider {
   return new d(var0, var1);
}

@JvmSynthetic
fun `createReactModuleInfoProvider$default`(var0: java.lang.String, var1: Boolean, var2: Int, var3: Any): ReactModuleInfoProvider {
   if ((var2 and 2) != 0) {
      var1 = false;
   }

   return createReactModuleInfoProvider(var0, var1);
}

@JvmSynthetic
fun `createReactModuleInfoProvider$default`(var0: java.util.List, var1: Boolean, var2: Int, var3: Any): ReactModuleInfoProvider {
   if ((var2 and 1) != 0) {
      var0 = CollectionsKt.k();
   }

   if ((var2 and 2) != 0) {
      var1 = false;
   }

   return createReactModuleInfoProvider(var0, var1);
}

fun `createReactModuleInfoProvider$lambda$1`(var0: java.util.List, var1: Boolean): java.util.Map {
   val var2: LinkedHashMap = new LinkedHashMap(kotlin.ranges.e.e(n0.e(CollectionsKt.v(var0, 10)), 16));

   for (Object var4 : var0) {
      var2.put(var4, createReactModuleInfo(var4 as java.lang.String, var1));
   }

   return var2;
}
