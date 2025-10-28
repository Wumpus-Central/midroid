@file:SourceDebugExtension(["SMAP\nPII.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PII.kt\ncom/discord/logging/PIIKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n*L\n1#1,23:1\n774#2:24\n865#2:25\n295#2,2:27\n866#2:29\n1557#2:30\n1628#2,3:31\n20#3:26\n*S KotlinDebug\n*F\n+ 1 PII.kt\ncom/discord/logging/PIIKt\n*L\n20#1:24\n20#1:25\n20#1:27,2\n20#1:29\n21#1:30\n21#1:31,3\n20#1:26\n*E\n"])

package com.discord.logging

import java.lang.annotation.Annotation
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.reflect.KCallable
import kotlin.reflect.KClass

public fun getPIIFieldNames(kClass: KClass<*>): List<String> {
   val var5: java.lang.Iterable = var0.getMembers();
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

   val var7: ArrayList = new ArrayList(CollectionsKt.v(var1, 10));
   val var8: java.util.Iterator = var1.iterator();

   while (var8.hasNext()) {
      var7.add((var8.next() as KCallable).getName());
   }

   return var7;
}
