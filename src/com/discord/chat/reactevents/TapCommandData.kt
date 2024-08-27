package com.discord.chat.reactevents

import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.primitives.ChannelId
import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.f0.a

@f
public data class TapCommandData(channelId: String, commandId: String, commandName: String, commandKey: String) : ReactEvent {
   public final val channelId: String
   public final val commandId: String
   public final val commandKey: String
   public final val commandName: String

   public constructor(node: CommandMentionContentNode) : r.h(var1, "node") {
      this(ChannelId.toString_impl(var1.getChannelId_o4g7jtM()), var1.getCommandId(), var1.getCommandName(), var1.getCommandKey());
   }

   init {
      r.h(var1, "channelId");
      r.h(var2, "commandId");
      r.h(var3, "commandName");
      r.h(var4, "commandKey");
      super();
      this.channelId = var1;
      this.commandId = var2;
      this.commandName = var3;
      this.commandKey = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: TapCommandData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.channelId);
      var1.z(var2, 1, var0.commandId);
      var1.z(var2, 2, var0.commandName);
      var1.z(var2, 3, var0.commandKey);
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
   ): TapCommandData {
      r.h(var1, "channelId");
      r.h(var2, "commandId");
      r.h(var3, "commandName");
      r.h(var4, "commandKey");
      return new TapCommandData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapCommandData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.commandId, var1.commandId)) {
            return false;
         } else if (!r.c(this.commandName, var1.commandName)) {
            return false;
         } else {
            return r.c(this.commandKey, var1.commandKey);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.channelId.hashCode() * 31 + this.commandId.hashCode()) * 31 + this.commandName.hashCode()) * 31 + this.commandKey.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.channelId;
      val var4: java.lang.String = this.commandId;
      val var5: java.lang.String = this.commandName;
      val var1: java.lang.String = this.commandKey;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapCommandData(channelId=");
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

   public object `$serializer` : f0<TapCommandData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapCommandData.$serializer = new TapCommandData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapCommandData", var0, 4);
         var1.l("channelId", false);
         var1.l("commandId", false);
         var1.l("commandName", false);
         var1.l("commandKey", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): TapCommandData {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Int;
         var var5: java.lang.String;
         var var6: java.lang.String;
         var var7: java.lang.String;
         val var11: java.lang.String;
         if (var10.p()) {
            var7 = var10.m(var9, 0);
            var6 = var10.m(var9, 1);
            var5 = var10.m(var9, 2);
            var11 = var10.m(var9, 3);
            var2 = 15;
         } else {
            var7 = null;
            var6 = null;
            var5 = null;
            var var12: java.lang.String = null;
            var var3: Boolean = true;
            var2 = 0;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var6 = var10.m(var9, 3);
                           var2 |= 8;
                        } else {
                           var5 = var10.m(var9, 2);
                           var2 |= 4;
                        }
                     } else {
                        var12 = var10.m(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.m(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var11 = var6;
            var6 = var12;
         }

         var10.c(var9);
         return new TapCommandData(var2, var7, var6, var5, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: TapCommandData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapCommandData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapCommandData> {
         return TapCommandData.$serializer.INSTANCE;
      }
   }
}
