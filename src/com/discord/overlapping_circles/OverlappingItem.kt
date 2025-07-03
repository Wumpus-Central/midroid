package com.discord.overlapping_circles

import kotlin.jvm.internal.r

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
         return r.c(this.imageUri, (var1 as OverlappingItem).imageUri);
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
      val var1: java.lang.String = this.imageUri;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OverlappingItem(imageUri=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
