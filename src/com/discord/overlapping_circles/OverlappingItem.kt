package com.discord.overlapping_circles

import kotlin.jvm.internal.q

public data class OverlappingItem(imageUri: String?) {
   public final val imageUri: String?

   init {
      this.imageUri = var1;
   }

   public operator fun component1(): String? {
      return this.imageUri;
   }

   public fun copy(imageUri: String? = var0.imageUri): OverlappingItem {
      return new OverlappingItem(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OverlappingItem) {
         return false;
      } else {
         return q.c(this.imageUri, (var1 as OverlappingItem).imageUri);
      }
   }

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.imageUri == null) {
         var1 = 0;
      } else {
         var1 = this.imageUri.hashCode();
      }

      return var1;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.imageUri;
      val var1: StringBuilder = new StringBuilder();
      var1.append("OverlappingItem(imageUri=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
