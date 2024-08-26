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
import com.discord.chat.bridge.sticker.StickerFormatType
import com.discord.chat.databinding.WelcomeStickerViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.primitives.MessageId
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import i3.a
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r

public class WelcomeStickerView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout {
   private final val binding: WelcomeStickerViewBinding

   fun WelcomeStickerView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
      val var3: WelcomeStickerViewBinding = WelcomeStickerViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var3, "inflate(LayoutInflater.from(context), this)");
      this.binding = var3;
      RippleUtilsKt.addRipple$default(this, true, 0, 2, null);
      this.setOrientation(0);
      this.setLayoutParams(new LayoutParams(-2, -2));
      this.setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8));
      val var4: TextView = var3.welcomeReplyText;
      r.g(var3.welcomeReplyText, "_init_$lambda$0");
      var4.setTextColor(ColorUtilsKt.getColorCompat(var4, color.white));
      SetTextSizeSpKt.setTextSizeSp(var4, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ThemeManagerKt.getTheme().getBackgroundAccent(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
   }

   private fun bindSticker(sticker: Sticker) {
      val var2: Int = WelcomeStickerView.WhenMappings.$EnumSwitchMapping$0[var1.getFormatType().ordinal()];
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 3) {
               if (var2 == 4) {
                  this.binding.stickerView.asGif(var1.getUrl(), 32, 32, true);
               }
            } else {
               this.binding.stickerView.asLottie(var1.getUrl(), 32, 32, true, var1.getAsset(), var1.getRenderMode());
            }
         } else {
            this.binding.stickerView.asApng(var1.getUrl(), 32, 32, true);
         }
      } else {
         this.binding.stickerView.asPng(var1.getUrl(), var1.getWidth(), var1.getHeight());
      }
   }

   @JvmStatic
   fun `setSticker$lambda$1`(var0: Function2, var1: Sticker, var2: Message, var3: View) {
      r.h(var0, "$onWelcomeReplyClicked");
      r.h(var1, "$sticker");
      r.h(var2, "$message");
      var0.invoke(var1, MessageId.box_impl(var2.getId_3Eiw7ao()));
   }

   public fun setSticker(sticker: Sticker, message: Message, onWelcomeReplyClicked: (Sticker, MessageId) -> Unit) {
      r.h(var1, "sticker");
      r.h(var2, "message");
      r.h(var3, "onWelcomeReplyClicked");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new a(var3, var1, var2), 1, null);
      this.binding.welcomeReplyText.setText(var2.getStickerLabel());
      this.bindSticker(var1);
   }

   // $VF: Class flags could not be determined
   internal class WhenMappings {
      @JvmStatic
      public int[] $EnumSwitchMapping$0;

      @JvmStatic
      fun {
         val var0: IntArray = new int[StickerFormatType.values().length];

         try {
            var0[StickerFormatType.PNG.ordinal()] = 1;
         } catch (var5: NoSuchFieldError) {
         }

         try {
            var0[StickerFormatType.APNG.ordinal()] = 2;
         } catch (var4: NoSuchFieldError) {
         }

         try {
            var0[StickerFormatType.LOTTIE.ordinal()] = 3;
         } catch (var3: NoSuchFieldError) {
         }

         try {
            var0[StickerFormatType.GIF.ordinal()] = 4;
         } catch (var2: NoSuchFieldError) {
         }

         $EnumSwitchMapping$0 = var0;
      }
   }
}
