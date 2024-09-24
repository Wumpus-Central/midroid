package com.discord.notifications.api

import com.discord.notifications.api.NotificationData.Companion
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.snowflake.SnowflakeUtils
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.Map.Entry
import kh.w
import kotlin.jvm.internal.q
import lh.r

public fun Companion.localNotificationData(notification: Map<String, Any>): NotificationData {
   q.h(var0, "<this>");
   q.h(var1, "notification");
   var var7: java.util.Map = (java.util.Map)var1.get("userInfo");
   if (var7 is java.util.Map) {
      var7 = var7;
   } else {
      var7 = null;
   }

   label73: {
      if (var7 != null) {
         val var3: LinkedHashMap = new LinkedHashMap();

         for (Entry var9 : var7.entrySet()) {
            if (var9.getKey() is java.lang.String && var9.getValue() is java.lang.String) {
               var3.put(var9.getKey(), var9.getValue());
            }
         }

         val var10: ArrayList = new ArrayList(var3.size());

         for (Entry var22 : var3.entrySet()) {
            var var18: Any = var22.getKey();
            val var23: Any = var22.getValue();
            q.f(var18, "null cannot be cast to non-null type kotlin.String");
            var18 = var18 as java.lang.String;
            q.f(var23, "null cannot be cast to non-null type kotlin.String");
            var10.add(w.a(var18, var23 as java.lang.String));
         }

         var7 = r.t(var10);
         if (var7 != null) {
            break label73;
         }
      }

      var7 = r.h();
   }

   var var17: ChannelId;
   label56: {
      val var15: java.lang.String = var7.get("channel_id") as java.lang.String;
      if (var15 != null) {
         val var16: java.lang.Long = SnowflakeUtils.INSTANCE.toSnowflake(var15);
         if (var16 != null) {
            var17 = ChannelId.box-impl(ChannelId.constructor-impl(var16));
            break label56;
         }
      }

      var17 = null;
   }

   var var20: java.lang.String = var7.get("message_id") as java.lang.String;
   if (var20 != null) {
      var20 = MessageId.constructor-impl(var20);
   } else {
      var20 = null;
   }

   var var24: Any = var1.get("alertTitle");
   if (var24 is java.lang.String) {
      var24 = var24 as java.lang.String;
   } else {
      var24 = null;
   }

   var var26: Any = var1.get("alertBody");
   if (var26 is java.lang.String) {
      var26 = var26 as java.lang.String;
   } else {
      var26 = null;
   }

   var var12: java.lang.Boolean = (java.lang.Boolean)var1.get("silent");
   if (var12 is java.lang.Boolean) {
      var12 = var12;
   } else {
      var12 = null;
   }

   val var2: Boolean;
   if (var12 != null) {
      var2 = var12;
   } else {
      var2 = false;
   }

   return new NotificationData(
      "LOCAL_NOTIFICATION",
      var20,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      var17,
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
      (java.lang.String)var24,
      (java.lang.String)var26,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      var2,
      var7,
      -516,
      65151,
      null
   );
}
