package com.discord.media_player.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import vk.f
import vk.n
import yk.g0
import yk.y
import yk.g0.a

@f
public data class MediaPlayerDownloadProgress(id: Double, progressSeconds: Double, progressPercent: Double, totalDurationSeconds: Double) : ReactEvent {
   public final val id: Double
   public final val progressPercent: Double
   public final val progressSeconds: Double
   public final val totalDurationSeconds: Double

   init {
      this.id = var1;
      this.progressSeconds = var3;
      this.progressPercent = var5;
      this.totalDurationSeconds = var7;
   }

   public operator fun component1(): Double {
      return this.id;
   }

   public operator fun component2(): Double {
      return this.progressSeconds;
   }

   public operator fun component3(): Double {
      return this.progressPercent;
   }

   public operator fun component4(): Double {
      return this.totalDurationSeconds;
   }

   public fun copy(
      id: Double = var0.id,
      progressSeconds: Double = var0.progressSeconds,
      progressPercent: Double = var0.progressPercent,
      totalDurationSeconds: Double = var0.totalDurationSeconds
   ): MediaPlayerDownloadProgress {
      return new MediaPlayerDownloadProgress(var1, var3, var5, var7);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayerDownloadProgress) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Double.compare(this.id, var1.id) != 0) {
            return false;
         } else if (java.lang.Double.compare(this.progressSeconds, var1.progressSeconds) != 0) {
            return false;
         } else if (java.lang.Double.compare(this.progressPercent, var1.progressPercent) != 0) {
            return false;
         } else {
            return java.lang.Double.compare(this.totalDurationSeconds, var1.totalDurationSeconds) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (java.lang.Double.hashCode(this.id) * 31 + java.lang.Double.hashCode(this.progressSeconds)) * 31
                  + java.lang.Double.hashCode(this.progressPercent)
            )
            * 31
         + java.lang.Double.hashCode(this.totalDurationSeconds);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var5: Double = this.id;
      val var7: Double = this.progressSeconds;
      val var3: Double = this.progressPercent;
      val var1: Double = this.totalDurationSeconds;
      val var9: StringBuilder = new StringBuilder();
      var9.append("MediaPlayerDownloadProgress(id=");
      var9.append(var5);
      var9.append(", progressSeconds=");
      var9.append(var7);
      var9.append(", progressPercent=");
      var9.append(var3);
      var9.append(", totalDurationSeconds=");
      var9.append(var1);
      var9.append(")");
      return var9.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MediaPlayerDownloadProgress.$serializer = new MediaPlayerDownloadProgress.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.media_player.reactevents.MediaPlayerDownloadProgress", var0, 4
         );
         var1.l("id", false);
         var1.l("progressSeconds", false);
         var1.l("progressPercent", false);
         var1.l("totalDurationSeconds", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{y.a, y.a, y.a, y.a};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayerDownloadProgress {
         q.h(var1, "decoder");
         val var15: SerialDescriptor = this.getDescriptor();
         val var16: c = var1.c(var15);
         var var2: Double;
         var var4: Double;
         var var6: Double;
         var var8: Double;
         var var12: Int;
         if (var16.y()) {
            var4 = var16.A(var15, 0);
            var6 = var16.A(var15, 1);
            var2 = var16.A(var15, 2);
            var8 = var16.A(var15, 3);
            var12 = 15;
         } else {
            var8 = 0.0;
            var var13: Boolean = true;
            var12 = 0;
            var6 = 0.0;
            var4 = 0.0;
            var2 = 0.0;

            while (var13) {
               val var14: Int = var16.x(var15);
               if (var14 != -1) {
                  if (var14 != 0) {
                     if (var14 != 1) {
                        if (var14 != 2) {
                           if (var14 != 3) {
                              throw new n(var14);
                           }

                           var8 = var16.A(var15, 3);
                           var12 |= 8;
                        } else {
                           var6 = var16.A(var15, 2);
                           var12 |= 4;
                        }
                     } else {
                        var2 = var16.A(var15, 1);
                        var12 |= 2;
                     }
                  } else {
                     var4 = var16.A(var15, 0);
                     var12 |= 1;
                  }
               } else {
                  var13 = false;
               }
            }

            var2 = var6;
            var6 = var2;
         }

         var16.b(var15);
         return new MediaPlayerDownloadProgress(var12, var4, var6, var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayerDownloadProgress) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MediaPlayerDownloadProgress.write$Self$media_player_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerDownloadProgress> {
         return MediaPlayerDownloadProgress.$serializer.INSTANCE;
      }
   }
}
