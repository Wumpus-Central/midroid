package com.discord.serialization

import F8.b
import ga.g
import kotlin.jvm.internal.E
import kotlin.jvm.internal.q
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlinx.serialization.json.JsonElement

@JvmSynthetic
fun `access$parseProperty`(var0: KProperty1, var1: JsonElement): Boolean {
   return parseProperty(var0, var1);
}

private fun parseProperty(property: KProperty1<*, *>, jsonProperty: JsonElement): Boolean {
   try {
      val var4: KClass = b.b(var0.getReturnType());
      if (q.c(var4, E.b(java.lang.String.class))) {
         g.p(var1).a();
      } else if (q.c(var4, E.b(int.class))) {
         g.l(g.p(var1));
      } else if (q.c(var4, E.b(double.class))) {
         g.i(g.p(var1));
      } else if (q.c(var4, E.b(boolean.class))) {
         g.f(g.p(var1));
      } else if (q.c(var4, E.b(long.class))) {
         g.r(g.p(var1));
      } else {
         if (!q.c(var4, E.b(float.class))) {
            return true;
         }

         g.k(g.p(var1));
      }
   } catch (IllegalArgumentException | var3: ca.g) {
      return false;
   }

   return true;
}
