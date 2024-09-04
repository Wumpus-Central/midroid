package com.discord.chat.bridge.contentnode

import com.discord.primitives.ChannelId
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
import xk.a2
import xk.f0
import xk.n1
import xk.f0.a

@f
public data class CommandMentionContentNode(channelId: ChannelId, commandId: String, commandName: String, commandKey: String, content: List<ContentNode>) : CommandMentionContentNode(
      var1, var3, var4, var5, var6
   ) {
   public final val channelId: ChannelId
   public final val commandId: String
   public final val commandKey: String
   public final val commandName: String
   public open val content: List<ContentNode>

   fun CommandMentionContentNode(
      var1: Int,
      var2: ChannelId,
      var3: java.lang.String,
      var4: java.lang.String,
      var5: java.lang.String,
      var6: MutableList<ContentNode>,
      var7: SerializationConstructorMarker
   ) {
      if (31 != (var1 and 31)) {
         n1.b(var1, 31, CommandMentionContentNode.$serializer.INSTANCE.getDescriptor());
      }

      super(var1, var7);
      this.channelId = var2.unbox-impl();
      this.commandId = var3;
      this.commandName = var4;
      this.commandKey = var5;
      this.content = var6;
   }

   fun CommandMentionContentNode(var1: Long, var3: java.lang.String, var4: java.lang.String, var5: java.lang.String, var6: MutableList<ContentNode>) {
      super(null);
      this.channelId = var1;
      this.commandId = var3;
      this.commandName = var4;
      this.commandKey = var5;
      this.content = var6;
   }

   @JvmStatic
   public fun `write$Self`(self: CommandMentionContentNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      MentionContentNode.write$Self(var0, var1, var2);
      var1.y(var2, 0, com.discord.primitives.ChannelId..serializer.INSTANCE, ChannelId.box-impl(var0.channelId));
      var1.z(var2, 1, var0.commandId);
      var1.z(var2, 2, var0.commandName);
      var1.z(var2, 3, var0.commandKey);
      var1.y(var2, 4, new xk.f(ContentNodeSerializer.INSTANCE), var0.getContent());
   }

   public operator fun component1(): ChannelId {
      return this.channelId;
   }

   public operator fun component2(): String {
      return this.commandId;
   }

   public operator fun component3(): String {
      return this.commandName;
   }

   public operator fun component4(): String {
      return this.commandKey;
   }

   public operator fun component5(): List<ContentNode> {
      return this.getContent();
   }

   public fun copy(channelId: ChannelId = ..., commandId: String = ..., commandName: String = ..., commandKey: String = ..., content: List<ContentNode> = ...): CommandMentionContentNode {
      r.h(var3, "commandId");
      r.h(var4, "commandName");
      r.h(var5, "commandKey");
      r.h(var6, "content");
      return new CommandMentionContentNode(var1, var3, var4, var5, var6, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CommandMentionContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.commandId, var1.commandId)) {
            return false;
         } else if (!r.c(this.commandName, var1.commandName)) {
            return false;
         } else if (!r.c(this.commandKey, var1.commandKey)) {
            return false;
         } else {
            return r.c(this.getContent(), var1.getContent());
         }
      }
   }

   public override fun hashCode(): Int {
      return (((ChannelId.hashCode-impl(this.channelId) * 31 + this.commandId.hashCode()) * 31 + this.commandName.hashCode()) * 31 + this.commandKey.hashCode())
            * 31
         + this.getContent().hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var3: java.lang.String = this.commandId;
      val var5: java.lang.String = this.commandName;
      val var1: java.lang.String = this.commandKey;
      val var6: java.util.List = this.getContent();
      val var4: StringBuilder = new StringBuilder();
      var4.append("CommandMentionContentNode(channelId=");
      var4.append(var2);
      var4.append(", commandId=");
      var4.append(var3);
      var4.append(", commandName=");
      var4.append(var5);
      var4.append(", commandKey=");
      var4.append(var1);
      var4.append(", content=");
      var4.append(var6);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<CommandMentionContentNode> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: CommandMentionContentNode.$serializer = new CommandMentionContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("commandMention", var0, 5);
         var1.l("channelId", false);
         var1.l("commandId", false);
         var1.l("commandName", false);
         var1.l("commandKey", false);
         var1.l("content", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{com.discord.primitives.ChannelId..serializer.INSTANCE, a2.a, a2.a, a2.a, new xk.f(ContentNodeSerializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): CommandMentionContentNode {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var5: Boolean = var11.p();
         var var9: Any = null;
         var var2: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var8: java.lang.String;
         var var12: Any;
         if (var5) {
            var9 = var11.y(var10, 0, com.discord.primitives.ChannelId..serializer.INSTANCE, null);
            var8 = var11.m(var10, 1);
            var7 = var11.m(var10, 2);
            var6 = var11.m(var10, 3);
            var12 = var11.y(var10, 4, new xk.f(ContentNodeSerializer.INSTANCE), null);
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var7 = null;
            var6 = null;
            var12 = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var12 = var11.y(var10, 4, new xk.f(ContentNodeSerializer.INSTANCE), var12);
                              var2 |= 16;
                           } else {
                              var6 = var11.m(var10, 3);
                              var2 |= 8;
                           }
                        } else {
                           var7 = var11.m(var10, 2);
                           var2 |= 4;
                        }
                     } else {
                        var8 = var11.m(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var9 = var11.y(var10, 0, com.discord.primitives.ChannelId..serializer.INSTANCE, var9);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var11.c(var10);
         return new CommandMentionContentNode(var2, var9 as ChannelId, var8, var7, var6, var12 as java.util.List, null, null);
      }

      public open fun serialize(encoder: Encoder, value: CommandMentionContentNode) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         CommandMentionContentNode.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<CommandMentionContentNode> {
         return CommandMentionContentNode.$serializer.INSTANCE;
      }
   }
}
