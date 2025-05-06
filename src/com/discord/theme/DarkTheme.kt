package com.discord.theme

import android.content.res.Resources
import android.content.res.Resources.Theme
import com.discord.theme.utils.ColorUtilsKt
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q
import l8.l

internal class DarkTheme(resources: Resources, theme: Theme) : DiscordThemeObject {
   public open val androidRipple: Int
      public open get() {
         return (this.androidRipple$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundAccent: Int
      public open get() {
         return (this.backgroundAccent$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundFloating: Int
      public open get() {
         return (this.backgroundFloating$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundMessageHighlight: Int
      public open get() {
         return (this.backgroundMessageHighlight$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundMobilePrimary: Int
      public open get() {
         return (this.backgroundMobilePrimary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundMobileSecondary: Int
      public open get() {
         return (this.backgroundMobileSecondary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundModifierAccent: Int
      public open get() {
         return (this.backgroundModifierAccent$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundModifierSelected: Int
      public open get() {
         return (this.backgroundModifierSelected$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundPrimary: Int
      public open get() {
         return (this.backgroundPrimary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundSecondary: Int
      public open get() {
         return (this.backgroundSecondary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundSecondaryAlt: Int
      public open get() {
         return (this.backgroundSecondaryAlt$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundTertiary: Int
      public open get() {
         return (this.backgroundTertiary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val bgModStrong: Int
      public open get() {
         return (this.bgModStrong$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val bgSurfaceOverlay: Int
      public open get() {
         return (this.bgSurfaceOverlay$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val borderStrong: Int
      public open get() {
         return (this.borderStrong$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val borderSubtle: Int
      public open get() {
         return (this.borderSubtle$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonSecondaryBackground: Int
      public open get() {
         return (this.buttonSecondaryBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val cardPrimaryBg: Int
      public open get() {
         return (this.cardPrimaryBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val chatSwipeToReplyBackground: Int
      public open get() {
         return (this.chatSwipeToReplyBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val chatSwipeToReplyGradientBackground: Int
      public open get() {
         return (this.chatSwipeToReplyGradientBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val embedBackground: Int
      public open get() {
         return (this.embedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val headerPrimary: Int
      public open get() {
         return (this.headerPrimary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val headerSecondary: Int
      public open get() {
         return (this.headerSecondary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val infoDangerForeground: Int
      public open get() {
         return (this.infoDangerForeground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val interactiveActive: Int
      public open get() {
         return (this.interactiveActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val interactiveMuted: Int
      public open get() {
         return (this.interactiveMuted$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val interactiveNormal: Int
      public open get() {
         return (this.interactiveNormal$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryBackground: Int
      public open get() {
         return (this.redesignButtonPrimaryBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonTertiaryBackground: Int
      public open get() {
         return (this.redesignButtonTertiaryBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonTertiaryText: Int
      public open get() {
         return (this.redesignButtonTertiaryText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val spoilerHiddenBackground: Int
      public open get() {
         return (this.spoilerHiddenBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val spoilerRevealedBackground: Int
      public open get() {
         return (this.spoilerRevealedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusDanger: Int
      public open get() {
         return (this.statusDanger$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusDangerBackground: Int
      public open get() {
         return (this.statusDangerBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusPositive: Int
      public open get() {
         return (this.statusPositive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusPositiveText: Int
      public open get() {
         return (this.statusPositiveText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusWarning: Int
      public open get() {
         return (this.statusWarning$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val textBrand: Int
      public open get() {
         return (this.textBrand$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val textDanger: Int
      public open get() {
         return (this.textDanger$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val textLink: Int
      public open get() {
         return (this.textLink$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val textLowContrast: Int
      public open get() {
         return (this.textLowContrast$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val textMuted: Int
      public open get() {
         return (this.textMuted$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val textNormal: Int
      public open get() {
         return (this.textNormal$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val textPositive: Int
      public open get() {
         return (this.textPositive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val textPrimary: Int
      public open get() {
         return (this.textPrimary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val textSecondary: Int
      public open get() {
         return (this.textSecondary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val textWarning: Int
      public open get() {
         return (this.textWarning$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val white: Int
      public open get() {
         return (this.white$delegate.getValue() as java.lang.Number).intValue();
      }


   init {
      q.h(var1, "resources");
      q.h(var2, "theme");
      super(null);
      this.androidRipple$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.android_ripple_dark, this.$theme);
         }
      });
      this.backgroundAccent$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_530, this.$theme);
         }
      });
      this.backgroundFloating$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_800, this.$theme);
         }
      });
      this.backgroundMessageHighlight$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.background_message_highlight_dark, this.$theme);
         }
      });
      this.backgroundMobilePrimary$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_600, this.$theme);
         }
      });
      this.backgroundMobileSecondary$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_630, this.$theme);
         }
      });
      this.backgroundModifierAccent$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.background_modifier_accent_dark, this.$theme);
         }
      });
      this.backgroundModifierSelected$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.background_modifier_selected_dark, this.$theme);
         }
      });
      this.backgroundPrimary$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_600, this.$theme);
         }
      });
      this.backgroundSecondary$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_630, this.$theme);
         }
      });
      this.backgroundSecondaryAlt$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_660, this.$theme);
         }
      });
      this.backgroundTertiary$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_700, this.$theme);
         }
      });
      this.bgModStrong$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.bg_mod_strong_dark, this.$theme);
         }
      });
      this.bgSurfaceOverlay$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_800, this.$theme);
         }
      });
      this.borderStrong$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.border_strong_dark, this.$theme);
         }
      });
      this.borderSubtle$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.border_subtle_dark, this.$theme);
         }
      });
      this.buttonSecondaryBackground$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_500, this.$theme);
         }
      });
      this.cardPrimaryBg$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_600, this.$theme);
         }
      });
      this.chatSwipeToReplyBackground$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_660, this.$theme);
         }
      });
      this.chatSwipeToReplyGradientBackground$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.chat_swipe_to_reply_gradient_background_dark, this.$theme);
         }
      });
      this.embedBackground$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_630, this.$theme);
         }
      });
      this.headerPrimary$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_130, this.$theme);
         }
      });
      this.headerSecondary$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_330, this.$theme);
         }
      });
      this.infoDangerForeground$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.red_400, this.$theme);
         }
      });
      this.interactiveActive$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.white, this.$theme);
         }
      });
      this.interactiveMuted$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_500, this.$theme);
         }
      });
      this.interactiveNormal$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_330, this.$theme);
         }
      });
      this.redesignButtonPrimaryBackground$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.brand_500, this.$theme);
         }
      });
      this.redesignButtonTertiaryBackground$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_660, this.$theme);
         }
      });
      this.redesignButtonTertiaryText$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_230, this.$theme);
         }
      });
      this.spoilerHiddenBackground$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_700, this.$theme);
         }
      });
      this.spoilerRevealedBackground$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_660, this.$theme);
         }
      });
      this.statusDanger$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.red_400, this.$theme);
         }
      });
      this.statusDangerBackground$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.red_430, this.$theme);
         }
      });
      this.statusPositive$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.green_360, this.$theme);
         }
      });
      this.statusPositiveText$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.white, this.$theme);
         }
      });
      this.statusWarning$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.yellow_300, this.$theme);
         }
      });
      this.textBrand$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.brand_360, this.$theme);
         }
      });
      this.textDanger$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.red_345, this.$theme);
         }
      });
      this.textLink$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.blue_345, this.$theme);
         }
      });
      this.textLowContrast$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_360, this.$theme);
         }
      });
      this.textMuted$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_360, this.$theme);
         }
      });
      this.textNormal$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_230, this.$theme);
         }
      });
      this.textPositive$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.green_330, this.$theme);
         }
      });
      this.textPrimary$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_230, this.$theme);
         }
      });
      this.textSecondary$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_330, this.$theme);
         }
      });
      this.textWarning$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.yellow_300, this.$theme);
         }
      });
      this.white$delegate = l.a(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.white, this.$theme);
         }
      });
   }

   public override fun getColor(lightColor: Int, darkColor: Int): Int {
      return var2;
   }

   public override fun getColorRes(lightColorRes: Int, darkColorRes: Int): Int {
      return var2;
   }
}
