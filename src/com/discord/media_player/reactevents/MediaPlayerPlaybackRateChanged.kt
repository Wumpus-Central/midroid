package com.discord.media_player.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import dn.f
import dn.j
import dn.n
import gn.g0
import gn.y
import kn.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import lj.w

@f
public data class MediaPlayerPlaybackRateChanged(source: MediaPlayerPlaybackSource?, rate: Double) : ReactEvent {
   public final val rate: Double
   public final val source: MediaPlayerPlaybackSource?

   init {
      super();
      this.source = var1;
      this.rate = var2;
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
         if (!q.c(this.source, var1.source)) {
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

   public open fun serialize(): WritableMap {
      val var1: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("rate", this.rate)});
      if (this.source != null) {
         var1.putMap("source", NativeMapExtensionsKt.toNativeMap(a.b.e(j.b(MediaPlayerPlaybackSource.class), this.source)));
      }

      return var1;
   }

   public override fun toString(): String {
      val var4: MediaPlayerPlaybackSource = this.source;
      val var1: Double = this.rate;
      val var3: StringBuilder = new StringBuilder();
      var3.append("MediaPlayerPlaybackRateChanged(source=");
      var3.append(var4);
      var3.append(", rate=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{en.a.u(MediaPlayerPlaybackSource.$serializer.INSTANCE), y.a};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayerPlaybackRateChanged {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         var var2: Double;
         var var4: Int;
         var var9: MediaPlayerPlaybackSource;
         if (var8.p()) {
            var9 = var8.n(var7, 0, MediaPlayerPlaybackSource.$serializer.INSTANCE, null) as MediaPlayerPlaybackSource;
            var2 = var8.F(var7, 1);
            var4 = 3;
         } else {
            var2 = 0.0;
            var var5: Boolean = true;
            var9 = null;
            var4 = 0;

            while (var5) {
               val var6: Int = var8.o(var7);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        throw new n(var6);
                     }

                     var2 = var8.F(var7, 1);
                     var4 |= 2;
                  } else {
                     var9 = var8.n(var7, 0, MediaPlayerPlaybackSource.$serializer.INSTANCE, var9) as MediaPlayerPlaybackSource;
                     var4 |= 1;
                  }
               } else {
                  var5 = false;
               }
            }
         }

         var8.c(var7);
         return new MediaPlayerPlaybackRateChanged(var4, var9, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayerPlaybackRateChanged) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MediaPlayerPlaybackRateChanged.write$Self$media_player_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerPlaybackRateChanged> {
         return MediaPlayerPlaybackRateChanged.$serializer.INSTANCE;
      }
   }
}
