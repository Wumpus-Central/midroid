package com.discord.media.utils

import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q

public enum class VideoCompressionQuality(value: String, targetResolution: Int, targetBitrate: Int) {
   High("high", 720, 2500000),
   Low("low", 360, 1200000),
   Medium("medium", 480, 2000000),
   None("none", 480, 3000000),
   Original("original", Integer.MAX_VALUE, Integer.MAX_VALUE),
   VeryHigh("very_high", 1080, 7000000),
   VeryLow("very_low", 360, 800000)
   public final val targetBitrate: Int
   public final val targetResolution: Int
   public final val value: String
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private VideoCompressionQuality[] $VALUES;
   @JvmStatic
   public VideoCompressionQuality.Companion Companion = new VideoCompressionQuality.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<VideoCompressionQuality> = $values();
      $VALUES = var0;
      $ENTRIES = jh.a.a(var0);
   }

   init {
      this.value = var3;
      this.targetResolution = var4;
      this.targetBitrate = var5;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun fromString(value: String?): VideoCompressionQuality {
         val var5: Array<VideoCompressionQuality> = VideoCompressionQuality.values();
         val var3: Int = var5.length;
         var var2: Int = 0;

         while (true) {
            if (var2 >= var3) {
               var6 = null;
               break;
            }

            val var4: VideoCompressionQuality = var5[var2];
            if (q.c(var5[var2].getValue(), var1)) {
               var6 = var4;
               break;
            }

            var2++;
         }

         var var7: VideoCompressionQuality = var6;
         if (var6 == null) {
            var7 = VideoCompressionQuality.None;
         }

         return var7;
      }
   }
}
