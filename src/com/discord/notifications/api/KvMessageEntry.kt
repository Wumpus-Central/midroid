package com.discord.notifications.api

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.s
import uk.f
import uk.n
import xk.f0
import xk.n1
import xk.f0.a

@f
public data class KvMessageEntry(members: List<JsonObject> = ..., users: List<JsonObject> = ..., message: JsonObject, id: MessageId, channelId: ChannelId) : KvMessageEntry(
      var1, var2, var3, var4, var5
   ) {
   public final val channelId: ChannelId
   public final val id: MessageId
   public final val members: List<JsonObject>
   public final val message: JsonObject
   public final val users: List<JsonObject>

   fun KvMessageEntry(
      var1: Int,
      var2: MutableList<JsonObject>,
      var3: MutableList<JsonObject>,
      var4: JsonObject,
      var5: java.lang.String,
      var6: ChannelId,
      var7: SerializationConstructorMarker
   ) {
      if (28 != (var1 and 28)) {
         n1.b(var1, 28, KvMessageEntry.$serializer.INSTANCE.getDescriptor());
      }

      super();
      if ((var1 and 1) == 0) {
         var2 = h.i();
      }

      this.members = var2;
      if ((var1 and 2) == 0) {
         this.users = h.i();
      } else {
         this.users = var3;
      }

      this.message = var4;
      this.id = var5;
      this.channelId = var6.unbox-impl();
   }

   fun KvMessageEntry(var1: MutableList<JsonObject>, var2: MutableList<JsonObject>, var3: JsonObject, var4: java.lang.String, var5: Long) {
      super();
      this.members = var1;
      this.users = var2;
      this.message = var3;
      this.id = var4;
      this.channelId = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: KvMessageEntry, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var3: s = s.a;
      var1.y(var2, 0, new xk.f(s.a), var0.members);
      var1.y(var2, 1, new xk.f(var3), var0.users);
      var1.y(var2, 2, var3, var0.message);
      var1.y(var2, 3, MessageId.$serializer.INSTANCE, MessageId.box-impl(var0.id));
      var1.y(var2, 4, ChannelId.$serializer.INSTANCE, ChannelId.box-impl(var0.channelId));
   }

   public operator fun component1(): List<JsonObject> {
      return this.members;
   }

   public operator fun component2(): List<JsonObject> {
      return this.users;
   }

   public operator fun component3(): JsonObject {
      return this.message;
   }

   public operator fun component4(): MessageId {
      return this.id;
   }

   public operator fun component5(): ChannelId {
      return this.channelId;
   }

   public fun copy(members: List<JsonObject> = ..., users: List<JsonObject> = ..., message: JsonObject = ..., id: MessageId = ..., channelId: ChannelId = ...): KvMessageEntry {
      r.h(var1, "members");
      r.h(var2, "users");
      r.h(var3, "message");
      r.h(var4, "id");
      return new KvMessageEntry(var1, var2, var3, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is KvMessageEntry) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.members, var1.members)) {
            return false;
         } else if (!r.c(this.users, var1.users)) {
            return false;
         } else if (!r.c(this.message, var1.message)) {
            return false;
         } else if (!MessageId.equals-impl0(this.id, var1.id)) {
            return false;
         } else {
            return ChannelId.equals-impl0(this.channelId, var1.channelId);
         }
      }
   }

   public override fun hashCode(): Int {
      return (((this.members.hashCode() * 31 + this.users.hashCode()) * 31 + this.message.hashCode()) * 31 + MessageId.hashCode-impl(this.id)) * 31
         + ChannelId.hashCode-impl(this.channelId);
   }

   public override fun toString(): String {
      val var1: java.util.List = this.members;
      val var2: java.util.List = this.users;
      val var4: JsonObject = this.message;
      val var6: java.lang.String = MessageId.toString-impl(this.id);
      val var5: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var3: StringBuilder = new StringBuilder();
      var3.append("KvMessageEntry(members=");
      var3.append(var1);
      var3.append(", users=");
      var3.append(var2);
      var3.append(", message=");
      var3.append(var4);
      var3.append(", id=");
      var3.append(var6);
      var3.append(", channelId=");
      var3.append(var5);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<KvMessageEntry> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: KvMessageEntry.$serializer = new KvMessageEntry.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.KvMessageEntry", var0, 5);
         var1.l("members", true);
         var1.l("users", true);
         var1.l("message", false);
         var1.l("id", false);
         var1.l("channelId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: s = s.a;
         return new KSerializer[]{new xk.f(s.a), new xk.f(var1), var1, MessageId.$serializer.INSTANCE, ChannelId.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): KvMessageEntry {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var2: Int;
         var var6: Any;
         var var7: Any;
         var var9: Any;
         var var13: Any;
         var var16: Any;
         if (var12.p()) {
            var16 = s.a;
            var13 = (MessageId)var12.y(var11, 0, new xk.f(s.a), null);
            var9 = var12.y(var11, 1, new xk.f((KSerializer)var16), null);
            var7 = var12.y(var11, 2, (DeserializationStrategy)var16, null);
            var6 = var12.y(var11, 3, MessageId.$serializer.INSTANCE, null);
            var16 = var12.y(var11, 4, ChannelId.$serializer.INSTANCE, null);
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var13 = null;
            var var8: Any = null;
            var7 = null;
            var6 = null;
            var16 = null;

            while (var3) {
               val var4: Int = var12.o(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var7 = var12.y(var11, 4, ChannelId.$serializer.INSTANCE, var7);
                              var2 |= 16;
                           } else {
                              var8 = var12.y(var11, 3, MessageId.$serializer.INSTANCE, var8);
                              var2 |= 8;
                           }
                        } else {
                           var6 = var12.y(var11, 2, s.a, var6);
                           var2 |= 4;
                        }
                     } else {
                        var16 = var12.y(var11, 1, new xk.f(s.a), var16);
                        var2 |= 2;
                     }
                  } else {
                     var13 = (MessageId)var12.y(var11, 0, new xk.f(s.a), var13);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var9 = var16;
            var7 = var6;
            var16 = var7;
            var6 = var8;
         }

         var12.c(var11);
         val var21: java.util.List = var13 as java.util.List;
         var9 = var9 as java.util.List;
         var7 = var7 as JsonObject;
         var13 = var6 as MessageId;
         val var15: java.lang.String;
         if (var6 as MessageId != null) {
            var15 = var13.unbox-impl();
         } else {
            var15 = null;
         }

         return new KvMessageEntry(var2, var21, (java.util.List)var9, (JsonObject)var7, var15, var16 as ChannelId, null, null);
      }

      public open fun serialize(encoder: Encoder, value: KvMessageEntry) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         KvMessageEntry.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<KvMessageEntry> {
         return KvMessageEntry.$serializer.INSTANCE;
      }
   }
}
