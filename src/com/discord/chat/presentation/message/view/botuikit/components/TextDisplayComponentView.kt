package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.text.TextPaint
import android.widget.LinearLayout.LayoutParams
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.botuikit.TextDisplayComponent
import com.discord.chat.presentation.message.MessageUtilsKt
import com.discord.chat.presentation.message.view.MessageContentView
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.react.FontManager
import com.discord.theme.ThemeManagerKt
import kotlin.reflect.KClass

public class TextDisplayComponentView(context: Context) : MessageContentView(var1, null, 0, 6), ComponentView<TextDisplayComponent> {
   init {
      this.setLayoutParams(new LayoutParams(-1, -2));
   }

   public fun configure(component: TextDisplayComponent, componentContext: ComponentContext) {
      this.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      DiscordFontUtilsKt.setDiscordFont(this, DiscordFont.PrimaryMedium);
      val var3: Float;
      if (var2.isInContainerComponent()) {
         var3 = 14.0F;
      } else {
         val var4: Context = this.getContext();
         var3 = MessageUtilsKt.getChatTextSizeSp(var4);
      }

      SetTextSizeSpKt.setTextSizeSp(this, var3);
      val var5: TextPaint = this.getPaint();
      val var8: FontManager = FontManager.INSTANCE;
      val var6: Context = this.getContext();
      this.setMessageContent(
         var1.getContent(),
         var2.getMarkdownTextRenderOptions(),
         var2.getMarkdownTextRenderEventHandlers(),
         TextUtilsKt.getBaselineHeightForFontSizePx(var5, var8.getScaledSpToPx(16, var6))
      );
   }

   public open fun configure(component: TextDisplayComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      this.configure(var1, var3);
   }

   public override fun getComponentType(): KClass<TextDisplayComponent> {
      return TextDisplayComponent::class;
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): TextDisplayComponentView {
         return new TextDisplayComponentView(var1);
      }
   }
}
