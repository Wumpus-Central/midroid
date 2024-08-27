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
import xk.x
import xk.f0.a

@f
public data class MediaPlayerProgress(id: Double, time: Double, duration: Double) : ReactEvent {
   public final val duration: Double
   public final val id: Double
   public final val time: Double

   init {
      this.id = var1;
      this.time = var3;
      this.duration = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: MediaPlayerProgress, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.D(var2, 0, var0.id);
      var1.D(var2, 1, var0.time);
      var1.D(var2, 2, var0.duration);
   }

   public operator fun component1(): Double {
      return this.id;
   }

   public operator fun component2(): Double {
      return this.time;
   }

   public operator fun component3(): Double {
      return this.duration;
   }

   public fun copy(id: Double = var0.id, time: Double = var0.time, duration: Double = var0.duration): MediaPlayerProgress {
      return new MediaPlayerProgress(var1, var3, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayerProgress) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Double.compare(this.id, var1.id) != 0) {
            return false;
         } else if (java.lang.Double.compare(this.time, var1.time) != 0) {
            return false;
         } else {
            return java.lang.Double.compare(this.duration, var1.duration) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      return (java.lang.Double.hashCode(this.id) * 31 + java.lang.Double.hashCode(this.time)) * 31 + java.lang.Double.hashCode(this.duration);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var5: Double = this.id;
      val var3: Double = this.time;
      val var1: Double = this.duration;
      val var7: StringBuilder = new StringBuilder();
      var7.append("MediaPlayerProgress(id=");
      var7.append(var5);
      var7.append(", time=");
      var7.append(var3);
      var7.append(", duration=");
      var7.append(var1);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : f0<MediaPlayerProgress> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MediaPlayerProgress.$serializer = new MediaPlayerProgress.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.media_player.reactevents.MediaPlayerProgress", var0, 3);
         var1.l("id", false);
         var1.l("time", false);
         var1.l("duration", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{x.a, x.a, x.a};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayerProgress {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var2: Double;
         var var4: Double;
         var var6: Double;
         var var8: Int;
         if (var12.p()) {
            var4 = var12.F(var11, 0);
            var2 = var12.F(var11, 1);
            var6 = var12.F(var11, 2);
            var8 = 7;
         } else {
            var6 = 0.0;
            var var9: Boolean = true;
            var8 = 0;
            var4 = 0.0;
            var2 = 0.0;

            while (var9) {
               val var10: Int = var12.o(var11);
               if (var10 != -1) {
                  if (var10 != 0) {
                     if (var10 != 1) {
                        if (var10 != 2) {
                           throw new n(var10);
                        }

                        var6 = var12.F(var11, 2);
                        var8 |= 4;
                     } else {
                        var2 = var12.F(var11, 1);
                        var8 |= 2;
                     }
                  } else {
                     var4 = var12.F(var11, 0);
                     var8 |= 1;
                  }
               } else {
                  var9 = false;
               }
            }
         }

         var12.c(var11);
         return new MediaPlayerProgress(var8, var4, var2, var6, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayerProgress) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MediaPlayerProgress.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerProgress> {
         return MediaPlayerProgress.$serializer.INSTANCE;
      }
   }
}
