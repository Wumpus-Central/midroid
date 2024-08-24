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
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun GuildView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2, var3);
      val var4: GuildViewBinding = GuildViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var4, "inflate(LayoutInflater.from(context), this)");
      this.binding = var4;
      val var6: View = var4.getRoot();
      kotlin.jvm.internal.r.g(var6, "binding.root");
      ViewClippingUtilsKt.clipToRoundedRectangle(var6, SizeUtilsKt.getDpToPx(16));
      val var5: TextView = var4.guildText;
      kotlin.jvm.internal.r.g(var4.guildText, "_init_$lambda$0");
      SetTextSizeSpKt.setTextSizeSp(var5, 14.0F);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryNormal);
   }

   public fun configure(iconUrl: String?, shortGuildName: String? = null, thumbnailBackgroundColor: Int?) {
      if (!kotlin.jvm.internal.r.c(this.boundIconUrl, var1) || !kotlin.jvm.internal.r.c(this.boundShortGuildName, var2)) {
         this.boundIconUrl = var1;
         this.boundShortGuildName = var2;
         var var4: Boolean;
         if (var1 != null && !kotlin.text.f.x(var1)) {
            var4 = 0;
         } else {
            var4 = 1;
         }

         if (var4) {
            val var6: SimpleDraweeView = this.binding.guildAvatar;
            kotlin.jvm.internal.r.g(this.binding.guildAvatar, "binding.guildAvatar");
            var6.setVisibility(8);
            val var7: TextView = this.binding.guildText;
            kotlin.jvm.internal.r.g(this.binding.guildText, "binding.guildText");
            var7.setVisibility(0);
            this.binding.guildText.setText(var2);
            if (var3 != null) {
               var4 = var3;
            } else {
               val var8: Context = this.getContext();
               kotlin.jvm.internal.r.g(var8, "context");
               var4 = ColorUtilsKt.getColorCompat(var8, color.brand);
            }

            this.setBackgroundColor(var4);
         } else {
            val var9: SimpleDraweeView = this.binding.guildAvatar;
            kotlin.jvm.internal.r.g(this.binding.guildAvatar, "binding.guildAvatar");
            var9.setVisibility(0);
            val var10: TextView = this.binding.guildText;
            kotlin.jvm.internal.r.g(this.binding.guildText, "binding.guildText");
            var10.setVisibility(8);
            this.binding.guildAvatar.setImageURI(var1);
            var4 = 0;
            if (var3 != null) {
               var4 = var3;
            }

            this.setBackgroundColor(var4);
         }
      }
   }
}
