package com.discord.media.engine.video.events

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
import xk.a2
import xk.f0
import xk.m0
import xk.f0.a

@f
internal data class MlsFailureCallbackEvent(connectionId: Int, source: String, reason: String) : ReactEvent {
   public final val connectionId: Int
   public final val reason: String
   public final val source: String

   init {
      r.h(var2, "source");
      r.h(var3, "reason");
      super();
      this.connectionId = var1;
      this.source = var2;
      this.reason = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: MlsFailureCallbackEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.connectionId);
      var1.z(var2, 1, var0.source);
      var1.z(var2, 2, var0.reason);
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
      r.h(var2, "source");
      r.h(var3, "reason");
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
         } else if (!r.c(this.source, var1.source)) {
            return false;
         } else {
            return r.c(this.reason, var1.reason);
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
      val var2: java.lang.String = this.source;
      val var3: java.lang.String = this.reason;
      val var4: StringBuilder = new StringBuilder();
      var4.append("MlsFailureCallbackEvent(connectionId=");
      var4.append(var1);
      var4.append(", source=");
      var4.append(var2);
      var4.append(", reason=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<MlsFailureCallbackEvent> {
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
         var1.l("connectionId", false);
         var1.l("source", false);
         var1.l("reason", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{m0.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): MlsFailureCallbackEvent {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var3: Int;
         var var6: java.lang.String;
         val var10: java.lang.String;
         if (var9.p()) {
            var3 = var9.i(var8, 0);
            var6 = var9.m(var8, 1);
            var10 = var9.m(var8, 2);
            var2 = 7;
         } else {
            var6 = null;
            var var11: java.lang.String = null;
            var var4: Boolean = true;
            var3 = 0;
            var2 = 0;

            while (var4) {
               val var5: Int = var9.o(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var6 = var9.m(var8, 2);
                        var2 |= 4;
                     } else {
                        var11 = var9.m(var8, 1);
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
            var10 = var6;
         }

         var9.c(var8);
         return new MlsFailureCallbackEvent(var2, var3, var6, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: MlsFailureCallbackEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MlsFailureCallbackEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MlsFailureCallbackEvent> {
         return MlsFailureCallbackEvent.$serializer.INSTANCE;
      }
   }
}
