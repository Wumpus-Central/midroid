package com.discord.activity_invites

import kotlinx.serialization.KSerializer
import xu.m

@m
public data class RGBAColorModel(r: Float, g: Float, b: Float, a: Float) {
   public final val r: Float
   public final val g: Float
   public final val b: Float
   public final val a: Float

   init {
      this.r = var1;
      this.g = var2;
      this.b = var3;
      this.a = var4;
   }

   public operator fun component1(): Float {
      return this.r;
   }

   public operator fun component2(): Float {
      return this.g;
   }

   public operator fun component3(): Float {
      return this.b;
   }

   public operator fun component4(): Float {
      return this.a;
   }

   public fun copy(r: Float = var0.r, g: Float = var0.g, b: Float = var0.b, a: Float = var0.a): RGBAColorModel {
      return new RGBAColorModel(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is RGBAColorModel) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Float.compare(this.r, var1.r) != 0) {
            return false;
         } else if (java.lang.Float.compare(this.g, var1.g) != 0) {
            return false;
         } else if (java.lang.Float.compare(this.b, var1.b) != 0) {
            return false;
         } else {
            return java.lang.Float.compare(this.a, var1.a) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((java.lang.Float.hashCode(this.r) * 31 + java.lang.Float.hashCode(this.g)) * 31 + java.lang.Float.hashCode(this.b)) * 31
         + java.lang.Float.hashCode(this.a);
   }

   public override fun toString(): String {
      val var3: Float = this.r;
      val var1: Float = this.g;
      val var4: Float = this.b;
      val var2: Float = this.a;
      val var5: StringBuilder = new StringBuilder();
      var5.append("RGBAColorModel(r=");
      var5.append(var3);
      var5.append(", g=");
      var5.append(var1);
      var5.append(", b=");
      var5.append(var4);
      var5.append(", a=");
      var5.append(var2);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<RGBAColorModel> {
         return RGBAColorModel.$serializer.INSTANCE;
      }
   }
}
