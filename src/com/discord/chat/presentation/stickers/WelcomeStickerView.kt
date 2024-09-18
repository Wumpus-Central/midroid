package com.discord.chat.presentation.stickers

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.LinearLayout.LayoutParams
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.sticker.Sticker
import com.discord.chat.databinding.WelcomeStickerViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.primitives.MessageId
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import q3.a

public class WelcomeStickerView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout {
   private final val binding: WelcomeStickerViewBinding

   fun WelcomeStickerView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      val var3: WelcomeStickerViewBinding = WelcomeStickerViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var3, "inflate(...)");
      this.binding = var3;
      RippleUtilsKt.addRipple$default(this, true, 0, 2, null);
      this.setOrientation(0);
      this.setLayoutParams(new LayoutParams(-2, -2));
      this.setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8));
      val var4: TextView = var3.welcomeReplyText;
      q.e(var3.welcomeReplyText);
      var4.setTextColor(ColorUtilsKt.getColorCompat(var4, R.color.white));
      SetTextSizeSpKt.setTextSizeSp(var4, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ThemeManagerKt.getTheme().getBackgroundAccent(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
   }

   private fun bindSticker(sticker: Sticker) {
      val var4: Int = 32;
      val var2: Int = WelcomeStickerView.WhenMappings.$EnumSwitchMapping$0[var1.getFormatType().ordinal()];
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 3) {
               if (var2 == 4) {
                  this.binding.stickerView.asGif(var1.getUrl(), var4, var4, true);
               }
            } else {
               this.binding.stickerView.asLottie(var1.getUrl(), 32, 32, true, var1.getAsset(), var1.getRenderMode());
            }
         } else {
            this.binding.stickerView.asApng(var1.getUrl(), var4, var4, true);
         }
      } else {
         this.binding.stickerView.asPng(var1.getUrl(), var1.getWidth(), var1.getHeight());
      }
   }

   @JvmStatic
   fun `setSticker$lambda$1`(var0: Function2, var1: Sticker, var2: Message, var3: View) {
      q.h(var0, "$onWelcomeReplyClicked");
      q.h(var1, "$sticker");
      q.h(var2, "$message");
      var0.invoke(var1, MessageId.box-impl(var2.getId-3Eiw7ao()));
   }

   public fun setSticker(sticker: Sticker, message: Message, onWelcomeReplyClicked: (Sticker, MessageId) -> Unit) {
      q.h(var1, "sticker");
      q.h(var2, "message");
      q.h(var3, "onWelcomeReplyClicked");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new a(var3, var1, var2), 1, null);
      this.binding.welcomeReplyText.setText(var2.getStickerLabel());
      this.bindSticker(var1);
   }
}
