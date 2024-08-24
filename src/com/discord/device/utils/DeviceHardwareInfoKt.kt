package com.discord.device.utils

import android.os.Build.VERSION
import java.io.File
import java.io.FileReader
import java.io.IOException
import java.util.Arrays
import java.util.Locale
import java.util.Scanner
import kotlin.jvm.internal.m0
import kotlin.jvm.internal.r

internal fun getNumCpuCores(): Int {
   return Runtime.getRuntime().availableProcessors();
}

internal fun getSocFromProcCpuInfo(): String {
   val var1: Scanner = new Scanner(new File("/proc/cpuinfo"));

   var var0: java.lang.String;
   while (true) {
      if (var1.hasNextLine()) {
         var0 = var1.nextLine();
         r.g(var0, "line");
         if (!f.I(var0, "Hardware", false, 2, null)) {
            continue;
         }

         var0 = f.W0(f.A0(var0, new java.lang.String[]{":"}, false, 0, 6, null).get(1) as java.lang.String).toString();
         break;
      }

      var0 = "";
      break;
   }

   return var0;
}

internal fun maxCpuFreq(): String {
   val var3: Int = getNumCpuCores();
   var var6: Long = 0L;
   var var2: Int = 0;

   while (true) {
      var var10: java.lang.String = "";
      if (var2 >= var3) {
         if (var6 > 0L) {
            val var0: Double = var6 / 1000000.0;
            val var15: m0 = m0.a;
            var10 = java.lang.String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{var0}, 1));
            r.g(var10, "format(locale, format, *args)");
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
   val var4: Scanner = new Scanner(new File("/proc/meminfo"));

   var var5: java.lang.String;
   while (true) {
      val var3: Boolean = var4.hasNextLine();
      var5 = "";
      if (var3) {
         var var6: java.lang.String = var4.nextLine();
         r.g(var6, "line");
         if (!f.I(var6, "MemTotal", false, 2, null)) {
            continue;
         }

         val var8: MatchResult = Regex.c(
            new Regex("\\d+"), f.W0(f.A0(var6, new java.lang.String[]{":"}, false, 0, 6, null).get(1) as java.lang.String).toString(), 0, 2, null
         );
         if (var8 != null) {
            var6 = var8.getValue();
            var9 = var6;
            if (var6 != null) {
               break;
            }
         }
      }

      var9 = "";
      break;
   }

   val var2: Boolean;
   if (var9.length() > 0) {
      var2 = true;
   } else {
      var2 = false;
   }

   if (var2) {
      val var0: Double = java.lang.Long.parseLong(var9) / 1048576.0;
      val var10: m0 = m0.a;
      var5 = java.lang.String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{var0}, 1));
      r.g(var5, "format(locale, format, *args)");
   }

   return var5;
}

internal fun socName(): String {
   if (VERSION.SDK_INT >= 31) {
      var var2: java.lang.String = a.a();
      r.g(var2, "SOC_MANUFACTURER");
      var var5: Boolean;
      if (var2.length() == 0) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (var5) {
         var2 = b.a();
         r.g(var2, "SOC_MODEL");
         if (var2.length() == 0) {
            var5 = true;
         } else {
            var5 = false;
         }

         if (var5) {
            return getSocFromProcCpuInfo();
         }
      }

      var2 = a.a();
      val var4: java.lang.String = b.a();
      val var3: StringBuilder = new StringBuilder();
      var3.append(var2);
      var3.append("_");
      var3.append(var4);
      return var3.toString();
   } else {
      return getSocFromProcCpuInfo();
   }
}
