package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import com.discord.chat.bridge.botuikit.ActionComponentState
import com.discord.chat.bridge.botuikit.ButtonComponent
import com.discord.chat.bridge.botuikit.ButtonStyle
import com.discord.chat.bridge.botuikit.ComponentEmoji
import com.discord.chat.databinding.MessageComponentButtonViewBinding
import com.discord.chat.presentation.message.view.botuikit.ComponentActionListener
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
import kh.l
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlin.reflect.KClass

public class ButtonComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : RelativeLayout,
   ComponentView<ButtonComponent> {
   public final val binding: MessageComponentButtonViewBinding
   private final var currentComponent: ButtonComponent?
   private final var currentEmoji: ComponentEmoji?
   private final var currentIsLoading: Boolean
   private final var currentLabel: String?
   private final var currentStyle: ButtonStyle

   private final val progressDots: ProgressDots
      private final get() {
         return this.progressDots$delegate.getValue() as ProgressDots;
      }


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
      val var4: MessageComponentButtonViewBinding = MessageComponentButtonViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var4, "inflate(...)");
      this.binding = var4;
      this.progressDots$delegate = l.b(new Function0(this) {
         final ButtonComponentView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final ProgressDots invoke() {
            val var1: View = this.this$0.getBinding().loadingDotsStub.inflate();
            q.f(var1, "null cannot be cast to non-null type com.discord.progress_dots.ProgressDots");
            return var1 as ProgressDots;
         }
      });
      this.currentStyle = ButtonStyle.UNKNOWN;
      val var5: SimpleDraweeView = var4.linkIcon;
      q.g(var4.linkIcon, "linkIcon");
      this.configureLinkIcon(var5);
   }

   @JvmStatic
   fun `configure$lambda$1`(var0: ButtonComponent, var1: ComponentActionListener, var2: View) {
      q.h(var0, "$component");
      q.h(var1, "$componentActionListener");
      if (var0.getUrl() != null) {
         var1.openLink(var0.getUrl());
      } else if (var0.getCustomId() != null || var0.getStyle() === ButtonStyle.PREMIUM) {
         var1.onTapButtonActionComponent(var0.getId());
      }
   }

   @JvmStatic
   fun `configure$lambda$2`(var0: View) {
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
            default:
         }
      }
   }

   public open fun configure(
      component: ButtonComponent,
      componentProvider: ComponentProvider,
      componentActionListener: ComponentActionListener,
      componentContext: ComponentContext
   ) {
      q.h(var1, "component");
      q.h(var2, "componentProvider");
      q.h(var3, "componentActionListener");
      q.h(var4, "componentContext");
      if (!q.c(var1, this.currentComponent)) {
         var var7: Boolean;
         if (var1.getState() != ActionComponentState.DISABLED && !var1.getDisabled()) {
            var7 = 0;
         } else {
            var7 = 1;
         }

         val var9: Boolean;
         if (var1.getState() === ActionComponentState.LOADING) {
            var9 = true;
         } else {
            var9 = false;
         }

         val var13: MaterialButton = this.binding.button;
         q.g(this.binding.button, "button");
         this.configureStyle(var13, var1.getStyle());
         val var14: SimpleDraweeSpanTextView = this.binding.emoji;
         q.g(this.binding.emoji, "emoji");
         this.configureEmoji(var14, var1.getEmoji(), var9);
         val var15: MaterialTextView = this.binding.label;
         q.g(this.binding.label, "label");
         this.configureLabelPadding(var15, var1);
         var var5: Float;
         if (var7) {
            var5 = 0.5F;
         } else {
            var5 = 1.0F;
         }

         this.binding.label.setAlpha(var5);
         if (var7) {
            var5 = 0.3F;
         } else {
            var5 = 1.0F;
         }

         this.binding.emoji.setAlpha(var5);
         var5 = 1.0F;
         if (var7) {
            var5 = 0.3F;
         }

         this.binding.linkIcon.setAlpha(var5);
         this.binding.button.setEnabled((boolean)(var7 xor true));
         val var19: SimpleDraweeView = this.binding.linkIcon;
         q.g(this.binding.linkIcon, "linkIcon");
         if (var1.getStyle() === ButtonStyle.LINK) {
            var7 = (boolean)1;
         } else {
            var7 = (boolean)0;
         }

         if (var7) {
            var7 = 0;
         } else {
            var7 = 8;
         }

         var19.setVisibility(var7);
         val var20: MaterialTextView = this.binding.label;
         this.binding.label.setText(var1.getLabel());
         q.e(var20);
         if (var9) {
            var7 = 4;
         } else {
            var7 = 0;
         }

         var20.setVisibility(var7);
         DiscordFontUtilsKt.setDiscordFont(var20, DiscordFont.PrimaryMedium);
         var20.setTextColor(ColorUtilsKt.getColorCompat(var20, R.color.white));
         if (!var9) {
            val var21: MaterialButton = this.binding.button;
            q.g(this.binding.button, "button");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var21, false, new a(var1, var3), 1, null);
         } else {
            val var10: MaterialButton = this.binding.button;
            q.g(this.binding.button, "button");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var10, false, new b(), 1, null);
         }

         if (var9 != this.currentIsLoading) {
            val var11: ProgressDots = this.getProgressDots();
            if (var9) {
               var7 = 0;
            } else {
               var7 = 8;
            }

            var11.setVisibility(var7);
         }

         this.currentIsLoading = var9;
      }
   }

   public override fun getComponentType(): KClass<ButtonComponent> {
      return g0.b(ButtonComponent.class);
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
