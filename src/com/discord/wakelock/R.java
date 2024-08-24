package com.discord.wakelock;

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
      public static final int fragment_fast_out_extra_slow_in = 2130772009;

      private anim() {
      }
   }

   public static final class animator {
      public static final int fragment_close_enter = 2130837509;
      public static final int fragment_close_exit = 2130837510;
      public static final int fragment_fade_enter = 2130837511;
      public static final int fragment_fade_exit = 2130837512;
      public static final int fragment_open_enter = 2130837513;
      public static final int fragment_open_exit = 2130837514;

      private animator() {
      }
   }

   public static final class attr {
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
      public static final int actionViewClass = 2130968612;
      public static final int activityChooserViewStyle = 2130968613;
      public static final int actualImageResource = 2130968614;
      public static final int actualImageScaleType = 2130968615;
      public static final int actualImageUri = 2130968616;
      public static final int alertDialogButtonGroupStyle = 2130968620;
      public static final int alertDialogCenterButtons = 2130968621;
      public static final int alertDialogStyle = 2130968622;
      public static final int alertDialogTheme = 2130968623;
      public static final int allowStacking = 2130968628;
      public static final int alpha = 2130968629;
      public static final int alphabeticModifiers = 2130968631;
      public static final int arrowHeadLength = 2130968642;
      public static final int arrowShaftLength = 2130968643;
      public static final int autoCompleteTextViewStyle = 2130968646;
      public static final int autoSizeMaxTextSize = 2130968656;
      public static final int autoSizeMinTextSize = 2130968657;
      public static final int autoSizePresetSizes = 2130968658;
      public static final int autoSizeStepGranularity = 2130968659;
      public static final int autoSizeTextType = 2130968660;
      public static final int autofillInlineSuggestionChip = 2130968663;
      public static final int autofillInlineSuggestionEndIconStyle = 2130968664;
      public static final int autofillInlineSuggestionStartIconStyle = 2130968665;
      public static final int autofillInlineSuggestionSubtitle = 2130968666;
      public static final int autofillInlineSuggestionTitle = 2130968667;
      public static final int background = 2130968668;
      public static final int backgroundImage = 2130968670;
      public static final int backgroundSplit = 2130968676;
      public static final int backgroundStacked = 2130968677;
      public static final int backgroundTint = 2130968678;
      public static final int backgroundTintMode = 2130968679;
      public static final int barLength = 2130968695;
      public static final int borderlessButtonStyle = 2130968715;
      public static final int buttonBarButtonStyle = 2130968735;
      public static final int buttonBarNegativeButtonStyle = 2130968736;
      public static final int buttonBarNeutralButtonStyle = 2130968737;
      public static final int buttonBarPositiveButtonStyle = 2130968738;
      public static final int buttonBarStyle = 2130968739;
      public static final int buttonCompat = 2130968740;
      public static final int buttonGravity = 2130968741;
      public static final int buttonIconDimen = 2130968743;
      public static final int buttonPanelSideLayout = 2130968746;
      public static final int buttonStyle = 2130968748;
      public static final int buttonStyleSmall = 2130968749;
      public static final int buttonTint = 2130968750;
      public static final int buttonTintMode = 2130968751;
      public static final int checkMarkCompat = 2130968762;
      public static final int checkMarkTint = 2130968763;
      public static final int checkMarkTintMode = 2130968764;
      public static final int checkboxStyle = 2130968765;
      public static final int checkedTextViewStyle = 2130968776;
      public static final int closeIcon = 2130968805;
      public static final int closeItemLayout = 2130968812;
      public static final int collapseContentDescription = 2130968813;
      public static final int collapseIcon = 2130968814;
      public static final int color = 2130968824;
      public static final int colorAccent = 2130968825;
      public static final int colorBackgroundFloating = 2130968826;
      public static final int colorButtonNormal = 2130968827;
      public static final int colorControlActivated = 2130968829;
      public static final int colorControlHighlight = 2130968830;
      public static final int colorControlNormal = 2130968831;
      public static final int colorError = 2130968832;
      public static final int colorPrimary = 2130968857;
      public static final int colorPrimaryDark = 2130968859;
      public static final int colorSwitchThumbNormal = 2130968881;
      public static final int commitIcon = 2130968886;
      public static final int contentDescription = 2130968894;
      public static final int contentInsetEnd = 2130968895;
      public static final int contentInsetEndWithActions = 2130968896;
      public static final int contentInsetLeft = 2130968897;
      public static final int contentInsetRight = 2130968898;
      public static final int contentInsetStart = 2130968899;
      public static final int contentInsetStartWithNavigation = 2130968900;
      public static final int controlBackground = 2130968910;
      public static final int customNavigationLayout = 2130968940;
      public static final int defaultQueryHint = 2130968949;
      public static final int dialogCornerRadius = 2130968956;
      public static final int dialogPreferredPadding = 2130968957;
      public static final int dialogTheme = 2130968958;
      public static final int displayOptions = 2130968959;
      public static final int divider = 2130968960;
      public static final int dividerHorizontal = 2130968965;
      public static final int dividerPadding = 2130968968;
      public static final int dividerVertical = 2130968970;
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
      public static final int dropDownListViewStyle = 2130968987;
      public static final int dropdownListPreferredItemHeight = 2130968988;
      public static final int editTextBackground = 2130968991;
      public static final int editTextColor = 2130968992;
      public static final int editTextStyle = 2130968993;
      public static final int elevation = 2130968994;
      public static final int emojiCompatEnabled = 2130968998;
      public static final int expandActivityOverflowButtonDrawable = 2130969022;
      public static final int fadeDuration = 2130969050;
      public static final int failureImage = 2130969051;
      public static final int failureImageScaleType = 2130969052;
      public static final int firstBaselineToTopHeight = 2130969058;
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
      public static final int gapBetweenBars = 2130969129;
      public static final int goIcon = 2130969131;
      public static final int height = 2130969136;
      public static final int hideOnContentScroll = 2130969144;
      public static final int homeAsUpIndicator = 2130969152;
      public static final int homeLayout = 2130969153;
      public static final int icon = 2130969158;
      public static final int iconTint = 2130969164;
      public static final int iconTintMode = 2130969165;
      public static final int iconifiedByDefault = 2130969166;
      public static final int imageButtonStyle = 2130969169;
      public static final int indeterminateProgressStyle = 2130969171;
      public static final int initialActivityCount = 2130969177;
      public static final int isAutofillInlineSuggestionTheme = 2130969179;
      public static final int isLightTheme = 2130969180;
      public static final int itemPadding = 2130969194;
      public static final int lStar = 2130969218;
      public static final int lastBaselineToBottomHeight = 2130969222;
      public static final int layout = 2130969224;
      public static final int lineHeight = 2130969304;
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
      public static final int logoDescription = 2130969324;
      public static final int maxButtonHeight = 2130969404;
      public static final int measureWithLargestChild = 2130969414;
      public static final int menu = 2130969415;
      public static final int multiChoiceItemLayout = 2130969469;
      public static final int navigationContentDescription = 2130969470;
      public static final int navigationIcon = 2130969471;
      public static final int navigationMode = 2130969473;
      public static final int nestedScrollViewStyle = 2130969477;
      public static final int numericModifiers = 2130969508;
      public static final int overlapAnchor = 2130969528;
      public static final int overlayImage = 2130969530;
      public static final int paddingBottomNoButtons = 2130969532;
      public static final int paddingEnd = 2130969534;
      public static final int paddingStart = 2130969537;
      public static final int paddingTopNoTitle = 2130969538;
      public static final int panelBackground = 2130969540;
      public static final int panelMenuListTheme = 2130969541;
      public static final int panelMenuListWidth = 2130969542;
      public static final int placeholderImage = 2130969556;
      public static final int placeholderImageScaleType = 2130969557;
      public static final int popupMenuStyle = 2130969566;
      public static final int popupTheme = 2130969567;
      public static final int popupWindowStyle = 2130969568;
      public static final int preserveIconSpacing = 2130969572;
      public static final int pressedStateOverlayImage = 2130969573;
      public static final int progressBarAutoRotateInterval = 2130969575;
      public static final int progressBarImage = 2130969576;
      public static final int progressBarImageScaleType = 2130969577;
      public static final int progressBarPadding = 2130969578;
      public static final int progressBarStyle = 2130969579;
      public static final int queryBackground = 2130969580;
      public static final int queryHint = 2130969581;
      public static final int queryPatterns = 2130969582;
      public static final int radioButtonStyle = 2130969583;
      public static final int ratingBarStyle = 2130969585;
      public static final int ratingBarStyleIndicator = 2130969586;
      public static final int ratingBarStyleSmall = 2130969587;
      public static final int retryImage = 2130969596;
      public static final int retryImageScaleType = 2130969597;
      public static final int roundAsCircle = 2130969601;
      public static final int roundBottomEnd = 2130969602;
      public static final int roundBottomLeft = 2130969603;
      public static final int roundBottomRight = 2130969604;
      public static final int roundBottomStart = 2130969605;
      public static final int roundTopEnd = 2130969607;
      public static final int roundTopLeft = 2130969608;
      public static final int roundTopRight = 2130969609;
      public static final int roundTopStart = 2130969610;
      public static final int roundWithOverlayColor = 2130969611;
      public static final int roundedCornerRadius = 2130969612;
      public static final int roundingBorderColor = 2130969613;
      public static final int roundingBorderPadding = 2130969614;
      public static final int roundingBorderWidth = 2130969615;
      public static final int searchHintIcon = 2130969627;
      public static final int searchIcon = 2130969628;
      public static final int searchViewStyle = 2130969630;
      public static final int seekBarStyle = 2130969631;
      public static final int selectableItemBackground = 2130969632;
      public static final int selectableItemBackgroundBorderless = 2130969633;
      public static final int shortcutMatchRequired = 2130969648;
      public static final int showAsAction = 2130969651;
      public static final int showDividers = 2130969656;
      public static final int showText = 2130969659;
      public static final int showTitle = 2130969660;
      public static final int singleChoiceItemLayout = 2130969678;
      public static final int spinBars = 2130969687;
      public static final int spinnerDropDownItemStyle = 2130969688;
      public static final int spinnerStyle = 2130969689;
      public static final int splitTrack = 2130969690;
      public static final int srcCompat = 2130969691;
      public static final int state_above_anchor = 2130969701;
      public static final int subMenuArrow = 2130969715;
      public static final int submitBackground = 2130969720;
      public static final int subtitle = 2130969721;
      public static final int subtitleTextAppearance = 2130969723;
      public static final int subtitleTextColor = 2130969724;
      public static final int subtitleTextStyle = 2130969725;
      public static final int suggestionRowLayout = 2130969729;
      public static final int switchMinWidth = 2130969732;
      public static final int switchPadding = 2130969733;
      public static final int switchStyle = 2130969734;
      public static final int switchTextAppearance = 2130969735;
      public static final int textAllCaps = 2130969769;
      public static final int textAppearanceLargePopupMenu = 2130969792;
      public static final int textAppearanceListItem = 2130969794;
      public static final int textAppearanceListItemSecondary = 2130969795;
      public static final int textAppearanceListItemSmall = 2130969796;
      public static final int textAppearancePopupMenuHeader = 2130969798;
      public static final int textAppearanceSearchResultSubtitle = 2130969799;
      public static final int textAppearanceSearchResultTitle = 2130969800;
      public static final int textAppearanceSmallPopupMenu = 2130969801;
      public static final int textColorAlertDialogListItem = 2130969807;
      public static final int textColorSearchUrl = 2130969808;
      public static final int textLocale = 2130969818;
      public static final int theme = 2130969820;
      public static final int thickness = 2130969821;
      public static final int thumbTextPadding = 2130969831;
      public static final int thumbTint = 2130969832;
      public static final int thumbTintMode = 2130969833;
      public static final int tickMark = 2130969837;
      public static final int tickMarkTint = 2130969838;
      public static final int tickMarkTintMode = 2130969839;
      public static final int tint = 2130969844;
      public static final int tintMode = 2130969845;
      public static final int title = 2130969847;
      public static final int titleMargin = 2130969851;
      public static final int titleMarginBottom = 2130969852;
      public static final int titleMarginEnd = 2130969853;
      public static final int titleMarginStart = 2130969854;
      public static final int titleMarginTop = 2130969855;
      public static final int titleMargins = 2130969856;
      public static final int titleTextAppearance = 2130969858;
      public static final int titleTextColor = 2130969859;
      public static final int titleTextStyle = 2130969861;
      public static final int toolbarNavigationButtonStyle = 2130969864;
      public static final int toolbarStyle = 2130969865;
      public static final int tooltipForegroundColor = 2130969867;
      public static final int tooltipFrameBackground = 2130969868;
      public static final int tooltipText = 2130969870;
      public static final int track = 2130969876;
      public static final int trackTint = 2130969886;
      public static final int trackTintMode = 2130969887;
      public static final int ttcIndex = 2130969898;
      public static final int viewAspectRatio = 2130969926;
      public static final int viewInflaterClass = 2130969927;
      public static final int voiceIcon = 2130969929;
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

      private attr() {
      }
   }

   public static final class bool {
      public static final int abc_action_bar_embed_tabs = 2131034112;
      public static final int abc_config_actionMenuItemAllCaps = 2131034113;

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
      public static final int androidx_core_ripple_material_light = 2131099687;
      public static final int androidx_core_secondary_text_default_material_light = 2131099688;
      public static final int background_floating_material_dark = 2131099692;
      public static final int background_floating_material_light = 2131099693;
      public static final int background_material_dark = 2131099694;
      public static final int background_material_light = 2131099695;
      public static final int bright_foreground_disabled_material_dark = 2131099933;
      public static final int bright_foreground_disabled_material_light = 2131099934;
      public static final int bright_foreground_inverse_material_dark = 2131099935;
      public static final int bright_foreground_inverse_material_light = 2131099936;
      public static final int bright_foreground_material_dark = 2131099937;
      public static final int bright_foreground_material_light = 2131099938;
      public static final int button_material_dark = 2131099948;
      public static final int button_material_light = 2131099949;
      public static final int call_notification_answer_color = 2131099966;
      public static final int call_notification_decline_color = 2131099967;
      public static final int catalyst_logbox_background = 2131099981;
      public static final int catalyst_redbox_background = 2131099982;
      public static final int dim_foreground_disabled_material_dark = 2131100088;
      public static final int dim_foreground_disabled_material_light = 2131100089;
      public static final int dim_foreground_material_dark = 2131100090;
      public static final int dim_foreground_material_light = 2131100091;
      public static final int error_color_material_dark = 2131100113;
      public static final int error_color_material_light = 2131100114;
      public static final int foreground_material_dark = 2131100125;
      public static final int foreground_material_light = 2131100126;
      public static final int highlighted_text_material_dark = 2131100173;
      public static final int highlighted_text_material_light = 2131100174;
      public static final int material_blue_grey_800 = 2131100650;
      public static final int material_blue_grey_900 = 2131100651;
      public static final int material_blue_grey_950 = 2131100652;
      public static final int material_deep_teal_200 = 2131100654;
      public static final int material_deep_teal_500 = 2131100655;
      public static final int material_grey_100 = 2131100722;
      public static final int material_grey_300 = 2131100723;
      public static final int material_grey_50 = 2131100724;
      public static final int material_grey_600 = 2131100725;
      public static final int material_grey_800 = 2131100726;
      public static final int material_grey_850 = 2131100727;
      public static final int material_grey_900 = 2131100728;
      public static final int notification_action_color_filter = 2131100871;
      public static final int notification_icon_bg_color = 2131100872;
      public static final int primary_dark_material_dark = 2131101004;
      public static final int primary_dark_material_light = 2131101005;
      public static final int primary_material_dark = 2131101007;
      public static final int primary_material_light = 2131101008;
      public static final int primary_text_default_material_dark = 2131101009;
      public static final int primary_text_default_material_light = 2131101010;
      public static final int primary_text_disabled_material_dark = 2131101011;
      public static final int primary_text_disabled_material_light = 2131101012;
      public static final int ripple_material_dark = 2131101142;
      public static final int ripple_material_light = 2131101143;
      public static final int secondary_text_default_material_dark = 2131101172;
      public static final int secondary_text_default_material_light = 2131101173;
      public static final int secondary_text_disabled_material_dark = 2131101174;
      public static final int secondary_text_disabled_material_light = 2131101175;
      public static final int switch_thumb_disabled_material_dark = 2131101184;
      public static final int switch_thumb_disabled_material_light = 2131101185;
      public static final int switch_thumb_material_dark = 2131101186;
      public static final int switch_thumb_material_light = 2131101187;
      public static final int switch_thumb_normal_material_dark = 2131101188;
      public static final int switch_thumb_normal_material_light = 2131101189;
      public static final int tooltip_background_dark = 2131101221;
      public static final int tooltip_background_light = 2131101222;

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
      public static final int autofill_inline_suggestion_icon_size = 2131165266;
      public static final int compat_button_inset_horizontal_material = 2131165274;
      public static final int compat_button_inset_vertical_material = 2131165275;
      public static final int compat_button_padding_horizontal_material = 2131165276;
      public static final int compat_button_padding_vertical_material = 2131165277;
      public static final int compat_control_corner_material = 2131165278;
      public static final int compat_notification_large_icon_max_height = 2131165279;
      public static final int compat_notification_large_icon_max_width = 2131165280;
      public static final int disabled_alpha_material_dark = 2131165330;
      public static final int disabled_alpha_material_light = 2131165331;
      public static final int highlight_alpha_material_colored = 2131165370;
      public static final int highlight_alpha_material_dark = 2131165371;
      public static final int highlight_alpha_material_light = 2131165372;
      public static final int hint_alpha_material_dark = 2131165373;
      public static final int hint_alpha_material_light = 2131165374;
      public static final int hint_pressed_alpha_material_dark = 2131165375;
      public static final int hint_pressed_alpha_material_light = 2131165376;
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
      public static final int tooltip_corner_radius = 2131166028;
      public static final int tooltip_horizontal_padding = 2131166029;
      public static final int tooltip_margin = 2131166030;
      public static final int tooltip_precise_anchor_extra_offset = 2131166031;
      public static final int tooltip_precise_anchor_threshold = 2131166032;
      public static final int tooltip_vertical_padding = 2131166033;
      public static final int tooltip_y_offset_non_touch = 2131166034;
      public static final int tooltip_y_offset_touch = 2131166035;

      private dimen() {
      }
   }

   public static final class drawable {
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
      public static final int autofill_inline_suggestion_chip_background = 2131230878;
      public static final int btn_checkbox_checked_mtrl = 2131230884;
      public static final int btn_checkbox_checked_to_unchecked_mtrl_animation = 2131230885;
      public static final int btn_checkbox_unchecked_mtrl = 2131230886;
      public static final int btn_checkbox_unchecked_to_checked_mtrl_animation = 2131230887;
      public static final int btn_radio_off_mtrl = 2131230888;
      public static final int btn_radio_off_to_on_mtrl_animation = 2131230889;
      public static final int btn_radio_on_mtrl = 2131230890;
      public static final int btn_radio_on_to_off_mtrl_animation = 2131230891;
      public static final int ic_call_answer = 2131231302;
      public static final int ic_call_answer_low = 2131231303;
      public static final int ic_call_answer_video = 2131231304;
      public static final int ic_call_answer_video_low = 2131231305;
      public static final int ic_call_decline = 2131231306;
      public static final int ic_call_decline_low = 2131231307;
      public static final int notification_action_background = 2131232692;
      public static final int notification_bg = 2131232693;
      public static final int notification_bg_low = 2131232694;
      public static final int notification_bg_low_normal = 2131232695;
      public static final int notification_bg_low_pressed = 2131232696;
      public static final int notification_bg_normal = 2131232697;
      public static final int notification_bg_normal_pressed = 2131232698;
      public static final int notification_icon_background = 2131232699;
      public static final int notification_template_icon_bg = 2131232701;
      public static final int notification_template_icon_low_bg = 2131232702;
      public static final int notification_tile_bg = 2131232703;
      public static final int notify_panel_notification_icon_bg = 2131232704;
      public static final int redbox_top_border_background = 2131232710;
      public static final int test_level_drawable = 2131232711;
      public static final int tooltip_frame_dark = 2131232712;
      public static final int tooltip_frame_light = 2131232713;

      private drawable() {
      }
   }

   public static final class id {
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
      public static final int action_bar = 2131361856;
      public static final int action_bar_activity_content = 2131361857;
      public static final int action_bar_container = 2131361858;
      public static final int action_bar_root = 2131361859;
      public static final int action_bar_spinner = 2131361860;
      public static final int action_bar_subtitle = 2131361861;
      public static final int action_bar_title = 2131361862;
      public static final int action_container = 2131361864;
      public static final int action_context_bar = 2131361865;
      public static final int action_divider = 2131361866;
      public static final int action_image = 2131361867;
      public static final int action_menu_divider = 2131361868;
      public static final int action_menu_presenter = 2131361869;
      public static final int action_mode_bar = 2131361870;
      public static final int action_mode_bar_stub = 2131361871;
      public static final int action_mode_close_button = 2131361872;
      public static final int action_text = 2131361875;
      public static final int actions = 2131361876;
      public static final int activity_chooser_view_content = 2131361878;
      public static final int add = 2131361879;
      public static final int alertTitle = 2131361885;
      public static final int async = 2131361899;
      public static final int autofill_inline_suggestion_end_icon = 2131361912;
      public static final int autofill_inline_suggestion_start_icon = 2131361913;
      public static final int autofill_inline_suggestion_subtitle = 2131361914;
      public static final int autofill_inline_suggestion_title = 2131361915;
      public static final int blocking = 2131361937;
      public static final int buttonPanel = 2131361953;
      public static final int catalyst_redbox_title = 2131361960;
      public static final int center = 2131361963;
      public static final int centerCrop = 2131361964;
      public static final int centerInside = 2131361965;
      public static final int checkbox = 2131361983;
      public static final int checked = 2131361984;
      public static final int chronometer = 2131361985;
      public static final int content = 2131362002;
      public static final int contentPanel = 2131362003;
      public static final int custom = 2131362026;
      public static final int customPanel = 2131362027;
      public static final int decor_content_parent = 2131362035;
      public static final int default_activity_button = 2131362036;
      public static final int dialog_button = 2131362046;
      public static final int edit_query = 2131362068;
      public static final int expand_activities_button = 2131362139;
      public static final int expanded_menu = 2131362140;
      public static final int fitBottomStart = 2131362164;
      public static final int fitCenter = 2131362165;
      public static final int fitEnd = 2131362166;
      public static final int fitStart = 2131362167;
      public static final int fitXY = 2131362169;
      public static final int focusCrop = 2131362179;
      public static final int forever = 2131362187;
      public static final int fps_text = 2131362190;
      public static final int fragment_container_view_tag = 2131362191;
      public static final int group_divider = 2131362205;
      public static final int home = 2131362228;
      public static final int icon = 2131362232;
      public static final int icon_group = 2131362235;
      public static final int image = 2131362240;
      public static final int info = 2131362252;
      public static final int italic = 2131362270;
      public static final int labelled_by = 2131362304;
      public static final int line1 = 2131362316;
      public static final int line3 = 2131362317;
      public static final int listMode = 2131362320;
      public static final int list_item = 2131362321;
      public static final int message = 2131362361;
      public static final int multiply = 2131362414;
      public static final int none = 2131362427;
      public static final int normal = 2131362430;
      public static final int notification_background = 2131362431;
      public static final int notification_main_column = 2131362432;
      public static final int notification_main_column_container = 2131362433;
      public static final int off = 2131362436;
      public static final int on = 2131362437;
      public static final int parentPanel = 2131362467;
      public static final int pointer_events = 2131362484;
      public static final int progress_circular = 2131362495;
      public static final int progress_horizontal = 2131362497;
      public static final int radio = 2131362505;
      public static final int react_test_id = 2131362507;
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
      public static final int screen = 2131362571;
      public static final int scrollIndicatorDown = 2131362573;
      public static final int scrollIndicatorUp = 2131362574;
      public static final int scrollView = 2131362575;
      public static final int search_badge = 2131362577;
      public static final int search_bar = 2131362578;
      public static final int search_button = 2131362580;
      public static final int search_close_btn = 2131362581;
      public static final int search_edit_frame = 2131362582;
      public static final int search_go_btn = 2131362583;
      public static final int search_mag_icon = 2131362584;
      public static final int search_plate = 2131362585;
      public static final int search_src_text = 2131362586;
      public static final int search_voice_btn = 2131362600;
      public static final int select_dialog_listview = 2131362610;
      public static final int shortcut = 2131362625;
      public static final int spacer = 2131362640;
      public static final int special_effects_controller_view_tag = 2131362641;
      public static final int split_action_bar = 2131362645;
      public static final int src_atop = 2131362650;
      public static final int src_in = 2131362651;
      public static final int src_over = 2131362652;
      public static final int submenuarrow = 2131362671;
      public static final int submit_area = 2131362672;
      public static final int tabMode = 2131362690;
      public static final int tag_accessibility_actions = 2131362692;
      public static final int tag_accessibility_clickable_spans = 2131362693;
      public static final int tag_accessibility_heading = 2131362694;
      public static final int tag_accessibility_pane_title = 2131362695;
      public static final int tag_on_apply_window_listener = 2131362698;
      public static final int tag_on_receive_content_listener = 2131362699;
      public static final int tag_on_receive_content_mime_types = 2131362700;
      public static final int tag_screen_reader_focusable = 2131362701;
      public static final int tag_state_description = 2131362702;
      public static final int tag_transition_group = 2131362703;
      public static final int tag_unhandled_key_event_manager = 2131362704;
      public static final int tag_unhandled_key_listeners = 2131362705;
      public static final int tag_window_insets_animation_callback = 2131362706;
      public static final int text = 2131362708;
      public static final int text2 = 2131362709;
      public static final int textSpacerNoButtons = 2131362711;
      public static final int textSpacerNoTitle = 2131362712;
      public static final int time = 2131362743;
      public static final int title = 2131362745;
      public static final int titleDividerNoCustom = 2131362746;
      public static final int title_template = 2131362749;
      public static final int topPanel = 2131362756;
      public static final int unchecked = 2131362774;
      public static final int uniform = 2131362775;
      public static final int up = 2131362777;
      public static final int view_coroutine_scope = 2131362794;
      public static final int view_tag_instance_handle = 2131362806;
      public static final int view_tag_native_id = 2131362807;
      public static final int view_tree_lifecycle_owner = 2131362808;
      public static final int view_tree_saved_state_registry_owner = 2131362810;
      public static final int view_tree_view_model_store_owner = 2131362811;
      public static final int visible_removing_fragment_view_tag = 2131362813;
      public static final int wrap_content = 2131362826;

      private id() {
      }
   }

   public static final class integer {
      public static final int abc_config_activityDefaultDur = 2131427328;
      public static final int abc_config_activityShortDur = 2131427329;
      public static final int cancel_button_image_alpha = 2131427332;
      public static final int config_tooltipAnimTime = 2131427334;
      public static final int react_native_dev_server_port = 2131427403;
      public static final int react_native_inspector_proxy_port = 2131427404;
      public static final int status_bar_notification_info_maxnum = 2131427406;

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
      public static final int autofill_inline_suggestion = 2131558437;
      public static final int custom_dialog = 2131558450;
      public static final int dev_loading_view = 2131558469;
      public static final int fps_view = 2131558493;
      public static final int notification_action = 2131558582;
      public static final int notification_action_tombstone = 2131558583;
      public static final int notification_template_custom_big = 2131558590;
      public static final int notification_template_icon_group = 2131558591;
      public static final int notification_template_part_chronometer = 2131558595;
      public static final int notification_template_part_time = 2131558596;
      public static final int redbox_item_frame = 2131558613;
      public static final int redbox_item_title = 2131558614;
      public static final int redbox_view = 2131558615;
      public static final int select_dialog_item_material = 2131558622;
      public static final int select_dialog_multichoice_material = 2131558623;
      public static final int select_dialog_singlechoice_material = 2131558624;
      public static final int support_simple_spinner_dropdown_item = 2131558629;

      private layout() {
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
      public static final int combobox_description = 2131951698;
      public static final int header_description = 2131951798;
      public static final int image_description = 2131951803;
      public static final int imagebutton_description = 2131951804;
      public static final int link_description = 2131951807;
      public static final int menu_description = 2131951845;
      public static final int menubar_description = 2131951846;
      public static final int menuitem_description = 2131951847;
      public static final int progressbar_description = 2131951919;
      public static final int radiogroup_description = 2131951921;
      public static final int rn_tab_description = 2131951922;
      public static final int scrollbar_description = 2131951923;
      public static final int search_menu_title = 2131951924;
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
      public static final int timer_description = 2131951942;
      public static final int toolbar_description = 2131951943;

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
      public static final int Base_AlertDialog_AppCompat = 2132017164;
      public static final int Base_AlertDialog_AppCompat_Light = 2132017165;
      public static final int Base_Animation_AppCompat_Dialog = 2132017166;
      public static final int Base_Animation_AppCompat_DropDownUp = 2132017167;
      public static final int Base_Animation_AppCompat_Tooltip = 2132017168;
      public static final int Base_DialogWindowTitleBackground_AppCompat = 2132017171;
      public static final int Base_DialogWindowTitle_AppCompat = 2132017170;
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
      public static final int Base_V21_ThemeOverlay_AppCompat_Dialog = 2132017318;
      public static final int Base_V21_Theme_AppCompat = 2132017310;
      public static final int Base_V21_Theme_AppCompat_Dialog = 2132017311;
      public static final int Base_V21_Theme_AppCompat_Light = 2132017312;
      public static final int Base_V21_Theme_AppCompat_Light_Dialog = 2132017313;
      public static final int Base_V22_Theme_AppCompat = 2132017322;
      public static final int Base_V22_Theme_AppCompat_Light = 2132017323;
      public static final int Base_V23_Theme_AppCompat = 2132017324;
      public static final int Base_V23_Theme_AppCompat_Light = 2132017325;
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
      public static final int CalendarDatePickerDialog = 2132017436;
      public static final int CalendarDatePickerStyle = 2132017437;
      public static final int DialogAnimationFade = 2132017443;
      public static final int DialogAnimationSlide = 2132017444;
      public static final int Platform_AppCompat = 2132017500;
      public static final int Platform_AppCompat_Light = 2132017501;
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
      public static final int TextAppearance_Compat_Notification_Line2 = 2132017643;
      public static final int TextAppearance_Compat_Notification_Time = 2132017646;
      public static final int TextAppearance_Compat_Notification_Title = 2132017648;
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
      public static final int Theme_FullScreenDialog = 2132017750;
      public static final int Theme_FullScreenDialogAnimatedFade = 2132017751;
      public static final int Theme_FullScreenDialogAnimatedSlide = 2132017752;
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
      public static final int redboxButton = 2132018327;

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
      public static final int[] Autofill_InlineSuggestion = new int[]{2130968663, 2130968664, 2130968665, 2130968666, 2130968667, 2130969179};
      public static final int Autofill_InlineSuggestion_autofillInlineSuggestionChip = 0;
      public static final int Autofill_InlineSuggestion_autofillInlineSuggestionEndIconStyle = 1;
      public static final int Autofill_InlineSuggestion_autofillInlineSuggestionStartIconStyle = 2;
      public static final int Autofill_InlineSuggestion_autofillInlineSuggestionSubtitle = 3;
      public static final int Autofill_InlineSuggestion_autofillInlineSuggestionTitle = 4;
      public static final int Autofill_InlineSuggestion_isAutofillInlineSuggestionTheme = 5;
      public static final int[] ButtonBarLayout = new int[]{2130968628};
      public static final int ButtonBarLayout_allowStacking = 0;
      public static final int[] Capability = new int[]{2130969582, 2130969648};
      public static final int Capability_queryPatterns = 0;
      public static final int Capability_shortcutMatchRequired = 1;
      public static final int[] CheckedTextView = new int[]{16843016, 2130968762, 2130968763, 2130968764};
      public static final int CheckedTextView_android_checkMark = 0;
      public static final int CheckedTextView_checkMarkCompat = 1;
      public static final int CheckedTextView_checkMarkTint = 2;
      public static final int CheckedTextView_checkMarkTintMode = 3;
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
      public static final int[] DrawerArrowToggle = new int[]{2130968642, 2130968643, 2130968695, 2130968824, 2130968979, 2130969129, 2130969687, 2130969821};
      public static final int DrawerArrowToggle_arrowHeadLength = 0;
      public static final int DrawerArrowToggle_arrowShaftLength = 1;
      public static final int DrawerArrowToggle_barLength = 2;
      public static final int DrawerArrowToggle_color = 3;
      public static final int DrawerArrowToggle_drawableSize = 4;
      public static final int DrawerArrowToggle_gapBetweenBars = 5;
      public static final int DrawerArrowToggle_spinBars = 6;
      public static final int DrawerArrowToggle_thickness = 7;
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
      public static final int[] ListPopupWindow = new int[]{16843436, 16843437};
      public static final int ListPopupWindow_android_dropDownHorizontalOffset = 0;
      public static final int ListPopupWindow_android_dropDownVerticalOffset = 1;
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
      public static final int[] PopupWindow = new int[]{16843126, 16843465, 2130969528};
      public static final int[] PopupWindowBackgroundState = new int[]{2130969701};
      public static final int PopupWindowBackgroundState_state_above_anchor = 0;
      public static final int PopupWindow_android_popupAnimationStyle = 1;
      public static final int PopupWindow_android_popupBackground = 0;
      public static final int PopupWindow_overlapAnchor = 2;
      public static final int[] RecycleListView = new int[]{2130969532, 2130969538};
      public static final int RecycleListView_paddingBottomNoButtons = 0;
      public static final int RecycleListView_paddingTopNoTitle = 1;
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
      public static final int[] Spinner = new int[]{16842930, 16843126, 16843131, 16843362, 2130969567};
      public static final int Spinner_android_dropDownWidth = 3;
      public static final int Spinner_android_entries = 0;
      public static final int Spinner_android_popupBackground = 1;
      public static final int Spinner_android_prompt = 2;
      public static final int Spinner_popupTheme = 4;
      public static final int[] StateListDrawable = new int[]{16843036, 16843156, 16843157, 16843158, 16843532, 16843533};
      public static final int[] StateListDrawableItem = new int[]{16843161};
      public static final int StateListDrawableItem_android_drawable = 0;
      public static final int StateListDrawable_android_constantSize = 3;
      public static final int StateListDrawable_android_dither = 0;
      public static final int StateListDrawable_android_enterFadeDuration = 4;
      public static final int StateListDrawable_android_exitFadeDuration = 5;
      public static final int StateListDrawable_android_variablePadding = 2;
      public static final int StateListDrawable_android_visible = 1;
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
      public static final int[] View = new int[]{16842752, 16842970, 2130969534, 2130969537, 2130969820};
      public static final int[] ViewBackgroundHelper = new int[]{16842964, 2130968678, 2130968679};
      public static final int ViewBackgroundHelper_android_background = 0;
      public static final int ViewBackgroundHelper_backgroundTint = 1;
      public static final int ViewBackgroundHelper_backgroundTintMode = 2;
      public static final int[] ViewStubCompat = new int[]{16842960, 16842994, 16842995};
      public static final int ViewStubCompat_android_id = 0;
      public static final int ViewStubCompat_android_inflatedId = 2;
      public static final int ViewStubCompat_android_layout = 1;
      public static final int View_android_focusable = 1;
      public static final int View_android_theme = 0;
      public static final int View_paddingEnd = 2;
      public static final int View_paddingStart = 3;
      public static final int View_theme = 4;

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
      public static final int rn_dev_preferences = 2132148234;

      private xml() {
      }
   }
}
