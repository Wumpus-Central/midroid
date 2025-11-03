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
import com.discord.chat.R.dimen
import com.discord.chat.databinding.ThreadStarterMessageHeaderViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nThreadStarterMessageHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadStarterMessageHeaderView.kt\ncom/discord/chat/presentation/message/ThreadStarterMessageHeaderView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,57:1\n257#2,2:58\n327#2,4:60\n*S KotlinDebug\n*F\n+ 1 ThreadStarterMessageHeaderView.kt\ncom/discord/chat/presentation/message/ThreadStarterMessageHeaderView\n*L\n43#1:58,2\n47#1:60,4\n*E\n"])
public class ThreadStarterMessageHeaderView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout(var1, var2) {
   private final val binding: ThreadStarterMessageHeaderViewBinding

   fun ThreadStarterMessageHeaderView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var3: ThreadStarterMessageHeaderViewBinding = ThreadStarterMessageHeaderViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var3;
      this.setOrientation(0);
      val var5: SimpleDraweeView = var3.threadStarterHeaderIcon;
      ReactAssetUtilsKt.setReactAsset(var5, ReactAsset.TextChannel);
      val var6: SimpleDraweeView = var3.threadStarterHeaderIcon;
      ColorUtilsKt.setTintColor(var6, ThemeManagerKt.getTheme().getInteractiveNormal());
      var3.threadStarterHeaderText.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      val var7: TextView = var3.threadStarterHeaderText;
      DiscordFontUtilsKt.setDiscordFont(var7, DiscordFont.PrimaryMedium);
      val var4: TextView = var3.threadStarterHeaderText;
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
   }

   public fun configure(headerText: String?, hasMessageReference: Boolean) {
      val var6: View = this.binding.getRoot();
      var var4: Boolean;
      if (var1 != null) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      if (var4) {
         var4 = (byte)0;
      } else {
         var4 = (byte)8;
      }

      var6.setVisibility(var4);
      this.binding.threadStarterHeaderText.setText(var1);
      val var3: Float = this.getResources().getDimension(dimen.message_start_guideline);
      val var7: View = this.binding.getRoot();
      val var10: LayoutParams = var7.getLayoutParams();
      if (var10 != null) {
         val var11: MarginLayoutParams = var10 as MarginLayoutParams;
         (var10 as MarginLayoutParams).setMarginStart((int)var3);
         var4 = 0;
         if (var2) {
            var4 = SizeUtilsKt.getDpToPx(4);
         }

         var11.bottomMargin = var4;
         var7.setLayoutParams(var11);
      } else {
         throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
      }
   }
}
