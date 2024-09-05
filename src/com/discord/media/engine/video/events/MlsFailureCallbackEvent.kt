package com.discord.media.engine.video.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.b2
import qn.g0
import qn.n0
import qn.g0.a

@f
internal data class MlsFailureCallbackEvent(connectionId: Int, source: String, reason: String) : ReactEvent {
   public final val connectionId: Int
   public final val reason: String
   public final val source: String

   init {
      q.h(var2, "source");
      q.h(var3, "reason");
      super();
      this.connectionId = var1;
      this.source = var2;
      this.reason = var3;
   }

   public operator fun component1(): Int {
      return this.connectionId;
   }

   public operator fun component2(): String {
      return this.source;
   }

   public operator fun component3(): String {
      return this.reason;
   }

   public fun copy(connectionId: Int = var0.connectionId, source: String = var0.source, reason: String = var0.reason): MlsFailureCallbackEvent {
      q.h(var2, "source");
      q.h(var3, "reason");
      return new MlsFailureCallbackEvent(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MlsFailureCallbackEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.connectionId != var1.connectionId) {
            return false;
         } else if (!q.c(this.source, var1.source)) {
            return false;
         } else {
            return q.c(this.reason, var1.reason);
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.connectionId) * 31 + this.source.hashCode()) * 31 + this.reason.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.connectionId;
      val var4: java.lang.String = this.source;
      val var3: java.lang.String = this.reason;
      val var2: StringBuilder = new StringBuilder();
      var2.append("MlsFailureCallbackEvent(connectionId=");
      var2.append(var1);
      var2.append(", source=");
      var2.append(var4);
      var2.append(", reason=");
      var2.append(var3);
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
         val var0: MlsFailureCallbackEvent.$serializer = new MlsFailureCallbackEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.media.engine.video.events.MlsFailureCallbackEvent", var0, 3
         );
         var1.c("connectionId", false);
         var1.c("source", false);
         var1.c("reason", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): MlsFailureCallbackEvent {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var3: Int;
         val var4: Int;
         var var6: java.lang.String;
         val var7: java.lang.String;
         if (var9.p()) {
            val var2: Int = var9.i(var8, 0);
            var6 = var9.m(var8, 1);
            val var10: java.lang.String = var9.m(var8, 2);
            var3 = 7;
            var4 = var2;
            var7 = var10;
         } else {
            var6 = null;
            var var11: java.lang.String = null;
            var var14: Boolean = true;
            var3 = 0;
            var var12: Int = 0;

            while (var14) {
               val var5: Int = var9.o(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var6 = var9.m(var8, 2);
                        var12 |= 4;
                     } else {
                        var11 = var9.m(var8, 1);
                        var12 |= 2;
                     }
                  } else {
                     var3 = var9.i(var8, 0);
                     var12 |= 1;
                  }
               } else {
                  var14 = false;
               }
            }

            var7 = var6;
            var6 = var11;
            var4 = var3;
            var3 = var12;
         }

         var9.c(var8);
         return new MlsFailureCallbackEvent(var3, var4, var6, var7, null);
      }

      public open fun serialize(encoder: Encoder, value: MlsFailureCallbackEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MlsFailureCallbackEvent.write$Self$media_engine_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MlsFailureCallbackEvent> {
         return MlsFailureCallbackEvent.$serializer.INSTANCE;
      }
   }
}
