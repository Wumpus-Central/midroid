package com.discord.media.utils

import A9.n
import A9.q
import android.content.Context
import android.media.CamcorderProfile
import android.media.MediaFormat
import android.media.MediaMetadataRetriever
import android.net.Uri
import android.os.Build.VERSION
import java.nio.ByteBuffer
import java.util.ArrayList
import java.util.concurrent.TimeUnit
import kotlin.jvm.internal.r
import z9.s

internal class DiscordVideoMediaSource(context: Context, inputUri: Uri) : n8.a {
   public final val inputUri: Uri
   private final val srcTrackFormats: List<MediaFormat>
   private final val srcVideoFormat: MediaFormat?
   private final val srcAudioFormat: MediaFormat?
   private final val width: Int
   private final val height: Int
   private final val bitRate: Int
   private final val videoFormat: String
   private final val profile: String
   private final val level: Int
   private final val durationMs: Int
   private final val isHDRContent: Boolean
   private final val frameRate: Int
   private final val keyFrameIntervalSeconds: Float
   private final val rotationDegrees: Int
   public final val audioFormat: MediaFormat?

   init {
      r.h(var1, "context");
      r.h(var2, "inputUri");
      super(var1, var2);
      this.inputUri = var2;
      val var6: IntRange = kotlin.ranges.d.s(0, this.getTrackCount());
      val var149: ArrayList = new ArrayList(i.v(var6, 10));
      val var166: java.util.Iterator = var6.iterator();

      while (var166.hasNext()) {
         var149.add(this.getTrackFormat((var166 as n).a()));
      }

      this.srcTrackFormats = var149;
      var var7: java.util.Iterator = var149.iterator();

      var var179: java.lang.String;
      do {
         val var4: Boolean = var7.hasNext();
         var167 = null;
         if (!var4) {
            var150 = null;
            break;
         }

         var150 = var7.next();
         val var8: MediaFormat = var150 as MediaFormat;
         r.e(var150 as MediaFormat);
         var179 = MediaFormatUtilsKt.getMimeType(var8);
      } while (var179 == null || !h.I(var179, "video", false, 2, null));

      this.srcVideoFormat = var150 as MediaFormat;
      var7 = this.srcTrackFormats.iterator();

      do {
         var151 = var167;
         if (!var7.hasNext()) {
            break;
         }

         var151 = var7.next();
         val var180: MediaFormat = var151 as MediaFormat;
         r.e(var151 as MediaFormat);
         var179 = MediaFormatUtilsKt.getMimeType(var180);
      } while (var179 == null || !h.I(var179, "audio", false, 2, null));

      this.srcAudioFormat = var151 as MediaFormat;
      val var182: MediaFormat = this.srcVideoFormat;
      if (this.srcVideoFormat != null) {
         label173:
         try {
            val var153: kotlin.Result.a = Result.k;
            var152 = Result.b(var182.getInteger("width"));
         } catch (var19: java.lang.Throwable) {
            val var168: kotlin.Result.a = Result.k;
            var152 = Result.b(kotlin.c.a(var19));
            break label173;
         }

         var var169: Any = var152;
         if (Result.g(var152)) {
            var169 = 640;
         }

         this.width = (var169 as java.lang.Number).intValue();

         label167:
         try {
            var154 = Result.b(var182.getInteger("height"));
         } catch (var18: java.lang.Throwable) {
            var169 = Result.k;
            var154 = Result.b(kotlin.c.a(var18));
            break label167;
         }

         var169 = var154;
         if (Result.g(var154)) {
            var169 = 480;
         }

         this.height = (var169 as java.lang.Number).intValue();
         var169 = MediaFormatUtilsKt.getProfileName(var182);
         var var155: java.lang.String = (java.lang.String)var169;
         if (var169 == null) {
            var155 = "unknown";
         }

         this.profile = var155;
         val var156: Int = MediaFormatUtilsKt.getLevel(var182);
         var var3: Int;
         if (var156 != null) {
            var3 = var156;
         } else {
            var3 = 0;
         }

         this.level = var3;
         this.durationMs = (int)TimeUnit.MICROSECONDS.toMillis(var182.getLong("durationUs"));
         var var157: java.lang.String = MediaFormatUtilsKt.getCodecType(var182);
         if (var157 == null) {
            var157 = "unknown";
         }

         var var165: Boolean;
         label204: {
            this.videoFormat = var157;
            if (var182.containsKey("color-transfer")) {
               var165 = true;
               if (var182.getInteger("color-transfer") == 7) {
                  break label204;
               }

               var165 = true;
               if (var182.getInteger("color-transfer") == 6) {
                  break label204;
               }
            }

            if (var182.containsKey("color-standard") && var182.getInteger("color-standard") == 6) {
               var165 = true;
            } else {
               var165 = false;
            }
         }

         this.isHDRContent = var165;

         label149:
         try {
            var158 = Result.b(var182.getInteger("frame-rate"));
         } catch (var17: java.lang.Throwable) {
            var169 = Result.k;
            var158 = Result.b(kotlin.c.a(var17));
            break label149;
         }

         if (Result.e(var158) != null) {
            label144:
            try {
               var158 = Result.b((int)var182.getFloat("frame-rate"));
            } catch (var16: java.lang.Throwable) {
               val var159: kotlin.Result.a = Result.k;
               var158 = Result.b(kotlin.c.a(var16));
               break label144;
            }
         }

         var169 = var158;
         if (Result.g(var158)) {
            var169 = 30;
         }

         this.frameRate = (var169 as java.lang.Number).intValue();
         this.bitRate = q8.h.a(this, this.srcTrackFormats.indexOf(var182));

         label138:
         try {
            var161 = Result.b(var182.getFloat("i-frame-interval"));
         } catch (var15: java.lang.Throwable) {
            val var160: kotlin.Result.a = Result.k;
            var161 = Result.b(kotlin.c.a(var15));
            break label138;
         }

         if (Result.e(var161) != null) {
            label133:
            try {
               var161 = Result.b((float)var182.getInteger("i-frame-interval"));
            } catch (var14: java.lang.Throwable) {
               var169 = Result.k;
               var161 = Result.b(kotlin.c.a(var14));
               break label133;
            }
         }

         var169 = var161;
         if (Result.g(var161)) {
            var169 = 5.0F;
         }

         this.keyFrameIntervalSeconds = (var169 as java.lang.Number).floatValue();

         label1394: {
            label205: {
               try {
                  if (var182.containsKey("rotation-degrees")) {
                     var3 = var182.getInteger("rotation-degrees");
                     break label205;
                  }
               } catch (var13: java.lang.Throwable) {
                  val var141: kotlin.Result.a = Result.k;
                  var142 = Result.b(kotlin.c.a(var13));
                  break label1394;
               }

               try {
                  val var162: MediaMetadataRetriever = new MediaMetadataRetriever();
                  var162.setDataSource(var1, this.inputUri);
                  var144 = var162.extractMetadata(24);
               } catch (var12: java.lang.Throwable) {
                  val var143: kotlin.Result.a = Result.k;
                  var142 = Result.b(kotlin.c.a(var12));
                  break label1394;
               }

               if (var144 != null) {
                  try {
                     var146 = h.m(var144);
                  } catch (var11: java.lang.Throwable) {
                     val var145: kotlin.Result.a = Result.k;
                     var142 = Result.b(kotlin.c.a(var11));
                     break label1394;
                  }

                  if (var146 != null) {
                     try {
                        var3 = var146;
                        break label205;
                     } catch (var10: java.lang.Throwable) {
                        val var147: kotlin.Result.a = Result.k;
                        var142 = Result.b(kotlin.c.a(var10));
                        break label1394;
                     }
                  }
               }

               var3 = 0;
            }

            label108:
            try {
               var142 = Result.b(var3);
            } catch (var9: java.lang.Throwable) {
               val var148: kotlin.Result.a = Result.k;
               var142 = Result.b(kotlin.c.a(var9));
               break label108;
            }
         }

         var var163: Any = var142;
         if (Result.g(var142)) {
            var163 = 0;
         }

         this.rotationDegrees = (var163 as java.lang.Number).intValue();
      } else {
         this.width = 640;
         this.height = 480;
         this.frameRate = 30;
         this.bitRate = this.getAVCBitrate(640, 480, 30);
         this.keyFrameIntervalSeconds = 5.0F;
         this.videoFormat = "unknown";
         this.profile = "unknown";
         this.level = 0;
         this.durationMs = 0;
         this.isHDRContent = false;
         this.rotationDegrees = 0;
      }

      this.audioFormat = this.getAudioFormatWithBitrate(this.srcAudioFormat);
   }

   private fun getAVCBitrate(width: Int, height: Int, frameRate: Int): Int {
      var var5: Int = -1;
      var var4: Int = 0;

      while (var4 < 2) {
         var var6: Int = 0;

         var var7: Int;
         while (true) {
            var7 = var5;
            if (var6 >= 5) {
               break;
            }

            var7 = new int[]{8, 6, 5, 4, 0}[var6];
            if (CamcorderProfile.hasProfile(var4, var7)) {
               val var10: CamcorderProfile = CamcorderProfile.get(var4, var7);
               var var8: Boolean = true;
               val var14: Boolean;
               if (var1 == var10.videoFrameWidth && var2 == var10.videoFrameHeight) {
                  var14 = true;
               } else {
                  var14 = false;
               }

               if (var2 != var10.videoFrameWidth || var1 != var10.videoFrameHeight) {
                  var8 = false;
               }

               if ((var14 || var8) && var3 == var10.videoFrameRate && var10.videoCodec == 2) {
                  var7 = var5;
                  if (var5 < var10.videoBitRate) {
                     var7 = var10.videoBitRate;
                  }
                  break;
               }
            }

            var6++;
         }

         var4++;
         var5 = var7;
      }

      var var15: Int = var5;
      if (var15.intValue() == -1) {
         var15 = null;
      }

      if (var15 != null) {
         var1 = var15;
      } else {
         var1 = this.getDefaultBitrate(var1, var2, var3);
      }

      return var1;
   }

   private fun getAudioFormatWithBitrate(srcAudioFormat: MediaFormat?): MediaFormat? {
      if (var1 != null && !var1.containsKey("bitrate")) {
         if (VERSION.SDK_INT >= 29) {
            var1 = d.a(var1);
            var1.setInteger("bitrate", 256000);
         } else {
            var1.setInteger("bitrate", 256000);
         }

         return var1;
      } else {
         return null;
      }
   }

   private fun MediaFormat.getByteBufferOrNull(key: String): ByteBuffer? {
      val var3: ByteBuffer;
      if (var1.containsKey(var2)) {
         var3 = var1.getByteBuffer(var2);
      } else {
         var3 = null;
      }

      return var3;
   }

   private fun getDefaultBitrate(width: Int, height: Int, frameRate: Int): Int {
      return (int)(var1 * var2 * var3 * 0.25);
   }

   private fun MediaFormat.getIntegerOrNull(key: String): Int? {
      val var3: Int;
      if (var1.containsKey(var2)) {
         var3 = var1.getInteger(var2);
      } else {
         var3 = null;
      }

      return var3;
   }

   public fun getColorFormatSettings(): com.discord.media.utils.DiscordVideoMediaSource.ColorFormatSettings? {
      return if (this.isHDRContent && this.srcVideoFormat != null)
         new DiscordVideoMediaSource.ColorFormatSettings(
            this.getIntegerOrNull(this.srcVideoFormat, "color-transfer"),
            this.getIntegerOrNull(this.srcVideoFormat, "color-standard"),
            this.getIntegerOrNull(this.srcVideoFormat, "color-range"),
            this.getByteBufferOrNull(this.srcVideoFormat, "hdr-static-info")
         )
         else
         null;
   }

   public fun getMetadata(): Map<String, Any> {
      return q.l(
         new Pair[]{
            s.a("width", this.width),
            s.a("height", this.height),
            s.a("bitRate", this.bitRate),
            s.a("frameRate", this.frameRate),
            s.a("format", this.videoFormat),
            s.a("isHDRContent", this.isHDRContent),
            s.a("rotationDegrees", this.rotationDegrees),
            s.a("durationMs", this.durationMs),
            s.a("sourceProfile", this.profile),
            s.a("sourceLevel", this.level)
         }
      );
   }

   public data class ColorFormatSettings(colorTransfer: Int?, colorStandard: Int?, colorRange: Int?, hdrStaticInfo: ByteBuffer?) {
      public final val colorTransfer: Int?
      public final val colorStandard: Int?
      public final val colorRange: Int?
      public final val hdrStaticInfo: ByteBuffer?

      init {
         this.colorTransfer = var1;
         this.colorStandard = var2;
         this.colorRange = var3;
         this.hdrStaticInfo = var4;
      }

      public operator fun component1(): Int? {
         return this.colorTransfer;
      }

      public operator fun component2(): Int? {
         return this.colorStandard;
      }

      public operator fun component3(): Int? {
         return this.colorRange;
      }

      public operator fun component4(): ByteBuffer? {
         return this.hdrStaticInfo;
      }

      public fun copy(
         colorTransfer: Int? = var0.colorTransfer,
         colorStandard: Int? = var0.colorStandard,
         colorRange: Int? = var0.colorRange,
         hdrStaticInfo: ByteBuffer? = var0.hdrStaticInfo
      ): com.discord.media.utils.DiscordVideoMediaSource.ColorFormatSettings {
         return new DiscordVideoMediaSource.ColorFormatSettings(var1, var2, var3, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is DiscordVideoMediaSource.ColorFormatSettings) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.colorTransfer, var1.colorTransfer)) {
               return false;
            } else if (!r.c(this.colorStandard, var1.colorStandard)) {
               return false;
            } else if (!r.c(this.colorRange, var1.colorRange)) {
               return false;
            } else {
               return r.c(this.hdrStaticInfo, var1.hdrStaticInfo);
            }
         }
      }

      public override fun hashCode(): Int {
         var var4: Int = 0;
         val var1: Int;
         if (this.colorTransfer == null) {
            var1 = 0;
         } else {
            var1 = this.colorTransfer.hashCode();
         }

         val var2: Int;
         if (this.colorStandard == null) {
            var2 = 0;
         } else {
            var2 = this.colorStandard.hashCode();
         }

         val var3: Int;
         if (this.colorRange == null) {
            var3 = 0;
         } else {
            var3 = this.colorRange.hashCode();
         }

         if (this.hdrStaticInfo != null) {
            var4 = this.hdrStaticInfo.hashCode();
         }

         return ((var1 * 31 + var2) * 31 + var3) * 31 + var4;
      }

      public override fun toString(): String {
         val var2: Int = this.colorTransfer;
         val var1: Int = this.colorStandard;
         val var4: Int = this.colorRange;
         val var3: ByteBuffer = this.hdrStaticInfo;
         val var5: StringBuilder = new StringBuilder();
         var5.append("ColorFormatSettings(colorTransfer=");
         var5.append(var2);
         var5.append(", colorStandard=");
         var5.append(var1);
         var5.append(", colorRange=");
         var5.append(var4);
         var5.append(", hdrStaticInfo=");
         var5.append(var3);
         var5.append(")");
         return var5.toString();
      }
   }

   private companion object {
      public const val DEFAULT_WIDTH: Int
      public const val DEFAULT_HEIGHT: Int
      public const val DEFAULT_FRAME_RATE: Int
      public const val DEFAULT_KEY_FRAME_INTERVAL_SECONDS: Float
   }
}
