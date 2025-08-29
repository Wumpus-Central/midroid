package com.discord.chat.bridge.polls

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class PollAnswer(answerId: String,
   pollMedia: PollMedia,
   didSelfVote: Boolean,
   votes: String,
   votesPercentage: Int,
   isSelected: Boolean? = null,
   isVictor: Boolean? = null,
   shouldAnimateTransition: Boolean? = null,
   style: String = "normal"
) {
   public final val answerId: String
   public final val pollMedia: PollMedia
   public final val didSelfVote: Boolean
   public final val votes: String
   public final val votesPercentage: Int
   public final val isSelected: Boolean?
   public final val isVictor: Boolean?
   public final val shouldAnimateTransition: Boolean?
   public final val style: String

   init {
      super();
      this.answerId = var1;
      this.pollMedia = var2;
      this.didSelfVote = var3;
      this.votes = var4;
      this.votesPercentage = var5;
      this.isSelected = var6;
      this.isVictor = var7;
      this.shouldAnimateTransition = var8;
      this.style = var9;
   }

   public operator fun component1(): String {
      return this.answerId;
   }

   public operator fun component2(): PollMedia {
      return this.pollMedia;
   }

   public operator fun component3(): Boolean {
      return this.didSelfVote;
   }

   public operator fun component4(): String {
      return this.votes;
   }

   public operator fun component5(): Int {
      return this.votesPercentage;
   }

   public operator fun component6(): Boolean? {
      return this.isSelected;
   }

   public operator fun component7(): Boolean? {
      return this.isVictor;
   }

   public operator fun component8(): Boolean? {
      return this.shouldAnimateTransition;
   }

   public operator fun component9(): String {
      return this.style;
   }

   public fun copy(
      answerId: String = var0.answerId,
      pollMedia: PollMedia = var0.pollMedia,
      didSelfVote: Boolean = var0.didSelfVote,
      votes: String = var0.votes,
      votesPercentage: Int = var0.votesPercentage,
      isSelected: Boolean? = var0.isSelected,
      isVictor: Boolean? = var0.isVictor,
      shouldAnimateTransition: Boolean? = var0.shouldAnimateTransition,
      style: String = var0.style
   ): PollAnswer {
      return new PollAnswer(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollAnswer) {
         return false;
      } else {
         var1 = var1;
         if (!(this.answerId == var1.answerId)) {
            return false;
         } else if (!(this.pollMedia == var1.pollMedia)) {
            return false;
         } else if (this.didSelfVote != var1.didSelfVote) {
            return false;
         } else if (!(this.votes == var1.votes)) {
            return false;
         } else if (this.votesPercentage != var1.votesPercentage) {
            return false;
         } else if (!(this.isSelected == var1.isSelected)) {
            return false;
         } else if (!(this.isVictor == var1.isVictor)) {
            return false;
         } else if (!(this.shouldAnimateTransition == var1.shouldAnimateTransition)) {
            return false;
         } else {
            return this.style == var1.style;
         }
      }
   }

   public fun hasImage(): Boolean {
      val var1: Boolean;
      if (this.pollMedia.getEmoji() == null && this.pollMedia.getAttachmentIds().isEmpty() && this.pollMedia.getStickerId() == null) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public override fun hashCode(): Int {
      val var7: Int = this.answerId.hashCode();
      val var4: Int = this.pollMedia.hashCode();
      val var8: Int = java.lang.Boolean.hashCode(this.didSelfVote);
      val var5: Int = this.votes.hashCode();
      val var6: Int = Integer.hashCode(this.votesPercentage);
      var var3: Int = 0;
      val var1: Int;
      if (this.isSelected == null) {
         var1 = 0;
      } else {
         var1 = this.isSelected.hashCode();
      }

      val var2: Int;
      if (this.isVictor == null) {
         var2 = 0;
      } else {
         var2 = this.isVictor.hashCode();
      }

      if (this.shouldAnimateTransition != null) {
         var3 = this.shouldAnimateTransition.hashCode();
      }

      return (((((((var7 * 31 + var4) * 31 + var8) * 31 + var5) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + this.style.hashCode();
   }

   public override fun toString(): String {
      val var9: java.lang.String = this.answerId;
      val var3: PollMedia = this.pollMedia;
      val var2: Boolean = this.didSelfVote;
      val var5: java.lang.String = this.votes;
      val var1: Int = this.votesPercentage;
      val var4: java.lang.Boolean = this.isSelected;
      val var6: java.lang.Boolean = this.isVictor;
      val var7: java.lang.Boolean = this.shouldAnimateTransition;
      val var8: java.lang.String = this.style;
      val var10: StringBuilder = new StringBuilder();
      var10.append("PollAnswer(answerId=");
      var10.append(var9);
      var10.append(", pollMedia=");
      var10.append(var3);
      var10.append(", didSelfVote=");
      var10.append(var2);
      var10.append(", votes=");
      var10.append(var5);
      var10.append(", votesPercentage=");
      var10.append(var1);
      var10.append(", isSelected=");
      var10.append(var4);
      var10.append(", isVictor=");
      var10.append(var6);
      var10.append(", shouldAnimateTransition=");
      var10.append(var7);
      var10.append(", style=");
      var10.append(var8);
      var10.append(")");
      return var10.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PollAnswer> {
         return PollAnswer.$serializer.INSTANCE;
      }
   }
}
