package com.discord.media_player.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import on.a
import qn.b2
import qn.f0
import qn.g0
import qn.n0
import qn.x0

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
      val var6: Int = java.lang.Long.hashCode(this.stallMs);
      val var7: Int = Integer.hashCode(this.stallCount);
      val var5: Int = Integer.hashCode(this.seekCount);
      val var4: Int = java.lang.Long.hashCode(this.firstPlayWaitingMs);
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
                                 (((((((var3 * 31 + var6) * 31 + var7) * 31 + var5) * 31 + var4) * 31 + var1) * 31 + var8) * 31 + var2) * 31
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
      val var10: Long = this.playWallTimeMs;
      val var14: Long = this.stallMs;
      val var2: Int = this.stallCount;
      val var3: Int = this.seekCount;
      val var6: Long = this.firstPlayWaitingMs;
      val var16: java.lang.String = this.mediaSource;
      val var1: Float = this.fileDurationSec;
      val var18: java.lang.String = this.mimeType;
      val var5: Int = this.fatalErrorCount;
      val var4: Int = this.nonFatalErrorCount;
      val var12: Long = this.totalDroppedFrames;
      val var8: Long = this.totalBandwidthBytes;
      val var17: StringBuilder = new StringBuilder();
      var17.append("MediaPlayFinishedAnalytics(playWallTimeMs=");
      var17.append(var10);
      var17.append(", stallMs=");
      var17.append(var14);
      var17.append(", stallCount=");
      var17.append(var2);
      var17.append(", seekCount=");
      var17.append(var3);
      var17.append(", firstPlayWaitingMs=");
      var17.append(var6);
      var17.append(", mediaSource=");
      var17.append(var16);
      var17.append(", fileDurationSec=");
      var17.append(var1);
      var17.append(", mimeType=");
      var17.append(var18);
      var17.append(", fatalErrorCount=");
      var17.append(var5);
      var17.append(", nonFatalErrorCount=");
      var17.append(var4);
      var17.append(", totalDroppedFrames=");
      var17.append(var12);
      var17.append(", totalBandwidthBytes=");
      var17.append(var8);
      var17.append(")");
      return var17.toString();
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
         var1.c("playWallTimeMs", false);
         var1.c("stallMs", false);
         var1.c("stallCount", false);
         var1.c("seekCount", false);
         var1.c("firstPlayWaitingMs", false);
         var1.c("mediaSource", false);
         var1.c("fileDurationSec", false);
         var1.c("mimeType", false);
         var1.c("fatalErrorCount", false);
         var1.c("nonFatalErrorCount", false);
         var1.c("totalDroppedFrames", false);
         var1.c("totalBandwidthBytes", false);
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
         val var28: SerialDescriptor = this.getDescriptor();
         val var29: c = var1.b(var28);
         val var25: Boolean = var29.p();
         var var9: Byte = 10;
         var var2: Float;
         var var4: Int;
         var var6: Int;
         var var8: Int;
         var var15: Long;
         var var17: Long;
         var var19: Long;
         val var21: Long;
         val var23: Long;
         var var26: java.lang.String;
         val var27: java.lang.String;
         var var35: Int;
         var var38: Int;
         if (var25) {
            var19 = var29.f(var28, 0);
            var15 = var29.f(var28, 1);
            var35 = var29.i(var28, 2);
            var38 = var29.i(var28, 3);
            val var11: Long = var29.f(var28, 4);
            val var30: b2 = b2.a;
            var26 = var29.n(var28, 5, b2.a, null) as java.lang.String;
            var2 = var29.u(var28, 6);
            val var31: java.lang.String = var29.n(var28, 7, var30, null) as java.lang.String;
            var6 = var29.i(var28, 8);
            val var3: Int = var29.i(var28, 9);
            val var13: Long = var29.f(var28, 10);
            var17 = var29.f(var28, 11);
            var4 = 4095;
            var8 = var35;
            var35 = var38;
            var21 = var11;
            var27 = var31;
            var38 = var3;
            var23 = var13;
         } else {
            var15 = 0L;
            var var41: Long = 0L;
            var var40: Long = 0L;
            var19 = 0L;
            var17 = 0L;
            var var39: Boolean = true;
            var8 = 0;
            var var33: Int = 0;
            var4 = 0;
            var26 = null;
            var2 = 0.0F;
            var35 = 0;
            var var32: java.lang.String = null;
            var6 = 0;

            while (var39) {
               val var10: Int = var29.o(var28);
               switch (var10) {
                  case -1:
                     var39 = false;
                     break;
                  case 0:
                     var40 = var29.f(var28, 0);
                     var33 |= 1;
                     break;
                  case 1:
                     var41 = var29.f(var28, 1);
                     var33 |= 2;
                     break;
                  case 2:
                     var8 = var29.i(var28, 2);
                     var33 |= 4;
                     var9 = 10;
                     continue;
                  case 3:
                     var4 = var29.i(var28, 3);
                     var33 |= 8;
                     break;
                  case 4:
                     var15 = var29.f(var28, 4);
                     var33 |= 16;
                     break;
                  case 5:
                     var32 = var29.n(var28, 5, b2.a, var32) as java.lang.String;
                     var33 |= 32;
                     break;
                  case 6:
                     var2 = var29.u(var28, 6);
                     var33 |= 64;
                     break;
                  case 7:
                     var26 = var29.n(var28, 7, b2.a, var26) as java.lang.String;
                     var33 |= 128;
                     break;
                  case 8:
                     var35 = var29.i(var28, 8);
                     var33 |= 256;
                     continue;
                  case 9:
                     var6 = var29.i(var28, 9);
                     var33 |= 512;
                     continue;
                  case 10:
                     var19 = var29.f(var28, var9);
                     var33 |= 1024;
                     continue;
                  case 11:
                     var17 = var29.f(var28, 11);
                     var33 |= 2048;
                     continue;
                  default:
                     throw new n(var10);
               }

               var9 = 10;
            }

            var23 = var19;
            var38 = var6;
            var6 = var35;
            var27 = var26;
            var26 = var32;
            var21 = var15;
            var35 = var4;
            var15 = var41;
            var19 = var40;
            var4 = var33;
         }

         var29.c(var28);
         return new MediaPlayFinishedAnalytics(var4, var19, var15, var8, var35, var21, var26, var2, var27, var6, var38, var23, var17, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayFinishedAnalytics) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MediaPlayFinishedAnalytics.write$Self$media_player_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaPlayFinishedAnalytics> {
         return MediaPlayFinishedAnalytics.$serializer.INSTANCE;
      }
   }
}
