package com.discord.media_player.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fl.f
import fl.n
import gl.a
import il.b2
import il.f0
import il.g0
import il.n0
import il.x0
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
      val var3: Int = java.lang.Long.hashCode(this.playWallTimeMs);
      val var7: Int = java.lang.Long.hashCode(this.stallMs);
      val var5: Int = Integer.hashCode(this.stallCount);
      val var4: Int = Integer.hashCode(this.seekCount);
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
                                 (((((((var3 * 31 + var7) * 31 + var5) * 31 + var4) * 31 + var6) * 31 + var1) * 31 + var8) * 31 + var2) * 31
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
      val var10: Long = this.playWallTimeMs;
      val var14: Long = this.stallMs;
      val var2: Int = this.stallCount;
      val var4: Int = this.seekCount;
      val var6: Long = this.firstPlayWaitingMs;
      val var18: java.lang.String = this.mediaSource;
      val var1: Float = this.fileDurationSec;
      val var17: java.lang.String = this.mimeType;
      val var3: Int = this.fatalErrorCount;
      val var5: Int = this.nonFatalErrorCount;
      val var12: Long = this.totalDroppedFrames;
      val var8: Long = this.totalBandwidthBytes;
      val var16: StringBuilder = new StringBuilder();
      var16.append("MediaPlayFinishedAnalytics(playWallTimeMs=");
      var16.append(var10);
      var16.append(", stallMs=");
      var16.append(var14);
      var16.append(", stallCount=");
      var16.append(var2);
      var16.append(", seekCount=");
      var16.append(var4);
      var16.append(", firstPlayWaitingMs=");
      var16.append(var6);
      var16.append(", mediaSource=");
      var16.append(var18);
      var16.append(", fileDurationSec=");
      var16.append(var1);
      var16.append(", mimeType=");
      var16.append(var17);
      var16.append(", fatalErrorCount=");
      var16.append(var3);
      var16.append(", nonFatalErrorCount=");
      var16.append(var5);
      var16.append(", totalDroppedFrames=");
      var16.append(var12);
      var16.append(", totalBandwidthBytes=");
      var16.append(var8);
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
         val var2: n0 = n0.a;
         val var3: b2 = b2.a;
         return new KSerializer[]{x0.a, x0.a, n0.a, n0.a, x0.a, a.u(b2.a), f0.a, a.u(var3), var2, var2, var1, var1};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayFinishedAnalytics {
         q.h(var1, "decoder");
         val var28: SerialDescriptor = this.getDescriptor();
         val var29: c = var1.c(var28);
         val var25: Boolean = var29.y();
         var var9: Byte = 10;
         var var2: Float;
         var var4: Int;
         var var5: Int;
         val var6: Int;
         var var7: Int;
         var var8: Int;
         var var13: Long;
         var var19: Long;
         val var21: Long;
         val var23: Long;
         var var26: java.lang.String;
         val var27: java.lang.String;
         var var40: Long;
         if (var25) {
            var13 = var29.h(var28, 0);
            var40 = var29.h(var28, 1);
            var8 = var29.k(var28, 2);
            var7 = var29.k(var28, 3);
            val var11: Long = var29.h(var28, 4);
            val var30: b2 = b2.a;
            var26 = var29.v(var28, 5, b2.a, null) as java.lang.String;
            var2 = var29.G(var28, 6);
            val var31: java.lang.String = var29.v(var28, 7, var30, null) as java.lang.String;
            var5 = var29.k(var28, 8);
            val var3: Int = var29.k(var28, 9);
            val var15: Long = var29.h(var28, 10);
            var19 = var29.h(var28, 11);
            var4 = 4095;
            var21 = var40;
            var23 = var11;
            var27 = var31;
            var6 = var3;
            var40 = var15;
         } else {
            var var39: Long = 0L;
            var13 = 0L;
            var var37: Long = 0L;
            var19 = 0L;
            var40 = 0L;
            var var35: Boolean = true;
            var8 = 0;
            var var33: Int = 0;
            var4 = 0;
            var26 = null;
            var2 = 0.0F;
            var5 = 0;
            var var32: java.lang.String = null;
            var7 = 0;

            while (var35) {
               val var10: Int = var29.x(var28);
               switch (var10) {
                  case -1:
                     var35 = false;
                     break;
                  case 0:
                     var37 = var29.h(var28, 0);
                     var33 |= 1;
                     break;
                  case 1:
                     var13 = var29.h(var28, 1);
                     var33 |= 2;
                     break;
                  case 2:
                     var8 = var29.k(var28, 2);
                     var33 |= 4;
                     var9 = 10;
                     continue;
                  case 3:
                     var4 = var29.k(var28, 3);
                     var33 |= 8;
                     break;
                  case 4:
                     var39 = var29.h(var28, 4);
                     var33 |= 16;
                     break;
                  case 5:
                     var32 = var29.v(var28, 5, b2.a, var32) as java.lang.String;
                     var33 |= 32;
                     break;
                  case 6:
                     var2 = var29.G(var28, 6);
                     var33 |= 64;
                     break;
                  case 7:
                     var26 = var29.v(var28, 7, b2.a, var26) as java.lang.String;
                     var33 |= 128;
                     break;
                  case 8:
                     var5 = var29.k(var28, 8);
                     var33 |= 256;
                     continue;
                  case 9:
                     var7 = var29.k(var28, 9);
                     var33 |= 512;
                     continue;
                  case 10:
                     var19 = var29.h(var28, var9);
                     var33 |= 1024;
                     continue;
                  case 11:
                     var40 = var29.h(var28, 11);
                     var33 |= 2048;
                     continue;
                  default:
                     throw new n(var10);
               }

               var9 = 10;
            }

            var6 = var7;
            var19 = var40;
            var40 = var19;
            var27 = var26;
            var26 = var32;
            var23 = var39;
            var7 = var4;
            var21 = var13;
            var13 = var37;
            var4 = var33;
         }

         var29.b(var28);
         return new MediaPlayFinishedAnalytics(var4, var13, var21, var8, var7, var23, var26, var2, var27, var5, var6, var40, var19, null);
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
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayFinishedAnalytics> {
         return MediaPlayFinishedAnalytics.$serializer.INSTANCE;
      }
   }
}
