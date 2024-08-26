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
   private final var disableRecycling: Boolean
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
         var var12: Int = 0;
         var var11: Int = 0;
         var var20: Int = 0;

         for (int var22 = 0; var11 < var14; var11++) {
            var var17: Pair;
            var var23: Int = this.getItemCount();
            label108:
            if (var23 != 1) {
               if (var23 != 2) {
                  if (var23 == 3) {
                     var17 = new Pair;
                     val var18: Int = 2;
                     if (var11 == 0) {
                        var17./* $VF: Unable to resugar constructor */<init>(var18, 4);
                     } else {
                        var17./* $VF: Unable to resugar constructor */<init>(var18, 2);
                     }
                     break label108;
                  }

                  if (var23 != 4) {
                     var23 = this.getItemCount() % 3;
                     if (var11 < var23) {
                        var17 = new Pair(var23, 6 / var23);
                     } else {
                        var17 = new Pair(3, 2);
                     }
                     break label108;
                  }
               }

               var17 = new Pair(2, 3);
            } else {
               var17 = new Pair(1, 6);
            }

            val var13: Int = (var17.a() as java.lang.Number).intValue();
            val var15: Int = (var17.b() as java.lang.Number).intValue();
            val var19: View = var1.o(var11);
            r.g(var19, "recycler.getViewForPosition(index)");
            val var16: Boolean = var19 is MosaicView;
            val var33: MosaicView;
            if (var19 is MosaicView) {
               var33 = var19 as MosaicView;
            } else {
               var33 = null;
            }

            val var2: Float;
            if (var33 != null) {
               var2 = var33.getSingleAspectRatio();
            } else {
               var2 = 1.0F;
            }

            var var27: Int;
            label99: {
               var var9: Int;
               if (this.getItemCount() == 1) {
                  var23 = (int)(var8 / var2);
                  if ((int)(var8 / var2) <= this.mediaMaxHeight) {
                     var27 = var8;
                     break label99;
                  }

                  var23 = (int)(this.mediaMaxHeight * var2);
                  var9 = var20;
                  var20 = this.mediaMaxHeight;
               } else {
                  if (this.getItemCount() == 3) {
                     if (var11 == 0) {
                        var23 = var6 * 2 + this.spacingPx;
                     } else {
                        var23 = var6;
                     }
                  } else {
                     var23 = (var8 - (var13 - 1) * this.spacingPx) / var13;
                  }

                  var27 = this.getItemCount();
                  if (var27 != 3) {
                     if (var27 != 4 && var13 < 3) {
                        var27 = var6 * 2 + this.spacingPx;
                     } else {
                        var27 = var6;
                     }
                  } else {
                     var27 = var23;
                  }

                  var var10: Int;
                  if (this.getItemCount() == 3) {
                     var10 = var22;
                     var9 = var20;
                     if (var11 == 2) {
                        var10 = var22 + 4;
                        var9 = this.spacingPx * 2;
                     }
                  } else {
                     var9 = var20;
                     var10 = var22;
                  }

                  var22 = var10;
                  var20 = var27;
               }

               var27 = var23;
               var23 = var20;
               var20 = var9;
            }

            this.addView(var19);
            this.measureChildWithMargins(var19, 0, 0);
            var var31: Int;
            if (this.getItemCount() == 3) {
               var31 = var13;
            } else {
               var31 = var13 - 1;
            }

            var31 = sh.a.b((float)Math.ceil((double)((float)(var8 - var31 * this.spacingPx) / 6.0F * (float)var22 + (float)var20)));
            this.layoutDecoratedWithMargins(var19, var31, var12, var31 + var27, var12 + var23);
            var var34: MosaicView = null;
            if (var16) {
               var34 = var19 as MosaicView;
            }

            if (var34 != null) {
               var34.setMosaicSize(var27, var23);
            }

            if (this.getItemCount() > 1) {
               var22 += var15;
               var27 = var20 + this.spacingPx;
               var20 += this.spacingPx;
               if (this.getItemCount() == 3) {
                  var20 = var27 + this.spacingPx;
               }

               if (var22 >= 6) {
                  var12 += this.spacingPx + var23;
                  var22 = 0;
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

   public fun disableRecycling(disableRecycling: Boolean) {
      this.disableRecycling = var1;
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
         if (this.disableRecycling) {
            this.removeAllViews();
         } else {
            r.e(var2);
            this.removeAndRecycleAllViews(var2);
         }

         if (var2 != null) {
            var2.c();
         }
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
