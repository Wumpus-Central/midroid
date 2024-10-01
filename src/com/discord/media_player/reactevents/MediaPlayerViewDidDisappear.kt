package com.discord.media_player.reactevents

import cl.f
import cl.n
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fl.b2
import fl.g0
import fl.g0.a
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
public data class MediaPlayerViewDidDisappear(channelId: String, mediaItemIds: List<String>) : ReactEvent {
   public final val channelId: String
   public final val mediaItemIds: List<String>

   init {
      q.h(var1, "channelId");
      q.h(var2, "mediaItemIds");
      super();
      this.channelId = var1;
      this.mediaItemIds = var2;
   }

   public operator fun component1(): String {
      return this.channelId;
   }

   public operator fun component2(): List<String> {
      return this.mediaItemIds;
   }

   public fun copy(channelId: String = var0.channelId, mediaItemIds: List<String> = var0.mediaItemIds): MediaPlayerViewDidDisappear {
      q.h(var1, "channelId");
      q.h(var2, "mediaItemIds");
      return new MediaPlayerViewDidDisappear(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayerViewDidDisappear) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return q.c(this.mediaItemIds, var1.mediaItemIds);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.channelId.hashCode() * 31 + this.mediaItemIds.hashCode();
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(w.a("channelId", this.channelId), w.a("mediaItemIds", NativeArrayExtensionsKt.toNativeArray(this.mediaItemIds)));
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.channelId;
      val var3: java.util.List = this.mediaItemIds;
      val var1: StringBuilder = new StringBuilder();
      var1.append("MediaPlayerViewDidDisappear(channelId=");
      var1.append(var2);
      var1.append(", mediaItemIds=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MediaPlayerViewDidDisappear.$serializer = new MediaPlayerViewDidDisappear.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.media_player.reactevents.MediaPlayerViewDidDisappear", var0, 2
         );
         var1.l("channelId", false);
         var1.l("mediaItemIds", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, MediaPlayerViewDidDisappear.access$get$childSerializers$cp()[1]};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayerViewDidDisappear {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var8: Array<KSerializer> = MediaPlayerViewDidDisappear.access$get$childSerializers$cp();
         var var2: Int;
         var var5: java.util.List;
         var var9: java.lang.String;
         if (var7.y()) {
            var9 = var7.t(var6, 0);
            var5 = var7.m(var6, 1, var8[1], null) as java.util.List;
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var5 = null;
            var9 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.m(var6, 1, var8[1], var5) as java.util.List;
                     var2 |= 2;
                  } else {
                     var9 = var7.t(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new MediaPlayerViewDidDisappear(var2, var9, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayerViewDidDisappear) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MediaPlayerViewDidDisappear.write$Self$media_player_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerViewDidDisappear> {
         return MediaPlayerViewDidDisappear.$serializer.INSTANCE;
      }
   }
}
