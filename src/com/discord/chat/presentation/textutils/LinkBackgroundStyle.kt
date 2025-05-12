package com.discord.chat.presentation.textutils

import kotlin.jvm.internal.q

public data class LinkBackgroundStyle(color: Int? = null, borderRadius: Int? = null, spaceAround: Boolean? = java.lang.Boolean.FALSE) {
   public final val borderRadius: Int?
   public final val color: Int?
   public final val spaceAround: Boolean?

   fun LinkBackgroundStyle() {
      this(null, null, null, 7, null);
   }

   init {
      this.color = var1;
      this.borderRadius = var2;
      this.spaceAround = var3;
   }

   public operator fun component1(): Int? {
      return this.color;
   }

   public operator fun component2(): Int? {
      return this.borderRadius;
   }

   public operator fun component3(): Boolean? {
      return this.spaceAround;
   }

   public fun copy(color: Int? = var0.color, borderRadius: Int? = var0.borderRadius, spaceAround: Boolean? = var0.spaceAround): LinkBackgroundStyle {
      return new LinkBackgroundStyle(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LinkBackgroundStyle) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.color, var1.color)) {
            return false;
         } else if (!q.c(this.borderRadius, var1.borderRadius)) {
            return false;
         } else {
            return q.c(this.spaceAround, var1.spaceAround);
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.color == null) {
         var1 = 0;
      } else {
         var1 = this.color.hashCode();
      }

      val var2: Int;
      if (this.borderRadius == null) {
         var2 = 0;
      } else {
         var2 = this.borderRadius.hashCode();
      }

      if (this.spaceAround != null) {
         var3 = this.spaceAround.hashCode();
      }

      return (var1 * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var4: Int = this.color;
      val var2: Int = this.borderRadius;
      val var1: java.lang.Boolean = this.spaceAround;
      val var3: StringBuilder = new StringBuilder();
      var3.append("LinkBackgroundStyle(color=");
      var3.append(var4);
      var3.append(", borderRadius=");
      var3.append(var2);
      var3.append(", spaceAround=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }
}
