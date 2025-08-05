package com.discord.chat.presentation.message.view

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.databinding.ObscureOverlayViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView
import eightbitlab.com.blurview.BlurView
import kotlin.jvm.functions.Function0

public class ObscureOverlayView  public constructor(context: Context, attributeSet: AttributeSet? = null) : FrameLayout, SpoilerViewOverlay {
   private final val binding: ObscureOverlayViewBinding

   fun ObscureOverlayView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      val var4: ObscureOverlayViewBinding = ObscureOverlayViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var4, "inflate(...)");
      this.binding = var4;
      val var3: BlurView = var4.blurView;
      kotlin.jvm.internal.r.g(var4.blurView, "blurView");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var3, false, new J0(), 1, null);
      val var5: SimpleDraweeView = var4.mediaWarningIcon;
      kotlin.jvm.internal.r.e(var4.mediaWarningIcon);
      ReactAssetUtilsKt.setReactAsset(var5, ReactAsset.MediaChannelNSFW);
      ColorUtilsKt.setTintColor(var5, ThemeManagerKt.getTheme().getWhite());
      (var5.getHierarchy() as GenericDraweeHierarchy).x(0);
      val var6: TextView = var4.descriptionLabel;
      kotlin.jvm.internal.r.g(var4.descriptionLabel, "descriptionLabel");
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimaryNormal);
      var4.opaqueBackground.setBackgroundColor(ColorUtilsKt.getColorCompat(var1, R.color.primary_500));
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: View) {
   }

   @JvmStatic
   fun `configure$lambda$2`(var0: Function0, var1: ObscureOverlayView): Unit {
      var0.invoke();
      var1.binding.revealButton.requestFocus();
      return Unit.a;
   }

   private fun handleRevealedState(isOverlayVisible: Boolean) {
      val var4: BlurView = this.binding.blurView;
      kotlin.jvm.internal.r.g(this.binding.blurView, "blurView");
      var var2: Byte;
      if (var1) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      var2 = 0;
      if (var1) {
         var2 = 4;
      }

      this.binding.hideButton.setImportantForAccessibility(var2);
   }

   public fun configure(header: String, description: String, parent: ViewGroup, isOverlayVisible: Boolean, onReveal: () -> Unit, onHide: () -> Unit) {
      kotlin.jvm.internal.r.h(var1, "header");
      kotlin.jvm.internal.r.h(var2, "description");
      kotlin.jvm.internal.r.h(var3, "parent");
      kotlin.jvm.internal.r.h(var5, "onReveal");
      kotlin.jvm.internal.r.h(var6, "onHide");
      this.handleRevealedState(var4);
      this.binding.blurView.setupWith(var3).g(24.0F).b(Color.argb(80, 0, 0, 0)).c(var3.getBackground()).a(true);
      this.binding.hideButton.configure(ReactAsset.HideMedia, I18nMessage.OBSCURED_CONTENT_HIDE_CONTENT_ALT, new K0(var6, this));
      this.binding.revealButton.configure(ReactAsset.ShowMedia, I18nMessage.OBSCURED_CONTENT_SHOW_CONTENT_ALT, var5);
      this.binding.descriptionLabel.setText(var1);
      this.binding.descriptionLabel.setContentDescription(var2);
   }

   public override fun getOverlayView(): View {
      val var1: BlurView = this.binding.blurView;
      kotlin.jvm.internal.r.g(this.binding.blurView, "blurView");
      return var1;
   }

   public fun handleObscureAwaitingScan(isAwaitingScan: Boolean) {
      val var3: ConstraintLayout = this.binding.overlayLayout;
      kotlin.jvm.internal.r.g(this.binding.overlayLayout, "overlayLayout");
      val var2: Byte;
      if (!var1) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var3.setVisibility(var2);
   }

   public fun makeHideButtonHidden() {
      val var1: IconButtonView = this.binding.hideButton;
      kotlin.jvm.internal.r.g(this.binding.hideButton, "hideButton");
      var1.setVisibility(8);
   }

   public fun setLabelVisible(isVisible: Boolean) {
      val var3: TextView = this.binding.descriptionLabel;
      kotlin.jvm.internal.r.g(this.binding.descriptionLabel, "descriptionLabel");
      val var2: Byte;
      if (var1) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var3.setVisibility(var2);
   }

   public fun setOpaqueBackgroundVisible(isVisible: Boolean) {
      val var3: FrameLayout = this.binding.opaqueBackground;
      kotlin.jvm.internal.r.g(this.binding.opaqueBackground, "opaqueBackground");
      val var2: Byte;
      if (var1) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var3.setVisibility(var2);
   }

   public fun setRevealButtonVisible(isVisible: Boolean) {
      val var3: IconButtonView = this.binding.revealButton;
      kotlin.jvm.internal.r.g(this.binding.revealButton, "revealButton");
      val var2: Byte;
      if (var1) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var3.setVisibility(var2);
   }
}
