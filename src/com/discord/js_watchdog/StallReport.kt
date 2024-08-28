package com.discord.js_watchdog

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
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.m0

@f
public data class StallReport(stallTime: Int, sessionId: String, trace: String?) : ReactEvent {
   public final val sessionId: String
   public final val stallTime: Int
   public final val trace: String?

   init {
      r.h(var2, "sessionId");
      super();
      this.stallTime = var1;
      this.sessionId = var2;
      this.trace = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: StallReport, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.stallTime);
      var1.z(var2, 1, var0.sessionId);
      var1.m(var2, 2, a2.a, var0.trace);
   }

   public operator fun component1(): Int {
      return this.stallTime;
   }

   public operator fun component2(): String {
      return this.sessionId;
   }

   public operator fun component3(): String? {
      return this.trace;
   }

   public fun copy(stallTime: Int = var0.stallTime, sessionId: String = var0.sessionId, trace: String? = var0.trace): StallReport {
      r.h(var2, "sessionId");
      return new StallReport(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is StallReport) {
         return false;
      } else {
         var1 = var1;
         if (this.stallTime != var1.stallTime) {
            return false;
         } else if (!r.c(this.sessionId, var1.sessionId)) {
            return false;
         } else {
            return r.c(this.trace, var1.trace);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = Integer.hashCode(this.stallTime);
      val var2: Int = this.sessionId.hashCode();
      val var1: Int;
      if (this.trace == null) {
         var1 = 0;
      } else {
         var1 = this.trace.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.stallTime;
      val var2: java.lang.String = this.sessionId;
      val var4: java.lang.String = this.trace;
      val var3: StringBuilder = new StringBuilder();
      var3.append("StallReport(stallTime=");
      var3.append(var1);
      var3.append(", sessionId=");
      var3.append(var2);
      var3.append(", trace=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<StallReport> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: StallReport.$serializer = new StallReport.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.js_watchdog.StallReport", var0, 3);
         var1.l("stallTime", false);
         var1.l("sessionId", false);
         var1.l("trace", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{m0.a, a2.a, a.u(a2.a)};
      }

      public open fun deserialize(decoder: Decoder): StallReport {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var3: Int;
         var var6: Any;
         val var10: java.lang.String;
         if (var9.p()) {
            var3 = var9.i(var8, 0);
            var10 = var9.m(var8, 1);
            var6 = var9.n(var8, 2, a2.a, null);
            var2 = 7;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var6 = null;
            var var11: Any = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var9.o(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var11 = var9.n(var8, 2, a2.a, var11);
                        var2 |= 4;
                     } else {
                        var6 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var9.i(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var6 = var11;
            var10 = (java.lang.String)var6;
         }

         var9.c(var8);
         return new StallReport(var2, var3, var10, var6 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: StallReport) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         StallReport.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<StallReport> {
         return StallReport.$serializer.INSTANCE;
      }
   }
}
