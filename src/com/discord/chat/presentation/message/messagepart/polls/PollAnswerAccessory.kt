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
import kotlin.jvm.internal.r

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
      r.h(var1, "messageId");
      r.h(var2, "resources");
      r.h(var3, "answer");
      r.h(var4, "attachments");
      r.h(var11, "interactionType");
      r.h(var16, "styleSet");
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
         } else if (!r.c(this.resources, var1.resources)) {
            return false;
         } else if (!r.c(this.answer, var1.answer)) {
            return false;
         } else if (!r.c(this.attachments, var1.attachments)) {
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
         } else if (!r.c(this.myAvatarUrl, var1.myAvatarUrl)) {
            return false;
         } else if (this.interactionType != var1.interactionType) {
            return false;
         } else if (!r.c(this.tapAccessibilityLabel, var1.tapAccessibilityLabel)) {
            return false;
         } else if (this.shouldAnimateTransition != var1.shouldAnimateTransition) {
            return false;
         } else if (this.shouldAnimateEmoji != var1.shouldAnimateEmoji) {
            return false;
         } else if (this.shouldAutoPlayGifs != var1.shouldAutoPlayGifs) {
            return false;
         } else {
            return r.c(this.styleSet, var1.styleSet);
         }
      }
   }

   public override fun hashCode(): Int {
      val var13: Int = MessageId.hashCode-impl(this.messageId);
      val var15: Int = this.resources.hashCode();
      val var12: Int = this.answer.hashCode();
      val var14: Int = this.attachments.hashCode();
      var var10: Byte = 1;
      var var1: Byte = this.canTapAnswers;
      if (this.canTapAnswers != 0) {
         var1 = 1;
      }

      var var18: Byte = this.canSelectMultipleAnswers;
      if (this.canSelectMultipleAnswers != 0) {
         var18 = 1;
      }

      var var19: Byte = this.canShowVoteCounts;
      if (this.canShowVoteCounts != 0) {
         var19 = 1;
      }

      var var20: Byte = this.hasVoted;
      if (this.hasVoted != 0) {
         var20 = 1;
      }

      var var21: Byte = this.isExpired;
      if (this.isExpired != 0) {
         var21 = 1;
      }

      var var7: Int = 0;
      val var22: Int;
      if (this.myAvatarUrl == null) {
         var22 = 0;
      } else {
         var22 = this.myAvatarUrl.hashCode();
      }

      val var16: Int = this.interactionType.hashCode();
      if (this.tapAccessibilityLabel != null) {
         var7 = this.tapAccessibilityLabel.hashCode();
      }

      var var8: Byte = this.shouldAnimateTransition;
      if (this.shouldAnimateTransition != 0) {
         var8 = 1;
      }

      var var23: Byte = this.shouldAnimateEmoji;
      if (this.shouldAnimateEmoji != 0) {
         var23 = 1;
      }

      if (this.shouldAutoPlayGifs == 0) {
         var10 = this.shouldAutoPlayGifs;
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
                                                                                                ((((var13 * 31 + var15) * 31 + var12) * 31 + var14) * 31 + var1)
                                                                                                      * 31
                                                                                                   + var18
                                                                                             )
                                                                                             * 31
                                                                                          + var19
                                                                                    )
                                                                                    * 31
                                                                                 + var20
                                                                           )
                                                                           * 31
                                                                        + var21
                                                                  )
                                                                  * 31
                                                               + var22
                                                         )
                                                         * 31
                                                      + var16
                                                )
                                                * 31
                                             + var7
                                       )
                                       * 31
                                    + var8
                              )
                              * 31
                           + var23
                     )
                     * 31
                  + var10
            )
            * 31
         + this.styleSet.hashCode();
   }

   public override fun toString(): String {
      val var11: java.lang.String = MessageId.toString-impl(this.messageId);
      val var16: PollResources = this.resources;
      val var9: PollAnswer = this.answer;
      val var13: java.util.List = this.attachments;
      val var3: Boolean = this.canTapAnswers;
      val var1: Boolean = this.canSelectMultipleAnswers;
      val var4: Boolean = this.canShowVoteCounts;
      val var6: Boolean = this.hasVoted;
      val var5: Boolean = this.isExpired;
      val var12: java.lang.String = this.myAvatarUrl;
      val var15: PollChatAnswerInteractionType = this.interactionType;
      val var10: java.lang.String = this.tapAccessibilityLabel;
      val var2: Boolean = this.shouldAnimateTransition;
      val var8: Boolean = this.shouldAnimateEmoji;
      val var7: Boolean = this.shouldAutoPlayGifs;
      val var14: PollStyleSet = this.styleSet;
      val var17: StringBuilder = new StringBuilder();
      var17.append("PollAnswerAccessory(messageId=");
      var17.append(var11);
      var17.append(", resources=");
      var17.append(var16);
      var17.append(", answer=");
      var17.append(var9);
      var17.append(", attachments=");
      var17.append(var13);
      var17.append(", canTapAnswers=");
      var17.append(var3);
      var17.append(", canSelectMultipleAnswers=");
      var17.append(var1);
      var17.append(", canShowVoteCounts=");
      var17.append(var4);
      var17.append(", hasVoted=");
      var17.append(var6);
      var17.append(", isExpired=");
      var17.append(var5);
      var17.append(", myAvatarUrl=");
      var17.append(var12);
      var17.append(", interactionType=");
      var17.append(var15);
      var17.append(", tapAccessibilityLabel=");
      var17.append(var10);
      var17.append(", shouldAnimateTransition=");
      var17.append(var2);
      var17.append(", shouldAnimateEmoji=");
      var17.append(var8);
      var17.append(", shouldAutoPlayGifs=");
      var17.append(var7);
      var17.append(", styleSet=");
      var17.append(var14);
      var17.append(")");
      return var17.toString();
   }
}
