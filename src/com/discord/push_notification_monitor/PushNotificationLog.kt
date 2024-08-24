package com.discord.push_notification_monitor

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
import xk.f0
import xk.f0.a

@f
public data class PushNotificationLog(pushNotifications: List<PushNotificationMeta> = h.i()) {
   public final val pushNotifications: List<PushNotificationMeta>

   fun PushNotificationLog() {
      this(null, 1, null);
   }

   init {
      r.h(var1, "pushNotifications");
      super();
      this.pushNotifications = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: PushNotificationLog, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var4: Boolean = var1.A(var2, 0);
      var var3: Boolean = true;
      if (!var4 && r.c(var0.pushNotifications, h.i())) {
         var3 = false;
      }

      if (var3) {
         var1.y(var2, 0, new xk.f(PushNotificationMeta.$serializer.INSTANCE), var0.pushNotifications);
      }
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
      val var1: java.util.List = this.pushNotifications;
      val var2: StringBuilder = new StringBuilder();
      var2.append("PushNotificationLog(pushNotifications=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<PushNotificationLog> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PushNotificationLog.$serializer = new PushNotificationLog.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.push_notification_monitor.PushNotificationLog", var0, 1);
         var1.l("pushNotifications", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{new xk.f(PushNotificationMeta.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): PushNotificationLog {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: Any;
         if (var5) {
            var8 = var7.y(var6, 0, new xk.f(PushNotificationMeta.$serializer.INSTANCE), null);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.y(var6, 0, new xk.f(PushNotificationMeta.$serializer.INSTANCE), var8);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new PushNotificationLog(var2, var8 as java.util.List, null);
      }

      public open fun serialize(encoder: Encoder, value: PushNotificationLog) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PushNotificationLog.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PushNotificationLog> {
         return PushNotificationLog.$serializer.INSTANCE;
      }
   }
}
