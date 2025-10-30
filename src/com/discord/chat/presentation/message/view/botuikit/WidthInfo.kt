package com.discord.chat.presentation.message.view.botuikit

import com.discord.misc.utilities.size.SizeUtilsKt

public data class WidthInfo(topLevelAvailableWidth: Int, topLevelMaxWidth: Int, widthReductions: Int = 0) {
   public final val topLevelAvailableWidth: Int
   public final val topLevelMaxWidth: Int
   internal final val widthReductions: Int

   public final val availableWidth: Int
      public final get() {
         return this.getTopLevelWidth() - this.widthReductions;
      }


   public final val isLargeWidthRenderingMode: Boolean
      public final get() {
         return this.getTopLevelWidth() > SizeUtilsKt.getDpToPx(480) && this.getAvailableWidth() >= SizeUtilsKt.getDpToPx(440);
      }


   public final val shouldRestrictTopLevelWidth: Boolean
      public final get() {
         return this.topLevelAvailableWidth > this.topLevelMaxWidth;
      }


   private final val topLevelWidth: Int
      private final get() {
         return Math.min(this.topLevelAvailableWidth, this.topLevelMaxWidth);
      }


   init {
      this.topLevelAvailableWidth = var1;
      this.topLevelMaxWidth = var2;
      this.widthReductions = var3;
   }

   public operator fun component1(): Int {
      return this.topLevelAvailableWidth;
   }

   public operator fun component2(): Int {
      return this.topLevelMaxWidth;
   }

   internal operator fun component3(): Int {
      return this.widthReductions;
   }

   public fun copy(
      topLevelAvailableWidth: Int = var0.topLevelAvailableWidth,
      topLevelMaxWidth: Int = var0.topLevelMaxWidth,
      widthReductions: Int = var0.widthReductions
   ): WidthInfo {
      return new WidthInfo(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is WidthInfo) {
         return false;
      } else {
         var1 = var1;
         if (this.topLevelAvailableWidth != var1.topLevelAvailableWidth) {
            return false;
         } else if (this.topLevelMaxWidth != var1.topLevelMaxWidth) {
            return false;
         } else {
            return this.widthReductions == var1.widthReductions;
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.topLevelAvailableWidth) * 31 + Integer.hashCode(this.topLevelMaxWidth)) * 31 + Integer.hashCode(this.widthReductions);
   }

   public override fun toString(): String {
      val var3: Int = this.topLevelAvailableWidth;
      val var1: Int = this.topLevelMaxWidth;
      val var2: Int = this.widthReductions;
      val var4: StringBuilder = new StringBuilder();
      var4.append("WidthInfo(topLevelAvailableWidth=");
      var4.append(var3);
      var4.append(", topLevelMaxWidth=");
      var4.append(var1);
      var4.append(", widthReductions=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }
}
