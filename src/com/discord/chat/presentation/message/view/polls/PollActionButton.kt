package com.discord.chat.presentation.message.view.polls

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import com.discord.chat.bridge.polls.PollAction
import com.discord.chat.bridge.polls.PollActionPresentation
import com.discord.chat.databinding.PollActionButtonBinding
import com.discord.chat.presentation.message.view.polls.a11y.PollsActionAccessibilityDelegate
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nPollActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollActionButton.kt\ncom/discord/chat/presentation/message/view/polls/PollActionButton\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,134:1\n257#2,2:135\n257#2,2:137\n257#2,2:139\n257#2,2:141\n257#2,2:143\n257#2,2:145\n257#2,2:147\n*S KotlinDebug\n*F\n+ 1 PollActionButton.kt\ncom/discord/chat/presentation/message/view/polls/PollActionButton\n*L\n34#1:135,2\n41#1:137,2\n43#1:139,2\n62#1:141,2\n82#1:143,2\n99#1:145,2\n121#1:147,2\n*E\n"])
public class PollActionButton  public constructor(context: Context, attrs: AttributeSet? = null) : FrameLayout(var1, var2) {
   private final val binding: PollActionButtonBinding

   fun PollActionButton(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var3: PollActionButtonBinding = PollActionButtonBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var3;
   }

   @JvmStatic
   fun `bind_urJ__Hs$lambda$1$lambda$0`(var0: PollAction, var1: Function3, var2: Long, var4: java.lang.String, var5: View) {
      if (var0.getType() != null) {
         var1.invoke(ChannelId.box-impl(var2), MessageId.box-impl(var4), var0.getType());
      }
   }

   @JvmStatic
   fun `bind_urJ__Hs$lambda$3$lambda$2`(var0: PollAction, var1: Function3, var2: Long, var4: java.lang.String, var5: View) {
      if (var0.getType() != null) {
         var1.invoke(ChannelId.box-impl(var2), MessageId.box-impl(var4), var0.getType());
      }
   }

   @JvmStatic
   fun `bind_urJ__Hs$lambda$5$lambda$4`(var0: PollAction, var1: Function3, var2: Long, var4: java.lang.String, var5: View) {
      if (var0.getType() != null) {
         var1.invoke(ChannelId.box-impl(var2), MessageId.box-impl(var4), var0.getType());
      }
   }

   @JvmStatic
   fun `bind_urJ__Hs$lambda$7$lambda$6`(var0: PollAction, var1: Function3, var2: Long, var4: java.lang.String, var5: View) {
      if (var0.getType() != null) {
         var1.invoke(ChannelId.box-impl(var2), MessageId.box-impl(var4), var0.getType());
      }
   }

   public fun bind(action: PollAction?, channelId: ChannelId, messageId: MessageId, onTapPollAction: (ChannelId, MessageId, String) -> Unit) {
      val var9: View = this.binding.getRoot();
      var var8: Boolean = true;
      var var7: Boolean;
      if (var1 != null) {
         var7 = 1;
      } else {
         var7 = 0;
      }

      if (var7) {
         var7 = (byte)0;
      } else {
         var7 = (byte)8;
      }

      var9.setVisibility(var7);
      if (var1 != null) {
         var7 = PollActionButton.WhenMappings.$EnumSwitchMapping$0[var1.getPresentation().ordinal()];
         val var11: Any;
         if (var7 != 1) {
            if (var7 != 2) {
               if (var7 != 3) {
                  if (var7 != 4) {
                     throw new B9.n();
                  }

                  val var18: TextView = this.binding.actionText;
                  var18.setVisibility(8);
                  val var19: DCDButton = this.binding.actionButton;
                  DCDButton.setBackgroundRectangle$default(
                     this.binding.actionButton, ThemeManagerKt.getTheme().getRedesignButtonTertiaryBackground(), SizeUtilsKt.getDpToPx(20), null, 0, 12, null
                  );
                  var19.setTextColor(ThemeManagerKt.getTheme().getRedesignButtonTertiaryText());
                  var19.setText(var1.getLabel());
                  var19.setOnClickButtonListener(new f(var1, var5, var2, var4));
                  var11 = var19;
               } else {
                  val var20: TextView = this.binding.actionText;
                  var20.setVisibility(8);
                  val var21: DCDButton = this.binding.actionButton;
                  DCDButton.setBackgroundRectangle$default(
                     this.binding.actionButton, ThemeManagerKt.getTheme().getRedesignButtonPrimaryBackground(), SizeUtilsKt.getDpToPx(20), null, 0, 12, null
                  );
                  var21.setTextColor(ColorUtilsKt.getColorCompat(var21, R.color.white));
                  var21.setText(var1.getLabel());
                  var21.setOnClickButtonListener(new e(var1, var5, var2, var4));
                  var11 = var21;
               }
            } else {
               val var22: DCDButton = this.binding.actionButton;
               var22.setVisibility(8);
               val var23: TextView = this.binding.actionText;
               this.binding.actionText.setTextColor(ThemeManagerKt.getTheme().getTextBrand());
               DiscordFontUtilsKt.setDiscordFont(var23, DiscordFont.PrimarySemibold);
               var23.setText(var1.getLabel());
               var23.setClickable(true);
               var23.setOnClickListener(new d(var1, var5, var2, var4));
               var var12: PollsActionAccessibilityDelegate = null;
               if (var1.getType() != null) {
                  var12 = new PollsActionAccessibilityDelegate(var1);
               }

               var23.setAccessibilityDelegate(var12);
               var11 = var23;
            }
         } else {
            val var24: DCDButton = this.binding.actionButton;
            var24.setVisibility(8);
            val var25: TextView = this.binding.actionText;
            var25.setVisibility(0);
            var25.setTextColor(ThemeManagerKt.getTheme().getTextSecondary());
            DiscordFontUtilsKt.setDiscordFont(var25, DiscordFont.PrimaryMedium);
            var25.setText(var1.getFullTextLabel());
            if (var1.getType() == null) {
               var8 = false;
            }

            var25.setClickable(var8);
            var25.setOnClickListener(new c(var1, var5, var2, var4));
            var var13: PollsActionAccessibilityDelegate = null;
            if (var1.getType() != null) {
               var13 = new PollsActionAccessibilityDelegate(var1);
            }

            var25.setAccessibilityDelegate(var13);
            var11 = var25;
         }

         var11.setEnabled(var1.getEnabled());
         if (!var1.getEnabled()) {
            var11.setPressed(false);
         }

         var11.setVisibility(0);
         val var6: Float;
         if (!var1.getEnabled() && var1.getPresentation() != PollActionPresentation.TEXT) {
            var6 = 0.5F;
         } else {
            var6 = 1.0F;
         }

         var11.setAlpha(var6);
      }
   }

   public fun hasAccessibilityFocus(): Boolean {
      val var1: Boolean;
      if (!this.binding.actionButton.isAccessibilityFocused() && !this.binding.actionText.isAccessibilityFocused()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }
}
