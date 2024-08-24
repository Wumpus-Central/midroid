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
import xk.w0

@f
public data class MediaPlayerPlaybackProgressUpdated(source: MediaPlayerPlaybackSource?, time: Long, duration: Long) : ReactEvent {
   public final val duration: Long
   public final val source: MediaPlayerPlaybackSource?
   public final val time: Long

   init {
      super();
      this.source = var1;
      this.time = var2;
      this.duration = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: MediaPlayerPlaybackProgressUpdated, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.m(var2, 0, MediaPlayerPlaybackSource.$serializer.INSTANCE, var0.source);
      var1.E(var2, 1, var0.time);
      var1.E(var2, 2, var0.duration);
   }

   public operator fun component1(): MediaPlayerPlaybackSource? {
      return this.source;
   }

   public operator fun component2(): Long {
      return this.time;
   }

   public operator fun component3(): Long {
      return this.duration;
   }

   public fun copy(source: MediaPlayerPlaybackSource? = var0.source, time: Long = var0.time, duration: Long = var0.duration): MediaPlayerPlaybackProgressUpdated {
      return new MediaPlayerPlaybackProgressUpdated(var1, var2, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayerPlaybackProgressUpdated) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.source, var1.source)) {
            return false;
         } else if (this.time != var1.time) {
            return false;
         } else {
            return this.duration == var1.duration;
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

      return (var1 * 31 + java.lang.Long.hashCode(this.time)) * 31 + java.lang.Long.hashCode(this.duration);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var5: MediaPlayerPlaybackSource = this.source;
      val var1: Long = this.time;
      val var3: Long = this.duration;
      val var6: StringBuilder = new StringBuilder();
      var6.append("MediaPlayerPlaybackProgressUpdated(source=");
      var6.append(var5);
      var6.append(", time=");
      var6.append(var1);
      var6.append(", duration=");
      var6.append(var3);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : f0<MediaPlayerPlaybackProgressUpdated> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MediaPlayerPlaybackProgressUpdated.$serializer = new MediaPlayerPlaybackProgressUpdated.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.media_player.reactevents.MediaPlayerPlaybackProgressUpdated", var0, 3
         );
         var1.l("source", false);
         var1.l("time", false);
         var1.l("duration", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a.u(MediaPlayerPlaybackSource.$serializer.INSTANCE), w0.a, w0.a};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayerPlaybackProgressUpdated {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var9: Boolean = var11.p();
         var var12: Any = null;
         var var2: Int;
         var var5: Long;
         var var7: Long;
         if (var9) {
            var12 = var11.n(var10, 0, MediaPlayerPlaybackSource.$serializer.INSTANCE, null);
            var7 = var11.f(var10, 1);
            var5 = var11.f(var10, 2);
            var2 = 7;
         } else {
            var7 = 0L;
            var var3: Boolean = true;
            var2 = 0;
            var5 = 0L;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var5 = var11.f(var10, 2);
                        var2 |= 4;
                     } else {
                        var7 = var11.f(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var12 = var11.n(var10, 0, MediaPlayerPlaybackSource.$serializer.INSTANCE, var12);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var11.c(var10);
         return new MediaPlayerPlaybackProgressUpdated(var2, var12 as MediaPlayerPlaybackSource, var7, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayerPlaybackProgressUpdated) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MediaPlayerPlaybackProgressUpdated.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerPlaybackProgressUpdated> {
         return MediaPlayerPlaybackProgressUpdated.$serializer.INSTANCE;
      }
   }
}
