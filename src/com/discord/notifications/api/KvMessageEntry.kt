package com.discord.notifications.api

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import kotlinx.serialization.json.JsonObject
import uk.f
import uk.n
import xk.g0
import xk.o1
import xk.g0.a
import yk.q

@f
public data class KvMessageEntry(members: List<JsonObject> = ..., users: List<JsonObject> = ..., message: JsonObject, id: MessageId, channelId: ChannelId) : KvMessageEntry(
      var1, var2, var3, var4, var5
   ) {
   public final val channelId: ChannelId
   public final val id: MessageId
   public final val members: List<JsonObject>
   public final val message: JsonObject
   public final val users: List<JsonObject>

   @JvmStatic
   fun {
      val var0: q = q.a;
      $childSerializers = new KSerializer[]{new xk.f(q.a), new xk.f(var0), null, null, null};
   }

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
         o1.b(var1, 28, KvMessageEntry.$serializer.INSTANCE.getDescriptor());
      }

      super();
      if ((var1 and 1) == 0) {
         var2 = i.j();
      }

      this.members = var2;
      if ((var1 and 2) == 0) {
         this.users = i.j();
      } else {
         this.users = var3;
      }

      this.message = var4;
      this.id = var5;
      this.channelId = var6.unbox-impl();
   }

   fun KvMessageEntry(var1: MutableList<JsonObject>, var2: MutableList<JsonObject>, var3: JsonObject, var4: java.lang.String, var5: Long) {
      kotlin.jvm.internal.q.h(var1, "members");
      kotlin.jvm.internal.q.h(var2, "users");
      kotlin.jvm.internal.q.h(var3, "message");
      kotlin.jvm.internal.q.h(var4, "id");
      super();
      this.members = var1;
      this.users = var2;
      this.message = var3;
      this.id = var4;
      this.channelId = var5;
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
      kotlin.jvm.internal.q.h(var1, "members");
      kotlin.jvm.internal.q.h(var2, "users");
      kotlin.jvm.internal.q.h(var3, "message");
      kotlin.jvm.internal.q.h(var4, "id");
      return new KvMessageEntry(var1, var2, var3, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is KvMessageEntry) {
         return false;
      } else {
         var1 = var1;
         if (!kotlin.jvm.internal.q.c(this.members, var1.members)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.users, var1.users)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.message, var1.message)) {
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
      val var5: java.util.List = this.users;
      val var2: JsonObject = this.message;
      val var6: java.lang.String = MessageId.toString-impl(this.id);
      val var3: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var4: StringBuilder = new StringBuilder();
      var4.append("KvMessageEntry(members=");
      var4.append(var1);
      var4.append(", users=");
      var4.append(var5);
      var4.append(", message=");
      var4.append(var2);
      var4.append(", id=");
      var4.append(var6);
      var4.append(", channelId=");
      var4.append(var3);
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
         val var1: Array<KSerializer> = KvMessageEntry.access$get$childSerializers$cp();
         return new KSerializer[]{var1[0], var1[1], q.a, MessageId.$serializer.INSTANCE, ChannelId.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): KvMessageEntry {
         kotlin.jvm.internal.q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         var var9: Array<KSerializer> = KvMessageEntry.access$get$childSerializers$cp();
         var var2: Int;
         var var7: java.util.List;
         var var8: java.util.List;
         var var14: Any;
         var var16: Any;
         if (var11.y()) {
            var8 = var11.m(var10, 0, var9[0], null) as java.util.List;
            var16 = var11.m(var10, 1, var9[1], null) as java.util.List;
            val var22: JsonObject = var11.m(var10, 2, q.a, null) as JsonObject;
            var14 = var11.m(var10, 3, MessageId.$serializer.INSTANCE, null) as MessageId;
            if (var14 != null) {
               var14 = var14.unbox-impl();
            } else {
               var14 = null;
            }

            val var6: ChannelId = var11.m(var10, 4, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var2 = 31;
            var7 = (java.util.List)var16;
            var16 = var22;
            var9 = var6;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var18: java.util.List = null;
            var8 = null;
            var7 = null;
            var16 = null;
            var14 = null;

            while (var3) {
               val var4: Int = var11.x(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var16 = var11.m(var10, 4, ChannelId.$serializer.INSTANCE, var16) as ChannelId;
                              var2 |= 16;
                           } else {
                              val var20: MessageId;
                              if (var7 != null) {
                                 var20 = MessageId.box-impl(var7);
                              } else {
                                 var20 = null;
                              }

                              val var21: MessageId = var11.m(var10, 3, MessageId.$serializer.INSTANCE, var20) as MessageId;
                              if (var21 != null) {
                                 var7 = var21.unbox-impl();
                              } else {
                                 var7 = null;
                              }

                              var2 |= 8;
                           }
                        } else {
                           var14 = var11.m(var10, 2, q.a, var14) as JsonObject;
                           var2 |= 4;
                        }
                     } else {
                        var18 = var11.m(var10, 1, var9[1], var18) as java.util.List;
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.m(var10, 0, var9[0], var8) as java.util.List;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var9 = (KSerializer[])var16;
            var16 = var14;
            var14 = var7;
            var7 = var18;
         }

         var11.b(var10);
         return new KvMessageEntry(var2, var8, var7, (JsonObject)var16, var14, var9, null, null);
      }

      public open fun serialize(encoder: Encoder, value: KvMessageEntry) {
         kotlin.jvm.internal.q.h(var1, "encoder");
         kotlin.jvm.internal.q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         KvMessageEntry.write$Self$notification_api_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<KvMessageEntry> {
         return KvMessageEntry.$serializer.INSTANCE;
      }
   }
}
