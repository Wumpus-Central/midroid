package com.discord.chat.presentation.separator

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.discord.SetTextSizeSpKt
import com.discord.chat.R.dimen
import com.discord.chat.databinding.SeparatorViewBinding
import com.discord.chat.presentation.list.ChatListConstraintLayout
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSeparatorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeparatorView.kt\ncom/discord/chat/presentation/separator/SeparatorView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,41:1\n146#2,8:42\n*S KotlinDebug\n*F\n+ 1 SeparatorView.kt\ncom/discord/chat/presentation/separator/SeparatorView\n*L\n26#1:42,8\n*E\n"])
public class SeparatorView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListConstraintLayout(var1, var2) {
   private final val binding: SeparatorViewBinding

   fun SeparatorView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var7: SeparatorViewBinding = SeparatorViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var7;
      val var3: Int = var1.getResources().getDimensionPixelSize(dimen.message_horizontal_spacing);
      val var4: View = var7.getRoot();
      var4.setPaddingRelative(var3, var4.getPaddingTop(), var3, var4.getPaddingBottom());
      val var5: TextView = var7.middleText;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimarySemibold);
      val var6: TextView = var7.middleText;
      SetTextSizeSpKt.setTextSizeSp(var6, 12.0F);
   }

   public fun setColor(color: Int) {
      this.binding.leftBar.setBackgroundColor(var1);
      this.binding.rightBar.setBackgroundColor(var1);
      this.binding.middleText.setTextColor(var1);
   }

   public fun setText(text: CharSequence) {
      this.binding.middleText.setText(var1);
   }
}
