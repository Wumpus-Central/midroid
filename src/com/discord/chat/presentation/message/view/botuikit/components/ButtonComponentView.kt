package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
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
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlin.reflect.KClass

public class ButtonComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : ConstraintLayout,
   ComponentView<ButtonComponent> {
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
      if (var2 != null && var3) {
         var1.setVisibility(4);
      } else {
         ComponentViewKt.setEmojiOrHide(var1, var2);
      }
   }

   private fun configureLabelPadding(label: TextView, messageComponent: ButtonComponent) {
      if (var2.getLabel() != null) {
         val var5: Int;
         if (ButtonComponentViewKt.access$hasEmoji(var2)) {
            var5 = SizeUtilsKt.getDpToPx(8);
         } else {
            var5 = SizeUtilsKt.getDpToPx(16);
         }

         val var4: Int;
         if (ButtonComponentViewKt.access$hasIcon(var2)) {
            var4 = SizeUtilsKt.getDpToPx(8);
         } else {
            var4 = SizeUtilsKt.getDpToPx(16);
         }

         var1.setPadding(var5, 0, var4, 0);
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

   private fun configureLinkIcon(icon: SimpleDraweeView, showIcon: Boolean) {
      ReactAssetUtilsKt.setReactAsset(var1, ReactAsset.Launch);
      ColorUtilsKt.setTintColor(var1, -1);
      val var3: Byte;
      if (var2) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var1.setVisibility(var3);
   }

   private fun configureStyle(button: Button, style: ButtonStyle) {
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
      val var14: MessageComponentButtonViewBinding = MessageComponentButtonViewBinding.bind(this);
      q.g(var14, "bind(...)");
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

      val var16: MaterialButton = var14.button;
      q.g(var14.button, "button");
      this.configureStyle(var16, var1.getStyle());
      val var17: SimpleDraweeSpanTextView = var14.emoji;
      q.g(var14.emoji, "emoji");
      this.configureEmoji(var17, var1.getEmoji(), var9);
      val var18: SimpleDraweeView = var14.linkIcon;
      q.g(var14.linkIcon, "linkIcon");
      val var10: Boolean;
      if (var1.getStyle() === ButtonStyle.LINK) {
         var10 = true;
      } else {
         var10 = false;
      }

      this.configureLinkIcon(var18, var10);
      val var19: MaterialTextView = var14.label;
      q.g(var14.label, "label");
      this.configureLabelPadding(var19, var1);
      var var5: Float;
      if (var7) {
         var5 = 0.5F;
      } else {
         var5 = 1.0F;
      }

      var14.label.setAlpha(var5);
      if (var7) {
         var5 = 0.3F;
      } else {
         var5 = 1.0F;
      }

      var14.emoji.setAlpha(var5);
      var5 = 1.0F;
      if (var7) {
         var5 = 0.3F;
      }

      var14.linkIcon.setAlpha(var5);
      var14.button.setEnabled((boolean)(var7 xor true));
      val var23: MaterialTextView = var14.label;
      var14.label.setText(var1.getLabel());
      q.e(var23);
      if (var9) {
         var7 = 4;
      } else {
         var7 = 0;
      }

      var23.setVisibility(var7);
      DiscordFontUtilsKt.setDiscordFont(var23, DiscordFont.PrimaryMedium);
      var23.setTextColor(ColorUtilsKt.getColorCompat(var23, R.color.white));
      if (!var9) {
         val var24: MaterialButton = var14.button;
         q.g(var14.button, "button");
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(
            var24, false, new com.discord.chat.presentation.message.view.botuikit.components.a(var1, var3), 1, null
         );
      } else {
         val var12: MaterialButton = var14.button;
         q.g(var14.button, "button");
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var12, false, new b(), 1, null);
      }

      val var13: ProgressDots = var14.loadingDots;
      q.g(var14.loadingDots, "loadingDots");
      if (var9) {
         var7 = 0;
      } else {
         var7 = 8;
      }

      var13.setVisibility(var7);
   }

   public override fun getComponentType(): KClass<ButtonComponent> {
      return g0.b(ButtonComponent.class);
   }

   public companion object {
      public fun inflateComponent(context: Context, root: ViewGroup): ButtonComponentView {
         q.h(var1, "context");
         q.h(var2, "root");
         val var3: ButtonComponentView = MessageComponentButtonViewBinding.inflate(LayoutInflater.from(var1), var2, false).getRoot();
         q.g(var3, "getRoot(...)");
         return var3;
      }
   }
}
