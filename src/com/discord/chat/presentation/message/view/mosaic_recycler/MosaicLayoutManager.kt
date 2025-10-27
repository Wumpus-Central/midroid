package com.discord.chat.presentation.message.view.mosaic_recycler

import Ka.a
import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutParams
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.State
import com.discord.chat.R
import com.discord.logging.Log

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
         if (this.getChildCount() > 0) {
            try {
               this.detachAndScrapAttachedViews(var1);
            } catch (var20: IllegalArgumentException) {
               val var21: java.lang.String = var20.getMessage();
               if (var21 != null && StringsKt.N(var21, "Scrapped or attached views may not be recycled", false, 2, null)) {
                  val var22: Log = Log.INSTANCE;
                  val var18: java.lang.String = var20.getMessage();
                  val var19: StringBuilder = new StringBuilder();
                  var19.append("Skipping layout due to nested RecyclerView timing conflict: ");
                  var19.append(var18);
                  Log.e$default(var22, "MosaicLayoutManager", var19.toString(), null, 4, null);
                  return;
               }

               throw var20;
            }
         }

         val var6: Int = (this.availableWidth - this.spacingPx * 2) / 3;
         val var15: Int = this.getItemCount();
         var var25: Int = 0;
         var var11: Int = 0;
         var var10: Int = 0;
         var var23: Int = 0;

         while (var10 < var15) {
            var var34: Pair;
            var var26: Int = this.getItemCount();
            label122:
            if (var26 != 1) {
               if (var26 != 2) {
                  if (var26 == 3) {
                     var34 = new Pair;
                     val var37: Int = 2;
                     if (var10 == 0) {
                        var34./* $VF: Unable to resugar constructor */<init>(var37, 4);
                     } else {
                        var34./* $VF: Unable to resugar constructor */<init>(var37, 2);
                     }
                     break label122;
                  }

                  if (var26 != 4) {
                     var26 = this.getItemCount() % 3;
                     if (var10 < var26) {
                        var34 = new Pair(var26, 6 / var26);
                     } else {
                        var34 = new Pair(3, 2);
                     }
                     break label122;
                  }
               }

               var34 = new Pair(2, 3);
            } else {
               var34 = new Pair(1, 6);
            }

            val var12: Int = (var34.a() as java.lang.Number).intValue();
            val var16: Int = (var34.b() as java.lang.Number).intValue();
            val var38: View = var1.o(var10);
            val var17: Boolean = var38 is MosaicView;
            val var35: MosaicView;
            if (var38 is MosaicView) {
               var35 = var38 as MosaicView;
            } else {
               var35 = null;
            }

            val var2: Float;
            if (var35 != null) {
               var2 = var35.getSingleAspectRatio();
            } else {
               var2 = 1.0F;
            }

            var var7: Int;
            label113: {
               var var8: Int;
               var var9: Int;
               if (this.getItemCount() == 1) {
                  var26 = this.availableWidth;
                  val var14: Int = (int)(this.availableWidth / var2);
                  var9 = var23;
                  var8 = var25;
                  var7 = var14;
                  if (var14 > this.mediaMaxHeight) {
                     var26 = (int)(this.mediaMaxHeight * var2);
                     var7 = this.mediaMaxHeight;
                     break label113;
                  }
               } else {
                  if (this.getItemCount() == 3) {
                     if (var10 == 0) {
                        var26 = var6 * 2 + this.spacingPx;
                     } else {
                        var26 = var6;
                     }
                  } else {
                     var26 = (this.availableWidth - (var12 - 1) * this.spacingPx) / var12;
                  }

                  var7 = this.getItemCount();
                  if (var7 != 3) {
                     if (var7 != 4 && var12 < 3) {
                        var7 = var6 * 2 + this.spacingPx;
                     } else {
                        var7 = var6;
                     }
                  } else {
                     var7 = var26;
                  }

                  var9 = var23;
                  var8 = var25;
                  if (this.getItemCount() == 3) {
                     var9 = var23;
                     var8 = var25;
                     if (var10 == 2) {
                        var9 = var23 + 4;
                        var8 = this.spacingPx * 2;
                     }
                  }
               }

               var23 = var9;
               var25 = var8;
            }

            this.addView(var38);
            this.measureChildWithMargins(var38, 0, 0);
            var var31: Int;
            if (this.getItemCount() == 3) {
               var31 = var12;
            } else {
               var31 = var12 - 1;
            }

            var31 = a.c((float)Math.ceil((double)((float)(this.availableWidth - var31 * this.spacingPx) / 6.0F * (float)var23 + (float)var25)));
            this.layoutDecoratedWithMargins(var38, var31, var11, var31 + var26, var11 + var7);
            val var36: MosaicView;
            if (var17) {
               var36 = var38 as MosaicView;
            } else {
               var36 = null;
            }

            if (var36 != null) {
               var36.setMosaicSize(var26, var7);
            }

            if (this.getItemCount() > 1) {
               var31 = var23 + var16;
               var23 = var25 + this.spacingPx;
               var25 += this.spacingPx;
               if (this.getItemCount() == 3) {
                  var25 = var23 + this.spacingPx;
               }

               var23 = var31;
               var26 = var11;
               if (var31 >= 6) {
                  var26 = var11 + this.spacingPx + var7;
                  var23 = 0;
                  var25 = 0;
               }
            } else {
               var26 = var11;
            }

            var10++;
            var11 = var26;
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
