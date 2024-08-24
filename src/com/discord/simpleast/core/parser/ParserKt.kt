package com.discord.simpleast.core.parser

import kotlin.jvm.functions.Function1

@JvmSynthetic
fun `access$firstMapOrNull`(var0: java.util.List, var1: Function1): Any {
   return firstMapOrNull(var0, var1);
}

private inline fun <T, V> List<T>.firstMapOrNull(predicate: (T) -> V?): V? {
   val var2: java.util.Iterator = var0.iterator();

   while (var2.hasNext()) {
      val var3: Any = var1.invoke(var2.next());
      if (var3 != null) {
         return (V)var3;
      }
   }

   return null;
}
