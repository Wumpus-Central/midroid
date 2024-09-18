package com.discord.notifications.react.events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.g0
import xk.g0.a

@f
internal data class LocalNotificationEvent(locationNotification: Map<String, String?>) : ReactEvent {
   public final val locationNotification: Map<String, String?>

   init {
      q.h(var1, "locationNotification");
      super();
      this.locationNotification = var1;
   }

   public operator fun component1(): Map<String, String?> {
      return this.locationNotification;
   }

   public fun copy(locationNotification: Map<String, String?> = var0.locationNotification): LocalNotificationEvent {
      q.h(var1, "locationNotification");
      return new LocalNotificationEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LocalNotificationEvent) {
         return false;
      } else {
         return q.c(this.locationNotification, (var1 as LocalNotificationEvent).locationNotification);
      }
   }

   public override fun hashCode(): Int {
      return this.locationNotification.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.toNativeMap(this.locationNotification);
   }

   public override fun toString(): String {
      val var2: java.util.Map = this.locationNotification;
      val var1: StringBuilder = new StringBuilder();
      var1.append("LocalNotificationEvent(locationNotification=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: LocalNotificationEvent.$serializer = new LocalNotificationEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.notifications.react.events.LocalNotificationEvent", var0, 1
         );
         var1.l("locationNotification", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{LocalNotificationEvent.access$get$childSerializers$cp()[0]};
      }

      public open fun deserialize(decoder: Decoder): LocalNotificationEvent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var8: Array<KSerializer> = LocalNotificationEvent.access$get$childSerializers$cp();
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var9: java.util.Map;
         if (var5) {
            var9 = var7.m(var6, 0, var8[0], null) as java.util.Map;
         } else {
            var2 = 0;
            var9 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var9 = var7.m(var6, 0, var8[0], var9) as java.util.Map;
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new LocalNotificationEvent(var2, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: LocalNotificationEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         LocalNotificationEvent.write$Self$notification_react_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LocalNotificationEvent> {
         return LocalNotificationEvent.$serializer.INSTANCE;
      }
   }
}
