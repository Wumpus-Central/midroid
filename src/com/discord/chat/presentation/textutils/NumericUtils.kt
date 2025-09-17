package com.discord.chat.presentation.textutils

import java.util.ArrayList
import java.util.TreeMap
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nNumericUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NumericUtils.kt\ncom/discord/chat/presentation/textutils/NumericUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1#2:66\n827#3:67\n855#3,2:68\n*S KotlinDebug\n*F\n+ 1 NumericUtils.kt\ncom/discord/chat/presentation/textutils/NumericUtils\n*L\n6#1:67\n6#1:68,2\n*E\n"])
public object NumericUtils {
   private final val letters: List<String>
   private final val romanNumeralMap: TreeMap<Long, String>

   @JvmStatic
   fun {
      val var1: java.util.List = StringsKt.split$default("abcdefghijklmnopqrstuvwxyz", new java.lang.String[]{""}, false, 0, 6, null);
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
            val var10: Long = kotlin.ranges.d.e(var1 % (long)26, 1L);
            val var11: java.lang.String = this.toLetter(var1 / (long)26);
            val var9: java.lang.String = this.toLetter(var10);
            val var8: StringBuilder = new StringBuilder();
            var8.append(var11);
            var8.append(var9);
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
         val var3: Long = (var6 as java.lang.Number).longValue();
         val var10: java.lang.String;
         if (var1 == var3) {
            val var9: Any = var8.get(var1);
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
