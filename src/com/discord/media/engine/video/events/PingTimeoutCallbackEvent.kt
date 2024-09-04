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
internal data class PingTimeoutCallbackEvent(connectionId: Int, server: String, port: Int, seq: Int, timeout: Int) : ReactEvent {
   public final val connectionId: Int
   public final val port: Int
   public final val seq: Int
   public final val server: String
   public final val timeout: Int

   init {
      r.h(var2, "server");
      super();
      this.connectionId = var1;
      this.server = var2;
      this.port = var3;
      this.seq = var4;
      this.timeout = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: PingTimeoutCallbackEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.connectionId);
      var1.z(var2, 1, var0.server);
      var1.w(var2, 2, var0.port);
      var1.w(var2, 3, var0.seq);
      var1.w(var2, 4, var0.timeout);
   }

   public operator fun component1(): Int {
      return this.connectionId;
   }

   public operator fun component2(): String {
      return this.server;
   }

   public operator fun component3(): Int {
      return this.port;
   }

   public operator fun component4(): Int {
      return this.seq;
   }

   public operator fun component5(): Int {
      return this.timeout;
   }

   public fun copy(connectionId: Int = var0.connectionId, server: String = var0.server, port: Int = var0.port, seq: Int = var0.seq, timeout: Int = var0.timeout): PingTimeoutCallbackEvent {
      r.h(var2, "server");
      return new PingTimeoutCallbackEvent(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PingTimeoutCallbackEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.connectionId != var1.connectionId) {
            return false;
         } else if (!r.c(this.server, var1.server)) {
            return false;
         } else if (this.port != var1.port) {
            return false;
         } else if (this.seq != var1.seq) {
            return false;
         } else {
            return this.timeout == var1.timeout;
         }
      }
   }

   public override fun hashCode(): Int {
      return (((Integer.hashCode(this.connectionId) * 31 + this.server.hashCode()) * 31 + Integer.hashCode(this.port)) * 31 + Integer.hashCode(this.seq)) * 31
         + Integer.hashCode(this.timeout);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.connectionId;
      val var6: java.lang.String = this.server;
      val var3: Int = this.port;
      val var4: Int = this.seq;
      val var2: Int = this.timeout;
      val var5: StringBuilder = new StringBuilder();
      var5.append("PingTimeoutCallbackEvent(connectionId=");
      var5.append(var1);
      var5.append(", server=");
      var5.append(var6);
      var5.append(", port=");
      var5.append(var3);
      var5.append(", seq=");
      var5.append(var4);
      var5.append(", timeout=");
      var5.append(var2);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : f0<PingTimeoutCallbackEvent> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PingTimeoutCallbackEvent.$serializer = new PingTimeoutCallbackEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.media.engine.video.events.PingTimeoutCallbackEvent", var0, 5
         );
         var1.l("connectionId", false);
         var1.l("server", false);
         var1.l("port", false);
         var1.l("seq", false);
         var1.l("timeout", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{m0.a, a2.a, m0.a, m0.a, m0.a};
      }

      public open fun deserialize(decoder: Decoder): PingTimeoutCallbackEvent {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var3: Int;
         var var5: Int;
         var var6: Int;
         val var7: Int;
         var var11: java.lang.String;
         var var14: Int;
         if (var10.p()) {
            var14 = var10.i(var9, 0);
            var11 = var10.m(var9, 1);
            var7 = var10.i(var9, 2);
            val var2: Int = var10.i(var9, 3);
            var3 = var10.i(var9, 4);
            var5 = 31;
            var6 = var14;
            var14 = var2;
         } else {
            var11 = null;
            var var17: Boolean = true;
            var6 = 0;
            var5 = 0;
            var14 = 0;
            var3 = 0;
            var var12: Int = 0;

            while (var17) {
               val var8: Int = var10.o(var9);
               if (var8 != -1) {
                  if (var8 != 0) {
                     if (var8 != 1) {
                        if (var8 != 2) {
                           if (var8 != 3) {
                              if (var8 != 4) {
                                 throw new n(var8);
                              }

                              var14 = var10.i(var9, 4);
                              var12 |= 16;
                           } else {
                              var5 = var10.i(var9, 3);
                              var12 |= 8;
                           }
                        } else {
                           var3 = var10.i(var9, 2);
                           var12 |= 4;
                        }
                     } else {
                        var11 = var10.m(var9, 1);
                        var12 |= 2;
                     }
                  } else {
                     var6 = var10.i(var9, 0);
                     var12 |= 1;
                  }
               } else {
                  var17 = false;
               }
            }

            var7 = var3;
            var3 = var14;
            var14 = var5;
            var5 = var12;
         }

         var10.c(var9);
         return new PingTimeoutCallbackEvent(var5, var6, var11, var7, var14, var3, null);
      }

      public open fun serialize(encoder: Encoder, value: PingTimeoutCallbackEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PingTimeoutCallbackEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PingTimeoutCallbackEvent> {
         return PingTimeoutCallbackEvent.$serializer.INSTANCE;
      }
   }
}
