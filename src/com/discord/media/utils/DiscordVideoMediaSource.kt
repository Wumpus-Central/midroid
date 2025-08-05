package com.discord.media.utils

import A9.s
import B9.n
import B9.q
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

internal class DiscordVideoMediaSource(context: Context, inputUri: Uri) : o8.a {
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
      val var144: ArrayList = new ArrayList(i.v(var6, 10));
      val var167: java.util.Iterator = var6.iterator();

      while (var167.hasNext()) {
         var144.add(this.getTrackFormat((var167 as n).a()));
      }

      this.srcTrackFormats = var144;
      var var7: java.util.Iterator = var144.iterator();

      var var179: java.lang.String;
      do {
         val var4: Boolean = var7.hasNext();
         var168 = null;
         if (!var4) {
            var145 = null;
            break;
         }

         var145 = var7.next();
         val var8: MediaFormat = var145 as MediaFormat;
         r.e(var145 as MediaFormat);
         var179 = MediaFormatUtilsKt.getMimeType(var8);
      } while (var179 == null || !h.I(var179, "video", false, 2, null));

      this.srcVideoFormat = var145 as MediaFormat;
      var7 = this.srcTrackFormats.iterator();

      do {
         var146 = var168;
         if (!var7.hasNext()) {
            break;
         }

         var146 = var7.next();
         val var180: MediaFormat = var146 as MediaFormat;
         r.e(var146 as MediaFormat);
         var179 = MediaFormatUtilsKt.getMimeType(var180);
      } while (var179 == null || !h.I(var179, "audio", false, 2, null));

      this.srcAudioFormat = var146 as MediaFormat;
      val var182: MediaFormat = this.srcVideoFormat;
      if (this.srcVideoFormat != null) {
         label173:
         try {
            val var148: kotlin.Result.a = Result.k;
            var147 = Result.b(var182.getInteger("width"));
         } catch (var19: java.lang.Throwable) {
            val var169: kotlin.Result.a = Result.k;
            var147 = Result.b(kotlin.c.a(var19));
            break label173;
         }

         var var170: Any = var147;
         if (Result.g(var147)) {
            var170 = 640;
         }

         this.width = (var170 as java.lang.Number).intValue();

         label167:
         try {
            var150 = Result.b(var182.getInteger("height"));
         } catch (var18: java.lang.Throwable) {
            val var149: kotlin.Result.a = Result.k;
            var150 = Result.b(kotlin.c.a(var18));
            break label167;
         }

         var170 = var150;
         if (Result.g(var150)) {
            var170 = 480;
         }

         this.height = (var170 as java.lang.Number).intValue();
         var170 = MediaFormatUtilsKt.getProfileName(var182);
         var var151: java.lang.String = (java.lang.String)var170;
         if (var170 == null) {
            var151 = "unknown";
         }

         this.profile = var151;
         val var152: Int = MediaFormatUtilsKt.getLevel(var182);
         var var3: Int;
         if (var152 != null) {
            var3 = var152;
         } else {
            var3 = 0;
         }

         this.level = var3;
         this.durationMs = (int)TimeUnit.MICROSECONDS.toMillis(var182.getLong("durationUs"));
         var var153: java.lang.String = MediaFormatUtilsKt.getCodecType(var182);
         if (var153 == null) {
            var153 = "unknown";
         }

         var var166: Boolean;
         label204: {
            this.videoFormat = var153;
            if (var182.containsKey("color-transfer")) {
               var166 = true;
               if (var182.getInteger("color-transfer") == 7) {
                  break label204;
               }

               var166 = true;
               if (var182.getInteger("color-transfer") == 6) {
                  break label204;
               }
            }

            if (var182.containsKey("color-standard") && var182.getInteger("color-standard") == 6) {
               var166 = true;
            } else {
               var166 = false;
            }
         }

         this.isHDRContent = var166;

         label149:
         try {
            var155 = Result.b(var182.getInteger("frame-rate"));
         } catch (var17: java.lang.Throwable) {
            val var154: kotlin.Result.a = Result.k;
            var155 = Result.b(kotlin.c.a(var17));
            break label149;
         }

         if (Result.e(var155) != null) {
            label144:
            try {
               var155 = Result.b((int)var182.getFloat("frame-rate"));
            } catch (var16: java.lang.Throwable) {
               var170 = Result.k;
               var155 = Result.b(kotlin.c.a(var16));
               break label144;
            }
         }

         var170 = var155;
         if (Result.g(var155)) {
            var170 = 30;
         }

         this.frameRate = (var170 as java.lang.Number).intValue();
         this.bitRate = r8.h.a(this, this.srcTrackFormats.indexOf(var182));

         label138:
         try {
            var157 = Result.b(var182.getFloat("i-frame-interval"));
         } catch (var15: java.lang.Throwable) {
            val var156: kotlin.Result.a = Result.k;
            var157 = Result.b(kotlin.c.a(var15));
            break label138;
         }

         if (Result.e(var157) != null) {
            label133:
            try {
               var157 = Result.b((float)var182.getInteger("i-frame-interval"));
            } catch (var14: java.lang.Throwable) {
               var170 = Result.k;
               var157 = Result.b(kotlin.c.a(var14));
               break label133;
            }
         }

         var170 = var157;
         if (Result.g(var157)) {
            var170 = 5.0F;
         }

         this.keyFrameIntervalSeconds = (var170 as java.lang.Number).floatValue();

         label1394: {
            label205: {
               try {
                  if (var182.containsKey("rotation-degrees")) {
                     var3 = var182.getInteger("rotation-degrees");
                     break label205;
                  }
               } catch (var13: java.lang.Throwable) {
                  val var158: kotlin.Result.a = Result.k;
                  var141 = Result.b(kotlin.c.a(var13));
                  break label1394;
               }

               try {
                  val var160: MediaMetadataRetriever = new MediaMetadataRetriever();
                  var160.setDataSource(var1, this.inputUri);
                  var142 = var160.extractMetadata(24);
               } catch (var12: java.lang.Throwable) {
                  val var159: kotlin.Result.a = Result.k;
                  var141 = Result.b(kotlin.c.a(var12));
                  break label1394;
               }

               if (var142 != null) {
                  try {
                     var143 = h.m(var142);
                  } catch (var11: java.lang.Throwable) {
                     val var161: kotlin.Result.a = Result.k;
                     var141 = Result.b(kotlin.c.a(var11));
                     break label1394;
                  }

                  if (var143 != null) {
                     try {
                        var3 = var143;
                        break label205;
                     } catch (var10: java.lang.Throwable) {
                        val var162: kotlin.Result.a = Result.k;
                        var141 = Result.b(kotlin.c.a(var10));
                        break label1394;
                     }
                  }
               }

               var3 = 0;
            }

            label108:
            try {
               var141 = Result.b(var3);
            } catch (var9: java.lang.Throwable) {
               val var163: kotlin.Result.a = Result.k;
               var141 = Result.b(kotlin.c.a(var9));
               break label108;
            }
         }

         var var164: Any = var141;
         if (Result.g(var141)) {
            var164 = 0;
         }

         this.rotationDegrees = (var164 as java.lang.Number).intValue();
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
      var var4: Int = -1;
      var var5: Int = 0;

      while (var5 < 2) {
         var var6: Int = 0;

         var var7: Int;
         while (true) {
            var7 = var4;
            if (var6 >= 5) {
               break;
            }

            var7 = new int[]{8, 6, 5, 4, 0}[var6];
            if (CamcorderProfile.hasProfile(var5, var7)) {
               val var10: CamcorderProfile = CamcorderProfile.get(var5, var7);
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
                  var7 = var4;
                  if (var4 < var10.videoBitRate) {
                     var7 = var10.videoBitRate;
                  }
                  break;
               }
            }

            var6++;
         }

         var5++;
         var4 = var7;
      }

      var var15: Int = var4;
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
         val var3: Int = this.colorTransfer;
         val var1: Int = this.colorStandard;
         val var2: Int = this.colorRange;
         val var5: ByteBuffer = this.hdrStaticInfo;
         val var4: StringBuilder = new StringBuilder();
         var4.append("ColorFormatSettings(colorTransfer=");
         var4.append(var3);
         var4.append(", colorStandard=");
         var4.append(var1);
         var4.append(", colorRange=");
         var4.append(var2);
         var4.append(", hdrStaticInfo=");
         var4.append(var5);
         var4.append(")");
         return var4.toString();
      }
   }

   private companion object {
      public const val DEFAULT_WIDTH: Int
      public const val DEFAULT_HEIGHT: Int
      public const val DEFAULT_FRAME_RATE: Int
      public const val DEFAULT_KEY_FRAME_INTERVAL_SECONDS: Float
   }
}
