package com.discord.media_player.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import kb.f
import kb.j
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import r9.s
import rb.a

@f
public data class MediaPlayerPlaybackProgressUpdated(source: MediaPlayerPlaybackSource?, time: Long, duration: Long) : ReactEvent {
   public final val source: MediaPlayerPlaybackSource?
   public final val time: Long
   public final val duration: Long

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
      val var1: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf(s.a("time", this.time), s.a("duration", this.duration));
      if (this.source != null) {
         var1.putMap("source", NativeMapExtensionsKt.toNativeMap(a.b.e(j.b(MediaPlayerPlaybackSource.class), this.source)));
      }

      return var1;
   }

   public override fun toString(): String {
      val var5: MediaPlayerPlaybackSource = this.source;
      val var3: Long = this.time;
      val var1: Long = this.duration;
      val var6: StringBuilder = new StringBuilder();
      var6.append("MediaPlayerPlaybackProgressUpdated(source=");
      var6.append(var5);
      var6.append(", time=");
      var6.append(var3);
      var6.append(", duration=");
      var6.append(var1);
      var6.append(")");
      return var6.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerPlaybackProgressUpdated> {
         return MediaPlayerPlaybackProgressUpdated.$serializer.INSTANCE;
      }
   }
}
