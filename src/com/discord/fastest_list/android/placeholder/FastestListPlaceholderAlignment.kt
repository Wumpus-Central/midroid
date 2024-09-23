package com.discord.fastest_list.android.placeholder

import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q
import uh.a

internal object FastestListPlaceholderAlignment {
   public enum class Horizontal {
      CENTER,
      LEFT,
      RIGHT      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private FastestListPlaceholderAlignment.Horizontal[] $VALUES;
      @JvmStatic
      public FastestListPlaceholderAlignment.Horizontal.Companion Companion = new FastestListPlaceholderAlignment.Horizontal.Companion(null);

      @JvmStatic
      fun {
         val var0: Array<FastestListPlaceholderAlignment.Horizontal> = $values();
         $VALUES = var0;
         $ENTRIES = a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }

      public companion object {
         public fun parse(value: String): com.discord.fastest_list.android.placeholder.FastestListPlaceholderAlignment.Horizontal {
            q.h(var1, "value");
            val var2: Int = var1.hashCode();
            if (var2 != -1364013995) {
               if (var2 != 3317767) {
                  if (var2 == 108511772 && var1.equals("right")) {
                     return FastestListPlaceholderAlignment.Horizontal.RIGHT;
                  }
               } else if (var1.equals("left")) {
                  return FastestListPlaceholderAlignment.Horizontal.LEFT;
               }
            } else if (var1.equals("center")) {
               return FastestListPlaceholderAlignment.Horizontal.CENTER;
            }

            val var3: StringBuilder = new StringBuilder();
            var3.append("Unknown alignment: ");
            var3.append(var1);
            throw new IllegalStateException(var3.toString().toString());
         }
      }
   }

   public enum class Vertical {
      BOTTOM,
      CENTER,
      TOP      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private FastestListPlaceholderAlignment.Vertical[] $VALUES;
      @JvmStatic
      public FastestListPlaceholderAlignment.Vertical.Companion Companion = new FastestListPlaceholderAlignment.Vertical.Companion(null);

      @JvmStatic
      fun {
         val var0: Array<FastestListPlaceholderAlignment.Vertical> = $values();
         $VALUES = var0;
         $ENTRIES = a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }

      public companion object {
         public fun parse(value: String): com.discord.fastest_list.android.placeholder.FastestListPlaceholderAlignment.Vertical {
            q.h(var1, "value");
            val var2: Int = var1.hashCode();
            if (var2 != -1383228885) {
               if (var2 != -1364013995) {
                  if (var2 == 115029 && var1.equals("top")) {
                     return FastestListPlaceholderAlignment.Vertical.TOP;
                  }
               } else if (var1.equals("center")) {
                  return FastestListPlaceholderAlignment.Vertical.CENTER;
               }
            } else if (var1.equals("bottom")) {
               return FastestListPlaceholderAlignment.Vertical.BOTTOM;
            }

            val var3: StringBuilder = new StringBuilder();
            var3.append("Unknown alignment: ");
            var3.append(var1);
            throw new IllegalStateException(var3.toString().toString());
         }
      }
   }
}
