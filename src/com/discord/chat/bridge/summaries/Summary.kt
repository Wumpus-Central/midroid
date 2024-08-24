package com.discord.chat.bridge.summaries

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.m0
import xk.n1
import xk.f0.a

@f
public data class Summary(id: String,
   topic: String,
   summShort: String,
   people: List<UserId>,
   startId: MessageId,
   endId: MessageId,
   count: Int,
   channelId: ChannelId
) : Summary(var1, var2, var3, var4, var5, var6, var7, var8) {
   public final val channelId: ChannelId
   public final val count: Int
   public final val endId: MessageId
   public final val id: String
   public final val people: List<UserId>
   public final val startId: MessageId
   public final val summShort: String
   public final val topic: String

   fun Summary(
      var1: Int,
      var2: java.lang.String,
      var3: java.lang.String,
      var4: java.lang.String,
      var5: MutableList<UserId>,
      var6: java.lang.String,
      var7: java.lang.String,
      var8: Int,
      var9: ChannelId,
      var10: SerializationConstructorMarker
   ) {
      if (255 != (var1 and 255)) {
         n1.b(var1, 255, Summary.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.id = var2;
      this.topic = var3;
      this.summShort = var4;
      this.people = var5;
      this.startId = var6;
      this.endId = var7;
      this.count = var8;
      this.channelId = var9.unbox-impl();
   }

   fun Summary(
      var1: java.lang.String,
      var2: java.lang.String,
      var3: java.lang.String,
      var4: MutableList<UserId>,
      var5: java.lang.String,
      var6: java.lang.String,
      var7: Int,
      var8: Long
   ) {
      super();
      this.id = var1;
      this.topic = var2;
      this.summShort = var3;
      this.people = var4;
      this.startId = var5;
      this.endId = var6;
      this.count = var7;
      this.channelId = var8;
   }

   @JvmStatic
   public fun `write$Self`(self: Summary, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.id);
      var1.z(var2, 1, var0.topic);
      var1.z(var2, 2, var0.summShort);
      var1.y(var2, 3, new xk.f(com.discord.primitives.UserId..serializer.INSTANCE), var0.people);
      val var3: com.discord.primitives.MessageId..serializer = com.discord.primitives.MessageId..serializer.INSTANCE;
      var1.y(var2, 4, com.discord.primitives.MessageId..serializer.INSTANCE, MessageId.box-impl(var0.startId));
      var1.y(var2, 5, var3, MessageId.box-impl(var0.endId));
      var1.w(var2, 6, var0.count);
      var1.y(var2, 7, com.discord.primitives.ChannelId..serializer.INSTANCE, ChannelId.box-impl(var0.channelId));
   }

   public operator fun component1(): String {
      return this.id;
   }

   public operator fun component2(): String {
      return this.topic;
   }

   public operator fun component3(): String {
      return this.summShort;
   }

   public operator fun component4(): List<UserId> {
      return this.people;
   }

   public operator fun component5(): MessageId {
      return this.startId;
   }

   public operator fun component6(): MessageId {
      return this.endId;
   }

   public operator fun component7(): Int {
      return this.count;
   }

   public operator fun component8(): ChannelId {
      return this.channelId;
   }

   public fun copy(
      id: String = ...,
      topic: String = ...,
      summShort: String = ...,
      people: List<UserId> = ...,
      startId: MessageId = ...,
      endId: MessageId = ...,
      count: Int = ...,
      channelId: ChannelId = ...
   ): Summary {
      r.h(var1, "id");
      r.h(var2, "topic");
      r.h(var3, "summShort");
      r.h(var4, "people");
      r.h(var5, "startId");
      r.h(var6, "endId");
      return new Summary(var1, var2, var3, var4, var5, var6, var7, var8, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Summary) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.id, var1.id)) {
            return false;
         } else if (!r.c(this.topic, var1.topic)) {
            return false;
         } else if (!r.c(this.summShort, var1.summShort)) {
            return false;
         } else if (!r.c(this.people, var1.people)) {
            return false;
         } else if (!MessageId.equals-impl0(this.startId, var1.startId)) {
            return false;
         } else if (!MessageId.equals-impl0(this.endId, var1.endId)) {
            return false;
         } else if (this.count != var1.count) {
            return false;
         } else {
            return ChannelId.equals-impl0(this.channelId, var1.channelId);
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (((this.id.hashCode() * 31 + this.topic.hashCode()) * 31 + this.summShort.hashCode()) * 31 + this.people.hashCode()) * 31
                                    + MessageId.hashCode-impl(this.startId)
                              )
                              * 31
                           + MessageId.hashCode-impl(this.endId)
                     )
                     * 31
                  + Integer.hashCode(this.count)
            )
            * 31
         + ChannelId.hashCode-impl(this.channelId);
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.id;
      val var2: java.lang.String = this.topic;
      val var3: java.lang.String = this.summShort;
      val var5: java.util.List = this.people;
      val var8: java.lang.String = MessageId.toString-impl(this.startId);
      val var4: java.lang.String = MessageId.toString-impl(this.endId);
      val var1: Int = this.count;
      val var7: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var9: StringBuilder = new StringBuilder();
      var9.append("Summary(id=");
      var9.append(var6);
      var9.append(", topic=");
      var9.append(var2);
      var9.append(", summShort=");
      var9.append(var3);
      var9.append(", people=");
      var9.append(var5);
      var9.append(", startId=");
      var9.append(var8);
      var9.append(", endId=");
      var9.append(var4);
      var9.append(", count=");
      var9.append(var1);
      var9.append(", channelId=");
      var9.append(var7);
      var9.append(")");
      return var9.toString();
   }

   public object `$serializer` : f0<Summary> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: Summary.$serializer = new Summary.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.summaries.Summary", var0, 8);
         var1.l("id", false);
         var1.l("topic", false);
         var1.l("summShort", false);
         var1.l("people", false);
         var1.l("startId", false);
         var1.l("endId", false);
         var1.l("count", false);
         var1.l("channelId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{
            a2.a,
            a2.a,
            a2.a,
            new xk.f(com.discord.primitives.UserId..serializer.INSTANCE),
            com.discord.primitives.MessageId..serializer.INSTANCE,
            com.discord.primitives.MessageId..serializer.INSTANCE,
            m0.a,
            com.discord.primitives.ChannelId..serializer.INSTANCE
         };
      }

      public open fun deserialize(decoder: Decoder): Summary {
         r.h(var1, "decoder");
         val var15: SerialDescriptor = this.getDescriptor();
         val var16: c = var1.b(var15);
         val var7: Boolean = var16.p();
         var var4: Byte = 7;
         var var2: Int = 0;
         var var13: Any = null;
         var var3: Int;
         var var8: Any;
         var var10: java.lang.String;
         var var11: Any;
         var var14: Any;
         var var17: Any;
         var var20: Any;
         if (var7) {
            var10 = var16.m(var15, 0);
            var17 = var16.m(var15, 1);
            var8 = var16.m(var15, 2);
            var14 = var16.y(var15, 3, new xk.f(com.discord.primitives.UserId..serializer.INSTANCE), null);
            var20 = com.discord.primitives.MessageId..serializer.INSTANCE;
            var13 = var16.y(var15, 4, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var11 = (MessageId)var16.y(var15, 5, (DeserializationStrategy)var20, null);
            var3 = var16.i(var15, 6);
            var20 = var16.y(var15, 7, com.discord.primitives.ChannelId..serializer.INSTANCE, null);
            var2 = 255;
         } else {
            var var5: Boolean = true;
            var3 = 0;
            var10 = null;
            var var12: Any = null;
            var11 = null;
            var8 = null;
            var17 = null;
            var20 = null;

            while (var5) {
               label47: {
                  val var6: Int = var16.o(var15);
                  switch (var6) {
                     case -1:
                        var5 = false;
                        continue;
                     case 0:
                        var10 = var16.m(var15, 0);
                        var2 |= 1;
                        break;
                     case 1:
                        var20 = var16.m(var15, 1);
                        var2 |= 2;
                        break;
                     case 2:
                        var17 = var16.m(var15, 2);
                        var2 |= 4;
                        break label47;
                     case 3:
                        var8 = var16.y(var15, 3, new xk.f(com.discord.primitives.UserId..serializer.INSTANCE), var8);
                        var2 |= 8;
                        break label47;
                     case 4:
                        var13 = var16.y(var15, 4, com.discord.primitives.MessageId..serializer.INSTANCE, var13);
                        var2 |= 16;
                        continue;
                     case 5:
                        var11 = (MessageId)var16.y(var15, 5, com.discord.primitives.MessageId..serializer.INSTANCE, var11);
                        var2 |= 32;
                        continue;
                     case 6:
                        var3 = var16.i(var15, 6);
                        var2 |= 64;
                        continue;
                     case 7:
                        var12 = var16.y(var15, var4, com.discord.primitives.ChannelId..serializer.INSTANCE, var12);
                        var2 |= 128;
                        continue;
                     default:
                        throw new n(var6);
                  }

                  var4 = 7;
                  continue;
               }

               var4 = 7;
            }

            var14 = var8;
            var8 = var17;
            var17 = var20;
            var20 = var12;
         }

         var16.c(var15);
         var14 = var14 as java.util.List;
         val var24: MessageId = var13 as MessageId;
         val var25: java.lang.String;
         if (var13 as MessageId != null) {
            var25 = var24.unbox-impl();
         } else {
            var25 = null;
         }

         var11 = var11;
         val var23: java.lang.String;
         if (var11 != null) {
            var23 = var11.unbox-impl();
         } else {
            var23 = null;
         }

         return new Summary(
            var2, var10, (java.lang.String)var17, (java.lang.String)var8, (java.util.List)var14, var25, var23, var3, var20 as ChannelId, null, null
         );
      }

      public open fun serialize(encoder: Encoder, value: Summary) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         Summary.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Summary> {
         return Summary.$serializer.INSTANCE;
      }
   }
}
