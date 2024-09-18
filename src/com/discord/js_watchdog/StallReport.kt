package com.discord.js_watchdog

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
import vk.f
import vk.n
import wk.a
import yk.b2
import yk.g0
import yk.n0

@f
public data class StallReport(stallTime: Int, sessionId: String, trace: String?) : ReactEvent {
   public final val sessionId: String
   public final val stallTime: Int
   public final val trace: String?

   init {
      q.h(var2, "sessionId");
      super();
      this.stallTime = var1;
      this.sessionId = var2;
      this.trace = var3;
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
      q.h(var2, "sessionId");
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
         } else if (!q.c(this.sessionId, var1.sessionId)) {
            return false;
         } else {
            return q.c(this.trace, var1.trace);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = Integer.hashCode(this.stallTime);
      val var3: Int = this.sessionId.hashCode();
      val var1: Int;
      if (this.trace == null) {
         var1 = 0;
      } else {
         var1 = this.trace.hashCode();
      }

      return (var2 * 31 + var3) * 31 + var1;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.stallTime;
      val var3: java.lang.String = this.sessionId;
      val var2: java.lang.String = this.trace;
      val var4: StringBuilder = new StringBuilder();
      var4.append("StallReport(stallTime=");
      var4.append(var1);
      var4.append(", sessionId=");
      var4.append(var3);
      var4.append(", trace=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{n0.a, b2.a, a.u(b2.a)};
      }

      public open fun deserialize(decoder: Decoder): StallReport {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.c(var7);
         var var2: Int;
         var var3: Int;
         var var6: java.lang.String;
         var var9: java.lang.String;
         if (var8.y()) {
            var3 = var8.k(var7, 0);
            var6 = var8.t(var7, 1);
            var9 = var8.v(var7, 2, b2.a, null) as java.lang.String;
            var2 = 7;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var6 = null;
            var9 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var8.x(var7);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var9 = var8.v(var7, 2, b2.a, var9) as java.lang.String;
                        var2 |= 4;
                     } else {
                        var6 = var8.t(var7, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var8.k(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var8.b(var7);
         return new StallReport(var2, var3, var6, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: StallReport) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         StallReport.write$Self$js_watchdog_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return yk.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<StallReport> {
         return StallReport.$serializer.INSTANCE;
      }
   }
}
