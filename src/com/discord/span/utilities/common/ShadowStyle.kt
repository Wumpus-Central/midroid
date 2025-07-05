package com.discord.span.utilities.common

import android.util.SizeF
import kotlin.jvm.internal.r

public data class ShadowStyle(color: Int, radius: Float, offset: SizeF) {
   public final val color: Int
   public final val radius: Float
   public final val offset: SizeF

   init {
      r.h(var3, "offset");
      super();
      this.color = var1;
      this.radius = var2;
      this.offset = var3;
   }

   public operator fun component1(): Int {
      return this.color;
   }

   public operator fun component2(): Float {
      return this.radius;
   }

   public operator fun component3(): SizeF {
      return this.offset;
   }

   public fun copy(color: Int = var0.color, radius: Float = var0.radius, offset: SizeF = var0.offset): ShadowStyle {
      r.h(var3, "offset");
      return new ShadowStyle(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ShadowStyle) {
         return false;
      } else {
         var1 = var1;
         if (this.color != var1.color) {
            return false;
         } else if (java.lang.Float.compare(this.radius, var1.radius) != 0) {
            return false;
         } else {
            return r.c(this.offset, var1.offset);
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.color) * 31 + java.lang.Float.hashCode(this.radius)) * 31 + this.offset.hashCode();
   }

   public override fun toString(): String {
      val var2: Int = this.color;
      val var1: Float = this.radius;
      val var3: SizeF = this.offset;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ShadowStyle(color=");
      var4.append(var2);
      var4.append(", radius=");
      var4.append(var1);
      var4.append(", offset=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }
}
