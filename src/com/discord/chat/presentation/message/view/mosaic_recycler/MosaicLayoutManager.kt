package com.discord.chat.presentation.message.view.mosaic_recycler

import Pa.a
import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutParams
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.State
import com.discord.chat.R

public class MosaicLayoutManager(context: Context) : RecyclerView.LayoutManager {
   public final val context: Context
   private final val spacingPx: Int
   private final val mediaMaxHeight: Int
   private final var availableWidth: Int

   init {
      this.context = var1;
      this.spacingPx = var1.getResources().getDimensionPixelSize(R.dimen.message_media_grid_spacing);
      this.mediaMaxHeight = var1.getResources().getDimensionPixelSize(R.dimen.message_media_max_height);
   }

   private fun fill(recycler: Recycler?) {
      if (var1 != null) {
         this.detachAndScrapAttachedViews(var1);
         val var10: Int = (this.availableWidth - this.spacingPx * 2) / 3;
         val var14: Int = this.getItemCount();
         var var6: Int = 0;
         var var5: Int = 0;
         var var11: Int = 0;
         var var12: Int = 0;

         while (var11 < var14) {
            var var17: Pair;
            var var20: Int = this.getItemCount();
            label108:
            if (var20 != 1) {
               if (var20 != 2) {
                  if (var20 == 3) {
                     var17 = new Pair;
                     val var18: Int = 2;
                     if (var11 == 0) {
                        var17./* $VF: Unable to resugar constructor */<init>(var18, 4);
                     } else {
                        var17./* $VF: Unable to resugar constructor */<init>(var18, 2);
                     }
                     break label108;
                  }

                  if (var20 != 4) {
                     var20 = this.getItemCount() % 3;
                     if (var11 < var20) {
                        var17 = new Pair(var20, 6 / var20);
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
            val var16: Boolean = var19 is MosaicView;
            val var36: MosaicView;
            if (var19 is MosaicView) {
               var36 = var19 as MosaicView;
            } else {
               var36 = null;
            }

            val var2: Float;
            if (var36 != null) {
               var2 = var36.getSingleAspectRatio();
            } else {
               var2 = 1.0F;
            }

            var var26: Int;
            label99: {
               var var7: Int;
               var var8: Int;
               var var9: Int;
               label98: {
                  if (this.getItemCount() == 1) {
                     var7 = this.availableWidth;
                     var26 = (int)(this.availableWidth / var2);
                     var8 = (int)(this.availableWidth / var2);
                     if (var26 > this.mediaMaxHeight) {
                        var7 = (int)(this.mediaMaxHeight * var2);
                        var26 = var6;
                        var20 = var5;
                        var5 = this.mediaMaxHeight;
                        var6 = var7;
                        break label99;
                     }
                  } else {
                     if (this.getItemCount() == 3) {
                        if (var11 == 0) {
                           var20 = var10 * 2 + this.spacingPx;
                        } else {
                           var20 = var10;
                        }
                     } else {
                        var20 = (this.availableWidth - (var13 - 1) * this.spacingPx) / var13;
                     }

                     var26 = this.getItemCount();
                     if (var26 != 3) {
                        if (var26 != 4 && var13 < 3) {
                           var26 = var10 * 2 + this.spacingPx;
                        } else {
                           var26 = var10;
                        }
                     } else {
                        var26 = var20;
                     }

                     var7 = var20;
                     var8 = var26;
                     if (this.getItemCount() == 3) {
                        var9 = var6;
                        var7 = var20;
                        var8 = var26;
                        if (var11 == 2) {
                           var9 = var6 + 4;
                           var5 = this.spacingPx * 2;
                           var7 = var20;
                           var8 = var26;
                        }
                        break label98;
                     }
                  }

                  var9 = var6;
               }

               var26 = var9;
               var20 = var5;
               var6 = var7;
               var5 = var8;
            }

            this.addView(var19);
            this.measureChildWithMargins(var19, 0, 0);
            var var34: Int;
            if (this.getItemCount() == 3) {
               var34 = var13;
            } else {
               var34 = var13 - 1;
            }

            var34 = a.c((float)Math.ceil((double)((float)(this.availableWidth - var34 * this.spacingPx) / 6.0F * (float)var26 + (float)var20)));
            this.layoutDecoratedWithMargins(var19, var34, var12, var34 + var6, var12 + var5);
            var var37: MosaicView = null;
            if (var16) {
               var37 = var19 as MosaicView;
            }

            if (var37 != null) {
               var37.setMosaicSize(var6, var5);
            }

            if (this.getItemCount() > 1) {
               var6 = var26 + var15;
               var26 = var20 + this.spacingPx;
               var20 += this.spacingPx;
               if (this.getItemCount() == 3) {
                  var20 = var26 + this.spacingPx;
               }

               if (var6 >= 6) {
                  var12 += this.spacingPx + var5;
                  var6 = 0;
                  var20 = 0;
               }
            } else {
               var6 = var26;
            }

            var11++;
            var5 = var20;
         }
      }
   }

   public override fun canScrollHorizontally(): Boolean {
      return false;
   }

   public override fun canScrollVertically(): Boolean {
      return false;
   }

   public override fun generateDefaultLayoutParams(): LayoutParams {
      return new RecyclerView.LayoutParams(-2, -2);
   }

   public override fun isAutoMeasureEnabled(): Boolean {
      return true;
   }

   public override fun onLayoutChildren(recycler: Recycler, state: State?) {
      this.fill(var1);
   }

   public fun setAvailableWidth(availableWidth: Int) {
      this.availableWidth = var1;
   }
}
