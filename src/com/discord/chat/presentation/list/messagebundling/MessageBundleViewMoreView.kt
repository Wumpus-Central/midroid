package com.discord.chat.presentation.list.messagebundling

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import com.discord.SetTextSizeSpKt
import com.discord.chat.presentation.message.MessageUtilsKt
import com.discord.chat.presentation.spine.SpineParentMessage
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.internal.r

public class MessageBundleViewMoreView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : AppCompatTextView,
   SpineParentMessage {
   public open val spineOriginView: View
      public open get() {
         return this;
      }


   fun MessageBundleViewMoreView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun MessageBundleViewMoreView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
      DiscordFontUtilsKt.setDiscordFont(this, DiscordFont.PrimarySemibold);
      this.setTextColor(ThemeManagerKt.getTheme().getTextLink());
      SetTextSizeSpKt.setTextSizeSp(this, (float)MessageUtilsKt.getChatTextSizeSp(var1));
   }
}
