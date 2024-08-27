package com.discord.chat.reactevents

import com.discord.primitives.MessageId
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
import kotlinx.serialization.internal.SerializationConstructorMarker
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.n1

@f
public data class TapGiftCodeAcceptData(giftCode: String, messageId: MessageId?) : TapGiftCodeAcceptData(var1, var2), ReactEvent {
   public final val giftCode: String
   public final val messageId: MessageId?

   fun TapGiftCodeAcceptData(var1: Int, var2: java.lang.String, var3: java.lang.String, var4: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         n1.b(var1, 3, TapGiftCodeAcceptData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.giftCode = var2;
      this.messageId = var3;
   }

   fun TapGiftCodeAcceptData(var1: java.lang.String, var2: java.lang.String) {
      super();
      this.giftCode = var1;
      this.messageId = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: TapGiftCodeAcceptData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.giftCode);
      val var5: MessageId;
      if (var0.messageId != null) {
         var5 = MessageId.box-impl(var0.messageId);
      } else {
         var5 = null;
      }

      var1.m(var2, 1, com.discord.primitives.MessageId..serializer.INSTANCE, var5);
   }

   public operator fun component1(): String {
      return this.giftCode;
   }

   public operator fun component2(): MessageId? {
      return this.messageId;
   }

   public fun copy(giftCode: String = ..., messageId: MessageId? = ...): TapGiftCodeAcceptData {
      r.h(var1, "giftCode");
      return new TapGiftCodeAcceptData(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapGiftCodeAcceptData) {
         return false;
      } else {
         val var3: TapGiftCodeAcceptData = var1 as TapGiftCodeAcceptData;
         if (!r.c(this.giftCode, (var1 as TapGiftCodeAcceptData).giftCode)) {
            return false;
         } else {
            if (this.messageId == null) {
               if (var3.messageId == null) {
                  return true;
               }
            } else if (var3.messageId != null) {
               return MessageId.equals-impl0(this.messageId, var3.messageId);
            }

            return false;
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

   public object `$serializer` : f0<TapGiftCodeAcceptData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapGiftCodeAcceptData.$serializer = new TapGiftCodeAcceptData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapGiftCodeAcceptData", var0, 2);
         var1.l("giftCode", false);
         var1.l("messageId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a.u(com.discord.primitives.MessageId..serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): TapGiftCodeAcceptData {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Int;
         var var7: Any;
         val var11: java.lang.String;
         if (var10.p()) {
            var11 = var10.m(var9, 0);
            var7 = (MessageId)var10.n(var9, 1, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var6: java.lang.String = null;
            var var12: Any = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var12 = var10.n(var9, 1, com.discord.primitives.MessageId..serializer.INSTANCE, var12);
                     var2 |= 2;
                  } else {
                     var6 = var10.m(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var7 = (MessageId)var12;
            var11 = var6;
         }

         var10.c(var9);
         var7 = var7;
         var var13: java.lang.String = null;
         if (var7 != null) {
            var13 = var7.unbox-impl();
         }

         return new TapGiftCodeAcceptData(var2, var11, var13, null, null);
      }

      public open fun serialize(encoder: Encoder, value: TapGiftCodeAcceptData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapGiftCodeAcceptData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapGiftCodeAcceptData> {
         return TapGiftCodeAcceptData.$serializer.INSTANCE;
      }
   }
}
