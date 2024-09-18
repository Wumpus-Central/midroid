package com.discord.media_player.reactevents

import bl.b2
import bl.f0
import bl.g0
import bl.n0
import bl.x0
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n
import zk.a

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
      val var7: Int = java.lang.Long.hashCode(this.playWallTimeMs);
      val var3: Int = java.lang.Long.hashCode(this.stallMs);
      val var4: Int = Integer.hashCode(this.stallCount);
      val var5: Int = Integer.hashCode(this.seekCount);
      val var6: Int = java.lang.Long.hashCode(this.firstPlayWaitingMs);
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
                                 (((((((var7 * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6) * 31 + var1) * 31 + var8) * 31 + var2) * 31
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
      val var12: Long = this.playWallTimeMs;
      val var8: Long = this.stallMs;
      val var4: Int = this.stallCount;
      val var2: Int = this.seekCount;
      val var10: Long = this.firstPlayWaitingMs;
      val var17: java.lang.String = this.mediaSource;
      val var1: Float = this.fileDurationSec;
      val var18: java.lang.String = this.mimeType;
      val var5: Int = this.fatalErrorCount;
      val var3: Int = this.nonFatalErrorCount;
      val var6: Long = this.totalDroppedFrames;
      val var14: Long = this.totalBandwidthBytes;
      val var16: StringBuilder = new StringBuilder();
      var16.append("MediaPlayFinishedAnalytics(playWallTimeMs=");
      var16.append(var12);
      var16.append(", stallMs=");
      var16.append(var8);
      var16.append(", stallCount=");
      var16.append(var4);
      var16.append(", seekCount=");
      var16.append(var2);
      var16.append(", firstPlayWaitingMs=");
      var16.append(var10);
      var16.append(", mediaSource=");
      var16.append(var17);
      var16.append(", fileDurationSec=");
      var16.append(var1);
      var16.append(", mimeType=");
      var16.append(var18);
      var16.append(", fatalErrorCount=");
      var16.append(var5);
      var16.append(", nonFatalErrorCount=");
      var16.append(var3);
      var16.append(", totalDroppedFrames=");
      var16.append(var6);
      var16.append(", totalBandwidthBytes=");
      var16.append(var14);
      var16.append(")");
      return var16.toString();
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
         val var1: x0 = x0.a;
         val var3: n0 = n0.a;
         val var2: b2 = b2.a;
         return new KSerializer[]{x0.a, x0.a, n0.a, n0.a, x0.a, a.u(b2.a), f0.a, a.u(var2), var3, var3, var1, var1};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayFinishedAnalytics {
         q.h(var1, "decoder");
         val var26: SerialDescriptor = this.getDescriptor();
         val var27: c = var1.c(var26);
         val var23: Boolean = var27.y();
         var var9: Byte = 10;
         var var2: Float;
         var var5: Int;
         val var7: Int;
         var var8: Int;
         var var13: Long;
         var var15: Long;
         var var17: Long;
         var var19: Long;
         val var21: Long;
         var var24: java.lang.String;
         val var29: java.lang.String;
         var var32: Int;
         var var35: Int;
         if (var23) {
            var13 = var27.h(var26, 0);
            var19 = var27.h(var26, 1);
            var32 = var27.k(var26, 2);
            var5 = var27.k(var26, 3);
            val var11: Long = var27.h(var26, 4);
            val var28: b2 = b2.a;
            var24 = var27.v(var26, 5, b2.a, null) as java.lang.String;
            var2 = var27.G(var26, 6);
            var29 = var27.v(var26, 7, var28, null) as java.lang.String;
            var35 = var27.k(var26, 8);
            val var3: Int = var27.k(var26, 9);
            var17 = var27.h(var26, 10);
            var21 = var27.h(var26, 11);
            var7 = 4095;
            var8 = var32;
            var15 = var11;
            var32 = var35;
            var35 = var3;
         } else {
            var15 = 0L;
            var13 = 0L;
            var var38: Long = 0L;
            var19 = 0L;
            var17 = 0L;
            var var36: Boolean = true;
            var8 = 0;
            var var31: Int = 0;
            var32 = 0;
            var24 = null;
            var2 = 0.0F;
            var5 = 0;
            var var30: java.lang.String = null;
            var35 = 0;

            while (var36) {
               val var10: Int = var27.x(var26);
               switch (var10) {
                  case -1:
                     var36 = false;
                     break;
                  case 0:
                     var38 = var27.h(var26, 0);
                     var31 |= 1;
                     break;
                  case 1:
                     var13 = var27.h(var26, 1);
                     var31 |= 2;
                     break;
                  case 2:
                     var8 = var27.k(var26, 2);
                     var31 |= 4;
                     var9 = 10;
                     continue;
                  case 3:
                     var32 = var27.k(var26, 3);
                     var31 |= 8;
                     break;
                  case 4:
                     var15 = var27.h(var26, 4);
                     var31 |= 16;
                     break;
                  case 5:
                     var30 = var27.v(var26, 5, b2.a, var30) as java.lang.String;
                     var31 |= 32;
                     break;
                  case 6:
                     var2 = var27.G(var26, 6);
                     var31 |= 64;
                     break;
                  case 7:
                     var24 = var27.v(var26, 7, b2.a, var24) as java.lang.String;
                     var31 |= 128;
                     break;
                  case 8:
                     var5 = var27.k(var26, 8);
                     var31 |= 256;
                     continue;
                  case 9:
                     var35 = var27.k(var26, 9);
                     var31 |= 512;
                     continue;
                  case 10:
                     var19 = var27.h(var26, var9);
                     var31 |= 1024;
                     continue;
                  case 11:
                     var17 = var27.h(var26, 11);
                     var31 |= 2048;
                     continue;
                  default:
                     throw new n(var10);
               }

               var9 = 10;
            }

            var24 = var30;
            var21 = var17;
            var17 = var19;
            var32 = var5;
            var29 = var24;
            var5 = var32;
            var19 = var13;
            var13 = var38;
            var7 = var31;
         }

         var27.b(var26);
         return new MediaPlayFinishedAnalytics(var7, var13, var19, var8, var5, var15, var24, var2, var29, var32, var35, var17, var21, null);
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
         return bl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayFinishedAnalytics> {
         return MediaPlayFinishedAnalytics.$serializer.INSTANCE;
      }
   }
}
