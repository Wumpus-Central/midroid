package com.discord.fonts

import android.content.Context
import android.content.res.AssetManager
import android.graphics.Typeface
import com.facebook.react.views.text.ReactFontManager
import java.util.Map.Entry
import java.util.concurrent.ConcurrentHashMap
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.SourceDebugExtension
import pt.a

public enum class DiscordFont(rawName: String, weight: Int, italic: Boolean, monospace: Boolean = false) {
   CodeBold("ggmono-Bold, SourceCodePro-Bold", 700, false, true),
   CodeNormal("ggmono-Normal, SourceCodePro-Normal", 400, false, true),
   DisplayExtraBold("ABCGintoNord-ExtraBold, ggsans-ExtraBold, NotoSans-ExtraBold", 800, false, false, 8, null),
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


   public final val rawName: String
   public final val weight: Int
   public final val italic: Boolean
   public final val monospace: Boolean
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
      val var2: ConcurrentHashMap = typefaces;
      if (typefaces.get(this) != null) {
         val var4: Any = var2.get(this);
         return var4 as Typeface;
      } else {
         val var3: Typeface = DiscordFont.Companion.access$getFontFromRN(Companion, var1, this);
         var2.put(this, var3);
         return var3;
      }
   }

   @SourceDebugExtension(["SMAP\nDiscordFont.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscordFont.kt\ncom/discord/fonts/DiscordFont$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"])
   public companion object {
      private final val typefaces: ConcurrentHashMap<DiscordFont, Typeface>

      private fun getFontFromRN(context: Context, font: DiscordFont): Typeface {
         val var3: ReactFontManager = ReactFontManager.Companion.getInstance();
         val var6: java.lang.String = var2.getRawName();
         val var4: AssetManager = var1.getAssets();
         val var7: Typeface = var3.getTypeface(var6, 0, var4);
         if (!(var7 == Typeface.DEFAULT)) {
            return var7;
         } else {
            val var5: StringBuilder = new StringBuilder();
            var5.append("Cannot find typeface ");
            var5.append(var7);
            var5.append(".rawName");
            throw new IllegalStateException(var5.toString().toString());
         }
      }

      public fun findByStyle(weight: Int, italic: Boolean, monospace: Boolean = false): DiscordFont? {
         val var6: java.util.Iterator = DiscordFont.getEntries().iterator();

         var var4: Any;
         do {
            if (!var6.hasNext()) {
               var4 = null;
               break;
            }

            var4 = var6.next();
         } while (((DiscordFont)var4).getWeight() != var1 || ((DiscordFont)var4).getItalic() != var2 || ((DiscordFont)var4).getMonospace() != var3);

         return var4 as DiscordFont;
      }

      public fun fromTypeface(typeface: Typeface?): DiscordFont? {
         if (var1 == null) {
            return null;
         } else {
            var var2: java.util.Set = DiscordFont.access$getTypefaces$cp().entrySet();
            val var3: java.util.Iterator = var2.iterator();

            while (true) {
               if (var3.hasNext()) {
                  var2 = (java.util.Set)var3.next();
                  if (!((var2 as Entry).getValue() == var1)) {
                     continue;
                  }

                  var4 = var2;
                  break;
               }

               var4 = null;
               break;
            }

            return if (var4 as Entry != null) (var4 as Entry).getKey() as DiscordFont else null;
         }
      }
   }
}
