package com.discord.media_player.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import tp.m

@m
public data class MediaPlayerProgress(id: Double, time: Double, duration: Double) : ReactEvent {
   public final val id: Double
   public final val time: Double
   public final val duration: Double

   init {
      this.id = var1;
      this.time = var3;
      this.duration = var5;
   }

   public operator fun component1(): Double {
      return this.id;
   }

   public operator fun component2(): Double {
      return this.time;
   }

   public operator fun component3(): Double {
      return this.duration;
   }

   public fun copy(id: Double = var0.id, time: Double = var0.time, duration: Double = var0.duration): MediaPlayerProgress {
      return new MediaPlayerProgress(var1, var3, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayerProgress) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Double.compare(this.id, var1.id) != 0) {
            return false;
         } else if (java.lang.Double.compare(this.time, var1.time) != 0) {
            return false;
         } else {
            return java.lang.Double.compare(this.duration, var1.duration) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      return (java.lang.Double.hashCode(this.id) * 31 + java.lang.Double.hashCode(this.time)) * 31 + java.lang.Double.hashCode(this.duration);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Double = this.id;
      val var3: Double = this.time;
      val var5: Double = this.duration;
      val var7: StringBuilder = new StringBuilder();
      var7.append("MediaPlayerProgress(id=");
      var7.append(var1);
      var7.append(", time=");
      var7.append(var3);
      var7.append(", duration=");
      var7.append(var5);
      var7.append(")");
      return var7.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerProgress> {
         return MediaPlayerProgress.$serializer.INSTANCE;
      }
   }
}
