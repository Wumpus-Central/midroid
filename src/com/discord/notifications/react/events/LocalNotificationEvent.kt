package com.discord.notifications.react.events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
internal data class LocalNotificationEvent(locationNotification: Map<String, String?>) : ReactEvent {
   public final val locationNotification: Map<String, String?>

   init {
      r.h(var1, "locationNotification");
      super();
      this.locationNotification = var1;
   }

   public operator fun component1(): Map<String, String?> {
      return this.locationNotification;
   }

   public fun copy(locationNotification: Map<String, String?> = var0.locationNotification): LocalNotificationEvent {
      r.h(var1, "locationNotification");
      return new LocalNotificationEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LocalNotificationEvent) {
         return false;
      } else {
         return r.c(this.locationNotification, (var1 as LocalNotificationEvent).locationNotification);
      }
   }

   public override fun hashCode(): Int {
      return this.locationNotification.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.toNativeMap(this.locationNotification);
   }

   public override fun toString(): String {
      val var1: java.util.Map = this.locationNotification;
      val var2: StringBuilder = new StringBuilder();
      var2.append("LocalNotificationEvent(locationNotification=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LocalNotificationEvent> {
         return LocalNotificationEvent.$serializer.INSTANCE;
      }
   }
}
