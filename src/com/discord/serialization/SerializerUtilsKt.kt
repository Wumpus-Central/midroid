package com.discord.serialization

import N9.b
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlinx.serialization.json.JsonElement
import ob.g

@JvmSynthetic
fun `access$parseProperty`(var0: KProperty1, var1: JsonElement): Boolean {
   return parseProperty(var0, var1);
}

private fun parseProperty(property: KProperty1<*, *>, jsonProperty: JsonElement): Boolean {
   try {
      val var4: KClass = b.b(var0.getReturnType());
      if (r.c(var4, H.b(java.lang.String.class))) {
         g.p(var1).a();
      } else if (r.c(var4, H.b(int.class))) {
         g.l(g.p(var1));
      } else if (r.c(var4, H.b(double.class))) {
         g.i(g.p(var1));
      } else if (r.c(var4, H.b(boolean.class))) {
         g.f(g.p(var1));
      } else if (r.c(var4, H.b(long.class))) {
         g.r(g.p(var1));
      } else {
         if (!r.c(var4, H.b(float.class))) {
            return true;
         }

         g.k(g.p(var1));
      }
   } catch (IllegalArgumentException | var3: kb.g) {
      return false;
   }

   return true;
}
