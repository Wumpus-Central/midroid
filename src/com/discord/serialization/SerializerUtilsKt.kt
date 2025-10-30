package com.discord.serialization

import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlinx.serialization.json.JsonElement
import tp.n
import wm.b
import xp.h

@JvmSynthetic
fun `access$parseProperty`(var0: KProperty1, var1: JsonElement): Boolean {
   return parseProperty(var0, var1);
}

private fun parseProperty(property: KProperty1<*, *>, jsonProperty: JsonElement): Boolean {
   try {
      val var3: KClass = b.b(var0.getReturnType());
      if (var3 == java.lang.String::class) {
         h.o(var1).b();
      } else if (var3 == Int::class) {
         h.k(h.o(var1));
      } else if (var3 == java.lang.Double::class) {
         h.i(h.o(var1));
      } else if (var3 == java.lang.Boolean::class) {
         h.f(h.o(var1));
      } else if (var3 == java.lang.Long::class) {
         h.q(h.o(var1));
      } else if (var3 == java.lang.Float::class) {
         h.j(h.o(var1));
      }

      return true;
   } catch (IllegalArgumentException | var2: n) {
      return false;
   }
}
