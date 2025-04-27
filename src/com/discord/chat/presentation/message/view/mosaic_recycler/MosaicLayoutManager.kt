package com.discord.chat.presentation.message.view.mosaic_recycler

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutParams
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.State
import com.discord.chat.R
import com.discord.chat.presentation.message.MessageAccessoriesView
import kotlin.jvm.internal.q

public class MosaicLayoutManager(context: Context) : RecyclerView.LayoutManager {
   private final var constrainedWidth: Int
   public final val context: Context
   private final var isForwardedContent: Boolean
   private final val mediaMaxHeight: Int
   private final val spacingPx: Int

   init {
      q.h(var1, "context");
      super();
      this.context = var1;
      this.spacingPx = var1.getResources().getDimensionPixelSize(R.dimen.message_media_grid_spacing);
      this.mediaMaxHeight = var1.getResources().getDimensionPixelSize(R.dimen.message_media_max_height);
   }

   private fun fill(recycler: Recycler?) {
      if (var1 != null) {
         this.detachAndScrapAttachedViews(var1);
         val var8: Int = MessageAccessoriesView.Companion.getWidth(this.constrainedWidth, this.isForwardedContent);
         val var5: Int = (var8 - this.spacingPx * 2) / 3;
         val var9: Int = this.getItemCount();
         var var19: Int = 0;
         var var4: Int = 0;
         var var10: Int = 0;

         for (int var11 = 0; var10 < var9; var10++) {
            var var16: Pair;
            var var6: Int = this.getItemCount();
            label106:
            if (var6 != 1) {
               if (var6 != 2) {
                  if (var6 == 3) {
                     var16 = new Pair;
                     val var17: Int = 2;
                     if (var10 == 0) {
                        var16./* $VF: Unable to resugar constructor */<init>(var17, 4);
                     } else {
                        var16./* $VF: Unable to resugar constructor */<init>(var17, 2);
                     }
                     break label106;
                  }

                  if (var6 != 4) {
                     var6 = this.getItemCount() % 3;
                     if (var10 < var6) {
                        var16 = new Pair(var6, 6 / var6);
                     } else {
                        var16 = new Pair(3, 2);
                     }
                     break label106;
                  }
               }

               var16 = new Pair(2, 3);
            } else {
               var16 = new Pair(1, 6);
            }

            val var13: Int = (var16.a() as java.lang.Number).intValue();
            val var14: Int = (var16.b() as java.lang.Number).intValue();
            val var18: View = var1.o(var10);
            q.g(var18, "getViewForPosition(...)");
            val var15: Boolean = var18 is MosaicView;
            val var30: MosaicView;
            if (var18 is MosaicView) {
               var30 = var18 as MosaicView;
            } else {
               var30 = null;
            }

            val var2: Float;
            if (var30 != null) {
               var2 = var30.getSingleAspectRatio();
            } else {
               var2 = 1.0F;
            }

            var var7: Int;
            if (this.getItemCount() == 1) {
               val var12: Int = (int)(var8 / var2);
               var6 = this.mediaMaxHeight;
               if (var12 > this.mediaMaxHeight) {
                  var7 = (int)(this.mediaMaxHeight * var2);
               } else {
                  var7 = var8;
                  var6 = var12;
               }
            } else {
               if (this.getItemCount() == 3) {
                  if (var10 == 0) {
                     var6 = var5 * 2 + this.spacingPx;
                  } else {
                     var6 = var5;
                  }
               } else {
                  var6 = (var8 - (var13 - 1) * this.spacingPx) / var13;
               }

               var7 = this.getItemCount();
               if (var7 != 3) {
                  if (var7 != 4 && var13 < 3) {
                     var7 = var5 * 2 + this.spacingPx;
                  } else {
                     var7 = var5;
                  }
               } else {
                  var7 = var6;
               }

               if (this.getItemCount() == 3 && var10 == 2) {
                  var19 += 4;
                  var4 = this.spacingPx * 2;
               }

               var7 = var6;
               var6 = var7;
            }

            this.addView(var18);
            this.measureChildWithMargins(var18, 0, 0);
            var var28: Int;
            if (this.getItemCount() == 3) {
               var28 = var13;
            } else {
               var28 = var13 - 1;
            }

            var28 = v8.a.c((float)Math.ceil((double)((float)(var8 - var28 * this.spacingPx) / 6.0F * (float)var19 + (float)var4)));
            this.layoutDecoratedWithMargins(var18, var28, var11, var28 + var7, var11 + var6);
            var var31: MosaicView = null;
            if (var15) {
               var31 = var18 as MosaicView;
            }

            if (var31 != null) {
               var31.setMosaicSize(var7, var6);
            }

            if (this.getItemCount() > 1) {
               var7 = var19 + var14;
               var19 = var4 + this.spacingPx;
               var4 += this.spacingPx;
               if (this.getItemCount() == 3) {
                  var4 = var19 + this.spacingPx;
               }

               var19 = var7;
               if (var7 >= 6) {
                  var11 += this.spacingPx + var6;
                  var19 = 0;
                  var4 = 0;
               }
            }
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
      q.h(var1, "recycler");
      this.fill(var1);
   }

   public fun setConstrainedWidth(constrainedWidth: Int) {
      this.constrainedWidth = var1;
   }

   public fun setIsForwardedContent(isForwardedContent: Boolean) {
      this.isForwardedContent = var1;
   }
}
