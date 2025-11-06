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
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import ht.p
import java.util.ArrayList
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nChannelSpineView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelSpineView.kt\ncom/discord/channel_spine/ChannelSpineView\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,215:1\n27#2,7:216\n*S KotlinDebug\n*F\n+ 1 ChannelSpineView.kt\ncom/discord/channel_spine/ChannelSpineView\n*L\n91#1:216,7\n*E\n"])
public class ChannelSpineView  public constructor(context: Context, attrs: AttributeSet? = null) : View(var1, var2) {
   private final val spinePaint: Paint

   public final var verticalPadding: Int
      internal set

   public final var horizontalPadding: Int
      internal set

   private final val arcRect: RectF
   private final var paths: List<Path>
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


   public final var rowHeight: Float
      internal final set(value) {
         val var2: Boolean;
         if (this.rowHeight == var1) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.rowHeight = var1;
         if (!var2 && this.numRows > 0) {
            this.rebuildLayout();
            this.invalidate();
            this.requestLayout();
         }
      }


   fun ChannelSpineView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var4: Paint = new Paint();
      val var3: Int;
      if (!this.isInEditMode()) {
         var3 = ThemeManagerKt.getTheme().getBackgroundAccent();
      } else {
         var3 = ColorUtilsKt.getColorCompat(var1, color.primary_500);
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
      this.paths = CollectionsKt.l();
      this.setWillNotDraw(false);
   }

   private fun arcPercent(): Float {
      return if (this.isReplySpline) 0.25F else 0.5F;
   }

   @JvmStatic
   fun `configureAsReplySpline$lambda$1`(
      var0: ChannelSpineView, var1: View, var2: Int, var3: Int, var4: Int, var5: Int, var6: Int, var7: Int, var8: Int, var9: Int
   ) {
      var0.setRowHeight(SizeUtilsKt.getPxToDp(var5 - var3));
   }

   private fun createSpinePath(rowHeight: Float, rowIndex: Int, direction: com.discord.channel_spine.ChannelSpineView.SpineDirection): Path {
      val var11: Path = new Path();
      val var6: Float = this.spinePaint.getStrokeWidth() / 2.0F;
      val var10: IntArray = ChannelSpineView.WhenMappings.$EnumSwitchMapping$0;
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

      val var7: Float = this.yOfRow(var1, var2) - this.verticalPadding - var6 + var5;
      val var8: Float = this.getMeasuredWidth();
      var1 = this.horizontalPadding;
      var5 = this.arcPercent() * this.getMeasuredWidth();
      var2 = var10[var3.ordinal()];
      if (var2 != 1) {
         if (var2 != 2) {
            throw new p();
         }

         this.arcRect.set(var6, var7, var6 + var5, var5 + var7);
      } else {
         this.arcRect.set(var6, var7 - var5, var5 + var6, var7);
      }

      var11.moveTo(var6, var4);
      var11.arcTo(this.arcRect, 180.0F, var3.getArcSweepAngle(), false);
      var11.lineTo(var8 - var1, var7);
      return var11;
   }

   private fun rebuildLayout() {
      val var5: Int = this.numRows;
      val var1: Float = SizeUtilsKt.getDpToPx(this.rowHeight);
      if (var5 != 0 && !(var1 <= 1.0E-4F)) {
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

            var7.add(this.createSpinePath(var1, var4, var6));
            if (var4 < var5 - 1) {
               var7.add(this.createSpinePath(var1, var4, ChannelSpineView.SpineDirection.BOTTOM_TO_TOP));
            }
         }

         if (var3 != 0) {
            val var8: Path = new Path();
            val var2: Float = this.spinePaint.getStrokeWidth() / 2.0F;
            var8.moveTo(var2, (float)this.verticalPadding);
            var8.lineTo(var2, this.yOfRow(var1, var5 - 2) + var1 / 2.0F);
            var7.add(var8);
         }

         this.paths = var7;
      } else {
         this.paths = CollectionsKt.l();
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
      this.addOnLayoutChangeListener(new com.discord.channel_spine.a(this));
   }

   protected open fun onDraw(canvas: Canvas) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.insertSemaphore(FinallyProcessor.java:350)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:99)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ldc_w "canvas"
      // 04: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 07: aload 0
      // 08: aload 1
      // 09: invokespecial android/view/View.onDraw (Landroid/graphics/Canvas;)V
      // 0c: aload 1
      // 0d: invokevirtual android/graphics/Canvas.save ()I
      // 10: istore 2
      // 11: aload 0
      // 12: getfield com/discord/channel_spine/ChannelSpineView.paths Ljava/util/List;
      // 15: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1a: astore 3
      // 1b: aload 3
      // 1c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 21: ifeq 3c
      // 24: aload 1
      // 25: aload 3
      // 26: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2b: checkcast android/graphics/Path
      // 2e: aload 0
      // 2f: getfield com/discord/channel_spine/ChannelSpineView.spinePaint Landroid/graphics/Paint;
      // 32: invokevirtual android/graphics/Canvas.drawPath (Landroid/graphics/Path;Landroid/graphics/Paint;)V
      // 35: goto 1b
      // 38: astore 3
      // 39: goto 42
      // 3c: aload 1
      // 3d: iload 2
      // 3e: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 41: return
      // 42: aload 1
      // 43: iload 2
      // 44: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 47: aload 3
      // 48: athrow
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
            var6 = e.i(var3, (float)MeasureSpec.getSize(var2));
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
         $ENTRIES = pt.a.a(var0);
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
