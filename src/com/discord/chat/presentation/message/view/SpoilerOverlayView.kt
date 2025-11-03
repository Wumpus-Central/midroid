package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import com.discord.chat.databinding.SpoilerOverlayViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import kotlin.jvm.functions.Function0

public class SpoilerOverlayView  public constructor(context: Context, attributeSet: AttributeSet? = null) : FrameLayout(var1, var2), SpoilerViewOverlay {
   private final val binding: SpoilerOverlayViewBinding

   fun SpoilerOverlayView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var3: SpoilerOverlayViewBinding = SpoilerOverlayViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var3;
      val var4: TextView = var3.label;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryBold);
      var4.setBackgroundColor(ColorUtilsKt.getColorCompat(var1, R.color.primary_800));
      ViewClippingUtilsKt.clipToCircle(var4);
      var3.overlayContainer.setBackgroundColor(ThemeManagerKt.getTheme().getSpoilerHiddenBackground());
   }

   @JvmStatic
   fun `configure$lambda$1`(var0: Function0, var1: View) {
      var0.invoke();
   }

   public fun configure(label: String, description: String, onReveal: () -> Unit) {
      this.binding.label.setText(var1);
      this.binding.label.setContentDescription(var2);
      val var4: FrameLayout = this.binding.overlayContainer;
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var4, false, new n2(var3), 1, null);
   }

   public override fun getOverlayView(): View {
      val var1: FrameLayout = this.binding.overlayContainer;
      return var1;
   }
}
