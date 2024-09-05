package com.discord.reactions

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextSwitcher
import android.widget.TextView
import com.discord.SetTextSizeSpKt
import com.discord.emoji.RenderableEmoji
import com.discord.emoji.RenderableEmojiKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.reactions.ReactionView.Reaction
import com.discord.reactions.databinding.ReactionViewBinding
import com.discord.theme.ThemeManager
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import kotlin.jvm.internal.q

public class BurstReactionView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout {
   private final val binding: ReactionViewBinding
   private final var currentCount: Int?
   private final var currentEmojiId: String?
   private final var currentShouldAnimate: Boolean?

   fun BurstReactionView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      val var4: ReactionViewBinding = ReactionViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var4, "inflate(...)");
      this.binding = var4;
      this.setOrientation(0);
      this.setGravity(16);
      val var5: ReactionView.Companion = ReactionView.Companion;
      this.setMinimumWidth(ReactionView.Companion.getMINIMUM_WIDTH());
      this.setPadding(var5.getHORIZ_PADDING(), 0, var5.getHORIZ_PADDING(), 0);
      var var3: TextView = var4.reactionCount1;
      q.g(var4.reactionCount1, "reactionCount1");
      val var6: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimarySemibold);
      var3 = var4.reactionCount1;
      q.g(var4.reactionCount1, "reactionCount1");
      SetTextSizeSpKt.setTextSizeSp(var3, 14.0F, 14.0F);
      var3 = var4.reactionCount2;
      q.g(var4.reactionCount2, "reactionCount2");
      DiscordFontUtilsKt.setDiscordFont(var3, var6);
      val var7: TextView = var4.reactionCount2;
      q.g(var4.reactionCount2, "reactionCount2");
      SetTextSizeSpKt.setTextSizeSp(var7, 14.0F, 14.0F);
      var4.reactionCountSwitcher.setMeasureAllChildren(false);
   }

   private fun configureBackground(isMe: Boolean, palette: com.discord.reactions.BurstReactionView.BurstColorPalette?) {
      var var3: Int = 255;
      if (var2 != null) {
         var3 = kk.a.b(var2.getOpacity() * (float)255);
      }

      var var13: Int;
      label41: {
         if (var2 != null) {
            val var5: java.lang.String = var2.getBackgroundColor();
            if (var5 != null) {
               var13 = androidx.core.graphics.c.k(Color.parseColor(var5), var3);
               break label41;
            }
         }

         var13 = null;
      }

      label36: {
         if (var2 != null) {
            val var7: java.lang.String = var2.getAccentColor();
            if (var7 != null) {
               var8 = Color.parseColor(var7);
               break label36;
            }
         }

         var8 = null;
      }

      if (var13 != null) {
         var3 = var13;
      } else if (var1) {
         val var14: Context = this.getContext();
         q.g(var14, "getContext(...)");
         var3 = ColorUtilsKt.getColorCompat(var14, com.discord.theme.R.color.brand_new_500_alpha_20);
      } else {
         var3 = ThemeManagerKt.getTheme().getBackgroundSecondary();
      }

      var13 = null;
      if (var1) {
         val var4: Int;
         if (var8 != null) {
            var4 = var8;
         } else {
            val var9: Context = this.getContext();
            q.g(var9, "getContext(...)");
            var4 = ColorUtilsKt.getColorCompat(var9, com.discord.theme.R.color.brand_560);
         }

         var13 = var4;
      }

      ViewBackgroundUtilsKt.setBackgroundRectangle(this, var3, ReactionView.Companion.getCORNER_RADIUS(), var13, ReactionView.Companion.getSTROKE_WIDTH());
   }

   private fun configureCount(count: Int, animate: Boolean) {
      val var5: TextSwitcher = this.binding.reactionCountSwitcher;
      if (var2) {
         val var3: Int;
         if (this.currentCount != null) {
            var3 = this.currentCount;
         } else {
            var3 = 0;
         }

         if (var1 > var3) {
            this.binding.reactionCountSwitcher.setInAnimation(this.binding.reactionCountSwitcher.getContext(), R.anim.anim_slide_in_up);
            var5.setOutAnimation(var5.getContext(), R.anim.anim_slide_out_up);
         } else {
            this.binding.reactionCountSwitcher.setInAnimation(this.binding.reactionCountSwitcher.getContext(), R.anim.anim_slide_in_down);
            var5.setOutAnimation(var5.getContext(), R.anim.anim_slide_out_down);
         }

         var5.setText(java.lang.String.valueOf(var1));
      } else {
         this.binding.reactionCountSwitcher.setCurrentText(java.lang.String.valueOf(var1));
      }

      this.currentCount = var1;
   }

   private fun configureTextColor(palette: com.discord.reactions.BurstReactionView.BurstColorPalette?) {
      var var2: Int;
      label12: {
         if (var1 != null) {
            val var3: java.lang.String = var1.getAccentColor();
            if (var3 != null) {
               var2 = Color.parseColor(var3);
               break label12;
            }
         }

         var2 = ThemeManagerKt.getTheme().getInteractiveNormal();
      }

      this.binding.reactionEmoji.setTextColor(var2);
      this.binding.reactionCount1.setTextColor(var2);
      this.binding.reactionCount2.setTextColor(var2);
   }

   public fun setReaction(reaction: Reaction) {
      q.h(var1, "reaction");
      this.binding.getRoot().setContentDescription(var1.getEmoji().getDisplayName());
      val var2: Boolean;
      if (q.c(this.currentEmojiId, var1.getEmoji().getEmojiId()) && q.c(this.currentShouldAnimate, var1.getEmoji().getShouldAnimate())) {
         var2 = true;
      } else {
         var2 = false;
      }

      val var4: Int = var1.getBurstCount();
      var var10: Boolean = false;
      if (var2) {
         var10 = false;
         label32:
         if (this.currentCount != null) {
            val var3: Int = var1.getBurstCount();
            if (this.currentCount != null) {
               var10 = false;
               if (var3 == this.currentCount) {
                  break label32;
               }
            }

            var10 = true;
         }
      }

      this.configureCount(var4, var10);
      var10 = ThemeManager.INSTANCE.isThemeDark();
      var var12: BurstReactionView.BurstColorPalette = null;
      if (var10) {
         val var8: BurstReactionView.ThemedBurstColorPalette = var1.getThemedBurstColors();
         if (var8 != null) {
            var12 = var8.getDark();
         }
      } else {
         val var14: BurstReactionView.ThemedBurstColorPalette = var1.getThemedBurstColors();
         if (var14 != null) {
            var12 = var14.getLight();
         }
      }

      this.configureBackground(var1.isMeBurst(), var12);
      this.configureTextColor(var12);
      this.currentShouldAnimate = var1.getEmoji().getShouldAnimate();
      if (!var2) {
         val var9: SimpleDraweeSpanTextView = this.binding.reactionEmoji;
         val var13: RenderableEmoji = var1.getEmoji().renderable();
         val var15: Context = this.getContext();
         q.g(var15, "getContext(...)");
         var9.setDraweeSpanStringBuilder(
            RenderableEmojiKt.renderEmoji$default(var13, var15, ReactionView.Companion.getEMOJI_SIZE(), var1.getEmoji().getShouldAnimate(), 0, null, 48, null)
         );
         this.currentEmojiId = var1.getEmoji().getEmojiId();
      }
   }

   public interface BurstColorPalette {
      public val accentColor: String?
      public val backgroundColor: String?
      public val highlightColor: String?
      public val opacity: Float
   }

   public interface ThemedBurstColorPalette {
      public val dark: com.discord.reactions.BurstReactionView.BurstColorPalette
      public val light: com.discord.reactions.BurstReactionView.BurstColorPalette
   }
}
