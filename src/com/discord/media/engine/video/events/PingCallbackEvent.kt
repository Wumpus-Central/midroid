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
internal data class PingCallbackEvent(connectionId: Int, ping: Int, server: String, port: Int, seq: Int) : ReactEvent {
   public final val connectionId: Int
   public final val ping: Int
   public final val port: Int
   public final val seq: Int
   public final val server: String

   init {
      q.h(var3, "server");
      super();
      this.connectionId = var1;
      this.ping = var2;
      this.server = var3;
      this.port = var4;
      this.seq = var5;
   }

   public operator fun component1(): Int {
      return this.connectionId;
   }

   public operator fun component2(): Int {
      return this.ping;
   }

   public operator fun component3(): String {
      return this.server;
   }

   public operator fun component4(): Int {
      return this.port;
   }

   public operator fun component5(): Int {
      return this.seq;
   }

   public fun copy(connectionId: Int = var0.connectionId, ping: Int = var0.ping, server: String = var0.server, port: Int = var0.port, seq: Int = var0.seq): PingCallbackEvent {
      q.h(var3, "server");
      return new PingCallbackEvent(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PingCallbackEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.connectionId != var1.connectionId) {
            return false;
         } else if (this.ping != var1.ping) {
            return false;
         } else if (!q.c(this.server, var1.server)) {
            return false;
         } else if (this.port != var1.port) {
            return false;
         } else {
            return this.seq == var1.seq;
         }
      }
   }

   public override fun hashCode(): Int {
      return (((Integer.hashCode(this.connectionId) * 31 + Integer.hashCode(this.ping)) * 31 + this.server.hashCode()) * 31 + Integer.hashCode(this.port)) * 31
         + Integer.hashCode(this.seq);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var4: Int = this.connectionId;
      val var2: Int = this.ping;
      val var5: java.lang.String = this.server;
      val var3: Int = this.port;
      val var1: Int = this.seq;
      val var6: StringBuilder = new StringBuilder();
      var6.append("PingCallbackEvent(connectionId=");
      var6.append(var4);
      var6.append(", ping=");
      var6.append(var2);
      var6.append(", server=");
      var6.append(var5);
      var6.append(", port=");
      var6.append(var3);
      var6.append(", seq=");
      var6.append(var1);
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
         val var0: PingCallbackEvent.$serializer = new PingCallbackEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.PingCallbackEvent", var0, 5);
         var1.c("connectionId", false);
         var1.c("ping", false);
         var1.c("server", false);
         var1.c("port", false);
         var1.c("seq", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, n0.a, b2.a, n0.a, n0.a};
      }

      public open fun deserialize(decoder: Decoder): PingCallbackEvent {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Int;
         var var3: Int;
         var var5: Int;
         var var6: Int;
         var var11: java.lang.String;
         var var14: Int;
         if (var10.p()) {
            var14 = var10.i(var9, 0);
            val var7: Int = var10.i(var9, 1);
            var11 = var10.m(var9, 2);
            var3 = var10.i(var9, 3);
            var2 = var10.i(var9, 4);
            var5 = 31;
            var6 = var14;
            var14 = var7;
         } else {
            var11 = null;
            var var17: Boolean = true;
            var6 = 0;
            var5 = 0;
            var14 = 0;
            var3 = 0;
            var2 = 0;

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
                              var2 |= 16;
                           } else {
                              var5 = var10.i(var9, 3);
                              var2 |= 8;
                           }
                        } else {
                           var11 = var10.m(var9, 2);
                           var2 |= 4;
                        }
                     } else {
                        var3 = var10.i(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var10.i(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var17 = false;
               }
            }

            var14 = var3;
            var5 = var2;
            var2 = var14;
            var3 = var5;
         }

         var10.c(var9);
         return new PingCallbackEvent(var5, var6, var14, var11, var3, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: PingCallbackEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PingCallbackEvent.write$Self$media_engine_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PingCallbackEvent> {
         return PingCallbackEvent.$serializer.INSTANCE;
      }
   }
}
