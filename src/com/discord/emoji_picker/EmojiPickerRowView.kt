package com.discord.emoji_picker

import android.content.Context
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.view.View
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
import com.facebook.drawee.drawable.ScalingUtils$ScaleType
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nEmojiPickerRowView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerRowView.kt\ncom/discord/emoji_picker/EmojiPickerRowView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,113:1\n1872#2,2:114\n1874#2:120\n1872#2,3:121\n278#3,2:116\n278#3,2:118\n*S KotlinDebug\n*F\n+ 1 EmojiPickerRowView.kt\ncom/discord/emoji_picker/EmojiPickerRowView\n*L\n43#1:114,2\n43#1:120\n86#1:121,3\n47#1:116,2\n53#1:118,2\n*E\n"])
internal class EmojiPickerRowView(context: Context) : LinearLayout(var1) {
   public final var onPressEmoji: (String) -> Unit = new com.discord.emoji_picker.c()
   public final var onLongPressEmoji: (String) -> Unit

   @JvmStatic
   fun {
      val var0: GradientDrawable = new GradientDrawable();
      var0.setShape(1);
      var0.setColor(ThemeManagerKt.getTheme().getBackgroundAccent());
      placeholder = var0;
   }

   init {
      this.onLongPressEmoji = new com.discord.emoji_picker.d();
      this.setOrientation(0);
   }

   private fun configureRowEmojiViews(emojis: List<Emoji?>, isSectionNitroLocked: Boolean) {
      val var6: java.util.Iterator = var1.iterator();

      for (int var3 = 0; var6.hasNext(); var3++) {
         var var10: Any = var6.next();
         if (var3 < 0) {
            CollectionsKt.v();
         }

         val var7: EmojiPickerRow.Emoji = var10 as EmojiPickerRow.Emoji;
         var10 = this.getChildAt(var3);
         val var9: SimpleDraweeView = var10 as SimpleDraweeView;
         var10 = null;
         if (var7 == null) {
            var9.setImageURI(null);
            var9.setVisibility(4);
         } else {
            SetOptionalImageUrlKt.setOptionalImageUrl$default(var9, var7.getUrl(), var7.getAnimated(), null, null, 12, null);
            var9.setVisibility(0);
            var9.setContentDescription(var7.getName());
            val var8: com.discord.emoji_picker.e = new com.discord.emoji_picker.e(this, var7);
            var var4: Boolean = true;
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var9, false, var8, 1, null);
            NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var9, false, new com.discord.emoji_picker.f(this, var7), 1, null);
            if (!var7.getDisabled() || var2) {
               var4 = false;
            }

            val var5: Int;
            if (var4) {
               var5 = SizeUtilsKt.getDpToPx(4);
            } else {
               var5 = 0;
            }

            ViewClippingUtilsKt.clipToRoundedRectangle(var9, var5);
            val var14: GenericDraweeHierarchy = var9.getHierarchy() as GenericDraweeHierarchy;
            if (var4) {
               var10 = this.getContext();
               var10 = GetDrawableCompatKt.getDrawableCompat((Context)var10, R.drawable.lock_overlay);
            }

            var14.y((Drawable)var10);
         }
      }
   }

   @JvmStatic
   fun `configureRowEmojiViews$lambda$4$lambda$2`(var0: EmojiPickerRowView, var1: EmojiPickerRow.Emoji, var2: View) {
      var0.onPressEmoji.invoke(var1.getName());
   }

   @JvmStatic
   fun `configureRowEmojiViews$lambda$4$lambda$3`(var0: EmojiPickerRowView, var1: EmojiPickerRow.Emoji, var2: View): Boolean {
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
         var var7: View = (View)var9.next();
         if (var10 < 0) {
            CollectionsKt.v();
         }

         var7 = var7 as EmojiPickerRow.Emoji;
         val var3: Int;
         if (var10 == 0) {
            var3 = 0;
         } else {
            var3 = var4;
         }

         var7 = new SimpleDraweeView(this.getContext());
         RippleUtilsKt.addCircleRipple$default(var7, false, 1, null);
         (var7.getHierarchy() as GenericDraweeHierarchy).z(placeholder);
         (var7.getHierarchy() as GenericDraweeHierarchy).t(ScalingUtils$ScaleType.e);
         val var8: LayoutParams = new LayoutParams(var5, var5);
         var8.setMargins(var3, var6, 0, var6);
         var7.setLayoutParams(var8);
         this.addView(var7);
      }
   }

   @JvmStatic
   fun `onLongPressEmoji$lambda$1`(var0: java.lang.String): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `onPressEmoji$lambda$0`(var0: java.lang.String): Unit {
      return Unit.a;
   }

   public fun setRowData(rowData: EmojiPickerRow) {
      if (var1.getItems().size() != this.getChildCount()) {
         this.createRowEmojiViews(var1);
      }

      this.configureRowEmojiViews(var1.getItems(), var1.isSectionNitroLocked());
   }

   public companion object {
      private final val placeholder: GradientDrawable
   }
}
