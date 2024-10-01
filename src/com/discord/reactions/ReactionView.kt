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
import com.discord.misc.utilities.ids.IdUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.reactions.databinding.ReactionViewBinding
import com.discord.recycler_view.utils.ItemDiffableType
import com.discord.theme.ThemeManager
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import kotlin.jvm.internal.q

public class ReactionView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout {
   private final val binding: ReactionViewBinding
   private final var currentCount: Int?
   private final var currentEmojiId: String?
   private final var currentShouldAnimate: Boolean?

   fun ReactionView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      val var6: ReactionViewBinding = ReactionViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var6, "inflate(...)");
      this.binding = var6;
      this.setOrientation(0);
      this.setGravity(16);
      this.setMinimumWidth(MINIMUM_WIDTH);
      this.setPadding(HORIZ_PADDING, VERT_PADDING, HORIZ_PADDING, VERT_PADDING);
      var var5: TextView = var6.reactionCount1;
      q.g(var6.reactionCount1, "reactionCount1");
      val var7: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimarySemibold);
      var5 = var6.reactionCount1;
      q.g(var6.reactionCount1, "reactionCount1");
      SetTextSizeSpKt.setTextSizeSp(var5, 14.0F, 14.0F);
      var5 = var6.reactionCount2;
      q.g(var6.reactionCount2, "reactionCount2");
      DiscordFontUtilsKt.setDiscordFont(var5, var7);
      val var8: TextView = var6.reactionCount2;
      q.g(var6.reactionCount2, "reactionCount2");
      SetTextSizeSpKt.setTextSizeSp(var8, 14.0F, 14.0F);
      var6.reactionCountSwitcher.setMeasureAllChildren(false);
   }

   private fun configureBackground(isMe: Boolean, palette: com.discord.reactions.ReactionView.BurstColorPalette?) {
      var var3: Int = 255;
      if (var2 != null) {
         var3 = zh.a.b(var2.getOpacity() * (float)255);
      }

      var var12: Int;
      label41: {
         if (var2 != null) {
            val var5: java.lang.String = var2.getBackgroundColor();
            if (var5 != null) {
               var12 = androidx.core.graphics.c.k(Color.parseColor(var5), var3);
               break label41;
            }
         }

         var12 = null;
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

      if (var12 != null) {
         var3 = var12;
      } else if (var1) {
         val var13: Context = this.getContext();
         q.g(var13, "getContext(...)");
         var3 = ColorUtilsKt.getColorCompat(var13, com.discord.theme.R.color.brand_new_500_alpha_20);
      } else {
         var3 = ThemeManagerKt.getTheme().getBackgroundSecondary();
      }

      var12 = null;
      if (var1) {
         val var4: Int;
         if (var8 != null) {
            var4 = var8;
         } else {
            val var9: Context = this.getContext();
            q.g(var9, "getContext(...)");
            var4 = ColorUtilsKt.getColorCompat(var9, com.discord.theme.R.color.brand_560);
         }

         var12 = var4;
      }

      ViewBackgroundUtilsKt.setBackgroundRectangle(this, var3, CORNER_RADIUS, var12, STROKE_WIDTH);
   }

   private fun configureBackground(isMe: Boolean, reactionsTheme: com.discord.reactions.ReactionView.ReactionsTheme?) {
      if (var1) {
         var var3: Int;
         label38: {
            if (var2 != null) {
               val var6: Int = var2.getActiveReactionBackgroundColor();
               if (var6 != null) {
                  var3 = var6;
                  break label38;
               }
            }

            val var12: Context = this.getContext();
            q.g(var12, "getContext(...)");
            var3 = ColorUtilsKt.getColorCompat(var12, com.discord.theme.R.color.brand_new_500_alpha_20);
         }

         var var4: Int;
         var var5: Int;
         label33: {
            var5 = CORNER_RADIUS;
            if (var2 != null) {
               val var7: Int = var2.getActiveReactionBorderColor();
               if (var7 != null) {
                  var4 = var7;
                  break label33;
               }
            }

            val var8: Context = this.getContext();
            q.g(var8, "getContext(...)");
            var4 = ColorUtilsKt.getColorCompat(var8, com.discord.theme.R.color.brand_560);
         }

         ViewBackgroundUtilsKt.setBackgroundRectangle(this, var3, var5, var4, STROKE_WIDTH);
      } else {
         var var10: Int;
         label28: {
            if (var2 != null) {
               val var13: Int = var2.getReactionBackgroundColor();
               if (var13 != null) {
                  var10 = var13;
                  break label28;
               }
            }

            var10 = ThemeManagerKt.getTheme().getBackgroundSecondary();
         }

         val var9: Int;
         if (var2 != null) {
            var9 = var2.getReactionBorderColor();
         } else {
            var9 = null;
         }

         ViewBackgroundUtilsKt.setBackgroundRectangle(this, var10, CORNER_RADIUS, var9, STROKE_WIDTH);
      }
   }

   private fun configureCount(count: Int, animate: Boolean) {
      val var4: TextSwitcher = this.binding.reactionCountSwitcher;
      if (var2) {
         val var3: Int;
         if (this.currentCount != null) {
            var3 = this.currentCount;
         } else {
            var3 = 0;
         }

         if (var1 > var3) {
            this.binding.reactionCountSwitcher.setInAnimation(this.binding.reactionCountSwitcher.getContext(), R.anim.anim_slide_in_up);
            var4.setOutAnimation(var4.getContext(), R.anim.anim_slide_out_up);
         } else {
            this.binding.reactionCountSwitcher.setInAnimation(this.binding.reactionCountSwitcher.getContext(), R.anim.anim_slide_in_down);
            var4.setOutAnimation(var4.getContext(), R.anim.anim_slide_out_down);
         }

         var4.setText(java.lang.String.valueOf(var1));
      } else {
         this.binding.reactionCountSwitcher.setCurrentText(java.lang.String.valueOf(var1));
      }

      this.currentCount = var1;
   }

   private fun configureTextColor(color: Int) {
      this.binding.reactionEmoji.setTextColor(var1);
      this.binding.reactionCount1.setTextColor(var1);
      this.binding.reactionCount2.setTextColor(var1);
   }

   private fun configureTextColor(palette: com.discord.reactions.ReactionView.BurstColorPalette?) {
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

      this.configureTextColor(var2);
   }

   private fun configureTextColor(isMe: Boolean, reactionsTheme: com.discord.reactions.ReactionView.ReactionsTheme?) {
      var var3: Int;
      label22:
      if (var1) {
         if (var2 != null) {
            val var4: Int = var2.getActiveReactionTextColor();
            if (var4 != null) {
               var3 = var4;
               break label22;
            }
         }

         var3 = ThemeManagerKt.getTheme().getInteractiveActive();
      } else {
         label17: {
            if (var2 != null) {
               val var5: Int = var2.getReactionTextColor();
               if (var5 != null) {
                  var3 = var5;
                  break label17;
               }
            }

            var3 = ThemeManagerKt.getTheme().getInteractiveNormal();
         }
      }

      this.configureTextColor(var3);
   }

   public fun setReaction(reaction: com.discord.reactions.ReactionView.Reaction, reactionsTheme: com.discord.reactions.ReactionView.ReactionsTheme?) {
      q.h(var1, "reaction");
      this.binding.getRoot().setContentDescription(var1.getEmoji().getDisplayName());
      val var3: Boolean;
      if (q.c(this.currentEmojiId, var1.getEmoji().getEmojiId()) && q.c(this.currentShouldAnimate, var1.getEmoji().getShouldAnimate())) {
         var3 = true;
      } else {
         var3 = false;
      }

      val var4: Int;
      if (var1.isBurstReaction()) {
         var4 = var1.getBurstCount();
      } else {
         var4 = var1.getCount();
      }

      var var12: Boolean = false;
      if (var3) {
         var12 = false;
         label41:
         if (this.currentCount != null) {
            val var5: Int = var1.getCount();
            if (this.currentCount != null) {
               var12 = false;
               if (var5 == this.currentCount) {
                  break label41;
               }
            }

            var12 = true;
         }
      }

      this.configureCount(var4, var12);
      this.configureBackground(var1.isMe(), var2);
      this.configureTextColor(var1.isMe(), var2);
      if (var1.isBurstReaction()) {
         var12 = ThemeManager.INSTANCE.isThemeDark();
         var var10: ReactionView.BurstColorPalette = null;
         if (var12) {
            val var14: ReactionView.ThemedBurstColorPalette = var1.getThemedBurstColors();
            if (var14 != null) {
               var10 = var14.getDark();
            }
         } else {
            val var15: ReactionView.ThemedBurstColorPalette = var1.getThemedBurstColors();
            if (var15 != null) {
               var10 = var15.getLight();
            }
         }

         this.configureBackground(var1.isMeBurst(), var10);
         this.configureTextColor(var10);
      } else {
         this.configureBackground(var1.isMe(), var2);
         this.configureTextColor(var1.isMe(), var2);
      }

      this.currentShouldAnimate = var1.getEmoji().getShouldAnimate();
      if (!var3) {
         val var16: SimpleDraweeSpanTextView = this.binding.reactionEmoji;
         val var9: RenderableEmoji = var1.getEmoji().renderable();
         val var11: Context = this.getContext();
         q.g(var11, "getContext(...)");
         var16.setDraweeSpanStringBuilder(RenderableEmojiKt.renderEmoji$default(var9, var11, EMOJI_SIZE, var1.getEmoji().getShouldAnimate(), 0, null, 48, null));
         this.currentEmojiId = var1.getEmoji().getEmojiId();
      }
   }

   public interface BurstColorPalette {
      public val accentColor: String?
      public val backgroundColor: String?
      public val highlightColor: String?
      public val opacity: Float
   }

   public companion object {
      public final val CORNER_RADIUS: Int
      public final val EMOJI_SIZE: Int
      public final val HORIZ_PADDING: Int
      public final val MINIMUM_WIDTH: Int
      public final val STROKE_WIDTH: Int
      public final val VERT_PADDING: Int
   }

   public interface Emoji {
      public val animated: Boolean?
      public val displayName: String

      public open val emojiId: String?
         public open get() {
         }


      public val id: String?
      public val name: String?

      public open val shouldAnimate: Boolean
         public open get() {
         }


      public val src: String

      public open fun renderable(): RenderableEmoji {
      }

      // $VF: Class flags could not be determined
      internal class DefaultImpls {
         @JvmStatic
         fun getEmojiId(var0: ReactionView.Emoji): java.lang.String {
            val var2: java.lang.String = var0.getId();
            var var1: java.lang.String = var2;
            if (var2 == null) {
               var1 = var0.getName();
            }

            return var1;
         }

         @JvmStatic
         fun getShouldAnimate(var0: ReactionView.Emoji): Boolean {
            val var2: java.lang.Boolean = var0.getAnimated();
            val var1: Boolean;
            if (var2 != null) {
               var1 = var2;
            } else {
               var1 = false;
            }

            return var1;
         }

         @JvmStatic
         fun renderable(var0: ReactionView.Emoji): RenderableEmoji {
            var var3: java.lang.String = var0.getId();
            if (var3 != null) {
               val var7: java.lang.Long = h.o(var3);
               if (var7 != null) {
                  val var8: RenderableEmoji.CustomWithEmojiId = RenderableEmoji.Companion
                     .customWithEmojiId(var7.longValue(), var0.getShouldAnimate(), var0.getDisplayName());
                  if (var8 != null) {
                     return var8;
                  }
               }
            }

            val var4: RenderableEmoji.Companion = RenderableEmoji.Companion;
            var3 = var0.getName();
            var var5: java.lang.String = var3;
            if (var3 == null) {
               var5 = "";
            }

            return var4.unicode(var5);
         }
      }
   }

   public interface Reaction : ItemDiffableType {
      public val burstCount: Int
      public val count: Int
      public val emoji: com.discord.reactions.ReactionView.Emoji
      public val isMe: Boolean
      public val isMeBurst: Boolean

      public open val itemId: Long
         public open get() {
         }


      public val themedBurstColors: com.discord.reactions.ReactionView.ThemedBurstColorPalette?

      public open fun isBurstReaction(): Boolean {
      }

      // $VF: Class flags could not be determined
      internal class DefaultImpls {
         @JvmStatic
         fun getItemId(var0: ReactionView.Reaction): java.lang.Long {
            val var2: java.lang.String = var0.getEmoji().getEmojiId();
            val var1: Boolean = var0.isBurstReaction();
            val var3: StringBuilder = new StringBuilder();
            var3.append(var2);
            var3.append("_");
            var3.append(var1);
            return IdUtilsKt.convertToId(var3.toString());
         }

         @JvmStatic
         fun isBurstReaction(var0: ReactionView.Reaction): Boolean {
            val var1: Boolean;
            if (var0.getBurstCount() > 0) {
               var1 = true;
            } else {
               var1 = false;
            }

            return var1;
         }
      }
   }

   public interface ReactionsTheme {
      public val activeReactionBackgroundColor: Int?
      public val activeReactionBorderColor: Int?
      public val activeReactionTextColor: Int?
      public val reactionBackgroundColor: Int?
      public val reactionBorderColor: Int?
      public val reactionTextColor: Int?
   }

   public interface ThemedBurstColorPalette {
      public val dark: com.discord.reactions.ReactionView.BurstColorPalette
      public val light: com.discord.reactions.ReactionView.BurstColorPalette
   }
}
