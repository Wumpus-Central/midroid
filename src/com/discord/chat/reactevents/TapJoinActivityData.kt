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
import xk.f0
import xk.n1
import xk.f0.a

@f
internal data class TapJoinActivityData(messageId: MessageId) : TapJoinActivityData(var1), ReactEvent {
   public final val messageId: MessageId

   fun TapJoinActivityData(var1: Int, var2: java.lang.String, var3: SerializationConstructorMarker) {
      if (1 != (var1 and 1)) {
         n1.b(var1, 1, TapJoinActivityData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.messageId = var2;
   }

   fun TapJoinActivityData(var1: java.lang.String) {
      super();
      this.messageId = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: TapJoinActivityData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, com.discord.primitives.MessageId..serializer.INSTANCE, MessageId.box-impl(var0.messageId));
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public fun copy(messageId: MessageId = ...): TapJoinActivityData {
      r.h(var1, "messageId");
      return new TapJoinActivityData(var1, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapJoinActivityData) {
         return false;
      } else {
         return MessageId.equals-impl0(this.messageId, (var1 as TapJoinActivityData).messageId);
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapJoinActivityData(messageId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<TapJoinActivityData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapJoinActivityData.$serializer = new TapJoinActivityData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapJoinActivityData", var0, 1);
         var1.l("messageId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{com.discord.primitives.MessageId..serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): TapJoinActivityData {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: Any;
         if (var5) {
            var8 = (MessageId)var7.y(var6, 0, com.discord.primitives.MessageId..serializer.INSTANCE, null);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = (MessageId)var7.y(var6, 0, com.discord.primitives.MessageId..serializer.INSTANCE, var8);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         var8 = var8;
         val var10: java.lang.String;
         if (var8 != null) {
            var10 = var8.unbox-impl();
         } else {
            var10 = null;
         }

         return new TapJoinActivityData(var2, var10, null, null);
      }

      public open fun serialize(encoder: Encoder, value: TapJoinActivityData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapJoinActivityData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapJoinActivityData> {
         return TapJoinActivityData.$serializer.INSTANCE;
      }
   }
}
