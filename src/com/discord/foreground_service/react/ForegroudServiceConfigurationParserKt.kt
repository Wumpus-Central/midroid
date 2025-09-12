@file:SourceDebugExtension(["SMAP\nForegroudServiceConfigurationParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroudServiceConfigurationParser.kt\ncom/discord/foreground_service/react/ForegroudServiceConfigurationParserKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1557#2:62\n1628#2,3:63\n1557#2:67\n1628#2,3:68\n1#3:66\n*S KotlinDebug\n*F\n+ 1 ForegroudServiceConfigurationParser.kt\ncom/discord/foreground_service/react/ForegroudServiceConfigurationParserKt\n*L\n12#1:62\n12#1:63,3\n29#1:67\n29#1:68,3\n*E\n"])

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
import kotlin.jvm.internal.SourceDebugExtension

internal fun Companion.parse(readableMap: ReadableMap): ServiceNotificationConfiguration {
   val var4: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "title");
   val var5: java.lang.String = var1.getString("content");
   var var2: ServiceNotificationConfiguration.Companion = ServiceNotificationConfiguration.Companion;
   val var6: ServiceNotificationConfiguration.Priority = parsePriority(ServiceNotificationConfiguration.Companion, var1.getInt("priority"));
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
      val var3: ArrayList = new ArrayList(CollectionsKt.v(var11, 10));
      val var8: java.util.Iterator = var11.iterator();

      while (true) {
         var2 = var3;
         if (!var8.hasNext()) {
            break;
         }

         val var13: ReadableMap = var7.getMap((var8 as I).nextInt());
         var3.add(parseAction(ServiceNotificationConfiguration.Companion, var13));
      }
   } else {
      var2 = CollectionsKt.k();
   }

   return new ServiceNotificationConfiguration(var4, var5, var6, var10, var2, parseType(ServiceNotificationConfiguration.Companion, var1.getInt("type")));
}

private fun Companion.parseAction(readableMap: ReadableMap): Action {
   val var3: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "tag");
   val var4: java.lang.String = NativeMapExtensionsKt.getNonNullString(var1, "taskName");
   val var2: java.lang.String = NativeMapExtensionsKt.getStringOrEmpty(var1, "title");
   val var5: ReadableMap = var1.getMap("data");
   if (var5 != null) {
      val var7: java.util.Map = NativeMapExtensionsKt.toStringMap(var5);
      if (var7 != null) {
         return new ServiceNotificationConfiguration.Action(var3, var4, var2, var7);
      }
   }

   return new ServiceNotificationConfiguration.Action(var3, var4, var2, L.h());
}

internal fun Companion.parseList(readableArray: ReadableArray): List<ServiceNotificationConfiguration> {
   val var3: IntRange = NativeArrayExtensionsKt.sizeRange(var1);
   val var6: ArrayList = new ArrayList(CollectionsKt.v(var3, 10));
   val var7: java.util.Iterator = var3.iterator();

   while (var7.hasNext()) {
      val var2: Int = (var7 as I).nextInt();
      val var4: ServiceNotificationConfiguration.Companion = ServiceNotificationConfiguration.Companion;
      val var5: ReadableMap = var1.getMap(var2);
      var6.add(parse(var4, var5));
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
