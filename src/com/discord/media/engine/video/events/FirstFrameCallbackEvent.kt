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
import xk.w0
import xk.f0.a

@f
internal data class FirstFrameCallbackEvent(connectionId: Int, userId: String, ssrc: Long, streamId: String) : ReactEvent {
   public final val connectionId: Int
   public final val ssrc: Long
   public final val streamId: String
   public final val userId: String

   init {
      r.h(var2, "userId");
      r.h(var5, "streamId");
      super();
      this.connectionId = var1;
      this.userId = var2;
      this.ssrc = var3;
      this.streamId = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: FirstFrameCallbackEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.connectionId);
      var1.z(var2, 1, var0.userId);
      var1.E(var2, 2, var0.ssrc);
      var1.z(var2, 3, var0.streamId);
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
      r.h(var2, "userId");
      r.h(var5, "streamId");
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
         } else if (!r.c(this.userId, var1.userId)) {
            return false;
         } else if (this.ssrc != var1.ssrc) {
            return false;
         } else {
            return r.c(this.streamId, var1.streamId);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((Integer.hashCode(this.connectionId) * 31 + this.userId.hashCode()) * 31 + java.lang.Long.hashCode(this.ssrc)) * 31 + this.streamId.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.connectionId;
      val var5: java.lang.String = this.userId;
      val var2: Long = this.ssrc;
      val var6: java.lang.String = this.streamId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("FirstFrameCallbackEvent(connectionId=");
      var4.append(var1);
      var4.append(", userId=");
      var4.append(var5);
      var4.append(", ssrc=");
      var4.append(var2);
      var4.append(", streamId=");
      var4.append(var6);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<FirstFrameCallbackEvent> {
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
         return new KSerializer[]{m0.a, a2.a, w0.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): FirstFrameCallbackEvent {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         var var3: Int;
         val var4: Int;
         var var6: Long;
         var var8: java.lang.String;
         val var9: java.lang.String;
         if (var11.p()) {
            val var2: Int = var11.i(var10, 0);
            var8 = var11.m(var10, 1);
            var6 = var11.f(var10, 2);
            val var12: java.lang.String = var11.m(var10, 3);
            var3 = 15;
            var4 = var2;
            var9 = var12;
         } else {
            var var13: java.lang.String = null;
            var var16: Boolean = true;
            var6 = 0L;
            var8 = null;
            var3 = 0;
            var var14: Int = 0;

            while (var16) {
               val var5: Int = var11.o(var10);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              throw new n(var5);
                           }

                           var8 = var11.m(var10, 3);
                           var14 |= 8;
                        } else {
                           var6 = var11.f(var10, 2);
                           var14 |= 4;
                        }
                     } else {
                        var13 = var11.m(var10, 1);
                        var14 |= 2;
                     }
                  } else {
                     var3 = var11.i(var10, 0);
                     var14 |= 1;
                  }
               } else {
                  var16 = false;
               }
            }

            var9 = var8;
            var8 = var13;
            var4 = var3;
            var3 = var14;
         }

         var11.c(var10);
         return new FirstFrameCallbackEvent(var3, var4, var8, var6, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: FirstFrameCallbackEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         FirstFrameCallbackEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<FirstFrameCallbackEvent> {
         return FirstFrameCallbackEvent.$serializer.INSTANCE;
      }
   }
}
