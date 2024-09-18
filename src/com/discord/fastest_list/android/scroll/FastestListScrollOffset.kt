package com.discord.fastest_list.android.scroll

import android.view.View
import com.discord.fastest_list.android.FastestListLayoutManager
import com.discord.fastest_list.android.FastestListSections
import kotlin.jvm.internal.q

internal class FastestListScrollOffset(layoutManager: FastestListLayoutManager, sections: FastestListSections) {
   private final var data: com.discord.fastest_list.android.scroll.FastestListScrollOffset.Data
   private final val layoutManager: FastestListLayoutManager
   private final val sections: FastestListSections

   init {
      q.h(var1, "layoutManager");
      q.h(var2, "sections");
      super();
      this.layoutManager = var1;
      this.sections = var2;
      this.data = new FastestListScrollOffset.Data(0, 0, 0, 0, 0, 0, 63, null);
   }

   private fun computeScrollOffset(firstVisibleItemPosition: Int, firstVisibleItemView: View, horizontal: Boolean): com.discord.fastest_list.android.scroll.FastestListScrollOffset.Data {
      var var4: Int = this.sections.getItemOffset(var1);
      if (var3) {
         var1 = Math.abs(var2.getLeft() - this.layoutManager.getPaddingLeft());
      } else {
         var1 = Math.abs(var2.getTop() - this.layoutManager.getPaddingTop());
      }

      var1 = var4 + var1;
      val var7: FastestListScrollOffset.Data = this.data;
      if (var3) {
         var4 = var1;
      } else {
         var4 = 0;
      }

      this.data.setX(var4);
      if (var3) {
         var1 = 0;
      }

      var7.setY(var1);
      var7.setWidth(this.layoutManager.getWidth());
      var7.setHeight(this.layoutManager.getHeight());
      var7.setContentWidth(this.getContentWidth());
      var7.setContentHeight(this.getContentHeight());
      return var7;
   }

   private fun getContentHeight(): Int {
      val var1: Int;
      if (!this.layoutManager.getHorizontal()) {
         var1 = this.sections.getItemCumulativeSize();
      } else {
         var1 = this.layoutManager.getHeight();
      }

      return var1;
   }

   private fun getContentWidth(): Int {
      val var1: Int;
      if (this.layoutManager.getHorizontal()) {
         var1 = this.sections.getItemCumulativeSize();
      } else {
         var1 = this.layoutManager.getWidth();
      }

      return var1;
   }

   public fun compute(): com.discord.fastest_list.android.scroll.FastestListScrollOffset.Data? {
      val var1: Int = this.layoutManager.findFirstVisibleItemPosition();
      if (var1 != -1) {
         val var2: View = this.layoutManager.findViewByPosition(var1);
         if (var2 != null) {
            return this.computeScrollOffset(var1, var2, this.layoutManager.getHorizontal());
         }
      }

      return null;
   }

   public data class Data(x: Int = 0, y: Int = 0, width: Int = 0, height: Int = 0, contentWidth: Int = 0, contentHeight: Int = 0) {
      public final var contentHeight: Int
         internal set

      public final var contentWidth: Int
         internal set

      public final var height: Int
         internal set

      public final var width: Int
         internal set

      public final var x: Int
         internal set

      public final var y: Int
         internal set

      fun Data() {
         this(0, 0, 0, 0, 0, 0, 63, null);
      }

      init {
         this.x = var1;
         this.y = var2;
         this.width = var3;
         this.height = var4;
         this.contentWidth = var5;
         this.contentHeight = var6;
      }

      public operator fun component1(): Int {
         return this.x;
      }

      public operator fun component2(): Int {
         return this.y;
      }

      public operator fun component3(): Int {
         return this.width;
      }

      public operator fun component4(): Int {
         return this.height;
      }

      public operator fun component5(): Int {
         return this.contentWidth;
      }

      public operator fun component6(): Int {
         return this.contentHeight;
      }

      public fun copy(
         x: Int = var0.x,
         y: Int = var0.y,
         width: Int = var0.width,
         height: Int = var0.height,
         contentWidth: Int = var0.contentWidth,
         contentHeight: Int = var0.contentHeight
      ): com.discord.fastest_list.android.scroll.FastestListScrollOffset.Data {
         return new FastestListScrollOffset.Data(var1, var2, var3, var4, var5, var6);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is FastestListScrollOffset.Data) {
            return false;
         } else {
            var1 = var1;
            if (this.x != var1.x) {
               return false;
            } else if (this.y != var1.y) {
               return false;
            } else if (this.width != var1.width) {
               return false;
            } else if (this.height != var1.height) {
               return false;
            } else if (this.contentWidth != var1.contentWidth) {
               return false;
            } else {
               return this.contentHeight == var1.contentHeight;
            }
         }
      }

      public override fun hashCode(): Int {
         return (
                  (((Integer.hashCode(this.x) * 31 + Integer.hashCode(this.y)) * 31 + Integer.hashCode(this.width)) * 31 + Integer.hashCode(this.height)) * 31
                     + Integer.hashCode(this.contentWidth)
               )
               * 31
            + Integer.hashCode(this.contentHeight);
      }

      public override fun toString(): String {
         val var2: Int = this.x;
         val var4: Int = this.y;
         val var6: Int = this.width;
         val var5: Int = this.height;
         val var3: Int = this.contentWidth;
         val var1: Int = this.contentHeight;
         val var7: StringBuilder = new StringBuilder();
         var7.append("Data(x=");
         var7.append(var2);
         var7.append(", y=");
         var7.append(var4);
         var7.append(", width=");
         var7.append(var6);
         var7.append(", height=");
         var7.append(var5);
         var7.append(", contentWidth=");
         var7.append(var3);
         var7.append(", contentHeight=");
         var7.append(var1);
         var7.append(")");
         return var7.toString();
      }
   }
}
