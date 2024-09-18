package com.discord.media.engine.video.events

import bl.b2
import bl.g0
import bl.n0
import bl.g0.a
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
import yk.f
import yk.n

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

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.connectionId;
      val var3: java.lang.String = this.source;
      val var2: java.lang.String = this.reason;
      val var4: StringBuilder = new StringBuilder();
      var4.append("MlsFailureCallbackEvent(connectionId=");
      var4.append(var1);
      var4.append(", source=");
      var4.append(var3);
      var4.append(", reason=");
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
         return new KSerializer[]{n0.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): MlsFailureCallbackEvent {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         var var2: Int;
         var var3: Int;
         var var6: java.lang.String;
         val var7: java.lang.String;
         if (var9.y()) {
            var3 = var9.k(var8, 0);
            var6 = var9.t(var8, 1);
            val var10: java.lang.String = var9.t(var8, 2);
            var2 = 7;
            var7 = var10;
         } else {
            var6 = null;
            var var11: java.lang.String = null;
            var var4: Boolean = true;
            var3 = 0;
            var2 = 0;

            while (var4) {
               val var5: Int = var9.x(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var6 = var9.t(var8, 2);
                        var2 |= 4;
                     } else {
                        var11 = var9.t(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var9.k(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var7 = var6;
            var6 = var11;
         }

         var9.b(var8);
         return new MlsFailureCallbackEvent(var2, var3, var6, var7, null);
      }

      public open fun serialize(encoder: Encoder, value: MlsFailureCallbackEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MlsFailureCallbackEvent.write$Self$media_engine_release(var2, var4, var3);
         var4.b(var3);
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
