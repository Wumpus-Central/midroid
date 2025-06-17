package com.discord.media_player.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kb.f
import kb.j
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import r9.s
import rb.a

@f
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
         return q.c(this.source, (var1 as MediaPlayerPlaybackSourceChanged).source);
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

   public override fun serialize(): WritableMap {
      return if (this.source == null)
         NativeMapExtensionsKt.toNativeMap(s9.q.h())
         else
         NativeMapExtensionsKt.nativeMapOf(s.a("source", NativeMapExtensionsKt.toNativeMap(a.b.e(j.b(MediaPlayerPlaybackSource.class), this.source))));
   }

   public override fun toString(): String {
      val var2: MediaPlayerPlaybackSource = this.source;
      val var1: StringBuilder = new StringBuilder();
      var1.append("MediaPlayerPlaybackSourceChanged(source=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerPlaybackSourceChanged> {
         return MediaPlayerPlaybackSourceChanged.$serializer.INSTANCE;
      }
   }
}
