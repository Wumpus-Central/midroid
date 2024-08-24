package com.discord.chat.presentation.separator

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.discord.SetTextSizeSpKt
import com.discord.chat.R
import com.discord.chat.databinding.SeparatorViewBinding
import com.discord.chat.presentation.list.ChatListConstraintLayout
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import kotlin.jvm.internal.r

public class SeparatorView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListConstraintLayout {
   private final val binding: SeparatorViewBinding

   fun SeparatorView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
      val var7: SeparatorViewBinding = SeparatorViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var7, "inflate(\n        LayoutI…ext),\n        this,\n    )");
      this.binding = var7;
      val var3: Int = var1.getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
      val var4: View = var7.getRoot();
      r.g(var4, "binding.root");
      var4.setPaddingRelative(var3, var4.getPaddingTop(), var3, var4.getPaddingBottom());
      val var5: TextView = var7.middleText;
      r.g(var7.middleText, "binding.middleText");
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimarySemibold);
      val var6: TextView = var7.middleText;
      r.g(var7.middleText, "binding.middleText");
      SetTextSizeSpKt.setTextSizeSp(var6, 12.0F);
   }

   public fun setColor(color: Int) {
      this.binding.leftBar.setBackgroundColor(var1);
      this.binding.rightBar.setBackgroundColor(var1);
      this.binding.middleText.setTextColor(var1);
   }

   public fun setText(text: CharSequence) {
      r.h(var1, "text");
      this.binding.middleText.setText(var1);
   }
}
