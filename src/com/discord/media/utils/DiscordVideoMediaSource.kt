package com.discord.media.utils

import A9.s
import B9.n
import B9.q
import android.content.Context
import android.media.CamcorderProfile
import android.media.MediaFormat
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
      val var103: ArrayList = new ArrayList(i.v(var6, 10));
      val var118: java.util.Iterator = var6.iterator();

      while (var118.hasNext()) {
         var103.add(this.getTrackFormat((var118 as n).a()));
      }

      this.srcTrackFormats = var103;
      var var7: java.util.Iterator = var103.iterator();

      var var132: java.lang.String;
      do {
         val var4: Boolean = var7.hasNext();
         var119 = null;
         if (!var4) {
            var104 = null;
            break;
         }

         var104 = var7.next();
         val var8: MediaFormat = var104 as MediaFormat;
         r.e(var104 as MediaFormat);
         var132 = MediaFormatUtilsKt.getMimeType(var8);
      } while (var132 == null || !h.I(var132, "video", false, 2, null));

      this.srcVideoFormat = var104 as MediaFormat;
      var7 = this.srcTrackFormats.iterator();

      do {
         var105 = var119;
         if (!var7.hasNext()) {
            break;
         }

         var105 = var7.next();
         val var133: MediaFormat = var105 as MediaFormat;
         r.e(var105 as MediaFormat);
         var132 = MediaFormatUtilsKt.getMimeType(var133);
      } while (var132 == null || !h.I(var132, "audio", false, 2, null));

      this.srcAudioFormat = var105 as MediaFormat;
      val var135: MediaFormat = this.srcVideoFormat;
      if (this.srcVideoFormat != null) {
         label154:
         try {
            val var107: kotlin.Result.a = Result.k;
            var106 = Result.b(var135.getInteger("width"));
         } catch (var17: java.lang.Throwable) {
            val var120: kotlin.Result.a = Result.k;
            var106 = Result.b(kotlin.c.a(var17));
            break label154;
         }

         var var121: Any = var106;
         if (Result.g(var106)) {
            var121 = 640;
         }

         this.width = (var121 as java.lang.Number).intValue();

         label148:
         try {
            var109 = Result.b(var135.getInteger("height"));
         } catch (var16: java.lang.Throwable) {
            val var108: kotlin.Result.a = Result.k;
            var109 = Result.b(kotlin.c.a(var16));
            break label148;
         }

         var121 = var109;
         if (Result.g(var109)) {
            var121 = 480;
         }

         this.height = (var121 as java.lang.Number).intValue();
         var121 = MediaFormatUtilsKt.getProfileName(var135);
         var var110: java.lang.String = (java.lang.String)var121;
         if (var121 == null) {
            var110 = "unknown";
         }

         this.profile = var110;
         val var111: Int = MediaFormatUtilsKt.getLevel(var135);
         var var3: Int;
         if (var111 != null) {
            var3 = var111;
         } else {
            var3 = 0;
         }

         this.level = var3;
         this.durationMs = (int)TimeUnit.MICROSECONDS.toMillis(var135.getLong("durationUs"));
         var var112: java.lang.String = MediaFormatUtilsKt.getCodecType(var135);
         if (var112 == null) {
            var112 = "unknown";
         }

         var var117: Boolean;
         label185: {
            this.videoFormat = var112;
            if (var135.containsKey("color-transfer")) {
               var117 = true;
               if (var135.getInteger("color-transfer") == 7) {
                  break label185;
               }

               var117 = true;
               if (var135.getInteger("color-transfer") == 6) {
                  break label185;
               }
            }

            if (var135.containsKey("color-standard") && var135.getInteger("color-standard") == 6) {
               var117 = true;
            } else {
               var117 = false;
            }
         }

         this.isHDRContent = var117;

         label130:
         try {
            var113 = Result.b(var135.getInteger("frame-rate"));
         } catch (var15: java.lang.Throwable) {
            var121 = Result.k;
            var113 = Result.b(kotlin.c.a(var15));
            break label130;
         }

         if (Result.e(var113) != null) {
            label125:
            try {
               var113 = Result.b((int)var135.getFloat("frame-rate"));
            } catch (var14: java.lang.Throwable) {
               var121 = Result.k;
               var113 = Result.b(kotlin.c.a(var14));
               break label125;
            }
         }

         var121 = var113;
         if (Result.g(var113)) {
            var121 = 30;
         }

         this.frameRate = (var121 as java.lang.Number).intValue();
         this.bitRate = r8.h.a(this, this.srcTrackFormats.indexOf(var135));

         label119:
         try {
            var114 = Result.b(var135.getFloat("i-frame-interval"));
         } catch (var13: java.lang.Throwable) {
            var121 = Result.k;
            var114 = Result.b(kotlin.c.a(var13));
            break label119;
         }

         if (Result.e(var114) != null) {
            label114:
            try {
               var114 = Result.b((float)var135.getInteger("i-frame-interval"));
            } catch (var12: java.lang.Throwable) {
               var121 = Result.k;
               var114 = Result.b(kotlin.c.a(var12));
               break label114;
            }
         }

         var121 = var114;
         if (Result.g(var114)) {
            var121 = 5.0F;
         }

         this.keyFrameIntervalSeconds = (var121 as java.lang.Number).floatValue();

         label1068: {
            label106: {
               try {
                  if (var135.containsKey("rotation-degrees")) {
                     var3 = var135.getInteger("rotation-degrees");
                     break label106;
                  }
               } catch (var11: java.lang.Throwable) {
                  val var99: kotlin.Result.a = Result.k;
                  var100 = Result.b(kotlin.c.a(var11));
                  break label1068;
               }

               try {
                  var3 = this.extractVideoRotationFromMetadata(var1, this.inputUri);
               } catch (var10: java.lang.Throwable) {
                  val var101: kotlin.Result.a = Result.k;
                  var100 = Result.b(kotlin.c.a(var10));
                  break label1068;
               }
            }

            label98:
            try {
               var100 = Result.b(var3);
            } catch (var9: java.lang.Throwable) {
               val var102: kotlin.Result.a = Result.k;
               var100 = Result.b(kotlin.c.a(var9));
               break label98;
            }
         }

         var var115: Any = var100;
         if (Result.g(var100)) {
            var115 = 0;
         }

         this.rotationDegrees = (var115 as java.lang.Number).intValue();
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

   private fun extractVideoRotationFromMetadata(context: Context, inputUri: Uri): Int {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: new android/media/MediaMetadataRetriever
      // 03: dup
      // 04: invokespecial android/media/MediaMetadataRetriever.<init> ()V
      // 07: astore 4
      // 09: aload 4
      // 0b: aload 1
      // 0c: aload 2
      // 0d: invokevirtual android/media/MediaMetadataRetriever.setDataSource (Landroid/content/Context;Landroid/net/Uri;)V
      // 10: aload 4
      // 12: bipush 24
      // 14: invokevirtual android/media/MediaMetadataRetriever.extractMetadata (I)Ljava/lang/String;
      // 17: astore 1
      // 18: aload 1
      // 19: ifnull 31
      // 1c: aload 1
      // 1d: invokestatic kotlin/text/h.m (Ljava/lang/String;)Ljava/lang/Integer;
      // 20: astore 1
      // 21: aload 1
      // 22: ifnull 31
      // 25: aload 1
      // 26: invokevirtual java/lang/Integer.intValue ()I
      // 29: istore 3
      // 2a: goto 33
      // 2d: astore 1
      // 2e: goto 55
      // 31: bipush 0
      // 32: istore 3
      // 33: getstatic kotlin/Result.k Lkotlin/Result$a;
      // 36: astore 1
      // 37: aload 4
      // 39: invokevirtual android/media/MediaMetadataRetriever.release ()V
      // 3c: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 3f: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 42: pop
      // 43: goto 53
      // 46: astore 1
      // 47: getstatic kotlin/Result.k Lkotlin/Result$a;
      // 4a: astore 2
      // 4b: aload 1
      // 4c: invokestatic kotlin/c.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 4f: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 52: pop
      // 53: iload 3
      // 54: ireturn
      // 55: getstatic kotlin/Result.k Lkotlin/Result$a;
      // 58: astore 2
      // 59: aload 4
      // 5b: invokevirtual android/media/MediaMetadataRetriever.release ()V
      // 5e: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 61: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 64: pop
      // 65: goto 77
      // 68: astore 4
      // 6a: getstatic kotlin/Result.k Lkotlin/Result$a;
      // 6d: astore 2
      // 6e: aload 4
      // 70: invokestatic kotlin/c.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 73: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 76: pop
      // 77: aload 1
      // 78: athrow
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
         val var1: Int = this.colorTransfer;
         val var3: Int = this.colorStandard;
         val var4: Int = this.colorRange;
         val var2: ByteBuffer = this.hdrStaticInfo;
         val var5: StringBuilder = new StringBuilder();
         var5.append("ColorFormatSettings(colorTransfer=");
         var5.append(var1);
         var5.append(", colorStandard=");
         var5.append(var3);
         var5.append(", colorRange=");
         var5.append(var4);
         var5.append(", hdrStaticInfo=");
         var5.append(var2);
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
