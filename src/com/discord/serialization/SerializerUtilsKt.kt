package com.discord.serialization

import A9.b
import bb.g
import kotlin.jvm.internal.G
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
      val var4: KClass = b.a(var0.getReturnType());
      if (q.c(var4, G.b(java.lang.String.class))) {
         g.p(var1).a();
      } else if (q.c(var4, G.b(int.class))) {
         g.l(g.p(var1));
      } else if (q.c(var4, G.b(double.class))) {
         g.i(g.p(var1));
      } else if (q.c(var4, G.b(boolean.class))) {
         g.f(g.p(var1));
      } else if (q.c(var4, G.b(long.class))) {
         g.r(g.p(var1));
      } else {
         if (!q.c(var4, G.b(float.class))) {
            return true;
         }

         g.k(g.p(var1));
      }
   } catch (IllegalArgumentException | var3: Xa.g) {
      return false;
   }

   return true;
}
