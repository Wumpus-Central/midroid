package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import com.discord.SetTextSizeSpKt
import com.discord.chat.databinding.GuildViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView

public class GuildView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout {
   private final val binding: GuildViewBinding
   private final var boundIconUrl: String?
   private final var boundShortGuildName: String?

   fun GuildView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun GuildView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      val var6: GuildViewBinding = GuildViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var6, "inflate(...)");
      this.binding = var6;
      val var4: View = var6.getRoot();
      kotlin.jvm.internal.q.g(var4, "getRoot(...)");
      ViewClippingUtilsKt.clipToRoundedRectangle(var4, SizeUtilsKt.getDpToPx(16));
      val var5: TextView = var6.guildText;
      kotlin.jvm.internal.q.e(var6.guildText);
      SetTextSizeSpKt.setTextSizeSp(var5, 14.0F);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryNormal);
   }

   public fun configure(iconUrl: String?, shortGuildName: String? = null, thumbnailBackgroundColor: Int?) {
      if (!kotlin.jvm.internal.q.c(this.boundIconUrl, var1) || !kotlin.jvm.internal.q.c(this.boundShortGuildName, var2)) {
         this.boundIconUrl = var1;
         this.boundShortGuildName = var2;
         var var4: Int = 0;
         if (var1 != null && !kotlin.text.h.x(var1)) {
            val var8: SimpleDraweeView = this.binding.guildAvatar;
            kotlin.jvm.internal.q.g(this.binding.guildAvatar, "guildAvatar");
            var8.setVisibility(0);
            val var9: TextView = this.binding.guildText;
            kotlin.jvm.internal.q.g(this.binding.guildText, "guildText");
            var9.setVisibility(8);
            this.binding.guildAvatar.setImageURI(var1);
            if (var3 != null) {
               var4 = var3;
            }

            this.setBackgroundColor(var4);
         } else {
            val var5: SimpleDraweeView = this.binding.guildAvatar;
            kotlin.jvm.internal.q.g(this.binding.guildAvatar, "guildAvatar");
            var5.setVisibility(8);
            val var6: TextView = this.binding.guildText;
            kotlin.jvm.internal.q.g(this.binding.guildText, "guildText");
            var6.setVisibility(0);
            this.binding.guildText.setText(var2);
            if (var3 != null) {
               var4 = var3;
            } else {
               val var7: Context = this.getContext();
               kotlin.jvm.internal.q.g(var7, "getContext(...)");
               var4 = ColorUtilsKt.getColorCompat(var7, color.brand);
            }

            this.setBackgroundColor(var4);
         }
      }
   }
}
