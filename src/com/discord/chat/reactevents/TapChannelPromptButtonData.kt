package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import dn.f
import dn.n
import gn.b2
import gn.g0
import gn.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class TapChannelPromptButtonData(messageId: String, channelId: String, buttonType: String) : ReactEvent {
   public final val buttonType: String
   public final val channelId: String
   public final val messageId: String

   init {
      q.h(var1, "messageId");
      q.h(var2, "channelId");
      q.h(var3, "buttonType");
      super();
      this.messageId = var1;
      this.channelId = var2;
      this.buttonType = var3;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): String {
      return this.buttonType;
   }

   public fun copy(messageId: String = var0.messageId, channelId: String = var0.channelId, buttonType: String = var0.buttonType): TapChannelPromptButtonData {
      q.h(var1, "messageId");
      q.h(var2, "channelId");
      q.h(var3, "buttonType");
      return new TapChannelPromptButtonData(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapChannelPromptButtonData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return q.c(this.buttonType, var1.buttonType);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.messageId.hashCode() * 31 + this.channelId.hashCode()) * 31 + this.buttonType.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.messageId;
      val var2: java.lang.String = this.channelId;
      val var4: java.lang.String = this.buttonType;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapChannelPromptButtonData(messageId=");
      var1.append(var3);
      var1.append(", channelId=");
      var1.append(var2);
      var1.append(", buttonType=");
      var1.append(var4);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapChannelPromptButtonData.$serializer = new TapChannelPromptButtonData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapChannelPromptButtonData", var0, 3);
         var1.l("messageId", false);
         var1.l("channelId", false);
         var1.l("buttonType", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): TapChannelPromptButtonData {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var6: java.lang.String;
         val var10: java.lang.String;
         var var12: java.lang.String;
         if (var9.p()) {
            var12 = var9.m(var8, 0);
            val var7: java.lang.String = var9.m(var8, 1);
            var10 = var9.m(var8, 2);
            var2 = 7;
            var6 = var12;
            var12 = var7;
         } else {
            var6 = null;
            var12 = null;
            var var11: java.lang.String = null;
            var var3: Boolean = true;
            var2 = 0;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var9.m(var8, 2);
                        var2 |= 4;
                     } else {
                        var11 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var9.m(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var12 = var11;
            var10 = var12;
         }

         var9.c(var8);
         return new TapChannelPromptButtonData(var2, var6, var12, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: TapChannelPromptButtonData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapChannelPromptButtonData.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapChannelPromptButtonData> {
         return TapChannelPromptButtonData.$serializer.INSTANCE;
      }
   }
}
