package com.discord.notifications.api

import com.discord.notifications.api.NotificationData.Companion
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.snowflake.SnowflakeUtils
import eh.w
import fh.s
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.r

public fun Companion.localNotificationData(notification: Map<String, Any>): NotificationData {
   r.h(var0, "<this>");
   r.h(var1, "notification");
   var var10: java.util.Map = (java.util.Map)var1.get("userInfo");
   if (var10 is java.util.Map) {
      var10 = var10;
   } else {
      var10 = null;
   }

   label79: {
      if (var10 != null) {
         val var4: LinkedHashMap = new LinkedHashMap();

         for (Entry var6 : var10.entrySet()) {
            val var2: Boolean;
            if (var6.getKey() is java.lang.String && var6.getValue() is java.lang.String) {
               var2 = true;
            } else {
               var2 = false;
            }

            if (var2) {
               var4.put(var6.getKey(), var6.getValue());
            }
         }

         val var13: ArrayList = new ArrayList(var4.size());

         for (Entry var25 : var4.entrySet()) {
            var var21: Any = var25.getKey();
            val var26: Any = var25.getValue();
            r.f(var21, "null cannot be cast to non-null type kotlin.String");
            var21 = var21 as java.lang.String;
            r.f(var26, "null cannot be cast to non-null type kotlin.String");
            var13.add(w.a(var21, var26 as java.lang.String));
         }

         var10 = s.t(var13);
         if (var10 != null) {
            break label79;
         }
      }

      var10 = s.h();
   }

   var var20: ChannelId;
   label56: {
      val var18: java.lang.String = var10.get("channel_id") as java.lang.String;
      if (var18 != null) {
         val var19: java.lang.Long = SnowflakeUtils.INSTANCE.toSnowflake(var18);
         if (var19 != null) {
            var20 = ChannelId.box-impl(ChannelId.constructor-impl(var19));
            break label56;
         }
      }

      var20 = null;
   }

   var var23: java.lang.String = var10.get("message_id") as java.lang.String;
   if (var23 != null) {
      var23 = MessageId.constructor-impl(var23);
   } else {
      var23 = null;
   }

   var var27: Any = var1.get("alertTitle");
   if (var27 is java.lang.String) {
      var27 = var27 as java.lang.String;
   } else {
      var27 = null;
   }

   var var29: Any = var1.get("alertBody");
   if (var29 is java.lang.String) {
      var29 = var29 as java.lang.String;
   } else {
      var29 = null;
   }

   val var9: Any = var1.get("silent");
   var var15: java.lang.Boolean = null;
   if (var9 is java.lang.Boolean) {
      var15 = var9 as java.lang.Boolean;
   }

   val var16: Boolean;
   if (var15 != null) {
      var16 = var15;
   } else {
      var16 = false;
   }

   return new NotificationData(
      "LOCAL_NOTIFICATION",
      var23,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      var20,
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
      (java.lang.String)var27,
      (java.lang.String)var29,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      var16,
      var10,
      -516,
      65151,
      null
   );
}
