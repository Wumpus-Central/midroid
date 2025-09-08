package com.discord.media_player.reactevents

import A9.s
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.g

@g
public data class MediaPlayerViewWillAppear(channelId: String, mediaItemIds: List<String>) : ReactEvent {
   public final val channelId: String
   public final val mediaItemIds: List<String>

   init {
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

   public fun copy(channelId: String = var0.channelId, mediaItemIds: List<String> = var0.mediaItemIds): MediaPlayerViewWillAppear {
      return new MediaPlayerViewWillAppear(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayerViewWillAppear) {
         return false;
      } else {
         var1 = var1;
         if (!(this.channelId == var1.channelId)) {
            return false;
         } else {
            return this.mediaItemIds == var1.mediaItemIds;
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
      val var1: java.util.List = this.mediaItemIds;
      val var3: StringBuilder = new StringBuilder();
      var3.append("MediaPlayerViewWillAppear(channelId=");
      var3.append(var2);
      var3.append(", mediaItemIds=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerViewWillAppear> {
         return MediaPlayerViewWillAppear.$serializer.INSTANCE;
      }
   }
}
