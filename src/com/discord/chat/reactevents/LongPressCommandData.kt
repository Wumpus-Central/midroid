package com.discord.chat.reactevents

import cl.f
import cl.n
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.primitives.ChannelId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fl.b2
import fl.g0
import fl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class LongPressCommandData(channelId: String, commandId: String, commandName: String, commandKey: String) : ReactEvent {
   public final val channelId: String
   public final val commandId: String
   public final val commandKey: String
   public final val commandName: String

   public constructor(node: CommandMentionContentNode) : q.h(var1, "node") {
      this(ChannelId.toString-impl(var1.getChannelId-o4g7jtM()), var1.getCommandId(), var1.getCommandName(), var1.getCommandKey());
   }

   init {
      q.h(var1, "channelId");
      q.h(var2, "commandId");
      q.h(var3, "commandName");
      q.h(var4, "commandKey");
      super();
      this.channelId = var1;
      this.commandId = var2;
      this.commandName = var3;
      this.commandKey = var4;
   }

   public operator fun component1(): String {
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

   public fun copy(
      channelId: String = var0.channelId,
      commandId: String = var0.commandId,
      commandName: String = var0.commandName,
      commandKey: String = var0.commandKey
   ): LongPressCommandData {
      q.h(var1, "channelId");
      q.h(var2, "commandId");
      q.h(var3, "commandName");
      q.h(var4, "commandKey");
      return new LongPressCommandData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressCommandData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.commandId, var1.commandId)) {
            return false;
         } else if (!q.c(this.commandName, var1.commandName)) {
            return false;
         } else {
            return q.c(this.commandKey, var1.commandKey);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.channelId.hashCode() * 31 + this.commandId.hashCode()) * 31 + this.commandName.hashCode()) * 31 + this.commandKey.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.channelId;
      val var4: java.lang.String = this.commandId;
      val var5: java.lang.String = this.commandName;
      val var1: java.lang.String = this.commandKey;
      val var2: StringBuilder = new StringBuilder();
      var2.append("LongPressCommandData(channelId=");
      var2.append(var3);
      var2.append(", commandId=");
      var2.append(var4);
      var2.append(", commandName=");
      var2.append(var5);
      var2.append(", commandKey=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: LongPressCommandData.$serializer = new LongPressCommandData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.LongPressCommandData", var0, 4);
         var1.l("channelId", false);
         var1.l("commandId", false);
         var1.l("commandName", false);
         var1.l("commandKey", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): LongPressCommandData {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         var var2: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         val var11: java.lang.String;
         var var13: java.lang.String;
         if (var10.y()) {
            var13 = var10.t(var9, 0);
            val var8: java.lang.String = var10.t(var9, 1);
            var6 = var10.t(var9, 2);
            var11 = var10.t(var9, 3);
            var2 = 15;
            var7 = var13;
            var13 = var8;
         } else {
            var7 = null;
            var6 = null;
            var13 = null;
            var var12: java.lang.String = null;
            var var3: Boolean = true;
            var2 = 0;

            while (var3) {
               val var4: Int = var10.x(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var6 = var10.t(var9, 3);
                           var2 |= 8;
                        } else {
                           var13 = var10.t(var9, 2);
                           var2 |= 4;
                        }
                     } else {
                        var12 = var10.t(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.t(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var13 = var12;
            var11 = var6;
            var6 = var13;
         }

         var10.b(var9);
         return new LongPressCommandData(var2, var7, var13, var6, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: LongPressCommandData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         LongPressCommandData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LongPressCommandData> {
         return LongPressCommandData.$serializer.INSTANCE;
      }
   }
}
