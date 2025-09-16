package com.discord.media.utils

import A9.s
import android.content.Context
import android.media.CamcorderProfile
import android.media.MediaFormat
import android.net.Uri
import android.os.Build.VERSION
import java.nio.ByteBuffer
import java.util.ArrayList
import java.util.concurrent.TimeUnit
import kotlin.jvm.internal.SourceDebugExtension
import r8.h

@SourceDebugExtension(["SMAP\nDiscordVideoMediaSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscordVideoMediaSource.kt\ncom/discord/media/utils/DiscordVideoMediaSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1557#2:237\n1628#2,3:238\n295#2,2:241\n295#2,2:243\n1#3:245\n*S KotlinDebug\n*F\n+ 1 DiscordVideoMediaSource.kt\ncom/discord/media/utils/DiscordVideoMediaSource\n*L\n22#1:237\n22#1:238,3\n23#1:241,2\n24#1:243,2\n*E\n"])
internal class DiscordVideoMediaSource(context: Context, inputUri: Uri) : o8.a(var1, var2) {
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
      this.inputUri = var2;
      val var6: IntRange = kotlin.ranges.d.s(0, this.getTrackCount());
      val var103: ArrayList = new ArrayList(CollectionsKt.v(var6, 10));
      val var119: java.util.Iterator = var6.iterator();

      while (var119.hasNext()) {
         var103.add(this.getTrackFormat((var119 as I).nextInt()));
      }

      this.srcTrackFormats = var103;
      var var7: java.util.Iterator = var103.iterator();

      var var132: java.lang.String;
      do {
         val var4: Boolean = var7.hasNext();
         var120 = null;
         if (!var4) {
            var104 = null;
            break;
         }

         var104 = var7.next();
         val var8: MediaFormat = var104 as MediaFormat;
         var132 = MediaFormatUtilsKt.getMimeType(var8);
      } while (var132 == null || !StringsKt.I(var132, "video", false, 2, null));

      this.srcVideoFormat = var104 as MediaFormat;
      var7 = this.srcTrackFormats.iterator();

      do {
         var105 = var120;
         if (!var7.hasNext()) {
            break;
         }

         var105 = var7.next();
         val var133: MediaFormat = var105 as MediaFormat;
         var132 = MediaFormatUtilsKt.getMimeType(var133);
      } while (var132 == null || !StringsKt.I(var132, "audio", false, 2, null));

      this.srcAudioFormat = var105 as MediaFormat;
      val var135: MediaFormat = this.srcVideoFormat;
      if (this.srcVideoFormat != null) {
         label154:
         try {
            val var107: kotlin.Result.a = Result.e;
            var106 = Result.b(var135.getInteger("width"));
         } catch (var17: java.lang.Throwable) {
            val var121: kotlin.Result.a = Result.e;
            var106 = Result.b(kotlin.c.a(var17));
            break label154;
         }

         var var122: Any = var106;
         if (Result.g(var106)) {
            var122 = 640;
         }

         this.width = (var122 as java.lang.Number).intValue();

         label148:
         try {
            var108 = Result.b(var135.getInteger("height"));
         } catch (var16: java.lang.Throwable) {
            var122 = Result.e;
            var108 = Result.b(kotlin.c.a(var16));
            break label148;
         }

         var122 = var108;
         if (Result.g(var108)) {
            var122 = 480;
         }

         this.height = (var122 as java.lang.Number).intValue();
         var122 = MediaFormatUtilsKt.getProfileName(var135);
         var var109: java.lang.String = (java.lang.String)var122;
         if (var122 == null) {
            var109 = "unknown";
         }

         this.profile = var109;
         val var110: Int = MediaFormatUtilsKt.getLevel(var135);
         var var3: Int;
         if (var110 != null) {
            var3 = var110;
         } else {
            var3 = 0;
         }

         this.level = var3;
         this.durationMs = (int)TimeUnit.MICROSECONDS.toMillis(var135.getLong("durationUs"));
         var var111: java.lang.String = MediaFormatUtilsKt.getCodecType(var135);
         if (var111 == null) {
            var111 = "unknown";
         }

         var var118: Boolean;
         label185: {
            this.videoFormat = var111;
            if (var135.containsKey("color-transfer")) {
               var118 = true;
               if (var135.getInteger("color-transfer") == 7) {
                  break label185;
               }

               var118 = true;
               if (var135.getInteger("color-transfer") == 6) {
                  break label185;
               }
            }

            if (var135.containsKey("color-standard") && var135.getInteger("color-standard") == 6) {
               var118 = true;
            } else {
               var118 = false;
            }
         }

         this.isHDRContent = var118;

         label130:
         try {
            var112 = Result.b(var135.getInteger("frame-rate"));
         } catch (var15: java.lang.Throwable) {
            var122 = Result.e;
            var112 = Result.b(kotlin.c.a(var15));
            break label130;
         }

         if (Result.e(var112) != null) {
            label125:
            try {
               var112 = Result.b((int)var135.getFloat("frame-rate"));
            } catch (var14: java.lang.Throwable) {
               val var113: kotlin.Result.a = Result.e;
               var112 = Result.b(kotlin.c.a(var14));
               break label125;
            }
         }

         var122 = var112;
         if (Result.g(var112)) {
            var122 = 30;
         }

         this.frameRate = (var122 as java.lang.Number).intValue();
         this.bitRate = h.a(this, this.srcTrackFormats.indexOf(var135));

         label119:
         try {
            var114 = Result.b(var135.getFloat("i-frame-interval"));
         } catch (var13: java.lang.Throwable) {
            var122 = Result.e;
            var114 = Result.b(kotlin.c.a(var13));
            break label119;
         }

         if (Result.e(var114) != null) {
            label114:
            try {
               var114 = Result.b((float)var135.getInteger("i-frame-interval"));
            } catch (var12: java.lang.Throwable) {
               val var115: kotlin.Result.a = Result.e;
               var114 = Result.b(kotlin.c.a(var12));
               break label114;
            }
         }

         var122 = var114;
         if (Result.g(var114)) {
            var122 = 5.0F;
         }

         this.keyFrameIntervalSeconds = (var122 as java.lang.Number).floatValue();

         label1068: {
            label106: {
               try {
                  if (var135.containsKey("rotation-degrees")) {
                     var3 = var135.getInteger("rotation-degrees");
                     break label106;
                  }
               } catch (var11: java.lang.Throwable) {
                  val var99: kotlin.Result.a = Result.e;
                  var100 = Result.b(kotlin.c.a(var11));
                  break label1068;
               }

               try {
                  var3 = this.extractVideoRotationFromMetadata(var1, this.inputUri);
               } catch (var10: java.lang.Throwable) {
                  val var101: kotlin.Result.a = Result.e;
                  var100 = Result.b(kotlin.c.a(var10));
                  break label1068;
               }
            }

            label98:
            try {
               var100 = Result.b(var3);
            } catch (var9: java.lang.Throwable) {
               val var102: kotlin.Result.a = Result.e;
               var100 = Result.b(kotlin.c.a(var9));
               break label98;
            }
         }

         var var116: Any = var100;
         if (Result.g(var100)) {
            var116 = 0;
         }

         this.rotationDegrees = (var116 as java.lang.Number).intValue();
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
      // 1d: invokestatic kotlin/text/StringsKt.toIntOrNull (Ljava/lang/String;)Ljava/lang/Integer;
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
      // 33: getstatic kotlin/Result.e Lkotlin/Result$a;
      // 36: astore 1
      // 37: aload 4
      // 39: invokevirtual android/media/MediaMetadataRetriever.release ()V
      // 3c: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 3f: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 42: pop
      // 43: goto 53
      // 46: astore 2
      // 47: getstatic kotlin/Result.e Lkotlin/Result$a;
      // 4a: astore 1
      // 4b: aload 2
      // 4c: invokestatic kotlin/c.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 4f: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 52: pop
      // 53: iload 3
      // 54: ireturn
      // 55: getstatic kotlin/Result.e Lkotlin/Result$a;
      // 58: astore 2
      // 59: aload 4
      // 5b: invokevirtual android/media/MediaMetadataRetriever.release ()V
      // 5e: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 61: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 64: pop
      // 65: goto 76
      // 68: astore 2
      // 69: getstatic kotlin/Result.e Lkotlin/Result$a;
      // 6c: astore 4
      // 6e: aload 2
      // 6f: invokestatic kotlin/c.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 72: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 75: pop
      // 76: aload 1
      // 77: athrow
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
      return L.l(
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
            if (!(this.colorTransfer == var1.colorTransfer)) {
               return false;
            } else if (!(this.colorStandard == var1.colorStandard)) {
               return false;
            } else if (!(this.colorRange == var1.colorRange)) {
               return false;
            } else {
               return this.hdrStaticInfo == var1.hdrStaticInfo;
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
         val var4: Int = this.colorTransfer;
         val var5: Int = this.colorStandard;
         val var1: Int = this.colorRange;
         val var2: ByteBuffer = this.hdrStaticInfo;
         val var3: StringBuilder = new StringBuilder();
         var3.append("ColorFormatSettings(colorTransfer=");
         var3.append(var4);
         var3.append(", colorStandard=");
         var3.append(var5);
         var3.append(", colorRange=");
         var3.append(var1);
         var3.append(", hdrStaticInfo=");
         var3.append(var2);
         var3.append(")");
         return var3.toString();
      }
   }

   private companion object {
      public const val DEFAULT_WIDTH: Int
      public const val DEFAULT_HEIGHT: Int
      public const val DEFAULT_FRAME_RATE: Int
      public const val DEFAULT_KEY_FRAME_INTERVAL_SECONDS: Float
   }
}
