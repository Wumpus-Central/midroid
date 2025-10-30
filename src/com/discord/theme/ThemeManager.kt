package com.discord.theme

import android.app.Activity
import android.content.Context
import android.content.res.Resources
import android.content.res.Resources.Theme
import android.view.View
import com.discord.theme.utils.ActivityThemeUtils
import com.discord.theme.utils.UpdateSystemUiKt
import com.facebook.react.bridge.ReactContext
import fm.p
import java.util.EnumMap
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nThemeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemeManager.kt\ncom/discord/theme/ThemeManager\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,131:1\n381#2,7:132\n*S KotlinDebug\n*F\n+ 1 ThemeManager.kt\ncom/discord/theme/ThemeManager\n*L\n38#1:132,7\n*E\n"])
public object ThemeManager {
   private final var themes: EnumMap<DiscordTheme, DiscordThemeObject> = new EnumMap(DiscordTheme::class.java)
   private final lateinit var theme: DiscordTheme
   private final var themeOverride: DiscordTheme?
   private final var showSplashImage: Boolean = true
   private final var saturationFactor: Float = 1.0F
   private final lateinit var resources: Resources
   private final lateinit var resourceTheme: Theme

   private fun initThemeObject(themeType: DiscordTheme): DiscordThemeObject {
      val var2: Int = ThemeManager.WhenMappings.$EnumSwitchMapping$0[var1.ordinal()];
      var var3: Theme = null;
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 3) {
               if (var2 == 4) {
                  var var10: Resources = resources;
                  if (resources == null) {
                     Intrinsics.throwUninitializedPropertyAccessException("resources");
                     var10 = null;
                  }

                  if (resourceTheme == null) {
                     Intrinsics.throwUninitializedPropertyAccessException("resourceTheme");
                  } else {
                     var3 = resourceTheme;
                  }

                  return new MidnightTheme(var10, var3);
               } else {
                  throw new p();
               }
            } else {
               var var9: Resources = resources;
               if (resources == null) {
                  Intrinsics.throwUninitializedPropertyAccessException("resources");
                  var9 = null;
               }

               var3 = resourceTheme;
               if (resourceTheme == null) {
                  Intrinsics.throwUninitializedPropertyAccessException("resourceTheme");
                  var3 = null;
               }

               return new DarkerTheme(var9, var3);
            }
         } else {
            var var8: Resources = resources;
            if (resources == null) {
               Intrinsics.throwUninitializedPropertyAccessException("resources");
               var8 = null;
            }

            var3 = resourceTheme;
            if (resourceTheme == null) {
               Intrinsics.throwUninitializedPropertyAccessException("resourceTheme");
               var3 = null;
            }

            return new LightTheme(var8, var3);
         }
      } else {
         var var7: Resources = resources;
         if (resources == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resources");
            var7 = null;
         }

         var3 = resourceTheme;
         if (resourceTheme == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resourceTheme");
            var3 = null;
         }

         return new DarkTheme(var7, var3);
      }
   }

   private fun setTheme(theme: DiscordTheme) {
      theme = var1;
   }

   public fun clearThemeOverride() {
      themeOverride = null;
   }

   public fun getSaturationFactor(): Float {
      return saturationFactor;
   }

   public fun getTheme(): DiscordThemeObject {
      var var1: DiscordTheme;
      if (theme != null) {
         var1 = theme;
         if (theme == null) {
            Intrinsics.throwUninitializedPropertyAccessException("theme");
            var1 = null;
         }
      } else {
         var1 = DiscordTheme.DARK;
      }

      val var4: EnumMap = themes;
      val var3: Any = themes.get(var1);
      var var5: Any = var3;
      if (var3 == null) {
         var5 = INSTANCE.initThemeObject(var1);
         var4.put(var1, var5);
      }

      return var5 as DiscordThemeObject;
   }

   public fun getThemeOverride(): DiscordTheme? {
      return themeOverride;
   }

   public fun init(context: Context) {
      resources = var1.getResources();
      resourceTheme = var1.getTheme();
      this.setTheme(DiscordTheme.DARK);
   }

   public fun isInitialized(): Boolean {
      return theme != null;
   }

   public fun isThemeDark(): Boolean {
      var var1: DiscordTheme = theme;
      if (theme == null) {
         Intrinsics.throwUninitializedPropertyAccessException("theme");
         var1 = null;
      }

      return var1 != DiscordTheme.LIGHT;
   }

   public fun isThemeLight(): Boolean {
      var var1: DiscordTheme = theme;
      if (theme == null) {
         Intrinsics.throwUninitializedPropertyAccessException("theme");
         var1 = null;
      }

      return var1 === DiscordTheme.LIGHT;
   }

   public fun setDarkLegacyTheme() {
      this.setTheme(DiscordTheme.DARK_LEGACY);
   }

   public fun setDarkTheme() {
      this.setTheme(DiscordTheme.DARK);
   }

   public fun setDarkThemeOverride() {
      this.setThemeOverride(DiscordTheme.DARK);
   }

   public fun setLightTheme() {
      this.setTheme(DiscordTheme.LIGHT);
   }

   public fun setMidnightTheme() {
      this.setTheme(DiscordTheme.MIDNIGHT);
   }

   public fun setSaturationFactor(value: Double) {
      saturationFactor = (float)var1;
      themes.clear();
   }

   public fun setThemeOverride(theme: DiscordTheme?) {
      themeOverride = var1;
   }

   internal fun shouldShowSplashImage(): Boolean {
      return showSplashImage;
   }

   public fun updateSystemUi(activity: Activity) {
      UpdateSystemUiKt.updateSystemUi(var1);
   }

   public fun updateSystemUi(view: View) {
      UpdateSystemUiKt.updateSystemUi(var1);
   }

   public fun updateWindowBackground(context: Context, showSplashImage: Boolean) {
      showSplashImage = var2;
      val var3: Activity;
      if (var1 is Activity) {
         var3 = var1 as Activity;
      } else {
         var3 = null;
      }

      var var5: Activity;
      if (var3 == null) {
         val var7: ReactContext;
         if (var1 is ReactContext) {
            var7 = var1 as ReactContext;
         } else {
            var7 = null;
         }

         var5 = null;
         if (var7 != null) {
            var5 = var7.getCurrentActivity();
         }
      } else {
         var5 = var3;
      }

      if (var5 != null) {
         ActivityThemeUtils.INSTANCE.updateWindowBackground$theme_release(var5);
      }
   }
}
