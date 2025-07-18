package com.discord.media_player.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class MediaPlayerDownloadProgress(id: Double, progressSeconds: Double, progressPercent: Double, totalDurationSeconds: Double) : ReactEvent {
   public final val id: Double
   public final val progressSeconds: Double
   public final val progressPercent: Double
   public final val totalDurationSeconds: Double

   init {
      this.id = var1;
      this.progressSeconds = var3;
      this.progressPercent = var5;
      this.totalDurationSeconds = var7;
   }

   public operator fun component1(): Double {
      return this.id;
   }

   public operator fun component2(): Double {
      return this.progressSeconds;
   }

   public operator fun component3(): Double {
      return this.progressPercent;
   }

   public operator fun component4(): Double {
      return this.totalDurationSeconds;
   }

   public fun copy(
      id: Double = var0.id,
      progressSeconds: Double = var0.progressSeconds,
      progressPercent: Double = var0.progressPercent,
      totalDurationSeconds: Double = var0.totalDurationSeconds
   ): MediaPlayerDownloadProgress {
      return new MediaPlayerDownloadProgress(var1, var3, var5, var7);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayerDownloadProgress) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Double.compare(this.id, var1.id) != 0) {
            return false;
         } else if (java.lang.Double.compare(this.progressSeconds, var1.progressSeconds) != 0) {
            return false;
         } else if (java.lang.Double.compare(this.progressPercent, var1.progressPercent) != 0) {
            return false;
         } else {
            return java.lang.Double.compare(this.totalDurationSeconds, var1.totalDurationSeconds) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (java.lang.Double.hashCode(this.id) * 31 + java.lang.Double.hashCode(this.progressSeconds)) * 31
                  + java.lang.Double.hashCode(this.progressPercent)
            )
            * 31
         + java.lang.Double.hashCode(this.totalDurationSeconds);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var5: Double = this.id;
      val var7: Double = this.progressSeconds;
      val var3: Double = this.progressPercent;
      val var1: Double = this.totalDurationSeconds;
      val var9: StringBuilder = new StringBuilder();
      var9.append("MediaPlayerDownloadProgress(id=");
      var9.append(var5);
      var9.append(", progressSeconds=");
      var9.append(var7);
      var9.append(", progressPercent=");
      var9.append(var3);
      var9.append(", totalDurationSeconds=");
      var9.append(var1);
      var9.append(")");
      return var9.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayerDownloadProgress> {
         return MediaPlayerDownloadProgress.$serializer.INSTANCE;
      }
   }
}
