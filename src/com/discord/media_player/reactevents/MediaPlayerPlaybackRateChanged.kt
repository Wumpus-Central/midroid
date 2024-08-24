package com.discord.media_player.reactevents

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
import vk.a
import xk.f0
import xk.x

@f
public data class MediaPlayerPlaybackRateChanged(source: MediaPlayerPlaybackSource?, rate: Double) : ReactEvent {
   public final val rate: Double
   public final val source: MediaPlayerPlaybackSource?

   init {
      super();
      this.source = var1;
      this.rate = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: MediaPlayerPlaybackRateChanged, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.m(var2, 0, MediaPlayerPlaybackSource.$serializer.INSTANCE, var0.source);
      var1.D(var2, 1, var0.rate);
   }

   public operator fun component1(): MediaPlayerPlaybackSource? {
      return this.source;
   }

   public operator fun component2(): Double {
      return this.rate;
   }

   public fun copy(source: MediaPlayerPlaybackSource? = var0.source, rate: Double = var0.rate): MediaPlayerPlaybackRateChanged {
      return new MediaPlayerPlaybackRateChanged(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayerPlaybackRateChanged) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.source, var1.source)) {
            return false;
         } else {
            return java.lang.Double.compare(this.rate, var1.rate) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.source == null) {
         var1 = 0;
      } else {
         var1 = this.source.hashCode();
      }

      return var1 * 31 + java.lang.Double.hashCode(this.rate);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: MediaPlayerPlaybackSource = this.source;
      val var1: Double = this.rate;
      val var4: StringBuilder = new StringBuilder();
      var4.append("MediaPlayerPlaybackRateChanged(source=");
      var4.append(var3);
      var4.append(", rate=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<MediaPlayerPlaybackRateChanged> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MediaPlayerPlaybackRateChanged.$serializer = new MediaPlayerPlaybackRateChanged.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.media_player.reactevents.MediaPlayerPlaybackRateChanged", var0, 2
         );
         var1.l("source", false);
         var1.l("rate", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a.u(MediaPlayerPlaybackSource.$serializer.INSTANCE), x.a};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayerPlaybackRateChanged {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var4: Double;
         var var8: Int;
         val var9: Any;
         if (var11.p()) {
            var9 = var11.n(var10, 0, MediaPlayerPlaybackSource.$serializer.INSTANCE, null);
            var4 = var11.F(var10, 1);
            var8 = 3;
         } else {
            var var2: Double = 0.0;
            var var7: Boolean = true;
            var var12: Any = null;
            var var6: Int = 0;

            while (true) {
               var9 = var12;
               var8 = var6;
               var4 = var2;
               if (!var7) {
                  break;
               }

               var8 = var11.o(var10);
               if (var8 != -1) {
                  if (var8 != 0) {
                     if (var8 != 1) {
                        throw new n(var8);
                     }

                     var2 = var11.F(var10, 1);
                     var6 |= 2;
                  } else {
                     var12 = var11.n(var10, 0, MediaPlayerPlaybackSource.$serializer.INSTANCE, var12);
                     var6 |= 1;
                  }
               } else {
                  var7 = false;
               }
            }
         }

         var11.c(var10);
         return new MediaPlayerPlaybackRateChanged(var8, var9 as MediaPlayerPlaybackSource, var4, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayerPlaybackRateChanged) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MediaPlayerPlaybackRateChanged.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerPlaybackRateChanged> {
         return MediaPlayerPlaybackRateChanged.$serializer.INSTANCE;
      }
   }
}
