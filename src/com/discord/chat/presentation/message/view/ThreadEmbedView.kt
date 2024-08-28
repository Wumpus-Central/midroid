package com.discord.chat.presentation.message.view

import android.content.Context
import android.text.style.LeadingMarginSpan
import android.text.style.LeadingMarginSpan.Standard
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.databinding.ThreadEmbedViewBinding
import com.discord.chat.presentation.message.ClanTagChipletView
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.primitives.GuildId
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.ripple.RippleUtilsKt
import com.discord.span.utilities.BackgroundSpanDrawer
import com.discord.span.utilities.SpannableExtensionsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import com.facebook.drawee.view.SimpleDraweeView

public class ThreadEmbedView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   public final val binding: ThreadEmbedViewBinding

   fun ThreadEmbedView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ThreadEmbedView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2, var3);
      val var5: ThreadEmbedViewBinding = ThreadEmbedViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var5, "inflate(LayoutInflater.from(context), this)");
      this.binding = var5;
      var var4: TextView = var5.threadEmbedName;
      kotlin.jvm.internal.r.g(var5.threadEmbedName, "_init_$lambda$0");
      val var7: DiscordFont = DiscordFont.PrimaryBold;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryBold);
      SetTextSizeSpKt.setTextSizeSp(var4, 14.0F);
      var4.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      var4 = var5.threadEmbedMessagesCount;
      kotlin.jvm.internal.r.g(var5.threadEmbedMessagesCount, "_init_$lambda$1");
      DiscordFontUtilsKt.setDiscordFont(var4, var7);
      SetTextSizeSpKt.setTextSizeSp(var4, 14.0F);
      var4.setTextColor(ThemeManagerKt.getTheme().getTextLink());
      var4 = var5.threadEmbedMostRecentMessageName;
      kotlin.jvm.internal.r.g(var5.threadEmbedMostRecentMessageName, "_init_$lambda$2");
      DiscordFontUtilsKt.setDiscordFont(var4, var7);
      SetTextSizeSpKt.setTextSizeSp(var4, 14.0F);
      var4.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      val var6: SimpleDraweeSpanTextView = var5.threadEmbedMostRecentMessageContent;
      kotlin.jvm.internal.r.g(var5.threadEmbedMostRecentMessageContent, "_init_$lambda$3");
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimaryMedium);
      SetTextSizeSpKt.setTextSizeSp(var6, 14.0F);
      var6.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         this, ThemeManagerKt.getTheme().getBackgroundSecondary(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null
      );
      RippleUtilsKt.addRipple(this, true, SizeUtilsKt.getDpToPx(4));
      this.setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8));
   }

   private fun getLeadingMarginSpan(): LeadingMarginSpan {
      this.binding.threadEmbedMostRecentMessageHeader.measure(0, 0);
      return new Standard(this.binding.threadEmbedMostRecentMessageHeader.getMeasuredWidth(), 0);
   }

   public fun setArchived(archived: Boolean, iconUrl: String? = null) {
      val var4: SimpleDraweeView = this.binding.threadEmbedIcon;
      kotlin.jvm.internal.r.g(this.binding.threadEmbedIcon, "binding.threadEmbedIcon");
      ReactAssetUtilsKt.setOptionalReactImageUrl(var4, var2);
      val var5: SimpleDraweeView = this.binding.threadEmbedIcon;
      kotlin.jvm.internal.r.g(this.binding.threadEmbedIcon, "binding.threadEmbedIcon");
      val var3: Byte;
      if (var1) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var5.setVisibility(var3);
   }

   public fun setMessage(
      imageUrl: String?,
      username: String?,
      usernameColor: Int?,
      message: DraweeSpanStringBuilder,
      italicizeMessage: Boolean,
      clanTag: String?,
      clanBadgeUrl: String?,
      clanGuildId: GuildId?
   ) {
      kotlin.jvm.internal.r.h(var4, "message");
      if (var3 != null) {
         this.binding.threadEmbedMostRecentMessageName.setTextColor(var3);
      } else {
         this.binding.threadEmbedMostRecentMessageName.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      }

      val var17: TextView = this.binding.threadEmbedMostRecentMessageName;
      kotlin.jvm.internal.r.g(this.binding.threadEmbedMostRecentMessageName, "binding.threadEmbedMostRecentMessageName");
      ViewUtilsKt.setOptionalText(var17, var2);
      this.binding.threadEmbedMostRecentMessageAvatar.setImageURI(var1);
      val var9: Boolean;
      if (var2 != null) {
         var9 = true;
      } else {
         var9 = false;
      }

      val var11: LinearLayout = this.binding.threadEmbedMostRecentMessageHeader;
      kotlin.jvm.internal.r.g(this.binding.threadEmbedMostRecentMessageHeader, "binding.threadEmbedMostRecentMessageHeader");
      val var10: Byte;
      if (var9) {
         var10 = 0;
      } else {
         var10 = 8;
      }

      var11.setVisibility(var10);
      val var16: SimpleDraweeSpanTextView = this.binding.threadEmbedMostRecentMessageContent;
      kotlin.jvm.internal.r.g(this.binding.threadEmbedMostRecentMessageContent, "binding.threadEmbedMostRecentMessageContent");
      val var12: DiscordFont;
      if (var5) {
         var12 = DiscordFont.PrimaryNormalItalic;
      } else {
         var12 = DiscordFont.PrimaryMedium;
      }

      DiscordFontUtilsKt.setDiscordFont(var16, var12);
      if (var6 != null && var8 != null) {
         this.binding.tagChiplet.configure-D0ylKIU(var6, var7, var8.unbox-impl(), null, 0.89F);
         val var14: ClanTagChipletView = this.binding.tagChiplet;
         kotlin.jvm.internal.r.g(this.binding.tagChiplet, "binding.tagChiplet");
         var14.setVisibility(0);
      } else {
         val var13: ClanTagChipletView = this.binding.tagChiplet;
         kotlin.jvm.internal.r.g(this.binding.tagChiplet, "binding.tagChiplet");
         var13.setVisibility(8);
      }

      if (var9) {
         var4.setSpan(this.getLeadingMarginSpan(), 0, var4.length(), 33);
      }

      val var15: SimpleDraweeSpanTextView = this.binding.threadEmbedMostRecentMessageContent;
      kotlin.jvm.internal.r.g(this.binding.threadEmbedMostRecentMessageContent, "binding.threadEmbedMostRecentMessageContent");
      SpannableExtensionsKt.coverWithSpan(var4, new BackgroundSpanDrawer(var15));
      this.binding.threadEmbedMostRecentMessageContent.setDraweeSpanStringBuilder(var4);
   }

   public fun setThread(title: CharSequence?, label: String) {
      kotlin.jvm.internal.r.h(var2, "label");
      val var3: TextView = this.binding.threadEmbedName;
      kotlin.jvm.internal.r.g(this.binding.threadEmbedName, "binding.threadEmbedName");
      ViewUtilsKt.setOptionalText(var3, var1);
      val var4: TextView = this.binding.threadEmbedMessagesCount;
      kotlin.jvm.internal.r.g(this.binding.threadEmbedMessagesCount, "binding.threadEmbedMessagesCount");
      ViewUtilsKt.setOptionalText(var4, var2);
   }
}
