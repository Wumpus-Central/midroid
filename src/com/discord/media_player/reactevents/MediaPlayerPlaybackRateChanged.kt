package com.discord.media_player.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g
import sb.k
import z9.s
import zb.a

@g
public data class MediaPlayerPlaybackRateChanged(source: MediaPlayerPlaybackSource?, rate: Double) : ReactEvent {
   public final val source: MediaPlayerPlaybackSource?
   public final val rate: Double

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
         if (!r.c(this.source, var1.source)) {
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

   public override fun serialize(): WritableMap {
      val var1: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf(s.a("rate", this.rate));
      if (this.source != null) {
         var1.putMap("source", NativeMapExtensionsKt.toNativeMap(a.b.e(k.b(MediaPlayerPlaybackSource.class), this.source)));
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

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerPlaybackRateChanged> {
         return MediaPlayerPlaybackRateChanged.$serializer.INSTANCE;
      }
   }
}
