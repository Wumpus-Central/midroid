package com.discord.media_player.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.e0
import xk.f0
import xk.m0
import xk.w0

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

   @JvmStatic
   public fun `write$Self`(self: MediaPlayFinishedAnalytics, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.E(var2, 0, var0.playWallTimeMs);
      var1.E(var2, 1, var0.stallMs);
      var1.w(var2, 2, var0.stallCount);
      var1.w(var2, 3, var0.seekCount);
      var1.E(var2, 4, var0.firstPlayWaitingMs);
      val var3: a2 = a2.a;
      var1.m(var2, 5, a2.a, var0.mediaSource);
      var1.r(var2, 6, var0.fileDurationSec);
      var1.m(var2, 7, var3, var0.mimeType);
      var1.w(var2, 8, var0.fatalErrorCount);
      var1.w(var2, 9, var0.nonFatalErrorCount);
      var1.E(var2, 10, var0.totalDroppedFrames);
      var1.E(var2, 11, var0.totalBandwidthBytes);
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
         } else if (!r.c(this.mediaSource, var1.mediaSource)) {
            return false;
         } else if (java.lang.Float.compare(this.fileDurationSec, var1.fileDurationSec) != 0) {
            return false;
         } else if (!r.c(this.mimeType, var1.mimeType)) {
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
      val var5: Int = java.lang.Long.hashCode(this.stallMs);
      val var4: Int = Integer.hashCode(this.stallCount);
      val var3: Int = Integer.hashCode(this.seekCount);
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
                                 (((((((var7 * 31 + var5) * 31 + var4) * 31 + var3) * 31 + var6) * 31 + var1) * 31 + var8) * 31 + var2) * 31
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

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var6: Long = this.playWallTimeMs;
      val var8: Long = this.stallMs;
      val var4: Int = this.stallCount;
      val var5: Int = this.seekCount;
      val var10: Long = this.firstPlayWaitingMs;
      val var18: java.lang.String = this.mediaSource;
      val var1: Float = this.fileDurationSec;
      val var17: java.lang.String = this.mimeType;
      val var2: Int = this.fatalErrorCount;
      val var3: Int = this.nonFatalErrorCount;
      val var12: Long = this.totalDroppedFrames;
      val var14: Long = this.totalBandwidthBytes;
      val var16: StringBuilder = new StringBuilder();
      var16.append("MediaPlayFinishedAnalytics(playWallTimeMs=");
      var16.append(var6);
      var16.append(", stallMs=");
      var16.append(var8);
      var16.append(", stallCount=");
      var16.append(var4);
      var16.append(", seekCount=");
      var16.append(var5);
      var16.append(", firstPlayWaitingMs=");
      var16.append(var10);
      var16.append(", mediaSource=");
      var16.append(var18);
      var16.append(", fileDurationSec=");
      var16.append(var1);
      var16.append(", mimeType=");
      var16.append(var17);
      var16.append(", fatalErrorCount=");
      var16.append(var2);
      var16.append(", nonFatalErrorCount=");
      var16.append(var3);
      var16.append(", totalDroppedFrames=");
      var16.append(var12);
      var16.append(", totalBandwidthBytes=");
      var16.append(var14);
      var16.append(")");
      return var16.toString();
   }

   public object `$serializer` : f0<MediaPlayFinishedAnalytics> {
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
         val var2: w0 = w0.a;
         val var1: m0 = m0.a;
         val var3: a2 = a2.a;
         return new KSerializer[]{w0.a, w0.a, m0.a, m0.a, w0.a, a.u(a2.a), e0.a, a.u(var3), var1, var1, var2, var2};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayFinishedAnalytics {
         r.h(var1, "decoder");
         val var23: SerialDescriptor = this.getDescriptor();
         val var24: c = var1.b(var23);
         var var2: Float;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         var var7: Int;
         val var8: Int;
         var var10: Long;
         var var12: Long;
         var var14: Long;
         var var18: Long;
         val var20: Long;
         var var22: Any;
         var var26: Any;
         if (var24.p()) {
            var18 = var24.f(var23, 0);
            var14 = var24.f(var23, 1);
            var5 = var24.i(var23, 2);
            var6 = var24.i(var23, 3);
            var20 = var24.f(var23, 4);
            var26 = a2.a;
            var22 = var24.n(var23, 5, a2.a, null);
            var2 = var24.u(var23, 6);
            var26 = var24.n(var23, 7, (DeserializationStrategy)var26, null);
            var4 = var24.i(var23, 8);
            val var3: Int = var24.i(var23, 9);
            var12 = var24.f(var23, 10);
            var10 = var24.f(var23, 11);
            var8 = 4095;
            var7 = var3;
         } else {
            var2 = 0.0F;
            var var30: Boolean = true;
            var5 = 0;
            var4 = 0;
            var26 = null;
            var14 = 0L;
            var var16: Long = 0L;
            var18 = 0L;
            var12 = 0L;
            var10 = 0L;
            var7 = 0;
            var6 = 0;
            var22 = null;
            var var27: Int = 0;

            while (var30) {
               val var9: Int = var24.o(var23);
               switch (var9) {
                  case -1:
                     var30 = false;
                     break;
                  case 0:
                     var18 = var24.f(var23, 0);
                     var27 |= 1;
                     break;
                  case 1:
                     var16 = var24.f(var23, 1);
                     var27 |= 2;
                     break;
                  case 2:
                     var5 = var24.i(var23, 2);
                     var27 |= 4;
                     break;
                  case 3:
                     var4 = var24.i(var23, 3);
                     var27 |= 8;
                     break;
                  case 4:
                     var14 = var24.f(var23, 4);
                     var27 |= 16;
                     break;
                  case 5:
                     var22 = var24.n(var23, 5, a2.a, var22);
                     var27 |= 32;
                     break;
                  case 6:
                     var2 = var24.u(var23, 6);
                     var27 |= 64;
                     break;
                  case 7:
                     var26 = var24.n(var23, 7, a2.a, var26);
                     var27 |= 128;
                     break;
                  case 8:
                     var6 = var24.i(var23, 8);
                     var27 |= 256;
                     break;
                  case 9:
                     var7 = var24.i(var23, 9);
                     var27 |= 512;
                     break;
                  case 10:
                     var12 = var24.f(var23, 10);
                     var27 |= 1024;
                     break;
                  case 11:
                     var10 = var24.f(var23, 11);
                     var27 |= 2048;
                     break;
                  default:
                     throw new n(var9);
               }
            }

            var6 = var4;
            var4 = var6;
            var20 = var14;
            var14 = var16;
            var8 = var27;
         }

         var24.c(var23);
         return new MediaPlayFinishedAnalytics(
            var8, var18, var14, var5, var6, var20, var22 as java.lang.String, var2, var26 as java.lang.String, var4, var7, var12, var10, null
         );
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayFinishedAnalytics) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MediaPlayFinishedAnalytics.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayFinishedAnalytics> {
         return MediaPlayFinishedAnalytics.$serializer.INSTANCE;
      }
   }
}
