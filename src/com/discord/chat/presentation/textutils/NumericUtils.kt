package com.discord.chat.presentation.textutils

import java.util.ArrayList
import java.util.TreeMap
import kotlin.jvm.internal.r

public object NumericUtils {
   private final val letters: List<String>
   private final val romanNumeralMap: TreeMap<Long, String>

   @JvmStatic
   fun {
      val var2: java.util.List = kotlin.text.f.A0("abcdefghijklmnopqrstuvwxyz", new java.lang.String[]{""}, false, 0, 6, null);
      val var1: ArrayList = new ArrayList();

      for (var2 : var2) {
         val var0: Boolean;
         if ((var2 as java.lang.String).length() == 0) {
            var0 = true;
         } else {
            var0 = false;
         }

         if (!var0) {
            var1.add(var2);
         }
      }

      letters = var1;
      val var4: TreeMap = new TreeMap();
      romanNumeralMap = var4;
      var4.put(1000L, "m");
      var4.put(900L, "cm");
      var4.put(500L, "d");
      var4.put(400L, "cm");
      var4.put(100L, "c");
      var4.put(90L, "xc");
      var4.put(50L, "l");
      var4.put(40L, "xl");
      var4.put(10L, "x");
      var4.put(9L, "ix");
      var4.put(5L, "v");
      var4.put(4L, "iv");
      var4.put(1L, "i");
   }

   public fun toLetter(number: Long): String {
      val var3: Boolean;
      if (var1 >= 1L) {
         var3 = true;
      } else {
         var3 = false;
      }

      if (var3) {
         if (var1 <= 26L) {
            return letters.get((int)var1 - 1);
         } else {
            val var11: Long = vh.h.d(var1 % (long)26, 1L);
            val var9: java.lang.String = this.toLetter(var1 / (long)26);
            val var12: java.lang.String = this.toLetter(var11);
            val var10: StringBuilder = new StringBuilder();
            var10.append(var9);
            var10.append(var12);
            return var10.toString();
         }
      } else {
         val var8: StringBuilder = new StringBuilder();
         var8.append("Number must be at least 1. Provided: ");
         var8.append(var1);
         throw new IllegalArgumentException(var8.toString().toString());
      }
   }

   public fun toRomanNumeral(number: Long): String {
      val var3: Boolean;
      if (var1 >= 1L) {
         var3 = true;
      } else {
         var3 = false;
      }

      if (var3) {
         val var7: TreeMap = romanNumeralMap;
         var var9: java.lang.String = romanNumeralMap.floorKey(var1);
         r.e(var9);
         val var4: Long = (var9 as java.lang.Number).longValue();
         if (var1 == var4) {
            var9 = (java.lang.String)var7.get(var1);
            r.e(var9);
            r.g(var9, "{\n            romanNumeralMap[number]!!\n        }");
            var9 = var9;
         } else {
            val var8: Any = var7.get(var4);
            val var13: java.lang.String = this.toRomanNumeral(var1 - var4);
            val var12: StringBuilder = new StringBuilder();
            var12.append(var8);
            var12.append(var13);
            var9 = var12.toString();
         }

         return var9;
      } else {
         val var6: StringBuilder = new StringBuilder();
         var6.append("Number must be at least 1. Provided: ");
         var6.append(var1);
         throw new IllegalArgumentException(var6.toString().toString());
      }
   }
}
