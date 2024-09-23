package com.discord.chat.bridge.contentnode

import al.b2
import al.g0
import al.o1
import al.g0.a
import com.discord.primitives.ChannelId
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import xk.f
import xk.n

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
         o1.b(var1, 31, CommandMentionContentNode.$serializer.INSTANCE.getDescriptor());
      }

      super(var1, var7);
      this.channelId = var2.unbox-impl();
      this.commandId = var3;
      this.commandName = var4;
      this.commandKey = var5;
      this.content = var6;
   }

   fun CommandMentionContentNode(var1: Long, var3: java.lang.String, var4: java.lang.String, var5: java.lang.String, var6: MutableList<ContentNode>) {
      q.h(var3, "commandId");
      q.h(var4, "commandName");
      q.h(var5, "commandKey");
      q.h(var6, "content");
      super(null);
      this.channelId = var1;
      this.commandId = var3;
      this.commandName = var4;
      this.commandKey = var5;
      this.content = var6;
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
      return this.content;
   }

   public fun copy(channelId: ChannelId = ..., commandId: String = ..., commandName: String = ..., commandKey: String = ..., content: List<ContentNode> = ...): CommandMentionContentNode {
      q.h(var3, "commandId");
      q.h(var4, "commandName");
      q.h(var5, "commandKey");
      q.h(var6, "content");
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
         } else if (!q.c(this.commandId, var1.commandId)) {
            return false;
         } else if (!q.c(this.commandName, var1.commandName)) {
            return false;
         } else if (!q.c(this.commandKey, var1.commandKey)) {
            return false;
         } else {
            return q.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      return (((ChannelId.hashCode-impl(this.channelId) * 31 + this.commandId.hashCode()) * 31 + this.commandName.hashCode()) * 31 + this.commandKey.hashCode())
            * 31
         + this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var2: java.lang.String = this.commandId;
      val var5: java.lang.String = this.commandName;
      val var3: java.lang.String = this.commandKey;
      val var6: java.util.List = this.content;
      val var4: StringBuilder = new StringBuilder();
      var4.append("CommandMentionContentNode(channelId=");
      var4.append(var1);
      var4.append(", commandId=");
      var4.append(var2);
      var4.append(", commandName=");
      var4.append(var5);
      var4.append(", commandKey=");
      var4.append(var3);
      var4.append(", content=");
      var4.append(var6);
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
         return new KSerializer[]{ChannelId.$serializer.INSTANCE, b2.a, b2.a, b2.a, CommandMentionContentNode.access$get$childSerializers$cp()[4]};
      }

      public open fun deserialize(decoder: Decoder): CommandMentionContentNode {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.c(var11);
         val var10: Array<KSerializer> = CommandMentionContentNode.access$get$childSerializers$cp();
         val var5: Boolean = var12.y();
         var var9: ChannelId = null;
         var var2: Int;
         var var6: java.lang.String;
         var var8: java.lang.String;
         var var14: Any;
         val var17: java.lang.String;
         if (var5) {
            var9 = var12.m(var11, 0, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var8 = var12.t(var11, 1);
            var6 = var12.t(var11, 2);
            var14 = var12.t(var11, 3);
            val var7: java.util.List = var12.m(var11, 4, var10[4], null) as java.util.List;
            var2 = 31;
            var17 = (java.lang.String)var14;
            var14 = var7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var var16: java.lang.String = null;
            var6 = null;
            var14 = null;

            while (var3) {
               val var4: Int = var12.x(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var14 = var12.m(var11, 4, var10[4], var14) as java.util.List;
                              var2 |= 16;
                           } else {
                              var6 = var12.t(var11, 3);
                              var2 |= 8;
                           }
                        } else {
                           var16 = var12.t(var11, 2);
                           var2 |= 4;
                        }
                     } else {
                        var8 = var12.t(var11, 1);
                        var2 |= 2;
                     }
                  } else {
                     var9 = var12.m(var11, 0, ChannelId.$serializer.INSTANCE, var9) as ChannelId;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var17 = var6;
            var6 = var16;
         }

         var12.b(var11);
         return new CommandMentionContentNode(var2, var9, var8, var6, var17, (java.util.List)var14, null, null);
      }

      public open fun serialize(encoder: Encoder, value: CommandMentionContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         CommandMentionContentNode.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<CommandMentionContentNode> {
         return CommandMentionContentNode.$serializer.INSTANCE;
      }
   }
}
