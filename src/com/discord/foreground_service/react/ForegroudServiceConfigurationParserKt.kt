package com.discord.foreground_service.react

import com.discord.foreground_service.service.ServiceNotificationConfiguration
import com.discord.foreground_service.service.ServiceNotificationConfiguration.Action
import com.discord.foreground_service.service.ServiceNotificationConfiguration.Companion
import com.discord.foreground_service.service.ServiceNotificationConfiguration.Priority
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import java.util.ArrayList
import kotlin.jvm.internal.q
import mj.o
import mj.r

internal fun Companion.parse(readableMap: ReadableMap): ServiceNotificationConfiguration {
   q.h(var0, "<this>");
   q.h(var1, "readableMap");
   val var4: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "title");
   val var3: java.lang.String = var1.getString("content");
   var0 = ServiceNotificationConfiguration.Companion;
   val var2: ServiceNotificationConfiguration.Priority = parsePriority(ServiceNotificationConfiguration.Companion, var1.getInt("priority"));
   val var5: ReadableMap = var1.getMap("contentAction");
   val var9: ServiceNotificationConfiguration.Action;
   if (var5 != null) {
      var9 = parseAction(var0, var5);
   } else {
      var9 = null;
   }

   val var11: ReadableArray = var1.getArray("auxiliaryActions");
   val var10: Any;
   if (var11 != null) {
      val var6: IntRange = NativeArrayExtensionsKt.sizeRange(var11);
      var10 = new ArrayList(i.u(var6, 10));
      val var7: java.util.Iterator = var6.iterator();

      while (var7.hasNext()) {
         val var12: ReadableMap = var11.getMap((var7 as o).c());
         q.g(var12, "getMap(...)");
         var10.add(parseAction(ServiceNotificationConfiguration.Companion, var12));
      }
   } else {
      var10 = i.j();
   }

   return new ServiceNotificationConfiguration(var4, var3, var2, var9, (java.util.List<ServiceNotificationConfiguration.Action>)var10);
}

private fun Companion.parseAction(readableMap: ReadableMap): Action {
   val var4: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "tag");
   val var3: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "taskName");
   val var2: java.lang.String = NativeMapExtensionsKt.getStringOrEmpty(var1, "title");
   val var5: ReadableMap = var1.getMap("data");
   if (var5 != null) {
      val var7: java.util.Map = NativeMapExtensionsKt.toStringMap(var5);
      if (var7 != null) {
         return new ServiceNotificationConfiguration.Action(var4, var3, var2, var7);
      }
   }

   return new ServiceNotificationConfiguration.Action(var4, var3, var2, r.h());
}

internal fun Companion.parseList(readableArray: ReadableArray): List<ServiceNotificationConfiguration> {
   q.h(var0, "<this>");
   q.h(var1, "readableArray");
   val var3: IntRange = NativeArrayExtensionsKt.sizeRange(var1);
   val var6: ArrayList = new ArrayList(i.u(var3, 10));
   val var7: java.util.Iterator = var3.iterator();

   while (var7.hasNext()) {
      val var2: Int = (var7 as o).c();
      val var5: ServiceNotificationConfiguration.Companion = ServiceNotificationConfiguration.Companion;
      val var4: ReadableMap = var1.getMap(var2);
      q.g(var4, "getMap(...)");
      var6.add(parse(var5, var4));
   }

   return var6;
}

private fun Companion.parsePriority(value: Int): Priority {
   val var2: ServiceNotificationConfiguration.Priority;
   if (var1 != 0) {
      if (var1 != 1) {
         if (var1 != 2) {
            val var3: StringBuilder = new StringBuilder();
            var3.append("Unknown priority: ");
            var3.append(var1);
            var3.append(".");
            throw new IllegalArgumentException(var3.toString());
         }

         var2 = ServiceNotificationConfiguration.Priority.LOW;
      } else {
         var2 = ServiceNotificationConfiguration.Priority.MEDIUM;
      }
   } else {
      var2 = ServiceNotificationConfiguration.Priority.HIGH;
   }

   return var2;
}
