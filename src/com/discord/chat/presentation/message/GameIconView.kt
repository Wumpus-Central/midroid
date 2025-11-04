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

public class GameIconView(context: Context, attrs: AttributeSet) : FrameLayout(var1, var2) {
   private final val binding: GameIconViewBinding

   init {
      val var5: GameIconViewBinding = GameIconViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var5;
      val var3: SimpleDraweeView = var5.gameControllerIcon;
      ReactAssetUtilsKt.setReactAsset(var3, ReactAsset.GameController);
      val var4: SimpleDraweeView = var5.gameControllerIcon;
      ColorUtilsKt.setTintColor(var4, ThemeManagerKt.getTheme().getTextMuted());
   }

   @JvmStatic
   fun `configureGameIcon$lambda$0`(var0: ChatEventHandler, var1: java.lang.String, var2: java.lang.String, var3: View) {
      var0.onTapGameIcon(var1, var2);
   }

   public fun configureGameIcon(gameApplicationId: String, timestamp: String, eventHandler: ChatEventHandler) {
      val var4: SimpleDraweeView = this.binding.gameControllerIcon;
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var4, false, new com.discord.chat.presentation.message.e(var3, var1, var2), 1, null);
   }
}
