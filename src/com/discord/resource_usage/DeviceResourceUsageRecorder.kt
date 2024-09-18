package com.discord.resource_usage

import android.net.TrafficStats
import android.os.Process
import android.os.Build.VERSION
import android.telephony.TelephonyManager
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.WritableNativeMap
import dh.w
import kotlin.jvm.internal.q
import okhttp3.Response
import okhttp3.ResponseBody
import okhttp3.Interceptor.Chain
import okio.BufferedSource
import wl.e

public class DeviceResourceUsageRecorder {
   @JvmStatic
   fun {
      val var0: Int = Process.myUid();
      uid = var0;
      initialAppReceiveBytes = TrafficStats.getUidRxBytes(var0);
      initialAppSendBytes = TrafficStats.getUidTxBytes(var0);
   }

   public companion object {
      private final val downloads: com.discord.resource_usage.DeviceResourceUsageRecorder.RequestStats
      private final val fresco: com.discord.resource_usage.DeviceResourceUsageRecorder.RequestStats
      private final val initialAppReceiveBytes: Long
      private final val initialAppSendBytes: Long
      private final var initialCellularReceiveBytes: Long
      private final var initialCellularSendBytes: Long
      private final var initialTotalReceiveBytes: Long
      private final var initialTotalSendBytes: Long

      public final var mediaPlayerBytesReceived: Long
         internal set

      private final val ota: com.discord.resource_usage.DeviceResourceUsageRecorder.RequestStats

      public final var socketBytesReceived: Long
         internal set

      private final val uid: Int
      private final val xhr: com.discord.resource_usage.DeviceResourceUsageRecorder.RequestStats

      private fun requestStatsInterceptor(chain: Chain, stats: com.discord.resource_usage.DeviceResourceUsageRecorder.RequestStats): Response {
         val var4: Response = var1.a(var1.v());
         val var3: ResponseBody = var4.a();
         var2.setNumRequests(var2.getNumRequests() + 1);
         if (e.b(var4) && var3 != null) {
            val var5: BufferedSource = var3.source();
            var5.r(java.lang.Long.MAX_VALUE);
            var2.setBytesReceived(var2.getBytesReceived() + var5.j().W1());
         }

         return var4;
      }

      public fun bundleUpdaterInterceptor(chain: Chain): Response {
         q.h(var1, "chain");
         return this.requestStatsInterceptor(var1, DeviceResourceUsageRecorder.access$getOta$cp());
      }

      public fun clientXHRInterceptor(chain: Chain): Response {
         q.h(var1, "chain");
         return this.requestStatsInterceptor(var1, DeviceResourceUsageRecorder.access$getXhr$cp());
      }

      public fun downloadInterceptor(chain: Chain): Response {
         q.h(var1, "chain");
         return this.requestStatsInterceptor(var1, DeviceResourceUsageRecorder.access$getDownloads$cp());
      }

      public fun frescoInterceptor(chain: Chain): Response {
         q.h(var1, "chain");
         return this.requestStatsInterceptor(var1, DeviceResourceUsageRecorder.access$getFresco$cp());
      }

      public fun getNetworkUsage(reactApplicationContext: ReactApplicationContext): WritableNativeMap {
         q.h(var1, "reactApplicationContext");

         label47: {
            var var4: TelephonyManager;
            label42: {
               label48: {
                  try {
                     val var10: Any = var1.getSystemService("phone");
                     q.f(var10, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                     var4 = var10 as TelephonyManager;
                     if (VERSION.SDK_INT < 28) {
                        break label48;
                     }

                     var11 = a.a(var4);
                  } catch (var8: Exception) {
                     var9 = new Pair(null, null);
                     break label47;
                  }

                  val var2: Int;
                  if (var11 != null) {
                     try {
                        var2 = var11.getLevel();
                     } catch (var7: Exception) {
                        var9 = new Pair(null, null);
                        break label47;
                     }
                  } else {
                     var2 = 0;
                  }

                  try {
                     var12 = var2;
                     break label42;
                  } catch (var6: Exception) {
                     var9 = new Pair(null, null);
                     break label47;
                  }
               }

               var12 = null;
            }

            var var3: Pair;
            try {
               var3 = new Pair(var12, var4.isNetworkRoaming());
            } catch (var5: Exception) {
               var9 = new Pair(null, null);
               break label47;
            }

            var9 = var3;
         }

         return NativeMapExtensionsKt.nativeMapOf(
            w.a("signalStrengthLevel", var9.a() as Int),
            w.a("isNetworkRoaming", var9.b() as java.lang.Boolean),
            w.a("cellularReceiveBytes", TrafficStats.getMobileRxBytes() - DeviceResourceUsageRecorder.access$getInitialCellularReceiveBytes$cp()),
            w.a("cellularSendBytes", TrafficStats.getMobileTxBytes() - DeviceResourceUsageRecorder.access$getInitialCellularSendBytes$cp()),
            w.a("totalReceiveBytes", TrafficStats.getTotalRxBytes() - DeviceResourceUsageRecorder.access$getInitialTotalReceiveBytes$cp()),
            w.a("totalSendBytes", TrafficStats.getTotalTxBytes() - DeviceResourceUsageRecorder.access$getInitialTotalSendBytes$cp()),
            w.a(
               "uidReceiveBytes",
               TrafficStats.getUidRxBytes(DeviceResourceUsageRecorder.access$getUid$cp()) - DeviceResourceUsageRecorder.access$getInitialAppReceiveBytes$cp()
            ),
            w.a(
               "uidSendBytes",
               TrafficStats.getUidTxBytes(DeviceResourceUsageRecorder.access$getUid$cp()) - DeviceResourceUsageRecorder.access$getInitialAppSendBytes$cp()
            ),
            w.a("socketBytesReceived", this.getSocketBytesReceived()),
            w.a("otaBytesReceived", DeviceResourceUsageRecorder.access$getOta$cp().getBytesReceived()),
            w.a("otaNumRequests", DeviceResourceUsageRecorder.access$getOta$cp().getNumRequests()),
            w.a("xhrBytesReceived", DeviceResourceUsageRecorder.access$getXhr$cp().getBytesReceived()),
            w.a("xhrNumRequests", DeviceResourceUsageRecorder.access$getXhr$cp().getNumRequests()),
            w.a("frescoBytesReceived", DeviceResourceUsageRecorder.access$getFresco$cp().getBytesReceived()),
            w.a("frescoNumRequests", DeviceResourceUsageRecorder.access$getFresco$cp().getNumRequests()),
            w.a("downloadBytesReceived", DeviceResourceUsageRecorder.access$getDownloads$cp().getBytesReceived()),
            w.a("downloadNumRequests", DeviceResourceUsageRecorder.access$getDownloads$cp().getNumRequests()),
            w.a("mediaPlayerBytesReceived", this.getMediaPlayerBytesReceived())
         );
      }
   }

   public data class RequestStats(numRequests: Int = 0, bytesReceived: Long = 0L) {
      public final var bytesReceived: Long
         internal set

      public final var numRequests: Int
         internal set

      fun RequestStats() {
         this(0, 0L, 3, null);
      }

      init {
         this.numRequests = var1;
         this.bytesReceived = var2;
      }

      public operator fun component1(): Int {
         return this.numRequests;
      }

      public operator fun component2(): Long {
         return this.bytesReceived;
      }

      public fun copy(numRequests: Int = var0.numRequests, bytesReceived: Long = var0.bytesReceived): com.discord.resource_usage.DeviceResourceUsageRecorder.RequestStats {
         return new DeviceResourceUsageRecorder.RequestStats(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is DeviceResourceUsageRecorder.RequestStats) {
            return false;
         } else {
            var1 = var1;
            if (this.numRequests != var1.numRequests) {
               return false;
            } else {
               return this.bytesReceived == var1.bytesReceived;
            }
         }
      }

      public override fun hashCode(): Int {
         return Integer.hashCode(this.numRequests) * 31 + java.lang.Long.hashCode(this.bytesReceived);
      }

      public override fun toString(): String {
         val var1: Int = this.numRequests;
         val var2: Long = this.bytesReceived;
         val var4: StringBuilder = new StringBuilder();
         var4.append("RequestStats(numRequests=");
         var4.append(var1);
         var4.append(", bytesReceived=");
         var4.append(var2);
         var4.append(")");
         return var4.toString();
      }
   }
}
