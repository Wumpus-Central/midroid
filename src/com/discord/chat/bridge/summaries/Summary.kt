package com.discord.chat.bridge.summaries

import cl.f
import cl.n
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import fl.b2
import fl.g0
import fl.n0
import fl.o1
import fl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker

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
         o1.b(var1, 255, Summary.$serializer.INSTANCE.getDescriptor());
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
      q.h(var1, "id");
      q.h(var2, "topic");
      q.h(var3, "summShort");
      q.h(var4, "people");
      q.h(var5, "startId");
      q.h(var6, "endId");
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
      q.h(var1, "id");
      q.h(var2, "topic");
      q.h(var3, "summShort");
      q.h(var4, "people");
      q.h(var5, "startId");
      q.h(var6, "endId");
      return new Summary(var1, var2, var3, var4, var5, var6, var7, var8, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Summary) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.topic, var1.topic)) {
            return false;
         } else if (!q.c(this.summShort, var1.summShort)) {
            return false;
         } else if (!q.c(this.people, var1.people)) {
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
      val var9: java.lang.String = this.id;
      val var8: java.lang.String = this.topic;
      val var2: java.lang.String = this.summShort;
      val var5: java.util.List = this.people;
      val var3: java.lang.String = MessageId.toString-impl(this.startId);
      val var6: java.lang.String = MessageId.toString-impl(this.endId);
      val var1: Int = this.count;
      val var7: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var4: StringBuilder = new StringBuilder();
      var4.append("Summary(id=");
      var4.append(var9);
      var4.append(", topic=");
      var4.append(var8);
      var4.append(", summShort=");
      var4.append(var2);
      var4.append(", people=");
      var4.append(var5);
      var4.append(", startId=");
      var4.append(var3);
      var4.append(", endId=");
      var4.append(var6);
      var4.append(", count=");
      var4.append(var1);
      var4.append(", channelId=");
      var4.append(var7);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
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
            b2.a,
            b2.a,
            b2.a,
            Summary.access$get$childSerializers$cp()[3],
            MessageId.$serializer.INSTANCE,
            MessageId.$serializer.INSTANCE,
            n0.a,
            ChannelId.$serializer.INSTANCE
         };
      }

      public open fun deserialize(decoder: Decoder): Summary {
         q.h(var1, "decoder");
         val var17: SerialDescriptor = this.getDescriptor();
         val var18: c = var1.c(var17);
         val var14: Array<KSerializer> = Summary.access$get$childSerializers$cp();
         val var7: Boolean = var18.y();
         var var4: Int = 7;
         var var3: Int;
         var var9: Any;
         var var10: java.util.List;
         var var11: java.lang.String;
         var var12: java.lang.String;
         var var13: java.lang.String;
         val var20: java.lang.String;
         var var25: java.lang.String;
         if (var7) {
            var13 = var18.t(var17, 0);
            var11 = var18.t(var17, 1);
            var12 = var18.t(var17, 2);
            var10 = var18.m(var17, 3, var14[3], null) as java.util.List;
            val var8: MessageId.$serializer = MessageId.$serializer.INSTANCE;
            val var19: MessageId = var18.m(var17, 4, MessageId.$serializer.INSTANCE, null) as MessageId;
            if (var19 != null) {
               var20 = var19.unbox-impl();
            } else {
               var20 = null;
            }

            val var24: MessageId = var18.m(var17, 5, var8, null) as MessageId;
            if (var24 != null) {
               var25 = var24.unbox-impl();
            } else {
               var25 = null;
            }

            val var2: Int = var18.k(var17, 6);
            var9 = var18.m(var17, 7, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var4 = 255;
            var3 = var2;
         } else {
            var var5: Boolean = true;
            var3 = 0;
            var10 = null;
            var13 = null;
            var12 = null;
            var11 = null;
            var9 = null;
            var25 = null;
            var var21: java.lang.String = null;
            var var22: Int = 0;

            while (var5) {
               label63: {
                  val var6: Int = var18.x(var17);
                  switch (var6) {
                     case -1:
                        var5 = false;
                        break;
                     case 0:
                        var13 = var18.t(var17, 0);
                        var22 |= 1;
                        break;
                     case 1:
                        var21 = var18.t(var17, 1);
                        var22 |= 2;
                        break label63;
                     case 2:
                        var25 = var18.t(var17, 2);
                        var22 |= 4;
                        break label63;
                     case 3:
                        var10 = var18.m(var17, 3, var14[3], var10) as java.util.List;
                        var22 |= 8;
                        break label63;
                     case 4:
                        if (var9 != null) {
                           var9 = MessageId.box-impl((java.lang.String)var9);
                        } else {
                           var9 = null;
                        }

                        var9 = var18.m(var17, 4, MessageId.$serializer.INSTANCE, var9) as MessageId;
                        if (var9 != null) {
                           var9 = var9.unbox-impl();
                        } else {
                           var9 = null;
                        }

                        var22 |= 16;
                        break label63;
                     case 5:
                        val var31: MessageId;
                        if (var11 != null) {
                           var31 = MessageId.box-impl(var11);
                        } else {
                           var31 = null;
                        }

                        val var32: MessageId = var18.m(var17, 5, MessageId.$serializer.INSTANCE, var31) as MessageId;
                        if (var32 != null) {
                           var11 = var32.unbox-impl();
                        } else {
                           var11 = null;
                        }

                        var22 |= 32;
                        break label63;
                     case 6:
                        var3 = var18.k(var17, 6);
                        var22 |= 64;
                        continue;
                     case 7:
                        var12 = var18.m(var17, var4, ChannelId.$serializer.INSTANCE, var12) as ChannelId;
                        var22 |= 128;
                        continue;
                     default:
                        throw new n(var6);
                  }

                  var4 = 7;
                  continue;
               }

               var4 = 7;
            }

            var12 = var25;
            var11 = var21;
            var9 = var12;
            var25 = var11;
            var20 = (java.lang.String)var9;
            var4 = var22;
         }

         var18.b(var17);
         return new Summary(var4, var13, var11, var12, var10, var20, var25, var3, var9, null, null);
      }

      public open fun serialize(encoder: Encoder, value: Summary) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         Summary.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Summary> {
         return Summary.$serializer.INSTANCE;
      }
   }
}
