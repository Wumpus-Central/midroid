package com.discord.chat.bridge.botuikit

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f

@f
public data class ContentInventoryEntryClickable(ariaDescription: String? = null) {
   public final val ariaDescription: String?

   fun ContentInventoryEntryClickable() {
      this(null, 1, null);
   }

   init {
      this.ariaDescription = var1;
   }

   public operator fun component1(): String? {
      return this.ariaDescription;
   }

   public fun copy(ariaDescription: String? = var0.ariaDescription): ContentInventoryEntryClickable {
      return new ContentInventoryEntryClickable(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContentInventoryEntryClickable) {
         return false;
      } else {
         return q.c(this.ariaDescription, (var1 as ContentInventoryEntryClickable).ariaDescription);
      }
   }

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.ariaDescription == null) {
         var1 = 0;
      } else {
         var1 = this.ariaDescription.hashCode();
      }

      return var1;
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.ariaDescription;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ContentInventoryEntryClickable(ariaDescription=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ContentInventoryEntryClickable> {
         return ContentInventoryEntryClickable.$serializer.INSTANCE;
      }
   }
}
