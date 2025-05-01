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
import kotlin.jvm.internal.E
import kotlin.jvm.internal.q
import kotlin.reflect.KClass

public class TextDisplayComponentView(context: Context) : MessageContentView, ComponentView<TextDisplayComponent> {
   init {
      q.h(var1, "context");
      super(var1, null, 0, 6, null);
      this.setLayoutParams(new LayoutParams(-1, -2));
   }

   public open fun configure(component: TextDisplayComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      q.h(var1, "component");
      q.h(var2, "componentProvider");
      q.h(var3, "componentContext");
      this.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      DiscordFontUtilsKt.setDiscordFont(this, DiscordFont.PrimaryMedium);
      val var4: Float;
      if (var3.isInContainerComponent()) {
         var4 = 14.0F;
      } else {
         val var7: Context = this.getContext();
         q.g(var7, "getContext(...)");
         var4 = MessageUtilsKt.getChatTextSizeSp(var7);
      }

      SetTextSizeSpKt.setTextSizeSp(this, var4);
      val var6: TextPaint = this.getPaint();
      q.g(var6, "getPaint(...)");
      val var5: FontManager = FontManager.INSTANCE;
      val var8: Context = this.getContext();
      q.g(var8, "getContext(...)");
      this.setMessageContent(
         var1.getContent(),
         var3.getMarkdownTextRenderOptions(),
         var3.getMarkdownTextRenderEventHandlers(),
         TextUtilsKt.getBaselineHeightForFontSizePx(var6, var5.getScaledSpToPx(16, var8))
      );
   }

   public override fun getComponentType(): KClass<TextDisplayComponent> {
      return E.b(TextDisplayComponent.class);
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): TextDisplayComponentView {
         q.h(var1, "context");
         return new TextDisplayComponentView(var1);
      }
   }
}
