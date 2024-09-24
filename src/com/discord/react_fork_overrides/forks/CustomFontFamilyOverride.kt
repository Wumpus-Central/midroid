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

internal object CustomFontFamilyOverride {
   private final val FILE_EXTENSIONS: Array<String>
   private const val FONTS_ASSET_PATH: String = "fonts/"

   private fun createAssetTypeface(fontFamilyName: String?, style: Int, assetManager: AssetManager): Typeface {
      var var11: java.lang.String = var1;
      if (var1 == null) {
         var11 = "";
      }

      val var16: Array<java.lang.String> = kotlin.text.h.z0(var11, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]);
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
            if (kotlin.jvm.internal.q.j(var12.charAt(var8), 32) <= 0) {
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
         kotlin.jvm.internal.q.g(var22, "toString(...)");

         try {
            val var24: Typeface = Typeface.createFromAsset(var3, var22);
            kotlin.jvm.internal.q.e(var24);
            return var24;
         } catch (var14: RuntimeException) {
         }
      }

      val var18: Typeface = Typeface.create(var11, var2);
      kotlin.jvm.internal.q.g(var18, "create(...)");
      return var18;
   }

   private fun createAssetTypefaceWithFallbacks(fontFamilyNames: Array<String>, style: Int, assetManager: AssetManager): Typeface {
      val var9: ArrayList = new ArrayList();
      val var7: Int = var1.length;

      for (int var4 = 0; var4 < var7; var4++) {
         val var10: java.lang.String = var1[var4];
         val var11: Array<java.lang.String> = FILE_EXTENSIONS;
         val var8: Int = FILE_EXTENSIONS.length;
         val var5: Byte = 0;

         while (var5 < var8) {
            val var13: java.lang.String = var11[var5];
            val var12: StringBuilder = new StringBuilder();
            var12.append("fonts/");
            var12.append(var10);
            var12.append(var13);
            val var28: java.lang.String = var12.toString();
            kotlin.jvm.internal.q.g(var28, "toString(...)");

            try {
               b.a();
               val var29: Font = a.a(k.a(var3, var28));
               kotlin.jvm.internal.q.g(var29, "build(...)");
               c.a();
               val var30: FontFamily = f.a(l.a(var29));
               kotlin.jvm.internal.q.g(var30, "build(...)");
               var9.add(var30);
            } catch (var14: java.lang.Throwable) {
               continue;
            }
         }
      }

      if (var9.size() == 0) {
         return this.createAssetTypeface(var1[0], var2, var3);
      } else {
         d.a();
         val var21: CustomFallbackBuilder = m.a(g.a(var9.get(0)));
         val var22: Int = var9.size();

         for (int var19 = 1; var19 < var22; var19++) {
            h.a(var21, g.a(var9.get(var19)));
         }

         var var26: java.lang.String = var1[0];
         val var25: Locale = Locale.ROOT;
         kotlin.jvm.internal.q.g(Locale.ROOT, "ROOT");
         var26 = var26.toLowerCase(var25);
         kotlin.jvm.internal.q.g(var26, "toLowerCase(...)");
         val var20: Byte;
         if (kotlin.text.h.Z(var26, "italic", 0, false, 6, null) > -1) {
            var20 = 1;
         } else {
            var20 = 0;
         }

         val var16: java.lang.String = var1[0];
         kotlin.jvm.internal.q.g(var25, "ROOT");
         val var17: java.lang.String = var16.toLowerCase(var25);
         kotlin.jvm.internal.q.g(var17, "toLowerCase(...)");
         var var23: Short = 0;
         if (kotlin.text.h.Z(var17, "bold", 0, false, 6, null) > -1) {
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
         kotlin.jvm.internal.q.g(var18, "build(...)");
         return var18;
      }
   }

   @JvmStatic
   fun `override$lambda$0`(var0: CreateTypefaceObject): Typeface {
      val var2: CustomFontFamilyOverride = INSTANCE;
      val var3: java.lang.String = var0.fontFamilyName;
      val var1: Int = var0.style;
      val var4: AssetManager = var0.assetManager;
      kotlin.jvm.internal.q.f(var0.assetManager, "null cannot be cast to non-null type android.content.res.AssetManager");
      return var2.createAssetTypeface(var3, var1, var4);
   }

   public fun override() {
      ReactFontManager.createAssetTypefaceOverride = new o();
   }
}
