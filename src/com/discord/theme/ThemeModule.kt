package com.discord.theme

import android.app.Activity
import com.discord.codegen.NativeThemeManagerSpec
import com.discord.theme.utils.ActivityThemeUtils
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.r

public class ThemeModule(reactContext: ReactApplicationContext) : NativeThemeManagerSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   @JvmStatic
   fun `updateTheme$lambda$0`(var0: ThemeModule) {
      r.h(var0, "this$0");
      val var1: Activity = var0.getCurrentActivity();
      if (var1 != null) {
         ActivityThemeUtils.INSTANCE.updateActivityTheming$theme_release(var1);
      }
   }

   public open fun getName(): String {
      return "RTNThemeManager";
   }

   public open fun updateSaturation(saturationFactor: Double) {
      ThemeManager.INSTANCE.setSaturationFactor(var1);
   }

   public open fun updateTheme(theme: String?) {
      label32:
      if (var1 != null) {
         label36: {
            switch (var1.hashCode()) {
               case -1640863024:
                  if (!var1.equals("midnight")) {
                     break label32;
                  }
                  break;
               case -1413862040:
                  if (!var1.equals("amoled")) {
                     break label32;
                  }
                  break;
               case -1338968413:
                  if (!var1.equals("darker")) {
                     break label32;
                  }

                  ThemeManager.INSTANCE.setDarkTheme();
                  break label36;
               case 3075958:
                  if (!var1.equals("dark")) {
                     break label32;
                  }

                  ThemeManager.INSTANCE.setDarkLegacyTheme();
                  break label36;
               case 102970646:
                  if (var1.equals("light")) {
                     ThemeManager.INSTANCE.setLightTheme();
                     break label36;
                  }
               default:
                  break label32;
            }

            ThemeManager.INSTANCE.setMidnightTheme();
         }

         val var3: Activity = this.getCurrentActivity();
         if (var3 != null) {
            var3.runOnUiThread(new a(this));
         }

         return;
      }

      val var2: StringBuilder = new StringBuilder();
      var2.append("Invalid theme: ");
      var2.append(var1);
      throw new IllegalArgumentException(var2.toString());
   }

   public companion object {
      public const val NAME: String
   }
}
