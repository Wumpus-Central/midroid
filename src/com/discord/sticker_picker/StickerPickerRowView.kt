package com.discord.sticker_picker

import android.content.Context
import android.view.View
import android.view.ViewGroup.MarginLayoutParams
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import androidx.core.view.v0
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.ripple.RippleUtilsKt
import com.discord.sticker.StickerView
import kotlin.jvm.internal.q

internal class StickerPickerRowView(context: Context) : LinearLayout {
   private final var firstRenderPass: Boolean
   public final var onPressSticker: (String) -> Unit
   public final var onLongPressSticker: (String) -> Unit

   init {
      q.h(var1, "context");
      super(var1);
      this.onPressSticker = <unrepresentable>.INSTANCE;
      this.onLongPressSticker = <unrepresentable>.INSTANCE;
      this.setOrientation(0);
   }

   private fun configureRowStickerViews(rowData: StickerPickerRow) {
      val var5: java.util.Iterator = var1.getItems().iterator();

      for (int var3 = 0; var5.hasNext(); var3++) {
         var var6: Any = var5.next();
         if (var3 < 0) {
            i.u();
         }

         var6 = var6 as StickerPickerRow.Sticker;
         val var7: View = this.getChildAt(var3);
         q.f(var7, "null cannot be cast to non-null type com.discord.sticker.StickerView");
         val var10: StickerView = var7 as StickerView;
         if (var6 == null) {
            var10.setVisibility(4);
            var10.recycle();
         } else {
            var10.setVisibility(0);
            val var2: Float;
            if (((StickerPickerRow.Sticker)var6).getOpaque()) {
               var2 = 1.0F;
            } else {
               var2 = 0.3F;
            }

            var10.setAlpha(var2);
            var10.setEnabled(((StickerPickerRow.Sticker)var6).getDisabled() xor true);
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var10, false, new a(this, (StickerPickerRow.Sticker)var6), 1, null);
            NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var10, false, new b(this, (StickerPickerRow.Sticker)var6), 1, null);
            val var4: Int = StickerPickerRowView.WhenMappings.$EnumSwitchMapping$0[((StickerPickerRow.Sticker)var6).getType().ordinal()];
            if (var4 != 1) {
               if (var4 != 2) {
                  if (var4 != 3) {
                     if (var4 == 4) {
                        var10.asGif(
                           ((StickerPickerRow.Sticker)var6).getUrl(), var1.getItemSize(), var1.getItemSize(), ((StickerPickerRow.Sticker)var6).getAnimated()
                        );
                     }
                  } else {
                     var10.asLottie(
                        ((StickerPickerRow.Sticker)var6).getUrl(),
                        var1.getItemSize(),
                        var1.getItemSize(),
                        ((StickerPickerRow.Sticker)var6).getAnimated(),
                        ((StickerPickerRow.Sticker)var6).getId(),
                        ((StickerPickerRow.Sticker)var6).getAnimated() xor 1
                     );
                  }
               } else {
                  var10.asApng(
                     ((StickerPickerRow.Sticker)var6).getUrl(), var1.getItemSize(), var1.getItemSize(), ((StickerPickerRow.Sticker)var6).getAnimated()
                  );
               }
            } else {
               var10.asPng(((StickerPickerRow.Sticker)var6).getUrl(), var1.getItemSize(), var1.getItemSize());
            }
         }
      }
   }

   @JvmStatic
   fun `configureRowStickerViews$lambda$3$lambda$1`(var0: StickerPickerRowView, var1: StickerPickerRow.Sticker, var2: View) {
      q.h(var0, "this$0");
      var0.onPressSticker.invoke(var1.getId());
   }

   @JvmStatic
   fun `configureRowStickerViews$lambda$3$lambda$2`(var0: StickerPickerRowView, var1: StickerPickerRow.Sticker, var2: View): Boolean {
      q.h(var0, "this$0");
      var0.onLongPressSticker.invoke(var1.getId());
      return true;
   }

   private fun createRowStickerViews(rowData: StickerPickerRow) {
      this.removeAllViews();
      val var5: Int = SizeUtilsKt.getDpToPx(var1.getItemSize());
      val var2: Int = var1.getItems().size();
      val var4: Int = (SizeUtilsKt.getDpToPx(var1.getRowContentWidth()) - var5 * var2) / (var2 - 1);
      val var6: Int = SizeUtilsKt.getDpToPx(var1.getRowContentPaddingVertical());
      val var9: java.util.Iterator = var1.getItems().iterator();

      for (int var10 = 0; var9.hasNext(); var10++) {
         var var7: MarginLayoutParams = (MarginLayoutParams)var9.next();
         if (var10 < 0) {
            i.u();
         }

         var7 = var7 as StickerPickerRow.Sticker;
         val var3: Int;
         if (var10 == 0) {
            var3 = 0;
         } else {
            var3 = var4;
         }

         var7 = this.getContext();
         q.g(var7, "getContext(...)");
         val var8: StickerView = new StickerView((Context)var7, null, 0, 6, null);
         RippleUtilsKt.addRipple$default(var8, true, 0, 2, null);
         var7 = new LayoutParams(var5, var5);
         var7.setMargins(var3, var6, 0, var6);
         var8.setLayoutParams(var7);
         this.addView(var8);
      }
   }

   public fun clean() {
      for (View var1 : v0.a(this)) {
         q.f(var1, "null cannot be cast to non-null type com.discord.sticker.StickerView");
         (var1 as StickerView).recycle();
      }
   }

   public fun setRowData(rowData: StickerPickerRow) {
      q.h(var1, "rowData");
      if (var1.getItems().size() != this.getChildCount()) {
         this.createRowStickerViews(var1);
      }

      this.configureRowStickerViews(var1);
      if (this.firstRenderPass) {
         this.firstRenderPass = false;
      } else {
         ViewMeasureExtensionsKt.measureAndLayout(this);
      }
   }
}
