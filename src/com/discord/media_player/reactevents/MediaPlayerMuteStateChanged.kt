package com.discord.media_player.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import tp.m

@m
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

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerMuteStateChanged> {
         return MediaPlayerMuteStateChanged.$serializer.INSTANCE;
      }
   }
}
