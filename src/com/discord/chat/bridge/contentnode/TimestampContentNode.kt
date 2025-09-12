package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import pc.m

@m
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
      val var5: java.lang.String = this.formatted;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TimestampContentNode(timestamp=");
      var4.append(var1);
      var4.append(", full=");
      var4.append(var3);
      var4.append(", formatted=");
      var4.append(var5);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TimestampContentNode> {
         return TimestampContentNode.$serializer.INSTANCE;
      }
   }
}
