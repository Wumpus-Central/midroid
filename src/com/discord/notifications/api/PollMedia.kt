package com.discord.notifications.api

import kc.m
import kotlinx.serialization.KSerializer

@m
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
      val var1: java.lang.String = this.text;
      val var2: StringBuilder = new StringBuilder();
      var2.append("PollMedia(text=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PollMedia> {
         return PollMedia.$serializer.INSTANCE;
      }
   }
}
