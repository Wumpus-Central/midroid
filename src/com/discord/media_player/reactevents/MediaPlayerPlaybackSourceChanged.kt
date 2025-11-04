package com.discord.media_player.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import ev.a
import ht.v
import kotlinx.serialization.KSerializer
import xu.m
import xu.w

@m
public data class MediaPlayerPlaybackSourceChanged(source: MediaPlayerPlaybackSource?) : ReactEvent {
   public final val source: MediaPlayerPlaybackSource?

   init {
      super();
      this.source = var1;
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
         return this.source == (var1 as MediaPlayerPlaybackSourceChanged).source;
      }
   }

   public override fun hashCode(): Int {
      return if (this.source == null) 0 else this.source.hashCode();
   }

   public override fun serialize(): WritableMap {
      return if (this.source == null)
         NativeMapExtensionsKt.toNativeMap(s0.i())
         else
         NativeMapExtensionsKt.nativeMapOf(v.a("source", NativeMapExtensionsKt.toNativeMap(a.b.e(w.d(MediaPlayerPlaybackSource.class), this.source))));
   }

   public override fun toString(): String {
      val var1: MediaPlayerPlaybackSource = this.source;
      val var2: StringBuilder = new StringBuilder();
      var2.append("MediaPlayerPlaybackSourceChanged(source=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerPlaybackSourceChanged> {
         return MediaPlayerPlaybackSourceChanged.$serializer.INSTANCE;
      }
   }
}
