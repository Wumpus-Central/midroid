package com.discord.chat.bridge

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class BackgroundHighlight(backgroundColor: Int? = null, gutterColor: Int? = null) {
   public final val backgroundColor: Int?
   public final val gutterColor: Int?

   fun BackgroundHighlight() {
      this(null, null, 3, null);
   }

   init {
      this.backgroundColor = var1;
      this.gutterColor = var2;
   }

   public operator fun component1(): Int? {
      return this.backgroundColor;
   }

   public operator fun component2(): Int? {
      return this.gutterColor;
   }

   public fun copy(backgroundColor: Int? = var0.backgroundColor, gutterColor: Int? = var0.gutterColor): BackgroundHighlight {
      return new BackgroundHighlight(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BackgroundHighlight) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.backgroundColor, var1.backgroundColor)) {
            return false;
         } else {
            return r.c(this.gutterColor, var1.gutterColor);
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.backgroundColor == null) {
         var1 = 0;
      } else {
         var1 = this.backgroundColor.hashCode();
      }

      if (this.gutterColor != null) {
         var2 = this.gutterColor.hashCode();
      }

      return var1 * 31 + var2;
   }

   public override fun toString(): String {
      val var3: Int = this.backgroundColor;
      val var2: Int = this.gutterColor;
      val var1: StringBuilder = new StringBuilder();
      var1.append("BackgroundHighlight(backgroundColor=");
      var1.append(var3);
      var1.append(", gutterColor=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BackgroundHighlight> {
         return BackgroundHighlight.$serializer.INSTANCE;
      }
   }
}
