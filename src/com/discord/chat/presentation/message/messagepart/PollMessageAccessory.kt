package com.discord.chat.presentation.message.messagepart

import android.content.Context
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.polls.IPollStyleSet
import com.discord.chat.bridge.polls.PollAnswer
import com.discord.chat.bridge.polls.PollChatAnswerInteractionType
import com.discord.chat.bridge.polls.PollData
import com.discord.chat.bridge.polls.PollResources
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import java.util.ArrayList
import kotlin.jvm.internal.q

public data class PollMessageAccessory(channelId: ChannelId,
      messageId: MessageId,
      myAvatarUrl: String?,
      data: PollData,
      answers: List<PollAnswerAccessory>,
      containerStyleSet: IPollStyleSet = ...
   ) : PollMessageAccessory(var1, var3, var4, var5, var6, var7),
   IPollStyleSet {
   public open val answerBackgroundColor: Int
      public open get() {
         return this.containerStyleSet.getAnswerBackgroundColor();
      }


   public open val answerFillColor: Int
      public open get() {
         return this.containerStyleSet.getAnswerFillColor();
      }


   public final val answers: List<PollAnswerAccessory>

   public open val borderColor: Int
      public open get() {
         return this.containerStyleSet.getBorderColor();
      }


   public open val borderWidthPx: Int
   public final val channelId: ChannelId
   public final val containerStyleSet: IPollStyleSet
   public final val data: PollData

   public open val fillColor: Int
      public open get() {
         return this.containerStyleSet.getFillColor();
      }


   public open val labelColor: Int
      public open get() {
         return this.containerStyleSet.getLabelColor();
      }


   public open val messageId: MessageId
   public final val myAvatarUrl: String?

   public open val radioBackgroundColor: Int
      public open get() {
         return this.containerStyleSet.getRadioBackgroundColor();
      }


   public open val radioForegroundColor: Int
      public open get() {
         return this.containerStyleSet.getRadioForegroundColor();
      }


   fun PollMessageAccessory(
      var1: Long, var3: java.lang.String, var4: java.lang.String, var5: PollData, var6: MutableList<PollAnswerAccessory>, var7: IPollStyleSet
   ) {
      q.h(var3, "messageId");
      q.h(var5, "data");
      q.h(var6, "answers");
      q.h(var7, "containerStyleSet");
      super(var3, "poll", false, 4, null);
      this.channelId = var1;
      this.messageId = var3;
      this.myAvatarUrl = var4;
      this.data = var5;
      this.answers = var6;
      this.containerStyleSet = var7;
   }

   public operator fun component1(): ChannelId {
      return this.channelId;
   }

   public operator fun component2(): MessageId {
      return this.messageId;
   }

   public operator fun component3(): String? {
      return this.myAvatarUrl;
   }

   public operator fun component4(): PollData {
      return this.data;
   }

   public operator fun component5(): List<PollAnswerAccessory> {
      return this.answers;
   }

   public operator fun component6(): IPollStyleSet {
      return this.containerStyleSet;
   }

   public fun copy(
      channelId: ChannelId = ...,
      messageId: MessageId = ...,
      myAvatarUrl: String? = ...,
      data: PollData = ...,
      answers: List<PollAnswerAccessory> = ...,
      containerStyleSet: IPollStyleSet = ...
   ): PollMessageAccessory {
      q.h(var3, "messageId");
      q.h(var5, "data");
      q.h(var6, "answers");
      q.h(var7, "containerStyleSet");
      return new PollMessageAccessory(var1, var3, var4, var5, var6, var7, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.myAvatarUrl, var1.myAvatarUrl)) {
            return false;
         } else if (!q.c(this.data, var1.data)) {
            return false;
         } else if (!q.c(this.answers, var1.answers)) {
            return false;
         } else {
            return q.c(this.containerStyleSet, var1.containerStyleSet);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = ChannelId.hashCode-impl(this.channelId);
      val var3: Int = MessageId.hashCode-impl(this.messageId);
      val var1: Int;
      if (this.myAvatarUrl == null) {
         var1 = 0;
      } else {
         var1 = this.myAvatarUrl.hashCode();
      }

      return ((((var2 * 31 + var3) * 31 + var1) * 31 + this.data.hashCode()) * 31 + this.answers.hashCode()) * 31 + this.containerStyleSet.hashCode();
   }

   public override fun toString(): String {
      val var4: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var7: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: java.lang.String = this.myAvatarUrl;
      val var1: PollData = this.data;
      val var5: java.util.List = this.answers;
      val var6: IPollStyleSet = this.containerStyleSet;
      val var3: StringBuilder = new StringBuilder();
      var3.append("PollMessageAccessory(channelId=");
      var3.append(var4);
      var3.append(", messageId=");
      var3.append(var7);
      var3.append(", myAvatarUrl=");
      var3.append(var2);
      var3.append(", data=");
      var3.append(var1);
      var3.append(", answers=");
      var3.append(var5);
      var3.append(", containerStyleSet=");
      var3.append(var6);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun create(context: Context, message: Message, pollData: PollData): PollMessageAccessory {
         q.h(var1, "context");
         q.h(var2, "message");
         q.h(var3, "pollData");
         val var13: java.lang.String = ReactAssetUtilsKt.inflateUrl(var1, var3.getMyAvatarUrl());
         val var23: java.util.List = var3.getAnswers();
         val var12: ArrayList = new ArrayList(i.v(var23, 10));

         for (PollAnswer var17 : var23) {
            val var19: java.lang.String = var2.getId-3Eiw7ao();
            val var18: PollResources = var3.getResources();
            val var9: Boolean = var3.getCanTapAnswers();
            val var7: Boolean = var3.getCanSelectMultipleAnswers();
            val var6: Boolean = var3.getCanShowVoteCounts();
            val var8: Boolean = var3.getHasVoted();
            val var5: Boolean = var3.isExpired();
            val var15: PollChatAnswerInteractionType = var3.getAnswersInteraction();
            val var16: java.lang.String = var3.getAnswerTapAccessibilityLabel();
            val var24: java.lang.Boolean = var17.getShouldAnimateTransition();
            val var4: Boolean;
            if (var24 != null) {
               var4 = var24;
            } else {
               var4 = false;
            }

            val var10: Boolean = MessageKt.shouldAnimateEmoji(var2);
            val var11: Boolean = MessageKt.shouldAutoPlayGifs(var2);
            val var20: java.util.List = var2.getAttachments();
            val var25: Any;
            if (var20 != null) {
               var25 = new ArrayList();

               for (Object var21 : var20) {
                  if (i.U(var17.getPollMedia().getAttachmentIds(), (var21 as Attachment).getId())) {
                     var25.add(var21);
                  }
               }
            } else {
               var25 = i.k();
            }

            var12.add(
               new PollAnswerAccessory(
                  var19, var18, var17, (java.util.List)var25, var9, var7, var6, var8, var5, var13, var15, var16, var4, var10, var11, null, 32768, null
               )
            );
         }

         return new PollMessageAccessory(var2.getChannelId-o4g7jtM(), var2.getId-3Eiw7ao(), var13, var3, var12, null, 32, null);
      }
   }
}
