package com.discord.react.utilities

import com.facebook.react.module.model.ReactModuleInfo
import com.facebook.react.module.model.ReactModuleInfoProvider
import java.util.LinkedHashMap
import kotlin.jvm.internal.q

@JvmSynthetic
fun a(var0: java.util.List, var1: Boolean): java.util.Map {
   return createReactModuleInfoProvider$lambda$1(var0, var1);
}

public fun createReactModuleInfo(reactModuleName: String, needsEagerInit: Boolean): ReactModuleInfo {
   q.h(var0, "reactModuleName");
   return new ReactModuleInfo(var0, var0, false, var1, false, true);
}

public fun createReactModuleInfoProvider(moduleName: String, needsEagerInit: Boolean = false): ReactModuleInfoProvider {
   q.h(var0, "moduleName");
   return createReactModuleInfoProvider(i.e(var0), var1);
}

public fun createReactModuleInfoProvider(moduleNames: List<String> = i.k(), needsEagerInit: Boolean = false): ReactModuleInfoProvider {
   q.h(var0, "moduleNames");
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
      var0 = i.k();
   }

   if ((var2 and 2) != 0) {
      var1 = false;
   }

   return createReactModuleInfoProvider(var0, var1);
}

fun `createReactModuleInfoProvider$lambda$1`(var0: java.util.List, var1: Boolean): java.util.Map {
   val var2: LinkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(s9.q.d(i.v(var0, 10)), 16));

   for (Object var4 : var0) {
      var2.put(var4, createReactModuleInfo(var4 as java.lang.String, var1));
   }

   return var2;
}
