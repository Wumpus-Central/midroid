package com.discord.chat.presentation.message.decorations

import B9.j
import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.PaintDrawable
import android.view.View
import android.view.View.MeasureSpec
import androidx.recyclerview.widget.RecyclerView
import com.discord.channel_spine.ChannelSpineView
import com.discord.chat.R
import com.discord.theme.ThemeManagerKt
import y1.d
import y1.e

public class SpineDrawer(context: Context, contentStartPositionPx: Int) : RecyclerView.ItemDecoration {
   public final val context: Context
   private final val contentStartPositionPx: Int

   private final val lineDrawable: PaintDrawable
      private final get() {
         return this.lineDrawable$delegate.getValue() as PaintDrawable;
      }


   private final val splineView: ChannelSpineView
      private final get() {
         return this.splineView$delegate.getValue() as ChannelSpineView;
      }


   private final val itemPaddingOffset: Int
   private final val spineRect: Rect

   init {
      this.context = var1;
      this.contentStartPositionPx = var2;
      this.lineDrawable$delegate = j.b(new d(this));
      this.splineView$delegate = j.b(new e(this));
      this.itemPaddingOffset = var1.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing);
      this.spineRect = new Rect();
   }

   @JvmStatic
   fun `lineDrawable_delegate$lambda$1`(var0: SpineDrawer): PaintDrawable {
      val var1: PaintDrawable = new PaintDrawable(ThemeManagerKt.getTheme().getBackgroundAccent());
      var1.setIntrinsicWidth(var0.context.getResources().getDimensionPixelSize(com.discord.channel_spine.R.dimen.spine_width));
      return var1;
   }

   @JvmStatic
   fun `splineView_delegate$lambda$3`(var0: SpineDrawer): ChannelSpineView {
      val var1: ChannelSpineView = new ChannelSpineView(var0.context, null, 2, null);
      var1.setVerticalPadding(0);
      var1.setHorizontalPadding(var1.getContext().getResources().getDimensionPixelSize(R.dimen.thread_spine_end_padding));
      var1.setNumRows(1);
      return var1;
   }

   public fun drawSpineCurve(canvas: Canvas, parent: RecyclerView, child: View, viewToCenterSpine: View, middle: Int) {
      var1.save();
      var2.getDecoratedBoundsWithMargins(var3, this.spineRect);
      val var6: Int = var3.getTop();
      val var8: Int = var3.getTop();
      val var7: Int = (var4.getBottom() - var4.getTop()) / 2;
      val var9: Int = this.itemPaddingOffset;
      val var11: Rect = new Rect(var5 - this.getLineDrawable().getIntrinsicWidth() / 2, var6, this.contentStartPositionPx, var8 + var7 + var9);
      val var10: ChannelSpineView = this.getSplineView();
      var10.setRowHeight((float)(var11.height() / 2));
      var10.measure(MeasureSpec.makeMeasureSpec(var11.width(), 1073741824), MeasureSpec.makeMeasureSpec(var11.height(), 1073741824));
      var10.layout(0, 0, var11.width(), var11.height());
      var1.translate((float)var11.left, (float)var11.top);
      var10.draw(var1);
      var1.restore();
   }

   public fun drawSpinePiece(canvas: Canvas, parent: RecyclerView, child: View, middle: Int, topOffsetPx: Int = 0) {
      var1.save();
      var2.getDecoratedBoundsWithMargins(var3, this.spineRect);
      val var6: PaintDrawable = this.getLineDrawable();
      var6.setBounds(
         var4 - var6.getIntrinsicWidth() / 2,
         this.spineRect.top + var5,
         (int)Math.ceil((double)var4 + (double)var6.getIntrinsicWidth() / (double)2),
         this.spineRect.bottom
      );
      var6.draw(var1);
      var1.restore();
   }
}
