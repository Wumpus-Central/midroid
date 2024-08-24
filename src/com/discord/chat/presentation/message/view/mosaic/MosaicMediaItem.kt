package com.discord.chat.presentation.message.view.mosaic

import kotlin.jvm.internal.r

public data class MosaicMediaItem<T>(uniqueId: Long, originalItem: Any) {
   public final val originalItem: Any
   public final val uniqueId: Long

   init {
      this.uniqueId = var1;
      this.originalItem = (T)var3;
   }

   public operator fun component1(): Long {
      return this.uniqueId;
   }

   public operator fun component2(): Any {
      return this.originalItem;
   }

   public fun copy(uniqueId: Long = var0.uniqueId, originalItem: Any = var0.originalItem): MosaicMediaItem<Any> {
      return new MosaicMediaItem<>(var1, (T)var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MosaicMediaItem) {
         return false;
      } else {
         var1 = var1;
         if (this.uniqueId != var1.uniqueId) {
            return false;
         } else {
            return r.c(this.originalItem, var1.originalItem);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = java.lang.Long.hashCode(this.uniqueId);
      val var1: Int;
      if (this.originalItem == null) {
         var1 = 0;
      } else {
         var1 = this.originalItem.hashCode();
      }

      return var2 * 31 + var1;
   }

   public override fun toString(): String {
      val var1: Long = this.uniqueId;
      val var3: Any = this.originalItem;
      val var4: StringBuilder = new StringBuilder();
      var4.append("MosaicMediaItem(uniqueId=");
      var4.append(var1);
      var4.append(", originalItem=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }
}
