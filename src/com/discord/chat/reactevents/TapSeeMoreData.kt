package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import dn.f
import dn.n
import gn.g0
import gn.o1
import gn.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker

@f
internal data class TapSeeMoreData(messageId: MessageId) : TapSeeMoreData(var1), ReactEvent {
   public final val messageId: MessageId

   fun TapSeeMoreData(var1: Int, var2: java.lang.String, var3: SerializationConstructorMarker) {
      if (1 != (var1 and 1)) {
         o1.b(var1, 1, TapSeeMoreData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.messageId = var2;
   }

   fun TapSeeMoreData(var1: java.lang.String) {
      q.h(var1, "messageId");
      super();
      this.messageId = var1;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public fun copy(messageId: MessageId = ...): TapSeeMoreData {
      q.h(var1, "messageId");
      return new TapSeeMoreData(var1, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapSeeMoreData) {
         return false;
      } else {
         return MessageId.equals-impl0(this.messageId, (var1 as TapSeeMoreData).messageId);
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapSeeMoreData(messageId=");
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
         val var0: TapSeeMoreData.$serializer = new TapSeeMoreData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapSeeMoreData", var0, 1);
         var1.l("messageId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{MessageId.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): TapSeeMoreData {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var10: java.lang.String;
         if (var5) {
            val var9: MessageId = var7.y(var6, 0, MessageId.$serializer.INSTANCE, null) as MessageId;
            if (var9 != null) {
               var10 = var9.unbox-impl();
            } else {
               var10 = null;
            }
         } else {
            var2 = 0;
            var10 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  val var11: MessageId;
                  if (var10 != null) {
                     var11 = MessageId.box-impl(var10);
                  } else {
                     var11 = null;
                  }

                  val var12: MessageId = var7.y(var6, 0, MessageId.$serializer.INSTANCE, var11) as MessageId;
                  if (var12 != null) {
                     var10 = var12.unbox-impl();
                  } else {
                     var10 = null;
                  }

                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new TapSeeMoreData(var2, var10, null, null);
      }

      public open fun serialize(encoder: Encoder, value: TapSeeMoreData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapSeeMoreData.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapSeeMoreData> {
         return TapSeeMoreData.$serializer.INSTANCE;
      }
   }
}
