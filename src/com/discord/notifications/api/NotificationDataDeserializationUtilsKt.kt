@file:SourceDebugExtension(["SMAP\nNotificationDataDeserializationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDataDeserializationUtils.kt\ncom/discord/notifications/api/NotificationDataDeserializationUtilsKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,36:1\n535#2:37\n520#2,6:38\n126#3:44\n153#3,3:45\n*S KotlinDebug\n*F\n+ 1 NotificationDataDeserializationUtils.kt\ncom/discord/notifications/api/NotificationDataDeserializationUtilsKt\n*L\n9#1:37\n9#1:38,6\n10#1:44\n10#1:45,3\n*E\n"])

package com.discord.notifications.api

import com.discord.notifications.api.NotificationData.Companion
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.snowflake.SnowflakeUtils
import ht.v
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.SourceDebugExtension

public fun Companion.localNotificationData(notification: Map<String, Any>): NotificationData {
   var var9: java.util.Map = (java.util.Map)var1.get("userInfo");
   if (var9 is java.util.Map) {
      var9 = var9;
   } else {
      var9 = null;
   }

   label72: {
      if (var9 != null) {
         val var3: LinkedHashMap = new LinkedHashMap();

         for (Entry var6 : var9.entrySet()) {
            if (var6.getKey() is java.lang.String && var6.getValue() is java.lang.String) {
               var3.put(var6.getKey(), var6.getValue());
            }
         }

         val var12: ArrayList = new ArrayList(var3.size());

         for (Entry var24 : var3.entrySet()) {
            var var20: Any = var24.getKey();
            val var25: Any = var24.getValue();
            var20 = var20 as java.lang.String;
            var12.add(v.a(var20, var25 as java.lang.String));
         }

         var9 = s0.u(var12);
         if (var9 != null) {
            break label72;
         }
      }

      var9 = s0.i();
   }

   var var19: ChannelId;
   label55: {
      val var17: java.lang.String = var9.get("channel_id") as java.lang.String;
      if (var17 != null) {
         val var18: java.lang.Long = SnowflakeUtils.INSTANCE.toSnowflake(var17);
         if (var18 != null) {
            var19 = ChannelId.box-impl(ChannelId.constructor-impl(var18));
            break label55;
         }
      }

      var19 = null;
   }

   var var22: java.lang.String = var9.get("message_id") as java.lang.String;
   if (var22 != null) {
      var22 = MessageId.constructor-impl(var22);
   } else {
      var22 = null;
   }

   var var26: Any = var1.get("alertTitle");
   if (var26 is java.lang.String) {
      var26 = var26 as java.lang.String;
   } else {
      var26 = null;
   }

   var var28: Any = var1.get("alertBody");
   if (var28 is java.lang.String) {
      var28 = var28 as java.lang.String;
   } else {
      var28 = null;
   }

   val var8: Any = var1.get("silent");
   var var14: java.lang.Boolean = null;
   if (var8 is java.lang.Boolean) {
      var14 = var8 as java.lang.Boolean;
   }

   val var15: Boolean;
   if (var14 != null) {
      var15 = var14;
   } else {
      var15 = false;
   }

   return new NotificationData(
      "LOCAL_NOTIFICATION",
      var22,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      var19,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      false,
      false,
      null,
      (java.lang.String)var26,
      (java.lang.String)var28,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      var15,
      var9,
      false,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      -516,
      535297663,
      null
   );
}
