package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.databinding.ActivityBookmarkViewBinding
import com.discord.chat.presentation.media.MediaContainingViewResizer
import com.discord.chat.presentation.message.MessageAccessoriesView
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.overlapping_circles.OverlappingCirclesView
import com.discord.overlapping_circles.OverlappingItem
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import java.util.ArrayList

public class ActivityBookmarkView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: ActivityBookmarkViewBinding

   fun ActivityBookmarkView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ActivityBookmarkView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2, var3);
      val var4: ActivityBookmarkViewBinding = ActivityBookmarkViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var4, "inflate(LayoutInflater.from(context), this)");
      this.binding = var4;
      var var5: TextView = var4.itemHeader;
      var4.itemHeader.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      kotlin.jvm.internal.r.g(var5, "lambda$4$lambda$0");
      SetTextSizeSpKt.setTextSizeSp(var5, 24.0F);
      val var6: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimarySemibold);
      var5 = var4.itemDescription;
      var4.itemDescription.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.r.g(var5, "lambda$4$lambda$1");
      SetTextSizeSpKt.setTextSizeSp(var5, 14.0F);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      val var9: SimpleDraweeView = var4.icon;
      kotlin.jvm.internal.r.g(var4.icon, "lambda$4$lambda$2");
      ReactAssetUtilsKt.setReactAsset(var9, ReactAsset.Members);
      ColorUtilsKt.setTintColor(var9, ThemeManagerKt.getTheme().getInteractiveNormal());
      val var7: TextView = var4.participantsInfo;
      var4.participantsInfo.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.r.g(var7, "lambda$4$lambda$3");
      SetTextSizeSpKt.setTextSizeSp(var7, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var7, var6);
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         this,
         ColorUtilsKt.getColorCompat(var1, ThemeManagerKt.getTheme().getColorRes(color.primary_130, color.primary_630)),
         SizeUtilsKt.getDpToPx(8),
         null,
         0,
         12,
         null
      );
   }

   public fun setAvatarUris(avatarUris: List<String>) {
      kotlin.jvm.internal.r.h(var1, "avatarUris");
      val var4: Boolean = var1.isEmpty() xor true;
      var var5: OverlappingCirclesView = this.binding.participants;
      kotlin.jvm.internal.r.g(this.binding.participants, "binding.participants");
      var var2: Byte;
      if (var4) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var5.setVisibility(var2);
      var5 = this.binding.participants;
      val var6: ArrayList = new ArrayList(kotlin.collections.h.t(var1, 10));
      val var7: java.util.Iterator = var1.iterator();

      while (var7.hasNext()) {
         var6.add(new OverlappingItem(var7.next() as java.lang.String));
      }

      var5.setItems(var6);
      val var8: LinearLayout = this.binding.participantsInfoContainer;
      kotlin.jvm.internal.r.g(this.binding.participantsInfoContainer, "binding.participantsInfoContainer");
      if (var4 xor true) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var8.setVisibility(var2);
   }

   public fun setDescription(description: String?) {
      if (var1 != null) {
         this.binding.itemDescription.setText(var1);
      }
   }

   public fun setHeaderText(headerText: CharSequence?) {
      var var2: Boolean;
      if (var1 != null && var1.length() != 0) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      val var4: TextView = this.binding.itemHeader;
      kotlin.jvm.internal.r.g(this.binding.itemHeader, "binding.itemHeader");
      if (true xor var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      this.binding.itemHeader.setText(var1);
   }

   public fun setLaunchButton(text: String?, backgroundColor: Int?) {
      val var5: DCDButton = this.binding.launchButton;
      kotlin.jvm.internal.r.g(this.binding.launchButton, "setLaunchButton$lambda$6");
      var var3: Boolean;
      if (var1 != null && var1.length() != 0) {
         var3 = 0;
      } else {
         var3 = 1;
      }

      if (true xor var3) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var5.setVisibility(var3);
      var5.setText(var1);
      var5.setBackgroundColor(var2);
   }

   public fun setOnLaunchButtonClickListener(onLaunchButtonClickListener: OnClickListener) {
      kotlin.jvm.internal.r.h(var1, "onLaunchButtonClickListener");
      this.binding.launchButton.setOnClickButtonListener(var1);
   }

   public fun setParticipantsText(text: String) {
      kotlin.jvm.internal.r.h(var1, "text");
      this.binding.participantsInfo.setText(var1);
   }

   public fun setSplash(splashUrl: String?, constrainedWidth: Int) {
      var var4: SimpleDraweeView = this.binding.itemHero;
      kotlin.jvm.internal.r.g(this.binding.itemHero, "binding.itemHero");
      var var3: Boolean;
      if (var1 != null) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      if (var3) {
         var3 = (byte)0;
      } else {
         var3 = (byte)8;
      }

      var4.setVisibility(var3);
      this.binding.itemHero.setImageURI(var1);
      var2 = MessageAccessoriesView.Companion.getWidth(var2, false, false);
      var3 = var2 * 9 / 16;
      val var5: MediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
      var4 = this.binding.itemHero;
      kotlin.jvm.internal.r.g(this.binding.itemHero, "binding.itemHero");
      var5.resizeLayoutParams(var4, var2, var3, var2, var3, MediaContainingViewResizer.ResizeMode.Fill);
   }
}
