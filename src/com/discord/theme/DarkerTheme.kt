package com.discord.theme

import android.content.res.Resources
import android.content.res.Resources.Theme
import com.discord.theme.utils.ColorUtilsKt
import kh.l
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

internal class DarkerTheme(resources: Resources, theme: Theme) : DiscordThemeObject {
   public open val actionSheetGradientBg: Int
      public open get() {
         return (this.actionSheetGradientBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val activityCardBackground: Int
      public open get() {
         return (this.activityCardBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val activityCardIconOverlay: Int
      public open get() {
         return (this.activityCardIconOverlay$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val alertBg: Int
      public open get() {
         return (this.alertBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val androidNavigationBarBackground: Int
      public open get() {
         return (this.androidNavigationBarBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val androidNavigationScrimBackground: Int
      public open get() {
         return (this.androidNavigationScrimBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val androidRipple: Int
      public open get() {
         return (this.androidRipple$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val autocompleteBg: Int
      public open get() {
         return (this.autocompleteBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundAccent: Int
      public open get() {
         return (this.backgroundAccent$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundFloating: Int
      public open get() {
         return (this.backgroundFloating$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundMentioned: Int
      public open get() {
         return (this.backgroundMentioned$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundMentionedHover: Int
      public open get() {
         return (this.backgroundMentionedHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundMessageAutomod: Int
      public open get() {
         return (this.backgroundMessageAutomod$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundMessageAutomodHover: Int
      public open get() {
         return (this.backgroundMessageAutomodHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundMessageHighlight: Int
      public open get() {
         return (this.backgroundMessageHighlight$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundMessageHighlightHover: Int
      public open get() {
         return (this.backgroundMessageHighlightHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundMessageHover: Int
      public open get() {
         return (this.backgroundMessageHover$delegate.getValue() as java.lang.Number).intValue();
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


   public open val backgroundModifierAccent2: Int
      public open get() {
         return (this.backgroundModifierAccent2$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundModifierActive: Int
      public open get() {
         return (this.backgroundModifierActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundModifierHover: Int
      public open get() {
         return (this.backgroundModifierHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundModifierSelected: Int
      public open get() {
         return (this.backgroundModifierSelected$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val backgroundNestedFloating: Int
      public open get() {
         return (this.backgroundNestedFloating$delegate.getValue() as java.lang.Number).intValue();
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


   public open val badgeBrandBg: Int
      public open get() {
         return (this.badgeBrandBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val badgeBrandText: Int
      public open get() {
         return (this.badgeBrandText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val bgBackdrop: Int
      public open get() {
         return (this.bgBackdrop$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val bgBackdropNoOpacity: Int
      public open get() {
         return (this.bgBackdropNoOpacity$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val bgBasePrimary: Int
      public open get() {
         return (this.bgBasePrimary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val bgBaseSecondary: Int
      public open get() {
         return (this.bgBaseSecondary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val bgBaseTertiary: Int
      public open get() {
         return (this.bgBaseTertiary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val bgBrand: Int
      public open get() {
         return (this.bgBrand$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val bgModFaint: Int
      public open get() {
         return (this.bgModFaint$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val bgModStrong: Int
      public open get() {
         return (this.bgModStrong$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val bgModSubtle: Int
      public open get() {
         return (this.bgModSubtle$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val bgSurfaceOverlay: Int
      public open get() {
         return (this.bgSurfaceOverlay$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val bgSurfaceOverlayTmp: Int
      public open get() {
         return (this.bgSurfaceOverlayTmp$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val bgSurfaceRaised: Int
      public open get() {
         return (this.bgSurfaceRaised$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val black: Int
      public open get() {
         return (this.black$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val blurFallback: Int
      public open get() {
         return (this.blurFallback$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val blurFallbackPressed: Int
      public open get() {
         return (this.blurFallbackPressed$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val borderFaint: Int
      public open get() {
         return (this.borderFaint$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val borderStrong: Int
      public open get() {
         return (this.borderStrong$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val borderSubtle: Int
      public open get() {
         return (this.borderSubtle$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val bugReporterModalSubmittingBackground: Int
      public open get() {
         return (this.bugReporterModalSubmittingBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonCreatorRevenueBackground: Int
      public open get() {
         return (this.buttonCreatorRevenueBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonDangerBackground: Int
      public open get() {
         return (this.buttonDangerBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonDangerBackgroundActive: Int
      public open get() {
         return (this.buttonDangerBackgroundActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonDangerBackgroundDisabled: Int
      public open get() {
         return (this.buttonDangerBackgroundDisabled$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonDangerBackgroundHover: Int
      public open get() {
         return (this.buttonDangerBackgroundHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineBrandBackground: Int
      public open get() {
         return (this.buttonOutlineBrandBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineBrandBackgroundActive: Int
      public open get() {
         return (this.buttonOutlineBrandBackgroundActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineBrandBackgroundHover: Int
      public open get() {
         return (this.buttonOutlineBrandBackgroundHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineBrandBorder: Int
      public open get() {
         return (this.buttonOutlineBrandBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineBrandBorderActive: Int
      public open get() {
         return (this.buttonOutlineBrandBorderActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineBrandBorderHover: Int
      public open get() {
         return (this.buttonOutlineBrandBorderHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineBrandText: Int
      public open get() {
         return (this.buttonOutlineBrandText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineBrandTextActive: Int
      public open get() {
         return (this.buttonOutlineBrandTextActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineBrandTextHover: Int
      public open get() {
         return (this.buttonOutlineBrandTextHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineDangerBackground: Int
      public open get() {
         return (this.buttonOutlineDangerBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineDangerBackgroundActive: Int
      public open get() {
         return (this.buttonOutlineDangerBackgroundActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineDangerBackgroundHover: Int
      public open get() {
         return (this.buttonOutlineDangerBackgroundHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineDangerBorder: Int
      public open get() {
         return (this.buttonOutlineDangerBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineDangerBorderActive: Int
      public open get() {
         return (this.buttonOutlineDangerBorderActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineDangerBorderHover: Int
      public open get() {
         return (this.buttonOutlineDangerBorderHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineDangerText: Int
      public open get() {
         return (this.buttonOutlineDangerText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineDangerTextActive: Int
      public open get() {
         return (this.buttonOutlineDangerTextActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlineDangerTextHover: Int
      public open get() {
         return (this.buttonOutlineDangerTextHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePositiveBackground: Int
      public open get() {
         return (this.buttonOutlinePositiveBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePositiveBackgroundActive: Int
      public open get() {
         return (this.buttonOutlinePositiveBackgroundActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePositiveBackgroundHover: Int
      public open get() {
         return (this.buttonOutlinePositiveBackgroundHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePositiveBorder: Int
      public open get() {
         return (this.buttonOutlinePositiveBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePositiveBorderActive: Int
      public open get() {
         return (this.buttonOutlinePositiveBorderActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePositiveBorderHover: Int
      public open get() {
         return (this.buttonOutlinePositiveBorderHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePositiveText: Int
      public open get() {
         return (this.buttonOutlinePositiveText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePositiveTextActive: Int
      public open get() {
         return (this.buttonOutlinePositiveTextActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePositiveTextHover: Int
      public open get() {
         return (this.buttonOutlinePositiveTextHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePrimaryBackground: Int
      public open get() {
         return (this.buttonOutlinePrimaryBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePrimaryBackgroundActive: Int
      public open get() {
         return (this.buttonOutlinePrimaryBackgroundActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePrimaryBackgroundHover: Int
      public open get() {
         return (this.buttonOutlinePrimaryBackgroundHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePrimaryBorder: Int
      public open get() {
         return (this.buttonOutlinePrimaryBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePrimaryBorderActive: Int
      public open get() {
         return (this.buttonOutlinePrimaryBorderActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePrimaryBorderHover: Int
      public open get() {
         return (this.buttonOutlinePrimaryBorderHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePrimaryText: Int
      public open get() {
         return (this.buttonOutlinePrimaryText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePrimaryTextActive: Int
      public open get() {
         return (this.buttonOutlinePrimaryTextActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonOutlinePrimaryTextHover: Int
      public open get() {
         return (this.buttonOutlinePrimaryTextHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonPositiveBackground: Int
      public open get() {
         return (this.buttonPositiveBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonPositiveBackgroundActive: Int
      public open get() {
         return (this.buttonPositiveBackgroundActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonPositiveBackgroundDisabled: Int
      public open get() {
         return (this.buttonPositiveBackgroundDisabled$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonPositiveBackgroundHover: Int
      public open get() {
         return (this.buttonPositiveBackgroundHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonSecondaryBackground: Int
      public open get() {
         return (this.buttonSecondaryBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonSecondaryBackgroundActive: Int
      public open get() {
         return (this.buttonSecondaryBackgroundActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonSecondaryBackgroundDisabled: Int
      public open get() {
         return (this.buttonSecondaryBackgroundDisabled$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val buttonSecondaryBackgroundHover: Int
      public open get() {
         return (this.buttonSecondaryBackgroundHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val cardGradientBg: Int
      public open get() {
         return (this.cardGradientBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val cardGradientPressedBg: Int
      public open get() {
         return (this.cardGradientPressedBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val cardPrimaryBg: Int
      public open get() {
         return (this.cardPrimaryBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val cardPrimaryPressedBg: Int
      public open get() {
         return (this.cardPrimaryPressedBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val cardSecondaryBg: Int
      public open get() {
         return (this.cardSecondaryBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val cardSecondaryPressedBg: Int
      public open get() {
         return (this.cardSecondaryPressedBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val channelIcon: Int
      public open get() {
         return (this.channelIcon$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val channelTextAreaPlaceholder: Int
      public open get() {
         return (this.channelTextAreaPlaceholder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val channelsDefault: Int
      public open get() {
         return (this.channelsDefault$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val channeltextareaBackground: Int
      public open get() {
         return (this.channeltextareaBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val chatBackground: Int
      public open get() {
         return (this.chatBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val chatBannerBg: Int
      public open get() {
         return (this.chatBannerBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val chatBorder: Int
      public open get() {
         return (this.chatBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val chatInputContainerBackground: Int
      public open get() {
         return (this.chatInputContainerBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val chatSwipeToReplyBackground: Int
      public open get() {
         return (this.chatSwipeToReplyBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val chatSwipeToReplyGradientBackground: Int
      public open get() {
         return (this.chatSwipeToReplyGradientBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val coachmarkBg: Int
      public open get() {
         return (this.coachmarkBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val contentInventoryMediaSeekbarContainer: Int
      public open get() {
         return (this.contentInventoryMediaSeekbarContainer$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val contentInventoryOverlayTextPrimary: Int
      public open get() {
         return (this.contentInventoryOverlayTextPrimary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val contentInventoryOverlayTextSecondary: Int
      public open get() {
         return (this.contentInventoryOverlayTextSecondary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val contentInventoryOverlayUiMod: Int
      public open get() {
         return (this.contentInventoryOverlayUiMod$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val contentInventoryOverlayUiModBg: Int
      public open get() {
         return (this.contentInventoryOverlayUiModBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val contextMenuBackdropBackground: Int
      public open get() {
         return (this.contextMenuBackdropBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val controlBrandForeground: Int
      public open get() {
         return (this.controlBrandForeground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val controlBrandForegroundNew: Int
      public open get() {
         return (this.controlBrandForegroundNew$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val creatorRevenueIconGradientEnd: Int
      public open get() {
         return (this.creatorRevenueIconGradientEnd$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val creatorRevenueIconGradientStart: Int
      public open get() {
         return (this.creatorRevenueIconGradientStart$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val creatorRevenueInfoBoxBackground: Int
      public open get() {
         return (this.creatorRevenueInfoBoxBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val creatorRevenueInfoBoxBorder: Int
      public open get() {
         return (this.creatorRevenueInfoBoxBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val creatorRevenueLockedChannelIcon: Int
      public open get() {
         return (this.creatorRevenueLockedChannelIcon$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val creatorRevenueProgressBar: Int
      public open get() {
         return (this.creatorRevenueProgressBar$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val customStatusBubbleBg: Int
      public open get() {
         return (this.customStatusBubbleBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val deprecatedCardBg: Int
      public open get() {
         return (this.deprecatedCardBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val deprecatedCardEditableBg: Int
      public open get() {
         return (this.deprecatedCardEditableBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val deprecatedQuickswitcherInputBackground: Int
      public open get() {
         return (this.deprecatedQuickswitcherInputBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val deprecatedQuickswitcherInputPlaceholder: Int
      public open get() {
         return (this.deprecatedQuickswitcherInputPlaceholder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val deprecatedStoreBg: Int
      public open get() {
         return (this.deprecatedStoreBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val deprecatedTextInputBg: Int
      public open get() {
         return (this.deprecatedTextInputBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val deprecatedTextInputBorder: Int
      public open get() {
         return (this.deprecatedTextInputBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val deprecatedTextInputBorderDisabled: Int
      public open get() {
         return (this.deprecatedTextInputBorderDisabled$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val deprecatedTextInputBorderHover: Int
      public open get() {
         return (this.deprecatedTextInputBorderHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val deprecatedTextInputPrefix: Int
      public open get() {
         return (this.deprecatedTextInputPrefix$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val displayBannerOverflowBackground: Int
      public open get() {
         return (this.displayBannerOverflowBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val dividerStrong: Int
      public open get() {
         return (this.dividerStrong$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val dividerSubtle: Int
      public open get() {
         return (this.dividerSubtle$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val embedBackground: Int
      public open get() {
         return (this.embedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val embedBackgroundAlternate: Int
      public open get() {
         return (this.embedBackgroundAlternate$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val embedTitle: Int
      public open get() {
         return (this.embedTitle$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val expressionPickerBg: Int
      public open get() {
         return (this.expressionPickerBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val focusPrimary: Int
      public open get() {
         return (this.focusPrimary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val forumPostExtraMediaCountContainerBackground: Int
      public open get() {
         return (this.forumPostExtraMediaCountContainerBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val forumPostTagBackground: Int
      public open get() {
         return (this.forumPostTagBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val guildIconInactiveBg: Int
      public open get() {
         return (this.guildIconInactiveBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val guildIconInactiveNestedBg: Int
      public open get() {
         return (this.guildIconInactiveNestedBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val guildNotificationsBottomSheetPillBackground: Int
      public open get() {
         return (this.guildNotificationsBottomSheetPillBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val haloPositive: Int
      public open get() {
         return (this.haloPositive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val headerMuted: Int
      public open get() {
         return (this.headerMuted$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val headerPrimary: Int
      public open get() {
         return (this.headerPrimary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val headerSecondary: Int
      public open get() {
         return (this.headerSecondary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val homeBackground: Int
      public open get() {
         return (this.homeBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val homeCardRestingBorder: Int
      public open get() {
         return (this.homeCardRestingBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val iconMuted: Int
      public open get() {
         return (this.iconMuted$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val iconPrimary: Int
      public open get() {
         return (this.iconPrimary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val iconSecondary: Int
      public open get() {
         return (this.iconSecondary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val iconTransparent: Int
      public open get() {
         return (this.iconTransparent$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val infoBoxBackground: Int
      public open get() {
         return (this.infoBoxBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val infoDangerBackground: Int
      public open get() {
         return (this.infoDangerBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val infoDangerForeground: Int
      public open get() {
         return (this.infoDangerForeground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val infoDangerText: Int
      public open get() {
         return (this.infoDangerText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val infoHelpBackground: Int
      public open get() {
         return (this.infoHelpBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val infoHelpForeground: Int
      public open get() {
         return (this.infoHelpForeground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val infoHelpText: Int
      public open get() {
         return (this.infoHelpText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val infoPositiveBackground: Int
      public open get() {
         return (this.infoPositiveBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val infoPositiveForeground: Int
      public open get() {
         return (this.infoPositiveForeground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val infoPositiveText: Int
      public open get() {
         return (this.infoPositiveText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val infoWarningBackground: Int
      public open get() {
         return (this.infoWarningBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val infoWarningForeground: Int
      public open get() {
         return (this.infoWarningForeground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val infoWarningText: Int
      public open get() {
         return (this.infoWarningText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val inputBackground: Int
      public open get() {
         return (this.inputBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val inputFocusedBorder: Int
      public open get() {
         return (this.inputFocusedBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val inputPlaceholderText: Int
      public open get() {
         return (this.inputPlaceholderText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val interactiveActive: Int
      public open get() {
         return (this.interactiveActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val interactiveHover: Int
      public open get() {
         return (this.interactiveHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val interactiveMuted: Int
      public open get() {
         return (this.interactiveMuted$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val interactiveNormal: Int
      public open get() {
         return (this.interactiveNormal$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val legacyAndroidBlurOverlayDefault: Int
      public open get() {
         return (this.legacyAndroidBlurOverlayDefault$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val legacyAndroidBlurOverlayUltraThin: Int
      public open get() {
         return (this.legacyAndroidBlurOverlayUltraThin$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val legacyBlurFallbackDefault: Int
      public open get() {
         return (this.legacyBlurFallbackDefault$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val legacyBlurFallbackUltraThin: Int
      public open get() {
         return (this.legacyBlurFallbackUltraThin$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val liveStageTileBorder: Int
      public open get() {
         return (this.liveStageTileBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val logoPrimary: Int
      public open get() {
         return (this.logoPrimary$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val mentionBackground: Int
      public open get() {
         return (this.mentionBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val mentionForeground: Int
      public open get() {
         return (this.mentionForeground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val menuItemDangerActiveBg: Int
      public open get() {
         return (this.menuItemDangerActiveBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val menuItemDangerHoverBg: Int
      public open get() {
         return (this.menuItemDangerHoverBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val menuItemDefaultActiveBg: Int
      public open get() {
         return (this.menuItemDefaultActiveBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val menuItemDefaultHoverBg: Int
      public open get() {
         return (this.menuItemDefaultHoverBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val modalBackground: Int
      public open get() {
         return (this.modalBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val modalFooterBackground: Int
      public open get() {
         return (this.modalFooterBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val navigatorHeaderTint: Int
      public open get() {
         return (this.navigatorHeaderTint$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val panelBg: Int
      public open get() {
         return (this.panelBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val pollsNormalFillHover: Int
      public open get() {
         return (this.pollsNormalFillHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val pollsNormalImageBackground: Int
      public open get() {
         return (this.pollsNormalImageBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val pollsVictorFill: Int
      public open get() {
         return (this.pollsVictorFill$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val pollsVotedFill: Int
      public open get() {
         return (this.pollsVotedFill$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val premiumNitroPinkText: Int
      public open get() {
         return (this.premiumNitroPinkText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val profileGradientCardBackground: Int
      public open get() {
         return (this.profileGradientCardBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val profileGradientMessageInputBorder: Int
      public open get() {
         return (this.profileGradientMessageInputBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val profileGradientNoteBackground: Int
      public open get() {
         return (this.profileGradientNoteBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val profileGradientOverlay: Int
      public open get() {
         return (this.profileGradientOverlay$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val profileGradientOverlaySyncedWithUserTheme: Int
      public open get() {
         return (this.profileGradientOverlaySyncedWithUserTheme$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val profileGradientProfileBodyBackgroundHover: Int
      public open get() {
         return (this.profileGradientProfileBodyBackgroundHover$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val profileGradientRolePillBackground: Int
      public open get() {
         return (this.profileGradientRolePillBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val profileGradientRolePillBorder: Int
      public open get() {
         return (this.profileGradientRolePillBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val profileGradientSectionBox: Int
      public open get() {
         return (this.profileGradientSectionBox$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignActivityCardBackground: Int
      public open get() {
         return (this.redesignActivityCardBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignActivityCardBackgroundPressed: Int
      public open get() {
         return (this.redesignActivityCardBackgroundPressed$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignActivityCardBadgeIcon: Int
      public open get() {
         return (this.redesignActivityCardBadgeIcon$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignActivityCardBorder: Int
      public open get() {
         return (this.redesignActivityCardBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignActivityCardOverflowBackground: Int
      public open get() {
         return (this.redesignActivityCardOverflowBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonActiveBackground: Int
      public open get() {
         return (this.redesignButtonActiveBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonActivePressedBackground: Int
      public open get() {
         return (this.redesignButtonActivePressedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonActiveText: Int
      public open get() {
         return (this.redesignButtonActiveText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonDangerBackground: Int
      public open get() {
         return (this.redesignButtonDangerBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonDangerPressedBackground: Int
      public open get() {
         return (this.redesignButtonDangerPressedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonDangerText: Int
      public open get() {
         return (this.redesignButtonDangerText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonDestructiveBackground: Int
      public open get() {
         return (this.redesignButtonDestructiveBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonDestructivePressedBackground: Int
      public open get() {
         return (this.redesignButtonDestructivePressedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonDestructiveText: Int
      public open get() {
         return (this.redesignButtonDestructiveText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonOverlayAlphaBackground: Int
      public open get() {
         return (this.redesignButtonOverlayAlphaBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonOverlayAlphaPressedBackground: Int
      public open get() {
         return (this.redesignButtonOverlayAlphaPressedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonOverlayAlphaText: Int
      public open get() {
         return (this.redesignButtonOverlayAlphaText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonOverlayBackground: Int
      public open get() {
         return (this.redesignButtonOverlayBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonOverlayPressedBackground: Int
      public open get() {
         return (this.redesignButtonOverlayPressedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonOverlayText: Int
      public open get() {
         return (this.redesignButtonOverlayText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPositiveBackground: Int
      public open get() {
         return (this.redesignButtonPositiveBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPositivePressedBackground: Int
      public open get() {
         return (this.redesignButtonPositivePressedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPositiveText: Int
      public open get() {
         return (this.redesignButtonPositiveText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryAltBackground: Int
      public open get() {
         return (this.redesignButtonPrimaryAltBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryAltBorder: Int
      public open get() {
         return (this.redesignButtonPrimaryAltBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryAltOnBlurpleBackground: Int
      public open get() {
         return (this.redesignButtonPrimaryAltOnBlurpleBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryAltOnBlurpleBorder: Int
      public open get() {
         return (this.redesignButtonPrimaryAltOnBlurpleBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryAltOnBlurplePressedBackground: Int
      public open get() {
         return (this.redesignButtonPrimaryAltOnBlurplePressedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryAltOnBlurplePressedBorder: Int
      public open get() {
         return (this.redesignButtonPrimaryAltOnBlurplePressedBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryAltOnBlurpleText: Int
      public open get() {
         return (this.redesignButtonPrimaryAltOnBlurpleText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryAltPressedBackground: Int
      public open get() {
         return (this.redesignButtonPrimaryAltPressedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryAltPressedBorder: Int
      public open get() {
         return (this.redesignButtonPrimaryAltPressedBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryAltPressedText: Int
      public open get() {
         return (this.redesignButtonPrimaryAltPressedText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryAltText: Int
      public open get() {
         return (this.redesignButtonPrimaryAltText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryBackground: Int
      public open get() {
         return (this.redesignButtonPrimaryBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryOnBlurplePressedText: Int
      public open get() {
         return (this.redesignButtonPrimaryOnBlurplePressedText$delegate.getValue() as java.lang.Number).intValue();
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


   public open val redesignButtonPrimaryPressedBackground: Int
      public open get() {
         return (this.redesignButtonPrimaryPressedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonPrimaryText: Int
      public open get() {
         return (this.redesignButtonPrimaryText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonSecondaryBackground: Int
      public open get() {
         return (this.redesignButtonSecondaryBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonSecondaryBorder: Int
      public open get() {
         return (this.redesignButtonSecondaryBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonSecondaryOverlayBackground: Int
      public open get() {
         return (this.redesignButtonSecondaryOverlayBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonSecondaryOverlayPressedBackground: Int
      public open get() {
         return (this.redesignButtonSecondaryOverlayPressedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonSecondaryOverlayText: Int
      public open get() {
         return (this.redesignButtonSecondaryOverlayText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonSecondaryPressedBackground: Int
      public open get() {
         return (this.redesignButtonSecondaryPressedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonSecondaryPressedBorder: Int
      public open get() {
         return (this.redesignButtonSecondaryPressedBorder$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonSecondaryText: Int
      public open get() {
         return (this.redesignButtonSecondaryText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonSelectedBackground: Int
      public open get() {
         return (this.redesignButtonSelectedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonSelectedPressedBackground: Int
      public open get() {
         return (this.redesignButtonSelectedPressedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonSelectedText: Int
      public open get() {
         return (this.redesignButtonSelectedText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonTertiaryBackground: Int
      public open get() {
         return (this.redesignButtonTertiaryBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonTertiaryPressedBackground: Int
      public open get() {
         return (this.redesignButtonTertiaryPressedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonTertiaryPressedText: Int
      public open get() {
         return (this.redesignButtonTertiaryPressedText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignButtonTertiaryText: Int
      public open get() {
         return (this.redesignButtonTertiaryText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignChannelCategoryNameText: Int
      public open get() {
         return (this.redesignChannelCategoryNameText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignChannelMessagePreviewText: Int
      public open get() {
         return (this.redesignChannelMessagePreviewText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignChannelNameMutedText: Int
      public open get() {
         return (this.redesignChannelNameMutedText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignChannelNameText: Int
      public open get() {
         return (this.redesignChannelNameText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignChatInputBackground: Int
      public open get() {
         return (this.redesignChatInputBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignImageButtonPressedBackground: Int
      public open get() {
         return (this.redesignImageButtonPressedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignInputControlActiveBg: Int
      public open get() {
         return (this.redesignInputControlActiveBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignInputControlSelected: Int
      public open get() {
         return (this.redesignInputControlSelected$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignOnlyBackgroundActive: Int
      public open get() {
         return (this.redesignOnlyBackgroundActive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignOnlyBackgroundDefault: Int
      public open get() {
         return (this.redesignOnlyBackgroundDefault$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignOnlyBackgroundOverlay: Int
      public open get() {
         return (this.redesignOnlyBackgroundOverlay$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignOnlyBackgroundRaised: Int
      public open get() {
         return (this.redesignOnlyBackgroundRaised$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val redesignOnlyBackgroundSunken: Int
      public open get() {
         return (this.redesignOnlyBackgroundSunken$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val scrollbarAutoScrollbarColorThumb: Int
      public open get() {
         return (this.scrollbarAutoScrollbarColorThumb$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val scrollbarAutoScrollbarColorTrack: Int
      public open get() {
         return (this.scrollbarAutoScrollbarColorTrack$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val scrollbarAutoThumb: Int
      public open get() {
         return (this.scrollbarAutoThumb$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val scrollbarAutoTrack: Int
      public open get() {
         return (this.scrollbarAutoTrack$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val scrollbarThinThumb: Int
      public open get() {
         return (this.scrollbarThinThumb$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val scrollbarThinTrack: Int
      public open get() {
         return (this.scrollbarThinTrack$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val spoilerHiddenBackground: Int
      public open get() {
         return (this.spoilerHiddenBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val spoilerRevealedBackground: Int
      public open get() {
         return (this.spoilerRevealedBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val stageCardPillBg: Int
      public open get() {
         return (this.stageCardPillBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusDanger: Int
      public open get() {
         return (this.statusDanger$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusDangerBackground: Int
      public open get() {
         return (this.statusDangerBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusDangerText: Int
      public open get() {
         return (this.statusDangerText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusDnd: Int
      public open get() {
         return (this.statusDnd$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusIdle: Int
      public open get() {
         return (this.statusIdle$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusOffline: Int
      public open get() {
         return (this.statusOffline$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusOnline: Int
      public open get() {
         return (this.statusOnline$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusPositive: Int
      public open get() {
         return (this.statusPositive$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusPositiveBackground: Int
      public open get() {
         return (this.statusPositiveBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusPositiveText: Int
      public open get() {
         return (this.statusPositiveText$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusSpeaking: Int
      public open get() {
         return (this.statusSpeaking$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusWarning: Int
      public open get() {
         return (this.statusWarning$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusWarningBackground: Int
      public open get() {
         return (this.statusWarningBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val statusWarningText: Int
      public open get() {
         return (this.statusWarningText$delegate.getValue() as java.lang.Number).intValue();
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


   public open val textLinkLowSaturation: Int
      public open get() {
         return (this.textLinkLowSaturation$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val textLowContrast: Int
      public open get() {
         return (this.textLowContrast$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val textMessagePreviewLowSat: Int
      public open get() {
         return (this.textMessagePreviewLowSat$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val textMuted: Int
      public open get() {
         return (this.textMuted$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val textMutedOnDefault: Int
      public open get() {
         return (this.textMutedOnDefault$delegate.getValue() as java.lang.Number).intValue();
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


   public open val textboxMarkdownSyntax: Int
      public open get() {
         return (this.textboxMarkdownSyntax$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val themeLockedBlurFallback: Int
      public open get() {
         return (this.themeLockedBlurFallback$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val threadChannelSpine: Int
      public open get() {
         return (this.threadChannelSpine$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val toastBg: Int
      public open get() {
         return (this.toastBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val typingIndicatorBg: Int
      public open get() {
         return (this.typingIndicatorBg$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val userProfileHeaderOverflowBackground: Int
      public open get() {
         return (this.userProfileHeaderOverflowBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val voiceVideoVideoTileBackground: Int
      public open get() {
         return (this.voiceVideoVideoTileBackground$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val voiceVideoVideoTileBlurFallback: Int
      public open get() {
         return (this.voiceVideoVideoTileBlurFallback$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val white: Int
      public open get() {
         return (this.white$delegate.getValue() as java.lang.Number).intValue();
      }


   public open val youBarBg: Int
      public open get() {
         return (this.youBarBg$delegate.getValue() as java.lang.Number).intValue();
      }


   init {
      q.h(var1, "resources");
      q.h(var2, "theme");
      super(null);
      this.actionSheetGradientBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_20, this.$theme);
         }
      });
      this.activityCardBackground$delegate = l.b(new Function0(var1, var2) {
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
      this.activityCardIconOverlay$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.activity_card_icon_overlay_darker, this.$theme);
         }
      });
      this.alertBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_20, this.$theme);
         }
      });
      this.androidNavigationBarBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_24, this.$theme);
         }
      });
      this.androidNavigationScrimBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.android_navigation_scrim_background_darker, this.$theme);
         }
      });
      this.androidRipple$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.android_ripple_darker, this.$theme);
         }
      });
      this.autocompleteBg$delegate = l.b(new Function0(var1, var2) {
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
      this.backgroundAccent$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_15, this.$theme);
         }
      });
      this.backgroundFloating$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_18, this.$theme);
         }
      });
      this.backgroundMentioned$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.background_mentioned_darker, this.$theme);
         }
      });
      this.backgroundMentionedHover$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.background_mentioned_hover_darker, this.$theme);
         }
      });
      this.backgroundMessageAutomod$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.background_message_automod_darker, this.$theme);
         }
      });
      this.backgroundMessageAutomodHover$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.background_message_automod_hover_darker, this.$theme);
         }
      });
      this.backgroundMessageHighlight$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.background_message_highlight_darker, this.$theme);
         }
      });
      this.backgroundMessageHighlightHover$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.background_message_highlight_hover_darker, this.$theme);
         }
      });
      this.backgroundMessageHover$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_21, this.$theme);
         }
      });
      this.backgroundMobilePrimary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_20, this.$theme);
         }
      });
      this.backgroundMobileSecondary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_20, this.$theme);
         }
      });
      this.backgroundModifierAccent$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.background_modifier_accent_darker, this.$theme);
         }
      });
      this.backgroundModifierAccent2$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.background_modifier_accent_2_darker, this.$theme);
         }
      });
      this.backgroundModifierActive$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.background_modifier_active_darker, this.$theme);
         }
      });
      this.backgroundModifierHover$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.background_modifier_hover_darker, this.$theme);
         }
      });
      this.backgroundModifierSelected$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.background_modifier_selected_darker, this.$theme);
         }
      });
      this.backgroundNestedFloating$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_22, this.$theme);
         }
      });
      this.backgroundPrimary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_20, this.$theme);
         }
      });
      this.backgroundSecondary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_18, this.$theme);
         }
      });
      this.backgroundSecondaryAlt$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_15, this.$theme);
         }
      });
      this.backgroundTertiary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_16, this.$theme);
         }
      });
      this.badgeBrandBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.brand_260, this.$theme);
         }
      });
      this.badgeBrandText$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.brand_560, this.$theme);
         }
      });
      this.bgBackdrop$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.bg_backdrop_darker, this.$theme);
         }
      });
      this.bgBackdropNoOpacity$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.black, this.$theme);
         }
      });
      this.bgBasePrimary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_20, this.$theme);
         }
      });
      this.bgBaseSecondary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_20, this.$theme);
         }
      });
      this.bgBaseTertiary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_23, this.$theme);
         }
      });
      this.bgBrand$delegate = l.b(new Function0(var1, var2) {
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
      this.bgModFaint$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.bg_mod_faint_darker, this.$theme);
         }
      });
      this.bgModStrong$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.bg_mod_strong_darker, this.$theme);
         }
      });
      this.bgModSubtle$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.bg_mod_subtle_darker, this.$theme);
         }
      });
      this.bgSurfaceOverlay$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_17, this.$theme);
         }
      });
      this.bgSurfaceOverlayTmp$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_17, this.$theme);
         }
      });
      this.bgSurfaceRaised$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_18, this.$theme);
         }
      });
      this.black$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.black, this.$theme);
         }
      });
      this.blurFallback$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.blur_fallback_darker, this.$theme);
         }
      });
      this.blurFallbackPressed$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.blur_fallback_pressed_darker, this.$theme);
         }
      });
      this.borderFaint$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.border_faint_darker, this.$theme);
         }
      });
      this.borderStrong$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.border_strong_darker, this.$theme);
         }
      });
      this.borderSubtle$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.border_subtle_darker, this.$theme);
         }
      });
      this.bugReporterModalSubmittingBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.bug_reporter_modal_submitting_background_darker, this.$theme);
         }
      });
      this.buttonCreatorRevenueBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.teal_430, this.$theme);
         }
      });
      this.buttonDangerBackground$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonDangerBackgroundActive$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.red_530, this.$theme);
         }
      });
      this.buttonDangerBackgroundDisabled$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonDangerBackgroundHover$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.red_500, this.$theme);
         }
      });
      this.buttonOutlineBrandBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.button_outline_brand_background_darker, this.$theme);
         }
      });
      this.buttonOutlineBrandBackgroundActive$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.brand_560, this.$theme);
         }
      });
      this.buttonOutlineBrandBackgroundHover$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlineBrandBorder$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlineBrandBorderActive$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.brand_560, this.$theme);
         }
      });
      this.buttonOutlineBrandBorderHover$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlineBrandText$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlineBrandTextActive$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlineBrandTextHover$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlineDangerBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.button_outline_danger_background_darker, this.$theme);
         }
      });
      this.buttonOutlineDangerBackgroundActive$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.red_460, this.$theme);
         }
      });
      this.buttonOutlineDangerBackgroundHover$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlineDangerBorder$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlineDangerBorderActive$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlineDangerBorderHover$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlineDangerText$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlineDangerTextActive$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlineDangerTextHover$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlinePositiveBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.button_outline_positive_background_darker, this.$theme);
         }
      });
      this.buttonOutlinePositiveBackgroundActive$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.green_530, this.$theme);
         }
      });
      this.buttonOutlinePositiveBackgroundHover$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.green_430, this.$theme);
         }
      });
      this.buttonOutlinePositiveBorder$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlinePositiveBorderActive$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.green_530, this.$theme);
         }
      });
      this.buttonOutlinePositiveBorderHover$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.green_430, this.$theme);
         }
      });
      this.buttonOutlinePositiveText$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlinePositiveTextActive$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlinePositiveTextHover$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlinePrimaryBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.button_outline_primary_background_darker, this.$theme);
         }
      });
      this.buttonOutlinePrimaryBackgroundActive$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_11, this.$theme);
         }
      });
      this.buttonOutlinePrimaryBackgroundHover$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_13, this.$theme);
         }
      });
      this.buttonOutlinePrimaryBorder$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlinePrimaryBorderActive$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_11, this.$theme);
         }
      });
      this.buttonOutlinePrimaryBorderHover$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_13, this.$theme);
         }
      });
      this.buttonOutlinePrimaryText$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlinePrimaryTextActive$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonOutlinePrimaryTextHover$delegate = l.b(new Function0(var1, var2) {
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
      this.buttonPositiveBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.green_430, this.$theme);
         }
      });
      this.buttonPositiveBackgroundActive$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.green_530, this.$theme);
         }
      });
      this.buttonPositiveBackgroundDisabled$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.green_430, this.$theme);
         }
      });
      this.buttonPositiveBackgroundHover$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.green_500, this.$theme);
         }
      });
      this.buttonSecondaryBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_13, this.$theme);
         }
      });
      this.buttonSecondaryBackgroundActive$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_10, this.$theme);
         }
      });
      this.buttonSecondaryBackgroundDisabled$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_13, this.$theme);
         }
      });
      this.buttonSecondaryBackgroundHover$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_11, this.$theme);
         }
      });
      this.cardGradientBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.card_gradient_bg_darker, this.$theme);
         }
      });
      this.cardGradientPressedBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.card_gradient_pressed_bg_darker, this.$theme);
         }
      });
      this.cardPrimaryBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_18, this.$theme);
         }
      });
      this.cardPrimaryPressedBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_19, this.$theme);
         }
      });
      this.cardSecondaryBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_19, this.$theme);
         }
      });
      this.cardSecondaryPressedBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_21, this.$theme);
         }
      });
      this.channelIcon$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_10, this.$theme);
         }
      });
      this.channelTextAreaPlaceholder$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_11, this.$theme);
         }
      });
      this.channelsDefault$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_9, this.$theme);
         }
      });
      this.channeltextareaBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_15, this.$theme);
         }
      });
      this.chatBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_16, this.$theme);
         }
      });
      this.chatBannerBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_20, this.$theme);
         }
      });
      this.chatBorder$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_20, this.$theme);
         }
      });
      this.chatInputContainerBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_16, this.$theme);
         }
      });
      this.chatSwipeToReplyBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_22, this.$theme);
         }
      });
      this.chatSwipeToReplyGradientBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.chat_swipe_to_reply_gradient_background_darker, this.$theme);
         }
      });
      this.coachmarkBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_17, this.$theme);
         }
      });
      this.contentInventoryMediaSeekbarContainer$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.content_inventory_media_seekbar_container_darker, this.$theme);
         }
      });
      this.contentInventoryOverlayTextPrimary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.content_inventory_overlay_text_primary_darker, this.$theme);
         }
      });
      this.contentInventoryOverlayTextSecondary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.content_inventory_overlay_text_secondary_darker, this.$theme);
         }
      });
      this.contentInventoryOverlayUiMod$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.content_inventory_overlay_ui_mod_darker, this.$theme);
         }
      });
      this.contentInventoryOverlayUiModBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.content_inventory_overlay_ui_mod_bg_darker, this.$theme);
         }
      });
      this.contextMenuBackdropBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.context_menu_backdrop_background_darker, this.$theme);
         }
      });
      this.controlBrandForeground$delegate = l.b(new Function0(var1, var2) {
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
      this.controlBrandForegroundNew$delegate = l.b(new Function0(var1, var2) {
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
      this.creatorRevenueIconGradientEnd$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.teal_430, this.$theme);
         }
      });
      this.creatorRevenueIconGradientStart$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.teal_360, this.$theme);
         }
      });
      this.creatorRevenueInfoBoxBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.creator_revenue_info_box_background_darker, this.$theme);
         }
      });
      this.creatorRevenueInfoBoxBorder$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.teal_400, this.$theme);
         }
      });
      this.creatorRevenueLockedChannelIcon$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.teal_345, this.$theme);
         }
      });
      this.creatorRevenueProgressBar$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.teal_400, this.$theme);
         }
      });
      this.customStatusBubbleBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_17, this.$theme);
         }
      });
      this.deprecatedCardBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.deprecated_card_bg_darker, this.$theme);
         }
      });
      this.deprecatedCardEditableBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.deprecated_card_editable_bg_darker, this.$theme);
         }
      });
      this.deprecatedQuickswitcherInputBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_400, this.$theme);
         }
      });
      this.deprecatedQuickswitcherInputPlaceholder$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.deprecated_quickswitcher_input_placeholder_darker, this.$theme);
         }
      });
      this.deprecatedStoreBg$delegate = l.b(new Function0(var1, var2) {
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
      this.deprecatedTextInputBg$delegate = l.b(new Function0(var1, var2) {
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
      this.deprecatedTextInputBorder$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.deprecated_text_input_border_darker, this.$theme);
         }
      });
      this.deprecatedTextInputBorderDisabled$delegate = l.b(new Function0(var1, var2) {
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
      this.deprecatedTextInputBorderHover$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_900, this.$theme);
         }
      });
      this.deprecatedTextInputPrefix$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_200, this.$theme);
         }
      });
      this.displayBannerOverflowBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.display_banner_overflow_background_darker, this.$theme);
         }
      });
      this.dividerStrong$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.divider_strong_darker, this.$theme);
         }
      });
      this.dividerSubtle$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.divider_subtle_darker, this.$theme);
         }
      });
      this.embedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_18, this.$theme);
         }
      });
      this.embedBackgroundAlternate$delegate = l.b(new Function0(var1, var2) {
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
      this.embedTitle$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_3, this.$theme);
         }
      });
      this.expressionPickerBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_20, this.$theme);
         }
      });
      this.focusPrimary$delegate = l.b(new Function0(var1, var2) {
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
      this.forumPostExtraMediaCountContainerBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.forum_post_extra_media_count_container_background_darker, this.$theme);
         }
      });
      this.forumPostTagBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.forum_post_tag_background_darker, this.$theme);
         }
      });
      this.guildIconInactiveBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_20, this.$theme);
         }
      });
      this.guildIconInactiveNestedBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_20, this.$theme);
         }
      });
      this.guildNotificationsBottomSheetPillBackground$delegate = l.b(new Function0(var1, var2) {
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
      this.haloPositive$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.halo_positive_darker, this.$theme);
         }
      });
      this.headerMuted$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_10, this.$theme);
         }
      });
      this.headerPrimary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_3, this.$theme);
         }
      });
      this.headerSecondary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_9, this.$theme);
         }
      });
      this.homeBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_18, this.$theme);
         }
      });
      this.homeCardRestingBorder$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.home_card_resting_border_darker, this.$theme);
         }
      });
      this.iconMuted$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_11, this.$theme);
         }
      });
      this.iconPrimary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_4, this.$theme);
         }
      });
      this.iconSecondary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_9, this.$theme);
         }
      });
      this.iconTransparent$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.icon_transparent_darker, this.$theme);
         }
      });
      this.infoBoxBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.info_box_background_darker, this.$theme);
         }
      });
      this.infoDangerBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.info_danger_background_darker, this.$theme);
         }
      });
      this.infoDangerForeground$delegate = l.b(new Function0(var1, var2) {
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
      this.infoDangerText$delegate = l.b(new Function0(var1, var2) {
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
      this.infoHelpBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.info_help_background_darker, this.$theme);
         }
      });
      this.infoHelpForeground$delegate = l.b(new Function0(var1, var2) {
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
      this.infoHelpText$delegate = l.b(new Function0(var1, var2) {
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
      this.infoPositiveBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.info_positive_background_darker, this.$theme);
         }
      });
      this.infoPositiveForeground$delegate = l.b(new Function0(var1, var2) {
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
      this.infoPositiveText$delegate = l.b(new Function0(var1, var2) {
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
      this.infoWarningBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.info_warning_background_darker, this.$theme);
         }
      });
      this.infoWarningForeground$delegate = l.b(new Function0(var1, var2) {
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
      this.infoWarningText$delegate = l.b(new Function0(var1, var2) {
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
      this.inputBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.input_background_darker, this.$theme);
         }
      });
      this.inputFocusedBorder$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.input_focused_border_darker, this.$theme);
         }
      });
      this.inputPlaceholderText$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_10, this.$theme);
         }
      });
      this.interactiveActive$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_1, this.$theme);
         }
      });
      this.interactiveHover$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_4, this.$theme);
         }
      });
      this.interactiveMuted$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_13, this.$theme);
         }
      });
      this.interactiveNormal$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_6, this.$theme);
         }
      });
      this.legacyAndroidBlurOverlayDefault$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.legacy_android_blur_overlay_default_darker, this.$theme);
         }
      });
      this.legacyAndroidBlurOverlayUltraThin$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.legacy_android_blur_overlay_ultra_thin_darker, this.$theme);
         }
      });
      this.legacyBlurFallbackDefault$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.legacy_blur_fallback_default_darker, this.$theme);
         }
      });
      this.legacyBlurFallbackUltraThin$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.legacy_blur_fallback_ultra_thin_darker, this.$theme);
         }
      });
      this.liveStageTileBorder$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.live_stage_tile_border_darker, this.$theme);
         }
      });
      this.logoPrimary$delegate = l.b(new Function0(var1, var2) {
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
      this.mentionBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.mention_background_darker, this.$theme);
         }
      });
      this.mentionForeground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.brand_230, this.$theme);
         }
      });
      this.menuItemDangerActiveBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.red_530, this.$theme);
         }
      });
      this.menuItemDangerHoverBg$delegate = l.b(new Function0(var1, var2) {
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
      this.menuItemDefaultActiveBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.brand_560, this.$theme);
         }
      });
      this.menuItemDefaultHoverBg$delegate = l.b(new Function0(var1, var2) {
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
      this.modalBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_16, this.$theme);
         }
      });
      this.modalFooterBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_17, this.$theme);
         }
      });
      this.navigatorHeaderTint$delegate = l.b(new Function0(var1, var2) {
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
      this.panelBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_20, this.$theme);
         }
      });
      this.pollsNormalFillHover$delegate = l.b(new Function0(var1, var2) {
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
      this.pollsNormalImageBackground$delegate = l.b(new Function0(var1, var2) {
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
      this.pollsVictorFill$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.polls_victor_fill_darker, this.$theme);
         }
      });
      this.pollsVotedFill$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.polls_voted_fill_darker, this.$theme);
         }
      });
      this.premiumNitroPinkText$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.premium_nitro_pink_light, this.$theme);
         }
      });
      this.profileGradientCardBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.profile_gradient_card_background_darker, this.$theme);
         }
      });
      this.profileGradientMessageInputBorder$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.profile_gradient_message_input_border_darker, this.$theme);
         }
      });
      this.profileGradientNoteBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.profile_gradient_note_background_darker, this.$theme);
         }
      });
      this.profileGradientOverlay$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.profile_gradient_overlay_darker, this.$theme);
         }
      });
      this.profileGradientOverlaySyncedWithUserTheme$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.profile_gradient_overlay_synced_with_user_theme_darker, this.$theme);
         }
      });
      this.profileGradientProfileBodyBackgroundHover$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.profile_gradient_profile_body_background_hover_darker, this.$theme);
         }
      });
      this.profileGradientRolePillBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.profile_gradient_role_pill_background_darker, this.$theme);
         }
      });
      this.profileGradientRolePillBorder$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.profile_gradient_role_pill_border_darker, this.$theme);
         }
      });
      this.profileGradientSectionBox$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.profile_gradient_section_box_darker, this.$theme);
         }
      });
      this.redesignActivityCardBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_560, this.$theme);
         }
      });
      this.redesignActivityCardBackgroundPressed$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignActivityCardBadgeIcon$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_10, this.$theme);
         }
      });
      this.redesignActivityCardBorder$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_activity_card_border_darker, this.$theme);
         }
      });
      this.redesignActivityCardOverflowBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_17, this.$theme);
         }
      });
      this.redesignButtonActiveBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.green_430, this.$theme);
         }
      });
      this.redesignButtonActivePressedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.green_460, this.$theme);
         }
      });
      this.redesignButtonActiveText$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonDangerBackground$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonDangerPressedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.red_460, this.$theme);
         }
      });
      this.redesignButtonDangerText$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonDestructiveBackground$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonDestructivePressedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.red_460, this.$theme);
         }
      });
      this.redesignButtonDestructiveText$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonOverlayAlphaBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_button_overlay_alpha_background_darker, this.$theme);
         }
      });
      this.redesignButtonOverlayAlphaPressedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_button_overlay_alpha_pressed_background_darker, this.$theme);
         }
      });
      this.redesignButtonOverlayAlphaText$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonOverlayBackground$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonOverlayPressedBackground$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonOverlayText$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_860, this.$theme);
         }
      });
      this.redesignButtonPositiveBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.green_430, this.$theme);
         }
      });
      this.redesignButtonPositivePressedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.green_460, this.$theme);
         }
      });
      this.redesignButtonPositiveText$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonPrimaryAltBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_button_primary_alt_background_darker, this.$theme);
         }
      });
      this.redesignButtonPrimaryAltBorder$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonPrimaryAltOnBlurpleBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_button_primary_alt_on_blurple_background_darker, this.$theme);
         }
      });
      this.redesignButtonPrimaryAltOnBlurpleBorder$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonPrimaryAltOnBlurplePressedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.brand_530, this.$theme);
         }
      });
      this.redesignButtonPrimaryAltOnBlurplePressedBorder$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonPrimaryAltOnBlurpleText$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonPrimaryAltPressedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_button_primary_alt_pressed_background_darker, this.$theme);
         }
      });
      this.redesignButtonPrimaryAltPressedBorder$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_button_primary_alt_pressed_border_darker, this.$theme);
         }
      });
      this.redesignButtonPrimaryAltPressedText$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonPrimaryAltText$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonPrimaryBackground$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonPrimaryOnBlurplePressedText$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.brand_530, this.$theme);
         }
      });
      this.redesignButtonPrimaryOverlayBackground$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonPrimaryOverlayPressedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_4, this.$theme);
         }
      });
      this.redesignButtonPrimaryOverlayText$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_25, this.$theme);
         }
      });
      this.redesignButtonPrimaryPressedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.brand_560, this.$theme);
         }
      });
      this.redesignButtonPrimaryText$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonSecondaryBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_15, this.$theme);
         }
      });
      this.redesignButtonSecondaryBorder$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_button_secondary_border_darker, this.$theme);
         }
      });
      this.redesignButtonSecondaryOverlayBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_button_secondary_overlay_background_darker, this.$theme);
         }
      });
      this.redesignButtonSecondaryOverlayPressedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_button_secondary_overlay_pressed_background_darker, this.$theme);
         }
      });
      this.redesignButtonSecondaryOverlayText$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonSecondaryPressedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_13, this.$theme);
         }
      });
      this.redesignButtonSecondaryPressedBorder$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_button_secondary_pressed_border_darker, this.$theme);
         }
      });
      this.redesignButtonSecondaryText$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_6, this.$theme);
         }
      });
      this.redesignButtonSelectedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_button_selected_background_darker, this.$theme);
         }
      });
      this.redesignButtonSelectedPressedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_button_selected_pressed_background_darker, this.$theme);
         }
      });
      this.redesignButtonSelectedText$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignButtonTertiaryBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_button_tertiary_background_darker, this.$theme);
         }
      });
      this.redesignButtonTertiaryPressedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_button_tertiary_pressed_background_darker, this.$theme);
         }
      });
      this.redesignButtonTertiaryPressedText$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_5, this.$theme);
         }
      });
      this.redesignButtonTertiaryText$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_6, this.$theme);
         }
      });
      this.redesignChannelCategoryNameText$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_9, this.$theme);
         }
      });
      this.redesignChannelMessagePreviewText$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_10, this.$theme);
         }
      });
      this.redesignChannelNameMutedText$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_10, this.$theme);
         }
      });
      this.redesignChannelNameText$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_3, this.$theme);
         }
      });
      this.redesignChatInputBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_chat_input_background_darker, this.$theme);
         }
      });
      this.redesignImageButtonPressedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.redesign_image_button_pressed_background_darker, this.$theme);
         }
      });
      this.redesignInputControlActiveBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_16, this.$theme);
         }
      });
      this.redesignInputControlSelected$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignOnlyBackgroundActive$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignOnlyBackgroundDefault$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignOnlyBackgroundOverlay$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.primary_645, this.$theme);
         }
      });
      this.redesignOnlyBackgroundRaised$delegate = l.b(new Function0(var1, var2) {
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
      this.redesignOnlyBackgroundSunken$delegate = l.b(new Function0(var1, var2) {
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
      this.scrollbarAutoScrollbarColorThumb$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_21, this.$theme);
         }
      });
      this.scrollbarAutoScrollbarColorTrack$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_17, this.$theme);
         }
      });
      this.scrollbarAutoThumb$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_21, this.$theme);
         }
      });
      this.scrollbarAutoTrack$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_19, this.$theme);
         }
      });
      this.scrollbarThinThumb$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_21, this.$theme);
         }
      });
      this.scrollbarThinTrack$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.scrollbar_thin_track_darker, this.$theme);
         }
      });
      this.spoilerHiddenBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_14, this.$theme);
         }
      });
      this.spoilerRevealedBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.spoiler_revealed_background_darker, this.$theme);
         }
      });
      this.stageCardPillBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_19, this.$theme);
         }
      });
      this.statusDanger$delegate = l.b(new Function0(var1, var2) {
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
      this.statusDangerBackground$delegate = l.b(new Function0(var1, var2) {
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
      this.statusDangerText$delegate = l.b(new Function0(var1, var2) {
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
      this.statusDnd$delegate = l.b(new Function0(var1, var2) {
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
      this.statusIdle$delegate = l.b(new Function0(var1, var2) {
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
      this.statusOffline$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_9, this.$theme);
         }
      });
      this.statusOnline$delegate = l.b(new Function0(var1, var2) {
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
      this.statusPositive$delegate = l.b(new Function0(var1, var2) {
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
      this.statusPositiveBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.green_430, this.$theme);
         }
      });
      this.statusPositiveText$delegate = l.b(new Function0(var1, var2) {
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
      this.statusSpeaking$delegate = l.b(new Function0(var1, var2) {
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
      this.statusWarning$delegate = l.b(new Function0(var1, var2) {
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
      this.statusWarningBackground$delegate = l.b(new Function0(var1, var2) {
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
      this.statusWarningText$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.black, this.$theme);
         }
      });
      this.textBrand$delegate = l.b(new Function0(var1, var2) {
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
      this.textDanger$delegate = l.b(new Function0(var1, var2) {
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
      this.textLink$delegate = l.b(new Function0(var1, var2) {
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
      this.textLinkLowSaturation$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.blue_330, this.$theme);
         }
      });
      this.textLowContrast$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_11, this.$theme);
         }
      });
      this.textMessagePreviewLowSat$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_11, this.$theme);
         }
      });
      this.textMuted$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_10, this.$theme);
         }
      });
      this.textMutedOnDefault$delegate = l.b(new Function0(var1, var2) {
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
      this.textNormal$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_6, this.$theme);
         }
      });
      this.textPositive$delegate = l.b(new Function0(var1, var2) {
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
      this.textPrimary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_6, this.$theme);
         }
      });
      this.textSecondary$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_9, this.$theme);
         }
      });
      this.textWarning$delegate = l.b(new Function0(var1, var2) {
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
      this.textboxMarkdownSyntax$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_9, this.$theme);
         }
      });
      this.themeLockedBlurFallback$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.theme_locked_blur_fallback_darker, this.$theme);
         }
      });
      this.threadChannelSpine$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_13, this.$theme);
         }
      });
      this.toastBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_17, this.$theme);
         }
      });
      this.typingIndicatorBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_20, this.$theme);
         }
      });
      this.userProfileHeaderOverflowBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.user_profile_header_overflow_background_darker, this.$theme);
         }
      });
      this.voiceVideoVideoTileBackground$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.voice_video_video_tile_background_darker, this.$theme);
         }
      });
      this.voiceVideoVideoTileBlurFallback$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.voice_video_video_tile_blur_fallback_darker, this.$theme);
         }
      });
      this.white$delegate = l.b(new Function0(var1, var2) {
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
      this.youBarBg$delegate = l.b(new Function0(var1, var2) {
         final Resources $resources;
         final Theme $theme;

         {
            super(0);
            this.$resources = var1;
            this.$theme = var2;
         }

         public final Integer invoke() {
            return ColorUtilsKt.getColorCompat(this.$resources, R.color.plum_17, this.$theme);
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
