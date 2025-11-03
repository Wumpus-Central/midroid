package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import xu.m

@m
public data class GradientColor(r: Int, g: Int, b: Int, a: Float) {
   public final val r: Int
   public final val g: Int
   public final val b: Int
   public final val a: Float

   init {
      this.r = var1;
      this.g = var2;
      this.b = var3;
      this.a = var4;
   }

   public operator fun component1(): Int {
      return this.r;
   }

   public operator fun component2(): Int {
      return this.g;
   }

   public operator fun component3(): Int {
      return this.b;
   }

   public operator fun component4(): Float {
      return this.a;
   }

   public fun copy(r: Int = var0.r, g: Int = var0.g, b: Int = var0.b, a: Float = var0.a): GradientColor {
      return new GradientColor(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GradientColor) {
         return false;
      } else {
         var1 = var1;
         if (this.r != var1.r) {
            return false;
         } else if (this.g != var1.g) {
            return false;
         } else if (this.b != var1.b) {
            return false;
         } else {
            return java.lang.Float.compare(this.a, var1.a) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((Integer.hashCode(this.r) * 31 + Integer.hashCode(this.g)) * 31 + Integer.hashCode(this.b)) * 31 + java.lang.Float.hashCode(this.a);
   }

   public override fun toString(): String {
      val var2: Int = this.r;
      val var3: Int = this.g;
      val var4: Int = this.b;
      val var1: Float = this.a;
      val var5: StringBuilder = new StringBuilder();
      var5.append("GradientColor(r=");
      var5.append(var2);
      var5.append(", g=");
      var5.append(var3);
      var5.append(", b=");
      var5.append(var4);
      var5.append(", a=");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<GradientColor> {
         return GradientColor.$serializer.INSTANCE;
      }
   }
}
