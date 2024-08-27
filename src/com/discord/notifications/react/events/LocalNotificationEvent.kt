package com.discord.notifications.react.events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.r0

@f
internal data class LocalNotificationEvent(locationNotification: Map<String, String?>) : ReactEvent {
   public final val locationNotification: Map<String, String?>

   init {
      r.h(var1, "locationNotification");
      super();
      this.locationNotification = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: LocalNotificationEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, new r0<>(a2.a, a.u(a2.a)), var0.locationNotification);
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

   public object `$serializer` : f0<LocalNotificationEvent> {
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

      public override fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{new r0<>(a2.a, vk.a.u(a2.a))};
      }

      public open fun deserialize(decoder: Decoder): LocalNotificationEvent {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var10: Any;
         if (var5) {
            var10 = var7.y(var6, 0, new r0<>(a2.a, vk.a.u(a2.a)), null);
         } else {
            var2 = 0;
            var10 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var10 = var7.y(var6, 0, new r0<>(a2.a, vk.a.u(a2.a)), (java.util.Map<java.lang.String, ? extends java.lang.String>)var10);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new LocalNotificationEvent(var2, var10 as java.util.Map, null);
      }

      public open fun serialize(encoder: Encoder, value: LocalNotificationEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         LocalNotificationEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      override fun typeParametersSerializers(): Array<KSerializer<?>> {
         return f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LocalNotificationEvent> {
         return LocalNotificationEvent.$serializer.INSTANCE;
      }
   }
}
