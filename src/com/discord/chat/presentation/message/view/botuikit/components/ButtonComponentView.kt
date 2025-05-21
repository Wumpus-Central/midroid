package com.discord.chat.presentation.message.view.botuikit.components

import Q8.n
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.botuikit.ActionComponentState
import com.discord.chat.bridge.botuikit.ButtonComponent
import com.discord.chat.bridge.botuikit.ButtonStyle
import com.discord.chat.bridge.botuikit.ComponentEmoji
import com.discord.chat.databinding.MessageComponentButtonViewBinding
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.chat.presentation.message.view.botuikit.ComponentViewKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.progress_dots.ProgressDots
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.theme.R
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import com.facebook.drawee.view.SimpleDraweeView
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q
import kotlin.reflect.KClass

public class ButtonComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : ConstraintLayout,
   ComponentView<ButtonComponent> {
   public final val binding: MessageComponentButtonViewBinding

   private final val progressDots: ProgressDots
      private final get() {
         return this.progressDots$delegate.getValue() as ProgressDots;
      }


   private final var currentComponent: ButtonComponent?
   private final var currentStyle: ButtonStyle
   private final var currentEmoji: ComponentEmoji?
   private final var currentLabel: String?
   private final var currentIsLoading: Boolean

   fun ButtonComponentView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ButtonComponentView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
      val var6: MessageComponentButtonViewBinding = MessageComponentButtonViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var6, "inflate(...)");
      this.binding = var6;
      this.progressDots$delegate = Q8.j.b(new com.discord.chat.presentation.message.view.botuikit.components.a(this));
      this.currentStyle = ButtonStyle.UNKNOWN;
      val var4: com.google.android.flexbox.FlexboxLayout.LayoutParams = new com.google.android.flexbox.FlexboxLayout.LayoutParams(-2, -2);
      var4.c(0.0F);
      this.setLayoutParams(var4);
      this.setMinWidth(SizeUtilsKt.getDpToPx(52));
      this.setMinimumWidth(this.getMinWidth());
      val var5: SimpleDraweeView = var6.linkIcon;
      q.g(var6.linkIcon, "linkIcon");
      this.configureLinkIcon(var5);
   }

   @JvmStatic
   fun `configure$lambda$2`(var0: ButtonComponent, var1: ComponentContext, var2: View) {
      if (var0.getUrl() != null) {
         var1.getComponentActionEventHandlers().getOnTapButtonLinkComponent().invoke(var0.getUrl());
      } else if (var0.getCustomId() != null || var0.getStyle() === ButtonStyle.PREMIUM) {
         var1.getComponentActionEventHandlers().getOnTapButtonActionComponent().invoke(var0.getId());
      }
   }

   @JvmStatic
   fun `configure$lambda$3`(var0: View) {
   }

   private fun configureEmoji(emojiView: SimpleDraweeSpanTextView, emoji: ComponentEmoji?, isLoading: Boolean) {
      if (!q.c(var2, this.currentEmoji) || var3 != this.currentIsLoading) {
         this.currentEmoji = var2;
         if (var2 != null && var3) {
            var1.setVisibility(4);
         } else {
            ComponentViewKt.setEmojiOrHide(var1, var2);
         }
      }
   }

   private fun configureLabelPadding(label: TextView, messageComponent: ButtonComponent) {
      if (q.c(this.currentLabel, var2.getLabel())) {
         var var5: ButtonComponent = this.currentComponent;
         if (this.currentComponent != null && ButtonComponentViewKt.access$hasEmoji(var2) == ButtonComponentViewKt.access$hasEmoji(var5)) {
            var5 = this.currentComponent;
            if (this.currentComponent != null && ButtonComponentViewKt.access$hasIcon(var2) == ButtonComponentViewKt.access$hasIcon(var5)) {
               return;
            }
         }
      }

      this.currentLabel = var2.getLabel();
      if (var2.getLabel() != null) {
         val var6: Int;
         if (ButtonComponentViewKt.access$hasEmoji(var2)) {
            var6 = SizeUtilsKt.getDpToPx(8);
         } else {
            var6 = SizeUtilsKt.getDpToPx(16);
         }

         val var4: Int;
         if (ButtonComponentViewKt.access$hasIcon(var2)) {
            var4 = SizeUtilsKt.getDpToPx(8);
         } else {
            var4 = SizeUtilsKt.getDpToPx(16);
         }

         var1.setPadding(var6, 0, var4, 0);
      } else {
         val var3: Int;
         if (ButtonComponentViewKt.access$hasEmoji(var2) && ButtonComponentViewKt.access$hasIcon(var2)) {
            var3 = SizeUtilsKt.getDpToPx(8);
         } else {
            var3 = SizeUtilsKt.getDpToPx(16);
         }

         var1.setPadding(0, 0, var3, 0);
      }
   }

   private fun configureLinkIcon(icon: SimpleDraweeView) {
      ReactAssetUtilsKt.setReactAsset(var1, ReactAsset.Launch);
      ColorUtilsKt.setTintColor(var1, -1);
   }

   private fun configureStyle(button: Button, style: ButtonStyle) {
      if (this.currentStyle != var2) {
         switch (ButtonComponentView.WhenMappings.$EnumSwitchMapping$0[var2.ordinal()]) {
            case 1:
               ButtonComponentViewKt.access$setSecondaryColor(var1);
               break;
            case 2:
               ButtonComponentViewKt.access$setBrandColor(var1);
               break;
            case 3:
               ButtonComponentViewKt.access$setSecondaryColor(var1);
               break;
            case 4:
               ButtonComponentViewKt.access$setSecondaryColor(var1);
               break;
            case 5:
               ButtonComponentViewKt.access$setDangerColor(var1);
               break;
            case 6:
               ButtonComponentViewKt.access$setSuccessColor(var1);
               break;
            case 7:
               ButtonComponentViewKt.access$setBrandColor(var1);
               break;
            default:
               throw new n();
         }
      }
   }

   @JvmStatic
   fun `progressDots_delegate$lambda$0`(var0: ButtonComponentView): ProgressDots {
      val var1: View = var0.binding.loadingDots.inflate();
      q.f(var1, "null cannot be cast to non-null type com.discord.progress_dots.ProgressDots");
      return var1 as ProgressDots;
   }

   public open fun configure(component: ButtonComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      q.h(var1, "component");
      q.h(var2, "componentProvider");
      q.h(var3, "componentContext");
      if (!q.c(var1, this.currentComponent)) {
         var var6: Boolean;
         if (var1.getState() != ActionComponentState.DISABLED && !var1.getDisabled()) {
            var6 = 0;
         } else {
            var6 = 1;
         }

         val var8: Boolean;
         if (var1.getState() === ActionComponentState.LOADING) {
            var8 = true;
         } else {
            var8 = false;
         }

         val var13: MaterialButton = this.binding.button;
         q.g(this.binding.button, "button");
         this.configureStyle(var13, var1.getStyle());
         val var14: SimpleDraweeSpanTextView = this.binding.emoji;
         q.g(this.binding.emoji, "emoji");
         this.configureEmoji(var14, var1.getEmoji(), var8);
         val var15: MaterialTextView = this.binding.label;
         q.g(this.binding.label, "label");
         this.configureLabelPadding(var15, var1);
         var var4: Float;
         if (var6) {
            var4 = 0.5F;
         } else {
            var4 = 1.0F;
         }

         this.binding.label.setAlpha(var4);
         if (var6) {
            var4 = 0.3F;
         } else {
            var4 = 1.0F;
         }

         this.binding.emoji.setAlpha(var4);
         var4 = 1.0F;
         if (var6) {
            var4 = 0.3F;
         }

         this.binding.linkIcon.setAlpha(var4);
         this.binding.button.setEnabled((boolean)(var6 xor true));
         val var19: SimpleDraweeView = this.binding.linkIcon;
         q.g(this.binding.linkIcon, "linkIcon");
         if (var1.getStyle() === ButtonStyle.LINK) {
            var6 = (boolean)1;
         } else {
            var6 = (boolean)0;
         }

         if (var6) {
            var6 = 0;
         } else {
            var6 = 8;
         }

         var19.setVisibility(var6);
         val var20: MaterialTextView = this.binding.label;
         this.binding.label.setText(var1.getLabel());
         q.e(var20);
         if (var8) {
            var6 = 4;
         } else {
            var6 = 0;
         }

         var20.setVisibility(var6);
         DiscordFontUtilsKt.setDiscordFont(var20, DiscordFont.PrimaryMedium);
         var20.setTextColor(ColorUtilsKt.getColorCompat(var20, R.color.white));
         if (!var8) {
            val var21: MaterialButton = this.binding.button;
            q.g(this.binding.button, "button");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var21, false, new b(var1, var3), 1, null);
         } else {
            val var10: MaterialButton = this.binding.button;
            q.g(this.binding.button, "button");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var10, false, new c(), 1, null);
         }

         if (var8 != this.currentIsLoading) {
            val var11: ProgressDots = this.getProgressDots();
            if (var8) {
               var6 = 0;
            } else {
               var6 = 8;
            }

            var11.setVisibility(var6);
         }

         this.currentIsLoading = var8;
      }
   }

   public override fun getComponentType(): KClass<ButtonComponent> {
      return G.b(ButtonComponent.class);
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): ButtonComponentView {
         q.h(var1, "context");
         return new ButtonComponentView(var1, null, 0, 6, null);
      }
   }
}
