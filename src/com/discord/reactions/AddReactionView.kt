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

@SuppressLint(["SetTextI18n"])
public class AddReactionView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout(var1, var2) {
   private final val binding: AddReactionViewBinding

   fun AddReactionView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var5: AddReactionViewBinding = AddReactionViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var5;
      this.setOrientation(0);
      this.setGravity(16);
      val var6: ReactionView.Companion = ReactionView.Companion;
      val var3: Int = ReactionView.Companion.getHORIZ_PADDING();
      val var4: Int = VERTICAL_PADDING;
      this.setPadding(var3, VERTICAL_PADDING, var6.getHORIZ_PADDING(), var4);
   }

   public fun configure(addReactionLabel: String, reactionsTheme: ReactionsTheme?, isBurst: Boolean, imageAsset: ReactAsset = ReactAsset.AddReaction) {
      var var8: ReactionView.Companion;
      var var10: TextView;
      var var15: Int;
      label34: {
         var15 = ThemeManagerKt.getTheme().getBackgroundSecondary();
         var8 = ReactionView.Companion;
         ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, var15, ReactionView.Companion.getCORNER_RADIUS(), null, 0, 12, null);
         var var9: TextView = this.binding.addReactionText;
         DiscordFontUtilsKt.setDiscordFont(var9, DiscordFont.PrimarySemibold);
         var9 = this.binding.addReactionText;
         SetTextSizeSpKt.setTextSizeSp(var9, 14.0F, 14.0F);
         this.binding.addReactionText.setPadding(var8.getHORIZ_PADDING(), 0, var8.getHORIZ_PADDING(), 0);
         var10 = this.binding.addReactionText;
         if (var2 != null) {
            val var20: Int = var2.getReactionTextColor();
            if (var20 != null) {
               var15 = var20;
               break label34;
            }
         }

         var15 = ThemeManagerKt.getTheme().getTextMuted();
      }

      var10.setTextColor(var15);
      this.binding.addReactionText.setText(var1);
      val var21: TextView = this.binding.addReactionText;
      var var16: Int = 0;
      if (var1.length() == 0) {
         var16 = 8;
      }

      var21.setVisibility(var16);
      val var11: SimpleDraweeView = this.binding.addReactionImage;
      if (var3) {
         var4 = ReactAsset.AddBurstReaction;
      }

      label26: {
         ReactAssetUtilsKt.setReactAsset(var11, var4);
         val var12: SimpleDraweeView = this.binding.addReactionImage;
         ColorUtilsKt.setTintColor(var12, ThemeManagerKt.getTheme().getInteractiveNormal());
         this.binding.addReactionImage.setScaleType(ScaleType.FIT_CENTER);
         if (var2 != null) {
            val var13: Int = var2.getReactionBackgroundColor();
            if (var13 != null) {
               var16 = var13;
               break label26;
            }
         }

         var16 = ThemeManagerKt.getTheme().getBackgroundSecondary();
      }

      val var14: Int;
      if (var2 != null) {
         var14 = var2.getReactionBorderColor();
      } else {
         var14 = null;
      }

      ViewBackgroundUtilsKt.setBackgroundRectangle(this, var16, var8.getCORNER_RADIUS(), var14, var8.getSTROKE_WIDTH());
   }

   public companion object {
      private final val VERTICAL_PADDING: Int
   }
}
