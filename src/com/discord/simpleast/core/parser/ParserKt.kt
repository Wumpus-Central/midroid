package com.discord.simpleast.core.parser

import kotlin.jvm.functions.Function1

@JvmSynthetic
fun `access$firstMapOrNull`(var0: java.util.List, var1: Function1): Any {
   return firstMapOrNull(var0, var1);
}

private inline fun <T, V> List<T>.firstMapOrNull(predicate: (T) -> V?): V? {
   val var3: java.util.Iterator = var0.iterator();

   while (var3.hasNext()) {
      val var2: Any = var1.invoke(var3.next());
      if (var2 != null) {
         return (V)var2;
      }
   }

   return null;
}
