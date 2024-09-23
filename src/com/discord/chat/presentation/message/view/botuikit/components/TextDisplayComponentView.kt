package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.text.TextPaint
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.botuikit.TextDisplayComponent
import com.discord.chat.databinding.MessageComponentTextDisplayViewBinding
import com.discord.chat.presentation.message.MessageUtilsKt
import com.discord.chat.presentation.message.view.MessageContentView
import com.discord.chat.presentation.message.view.botuikit.ComponentActionListener
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.react.FontManager
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlin.reflect.KClass

public class TextDisplayComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : ConstraintLayout,
   ComponentView<TextDisplayComponent> {
   fun TextDisplayComponentView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun TextDisplayComponentView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
   }

   public open fun configure(
      component: TextDisplayComponent,
      componentProvider: ComponentProvider,
      componentActionListener: ComponentActionListener,
      componentContext: ComponentContext
   ) {
      q.h(var1, "component");
      q.h(var2, "componentProvider");
      q.h(var3, "componentActionListener");
      q.h(var4, "componentContext");
      val var9: MessageComponentTextDisplayViewBinding = MessageComponentTextDisplayViewBinding.bind(this);
      q.g(var9, "bind(...)");
      val var10: Context = this.getContext();
      q.g(var10, "getContext(...)");
      val var11: MessageContentView = new MessageContentView(var10, null, 0, 6, null);
      var11.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      val var6: Context = this.getContext();
      q.g(var6, "getContext(...)");
      SetTextSizeSpKt.setTextSizeSp(var11, (float)MessageUtilsKt.getChatTextSizeSp(var6));
      DiscordFontUtilsKt.setDiscordFont(var11, DiscordFont.PrimaryMedium);
      val var12: TextPaint = var11.getPaint();
      q.g(var12, "getPaint(...)");
      val var8: FontManager = FontManager.INSTANCE;
      val var7: Context = this.getContext();
      q.g(var7, "getContext(...)");
      var11.setMessageContent(
         var1.getContent(),
         var4.getMarkdownTextRenderOptions(),
         var4.getMarkdownTextRenderEventHandlers(),
         TextUtilsKt.getBaselineHeightForFontSizePx(var12, var8.getScaledSpToPx(16, var7))
      );
      var9.getRoot().addView(var11);
   }

   public override fun getComponentType(): KClass<TextDisplayComponent> {
      return g0.b(TextDisplayComponent.class);
   }

   public companion object {
      public fun inflateComponent(context: Context, root: ViewGroup): TextDisplayComponentView {
         q.h(var1, "context");
         q.h(var2, "root");
         val var3: TextDisplayComponentView = MessageComponentTextDisplayViewBinding.inflate(LayoutInflater.from(var1), var2, false).getRoot();
         q.g(var3, "getRoot(...)");
         return var3;
      }
   }
}
