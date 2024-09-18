package com.discord.logging

import java.lang.annotation.Annotation
import java.util.ArrayList
import kotlin.jvm.internal.q
import kotlin.reflect.KCallable
import kotlin.reflect.KClass

public fun getPIIFieldNames(kClass: KClass<*>): List<String> {
   q.h(var0, "kClass");
   val var5: java.util.Collection = var0.p();
   val var1: ArrayList = new ArrayList();

   for (Object var2 : var5) {
      val var4: java.util.Iterator = (var2 as KCallable).getAnnotations().iterator();

      do {
         if (!var4.hasNext()) {
            var6 = null;
            break;
         }

         var6 = var4.next();
      } while (!((Annotation)var6 instanceof PII));

      if (var6 as PII != null) {
         var1.add(var2);
      }
   }

   val var7: ArrayList = new ArrayList(i.u(var1, 10));
   val var8: java.util.Iterator = var1.iterator();

   while (var8.hasNext()) {
      var7.add((var8.next() as KCallable).getName());
   }

   return var7;
}
