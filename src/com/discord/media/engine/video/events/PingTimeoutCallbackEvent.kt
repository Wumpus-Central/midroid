package com.discord.media.engine.video.events

import cl.f
import cl.n
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fl.b2
import fl.g0
import fl.n0
import fl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class PingTimeoutCallbackEvent(connectionId: Int, server: String, port: Int, seq: Int, timeout: Int) : ReactEvent {
   public final val connectionId: Int
   public final val port: Int
   public final val seq: Int
   public final val server: String
   public final val timeout: Int

   init {
      q.h(var2, "server");
      super();
      this.connectionId = var1;
      this.server = var2;
      this.port = var3;
      this.seq = var4;
      this.timeout = var5;
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
      q.h(var2, "server");
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
         } else if (!q.c(this.server, var1.server)) {
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

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: Int = this.connectionId;
      val var5: java.lang.String = this.server;
      val var1: Int = this.port;
      val var2: Int = this.seq;
      val var4: Int = this.timeout;
      val var6: StringBuilder = new StringBuilder();
      var6.append("PingTimeoutCallbackEvent(connectionId=");
      var6.append(var3);
      var6.append(", server=");
      var6.append(var5);
      var6.append(", port=");
      var6.append(var1);
      var6.append(", seq=");
      var6.append(var2);
      var6.append(", timeout=");
      var6.append(var4);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{n0.a, b2.a, n0.a, n0.a, n0.a};
      }

      public open fun deserialize(decoder: Decoder): PingTimeoutCallbackEvent {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         val var7: Int;
         var var11: java.lang.String;
         if (var10.y()) {
            var4 = var10.k(var9, 0);
            var11 = var10.t(var9, 1);
            var5 = var10.k(var9, 2);
            var3 = var10.k(var9, 3);
            val var2: Int = var10.k(var9, 4);
            var6 = 31;
            var7 = var2;
         } else {
            var11 = null;
            var var18: Boolean = true;
            var6 = 0;
            var5 = 0;
            var4 = 0;
            var3 = 0;
            var var12: Int = 0;

            while (var18) {
               val var8: Int = var10.x(var9);
               if (var8 != -1) {
                  if (var8 != 0) {
                     if (var8 != 1) {
                        if (var8 != 2) {
                           if (var8 != 3) {
                              if (var8 != 4) {
                                 throw new n(var8);
                              }

                              var4 = var10.k(var9, 4);
                              var12 |= 16;
                           } else {
                              var5 = var10.k(var9, 3);
                              var12 |= 8;
                           }
                        } else {
                           var3 = var10.k(var9, 2);
                           var12 |= 4;
                        }
                     } else {
                        var11 = var10.t(var9, 1);
                        var12 |= 2;
                     }
                  } else {
                     var6 = var10.k(var9, 0);
                     var12 |= 1;
                  }
               } else {
                  var18 = false;
               }
            }

            var7 = var4;
            var3 = var5;
            var5 = var3;
            var4 = var6;
            var6 = var12;
         }

         var10.b(var9);
         return new PingTimeoutCallbackEvent(var6, var4, var11, var5, var3, var7, null);
      }

      public open fun serialize(encoder: Encoder, value: PingTimeoutCallbackEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         PingTimeoutCallbackEvent.write$Self$media_engine_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PingTimeoutCallbackEvent> {
         return PingTimeoutCallbackEvent.$serializer.INSTANCE;
      }
   }
}
