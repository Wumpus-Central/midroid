package com.discord.span.utilities.common

public data class BorderStyle(color: Int, width: Int) {
   public final val color: Int
   public final val width: Int

   init {
      this.color = var1;
      this.width = var2;
   }

   public operator fun component1(): Int {
      return this.color;
   }

   public operator fun component2(): Int {
      return this.width;
   }

   public fun copy(color: Int = var0.color, width: Int = var0.width): BorderStyle {
      return new BorderStyle(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BorderStyle) {
         return false;
      } else {
         var1 = var1;
         if (this.color != var1.color) {
            return false;
         } else {
            return this.width == var1.width;
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.color) * 31 + Integer.hashCode(this.width);
   }

   public override fun toString(): String {
      val var2: Int = this.color;
      val var1: Int = this.width;
      val var3: StringBuilder = new StringBuilder();
      var3.append("BorderStyle(color=");
      var3.append(var2);
      var3.append(", width=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }
}
