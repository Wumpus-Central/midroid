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

   public open fun configure(component: TextDisplayComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      this.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      DiscordFontUtilsKt.setDiscordFont(this, DiscordFont.PrimaryMedium);
      val var4: Float;
      if (var3.isInContainerComponent()) {
         var4 = 14.0F;
      } else {
         val var7: Context = this.getContext();
         var4 = MessageUtilsKt.getChatTextSizeSp(var7);
      }

      SetTextSizeSpKt.setTextSizeSp(this, var4);
      val var5: TextPaint = this.getPaint();
      val var8: FontManager = FontManager.INSTANCE;
      val var6: Context = this.getContext();
      this.setMessageContent(
         var1.getContent(),
         var3.getMarkdownTextRenderOptions(),
         var3.getMarkdownTextRenderEventHandlers(),
         TextUtilsKt.getBaselineHeightForFontSizePx(var5, var8.getScaledSpToPx(16, var6))
      );
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
