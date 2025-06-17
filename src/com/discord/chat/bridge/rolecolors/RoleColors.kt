package com.discord.chat.bridge.rolecolors

import kb.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

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
         } else if (!q.c(this.secondaryColor, var1.secondaryColor)) {
            return false;
         } else {
            return q.c(this.tertiaryColor, var1.tertiaryColor);
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
      val var2: Int = this.secondaryColor;
      val var3: Int = this.tertiaryColor;
      val var4: StringBuilder = new StringBuilder();
      var4.append("RoleColors(primaryColor=");
      var4.append(var1);
      var4.append(", secondaryColor=");
      var4.append(var2);
      var4.append(", tertiaryColor=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<RoleColors> {
         return RoleColors.$serializer.INSTANCE;
      }
   }
}
