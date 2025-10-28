package com.discord.push_notification_monitor

import kotlinx.serialization.KSerializer
import wc.m

@m
public data class PushNotificationLog(pushNotifications: List<PushNotificationMeta> = CollectionsKt.k()) {
   public final val pushNotifications: List<PushNotificationMeta>

   fun PushNotificationLog() {
      this(null, 1, null);
   }

   init {
      this.pushNotifications = var1;
   }

   public operator fun component1(): List<PushNotificationMeta> {
      return this.pushNotifications;
   }

   public fun copy(pushNotifications: List<PushNotificationMeta> = var0.pushNotifications): PushNotificationLog {
      return new PushNotificationLog(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PushNotificationLog) {
         return false;
      } else {
         return this.pushNotifications == (var1 as PushNotificationLog).pushNotifications;
      }
   }

   public override fun hashCode(): Int {
      return this.pushNotifications.hashCode();
   }

   public override fun toString(): String {
      val var1: java.util.List = this.pushNotifications;
      val var2: StringBuilder = new StringBuilder();
      var2.append("PushNotificationLog(pushNotifications=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PushNotificationLog> {
         return PushNotificationLog.$serializer.INSTANCE;
      }
   }
}
