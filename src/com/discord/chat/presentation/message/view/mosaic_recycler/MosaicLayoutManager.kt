package com.discord.chat.presentation.message.view.mosaic_recycler

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutParams
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.State
import com.discord.chat.R
import com.discord.chat.presentation.message.MessageAccessoriesView
import kotlin.jvm.internal.r

public class MosaicLayoutManager(context: Context) : LayoutManager {
   private final var constrainedWidth: Int
   public final val context: Context
   private final var isForwardedContent: Boolean
   private final var isShowingInlineForward: Boolean
   private final val mediaMaxHeight: Int
   private final var recycleChildrenOnDetach: Boolean
   private final val spacingPx: Int

   init {
      r.h(var1, "context");
      super();
      this.context = var1;
      this.spacingPx = var1.getResources().getDimensionPixelSize(R.dimen.message_media_grid_spacing);
      this.mediaMaxHeight = var1.getResources().getDimensionPixelSize(R.dimen.message_media_max_height);
   }

   private fun fill(recycler: Recycler?) {
      if (var1 != null) {
         this.detachAndScrapAttachedViews(var1);
         val var8: Int = MessageAccessoriesView.Companion.getWidth(this.constrainedWidth, false, true);
         val var6: Int = (var8 - this.spacingPx * 2) / 3;
         val var14: Int = this.getItemCount();
         var var11: Int = 0;
         var var10: Int = 0;
         var var20: Int = 0;

         for (int var21 = 0; var10 < var14; var10++) {
            var var17: Pair;
            var var22: Int = this.getItemCount();
            label105:
            if (var22 != 1) {
               if (var22 != 2) {
                  if (var22 == 3) {
                     var17 = new Pair;
                     val var18: Int = 2;
                     if (var10 == 0) {
                        var17./* $VF: Unable to resugar constructor */<init>(var18, 4);
                     } else {
                        var17./* $VF: Unable to resugar constructor */<init>(var18, 2);
                     }
                     break label105;
                  }

                  if (var22 != 4) {
                     var22 = this.getItemCount() % 3;
                     if (var10 < var22) {
                        var17 = new Pair(var22, 6 / var22);
                     } else {
                        var17 = new Pair(3, 2);
                     }
                     break label105;
                  }
               }

               var17 = new Pair(2, 3);
            } else {
               var17 = new Pair(1, 6);
            }

            val var13: Int = (var17.a() as java.lang.Number).intValue();
            val var15: Int = (var17.b() as java.lang.Number).intValue();
            val var19: View = var1.o(var10);
            r.g(var19, "recycler.getViewForPosition(index)");
            val var16: Boolean = var19 is MosaicView;
            val var32: MosaicView;
            if (var19 is MosaicView) {
               var32 = var19 as MosaicView;
            } else {
               var32 = null;
            }

            val var2: Float;
            if (var32 != null) {
               var2 = var32.getSingleAspectRatio();
            } else {
               var2 = 1.0F;
            }

            var var26: Int;
            if (this.getItemCount() == 1) {
               var26 = (int)(var8 / var2);
               var22 = this.mediaMaxHeight;
               if (var26 > this.mediaMaxHeight) {
                  var26 = (int)(this.mediaMaxHeight * var2);
               } else {
                  var22 = var26;
                  var26 = var8;
               }
            } else {
               if (this.getItemCount() == 3) {
                  if (var10 == 0) {
                     var22 = var6 * 2 + this.spacingPx;
                  } else {
                     var22 = var6;
                  }
               } else {
                  var22 = (var8 - (var13 - 1) * this.spacingPx) / var13;
               }

               var26 = this.getItemCount();
               if (var26 != 3) {
                  if (var26 != 4 && var13 < 3) {
                     var26 = var6 * 2 + this.spacingPx;
                  } else {
                     var26 = var6;
                  }
               } else {
                  var26 = var22;
               }

               var var9: Int;
               if (this.getItemCount() == 3) {
                  var9 = var21;
                  if (var10 == 2) {
                     var9 = var21 + 4;
                     var20 = this.spacingPx * 2;
                  }
               } else {
                  var9 = var21;
               }

               var21 = var9;
               var22 = var26;
               var26 = var22;
            }

            this.addView(var19);
            this.measureChildWithMargins(var19, 0, 0);
            var var30: Int;
            if (this.getItemCount() == 3) {
               var30 = var13;
            } else {
               var30 = var13 - 1;
            }

            var30 = sh.a.b((float)Math.ceil((double)((float)(var8 - var30 * this.spacingPx) / 6.0F * (float)var21 + (float)var20)));
            this.layoutDecoratedWithMargins(var19, var30, var11, var30 + var26, var11 + var22);
            var var33: MosaicView = null;
            if (var16) {
               var33 = var19 as MosaicView;
            }

            if (var33 != null) {
               var33.setMosaicSize(var26, var22);
            }

            if (this.getItemCount() > 1) {
               var21 += var15;
               var26 = var20 + this.spacingPx;
               var20 += this.spacingPx;
               if (this.getItemCount() == 3) {
                  var20 = var26 + this.spacingPx;
               }

               if (var21 >= 6) {
                  var11 += this.spacingPx + var22;
                  var21 = 0;
                  var20 = 0;
               }
            }
         }
      }
   }

   public open fun canScrollHorizontally(): Boolean {
      return false;
   }

   public open fun canScrollVertically(): Boolean {
      return false;
   }

   public open fun generateDefaultLayoutParams(): LayoutParams {
      return new LayoutParams(-2, -2);
   }

   public open fun isAutoMeasureEnabled(): Boolean {
      return true;
   }

   public open fun onDetachedFromWindow(view: RecyclerView?, recycler: Recycler?) {
      super.onDetachedFromWindow(var1, var2);
      if (this.recycleChildrenOnDetach) {
         r.e(var2);
         this.removeAndRecycleAllViews(var2);
         var2.c();
      }
   }

   public open fun onLayoutChildren(recycler: Recycler, state: State?) {
      r.h(var1, "recycler");
      this.fill(var1);
   }

   public fun setConstrainedWidth(constrainedWidth: Int) {
      this.constrainedWidth = var1;
   }

   public fun setIsForwardedContent(isForwardedContent: Boolean) {
      this.isForwardedContent = var1;
   }

   public fun setIsShowingInlineForward(isShowingInlineForward: Boolean) {
      this.isShowingInlineForward = var1;
   }

   public fun setRecycleChildrenOnDetach(recycleChildrenOnDetach: Boolean) {
      this.recycleChildrenOnDetach = var1;
   }
}
