package com.discord.chat.reactevents

import bl.b2
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
public data class TapButtonActionComponent(messageId: MessageId, componentId: String) : TapButtonActionComponent(var1, var2), ReactEvent {
   public final val componentId: String
   public final val messageId: MessageId

   fun TapButtonActionComponent(var1: Int, var2: java.lang.String, var3: java.lang.String, var4: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         o1.b(var1, 3, TapButtonActionComponent.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.messageId = var2;
      this.componentId = var3;
   }

   fun TapButtonActionComponent(var1: java.lang.String, var2: java.lang.String) {
      q.h(var1, "messageId");
      q.h(var2, "componentId");
      super();
      this.messageId = var1;
      this.componentId = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): String {
      return this.componentId;
   }

   public fun copy(messageId: MessageId = ..., componentId: String = ...): TapButtonActionComponent {
      q.h(var1, "messageId");
      q.h(var2, "componentId");
      return new TapButtonActionComponent(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapButtonActionComponent) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.componentId, var1.componentId);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId) * 31 + this.componentId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: java.lang.String = this.componentId;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapButtonActionComponent(messageId=");
      var3.append(var1);
      var3.append(", componentId=");
      var3.append(var2);
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
         val var0: TapButtonActionComponent.$serializer = new TapButtonActionComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapButtonActionComponent", var0, 2);
         var1.l("messageId", false);
         var1.l("componentId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{MessageId.$serializer.INSTANCE, b2.a};
      }

      public open fun deserialize(decoder: Decoder): TapButtonActionComponent {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         val var5: Boolean = var9.y();
         var var10: java.lang.String = null;
         var var2: Int;
         var var11: java.lang.String;
         var var12: java.lang.String;
         if (var5) {
            val var6: MessageId = var9.m(var8, 0, MessageId.$serializer.INSTANCE, null) as MessageId;
            if (var6 != null) {
               var10 = var6.unbox-impl();
            }

            val var7: java.lang.String = var9.t(var8, 1);
            var2 = 3;
            var12 = var10;
            var11 = var7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var11 = null;
            var12 = null;

            while (var3) {
               val var4: Int = var9.x(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var11 = var9.t(var8, 1);
                     var2 |= 2;
                  } else {
                     val var13: MessageId;
                     if (var12 != null) {
                        var13 = MessageId.box-impl(var12);
                     } else {
                        var13 = null;
                     }

                     val var14: MessageId = var9.m(var8, 0, MessageId.$serializer.INSTANCE, var13) as MessageId;
                     if (var14 != null) {
                        var12 = var14.unbox-impl();
                     } else {
                        var12 = null;
                     }

                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.b(var8);
         return new TapButtonActionComponent(var2, var12, var11, null, null);
      }

      public open fun serialize(encoder: Encoder, value: TapButtonActionComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapButtonActionComponent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapButtonActionComponent> {
         return TapButtonActionComponent.$serializer.INSTANCE;
      }
   }
}
