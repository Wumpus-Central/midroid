package com.discord.media_player.reactevents

import Xa.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@f
public data class MediaPlayerPause(id: Double, paused: Boolean) : ReactEvent {
   public final val id: Double
   public final val paused: Boolean

   init {
      this.id = var1;
      this.paused = var3;
   }

   public operator fun component1(): Double {
      return this.id;
   }

   public operator fun component2(): Boolean {
      return this.paused;
   }

   public fun copy(id: Double = var0.id, paused: Boolean = var0.paused): MediaPlayerPause {
      return new MediaPlayerPause(var1, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayerPause) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Double.compare(this.id, var1.id) != 0) {
            return false;
         } else {
            return this.paused == var1.paused;
         }
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Double.hashCode(this.id) * 31 + java.lang.Boolean.hashCode(this.paused);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Double = this.id;
      val var3: Boolean = this.paused;
      val var4: StringBuilder = new StringBuilder();
      var4.append("MediaPlayerPause(id=");
      var4.append(var1);
      var4.append(", paused=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerPause> {
         return MediaPlayerPause.$serializer.INSTANCE;
      }
   }
}
