package com.discord.chat.presentation.message.messagepart

import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class RoleSubscriptionPurchaseAccessory(messageId: MessageId,
   authorUsername: String?,
   authorAvatar: String?,
   constrainedWidth: Int,
   isForwardedContent: Boolean
) : RoleSubscriptionPurchaseAccessory(var1, var2, var3, var4, var5) {
   public final val authorAvatar: String?
   public final val authorUsername: String?
   public final val constrainedWidth: Int
   public final val isForwardedContent: Boolean
   public open val messageId: MessageId

   fun RoleSubscriptionPurchaseAccessory(var1: java.lang.String, var2: java.lang.String, var3: java.lang.String, var4: Int, var5: Boolean) {
      q.h(var1, "messageId");
      super(var1, "role subscription purchase", false, 4, null);
      this.messageId = var1;
      this.authorUsername = var2;
      this.authorAvatar = var3;
      this.constrainedWidth = var4;
      this.isForwardedContent = var5;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): String? {
      return this.authorUsername;
   }

   public operator fun component3(): String? {
      return this.authorAvatar;
   }

   public operator fun component4(): Int {
      return this.constrainedWidth;
   }

   public operator fun component5(): Boolean {
      return this.isForwardedContent;
   }

   public fun copy(
      messageId: MessageId = ...,
      authorUsername: String? = ...,
      authorAvatar: String? = ...,
      constrainedWidth: Int = ...,
      isForwardedContent: Boolean = ...
   ): RoleSubscriptionPurchaseAccessory {
      q.h(var1, "messageId");
      return new RoleSubscriptionPurchaseAccessory(var1, var2, var3, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is RoleSubscriptionPurchaseAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.authorUsername, var1.authorUsername)) {
            return false;
         } else if (!q.c(this.authorAvatar, var1.authorAvatar)) {
            return false;
         } else if (this.constrainedWidth != var1.constrainedWidth) {
            return false;
         } else {
            return this.isForwardedContent == var1.isForwardedContent;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = MessageId.hashCode-impl(this.messageId);
      var var2: Int = 0;
      val var1: Int;
      if (this.authorUsername == null) {
         var1 = 0;
      } else {
         var1 = this.authorUsername.hashCode();
      }

      if (this.authorAvatar != null) {
         var2 = this.authorAvatar.hashCode();
      }

      return (((var3 * 31 + var1) * 31 + var2) * 31 + Integer.hashCode(this.constrainedWidth)) * 31 + java.lang.Boolean.hashCode(this.isForwardedContent);
   }

   public override fun toString(): String {
      val var5: java.lang.String = MessageId.toString-impl(this.messageId);
      val var4: java.lang.String = this.authorUsername;
      val var3: java.lang.String = this.authorAvatar;
      val var1: Int = this.constrainedWidth;
      val var2: Boolean = this.isForwardedContent;
      val var6: StringBuilder = new StringBuilder();
      var6.append("RoleSubscriptionPurchaseAccessory(messageId=");
      var6.append(var5);
      var6.append(", authorUsername=");
      var6.append(var4);
      var6.append(", authorAvatar=");
      var6.append(var3);
      var6.append(", constrainedWidth=");
      var6.append(var1);
      var6.append(", isForwardedContent=");
      var6.append(var2);
      var6.append(")");
      return var6.toString();
   }
}
