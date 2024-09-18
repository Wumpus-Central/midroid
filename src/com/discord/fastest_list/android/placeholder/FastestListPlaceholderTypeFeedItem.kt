package com.discord.fastest_list.android.placeholder

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.graphics.Path.Direction
import android.view.ViewGroup
import com.discord.fastest_list.android.FastestListSections.Entry
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.FeedItem
import com.discord.misc.utilities.drawable.CustomDrawDrawable
import com.discord.misc.utilities.size.SizeUtilsKt
import java.util.LinkedHashMap
import kotlin.jvm.internal.q
import th.c

internal class FastestListPlaceholderTypeFeedItem(config: FeedItem) : FastestListPlaceholder {
   private final val config: FeedItem
   private final val placeholders: MutableMap<Int, CustomDrawDrawable>

   init {
      q.h(var1, "config");
      super(null);
      this.config = var1;
      this.placeholders = new LinkedHashMap<>();
   }

   public override fun onPlaceholderShouldBind(view: ViewGroup, item: Entry) {
      q.h(var1, "view");
      q.h(var2, "item");
      val var3: Int = Math.floorMod(var2.getKey().hashCode(), 20);
      val var5: java.util.Map = this.placeholders;
      val var6: Int = var3;
      val var4: Any = var5.get(var6);
      var var7: Any = var4;
      if (var4 == null) {
         val var8: FastestListPlaceholderTypeFeedItem.Companion = Companion;
         var7 = new FastestListPlaceholderTypeFeedItem.FeedItemDrawable(
            this.config,
            FastestListPlaceholderTypeFeedItem.Companion.getRandomWidthRatio$default(Companion, 0.0F, 0.0F, 3, null),
            FastestListPlaceholderTypeFeedItem.Companion.getRandomWidthRatio$default(var8, 0.0F, 0.0F, 3, null)
         );
         var5.put(var6, var7);
      }

      var1.setBackground(var7 as CustomDrawDrawable);
   }

   public override fun onPlaceholderShouldUnbind(view: ViewGroup) {
      q.h(var1, "view");
      var1.setBackground(null);
   }

   public companion object {
      private const val TOTAL_VARIANTS: Int
      private const val WIDTH_RATIO_MAX: Float
      private const val WIDTH_RATIO_MIN: Float

      private fun getRandomWidthRatio(ratioMin: Float = 0.4F, ratioMax: Float = 0.9F): Float {
         return var1 + c.j.c() * (var2 - var1);
      }
   }

   private class FeedItemDrawable(config: FeedItem, labelWidthRatio: Float, labelWidthRatioSecondary: Float) : CustomDrawDrawable {
      private final val config: FeedItem
      private final val labelWidthRatio: Float
      private final val labelWidthRatioSecondary: Float
      private final val paint: Paint
      private final val path: Path
      private final val pathCornerRadii: FloatArray
      private final val pathRect: RectF

      init {
         q.h(var1, "config");
         super();
         this.config = var1;
         this.labelWidthRatio = var2;
         this.labelWidthRatioSecondary = var3;
         val var12: Paint = new Paint();
         var12.setAntiAlias(true);
         var12.setColor(var1.getColor());
         this.paint = var12;
         this.path = new Path();
         this.pathRect = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
         var var25: java.lang.Float = var1.getBorderTopLeftRadius();
         var var10: Boolean;
         if (var25.floatValue() == 0.0F) {
            var10 = true;
         } else {
            var10 = false;
         }

         if (!(var10 xor true)) {
            var25 = null;
         }

         if (var25 != null) {
            var2 = var25;
         } else {
            var2 = var1.getBorderRadius();
         }

         var var26: java.lang.Float = var1.getBorderTopLeftRadius();
         if (var26.floatValue() == 0.0F) {
            var10 = true;
         } else {
            var10 = false;
         }

         if (!(var10 xor true)) {
            var26 = null;
         }

         if (var26 != null) {
            var3 = var26;
         } else {
            var3 = var1.getBorderRadius();
         }

         var var27: java.lang.Float = var1.getBorderTopRightRadius();
         if (var27.floatValue() == 0.0F) {
            var10 = true;
         } else {
            var10 = false;
         }

         if (!(var10 xor true)) {
            var27 = null;
         }

         val var4: Float;
         if (var27 != null) {
            var4 = var27;
         } else {
            var4 = var1.getBorderRadius();
         }

         var var28: java.lang.Float = var1.getBorderTopRightRadius();
         if (var28.floatValue() == 0.0F) {
            var10 = true;
         } else {
            var10 = false;
         }

         if (!(var10 xor true)) {
            var28 = null;
         }

         val var5: Float;
         if (var28 != null) {
            var5 = var28;
         } else {
            var5 = var1.getBorderRadius();
         }

         var var29: java.lang.Float = var1.getBorderBottomRightRadius();
         if (var29.floatValue() == 0.0F) {
            var10 = true;
         } else {
            var10 = false;
         }

         if (!(var10 xor true)) {
            var29 = null;
         }

         val var6: Float;
         if (var29 != null) {
            var6 = var29;
         } else {
            var6 = var1.getBorderRadius();
         }

         var var30: java.lang.Float = var1.getBorderBottomRightRadius();
         if (var30.floatValue() == 0.0F) {
            var10 = true;
         } else {
            var10 = false;
         }

         if (!(var10 xor true)) {
            var30 = null;
         }

         val var7: Float;
         if (var30 != null) {
            var7 = var30;
         } else {
            var7 = var1.getBorderRadius();
         }

         var var31: java.lang.Float = var1.getBorderBottomLeftRadius();
         if (var31.floatValue() == 0.0F) {
            var10 = true;
         } else {
            var10 = false;
         }

         if (!(var10 xor true)) {
            var31 = null;
         }

         val var8: Float;
         if (var31 != null) {
            var8 = var31;
         } else {
            var8 = var1.getBorderRadius();
         }

         val var14: java.lang.Float = var1.getBorderBottomLeftRadius();
         var10 = false;
         if (var14.floatValue() == 0.0F) {
            var10 = true;
         }

         var var32: java.lang.Float = null;
         if (true xor var10) {
            var32 = var14;
         }

         val var9: Float;
         if (var32 != null) {
            var9 = var32;
         } else {
            var9 = var1.getBorderRadius();
         }

         this.pathCornerRadii = new float[]{var2, var3, var4, var5, var6, var7, var8, var9};
      }

      public override fun draw(canvas: Canvas) {
         q.h(var1, "canvas");
         val var15: Int = this.getBounds().width();
         val var14: Int = this.getBounds().height();
         if (this.config.getBackgroundColor() != 0) {
            this.path.reset();
            this.pathRect.set(0.0F, 0.0F, (float)var15, (float)var14);
            this.path.addRoundRect(this.pathRect, this.pathCornerRadii, Direction.CW);
            this.paint.setColor(this.config.getBackgroundColor());
            var1.drawPath(this.path, this.paint);
            this.paint.setColor(this.config.getColor());
         }

         val var16: Int = FastestListPlaceholderTypeFeedItem.FeedItemDrawable.WhenMappings.$EnumSwitchMapping$0[this.config.getShapeType().ordinal()];
         if (var16 != 1) {
            if (var16 == 2) {
               val var2: Float = (var14 - this.config.getShapeSize()) / 2.0F;
               var1.drawRect(this.config.getPadding(), var2, this.config.getShapeSize(), this.config.getShapeSize() + var2, this.paint);
            }
         } else {
            var1.drawCircle(
               this.config.getShapeSize() / 2.0F + this.config.getPadding(),
               this.config.getShapeSize() / 2.0F + ((float)var14 - this.config.getShapeSize()) / 2.0F,
               this.config.getShapeSize() / 2.0F,
               this.paint
            );
         }

         val var12: Float = this.config.getLabelSize();
         val var20: Float = this.config.getLabelSecondarySize();
         var var6: Float = 2;
         val var21: Float = var12 / 2;
         val var5: Float = var20 / 2;
         val var19: Float = this.config.getLabelPaddingInnerRatio() * var12 / var6;
         var6 = this.config.getLabelPaddingInnerRatio() * var20 / var6;
         val var8: Float = this.config.getPadding() + this.config.getShapeSize() + this.config.getLabelPadding();
         val var7: Float = var15;
         val var11: Float = var15 - this.config.getPadding() - this.config.getLabelPadding();
         val var9: Float = var14;
         val var23: Float = (var14 - (var12 + var20)) / 2.0F + var12;
         var1.drawRoundRect(
            var8,
            ((float)var14 - (var12 + var20)) / 2.0F + var19,
            this.labelWidthRatio * var11,
            ((float)var14 - (var12 + var20)) / 2.0F + var12 - var19,
            var21,
            var21,
            this.paint
         );
         var1.drawRoundRect(var8, var23 + var6, var11 * this.labelWidthRatioSecondary, var23 + var20 - var6, var5, var5, this.paint);
         if (this.config.getDivider()) {
            this.paint.setColor(this.config.getDividerColor());
            var1.drawRect(
               this.config.getDividerPaddingLeft(), var9 - (float)SizeUtilsKt.getDpToPx(1), var7 - this.config.getDividerPaddingRight(), var9, this.paint
            );
            this.paint.setColor(this.config.getColor());
         }
      }
   }
}
