package com.discord.notifications.api

import com.discord.notifications.api.NotificationData.Companion
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.snowflake.SnowflakeUtils
import f8.w
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.q

public fun Companion.localNotificationData(notification: Map<String, Any>): NotificationData {
   q.h(var0, "<this>");
   q.h(var1, "notification");
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

         for (Entry var20 : var3.entrySet()) {
            var var24: Any = var20.getKey();
            val var21: Any = var20.getValue();
            q.f(var24, "null cannot be cast to non-null type kotlin.String");
            var24 = var24 as java.lang.String;
            q.f(var21, "null cannot be cast to non-null type kotlin.String");
            var12.add(w.a(var24, var21 as java.lang.String));
         }

         var9 = g8.q.t(var12);
         if (var9 != null) {
            break label72;
         }
      }

      var9 = g8.q.h();
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
      var15,
      var9,
      false,
      null,
      null,
      null,
      null,
      null,
      -516,
      16580223,
      null
   );
}
