package com.discord.chat.bridge.contentnode

import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import kotlin.jvm.internal.r
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
import vk.a
import xk.f0
import xk.n1

@f
public data class MessageReference(channelId: ChannelId, guildId: GuildId? = ...) : MessageReference(var1, var3) {
   public final val channelId: ChannelId
   public final val guildId: GuildId?

   fun MessageReference(var1: Int, var2: ChannelId, var3: GuildId, var4: SerializationConstructorMarker) {
      if (1 != (var1 and 1)) {
         n1.b(var1, 1, MessageReference.$serializer.INSTANCE.getDescriptor());
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

   @JvmStatic
   public fun `write$Self`(self: MessageReference, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var4: com.discord.primitives.ChannelId..serializer = com.discord.primitives.ChannelId..serializer.INSTANCE;
      val var5: ChannelId = ChannelId.box-impl(var0.channelId);
      var var3: Boolean = false;
      var1.y(var2, 0, var4, var5);
      if (var1.A(var2, 1) || var0.guildId != null) {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, com.discord.primitives.GuildId..serializer.INSTANCE, var0.guildId);
      }
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
            return r.c(this.guildId, var1.guildId);
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
      val var3: GuildId = this.guildId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("MessageReference(channelId=");
      var2.append(var1);
      var2.append(", guildId=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<MessageReference> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MessageReference.$serializer = new MessageReference.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.MessageReference", var0, 2);
         var1.l("channel_id", false);
         var1.l("guild_id", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{com.discord.primitives.ChannelId..serializer.INSTANCE, a.u(com.discord.primitives.GuildId..serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): MessageReference {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         val var5: Boolean = var9.p();
         var var6: Any = null;
         var var2: Int;
         var var10: Any;
         if (var5) {
            var10 = var9.y(var8, 0, com.discord.primitives.ChannelId..serializer.INSTANCE, null);
            var6 = var9.n(var8, 1, com.discord.primitives.GuildId..serializer.INSTANCE, null);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var10 = null;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var10 = var9.n(var8, 1, com.discord.primitives.GuildId..serializer.INSTANCE, var10);
                     var2 |= 2;
                  } else {
                     var6 = var9.y(var8, 0, com.discord.primitives.ChannelId..serializer.INSTANCE, var6);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var6 = var10;
            var10 = var6;
         }

         var9.c(var8);
         return new MessageReference(var2, var10 as ChannelId, var6 as GuildId, null, null);
      }

      public open fun serialize(encoder: Encoder, value: MessageReference) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MessageReference.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageReference> {
         return MessageReference.$serializer.INSTANCE;
      }
   }
}
