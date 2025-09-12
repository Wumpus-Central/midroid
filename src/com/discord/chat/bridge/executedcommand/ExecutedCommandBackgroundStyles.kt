package com.discord.chat.bridge.executedcommand

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class ExecutedCommandBackgroundStyles(color: Int? = null, borderRadius: Int? = null, spaceAround: Boolean? = java.lang.Boolean.FALSE) {
   public final val color: Int?
   public final val borderRadius: Int?
   public final val spaceAround: Boolean?

   fun ExecutedCommandBackgroundStyles() {
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

   public fun copy(color: Int? = var0.color, borderRadius: Int? = var0.borderRadius, spaceAround: Boolean? = var0.spaceAround): ExecutedCommandBackgroundStyles {
      return new ExecutedCommandBackgroundStyles(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ExecutedCommandBackgroundStyles) {
         return false;
      } else {
         var1 = var1;
         if (!(this.color == var1.color)) {
            return false;
         } else if (!(this.borderRadius == var1.borderRadius)) {
            return false;
         } else {
            return this.spaceAround == var1.spaceAround;
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
      val var3: Int = this.color;
      val var1: Int = this.borderRadius;
      val var4: java.lang.Boolean = this.spaceAround;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ExecutedCommandBackgroundStyles(color=");
      var2.append(var3);
      var2.append(", borderRadius=");
      var2.append(var1);
      var2.append(", spaceAround=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ExecutedCommandBackgroundStyles> {
         return ExecutedCommandBackgroundStyles.$serializer.INSTANCE;
      }
   }
}
