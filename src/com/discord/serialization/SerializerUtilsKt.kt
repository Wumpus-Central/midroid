package com.discord.serialization

import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.g
import yh.b

@JvmSynthetic
fun `access$parseProperty`(var0: KProperty1, var1: JsonElement): Boolean {
   return parseProperty(var0, var1);
}

private fun parseProperty(property: KProperty1<*, *>, jsonProperty: JsonElement): Boolean {
   try {
      val var4: KClass = b.a(var0.getReturnType());
      if (r.c(var4, h0.b(java.lang.String.class))) {
         g.p(var1).j();
      } else if (r.c(var4, h0.b(int.class))) {
         g.l(g.p(var1));
      } else if (r.c(var4, h0.b(double.class))) {
         g.i(g.p(var1));
      } else if (r.c(var4, h0.b(boolean.class))) {
         g.f(g.p(var1));
      } else if (r.c(var4, h0.b(long.class))) {
         g.r(g.p(var1));
      } else {
         if (!r.c(var4, h0.b(float.class))) {
            return true;
         }

         g.k(g.p(var1));
      }
   } catch (IllegalArgumentException | var3: uk.g) {
      return false;
   }

   return true;
}
