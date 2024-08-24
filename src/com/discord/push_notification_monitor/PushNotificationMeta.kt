package com.discord.push_notification_monitor

import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.h
import xk.w0

@f
public data class PushNotificationMeta(receivedTimestamp: Long,
   silent: Boolean,
   type: String,
   title: String,
   content: String?,
   channelId: String? = null,
   messageId: String? = null
) {
   public final val channelId: String?
   public final val content: String?
   public final val messageId: String?
   public final val receivedTimestamp: Long
   public final val silent: Boolean
   public final val title: String
   public final val type: String

   init {
      r.h(var4, "type");
      r.h(var5, "title");
      super();
      this.receivedTimestamp = var1;
      this.silent = var3;
      this.type = var4;
      this.title = var5;
      this.content = var6;
      this.channelId = var7;
      this.messageId = var8;
   }

   @JvmStatic
   public fun `write$Self`(self: PushNotificationMeta, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.E(var2, 0, var0.receivedTimestamp);
      var1.x(var2, 1, var0.silent);
      var1.z(var2, 2, var0.type);
      var1.z(var2, 3, var0.title);
      val var7: a2 = a2.a;
      var1.m(var2, 4, a2.a, var0.content);
      var var3: Boolean;
      if (!var1.A(var2, 5) && var0.channelId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, var7, var0.channelId);
      }

      label24: {
         if (!var1.A(var2, 6)) {
            var3 = false;
            if (var0.messageId == null) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 6, var7, var0.messageId);
      }
   }

   public operator fun component1(): Long {
      return this.receivedTimestamp;
   }

   public operator fun component2(): Boolean {
      return this.silent;
   }

   public operator fun component3(): String {
      return this.type;
   }

   public operator fun component4(): String {
      return this.title;
   }

   public operator fun component5(): String? {
      return this.content;
   }

   public operator fun component6(): String? {
      return this.channelId;
   }

   public operator fun component7(): String? {
      return this.messageId;
   }

   public fun copy(
      receivedTimestamp: Long = var0.receivedTimestamp,
      silent: Boolean = var0.silent,
      type: String = var0.type,
      title: String = var0.title,
      content: String? = var0.content,
      channelId: String? = var0.channelId,
      messageId: String? = var0.messageId
   ): PushNotificationMeta {
      r.h(var4, "type");
      r.h(var5, "title");
      return new PushNotificationMeta(var1, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PushNotificationMeta) {
         return false;
      } else {
         var1 = var1;
         if (this.receivedTimestamp != var1.receivedTimestamp) {
            return false;
         } else if (this.silent != var1.silent) {
            return false;
         } else if (!r.c(this.type, var1.type)) {
            return false;
         } else if (!r.c(this.title, var1.title)) {
            return false;
         } else if (!r.c(this.content, var1.content)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return r.c(this.messageId, var1.messageId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = java.lang.Long.hashCode(this.receivedTimestamp);
      var var1: Byte = this.silent;
      if (this.silent != 0) {
         var1 = 1;
      }

      val var6: Int = this.type.hashCode();
      val var7: Int = this.title.hashCode();
      var var4: Int = 0;
      val var9: Int;
      if (this.content == null) {
         var9 = 0;
      } else {
         var9 = this.content.hashCode();
      }

      val var3: Int;
      if (this.channelId == null) {
         var3 = 0;
      } else {
         var3 = this.channelId.hashCode();
      }

      if (this.messageId != null) {
         var4 = this.messageId.hashCode();
      }

      return (((((var5 * 31 + var1) * 31 + var6) * 31 + var7) * 31 + var9) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var2: Long = this.receivedTimestamp;
      val var1: Boolean = this.silent;
      val var7: java.lang.String = this.type;
      val var9: java.lang.String = this.title;
      val var6: java.lang.String = this.content;
      val var5: java.lang.String = this.channelId;
      val var8: java.lang.String = this.messageId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("PushNotificationMeta(receivedTimestamp=");
      var4.append(var2);
      var4.append(", silent=");
      var4.append(var1);
      var4.append(", type=");
      var4.append(var7);
      var4.append(", title=");
      var4.append(var9);
      var4.append(", content=");
      var4.append(var6);
      var4.append(", channelId=");
      var4.append(var5);
      var4.append(", messageId=");
      var4.append(var8);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<PushNotificationMeta> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PushNotificationMeta.$serializer = new PushNotificationMeta.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.push_notification_monitor.PushNotificationMeta", var0, 7);
         var1.l("receivedTimestamp", false);
         var1.l("silent", false);
         var1.l("type", false);
         var1.l("title", false);
         var1.l("content", false);
         var1.l("channelId", true);
         var1.l("messageId", true);
         descriptor = var1;
      }

      public override fun childSerializers(): Array<KSerializer<*>> {
         val var3: a2 = a2.a;
         return new KSerializer[]{w0.a, h.a, a2.a, a2.a, vk.a.u(a2.a), vk.a.u(var3), vk.a.u(var3)};
      }

      public open fun deserialize(decoder: Decoder): PushNotificationMeta {
         r.h(var1, "decoder");
         val var13: SerialDescriptor = this.getDescriptor();
         val var14: c = var1.b(var13);
         var var2: Int;
         var var5: Long;
         var var7: Boolean;
         var var8: Any;
         var var9: Any;
         var var11: Any;
         val var12: Any;
         var var18: Any;
         if (var14.p()) {
            var5 = var14.f(var13, 0);
            var7 = var14.C(var13, 1);
            var8 = var14.m(var13, 2);
            val var15: java.lang.String = var14.m(var13, 3);
            var18 = a2.a;
            var11 = var14.n(var13, 4, a2.a, null);
            var9 = var14.n(var13, 5, (DeserializationStrategy)var18, null);
            var12 = var14.n(var13, 6, (DeserializationStrategy)var18, null);
            var2 = 127;
            var18 = var15;
         } else {
            var var3: Boolean = true;
            var7 = false;
            var11 = null;
            var9 = null;
            var var16: Any = null;
            var5 = 0L;
            var18 = null;
            var8 = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var14.o(var13);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var5 = var14.f(var13, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var7 = var14.C(var13, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var18 = var14.m(var13, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var8 = var14.m(var13, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var11 = var14.n(var13, 4, a2.a, (java.lang.String)var11);
                     var2 |= 16;
                     break;
                  case 5:
                     var9 = var14.n(var13, 5, a2.a, (java.lang.String)var9);
                     var2 |= 32;
                     break;
                  case 6:
                     var16 = var14.n(var13, 6, a2.a, (java.lang.String)var16);
                     var2 |= 64;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var18 = var8;
            var8 = var18;
            var12 = var16;
         }

         var14.c(var13);
         return new PushNotificationMeta(
            var2,
            var5,
            var7,
            (java.lang.String)var8,
            (java.lang.String)var18,
            var11 as java.lang.String,
            var9 as java.lang.String,
            var12 as java.lang.String,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: PushNotificationMeta) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PushNotificationMeta.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      override fun typeParametersSerializers(): Array<KSerializer<?>> {
         return f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PushNotificationMeta> {
         return PushNotificationMeta.$serializer.INSTANCE;
      }
   }
}
