package com.discord.fastest_list.android.placeholder

import A9.n
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
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.random.c

@SourceDebugExtension(["SMAP\nFastestListPlaceholderTypeFeedItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastestListPlaceholderTypeFeedItem.kt\ncom/discord/fastest_list/android/placeholder/FastestListPlaceholderTypeFeedItem\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,167:1\n381#2,7:168\n*S KotlinDebug\n*F\n+ 1 FastestListPlaceholderTypeFeedItem.kt\ncom/discord/fastest_list/android/placeholder/FastestListPlaceholderTypeFeedItem\n*L\n22#1:168,7\n*E\n"])
internal class FastestListPlaceholderTypeFeedItem(config: FeedItem) : FastestListPlaceholder() {
   private final val config: FeedItem
   private final val placeholders: MutableMap<Int, CustomDrawDrawable>

   init {
      this.config = var1;
      this.placeholders = new LinkedHashMap<>();
   }

   public override fun onPlaceholderShouldBind(view: ViewGroup, item: Entry) {
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
      var1.setBackground(null);
   }

   public companion object {
      private const val TOTAL_VARIANTS: Int
      private const val WIDTH_RATIO_MIN: Float
      private const val WIDTH_RATIO_MAX: Float

      private fun getRandomWidthRatio(ratioMin: Float = 0.4F, ratioMax: Float = 0.9F): Float {
         return var1 + c.d.c() * (var2 - var1);
      }
   }

   @SourceDebugExtension(["SMAP\nFastestListPlaceholderTypeFeedItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastestListPlaceholderTypeFeedItem.kt\ncom/discord/fastest_list/android/placeholder/FastestListPlaceholderTypeFeedItem$FeedItemDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"])
   private class FeedItemDrawable(config: FeedItem, labelWidthRatio: Float, labelWidthRatioSecondary: Float) : CustomDrawDrawable {
      private final val config: FeedItem
      private final val labelWidthRatio: Float
      private final val labelWidthRatioSecondary: Float
      private final val paint: Paint
      private final val path: Path
      private final val pathRect: RectF
      private final val pathCornerRadii: FloatArray

      init {
         this.config = var1;
         this.labelWidthRatio = var2;
         this.labelWidthRatioSecondary = var3;
         val var11: Paint = new Paint();
         var11.setAntiAlias(true);
         var11.setColor(var1.getColor());
         this.paint = var11;
         this.path = new Path();
         this.pathRect = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
         var var23: java.lang.Float = var1.getBorderTopLeftRadius();
         var var10: Boolean;
         if (var23.floatValue() == 0.0F) {
            var10 = true;
         } else {
            var10 = false;
         }

         if (var10) {
            var23 = null;
         }

         if (var23 != null) {
            var2 = var23;
         } else {
            var2 = var1.getBorderRadius();
         }

         var var24: java.lang.Float = var1.getBorderTopLeftRadius();
         if (var24.floatValue() == 0.0F) {
            var10 = true;
         } else {
            var10 = false;
         }

         if (var10) {
            var24 = null;
         }

         if (var24 != null) {
            var3 = var24;
         } else {
            var3 = var1.getBorderRadius();
         }

         var var25: java.lang.Float = var1.getBorderTopRightRadius();
         if (var25.floatValue() == 0.0F) {
            var10 = true;
         } else {
            var10 = false;
         }

         if (var10) {
            var25 = null;
         }

         val var4: Float;
         if (var25 != null) {
            var4 = var25;
         } else {
            var4 = var1.getBorderRadius();
         }

         var var26: java.lang.Float = var1.getBorderTopRightRadius();
         if (var26.floatValue() == 0.0F) {
            var10 = true;
         } else {
            var10 = false;
         }

         if (var10) {
            var26 = null;
         }

         val var5: Float;
         if (var26 != null) {
            var5 = var26;
         } else {
            var5 = var1.getBorderRadius();
         }

         var var27: java.lang.Float = var1.getBorderBottomRightRadius();
         if (var27.floatValue() == 0.0F) {
            var10 = true;
         } else {
            var10 = false;
         }

         if (var10) {
            var27 = null;
         }

         val var6: Float;
         if (var27 != null) {
            var6 = var27;
         } else {
            var6 = var1.getBorderRadius();
         }

         var var28: java.lang.Float = var1.getBorderBottomRightRadius();
         if (var28.floatValue() == 0.0F) {
            var10 = true;
         } else {
            var10 = false;
         }

         if (var10) {
            var28 = null;
         }

         val var7: Float;
         if (var28 != null) {
            var7 = var28;
         } else {
            var7 = var1.getBorderRadius();
         }

         var var29: java.lang.Float = var1.getBorderBottomLeftRadius();
         if (var29.floatValue() == 0.0F) {
            var10 = true;
         } else {
            var10 = false;
         }

         if (var10) {
            var29 = null;
         }

         val var8: Float;
         if (var29 != null) {
            var8 = var29;
         } else {
            var8 = var1.getBorderRadius();
         }

         val var13: java.lang.Float = var1.getBorderBottomLeftRadius();
         if (var13.floatValue() == 0.0F) {
            var10 = true;
         } else {
            var10 = false;
         }

         var var30: java.lang.Float = null;
         if (!var10) {
            var30 = var13;
         }

         val var9: Float;
         if (var30 != null) {
            var9 = var30;
         } else {
            var9 = var1.getBorderRadius();
         }

         this.pathCornerRadii = new float[]{var2, var3, var4, var5, var6, var7, var8, var9};
      }

      public override fun draw(canvas: Canvas) {
         val var14: Int = this.getBounds().width();
         val var16: Int = this.getBounds().height();
         if (this.config.getBackgroundColor() != 0) {
            this.path.reset();
            this.pathRect.set(0.0F, 0.0F, (float)var14, (float)var16);
            this.path.addRoundRect(this.pathRect, this.pathCornerRadii, Direction.CW);
            this.paint.setColor(this.config.getBackgroundColor());
            var1.drawPath(this.path, this.paint);
            this.paint.setColor(this.config.getColor());
         }

         val var15: Int = FastestListPlaceholderTypeFeedItem.FeedItemDrawable.WhenMappings.$EnumSwitchMapping$0[this.config.getShapeType().ordinal()];
         if (var15 != 1) {
            if (var15 != 2) {
               throw new n();
            }

            val var2: Float = (var16 - this.config.getShapeSize()) / 2.0F;
            var1.drawRect(this.config.getPadding(), var2, this.config.getShapeSize(), this.config.getShapeSize() + var2, this.paint);
         } else {
            var1.drawCircle(
               this.config.getShapeSize() / 2.0F + this.config.getPadding(),
               this.config.getShapeSize() / 2.0F + ((float)var16 - this.config.getShapeSize()) / 2.0F,
               this.config.getShapeSize() / 2.0F,
               this.paint
            );
         }

         val var8: Float = this.config.getLabelSize();
         val var19: Float = this.config.getLabelSecondarySize();
         var var6: Float = 2;
         val var5: Float = var8 / 2;
         val var21: Float = var19 / 2;
         val var20: Float = this.config.getLabelPaddingInnerRatio() * var8 / var6;
         val var12: Float = this.config.getLabelPaddingInnerRatio() * var19 / var6;
         var6 = this.config.getPadding() + this.config.getShapeSize() + this.config.getLabelPadding();
         val var10: Float = var14;
         val var11: Float = var14 - this.config.getPadding() - this.config.getLabelPadding();
         val var7: Float = var16;
         val var23: Float = (var16 - (var8 + var19)) / 2.0F + var8;
         var1.drawRoundRect(
            var6,
            ((float)var16 - (var8 + var19)) / 2.0F + var20,
            this.labelWidthRatio * var11,
            ((float)var16 - (var8 + var19)) / 2.0F + var8 - var20,
            var5,
            var5,
            this.paint
         );
         var1.drawRoundRect(var6, var23 + var12, var11 * this.labelWidthRatioSecondary, var23 + var19 - var12, var21, var21, this.paint);
         if (this.config.getDivider()) {
            this.paint.setColor(this.config.getDividerColor());
            var1.drawRect(
               this.config.getDividerPaddingLeft(), var7 - (float)SizeUtilsKt.getDpToPx(1), var10 - this.config.getDividerPaddingRight(), var7, this.paint
            );
            this.paint.setColor(this.config.getColor());
         }
      }
   }
}
