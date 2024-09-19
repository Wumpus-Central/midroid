package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.codedlinks.GuildInviteDisabledEmbedImpl
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class GuildInviteDisabledMessageAccessory(messageId: MessageId, codedLinkIndex: Int, invite: GuildInviteDisabledEmbedImpl) : GuildInviteDisabledMessageAccessory(
      var1, var2, var3
   ) {
   public final val codedLinkIndex: Int
   public final val invite: GuildInviteDisabledEmbedImpl
   public open val messageId: MessageId

   fun GuildInviteDisabledMessageAccessory(var1: java.lang.String, var2: Int, var3: GuildInviteDisabledEmbedImpl) {
      q.h(var1, "messageId");
      q.h(var3, "invite");
      val var4: StringBuilder = new StringBuilder();
      var4.append("guild invite disabled ");
      var4.append(var2);
      super(var1, var4.toString(), false, 4, null);
      this.messageId = var1;
      this.codedLinkIndex = var2;
      this.invite = var3;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): Int {
      return this.codedLinkIndex;
   }

   public operator fun component3(): GuildInviteDisabledEmbedImpl {
      return this.invite;
   }

   public fun copy(messageId: MessageId = ..., codedLinkIndex: Int = ..., invite: GuildInviteDisabledEmbedImpl = ...): GuildInviteDisabledMessageAccessory {
      q.h(var1, "messageId");
      q.h(var3, "invite");
      return new GuildInviteDisabledMessageAccessory(var1, var2, var3, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GuildInviteDisabledMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (this.codedLinkIndex != var1.codedLinkIndex) {
            return false;
         } else {
            return q.c(this.invite, var1.invite);
         }
      }
   }

   public override fun hashCode(): Int {
      return (MessageId.hashCode-impl(this.messageId) * 31 + Integer.hashCode(this.codedLinkIndex)) * 31 + this.invite.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: Int = this.codedLinkIndex;
      val var3: GuildInviteDisabledEmbedImpl = this.invite;
      val var4: StringBuilder = new StringBuilder();
      var4.append("GuildInviteDisabledMessageAccessory(messageId=");
      var4.append(var2);
      var4.append(", codedLinkIndex=");
      var4.append(var1);
      var4.append(", invite=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }
}
