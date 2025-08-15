package com.discord.reactions

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.animation.AnticipateInterpolator
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
      val var8: AddReactionViewBinding = AddReactionViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var8;
      this.setOrientation(0);
      this.setGravity(16);
      val var5: ReactionView.Companion = ReactionView.Companion;
      val var4: Int = ReactionView.Companion.getHORIZ_PADDING();
      val var3: Int = VERTICAL_PADDING;
      this.setPadding(var4, VERTICAL_PADDING, var5.getHORIZ_PADDING(), var3);
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ThemeManagerKt.getTheme().getBackgroundSecondary(), var5.getCORNER_RADIUS(), null, 0, 12, null);
      val var6: TextView = var8.addReactionText;
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimarySemibold);
      SetTextSizeSpKt.setTextSizeSp(var6, 14.0F, 14.0F);
      var6.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      var6.setPadding(var5.getHORIZ_PADDING(), 0, var5.getHORIZ_PADDING(), 0);
      val var7: SimpleDraweeView = var8.addReactionImage;
      ReactAssetUtilsKt.setReactAsset(var7, ReactAsset.AddReaction);
      ColorUtilsKt.setTintColor(var7, ThemeManagerKt.getTheme().getInteractiveNormal());
      var7.setScaleType(ScaleType.FIT_CENTER);
   }

   public fun animateIn() {
      this.setAlpha(0.0F);
      this.setVisibility(0);
      this.animate().alpha(1.0F).setInterpolator(new AnticipateInterpolator(2.0F)).setDuration(300L).start();
   }

   public fun configure(addReactionLabel: String, reactionsTheme: ReactionsTheme?, isBurst: Boolean, imageAsset: ReactAsset = ReactAsset.AddReaction) {
      val var7: TextView = this.binding.addReactionText;
      this.binding.addReactionText.setText(var1);
      if (var1.length() == 0) {
         var7.setVisibility(8);
      } else {
         var7.setVisibility(0);
      }

      var var5: Int;
      label34: {
         if (var2 != null) {
            val var8: Int = var2.getReactionTextColor();
            if (var8 != null) {
               var5 = var8;
               break label34;
            }
         }

         var5 = ThemeManagerKt.getTheme().getTextMuted();
      }

      var7.setTextColor(var5);
      val var9: SimpleDraweeView = this.binding.addReactionImage;
      if (var3) {
         var4 = ReactAsset.AddBurstReaction;
      }

      label28: {
         ReactAssetUtilsKt.setReactAsset(var9, var4);
         if (var2 != null) {
            val var10: Int = var2.getReactionBackgroundColor();
            if (var10 != null) {
               var5 = var10;
               break label28;
            }
         }

         var5 = ThemeManagerKt.getTheme().getBackgroundSecondary();
      }

      val var11: Int;
      if (var2 != null) {
         var11 = var2.getReactionBorderColor();
      } else {
         var11 = null;
      }

      ViewBackgroundUtilsKt.setBackgroundRectangle(this, var5, ReactionView.Companion.getCORNER_RADIUS(), var11, ReactionView.Companion.getSTROKE_WIDTH());
   }

   public companion object {
      private final val VERTICAL_PADDING: Int
   }
}
