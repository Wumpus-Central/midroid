package com.discord.media_player.reactevents

import cl.f
import cl.j
import cl.n
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import fl.g0
import fl.x0
import jl.a
import kh.w
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
         var1.putMap("source", NativeMapExtensionsKt.toNativeMap(a.b.e(j.d(MediaPlayerPlaybackSource.class), this.source)));
      }

      return var1;
   }

   public override fun toString(): String {
      val var6: MediaPlayerPlaybackSource = this.source;
      val var1: Long = this.time;
      val var3: Long = this.duration;
      val var5: StringBuilder = new StringBuilder();
      var5.append("MediaPlayerPlaybackProgressUpdated(source=");
      var5.append(var6);
      var5.append(", time=");
      var5.append(var1);
      var5.append(", duration=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
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
         return new KSerializer[]{dl.a.u(MediaPlayerPlaybackSource.$serializer.INSTANCE), x0.a, x0.a};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayerPlaybackProgressUpdated {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         val var9: Boolean = var11.y();
         var var12: MediaPlayerPlaybackSource = null;
         var var2: Int;
         var var5: Long;
         var var7: Long;
         if (var9) {
            var12 = var11.v(var10, 0, MediaPlayerPlaybackSource.$serializer.INSTANCE, null) as MediaPlayerPlaybackSource;
            var7 = var11.h(var10, 1);
            var5 = var11.h(var10, 2);
            var2 = 7;
         } else {
            var7 = 0L;
            var var3: Boolean = true;
            var2 = 0;
            var5 = 0L;

            while (var3) {
               val var4: Int = var11.x(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var5 = var11.h(var10, 2);
                        var2 |= 4;
                     } else {
                        var7 = var11.h(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var12 = var11.v(var10, 0, MediaPlayerPlaybackSource.$serializer.INSTANCE, var12) as MediaPlayerPlaybackSource;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var11.b(var10);
         return new MediaPlayerPlaybackProgressUpdated(var2, var12, var7, var5, null);
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
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerPlaybackProgressUpdated> {
         return MediaPlayerPlaybackProgressUpdated.$serializer.INSTANCE;
      }
   }
}
