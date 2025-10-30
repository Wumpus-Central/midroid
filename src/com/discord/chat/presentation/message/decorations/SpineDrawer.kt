package com.discord.chat.presentation.message.decorations

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
import f6.d
import f6.e
import fm.l
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSpineDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpineDrawer.kt\ncom/discord/chat/presentation/message/decorations/SpineDrawer\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,101:1\n27#2,7:102\n27#2,7:109\n*S KotlinDebug\n*F\n+ 1 SpineDrawer.kt\ncom/discord/chat/presentation/message/decorations/SpineDrawer\n*L\n55#1:102,7\n78#1:109,7\n*E\n"])
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
      this.lineDrawable$delegate = l.b(new d(this));
      this.splineView$delegate = l.b(new e(this));
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
      label13: {
         val var8: Int = var1.save();

         try {
            var2.getDecoratedBoundsWithMargins(var3, this.spineRect);
            val var9: Int = var3.getTop();
            val var10: Int = var3.getTop();
            val var6: Int = (var4.getBottom() - var4.getTop()) / 2;
            val var7: Int = this.itemPaddingOffset;
            val var14: Rect = new Rect(var5 - this.getLineDrawable().getIntrinsicWidth() / 2, var9, this.contentStartPositionPx, var10 + var6 + var7);
            val var13: ChannelSpineView = this.getSplineView();
            var13.setRowHeight((float)(var14.height() / 2));
            var13.measure(MeasureSpec.makeMeasureSpec(var14.width(), 1073741824), MeasureSpec.makeMeasureSpec(var14.height(), 1073741824));
            var13.layout(0, 0, var14.width(), var14.height());
            var1.translate((float)var14.left, (float)var14.top);
            var13.draw(var1);
         } catch (var11: java.lang.Throwable) {
            var1.restoreToCount(var8);
         }

         var1.restoreToCount(var8);
      }
   }

   public fun drawSpinePiece(canvas: Canvas, parent: RecyclerView, child: View, middle: Int, topOffsetPx: Int = 0) {
      label13: {
         val var6: Int = var1.save();

         try {
            var2.getDecoratedBoundsWithMargins(var3, this.spineRect);
            val var9: PaintDrawable = this.getLineDrawable();
            var9.setBounds(
               var4 - var9.getIntrinsicWidth() / 2,
               this.spineRect.top + var5,
               (int)Math.ceil((double)var4 + (double)var9.getIntrinsicWidth() / (double)2),
               this.spineRect.bottom
            );
            var9.draw(var1);
         } catch (var7: java.lang.Throwable) {
            var1.restoreToCount(var6);
         }

         var1.restoreToCount(var6);
      }
   }
}
