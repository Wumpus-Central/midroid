package com.discord.react_fork_overrides.forks

import android.content.res.AssetManager
import android.graphics.Typeface
import android.graphics.Typeface.CustomFallbackBuilder
import android.graphics.fonts.Font
import android.graphics.fonts.FontFamily
import android.graphics.fonts.FontStyle
import android.graphics.fonts.Font.Builder
import android.os.Build.VERSION
import androidx.core.graphics.b1
import androidx.core.graphics.d1
import androidx.core.graphics.f1
import androidx.core.graphics.g1
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

      val var16: Array<java.lang.String> = f.A0(var11, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]);
      val var10: Int = var16.length;

      for (int var6 = 0; var6 < var10; var6++) {
         val var12: java.lang.String = var16[var6];
         var var5: Int = var16[var6].length() - 1;
         var var4: Int = 0;
         var var7: Boolean = false;

         while (var4 <= var5) {
            val var8: Int;
            if (!var7) {
               var8 = var4;
            } else {
               var8 = var5;
            }

            val var21: Boolean;
            if (r.j(var12.charAt(var8), 32) <= 0) {
               var21 = true;
            } else {
               var21 = false;
            }

            if (!var7) {
               if (!var21) {
                  var7 = true;
               } else {
                  var4++;
               }
            } else {
               if (!var21) {
                  break;
               }

               var5--;
            }
         }

         var16[var6] = var12.subSequence(var4, var5 + 1).toString();
      }

      if (var16.length > 1) {
         if (VERSION.SDK_INT >= 29) {
            return this.createAssetTypefaceWithFallbacks(var16, var2, var3);
         }

         var11 = var16[0];
      }

      val var17: Array<java.lang.String> = FILE_EXTENSIONS;
      val var20: Int = FILE_EXTENSIONS.length;

      for (int var19 = 0; var19 < var20; var19++) {
         var var22: java.lang.String = var17[var19];
         val var13: StringBuilder = new StringBuilder();
         var13.append("fonts/");
         var13.append(var11);
         var13.append(var22);
         var22 = var13.toString();
         r.g(var22, "StringBuilder()\n        …              .toString()");

         try {
            val var24: Typeface = Typeface.createFromAsset(var3, var22);
            r.g(var24, "{\n                Typefa…, fileName)\n            }");
            return var24;
         } catch (var14: RuntimeException) {
         }
      }

      val var18: Typeface = Typeface.create(var11, var2);
      r.g(var18, "create(name, style)");
      return var18;
   }

   private fun createAssetTypefaceWithFallbacks(fontFamilyNames: Array<String>, style: Int, assetManager: AssetManager): Typeface {
      val var9: ArrayList = new ArrayList();
      val var7: Int = var1.length;

      for (int var4 = 0; var4 < var7; var4++) {
         val var11: java.lang.String = var1[var4];
         val var10: Array<java.lang.String> = FILE_EXTENSIONS;
         val var8: Int = FILE_EXTENSIONS.length;
         val var5: Byte = 0;

         while (var5 < var8) {
            val var12: java.lang.String = var10[var5];
            val var13: StringBuilder = new StringBuilder();
            var13.append("fonts/");
            var13.append(var11);
            var13.append(var12);
            val var31: java.lang.String = var13.toString();
            r.g(var31, "StringBuilder()\n        …              .toString()");

            try {
               val var29: Font = b1.a(new Builder(var3, var31));
               r.g(var29, "Builder(assetManager, fileName).build()");
               val var30: FontFamily = d1.a(new android.graphics.fonts.FontFamily.Builder(var29));
               r.g(var30, "Builder(font).build()");
               var9.add(var30);
            } catch (var14: java.lang.Throwable) {
               continue;
            }
         }
      }

      if (var9.size() == 0) {
         return this.createAssetTypeface(var1[0], var2, var3);
      } else {
         val var21: CustomFallbackBuilder = new CustomFallbackBuilder(var9.get(0) as FontFamily);
         val var22: Int = var9.size();

         for (int var19 = 1; var19 < var22; var19++) {
            a.a(var21, var9.get(var19) as FontFamily);
         }

         var var26: java.lang.String = var1[0];
         val var25: Locale = Locale.ROOT;
         r.g(Locale.ROOT, "ROOT");
         var26 = var26.toLowerCase(var25);
         r.g(var26, "this as java.lang.String).toLowerCase(locale)");
         val var20: Byte;
         if (f.a0(var26, "italic", 0, false, 6, null) > -1) {
            var20 = 1;
         } else {
            var20 = 0;
         }

         val var16: java.lang.String = var1[0];
         r.g(var25, "ROOT");
         val var17: java.lang.String = var16.toLowerCase(var25);
         r.g(var17, "this as java.lang.String).toLowerCase(locale)");
         var var23: Short = 0;
         if (f.a0(var17, "bold", 0, false, 6, null) > -1) {
            var23 = 1;
         }

         if (var23) {
            var23 = 700;
         } else {
            var23 = 400;
         }

         f1.a(var21, new FontStyle(var23, var20));
         val var18: Typeface = g1.a(var21);
         r.g(var18, "fallbackBuilder.build()");
         return var18;
      }
   }

   @JvmStatic
   fun `override$lambda$0`(var0: CreateTypefaceObject): Typeface {
      val var3: CustomFontFamilyOverride = INSTANCE;
      val var2: java.lang.String = var0.fontFamilyName;
      val var1: Int = var0.style;
      val var4: AssetManager = var0.assetManager;
      r.f(var0.assetManager, "null cannot be cast to non-null type android.content.res.AssetManager");
      return var3.createAssetTypeface(var2, var1, var4);
   }

   public fun override() {
      ReactFontManager.createAssetTypefaceOverride = new b();
   }
}
