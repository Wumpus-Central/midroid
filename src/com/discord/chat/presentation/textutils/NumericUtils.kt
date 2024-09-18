package com.discord.chat.presentation.textutils

import java.util.ArrayList
import java.util.TreeMap
import kotlin.jvm.internal.q

public object NumericUtils {
   private final val letters: List<String>
   private final val romanNumeralMap: TreeMap<Long, String>

   @JvmStatic
   fun {
      val var1: java.util.List = kotlin.text.h.z0("abcdefghijklmnopqrstuvwxyz", new java.lang.String[]{""}, false, 0, 6, null);
      val var0: ArrayList = new ArrayList();

      for (Object var2 : var1) {
         if ((var2 as java.lang.String).length() != 0) {
            var0.add(var2);
         }
      }

      letters = var0;
      val var3: TreeMap = new TreeMap();
      romanNumeralMap = var3;
      var3.put(1000L, "m");
      var3.put(900L, "cm");
      var3.put(500L, "d");
      var3.put(400L, "cm");
      var3.put(100L, "c");
      var3.put(90L, "xc");
      var3.put(50L, "l");
      var3.put(40L, "xl");
      var3.put(10L, "x");
      var3.put(9L, "ix");
      var3.put(5L, "v");
      var3.put(4L, "iv");
      var3.put(1L, "i");
   }

   public fun toLetter(number: Long): String {
      if (var1 >= 1L) {
         if (var1 <= 26L) {
            return letters.get((int)var1 - 1);
         } else {
            val var10: Long = kotlin.ranges.f.d(var1 % (long)26, 1L);
            val var9: java.lang.String = this.toLetter(var1 / (long)26);
            val var11: java.lang.String = this.toLetter(var10);
            val var8: StringBuilder = new StringBuilder();
            var8.append(var9);
            var8.append(var11);
            return var8.toString();
         }
      } else {
         val var7: StringBuilder = new StringBuilder();
         var7.append("Number must be at least 1. Provided: ");
         var7.append(var1);
         throw new IllegalArgumentException(var7.toString().toString());
      }
   }

   public fun toRomanNumeral(number: Long): String {
      if (var1 >= 1L) {
         val var8: TreeMap = romanNumeralMap;
         var var6: Any = romanNumeralMap.floorKey(var1);
         q.e(var6);
         val var3: Long = (var6 as java.lang.Number).longValue();
         val var10: java.lang.String;
         if (var1 == var3) {
            val var9: Any = var8.get(var1);
            q.e(var9);
            q.e(var9);
            var10 = var9 as java.lang.String;
         } else {
            val var7: Any = var8.get(var3);
            var6 = this.toRomanNumeral(var1 - var3);
            val var11: StringBuilder = new StringBuilder();
            var11.append(var7);
            var11.append((java.lang.String)var6);
            var10 = var11.toString();
         }

         return var10;
      } else {
         val var5: StringBuilder = new StringBuilder();
         var5.append("Number must be at least 1. Provided: ");
         var5.append(var1);
         throw new IllegalArgumentException(var5.toString().toString());
      }
   }
}
