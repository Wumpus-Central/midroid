package com.discord.chat.presentation.message.view

import android.content.Context
import android.text.style.StyleSpan
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.databinding.GuildInviteDisabledViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function1

public class GuildInviteDisabledView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: GuildInviteDisabledViewBinding

   fun GuildInviteDisabledView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun GuildInviteDisabledView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      val var4: GuildInviteDisabledViewBinding = GuildInviteDisabledViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var4, "inflate(...)");
      this.binding = var4;
      val var6: TextView = var4.itemInviteHeader;
      var4.itemInviteHeader.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      kotlin.jvm.internal.q.e(var6);
      SetTextSizeSpKt.setTextSizeSp(var6, 11.0F);
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimaryBold);
      val var7: SimpleDraweeView = var4.itemInviteHelpIcon;
      kotlin.jvm.internal.q.e(var4.itemInviteHelpIcon);
      ReactAssetUtilsKt.setReactAsset(var7, ReactAsset.Help);
      ColorUtilsKt.setTintColor(var7, ThemeManagerKt.getTheme().getTextMuted());
      val var8: TextView = var4.itemInviteTitle;
      var4.itemInviteTitle.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      kotlin.jvm.internal.q.e(var8);
      SetTextSizeSpKt.setTextSizeSp(var8, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var8, DiscordFont.PrimaryMedium);
      val var5: SimpleDraweeSpanTextView = var4.itemInviteSubtitle;
      var4.itemInviteSubtitle.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.q.e(var5);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryNormal);
   }

   @JvmStatic
   fun `setHelpIcon$lambda$5$lambda$4`(var0: Function1, var1: java.lang.String, var2: View) {
      kotlin.jvm.internal.q.h(var0, "$onHelpArticleClicked");
      kotlin.jvm.internal.q.h(var1, "$helpArticleLink");
      var0.invoke(var1);
   }

   public fun setBackgroundRectangleColor(color: Int?) {
      val var2: Int;
      if (var1 != null) {
         var2 = var1;
      } else {
         val var3: Context = this.getContext();
         kotlin.jvm.internal.q.g(var3, "getContext(...)");
         var2 = ColorUtilsKt.getColorCompat(var3, ThemeManagerKt.getTheme().getColorRes(R.color.primary_100, R.color.primary_630));
      }

      ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, var2, SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
   }

   public fun setGuildImage(url: String?, thumbnailText: String?, thumbnailBackgroundColor: Int?) {
      this.binding.itemInviteImage.configure(var1, var2, var3);
      val var4: SimpleDraweeView = this.binding.itemInviteDisabledIcon;
      kotlin.jvm.internal.q.g(this.binding.itemInviteDisabledIcon, "itemInviteDisabledIcon");
      ReactAssetUtilsKt.setReactAsset(var4, ReactAsset.InvitesDisabled);
   }

   public fun setHeaderColor(color: Int?) {
      val var3: TextView = this.binding.itemInviteHeader;
      val var2: Int;
      if (var1 != null) {
         var2 = var1;
      } else {
         var2 = ThemeManagerKt.getTheme().getInteractiveNormal();
      }

      var3.setTextColor(var2);
   }

   public fun setHeaderText(headerText: CharSequence) {
      kotlin.jvm.internal.q.h(var1, "headerText");
      this.binding.itemInviteHeader.setText(var1);
   }

   public fun setHelpIcon(label: String, helpArticleLink: String, onHelpArticleClicked: (String) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "label");
      kotlin.jvm.internal.q.h(var2, "helpArticleLink");
      kotlin.jvm.internal.q.h(var3, "onHelpArticleClicked");
      val var4: SimpleDraweeView = this.binding.itemInviteHelpIcon;
      this.binding.itemInviteHelpIcon.setContentDescription(var1);
      var4.setOnClickListener(new g0(var3, var2));
   }

   public fun setSubtitle(subtitle: String, guildName: String) {
      kotlin.jvm.internal.q.h(var1, "subtitle");
      kotlin.jvm.internal.q.h(var2, "guildName");
      val var3: DraweeSpanStringBuilder = new DraweeSpanStringBuilder(var1);
      var3.append(var2);
      var3.setSpan(new StyleSpan(1), var1.length(), var3.length(), 33);
      this.binding.itemInviteSubtitle.setText(var3);
   }

   public fun setSubtitleColor(color: Int?) {
      val var3: SimpleDraweeSpanTextView = this.binding.itemInviteSubtitle;
      val var2: Int;
      if (var1 != null) {
         var2 = var1;
      } else {
         var2 = ThemeManagerKt.getTheme().getTextNormal();
      }

      var3.setTextColor(var2);
   }

   public fun setTitleColor(color: Int?) {
      val var3: TextView = this.binding.itemInviteTitle;
      val var2: Int;
      if (var1 != null) {
         var2 = var1;
      } else {
         var2 = ThemeManagerKt.getTheme().getHeaderPrimary();
      }

      var3.setTextColor(var2);
   }

   public fun setTitleText(name: CharSequence) {
      kotlin.jvm.internal.q.h(var1, "name");
      this.binding.itemInviteTitle.setText(var1);
   }
}
