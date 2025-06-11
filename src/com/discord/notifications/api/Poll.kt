package com.discord.notifications.api

import Xa.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class Poll(question: PollMedia) {
   public final val question: PollMedia

   init {
      q.h(var1, "question");
      super();
      this.question = var1;
   }

   public operator fun component1(): PollMedia {
      return this.question;
   }

   public fun copy(question: PollMedia = var0.question): Poll {
      q.h(var1, "question");
      return new Poll(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Poll) {
         return false;
      } else {
         return q.c(this.question, (var1 as Poll).question);
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
