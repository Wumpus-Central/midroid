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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nCustomFontFamilyOverride.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomFontFamilyOverride.kt\ncom/discord/react_fork_overrides/forks/CustomFontFamilyOverride\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,157:1\n37#2,2:158\n*S KotlinDebug\n*F\n+ 1 CustomFontFamilyOverride.kt\ncom/discord/react_fork_overrides/forks/CustomFontFamilyOverride\n*L\n36#1:158,2\n*E\n"])
internal object CustomFontFamilyOverride {
   private final val FILE_EXTENSIONS: Array<String>
   private const val FONTS_ASSET_PATH: String = "fonts/"

   private fun createAssetTypeface(fontFamilyName: String?, style: Int, assetManager: AssetManager): Typeface {
      var var7: java.lang.String = var1;
      if (var1 == null) {
         var7 = "";
      }

      val var8: Array<java.lang.String> = StringsKt.split$default(var7, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]);
      var var6: Int = var8.length;

      for (int var4 = 0; var4 < var6; var4++) {
         var8[var4] = StringsKt.Z0(var8[var4]).toString();
      }

      var1 = var7;
      if (var8.length > 1) {
         if (VERSION.SDK_INT >= 29) {
            return this.createAssetTypefaceWithFallbacks(var8, var2, var3);
         }

         var1 = var8[0];
      }

      var7 = var1;
      if (var8.length > 1) {
         var7 = var1;
         if (VERSION.SDK_INT < 29) {
            var7 = var1;
            if ((var2 and 2) != 0) {
               var7 = StringsKt.A(
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

            var1 = var7;
            if ((var2 and 1) != 0) {
               var1 = StringsKt.A(StringsKt.A(StringsKt.A(var7, "Normal", "Bold", true), "Medium", "Bold", true), "Semibold", "Bold", true);
            }

            var7 = StringsKt.A(StringsKt.A(var1, "ItalicItalic", "Italic", true), "BoldBold", "Bold", true);
         }
      }

      val var14: Array<java.lang.String> = FILE_EXTENSIONS;
      var6 = FILE_EXTENSIONS.length;

      for (int var16 = 0; var16 < var6; var16++) {
         val var9: java.lang.String = var14[var16];
         val var20: StringBuilder = new StringBuilder();
         var20.append("fonts/");
         var20.append(var7);
         var20.append(var9);
         val var21: java.lang.String = var20.toString();

         try {
            return Typeface.createFromAsset(var3, var21);
         } catch (var10: RuntimeException) {
         }
      }

      val var15: Typeface = Typeface.create(var7, var2);
      return var15;
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

         var10 = StringsKt.A(StringsKt.A(var10, "ItalicItalic", "Italic", true), "BoldBold", "Bold", true);
         val var25: Array<java.lang.String> = FILE_EXTENSIONS;
         val var8: Int = FILE_EXTENSIONS.length;
         val var5: Byte = 0;

         while (var5 < var8) {
            val var13: java.lang.String = var25[var5];
            val var12: StringBuilder = new StringBuilder();
            var12.append("fonts/");
            var12.append(var10);
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
