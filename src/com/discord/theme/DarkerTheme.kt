package com.discord.theme

import android.content.res.Resources
import android.content.res.Resources.Theme
import com.discord.theme.utils.ColorUtilsKt
import kotlin.jvm.internal.q
import l2.A0
import l2.B0
import l2.C0
import l2.D0
import l2.E0
import l2.F0
import l2.G0
import l2.H0
import l2.I0
import l2.J0
import l2.K0
import l2.L0
import l2.M0
import l2.N0
import l2.O0
import l2.P0
import l2.Q0
import l2.R0
import l2.S0
import l2.X
import l2.Y
import l2.Z
import l2.a0
import l2.b0
import l2.c0
import l2.d0
import l2.e0
import l2.f0
import l2.g0
import l2.h0
import l2.i0
import l2.j0
import l2.k0
import l2.l0
import l2.m0
import l2.n0
import l2.o0
import l2.p0
import l2.q0
import l2.r0
import l2.s0
import l2.t0
import l2.u0
import l2.v0
import l2.w0
import l2.x0
import l2.y0
import l2.z0
import r9.j

internal class DarkerTheme(resources: Resources, theme: Theme) : DiscordThemeObject {
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
      this.androidRipple$delegate = j.a(new X(var1, var2));
      this.backgroundAccent$delegate = j.a(new Z(var1, var2));
      this.backgroundFloating$delegate = j.a(new l0(var1, var2));
      this.backgroundMessageHighlight$delegate = j.a(new x0(var1, var2));
      this.backgroundMobilePrimary$delegate = j.a(new H0(var1, var2));
      this.backgroundMobileSecondary$delegate = j.a(new I0(var1, var2));
      this.backgroundModifierAccent$delegate = j.a(new J0(var1, var2));
      this.backgroundModifierSelected$delegate = j.a(new K0(var1, var2));
      this.backgroundPrimary$delegate = j.a(new L0(var1, var2));
      this.backgroundSecondary$delegate = j.a(new M0(var1, var2));
      this.backgroundSecondaryAlt$delegate = j.a(new i0(var1, var2));
      this.backgroundTertiary$delegate = j.a(new t0(var1, var2));
      this.bgModStrong$delegate = j.a(new E0(var1, var2));
      this.bgSurfaceOverlay$delegate = j.a(new N0(var1, var2));
      this.borderStrong$delegate = j.a(new O0(var1, var2));
      this.borderSubtle$delegate = j.a(new P0(var1, var2));
      this.buttonSecondaryBackground$delegate = j.a(new Q0(var1, var2));
      this.cardPrimaryBg$delegate = j.a(new R0(var1, var2));
      this.chatSwipeToReplyBackground$delegate = j.a(new S0(var1, var2));
      this.chatSwipeToReplyGradientBackground$delegate = j.a(new Y(var1, var2));
      this.embedBackground$delegate = j.a(new a0(var1, var2));
      this.headerPrimary$delegate = j.a(new b0(var1, var2));
      this.headerSecondary$delegate = j.a(new c0(var1, var2));
      this.infoDangerForeground$delegate = j.a(new d0(var1, var2));
      this.interactiveActive$delegate = j.a(new e0(var1, var2));
      this.interactiveMuted$delegate = j.a(new f0(var1, var2));
      this.interactiveNormal$delegate = j.a(new g0(var1, var2));
      this.redesignButtonPrimaryBackground$delegate = j.a(new h0(var1, var2));
      this.redesignButtonTertiaryBackground$delegate = j.a(new j0(var1, var2));
      this.redesignButtonTertiaryText$delegate = j.a(new k0(var1, var2));
      this.spoilerHiddenBackground$delegate = j.a(new m0(var1, var2));
      this.spoilerRevealedBackground$delegate = j.a(new n0(var1, var2));
      this.statusDanger$delegate = j.a(new o0(var1, var2));
      this.statusDangerBackground$delegate = j.a(new p0(var1, var2));
      this.statusPositive$delegate = j.a(new q0(var1, var2));
      this.statusPositiveText$delegate = j.a(new r0(var1, var2));
      this.statusWarning$delegate = j.a(new s0(var1, var2));
      this.textBrand$delegate = j.a(new u0(var1, var2));
      this.textDanger$delegate = j.a(new v0(var1, var2));
      this.textLink$delegate = j.a(new w0(var1, var2));
      this.textLowContrast$delegate = j.a(new y0(var1, var2));
      this.textMuted$delegate = j.a(new z0(var1, var2));
      this.textNormal$delegate = j.a(new A0(var1, var2));
      this.textPositive$delegate = j.a(new B0(var1, var2));
      this.textPrimary$delegate = j.a(new C0(var1, var2));
      this.textSecondary$delegate = j.a(new D0(var1, var2));
      this.textWarning$delegate = j.a(new F0(var1, var2));
      this.white$delegate = j.a(new G0(var1, var2));
   }

   @JvmStatic
   fun `androidRipple_delegate$lambda$0`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.android_ripple_darker, var1);
   }

   @JvmStatic
   fun `backgroundAccent_delegate$lambda$1`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_15, var1);
   }

   @JvmStatic
   fun `backgroundFloating_delegate$lambda$2`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_18, var1);
   }

   @JvmStatic
   fun `backgroundMessageHighlight_delegate$lambda$3`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.background_message_highlight_darker, var1);
   }

   @JvmStatic
   fun `backgroundMobilePrimary_delegate$lambda$4`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_20, var1);
   }

   @JvmStatic
   fun `backgroundMobileSecondary_delegate$lambda$5`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_20, var1);
   }

   @JvmStatic
   fun `backgroundModifierAccent_delegate$lambda$6`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.background_modifier_accent_darker, var1);
   }

   @JvmStatic
   fun `backgroundModifierSelected_delegate$lambda$7`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.background_modifier_selected_darker, var1);
   }

   @JvmStatic
   fun `backgroundPrimary_delegate$lambda$8`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_20, var1);
   }

   @JvmStatic
   fun `backgroundSecondaryAlt_delegate$lambda$10`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_15, var1);
   }

   @JvmStatic
   fun `backgroundSecondary_delegate$lambda$9`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_18, var1);
   }

   @JvmStatic
   fun `backgroundTertiary_delegate$lambda$11`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_16, var1);
   }

   @JvmStatic
   fun `bgModStrong_delegate$lambda$12`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.bg_mod_strong_darker, var1);
   }

   @JvmStatic
   fun `bgSurfaceOverlay_delegate$lambda$13`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_17, var1);
   }

   @JvmStatic
   fun `borderStrong_delegate$lambda$14`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.border_strong_darker, var1);
   }

   @JvmStatic
   fun `borderSubtle_delegate$lambda$15`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.border_subtle_darker, var1);
   }

   @JvmStatic
   fun `buttonSecondaryBackground_delegate$lambda$16`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_13, var1);
   }

   @JvmStatic
   fun `cardPrimaryBg_delegate$lambda$17`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_18, var1);
   }

   @JvmStatic
   fun `chatSwipeToReplyBackground_delegate$lambda$18`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_22, var1);
   }

   @JvmStatic
   fun `chatSwipeToReplyGradientBackground_delegate$lambda$19`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.chat_swipe_to_reply_gradient_background_darker, var1);
   }

   @JvmStatic
   fun `embedBackground_delegate$lambda$20`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_18, var1);
   }

   @JvmStatic
   fun `headerPrimary_delegate$lambda$21`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_3, var1);
   }

   @JvmStatic
   fun `headerSecondary_delegate$lambda$22`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_9, var1);
   }

   @JvmStatic
   fun `infoDangerForeground_delegate$lambda$23`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.red_400, var1);
   }

   @JvmStatic
   fun `interactiveActive_delegate$lambda$24`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_1, var1);
   }

   @JvmStatic
   fun `interactiveMuted_delegate$lambda$25`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_13, var1);
   }

   @JvmStatic
   fun `interactiveNormal_delegate$lambda$26`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_6, var1);
   }

   @JvmStatic
   fun `redesignButtonPrimaryBackground_delegate$lambda$27`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.brand_500, var1);
   }

   @JvmStatic
   fun `redesignButtonTertiaryBackground_delegate$lambda$28`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.redesign_button_tertiary_background_darker, var1);
   }

   @JvmStatic
   fun `redesignButtonTertiaryText_delegate$lambda$29`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_6, var1);
   }

   @JvmStatic
   fun `spoilerHiddenBackground_delegate$lambda$30`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_14, var1);
   }

   @JvmStatic
   fun `spoilerRevealedBackground_delegate$lambda$31`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.spoiler_revealed_background_darker, var1);
   }

   @JvmStatic
   fun `statusDangerBackground_delegate$lambda$33`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.red_430, var1);
   }

   @JvmStatic
   fun `statusDanger_delegate$lambda$32`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.red_400, var1);
   }

   @JvmStatic
   fun `statusPositiveText_delegate$lambda$35`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.white, var1);
   }

   @JvmStatic
   fun `statusPositive_delegate$lambda$34`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.green_360, var1);
   }

   @JvmStatic
   fun `statusWarning_delegate$lambda$36`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.yellow_300, var1);
   }

   @JvmStatic
   fun `textBrand_delegate$lambda$37`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.brand_360, var1);
   }

   @JvmStatic
   fun `textDanger_delegate$lambda$38`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.red_345, var1);
   }

   @JvmStatic
   fun `textLink_delegate$lambda$39`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.blue_345, var1);
   }

   @JvmStatic
   fun `textLowContrast_delegate$lambda$40`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_11, var1);
   }

   @JvmStatic
   fun `textMuted_delegate$lambda$41`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_10, var1);
   }

   @JvmStatic
   fun `textNormal_delegate$lambda$42`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_6, var1);
   }

   @JvmStatic
   fun `textPositive_delegate$lambda$43`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.green_330, var1);
   }

   @JvmStatic
   fun `textPrimary_delegate$lambda$44`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_6, var1);
   }

   @JvmStatic
   fun `textSecondary_delegate$lambda$45`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.plum_9, var1);
   }

   @JvmStatic
   fun `textWarning_delegate$lambda$46`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.yellow_300, var1);
   }

   @JvmStatic
   fun `white_delegate$lambda$47`(var0: Resources, var1: Theme): Int {
      return ColorUtilsKt.getColorCompat(var0, R.color.white, var1);
   }

   public override fun getColor(lightColor: Int, darkColor: Int): Int {
      return var2;
   }

   public override fun getColorRes(lightColorRes: Int, darkColorRes: Int): Int {
      return var2;
   }
}
