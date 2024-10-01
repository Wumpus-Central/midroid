package com.discord.fonts

import android.content.Context
import android.graphics.Typeface
import com.facebook.react.views.text.ReactFontManager
import java.util.Map.Entry
import java.util.concurrent.ConcurrentHashMap
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q
import rh.a

public enum class DiscordFont(rawName: String, weight: Int, italic: Boolean, monospace: Boolean = false) {
   CodeBold("ggmono-Bold, SourceCodePro-Bold", 700, false, true),
   CodeNormal("ggmono-Normal, SourceCodePro-Normal", 400, false, true),
   PrimaryBold("ggsans-Bold, NotoSans-Bold", 700, false, false, 8, null),
   PrimaryBoldItalic("ggsans-BoldItalic, NotoSans-BoldItalic", 700, true, false, 8, null),
   PrimaryExtraBold("ggsans-ExtraBold, NotoSans-ExtraBold", 800, false, false, 8, null),
   PrimaryExtraBoldItalic("ggsans-ExtraBoldItalic, NotoSans-ExtraBoldItalic", 800, true, false, 8, null),
   PrimaryMedium("ggsans-Medium, NotoSans-Medium", 500, false, false, 8, null),
   PrimaryMediumItalic("ggsans-MediumItalic, NotoSans-MediumItalic", 500, true, false, 8, null),
   PrimaryNormal("ggsans-Normal, NotoSans-Normal", 400, false, false, 8, null),
   PrimaryNormalItalic("ggsans-NormalItalic, NotoSans-NormalItalic", 400, true, false, 8, null),
   PrimarySemibold("ggsans-Semibold, NotoSans-Semibold", 600, false, false, 8, null),
   PrimarySemiboldItalic("ggsans-SemiboldItalic, NotoSans-SemiboldItalic", 600, true, false, 8, null);


   public final val italic: Boolean
   public final val monospace: Boolean
   public final val rawName: String
   public final val weight: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private DiscordFont[] $VALUES;
   @JvmStatic
   public DiscordFont.Companion Companion = new DiscordFont.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<DiscordFont> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   init {
      this.rawName = var3;
      this.weight = var4;
      this.italic = var5;
      this.monospace = var6;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public fun typeface(context: Context): Typeface {
      q.h(var1, "context");
      val var2: ConcurrentHashMap = typefaces;
      val var4: Typeface;
      if (typefaces.get(this) != null) {
         val var3: Any = var2.get(this);
         q.e(var3);
         q.e(var3);
         var4 = var3 as Typeface;
      } else {
         var4 = DiscordFont.Companion.access$getFontFromRN(Companion, var1, this);
         var2.put(this, var4);
      }

      return var4;
   }

   public companion object {
      private final val typefaces: ConcurrentHashMap<DiscordFont, Typeface>

      private fun getFontFromRN(context: Context, font: DiscordFont): Typeface {
         val var3: Typeface = ReactFontManager.getInstance().getTypeface(var2.getRawName(), 0, var1.getAssets());
         q.g(var3, "getTypeface(...)");
         if (!q.c(var3, Typeface.DEFAULT)) {
            return var3;
         } else {
            val var4: StringBuilder = new StringBuilder();
            var4.append("Cannot find typeface ");
            var4.append(var3);
            var4.append(".rawName");
            throw new IllegalStateException(var4.toString().toString());
         }
      }

      public fun findByStyle(weight: Int, italic: Boolean, monospace: Boolean = false): DiscordFont? {
         val var5: java.util.Iterator = DiscordFont.getEntries().iterator();

         var var4: Any;
         do {
            if (!var5.hasNext()) {
               var4 = null;
               break;
            }

            var4 = var5.next();
         } while (((DiscordFont)var4).getWeight() != var1 || ((DiscordFont)var4).getItalic() != var2 || ((DiscordFont)var4).getMonospace() != var3);

         return var4 as DiscordFont;
      }

      public fun fromTypeface(typeface: Typeface?): DiscordFont? {
         if (var1 == null) {
            return null;
         } else {
            val var3: java.util.Set = DiscordFont.access$getTypefaces$cp().entrySet();
            q.g(var3, "<get-entries>(...)");
            val var4: java.util.Iterator = var3.iterator();

            while (true) {
               if (var4.hasNext()) {
                  val var7: Any = var4.next();
                  if (!q.c((var7 as Entry).getValue(), var1)) {
                     continue;
                  }

                  var5 = var7;
                  break;
               }

               var5 = null;
               break;
            }

            val var8: Entry = var5 as Entry;
            var var6: DiscordFont = null;
            if (var8 != null) {
               var6 = var8.getKey() as DiscordFont;
            }

            return var6;
         }
      }
   }
}
