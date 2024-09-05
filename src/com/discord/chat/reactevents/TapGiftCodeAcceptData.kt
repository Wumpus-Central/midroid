package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0
import qn.o1

@f
public data class TapGiftCodeAcceptData(giftCode: String, messageId: MessageId?) : TapGiftCodeAcceptData(var1, var2), ReactEvent {
   public final val giftCode: String
   public final val messageId: MessageId?

   fun TapGiftCodeAcceptData(var1: Int, var2: java.lang.String, var3: java.lang.String, var4: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         o1.b(var1, 3, TapGiftCodeAcceptData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.giftCode = var2;
      this.messageId = var3;
   }

   fun TapGiftCodeAcceptData(var1: java.lang.String, var2: java.lang.String) {
      q.h(var1, "giftCode");
      super();
      this.giftCode = var1;
      this.messageId = var2;
   }

   public operator fun component1(): String {
      return this.giftCode;
   }

   public operator fun component2(): MessageId? {
      return this.messageId;
   }

   public fun copy(giftCode: String = ..., messageId: MessageId? = ...): TapGiftCodeAcceptData {
      q.h(var1, "giftCode");
      return new TapGiftCodeAcceptData(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapGiftCodeAcceptData) {
         return false;
      } else {
         val var2: TapGiftCodeAcceptData = var1 as TapGiftCodeAcceptData;
         if (!q.c(this.giftCode, (var1 as TapGiftCodeAcceptData).giftCode)) {
            return false;
         } else {
            return if (this.messageId == null) var2.messageId == null else var2.messageId != null && MessageId.equals-impl0(this.messageId, var2.messageId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.giftCode.hashCode();
      val var1: Int;
      if (this.messageId == null) {
         var1 = 0;
      } else {
         var1 = MessageId.hashCode-impl(this.messageId);
      }

      return var2 * 31 + var1;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.giftCode;
      val var4: java.lang.String;
      if (this.messageId == null) {
         var4 = "null";
      } else {
         var4 = MessageId.toString-impl(this.messageId);
      }

      val var3: StringBuilder = new StringBuilder();
      var3.append("TapGiftCodeAcceptData(giftCode=");
      var3.append(var2);
      var3.append(", messageId=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapGiftCodeAcceptData.$serializer = new TapGiftCodeAcceptData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapGiftCodeAcceptData", var0, 2);
         var1.c("giftCode", false);
         var1.c("messageId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, a.u(com.discord.primitives.MessageId..serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): TapGiftCodeAcceptData {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         val var5: Boolean = var9.p();
         var var10: java.lang.String = null;
         var var2: Int;
         var var12: java.lang.String;
         val var15: java.lang.String;
         if (var5) {
            var12 = var9.m(var8, 0);
            val var7: MessageId = var9.n(var8, 1, com.discord.primitives.MessageId..serializer.INSTANCE, null) as MessageId;
            if (var7 != null) {
               var10 = var7.unbox-impl();
            }

            var2 = 3;
            var15 = var12;
            var12 = var10;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var11: java.lang.String = null;
            var12 = null;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     val var13: MessageId;
                     if (var12 != null) {
                        var13 = MessageId.box-impl(var12);
                     } else {
                        var13 = null;
                     }

                     val var14: MessageId = var9.n(var8, 1, com.discord.primitives.MessageId..serializer.INSTANCE, var13) as MessageId;
                     if (var14 != null) {
                        var12 = var14.unbox-impl();
                     } else {
                        var12 = null;
                     }

                     var2 |= 2;
                  } else {
                     var11 = var9.m(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var15 = var11;
         }

         var9.c(var8);
         return new TapGiftCodeAcceptData(var2, var15, var12, null, null);
      }

      public open fun serialize(encoder: Encoder, value: TapGiftCodeAcceptData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapGiftCodeAcceptData.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapGiftCodeAcceptData> {
         return TapGiftCodeAcceptData.$serializer.INSTANCE;
      }
   }
}
