package com.discord.theme

import android.content.res.Resources
import android.content.res.Resources.Theme
import com.discord.theme.utils.ColorUtilsKt
import ht.l
import l9.a
import l9.a0
import l9.a1
import l9.b
import l9.b0
import l9.c0
import l9.d0
import l9.e0
import l9.f0
import l9.g0
import l9.h0
import l9.i0
import l9.j0
import l9.k
import l9.k0
import l9.l0
import l9.m
import l9.m0
import l9.n
import l9.n0
import l9.o
import l9.o0
import l9.p
import l9.p0
import l9.q
import l9.q0
import l9.r
import l9.r0
import l9.s
import l9.s0
import l9.t
import l9.t0
import l9.u
import l9.u0
import l9.v
import l9.v0
import l9.w
import l9.w0
import l9.x
import l9.x0
import l9.y
import l9.y0
import l9.z
import l9.z0

internal class DarkTheme(resources: Resources, theme: Theme) : DiscordThemeObject() {
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


   public open val redesignButtonActiveBackground: Int
      public open get() {
         return (this.redesignButtonActiveBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonDangerBackground: Int
      public open get() {
         return (this.redesignButtonDangerBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryBackground: Int
      public open get() {
         return (this.redesignButtonPrimaryBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryOverlayBackground: Int
      public open get() {
         return (this.redesignButtonPrimaryOverlayBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryOverlayPressedBackground: Int
      public open get() {
         return (this.redesignButtonPrimaryOverlayPressedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryOverlayText: Int
      public open get() {
         return (this.redesignButtonPrimaryOverlayText$delegate.getValue() as java.lang.Number).intValue();
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
      this.androidRipple$delegate = l.b(new a(var1, var2));
      this.backgroundAccent$delegate = l.b(new l9.c(var1, var2));
      this.backgroundFloating$delegate = l.b(new o(var1, var2));
      this.backgroundMessageHighlight$delegate = l.b(new a0(var1, var2));
      this.backgroundMobilePrimary$delegate = l.b(new m0(var1, var2));
      this.backgroundMobileSecondary$delegate = l.b(new q0(var1, var2));
      this.backgroundModifierAccent$delegate = l.b(new r0(var1, var2));
      this.backgroundModifierSelected$delegate = l.b(new t0(var1, var2));
      this.backgroundPrimary$delegate = l.b(new u0(var1, var2));
      this.backgroundSecondary$delegate = l.b(new v0(var1, var2));
      this.backgroundSecondaryAlt$delegate = l.b(new l9.l(var1, var2));
      this.backgroundTertiary$delegate = l.b(new w(var1, var2));
      this.bgModStrong$delegate = l.b(new h0(var1, var2));
      this.bgSurfaceOverlay$delegate = l.b(new s0(var1, var2));
      this.borderStrong$delegate = l.b(new w0(var1, var2));
      this.borderSubtle$delegate = l.b(new x0(var1, var2));
      this.buttonSecondaryBackground$delegate = l.b(new y0(var1, var2));
      this.cardPrimaryBg$delegate = l.b(new z0(var1, var2));
      this.chatSwipeToReplyBackground$delegate = l.b(new a1(var1, var2));
      this.chatSwipeToReplyGradientBackground$delegate = l.b(new b(var1, var2));
      this.embedBackground$delegate = l.b(new l9.d(var1, var2));
      this.headerPrimary$delegate = l.b(new l9.e(var1, var2));
      this.headerSecondary$delegate = l.b(new l9.f(var1, var2));
      this.infoDangerForeground$delegate = l.b(new l9.g(var1, var2));
      this.interactiveActive$delegate = l.b(new l9.h(var1, var2));
      this.interactiveMuted$delegate = l.b(new l9.i(var1, var2));
      this.interactiveNormal$delegate = l.b(new l9.j(var1, var2));
      this.redesignButtonActiveBackground$delegate = l.b(new k(var1, var2));
      this.redesignButtonDangerBackground$delegate = l.b(new m(var1, var2));
      this.redesignButtonPrimaryBackground$delegate = l.b(new n(var1, var2));
      this.redesignButtonPrimaryOverlayBackground$delegate = l.b(new p(var1, var2));
      this.redesignButtonPrimaryOverlayPressedBackground$delegate = l.b(new q(var1, var2));
      this.redesignButtonPrimaryOverlayText$delegate = l.b(new r(var1, var2));
      this.redesignButtonTertiaryBackground$delegate = l.b(new s(var1, var2));
      this.redesignButtonTertiaryText$delegate = l.b(new t(var1, var2));
      this.spoilerHiddenBackground$delegate = l.b(new u(var1, var2));
      this.spoilerRevealedBackground$delegate = l.b(new v(var1, var2));
      this.statusDanger$delegate = l.b(new x(var1, var2));
      this.statusDangerBackground$delegate = l.b(new y(var1, var2));
      this.statusPositive$delegate = l.b(new z(var1, var2));
      this.statusPositiveText$delegate = l.b(new b0(var1, var2));
      this.statusWarning$delegate = l.b(new c0(var1, var2));
      this.textBrand$delegate = l.b(new d0(var1, var2));
      this.textDanger$delegate = l.b(new e0(var1, var2));
      this.textLink$delegate = l.b(new f0(var1, var2));
      this.textLowContrast$delegate = l.b(new g0(var1, var2));
      this.textMuted$delegate = l.b(new i0(var1, var2));
      this.textNormal$delegate = l.b(new j0(var1, var2));
      this.textPositive$delegate = l.b(new k0(var1, var2));
      this.textPrimary$delegate = l.b(new l0(var1, var2));
      this.textSecondary$delegate = l.b(new n0(var1, var2));
      this.textWarning$delegate = l.b(new o0(var1, var2));
      this.white$delegate = l.b(new p0(var1, var2));
   }

   @JvmStatic
   fun `androidRipple_delegate$lambda$0`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.android_ripple_dark, var1);
   }

   @JvmStatic
   fun `backgroundAccent_delegate$lambda$1`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_530, var1);
   }

   @JvmStatic
   fun `backgroundFloating_delegate$lambda$2`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_800, var1);
   }

   @JvmStatic
   fun `backgroundMessageHighlight_delegate$lambda$3`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.background_message_highlight_dark, var1);
   }

   @JvmStatic
   fun `backgroundMobilePrimary_delegate$lambda$4`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_600, var1);
   }

   @JvmStatic
   fun `backgroundMobileSecondary_delegate$lambda$5`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_630, var1);
   }

   @JvmStatic
   fun `backgroundModifierAccent_delegate$lambda$6`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.background_modifier_accent_dark, var1);
   }

   @JvmStatic
   fun `backgroundModifierSelected_delegate$lambda$7`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.background_modifier_selected_dark, var1);
   }

   @JvmStatic
   fun `backgroundPrimary_delegate$lambda$8`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_600, var1);
   }

   @JvmStatic
   fun `backgroundSecondaryAlt_delegate$lambda$10`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_660, var1);
   }

   @JvmStatic
   fun `backgroundSecondary_delegate$lambda$9`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_630, var1);
   }

   @JvmStatic
   fun `backgroundTertiary_delegate$lambda$11`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_700, var1);
   }

   @JvmStatic
   fun `bgModStrong_delegate$lambda$12`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.bg_mod_strong_dark, var1);
   }

   @JvmStatic
   fun `bgSurfaceOverlay_delegate$lambda$13`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_800, var1);
   }

   @JvmStatic
   fun `borderStrong_delegate$lambda$14`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.border_strong_dark, var1);
   }

   @JvmStatic
   fun `borderSubtle_delegate$lambda$15`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.border_subtle_dark, var1);
   }

   @JvmStatic
   fun `buttonSecondaryBackground_delegate$lambda$16`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_500, var1);
   }

   @JvmStatic
   fun `cardPrimaryBg_delegate$lambda$17`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_600, var1);
   }

   @JvmStatic
   fun `chatSwipeToReplyBackground_delegate$lambda$18`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_660, var1);
   }

   @JvmStatic
   fun `chatSwipeToReplyGradientBackground_delegate$lambda$19`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.chat_swipe_to_reply_gradient_background_dark, var1);
   }

   @JvmStatic
   fun `embedBackground_delegate$lambda$20`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_630, var1);
   }

   @JvmStatic
   fun `headerPrimary_delegate$lambda$21`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_130, var1);
   }

   @JvmStatic
   fun `headerSecondary_delegate$lambda$22`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_330, var1);
   }

   @JvmStatic
   fun `infoDangerForeground_delegate$lambda$23`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.red_400, var1);
   }

   @JvmStatic
   fun `interactiveActive_delegate$lambda$24`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.white, var1);
   }

   @JvmStatic
   fun `interactiveMuted_delegate$lambda$25`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_500, var1);
   }

   @JvmStatic
   fun `interactiveNormal_delegate$lambda$26`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_330, var1);
   }

   @JvmStatic
   fun `redesignButtonActiveBackground_delegate$lambda$27`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.green_430, var1);
   }

   @JvmStatic
   fun `redesignButtonDangerBackground_delegate$lambda$28`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.red_430, var1);
   }

   @JvmStatic
   fun `redesignButtonPrimaryBackground_delegate$lambda$29`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.brand_500, var1);
   }

   @JvmStatic
   fun `redesignButtonPrimaryOverlayBackground_delegate$lambda$30`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.white, var1);
   }

   @JvmStatic
   fun `redesignButtonPrimaryOverlayPressedBackground_delegate$lambda$31`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_230, var1);
   }

   @JvmStatic
   fun `redesignButtonPrimaryOverlayText_delegate$lambda$32`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_860, var1);
   }

   @JvmStatic
   fun `redesignButtonTertiaryBackground_delegate$lambda$33`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_660, var1);
   }

   @JvmStatic
   fun `redesignButtonTertiaryText_delegate$lambda$34`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_230, var1);
   }

   @JvmStatic
   fun `spoilerHiddenBackground_delegate$lambda$35`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_700, var1);
   }

   @JvmStatic
   fun `spoilerRevealedBackground_delegate$lambda$36`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_660, var1);
   }

   @JvmStatic
   fun `statusDangerBackground_delegate$lambda$38`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.red_430, var1);
   }

   @JvmStatic
   fun `statusDanger_delegate$lambda$37`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.red_400, var1);
   }

   @JvmStatic
   fun `statusPositiveText_delegate$lambda$40`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.white, var1);
   }

   @JvmStatic
   fun `statusPositive_delegate$lambda$39`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.green_360, var1);
   }

   @JvmStatic
   fun `statusWarning_delegate$lambda$41`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.yellow_300, var1);
   }

   @JvmStatic
   fun `textBrand_delegate$lambda$42`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.brand_360, var1);
   }

   @JvmStatic
   fun `textDanger_delegate$lambda$43`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.red_345, var1);
   }

   @JvmStatic
   fun `textLink_delegate$lambda$44`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.blue_345, var1);
   }

   @JvmStatic
   fun `textLowContrast_delegate$lambda$45`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_360, var1);
   }

   @JvmStatic
   fun `textMuted_delegate$lambda$46`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_360, var1);
   }

   @JvmStatic
   fun `textNormal_delegate$lambda$47`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_230, var1);
   }

   @JvmStatic
   fun `textPositive_delegate$lambda$48`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.green_330, var1);
   }

   @JvmStatic
   fun `textPrimary_delegate$lambda$49`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_230, var1);
   }

   @JvmStatic
   fun `textSecondary_delegate$lambda$50`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.primary_330, var1);
   }

   @JvmStatic
   fun `textWarning_delegate$lambda$51`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.yellow_300, var1);
   }

   @JvmStatic
   fun `white_delegate$lambda$52`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.white, var1);
   }

   public override fun getColor(lightColor: Int, darkColor: Int): Int {
      return var2;
   }

   public override fun getColorRes(lightColorRes: Int, darkColorRes: Int): Int {
      return var2;
   }
}
