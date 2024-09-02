package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.sticker.Sticker
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.sticker.StickerView
import kotlin.jvm.functions.Function1

public class StickerLottieViewHolder(stickerView: StickerView) : StickerPartViewHolder {
   private final var sticker: Sticker?
   private final val stickerView: StickerView

   init {
      kotlin.jvm.internal.q.h(var1, "stickerView");
      super(var1);
      this.stickerView = var1;
   }

   @JvmStatic
   fun `bind$lambda$0`(var0: Function1, var1: Sticker, var2: View) {
      kotlin.jvm.internal.q.h(var0, "$onStickerClicked");
      kotlin.jvm.internal.q.h(var1, "$sticker");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `bind$lambda$1`(var0: Function1, var1: Sticker, var2: View): Boolean {
      kotlin.jvm.internal.q.h(var0, "$onStickerLongClicked");
      kotlin.jvm.internal.q.h(var1, "$sticker");
      var0.invoke(var1);
      return true;
   }

   public override fun bind(sticker: Sticker, onStickerClicked: (Sticker) -> Unit, onStickerLongClicked: (Sticker) -> Unit, widthDp: Int, heightDp: Int) {
      kotlin.jvm.internal.q.h(var1, "sticker");
      kotlin.jvm.internal.q.h(var2, "onStickerClicked");
      kotlin.jvm.internal.q.h(var3, "onStickerLongClicked");
      if (!kotlin.jvm.internal.q.c(var1, this.sticker)) {
         this.sticker = var1;
         val var8: StickerView = this.stickerView;
         val var7: java.lang.String = var1.getUrl();
         val var6: Boolean;
         if (var1.getRenderMode() == 0) {
            var6 = true;
         } else {
            var6 = false;
         }

         var8.asLottie(var7, var4, var5, var6, var1.getAsset(), var1.getRenderMode());
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.stickerView, false, new v(var2, var1), 1, null);
         NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(this.stickerView, false, new w(var3, var1), 1, null);
      }
   }
}
