package com.discord.push_notification_monitor

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import ub.g

@g
public data class PushNotificationLog(pushNotifications: List<PushNotificationMeta> = i.k()) {
   public final val pushNotifications: List<PushNotificationMeta>

   fun PushNotificationLog() {
      this(null, 1, null);
   }

   init {
      r.h(var1, "pushNotifications");
      super();
      this.pushNotifications = var1;
   }

   public operator fun component1(): List<PushNotificationMeta> {
      return this.pushNotifications;
   }

   public fun copy(pushNotifications: List<PushNotificationMeta> = var0.pushNotifications): PushNotificationLog {
      r.h(var1, "pushNotifications");
      return new PushNotificationLog(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PushNotificationLog) {
         return false;
      } else {
         return r.c(this.pushNotifications, (var1 as PushNotificationLog).pushNotifications);
      }
   }

   public override fun hashCode(): Int {
      return this.pushNotifications.hashCode();
   }

   public override fun toString(): String {
      val var2: java.util.List = this.pushNotifications;
      val var1: StringBuilder = new StringBuilder();
      var1.append("PushNotificationLog(pushNotifications=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PushNotificationLog> {
         return PushNotificationLog.$serializer.INSTANCE;
      }
   }
}
