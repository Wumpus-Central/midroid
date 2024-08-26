package com.discord.media_player.reactevents

import al.a
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import eh.w
import fh.s
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.j
import uk.n
import xk.f0

@f
public data class MediaPlayerPlaybackSourceChanged(source: MediaPlayerPlaybackSource?) : ReactEvent {
   public final val source: MediaPlayerPlaybackSource?

   init {
      super();
      this.source = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: MediaPlayerPlaybackSourceChanged, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.m(var2, 0, MediaPlayerPlaybackSource.$serializer.INSTANCE, var0.source);
   }

   public operator fun component1(): MediaPlayerPlaybackSource? {
      return this.source;
   }

   public fun copy(source: MediaPlayerPlaybackSource? = var0.source): MediaPlayerPlaybackSourceChanged {
      return new MediaPlayerPlaybackSourceChanged(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayerPlaybackSourceChanged) {
         return false;
      } else {
         return r.c(this.source, (var1 as MediaPlayerPlaybackSourceChanged).source);
      }
   }

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.source == null) {
         var1 = 0;
      } else {
         var1 = this.source.hashCode();
      }

      return var1;
   }

   public open fun serialize(): WritableMap {
      return if (this.source == null)
         NativeMapExtensionsKt.toNativeMap(s.h())
         else
         NativeMapExtensionsKt.nativeMapOf(
            new Pair[]{w.a("source", NativeMapExtensionsKt.toNativeMap(a.b.e(j.b(MediaPlayerPlaybackSource.class), this.source)))}
         );
   }

   public override fun toString(): String {
      val var2: MediaPlayerPlaybackSource = this.source;
      val var1: StringBuilder = new StringBuilder();
      var1.append("MediaPlayerPlaybackSourceChanged(source=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<MediaPlayerPlaybackSourceChanged> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MediaPlayerPlaybackSourceChanged.$serializer = new MediaPlayerPlaybackSourceChanged.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.media_player.reactevents.MediaPlayerPlaybackSourceChanged", var0, 1
         );
         var1.l("source", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{vk.a.u(MediaPlayerPlaybackSource.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayerPlaybackSourceChanged {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: Any;
         if (var5) {
            var8 = var7.n(var6, 0, MediaPlayerPlaybackSource.$serializer.INSTANCE, null);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.n(var6, 0, MediaPlayerPlaybackSource.$serializer.INSTANCE, var8);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new MediaPlayerPlaybackSourceChanged(var2, var8 as MediaPlayerPlaybackSource, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayerPlaybackSourceChanged) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MediaPlayerPlaybackSourceChanged.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerPlaybackSourceChanged> {
         return MediaPlayerPlaybackSourceChanged.$serializer.INSTANCE;
      }
   }
}
