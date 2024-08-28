package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.reaction.MessageReaction
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.primitives.MessageId
import com.discord.theme.DiscordTheme
import kotlin.jvm.internal.r

public data class ReactionsMessageAccessory(messageId: MessageId,
   reactions: List<MessageReaction>,
   canAddNewReactions: Boolean,
   canAddNewBurstReactions: Boolean,
   addReactionLabel: String,
   addNewReactionAccessibilityLabel: String,
   addNewBurstReactionAccessibilityLabel: String,
   reactionsTheme: ReactionsTheme?,
   theme: DiscordTheme? = ...
) : ReactionsMessageAccessory(var1, var2, var3, var4, var5, var6, var7, var8, var9) {
   public final val addNewBurstReactionAccessibilityLabel: String
   public final val addNewReactionAccessibilityLabel: String
   public final val addReactionLabel: String
   public final val canAddNewBurstReactions: Boolean
   public final val canAddNewReactions: Boolean
   public open val messageId: MessageId
   public final val reactions: List<MessageReaction>
   public final val reactionsTheme: ReactionsTheme?
   public final val theme: DiscordTheme?

   fun ReactionsMessageAccessory(
      var1: java.lang.String,
      var2: MutableList<MessageReaction>,
      var3: Boolean,
      var4: Boolean,
      var5: java.lang.String,
      var6: java.lang.String,
      var7: java.lang.String,
      var8: ReactionsTheme,
      var9: DiscordTheme
   ) {
      super(var1, "reactions", false, null);
      this.messageId = var1;
      this.reactions = var2;
      this.canAddNewReactions = var3;
      this.canAddNewBurstReactions = var4;
      this.addReactionLabel = var5;
      this.addNewReactionAccessibilityLabel = var6;
      this.addNewBurstReactionAccessibilityLabel = var7;
      this.reactionsTheme = var8;
      this.theme = var9;
   }

   public operator fun component1(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component2(): List<MessageReaction> {
      return this.reactions;
   }

   public operator fun component3(): Boolean {
      return this.canAddNewReactions;
   }

   public operator fun component4(): Boolean {
      return this.canAddNewBurstReactions;
   }

   public operator fun component5(): String {
      return this.addReactionLabel;
   }

   public operator fun component6(): String {
      return this.addNewReactionAccessibilityLabel;
   }

   public operator fun component7(): String {
      return this.addNewBurstReactionAccessibilityLabel;
   }

   public operator fun component8(): ReactionsTheme? {
      return this.reactionsTheme;
   }

   public operator fun component9(): DiscordTheme? {
      return this.theme;
   }

   public fun copy(
      messageId: MessageId = ...,
      reactions: List<MessageReaction> = ...,
      canAddNewReactions: Boolean = ...,
      canAddNewBurstReactions: Boolean = ...,
      addReactionLabel: String = ...,
      addNewReactionAccessibilityLabel: String = ...,
      addNewBurstReactionAccessibilityLabel: String = ...,
      reactionsTheme: ReactionsTheme? = ...,
      theme: DiscordTheme? = ...
   ): ReactionsMessageAccessory {
      r.h(var1, "messageId");
      r.h(var2, "reactions");
      r.h(var5, "addReactionLabel");
      r.h(var6, "addNewReactionAccessibilityLabel");
      r.h(var7, "addNewBurstReactionAccessibilityLabel");
      return new ReactionsMessageAccessory(var1, var2, var3, var4, var5, var6, var7, var8, var9, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ReactionsMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else if (!r.c(this.reactions, var1.reactions)) {
            return false;
         } else if (this.canAddNewReactions != var1.canAddNewReactions) {
            return false;
         } else if (this.canAddNewBurstReactions != var1.canAddNewBurstReactions) {
            return false;
         } else if (!r.c(this.addReactionLabel, var1.addReactionLabel)) {
            return false;
         } else if (!r.c(this.addNewReactionAccessibilityLabel, var1.addNewReactionAccessibilityLabel)) {
            return false;
         } else if (!r.c(this.addNewBurstReactionAccessibilityLabel, var1.addNewBurstReactionAccessibilityLabel)) {
            return false;
         } else if (!r.c(this.reactionsTheme, var1.reactionsTheme)) {
            return false;
         } else {
            return this.theme === var1.theme;
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = MessageId.hashCode-impl(this.getMessageId-3Eiw7ao());
      val var5: Int = this.reactions.hashCode();
      var var2: Byte = 1;
      var var1: Byte = this.canAddNewReactions;
      if (this.canAddNewReactions != 0) {
         var1 = 1;
      }

      if (this.canAddNewBurstReactions == 0) {
         var2 = this.canAddNewBurstReactions;
      }

      val var7: Int = this.addReactionLabel.hashCode();
      val var9: Int = this.addNewReactionAccessibilityLabel.hashCode();
      val var8: Int = this.addNewBurstReactionAccessibilityLabel.hashCode();
      var var4: Int = 0;
      val var12: Int;
      if (this.reactionsTheme == null) {
         var12 = 0;
      } else {
         var12 = this.reactionsTheme.hashCode();
      }

      if (this.theme != null) {
         var4 = this.theme.hashCode();
      }

      return (((((((var6 * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var7) * 31 + var9) * 31 + var8) * 31 + var12) * 31 + var4;
   }

   public override fun toString(): String {
      val var5: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var6: java.util.List = this.reactions;
      val var2: Boolean = this.canAddNewReactions;
      val var1: Boolean = this.canAddNewBurstReactions;
      val var10: java.lang.String = this.addReactionLabel;
      val var4: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var8: java.lang.String = this.addNewBurstReactionAccessibilityLabel;
      val var9: ReactionsTheme = this.reactionsTheme;
      val var7: DiscordTheme = this.theme;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ReactionsMessageAccessory(messageId=");
      var3.append(var5);
      var3.append(", reactions=");
      var3.append(var6);
      var3.append(", canAddNewReactions=");
      var3.append(var2);
      var3.append(", canAddNewBurstReactions=");
      var3.append(var1);
      var3.append(", addReactionLabel=");
      var3.append(var10);
      var3.append(", addNewReactionAccessibilityLabel=");
      var3.append(var4);
      var3.append(", addNewBurstReactionAccessibilityLabel=");
      var3.append(var8);
      var3.append(", reactionsTheme=");
      var3.append(var9);
      var3.append(", theme=");
      var3.append(var7);
      var3.append(")");
      return var3.toString();
   }
}
