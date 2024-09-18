package com.discord.chat.bridge

import cl.f
import cl.n
import com.discord.primitives.MessageId
import fl.b2
import fl.g0
import fl.o1
import fl.g0.a
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
public data class ErrorMessage(id: MessageId, stackTrace: String) : ErrorMessage(var1, var2) {
   public final val id: MessageId
   public final val stackTrace: String

   fun ErrorMessage(var1: Int, var2: java.lang.String, var3: java.lang.String, var4: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         o1.b(var1, 3, ErrorMessage.$serializer.INSTANCE.getDescriptor());
      }

      super(var1, var4);
      this.id = var2;
      this.stackTrace = var3;
   }

   fun ErrorMessage(var1: java.lang.String, var2: java.lang.String) {
      q.h(var1, "id");
      q.h(var2, "stackTrace");
      super(null);
      this.id = var1;
      this.stackTrace = var2;
   }

   public operator fun component1(): MessageId {
      return this.id;
   }

   public operator fun component2(): String {
      return this.stackTrace;
   }

   public fun copy(id: MessageId = ..., stackTrace: String = ...): ErrorMessage {
      q.h(var1, "id");
      q.h(var2, "stackTrace");
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
            return q.c(this.stackTrace, var1.stackTrace);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.id) * 31 + this.stackTrace.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.id);
      val var2: java.lang.String = this.stackTrace;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ErrorMessage(id=");
      var3.append(var1);
      var3.append(", stackTrace=");
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
         val var0: ErrorMessage.$serializer = new ErrorMessage.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.ErrorMessage", var0, 2);
         var1.l("id", false);
         var1.l("stackTrace", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{MessageId.$serializer.INSTANCE, b2.a};
      }

      public open fun deserialize(decoder: Decoder): ErrorMessage {
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
         return new ErrorMessage(var2, var12, var11, null, null);
      }

      public open fun serialize(encoder: Encoder, value: ErrorMessage) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ErrorMessage.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ErrorMessage> {
         return ErrorMessage.$serializer.INSTANCE;
      }
   }
}
