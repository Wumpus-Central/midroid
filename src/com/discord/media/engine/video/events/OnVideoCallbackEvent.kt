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
import qn.x0
import qn.g0.a

@f
internal data class OnVideoCallbackEvent(connectionId: Int, userId: String, ssrc: Long, streamId: String, videoStreamParametersJSON: String) : ReactEvent {
   public final val connectionId: Int
   public final val ssrc: Long
   public final val streamId: String
   public final val userId: String
   public final val videoStreamParametersJSON: String

   init {
      q.h(var2, "userId");
      q.h(var5, "streamId");
      q.h(var6, "videoStreamParametersJSON");
      super();
      this.connectionId = var1;
      this.userId = var2;
      this.ssrc = var3;
      this.streamId = var5;
      this.videoStreamParametersJSON = var6;
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

   public operator fun component5(): String {
      return this.videoStreamParametersJSON;
   }

   public fun copy(
      connectionId: Int = var0.connectionId,
      userId: String = var0.userId,
      ssrc: Long = var0.ssrc,
      streamId: String = var0.streamId,
      videoStreamParametersJSON: String = var0.videoStreamParametersJSON
   ): OnVideoCallbackEvent {
      q.h(var2, "userId");
      q.h(var5, "streamId");
      q.h(var6, "videoStreamParametersJSON");
      return new OnVideoCallbackEvent(var1, var2, var3, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnVideoCallbackEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.connectionId != var1.connectionId) {
            return false;
         } else if (!q.c(this.userId, var1.userId)) {
            return false;
         } else if (this.ssrc != var1.ssrc) {
            return false;
         } else if (!q.c(this.streamId, var1.streamId)) {
            return false;
         } else {
            return q.c(this.videoStreamParametersJSON, var1.videoStreamParametersJSON);
         }
      }
   }

   public override fun hashCode(): Int {
      return (((Integer.hashCode(this.connectionId) * 31 + this.userId.hashCode()) * 31 + java.lang.Long.hashCode(this.ssrc)) * 31 + this.streamId.hashCode())
            * 31
         + this.videoStreamParametersJSON.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.connectionId;
      val var7: java.lang.String = this.userId;
      val var2: Long = this.ssrc;
      val var5: java.lang.String = this.streamId;
      val var6: java.lang.String = this.videoStreamParametersJSON;
      val var4: StringBuilder = new StringBuilder();
      var4.append("OnVideoCallbackEvent(connectionId=");
      var4.append(var1);
      var4.append(", userId=");
      var4.append(var7);
      var4.append(", ssrc=");
      var4.append(var2);
      var4.append(", streamId=");
      var4.append(var5);
      var4.append(", videoStreamParametersJSON=");
      var4.append(var6);
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
         val var0: OnVideoCallbackEvent.$serializer = new OnVideoCallbackEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media.engine.video.events.OnVideoCallbackEvent", var0, 5);
         var1.c("connectionId", false);
         var1.c("userId", false);
         var1.c("ssrc", false);
         var1.c("streamId", false);
         var1.c("videoStreamParametersJSON", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, b2.a, x0.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): OnVideoCallbackEvent {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var2: Int;
         var var3: Int;
         var var6: Long;
         var var8: java.lang.String;
         var var9: java.lang.String;
         val var13: java.lang.String;
         if (var12.p()) {
            var2 = var12.i(var11, 0);
            var9 = var12.m(var11, 1);
            var6 = var12.f(var11, 2);
            var13 = var12.m(var11, 3);
            var8 = var12.m(var11, 4);
            var3 = 31;
         } else {
            var var14: java.lang.String = null;
            var var4: Boolean = true;
            var2 = 0;
            var6 = 0L;
            var9 = null;
            var8 = null;
            var3 = 0;

            while (var4) {
               val var5: Int = var12.o(var11);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              if (var5 != 4) {
                                 throw new n(var5);
                              }

                              var8 = var12.m(var11, 4);
                              var2 |= 16;
                           } else {
                              var9 = var12.m(var11, 3);
                              var2 |= 8;
                           }
                        } else {
                           var6 = var12.f(var11, 2);
                           var2 |= 4;
                        }
                     } else {
                        var14 = var12.m(var11, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var12.i(var11, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var3 = var2;
            var13 = var9;
            var9 = var14;
            var2 = var3;
         }

         var12.c(var11);
         return new OnVideoCallbackEvent(var3, var2, var9, var6, var13, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: OnVideoCallbackEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         OnVideoCallbackEvent.write$Self$media_engine_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnVideoCallbackEvent> {
         return OnVideoCallbackEvent.$serializer.INSTANCE;
      }
   }
}
