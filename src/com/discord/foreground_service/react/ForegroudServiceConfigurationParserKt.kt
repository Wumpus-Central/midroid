package com.discord.foreground_service.react

import com.discord.foreground_service.service.ServiceNotificationConfiguration
import com.discord.foreground_service.service.ServiceNotificationConfiguration.Action
import com.discord.foreground_service.service.ServiceNotificationConfiguration.Companion
import com.discord.foreground_service.service.ServiceNotificationConfiguration.Priority
import com.discord.foreground_service.service.ServiceNotificationConfiguration.Type
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import java.util.ArrayList
import kotlin.jvm.internal.q
import lh.o
import lh.r

internal fun Companion.parse(readableMap: ReadableMap): ServiceNotificationConfiguration {
   q.h(var0, "<this>");
   q.h(var1, "readableMap");
   val var6: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "title");
   val var4: java.lang.String = var1.getString("content");
   var var2: ServiceNotificationConfiguration.Companion = ServiceNotificationConfiguration.Companion;
   val var5: ServiceNotificationConfiguration.Priority = parsePriority(ServiceNotificationConfiguration.Companion, var1.getInt("priority"));
   val var9: ReadableMap = var1.getMap("contentAction");
   val var10: ServiceNotificationConfiguration.Action;
   if (var9 != null) {
      var10 = parseAction(var2, var9);
   } else {
      var10 = null;
   }

   val var7: ReadableArray = var1.getArray("auxiliaryActions");
   if (var7 != null) {
      val var11: IntRange = NativeArrayExtensionsKt.sizeRange(var7);
      val var3: ArrayList = new ArrayList(i.v(var11, 10));
      val var8: java.util.Iterator = var11.iterator();

      while (true) {
         var2 = var3;
         if (!var8.hasNext()) {
            break;
         }

         val var13: ReadableMap = var7.getMap((var8 as o).c());
         q.g(var13, "getMap(...)");
         var3.add(parseAction(ServiceNotificationConfiguration.Companion, var13));
      }
   } else {
      var2 = i.k();
   }

   return new ServiceNotificationConfiguration(var6, var4, var5, var10, var2, parseType(ServiceNotificationConfiguration.Companion, var1.getInt("type")));
}

private fun Companion.parseAction(readableMap: ReadableMap): Action {
   val var2: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "tag");
   val var4: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "taskName");
   val var3: java.lang.String = NativeMapExtensionsKt.getStringOrEmpty(var1, "title");
   val var5: ReadableMap = var1.getMap("data");
   if (var5 != null) {
      val var7: java.util.Map = NativeMapExtensionsKt.toStringMap(var5);
      if (var7 != null) {
         return new ServiceNotificationConfiguration.Action(var2, var4, var3, var7);
      }
   }

   return new ServiceNotificationConfiguration.Action(var2, var4, var3, r.h());
}

internal fun Companion.parseList(readableArray: ReadableArray): List<ServiceNotificationConfiguration> {
   q.h(var0, "<this>");
   q.h(var1, "readableArray");
   val var3: IntRange = NativeArrayExtensionsKt.sizeRange(var1);
   val var6: ArrayList = new ArrayList(i.v(var3, 10));
   val var4: java.util.Iterator = var3.iterator();

   while (var4.hasNext()) {
      val var2: Int = (var4 as o).c();
      val var5: ServiceNotificationConfiguration.Companion = ServiceNotificationConfiguration.Companion;
      val var7: ReadableMap = var1.getMap(var2);
      q.g(var7, "getMap(...)");
      var6.add(parse(var5, var7));
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

private fun Companion.parseType(value: Int): Type {
   val var2: ServiceNotificationConfiguration.Type;
   if (var1 != 0) {
      if (var1 != 1) {
         if (var1 != 2) {
            val var3: StringBuilder = new StringBuilder();
            var3.append("Unknown type: ");
            var3.append(var1);
            var3.append(".");
            throw new IllegalArgumentException(var3.toString());
         }

         var2 = ServiceNotificationConfiguration.Type.SCREEN_SHARE;
      } else {
         var2 = ServiceNotificationConfiguration.Type.VOICE_CALL;
      }
   } else {
      var2 = ServiceNotificationConfiguration.Type.FILE_UPLOAD;
   }

   return var2;
}
