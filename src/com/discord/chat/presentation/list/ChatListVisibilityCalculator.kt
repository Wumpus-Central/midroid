package com.discord.chat.presentation.list

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

internal class ChatListVisibilityCalculator {
   public final var firstMessagePosition: Int = -1
      private set

   public final var firstMessagePercentVisible: Double?
      private set

   public final var lastMessagePosition: Int = -1
      private set

   public final var lastMessagePercentVisible: Double?
      private set

   private fun floorToOneDecimal(number: Double): Double {
      return Math.floor(var1 * (double)10) / 10;
   }

   private fun getItemPercentVisible(recyclerView: RecyclerView, position: Int): Double {
      val var7: RecyclerView.LayoutManager = var1.getLayoutManager();
      kotlin.jvm.internal.r.f(var7, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
      val var10: View = (var7 as LinearLayoutManager).findViewByPosition(var2);
      var var3: Double = 0.0;
      if (var10 == null) {
         return 0.0;
      } else {
         val var6: Int = Math.min(var10.getTop(), var10.getBottom());
         var var5: Int = Math.max(var10.getTop(), var10.getBottom());
         var2 = var5 - var6;
         var5 = this.intersectIntervals(0, var1.getHeight(), var6, var5);
         if (var2 > 0) {
            var3 = (double)var5 / var2;
         }

         return this.floorToOneDecimal(var3);
      }
   }

   private fun intersectIntervals(min1: Int, max1: Int, min2: Int, max2: Int): Int {
      var1 = Math.max(var1, var3);
      var2 = Math.min(var2, var4);
      if (var1 <= var2) {
         var1 = var2 - var1;
      } else {
         var1 = 0;
      }

      return var1;
   }

   private fun resetVisibilityData() {
      this.firstMessagePosition = -1;
      this.firstMessagePercentVisible = null;
      this.lastMessagePosition = -1;
      this.lastMessagePercentVisible = null;
   }

   public fun updateFirstAndLastMessageVisibilityData(recyclerView: RecyclerView) {
      kotlin.jvm.internal.r.h(var1, "recyclerView");
      this.resetVisibilityData();
      val var7: RecyclerView.LayoutManager = var1.getLayoutManager();
      kotlin.jvm.internal.r.f(var7, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
      val var5: Int = (var7 as LinearLayoutManager).findFirstVisibleItemPosition();
      val var6: Int = (var7 as LinearLayoutManager).findLastVisibleItemPosition();
      if (var5 != -1 && var6 != -1) {
         if (var5 <= var6) {
            var var4: Int = var5;

            while (true) {
               val var2: Double = this.getItemPercentVisible(var1, var4);
               if (var2 > 0.0 && this.firstMessagePosition == -1) {
                  this.firstMessagePosition = var4;
                  this.firstMessagePercentVisible = var2;
               }

               if (var4 == var6) {
                  break;
               }

               var4++;
            }
         }

         if (var5 <= var6) {
            var var9: Int = var6;

            while (true) {
               val var8: Double = this.getItemPercentVisible(var1, var9);
               if (var8 > 0.0 && this.lastMessagePosition == -1) {
                  this.lastMessagePosition = var9;
                  this.lastMessagePercentVisible = var8;
               }

               if (var9 == var5) {
                  break;
               }

               var9--;
            }
         }
      }
   }
}
