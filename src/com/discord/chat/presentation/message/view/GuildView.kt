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
import com.discord.theme.R
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
      kotlin.jvm.internal.r.g(var4, "inflate(...)");
      this.binding = var4;
      val var6: View = var4.getRoot();
      kotlin.jvm.internal.r.g(var6, "getRoot(...)");
      ViewClippingUtilsKt.clipToRoundedRectangle(var6, SizeUtilsKt.getDpToPx(16));
      val var5: TextView = var4.guildText;
      kotlin.jvm.internal.r.e(var4.guildText);
      SetTextSizeSpKt.setTextSizeSp(var5, 14.0F);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryNormal);
   }

   public fun configure(
      iconUrl: String?,
      shortGuildName: String? = null,
      thumbnailBackgroundColor: Int?,
      borderRadiusDp: Int? = null,
      thumbnailTextColor: Int? = null
   ) {
      if (!kotlin.jvm.internal.r.c(this.boundIconUrl, var1) || !kotlin.jvm.internal.r.c(this.boundShortGuildName, var2)) {
         this.boundIconUrl = var1;
         this.boundShortGuildName = var2;
         var var6: Int = 0;
         if (var1 != null && !kotlin.text.h.c0(var1)) {
            val var12: SimpleDraweeView = this.binding.guildAvatar;
            kotlin.jvm.internal.r.g(this.binding.guildAvatar, "guildAvatar");
            var12.setVisibility(0);
            val var13: TextView = this.binding.guildText;
            kotlin.jvm.internal.r.g(this.binding.guildText, "guildText");
            var13.setVisibility(8);
            this.binding.guildAvatar.setImageURI(var1);
            if (var3 != null) {
               var6 = var3;
            }

            this.setBackgroundColor(var6);
         } else {
            val var7: SimpleDraweeView = this.binding.guildAvatar;
            kotlin.jvm.internal.r.g(this.binding.guildAvatar, "guildAvatar");
            var7.setVisibility(8);
            val var8: TextView = this.binding.guildText;
            kotlin.jvm.internal.r.g(this.binding.guildText, "guildText");
            var8.setVisibility(0);
            this.binding.guildText.setText(var2);
            if (var3 != null) {
               var6 = var3;
            } else {
               val var9: Context = this.getContext();
               kotlin.jvm.internal.r.g(var9, "getContext(...)");
               var6 = ColorUtilsKt.getColorCompat(var9, R.color.brand);
            }

            this.setBackgroundColor(var6);
            if (var5 != null) {
               var6 = var5;
            } else {
               var6 = -1;
            }

            this.binding.guildText.setTextColor(var6);
         }

         val var11: View = this.binding.getRoot();
         kotlin.jvm.internal.r.g(var11, "getRoot(...)");
         if (var4 != null) {
            var6 = var4;
         } else {
            var6 = 16;
         }

         ViewClippingUtilsKt.clipToRoundedRectangle(var11, SizeUtilsKt.getDpToPx(var6));
      }
   }
}
