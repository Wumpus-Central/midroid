package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import com.discord.chat.databinding.AltTextButtonViewBinding
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import kotlin.jvm.functions.Function1

public class AltTextButtonView(context: Context, attrs: AttributeSet? = null) : FrameLayout {
   private final val binding: AltTextButtonViewBinding

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var4: AltTextButtonViewBinding = AltTextButtonViewBinding.inflate(LayoutInflater.from(var1), this, true);
      kotlin.jvm.internal.q.g(var4, "inflate(...)");
      this.binding = var4;
      val var3: FrameLayout = var4.altTextContainer;
      kotlin.jvm.internal.q.g(var4.altTextContainer, "altTextContainer");
      ViewClippingUtilsKt.clipToRoundedRectangle(var3, SizeUtilsKt.getDpToPx(8));
      var4.altTextLabel.setText(I18nUtilsKt.i18nFormat$default(var1, I18nMessage.MEDIA_MOSAIC_ALT_TEXT_CTA, null, 2, null));
      var4.altTextLabel.setContentDescription(I18nUtilsKt.i18nFormat$default(var1, I18nMessage.MEDIA_MOSAIC_ALT_TEXT_POPOUT_TITLE, null, 2, null));
   }

   @JvmStatic
   fun `configure$lambda$0`(var0: Function1, var1: java.lang.String, var2: View) {
      var0.invoke(var1);
   }

   public fun configure(description: String?, onClick: ((String) -> Unit)?) {
      if (var1 != null && var2 != null) {
         this.setVisibility(0);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new a(var2, var1), 1, null);
      } else {
         this.setVisibility(8);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, null, 1, null);
      }
   }
}
