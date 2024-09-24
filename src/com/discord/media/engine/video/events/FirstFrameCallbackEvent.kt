package com.discord.media.engine.video.events

import cl.f
import cl.n
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fl.b2
import fl.g0
import fl.n0
import fl.x0
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
internal data class FirstFrameCallbackEvent(connectionId: Int, userId: String, ssrc: Long, streamId: String) : ReactEvent {
   public final val connectionId: Int
   public final val ssrc: Long
   public final val streamId: String
   public final val userId: String

   init {
      q.h(var2, "userId");
      q.h(var5, "streamId");
      super();
      this.connectionId = var1;
      this.userId = var2;
      this.ssrc = var3;
      this.streamId = var5;
   }

   public operator fun component1(): Int {
      return this.connectionId;
   }

   public operator fun component2(): String {
      return this.userId;
   }

   public operator fun component3(): Long {
      return this.ssrc;
   }

   public operator fun component4(): String {
      return this.streamId;
   }

   public fun copy(connectionId: Int = var0.connectionId, userId: String = var0.userId, ssrc: Long = var0.ssrc, streamId: String = var0.streamId): FirstFrameCallbackEvent {
      q.h(var2, "userId");
      q.h(var5, "streamId");
      return new FirstFrameCallbackEvent(var1, var2, var3, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is FirstFrameCallbackEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.connectionId != var1.connectionId) {
            return false;
         } else if (!q.c(this.userId, var1.userId)) {
            return false;
         } else if (this.ssrc != var1.ssrc) {
            return false;
         } else {
            return q.c(this.streamId, var1.streamId);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((Integer.hashCode(this.connectionId) * 31 + this.userId.hashCode()) * 31 + java.lang.Long.hashCode(this.ssrc)) * 31 + this.streamId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.connectionId;
      val var6: java.lang.String = this.userId;
      val var2: Long = this.ssrc;
      val var5: java.lang.String = this.streamId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("FirstFrameCallbackEvent(connectionId=");
      var4.append(var1);
      var4.append(", userId=");
      var4.append(var6);
      var4.append(", ssrc=");
      var4.append(var2);
      var4.append(", streamId=");
      var4.append(var5);
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
         val var0: FirstFrameCallbackEvent.$serializer = new FirstFrameCallbackEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.media.engine.video.events.FirstFrameCallbackEvent", var0, 4
         );
         var1.l("connectionId", false);
         var1.l("userId", false);
         var1.l("ssrc", false);
         var1.l("streamId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, b2.a, x0.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): FirstFrameCallbackEvent {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         var var2: Int;
         var var3: Int;
         var var6: Long;
         var var8: java.lang.String;
         val var9: java.lang.String;
         if (var11.y()) {
            var2 = var11.k(var10, 0);
            var9 = var11.t(var10, 1);
            var6 = var11.h(var10, 2);
            val var12: java.lang.String = var11.t(var10, 3);
            var3 = 15;
            var8 = var12;
         } else {
            var var13: java.lang.String = null;
            var var4: Boolean = true;
            var6 = 0L;
            var8 = null;
            var3 = 0;
            var2 = 0;

            while (var4) {
               val var5: Int = var11.x(var10);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              throw new n(var5);
                           }

                           var8 = var11.t(var10, 3);
                           var2 |= 8;
                        } else {
                           var6 = var11.h(var10, 2);
                           var2 |= 4;
                        }
                     } else {
                        var13 = var11.t(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var11.k(var10, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var3 = var2;
            var9 = var13;
            var2 = var3;
         }

         var11.b(var10);
         return new FirstFrameCallbackEvent(var3, var2, var9, var6, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: FirstFrameCallbackEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         FirstFrameCallbackEvent.write$Self$media_engine_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<FirstFrameCallbackEvent> {
         return FirstFrameCallbackEvent.$serializer.INSTANCE;
      }
   }
}
