package com.discord.logging

import java.lang.annotation.Annotation
import java.util.ArrayList
import kotlin.jvm.internal.r
import kotlin.reflect.KCallable
import kotlin.reflect.KClass

public fun getPIIFieldNames(kClass: KClass<*>): List<String> {
   r.h(var0, "kClass");
   val var6: java.util.Collection = var0.f();
   val var2: ArrayList = new ArrayList();

   for (Object var3 : var6) {
      val var5: java.util.Iterator = (var3 as KCallable).getAnnotations().iterator();

      do {
         if (!var5.hasNext()) {
            var7 = null;
            break;
         }

         var7 = var5.next();
      } while (!((Annotation)var7 instanceof PII));

      val var1: Boolean;
      if (var7 as PII != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      if (var1) {
         var2.add(var3);
      }
   }

   val var8: ArrayList = new ArrayList(h.t(var2, 10));
   val var9: java.util.Iterator = var2.iterator();

   while (var9.hasNext()) {
      var8.add((var9.next() as KCallable).getName());
   }

   return var8;
}
