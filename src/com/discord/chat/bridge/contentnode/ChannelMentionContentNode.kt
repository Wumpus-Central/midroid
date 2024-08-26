package com.discord.chat.bridge.contentnode

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
import vk.a
import xk.a2
import xk.f0

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

   init {
      r.h(var1, "channelId");
      super(null);
      this.channelId = var1;
      this.guildId = var2;
      this.messageId = var3;
      this.originalLink = var4;
      this.inContent = var5;
      this.content = var6;
   }

   @JvmStatic
   public fun `write$Self`(self: ChannelMentionContentNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      MentionContentNode.write$Self(var0, var1, var2);
      var1.z(var2, 0, var0.channelId);
      var var3: Boolean;
      if (!var1.A(var2, 1) && var0.guildId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, a2.a, var0.guildId);
      }

      if (!var1.A(var2, 2) && var0.messageId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.messageId);
      }

      if (!var1.A(var2, 3) && var0.originalLink == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, a2.a, var0.originalLink);
      }

      label40: {
         if (!var1.A(var2, 4)) {
            var3 = false;
            if (var0.inContent == null) {
               break label40;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, new xk.f(ContentNodeSerializer.INSTANCE), var0.inContent);
      }

      var1.m(var2, 5, new xk.f(ContentNodeSerializer.INSTANCE), var0.getContent());
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
      return this.getContent();
   }

   public fun copy(
      channelId: String = var0.channelId,
      guildId: String? = var0.guildId,
      messageId: String? = var0.messageId,
      originalLink: String? = var0.originalLink,
      inContent: List<ContentNode>? = var0.inContent,
      content: List<ContentNode>? = var0.getContent()
   ): ChannelMentionContentNode {
      r.h(var1, "channelId");
      return new ChannelMentionContentNode(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChannelMentionContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!r.c(this.originalLink, var1.originalLink)) {
            return false;
         } else if (!r.c(this.inContent, var1.inContent)) {
            return false;
         } else {
            return r.c(this.getContent(), var1.getContent());
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

      if (this.getContent() != null) {
         var5 = this.getContent().hashCode();
      }

      return ((((var6 * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5;
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.channelId;
      val var5: java.lang.String = this.guildId;
      val var7: java.lang.String = this.messageId;
      val var4: java.lang.String = this.originalLink;
      val var6: java.util.List = this.inContent;
      val var2: java.util.List = this.getContent();
      val var3: StringBuilder = new StringBuilder();
      var3.append("ChannelMentionContentNode(channelId=");
      var3.append(var1);
      var3.append(", guildId=");
      var3.append(var5);
      var3.append(", messageId=");
      var3.append(var7);
      var3.append(", originalLink=");
      var3.append(var4);
      var3.append(", inContent=");
      var3.append(var6);
      var3.append(", content=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<ChannelMentionContentNode> {
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
         val var5: a2 = a2.a;
         val var2: KSerializer = a.u(a2.a);
         val var4: KSerializer = a.u(var5);
         val var1: KSerializer = a.u(var5);
         val var3: ContentNodeSerializer = ContentNodeSerializer.INSTANCE;
         return new KSerializer[]{var5, var2, var4, var1, a.u(new xk.f(ContentNodeSerializer.INSTANCE)), a.u(new xk.f(var3))};
      }

      public open fun deserialize(decoder: Decoder): ChannelMentionContentNode {
         r.h(var1, "decoder");
         val var13: SerialDescriptor = this.getDescriptor();
         val var14: c = var1.b(var13);
         val var6: Boolean = var14.p();
         var var10: java.lang.String = null;
         var var2: Int;
         var var7: java.lang.String;
         var var8: Any;
         var var9: Any;
         var var11: Any;
         val var12: Any;
         var var17: Any;
         if (var6) {
            var7 = var14.m(var13, 0);
            var17 = a2.a;
            var11 = var14.n(var13, 1, a2.a, null);
            var9 = var14.n(var13, 2, (DeserializationStrategy)var17, null);
            var8 = var14.n(var13, 3, (DeserializationStrategy)var17, null);
            var17 = ContentNodeSerializer.INSTANCE;
            var12 = var14.n(var13, 4, new xk.f(ContentNodeSerializer.INSTANCE), null);
            var17 = var14.n(var13, 5, new xk.f((KSerializer)var17), null);
            var2 = 63;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var11 = null;
            var9 = null;
            var8 = null;
            var7 = null;
            var17 = null;

            while (var3) {
               val var4: Int = var14.o(var13);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var10 = var14.m(var13, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var11 = var14.n(var13, 1, a2.a, var11);
                     var2 |= 2;
                     break;
                  case 2:
                     var9 = var14.n(var13, 2, a2.a, var9);
                     var2 |= 4;
                     break;
                  case 3:
                     var8 = var14.n(var13, 3, a2.a, var8);
                     var2 |= 8;
                     break;
                  case 4:
                     var7 = (java.lang.String)var14.n(var13, 4, new xk.f(ContentNodeSerializer.INSTANCE), var7);
                     var2 |= 16;
                     break;
                  case 5:
                     var17 = var14.n(var13, 5, new xk.f(ContentNodeSerializer.INSTANCE), var17);
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var12 = var7;
            var7 = var10;
         }

         var14.c(var13);
         return new ChannelMentionContentNode(
            var2, var7, var11 as java.lang.String, var9 as java.lang.String, var8 as java.lang.String, var12 as java.util.List, var17 as java.util.List, null
         );
      }

      public open fun serialize(encoder: Encoder, value: ChannelMentionContentNode) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ChannelMentionContentNode.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChannelMentionContentNode> {
         return ChannelMentionContentNode.$serializer.INSTANCE;
      }
   }
}
