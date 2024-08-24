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
import xk.f0
import xk.h
import xk.x
import xk.f0.a

@f
public data class MediaPlayerPause(id: Double, paused: Boolean) : ReactEvent {
   public final val id: Double
   public final val paused: Boolean

   init {
      this.id = var1;
      this.paused = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: MediaPlayerPause, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.D(var2, 0, var0.id);
      var1.x(var2, 1, var0.paused);
   }

   public operator fun component1(): Double {
      return this.id;
   }

   public operator fun component2(): Boolean {
      return this.paused;
   }

   public fun copy(id: Double = var0.id, paused: Boolean = var0.paused): MediaPlayerPause {
      return new MediaPlayerPause(var1, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayerPause) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Double.compare(this.id, var1.id) != 0) {
            return false;
         } else {
            return this.paused == var1.paused;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = java.lang.Double.hashCode(this.id);
      var var1: Byte = this.paused;
      if (this.paused != 0) {
         var1 = 1;
      }

      return var3 * 31 + var1;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Double = this.id;
      val var3: Boolean = this.paused;
      val var4: StringBuilder = new StringBuilder();
      var4.append("MediaPlayerPause(id=");
      var4.append(var1);
      var4.append(", paused=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<MediaPlayerPause> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MediaPlayerPause.$serializer = new MediaPlayerPause.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media_player.reactevents.MediaPlayerPause", var0, 2);
         var1.l("id", false);
         var1.l("paused", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{x.a, h.a};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayerPause {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Double;
         var var4: Int;
         var var7: Boolean;
         if (var9.p()) {
            var2 = var9.F(var8, 0);
            var7 = var9.C(var8, 1);
            var4 = 3;
         } else {
            var var5: Boolean = true;
            var7 = false;
            var2 = 0.0;
            var4 = 0;

            while (var5) {
               val var6: Int = var9.o(var8);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        throw new n(var6);
                     }

                     var7 = var9.C(var8, 1);
                     var4 |= 2;
                  } else {
                     var2 = var9.F(var8, 0);
                     var4 |= 1;
                  }
               } else {
                  var5 = false;
               }
            }
         }

         var9.c(var8);
         return new MediaPlayerPause(var4, var2, var7, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayerPause) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MediaPlayerPause.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerPause> {
         return MediaPlayerPause.$serializer.INSTANCE;
      }
   }
}
