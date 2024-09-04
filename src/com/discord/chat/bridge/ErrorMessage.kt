package com.discord.chat.bridge

import com.discord.primitives.MessageId
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
import xk.a2
import xk.f0
import xk.n1
import xk.f0.a

@f
public data class ErrorMessage(id: MessageId, stackTrace: String) : ErrorMessage(var1, var2) {
   public final val id: MessageId
   public final val stackTrace: String

   fun ErrorMessage(var1: Int, var2: java.lang.String, var3: java.lang.String, var4: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         n1.b(var1, 3, ErrorMessage.$serializer.INSTANCE.getDescriptor());
      }

      super(var1, var4);
      this.id = var2;
      this.stackTrace = var3;
   }

   fun ErrorMessage(var1: java.lang.String, var2: java.lang.String) {
      super(null);
      this.id = var1;
      this.stackTrace = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: ErrorMessage, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      MessageBase.write$Self(var0, var1, var2);
      var1.y(var2, 0, com.discord.primitives.MessageId..serializer.INSTANCE, MessageId.box-impl(var0.id));
      var1.z(var2, 1, var0.stackTrace);
   }

   public operator fun component1(): MessageId {
      return this.id;
   }

   public operator fun component2(): String {
      return this.stackTrace;
   }

   public fun copy(id: MessageId = ..., stackTrace: String = ...): ErrorMessage {
      r.h(var1, "id");
      r.h(var2, "stackTrace");
      return new ErrorMessage(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ErrorMessage) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.id, var1.id)) {
            return false;
         } else {
            return r.c(this.stackTrace, var1.stackTrace);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.id) * 31 + this.stackTrace.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.id);
      val var3: java.lang.String = this.stackTrace;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ErrorMessage(id=");
      var1.append(var2);
      var1.append(", stackTrace=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<ErrorMessage> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ErrorMessage.$serializer = new ErrorMessage.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.ErrorMessage", var0, 2);
         var1.l("id", false);
         var1.l("stackTrace", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{com.discord.primitives.MessageId..serializer.INSTANCE, a2.a};
      }

      public open fun deserialize(decoder: Decoder): ErrorMessage {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var6: java.lang.String;
         var var10: Any;
         if (var9.p()) {
            var10 = var9.y(var8, 0, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var6 = var9.m(var8, 1);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var10 = null;
            var6 = null;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var6 = var9.m(var8, 1);
                     var2 |= 2;
                  } else {
                     var10 = var9.y(var8, 0, com.discord.primitives.MessageId..serializer.INSTANCE, var10);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.c(var8);
         val var12: MessageId = var10 as MessageId;
         var10 = null;
         if (var12 != null) {
            var10 = var12.unbox-impl();
         }

         return new ErrorMessage(var2, (java.lang.String)var10, var6, null, null);
      }

      public open fun serialize(encoder: Encoder, value: ErrorMessage) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ErrorMessage.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ErrorMessage> {
         return ErrorMessage.$serializer.INSTANCE;
      }
   }
}
