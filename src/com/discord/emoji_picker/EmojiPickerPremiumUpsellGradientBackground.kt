package com.discord.emoji_picker

import android.content.Context
import android.graphics.Canvas
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.Shader.TileMode
import android.view.View
import androidx.core.view.a3
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.State
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.theme.R.color
import kotlin.jvm.internal.r

public class EmojiPickerPremiumUpsellGradientBackground(context: Context, useTier0UpsellContent: Boolean) : ItemDecoration {
   private final var attached: Boolean
   private final var linearGradient: LinearGradient?
   private final var linearGradientColors: IntArray
   private final val linearGradientPaint: Paint
   private final var linearGradientWidth: Int
   private final var useTier0UpsellContent: Boolean

   init {
      r.h(var1, "context");
      super();
      this.useTier0UpsellContent = var2;
      this.linearGradientColors = EmojiPickerPremiumUpsellGradientBackground.Companion.access$getColors(Companion, var1, var2);
      val var3: Paint = new Paint();
      var3.setAlpha(25);
      this.linearGradientPaint = var3;
   }

   private fun drawGradient(c: Canvas, parent: RecyclerView) {
      val var10: java.util.Iterator = a3.a(var2).iterator();
      var var5: Float = -1.0F;
      var var4: Float = -1.0F;
      var var7: Int = 0;

      while (var10.hasNext()) {
         val var11: Any = var10.next();
         if (var7 < 0) {
            h.s();
         }

         val var15: View = var11 as View;
         val var12: ViewHolder = var2.getChildViewHolder(var11 as View);
         var var8: Boolean;
         if (var5 == -1.0F) {
            var8 = 1;
         } else {
            var8 = 0;
         }

         var var3: Float;
         var var6: Float;
         if (var8) {
            r.g(var12, "childViewHolder");
            var3 = var5;
            var6 = var4;
            if (this.isInsidePremiumRoadblock(var12)) {
               if (var15.getTop() >= 0) {
                  var3 = var15.getTop();
                  var6 = var4;
               } else {
                  var3 = 0.0F;
                  var6 = var4;
               }
            }
         } else {
            if (var4 == -1.0F) {
               var8 = (boolean)1;
            } else {
               var8 = (boolean)0;
            }

            var3 = var5;
            var6 = var4;
            label47:
            if (var8) {
               r.g(var12, "childViewHolder");
               if (!this.isInsidePremiumRoadblock(var12)) {
                  var8 = var15.getTop();
               } else {
                  var3 = var5;
                  var6 = var4;
                  if (!this.isLastChildIndex(var2, var7)) {
                     break label47;
                  }

                  var8 = var15.getTop() + var15.getHeight();
               }

               var6 = var8;
               var3 = var5;
            }
         }

         var7++;
         var5 = var3;
         var4 = var6;
      }

      if (var5 >= 0.0F && var4 >= 0.0F) {
         var1.drawRect(0.0F, var5, (float)var2.getWidth(), var4, this.linearGradientPaint);
      }
   }

   private fun ViewHolder.isInsidePremiumRoadblock(): Boolean {
      var var4: ViewHolder = var1;
      if (var1 !is EmojiPickerViewHolder) {
         var4 = null;
      }

      val var5: EmojiPickerViewHolder = var4 as EmojiPickerViewHolder;
      var var2: Boolean = false;
      if (var5 != null) {
         var2 = false;
         if (EmojiPickerViewHolder.Companion.isNitroLocked(var5)) {
            var2 = true;
         }
      }

      return var2;
   }

   private fun RecyclerView.isLastChildIndex(index: Int): Boolean {
      val var3: Int = var1.getChildCount();
      var var4: Boolean = true;
      if (var3 - 1 != var2) {
         var4 = false;
      }

      return var4;
   }

   public open fun onDraw(c: Canvas, parent: RecyclerView, state: State) {
      r.h(var1, "c");
      r.h(var2, "parent");
      r.h(var3, "state");
      super.onDraw(var1, var2, var3);
      if (this.linearGradientWidth != var2.getWidth()) {
         val var4: Int = var2.getWidth();
         this.linearGradientWidth = var4;
         val var5: LinearGradient = EmojiPickerPremiumUpsellGradientBackground.Companion.createLinearGradient$default(
            Companion, this.linearGradientColors, var4, 0, 4, null
         );
         this.linearGradient = var5;
         this.linearGradientPaint.setShader(var5);
      }

      if (var2.getChildCount() != 0) {
         this.drawGradient(var1, var2);
      }
   }

   public fun setEnabled(enabled: Boolean, recyclerView: RecyclerView) {
      r.h(var2, "recyclerView");
      if (var1) {
         if (!this.attached) {
            var2.addItemDecoration(this);
         }
      } else {
         var2.removeItemDecoration(this);
      }

      this.attached = var1;
   }

   public fun setUseTier0UpsellContent(context: Context, useTier0UpsellContent: Boolean) {
      r.h(var1, "context");
      if (this.useTier0UpsellContent != var2) {
         this.useTier0UpsellContent = var2;
         val var3: EmojiPickerPremiumUpsellGradientBackground.Companion = Companion;
         val var4: IntArray = EmojiPickerPremiumUpsellGradientBackground.Companion.access$getColors(Companion, var1, var2);
         this.linearGradientColors = var4;
         val var5: LinearGradient = EmojiPickerPremiumUpsellGradientBackground.Companion.createLinearGradient$default(
            var3, var4, this.linearGradientWidth, 0, 4, null
         );
         this.linearGradient = var5;
         this.linearGradientPaint.setShader(var5);
      }
   }

   public companion object {
      private fun createLinearGradient(colors: IntArray, width: Int, height: Int = 0): LinearGradient {
         return new LinearGradient(0.0F, 0.0F, var2, var3, var1, null, TileMode.CLAMP);
      }

      private fun Context.getColors(useTier0UpsellContent: Boolean): IntArray {
         val var4: IntArray;
         if (var2) {
            var4 = new int[]{var1.getColor(color.premium_tier_0_purple_for_gradients), var1.getColor(color.premium_tier_0_blue_for_gradients)};
         } else {
            var4 = new int[]{
               var1.getColor(color.premium_tier_2_purple_for_gradients),
               var1.getColor(color.premium_tier_2_purple_for_gradients_2),
               var1.getColor(color.premium_tier_2_pink_for_gradients)
            };
         }

         return var4;
      }
   }
}
