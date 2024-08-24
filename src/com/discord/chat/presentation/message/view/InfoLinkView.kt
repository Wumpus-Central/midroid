package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.databinding.InfoLinkViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function0

public class InfoLinkView(context: Context, attrs: AttributeSet? = null) : FrameLayout {
   private final val binding: InfoLinkViewBinding

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      val var3: InfoLinkViewBinding = InfoLinkViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var3, "inflate(LayoutInflater.from(context), this)");
      this.binding = var3;
   }

   @JvmStatic
   fun `configure$lambda$0`(var0: Function0, var1: View) {
      kotlin.jvm.internal.r.h(var0, "$onInfoLinkClicked");
      var0.invoke();
   }

   public fun configure(text: String, icon: ReactAsset, onInfoLinkClicked: () -> Unit) {
      kotlin.jvm.internal.r.h(var1, "text");
      kotlin.jvm.internal.r.h(var2, "icon");
      kotlin.jvm.internal.r.h(var3, "onInfoLinkClicked");
      this.binding.description.setText(var1);
      this.binding.description.setContentDescription(var1);
      this.binding.description.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      val var4: TextView = this.binding.description;
      kotlin.jvm.internal.r.g(this.binding.description, "binding.description");
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
      val var5: SimpleDraweeView = this.binding.icon;
      kotlin.jvm.internal.r.g(this.binding.icon, "binding.icon");
      ReactAssetUtilsKt.setReactAsset(var5, var2);
      val var6: SimpleDraweeView = this.binding.icon;
      kotlin.jvm.internal.r.g(this.binding.icon, "binding.icon");
      ColorUtilsKt.setTintColor(var6, ThemeManagerKt.getTheme().getInteractiveNormal());
      val var7: ConstraintLayout = this.binding.infoLinkContainer;
      kotlin.jvm.internal.r.g(this.binding.infoLinkContainer, "binding.infoLinkContainer");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var7, false, new i0(var3), 1, null);
   }
}
