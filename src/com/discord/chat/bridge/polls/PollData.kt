package com.discord.chat.bridge.polls

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class PollData(resources: PollResources,
   question: PollMedia,
   answers: List<PollAnswer>,
   answersInteraction: PollChatAnswerInteractionType,
   answerTapAccessibilityLabel: String? = null,
   layoutType: PollLayoutType,
   canSelectMultipleAnswers: Boolean = false,
   canTapAnswers: Boolean,
   canShowVoteCounts: Boolean,
   hasVoted: Boolean,
   isExpired: Boolean,
   containerStyle: String = "normal",
   myAvatarUrl: String? = null,
   secondaryAction: PollAction? = null,
   primaryAction: PollAction? = null,
   tertiaryAction: PollAction? = ...,
   promptLabel: String? = null
) {
   public final val resources: PollResources
   public final val question: PollMedia
   public final val answers: List<PollAnswer>
   public final val answersInteraction: PollChatAnswerInteractionType
   public final val answerTapAccessibilityLabel: String?
   public final val layoutType: PollLayoutType
   public final val canSelectMultipleAnswers: Boolean
   public final val canTapAnswers: Boolean
   public final val canShowVoteCounts: Boolean
   public final val hasVoted: Boolean
   public final val isExpired: Boolean
   public final val containerStyle: String
   public final val myAvatarUrl: String?
   public final val secondaryAction: PollAction?
   public final val primaryAction: PollAction?
   public final val tertiaryAction: PollAction?
   public final val promptLabel: String?

   init {
      super();
      this.resources = var1;
      this.question = var2;
      this.answers = var3;
      this.answersInteraction = var4;
      this.answerTapAccessibilityLabel = var5;
      this.layoutType = var6;
      this.canSelectMultipleAnswers = var7;
      this.canTapAnswers = var8;
      this.canShowVoteCounts = var9;
      this.hasVoted = var10;
      this.isExpired = var11;
      this.containerStyle = var12;
      this.myAvatarUrl = var13;
      this.secondaryAction = var14;
      this.primaryAction = var15;
      this.tertiaryAction = var16;
      this.promptLabel = var17;
   }

   public operator fun component1(): PollResources {
      return this.resources;
   }

   public operator fun component10(): Boolean {
      return this.hasVoted;
   }

   public operator fun component11(): Boolean {
      return this.isExpired;
   }

   public operator fun component12(): String {
      return this.containerStyle;
   }

   public operator fun component13(): String? {
      return this.myAvatarUrl;
   }

   public operator fun component14(): PollAction? {
      return this.secondaryAction;
   }

   public operator fun component15(): PollAction? {
      return this.primaryAction;
   }

   public operator fun component16(): PollAction? {
      return this.tertiaryAction;
   }

   public operator fun component17(): String? {
      return this.promptLabel;
   }

   public operator fun component2(): PollMedia {
      return this.question;
   }

   public operator fun component3(): List<PollAnswer> {
      return this.answers;
   }

   public operator fun component4(): PollChatAnswerInteractionType {
      return this.answersInteraction;
   }

   public operator fun component5(): String? {
      return this.answerTapAccessibilityLabel;
   }

   public operator fun component6(): PollLayoutType {
      return this.layoutType;
   }

   public operator fun component7(): Boolean {
      return this.canSelectMultipleAnswers;
   }

   public operator fun component8(): Boolean {
      return this.canTapAnswers;
   }

   public operator fun component9(): Boolean {
      return this.canShowVoteCounts;
   }

   public fun copy(
      resources: PollResources = var0.resources,
      question: PollMedia = var0.question,
      answers: List<PollAnswer> = var0.answers,
      answersInteraction: PollChatAnswerInteractionType = var0.answersInteraction,
      answerTapAccessibilityLabel: String? = var0.answerTapAccessibilityLabel,
      layoutType: PollLayoutType = var0.layoutType,
      canSelectMultipleAnswers: Boolean = var0.canSelectMultipleAnswers,
      canTapAnswers: Boolean = var0.canTapAnswers,
      canShowVoteCounts: Boolean = var0.canShowVoteCounts,
      hasVoted: Boolean = var0.hasVoted,
      isExpired: Boolean = var0.isExpired,
      containerStyle: String = var0.containerStyle,
      myAvatarUrl: String? = var0.myAvatarUrl,
      secondaryAction: PollAction? = var0.secondaryAction,
      primaryAction: PollAction? = var0.primaryAction,
      tertiaryAction: PollAction? = var0.tertiaryAction,
      promptLabel: String? = var0.promptLabel
   ): PollData {
      return new PollData(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.resources == var1.resources)) {
            return false;
         } else if (!(this.question == var1.question)) {
            return false;
         } else if (!(this.answers == var1.answers)) {
            return false;
         } else if (this.answersInteraction != var1.answersInteraction) {
            return false;
         } else if (!(this.answerTapAccessibilityLabel == var1.answerTapAccessibilityLabel)) {
            return false;
         } else if (this.layoutType != var1.layoutType) {
            return false;
         } else if (this.canSelectMultipleAnswers != var1.canSelectMultipleAnswers) {
            return false;
         } else if (this.canTapAnswers != var1.canTapAnswers) {
            return false;
         } else if (this.canShowVoteCounts != var1.canShowVoteCounts) {
            return false;
         } else if (this.hasVoted != var1.hasVoted) {
            return false;
         } else if (this.isExpired != var1.isExpired) {
            return false;
         } else if (!(this.containerStyle == var1.containerStyle)) {
            return false;
         } else if (!(this.myAvatarUrl == var1.myAvatarUrl)) {
            return false;
         } else if (!(this.secondaryAction == var1.secondaryAction)) {
            return false;
         } else if (!(this.primaryAction == var1.primaryAction)) {
            return false;
         } else if (!(this.tertiaryAction == var1.tertiaryAction)) {
            return false;
         } else {
            return this.promptLabel == var1.promptLabel;
         }
      }
   }

   public override fun hashCode(): Int {
      val var10: Int = this.resources.hashCode();
      val var8: Int = this.question.hashCode();
      val var7: Int = this.answers.hashCode();
      val var9: Int = this.answersInteraction.hashCode();
      var var6: Int = 0;
      val var1: Int;
      if (this.answerTapAccessibilityLabel == null) {
         var1 = 0;
      } else {
         var1 = this.answerTapAccessibilityLabel.hashCode();
      }

      val var13: Int = this.layoutType.hashCode();
      val var14: Int = java.lang.Boolean.hashCode(this.canSelectMultipleAnswers);
      val var17: Int = java.lang.Boolean.hashCode(this.canTapAnswers);
      val var16: Int = java.lang.Boolean.hashCode(this.canShowVoteCounts);
      val var12: Int = java.lang.Boolean.hashCode(this.hasVoted);
      val var11: Int = java.lang.Boolean.hashCode(this.isExpired);
      val var15: Int = this.containerStyle.hashCode();
      val var2: Int;
      if (this.myAvatarUrl == null) {
         var2 = 0;
      } else {
         var2 = this.myAvatarUrl.hashCode();
      }

      val var3: Int;
      if (this.secondaryAction == null) {
         var3 = 0;
      } else {
         var3 = this.secondaryAction.hashCode();
      }

      val var4: Int;
      if (this.primaryAction == null) {
         var4 = 0;
      } else {
         var4 = this.primaryAction.hashCode();
      }

      val var5: Int;
      if (this.tertiaryAction == null) {
         var5 = 0;
      } else {
         var5 = this.tertiaryAction.hashCode();
      }

      if (this.promptLabel != null) {
         var6 = this.promptLabel.hashCode();
      }

      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (
                                                                                       (
                                                                                                (
                                                                                                         (
                                                                                                                  (
                                                                                                                           ((var10 * 31 + var8) * 31 + var7)
                                                                                                                                 * 31
                                                                                                                              + var9
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var1
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var13
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var14
                                                                                             )
                                                                                             * 31
                                                                                          + var17
                                                                                    )
                                                                                    * 31
                                                                                 + var16
                                                                           )
                                                                           * 31
                                                                        + var12
                                                                  )
                                                                  * 31
                                                               + var11
                                                         )
                                                         * 31
                                                      + var15
                                                )
                                                * 31
                                             + var2
                                       )
                                       * 31
                                    + var3
                              )
                              * 31
                           + var4
                     )
                     * 31
                  + var5
            )
            * 31
         + var6;
   }

   public override fun toString(): String {
      val var15: PollResources = this.resources;
      val var17: PollMedia = this.question;
      val var12: java.util.List = this.answers;
      val var16: PollChatAnswerInteractionType = this.answersInteraction;
      val var7: java.lang.String = this.answerTapAccessibilityLabel;
      val var18: PollLayoutType = this.layoutType;
      val var5: Boolean = this.canSelectMultipleAnswers;
      val var1: Boolean = this.canTapAnswers;
      val var4: Boolean = this.canShowVoteCounts;
      val var2: Boolean = this.hasVoted;
      val var3: Boolean = this.isExpired;
      val var9: java.lang.String = this.containerStyle;
      val var6: java.lang.String = this.myAvatarUrl;
      val var10: PollAction = this.secondaryAction;
      val var11: PollAction = this.primaryAction;
      val var13: PollAction = this.tertiaryAction;
      val var8: java.lang.String = this.promptLabel;
      val var14: StringBuilder = new StringBuilder();
      var14.append("PollData(resources=");
      var14.append(var15);
      var14.append(", question=");
      var14.append(var17);
      var14.append(", answers=");
      var14.append(var12);
      var14.append(", answersInteraction=");
      var14.append(var16);
      var14.append(", answerTapAccessibilityLabel=");
      var14.append(var7);
      var14.append(", layoutType=");
      var14.append(var18);
      var14.append(", canSelectMultipleAnswers=");
      var14.append(var5);
      var14.append(", canTapAnswers=");
      var14.append(var1);
      var14.append(", canShowVoteCounts=");
      var14.append(var4);
      var14.append(", hasVoted=");
      var14.append(var2);
      var14.append(", isExpired=");
      var14.append(var3);
      var14.append(", containerStyle=");
      var14.append(var9);
      var14.append(", myAvatarUrl=");
      var14.append(var6);
      var14.append(", secondaryAction=");
      var14.append(var10);
      var14.append(", primaryAction=");
      var14.append(var11);
      var14.append(", tertiaryAction=");
      var14.append(var13);
      var14.append(", promptLabel=");
      var14.append(var8);
      var14.append(")");
      return var14.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PollData> {
         return PollData.$serializer.INSTANCE;
      }
   }
}
