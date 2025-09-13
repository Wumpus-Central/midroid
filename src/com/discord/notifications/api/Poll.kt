package com.discord.notifications.api

import kotlinx.serialization.KSerializer
import pc.m

@m
public data class Poll(question: PollMedia) {
   public final val question: PollMedia

   init {
      super();
      this.question = var1;
   }

   public operator fun component1(): PollMedia {
      return this.question;
   }

   public fun copy(question: PollMedia = var0.question): Poll {
      return new Poll(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Poll) {
         return false;
      } else {
         return this.question == (var1 as Poll).question;
      }
   }

   public override fun hashCode(): Int {
      return this.question.hashCode();
   }

   public override fun toString(): String {
      val var2: PollMedia = this.question;
      val var1: StringBuilder = new StringBuilder();
      var1.append("Poll(question=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<Poll> {
         return Poll.$serializer.INSTANCE;
      }
   }
}
