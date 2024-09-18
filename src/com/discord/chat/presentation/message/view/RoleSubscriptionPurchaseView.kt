package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.databinding.RoleSubscriptionPurchaseViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.view.SimpleDraweeView

public class RoleSubscriptionPurchaseView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: RoleSubscriptionPurchaseViewBinding

   fun RoleSubscriptionPurchaseView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun RoleSubscriptionPurchaseView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      val var5: RoleSubscriptionPurchaseViewBinding = RoleSubscriptionPurchaseViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var5, "inflate(...)");
      this.binding = var5;
      var var4: TextView = var5.roleSubscriptionWelcome;
      kotlin.jvm.internal.q.e(var5.roleSubscriptionWelcome);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryMedium);
      SetTextSizeSpKt.setTextSizeSp(var4, 16.0F);
      var4.setTextColor(ThemeManagerKt.getTheme().getStatusPositiveText());
      var4 = var5.roleSubscriptionPurchaserUsername;
      kotlin.jvm.internal.q.e(var5.roleSubscriptionPurchaserUsername);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryExtraBold);
      SetTextSizeSpKt.setTextSizeSp(var4, 20.0F);
      var4.setTextColor(ThemeManagerKt.getTheme().getStatusPositiveText());
      val var7: SimpleDraweeView = var5.roleSubscriptionPurchaseBadge;
      kotlin.jvm.internal.q.g(var5.roleSubscriptionPurchaseBadge, "roleSubscriptionPurchaseBadge");
      ReactAssetUtilsKt.setReactAsset(var7, ReactAsset.RoleSubscriptionBadge);
      val var8: SimpleDraweeView = var5.roleSubscriptionPurchaseLanyard;
      kotlin.jvm.internal.q.g(var5.roleSubscriptionPurchaseLanyard, "roleSubscriptionPurchaseLanyard");
      ReactAssetUtilsKt.setReactAsset(var8, ReactAsset.RoleSubscriptionLanyard);
      val var9: SimpleDraweeView = var5.roleSubscriptionPurchaseCardBg;
      kotlin.jvm.internal.q.g(var5.roleSubscriptionPurchaseCardBg, "roleSubscriptionPurchaseCardBg");
      ReactAssetUtilsKt.setReactAsset(var9, ReactAsset.RoleSubscriptionPurchaseCardBg);
      val var10: SimpleDraweeView = var5.roleSubscriptionPurchaserAvatar;
      kotlin.jvm.internal.q.g(var5.roleSubscriptionPurchaserAvatar, "roleSubscriptionPurchaserAvatar");
      ViewClippingUtilsKt.clipToCircle(var10);
      var5.roleSubscriptionWelcome.setText(I18nUtilsKt.i18nFormat$default(var1, I18nMessage.ROLE_SUBSCRIPTION_WELCOME_LABEL, null, 2, null));
   }

   public fun configure(authorUsername: String?, authorAvatar: String?, widthPx: Int) {
      this.binding.roleSubscriptionPurchaserUsername.setText(var1);
      this.binding.roleSubscriptionPurchaserAvatar.setImageURI(var2);
      val var6: android.view.ViewGroup.LayoutParams = this.binding.roleSubscriptionPurchaseCardBg.getLayoutParams();
      var6.width = var3;
      val var4: Double = var3;
      var6.height = (int)(0.339 * var3);
      val var7: android.view.ViewGroup.LayoutParams = this.binding.roleSubscriptionPurchaseBadge.getLayoutParams();
      var7.width = (int)(0.21 * var4);
      var7.height = (int)((int)(0.21 * var4) * 1.37);
      val var8: android.view.ViewGroup.LayoutParams = this.binding.roleSubscriptionPurchaseLanyard.getLayoutParams();
      var8.width = (int)(var4 * 0.18);
      var8.height = (int)((int)(var4 * 0.18) * 2.327);
   }
}
