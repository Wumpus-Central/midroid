package com.discord.fonts

import android.content.Context
import android.graphics.Typeface
import com.facebook.react.views.text.ReactFontManager
import java.util.Map.Entry
import java.util.concurrent.ConcurrentHashMap
import kotlin.jvm.internal.r

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
   private DiscordFont[] $VALUES = $values();
   @JvmStatic
   public DiscordFont.Companion Companion = new DiscordFont.Companion(null);

   init {
      this.rawName = var3;
      this.weight = var4;
      this.italic = var5;
      this.monospace = var6;
   }

   public fun typeface(context: Context): Typeface {
      r.h(var1, "context");
      val var2: ConcurrentHashMap = typefaces;
      val var4: Typeface;
      if (typefaces.get(this) != null) {
         val var3: Any = var2.get(this);
         r.e(var3);
         r.g(var3, "{\n            typefaces[this]!!\n        }");
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
         val var4: Typeface = ReactFontManager.getInstance().getTypeface(var2.getRawName(), 0, var1.getAssets());
         r.g(var4, "getInstance()\n          …e.NORMAL, context.assets)");
         if (!r.c(var4, Typeface.DEFAULT)) {
            return var4;
         } else {
            val var3: StringBuilder = new StringBuilder();
            var3.append("Cannot find typeface ");
            var3.append(var4);
            var3.append(".rawName");
            throw new IllegalStateException(var3.toString().toString());
         }
      }

      public fun findByStyle(weight: Int, italic: Boolean, monospace: Boolean = false): DiscordFont? {
         val var8: Array<DiscordFont> = DiscordFont.values();
         val var6: Int = var8.length;
         var var4: Int = 0;

         var var7: DiscordFont;
         while (true) {
            if (var4 >= var6) {
               var7 = null;
               break;
            }

            var7 = var8[var4];
            val var5: Boolean;
            if (var8[var4].getWeight() == var1 && var8[var4].getItalic() == var2 && var8[var4].getMonospace() == var3) {
               var5 = true;
            } else {
               var5 = false;
            }

            if (var5) {
               break;
            }

            var4++;
         }

         return var7;
      }

      public fun fromTypeface(typeface: Typeface?): DiscordFont? {
         if (var1 == null) {
            return null;
         } else {
            val var3: java.util.Set = DiscordFont.access$getTypefaces$cp().entrySet();
            r.g(var3, "typefaces.entries");
            val var4: java.util.Iterator = var3.iterator();

            while (true) {
               if (var4.hasNext()) {
                  val var7: Any = var4.next();
                  if (!r.c((var7 as Entry).getValue(), var1)) {
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
