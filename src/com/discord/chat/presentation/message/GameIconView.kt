package com.discord.chat.presentation.message

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import com.discord.chat.databinding.GameIconViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView

public class GameIconView(context: Context, attrs: AttributeSet) : FrameLayout {
   private final val binding: GameIconViewBinding

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      kotlin.jvm.internal.q.h(var2, "attrs");
      super(var1, var2);
      val var5: GameIconViewBinding = GameIconViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var5, "inflate(...)");
      this.binding = var5;
      val var3: SimpleDraweeView = var5.gameControllerIcon;
      kotlin.jvm.internal.q.g(var5.gameControllerIcon, "gameControllerIcon");
      ReactAssetUtilsKt.setReactAsset(var3, ReactAsset.GameController);
      val var4: SimpleDraweeView = var5.gameControllerIcon;
      kotlin.jvm.internal.q.g(var5.gameControllerIcon, "gameControllerIcon");
      ColorUtilsKt.setTintColor(var4, ThemeManagerKt.getTheme().getTextMuted());
   }

   @JvmStatic
   fun `configureGameIcon$lambda$0`(var0: ChatEventHandler, var1: java.lang.String, var2: java.lang.String, var3: View) {
      kotlin.jvm.internal.q.h(var0, "$eventHandler");
      kotlin.jvm.internal.q.h(var1, "$gameApplicationId");
      kotlin.jvm.internal.q.h(var2, "$timestamp");
      var0.onTapGameIcon(var1, var2);
   }

   public fun configureGameIcon(gameApplicationId: String, timestamp: String, eventHandler: ChatEventHandler) {
      kotlin.jvm.internal.q.h(var1, "gameApplicationId");
      kotlin.jvm.internal.q.h(var2, "timestamp");
      kotlin.jvm.internal.q.h(var3, "eventHandler");
      val var4: SimpleDraweeView = this.binding.gameControllerIcon;
      kotlin.jvm.internal.q.g(this.binding.gameControllerIcon, "gameControllerIcon");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var4, false, new c(var3, var1, var2), 1, null);
   }
}
