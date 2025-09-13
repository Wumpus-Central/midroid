package com.discord.chatreplay

import kotlinx.serialization.KSerializer
import pc.m

@m
public data class Replay(filename: String, lastModified: Long) {
   public final val filename: String
   public final val lastModified: Long

   init {
      super();
      this.filename = var1;
      this.lastModified = var2;
   }

   public operator fun component1(): String {
      return this.filename;
   }

   public operator fun component2(): Long {
      return this.lastModified;
   }

   public fun copy(filename: String = var0.filename, lastModified: Long = var0.lastModified): Replay {
      return new Replay(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Replay) {
         return false;
      } else {
         var1 = var1;
         if (!(this.filename == var1.filename)) {
            return false;
         } else {
            return this.lastModified == var1.lastModified;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.filename.hashCode() * 31 + java.lang.Long.hashCode(this.lastModified);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.filename;
      val var1: Long = this.lastModified;
      val var4: StringBuilder = new StringBuilder();
      var4.append("Replay(filename=");
      var4.append(var3);
      var4.append(", lastModified=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<Replay> {
         return Replay.$serializer.INSTANCE;
      }
   }
}
