package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class AppMessageEmbedAccessory(messageId: MessageId, codedLinkIndex: Int, appMessageEmbed: AppMessageEmbedImpl, constrainedWidth: Int) : AppMessageEmbedAccessory(
      var1, var2, var3, var4
   ) {
   public open val messageId: MessageId
   public final val codedLinkIndex: Int
   public final val appMessageEmbed: AppMessageEmbedImpl
   public final val constrainedWidth: Int

   fun AppMessageEmbedAccessory(var1: java.lang.String, var2: Int, var3: AppMessageEmbedImpl, var4: Int) {
      q.h(var1, "messageId");
      q.h(var3, "appMessageEmbed");
      val var5: StringBuilder = new StringBuilder();
      var5.append("app message embed ");
      var5.append(var2);
      super(var1, var5.toString(), false, 4, null);
      this.messageId = var1;
      this.codedLinkIndex = var2;
      this.appMessageEmbed = var3;
      this.constrainedWidth = var4;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): Int {
      return this.codedLinkIndex;
   }

   public operator fun component3(): AppMessageEmbedImpl {
      return this.appMessageEmbed;
   }

   public operator fun component4(): Int {
      return this.constrainedWidth;
   }

   public fun copy(messageId: MessageId = ..., codedLinkIndex: Int = ..., appMessageEmbed: AppMessageEmbedImpl = ..., constrainedWidth: Int = ...): AppMessageEmbedAccessory {
      q.h(var1, "messageId");
      q.h(var3, "appMessageEmbed");
      return new AppMessageEmbedAccessory(var1, var2, var3, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AppMessageEmbedAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (this.codedLinkIndex != var1.codedLinkIndex) {
            return false;
         } else if (!q.c(this.appMessageEmbed, var1.appMessageEmbed)) {
            return false;
         } else {
            return this.constrainedWidth == var1.constrainedWidth;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((MessageId.hashCode-impl(this.messageId) * 31 + Integer.hashCode(this.codedLinkIndex)) * 31 + this.appMessageEmbed.hashCode()) * 31
         + Integer.hashCode(this.constrainedWidth);
   }

   public override fun toString(): String {
      val var4: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: Int = this.codedLinkIndex;
      val var5: AppMessageEmbedImpl = this.appMessageEmbed;
      val var2: Int = this.constrainedWidth;
      val var3: StringBuilder = new StringBuilder();
      var3.append("AppMessageEmbedAccessory(messageId=");
      var3.append(var4);
      var3.append(", codedLinkIndex=");
      var3.append(var1);
      var3.append(", appMessageEmbed=");
      var3.append(var5);
      var3.append(", constrainedWidth=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
