package com.discord.media_player.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import dn.f
import dn.n
import gn.g0
import gn.y
import gn.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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

   public object `$serializer` : g0 {
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
         return new KSerializer[]{y.a, y.a, y.a};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayerProgress {
         q.h(var1, "decoder");
         val var13: SerialDescriptor = this.getDescriptor();
         val var14: c = var1.b(var13);
         var var2: Double;
         var var4: Double;
         var var6: Double;
         var var10: Int;
         if (var14.p()) {
            var4 = var14.F(var13, 0);
            var6 = var14.F(var13, 1);
            var2 = var14.F(var13, 2);
            var10 = 7;
         } else {
            var6 = 0.0;
            var var11: Boolean = true;
            var10 = 0;
            var4 = 0.0;
            var2 = 0.0;

            while (var11) {
               val var12: Int = var14.o(var13);
               if (var12 != -1) {
                  if (var12 != 0) {
                     if (var12 != 1) {
                        if (var12 != 2) {
                           throw new n(var12);
                        }

                        var6 = var14.F(var13, 2);
                        var10 |= 4;
                     } else {
                        var2 = var14.F(var13, 1);
                        var10 |= 2;
                     }
                  } else {
                     var4 = var14.F(var13, 0);
                     var10 |= 1;
                  }
               } else {
                  var11 = false;
               }
            }

            var2 = var6;
            var6 = var2;
         }

         var14.c(var13);
         return new MediaPlayerProgress(var10, var4, var6, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayerProgress) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MediaPlayerProgress.write$Self$media_player_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerProgress> {
         return MediaPlayerProgress.$serializer.INSTANCE;
      }
   }
}
