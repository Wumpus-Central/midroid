package com.discord.chat.presentation.message.view.mosaic_recycler

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutParams
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.State
import com.discord.chat.R.dimen
import com.discord.logging.Log
import xt.a

public class MosaicLayoutManager(context: Context) : LayoutManager {
   public final val context: Context
   private final val spacingPx: Int
   private final val mediaMaxHeight: Int
   private final var availableWidth: Int

   init {
      this.context = var1;
      this.spacingPx = var1.getResources().getDimensionPixelSize(dimen.message_media_grid_spacing);
      this.mediaMaxHeight = var1.getResources().getDimensionPixelSize(dimen.message_media_max_height);
   }

   private fun fill(recycler: Recycler?) {
      val var18: Int = 3;
      val var17: Int = 2;
      if (var1 != null) {
         if (this.getChildCount() > 0) {
            try {
               this.detachAndScrapAttachedViews(var1);
            } catch (var20: IllegalArgumentException) {
               val var21: java.lang.String = var20.getMessage();
               if (var21 != null && StringsKt.T(var21, "Scrapped or attached views may not be recycled", false, 2, null)) {
                  val var22: Log = Log.INSTANCE;
                  val var44: java.lang.String = var20.getMessage();
                  val var16: StringBuilder = new StringBuilder();
                  var16.append("Skipping layout due to nested RecyclerView timing conflict: ");
                  var16.append(var44);
                  Log.e$default(var22, "MosaicLayoutManager", var16.toString(), null, 4, null);
                  return;
               }

               throw var20;
            }
         }

         val var8: Int = (this.availableWidth - this.spacingPx * 2) / 3;
         val var13: Int = this.getItemCount();
         var var9: Int = 0;
         var var5: Int = 0;
         var var6: Int = 0;
         var var10: Int = 0;

         while (var9 < var13) {
            var var41: Pair;
            var var3: Int = this.getItemCount();
            label125:
            if (var3 != 1) {
               if (var3 != 2) {
                  if (var3 == 3) {
                     var41 = new Pair;
                     if (var9 == 0) {
                        var41./* $VF: Unable to resugar constructor */<init>(var17, 4);
                     } else {
                        var41./* $VF: Unable to resugar constructor */<init>(var17, var17);
                     }
                     break label125;
                  }

                  if (var3 != 4) {
                     var3 = this.getItemCount() % 3;
                     if (var9 < var3) {
                        var41 = new Pair(var3, 6 / var3);
                     } else {
                        var41 = new Pair(var18, var17);
                     }
                     break label125;
                  }
               }

               var41 = new Pair(var17, var18);
            } else {
               var41 = new Pair(1, 6);
            }

            val var12: Int = (var41.a() as java.lang.Number).intValue();
            val var14: Int = (var41.b() as java.lang.Number).intValue();
            val var19: View = var1.o(var9);
            val var15: Boolean = var19 is MosaicView;
            val var42: MosaicView;
            if (var19 is MosaicView) {
               var42 = var19 as MosaicView;
            } else {
               var42 = null;
            }

            val var2: Float;
            if (var42 != null) {
               var2 = var42.getSingleAspectRatio();
            } else {
               var2 = 1.0F;
            }

            var var28: Int;
            if (this.getItemCount() == 1) {
               var var7: Int = this.availableWidth;
               var3 = (int)(this.availableWidth / var2);
               var28 = this.mediaMaxHeight;
               if (var3 > this.mediaMaxHeight) {
                  var7 = (int)(this.mediaMaxHeight * var2);
               } else {
                  var28 = var3;
               }

               var3 = var5;
               var6 = var7;
               var5 = var28;
               var28 = var6;
            } else {
               if (this.getItemCount() == 3) {
                  if (var9 == 0) {
                     var3 = var8 * 2 + this.spacingPx;
                  } else {
                     var3 = var8;
                  }
               } else {
                  var3 = (this.availableWidth - (var12 - 1) * this.spacingPx) / var12;
               }

               var28 = this.getItemCount();
               if (var28 != 3) {
                  if (var28 != 4 && var12 < 3) {
                     var28 = var8 * 2 + this.spacingPx;
                  } else {
                     var28 = var8;
                  }
               } else {
                  var28 = var3;
               }

               if (this.getItemCount() == 3 && var9 == 2) {
                  var5 = var5 + 4;
                  var6 = var3;
                  val var37: Int = this.spacingPx * 2;
                  var3 = var5;
                  var5 = var28;
                  var28 = var37;
               } else {
                  var28 = var6;
                  var5 = var28;
                  var6 = var3;
                  var3 = var5;
               }
            }

            this.addView(var19);
            this.measureChildWithMargins(var19, 0, 0);
            var var38: Int;
            if (this.getItemCount() == 3) {
               var38 = var12;
            } else {
               var38 = var12 - 1;
            }

            var38 = a.c((float)Math.ceil((double)((float)(this.availableWidth - var38 * this.spacingPx) / 6.0F * (float)var3 + (float)var28)));
            this.layoutDecoratedWithMargins(var19, var38, var10, var38 + var6, var10 + var5);
            val var43: MosaicView;
            if (var15) {
               var43 = var19 as MosaicView;
            } else {
               var43 = null;
            }

            if (var43 != null) {
               var43.setMosaicSize(var6, var5);
            }

            if (this.getItemCount() > 1) {
               var3 = var3 + var14;
               var6 = var28 + this.spacingPx;
               var28 += this.spacingPx;
               if (this.getItemCount() == 3) {
                  var28 = var6 + this.spacingPx;
               }

               if (var3 >= 6) {
                  var10 += this.spacingPx + var5;
                  var5 = 0;
                  var28 = 0;
               } else {
                  var5 = var3;
               }
            } else {
               var5 = var3;
            }

            var9++;
            var6 = var28;
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

   public open fun onLayoutChildren(recycler: Recycler, state: State?) {
      this.fill(var1);
   }

   public fun setAvailableWidth(availableWidth: Int) {
      this.availableWidth = var1;
   }
}
