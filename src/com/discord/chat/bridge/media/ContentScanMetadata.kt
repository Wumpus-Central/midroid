package com.discord.chat.bridge.media

import kb.f
import kotlinx.serialization.KSerializer

@f
public data class ContentScanMetadata(version: Int, flags: Long) {
   public final val version: Int
   public final val flags: Long

   init {
      super();
      this.version = var1;
      this.flags = var2;
   }

   public operator fun component1(): Int {
      return this.version;
   }

   public operator fun component2(): Long {
      return this.flags;
   }

   public fun copy(version: Int = var0.version, flags: Long = var0.flags): ContentScanMetadata {
      return new ContentScanMetadata(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContentScanMetadata) {
         return false;
      } else {
         var1 = var1;
         if (this.version != var1.version) {
            return false;
         } else {
            return this.flags == var1.flags;
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.version) * 31 + java.lang.Long.hashCode(this.flags);
   }

   public override fun toString(): String {
      val var1: Int = this.version;
      val var2: Long = this.flags;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ContentScanMetadata(version=");
      var4.append(var1);
      var4.append(", flags=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ContentScanMetadata> {
         return ContentScanMetadata.$serializer.INSTANCE;
      }
   }
}
