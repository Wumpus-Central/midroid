package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import xu.m

@m
public data class CheckpointCardClickable(ariaDescription: String) {
   public final val ariaDescription: String

   init {
      super();
      this.ariaDescription = var1;
   }

   public operator fun component1(): String {
      return this.ariaDescription;
   }

   public fun copy(ariaDescription: String = var0.ariaDescription): CheckpointCardClickable {
      return new CheckpointCardClickable(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CheckpointCardClickable) {
         return false;
      } else {
         return this.ariaDescription == (var1 as CheckpointCardClickable).ariaDescription;
      }
   }

   public override fun hashCode(): Int {
      return this.ariaDescription.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.ariaDescription;
      val var2: StringBuilder = new StringBuilder();
      var2.append("CheckpointCardClickable(ariaDescription=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<CheckpointCardClickable> {
         return CheckpointCardClickable.$serializer.INSTANCE;
      }
   }
}
