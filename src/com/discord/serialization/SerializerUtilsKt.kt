package com.discord.serialization

import Ta.b
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlinx.serialization.json.JsonElement
import pc.n
import tc.h

@JvmSynthetic
fun `access$parseProperty`(var0: KProperty1, var1: JsonElement): Boolean {
   return parseProperty(var0, var1);
}

private fun parseProperty(property: KProperty1<*, *>, jsonProperty: JsonElement): Boolean {
   try {
      val var4: KClass = b.b(var0.getReturnType());
      if (var4 == java.lang.String::class) {
         h.o(var1).c();
      } else if (var4 == Int::class) {
         h.k(h.o(var1));
      } else if (var4 == java.lang.Double::class) {
         h.i(h.o(var1));
      } else if (var4 == java.lang.Boolean::class) {
         h.f(h.o(var1));
      } else if (var4 == java.lang.Long::class) {
         h.q(h.o(var1));
      } else {
         if (!(var4 == java.lang.Float::class)) {
            return true;
         }

         h.j(h.o(var1));
      }
   } catch (IllegalArgumentException | var3: n) {
      return false;
   }

   return true;
}
