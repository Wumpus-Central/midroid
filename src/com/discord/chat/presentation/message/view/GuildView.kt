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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nGuildView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuildView.kt\ncom/discord/chat/presentation/message/view/GuildView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,68:1\n257#2,2:69\n257#2,2:71\n257#2,2:73\n257#2,2:75\n*S KotlinDebug\n*F\n+ 1 GuildView.kt\ncom/discord/chat/presentation/message/view/GuildView\n*L\n49#1:69,2\n50#1:71,2\n58#1:73,2\n59#1:75,2\n*E\n"])
public class GuildView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout(var1, var2, var3) {
   private final val binding: GuildViewBinding
   private final var boundIconUrl: String?
   private final var boundShortGuildName: String?

   fun GuildView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun GuildView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var4: GuildViewBinding = GuildViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var4;
      val var6: View = var4.getRoot();
      ViewClippingUtilsKt.clipToRoundedRectangle(var6, SizeUtilsKt.getDpToPx(16));
      val var5: TextView = var4.guildText;
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
      if (!(this.boundIconUrl == var1) || !(this.boundShortGuildName == var2)) {
         this.boundIconUrl = var1;
         this.boundShortGuildName = var2;
         var var6: Int = 0;
         if (var1 != null && !StringsKt.c0(var1)) {
            val var12: SimpleDraweeView = this.binding.guildAvatar;
            var12.setVisibility(0);
            val var13: TextView = this.binding.guildText;
            var13.setVisibility(8);
            this.binding.guildAvatar.setImageURI(var1);
            if (var3 != null) {
               var6 = var3;
            }

            this.setBackgroundColor(var6);
         } else {
            val var7: SimpleDraweeView = this.binding.guildAvatar;
            var7.setVisibility(8);
            val var8: TextView = this.binding.guildText;
            var8.setVisibility(0);
            this.binding.guildText.setText(var2);
            if (var3 != null) {
               var6 = var3;
            } else {
               val var9: Context = this.getContext();
               var6 = ColorUtilsKt.getColorCompat(var9, color.brand);
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
         if (var4 != null) {
            var6 = var4;
         } else {
            var6 = 16;
         }

         ViewClippingUtilsKt.clipToRoundedRectangle(var11, SizeUtilsKt.getDpToPx(var6));
      }
   }
}
