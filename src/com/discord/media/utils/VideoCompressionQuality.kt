package com.discord.media.utils

import kotlin.enums.EnumEntries
import kotlin.jvm.internal.SourceDebugExtension

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
      $ENTRIES = pt.a.a(var0);
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

   @SourceDebugExtension(["SMAP\nVideoCompressionQuality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoCompressionQuality.kt\ncom/discord/media/utils/VideoCompressionQuality$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n295#2,2:23\n*S KotlinDebug\n*F\n+ 1 VideoCompressionQuality.kt\ncom/discord/media/utils/VideoCompressionQuality$Companion\n*L\n19#1:23,2\n*E\n"])
   public companion object {
      public fun fromString(value: String?): VideoCompressionQuality {
         val var3: java.util.Iterator = VideoCompressionQuality.getEntries().iterator();

         while (true) {
            if (var3.hasNext()) {
               val var2: Any = var3.next();
               if (!((var2 as VideoCompressionQuality).getValue() == var1)) {
                  continue;
               }

               var4 = var2;
               break;
            }

            var4 = null;
            break;
         }

         return if (var4 as VideoCompressionQuality == null) VideoCompressionQuality.None else var4 as VideoCompressionQuality;
      }
   }
}
