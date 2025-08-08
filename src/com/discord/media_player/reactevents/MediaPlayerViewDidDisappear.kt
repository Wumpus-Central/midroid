package com.discord.media_player.reactevents

import A9.s
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
public data class MediaPlayerViewDidDisappear(channelId: String, mediaItemIds: List<String>) : ReactEvent {
   public final val channelId: String
   public final val mediaItemIds: List<String>

   init {
      r.h(var1, "channelId");
      r.h(var2, "mediaItemIds");
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
      r.h(var1, "channelId");
      r.h(var2, "mediaItemIds");
      return new MediaPlayerViewDidDisappear(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayerViewDidDisappear) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return r.c(this.mediaItemIds, var1.mediaItemIds);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.channelId.hashCode() * 31 + this.mediaItemIds.hashCode();
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(
         s.a("channelId", this.channelId), s.a("mediaItemIds", NativeArrayExtensionsKt.toNativeArray$default(this.mediaItemIds, null, 1, null))
      );
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

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerViewDidDisappear> {
         return MediaPlayerViewDidDisappear.$serializer.INSTANCE;
      }
   }
}
