package com.discord.notifications.api

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class PollMedia(text: String) {
   public final val text: String

   init {
      super();
      this.text = var1;
   }

   public operator fun component1(): String {
      return this.text;
   }

   public fun copy(text: String = var0.text): PollMedia {
      return new PollMedia(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollMedia) {
         return false;
      } else {
         return this.text == (var1 as PollMedia).text;
      }
   }

   public override fun hashCode(): Int {
      return this.text.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.text;
      val var1: StringBuilder = new StringBuilder();
      var1.append("PollMedia(text=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PollMedia> {
         return PollMedia.$serializer.INSTANCE;
      }
   }
}
