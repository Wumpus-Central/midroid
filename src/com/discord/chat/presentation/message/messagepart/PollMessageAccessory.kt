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
import kotlin.jvm.internal.r

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
      return this.getMessageId-3Eiw7ao();
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
      r.h(var3, "messageId");
      r.h(var5, "data");
      r.h(var6, "answers");
      r.h(var7, "containerStyleSet");
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
         } else if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else if (!r.c(this.myAvatarUrl, var1.myAvatarUrl)) {
            return false;
         } else if (!r.c(this.data, var1.data)) {
            return false;
         } else if (!r.c(this.answers, var1.answers)) {
            return false;
         } else {
            return r.c(this.containerStyleSet, var1.containerStyleSet);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = ChannelId.hashCode-impl(this.channelId);
      val var3: Int = MessageId.hashCode-impl(this.getMessageId-3Eiw7ao());
      val var1: Int;
      if (this.myAvatarUrl == null) {
         var1 = 0;
      } else {
         var1 = this.myAvatarUrl.hashCode();
      }

      return ((((var2 * 31 + var3) * 31 + var1) * 31 + this.data.hashCode()) * 31 + this.answers.hashCode()) * 31 + this.containerStyleSet.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var2: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var7: java.lang.String = this.myAvatarUrl;
      val var1: PollData = this.data;
      val var6: java.util.List = this.answers;
      val var5: IPollStyleSet = this.containerStyleSet;
      val var4: StringBuilder = new StringBuilder();
      var4.append("PollMessageAccessory(channelId=");
      var4.append(var3);
      var4.append(", messageId=");
      var4.append(var2);
      var4.append(", myAvatarUrl=");
      var4.append(var7);
      var4.append(", data=");
      var4.append(var1);
      var4.append(", answers=");
      var4.append(var6);
      var4.append(", containerStyleSet=");
      var4.append(var5);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun create(context: Context, message: Message, pollData: PollData): PollMessageAccessory {
         r.h(var1, "context");
         r.h(var2, "message");
         r.h(var3, "pollData");
         val var12: java.lang.String = ReactAssetUtilsKt.inflateUrl(var1, var3.getMyAvatarUrl());
         val var23: java.util.List = var3.getAnswers();
         val var13: ArrayList = new ArrayList(h.t(var23, 10));

         for (PollAnswer var17 : var23) {
            val var18: java.lang.String = var2.getId-3Eiw7ao();
            val var15: PollResources = var3.getResources();
            val var8: Boolean = var3.getCanTapAnswers();
            val var7: Boolean = var3.getCanSelectMultipleAnswers();
            val var6: Boolean = var3.getCanShowVoteCounts();
            val var9: Boolean = var3.getHasVoted();
            val var5: Boolean = var3.isExpired();
            val var16: PollChatAnswerInteractionType = var3.getAnswersInteraction();
            val var19: java.lang.String = var3.getAnswerTapAccessibilityLabel();
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

               for (var20 : var20) {
                  if (h.Q(var17.getPollMedia().getAttachmentIds(), (var20 as Attachment).getId())) {
                     var25.add(var20);
                  }
               }
            } else {
               var25 = h.i();
            }

            var13.add(
               new PollAnswerAccessory(
                  var18, var15, var17, (java.util.List)var25, var8, var7, var6, var9, var5, var12, var16, var19, var4, var10, var11, null, 32768, null
               )
            );
         }

         return new PollMessageAccessory(var2.getChannelId-o4g7jtM(), var2.getId-3Eiw7ao(), var12, var3, var13, null, 32, null);
      }
   }
}
