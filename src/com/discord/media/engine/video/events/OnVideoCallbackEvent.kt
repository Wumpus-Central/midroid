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

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.connectionId;
      val var5: java.lang.String = this.userId;
      val var2: Long = this.ssrc;
      val var6: java.lang.String = this.streamId;
      val var4: java.lang.String = this.videoStreamParametersJSON;
      val var7: StringBuilder = new StringBuilder();
      var7.append("OnVideoCallbackEvent(connectionId=");
      var7.append(var1);
      var7.append(", userId=");
      var7.append(var5);
      var7.append(", ssrc=");
      var7.append(var2);
      var7.append(", streamId=");
      var7.append(var6);
      var7.append(", videoStreamParametersJSON=");
      var7.append(var4);
      var7.append(")");
      return var7.toString();
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
         var1.l("connectionId", false);
         var1.l("userId", false);
         var1.l("ssrc", false);
         var1.l("streamId", false);
         var1.l("videoStreamParametersJSON", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, b2.a, x0.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): OnVideoCallbackEvent {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.c(var11);
         var var2: Int;
         var var3: Int;
         var var6: Long;
         var var9: java.lang.String;
         val var10: java.lang.String;
         val var13: java.lang.String;
         if (var12.y()) {
            var3 = var12.k(var11, 0);
            var9 = var12.t(var11, 1);
            var6 = var12.h(var11, 2);
            var13 = var12.t(var11, 3);
            val var8: java.lang.String = var12.t(var11, 4);
            var2 = 31;
            var10 = var8;
         } else {
            var var14: java.lang.String = null;
            var var4: Boolean = true;
            var2 = 0;
            var6 = 0L;
            var9 = null;
            var var15: java.lang.String = null;
            var3 = 0;

            while (var4) {
               val var5: Int = var12.x(var11);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              if (var5 != 4) {
                                 throw new n(var5);
                              }

                              var15 = var12.t(var11, 4);
                              var2 |= 16;
                           } else {
                              var9 = var12.t(var11, 3);
                              var2 |= 8;
                           }
                        } else {
                           var6 = var12.h(var11, 2);
                           var2 |= 4;
                        }
                     } else {
                        var14 = var12.t(var11, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var12.k(var11, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var10 = var15;
            var13 = var9;
            var9 = var14;
         }

         var12.b(var11);
         return new OnVideoCallbackEvent(var2, var3, var9, var6, var13, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: OnVideoCallbackEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         OnVideoCallbackEvent.write$Self$media_engine_release(var2, var4, var3);
         var4.b(var3);
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
