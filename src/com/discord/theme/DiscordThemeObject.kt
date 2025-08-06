package com.discord.theme

public sealed class DiscordThemeObject protected constructor() {
   public abstract val androidRipple: Int
      public abstract get() {
      }


   public abstract val backgroundAccent: Int
      public abstract get() {
      }


   public abstract val backgroundFloating: Int
      public abstract get() {
      }


   public abstract val backgroundMessageHighlight: Int
      public abstract get() {
      }


   public abstract val backgroundMobilePrimary: Int
      public abstract get() {
      }


   public abstract val backgroundMobileSecondary: Int
      public abstract get() {
      }


   public abstract val backgroundModifierAccent: Int
      public abstract get() {
      }


   public abstract val backgroundModifierSelected: Int
      public abstract get() {
      }


   public abstract val backgroundPrimary: Int
      public abstract get() {
      }


   public abstract val backgroundSecondary: Int
      public abstract get() {
      }


   public abstract val backgroundSecondaryAlt: Int
      public abstract get() {
      }


   public abstract val backgroundTertiary: Int
      public abstract get() {
      }


   public abstract val bgModStrong: Int
      public abstract get() {
      }


   public abstract val bgSurfaceOverlay: Int
      public abstract get() {
      }


   public abstract val borderStrong: Int
      public abstract get() {
      }


   public abstract val borderSubtle: Int
      public abstract get() {
      }


   public abstract val buttonSecondaryBackground: Int
      public abstract get() {
      }


   public abstract val cardPrimaryBg: Int
      public abstract get() {
      }


   public abstract val chatSwipeToReplyBackground: Int
      public abstract get() {
      }


   public abstract val chatSwipeToReplyGradientBackground: Int
      public abstract get() {
      }


   public abstract val embedBackground: Int
      public abstract get() {
      }


   public abstract val headerPrimary: Int
      public abstract get() {
      }


   public abstract val headerSecondary: Int
      public abstract get() {
      }


   public abstract val infoDangerForeground: Int
      public abstract get() {
      }


   public abstract val interactiveActive: Int
      public abstract get() {
      }


   public abstract val interactiveMuted: Int
      public abstract get() {
      }


   public abstract val interactiveNormal: Int
      public abstract get() {
      }


   public abstract val redesignButtonPrimaryBackground: Int
      public abstract get() {
      }


   public abstract val redesignButtonPrimaryOverlayBackground: Int
      public abstract get() {
      }


   public abstract val redesignButtonPrimaryOverlayPressedBackground: Int
      public abstract get() {
      }


   public abstract val redesignButtonPrimaryOverlayText: Int
      public abstract get() {
      }


   public abstract val redesignButtonTertiaryBackground: Int
      public abstract get() {
      }


   public abstract val redesignButtonTertiaryText: Int
      public abstract get() {
      }


   public abstract val spoilerHiddenBackground: Int
      public abstract get() {
      }


   public abstract val spoilerRevealedBackground: Int
      public abstract get() {
      }


   public abstract val statusDanger: Int
      public abstract get() {
      }


   public abstract val statusDangerBackground: Int
      public abstract get() {
      }


   public abstract val statusPositive: Int
      public abstract get() {
      }


   public abstract val statusPositiveText: Int
      public abstract get() {
      }


   public abstract val statusWarning: Int
      public abstract get() {
      }


   public abstract val textBrand: Int
      public abstract get() {
      }


   public abstract val textDanger: Int
      public abstract get() {
      }


   public abstract val textLink: Int
      public abstract get() {
      }


   public abstract val textLowContrast: Int
      public abstract get() {
      }


   public abstract val textMuted: Int
      public abstract get() {
      }


   public abstract val textNormal: Int
      public abstract get() {
      }


   public abstract val textPositive: Int
      public abstract get() {
      }


   public abstract val textPrimary: Int
      public abstract get() {
      }


   public abstract val textSecondary: Int
      public abstract get() {
      }


   public abstract val textWarning: Int
      public abstract get() {
      }


   public abstract val white: Int
      public abstract get() {
      }


   public abstract fun getColor(lightColor: Int, darkColor: Int): Int {
   }

   public abstract fun getColorRes(lightColorRes: Int, darkColorRes: Int): Int {
   }
}
