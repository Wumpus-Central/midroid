package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.codedlinks.GuildEventInviteEmbedImpl
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

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
      return this.getMessageId-3Eiw7ao();
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
      r.h(var1, "messageId");
      r.h(var3, "invite");
      return new GuildEventInviteMessageAccessory(var1, var2, var3, var4, var5, var6, var7, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GuildEventInviteMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else if (this.codedLinkIndex != var1.codedLinkIndex) {
            return false;
         } else if (!r.c(this.invite, var1.invite)) {
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
      val var6: Int = MessageId.hashCode-impl(this.getMessageId-3Eiw7ao());
      val var7: Int = Integer.hashCode(this.codedLinkIndex);
      val var8: Int = this.invite.hashCode();
      var var4: Byte = 1;
      var var1: Byte = this.shouldAnimateEmoji;
      if (this.shouldAnimateEmoji != 0) {
         var1 = 1;
      }

      var var9: Byte = this.shouldShowLinkDecorations;
      if (this.shouldShowLinkDecorations != 0) {
         var9 = 1;
      }

      var var10: Byte = this.shouldShowRoleDot;
      if (this.shouldShowRoleDot != 0) {
         var10 = 1;
      }

      if (this.shouldShowRoleOnName == 0) {
         var4 = this.shouldShowRoleOnName;
      }

      return (((((var6 * 31 + var7) * 31 + var8) * 31 + var1) * 31 + var9) * 31 + var10) * 31 + var4;
   }

   public override fun toString(): String {
      val var6: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var1: Int = this.codedLinkIndex;
      val var7: GuildEventInviteEmbedImpl = this.invite;
      val var3: Boolean = this.shouldAnimateEmoji;
      val var4: Boolean = this.shouldShowLinkDecorations;
      val var2: Boolean = this.shouldShowRoleDot;
      val var5: Boolean = this.shouldShowRoleOnName;
      val var8: StringBuilder = new StringBuilder();
      var8.append("GuildEventInviteMessageAccessory(messageId=");
      var8.append(var6);
      var8.append(", codedLinkIndex=");
      var8.append(var1);
      var8.append(", invite=");
      var8.append(var7);
      var8.append(", shouldAnimateEmoji=");
      var8.append(var3);
      var8.append(", shouldShowLinkDecorations=");
      var8.append(var4);
      var8.append(", shouldShowRoleDot=");
      var8.append(var2);
      var8.append(", shouldShowRoleOnName=");
      var8.append(var5);
      var8.append(")");
      return var8.toString();
   }
}
