package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.codedlinks.ActivityBookmarkEmbedImpl
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class ActivityBookmarkMessageAccessory(messageId: MessageId,
   codedLinkIndex: Int,
   activityBookmarkEmbed: ActivityBookmarkEmbedImpl,
   constrainedWidth: Int
) : ActivityBookmarkMessageAccessory(var1, var2, var3, var4) {
   public final val activityBookmarkEmbed: ActivityBookmarkEmbedImpl
   public final val codedLinkIndex: Int
   public final val constrainedWidth: Int
   public open val messageId: MessageId

   fun ActivityBookmarkMessageAccessory(var1: java.lang.String, var2: Int, var3: ActivityBookmarkEmbedImpl, var4: Int) {
      q.h(var1, "messageId");
      q.h(var3, "activityBookmarkEmbed");
      val var5: StringBuilder = new StringBuilder();
      var5.append("activity launcher ");
      var5.append(var2);
      super(var1, var5.toString(), false, 4, null);
      this.messageId = var1;
      this.codedLinkIndex = var2;
      this.activityBookmarkEmbed = var3;
      this.constrainedWidth = var4;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): Int {
      return this.codedLinkIndex;
   }

   public operator fun component3(): ActivityBookmarkEmbedImpl {
      return this.activityBookmarkEmbed;
   }

   public operator fun component4(): Int {
      return this.constrainedWidth;
   }

   public fun copy(messageId: MessageId = ..., codedLinkIndex: Int = ..., activityBookmarkEmbed: ActivityBookmarkEmbedImpl = ..., constrainedWidth: Int = ...): ActivityBookmarkMessageAccessory {
      q.h(var1, "messageId");
      q.h(var3, "activityBookmarkEmbed");
      return new ActivityBookmarkMessageAccessory(var1, var2, var3, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActivityBookmarkMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (this.codedLinkIndex != var1.codedLinkIndex) {
            return false;
         } else if (!q.c(this.activityBookmarkEmbed, var1.activityBookmarkEmbed)) {
            return false;
         } else {
            return this.constrainedWidth == var1.constrainedWidth;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((MessageId.hashCode-impl(this.messageId) * 31 + Integer.hashCode(this.codedLinkIndex)) * 31 + this.activityBookmarkEmbed.hashCode()) * 31
         + Integer.hashCode(this.constrainedWidth);
   }

   public override fun toString(): String {
      val var5: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: Int = this.codedLinkIndex;
      val var3: ActivityBookmarkEmbedImpl = this.activityBookmarkEmbed;
      val var2: Int = this.constrainedWidth;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ActivityBookmarkMessageAccessory(messageId=");
      var4.append(var5);
      var4.append(", codedLinkIndex=");
      var4.append(var1);
      var4.append(", activityBookmarkEmbed=");
      var4.append(var3);
      var4.append(", constrainedWidth=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }
}
