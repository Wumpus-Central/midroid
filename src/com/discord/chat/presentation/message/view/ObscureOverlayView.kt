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
      val var3: ObscureOverlayViewBinding = ObscureOverlayViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var3, "inflate(LayoutInflater.from(context), this)");
      this.binding = var3;
      val var5: BlurView = var3.blurView;
      kotlin.jvm.internal.r.g(var3.blurView, "binding.blurView");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var5, false, new n0(), 1, null);
      val var6: SimpleDraweeView = var3.mediaWarningIcon;
      kotlin.jvm.internal.r.g(var3.mediaWarningIcon, "it");
      ReactAssetUtilsKt.setReactAsset(var6, ReactAsset.MediaChannelNSFW);
      ColorUtilsKt.setTintColor(var6, ThemeManagerKt.getTheme().getWhite());
      (var6.getHierarchy() as GenericDraweeHierarchy).w(0);
      val var4: TextView = var3.descriptionLabel;
      kotlin.jvm.internal.r.g(var3.descriptionLabel, "binding.descriptionLabel");
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: View) {
   }

   private fun handleRevealedState(isOverlayVisible: Boolean) {
      val var4: BlurView = this.binding.blurView;
      kotlin.jvm.internal.r.g(this.binding.blurView, "binding.blurView");
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

   public fun configure(header: String, parent: ViewGroup, isOverlayVisible: Boolean, onReveal: () -> Unit, onHide: () -> Unit) {
      kotlin.jvm.internal.r.h(var1, "header");
      kotlin.jvm.internal.r.h(var2, "parent");
      kotlin.jvm.internal.r.h(var4, "onReveal");
      kotlin.jvm.internal.r.h(var5, "onHide");
      this.handleRevealedState(var3);
      this.binding.blurView.setupWith(var2).g(24.0F).a(Color.argb(80, 0, 0, 0)).d(var2.getBackground()).c(true);
      this.binding.hideButton.configure(ReactAsset.HideMedia, I18nMessage.OBSCURED_CONTENT_HIDE_CONTENT_ALT, new Function0<Unit>(var5, this) {
         final Function0<Unit> $onHide;
         final ObscureOverlayView this$0;

         {
            super(0);
            this.$onHide = var1;
            this.this$0 = var2;
         }

         public final void invoke() {
            this.$onHide.invoke();
            ObscureOverlayView.access$getBinding$p(this.this$0).revealButton.requestFocus();
         }
      });
      this.binding.revealButton.configure(ReactAsset.ShowMedia, I18nMessage.OBSCURED_CONTENT_SHOW_CONTENT_ALT, var4);
      this.binding.descriptionLabel.setText(var1);
   }

   public override fun getOverlayView(): View {
      val var1: BlurView = this.binding.blurView;
      kotlin.jvm.internal.r.g(this.binding.blurView, "binding.blurView");
      return var1;
   }

   public fun handleObscureAwaitingScan(isAwaitingScan: Boolean) {
      val var3: ConstraintLayout = this.binding.overlayLayout;
      kotlin.jvm.internal.r.g(this.binding.overlayLayout, "binding.overlayLayout");
      val var2: Byte;
      if (var1 xor true) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var3.setVisibility(var2);
   }

   public fun makeHideButtonHidden() {
      val var1: IconButtonView = this.binding.hideButton;
      kotlin.jvm.internal.r.g(this.binding.hideButton, "binding.hideButton");
      var1.setVisibility(8);
   }

   public fun setLabelVisible(isVisible: Boolean) {
      val var3: TextView = this.binding.descriptionLabel;
      kotlin.jvm.internal.r.g(this.binding.descriptionLabel, "binding.descriptionLabel");
      val var2: Byte;
      if (var1) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var3.setVisibility(var2);
   }
}
