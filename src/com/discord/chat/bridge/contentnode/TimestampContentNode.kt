package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import mb.g

@g
public data class TimestampContentNode(timestamp: Long, full: String, formatted: String) : ContentNode() {
   public final val timestamp: Long
   public final val full: String
   public final val formatted: String

   init {
      this.timestamp = var1;
      this.full = var3;
      this.formatted = var4;
   }

   public operator fun component1(): Long {
      return this.timestamp;
   }

   public operator fun component2(): String {
      return this.full;
   }

   public operator fun component3(): String {
      return this.formatted;
   }

   public fun copy(timestamp: Long = var0.timestamp, full: String = var0.full, formatted: String = var0.formatted): TimestampContentNode {
      return new TimestampContentNode(var1, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TimestampContentNode) {
         return false;
      } else {
         var1 = var1;
         if (this.timestamp != var1.timestamp) {
            return false;
         } else if (!(this.full == var1.full)) {
            return false;
         } else {
            return this.formatted == var1.formatted;
         }
      }
   }

   public override fun hashCode(): Int {
      return (java.lang.Long.hashCode(this.timestamp) * 31 + this.full.hashCode()) * 31 + this.formatted.hashCode();
   }

   public override fun toString(): String {
      val var1: Long = this.timestamp;
      val var3: java.lang.String = this.full;
      val var4: java.lang.String = this.formatted;
      val var5: StringBuilder = new StringBuilder();
      var5.append("TimestampContentNode(timestamp=");
      var5.append(var1);
      var5.append(", full=");
      var5.append(var3);
      var5.append(", formatted=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TimestampContentNode> {
         return TimestampContentNode.$serializer.INSTANCE;
      }
   }
}
