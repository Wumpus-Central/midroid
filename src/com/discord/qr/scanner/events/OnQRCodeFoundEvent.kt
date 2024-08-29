package com.discord.qr.scanner.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class OnQRCodeFoundEvent(status: String, result: String? = null) : ReactEvent {
   public final val result: String?
   public final val status: String

   init {
      q.h(var1, "status");
      super();
      this.status = var1;
      this.result = var2;
   }

   public operator fun component1(): String {
      return this.status;
   }

   public operator fun component2(): String? {
      return this.result;
   }

   public fun copy(status: String = var0.status, result: String? = var0.result): OnQRCodeFoundEvent {
      q.h(var1, "status");
      return new OnQRCodeFoundEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnQRCodeFoundEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.status, var1.status)) {
            return false;
         } else {
            return q.c(this.result, var1.result);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.status.hashCode();
      val var1: Int;
      if (this.result == null) {
         var1 = 0;
      } else {
         var1 = this.result.hashCode();
      }

      return var2 * 31 + var1;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.status;
      val var2: java.lang.String = this.result;
      val var3: StringBuilder = new StringBuilder();
      var3.append("OnQRCodeFoundEvent(status=");
      var3.append(var1);
      var3.append(", result=");
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
         val var0: OnQRCodeFoundEvent.$serializer = new OnQRCodeFoundEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.qr.scanner.events.OnQRCodeFoundEvent", var0, 2);
         var1.l("status", false);
         var1.l("result", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, a.u(b2.a)};
      }

      public open fun deserialize(decoder: Decoder): OnQRCodeFoundEvent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.n(var6, 1, b2.a, null) as java.lang.String;
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.n(var6, 1, b2.a, var5) as java.lang.String;
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new OnQRCodeFoundEvent(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: OnQRCodeFoundEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         OnQRCodeFoundEvent.write$Self$qr_scanner_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnQRCodeFoundEvent> {
         return OnQRCodeFoundEvent.$serializer.INSTANCE;
      }
   }
}
