package com.discord.media_player.reactevents

import bl.g0
import bl.h
import bl.y
import bl.g0.a
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
import yk.f
import yk.n

@f
public data class MediaPlayerMuteStateChanged(id: Double, isMuted: Boolean) : ReactEvent {
   public final val id: Double
   public final val isMuted: Boolean

   init {
      this.id = var1;
      this.isMuted = var3;
   }

   public operator fun component1(): Double {
      return this.id;
   }

   public operator fun component2(): Boolean {
      return this.isMuted;
   }

   public fun copy(id: Double = var0.id, isMuted: Boolean = var0.isMuted): MediaPlayerMuteStateChanged {
      return new MediaPlayerMuteStateChanged(var1, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayerMuteStateChanged) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Double.compare(this.id, var1.id) != 0) {
            return false;
         } else {
            return this.isMuted == var1.isMuted;
         }
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Double.hashCode(this.id) * 31 + java.lang.Boolean.hashCode(this.isMuted);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Double = this.id;
      val var3: Boolean = this.isMuted;
      val var4: StringBuilder = new StringBuilder();
      var4.append("MediaPlayerMuteStateChanged(id=");
      var4.append(var1);
      var4.append(", isMuted=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MediaPlayerMuteStateChanged.$serializer = new MediaPlayerMuteStateChanged.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.media_player.reactevents.MediaPlayerMuteStateChanged", var0, 2
         );
         var1.l("id", false);
         var1.l("isMuted", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{y.a, h.a};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayerMuteStateChanged {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         var var2: Double;
         var var4: Int;
         var var7: Boolean;
         if (var9.y()) {
            var2 = var9.A(var8, 0);
            var7 = var9.s(var8, 1);
            var4 = 3;
         } else {
            var var5: Boolean = true;
            var7 = false;
            var2 = 0.0;
            var4 = 0;

            while (var5) {
               val var6: Int = var9.x(var8);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        throw new n(var6);
                     }

                     var7 = var9.s(var8, 1);
                     var4 |= 2;
                  } else {
                     var2 = var9.A(var8, 0);
                     var4 |= 1;
                  }
               } else {
                  var5 = false;
               }
            }
         }

         var9.b(var8);
         return new MediaPlayerMuteStateChanged(var4, var2, var7, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayerMuteStateChanged) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MediaPlayerMuteStateChanged.write$Self$media_player_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerMuteStateChanged> {
         return MediaPlayerMuteStateChanged.$serializer.INSTANCE;
      }
   }
}
