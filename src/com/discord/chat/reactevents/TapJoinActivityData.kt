package com.discord.chat.reactevents

import bl.g0
import bl.o1
import bl.g0.a
import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
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
import yk.f
import yk.n

@f
internal data class TapJoinActivityData(messageId: MessageId) : TapJoinActivityData(var1), ReactEvent {
   public final val messageId: MessageId

   fun TapJoinActivityData(var1: Int, var2: java.lang.String, var3: SerializationConstructorMarker) {
      if (1 != (var1 and 1)) {
         o1.b(var1, 1, TapJoinActivityData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.messageId = var2;
   }

   fun TapJoinActivityData(var1: java.lang.String) {
      q.h(var1, "messageId");
      super();
      this.messageId = var1;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public fun copy(messageId: MessageId = ...): TapJoinActivityData {
      q.h(var1, "messageId");
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

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapJoinActivityData(messageId=");
      var1.append(var2);
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
         val var0: TapJoinActivityData.$serializer = new TapJoinActivityData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapJoinActivityData", var0, 1);
         var1.l("messageId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{MessageId.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): TapJoinActivityData {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var10: java.lang.String;
         if (var5) {
            val var9: MessageId = var7.m(var6, 0, MessageId.$serializer.INSTANCE, null) as MessageId;
            if (var9 != null) {
               var10 = var9.unbox-impl();
            } else {
               var10 = null;
            }
         } else {
            var2 = 0;
            var10 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
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

                  val var12: MessageId = var7.m(var6, 0, MessageId.$serializer.INSTANCE, var11) as MessageId;
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

         var7.b(var6);
         return new TapJoinActivityData(var2, var10, null, null);
      }

      public open fun serialize(encoder: Encoder, value: TapJoinActivityData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapJoinActivityData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapJoinActivityData> {
         return TapJoinActivityData.$serializer.INSTANCE;
      }
   }
}
