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
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nCustomFontFamilyOverride.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomFontFamilyOverride.kt\ncom/discord/react_fork_overrides/forks/CustomFontFamilyOverride\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,157:1\n37#2,2:158\n108#3:160\n80#3,22:161\n*S KotlinDebug\n*F\n+ 1 CustomFontFamilyOverride.kt\ncom/discord/react_fork_overrides/forks/CustomFontFamilyOverride\n*L\n36#1:158,2\n38#1:160\n38#1:161,22\n*E\n"])
internal object CustomFontFamilyOverride {
   private final val FILE_EXTENSIONS: Array<String>
   private const val FONTS_ASSET_PATH: String = "fonts/"

   private fun createAssetTypeface(fontFamilyName: String?, style: Int, assetManager: AssetManager): Typeface {
      var var11: java.lang.String = var1;
      if (var1 == null) {
         var11 = "";
      }

      val var12: Array<java.lang.String> = StringsKt.split$default(var11, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]);
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
            if (Intrinsics.compare(var1.charAt(var8), 32) <= 0) {
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
               var11 = StringsKt.A(
                  StringsKt.A(
                     StringsKt.A(
                        StringsKt.A(StringsKt.A(var1, "Normal", "NormalItalic", true), "Medium", "MediumItalic", true), "Semibold", "SemiboldItalic", true
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
               var1 = StringsKt.A(StringsKt.A(StringsKt.A(var11, "Normal", "Bold", true), "Medium", "Bold", true), "Semibold", "Bold", true);
            }

            var11 = StringsKt.A(StringsKt.A(var1, "ItalicItalic", "Italic", true), "BoldBold", "Bold", true);
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

         try {
            return Typeface.createFromAsset(var3, var27);
         } catch (var14: RuntimeException) {
         }
      }

      val var20: Typeface = Typeface.create(var11, var2);
      return var20;
   }

   private fun createAssetTypefaceWithFallbacks(fontFamilyNames: Array<String>, style: Int, assetManager: AssetManager): Typeface {
      val var11: ArrayList = new ArrayList();
      val var7: Int = var1.length;

      for (int var4 = 0; var4 < var7; var4++) {
         var var10: java.lang.String = var1[var4];
         var var9: java.lang.String = var1[var4];
         if ((var2 and 2) != 0) {
            var9 = StringsKt.A(
               StringsKt.A(
                  StringsKt.A(
                     StringsKt.A(StringsKt.A(var10, "Normal", "NormalItalic", true), "Medium", "MediumItalic", true), "Semibold", "SemiboldItalic", true
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
            var10 = StringsKt.A(StringsKt.A(StringsKt.A(var9, "Normal", "Bold", true), "Medium", "Bold", true), "Semibold", "Bold", true);
         }

         var9 = StringsKt.A(StringsKt.A(var10, "ItalicItalic", "Italic", true), "BoldBold", "Bold", true);
         val var28: Array<java.lang.String> = FILE_EXTENSIONS;
         val var8: Int = FILE_EXTENSIONS.length;
         val var5: Byte = 0;

         while (var5 < var8) {
            val var13: java.lang.String = var28[var5];
            val var12: StringBuilder = new StringBuilder();
            var12.append("fonts/");
            var12.append(var9);
            var12.append(var13);
            val var31: java.lang.String = var12.toString();

            try {
               b.a();
               val var32: Font = a.a(k.a(var3, var31));
               c.a();
               val var33: FontFamily = f.a(l.a(var32));
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
         var29 = var29.toLowerCase(var26);
         val var20: Byte;
         if (StringsKt.a0(var29, "italic", 0, false, 6, null) > -1) {
            var20 = 1;
         } else {
            var20 = 0;
         }

         val var16: java.lang.String = var1[0];
         val var17: java.lang.String = var16.toLowerCase(var26);
         var var23: Short = 0;
         if (StringsKt.a0(var17, "bold", 0, false, 6, null) > -1) {
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
