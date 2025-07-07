package com.discord.notifications.react.events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.r

internal data class NotificationEvent(notification: Map<String, String?>) : ReactEvent {
   public final val notification: Map<String, String?>

   init {
      r.h(var1, "notification");
      super();
      this.notification = var1;
   }

   public operator fun component1(): Map<String, String?> {
      return this.notification;
   }

   public fun copy(notification: Map<String, String?> = var0.notification): NotificationEvent {
      r.h(var1, "notification");
      return new NotificationEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is NotificationEvent) {
         return false;
      } else {
         return r.c(this.notification, (var1 as NotificationEvent).notification);
      }
   }

   public override fun hashCode(): Int {
      return this.notification.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.toNativeMap(this.notification);
   }

   public override fun toString(): String {
      val var1: java.util.Map = this.notification;
      val var2: StringBuilder = new StringBuilder();
      var2.append("NotificationEvent(notification=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
