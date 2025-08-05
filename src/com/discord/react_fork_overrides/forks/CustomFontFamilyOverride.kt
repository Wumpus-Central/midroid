package com.discord.react_fork_overrides.forks

import android.content.res.AssetManager
import android.graphics.Typeface
import android.graphics.Typeface.CustomFallbackBuilder
import android.graphics.fonts.Font
import android.graphics.fonts.FontFamily
import android.os.Build.VERSION
import com.facebook.react.views.text.CreateTypefaceObject
import com.facebook.react.views.text.ReactFontManager
import java.util.ArrayList
import java.util.Locale
import kotlin.jvm.internal.r

internal object CustomFontFamilyOverride {
   private final val FILE_EXTENSIONS: Array<String>
   private const val FONTS_ASSET_PATH: String = "fonts/"

   private fun createAssetTypeface(fontFamilyName: String?, style: Int, assetManager: AssetManager): Typeface {
      var var11: java.lang.String = var1;
      if (var1 == null) {
         var11 = "";
      }

      val var12: Array<java.lang.String> = kotlin.text.h.B0(var11, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]);
      val var10: Int = var12.length;

      for (int var6 = 0; var6 < var10; var6++) {
         var1 = var12[var6];
         var var5: Int = var12[var6].length() - 1;
         var var4: Int = 0;
         var var7: Boolean = false;

         while (var4 <= var5) {
            val var8: Int;
            if (!var7) {
               var8 = var4;
            } else {
               var8 = var5;
            }

            val var23: Boolean;
            if (r.j(var1.charAt(var8), 32) <= 0) {
               var23 = true;
            } else {
               var23 = false;
            }

            if (!var7) {
               if (!var23) {
                  var7 = true;
               } else {
                  var4++;
               }
            } else {
               if (!var23) {
                  break;
               }

               var5--;
            }
         }

         var12[var6] = var1.subSequence(var4, var5 + 1).toString();
      }

      var1 = var11;
      if (var12.length > 1) {
         if (VERSION.SDK_INT >= 29) {
            return this.createAssetTypefaceWithFallbacks(var12, var2, var3);
         }

         var1 = var12[0];
      }

      var11 = var1;
      if (var12.length > 1) {
         var11 = var1;
         if (VERSION.SDK_INT < 29) {
            var11 = var1;
            if ((var2 and 2) != 0) {
               var11 = kotlin.text.h.A(
                  kotlin.text.h.A(
                     kotlin.text.h.A(
                        kotlin.text.h.A(kotlin.text.h.A(var1, "Normal", "NormalItalic", true), "Medium", "MediumItalic", true),
                        "Semibold",
                        "SemiboldItalic",
                        true
                     ),
                     "Bold",
                     "BoldItalic",
                     true
                  ),
                  "ExtraBold",
                  "ExtraBoldItalic",
                  true
               );
            }

            var1 = var11;
            if ((var2 and 1) != 0) {
               var1 = kotlin.text.h.A(kotlin.text.h.A(kotlin.text.h.A(var11, "Normal", "Bold", true), "Medium", "Bold", true), "Semibold", "Bold", true);
            }

            var11 = kotlin.text.h.A(kotlin.text.h.A(var1, "ItalicItalic", "Italic", true), "BoldBold", "Bold", true);
         }
      }

      val var19: Array<java.lang.String> = FILE_EXTENSIONS;
      val var22: Int = FILE_EXTENSIONS.length;

      for (int var21 = 0; var21 < var22; var21++) {
         val var26: java.lang.String = var19[var21];
         val var13: StringBuilder = new StringBuilder();
         var13.append("fonts/");
         var13.append(var11);
         var13.append(var26);
         val var27: java.lang.String = var13.toString();
         r.g(var27, "toString(...)");

         try {
            return Typeface.createFromAsset(var3, var27);
         } catch (var14: RuntimeException) {
         }
      }

      val var20: Typeface = Typeface.create(var11, var2);
      r.g(var20, "create(...)");
      return var20;
   }

   private fun createAssetTypefaceWithFallbacks(fontFamilyNames: Array<String>, style: Int, assetManager: AssetManager): Typeface {
      val var11: ArrayList = new ArrayList();
      val var7: Int = var1.length;

      for (int var4 = 0; var4 < var7; var4++) {
         var var10: java.lang.String = var1[var4];
         var var9: java.lang.String = var1[var4];
         if ((var2 and 2) != 0) {
            var9 = kotlin.text.h.A(
               kotlin.text.h.A(
                  kotlin.text.h.A(
                     kotlin.text.h.A(kotlin.text.h.A(var10, "Normal", "NormalItalic", true), "Medium", "MediumItalic", true),
                     "Semibold",
                     "SemiboldItalic",
                     true
                  ),
                  "Bold",
                  "BoldItalic",
                  true
               ),
               "ExtraBold",
               "ExtraBoldItalic",
               true
            );
         }

         var10 = var9;
         if ((var2 and 1) != 0) {
            var10 = kotlin.text.h.A(kotlin.text.h.A(kotlin.text.h.A(var9, "Normal", "Bold", true), "Medium", "Bold", true), "Semibold", "Bold", true);
         }

         var9 = kotlin.text.h.A(kotlin.text.h.A(var10, "ItalicItalic", "Italic", true), "BoldBold", "Bold", true);
         val var28: Array<java.lang.String> = FILE_EXTENSIONS;
         val var8: Int = FILE_EXTENSIONS.length;
         val var5: Byte = 0;

         while (var5 < var8) {
            var var12: java.lang.String = var28[var5];
            val var13: StringBuilder = new StringBuilder();
            var13.append("fonts/");
            var13.append(var9);
            var13.append(var12);
            var12 = var13.toString();
            r.g(var12, "toString(...)");

            try {
               b.a();
               val var32: Font = a.a(k.a(var3, var12));
               r.g(var32, "build(...)");
               c.a();
               val var33: FontFamily = f.a(l.a(var32));
               r.g(var33, "build(...)");
               var11.add(var33);
            } catch (var14: java.lang.Throwable) {
               continue;
            }
         }
      }

      if (var11.size() == 0) {
         return this.createAssetTypeface(var1[0], var2, var3);
      } else {
         d.a();
         val var21: CustomFallbackBuilder = m.a(g.a(var11.get(0)));
         val var22: Int = var11.size();

         for (int var19 = 1; var19 < var22; var19++) {
            h.a(var21, g.a(var11.get(var19)));
         }

         var var29: java.lang.String = var1[0];
         val var26: Locale = Locale.ROOT;
         r.g(Locale.ROOT, "ROOT");
         var29 = var29.toLowerCase(var26);
         r.g(var29, "toLowerCase(...)");
         val var20: Byte;
         if (kotlin.text.h.a0(var29, "italic", 0, false, 6, null) > -1) {
            var20 = 1;
         } else {
            var20 = 0;
         }

         val var16: java.lang.String = var1[0];
         r.g(var26, "ROOT");
         val var17: java.lang.String = var16.toLowerCase(var26);
         r.g(var17, "toLowerCase(...)");
         var var23: Short = 0;
         if (kotlin.text.h.a0(var17, "bold", 0, false, 6, null) > -1) {
            var23 = 1;
         }

         e.a();
         if (var23) {
            var23 = 700;
         } else {
            var23 = 400;
         }

         i.a(var21, n.a(var23, var20));
         val var18: Typeface = j.a(var21);
         r.g(var18, "build(...)");
         return var18;
      }
   }

   @JvmStatic
   fun `override$lambda$0`(var0: CreateTypefaceObject): Typeface {
      return INSTANCE.createAssetTypeface(var0.getFontFamilyName(), var0.getStyle(), var0.getAssetManager());
   }

   public fun override() {
      ReactFontManager.Companion.setCreateAssetTypefaceOverride(new o());
   }
}
