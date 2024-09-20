package com.discord.media_player.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import fl.f
import fl.j
import fl.n
import il.g0
import il.x0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import ml.a
import nh.w

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
         if (!q.c(this.source, var1.source)) {
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

   public override fun serialize(): WritableMap {
      val var1: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf(w.a("time", this.time), w.a("duration", this.duration));
      if (this.source != null) {
         var1.putMap("source", NativeMapExtensionsKt.toNativeMap(a.b.e(j.b(MediaPlayerPlaybackSource.class), this.source)));
      }

      return var1;
   }

   public override fun toString(): String {
      val var5: MediaPlayerPlaybackSource = this.source;
      val var3: Long = this.time;
      val var1: Long = this.duration;
      val var6: StringBuilder = new StringBuilder();
      var6.append("MediaPlayerPlaybackProgressUpdated(source=");
      var6.append(var5);
      var6.append(", time=");
      var6.append(var3);
      var6.append(", duration=");
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
         return new KSerializer[]{gl.a.u(MediaPlayerPlaybackSource.$serializer.INSTANCE), x0.a, x0.a};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayerPlaybackProgressUpdated {
         q.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.c(var12);
         val var11: Boolean = var13.y();
         var var14: MediaPlayerPlaybackSource = null;
         var var2: Int;
         val var9: Long;
         var var15: Long;
         if (var11) {
            var14 = var13.v(var12, 0, MediaPlayerPlaybackSource.$serializer.INSTANCE, null) as MediaPlayerPlaybackSource;
            var15 = var13.h(var12, 1);
            val var7: Long = var13.h(var12, 2);
            var2 = 7;
            var9 = var15;
            var15 = var7;
         } else {
            var var16: Long = 0L;
            var var3: Boolean = true;
            var2 = 0;
            var15 = 0L;

            while (var3) {
               val var4: Int = var13.x(var12);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var15 = var13.h(var12, 2);
                        var2 |= 4;
                     } else {
                        var16 = var13.h(var12, 1);
                        var2 |= 2;
                     }
                  } else {
                     var14 = var13.v(var12, 0, MediaPlayerPlaybackSource.$serializer.INSTANCE, var14) as MediaPlayerPlaybackSource;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var9 = var16;
         }

         var13.b(var12);
         return new MediaPlayerPlaybackProgressUpdated(var2, var14, var9, var15, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayerPlaybackProgressUpdated) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MediaPlayerPlaybackProgressUpdated.write$Self$media_player_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerPlaybackProgressUpdated> {
         return MediaPlayerPlaybackProgressUpdated.$serializer.INSTANCE;
      }
   }
}
