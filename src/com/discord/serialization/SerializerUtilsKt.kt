package com.discord.serialization

import bu.b
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlinx.serialization.json.JsonElement
import xu.n

@JvmSynthetic
fun `access$parseProperty`(var0: KProperty1, var1: JsonElement): Boolean {
   return parseProperty(var0, var1);
}

private fun parseProperty(property: KProperty1<*, *>, jsonProperty: JsonElement): Boolean {
   try {
      val var3: KClass = b.b(var0.getReturnType());
      if (var3 == java.lang.String::class) {
         bv.h.o(var1).b();
      } else if (var3 == Int::class) {
         bv.h.k(bv.h.o(var1));
      } else if (var3 == java.lang.Double::class) {
         bv.h.i(bv.h.o(var1));
      } else if (var3 == java.lang.Boolean::class) {
         bv.h.f(bv.h.o(var1));
      } else if (var3 == java.lang.Long::class) {
         bv.h.q(bv.h.o(var1));
      } else if (var3 == java.lang.Float::class) {
         bv.h.j(bv.h.o(var1));
      }

      return true;
   } catch (IllegalArgumentException | var2: n) {
      return false;
   }
}
