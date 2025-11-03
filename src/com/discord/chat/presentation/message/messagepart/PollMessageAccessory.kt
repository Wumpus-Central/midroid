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
import kotlin.jvm.internal.SourceDebugExtension

public data class PollMessageAccessory(channelId: ChannelId,
      messageId: MessageId,
      myAvatarUrl: String?,
      data: PollData,
      answers: List<PollAnswerAccessory>,
      containerStyleSet: IPollStyleSet = ...
   ) : PollMessageAccessory(var1, var3, var4, var5, var6, var7),
   IPollStyleSet {
   public final val channelId: ChannelId
   public open val messageId: MessageId
   public final val myAvatarUrl: String?
   public final val data: PollData
   public final val answers: List<PollAnswerAccessory>
   public final val containerStyleSet: IPollStyleSet

   public open val answerBackgroundColor: Int
      public open get() {
         return this.containerStyleSet.getAnswerBackgroundColor();
      }


   public open val answerFillColor: Int
      public open get() {
         return this.containerStyleSet.getAnswerFillColor();
      }


   public open val borderColor: Int
      public open get() {
         return this.containerStyleSet.getBorderColor();
      }


   public open val borderWidthPx: Int

   public open val fillColor: Int
      public open get() {
         return this.containerStyleSet.getFillColor();
      }


   public open val labelColor: Int
      public open get() {
         return this.containerStyleSet.getLabelColor();
      }


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
         } else if (!(this.myAvatarUrl == var1.myAvatarUrl)) {
            return false;
         } else if (!(this.data == var1.data)) {
            return false;
         } else if (!(this.answers == var1.answers)) {
            return false;
         } else {
            return this.containerStyleSet == var1.containerStyleSet;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = ChannelId.hashCode-impl(this.channelId);
      val var2: Int = MessageId.hashCode-impl(this.messageId);
      val var1: Int;
      if (this.myAvatarUrl == null) {
         var1 = 0;
      } else {
         var1 = this.myAvatarUrl.hashCode();
      }

      return ((((var3 * 31 + var2) * 31 + var1) * 31 + this.data.hashCode()) * 31 + this.answers.hashCode()) * 31 + this.containerStyleSet.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var6: java.lang.String = MessageId.toString-impl(this.messageId);
      val var7: java.lang.String = this.myAvatarUrl;
      val var5: PollData = this.data;
      val var3: java.util.List = this.answers;
      val var4: IPollStyleSet = this.containerStyleSet;
      val var1: StringBuilder = new StringBuilder();
      var1.append("PollMessageAccessory(channelId=");
      var1.append(var2);
      var1.append(", messageId=");
      var1.append(var6);
      var1.append(", myAvatarUrl=");
      var1.append(var7);
      var1.append(", data=");
      var1.append(var5);
      var1.append(", answers=");
      var1.append(var3);
      var1.append(", containerStyleSet=");
      var1.append(var4);
      var1.append(")");
      return var1.toString();
   }

   @SourceDebugExtension(["SMAP\nPollMessageAccessory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollMessageAccessory.kt\ncom/discord/chat/presentation/message/messagepart/PollMessageAccessory$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1557#2:60\n1628#2,2:61\n774#2:63\n865#2,2:64\n1630#2:66\n*S KotlinDebug\n*F\n+ 1 PollMessageAccessory.kt\ncom/discord/chat/presentation/message/messagepart/PollMessageAccessory$Companion\n*L\n27#1:60\n27#1:61,2\n43#1:63\n43#1:64,2\n27#1:66\n*E\n"])
   public companion object {
      public fun create(context: Context, message: Message, pollData: PollData): PollMessageAccessory {
         val var13: java.lang.String = ReactAssetUtilsKt.inflateUrl(var1, var3.getMyAvatarUrl());
         val var23: java.lang.Iterable = var3.getAnswers();
         val var14: ArrayList = new ArrayList(CollectionsKt.w(var23, 10));

         for (PollAnswer var18 : var23) {
            val var19: java.lang.String = var2.getId-3Eiw7ao();
            val var17: PollResources = var3.getResources();
            val var5: Boolean = var3.getCanTapAnswers();
            val var6: Boolean = var3.getCanSelectMultipleAnswers();
            val var8: Boolean = var3.getCanShowVoteCounts();
            val var9: Boolean = var3.getHasVoted();
            val var7: Boolean = var3.isExpired();
            val var15: PollChatAnswerInteractionType = var3.getAnswersInteraction();
            val var20: java.lang.String = var3.getAnswerTapAccessibilityLabel();
            val var24: java.lang.Boolean = var18.getShouldAnimateTransition();
            val var4: Boolean;
            if (var24 != null) {
               var4 = var24;
            } else {
               var4 = false;
            }

            val var10: Boolean = MessageKt.shouldAnimateEmoji(var2);
            val var11: Boolean = MessageKt.shouldAutoPlayGifs(var2);
            val var25: java.util.List = var2.getAttachments();
            var var26: Any;
            if (var25 != null) {
               var26 = var25;
               val var12: ArrayList = new ArrayList();
               val var21: java.util.Iterator = var26.iterator();

               while (true) {
                  var26 = var12;
                  if (!var21.hasNext()) {
                     break;
                  }

                  var26 = (java.lang.Iterable)var21.next();
                  if (CollectionsKt.d0(var18.getPollMedia().getAttachmentIds(), (var26 as Attachment).getId())) {
                     var12.add(var26);
                  }
               }
            } else {
               var26 = CollectionsKt.l();
            }

            var14.add(
               new PollAnswerAccessory(var19, var17, var18, var26, var5, var6, var8, var9, var7, var13, var15, var20, var4, var10, var11, null, 32768, null)
            );
         }

         return new PollMessageAccessory(var2.getChannelId-o4g7jtM(), var2.getId-3Eiw7ao(), var13, var3, var14, null, 32, null);
      }
   }
}
