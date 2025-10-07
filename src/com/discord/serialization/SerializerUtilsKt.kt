package com.discord.serialization

import S9.b
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlinx.serialization.json.JsonElement
import nb.h
import rb.g

@JvmSynthetic
fun `access$parseProperty`(var0: KProperty1, var1: JsonElement): Boolean {
   return parseProperty(var0, var1);
}

private fun parseProperty(property: KProperty1<*, *>, jsonProperty: JsonElement): Boolean {
   try {
      val var4: KClass = b.b(var0.getReturnType());
      if (var4 == java.lang.String::class) {
         g.p(var1).a();
      } else if (var4 == Int::class) {
         g.l(g.p(var1));
      } else if (var4 == java.lang.Double::class) {
         g.i(g.p(var1));
      } else if (var4 == java.lang.Boolean::class) {
         g.f(g.p(var1));
      } else if (var4 == java.lang.Long::class) {
         g.r(g.p(var1));
      } else {
         if (!(var4 == java.lang.Float::class)) {
            return true;
         }

         g.k(g.p(var1));
      }
   } catch (IllegalArgumentException | var3: h) {
      return false;
   }

   return true;
}
