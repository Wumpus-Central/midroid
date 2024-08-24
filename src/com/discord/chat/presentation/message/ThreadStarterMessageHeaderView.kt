package com.discord.chat.presentation.message

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup.LayoutParams
import android.view.ViewGroup.MarginLayoutParams
import android.widget.LinearLayout
import android.widget.TextView
import com.discord.SetTextSizeSpKt
import com.discord.chat.databinding.ThreadStarterMessageHeaderViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView

public class ThreadStarterMessageHeaderView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout {
   private final val binding: ThreadStarterMessageHeaderViewBinding

   fun ThreadStarterMessageHeaderView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      val var3: ThreadStarterMessageHeaderViewBinding = ThreadStarterMessageHeaderViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var3, "inflate(\n        LayoutI…ext),\n        this,\n    )");
      this.binding = var3;
      this.setOrientation(0);
      val var5: SimpleDraweeView = var3.threadStarterHeaderIcon;
      kotlin.jvm.internal.r.g(var3.threadStarterHeaderIcon, "binding.threadStarterHeaderIcon");
      ReactAssetUtilsKt.setReactAsset(var5, ReactAsset.TextChannel);
      val var6: SimpleDraweeView = var3.threadStarterHeaderIcon;
      kotlin.jvm.internal.r.g(var3.threadStarterHeaderIcon, "binding.threadStarterHeaderIcon");
      ColorUtilsKt.setTintColor(var6, ThemeManagerKt.getTheme().getInteractiveNormal());
      var3.threadStarterHeaderText.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      val var7: TextView = var3.threadStarterHeaderText;
      kotlin.jvm.internal.r.g(var3.threadStarterHeaderText, "binding.threadStarterHeaderText");
      DiscordFontUtilsKt.setDiscordFont(var7, DiscordFont.PrimaryMedium);
      val var4: TextView = var3.threadStarterHeaderText;
      kotlin.jvm.internal.r.g(var3.threadStarterHeaderText, "binding.threadStarterHeaderText");
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
   }

   public fun configure(headerText: String?, hasMessageReference: Boolean) {
      val var5: View = this.binding.getRoot();
      kotlin.jvm.internal.r.g(var5, "binding.root");
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

      var5.setVisibility(var3);
      this.binding.threadStarterHeaderText.setText(var1);
      val var6: View = this.binding.getRoot();
      kotlin.jvm.internal.r.g(var6, "binding.root");
      val var9: LayoutParams = var6.getLayoutParams();
      if (var9 != null) {
         val var10: MarginLayoutParams = var9 as MarginLayoutParams;
         var3 = 0;
         if (var2) {
            var3 = SizeUtilsKt.getDpToPx(4);
         }

         var10.bottomMargin = var3;
         var6.setLayoutParams(var10);
      } else {
         throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
      }
   }
}
