package com.discord.media_player.reactevents

import cl.f
import cl.n
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import dl.a
import fl.b2
import fl.f0
import fl.g0
import fl.n0
import fl.x0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class MediaPlayFinishedAnalytics(playWallTimeMs: Long,
      stallMs: Long,
      stallCount: Int,
      seekCount: Int,
      firstPlayWaitingMs: Long,
      mediaSource: String?,
      fileDurationSec: Float,
      mimeType: String?,
      fatalErrorCount: Int,
      nonFatalErrorCount: Int,
      totalDroppedFrames: Long,
      totalBandwidthBytes: Long
   ) :
   ReactEvent {
   public final val fatalErrorCount: Int
   public final val fileDurationSec: Float
   public final val firstPlayWaitingMs: Long
   public final val mediaSource: String?
   public final val mimeType: String?
   public final val nonFatalErrorCount: Int
   public final val playWallTimeMs: Long
   public final val seekCount: Int
   public final val stallCount: Int
   public final val stallMs: Long
   public final val totalBandwidthBytes: Long
   public final val totalDroppedFrames: Long

   init {
      super();
      this.playWallTimeMs = var1;
      this.stallMs = var3;
      this.stallCount = var5;
      this.seekCount = var6;
      this.firstPlayWaitingMs = var7;
      this.mediaSource = var9;
      this.fileDurationSec = var10;
      this.mimeType = var11;
      this.fatalErrorCount = var12;
      this.nonFatalErrorCount = var13;
      this.totalDroppedFrames = var14;
      this.totalBandwidthBytes = var16;
   }

   public operator fun component1(): Long {
      return this.playWallTimeMs;
   }

   public operator fun component10(): Int {
      return this.nonFatalErrorCount;
   }

   public operator fun component11(): Long {
      return this.totalDroppedFrames;
   }

   public operator fun component12(): Long {
      return this.totalBandwidthBytes;
   }

   public operator fun component2(): Long {
      return this.stallMs;
   }

   public operator fun component3(): Int {
      return this.stallCount;
   }

   public operator fun component4(): Int {
      return this.seekCount;
   }

   public operator fun component5(): Long {
      return this.firstPlayWaitingMs;
   }

   public operator fun component6(): String? {
      return this.mediaSource;
   }

   public operator fun component7(): Float {
      return this.fileDurationSec;
   }

   public operator fun component8(): String? {
      return this.mimeType;
   }

   public operator fun component9(): Int {
      return this.fatalErrorCount;
   }

   public fun copy(
      playWallTimeMs: Long = var0.playWallTimeMs,
      stallMs: Long = var0.stallMs,
      stallCount: Int = var0.stallCount,
      seekCount: Int = var0.seekCount,
      firstPlayWaitingMs: Long = var0.firstPlayWaitingMs,
      mediaSource: String? = var0.mediaSource,
      fileDurationSec: Float = var0.fileDurationSec,
      mimeType: String? = var0.mimeType,
      fatalErrorCount: Int = var0.fatalErrorCount,
      nonFatalErrorCount: Int = var0.nonFatalErrorCount,
      totalDroppedFrames: Long = var0.totalDroppedFrames,
      totalBandwidthBytes: Long = var0.totalBandwidthBytes
   ): MediaPlayFinishedAnalytics {
      return new MediaPlayFinishedAnalytics(var1, var3, var5, var6, var7, var9, var10, var11, var12, var13, var14, var16);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayFinishedAnalytics) {
         return false;
      } else {
         var1 = var1;
         if (this.playWallTimeMs != var1.playWallTimeMs) {
            return false;
         } else if (this.stallMs != var1.stallMs) {
            return false;
         } else if (this.stallCount != var1.stallCount) {
            return false;
         } else if (this.seekCount != var1.seekCount) {
            return false;
         } else if (this.firstPlayWaitingMs != var1.firstPlayWaitingMs) {
            return false;
         } else if (!q.c(this.mediaSource, var1.mediaSource)) {
            return false;
         } else if (java.lang.Float.compare(this.fileDurationSec, var1.fileDurationSec) != 0) {
            return false;
         } else if (!q.c(this.mimeType, var1.mimeType)) {
            return false;
         } else if (this.fatalErrorCount != var1.fatalErrorCount) {
            return false;
         } else if (this.nonFatalErrorCount != var1.nonFatalErrorCount) {
            return false;
         } else if (this.totalDroppedFrames != var1.totalDroppedFrames) {
            return false;
         } else {
            return this.totalBandwidthBytes == var1.totalBandwidthBytes;
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = java.lang.Long.hashCode(this.playWallTimeMs);
      val var4: Int = java.lang.Long.hashCode(this.stallMs);
      val var7: Int = Integer.hashCode(this.stallCount);
      val var6: Int = Integer.hashCode(this.seekCount);
      val var3: Int = java.lang.Long.hashCode(this.firstPlayWaitingMs);
      var var2: Int = 0;
      val var1: Int;
      if (this.mediaSource == null) {
         var1 = 0;
      } else {
         var1 = this.mediaSource.hashCode();
      }

      val var8: Int = java.lang.Float.hashCode(this.fileDurationSec);
      if (this.mimeType != null) {
         var2 = this.mimeType.hashCode();
      }

      return (
               (
                        (
                                 (((((((var5 * 31 + var4) * 31 + var7) * 31 + var6) * 31 + var3) * 31 + var1) * 31 + var8) * 31 + var2) * 31
                                    + Integer.hashCode(this.fatalErrorCount)
                              )
                              * 31
                           + Integer.hashCode(this.nonFatalErrorCount)
                     )
                     * 31
                  + java.lang.Long.hashCode(this.totalDroppedFrames)
            )
            * 31
         + java.lang.Long.hashCode(this.totalBandwidthBytes);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var14: Long = this.playWallTimeMs;
      val var6: Long = this.stallMs;
      val var3: Int = this.stallCount;
      val var2: Int = this.seekCount;
      val var8: Long = this.firstPlayWaitingMs;
      val var17: java.lang.String = this.mediaSource;
      val var1: Float = this.fileDurationSec;
      val var16: java.lang.String = this.mimeType;
      val var4: Int = this.fatalErrorCount;
      val var5: Int = this.nonFatalErrorCount;
      val var10: Long = this.totalDroppedFrames;
      val var12: Long = this.totalBandwidthBytes;
      val var18: StringBuilder = new StringBuilder();
      var18.append("MediaPlayFinishedAnalytics(playWallTimeMs=");
      var18.append(var14);
      var18.append(", stallMs=");
      var18.append(var6);
      var18.append(", stallCount=");
      var18.append(var3);
      var18.append(", seekCount=");
      var18.append(var2);
      var18.append(", firstPlayWaitingMs=");
      var18.append(var8);
      var18.append(", mediaSource=");
      var18.append(var17);
      var18.append(", fileDurationSec=");
      var18.append(var1);
      var18.append(", mimeType=");
      var18.append(var16);
      var18.append(", fatalErrorCount=");
      var18.append(var4);
      var18.append(", nonFatalErrorCount=");
      var18.append(var5);
      var18.append(", totalDroppedFrames=");
      var18.append(var10);
      var18.append(", totalBandwidthBytes=");
      var18.append(var12);
      var18.append(")");
      return var18.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MediaPlayFinishedAnalytics.$serializer = new MediaPlayFinishedAnalytics.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.media_player.reactevents.MediaPlayFinishedAnalytics", var0, 12
         );
         var1.l("playWallTimeMs", false);
         var1.l("stallMs", false);
         var1.l("stallCount", false);
         var1.l("seekCount", false);
         var1.l("firstPlayWaitingMs", false);
         var1.l("mediaSource", false);
         var1.l("fileDurationSec", false);
         var1.l("mimeType", false);
         var1.l("fatalErrorCount", false);
         var1.l("nonFatalErrorCount", false);
         var1.l("totalDroppedFrames", false);
         var1.l("totalBandwidthBytes", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: x0 = x0.a;
         val var1: n0 = n0.a;
         val var3: b2 = b2.a;
         return new KSerializer[]{x0.a, x0.a, n0.a, n0.a, x0.a, a.u(b2.a), f0.a, a.u(var3), var1, var1, var2, var2};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayFinishedAnalytics {
         q.h(var1, "decoder");
         val var30: SerialDescriptor = this.getDescriptor();
         val var31: c = var1.c(var30);
         val var27: Boolean = var31.y();
         var var9: Byte = 10;
         var var2: Float;
         var var5: Int;
         var var6: Int;
         var var8: Int;
         var var19: Long;
         val var21: Long;
         val var23: Long;
         val var25: Long;
         var var28: java.lang.String;
         val var29: java.lang.String;
         var var36: Int;
         var var38: Int;
         var var43: Long;
         if (var27) {
            var25 = var31.h(var30, 0);
            var43 = var31.h(var30, 1);
            var36 = var31.k(var30, 2);
            var38 = var31.k(var30, 3);
            val var11: Long = var31.h(var30, 4);
            val var32: b2 = b2.a;
            var28 = var31.v(var30, 5, b2.a, null) as java.lang.String;
            var2 = var31.G(var30, 6);
            val var33: java.lang.String = var31.v(var30, 7, var32, null) as java.lang.String;
            var5 = var31.k(var30, 8);
            val var3: Int = var31.k(var30, 9);
            val var15: Long = var31.h(var30, 10);
            val var13: Long = var31.h(var30, 11);
            var6 = 4095;
            var19 = var43;
            var8 = var36;
            var36 = var38;
            var23 = var11;
            var29 = var33;
            var38 = var3;
            var21 = var15;
            var43 = var13;
         } else {
            var var42: Long = 0L;
            var var41: Long = 0L;
            var var40: Long = 0L;
            var19 = 0L;
            var43 = 0L;
            var var39: Boolean = true;
            var8 = 0;
            var var35: Int = 0;
            var36 = 0;
            var28 = null;
            var2 = 0.0F;
            var5 = 0;
            var var34: java.lang.String = null;
            var6 = 0;

            while (var39) {
               val var10: Int = var31.x(var30);
               switch (var10) {
                  case -1:
                     var39 = false;
                     break;
                  case 0:
                     var40 = var31.h(var30, 0);
                     var35 |= 1;
                     break;
                  case 1:
                     var41 = var31.h(var30, 1);
                     var35 |= 2;
                     break;
                  case 2:
                     var8 = var31.k(var30, 2);
                     var35 |= 4;
                     var9 = 10;
                     continue;
                  case 3:
                     var36 = var31.k(var30, 3);
                     var35 |= 8;
                     break;
                  case 4:
                     var42 = var31.h(var30, 4);
                     var35 |= 16;
                     break;
                  case 5:
                     var34 = var31.v(var30, 5, b2.a, var34) as java.lang.String;
                     var35 |= 32;
                     break;
                  case 6:
                     var2 = var31.G(var30, 6);
                     var35 |= 64;
                     break;
                  case 7:
                     var28 = var31.v(var30, 7, b2.a, var28) as java.lang.String;
                     var35 |= 128;
                     break;
                  case 8:
                     var5 = var31.k(var30, 8);
                     var35 |= 256;
                     continue;
                  case 9:
                     var6 = var31.k(var30, 9);
                     var35 |= 512;
                     continue;
                  case 10:
                     var19 = var31.h(var30, var9);
                     var35 |= 1024;
                     continue;
                  case 11:
                     var43 = var31.h(var30, 11);
                     var35 |= 2048;
                     continue;
                  default:
                     throw new n(var10);
               }

               var9 = 10;
            }

            var21 = var19;
            var38 = var6;
            var29 = var28;
            var28 = var34;
            var23 = var42;
            var19 = var41;
            var25 = var40;
            var6 = var35;
         }

         var31.b(var30);
         return new MediaPlayFinishedAnalytics(var6, var25, var19, var8, var36, var23, var28, var2, var29, var5, var38, var21, var43, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayFinishedAnalytics) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MediaPlayFinishedAnalytics.write$Self$media_player_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayFinishedAnalytics> {
         return MediaPlayFinishedAnalytics.$serializer.INSTANCE;
      }
   }
}
