package com.discord.chat.bridge.contentnode

import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import nn.f
import nn.n
import on.a
import qn.g0
import qn.o1

@f
public data class MessageReference(channelId: ChannelId, guildId: GuildId? = ...) : MessageReference(var1, var3) {
   public final val channelId: ChannelId
   public final val guildId: GuildId?

   fun MessageReference(var1: Int, var2: ChannelId, var3: GuildId, var4: SerializationConstructorMarker) {
      if (1 != (var1 and 1)) {
         o1.b(var1, 1, MessageReference.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.channelId = var2.unbox-impl();
      if ((var1 and 2) == 0) {
         this.guildId = null;
      } else {
         this.guildId = var3;
      }
   }

   fun MessageReference(var1: Long, var3: GuildId) {
      super();
      this.channelId = var1;
      this.guildId = var3;
   }

   public operator fun component1(): ChannelId {
      return this.channelId;
   }

   public operator fun component2(): GuildId? {
      return this.guildId;
   }

   public fun copy(channelId: ChannelId = ..., guildId: GuildId? = ...): MessageReference {
      return new MessageReference(var1, var3, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageReference) {
         return false;
      } else {
         var1 = var1;
         if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else {
            return q.c(this.guildId, var1.guildId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = ChannelId.hashCode-impl(this.channelId);
      val var1: Int;
      if (this.guildId == null) {
         var1 = 0;
      } else {
         var1 = GuildId.hashCode-impl(this.guildId.unbox-impl());
      }

      return var2 * 31 + var1;
   }

   public override fun toString(): String {
      val var1: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var2: GuildId = this.guildId;
      val var3: StringBuilder = new StringBuilder();
      var3.append("MessageReference(channelId=");
      var3.append(var1);
      var3.append(", guildId=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MessageReference.$serializer = new MessageReference.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.MessageReference", var0, 2);
         var1.c("channel_id", false);
         var1.c("guild_id", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{com.discord.primitives.ChannelId..serializer.INSTANCE, a.u(com.discord.primitives.GuildId..serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): MessageReference {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         val var5: Boolean = var8.p();
         var var6: ChannelId = null;
         var var2: Int;
         var var9: GuildId;
         if (var5) {
            var6 = var8.y(var7, 0, com.discord.primitives.ChannelId..serializer.INSTANCE, null) as ChannelId;
            var9 = var8.n(var7, 1, com.discord.primitives.GuildId..serializer.INSTANCE, null) as GuildId;
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;

            while (var3) {
               val var4: Int = var8.o(var7);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var9 = var8.n(var7, 1, com.discord.primitives.GuildId..serializer.INSTANCE, var9) as GuildId;
                     var2 |= 2;
                  } else {
                     var6 = var8.y(var7, 0, com.discord.primitives.ChannelId..serializer.INSTANCE, var6) as ChannelId;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var8.c(var7);
         return new MessageReference(var2, var6, var9, null, null);
      }

      public open fun serialize(encoder: Encoder, value: MessageReference) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MessageReference.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageReference> {
         return MessageReference.$serializer.INSTANCE;
      }
   }
}
