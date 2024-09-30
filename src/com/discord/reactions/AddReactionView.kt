package com.discord.reactions

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.ImageView.ScaleType
import com.discord.SetTextSizeSpKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.reactions.ReactionView.ReactionsTheme
import com.discord.reactions.databinding.AddReactionViewBinding
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.q

@SuppressLint(["SetTextI18n"])
public class AddReactionView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout {
   private final val binding: AddReactionViewBinding

   fun AddReactionView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      val var8: AddReactionViewBinding = AddReactionViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var8, "inflate(...)");
      this.binding = var8;
      this.setOrientation(0);
      this.setGravity(16);
      val var5: ReactionView.Companion = ReactionView.Companion;
      val var3: Int = ReactionView.Companion.getHORIZ_PADDING();
      val var4: Int = VERTICAL_PADDING;
      this.setPadding(var3, VERTICAL_PADDING, var5.getHORIZ_PADDING(), var4);
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ThemeManagerKt.getTheme().getBackgroundSecondary(), var5.getCORNER_RADIUS(), null, 0, 12, null);
      val var6: TextView = var8.addReactionText;
      q.e(var8.addReactionText);
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimarySemibold);
      SetTextSizeSpKt.setTextSizeSp(var6, 14.0F, 14.0F);
      var6.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      var6.setPadding(var5.getHORIZ_PADDING(), 0, var5.getHORIZ_PADDING(), 0);
      val var7: SimpleDraweeView = var8.addReactionImage;
      q.e(var8.addReactionImage);
      ReactAssetUtilsKt.setReactAsset(var7, ReactAsset.AddReaction);
      ColorUtilsKt.setTintColor(var7, ThemeManagerKt.getTheme().getInteractiveNormal());
      var7.setScaleType(ScaleType.FIT_CENTER);
   }

   public fun configure(addReactionLabel: String, reactionsTheme: ReactionsTheme?, isBurst: Boolean) {
      q.h(var1, "addReactionLabel");
      val var6: TextView = this.binding.addReactionText;
      this.binding.addReactionText.setText(var1);
      if (var1.length() == 0) {
         var6.setVisibility(8);
      } else {
         var6.setVisibility(0);
      }

      var var4: Int;
      label35: {
         if (var2 != null) {
            val var7: Int = var2.getReactionTextColor();
            if (var7 != null) {
               var4 = var7;
               break label35;
            }
         }

         var4 = ThemeManagerKt.getTheme().getTextMuted();
      }

      var6.setTextColor(var4);
      val var13: SimpleDraweeView = this.binding.addReactionImage;
      val var8: ReactAsset;
      if (var3) {
         var8 = ReactAsset.AddBurstReaction;
      } else {
         var8 = ReactAsset.AddReaction;
      }

      label29: {
         q.e(this.binding.addReactionImage);
         ReactAssetUtilsKt.setReactAsset(var13, var8);
         if (var2 != null) {
            val var9: Int = var2.getReactionBackgroundColor();
            if (var9 != null) {
               var4 = var9;
               break label29;
            }
         }

         var4 = ThemeManagerKt.getTheme().getBackgroundSecondary();
      }

      val var10: Int;
      if (var2 != null) {
         var10 = var2.getReactionBorderColor();
      } else {
         var10 = null;
      }

      ViewBackgroundUtilsKt.setBackgroundRectangle(this, var4, ReactionView.Companion.getCORNER_RADIUS(), var10, ReactionView.Companion.getSTROKE_WIDTH());
   }

   public companion object {
      private final val VERTICAL_PADDING: Int
   }
}
