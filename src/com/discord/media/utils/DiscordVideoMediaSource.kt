package com.discord.media.utils

import android.content.Context
import android.media.CamcorderProfile
import android.media.MediaFormat
import android.net.Uri
import android.os.Build.VERSION
import eh.s
import eh.w
import fh.p
import java.util.ArrayList
import kotlin.jvm.internal.r
import vh.h

internal class DiscordVideoMediaSource(context: Context, inputUri: Uri, outputUri: Uri, compressionQuality: VideoCompressionQuality) : df.a {
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
      r.h(var1, "context");
      r.h(var2, "inputUri");
      r.h(var3, "outputUri");
      r.h(var4, "compressionQuality");
      super(var1, var2);
      this.inputUri = var2;
      this.outputUri = var3;
      val var84: IntRange = h.r(0, this.getTrackCount());
      val var69: ArrayList = new ArrayList(kotlin.collections.h.t(var84, 10));
      val var85: java.util.Iterator = var84.iterator();

      while (var85.hasNext()) {
         var69.add(this.getTrackFormat((var85 as p).nextInt()));
      }

      this.srcTrackFormats = var69;
      val var94: java.util.Iterator = var69.iterator();

      var var97: Boolean;
      do {
         val var11: Boolean = var94.hasNext();
         var86 = null;
         if (!var11) {
            var70 = null;
            break;
         }

         var70 = var94.next();
         val var12: MediaFormat = var70 as MediaFormat;
         r.g(var70 as MediaFormat, "it");
         val var100: java.lang.String = MediaFormatUtilsKt.getMimeType(var12);
         if (var100 != null && f.I(var100, "video", false, 2, null)) {
            var97 = 1;
         } else {
            var97 = 0;
         }
      } while (!var97);

      this.srcVideoFormat = var70 as MediaFormat;
      val var95: java.util.Iterator = this.srcTrackFormats.iterator();

      do {
         var71 = var86;
         if (!var95.hasNext()) {
            break;
         }

         var71 = var95.next();
         val var101: MediaFormat = var71 as MediaFormat;
         r.g(var71 as MediaFormat, "it");
         val var102: java.lang.String = MediaFormatUtilsKt.getMimeType(var101);
         if (var102 != null && f.I(var102, "audio", false, 2, null)) {
            var97 = (boolean)1;
         } else {
            var97 = (boolean)0;
         }
      } while (!var97);

      this.srcAudioFormat = var71 as MediaFormat;
      this.estimatedVideoBitrate = gf.h.a(this, kotlin.collections.h.e0(this.srcTrackFormats, this.srcVideoFormat));
      val var103: MediaFormat = this.srcVideoFormat;
      if (this.srcVideoFormat != null) {
         label151:
         try {
            val var73: eh.r.a = eh.r.k;
            var72 = eh.r.b(var103.getInteger("width"));
         } catch (var19: java.lang.Throwable) {
            val var87: eh.r.a = eh.r.k;
            var72 = eh.r.b(s.a(var19));
            break label151;
         }

         var var88: Any = var72;
         if (eh.r.g(var72)) {
            var88 = 640;
         }

         this.rawWidth = (var88 as java.lang.Number).intValue();

         label145:
         try {
            var75 = eh.r.b(var103.getInteger("height"));
         } catch (var18: java.lang.Throwable) {
            val var74: eh.r.a = eh.r.k;
            var75 = eh.r.b(s.a(var18));
            break label145;
         }

         var88 = var75;
         if (eh.r.g(var75)) {
            var88 = 480;
         }

         this.rawHeight = (var88 as java.lang.Number).intValue();
         var var76: java.lang.String = MediaFormatUtilsKt.getCodecType(var103);
         if (var76 == null) {
            var76 = "unknown";
         }

         this.rawVideoFormat = var76;

         label138:
         try {
            var78 = eh.r.b(var103.getInteger("frame-rate"));
         } catch (var17: java.lang.Throwable) {
            val var77: eh.r.a = eh.r.k;
            var78 = eh.r.b(s.a(var17));
            break label138;
         }

         if (eh.r.e(var78) != null) {
            label133:
            try {
               var78 = eh.r.b((int)var103.getFloat("frame-rate"));
            } catch (var16: java.lang.Throwable) {
               var88 = eh.r.k;
               var78 = eh.r.b(s.a(var16));
               break label133;
            }
         }

         var88 = var78;
         if (eh.r.g(var78)) {
            var88 = 30;
         }

         this.frameRate = (var88 as java.lang.Number).intValue();

         label127:
         try {
            var80 = eh.r.b(var103.getInteger("bitrate"));
         } catch (var15: java.lang.Throwable) {
            val var79: eh.r.a = eh.r.k;
            var80 = eh.r.b(s.a(var15));
            break label127;
         }

         if (eh.r.e(var80) != null) {
            var80 = this.getAVCBitrate(this.rawWidth, this.rawHeight, this.frameRate);
         }

         this.rawBitrate = (var80 as java.lang.Number).intValue();

         label121:
         try {
            var81 = eh.r.b(var103.getFloat("i-frame-interval"));
         } catch (var14: java.lang.Throwable) {
            var88 = eh.r.k;
            var81 = eh.r.b(s.a(var14));
            break label121;
         }

         if (eh.r.e(var81) != null) {
            label116:
            try {
               var81 = eh.r.b((float)var103.getInteger("i-frame-interval"));
            } catch (var13: java.lang.Throwable) {
               val var82: eh.r.a = eh.r.k;
               var81 = eh.r.b(s.a(var13));
               break label116;
            }
         }

         var88 = var81;
         if (eh.r.g(var81)) {
            var88 = 5.0F;
         }

         this.iFrameInterval = (var88 as java.lang.Number).floatValue();
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

      var97 = sh.a.b((float)this.rawWidth * var5);
      if (var97 % 2 != 0) {
         var97++;
      }

      this.width = var97;
      var var7: Int = sh.a.b(var5 * (float)this.rawHeight);
      if (var7 % 2 != 0) {
         var7++;
      }

      this.height = var7;
      var var8: Int = Math.max((int)((double)Math.min(this.estimatedVideoBitrate, this.rawBitrate) * 0.75), 300000);
      if (var4.getTargetBitrate() <= var8) {
         var8 = var4.getTargetBitrate();
      }

      this.bitRate = var8;
      var var9: Boolean = false;
      if (var97 % 2 == 0) {
         var9 = false;
         if (var7 % 2 == 0) {
            var9 = true;
         }
      }

      if (var9) {
         val var83: MediaFormat = new MediaFormat();
         var83.setString("mime", "video/avc");
         var83.setInteger("width", var97);
         var83.setInteger("height", var7);
         var83.setInteger("bitrate", var8);
         var83.setInteger("frame-rate", this.frameRate);
         if (VERSION.SDK_INT >= 25) {
            var83.setFloat("i-frame-interval", this.iFrameInterval);
         } else {
            var83.setInteger("i-frame-interval", (int)this.iFrameInterval);
         }

         this.videoFormat = var83;
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
               val var15: Boolean;
               if (var1 == var10.videoFrameWidth && var2 == var10.videoFrameHeight) {
                  var15 = true;
               } else {
                  var15 = false;
               }

               val var16: Boolean;
               if (var2 == var10.videoFrameWidth && var1 == var10.videoFrameHeight) {
                  var16 = true;
               } else {
                  var16 = false;
               }

               if ((var15 || var16) && var3 == var10.videoFrameRate && var10.videoCodec == 2) {
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

      var var17: Int = var4;
      var var12: Boolean = false;
      if (var17.intValue() != -1) {
         var12 = true;
      }

      if (!var12) {
         var17 = null;
      }

      if (var17 != null) {
         var1 = var17;
      } else {
         var1 = this.getDefaultBitrate(var1, var2, var3);
      }

      return var1;
   }

   private fun getAudioFormatWithBitrate(srcAudioFormat: MediaFormat?): MediaFormat? {
      if (var1 != null && !var1.containsKey("bitrate")) {
         if (VERSION.SDK_INT >= 29) {
            var1 = new MediaFormat(var1);
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
      return fh.s.l(
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
