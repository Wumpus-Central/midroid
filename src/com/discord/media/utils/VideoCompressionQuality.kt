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
   public final val value: String
   public final val targetResolution: Int
   public final val targetBitrate: Int
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
      $ENTRIES = z9.a.a(var0);
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
         val var3: java.util.Iterator = VideoCompressionQuality.getEntries().iterator();

         while (true) {
            if (var3.hasNext()) {
               val var2: Any = var3.next();
               if (!q.c((var2 as VideoCompressionQuality).getValue(), var1)) {
                  continue;
               }

               var4 = var2;
               break;
            }

            var4 = null;
            break;
         }

         val var6: VideoCompressionQuality = var4 as VideoCompressionQuality;
         var var5: VideoCompressionQuality = var4 as VideoCompressionQuality;
         if (var6 == null) {
            var5 = VideoCompressionQuality.None;
         }

         return var5;
      }
   }
}
