package com.discord.push_notification_monitor

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import fl.h
import fl.x0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      q.h(var4, "type");
      q.h(var5, "title");
      super();
      this.receivedTimestamp = var1;
      this.silent = var3;
      this.type = var4;
      this.title = var5;
      this.content = var6;
      this.channelId = var7;
      this.messageId = var8;
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
      q.h(var4, "type");
      q.h(var5, "title");
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
         } else if (!q.c(this.type, var1.type)) {
            return false;
         } else if (!q.c(this.title, var1.title)) {
            return false;
         } else if (!q.c(this.content, var1.content)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return q.c(this.messageId, var1.messageId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = java.lang.Long.hashCode(this.receivedTimestamp);
      val var4: Int = java.lang.Boolean.hashCode(this.silent);
      val var6: Int = this.type.hashCode();
      val var7: Int = this.title.hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.content == null) {
         var1 = 0;
      } else {
         var1 = this.content.hashCode();
      }

      val var2: Int;
      if (this.channelId == null) {
         var2 = 0;
      } else {
         var2 = this.channelId.hashCode();
      }

      if (this.messageId != null) {
         var3 = this.messageId.hashCode();
      }

      return (((((var5 * 31 + var4) * 31 + var6) * 31 + var7) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var2: Long = this.receivedTimestamp;
      val var1: Boolean = this.silent;
      val var8: java.lang.String = this.type;
      val var5: java.lang.String = this.title;
      val var4: java.lang.String = this.content;
      val var7: java.lang.String = this.channelId;
      val var9: java.lang.String = this.messageId;
      val var6: StringBuilder = new StringBuilder();
      var6.append("PushNotificationMeta(receivedTimestamp=");
      var6.append(var2);
      var6.append(", silent=");
      var6.append(var1);
      var6.append(", type=");
      var6.append(var8);
      var6.append(", title=");
      var6.append(var5);
      var6.append(", content=");
      var6.append(var4);
      var6.append(", channelId=");
      var6.append(var7);
      var6.append(", messageId=");
      var6.append(var9);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : g0 {
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

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{x0.a, h.a, b2.a, b2.a, a.u(b2.a), a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): PushNotificationMeta {
         q.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.c(var12);
         var var2: Int;
         var var5: Boolean;
         var var6: Long;
         var var8: java.lang.String;
         var var9: java.lang.String;
         var var10: java.lang.String;
         var var11: java.lang.String;
         var var15: java.lang.String;
         if (var13.y()) {
            var6 = var13.h(var12, 0);
            var5 = var13.s(var12, 1);
            var11 = var13.t(var12, 2);
            var10 = var13.t(var12, 3);
            val var14: b2 = b2.a;
            var9 = var13.v(var12, 4, b2.a, null) as java.lang.String;
            var8 = var13.v(var12, 5, var14, null) as java.lang.String;
            var15 = var13.v(var12, 6, var14, null) as java.lang.String;
            var2 = 127;
         } else {
            var var3: Boolean = true;
            var5 = false;
            var9 = null;
            var8 = null;
            var15 = null;
            var6 = 0L;
            var11 = null;
            var10 = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var13.x(var12);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var6 = var13.h(var12, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var5 = var13.s(var12, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var11 = var13.t(var12, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var10 = var13.t(var12, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var9 = var13.v(var12, 4, b2.a, var9) as java.lang.String;
                     var2 |= 16;
                     break;
                  case 5:
                     var8 = var13.v(var12, 5, b2.a, var8) as java.lang.String;
                     var2 |= 32;
                     break;
                  case 6:
                     var15 = var13.v(var12, 6, b2.a, var15) as java.lang.String;
                     var2 |= 64;
                     break;
                  default:
                     throw new n(var4);
               }
            }
         }

         var13.b(var12);
         return new PushNotificationMeta(var2, var6, var5, var11, var10, var9, var8, var15, null);
      }

      public open fun serialize(encoder: Encoder, value: PushNotificationMeta) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         PushNotificationMeta.write$Self$push_notification_monitor_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PushNotificationMeta> {
         return PushNotificationMeta.$serializer.INSTANCE;
      }
   }
}
