package com.discord.media.utils

import android.content.Context
import android.media.CamcorderProfile
import android.media.MediaFormat
import android.net.Uri
import android.os.Build.VERSION
import java.util.ArrayList
import kh.r
import kh.s
import kh.w
import kotlin.jvm.internal.q
import lh.o

internal class DiscordVideoMediaSource(context: Context, inputUri: Uri, outputUri: Uri, compressionQuality: VideoCompressionQuality) : pf.a {
   public final val inputUri: Uri
   public final val outputUri: Uri
   private final val srcTrackFormats: List<MediaFormat>
   private final val srcVideoFormat: MediaFormat?
   private final val srcAudioFormat: MediaFormat?
   private final val estimatedVideoBitrate: Int
   private final val rawWidth: Int
   private final val rawHeight: Int
   private final val rawBitrate: Int
   private final val rawVideoFormat: String
   private final val width: Int
   private final val height: Int
   private final val frameRate: Int
   private final val bitRate: Int
   private final val iFrameInterval: Float
   public final val videoFormat: MediaFormat
   public final val audioFormat: MediaFormat?

   init {
      q.h(var1, "context");
      q.h(var2, "inputUri");
      q.h(var3, "outputUri");
      q.h(var4, "compressionQuality");
      super(var1, var2);
      this.inputUri = var2;
      this.outputUri = var3;
      val var83: IntRange = f.r(0, this.getTrackCount());
      val var67: ArrayList = new ArrayList(i.v(var83, 10));
      val var84: java.util.Iterator = var83.iterator();

      while (var84.hasNext()) {
         var67.add(this.getTrackFormat((var84 as o).c()));
      }

      this.srcTrackFormats = var67;
      val var92: java.util.Iterator = var67.iterator();

      var var95: java.lang.String;
      do {
         val var9: Boolean = var92.hasNext();
         var85 = null;
         if (!var9) {
            var68 = null;
            break;
         }

         var68 = var92.next();
         val var10: MediaFormat = var68 as MediaFormat;
         q.e(var68 as MediaFormat);
         var95 = MediaFormatUtilsKt.getMimeType(var10);
      } while (var95 == null || !h.H(var95, "video", false, 2, null));

      this.srcVideoFormat = var68 as MediaFormat;
      val var93: java.util.Iterator = this.srcTrackFormats.iterator();

      do {
         var69 = var85;
         if (!var93.hasNext()) {
            break;
         }

         var69 = var93.next();
         val var96: MediaFormat = var69 as MediaFormat;
         q.e(var69 as MediaFormat);
         var95 = MediaFormatUtilsKt.getMimeType(var96);
      } while (var95 == null || !h.H(var95, "audio", false, 2, null));

      this.srcAudioFormat = var69 as MediaFormat;
      this.estimatedVideoBitrate = sf.h.a(this, i.j0(this.srcTrackFormats, this.srcVideoFormat));
      val var98: MediaFormat = this.srcVideoFormat;
      if (this.srcVideoFormat != null) {
         label141:
         try {
            val var72: kh.r.a = r.k;
            var71 = r.b(var98.getInteger("width"));
         } catch (var17: java.lang.Throwable) {
            val var70: kh.r.a = r.k;
            var71 = r.b(s.a(var17));
            break label141;
         }

         var var86: Any = var71;
         if (r.g(var71)) {
            var86 = 640;
         }

         this.rawWidth = (var86 as java.lang.Number).intValue();

         label135:
         try {
            var74 = r.b(var98.getInteger("height"));
         } catch (var16: java.lang.Throwable) {
            val var73: kh.r.a = r.k;
            var74 = r.b(s.a(var16));
            break label135;
         }

         var86 = var74;
         if (r.g(var74)) {
            var86 = 480;
         }

         this.rawHeight = (var86 as java.lang.Number).intValue();
         var var75: java.lang.String = MediaFormatUtilsKt.getCodecType(var98);
         if (var75 == null) {
            var75 = "unknown";
         }

         this.rawVideoFormat = var75;

         label128:
         try {
            var77 = r.b(var98.getInteger("frame-rate"));
         } catch (var15: java.lang.Throwable) {
            val var76: kh.r.a = r.k;
            var77 = r.b(s.a(var15));
            break label128;
         }

         if (r.e(var77) != null) {
            label123:
            try {
               var77 = r.b((int)var98.getFloat("frame-rate"));
            } catch (var14: java.lang.Throwable) {
               val var78: kh.r.a = r.k;
               var77 = r.b(s.a(var14));
               break label123;
            }
         }

         var86 = var77;
         if (r.g(var77)) {
            var86 = 30;
         }

         this.frameRate = (var86 as java.lang.Number).intValue();

         label117:
         try {
            var80 = r.b(var98.getInteger("bitrate"));
         } catch (var13: java.lang.Throwable) {
            val var79: kh.r.a = r.k;
            var80 = r.b(s.a(var13));
            break label117;
         }

         if (r.e(var80) != null) {
            var80 = this.getAVCBitrate(this.rawWidth, this.rawHeight, this.frameRate);
         }

         this.rawBitrate = (var80 as java.lang.Number).intValue();

         label111:
         try {
            var81 = r.b(var98.getFloat("i-frame-interval"));
         } catch (var12: java.lang.Throwable) {
            var86 = r.k;
            var81 = r.b(s.a(var12));
            break label111;
         }

         if (r.e(var81) != null) {
            label106:
            try {
               var81 = r.b((float)var98.getInteger("i-frame-interval"));
            } catch (var11: java.lang.Throwable) {
               var86 = r.k;
               var81 = r.b(s.a(var11));
               break label106;
            }
         }

         var86 = var81;
         if (r.g(var81)) {
            var86 = 5.0F;
         }

         this.iFrameInterval = (var86 as java.lang.Number).floatValue();
      } else {
         this.rawWidth = 640;
         this.rawHeight = 480;
         this.frameRate = 30;
         this.rawBitrate = this.getAVCBitrate(640, 480, 30);
         this.iFrameInterval = 5.0F;
         this.rawVideoFormat = "unknown";
      }

      var var5: Float = Math.max((float)var4.getTargetResolution() / (float)this.rawWidth, (float)var4.getTargetResolution() / (float)this.rawHeight);
      if (!(var5 < 1.0F)) {
         var5 = 1.0F;
      }

      var var6: Int = zh.a.b((float)this.rawWidth * var5);
      if (var6 % 2 != 0) {
         var6++;
      }

      this.width = var6;
      var var7: Int = zh.a.b(var5 * (float)this.rawHeight);
      if (var7 % 2 != 0) {
         var7++;
      }

      this.height = var7;
      var var8: Int = Math.max((int)((double)Math.min(this.estimatedVideoBitrate, this.rawBitrate) * 0.75), 300000);
      if (var4.getTargetBitrate() <= var8) {
         var8 = var4.getTargetBitrate();
      }

      this.bitRate = var8;
      if (var6 % 2 == 0 && var7 % 2 == 0) {
         val var82: MediaFormat = new MediaFormat();
         var82.setString("mime", "video/avc");
         var82.setInteger("width", var6);
         var82.setInteger("height", var7);
         var82.setInteger("bitrate", var8);
         var82.setInteger("frame-rate", this.frameRate);
         if (VERSION.SDK_INT >= 25) {
            var82.setFloat("i-frame-interval", this.iFrameInterval);
         } else {
            var82.setInteger("i-frame-interval", (int)this.iFrameInterval);
         }

         this.videoFormat = var82;
         this.audioFormat = this.getAudioFormatWithBitrate(this.srcAudioFormat);
      } else {
         throw new IllegalArgumentException(
            "MediaCodec fails if width/height are not a multiple of the alignment; see MediaCodecInfo.VideoCapabilities.getWidthAlignment()".toString()
         );
      }
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
            var1 = b.a(var1);
            var1.setInteger("bitrate", 256000);
         } else {
            var1.setInteger("bitrate", 256000);
         }

         return var1;
      } else {
         return null;
      }
   }

   private fun getDefaultBitrate(width: Int, height: Int, frameRate: Int): Int {
      return (int)(var1 * var2 * var3 * 0.25);
   }

   public fun getMetadata(): Map<String, Any> {
      return lh.r.l(
         new Pair[]{
            w.a("width", this.rawWidth),
            w.a("height", this.rawHeight),
            w.a("bitrate", this.rawBitrate),
            w.a("framerate", this.frameRate),
            w.a("format", this.rawVideoFormat)
         }
      );
   }

   public fun isHevc(): Boolean {
      var var1: Boolean = false;
      if (this.srcVideoFormat != null) {
         var1 = false;
         if (MediaFormatUtilsKt.isHevcVideo(this.srcVideoFormat)) {
            var1 = true;
         }
      }

      return var1;
   }

   private companion object {
      public const val DEFAULT_FRAMERATE: Int
      public const val DEFAULT_HEIGHT: Int
      public const val DEFAULT_IFRAME: Float
      public const val DEFAULT_WIDTH: Int
   }
}
