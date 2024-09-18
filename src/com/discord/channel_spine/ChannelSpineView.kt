package com.discord.channel_spine

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.graphics.Paint.Cap
import android.graphics.Paint.Style
import android.util.AttributeSet
import android.view.View
import android.view.View.MeasureSpec
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import gh.p
import java.util.ArrayList
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q

public class ChannelSpineView  public constructor(context: Context, attrs: AttributeSet? = null) : View {
   private final val arcRect: RectF

   public final var horizontalPadding: Int
      internal set

   private final var isReplySpline: Boolean

   public final var numRows: Int
      internal final set(value) {
         val var2: Boolean;
         if (this.numRows != var1) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.numRows = var1;
         if (var2 && this.rowHeight > 0.0F) {
            this.rebuildLayout();
            this.invalidate();
            this.requestLayout();
         }
      }


   private final var paths: List<Path>

   public final var rowHeight: Float
      internal final set(value) {
         val var2: Boolean;
         if (this.rowHeight == var1) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.rowHeight = var1;
         if (var2 xor true && this.numRows > 0) {
            this.rebuildLayout();
            this.invalidate();
            this.requestLayout();
         }
      }


   private final val spinePaint: Paint

   public final var verticalPadding: Int
      internal set

   fun ChannelSpineView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      val var4: Paint = new Paint();
      val var3: Int;
      if (!this.isInEditMode()) {
         var3 = ThemeManagerKt.getTheme().getBackgroundAccent();
      } else {
         var3 = ColorUtilsKt.getColorCompat(var1, com.discord.theme.R.color.primary_500);
      }

      var4.setColor(var3);
      var4.setAntiAlias(true);
      var4.setStrokeCap(Cap.ROUND);
      var4.setStrokeWidth(this.getResources().getDimension(R.dimen.spine_width));
      var4.setStyle(Style.STROKE);
      this.spinePaint = var4;
      this.verticalPadding = SizeUtilsKt.getDpToPx(8);
      this.horizontalPadding = SizeUtilsKt.getDpToPx(0);
      this.arcRect = new RectF();
      this.paths = i.j();
      this.setWillNotDraw(false);
   }

   private fun arcPercent(): Float {
      val var1: Float;
      if (this.isReplySpline) {
         var1 = 0.25F;
      } else {
         var1 = 0.5F;
      }

      return var1;
   }

   @JvmStatic
   fun `configureAsReplySpline$lambda$1`(
      var0: ChannelSpineView, var1: View, var2: Int, var3: Int, var4: Int, var5: Int, var6: Int, var7: Int, var8: Int, var9: Int
   ) {
      q.h(var0, "this$0");
      var0.setRowHeight(SizeUtilsKt.getPxToDp(var5 - var3));
   }

   private fun createSpinePath(rowHeight: Float, rowIndex: Int, direction: com.discord.channel_spine.ChannelSpineView.SpineDirection): Path {
      val var10: Path = new Path();
      val var6: Float = this.spinePaint.getStrokeWidth() / 2.0F;
      val var11: IntArray = ChannelSpineView.WhenMappings.$EnumSwitchMapping$0;
      val var9: Int = ChannelSpineView.WhenMappings.$EnumSwitchMapping$0[var3.ordinal()];
      val var4: Float;
      if (var9 != 1) {
         if (var9 != 2) {
            throw new p();
         }

         var4 = this.yOfRow(var1, var2 + 1);
      } else {
         var4 = this.yOfRow(var1, var2);
      }

      var var5: Float;
      if (this.isReplySpline) {
         var5 = SizeUtilsKt.getDpToPx(9);
      } else {
         var5 = 0.5F * var1;
      }

      var1 = this.yOfRow(var1, var2) - this.verticalPadding - var6 + var5;
      val var7: Float = this.getMeasuredWidth();
      val var8: Float = this.horizontalPadding;
      var5 = this.arcPercent() * this.getMeasuredWidth();
      var2 = var11[var3.ordinal()];
      if (var2 != 1) {
         if (var2 == 2) {
            this.arcRect.set(var6, var1, var6 + var5, var5 + var1);
         }
      } else {
         this.arcRect.set(var6, var1 - var5, var5 + var6, var1);
      }

      var10.moveTo(var6, var4);
      var10.arcTo(this.arcRect, 180.0F, var3.getArcSweepAngle(), false);
      var10.lineTo(var7 - var8, var1);
      return var10;
   }

   private fun rebuildLayout() {
      val var5: Int = this.numRows;
      val var2: Float = SizeUtilsKt.getDpToPx(this.rowHeight);
      if (var5 != 0 && !(var2 <= 1.0E-4F)) {
         var var4: Int = 0;
         var var3: Byte = 1;
         if (var5 <= 1) {
            var3 = 0;
         }

         val var7: ArrayList;
         for (var7 = new ArrayList(var5 + var3); var4 < var5; var4++) {
            val var6: ChannelSpineView.SpineDirection;
            if (this.isReplySpline) {
               var6 = ChannelSpineView.SpineDirection.BOTTOM_TO_TOP;
            } else {
               var6 = ChannelSpineView.SpineDirection.TOP_TO_BOTTOM;
            }

            var7.add(this.createSpinePath(var2, var4, var6));
            if (var4 < var5 - 1) {
               var7.add(this.createSpinePath(var2, var4, ChannelSpineView.SpineDirection.BOTTOM_TO_TOP));
            }
         }

         if (var3 != 0) {
            val var8: Path = new Path();
            val var1: Float = this.spinePaint.getStrokeWidth() / 2.0F;
            var8.moveTo(var1, (float)this.verticalPadding);
            var8.lineTo(var1, this.yOfRow(var2, var5 - 2) + var2 / 2.0F);
            var7.add(var8);
         }

         this.paths = var7;
      } else {
         this.paths = i.j();
      }
   }

   private fun yOfRow(rowHeight: Float, rowIndex: Int): Float {
      return this.verticalPadding + var2 * var1;
   }

   public fun configureAsReplySpline() {
      this.isReplySpline = true;
      this.verticalPadding = SizeUtilsKt.getDpToPx(0);
      this.horizontalPadding = SizeUtilsKt.getDpToPx(0);
      this.setNumRows(1);
      this.addOnLayoutChangeListener(new a(this));
   }

   protected open fun onDraw(canvas: Canvas) {
      q.h(var1, "canvas");
      super.onDraw(var1);
      val var2: Int = var1.save();
      val var3: java.util.Iterator = this.paths.iterator();

      while (var3.hasNext()) {
         var1.drawPath(var3.next() as Path, this.spinePaint);
      }

      var1.restoreToCount(var2);
   }

   protected open fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
      if (this.numRows != 0 && this.rowHeight != 0.0F) {
         var var5: Int = MeasureSpec.getMode(var1);
         if (var5 != Integer.MIN_VALUE && var5 != 1073741824) {
            var1 = 0;
         } else {
            var1 = MeasureSpec.getSize(var1);
         }

         val var3: Float = this.numRows * this.rowHeight;
         var5 = MeasureSpec.getMode(var2);
         val var6: Any;
         if (var5 != Integer.MIN_VALUE) {
            if (var5 != 1073741824) {
               var6 = var3;
            } else {
               var6 = MeasureSpec.getSize(var2);
            }
         } else {
            var6 = f.f(var3, (float)MeasureSpec.getSize(var2));
         }

         var var8: Boolean = false;
         if (var1 != this.getMeasuredWidth()) {
            var8 = true;
         }

         this.setMeasuredDimension(var1, var6.intValue());
         if (var8) {
            this.rebuildLayout();
            this.invalidate();
         }
      } else {
         super.onMeasure(var1, var2);
      }
   }

   private enum class SpineDirection(arcSweepAngle: Float) {
      BOTTOM_TO_TOP(90.0F),
      TOP_TO_BOTTOM(-90.0F)
      public final val arcSweepAngle: Float
      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private ChannelSpineView.SpineDirection[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<ChannelSpineView.SpineDirection> = $values();
         $VALUES = var0;
         $ENTRIES = nh.a.a(var0);
      }

      init {
         this.arcSweepAngle = var3;
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }
}
