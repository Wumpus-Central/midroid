package com.discord.chat.bridge.contentnode

import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class ChannelMentionContentNode(channelId: String,
      guildId: String? = null,
      messageId: String? = null,
      originalLink: String? = null,
      inContent: List<ContentNode>? = null,
      content: List<ContentNode>?
   )
   : MentionContentNode {
   public final val channelId: String
   public open val content: List<ContentNode>?
   public final val guildId: String?
   public final val inContent: List<ContentNode>?
   public final val messageId: String?
   public final val originalLink: String?

   @JvmStatic
   fun {
      val var0: ContentNodeSerializer = ContentNodeSerializer.INSTANCE;
      $childSerializers = new KSerializer[]{null, null, null, null, new il.f(ContentNodeSerializer.INSTANCE), new il.f(var0)};
   }

   init {
      q.h(var1, "channelId");
      super(null);
      this.channelId = var1;
      this.guildId = var2;
      this.messageId = var3;
      this.originalLink = var4;
      this.inContent = var5;
      this.content = var6;
   }

   public operator fun component1(): String {
      return this.channelId;
   }

   public operator fun component2(): String? {
      return this.guildId;
   }

   public operator fun component3(): String? {
      return this.messageId;
   }

   public operator fun component4(): String? {
      return this.originalLink;
   }

   public operator fun component5(): List<ContentNode>? {
      return this.inContent;
   }

   public operator fun component6(): List<ContentNode>? {
      return this.content;
   }

   public fun copy(
      channelId: String = var0.channelId,
      guildId: String? = var0.guildId,
      messageId: String? = var0.messageId,
      originalLink: String? = var0.originalLink,
      inContent: List<ContentNode>? = var0.inContent,
      content: List<ContentNode>? = var0.content
   ): ChannelMentionContentNode {
      q.h(var1, "channelId");
      return new ChannelMentionContentNode(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChannelMentionContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.originalLink, var1.originalLink)) {
            return false;
         } else if (!q.c(this.inContent, var1.inContent)) {
            return false;
         } else {
            return q.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = this.channelId.hashCode();
      var var5: Int = 0;
      val var1: Int;
      if (this.guildId == null) {
         var1 = 0;
      } else {
         var1 = this.guildId.hashCode();
      }

      val var2: Int;
      if (this.messageId == null) {
         var2 = 0;
      } else {
         var2 = this.messageId.hashCode();
      }

      val var3: Int;
      if (this.originalLink == null) {
         var3 = 0;
      } else {
         var3 = this.originalLink.hashCode();
      }

      val var4: Int;
      if (this.inContent == null) {
         var4 = 0;
      } else {
         var4 = this.inContent.hashCode();
      }

      if (this.content != null) {
         var5 = this.content.hashCode();
      }

      return ((((var6 * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5;
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.channelId;
      val var7: java.lang.String = this.guildId;
      val var1: java.lang.String = this.messageId;
      val var4: java.lang.String = this.originalLink;
      val var2: java.util.List = this.inContent;
      val var5: java.util.List = this.content;
      val var6: StringBuilder = new StringBuilder();
      var6.append("ChannelMentionContentNode(channelId=");
      var6.append(var3);
      var6.append(", guildId=");
      var6.append(var7);
      var6.append(", messageId=");
      var6.append(var1);
      var6.append(", originalLink=");
      var6.append(var4);
      var6.append(", inContent=");
      var6.append(var2);
      var6.append(", content=");
      var6.append(var5);
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
         val var0: ChannelMentionContentNode.$serializer = new ChannelMentionContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("channelMention", var0, 6);
         var1.l("channelId", false);
         var1.l("guildId", true);
         var1.l("messageId", true);
         var1.l("originalLink", true);
         var1.l("inContent", true);
         var1.l("content", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: Array<KSerializer> = ChannelMentionContentNode.access$get$childSerializers$cp();
         val var2: b2 = b2.a;
         return new KSerializer[]{b2.a, a.u(b2.a), a.u(var2), a.u(var2), a.u(var1[4]), a.u(var1[5])};
      }

      public open fun deserialize(decoder: Decoder): ChannelMentionContentNode {
         q.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.c(var12);
         val var11: Array<KSerializer> = ChannelMentionContentNode.access$get$childSerializers$cp();
         val var5: Boolean = var13.y();
         var var10: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var7: java.lang.String;
         var var8: java.lang.String;
         var var9: java.lang.String;
         var var16: Any;
         if (var5) {
            var10 = var13.t(var12, 0);
            var16 = b2.a;
            var9 = var13.v(var12, 1, b2.a, null) as java.lang.String;
            var8 = var13.v(var12, 2, (DeserializationStrategy)var16, null) as java.lang.String;
            var16 = var13.v(var12, 3, (DeserializationStrategy)var16, null) as java.lang.String;
            var6 = var13.v(var12, 4, var11[4], null) as java.util.List;
            val var17: java.util.List = var13.v(var12, 5, var11[5], null) as java.util.List;
            var2 = 63;
            var7 = (java.lang.String)var16;
            var16 = var17;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var8 = null;
            var7 = null;
            var6 = null;
            var16 = null;

            while (var3) {
               val var4: Int = var13.x(var12);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var10 = var13.t(var12, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var9 = var13.v(var12, 1, b2.a, var9) as java.lang.String;
                     var2 |= 2;
                     break;
                  case 2:
                     var8 = var13.v(var12, 2, b2.a, var8) as java.lang.String;
                     var2 |= 4;
                     break;
                  case 3:
                     var7 = var13.v(var12, 3, b2.a, var7) as java.lang.String;
                     var2 |= 8;
                     break;
                  case 4:
                     var6 = var13.v(var12, 4, var11[4], var6) as java.util.List;
                     var2 |= 16;
                     break;
                  case 5:
                     var16 = var13.v(var12, 5, var11[5], var16) as java.util.List;
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }
         }

         var13.b(var12);
         return new ChannelMentionContentNode(var2, var10, var9, var8, var7, (java.util.List)var6, (java.util.List)var16, null);
      }

      public open fun serialize(encoder: Encoder, value: ChannelMentionContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ChannelMentionContentNode.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChannelMentionContentNode> {
         return ChannelMentionContentNode.$serializer.INSTANCE;
      }
   }
}
