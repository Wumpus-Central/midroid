package com.discord.chat.presentation.message

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.messageframe.MessageFrameJump
import com.discord.chat.databinding.MessageFrameJumpHeaderBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.theme.ThemeManagerKt

public class MessageFrameJumpHeaderView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: MessageFrameJumpHeaderBinding

   fun MessageFrameJumpHeaderView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun MessageFrameJumpHeaderView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      val var4: MessageFrameJumpHeaderBinding = MessageFrameJumpHeaderBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var4, "inflate(...)");
      this.binding = var4;
      val var6: TextView = var4.messageHeaderTitle;
      var4.messageHeaderTitle.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.q.e(var6);
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimarySemibold);
      val var5: TextView = var4.messageHeaderSubtitle;
      var4.messageHeaderSubtitle.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.q.e(var5);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryNormal);
      this.setPadding(SizeUtilsKt.getDpToPx(8), 0, SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(8));
   }

   public fun configure(messageFrame: MessageFrameJump) {
      kotlin.jvm.internal.q.h(var1, "messageFrame");
      var var2: TextView = this.binding.messageHeaderTitle;
      kotlin.jvm.internal.q.g(this.binding.messageHeaderTitle, "messageHeaderTitle");
      ViewUtilsKt.setOptionalText(var2, var1.getChannelName());
      var2 = this.binding.messageHeaderSubtitle;
      kotlin.jvm.internal.q.g(this.binding.messageHeaderSubtitle, "messageHeaderSubtitle");
      ViewUtilsKt.setOptionalText(var2, var1.getGuildName());
   }
}
