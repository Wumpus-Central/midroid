package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.sticker.Sticker
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.sticker.StickerView
import kotlin.jvm.functions.Function1

public class StickerApngViewHolder(stickerView: StickerView) : StickerPartViewHolder(var1) {
   private final val stickerView: StickerView

   init {
      this.stickerView = var1;
   }

   @JvmStatic
   fun `bind$lambda$0`(var0: Function1, var1: Sticker, var2: View) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `bind$lambda$1`(var0: Function1, var1: Sticker, var2: View): Boolean {
      var0.invoke(var1);
      return true;
   }

   public override fun bind(sticker: Sticker, onStickerClicked: (Sticker) -> Unit, onStickerLongClicked: (Sticker) -> Unit, widthDp: Int, heightDp: Int) {
      val var8: StickerView = this.stickerView;
      val var7: java.lang.String = var1.getUrl();
      val var6: Boolean;
      if (var1.getRenderMode() == 0) {
         var6 = true;
      } else {
         var6 = false;
      }

      var8.asApng(var7, var4, var5, var6, var1.getAccessibilityLabel());
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.stickerView, false, new H(var2, var1), 1, null);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(this.stickerView, false, new I(var3, var1), 1, null);
   }
}
