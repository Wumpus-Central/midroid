package com.discord.chat.bridge

import Xa.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
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
         if (!q.c(this.backgroundColor, var1.backgroundColor)) {
            return false;
         } else {
            return q.c(this.gutterColor, var1.gutterColor);
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
      val var1: Int = this.backgroundColor;
      val var3: Int = this.gutterColor;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BackgroundHighlight(backgroundColor=");
      var2.append(var1);
      var2.append(", gutterColor=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BackgroundHighlight> {
         return BackgroundHighlight.$serializer.INSTANCE;
      }
   }
}
