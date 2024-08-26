package com.discord.theme

import android.app.Activity
import android.content.Context
import android.content.res.Resources
import android.content.res.Resources.Theme
import android.view.View
import com.discord.theme.utils.ActivityThemeUtils
import com.discord.theme.utils.UpdateSystemUiKt
import com.facebook.react.bridge.ReactContext
import eh.p
import java.util.EnumMap
import kotlin.jvm.internal.r

public object ThemeManager {
   private final lateinit var resourceTheme: Theme
   private final lateinit var resources: Resources
   private final var saturationFactor: Float = 1.0F
   private final var showSplashImage: Boolean = true
   private final lateinit var theme: DiscordTheme
   private final var themeOverride: DiscordTheme?
   private final var themes: EnumMap<DiscordTheme, DiscordThemeObject> = new EnumMap(DiscordTheme::class.java)

   private fun initThemeObject(themeType: DiscordTheme): DiscordThemeObject {
      val var2: Int = ThemeManager.WhenMappings.$EnumSwitchMapping$0[var1.ordinal()];
      var var3: Theme = null;
      val var8: Any;
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 3) {
               if (var2 != 4) {
                  throw new p();
               }

               var var7: Resources = resources;
               if (resources == null) {
                  r.y("resources");
                  var7 = null;
               }

               if (resourceTheme == null) {
                  r.y("resourceTheme");
               } else {
                  var3 = resourceTheme;
               }

               var8 = new MidnightTheme(var7, var3);
            } else {
               var var9: Resources = resources;
               if (resources == null) {
                  r.y("resources");
                  var9 = null;
               }

               var3 = resourceTheme;
               if (resourceTheme == null) {
                  r.y("resourceTheme");
                  var3 = null;
               }

               var8 = new DarkerTheme(var9, var3);
            }
         } else {
            var var10: Resources = resources;
            if (resources == null) {
               r.y("resources");
               var10 = null;
            }

            var3 = resourceTheme;
            if (resourceTheme == null) {
               r.y("resourceTheme");
               var3 = null;
            }

            var8 = new LightTheme(var10, var3);
         }
      } else {
         var var11: Resources = resources;
         if (resources == null) {
            r.y("resources");
            var11 = null;
         }

         var3 = resourceTheme;
         if (resourceTheme == null) {
            r.y("resourceTheme");
            var3 = null;
         }

         var8 = new DarkTheme(var11, var3);
      }

      return (DiscordThemeObject)var8;
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
            r.y("theme");
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

      r.g(var5, "themes.getOrPut(t) {\n   …tThemeObject(t)\n        }");
      return var5 as DiscordThemeObject;
   }

   public fun getThemeOverride(): DiscordTheme? {
      return themeOverride;
   }

   public fun init(context: Context) {
      r.h(var1, "context");
      val var2: Resources = var1.getResources();
      r.g(var2, "context.resources");
      resources = var2;
      val var3: Theme = var1.getTheme();
      r.g(var3, "context.theme");
      resourceTheme = var3;
      this.setTheme(DiscordTheme.DARK);
   }

   public fun isInitialized(): Boolean {
      val var1: Boolean;
      if (theme != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public fun isThemeDark(): Boolean {
      var var2: DiscordTheme = theme;
      if (theme == null) {
         r.y("theme");
         var2 = null;
      }

      val var1: Boolean;
      if (var2 != DiscordTheme.LIGHT) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public fun isThemeLight(): Boolean {
      var var2: DiscordTheme = theme;
      if (theme == null) {
         r.y("theme");
         var2 = null;
      }

      val var1: Boolean;
      if (var2 === DiscordTheme.LIGHT) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
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
      r.h(var1, "activity");
      UpdateSystemUiKt.updateSystemUi(var1);
   }

   public fun updateSystemUi(view: View) {
      r.h(var1, "view");
      UpdateSystemUiKt.updateSystemUi(var1);
   }

   public fun updateWindowBackground(context: Context, showSplashImage: Boolean) {
      r.h(var1, "context");
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

   // $VF: Class flags could not be determined
   internal class WhenMappings {
      @JvmStatic
      public int[] $EnumSwitchMapping$0;

      @JvmStatic
      fun {
         val var0: IntArray = new int[DiscordTheme.values().length];

         try {
            var0[DiscordTheme.DARK_LEGACY.ordinal()] = 1;
         } catch (var5: NoSuchFieldError) {
         }

         try {
            var0[DiscordTheme.LIGHT.ordinal()] = 2;
         } catch (var4: NoSuchFieldError) {
         }

         try {
            var0[DiscordTheme.DARK.ordinal()] = 3;
         } catch (var3: NoSuchFieldError) {
         }

         try {
            var0[DiscordTheme.MIDNIGHT.ordinal()] = 4;
         } catch (var2: NoSuchFieldError) {
         }

         $EnumSwitchMapping$0 = var0;
      }
   }
}
