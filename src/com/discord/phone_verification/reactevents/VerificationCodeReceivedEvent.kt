package com.discord.phone_verification.reactevents

import al.b2
import al.g0
import al.g0.a
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
import xk.f
import xk.n

@f
internal data class VerificationCodeReceivedEvent(code: String) : ReactEvent {
   public final val code: String

   init {
      q.h(var1, "code");
      super();
      this.code = var1;
   }

   public operator fun component1(): String {
      return this.code;
   }

   public fun copy(code: String = var0.code): VerificationCodeReceivedEvent {
      q.h(var1, "code");
      return new VerificationCodeReceivedEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is VerificationCodeReceivedEvent) {
         return false;
      } else {
         return q.c(this.code, (var1 as VerificationCodeReceivedEvent).code);
      }
   }

   public override fun hashCode(): Int {
      return this.code.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.code;
      val var2: StringBuilder = new StringBuilder();
      var2.append("VerificationCodeReceivedEvent(code=");
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
         val var0: VerificationCodeReceivedEvent.$serializer = new VerificationCodeReceivedEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.phone_verification.reactevents.VerificationCodeReceivedEvent", var0, 1
         );
         var1.l("code", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a};
      }

      public open fun deserialize(decoder: Decoder): VerificationCodeReceivedEvent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: java.lang.String;
         if (var5) {
            var8 = var7.t(var6, 0);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.t(var6, 0);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new VerificationCodeReceivedEvent(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: VerificationCodeReceivedEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         VerificationCodeReceivedEvent.write$Self$phone_verification_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<VerificationCodeReceivedEvent> {
         return VerificationCodeReceivedEvent.$serializer.INSTANCE;
      }
   }
}
