package com.discord.span.utilities.common

import Ka.f
import kotlinx.serialization.KSerializer

@f
public data class BackgroundStyle(backgroundColor: Int, cornerRadius: Int = 0, marginVertical: Int = 0) {
   public final val backgroundColor: Int
   public final val cornerRadius: Int
   public final val marginVertical: Int

   init {
      this.backgroundColor = var1;
      this.cornerRadius = var2;
      this.marginVertical = var3;
   }

   public operator fun component1(): Int {
      return this.backgroundColor;
   }

   public operator fun component2(): Int {
      return this.cornerRadius;
   }

   public operator fun component3(): Int {
      return this.marginVertical;
   }

   public fun copy(backgroundColor: Int = var0.backgroundColor, cornerRadius: Int = var0.cornerRadius, marginVertical: Int = var0.marginVertical): BackgroundStyle {
      return new BackgroundStyle(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BackgroundStyle) {
         return false;
      } else {
         var1 = var1;
         if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (this.cornerRadius != var1.cornerRadius) {
            return false;
         } else {
            return this.marginVertical == var1.marginVertical;
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.backgroundColor) * 31 + Integer.hashCode(this.cornerRadius)) * 31 + Integer.hashCode(this.marginVertical);
   }

   public override fun toString(): String {
      val var3: Int = this.backgroundColor;
      val var1: Int = this.cornerRadius;
      val var2: Int = this.marginVertical;
      val var4: StringBuilder = new StringBuilder();
      var4.append("BackgroundStyle(backgroundColor=");
      var4.append(var3);
      var4.append(", cornerRadius=");
      var4.append(var1);
      var4.append(", marginVertical=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BackgroundStyle> {
         return BackgroundStyle.$serializer.INSTANCE;
      }
   }
}
