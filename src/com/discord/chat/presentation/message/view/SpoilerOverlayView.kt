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

public class SpoilerOverlayView  public constructor(context: Context, attributeSet: AttributeSet? = null) : FrameLayout, SpoilerViewOverlay {
   private final val binding: SpoilerOverlayViewBinding

   fun SpoilerOverlayView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var4: SpoilerOverlayViewBinding = SpoilerOverlayViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var4, "inflate(...)");
      this.binding = var4;
      val var3: TextView = var4.label;
      kotlin.jvm.internal.q.e(var4.label);
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryBold);
      var3.setBackgroundColor(ColorUtilsKt.getColorCompat(var1, R.color.primary_800));
      ViewClippingUtilsKt.clipToCircle(var3);
      var4.overlayContainer.setBackgroundColor(ThemeManagerKt.getTheme().getSpoilerHiddenBackground());
   }

   @JvmStatic
   fun `configure$lambda$1`(var0: Function0, var1: View) {
      kotlin.jvm.internal.q.h(var0, "$onReveal");
      var0.invoke();
   }

   public fun configure(label: String, onReveal: () -> Unit) {
      kotlin.jvm.internal.q.h(var1, "label");
      kotlin.jvm.internal.q.h(var2, "onReveal");
      this.binding.label.setText(var1);
      val var3: FrameLayout = this.binding.overlayContainer;
      kotlin.jvm.internal.q.g(this.binding.overlayContainer, "overlayContainer");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var3, false, new r0(var2), 1, null);
   }

   public override fun getOverlayView(): View {
      val var1: FrameLayout = this.binding.overlayContainer;
      kotlin.jvm.internal.q.g(this.binding.overlayContainer, "overlayContainer");
      return var1;
   }
}
