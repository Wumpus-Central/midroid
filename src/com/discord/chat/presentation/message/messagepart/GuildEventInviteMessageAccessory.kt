package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.codedlinks.GuildEventInviteEmbedImpl
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class GuildEventInviteMessageAccessory(messageId: MessageId,
   codedLinkIndex: Int,
   invite: GuildEventInviteEmbedImpl,
   shouldAnimateEmoji: Boolean,
   shouldShowLinkDecorations: Boolean,
   shouldShowRoleDot: Boolean,
   shouldShowRoleOnName: Boolean
) : GuildEventInviteMessageAccessory(var1, var2, var3, var4, var5, var6, var7) {
   public final val codedLinkIndex: Int
   public final val invite: GuildEventInviteEmbedImpl
   public open val messageId: MessageId
   public final val shouldAnimateEmoji: Boolean
   public final val shouldShowLinkDecorations: Boolean
   public final val shouldShowRoleDot: Boolean
   public final val shouldShowRoleOnName: Boolean

   fun GuildEventInviteMessageAccessory(
      var1: java.lang.String, var2: Int, var3: GuildEventInviteEmbedImpl, var4: Boolean, var5: Boolean, var6: Boolean, var7: Boolean
   ) {
      q.h(var1, "messageId");
      q.h(var3, "invite");
      val var8: StringBuilder = new StringBuilder();
      var8.append("guild scheduled event invite ");
      var8.append(var2);
      super(var1, var8.toString(), false, 4, null);
      this.messageId = var1;
      this.codedLinkIndex = var2;
      this.invite = var3;
      this.shouldAnimateEmoji = var4;
      this.shouldShowLinkDecorations = var5;
      this.shouldShowRoleDot = var6;
      this.shouldShowRoleOnName = var7;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): Int {
      return this.codedLinkIndex;
   }

   public operator fun component3(): GuildEventInviteEmbedImpl {
      return this.invite;
   }

   public operator fun component4(): Boolean {
      return this.shouldAnimateEmoji;
   }

   public operator fun component5(): Boolean {
      return this.shouldShowLinkDecorations;
   }

   public operator fun component6(): Boolean {
      return this.shouldShowRoleDot;
   }

   public operator fun component7(): Boolean {
      return this.shouldShowRoleOnName;
   }

   public fun copy(
      messageId: MessageId = ...,
      codedLinkIndex: Int = ...,
      invite: GuildEventInviteEmbedImpl = ...,
      shouldAnimateEmoji: Boolean = ...,
      shouldShowLinkDecorations: Boolean = ...,
      shouldShowRoleDot: Boolean = ...,
      shouldShowRoleOnName: Boolean = ...
   ): GuildEventInviteMessageAccessory {
      q.h(var1, "messageId");
      q.h(var3, "invite");
      return new GuildEventInviteMessageAccessory(var1, var2, var3, var4, var5, var6, var7, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GuildEventInviteMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (this.codedLinkIndex != var1.codedLinkIndex) {
            return false;
         } else if (!q.c(this.invite, var1.invite)) {
            return false;
         } else if (this.shouldAnimateEmoji != var1.shouldAnimateEmoji) {
            return false;
         } else if (this.shouldShowLinkDecorations != var1.shouldShowLinkDecorations) {
            return false;
         } else if (this.shouldShowRoleDot != var1.shouldShowRoleDot) {
            return false;
         } else {
            return this.shouldShowRoleOnName == var1.shouldShowRoleOnName;
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 ((MessageId.hashCode-impl(this.messageId) * 31 + Integer.hashCode(this.codedLinkIndex)) * 31 + this.invite.hashCode()) * 31
                                    + java.lang.Boolean.hashCode(this.shouldAnimateEmoji)
                              )
                              * 31
                           + java.lang.Boolean.hashCode(this.shouldShowLinkDecorations)
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.shouldShowRoleDot)
            )
            * 31
         + java.lang.Boolean.hashCode(this.shouldShowRoleOnName);
   }

   public override fun toString(): String {
      val var8: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: Int = this.codedLinkIndex;
      val var6: GuildEventInviteEmbedImpl = this.invite;
      val var4: Boolean = this.shouldAnimateEmoji;
      val var2: Boolean = this.shouldShowLinkDecorations;
      val var3: Boolean = this.shouldShowRoleDot;
      val var5: Boolean = this.shouldShowRoleOnName;
      val var7: StringBuilder = new StringBuilder();
      var7.append("GuildEventInviteMessageAccessory(messageId=");
      var7.append(var8);
      var7.append(", codedLinkIndex=");
      var7.append(var1);
      var7.append(", invite=");
      var7.append(var6);
      var7.append(", shouldAnimateEmoji=");
      var7.append(var4);
      var7.append(", shouldShowLinkDecorations=");
      var7.append(var2);
      var7.append(", shouldShowRoleDot=");
      var7.append(var3);
      var7.append(", shouldShowRoleOnName=");
      var7.append(var5);
      var7.append(")");
      return var7.toString();
   }
}
