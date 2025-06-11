package com.discord.chat.bridge.botuikit

import Xa.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class ContentInventoryEntryComponent(type: Int, id: String, contentInventoryEntry: ContentInventoryEntry? = null) : Component {
   public open val type: Int
   public open val id: String
   public final val contentInventoryEntry: ContentInventoryEntry?

   init {
      q.h(var2, "id");
      super(null);
      this.type = var1;
      this.id = var2;
      this.contentInventoryEntry = var3;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public operator fun component3(): ContentInventoryEntry? {
      return this.contentInventoryEntry;
   }

   public fun copy(type: Int = var0.type, id: String = var0.id, contentInventoryEntry: ContentInventoryEntry? = var0.contentInventoryEntry): ContentInventoryEntryComponent {
      q.h(var2, "id");
      return new ContentInventoryEntryComponent(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContentInventoryEntryComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else {
            return q.c(this.contentInventoryEntry, var1.contentInventoryEntry);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = Integer.hashCode(this.type);
      val var3: Int = this.id.hashCode();
      val var1: Int;
      if (this.contentInventoryEntry == null) {
         var1 = 0;
      } else {
         var1 = this.contentInventoryEntry.hashCode();
      }

      return (var2 * 31 + var3) * 31 + var1;
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var4: java.lang.String = this.id;
      val var3: ContentInventoryEntry = this.contentInventoryEntry;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ContentInventoryEntryComponent(type=");
      var2.append(var1);
      var2.append(", id=");
      var2.append(var4);
      var2.append(", contentInventoryEntry=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ContentInventoryEntryComponent> {
         return ContentInventoryEntryComponent.$serializer.INSTANCE;
      }
   }
}
