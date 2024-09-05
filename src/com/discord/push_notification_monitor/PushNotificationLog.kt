package com.discord.push_notification_monitor

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.g0
import qn.g0.a

@f
public data class PushNotificationLog(pushNotifications: List<PushNotificationMeta> = i.j()) {
   public final val pushNotifications: List<PushNotificationMeta>

   fun PushNotificationLog() {
      this(null, 1, null);
   }

   init {
      q.h(var1, "pushNotifications");
      super();
      this.pushNotifications = var1;
   }

   public operator fun component1(): List<PushNotificationMeta> {
      return this.pushNotifications;
   }

   public fun copy(pushNotifications: List<PushNotificationMeta> = var0.pushNotifications): PushNotificationLog {
      q.h(var1, "pushNotifications");
      return new PushNotificationLog(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PushNotificationLog) {
         return false;
      } else {
         return q.c(this.pushNotifications, (var1 as PushNotificationLog).pushNotifications);
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

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PushNotificationLog.$serializer = new PushNotificationLog.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.push_notification_monitor.PushNotificationLog", var0, 1);
         var1.c("pushNotifications", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{PushNotificationLog.access$get$childSerializers$cp()[0]};
      }

      public open fun deserialize(decoder: Decoder): PushNotificationLog {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var8: Array<KSerializer> = PushNotificationLog.access$get$childSerializers$cp();
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var9: java.util.List;
         if (var5) {
            var9 = var7.y(var6, 0, var8[0], null) as java.util.List;
         } else {
            var2 = 0;
            var9 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var9 = var7.y(var6, 0, var8[0], var9) as java.util.List;
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new PushNotificationLog(var2, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: PushNotificationLog) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PushNotificationLog.write$Self$push_notification_monitor_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PushNotificationLog> {
         return PushNotificationLog.$serializer.INSTANCE;
      }
   }
}
