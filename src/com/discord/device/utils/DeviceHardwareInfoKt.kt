package com.discord.device.utils

import android.os.Build.VERSION
import java.io.File
import java.io.FileReader
import java.io.IOException
import java.util.Arrays
import java.util.Locale
import java.util.Scanner
import kotlin.jvm.internal.l0
import kotlin.jvm.internal.q
import p0.c

internal fun getNumCpuCores(): Int {
   return Runtime.getRuntime().availableProcessors();
}

internal fun getSocFromProcCpuInfo(): String {
   val var1: Scanner = new Scanner(new File("/proc/cpuinfo"));

   var var0: java.lang.String;
   while (true) {
      if (var1.hasNextLine()) {
         var0 = var1.nextLine();
         q.e(var0);
         if (!h.H(var0, "Hardware", false, 2, null)) {
            continue;
         }

         var0 = h.X0(h.z0(var0, new java.lang.String[]{":"}, false, 0, 6, null).get(1) as java.lang.String).toString();
         break;
      }

      var0 = "";
      break;
   }

   return var0;
}

internal fun maxCpuFreq(): String {
   val var3: Int = getNumCpuCores();
   var var2: Int = 0;
   var var6: Long = 0L;

   while (true) {
      var var10: java.lang.String = "";
      if (var2 >= var3) {
         if (var6 > 0L) {
            val var0: Double = var6 / 1000000.0;
            val var15: l0 = l0.a;
            var10 = java.lang.String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{var0}, 1));
            q.g(var10, "format(...)");
         }

         return var10;
      }

      var var8: Long;
      try {
         val var13: StringBuilder = new StringBuilder();
         var13.append("/sys/devices/system/cpu/cpu");
         var13.append(var2);
         var13.append("/cpufreq/cpuinfo_max_freq");
         val var16: Scanner = new Scanner(new FileReader(var13.toString()));
         var8 = var16.nextLong();
         var16.close();
      } catch (var12: IOException) {
         return "";
      }

      var var4: Long = var6;
      if (var8 > var6) {
         var4 = var8;
      }

      var2++;
      var6 = var4;
   }
}

internal fun ramSize(): String {
   val var5: Scanner = new Scanner(new File("/proc/meminfo"));

   var var4: java.lang.String;
   var var8: java.lang.String;
   while (true) {
      val var2: Boolean = var5.hasNextLine();
      var4 = "";
      if (var2) {
         var8 = var5.nextLine();
         q.e(var8);
         if (!h.H(var8, "MemTotal", false, 2, null)) {
            continue;
         }

         val var7: MatchResult = Regex.c(
            new Regex("\\d+"), h.X0(h.z0(var8, new java.lang.String[]{":"}, false, 0, 6, null).get(1) as java.lang.String).toString(), 0, 2, null
         );
         if (var7 != null) {
            val var10: java.lang.String = var7.getValue();
            var8 = var10;
            if (var10 != null) {
               break;
            }
         }
      }

      var8 = "";
      break;
   }

   if (var8.length() > 0) {
      val var0: Double = java.lang.Long.parseLong(var8) / 1048576.0;
      val var9: l0 = l0.a;
      var4 = java.lang.String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{var0}, 1));
      q.g(var4, "format(...)");
   }

   return var4;
}

internal fun socName(): String {
   if (VERSION.SDK_INT >= 31) {
      var var0: java.lang.String = a.a();
      q.g(var0, "SOC_MANUFACTURER");
      if (var0.length() == 0) {
         var0 = c.a();
         q.g(var0, "SOC_MODEL");
         if (var0.length() == 0) {
            return getSocFromProcCpuInfo();
         }
      }

      val var1: java.lang.String = a.a();
      val var2: java.lang.String = c.a();
      val var4: StringBuilder = new StringBuilder();
      var4.append(var1);
      var4.append("_");
      var4.append(var2);
      return var4.toString();
   } else {
      return getSocFromProcCpuInfo();
   }
}
