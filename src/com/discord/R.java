package com.discord;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public final class R {
   private R() {
   }

   public static final class anim {
      public static final int abc_fade_in = 2130771968;
      public static final int abc_fade_out = 2130771969;
      public static final int abc_grow_fade_in_from_bottom = 2130771970;
      public static final int abc_popup_enter = 2130771971;
      public static final int abc_popup_exit = 2130771972;
      public static final int abc_shrink_fade_out_from_bottom = 2130771973;
      public static final int abc_slide_in_bottom = 2130771974;
      public static final int abc_slide_in_top = 2130771975;
      public static final int abc_slide_out_bottom = 2130771976;
      public static final int abc_slide_out_top = 2130771977;
      public static final int abc_tooltip_enter = 2130771978;
      public static final int abc_tooltip_exit = 2130771979;
      public static final int anim_progress_dots_scale_down = 2130771980;
      public static final int anim_progress_dots_scale_up = 2130771981;
      public static final int anim_slide_in_down = 2130771982;
      public static final int anim_slide_in_up = 2130771983;
      public static final int anim_slide_out_down = 2130771984;
      public static final int anim_slide_out_up = 2130771985;
      public static final int bounce = 2130771986;
      public static final int btn_checkbox_to_checked_box_inner_merged_animation = 2130771987;
      public static final int btn_checkbox_to_checked_box_outer_merged_animation = 2130771988;
      public static final int btn_checkbox_to_checked_icon_null_animation = 2130771989;
      public static final int btn_checkbox_to_unchecked_box_inner_merged_animation = 2130771990;
      public static final int btn_checkbox_to_unchecked_check_path_merged_animation = 2130771991;
      public static final int btn_checkbox_to_unchecked_icon_null_animation = 2130771992;
      public static final int btn_radio_to_off_mtrl_dot_group_animation = 2130771993;
      public static final int btn_radio_to_off_mtrl_ring_outer_animation = 2130771994;
      public static final int btn_radio_to_off_mtrl_ring_outer_path_animation = 2130771995;
      public static final int btn_radio_to_on_mtrl_dot_group_animation = 2130771996;
      public static final int btn_radio_to_on_mtrl_ring_outer_animation = 2130771997;
      public static final int btn_radio_to_on_mtrl_ring_outer_path_animation = 2130771998;
      public static final int catalyst_fade_in = 2130771999;
      public static final int catalyst_fade_out = 2130772000;
      public static final int catalyst_push_up_in = 2130772001;
      public static final int catalyst_push_up_out = 2130772002;
      public static final int catalyst_slide_down = 2130772003;
      public static final int catalyst_slide_up = 2130772004;
      public static final int design_bottom_sheet_slide_in = 2130772005;
      public static final int design_bottom_sheet_slide_out = 2130772006;
      public static final int design_snackbar_in = 2130772007;
      public static final int design_snackbar_out = 2130772008;
      public static final int fragment_fast_out_extra_slow_in = 2130772009;
      public static final int i25_5_0_1 = 2130772010;
      public static final int i6_0_0_1 = 2130772011;
      public static final int interpolator_minor_overshoot = 2130772012;
      public static final int linear_indeterminate_line1_head_interpolator = 2130772013;
      public static final int linear_indeterminate_line1_tail_interpolator = 2130772014;
      public static final int linear_indeterminate_line2_head_interpolator = 2130772015;
      public static final int linear_indeterminate_line2_tail_interpolator = 2130772016;
      public static final int m3_bottom_sheet_slide_in = 2130772017;
      public static final int m3_bottom_sheet_slide_out = 2130772018;
      public static final int m3_motion_fade_enter = 2130772019;
      public static final int m3_motion_fade_exit = 2130772020;
      public static final int m3_side_sheet_slide_in = 2130772021;
      public static final int m3_side_sheet_slide_out = 2130772022;
      public static final int mtrl_bottom_sheet_slide_in = 2130772023;
      public static final int mtrl_bottom_sheet_slide_out = 2130772024;
      public static final int mtrl_card_lowers_interpolator = 2130772025;
      public static final int rns_default_enter_in = 2130772026;
      public static final int rns_default_enter_out = 2130772027;
      public static final int rns_default_exit_in = 2130772028;
      public static final int rns_default_exit_out = 2130772029;
      public static final int rns_fade_from_bottom = 2130772030;
      public static final int rns_fade_in = 2130772031;
      public static final int rns_fade_out = 2130772032;
      public static final int rns_fade_to_bottom = 2130772033;
      public static final int rns_no_animation_20 = 2130772034;
      public static final int rns_no_animation_250 = 2130772035;
      public static final int rns_no_animation_350 = 2130772036;
      public static final int rns_no_animation_medium = 2130772037;
      public static final int rns_slide_in_from_bottom = 2130772038;
      public static final int rns_slide_in_from_bottom_out = 2130772039;
      public static final int rns_slide_in_from_left = 2130772040;
      public static final int rns_slide_in_from_left_ios = 2130772041;
      public static final int rns_slide_in_from_right = 2130772042;
      public static final int rns_slide_in_from_right_ios = 2130772043;
      public static final int rns_slide_out_to_bottom = 2130772044;
      public static final int rns_slide_out_to_bottom_in = 2130772045;
      public static final int rns_slide_out_to_left = 2130772046;
      public static final int rns_slide_out_to_left_ios = 2130772047;
      public static final int rns_slide_out_to_right = 2130772048;
      public static final int rns_slide_out_to_right_ios = 2130772049;
      public static final int rns_standard_accelerate_interpolator = 2130772050;
      public static final int sine_out_90 = 2130772051;
      public static final int ucrop_loader_circle_path = 2130772052;
      public static final int ucrop_loader_circle_scale = 2130772053;

      private anim() {
      }
   }

   public static final class animator {
      public static final int design_appbar_state_list_animator = 2130837504;
      public static final int design_fab_hide_motion_spec = 2130837505;
      public static final int design_fab_show_motion_spec = 2130837506;
      public static final int fade_in = 2130837507;
      public static final int fade_out = 2130837508;
      public static final int fragment_close_enter = 2130837509;
      public static final int fragment_close_exit = 2130837510;
      public static final int fragment_fade_enter = 2130837511;
      public static final int fragment_fade_exit = 2130837512;
      public static final int fragment_open_enter = 2130837513;
      public static final int fragment_open_exit = 2130837514;
      public static final int m3_appbar_state_list_animator = 2130837515;
      public static final int m3_btn_elevated_btn_state_list_anim = 2130837516;
      public static final int m3_btn_state_list_anim = 2130837517;
      public static final int m3_card_elevated_state_list_anim = 2130837518;
      public static final int m3_card_state_list_anim = 2130837519;
      public static final int m3_chip_state_list_anim = 2130837520;
      public static final int m3_elevated_chip_state_list_anim = 2130837521;
      public static final int m3_extended_fab_change_size_collapse_motion_spec = 2130837522;
      public static final int m3_extended_fab_change_size_expand_motion_spec = 2130837523;
      public static final int m3_extended_fab_hide_motion_spec = 2130837524;
      public static final int m3_extended_fab_show_motion_spec = 2130837525;
      public static final int m3_extended_fab_state_list_animator = 2130837526;
      public static final int mtrl_btn_state_list_anim = 2130837527;
      public static final int mtrl_btn_unelevated_state_list_anim = 2130837528;
      public static final int mtrl_card_state_list_anim = 2130837529;
      public static final int mtrl_chip_state_list_anim = 2130837530;
      public static final int mtrl_extended_fab_change_size_collapse_motion_spec = 2130837531;
      public static final int mtrl_extended_fab_change_size_expand_motion_spec = 2130837532;
      public static final int mtrl_extended_fab_hide_motion_spec = 2130837533;
      public static final int mtrl_extended_fab_show_motion_spec = 2130837534;
      public static final int mtrl_extended_fab_state_list_animator = 2130837535;
      public static final int mtrl_fab_hide_motion_spec = 2130837536;
      public static final int mtrl_fab_show_motion_spec = 2130837537;
      public static final int mtrl_fab_transformation_sheet_collapse_spec = 2130837538;
      public static final int mtrl_fab_transformation_sheet_expand_spec = 2130837539;
      public static final int overlay_slide_down_fade_in = 2130837540;
      public static final int overlay_slide_down_fade_out = 2130837541;
      public static final int overlay_slide_up_fade_in = 2130837542;
      public static final int overlay_slide_up_fade_out = 2130837543;
      public static final int slide_in_bottom = 2130837544;
      public static final int slide_out_bottom = 2130837545;

      private animator() {
      }
   }

   public static final class array {
      public static final int exo_controls_playback_speeds = 2130903040;

      private array() {
      }
   }

   public static final class attr {
      public static final int accuracy = 2130968576;
      public static final int actionBarDivider = 2130968577;
      public static final int actionBarItemBackground = 2130968578;
      public static final int actionBarPopupTheme = 2130968579;
      public static final int actionBarSize = 2130968580;
      public static final int actionBarSplitStyle = 2130968581;
      public static final int actionBarStyle = 2130968582;
      public static final int actionBarTabBarStyle = 2130968583;
      public static final int actionBarTabStyle = 2130968584;
      public static final int actionBarTabTextStyle = 2130968585;
      public static final int actionBarTheme = 2130968586;
      public static final int actionBarWidgetTheme = 2130968587;
      public static final int actionButtonStyle = 2130968588;
      public static final int actionDropDownStyle = 2130968589;
      public static final int actionLayout = 2130968590;
      public static final int actionMenuTextAppearance = 2130968591;
      public static final int actionMenuTextColor = 2130968592;
      public static final int actionModeBackground = 2130968593;
      public static final int actionModeCloseButtonStyle = 2130968594;
      public static final int actionModeCloseContentDescription = 2130968595;
      public static final int actionModeCloseDrawable = 2130968596;
      public static final int actionModeCopyDrawable = 2130968597;
      public static final int actionModeCutDrawable = 2130968598;
      public static final int actionModeFindDrawable = 2130968599;
      public static final int actionModePasteDrawable = 2130968600;
      public static final int actionModePopupWindowStyle = 2130968601;
      public static final int actionModeSelectAllDrawable = 2130968602;
      public static final int actionModeShareDrawable = 2130968603;
      public static final int actionModeSplitBackground = 2130968604;
      public static final int actionModeStyle = 2130968605;
      public static final int actionModeTheme = 2130968606;
      public static final int actionModeWebSearchDrawable = 2130968607;
      public static final int actionOverflowButtonStyle = 2130968608;
      public static final int actionOverflowMenuStyle = 2130968609;
      public static final int actionProviderClass = 2130968610;
      public static final int actionTextColorAlpha = 2130968611;
      public static final int actionViewClass = 2130968612;
      public static final int activityChooserViewStyle = 2130968613;
      public static final int actualImageResource = 2130968614;
      public static final int actualImageScaleType = 2130968615;
      public static final int actualImageUri = 2130968616;
      public static final int ad_marker_color = 2130968617;
      public static final int ad_marker_width = 2130968618;
      public static final int addElevationShadow = 2130968619;
      public static final int alertDialogButtonGroupStyle = 2130968620;
      public static final int alertDialogCenterButtons = 2130968621;
      public static final int alertDialogStyle = 2130968622;
      public static final int alertDialogTheme = 2130968623;
      public static final int alignContent = 2130968624;
      public static final int alignItems = 2130968625;
      public static final int alignment = 2130968626;
      public static final int allowFlingInOverscroll = 2130968627;
      public static final int allowStacking = 2130968628;
      public static final int alpha = 2130968629;
      public static final int alphaColor = 2130968630;
      public static final int alphabeticModifiers = 2130968631;
      public static final int altSrc = 2130968632;
      public static final int animateMenuItems = 2130968633;
      public static final int animateNavigationIcon = 2130968634;
      public static final int animate_relativeTo = 2130968635;
      public static final int animationDuration = 2130968636;
      public static final int animationMode = 2130968637;
      public static final int animation_enabled = 2130968638;
      public static final int appBarLayoutStyle = 2130968639;
      public static final int applyMotionScene = 2130968640;
      public static final int arcMode = 2130968641;
      public static final int arrowHeadLength = 2130968642;
      public static final int arrowShaftLength = 2130968643;
      public static final int artwork_display_mode = 2130968644;
      public static final int attributeName = 2130968645;
      public static final int autoCompleteTextViewStyle = 2130968646;
      public static final int autoFocusButtonColor = 2130968647;
      public static final int autoFocusButtonOffIcon = 2130968648;
      public static final int autoFocusButtonOnIcon = 2130968649;
      public static final int autoFocusButtonPaddingHorizontal = 2130968650;
      public static final int autoFocusButtonPaddingVertical = 2130968651;
      public static final int autoFocusButtonPosition = 2130968652;
      public static final int autoFocusButtonVisible = 2130968653;
      public static final int autoPlayAfterResume = 2130968654;
      public static final int autoShowKeyboard = 2130968655;
      public static final int autoSizeMaxTextSize = 2130968656;
      public static final int autoSizeMinTextSize = 2130968657;
      public static final int autoSizePresetSizes = 2130968658;
      public static final int autoSizeStepGranularity = 2130968659;
      public static final int autoSizeTextType = 2130968660;
      public static final int autoTransition = 2130968661;
      public static final int auto_show = 2130968662;
      public static final int autofillInlineSuggestionChip = 2130968663;
      public static final int autofillInlineSuggestionEndIconStyle = 2130968664;
      public static final int autofillInlineSuggestionStartIconStyle = 2130968665;
      public static final int autofillInlineSuggestionSubtitle = 2130968666;
      public static final int autofillInlineSuggestionTitle = 2130968667;
      public static final int background = 2130968668;
      public static final int backgroundColor = 2130968669;
      public static final int backgroundImage = 2130968670;
      public static final int backgroundInsetBottom = 2130968671;
      public static final int backgroundInsetEnd = 2130968672;
      public static final int backgroundInsetStart = 2130968673;
      public static final int backgroundInsetTop = 2130968674;
      public static final int backgroundOverlayColorAlpha = 2130968675;
      public static final int backgroundSplit = 2130968676;
      public static final int backgroundStacked = 2130968677;
      public static final int backgroundTint = 2130968678;
      public static final int backgroundTintMode = 2130968679;
      public static final int badgeGravity = 2130968680;
      public static final int badgeHeight = 2130968681;
      public static final int badgeRadius = 2130968682;
      public static final int badgeShapeAppearance = 2130968683;
      public static final int badgeShapeAppearanceOverlay = 2130968684;
      public static final int badgeStyle = 2130968685;
      public static final int badgeTextAppearance = 2130968686;
      public static final int badgeTextColor = 2130968687;
      public static final int badgeWidePadding = 2130968688;
      public static final int badgeWidth = 2130968689;
      public static final int badgeWithTextHeight = 2130968690;
      public static final int badgeWithTextRadius = 2130968691;
      public static final int badgeWithTextShapeAppearance = 2130968692;
      public static final int badgeWithTextShapeAppearanceOverlay = 2130968693;
      public static final int badgeWithTextWidth = 2130968694;
      public static final int barLength = 2130968695;
      public static final int bar_gravity = 2130968696;
      public static final int bar_height = 2130968697;
      public static final int barrierAllowsGoneWidgets = 2130968698;
      public static final int barrierDirection = 2130968699;
      public static final int barrierMargin = 2130968700;
      public static final int behavior_autoHide = 2130968701;
      public static final int behavior_autoShrink = 2130968702;
      public static final int behavior_draggable = 2130968703;
      public static final int behavior_expandedOffset = 2130968704;
      public static final int behavior_fitToContents = 2130968705;
      public static final int behavior_halfExpandedRatio = 2130968706;
      public static final int behavior_hideable = 2130968707;
      public static final int behavior_overlapTop = 2130968708;
      public static final int behavior_peekHeight = 2130968709;
      public static final int behavior_saveFlags = 2130968710;
      public static final int behavior_significantVelocityThreshold = 2130968711;
      public static final int behavior_skipCollapsed = 2130968712;
      public static final int blurOverlayColor = 2130968713;
      public static final int borderWidth = 2130968714;
      public static final int borderlessButtonStyle = 2130968715;
      public static final int bottomAppBarStyle = 2130968716;
      public static final int bottomInsetScrimEnabled = 2130968717;
      public static final int bottomNavigationStyle = 2130968718;
      public static final int bottomSheetDialogTheme = 2130968719;
      public static final int bottomSheetDragHandleStyle = 2130968720;
      public static final int bottomSheetStyle = 2130968721;
      public static final int boxBackgroundColor = 2130968722;
      public static final int boxBackgroundMode = 2130968723;
      public static final int boxCollapsedPaddingTop = 2130968724;
      public static final int boxCornerRadiusBottomEnd = 2130968725;
      public static final int boxCornerRadiusBottomStart = 2130968726;
      public static final int boxCornerRadiusTopEnd = 2130968727;
      public static final int boxCornerRadiusTopStart = 2130968728;
      public static final int boxStrokeColor = 2130968729;
      public static final int boxStrokeErrorColor = 2130968730;
      public static final int boxStrokeWidth = 2130968731;
      public static final int boxStrokeWidthFocused = 2130968732;
      public static final int brightness = 2130968733;
      public static final int buffered_color = 2130968734;
      public static final int buttonBarButtonStyle = 2130968735;
      public static final int buttonBarNegativeButtonStyle = 2130968736;
      public static final int buttonBarNeutralButtonStyle = 2130968737;
      public static final int buttonBarPositiveButtonStyle = 2130968738;
      public static final int buttonBarStyle = 2130968739;
      public static final int buttonCompat = 2130968740;
      public static final int buttonGravity = 2130968741;
      public static final int buttonIcon = 2130968742;
      public static final int buttonIconDimen = 2130968743;
      public static final int buttonIconTint = 2130968744;
      public static final int buttonIconTintMode = 2130968745;
      public static final int buttonPanelSideLayout = 2130968746;
      public static final int buttonSize = 2130968747;
      public static final int buttonStyle = 2130968748;
      public static final int buttonStyleSmall = 2130968749;
      public static final int buttonTint = 2130968750;
      public static final int buttonTintMode = 2130968751;
      public static final int cardBackgroundColor = 2130968752;
      public static final int cardCornerRadius = 2130968753;
      public static final int cardElevation = 2130968754;
      public static final int cardForegroundColor = 2130968755;
      public static final int cardMaxElevation = 2130968756;
      public static final int cardPreventCornerOverlap = 2130968757;
      public static final int cardUseCompatPadding = 2130968758;
      public static final int cardViewStyle = 2130968759;
      public static final int centerIfNoTextEnabled = 2130968760;
      public static final int chainUseRtl = 2130968761;
      public static final int checkMarkCompat = 2130968762;
      public static final int checkMarkTint = 2130968763;
      public static final int checkMarkTintMode = 2130968764;
      public static final int checkboxStyle = 2130968765;
      public static final int checkedButton = 2130968766;
      public static final int checkedChip = 2130968767;
      public static final int checkedIcon = 2130968768;
      public static final int checkedIconEnabled = 2130968769;
      public static final int checkedIconGravity = 2130968770;
      public static final int checkedIconMargin = 2130968771;
      public static final int checkedIconSize = 2130968772;
      public static final int checkedIconTint = 2130968773;
      public static final int checkedIconVisible = 2130968774;
      public static final int checkedState = 2130968775;
      public static final int checkedTextViewStyle = 2130968776;
      public static final int chipBackgroundColor = 2130968777;
      public static final int chipCornerRadius = 2130968778;
      public static final int chipEndPadding = 2130968779;
      public static final int chipGroupStyle = 2130968780;
      public static final int chipIcon = 2130968781;
      public static final int chipIconEnabled = 2130968782;
      public static final int chipIconSize = 2130968783;
      public static final int chipIconTint = 2130968784;
      public static final int chipIconVisible = 2130968785;
      public static final int chipMinHeight = 2130968786;
      public static final int chipMinTouchTargetSize = 2130968787;
      public static final int chipSpacing = 2130968788;
      public static final int chipSpacingHorizontal = 2130968789;
      public static final int chipSpacingVertical = 2130968790;
      public static final int chipStandaloneStyle = 2130968791;
      public static final int chipStartPadding = 2130968792;
      public static final int chipStrokeColor = 2130968793;
      public static final int chipStrokeWidth = 2130968794;
      public static final int chipStyle = 2130968795;
      public static final int chipSurfaceColor = 2130968796;
      public static final int circleCrop = 2130968797;
      public static final int circleRadius = 2130968798;
      public static final int circularProgressIndicatorStyle = 2130968799;
      public static final int clickAction = 2130968800;
      public static final int clockFaceBackgroundColor = 2130968801;
      public static final int clockHandColor = 2130968802;
      public static final int clockIcon = 2130968803;
      public static final int clockNumberTextColor = 2130968804;
      public static final int closeIcon = 2130968805;
      public static final int closeIconEnabled = 2130968806;
      public static final int closeIconEndPadding = 2130968807;
      public static final int closeIconSize = 2130968808;
      public static final int closeIconStartPadding = 2130968809;
      public static final int closeIconTint = 2130968810;
      public static final int closeIconVisible = 2130968811;
      public static final int closeItemLayout = 2130968812;
      public static final int collapseContentDescription = 2130968813;
      public static final int collapseIcon = 2130968814;
      public static final int collapsedSize = 2130968815;
      public static final int collapsedTitleGravity = 2130968816;
      public static final int collapsedTitleTextAppearance = 2130968817;
      public static final int collapsedTitleTextColor = 2130968818;
      public static final int collapsingToolbarLayoutLargeSize = 2130968819;
      public static final int collapsingToolbarLayoutLargeStyle = 2130968820;
      public static final int collapsingToolbarLayoutMediumSize = 2130968821;
      public static final int collapsingToolbarLayoutMediumStyle = 2130968822;
      public static final int collapsingToolbarLayoutStyle = 2130968823;
      public static final int color = 2130968824;
      public static final int colorAccent = 2130968825;
      public static final int colorBackgroundFloating = 2130968826;
      public static final int colorButtonNormal = 2130968827;
      public static final int colorContainer = 2130968828;
      public static final int colorControlActivated = 2130968829;
      public static final int colorControlHighlight = 2130968830;
      public static final int colorControlNormal = 2130968831;
      public static final int colorError = 2130968832;
      public static final int colorErrorContainer = 2130968833;
      public static final int colorOnBackground = 2130968834;
      public static final int colorOnContainer = 2130968835;
      public static final int colorOnContainerUnchecked = 2130968836;
      public static final int colorOnError = 2130968837;
      public static final int colorOnErrorContainer = 2130968838;
      public static final int colorOnPrimary = 2130968839;
      public static final int colorOnPrimaryContainer = 2130968840;
      public static final int colorOnPrimaryFixed = 2130968841;
      public static final int colorOnPrimaryFixedVariant = 2130968842;
      public static final int colorOnPrimarySurface = 2130968843;
      public static final int colorOnSecondary = 2130968844;
      public static final int colorOnSecondaryContainer = 2130968845;
      public static final int colorOnSecondaryFixed = 2130968846;
      public static final int colorOnSecondaryFixedVariant = 2130968847;
      public static final int colorOnSurface = 2130968848;
      public static final int colorOnSurfaceInverse = 2130968849;
      public static final int colorOnSurfaceVariant = 2130968850;
      public static final int colorOnTertiary = 2130968851;
      public static final int colorOnTertiaryContainer = 2130968852;
      public static final int colorOnTertiaryFixed = 2130968853;
      public static final int colorOnTertiaryFixedVariant = 2130968854;
      public static final int colorOutline = 2130968855;
      public static final int colorOutlineVariant = 2130968856;
      public static final int colorPrimary = 2130968857;
      public static final int colorPrimaryContainer = 2130968858;
      public static final int colorPrimaryDark = 2130968859;
      public static final int colorPrimaryFixed = 2130968860;
      public static final int colorPrimaryFixedDim = 2130968861;
      public static final int colorPrimaryInverse = 2130968862;
      public static final int colorPrimarySurface = 2130968863;
      public static final int colorPrimaryVariant = 2130968864;
      public static final int colorScheme = 2130968865;
      public static final int colorSecondary = 2130968866;
      public static final int colorSecondaryContainer = 2130968867;
      public static final int colorSecondaryFixed = 2130968868;
      public static final int colorSecondaryFixedDim = 2130968869;
      public static final int colorSecondaryVariant = 2130968870;
      public static final int colorSurface = 2130968871;
      public static final int colorSurfaceBright = 2130968872;
      public static final int colorSurfaceContainer = 2130968873;
      public static final int colorSurfaceContainerHigh = 2130968874;
      public static final int colorSurfaceContainerHighest = 2130968875;
      public static final int colorSurfaceContainerLow = 2130968876;
      public static final int colorSurfaceContainerLowest = 2130968877;
      public static final int colorSurfaceDim = 2130968878;
      public static final int colorSurfaceInverse = 2130968879;
      public static final int colorSurfaceVariant = 2130968880;
      public static final int colorSwitchThumbNormal = 2130968881;
      public static final int colorTertiary = 2130968882;
      public static final int colorTertiaryContainer = 2130968883;
      public static final int colorTertiaryFixed = 2130968884;
      public static final int colorTertiaryFixedDim = 2130968885;
      public static final int commitIcon = 2130968886;
      public static final int compatShadowEnabled = 2130968887;
      public static final int constraintSet = 2130968888;
      public static final int constraintSetEnd = 2130968889;
      public static final int constraintSetStart = 2130968890;
      public static final int constraint_referenced_ids = 2130968891;
      public static final int constraints = 2130968892;
      public static final int content = 2130968893;
      public static final int contentDescription = 2130968894;
      public static final int contentInsetEnd = 2130968895;
      public static final int contentInsetEndWithActions = 2130968896;
      public static final int contentInsetLeft = 2130968897;
      public static final int contentInsetRight = 2130968898;
      public static final int contentInsetStart = 2130968899;
      public static final int contentInsetStartWithNavigation = 2130968900;
      public static final int contentPadding = 2130968901;
      public static final int contentPaddingBottom = 2130968902;
      public static final int contentPaddingEnd = 2130968903;
      public static final int contentPaddingLeft = 2130968904;
      public static final int contentPaddingRight = 2130968905;
      public static final int contentPaddingStart = 2130968906;
      public static final int contentPaddingTop = 2130968907;
      public static final int contentScrim = 2130968908;
      public static final int contrast = 2130968909;
      public static final int controlBackground = 2130968910;
      public static final int controller_layout_id = 2130968911;
      public static final int coordinatorLayoutStyle = 2130968912;
      public static final int coplanarSiblingViewId = 2130968913;
      public static final int cornerFamily = 2130968914;
      public static final int cornerFamilyBottomLeft = 2130968915;
      public static final int cornerFamilyBottomRight = 2130968916;
      public static final int cornerFamilyTopLeft = 2130968917;
      public static final int cornerFamilyTopRight = 2130968918;
      public static final int cornerRadius = 2130968919;
      public static final int cornerSize = 2130968920;
      public static final int cornerSizeBottomLeft = 2130968921;
      public static final int cornerSizeBottomRight = 2130968922;
      public static final int cornerSizeTopLeft = 2130968923;
      public static final int cornerSizeTopRight = 2130968924;
      public static final int counterEnabled = 2130968925;
      public static final int counterMaxLength = 2130968926;
      public static final int counterOverflowTextAppearance = 2130968927;
      public static final int counterOverflowTextColor = 2130968928;
      public static final int counterTextAppearance = 2130968929;
      public static final int counterTextColor = 2130968930;
      public static final int crossfade = 2130968931;
      public static final int currentState = 2130968932;
      public static final int curveFit = 2130968933;
      public static final int customBoolean = 2130968934;
      public static final int customColorDrawableValue = 2130968935;
      public static final int customColorValue = 2130968936;
      public static final int customDimension = 2130968937;
      public static final int customFloatValue = 2130968938;
      public static final int customIntegerValue = 2130968939;
      public static final int customNavigationLayout = 2130968940;
      public static final int customPixelDimension = 2130968941;
      public static final int customStringValue = 2130968942;
      public static final int dayInvalidStyle = 2130968943;
      public static final int daySelectedStyle = 2130968944;
      public static final int dayStyle = 2130968945;
      public static final int dayTodayStyle = 2130968946;
      public static final int defaultDuration = 2130968947;
      public static final int defaultMarginsEnabled = 2130968948;
      public static final int defaultQueryHint = 2130968949;
      public static final int defaultScrollFlagsEnabled = 2130968950;
      public static final int defaultState = 2130968951;
      public static final int default_artwork = 2130968952;
      public static final int deltaPolarAngle = 2130968953;
      public static final int deltaPolarRadius = 2130968954;
      public static final int deriveConstraintsFrom = 2130968955;
      public static final int dialogCornerRadius = 2130968956;
      public static final int dialogPreferredPadding = 2130968957;
      public static final int dialogTheme = 2130968958;
      public static final int displayOptions = 2130968959;
      public static final int divider = 2130968960;
      public static final int dividerColor = 2130968961;
      public static final int dividerDrawable = 2130968962;
      public static final int dividerDrawableHorizontal = 2130968963;
      public static final int dividerDrawableVertical = 2130968964;
      public static final int dividerHorizontal = 2130968965;
      public static final int dividerInsetEnd = 2130968966;
      public static final int dividerInsetStart = 2130968967;
      public static final int dividerPadding = 2130968968;
      public static final int dividerThickness = 2130968969;
      public static final int dividerVertical = 2130968970;
      public static final int dragDirection = 2130968971;
      public static final int dragScale = 2130968972;
      public static final int dragThreshold = 2130968973;
      public static final int drawPath = 2130968974;
      public static final int drawableBottomCompat = 2130968975;
      public static final int drawableEndCompat = 2130968976;
      public static final int drawableLeftCompat = 2130968977;
      public static final int drawableRightCompat = 2130968978;
      public static final int drawableSize = 2130968979;
      public static final int drawableStartCompat = 2130968980;
      public static final int drawableTint = 2130968981;
      public static final int drawableTintMode = 2130968982;
      public static final int drawableTopCompat = 2130968983;
      public static final int drawerArrowStyle = 2130968984;
      public static final int drawerLayoutCornerSize = 2130968985;
      public static final int drawerLayoutStyle = 2130968986;
      public static final int dropDownListViewStyle = 2130968987;
      public static final int dropdownListPreferredItemHeight = 2130968988;
      public static final int duration = 2130968989;
      public static final int dynamicColorThemeOverlay = 2130968990;
      public static final int editTextBackground = 2130968991;
      public static final int editTextColor = 2130968992;
      public static final int editTextStyle = 2130968993;
      public static final int elevation = 2130968994;
      public static final int elevationOverlayAccentColor = 2130968995;
      public static final int elevationOverlayColor = 2130968996;
      public static final int elevationOverlayEnabled = 2130968997;
      public static final int emojiCompatEnabled = 2130968998;
      public static final int emojiSize = 2130968999;
      public static final int enableEdgeToEdge = 2130969000;
      public static final int endIconCheckable = 2130969001;
      public static final int endIconContentDescription = 2130969002;
      public static final int endIconDrawable = 2130969003;
      public static final int endIconMinSize = 2130969004;
      public static final int endIconMode = 2130969005;
      public static final int endIconScaleType = 2130969006;
      public static final int endIconTint = 2130969007;
      public static final int endIconTintMode = 2130969008;
      public static final int enforceMaterialTheme = 2130969009;
      public static final int enforceTextAppearance = 2130969010;
      public static final int ensureMinTouchTargetSize = 2130969011;
      public static final int errorAccessibilityLabel = 2130969012;
      public static final int errorAccessibilityLiveRegion = 2130969013;
      public static final int errorContentDescription = 2130969014;
      public static final int errorEnabled = 2130969015;
      public static final int errorIconDrawable = 2130969016;
      public static final int errorIconTint = 2130969017;
      public static final int errorIconTintMode = 2130969018;
      public static final int errorShown = 2130969019;
      public static final int errorTextAppearance = 2130969020;
      public static final int errorTextColor = 2130969021;
      public static final int expandActivityOverflowButtonDrawable = 2130969022;
      public static final int expanded = 2130969023;
      public static final int expandedHintEnabled = 2130969024;
      public static final int expandedTitleGravity = 2130969025;
      public static final int expandedTitleMargin = 2130969026;
      public static final int expandedTitleMarginBottom = 2130969027;
      public static final int expandedTitleMarginEnd = 2130969028;
      public static final int expandedTitleMarginStart = 2130969029;
      public static final int expandedTitleMarginTop = 2130969030;
      public static final int expandedTitleTextAppearance = 2130969031;
      public static final int expandedTitleTextColor = 2130969032;
      public static final int extendMotionSpec = 2130969033;
      public static final int extendStrategy = 2130969034;
      public static final int extendedFloatingActionButtonPrimaryStyle = 2130969035;
      public static final int extendedFloatingActionButtonSecondaryStyle = 2130969036;
      public static final int extendedFloatingActionButtonStyle = 2130969037;
      public static final int extendedFloatingActionButtonSurfaceStyle = 2130969038;
      public static final int extendedFloatingActionButtonTertiaryStyle = 2130969039;
      public static final int extraMultilineHeightEnabled = 2130969040;
      public static final int fabAlignmentMode = 2130969041;
      public static final int fabAlignmentModeEndMargin = 2130969042;
      public static final int fabAnchorMode = 2130969043;
      public static final int fabAnimationMode = 2130969044;
      public static final int fabCradleMargin = 2130969045;
      public static final int fabCradleRoundedCornerRadius = 2130969046;
      public static final int fabCradleVerticalOffset = 2130969047;
      public static final int fabCustomSize = 2130969048;
      public static final int fabSize = 2130969049;
      public static final int fadeDuration = 2130969050;
      public static final int failureImage = 2130969051;
      public static final int failureImageScaleType = 2130969052;
      public static final int fastScrollEnabled = 2130969053;
      public static final int fastScrollHorizontalThumbDrawable = 2130969054;
      public static final int fastScrollHorizontalTrackDrawable = 2130969055;
      public static final int fastScrollVerticalThumbDrawable = 2130969056;
      public static final int fastScrollVerticalTrackDrawable = 2130969057;
      public static final int firstBaselineToTopHeight = 2130969058;
      public static final int flashButtonColor = 2130969059;
      public static final int flashButtonOffIcon = 2130969060;
      public static final int flashButtonOnIcon = 2130969061;
      public static final int flashButtonPaddingHorizontal = 2130969062;
      public static final int flashButtonPaddingVertical = 2130969063;
      public static final int flashButtonPosition = 2130969064;
      public static final int flashButtonVisible = 2130969065;
      public static final int flexDirection = 2130969066;
      public static final int flexWrap = 2130969067;
      public static final int flingEnabled = 2130969068;
      public static final int floatingActionButtonLargePrimaryStyle = 2130969069;
      public static final int floatingActionButtonLargeSecondaryStyle = 2130969070;
      public static final int floatingActionButtonLargeStyle = 2130969071;
      public static final int floatingActionButtonLargeSurfaceStyle = 2130969072;
      public static final int floatingActionButtonLargeTertiaryStyle = 2130969073;
      public static final int floatingActionButtonPrimaryStyle = 2130969074;
      public static final int floatingActionButtonSecondaryStyle = 2130969075;
      public static final int floatingActionButtonSmallPrimaryStyle = 2130969076;
      public static final int floatingActionButtonSmallSecondaryStyle = 2130969077;
      public static final int floatingActionButtonSmallStyle = 2130969078;
      public static final int floatingActionButtonSmallSurfaceStyle = 2130969079;
      public static final int floatingActionButtonSmallTertiaryStyle = 2130969080;
      public static final int floatingActionButtonStyle = 2130969081;
      public static final int floatingActionButtonSurfaceStyle = 2130969082;
      public static final int floatingActionButtonTertiaryStyle = 2130969083;
      public static final int flow_firstHorizontalBias = 2130969084;
      public static final int flow_firstHorizontalStyle = 2130969085;
      public static final int flow_firstVerticalBias = 2130969086;
      public static final int flow_firstVerticalStyle = 2130969087;
      public static final int flow_horizontalAlign = 2130969088;
      public static final int flow_horizontalBias = 2130969089;
      public static final int flow_horizontalGap = 2130969090;
      public static final int flow_horizontalStyle = 2130969091;
      public static final int flow_lastHorizontalBias = 2130969092;
      public static final int flow_lastHorizontalStyle = 2130969093;
      public static final int flow_lastVerticalBias = 2130969094;
      public static final int flow_lastVerticalStyle = 2130969095;
      public static final int flow_maxElementsWrap = 2130969096;
      public static final int flow_padding = 2130969097;
      public static final int flow_verticalAlign = 2130969098;
      public static final int flow_verticalBias = 2130969099;
      public static final int flow_verticalGap = 2130969100;
      public static final int flow_verticalStyle = 2130969101;
      public static final int flow_wrapMode = 2130969102;
      public static final int font = 2130969103;
      public static final int fontFamily = 2130969104;
      public static final int fontProviderAuthority = 2130969105;
      public static final int fontProviderCerts = 2130969106;
      public static final int fontProviderFetchStrategy = 2130969107;
      public static final int fontProviderFetchTimeout = 2130969108;
      public static final int fontProviderPackage = 2130969109;
      public static final int fontProviderQuery = 2130969110;
      public static final int fontProviderSystemFontFamily = 2130969111;
      public static final int fontStyle = 2130969112;
      public static final int fontVariationSettings = 2130969113;
      public static final int fontWeight = 2130969114;
      public static final int forceApplySystemWindowInsetTop = 2130969115;
      public static final int forceDefaultNavigationOnClickListener = 2130969116;
      public static final int foregroundInsidePadding = 2130969117;
      public static final int frameAspectRatioHeight = 2130969118;
      public static final int frameAspectRatioWidth = 2130969119;
      public static final int frameColor = 2130969120;
      public static final int frameCornersCapRounded = 2130969121;
      public static final int frameCornersRadius = 2130969122;
      public static final int frameCornersSize = 2130969123;
      public static final int framePosition = 2130969124;
      public static final int frameSize = 2130969125;
      public static final int frameThickness = 2130969126;
      public static final int frameVerticalBias = 2130969127;
      public static final int frameVisible = 2130969128;
      public static final int gapBetweenBars = 2130969129;
      public static final int gestureInsetBottomIgnored = 2130969130;
      public static final int goIcon = 2130969131;
      public static final int haloColor = 2130969132;
      public static final int haloRadius = 2130969133;
      public static final int hasClickableChildren = 2130969134;
      public static final int headerLayout = 2130969135;
      public static final int height = 2130969136;
      public static final int helperText = 2130969137;
      public static final int helperTextEnabled = 2130969138;
      public static final int helperTextTextAppearance = 2130969139;
      public static final int helperTextTextColor = 2130969140;
      public static final int hideAnimationBehavior = 2130969141;
      public static final int hideMotionSpec = 2130969142;
      public static final int hideNavigationIcon = 2130969143;
      public static final int hideOnContentScroll = 2130969144;
      public static final int hideOnScroll = 2130969145;
      public static final int hide_during_ads = 2130969146;
      public static final int hide_on_touch = 2130969147;
      public static final int hintAnimationEnabled = 2130969148;
      public static final int hintEnabled = 2130969149;
      public static final int hintTextAppearance = 2130969150;
      public static final int hintTextColor = 2130969151;
      public static final int homeAsUpIndicator = 2130969152;
      public static final int homeLayout = 2130969153;
      public static final int horizontalOffset = 2130969154;
      public static final int horizontalOffsetWithText = 2130969155;
      public static final int horizontalPanEnabled = 2130969156;
      public static final int hoveredFocusedTranslationZ = 2130969157;
      public static final int icon = 2130969158;
      public static final int iconEndPadding = 2130969159;
      public static final int iconGravity = 2130969160;
      public static final int iconPadding = 2130969161;
      public static final int iconSize = 2130969162;
      public static final int iconStartPadding = 2130969163;
      public static final int iconTint = 2130969164;
      public static final int iconTintMode = 2130969165;
      public static final int iconifiedByDefault = 2130969166;
      public static final int imageAspectRatio = 2130969167;
      public static final int imageAspectRatioAdjust = 2130969168;
      public static final int imageButtonStyle = 2130969169;
      public static final int indeterminateAnimationType = 2130969170;
      public static final int indeterminateProgressStyle = 2130969171;
      public static final int indicatorColor = 2130969172;
      public static final int indicatorDirectionCircular = 2130969173;
      public static final int indicatorDirectionLinear = 2130969174;
      public static final int indicatorInset = 2130969175;
      public static final int indicatorSize = 2130969176;
      public static final int initialActivityCount = 2130969177;
      public static final int insetForeground = 2130969178;
      public static final int isAutofillInlineSuggestionTheme = 2130969179;
      public static final int isLightTheme = 2130969180;
      public static final int isMaterial3DynamicColorApplied = 2130969181;
      public static final int isMaterial3Theme = 2130969182;
      public static final int isMaterialTheme = 2130969183;
      public static final int itemActiveIndicatorStyle = 2130969184;
      public static final int itemBackground = 2130969185;
      public static final int itemFillColor = 2130969186;
      public static final int itemHorizontalPadding = 2130969187;
      public static final int itemHorizontalTranslationEnabled = 2130969188;
      public static final int itemIconPadding = 2130969189;
      public static final int itemIconSize = 2130969190;
      public static final int itemIconTint = 2130969191;
      public static final int itemMaxLines = 2130969192;
      public static final int itemMinHeight = 2130969193;
      public static final int itemPadding = 2130969194;
      public static final int itemPaddingBottom = 2130969195;
      public static final int itemPaddingTop = 2130969196;
      public static final int itemRippleColor = 2130969197;
      public static final int itemShapeAppearance = 2130969198;
      public static final int itemShapeAppearanceOverlay = 2130969199;
      public static final int itemShapeFillColor = 2130969200;
      public static final int itemShapeInsetBottom = 2130969201;
      public static final int itemShapeInsetEnd = 2130969202;
      public static final int itemShapeInsetStart = 2130969203;
      public static final int itemShapeInsetTop = 2130969204;
      public static final int itemSpacing = 2130969205;
      public static final int itemStrokeColor = 2130969206;
      public static final int itemStrokeWidth = 2130969207;
      public static final int itemTextAppearance = 2130969208;
      public static final int itemTextAppearanceActive = 2130969209;
      public static final int itemTextAppearanceInactive = 2130969210;
      public static final int itemTextColor = 2130969211;
      public static final int itemVerticalPadding = 2130969212;
      public static final int justifyContent = 2130969213;
      public static final int keep_content_on_player_reset = 2130969214;
      public static final int keyPositionType = 2130969215;
      public static final int keyboardIcon = 2130969216;
      public static final int keylines = 2130969217;
      public static final int lStar = 2130969218;
      public static final int labelBehavior = 2130969219;
      public static final int labelStyle = 2130969220;
      public static final int labelVisibilityMode = 2130969221;
      public static final int lastBaselineToBottomHeight = 2130969222;
      public static final int lastItemDecorated = 2130969223;
      public static final int layout = 2130969224;
      public static final int layoutDescription = 2130969225;
      public static final int layoutDuringTransition = 2130969226;
      public static final int layoutManager = 2130969227;
      public static final int layout_alignSelf = 2130969228;
      public static final int layout_anchor = 2130969229;
      public static final int layout_anchorGravity = 2130969230;
      public static final int layout_behavior = 2130969231;
      public static final int layout_collapseMode = 2130969232;
      public static final int layout_collapseParallaxMultiplier = 2130969233;
      public static final int layout_constrainedHeight = 2130969234;
      public static final int layout_constrainedWidth = 2130969235;
      public static final int layout_constraintBaseline_creator = 2130969236;
      public static final int layout_constraintBaseline_toBaselineOf = 2130969237;
      public static final int layout_constraintBottom_creator = 2130969238;
      public static final int layout_constraintBottom_toBottomOf = 2130969239;
      public static final int layout_constraintBottom_toTopOf = 2130969240;
      public static final int layout_constraintCircle = 2130969241;
      public static final int layout_constraintCircleAngle = 2130969242;
      public static final int layout_constraintCircleRadius = 2130969243;
      public static final int layout_constraintDimensionRatio = 2130969244;
      public static final int layout_constraintEnd_toEndOf = 2130969245;
      public static final int layout_constraintEnd_toStartOf = 2130969246;
      public static final int layout_constraintGuide_begin = 2130969247;
      public static final int layout_constraintGuide_end = 2130969248;
      public static final int layout_constraintGuide_percent = 2130969249;
      public static final int layout_constraintHeight_default = 2130969250;
      public static final int layout_constraintHeight_max = 2130969251;
      public static final int layout_constraintHeight_min = 2130969252;
      public static final int layout_constraintHeight_percent = 2130969253;
      public static final int layout_constraintHorizontal_bias = 2130969254;
      public static final int layout_constraintHorizontal_chainStyle = 2130969255;
      public static final int layout_constraintHorizontal_weight = 2130969256;
      public static final int layout_constraintLeft_creator = 2130969257;
      public static final int layout_constraintLeft_toLeftOf = 2130969258;
      public static final int layout_constraintLeft_toRightOf = 2130969259;
      public static final int layout_constraintRight_creator = 2130969260;
      public static final int layout_constraintRight_toLeftOf = 2130969261;
      public static final int layout_constraintRight_toRightOf = 2130969262;
      public static final int layout_constraintStart_toEndOf = 2130969263;
      public static final int layout_constraintStart_toStartOf = 2130969264;
      public static final int layout_constraintTag = 2130969265;
      public static final int layout_constraintTop_creator = 2130969266;
      public static final int layout_constraintTop_toBottomOf = 2130969267;
      public static final int layout_constraintTop_toTopOf = 2130969268;
      public static final int layout_constraintVertical_bias = 2130969269;
      public static final int layout_constraintVertical_chainStyle = 2130969270;
      public static final int layout_constraintVertical_weight = 2130969271;
      public static final int layout_constraintWidth_default = 2130969272;
      public static final int layout_constraintWidth_max = 2130969273;
      public static final int layout_constraintWidth_min = 2130969274;
      public static final int layout_constraintWidth_percent = 2130969275;
      public static final int layout_dodgeInsetEdges = 2130969276;
      public static final int layout_editor_absoluteX = 2130969277;
      public static final int layout_editor_absoluteY = 2130969278;
      public static final int layout_flexBasisPercent = 2130969279;
      public static final int layout_flexGrow = 2130969280;
      public static final int layout_flexShrink = 2130969281;
      public static final int layout_goneMarginBottom = 2130969282;
      public static final int layout_goneMarginEnd = 2130969283;
      public static final int layout_goneMarginLeft = 2130969284;
      public static final int layout_goneMarginRight = 2130969285;
      public static final int layout_goneMarginStart = 2130969286;
      public static final int layout_goneMarginTop = 2130969287;
      public static final int layout_insetEdge = 2130969288;
      public static final int layout_keyline = 2130969289;
      public static final int layout_maxHeight = 2130969290;
      public static final int layout_maxWidth = 2130969291;
      public static final int layout_minHeight = 2130969292;
      public static final int layout_minWidth = 2130969293;
      public static final int layout_optimizationLevel = 2130969294;
      public static final int layout_order = 2130969295;
      public static final int layout_scrollEffect = 2130969296;
      public static final int layout_scrollFlags = 2130969297;
      public static final int layout_scrollInterpolator = 2130969298;
      public static final int layout_wrapBefore = 2130969299;
      public static final int liftOnScroll = 2130969300;
      public static final int liftOnScrollColor = 2130969301;
      public static final int liftOnScrollTargetViewId = 2130969302;
      public static final int limitBoundsTo = 2130969303;
      public static final int lineHeight = 2130969304;
      public static final int lineSpacing = 2130969305;
      public static final int linearProgressIndicatorStyle = 2130969306;
      public static final int listChoiceBackgroundIndicator = 2130969307;
      public static final int listChoiceIndicatorMultipleAnimated = 2130969308;
      public static final int listChoiceIndicatorSingleAnimated = 2130969309;
      public static final int listDividerAlertDialog = 2130969310;
      public static final int listItemLayout = 2130969311;
      public static final int listLayout = 2130969312;
      public static final int listMenuViewStyle = 2130969313;
      public static final int listPopupWindowStyle = 2130969314;
      public static final int listPreferredItemHeight = 2130969315;
      public static final int listPreferredItemHeightLarge = 2130969316;
      public static final int listPreferredItemHeightSmall = 2130969317;
      public static final int listPreferredItemPaddingEnd = 2130969318;
      public static final int listPreferredItemPaddingLeft = 2130969319;
      public static final int listPreferredItemPaddingRight = 2130969320;
      public static final int listPreferredItemPaddingStart = 2130969321;
      public static final int logo = 2130969322;
      public static final int logoAdjustViewBounds = 2130969323;
      public static final int logoDescription = 2130969324;
      public static final int logoScaleType = 2130969325;
      public static final int loopEndMs = 2130969326;
      public static final int loopSeekingMethod = 2130969327;
      public static final int loopStartMs = 2130969328;
      public static final int lottieAnimationViewStyle = 2130969329;
      public static final int lottie_asyncUpdates = 2130969330;
      public static final int lottie_autoPlay = 2130969331;
      public static final int lottie_cacheComposition = 2130969332;
      public static final int lottie_clipTextToBoundingBox = 2130969333;
      public static final int lottie_clipToCompositionBounds = 2130969334;
      public static final int lottie_colorFilter = 2130969335;
      public static final int lottie_defaultFontFileExtension = 2130969336;
      public static final int lottie_enableMergePathsForKitKatAndAbove = 2130969337;
      public static final int lottie_fallbackRes = 2130969338;
      public static final int lottie_fileName = 2130969339;
      public static final int lottie_ignoreDisabledSystemAnimations = 2130969340;
      public static final int lottie_imageAssetsFolder = 2130969341;
      public static final int lottie_loop = 2130969342;
      public static final int lottie_progress = 2130969343;
      public static final int lottie_rawRes = 2130969344;
      public static final int lottie_renderMode = 2130969345;
      public static final int lottie_repeatCount = 2130969346;
      public static final int lottie_repeatMode = 2130969347;
      public static final int lottie_speed = 2130969348;
      public static final int lottie_url = 2130969349;
      public static final int lottie_useCompositionFrameRate = 2130969350;
      public static final int marginHorizontal = 2130969351;
      public static final int marginLeftSystemWindowInsets = 2130969352;
      public static final int marginRightSystemWindowInsets = 2130969353;
      public static final int marginTopSystemWindowInsets = 2130969354;
      public static final int maskColor = 2130969355;
      public static final int maskVisible = 2130969356;
      public static final int materialAlertDialogBodyTextStyle = 2130969357;
      public static final int materialAlertDialogButtonSpacerVisibility = 2130969358;
      public static final int materialAlertDialogTheme = 2130969359;
      public static final int materialAlertDialogTitleIconStyle = 2130969360;
      public static final int materialAlertDialogTitlePanelStyle = 2130969361;
      public static final int materialAlertDialogTitleTextStyle = 2130969362;
      public static final int materialButtonOutlinedStyle = 2130969363;
      public static final int materialButtonStyle = 2130969364;
      public static final int materialButtonToggleGroupStyle = 2130969365;
      public static final int materialCalendarDay = 2130969366;
      public static final int materialCalendarDayOfWeekLabel = 2130969367;
      public static final int materialCalendarFullscreenTheme = 2130969368;
      public static final int materialCalendarHeaderCancelButton = 2130969369;
      public static final int materialCalendarHeaderConfirmButton = 2130969370;
      public static final int materialCalendarHeaderDivider = 2130969371;
      public static final int materialCalendarHeaderLayout = 2130969372;
      public static final int materialCalendarHeaderSelection = 2130969373;
      public static final int materialCalendarHeaderTitle = 2130969374;
      public static final int materialCalendarHeaderToggleButton = 2130969375;
      public static final int materialCalendarMonth = 2130969376;
      public static final int materialCalendarMonthNavigationButton = 2130969377;
      public static final int materialCalendarStyle = 2130969378;
      public static final int materialCalendarTheme = 2130969379;
      public static final int materialCalendarYearNavigationButton = 2130969380;
      public static final int materialCardViewElevatedStyle = 2130969381;
      public static final int materialCardViewFilledStyle = 2130969382;
      public static final int materialCardViewOutlinedStyle = 2130969383;
      public static final int materialCardViewStyle = 2130969384;
      public static final int materialCircleRadius = 2130969385;
      public static final int materialClockStyle = 2130969386;
      public static final int materialDisplayDividerStyle = 2130969387;
      public static final int materialDividerHeavyStyle = 2130969388;
      public static final int materialDividerStyle = 2130969389;
      public static final int materialIconButtonFilledStyle = 2130969390;
      public static final int materialIconButtonFilledTonalStyle = 2130969391;
      public static final int materialIconButtonOutlinedStyle = 2130969392;
      public static final int materialIconButtonStyle = 2130969393;
      public static final int materialSearchBarStyle = 2130969394;
      public static final int materialSearchViewPrefixStyle = 2130969395;
      public static final int materialSearchViewStyle = 2130969396;
      public static final int materialSwitchStyle = 2130969397;
      public static final int materialThemeOverlay = 2130969398;
      public static final int materialTimePickerStyle = 2130969399;
      public static final int materialTimePickerTheme = 2130969400;
      public static final int materialTimePickerTitleStyle = 2130969401;
      public static final int maxAcceleration = 2130969402;
      public static final int maxActionInlineWidth = 2130969403;
      public static final int maxButtonHeight = 2130969404;
      public static final int maxCharacterCount = 2130969405;
      public static final int maxHeight = 2130969406;
      public static final int maxImageSize = 2130969407;
      public static final int maxLine = 2130969408;
      public static final int maxLines = 2130969409;
      public static final int maxVelocity = 2130969410;
      public static final int maxWidth = 2130969411;
      public static final int maxZoom = 2130969412;
      public static final int maxZoomType = 2130969413;
      public static final int measureWithLargestChild = 2130969414;
      public static final int menu = 2130969415;
      public static final int menuAlignmentMode = 2130969416;
      public static final int menuGravity = 2130969417;
      public static final int minHeight = 2130969418;
      public static final int minHideDelay = 2130969419;
      public static final int minSeparation = 2130969420;
      public static final int minTouchTargetSize = 2130969421;
      public static final int minWidth = 2130969422;
      public static final int minZoom = 2130969423;
      public static final int minZoomType = 2130969424;
      public static final int mock_diagonalsColor = 2130969425;
      public static final int mock_label = 2130969426;
      public static final int mock_labelBackgroundColor = 2130969427;
      public static final int mock_labelColor = 2130969428;
      public static final int mock_showDiagonals = 2130969429;
      public static final int mock_showLabel = 2130969430;
      public static final int motionDebug = 2130969431;
      public static final int motionDurationExtraLong1 = 2130969432;
      public static final int motionDurationExtraLong2 = 2130969433;
      public static final int motionDurationExtraLong3 = 2130969434;
      public static final int motionDurationExtraLong4 = 2130969435;
      public static final int motionDurationLong1 = 2130969436;
      public static final int motionDurationLong2 = 2130969437;
      public static final int motionDurationLong3 = 2130969438;
      public static final int motionDurationLong4 = 2130969439;
      public static final int motionDurationMedium1 = 2130969440;
      public static final int motionDurationMedium2 = 2130969441;
      public static final int motionDurationMedium3 = 2130969442;
      public static final int motionDurationMedium4 = 2130969443;
      public static final int motionDurationShort1 = 2130969444;
      public static final int motionDurationShort2 = 2130969445;
      public static final int motionDurationShort3 = 2130969446;
      public static final int motionDurationShort4 = 2130969447;
      public static final int motionEasingAccelerated = 2130969448;
      public static final int motionEasingDecelerated = 2130969449;
      public static final int motionEasingEmphasized = 2130969450;
      public static final int motionEasingEmphasizedAccelerateInterpolator = 2130969451;
      public static final int motionEasingEmphasizedDecelerateInterpolator = 2130969452;
      public static final int motionEasingEmphasizedInterpolator = 2130969453;
      public static final int motionEasingLinear = 2130969454;
      public static final int motionEasingLinearInterpolator = 2130969455;
      public static final int motionEasingStandard = 2130969456;
      public static final int motionEasingStandardAccelerateInterpolator = 2130969457;
      public static final int motionEasingStandardDecelerateInterpolator = 2130969458;
      public static final int motionEasingStandardInterpolator = 2130969459;
      public static final int motionInterpolator = 2130969460;
      public static final int motionPath = 2130969461;
      public static final int motionPathRotate = 2130969462;
      public static final int motionProgress = 2130969463;
      public static final int motionStagger = 2130969464;
      public static final int motionTarget = 2130969465;
      public static final int motion_postLayoutCollision = 2130969466;
      public static final int motion_triggerOnCollision = 2130969467;
      public static final int moveWhenScrollAtTop = 2130969468;
      public static final int multiChoiceItemLayout = 2130969469;
      public static final int navigationContentDescription = 2130969470;
      public static final int navigationIcon = 2130969471;
      public static final int navigationIconTint = 2130969472;
      public static final int navigationMode = 2130969473;
      public static final int navigationRailStyle = 2130969474;
      public static final int navigationViewStyle = 2130969475;
      public static final int nestedScrollFlags = 2130969476;
      public static final int nestedScrollViewStyle = 2130969477;
      public static final int nestedScrollable = 2130969478;
      public static final int npv_AlternativeHint = 2130969479;
      public static final int npv_AlternativeTextArrayWithMeasureHint = 2130969480;
      public static final int npv_AlternativeTextArrayWithoutMeasureHint = 2130969481;
      public static final int npv_DividerColor = 2130969482;
      public static final int npv_DividerHeight = 2130969483;
      public static final int npv_DividerMarginLeft = 2130969484;
      public static final int npv_DividerMarginRight = 2130969485;
      public static final int npv_EmptyItemHint = 2130969486;
      public static final int npv_HintText = 2130969487;
      public static final int npv_ItemPaddingHorizontal = 2130969488;
      public static final int npv_ItemPaddingVertical = 2130969489;
      public static final int npv_MarginEndOfHint = 2130969490;
      public static final int npv_MarginStartOfHint = 2130969491;
      public static final int npv_MaxValue = 2130969492;
      public static final int npv_MinValue = 2130969493;
      public static final int npv_RespondChangeInMainThread = 2130969494;
      public static final int npv_RespondChangeOnDetached = 2130969495;
      public static final int npv_ShowDivider = 2130969496;
      public static final int npv_ShownCount = 2130969497;
      public static final int npv_TextArray = 2130969498;
      public static final int npv_TextColorHint = 2130969499;
      public static final int npv_TextColorNormal = 2130969500;
      public static final int npv_TextColorSelected = 2130969501;
      public static final int npv_TextEllipsize = 2130969502;
      public static final int npv_TextSizeHint = 2130969503;
      public static final int npv_TextSizeNormal = 2130969504;
      public static final int npv_TextSizeSelected = 2130969505;
      public static final int npv_WrapSelectorWheel = 2130969506;
      public static final int number = 2130969507;
      public static final int numericModifiers = 2130969508;
      public static final int oc_circleBgColor = 2130969509;
      public static final int oc_maxItems = 2130969510;
      public static final int oc_overflowBgColor = 2130969511;
      public static final int oc_overflowTextColor = 2130969512;
      public static final int oc_overflowTextSize = 2130969513;
      public static final int oc_overlap = 2130969514;
      public static final int oc_placeholderColor = 2130969515;
      public static final int oc_separation = 2130969516;
      public static final int offsetAlignmentMode = 2130969517;
      public static final int onCross = 2130969518;
      public static final int onHide = 2130969519;
      public static final int onNegativeCross = 2130969520;
      public static final int onPositiveCross = 2130969521;
      public static final int onShow = 2130969522;
      public static final int onTouchUp = 2130969523;
      public static final int oneFingerScrollEnabled = 2130969524;
      public static final int overPinchable = 2130969525;
      public static final int overScrollHorizontal = 2130969526;
      public static final int overScrollVertical = 2130969527;
      public static final int overlapAnchor = 2130969528;
      public static final int overlay = 2130969529;
      public static final int overlayImage = 2130969530;
      public static final int packed = 2130969531;
      public static final int paddingBottomNoButtons = 2130969532;
      public static final int paddingBottomSystemWindowInsets = 2130969533;
      public static final int paddingEnd = 2130969534;
      public static final int paddingLeftSystemWindowInsets = 2130969535;
      public static final int paddingRightSystemWindowInsets = 2130969536;
      public static final int paddingStart = 2130969537;
      public static final int paddingTopNoTitle = 2130969538;
      public static final int paddingTopSystemWindowInsets = 2130969539;
      public static final int panelBackground = 2130969540;
      public static final int panelMenuListTheme = 2130969541;
      public static final int panelMenuListWidth = 2130969542;
      public static final int passwordToggleContentDescription = 2130969543;
      public static final int passwordToggleDrawable = 2130969544;
      public static final int passwordToggleEnabled = 2130969545;
      public static final int passwordToggleTint = 2130969546;
      public static final int passwordToggleTintMode = 2130969547;
      public static final int pathMotionArc = 2130969548;
      public static final int path_percent = 2130969549;
      public static final int percentHeight = 2130969550;
      public static final int percentWidth = 2130969551;
      public static final int percentX = 2130969552;
      public static final int percentY = 2130969553;
      public static final int perpendicularPath_percent = 2130969554;
      public static final int pivotAnchor = 2130969555;
      public static final int placeholderImage = 2130969556;
      public static final int placeholderImageScaleType = 2130969557;
      public static final int placeholderText = 2130969558;
      public static final int placeholderTextAppearance = 2130969559;
      public static final int placeholderTextColor = 2130969560;
      public static final int placeholder_emptyVisibility = 2130969561;
      public static final int played_ad_marker_color = 2130969562;
      public static final int played_color = 2130969563;
      public static final int player_layout_id = 2130969564;
      public static final int popupMenuBackground = 2130969565;
      public static final int popupMenuStyle = 2130969566;
      public static final int popupTheme = 2130969567;
      public static final int popupWindowStyle = 2130969568;
      public static final int prefixText = 2130969569;
      public static final int prefixTextAppearance = 2130969570;
      public static final int prefixTextColor = 2130969571;
      public static final int preserveIconSpacing = 2130969572;
      public static final int pressedStateOverlayImage = 2130969573;
      public static final int pressedTranslationZ = 2130969574;
      public static final int progressBarAutoRotateInterval = 2130969575;
      public static final int progressBarImage = 2130969576;
      public static final int progressBarImageScaleType = 2130969577;
      public static final int progressBarPadding = 2130969578;
      public static final int progressBarStyle = 2130969579;
      public static final int queryBackground = 2130969580;
      public static final int queryHint = 2130969581;
      public static final int queryPatterns = 2130969582;
      public static final int radioButtonStyle = 2130969583;
      public static final int rangeFillColor = 2130969584;
      public static final int ratingBarStyle = 2130969585;
      public static final int ratingBarStyleIndicator = 2130969586;
      public static final int ratingBarStyleSmall = 2130969587;
      public static final int recyclerViewStyle = 2130969588;
      public static final int region_heightLessThan = 2130969589;
      public static final int region_heightMoreThan = 2130969590;
      public static final int region_widthLessThan = 2130969591;
      public static final int region_widthMoreThan = 2130969592;
      public static final int removeEmbeddedFabElevation = 2130969593;
      public static final int repeat_toggle_modes = 2130969594;
      public static final int resize_mode = 2130969595;
      public static final int retryImage = 2130969596;
      public static final int retryImageScaleType = 2130969597;
      public static final int reverseLayout = 2130969598;
      public static final int rippleColor = 2130969599;
      public static final int round = 2130969600;
      public static final int roundAsCircle = 2130969601;
      public static final int roundBottomEnd = 2130969602;
      public static final int roundBottomLeft = 2130969603;
      public static final int roundBottomRight = 2130969604;
      public static final int roundBottomStart = 2130969605;
      public static final int roundPercent = 2130969606;
      public static final int roundTopEnd = 2130969607;
      public static final int roundTopLeft = 2130969608;
      public static final int roundTopRight = 2130969609;
      public static final int roundTopStart = 2130969610;
      public static final int roundWithOverlayColor = 2130969611;
      public static final int roundedCornerRadius = 2130969612;
      public static final int roundingBorderColor = 2130969613;
      public static final int roundingBorderPadding = 2130969614;
      public static final int roundingBorderWidth = 2130969615;
      public static final int saturation = 2130969616;
      public static final int scopeUris = 2130969617;
      public static final int scrimAnimationDuration = 2130969618;
      public static final int scrimBackground = 2130969619;
      public static final int scrimVisibleHeightTrigger = 2130969620;
      public static final int scrollEnabled = 2130969621;
      public static final int scrubber_color = 2130969622;
      public static final int scrubber_disabled_size = 2130969623;
      public static final int scrubber_dragged_size = 2130969624;
      public static final int scrubber_drawable = 2130969625;
      public static final int scrubber_enabled_size = 2130969626;
      public static final int searchHintIcon = 2130969627;
      public static final int searchIcon = 2130969628;
      public static final int searchPrefixText = 2130969629;
      public static final int searchViewStyle = 2130969630;
      public static final int seekBarStyle = 2130969631;
      public static final int selectableItemBackground = 2130969632;
      public static final int selectableItemBackgroundBorderless = 2130969633;
      public static final int selectionRequired = 2130969634;
      public static final int selectorSize = 2130969635;
      public static final int shader = 2130969636;
      public static final int shapeAppearance = 2130969637;
      public static final int shapeAppearanceCornerExtraLarge = 2130969638;
      public static final int shapeAppearanceCornerExtraSmall = 2130969639;
      public static final int shapeAppearanceCornerLarge = 2130969640;
      public static final int shapeAppearanceCornerMedium = 2130969641;
      public static final int shapeAppearanceCornerSmall = 2130969642;
      public static final int shapeAppearanceLargeComponent = 2130969643;
      public static final int shapeAppearanceMediumComponent = 2130969644;
      public static final int shapeAppearanceOverlay = 2130969645;
      public static final int shapeAppearanceSmallComponent = 2130969646;
      public static final int shapeCornerFamily = 2130969647;
      public static final int shortcutMatchRequired = 2130969648;
      public static final int shouldRemoveExpandedCorners = 2130969649;
      public static final int showAnimationBehavior = 2130969650;
      public static final int showAsAction = 2130969651;
      public static final int showDelay = 2130969652;
      public static final int showDivider = 2130969653;
      public static final int showDividerHorizontal = 2130969654;
      public static final int showDividerVertical = 2130969655;
      public static final int showDividers = 2130969656;
      public static final int showMotionSpec = 2130969657;
      public static final int showPaths = 2130969658;
      public static final int showText = 2130969659;
      public static final int showTitle = 2130969660;
      public static final int show_buffering = 2130969661;
      public static final int show_fastforward_button = 2130969662;
      public static final int show_next_button = 2130969663;
      public static final int show_previous_button = 2130969664;
      public static final int show_rewind_button = 2130969665;
      public static final int show_shuffle_button = 2130969666;
      public static final int show_subtitle_button = 2130969667;
      public static final int show_timeout = 2130969668;
      public static final int show_vr_button = 2130969669;
      public static final int shrinkMotionSpec = 2130969670;
      public static final int shutter_background_color = 2130969671;
      public static final int sideSheetDialogTheme = 2130969672;
      public static final int sideSheetModalStyle = 2130969673;
      public static final int simpleItemLayout = 2130969674;
      public static final int simpleItemSelectedColor = 2130969675;
      public static final int simpleItemSelectedRippleColor = 2130969676;
      public static final int simpleItems = 2130969677;
      public static final int singleChoiceItemLayout = 2130969678;
      public static final int singleLine = 2130969679;
      public static final int singleSelection = 2130969680;
      public static final int sizePercent = 2130969681;
      public static final int sliderStyle = 2130969682;
      public static final int snackbarButtonStyle = 2130969683;
      public static final int snackbarStyle = 2130969684;
      public static final int snackbarTextViewStyle = 2130969685;
      public static final int spanCount = 2130969686;
      public static final int spinBars = 2130969687;
      public static final int spinnerDropDownItemStyle = 2130969688;
      public static final int spinnerStyle = 2130969689;
      public static final int splitTrack = 2130969690;
      public static final int srcCompat = 2130969691;
      public static final int stackFromEnd = 2130969692;
      public static final int staggered = 2130969693;
      public static final int startIconCheckable = 2130969694;
      public static final int startIconContentDescription = 2130969695;
      public static final int startIconDrawable = 2130969696;
      public static final int startIconMinSize = 2130969697;
      public static final int startIconScaleType = 2130969698;
      public static final int startIconTint = 2130969699;
      public static final int startIconTintMode = 2130969700;
      public static final int state_above_anchor = 2130969701;
      public static final int state_collapsed = 2130969702;
      public static final int state_collapsible = 2130969703;
      public static final int state_dragged = 2130969704;
      public static final int state_error = 2130969705;
      public static final int state_indeterminate = 2130969706;
      public static final int state_liftable = 2130969707;
      public static final int state_lifted = 2130969708;
      public static final int state_with_icon = 2130969709;
      public static final int statusBarBackground = 2130969710;
      public static final int statusBarForeground = 2130969711;
      public static final int statusBarScrim = 2130969712;
      public static final int strokeColor = 2130969713;
      public static final int strokeWidth = 2130969714;
      public static final int subMenuArrow = 2130969715;
      public static final int subheaderColor = 2130969716;
      public static final int subheaderInsetEnd = 2130969717;
      public static final int subheaderInsetStart = 2130969718;
      public static final int subheaderTextAppearance = 2130969719;
      public static final int submitBackground = 2130969720;
      public static final int subtitle = 2130969721;
      public static final int subtitleCentered = 2130969722;
      public static final int subtitleTextAppearance = 2130969723;
      public static final int subtitleTextColor = 2130969724;
      public static final int subtitleTextStyle = 2130969725;
      public static final int suffixText = 2130969726;
      public static final int suffixTextAppearance = 2130969727;
      public static final int suffixTextColor = 2130969728;
      public static final int suggestionRowLayout = 2130969729;
      public static final int surface_type = 2130969730;
      public static final int swipeRefreshLayoutProgressSpinnerBackgroundColor = 2130969731;
      public static final int switchMinWidth = 2130969732;
      public static final int switchPadding = 2130969733;
      public static final int switchStyle = 2130969734;
      public static final int switchTextAppearance = 2130969735;
      public static final int tabBackground = 2130969736;
      public static final int tabContentStart = 2130969737;
      public static final int tabGravity = 2130969738;
      public static final int tabIconTint = 2130969739;
      public static final int tabIconTintMode = 2130969740;
      public static final int tabIndicator = 2130969741;
      public static final int tabIndicatorAnimationDuration = 2130969742;
      public static final int tabIndicatorAnimationMode = 2130969743;
      public static final int tabIndicatorColor = 2130969744;
      public static final int tabIndicatorFullWidth = 2130969745;
      public static final int tabIndicatorGravity = 2130969746;
      public static final int tabIndicatorHeight = 2130969747;
      public static final int tabInlineLabel = 2130969748;
      public static final int tabMaxWidth = 2130969749;
      public static final int tabMinWidth = 2130969750;
      public static final int tabMode = 2130969751;
      public static final int tabPadding = 2130969752;
      public static final int tabPaddingBottom = 2130969753;
      public static final int tabPaddingEnd = 2130969754;
      public static final int tabPaddingStart = 2130969755;
      public static final int tabPaddingTop = 2130969756;
      public static final int tabRippleColor = 2130969757;
      public static final int tabSecondaryStyle = 2130969758;
      public static final int tabSelectedTextAppearance = 2130969759;
      public static final int tabSelectedTextColor = 2130969760;
      public static final int tabStyle = 2130969761;
      public static final int tabTextAppearance = 2130969762;
      public static final int tabTextColor = 2130969763;
      public static final int tabUnboundedRipple = 2130969764;
      public static final int targetId = 2130969765;
      public static final int telltales_tailColor = 2130969766;
      public static final int telltales_tailScale = 2130969767;
      public static final int telltales_velocityMode = 2130969768;
      public static final int textAllCaps = 2130969769;
      public static final int textAppearanceBody1 = 2130969770;
      public static final int textAppearanceBody2 = 2130969771;
      public static final int textAppearanceBodyLarge = 2130969772;
      public static final int textAppearanceBodyMedium = 2130969773;
      public static final int textAppearanceBodySmall = 2130969774;
      public static final int textAppearanceButton = 2130969775;
      public static final int textAppearanceCaption = 2130969776;
      public static final int textAppearanceDisplayLarge = 2130969777;
      public static final int textAppearanceDisplayMedium = 2130969778;
      public static final int textAppearanceDisplaySmall = 2130969779;
      public static final int textAppearanceHeadline1 = 2130969780;
      public static final int textAppearanceHeadline2 = 2130969781;
      public static final int textAppearanceHeadline3 = 2130969782;
      public static final int textAppearanceHeadline4 = 2130969783;
      public static final int textAppearanceHeadline5 = 2130969784;
      public static final int textAppearanceHeadline6 = 2130969785;
      public static final int textAppearanceHeadlineLarge = 2130969786;
      public static final int textAppearanceHeadlineMedium = 2130969787;
      public static final int textAppearanceHeadlineSmall = 2130969788;
      public static final int textAppearanceLabelLarge = 2130969789;
      public static final int textAppearanceLabelMedium = 2130969790;
      public static final int textAppearanceLabelSmall = 2130969791;
      public static final int textAppearanceLargePopupMenu = 2130969792;
      public static final int textAppearanceLineHeightEnabled = 2130969793;
      public static final int textAppearanceListItem = 2130969794;
      public static final int textAppearanceListItemSecondary = 2130969795;
      public static final int textAppearanceListItemSmall = 2130969796;
      public static final int textAppearanceOverline = 2130969797;
      public static final int textAppearancePopupMenuHeader = 2130969798;
      public static final int textAppearanceSearchResultSubtitle = 2130969799;
      public static final int textAppearanceSearchResultTitle = 2130969800;
      public static final int textAppearanceSmallPopupMenu = 2130969801;
      public static final int textAppearanceSubtitle1 = 2130969802;
      public static final int textAppearanceSubtitle2 = 2130969803;
      public static final int textAppearanceTitleLarge = 2130969804;
      public static final int textAppearanceTitleMedium = 2130969805;
      public static final int textAppearanceTitleSmall = 2130969806;
      public static final int textColorAlertDialogListItem = 2130969807;
      public static final int textColorSearchUrl = 2130969808;
      public static final int textEndPadding = 2130969809;
      public static final int textInputFilledDenseStyle = 2130969810;
      public static final int textInputFilledExposedDropdownMenuStyle = 2130969811;
      public static final int textInputFilledStyle = 2130969812;
      public static final int textInputLayoutFocusedRectEnabled = 2130969813;
      public static final int textInputOutlinedDenseStyle = 2130969814;
      public static final int textInputOutlinedExposedDropdownMenuStyle = 2130969815;
      public static final int textInputOutlinedStyle = 2130969816;
      public static final int textInputStyle = 2130969817;
      public static final int textLocale = 2130969818;
      public static final int textStartPadding = 2130969819;
      public static final int theme = 2130969820;
      public static final int thickness = 2130969821;
      public static final int threeFingersScrollEnabled = 2130969822;
      public static final int thumbColor = 2130969823;
      public static final int thumbElevation = 2130969824;
      public static final int thumbIcon = 2130969825;
      public static final int thumbIconTint = 2130969826;
      public static final int thumbIconTintMode = 2130969827;
      public static final int thumbRadius = 2130969828;
      public static final int thumbStrokeColor = 2130969829;
      public static final int thumbStrokeWidth = 2130969830;
      public static final int thumbTextPadding = 2130969831;
      public static final int thumbTint = 2130969832;
      public static final int thumbTintMode = 2130969833;
      public static final int tickColor = 2130969834;
      public static final int tickColorActive = 2130969835;
      public static final int tickColorInactive = 2130969836;
      public static final int tickMark = 2130969837;
      public static final int tickMarkTint = 2130969838;
      public static final int tickMarkTintMode = 2130969839;
      public static final int tickRadiusActive = 2130969840;
      public static final int tickRadiusInactive = 2130969841;
      public static final int tickVisible = 2130969842;
      public static final int time_bar_min_update_interval = 2130969843;
      public static final int tint = 2130969844;
      public static final int tintMode = 2130969845;
      public static final int tintNavigationIcon = 2130969846;
      public static final int title = 2130969847;
      public static final int titleCentered = 2130969848;
      public static final int titleCollapseMode = 2130969849;
      public static final int titleEnabled = 2130969850;
      public static final int titleMargin = 2130969851;
      public static final int titleMarginBottom = 2130969852;
      public static final int titleMarginEnd = 2130969853;
      public static final int titleMarginStart = 2130969854;
      public static final int titleMarginTop = 2130969855;
      public static final int titleMargins = 2130969856;
      public static final int titlePositionInterpolator = 2130969857;
      public static final int titleTextAppearance = 2130969858;
      public static final int titleTextColor = 2130969859;
      public static final int titleTextEllipsize = 2130969860;
      public static final int titleTextStyle = 2130969861;
      public static final int toggleCheckedStateOnClick = 2130969862;
      public static final int toolbarId = 2130969863;
      public static final int toolbarNavigationButtonStyle = 2130969864;
      public static final int toolbarStyle = 2130969865;
      public static final int toolbarSurfaceStyle = 2130969866;
      public static final int tooltipForegroundColor = 2130969867;
      public static final int tooltipFrameBackground = 2130969868;
      public static final int tooltipStyle = 2130969869;
      public static final int tooltipText = 2130969870;
      public static final int topInsetScrimEnabled = 2130969871;
      public static final int touchAnchorId = 2130969872;
      public static final int touchAnchorSide = 2130969873;
      public static final int touchRegionId = 2130969874;
      public static final int touch_target_height = 2130969875;
      public static final int track = 2130969876;
      public static final int trackColor = 2130969877;
      public static final int trackColorActive = 2130969878;
      public static final int trackColorInactive = 2130969879;
      public static final int trackCornerRadius = 2130969880;
      public static final int trackDecoration = 2130969881;
      public static final int trackDecorationTint = 2130969882;
      public static final int trackDecorationTintMode = 2130969883;
      public static final int trackHeight = 2130969884;
      public static final int trackThickness = 2130969885;
      public static final int trackTint = 2130969886;
      public static final int trackTintMode = 2130969887;
      public static final int transformation = 2130969888;
      public static final int transformationGravity = 2130969889;
      public static final int transitionDisable = 2130969890;
      public static final int transitionEasing = 2130969891;
      public static final int transitionFlags = 2130969892;
      public static final int transitionPathRotate = 2130969893;
      public static final int transitionShapeAppearance = 2130969894;
      public static final int triggerId = 2130969895;
      public static final int triggerReceiver = 2130969896;
      public static final int triggerSlack = 2130969897;
      public static final int ttcIndex = 2130969898;
      public static final int twoFingersScrollEnabled = 2130969899;
      public static final int ucrop_artv_ratio_title = 2130969900;
      public static final int ucrop_artv_ratio_x = 2130969901;
      public static final int ucrop_artv_ratio_y = 2130969902;
      public static final int ucrop_aspect_ratio_x = 2130969903;
      public static final int ucrop_aspect_ratio_y = 2130969904;
      public static final int ucrop_circle_dimmed_layer = 2130969905;
      public static final int ucrop_dimmed_color = 2130969906;
      public static final int ucrop_frame_color = 2130969907;
      public static final int ucrop_frame_stroke_size = 2130969908;
      public static final int ucrop_grid_color = 2130969909;
      public static final int ucrop_grid_column_count = 2130969910;
      public static final int ucrop_grid_row_count = 2130969911;
      public static final int ucrop_grid_stroke_size = 2130969912;
      public static final int ucrop_show_frame = 2130969913;
      public static final int ucrop_show_grid = 2130969914;
      public static final int ucrop_show_oval_crop_frame = 2130969915;
      public static final int unplayed_color = 2130969916;
      public static final int useCompatPadding = 2130969917;
      public static final int useDrawerArrowDrawable = 2130969918;
      public static final int useMaterialThemeColors = 2130969919;
      public static final int use_artwork = 2130969920;
      public static final int use_controller = 2130969921;
      public static final int values = 2130969922;
      public static final int verticalOffset = 2130969923;
      public static final int verticalOffsetWithText = 2130969924;
      public static final int verticalPanEnabled = 2130969925;
      public static final int viewAspectRatio = 2130969926;
      public static final int viewInflaterClass = 2130969927;
      public static final int visibilityMode = 2130969928;
      public static final int voiceIcon = 2130969929;
      public static final int warmth = 2130969930;
      public static final int waveDecay = 2130969931;
      public static final int waveOffset = 2130969932;
      public static final int wavePeriod = 2130969933;
      public static final int waveShape = 2130969934;
      public static final int waveVariesBy = 2130969935;
      public static final int windowActionBar = 2130969936;
      public static final int windowActionBarOverlay = 2130969937;
      public static final int windowActionModeOverlay = 2130969938;
      public static final int windowFixedHeightMajor = 2130969939;
      public static final int windowFixedHeightMinor = 2130969940;
      public static final int windowFixedWidthMajor = 2130969941;
      public static final int windowFixedWidthMinor = 2130969942;
      public static final int windowMinWidthMajor = 2130969943;
      public static final int windowMinWidthMinor = 2130969944;
      public static final int windowNoTitle = 2130969945;
      public static final int yearSelectedStyle = 2130969946;
      public static final int yearStyle = 2130969947;
      public static final int yearTodayStyle = 2130969948;
      public static final int zoomEnabled = 2130969949;

      private attr() {
      }
   }

   public static final class bool {
      public static final int abc_action_bar_embed_tabs = 2131034112;
      public static final int abc_config_actionMenuItemAllCaps = 2131034113;
      public static final int enable_system_alarm_service_default = 2131034114;
      public static final int enable_system_foreground_service_default = 2131034115;
      public static final int enable_system_job_service_default = 2131034116;
      public static final int mtrl_btn_textappearance_all_caps = 2131034117;
      public static final int use_cleartext_traffic = 2131034118;
      public static final int workmanager_test_configuration = 2131034119;

      private bool() {
      }
   }

   public static final class color {
      public static final int abc_background_cache_hint_selector_material_dark = 2131099648;
      public static final int abc_background_cache_hint_selector_material_light = 2131099649;
      public static final int abc_btn_colored_borderless_text_material = 2131099650;
      public static final int abc_btn_colored_text_material = 2131099651;
      public static final int abc_color_highlight_material = 2131099652;
      public static final int abc_decor_view_status_guard = 2131099653;
      public static final int abc_decor_view_status_guard_light = 2131099654;
      public static final int abc_hint_foreground_material_dark = 2131099655;
      public static final int abc_hint_foreground_material_light = 2131099656;
      public static final int abc_primary_text_disable_only_material_dark = 2131099657;
      public static final int abc_primary_text_disable_only_material_light = 2131099658;
      public static final int abc_primary_text_material_dark = 2131099659;
      public static final int abc_primary_text_material_light = 2131099660;
      public static final int abc_search_url_text = 2131099661;
      public static final int abc_search_url_text_normal = 2131099662;
      public static final int abc_search_url_text_pressed = 2131099663;
      public static final int abc_search_url_text_selected = 2131099664;
      public static final int abc_secondary_text_material_dark = 2131099665;
      public static final int abc_secondary_text_material_light = 2131099666;
      public static final int abc_tint_btn_checkable = 2131099667;
      public static final int abc_tint_default = 2131099668;
      public static final int abc_tint_edittext = 2131099669;
      public static final int abc_tint_seek_thumb = 2131099670;
      public static final int abc_tint_spinner = 2131099671;
      public static final int abc_tint_switch_track = 2131099672;
      public static final int accent_material_dark = 2131099673;
      public static final int accent_material_light = 2131099674;
      public static final int activity_card_icon_overlay_dark = 2131099675;
      public static final int activity_card_icon_overlay_darker = 2131099676;
      public static final int activity_card_icon_overlay_light = 2131099677;
      public static final int activity_card_icon_overlay_midnight = 2131099678;
      public static final int android_navigation_scrim_background_dark = 2131099679;
      public static final int android_navigation_scrim_background_darker = 2131099680;
      public static final int android_navigation_scrim_background_light = 2131099681;
      public static final int android_navigation_scrim_background_midnight = 2131099682;
      public static final int android_ripple_dark = 2131099683;
      public static final int android_ripple_darker = 2131099684;
      public static final int android_ripple_light = 2131099685;
      public static final int android_ripple_midnight = 2131099686;
      public static final int androidx_core_ripple_material_light = 2131099687;
      public static final int androidx_core_secondary_text_default_material_light = 2131099688;
      public static final int angry_background = 2131099689;
      public static final int application_subscription_end = 2131099690;
      public static final int application_subscription_start = 2131099691;
      public static final int background_floating_material_dark = 2131099692;
      public static final int background_floating_material_light = 2131099693;
      public static final int background_material_dark = 2131099694;
      public static final int background_material_light = 2131099695;
      public static final int background_mentioned_dark = 2131099696;
      public static final int background_mentioned_darker = 2131099697;
      public static final int background_mentioned_hover_dark = 2131099698;
      public static final int background_mentioned_hover_darker = 2131099699;
      public static final int background_mentioned_hover_light = 2131099700;
      public static final int background_mentioned_hover_midnight = 2131099701;
      public static final int background_mentioned_light = 2131099702;
      public static final int background_mentioned_midnight = 2131099703;
      public static final int background_message_automod_dark = 2131099704;
      public static final int background_message_automod_darker = 2131099705;
      public static final int background_message_automod_hover_dark = 2131099706;
      public static final int background_message_automod_hover_darker = 2131099707;
      public static final int background_message_automod_hover_light = 2131099708;
      public static final int background_message_automod_hover_midnight = 2131099709;
      public static final int background_message_automod_light = 2131099710;
      public static final int background_message_automod_midnight = 2131099711;
      public static final int background_message_highlight_dark = 2131099712;
      public static final int background_message_highlight_darker = 2131099713;
      public static final int background_message_highlight_hover_dark = 2131099714;
      public static final int background_message_highlight_hover_darker = 2131099715;
      public static final int background_message_highlight_hover_light = 2131099716;
      public static final int background_message_highlight_hover_midnight = 2131099717;
      public static final int background_message_highlight_light = 2131099718;
      public static final int background_message_highlight_midnight = 2131099719;
      public static final int background_message_hover_dark = 2131099720;
      public static final int background_message_hover_light = 2131099721;
      public static final int background_modifier_accent_2_dark = 2131099722;
      public static final int background_modifier_accent_2_darker = 2131099723;
      public static final int background_modifier_accent_2_light = 2131099724;
      public static final int background_modifier_accent_2_midnight = 2131099725;
      public static final int background_modifier_accent_dark = 2131099726;
      public static final int background_modifier_accent_darker = 2131099727;
      public static final int background_modifier_accent_light = 2131099728;
      public static final int background_modifier_accent_midnight = 2131099729;
      public static final int background_modifier_active_dark = 2131099730;
      public static final int background_modifier_active_darker = 2131099731;
      public static final int background_modifier_active_light = 2131099732;
      public static final int background_modifier_active_midnight = 2131099733;
      public static final int background_modifier_hover_dark = 2131099734;
      public static final int background_modifier_hover_darker = 2131099735;
      public static final int background_modifier_hover_light = 2131099736;
      public static final int background_modifier_hover_midnight = 2131099737;
      public static final int background_modifier_selected_dark = 2131099738;
      public static final int background_modifier_selected_darker = 2131099739;
      public static final int background_modifier_selected_light = 2131099740;
      public static final int background_modifier_selected_midnight = 2131099741;
      public static final int battlenet = 2131099742;
      public static final int beanie_background = 2131099743;
      public static final int bg_backdrop_dark = 2131099744;
      public static final int bg_backdrop_darker = 2131099745;
      public static final int bg_backdrop_light = 2131099746;
      public static final int bg_backdrop_midnight = 2131099747;
      public static final int bg_gradient_aurora_1 = 2131099748;
      public static final int bg_gradient_aurora_2 = 2131099749;
      public static final int bg_gradient_aurora_3 = 2131099750;
      public static final int bg_gradient_aurora_4 = 2131099751;
      public static final int bg_gradient_aurora_5 = 2131099752;
      public static final int bg_gradient_blurple_twilight_1 = 2131099753;
      public static final int bg_gradient_blurple_twilight_2 = 2131099754;
      public static final int bg_gradient_chroma_glow_1 = 2131099755;
      public static final int bg_gradient_chroma_glow_2 = 2131099756;
      public static final int bg_gradient_chroma_glow_3 = 2131099757;
      public static final int bg_gradient_chroma_glow_4 = 2131099758;
      public static final int bg_gradient_chroma_glow_5 = 2131099759;
      public static final int bg_gradient_citrus_sherbert_1 = 2131099760;
      public static final int bg_gradient_citrus_sherbert_2 = 2131099761;
      public static final int bg_gradient_cotton_candy_1 = 2131099762;
      public static final int bg_gradient_cotton_candy_2 = 2131099763;
      public static final int bg_gradient_crimson_moon_1 = 2131099764;
      public static final int bg_gradient_crimson_moon_2 = 2131099765;
      public static final int bg_gradient_desert_khaki_1 = 2131099766;
      public static final int bg_gradient_desert_khaki_2 = 2131099767;
      public static final int bg_gradient_desert_khaki_3 = 2131099768;
      public static final int bg_gradient_dusk_1 = 2131099769;
      public static final int bg_gradient_dusk_2 = 2131099770;
      public static final int bg_gradient_easter_egg_1 = 2131099771;
      public static final int bg_gradient_easter_egg_2 = 2131099772;
      public static final int bg_gradient_forest_1 = 2131099773;
      public static final int bg_gradient_forest_2 = 2131099774;
      public static final int bg_gradient_forest_3 = 2131099775;
      public static final int bg_gradient_forest_4 = 2131099776;
      public static final int bg_gradient_forest_5 = 2131099777;
      public static final int bg_gradient_hanami_1 = 2131099778;
      public static final int bg_gradient_hanami_2 = 2131099779;
      public static final int bg_gradient_hanami_3 = 2131099780;
      public static final int bg_gradient_lofi_vibes_1 = 2131099781;
      public static final int bg_gradient_lofi_vibes_2 = 2131099782;
      public static final int bg_gradient_lofi_vibes_3 = 2131099783;
      public static final int bg_gradient_lofi_vibes_4 = 2131099784;
      public static final int bg_gradient_mars_1 = 2131099785;
      public static final int bg_gradient_mars_2 = 2131099786;
      public static final int bg_gradient_midnight_blurple_1 = 2131099787;
      public static final int bg_gradient_midnight_blurple_2 = 2131099788;
      public static final int bg_gradient_mint_apple_1 = 2131099789;
      public static final int bg_gradient_mint_apple_2 = 2131099790;
      public static final int bg_gradient_mint_apple_3 = 2131099791;
      public static final int bg_gradient_neon_nights_1 = 2131099792;
      public static final int bg_gradient_neon_nights_2 = 2131099793;
      public static final int bg_gradient_neon_nights_3 = 2131099794;
      public static final int bg_gradient_retro_raincloud_1 = 2131099795;
      public static final int bg_gradient_retro_raincloud_2 = 2131099796;
      public static final int bg_gradient_retro_storm_1 = 2131099797;
      public static final int bg_gradient_retro_storm_2 = 2131099798;
      public static final int bg_gradient_sepia_1 = 2131099799;
      public static final int bg_gradient_sepia_2 = 2131099800;
      public static final int bg_gradient_strawberry_lemonade_1 = 2131099801;
      public static final int bg_gradient_strawberry_lemonade_2 = 2131099802;
      public static final int bg_gradient_strawberry_lemonade_3 = 2131099803;
      public static final int bg_gradient_sunrise_1 = 2131099804;
      public static final int bg_gradient_sunrise_2 = 2131099805;
      public static final int bg_gradient_sunrise_3 = 2131099806;
      public static final int bg_gradient_sunset_1 = 2131099807;
      public static final int bg_gradient_sunset_2 = 2131099808;
      public static final int bg_gradient_under_the_sea_1 = 2131099809;
      public static final int bg_gradient_under_the_sea_2 = 2131099810;
      public static final int bg_gradient_under_the_sea_3 = 2131099811;
      public static final int bg_mod_faint_dark = 2131099812;
      public static final int bg_mod_faint_darker = 2131099813;
      public static final int bg_mod_faint_light = 2131099814;
      public static final int bg_mod_faint_midnight = 2131099815;
      public static final int bg_mod_strong_dark = 2131099816;
      public static final int bg_mod_strong_darker = 2131099817;
      public static final int bg_mod_strong_light = 2131099818;
      public static final int bg_mod_strong_midnight = 2131099819;
      public static final int bg_mod_subtle_dark = 2131099820;
      public static final int bg_mod_subtle_darker = 2131099821;
      public static final int bg_mod_subtle_light = 2131099822;
      public static final int bg_mod_subtle_midnight = 2131099823;
      public static final int black = 2131099824;
      public static final int black_100 = 2131099825;
      public static final int black_130 = 2131099826;
      public static final int black_160 = 2131099827;
      public static final int black_200 = 2131099828;
      public static final int black_230 = 2131099829;
      public static final int black_260 = 2131099830;
      public static final int black_300 = 2131099831;
      public static final int black_330 = 2131099832;
      public static final int black_345 = 2131099833;
      public static final int black_360 = 2131099834;
      public static final int black_400 = 2131099835;
      public static final int black_430 = 2131099836;
      public static final int black_460 = 2131099837;
      public static final int black_500 = 2131099838;
      public static final int black_530 = 2131099839;
      public static final int black_560 = 2131099840;
      public static final int black_600 = 2131099841;
      public static final int black_630 = 2131099842;
      public static final int black_660 = 2131099843;
      public static final int black_700 = 2131099844;
      public static final int black_730 = 2131099845;
      public static final int black_760 = 2131099846;
      public static final int black_800 = 2131099847;
      public static final int black_830 = 2131099848;
      public static final int black_860 = 2131099849;
      public static final int black_900 = 2131099850;
      public static final int black_alpha_80 = 2131099851;
      public static final int blue = 2131099852;
      public static final int blue_100 = 2131099853;
      public static final int blue_130 = 2131099854;
      public static final int blue_160 = 2131099855;
      public static final int blue_200 = 2131099856;
      public static final int blue_230 = 2131099857;
      public static final int blue_260 = 2131099858;
      public static final int blue_300 = 2131099859;
      public static final int blue_330 = 2131099860;
      public static final int blue_345 = 2131099861;
      public static final int blue_360 = 2131099862;
      public static final int blue_400 = 2131099863;
      public static final int blue_430 = 2131099864;
      public static final int blue_460 = 2131099865;
      public static final int blue_500 = 2131099866;
      public static final int blue_530 = 2131099867;
      public static final int blue_560 = 2131099868;
      public static final int blue_600 = 2131099869;
      public static final int blue_630 = 2131099870;
      public static final int blue_660 = 2131099871;
      public static final int blue_700 = 2131099872;
      public static final int blue_730 = 2131099873;
      public static final int blue_760 = 2131099874;
      public static final int blue_800 = 2131099875;
      public static final int blue_830 = 2131099876;
      public static final int blue_860 = 2131099877;
      public static final int blue_900 = 2131099878;
      public static final int blur_fallback_dark = 2131099879;
      public static final int blur_fallback_darker = 2131099880;
      public static final int blur_fallback_light = 2131099881;
      public static final int blur_fallback_midnight = 2131099882;
      public static final int blur_fallback_pressed_dark = 2131099883;
      public static final int blur_fallback_pressed_darker = 2131099884;
      public static final int blur_fallback_pressed_light = 2131099885;
      public static final int blur_fallback_pressed_midnight = 2131099886;
      public static final int blurple_twilight_background = 2131099887;
      public static final int blush_background = 2131099888;
      public static final int border_faint_dark = 2131099889;
      public static final int border_faint_darker = 2131099890;
      public static final int border_faint_light = 2131099891;
      public static final int border_faint_midnight = 2131099892;
      public static final int border_strong_dark = 2131099893;
      public static final int border_strong_darker = 2131099894;
      public static final int border_strong_light = 2131099895;
      public static final int border_strong_midnight = 2131099896;
      public static final int border_subtle_dark = 2131099897;
      public static final int border_subtle_darker = 2131099898;
      public static final int border_subtle_light = 2131099899;
      public static final int border_subtle_midnight = 2131099900;
      public static final int brand = 2131099901;
      public static final int brand_100 = 2131099902;
      public static final int brand_130 = 2131099903;
      public static final int brand_160 = 2131099904;
      public static final int brand_200 = 2131099905;
      public static final int brand_230 = 2131099906;
      public static final int brand_260 = 2131099907;
      public static final int brand_300 = 2131099908;
      public static final int brand_330 = 2131099909;
      public static final int brand_345 = 2131099910;
      public static final int brand_360 = 2131099911;
      public static final int brand_400 = 2131099912;
      public static final int brand_430 = 2131099913;
      public static final int brand_460 = 2131099914;
      public static final int brand_500 = 2131099915;
      public static final int brand_530 = 2131099916;
      public static final int brand_560 = 2131099917;
      public static final int brand_600 = 2131099918;
      public static final int brand_630 = 2131099919;
      public static final int brand_660 = 2131099920;
      public static final int brand_700 = 2131099921;
      public static final int brand_730 = 2131099922;
      public static final int brand_760 = 2131099923;
      public static final int brand_800 = 2131099924;
      public static final int brand_830 = 2131099925;
      public static final int brand_860 = 2131099926;
      public static final int brand_900 = 2131099927;
      public static final int brand_dark_background = 2131099928;
      public static final int brand_inverted_background = 2131099929;
      public static final int brand_new_360_alpha_20 = 2131099930;
      public static final int brand_new_360_alpha_25 = 2131099931;
      public static final int brand_new_500_alpha_20 = 2131099932;
      public static final int bright_foreground_disabled_material_dark = 2131099933;
      public static final int bright_foreground_disabled_material_light = 2131099934;
      public static final int bright_foreground_inverse_material_dark = 2131099935;
      public static final int bright_foreground_inverse_material_light = 2131099936;
      public static final int bright_foreground_material_dark = 2131099937;
      public static final int bright_foreground_material_light = 2131099938;
      public static final int browser_actions_bg_grey = 2131099939;
      public static final int browser_actions_divider_color = 2131099940;
      public static final int browser_actions_text_color = 2131099941;
      public static final int browser_actions_title_color = 2131099942;
      public static final int bug_reporter_modal_submitting_background_dark = 2131099943;
      public static final int bug_reporter_modal_submitting_background_darker = 2131099944;
      public static final int bug_reporter_modal_submitting_background_light = 2131099945;
      public static final int bug_reporter_modal_submitting_background_midnight = 2131099946;
      public static final int bungie = 2131099947;
      public static final int button_material_dark = 2131099948;
      public static final int button_material_light = 2131099949;
      public static final int button_outline_brand_background_dark = 2131099950;
      public static final int button_outline_brand_background_darker = 2131099951;
      public static final int button_outline_brand_background_light = 2131099952;
      public static final int button_outline_brand_background_midnight = 2131099953;
      public static final int button_outline_danger_background_dark = 2131099954;
      public static final int button_outline_danger_background_darker = 2131099955;
      public static final int button_outline_danger_background_light = 2131099956;
      public static final int button_outline_danger_background_midnight = 2131099957;
      public static final int button_outline_positive_background_dark = 2131099958;
      public static final int button_outline_positive_background_darker = 2131099959;
      public static final int button_outline_positive_background_light = 2131099960;
      public static final int button_outline_positive_background_midnight = 2131099961;
      public static final int button_outline_primary_background_dark = 2131099962;
      public static final int button_outline_primary_background_darker = 2131099963;
      public static final int button_outline_primary_background_light = 2131099964;
      public static final int button_outline_primary_background_midnight = 2131099965;
      public static final int call_notification_answer_color = 2131099966;
      public static final int call_notification_decline_color = 2131099967;
      public static final int camo_background = 2131099968;
      public static final int card_gradient_bg_dark = 2131099969;
      public static final int card_gradient_bg_darker = 2131099970;
      public static final int card_gradient_bg_light = 2131099971;
      public static final int card_gradient_bg_midnight = 2131099972;
      public static final int card_gradient_pressed_bg_dark = 2131099973;
      public static final int card_gradient_pressed_bg_darker = 2131099974;
      public static final int card_gradient_pressed_bg_light = 2131099975;
      public static final int card_gradient_pressed_bg_midnight = 2131099976;
      public static final int cardview_dark_background = 2131099977;
      public static final int cardview_light_background = 2131099978;
      public static final int cardview_shadow_end_color = 2131099979;
      public static final int cardview_shadow_start_color = 2131099980;
      public static final int catalyst_logbox_background = 2131099981;
      public static final int catalyst_redbox_background = 2131099982;
      public static final int chat_media_view_stroke = 2131099983;
      public static final int chat_mentions_background_dark = 2131099984;
      public static final int chat_mentions_background_light = 2131099985;
      public static final int chat_mentions_foreground_dark = 2131099986;
      public static final int chat_mentions_foreground_light = 2131099987;
      public static final int chat_swipe_to_reply_gradient_background_dark = 2131099988;
      public static final int chat_swipe_to_reply_gradient_background_darker = 2131099989;
      public static final int chat_swipe_to_reply_gradient_background_light = 2131099990;
      public static final int chat_swipe_to_reply_gradient_background_midnight = 2131099991;
      public static final int circuit_background = 2131099992;
      public static final int color_wave_background = 2131099993;
      public static final int common_google_signin_btn_text_dark = 2131099994;
      public static final int common_google_signin_btn_text_dark_default = 2131099995;
      public static final int common_google_signin_btn_text_dark_disabled = 2131099996;
      public static final int common_google_signin_btn_text_dark_focused = 2131099997;
      public static final int common_google_signin_btn_text_dark_pressed = 2131099998;
      public static final int common_google_signin_btn_text_light = 2131099999;
      public static final int common_google_signin_btn_text_light_default = 2131100000;
      public static final int common_google_signin_btn_text_light_disabled = 2131100001;
      public static final int common_google_signin_btn_text_light_focused = 2131100002;
      public static final int common_google_signin_btn_text_light_pressed = 2131100003;
      public static final int common_google_signin_btn_tint = 2131100004;
      public static final int content_inventory_media_seekbar_container_dark = 2131100005;
      public static final int content_inventory_media_seekbar_container_darker = 2131100006;
      public static final int content_inventory_media_seekbar_container_light = 2131100007;
      public static final int content_inventory_media_seekbar_container_midnight = 2131100008;
      public static final int content_inventory_overlay_text_primary_dark = 2131100009;
      public static final int content_inventory_overlay_text_primary_darker = 2131100010;
      public static final int content_inventory_overlay_text_primary_light = 2131100011;
      public static final int content_inventory_overlay_text_primary_midnight = 2131100012;
      public static final int content_inventory_overlay_text_secondary_dark = 2131100013;
      public static final int content_inventory_overlay_text_secondary_darker = 2131100014;
      public static final int content_inventory_overlay_text_secondary_light = 2131100015;
      public static final int content_inventory_overlay_text_secondary_midnight = 2131100016;
      public static final int content_inventory_overlay_ui_mod_bg_dark = 2131100017;
      public static final int content_inventory_overlay_ui_mod_bg_darker = 2131100018;
      public static final int content_inventory_overlay_ui_mod_bg_light = 2131100019;
      public static final int content_inventory_overlay_ui_mod_bg_midnight = 2131100020;
      public static final int content_inventory_overlay_ui_mod_dark = 2131100021;
      public static final int content_inventory_overlay_ui_mod_darker = 2131100022;
      public static final int content_inventory_overlay_ui_mod_light = 2131100023;
      public static final int content_inventory_overlay_ui_mod_midnight = 2131100024;
      public static final int context_menu_backdrop_background_dark = 2131100025;
      public static final int context_menu_backdrop_background_darker = 2131100026;
      public static final int context_menu_backdrop_background_light = 2131100027;
      public static final int context_menu_backdrop_background_midnight = 2131100028;
      public static final int controller_background = 2131100029;
      public static final int creator_revenue_info_box_background_dark = 2131100030;
      public static final int creator_revenue_info_box_background_darker = 2131100031;
      public static final int creator_revenue_info_box_background_light = 2131100032;
      public static final int creator_revenue_info_box_background_midnight = 2131100033;
      public static final int crunchyroll = 2131100034;
      public static final int deprecated_card_bg_dark = 2131100035;
      public static final int deprecated_card_bg_darker = 2131100036;
      public static final int deprecated_card_bg_midnight = 2131100037;
      public static final int deprecated_card_editable_bg_dark = 2131100038;
      public static final int deprecated_card_editable_bg_darker = 2131100039;
      public static final int deprecated_card_editable_bg_light = 2131100040;
      public static final int deprecated_card_editable_bg_midnight = 2131100041;
      public static final int deprecated_quickswitcher_input_placeholder_dark = 2131100042;
      public static final int deprecated_quickswitcher_input_placeholder_darker = 2131100043;
      public static final int deprecated_quickswitcher_input_placeholder_light = 2131100044;
      public static final int deprecated_quickswitcher_input_placeholder_midnight = 2131100045;
      public static final int deprecated_text_input_border_dark = 2131100046;
      public static final int deprecated_text_input_border_darker = 2131100047;
      public static final int deprecated_text_input_border_light = 2131100048;
      public static final int deprecated_text_input_border_midnight = 2131100049;
      public static final int design_bottom_navigation_shadow_color = 2131100050;
      public static final int design_box_stroke_color = 2131100051;
      public static final int design_dark_default_color_background = 2131100052;
      public static final int design_dark_default_color_error = 2131100053;
      public static final int design_dark_default_color_on_background = 2131100054;
      public static final int design_dark_default_color_on_error = 2131100055;
      public static final int design_dark_default_color_on_primary = 2131100056;
      public static final int design_dark_default_color_on_secondary = 2131100057;
      public static final int design_dark_default_color_on_surface = 2131100058;
      public static final int design_dark_default_color_primary = 2131100059;
      public static final int design_dark_default_color_primary_dark = 2131100060;
      public static final int design_dark_default_color_primary_variant = 2131100061;
      public static final int design_dark_default_color_secondary = 2131100062;
      public static final int design_dark_default_color_secondary_variant = 2131100063;
      public static final int design_dark_default_color_surface = 2131100064;
      public static final int design_default_color_background = 2131100065;
      public static final int design_default_color_error = 2131100066;
      public static final int design_default_color_on_background = 2131100067;
      public static final int design_default_color_on_error = 2131100068;
      public static final int design_default_color_on_primary = 2131100069;
      public static final int design_default_color_on_secondary = 2131100070;
      public static final int design_default_color_on_surface = 2131100071;
      public static final int design_default_color_primary = 2131100072;
      public static final int design_default_color_primary_dark = 2131100073;
      public static final int design_default_color_primary_variant = 2131100074;
      public static final int design_default_color_secondary = 2131100075;
      public static final int design_default_color_secondary_variant = 2131100076;
      public static final int design_default_color_surface = 2131100077;
      public static final int design_error = 2131100078;
      public static final int design_fab_shadow_end_color = 2131100079;
      public static final int design_fab_shadow_mid_color = 2131100080;
      public static final int design_fab_shadow_start_color = 2131100081;
      public static final int design_fab_stroke_end_inner_color = 2131100082;
      public static final int design_fab_stroke_end_outer_color = 2131100083;
      public static final int design_fab_stroke_top_inner_color = 2131100084;
      public static final int design_fab_stroke_top_outer_color = 2131100085;
      public static final int design_icon_tint = 2131100086;
      public static final int design_snackbar_background_color = 2131100087;
      public static final int dim_foreground_disabled_material_dark = 2131100088;
      public static final int dim_foreground_disabled_material_light = 2131100089;
      public static final int dim_foreground_material_dark = 2131100090;
      public static final int dim_foreground_material_light = 2131100091;
      public static final int discord_8th_bday_blue = 2131100092;
      public static final int discord_8th_bday_dark_blue = 2131100093;
      public static final int discord_8th_bday_green = 2131100094;
      public static final int discord_8th_bday_light_blue = 2131100095;
      public static final int discord_8th_bday_pink = 2131100096;
      public static final int discord_8th_bday_purple = 2131100097;
      public static final int discord_8th_bday_yellow = 2131100098;
      public static final int display_banner_overflow_background_dark = 2131100099;
      public static final int display_banner_overflow_background_darker = 2131100100;
      public static final int display_banner_overflow_background_light = 2131100101;
      public static final int display_banner_overflow_background_midnight = 2131100102;
      public static final int divider_strong_dark = 2131100103;
      public static final int divider_strong_darker = 2131100104;
      public static final int divider_strong_light = 2131100105;
      public static final int divider_strong_midnight = 2131100106;
      public static final int divider_subtle_dark = 2131100107;
      public static final int divider_subtle_darker = 2131100108;
      public static final int divider_subtle_light = 2131100109;
      public static final int divider_subtle_midnight = 2131100110;
      public static final int ebay = 2131100111;
      public static final int epic_games = 2131100112;
      public static final int error_color_material_dark = 2131100113;
      public static final int error_color_material_light = 2131100114;
      public static final int exo_black_opacity_60 = 2131100115;
      public static final int exo_black_opacity_70 = 2131100116;
      public static final int exo_bottom_bar_background = 2131100117;
      public static final int exo_edit_mode_background_color = 2131100118;
      public static final int exo_error_message_background_color = 2131100119;
      public static final int exo_styled_error_message_background = 2131100120;
      public static final int exo_white = 2131100121;
      public static final int exo_white_opacity_70 = 2131100122;
      public static final int facebook = 2131100123;
      public static final int fcm_test_color = 2131100124;
      public static final int foreground_material_dark = 2131100125;
      public static final int foreground_material_light = 2131100126;
      public static final int forum_post_extra_media_count_container_background_dark = 2131100127;
      public static final int forum_post_extra_media_count_container_background_darker = 2131100128;
      public static final int forum_post_extra_media_count_container_background_light = 2131100129;
      public static final int forum_post_extra_media_count_container_background_midnight = 2131100130;
      public static final int forum_post_tag_background_dark = 2131100131;
      public static final int forum_post_tag_background_darker = 2131100132;
      public static final int forum_post_tag_background_light = 2131100133;
      public static final int forum_post_tag_background_midnight = 2131100134;
      public static final int github = 2131100135;
      public static final int gold = 2131100136;
      public static final int green = 2131100137;
      public static final int green_100 = 2131100138;
      public static final int green_130 = 2131100139;
      public static final int green_160 = 2131100140;
      public static final int green_200 = 2131100141;
      public static final int green_230 = 2131100142;
      public static final int green_260 = 2131100143;
      public static final int green_300 = 2131100144;
      public static final int green_330 = 2131100145;
      public static final int green_345 = 2131100146;
      public static final int green_360 = 2131100147;
      public static final int green_400 = 2131100148;
      public static final int green_430 = 2131100149;
      public static final int green_460 = 2131100150;
      public static final int green_500 = 2131100151;
      public static final int green_530 = 2131100152;
      public static final int green_560 = 2131100153;
      public static final int green_600 = 2131100154;
      public static final int green_630 = 2131100155;
      public static final int green_660 = 2131100156;
      public static final int green_700 = 2131100157;
      public static final int green_730 = 2131100158;
      public static final int green_760 = 2131100159;
      public static final int green_800 = 2131100160;
      public static final int green_830 = 2131100161;
      public static final int green_860 = 2131100162;
      public static final int green_900 = 2131100163;
      public static final int guild_boosting_blue = 2131100164;
      public static final int guild_boosting_blue_for_gradients = 2131100165;
      public static final int guild_boosting_pink = 2131100166;
      public static final int guild_boosting_purple = 2131100167;
      public static final int guild_boosting_purple_for_gradients = 2131100168;
      public static final int halo_positive_dark = 2131100169;
      public static final int halo_positive_darker = 2131100170;
      public static final int halo_positive_light = 2131100171;
      public static final int halo_positive_midnight = 2131100172;
      public static final int highlighted_text_material_dark = 2131100173;
      public static final int highlighted_text_material_light = 2131100174;
      public static final int holowaves_background = 2131100175;
      public static final int home_card_resting_border_dark = 2131100176;
      public static final int home_card_resting_border_darker = 2131100177;
      public static final int home_card_resting_border_light = 2131100178;
      public static final int home_card_resting_border_midnight = 2131100179;
      public static final int hypesquad_house_1 = 2131100180;
      public static final int hypesquad_house_2 = 2131100181;
      public static final int hypesquad_house_3 = 2131100182;
      public static final int icon_transparent_dark = 2131100183;
      public static final int icon_transparent_darker = 2131100184;
      public static final int icon_transparent_light = 2131100185;
      public static final int icon_transparent_midnight = 2131100186;
      public static final int in_rainbows_background = 2131100187;
      public static final int info_box_background_dark = 2131100188;
      public static final int info_box_background_darker = 2131100189;
      public static final int info_box_background_light = 2131100190;
      public static final int info_box_background_midnight = 2131100191;
      public static final int info_danger_background_dark = 2131100192;
      public static final int info_danger_background_darker = 2131100193;
      public static final int info_danger_background_light = 2131100194;
      public static final int info_danger_background_midnight = 2131100195;
      public static final int info_help_background_dark = 2131100196;
      public static final int info_help_background_darker = 2131100197;
      public static final int info_help_background_light = 2131100198;
      public static final int info_help_background_midnight = 2131100199;
      public static final int info_positive_background_dark = 2131100200;
      public static final int info_positive_background_darker = 2131100201;
      public static final int info_positive_background_light = 2131100202;
      public static final int info_positive_background_midnight = 2131100203;
      public static final int info_warning_background_dark = 2131100204;
      public static final int info_warning_background_darker = 2131100205;
      public static final int info_warning_background_light = 2131100206;
      public static final int info_warning_background_midnight = 2131100207;
      public static final int input_background_darker = 2131100208;
      public static final int input_background_light = 2131100209;
      public static final int input_background_midnight = 2131100210;
      public static final int input_focused_border_dark = 2131100211;
      public static final int input_focused_border_darker = 2131100212;
      public static final int input_focused_border_light = 2131100213;
      public static final int input_focused_border_midnight = 2131100214;
      public static final int input_placeholder_text_dark = 2131100215;
      public static final int legacy_android_blur_overlay_default_dark = 2131100216;
      public static final int legacy_android_blur_overlay_default_darker = 2131100217;
      public static final int legacy_android_blur_overlay_default_light = 2131100218;
      public static final int legacy_android_blur_overlay_default_midnight = 2131100219;
      public static final int legacy_android_blur_overlay_ultra_thin_dark = 2131100220;
      public static final int legacy_android_blur_overlay_ultra_thin_darker = 2131100221;
      public static final int legacy_android_blur_overlay_ultra_thin_light = 2131100222;
      public static final int legacy_android_blur_overlay_ultra_thin_midnight = 2131100223;
      public static final int legacy_blur_fallback_default_dark = 2131100224;
      public static final int legacy_blur_fallback_default_darker = 2131100225;
      public static final int legacy_blur_fallback_default_light = 2131100226;
      public static final int legacy_blur_fallback_default_midnight = 2131100227;
      public static final int legacy_blur_fallback_ultra_thin_dark = 2131100228;
      public static final int legacy_blur_fallback_ultra_thin_darker = 2131100229;
      public static final int legacy_blur_fallback_ultra_thin_light = 2131100230;
      public static final int legacy_blur_fallback_ultra_thin_midnight = 2131100231;
      public static final int live_stage_tile_border_dark = 2131100232;
      public static final int live_stage_tile_border_darker = 2131100233;
      public static final int live_stage_tile_border_light = 2131100234;
      public static final int live_stage_tile_border_midnight = 2131100235;
      public static final int lol = 2131100236;
      public static final int m3_appbar_overlay_color = 2131100237;
      public static final int m3_assist_chip_icon_tint_color = 2131100238;
      public static final int m3_assist_chip_stroke_color = 2131100239;
      public static final int m3_button_background_color_selector = 2131100240;
      public static final int m3_button_foreground_color_selector = 2131100241;
      public static final int m3_button_outline_color_selector = 2131100242;
      public static final int m3_button_ripple_color = 2131100243;
      public static final int m3_button_ripple_color_selector = 2131100244;
      public static final int m3_calendar_item_disabled_text = 2131100245;
      public static final int m3_calendar_item_stroke_color = 2131100246;
      public static final int m3_card_foreground_color = 2131100247;
      public static final int m3_card_ripple_color = 2131100248;
      public static final int m3_card_stroke_color = 2131100249;
      public static final int m3_checkbox_button_icon_tint = 2131100250;
      public static final int m3_checkbox_button_tint = 2131100251;
      public static final int m3_chip_assist_text_color = 2131100252;
      public static final int m3_chip_background_color = 2131100253;
      public static final int m3_chip_ripple_color = 2131100254;
      public static final int m3_chip_stroke_color = 2131100255;
      public static final int m3_chip_text_color = 2131100256;
      public static final int m3_dark_default_color_primary_text = 2131100257;
      public static final int m3_dark_default_color_secondary_text = 2131100258;
      public static final int m3_dark_highlighted_text = 2131100259;
      public static final int m3_dark_hint_foreground = 2131100260;
      public static final int m3_dark_primary_text_disable_only = 2131100261;
      public static final int m3_default_color_primary_text = 2131100262;
      public static final int m3_default_color_secondary_text = 2131100263;
      public static final int m3_dynamic_dark_default_color_primary_text = 2131100264;
      public static final int m3_dynamic_dark_default_color_secondary_text = 2131100265;
      public static final int m3_dynamic_dark_highlighted_text = 2131100266;
      public static final int m3_dynamic_dark_hint_foreground = 2131100267;
      public static final int m3_dynamic_dark_primary_text_disable_only = 2131100268;
      public static final int m3_dynamic_default_color_primary_text = 2131100269;
      public static final int m3_dynamic_default_color_secondary_text = 2131100270;
      public static final int m3_dynamic_highlighted_text = 2131100271;
      public static final int m3_dynamic_hint_foreground = 2131100272;
      public static final int m3_dynamic_primary_text_disable_only = 2131100273;
      public static final int m3_efab_ripple_color_selector = 2131100274;
      public static final int m3_elevated_chip_background_color = 2131100275;
      public static final int m3_fab_efab_background_color_selector = 2131100276;
      public static final int m3_fab_efab_foreground_color_selector = 2131100277;
      public static final int m3_fab_ripple_color_selector = 2131100278;
      public static final int m3_filled_icon_button_container_color_selector = 2131100279;
      public static final int m3_highlighted_text = 2131100280;
      public static final int m3_hint_foreground = 2131100281;
      public static final int m3_icon_button_icon_color_selector = 2131100282;
      public static final int m3_navigation_bar_item_with_indicator_icon_tint = 2131100283;
      public static final int m3_navigation_bar_item_with_indicator_label_tint = 2131100284;
      public static final int m3_navigation_bar_ripple_color_selector = 2131100285;
      public static final int m3_navigation_item_background_color = 2131100286;
      public static final int m3_navigation_item_icon_tint = 2131100287;
      public static final int m3_navigation_item_ripple_color = 2131100288;
      public static final int m3_navigation_item_text_color = 2131100289;
      public static final int m3_navigation_rail_item_with_indicator_icon_tint = 2131100290;
      public static final int m3_navigation_rail_item_with_indicator_label_tint = 2131100291;
      public static final int m3_navigation_rail_ripple_color_selector = 2131100292;
      public static final int m3_popupmenu_overlay_color = 2131100293;
      public static final int m3_primary_text_disable_only = 2131100294;
      public static final int m3_radiobutton_button_tint = 2131100295;
      public static final int m3_radiobutton_ripple_tint = 2131100296;
      public static final int m3_ref_palette_black = 2131100297;
      public static final int m3_ref_palette_dynamic_neutral0 = 2131100298;
      public static final int m3_ref_palette_dynamic_neutral10 = 2131100299;
      public static final int m3_ref_palette_dynamic_neutral100 = 2131100300;
      public static final int m3_ref_palette_dynamic_neutral12 = 2131100301;
      public static final int m3_ref_palette_dynamic_neutral17 = 2131100302;
      public static final int m3_ref_palette_dynamic_neutral20 = 2131100303;
      public static final int m3_ref_palette_dynamic_neutral22 = 2131100304;
      public static final int m3_ref_palette_dynamic_neutral24 = 2131100305;
      public static final int m3_ref_palette_dynamic_neutral30 = 2131100306;
      public static final int m3_ref_palette_dynamic_neutral4 = 2131100307;
      public static final int m3_ref_palette_dynamic_neutral40 = 2131100308;
      public static final int m3_ref_palette_dynamic_neutral50 = 2131100309;
      public static final int m3_ref_palette_dynamic_neutral6 = 2131100310;
      public static final int m3_ref_palette_dynamic_neutral60 = 2131100311;
      public static final int m3_ref_palette_dynamic_neutral70 = 2131100312;
      public static final int m3_ref_palette_dynamic_neutral80 = 2131100313;
      public static final int m3_ref_palette_dynamic_neutral87 = 2131100314;
      public static final int m3_ref_palette_dynamic_neutral90 = 2131100315;
      public static final int m3_ref_palette_dynamic_neutral92 = 2131100316;
      public static final int m3_ref_palette_dynamic_neutral94 = 2131100317;
      public static final int m3_ref_palette_dynamic_neutral95 = 2131100318;
      public static final int m3_ref_palette_dynamic_neutral96 = 2131100319;
      public static final int m3_ref_palette_dynamic_neutral98 = 2131100320;
      public static final int m3_ref_palette_dynamic_neutral99 = 2131100321;
      public static final int m3_ref_palette_dynamic_neutral_variant0 = 2131100322;
      public static final int m3_ref_palette_dynamic_neutral_variant10 = 2131100323;
      public static final int m3_ref_palette_dynamic_neutral_variant100 = 2131100324;
      public static final int m3_ref_palette_dynamic_neutral_variant20 = 2131100325;
      public static final int m3_ref_palette_dynamic_neutral_variant30 = 2131100326;
      public static final int m3_ref_palette_dynamic_neutral_variant40 = 2131100327;
      public static final int m3_ref_palette_dynamic_neutral_variant50 = 2131100328;
      public static final int m3_ref_palette_dynamic_neutral_variant60 = 2131100329;
      public static final int m3_ref_palette_dynamic_neutral_variant70 = 2131100330;
      public static final int m3_ref_palette_dynamic_neutral_variant80 = 2131100331;
      public static final int m3_ref_palette_dynamic_neutral_variant90 = 2131100332;
      public static final int m3_ref_palette_dynamic_neutral_variant95 = 2131100333;
      public static final int m3_ref_palette_dynamic_neutral_variant99 = 2131100334;
      public static final int m3_ref_palette_dynamic_primary0 = 2131100335;
      public static final int m3_ref_palette_dynamic_primary10 = 2131100336;
      public static final int m3_ref_palette_dynamic_primary100 = 2131100337;
      public static final int m3_ref_palette_dynamic_primary20 = 2131100338;
      public static final int m3_ref_palette_dynamic_primary30 = 2131100339;
      public static final int m3_ref_palette_dynamic_primary40 = 2131100340;
      public static final int m3_ref_palette_dynamic_primary50 = 2131100341;
      public static final int m3_ref_palette_dynamic_primary60 = 2131100342;
      public static final int m3_ref_palette_dynamic_primary70 = 2131100343;
      public static final int m3_ref_palette_dynamic_primary80 = 2131100344;
      public static final int m3_ref_palette_dynamic_primary90 = 2131100345;
      public static final int m3_ref_palette_dynamic_primary95 = 2131100346;
      public static final int m3_ref_palette_dynamic_primary99 = 2131100347;
      public static final int m3_ref_palette_dynamic_secondary0 = 2131100348;
      public static final int m3_ref_palette_dynamic_secondary10 = 2131100349;
      public static final int m3_ref_palette_dynamic_secondary100 = 2131100350;
      public static final int m3_ref_palette_dynamic_secondary20 = 2131100351;
      public static final int m3_ref_palette_dynamic_secondary30 = 2131100352;
      public static final int m3_ref_palette_dynamic_secondary40 = 2131100353;
      public static final int m3_ref_palette_dynamic_secondary50 = 2131100354;
      public static final int m3_ref_palette_dynamic_secondary60 = 2131100355;
      public static final int m3_ref_palette_dynamic_secondary70 = 2131100356;
      public static final int m3_ref_palette_dynamic_secondary80 = 2131100357;
      public static final int m3_ref_palette_dynamic_secondary90 = 2131100358;
      public static final int m3_ref_palette_dynamic_secondary95 = 2131100359;
      public static final int m3_ref_palette_dynamic_secondary99 = 2131100360;
      public static final int m3_ref_palette_dynamic_tertiary0 = 2131100361;
      public static final int m3_ref_palette_dynamic_tertiary10 = 2131100362;
      public static final int m3_ref_palette_dynamic_tertiary100 = 2131100363;
      public static final int m3_ref_palette_dynamic_tertiary20 = 2131100364;
      public static final int m3_ref_palette_dynamic_tertiary30 = 2131100365;
      public static final int m3_ref_palette_dynamic_tertiary40 = 2131100366;
      public static final int m3_ref_palette_dynamic_tertiary50 = 2131100367;
      public static final int m3_ref_palette_dynamic_tertiary60 = 2131100368;
      public static final int m3_ref_palette_dynamic_tertiary70 = 2131100369;
      public static final int m3_ref_palette_dynamic_tertiary80 = 2131100370;
      public static final int m3_ref_palette_dynamic_tertiary90 = 2131100371;
      public static final int m3_ref_palette_dynamic_tertiary95 = 2131100372;
      public static final int m3_ref_palette_dynamic_tertiary99 = 2131100373;
      public static final int m3_ref_palette_error0 = 2131100374;
      public static final int m3_ref_palette_error10 = 2131100375;
      public static final int m3_ref_palette_error100 = 2131100376;
      public static final int m3_ref_palette_error20 = 2131100377;
      public static final int m3_ref_palette_error30 = 2131100378;
      public static final int m3_ref_palette_error40 = 2131100379;
      public static final int m3_ref_palette_error50 = 2131100380;
      public static final int m3_ref_palette_error60 = 2131100381;
      public static final int m3_ref_palette_error70 = 2131100382;
      public static final int m3_ref_palette_error80 = 2131100383;
      public static final int m3_ref_palette_error90 = 2131100384;
      public static final int m3_ref_palette_error95 = 2131100385;
      public static final int m3_ref_palette_error99 = 2131100386;
      public static final int m3_ref_palette_neutral0 = 2131100387;
      public static final int m3_ref_palette_neutral10 = 2131100388;
      public static final int m3_ref_palette_neutral100 = 2131100389;
      public static final int m3_ref_palette_neutral12 = 2131100390;
      public static final int m3_ref_palette_neutral17 = 2131100391;
      public static final int m3_ref_palette_neutral20 = 2131100392;
      public static final int m3_ref_palette_neutral22 = 2131100393;
      public static final int m3_ref_palette_neutral24 = 2131100394;
      public static final int m3_ref_palette_neutral30 = 2131100395;
      public static final int m3_ref_palette_neutral4 = 2131100396;
      public static final int m3_ref_palette_neutral40 = 2131100397;
      public static final int m3_ref_palette_neutral50 = 2131100398;
      public static final int m3_ref_palette_neutral6 = 2131100399;
      public static final int m3_ref_palette_neutral60 = 2131100400;
      public static final int m3_ref_palette_neutral70 = 2131100401;
      public static final int m3_ref_palette_neutral80 = 2131100402;
      public static final int m3_ref_palette_neutral87 = 2131100403;
      public static final int m3_ref_palette_neutral90 = 2131100404;
      public static final int m3_ref_palette_neutral92 = 2131100405;
      public static final int m3_ref_palette_neutral94 = 2131100406;
      public static final int m3_ref_palette_neutral95 = 2131100407;
      public static final int m3_ref_palette_neutral96 = 2131100408;
      public static final int m3_ref_palette_neutral98 = 2131100409;
      public static final int m3_ref_palette_neutral99 = 2131100410;
      public static final int m3_ref_palette_neutral_variant0 = 2131100411;
      public static final int m3_ref_palette_neutral_variant10 = 2131100412;
      public static final int m3_ref_palette_neutral_variant100 = 2131100413;
      public static final int m3_ref_palette_neutral_variant20 = 2131100414;
      public static final int m3_ref_palette_neutral_variant30 = 2131100415;
      public static final int m3_ref_palette_neutral_variant40 = 2131100416;
      public static final int m3_ref_palette_neutral_variant50 = 2131100417;
      public static final int m3_ref_palette_neutral_variant60 = 2131100418;
      public static final int m3_ref_palette_neutral_variant70 = 2131100419;
      public static final int m3_ref_palette_neutral_variant80 = 2131100420;
      public static final int m3_ref_palette_neutral_variant90 = 2131100421;
      public static final int m3_ref_palette_neutral_variant95 = 2131100422;
      public static final int m3_ref_palette_neutral_variant99 = 2131100423;
      public static final int m3_ref_palette_primary0 = 2131100424;
      public static final int m3_ref_palette_primary10 = 2131100425;
      public static final int m3_ref_palette_primary100 = 2131100426;
      public static final int m3_ref_palette_primary20 = 2131100427;
      public static final int m3_ref_palette_primary30 = 2131100428;
      public static final int m3_ref_palette_primary40 = 2131100429;
      public static final int m3_ref_palette_primary50 = 2131100430;
      public static final int m3_ref_palette_primary60 = 2131100431;
      public static final int m3_ref_palette_primary70 = 2131100432;
      public static final int m3_ref_palette_primary80 = 2131100433;
      public static final int m3_ref_palette_primary90 = 2131100434;
      public static final int m3_ref_palette_primary95 = 2131100435;
      public static final int m3_ref_palette_primary99 = 2131100436;
      public static final int m3_ref_palette_secondary0 = 2131100437;
      public static final int m3_ref_palette_secondary10 = 2131100438;
      public static final int m3_ref_palette_secondary100 = 2131100439;
      public static final int m3_ref_palette_secondary20 = 2131100440;
      public static final int m3_ref_palette_secondary30 = 2131100441;
      public static final int m3_ref_palette_secondary40 = 2131100442;
      public static final int m3_ref_palette_secondary50 = 2131100443;
      public static final int m3_ref_palette_secondary60 = 2131100444;
      public static final int m3_ref_palette_secondary70 = 2131100445;
      public static final int m3_ref_palette_secondary80 = 2131100446;
      public static final int m3_ref_palette_secondary90 = 2131100447;
      public static final int m3_ref_palette_secondary95 = 2131100448;
      public static final int m3_ref_palette_secondary99 = 2131100449;
      public static final int m3_ref_palette_tertiary0 = 2131100450;
      public static final int m3_ref_palette_tertiary10 = 2131100451;
      public static final int m3_ref_palette_tertiary100 = 2131100452;
      public static final int m3_ref_palette_tertiary20 = 2131100453;
      public static final int m3_ref_palette_tertiary30 = 2131100454;
      public static final int m3_ref_palette_tertiary40 = 2131100455;
      public static final int m3_ref_palette_tertiary50 = 2131100456;
      public static final int m3_ref_palette_tertiary60 = 2131100457;
      public static final int m3_ref_palette_tertiary70 = 2131100458;
      public static final int m3_ref_palette_tertiary80 = 2131100459;
      public static final int m3_ref_palette_tertiary90 = 2131100460;
      public static final int m3_ref_palette_tertiary95 = 2131100461;
      public static final int m3_ref_palette_tertiary99 = 2131100462;
      public static final int m3_ref_palette_white = 2131100463;
      public static final int m3_selection_control_ripple_color_selector = 2131100464;
      public static final int m3_simple_item_ripple_color = 2131100465;
      public static final int m3_slider_active_track_color = 2131100466;
      public static final int m3_slider_halo_color = 2131100467;
      public static final int m3_slider_inactive_track_color = 2131100468;
      public static final int m3_slider_thumb_color = 2131100469;
      public static final int m3_switch_thumb_tint = 2131100470;
      public static final int m3_switch_track_tint = 2131100471;
      public static final int m3_sys_color_dark_background = 2131100472;
      public static final int m3_sys_color_dark_error = 2131100473;
      public static final int m3_sys_color_dark_error_container = 2131100474;
      public static final int m3_sys_color_dark_inverse_on_surface = 2131100475;
      public static final int m3_sys_color_dark_inverse_primary = 2131100476;
      public static final int m3_sys_color_dark_inverse_surface = 2131100477;
      public static final int m3_sys_color_dark_on_background = 2131100478;
      public static final int m3_sys_color_dark_on_error = 2131100479;
      public static final int m3_sys_color_dark_on_error_container = 2131100480;
      public static final int m3_sys_color_dark_on_primary = 2131100481;
      public static final int m3_sys_color_dark_on_primary_container = 2131100482;
      public static final int m3_sys_color_dark_on_secondary = 2131100483;
      public static final int m3_sys_color_dark_on_secondary_container = 2131100484;
      public static final int m3_sys_color_dark_on_surface = 2131100485;
      public static final int m3_sys_color_dark_on_surface_variant = 2131100486;
      public static final int m3_sys_color_dark_on_tertiary = 2131100487;
      public static final int m3_sys_color_dark_on_tertiary_container = 2131100488;
      public static final int m3_sys_color_dark_outline = 2131100489;
      public static final int m3_sys_color_dark_outline_variant = 2131100490;
      public static final int m3_sys_color_dark_primary = 2131100491;
      public static final int m3_sys_color_dark_primary_container = 2131100492;
      public static final int m3_sys_color_dark_secondary = 2131100493;
      public static final int m3_sys_color_dark_secondary_container = 2131100494;
      public static final int m3_sys_color_dark_surface = 2131100495;
      public static final int m3_sys_color_dark_surface_bright = 2131100496;
      public static final int m3_sys_color_dark_surface_container = 2131100497;
      public static final int m3_sys_color_dark_surface_container_high = 2131100498;
      public static final int m3_sys_color_dark_surface_container_highest = 2131100499;
      public static final int m3_sys_color_dark_surface_container_low = 2131100500;
      public static final int m3_sys_color_dark_surface_container_lowest = 2131100501;
      public static final int m3_sys_color_dark_surface_dim = 2131100502;
      public static final int m3_sys_color_dark_surface_variant = 2131100503;
      public static final int m3_sys_color_dark_tertiary = 2131100504;
      public static final int m3_sys_color_dark_tertiary_container = 2131100505;
      public static final int m3_sys_color_dynamic_dark_background = 2131100506;
      public static final int m3_sys_color_dynamic_dark_inverse_on_surface = 2131100507;
      public static final int m3_sys_color_dynamic_dark_inverse_primary = 2131100508;
      public static final int m3_sys_color_dynamic_dark_inverse_surface = 2131100509;
      public static final int m3_sys_color_dynamic_dark_on_background = 2131100510;
      public static final int m3_sys_color_dynamic_dark_on_primary = 2131100511;
      public static final int m3_sys_color_dynamic_dark_on_primary_container = 2131100512;
      public static final int m3_sys_color_dynamic_dark_on_secondary = 2131100513;
      public static final int m3_sys_color_dynamic_dark_on_secondary_container = 2131100514;
      public static final int m3_sys_color_dynamic_dark_on_surface = 2131100515;
      public static final int m3_sys_color_dynamic_dark_on_surface_variant = 2131100516;
      public static final int m3_sys_color_dynamic_dark_on_tertiary = 2131100517;
      public static final int m3_sys_color_dynamic_dark_on_tertiary_container = 2131100518;
      public static final int m3_sys_color_dynamic_dark_outline = 2131100519;
      public static final int m3_sys_color_dynamic_dark_outline_variant = 2131100520;
      public static final int m3_sys_color_dynamic_dark_primary = 2131100521;
      public static final int m3_sys_color_dynamic_dark_primary_container = 2131100522;
      public static final int m3_sys_color_dynamic_dark_secondary = 2131100523;
      public static final int m3_sys_color_dynamic_dark_secondary_container = 2131100524;
      public static final int m3_sys_color_dynamic_dark_surface = 2131100525;
      public static final int m3_sys_color_dynamic_dark_surface_bright = 2131100526;
      public static final int m3_sys_color_dynamic_dark_surface_container = 2131100527;
      public static final int m3_sys_color_dynamic_dark_surface_container_high = 2131100528;
      public static final int m3_sys_color_dynamic_dark_surface_container_highest = 2131100529;
      public static final int m3_sys_color_dynamic_dark_surface_container_low = 2131100530;
      public static final int m3_sys_color_dynamic_dark_surface_container_lowest = 2131100531;
      public static final int m3_sys_color_dynamic_dark_surface_dim = 2131100532;
      public static final int m3_sys_color_dynamic_dark_surface_variant = 2131100533;
      public static final int m3_sys_color_dynamic_dark_tertiary = 2131100534;
      public static final int m3_sys_color_dynamic_dark_tertiary_container = 2131100535;
      public static final int m3_sys_color_dynamic_light_background = 2131100536;
      public static final int m3_sys_color_dynamic_light_inverse_on_surface = 2131100537;
      public static final int m3_sys_color_dynamic_light_inverse_primary = 2131100538;
      public static final int m3_sys_color_dynamic_light_inverse_surface = 2131100539;
      public static final int m3_sys_color_dynamic_light_on_background = 2131100540;
      public static final int m3_sys_color_dynamic_light_on_primary = 2131100541;
      public static final int m3_sys_color_dynamic_light_on_primary_container = 2131100542;
      public static final int m3_sys_color_dynamic_light_on_secondary = 2131100543;
      public static final int m3_sys_color_dynamic_light_on_secondary_container = 2131100544;
      public static final int m3_sys_color_dynamic_light_on_surface = 2131100545;
      public static final int m3_sys_color_dynamic_light_on_surface_variant = 2131100546;
      public static final int m3_sys_color_dynamic_light_on_tertiary = 2131100547;
      public static final int m3_sys_color_dynamic_light_on_tertiary_container = 2131100548;
      public static final int m3_sys_color_dynamic_light_outline = 2131100549;
      public static final int m3_sys_color_dynamic_light_outline_variant = 2131100550;
      public static final int m3_sys_color_dynamic_light_primary = 2131100551;
      public static final int m3_sys_color_dynamic_light_primary_container = 2131100552;
      public static final int m3_sys_color_dynamic_light_secondary = 2131100553;
      public static final int m3_sys_color_dynamic_light_secondary_container = 2131100554;
      public static final int m3_sys_color_dynamic_light_surface = 2131100555;
      public static final int m3_sys_color_dynamic_light_surface_bright = 2131100556;
      public static final int m3_sys_color_dynamic_light_surface_container = 2131100557;
      public static final int m3_sys_color_dynamic_light_surface_container_high = 2131100558;
      public static final int m3_sys_color_dynamic_light_surface_container_highest = 2131100559;
      public static final int m3_sys_color_dynamic_light_surface_container_low = 2131100560;
      public static final int m3_sys_color_dynamic_light_surface_container_lowest = 2131100561;
      public static final int m3_sys_color_dynamic_light_surface_dim = 2131100562;
      public static final int m3_sys_color_dynamic_light_surface_variant = 2131100563;
      public static final int m3_sys_color_dynamic_light_tertiary = 2131100564;
      public static final int m3_sys_color_dynamic_light_tertiary_container = 2131100565;
      public static final int m3_sys_color_dynamic_on_primary_fixed = 2131100566;
      public static final int m3_sys_color_dynamic_on_primary_fixed_variant = 2131100567;
      public static final int m3_sys_color_dynamic_on_secondary_fixed = 2131100568;
      public static final int m3_sys_color_dynamic_on_secondary_fixed_variant = 2131100569;
      public static final int m3_sys_color_dynamic_on_tertiary_fixed = 2131100570;
      public static final int m3_sys_color_dynamic_on_tertiary_fixed_variant = 2131100571;
      public static final int m3_sys_color_dynamic_primary_fixed = 2131100572;
      public static final int m3_sys_color_dynamic_primary_fixed_dim = 2131100573;
      public static final int m3_sys_color_dynamic_secondary_fixed = 2131100574;
      public static final int m3_sys_color_dynamic_secondary_fixed_dim = 2131100575;
      public static final int m3_sys_color_dynamic_tertiary_fixed = 2131100576;
      public static final int m3_sys_color_dynamic_tertiary_fixed_dim = 2131100577;
      public static final int m3_sys_color_light_background = 2131100578;
      public static final int m3_sys_color_light_error = 2131100579;
      public static final int m3_sys_color_light_error_container = 2131100580;
      public static final int m3_sys_color_light_inverse_on_surface = 2131100581;
      public static final int m3_sys_color_light_inverse_primary = 2131100582;
      public static final int m3_sys_color_light_inverse_surface = 2131100583;
      public static final int m3_sys_color_light_on_background = 2131100584;
      public static final int m3_sys_color_light_on_error = 2131100585;
      public static final int m3_sys_color_light_on_error_container = 2131100586;
      public static final int m3_sys_color_light_on_primary = 2131100587;
      public static final int m3_sys_color_light_on_primary_container = 2131100588;
      public static final int m3_sys_color_light_on_secondary = 2131100589;
      public static final int m3_sys_color_light_on_secondary_container = 2131100590;
      public static final int m3_sys_color_light_on_surface = 2131100591;
      public static final int m3_sys_color_light_on_surface_variant = 2131100592;
      public static final int m3_sys_color_light_on_tertiary = 2131100593;
      public static final int m3_sys_color_light_on_tertiary_container = 2131100594;
      public static final int m3_sys_color_light_outline = 2131100595;
      public static final int m3_sys_color_light_outline_variant = 2131100596;
      public static final int m3_sys_color_light_primary = 2131100597;
      public static final int m3_sys_color_light_primary_container = 2131100598;
      public static final int m3_sys_color_light_secondary = 2131100599;
      public static final int m3_sys_color_light_secondary_container = 2131100600;
      public static final int m3_sys_color_light_surface = 2131100601;
      public static final int m3_sys_color_light_surface_bright = 2131100602;
      public static final int m3_sys_color_light_surface_container = 2131100603;
      public static final int m3_sys_color_light_surface_container_high = 2131100604;
      public static final int m3_sys_color_light_surface_container_highest = 2131100605;
      public static final int m3_sys_color_light_surface_container_low = 2131100606;
      public static final int m3_sys_color_light_surface_container_lowest = 2131100607;
      public static final int m3_sys_color_light_surface_dim = 2131100608;
      public static final int m3_sys_color_light_surface_variant = 2131100609;
      public static final int m3_sys_color_light_tertiary = 2131100610;
      public static final int m3_sys_color_light_tertiary_container = 2131100611;
      public static final int m3_sys_color_on_primary_fixed = 2131100612;
      public static final int m3_sys_color_on_primary_fixed_variant = 2131100613;
      public static final int m3_sys_color_on_secondary_fixed = 2131100614;
      public static final int m3_sys_color_on_secondary_fixed_variant = 2131100615;
      public static final int m3_sys_color_on_tertiary_fixed = 2131100616;
      public static final int m3_sys_color_on_tertiary_fixed_variant = 2131100617;
      public static final int m3_sys_color_primary_fixed = 2131100618;
      public static final int m3_sys_color_primary_fixed_dim = 2131100619;
      public static final int m3_sys_color_secondary_fixed = 2131100620;
      public static final int m3_sys_color_secondary_fixed_dim = 2131100621;
      public static final int m3_sys_color_tertiary_fixed = 2131100622;
      public static final int m3_sys_color_tertiary_fixed_dim = 2131100623;
      public static final int m3_tabs_icon_color = 2131100624;
      public static final int m3_tabs_icon_color_secondary = 2131100625;
      public static final int m3_tabs_ripple_color = 2131100626;
      public static final int m3_tabs_ripple_color_secondary = 2131100627;
      public static final int m3_tabs_text_color = 2131100628;
      public static final int m3_tabs_text_color_secondary = 2131100629;
      public static final int m3_text_button_background_color_selector = 2131100630;
      public static final int m3_text_button_foreground_color_selector = 2131100631;
      public static final int m3_text_button_ripple_color_selector = 2131100632;
      public static final int m3_textfield_filled_background_color = 2131100633;
      public static final int m3_textfield_indicator_text_color = 2131100634;
      public static final int m3_textfield_input_text_color = 2131100635;
      public static final int m3_textfield_label_color = 2131100636;
      public static final int m3_textfield_stroke_color = 2131100637;
      public static final int m3_timepicker_button_background_color = 2131100638;
      public static final int m3_timepicker_button_ripple_color = 2131100639;
      public static final int m3_timepicker_button_text_color = 2131100640;
      public static final int m3_timepicker_clock_text_color = 2131100641;
      public static final int m3_timepicker_display_background_color = 2131100642;
      public static final int m3_timepicker_display_ripple_color = 2131100643;
      public static final int m3_timepicker_display_text_color = 2131100644;
      public static final int m3_timepicker_secondary_text_button_ripple_color = 2131100645;
      public static final int m3_timepicker_secondary_text_button_text_color = 2131100646;
      public static final int m3_timepicker_time_input_stroke_color = 2131100647;
      public static final int m3_tonal_button_ripple_color_selector = 2131100648;
      public static final int manga_background = 2131100649;
      public static final int material_blue_grey_800 = 2131100650;
      public static final int material_blue_grey_900 = 2131100651;
      public static final int material_blue_grey_950 = 2131100652;
      public static final int material_cursor_color = 2131100653;
      public static final int material_deep_teal_200 = 2131100654;
      public static final int material_deep_teal_500 = 2131100655;
      public static final int material_divider_color = 2131100656;
      public static final int material_dynamic_neutral0 = 2131100657;
      public static final int material_dynamic_neutral10 = 2131100658;
      public static final int material_dynamic_neutral100 = 2131100659;
      public static final int material_dynamic_neutral20 = 2131100660;
      public static final int material_dynamic_neutral30 = 2131100661;
      public static final int material_dynamic_neutral40 = 2131100662;
      public static final int material_dynamic_neutral50 = 2131100663;
      public static final int material_dynamic_neutral60 = 2131100664;
      public static final int material_dynamic_neutral70 = 2131100665;
      public static final int material_dynamic_neutral80 = 2131100666;
      public static final int material_dynamic_neutral90 = 2131100667;
      public static final int material_dynamic_neutral95 = 2131100668;
      public static final int material_dynamic_neutral99 = 2131100669;
      public static final int material_dynamic_neutral_variant0 = 2131100670;
      public static final int material_dynamic_neutral_variant10 = 2131100671;
      public static final int material_dynamic_neutral_variant100 = 2131100672;
      public static final int material_dynamic_neutral_variant20 = 2131100673;
      public static final int material_dynamic_neutral_variant30 = 2131100674;
      public static final int material_dynamic_neutral_variant40 = 2131100675;
      public static final int material_dynamic_neutral_variant50 = 2131100676;
      public static final int material_dynamic_neutral_variant60 = 2131100677;
      public static final int material_dynamic_neutral_variant70 = 2131100678;
      public static final int material_dynamic_neutral_variant80 = 2131100679;
      public static final int material_dynamic_neutral_variant90 = 2131100680;
      public static final int material_dynamic_neutral_variant95 = 2131100681;
      public static final int material_dynamic_neutral_variant99 = 2131100682;
      public static final int material_dynamic_primary0 = 2131100683;
      public static final int material_dynamic_primary10 = 2131100684;
      public static final int material_dynamic_primary100 = 2131100685;
      public static final int material_dynamic_primary20 = 2131100686;
      public static final int material_dynamic_primary30 = 2131100687;
      public static final int material_dynamic_primary40 = 2131100688;
      public static final int material_dynamic_primary50 = 2131100689;
      public static final int material_dynamic_primary60 = 2131100690;
      public static final int material_dynamic_primary70 = 2131100691;
      public static final int material_dynamic_primary80 = 2131100692;
      public static final int material_dynamic_primary90 = 2131100693;
      public static final int material_dynamic_primary95 = 2131100694;
      public static final int material_dynamic_primary99 = 2131100695;
      public static final int material_dynamic_secondary0 = 2131100696;
      public static final int material_dynamic_secondary10 = 2131100697;
      public static final int material_dynamic_secondary100 = 2131100698;
      public static final int material_dynamic_secondary20 = 2131100699;
      public static final int material_dynamic_secondary30 = 2131100700;
      public static final int material_dynamic_secondary40 = 2131100701;
      public static final int material_dynamic_secondary50 = 2131100702;
      public static final int material_dynamic_secondary60 = 2131100703;
      public static final int material_dynamic_secondary70 = 2131100704;
      public static final int material_dynamic_secondary80 = 2131100705;
      public static final int material_dynamic_secondary90 = 2131100706;
      public static final int material_dynamic_secondary95 = 2131100707;
      public static final int material_dynamic_secondary99 = 2131100708;
      public static final int material_dynamic_tertiary0 = 2131100709;
      public static final int material_dynamic_tertiary10 = 2131100710;
      public static final int material_dynamic_tertiary100 = 2131100711;
      public static final int material_dynamic_tertiary20 = 2131100712;
      public static final int material_dynamic_tertiary30 = 2131100713;
      public static final int material_dynamic_tertiary40 = 2131100714;
      public static final int material_dynamic_tertiary50 = 2131100715;
      public static final int material_dynamic_tertiary60 = 2131100716;
      public static final int material_dynamic_tertiary70 = 2131100717;
      public static final int material_dynamic_tertiary80 = 2131100718;
      public static final int material_dynamic_tertiary90 = 2131100719;
      public static final int material_dynamic_tertiary95 = 2131100720;
      public static final int material_dynamic_tertiary99 = 2131100721;
      public static final int material_grey_100 = 2131100722;
      public static final int material_grey_300 = 2131100723;
      public static final int material_grey_50 = 2131100724;
      public static final int material_grey_600 = 2131100725;
      public static final int material_grey_800 = 2131100726;
      public static final int material_grey_850 = 2131100727;
      public static final int material_grey_900 = 2131100728;
      public static final int material_harmonized_color_error = 2131100729;
      public static final int material_harmonized_color_error_container = 2131100730;
      public static final int material_harmonized_color_on_error = 2131100731;
      public static final int material_harmonized_color_on_error_container = 2131100732;
      public static final int material_on_background_disabled = 2131100733;
      public static final int material_on_background_emphasis_high_type = 2131100734;
      public static final int material_on_background_emphasis_medium = 2131100735;
      public static final int material_on_primary_disabled = 2131100736;
      public static final int material_on_primary_emphasis_high_type = 2131100737;
      public static final int material_on_primary_emphasis_medium = 2131100738;
      public static final int material_on_surface_disabled = 2131100739;
      public static final int material_on_surface_emphasis_high_type = 2131100740;
      public static final int material_on_surface_emphasis_medium = 2131100741;
      public static final int material_on_surface_stroke = 2131100742;
      public static final int material_personalized__highlighted_text = 2131100743;
      public static final int material_personalized__highlighted_text_inverse = 2131100744;
      public static final int material_personalized_color_background = 2131100745;
      public static final int material_personalized_color_control_activated = 2131100746;
      public static final int material_personalized_color_control_highlight = 2131100747;
      public static final int material_personalized_color_control_normal = 2131100748;
      public static final int material_personalized_color_error = 2131100749;
      public static final int material_personalized_color_error_container = 2131100750;
      public static final int material_personalized_color_on_background = 2131100751;
      public static final int material_personalized_color_on_error = 2131100752;
      public static final int material_personalized_color_on_error_container = 2131100753;
      public static final int material_personalized_color_on_primary = 2131100754;
      public static final int material_personalized_color_on_primary_container = 2131100755;
      public static final int material_personalized_color_on_secondary = 2131100756;
      public static final int material_personalized_color_on_secondary_container = 2131100757;
      public static final int material_personalized_color_on_surface = 2131100758;
      public static final int material_personalized_color_on_surface_inverse = 2131100759;
      public static final int material_personalized_color_on_surface_variant = 2131100760;
      public static final int material_personalized_color_on_tertiary = 2131100761;
      public static final int material_personalized_color_on_tertiary_container = 2131100762;
      public static final int material_personalized_color_outline = 2131100763;
      public static final int material_personalized_color_outline_variant = 2131100764;
      public static final int material_personalized_color_primary = 2131100765;
      public static final int material_personalized_color_primary_container = 2131100766;
      public static final int material_personalized_color_primary_inverse = 2131100767;
      public static final int material_personalized_color_primary_text = 2131100768;
      public static final int material_personalized_color_primary_text_inverse = 2131100769;
      public static final int material_personalized_color_secondary = 2131100770;
      public static final int material_personalized_color_secondary_container = 2131100771;
      public static final int material_personalized_color_secondary_text = 2131100772;
      public static final int material_personalized_color_secondary_text_inverse = 2131100773;
      public static final int material_personalized_color_surface = 2131100774;
      public static final int material_personalized_color_surface_bright = 2131100775;
      public static final int material_personalized_color_surface_container = 2131100776;
      public static final int material_personalized_color_surface_container_high = 2131100777;
      public static final int material_personalized_color_surface_container_highest = 2131100778;
      public static final int material_personalized_color_surface_container_low = 2131100779;
      public static final int material_personalized_color_surface_container_lowest = 2131100780;
      public static final int material_personalized_color_surface_dim = 2131100781;
      public static final int material_personalized_color_surface_inverse = 2131100782;
      public static final int material_personalized_color_surface_variant = 2131100783;
      public static final int material_personalized_color_tertiary = 2131100784;
      public static final int material_personalized_color_tertiary_container = 2131100785;
      public static final int material_personalized_color_text_hint_foreground_inverse = 2131100786;
      public static final int material_personalized_color_text_primary_inverse = 2131100787;
      public static final int material_personalized_color_text_primary_inverse_disable_only = 2131100788;
      public static final int material_personalized_color_text_secondary_and_tertiary_inverse = 2131100789;
      public static final int material_personalized_color_text_secondary_and_tertiary_inverse_disabled = 2131100790;
      public static final int material_personalized_hint_foreground = 2131100791;
      public static final int material_personalized_hint_foreground_inverse = 2131100792;
      public static final int material_personalized_primary_inverse_text_disable_only = 2131100793;
      public static final int material_personalized_primary_text_disable_only = 2131100794;
      public static final int material_slider_active_tick_marks_color = 2131100795;
      public static final int material_slider_active_track_color = 2131100796;
      public static final int material_slider_halo_color = 2131100797;
      public static final int material_slider_inactive_tick_marks_color = 2131100798;
      public static final int material_slider_inactive_track_color = 2131100799;
      public static final int material_slider_thumb_color = 2131100800;
      public static final int material_timepicker_button_background = 2131100801;
      public static final int material_timepicker_button_stroke = 2131100802;
      public static final int material_timepicker_clock_text_color = 2131100803;
      public static final int material_timepicker_clockface = 2131100804;
      public static final int material_timepicker_modebutton_tint = 2131100805;
      public static final int matte_dark_background = 2131100806;
      public static final int matte_light_background = 2131100807;
      public static final int mention_background_dark = 2131100808;
      public static final int mention_background_darker = 2131100809;
      public static final int mention_background_light = 2131100810;
      public static final int mention_background_midnight = 2131100811;
      public static final int message_divider_dark = 2131100812;
      public static final int message_divider_light = 2131100813;
      public static final int midnight_prism_background = 2131100814;
      public static final int mtrl_btn_bg_color_selector = 2131100815;
      public static final int mtrl_btn_ripple_color = 2131100816;
      public static final int mtrl_btn_stroke_color_selector = 2131100817;
      public static final int mtrl_btn_text_btn_bg_color_selector = 2131100818;
      public static final int mtrl_btn_text_btn_ripple_color = 2131100819;
      public static final int mtrl_btn_text_color_disabled = 2131100820;
      public static final int mtrl_btn_text_color_selector = 2131100821;
      public static final int mtrl_btn_transparent_bg_color = 2131100822;
      public static final int mtrl_calendar_item_stroke_color = 2131100823;
      public static final int mtrl_calendar_selected_range = 2131100824;
      public static final int mtrl_card_view_foreground = 2131100825;
      public static final int mtrl_card_view_ripple = 2131100826;
      public static final int mtrl_chip_background_color = 2131100827;
      public static final int mtrl_chip_close_icon_tint = 2131100828;
      public static final int mtrl_chip_surface_color = 2131100829;
      public static final int mtrl_chip_text_color = 2131100830;
      public static final int mtrl_choice_chip_background_color = 2131100831;
      public static final int mtrl_choice_chip_ripple_color = 2131100832;
      public static final int mtrl_choice_chip_text_color = 2131100833;
      public static final int mtrl_error = 2131100834;
      public static final int mtrl_fab_bg_color_selector = 2131100835;
      public static final int mtrl_fab_icon_text_color_selector = 2131100836;
      public static final int mtrl_fab_ripple_color = 2131100837;
      public static final int mtrl_filled_background_color = 2131100838;
      public static final int mtrl_filled_icon_tint = 2131100839;
      public static final int mtrl_filled_stroke_color = 2131100840;
      public static final int mtrl_indicator_text_color = 2131100841;
      public static final int mtrl_navigation_bar_colored_item_tint = 2131100842;
      public static final int mtrl_navigation_bar_colored_ripple_color = 2131100843;
      public static final int mtrl_navigation_bar_item_tint = 2131100844;
      public static final int mtrl_navigation_bar_ripple_color = 2131100845;
      public static final int mtrl_navigation_item_background_color = 2131100846;
      public static final int mtrl_navigation_item_icon_tint = 2131100847;
      public static final int mtrl_navigation_item_text_color = 2131100848;
      public static final int mtrl_on_primary_text_btn_text_color_selector = 2131100849;
      public static final int mtrl_on_surface_ripple_color = 2131100850;
      public static final int mtrl_outlined_icon_tint = 2131100851;
      public static final int mtrl_outlined_stroke_color = 2131100852;
      public static final int mtrl_popupmenu_overlay_color = 2131100853;
      public static final int mtrl_scrim_color = 2131100854;
      public static final int mtrl_switch_thumb_icon_tint = 2131100855;
      public static final int mtrl_switch_thumb_tint = 2131100856;
      public static final int mtrl_switch_track_decoration_tint = 2131100857;
      public static final int mtrl_switch_track_tint = 2131100858;
      public static final int mtrl_tabs_colored_ripple_color = 2131100859;
      public static final int mtrl_tabs_icon_color_selector = 2131100860;
      public static final int mtrl_tabs_icon_color_selector_colored = 2131100861;
      public static final int mtrl_tabs_legacy_text_color_selector = 2131100862;
      public static final int mtrl_tabs_ripple_color = 2131100863;
      public static final int mtrl_text_btn_text_color_selector = 2131100864;
      public static final int mtrl_textinput_default_box_stroke_color = 2131100865;
      public static final int mtrl_textinput_disabled_color = 2131100866;
      public static final int mtrl_textinput_filled_box_default_background_color = 2131100867;
      public static final int mtrl_textinput_focused_box_stroke_color = 2131100868;
      public static final int mtrl_textinput_hovered_box_stroke_color = 2131100869;
      public static final int mushroom_background = 2131100870;
      public static final int notification_action_color_filter = 2131100871;
      public static final int notification_icon_bg_color = 2131100872;
      public static final int notification_material_background_media_default_color = 2131100873;
      public static final int orange = 2131100874;
      public static final int orange_100 = 2131100875;
      public static final int orange_130 = 2131100876;
      public static final int orange_160 = 2131100877;
      public static final int orange_200 = 2131100878;
      public static final int orange_230 = 2131100879;
      public static final int orange_260 = 2131100880;
      public static final int orange_300 = 2131100881;
      public static final int orange_330 = 2131100882;
      public static final int orange_345 = 2131100883;
      public static final int orange_360 = 2131100884;
      public static final int orange_400 = 2131100885;
      public static final int orange_430 = 2131100886;
      public static final int orange_460 = 2131100887;
      public static final int orange_500 = 2131100888;
      public static final int orange_530 = 2131100889;
      public static final int orange_560 = 2131100890;
      public static final int orange_600 = 2131100891;
      public static final int orange_630 = 2131100892;
      public static final int orange_660 = 2131100893;
      public static final int orange_700 = 2131100894;
      public static final int orange_730 = 2131100895;
      public static final int orange_760 = 2131100896;
      public static final int orange_800 = 2131100897;
      public static final int orange_830 = 2131100898;
      public static final int orange_860 = 2131100899;
      public static final int orange_900 = 2131100900;
      public static final int partner = 2131100901;
      public static final int pastel_background = 2131100902;
      public static final int paypal = 2131100903;
      public static final int pirate_background = 2131100904;
      public static final int playstation = 2131100905;
      public static final int plum_0 = 2131100906;
      public static final int plum_1 = 2131100907;
      public static final int plum_10 = 2131100908;
      public static final int plum_11 = 2131100909;
      public static final int plum_12 = 2131100910;
      public static final int plum_13 = 2131100911;
      public static final int plum_14 = 2131100912;
      public static final int plum_15 = 2131100913;
      public static final int plum_16 = 2131100914;
      public static final int plum_17 = 2131100915;
      public static final int plum_18 = 2131100916;
      public static final int plum_19 = 2131100917;
      public static final int plum_2 = 2131100918;
      public static final int plum_20 = 2131100919;
      public static final int plum_21 = 2131100920;
      public static final int plum_22 = 2131100921;
      public static final int plum_23 = 2131100922;
      public static final int plum_23_alpha = 2131100923;
      public static final int plum_24 = 2131100924;
      public static final int plum_25 = 2131100925;
      public static final int plum_26 = 2131100926;
      public static final int plum_3 = 2131100927;
      public static final int plum_4 = 2131100928;
      public static final int plum_5 = 2131100929;
      public static final int plum_6 = 2131100930;
      public static final int plum_7 = 2131100931;
      public static final int plum_8 = 2131100932;
      public static final int plum_9 = 2131100933;
      public static final int polls_victor_fill_dark = 2131100934;
      public static final int polls_victor_fill_darker = 2131100935;
      public static final int polls_victor_fill_light = 2131100936;
      public static final int polls_victor_fill_midnight = 2131100937;
      public static final int polls_voted_fill_dark = 2131100938;
      public static final int polls_voted_fill_darker = 2131100939;
      public static final int polls_voted_fill_light = 2131100940;
      public static final int polls_voted_fill_midnight = 2131100941;
      public static final int premium_nitro_pink_dark = 2131100942;
      public static final int premium_nitro_pink_light = 2131100943;
      public static final int premium_perk_blue = 2131100944;
      public static final int premium_perk_blue_alt = 2131100945;
      public static final int premium_perk_dark_blue = 2131100946;
      public static final int premium_perk_gold = 2131100947;
      public static final int premium_perk_green = 2131100948;
      public static final int premium_perk_light_blue = 2131100949;
      public static final int premium_perk_orange = 2131100950;
      public static final int premium_perk_pink = 2131100951;
      public static final int premium_perk_purple = 2131100952;
      public static final int premium_perk_yellow = 2131100953;
      public static final int premium_tier_0_blue = 2131100954;
      public static final int premium_tier_0_blue_for_gradients = 2131100955;
      public static final int premium_tier_0_blue_for_gradients_2 = 2131100956;
      public static final int premium_tier_0_header_gradient_1 = 2131100957;
      public static final int premium_tier_0_header_gradient_2 = 2131100958;
      public static final int premium_tier_0_header_gradient_3 = 2131100959;
      public static final int premium_tier_0_header_gradient_4 = 2131100960;
      public static final int premium_tier_0_header_gradient_5 = 2131100961;
      public static final int premium_tier_0_purple = 2131100962;
      public static final int premium_tier_0_purple_for_gradients = 2131100963;
      public static final int premium_tier_1_blue = 2131100964;
      public static final int premium_tier_1_blue_for_gradients = 2131100965;
      public static final int premium_tier_1_dark_blue_for_gradients = 2131100966;
      public static final int premium_tier_1_purple = 2131100967;
      public static final int premium_tier_2_pink = 2131100968;
      public static final int premium_tier_2_pink_for_gradients = 2131100969;
      public static final int premium_tier_2_pink_for_gradients_2 = 2131100970;
      public static final int premium_tier_2_purple = 2131100971;
      public static final int premium_tier_2_purple_for_gradients = 2131100972;
      public static final int premium_tier_2_purple_for_gradients_2 = 2131100973;
      public static final int primary = 2131100974;
      public static final int primary_100 = 2131100975;
      public static final int primary_130 = 2131100976;
      public static final int primary_160 = 2131100977;
      public static final int primary_200 = 2131100978;
      public static final int primary_230 = 2131100979;
      public static final int primary_260 = 2131100980;
      public static final int primary_300 = 2131100981;
      public static final int primary_330 = 2131100982;
      public static final int primary_345 = 2131100983;
      public static final int primary_360 = 2131100984;
      public static final int primary_400 = 2131100985;
      public static final int primary_430 = 2131100986;
      public static final int primary_460 = 2131100987;
      public static final int primary_500 = 2131100988;
      public static final int primary_530 = 2131100989;
      public static final int primary_560 = 2131100990;
      public static final int primary_600 = 2131100991;
      public static final int primary_630 = 2131100992;
      public static final int primary_645 = 2131100993;
      public static final int primary_660 = 2131100994;
      public static final int primary_700 = 2131100995;
      public static final int primary_730 = 2131100996;
      public static final int primary_760 = 2131100997;
      public static final int primary_800 = 2131100998;
      public static final int primary_830 = 2131100999;
      public static final int primary_860 = 2131101000;
      public static final int primary_900 = 2131101001;
      public static final int primary_dark_500_alpha_20 = 2131101002;
      public static final int primary_dark_700_alpha_60 = 2131101003;
      public static final int primary_dark_material_dark = 2131101004;
      public static final int primary_dark_material_light = 2131101005;
      public static final int primary_light_500_alpha_20 = 2131101006;
      public static final int primary_material_dark = 2131101007;
      public static final int primary_material_light = 2131101008;
      public static final int primary_text_default_material_dark = 2131101009;
      public static final int primary_text_default_material_light = 2131101010;
      public static final int primary_text_disabled_material_dark = 2131101011;
      public static final int primary_text_disabled_material_light = 2131101012;
      public static final int profile_gradient_card_background_dark = 2131101013;
      public static final int profile_gradient_card_background_darker = 2131101014;
      public static final int profile_gradient_card_background_light = 2131101015;
      public static final int profile_gradient_card_background_midnight = 2131101016;
      public static final int profile_gradient_message_input_border_dark = 2131101017;
      public static final int profile_gradient_message_input_border_darker = 2131101018;
      public static final int profile_gradient_message_input_border_light = 2131101019;
      public static final int profile_gradient_message_input_border_midnight = 2131101020;
      public static final int profile_gradient_note_background_dark = 2131101021;
      public static final int profile_gradient_note_background_darker = 2131101022;
      public static final int profile_gradient_note_background_light = 2131101023;
      public static final int profile_gradient_note_background_midnight = 2131101024;
      public static final int profile_gradient_overlay_dark = 2131101025;
      public static final int profile_gradient_overlay_darker = 2131101026;
      public static final int profile_gradient_overlay_light = 2131101027;
      public static final int profile_gradient_overlay_midnight = 2131101028;
      public static final int profile_gradient_overlay_synced_with_user_theme_dark = 2131101029;
      public static final int profile_gradient_overlay_synced_with_user_theme_darker = 2131101030;
      public static final int profile_gradient_overlay_synced_with_user_theme_light = 2131101031;
      public static final int profile_gradient_overlay_synced_with_user_theme_midnight = 2131101032;
      public static final int profile_gradient_profile_body_background_hover_dark = 2131101033;
      public static final int profile_gradient_profile_body_background_hover_darker = 2131101034;
      public static final int profile_gradient_profile_body_background_hover_light = 2131101035;
      public static final int profile_gradient_profile_body_background_hover_midnight = 2131101036;
      public static final int profile_gradient_role_pill_background_dark = 2131101037;
      public static final int profile_gradient_role_pill_background_darker = 2131101038;
      public static final int profile_gradient_role_pill_background_light = 2131101039;
      public static final int profile_gradient_role_pill_background_midnight = 2131101040;
      public static final int profile_gradient_role_pill_border_dark = 2131101041;
      public static final int profile_gradient_role_pill_border_darker = 2131101042;
      public static final int profile_gradient_role_pill_border_light = 2131101043;
      public static final int profile_gradient_role_pill_border_midnight = 2131101044;
      public static final int profile_gradient_section_box_dark = 2131101045;
      public static final int profile_gradient_section_box_darker = 2131101046;
      public static final int profile_gradient_section_box_light = 2131101047;
      public static final int profile_gradient_section_box_midnight = 2131101048;
      public static final int red = 2131101049;
      public static final int red_100 = 2131101050;
      public static final int red_130 = 2131101051;
      public static final int red_160 = 2131101052;
      public static final int red_200 = 2131101053;
      public static final int red_230 = 2131101054;
      public static final int red_260 = 2131101055;
      public static final int red_300 = 2131101056;
      public static final int red_330 = 2131101057;
      public static final int red_345 = 2131101058;
      public static final int red_360 = 2131101059;
      public static final int red_400 = 2131101060;
      public static final int red_430 = 2131101061;
      public static final int red_460 = 2131101062;
      public static final int red_500 = 2131101063;
      public static final int red_530 = 2131101064;
      public static final int red_560 = 2131101065;
      public static final int red_600 = 2131101066;
      public static final int red_630 = 2131101067;
      public static final int red_660 = 2131101068;
      public static final int red_700 = 2131101069;
      public static final int red_730 = 2131101070;
      public static final int red_760 = 2131101071;
      public static final int red_800 = 2131101072;
      public static final int red_830 = 2131101073;
      public static final int red_860 = 2131101074;
      public static final int red_900 = 2131101075;
      public static final int reddit = 2131101076;
      public static final int redesign_activity_card_border_dark = 2131101077;
      public static final int redesign_activity_card_border_darker = 2131101078;
      public static final int redesign_activity_card_border_light = 2131101079;
      public static final int redesign_activity_card_border_midnight = 2131101080;
      public static final int redesign_button_overlay_alpha_background_dark = 2131101081;
      public static final int redesign_button_overlay_alpha_background_darker = 2131101082;
      public static final int redesign_button_overlay_alpha_background_light = 2131101083;
      public static final int redesign_button_overlay_alpha_background_midnight = 2131101084;
      public static final int redesign_button_overlay_alpha_pressed_background_dark = 2131101085;
      public static final int redesign_button_overlay_alpha_pressed_background_darker = 2131101086;
      public static final int redesign_button_overlay_alpha_pressed_background_light = 2131101087;
      public static final int redesign_button_overlay_alpha_pressed_background_midnight = 2131101088;
      public static final int redesign_button_primary_alt_background_dark = 2131101089;
      public static final int redesign_button_primary_alt_background_darker = 2131101090;
      public static final int redesign_button_primary_alt_background_light = 2131101091;
      public static final int redesign_button_primary_alt_background_midnight = 2131101092;
      public static final int redesign_button_primary_alt_on_blurple_background_dark = 2131101093;
      public static final int redesign_button_primary_alt_on_blurple_background_darker = 2131101094;
      public static final int redesign_button_primary_alt_on_blurple_background_light = 2131101095;
      public static final int redesign_button_primary_alt_on_blurple_background_midnight = 2131101096;
      public static final int redesign_button_primary_alt_pressed_background_dark = 2131101097;
      public static final int redesign_button_primary_alt_pressed_background_darker = 2131101098;
      public static final int redesign_button_primary_alt_pressed_background_light = 2131101099;
      public static final int redesign_button_primary_alt_pressed_background_midnight = 2131101100;
      public static final int redesign_button_primary_alt_pressed_border_dark = 2131101101;
      public static final int redesign_button_primary_alt_pressed_border_darker = 2131101102;
      public static final int redesign_button_primary_alt_pressed_border_midnight = 2131101103;
      public static final int redesign_button_secondary_border_dark = 2131101104;
      public static final int redesign_button_secondary_border_darker = 2131101105;
      public static final int redesign_button_secondary_border_light = 2131101106;
      public static final int redesign_button_secondary_border_midnight = 2131101107;
      public static final int redesign_button_secondary_overlay_background_dark = 2131101108;
      public static final int redesign_button_secondary_overlay_background_darker = 2131101109;
      public static final int redesign_button_secondary_overlay_background_light = 2131101110;
      public static final int redesign_button_secondary_overlay_background_midnight = 2131101111;
      public static final int redesign_button_secondary_overlay_pressed_background_dark = 2131101112;
      public static final int redesign_button_secondary_overlay_pressed_background_darker = 2131101113;
      public static final int redesign_button_secondary_overlay_pressed_background_light = 2131101114;
      public static final int redesign_button_secondary_overlay_pressed_background_midnight = 2131101115;
      public static final int redesign_button_secondary_pressed_border_dark = 2131101116;
      public static final int redesign_button_secondary_pressed_border_darker = 2131101117;
      public static final int redesign_button_secondary_pressed_border_light = 2131101118;
      public static final int redesign_button_secondary_pressed_border_midnight = 2131101119;
      public static final int redesign_button_selected_background_dark = 2131101120;
      public static final int redesign_button_selected_background_darker = 2131101121;
      public static final int redesign_button_selected_background_light = 2131101122;
      public static final int redesign_button_selected_background_midnight = 2131101123;
      public static final int redesign_button_selected_pressed_background_dark = 2131101124;
      public static final int redesign_button_selected_pressed_background_darker = 2131101125;
      public static final int redesign_button_selected_pressed_background_light = 2131101126;
      public static final int redesign_button_selected_pressed_background_midnight = 2131101127;
      public static final int redesign_button_tertiary_background_darker = 2131101128;
      public static final int redesign_button_tertiary_background_light = 2131101129;
      public static final int redesign_button_tertiary_background_midnight = 2131101130;
      public static final int redesign_button_tertiary_pressed_background_darker = 2131101131;
      public static final int redesign_button_tertiary_pressed_background_light = 2131101132;
      public static final int redesign_button_tertiary_pressed_background_midnight = 2131101133;
      public static final int redesign_chat_input_background_darker = 2131101134;
      public static final int redesign_chat_input_background_light = 2131101135;
      public static final int redesign_chat_input_background_midnight = 2131101136;
      public static final int redesign_image_button_pressed_background_dark = 2131101137;
      public static final int redesign_image_button_pressed_background_darker = 2131101138;
      public static final int redesign_image_button_pressed_background_light = 2131101139;
      public static final int redesign_image_button_pressed_background_midnight = 2131101140;
      public static final int riot_games = 2131101141;
      public static final int ripple_material_dark = 2131101142;
      public static final int ripple_material_light = 2131101143;
      public static final int role_blue = 2131101144;
      public static final int role_brown = 2131101145;
      public static final int role_burgundy = 2131101146;
      public static final int role_dark_blue = 2131101147;
      public static final int role_dark_grey = 2131101148;
      public static final int role_dark_purple = 2131101149;
      public static final int role_dark_teal = 2131101150;
      public static final int role_default = 2131101151;
      public static final int role_green = 2131101152;
      public static final int role_grey = 2131101153;
      public static final int role_light_blue = 2131101154;
      public static final int role_light_green = 2131101155;
      public static final int role_light_grey = 2131101156;
      public static final int role_magenta = 2131101157;
      public static final int role_orange = 2131101158;
      public static final int role_purple = 2131101159;
      public static final int role_salmon = 2131101160;
      public static final int role_sky_blue = 2131101161;
      public static final int role_tan = 2131101162;
      public static final int role_teal = 2131101163;
      public static final int role_terracotta = 2131101164;
      public static final int role_yellow = 2131101165;
      public static final int samsung = 2131101166;
      public static final int scrollbar_thin_thumb_light = 2131101167;
      public static final int scrollbar_thin_track_dark = 2131101168;
      public static final int scrollbar_thin_track_darker = 2131101169;
      public static final int scrollbar_thin_track_light = 2131101170;
      public static final int scrollbar_thin_track_midnight = 2131101171;
      public static final int secondary_text_default_material_dark = 2131101172;
      public static final int secondary_text_default_material_light = 2131101173;
      public static final int secondary_text_disabled_material_dark = 2131101174;
      public static final int secondary_text_disabled_material_light = 2131101175;
      public static final int skype = 2131101176;
      public static final int spoiler_revealed_background_darker = 2131101177;
      public static final int spoiler_revealed_background_midnight = 2131101178;
      public static final int spotify = 2131101179;
      public static final int status_green_500_alpha_20 = 2131101180;
      public static final int status_red_500_alpha_20 = 2131101181;
      public static final int steam = 2131101182;
      public static final int sunset_background = 2131101183;
      public static final int switch_thumb_disabled_material_dark = 2131101184;
      public static final int switch_thumb_disabled_material_light = 2131101185;
      public static final int switch_thumb_material_dark = 2131101186;
      public static final int switch_thumb_material_light = 2131101187;
      public static final int switch_thumb_normal_material_dark = 2131101188;
      public static final int switch_thumb_normal_material_light = 2131101189;
      public static final int teal = 2131101190;
      public static final int teal_100 = 2131101191;
      public static final int teal_130 = 2131101192;
      public static final int teal_160 = 2131101193;
      public static final int teal_200 = 2131101194;
      public static final int teal_230 = 2131101195;
      public static final int teal_260 = 2131101196;
      public static final int teal_300 = 2131101197;
      public static final int teal_330 = 2131101198;
      public static final int teal_345 = 2131101199;
      public static final int teal_360 = 2131101200;
      public static final int teal_400 = 2131101201;
      public static final int teal_430 = 2131101202;
      public static final int teal_460 = 2131101203;
      public static final int teal_500 = 2131101204;
      public static final int teal_530 = 2131101205;
      public static final int teal_560 = 2131101206;
      public static final int teal_600 = 2131101207;
      public static final int teal_630 = 2131101208;
      public static final int teal_660 = 2131101209;
      public static final int teal_700 = 2131101210;
      public static final int teal_730 = 2131101211;
      public static final int teal_760 = 2131101212;
      public static final int teal_800 = 2131101213;
      public static final int teal_830 = 2131101214;
      public static final int teal_860 = 2131101215;
      public static final int teal_900 = 2131101216;
      public static final int theme_locked_blur_fallback_dark = 2131101217;
      public static final int theme_locked_blur_fallback_darker = 2131101218;
      public static final int theme_locked_blur_fallback_light = 2131101219;
      public static final int theme_locked_blur_fallback_midnight = 2131101220;
      public static final int tooltip_background_dark = 2131101221;
      public static final int tooltip_background_light = 2131101222;
      public static final int transparent = 2131101223;
      public static final int twitch = 2131101224;
      public static final int twitter = 2131101225;
      public static final int ucrop_color_active_aspect_ratio = 2131101226;
      public static final int ucrop_color_active_controls_color = 2131101227;
      public static final int ucrop_color_black = 2131101228;
      public static final int ucrop_color_blaze_orange = 2131101229;
      public static final int ucrop_color_crop_background = 2131101230;
      public static final int ucrop_color_default_crop_frame = 2131101231;
      public static final int ucrop_color_default_crop_grid = 2131101232;
      public static final int ucrop_color_default_dimmed = 2131101233;
      public static final int ucrop_color_default_logo = 2131101234;
      public static final int ucrop_color_ebony_clay = 2131101235;
      public static final int ucrop_color_heather = 2131101236;
      public static final int ucrop_color_inactive_aspect_ratio = 2131101237;
      public static final int ucrop_color_inactive_controls_color = 2131101238;
      public static final int ucrop_color_progress_wheel_line = 2131101239;
      public static final int ucrop_color_statusbar = 2131101240;
      public static final int ucrop_color_toolbar = 2131101241;
      public static final int ucrop_color_toolbar_widget = 2131101242;
      public static final int ucrop_color_white = 2131101243;
      public static final int ucrop_color_widget = 2131101244;
      public static final int ucrop_color_widget_active = 2131101245;
      public static final int ucrop_color_widget_background = 2131101246;
      public static final int ucrop_color_widget_rotate_angle = 2131101247;
      public static final int ucrop_color_widget_rotate_mid_line = 2131101248;
      public static final int ucrop_color_widget_text = 2131101249;
      public static final int ucrop_scale_text_view_selector = 2131101250;
      public static final int user_profile_header_overflow_background_dark = 2131101251;
      public static final int user_profile_header_overflow_background_darker = 2131101252;
      public static final int user_profile_header_overflow_background_light = 2131101253;
      public static final int user_profile_header_overflow_background_midnight = 2131101254;
      public static final int voice_video_video_tile_background_dark = 2131101255;
      public static final int voice_video_video_tile_background_darker = 2131101256;
      public static final int voice_video_video_tile_background_light = 2131101257;
      public static final int voice_video_video_tile_background_midnight = 2131101258;
      public static final int voice_video_video_tile_blur_fallback_dark = 2131101259;
      public static final int voice_video_video_tile_blur_fallback_darker = 2131101260;
      public static final int voice_video_video_tile_blur_fallback_light = 2131101261;
      public static final int voice_video_video_tile_blur_fallback_midnight = 2131101262;
      public static final int white = 2131101263;
      public static final int white_100 = 2131101264;
      public static final int white_130 = 2131101265;
      public static final int white_160 = 2131101266;
      public static final int white_200 = 2131101267;
      public static final int white_230 = 2131101268;
      public static final int white_260 = 2131101269;
      public static final int white_300 = 2131101270;
      public static final int white_330 = 2131101271;
      public static final int white_345 = 2131101272;
      public static final int white_360 = 2131101273;
      public static final int white_400 = 2131101274;
      public static final int white_430 = 2131101275;
      public static final int white_460 = 2131101276;
      public static final int white_500 = 2131101277;
      public static final int white_530 = 2131101278;
      public static final int white_560 = 2131101279;
      public static final int white_600 = 2131101280;
      public static final int white_630 = 2131101281;
      public static final int white_660 = 2131101282;
      public static final int white_700 = 2131101283;
      public static final int white_730 = 2131101284;
      public static final int white_760 = 2131101285;
      public static final int white_800 = 2131101286;
      public static final int white_830 = 2131101287;
      public static final int white_860 = 2131101288;
      public static final int white_900 = 2131101289;
      public static final int xbox = 2131101290;
      public static final int y2k_background = 2131101291;
      public static final int yellow = 2131101292;
      public static final int yellow_100 = 2131101293;
      public static final int yellow_130 = 2131101294;
      public static final int yellow_160 = 2131101295;
      public static final int yellow_200 = 2131101296;
      public static final int yellow_230 = 2131101297;
      public static final int yellow_260 = 2131101298;
      public static final int yellow_300 = 2131101299;
      public static final int yellow_330 = 2131101300;
      public static final int yellow_345 = 2131101301;
      public static final int yellow_360 = 2131101302;
      public static final int yellow_400 = 2131101303;
      public static final int yellow_430 = 2131101304;
      public static final int yellow_460 = 2131101305;
      public static final int yellow_500 = 2131101306;
      public static final int yellow_530 = 2131101307;
      public static final int yellow_560 = 2131101308;
      public static final int yellow_600 = 2131101309;
      public static final int yellow_630 = 2131101310;
      public static final int yellow_660 = 2131101311;
      public static final int yellow_700 = 2131101312;
      public static final int yellow_730 = 2131101313;
      public static final int yellow_760 = 2131101314;
      public static final int yellow_800 = 2131101315;
      public static final int yellow_830 = 2131101316;
      public static final int yellow_860 = 2131101317;
      public static final int yellow_900 = 2131101318;
      public static final int youtube = 2131101319;

      private color() {
      }
   }

   public static final class dimen {
      public static final int abc_action_bar_content_inset_material = 2131165184;
      public static final int abc_action_bar_content_inset_with_nav = 2131165185;
      public static final int abc_action_bar_default_height_material = 2131165186;
      public static final int abc_action_bar_default_padding_end_material = 2131165187;
      public static final int abc_action_bar_default_padding_start_material = 2131165188;
      public static final int abc_action_bar_elevation_material = 2131165189;
      public static final int abc_action_bar_icon_vertical_padding_material = 2131165190;
      public static final int abc_action_bar_overflow_padding_end_material = 2131165191;
      public static final int abc_action_bar_overflow_padding_start_material = 2131165192;
      public static final int abc_action_bar_stacked_max_height = 2131165193;
      public static final int abc_action_bar_stacked_tab_max_width = 2131165194;
      public static final int abc_action_bar_subtitle_bottom_margin_material = 2131165195;
      public static final int abc_action_bar_subtitle_top_margin_material = 2131165196;
      public static final int abc_action_button_min_height_material = 2131165197;
      public static final int abc_action_button_min_width_material = 2131165198;
      public static final int abc_action_button_min_width_overflow_material = 2131165199;
      public static final int abc_alert_dialog_button_bar_height = 2131165200;
      public static final int abc_alert_dialog_button_dimen = 2131165201;
      public static final int abc_button_inset_horizontal_material = 2131165202;
      public static final int abc_button_inset_vertical_material = 2131165203;
      public static final int abc_button_padding_horizontal_material = 2131165204;
      public static final int abc_button_padding_vertical_material = 2131165205;
      public static final int abc_cascading_menus_min_smallest_width = 2131165206;
      public static final int abc_config_prefDialogWidth = 2131165207;
      public static final int abc_control_corner_material = 2131165208;
      public static final int abc_control_inset_material = 2131165209;
      public static final int abc_control_padding_material = 2131165210;
      public static final int abc_dialog_corner_radius_material = 2131165211;
      public static final int abc_dialog_fixed_height_major = 2131165212;
      public static final int abc_dialog_fixed_height_minor = 2131165213;
      public static final int abc_dialog_fixed_width_major = 2131165214;
      public static final int abc_dialog_fixed_width_minor = 2131165215;
      public static final int abc_dialog_list_padding_bottom_no_buttons = 2131165216;
      public static final int abc_dialog_list_padding_top_no_title = 2131165217;
      public static final int abc_dialog_min_width_major = 2131165218;
      public static final int abc_dialog_min_width_minor = 2131165219;
      public static final int abc_dialog_padding_material = 2131165220;
      public static final int abc_dialog_padding_top_material = 2131165221;
      public static final int abc_dialog_title_divider_material = 2131165222;
      public static final int abc_disabled_alpha_material_dark = 2131165223;
      public static final int abc_disabled_alpha_material_light = 2131165224;
      public static final int abc_dropdownitem_icon_width = 2131165225;
      public static final int abc_dropdownitem_text_padding_left = 2131165226;
      public static final int abc_dropdownitem_text_padding_right = 2131165227;
      public static final int abc_edit_text_inset_bottom_material = 2131165228;
      public static final int abc_edit_text_inset_horizontal_material = 2131165229;
      public static final int abc_edit_text_inset_top_material = 2131165230;
      public static final int abc_floating_window_z = 2131165231;
      public static final int abc_list_item_height_large_material = 2131165232;
      public static final int abc_list_item_height_material = 2131165233;
      public static final int abc_list_item_height_small_material = 2131165234;
      public static final int abc_list_item_padding_horizontal_material = 2131165235;
      public static final int abc_panel_menu_list_width = 2131165236;
      public static final int abc_progress_bar_height_material = 2131165237;
      public static final int abc_search_view_preferred_height = 2131165238;
      public static final int abc_search_view_preferred_width = 2131165239;
      public static final int abc_seekbar_track_background_height_material = 2131165240;
      public static final int abc_seekbar_track_progress_height_material = 2131165241;
      public static final int abc_select_dialog_padding_start_material = 2131165242;
      public static final int abc_star_big = 2131165243;
      public static final int abc_star_medium = 2131165244;
      public static final int abc_star_small = 2131165245;
      public static final int abc_switch_padding = 2131165246;
      public static final int abc_text_size_body_1_material = 2131165247;
      public static final int abc_text_size_body_2_material = 2131165248;
      public static final int abc_text_size_button_material = 2131165249;
      public static final int abc_text_size_caption_material = 2131165250;
      public static final int abc_text_size_display_1_material = 2131165251;
      public static final int abc_text_size_display_2_material = 2131165252;
      public static final int abc_text_size_display_3_material = 2131165253;
      public static final int abc_text_size_display_4_material = 2131165254;
      public static final int abc_text_size_headline_material = 2131165255;
      public static final int abc_text_size_large_material = 2131165256;
      public static final int abc_text_size_medium_material = 2131165257;
      public static final int abc_text_size_menu_header_material = 2131165258;
      public static final int abc_text_size_menu_material = 2131165259;
      public static final int abc_text_size_small_material = 2131165260;
      public static final int abc_text_size_subhead_material = 2131165261;
      public static final int abc_text_size_subtitle_material_toolbar = 2131165262;
      public static final int abc_text_size_title_material = 2131165263;
      public static final int abc_text_size_title_material_toolbar = 2131165264;
      public static final int appcompat_dialog_background_inset = 2131165265;
      public static final int autofill_inline_suggestion_icon_size = 2131165266;
      public static final int browser_actions_context_menu_max_width = 2131165267;
      public static final int browser_actions_context_menu_min_padding = 2131165268;
      public static final int bubble_size_default = 2131165269;
      public static final int cardview_compat_inset_shadow = 2131165270;
      public static final int cardview_default_elevation = 2131165271;
      public static final int cardview_default_radius = 2131165272;
      public static final int clock_face_margin_start = 2131165273;
      public static final int compat_button_inset_horizontal_material = 2131165274;
      public static final int compat_button_inset_vertical_material = 2131165275;
      public static final int compat_button_padding_horizontal_material = 2131165276;
      public static final int compat_button_padding_vertical_material = 2131165277;
      public static final int compat_control_corner_material = 2131165278;
      public static final int compat_notification_large_icon_max_height = 2131165279;
      public static final int compat_notification_large_icon_max_width = 2131165280;
      public static final int def_drawer_elevation = 2131165281;
      public static final int design_appbar_elevation = 2131165282;
      public static final int design_bottom_navigation_active_item_max_width = 2131165283;
      public static final int design_bottom_navigation_active_item_min_width = 2131165284;
      public static final int design_bottom_navigation_active_text_size = 2131165285;
      public static final int design_bottom_navigation_elevation = 2131165286;
      public static final int design_bottom_navigation_height = 2131165287;
      public static final int design_bottom_navigation_icon_size = 2131165288;
      public static final int design_bottom_navigation_item_max_width = 2131165289;
      public static final int design_bottom_navigation_item_min_width = 2131165290;
      public static final int design_bottom_navigation_label_padding = 2131165291;
      public static final int design_bottom_navigation_margin = 2131165292;
      public static final int design_bottom_navigation_shadow_height = 2131165293;
      public static final int design_bottom_navigation_text_size = 2131165294;
      public static final int design_bottom_sheet_elevation = 2131165295;
      public static final int design_bottom_sheet_modal_elevation = 2131165296;
      public static final int design_bottom_sheet_peek_height_min = 2131165297;
      public static final int design_fab_border_width = 2131165298;
      public static final int design_fab_elevation = 2131165299;
      public static final int design_fab_image_size = 2131165300;
      public static final int design_fab_size_mini = 2131165301;
      public static final int design_fab_size_normal = 2131165302;
      public static final int design_fab_translation_z_hovered_focused = 2131165303;
      public static final int design_fab_translation_z_pressed = 2131165304;
      public static final int design_navigation_elevation = 2131165305;
      public static final int design_navigation_icon_padding = 2131165306;
      public static final int design_navigation_icon_size = 2131165307;
      public static final int design_navigation_item_horizontal_padding = 2131165308;
      public static final int design_navigation_item_icon_padding = 2131165309;
      public static final int design_navigation_item_vertical_padding = 2131165310;
      public static final int design_navigation_max_width = 2131165311;
      public static final int design_navigation_padding_bottom = 2131165312;
      public static final int design_navigation_separator_vertical_padding = 2131165313;
      public static final int design_snackbar_action_inline_max_width = 2131165314;
      public static final int design_snackbar_action_text_color_alpha = 2131165315;
      public static final int design_snackbar_background_corner_radius = 2131165316;
      public static final int design_snackbar_elevation = 2131165317;
      public static final int design_snackbar_extra_spacing_horizontal = 2131165318;
      public static final int design_snackbar_max_width = 2131165319;
      public static final int design_snackbar_min_width = 2131165320;
      public static final int design_snackbar_padding_horizontal = 2131165321;
      public static final int design_snackbar_padding_vertical = 2131165322;
      public static final int design_snackbar_padding_vertical_2lines = 2131165323;
      public static final int design_snackbar_text_size = 2131165324;
      public static final int design_tab_max_width = 2131165325;
      public static final int design_tab_scrollable_min_width = 2131165326;
      public static final int design_tab_text_size = 2131165327;
      public static final int design_tab_text_size_2line = 2131165328;
      public static final int design_textinput_caption_translate_y = 2131165329;
      public static final int disabled_alpha_material_dark = 2131165330;
      public static final int disabled_alpha_material_light = 2131165331;
      public static final int exo_error_message_height = 2131165332;
      public static final int exo_error_message_margin_bottom = 2131165333;
      public static final int exo_error_message_text_padding_horizontal = 2131165334;
      public static final int exo_error_message_text_padding_vertical = 2131165335;
      public static final int exo_error_message_text_size = 2131165336;
      public static final int exo_icon_horizontal_margin = 2131165337;
      public static final int exo_icon_padding = 2131165338;
      public static final int exo_icon_padding_bottom = 2131165339;
      public static final int exo_icon_size = 2131165340;
      public static final int exo_icon_text_size = 2131165341;
      public static final int exo_media_button_height = 2131165342;
      public static final int exo_media_button_width = 2131165343;
      public static final int exo_setting_width = 2131165344;
      public static final int exo_settings_height = 2131165345;
      public static final int exo_settings_icon_size = 2131165346;
      public static final int exo_settings_main_text_size = 2131165347;
      public static final int exo_settings_offset = 2131165348;
      public static final int exo_settings_sub_text_size = 2131165349;
      public static final int exo_settings_text_height = 2131165350;
      public static final int exo_small_icon_height = 2131165351;
      public static final int exo_small_icon_horizontal_margin = 2131165352;
      public static final int exo_small_icon_padding_horizontal = 2131165353;
      public static final int exo_small_icon_padding_vertical = 2131165354;
      public static final int exo_small_icon_width = 2131165355;
      public static final int exo_styled_bottom_bar_height = 2131165356;
      public static final int exo_styled_bottom_bar_margin_top = 2131165357;
      public static final int exo_styled_bottom_bar_time_padding = 2131165358;
      public static final int exo_styled_controls_padding = 2131165359;
      public static final int exo_styled_minimal_controls_margin_bottom = 2131165360;
      public static final int exo_styled_progress_bar_height = 2131165361;
      public static final int exo_styled_progress_dragged_thumb_size = 2131165362;
      public static final int exo_styled_progress_enabled_thumb_size = 2131165363;
      public static final int exo_styled_progress_layout_height = 2131165364;
      public static final int exo_styled_progress_margin_bottom = 2131165365;
      public static final int exo_styled_progress_touch_target_height = 2131165366;
      public static final int fastscroll_default_thickness = 2131165367;
      public static final int fastscroll_margin = 2131165368;
      public static final int fastscroll_minimum_range = 2131165369;
      public static final int highlight_alpha_material_colored = 2131165370;
      public static final int highlight_alpha_material_dark = 2131165371;
      public static final int highlight_alpha_material_light = 2131165372;
      public static final int hint_alpha_material_dark = 2131165373;
      public static final int hint_alpha_material_light = 2131165374;
      public static final int hint_pressed_alpha_material_dark = 2131165375;
      public static final int hint_pressed_alpha_material_light = 2131165376;
      public static final int item_touch_helper_max_drag_scroll_per_frame = 2131165377;
      public static final int item_touch_helper_swipe_escape_max_velocity = 2131165378;
      public static final int item_touch_helper_swipe_escape_velocity = 2131165379;
      public static final int m3_alert_dialog_action_bottom_padding = 2131165380;
      public static final int m3_alert_dialog_action_top_padding = 2131165381;
      public static final int m3_alert_dialog_corner_size = 2131165382;
      public static final int m3_alert_dialog_elevation = 2131165383;
      public static final int m3_alert_dialog_icon_margin = 2131165384;
      public static final int m3_alert_dialog_icon_size = 2131165385;
      public static final int m3_alert_dialog_title_bottom_margin = 2131165386;
      public static final int m3_appbar_expanded_title_margin_bottom = 2131165387;
      public static final int m3_appbar_expanded_title_margin_horizontal = 2131165388;
      public static final int m3_appbar_scrim_height_trigger = 2131165389;
      public static final int m3_appbar_scrim_height_trigger_large = 2131165390;
      public static final int m3_appbar_scrim_height_trigger_medium = 2131165391;
      public static final int m3_appbar_size_compact = 2131165392;
      public static final int m3_appbar_size_large = 2131165393;
      public static final int m3_appbar_size_medium = 2131165394;
      public static final int m3_badge_horizontal_offset = 2131165395;
      public static final int m3_badge_offset = 2131165396;
      public static final int m3_badge_size = 2131165397;
      public static final int m3_badge_vertical_offset = 2131165398;
      public static final int m3_badge_with_text_horizontal_offset = 2131165399;
      public static final int m3_badge_with_text_offset = 2131165400;
      public static final int m3_badge_with_text_size = 2131165401;
      public static final int m3_badge_with_text_vertical_offset = 2131165402;
      public static final int m3_bottom_nav_item_active_indicator_height = 2131165403;
      public static final int m3_bottom_nav_item_active_indicator_margin_horizontal = 2131165404;
      public static final int m3_bottom_nav_item_active_indicator_width = 2131165405;
      public static final int m3_bottom_nav_item_padding_bottom = 2131165406;
      public static final int m3_bottom_nav_item_padding_top = 2131165407;
      public static final int m3_bottom_nav_min_height = 2131165408;
      public static final int m3_bottom_sheet_drag_handle_bottom_padding = 2131165409;
      public static final int m3_bottom_sheet_elevation = 2131165410;
      public static final int m3_bottom_sheet_modal_elevation = 2131165411;
      public static final int m3_bottomappbar_fab_cradle_margin = 2131165412;
      public static final int m3_bottomappbar_fab_cradle_rounded_corner_radius = 2131165413;
      public static final int m3_bottomappbar_fab_cradle_vertical_offset = 2131165414;
      public static final int m3_bottomappbar_fab_end_margin = 2131165415;
      public static final int m3_bottomappbar_height = 2131165416;
      public static final int m3_bottomappbar_horizontal_padding = 2131165417;
      public static final int m3_btn_dialog_btn_min_width = 2131165418;
      public static final int m3_btn_dialog_btn_spacing = 2131165419;
      public static final int m3_btn_disabled_elevation = 2131165420;
      public static final int m3_btn_disabled_translation_z = 2131165421;
      public static final int m3_btn_elevated_btn_elevation = 2131165422;
      public static final int m3_btn_elevation = 2131165423;
      public static final int m3_btn_icon_btn_padding_left = 2131165424;
      public static final int m3_btn_icon_btn_padding_right = 2131165425;
      public static final int m3_btn_icon_only_default_padding = 2131165426;
      public static final int m3_btn_icon_only_default_size = 2131165427;
      public static final int m3_btn_icon_only_icon_padding = 2131165428;
      public static final int m3_btn_icon_only_min_width = 2131165429;
      public static final int m3_btn_inset = 2131165430;
      public static final int m3_btn_max_width = 2131165431;
      public static final int m3_btn_padding_bottom = 2131165432;
      public static final int m3_btn_padding_left = 2131165433;
      public static final int m3_btn_padding_right = 2131165434;
      public static final int m3_btn_padding_top = 2131165435;
      public static final int m3_btn_stroke_size = 2131165436;
      public static final int m3_btn_text_btn_icon_padding_left = 2131165437;
      public static final int m3_btn_text_btn_icon_padding_right = 2131165438;
      public static final int m3_btn_text_btn_padding_left = 2131165439;
      public static final int m3_btn_text_btn_padding_right = 2131165440;
      public static final int m3_btn_translation_z_base = 2131165441;
      public static final int m3_btn_translation_z_hovered = 2131165442;
      public static final int m3_card_disabled_z = 2131165443;
      public static final int m3_card_dragged_z = 2131165444;
      public static final int m3_card_elevated_disabled_z = 2131165445;
      public static final int m3_card_elevated_dragged_z = 2131165446;
      public static final int m3_card_elevated_elevation = 2131165447;
      public static final int m3_card_elevated_hovered_z = 2131165448;
      public static final int m3_card_elevation = 2131165449;
      public static final int m3_card_hovered_z = 2131165450;
      public static final int m3_card_stroke_width = 2131165451;
      public static final int m3_carousel_debug_keyline_width = 2131165452;
      public static final int m3_carousel_extra_small_item_size = 2131165453;
      public static final int m3_carousel_gone_size = 2131165454;
      public static final int m3_carousel_small_item_default_corner_size = 2131165455;
      public static final int m3_carousel_small_item_size_max = 2131165456;
      public static final int m3_carousel_small_item_size_min = 2131165457;
      public static final int m3_chip_checked_hovered_translation_z = 2131165458;
      public static final int m3_chip_corner_size = 2131165459;
      public static final int m3_chip_disabled_translation_z = 2131165460;
      public static final int m3_chip_dragged_translation_z = 2131165461;
      public static final int m3_chip_elevated_elevation = 2131165462;
      public static final int m3_chip_hovered_translation_z = 2131165463;
      public static final int m3_chip_icon_size = 2131165464;
      public static final int m3_comp_assist_chip_container_height = 2131165465;
      public static final int m3_comp_assist_chip_elevated_container_elevation = 2131165466;
      public static final int m3_comp_assist_chip_flat_container_elevation = 2131165467;
      public static final int m3_comp_assist_chip_flat_outline_width = 2131165468;
      public static final int m3_comp_assist_chip_with_icon_icon_size = 2131165469;
      public static final int m3_comp_badge_large_size = 2131165470;
      public static final int m3_comp_badge_size = 2131165471;
      public static final int m3_comp_bottom_app_bar_container_elevation = 2131165472;
      public static final int m3_comp_bottom_app_bar_container_height = 2131165473;
      public static final int m3_comp_checkbox_selected_disabled_container_opacity = 2131165474;
      public static final int m3_comp_circular_progress_indicator_active_indicator_width = 2131165475;
      public static final int m3_comp_divider_thickness = 2131165476;
      public static final int m3_comp_elevated_button_container_elevation = 2131165477;
      public static final int m3_comp_elevated_button_disabled_container_elevation = 2131165478;
      public static final int m3_comp_elevated_card_container_elevation = 2131165479;
      public static final int m3_comp_elevated_card_icon_size = 2131165480;
      public static final int m3_comp_extended_fab_primary_container_elevation = 2131165481;
      public static final int m3_comp_extended_fab_primary_container_height = 2131165482;
      public static final int m3_comp_extended_fab_primary_focus_container_elevation = 2131165483;
      public static final int m3_comp_extended_fab_primary_focus_state_layer_opacity = 2131165484;
      public static final int m3_comp_extended_fab_primary_hover_container_elevation = 2131165485;
      public static final int m3_comp_extended_fab_primary_hover_state_layer_opacity = 2131165486;
      public static final int m3_comp_extended_fab_primary_icon_size = 2131165487;
      public static final int m3_comp_extended_fab_primary_pressed_container_elevation = 2131165488;
      public static final int m3_comp_extended_fab_primary_pressed_state_layer_opacity = 2131165489;
      public static final int m3_comp_fab_primary_container_elevation = 2131165490;
      public static final int m3_comp_fab_primary_container_height = 2131165491;
      public static final int m3_comp_fab_primary_focus_state_layer_opacity = 2131165492;
      public static final int m3_comp_fab_primary_hover_container_elevation = 2131165493;
      public static final int m3_comp_fab_primary_hover_state_layer_opacity = 2131165494;
      public static final int m3_comp_fab_primary_icon_size = 2131165495;
      public static final int m3_comp_fab_primary_large_container_height = 2131165496;
      public static final int m3_comp_fab_primary_large_icon_size = 2131165497;
      public static final int m3_comp_fab_primary_pressed_container_elevation = 2131165498;
      public static final int m3_comp_fab_primary_pressed_state_layer_opacity = 2131165499;
      public static final int m3_comp_fab_primary_small_container_height = 2131165500;
      public static final int m3_comp_fab_primary_small_icon_size = 2131165501;
      public static final int m3_comp_filled_autocomplete_menu_container_elevation = 2131165502;
      public static final int m3_comp_filled_button_container_elevation = 2131165503;
      public static final int m3_comp_filled_button_with_icon_icon_size = 2131165504;
      public static final int m3_comp_filled_card_container_elevation = 2131165505;
      public static final int m3_comp_filled_card_dragged_state_layer_opacity = 2131165506;
      public static final int m3_comp_filled_card_focus_state_layer_opacity = 2131165507;
      public static final int m3_comp_filled_card_hover_state_layer_opacity = 2131165508;
      public static final int m3_comp_filled_card_icon_size = 2131165509;
      public static final int m3_comp_filled_card_pressed_state_layer_opacity = 2131165510;
      public static final int m3_comp_filled_text_field_disabled_active_indicator_opacity = 2131165511;
      public static final int m3_comp_filter_chip_container_height = 2131165512;
      public static final int m3_comp_filter_chip_elevated_container_elevation = 2131165513;
      public static final int m3_comp_filter_chip_flat_container_elevation = 2131165514;
      public static final int m3_comp_filter_chip_flat_unselected_outline_width = 2131165515;
      public static final int m3_comp_filter_chip_with_icon_icon_size = 2131165516;
      public static final int m3_comp_input_chip_container_elevation = 2131165517;
      public static final int m3_comp_input_chip_container_height = 2131165518;
      public static final int m3_comp_input_chip_unselected_outline_width = 2131165519;
      public static final int m3_comp_input_chip_with_avatar_avatar_size = 2131165520;
      public static final int m3_comp_input_chip_with_leading_icon_leading_icon_size = 2131165521;
      public static final int m3_comp_linear_progress_indicator_active_indicator_height = 2131165522;
      public static final int m3_comp_menu_container_elevation = 2131165523;
      public static final int m3_comp_navigation_bar_active_indicator_height = 2131165524;
      public static final int m3_comp_navigation_bar_active_indicator_width = 2131165525;
      public static final int m3_comp_navigation_bar_container_elevation = 2131165526;
      public static final int m3_comp_navigation_bar_container_height = 2131165527;
      public static final int m3_comp_navigation_bar_focus_state_layer_opacity = 2131165528;
      public static final int m3_comp_navigation_bar_hover_state_layer_opacity = 2131165529;
      public static final int m3_comp_navigation_bar_icon_size = 2131165530;
      public static final int m3_comp_navigation_bar_pressed_state_layer_opacity = 2131165531;
      public static final int m3_comp_navigation_drawer_container_width = 2131165532;
      public static final int m3_comp_navigation_drawer_focus_state_layer_opacity = 2131165533;
      public static final int m3_comp_navigation_drawer_hover_state_layer_opacity = 2131165534;
      public static final int m3_comp_navigation_drawer_icon_size = 2131165535;
      public static final int m3_comp_navigation_drawer_modal_container_elevation = 2131165536;
      public static final int m3_comp_navigation_drawer_pressed_state_layer_opacity = 2131165537;
      public static final int m3_comp_navigation_drawer_standard_container_elevation = 2131165538;
      public static final int m3_comp_navigation_rail_active_indicator_height = 2131165539;
      public static final int m3_comp_navigation_rail_active_indicator_width = 2131165540;
      public static final int m3_comp_navigation_rail_container_elevation = 2131165541;
      public static final int m3_comp_navigation_rail_container_width = 2131165542;
      public static final int m3_comp_navigation_rail_icon_size = 2131165543;
      public static final int m3_comp_outlined_autocomplete_menu_container_elevation = 2131165544;
      public static final int m3_comp_outlined_button_disabled_outline_opacity = 2131165545;
      public static final int m3_comp_outlined_button_outline_width = 2131165546;
      public static final int m3_comp_outlined_card_container_elevation = 2131165547;
      public static final int m3_comp_outlined_card_disabled_outline_opacity = 2131165548;
      public static final int m3_comp_outlined_card_icon_size = 2131165549;
      public static final int m3_comp_outlined_card_outline_width = 2131165550;
      public static final int m3_comp_outlined_icon_button_unselected_outline_width = 2131165551;
      public static final int m3_comp_outlined_text_field_disabled_input_text_opacity = 2131165552;
      public static final int m3_comp_outlined_text_field_disabled_label_text_opacity = 2131165553;
      public static final int m3_comp_outlined_text_field_disabled_supporting_text_opacity = 2131165554;
      public static final int m3_comp_outlined_text_field_focus_outline_width = 2131165555;
      public static final int m3_comp_outlined_text_field_outline_width = 2131165556;
      public static final int m3_comp_primary_navigation_tab_active_focus_state_layer_opacity = 2131165557;
      public static final int m3_comp_primary_navigation_tab_active_hover_state_layer_opacity = 2131165558;
      public static final int m3_comp_primary_navigation_tab_active_indicator_height = 2131165559;
      public static final int m3_comp_primary_navigation_tab_active_pressed_state_layer_opacity = 2131165560;
      public static final int m3_comp_primary_navigation_tab_divider_height = 2131165561;
      public static final int m3_comp_primary_navigation_tab_inactive_focus_state_layer_opacity = 2131165562;
      public static final int m3_comp_primary_navigation_tab_inactive_hover_state_layer_opacity = 2131165563;
      public static final int m3_comp_primary_navigation_tab_inactive_pressed_state_layer_opacity = 2131165564;
      public static final int m3_comp_primary_navigation_tab_with_icon_icon_size = 2131165565;
      public static final int m3_comp_radio_button_disabled_selected_icon_opacity = 2131165566;
      public static final int m3_comp_radio_button_disabled_unselected_icon_opacity = 2131165567;
      public static final int m3_comp_radio_button_selected_focus_state_layer_opacity = 2131165568;
      public static final int m3_comp_radio_button_selected_hover_state_layer_opacity = 2131165569;
      public static final int m3_comp_radio_button_selected_pressed_state_layer_opacity = 2131165570;
      public static final int m3_comp_radio_button_unselected_focus_state_layer_opacity = 2131165571;
      public static final int m3_comp_radio_button_unselected_hover_state_layer_opacity = 2131165572;
      public static final int m3_comp_radio_button_unselected_pressed_state_layer_opacity = 2131165573;
      public static final int m3_comp_search_bar_avatar_size = 2131165574;
      public static final int m3_comp_search_bar_container_elevation = 2131165575;
      public static final int m3_comp_search_bar_container_height = 2131165576;
      public static final int m3_comp_search_bar_hover_state_layer_opacity = 2131165577;
      public static final int m3_comp_search_bar_pressed_state_layer_opacity = 2131165578;
      public static final int m3_comp_search_view_container_elevation = 2131165579;
      public static final int m3_comp_search_view_docked_header_container_height = 2131165580;
      public static final int m3_comp_search_view_full_screen_header_container_height = 2131165581;
      public static final int m3_comp_secondary_navigation_tab_active_indicator_height = 2131165582;
      public static final int m3_comp_secondary_navigation_tab_focus_state_layer_opacity = 2131165583;
      public static final int m3_comp_secondary_navigation_tab_hover_state_layer_opacity = 2131165584;
      public static final int m3_comp_secondary_navigation_tab_pressed_state_layer_opacity = 2131165585;
      public static final int m3_comp_sheet_bottom_docked_modal_container_elevation = 2131165586;
      public static final int m3_comp_sheet_bottom_docked_standard_container_elevation = 2131165587;
      public static final int m3_comp_sheet_side_docked_container_width = 2131165588;
      public static final int m3_comp_sheet_side_docked_modal_container_elevation = 2131165589;
      public static final int m3_comp_sheet_side_docked_standard_container_elevation = 2131165590;
      public static final int m3_comp_slider_disabled_active_track_opacity = 2131165591;
      public static final int m3_comp_slider_disabled_handle_opacity = 2131165592;
      public static final int m3_comp_slider_disabled_inactive_track_opacity = 2131165593;
      public static final int m3_comp_slider_inactive_track_height = 2131165594;
      public static final int m3_comp_snackbar_container_elevation = 2131165595;
      public static final int m3_comp_suggestion_chip_container_height = 2131165596;
      public static final int m3_comp_suggestion_chip_elevated_container_elevation = 2131165597;
      public static final int m3_comp_suggestion_chip_flat_container_elevation = 2131165598;
      public static final int m3_comp_suggestion_chip_flat_outline_width = 2131165599;
      public static final int m3_comp_suggestion_chip_with_leading_icon_leading_icon_size = 2131165600;
      public static final int m3_comp_switch_disabled_selected_handle_opacity = 2131165601;
      public static final int m3_comp_switch_disabled_selected_icon_opacity = 2131165602;
      public static final int m3_comp_switch_disabled_track_opacity = 2131165603;
      public static final int m3_comp_switch_disabled_unselected_handle_opacity = 2131165604;
      public static final int m3_comp_switch_disabled_unselected_icon_opacity = 2131165605;
      public static final int m3_comp_switch_selected_focus_state_layer_opacity = 2131165606;
      public static final int m3_comp_switch_selected_hover_state_layer_opacity = 2131165607;
      public static final int m3_comp_switch_selected_pressed_state_layer_opacity = 2131165608;
      public static final int m3_comp_switch_track_height = 2131165609;
      public static final int m3_comp_switch_track_width = 2131165610;
      public static final int m3_comp_switch_unselected_focus_state_layer_opacity = 2131165611;
      public static final int m3_comp_switch_unselected_hover_state_layer_opacity = 2131165612;
      public static final int m3_comp_switch_unselected_pressed_state_layer_opacity = 2131165613;
      public static final int m3_comp_text_button_focus_state_layer_opacity = 2131165614;
      public static final int m3_comp_text_button_hover_state_layer_opacity = 2131165615;
      public static final int m3_comp_text_button_pressed_state_layer_opacity = 2131165616;
      public static final int m3_comp_time_input_time_input_field_focus_outline_width = 2131165617;
      public static final int m3_comp_time_picker_container_elevation = 2131165618;
      public static final int m3_comp_time_picker_period_selector_focus_state_layer_opacity = 2131165619;
      public static final int m3_comp_time_picker_period_selector_hover_state_layer_opacity = 2131165620;
      public static final int m3_comp_time_picker_period_selector_outline_width = 2131165621;
      public static final int m3_comp_time_picker_period_selector_pressed_state_layer_opacity = 2131165622;
      public static final int m3_comp_time_picker_time_selector_focus_state_layer_opacity = 2131165623;
      public static final int m3_comp_time_picker_time_selector_hover_state_layer_opacity = 2131165624;
      public static final int m3_comp_time_picker_time_selector_pressed_state_layer_opacity = 2131165625;
      public static final int m3_comp_top_app_bar_large_container_height = 2131165626;
      public static final int m3_comp_top_app_bar_medium_container_height = 2131165627;
      public static final int m3_comp_top_app_bar_small_container_elevation = 2131165628;
      public static final int m3_comp_top_app_bar_small_container_height = 2131165629;
      public static final int m3_comp_top_app_bar_small_on_scroll_container_elevation = 2131165630;
      public static final int m3_datepicker_elevation = 2131165631;
      public static final int m3_divider_heavy_thickness = 2131165632;
      public static final int m3_extended_fab_bottom_padding = 2131165633;
      public static final int m3_extended_fab_end_padding = 2131165634;
      public static final int m3_extended_fab_icon_padding = 2131165635;
      public static final int m3_extended_fab_min_height = 2131165636;
      public static final int m3_extended_fab_start_padding = 2131165637;
      public static final int m3_extended_fab_top_padding = 2131165638;
      public static final int m3_fab_border_width = 2131165639;
      public static final int m3_fab_corner_size = 2131165640;
      public static final int m3_fab_translation_z_hovered_focused = 2131165641;
      public static final int m3_fab_translation_z_pressed = 2131165642;
      public static final int m3_large_fab_max_image_size = 2131165643;
      public static final int m3_large_fab_size = 2131165644;
      public static final int m3_menu_elevation = 2131165645;
      public static final int m3_navigation_drawer_layout_corner_size = 2131165646;
      public static final int m3_navigation_item_horizontal_padding = 2131165647;
      public static final int m3_navigation_item_icon_padding = 2131165648;
      public static final int m3_navigation_item_shape_inset_bottom = 2131165649;
      public static final int m3_navigation_item_shape_inset_end = 2131165650;
      public static final int m3_navigation_item_shape_inset_start = 2131165651;
      public static final int m3_navigation_item_shape_inset_top = 2131165652;
      public static final int m3_navigation_item_vertical_padding = 2131165653;
      public static final int m3_navigation_menu_divider_horizontal_padding = 2131165654;
      public static final int m3_navigation_menu_headline_horizontal_padding = 2131165655;
      public static final int m3_navigation_rail_default_width = 2131165656;
      public static final int m3_navigation_rail_elevation = 2131165657;
      public static final int m3_navigation_rail_icon_size = 2131165658;
      public static final int m3_navigation_rail_item_active_indicator_height = 2131165659;
      public static final int m3_navigation_rail_item_active_indicator_margin_horizontal = 2131165660;
      public static final int m3_navigation_rail_item_active_indicator_width = 2131165661;
      public static final int m3_navigation_rail_item_min_height = 2131165662;
      public static final int m3_navigation_rail_item_padding_bottom = 2131165663;
      public static final int m3_navigation_rail_item_padding_top = 2131165664;
      public static final int m3_ripple_default_alpha = 2131165665;
      public static final int m3_ripple_focused_alpha = 2131165666;
      public static final int m3_ripple_hovered_alpha = 2131165667;
      public static final int m3_ripple_pressed_alpha = 2131165668;
      public static final int m3_ripple_selectable_pressed_alpha = 2131165669;
      public static final int m3_searchbar_elevation = 2131165670;
      public static final int m3_searchbar_height = 2131165671;
      public static final int m3_searchbar_margin_horizontal = 2131165672;
      public static final int m3_searchbar_margin_vertical = 2131165673;
      public static final int m3_searchbar_outlined_stroke_width = 2131165674;
      public static final int m3_searchbar_padding_start = 2131165675;
      public static final int m3_searchbar_text_margin_start_no_navigation_icon = 2131165676;
      public static final int m3_searchbar_text_size = 2131165677;
      public static final int m3_searchview_divider_size = 2131165678;
      public static final int m3_searchview_elevation = 2131165679;
      public static final int m3_searchview_height = 2131165680;
      public static final int m3_side_sheet_margin_detached = 2131165681;
      public static final int m3_side_sheet_modal_elevation = 2131165682;
      public static final int m3_side_sheet_standard_elevation = 2131165683;
      public static final int m3_side_sheet_width = 2131165684;
      public static final int m3_simple_item_color_hovered_alpha = 2131165685;
      public static final int m3_simple_item_color_selected_alpha = 2131165686;
      public static final int m3_slider_inactive_track_height = 2131165687;
      public static final int m3_slider_thumb_elevation = 2131165688;
      public static final int m3_small_fab_max_image_size = 2131165689;
      public static final int m3_small_fab_size = 2131165690;
      public static final int m3_snackbar_action_text_color_alpha = 2131165691;
      public static final int m3_snackbar_margin = 2131165692;
      public static final int m3_sys_elevation_level0 = 2131165693;
      public static final int m3_sys_elevation_level1 = 2131165694;
      public static final int m3_sys_elevation_level2 = 2131165695;
      public static final int m3_sys_elevation_level3 = 2131165696;
      public static final int m3_sys_elevation_level4 = 2131165697;
      public static final int m3_sys_elevation_level5 = 2131165698;
      public static final int m3_sys_motion_easing_emphasized_accelerate_control_x1 = 2131165699;
      public static final int m3_sys_motion_easing_emphasized_accelerate_control_x2 = 2131165700;
      public static final int m3_sys_motion_easing_emphasized_accelerate_control_y1 = 2131165701;
      public static final int m3_sys_motion_easing_emphasized_accelerate_control_y2 = 2131165702;
      public static final int m3_sys_motion_easing_emphasized_decelerate_control_x1 = 2131165703;
      public static final int m3_sys_motion_easing_emphasized_decelerate_control_x2 = 2131165704;
      public static final int m3_sys_motion_easing_emphasized_decelerate_control_y1 = 2131165705;
      public static final int m3_sys_motion_easing_emphasized_decelerate_control_y2 = 2131165706;
      public static final int m3_sys_motion_easing_legacy_accelerate_control_x1 = 2131165707;
      public static final int m3_sys_motion_easing_legacy_accelerate_control_x2 = 2131165708;
      public static final int m3_sys_motion_easing_legacy_accelerate_control_y1 = 2131165709;
      public static final int m3_sys_motion_easing_legacy_accelerate_control_y2 = 2131165710;
      public static final int m3_sys_motion_easing_legacy_control_x1 = 2131165711;
      public static final int m3_sys_motion_easing_legacy_control_x2 = 2131165712;
      public static final int m3_sys_motion_easing_legacy_control_y1 = 2131165713;
      public static final int m3_sys_motion_easing_legacy_control_y2 = 2131165714;
      public static final int m3_sys_motion_easing_legacy_decelerate_control_x1 = 2131165715;
      public static final int m3_sys_motion_easing_legacy_decelerate_control_x2 = 2131165716;
      public static final int m3_sys_motion_easing_legacy_decelerate_control_y1 = 2131165717;
      public static final int m3_sys_motion_easing_legacy_decelerate_control_y2 = 2131165718;
      public static final int m3_sys_motion_easing_linear_control_x1 = 2131165719;
      public static final int m3_sys_motion_easing_linear_control_x2 = 2131165720;
      public static final int m3_sys_motion_easing_linear_control_y1 = 2131165721;
      public static final int m3_sys_motion_easing_linear_control_y2 = 2131165722;
      public static final int m3_sys_motion_easing_standard_accelerate_control_x1 = 2131165723;
      public static final int m3_sys_motion_easing_standard_accelerate_control_x2 = 2131165724;
      public static final int m3_sys_motion_easing_standard_accelerate_control_y1 = 2131165725;
      public static final int m3_sys_motion_easing_standard_accelerate_control_y2 = 2131165726;
      public static final int m3_sys_motion_easing_standard_control_x1 = 2131165727;
      public static final int m3_sys_motion_easing_standard_control_x2 = 2131165728;
      public static final int m3_sys_motion_easing_standard_control_y1 = 2131165729;
      public static final int m3_sys_motion_easing_standard_control_y2 = 2131165730;
      public static final int m3_sys_motion_easing_standard_decelerate_control_x1 = 2131165731;
      public static final int m3_sys_motion_easing_standard_decelerate_control_x2 = 2131165732;
      public static final int m3_sys_motion_easing_standard_decelerate_control_y1 = 2131165733;
      public static final int m3_sys_motion_easing_standard_decelerate_control_y2 = 2131165734;
      public static final int m3_sys_state_dragged_state_layer_opacity = 2131165735;
      public static final int m3_sys_state_focus_state_layer_opacity = 2131165736;
      public static final int m3_sys_state_hover_state_layer_opacity = 2131165737;
      public static final int m3_sys_state_pressed_state_layer_opacity = 2131165738;
      public static final int m3_timepicker_display_stroke_width = 2131165739;
      public static final int m3_timepicker_window_elevation = 2131165740;
      public static final int m3_toolbar_text_size_title = 2131165741;
      public static final int material_bottom_sheet_max_width = 2131165742;
      public static final int material_clock_display_height = 2131165743;
      public static final int material_clock_display_padding = 2131165744;
      public static final int material_clock_display_width = 2131165745;
      public static final int material_clock_face_margin_top = 2131165746;
      public static final int material_clock_hand_center_dot_radius = 2131165747;
      public static final int material_clock_hand_padding = 2131165748;
      public static final int material_clock_hand_stroke_width = 2131165749;
      public static final int material_clock_number_text_size = 2131165750;
      public static final int material_clock_period_toggle_height = 2131165751;
      public static final int material_clock_period_toggle_horizontal_gap = 2131165752;
      public static final int material_clock_period_toggle_vertical_gap = 2131165753;
      public static final int material_clock_period_toggle_width = 2131165754;
      public static final int material_clock_size = 2131165755;
      public static final int material_cursor_inset = 2131165756;
      public static final int material_cursor_width = 2131165757;
      public static final int material_divider_thickness = 2131165758;
      public static final int material_emphasis_disabled = 2131165759;
      public static final int material_emphasis_disabled_background = 2131165760;
      public static final int material_emphasis_high_type = 2131165761;
      public static final int material_emphasis_medium = 2131165762;
      public static final int material_filled_edittext_font_1_3_padding_bottom = 2131165763;
      public static final int material_filled_edittext_font_1_3_padding_top = 2131165764;
      public static final int material_filled_edittext_font_2_0_padding_bottom = 2131165765;
      public static final int material_filled_edittext_font_2_0_padding_top = 2131165766;
      public static final int material_font_1_3_box_collapsed_padding_top = 2131165767;
      public static final int material_font_2_0_box_collapsed_padding_top = 2131165768;
      public static final int material_helper_text_default_padding_top = 2131165769;
      public static final int material_helper_text_font_1_3_padding_horizontal = 2131165770;
      public static final int material_helper_text_font_1_3_padding_top = 2131165771;
      public static final int material_input_text_to_prefix_suffix_padding = 2131165772;
      public static final int material_textinput_default_width = 2131165773;
      public static final int material_textinput_max_width = 2131165774;
      public static final int material_textinput_min_width = 2131165775;
      public static final int material_time_picker_minimum_screen_height = 2131165776;
      public static final int material_time_picker_minimum_screen_width = 2131165777;
      public static final int material_timepicker_dialog_buttons_margin_top = 2131165778;
      public static final int message_accessories_vertical_spacing = 2131165779;
      public static final int message_avatar = 2131165780;
      public static final int message_avatar_decoration_size = 2131165781;
      public static final int message_avatar_margin_start = 2131165782;
      public static final int message_divider_margin_horiz = 2131165783;
      public static final int message_embed_margin = 2131165784;
      public static final int message_embed_max_thumbnail_size = 2131165785;
      public static final int message_gutter_width = 2131165786;
      public static final int message_horizontal_spacing = 2131165787;
      public static final int message_media_grid_inner_radius = 2131165788;
      public static final int message_media_grid_spacing = 2131165789;
      public static final int message_media_max_height = 2131165790;
      public static final int message_media_non_mosaic_radius = 2131165791;
      public static final int message_media_radius = 2131165792;
      public static final int message_media_view_stroke = 2131165793;
      public static final int message_reply_leading_views_margin_start = 2131165794;
      public static final int message_start_guideline = 2131165795;
      public static final int movement_threshold_dp = 2131165796;
      public static final int mtrl_alert_dialog_background_inset_bottom = 2131165797;
      public static final int mtrl_alert_dialog_background_inset_end = 2131165798;
      public static final int mtrl_alert_dialog_background_inset_start = 2131165799;
      public static final int mtrl_alert_dialog_background_inset_top = 2131165800;
      public static final int mtrl_alert_dialog_picker_background_inset = 2131165801;
      public static final int mtrl_badge_horizontal_edge_offset = 2131165802;
      public static final int mtrl_badge_long_text_horizontal_padding = 2131165803;
      public static final int mtrl_badge_size = 2131165804;
      public static final int mtrl_badge_text_horizontal_edge_offset = 2131165805;
      public static final int mtrl_badge_text_size = 2131165806;
      public static final int mtrl_badge_toolbar_action_menu_item_horizontal_offset = 2131165807;
      public static final int mtrl_badge_toolbar_action_menu_item_vertical_offset = 2131165808;
      public static final int mtrl_badge_with_text_size = 2131165809;
      public static final int mtrl_bottomappbar_fabOffsetEndMode = 2131165810;
      public static final int mtrl_bottomappbar_fab_bottom_margin = 2131165811;
      public static final int mtrl_bottomappbar_fab_cradle_margin = 2131165812;
      public static final int mtrl_bottomappbar_fab_cradle_rounded_corner_radius = 2131165813;
      public static final int mtrl_bottomappbar_fab_cradle_vertical_offset = 2131165814;
      public static final int mtrl_bottomappbar_height = 2131165815;
      public static final int mtrl_btn_corner_radius = 2131165816;
      public static final int mtrl_btn_dialog_btn_min_width = 2131165817;
      public static final int mtrl_btn_disabled_elevation = 2131165818;
      public static final int mtrl_btn_disabled_z = 2131165819;
      public static final int mtrl_btn_elevation = 2131165820;
      public static final int mtrl_btn_focused_z = 2131165821;
      public static final int mtrl_btn_hovered_z = 2131165822;
      public static final int mtrl_btn_icon_btn_padding_left = 2131165823;
      public static final int mtrl_btn_icon_padding = 2131165824;
      public static final int mtrl_btn_inset = 2131165825;
      public static final int mtrl_btn_letter_spacing = 2131165826;
      public static final int mtrl_btn_max_width = 2131165827;
      public static final int mtrl_btn_padding_bottom = 2131165828;
      public static final int mtrl_btn_padding_left = 2131165829;
      public static final int mtrl_btn_padding_right = 2131165830;
      public static final int mtrl_btn_padding_top = 2131165831;
      public static final int mtrl_btn_pressed_z = 2131165832;
      public static final int mtrl_btn_snackbar_margin_horizontal = 2131165833;
      public static final int mtrl_btn_stroke_size = 2131165834;
      public static final int mtrl_btn_text_btn_icon_padding = 2131165835;
      public static final int mtrl_btn_text_btn_padding_left = 2131165836;
      public static final int mtrl_btn_text_btn_padding_right = 2131165837;
      public static final int mtrl_btn_text_size = 2131165838;
      public static final int mtrl_btn_z = 2131165839;
      public static final int mtrl_calendar_action_confirm_button_min_width = 2131165840;
      public static final int mtrl_calendar_action_height = 2131165841;
      public static final int mtrl_calendar_action_padding = 2131165842;
      public static final int mtrl_calendar_bottom_padding = 2131165843;
      public static final int mtrl_calendar_content_padding = 2131165844;
      public static final int mtrl_calendar_day_corner = 2131165845;
      public static final int mtrl_calendar_day_height = 2131165846;
      public static final int mtrl_calendar_day_horizontal_padding = 2131165847;
      public static final int mtrl_calendar_day_today_stroke = 2131165848;
      public static final int mtrl_calendar_day_vertical_padding = 2131165849;
      public static final int mtrl_calendar_day_width = 2131165850;
      public static final int mtrl_calendar_days_of_week_height = 2131165851;
      public static final int mtrl_calendar_dialog_background_inset = 2131165852;
      public static final int mtrl_calendar_header_content_padding = 2131165853;
      public static final int mtrl_calendar_header_content_padding_fullscreen = 2131165854;
      public static final int mtrl_calendar_header_divider_thickness = 2131165855;
      public static final int mtrl_calendar_header_height = 2131165856;
      public static final int mtrl_calendar_header_height_fullscreen = 2131165857;
      public static final int mtrl_calendar_header_selection_line_height = 2131165858;
      public static final int mtrl_calendar_header_text_padding = 2131165859;
      public static final int mtrl_calendar_header_toggle_margin_bottom = 2131165860;
      public static final int mtrl_calendar_header_toggle_margin_top = 2131165861;
      public static final int mtrl_calendar_landscape_header_width = 2131165862;
      public static final int mtrl_calendar_maximum_default_fullscreen_minor_axis = 2131165863;
      public static final int mtrl_calendar_month_horizontal_padding = 2131165864;
      public static final int mtrl_calendar_month_vertical_padding = 2131165865;
      public static final int mtrl_calendar_navigation_bottom_padding = 2131165866;
      public static final int mtrl_calendar_navigation_height = 2131165867;
      public static final int mtrl_calendar_navigation_top_padding = 2131165868;
      public static final int mtrl_calendar_pre_l_text_clip_padding = 2131165869;
      public static final int mtrl_calendar_selection_baseline_to_top_fullscreen = 2131165870;
      public static final int mtrl_calendar_selection_text_baseline_to_bottom = 2131165871;
      public static final int mtrl_calendar_selection_text_baseline_to_bottom_fullscreen = 2131165872;
      public static final int mtrl_calendar_selection_text_baseline_to_top = 2131165873;
      public static final int mtrl_calendar_text_input_padding_top = 2131165874;
      public static final int mtrl_calendar_title_baseline_to_top = 2131165875;
      public static final int mtrl_calendar_title_baseline_to_top_fullscreen = 2131165876;
      public static final int mtrl_calendar_year_corner = 2131165877;
      public static final int mtrl_calendar_year_height = 2131165878;
      public static final int mtrl_calendar_year_horizontal_padding = 2131165879;
      public static final int mtrl_calendar_year_vertical_padding = 2131165880;
      public static final int mtrl_calendar_year_width = 2131165881;
      public static final int mtrl_card_checked_icon_margin = 2131165882;
      public static final int mtrl_card_checked_icon_size = 2131165883;
      public static final int mtrl_card_corner_radius = 2131165884;
      public static final int mtrl_card_dragged_z = 2131165885;
      public static final int mtrl_card_elevation = 2131165886;
      public static final int mtrl_card_spacing = 2131165887;
      public static final int mtrl_chip_pressed_translation_z = 2131165888;
      public static final int mtrl_chip_text_size = 2131165889;
      public static final int mtrl_exposed_dropdown_menu_popup_elevation = 2131165890;
      public static final int mtrl_exposed_dropdown_menu_popup_vertical_offset = 2131165891;
      public static final int mtrl_exposed_dropdown_menu_popup_vertical_padding = 2131165892;
      public static final int mtrl_extended_fab_bottom_padding = 2131165893;
      public static final int mtrl_extended_fab_disabled_elevation = 2131165894;
      public static final int mtrl_extended_fab_disabled_translation_z = 2131165895;
      public static final int mtrl_extended_fab_elevation = 2131165896;
      public static final int mtrl_extended_fab_end_padding = 2131165897;
      public static final int mtrl_extended_fab_end_padding_icon = 2131165898;
      public static final int mtrl_extended_fab_icon_size = 2131165899;
      public static final int mtrl_extended_fab_icon_text_spacing = 2131165900;
      public static final int mtrl_extended_fab_min_height = 2131165901;
      public static final int mtrl_extended_fab_min_width = 2131165902;
      public static final int mtrl_extended_fab_start_padding = 2131165903;
      public static final int mtrl_extended_fab_start_padding_icon = 2131165904;
      public static final int mtrl_extended_fab_top_padding = 2131165905;
      public static final int mtrl_extended_fab_translation_z_base = 2131165906;
      public static final int mtrl_extended_fab_translation_z_hovered_focused = 2131165907;
      public static final int mtrl_extended_fab_translation_z_pressed = 2131165908;
      public static final int mtrl_fab_elevation = 2131165909;
      public static final int mtrl_fab_min_touch_target = 2131165910;
      public static final int mtrl_fab_translation_z_hovered_focused = 2131165911;
      public static final int mtrl_fab_translation_z_pressed = 2131165912;
      public static final int mtrl_high_ripple_default_alpha = 2131165913;
      public static final int mtrl_high_ripple_focused_alpha = 2131165914;
      public static final int mtrl_high_ripple_hovered_alpha = 2131165915;
      public static final int mtrl_high_ripple_pressed_alpha = 2131165916;
      public static final int mtrl_low_ripple_default_alpha = 2131165917;
      public static final int mtrl_low_ripple_focused_alpha = 2131165918;
      public static final int mtrl_low_ripple_hovered_alpha = 2131165919;
      public static final int mtrl_low_ripple_pressed_alpha = 2131165920;
      public static final int mtrl_min_touch_target_size = 2131165921;
      public static final int mtrl_navigation_bar_item_default_icon_size = 2131165922;
      public static final int mtrl_navigation_bar_item_default_margin = 2131165923;
      public static final int mtrl_navigation_elevation = 2131165924;
      public static final int mtrl_navigation_item_horizontal_padding = 2131165925;
      public static final int mtrl_navigation_item_icon_padding = 2131165926;
      public static final int mtrl_navigation_item_icon_size = 2131165927;
      public static final int mtrl_navigation_item_shape_horizontal_margin = 2131165928;
      public static final int mtrl_navigation_item_shape_vertical_margin = 2131165929;
      public static final int mtrl_navigation_rail_active_text_size = 2131165930;
      public static final int mtrl_navigation_rail_compact_width = 2131165931;
      public static final int mtrl_navigation_rail_default_width = 2131165932;
      public static final int mtrl_navigation_rail_elevation = 2131165933;
      public static final int mtrl_navigation_rail_icon_margin = 2131165934;
      public static final int mtrl_navigation_rail_icon_size = 2131165935;
      public static final int mtrl_navigation_rail_margin = 2131165936;
      public static final int mtrl_navigation_rail_text_bottom_margin = 2131165937;
      public static final int mtrl_navigation_rail_text_size = 2131165938;
      public static final int mtrl_progress_circular_inset = 2131165939;
      public static final int mtrl_progress_circular_inset_extra_small = 2131165940;
      public static final int mtrl_progress_circular_inset_medium = 2131165941;
      public static final int mtrl_progress_circular_inset_small = 2131165942;
      public static final int mtrl_progress_circular_radius = 2131165943;
      public static final int mtrl_progress_circular_size = 2131165944;
      public static final int mtrl_progress_circular_size_extra_small = 2131165945;
      public static final int mtrl_progress_circular_size_medium = 2131165946;
      public static final int mtrl_progress_circular_size_small = 2131165947;
      public static final int mtrl_progress_circular_track_thickness_extra_small = 2131165948;
      public static final int mtrl_progress_circular_track_thickness_medium = 2131165949;
      public static final int mtrl_progress_circular_track_thickness_small = 2131165950;
      public static final int mtrl_progress_indicator_full_rounded_corner_radius = 2131165951;
      public static final int mtrl_progress_track_thickness = 2131165952;
      public static final int mtrl_shape_corner_size_large_component = 2131165953;
      public static final int mtrl_shape_corner_size_medium_component = 2131165954;
      public static final int mtrl_shape_corner_size_small_component = 2131165955;
      public static final int mtrl_slider_halo_radius = 2131165956;
      public static final int mtrl_slider_label_padding = 2131165957;
      public static final int mtrl_slider_label_radius = 2131165958;
      public static final int mtrl_slider_label_square_side = 2131165959;
      public static final int mtrl_slider_thumb_elevation = 2131165960;
      public static final int mtrl_slider_thumb_radius = 2131165961;
      public static final int mtrl_slider_tick_radius = 2131165962;
      public static final int mtrl_slider_track_height = 2131165963;
      public static final int mtrl_slider_track_side_padding = 2131165964;
      public static final int mtrl_slider_widget_height = 2131165965;
      public static final int mtrl_snackbar_action_text_color_alpha = 2131165966;
      public static final int mtrl_snackbar_background_corner_radius = 2131165967;
      public static final int mtrl_snackbar_background_overlay_color_alpha = 2131165968;
      public static final int mtrl_snackbar_margin = 2131165969;
      public static final int mtrl_snackbar_message_margin_horizontal = 2131165970;
      public static final int mtrl_snackbar_padding_horizontal = 2131165971;
      public static final int mtrl_switch_text_padding = 2131165972;
      public static final int mtrl_switch_thumb_elevation = 2131165973;
      public static final int mtrl_switch_thumb_size = 2131165974;
      public static final int mtrl_switch_track_height = 2131165975;
      public static final int mtrl_switch_track_width = 2131165976;
      public static final int mtrl_textinput_box_corner_radius_medium = 2131165977;
      public static final int mtrl_textinput_box_corner_radius_small = 2131165978;
      public static final int mtrl_textinput_box_label_cutout_padding = 2131165979;
      public static final int mtrl_textinput_box_stroke_width_default = 2131165980;
      public static final int mtrl_textinput_box_stroke_width_focused = 2131165981;
      public static final int mtrl_textinput_counter_margin_start = 2131165982;
      public static final int mtrl_textinput_end_icon_margin_start = 2131165983;
      public static final int mtrl_textinput_outline_box_expanded_padding = 2131165984;
      public static final int mtrl_textinput_start_icon_margin_end = 2131165985;
      public static final int mtrl_toolbar_default_height = 2131165986;
      public static final int mtrl_tooltip_arrowSize = 2131165987;
      public static final int mtrl_tooltip_cornerSize = 2131165988;
      public static final int mtrl_tooltip_minHeight = 2131165989;
      public static final int mtrl_tooltip_minWidth = 2131165990;
      public static final int mtrl_tooltip_padding = 2131165991;
      public static final int mtrl_transition_shared_axis_slide_distance = 2131165992;
      public static final int notification_action_icon_size = 2131165993;
      public static final int notification_action_text_size = 2131165994;
      public static final int notification_big_circle_margin = 2131165995;
      public static final int notification_content_margin_start = 2131165996;
      public static final int notification_large_icon_height = 2131165997;
      public static final int notification_large_icon_width = 2131165998;
      public static final int notification_main_column_padding_top = 2131165999;
      public static final int notification_media_narrow_margin = 2131166000;
      public static final int notification_right_icon_size = 2131166001;
      public static final int notification_right_side_padding_top = 2131166002;
      public static final int notification_small_icon_background_padding = 2131166003;
      public static final int notification_small_icon_size_as_large = 2131166004;
      public static final int notification_subtext_size = 2131166005;
      public static final int notification_top_pad = 2131166006;
      public static final int notification_top_pad_large_text = 2131166007;
      public static final int overlay_safe_margin = 2131166008;
      public static final int premium_emoji_lock_size = 2131166009;
      public static final int premium_inline_roadblock_height = 2131166010;
      public static final int premium_inline_roadblock_height_half = 2131166011;
      public static final int premium_inline_roadblock_margin = 2131166012;
      public static final int spacing_12 = 2131166013;
      public static final int spacing_16 = 2131166014;
      public static final int spacing_24 = 2131166015;
      public static final int spacing_32 = 2131166016;
      public static final int spacing_4 = 2131166017;
      public static final int spacing_40 = 2131166018;
      public static final int spacing_48 = 2131166019;
      public static final int spacing_56 = 2131166020;
      public static final int spacing_64 = 2131166021;
      public static final int spacing_72 = 2131166022;
      public static final int spacing_8 = 2131166023;
      public static final int spacing_80 = 2131166024;
      public static final int spacing_96 = 2131166025;
      public static final int spine_width = 2131166026;
      public static final int thread_spine_end_padding = 2131166027;
      public static final int tooltip_corner_radius = 2131166028;
      public static final int tooltip_horizontal_padding = 2131166029;
      public static final int tooltip_margin = 2131166030;
      public static final int tooltip_precise_anchor_extra_offset = 2131166031;
      public static final int tooltip_precise_anchor_threshold = 2131166032;
      public static final int tooltip_vertical_padding = 2131166033;
      public static final int tooltip_y_offset_non_touch = 2131166034;
      public static final int tooltip_y_offset_touch = 2131166035;
      public static final int trash_wrap_min_dimen = 2131166036;
      public static final int ucrop_default_crop_frame_stoke_width = 2131166037;
      public static final int ucrop_default_crop_grid_stoke_width = 2131166038;
      public static final int ucrop_default_crop_logo_size = 2131166039;
      public static final int ucrop_default_crop_rect_corner_touch_area_line_length = 2131166040;
      public static final int ucrop_default_crop_rect_corner_touch_threshold = 2131166041;
      public static final int ucrop_default_crop_rect_min_size = 2131166042;
      public static final int ucrop_height_crop_aspect_ratio_text = 2131166043;
      public static final int ucrop_height_divider_shadow = 2131166044;
      public static final int ucrop_height_horizontal_wheel_progress_line = 2131166045;
      public static final int ucrop_height_wrapper_controls = 2131166046;
      public static final int ucrop_height_wrapper_states = 2131166047;
      public static final int ucrop_margin_horizontal_wheel_progress_line = 2131166048;
      public static final int ucrop_margin_top_controls_text = 2131166049;
      public static final int ucrop_margin_top_widget_text = 2131166050;
      public static final int ucrop_padding_crop_frame = 2131166051;
      public static final int ucrop_progress_size = 2131166052;
      public static final int ucrop_size_dot_scale_text_view = 2131166053;
      public static final int ucrop_size_wrapper_rotate_button = 2131166054;
      public static final int ucrop_text_size_controls_text = 2131166055;
      public static final int ucrop_text_size_widget_text = 2131166056;
      public static final int ucrop_width_horizontal_wheel_progress_line = 2131166057;
      public static final int ucrop_width_middle_wheel_progress_line = 2131166058;
      public static final int vertical_safe_margin = 2131166059;

      private dimen() {
      }
   }

   public static final class drawable {
      public static final int _discord_common_js_shared_images_flags_bg = 2131230762;
      public static final int _discord_common_js_shared_images_flags_cs = 2131230763;
      public static final int _discord_common_js_shared_images_flags_da = 2131230764;
      public static final int _discord_common_js_shared_images_flags_de = 2131230765;
      public static final int _discord_common_js_shared_images_flags_el = 2131230766;
      public static final int _discord_common_js_shared_images_flags_engb = 2131230767;
      public static final int _discord_common_js_shared_images_flags_enus = 2131230768;
      public static final int _discord_common_js_shared_images_flags_es419 = 2131230769;
      public static final int _discord_common_js_shared_images_flags_eses = 2131230770;
      public static final int _discord_common_js_shared_images_flags_fi = 2131230771;
      public static final int _discord_common_js_shared_images_flags_fr = 2131230772;
      public static final int _discord_common_js_shared_images_flags_hi = 2131230773;
      public static final int _discord_common_js_shared_images_flags_hr = 2131230774;
      public static final int _discord_common_js_shared_images_flags_hu = 2131230775;
      public static final int _discord_common_js_shared_images_flags_it = 2131230776;
      public static final int _discord_common_js_shared_images_flags_ja = 2131230777;
      public static final int _discord_common_js_shared_images_flags_ko = 2131230778;
      public static final int _discord_common_js_shared_images_flags_lt = 2131230779;
      public static final int _discord_common_js_shared_images_flags_nl = 2131230780;
      public static final int _discord_common_js_shared_images_flags_no = 2131230781;
      public static final int _discord_common_js_shared_images_flags_pl = 2131230782;
      public static final int _discord_common_js_shared_images_flags_ptbr = 2131230783;
      public static final int _discord_common_js_shared_images_flags_ro = 2131230784;
      public static final int _discord_common_js_shared_images_flags_ru = 2131230785;
      public static final int _discord_common_js_shared_images_flags_svse = 2131230786;
      public static final int _discord_common_js_shared_images_flags_th = 2131230787;
      public static final int _discord_common_js_shared_images_flags_tr = 2131230788;
      public static final int _discord_common_js_shared_images_flags_uk = 2131230789;
      public static final int _discord_common_js_shared_images_flags_vi = 2131230790;
      public static final int _discord_common_js_shared_images_flags_zhcn = 2131230791;
      public static final int _discord_common_js_shared_images_flags_zhtw = 2131230792;
      public static final int _node_modules_pnpm_reactnavigationelements1330_reactnavigationnative617_reactnativehttpscodeloa_uccxnr6ll2zrdsqhmf3ghbqbem_node_modules_reactnavigation_elements_src_assets_backicon = 2131230793;
      public static final int _node_modules_pnpm_reactnavigationelements1330_reactnavigationnative617_reactnativehttpscodeloa_uccxnr6ll2zrdsqhmf3ghbqbem_node_modules_reactnavigation_elements_src_assets_backiconmask = 2131230794;
      public static final int abc_ab_share_pack_mtrl_alpha = 2131230795;
      public static final int abc_action_bar_item_background_material = 2131230796;
      public static final int abc_btn_borderless_material = 2131230797;
      public static final int abc_btn_check_material = 2131230798;
      public static final int abc_btn_check_material_anim = 2131230799;
      public static final int abc_btn_check_to_on_mtrl_000 = 2131230800;
      public static final int abc_btn_check_to_on_mtrl_015 = 2131230801;
      public static final int abc_btn_colored_material = 2131230802;
      public static final int abc_btn_default_mtrl_shape = 2131230803;
      public static final int abc_btn_radio_material = 2131230804;
      public static final int abc_btn_radio_material_anim = 2131230805;
      public static final int abc_btn_radio_to_on_mtrl_000 = 2131230806;
      public static final int abc_btn_radio_to_on_mtrl_015 = 2131230807;
      public static final int abc_btn_switch_to_on_mtrl_00001 = 2131230808;
      public static final int abc_btn_switch_to_on_mtrl_00012 = 2131230809;
      public static final int abc_cab_background_internal_bg = 2131230810;
      public static final int abc_cab_background_top_material = 2131230811;
      public static final int abc_cab_background_top_mtrl_alpha = 2131230812;
      public static final int abc_control_background_material = 2131230813;
      public static final int abc_dialog_material_background = 2131230814;
      public static final int abc_edit_text_material = 2131230815;
      public static final int abc_ic_ab_back_material = 2131230816;
      public static final int abc_ic_arrow_drop_right_black_24dp = 2131230817;
      public static final int abc_ic_clear_material = 2131230818;
      public static final int abc_ic_commit_search_api_mtrl_alpha = 2131230819;
      public static final int abc_ic_go_search_api_material = 2131230820;
      public static final int abc_ic_menu_copy_mtrl_am_alpha = 2131230821;
      public static final int abc_ic_menu_cut_mtrl_alpha = 2131230822;
      public static final int abc_ic_menu_overflow_material = 2131230823;
      public static final int abc_ic_menu_paste_mtrl_am_alpha = 2131230824;
      public static final int abc_ic_menu_selectall_mtrl_alpha = 2131230825;
      public static final int abc_ic_menu_share_mtrl_alpha = 2131230826;
      public static final int abc_ic_search_api_material = 2131230827;
      public static final int abc_ic_voice_search_api_material = 2131230828;
      public static final int abc_item_background_holo_dark = 2131230829;
      public static final int abc_item_background_holo_light = 2131230830;
      public static final int abc_list_divider_material = 2131230831;
      public static final int abc_list_divider_mtrl_alpha = 2131230832;
      public static final int abc_list_focused_holo = 2131230833;
      public static final int abc_list_longpressed_holo = 2131230834;
      public static final int abc_list_pressed_holo_dark = 2131230835;
      public static final int abc_list_pressed_holo_light = 2131230836;
      public static final int abc_list_selector_background_transition_holo_dark = 2131230837;
      public static final int abc_list_selector_background_transition_holo_light = 2131230838;
      public static final int abc_list_selector_disabled_holo_dark = 2131230839;
      public static final int abc_list_selector_disabled_holo_light = 2131230840;
      public static final int abc_list_selector_holo_dark = 2131230841;
      public static final int abc_list_selector_holo_light = 2131230842;
      public static final int abc_menu_hardkey_panel_mtrl_mult = 2131230843;
      public static final int abc_popup_background_mtrl_mult = 2131230844;
      public static final int abc_ratingbar_indicator_material = 2131230845;
      public static final int abc_ratingbar_material = 2131230846;
      public static final int abc_ratingbar_small_material = 2131230847;
      public static final int abc_scrubber_control_off_mtrl_alpha = 2131230848;
      public static final int abc_scrubber_control_to_pressed_mtrl_000 = 2131230849;
      public static final int abc_scrubber_control_to_pressed_mtrl_005 = 2131230850;
      public static final int abc_scrubber_primary_mtrl_alpha = 2131230851;
      public static final int abc_scrubber_track_mtrl_alpha = 2131230852;
      public static final int abc_seekbar_thumb_material = 2131230853;
      public static final int abc_seekbar_tick_mark_material = 2131230854;
      public static final int abc_seekbar_track_material = 2131230855;
      public static final int abc_spinner_mtrl_am_alpha = 2131230856;
      public static final int abc_spinner_textfield_background_material = 2131230857;
      public static final int abc_star_black_48dp = 2131230858;
      public static final int abc_star_half_black_48dp = 2131230859;
      public static final int abc_switch_thumb_material = 2131230860;
      public static final int abc_switch_track_mtrl_alpha = 2131230861;
      public static final int abc_tab_indicator_material = 2131230862;
      public static final int abc_tab_indicator_mtrl_alpha = 2131230863;
      public static final int abc_text_cursor_material = 2131230864;
      public static final int abc_text_select_handle_left_mtrl = 2131230865;
      public static final int abc_text_select_handle_middle_mtrl = 2131230866;
      public static final int abc_text_select_handle_right_mtrl = 2131230867;
      public static final int abc_textfield_activated_mtrl_alpha = 2131230868;
      public static final int abc_textfield_default_mtrl_alpha = 2131230869;
      public static final int abc_textfield_search_activated_mtrl_alpha = 2131230870;
      public static final int abc_textfield_search_default_mtrl_alpha = 2131230871;
      public static final int abc_textfield_search_material = 2131230872;
      public static final int abc_vector_test = 2131230873;
      public static final int activity_invite_gradient_overlay = 2131230874;
      public static final int adaptive_icon = 2131230875;
      public static final int adaptive_icon_background = 2131230876;
      public static final int adaptive_icon_foreground = 2131230877;
      public static final int autofill_inline_suggestion_chip_background = 2131230878;
      public static final int avd_hide_password = 2131230879;
      public static final int avd_show_password = 2131230880;
      public static final int background_splash_dark = 2131230881;
      public static final int background_splash_light = 2131230882;
      public static final int brand_dark_foreground = 2131230883;
      public static final int btn_checkbox_checked_mtrl = 2131230884;
      public static final int btn_checkbox_checked_to_unchecked_mtrl_animation = 2131230885;
      public static final int btn_checkbox_unchecked_mtrl = 2131230886;
      public static final int btn_checkbox_unchecked_to_checked_mtrl_animation = 2131230887;
      public static final int btn_radio_off_mtrl = 2131230888;
      public static final int btn_radio_off_to_on_mtrl_animation = 2131230889;
      public static final int btn_radio_on_mtrl = 2131230890;
      public static final int btn_radio_on_to_off_mtrl_animation = 2131230891;
      public static final int bubble_state_selector = 2131230892;
      public static final int common_full_open_on_phone = 2131230893;
      public static final int common_google_signin_btn_icon_dark = 2131230894;
      public static final int common_google_signin_btn_icon_dark_focused = 2131230895;
      public static final int common_google_signin_btn_icon_dark_normal = 2131230896;
      public static final int common_google_signin_btn_icon_dark_normal_background = 2131230897;
      public static final int common_google_signin_btn_icon_disabled = 2131230898;
      public static final int common_google_signin_btn_icon_light = 2131230899;
      public static final int common_google_signin_btn_icon_light_focused = 2131230900;
      public static final int common_google_signin_btn_icon_light_normal = 2131230901;
      public static final int common_google_signin_btn_icon_light_normal_background = 2131230902;
      public static final int common_google_signin_btn_text_dark = 2131230903;
      public static final int common_google_signin_btn_text_dark_focused = 2131230904;
      public static final int common_google_signin_btn_text_dark_normal = 2131230905;
      public static final int common_google_signin_btn_text_dark_normal_background = 2131230906;
      public static final int common_google_signin_btn_text_disabled = 2131230907;
      public static final int common_google_signin_btn_text_light = 2131230908;
      public static final int common_google_signin_btn_text_light_focused = 2131230909;
      public static final int common_google_signin_btn_text_light_normal = 2131230910;
      public static final int common_google_signin_btn_text_light_normal_background = 2131230911;
      public static final int design_components_icon_native_redesign_generated_images_accessibilityicon = 2131230912;
      public static final int design_components_icon_native_redesign_generated_images_activitiesicon = 2131230913;
      public static final int design_components_icon_native_redesign_generated_images_analyticsicon = 2131230914;
      public static final int design_components_icon_native_redesign_generated_images_announcementsicon = 2131230915;
      public static final int design_components_icon_native_redesign_generated_images_announcementslockicon = 2131230916;
      public static final int design_components_icon_native_redesign_generated_images_announcementswarningicon = 2131230917;
      public static final int design_components_icon_native_redesign_generated_images_appsicon = 2131230918;
      public static final int design_components_icon_native_redesign_generated_images_arrowangleleftupicon = 2131230919;
      public static final int design_components_icon_native_redesign_generated_images_arrowanglerightupicon = 2131230920;
      public static final int design_components_icon_native_redesign_generated_images_arrowlargedownicon = 2131230921;
      public static final int design_components_icon_native_redesign_generated_images_arrowlargelefticon = 2131230922;
      public static final int design_components_icon_native_redesign_generated_images_arrowlargerighticon = 2131230923;
      public static final int design_components_icon_native_redesign_generated_images_arrowsmalldownicon = 2131230924;
      public static final int design_components_icon_native_redesign_generated_images_arrowsmallupicon = 2131230925;
      public static final int design_components_icon_native_redesign_generated_images_arrowsupdownicon = 2131230926;
      public static final int design_components_icon_native_redesign_generated_images_aticon = 2131230927;
      public static final int design_components_icon_native_redesign_generated_images_attachmenticon = 2131230928;
      public static final int design_components_icon_native_redesign_generated_images_backspaceicon = 2131230929;
      public static final int design_components_icon_native_redesign_generated_images_beakericon = 2131230930;
      public static final int design_components_icon_native_redesign_generated_images_bellicon = 2131230931;
      public static final int design_components_icon_native_redesign_generated_images_bellslashicon = 2131230932;
      public static final int design_components_icon_native_redesign_generated_images_bellzicon = 2131230933;
      public static final int design_components_icon_native_redesign_generated_images_bicycleicon = 2131230934;
      public static final int design_components_icon_native_redesign_generated_images_billicon = 2131230935;
      public static final int design_components_icon_native_redesign_generated_images_bookcheckicon = 2131230936;
      public static final int design_components_icon_native_redesign_generated_images_bookmarkicon = 2131230937;
      public static final int design_components_icon_native_redesign_generated_images_bookmarkoutlineicon = 2131230938;
      public static final int design_components_icon_native_redesign_generated_images_boosttier2icon = 2131230939;
      public static final int design_components_icon_native_redesign_generated_images_boosttier3icon = 2131230940;
      public static final int design_components_icon_native_redesign_generated_images_calendaricon = 2131230941;
      public static final int design_components_icon_native_redesign_generated_images_calendarminusicon = 2131230942;
      public static final int design_components_icon_native_redesign_generated_images_calendarplusicon = 2131230943;
      public static final int design_components_icon_native_redesign_generated_images_calendarxicon = 2131230944;
      public static final int design_components_icon_native_redesign_generated_images_cameraicon = 2131230945;
      public static final int design_components_icon_native_redesign_generated_images_cameraswapicon = 2131230946;
      public static final int design_components_icon_native_redesign_generated_images_channellisticon = 2131230947;
      public static final int design_components_icon_native_redesign_generated_images_channellistmagnifyingglassicon = 2131230948;
      public static final int design_components_icon_native_redesign_generated_images_channelnotificationicon = 2131230949;
      public static final int design_components_icon_native_redesign_generated_images_chatarrowrighticon = 2131230950;
      public static final int design_components_icon_native_redesign_generated_images_chatcheckicon = 2131230951;
      public static final int design_components_icon_native_redesign_generated_images_chaticon = 2131230952;
      public static final int design_components_icon_native_redesign_generated_images_chatmarkunreadicon = 2131230953;
      public static final int design_components_icon_native_redesign_generated_images_chatplusicon = 2131230954;
      public static final int design_components_icon_native_redesign_generated_images_chatwarningicon = 2131230955;
      public static final int design_components_icon_native_redesign_generated_images_chatxicon = 2131230956;
      public static final int design_components_icon_native_redesign_generated_images_checkmarklargeboldicon = 2131230957;
      public static final int design_components_icon_native_redesign_generated_images_checkmarklargeicon = 2131230958;
      public static final int design_components_icon_native_redesign_generated_images_checkmarksmallboldicon = 2131230959;
      public static final int design_components_icon_native_redesign_generated_images_checkmarksmallicon = 2131230960;
      public static final int design_components_icon_native_redesign_generated_images_chevronlargedownicon = 2131230961;
      public static final int design_components_icon_native_redesign_generated_images_chevronlargelefticon = 2131230962;
      public static final int design_components_icon_native_redesign_generated_images_chevronsmalldownicon = 2131230963;
      public static final int design_components_icon_native_redesign_generated_images_chevronsmalllefticon = 2131230964;
      public static final int design_components_icon_native_redesign_generated_images_chevronsmallrighticon = 2131230965;
      public static final int design_components_icon_native_redesign_generated_images_chevronsmallupicon = 2131230966;
      public static final int design_components_icon_native_redesign_generated_images_circlecheckiconprimary = 2131230967;
      public static final int design_components_icon_native_redesign_generated_images_circlecheckiconsecondary = 2131230968;
      public static final int design_components_icon_native_redesign_generated_images_circleinformationicon = 2131230969;
      public static final int design_components_icon_native_redesign_generated_images_circleinformationiconprimary = 2131230970;
      public static final int design_components_icon_native_redesign_generated_images_circleinformationiconsecondary = 2131230971;
      public static final int design_components_icon_native_redesign_generated_images_circleminusiconprimary = 2131230972;
      public static final int design_components_icon_native_redesign_generated_images_circleminusiconsecondary = 2131230973;
      public static final int design_components_icon_native_redesign_generated_images_circleplayiconprimary = 2131230974;
      public static final int design_components_icon_native_redesign_generated_images_circleplayiconsecondary = 2131230975;
      public static final int design_components_icon_native_redesign_generated_images_circleplusiconprimary = 2131230976;
      public static final int design_components_icon_native_redesign_generated_images_circleplusiconsecondary = 2131230977;
      public static final int design_components_icon_native_redesign_generated_images_circlequestionicon = 2131230978;
      public static final int design_components_icon_native_redesign_generated_images_circlequestioniconprimary = 2131230979;
      public static final int design_components_icon_native_redesign_generated_images_circlequestioniconsecondary = 2131230980;
      public static final int design_components_icon_native_redesign_generated_images_circlewarningicon = 2131230981;
      public static final int design_components_icon_native_redesign_generated_images_circlewarningiconprimary = 2131230982;
      public static final int design_components_icon_native_redesign_generated_images_circlewarningiconsecondary = 2131230983;
      public static final int design_components_icon_native_redesign_generated_images_circlexicon = 2131230984;
      public static final int design_components_icon_native_redesign_generated_images_circlexiconprimary = 2131230985;
      public static final int design_components_icon_native_redesign_generated_images_circlexiconsecondary = 2131230986;
      public static final int design_components_icon_native_redesign_generated_images_clipboardlisticon = 2131230987;
      public static final int design_components_icon_native_redesign_generated_images_clipsicon = 2131230988;
      public static final int design_components_icon_native_redesign_generated_images_clockicon = 2131230989;
      public static final int design_components_icon_native_redesign_generated_images_clockwarningicon = 2131230990;
      public static final int design_components_icon_native_redesign_generated_images_clockxicon = 2131230991;
      public static final int design_components_icon_native_redesign_generated_images_clydeicon = 2131230992;
      public static final int design_components_icon_native_redesign_generated_images_compassicon = 2131230993;
      public static final int design_components_icon_native_redesign_generated_images_connectionaverageicon = 2131230994;
      public static final int design_components_icon_native_redesign_generated_images_connectionbadicon = 2131230995;
      public static final int design_components_icon_native_redesign_generated_images_connectionfineicon = 2131230996;
      public static final int design_components_icon_native_redesign_generated_images_connectionunknownicon = 2131230997;
      public static final int design_components_icon_native_redesign_generated_images_copyicon = 2131230998;
      public static final int design_components_icon_native_redesign_generated_images_crunchyrollneutralicon = 2131230999;
      public static final int design_components_icon_native_redesign_generated_images_denyicon = 2131231000;
      public static final int design_components_icon_native_redesign_generated_images_doorexiticon = 2131231001;
      public static final int design_components_icon_native_redesign_generated_images_downloadicon = 2131231002;
      public static final int design_components_icon_native_redesign_generated_images_dragicon = 2131231003;
      public static final int design_components_icon_native_redesign_generated_images_embedicon = 2131231004;
      public static final int design_components_icon_native_redesign_generated_images_envelopeicon = 2131231005;
      public static final int design_components_icon_native_redesign_generated_images_eyedroppericon = 2131231006;
      public static final int design_components_icon_native_redesign_generated_images_eyeicon = 2131231007;
      public static final int design_components_icon_native_redesign_generated_images_eyeslashicon = 2131231008;
      public static final int design_components_icon_native_redesign_generated_images_facebookneutralicon = 2131231009;
      public static final int design_components_icon_native_redesign_generated_images_fileicon = 2131231010;
      public static final int design_components_icon_native_redesign_generated_images_fileupicon = 2131231011;
      public static final int design_components_icon_native_redesign_generated_images_filtershorizontalicon = 2131231012;
      public static final int design_components_icon_native_redesign_generated_images_fireicon = 2131231013;
      public static final int design_components_icon_native_redesign_generated_images_flagicon = 2131231014;
      public static final int design_components_icon_native_redesign_generated_images_flashicon = 2131231015;
      public static final int design_components_icon_native_redesign_generated_images_foldericon = 2131231016;
      public static final int design_components_icon_native_redesign_generated_images_foodicon = 2131231017;
      public static final int design_components_icon_native_redesign_generated_images_forumicon = 2131231018;
      public static final int design_components_icon_native_redesign_generated_images_forumlockicon = 2131231019;
      public static final int design_components_icon_native_redesign_generated_images_forumwarningicon = 2131231020;
      public static final int design_components_icon_native_redesign_generated_images_friendsicon = 2131231021;
      public static final int design_components_icon_native_redesign_generated_images_gamecontrollericon = 2131231022;
      public static final int design_components_icon_native_redesign_generated_images_gificon = 2131231023;
      public static final int design_components_icon_native_redesign_generated_images_gifticon = 2131231024;
      public static final int design_components_icon_native_redesign_generated_images_globeearthicon = 2131231025;
      public static final int design_components_icon_native_redesign_generated_images_grouparrowdownicon = 2131231026;
      public static final int design_components_icon_native_redesign_generated_images_groupicon = 2131231027;
      public static final int design_components_icon_native_redesign_generated_images_groupplusicon = 2131231028;
      public static final int design_components_icon_native_redesign_generated_images_hammericon = 2131231029;
      public static final int design_components_icon_native_redesign_generated_images_handrequestspeakicon = 2131231030;
      public static final int design_components_icon_native_redesign_generated_images_handrequestspeaklisticon = 2131231031;
      public static final int design_components_icon_native_redesign_generated_images_headphonesdenyicon = 2131231032;
      public static final int design_components_icon_native_redesign_generated_images_headphonesicon = 2131231033;
      public static final int design_components_icon_native_redesign_generated_images_headphonesslashicon = 2131231034;
      public static final int design_components_icon_native_redesign_generated_images_hearticon = 2131231035;
      public static final int design_components_icon_native_redesign_generated_images_homeicon = 2131231036;
      public static final int design_components_icon_native_redesign_generated_images_hubicon = 2131231037;
      public static final int design_components_icon_native_redesign_generated_images_idicon = 2131231038;
      public static final int design_components_icon_native_redesign_generated_images_imagefileicon = 2131231039;
      public static final int design_components_icon_native_redesign_generated_images_imageicon = 2131231040;
      public static final int design_components_icon_native_redesign_generated_images_imagelockicon = 2131231041;
      public static final int design_components_icon_native_redesign_generated_images_imageplusicon = 2131231042;
      public static final int design_components_icon_native_redesign_generated_images_imagetexticon = 2131231043;
      public static final int design_components_icon_native_redesign_generated_images_imagewarningicon = 2131231044;
      public static final int design_components_icon_native_redesign_generated_images_instagramneutralicon = 2131231045;
      public static final int design_components_icon_native_redesign_generated_images_keyboardicon = 2131231046;
      public static final int design_components_icon_native_redesign_generated_images_keyicon = 2131231047;
      public static final int design_components_icon_native_redesign_generated_images_languageicon = 2131231048;
      public static final int design_components_icon_native_redesign_generated_images_laptopphoneicon = 2131231049;
      public static final int design_components_icon_native_redesign_generated_images_lightbulbicon = 2131231050;
      public static final int design_components_icon_native_redesign_generated_images_linkexternalmediumicon = 2131231051;
      public static final int design_components_icon_native_redesign_generated_images_linkexternalsmallicon = 2131231052;
      public static final int design_components_icon_native_redesign_generated_images_linkicon = 2131231053;
      public static final int design_components_icon_native_redesign_generated_images_listbulletsicon = 2131231054;
      public static final int design_components_icon_native_redesign_generated_images_locationicon = 2131231055;
      public static final int design_components_icon_native_redesign_generated_images_lockicon = 2131231056;
      public static final int design_components_icon_native_redesign_generated_images_lockunlockedicon = 2131231057;
      public static final int design_components_icon_native_redesign_generated_images_magicwandicon = 2131231058;
      public static final int design_components_icon_native_redesign_generated_images_magnifyingglassicon = 2131231059;
      public static final int design_components_icon_native_redesign_generated_images_microphonearrowrighticon = 2131231060;
      public static final int design_components_icon_native_redesign_generated_images_microphonedenyicon = 2131231061;
      public static final int design_components_icon_native_redesign_generated_images_microphoneicon = 2131231062;
      public static final int design_components_icon_native_redesign_generated_images_microphoneslashicon = 2131231063;
      public static final int design_components_icon_native_redesign_generated_images_mobilephoneicon = 2131231064;
      public static final int design_components_icon_native_redesign_generated_images_moderationicon = 2131231065;
      public static final int design_components_icon_native_redesign_generated_images_morehorizontalicon = 2131231066;
      public static final int design_components_icon_native_redesign_generated_images_musicicon = 2131231067;
      public static final int design_components_icon_native_redesign_generated_images_musicslashicon = 2131231068;
      public static final int design_components_icon_native_redesign_generated_images_natureicon = 2131231069;
      public static final int design_components_icon_native_redesign_generated_images_newusericon = 2131231070;
      public static final int design_components_icon_native_redesign_generated_images_nintendoswitchneutralicon = 2131231071;
      public static final int design_components_icon_native_redesign_generated_images_nitrowheelicon = 2131231072;
      public static final int design_components_icon_native_redesign_generated_images_objecticon = 2131231073;
      public static final int design_components_icon_native_redesign_generated_images_paintpaletteicon = 2131231074;
      public static final int design_components_icon_native_redesign_generated_images_papericon = 2131231075;
      public static final int design_components_icon_native_redesign_generated_images_pauseicon = 2131231076;
      public static final int design_components_icon_native_redesign_generated_images_pencilicon = 2131231077;
      public static final int design_components_icon_native_redesign_generated_images_pencilsparkleicon = 2131231078;
      public static final int design_components_icon_native_redesign_generated_images_phonecallicon = 2131231079;
      public static final int design_components_icon_native_redesign_generated_images_phonehangupicon = 2131231080;
      public static final int design_components_icon_native_redesign_generated_images_pinicon = 2131231081;
      public static final int design_components_icon_native_redesign_generated_images_playicon = 2131231082;
      public static final int design_components_icon_native_redesign_generated_images_playstationneutralicon = 2131231083;
      public static final int design_components_icon_native_redesign_generated_images_pluslargeicon = 2131231084;
      public static final int design_components_icon_native_redesign_generated_images_plussmallicon = 2131231085;
      public static final int design_components_icon_native_redesign_generated_images_pollsicon = 2131231086;
      public static final int design_components_icon_native_redesign_generated_images_puzzlepieceicon = 2131231087;
      public static final int design_components_icon_native_redesign_generated_images_qrcodeicon = 2131231088;
      public static final int design_components_icon_native_redesign_generated_images_questsicon = 2131231089;
      public static final int design_components_icon_native_redesign_generated_images_reactionicon = 2131231090;
      public static final int design_components_icon_native_redesign_generated_images_refreshicon = 2131231091;
      public static final int design_components_icon_native_redesign_generated_images_retryicon = 2131231092;
      public static final int design_components_icon_native_redesign_generated_images_roboticon = 2131231093;
      public static final int design_components_icon_native_redesign_generated_images_scienceicon = 2131231094;
      public static final int design_components_icon_native_redesign_generated_images_screenarrowicon = 2131231095;
      public static final int design_components_icon_native_redesign_generated_images_screenicon = 2131231096;
      public static final int design_components_icon_native_redesign_generated_images_screenstreamicon = 2131231097;
      public static final int design_components_icon_native_redesign_generated_images_screenxicon = 2131231098;
      public static final int design_components_icon_native_redesign_generated_images_sendmessageicon = 2131231099;
      public static final int design_components_icon_native_redesign_generated_images_servergridicon = 2131231100;
      public static final int design_components_icon_native_redesign_generated_images_servericon = 2131231101;
      public static final int design_components_icon_native_redesign_generated_images_settingsicon = 2131231102;
      public static final int design_components_icon_native_redesign_generated_images_settingsinfoicon = 2131231103;
      public static final int design_components_icon_native_redesign_generated_images_shareicon = 2131231104;
      public static final int design_components_icon_native_redesign_generated_images_shieldicon = 2131231105;
      public static final int design_components_icon_native_redesign_generated_images_shieldlockicon = 2131231106;
      public static final int design_components_icon_native_redesign_generated_images_shieldusericon = 2131231107;
      public static final int design_components_icon_native_redesign_generated_images_shopicon = 2131231108;
      public static final int design_components_icon_native_redesign_generated_images_shopsparkleicon = 2131231109;
      public static final int design_components_icon_native_redesign_generated_images_signposticon = 2131231110;
      public static final int design_components_icon_native_redesign_generated_images_slashboxicon = 2131231111;
      public static final int design_components_icon_native_redesign_generated_images_soundboardicon = 2131231112;
      public static final int design_components_icon_native_redesign_generated_images_soundboardslashicon = 2131231113;
      public static final int design_components_icon_native_redesign_generated_images_sparklesicon = 2131231114;
      public static final int design_components_icon_native_redesign_generated_images_spoilericon = 2131231115;
      public static final int design_components_icon_native_redesign_generated_images_staffbadgeicon = 2131231116;
      public static final int design_components_icon_native_redesign_generated_images_stageicon = 2131231117;
      public static final int design_components_icon_native_redesign_generated_images_stagelockicon = 2131231118;
      public static final int design_components_icon_native_redesign_generated_images_stampicon = 2131231119;
      public static final int design_components_icon_native_redesign_generated_images_staricon = 2131231120;
      public static final int design_components_icon_native_redesign_generated_images_staroutlineicon = 2131231121;
      public static final int design_components_icon_native_redesign_generated_images_stickericon = 2131231122;
      public static final int design_components_icon_native_redesign_generated_images_stickerwink2icon = 2131231123;
      public static final int design_components_icon_native_redesign_generated_images_superreactionicon = 2131231124;
      public static final int design_components_icon_native_redesign_generated_images_texticon = 2131231125;
      public static final int design_components_icon_native_redesign_generated_images_textlockicon = 2131231126;
      public static final int design_components_icon_native_redesign_generated_images_textwarningicon = 2131231127;
      public static final int design_components_icon_native_redesign_generated_images_themedarkicon = 2131231128;
      public static final int design_components_icon_native_redesign_generated_images_themelighticon = 2131231129;
      public static final int design_components_icon_native_redesign_generated_images_thememidnighticon = 2131231130;
      public static final int design_components_icon_native_redesign_generated_images_threadicon = 2131231131;
      public static final int design_components_icon_native_redesign_generated_images_threadlockicon = 2131231132;
      public static final int design_components_icon_native_redesign_generated_images_threadplusicon = 2131231133;
      public static final int design_components_icon_native_redesign_generated_images_ticketicon = 2131231134;
      public static final int design_components_icon_native_redesign_generated_images_tiktokneutralicon = 2131231135;
      public static final int design_components_icon_native_redesign_generated_images_timericon = 2131231136;
      public static final int design_components_icon_native_redesign_generated_images_topicsicon = 2131231137;
      public static final int design_components_icon_native_redesign_generated_images_trashicon = 2131231138;
      public static final int design_components_icon_native_redesign_generated_images_treehouseicon = 2131231139;
      public static final int design_components_icon_native_redesign_generated_images_trophyicon = 2131231140;
      public static final int design_components_icon_native_redesign_generated_images_twitterneutralicon = 2131231141;
      public static final int design_components_icon_native_redesign_generated_images_unknowngameicon = 2131231142;
      public static final int design_components_icon_native_redesign_generated_images_uploadicon = 2131231143;
      public static final int design_components_icon_native_redesign_generated_images_usercircleicon = 2131231144;
      public static final int design_components_icon_native_redesign_generated_images_usericon = 2131231145;
      public static final int design_components_icon_native_redesign_generated_images_userminusicon = 2131231146;
      public static final int design_components_icon_native_redesign_generated_images_userplusicon = 2131231147;
      public static final int design_components_icon_native_redesign_generated_images_usersquareicon = 2131231148;
      public static final int design_components_icon_native_redesign_generated_images_userstatusicon = 2131231149;
      public static final int design_components_icon_native_redesign_generated_images_videoicon = 2131231150;
      public static final int design_components_icon_native_redesign_generated_images_videoslashicon = 2131231151;
      public static final int design_components_icon_native_redesign_generated_images_voicelockicon = 2131231152;
      public static final int design_components_icon_native_redesign_generated_images_voicenormalicon = 2131231153;
      public static final int design_components_icon_native_redesign_generated_images_voicewarningicon = 2131231154;
      public static final int design_components_icon_native_redesign_generated_images_voicexicon = 2131231155;
      public static final int design_components_icon_native_redesign_generated_images_warningicon = 2131231156;
      public static final int design_components_icon_native_redesign_generated_images_webhookicon = 2131231157;
      public static final int design_components_icon_native_redesign_generated_images_windowlaunchicon = 2131231158;
      public static final int design_components_icon_native_redesign_generated_images_wrenchicon = 2131231159;
      public static final int design_components_icon_native_redesign_generated_images_xboxneutralicon = 2131231160;
      public static final int design_components_icon_native_redesign_generated_images_xlargeboldicon = 2131231161;
      public static final int design_components_icon_native_redesign_generated_images_xlargeicon = 2131231162;
      public static final int design_components_icon_native_redesign_generated_images_xsmallboldicon = 2131231163;
      public static final int design_components_icon_native_redesign_generated_images_xsmallicon = 2131231164;
      public static final int design_components_icon_native_redesign_generated_images_youtubeneutralicon = 2131231165;
      public static final int design_components_illustration_native_redesign_generated_images_all_darker = 2131231166;
      public static final int design_components_illustration_native_redesign_generated_images_blocked_darker = 2131231167;
      public static final int design_components_illustration_native_redesign_generated_images_channel_setup_darker = 2131231168;
      public static final int design_components_illustration_native_redesign_generated_images_empty_channel_no_text_channels_darker = 2131231169;
      public static final int design_components_illustration_native_redesign_generated_images_empty_server_settings_audit_log_darker = 2131231170;
      public static final int design_components_illustration_native_redesign_generated_images_empty_server_settings_emoji_darker = 2131231171;
      public static final int design_components_illustration_native_redesign_generated_images_feedbackmodalhappydesaturated_darker = 2131231172;
      public static final int design_components_illustration_native_redesign_generated_images_feedbackmodalneutraldesaturated_darker = 2131231173;
      public static final int design_components_illustration_native_redesign_generated_images_feedbackmodalsaddesaturated_darker = 2131231174;
      public static final int design_components_illustration_native_redesign_generated_images_guild_subscription_no_guilds_darker = 2131231175;
      public static final int design_components_illustration_native_redesign_generated_images_guild_subscription_removal_darker = 2131231176;
      public static final int design_components_illustration_native_redesign_generated_images_img_app_crash_darker = 2131231177;
      public static final int design_components_illustration_native_redesign_generated_images_img_baddies_darker = 2131231178;
      public static final int design_components_illustration_native_redesign_generated_images_img_bans_empty_darker = 2131231179;
      public static final int design_components_illustration_native_redesign_generated_images_img_connection_empty_darker = 2131231180;
      public static final int design_components_illustration_native_redesign_generated_images_img_invite_empty_darker = 2131231181;
      public static final int design_components_illustration_native_redesign_generated_images_img_no_results_alt_darker = 2131231182;
      public static final int design_components_illustration_native_redesign_generated_images_img_no_results_darker = 2131231183;
      public static final int design_components_illustration_native_redesign_generated_images_img_nsfw_darker = 2131231184;
      public static final int design_components_illustration_native_redesign_generated_images_img_pins_empty_darker = 2131231185;
      public static final int design_components_illustration_native_redesign_generated_images_img_premium_embed_background_darker = 2131231186;
      public static final int design_components_illustration_native_redesign_generated_images_img_search_empty_darker = 2131231187;
      public static final int design_components_illustration_native_redesign_generated_images_img_spotify_error_darker = 2131231188;
      public static final int design_components_illustration_native_redesign_generated_images_img_stream_ended_darker = 2131231189;
      public static final int design_components_illustration_native_redesign_generated_images_img_stream_failed_darker = 2131231190;
      public static final int design_components_illustration_native_redesign_generated_images_img_text_in_voice_empty_state_darker = 2131231191;
      public static final int design_components_illustration_native_redesign_generated_images_img_top_pattern_darker = 2131231192;
      public static final int design_components_illustration_native_redesign_generated_images_img_verify_phone_darker = 2131231193;
      public static final int design_components_illustration_native_redesign_generated_images_img_what_you_lose_profile_tier1_darker = 2131231194;
      public static final int design_components_illustration_native_redesign_generated_images_img_wump_trash_darker = 2131231195;
      public static final int design_components_illustration_native_redesign_generated_images_intro_header_darker = 2131231196;
      public static final int design_components_illustration_native_redesign_generated_images_no_mutual_friends_darker = 2131231197;
      public static final int design_components_illustration_native_redesign_generated_images_no_mutual_servers_darker = 2131231198;
      public static final int design_components_illustration_native_redesign_generated_images_pending_darker = 2131231199;
      public static final int design_components_illustration_native_redesign_generated_images_subscription_placeholder_pattern_darker = 2131231200;
      public static final int design_components_illustration_native_redesign_generated_images_tier_0_48px_darker = 2131231201;
      public static final int design_components_illustration_native_redesign_generated_images_webhook_empty_darker = 2131231202;
      public static final int design_fab_background = 2131231203;
      public static final int design_ic_visibility = 2131231204;
      public static final int design_ic_visibility_off = 2131231205;
      public static final int design_password_eye = 2131231206;
      public static final int design_snackbar_background = 2131231207;
      public static final int drawable_audio_play_button_gradient_dark = 2131231208;
      public static final int drawable_audio_play_button_gradient_light = 2131231209;
      public static final int drawable_bot_component_divider = 2131231210;
      public static final int drawable_circle = 2131231211;
      public static final int drawable_circle_primary_900 = 2131231212;
      public static final int drawable_circle_white = 2131231213;
      public static final int drawable_message_author_tag_bg = 2131231214;
      public static final int drawable_poll_image_info_card = 2131231215;
      public static final int drawable_voice_message_view = 2131231216;
      public static final int exo_controls_fastforward = 2131231217;
      public static final int exo_controls_fullscreen_enter = 2131231218;
      public static final int exo_controls_fullscreen_exit = 2131231219;
      public static final int exo_controls_next = 2131231220;
      public static final int exo_controls_pause = 2131231221;
      public static final int exo_controls_play = 2131231222;
      public static final int exo_controls_previous = 2131231223;
      public static final int exo_controls_repeat_all = 2131231224;
      public static final int exo_controls_repeat_off = 2131231225;
      public static final int exo_controls_repeat_one = 2131231226;
      public static final int exo_controls_rewind = 2131231227;
      public static final int exo_controls_shuffle_off = 2131231228;
      public static final int exo_controls_shuffle_on = 2131231229;
      public static final int exo_controls_vr = 2131231230;
      public static final int exo_edit_mode_logo = 2131231231;
      public static final int exo_ic_audiotrack = 2131231232;
      public static final int exo_ic_check = 2131231233;
      public static final int exo_ic_chevron_left = 2131231234;
      public static final int exo_ic_chevron_right = 2131231235;
      public static final int exo_ic_default_album_image = 2131231236;
      public static final int exo_ic_forward = 2131231237;
      public static final int exo_ic_fullscreen_enter = 2131231238;
      public static final int exo_ic_fullscreen_exit = 2131231239;
      public static final int exo_ic_pause_circle_filled = 2131231240;
      public static final int exo_ic_play_circle_filled = 2131231241;
      public static final int exo_ic_rewind = 2131231242;
      public static final int exo_ic_settings = 2131231243;
      public static final int exo_ic_skip_next = 2131231244;
      public static final int exo_ic_skip_previous = 2131231245;
      public static final int exo_ic_speed = 2131231246;
      public static final int exo_ic_subtitle_off = 2131231247;
      public static final int exo_ic_subtitle_on = 2131231248;
      public static final int exo_icon_circular_play = 2131231249;
      public static final int exo_icon_fastforward = 2131231250;
      public static final int exo_icon_fullscreen_enter = 2131231251;
      public static final int exo_icon_fullscreen_exit = 2131231252;
      public static final int exo_icon_next = 2131231253;
      public static final int exo_icon_pause = 2131231254;
      public static final int exo_icon_play = 2131231255;
      public static final int exo_icon_previous = 2131231256;
      public static final int exo_icon_repeat_all = 2131231257;
      public static final int exo_icon_repeat_off = 2131231258;
      public static final int exo_icon_repeat_one = 2131231259;
      public static final int exo_icon_rewind = 2131231260;
      public static final int exo_icon_shuffle_off = 2131231261;
      public static final int exo_icon_shuffle_on = 2131231262;
      public static final int exo_icon_stop = 2131231263;
      public static final int exo_icon_vr = 2131231264;
      public static final int exo_notification_fastforward = 2131231265;
      public static final int exo_notification_next = 2131231266;
      public static final int exo_notification_pause = 2131231267;
      public static final int exo_notification_play = 2131231268;
      public static final int exo_notification_previous = 2131231269;
      public static final int exo_notification_rewind = 2131231270;
      public static final int exo_notification_small_icon = 2131231271;
      public static final int exo_notification_stop = 2131231272;
      public static final int exo_rounded_rectangle = 2131231273;
      public static final int exo_styled_controls_audiotrack = 2131231274;
      public static final int exo_styled_controls_check = 2131231275;
      public static final int exo_styled_controls_fastforward = 2131231276;
      public static final int exo_styled_controls_fullscreen_enter = 2131231277;
      public static final int exo_styled_controls_fullscreen_exit = 2131231278;
      public static final int exo_styled_controls_next = 2131231279;
      public static final int exo_styled_controls_overflow_hide = 2131231280;
      public static final int exo_styled_controls_overflow_show = 2131231281;
      public static final int exo_styled_controls_pause = 2131231282;
      public static final int exo_styled_controls_play = 2131231283;
      public static final int exo_styled_controls_previous = 2131231284;
      public static final int exo_styled_controls_repeat_all = 2131231285;
      public static final int exo_styled_controls_repeat_off = 2131231286;
      public static final int exo_styled_controls_repeat_one = 2131231287;
      public static final int exo_styled_controls_rewind = 2131231288;
      public static final int exo_styled_controls_settings = 2131231289;
      public static final int exo_styled_controls_shuffle_off = 2131231290;
      public static final int exo_styled_controls_shuffle_on = 2131231291;
      public static final int exo_styled_controls_speed = 2131231292;
      public static final int exo_styled_controls_subtitle_off = 2131231293;
      public static final int exo_styled_controls_subtitle_on = 2131231294;
      public static final int exo_styled_controls_vr = 2131231295;
      public static final int gcm_icon = 2131231296;
      public static final int gcm_icon2 = 2131231297;
      public static final int googleg_disabled_color_18 = 2131231298;
      public static final int googleg_standard_color_18 = 2131231299;
      public static final int ic_arrow_back_black_24 = 2131231300;
      public static final int ic_call_24dp = 2131231301;
      public static final int ic_call_answer = 2131231302;
      public static final int ic_call_answer_low = 2131231303;
      public static final int ic_call_answer_video = 2131231304;
      public static final int ic_call_answer_video_low = 2131231305;
      public static final int ic_call_decline = 2131231306;
      public static final int ic_call_decline_low = 2131231307;
      public static final int ic_call_disconnect_24dp = 2131231308;
      public static final int ic_check_grey_24dp = 2131231309;
      public static final int ic_clear_black_24 = 2131231310;
      public static final int ic_clock_black_24dp = 2131231311;
      public static final int ic_code_scanner_auto_focus_off = 2131231312;
      public static final int ic_code_scanner_auto_focus_on = 2131231313;
      public static final int ic_code_scanner_flash_off = 2131231314;
      public static final int ic_code_scanner_flash_on = 2131231315;
      public static final int ic_keyboard_black_24dp = 2131231316;
      public static final int ic_link_icon_24dp = 2131231317;
      public static final int ic_m3_chip_check = 2131231318;
      public static final int ic_m3_chip_checked_circle = 2131231319;
      public static final int ic_m3_chip_close = 2131231320;
      public static final int ic_mtrl_checked_circle = 2131231321;
      public static final int ic_mtrl_chip_checked_black = 2131231322;
      public static final int ic_mtrl_chip_checked_circle = 2131231323;
      public static final int ic_mtrl_chip_close_circle = 2131231324;
      public static final int ic_notification_24dp = 2131231325;
      public static final int ic_notification_call_24dp = 2131231326;
      public static final int ic_notification_friends_24dp = 2131231327;
      public static final int ic_notification_message_24dp = 2131231328;
      public static final int ic_notifications_off_24dp = 2131231329;
      public static final int ic_other_sign_in = 2131231330;
      public static final int ic_passkey = 2131231331;
      public static final int ic_password = 2131231332;
      public static final int ic_play_arrow = 2131231333;
      public static final int ic_search_black_24 = 2131231334;
      public static final int ic_send_white_24dp = 2131231335;
      public static final int ic_swipe_edit = 2131231336;
      public static final int ic_swipe_reply = 2131231337;
      public static final int ic_trash_outline = 2131231338;
      public static final int icon_with_gradient = 2131231339;
      public static final int images_auth_backgroundsplashdev = 2131231340;
      public static final int images_auth_backgroundsplashmobile = 2131231341;
      public static final int images_auth_imgauthqrcodeoverlay = 2131231342;
      public static final int images_avatar_placeholder = 2131231343;
      public static final int images_channel_following_channelfollowingbackdropdark = 2131231344;
      public static final int images_channel_following_channelfollowingbackdroplight = 2131231345;
      public static final int images_channel_following_dark_channel_following_success_1 = 2131231346;
      public static final int images_channel_following_dark_channel_following_success_2 = 2131231347;
      public static final int images_channel_following_dark_channel_following_success_3 = 2131231348;
      public static final int images_channel_following_light_channel_following_success_1 = 2131231349;
      public static final int images_channel_following_light_channel_following_success_2 = 2131231350;
      public static final int images_channel_following_light_channel_following_success_3 = 2131231351;
      public static final int images_connectionsprofilesteamdota2 = 2131231352;
      public static final int images_connectionsprofilesteamtf2 = 2131231353;
      public static final int images_consoles_ic_ps4_24px = 2131231354;
      public static final int images_consoles_ic_ps5_24px = 2131231355;
      public static final int images_consoles_link_failure = 2131231356;
      public static final int images_consoles_ps_connect = 2131231357;
      public static final int images_consoles_ps_link_intro = 2131231358;
      public static final int images_consoles_ps_link_success = 2131231359;
      public static final int images_consoles_ps_relink_upsell = 2131231360;
      public static final int images_consoles_xbox_connect = 2131231361;
      public static final int images_consoles_xbox_link_intro = 2131231362;
      public static final int images_consoles_xbox_upsell = 2131231363;
      public static final int images_googleauthlogo = 2131231364;
      public static final int images_group_dms_icon0 = 2131231365;
      public static final int images_group_dms_icon1 = 2131231366;
      public static final int images_group_dms_icon2 = 2131231367;
      public static final int images_group_dms_icon3 = 2131231368;
      public static final int images_group_dms_icon4 = 2131231369;
      public static final int images_group_dms_icon5 = 2131231370;
      public static final int images_group_dms_icon6 = 2131231371;
      public static final int images_group_dms_icon7 = 2131231372;
      public static final int images_native_application_streaming_img_preview_not_available_dark = 2131231373;
      public static final int images_native_application_streaming_img_preview_not_available_light = 2131231374;
      public static final int images_native_application_streaming_img_stream_ended_dark = 2131231375;
      public static final int images_native_application_streaming_img_stream_failed_dark = 2131231376;
      public static final int images_native_application_streaming_img_stream_full = 2131231377;
      public static final int images_native_audit_logs_ic_all_24px = 2131231378;
      public static final int images_native_audit_logs_ic_audit_create_24px = 2131231379;
      public static final int images_native_audit_logs_ic_audit_delete_24px = 2131231380;
      public static final int images_native_audit_logs_ic_audit_update_24px = 2131231381;
      public static final int images_native_audit_logs_ic_calendar_24px = 2131231382;
      public static final int images_native_audit_logs_ic_channels_24px = 2131231383;
      public static final int images_native_audit_logs_ic_chat_24px = 2131231384;
      public static final int images_native_audit_logs_ic_command_24px = 2131231385;
      public static final int images_native_audit_logs_ic_emoji_24px = 2131231386;
      public static final int images_native_audit_logs_ic_guild_update_24px = 2131231387;
      public static final int images_native_audit_logs_ic_integrations_24px = 2131231388;
      public static final int images_native_audit_logs_ic_invites_24px = 2131231389;
      public static final int images_native_audit_logs_ic_members_24px = 2131231390;
      public static final int images_native_audit_logs_ic_onboarding_white_24px = 2131231391;
      public static final int images_native_audit_logs_ic_roles_24px = 2131231392;
      public static final int images_native_audit_logs_ic_soundboard_24px = 2131231393;
      public static final int images_native_audit_logs_ic_stage_instance_24px = 2131231394;
      public static final int images_native_audit_logs_ic_sticker_icon_24px = 2131231395;
      public static final int images_native_audit_logs_ic_thread_24px = 2131231396;
      public static final int images_native_audit_logs_ic_webhook_24px = 2131231397;
      public static final int images_native_auto_moderation_auto_moderation_avatar = 2131231398;
      public static final int images_native_auto_moderation_ic_auto_moderation_shield = 2131231399;
      public static final int images_native_auto_moderation_ic_closed_lock = 2131231400;
      public static final int images_native_avatars_amanda_1 = 2131231401;
      public static final int images_native_avatars_amanda_2 = 2131231402;
      public static final int images_native_avatars_breaddog_1 = 2131231403;
      public static final int images_native_avatars_cap_2 = 2131231404;
      public static final int images_native_avatars_default_avatar_0 = 2131231405;
      public static final int images_native_avatars_default_avatar_1 = 2131231406;
      public static final int images_native_avatars_default_avatar_2 = 2131231407;
      public static final int images_native_avatars_default_avatar_3 = 2131231408;
      public static final int images_native_avatars_default_avatar_4 = 2131231409;
      public static final int images_native_avatars_default_avatar_5 = 2131231410;
      public static final int images_native_avatars_graggle_2 = 2131231411;
      public static final int images_native_avatars_locke_2 = 2131231412;
      public static final int images_native_avatars_mac_2 = 2131231413;
      public static final int images_native_avatars_mallow_1 = 2131231414;
      public static final int images_native_avatars_nelly_1 = 2131231415;
      public static final int images_native_avatars_phibi_1 = 2131231416;
      public static final int images_native_avatars_wumpus_1 = 2131231417;
      public static final int images_native_badge_ic_badge_nitro = 2131231418;
      public static final int images_native_badge_ic_badge_staff = 2131231419;
      public static final int images_native_badge_ic_profile_badge_active_developer = 2131231420;
      public static final int images_native_captcha_header = 2131231421;
      public static final int images_native_chat_sidebar_ic_close = 2131231422;
      public static final int images_native_chat_sidebar_ic_new_pins = 2131231423;
      public static final int images_native_chat_sidebar_ic_new_pins_light = 2131231424;
      public static final int images_native_chat_sidebar_ic_notif = 2131231425;
      public static final int images_native_chat_sidebar_ic_notif_off = 2131231426;
      public static final int images_native_chat_sidebar_ic_pins = 2131231427;
      public static final int images_native_chat_sidebar_ic_settings = 2131231428;
      public static final int images_native_community_customize_empty = 2131231429;
      public static final int images_native_community_customize_empty_light = 2131231430;
      public static final int images_native_community_icapplicationrejected = 2131231431;
      public static final int images_native_community_icapplicationrequired = 2131231432;
      public static final int images_native_community_icapplicationsubmitted = 2131231433;
      public static final int images_native_community_pendingalert = 2131231434;
      public static final int images_native_community_rejectedalert = 2131231435;
      public static final int images_native_custom_app_icons_angryicon_angryicon = 2131231436;
      public static final int images_native_custom_app_icons_appicon_appicon = 2131231437;
      public static final int images_native_custom_app_icons_beanieicon_beanieicon = 2131231438;
      public static final int images_native_custom_app_icons_blurpletwilighticon_blurpletwilighticon = 2131231439;
      public static final int images_native_custom_app_icons_blushicon_blushicon = 2131231440;
      public static final int images_native_custom_app_icons_branddarkicon_branddarkicon = 2131231441;
      public static final int images_native_custom_app_icons_brandinvertedicon_brandinvertedicon = 2131231442;
      public static final int images_native_custom_app_icons_camoicon_camoicon = 2131231443;
      public static final int images_native_custom_app_icons_cherryblossomicon_cherryblossomicon = 2131231444;
      public static final int images_native_custom_app_icons_circuiticon_circuiticon = 2131231445;
      public static final int images_native_custom_app_icons_colorwaveicon_colorwaveicon = 2131231446;
      public static final int images_native_custom_app_icons_controllericon_controllericon = 2131231447;
      public static final int images_native_custom_app_icons_galaxyicon_galaxyicon = 2131231448;
      public static final int images_native_custom_app_icons_gamingicon_gamingicon = 2131231449;
      public static final int images_native_custom_app_icons_holowavesicon_holowavesicon = 2131231450;
      public static final int images_native_custom_app_icons_inrainbowsicon_inrainbowsicon = 2131231451;
      public static final int images_native_custom_app_icons_mangaicon_mangaicon = 2131231452;
      public static final int images_native_custom_app_icons_mattedarkicon_mattedarkicon = 2131231453;
      public static final int images_native_custom_app_icons_mattelighticon_mattelighticon = 2131231454;
      public static final int images_native_custom_app_icons_midnightprismicon_midnightprismicon = 2131231455;
      public static final int images_native_custom_app_icons_mushroomicon_mushroomicon = 2131231456;
      public static final int images_native_custom_app_icons_pastelicon_pastelicon = 2131231457;
      public static final int images_native_custom_app_icons_pirateicon_pirateicon = 2131231458;
      public static final int images_native_custom_app_icons_sunseticon_sunseticon = 2131231459;
      public static final int images_native_custom_app_icons_y2kicon_y2kicon = 2131231460;
      public static final int images_native_custom_status_customstatusillustration = 2131231461;
      public static final int images_native_defaultbannerdark = 2131231462;
      public static final int images_native_defaultbannerlight = 2131231463;
      public static final int images_native_discover_discover = 2131231464;
      public static final int images_native_emoji_ic_emoji_recent_color_24px = 2131231465;
      public static final int images_native_emoji_ic_keyboard_24px = 2131231466;
      public static final int images_native_empties_all_dark = 2131231467;
      public static final int images_native_empties_all_light = 2131231468;
      public static final int images_native_empties_app_dock_no_permissions_dark = 2131231469;
      public static final int images_native_empties_app_dock_no_permissions_light = 2131231470;
      public static final int images_native_empties_app_dock_no_search_results_dark = 2131231471;
      public static final int images_native_empties_app_dock_no_search_results_light = 2131231472;
      public static final int images_native_empties_app_dock_not_found_dark = 2131231473;
      public static final int images_native_empties_app_dock_not_found_light = 2131231474;
      public static final int images_native_empties_blocked_dark = 2131231475;
      public static final int images_native_empties_blocked_light = 2131231476;
      public static final int images_native_empties_empty_add_recipient = 2131231477;
      public static final int images_native_empties_empty_channel_no_text_channels_dark = 2131231478;
      public static final int images_native_empties_empty_channel_no_text_channels_light = 2131231479;
      public static final int images_native_empties_empty_dms_activities = 2131231480;
      public static final int images_native_empties_empty_expanded_friend_list_dark = 2131231481;
      public static final int images_native_empties_empty_expanded_friend_list_light = 2131231482;
      public static final int images_native_empties_empty_friends = 2131231483;
      public static final int images_native_empties_empty_friends_cta = 2131231484;
      public static final int images_native_empties_empty_instant_invite_friends = 2131231485;
      public static final int images_native_empties_empty_mentions = 2131231486;
      public static final int images_native_empties_empty_quest_home = 2131231487;
      public static final int images_native_empties_empty_quick_switcher = 2131231488;
      public static final int images_native_empties_empty_server_settings_audit_log_dark = 2131231489;
      public static final int images_native_empties_empty_server_settings_audit_log_light = 2131231490;
      public static final int images_native_empties_empty_server_settings_emoji_dark = 2131231491;
      public static final int images_native_empties_empty_server_settings_emoji_light = 2131231492;
      public static final int images_native_empties_empty_voice_channel = 2131231493;
      public static final int images_native_empties_img_app_crash_dark = 2131231494;
      public static final int images_native_empties_img_app_crash_light = 2131231495;
      public static final int images_native_empties_img_bans_empty_dark = 2131231496;
      public static final int images_native_empties_img_bans_empty_light = 2131231497;
      public static final int images_native_empties_img_connection_empty_dark = 2131231498;
      public static final int images_native_empties_img_connection_empty_light = 2131231499;
      public static final int images_native_empties_img_invite_empty_dark = 2131231500;
      public static final int images_native_empties_img_invite_empty_light = 2131231501;
      public static final int images_native_empties_img_no_results_dark = 2131231502;
      public static final int images_native_empties_img_no_results_light = 2131231503;
      public static final int images_native_empties_img_pins_empty_dark = 2131231504;
      public static final int images_native_empties_img_pins_empty_light = 2131231505;
      public static final int images_native_empties_no_mutual_friends_dark = 2131231506;
      public static final int images_native_empties_no_mutual_friends_light = 2131231507;
      public static final int images_native_empties_no_mutual_servers_dark = 2131231508;
      public static final int images_native_empties_no_mutual_servers_light = 2131231509;
      public static final int images_native_empties_pending_dark = 2131231510;
      public static final int images_native_empties_pending_light = 2131231511;
      public static final int images_native_empties_search_empty_state_dark = 2131231512;
      public static final int images_native_empties_search_empty_state_light = 2131231513;
      public static final int images_native_empties_webhook_empty_dark = 2131231514;
      public static final int images_native_empties_webhook_empty_light = 2131231515;
      public static final int images_native_empties_wumpus_cleaning = 2131231516;
      public static final int images_native_forum_channels_channel_settings_grid_view_example_post = 2131231517;
      public static final int images_native_forum_channels_channel_settings_list_view_example_post = 2131231518;
      public static final int images_native_game_icon_placeholder = 2131231519;
      public static final int images_native_genericscreenshareicon = 2131231520;
      public static final int images_native_gif = 2131231521;
      public static final int images_native_gifting_img_premium_basic_icon = 2131231522;
      public static final int images_native_gifting_img_premium_classic_icon_80px = 2131231523;
      public static final int images_native_gifting_img_premium_embed_background_dark = 2131231524;
      public static final int images_native_gifting_img_premium_embed_background_light = 2131231525;
      public static final int images_native_gifting_img_premium_icon_80px = 2131231526;
      public static final int images_native_gifting_seasonal_box_idle = 2131231527;
      public static final int images_native_gifting_seasonal_cake_idle = 2131231528;
      public static final int images_native_gifting_seasonal_chest_idle = 2131231529;
      public static final int images_native_gifting_seasonal_coffee_idle = 2131231530;
      public static final int images_native_gifting_standard_box_idle = 2131231531;
      public static final int images_native_gifting_standard_cake_idle = 2131231532;
      public static final int images_native_gifting_standard_chest_idle = 2131231533;
      public static final int images_native_gifting_standard_coffee_idle = 2131231534;
      public static final int images_native_gifting_standard_confetti = 2131231535;
      public static final int images_native_gifting_wumpus_box_premium120 = 2131231536;
      public static final int images_native_gifting_wumpus_cup_premium120 = 2131231537;
      public static final int images_native_gifting_wumpus_snowglobe_premium120 = 2131231538;
      public static final int images_native_gradient_overlays_chat_dark = 2131231539;
      public static final int images_native_gradient_overlays_chat_light = 2131231540;
      public static final int images_native_gradient_overlays_chat_medium = 2131231541;
      public static final int images_native_groupsfull = 2131231542;
      public static final int images_native_guild_role_subscription_image_role_subscription_badge = 2131231543;
      public static final int images_native_guild_role_subscription_image_role_subscription_lanyard = 2131231544;
      public static final int images_native_guild_role_subscription_image_role_subscription_purchase_card_bg = 2131231545;
      public static final int images_native_guild_settings_community_settings_channel_setup = 2131231546;
      public static final int images_native_guild_settings_community_settings_channel_setup_light = 2131231547;
      public static final int images_native_guild_settings_community_settings_finishing_touches = 2131231548;
      public static final int images_native_guild_settings_community_settings_finishing_touches_light = 2131231549;
      public static final int images_native_guild_settings_community_settings_intro_header_dark = 2131231550;
      public static final int images_native_guild_settings_community_settings_intro_header_light = 2131231551;
      public static final int images_native_guild_settings_community_settings_safety_check = 2131231552;
      public static final int images_native_guild_settings_community_settings_safety_check_light = 2131231553;
      public static final int images_native_guild_settings_overview_asset_gradient = 2131231554;
      public static final int images_native_guild_sidebar_img_create_guild = 2131231555;
      public static final int images_native_guild_sidebar_img_guild_folder = 2131231556;
      public static final int images_native_guild_sidebar_img_help_icon = 2131231557;
      public static final int images_native_ic_add_reaction_v2 = 2131231558;
      public static final int images_native_ic_add_super_reaction = 2131231559;
      public static final int images_native_ic_arrow_right = 2131231560;
      public static final int images_native_ic_back_chevron = 2131231561;
      public static final int images_native_ic_browse_channel = 2131231562;
      public static final int images_native_ic_call_status_green_24px = 2131231563;
      public static final int images_native_ic_call_status_red_24px = 2131231564;
      public static final int images_native_ic_call_status_unknown_24px = 2131231565;
      public static final int images_native_ic_call_status_yellow_24px = 2131231566;
      public static final int images_native_ic_cell_remove = 2131231567;
      public static final int images_native_ic_copy_id = 2131231568;
      public static final int images_native_ic_copy_message_link = 2131231569;
      public static final int images_native_ic_custom_color = 2131231570;
      public static final int images_native_ic_disclosure_grey = 2131231571;
      public static final int images_native_ic_dm_user = 2131231572;
      public static final int images_native_ic_drag_icon_24px = 2131231573;
      public static final int images_native_ic_expand_more_24px = 2131231574;
      public static final int images_native_ic_flower_star_18px = 2131231575;
      public static final int images_native_ic_flower_star_24px = 2131231576;
      public static final int images_native_ic_forward_chevron = 2131231577;
      public static final int images_native_ic_group_edit_18px = 2131231578;
      public static final int images_native_ic_invite = 2131231579;
      public static final int images_native_ic_invites_disabled = 2131231580;
      public static final int images_native_ic_launch = 2131231581;
      public static final int images_native_ic_mark_unread = 2131231582;
      public static final int images_native_ic_mention_user = 2131231583;
      public static final int images_native_ic_message_copy = 2131231584;
      public static final int images_native_ic_message_delete = 2131231585;
      public static final int images_native_ic_message_edit = 2131231586;
      public static final int images_native_ic_message_pin = 2131231587;
      public static final int images_native_ic_message_retry = 2131231588;
      public static final int images_native_ic_reaction_smile = 2131231589;
      public static final int images_native_ic_report_message = 2131231590;
      public static final int images_native_ic_selection_checked_24px = 2131231591;
      public static final int images_native_ic_selection_none_24px = 2131231592;
      public static final int images_native_ic_spotify_white_16px = 2131231593;
      public static final int images_native_ic_table_arrow_down = 2131231594;
      public static final int images_native_ic_table_arrow_right = 2131231595;
      public static final int images_native_ic_table_arrow_up = 2131231596;
      public static final int images_native_ic_upload = 2131231597;
      public static final int images_native_ic_verified_check_18px = 2131231598;
      public static final int images_native_ic_verified_check_24px = 2131231599;
      public static final int images_native_iconafk = 2131231600;
      public static final int images_native_icongroup = 2131231601;
      public static final int images_native_icons_add_white = 2131231602;
      public static final int images_native_icons_audio = 2131231603;
      public static final int images_native_icons_border_left_radius = 2131231604;
      public static final int images_native_icons_camera_upload = 2131231605;
      public static final int images_native_icons_camera_upload_light = 2131231606;
      public static final int images_native_icons_check = 2131231607;
      public static final int images_native_icons_discovery_20px = 2131231608;
      public static final int images_native_icons_empty_channel_add_friend_32px = 2131231609;
      public static final int images_native_icons_empty_channel_guild_progress_32px = 2131231610;
      public static final int images_native_icons_empty_channel_personalize_32px = 2131231611;
      public static final int images_native_icons_empty_channel_send_message_32px = 2131231612;
      public static final int images_native_icons_header_arrow_right = 2131231613;
      public static final int images_native_icons_ic_1password_24px = 2131231614;
      public static final int images_native_icons_ic_activity_24px = 2131231615;
      public static final int images_native_icons_ic_add_18px = 2131231616;
      public static final int images_native_icons_ic_add_24px = 2131231617;
      public static final int images_native_icons_ic_add_circle = 2131231618;
      public static final int images_native_icons_ic_add_text = 2131231619;
      public static final int images_native_icons_ic_alert = 2131231620;
      public static final int images_native_icons_ic_analytics_bubble_24px = 2131231621;
      public static final int images_native_icons_ic_application_command_24px = 2131231622;
      public static final int images_native_icons_ic_application_command_built_in = 2131231623;
      public static final int images_native_icons_ic_archived_thread_embed_16px = 2131231624;
      public static final int images_native_icons_ic_arrow_back_24px = 2131231625;
      public static final int images_native_icons_ic_arrow_down = 2131231626;
      public static final int images_native_icons_ic_arrow_forward_24px = 2131231627;
      public static final int images_native_icons_ic_at = 2131231628;
      public static final int images_native_icons_ic_audit_log_24px = 2131231629;
      public static final int images_native_icons_ic_ban_24px = 2131231630;
      public static final int images_native_icons_ic_big_arrow_down = 2131231631;
      public static final int images_native_icons_ic_bulb = 2131231632;
      public static final int images_native_icons_ic_call_ended = 2131231633;
      public static final int images_native_icons_ic_camera_white = 2131231634;
      public static final int images_native_icons_ic_caret_24px = 2131231635;
      public static final int images_native_icons_ic_category_16px = 2131231636;
      public static final int images_native_icons_ic_channel_arrow = 2131231637;
      public static final int images_native_icons_ic_channel_arrow_collapsed_24px = 2131231638;
      public static final int images_native_icons_ic_channel_browse = 2131231639;
      public static final int images_native_icons_ic_channels_24px = 2131231640;
      public static final int images_native_icons_ic_chat_bubble_16px = 2131231641;
      public static final int images_native_icons_ic_chat_bubble_32px = 2131231642;
      public static final int images_native_icons_ic_check_18px = 2131231643;
      public static final int images_native_icons_ic_check_24px = 2131231644;
      public static final int images_native_icons_ic_checkmark = 2131231645;
      public static final int images_native_icons_ic_chevron_down_24px = 2131231646;
      public static final int images_native_icons_ic_chevron_up_24px = 2131231647;
      public static final int images_native_icons_ic_clear = 2131231648;
      public static final int images_native_icons_ic_clear_all_24px = 2131231649;
      public static final int images_native_icons_ic_clock_timeout_16px = 2131231650;
      public static final int images_native_icons_ic_close = 2131231651;
      public static final int images_native_icons_ic_close_16px = 2131231652;
      public static final int images_native_icons_ic_close_18px = 2131231653;
      public static final int images_native_icons_ic_close_24px = 2131231654;
      public static final int images_native_icons_ic_close_circle = 2131231655;
      public static final int images_native_icons_ic_close_circle_24px = 2131231656;
      public static final int images_native_icons_ic_cog_24px = 2131231657;
      public static final int images_native_icons_ic_community_24px = 2131231658;
      public static final int images_native_icons_ic_community_guild_badge_dark_24px = 2131231659;
      public static final int images_native_icons_ic_community_guild_badge_light_24px = 2131231660;
      public static final int images_native_icons_ic_community_guild_badge_premium_24px = 2131231661;
      public static final int images_native_icons_ic_compose_24px = 2131231662;
      public static final int images_native_icons_ic_content_warning_32px = 2131231663;
      public static final int images_native_icons_ic_controller_24px = 2131231664;
      public static final int images_native_icons_ic_crop = 2131231665;
      public static final int images_native_icons_ic_crown_16px = 2131231666;
      public static final int images_native_icons_ic_custom_app_icons_24px = 2131231667;
      public static final int images_native_icons_ic_discoverable_globe_guild_badge_light = 2131231668;
      public static final int images_native_icons_ic_discoverable_guild_badge_dark_24px = 2131231669;
      public static final int images_native_icons_ic_discoverable_guild_badge_light_24px = 2131231670;
      public static final int images_native_icons_ic_discoverable_guild_badge_premium_24px = 2131231671;
      public static final int images_native_icons_ic_download_24px = 2131231672;
      public static final int images_native_icons_ic_duplicate = 2131231673;
      public static final int images_native_icons_ic_emoji_24px = 2131231674;
      public static final int images_native_icons_ic_emoji_wink_24px = 2131231675;
      public static final int images_native_icons_ic_feedback = 2131231676;
      public static final int images_native_icons_ic_feedback_dark = 2131231677;
      public static final int images_native_icons_ic_file_small_acrobat = 2131231678;
      public static final int images_native_icons_ic_file_small_ae = 2131231679;
      public static final int images_native_icons_ic_file_small_ai = 2131231680;
      public static final int images_native_icons_ic_file_small_archive = 2131231681;
      public static final int images_native_icons_ic_file_small_audio = 2131231682;
      public static final int images_native_icons_ic_file_small_code = 2131231683;
      public static final int images_native_icons_ic_file_small_document = 2131231684;
      public static final int images_native_icons_ic_file_small_image = 2131231685;
      public static final int images_native_icons_ic_file_small_ps = 2131231686;
      public static final int images_native_icons_ic_file_small_sketch = 2131231687;
      public static final int images_native_icons_ic_file_small_spreadsheet = 2131231688;
      public static final int images_native_icons_ic_file_small_unknown = 2131231689;
      public static final int images_native_icons_ic_file_small_video = 2131231690;
      public static final int images_native_icons_ic_file_small_webcode = 2131231691;
      public static final int images_native_icons_ic_file_text = 2131231692;
      public static final int images_native_icons_ic_file_upload_24px = 2131231693;
      public static final int images_native_icons_ic_filter_24px = 2131231694;
      public static final int images_native_icons_ic_flag_24px = 2131231695;
      public static final int images_native_icons_ic_folder_add_24px = 2131231696;
      public static final int images_native_icons_ic_forum_channel_list_view_24px = 2131231697;
      public static final int images_native_icons_ic_forum_channel_sort_order_24px = 2131231698;
      public static final int images_native_icons_ic_forward_24px = 2131231699;
      public static final int images_native_icons_ic_friend_request_accepted = 2131231700;
      public static final int images_native_icons_ic_friend_wave_24px = 2131231701;
      public static final int images_native_icons_ic_funnel = 2131231702;
      public static final int images_native_icons_ic_gear = 2131231703;
      public static final int images_native_icons_ic_gif_24px = 2131231704;
      public static final int images_native_icons_ic_gift = 2131231705;
      public static final int images_native_icons_ic_grid_24px = 2131231706;
      public static final int images_native_icons_ic_group_dm = 2131231707;
      public static final int images_native_icons_ic_guild_grid_24px = 2131231708;
      public static final int images_native_icons_ic_guild_video_24px = 2131231709;
      public static final int images_native_icons_ic_guild_voice_24px = 2131231710;
      public static final int images_native_icons_ic_hammer_and_chisel_24px = 2131231711;
      public static final int images_native_icons_ic_header_members_24px = 2131231712;
      public static final int images_native_icons_ic_header_members_add_24px = 2131231713;
      public static final int images_native_icons_ic_headset_24px = 2131231714;
      public static final int images_native_icons_ic_headset_deafened_24px = 2131231715;
      public static final int images_native_icons_ic_headset_deafened_dark_24px = 2131231716;
      public static final int images_native_icons_ic_headset_neutral = 2131231717;
      public static final int images_native_icons_ic_hide_24px = 2131231718;
      public static final int images_native_icons_ic_hide_password = 2131231719;
      public static final int images_native_icons_ic_history_24px = 2131231720;
      public static final int images_native_icons_ic_home = 2131231721;
      public static final int images_native_icons_ic_icon_upload = 2131231722;
      public static final int images_native_icons_ic_image = 2131231723;
      public static final int images_native_icons_ic_image_upload = 2131231724;
      public static final int images_native_icons_ic_information_24px = 2131231725;
      public static final int images_native_icons_ic_information_filled_24px = 2131231726;
      public static final int images_native_icons_ic_input_clear_24px = 2131231727;
      public static final int images_native_icons_ic_integrations_24px = 2131231728;
      public static final int images_native_icons_ic_leave_24px = 2131231729;
      public static final int images_native_icons_ic_link = 2131231730;
      public static final int images_native_icons_ic_link_24px = 2131231731;
      public static final int images_native_icons_ic_loading_emoji_dark = 2131231732;
      public static final int images_native_icons_ic_loading_emoji_light = 2131231733;
      public static final int images_native_icons_ic_lock = 2131231734;
      public static final int images_native_icons_ic_lock_short_16px = 2131231735;
      public static final int images_native_icons_ic_locked_24px = 2131231736;
      public static final int images_native_icons_ic_mail = 2131231737;
      public static final int images_native_icons_ic_megaphone_16px = 2131231738;
      public static final int images_native_icons_ic_megaphone_lock_16px = 2131231739;
      public static final int images_native_icons_ic_members = 2131231740;
      public static final int images_native_icons_ic_members_24px = 2131231741;
      public static final int images_native_icons_ic_mention_24px = 2131231742;
      public static final int images_native_icons_ic_menu_24px = 2131231743;
      public static final int images_native_icons_ic_message = 2131231744;
      public static final int images_native_icons_ic_message_history = 2131231745;
      public static final int images_native_icons_ic_messages = 2131231746;
      public static final int images_native_icons_ic_mic_24px = 2131231747;
      public static final int images_native_icons_ic_mic_muted_24px = 2131231748;
      public static final int images_native_icons_ic_mic_muted_dark_24px = 2131231749;
      public static final int images_native_icons_ic_mic_muted_light_24px = 2131231750;
      public static final int images_native_icons_ic_mic_neutral = 2131231751;
      public static final int images_native_icons_ic_minus_circle_24px = 2131231752;
      public static final int images_native_icons_ic_mobile_device = 2131231753;
      public static final int images_native_icons_ic_mobile_status = 2131231754;
      public static final int images_native_icons_ic_moderation_24px = 2131231755;
      public static final int images_native_icons_ic_monitor = 2131231756;
      public static final int images_native_icons_ic_more_24px = 2131231757;
      public static final int images_native_icons_ic_more_android = 2131231758;
      public static final int images_native_icons_ic_music = 2131231759;
      public static final int images_native_icons_ic_mute_channel_24px = 2131231760;
      public static final int images_native_icons_ic_neutral_status_18px = 2131231761;
      public static final int images_native_icons_ic_new_group = 2131231762;
      public static final int images_native_icons_ic_nitro_basic_wheel_gradient = 2131231763;
      public static final int images_native_icons_ic_nitro_wheel = 2131231764;
      public static final int images_native_icons_ic_nitro_wheel_gradient = 2131231765;
      public static final int images_native_icons_ic_nitro_wheel_gradient_purple = 2131231766;
      public static final int images_native_icons_ic_noise_cancellation_active = 2131231767;
      public static final int images_native_icons_ic_noise_cancellation_disabled = 2131231768;
      public static final int images_native_icons_ic_notification_settings = 2131231769;
      public static final int images_native_icons_ic_notification_settings_light = 2131231770;
      public static final int images_native_icons_ic_open_in_browser = 2131231771;
      public static final int images_native_icons_ic_overflow_android = 2131231772;
      public static final int images_native_icons_ic_paint_brush = 2131231773;
      public static final int images_native_icons_ic_paperclip_24px = 2131231774;
      public static final int images_native_icons_ic_partnered_guild_icon_black_24px = 2131231775;
      public static final int images_native_icons_ic_partnered_guild_icon_blurple_24px = 2131231776;
      public static final int images_native_icons_ic_pencil_24px = 2131231777;
      public static final int images_native_icons_ic_person_shield = 2131231778;
      public static final int images_native_icons_ic_person_waving = 2131231779;
      public static final int images_native_icons_ic_pip = 2131231780;
      public static final int images_native_icons_ic_play = 2131231781;
      public static final int images_native_icons_ic_play_dark = 2131231782;
      public static final int images_native_icons_ic_playstation_24px = 2131231783;
      public static final int images_native_icons_ic_profile_24px = 2131231784;
      public static final int images_native_icons_ic_public = 2131231785;
      public static final int images_native_icons_ic_radio_circle = 2131231786;
      public static final int images_native_icons_ic_radio_circle_checked = 2131231787;
      public static final int images_native_icons_ic_radio_circle_checked_green = 2131231788;
      public static final int images_native_icons_ic_radio_square_24px = 2131231789;
      public static final int images_native_icons_ic_radio_square_checked_24px = 2131231790;
      public static final int images_native_icons_ic_remove_friend_24px = 2131231791;
      public static final int images_native_icons_ic_remove_user = 2131231792;
      public static final int images_native_icons_ic_reply_24px = 2131231793;
      public static final int images_native_icons_ic_rich_presence_dark_12px = 2131231794;
      public static final int images_native_icons_ic_robot_24px = 2131231795;
      public static final int images_native_icons_ic_rulebook = 2131231796;
      public static final int images_native_icons_ic_rulebook_16px = 2131231797;
      public static final int images_native_icons_ic_screen_share_24px = 2131231798;
      public static final int images_native_icons_ic_search = 2131231799;
      public static final int images_native_icons_ic_search_24px = 2131231800;
      public static final int images_native_icons_ic_send = 2131231801;
      public static final int images_native_icons_ic_server_security_24px = 2131231802;
      public static final int images_native_icons_ic_share_android = 2131231803;
      public static final int images_native_icons_ic_share_ios = 2131231804;
      public static final int images_native_icons_ic_shield_24px = 2131231805;
      public static final int images_native_icons_ic_show_password = 2131231806;
      public static final int images_native_icons_ic_sign_post = 2131231807;
      public static final int images_native_icons_ic_soundboard = 2131231808;
      public static final int images_native_icons_ic_soundboard_mobile = 2131231809;
      public static final int images_native_icons_ic_sparkle = 2131231810;
      public static final int images_native_icons_ic_sparkle2 = 2131231811;
      public static final int images_native_icons_ic_sparkle3 = 2131231812;
      public static final int images_native_icons_ic_speaker = 2131231813;
      public static final int images_native_icons_ic_stage_channel_16px = 2131231814;
      public static final int images_native_icons_ic_stage_channel_24px = 2131231815;
      public static final int images_native_icons_ic_stamp = 2131231816;
      public static final int images_native_icons_ic_star = 2131231817;
      public static final int images_native_icons_ic_star_filled = 2131231818;
      public static final int images_native_icons_ic_start_streaming = 2131231819;
      public static final int images_native_icons_ic_sticker_24px = 2131231820;
      public static final int images_native_icons_ic_stop_stream_24px = 2131231821;
      public static final int images_native_icons_ic_swipe_reply_24px = 2131231822;
      public static final int images_native_icons_ic_switch_accounts = 2131231823;
      public static final int images_native_icons_ic_sync_24px = 2131231824;
      public static final int images_native_icons_ic_text_channel_16px = 2131231825;
      public static final int images_native_icons_ic_text_channel_lock_16px = 2131231826;
      public static final int images_native_icons_ic_text_in_voice_24px = 2131231827;
      public static final int images_native_icons_ic_thread_normal_24px = 2131231828;
      public static final int images_native_icons_ic_timer_24px = 2131231829;
      public static final int images_native_icons_ic_trash_24px = 2131231830;
      public static final int images_native_icons_ic_trash_filled = 2131231831;
      public static final int images_native_icons_ic_undo = 2131231832;
      public static final int images_native_icons_ic_unmute_channel_24px = 2131231833;
      public static final int images_native_icons_ic_update_profile = 2131231834;
      public static final int images_native_icons_ic_upload = 2131231835;
      public static final int images_native_icons_ic_upload_image_40px = 2131231836;
      public static final int images_native_icons_ic_verified_guild_icon_black_24px = 2131231837;
      public static final int images_native_icons_ic_verified_guild_icon_green_24px = 2131231838;
      public static final int images_native_icons_ic_verified_icon_white_16px = 2131231839;
      public static final int images_native_icons_ic_video = 2131231840;
      public static final int images_native_icons_ic_voice_channel_16px = 2131231841;
      public static final int images_native_icons_ic_voice_channel_24px = 2131231842;
      public static final int images_native_icons_ic_voice_channel_locked_24px = 2131231843;
      public static final int images_native_icons_ic_volume = 2131231844;
      public static final int images_native_icons_ic_volume_locked = 2131231845;
      public static final int images_native_icons_ic_volume_mute = 2131231846;
      public static final int images_native_icons_ic_wand = 2131231847;
      public static final int images_native_icons_ic_warning_24px = 2131231848;
      public static final int images_native_icons_ic_webhook_24px = 2131231849;
      public static final int images_native_icons_ic_xbox_24px = 2131231850;
      public static final int images_native_icons_midnight_border_left_radius = 2131231851;
      public static final int images_native_icons_premium_ic_sparkle_basic_gradient = 2131231852;
      public static final int images_native_icons_premium_ic_sparkle_nitro_gradient = 2131231853;
      public static final int images_native_icons_premium_ic_star_basic_gradient = 2131231854;
      public static final int images_native_icons_premium_ic_star_nitro_gradient = 2131231855;
      public static final int images_native_icons_settings_ic_accessibility_24px = 2131231856;
      public static final int images_native_icons_settings_ic_authed_apps_24px = 2131231857;
      public static final int images_native_icons_settings_ic_behavior_24px = 2131231858;
      public static final int images_native_icons_settings_ic_clip_24px = 2131231859;
      public static final int images_native_icons_settings_ic_edit_24px = 2131231860;
      public static final int images_native_icons_settings_ic_gift_24px = 2131231861;
      public static final int images_native_icons_settings_ic_globe_24px = 2131231862;
      public static final int images_native_icons_settings_ic_help_24px = 2131231863;
      public static final int images_native_icons_settings_ic_info_24px = 2131231864;
      public static final int images_native_icons_settings_ic_locale_24px = 2131231865;
      public static final int images_native_icons_settings_ic_logout_24px = 2131231866;
      public static final int images_native_icons_settings_ic_monitor_24px = 2131231867;
      public static final int images_native_icons_settings_ic_my_account_24px = 2131231868;
      public static final int images_native_icons_settings_ic_nitro_rep_24px = 2131231869;
      public static final int images_native_icons_settings_ic_notification_settings_24px = 2131231870;
      public static final int images_native_icons_settings_ic_phonelink_24px = 2131231871;
      public static final int images_native_icons_settings_ic_privacy_24px = 2131231872;
      public static final int images_native_icons_settings_ic_progress_wrench_24px = 2131231873;
      public static final int images_native_icons_settings_ic_qr_code_24px = 2131231874;
      public static final int images_native_icons_settings_ic_settings_boost_24px = 2131231875;
      public static final int images_native_icons_settings_ic_status_24px = 2131231876;
      public static final int images_native_icons_settings_ic_text_image_24px = 2131231877;
      public static final int images_native_icons_settings_ic_theme_24px = 2131231878;
      public static final int images_native_icons_settings_ic_voice_settings_24px = 2131231879;
      public static final int images_native_icons_share = 2131231880;
      public static final int images_native_icons_small = 2131231881;
      public static final int images_native_icons_user_profile_ic_arrow = 2131231882;
      public static final int images_native_icons_user_profile_ic_audio = 2131231883;
      public static final int images_native_icons_user_profile_ic_clock = 2131231884;
      public static final int images_native_icons_user_profile_ic_message = 2131231885;
      public static final int images_native_icons_user_profile_ic_video = 2131231886;
      public static final int images_native_icons_user_profile_ic_video_disabled = 2131231887;
      public static final int images_native_icons_user_profile_ic_video_disabled_dark = 2131231888;
      public static final int images_native_icons_user_profile_ic_video_disabled_white = 2131231889;
      public static final int images_native_icons_voice_calls_dark_theme_voice_bar_mute_off = 2131231890;
      public static final int images_native_icons_voice_calls_dark_theme_voice_bar_mute_on = 2131231891;
      public static final int images_native_icons_voice_calls_light_theme_voice_bar_deafen_off = 2131231892;
      public static final int images_native_icons_voice_calls_light_theme_voice_bar_deafen_on = 2131231893;
      public static final int images_native_icons_voice_calls_light_theme_voice_bar_mute_off = 2131231894;
      public static final int images_native_icons_voice_calls_light_theme_voice_bar_mute_on = 2131231895;
      public static final int images_native_icons_voice_calls_nav_header_connect = 2131231896;
      public static final int images_native_icons_voice_calls_nav_header_disconnect = 2131231897;
      public static final int images_native_icons_voice_calls_screenshare = 2131231898;
      public static final int images_native_icons_voice_calls_screenshare_end = 2131231899;
      public static final int images_native_icons_voice_calls_video = 2131231900;
      public static final int images_native_icons_voice_calls_voice_bar_bluetooth = 2131231901;
      public static final int images_native_icons_voice_calls_voice_bar_phone = 2131231902;
      public static final int images_native_icons_voice_calls_voice_bar_speaker_new = 2131231903;
      public static final int images_native_iconservermuted = 2131231904;
      public static final int images_native_img_ban = 2131231905;
      public static final int images_native_img_gifting_empty = 2131231906;
      public static final int images_native_img_group_dm_illustration = 2131231907;
      public static final int images_native_img_invalid_link_dark = 2131231908;
      public static final int images_native_img_invalid_link_light = 2131231909;
      public static final int images_native_img_kick_member = 2131231910;
      public static final int images_native_img_nitro_classic_icon_80px = 2131231911;
      public static final int images_native_img_nitro_classic_icon_white_80px = 2131231912;
      public static final int images_native_img_nitro_icon_80px = 2131231913;
      public static final int images_native_img_nitro_tier_0_icon_80px = 2131231914;
      public static final int images_native_img_no_results = 2131231915;
      public static final int images_native_img_no_results_dark_theme = 2131231916;
      public static final int images_native_img_nsfw_dark_theme = 2131231917;
      public static final int images_native_img_nsfw_light_theme = 2131231918;
      public static final int images_native_img_poop_dark = 2131231919;
      public static final int images_native_img_poop_light = 2131231920;
      public static final int images_native_img_remote_auth_loaded = 2131231921;
      public static final int images_native_img_remote_auth_not_found = 2131231922;
      public static final int images_native_img_remote_auth_succeeded = 2131231923;
      public static final int images_native_img_search_empty_dark = 2131231924;
      public static final int images_native_img_search_empty_light = 2131231925;
      public static final int images_native_img_security = 2131231926;
      public static final int images_native_img_spotify_error_dark = 2131231927;
      public static final int images_native_img_spotify_error_light = 2131231928;
      public static final int images_native_img_text_in_voice_empty_state_dark = 2131231929;
      public static final int images_native_img_text_in_voice_empty_state_light = 2131231930;
      public static final int images_native_img_thread_browser_empty_state = 2131231931;
      public static final int images_native_img_thread_browser_empty_state_light = 2131231932;
      public static final int images_native_img_transfer_arrow = 2131231933;
      public static final int images_native_img_vanity_urls = 2131231934;
      public static final int images_native_img_verify_email_sent = 2131231935;
      public static final int images_native_img_wump_trash_dark = 2131231936;
      public static final int images_native_in_app_report_success100px = 2131231937;
      public static final int images_native_invitebg = 2131231938;
      public static final int images_native_krisp_header = 2131231939;
      public static final int images_native_krisp_logo_dark = 2131231940;
      public static final int images_native_krisp_logo_dark_small = 2131231941;
      public static final int images_native_krisp_logo_light = 2131231942;
      public static final int images_native_krisp_logo_light_small = 2131231943;
      public static final int images_native_link_expired = 2131231944;
      public static final int images_native_link_expired_light = 2131231945;
      public static final int images_native_logo = 2131231946;
      public static final int images_native_main_tabs_discord = 2131231947;
      public static final int images_native_main_tabs_examplesketchheadsactivity = 2131231948;
      public static final int images_native_main_tabs_examplevoicechatactivity = 2131231949;
      public static final int images_native_main_tabs_notificationcenter = 2131231950;
      public static final int images_native_mfaserver = 2131231951;
      public static final int images_native_mobile_shop_marketing_banner = 2131231952;
      public static final int images_native_notifications_feedback = 2131231953;
      public static final int images_native_oauth2_background = 2131231954;
      public static final int images_native_oauth2_failureheader = 2131231955;
      public static final int images_native_oauth2_successheader = 2131231956;
      public static final int images_native_platforms_img_account_sync_facebook_white = 2131231957;
      public static final int images_native_platforms_img_account_sync_twitter_white = 2131231958;
      public static final int images_native_platforms_img_instagram_white = 2131231959;
      public static final int images_native_poop_dark_large = 2131231960;
      public static final int images_native_poop_light_large = 2131231961;
      public static final int images_native_premium_activated_img_boost_activated_border = 2131231962;
      public static final int images_native_premium_activated_img_nitro_tier_0_activated_dark = 2131231963;
      public static final int images_native_premium_activated_img_nitro_tier_0_activated_light = 2131231964;
      public static final int images_native_premium_activated_img_nitro_tier_1_activated_dark = 2131231965;
      public static final int images_native_premium_activated_img_nitro_tier_1_activated_light = 2131231966;
      public static final int images_native_premium_activated_img_nitro_tier_2_activated_dark = 2131231967;
      public static final int images_native_premium_activated_img_nitro_tier_2_activated_light = 2131231968;
      public static final int images_native_premium_activated_img_plan_activated = 2131231969;
      public static final int images_native_premium_activated_img_plan_activated_light = 2131231970;
      public static final int images_native_premium_activated_img_subscription_activated_dark = 2131231971;
      public static final int images_native_premium_activated_img_subscription_activated_light = 2131231972;
      public static final int images_native_premium_backgrounds_img_boost_subheader_error_mobile = 2131231973;
      public static final int images_native_premium_backgrounds_img_boost_subheader_mobile = 2131231974;
      public static final int images_native_premium_backgrounds_img_boost_subheader_resub_mobile = 2131231975;
      public static final int images_native_premium_backgrounds_img_bundle_subheader_mobile = 2131231976;
      public static final int images_native_premium_backgrounds_img_classic_subheader_mobile = 2131231977;
      public static final int images_native_premium_backgrounds_img_nitro_subheader_mobile = 2131231978;
      public static final int images_native_premium_backgrounds_img_subheader_error_mobile = 2131231979;
      public static final int images_native_premium_backgrounds_img_subheader_error_mobile_v2 = 2131231980;
      public static final int images_native_premium_backgrounds_img_subheader_error_mobile_v2_light = 2131231981;
      public static final int images_native_premium_backgrounds_img_subheader_resub_mobile = 2131231982;
      public static final int images_native_premium_backgrounds_img_tier_0_subheader_mobile = 2131231983;
      public static final int images_native_premium_backgrounds_img_top_pattern_dark = 2131231984;
      public static final int images_native_premium_backgrounds_img_top_pattern_light = 2131231985;
      public static final int images_native_premium_guild_boosting_guild_subscription_no_guilds_dark = 2131231986;
      public static final int images_native_premium_guild_boosting_guild_subscription_no_guilds_light = 2131231987;
      public static final int images_native_premium_guild_boosting_guild_subscription_removal_dark = 2131231988;
      public static final int images_native_premium_guild_boosting_guild_subscription_removal_light = 2131231989;
      public static final int images_native_premium_guild_boosting_lock = 2131231990;
      public static final int images_native_premium_guild_boosting_member_list_badge_16px = 2131231991;
      public static final int images_native_premium_guild_boosting_perks_audio = 2131231992;
      public static final int images_native_premium_guild_boosting_perks_badge = 2131231993;
      public static final int images_native_premium_guild_boosting_perks_badge_2 = 2131231994;
      public static final int images_native_premium_guild_boosting_perks_emoji = 2131231995;
      public static final int images_native_premium_guild_boosting_perks_member_list_icon = 2131231996;
      public static final int images_native_premium_guild_boosting_perks_role = 2131231997;
      public static final int images_native_premium_guild_boosting_perks_role_2 = 2131231998;
      public static final int images_native_premium_guild_boosting_perks_star = 2131231999;
      public static final int images_native_premium_guild_boosting_perks_sticker = 2131232000;
      public static final int images_native_premium_guild_boosting_perks_support = 2131232001;
      public static final int images_native_premium_guild_boosting_perks_thread = 2131232002;
      public static final int images_native_premium_guild_boosting_perks_upload = 2131232003;
      public static final int images_native_premium_guild_boosting_subscribe_confirm = 2131232004;
      public static final int images_native_premium_guild_boosting_subscription_placeholder_pattern_dark = 2131232005;
      public static final int images_native_premium_guild_boosting_subscription_placeholder_pattern_light = 2131232006;
      public static final int images_native_premium_guild_boosting_tier_icons_colored_tier_0_48px_dark = 2131232007;
      public static final int images_native_premium_guild_boosting_tier_icons_colored_tier_0_48px_light = 2131232008;
      public static final int images_native_premium_guild_boosting_tier_icons_colored_tier_1_32px = 2131232009;
      public static final int images_native_premium_guild_boosting_tier_icons_colored_tier_2_32px = 2131232010;
      public static final int images_native_premium_guild_boosting_tier_icons_colored_tier_3_32px = 2131232011;
      public static final int images_native_premium_guild_boosting_tier_icons_flower_star_dark_tier_0_24px = 2131232012;
      public static final int images_native_premium_guild_boosting_tier_icons_flower_star_dark_tier_1_24px = 2131232013;
      public static final int images_native_premium_guild_boosting_tier_icons_flower_star_dark_tier_2_24px = 2131232014;
      public static final int images_native_premium_guild_boosting_tier_icons_flower_star_dark_tier_3_24px = 2131232015;
      public static final int images_native_premium_guild_boosting_tier_icons_flower_star_light_tier_0_24px = 2131232016;
      public static final int images_native_premium_guild_boosting_tier_icons_flower_star_light_tier_1_24px = 2131232017;
      public static final int images_native_premium_guild_boosting_tier_icons_flower_star_light_tier_2_24px = 2131232018;
      public static final int images_native_premium_guild_boosting_tier_icons_flower_star_light_tier_3_24px = 2131232019;
      public static final int images_native_premium_guild_boosting_tier_icons_simple_tier_1_32px = 2131232020;
      public static final int images_native_premium_guild_boosting_tier_icons_simple_tier_2_32px = 2131232021;
      public static final int images_native_premium_guild_boosting_tier_icons_simple_tier_3_32px = 2131232022;
      public static final int images_native_premium_illustrations_img_boost_error_mobile = 2131232023;
      public static final int images_native_premium_illustrations_img_boost_hands = 2131232024;
      public static final int images_native_premium_illustrations_img_boost_mobile = 2131232025;
      public static final int images_native_premium_illustrations_img_boost_resubscribe_mobile = 2131232026;
      public static final int images_native_premium_illustrations_img_bundle_banner = 2131232027;
      public static final int images_native_premium_illustrations_img_bundle_mobile = 2131232028;
      public static final int images_native_premium_illustrations_img_classic_error_mobile = 2131232029;
      public static final int images_native_premium_illustrations_img_classic_mobile = 2131232030;
      public static final int images_native_premium_illustrations_img_classic_resubscribe_mobile = 2131232031;
      public static final int images_native_premium_illustrations_img_clouds_header_tier_0 = 2131232032;
      public static final int images_native_premium_illustrations_img_clouds_header_tier_2 = 2131232033;
      public static final int images_native_premium_illustrations_img_marketing_boosting_hands = 2131232034;
      public static final int images_native_premium_illustrations_img_marketing_frog = 2131232035;
      public static final int images_native_premium_illustrations_img_marketing_profiles = 2131232036;
      public static final int images_native_premium_illustrations_img_marketing_uploads_light_border = 2131232037;
      public static final int images_native_premium_illustrations_img_outbound_promotion_error = 2131232038;
      public static final int images_native_premium_illustrations_img_outbound_promotion_redemption = 2131232039;
      public static final int images_native_premium_illustrations_img_premium_error_mobile = 2131232040;
      public static final int images_native_premium_illustrations_img_premium_resubscribe_mobile = 2131232041;
      public static final int images_native_premium_illustrations_img_tier_0_clouds = 2131232042;
      public static final int images_native_premium_illustrations_img_tier_0_clouds_bigger = 2131232043;
      public static final int images_native_premium_illustrations_img_tier_0_error_mobile = 2131232044;
      public static final int images_native_premium_illustrations_img_tier_0_marketing_boosting = 2131232045;
      public static final int images_native_premium_illustrations_img_tier_0_marketing_emojis = 2131232046;
      public static final int images_native_premium_illustrations_img_tier_0_mobile = 2131232047;
      public static final int images_native_premium_illustrations_img_tier_0_perk_bigger_files = 2131232048;
      public static final int images_native_premium_illustrations_img_tier_0_perk_custom_video_backgrounds = 2131232049;
      public static final int images_native_premium_illustrations_img_tier_0_perk_emoji_and_stickers = 2131232050;
      public static final int images_native_premium_illustrations_img_tier_0_resubscribe_mobile = 2131232051;
      public static final int images_native_premium_illustrations_img_tier_2_clouds = 2131232052;
      public static final int images_native_premium_illustrations_img_tier_2_clouds_bigger = 2131232053;
      public static final int images_native_premium_illustrations_img_what_you_lose_boost = 2131232054;
      public static final int images_native_premium_illustrations_img_what_you_lose_emojis = 2131232055;
      public static final int images_native_premium_illustrations_img_what_you_lose_hd_video = 2131232056;
      public static final int images_native_premium_illustrations_img_what_you_lose_profile = 2131232057;
      public static final int images_native_premium_illustrations_img_what_you_lose_profile_tier1_dark = 2131232058;
      public static final int images_native_premium_illustrations_img_what_you_lose_profile_tier1_light = 2131232059;
      public static final int images_native_premium_illustrations_img_what_you_lose_uploads = 2131232060;
      public static final int images_native_premium_illustrations_img_wumpus_lightro = 2131232061;
      public static final int images_native_premium_illustrations_img_wumpus_nitro = 2131232062;
      public static final int images_native_premium_illustrations_img_wumpus_nitro_rev = 2131232063;
      public static final int images_native_premium_logos_img_discord_nitro_logo_centered_dark = 2131232064;
      public static final int images_native_premium_logos_img_discord_nitro_logo_centered_light = 2131232065;
      public static final int images_native_premium_logos_img_discord_nitro_logo_left = 2131232066;
      public static final int images_native_premium_logos_img_discord_nitro_logo_left_light = 2131232067;
      public static final int images_native_premium_logos_img_logo_basic_small_dark = 2131232068;
      public static final int images_native_premium_logos_img_logo_basic_small_light = 2131232069;
      public static final int images_native_premium_logos_img_logo_boost = 2131232070;
      public static final int images_native_premium_logos_img_logo_bundle_horizontal = 2131232071;
      public static final int images_native_premium_logos_img_logo_bundle_horizontal_black = 2131232072;
      public static final int images_native_premium_logos_img_logo_discord = 2131232073;
      public static final int images_native_premium_logos_img_logo_nitro_basic_stacked = 2131232074;
      public static final int images_native_premium_logos_img_logo_nitro_classic = 2131232075;
      public static final int images_native_premium_logos_img_logo_nitro_classic_horizontal = 2131232076;
      public static final int images_native_premium_logos_img_logo_nitro_classic_horizontal_light = 2131232077;
      public static final int images_native_premium_logos_img_logo_nitro_classic_stacked = 2131232078;
      public static final int images_native_premium_logos_img_logo_nitro_dark = 2131232079;
      public static final int images_native_premium_logos_img_logo_nitro_small_dark = 2131232080;
      public static final int images_native_premium_logos_img_logo_nitro_small_light = 2131232081;
      public static final int images_native_premium_logos_img_logo_nitro_tier_0 = 2131232082;
      public static final int images_native_premium_logos_img_logo_nitro_tier_0_horizontal_dark = 2131232083;
      public static final int images_native_premium_logos_img_logo_nitro_tier_0_light = 2131232084;
      public static final int images_native_premium_logos_img_logo_nitro_tier_2_horizontal_dark = 2131232085;
      public static final int images_native_premium_logos_img_logo_plus_boost = 2131232086;
      public static final int images_native_premium_logos_img_logo_premium_tier_0_full = 2131232087;
      public static final int images_native_premium_logos_img_logo_premium_tier_1_full = 2131232088;
      public static final int images_native_premium_logos_server_boost_logo_dark = 2131232089;
      public static final int images_native_premium_logos_server_boost_logo_light = 2131232090;
      public static final int images_native_premium_nitro_icons_img_nitro_icon_filled = 2131232091;
      public static final int images_native_premium_perks_img_nitro_badge = 2131232092;
      public static final int images_native_premium_perks_img_nitro_basic = 2131232093;
      public static final int images_native_premium_perks_img_nitro_basic_free_trial_stamp = 2131232094;
      public static final int images_native_premium_perks_img_nitro_boosted = 2131232095;
      public static final int images_native_premium_perks_img_nitro_check_20px = 2131232096;
      public static final int images_native_premium_perks_img_nitro_emojis = 2131232097;
      public static final int images_native_premium_perks_img_nitro_misc_perks_20px = 2131232098;
      public static final int images_native_premium_perks_img_nitro_premium_guilds = 2131232099;
      public static final int images_native_premium_perks_img_nitro_premium_guilds_20px = 2131232100;
      public static final int images_native_premium_perks_img_nitro_remixing = 2131232101;
      public static final int images_native_premium_perks_img_nitro_server_avatar = 2131232102;
      public static final int images_native_premium_perks_img_nitro_standard = 2131232103;
      public static final int images_native_premium_perks_img_nitro_standard_free_trial_stamp = 2131232104;
      public static final int images_native_premium_perks_img_nitro_sticker_yellow_24px = 2131232105;
      public static final int images_native_premium_perks_img_nitro_stream = 2131232106;
      public static final int images_native_premium_plan_selection_img_boost = 2131232107;
      public static final int images_native_premium_plan_selection_img_wumpus_nitro = 2131232108;
      public static final int images_native_premium_plan_selection_img_wumpus_nitro_boost = 2131232109;
      public static final int images_native_premium_plan_selection_img_wumpus_nitro_classic = 2131232110;
      public static final int images_native_premium_plan_selection_img_wumpus_nitro_classic_boost = 2131232111;
      public static final int images_native_premium_plan_selection_img_wumpus_nitro_tier_0 = 2131232112;
      public static final int images_native_premium_plan_selection_yearly_upsell_wumpus = 2131232113;
      public static final int images_native_premium_upsell_img_custom_app_icons = 2131232114;
      public static final int images_native_premium_upsell_img_guild_cap_upsell_dark = 2131232115;
      public static final int images_native_premium_upsell_img_guild_cap_upsell_light = 2131232116;
      public static final int images_native_premium_upsell_img_nitro_animated_avatar = 2131232117;
      public static final int images_native_premium_upsell_img_nitro_animated_emoji = 2131232118;
      public static final int images_native_premium_upsell_img_nitro_badge = 2131232119;
      public static final int images_native_premium_upsell_img_nitro_file_upload = 2131232120;
      public static final int images_native_premium_upsell_img_nitro_global_emoji = 2131232121;
      public static final int images_native_premium_upsell_img_nitro_longer_message_upsell_dark = 2131232122;
      public static final int images_native_premium_upsell_img_nitro_longer_message_upsell_light = 2131232123;
      public static final int images_native_premium_upsell_img_profile_upsell = 2131232124;
      public static final int images_native_profileplaceholderdark = 2131232125;
      public static final int images_native_profileplaceholderlight = 2131232126;
      public static final int images_native_sampleprofile = 2131232127;
      public static final int images_native_sampleprofilesmall = 2131232128;
      public static final int images_native_sampleprofilesmalllight = 2131232129;
      public static final int images_native_servererror = 2131232130;
      public static final int images_native_soundboard_megaphone = 2131232131;
      public static final int images_native_status_statusdnd = 2131232132;
      public static final int images_native_status_statusidle = 2131232133;
      public static final int images_native_status_statusmobileonline = 2131232134;
      public static final int images_native_status_statusoffline = 2131232135;
      public static final int images_native_status_statusonline = 2131232136;
      public static final int images_native_status_statusstreaming = 2131232137;
      public static final int images_native_stream_feedback_darkthemedesaturated_feedbackmodalhappydesaturated = 2131232138;
      public static final int images_native_stream_feedback_darkthemedesaturated_feedbackmodalneutraldesaturated = 2131232139;
      public static final int images_native_stream_feedback_darkthemedesaturated_feedbackmodalsaddesaturated = 2131232140;
      public static final int images_native_stream_feedback_feedbackmodalhappy = 2131232141;
      public static final int images_native_stream_feedback_feedbackmodalneutral = 2131232142;
      public static final int images_native_stream_feedback_feedbackmodalsad = 2131232143;
      public static final int images_native_stream_feedback_lightthemedesaturated_feedbackmodalhappydesaturated = 2131232144;
      public static final int images_native_stream_feedback_lightthemedesaturated_feedbackmodalneutraldesaturated = 2131232145;
      public static final int images_native_stream_feedback_lightthemedesaturated_feedbackmodalsaddesaturated = 2131232146;
      public static final int images_native_toast_friends_toast_icon = 2131232147;
      public static final int images_native_toast_toast_copy_link = 2131232148;
      public static final int images_native_toast_toast_copy_message = 2131232149;
      public static final int images_native_toast_toast_image_saved = 2131232150;
      public static final int images_native_toast_toast_invite_sent = 2131232151;
      public static final int images_native_uikit_ic_check_18px = 2131232152;
      public static final int images_native_uikit_ic_settings_grey_24px = 2131232153;
      public static final int images_native_uikit_ic_settings_white_24px = 2131232154;
      public static final int images_native_verification_img_baddies_dark_theme = 2131232155;
      public static final int images_native_verification_img_baddies_light_theme = 2131232156;
      public static final int images_native_verification_img_verify_phone_dark_theme = 2131232157;
      public static final int images_native_verification_img_verify_phone_light_theme = 2131232158;
      public static final int images_native_welcomebg = 2131232159;
      public static final int images_native_wumpus_wumpusash = 2131232160;
      public static final int images_native_wumpus_wumpuslink = 2131232161;
      public static final int images_native_wumpus_wumpusluigi = 2131232162;
      public static final int images_native_wumpus_wumpusmario = 2131232163;
      public static final int images_native_wumpus_wumpuspikachu = 2131232164;
      public static final int images_native_wumpus_wumpuswizard = 2131232165;
      public static final int images_native_wumpus_wumpuswump = 2131232166;
      public static final int images_native_yellowalert = 2131232167;
      public static final int images_noappicon = 2131232168;
      public static final int images_platforms_img_account_sync_battlenet_light_and_dark = 2131232169;
      public static final int images_platforms_img_account_sync_battlenet_white = 2131232170;
      public static final int images_platforms_img_account_sync_crunchyroll_light_and_dark = 2131232171;
      public static final int images_platforms_img_account_sync_ebay_light_and_dark = 2131232172;
      public static final int images_platforms_img_account_sync_ebay_white = 2131232173;
      public static final int images_platforms_img_account_sync_epic_dark_and_white = 2131232174;
      public static final int images_platforms_img_account_sync_epic_light = 2131232175;
      public static final int images_platforms_img_account_sync_facebook_light_and_dark = 2131232176;
      public static final int images_platforms_img_account_sync_facebook_white = 2131232177;
      public static final int images_platforms_img_account_sync_github_light = 2131232178;
      public static final int images_platforms_img_account_sync_github_white = 2131232179;
      public static final int images_platforms_img_account_sync_instagram_light_and_dark = 2131232180;
      public static final int images_platforms_img_account_sync_instagram_white = 2131232181;
      public static final int images_platforms_img_account_sync_league_of_legends_light_and_dark = 2131232182;
      public static final int images_platforms_img_account_sync_league_of_legends_white = 2131232183;
      public static final int images_platforms_img_account_sync_paypal_light_and_dark = 2131232184;
      public static final int images_platforms_img_account_sync_paypal_white = 2131232185;
      public static final int images_platforms_img_account_sync_playstation_light = 2131232186;
      public static final int images_platforms_img_account_sync_playstation_white = 2131232187;
      public static final int images_platforms_img_account_sync_reddit_light_and_dark = 2131232188;
      public static final int images_platforms_img_account_sync_reddit_white = 2131232189;
      public static final int images_platforms_img_account_sync_riot_light_and_dark = 2131232190;
      public static final int images_platforms_img_account_sync_riot_white = 2131232191;
      public static final int images_platforms_img_account_sync_samsung_light_and_dark = 2131232192;
      public static final int images_platforms_img_account_sync_samsung_white = 2131232193;
      public static final int images_platforms_img_account_sync_skype_light_and_dark = 2131232194;
      public static final int images_platforms_img_account_sync_skype_white = 2131232195;
      public static final int images_platforms_img_account_sync_spotify_light_and_dark = 2131232196;
      public static final int images_platforms_img_account_sync_spotify_white = 2131232197;
      public static final int images_platforms_img_account_sync_steam_light = 2131232198;
      public static final int images_platforms_img_account_sync_steam_white = 2131232199;
      public static final int images_platforms_img_account_sync_tiktok_dark = 2131232200;
      public static final int images_platforms_img_account_sync_tiktok_light = 2131232201;
      public static final int images_platforms_img_account_sync_twitch_light_and_dark = 2131232202;
      public static final int images_platforms_img_account_sync_twitch_white = 2131232203;
      public static final int images_platforms_img_account_sync_twitter_light_and_dark = 2131232204;
      public static final int images_platforms_img_account_sync_twitter_white = 2131232205;
      public static final int images_platforms_img_account_sync_x_dark = 2131232206;
      public static final int images_platforms_img_account_sync_x_light = 2131232207;
      public static final int images_platforms_img_account_sync_x_white = 2131232208;
      public static final int images_platforms_img_account_sync_xbox_custom = 2131232209;
      public static final int images_platforms_img_account_sync_xbox_light = 2131232210;
      public static final int images_platforms_img_account_sync_xbox_white = 2131232211;
      public static final int images_platforms_img_account_sync_youtube_light_and_dark = 2131232212;
      public static final int images_platforms_img_account_sync_youtube_white = 2131232213;
      public static final int images_platforms_img_amazon_music = 2131232214;
      public static final int images_platforms_img_bungie_dark = 2131232215;
      public static final int images_platforms_img_bungie_light = 2131232216;
      public static final int images_platforms_img_bungie_white = 2131232217;
      public static final int images_platforms_img_domain_dark = 2131232218;
      public static final int images_platforms_img_domain_light = 2131232219;
      public static final int images_platforms_img_roblox_dark = 2131232220;
      public static final int images_platforms_img_roblox_light = 2131232221;
      public static final int images_platforms_img_roblox_white = 2131232222;
      public static final int images_public_guilds_systemuseravatar = 2131232223;
      public static final int images_user_settings_crunchyroll_connect = 2131232224;
      public static final int images_user_settings_crunchyroll_link_intro = 2131232225;
      public static final int images_user_settings_crunchyroll_link_success = 2131232226;
      public static final int lock = 2131232227;
      public static final int lock_overlay = 2131232228;
      public static final int m3_appbar_background = 2131232229;
      public static final int m3_avd_hide_password = 2131232230;
      public static final int m3_avd_show_password = 2131232231;
      public static final int m3_password_eye = 2131232232;
      public static final int m3_popupmenu_background_overlay = 2131232233;
      public static final int m3_radiobutton_ripple = 2131232234;
      public static final int m3_selection_control_ripple = 2131232235;
      public static final int m3_tabs_background = 2131232236;
      public static final int m3_tabs_line_indicator = 2131232237;
      public static final int m3_tabs_rounded_line_indicator = 2131232238;
      public static final int m3_tabs_transparent_background = 2131232239;
      public static final int material_cursor_drawable = 2131232240;
      public static final int material_ic_calendar_black_24dp = 2131232241;
      public static final int material_ic_clear_black_24dp = 2131232242;
      public static final int material_ic_edit_black_24dp = 2131232243;
      public static final int material_ic_keyboard_arrow_left_black_24dp = 2131232244;
      public static final int material_ic_keyboard_arrow_next_black_24dp = 2131232245;
      public static final int material_ic_keyboard_arrow_previous_black_24dp = 2131232246;
      public static final int material_ic_keyboard_arrow_right_black_24dp = 2131232247;
      public static final int material_ic_menu_arrow_down_black_24dp = 2131232248;
      public static final int material_ic_menu_arrow_up_black_24dp = 2131232249;
      public static final int modules_activate_device_images_activate_device_splash = 2131232250;
      public static final int modules_activities_images_announcement_birb = 2131232251;
      public static final int modules_age_gate_native_images_age_gate = 2131232252;
      public static final int modules_age_gate_native_images_check = 2131232253;
      public static final int modules_age_gate_native_images_nsfw_gate = 2131232254;
      public static final int modules_age_gate_native_images_nsfw_gate_lock = 2131232255;
      public static final int modules_age_gate_native_images_nsfw_gate_unavailable = 2131232256;
      public static final int modules_age_gate_native_images_underage_blocker = 2131232257;
      public static final int modules_app_icons_images_app_icon_marketing = 2131232258;
      public static final int modules_app_launcher_native_images_applauncherlearnmore = 2131232259;
      public static final int modules_auth_native_images_registerbackgrounddark = 2131232260;
      public static final int modules_auth_native_images_registerbackgroundlight = 2131232261;
      public static final int modules_avatar_decorations_images_native_img_collectibles_shop = 2131232262;
      public static final int modules_avatar_decorations_images_native_img_none = 2131232263;
      public static final int modules_billing_native_images_blockedpurchasesdark = 2131232264;
      public static final int modules_billing_native_images_blockedpurchaseslight = 2131232265;
      public static final int modules_blocked_domains_components_native_images_dangerdave = 2131232266;
      public static final int modules_build_overrides_native_images_codeillustrationdark = 2131232267;
      public static final int modules_build_overrides_native_images_codeillustrationlight = 2131232268;
      public static final int modules_chat_input_native_images_ic_arrow = 2131232269;
      public static final int modules_chat_input_native_images_ic_expression = 2131232270;
      public static final int modules_chat_input_native_images_ic_gift = 2131232271;
      public static final int modules_chat_input_native_images_ic_sticker_icon_tilted = 2131232272;
      public static final int modules_clyde_ai_assets_clydeavatar = 2131232273;
      public static final int modules_collectibles_images_blue_wumpus = 2131232274;
      public static final int modules_collectibles_images_bubbles_dark_mode = 2131232275;
      public static final int modules_collectibles_images_bubbles_light_mode = 2131232276;
      public static final int modules_collectibles_images_butterfly_confetti = 2131232277;
      public static final int modules_collectibles_images_hans = 2131232278;
      public static final int modules_collectibles_images_petal_confetti = 2131232279;
      public static final int modules_collectibles_images_phibi = 2131232280;
      public static final int modules_collectibles_images_robert_shop_button_dark_mode = 2131232281;
      public static final int modules_collectibles_images_robert_shop_button_light_mode = 2131232282;
      public static final int modules_collectibles_images_storm_vines = 2131232283;
      public static final int modules_collectibles_images_tide_avatar = 2131232284;
      public static final int modules_collectibles_images_tide_countdown_icon = 2131232285;
      public static final int modules_collectibles_images_vine = 2131232286;
      public static final int modules_collectibles_images_wumpus_with_headset = 2131232287;
      public static final int modules_collectibles_native_images_discord_logo_black = 2131232288;
      public static final int modules_collectibles_native_images_discord_logo_white = 2131232289;
      public static final int modules_collectibles_native_images_premium_sparkles = 2131232290;
      public static final int modules_collectibles_web_images_robert_upsell_banner = 2131232291;
      public static final int modules_collectibles_web_images_robert_upsell_banner_art = 2131232292;
      public static final int modules_collectibles_web_images_storm_upsell_banner = 2131232293;
      public static final int modules_collectibles_web_images_storm_upsell_banner_art = 2131232294;
      public static final int modules_collectibles_web_images_tide_upsell_banner_art = 2131232295;
      public static final int modules_collectibles_web_images_tide_upsell_banner_background = 2131232296;
      public static final int modules_connectivity_native_images_ic_network_offline_24px = 2131232297;
      public static final int modules_connectivity_native_images_ic_network_offline_light_24px = 2131232298;
      public static final int modules_contact_sync_native_images_cta = 2131232299;
      public static final int modules_contact_sync_native_images_emptysuggestionsheader = 2131232300;
      public static final int modules_contact_sync_native_images_graggle = 2131232301;
      public static final int modules_contact_sync_native_images_headerart = 2131232302;
      public static final int modules_contact_sync_native_images_headerartonboarding = 2131232303;
      public static final int modules_contact_sync_native_images_mallow = 2131232304;
      public static final int modules_create_guild_native_images_img_artists_creators = 2131232305;
      public static final int modules_create_guild_native_images_img_clubs = 2131232306;
      public static final int modules_create_guild_native_images_img_create_my_own = 2131232307;
      public static final int modules_create_guild_native_images_img_friends = 2131232308;
      public static final int modules_create_guild_native_images_img_gaming = 2131232309;
      public static final int modules_create_guild_native_images_img_local_community = 2131232310;
      public static final int modules_create_guild_native_images_img_study = 2131232311;
      public static final int modules_create_guild_native_images_invitewumpusticket = 2131232312;
      public static final int modules_directory_channels_native_images_add = 2131232313;
      public static final int modules_directory_channels_native_images_add_server = 2131232314;
      public static final int modules_directory_channels_native_images_checked = 2131232315;
      public static final int modules_directory_channels_native_images_down_arrow = 2131232316;
      public static final int modules_directory_channels_native_images_hub_header = 2131232317;
      public static final int modules_directory_channels_native_images_invite = 2131232318;
      public static final int modules_directory_channels_native_images_more_horizontal = 2131232319;
      public static final int modules_directory_channels_native_images_pencil = 2131232320;
      public static final int modules_directory_channels_native_images_search_empty_state = 2131232321;
      public static final int modules_directory_channels_native_images_trash = 2131232322;
      public static final int modules_discover_native_images_discovery_header = 2131232323;
      public static final int modules_discover_native_images_discovery_header_ipad = 2131232324;
      public static final int modules_emoji_picker_native_images_alert = 2131232325;
      public static final int modules_explicit_media_redaction_assets_safety_shield = 2131232326;
      public static final int modules_expression_suggestions_native_images_lockedpack = 2131232327;
      public static final int modules_forums_native_images_ic_expression_plus = 2131232328;
      public static final int modules_forums_native_images_ic_follow = 2131232329;
      public static final int modules_forums_native_images_ic_following = 2131232330;
      public static final int modules_forums_native_images_ic_forum_channel = 2131232331;
      public static final int modules_forums_native_images_ic_forum_channel_locked = 2131232332;
      public static final int modules_forums_native_images_ic_forum_post = 2131232333;
      public static final int modules_forums_native_images_ic_forum_post_join = 2131232334;
      public static final int modules_forums_native_images_ic_tag = 2131232335;
      public static final int modules_forums_native_images_ic_upload = 2131232336;
      public static final int modules_forums_native_images_img_forum_empty_state_dark = 2131232337;
      public static final int modules_forums_native_images_img_forum_empty_state_light = 2131232338;
      public static final int modules_game_console_images_connect_playstation_mobile = 2131232339;
      public static final int modules_game_console_images_console_detect_authorize = 2131232340;
      public static final int modules_game_console_images_console_detect_searching = 2131232341;
      public static final int modules_game_console_images_console_detect_success = 2131232342;
      public static final int modules_game_console_images_devices_not_found = 2131232343;
      public static final int modules_game_console_images_ic_playstation_device_ps5_32px = 2131232344;
      public static final int modules_game_console_images_lan_detect_cta_thumbnail = 2131232345;
      public static final int modules_guild_antiraid_images_native_feedback_confirm = 2131232346;
      public static final int modules_guild_automod_images_ic_blocked_chat_bubble_icon = 2131232347;
      public static final int modules_guild_boosting_native_images_sparkle_star_elongated = 2131232348;
      public static final int modules_guild_boosting_native_images_sparkle_star_pointed = 2131232349;
      public static final int modules_guild_boosting_native_images_top_perk_streaming_quality = 2131232350;
      public static final int modules_guild_boosting_native_images_top_perk_vanity_url = 2131232351;
      public static final int modules_guild_home_native_images_dark_home_header_placeholder = 2131232352;
      public static final int modules_guild_home_native_images_ic_feed_more = 2131232353;
      public static final int modules_guild_home_native_images_light_home_header_placeholder = 2131232354;
      public static final int modules_guild_identity_images_guild_identity_education_dark = 2131232355;
      public static final int modules_guild_identity_images_guild_identity_education_light = 2131232356;
      public static final int modules_guild_member_verification_images_updateappicon = 2131232357;
      public static final int modules_guild_onboarding_home_images_mobileemptystate = 2131232358;
      public static final int modules_guild_onboarding_native_images_stampwave = 2131232359;
      public static final int modules_guild_profile_native_images_boost = 2131232360;
      public static final int modules_guild_progress_native_images_progresscenter = 2131232361;
      public static final int modules_guild_progress_native_images_progresssparkles = 2131232362;
      public static final int modules_guild_role_subscriptions_native_guild_settings_welcome_images_asset_role_subscription_earnings = 2131232363;
      public static final int modules_guild_role_subscriptions_native_guild_settings_welcome_images_asset_role_subscription_exclusive_perks = 2131232364;
      public static final int modules_guild_role_subscriptions_native_guild_settings_welcome_images_asset_role_subscription_megaphone = 2131232365;
      public static final int modules_guild_role_subscriptions_native_guild_settings_welcome_images_role_subscription_benefit_avatar_1 = 2131232366;
      public static final int modules_guild_role_subscriptions_native_guild_settings_welcome_images_role_subscription_benefit_bunny_avatar = 2131232367;
      public static final int modules_guild_role_subscriptions_native_guild_settings_welcome_images_role_subscription_benefit_nelly_avatar = 2131232368;
      public static final int modules_guild_role_subscriptions_native_guild_settings_welcome_images_role_subscription_benefit_wise_avatar = 2131232369;
      public static final int modules_guild_role_subscriptions_native_guild_settings_welcome_images_role_subscription_earning_illo = 2131232370;
      public static final int modules_guild_role_subscriptions_native_guild_settings_welcome_images_role_subscription_earning_metric_avatar = 2131232371;
      public static final int modules_guild_role_subscriptions_native_guild_settings_welcome_images_role_subscription_lanyard_illo = 2131232372;
      public static final int modules_guild_role_subscriptions_native_guild_settings_welcome_images_role_subscription_settings_hero = 2131232373;
      public static final int modules_guild_role_subscriptions_native_guild_settings_welcome_images_role_subscription_social = 2131232374;
      public static final int modules_guild_role_subscriptions_native_images_arrow = 2131232375;
      public static final int modules_guild_role_subscriptions_native_images_cactus = 2131232376;
      public static final int modules_guild_role_subscriptions_native_images_iap_feature_education = 2131232377;
      public static final int modules_guild_role_subscriptions_native_images_ic_add_perk_24px = 2131232378;
      public static final int modules_guild_role_subscriptions_native_images_ic_add_tier_40px = 2131232379;
      public static final int modules_guild_role_subscriptions_native_images_ic_edit_20px = 2131232380;
      public static final int modules_guild_role_subscriptions_native_images_ic_emoji_picker_20px = 2131232381;
      public static final int modules_guild_role_subscriptions_native_images_ic_full_server_gating_24px = 2131232382;
      public static final int modules_guild_role_subscriptions_native_images_ic_money_emoji_24px = 2131232383;
      public static final int modules_guild_role_subscriptions_native_images_ic_premium_channel_16px = 2131232384;
      public static final int modules_guild_role_subscriptions_native_images_ic_premium_info_24px = 2131232385;
      public static final int modules_guild_role_subscriptions_native_images_ic_premium_overview_24px = 2131232386;
      public static final int modules_guild_role_subscriptions_native_images_ic_premium_perk_money_24px = 2131232387;
      public static final int modules_guild_role_subscriptions_native_images_ic_premium_tiers_24px = 2131232388;
      public static final int modules_guild_role_subscriptions_native_images_ic_select_all_24px = 2131232389;
      public static final int modules_guild_role_subscriptions_native_images_ic_select_manually_24px = 2131232390;
      public static final int modules_guild_role_subscriptions_native_images_ic_subscriptions_ticket = 2131232391;
      public static final int modules_guild_role_subscriptions_native_images_ic_trash_filled_16px = 2131232392;
      public static final int modules_guild_role_subscriptions_native_images_ic_upload_24px = 2131232393;
      public static final int modules_guild_role_subscriptions_native_images_money_birb_placeholder_dark = 2131232394;
      public static final int modules_guild_role_subscriptions_native_images_money_birb_placeholder_light = 2131232395;
      public static final int modules_guild_role_subscriptions_native_images_onboarding_v2_upsell = 2131232396;
      public static final int modules_guild_role_subscriptions_native_images_partner_icon = 2131232397;
      public static final int modules_guild_role_subscriptions_native_images_premium_role_unavailable = 2131232398;
      public static final int modules_guild_role_subscriptions_native_images_resubscribed_alert_header = 2131232399;
      public static final int modules_guild_role_subscriptions_native_images_youtube_icon = 2131232400;
      public static final int modules_guild_scheduled_events_native_images_bell = 2131232401;
      public static final int modules_guild_scheduled_events_native_images_hub_events_upsell = 2131232402;
      public static final int modules_guild_scheduled_events_native_images_ic_clock = 2131232403;
      public static final int modules_guild_scheduled_events_native_images_ic_event_calendar = 2131232404;
      public static final int modules_guild_scheduled_events_native_images_iclocation = 2131232405;
      public static final int modules_guild_scheduled_events_native_images_stagechannelupsell = 2131232406;
      public static final int modules_guild_settings_roles_native_images_ic_person = 2131232407;
      public static final int modules_guild_settings_roles_native_images_illustrationdark = 2131232408;
      public static final int modules_guild_settings_roles_native_images_illustrationdarklarge = 2131232409;
      public static final int modules_guild_settings_roles_native_images_illustrationlight = 2131232410;
      public static final int modules_guild_settings_roles_native_images_illustrationlightlarge = 2131232411;
      public static final int modules_guild_templates_native_images_ic_guild_template = 2131232412;
      public static final int modules_guilds_bar_native_images_wumpus_wave = 2131232413;
      public static final int modules_hang_status_images_native_brb = 2131232414;
      public static final int modules_hang_status_images_native_chillin = 2131232415;
      public static final int modules_hang_status_images_native_gaming = 2131232416;
      public static final int modules_hang_status_images_native_grubbin = 2131232417;
      public static final int modules_hang_status_images_native_inthezone = 2131232418;
      public static final int modules_hang_status_images_native_wandering = 2131232419;
      public static final int modules_hang_status_images_native_watching = 2131232420;
      public static final int modules_hub_native_images_conversation = 2131232421;
      public static final int modules_hub_native_images_email_header = 2131232422;
      public static final int modules_hub_native_images_hub_events = 2131232423;
      public static final int modules_hub_native_images_hubadd = 2131232424;
      public static final int modules_hub_native_images_hubbacktoschool = 2131232425;
      public static final int modules_hub_native_images_hubdiscovery = 2131232426;
      public static final int modules_hub_native_images_hubheader = 2131232427;
      public static final int modules_hub_native_images_hubicon = 2131232428;
      public static final int modules_hub_native_images_hubinvite = 2131232429;
      public static final int modules_hub_native_images_progresssetup = 2131232430;
      public static final int modules_hub_native_images_redesign_email_header = 2131232431;
      public static final int modules_hub_native_images_redesignhubbacktoschool = 2131232432;
      public static final int modules_hub_native_images_search = 2131232433;
      public static final int modules_hub_native_images_search_empty_state = 2131232434;
      public static final int modules_hub_native_images_study = 2131232435;
      public static final int modules_hub_native_images_verifyemail = 2131232436;
      public static final int modules_instant_invite_native_images_copy = 2131232437;
      public static final int modules_instant_invite_native_images_gmail = 2131232438;
      public static final int modules_instant_invite_native_images_line = 2131232439;
      public static final int modules_instant_invite_native_images_mail = 2131232440;
      public static final int modules_instant_invite_native_images_messages = 2131232441;
      public static final int modules_instant_invite_native_images_messenger = 2131232442;
      public static final int modules_instant_invite_native_images_serverinviteenvelope = 2131232443;
      public static final int modules_instant_invite_native_images_shareandroid = 2131232444;
      public static final int modules_instant_invite_native_images_telegram = 2131232445;
      public static final int modules_instant_invite_native_images_twitter = 2131232446;
      public static final int modules_instant_invite_native_images_whatsapp = 2131232447;
      public static final int modules_main_tabs_v2_native_channel_header_images_iconsearch = 2131232448;
      public static final int modules_main_tabs_v2_native_images_arrowright = 2131232449;
      public static final int modules_main_tabs_v2_native_images_arrowsmdown = 2131232450;
      public static final int modules_main_tabs_v2_native_images_gameemptystate = 2131232451;
      public static final int modules_main_tabs_v2_native_images_gameemptystatecontroller = 2131232452;
      public static final int modules_main_tabs_v2_native_images_gtmannouncementwumpus = 2131232453;
      public static final int modules_main_tabs_v2_native_images_icactivity = 2131232454;
      public static final int modules_main_tabs_v2_native_images_icmessages = 2131232455;
      public static final int modules_main_tabs_v2_native_images_icnavigation = 2131232456;
      public static final int modules_main_tabs_v2_native_images_noresults = 2131232457;
      public static final int modules_main_tabs_v2_native_images_screenshare = 2131232458;
      public static final int modules_main_tabs_v2_native_images_stacknavback = 2131232459;
      public static final int modules_main_tabs_v2_native_images_stacknavclose = 2131232460;
      public static final int modules_main_tabs_v2_native_shared_components_user_list_images_iconarrowright = 2131232461;
      public static final int modules_main_tabs_v2_native_shared_components_user_list_images_iconnewgroup = 2131232462;
      public static final int modules_main_tabs_v2_native_shared_components_user_list_images_iconsettings = 2131232463;
      public static final int modules_main_tabs_v2_native_sidebar_images_iconcall = 2131232464;
      public static final int modules_main_tabs_v2_native_tabs_gravity_images_bgfade = 2131232465;
      public static final int modules_main_tabs_v2_native_tabs_gravity_images_emojinegative = 2131232466;
      public static final int modules_main_tabs_v2_native_tabs_gravity_images_emojineutral = 2131232467;
      public static final int modules_main_tabs_v2_native_tabs_gravity_images_emojipositive = 2131232468;
      public static final int modules_main_tabs_v2_native_tabs_gravity_images_flash = 2131232469;
      public static final int modules_main_tabs_v2_native_tabs_gravity_images_headerimagedark = 2131232470;
      public static final int modules_main_tabs_v2_native_tabs_gravity_images_headerimagelight = 2131232471;
      public static final int modules_main_tabs_v2_native_tabs_guilds_empty_states_images_channelsempty = 2131232472;
      public static final int modules_main_tabs_v2_native_tabs_guilds_empty_states_images_guildsemptyillustration = 2131232473;
      public static final int modules_main_tabs_v2_native_tabs_guilds_empty_states_images_iccustomize = 2131232474;
      public static final int modules_main_tabs_v2_native_tabs_you_images_about_me_onboarding = 2131232475;
      public static final int modules_main_tabs_v2_native_tabs_you_images_avatar_onboarding = 2131232476;
      public static final int modules_media_channel_native_images_asset_blurred_media_post_preview = 2131232477;
      public static final int modules_media_channel_native_images_ic_media_channel = 2131232478;
      public static final int modules_media_channel_native_images_ic_media_channel_locked = 2131232479;
      public static final int modules_media_channel_native_images_ic_media_post_share_prompt = 2131232480;
      public static final int modules_media_keyboard_native_images_empty_castle = 2131232481;
      public static final int modules_media_keyboard_native_images_empty_permission = 2131232482;
      public static final int modules_media_keyboard_native_images_empty_photos = 2131232483;
      public static final int modules_media_viewer_native_images_ic_eye = 2131232484;
      public static final int modules_media_viewer_native_images_ic_eye_hidden = 2131232485;
      public static final int modules_media_viewer_native_images_scrubber = 2131232486;
      public static final int modules_mfa_native_images_img_hand_key = 2131232487;
      public static final int modules_mfa_native_images_img_keychain = 2131232488;
      public static final int modules_mfa_native_images_img_register_header = 2131232489;
      public static final int modules_notification_center_native_images_ic_checked = 2131232490;
      public static final int modules_notification_center_native_images_ic_eye = 2131232491;
      public static final int modules_notification_center_native_images_ic_highlight = 2131232492;
      public static final int modules_notification_center_native_images_ic_share_screen = 2131232493;
      public static final int modules_notifications_images_ic_bell_on = 2131232494;
      public static final int modules_nuf_channels_native_images_amanda = 2131232495;
      public static final int modules_nuf_channels_native_images_channels_example = 2131232496;
      public static final int modules_nuf_channels_native_images_mallow = 2131232497;
      public static final int modules_nuf_channels_native_images_star_blue = 2131232498;
      public static final int modules_nuf_channels_native_images_star_green = 2131232499;
      public static final int modules_nuf_channels_native_images_star_pink = 2131232500;
      public static final int modules_nuf_channels_native_images_star_purple = 2131232501;
      public static final int modules_nuf_channels_native_images_voice_channels = 2131232502;
      public static final int modules_nuf_native_components_notification_notification_sparkles = 2131232503;
      public static final int modules_nuf_native_components_notification_notification_upsell = 2131232504;
      public static final int modules_nuf_native_components_notification_pointer_hand = 2131232505;
      public static final int modules_nuf_native_components_notification_redesign_notification_illustration = 2131232506;
      public static final int modules_nuf_native_components_value_props_images_valuepropcamera = 2131232507;
      public static final int modules_nuf_native_components_value_props_images_valuepropchat = 2131232508;
      public static final int modules_nuf_native_components_value_props_images_valuepropservers = 2131232509;
      public static final int modules_nuf_native_components_value_props_images_valuepropvoice = 2131232510;
      public static final int modules_nuf_native_components_value_props_images_valuepropwelcome = 2131232511;
      public static final int modules_nuf_native_images_discoverabilityheader = 2131232512;
      public static final int modules_nuf_native_images_educationcardchannels = 2131232513;
      public static final int modules_nuf_native_images_educationcarddms = 2131232514;
      public static final int modules_nuf_native_images_educationcardhelp = 2131232515;
      public static final int modules_nuf_native_images_educationcardserver = 2131232516;
      public static final int modules_opt_in_channels_native_images_nux = 2131232517;
      public static final int modules_parent_tools_images_family_center_activity_banner_image_parent = 2131232518;
      public static final int modules_parent_tools_images_family_center_activity_banner_image_teen = 2131232519;
      public static final int modules_parent_tools_images_family_center_activity_checklist_image = 2131232520;
      public static final int modules_parent_tools_images_family_center_chat_check_icon = 2131232521;
      public static final int modules_parent_tools_images_family_center_empty = 2131232522;
      public static final int modules_parent_tools_images_family_center_linking_banner_image = 2131232523;
      public static final int modules_parent_tools_images_ic_eye = 2131232524;
      public static final int modules_polls_native_images_ic_image = 2131232525;
      public static final int modules_polls_native_images_ic_list = 2131232526;
      public static final int modules_polls_native_images_ic_polls = 2131232527;
      public static final int modules_polls_native_images_loadissuedark = 2131232528;
      public static final int modules_polls_native_images_loadissuelight = 2131232529;
      public static final int modules_pomelo_images_account = 2131232530;
      public static final int modules_pomelo_images_discriminator = 2131232531;
      public static final int modules_pomelo_images_ic_legacy_username = 2131232532;
      public static final int modules_pomelo_images_pomelo_cards_native = 2131232533;
      public static final int modules_premium_native_images_gift_box = 2131232534;
      public static final int modules_premium_native_images_gift_cake = 2131232535;
      public static final int modules_premium_native_images_gift_chest = 2131232536;
      public static final int modules_premium_native_images_gift_coffee = 2131232537;
      public static final int modules_premium_native_images_nitro_home_banner = 2131232538;
      public static final int modules_premium_native_images_perks_badge = 2131232539;
      public static final int modules_premium_native_images_perks_client_theme = 2131232540;
      public static final int modules_premium_native_images_perks_custom_icons = 2131232541;
      public static final int modules_premium_native_images_perks_custom_profile = 2131232542;
      public static final int modules_premium_native_images_perks_custom_sounds = 2131232543;
      public static final int modules_premium_native_images_perks_early_access = 2131232544;
      public static final int modules_premium_native_images_perks_emoji = 2131232545;
      public static final int modules_premium_native_images_perks_entrace_sounds = 2131232546;
      public static final int modules_premium_native_images_perks_hd_video = 2131232547;
      public static final int modules_premium_native_images_perks_large_uploads = 2131232548;
      public static final int modules_premium_native_images_perks_member_pricing = 2131232549;
      public static final int modules_premium_native_images_perks_server_boosts = 2131232550;
      public static final int modules_premium_native_images_perks_sticker = 2131232551;
      public static final int modules_premium_native_images_perks_super_reaction = 2131232552;
      public static final int modules_premium_native_images_premium_gift_plan_selection_header = 2131232553;
      public static final int modules_premium_roadblocks_images_app_icons_upsell = 2131232554;
      public static final int modules_premium_roadblocks_images_client_themes_upsell = 2131232555;
      public static final int modules_private_channel_integrations_native_images_nellypointing = 2131232556;
      public static final int modules_quests_images_quests_embed_mobile_missing = 2131232557;
      public static final int modules_quests_images_wumpus_couch_gaming = 2131232558;
      public static final int modules_quests_native_images_ic_wreath = 2131232559;
      public static final int modules_quests_native_images_wreath_dark = 2131232560;
      public static final int modules_quests_native_images_wreath_light = 2131232561;
      public static final int modules_remixing_images_remix_marketing_tile_400x200 = 2131232562;
      public static final int modules_remixing_native_images_left_green_sparkle = 2131232563;
      public static final int modules_remixing_native_images_left_yellow_sparkle = 2131232564;
      public static final int modules_remixing_native_images_remix_early_access_upsell = 2131232565;
      public static final int modules_remixing_native_images_right_green_sparkle = 2131232566;
      public static final int modules_remixing_native_images_right_pink_sparkle = 2131232567;
      public static final int modules_safety_hub_images_checkwithstars = 2131232568;
      public static final int modules_safety_hub_images_strikedetailheader = 2131232569;
      public static final int modules_safety_hub_images_video_dark = 2131232570;
      public static final int modules_safety_hub_images_video_light = 2131232571;
      public static final int modules_search_v2_native_images_close = 2131232572;
      public static final int modules_search_v2_native_images_search = 2131232573;
      public static final int modules_self_mod_inappropriate_conversation_images_circle_check = 2131232574;
      public static final int modules_self_mod_inappropriate_conversation_images_crisis_text_line = 2131232575;
      public static final int modules_self_mod_inappropriate_conversation_images_tips = 2131232576;
      public static final int modules_self_mod_inappropriate_conversation_images_vibing_wumpus_rings = 2131232577;
      public static final int modules_self_mod_inappropriate_conversation_images_wumpus_exclamation = 2131232578;
      public static final int modules_self_mod_inappropriate_conversation_images_wumpus_lightbulb = 2131232579;
      public static final int modules_self_mod_shared_images_ic_checkmark = 2131232580;
      public static final int modules_self_mod_shared_images_safety_banner = 2131232581;
      public static final int modules_self_mod_stranger_danger_images_ic_thumbsdown = 2131232582;
      public static final int modules_self_mod_stranger_danger_images_ic_thumbsup = 2131232583;
      public static final int modules_stage_channels_native_images_audience_welcome = 2131232584;
      public static final int modules_stage_channels_native_images_ic_block = 2131232585;
      public static final int modules_stage_channels_native_images_ic_group = 2131232586;
      public static final int modules_stage_channels_native_images_ic_leave_stage = 2131232587;
      public static final int modules_stage_channels_native_images_ic_mic_dark_circle = 2131232588;
      public static final int modules_stage_channels_native_images_ic_mic_light_circle = 2131232589;
      public static final int modules_stage_channels_native_images_ic_minimize = 2131232590;
      public static final int modules_stage_channels_native_images_ic_moderator = 2131232591;
      public static final int modules_stage_channels_native_images_ic_move_to_audience = 2131232592;
      public static final int modules_stage_channels_native_images_ic_move_to_speaker = 2131232593;
      public static final int modules_stage_channels_native_images_ic_person_status = 2131232594;
      public static final int modules_stage_channels_native_images_ic_raised_hand = 2131232595;
      public static final int modules_stage_channels_native_images_ic_raised_hand_list = 2131232596;
      public static final int modules_stage_channels_native_images_ic_stage_channel_24px = 2131232597;
      public static final int modules_stage_channels_native_images_ic_stage_channel_32px = 2131232598;
      public static final int modules_stage_channels_native_images_ic_stage_locked = 2131232599;
      public static final int modules_stage_channels_native_images_ic_stage_music = 2131232600;
      public static final int modules_stage_channels_native_images_ic_stage_music_disabled = 2131232601;
      public static final int modules_stage_channels_native_images_img_empty_audience = 2131232602;
      public static final int modules_stage_channels_native_images_stagesparkles = 2131232603;
      public static final int modules_stickers_native_images_alert = 2131232604;
      public static final int modules_stickers_native_images_empty = 2131232605;
      public static final int modules_stickers_native_images_history = 2131232606;
      public static final int modules_stickers_native_images_img_premium_canvas_mobile = 2131232607;
      public static final int modules_stickers_native_images_sticker_search_empty = 2131232608;
      public static final int modules_summaries_native_images_summary_indicator_end = 2131232609;
      public static final int modules_summaries_native_images_summary_indicator_start = 2131232610;
      public static final int modules_system_dm_native_images_chatbubbletail = 2131232611;
      public static final int modules_system_dm_native_images_chatbubbletaillight = 2131232612;
      public static final int modules_system_dm_native_images_systemdmwumpus = 2131232613;
      public static final int modules_user_profile_images_banner_sample_banner = 2131232614;
      public static final int modules_user_settings_images_app_installed_check = 2131232615;
      public static final int modules_user_settings_images_lock = 2131232616;
      public static final int modules_user_settings_images_xbox_app_phone = 2131232617;
      public static final int modules_video_calls_native_images_add = 2131232618;
      public static final int modules_video_calls_native_images_camera = 2131232619;
      public static final int modules_video_calls_native_images_camera_swap = 2131232620;
      public static final int modules_video_calls_native_images_debug = 2131232621;
      public static final int modules_video_calls_native_images_disconnect = 2131232622;
      public static final int modules_video_calls_native_images_fullscreen = 2131232623;
      public static final int modules_video_calls_native_images_grid = 2131232624;
      public static final int modules_video_calls_native_images_group = 2131232625;
      public static final int modules_video_calls_native_images_hide_participants = 2131232626;
      public static final int modules_video_calls_native_images_mic = 2131232627;
      public static final int modules_video_calls_native_images_minimize = 2131232628;
      public static final int modules_video_calls_native_images_mobile = 2131232629;
      public static final int modules_video_calls_native_images_nux_gaming = 2131232630;
      public static final int modules_video_calls_native_images_report = 2131232631;
      public static final int modules_video_calls_native_images_screenshare_halfsheet_splash = 2131232632;
      public static final int modules_video_calls_native_images_screenshare_splash = 2131232633;
      public static final int modules_video_calls_native_images_server_video_invite = 2131232634;
      public static final int modules_video_calls_native_images_settings = 2131232635;
      public static final int modules_video_calls_native_images_speaker = 2131232636;
      public static final int modules_video_calls_native_images_spectator = 2131232637;
      public static final int modules_video_calls_native_images_watch = 2131232638;
      public static final int modules_video_calls_native_images_xbox_voice_upsell = 2131232639;
      public static final int modules_voice_messages_native_images_vm_bottom_sparkles = 2131232640;
      public static final int modules_voice_messages_native_images_vm_upsell_banner = 2131232641;
      public static final int modules_voice_panel_native_images_activity = 2131232642;
      public static final int modules_voice_panel_native_images_airplay = 2131232643;
      public static final int modules_voice_panel_native_images_background = 2131232644;
      public static final int modules_voice_panel_native_images_badconnection = 2131232645;
      public static final int modules_voice_panel_native_images_cameraswap = 2131232646;
      public static final int modules_voice_panel_native_images_close = 2131232647;
      public static final int modules_voice_panel_native_images_deafen = 2131232648;
      public static final int modules_voice_panel_native_images_maximize = 2131232649;
      public static final int modules_voice_panel_native_images_stream = 2131232650;
      public static final int modules_voice_panel_native_images_video = 2131232651;
      public static final int modules_voice_panel_native_images_xbox = 2131232652;
      public static final int modules_webauthn_native_images_img_credential = 2131232653;
      public static final int mtrl_bottomsheet_drag_handle = 2131232654;
      public static final int mtrl_checkbox_button = 2131232655;
      public static final int mtrl_checkbox_button_checked_unchecked = 2131232656;
      public static final int mtrl_checkbox_button_icon = 2131232657;
      public static final int mtrl_checkbox_button_icon_checked_indeterminate = 2131232658;
      public static final int mtrl_checkbox_button_icon_checked_unchecked = 2131232659;
      public static final int mtrl_checkbox_button_icon_indeterminate_checked = 2131232660;
      public static final int mtrl_checkbox_button_icon_indeterminate_unchecked = 2131232661;
      public static final int mtrl_checkbox_button_icon_unchecked_checked = 2131232662;
      public static final int mtrl_checkbox_button_icon_unchecked_indeterminate = 2131232663;
      public static final int mtrl_checkbox_button_unchecked_checked = 2131232664;
      public static final int mtrl_dialog_background = 2131232665;
      public static final int mtrl_dropdown_arrow = 2131232666;
      public static final int mtrl_ic_arrow_drop_down = 2131232667;
      public static final int mtrl_ic_arrow_drop_up = 2131232668;
      public static final int mtrl_ic_cancel = 2131232669;
      public static final int mtrl_ic_check_mark = 2131232670;
      public static final int mtrl_ic_checkbox_checked = 2131232671;
      public static final int mtrl_ic_checkbox_unchecked = 2131232672;
      public static final int mtrl_ic_error = 2131232673;
      public static final int mtrl_ic_indeterminate = 2131232674;
      public static final int mtrl_navigation_bar_item_background = 2131232675;
      public static final int mtrl_popupmenu_background = 2131232676;
      public static final int mtrl_popupmenu_background_overlay = 2131232677;
      public static final int mtrl_switch_thumb = 2131232678;
      public static final int mtrl_switch_thumb_checked = 2131232679;
      public static final int mtrl_switch_thumb_checked_pressed = 2131232680;
      public static final int mtrl_switch_thumb_checked_unchecked = 2131232681;
      public static final int mtrl_switch_thumb_pressed = 2131232682;
      public static final int mtrl_switch_thumb_pressed_checked = 2131232683;
      public static final int mtrl_switch_thumb_pressed_unchecked = 2131232684;
      public static final int mtrl_switch_thumb_unchecked = 2131232685;
      public static final int mtrl_switch_thumb_unchecked_checked = 2131232686;
      public static final int mtrl_switch_thumb_unchecked_pressed = 2131232687;
      public static final int mtrl_switch_track = 2131232688;
      public static final int mtrl_switch_track_decoration = 2131232689;
      public static final int mtrl_tabs_default_indicator = 2131232690;
      public static final int navigation_empty_icon = 2131232691;
      public static final int notification_action_background = 2131232692;
      public static final int notification_bg = 2131232693;
      public static final int notification_bg_low = 2131232694;
      public static final int notification_bg_low_normal = 2131232695;
      public static final int notification_bg_low_pressed = 2131232696;
      public static final int notification_bg_normal = 2131232697;
      public static final int notification_bg_normal_pressed = 2131232698;
      public static final int notification_icon_background = 2131232699;
      public static final int notification_oversize_large_icon_bg = 2131232700;
      public static final int notification_template_icon_bg = 2131232701;
      public static final int notification_template_icon_low_bg = 2131232702;
      public static final int notification_tile_bg = 2131232703;
      public static final int notify_panel_notification_icon_bg = 2131232704;
      public static final int overlay = 2131232705;
      public static final int premium_tier0_gradient = 2131232706;
      public static final int premium_tier0_gradient_circle = 2131232707;
      public static final int premium_tier2_gradient = 2131232708;
      public static final int premium_tier2_gradient_circle = 2131232709;
      public static final int redbox_top_border_background = 2131232710;
      public static final int test_level_drawable = 2131232711;
      public static final int tooltip_frame_dark = 2131232712;
      public static final int tooltip_frame_light = 2131232713;
      public static final int trash_bg = 2131232714;
      public static final int ucrop_crop = 2131232715;
      public static final int ucrop_ic_angle = 2131232716;
      public static final int ucrop_ic_crop = 2131232717;
      public static final int ucrop_ic_crop_unselected = 2131232718;
      public static final int ucrop_ic_cross = 2131232719;
      public static final int ucrop_ic_done = 2131232720;
      public static final int ucrop_ic_next = 2131232721;
      public static final int ucrop_ic_reset = 2131232722;
      public static final int ucrop_ic_rotate = 2131232723;
      public static final int ucrop_ic_rotate_unselected = 2131232724;
      public static final int ucrop_ic_scale = 2131232725;
      public static final int ucrop_ic_scale_unselected = 2131232726;
      public static final int ucrop_rotate = 2131232727;
      public static final int ucrop_scale = 2131232728;
      public static final int ucrop_shadow_upside = 2131232729;
      public static final int ucrop_vector_ic_crop = 2131232730;
      public static final int ucrop_vector_loader = 2131232731;
      public static final int ucrop_vector_loader_animated = 2131232732;
      public static final int ucrop_wrapper_controls_shape = 2131232733;

      private drawable() {
      }
   }

   public static final class font {
      public static final int roboto_medium_numbers = 2131296256;

      private font() {
      }
   }

   public static final class id {
      public static final int ALT = 2131361792;
      public static final int BOTTOM_END = 2131361793;
      public static final int BOTTOM_START = 2131361794;
      public static final int CTRL = 2131361795;
      public static final int FUNCTION = 2131361796;
      public static final int META = 2131361797;
      public static final int NO_DEBUG = 2131361798;
      public static final int SHIFT = 2131361799;
      public static final int SHOW_ALL = 2131361800;
      public static final int SHOW_PATH = 2131361801;
      public static final int SHOW_PROGRESS = 2131361802;
      public static final int SYM = 2131361803;
      public static final int TOP_END = 2131361804;
      public static final int TOP_START = 2131361805;
      public static final int above_bottom_row_barrier = 2131361806;
      public static final int accelerate = 2131361807;
      public static final int acceptButton = 2131361808;
      public static final int acceptButtonGradient = 2131361809;
      public static final int accept_button = 2131361810;
      public static final int accessibility_action_clickable_span = 2131361811;
      public static final int accessibility_actions = 2131361812;
      public static final int accessibility_collection = 2131361813;
      public static final int accessibility_collection_item = 2131361814;
      public static final int accessibility_custom_action_0 = 2131361815;
      public static final int accessibility_custom_action_1 = 2131361816;
      public static final int accessibility_custom_action_10 = 2131361817;
      public static final int accessibility_custom_action_11 = 2131361818;
      public static final int accessibility_custom_action_12 = 2131361819;
      public static final int accessibility_custom_action_13 = 2131361820;
      public static final int accessibility_custom_action_14 = 2131361821;
      public static final int accessibility_custom_action_15 = 2131361822;
      public static final int accessibility_custom_action_16 = 2131361823;
      public static final int accessibility_custom_action_17 = 2131361824;
      public static final int accessibility_custom_action_18 = 2131361825;
      public static final int accessibility_custom_action_19 = 2131361826;
      public static final int accessibility_custom_action_2 = 2131361827;
      public static final int accessibility_custom_action_20 = 2131361828;
      public static final int accessibility_custom_action_21 = 2131361829;
      public static final int accessibility_custom_action_22 = 2131361830;
      public static final int accessibility_custom_action_23 = 2131361831;
      public static final int accessibility_custom_action_24 = 2131361832;
      public static final int accessibility_custom_action_25 = 2131361833;
      public static final int accessibility_custom_action_26 = 2131361834;
      public static final int accessibility_custom_action_27 = 2131361835;
      public static final int accessibility_custom_action_28 = 2131361836;
      public static final int accessibility_custom_action_29 = 2131361837;
      public static final int accessibility_custom_action_3 = 2131361838;
      public static final int accessibility_custom_action_30 = 2131361839;
      public static final int accessibility_custom_action_31 = 2131361840;
      public static final int accessibility_custom_action_4 = 2131361841;
      public static final int accessibility_custom_action_5 = 2131361842;
      public static final int accessibility_custom_action_6 = 2131361843;
      public static final int accessibility_custom_action_7 = 2131361844;
      public static final int accessibility_custom_action_8 = 2131361845;
      public static final int accessibility_custom_action_9 = 2131361846;
      public static final int accessibility_hint = 2131361847;
      public static final int accessibility_label = 2131361848;
      public static final int accessibility_links = 2131361849;
      public static final int accessibility_role = 2131361850;
      public static final int accessibility_state = 2131361851;
      public static final int accessibility_state_expanded = 2131361852;
      public static final int accessibility_value = 2131361853;
      public static final int accessories_view = 2131361854;
      public static final int action0 = 2131361855;
      public static final int action_bar = 2131361856;
      public static final int action_bar_activity_content = 2131361857;
      public static final int action_bar_container = 2131361858;
      public static final int action_bar_root = 2131361859;
      public static final int action_bar_spinner = 2131361860;
      public static final int action_bar_subtitle = 2131361861;
      public static final int action_bar_title = 2131361862;
      public static final int action_button = 2131361863;
      public static final int action_container = 2131361864;
      public static final int action_context_bar = 2131361865;
      public static final int action_divider = 2131361866;
      public static final int action_image = 2131361867;
      public static final int action_menu_divider = 2131361868;
      public static final int action_menu_presenter = 2131361869;
      public static final int action_mode_bar = 2131361870;
      public static final int action_mode_bar_stub = 2131361871;
      public static final int action_mode_close_button = 2131361872;
      public static final int action_row_component_view_group = 2131361873;
      public static final int action_row_component_view_group_error_row = 2131361874;
      public static final int action_text = 2131361875;
      public static final int actions = 2131361876;
      public static final int actions_button = 2131361877;
      public static final int activity_chooser_view_content = 2131361878;
      public static final int add = 2131361879;
      public static final int add_reaction = 2131361880;
      public static final int add_reaction_image = 2131361881;
      public static final int add_reaction_text = 2131361882;
      public static final int adjust_height = 2131361883;
      public static final int adjust_width = 2131361884;
      public static final int alertTitle = 2131361885;
      public static final int aligned = 2131361886;
      public static final int all = 2131361887;
      public static final int alt_remix_tag = 2131361888;
      public static final int alt_text_container = 2131361889;
      public static final int alt_text_label = 2131361890;
      public static final int always = 2131361891;
      public static final int ampm = 2131361892;
      public static final int animateToEnd = 2131361893;
      public static final int animateToStart = 2131361894;
      public static final int answers = 2131361895;
      public static final int arc = 2131361896;
      public static final int arrow = 2131361897;
      public static final int asConfigured = 2131361898;
      public static final int async = 2131361899;
      public static final int audio_details_view = 2131361900;
      public static final int audio_file_name = 2131361901;
      public static final int audio_file_size = 2131361902;
      public static final int audio_progress_bar = 2131361903;
      public static final int author_avatar = 2131361904;
      public static final int author_avatar_decoration = 2131361905;
      public static final int author_container = 2131361906;
      public static final int author_name = 2131361907;
      public static final int auto = 2131361908;
      public static final int autoComplete = 2131361909;
      public static final int autoCompleteToEnd = 2131361910;
      public static final int autoCompleteToStart = 2131361911;
      public static final int autofill_inline_suggestion_end_icon = 2131361912;
      public static final int autofill_inline_suggestion_start_icon = 2131361913;
      public static final int autofill_inline_suggestion_subtitle = 2131361914;
      public static final int autofill_inline_suggestion_title = 2131361915;
      public static final int automatic = 2131361916;
      public static final int automod_message_channel = 2131361917;
      public static final int automod_message_context_header = 2131361918;
      public static final int avatar = 2131361919;
      public static final int avatar_placeholder = 2131361920;
      public static final int avatars = 2131361921;
      public static final int background_image = 2131361922;
      public static final int badge = 2131361923;
      public static final int badge_container = 2131361924;
      public static final int badge_icon = 2131361925;
      public static final int badge_text = 2131361926;
      public static final int barrier = 2131361927;
      public static final int barrier_button = 2131361928;
      public static final int barrier_footer = 2131361929;
      public static final int barrier_header = 2131361930;
      public static final int baseline = 2131361931;
      public static final int beginOnFirstDraw = 2131361932;
      public static final int beginning = 2131361933;
      public static final int bg_gradient = 2131361934;
      public static final int blocked_message_group_button = 2131361935;
      public static final int blocked_messages = 2131361936;
      public static final int blocking = 2131361937;
      public static final int blur_view = 2131361938;
      public static final int body = 2131361939;
      public static final int border = 2131361940;
      public static final int bottom = 2131361941;
      public static final int bottomEnd = 2131361942;
      public static final int bottomStart = 2131361943;
      public static final int bottom_end_label = 2131361944;
      public static final int bottom_guideline = 2131361945;
      public static final int bounce = 2131361946;
      public static final int browser_actions_header_text = 2131361947;
      public static final int browser_actions_menu_item_icon = 2131361948;
      public static final int browser_actions_menu_item_text = 2131361949;
      public static final int browser_actions_menu_items = 2131361950;
      public static final int browser_actions_menu_view = 2131361951;
      public static final int button = 2131361952;
      public static final int buttonPanel = 2131361953;
      public static final int button_container = 2131361954;
      public static final int button_wrapper = 2131361955;
      public static final int camera_button = 2131361956;
      public static final int cancel_action = 2131361957;
      public static final int cancel_button = 2131361958;
      public static final int card = 2131361959;
      public static final int catalyst_redbox_title = 2131361960;
      public static final int category_name = 2131361961;
      public static final int cause_header = 2131361962;
      public static final int center = 2131361963;
      public static final int centerCrop = 2131361964;
      public static final int centerInside = 2131361965;
      public static final int center_horizontal = 2131361966;
      public static final int center_vertical = 2131361967;
      public static final int chain = 2131361968;
      public static final int chains = 2131361969;
      public static final int channel_bottom_barrier = 2131361970;
      public static final int channel_icon = 2131361971;
      public static final int channel_name = 2131361972;
      public static final int channel_select = 2131361973;
      public static final int channel_start_barrier = 2131361974;
      public static final int channel_top_barrier = 2131361975;
      public static final int chat_input_edit_text = 2131361976;
      public static final int chat_list_adapter_item_icon_help = 2131361977;
      public static final int chat_list_adapter_item_text_dismiss = 2131361978;
      public static final int chat_list_adapter_item_text_feedback = 2131361979;
      public static final int chat_list_adapter_item_visibility_icon = 2131361980;
      public static final int chat_list_feedback_icon = 2131361981;
      public static final int chat_list_view = 2131361982;
      public static final int checkbox = 2131361983;
      public static final int checked = 2131361984;
      public static final int chronometer = 2131361985;
      public static final int circle_center = 2131361986;
      public static final int clan_tag_chiplet = 2131361987;
      public static final int clear_text = 2131361988;
      public static final int clip_horizontal = 2131361989;
      public static final int clip_vertical = 2131361990;
      public static final int clockwise = 2131361991;
      public static final int close = 2131361992;
      public static final int close_icon = 2131361993;
      public static final int collapseActionView = 2131361994;
      public static final int column = 2131361995;
      public static final int column_reverse = 2131361996;
      public static final int compress = 2131361997;
      public static final int confirm_button = 2131361998;
      public static final int connections_role_tag = 2131361999;
      public static final int connections_role_tag_container = 2131362000;
      public static final int container = 2131362001;
      public static final int content = 2131362002;
      public static final int contentPanel = 2131362003;
      public static final int content_footer_view = 2131362004;
      public static final int content_inventory_component_avatar_image = 2131362005;
      public static final int content_inventory_component_badge_icon = 2131362006;
      public static final int content_inventory_component_media_image = 2131362007;
      public static final int content_inventory_component_platform_icon = 2131362008;
      public static final int content_inventory_component_subtitle = 2131362009;
      public static final int content_inventory_component_title = 2131362010;
      public static final int content_inventory_component_username = 2131362011;
      public static final int content_view = 2131362012;
      public static final int contiguous = 2131362013;
      public static final int controls_shadow = 2131362014;
      public static final int controls_wrapper = 2131362015;
      public static final int coordinator = 2131362016;
      public static final int copy_button = 2131362017;
      public static final int cos = 2131362018;
      public static final int counterclockwise = 2131362019;
      public static final int cover_image = 2131362020;
      public static final int cover_image_overlay_button = 2131362021;
      public static final int cradle = 2131362022;
      public static final int creator_avatar = 2131362023;
      public static final int cta = 2131362024;
      public static final int ctaButton = 2131362025;
      public static final int custom = 2131362026;
      public static final int customPanel = 2131362027;
      public static final int cut = 2131362028;
      public static final int dark = 2131362029;
      public static final int date = 2131362030;
      public static final int date_picker_actions = 2131362031;
      public static final int day = 2131362032;
      public static final int decelerate = 2131362033;
      public static final int decelerateAndComplete = 2131362034;
      public static final int decor_content_parent = 2131362035;
      public static final int default_activity_button = 2131362036;
      public static final int deltaRelative = 2131362037;
      public static final int description = 2131362038;
      public static final int description_label = 2131362039;
      public static final int description_text = 2131362040;
      public static final int design_bottom_sheet = 2131362041;
      public static final int design_menu_item_action_area = 2131362042;
      public static final int design_menu_item_action_area_stub = 2131362043;
      public static final int design_menu_item_text = 2131362044;
      public static final int design_navigation_view = 2131362045;
      public static final int dialog_button = 2131362046;
      public static final int dialog_card = 2131362047;
      public static final int dimensions = 2131362048;
      public static final int direct = 2131362049;
      public static final int disableHome = 2131362050;
      public static final int disablePostScroll = 2131362051;
      public static final int disableScroll = 2131362052;
      public static final int disabled = 2131362053;
      public static final int disconnect_btn = 2131362054;
      public static final int disjoint = 2131362055;
      public static final int divider = 2131362056;
      public static final int dragDown = 2131362057;
      public static final int dragEnd = 2131362058;
      public static final int dragLeft = 2131362059;
      public static final int dragRight = 2131362060;
      public static final int dragStart = 2131362061;
      public static final int dragUp = 2131362062;
      public static final int dropdown_menu = 2131362063;
      public static final int easeIn = 2131362064;
      public static final int easeInOut = 2131362065;
      public static final int easeOut = 2131362066;
      public static final int edge = 2131362067;
      public static final int edit_query = 2131362068;
      public static final int edit_text_id = 2131362069;
      public static final int elastic = 2131362070;
      public static final int embed = 2131362071;
      public static final int emoji = 2131362072;
      public static final int emoji_button = 2131362073;
      public static final int empty_end = 2131362074;
      public static final int empty_results = 2131362075;
      public static final int empty_start = 2131362076;
      public static final int enabled = 2131362077;
      public static final int end = 2131362078;
      public static final int endToStart = 2131362079;
      public static final int end_image = 2131362080;
      public static final int end_padder = 2131362081;
      public static final int enterAlways = 2131362082;
      public static final int enterAlwaysCollapsed = 2131362083;
      public static final int error = 2131362084;
      public static final int error_icon = 2131362085;
      public static final int error_label = 2131362086;
      public static final int exception = 2131362087;
      public static final int exitUntilCollapsed = 2131362088;
      public static final int exo_ad_overlay = 2131362089;
      public static final int exo_artwork = 2131362090;
      public static final int exo_audio_track = 2131362091;
      public static final int exo_basic_controls = 2131362092;
      public static final int exo_bottom_bar = 2131362093;
      public static final int exo_buffering = 2131362094;
      public static final int exo_center_controls = 2131362095;
      public static final int exo_check = 2131362096;
      public static final int exo_content_frame = 2131362097;
      public static final int exo_controller = 2131362098;
      public static final int exo_controller_placeholder = 2131362099;
      public static final int exo_controls_background = 2131362100;
      public static final int exo_duration = 2131362101;
      public static final int exo_error_message = 2131362102;
      public static final int exo_extra_controls = 2131362103;
      public static final int exo_extra_controls_scroll_view = 2131362104;
      public static final int exo_ffwd = 2131362105;
      public static final int exo_ffwd_with_amount = 2131362106;
      public static final int exo_fullscreen = 2131362107;
      public static final int exo_icon = 2131362108;
      public static final int exo_main_text = 2131362109;
      public static final int exo_minimal_controls = 2131362110;
      public static final int exo_minimal_fullscreen = 2131362111;
      public static final int exo_next = 2131362112;
      public static final int exo_overflow_hide = 2131362113;
      public static final int exo_overflow_show = 2131362114;
      public static final int exo_overlay = 2131362115;
      public static final int exo_pause = 2131362116;
      public static final int exo_play = 2131362117;
      public static final int exo_play_pause = 2131362118;
      public static final int exo_play_pause_container = 2131362119;
      public static final int exo_playback_speed = 2131362120;
      public static final int exo_position = 2131362121;
      public static final int exo_prev = 2131362122;
      public static final int exo_progress = 2131362123;
      public static final int exo_progress_placeholder = 2131362124;
      public static final int exo_repeat_toggle = 2131362125;
      public static final int exo_rew = 2131362126;
      public static final int exo_rew_with_amount = 2131362127;
      public static final int exo_settings = 2131362128;
      public static final int exo_settings_listview = 2131362129;
      public static final int exo_shuffle = 2131362130;
      public static final int exo_shutter = 2131362131;
      public static final int exo_sub_text = 2131362132;
      public static final int exo_subtitle = 2131362133;
      public static final int exo_subtitles = 2131362134;
      public static final int exo_text = 2131362135;
      public static final int exo_time = 2131362136;
      public static final int exo_track_selection_view = 2131362137;
      public static final int exo_vr = 2131362138;
      public static final int expand_activities_button = 2131362139;
      public static final int expanded_menu = 2131362140;
      public static final int fade = 2131362141;
      public static final int feed_channel_icon = 2131362142;
      public static final int feed_channel_text = 2131362143;
      public static final int feed_reply_count = 2131362144;
      public static final int feed_reply_icon = 2131362145;
      public static final int feed_reply_participants = 2131362146;
      public static final int feedback_button = 2131362147;
      public static final int fields_bottom_wrap = 2131362148;
      public static final int fields_container = 2131362149;
      public static final int fields_top_wrap = 2131362150;
      public static final int file_action_group = 2131362151;
      public static final int file_attachment_container = 2131362152;
      public static final int file_attachment_description = 2131362153;
      public static final int file_attachment_download = 2131362154;
      public static final int file_attachment_download_icon_barrier = 2131362155;
      public static final int file_attachment_download_progress_bar = 2131362156;
      public static final int file_attachment_icon = 2131362157;
      public static final int file_attachment_name = 2131362158;
      public static final int fill = 2131362159;
      public static final int fill_horizontal = 2131362160;
      public static final int fill_vertical = 2131362161;
      public static final int filled = 2131362162;
      public static final int fit = 2131362163;
      public static final int fitBottomStart = 2131362164;
      public static final int fitCenter = 2131362165;
      public static final int fitEnd = 2131362166;
      public static final int fitStart = 2131362167;
      public static final int fitToContents = 2131362168;
      public static final int fitXY = 2131362169;
      public static final int fixed = 2131362170;
      public static final int fixed_height = 2131362171;
      public static final int fixed_width = 2131362172;
      public static final int flagged_message_keyword = 2131362173;
      public static final int flagged_message_rule_name = 2131362174;
      public static final int flex_end = 2131362175;
      public static final int flex_start = 2131362176;
      public static final int flip = 2131362177;
      public static final int floating = 2131362178;
      public static final int focusCrop = 2131362179;
      public static final int follow_button = 2131362180;
      public static final int footer = 2131362181;
      public static final int footer_avatar = 2131362182;
      public static final int footer_barrier = 2131362183;
      public static final int footer_container = 2131362184;
      public static final int footer_divider = 2131362185;
      public static final int footer_text = 2131362186;
      public static final int forever = 2131362187;
      public static final int forum_post_action_bar_wrap = 2131362188;
      public static final int forward = 2131362189;
      public static final int fps_text = 2131362190;
      public static final int fragment_container_view_tag = 2131362191;
      public static final int fullscreen_header = 2131362192;
      public static final int gaming_stats_button = 2131362193;
      public static final int ghost_view = 2131362194;
      public static final int ghost_view_holder = 2131362195;
      public static final int gif_button = 2131362196;
      public static final int gif_indicator = 2131362197;
      public static final int gone = 2131362198;
      public static final int gradient = 2131362199;
      public static final int gradient_divider = 2131362200;
      public static final int gradient_icon = 2131362201;
      public static final int gradients = 2131362202;
      public static final int graph = 2131362203;
      public static final int graph_wrap = 2131362204;
      public static final int group_divider = 2131362205;
      public static final int groups = 2131362206;
      public static final int guild_avatar = 2131362207;
      public static final int guild_communication_disabled_icon = 2131362208;
      public static final int guild_icon = 2131362209;
      public static final int guild_name = 2131362210;
      public static final int guild_text = 2131362211;
      public static final int guilds_item_avatar_wrap = 2131362212;
      public static final int hardware = 2131362213;
      public static final int header = 2131362214;
      public static final int headerGradient = 2131362215;
      public static final int header_barrier = 2131362216;
      public static final int header_divider = 2131362217;
      public static final int header_icon = 2131362218;
      public static final int header_section = 2131362219;
      public static final int header_text = 2131362220;
      public static final int header_title = 2131362221;
      public static final int hero_text = 2131362222;
      public static final int hide_button = 2131362223;
      public static final int hide_ime_id = 2131362224;
      public static final int hideable = 2131362225;
      public static final int highlight_header_view = 2131362226;
      public static final int highlight_icon = 2131362227;
      public static final int home = 2131362228;
      public static final int homeAsUp = 2131362229;
      public static final int honorRequest = 2131362230;
      public static final int hour = 2131362231;
      public static final int icon = 2131362232;
      public static final int icon_button = 2131362233;
      public static final int icon_container = 2131362234;
      public static final int icon_group = 2131362235;
      public static final int icon_only = 2131362236;
      public static final int ifRoom = 2131362237;
      public static final int ignore = 2131362238;
      public static final int ignoreRequest = 2131362239;
      public static final int image = 2131362240;
      public static final int image_alt_text = 2131362241;
      public static final int image_blur_bg = 2131362242;
      public static final int image_view_crop = 2131362243;
      public static final int image_view_logo = 2131362244;
      public static final int image_view_state_aspect_ratio = 2131362245;
      public static final int image_view_state_rotate = 2131362246;
      public static final int image_view_state_scale = 2131362247;
      public static final int indeterminate = 2131362248;
      public static final int indicator_bottom = 2131362249;
      public static final int indicator_end_barrier = 2131362250;
      public static final int indicator_top = 2131362251;
      public static final int info = 2131362252;
      public static final int info_bar = 2131362253;
      public static final int info_link_container = 2131362254;
      public static final int inline_media_container = 2131362255;
      public static final int inline_media_gif_indicator = 2131362256;
      public static final int inline_media_image_preview = 2131362257;
      public static final int inline_media_loading_indicator = 2131362258;
      public static final int inline_media_play_button = 2131362259;
      public static final int inline_media_view = 2131362260;
      public static final int inline_media_view2 = 2131362261;
      public static final int inline_media_view3 = 2131362262;
      public static final int inline_media_view4 = 2131362263;
      public static final int inline_media_volume_toggle = 2131362264;
      public static final int invisible = 2131362265;
      public static final int invite_to_speak_button = 2131362266;
      public static final int invite_to_speak_text = 2131362267;
      public static final int inward = 2131362268;
      public static final int is_pooling_container_tag = 2131362269;
      public static final int italic = 2131362270;
      public static final int item_bottom_container = 2131362271;
      public static final int item_components_root = 2131362272;
      public static final int item_description = 2131362273;
      public static final int item_header = 2131362274;
      public static final int item_hero = 2131362275;
      public static final int item_invite_disabled_icon = 2131362276;
      public static final int item_invite_header = 2131362277;
      public static final int item_invite_help_icon = 2131362278;
      public static final int item_invite_hub_layout = 2131362279;
      public static final int item_invite_hub_link = 2131362280;
      public static final int item_invite_image = 2131362281;
      public static final int item_invite_inner_container = 2131362282;
      public static final int item_invite_joined_button = 2131362283;
      public static final int item_invite_member_container = 2131362284;
      public static final int item_invite_online_dot = 2131362285;
      public static final int item_invite_online_text = 2131362286;
      public static final int item_invite_splash = 2131362287;
      public static final int item_invite_subtitle = 2131362288;
      public static final int item_invite_subtitle_icon = 2131362289;
      public static final int item_invite_title = 2131362290;
      public static final int item_invite_total_member_dot = 2131362291;
      public static final int item_invite_total_member_text = 2131362292;
      public static final int item_subtitle = 2131362293;
      public static final int item_title = 2131362294;
      public static final int item_touch_helper_previous_elevation = 2131362295;
      public static final int join_cta = 2131362296;
      public static final int json = 2131362297;
      public static final int json_header = 2131362298;
      public static final int jumpToEnd = 2131362299;
      public static final int jumpToStart = 2131362300;
      public static final int jump_button = 2131362301;
      public static final int label = 2131362302;
      public static final int labeled = 2131362303;
      public static final int labelled_by = 2131362304;
      public static final int launch_button = 2131362305;
      public static final int layout = 2131362306;
      public static final int layout_aspect_ratio = 2131362307;
      public static final int layout_rotate_wheel = 2131362308;
      public static final int layout_scale_wheel = 2131362309;
      public static final int learn_more = 2131362310;
      public static final int left = 2131362311;
      public static final int leftToRight = 2131362312;
      public static final int left_bar = 2131362313;
      public static final int legacy = 2131362314;
      public static final int light = 2131362315;
      public static final int line1 = 2131362316;
      public static final int line3 = 2131362317;
      public static final int linear = 2131362318;
      public static final int link_icon = 2131362319;
      public static final int listMode = 2131362320;
      public static final int list_item = 2131362321;
      public static final int loading_dots = 2131362322;
      public static final int lottie_layer_name = 2131362323;
      public static final int m3_side_sheet = 2131362324;
      public static final int marquee = 2131362325;
      public static final int masked = 2131362326;
      public static final int match_parent = 2131362327;
      public static final int material_clock_display = 2131362328;
      public static final int material_clock_display_and_toggle = 2131362329;
      public static final int material_clock_face = 2131362330;
      public static final int material_clock_hand = 2131362331;
      public static final int material_clock_level = 2131362332;
      public static final int material_clock_period_am_button = 2131362333;
      public static final int material_clock_period_pm_button = 2131362334;
      public static final int material_clock_period_toggle = 2131362335;
      public static final int material_hour_text_input = 2131362336;
      public static final int material_hour_tv = 2131362337;
      public static final int material_label = 2131362338;
      public static final int material_minute_text_input = 2131362339;
      public static final int material_minute_tv = 2131362340;
      public static final int material_textinput_timepicker = 2131362341;
      public static final int material_timepicker_cancel_button = 2131362342;
      public static final int material_timepicker_container = 2131362343;
      public static final int material_timepicker_mode_button = 2131362344;
      public static final int material_timepicker_ok_button = 2131362345;
      public static final int material_timepicker_view = 2131362346;
      public static final int material_value_index = 2131362347;
      public static final int matrix = 2131362348;
      public static final int media_actions = 2131362349;
      public static final int media_controller_compat_view_tag = 2131362350;
      public static final int media_view = 2131362351;
      public static final int media_view_alt_text = 2131362352;
      public static final int media_view_alt_text_button = 2131362353;
      public static final int media_warning_icon = 2131362354;
      public static final int menu_bottom = 2131362355;
      public static final int menu_container = 2131362356;
      public static final int menu_crop = 2131362357;
      public static final int menu_loader = 2131362358;
      public static final int menu_top = 2131362359;
      public static final int menu_top_status_container = 2131362360;
      public static final int message = 2131362361;
      public static final int message_alt_remix_tag_view = 2131362362;
      public static final int message_end_guideline = 2131362363;
      public static final int message_frame_feed_header = 2131362364;
      public static final int message_frame_header = 2131362365;
      public static final int message_frame_jump_header = 2131362366;
      public static final int message_header_barrier = 2131362367;
      public static final int message_header_divider = 2131362368;
      public static final int message_header_subtitle = 2131362369;
      public static final int message_header_title = 2131362370;
      public static final int message_start_guideline = 2131362371;
      public static final int message_tag_view = 2131362372;
      public static final int message_view = 2131362373;
      public static final int metricsDelegator = 2131362374;
      public static final int metricsStateHolder = 2131362375;
      public static final int middle = 2131362376;
      public static final int middle_text = 2131362377;
      public static final int mini = 2131362378;
      public static final int minutes = 2131362379;
      public static final int month = 2131362380;
      public static final int month_grid = 2131362381;
      public static final int month_navigation_bar = 2131362382;
      public static final int month_navigation_fragment_toggle = 2131362383;
      public static final int month_navigation_next = 2131362384;
      public static final int month_navigation_previous = 2131362385;
      public static final int month_title = 2131362386;
      public static final int more_button = 2131362387;
      public static final int mosaic = 2131362388;
      public static final int motion_base = 2131362389;
      public static final int move_to_speaker_icon = 2131362390;
      public static final int mtrl_anchor_parent = 2131362391;
      public static final int mtrl_calendar_day_selector_frame = 2131362392;
      public static final int mtrl_calendar_days_of_week = 2131362393;
      public static final int mtrl_calendar_frame = 2131362394;
      public static final int mtrl_calendar_main_pane = 2131362395;
      public static final int mtrl_calendar_months = 2131362396;
      public static final int mtrl_calendar_selection_frame = 2131362397;
      public static final int mtrl_calendar_text_input_frame = 2131362398;
      public static final int mtrl_calendar_year_selector_frame = 2131362399;
      public static final int mtrl_card_checked_layer_id = 2131362400;
      public static final int mtrl_child_content_container = 2131362401;
      public static final int mtrl_internal_children_alpha_tag = 2131362402;
      public static final int mtrl_motion_snapshot_view = 2131362403;
      public static final int mtrl_picker_fullscreen = 2131362404;
      public static final int mtrl_picker_header = 2131362405;
      public static final int mtrl_picker_header_selection_text = 2131362406;
      public static final int mtrl_picker_header_title_and_selection = 2131362407;
      public static final int mtrl_picker_header_toggle = 2131362408;
      public static final int mtrl_picker_text_input_date = 2131362409;
      public static final int mtrl_picker_text_input_range_end = 2131362410;
      public static final int mtrl_picker_text_input_range_start = 2131362411;
      public static final int mtrl_picker_title_text = 2131362412;
      public static final int mtrl_view_tag_bottom_padding = 2131362413;
      public static final int multiply = 2131362414;
      public static final int mute_toggle = 2131362415;
      public static final int name = 2131362416;
      public static final int navigation_bar_item_active_indicator_view = 2131362417;
      public static final int navigation_bar_item_icon_container = 2131362418;
      public static final int navigation_bar_item_icon_view = 2131362419;
      public static final int navigation_bar_item_labels_group = 2131362420;
      public static final int navigation_bar_item_large_label_view = 2131362421;
      public static final int navigation_bar_item_small_label_view = 2131362422;
      public static final int navigation_header_container = 2131362423;
      public static final int never = 2131362424;
      public static final int noScroll = 2131362425;
      public static final int no_participants_text = 2131362426;
      public static final int none = 2131362427;
      public static final int none_horizontal = 2131362428;
      public static final int none_vertical = 2131362429;
      public static final int normal = 2131362430;
      public static final int notification_background = 2131362431;
      public static final int notification_main_column = 2131362432;
      public static final int notification_main_column_container = 2131362433;
      public static final int nowrap = 2131362434;
      public static final int obscure = 2131362435;
      public static final int off = 2131362436;
      public static final int on = 2131362437;
      public static final int one = 2131362438;
      public static final int other_reactions_count = 2131362439;
      public static final int outline = 2131362440;
      public static final int outward = 2131362441;
      public static final int overlay_bottom = 2131362442;
      public static final int overlay_bubble_iv = 2131362443;
      public static final int overlay_centered_container = 2131362444;
      public static final int overlay_channel_name = 2131362445;
      public static final int overlay_channel_search = 2131362446;
      public static final int overlay_container = 2131362447;
      public static final int overlay_guild_name = 2131362448;
      public static final int overlay_header = 2131362449;
      public static final int overlay_image = 2131362450;
      public static final int overlay_invite_link = 2131362451;
      public static final int overlay_layout = 2131362452;
      public static final int overlay_linked_anchor_view = 2131362453;
      public static final int overlay_members_overflow_text = 2131362454;
      public static final int overlay_members_recycler = 2131362455;
      public static final int overlay_menu = 2131362456;
      public static final int overlay_network_icon = 2131362457;
      public static final int overlay_open_app = 2131362458;
      public static final int overlay_switch_channels = 2131362459;
      public static final int overlay_tag = 2131362460;
      public static final int overlay_tag_icon = 2131362461;
      public static final int overlay_tag_text = 2131362462;
      public static final int overlay_top = 2131362463;
      public static final int packed = 2131362464;
      public static final int parallax = 2131362465;
      public static final int parent = 2131362466;
      public static final int parentPanel = 2131362467;
      public static final int parentRelative = 2131362468;
      public static final int parent_matrix = 2131362469;
      public static final int participants = 2131362470;
      public static final int participants_container = 2131362471;
      public static final int participants_info = 2131362472;
      public static final int participants_info_container = 2131362473;
      public static final int password_toggle = 2131362474;
      public static final int path = 2131362475;
      public static final int pathRelative = 2131362476;
      public static final int peekHeight = 2131362477;
      public static final int percent = 2131362478;
      public static final int percentage_bar_background = 2131362479;
      public static final int percentage_bar_container = 2131362480;
      public static final int pickerWrapper = 2131362481;
      public static final int pin = 2131362482;
      public static final int player_container = 2131362483;
      public static final int pointer_events = 2131362484;
      public static final int pooling_container_listener_holder_tag = 2131362485;
      public static final int position = 2131362486;
      public static final int postLayout = 2131362487;
      public static final int pressed = 2131362488;
      public static final int primary_action = 2131362489;
      public static final int primary_cta = 2131362490;
      public static final int progress = 2131362491;
      public static final int progress_bar = 2131362492;
      public static final int progress_bg = 2131362493;
      public static final int progress_cancel = 2131362494;
      public static final int progress_circular = 2131362495;
      public static final int progress_file_image = 2131362496;
      public static final int progress_horizontal = 2131362497;
      public static final int progress_spinner = 2131362498;
      public static final int progress_subtext = 2131362499;
      public static final int progress_text = 2131362500;
      public static final int prompt_text = 2131362501;
      public static final int provider = 2131362502;
      public static final int qr_scanner = 2131362503;
      public static final int question_text = 2131362504;
      public static final int radio = 2131362505;
      public static final int ratio = 2131362506;
      public static final int react_test_id = 2131362507;
      public static final int reaction_count_1 = 2131362508;
      public static final int reaction_count_2 = 2131362509;
      public static final int reaction_count_switcher = 2131362510;
      public static final int reaction_emoji = 2131362511;
      public static final int reactions_view = 2131362512;
      public static final int realZoom = 2131362513;
      public static final int rectangles = 2131362514;
      public static final int remix_icon = 2131362515;
      public static final int reply_author_avatar = 2131362516;
      public static final int reply_author_name = 2131362517;
      public static final int reply_icon = 2131362518;
      public static final int reply_leading_icon = 2131362519;
      public static final int reply_leading_views = 2131362520;
      public static final int reply_message_tag_view = 2131362521;
      public static final int reply_preview = 2131362522;
      public static final int reply_preview_view = 2131362523;
      public static final int reply_role_dot = 2131362524;
      public static final int reply_spline = 2131362525;
      public static final int reply_text = 2131362526;
      public static final int reply_trailing_icon = 2131362527;
      public static final int restart = 2131362528;
      public static final int results_rv = 2131362529;
      public static final int reveal_button = 2131362530;
      public static final int reverse = 2131362531;
      public static final int reverseSawtooth = 2131362532;
      public static final int right = 2131362533;
      public static final int rightToLeft = 2131362534;
      public static final int right_bar = 2131362535;
      public static final int right_icon = 2131362536;
      public static final int right_side = 2131362537;
      public static final int rn_frame_file = 2131362538;
      public static final int rn_frame_method = 2131362539;
      public static final int rn_redbox_dismiss_button = 2131362540;
      public static final int rn_redbox_line_separator = 2131362541;
      public static final int rn_redbox_loading_indicator = 2131362542;
      public static final int rn_redbox_reload_button = 2131362543;
      public static final int rn_redbox_report_button = 2131362544;
      public static final int rn_redbox_report_label = 2131362545;
      public static final int rn_redbox_stack = 2131362546;
      public static final int role_dot = 2131362547;
      public static final int role_dot_view_background = 2131362548;
      public static final int role_dot_view_dot = 2131362549;
      public static final int role_icon = 2131362550;
      public static final int role_icon_view_unicode_emoji = 2131362551;
      public static final int role_name = 2131362552;
      public static final int role_subscription_badge_dummy_view = 2131362553;
      public static final int role_subscription_purchase_badge = 2131362554;
      public static final int role_subscription_purchase_card_bg = 2131362555;
      public static final int role_subscription_purchase_lanyard = 2131362556;
      public static final int role_subscription_purchaser_avatar = 2131362557;
      public static final int role_subscription_purchaser_username = 2131362558;
      public static final int role_subscription_welcome = 2131362559;
      public static final int rootCardView = 2131362560;
      public static final int rotate_scroll_wheel = 2131362561;
      public static final int rounded = 2131362562;
      public static final int row = 2131362563;
      public static final int row_index_key = 2131362564;
      public static final int row_reverse = 2131362565;
      public static final int save_non_transition_alpha = 2131362566;
      public static final int save_overlay_view = 2131362567;
      public static final int sawtooth = 2131362568;
      public static final int scale = 2131362569;
      public static final int scale_scroll_wheel = 2131362570;
      public static final int screen = 2131362571;
      public static final int scroll = 2131362572;
      public static final int scrollIndicatorDown = 2131362573;
      public static final int scrollIndicatorUp = 2131362574;
      public static final int scrollView = 2131362575;
      public static final int scrollable = 2131362576;
      public static final int search_badge = 2131362577;
      public static final int search_bar = 2131362578;
      public static final int search_bar_text_view = 2131362579;
      public static final int search_button = 2131362580;
      public static final int search_close_btn = 2131362581;
      public static final int search_edit_frame = 2131362582;
      public static final int search_go_btn = 2131362583;
      public static final int search_mag_icon = 2131362584;
      public static final int search_plate = 2131362585;
      public static final int search_src_text = 2131362586;
      public static final int search_view_background = 2131362587;
      public static final int search_view_clear_button = 2131362588;
      public static final int search_view_content_container = 2131362589;
      public static final int search_view_divider = 2131362590;
      public static final int search_view_dummy_toolbar = 2131362591;
      public static final int search_view_edit_text = 2131362592;
      public static final int search_view_header_container = 2131362593;
      public static final int search_view_root = 2131362594;
      public static final int search_view_scrim = 2131362595;
      public static final int search_view_search_prefix = 2131362596;
      public static final int search_view_status_bar_spacer = 2131362597;
      public static final int search_view_toolbar = 2131362598;
      public static final int search_view_toolbar_container = 2131362599;
      public static final int search_voice_btn = 2131362600;
      public static final int secondary_action_button = 2131362601;
      public static final int secondary_button = 2131362602;
      public static final int secondary_cta = 2131362603;
      public static final int segmentContainer = 2131362604;
      public static final int select_component_chevron = 2131362605;
      public static final int select_component_loading = 2131362606;
      public static final int select_component_selection_icon = 2131362607;
      public static final int select_component_selection_text = 2131362608;
      public static final int select_component_selections_root = 2131362609;
      public static final int select_dialog_listview = 2131362610;
      public static final int selected = 2131362611;
      public static final int selectedSegmentBg = 2131362612;
      public static final int selected_icon = 2131362613;
      public static final int selection_type = 2131362614;
      public static final int separator = 2131362615;
      public static final int separator_dot = 2131362616;
      public static final int shadow_view = 2131362617;
      public static final int share_button = 2131362618;
      public static final int share_prompt_close_button = 2131362619;
      public static final int share_prompt_container = 2131362620;
      public static final int share_prompt_copy_link_button = 2131362621;
      public static final int share_prompt_icon = 2131362622;
      public static final int share_prompt_subtitle = 2131362623;
      public static final int share_prompt_title = 2131362624;
      public static final int shortcut = 2131362625;
      public static final int showCustom = 2131362626;
      public static final int showHome = 2131362627;
      public static final int showTitle = 2131362628;
      public static final int sin = 2131362629;
      public static final int skipCollapsed = 2131362630;
      public static final int slide = 2131362631;
      public static final int snackbar_action = 2131362632;
      public static final int snackbar_text = 2131362633;
      public static final int snap = 2131362634;
      public static final int snapMargins = 2131362635;
      public static final int software = 2131362636;
      public static final int space_around = 2131362637;
      public static final int space_between = 2131362638;
      public static final int space_evenly = 2131362639;
      public static final int spacer = 2131362640;
      public static final int special_effects_controller_view_tag = 2131362641;
      public static final int spherical_gl_surface_view = 2131362642;
      public static final int splash = 2131362643;
      public static final int spline = 2131362644;
      public static final int split_action_bar = 2131362645;
      public static final int spoiler = 2131362646;
      public static final int spread = 2131362647;
      public static final int spread_inside = 2131362648;
      public static final int square = 2131362649;
      public static final int src_atop = 2131362650;
      public static final int src_in = 2131362651;
      public static final int src_over = 2131362652;
      public static final int standard = 2131362653;
      public static final int start = 2131362654;
      public static final int startHorizontal = 2131362655;
      public static final int startToEnd = 2131362656;
      public static final int startVertical = 2131362657;
      public static final int start_image = 2131362658;
      public static final int start_spacer = 2131362659;
      public static final int state_aspect_ratio = 2131362660;
      public static final int state_rotate = 2131362661;
      public static final int state_scale = 2131362662;
      public static final int staticLayout = 2131362663;
      public static final int staticPostLayout = 2131362664;
      public static final int status_bar_latest_event_content = 2131362665;
      public static final int status_text = 2131362666;
      public static final int status_text_barrier = 2131362667;
      public static final int sticker_view = 2131362668;
      public static final int stop = 2131362669;
      public static final int stretch = 2131362670;
      public static final int submenuarrow = 2131362671;
      public static final int submit_area = 2131362672;
      public static final int subtext = 2131362673;
      public static final int subtitle = 2131362674;
      public static final int subtitleGradient = 2131362675;
      public static final int subtitle_divider = 2131362676;
      public static final int subtitle_icon = 2131362677;
      public static final int subtitle_left = 2131362678;
      public static final int subtitle_left_author = 2131362679;
      public static final int subtitle_left_avatar = 2131362680;
      public static final int subtitle_left_wrapper = 2131362681;
      public static final int subtitle_right = 2131362682;
      public static final int subtitle_text = 2131362683;
      public static final int subtitle_top_barrier = 2131362684;
      public static final int subtitles_wrapper = 2131362685;
      public static final int suppress_notifications_icon = 2131362686;
      public static final int surface_view = 2131362687;
      public static final int survey_background = 2131362688;
      public static final int survey_card = 2131362689;
      public static final int tabMode = 2131362690;
      public static final int tag = 2131362691;
      public static final int tag_accessibility_actions = 2131362692;
      public static final int tag_accessibility_clickable_spans = 2131362693;
      public static final int tag_accessibility_heading = 2131362694;
      public static final int tag_accessibility_pane_title = 2131362695;
      public static final int tag_chiplet = 2131362696;
      public static final int tag_maybe_animate_elevation_to = 2131362697;
      public static final int tag_on_apply_window_listener = 2131362698;
      public static final int tag_on_receive_content_listener = 2131362699;
      public static final int tag_on_receive_content_mime_types = 2131362700;
      public static final int tag_screen_reader_focusable = 2131362701;
      public static final int tag_state_description = 2131362702;
      public static final int tag_transition_group = 2131362703;
      public static final int tag_unhandled_key_event_manager = 2131362704;
      public static final int tag_unhandled_key_listeners = 2131362705;
      public static final int tag_window_insets_animation_callback = 2131362706;
      public static final int tertiary_action_button = 2131362707;
      public static final int text = 2131362708;
      public static final int text2 = 2131362709;
      public static final int textEnd = 2131362710;
      public static final int textSpacerNoButtons = 2131362711;
      public static final int textSpacerNoTitle = 2131362712;
      public static final int textStart = 2131362713;
      public static final int textTop = 2131362714;
      public static final int text_children = 2131362715;
      public static final int text_input_end_icon = 2131362716;
      public static final int text_input_error_icon = 2131362717;
      public static final int text_input_start_icon = 2131362718;
      public static final int text_view_crop = 2131362719;
      public static final int text_view_rotate = 2131362720;
      public static final int text_view_scale = 2131362721;
      public static final int textinput_counter = 2131362722;
      public static final int textinput_error = 2131362723;
      public static final int textinput_helper_text = 2131362724;
      public static final int textinput_placeholder = 2131362725;
      public static final int textinput_prefix_text = 2131362726;
      public static final int textinput_suffix_text = 2131362727;
      public static final int texture_view = 2131362728;
      public static final int thread_embed_container = 2131362729;
      public static final int thread_embed_icon = 2131362730;
      public static final int thread_embed_messages_count = 2131362731;
      public static final int thread_embed_most_recent_message_avatar = 2131362732;
      public static final int thread_embed_most_recent_message_content = 2131362733;
      public static final int thread_embed_most_recent_message_header = 2131362734;
      public static final int thread_embed_most_recent_message_name = 2131362735;
      public static final int thread_embed_name = 2131362736;
      public static final int thread_starter_header = 2131362737;
      public static final int thread_starter_header_icon = 2131362738;
      public static final int thread_starter_header_text = 2131362739;
      public static final int thread_starter_header_view = 2131362740;
      public static final int thumbnail = 2131362741;
      public static final int thumbnailGradient = 2131362742;
      public static final int time = 2131362743;
      public static final int timestamp = 2131362744;
      public static final int title = 2131362745;
      public static final int titleDividerNoCustom = 2131362746;
      public static final int titleGradient = 2131362747;
      public static final int title_container = 2131362748;
      public static final int title_template = 2131362749;
      public static final int title_text = 2131362750;
      public static final int toggle = 2131362751;
      public static final int toolbar = 2131362752;
      public static final int toolbar_title = 2131362753;
      public static final int top = 2131362754;
      public static final int topEnd = 2131362755;
      public static final int topPanel = 2131362756;
      public static final int topStart = 2131362757;
      public static final int top_guideline = 2131362758;
      public static final int touch_outside = 2131362759;
      public static final int transitionToEnd = 2131362760;
      public static final int transitionToStart = 2131362761;
      public static final int transition_current_scene = 2131362762;
      public static final int transition_layout_save = 2131362763;
      public static final int transition_position = 2131362764;
      public static final int transition_scene_layoutid_cache = 2131362765;
      public static final int transition_transform = 2131362766;
      public static final int trash_wrap_icon = 2131362767;
      public static final int trash_wrap_target_container = 2131362768;
      public static final int trash_wrap_target_zone = 2131362769;
      public static final int triangle = 2131362770;
      public static final int ucrop = 2131362771;
      public static final int ucrop_frame = 2131362772;
      public static final int ucrop_photobox = 2131362773;
      public static final int unchecked = 2131362774;
      public static final int uniform = 2131362775;
      public static final int unlabeled = 2131362776;
      public static final int up = 2131362777;
      public static final int upload_cancel = 2131362778;
      public static final int upload_complete = 2131362779;
      public static final int upload_complete_background = 2131362780;
      public static final int upload_complete_layout = 2131362781;
      public static final int upload_overlay = 2131362782;
      public static final int upload_overlay_background = 2131362783;
      public static final int upload_progress = 2131362784;
      public static final int upload_progress_background = 2131362785;
      public static final int upload_progress_layout = 2131362786;
      public static final int useLogo = 2131362787;
      public static final int value = 2131362788;
      public static final int verified_bot_icon = 2131362789;
      public static final int verified_check_icon = 2131362790;
      public static final int verified_check_icon_background = 2131362791;
      public static final int verified_check_icon_container = 2131362792;
      public static final int video_decoder_gl_surface_view = 2131362793;
      public static final int view_coroutine_scope = 2131362794;
      public static final int view_interaction_failed_label_icon = 2131362795;
      public static final int view_interaction_failed_label_message = 2131362796;
      public static final int view_interaction_status_danger_icon = 2131362797;
      public static final int view_interaction_status_label_icon = 2131362798;
      public static final int view_interaction_status_label_message = 2131362799;
      public static final int view_interaction_status_loading_dots = 2131362800;
      public static final int view_offset_helper = 2131362801;
      public static final int view_overlay = 2131362802;
      public static final int view_progress_dots_1 = 2131362803;
      public static final int view_progress_dots_2 = 2131362804;
      public static final int view_progress_dots_3 = 2131362805;
      public static final int view_tag_instance_handle = 2131362806;
      public static final int view_tag_native_id = 2131362807;
      public static final int view_tree_lifecycle_owner = 2131362808;
      public static final int view_tree_on_back_pressed_dispatcher_owner = 2131362809;
      public static final int view_tree_saved_state_registry_owner = 2131362810;
      public static final int view_tree_view_model_store_owner = 2131362811;
      public static final int visible = 2131362812;
      public static final int visible_removing_fragment_view_tag = 2131362813;
      public static final int vote_counts = 2131362814;
      public static final int vote_percentage = 2131362815;
      public static final int wave = 2131362816;
      public static final int welcome_reply_button = 2131362817;
      public static final int welcome_reply_text = 2131362818;
      public static final int when_playing = 2131362819;
      public static final int wide = 2131362820;
      public static final int wipe = 2131362821;
      public static final int withText = 2131362822;
      public static final int with_icon = 2131362823;
      public static final int withinBounds = 2131362824;
      public static final int wrap = 2131362825;
      public static final int wrap_content = 2131362826;
      public static final int wrap_reverse = 2131362827;
      public static final int wrapper_controls = 2131362828;
      public static final int wrapper_reset_rotate = 2131362829;
      public static final int wrapper_rotate_by_angle = 2131362830;
      public static final int wrapper_states = 2131362831;
      public static final int year = 2131362832;
      public static final int zoom = 2131362833;

      private id() {
      }
   }

   public static final class integer {
      public static final int abc_config_activityDefaultDur = 2131427328;
      public static final int abc_config_activityShortDur = 2131427329;
      public static final int app_bar_elevation_anim_duration = 2131427330;
      public static final int bottom_sheet_slide_duration = 2131427331;
      public static final int cancel_button_image_alpha = 2131427332;
      public static final int config_mediumAnimTime = 2131427333;
      public static final int config_tooltipAnimTime = 2131427334;
      public static final int design_snackbar_text_max_lines = 2131427335;
      public static final int design_tab_indicator_anim_duration_ms = 2131427336;
      public static final int exo_media_button_opacity_percentage_disabled = 2131427337;
      public static final int exo_media_button_opacity_percentage_enabled = 2131427338;
      public static final int google_play_services_version = 2131427339;
      public static final int hide_password_duration = 2131427340;
      public static final int image_fade_duration = 2131427341;
      public static final int m3_btn_anim_delay_ms = 2131427342;
      public static final int m3_btn_anim_duration_ms = 2131427343;
      public static final int m3_card_anim_delay_ms = 2131427344;
      public static final int m3_card_anim_duration_ms = 2131427345;
      public static final int m3_chip_anim_duration = 2131427346;
      public static final int m3_sys_motion_duration_extra_long1 = 2131427347;
      public static final int m3_sys_motion_duration_extra_long2 = 2131427348;
      public static final int m3_sys_motion_duration_extra_long3 = 2131427349;
      public static final int m3_sys_motion_duration_extra_long4 = 2131427350;
      public static final int m3_sys_motion_duration_long1 = 2131427351;
      public static final int m3_sys_motion_duration_long2 = 2131427352;
      public static final int m3_sys_motion_duration_long3 = 2131427353;
      public static final int m3_sys_motion_duration_long4 = 2131427354;
      public static final int m3_sys_motion_duration_medium1 = 2131427355;
      public static final int m3_sys_motion_duration_medium2 = 2131427356;
      public static final int m3_sys_motion_duration_medium3 = 2131427357;
      public static final int m3_sys_motion_duration_medium4 = 2131427358;
      public static final int m3_sys_motion_duration_short1 = 2131427359;
      public static final int m3_sys_motion_duration_short2 = 2131427360;
      public static final int m3_sys_motion_duration_short3 = 2131427361;
      public static final int m3_sys_motion_duration_short4 = 2131427362;
      public static final int m3_sys_motion_path = 2131427363;
      public static final int m3_sys_shape_corner_extra_large_corner_family = 2131427364;
      public static final int m3_sys_shape_corner_extra_small_corner_family = 2131427365;
      public static final int m3_sys_shape_corner_full_corner_family = 2131427366;
      public static final int m3_sys_shape_corner_large_corner_family = 2131427367;
      public static final int m3_sys_shape_corner_medium_corner_family = 2131427368;
      public static final int m3_sys_shape_corner_small_corner_family = 2131427369;
      public static final int material_motion_duration_long_1 = 2131427370;
      public static final int material_motion_duration_long_2 = 2131427371;
      public static final int material_motion_duration_medium_1 = 2131427372;
      public static final int material_motion_duration_medium_2 = 2131427373;
      public static final int material_motion_duration_short_1 = 2131427374;
      public static final int material_motion_duration_short_2 = 2131427375;
      public static final int material_motion_path = 2131427376;
      public static final int mtrl_badge_max_character_count = 2131427377;
      public static final int mtrl_btn_anim_delay_ms = 2131427378;
      public static final int mtrl_btn_anim_duration_ms = 2131427379;
      public static final int mtrl_calendar_header_orientation = 2131427380;
      public static final int mtrl_calendar_selection_text_lines = 2131427381;
      public static final int mtrl_calendar_year_selector_span = 2131427382;
      public static final int mtrl_card_anim_delay_ms = 2131427383;
      public static final int mtrl_card_anim_duration_ms = 2131427384;
      public static final int mtrl_chip_anim_duration = 2131427385;
      public static final int mtrl_switch_thumb_motion_duration = 2131427386;
      public static final int mtrl_switch_thumb_post_morphing_duration = 2131427387;
      public static final int mtrl_switch_thumb_pre_morphing_duration = 2131427388;
      public static final int mtrl_switch_thumb_pressed_duration = 2131427389;
      public static final int mtrl_switch_thumb_viewport_center_coordinate = 2131427390;
      public static final int mtrl_switch_thumb_viewport_size = 2131427391;
      public static final int mtrl_switch_track_viewport_height = 2131427392;
      public static final int mtrl_switch_track_viewport_width = 2131427393;
      public static final int mtrl_tab_indicator_anim_duration_ms = 2131427394;
      public static final int mtrl_view_gone = 2131427395;
      public static final int mtrl_view_invisible = 2131427396;
      public static final int mtrl_view_visible = 2131427397;
      public static final int progress_dots_animation_time = 2131427398;
      public static final int progress_dots_max_alpha = 2131427399;
      public static final int progress_dots_max_scale = 2131427400;
      public static final int progress_dots_min_alpha = 2131427401;
      public static final int progress_dots_min_scale = 2131427402;
      public static final int react_native_dev_server_port = 2131427403;
      public static final int react_native_inspector_proxy_port = 2131427404;
      public static final int show_password_duration = 2131427405;
      public static final int status_bar_notification_info_maxnum = 2131427406;
      public static final int ucrop_progress_loading_anim_time = 2131427407;

      private integer() {
      }
   }

   public static final class interpolator {
      public static final int btn_checkbox_checked_mtrl_animation_interpolator_0 = 2131492864;
      public static final int btn_checkbox_checked_mtrl_animation_interpolator_1 = 2131492865;
      public static final int btn_checkbox_unchecked_mtrl_animation_interpolator_0 = 2131492866;
      public static final int btn_checkbox_unchecked_mtrl_animation_interpolator_1 = 2131492867;
      public static final int btn_radio_to_off_mtrl_animation_interpolator_0 = 2131492868;
      public static final int btn_radio_to_on_mtrl_animation_interpolator_0 = 2131492869;
      public static final int fast_out_slow_in = 2131492870;
      public static final int m3_sys_motion_easing_emphasized = 2131492871;
      public static final int m3_sys_motion_easing_emphasized_accelerate = 2131492872;
      public static final int m3_sys_motion_easing_emphasized_decelerate = 2131492873;
      public static final int m3_sys_motion_easing_linear = 2131492874;
      public static final int m3_sys_motion_easing_standard = 2131492875;
      public static final int m3_sys_motion_easing_standard_accelerate = 2131492876;
      public static final int m3_sys_motion_easing_standard_decelerate = 2131492877;
      public static final int mtrl_fast_out_linear_in = 2131492878;
      public static final int mtrl_fast_out_slow_in = 2131492879;
      public static final int mtrl_linear = 2131492880;
      public static final int mtrl_linear_out_slow_in = 2131492881;

      private interpolator() {
      }
   }

   public static final class layout {
      public static final int abc_action_bar_title_item = 2131558400;
      public static final int abc_action_bar_up_container = 2131558401;
      public static final int abc_action_menu_item_layout = 2131558402;
      public static final int abc_action_menu_layout = 2131558403;
      public static final int abc_action_mode_bar = 2131558404;
      public static final int abc_action_mode_close_item_material = 2131558405;
      public static final int abc_activity_chooser_view = 2131558406;
      public static final int abc_activity_chooser_view_list_item = 2131558407;
      public static final int abc_alert_dialog_button_bar_material = 2131558408;
      public static final int abc_alert_dialog_material = 2131558409;
      public static final int abc_alert_dialog_title_material = 2131558410;
      public static final int abc_cascading_menu_item_layout = 2131558411;
      public static final int abc_dialog_title_material = 2131558412;
      public static final int abc_expanded_menu_layout = 2131558413;
      public static final int abc_list_menu_item_checkbox = 2131558414;
      public static final int abc_list_menu_item_icon = 2131558415;
      public static final int abc_list_menu_item_layout = 2131558416;
      public static final int abc_list_menu_item_radio = 2131558417;
      public static final int abc_popup_menu_header_item_layout = 2131558418;
      public static final int abc_popup_menu_item_layout = 2131558419;
      public static final int abc_screen_content_include = 2131558420;
      public static final int abc_screen_simple = 2131558421;
      public static final int abc_screen_simple_overlay_action_mode = 2131558422;
      public static final int abc_screen_toolbar = 2131558423;
      public static final int abc_search_dropdown_item_icons_2line = 2131558424;
      public static final int abc_search_view = 2131558425;
      public static final int abc_select_dialog_material = 2131558426;
      public static final int abc_tooltip = 2131558427;
      public static final int activity_bookmark_view = 2131558428;
      public static final int activity_instance_embed_view = 2131558429;
      public static final int activity_invite_embed_view = 2131558430;
      public static final int add_reaction_view = 2131558431;
      public static final int alt_text_button_view = 2131558432;
      public static final int attachment_media_mosaic_container_view = 2131558433;
      public static final int attachment_upload_overlay_view = 2131558434;
      public static final int audio_player_view = 2131558435;
      public static final int auto_moderation_notification_embed_view = 2131558436;
      public static final int autofill_inline_suggestion = 2131558437;
      public static final int automod_system_message_view = 2131558438;
      public static final int blocked_message_group_view = 2131558439;
      public static final int browser_actions_context_menu_page = 2131558440;
      public static final int browser_actions_context_menu_row = 2131558441;
      public static final int call_system_message_view = 2131558442;
      public static final int channel_prompt_actions_view = 2131558443;
      public static final int chat_input_root_view = 2131558444;
      public static final int chat_loading_view = 2131558445;
      public static final int clan_tag_chiplet_view = 2131558446;
      public static final int component_failed_label_view = 2131558447;
      public static final int connections_role_tag_view = 2131558448;
      public static final int cta_button = 2131558449;
      public static final int custom_dialog = 2131558450;
      public static final int dcd_button = 2131558451;
      public static final int decorated_message_view = 2131558452;
      public static final int deserialization_error_view = 2131558453;
      public static final int design_bottom_navigation_item = 2131558454;
      public static final int design_bottom_sheet_dialog = 2131558455;
      public static final int design_layout_snackbar = 2131558456;
      public static final int design_layout_snackbar_include = 2131558457;
      public static final int design_layout_tab_icon = 2131558458;
      public static final int design_layout_tab_text = 2131558459;
      public static final int design_menu_item_action_area = 2131558460;
      public static final int design_navigation_item = 2131558461;
      public static final int design_navigation_item_header = 2131558462;
      public static final int design_navigation_item_separator = 2131558463;
      public static final int design_navigation_item_subheader = 2131558464;
      public static final int design_navigation_menu = 2131558465;
      public static final int design_navigation_menu_item = 2131558466;
      public static final int design_text_input_end_icon = 2131558467;
      public static final int design_text_input_start_icon = 2131558468;
      public static final int dev_loading_view = 2131558469;
      public static final int embed_field_view = 2131558470;
      public static final int embed_view = 2131558471;
      public static final int embedded_activity_invite_view = 2131558472;
      public static final int ephemeral_action_view = 2131558473;
      public static final int error_message_view = 2131558474;
      public static final int exo_list_divider = 2131558475;
      public static final int exo_player_control_view = 2131558476;
      public static final int exo_player_view = 2131558477;
      public static final int exo_styled_player_control_ffwd_button = 2131558478;
      public static final int exo_styled_player_control_rewind_button = 2131558479;
      public static final int exo_styled_player_control_view = 2131558480;
      public static final int exo_styled_player_view = 2131558481;
      public static final int exo_styled_settings_list = 2131558482;
      public static final int exo_styled_settings_list_item = 2131558483;
      public static final int exo_styled_sub_settings_list_item = 2131558484;
      public static final int exo_track_selection_dialog = 2131558485;
      public static final int file_attachment_view = 2131558486;
      public static final int flagged_message_action_bar_view = 2131558487;
      public static final int flagged_message_embed_footer_view = 2131558488;
      public static final int flagged_message_embed_view = 2131558489;
      public static final int forum_post_action_bar_view = 2131558490;
      public static final int forward_breadcrumb_view = 2131558491;
      public static final int forward_header_view = 2131558492;
      public static final int fps_view = 2131558493;
      public static final int gift_view = 2131558494;
      public static final int guild_event_invite_view = 2131558495;
      public static final int guild_invite_disabled_view = 2131558496;
      public static final int guild_invite_view = 2131558497;
      public static final int guild_view = 2131558498;
      public static final int icon_button_view = 2131558499;
      public static final int ime_base_split_test_activity = 2131558500;
      public static final int ime_secondary_split_test_activity = 2131558501;
      public static final int info_link_view = 2131558502;
      public static final int interaction_status_view = 2131558503;
      public static final int invite_to_speak_view = 2131558504;
      public static final int ios_clone = 2131558505;
      public static final int m3_alert_dialog = 2131558506;
      public static final int m3_alert_dialog_actions = 2131558507;
      public static final int m3_alert_dialog_title = 2131558508;
      public static final int m3_auto_complete_simple_item = 2131558509;
      public static final int m3_side_sheet_dialog = 2131558510;
      public static final int material_chip_input_combo = 2131558511;
      public static final int material_clock_display = 2131558512;
      public static final int material_clock_display_divider = 2131558513;
      public static final int material_clock_period_toggle = 2131558514;
      public static final int material_clock_period_toggle_land = 2131558515;
      public static final int material_clockface_textview = 2131558516;
      public static final int material_clockface_view = 2131558517;
      public static final int material_radial_view_group = 2131558518;
      public static final int material_textinput_timepicker = 2131558519;
      public static final int material_time_chip = 2131558520;
      public static final int material_time_input = 2131558521;
      public static final int material_timepicker = 2131558522;
      public static final int material_timepicker_dialog = 2131558523;
      public static final int material_timepicker_textinput_display = 2131558524;
      public static final int media_image_view = 2131558525;
      public static final int media_view = 2131558526;
      public static final int message_alt_remix_tag_view = 2131558527;
      public static final int message_bundle_conversation_view = 2131558528;
      public static final int message_bundle_view = 2131558529;
      public static final int message_component_action_row_view = 2131558530;
      public static final int message_component_button_view = 2131558531;
      public static final int message_component_content_inventory_view = 2131558532;
      public static final int message_component_media_gallery_display_view = 2131558533;
      public static final int message_component_select_pill_view = 2131558534;
      public static final int message_component_select_view = 2131558535;
      public static final int message_component_separator_display_view = 2131558536;
      public static final int message_component_text_display_view = 2131558537;
      public static final int message_components_view = 2131558538;
      public static final int message_frame_feed_header = 2131558539;
      public static final int message_frame_jump_header = 2131558540;
      public static final int message_highlight_header = 2131558541;
      public static final int message_start_guideline = 2131558542;
      public static final int message_tag_view = 2131558543;
      public static final int message_view = 2131558544;
      public static final int message_view_highlight_header_stub = 2131558545;
      public static final int message_view_reply_preview = 2131558546;
      public static final int message_view_reply_preview_stub = 2131558547;
      public static final int message_view_thread_starter_stub = 2131558548;
      public static final int mtrl_alert_dialog = 2131558549;
      public static final int mtrl_alert_dialog_actions = 2131558550;
      public static final int mtrl_alert_dialog_title = 2131558551;
      public static final int mtrl_alert_select_dialog_item = 2131558552;
      public static final int mtrl_alert_select_dialog_multichoice = 2131558553;
      public static final int mtrl_alert_select_dialog_singlechoice = 2131558554;
      public static final int mtrl_auto_complete_simple_item = 2131558555;
      public static final int mtrl_calendar_day = 2131558556;
      public static final int mtrl_calendar_day_of_week = 2131558557;
      public static final int mtrl_calendar_days_of_week = 2131558558;
      public static final int mtrl_calendar_horizontal = 2131558559;
      public static final int mtrl_calendar_month = 2131558560;
      public static final int mtrl_calendar_month_labeled = 2131558561;
      public static final int mtrl_calendar_month_navigation = 2131558562;
      public static final int mtrl_calendar_months = 2131558563;
      public static final int mtrl_calendar_vertical = 2131558564;
      public static final int mtrl_calendar_year = 2131558565;
      public static final int mtrl_layout_snackbar = 2131558566;
      public static final int mtrl_layout_snackbar_include = 2131558567;
      public static final int mtrl_navigation_rail_item = 2131558568;
      public static final int mtrl_picker_actions = 2131558569;
      public static final int mtrl_picker_dialog = 2131558570;
      public static final int mtrl_picker_fullscreen = 2131558571;
      public static final int mtrl_picker_header_dialog = 2131558572;
      public static final int mtrl_picker_header_fullscreen = 2131558573;
      public static final int mtrl_picker_header_selection_text = 2131558574;
      public static final int mtrl_picker_header_title_text = 2131558575;
      public static final int mtrl_picker_header_toggle = 2131558576;
      public static final int mtrl_picker_text_input_date = 2131558577;
      public static final int mtrl_picker_text_input_date_range = 2131558578;
      public static final int mtrl_search_bar = 2131558579;
      public static final int mtrl_search_view = 2131558580;
      public static final int native_picker = 2131558581;
      public static final int notification_action = 2131558582;
      public static final int notification_action_tombstone = 2131558583;
      public static final int notification_media_action = 2131558584;
      public static final int notification_media_cancel_action = 2131558585;
      public static final int notification_template_big_media = 2131558586;
      public static final int notification_template_big_media_custom = 2131558587;
      public static final int notification_template_big_media_narrow = 2131558588;
      public static final int notification_template_big_media_narrow_custom = 2131558589;
      public static final int notification_template_custom_big = 2131558590;
      public static final int notification_template_icon_group = 2131558591;
      public static final int notification_template_lines_media = 2131558592;
      public static final int notification_template_media = 2131558593;
      public static final int notification_template_media_custom = 2131558594;
      public static final int notification_template_part_chronometer = 2131558595;
      public static final int notification_template_part_time = 2131558596;
      public static final int obscure_overlay_view = 2131558597;
      public static final int overlay_menu_bubble = 2131558598;
      public static final int overlay_voice_bubble = 2131558599;
      public static final int overlay_voice_channel_search_result = 2131558600;
      public static final int overlay_voice_channel_selector = 2131558601;
      public static final int player_view_with_surface_view = 2131558602;
      public static final int poll_action_button = 2131558603;
      public static final int poll_image_only_answer_view = 2131558604;
      public static final int poll_recycler_view = 2131558605;
      public static final int poll_text_and_image_answer_view = 2131558606;
      public static final int post_preview_embed_view = 2131558607;
      public static final int premium_inline_roadblock_footer = 2131558608;
      public static final int premium_inline_roadblock_header = 2131558609;
      public static final int progress_dots_view = 2131558610;
      public static final int qr_scanner = 2131558611;
      public static final int reaction_view = 2131558612;
      public static final int redbox_item_frame = 2131558613;
      public static final int redbox_item_title = 2131558614;
      public static final int redbox_view = 2131558615;
      public static final int role_dot_view = 2131558616;
      public static final int role_icon_view = 2131558617;
      public static final int role_subscription_purchase_view = 2131558618;
      public static final int safety_policy_notice = 2131558619;
      public static final int safety_system_notification = 2131558620;
      public static final int segmented_control = 2131558621;
      public static final int select_dialog_item_material = 2131558622;
      public static final int select_dialog_multichoice_material = 2131558623;
      public static final int select_dialog_singlechoice_material = 2131558624;
      public static final int separator_summary_view = 2131558625;
      public static final int separator_view = 2131558626;
      public static final int spoiler_overlay_view = 2131558627;
      public static final int spoiler_view = 2131558628;
      public static final int support_simple_spinner_dropdown_item = 2131558629;
      public static final int survey_action_view = 2131558630;
      public static final int system_message_view = 2131558631;
      public static final int thread_embed_view = 2131558632;
      public static final int thread_starter_message_header_view = 2131558633;
      public static final int timestamp_view = 2131558634;
      public static final int trash_wrap = 2131558635;
      public static final int ucrop_activity_photobox = 2131558636;
      public static final int ucrop_aspect_ratio = 2131558637;
      public static final int ucrop_controls = 2131558638;
      public static final int ucrop_fragment_photobox = 2131558639;
      public static final int ucrop_layout_rotate_wheel = 2131558640;
      public static final int ucrop_layout_scale_wheel = 2131558641;
      public static final int ucrop_view = 2131558642;
      public static final int upload_progress_view = 2131558643;
      public static final int video_attachment_view = 2131558644;
      public static final int view_overlay_menu = 2131558645;
      public static final int voice_invite_embed = 2131558646;
      public static final int welcome_sticker_view = 2131558647;

      private layout() {
      }
   }

   public static final class menu {
      public static final int ucrop_menu_activity = 2131689472;

      private menu() {
      }
   }

   public static final class mipmap {
      public static final int angry = 2131755008;
      public static final int angry_foreground = 2131755009;
      public static final int angry_round = 2131755010;
      public static final int beanie = 2131755011;
      public static final int beanie_foreground = 2131755012;
      public static final int beanie_round = 2131755013;
      public static final int blurple_twilight = 2131755014;
      public static final int blurple_twilight_foreground = 2131755015;
      public static final int blurple_twilight_round = 2131755016;
      public static final int blush = 2131755017;
      public static final int blush_foreground = 2131755018;
      public static final int blush_round = 2131755019;
      public static final int brand_dark = 2131755020;
      public static final int brand_dark_round = 2131755021;
      public static final int brand_inverted = 2131755022;
      public static final int brand_inverted_foreground = 2131755023;
      public static final int brand_inverted_round = 2131755024;
      public static final int camo = 2131755025;
      public static final int camo_foreground = 2131755026;
      public static final int camo_round = 2131755027;
      public static final int cherry_blossom = 2131755028;
      public static final int cherry_blossom_background = 2131755029;
      public static final int cherry_blossom_foreground = 2131755030;
      public static final int cherry_blossom_round = 2131755031;
      public static final int circuit = 2131755032;
      public static final int circuit_foreground = 2131755033;
      public static final int circuit_round = 2131755034;
      public static final int color_wave = 2131755035;
      public static final int color_wave_foreground = 2131755036;
      public static final int color_wave_round = 2131755037;
      public static final int controller = 2131755038;
      public static final int controller_foreground = 2131755039;
      public static final int controller_round = 2131755040;
      public static final int galaxy = 2131755041;
      public static final int galaxy_background = 2131755042;
      public static final int galaxy_foreground = 2131755043;
      public static final int galaxy_round = 2131755044;
      public static final int gaming = 2131755045;
      public static final int gaming_background = 2131755046;
      public static final int gaming_foreground = 2131755047;
      public static final int gaming_round = 2131755048;
      public static final int holowaves = 2131755049;
      public static final int holowaves_foreground = 2131755050;
      public static final int holowaves_round = 2131755051;
      public static final int ic_logo_foreground = 2131755052;
      public static final int ic_logo_round = 2131755053;
      public static final int ic_logo_round_beta = 2131755054;
      public static final int ic_logo_round_canary = 2131755055;
      public static final int ic_logo_round_debug = 2131755056;
      public static final int ic_logo_square = 2131755057;
      public static final int ic_logo_square_beta = 2131755058;
      public static final int ic_logo_square_canary = 2131755059;
      public static final int ic_logo_square_debug = 2131755060;
      public static final int img_logo_dark = 2131755061;
      public static final int img_logo_light = 2131755062;
      public static final int in_rainbows = 2131755063;
      public static final int in_rainbows_foreground = 2131755064;
      public static final int in_rainbows_round = 2131755065;
      public static final int manga = 2131755066;
      public static final int manga_foreground = 2131755067;
      public static final int manga_round = 2131755068;
      public static final int matte_dark = 2131755069;
      public static final int matte_dark_foreground = 2131755070;
      public static final int matte_dark_round = 2131755071;
      public static final int matte_light = 2131755072;
      public static final int matte_light_foreground = 2131755073;
      public static final int matte_light_round = 2131755074;
      public static final int midnight_prism = 2131755075;
      public static final int midnight_prism_foreground = 2131755076;
      public static final int midnight_prism_round = 2131755077;
      public static final int mushroom = 2131755078;
      public static final int mushroom_foreground = 2131755079;
      public static final int mushroom_round = 2131755080;
      public static final int pastel = 2131755081;
      public static final int pastel_foreground = 2131755082;
      public static final int pastel_round = 2131755083;
      public static final int pirate = 2131755084;
      public static final int pirate_foreground = 2131755085;
      public static final int pirate_round = 2131755086;
      public static final int sunset = 2131755087;
      public static final int sunset_foreground = 2131755088;
      public static final int sunset_round = 2131755089;
      public static final int y2k = 2131755090;
      public static final int y2k_foreground = 2131755091;
      public static final int y2k_round = 2131755092;

      private mipmap() {
      }
   }

   public static final class plurals {
      public static final int exo_controls_fastforward_by_amount_description = 2131820544;
      public static final int exo_controls_rewind_by_amount_description = 2131820545;
      public static final int mtrl_badge_content_description = 2131820546;

      private plurals() {
      }
   }

   public static final class raw {
      public static final int _discord_common_js_packages_tokens_typography_generated_notosans_notosans700bold = 2131886080;
      public static final int activity_end = 2131886081;
      public static final int activity_launch = 2131886082;
      public static final int activity_user_join = 2131886083;
      public static final int activity_user_left = 2131886084;
      public static final int call_calling = 2131886085;
      public static final int call_ringing = 2131886086;
      public static final int call_ringing_halloween = 2131886087;
      public static final int deafen = 2131886088;
      public static final int design_components_lottieicon_native_generated_lotties_camera = 2131886089;
      public static final int design_components_lottieicon_native_generated_lotties_messagerequest = 2131886090;
      public static final int design_components_lottieicon_native_generated_lotties_messagestab = 2131886091;
      public static final int design_components_lottieicon_native_generated_lotties_microphone = 2131886092;
      public static final int design_components_lottieicon_native_generated_lotties_nitrogem1 = 2131886093;
      public static final int design_components_lottieicon_native_generated_lotties_nitrogem12 = 2131886094;
      public static final int design_components_lottieicon_native_generated_lotties_nitrogem15 = 2131886095;
      public static final int design_components_lottieicon_native_generated_lotties_nitrogem18 = 2131886096;
      public static final int design_components_lottieicon_native_generated_lotties_nitrogem2 = 2131886097;
      public static final int design_components_lottieicon_native_generated_lotties_nitrogem24 = 2131886098;
      public static final int design_components_lottieicon_native_generated_lotties_nitrogem3 = 2131886099;
      public static final int design_components_lottieicon_native_generated_lotties_nitrogem6 = 2131886100;
      public static final int design_components_lottieicon_native_generated_lotties_nitrogem9 = 2131886101;
      public static final int design_components_lottieicon_native_generated_lotties_notificationstab = 2131886102;
      public static final int design_components_lottieicon_native_generated_lotties_servertab = 2131886103;
      public static final int design_components_lottieicon_native_generated_lotties_youtab = 2131886104;
      public static final int disconnect = 2131886105;
      public static final int emojis_json = 2131886106;
      public static final int gcm_bip = 2131886107;
      public static final int hang_status_select = 2131886108;
      public static final int i18n_messages_bg = 2131886109;
      public static final int i18n_messages_cs = 2131886110;
      public static final int i18n_messages_da = 2131886111;
      public static final int i18n_messages_de = 2131886112;
      public static final int i18n_messages_el = 2131886113;
      public static final int i18n_messages_engb = 2131886114;
      public static final int i18n_messages_es419 = 2131886115;
      public static final int i18n_messages_eses = 2131886116;
      public static final int i18n_messages_fi = 2131886117;
      public static final int i18n_messages_fr = 2131886118;
      public static final int i18n_messages_hi = 2131886119;
      public static final int i18n_messages_hr = 2131886120;
      public static final int i18n_messages_hu = 2131886121;
      public static final int i18n_messages_it = 2131886122;
      public static final int i18n_messages_ja = 2131886123;
      public static final int i18n_messages_ko = 2131886124;
      public static final int i18n_messages_lt = 2131886125;
      public static final int i18n_messages_nl = 2131886126;
      public static final int i18n_messages_no = 2131886127;
      public static final int i18n_messages_pl = 2131886128;
      public static final int i18n_messages_ptbr = 2131886129;
      public static final int i18n_messages_ro = 2131886130;
      public static final int i18n_messages_ru = 2131886131;
      public static final int i18n_messages_svse = 2131886132;
      public static final int i18n_messages_th = 2131886133;
      public static final int i18n_messages_tr = 2131886134;
      public static final int i18n_messages_uk = 2131886135;
      public static final int i18n_messages_vi = 2131886136;
      public static final int i18n_messages_zhcn = 2131886137;
      public static final int i18n_messages_zhtw = 2131886138;
      public static final int images_platforms_img_account_sync_battlenet_light_and_dark = 2131886139;
      public static final int images_platforms_img_account_sync_battlenet_white = 2131886140;
      public static final int images_platforms_img_account_sync_crunchyroll_light_and_dark = 2131886141;
      public static final int images_platforms_img_account_sync_crunchyroll_white = 2131886142;
      public static final int images_platforms_img_account_sync_ebay_light_and_dark = 2131886143;
      public static final int images_platforms_img_account_sync_ebay_white = 2131886144;
      public static final int images_platforms_img_account_sync_epic_dark_and_white = 2131886145;
      public static final int images_platforms_img_account_sync_epic_light = 2131886146;
      public static final int images_platforms_img_account_sync_facebook_light_and_dark = 2131886147;
      public static final int images_platforms_img_account_sync_facebook_white = 2131886148;
      public static final int images_platforms_img_account_sync_github_light = 2131886149;
      public static final int images_platforms_img_account_sync_github_white = 2131886150;
      public static final int images_platforms_img_account_sync_instagram_light_and_dark = 2131886151;
      public static final int images_platforms_img_account_sync_instagram_white = 2131886152;
      public static final int images_platforms_img_account_sync_league_of_legends_light_and_dark = 2131886153;
      public static final int images_platforms_img_account_sync_league_of_legends_white = 2131886154;
      public static final int images_platforms_img_account_sync_paypal_light_and_dark = 2131886155;
      public static final int images_platforms_img_account_sync_paypal_white = 2131886156;
      public static final int images_platforms_img_account_sync_playstation_light = 2131886157;
      public static final int images_platforms_img_account_sync_playstation_white = 2131886158;
      public static final int images_platforms_img_account_sync_reddit_light_and_dark = 2131886159;
      public static final int images_platforms_img_account_sync_reddit_white = 2131886160;
      public static final int images_platforms_img_account_sync_riot_light_and_dark = 2131886161;
      public static final int images_platforms_img_account_sync_riot_white = 2131886162;
      public static final int images_platforms_img_account_sync_samsung_light_and_dark = 2131886163;
      public static final int images_platforms_img_account_sync_samsung_white = 2131886164;
      public static final int images_platforms_img_account_sync_skype_light_and_dark = 2131886165;
      public static final int images_platforms_img_account_sync_skype_white = 2131886166;
      public static final int images_platforms_img_account_sync_spotify_light_and_dark = 2131886167;
      public static final int images_platforms_img_account_sync_spotify_white = 2131886168;
      public static final int images_platforms_img_account_sync_steam_light = 2131886169;
      public static final int images_platforms_img_account_sync_steam_white = 2131886170;
      public static final int images_platforms_img_account_sync_tiktok_dark = 2131886171;
      public static final int images_platforms_img_account_sync_tiktok_light = 2131886172;
      public static final int images_platforms_img_account_sync_twitch_light_and_dark = 2131886173;
      public static final int images_platforms_img_account_sync_twitch_white = 2131886174;
      public static final int images_platforms_img_account_sync_twitter_light_and_dark = 2131886175;
      public static final int images_platforms_img_account_sync_twitter_white = 2131886176;
      public static final int images_platforms_img_account_sync_x_dark = 2131886177;
      public static final int images_platforms_img_account_sync_x_light = 2131886178;
      public static final int images_platforms_img_account_sync_x_white = 2131886179;
      public static final int images_platforms_img_account_sync_xbox_light = 2131886180;
      public static final int images_platforms_img_account_sync_xbox_white = 2131886181;
      public static final int images_platforms_img_account_sync_youtube_light_and_dark = 2131886182;
      public static final int images_platforms_img_account_sync_youtube_white = 2131886183;
      public static final int images_platforms_img_amazon_music = 2131886184;
      public static final int images_platforms_img_bungie_dark = 2131886185;
      public static final int images_platforms_img_bungie_light = 2131886186;
      public static final int images_platforms_img_bungie_white = 2131886187;
      public static final int images_platforms_img_domain_dark = 2131886188;
      public static final int images_platforms_img_domain_light = 2131886189;
      public static final int images_platforms_img_roblox_dark = 2131886190;
      public static final int images_platforms_img_roblox_light = 2131886191;
      public static final int images_platforms_img_roblox_white = 2131886192;
      public static final int mention1 = 2131886193;
      public static final int mention2 = 2131886194;
      public static final int mention3 = 2131886195;
      public static final int message1 = 2131886196;
      public static final int message2 = 2131886197;
      public static final int message3 = 2131886198;
      public static final int modules_holidays_assets_snowsgiving_loading_dark = 2131886199;
      public static final int modules_holidays_assets_snowsgiving_loading_light = 2131886200;
      public static final int modules_intl_messages_cache_intl_frmessagesd6ad2e79e20f3fa37f2d52cb6d698995compiledmessages = 2131886201;
      public static final int modules_intl_messages_secondtestcompiledmessages = 2131886202;
      public static final int modules_intl_messages_testcompiledmessages = 2131886203;
      public static final int mute = 2131886204;
      public static final int ptt_start = 2131886205;
      public static final int ptt_stop = 2131886206;
      public static final int reconnect = 2131886207;
      public static final int sample_resources = 2131886208;
      public static final int stage_waiting = 2131886209;
      public static final int stream_ended = 2131886210;
      public static final int stream_started = 2131886211;
      public static final int stream_user_joined = 2131886212;
      public static final int stream_user_left = 2131886213;
      public static final int undeafen = 2131886214;
      public static final int unmute = 2131886215;
      public static final int user_join = 2131886216;
      public static final int user_leave = 2131886217;
      public static final int user_moved = 2131886218;
      public static final int vibing_wumpus = 2131886219;

      private raw() {
      }
   }

   public static final class string {
      public static final int abc_action_bar_home_description = 2131951616;
      public static final int abc_action_bar_up_description = 2131951617;
      public static final int abc_action_menu_overflow_description = 2131951618;
      public static final int abc_action_mode_done = 2131951619;
      public static final int abc_activity_chooser_view_see_all = 2131951620;
      public static final int abc_activitychooserview_choose_application = 2131951621;
      public static final int abc_capital_off = 2131951622;
      public static final int abc_capital_on = 2131951623;
      public static final int abc_menu_alt_shortcut_label = 2131951624;
      public static final int abc_menu_ctrl_shortcut_label = 2131951625;
      public static final int abc_menu_delete_shortcut_label = 2131951626;
      public static final int abc_menu_enter_shortcut_label = 2131951627;
      public static final int abc_menu_function_shortcut_label = 2131951628;
      public static final int abc_menu_meta_shortcut_label = 2131951629;
      public static final int abc_menu_shift_shortcut_label = 2131951630;
      public static final int abc_menu_space_shortcut_label = 2131951631;
      public static final int abc_menu_sym_shortcut_label = 2131951632;
      public static final int abc_prepend_shortcut_label = 2131951633;
      public static final int abc_search_hint = 2131951634;
      public static final int abc_searchview_description_clear = 2131951635;
      public static final int abc_searchview_description_query = 2131951636;
      public static final int abc_searchview_description_search = 2131951637;
      public static final int abc_searchview_description_submit = 2131951638;
      public static final int abc_searchview_description_voice = 2131951639;
      public static final int abc_shareactionprovider_share_with = 2131951640;
      public static final int abc_shareactionprovider_share_with_application = 2131951641;
      public static final int abc_toolbar_collapse_description = 2131951642;
      public static final int alert_description = 2131951643;
      public static final int ampm_description = 2131951644;
      public static final int android_credentials_TYPE_PASSWORD_CREDENTIAL = 2131951645;
      public static final int androidx_credentials_TYPE_PUBLIC_KEY_CREDENTIAL = 2131951646;
      public static final int androidx_startup = 2131951647;
      public static final int app_name = 2131951648;
      public static final int appbar_scrolling_view_behavior = 2131951649;
      public static final int asset_statements = 2131951650;
      public static final int bottom_sheet_behavior = 2131951651;
      public static final int bottomsheet_action_collapse = 2131951652;
      public static final int bottomsheet_action_expand = 2131951653;
      public static final int bottomsheet_action_expand_halfway = 2131951654;
      public static final int bottomsheet_drag_handle_clicked = 2131951655;
      public static final int bottomsheet_drag_handle_content_description = 2131951656;
      public static final int call_notification_answer_action = 2131951657;
      public static final int call_notification_answer_video_action = 2131951658;
      public static final int call_notification_decline_action = 2131951659;
      public static final int call_notification_hang_up_action = 2131951660;
      public static final int call_notification_incoming_text = 2131951661;
      public static final int call_notification_ongoing_text = 2131951662;
      public static final int call_notification_screening_text = 2131951663;
      public static final int catalyst_change_bundle_location = 2131951664;
      public static final int catalyst_copy_button = 2131951665;
      public static final int catalyst_debug = 2131951666;
      public static final int catalyst_debug_chrome = 2131951667;
      public static final int catalyst_debug_chrome_stop = 2131951668;
      public static final int catalyst_debug_connecting = 2131951669;
      public static final int catalyst_debug_error = 2131951670;
      public static final int catalyst_debug_open = 2131951671;
      public static final int catalyst_debug_stop = 2131951672;
      public static final int catalyst_devtools_open = 2131951673;
      public static final int catalyst_dismiss_button = 2131951674;
      public static final int catalyst_heap_capture = 2131951675;
      public static final int catalyst_hot_reloading = 2131951676;
      public static final int catalyst_hot_reloading_auto_disable = 2131951677;
      public static final int catalyst_hot_reloading_auto_enable = 2131951678;
      public static final int catalyst_hot_reloading_stop = 2131951679;
      public static final int catalyst_inspector = 2131951680;
      public static final int catalyst_inspector_stop = 2131951681;
      public static final int catalyst_loading_from_url = 2131951682;
      public static final int catalyst_open_flipper_error = 2131951683;
      public static final int catalyst_perf_monitor = 2131951684;
      public static final int catalyst_perf_monitor_stop = 2131951685;
      public static final int catalyst_reload = 2131951686;
      public static final int catalyst_reload_button = 2131951687;
      public static final int catalyst_reload_error = 2131951688;
      public static final int catalyst_report_button = 2131951689;
      public static final int catalyst_sample_profiler_disable = 2131951690;
      public static final int catalyst_sample_profiler_enable = 2131951691;
      public static final int catalyst_settings = 2131951692;
      public static final int catalyst_settings_title = 2131951693;
      public static final int character_counter_content_description = 2131951694;
      public static final int character_counter_overflowed_content_description = 2131951695;
      public static final int character_counter_pattern = 2131951696;
      public static final int clear_text_end_icon_content_description = 2131951697;
      public static final int combobox_description = 2131951698;
      public static final int common_google_play_services_enable_button = 2131951699;
      public static final int common_google_play_services_enable_text = 2131951700;
      public static final int common_google_play_services_enable_title = 2131951701;
      public static final int common_google_play_services_install_button = 2131951702;
      public static final int common_google_play_services_install_text = 2131951703;
      public static final int common_google_play_services_install_title = 2131951704;
      public static final int common_google_play_services_notification_channel_name = 2131951705;
      public static final int common_google_play_services_notification_ticker = 2131951706;
      public static final int common_google_play_services_unknown_issue = 2131951707;
      public static final int common_google_play_services_unsupported_text = 2131951708;
      public static final int common_google_play_services_update_button = 2131951709;
      public static final int common_google_play_services_update_text = 2131951710;
      public static final int common_google_play_services_update_title = 2131951711;
      public static final int common_google_play_services_updating_text = 2131951712;
      public static final int common_google_play_services_wear_update_text = 2131951713;
      public static final int common_open_on_phone = 2131951714;
      public static final int common_signin_button_text = 2131951715;
      public static final int common_signin_button_text_long = 2131951716;
      public static final int copy_toast_msg = 2131951717;
      public static final int date_description = 2131951718;
      public static final int day_description = 2131951719;
      public static final int default_web_client_id = 2131951720;
      public static final int error_a11y_label = 2131951721;
      public static final int error_drm_not_supported = 2131951722;
      public static final int error_drm_unknown = 2131951723;
      public static final int error_drm_unsupported_scheme = 2131951724;
      public static final int error_icon_content_description = 2131951725;
      public static final int error_instantiating_decoder = 2131951726;
      public static final int error_no_decoder = 2131951727;
      public static final int error_no_secure_decoder = 2131951728;
      public static final int error_querying_decoders = 2131951729;
      public static final int exo_controls_cc_disabled_description = 2131951730;
      public static final int exo_controls_cc_enabled_description = 2131951731;
      public static final int exo_controls_custom_playback_speed = 2131951732;
      public static final int exo_controls_fastforward_description = 2131951733;
      public static final int exo_controls_fullscreen_enter_description = 2131951734;
      public static final int exo_controls_fullscreen_exit_description = 2131951735;
      public static final int exo_controls_hide = 2131951736;
      public static final int exo_controls_next_description = 2131951737;
      public static final int exo_controls_overflow_hide_description = 2131951738;
      public static final int exo_controls_overflow_show_description = 2131951739;
      public static final int exo_controls_pause_description = 2131951740;
      public static final int exo_controls_play_description = 2131951741;
      public static final int exo_controls_playback_speed = 2131951742;
      public static final int exo_controls_previous_description = 2131951743;
      public static final int exo_controls_repeat_all_description = 2131951744;
      public static final int exo_controls_repeat_off_description = 2131951745;
      public static final int exo_controls_repeat_one_description = 2131951746;
      public static final int exo_controls_rewind_description = 2131951747;
      public static final int exo_controls_seek_bar_description = 2131951748;
      public static final int exo_controls_settings_description = 2131951749;
      public static final int exo_controls_show = 2131951750;
      public static final int exo_controls_shuffle_off_description = 2131951751;
      public static final int exo_controls_shuffle_on_description = 2131951752;
      public static final int exo_controls_stop_description = 2131951753;
      public static final int exo_controls_time_placeholder = 2131951754;
      public static final int exo_controls_vr_description = 2131951755;
      public static final int exo_download_completed = 2131951756;
      public static final int exo_download_description = 2131951757;
      public static final int exo_download_downloading = 2131951758;
      public static final int exo_download_failed = 2131951759;
      public static final int exo_download_notification_channel_name = 2131951760;
      public static final int exo_download_paused = 2131951761;
      public static final int exo_download_paused_for_network = 2131951762;
      public static final int exo_download_paused_for_wifi = 2131951763;
      public static final int exo_download_removing = 2131951764;
      public static final int exo_item_list = 2131951765;
      public static final int exo_track_bitrate = 2131951766;
      public static final int exo_track_mono = 2131951767;
      public static final int exo_track_resolution = 2131951768;
      public static final int exo_track_role_alternate = 2131951769;
      public static final int exo_track_role_closed_captions = 2131951770;
      public static final int exo_track_role_commentary = 2131951771;
      public static final int exo_track_role_supplementary = 2131951772;
      public static final int exo_track_selection_auto = 2131951773;
      public static final int exo_track_selection_none = 2131951774;
      public static final int exo_track_selection_title_audio = 2131951775;
      public static final int exo_track_selection_title_text = 2131951776;
      public static final int exo_track_selection_title_video = 2131951777;
      public static final int exo_track_stereo = 2131951778;
      public static final int exo_track_surround = 2131951779;
      public static final int exo_track_surround_5_point_1 = 2131951780;
      public static final int exo_track_surround_7_point_1 = 2131951781;
      public static final int exo_track_unknown = 2131951782;
      public static final int exposed_dropdown_menu_content_description = 2131951783;
      public static final int fab_transformation_scrim_behavior = 2131951784;
      public static final int fab_transformation_sheet_behavior = 2131951785;
      public static final int fallback_menu_item_copy_link = 2131951786;
      public static final int fallback_menu_item_open_in_browser = 2131951787;
      public static final int fallback_menu_item_share_link = 2131951788;
      public static final int fcm_2_args = 2131951789;
      public static final int fcm_fallback_notification_channel_label = 2131951790;
      public static final int fcm_no_args = 2131951791;
      public static final int firebase_database_url = 2131951792;
      public static final int gcm_defaultSenderId = 2131951793;
      public static final int google_api_key = 2131951794;
      public static final int google_app_id = 2131951795;
      public static final int google_crash_reporting_api_key = 2131951796;
      public static final int google_storage_bucket = 2131951797;
      public static final int header_description = 2131951798;
      public static final int hide_bottom_view_on_scroll_behavior = 2131951799;
      public static final int hour_description = 2131951800;
      public static final int hour_tag = 2131951801;
      public static final int icon_content_description = 2131951802;
      public static final int image_description = 2131951803;
      public static final int imagebutton_description = 2131951804;
      public static final int item_view_role_description = 2131951805;
      public static final int krisp_model_version = 2131951806;
      public static final int link_description = 2131951807;
      public static final int m3_ref_typeface_brand_medium = 2131951808;
      public static final int m3_ref_typeface_brand_regular = 2131951809;
      public static final int m3_ref_typeface_plain_medium = 2131951810;
      public static final int m3_ref_typeface_plain_regular = 2131951811;
      public static final int m3_sys_motion_easing_emphasized = 2131951812;
      public static final int m3_sys_motion_easing_emphasized_accelerate = 2131951813;
      public static final int m3_sys_motion_easing_emphasized_decelerate = 2131951814;
      public static final int m3_sys_motion_easing_emphasized_path_data = 2131951815;
      public static final int m3_sys_motion_easing_legacy = 2131951816;
      public static final int m3_sys_motion_easing_legacy_accelerate = 2131951817;
      public static final int m3_sys_motion_easing_legacy_decelerate = 2131951818;
      public static final int m3_sys_motion_easing_linear = 2131951819;
      public static final int m3_sys_motion_easing_standard = 2131951820;
      public static final int m3_sys_motion_easing_standard_accelerate = 2131951821;
      public static final int m3_sys_motion_easing_standard_decelerate = 2131951822;
      public static final int material_clock_display_divider = 2131951823;
      public static final int material_clock_toggle_content_description = 2131951824;
      public static final int material_hour_24h_suffix = 2131951825;
      public static final int material_hour_selection = 2131951826;
      public static final int material_hour_suffix = 2131951827;
      public static final int material_minute_selection = 2131951828;
      public static final int material_minute_suffix = 2131951829;
      public static final int material_motion_easing_accelerated = 2131951830;
      public static final int material_motion_easing_decelerated = 2131951831;
      public static final int material_motion_easing_emphasized = 2131951832;
      public static final int material_motion_easing_linear = 2131951833;
      public static final int material_motion_easing_standard = 2131951834;
      public static final int material_slider_range_end = 2131951835;
      public static final int material_slider_range_start = 2131951836;
      public static final int material_slider_value = 2131951837;
      public static final int material_timepicker_am = 2131951838;
      public static final int material_timepicker_clock_mode_description = 2131951839;
      public static final int material_timepicker_hour = 2131951840;
      public static final int material_timepicker_minute = 2131951841;
      public static final int material_timepicker_pm = 2131951842;
      public static final int material_timepicker_select_time = 2131951843;
      public static final int material_timepicker_text_input_mode_description = 2131951844;
      public static final int menu_description = 2131951845;
      public static final int menubar_description = 2131951846;
      public static final int menuitem_description = 2131951847;
      public static final int minutes_description = 2131951848;
      public static final int minutes_tag = 2131951849;
      public static final int month_description = 2131951850;
      public static final int mtrl_badge_numberless_content_description = 2131951851;
      public static final int mtrl_checkbox_button_icon_path_checked = 2131951852;
      public static final int mtrl_checkbox_button_icon_path_group_name = 2131951853;
      public static final int mtrl_checkbox_button_icon_path_indeterminate = 2131951854;
      public static final int mtrl_checkbox_button_icon_path_name = 2131951855;
      public static final int mtrl_checkbox_button_path_checked = 2131951856;
      public static final int mtrl_checkbox_button_path_group_name = 2131951857;
      public static final int mtrl_checkbox_button_path_name = 2131951858;
      public static final int mtrl_checkbox_button_path_unchecked = 2131951859;
      public static final int mtrl_checkbox_state_description_checked = 2131951860;
      public static final int mtrl_checkbox_state_description_indeterminate = 2131951861;
      public static final int mtrl_checkbox_state_description_unchecked = 2131951862;
      public static final int mtrl_chip_close_icon_content_description = 2131951863;
      public static final int mtrl_exceed_max_badge_number_content_description = 2131951864;
      public static final int mtrl_exceed_max_badge_number_suffix = 2131951865;
      public static final int mtrl_picker_a11y_next_month = 2131951866;
      public static final int mtrl_picker_a11y_prev_month = 2131951867;
      public static final int mtrl_picker_announce_current_range_selection = 2131951868;
      public static final int mtrl_picker_announce_current_selection = 2131951869;
      public static final int mtrl_picker_announce_current_selection_none = 2131951870;
      public static final int mtrl_picker_cancel = 2131951871;
      public static final int mtrl_picker_confirm = 2131951872;
      public static final int mtrl_picker_date_header_selected = 2131951873;
      public static final int mtrl_picker_date_header_title = 2131951874;
      public static final int mtrl_picker_date_header_unselected = 2131951875;
      public static final int mtrl_picker_day_of_week_column_header = 2131951876;
      public static final int mtrl_picker_end_date_description = 2131951877;
      public static final int mtrl_picker_invalid_format = 2131951878;
      public static final int mtrl_picker_invalid_format_example = 2131951879;
      public static final int mtrl_picker_invalid_format_use = 2131951880;
      public static final int mtrl_picker_invalid_range = 2131951881;
      public static final int mtrl_picker_navigate_to_current_year_description = 2131951882;
      public static final int mtrl_picker_navigate_to_year_description = 2131951883;
      public static final int mtrl_picker_out_of_range = 2131951884;
      public static final int mtrl_picker_range_header_only_end_selected = 2131951885;
      public static final int mtrl_picker_range_header_only_start_selected = 2131951886;
      public static final int mtrl_picker_range_header_selected = 2131951887;
      public static final int mtrl_picker_range_header_title = 2131951888;
      public static final int mtrl_picker_range_header_unselected = 2131951889;
      public static final int mtrl_picker_save = 2131951890;
      public static final int mtrl_picker_start_date_description = 2131951891;
      public static final int mtrl_picker_text_input_date_hint = 2131951892;
      public static final int mtrl_picker_text_input_date_range_end_hint = 2131951893;
      public static final int mtrl_picker_text_input_date_range_start_hint = 2131951894;
      public static final int mtrl_picker_text_input_day_abbr = 2131951895;
      public static final int mtrl_picker_text_input_month_abbr = 2131951896;
      public static final int mtrl_picker_text_input_year_abbr = 2131951897;
      public static final int mtrl_picker_today_description = 2131951898;
      public static final int mtrl_picker_toggle_to_calendar_input_mode = 2131951899;
      public static final int mtrl_picker_toggle_to_day_selection = 2131951900;
      public static final int mtrl_picker_toggle_to_text_input_mode = 2131951901;
      public static final int mtrl_picker_toggle_to_year_selection = 2131951902;
      public static final int mtrl_switch_thumb_group_name = 2131951903;
      public static final int mtrl_switch_thumb_path_checked = 2131951904;
      public static final int mtrl_switch_thumb_path_morphing = 2131951905;
      public static final int mtrl_switch_thumb_path_name = 2131951906;
      public static final int mtrl_switch_thumb_path_pressed = 2131951907;
      public static final int mtrl_switch_thumb_path_unchecked = 2131951908;
      public static final int mtrl_switch_track_decoration_path = 2131951909;
      public static final int mtrl_switch_track_path = 2131951910;
      public static final int mtrl_timepicker_cancel = 2131951911;
      public static final int mtrl_timepicker_confirm = 2131951912;
      public static final int overlay = 2131951913;
      public static final int password_toggle_content_description = 2131951914;
      public static final int path_password_eye = 2131951915;
      public static final int path_password_eye_mask_strike_through = 2131951916;
      public static final int path_password_eye_mask_visible = 2131951917;
      public static final int path_password_strike_through = 2131951918;
      public static final int progressbar_description = 2131951919;
      public static final int project_id = 2131951920;
      public static final int radiogroup_description = 2131951921;
      public static final int rn_tab_description = 2131951922;
      public static final int scrollbar_description = 2131951923;
      public static final int search_menu_title = 2131951924;
      public static final int searchbar_scrolling_view_behavior = 2131951925;
      public static final int searchview_clear_text_content_description = 2131951926;
      public static final int searchview_navigation_content_description = 2131951927;
      public static final int side_sheet_accessibility_pane_title = 2131951928;
      public static final int side_sheet_behavior = 2131951929;
      public static final int spinbutton_description = 2131951930;
      public static final int state_busy_description = 2131951931;
      public static final int state_collapsed_description = 2131951932;
      public static final int state_expanded_description = 2131951933;
      public static final int state_mixed_description = 2131951934;
      public static final int state_off_description = 2131951935;
      public static final int state_on_description = 2131951936;
      public static final int state_unselected_description = 2131951937;
      public static final int status_bar_notification_info_overflow = 2131951938;
      public static final int summary_description = 2131951939;
      public static final int tablist_description = 2131951940;
      public static final int time_tag = 2131951941;
      public static final int timer_description = 2131951942;
      public static final int toolbar_description = 2131951943;
      public static final int ucrop_crop = 2131951944;
      public static final int ucrop_error_input_data_is_absent = 2131951945;
      public static final int ucrop_label_edit_photo = 2131951946;
      public static final int ucrop_label_original = 2131951947;
      public static final int ucrop_menu_crop = 2131951948;
      public static final int ucrop_mutate_exception_hint = 2131951949;
      public static final int ucrop_rotate = 2131951950;
      public static final int ucrop_scale = 2131951951;
      public static final int unrecognized_media_format = 2131951952;
      public static final int year_description = 2131951953;

      private string() {
      }
   }

   public static final class style {
      public static final int AlertDialog_AppCompat = 2132017152;
      public static final int AlertDialog_AppCompat_Light = 2132017153;
      public static final int Animation_AppCompat_Dialog = 2132017154;
      public static final int Animation_AppCompat_DropDownUp = 2132017155;
      public static final int Animation_AppCompat_Tooltip = 2132017156;
      public static final int Animation_Catalyst_LogBox = 2132017157;
      public static final int Animation_Catalyst_RedBox = 2132017158;
      public static final int Animation_Design_BottomSheetDialog = 2132017159;
      public static final int Animation_Material3_BottomSheetDialog = 2132017160;
      public static final int Animation_Material3_SideSheetDialog = 2132017161;
      public static final int Animation_MaterialComponents_BottomSheetDialog = 2132017162;
      public static final int AppTheme = 2132017163;
      public static final int Base_AlertDialog_AppCompat = 2132017164;
      public static final int Base_AlertDialog_AppCompat_Light = 2132017165;
      public static final int Base_Animation_AppCompat_Dialog = 2132017166;
      public static final int Base_Animation_AppCompat_DropDownUp = 2132017167;
      public static final int Base_Animation_AppCompat_Tooltip = 2132017168;
      public static final int Base_CardView = 2132017169;
      public static final int Base_DialogWindowTitleBackground_AppCompat = 2132017171;
      public static final int Base_DialogWindowTitle_AppCompat = 2132017170;
      public static final int Base_MaterialAlertDialog_MaterialComponents_Title_Icon = 2132017172;
      public static final int Base_MaterialAlertDialog_MaterialComponents_Title_Panel = 2132017173;
      public static final int Base_MaterialAlertDialog_MaterialComponents_Title_Text = 2132017174;
      public static final int Base_TextAppearance_AppCompat = 2132017175;
      public static final int Base_TextAppearance_AppCompat_Body1 = 2132017176;
      public static final int Base_TextAppearance_AppCompat_Body2 = 2132017177;
      public static final int Base_TextAppearance_AppCompat_Button = 2132017178;
      public static final int Base_TextAppearance_AppCompat_Caption = 2132017179;
      public static final int Base_TextAppearance_AppCompat_Display1 = 2132017180;
      public static final int Base_TextAppearance_AppCompat_Display2 = 2132017181;
      public static final int Base_TextAppearance_AppCompat_Display3 = 2132017182;
      public static final int Base_TextAppearance_AppCompat_Display4 = 2132017183;
      public static final int Base_TextAppearance_AppCompat_Headline = 2132017184;
      public static final int Base_TextAppearance_AppCompat_Inverse = 2132017185;
      public static final int Base_TextAppearance_AppCompat_Large = 2132017186;
      public static final int Base_TextAppearance_AppCompat_Large_Inverse = 2132017187;
      public static final int Base_TextAppearance_AppCompat_Light_Widget_PopupMenu_Large = 2132017188;
      public static final int Base_TextAppearance_AppCompat_Light_Widget_PopupMenu_Small = 2132017189;
      public static final int Base_TextAppearance_AppCompat_Medium = 2132017190;
      public static final int Base_TextAppearance_AppCompat_Medium_Inverse = 2132017191;
      public static final int Base_TextAppearance_AppCompat_Menu = 2132017192;
      public static final int Base_TextAppearance_AppCompat_SearchResult = 2132017193;
      public static final int Base_TextAppearance_AppCompat_SearchResult_Subtitle = 2132017194;
      public static final int Base_TextAppearance_AppCompat_SearchResult_Title = 2132017195;
      public static final int Base_TextAppearance_AppCompat_Small = 2132017196;
      public static final int Base_TextAppearance_AppCompat_Small_Inverse = 2132017197;
      public static final int Base_TextAppearance_AppCompat_Subhead = 2132017198;
      public static final int Base_TextAppearance_AppCompat_Subhead_Inverse = 2132017199;
      public static final int Base_TextAppearance_AppCompat_Title = 2132017200;
      public static final int Base_TextAppearance_AppCompat_Title_Inverse = 2132017201;
      public static final int Base_TextAppearance_AppCompat_Tooltip = 2132017202;
      public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Menu = 2132017203;
      public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Subtitle = 2132017204;
      public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Subtitle_Inverse = 2132017205;
      public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Title = 2132017206;
      public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Title_Inverse = 2132017207;
      public static final int Base_TextAppearance_AppCompat_Widget_ActionMode_Subtitle = 2132017208;
      public static final int Base_TextAppearance_AppCompat_Widget_ActionMode_Title = 2132017209;
      public static final int Base_TextAppearance_AppCompat_Widget_Button = 2132017210;
      public static final int Base_TextAppearance_AppCompat_Widget_Button_Borderless_Colored = 2132017211;
      public static final int Base_TextAppearance_AppCompat_Widget_Button_Colored = 2132017212;
      public static final int Base_TextAppearance_AppCompat_Widget_Button_Inverse = 2132017213;
      public static final int Base_TextAppearance_AppCompat_Widget_DropDownItem = 2132017214;
      public static final int Base_TextAppearance_AppCompat_Widget_PopupMenu_Header = 2132017215;
      public static final int Base_TextAppearance_AppCompat_Widget_PopupMenu_Large = 2132017216;
      public static final int Base_TextAppearance_AppCompat_Widget_PopupMenu_Small = 2132017217;
      public static final int Base_TextAppearance_AppCompat_Widget_Switch = 2132017218;
      public static final int Base_TextAppearance_AppCompat_Widget_TextView_SpinnerItem = 2132017219;
      public static final int Base_TextAppearance_Material3_Search = 2132017220;
      public static final int Base_TextAppearance_MaterialComponents_Badge = 2132017221;
      public static final int Base_TextAppearance_MaterialComponents_Button = 2132017222;
      public static final int Base_TextAppearance_MaterialComponents_Headline6 = 2132017223;
      public static final int Base_TextAppearance_MaterialComponents_Subtitle2 = 2132017224;
      public static final int Base_TextAppearance_Widget_AppCompat_ExpandedMenu_Item = 2132017225;
      public static final int Base_TextAppearance_Widget_AppCompat_Toolbar_Subtitle = 2132017226;
      public static final int Base_TextAppearance_Widget_AppCompat_Toolbar_Title = 2132017227;
      public static final int Base_ThemeOverlay_AppCompat = 2132017269;
      public static final int Base_ThemeOverlay_AppCompat_ActionBar = 2132017270;
      public static final int Base_ThemeOverlay_AppCompat_Dark = 2132017271;
      public static final int Base_ThemeOverlay_AppCompat_Dark_ActionBar = 2132017272;
      public static final int Base_ThemeOverlay_AppCompat_Dialog = 2132017273;
      public static final int Base_ThemeOverlay_AppCompat_Dialog_Alert = 2132017274;
      public static final int Base_ThemeOverlay_AppCompat_Light = 2132017275;
      public static final int Base_ThemeOverlay_Material3_AutoCompleteTextView = 2132017276;
      public static final int Base_ThemeOverlay_Material3_BottomSheetDialog = 2132017277;
      public static final int Base_ThemeOverlay_Material3_Dialog = 2132017278;
      public static final int Base_ThemeOverlay_Material3_SideSheetDialog = 2132017279;
      public static final int Base_ThemeOverlay_Material3_TextInputEditText = 2132017280;
      public static final int Base_ThemeOverlay_MaterialComponents_Dialog = 2132017281;
      public static final int Base_ThemeOverlay_MaterialComponents_Dialog_Alert = 2132017282;
      public static final int Base_ThemeOverlay_MaterialComponents_Dialog_Alert_Framework = 2132017283;
      public static final int Base_ThemeOverlay_MaterialComponents_Light_Dialog_Alert_Framework = 2132017284;
      public static final int Base_ThemeOverlay_MaterialComponents_MaterialAlertDialog = 2132017285;
      public static final int Base_Theme_AppCompat = 2132017228;
      public static final int Base_Theme_AppCompat_CompactMenu = 2132017229;
      public static final int Base_Theme_AppCompat_Dialog = 2132017230;
      public static final int Base_Theme_AppCompat_DialogWhenLarge = 2132017234;
      public static final int Base_Theme_AppCompat_Dialog_Alert = 2132017231;
      public static final int Base_Theme_AppCompat_Dialog_FixedSize = 2132017232;
      public static final int Base_Theme_AppCompat_Dialog_MinWidth = 2132017233;
      public static final int Base_Theme_AppCompat_Light = 2132017235;
      public static final int Base_Theme_AppCompat_Light_DarkActionBar = 2132017236;
      public static final int Base_Theme_AppCompat_Light_Dialog = 2132017237;
      public static final int Base_Theme_AppCompat_Light_DialogWhenLarge = 2132017241;
      public static final int Base_Theme_AppCompat_Light_Dialog_Alert = 2132017238;
      public static final int Base_Theme_AppCompat_Light_Dialog_FixedSize = 2132017239;
      public static final int Base_Theme_AppCompat_Light_Dialog_MinWidth = 2132017240;
      public static final int Base_Theme_Material3_Dark = 2132017242;
      public static final int Base_Theme_Material3_Dark_BottomSheetDialog = 2132017243;
      public static final int Base_Theme_Material3_Dark_Dialog = 2132017244;
      public static final int Base_Theme_Material3_Dark_SideSheetDialog = 2132017245;
      public static final int Base_Theme_Material3_Light = 2132017246;
      public static final int Base_Theme_Material3_Light_BottomSheetDialog = 2132017247;
      public static final int Base_Theme_Material3_Light_Dialog = 2132017248;
      public static final int Base_Theme_Material3_Light_SideSheetDialog = 2132017249;
      public static final int Base_Theme_MaterialComponents = 2132017250;
      public static final int Base_Theme_MaterialComponents_Bridge = 2132017251;
      public static final int Base_Theme_MaterialComponents_CompactMenu = 2132017252;
      public static final int Base_Theme_MaterialComponents_Dialog = 2132017253;
      public static final int Base_Theme_MaterialComponents_DialogWhenLarge = 2132017258;
      public static final int Base_Theme_MaterialComponents_Dialog_Alert = 2132017254;
      public static final int Base_Theme_MaterialComponents_Dialog_Bridge = 2132017255;
      public static final int Base_Theme_MaterialComponents_Dialog_FixedSize = 2132017256;
      public static final int Base_Theme_MaterialComponents_Dialog_MinWidth = 2132017257;
      public static final int Base_Theme_MaterialComponents_Light = 2132017259;
      public static final int Base_Theme_MaterialComponents_Light_Bridge = 2132017260;
      public static final int Base_Theme_MaterialComponents_Light_DarkActionBar = 2132017261;
      public static final int Base_Theme_MaterialComponents_Light_DarkActionBar_Bridge = 2132017262;
      public static final int Base_Theme_MaterialComponents_Light_Dialog = 2132017263;
      public static final int Base_Theme_MaterialComponents_Light_DialogWhenLarge = 2132017268;
      public static final int Base_Theme_MaterialComponents_Light_Dialog_Alert = 2132017264;
      public static final int Base_Theme_MaterialComponents_Light_Dialog_Bridge = 2132017265;
      public static final int Base_Theme_MaterialComponents_Light_Dialog_FixedSize = 2132017266;
      public static final int Base_Theme_MaterialComponents_Light_Dialog_MinWidth = 2132017267;
      public static final int Base_V14_ThemeOverlay_Material3_BottomSheetDialog = 2132017303;
      public static final int Base_V14_ThemeOverlay_Material3_SideSheetDialog = 2132017304;
      public static final int Base_V14_ThemeOverlay_MaterialComponents_BottomSheetDialog = 2132017305;
      public static final int Base_V14_ThemeOverlay_MaterialComponents_Dialog = 2132017306;
      public static final int Base_V14_ThemeOverlay_MaterialComponents_Dialog_Alert = 2132017307;
      public static final int Base_V14_ThemeOverlay_MaterialComponents_MaterialAlertDialog = 2132017308;
      public static final int Base_V14_Theme_Material3_Dark = 2132017286;
      public static final int Base_V14_Theme_Material3_Dark_BottomSheetDialog = 2132017287;
      public static final int Base_V14_Theme_Material3_Dark_Dialog = 2132017288;
      public static final int Base_V14_Theme_Material3_Dark_SideSheetDialog = 2132017289;
      public static final int Base_V14_Theme_Material3_Light = 2132017290;
      public static final int Base_V14_Theme_Material3_Light_BottomSheetDialog = 2132017291;
      public static final int Base_V14_Theme_Material3_Light_Dialog = 2132017292;
      public static final int Base_V14_Theme_Material3_Light_SideSheetDialog = 2132017293;
      public static final int Base_V14_Theme_MaterialComponents = 2132017294;
      public static final int Base_V14_Theme_MaterialComponents_Bridge = 2132017295;
      public static final int Base_V14_Theme_MaterialComponents_Dialog = 2132017296;
      public static final int Base_V14_Theme_MaterialComponents_Dialog_Bridge = 2132017297;
      public static final int Base_V14_Theme_MaterialComponents_Light = 2132017298;
      public static final int Base_V14_Theme_MaterialComponents_Light_Bridge = 2132017299;
      public static final int Base_V14_Theme_MaterialComponents_Light_DarkActionBar_Bridge = 2132017300;
      public static final int Base_V14_Theme_MaterialComponents_Light_Dialog = 2132017301;
      public static final int Base_V14_Theme_MaterialComponents_Light_Dialog_Bridge = 2132017302;
      public static final int Base_V14_Widget_MaterialComponents_AutoCompleteTextView = 2132017309;
      public static final int Base_V21_ThemeOverlay_AppCompat_Dialog = 2132017318;
      public static final int Base_V21_ThemeOverlay_Material3_BottomSheetDialog = 2132017319;
      public static final int Base_V21_ThemeOverlay_Material3_SideSheetDialog = 2132017320;
      public static final int Base_V21_ThemeOverlay_MaterialComponents_BottomSheetDialog = 2132017321;
      public static final int Base_V21_Theme_AppCompat = 2132017310;
      public static final int Base_V21_Theme_AppCompat_Dialog = 2132017311;
      public static final int Base_V21_Theme_AppCompat_Light = 2132017312;
      public static final int Base_V21_Theme_AppCompat_Light_Dialog = 2132017313;
      public static final int Base_V21_Theme_MaterialComponents = 2132017314;
      public static final int Base_V21_Theme_MaterialComponents_Dialog = 2132017315;
      public static final int Base_V21_Theme_MaterialComponents_Light = 2132017316;
      public static final int Base_V21_Theme_MaterialComponents_Light_Dialog = 2132017317;
      public static final int Base_V22_Theme_AppCompat = 2132017322;
      public static final int Base_V22_Theme_AppCompat_Light = 2132017323;
      public static final int Base_V23_Theme_AppCompat = 2132017324;
      public static final int Base_V23_Theme_AppCompat_Light = 2132017325;
      public static final int Base_V24_Theme_Material3_Dark = 2132017326;
      public static final int Base_V24_Theme_Material3_Dark_Dialog = 2132017327;
      public static final int Base_V24_Theme_Material3_Light = 2132017328;
      public static final int Base_V24_Theme_Material3_Light_Dialog = 2132017329;
      public static final int Base_V26_Theme_AppCompat = 2132017330;
      public static final int Base_V26_Theme_AppCompat_Light = 2132017331;
      public static final int Base_V26_Widget_AppCompat_Toolbar = 2132017332;
      public static final int Base_V28_Theme_AppCompat = 2132017333;
      public static final int Base_V28_Theme_AppCompat_Light = 2132017334;
      public static final int Base_V7_ThemeOverlay_AppCompat_Dialog = 2132017339;
      public static final int Base_V7_Theme_AppCompat = 2132017335;
      public static final int Base_V7_Theme_AppCompat_Dialog = 2132017336;
      public static final int Base_V7_Theme_AppCompat_Light = 2132017337;
      public static final int Base_V7_Theme_AppCompat_Light_Dialog = 2132017338;
      public static final int Base_V7_Widget_AppCompat_AutoCompleteTextView = 2132017340;
      public static final int Base_V7_Widget_AppCompat_EditText = 2132017341;
      public static final int Base_V7_Widget_AppCompat_Toolbar = 2132017342;
      public static final int Base_Widget_AppCompat_ActionBar = 2132017343;
      public static final int Base_Widget_AppCompat_ActionBar_Solid = 2132017344;
      public static final int Base_Widget_AppCompat_ActionBar_TabBar = 2132017345;
      public static final int Base_Widget_AppCompat_ActionBar_TabText = 2132017346;
      public static final int Base_Widget_AppCompat_ActionBar_TabView = 2132017347;
      public static final int Base_Widget_AppCompat_ActionButton = 2132017348;
      public static final int Base_Widget_AppCompat_ActionButton_CloseMode = 2132017349;
      public static final int Base_Widget_AppCompat_ActionButton_Overflow = 2132017350;
      public static final int Base_Widget_AppCompat_ActionMode = 2132017351;
      public static final int Base_Widget_AppCompat_ActivityChooserView = 2132017352;
      public static final int Base_Widget_AppCompat_AutoCompleteTextView = 2132017353;
      public static final int Base_Widget_AppCompat_Button = 2132017354;
      public static final int Base_Widget_AppCompat_ButtonBar = 2132017360;
      public static final int Base_Widget_AppCompat_ButtonBar_AlertDialog = 2132017361;
      public static final int Base_Widget_AppCompat_Button_Borderless = 2132017355;
      public static final int Base_Widget_AppCompat_Button_Borderless_Colored = 2132017356;
      public static final int Base_Widget_AppCompat_Button_ButtonBar_AlertDialog = 2132017357;
      public static final int Base_Widget_AppCompat_Button_Colored = 2132017358;
      public static final int Base_Widget_AppCompat_Button_Small = 2132017359;
      public static final int Base_Widget_AppCompat_CompoundButton_CheckBox = 2132017362;
      public static final int Base_Widget_AppCompat_CompoundButton_RadioButton = 2132017363;
      public static final int Base_Widget_AppCompat_CompoundButton_Switch = 2132017364;
      public static final int Base_Widget_AppCompat_DrawerArrowToggle = 2132017365;
      public static final int Base_Widget_AppCompat_DrawerArrowToggle_Common = 2132017366;
      public static final int Base_Widget_AppCompat_DropDownItem_Spinner = 2132017367;
      public static final int Base_Widget_AppCompat_EditText = 2132017368;
      public static final int Base_Widget_AppCompat_ImageButton = 2132017369;
      public static final int Base_Widget_AppCompat_Light_ActionBar = 2132017370;
      public static final int Base_Widget_AppCompat_Light_ActionBar_Solid = 2132017371;
      public static final int Base_Widget_AppCompat_Light_ActionBar_TabBar = 2132017372;
      public static final int Base_Widget_AppCompat_Light_ActionBar_TabText = 2132017373;
      public static final int Base_Widget_AppCompat_Light_ActionBar_TabText_Inverse = 2132017374;
      public static final int Base_Widget_AppCompat_Light_ActionBar_TabView = 2132017375;
      public static final int Base_Widget_AppCompat_Light_PopupMenu = 2132017376;
      public static final int Base_Widget_AppCompat_Light_PopupMenu_Overflow = 2132017377;
      public static final int Base_Widget_AppCompat_ListMenuView = 2132017378;
      public static final int Base_Widget_AppCompat_ListPopupWindow = 2132017379;
      public static final int Base_Widget_AppCompat_ListView = 2132017380;
      public static final int Base_Widget_AppCompat_ListView_DropDown = 2132017381;
      public static final int Base_Widget_AppCompat_ListView_Menu = 2132017382;
      public static final int Base_Widget_AppCompat_PopupMenu = 2132017383;
      public static final int Base_Widget_AppCompat_PopupMenu_Overflow = 2132017384;
      public static final int Base_Widget_AppCompat_PopupWindow = 2132017385;
      public static final int Base_Widget_AppCompat_ProgressBar = 2132017386;
      public static final int Base_Widget_AppCompat_ProgressBar_Horizontal = 2132017387;
      public static final int Base_Widget_AppCompat_RatingBar = 2132017388;
      public static final int Base_Widget_AppCompat_RatingBar_Indicator = 2132017389;
      public static final int Base_Widget_AppCompat_RatingBar_Small = 2132017390;
      public static final int Base_Widget_AppCompat_SearchView = 2132017391;
      public static final int Base_Widget_AppCompat_SearchView_ActionBar = 2132017392;
      public static final int Base_Widget_AppCompat_SeekBar = 2132017393;
      public static final int Base_Widget_AppCompat_SeekBar_Discrete = 2132017394;
      public static final int Base_Widget_AppCompat_Spinner = 2132017395;
      public static final int Base_Widget_AppCompat_Spinner_Underlined = 2132017396;
      public static final int Base_Widget_AppCompat_TextView = 2132017397;
      public static final int Base_Widget_AppCompat_TextView_SpinnerItem = 2132017398;
      public static final int Base_Widget_AppCompat_Toolbar = 2132017399;
      public static final int Base_Widget_AppCompat_Toolbar_Button_Navigation = 2132017400;
      public static final int Base_Widget_Design_TabLayout = 2132017401;
      public static final int Base_Widget_Material3_ActionBar_Solid = 2132017402;
      public static final int Base_Widget_Material3_ActionMode = 2132017403;
      public static final int Base_Widget_Material3_BottomNavigationView = 2132017404;
      public static final int Base_Widget_Material3_CardView = 2132017405;
      public static final int Base_Widget_Material3_Chip = 2132017406;
      public static final int Base_Widget_Material3_CollapsingToolbar = 2132017407;
      public static final int Base_Widget_Material3_CompoundButton_CheckBox = 2132017408;
      public static final int Base_Widget_Material3_CompoundButton_RadioButton = 2132017409;
      public static final int Base_Widget_Material3_CompoundButton_Switch = 2132017410;
      public static final int Base_Widget_Material3_ExtendedFloatingActionButton = 2132017411;
      public static final int Base_Widget_Material3_ExtendedFloatingActionButton_Icon = 2132017412;
      public static final int Base_Widget_Material3_FloatingActionButton = 2132017413;
      public static final int Base_Widget_Material3_FloatingActionButton_Large = 2132017414;
      public static final int Base_Widget_Material3_FloatingActionButton_Small = 2132017415;
      public static final int Base_Widget_Material3_Light_ActionBar_Solid = 2132017416;
      public static final int Base_Widget_Material3_MaterialCalendar_NavigationButton = 2132017417;
      public static final int Base_Widget_Material3_Snackbar = 2132017418;
      public static final int Base_Widget_Material3_TabLayout = 2132017419;
      public static final int Base_Widget_Material3_TabLayout_OnSurface = 2132017420;
      public static final int Base_Widget_Material3_TabLayout_Secondary = 2132017421;
      public static final int Base_Widget_MaterialComponents_AutoCompleteTextView = 2132017422;
      public static final int Base_Widget_MaterialComponents_CheckedTextView = 2132017423;
      public static final int Base_Widget_MaterialComponents_Chip = 2132017424;
      public static final int Base_Widget_MaterialComponents_MaterialCalendar_HeaderToggleButton = 2132017425;
      public static final int Base_Widget_MaterialComponents_MaterialCalendar_NavigationButton = 2132017426;
      public static final int Base_Widget_MaterialComponents_PopupMenu = 2132017427;
      public static final int Base_Widget_MaterialComponents_PopupMenu_ContextMenu = 2132017428;
      public static final int Base_Widget_MaterialComponents_PopupMenu_ListPopupWindow = 2132017429;
      public static final int Base_Widget_MaterialComponents_PopupMenu_Overflow = 2132017430;
      public static final int Base_Widget_MaterialComponents_Slider = 2132017431;
      public static final int Base_Widget_MaterialComponents_Snackbar = 2132017432;
      public static final int Base_Widget_MaterialComponents_TextInputEditText = 2132017433;
      public static final int Base_Widget_MaterialComponents_TextInputLayout = 2132017434;
      public static final int Base_Widget_MaterialComponents_TextView = 2132017435;
      public static final int CalendarDatePickerDialog = 2132017436;
      public static final int CalendarDatePickerStyle = 2132017437;
      public static final int CardView = 2132017438;
      public static final int CardView_Dark = 2132017439;
      public static final int CardView_Light = 2132017440;
      public static final int DatePickerBaseTheme = 2132017441;
      public static final int DatePickerTheme = 2132017442;
      public static final int DialogAnimationFade = 2132017443;
      public static final int DialogAnimationSlide = 2132017444;
      public static final int ExoMediaButton = 2132017445;
      public static final int ExoMediaButton_FastForward = 2132017446;
      public static final int ExoMediaButton_Next = 2132017447;
      public static final int ExoMediaButton_Pause = 2132017448;
      public static final int ExoMediaButton_Play = 2132017449;
      public static final int ExoMediaButton_Previous = 2132017450;
      public static final int ExoMediaButton_Rewind = 2132017451;
      public static final int ExoMediaButton_VR = 2132017452;
      public static final int ExoStyledControls = 2132017453;
      public static final int ExoStyledControls_Button = 2132017454;
      public static final int ExoStyledControls_Button_Bottom = 2132017455;
      public static final int ExoStyledControls_Button_Bottom_AudioTrack = 2132017456;
      public static final int ExoStyledControls_Button_Bottom_CC = 2132017457;
      public static final int ExoStyledControls_Button_Bottom_FullScreen = 2132017458;
      public static final int ExoStyledControls_Button_Bottom_OverflowHide = 2132017459;
      public static final int ExoStyledControls_Button_Bottom_OverflowShow = 2132017460;
      public static final int ExoStyledControls_Button_Bottom_PlaybackSpeed = 2132017461;
      public static final int ExoStyledControls_Button_Bottom_RepeatToggle = 2132017462;
      public static final int ExoStyledControls_Button_Bottom_Settings = 2132017463;
      public static final int ExoStyledControls_Button_Bottom_Shuffle = 2132017464;
      public static final int ExoStyledControls_Button_Bottom_VR = 2132017465;
      public static final int ExoStyledControls_Button_Center = 2132017466;
      public static final int ExoStyledControls_Button_Center_FfwdWithAmount = 2132017467;
      public static final int ExoStyledControls_Button_Center_Next = 2132017468;
      public static final int ExoStyledControls_Button_Center_PlayPause = 2132017469;
      public static final int ExoStyledControls_Button_Center_Previous = 2132017470;
      public static final int ExoStyledControls_Button_Center_RewWithAmount = 2132017471;
      public static final int ExoStyledControls_TimeBar = 2132017472;
      public static final int ExoStyledControls_TimeText = 2132017473;
      public static final int ExoStyledControls_TimeText_Duration = 2132017474;
      public static final int ExoStyledControls_TimeText_Position = 2132017475;
      public static final int ExoStyledControls_TimeText_Separator = 2132017476;
      public static final int MaterialAlertDialog_Material3 = 2132017477;
      public static final int MaterialAlertDialog_Material3_Animation = 2132017478;
      public static final int MaterialAlertDialog_Material3_Body_Text = 2132017479;
      public static final int MaterialAlertDialog_Material3_Body_Text_CenterStacked = 2132017480;
      public static final int MaterialAlertDialog_Material3_Title_Icon = 2132017481;
      public static final int MaterialAlertDialog_Material3_Title_Icon_CenterStacked = 2132017482;
      public static final int MaterialAlertDialog_Material3_Title_Panel = 2132017483;
      public static final int MaterialAlertDialog_Material3_Title_Panel_CenterStacked = 2132017484;
      public static final int MaterialAlertDialog_Material3_Title_Text = 2132017485;
      public static final int MaterialAlertDialog_Material3_Title_Text_CenterStacked = 2132017486;
      public static final int MaterialAlertDialog_MaterialComponents = 2132017487;
      public static final int MaterialAlertDialog_MaterialComponents_Body_Text = 2132017488;
      public static final int MaterialAlertDialog_MaterialComponents_Picker_Date_Calendar = 2132017489;
      public static final int MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner = 2132017490;
      public static final int MaterialAlertDialog_MaterialComponents_Title_Icon = 2132017491;
      public static final int MaterialAlertDialog_MaterialComponents_Title_Icon_CenterStacked = 2132017492;
      public static final int MaterialAlertDialog_MaterialComponents_Title_Panel = 2132017493;
      public static final int MaterialAlertDialog_MaterialComponents_Title_Panel_CenterStacked = 2132017494;
      public static final int MaterialAlertDialog_MaterialComponents_Title_Text = 2132017495;
      public static final int MaterialAlertDialog_MaterialComponents_Title_Text_CenterStacked = 2132017496;
      public static final int OverlayDialog = 2132017497;
      public static final int OverlayHorizontalMenuOption = 2132017498;
      public static final int OverlayVerticalMenuOption = 2132017499;
      public static final int Platform_AppCompat = 2132017500;
      public static final int Platform_AppCompat_Light = 2132017501;
      public static final int Platform_MaterialComponents = 2132017502;
      public static final int Platform_MaterialComponents_Dialog = 2132017503;
      public static final int Platform_MaterialComponents_Light = 2132017504;
      public static final int Platform_MaterialComponents_Light_Dialog = 2132017505;
      public static final int Platform_ThemeOverlay_AppCompat = 2132017506;
      public static final int Platform_ThemeOverlay_AppCompat_Dark = 2132017507;
      public static final int Platform_ThemeOverlay_AppCompat_Light = 2132017508;
      public static final int Platform_V21_AppCompat = 2132017509;
      public static final int Platform_V21_AppCompat_Light = 2132017510;
      public static final int Platform_V25_AppCompat = 2132017511;
      public static final int Platform_V25_AppCompat_Light = 2132017512;
      public static final int Platform_Widget_AppCompat_Spinner = 2132017513;
      public static final int RtlOverlay_DialogWindowTitle_AppCompat = 2132017514;
      public static final int RtlOverlay_Widget_AppCompat_ActionBar_TitleItem = 2132017515;
      public static final int RtlOverlay_Widget_AppCompat_DialogTitle_Icon = 2132017516;
      public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem = 2132017517;
      public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_InternalGroup = 2132017518;
      public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_Shortcut = 2132017519;
      public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_SubmenuArrow = 2132017520;
      public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_Text = 2132017521;
      public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_Title = 2132017522;
      public static final int RtlOverlay_Widget_AppCompat_SearchView_MagIcon = 2132017528;
      public static final int RtlOverlay_Widget_AppCompat_Search_DropDown = 2132017523;
      public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Icon1 = 2132017524;
      public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Icon2 = 2132017525;
      public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Query = 2132017526;
      public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Text = 2132017527;
      public static final int RtlUnderlay_Widget_AppCompat_ActionButton = 2132017529;
      public static final int RtlUnderlay_Widget_AppCompat_ActionButton_Overflow = 2132017530;
      public static final int ShapeAppearanceOverlay_Material3_Button = 2132017571;
      public static final int ShapeAppearanceOverlay_Material3_Chip = 2132017572;
      public static final int ShapeAppearanceOverlay_Material3_Corner_Bottom = 2132017573;
      public static final int ShapeAppearanceOverlay_Material3_Corner_Left = 2132017574;
      public static final int ShapeAppearanceOverlay_Material3_Corner_Right = 2132017575;
      public static final int ShapeAppearanceOverlay_Material3_Corner_Top = 2132017576;
      public static final int ShapeAppearanceOverlay_Material3_FloatingActionButton = 2132017577;
      public static final int ShapeAppearanceOverlay_Material3_NavigationView_Item = 2132017578;
      public static final int ShapeAppearanceOverlay_Material3_SearchBar = 2132017579;
      public static final int ShapeAppearanceOverlay_Material3_SearchView = 2132017580;
      public static final int ShapeAppearanceOverlay_MaterialAlertDialog_Material3 = 2132017581;
      public static final int ShapeAppearanceOverlay_MaterialComponents_BottomSheet = 2132017582;
      public static final int ShapeAppearanceOverlay_MaterialComponents_Chip = 2132017583;
      public static final int ShapeAppearanceOverlay_MaterialComponents_ExtendedFloatingActionButton = 2132017584;
      public static final int ShapeAppearanceOverlay_MaterialComponents_FloatingActionButton = 2132017585;
      public static final int ShapeAppearanceOverlay_MaterialComponents_MaterialCalendar_Day = 2132017586;
      public static final int ShapeAppearanceOverlay_MaterialComponents_MaterialCalendar_Window_Fullscreen = 2132017587;
      public static final int ShapeAppearanceOverlay_MaterialComponents_MaterialCalendar_Year = 2132017588;
      public static final int ShapeAppearanceOverlay_MaterialComponents_TextInputLayout_FilledBox = 2132017589;
      public static final int ShapeAppearance_M3_Comp_Badge_Large_Shape = 2132017531;
      public static final int ShapeAppearance_M3_Comp_Badge_Shape = 2132017532;
      public static final int ShapeAppearance_M3_Comp_BottomAppBar_Container_Shape = 2132017533;
      public static final int ShapeAppearance_M3_Comp_FilledButton_Container_Shape = 2132017534;
      public static final int ShapeAppearance_M3_Comp_NavigationBar_ActiveIndicator_Shape = 2132017535;
      public static final int ShapeAppearance_M3_Comp_NavigationDrawer_ActiveIndicator_Shape = 2132017536;
      public static final int ShapeAppearance_M3_Comp_NavigationRail_ActiveIndicator_Shape = 2132017537;
      public static final int ShapeAppearance_M3_Comp_SearchBar_Avatar_Shape = 2132017538;
      public static final int ShapeAppearance_M3_Comp_SearchBar_Container_Shape = 2132017539;
      public static final int ShapeAppearance_M3_Comp_SearchView_FullScreen_Container_Shape = 2132017540;
      public static final int ShapeAppearance_M3_Comp_Sheet_Side_Docked_Container_Shape = 2132017541;
      public static final int ShapeAppearance_M3_Comp_Switch_Handle_Shape = 2132017542;
      public static final int ShapeAppearance_M3_Comp_Switch_StateLayer_Shape = 2132017543;
      public static final int ShapeAppearance_M3_Comp_Switch_Track_Shape = 2132017544;
      public static final int ShapeAppearance_M3_Comp_TextButton_Container_Shape = 2132017545;
      public static final int ShapeAppearance_M3_Sys_Shape_Corner_ExtraLarge = 2132017546;
      public static final int ShapeAppearance_M3_Sys_Shape_Corner_ExtraSmall = 2132017547;
      public static final int ShapeAppearance_M3_Sys_Shape_Corner_Full = 2132017548;
      public static final int ShapeAppearance_M3_Sys_Shape_Corner_Large = 2132017549;
      public static final int ShapeAppearance_M3_Sys_Shape_Corner_Medium = 2132017550;
      public static final int ShapeAppearance_M3_Sys_Shape_Corner_None = 2132017551;
      public static final int ShapeAppearance_M3_Sys_Shape_Corner_Small = 2132017552;
      public static final int ShapeAppearance_Material3_Corner_ExtraLarge = 2132017553;
      public static final int ShapeAppearance_Material3_Corner_ExtraSmall = 2132017554;
      public static final int ShapeAppearance_Material3_Corner_Full = 2132017555;
      public static final int ShapeAppearance_Material3_Corner_Large = 2132017556;
      public static final int ShapeAppearance_Material3_Corner_Medium = 2132017557;
      public static final int ShapeAppearance_Material3_Corner_None = 2132017558;
      public static final int ShapeAppearance_Material3_Corner_Small = 2132017559;
      public static final int ShapeAppearance_Material3_LargeComponent = 2132017560;
      public static final int ShapeAppearance_Material3_MediumComponent = 2132017561;
      public static final int ShapeAppearance_Material3_NavigationBarView_ActiveIndicator = 2132017562;
      public static final int ShapeAppearance_Material3_SmallComponent = 2132017563;
      public static final int ShapeAppearance_Material3_Tooltip = 2132017564;
      public static final int ShapeAppearance_MaterialComponents = 2132017565;
      public static final int ShapeAppearance_MaterialComponents_Badge = 2132017566;
      public static final int ShapeAppearance_MaterialComponents_LargeComponent = 2132017567;
      public static final int ShapeAppearance_MaterialComponents_MediumComponent = 2132017568;
      public static final int ShapeAppearance_MaterialComponents_SmallComponent = 2132017569;
      public static final int ShapeAppearance_MaterialComponents_Tooltip = 2132017570;
      public static final int SpinnerDatePickerDialog = 2132017590;
      public static final int SpinnerDatePickerStyle = 2132017591;
      public static final int TextAppearance_AppCompat = 2132017592;
      public static final int TextAppearance_AppCompat_Body1 = 2132017593;
      public static final int TextAppearance_AppCompat_Body2 = 2132017594;
      public static final int TextAppearance_AppCompat_Button = 2132017595;
      public static final int TextAppearance_AppCompat_Caption = 2132017596;
      public static final int TextAppearance_AppCompat_Display1 = 2132017597;
      public static final int TextAppearance_AppCompat_Display2 = 2132017598;
      public static final int TextAppearance_AppCompat_Display3 = 2132017599;
      public static final int TextAppearance_AppCompat_Display4 = 2132017600;
      public static final int TextAppearance_AppCompat_Headline = 2132017601;
      public static final int TextAppearance_AppCompat_Inverse = 2132017602;
      public static final int TextAppearance_AppCompat_Large = 2132017603;
      public static final int TextAppearance_AppCompat_Large_Inverse = 2132017604;
      public static final int TextAppearance_AppCompat_Light_SearchResult_Subtitle = 2132017605;
      public static final int TextAppearance_AppCompat_Light_SearchResult_Title = 2132017606;
      public static final int TextAppearance_AppCompat_Light_Widget_PopupMenu_Large = 2132017607;
      public static final int TextAppearance_AppCompat_Light_Widget_PopupMenu_Small = 2132017608;
      public static final int TextAppearance_AppCompat_Medium = 2132017609;
      public static final int TextAppearance_AppCompat_Medium_Inverse = 2132017610;
      public static final int TextAppearance_AppCompat_Menu = 2132017611;
      public static final int TextAppearance_AppCompat_SearchResult_Subtitle = 2132017612;
      public static final int TextAppearance_AppCompat_SearchResult_Title = 2132017613;
      public static final int TextAppearance_AppCompat_Small = 2132017614;
      public static final int TextAppearance_AppCompat_Small_Inverse = 2132017615;
      public static final int TextAppearance_AppCompat_Subhead = 2132017616;
      public static final int TextAppearance_AppCompat_Subhead_Inverse = 2132017617;
      public static final int TextAppearance_AppCompat_Title = 2132017618;
      public static final int TextAppearance_AppCompat_Title_Inverse = 2132017619;
      public static final int TextAppearance_AppCompat_Tooltip = 2132017620;
      public static final int TextAppearance_AppCompat_Widget_ActionBar_Menu = 2132017621;
      public static final int TextAppearance_AppCompat_Widget_ActionBar_Subtitle = 2132017622;
      public static final int TextAppearance_AppCompat_Widget_ActionBar_Subtitle_Inverse = 2132017623;
      public static final int TextAppearance_AppCompat_Widget_ActionBar_Title = 2132017624;
      public static final int TextAppearance_AppCompat_Widget_ActionBar_Title_Inverse = 2132017625;
      public static final int TextAppearance_AppCompat_Widget_ActionMode_Subtitle = 2132017626;
      public static final int TextAppearance_AppCompat_Widget_ActionMode_Subtitle_Inverse = 2132017627;
      public static final int TextAppearance_AppCompat_Widget_ActionMode_Title = 2132017628;
      public static final int TextAppearance_AppCompat_Widget_ActionMode_Title_Inverse = 2132017629;
      public static final int TextAppearance_AppCompat_Widget_Button = 2132017630;
      public static final int TextAppearance_AppCompat_Widget_Button_Borderless_Colored = 2132017631;
      public static final int TextAppearance_AppCompat_Widget_Button_Colored = 2132017632;
      public static final int TextAppearance_AppCompat_Widget_Button_Inverse = 2132017633;
      public static final int TextAppearance_AppCompat_Widget_DropDownItem = 2132017634;
      public static final int TextAppearance_AppCompat_Widget_PopupMenu_Header = 2132017635;
      public static final int TextAppearance_AppCompat_Widget_PopupMenu_Large = 2132017636;
      public static final int TextAppearance_AppCompat_Widget_PopupMenu_Small = 2132017637;
      public static final int TextAppearance_AppCompat_Widget_Switch = 2132017638;
      public static final int TextAppearance_AppCompat_Widget_TextView_SpinnerItem = 2132017639;
      public static final int TextAppearance_Compat_Notification = 2132017640;
      public static final int TextAppearance_Compat_Notification_Info = 2132017641;
      public static final int TextAppearance_Compat_Notification_Info_Media = 2132017642;
      public static final int TextAppearance_Compat_Notification_Line2 = 2132017643;
      public static final int TextAppearance_Compat_Notification_Line2_Media = 2132017644;
      public static final int TextAppearance_Compat_Notification_Media = 2132017645;
      public static final int TextAppearance_Compat_Notification_Time = 2132017646;
      public static final int TextAppearance_Compat_Notification_Time_Media = 2132017647;
      public static final int TextAppearance_Compat_Notification_Title = 2132017648;
      public static final int TextAppearance_Compat_Notification_Title_Media = 2132017649;
      public static final int TextAppearance_Design_CollapsingToolbar_Expanded = 2132017650;
      public static final int TextAppearance_Design_Counter = 2132017651;
      public static final int TextAppearance_Design_Counter_Overflow = 2132017652;
      public static final int TextAppearance_Design_Error = 2132017653;
      public static final int TextAppearance_Design_HelperText = 2132017654;
      public static final int TextAppearance_Design_Hint = 2132017655;
      public static final int TextAppearance_Design_Placeholder = 2132017656;
      public static final int TextAppearance_Design_Prefix = 2132017657;
      public static final int TextAppearance_Design_Snackbar_Message = 2132017658;
      public static final int TextAppearance_Design_Suffix = 2132017659;
      public static final int TextAppearance_Design_Tab = 2132017660;
      public static final int TextAppearance_M3_Sys_Typescale_BodyLarge = 2132017661;
      public static final int TextAppearance_M3_Sys_Typescale_BodyMedium = 2132017662;
      public static final int TextAppearance_M3_Sys_Typescale_BodySmall = 2132017663;
      public static final int TextAppearance_M3_Sys_Typescale_DisplayLarge = 2132017664;
      public static final int TextAppearance_M3_Sys_Typescale_DisplayMedium = 2132017665;
      public static final int TextAppearance_M3_Sys_Typescale_DisplaySmall = 2132017666;
      public static final int TextAppearance_M3_Sys_Typescale_HeadlineLarge = 2132017667;
      public static final int TextAppearance_M3_Sys_Typescale_HeadlineMedium = 2132017668;
      public static final int TextAppearance_M3_Sys_Typescale_HeadlineSmall = 2132017669;
      public static final int TextAppearance_M3_Sys_Typescale_LabelLarge = 2132017670;
      public static final int TextAppearance_M3_Sys_Typescale_LabelMedium = 2132017671;
      public static final int TextAppearance_M3_Sys_Typescale_LabelSmall = 2132017672;
      public static final int TextAppearance_M3_Sys_Typescale_TitleLarge = 2132017673;
      public static final int TextAppearance_M3_Sys_Typescale_TitleMedium = 2132017674;
      public static final int TextAppearance_M3_Sys_Typescale_TitleSmall = 2132017675;
      public static final int TextAppearance_Material3_ActionBar_Subtitle = 2132017676;
      public static final int TextAppearance_Material3_ActionBar_Title = 2132017677;
      public static final int TextAppearance_Material3_BodyLarge = 2132017678;
      public static final int TextAppearance_Material3_BodyMedium = 2132017679;
      public static final int TextAppearance_Material3_BodySmall = 2132017680;
      public static final int TextAppearance_Material3_DisplayLarge = 2132017681;
      public static final int TextAppearance_Material3_DisplayMedium = 2132017682;
      public static final int TextAppearance_Material3_DisplaySmall = 2132017683;
      public static final int TextAppearance_Material3_HeadlineLarge = 2132017684;
      public static final int TextAppearance_Material3_HeadlineMedium = 2132017685;
      public static final int TextAppearance_Material3_HeadlineSmall = 2132017686;
      public static final int TextAppearance_Material3_LabelLarge = 2132017687;
      public static final int TextAppearance_Material3_LabelMedium = 2132017688;
      public static final int TextAppearance_Material3_LabelSmall = 2132017689;
      public static final int TextAppearance_Material3_MaterialTimePicker_Title = 2132017690;
      public static final int TextAppearance_Material3_SearchBar = 2132017691;
      public static final int TextAppearance_Material3_SearchView = 2132017692;
      public static final int TextAppearance_Material3_SearchView_Prefix = 2132017693;
      public static final int TextAppearance_Material3_TitleLarge = 2132017694;
      public static final int TextAppearance_Material3_TitleMedium = 2132017695;
      public static final int TextAppearance_Material3_TitleSmall = 2132017696;
      public static final int TextAppearance_MaterialComponents_Badge = 2132017697;
      public static final int TextAppearance_MaterialComponents_Body1 = 2132017698;
      public static final int TextAppearance_MaterialComponents_Body2 = 2132017699;
      public static final int TextAppearance_MaterialComponents_Button = 2132017700;
      public static final int TextAppearance_MaterialComponents_Caption = 2132017701;
      public static final int TextAppearance_MaterialComponents_Chip = 2132017702;
      public static final int TextAppearance_MaterialComponents_Headline1 = 2132017703;
      public static final int TextAppearance_MaterialComponents_Headline2 = 2132017704;
      public static final int TextAppearance_MaterialComponents_Headline3 = 2132017705;
      public static final int TextAppearance_MaterialComponents_Headline4 = 2132017706;
      public static final int TextAppearance_MaterialComponents_Headline5 = 2132017707;
      public static final int TextAppearance_MaterialComponents_Headline6 = 2132017708;
      public static final int TextAppearance_MaterialComponents_Overline = 2132017709;
      public static final int TextAppearance_MaterialComponents_Subtitle1 = 2132017710;
      public static final int TextAppearance_MaterialComponents_Subtitle2 = 2132017711;
      public static final int TextAppearance_MaterialComponents_TimePicker_Title = 2132017712;
      public static final int TextAppearance_MaterialComponents_Tooltip = 2132017713;
      public static final int TextAppearance_Widget_AppCompat_ExpandedMenu_Item = 2132017714;
      public static final int TextAppearance_Widget_AppCompat_Toolbar_Subtitle = 2132017715;
      public static final int TextAppearance_Widget_AppCompat_Toolbar_Title = 2132017716;
      public static final int Theme = 2132017717;
      public static final int ThemeOverlay_AppCompat = 2132017832;
      public static final int ThemeOverlay_AppCompat_ActionBar = 2132017833;
      public static final int ThemeOverlay_AppCompat_Dark = 2132017834;
      public static final int ThemeOverlay_AppCompat_Dark_ActionBar = 2132017835;
      public static final int ThemeOverlay_AppCompat_DayNight = 2132017836;
      public static final int ThemeOverlay_AppCompat_DayNight_ActionBar = 2132017837;
      public static final int ThemeOverlay_AppCompat_Dialog = 2132017838;
      public static final int ThemeOverlay_AppCompat_Dialog_Alert = 2132017839;
      public static final int ThemeOverlay_AppCompat_Light = 2132017840;
      public static final int ThemeOverlay_Design_TextInputEditText = 2132017841;
      public static final int ThemeOverlay_Material3 = 2132017842;
      public static final int ThemeOverlay_Material3_ActionBar = 2132017843;
      public static final int ThemeOverlay_Material3_AutoCompleteTextView = 2132017844;
      public static final int ThemeOverlay_Material3_AutoCompleteTextView_FilledBox = 2132017845;
      public static final int ThemeOverlay_Material3_AutoCompleteTextView_FilledBox_Dense = 2132017846;
      public static final int ThemeOverlay_Material3_AutoCompleteTextView_OutlinedBox = 2132017847;
      public static final int ThemeOverlay_Material3_AutoCompleteTextView_OutlinedBox_Dense = 2132017848;
      public static final int ThemeOverlay_Material3_BottomAppBar = 2132017849;
      public static final int ThemeOverlay_Material3_BottomAppBar_Legacy = 2132017850;
      public static final int ThemeOverlay_Material3_BottomSheetDialog = 2132017851;
      public static final int ThemeOverlay_Material3_Button = 2132017852;
      public static final int ThemeOverlay_Material3_Button_ElevatedButton = 2132017853;
      public static final int ThemeOverlay_Material3_Button_IconButton = 2132017854;
      public static final int ThemeOverlay_Material3_Button_IconButton_Filled = 2132017855;
      public static final int ThemeOverlay_Material3_Button_IconButton_Filled_Tonal = 2132017856;
      public static final int ThemeOverlay_Material3_Button_TextButton = 2132017857;
      public static final int ThemeOverlay_Material3_Button_TextButton_Snackbar = 2132017858;
      public static final int ThemeOverlay_Material3_Button_TonalButton = 2132017859;
      public static final int ThemeOverlay_Material3_Chip = 2132017860;
      public static final int ThemeOverlay_Material3_Chip_Assist = 2132017861;
      public static final int ThemeOverlay_Material3_Dark = 2132017862;
      public static final int ThemeOverlay_Material3_Dark_ActionBar = 2132017863;
      public static final int ThemeOverlay_Material3_DayNight_BottomSheetDialog = 2132017864;
      public static final int ThemeOverlay_Material3_DayNight_SideSheetDialog = 2132017865;
      public static final int ThemeOverlay_Material3_Dialog = 2132017866;
      public static final int ThemeOverlay_Material3_Dialog_Alert = 2132017867;
      public static final int ThemeOverlay_Material3_Dialog_Alert_Framework = 2132017868;
      public static final int ThemeOverlay_Material3_DynamicColors_Dark = 2132017869;
      public static final int ThemeOverlay_Material3_DynamicColors_DayNight = 2132017870;
      public static final int ThemeOverlay_Material3_DynamicColors_Light = 2132017871;
      public static final int ThemeOverlay_Material3_ExtendedFloatingActionButton_Primary = 2132017872;
      public static final int ThemeOverlay_Material3_ExtendedFloatingActionButton_Secondary = 2132017873;
      public static final int ThemeOverlay_Material3_ExtendedFloatingActionButton_Surface = 2132017874;
      public static final int ThemeOverlay_Material3_ExtendedFloatingActionButton_Tertiary = 2132017875;
      public static final int ThemeOverlay_Material3_FloatingActionButton_Primary = 2132017876;
      public static final int ThemeOverlay_Material3_FloatingActionButton_Secondary = 2132017877;
      public static final int ThemeOverlay_Material3_FloatingActionButton_Surface = 2132017878;
      public static final int ThemeOverlay_Material3_FloatingActionButton_Tertiary = 2132017879;
      public static final int ThemeOverlay_Material3_HarmonizedColors = 2132017880;
      public static final int ThemeOverlay_Material3_HarmonizedColors_Empty = 2132017881;
      public static final int ThemeOverlay_Material3_Light = 2132017882;
      public static final int ThemeOverlay_Material3_Light_Dialog_Alert_Framework = 2132017883;
      public static final int ThemeOverlay_Material3_MaterialAlertDialog = 2132017884;
      public static final int ThemeOverlay_Material3_MaterialAlertDialog_Centered = 2132017885;
      public static final int ThemeOverlay_Material3_MaterialCalendar = 2132017886;
      public static final int ThemeOverlay_Material3_MaterialCalendar_Fullscreen = 2132017887;
      public static final int ThemeOverlay_Material3_MaterialCalendar_HeaderCancelButton = 2132017888;
      public static final int ThemeOverlay_Material3_MaterialTimePicker = 2132017889;
      public static final int ThemeOverlay_Material3_MaterialTimePicker_Display_TextInputEditText = 2132017890;
      public static final int ThemeOverlay_Material3_NavigationView = 2132017891;
      public static final int ThemeOverlay_Material3_PersonalizedColors = 2132017892;
      public static final int ThemeOverlay_Material3_Search = 2132017893;
      public static final int ThemeOverlay_Material3_SideSheetDialog = 2132017894;
      public static final int ThemeOverlay_Material3_Snackbar = 2132017895;
      public static final int ThemeOverlay_Material3_TextInputEditText = 2132017896;
      public static final int ThemeOverlay_Material3_TextInputEditText_FilledBox = 2132017897;
      public static final int ThemeOverlay_Material3_TextInputEditText_FilledBox_Dense = 2132017898;
      public static final int ThemeOverlay_Material3_TextInputEditText_OutlinedBox = 2132017899;
      public static final int ThemeOverlay_Material3_TextInputEditText_OutlinedBox_Dense = 2132017900;
      public static final int ThemeOverlay_Material3_Toolbar_Surface = 2132017901;
      public static final int ThemeOverlay_MaterialAlertDialog_Material3_Title_Icon = 2132017902;
      public static final int ThemeOverlay_MaterialComponents = 2132017903;
      public static final int ThemeOverlay_MaterialComponents_ActionBar = 2132017904;
      public static final int ThemeOverlay_MaterialComponents_ActionBar_Primary = 2132017905;
      public static final int ThemeOverlay_MaterialComponents_ActionBar_Surface = 2132017906;
      public static final int ThemeOverlay_MaterialComponents_AutoCompleteTextView = 2132017907;
      public static final int ThemeOverlay_MaterialComponents_AutoCompleteTextView_FilledBox = 2132017908;
      public static final int ThemeOverlay_MaterialComponents_AutoCompleteTextView_FilledBox_Dense = 2132017909;
      public static final int ThemeOverlay_MaterialComponents_AutoCompleteTextView_OutlinedBox = 2132017910;
      public static final int ThemeOverlay_MaterialComponents_AutoCompleteTextView_OutlinedBox_Dense = 2132017911;
      public static final int ThemeOverlay_MaterialComponents_BottomAppBar_Primary = 2132017912;
      public static final int ThemeOverlay_MaterialComponents_BottomAppBar_Surface = 2132017913;
      public static final int ThemeOverlay_MaterialComponents_BottomSheetDialog = 2132017914;
      public static final int ThemeOverlay_MaterialComponents_Dark = 2132017915;
      public static final int ThemeOverlay_MaterialComponents_Dark_ActionBar = 2132017916;
      public static final int ThemeOverlay_MaterialComponents_DayNight_BottomSheetDialog = 2132017917;
      public static final int ThemeOverlay_MaterialComponents_Dialog = 2132017918;
      public static final int ThemeOverlay_MaterialComponents_Dialog_Alert = 2132017919;
      public static final int ThemeOverlay_MaterialComponents_Dialog_Alert_Framework = 2132017920;
      public static final int ThemeOverlay_MaterialComponents_Light = 2132017921;
      public static final int ThemeOverlay_MaterialComponents_Light_Dialog_Alert_Framework = 2132017922;
      public static final int ThemeOverlay_MaterialComponents_MaterialAlertDialog = 2132017923;
      public static final int ThemeOverlay_MaterialComponents_MaterialAlertDialog_Centered = 2132017924;
      public static final int ThemeOverlay_MaterialComponents_MaterialAlertDialog_Picker_Date = 2132017925;
      public static final int ThemeOverlay_MaterialComponents_MaterialAlertDialog_Picker_Date_Calendar = 2132017926;
      public static final int ThemeOverlay_MaterialComponents_MaterialAlertDialog_Picker_Date_Header_Text = 2132017927;
      public static final int ThemeOverlay_MaterialComponents_MaterialAlertDialog_Picker_Date_Header_Text_Day = 2132017928;
      public static final int ThemeOverlay_MaterialComponents_MaterialAlertDialog_Picker_Date_Spinner = 2132017929;
      public static final int ThemeOverlay_MaterialComponents_MaterialCalendar = 2132017930;
      public static final int ThemeOverlay_MaterialComponents_MaterialCalendar_Fullscreen = 2132017931;
      public static final int ThemeOverlay_MaterialComponents_TextInputEditText = 2132017932;
      public static final int ThemeOverlay_MaterialComponents_TextInputEditText_FilledBox = 2132017933;
      public static final int ThemeOverlay_MaterialComponents_TextInputEditText_FilledBox_Dense = 2132017934;
      public static final int ThemeOverlay_MaterialComponents_TextInputEditText_OutlinedBox = 2132017935;
      public static final int ThemeOverlay_MaterialComponents_TextInputEditText_OutlinedBox_Dense = 2132017936;
      public static final int ThemeOverlay_MaterialComponents_TimePicker = 2132017937;
      public static final int ThemeOverlay_MaterialComponents_TimePicker_Display = 2132017938;
      public static final int ThemeOverlay_MaterialComponents_TimePicker_Display_TextInputEditText = 2132017939;
      public static final int ThemeOverlay_MaterialComponents_Toolbar_Popup_Primary = 2132017940;
      public static final int ThemeOverlay_MaterialComponents_Toolbar_Primary = 2132017941;
      public static final int ThemeOverlay_MaterialComponents_Toolbar_Surface = 2132017942;
      public static final int Theme_AppCompat = 2132017718;
      public static final int Theme_AppCompat_CompactMenu = 2132017719;
      public static final int Theme_AppCompat_DayNight = 2132017720;
      public static final int Theme_AppCompat_DayNight_DarkActionBar = 2132017721;
      public static final int Theme_AppCompat_DayNight_Dialog = 2132017722;
      public static final int Theme_AppCompat_DayNight_DialogWhenLarge = 2132017725;
      public static final int Theme_AppCompat_DayNight_Dialog_Alert = 2132017723;
      public static final int Theme_AppCompat_DayNight_Dialog_MinWidth = 2132017724;
      public static final int Theme_AppCompat_DayNight_NoActionBar = 2132017726;
      public static final int Theme_AppCompat_Dialog = 2132017727;
      public static final int Theme_AppCompat_DialogWhenLarge = 2132017730;
      public static final int Theme_AppCompat_Dialog_Alert = 2132017728;
      public static final int Theme_AppCompat_Dialog_MinWidth = 2132017729;
      public static final int Theme_AppCompat_Empty = 2132017731;
      public static final int Theme_AppCompat_Light = 2132017732;
      public static final int Theme_AppCompat_Light_DarkActionBar = 2132017733;
      public static final int Theme_AppCompat_Light_Dialog = 2132017734;
      public static final int Theme_AppCompat_Light_DialogWhenLarge = 2132017737;
      public static final int Theme_AppCompat_Light_Dialog_Alert = 2132017735;
      public static final int Theme_AppCompat_Light_Dialog_MinWidth = 2132017736;
      public static final int Theme_AppCompat_Light_NoActionBar = 2132017738;
      public static final int Theme_AppCompat_NoActionBar = 2132017739;
      public static final int Theme_AutofillInlineSuggestion = 2132017740;
      public static final int Theme_Catalyst = 2132017741;
      public static final int Theme_Catalyst_LogBox = 2132017742;
      public static final int Theme_Catalyst_RedBox = 2132017743;
      public static final int Theme_Design = 2132017744;
      public static final int Theme_Design_BottomSheetDialog = 2132017745;
      public static final int Theme_Design_Light = 2132017746;
      public static final int Theme_Design_Light_BottomSheetDialog = 2132017747;
      public static final int Theme_Design_Light_NoActionBar = 2132017748;
      public static final int Theme_Design_NoActionBar = 2132017749;
      public static final int Theme_FullScreenDialog = 2132017750;
      public static final int Theme_FullScreenDialogAnimatedFade = 2132017751;
      public static final int Theme_FullScreenDialogAnimatedSlide = 2132017752;
      public static final int Theme_Hidden = 2132017753;
      public static final int Theme_Material3_Dark = 2132017754;
      public static final int Theme_Material3_Dark_BottomSheetDialog = 2132017755;
      public static final int Theme_Material3_Dark_Dialog = 2132017756;
      public static final int Theme_Material3_Dark_DialogWhenLarge = 2132017759;
      public static final int Theme_Material3_Dark_Dialog_Alert = 2132017757;
      public static final int Theme_Material3_Dark_Dialog_MinWidth = 2132017758;
      public static final int Theme_Material3_Dark_NoActionBar = 2132017760;
      public static final int Theme_Material3_Dark_SideSheetDialog = 2132017761;
      public static final int Theme_Material3_DayNight = 2132017762;
      public static final int Theme_Material3_DayNight_BottomSheetDialog = 2132017763;
      public static final int Theme_Material3_DayNight_Dialog = 2132017764;
      public static final int Theme_Material3_DayNight_DialogWhenLarge = 2132017767;
      public static final int Theme_Material3_DayNight_Dialog_Alert = 2132017765;
      public static final int Theme_Material3_DayNight_Dialog_MinWidth = 2132017766;
      public static final int Theme_Material3_DayNight_NoActionBar = 2132017768;
      public static final int Theme_Material3_DayNight_SideSheetDialog = 2132017769;
      public static final int Theme_Material3_DynamicColors_Dark = 2132017770;
      public static final int Theme_Material3_DynamicColors_DayNight = 2132017771;
      public static final int Theme_Material3_DynamicColors_Light = 2132017772;
      public static final int Theme_Material3_Light = 2132017773;
      public static final int Theme_Material3_Light_BottomSheetDialog = 2132017774;
      public static final int Theme_Material3_Light_Dialog = 2132017775;
      public static final int Theme_Material3_Light_DialogWhenLarge = 2132017778;
      public static final int Theme_Material3_Light_Dialog_Alert = 2132017776;
      public static final int Theme_Material3_Light_Dialog_MinWidth = 2132017777;
      public static final int Theme_Material3_Light_NoActionBar = 2132017779;
      public static final int Theme_Material3_Light_SideSheetDialog = 2132017780;
      public static final int Theme_MaterialComponents = 2132017781;
      public static final int Theme_MaterialComponents_BottomSheetDialog = 2132017782;
      public static final int Theme_MaterialComponents_Bridge = 2132017783;
      public static final int Theme_MaterialComponents_CompactMenu = 2132017784;
      public static final int Theme_MaterialComponents_DayNight = 2132017785;
      public static final int Theme_MaterialComponents_DayNight_BottomSheetDialog = 2132017786;
      public static final int Theme_MaterialComponents_DayNight_Bridge = 2132017787;
      public static final int Theme_MaterialComponents_DayNight_DarkActionBar = 2132017788;
      public static final int Theme_MaterialComponents_DayNight_DarkActionBar_Bridge = 2132017789;
      public static final int Theme_MaterialComponents_DayNight_Dialog = 2132017790;
      public static final int Theme_MaterialComponents_DayNight_DialogWhenLarge = 2132017798;
      public static final int Theme_MaterialComponents_DayNight_Dialog_Alert = 2132017791;
      public static final int Theme_MaterialComponents_DayNight_Dialog_Alert_Bridge = 2132017792;
      public static final int Theme_MaterialComponents_DayNight_Dialog_Bridge = 2132017793;
      public static final int Theme_MaterialComponents_DayNight_Dialog_FixedSize = 2132017794;
      public static final int Theme_MaterialComponents_DayNight_Dialog_FixedSize_Bridge = 2132017795;
      public static final int Theme_MaterialComponents_DayNight_Dialog_MinWidth = 2132017796;
      public static final int Theme_MaterialComponents_DayNight_Dialog_MinWidth_Bridge = 2132017797;
      public static final int Theme_MaterialComponents_DayNight_NoActionBar = 2132017799;
      public static final int Theme_MaterialComponents_DayNight_NoActionBar_Bridge = 2132017800;
      public static final int Theme_MaterialComponents_Dialog = 2132017801;
      public static final int Theme_MaterialComponents_DialogWhenLarge = 2132017809;
      public static final int Theme_MaterialComponents_Dialog_Alert = 2132017802;
      public static final int Theme_MaterialComponents_Dialog_Alert_Bridge = 2132017803;
      public static final int Theme_MaterialComponents_Dialog_Bridge = 2132017804;
      public static final int Theme_MaterialComponents_Dialog_FixedSize = 2132017805;
      public static final int Theme_MaterialComponents_Dialog_FixedSize_Bridge = 2132017806;
      public static final int Theme_MaterialComponents_Dialog_MinWidth = 2132017807;
      public static final int Theme_MaterialComponents_Dialog_MinWidth_Bridge = 2132017808;
      public static final int Theme_MaterialComponents_Light = 2132017810;
      public static final int Theme_MaterialComponents_Light_BottomSheetDialog = 2132017811;
      public static final int Theme_MaterialComponents_Light_Bridge = 2132017812;
      public static final int Theme_MaterialComponents_Light_DarkActionBar = 2132017813;
      public static final int Theme_MaterialComponents_Light_DarkActionBar_Bridge = 2132017814;
      public static final int Theme_MaterialComponents_Light_Dialog = 2132017815;
      public static final int Theme_MaterialComponents_Light_DialogWhenLarge = 2132017823;
      public static final int Theme_MaterialComponents_Light_Dialog_Alert = 2132017816;
      public static final int Theme_MaterialComponents_Light_Dialog_Alert_Bridge = 2132017817;
      public static final int Theme_MaterialComponents_Light_Dialog_Bridge = 2132017818;
      public static final int Theme_MaterialComponents_Light_Dialog_FixedSize = 2132017819;
      public static final int Theme_MaterialComponents_Light_Dialog_FixedSize_Bridge = 2132017820;
      public static final int Theme_MaterialComponents_Light_Dialog_MinWidth = 2132017821;
      public static final int Theme_MaterialComponents_Light_Dialog_MinWidth_Bridge = 2132017822;
      public static final int Theme_MaterialComponents_Light_NoActionBar = 2132017824;
      public static final int Theme_MaterialComponents_Light_NoActionBar_Bridge = 2132017825;
      public static final int Theme_MaterialComponents_NoActionBar = 2132017826;
      public static final int Theme_MaterialComponents_NoActionBar_Bridge = 2132017827;
      public static final int Theme_PlayCore_Transparent = 2132017828;
      public static final int Theme_ReactNative_AppCompat_Light = 2132017829;
      public static final int Theme_ReactNative_AppCompat_Light_NoActionBar_FullScreen = 2132017830;
      public static final int Theme_ReactNative_TextInput_DefaultBackground = 2132017831;
      public static final int Widget_AppCompat_ActionBar = 2132017943;
      public static final int Widget_AppCompat_ActionBar_Solid = 2132017944;
      public static final int Widget_AppCompat_ActionBar_TabBar = 2132017945;
      public static final int Widget_AppCompat_ActionBar_TabText = 2132017946;
      public static final int Widget_AppCompat_ActionBar_TabView = 2132017947;
      public static final int Widget_AppCompat_ActionButton = 2132017948;
      public static final int Widget_AppCompat_ActionButton_CloseMode = 2132017949;
      public static final int Widget_AppCompat_ActionButton_Overflow = 2132017950;
      public static final int Widget_AppCompat_ActionMode = 2132017951;
      public static final int Widget_AppCompat_ActivityChooserView = 2132017952;
      public static final int Widget_AppCompat_AutoCompleteTextView = 2132017953;
      public static final int Widget_AppCompat_Button = 2132017954;
      public static final int Widget_AppCompat_ButtonBar = 2132017960;
      public static final int Widget_AppCompat_ButtonBar_AlertDialog = 2132017961;
      public static final int Widget_AppCompat_Button_Borderless = 2132017955;
      public static final int Widget_AppCompat_Button_Borderless_Colored = 2132017956;
      public static final int Widget_AppCompat_Button_ButtonBar_AlertDialog = 2132017957;
      public static final int Widget_AppCompat_Button_Colored = 2132017958;
      public static final int Widget_AppCompat_Button_Small = 2132017959;
      public static final int Widget_AppCompat_CompoundButton_CheckBox = 2132017962;
      public static final int Widget_AppCompat_CompoundButton_RadioButton = 2132017963;
      public static final int Widget_AppCompat_CompoundButton_Switch = 2132017964;
      public static final int Widget_AppCompat_DrawerArrowToggle = 2132017965;
      public static final int Widget_AppCompat_DropDownItem_Spinner = 2132017966;
      public static final int Widget_AppCompat_EditText = 2132017967;
      public static final int Widget_AppCompat_ImageButton = 2132017968;
      public static final int Widget_AppCompat_Light_ActionBar = 2132017969;
      public static final int Widget_AppCompat_Light_ActionBar_Solid = 2132017970;
      public static final int Widget_AppCompat_Light_ActionBar_Solid_Inverse = 2132017971;
      public static final int Widget_AppCompat_Light_ActionBar_TabBar = 2132017972;
      public static final int Widget_AppCompat_Light_ActionBar_TabBar_Inverse = 2132017973;
      public static final int Widget_AppCompat_Light_ActionBar_TabText = 2132017974;
      public static final int Widget_AppCompat_Light_ActionBar_TabText_Inverse = 2132017975;
      public static final int Widget_AppCompat_Light_ActionBar_TabView = 2132017976;
      public static final int Widget_AppCompat_Light_ActionBar_TabView_Inverse = 2132017977;
      public static final int Widget_AppCompat_Light_ActionButton = 2132017978;
      public static final int Widget_AppCompat_Light_ActionButton_CloseMode = 2132017979;
      public static final int Widget_AppCompat_Light_ActionButton_Overflow = 2132017980;
      public static final int Widget_AppCompat_Light_ActionMode_Inverse = 2132017981;
      public static final int Widget_AppCompat_Light_ActivityChooserView = 2132017982;
      public static final int Widget_AppCompat_Light_AutoCompleteTextView = 2132017983;
      public static final int Widget_AppCompat_Light_DropDownItem_Spinner = 2132017984;
      public static final int Widget_AppCompat_Light_ListPopupWindow = 2132017985;
      public static final int Widget_AppCompat_Light_ListView_DropDown = 2132017986;
      public static final int Widget_AppCompat_Light_PopupMenu = 2132017987;
      public static final int Widget_AppCompat_Light_PopupMenu_Overflow = 2132017988;
      public static final int Widget_AppCompat_Light_SearchView = 2132017989;
      public static final int Widget_AppCompat_Light_Spinner_DropDown_ActionBar = 2132017990;
      public static final int Widget_AppCompat_ListMenuView = 2132017991;
      public static final int Widget_AppCompat_ListPopupWindow = 2132017992;
      public static final int Widget_AppCompat_ListView = 2132017993;
      public static final int Widget_AppCompat_ListView_DropDown = 2132017994;
      public static final int Widget_AppCompat_ListView_Menu = 2132017995;
      public static final int Widget_AppCompat_PopupMenu = 2132017996;
      public static final int Widget_AppCompat_PopupMenu_Overflow = 2132017997;
      public static final int Widget_AppCompat_PopupWindow = 2132017998;
      public static final int Widget_AppCompat_ProgressBar = 2132017999;
      public static final int Widget_AppCompat_ProgressBar_Horizontal = 2132018000;
      public static final int Widget_AppCompat_RatingBar = 2132018001;
      public static final int Widget_AppCompat_RatingBar_Indicator = 2132018002;
      public static final int Widget_AppCompat_RatingBar_Small = 2132018003;
      public static final int Widget_AppCompat_SearchView = 2132018004;
      public static final int Widget_AppCompat_SearchView_ActionBar = 2132018005;
      public static final int Widget_AppCompat_SeekBar = 2132018006;
      public static final int Widget_AppCompat_SeekBar_Discrete = 2132018007;
      public static final int Widget_AppCompat_Spinner = 2132018008;
      public static final int Widget_AppCompat_Spinner_DropDown = 2132018009;
      public static final int Widget_AppCompat_Spinner_DropDown_ActionBar = 2132018010;
      public static final int Widget_AppCompat_Spinner_Underlined = 2132018011;
      public static final int Widget_AppCompat_TextView = 2132018012;
      public static final int Widget_AppCompat_TextView_SpinnerItem = 2132018013;
      public static final int Widget_AppCompat_Toolbar = 2132018014;
      public static final int Widget_AppCompat_Toolbar_Button_Navigation = 2132018015;
      public static final int Widget_Autofill = 2132018016;
      public static final int Widget_Autofill_InlineSuggestionChip = 2132018017;
      public static final int Widget_Autofill_InlineSuggestionEndIconStyle = 2132018018;
      public static final int Widget_Autofill_InlineSuggestionStartIconStyle = 2132018019;
      public static final int Widget_Autofill_InlineSuggestionSubtitle = 2132018020;
      public static final int Widget_Autofill_InlineSuggestionTitle = 2132018021;
      public static final int Widget_Compat_NotificationActionContainer = 2132018022;
      public static final int Widget_Compat_NotificationActionText = 2132018023;
      public static final int Widget_Design_AppBarLayout = 2132018024;
      public static final int Widget_Design_BottomNavigationView = 2132018025;
      public static final int Widget_Design_BottomSheet_Modal = 2132018026;
      public static final int Widget_Design_CollapsingToolbar = 2132018027;
      public static final int Widget_Design_FloatingActionButton = 2132018028;
      public static final int Widget_Design_NavigationView = 2132018029;
      public static final int Widget_Design_ScrimInsetsFrameLayout = 2132018030;
      public static final int Widget_Design_Snackbar = 2132018031;
      public static final int Widget_Design_TabLayout = 2132018032;
      public static final int Widget_Design_TextInputEditText = 2132018033;
      public static final int Widget_Design_TextInputLayout = 2132018034;
      public static final int Widget_Material3_ActionBar_Solid = 2132018035;
      public static final int Widget_Material3_ActionMode = 2132018036;
      public static final int Widget_Material3_AppBarLayout = 2132018037;
      public static final int Widget_Material3_AutoCompleteTextView_FilledBox = 2132018038;
      public static final int Widget_Material3_AutoCompleteTextView_FilledBox_Dense = 2132018039;
      public static final int Widget_Material3_AutoCompleteTextView_OutlinedBox = 2132018040;
      public static final int Widget_Material3_AutoCompleteTextView_OutlinedBox_Dense = 2132018041;
      public static final int Widget_Material3_Badge = 2132018042;
      public static final int Widget_Material3_BottomAppBar = 2132018043;
      public static final int Widget_Material3_BottomAppBar_Button_Navigation = 2132018044;
      public static final int Widget_Material3_BottomAppBar_Legacy = 2132018045;
      public static final int Widget_Material3_BottomNavigationView = 2132018046;
      public static final int Widget_Material3_BottomNavigationView_ActiveIndicator = 2132018047;
      public static final int Widget_Material3_BottomSheet = 2132018048;
      public static final int Widget_Material3_BottomSheet_DragHandle = 2132018049;
      public static final int Widget_Material3_BottomSheet_Modal = 2132018050;
      public static final int Widget_Material3_Button = 2132018051;
      public static final int Widget_Material3_Button_ElevatedButton = 2132018052;
      public static final int Widget_Material3_Button_ElevatedButton_Icon = 2132018053;
      public static final int Widget_Material3_Button_Icon = 2132018054;
      public static final int Widget_Material3_Button_IconButton = 2132018055;
      public static final int Widget_Material3_Button_IconButton_Filled = 2132018056;
      public static final int Widget_Material3_Button_IconButton_Filled_Tonal = 2132018057;
      public static final int Widget_Material3_Button_IconButton_Outlined = 2132018058;
      public static final int Widget_Material3_Button_OutlinedButton = 2132018059;
      public static final int Widget_Material3_Button_OutlinedButton_Icon = 2132018060;
      public static final int Widget_Material3_Button_TextButton = 2132018061;
      public static final int Widget_Material3_Button_TextButton_Dialog = 2132018062;
      public static final int Widget_Material3_Button_TextButton_Dialog_Flush = 2132018063;
      public static final int Widget_Material3_Button_TextButton_Dialog_Icon = 2132018064;
      public static final int Widget_Material3_Button_TextButton_Icon = 2132018065;
      public static final int Widget_Material3_Button_TextButton_Snackbar = 2132018066;
      public static final int Widget_Material3_Button_TonalButton = 2132018067;
      public static final int Widget_Material3_Button_TonalButton_Icon = 2132018068;
      public static final int Widget_Material3_Button_UnelevatedButton = 2132018069;
      public static final int Widget_Material3_CardView_Elevated = 2132018070;
      public static final int Widget_Material3_CardView_Filled = 2132018071;
      public static final int Widget_Material3_CardView_Outlined = 2132018072;
      public static final int Widget_Material3_CheckedTextView = 2132018073;
      public static final int Widget_Material3_ChipGroup = 2132018084;
      public static final int Widget_Material3_Chip_Assist = 2132018074;
      public static final int Widget_Material3_Chip_Assist_Elevated = 2132018075;
      public static final int Widget_Material3_Chip_Filter = 2132018076;
      public static final int Widget_Material3_Chip_Filter_Elevated = 2132018077;
      public static final int Widget_Material3_Chip_Input = 2132018078;
      public static final int Widget_Material3_Chip_Input_Elevated = 2132018079;
      public static final int Widget_Material3_Chip_Input_Icon = 2132018080;
      public static final int Widget_Material3_Chip_Input_Icon_Elevated = 2132018081;
      public static final int Widget_Material3_Chip_Suggestion = 2132018082;
      public static final int Widget_Material3_Chip_Suggestion_Elevated = 2132018083;
      public static final int Widget_Material3_CircularProgressIndicator = 2132018085;
      public static final int Widget_Material3_CircularProgressIndicator_ExtraSmall = 2132018086;
      public static final int Widget_Material3_CircularProgressIndicator_Medium = 2132018087;
      public static final int Widget_Material3_CircularProgressIndicator_Small = 2132018088;
      public static final int Widget_Material3_CollapsingToolbar = 2132018089;
      public static final int Widget_Material3_CollapsingToolbar_Large = 2132018090;
      public static final int Widget_Material3_CollapsingToolbar_Medium = 2132018091;
      public static final int Widget_Material3_CompoundButton_CheckBox = 2132018092;
      public static final int Widget_Material3_CompoundButton_MaterialSwitch = 2132018093;
      public static final int Widget_Material3_CompoundButton_RadioButton = 2132018094;
      public static final int Widget_Material3_CompoundButton_Switch = 2132018095;
      public static final int Widget_Material3_DrawerLayout = 2132018096;
      public static final int Widget_Material3_ExtendedFloatingActionButton_Icon_Primary = 2132018097;
      public static final int Widget_Material3_ExtendedFloatingActionButton_Icon_Secondary = 2132018098;
      public static final int Widget_Material3_ExtendedFloatingActionButton_Icon_Surface = 2132018099;
      public static final int Widget_Material3_ExtendedFloatingActionButton_Icon_Tertiary = 2132018100;
      public static final int Widget_Material3_ExtendedFloatingActionButton_Primary = 2132018101;
      public static final int Widget_Material3_ExtendedFloatingActionButton_Secondary = 2132018102;
      public static final int Widget_Material3_ExtendedFloatingActionButton_Surface = 2132018103;
      public static final int Widget_Material3_ExtendedFloatingActionButton_Tertiary = 2132018104;
      public static final int Widget_Material3_FloatingActionButton_Large_Primary = 2132018105;
      public static final int Widget_Material3_FloatingActionButton_Large_Secondary = 2132018106;
      public static final int Widget_Material3_FloatingActionButton_Large_Surface = 2132018107;
      public static final int Widget_Material3_FloatingActionButton_Large_Tertiary = 2132018108;
      public static final int Widget_Material3_FloatingActionButton_Primary = 2132018109;
      public static final int Widget_Material3_FloatingActionButton_Secondary = 2132018110;
      public static final int Widget_Material3_FloatingActionButton_Small_Primary = 2132018111;
      public static final int Widget_Material3_FloatingActionButton_Small_Secondary = 2132018112;
      public static final int Widget_Material3_FloatingActionButton_Small_Surface = 2132018113;
      public static final int Widget_Material3_FloatingActionButton_Small_Tertiary = 2132018114;
      public static final int Widget_Material3_FloatingActionButton_Surface = 2132018115;
      public static final int Widget_Material3_FloatingActionButton_Tertiary = 2132018116;
      public static final int Widget_Material3_Light_ActionBar_Solid = 2132018117;
      public static final int Widget_Material3_LinearProgressIndicator = 2132018118;
      public static final int Widget_Material3_MaterialButtonToggleGroup = 2132018119;
      public static final int Widget_Material3_MaterialCalendar = 2132018120;
      public static final int Widget_Material3_MaterialCalendar_Day = 2132018121;
      public static final int Widget_Material3_MaterialCalendar_DayOfWeekLabel = 2132018125;
      public static final int Widget_Material3_MaterialCalendar_DayTextView = 2132018126;
      public static final int Widget_Material3_MaterialCalendar_Day_Invalid = 2132018122;
      public static final int Widget_Material3_MaterialCalendar_Day_Selected = 2132018123;
      public static final int Widget_Material3_MaterialCalendar_Day_Today = 2132018124;
      public static final int Widget_Material3_MaterialCalendar_Fullscreen = 2132018127;
      public static final int Widget_Material3_MaterialCalendar_HeaderCancelButton = 2132018128;
      public static final int Widget_Material3_MaterialCalendar_HeaderDivider = 2132018129;
      public static final int Widget_Material3_MaterialCalendar_HeaderLayout = 2132018130;
      public static final int Widget_Material3_MaterialCalendar_HeaderLayout_Fullscreen = 2132018131;
      public static final int Widget_Material3_MaterialCalendar_HeaderSelection = 2132018132;
      public static final int Widget_Material3_MaterialCalendar_HeaderSelection_Fullscreen = 2132018133;
      public static final int Widget_Material3_MaterialCalendar_HeaderTitle = 2132018134;
      public static final int Widget_Material3_MaterialCalendar_HeaderToggleButton = 2132018135;
      public static final int Widget_Material3_MaterialCalendar_Item = 2132018136;
      public static final int Widget_Material3_MaterialCalendar_MonthNavigationButton = 2132018137;
      public static final int Widget_Material3_MaterialCalendar_MonthTextView = 2132018138;
      public static final int Widget_Material3_MaterialCalendar_Year = 2132018139;
      public static final int Widget_Material3_MaterialCalendar_YearNavigationButton = 2132018142;
      public static final int Widget_Material3_MaterialCalendar_Year_Selected = 2132018140;
      public static final int Widget_Material3_MaterialCalendar_Year_Today = 2132018141;
      public static final int Widget_Material3_MaterialDivider = 2132018143;
      public static final int Widget_Material3_MaterialDivider_Heavy = 2132018144;
      public static final int Widget_Material3_MaterialTimePicker = 2132018145;
      public static final int Widget_Material3_MaterialTimePicker_Button = 2132018146;
      public static final int Widget_Material3_MaterialTimePicker_Clock = 2132018147;
      public static final int Widget_Material3_MaterialTimePicker_Display = 2132018148;
      public static final int Widget_Material3_MaterialTimePicker_Display_Divider = 2132018149;
      public static final int Widget_Material3_MaterialTimePicker_Display_HelperText = 2132018150;
      public static final int Widget_Material3_MaterialTimePicker_Display_TextInputEditText = 2132018151;
      public static final int Widget_Material3_MaterialTimePicker_Display_TextInputLayout = 2132018152;
      public static final int Widget_Material3_MaterialTimePicker_ImageButton = 2132018153;
      public static final int Widget_Material3_NavigationRailView = 2132018154;
      public static final int Widget_Material3_NavigationRailView_ActiveIndicator = 2132018155;
      public static final int Widget_Material3_NavigationView = 2132018156;
      public static final int Widget_Material3_PopupMenu = 2132018157;
      public static final int Widget_Material3_PopupMenu_ContextMenu = 2132018158;
      public static final int Widget_Material3_PopupMenu_ListPopupWindow = 2132018159;
      public static final int Widget_Material3_PopupMenu_Overflow = 2132018160;
      public static final int Widget_Material3_SearchBar = 2132018163;
      public static final int Widget_Material3_SearchBar_Outlined = 2132018164;
      public static final int Widget_Material3_SearchView = 2132018165;
      public static final int Widget_Material3_SearchView_Prefix = 2132018166;
      public static final int Widget_Material3_SearchView_Toolbar = 2132018167;
      public static final int Widget_Material3_Search_ActionButton_Overflow = 2132018161;
      public static final int Widget_Material3_Search_Toolbar_Button_Navigation = 2132018162;
      public static final int Widget_Material3_SideSheet = 2132018168;
      public static final int Widget_Material3_SideSheet_Detached = 2132018169;
      public static final int Widget_Material3_SideSheet_Modal = 2132018170;
      public static final int Widget_Material3_SideSheet_Modal_Detached = 2132018171;
      public static final int Widget_Material3_Slider = 2132018172;
      public static final int Widget_Material3_Slider_Label = 2132018173;
      public static final int Widget_Material3_Snackbar = 2132018174;
      public static final int Widget_Material3_Snackbar_FullWidth = 2132018175;
      public static final int Widget_Material3_Snackbar_TextView = 2132018176;
      public static final int Widget_Material3_TabLayout = 2132018177;
      public static final int Widget_Material3_TabLayout_OnSurface = 2132018178;
      public static final int Widget_Material3_TabLayout_Secondary = 2132018179;
      public static final int Widget_Material3_TextInputEditText_FilledBox = 2132018180;
      public static final int Widget_Material3_TextInputEditText_FilledBox_Dense = 2132018181;
      public static final int Widget_Material3_TextInputEditText_OutlinedBox = 2132018182;
      public static final int Widget_Material3_TextInputEditText_OutlinedBox_Dense = 2132018183;
      public static final int Widget_Material3_TextInputLayout_FilledBox = 2132018184;
      public static final int Widget_Material3_TextInputLayout_FilledBox_Dense = 2132018185;
      public static final int Widget_Material3_TextInputLayout_FilledBox_Dense_ExposedDropdownMenu = 2132018186;
      public static final int Widget_Material3_TextInputLayout_FilledBox_ExposedDropdownMenu = 2132018187;
      public static final int Widget_Material3_TextInputLayout_OutlinedBox = 2132018188;
      public static final int Widget_Material3_TextInputLayout_OutlinedBox_Dense = 2132018189;
      public static final int Widget_Material3_TextInputLayout_OutlinedBox_Dense_ExposedDropdownMenu = 2132018190;
      public static final int Widget_Material3_TextInputLayout_OutlinedBox_ExposedDropdownMenu = 2132018191;
      public static final int Widget_Material3_Toolbar = 2132018192;
      public static final int Widget_Material3_Toolbar_OnSurface = 2132018193;
      public static final int Widget_Material3_Toolbar_Surface = 2132018194;
      public static final int Widget_Material3_Tooltip = 2132018195;
      public static final int Widget_MaterialComponents_ActionBar_Primary = 2132018196;
      public static final int Widget_MaterialComponents_ActionBar_PrimarySurface = 2132018197;
      public static final int Widget_MaterialComponents_ActionBar_Solid = 2132018198;
      public static final int Widget_MaterialComponents_ActionBar_Surface = 2132018199;
      public static final int Widget_MaterialComponents_ActionMode = 2132018200;
      public static final int Widget_MaterialComponents_AppBarLayout_Primary = 2132018201;
      public static final int Widget_MaterialComponents_AppBarLayout_PrimarySurface = 2132018202;
      public static final int Widget_MaterialComponents_AppBarLayout_Surface = 2132018203;
      public static final int Widget_MaterialComponents_AutoCompleteTextView_FilledBox = 2132018204;
      public static final int Widget_MaterialComponents_AutoCompleteTextView_FilledBox_Dense = 2132018205;
      public static final int Widget_MaterialComponents_AutoCompleteTextView_OutlinedBox = 2132018206;
      public static final int Widget_MaterialComponents_AutoCompleteTextView_OutlinedBox_Dense = 2132018207;
      public static final int Widget_MaterialComponents_Badge = 2132018208;
      public static final int Widget_MaterialComponents_BottomAppBar = 2132018209;
      public static final int Widget_MaterialComponents_BottomAppBar_Colored = 2132018210;
      public static final int Widget_MaterialComponents_BottomAppBar_PrimarySurface = 2132018211;
      public static final int Widget_MaterialComponents_BottomNavigationView = 2132018212;
      public static final int Widget_MaterialComponents_BottomNavigationView_Colored = 2132018213;
      public static final int Widget_MaterialComponents_BottomNavigationView_PrimarySurface = 2132018214;
      public static final int Widget_MaterialComponents_BottomSheet = 2132018215;
      public static final int Widget_MaterialComponents_BottomSheet_Modal = 2132018216;
      public static final int Widget_MaterialComponents_Button = 2132018217;
      public static final int Widget_MaterialComponents_Button_Icon = 2132018218;
      public static final int Widget_MaterialComponents_Button_OutlinedButton = 2132018219;
      public static final int Widget_MaterialComponents_Button_OutlinedButton_Icon = 2132018220;
      public static final int Widget_MaterialComponents_Button_TextButton = 2132018221;
      public static final int Widget_MaterialComponents_Button_TextButton_Dialog = 2132018222;
      public static final int Widget_MaterialComponents_Button_TextButton_Dialog_Flush = 2132018223;
      public static final int Widget_MaterialComponents_Button_TextButton_Dialog_Icon = 2132018224;
      public static final int Widget_MaterialComponents_Button_TextButton_Icon = 2132018225;
      public static final int Widget_MaterialComponents_Button_TextButton_Snackbar = 2132018226;
      public static final int Widget_MaterialComponents_Button_UnelevatedButton = 2132018227;
      public static final int Widget_MaterialComponents_Button_UnelevatedButton_Icon = 2132018228;
      public static final int Widget_MaterialComponents_CardView = 2132018229;
      public static final int Widget_MaterialComponents_CheckedTextView = 2132018230;
      public static final int Widget_MaterialComponents_ChipGroup = 2132018235;
      public static final int Widget_MaterialComponents_Chip_Action = 2132018231;
      public static final int Widget_MaterialComponents_Chip_Choice = 2132018232;
      public static final int Widget_MaterialComponents_Chip_Entry = 2132018233;
      public static final int Widget_MaterialComponents_Chip_Filter = 2132018234;
      public static final int Widget_MaterialComponents_CircularProgressIndicator = 2132018236;
      public static final int Widget_MaterialComponents_CircularProgressIndicator_ExtraSmall = 2132018237;
      public static final int Widget_MaterialComponents_CircularProgressIndicator_Medium = 2132018238;
      public static final int Widget_MaterialComponents_CircularProgressIndicator_Small = 2132018239;
      public static final int Widget_MaterialComponents_CollapsingToolbar = 2132018240;
      public static final int Widget_MaterialComponents_CompoundButton_CheckBox = 2132018241;
      public static final int Widget_MaterialComponents_CompoundButton_RadioButton = 2132018242;
      public static final int Widget_MaterialComponents_CompoundButton_Switch = 2132018243;
      public static final int Widget_MaterialComponents_ExtendedFloatingActionButton = 2132018244;
      public static final int Widget_MaterialComponents_ExtendedFloatingActionButton_Icon = 2132018245;
      public static final int Widget_MaterialComponents_FloatingActionButton = 2132018246;
      public static final int Widget_MaterialComponents_Light_ActionBar_Solid = 2132018247;
      public static final int Widget_MaterialComponents_LinearProgressIndicator = 2132018248;
      public static final int Widget_MaterialComponents_MaterialButtonToggleGroup = 2132018249;
      public static final int Widget_MaterialComponents_MaterialCalendar = 2132018250;
      public static final int Widget_MaterialComponents_MaterialCalendar_Day = 2132018251;
      public static final int Widget_MaterialComponents_MaterialCalendar_DayOfWeekLabel = 2132018255;
      public static final int Widget_MaterialComponents_MaterialCalendar_DayTextView = 2132018256;
      public static final int Widget_MaterialComponents_MaterialCalendar_Day_Invalid = 2132018252;
      public static final int Widget_MaterialComponents_MaterialCalendar_Day_Selected = 2132018253;
      public static final int Widget_MaterialComponents_MaterialCalendar_Day_Today = 2132018254;
      public static final int Widget_MaterialComponents_MaterialCalendar_Fullscreen = 2132018257;
      public static final int Widget_MaterialComponents_MaterialCalendar_HeaderCancelButton = 2132018258;
      public static final int Widget_MaterialComponents_MaterialCalendar_HeaderConfirmButton = 2132018259;
      public static final int Widget_MaterialComponents_MaterialCalendar_HeaderDivider = 2132018260;
      public static final int Widget_MaterialComponents_MaterialCalendar_HeaderLayout = 2132018261;
      public static final int Widget_MaterialComponents_MaterialCalendar_HeaderLayout_Fullscreen = 2132018262;
      public static final int Widget_MaterialComponents_MaterialCalendar_HeaderSelection = 2132018263;
      public static final int Widget_MaterialComponents_MaterialCalendar_HeaderSelection_Fullscreen = 2132018264;
      public static final int Widget_MaterialComponents_MaterialCalendar_HeaderTitle = 2132018265;
      public static final int Widget_MaterialComponents_MaterialCalendar_HeaderToggleButton = 2132018266;
      public static final int Widget_MaterialComponents_MaterialCalendar_Item = 2132018267;
      public static final int Widget_MaterialComponents_MaterialCalendar_MonthNavigationButton = 2132018268;
      public static final int Widget_MaterialComponents_MaterialCalendar_MonthTextView = 2132018269;
      public static final int Widget_MaterialComponents_MaterialCalendar_Year = 2132018270;
      public static final int Widget_MaterialComponents_MaterialCalendar_YearNavigationButton = 2132018273;
      public static final int Widget_MaterialComponents_MaterialCalendar_Year_Selected = 2132018271;
      public static final int Widget_MaterialComponents_MaterialCalendar_Year_Today = 2132018272;
      public static final int Widget_MaterialComponents_MaterialDivider = 2132018274;
      public static final int Widget_MaterialComponents_NavigationRailView = 2132018275;
      public static final int Widget_MaterialComponents_NavigationRailView_Colored = 2132018276;
      public static final int Widget_MaterialComponents_NavigationRailView_Colored_Compact = 2132018277;
      public static final int Widget_MaterialComponents_NavigationRailView_Compact = 2132018278;
      public static final int Widget_MaterialComponents_NavigationRailView_PrimarySurface = 2132018279;
      public static final int Widget_MaterialComponents_NavigationView = 2132018280;
      public static final int Widget_MaterialComponents_PopupMenu = 2132018281;
      public static final int Widget_MaterialComponents_PopupMenu_ContextMenu = 2132018282;
      public static final int Widget_MaterialComponents_PopupMenu_ListPopupWindow = 2132018283;
      public static final int Widget_MaterialComponents_PopupMenu_Overflow = 2132018284;
      public static final int Widget_MaterialComponents_ProgressIndicator = 2132018285;
      public static final int Widget_MaterialComponents_ShapeableImageView = 2132018286;
      public static final int Widget_MaterialComponents_Slider = 2132018287;
      public static final int Widget_MaterialComponents_Snackbar = 2132018288;
      public static final int Widget_MaterialComponents_Snackbar_FullWidth = 2132018289;
      public static final int Widget_MaterialComponents_Snackbar_TextView = 2132018290;
      public static final int Widget_MaterialComponents_TabLayout = 2132018291;
      public static final int Widget_MaterialComponents_TabLayout_Colored = 2132018292;
      public static final int Widget_MaterialComponents_TabLayout_PrimarySurface = 2132018293;
      public static final int Widget_MaterialComponents_TextInputEditText_FilledBox = 2132018294;
      public static final int Widget_MaterialComponents_TextInputEditText_FilledBox_Dense = 2132018295;
      public static final int Widget_MaterialComponents_TextInputEditText_OutlinedBox = 2132018296;
      public static final int Widget_MaterialComponents_TextInputEditText_OutlinedBox_Dense = 2132018297;
      public static final int Widget_MaterialComponents_TextInputLayout_FilledBox = 2132018298;
      public static final int Widget_MaterialComponents_TextInputLayout_FilledBox_Dense = 2132018299;
      public static final int Widget_MaterialComponents_TextInputLayout_FilledBox_Dense_ExposedDropdownMenu = 2132018300;
      public static final int Widget_MaterialComponents_TextInputLayout_FilledBox_ExposedDropdownMenu = 2132018301;
      public static final int Widget_MaterialComponents_TextInputLayout_OutlinedBox = 2132018302;
      public static final int Widget_MaterialComponents_TextInputLayout_OutlinedBox_Dense = 2132018303;
      public static final int Widget_MaterialComponents_TextInputLayout_OutlinedBox_Dense_ExposedDropdownMenu = 2132018304;
      public static final int Widget_MaterialComponents_TextInputLayout_OutlinedBox_ExposedDropdownMenu = 2132018305;
      public static final int Widget_MaterialComponents_TextView = 2132018306;
      public static final int Widget_MaterialComponents_TimePicker = 2132018307;
      public static final int Widget_MaterialComponents_TimePicker_Button = 2132018308;
      public static final int Widget_MaterialComponents_TimePicker_Clock = 2132018309;
      public static final int Widget_MaterialComponents_TimePicker_Display = 2132018310;
      public static final int Widget_MaterialComponents_TimePicker_Display_Divider = 2132018311;
      public static final int Widget_MaterialComponents_TimePicker_Display_HelperText = 2132018312;
      public static final int Widget_MaterialComponents_TimePicker_Display_TextInputEditText = 2132018313;
      public static final int Widget_MaterialComponents_TimePicker_Display_TextInputLayout = 2132018314;
      public static final int Widget_MaterialComponents_TimePicker_ImageButton = 2132018315;
      public static final int Widget_MaterialComponents_TimePicker_ImageButton_ShapeAppearance = 2132018316;
      public static final int Widget_MaterialComponents_Toolbar = 2132018317;
      public static final int Widget_MaterialComponents_Toolbar_Primary = 2132018318;
      public static final int Widget_MaterialComponents_Toolbar_PrimarySurface = 2132018319;
      public static final int Widget_MaterialComponents_Toolbar_Surface = 2132018320;
      public static final int Widget_MaterialComponents_Tooltip = 2132018321;
      public static final int Widget_Support_CoordinatorLayout = 2132018322;
      public static final int android_native = 2132018323;
      public static final int android_native_small = 2132018324;
      public static final int fastest_list = 2132018325;
      public static final int fastest_list_horizontal = 2132018326;
      public static final int redboxButton = 2132018327;
      public static final int ucrop_ImageViewWidgetIcon = 2132018328;
      public static final int ucrop_TextViewCropAspectRatio = 2132018329;
      public static final int ucrop_TextViewWidget = 2132018330;
      public static final int ucrop_TextViewWidgetText = 2132018331;
      public static final int ucrop_WrapperIconState = 2132018332;
      public static final int ucrop_WrapperRotateButton = 2132018333;

      private style() {
      }
   }

   public static final class styleable {
      public static final int[] ActionBar = new int[]{
         2130968668,
         2130968676,
         2130968677,
         2130968895,
         2130968896,
         2130968897,
         2130968898,
         2130968899,
         2130968900,
         2130968940,
         2130968959,
         2130968960,
         2130968994,
         2130969136,
         2130969144,
         2130969152,
         2130969153,
         2130969158,
         2130969171,
         2130969194,
         2130969322,
         2130969473,
         2130969567,
         2130969578,
         2130969579,
         2130969721,
         2130969725,
         2130969847,
         2130969861
      };
      public static final int[] ActionBarLayout = new int[]{16842931};
      public static final int ActionBarLayout_android_layout_gravity = 0;
      public static final int ActionBar_background = 0;
      public static final int ActionBar_backgroundSplit = 1;
      public static final int ActionBar_backgroundStacked = 2;
      public static final int ActionBar_contentInsetEnd = 3;
      public static final int ActionBar_contentInsetEndWithActions = 4;
      public static final int ActionBar_contentInsetLeft = 5;
      public static final int ActionBar_contentInsetRight = 6;
      public static final int ActionBar_contentInsetStart = 7;
      public static final int ActionBar_contentInsetStartWithNavigation = 8;
      public static final int ActionBar_customNavigationLayout = 9;
      public static final int ActionBar_displayOptions = 10;
      public static final int ActionBar_divider = 11;
      public static final int ActionBar_elevation = 12;
      public static final int ActionBar_height = 13;
      public static final int ActionBar_hideOnContentScroll = 14;
      public static final int ActionBar_homeAsUpIndicator = 15;
      public static final int ActionBar_homeLayout = 16;
      public static final int ActionBar_icon = 17;
      public static final int ActionBar_indeterminateProgressStyle = 18;
      public static final int ActionBar_itemPadding = 19;
      public static final int ActionBar_logo = 20;
      public static final int ActionBar_navigationMode = 21;
      public static final int ActionBar_popupTheme = 22;
      public static final int ActionBar_progressBarPadding = 23;
      public static final int ActionBar_progressBarStyle = 24;
      public static final int ActionBar_subtitle = 25;
      public static final int ActionBar_subtitleTextStyle = 26;
      public static final int ActionBar_title = 27;
      public static final int ActionBar_titleTextStyle = 28;
      public static final int[] ActionMenuItemView = new int[]{16843071};
      public static final int ActionMenuItemView_android_minWidth = 0;
      public static final int[] ActionMenuView = new int[0];
      public static final int[] ActionMode = new int[]{2130968668, 2130968676, 2130968812, 2130969136, 2130969725, 2130969861};
      public static final int ActionMode_background = 0;
      public static final int ActionMode_backgroundSplit = 1;
      public static final int ActionMode_closeItemLayout = 2;
      public static final int ActionMode_height = 3;
      public static final int ActionMode_subtitleTextStyle = 4;
      public static final int ActionMode_titleTextStyle = 5;
      public static final int[] ActivityChooserView = new int[]{2130969022, 2130969177};
      public static final int ActivityChooserView_expandActivityOverflowButtonDrawable = 0;
      public static final int ActivityChooserView_initialActivityCount = 1;
      public static final int[] AlertDialog = new int[]{16842994, 2130968743, 2130968746, 2130969311, 2130969312, 2130969469, 2130969660, 2130969678};
      public static final int AlertDialog_android_layout = 0;
      public static final int AlertDialog_buttonIconDimen = 1;
      public static final int AlertDialog_buttonPanelSideLayout = 2;
      public static final int AlertDialog_listItemLayout = 3;
      public static final int AlertDialog_listLayout = 4;
      public static final int AlertDialog_multiChoiceItemLayout = 5;
      public static final int AlertDialog_showTitle = 6;
      public static final int AlertDialog_singleChoiceItemLayout = 7;
      public static final int[] AlphaMovieView = new int[]{2130968576, 2130968630, 2130968654, 2130969326, 2130969327, 2130969328, 2130969531, 2130969636};
      public static final int AlphaMovieView_accuracy = 0;
      public static final int AlphaMovieView_alphaColor = 1;
      public static final int AlphaMovieView_autoPlayAfterResume = 2;
      public static final int AlphaMovieView_loopEndMs = 3;
      public static final int AlphaMovieView_loopSeekingMethod = 4;
      public static final int AlphaMovieView_loopStartMs = 5;
      public static final int AlphaMovieView_packed = 6;
      public static final int AlphaMovieView_shader = 7;
      public static final int[] AnimatedStateListDrawableCompat = new int[]{16843036, 16843156, 16843157, 16843158, 16843532, 16843533};
      public static final int AnimatedStateListDrawableCompat_android_constantSize = 3;
      public static final int AnimatedStateListDrawableCompat_android_dither = 0;
      public static final int AnimatedStateListDrawableCompat_android_enterFadeDuration = 4;
      public static final int AnimatedStateListDrawableCompat_android_exitFadeDuration = 5;
      public static final int AnimatedStateListDrawableCompat_android_variablePadding = 2;
      public static final int AnimatedStateListDrawableCompat_android_visible = 1;
      public static final int[] AnimatedStateListDrawableItem = new int[]{16842960, 16843161};
      public static final int AnimatedStateListDrawableItem_android_drawable = 1;
      public static final int AnimatedStateListDrawableItem_android_id = 0;
      public static final int[] AnimatedStateListDrawableTransition = new int[]{16843161, 16843849, 16843850, 16843851};
      public static final int AnimatedStateListDrawableTransition_android_drawable = 0;
      public static final int AnimatedStateListDrawableTransition_android_fromId = 2;
      public static final int AnimatedStateListDrawableTransition_android_reversible = 3;
      public static final int AnimatedStateListDrawableTransition_android_toId = 1;
      public static final int[] AppBarLayout = new int[]{16842964, 16843919, 16844096, 2130968994, 2130969023, 2130969300, 2130969301, 2130969302, 2130969711};
      public static final int[] AppBarLayoutStates = new int[]{2130969702, 2130969703, 2130969707, 2130969708};
      public static final int AppBarLayoutStates_state_collapsed = 0;
      public static final int AppBarLayoutStates_state_collapsible = 1;
      public static final int AppBarLayoutStates_state_liftable = 2;
      public static final int AppBarLayoutStates_state_lifted = 3;
      public static final int[] AppBarLayout_Layout = new int[]{2130969296, 2130969297, 2130969298};
      public static final int AppBarLayout_Layout_layout_scrollEffect = 0;
      public static final int AppBarLayout_Layout_layout_scrollFlags = 1;
      public static final int AppBarLayout_Layout_layout_scrollInterpolator = 2;
      public static final int AppBarLayout_android_background = 0;
      public static final int AppBarLayout_android_keyboardNavigationCluster = 2;
      public static final int AppBarLayout_android_touchscreenBlocksFocus = 1;
      public static final int AppBarLayout_elevation = 3;
      public static final int AppBarLayout_expanded = 4;
      public static final int AppBarLayout_liftOnScroll = 5;
      public static final int AppBarLayout_liftOnScrollColor = 6;
      public static final int AppBarLayout_liftOnScrollTargetViewId = 7;
      public static final int AppBarLayout_statusBarForeground = 8;
      public static final int[] AppCompatEmojiHelper = new int[0];
      public static final int[] AppCompatImageView = new int[]{16843033, 2130969691, 2130969844, 2130969845};
      public static final int AppCompatImageView_android_src = 0;
      public static final int AppCompatImageView_srcCompat = 1;
      public static final int AppCompatImageView_tint = 2;
      public static final int AppCompatImageView_tintMode = 3;
      public static final int[] AppCompatSeekBar = new int[]{16843074, 2130969837, 2130969838, 2130969839};
      public static final int AppCompatSeekBar_android_thumb = 0;
      public static final int AppCompatSeekBar_tickMark = 1;
      public static final int AppCompatSeekBar_tickMarkTint = 2;
      public static final int AppCompatSeekBar_tickMarkTintMode = 3;
      public static final int[] AppCompatTextHelper = new int[]{16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667};
      public static final int AppCompatTextHelper_android_drawableBottom = 2;
      public static final int AppCompatTextHelper_android_drawableEnd = 6;
      public static final int AppCompatTextHelper_android_drawableLeft = 3;
      public static final int AppCompatTextHelper_android_drawableRight = 4;
      public static final int AppCompatTextHelper_android_drawableStart = 5;
      public static final int AppCompatTextHelper_android_drawableTop = 1;
      public static final int AppCompatTextHelper_android_textAppearance = 0;
      public static final int[] AppCompatTextView = new int[]{
         16842804,
         2130968656,
         2130968657,
         2130968658,
         2130968659,
         2130968660,
         2130968975,
         2130968976,
         2130968977,
         2130968978,
         2130968980,
         2130968981,
         2130968982,
         2130968983,
         2130968998,
         2130969058,
         2130969104,
         2130969113,
         2130969222,
         2130969304,
         2130969769,
         2130969818
      };
      public static final int AppCompatTextView_android_textAppearance = 0;
      public static final int AppCompatTextView_autoSizeMaxTextSize = 1;
      public static final int AppCompatTextView_autoSizeMinTextSize = 2;
      public static final int AppCompatTextView_autoSizePresetSizes = 3;
      public static final int AppCompatTextView_autoSizeStepGranularity = 4;
      public static final int AppCompatTextView_autoSizeTextType = 5;
      public static final int AppCompatTextView_drawableBottomCompat = 6;
      public static final int AppCompatTextView_drawableEndCompat = 7;
      public static final int AppCompatTextView_drawableLeftCompat = 8;
      public static final int AppCompatTextView_drawableRightCompat = 9;
      public static final int AppCompatTextView_drawableStartCompat = 10;
      public static final int AppCompatTextView_drawableTint = 11;
      public static final int AppCompatTextView_drawableTintMode = 12;
      public static final int AppCompatTextView_drawableTopCompat = 13;
      public static final int AppCompatTextView_emojiCompatEnabled = 14;
      public static final int AppCompatTextView_firstBaselineToTopHeight = 15;
      public static final int AppCompatTextView_fontFamily = 16;
      public static final int AppCompatTextView_fontVariationSettings = 17;
      public static final int AppCompatTextView_lastBaselineToBottomHeight = 18;
      public static final int AppCompatTextView_lineHeight = 19;
      public static final int AppCompatTextView_textAllCaps = 20;
      public static final int AppCompatTextView_textLocale = 21;
      public static final int[] AppCompatTheme = decode_I(
         "57000101ae0001010100047f0200047f0300047f0400047f0500047f0600047f0700047f0800047f0900047f0a00047f0b00047f0c00047f0d00047f0f00047f1000047f1100047f1200047f1300047f1400047f1500047f1600047f1700047f1800047f1900047f1a00047f1b00047f1c00047f1d00047f1e00047f1f00047f2000047f2100047f2500047f2c00047f2d00047f2e00047f2f00047f4600047f8b00047f9f00047fa000047fa100047fa200047fa300047fac00047fad00047fbd00047fc800047ff900047ffa00047ffb00047ffd00047ffe00047fff00047f0001047f1901047f1b01047f3101047f4e01047f7c01047f7d01047f7e01047f8501047f8a01047f9b01047f9c01047f9f01047fa001047fa101047f4002047f5102047fdb02047fdc02047fdd02047fde02047fe102047fe202047fe302047fe402047fe502047fe602047fe702047fe802047fe902047fc403047fc503047fc603047fde03047fe003047fef03047ff103047ff203047ff303047f1e04047f1f04047f2004047f2104047f5804047f5904047f8604047fc004047fc204047fc304047fc404047fc604047fc704047fc804047fc904047fcf04047fd004047f0805047f0905047f0b05047f0c05047f4705047f5005047f5105047f5205047f5305047f5405047f5505047f5605047f5705047f5805047f5905047f"
      );
      public static final int AppCompatTheme_actionBarDivider = 2;
      public static final int AppCompatTheme_actionBarItemBackground = 3;
      public static final int AppCompatTheme_actionBarPopupTheme = 4;
      public static final int AppCompatTheme_actionBarSize = 5;
      public static final int AppCompatTheme_actionBarSplitStyle = 6;
      public static final int AppCompatTheme_actionBarStyle = 7;
      public static final int AppCompatTheme_actionBarTabBarStyle = 8;
      public static final int AppCompatTheme_actionBarTabStyle = 9;
      public static final int AppCompatTheme_actionBarTabTextStyle = 10;
      public static final int AppCompatTheme_actionBarTheme = 11;
      public static final int AppCompatTheme_actionBarWidgetTheme = 12;
      public static final int AppCompatTheme_actionButtonStyle = 13;
      public static final int AppCompatTheme_actionDropDownStyle = 14;
      public static final int AppCompatTheme_actionMenuTextAppearance = 15;
      public static final int AppCompatTheme_actionMenuTextColor = 16;
      public static final int AppCompatTheme_actionModeBackground = 17;
      public static final int AppCompatTheme_actionModeCloseButtonStyle = 18;
      public static final int AppCompatTheme_actionModeCloseContentDescription = 19;
      public static final int AppCompatTheme_actionModeCloseDrawable = 20;
      public static final int AppCompatTheme_actionModeCopyDrawable = 21;
      public static final int AppCompatTheme_actionModeCutDrawable = 22;
      public static final int AppCompatTheme_actionModeFindDrawable = 23;
      public static final int AppCompatTheme_actionModePasteDrawable = 24;
      public static final int AppCompatTheme_actionModePopupWindowStyle = 25;
      public static final int AppCompatTheme_actionModeSelectAllDrawable = 26;
      public static final int AppCompatTheme_actionModeShareDrawable = 27;
      public static final int AppCompatTheme_actionModeSplitBackground = 28;
      public static final int AppCompatTheme_actionModeStyle = 29;
      public static final int AppCompatTheme_actionModeTheme = 30;
      public static final int AppCompatTheme_actionModeWebSearchDrawable = 31;
      public static final int AppCompatTheme_actionOverflowButtonStyle = 32;
      public static final int AppCompatTheme_actionOverflowMenuStyle = 33;
      public static final int AppCompatTheme_activityChooserViewStyle = 34;
      public static final int AppCompatTheme_alertDialogButtonGroupStyle = 35;
      public static final int AppCompatTheme_alertDialogCenterButtons = 36;
      public static final int AppCompatTheme_alertDialogStyle = 37;
      public static final int AppCompatTheme_alertDialogTheme = 38;
      public static final int AppCompatTheme_android_windowAnimationStyle = 1;
      public static final int AppCompatTheme_android_windowIsFloating = 0;
      public static final int AppCompatTheme_autoCompleteTextViewStyle = 39;
      public static final int AppCompatTheme_borderlessButtonStyle = 40;
      public static final int AppCompatTheme_buttonBarButtonStyle = 41;
      public static final int AppCompatTheme_buttonBarNegativeButtonStyle = 42;
      public static final int AppCompatTheme_buttonBarNeutralButtonStyle = 43;
      public static final int AppCompatTheme_buttonBarPositiveButtonStyle = 44;
      public static final int AppCompatTheme_buttonBarStyle = 45;
      public static final int AppCompatTheme_buttonStyle = 46;
      public static final int AppCompatTheme_buttonStyleSmall = 47;
      public static final int AppCompatTheme_checkboxStyle = 48;
      public static final int AppCompatTheme_checkedTextViewStyle = 49;
      public static final int AppCompatTheme_colorAccent = 50;
      public static final int AppCompatTheme_colorBackgroundFloating = 51;
      public static final int AppCompatTheme_colorButtonNormal = 52;
      public static final int AppCompatTheme_colorControlActivated = 53;
      public static final int AppCompatTheme_colorControlHighlight = 54;
      public static final int AppCompatTheme_colorControlNormal = 55;
      public static final int AppCompatTheme_colorError = 56;
      public static final int AppCompatTheme_colorPrimary = 57;
      public static final int AppCompatTheme_colorPrimaryDark = 58;
      public static final int AppCompatTheme_colorSwitchThumbNormal = 59;
      public static final int AppCompatTheme_controlBackground = 60;
      public static final int AppCompatTheme_dialogCornerRadius = 61;
      public static final int AppCompatTheme_dialogPreferredPadding = 62;
      public static final int AppCompatTheme_dialogTheme = 63;
      public static final int AppCompatTheme_dividerHorizontal = 64;
      public static final int AppCompatTheme_dividerVertical = 65;
      public static final int AppCompatTheme_dropDownListViewStyle = 66;
      public static final int AppCompatTheme_dropdownListPreferredItemHeight = 67;
      public static final int AppCompatTheme_editTextBackground = 68;
      public static final int AppCompatTheme_editTextColor = 69;
      public static final int AppCompatTheme_editTextStyle = 70;
      public static final int AppCompatTheme_homeAsUpIndicator = 71;
      public static final int AppCompatTheme_imageButtonStyle = 72;
      public static final int AppCompatTheme_listChoiceBackgroundIndicator = 73;
      public static final int AppCompatTheme_listChoiceIndicatorMultipleAnimated = 74;
      public static final int AppCompatTheme_listChoiceIndicatorSingleAnimated = 75;
      public static final int AppCompatTheme_listDividerAlertDialog = 76;
      public static final int AppCompatTheme_listMenuViewStyle = 77;
      public static final int AppCompatTheme_listPopupWindowStyle = 78;
      public static final int AppCompatTheme_listPreferredItemHeight = 79;
      public static final int AppCompatTheme_listPreferredItemHeightLarge = 80;
      public static final int AppCompatTheme_listPreferredItemHeightSmall = 81;
      public static final int AppCompatTheme_listPreferredItemPaddingEnd = 82;
      public static final int AppCompatTheme_listPreferredItemPaddingLeft = 83;
      public static final int AppCompatTheme_listPreferredItemPaddingRight = 84;
      public static final int AppCompatTheme_listPreferredItemPaddingStart = 85;
      public static final int AppCompatTheme_panelBackground = 86;
      public static final int AppCompatTheme_panelMenuListTheme = 87;
      public static final int AppCompatTheme_panelMenuListWidth = 88;
      public static final int AppCompatTheme_popupMenuStyle = 89;
      public static final int AppCompatTheme_popupWindowStyle = 90;
      public static final int AppCompatTheme_radioButtonStyle = 91;
      public static final int AppCompatTheme_ratingBarStyle = 92;
      public static final int AppCompatTheme_ratingBarStyleIndicator = 93;
      public static final int AppCompatTheme_ratingBarStyleSmall = 94;
      public static final int AppCompatTheme_searchViewStyle = 95;
      public static final int AppCompatTheme_seekBarStyle = 96;
      public static final int AppCompatTheme_selectableItemBackground = 97;
      public static final int AppCompatTheme_selectableItemBackgroundBorderless = 98;
      public static final int AppCompatTheme_spinnerDropDownItemStyle = 99;
      public static final int AppCompatTheme_spinnerStyle = 100;
      public static final int AppCompatTheme_switchStyle = 101;
      public static final int AppCompatTheme_textAppearanceLargePopupMenu = 102;
      public static final int AppCompatTheme_textAppearanceListItem = 103;
      public static final int AppCompatTheme_textAppearanceListItemSecondary = 104;
      public static final int AppCompatTheme_textAppearanceListItemSmall = 105;
      public static final int AppCompatTheme_textAppearancePopupMenuHeader = 106;
      public static final int AppCompatTheme_textAppearanceSearchResultSubtitle = 107;
      public static final int AppCompatTheme_textAppearanceSearchResultTitle = 108;
      public static final int AppCompatTheme_textAppearanceSmallPopupMenu = 109;
      public static final int AppCompatTheme_textColorAlertDialogListItem = 110;
      public static final int AppCompatTheme_textColorSearchUrl = 111;
      public static final int AppCompatTheme_toolbarNavigationButtonStyle = 112;
      public static final int AppCompatTheme_toolbarStyle = 113;
      public static final int AppCompatTheme_tooltipForegroundColor = 114;
      public static final int AppCompatTheme_tooltipFrameBackground = 115;
      public static final int AppCompatTheme_viewInflaterClass = 116;
      public static final int AppCompatTheme_windowActionBar = 117;
      public static final int AppCompatTheme_windowActionBarOverlay = 118;
      public static final int AppCompatTheme_windowActionModeOverlay = 119;
      public static final int AppCompatTheme_windowFixedHeightMajor = 120;
      public static final int AppCompatTheme_windowFixedHeightMinor = 121;
      public static final int AppCompatTheme_windowFixedWidthMajor = 122;
      public static final int AppCompatTheme_windowFixedWidthMinor = 123;
      public static final int AppCompatTheme_windowMinWidthMajor = 124;
      public static final int AppCompatTheme_windowMinWidthMinor = 125;
      public static final int AppCompatTheme_windowNoTitle = 126;
      public static final int[] AspectRatioFrameLayout = new int[]{2130969595};
      public static final int AspectRatioFrameLayout_resize_mode = 0;
      public static final int[] Autofill_InlineSuggestion = new int[]{2130968663, 2130968664, 2130968665, 2130968666, 2130968667, 2130969179};
      public static final int Autofill_InlineSuggestion_autofillInlineSuggestionChip = 0;
      public static final int Autofill_InlineSuggestion_autofillInlineSuggestionEndIconStyle = 1;
      public static final int Autofill_InlineSuggestion_autofillInlineSuggestionStartIconStyle = 2;
      public static final int Autofill_InlineSuggestion_autofillInlineSuggestionSubtitle = 3;
      public static final int Autofill_InlineSuggestion_autofillInlineSuggestionTitle = 4;
      public static final int Autofill_InlineSuggestion_isAutofillInlineSuggestionTheme = 5;
      public static final int[] Badge = new int[]{
         2130968669,
         2130968680,
         2130968681,
         2130968682,
         2130968683,
         2130968684,
         2130968686,
         2130968687,
         2130968688,
         2130968689,
         2130968690,
         2130968691,
         2130968692,
         2130968693,
         2130968694,
         2130969154,
         2130969155,
         2130969405,
         2130969507,
         2130969517,
         2130969923,
         2130969924
      };
      public static final int Badge_backgroundColor = 0;
      public static final int Badge_badgeGravity = 1;
      public static final int Badge_badgeHeight = 2;
      public static final int Badge_badgeRadius = 3;
      public static final int Badge_badgeShapeAppearance = 4;
      public static final int Badge_badgeShapeAppearanceOverlay = 5;
      public static final int Badge_badgeTextAppearance = 6;
      public static final int Badge_badgeTextColor = 7;
      public static final int Badge_badgeWidePadding = 8;
      public static final int Badge_badgeWidth = 9;
      public static final int Badge_badgeWithTextHeight = 10;
      public static final int Badge_badgeWithTextRadius = 11;
      public static final int Badge_badgeWithTextShapeAppearance = 12;
      public static final int Badge_badgeWithTextShapeAppearanceOverlay = 13;
      public static final int Badge_badgeWithTextWidth = 14;
      public static final int Badge_horizontalOffset = 15;
      public static final int Badge_horizontalOffsetWithText = 16;
      public static final int Badge_maxCharacterCount = 17;
      public static final int Badge_number = 18;
      public static final int Badge_offsetAlignmentMode = 19;
      public static final int Badge_verticalOffset = 20;
      public static final int Badge_verticalOffsetWithText = 21;
      public static final int[] BaseProgressIndicator = new int[]{
         16843065, 2130969141, 2130969172, 2130969419, 2130969650, 2130969652, 2130969877, 2130969880, 2130969885
      };
      public static final int BaseProgressIndicator_android_indeterminate = 0;
      public static final int BaseProgressIndicator_hideAnimationBehavior = 1;
      public static final int BaseProgressIndicator_indicatorColor = 2;
      public static final int BaseProgressIndicator_minHideDelay = 3;
      public static final int BaseProgressIndicator_showAnimationBehavior = 4;
      public static final int BaseProgressIndicator_showDelay = 5;
      public static final int BaseProgressIndicator_trackColor = 6;
      public static final int BaseProgressIndicator_trackCornerRadius = 7;
      public static final int BaseProgressIndicator_trackThickness = 8;
      public static final int[] BlurView = new int[]{2130968713};
      public static final int BlurView_blurOverlayColor = 0;
      public static final int[] BottomAppBar = new int[]{
         2130968619,
         2130968678,
         2130968994,
         2130969041,
         2130969042,
         2130969043,
         2130969044,
         2130969045,
         2130969046,
         2130969047,
         2130969145,
         2130969416,
         2130969472,
         2130969533,
         2130969535,
         2130969536,
         2130969593
      };
      public static final int BottomAppBar_addElevationShadow = 0;
      public static final int BottomAppBar_backgroundTint = 1;
      public static final int BottomAppBar_elevation = 2;
      public static final int BottomAppBar_fabAlignmentMode = 3;
      public static final int BottomAppBar_fabAlignmentModeEndMargin = 4;
      public static final int BottomAppBar_fabAnchorMode = 5;
      public static final int BottomAppBar_fabAnimationMode = 6;
      public static final int BottomAppBar_fabCradleMargin = 7;
      public static final int BottomAppBar_fabCradleRoundedCornerRadius = 8;
      public static final int BottomAppBar_fabCradleVerticalOffset = 9;
      public static final int BottomAppBar_hideOnScroll = 10;
      public static final int BottomAppBar_menuAlignmentMode = 11;
      public static final int BottomAppBar_navigationIconTint = 12;
      public static final int BottomAppBar_paddingBottomSystemWindowInsets = 13;
      public static final int BottomAppBar_paddingLeftSystemWindowInsets = 14;
      public static final int BottomAppBar_paddingRightSystemWindowInsets = 15;
      public static final int BottomAppBar_removeEmbeddedFabElevation = 16;
      public static final int[] BottomNavigationView = new int[]{16843072, 2130968887, 2130969188};
      public static final int BottomNavigationView_android_minHeight = 0;
      public static final int BottomNavigationView_compatShadowEnabled = 1;
      public static final int BottomNavigationView_itemHorizontalTranslationEnabled = 2;
      public static final int[] BottomSheetBehavior_Layout = new int[]{
         16843039,
         16843040,
         16843840,
         2130968678,
         2130968703,
         2130968704,
         2130968705,
         2130968706,
         2130968707,
         2130968709,
         2130968710,
         2130968711,
         2130968712,
         2130969130,
         2130969352,
         2130969353,
         2130969354,
         2130969533,
         2130969535,
         2130969536,
         2130969539,
         2130969637,
         2130969645,
         2130969649
      };
      public static final int BottomSheetBehavior_Layout_android_elevation = 2;
      public static final int BottomSheetBehavior_Layout_android_maxHeight = 1;
      public static final int BottomSheetBehavior_Layout_android_maxWidth = 0;
      public static final int BottomSheetBehavior_Layout_backgroundTint = 3;
      public static final int BottomSheetBehavior_Layout_behavior_draggable = 4;
      public static final int BottomSheetBehavior_Layout_behavior_expandedOffset = 5;
      public static final int BottomSheetBehavior_Layout_behavior_fitToContents = 6;
      public static final int BottomSheetBehavior_Layout_behavior_halfExpandedRatio = 7;
      public static final int BottomSheetBehavior_Layout_behavior_hideable = 8;
      public static final int BottomSheetBehavior_Layout_behavior_peekHeight = 9;
      public static final int BottomSheetBehavior_Layout_behavior_saveFlags = 10;
      public static final int BottomSheetBehavior_Layout_behavior_significantVelocityThreshold = 11;
      public static final int BottomSheetBehavior_Layout_behavior_skipCollapsed = 12;
      public static final int BottomSheetBehavior_Layout_gestureInsetBottomIgnored = 13;
      public static final int BottomSheetBehavior_Layout_marginLeftSystemWindowInsets = 14;
      public static final int BottomSheetBehavior_Layout_marginRightSystemWindowInsets = 15;
      public static final int BottomSheetBehavior_Layout_marginTopSystemWindowInsets = 16;
      public static final int BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets = 17;
      public static final int BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets = 18;
      public static final int BottomSheetBehavior_Layout_paddingRightSystemWindowInsets = 19;
      public static final int BottomSheetBehavior_Layout_paddingTopSystemWindowInsets = 20;
      public static final int BottomSheetBehavior_Layout_shapeAppearance = 21;
      public static final int BottomSheetBehavior_Layout_shapeAppearanceOverlay = 22;
      public static final int BottomSheetBehavior_Layout_shouldRemoveExpandedCorners = 23;
      public static final int[] ButtonBarLayout = new int[]{2130968628};
      public static final int ButtonBarLayout_allowStacking = 0;
      public static final int[] Capability = new int[]{2130969582, 2130969648};
      public static final int Capability_queryPatterns = 0;
      public static final int Capability_shortcutMatchRequired = 1;
      public static final int[] CardView = new int[]{
         16843071, 16843072, 2130968752, 2130968753, 2130968754, 2130968756, 2130968757, 2130968758, 2130968901, 2130968902, 2130968904, 2130968905, 2130968907
      };
      public static final int CardView_android_minHeight = 1;
      public static final int CardView_android_minWidth = 0;
      public static final int CardView_cardBackgroundColor = 2;
      public static final int CardView_cardCornerRadius = 3;
      public static final int CardView_cardElevation = 4;
      public static final int CardView_cardMaxElevation = 5;
      public static final int CardView_cardPreventCornerOverlap = 6;
      public static final int CardView_cardUseCompatPadding = 7;
      public static final int CardView_contentPadding = 8;
      public static final int CardView_contentPaddingBottom = 9;
      public static final int CardView_contentPaddingLeft = 10;
      public static final int CardView_contentPaddingRight = 11;
      public static final int CardView_contentPaddingTop = 12;
      public static final int[] CheckedTextView = new int[]{16843016, 2130968762, 2130968763, 2130968764};
      public static final int CheckedTextView_android_checkMark = 0;
      public static final int CheckedTextView_checkMarkCompat = 1;
      public static final int CheckedTextView_checkMarkTint = 2;
      public static final int CheckedTextView_checkMarkTintMode = 3;
      public static final int[] Chip = new int[]{
         16842804,
         16842901,
         16842904,
         16842923,
         16843039,
         16843087,
         16843237,
         2130968768,
         2130968769,
         2130968773,
         2130968774,
         2130968777,
         2130968778,
         2130968779,
         2130968781,
         2130968782,
         2130968783,
         2130968784,
         2130968785,
         2130968786,
         2130968787,
         2130968792,
         2130968793,
         2130968794,
         2130968796,
         2130968805,
         2130968806,
         2130968807,
         2130968808,
         2130968809,
         2130968810,
         2130968811,
         2130969011,
         2130969142,
         2130969159,
         2130969163,
         2130969599,
         2130969637,
         2130969645,
         2130969657,
         2130969809,
         2130969819
      };
      public static final int[] ChipGroup = new int[]{2130968767, 2130968788, 2130968789, 2130968790, 2130969634, 2130969679, 2130969680};
      public static final int ChipGroup_checkedChip = 0;
      public static final int ChipGroup_chipSpacing = 1;
      public static final int ChipGroup_chipSpacingHorizontal = 2;
      public static final int ChipGroup_chipSpacingVertical = 3;
      public static final int ChipGroup_selectionRequired = 4;
      public static final int ChipGroup_singleLine = 5;
      public static final int ChipGroup_singleSelection = 6;
      public static final int Chip_android_checkable = 6;
      public static final int Chip_android_ellipsize = 3;
      public static final int Chip_android_maxWidth = 4;
      public static final int Chip_android_text = 5;
      public static final int Chip_android_textAppearance = 0;
      public static final int Chip_android_textColor = 2;
      public static final int Chip_android_textSize = 1;
      public static final int Chip_checkedIcon = 7;
      public static final int Chip_checkedIconEnabled = 8;
      public static final int Chip_checkedIconTint = 9;
      public static final int Chip_checkedIconVisible = 10;
      public static final int Chip_chipBackgroundColor = 11;
      public static final int Chip_chipCornerRadius = 12;
      public static final int Chip_chipEndPadding = 13;
      public static final int Chip_chipIcon = 14;
      public static final int Chip_chipIconEnabled = 15;
      public static final int Chip_chipIconSize = 16;
      public static final int Chip_chipIconTint = 17;
      public static final int Chip_chipIconVisible = 18;
      public static final int Chip_chipMinHeight = 19;
      public static final int Chip_chipMinTouchTargetSize = 20;
      public static final int Chip_chipStartPadding = 21;
      public static final int Chip_chipStrokeColor = 22;
      public static final int Chip_chipStrokeWidth = 23;
      public static final int Chip_chipSurfaceColor = 24;
      public static final int Chip_closeIcon = 25;
      public static final int Chip_closeIconEnabled = 26;
      public static final int Chip_closeIconEndPadding = 27;
      public static final int Chip_closeIconSize = 28;
      public static final int Chip_closeIconStartPadding = 29;
      public static final int Chip_closeIconTint = 30;
      public static final int Chip_closeIconVisible = 31;
      public static final int Chip_ensureMinTouchTargetSize = 32;
      public static final int Chip_hideMotionSpec = 33;
      public static final int Chip_iconEndPadding = 34;
      public static final int Chip_iconStartPadding = 35;
      public static final int Chip_rippleColor = 36;
      public static final int Chip_shapeAppearance = 37;
      public static final int Chip_shapeAppearanceOverlay = 38;
      public static final int Chip_showMotionSpec = 39;
      public static final int Chip_textEndPadding = 40;
      public static final int Chip_textStartPadding = 41;
      public static final int[] CircularProgressIndicator = new int[]{2130969173, 2130969175, 2130969176};
      public static final int CircularProgressIndicator_indicatorDirectionCircular = 0;
      public static final int CircularProgressIndicator_indicatorInset = 1;
      public static final int CircularProgressIndicator_indicatorSize = 2;
      public static final int[] ClockFaceView = new int[]{2130968801, 2130968804};
      public static final int ClockFaceView_clockFaceBackgroundColor = 0;
      public static final int ClockFaceView_clockNumberTextColor = 1;
      public static final int[] ClockHandView = new int[]{2130968802, 2130969385, 2130969635};
      public static final int ClockHandView_clockHandColor = 0;
      public static final int ClockHandView_materialCircleRadius = 1;
      public static final int ClockHandView_selectorSize = 2;
      public static final int[] CodeScannerView = new int[]{
         2130968647,
         2130968648,
         2130968649,
         2130968650,
         2130968651,
         2130968652,
         2130968653,
         2130969059,
         2130969060,
         2130969061,
         2130969062,
         2130969063,
         2130969064,
         2130969065,
         2130969118,
         2130969119,
         2130969120,
         2130969121,
         2130969122,
         2130969123,
         2130969125,
         2130969126,
         2130969127,
         2130969128,
         2130969355,
         2130969356
      };
      public static final int CodeScannerView_autoFocusButtonColor = 0;
      public static final int CodeScannerView_autoFocusButtonOffIcon = 1;
      public static final int CodeScannerView_autoFocusButtonOnIcon = 2;
      public static final int CodeScannerView_autoFocusButtonPaddingHorizontal = 3;
      public static final int CodeScannerView_autoFocusButtonPaddingVertical = 4;
      public static final int CodeScannerView_autoFocusButtonPosition = 5;
      public static final int CodeScannerView_autoFocusButtonVisible = 6;
      public static final int CodeScannerView_flashButtonColor = 7;
      public static final int CodeScannerView_flashButtonOffIcon = 8;
      public static final int CodeScannerView_flashButtonOnIcon = 9;
      public static final int CodeScannerView_flashButtonPaddingHorizontal = 10;
      public static final int CodeScannerView_flashButtonPaddingVertical = 11;
      public static final int CodeScannerView_flashButtonPosition = 12;
      public static final int CodeScannerView_flashButtonVisible = 13;
      public static final int CodeScannerView_frameAspectRatioHeight = 14;
      public static final int CodeScannerView_frameAspectRatioWidth = 15;
      public static final int CodeScannerView_frameColor = 16;
      public static final int CodeScannerView_frameCornersCapRounded = 17;
      public static final int CodeScannerView_frameCornersRadius = 18;
      public static final int CodeScannerView_frameCornersSize = 19;
      public static final int CodeScannerView_frameSize = 20;
      public static final int CodeScannerView_frameThickness = 21;
      public static final int CodeScannerView_frameVerticalBias = 22;
      public static final int CodeScannerView_frameVisible = 23;
      public static final int CodeScannerView_maskColor = 24;
      public static final int CodeScannerView_maskVisible = 25;
      public static final int[] CollapsingToolbarLayout = new int[]{
         2130968816,
         2130968817,
         2130968818,
         2130968908,
         2130969025,
         2130969026,
         2130969027,
         2130969028,
         2130969029,
         2130969030,
         2130969031,
         2130969032,
         2130969040,
         2130969115,
         2130969409,
         2130969618,
         2130969620,
         2130969712,
         2130969847,
         2130969849,
         2130969850,
         2130969857,
         2130969860,
         2130969863
      };
      public static final int[] CollapsingToolbarLayout_Layout = new int[]{2130969232, 2130969233};
      public static final int CollapsingToolbarLayout_Layout_layout_collapseMode = 0;
      public static final int CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier = 1;
      public static final int CollapsingToolbarLayout_collapsedTitleGravity = 0;
      public static final int CollapsingToolbarLayout_collapsedTitleTextAppearance = 1;
      public static final int CollapsingToolbarLayout_collapsedTitleTextColor = 2;
      public static final int CollapsingToolbarLayout_contentScrim = 3;
      public static final int CollapsingToolbarLayout_expandedTitleGravity = 4;
      public static final int CollapsingToolbarLayout_expandedTitleMargin = 5;
      public static final int CollapsingToolbarLayout_expandedTitleMarginBottom = 6;
      public static final int CollapsingToolbarLayout_expandedTitleMarginEnd = 7;
      public static final int CollapsingToolbarLayout_expandedTitleMarginStart = 8;
      public static final int CollapsingToolbarLayout_expandedTitleMarginTop = 9;
      public static final int CollapsingToolbarLayout_expandedTitleTextAppearance = 10;
      public static final int CollapsingToolbarLayout_expandedTitleTextColor = 11;
      public static final int CollapsingToolbarLayout_extraMultilineHeightEnabled = 12;
      public static final int CollapsingToolbarLayout_forceApplySystemWindowInsetTop = 13;
      public static final int CollapsingToolbarLayout_maxLines = 14;
      public static final int CollapsingToolbarLayout_scrimAnimationDuration = 15;
      public static final int CollapsingToolbarLayout_scrimVisibleHeightTrigger = 16;
      public static final int CollapsingToolbarLayout_statusBarScrim = 17;
      public static final int CollapsingToolbarLayout_title = 18;
      public static final int CollapsingToolbarLayout_titleCollapseMode = 19;
      public static final int CollapsingToolbarLayout_titleEnabled = 20;
      public static final int CollapsingToolbarLayout_titlePositionInterpolator = 21;
      public static final int CollapsingToolbarLayout_titleTextEllipsize = 22;
      public static final int CollapsingToolbarLayout_toolbarId = 23;
      public static final int[] ColorStateListItem = new int[]{16843173, 16843551, 16844359, 2130968629, 2130969218};
      public static final int ColorStateListItem_alpha = 3;
      public static final int ColorStateListItem_android_alpha = 1;
      public static final int ColorStateListItem_android_color = 0;
      public static final int ColorStateListItem_android_lStar = 2;
      public static final int ColorStateListItem_lStar = 4;
      public static final int[] CompoundButton = new int[]{16843015, 2130968740, 2130968750, 2130968751};
      public static final int CompoundButton_android_button = 0;
      public static final int CompoundButton_buttonCompat = 1;
      public static final int CompoundButton_buttonTint = 2;
      public static final int CompoundButton_buttonTintMode = 3;
      public static final int[] Constraint = new int[]{
         16842948,
         16842960,
         16842972,
         16842996,
         16842997,
         16842999,
         16843000,
         16843001,
         16843002,
         16843039,
         16843040,
         16843071,
         16843072,
         16843551,
         16843552,
         16843553,
         16843554,
         16843555,
         16843556,
         16843557,
         16843558,
         16843559,
         16843560,
         16843701,
         16843702,
         16843770,
         16843840,
         2130968635,
         2130968698,
         2130968699,
         2130968700,
         2130968761,
         2130968891,
         2130968974,
         2130969084,
         2130969085,
         2130969086,
         2130969087,
         2130969088,
         2130969089,
         2130969090,
         2130969091,
         2130969092,
         2130969093,
         2130969094,
         2130969095,
         2130969096,
         2130969098,
         2130969099,
         2130969100,
         2130969101,
         2130969102,
         2130969234,
         2130969235,
         2130969236,
         2130969237,
         2130969238,
         2130969239,
         2130969240,
         2130969241,
         2130969242,
         2130969243,
         2130969244,
         2130969245,
         2130969246,
         2130969247,
         2130969248,
         2130969249,
         2130969250,
         2130969251,
         2130969252,
         2130969253,
         2130969254,
         2130969255,
         2130969256,
         2130969257,
         2130969258,
         2130969259,
         2130969260,
         2130969261,
         2130969262,
         2130969263,
         2130969264,
         2130969265,
         2130969266,
         2130969267,
         2130969268,
         2130969269,
         2130969270,
         2130969271,
         2130969272,
         2130969273,
         2130969274,
         2130969275,
         2130969277,
         2130969278,
         2130969282,
         2130969283,
         2130969284,
         2130969285,
         2130969286,
         2130969287,
         2130969463,
         2130969464,
         2130969548,
         2130969555,
         2130969891,
         2130969893,
         2130969928
      };
      public static final int[] ConstraintLayout_Layout = new int[]{
         16842948,
         16842965,
         16842966,
         16842967,
         16842968,
         16842969,
         16842972,
         16843039,
         16843040,
         16843071,
         16843072,
         16843699,
         16843700,
         16843840,
         2130968698,
         2130968699,
         2130968700,
         2130968761,
         2130968888,
         2130968891,
         2130969084,
         2130969085,
         2130969086,
         2130969087,
         2130969088,
         2130969089,
         2130969090,
         2130969091,
         2130969092,
         2130969093,
         2130969094,
         2130969095,
         2130969096,
         2130969098,
         2130969099,
         2130969100,
         2130969101,
         2130969102,
         2130969225,
         2130969234,
         2130969235,
         2130969236,
         2130969237,
         2130969238,
         2130969239,
         2130969240,
         2130969241,
         2130969242,
         2130969243,
         2130969244,
         2130969245,
         2130969246,
         2130969247,
         2130969248,
         2130969249,
         2130969250,
         2130969251,
         2130969252,
         2130969253,
         2130969254,
         2130969255,
         2130969256,
         2130969257,
         2130969258,
         2130969259,
         2130969260,
         2130969261,
         2130969262,
         2130969263,
         2130969264,
         2130969265,
         2130969266,
         2130969267,
         2130969268,
         2130969269,
         2130969270,
         2130969271,
         2130969272,
         2130969273,
         2130969274,
         2130969275,
         2130969277,
         2130969278,
         2130969282,
         2130969283,
         2130969284,
         2130969285,
         2130969286,
         2130969287,
         2130969294
      };
      public static final int ConstraintLayout_Layout_android_elevation = 13;
      public static final int ConstraintLayout_Layout_android_maxHeight = 8;
      public static final int ConstraintLayout_Layout_android_maxWidth = 7;
      public static final int ConstraintLayout_Layout_android_minHeight = 10;
      public static final int ConstraintLayout_Layout_android_minWidth = 9;
      public static final int ConstraintLayout_Layout_android_orientation = 0;
      public static final int ConstraintLayout_Layout_android_padding = 1;
      public static final int ConstraintLayout_Layout_android_paddingBottom = 5;
      public static final int ConstraintLayout_Layout_android_paddingEnd = 12;
      public static final int ConstraintLayout_Layout_android_paddingLeft = 2;
      public static final int ConstraintLayout_Layout_android_paddingRight = 4;
      public static final int ConstraintLayout_Layout_android_paddingStart = 11;
      public static final int ConstraintLayout_Layout_android_paddingTop = 3;
      public static final int ConstraintLayout_Layout_android_visibility = 6;
      public static final int ConstraintLayout_Layout_barrierAllowsGoneWidgets = 14;
      public static final int ConstraintLayout_Layout_barrierDirection = 15;
      public static final int ConstraintLayout_Layout_barrierMargin = 16;
      public static final int ConstraintLayout_Layout_chainUseRtl = 17;
      public static final int ConstraintLayout_Layout_constraintSet = 18;
      public static final int ConstraintLayout_Layout_constraint_referenced_ids = 19;
      public static final int ConstraintLayout_Layout_flow_firstHorizontalBias = 20;
      public static final int ConstraintLayout_Layout_flow_firstHorizontalStyle = 21;
      public static final int ConstraintLayout_Layout_flow_firstVerticalBias = 22;
      public static final int ConstraintLayout_Layout_flow_firstVerticalStyle = 23;
      public static final int ConstraintLayout_Layout_flow_horizontalAlign = 24;
      public static final int ConstraintLayout_Layout_flow_horizontalBias = 25;
      public static final int ConstraintLayout_Layout_flow_horizontalGap = 26;
      public static final int ConstraintLayout_Layout_flow_horizontalStyle = 27;
      public static final int ConstraintLayout_Layout_flow_lastHorizontalBias = 28;
      public static final int ConstraintLayout_Layout_flow_lastHorizontalStyle = 29;
      public static final int ConstraintLayout_Layout_flow_lastVerticalBias = 30;
      public static final int ConstraintLayout_Layout_flow_lastVerticalStyle = 31;
      public static final int ConstraintLayout_Layout_flow_maxElementsWrap = 32;
      public static final int ConstraintLayout_Layout_flow_verticalAlign = 33;
      public static final int ConstraintLayout_Layout_flow_verticalBias = 34;
      public static final int ConstraintLayout_Layout_flow_verticalGap = 35;
      public static final int ConstraintLayout_Layout_flow_verticalStyle = 36;
      public static final int ConstraintLayout_Layout_flow_wrapMode = 37;
      public static final int ConstraintLayout_Layout_layoutDescription = 38;
      public static final int ConstraintLayout_Layout_layout_constrainedHeight = 39;
      public static final int ConstraintLayout_Layout_layout_constrainedWidth = 40;
      public static final int ConstraintLayout_Layout_layout_constraintBaseline_creator = 41;
      public static final int ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf = 42;
      public static final int ConstraintLayout_Layout_layout_constraintBottom_creator = 43;
      public static final int ConstraintLayout_Layout_layout_constraintBottom_toBottomOf = 44;
      public static final int ConstraintLayout_Layout_layout_constraintBottom_toTopOf = 45;
      public static final int ConstraintLayout_Layout_layout_constraintCircle = 46;
      public static final int ConstraintLayout_Layout_layout_constraintCircleAngle = 47;
      public static final int ConstraintLayout_Layout_layout_constraintCircleRadius = 48;
      public static final int ConstraintLayout_Layout_layout_constraintDimensionRatio = 49;
      public static final int ConstraintLayout_Layout_layout_constraintEnd_toEndOf = 50;
      public static final int ConstraintLayout_Layout_layout_constraintEnd_toStartOf = 51;
      public static final int ConstraintLayout_Layout_layout_constraintGuide_begin = 52;
      public static final int ConstraintLayout_Layout_layout_constraintGuide_end = 53;
      public static final int ConstraintLayout_Layout_layout_constraintGuide_percent = 54;
      public static final int ConstraintLayout_Layout_layout_constraintHeight_default = 55;
      public static final int ConstraintLayout_Layout_layout_constraintHeight_max = 56;
      public static final int ConstraintLayout_Layout_layout_constraintHeight_min = 57;
      public static final int ConstraintLayout_Layout_layout_constraintHeight_percent = 58;
      public static final int ConstraintLayout_Layout_layout_constraintHorizontal_bias = 59;
      public static final int ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle = 60;
      public static final int ConstraintLayout_Layout_layout_constraintHorizontal_weight = 61;
      public static final int ConstraintLayout_Layout_layout_constraintLeft_creator = 62;
      public static final int ConstraintLayout_Layout_layout_constraintLeft_toLeftOf = 63;
      public static final int ConstraintLayout_Layout_layout_constraintLeft_toRightOf = 64;
      public static final int ConstraintLayout_Layout_layout_constraintRight_creator = 65;
      public static final int ConstraintLayout_Layout_layout_constraintRight_toLeftOf = 66;
      public static final int ConstraintLayout_Layout_layout_constraintRight_toRightOf = 67;
      public static final int ConstraintLayout_Layout_layout_constraintStart_toEndOf = 68;
      public static final int ConstraintLayout_Layout_layout_constraintStart_toStartOf = 69;
      public static final int ConstraintLayout_Layout_layout_constraintTag = 70;
      public static final int ConstraintLayout_Layout_layout_constraintTop_creator = 71;
      public static final int ConstraintLayout_Layout_layout_constraintTop_toBottomOf = 72;
      public static final int ConstraintLayout_Layout_layout_constraintTop_toTopOf = 73;
      public static final int ConstraintLayout_Layout_layout_constraintVertical_bias = 74;
      public static final int ConstraintLayout_Layout_layout_constraintVertical_chainStyle = 75;
      public static final int ConstraintLayout_Layout_layout_constraintVertical_weight = 76;
      public static final int ConstraintLayout_Layout_layout_constraintWidth_default = 77;
      public static final int ConstraintLayout_Layout_layout_constraintWidth_max = 78;
      public static final int ConstraintLayout_Layout_layout_constraintWidth_min = 79;
      public static final int ConstraintLayout_Layout_layout_constraintWidth_percent = 80;
      public static final int ConstraintLayout_Layout_layout_editor_absoluteX = 81;
      public static final int ConstraintLayout_Layout_layout_editor_absoluteY = 82;
      public static final int ConstraintLayout_Layout_layout_goneMarginBottom = 83;
      public static final int ConstraintLayout_Layout_layout_goneMarginEnd = 84;
      public static final int ConstraintLayout_Layout_layout_goneMarginLeft = 85;
      public static final int ConstraintLayout_Layout_layout_goneMarginRight = 86;
      public static final int ConstraintLayout_Layout_layout_goneMarginStart = 87;
      public static final int ConstraintLayout_Layout_layout_goneMarginTop = 88;
      public static final int ConstraintLayout_Layout_layout_optimizationLevel = 89;
      public static final int[] ConstraintLayout_placeholder = new int[]{2130968893, 2130969561};
      public static final int ConstraintLayout_placeholder_content = 0;
      public static final int ConstraintLayout_placeholder_placeholder_emptyVisibility = 1;
      public static final int[] ConstraintSet = new int[]{
         16842948,
         16842960,
         16842972,
         16842996,
         16842997,
         16842999,
         16843000,
         16843001,
         16843002,
         16843039,
         16843040,
         16843071,
         16843072,
         16843189,
         16843190,
         16843551,
         16843552,
         16843553,
         16843554,
         16843555,
         16843556,
         16843557,
         16843558,
         16843559,
         16843560,
         16843701,
         16843702,
         16843770,
         16843840,
         2130968635,
         2130968698,
         2130968699,
         2130968700,
         2130968761,
         2130968891,
         2130968955,
         2130968974,
         2130969084,
         2130969085,
         2130969086,
         2130969087,
         2130969088,
         2130969089,
         2130969090,
         2130969091,
         2130969092,
         2130969093,
         2130969094,
         2130969095,
         2130969096,
         2130969098,
         2130969099,
         2130969100,
         2130969101,
         2130969102,
         2130969234,
         2130969235,
         2130969236,
         2130969237,
         2130969238,
         2130969239,
         2130969240,
         2130969241,
         2130969242,
         2130969243,
         2130969244,
         2130969245,
         2130969246,
         2130969247,
         2130969248,
         2130969249,
         2130969250,
         2130969251,
         2130969252,
         2130969253,
         2130969254,
         2130969255,
         2130969256,
         2130969257,
         2130969258,
         2130969259,
         2130969260,
         2130969261,
         2130969262,
         2130969263,
         2130969264,
         2130969265,
         2130969266,
         2130969267,
         2130969268,
         2130969269,
         2130969270,
         2130969271,
         2130969272,
         2130969273,
         2130969274,
         2130969275,
         2130969277,
         2130969278,
         2130969282,
         2130969283,
         2130969284,
         2130969285,
         2130969286,
         2130969287,
         2130969463,
         2130969464,
         2130969548,
         2130969555,
         2130969891,
         2130969893
      };
      public static final int ConstraintSet_android_alpha = 15;
      public static final int ConstraintSet_android_elevation = 28;
      public static final int ConstraintSet_android_id = 1;
      public static final int ConstraintSet_android_layout_height = 4;
      public static final int ConstraintSet_android_layout_marginBottom = 8;
      public static final int ConstraintSet_android_layout_marginEnd = 26;
      public static final int ConstraintSet_android_layout_marginLeft = 5;
      public static final int ConstraintSet_android_layout_marginRight = 7;
      public static final int ConstraintSet_android_layout_marginStart = 25;
      public static final int ConstraintSet_android_layout_marginTop = 6;
      public static final int ConstraintSet_android_layout_width = 3;
      public static final int ConstraintSet_android_maxHeight = 10;
      public static final int ConstraintSet_android_maxWidth = 9;
      public static final int ConstraintSet_android_minHeight = 12;
      public static final int ConstraintSet_android_minWidth = 11;
      public static final int ConstraintSet_android_orientation = 0;
      public static final int ConstraintSet_android_pivotX = 13;
      public static final int ConstraintSet_android_pivotY = 14;
      public static final int ConstraintSet_android_rotation = 22;
      public static final int ConstraintSet_android_rotationX = 23;
      public static final int ConstraintSet_android_rotationY = 24;
      public static final int ConstraintSet_android_scaleX = 20;
      public static final int ConstraintSet_android_scaleY = 21;
      public static final int ConstraintSet_android_transformPivotX = 16;
      public static final int ConstraintSet_android_transformPivotY = 17;
      public static final int ConstraintSet_android_translationX = 18;
      public static final int ConstraintSet_android_translationY = 19;
      public static final int ConstraintSet_android_translationZ = 27;
      public static final int ConstraintSet_android_visibility = 2;
      public static final int ConstraintSet_animate_relativeTo = 29;
      public static final int ConstraintSet_barrierAllowsGoneWidgets = 30;
      public static final int ConstraintSet_barrierDirection = 31;
      public static final int ConstraintSet_barrierMargin = 32;
      public static final int ConstraintSet_chainUseRtl = 33;
      public static final int ConstraintSet_constraint_referenced_ids = 34;
      public static final int ConstraintSet_deriveConstraintsFrom = 35;
      public static final int ConstraintSet_drawPath = 36;
      public static final int ConstraintSet_flow_firstHorizontalBias = 37;
      public static final int ConstraintSet_flow_firstHorizontalStyle = 38;
      public static final int ConstraintSet_flow_firstVerticalBias = 39;
      public static final int ConstraintSet_flow_firstVerticalStyle = 40;
      public static final int ConstraintSet_flow_horizontalAlign = 41;
      public static final int ConstraintSet_flow_horizontalBias = 42;
      public static final int ConstraintSet_flow_horizontalGap = 43;
      public static final int ConstraintSet_flow_horizontalStyle = 44;
      public static final int ConstraintSet_flow_lastHorizontalBias = 45;
      public static final int ConstraintSet_flow_lastHorizontalStyle = 46;
      public static final int ConstraintSet_flow_lastVerticalBias = 47;
      public static final int ConstraintSet_flow_lastVerticalStyle = 48;
      public static final int ConstraintSet_flow_maxElementsWrap = 49;
      public static final int ConstraintSet_flow_verticalAlign = 50;
      public static final int ConstraintSet_flow_verticalBias = 51;
      public static final int ConstraintSet_flow_verticalGap = 52;
      public static final int ConstraintSet_flow_verticalStyle = 53;
      public static final int ConstraintSet_flow_wrapMode = 54;
      public static final int ConstraintSet_layout_constrainedHeight = 55;
      public static final int ConstraintSet_layout_constrainedWidth = 56;
      public static final int ConstraintSet_layout_constraintBaseline_creator = 57;
      public static final int ConstraintSet_layout_constraintBaseline_toBaselineOf = 58;
      public static final int ConstraintSet_layout_constraintBottom_creator = 59;
      public static final int ConstraintSet_layout_constraintBottom_toBottomOf = 60;
      public static final int ConstraintSet_layout_constraintBottom_toTopOf = 61;
      public static final int ConstraintSet_layout_constraintCircle = 62;
      public static final int ConstraintSet_layout_constraintCircleAngle = 63;
      public static final int ConstraintSet_layout_constraintCircleRadius = 64;
      public static final int ConstraintSet_layout_constraintDimensionRatio = 65;
      public static final int ConstraintSet_layout_constraintEnd_toEndOf = 66;
      public static final int ConstraintSet_layout_constraintEnd_toStartOf = 67;
      public static final int ConstraintSet_layout_constraintGuide_begin = 68;
      public static final int ConstraintSet_layout_constraintGuide_end = 69;
      public static final int ConstraintSet_layout_constraintGuide_percent = 70;
      public static final int ConstraintSet_layout_constraintHeight_default = 71;
      public static final int ConstraintSet_layout_constraintHeight_max = 72;
      public static final int ConstraintSet_layout_constraintHeight_min = 73;
      public static final int ConstraintSet_layout_constraintHeight_percent = 74;
      public static final int ConstraintSet_layout_constraintHorizontal_bias = 75;
      public static final int ConstraintSet_layout_constraintHorizontal_chainStyle = 76;
      public static final int ConstraintSet_layout_constraintHorizontal_weight = 77;
      public static final int ConstraintSet_layout_constraintLeft_creator = 78;
      public static final int ConstraintSet_layout_constraintLeft_toLeftOf = 79;
      public static final int ConstraintSet_layout_constraintLeft_toRightOf = 80;
      public static final int ConstraintSet_layout_constraintRight_creator = 81;
      public static final int ConstraintSet_layout_constraintRight_toLeftOf = 82;
      public static final int ConstraintSet_layout_constraintRight_toRightOf = 83;
      public static final int ConstraintSet_layout_constraintStart_toEndOf = 84;
      public static final int ConstraintSet_layout_constraintStart_toStartOf = 85;
      public static final int ConstraintSet_layout_constraintTag = 86;
      public static final int ConstraintSet_layout_constraintTop_creator = 87;
      public static final int ConstraintSet_layout_constraintTop_toBottomOf = 88;
      public static final int ConstraintSet_layout_constraintTop_toTopOf = 89;
      public static final int ConstraintSet_layout_constraintVertical_bias = 90;
      public static final int ConstraintSet_layout_constraintVertical_chainStyle = 91;
      public static final int ConstraintSet_layout_constraintVertical_weight = 92;
      public static final int ConstraintSet_layout_constraintWidth_default = 93;
      public static final int ConstraintSet_layout_constraintWidth_max = 94;
      public static final int ConstraintSet_layout_constraintWidth_min = 95;
      public static final int ConstraintSet_layout_constraintWidth_percent = 96;
      public static final int ConstraintSet_layout_editor_absoluteX = 97;
      public static final int ConstraintSet_layout_editor_absoluteY = 98;
      public static final int ConstraintSet_layout_goneMarginBottom = 99;
      public static final int ConstraintSet_layout_goneMarginEnd = 100;
      public static final int ConstraintSet_layout_goneMarginLeft = 101;
      public static final int ConstraintSet_layout_goneMarginRight = 102;
      public static final int ConstraintSet_layout_goneMarginStart = 103;
      public static final int ConstraintSet_layout_goneMarginTop = 104;
      public static final int ConstraintSet_motionProgress = 105;
      public static final int ConstraintSet_motionStagger = 106;
      public static final int ConstraintSet_pathMotionArc = 107;
      public static final int ConstraintSet_pivotAnchor = 108;
      public static final int ConstraintSet_transitionEasing = 109;
      public static final int ConstraintSet_transitionPathRotate = 110;
      public static final int Constraint_android_alpha = 13;
      public static final int Constraint_android_elevation = 26;
      public static final int Constraint_android_id = 1;
      public static final int Constraint_android_layout_height = 4;
      public static final int Constraint_android_layout_marginBottom = 8;
      public static final int Constraint_android_layout_marginEnd = 24;
      public static final int Constraint_android_layout_marginLeft = 5;
      public static final int Constraint_android_layout_marginRight = 7;
      public static final int Constraint_android_layout_marginStart = 23;
      public static final int Constraint_android_layout_marginTop = 6;
      public static final int Constraint_android_layout_width = 3;
      public static final int Constraint_android_maxHeight = 10;
      public static final int Constraint_android_maxWidth = 9;
      public static final int Constraint_android_minHeight = 12;
      public static final int Constraint_android_minWidth = 11;
      public static final int Constraint_android_orientation = 0;
      public static final int Constraint_android_rotation = 20;
      public static final int Constraint_android_rotationX = 21;
      public static final int Constraint_android_rotationY = 22;
      public static final int Constraint_android_scaleX = 18;
      public static final int Constraint_android_scaleY = 19;
      public static final int Constraint_android_transformPivotX = 14;
      public static final int Constraint_android_transformPivotY = 15;
      public static final int Constraint_android_translationX = 16;
      public static final int Constraint_android_translationY = 17;
      public static final int Constraint_android_translationZ = 25;
      public static final int Constraint_android_visibility = 2;
      public static final int Constraint_animate_relativeTo = 27;
      public static final int Constraint_barrierAllowsGoneWidgets = 28;
      public static final int Constraint_barrierDirection = 29;
      public static final int Constraint_barrierMargin = 30;
      public static final int Constraint_chainUseRtl = 31;
      public static final int Constraint_constraint_referenced_ids = 32;
      public static final int Constraint_drawPath = 33;
      public static final int Constraint_flow_firstHorizontalBias = 34;
      public static final int Constraint_flow_firstHorizontalStyle = 35;
      public static final int Constraint_flow_firstVerticalBias = 36;
      public static final int Constraint_flow_firstVerticalStyle = 37;
      public static final int Constraint_flow_horizontalAlign = 38;
      public static final int Constraint_flow_horizontalBias = 39;
      public static final int Constraint_flow_horizontalGap = 40;
      public static final int Constraint_flow_horizontalStyle = 41;
      public static final int Constraint_flow_lastHorizontalBias = 42;
      public static final int Constraint_flow_lastHorizontalStyle = 43;
      public static final int Constraint_flow_lastVerticalBias = 44;
      public static final int Constraint_flow_lastVerticalStyle = 45;
      public static final int Constraint_flow_maxElementsWrap = 46;
      public static final int Constraint_flow_verticalAlign = 47;
      public static final int Constraint_flow_verticalBias = 48;
      public static final int Constraint_flow_verticalGap = 49;
      public static final int Constraint_flow_verticalStyle = 50;
      public static final int Constraint_flow_wrapMode = 51;
      public static final int Constraint_layout_constrainedHeight = 52;
      public static final int Constraint_layout_constrainedWidth = 53;
      public static final int Constraint_layout_constraintBaseline_creator = 54;
      public static final int Constraint_layout_constraintBaseline_toBaselineOf = 55;
      public static final int Constraint_layout_constraintBottom_creator = 56;
      public static final int Constraint_layout_constraintBottom_toBottomOf = 57;
      public static final int Constraint_layout_constraintBottom_toTopOf = 58;
      public static final int Constraint_layout_constraintCircle = 59;
      public static final int Constraint_layout_constraintCircleAngle = 60;
      public static final int Constraint_layout_constraintCircleRadius = 61;
      public static final int Constraint_layout_constraintDimensionRatio = 62;
      public static final int Constraint_layout_constraintEnd_toEndOf = 63;
      public static final int Constraint_layout_constraintEnd_toStartOf = 64;
      public static final int Constraint_layout_constraintGuide_begin = 65;
      public static final int Constraint_layout_constraintGuide_end = 66;
      public static final int Constraint_layout_constraintGuide_percent = 67;
      public static final int Constraint_layout_constraintHeight_default = 68;
      public static final int Constraint_layout_constraintHeight_max = 69;
      public static final int Constraint_layout_constraintHeight_min = 70;
      public static final int Constraint_layout_constraintHeight_percent = 71;
      public static final int Constraint_layout_constraintHorizontal_bias = 72;
      public static final int Constraint_layout_constraintHorizontal_chainStyle = 73;
      public static final int Constraint_layout_constraintHorizontal_weight = 74;
      public static final int Constraint_layout_constraintLeft_creator = 75;
      public static final int Constraint_layout_constraintLeft_toLeftOf = 76;
      public static final int Constraint_layout_constraintLeft_toRightOf = 77;
      public static final int Constraint_layout_constraintRight_creator = 78;
      public static final int Constraint_layout_constraintRight_toLeftOf = 79;
      public static final int Constraint_layout_constraintRight_toRightOf = 80;
      public static final int Constraint_layout_constraintStart_toEndOf = 81;
      public static final int Constraint_layout_constraintStart_toStartOf = 82;
      public static final int Constraint_layout_constraintTag = 83;
      public static final int Constraint_layout_constraintTop_creator = 84;
      public static final int Constraint_layout_constraintTop_toBottomOf = 85;
      public static final int Constraint_layout_constraintTop_toTopOf = 86;
      public static final int Constraint_layout_constraintVertical_bias = 87;
      public static final int Constraint_layout_constraintVertical_chainStyle = 88;
      public static final int Constraint_layout_constraintVertical_weight = 89;
      public static final int Constraint_layout_constraintWidth_default = 90;
      public static final int Constraint_layout_constraintWidth_max = 91;
      public static final int Constraint_layout_constraintWidth_min = 92;
      public static final int Constraint_layout_constraintWidth_percent = 93;
      public static final int Constraint_layout_editor_absoluteX = 94;
      public static final int Constraint_layout_editor_absoluteY = 95;
      public static final int Constraint_layout_goneMarginBottom = 96;
      public static final int Constraint_layout_goneMarginEnd = 97;
      public static final int Constraint_layout_goneMarginLeft = 98;
      public static final int Constraint_layout_goneMarginRight = 99;
      public static final int Constraint_layout_goneMarginStart = 100;
      public static final int Constraint_layout_goneMarginTop = 101;
      public static final int Constraint_motionProgress = 102;
      public static final int Constraint_motionStagger = 103;
      public static final int Constraint_pathMotionArc = 104;
      public static final int Constraint_pivotAnchor = 105;
      public static final int Constraint_transitionEasing = 106;
      public static final int Constraint_transitionPathRotate = 107;
      public static final int Constraint_visibilityMode = 108;
      public static final int[] CoordinatorLayout = new int[]{2130969217, 2130969710};
      public static final int[] CoordinatorLayout_Layout = new int[]{16842931, 2130969229, 2130969230, 2130969231, 2130969276, 2130969288, 2130969289};
      public static final int CoordinatorLayout_Layout_android_layout_gravity = 0;
      public static final int CoordinatorLayout_Layout_layout_anchor = 1;
      public static final int CoordinatorLayout_Layout_layout_anchorGravity = 2;
      public static final int CoordinatorLayout_Layout_layout_behavior = 3;
      public static final int CoordinatorLayout_Layout_layout_dodgeInsetEdges = 4;
      public static final int CoordinatorLayout_Layout_layout_insetEdge = 5;
      public static final int CoordinatorLayout_Layout_layout_keyline = 6;
      public static final int CoordinatorLayout_keylines = 0;
      public static final int CoordinatorLayout_statusBarBackground = 1;
      public static final int[] CustomAttribute = new int[]{
         2130968645, 2130968934, 2130968935, 2130968936, 2130968937, 2130968938, 2130968939, 2130968941, 2130968942
      };
      public static final int CustomAttribute_attributeName = 0;
      public static final int CustomAttribute_customBoolean = 1;
      public static final int CustomAttribute_customColorDrawableValue = 2;
      public static final int CustomAttribute_customColorValue = 3;
      public static final int CustomAttribute_customDimension = 4;
      public static final int CustomAttribute_customFloatValue = 5;
      public static final int CustomAttribute_customIntegerValue = 6;
      public static final int CustomAttribute_customPixelDimension = 7;
      public static final int CustomAttribute_customStringValue = 8;
      public static final int[] DefaultTimeBar = new int[]{
         2130968617,
         2130968618,
         2130968696,
         2130968697,
         2130968734,
         2130969562,
         2130969563,
         2130969622,
         2130969623,
         2130969624,
         2130969625,
         2130969626,
         2130969875,
         2130969916
      };
      public static final int DefaultTimeBar_ad_marker_color = 0;
      public static final int DefaultTimeBar_ad_marker_width = 1;
      public static final int DefaultTimeBar_bar_gravity = 2;
      public static final int DefaultTimeBar_bar_height = 3;
      public static final int DefaultTimeBar_buffered_color = 4;
      public static final int DefaultTimeBar_played_ad_marker_color = 5;
      public static final int DefaultTimeBar_played_color = 6;
      public static final int DefaultTimeBar_scrubber_color = 7;
      public static final int DefaultTimeBar_scrubber_disabled_size = 8;
      public static final int DefaultTimeBar_scrubber_dragged_size = 9;
      public static final int DefaultTimeBar_scrubber_drawable = 10;
      public static final int DefaultTimeBar_scrubber_enabled_size = 11;
      public static final int DefaultTimeBar_touch_target_height = 12;
      public static final int DefaultTimeBar_unplayed_color = 13;
      public static final int[] DrawerArrowToggle = new int[]{2130968642, 2130968643, 2130968695, 2130968824, 2130968979, 2130969129, 2130969687, 2130969821};
      public static final int DrawerArrowToggle_arrowHeadLength = 0;
      public static final int DrawerArrowToggle_arrowShaftLength = 1;
      public static final int DrawerArrowToggle_barLength = 2;
      public static final int DrawerArrowToggle_color = 3;
      public static final int DrawerArrowToggle_drawableSize = 4;
      public static final int DrawerArrowToggle_gapBetweenBars = 5;
      public static final int DrawerArrowToggle_spinBars = 6;
      public static final int DrawerArrowToggle_thickness = 7;
      public static final int[] DrawerLayout = new int[]{2130968994};
      public static final int DrawerLayout_elevation = 0;
      public static final int[] ExtendedFloatingActionButton = new int[]{2130968815, 2130968994, 2130969033, 2130969034, 2130969142, 2130969657, 2130969670};
      public static final int[] ExtendedFloatingActionButton_Behavior_Layout = new int[]{2130968701, 2130968702};
      public static final int ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide = 0;
      public static final int ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink = 1;
      public static final int ExtendedFloatingActionButton_collapsedSize = 0;
      public static final int ExtendedFloatingActionButton_elevation = 1;
      public static final int ExtendedFloatingActionButton_extendMotionSpec = 2;
      public static final int ExtendedFloatingActionButton_extendStrategy = 3;
      public static final int ExtendedFloatingActionButton_hideMotionSpec = 4;
      public static final int ExtendedFloatingActionButton_showMotionSpec = 5;
      public static final int ExtendedFloatingActionButton_shrinkMotionSpec = 6;
      public static final int[] FlexboxLayout = new int[]{
         2130968624, 2130968625, 2130968962, 2130968963, 2130968964, 2130969066, 2130969067, 2130969213, 2130969408, 2130969653, 2130969654, 2130969655
      };
      public static final int[] FlexboxLayout_Layout = new int[]{
         2130969228, 2130969279, 2130969280, 2130969281, 2130969290, 2130969291, 2130969292, 2130969293, 2130969295, 2130969299
      };
      public static final int FlexboxLayout_Layout_layout_alignSelf = 0;
      public static final int FlexboxLayout_Layout_layout_flexBasisPercent = 1;
      public static final int FlexboxLayout_Layout_layout_flexGrow = 2;
      public static final int FlexboxLayout_Layout_layout_flexShrink = 3;
      public static final int FlexboxLayout_Layout_layout_maxHeight = 4;
      public static final int FlexboxLayout_Layout_layout_maxWidth = 5;
      public static final int FlexboxLayout_Layout_layout_minHeight = 6;
      public static final int FlexboxLayout_Layout_layout_minWidth = 7;
      public static final int FlexboxLayout_Layout_layout_order = 8;
      public static final int FlexboxLayout_Layout_layout_wrapBefore = 9;
      public static final int FlexboxLayout_alignContent = 0;
      public static final int FlexboxLayout_alignItems = 1;
      public static final int FlexboxLayout_dividerDrawable = 2;
      public static final int FlexboxLayout_dividerDrawableHorizontal = 3;
      public static final int FlexboxLayout_dividerDrawableVertical = 4;
      public static final int FlexboxLayout_flexDirection = 5;
      public static final int FlexboxLayout_flexWrap = 6;
      public static final int FlexboxLayout_justifyContent = 7;
      public static final int FlexboxLayout_maxLine = 8;
      public static final int FlexboxLayout_showDivider = 9;
      public static final int FlexboxLayout_showDividerHorizontal = 10;
      public static final int FlexboxLayout_showDividerVertical = 11;
      public static final int[] FloatingActionButton = new int[]{
         16842766,
         2130968678,
         2130968679,
         2130968714,
         2130968994,
         2130969011,
         2130969048,
         2130969049,
         2130969142,
         2130969157,
         2130969407,
         2130969574,
         2130969599,
         2130969637,
         2130969645,
         2130969657,
         2130969917
      };
      public static final int[] FloatingActionButton_Behavior_Layout = new int[]{2130968701};
      public static final int FloatingActionButton_Behavior_Layout_behavior_autoHide = 0;
      public static final int FloatingActionButton_android_enabled = 0;
      public static final int FloatingActionButton_backgroundTint = 1;
      public static final int FloatingActionButton_backgroundTintMode = 2;
      public static final int FloatingActionButton_borderWidth = 3;
      public static final int FloatingActionButton_elevation = 4;
      public static final int FloatingActionButton_ensureMinTouchTargetSize = 5;
      public static final int FloatingActionButton_fabCustomSize = 6;
      public static final int FloatingActionButton_fabSize = 7;
      public static final int FloatingActionButton_hideMotionSpec = 8;
      public static final int FloatingActionButton_hoveredFocusedTranslationZ = 9;
      public static final int FloatingActionButton_maxImageSize = 10;
      public static final int FloatingActionButton_pressedTranslationZ = 11;
      public static final int FloatingActionButton_rippleColor = 12;
      public static final int FloatingActionButton_shapeAppearance = 13;
      public static final int FloatingActionButton_shapeAppearanceOverlay = 14;
      public static final int FloatingActionButton_showMotionSpec = 15;
      public static final int FloatingActionButton_useCompatPadding = 16;
      public static final int[] FlowLayout = new int[]{2130969205, 2130969305};
      public static final int FlowLayout_itemSpacing = 0;
      public static final int FlowLayout_lineSpacing = 1;
      public static final int[] FontFamily = new int[]{2130969105, 2130969106, 2130969107, 2130969108, 2130969109, 2130969110, 2130969111};
      public static final int[] FontFamilyFont = new int[]{
         16844082, 16844083, 16844095, 16844143, 16844144, 2130969103, 2130969112, 2130969113, 2130969114, 2130969898
      };
      public static final int FontFamilyFont_android_font = 0;
      public static final int FontFamilyFont_android_fontStyle = 2;
      public static final int FontFamilyFont_android_fontVariationSettings = 4;
      public static final int FontFamilyFont_android_fontWeight = 1;
      public static final int FontFamilyFont_android_ttcIndex = 3;
      public static final int FontFamilyFont_font = 5;
      public static final int FontFamilyFont_fontStyle = 6;
      public static final int FontFamilyFont_fontVariationSettings = 7;
      public static final int FontFamilyFont_fontWeight = 8;
      public static final int FontFamilyFont_ttcIndex = 9;
      public static final int FontFamily_fontProviderAuthority = 0;
      public static final int FontFamily_fontProviderCerts = 1;
      public static final int FontFamily_fontProviderFetchStrategy = 2;
      public static final int FontFamily_fontProviderFetchTimeout = 3;
      public static final int FontFamily_fontProviderPackage = 4;
      public static final int FontFamily_fontProviderQuery = 5;
      public static final int FontFamily_fontProviderSystemFontFamily = 6;
      public static final int[] ForegroundLinearLayout = new int[]{16843017, 16843264, 2130969117};
      public static final int ForegroundLinearLayout_android_foreground = 0;
      public static final int ForegroundLinearLayout_android_foregroundGravity = 1;
      public static final int ForegroundLinearLayout_foregroundInsidePadding = 2;
      public static final int[] Fragment = new int[]{16842755, 16842960, 16842961};
      public static final int[] FragmentContainerView = new int[]{16842755, 16842961};
      public static final int FragmentContainerView_android_name = 0;
      public static final int FragmentContainerView_android_tag = 1;
      public static final int Fragment_android_id = 1;
      public static final int Fragment_android_name = 0;
      public static final int Fragment_android_tag = 2;
      public static final int[] GenericDraweeHierarchy = new int[]{
         2130968615,
         2130968670,
         2130969050,
         2130969051,
         2130969052,
         2130969530,
         2130969556,
         2130969557,
         2130969573,
         2130969575,
         2130969576,
         2130969577,
         2130969596,
         2130969597,
         2130969601,
         2130969602,
         2130969603,
         2130969604,
         2130969605,
         2130969607,
         2130969608,
         2130969609,
         2130969610,
         2130969611,
         2130969612,
         2130969613,
         2130969614,
         2130969615,
         2130969926
      };
      public static final int GenericDraweeHierarchy_actualImageScaleType = 0;
      public static final int GenericDraweeHierarchy_backgroundImage = 1;
      public static final int GenericDraweeHierarchy_fadeDuration = 2;
      public static final int GenericDraweeHierarchy_failureImage = 3;
      public static final int GenericDraweeHierarchy_failureImageScaleType = 4;
      public static final int GenericDraweeHierarchy_overlayImage = 5;
      public static final int GenericDraweeHierarchy_placeholderImage = 6;
      public static final int GenericDraweeHierarchy_placeholderImageScaleType = 7;
      public static final int GenericDraweeHierarchy_pressedStateOverlayImage = 8;
      public static final int GenericDraweeHierarchy_progressBarAutoRotateInterval = 9;
      public static final int GenericDraweeHierarchy_progressBarImage = 10;
      public static final int GenericDraweeHierarchy_progressBarImageScaleType = 11;
      public static final int GenericDraweeHierarchy_retryImage = 12;
      public static final int GenericDraweeHierarchy_retryImageScaleType = 13;
      public static final int GenericDraweeHierarchy_roundAsCircle = 14;
      public static final int GenericDraweeHierarchy_roundBottomEnd = 15;
      public static final int GenericDraweeHierarchy_roundBottomLeft = 16;
      public static final int GenericDraweeHierarchy_roundBottomRight = 17;
      public static final int GenericDraweeHierarchy_roundBottomStart = 18;
      public static final int GenericDraweeHierarchy_roundTopEnd = 19;
      public static final int GenericDraweeHierarchy_roundTopLeft = 20;
      public static final int GenericDraweeHierarchy_roundTopRight = 21;
      public static final int GenericDraweeHierarchy_roundTopStart = 22;
      public static final int GenericDraweeHierarchy_roundWithOverlayColor = 23;
      public static final int GenericDraweeHierarchy_roundedCornerRadius = 24;
      public static final int GenericDraweeHierarchy_roundingBorderColor = 25;
      public static final int GenericDraweeHierarchy_roundingBorderPadding = 26;
      public static final int GenericDraweeHierarchy_roundingBorderWidth = 27;
      public static final int GenericDraweeHierarchy_viewAspectRatio = 28;
      public static final int[] GradientColor = new int[]{
         16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051
      };
      public static final int[] GradientColorItem = new int[]{16843173, 16844052};
      public static final int GradientColorItem_android_color = 0;
      public static final int GradientColorItem_android_offset = 1;
      public static final int GradientColor_android_centerColor = 7;
      public static final int GradientColor_android_centerX = 3;
      public static final int GradientColor_android_centerY = 4;
      public static final int GradientColor_android_endColor = 1;
      public static final int GradientColor_android_endX = 10;
      public static final int GradientColor_android_endY = 11;
      public static final int GradientColor_android_gradientRadius = 5;
      public static final int GradientColor_android_startColor = 0;
      public static final int GradientColor_android_startX = 8;
      public static final int GradientColor_android_startY = 9;
      public static final int GradientColor_android_tileMode = 6;
      public static final int GradientColor_android_type = 2;
      public static final int[] ImageFilterView = new int[]{
         2130968632, 2130968733, 2130968909, 2130968931, 2130969529, 2130969600, 2130969606, 2130969616, 2130969930
      };
      public static final int ImageFilterView_altSrc = 0;
      public static final int ImageFilterView_brightness = 1;
      public static final int ImageFilterView_contrast = 2;
      public static final int ImageFilterView_crossfade = 3;
      public static final int ImageFilterView_overlay = 4;
      public static final int ImageFilterView_round = 5;
      public static final int ImageFilterView_roundPercent = 6;
      public static final int ImageFilterView_saturation = 7;
      public static final int ImageFilterView_warmth = 8;
      public static final int[] Insets = new int[]{2130969352, 2130969353, 2130969354, 2130969533, 2130969535, 2130969536, 2130969539};
      public static final int Insets_marginLeftSystemWindowInsets = 0;
      public static final int Insets_marginRightSystemWindowInsets = 1;
      public static final int Insets_marginTopSystemWindowInsets = 2;
      public static final int Insets_paddingBottomSystemWindowInsets = 3;
      public static final int Insets_paddingLeftSystemWindowInsets = 4;
      public static final int Insets_paddingRightSystemWindowInsets = 5;
      public static final int Insets_paddingTopSystemWindowInsets = 6;
      public static final int[] KeyAttribute = new int[]{
         16843551,
         16843552,
         16843553,
         16843554,
         16843555,
         16843556,
         16843557,
         16843558,
         16843559,
         16843560,
         16843770,
         16843840,
         2130968933,
         2130969124,
         2130969463,
         2130969465,
         2130969891,
         2130969893
      };
      public static final int KeyAttribute_android_alpha = 0;
      public static final int KeyAttribute_android_elevation = 11;
      public static final int KeyAttribute_android_rotation = 7;
      public static final int KeyAttribute_android_rotationX = 8;
      public static final int KeyAttribute_android_rotationY = 9;
      public static final int KeyAttribute_android_scaleX = 5;
      public static final int KeyAttribute_android_scaleY = 6;
      public static final int KeyAttribute_android_transformPivotX = 1;
      public static final int KeyAttribute_android_transformPivotY = 2;
      public static final int KeyAttribute_android_translationX = 3;
      public static final int KeyAttribute_android_translationY = 4;
      public static final int KeyAttribute_android_translationZ = 10;
      public static final int KeyAttribute_curveFit = 12;
      public static final int KeyAttribute_framePosition = 13;
      public static final int KeyAttribute_motionProgress = 14;
      public static final int KeyAttribute_motionTarget = 15;
      public static final int KeyAttribute_transitionEasing = 16;
      public static final int KeyAttribute_transitionPathRotate = 17;
      public static final int[] KeyCycle = new int[]{
         16843551,
         16843554,
         16843555,
         16843556,
         16843557,
         16843558,
         16843559,
         16843560,
         16843770,
         16843840,
         2130968933,
         2130969124,
         2130969463,
         2130969465,
         2130969891,
         2130969893,
         2130969932,
         2130969933,
         2130969934,
         2130969935
      };
      public static final int KeyCycle_android_alpha = 0;
      public static final int KeyCycle_android_elevation = 9;
      public static final int KeyCycle_android_rotation = 5;
      public static final int KeyCycle_android_rotationX = 6;
      public static final int KeyCycle_android_rotationY = 7;
      public static final int KeyCycle_android_scaleX = 3;
      public static final int KeyCycle_android_scaleY = 4;
      public static final int KeyCycle_android_translationX = 1;
      public static final int KeyCycle_android_translationY = 2;
      public static final int KeyCycle_android_translationZ = 8;
      public static final int KeyCycle_curveFit = 10;
      public static final int KeyCycle_framePosition = 11;
      public static final int KeyCycle_motionProgress = 12;
      public static final int KeyCycle_motionTarget = 13;
      public static final int KeyCycle_transitionEasing = 14;
      public static final int KeyCycle_transitionPathRotate = 15;
      public static final int KeyCycle_waveOffset = 16;
      public static final int KeyCycle_wavePeriod = 17;
      public static final int KeyCycle_waveShape = 18;
      public static final int KeyCycle_waveVariesBy = 19;
      public static final int[] KeyFrame = new int[0];
      public static final int[] KeyFramesAcceleration = new int[0];
      public static final int[] KeyFramesVelocity = new int[0];
      public static final int[] KeyPosition = new int[]{
         2130968933, 2130968974, 2130969124, 2130969215, 2130969465, 2130969548, 2130969550, 2130969551, 2130969552, 2130969553, 2130969681, 2130969891
      };
      public static final int KeyPosition_curveFit = 0;
      public static final int KeyPosition_drawPath = 1;
      public static final int KeyPosition_framePosition = 2;
      public static final int KeyPosition_keyPositionType = 3;
      public static final int KeyPosition_motionTarget = 4;
      public static final int KeyPosition_pathMotionArc = 5;
      public static final int KeyPosition_percentHeight = 6;
      public static final int KeyPosition_percentWidth = 7;
      public static final int KeyPosition_percentX = 8;
      public static final int KeyPosition_percentY = 9;
      public static final int KeyPosition_sizePercent = 10;
      public static final int KeyPosition_transitionEasing = 11;
      public static final int[] KeyTimeCycle = new int[]{
         16843551,
         16843554,
         16843555,
         16843556,
         16843557,
         16843558,
         16843559,
         16843560,
         16843770,
         16843840,
         2130968933,
         2130969124,
         2130969463,
         2130969465,
         2130969891,
         2130969893,
         2130969931,
         2130969932,
         2130969933,
         2130969934
      };
      public static final int KeyTimeCycle_android_alpha = 0;
      public static final int KeyTimeCycle_android_elevation = 9;
      public static final int KeyTimeCycle_android_rotation = 5;
      public static final int KeyTimeCycle_android_rotationX = 6;
      public static final int KeyTimeCycle_android_rotationY = 7;
      public static final int KeyTimeCycle_android_scaleX = 3;
      public static final int KeyTimeCycle_android_scaleY = 4;
      public static final int KeyTimeCycle_android_translationX = 1;
      public static final int KeyTimeCycle_android_translationY = 2;
      public static final int KeyTimeCycle_android_translationZ = 8;
      public static final int KeyTimeCycle_curveFit = 10;
      public static final int KeyTimeCycle_framePosition = 11;
      public static final int KeyTimeCycle_motionProgress = 12;
      public static final int KeyTimeCycle_motionTarget = 13;
      public static final int KeyTimeCycle_transitionEasing = 14;
      public static final int KeyTimeCycle_transitionPathRotate = 15;
      public static final int KeyTimeCycle_waveDecay = 16;
      public static final int KeyTimeCycle_waveOffset = 17;
      public static final int KeyTimeCycle_wavePeriod = 18;
      public static final int KeyTimeCycle_waveShape = 19;
      public static final int[] KeyTrigger = new int[]{
         2130969124, 2130969465, 2130969466, 2130969467, 2130969518, 2130969520, 2130969521, 2130969895, 2130969896, 2130969897
      };
      public static final int KeyTrigger_framePosition = 0;
      public static final int KeyTrigger_motionTarget = 1;
      public static final int KeyTrigger_motion_postLayoutCollision = 2;
      public static final int KeyTrigger_motion_triggerOnCollision = 3;
      public static final int KeyTrigger_onCross = 4;
      public static final int KeyTrigger_onNegativeCross = 5;
      public static final int KeyTrigger_onPositiveCross = 6;
      public static final int KeyTrigger_triggerId = 7;
      public static final int KeyTrigger_triggerReceiver = 8;
      public static final int KeyTrigger_triggerSlack = 9;
      public static final int[] Layout = new int[]{
         16842948,
         16842996,
         16842997,
         16842999,
         16843000,
         16843001,
         16843002,
         16843701,
         16843702,
         2130968698,
         2130968699,
         2130968700,
         2130968761,
         2130968891,
         2130969234,
         2130969235,
         2130969236,
         2130969237,
         2130969238,
         2130969239,
         2130969240,
         2130969241,
         2130969242,
         2130969243,
         2130969244,
         2130969245,
         2130969246,
         2130969247,
         2130969248,
         2130969249,
         2130969250,
         2130969251,
         2130969252,
         2130969253,
         2130969254,
         2130969255,
         2130969256,
         2130969257,
         2130969258,
         2130969259,
         2130969260,
         2130969261,
         2130969262,
         2130969263,
         2130969264,
         2130969266,
         2130969267,
         2130969268,
         2130969269,
         2130969270,
         2130969271,
         2130969272,
         2130969273,
         2130969274,
         2130969275,
         2130969277,
         2130969278,
         2130969282,
         2130969283,
         2130969284,
         2130969285,
         2130969286,
         2130969287,
         2130969406,
         2130969411,
         2130969418,
         2130969422
      };
      public static final int Layout_android_layout_height = 2;
      public static final int Layout_android_layout_marginBottom = 6;
      public static final int Layout_android_layout_marginEnd = 8;
      public static final int Layout_android_layout_marginLeft = 3;
      public static final int Layout_android_layout_marginRight = 5;
      public static final int Layout_android_layout_marginStart = 7;
      public static final int Layout_android_layout_marginTop = 4;
      public static final int Layout_android_layout_width = 1;
      public static final int Layout_android_orientation = 0;
      public static final int Layout_barrierAllowsGoneWidgets = 9;
      public static final int Layout_barrierDirection = 10;
      public static final int Layout_barrierMargin = 11;
      public static final int Layout_chainUseRtl = 12;
      public static final int Layout_constraint_referenced_ids = 13;
      public static final int Layout_layout_constrainedHeight = 14;
      public static final int Layout_layout_constrainedWidth = 15;
      public static final int Layout_layout_constraintBaseline_creator = 16;
      public static final int Layout_layout_constraintBaseline_toBaselineOf = 17;
      public static final int Layout_layout_constraintBottom_creator = 18;
      public static final int Layout_layout_constraintBottom_toBottomOf = 19;
      public static final int Layout_layout_constraintBottom_toTopOf = 20;
      public static final int Layout_layout_constraintCircle = 21;
      public static final int Layout_layout_constraintCircleAngle = 22;
      public static final int Layout_layout_constraintCircleRadius = 23;
      public static final int Layout_layout_constraintDimensionRatio = 24;
      public static final int Layout_layout_constraintEnd_toEndOf = 25;
      public static final int Layout_layout_constraintEnd_toStartOf = 26;
      public static final int Layout_layout_constraintGuide_begin = 27;
      public static final int Layout_layout_constraintGuide_end = 28;
      public static final int Layout_layout_constraintGuide_percent = 29;
      public static final int Layout_layout_constraintHeight_default = 30;
      public static final int Layout_layout_constraintHeight_max = 31;
      public static final int Layout_layout_constraintHeight_min = 32;
      public static final int Layout_layout_constraintHeight_percent = 33;
      public static final int Layout_layout_constraintHorizontal_bias = 34;
      public static final int Layout_layout_constraintHorizontal_chainStyle = 35;
      public static final int Layout_layout_constraintHorizontal_weight = 36;
      public static final int Layout_layout_constraintLeft_creator = 37;
      public static final int Layout_layout_constraintLeft_toLeftOf = 38;
      public static final int Layout_layout_constraintLeft_toRightOf = 39;
      public static final int Layout_layout_constraintRight_creator = 40;
      public static final int Layout_layout_constraintRight_toLeftOf = 41;
      public static final int Layout_layout_constraintRight_toRightOf = 42;
      public static final int Layout_layout_constraintStart_toEndOf = 43;
      public static final int Layout_layout_constraintStart_toStartOf = 44;
      public static final int Layout_layout_constraintTop_creator = 45;
      public static final int Layout_layout_constraintTop_toBottomOf = 46;
      public static final int Layout_layout_constraintTop_toTopOf = 47;
      public static final int Layout_layout_constraintVertical_bias = 48;
      public static final int Layout_layout_constraintVertical_chainStyle = 49;
      public static final int Layout_layout_constraintVertical_weight = 50;
      public static final int Layout_layout_constraintWidth_default = 51;
      public static final int Layout_layout_constraintWidth_max = 52;
      public static final int Layout_layout_constraintWidth_min = 53;
      public static final int Layout_layout_constraintWidth_percent = 54;
      public static final int Layout_layout_editor_absoluteX = 55;
      public static final int Layout_layout_editor_absoluteY = 56;
      public static final int Layout_layout_goneMarginBottom = 57;
      public static final int Layout_layout_goneMarginEnd = 58;
      public static final int Layout_layout_goneMarginLeft = 59;
      public static final int Layout_layout_goneMarginRight = 60;
      public static final int Layout_layout_goneMarginStart = 61;
      public static final int Layout_layout_goneMarginTop = 62;
      public static final int Layout_maxHeight = 63;
      public static final int Layout_maxWidth = 64;
      public static final int Layout_minHeight = 65;
      public static final int Layout_minWidth = 66;
      public static final int[] LinearLayoutCompat = new int[]{
         16842927, 16842948, 16843046, 16843047, 16843048, 2130968960, 2130968968, 2130969414, 2130969656
      };
      public static final int[] LinearLayoutCompat_Layout = new int[]{16842931, 16842996, 16842997, 16843137};
      public static final int LinearLayoutCompat_Layout_android_layout_gravity = 0;
      public static final int LinearLayoutCompat_Layout_android_layout_height = 2;
      public static final int LinearLayoutCompat_Layout_android_layout_weight = 3;
      public static final int LinearLayoutCompat_Layout_android_layout_width = 1;
      public static final int LinearLayoutCompat_android_baselineAligned = 2;
      public static final int LinearLayoutCompat_android_baselineAlignedChildIndex = 3;
      public static final int LinearLayoutCompat_android_gravity = 0;
      public static final int LinearLayoutCompat_android_orientation = 1;
      public static final int LinearLayoutCompat_android_weightSum = 4;
      public static final int LinearLayoutCompat_divider = 5;
      public static final int LinearLayoutCompat_dividerPadding = 6;
      public static final int LinearLayoutCompat_measureWithLargestChild = 7;
      public static final int LinearLayoutCompat_showDividers = 8;
      public static final int[] LinearProgressIndicator = new int[]{2130969170, 2130969174};
      public static final int LinearProgressIndicator_indeterminateAnimationType = 0;
      public static final int LinearProgressIndicator_indicatorDirectionLinear = 1;
      public static final int[] ListPopupWindow = new int[]{16843436, 16843437};
      public static final int ListPopupWindow_android_dropDownHorizontalOffset = 0;
      public static final int ListPopupWindow_android_dropDownVerticalOffset = 1;
      public static final int[] LoadingImageView = new int[]{2130968797, 2130969167, 2130969168};
      public static final int LoadingImageView_circleCrop = 0;
      public static final int LoadingImageView_imageAspectRatio = 1;
      public static final int LoadingImageView_imageAspectRatioAdjust = 2;
      public static final int[] LottieAnimationView = new int[]{
         2130969330,
         2130969331,
         2130969332,
         2130969333,
         2130969334,
         2130969335,
         2130969336,
         2130969337,
         2130969338,
         2130969339,
         2130969340,
         2130969341,
         2130969342,
         2130969343,
         2130969344,
         2130969345,
         2130969346,
         2130969347,
         2130969348,
         2130969349,
         2130969350
      };
      public static final int LottieAnimationView_lottie_asyncUpdates = 0;
      public static final int LottieAnimationView_lottie_autoPlay = 1;
      public static final int LottieAnimationView_lottie_cacheComposition = 2;
      public static final int LottieAnimationView_lottie_clipTextToBoundingBox = 3;
      public static final int LottieAnimationView_lottie_clipToCompositionBounds = 4;
      public static final int LottieAnimationView_lottie_colorFilter = 5;
      public static final int LottieAnimationView_lottie_defaultFontFileExtension = 6;
      public static final int LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove = 7;
      public static final int LottieAnimationView_lottie_fallbackRes = 8;
      public static final int LottieAnimationView_lottie_fileName = 9;
      public static final int LottieAnimationView_lottie_ignoreDisabledSystemAnimations = 10;
      public static final int LottieAnimationView_lottie_imageAssetsFolder = 11;
      public static final int LottieAnimationView_lottie_loop = 12;
      public static final int LottieAnimationView_lottie_progress = 13;
      public static final int LottieAnimationView_lottie_rawRes = 14;
      public static final int LottieAnimationView_lottie_renderMode = 15;
      public static final int LottieAnimationView_lottie_repeatCount = 16;
      public static final int LottieAnimationView_lottie_repeatMode = 17;
      public static final int LottieAnimationView_lottie_speed = 18;
      public static final int LottieAnimationView_lottie_url = 19;
      public static final int LottieAnimationView_lottie_useCompositionFrameRate = 20;
      public static final int[] MaterialAlertDialog = new int[]{2130968671, 2130968672, 2130968673, 2130968674};
      public static final int[] MaterialAlertDialogTheme = new int[]{2130969357, 2130969358, 2130969359, 2130969360, 2130969361, 2130969362};
      public static final int MaterialAlertDialogTheme_materialAlertDialogBodyTextStyle = 0;
      public static final int MaterialAlertDialogTheme_materialAlertDialogButtonSpacerVisibility = 1;
      public static final int MaterialAlertDialogTheme_materialAlertDialogTheme = 2;
      public static final int MaterialAlertDialogTheme_materialAlertDialogTitleIconStyle = 3;
      public static final int MaterialAlertDialogTheme_materialAlertDialogTitlePanelStyle = 4;
      public static final int MaterialAlertDialogTheme_materialAlertDialogTitleTextStyle = 5;
      public static final int MaterialAlertDialog_backgroundInsetBottom = 0;
      public static final int MaterialAlertDialog_backgroundInsetEnd = 1;
      public static final int MaterialAlertDialog_backgroundInsetStart = 2;
      public static final int MaterialAlertDialog_backgroundInsetTop = 3;
      public static final int[] MaterialAutoCompleteTextView = new int[]{16843296, 16843916, 2130969674, 2130969675, 2130969676, 2130969677};
      public static final int MaterialAutoCompleteTextView_android_inputType = 0;
      public static final int MaterialAutoCompleteTextView_android_popupElevation = 1;
      public static final int MaterialAutoCompleteTextView_simpleItemLayout = 2;
      public static final int MaterialAutoCompleteTextView_simpleItemSelectedColor = 3;
      public static final int MaterialAutoCompleteTextView_simpleItemSelectedRippleColor = 4;
      public static final int MaterialAutoCompleteTextView_simpleItems = 5;
      public static final int[] MaterialButton = new int[]{
         16842964,
         16843191,
         16843192,
         16843193,
         16843194,
         16843237,
         2130968678,
         2130968679,
         2130968919,
         2130968994,
         2130969158,
         2130969160,
         2130969161,
         2130969162,
         2130969164,
         2130969165,
         2130969599,
         2130969637,
         2130969645,
         2130969713,
         2130969714,
         2130969862
      };
      public static final int[] MaterialButtonToggleGroup = new int[]{16842766, 2130968766, 2130969634, 2130969680};
      public static final int MaterialButtonToggleGroup_android_enabled = 0;
      public static final int MaterialButtonToggleGroup_checkedButton = 1;
      public static final int MaterialButtonToggleGroup_selectionRequired = 2;
      public static final int MaterialButtonToggleGroup_singleSelection = 3;
      public static final int MaterialButton_android_background = 0;
      public static final int MaterialButton_android_checkable = 5;
      public static final int MaterialButton_android_insetBottom = 4;
      public static final int MaterialButton_android_insetLeft = 1;
      public static final int MaterialButton_android_insetRight = 2;
      public static final int MaterialButton_android_insetTop = 3;
      public static final int MaterialButton_backgroundTint = 6;
      public static final int MaterialButton_backgroundTintMode = 7;
      public static final int MaterialButton_cornerRadius = 8;
      public static final int MaterialButton_elevation = 9;
      public static final int MaterialButton_icon = 10;
      public static final int MaterialButton_iconGravity = 11;
      public static final int MaterialButton_iconPadding = 12;
      public static final int MaterialButton_iconSize = 13;
      public static final int MaterialButton_iconTint = 14;
      public static final int MaterialButton_iconTintMode = 15;
      public static final int MaterialButton_rippleColor = 16;
      public static final int MaterialButton_shapeAppearance = 17;
      public static final int MaterialButton_shapeAppearanceOverlay = 18;
      public static final int MaterialButton_strokeColor = 19;
      public static final int MaterialButton_strokeWidth = 20;
      public static final int MaterialButton_toggleCheckedStateOnClick = 21;
      public static final int[] MaterialCalendar = new int[]{
         16843277, 2130968943, 2130968944, 2130968945, 2130968946, 2130969478, 2130969584, 2130969946, 2130969947, 2130969948
      };
      public static final int[] MaterialCalendarItem = new int[]{
         16843191, 16843192, 16843193, 16843194, 2130969186, 2130969198, 2130969199, 2130969206, 2130969207, 2130969211
      };
      public static final int MaterialCalendarItem_android_insetBottom = 3;
      public static final int MaterialCalendarItem_android_insetLeft = 0;
      public static final int MaterialCalendarItem_android_insetRight = 1;
      public static final int MaterialCalendarItem_android_insetTop = 2;
      public static final int MaterialCalendarItem_itemFillColor = 4;
      public static final int MaterialCalendarItem_itemShapeAppearance = 5;
      public static final int MaterialCalendarItem_itemShapeAppearanceOverlay = 6;
      public static final int MaterialCalendarItem_itemStrokeColor = 7;
      public static final int MaterialCalendarItem_itemStrokeWidth = 8;
      public static final int MaterialCalendarItem_itemTextColor = 9;
      public static final int MaterialCalendar_android_windowFullscreen = 0;
      public static final int MaterialCalendar_dayInvalidStyle = 1;
      public static final int MaterialCalendar_daySelectedStyle = 2;
      public static final int MaterialCalendar_dayStyle = 3;
      public static final int MaterialCalendar_dayTodayStyle = 4;
      public static final int MaterialCalendar_nestedScrollable = 5;
      public static final int MaterialCalendar_rangeFillColor = 6;
      public static final int MaterialCalendar_yearSelectedStyle = 7;
      public static final int MaterialCalendar_yearStyle = 8;
      public static final int MaterialCalendar_yearTodayStyle = 9;
      public static final int[] MaterialCardView = new int[]{
         16843237,
         2130968755,
         2130968768,
         2130968770,
         2130968771,
         2130968772,
         2130968773,
         2130969599,
         2130969637,
         2130969645,
         2130969704,
         2130969713,
         2130969714
      };
      public static final int MaterialCardView_android_checkable = 0;
      public static final int MaterialCardView_cardForegroundColor = 1;
      public static final int MaterialCardView_checkedIcon = 2;
      public static final int MaterialCardView_checkedIconGravity = 3;
      public static final int MaterialCardView_checkedIconMargin = 4;
      public static final int MaterialCardView_checkedIconSize = 5;
      public static final int MaterialCardView_checkedIconTint = 6;
      public static final int MaterialCardView_rippleColor = 7;
      public static final int MaterialCardView_shapeAppearance = 8;
      public static final int MaterialCardView_shapeAppearanceOverlay = 9;
      public static final int MaterialCardView_state_dragged = 10;
      public static final int MaterialCardView_strokeColor = 11;
      public static final int MaterialCardView_strokeWidth = 12;
      public static final int[] MaterialCheckBox = new int[]{
         16843015, 2130968740, 2130968742, 2130968744, 2130968745, 2130968750, 2130968760, 2130968775, 2130969012, 2130969019, 2130969919
      };
      public static final int[] MaterialCheckBoxStates = new int[]{2130969705, 2130969706};
      public static final int MaterialCheckBoxStates_state_error = 0;
      public static final int MaterialCheckBoxStates_state_indeterminate = 1;
      public static final int MaterialCheckBox_android_button = 0;
      public static final int MaterialCheckBox_buttonCompat = 1;
      public static final int MaterialCheckBox_buttonIcon = 2;
      public static final int MaterialCheckBox_buttonIconTint = 3;
      public static final int MaterialCheckBox_buttonIconTintMode = 4;
      public static final int MaterialCheckBox_buttonTint = 5;
      public static final int MaterialCheckBox_centerIfNoTextEnabled = 6;
      public static final int MaterialCheckBox_checkedState = 7;
      public static final int MaterialCheckBox_errorAccessibilityLabel = 8;
      public static final int MaterialCheckBox_errorShown = 9;
      public static final int MaterialCheckBox_useMaterialThemeColors = 10;
      public static final int[] MaterialDivider = new int[]{2130968961, 2130968966, 2130968967, 2130968969, 2130969223};
      public static final int MaterialDivider_dividerColor = 0;
      public static final int MaterialDivider_dividerInsetEnd = 1;
      public static final int MaterialDivider_dividerInsetStart = 2;
      public static final int MaterialDivider_dividerThickness = 3;
      public static final int MaterialDivider_lastItemDecorated = 4;
      public static final int[] MaterialRadioButton = new int[]{2130968750, 2130969919};
      public static final int MaterialRadioButton_buttonTint = 0;
      public static final int MaterialRadioButton_useMaterialThemeColors = 1;
      public static final int[] MaterialShape = new int[]{2130969637, 2130969645};
      public static final int MaterialShape_shapeAppearance = 0;
      public static final int MaterialShape_shapeAppearanceOverlay = 1;
      public static final int[] MaterialSwitch = new int[]{2130969825, 2130969826, 2130969827, 2130969881, 2130969882, 2130969883};
      public static final int MaterialSwitch_thumbIcon = 0;
      public static final int MaterialSwitch_thumbIconTint = 1;
      public static final int MaterialSwitch_thumbIconTintMode = 2;
      public static final int MaterialSwitch_trackDecoration = 3;
      public static final int MaterialSwitch_trackDecorationTint = 4;
      public static final int MaterialSwitch_trackDecorationTintMode = 5;
      public static final int[] MaterialTextAppearance = new int[]{16843958, 16844159, 2130969304};
      public static final int MaterialTextAppearance_android_letterSpacing = 0;
      public static final int MaterialTextAppearance_android_lineHeight = 1;
      public static final int MaterialTextAppearance_lineHeight = 2;
      public static final int[] MaterialTextView = new int[]{16842804, 16844159, 2130969304};
      public static final int MaterialTextView_android_lineHeight = 1;
      public static final int MaterialTextView_android_textAppearance = 0;
      public static final int MaterialTextView_lineHeight = 2;
      public static final int[] MaterialTimePicker = new int[]{2130968803, 2130969216};
      public static final int MaterialTimePicker_clockIcon = 0;
      public static final int MaterialTimePicker_keyboardIcon = 1;
      public static final int[] MaterialToolbar = new int[]{2130969323, 2130969325, 2130969472, 2130969722, 2130969848};
      public static final int MaterialToolbar_logoAdjustViewBounds = 0;
      public static final int MaterialToolbar_logoScaleType = 1;
      public static final int MaterialToolbar_navigationIconTint = 2;
      public static final int MaterialToolbar_subtitleCentered = 3;
      public static final int MaterialToolbar_titleCentered = 4;
      public static final int[] MenuGroup = new int[]{16842766, 16842960, 16843156, 16843230, 16843231, 16843232};
      public static final int MenuGroup_android_checkableBehavior = 5;
      public static final int MenuGroup_android_enabled = 0;
      public static final int MenuGroup_android_id = 1;
      public static final int MenuGroup_android_menuCategory = 3;
      public static final int MenuGroup_android_orderInCategory = 4;
      public static final int MenuGroup_android_visible = 2;
      public static final int[] MenuItem = new int[]{
         16842754,
         16842766,
         16842960,
         16843014,
         16843156,
         16843230,
         16843231,
         16843233,
         16843234,
         16843235,
         16843236,
         16843237,
         16843375,
         2130968590,
         2130968610,
         2130968612,
         2130968631,
         2130968894,
         2130969164,
         2130969165,
         2130969508,
         2130969651,
         2130969870
      };
      public static final int MenuItem_actionLayout = 13;
      public static final int MenuItem_actionProviderClass = 14;
      public static final int MenuItem_actionViewClass = 15;
      public static final int MenuItem_alphabeticModifiers = 16;
      public static final int MenuItem_android_alphabeticShortcut = 9;
      public static final int MenuItem_android_checkable = 11;
      public static final int MenuItem_android_checked = 3;
      public static final int MenuItem_android_enabled = 1;
      public static final int MenuItem_android_icon = 0;
      public static final int MenuItem_android_id = 2;
      public static final int MenuItem_android_menuCategory = 5;
      public static final int MenuItem_android_numericShortcut = 10;
      public static final int MenuItem_android_onClick = 12;
      public static final int MenuItem_android_orderInCategory = 6;
      public static final int MenuItem_android_title = 7;
      public static final int MenuItem_android_titleCondensed = 8;
      public static final int MenuItem_android_visible = 4;
      public static final int MenuItem_contentDescription = 17;
      public static final int MenuItem_iconTint = 18;
      public static final int MenuItem_iconTintMode = 19;
      public static final int MenuItem_numericModifiers = 20;
      public static final int MenuItem_showAsAction = 21;
      public static final int MenuItem_tooltipText = 22;
      public static final int[] MenuView = new int[]{16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, 2130969572, 2130969715};
      public static final int MenuView_android_headerBackground = 4;
      public static final int MenuView_android_horizontalDivider = 2;
      public static final int MenuView_android_itemBackground = 5;
      public static final int MenuView_android_itemIconDisabledAlpha = 6;
      public static final int MenuView_android_itemTextAppearance = 1;
      public static final int MenuView_android_verticalDivider = 3;
      public static final int MenuView_android_windowAnimationStyle = 0;
      public static final int MenuView_preserveIconSpacing = 7;
      public static final int MenuView_subMenuArrow = 8;
      public static final int[] MockView = new int[]{2130969425, 2130969426, 2130969427, 2130969428, 2130969429, 2130969430};
      public static final int MockView_mock_diagonalsColor = 0;
      public static final int MockView_mock_label = 1;
      public static final int MockView_mock_labelBackgroundColor = 2;
      public static final int MockView_mock_labelColor = 3;
      public static final int MockView_mock_showDiagonals = 4;
      public static final int MockView_mock_showLabel = 5;
      public static final int[] Motion = new int[]{2130968635, 2130968974, 2130969462, 2130969464, 2130969548, 2130969891};
      public static final int[] MotionHelper = new int[]{2130969519, 2130969522};
      public static final int MotionHelper_onHide = 0;
      public static final int MotionHelper_onShow = 1;
      public static final int[] MotionLayout = new int[]{2130968640, 2130968932, 2130969225, 2130969431, 2130969463, 2130969658};
      public static final int MotionLayout_applyMotionScene = 0;
      public static final int MotionLayout_currentState = 1;
      public static final int MotionLayout_layoutDescription = 2;
      public static final int MotionLayout_motionDebug = 3;
      public static final int MotionLayout_motionProgress = 4;
      public static final int MotionLayout_showPaths = 5;
      public static final int[] MotionScene = new int[]{2130968947, 2130969226};
      public static final int MotionScene_defaultDuration = 0;
      public static final int MotionScene_layoutDuringTransition = 1;
      public static final int[] MotionTelltales = new int[]{2130969766, 2130969767, 2130969768};
      public static final int MotionTelltales_telltales_tailColor = 0;
      public static final int MotionTelltales_telltales_tailScale = 1;
      public static final int MotionTelltales_telltales_velocityMode = 2;
      public static final int Motion_animate_relativeTo = 0;
      public static final int Motion_drawPath = 1;
      public static final int Motion_motionPathRotate = 2;
      public static final int Motion_motionStagger = 3;
      public static final int Motion_pathMotionArc = 4;
      public static final int Motion_transitionEasing = 5;
      public static final int[] NavigationBarActiveIndicator = new int[]{16843093, 16843097, 16843173, 2130969351, 2130969637};
      public static final int NavigationBarActiveIndicator_android_color = 2;
      public static final int NavigationBarActiveIndicator_android_height = 0;
      public static final int NavigationBarActiveIndicator_android_width = 1;
      public static final int NavigationBarActiveIndicator_marginHorizontal = 3;
      public static final int NavigationBarActiveIndicator_shapeAppearance = 4;
      public static final int[] NavigationBarView = new int[]{
         2130968678,
         2130968994,
         2130969184,
         2130969185,
         2130969190,
         2130969191,
         2130969195,
         2130969196,
         2130969197,
         2130969209,
         2130969210,
         2130969211,
         2130969221,
         2130969415
      };
      public static final int NavigationBarView_backgroundTint = 0;
      public static final int NavigationBarView_elevation = 1;
      public static final int NavigationBarView_itemActiveIndicatorStyle = 2;
      public static final int NavigationBarView_itemBackground = 3;
      public static final int NavigationBarView_itemIconSize = 4;
      public static final int NavigationBarView_itemIconTint = 5;
      public static final int NavigationBarView_itemPaddingBottom = 6;
      public static final int NavigationBarView_itemPaddingTop = 7;
      public static final int NavigationBarView_itemRippleColor = 8;
      public static final int NavigationBarView_itemTextAppearanceActive = 9;
      public static final int NavigationBarView_itemTextAppearanceInactive = 10;
      public static final int NavigationBarView_itemTextColor = 11;
      public static final int NavigationBarView_labelVisibilityMode = 12;
      public static final int NavigationBarView_menu = 13;
      public static final int[] NavigationRailView = new int[]{2130969135, 2130969193, 2130969417, 2130969533, 2130969539};
      public static final int NavigationRailView_headerLayout = 0;
      public static final int NavigationRailView_itemMinHeight = 1;
      public static final int NavigationRailView_menuGravity = 2;
      public static final int NavigationRailView_paddingBottomSystemWindowInsets = 3;
      public static final int NavigationRailView_paddingTopSystemWindowInsets = 4;
      public static final int[] NavigationView = new int[]{
         16842931,
         16842964,
         16842973,
         16843039,
         2130968717,
         2130968966,
         2130968967,
         2130968985,
         2130968994,
         2130969135,
         2130969185,
         2130969187,
         2130969189,
         2130969190,
         2130969191,
         2130969192,
         2130969197,
         2130969198,
         2130969199,
         2130969200,
         2130969201,
         2130969202,
         2130969203,
         2130969204,
         2130969208,
         2130969211,
         2130969212,
         2130969415,
         2130969637,
         2130969645,
         2130969716,
         2130969717,
         2130969718,
         2130969719,
         2130969871
      };
      public static final int NavigationView_android_background = 1;
      public static final int NavigationView_android_fitsSystemWindows = 2;
      public static final int NavigationView_android_layout_gravity = 0;
      public static final int NavigationView_android_maxWidth = 3;
      public static final int NavigationView_bottomInsetScrimEnabled = 4;
      public static final int NavigationView_dividerInsetEnd = 5;
      public static final int NavigationView_dividerInsetStart = 6;
      public static final int NavigationView_drawerLayoutCornerSize = 7;
      public static final int NavigationView_elevation = 8;
      public static final int NavigationView_headerLayout = 9;
      public static final int NavigationView_itemBackground = 10;
      public static final int NavigationView_itemHorizontalPadding = 11;
      public static final int NavigationView_itemIconPadding = 12;
      public static final int NavigationView_itemIconSize = 13;
      public static final int NavigationView_itemIconTint = 14;
      public static final int NavigationView_itemMaxLines = 15;
      public static final int NavigationView_itemRippleColor = 16;
      public static final int NavigationView_itemShapeAppearance = 17;
      public static final int NavigationView_itemShapeAppearanceOverlay = 18;
      public static final int NavigationView_itemShapeFillColor = 19;
      public static final int NavigationView_itemShapeInsetBottom = 20;
      public static final int NavigationView_itemShapeInsetEnd = 21;
      public static final int NavigationView_itemShapeInsetStart = 22;
      public static final int NavigationView_itemShapeInsetTop = 23;
      public static final int NavigationView_itemTextAppearance = 24;
      public static final int NavigationView_itemTextColor = 25;
      public static final int NavigationView_itemVerticalPadding = 26;
      public static final int NavigationView_menu = 27;
      public static final int NavigationView_shapeAppearance = 28;
      public static final int NavigationView_shapeAppearanceOverlay = 29;
      public static final int NavigationView_subheaderColor = 30;
      public static final int NavigationView_subheaderInsetEnd = 31;
      public static final int NavigationView_subheaderInsetStart = 32;
      public static final int NavigationView_subheaderTextAppearance = 33;
      public static final int NavigationView_topInsetScrimEnabled = 34;
      public static final int[] NumberPickerView = new int[]{
         2130969479,
         2130969480,
         2130969481,
         2130969482,
         2130969483,
         2130969484,
         2130969485,
         2130969486,
         2130969487,
         2130969488,
         2130969489,
         2130969490,
         2130969491,
         2130969492,
         2130969493,
         2130969494,
         2130969495,
         2130969496,
         2130969497,
         2130969498,
         2130969499,
         2130969500,
         2130969501,
         2130969502,
         2130969503,
         2130969504,
         2130969505,
         2130969506
      };
      public static final int NumberPickerView_npv_AlternativeHint = 0;
      public static final int NumberPickerView_npv_AlternativeTextArrayWithMeasureHint = 1;
      public static final int NumberPickerView_npv_AlternativeTextArrayWithoutMeasureHint = 2;
      public static final int NumberPickerView_npv_DividerColor = 3;
      public static final int NumberPickerView_npv_DividerHeight = 4;
      public static final int NumberPickerView_npv_DividerMarginLeft = 5;
      public static final int NumberPickerView_npv_DividerMarginRight = 6;
      public static final int NumberPickerView_npv_EmptyItemHint = 7;
      public static final int NumberPickerView_npv_HintText = 8;
      public static final int NumberPickerView_npv_ItemPaddingHorizontal = 9;
      public static final int NumberPickerView_npv_ItemPaddingVertical = 10;
      public static final int NumberPickerView_npv_MarginEndOfHint = 11;
      public static final int NumberPickerView_npv_MarginStartOfHint = 12;
      public static final int NumberPickerView_npv_MaxValue = 13;
      public static final int NumberPickerView_npv_MinValue = 14;
      public static final int NumberPickerView_npv_RespondChangeInMainThread = 15;
      public static final int NumberPickerView_npv_RespondChangeOnDetached = 16;
      public static final int NumberPickerView_npv_ShowDivider = 17;
      public static final int NumberPickerView_npv_ShownCount = 18;
      public static final int NumberPickerView_npv_TextArray = 19;
      public static final int NumberPickerView_npv_TextColorHint = 20;
      public static final int NumberPickerView_npv_TextColorNormal = 21;
      public static final int NumberPickerView_npv_TextColorSelected = 22;
      public static final int NumberPickerView_npv_TextEllipsize = 23;
      public static final int NumberPickerView_npv_TextSizeHint = 24;
      public static final int NumberPickerView_npv_TextSizeNormal = 25;
      public static final int NumberPickerView_npv_TextSizeSelected = 26;
      public static final int NumberPickerView_npv_WrapSelectorWheel = 27;
      public static final int[] OnClick = new int[]{2130968800, 2130969765};
      public static final int OnClick_clickAction = 0;
      public static final int OnClick_targetId = 1;
      public static final int[] OnSwipe = new int[]{
         2130968971, 2130968972, 2130968973, 2130969303, 2130969402, 2130969410, 2130969468, 2130969476, 2130969523, 2130969872, 2130969873, 2130969874
      };
      public static final int OnSwipe_dragDirection = 0;
      public static final int OnSwipe_dragScale = 1;
      public static final int OnSwipe_dragThreshold = 2;
      public static final int OnSwipe_limitBoundsTo = 3;
      public static final int OnSwipe_maxAcceleration = 4;
      public static final int OnSwipe_maxVelocity = 5;
      public static final int OnSwipe_moveWhenScrollAtTop = 6;
      public static final int OnSwipe_nestedScrollFlags = 7;
      public static final int OnSwipe_onTouchUp = 8;
      public static final int OnSwipe_touchAnchorId = 9;
      public static final int OnSwipe_touchAnchorSide = 10;
      public static final int OnSwipe_touchRegionId = 11;
      public static final int[] OverlappingCirclesView = new int[]{
         2130969509, 2130969510, 2130969511, 2130969512, 2130969513, 2130969514, 2130969515, 2130969516
      };
      public static final int OverlappingCirclesView_oc_circleBgColor = 0;
      public static final int OverlappingCirclesView_oc_maxItems = 1;
      public static final int OverlappingCirclesView_oc_overflowBgColor = 2;
      public static final int OverlappingCirclesView_oc_overflowTextColor = 3;
      public static final int OverlappingCirclesView_oc_overflowTextSize = 4;
      public static final int OverlappingCirclesView_oc_overlap = 5;
      public static final int OverlappingCirclesView_oc_placeholderColor = 6;
      public static final int OverlappingCirclesView_oc_separation = 7;
      public static final int[] PlayerControlView = new int[]{
         2130968617,
         2130968618,
         2130968696,
         2130968697,
         2130968734,
         2130968911,
         2130969562,
         2130969563,
         2130969594,
         2130969622,
         2130969623,
         2130969624,
         2130969625,
         2130969626,
         2130969662,
         2130969663,
         2130969664,
         2130969665,
         2130969666,
         2130969668,
         2130969843,
         2130969875,
         2130969916
      };
      public static final int PlayerControlView_ad_marker_color = 0;
      public static final int PlayerControlView_ad_marker_width = 1;
      public static final int PlayerControlView_bar_gravity = 2;
      public static final int PlayerControlView_bar_height = 3;
      public static final int PlayerControlView_buffered_color = 4;
      public static final int PlayerControlView_controller_layout_id = 5;
      public static final int PlayerControlView_played_ad_marker_color = 6;
      public static final int PlayerControlView_played_color = 7;
      public static final int PlayerControlView_repeat_toggle_modes = 8;
      public static final int PlayerControlView_scrubber_color = 9;
      public static final int PlayerControlView_scrubber_disabled_size = 10;
      public static final int PlayerControlView_scrubber_dragged_size = 11;
      public static final int PlayerControlView_scrubber_drawable = 12;
      public static final int PlayerControlView_scrubber_enabled_size = 13;
      public static final int PlayerControlView_show_fastforward_button = 14;
      public static final int PlayerControlView_show_next_button = 15;
      public static final int PlayerControlView_show_previous_button = 16;
      public static final int PlayerControlView_show_rewind_button = 17;
      public static final int PlayerControlView_show_shuffle_button = 18;
      public static final int PlayerControlView_show_timeout = 19;
      public static final int PlayerControlView_time_bar_min_update_interval = 20;
      public static final int PlayerControlView_touch_target_height = 21;
      public static final int PlayerControlView_unplayed_color = 22;
      public static final int[] PlayerView = new int[]{
         2130968617,
         2130968618,
         2130968662,
         2130968697,
         2130968734,
         2130968911,
         2130968952,
         2130969146,
         2130969147,
         2130969214,
         2130969562,
         2130969563,
         2130969564,
         2130969594,
         2130969595,
         2130969622,
         2130969623,
         2130969624,
         2130969625,
         2130969626,
         2130969661,
         2130969666,
         2130969668,
         2130969671,
         2130969730,
         2130969843,
         2130969875,
         2130969916,
         2130969920,
         2130969921
      };
      public static final int PlayerView_ad_marker_color = 0;
      public static final int PlayerView_ad_marker_width = 1;
      public static final int PlayerView_auto_show = 2;
      public static final int PlayerView_bar_height = 3;
      public static final int PlayerView_buffered_color = 4;
      public static final int PlayerView_controller_layout_id = 5;
      public static final int PlayerView_default_artwork = 6;
      public static final int PlayerView_hide_during_ads = 7;
      public static final int PlayerView_hide_on_touch = 8;
      public static final int PlayerView_keep_content_on_player_reset = 9;
      public static final int PlayerView_played_ad_marker_color = 10;
      public static final int PlayerView_played_color = 11;
      public static final int PlayerView_player_layout_id = 12;
      public static final int PlayerView_repeat_toggle_modes = 13;
      public static final int PlayerView_resize_mode = 14;
      public static final int PlayerView_scrubber_color = 15;
      public static final int PlayerView_scrubber_disabled_size = 16;
      public static final int PlayerView_scrubber_dragged_size = 17;
      public static final int PlayerView_scrubber_drawable = 18;
      public static final int PlayerView_scrubber_enabled_size = 19;
      public static final int PlayerView_show_buffering = 20;
      public static final int PlayerView_show_shuffle_button = 21;
      public static final int PlayerView_show_timeout = 22;
      public static final int PlayerView_shutter_background_color = 23;
      public static final int PlayerView_surface_type = 24;
      public static final int PlayerView_time_bar_min_update_interval = 25;
      public static final int PlayerView_touch_target_height = 26;
      public static final int PlayerView_unplayed_color = 27;
      public static final int PlayerView_use_artwork = 28;
      public static final int PlayerView_use_controller = 29;
      public static final int[] PollMediaView = new int[]{2130968999};
      public static final int PollMediaView_emojiSize = 0;
      public static final int[] PopupWindow = new int[]{16843126, 16843465, 2130969528};
      public static final int[] PopupWindowBackgroundState = new int[]{2130969701};
      public static final int PopupWindowBackgroundState_state_above_anchor = 0;
      public static final int PopupWindow_android_popupAnimationStyle = 1;
      public static final int PopupWindow_android_popupBackground = 0;
      public static final int PopupWindow_overlapAnchor = 2;
      public static final int[] PropertySet = new int[]{16842972, 16843551, 2130969265, 2130969463, 2130969928};
      public static final int PropertySet_android_alpha = 1;
      public static final int PropertySet_android_visibility = 0;
      public static final int PropertySet_layout_constraintTag = 2;
      public static final int PropertySet_motionProgress = 3;
      public static final int PropertySet_visibilityMode = 4;
      public static final int[] RadialViewGroup = new int[]{2130969385};
      public static final int RadialViewGroup_materialCircleRadius = 0;
      public static final int[] RangeSlider = new int[]{2130969420, 2130969922};
      public static final int RangeSlider_minSeparation = 0;
      public static final int RangeSlider_values = 1;
      public static final int[] RecycleListView = new int[]{2130969532, 2130969538};
      public static final int RecycleListView_paddingBottomNoButtons = 0;
      public static final int RecycleListView_paddingTopNoTitle = 1;
      public static final int[] RecyclerView = new int[]{
         16842948, 16842987, 16842993, 2130969053, 2130969054, 2130969055, 2130969056, 2130969057, 2130969227, 2130969598, 2130969686, 2130969692
      };
      public static final int RecyclerView_android_clipToPadding = 1;
      public static final int RecyclerView_android_descendantFocusability = 2;
      public static final int RecyclerView_android_orientation = 0;
      public static final int RecyclerView_fastScrollEnabled = 3;
      public static final int RecyclerView_fastScrollHorizontalThumbDrawable = 4;
      public static final int RecyclerView_fastScrollHorizontalTrackDrawable = 5;
      public static final int RecyclerView_fastScrollVerticalThumbDrawable = 6;
      public static final int RecyclerView_fastScrollVerticalTrackDrawable = 7;
      public static final int RecyclerView_layoutManager = 8;
      public static final int RecyclerView_reverseLayout = 9;
      public static final int RecyclerView_spanCount = 10;
      public static final int RecyclerView_stackFromEnd = 11;
      public static final int[] ScrimInsetsFrameLayout = new int[]{2130969178};
      public static final int ScrimInsetsFrameLayout_insetForeground = 0;
      public static final int[] ScrollingViewBehavior_Layout = new int[]{2130968708};
      public static final int ScrollingViewBehavior_Layout_behavior_overlapTop = 0;
      public static final int[] SearchBar = new int[]{
         16842804, 16843087, 16843088, 2130968948, 2130968950, 2130968994, 2130969116, 2130969143, 2130969472, 2130969713, 2130969714, 2130969846
      };
      public static final int SearchBar_android_hint = 2;
      public static final int SearchBar_android_text = 1;
      public static final int SearchBar_android_textAppearance = 0;
      public static final int SearchBar_defaultMarginsEnabled = 3;
      public static final int SearchBar_defaultScrollFlagsEnabled = 4;
      public static final int SearchBar_elevation = 5;
      public static final int SearchBar_forceDefaultNavigationOnClickListener = 6;
      public static final int SearchBar_hideNavigationIcon = 7;
      public static final int SearchBar_navigationIconTint = 8;
      public static final int SearchBar_strokeColor = 9;
      public static final int SearchBar_strokeWidth = 10;
      public static final int SearchBar_tintNavigationIcon = 11;
      public static final int[] SearchView = new int[]{
         16842804,
         16842970,
         16843039,
         16843087,
         16843088,
         16843296,
         16843364,
         2130968633,
         2130968634,
         2130968655,
         2130968805,
         2130968886,
         2130968949,
         2130969131,
         2130969135,
         2130969143,
         2130969166,
         2130969224,
         2130969580,
         2130969581,
         2130969627,
         2130969628,
         2130969629,
         2130969720,
         2130969729,
         2130969918,
         2130969929
      };
      public static final int SearchView_android_focusable = 1;
      public static final int SearchView_android_hint = 4;
      public static final int SearchView_android_imeOptions = 6;
      public static final int SearchView_android_inputType = 5;
      public static final int SearchView_android_maxWidth = 2;
      public static final int SearchView_android_text = 3;
      public static final int SearchView_android_textAppearance = 0;
      public static final int SearchView_animateMenuItems = 7;
      public static final int SearchView_animateNavigationIcon = 8;
      public static final int SearchView_autoShowKeyboard = 9;
      public static final int SearchView_closeIcon = 10;
      public static final int SearchView_commitIcon = 11;
      public static final int SearchView_defaultQueryHint = 12;
      public static final int SearchView_goIcon = 13;
      public static final int SearchView_headerLayout = 14;
      public static final int SearchView_hideNavigationIcon = 15;
      public static final int SearchView_iconifiedByDefault = 16;
      public static final int SearchView_layout = 17;
      public static final int SearchView_queryBackground = 18;
      public static final int SearchView_queryHint = 19;
      public static final int SearchView_searchHintIcon = 20;
      public static final int SearchView_searchIcon = 21;
      public static final int SearchView_searchPrefixText = 22;
      public static final int SearchView_submitBackground = 23;
      public static final int SearchView_suggestionRowLayout = 24;
      public static final int SearchView_useDrawerArrowDrawable = 25;
      public static final int SearchView_voiceIcon = 26;
      public static final int[] ShapeAppearance = new int[]{
         2130968914, 2130968915, 2130968916, 2130968917, 2130968918, 2130968920, 2130968921, 2130968922, 2130968923, 2130968924
      };
      public static final int ShapeAppearance_cornerFamily = 0;
      public static final int ShapeAppearance_cornerFamilyBottomLeft = 1;
      public static final int ShapeAppearance_cornerFamilyBottomRight = 2;
      public static final int ShapeAppearance_cornerFamilyTopLeft = 3;
      public static final int ShapeAppearance_cornerFamilyTopRight = 4;
      public static final int ShapeAppearance_cornerSize = 5;
      public static final int ShapeAppearance_cornerSizeBottomLeft = 6;
      public static final int ShapeAppearance_cornerSizeBottomRight = 7;
      public static final int ShapeAppearance_cornerSizeTopLeft = 8;
      public static final int ShapeAppearance_cornerSizeTopRight = 9;
      public static final int[] ShapeableImageView = new int[]{
         2130968901, 2130968902, 2130968903, 2130968904, 2130968905, 2130968906, 2130968907, 2130969637, 2130969645, 2130969713, 2130969714
      };
      public static final int ShapeableImageView_contentPadding = 0;
      public static final int ShapeableImageView_contentPaddingBottom = 1;
      public static final int ShapeableImageView_contentPaddingEnd = 2;
      public static final int ShapeableImageView_contentPaddingLeft = 3;
      public static final int ShapeableImageView_contentPaddingRight = 4;
      public static final int ShapeableImageView_contentPaddingStart = 5;
      public static final int ShapeableImageView_contentPaddingTop = 6;
      public static final int ShapeableImageView_shapeAppearance = 7;
      public static final int ShapeableImageView_shapeAppearanceOverlay = 8;
      public static final int ShapeableImageView_strokeColor = 9;
      public static final int ShapeableImageView_strokeWidth = 10;
      public static final int[] SideSheetBehavior_Layout = new int[]{16843039, 16843040, 16843840, 2130968678, 2130968703, 2130968913, 2130969637, 2130969645};
      public static final int SideSheetBehavior_Layout_android_elevation = 2;
      public static final int SideSheetBehavior_Layout_android_maxHeight = 1;
      public static final int SideSheetBehavior_Layout_android_maxWidth = 0;
      public static final int SideSheetBehavior_Layout_backgroundTint = 3;
      public static final int SideSheetBehavior_Layout_behavior_draggable = 4;
      public static final int SideSheetBehavior_Layout_coplanarSiblingViewId = 5;
      public static final int SideSheetBehavior_Layout_shapeAppearance = 6;
      public static final int SideSheetBehavior_Layout_shapeAppearanceOverlay = 7;
      public static final int[] SignInButton = new int[]{2130968747, 2130968865, 2130969617};
      public static final int SignInButton_buttonSize = 0;
      public static final int SignInButton_colorScheme = 1;
      public static final int SignInButton_scopeUris = 2;
      public static final int[] SimpleDraweeView = new int[]{
         2130968614,
         2130968615,
         2130968616,
         2130968670,
         2130969050,
         2130969051,
         2130969052,
         2130969530,
         2130969556,
         2130969557,
         2130969573,
         2130969575,
         2130969576,
         2130969577,
         2130969596,
         2130969597,
         2130969601,
         2130969602,
         2130969603,
         2130969604,
         2130969605,
         2130969607,
         2130969608,
         2130969609,
         2130969610,
         2130969611,
         2130969612,
         2130969613,
         2130969614,
         2130969615,
         2130969926
      };
      public static final int SimpleDraweeView_actualImageResource = 0;
      public static final int SimpleDraweeView_actualImageScaleType = 1;
      public static final int SimpleDraweeView_actualImageUri = 2;
      public static final int SimpleDraweeView_backgroundImage = 3;
      public static final int SimpleDraweeView_fadeDuration = 4;
      public static final int SimpleDraweeView_failureImage = 5;
      public static final int SimpleDraweeView_failureImageScaleType = 6;
      public static final int SimpleDraweeView_overlayImage = 7;
      public static final int SimpleDraweeView_placeholderImage = 8;
      public static final int SimpleDraweeView_placeholderImageScaleType = 9;
      public static final int SimpleDraweeView_pressedStateOverlayImage = 10;
      public static final int SimpleDraweeView_progressBarAutoRotateInterval = 11;
      public static final int SimpleDraweeView_progressBarImage = 12;
      public static final int SimpleDraweeView_progressBarImageScaleType = 13;
      public static final int SimpleDraweeView_retryImage = 14;
      public static final int SimpleDraweeView_retryImageScaleType = 15;
      public static final int SimpleDraweeView_roundAsCircle = 16;
      public static final int SimpleDraweeView_roundBottomEnd = 17;
      public static final int SimpleDraweeView_roundBottomLeft = 18;
      public static final int SimpleDraweeView_roundBottomRight = 19;
      public static final int SimpleDraweeView_roundBottomStart = 20;
      public static final int SimpleDraweeView_roundTopEnd = 21;
      public static final int SimpleDraweeView_roundTopLeft = 22;
      public static final int SimpleDraweeView_roundTopRight = 23;
      public static final int SimpleDraweeView_roundTopStart = 24;
      public static final int SimpleDraweeView_roundWithOverlayColor = 25;
      public static final int SimpleDraweeView_roundedCornerRadius = 26;
      public static final int SimpleDraweeView_roundingBorderColor = 27;
      public static final int SimpleDraweeView_roundingBorderPadding = 28;
      public static final int SimpleDraweeView_roundingBorderWidth = 29;
      public static final int SimpleDraweeView_viewAspectRatio = 30;
      public static final int[] Slider = new int[]{
         16842766,
         16842788,
         16843078,
         16843486,
         16843487,
         2130969132,
         2130969133,
         2130969219,
         2130969220,
         2130969421,
         2130969823,
         2130969824,
         2130969828,
         2130969829,
         2130969830,
         2130969834,
         2130969835,
         2130969836,
         2130969840,
         2130969841,
         2130969842,
         2130969877,
         2130969878,
         2130969879,
         2130969884
      };
      public static final int Slider_android_enabled = 0;
      public static final int Slider_android_stepSize = 2;
      public static final int Slider_android_value = 1;
      public static final int Slider_android_valueFrom = 3;
      public static final int Slider_android_valueTo = 4;
      public static final int Slider_haloColor = 5;
      public static final int Slider_haloRadius = 6;
      public static final int Slider_labelBehavior = 7;
      public static final int Slider_labelStyle = 8;
      public static final int Slider_minTouchTargetSize = 9;
      public static final int Slider_thumbColor = 10;
      public static final int Slider_thumbElevation = 11;
      public static final int Slider_thumbRadius = 12;
      public static final int Slider_thumbStrokeColor = 13;
      public static final int Slider_thumbStrokeWidth = 14;
      public static final int Slider_tickColor = 15;
      public static final int Slider_tickColorActive = 16;
      public static final int Slider_tickColorInactive = 17;
      public static final int Slider_tickRadiusActive = 18;
      public static final int Slider_tickRadiusInactive = 19;
      public static final int Slider_tickVisible = 20;
      public static final int Slider_trackColor = 21;
      public static final int Slider_trackColorActive = 22;
      public static final int Slider_trackColorInactive = 23;
      public static final int Slider_trackHeight = 24;
      public static final int[] Snackbar = new int[]{2130969683, 2130969684, 2130969685};
      public static final int[] SnackbarLayout = new int[]{
         16843039, 2130968611, 2130968637, 2130968675, 2130968678, 2130968679, 2130968994, 2130969403, 2130969637, 2130969645
      };
      public static final int SnackbarLayout_actionTextColorAlpha = 1;
      public static final int SnackbarLayout_android_maxWidth = 0;
      public static final int SnackbarLayout_animationMode = 2;
      public static final int SnackbarLayout_backgroundOverlayColorAlpha = 3;
      public static final int SnackbarLayout_backgroundTint = 4;
      public static final int SnackbarLayout_backgroundTintMode = 5;
      public static final int SnackbarLayout_elevation = 6;
      public static final int SnackbarLayout_maxActionInlineWidth = 7;
      public static final int SnackbarLayout_shapeAppearance = 8;
      public static final int SnackbarLayout_shapeAppearanceOverlay = 9;
      public static final int Snackbar_snackbarButtonStyle = 0;
      public static final int Snackbar_snackbarStyle = 1;
      public static final int Snackbar_snackbarTextViewStyle = 2;
      public static final int[] Spinner = new int[]{16842930, 16843126, 16843131, 16843362, 2130969567};
      public static final int Spinner_android_dropDownWidth = 3;
      public static final int Spinner_android_entries = 0;
      public static final int Spinner_android_popupBackground = 1;
      public static final int Spinner_android_prompt = 2;
      public static final int Spinner_popupTheme = 4;
      public static final int[] State = new int[]{16842960, 2130968892};
      public static final int[] StateListDrawable = new int[]{16843036, 16843156, 16843157, 16843158, 16843532, 16843533};
      public static final int[] StateListDrawableItem = new int[]{16843161};
      public static final int StateListDrawableItem_android_drawable = 0;
      public static final int StateListDrawable_android_constantSize = 3;
      public static final int StateListDrawable_android_dither = 0;
      public static final int StateListDrawable_android_enterFadeDuration = 4;
      public static final int StateListDrawable_android_exitFadeDuration = 5;
      public static final int StateListDrawable_android_variablePadding = 2;
      public static final int StateListDrawable_android_visible = 1;
      public static final int[] StateSet = new int[]{2130968951};
      public static final int StateSet_defaultState = 0;
      public static final int State_android_id = 0;
      public static final int State_constraints = 1;
      public static final int[] StyledPlayerControlView = new int[]{
         2130968617,
         2130968618,
         2130968638,
         2130968696,
         2130968697,
         2130968734,
         2130968911,
         2130969562,
         2130969563,
         2130969594,
         2130969622,
         2130969623,
         2130969624,
         2130969625,
         2130969626,
         2130969662,
         2130969663,
         2130969664,
         2130969665,
         2130969666,
         2130969667,
         2130969668,
         2130969669,
         2130969843,
         2130969875,
         2130969916
      };
      public static final int StyledPlayerControlView_ad_marker_color = 0;
      public static final int StyledPlayerControlView_ad_marker_width = 1;
      public static final int StyledPlayerControlView_animation_enabled = 2;
      public static final int StyledPlayerControlView_bar_gravity = 3;
      public static final int StyledPlayerControlView_bar_height = 4;
      public static final int StyledPlayerControlView_buffered_color = 5;
      public static final int StyledPlayerControlView_controller_layout_id = 6;
      public static final int StyledPlayerControlView_played_ad_marker_color = 7;
      public static final int StyledPlayerControlView_played_color = 8;
      public static final int StyledPlayerControlView_repeat_toggle_modes = 9;
      public static final int StyledPlayerControlView_scrubber_color = 10;
      public static final int StyledPlayerControlView_scrubber_disabled_size = 11;
      public static final int StyledPlayerControlView_scrubber_dragged_size = 12;
      public static final int StyledPlayerControlView_scrubber_drawable = 13;
      public static final int StyledPlayerControlView_scrubber_enabled_size = 14;
      public static final int StyledPlayerControlView_show_fastforward_button = 15;
      public static final int StyledPlayerControlView_show_next_button = 16;
      public static final int StyledPlayerControlView_show_previous_button = 17;
      public static final int StyledPlayerControlView_show_rewind_button = 18;
      public static final int StyledPlayerControlView_show_shuffle_button = 19;
      public static final int StyledPlayerControlView_show_subtitle_button = 20;
      public static final int StyledPlayerControlView_show_timeout = 21;
      public static final int StyledPlayerControlView_show_vr_button = 22;
      public static final int StyledPlayerControlView_time_bar_min_update_interval = 23;
      public static final int StyledPlayerControlView_touch_target_height = 24;
      public static final int StyledPlayerControlView_unplayed_color = 25;
      public static final int[] StyledPlayerView = new int[]{
         2130968617,
         2130968618,
         2130968638,
         2130968644,
         2130968662,
         2130968696,
         2130968697,
         2130968734,
         2130968911,
         2130968952,
         2130969146,
         2130969147,
         2130969214,
         2130969562,
         2130969563,
         2130969564,
         2130969594,
         2130969595,
         2130969622,
         2130969623,
         2130969624,
         2130969625,
         2130969626,
         2130969661,
         2130969666,
         2130969667,
         2130969668,
         2130969669,
         2130969671,
         2130969730,
         2130969843,
         2130969875,
         2130969916,
         2130969920,
         2130969921
      };
      public static final int StyledPlayerView_ad_marker_color = 0;
      public static final int StyledPlayerView_ad_marker_width = 1;
      public static final int StyledPlayerView_animation_enabled = 2;
      public static final int StyledPlayerView_artwork_display_mode = 3;
      public static final int StyledPlayerView_auto_show = 4;
      public static final int StyledPlayerView_bar_gravity = 5;
      public static final int StyledPlayerView_bar_height = 6;
      public static final int StyledPlayerView_buffered_color = 7;
      public static final int StyledPlayerView_controller_layout_id = 8;
      public static final int StyledPlayerView_default_artwork = 9;
      public static final int StyledPlayerView_hide_during_ads = 10;
      public static final int StyledPlayerView_hide_on_touch = 11;
      public static final int StyledPlayerView_keep_content_on_player_reset = 12;
      public static final int StyledPlayerView_played_ad_marker_color = 13;
      public static final int StyledPlayerView_played_color = 14;
      public static final int StyledPlayerView_player_layout_id = 15;
      public static final int StyledPlayerView_repeat_toggle_modes = 16;
      public static final int StyledPlayerView_resize_mode = 17;
      public static final int StyledPlayerView_scrubber_color = 18;
      public static final int StyledPlayerView_scrubber_disabled_size = 19;
      public static final int StyledPlayerView_scrubber_dragged_size = 20;
      public static final int StyledPlayerView_scrubber_drawable = 21;
      public static final int StyledPlayerView_scrubber_enabled_size = 22;
      public static final int StyledPlayerView_show_buffering = 23;
      public static final int StyledPlayerView_show_shuffle_button = 24;
      public static final int StyledPlayerView_show_subtitle_button = 25;
      public static final int StyledPlayerView_show_timeout = 26;
      public static final int StyledPlayerView_show_vr_button = 27;
      public static final int StyledPlayerView_shutter_background_color = 28;
      public static final int StyledPlayerView_surface_type = 29;
      public static final int StyledPlayerView_time_bar_min_update_interval = 30;
      public static final int StyledPlayerView_touch_target_height = 31;
      public static final int StyledPlayerView_unplayed_color = 32;
      public static final int StyledPlayerView_use_artwork = 33;
      public static final int StyledPlayerView_use_controller = 34;
      public static final int[] SwipeRefreshLayout = new int[]{2130969731};
      public static final int SwipeRefreshLayout_swipeRefreshLayoutProgressSpinnerBackgroundColor = 0;
      public static final int[] SwitchCompat = new int[]{
         16843044,
         16843045,
         16843074,
         2130969659,
         2130969690,
         2130969732,
         2130969733,
         2130969735,
         2130969831,
         2130969832,
         2130969833,
         2130969876,
         2130969886,
         2130969887
      };
      public static final int SwitchCompat_android_textOff = 1;
      public static final int SwitchCompat_android_textOn = 0;
      public static final int SwitchCompat_android_thumb = 2;
      public static final int SwitchCompat_showText = 3;
      public static final int SwitchCompat_splitTrack = 4;
      public static final int SwitchCompat_switchMinWidth = 5;
      public static final int SwitchCompat_switchPadding = 6;
      public static final int SwitchCompat_switchTextAppearance = 7;
      public static final int SwitchCompat_thumbTextPadding = 8;
      public static final int SwitchCompat_thumbTint = 9;
      public static final int SwitchCompat_thumbTintMode = 10;
      public static final int SwitchCompat_track = 11;
      public static final int SwitchCompat_trackTint = 12;
      public static final int SwitchCompat_trackTintMode = 13;
      public static final int[] SwitchMaterial = new int[]{2130969919};
      public static final int SwitchMaterial_useMaterialThemeColors = 0;
      public static final int[] TabItem = new int[]{16842754, 16842994, 16843087};
      public static final int TabItem_android_icon = 0;
      public static final int TabItem_android_layout = 1;
      public static final int TabItem_android_text = 2;
      public static final int[] TabLayout = new int[]{
         2130969736,
         2130969737,
         2130969738,
         2130969739,
         2130969740,
         2130969741,
         2130969742,
         2130969743,
         2130969744,
         2130969745,
         2130969746,
         2130969747,
         2130969748,
         2130969749,
         2130969750,
         2130969751,
         2130969752,
         2130969753,
         2130969754,
         2130969755,
         2130969756,
         2130969757,
         2130969759,
         2130969760,
         2130969762,
         2130969763,
         2130969764
      };
      public static final int TabLayout_tabBackground = 0;
      public static final int TabLayout_tabContentStart = 1;
      public static final int TabLayout_tabGravity = 2;
      public static final int TabLayout_tabIconTint = 3;
      public static final int TabLayout_tabIconTintMode = 4;
      public static final int TabLayout_tabIndicator = 5;
      public static final int TabLayout_tabIndicatorAnimationDuration = 6;
      public static final int TabLayout_tabIndicatorAnimationMode = 7;
      public static final int TabLayout_tabIndicatorColor = 8;
      public static final int TabLayout_tabIndicatorFullWidth = 9;
      public static final int TabLayout_tabIndicatorGravity = 10;
      public static final int TabLayout_tabIndicatorHeight = 11;
      public static final int TabLayout_tabInlineLabel = 12;
      public static final int TabLayout_tabMaxWidth = 13;
      public static final int TabLayout_tabMinWidth = 14;
      public static final int TabLayout_tabMode = 15;
      public static final int TabLayout_tabPadding = 16;
      public static final int TabLayout_tabPaddingBottom = 17;
      public static final int TabLayout_tabPaddingEnd = 18;
      public static final int TabLayout_tabPaddingStart = 19;
      public static final int TabLayout_tabPaddingTop = 20;
      public static final int TabLayout_tabRippleColor = 21;
      public static final int TabLayout_tabSelectedTextAppearance = 22;
      public static final int TabLayout_tabSelectedTextColor = 23;
      public static final int TabLayout_tabTextAppearance = 24;
      public static final int TabLayout_tabTextColor = 25;
      public static final int TabLayout_tabUnboundedRipple = 26;
      public static final int[] TextAppearance = new int[]{
         16842901,
         16842902,
         16842903,
         16842904,
         16842906,
         16842907,
         16843105,
         16843106,
         16843107,
         16843108,
         16843692,
         16844165,
         2130969104,
         2130969113,
         2130969769,
         2130969818
      };
      public static final int TextAppearance_android_fontFamily = 10;
      public static final int TextAppearance_android_shadowColor = 6;
      public static final int TextAppearance_android_shadowDx = 7;
      public static final int TextAppearance_android_shadowDy = 8;
      public static final int TextAppearance_android_shadowRadius = 9;
      public static final int TextAppearance_android_textColor = 3;
      public static final int TextAppearance_android_textColorHint = 4;
      public static final int TextAppearance_android_textColorLink = 5;
      public static final int TextAppearance_android_textFontWeight = 11;
      public static final int TextAppearance_android_textSize = 0;
      public static final int TextAppearance_android_textStyle = 2;
      public static final int TextAppearance_android_typeface = 1;
      public static final int TextAppearance_fontFamily = 12;
      public static final int TextAppearance_fontVariationSettings = 13;
      public static final int TextAppearance_textAllCaps = 14;
      public static final int TextAppearance_textLocale = 15;
      public static final int[] TextInputEditText = new int[]{2130969813};
      public static final int TextInputEditText_textInputLayoutFocusedRectEnabled = 0;
      public static final int[] TextInputLayout = new int[]{
         16842766,
         16842906,
         16843039,
         16843071,
         16843088,
         16843095,
         16843098,
         2130968722,
         2130968723,
         2130968724,
         2130968725,
         2130968726,
         2130968727,
         2130968728,
         2130968729,
         2130968730,
         2130968731,
         2130968732,
         2130968925,
         2130968926,
         2130968927,
         2130968928,
         2130968929,
         2130968930,
         2130969001,
         2130969002,
         2130969003,
         2130969004,
         2130969005,
         2130969006,
         2130969007,
         2130969008,
         2130969013,
         2130969014,
         2130969015,
         2130969016,
         2130969017,
         2130969018,
         2130969020,
         2130969021,
         2130969024,
         2130969137,
         2130969138,
         2130969139,
         2130969140,
         2130969148,
         2130969149,
         2130969150,
         2130969151,
         2130969543,
         2130969544,
         2130969545,
         2130969546,
         2130969547,
         2130969558,
         2130969559,
         2130969560,
         2130969569,
         2130969570,
         2130969571,
         2130969637,
         2130969645,
         2130969694,
         2130969695,
         2130969696,
         2130969697,
         2130969698,
         2130969699,
         2130969700,
         2130969726,
         2130969727,
         2130969728
      };
      public static final int TextInputLayout_android_enabled = 0;
      public static final int TextInputLayout_android_hint = 4;
      public static final int TextInputLayout_android_maxEms = 5;
      public static final int TextInputLayout_android_maxWidth = 2;
      public static final int TextInputLayout_android_minEms = 6;
      public static final int TextInputLayout_android_minWidth = 3;
      public static final int TextInputLayout_android_textColorHint = 1;
      public static final int TextInputLayout_boxBackgroundColor = 7;
      public static final int TextInputLayout_boxBackgroundMode = 8;
      public static final int TextInputLayout_boxCollapsedPaddingTop = 9;
      public static final int TextInputLayout_boxCornerRadiusBottomEnd = 10;
      public static final int TextInputLayout_boxCornerRadiusBottomStart = 11;
      public static final int TextInputLayout_boxCornerRadiusTopEnd = 12;
      public static final int TextInputLayout_boxCornerRadiusTopStart = 13;
      public static final int TextInputLayout_boxStrokeColor = 14;
      public static final int TextInputLayout_boxStrokeErrorColor = 15;
      public static final int TextInputLayout_boxStrokeWidth = 16;
      public static final int TextInputLayout_boxStrokeWidthFocused = 17;
      public static final int TextInputLayout_counterEnabled = 18;
      public static final int TextInputLayout_counterMaxLength = 19;
      public static final int TextInputLayout_counterOverflowTextAppearance = 20;
      public static final int TextInputLayout_counterOverflowTextColor = 21;
      public static final int TextInputLayout_counterTextAppearance = 22;
      public static final int TextInputLayout_counterTextColor = 23;
      public static final int TextInputLayout_endIconCheckable = 24;
      public static final int TextInputLayout_endIconContentDescription = 25;
      public static final int TextInputLayout_endIconDrawable = 26;
      public static final int TextInputLayout_endIconMinSize = 27;
      public static final int TextInputLayout_endIconMode = 28;
      public static final int TextInputLayout_endIconScaleType = 29;
      public static final int TextInputLayout_endIconTint = 30;
      public static final int TextInputLayout_endIconTintMode = 31;
      public static final int TextInputLayout_errorAccessibilityLiveRegion = 32;
      public static final int TextInputLayout_errorContentDescription = 33;
      public static final int TextInputLayout_errorEnabled = 34;
      public static final int TextInputLayout_errorIconDrawable = 35;
      public static final int TextInputLayout_errorIconTint = 36;
      public static final int TextInputLayout_errorIconTintMode = 37;
      public static final int TextInputLayout_errorTextAppearance = 38;
      public static final int TextInputLayout_errorTextColor = 39;
      public static final int TextInputLayout_expandedHintEnabled = 40;
      public static final int TextInputLayout_helperText = 41;
      public static final int TextInputLayout_helperTextEnabled = 42;
      public static final int TextInputLayout_helperTextTextAppearance = 43;
      public static final int TextInputLayout_helperTextTextColor = 44;
      public static final int TextInputLayout_hintAnimationEnabled = 45;
      public static final int TextInputLayout_hintEnabled = 46;
      public static final int TextInputLayout_hintTextAppearance = 47;
      public static final int TextInputLayout_hintTextColor = 48;
      public static final int TextInputLayout_passwordToggleContentDescription = 49;
      public static final int TextInputLayout_passwordToggleDrawable = 50;
      public static final int TextInputLayout_passwordToggleEnabled = 51;
      public static final int TextInputLayout_passwordToggleTint = 52;
      public static final int TextInputLayout_passwordToggleTintMode = 53;
      public static final int TextInputLayout_placeholderText = 54;
      public static final int TextInputLayout_placeholderTextAppearance = 55;
      public static final int TextInputLayout_placeholderTextColor = 56;
      public static final int TextInputLayout_prefixText = 57;
      public static final int TextInputLayout_prefixTextAppearance = 58;
      public static final int TextInputLayout_prefixTextColor = 59;
      public static final int TextInputLayout_shapeAppearance = 60;
      public static final int TextInputLayout_shapeAppearanceOverlay = 61;
      public static final int TextInputLayout_startIconCheckable = 62;
      public static final int TextInputLayout_startIconContentDescription = 63;
      public static final int TextInputLayout_startIconDrawable = 64;
      public static final int TextInputLayout_startIconMinSize = 65;
      public static final int TextInputLayout_startIconScaleType = 66;
      public static final int TextInputLayout_startIconTint = 67;
      public static final int TextInputLayout_startIconTintMode = 68;
      public static final int TextInputLayout_suffixText = 69;
      public static final int TextInputLayout_suffixTextAppearance = 70;
      public static final int TextInputLayout_suffixTextColor = 71;
      public static final int[] ThemeEnforcement = new int[]{16842804, 2130969009, 2130969010};
      public static final int ThemeEnforcement_android_textAppearance = 0;
      public static final int ThemeEnforcement_enforceMaterialTheme = 1;
      public static final int ThemeEnforcement_enforceTextAppearance = 2;
      public static final int[] Toolbar = new int[]{
         16842927,
         16843072,
         2130968741,
         2130968813,
         2130968814,
         2130968895,
         2130968896,
         2130968897,
         2130968898,
         2130968899,
         2130968900,
         2130969322,
         2130969324,
         2130969404,
         2130969415,
         2130969470,
         2130969471,
         2130969567,
         2130969721,
         2130969723,
         2130969724,
         2130969847,
         2130969851,
         2130969852,
         2130969853,
         2130969854,
         2130969855,
         2130969856,
         2130969858,
         2130969859
      };
      public static final int Toolbar_android_gravity = 0;
      public static final int Toolbar_android_minHeight = 1;
      public static final int Toolbar_buttonGravity = 2;
      public static final int Toolbar_collapseContentDescription = 3;
      public static final int Toolbar_collapseIcon = 4;
      public static final int Toolbar_contentInsetEnd = 5;
      public static final int Toolbar_contentInsetEndWithActions = 6;
      public static final int Toolbar_contentInsetLeft = 7;
      public static final int Toolbar_contentInsetRight = 8;
      public static final int Toolbar_contentInsetStart = 9;
      public static final int Toolbar_contentInsetStartWithNavigation = 10;
      public static final int Toolbar_logo = 11;
      public static final int Toolbar_logoDescription = 12;
      public static final int Toolbar_maxButtonHeight = 13;
      public static final int Toolbar_menu = 14;
      public static final int Toolbar_navigationContentDescription = 15;
      public static final int Toolbar_navigationIcon = 16;
      public static final int Toolbar_popupTheme = 17;
      public static final int Toolbar_subtitle = 18;
      public static final int Toolbar_subtitleTextAppearance = 19;
      public static final int Toolbar_subtitleTextColor = 20;
      public static final int Toolbar_title = 21;
      public static final int Toolbar_titleMargin = 22;
      public static final int Toolbar_titleMarginBottom = 23;
      public static final int Toolbar_titleMarginEnd = 24;
      public static final int Toolbar_titleMarginStart = 25;
      public static final int Toolbar_titleMarginTop = 26;
      public static final int Toolbar_titleMargins = 27;
      public static final int Toolbar_titleTextAppearance = 28;
      public static final int Toolbar_titleTextColor = 29;
      public static final int[] Tooltip = new int[]{16842804, 16842904, 16842965, 16842998, 16843071, 16843072, 16843087, 2130968678};
      public static final int Tooltip_android_layout_margin = 3;
      public static final int Tooltip_android_minHeight = 5;
      public static final int Tooltip_android_minWidth = 4;
      public static final int Tooltip_android_padding = 2;
      public static final int Tooltip_android_text = 6;
      public static final int Tooltip_android_textAppearance = 0;
      public static final int Tooltip_android_textColor = 1;
      public static final int Tooltip_backgroundTint = 7;
      public static final int[] Transform = new int[]{
         16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840
      };
      public static final int Transform_android_elevation = 10;
      public static final int Transform_android_rotation = 6;
      public static final int Transform_android_rotationX = 7;
      public static final int Transform_android_rotationY = 8;
      public static final int Transform_android_scaleX = 4;
      public static final int Transform_android_scaleY = 5;
      public static final int Transform_android_transformPivotX = 0;
      public static final int Transform_android_transformPivotY = 1;
      public static final int Transform_android_translationX = 2;
      public static final int Transform_android_translationY = 3;
      public static final int Transform_android_translationZ = 9;
      public static final int[] Transition = new int[]{
         16842960, 2130968661, 2130968889, 2130968890, 2130968989, 2130969226, 2130969460, 2130969548, 2130969693, 2130969890, 2130969892
      };
      public static final int Transition_android_id = 0;
      public static final int Transition_autoTransition = 1;
      public static final int Transition_constraintSetEnd = 2;
      public static final int Transition_constraintSetStart = 3;
      public static final int Transition_duration = 4;
      public static final int Transition_layoutDuringTransition = 5;
      public static final int Transition_motionInterpolator = 6;
      public static final int Transition_pathMotionArc = 7;
      public static final int Transition_staggered = 8;
      public static final int Transition_transitionDisable = 9;
      public static final int Transition_transitionFlags = 10;
      public static final int[] Variant = new int[]{2130968892, 2130969589, 2130969590, 2130969591, 2130969592};
      public static final int Variant_constraints = 0;
      public static final int Variant_region_heightLessThan = 1;
      public static final int Variant_region_heightMoreThan = 2;
      public static final int Variant_region_widthLessThan = 3;
      public static final int Variant_region_widthMoreThan = 4;
      public static final int[] View = new int[]{16842752, 16842970, 2130969534, 2130969537, 2130969820};
      public static final int[] ViewBackgroundHelper = new int[]{16842964, 2130968678, 2130968679};
      public static final int ViewBackgroundHelper_android_background = 0;
      public static final int ViewBackgroundHelper_backgroundTint = 1;
      public static final int ViewBackgroundHelper_backgroundTintMode = 2;
      public static final int[] ViewPager2 = new int[]{16842948};
      public static final int ViewPager2_android_orientation = 0;
      public static final int[] ViewStubCompat = new int[]{16842960, 16842994, 16842995};
      public static final int ViewStubCompat_android_id = 0;
      public static final int ViewStubCompat_android_inflatedId = 2;
      public static final int ViewStubCompat_android_layout = 1;
      public static final int View_android_focusable = 1;
      public static final int View_android_theme = 0;
      public static final int View_paddingEnd = 2;
      public static final int View_paddingStart = 3;
      public static final int View_theme = 4;
      public static final int[] ZoomEngine = new int[]{
         2130968626,
         2130968627,
         2130968636,
         2130969068,
         2130969134,
         2130969156,
         2130969412,
         2130969413,
         2130969423,
         2130969424,
         2130969524,
         2130969525,
         2130969526,
         2130969527,
         2130969621,
         2130969822,
         2130969888,
         2130969889,
         2130969899,
         2130969925,
         2130969949
      };
      public static final int ZoomEngine_alignment = 0;
      public static final int ZoomEngine_allowFlingInOverscroll = 1;
      public static final int ZoomEngine_animationDuration = 2;
      public static final int ZoomEngine_flingEnabled = 3;
      public static final int ZoomEngine_hasClickableChildren = 4;
      public static final int ZoomEngine_horizontalPanEnabled = 5;
      public static final int ZoomEngine_maxZoom = 6;
      public static final int ZoomEngine_maxZoomType = 7;
      public static final int ZoomEngine_minZoom = 8;
      public static final int ZoomEngine_minZoomType = 9;
      public static final int ZoomEngine_oneFingerScrollEnabled = 10;
      public static final int ZoomEngine_overPinchable = 11;
      public static final int ZoomEngine_overScrollHorizontal = 12;
      public static final int ZoomEngine_overScrollVertical = 13;
      public static final int ZoomEngine_scrollEnabled = 14;
      public static final int ZoomEngine_threeFingersScrollEnabled = 15;
      public static final int ZoomEngine_transformation = 16;
      public static final int ZoomEngine_transformationGravity = 17;
      public static final int ZoomEngine_twoFingersScrollEnabled = 18;
      public static final int ZoomEngine_verticalPanEnabled = 19;
      public static final int ZoomEngine_zoomEnabled = 20;
      public static final int[] ucrop_AspectRatioTextView = new int[]{2130969900, 2130969901, 2130969902};
      public static final int ucrop_AspectRatioTextView_ucrop_artv_ratio_title = 0;
      public static final int ucrop_AspectRatioTextView_ucrop_artv_ratio_x = 1;
      public static final int ucrop_AspectRatioTextView_ucrop_artv_ratio_y = 2;
      public static final int[] ucrop_UCropView = new int[]{
         2130969903,
         2130969904,
         2130969905,
         2130969906,
         2130969907,
         2130969908,
         2130969909,
         2130969910,
         2130969911,
         2130969912,
         2130969913,
         2130969914,
         2130969915
      };
      public static final int ucrop_UCropView_ucrop_aspect_ratio_x = 0;
      public static final int ucrop_UCropView_ucrop_aspect_ratio_y = 1;
      public static final int ucrop_UCropView_ucrop_circle_dimmed_layer = 2;
      public static final int ucrop_UCropView_ucrop_dimmed_color = 3;
      public static final int ucrop_UCropView_ucrop_frame_color = 4;
      public static final int ucrop_UCropView_ucrop_frame_stroke_size = 5;
      public static final int ucrop_UCropView_ucrop_grid_color = 6;
      public static final int ucrop_UCropView_ucrop_grid_column_count = 7;
      public static final int ucrop_UCropView_ucrop_grid_row_count = 8;
      public static final int ucrop_UCropView_ucrop_grid_stroke_size = 9;
      public static final int ucrop_UCropView_ucrop_show_frame = 10;
      public static final int ucrop_UCropView_ucrop_show_grid = 11;
      public static final int ucrop_UCropView_ucrop_show_oval_crop_frame = 12;

      private styleable() {
      }

      private static long[] decode_J(String src) {
         byte[] d = decode_B(src);
         ByteBuffer b = ByteBuffer.wrap(d);
         b.order(ByteOrder.LITTLE_ENDIAN);
         LongBuffer s = b.asLongBuffer();
         long[] data = new long[d.length / 8];
         s.get(data);
         return data;
      }

      private static int[] decode_I(String src) {
         byte[] d = decode_B(src);
         ByteBuffer b = ByteBuffer.wrap(d);
         b.order(ByteOrder.LITTLE_ENDIAN);
         IntBuffer s = b.asIntBuffer();
         int[] data = new int[d.length / 4];
         s.get(data);
         return data;
      }

      private static short[] decode_S(String src) {
         byte[] d = decode_B(src);
         ByteBuffer b = ByteBuffer.wrap(d);
         b.order(ByteOrder.LITTLE_ENDIAN);
         ShortBuffer s = b.asShortBuffer();
         short[] data = new short[d.length / 2];
         s.get(data);
         return data;
      }

      private static byte[] decode_B(String src) {
         char[] d = src.toCharArray();
         byte[] ret = new byte[src.length() / 2];

         for (int i = 0; i < ret.length; i++) {
            char h = d[2 * i];
            char l = d[2 * i + 1];
            int hh;
            if (h >= '0' && h <= '9') {
               hh = h - '0';
            } else if (h >= 'a' && h <= 'f') {
               hh = h - 'a' + 10;
            } else {
               if (h < 'A' || h > 'F') {
                  throw new RuntimeException();
               }

               hh = h - 'A' + 10;
            }

            int ll;
            if (l >= '0' && l <= '9') {
               ll = l - '0';
            } else if (l >= 'a' && l <= 'f') {
               ll = l - 'a' + 10;
            } else {
               if (l < 'A' || l > 'F') {
                  throw new RuntimeException();
               }

               ll = l - 'A' + 10;
            }

            ret[i] = (byte)(hh << 4 | ll);
         }

         return ret;
      }
   }

   public static final class xml {
      public static final int automotive_app_desc = 2132148224;
      public static final int data_extraction_rules = 2132148225;
      public static final int data_extraction_rules_legacy = 2132148226;
      public static final int file_paths = 2132148227;
      public static final int file_provider_paths = 2132148228;
      public static final int image_share_filepaths = 2132148229;
      public static final int imagepicker_provider_paths = 2132148230;
      public static final int ivpusic_imagepicker_provider_paths = 2132148231;
      public static final int network_security_config = 2132148232;
      public static final int replay_paths = 2132148233;
      public static final int rn_dev_preferences = 2132148234;
      public static final int shortcuts = 2132148235;

      private xml() {
      }
   }
}
