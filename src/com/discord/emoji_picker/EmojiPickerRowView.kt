package com.discord.emoji_picker

import android.content.Context
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.view.View
import android.view.ViewGroup.MarginLayoutParams
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import com.discord.emoji_picker.EmojiPickerRow.Emoji
import com.discord.image.fresco.SetOptionalImageUrlKt
import com.discord.misc.utilities.drawable.GetDrawableCompatKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.drawable.ScalingUtils.ScaleType
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.q

internal class EmojiPickerRowView(context: Context) : LinearLayout {
   public final var onPressEmoji: (String) -> Unit
   public final var onLongPressEmoji: (String) -> Unit

   @JvmStatic
   fun {
      val var0: GradientDrawable = new GradientDrawable();
      var0.setShape(1);
      var0.setColor(ThemeManagerKt.getTheme().getBackgroundAccent());
      placeholder = var0;
   }

   init {
      q.h(var1, "context");
      super(var1);
      this.onPressEmoji = <unrepresentable>.INSTANCE;
      this.onLongPressEmoji = <unrepresentable>.INSTANCE;
      this.setOrientation(0);
   }

   private fun configureRowEmojiViews(emojis: List<Emoji?>, isSectionNitroLocked: Boolean) {
      val var6: java.util.Iterator = var1.iterator();

      for (int var3 = 0; var6.hasNext(); var3++) {
         var var10: Any = var6.next();
         if (var3 < 0) {
            i.u();
         }

         val var7: EmojiPickerRow.Emoji = var10 as EmojiPickerRow.Emoji;
         var10 = this.getChildAt(var3);
         q.f(var10, "null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
         val var8: SimpleDraweeView = var10 as SimpleDraweeView;
         var10 = null;
         if (var7 == null) {
            var8.setImageURI(null);
            var8.setVisibility(4);
         } else {
            SetOptionalImageUrlKt.setOptionalImageUrl$default(var8, var7.getUrl(), var7.getAnimated(), null, 4, null);
            var8.setVisibility(0);
            var8.setContentDescription(var7.getName());
            val var9: a = new a(this, var7);
            var var4: Boolean = true;
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var8, false, var9, 1, null);
            NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var8, false, new b(this, var7), 1, null);
            if (!var7.getDisabled() || var2) {
               var4 = false;
            }

            val var5: Int;
            if (var4) {
               var5 = SizeUtilsKt.getDpToPx(4);
            } else {
               var5 = 0;
            }

            ViewClippingUtilsKt.clipToRoundedRectangle(var8, var5);
            val var14: GenericDraweeHierarchy = var8.getHierarchy() as GenericDraweeHierarchy;
            if (var4) {
               var10 = this.getContext();
               q.g(var10, "getContext(...)");
               var10 = GetDrawableCompatKt.getDrawableCompat((Context)var10, R.drawable.lock_overlay);
            }

            var14.z((Drawable)var10);
         }
      }
   }

   @JvmStatic
   fun `configureRowEmojiViews$lambda$2$lambda$0`(var0: EmojiPickerRowView, var1: EmojiPickerRow.Emoji, var2: View) {
      q.h(var0, "this$0");
      var0.onPressEmoji.invoke(var1.getName());
   }

   @JvmStatic
   fun `configureRowEmojiViews$lambda$2$lambda$1`(var0: EmojiPickerRowView, var1: EmojiPickerRow.Emoji, var2: View): Boolean {
      q.h(var0, "this$0");
      var0.onLongPressEmoji.invoke(var1.getName());
      return true;
   }

   private fun createRowEmojiViews(rowData: EmojiPickerRow) {
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

         var7 = var7 as EmojiPickerRow.Emoji;
         val var3: Int;
         if (var10 == 0) {
            var3 = 0;
         } else {
            var3 = var4;
         }

         val var8: SimpleDraweeView = new SimpleDraweeView(this.getContext());
         RippleUtilsKt.addCircleRipple$default(var8, false, 1, null);
         (var8.getHierarchy() as GenericDraweeHierarchy).A(placeholder);
         (var8.getHierarchy() as GenericDraweeHierarchy).u(ScaleType.e);
         var7 = new LayoutParams(var5, var5);
         var7.setMargins(var3, var6, 0, var6);
         var8.setLayoutParams(var7);
         this.addView(var8);
      }
   }

   public fun setRowData(rowData: EmojiPickerRow) {
      q.h(var1, "rowData");
      if (var1.getItems().size() != this.getChildCount()) {
         this.createRowEmojiViews(var1);
      }

      this.configureRowEmojiViews(var1.getItems(), var1.isSectionNitroLocked());
   }

   public companion object {
      private final val placeholder: GradientDrawable
   }
}
