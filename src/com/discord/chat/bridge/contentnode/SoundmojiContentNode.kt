package com.discord.chat.bridge.contentnode

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import ha.f
import ha.n
import ia.a
import ka.C0
import ka.G
import ka.h
import ka.p0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker

@f
public data class SoundmojiContentNode(soundId: String,
   channelId: ChannelId,
   messageId: MessageId,
   content: String? = ...,
   guildId: String? = ...,
   jumboable: Boolean = ...,
   emojiId: String? = ...,
   emojiName: String? = ...
) : SoundmojiContentNode(var1, var2, var4, var5, var6, var7, var8, var9) {
   public final val channelId: ChannelId
   public final val content: String?
   public final val emojiId: String?
   public final val emojiName: String?
   public final val guildId: String?
   public final val jumboable: Boolean
   public final val messageId: MessageId
   public final val soundId: String

   fun SoundmojiContentNode(
      var1: Int,
      var2: java.lang.String,
      var3: ChannelId,
      var4: java.lang.String,
      var5: java.lang.String,
      var6: java.lang.String,
      var7: Boolean,
      var8: java.lang.String,
      var9: java.lang.String,
      var10: SerializationConstructorMarker
   ) {
      if (7 != (var1 and 7)) {
         p0.b(var1, 7, SoundmojiContentNode.$serializer.INSTANCE.getDescriptor());
      }

      super(null);
      this.soundId = var2;
      this.channelId = var3.unbox-impl();
      this.messageId = var4;
      if ((var1 and 8) == 0) {
         this.content = null;
      } else {
         this.content = var5;
      }

      if ((var1 and 16) == 0) {
         this.guildId = null;
      } else {
         this.guildId = var6;
      }

      if ((var1 and 32) == 0) {
         this.jumboable = false;
      } else {
         this.jumboable = var7;
      }

      if ((var1 and 64) == 0) {
         this.emojiId = null;
      } else {
         this.emojiId = var8;
      }

      if ((var1 and 128) == 0) {
         this.emojiName = null;
      } else {
         this.emojiName = var9;
      }
   }

   fun SoundmojiContentNode(
      var1: java.lang.String,
      var2: Long,
      var4: java.lang.String,
      var5: java.lang.String,
      var6: java.lang.String,
      var7: Boolean,
      var8: java.lang.String,
      var9: java.lang.String
   ) {
      q.h(var1, "soundId");
      q.h(var4, "messageId");
      super(null);
      this.soundId = var1;
      this.channelId = var2;
      this.messageId = var4;
      this.content = var5;
      this.guildId = var6;
      this.jumboable = var7;
      this.emojiId = var8;
      this.emojiName = var9;
   }

   public operator fun component1(): String {
      return this.soundId;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): MessageId {
      return this.messageId;
   }

   public operator fun component4(): String? {
      return this.content;
   }

   public operator fun component5(): String? {
      return this.guildId;
   }

   public operator fun component6(): Boolean {
      return this.jumboable;
   }

   public operator fun component7(): String? {
      return this.emojiId;
   }

   public operator fun component8(): String? {
      return this.emojiName;
   }

   public fun copy(
      soundId: String = ...,
      channelId: ChannelId = ...,
      messageId: MessageId = ...,
      content: String? = ...,
      guildId: String? = ...,
      jumboable: Boolean = ...,
      emojiId: String? = ...,
      emojiName: String? = ...
   ): SoundmojiContentNode {
      q.h(var1, "soundId");
      q.h(var4, "messageId");
      return new SoundmojiContentNode(var1, var2, var4, var5, var6, var7, var8, var9, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SoundmojiContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.soundId, var1.soundId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.content, var1.content)) {
            return false;
         } else if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else if (this.jumboable != var1.jumboable) {
            return false;
         } else if (!q.c(this.emojiId, var1.emojiId)) {
            return false;
         } else {
            return q.c(this.emojiName, var1.emojiName);
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = this.soundId.hashCode();
      val var6: Int = ChannelId.hashCode-impl(this.channelId);
      val var5: Int = MessageId.hashCode-impl(this.messageId);
      var var4: Int = 0;
      val var1: Int;
      if (this.content == null) {
         var1 = 0;
      } else {
         var1 = this.content.hashCode();
      }

      val var2: Int;
      if (this.guildId == null) {
         var2 = 0;
      } else {
         var2 = this.guildId.hashCode();
      }

      val var8: Int = java.lang.Boolean.hashCode(this.jumboable);
      val var3: Int;
      if (this.emojiId == null) {
         var3 = 0;
      } else {
         var3 = this.emojiId.hashCode();
      }

      if (this.emojiName != null) {
         var4 = this.emojiName.hashCode();
      }

      return ((((((var7 * 31 + var6) * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var8) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.soundId;
      val var2: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var8: java.lang.String = MessageId.toString-impl(this.messageId);
      val var3: java.lang.String = this.content;
      val var9: java.lang.String = this.guildId;
      val var1: Boolean = this.jumboable;
      val var4: java.lang.String = this.emojiId;
      val var6: java.lang.String = this.emojiName;
      val var7: StringBuilder = new StringBuilder();
      var7.append("SoundmojiContentNode(soundId=");
      var7.append(var5);
      var7.append(", channelId=");
      var7.append(var2);
      var7.append(", messageId=");
      var7.append(var8);
      var7.append(", content=");
      var7.append(var3);
      var7.append(", guildId=");
      var7.append(var9);
      var7.append(", jumboable=");
      var7.append(var1);
      var7.append(", emojiId=");
      var7.append(var4);
      var7.append(", emojiName=");
      var7.append(var6);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: SoundmojiContentNode.$serializer = new SoundmojiContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("soundboard", var0, 8);
         var1.l("soundId", false);
         var1.l("channelId", false);
         var1.l("messageId", false);
         var1.l("content", true);
         var1.l("guildId", true);
         var1.l("jumboable", true);
         var1.l("emojiId", true);
         var1.l("emojiName", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var4: C0 = C0.a;
         return new KSerializer[]{C0.a, ChannelId.$serializer.INSTANCE, MessageId.$serializer.INSTANCE, a.u(C0.a), a.u(var4), h.a, a.u(var4), a.u(var4)};
      }

      public open fun deserialize(decoder: Decoder): SoundmojiContentNode {
         q.h(var1, "decoder");
         val var14: SerialDescriptor = this.getDescriptor();
         val var15: c = var1.c(var14);
         var var5: Boolean = var15.y();
         var var9: java.lang.String = null;
         var var2: Int;
         var var7: Any;
         var var10: ChannelId;
         val var12: java.lang.String;
         var var18: Any;
         var var20: Any;
         var var25: Any;
         if (var5) {
            var25 = var15.t(var14, 0);
            var10 = var15.m(var14, 1, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var18 = var15.m(var14, 2, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var17: java.lang.String;
            if (var18 != null) {
               var17 = var18.unbox-impl();
            } else {
               var17 = null;
            }

            var20 = C0.a;
            val var11: java.lang.String = var15.v(var14, 3, C0.a, null) as java.lang.String;
            var9 = var15.v(var14, 4, (DeserializationStrategy)var20, null) as java.lang.String;
            var5 = var15.s(var14, 5);
            var7 = var15.v(var14, 6, (DeserializationStrategy)var20, null) as java.lang.String;
            var20 = var15.v(var14, 7, (DeserializationStrategy)var20, null) as java.lang.String;
            var2 = 255;
            var12 = (java.lang.String)var25;
            var25 = var17;
            var18 = var11;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var5 = false;
            var var27: java.lang.String = null;
            var10 = null;
            var25 = null;
            var20 = null;
            var18 = null;
            var7 = null;

            while (var3) {
               val var4: Int = var15.x(var14);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var27 = var15.t(var14, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var10 = var15.m(var14, 1, ChannelId.$serializer.INSTANCE, var10) as ChannelId;
                     var2 |= 2;
                     break;
                  case 2:
                     if (var7 != null) {
                        var7 = MessageId.box-impl((java.lang.String)var7);
                     } else {
                        var7 = null;
                     }

                     var7 = var15.m(var14, 2, MessageId.$serializer.INSTANCE, var7) as MessageId;
                     if (var7 != null) {
                        var7 = var7.unbox-impl();
                     } else {
                        var7 = null;
                     }

                     var2 |= 4;
                     break;
                  case 3:
                     var18 = var15.v(var14, 3, C0.a, var18) as java.lang.String;
                     var2 |= 8;
                     break;
                  case 4:
                     var9 = var15.v(var14, 4, C0.a, var9) as java.lang.String;
                     var2 |= 16;
                     break;
                  case 5:
                     var5 = var15.s(var14, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var20 = var15.v(var14, 6, C0.a, var20) as java.lang.String;
                     var2 |= 64;
                     break;
                  case 7:
                     var25 = var15.v(var14, 7, C0.a, var25) as java.lang.String;
                     var2 |= 128;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var25 = var7;
            var20 = var25;
            var7 = (MessageId)var20;
            var12 = var27;
         }

         var15.b(var14);
         return new SoundmojiContentNode(var2, var12, var10, (java.lang.String)var25, var18, var9, var5, var7, (java.lang.String)var20, null, null);
      }

      public open fun serialize(encoder: Encoder, value: SoundmojiContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         SoundmojiContentNode.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ka.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SoundmojiContentNode> {
         return SoundmojiContentNode.$serializer.INSTANCE;
      }
   }
}
