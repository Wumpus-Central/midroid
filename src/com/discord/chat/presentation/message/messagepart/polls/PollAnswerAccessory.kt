package com.discord.chat.presentation.message.messagepart.polls

import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.polls.IPollStyleSet
import com.discord.chat.bridge.polls.PollAnswer
import com.discord.chat.bridge.polls.PollChatAnswerInteractionType
import com.discord.chat.bridge.polls.PollResources
import com.discord.chat.bridge.polls.PollStyleSet
import com.discord.misc.utilities.ids.IdUtilsKt
import com.discord.primitives.MessageId
import com.discord.recycler_view.utils.ItemDiffableType
import kotlin.jvm.internal.q

public data class PollAnswerAccessory(messageId: MessageId,
      resources: PollResources,
      answer: PollAnswer,
      attachments: List<Attachment>,
      canTapAnswers: Boolean,
      canSelectMultipleAnswers: Boolean,
      canShowVoteCounts: Boolean,
      hasVoted: Boolean,
      isExpired: Boolean,
      myAvatarUrl: String?,
      interactionType: PollChatAnswerInteractionType,
      tapAccessibilityLabel: String?,
      shouldAnimateTransition: Boolean,
      shouldAnimateEmoji: Boolean = ...,
      shouldAutoPlayGifs: Boolean = ...,
      styleSet: PollStyleSet = ...
   ) : PollAnswerAccessory(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16),
   ItemDiffableType,
   IPollStyleSet {
   public final val answer: PollAnswer

   public open val answerBackgroundColor: Int
      public open get() {
         return this.styleSet.getAnswerBackgroundColor();
      }


   public open val answerFillColor: Int
      public open get() {
         return this.styleSet.getAnswerFillColor();
      }


   public final val attachments: List<Attachment>

   public open val borderColor: Int
      public open get() {
         return this.styleSet.getBorderColor();
      }


   public open val borderWidthPx: Int
   public final val canSelectMultipleAnswers: Boolean
   public final val canShowVoteCounts: Boolean
   public final val canTapAnswers: Boolean

   public open val fillColor: Int
      public open get() {
         return this.styleSet.getFillColor();
      }


   public final val hasVoted: Boolean
   public final val interactionType: PollChatAnswerInteractionType
   public final val isExpired: Boolean
   public open val itemId: Long

   public open val labelColor: Int
      public open get() {
         return this.styleSet.getLabelColor();
      }


   public final val messageId: MessageId
   public final val myAvatarUrl: String?

   public open val radioBackgroundColor: Int
      public open get() {
         return this.styleSet.getRadioBackgroundColor();
      }


   public open val radioForegroundColor: Int
      public open get() {
         return this.styleSet.getRadioForegroundColor();
      }


   public final val resources: PollResources
   public final val shouldAnimateEmoji: Boolean
   public final val shouldAnimateTransition: Boolean
   public final val shouldAutoPlayGifs: Boolean
   public final val styleSet: PollStyleSet
   public final val tapAccessibilityLabel: String?

   fun PollAnswerAccessory(
      var1: java.lang.String,
      var2: PollResources,
      var3: PollAnswer,
      var4: MutableList<Attachment>,
      var5: Boolean,
      var6: Boolean,
      var7: Boolean,
      var8: Boolean,
      var9: Boolean,
      var10: java.lang.String,
      var11: PollChatAnswerInteractionType,
      var12: java.lang.String,
      var13: Boolean,
      var14: Boolean,
      var15: Boolean,
      var16: PollStyleSet
   ) {
      q.h(var1, "messageId");
      q.h(var2, "resources");
      q.h(var3, "answer");
      q.h(var4, "attachments");
      q.h(var11, "interactionType");
      q.h(var16, "styleSet");
      super();
      this.messageId = var1;
      this.resources = var2;
      this.answer = var3;
      this.attachments = var4;
      this.canTapAnswers = var5;
      this.canSelectMultipleAnswers = var6;
      this.canShowVoteCounts = var7;
      this.hasVoted = var8;
      this.isExpired = var9;
      this.myAvatarUrl = var10;
      this.interactionType = var11;
      this.tapAccessibilityLabel = var12;
      this.shouldAnimateTransition = var13;
      this.shouldAnimateEmoji = var14;
      this.shouldAutoPlayGifs = var15;
      this.styleSet = var16;
      var1 = MessageId.toString-impl(var1);
      val var19: java.lang.String = var3.getAnswerId();
      val var18: StringBuilder = new StringBuilder();
      var18.append(var1);
      var18.append(":");
      var18.append(var19);
      this.itemId = IdUtilsKt.convertToId(var18.toString());
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component10(): String? {
      return this.myAvatarUrl;
   }

   public operator fun component11(): PollChatAnswerInteractionType {
      return this.interactionType;
   }

   public operator fun component12(): String? {
      return this.tapAccessibilityLabel;
   }

   public operator fun component13(): Boolean {
      return this.shouldAnimateTransition;
   }

   public operator fun component14(): Boolean {
      return this.shouldAnimateEmoji;
   }

   public operator fun component15(): Boolean {
      return this.shouldAutoPlayGifs;
   }

   public operator fun component16(): PollStyleSet {
      return this.styleSet;
   }

   public operator fun component2(): PollResources {
      return this.resources;
   }

   public operator fun component3(): PollAnswer {
      return this.answer;
   }

   public operator fun component4(): List<Attachment> {
      return this.attachments;
   }

   public operator fun component5(): Boolean {
      return this.canTapAnswers;
   }

   public operator fun component6(): Boolean {
      return this.canSelectMultipleAnswers;
   }

   public operator fun component7(): Boolean {
      return this.canShowVoteCounts;
   }

   public operator fun component8(): Boolean {
      return this.hasVoted;
   }

   public operator fun component9(): Boolean {
      return this.isExpired;
   }

   public fun copy(
      messageId: MessageId = ...,
      resources: PollResources = ...,
      answer: PollAnswer = ...,
      attachments: List<Attachment> = ...,
      canTapAnswers: Boolean = ...,
      canSelectMultipleAnswers: Boolean = ...,
      canShowVoteCounts: Boolean = ...,
      hasVoted: Boolean = ...,
      isExpired: Boolean = ...,
      myAvatarUrl: String? = ...,
      interactionType: PollChatAnswerInteractionType = ...,
      tapAccessibilityLabel: String? = ...,
      shouldAnimateTransition: Boolean = ...,
      shouldAnimateEmoji: Boolean = ...,
      shouldAutoPlayGifs: Boolean = ...,
      styleSet: PollStyleSet = ...
   ): PollAnswerAccessory {
      q.h(var1, "messageId");
      q.h(var2, "resources");
      q.h(var3, "answer");
      q.h(var4, "attachments");
      q.h(var11, "interactionType");
      q.h(var16, "styleSet");
      return new PollAnswerAccessory(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollAnswerAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.resources, var1.resources)) {
            return false;
         } else if (!q.c(this.answer, var1.answer)) {
            return false;
         } else if (!q.c(this.attachments, var1.attachments)) {
            return false;
         } else if (this.canTapAnswers != var1.canTapAnswers) {
            return false;
         } else if (this.canSelectMultipleAnswers != var1.canSelectMultipleAnswers) {
            return false;
         } else if (this.canShowVoteCounts != var1.canShowVoteCounts) {
            return false;
         } else if (this.hasVoted != var1.hasVoted) {
            return false;
         } else if (this.isExpired != var1.isExpired) {
            return false;
         } else if (!q.c(this.myAvatarUrl, var1.myAvatarUrl)) {
            return false;
         } else if (this.interactionType != var1.interactionType) {
            return false;
         } else if (!q.c(this.tapAccessibilityLabel, var1.tapAccessibilityLabel)) {
            return false;
         } else if (this.shouldAnimateTransition != var1.shouldAnimateTransition) {
            return false;
         } else if (this.shouldAnimateEmoji != var1.shouldAnimateEmoji) {
            return false;
         } else if (this.shouldAutoPlayGifs != var1.shouldAutoPlayGifs) {
            return false;
         } else {
            return q.c(this.styleSet, var1.styleSet);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = MessageId.hashCode-impl(this.messageId);
      val var6: Int = this.resources.hashCode();
      val var10: Int = this.answer.hashCode();
      val var8: Int = this.attachments.hashCode();
      val var9: Int = java.lang.Boolean.hashCode(this.canTapAnswers);
      val var7: Int = java.lang.Boolean.hashCode(this.canSelectMultipleAnswers);
      val var5: Int = java.lang.Boolean.hashCode(this.canShowVoteCounts);
      val var11: Int = java.lang.Boolean.hashCode(this.hasVoted);
      val var3: Int = java.lang.Boolean.hashCode(this.isExpired);
      var var2: Int = 0;
      val var1: Int;
      if (this.myAvatarUrl == null) {
         var1 = 0;
      } else {
         var1 = this.myAvatarUrl.hashCode();
      }

      val var12: Int = this.interactionType.hashCode();
      if (this.tapAccessibilityLabel != null) {
         var2 = this.tapAccessibilityLabel.hashCode();
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
                                                                                                ((((var4 * 31 + var6) * 31 + var10) * 31 + var8) * 31 + var9)
                                                                                                      * 31
                                                                                                   + var7
                                                                                             )
                                                                                             * 31
                                                                                          + var5
                                                                                    )
                                                                                    * 31
                                                                                 + var11
                                                                           )
                                                                           * 31
                                                                        + var3
                                                                  )
                                                                  * 31
                                                               + var1
                                                         )
                                                         * 31
                                                      + var12
                                                )
                                                * 31
                                             + var2
                                       )
                                       * 31
                                    + java.lang.Boolean.hashCode(this.shouldAnimateTransition)
                              )
                              * 31
                           + java.lang.Boolean.hashCode(this.shouldAnimateEmoji)
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.shouldAutoPlayGifs)
            )
            * 31
         + this.styleSet.hashCode();
   }

   public override fun toString(): String {
      val var14: java.lang.String = MessageId.toString-impl(this.messageId);
      val var11: PollResources = this.resources;
      val var17: PollAnswer = this.answer;
      val var12: java.util.List = this.attachments;
      val var5: Boolean = this.canTapAnswers;
      val var2: Boolean = this.canSelectMultipleAnswers;
      val var4: Boolean = this.canShowVoteCounts;
      val var6: Boolean = this.hasVoted;
      val var3: Boolean = this.isExpired;
      val var9: java.lang.String = this.myAvatarUrl;
      val var13: PollChatAnswerInteractionType = this.interactionType;
      val var16: java.lang.String = this.tapAccessibilityLabel;
      val var1: Boolean = this.shouldAnimateTransition;
      val var7: Boolean = this.shouldAnimateEmoji;
      val var8: Boolean = this.shouldAutoPlayGifs;
      val var10: PollStyleSet = this.styleSet;
      val var15: StringBuilder = new StringBuilder();
      var15.append("PollAnswerAccessory(messageId=");
      var15.append(var14);
      var15.append(", resources=");
      var15.append(var11);
      var15.append(", answer=");
      var15.append(var17);
      var15.append(", attachments=");
      var15.append(var12);
      var15.append(", canTapAnswers=");
      var15.append(var5);
      var15.append(", canSelectMultipleAnswers=");
      var15.append(var2);
      var15.append(", canShowVoteCounts=");
      var15.append(var4);
      var15.append(", hasVoted=");
      var15.append(var6);
      var15.append(", isExpired=");
      var15.append(var3);
      var15.append(", myAvatarUrl=");
      var15.append(var9);
      var15.append(", interactionType=");
      var15.append(var13);
      var15.append(", tapAccessibilityLabel=");
      var15.append(var16);
      var15.append(", shouldAnimateTransition=");
      var15.append(var1);
      var15.append(", shouldAnimateEmoji=");
      var15.append(var7);
      var15.append(", shouldAutoPlayGifs=");
      var15.append(var8);
      var15.append(", styleSet=");
      var15.append(var10);
      var15.append(")");
      return var15.toString();
   }
}
