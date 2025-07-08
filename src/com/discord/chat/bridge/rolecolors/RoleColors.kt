package com.discord.chat.bridge.rolecolors

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class RoleColors(primaryColor: Int, secondaryColor: Int? = null, tertiaryColor: Int? = null) {
   public final val primaryColor: Int
   public final val secondaryColor: Int?
   public final val tertiaryColor: Int?

   init {
      super();
      this.primaryColor = var1;
      this.secondaryColor = var2;
      this.tertiaryColor = var3;
   }

   public operator fun component1(): Int {
      return this.primaryColor;
   }

   public operator fun component2(): Int? {
      return this.secondaryColor;
   }

   public operator fun component3(): Int? {
      return this.tertiaryColor;
   }

   public fun copy(primaryColor: Int = var0.primaryColor, secondaryColor: Int? = var0.secondaryColor, tertiaryColor: Int? = var0.tertiaryColor): RoleColors {
      return new RoleColors(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is RoleColors) {
         return false;
      } else {
         var1 = var1;
         if (this.primaryColor != var1.primaryColor) {
            return false;
         } else if (!r.c(this.secondaryColor, var1.secondaryColor)) {
            return false;
         } else {
            return r.c(this.tertiaryColor, var1.tertiaryColor);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = Integer.hashCode(this.primaryColor);
      var var2: Int = 0;
      val var1: Int;
      if (this.secondaryColor == null) {
         var1 = 0;
      } else {
         var1 = this.secondaryColor.hashCode();
      }

      if (this.tertiaryColor != null) {
         var2 = this.tertiaryColor.hashCode();
      }

      return (var3 * 31 + var1) * 31 + var2;
   }

   public override fun toString(): String {
      val var1: Int = this.primaryColor;
      val var4: Int = this.secondaryColor;
      val var2: Int = this.tertiaryColor;
      val var3: StringBuilder = new StringBuilder();
      var3.append("RoleColors(primaryColor=");
      var3.append(var1);
      var3.append(", secondaryColor=");
      var3.append(var4);
      var3.append(", tertiaryColor=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<RoleColors> {
         return RoleColors.$serializer.INSTANCE;
      }
   }
}
