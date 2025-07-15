package com.discord.chat.presentation.message.view

import android.content.Context
import android.graphics.drawable.GradientDrawable.Orientation
import android.text.TextUtils.TruncateAt
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnLayoutChangeListener
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.databinding.GuildProfileInviteViewBinding
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView

public class GuildProfileInviteView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: GuildProfileInviteViewBinding

   fun GuildProfileInviteView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun GuildProfileInviteView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2, var3);
      val var6: GuildProfileInviteViewBinding = GuildProfileInviteViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var6, "inflate(...)");
      this.binding = var6;
      this.setMaxWidth(SizeUtilsKt.getDpToPx(375));
      ViewBackgroundUtilsKt.setBackgroundRectangle(
         this,
         ThemeManagerKt.getTheme().getBackgroundSecondary(),
         SizeUtilsKt.getDpToPx(16),
         ThemeManagerKt.getTheme().getBorderSubtle(),
         SizeUtilsKt.getDpToPx(1)
      );
      var var4: TextView = var6.headerText;
      var6.headerText.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      kotlin.jvm.internal.r.e(var4);
      SetTextSizeSpKt.setTextSizeSp(var4, 14.0F);
      val var8: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      var4 = var6.titleText;
      var6.titleText.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      kotlin.jvm.internal.r.e(var4);
      SetTextSizeSpKt.setTextSizeSp(var4, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, var8);
      var var5: TextView = var6.itemInviteOnlineText;
      var6.itemInviteOnlineText.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      kotlin.jvm.internal.r.e(var5);
      SetTextSizeSpKt.setTextSizeSp(var5, 14.0F);
      val var14: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      var5 = var6.itemInviteTotalMemberText;
      var6.itemInviteTotalMemberText.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      kotlin.jvm.internal.r.e(var5);
      SetTextSizeSpKt.setTextSizeSp(var5, 14.0F);
      DiscordFontUtilsKt.setDiscordFont(var5, var14);
      var5 = var6.establishedText;
      var6.establishedText.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      kotlin.jvm.internal.r.e(var5);
      SetTextSizeSpKt.setTextSizeSp(var5, 14.0F);
      DiscordFontUtilsKt.setDiscordFont(var5, var14);
      var5 = var6.bodyText;
      var6.bodyText.setTextColor(ThemeManagerKt.getTheme().getTextSecondary());
      kotlin.jvm.internal.r.e(var5);
      SetTextSizeSpKt.setTextSizeSp(var5, 14.0F);
      DiscordFontUtilsKt.setDiscordFont(var5, var14);
      val var15: DCDButton = var6.acceptButton;
      var6.acceptButton.setMaxLines(1);
      var15.ellipsize(TruncateAt.END);
      var15.setTextSizeSp(14.0F);
      var15.setDiscordFont(var8);
      var15.setCornerRadius(SizeUtilsKt.getDpToPx(20));
      var15.setTextColor(ThemeManagerKt.getTheme().getWhite());
      val var9: FrameLayout = var6.avatarContainer;
      var6.avatarContainer.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      kotlin.jvm.internal.r.e(var9);
      ViewClippingUtilsKt.clipToRoundedRectangle(var9, SizeUtilsKt.getDpToPx(16));
      val var10: View = var6.overlayGradient;
      kotlin.jvm.internal.r.g(var6.overlayGradient, "overlayGradient");
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         var10,
         new int[]{ColorUtilsKt.argbWithAdjustedAlpha(ThemeManagerKt.getTheme().getBackgroundSecondary(), 0.9F), 0},
         Orientation.BOTTOM_TOP,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         null,
         0,
         252,
         null
      );
      val var11: ImageView = var6.itemInviteOnlineDot;
      kotlin.jvm.internal.r.g(var6.itemInviteOnlineDot, "itemInviteOnlineDot");
      ViewBackgroundUtilsKt.setBackgroundOval$default(var11, ThemeManagerKt.getTheme().getStatusPositive(), 0, 2, null);
      val var7: ImageView = var6.itemInviteTotalMemberDot;
      kotlin.jvm.internal.r.g(var6.itemInviteTotalMemberDot, "itemInviteTotalMemberDot");
      ViewBackgroundUtilsKt.setBackgroundOval$default(var7, ThemeManagerKt.getTheme().getInteractiveMuted(), 0, 2, null);
   }

   public fun setAcceptButton(text: CharSequence?, backgroundColor: Int?) {
      val var5: DCDButton = this.binding.acceptButton;
      kotlin.jvm.internal.r.e(this.binding.acceptButton);
      var var3: Boolean;
      if (var1 != null && !kotlin.text.h.c0(var1)) {
         var3 = 0;
      } else {
         var3 = 1;
      }

      if (!var3) {
         var3 = (byte)0;
      } else {
         var3 = (byte)8;
      }

      var5.setVisibility(var3);
      if (var2 != null) {
         var3 = var2;
      } else {
         var3 = ThemeManagerKt.getTheme().getRedesignButtonPrimaryBackground();
      }

      var5.setBackgroundColor(var3);
      var5.setText(var1);
   }

   public fun setAvatar(url: String?, thumbnailText: String?) {
      this.binding.avatar.configure(var1, var2, ThemeManagerKt.getTheme().getBackgroundPrimary(), 16, ThemeManagerKt.getTheme().getHeaderPrimary());
   }

   public fun setBanner(url: String?, color: Int, secondaryColor: Int, roundTop: Boolean) {
      val var5: Float;
      if (var4) {
         var5 = SizeUtilsKt.getDpToPx(16);
      } else {
         var5 = 0.0F;
      }

      val var6: SimpleDraweeView = this.binding.itemInviteSplash;
      (this.binding.itemInviteSplash.getHierarchy() as GenericDraweeHierarchy).E(com.facebook.drawee.generic.a.a(var5, var5, 0.0F, 0.0F));
      var6.setImageURI(var1);
      if (var1 == null) {
         kotlin.jvm.internal.r.e(var6);
         ViewBackgroundUtilsKt.setBackgroundRectangle$default(var6, new int[]{var2, var3}, Orientation.TL_BR, var5, var5, 0.0F, 0.0F, null, 0, 240, null);
      } else {
         var6.setBackground(null);
      }
   }

   public fun setBody(bodyText: CharSequence?, hasProfileOverflow: Boolean) {
      val var5: TextView = this.binding.bodyText;
      kotlin.jvm.internal.r.e(this.binding.bodyText);
      var var3: Boolean;
      if (var1 != null && var1.length() != 0) {
         var3 = 0;
      } else {
         var3 = 1;
      }

      if (!var3) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var5.setVisibility(var3);
      var5.setText(var1);
      if (var1 == null || var1.length() == 0) {
         this.binding.overlayGradient.setVisibility(4);
      } else if (var2) {
         this.binding.overlayGradient.setVisibility(0);
      } else if (var5.isLaidOut() && !var5.isLayoutRequested()) {
         val var6: View = access$getBinding$p(this).overlayGradient;
         if (var5.getLayout() != null && var5.getLayout().getLineCount() > 0 && var5.getLayout().getEllipsisCount(var5.getLayout().getLineCount() - 1) > 0) {
            var3 = 0;
         } else {
            var3 = 4;
         }

         var6.setVisibility(var3);
      } else {
         var5.addOnLayoutChangeListener(
            new OnLayoutChangeListener(this, var5) {
               final TextView $this_apply$inlined;
               final GuildProfileInviteView this$0;

               {
                  this.this$0 = var1;
                  this.$this_apply$inlined = var2;
               }

               public void onLayoutChange(View var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
                  var1.removeOnLayoutChangeListener(this);
                  var1 = GuildProfileInviteView.access$getBinding$p(this.this$0).overlayGradient;
                  val var11: Byte;
                  if (this.$this_apply$inlined.getLayout() != null
                     && this.$this_apply$inlined.getLayout().getLineCount() > 0
                     && this.$this_apply$inlined.getLayout().getEllipsisCount(this.$this_apply$inlined.getLayout().getLineCount() - 1) > 0) {
                     var11 = 0;
                  } else {
                     var11 = 4;
                  }

                  var1.setVisibility(var11);
               }
            }
         );
      }
   }

   public fun setClickListeners(tapEmbedListener: OnClickListener?, tapAcceptListener: OnClickListener?) {
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested(this, true, var1);
      this.binding.acceptButton.setOnClickButtonListener(var2);
   }

   public fun setEstablished(establishedText: CharSequence?) {
      val var4: TextView = this.binding.establishedText;
      kotlin.jvm.internal.r.e(this.binding.establishedText);
      var var2: Boolean;
      if (var1 != null && var1.length() != 0) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      if (!var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      var4.setText(var1);
   }

   public fun setGuildBadge(url: String?) {
      val var2: SimpleDraweeView = this.binding.guildBadge;
      kotlin.jvm.internal.r.g(this.binding.guildBadge, "guildBadge");
      ReactAssetUtilsKt.setOptionalReactImageUrl(var2, var1);
   }

   public fun setHeader(headerText: CharSequence?) {
      val var4: TextView = this.binding.headerText;
      kotlin.jvm.internal.r.e(this.binding.headerText);
      var var2: Boolean;
      if (var1 != null && var1.length() != 0) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      if (!var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      var4.setText(var1);
   }

   public fun setPresence(onlineText: CharSequence?, memberText: CharSequence?) {
      val var6: ImageView = this.binding.itemInviteOnlineDot;
      kotlin.jvm.internal.r.g(this.binding.itemInviteOnlineDot, "itemInviteOnlineDot");
      var var3: Boolean;
      if (var1 != null && !kotlin.text.h.c0(var1)) {
         var3 = 0;
      } else {
         var3 = 1;
      }

      if (!var3) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var6.setVisibility(var3);
      val var16: TextView = this.binding.itemInviteOnlineText;
      kotlin.jvm.internal.r.g(this.binding.itemInviteOnlineText, "itemInviteOnlineText");
      var var10: Boolean;
      if (var1 != null && !kotlin.text.h.c0(var1)) {
         var10 = 0;
      } else {
         var10 = 1;
      }

      if (!var10) {
         var10 = 0;
      } else {
         var10 = 8;
      }

      var16.setVisibility(var10);
      this.binding.itemInviteOnlineText.setText(var1);
      val var7: ImageView = this.binding.itemInviteTotalMemberDot;
      kotlin.jvm.internal.r.g(this.binding.itemInviteTotalMemberDot, "itemInviteTotalMemberDot");
      var var12: Boolean;
      if (var2 != null && !kotlin.text.h.c0(var2)) {
         var12 = 0;
      } else {
         var12 = 1;
      }

      if (!var12) {
         var12 = 0;
      } else {
         var12 = 8;
      }

      var7.setVisibility(var12);
      val var8: TextView = this.binding.itemInviteTotalMemberText;
      kotlin.jvm.internal.r.g(this.binding.itemInviteTotalMemberText, "itemInviteTotalMemberText");
      var var14: Byte = 1;
      if (var2 != null) {
         if (kotlin.text.h.c0(var2)) {
            var14 = 1;
         } else {
            var14 = 0;
         }
      }

      if (!var14) {
         var14 = 0;
      } else {
         var14 = 8;
      }

      var8.setVisibility(var14);
      this.binding.itemInviteTotalMemberText.setText(var2);
   }

   public fun setTitle(titleText: CharSequence?) {
      val var4: TextView = this.binding.titleText;
      kotlin.jvm.internal.r.e(this.binding.titleText);
      var var2: Boolean;
      if (var1 != null && var1.length() != 0) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      if (!var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      var4.setText(var1);
   }
}
