package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.forums.ForumPostActions
import com.discord.chat.bridge.reaction.MessageReaction
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class ForumPostActionBar(messageId: MessageId,
   postActions: ForumPostActions,
   reactions: List<MessageReaction>?,
   canAddNewReactions: Boolean,
   addNewReactionAccessibilityLabel: String,
   reactionsTheme: ReactionsTheme?
) : ForumPostActionBar(var1, var2, var3, var4, var5, var6) {
   public final val addNewReactionAccessibilityLabel: String
   public final val canAddNewReactions: Boolean
   public open val messageId: MessageId
   public final val postActions: ForumPostActions
   public final val reactions: List<MessageReaction>?
   public final val reactionsTheme: ReactionsTheme?

   fun ForumPostActionBar(
      var1: java.lang.String, var2: ForumPostActions, var3: MutableList<MessageReaction>, var4: Boolean, var5: java.lang.String, var6: ReactionsTheme
   ) {
      super(var1, "post-actions", false, 4, null);
      this.messageId = var1;
      this.postActions = var2;
      this.reactions = var3;
      this.canAddNewReactions = var4;
      this.addNewReactionAccessibilityLabel = var5;
      this.reactionsTheme = var6;
   }

   public operator fun component1(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component2(): ForumPostActions {
      return this.postActions;
   }

   public operator fun component3(): List<MessageReaction>? {
      return this.reactions;
   }

   public operator fun component4(): Boolean {
      return this.canAddNewReactions;
   }

   public operator fun component5(): String {
      return this.addNewReactionAccessibilityLabel;
   }

   public operator fun component6(): ReactionsTheme? {
      return this.reactionsTheme;
   }

   public fun copy(
      messageId: MessageId = ...,
      postActions: ForumPostActions = ...,
      reactions: List<MessageReaction>? = ...,
      canAddNewReactions: Boolean = ...,
      addNewReactionAccessibilityLabel: String = ...,
      reactionsTheme: ReactionsTheme? = ...
   ): ForumPostActionBar {
      r.h(var1, "messageId");
      r.h(var2, "postActions");
      r.h(var5, "addNewReactionAccessibilityLabel");
      return new ForumPostActionBar(var1, var2, var3, var4, var5, var6, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ForumPostActionBar) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else if (!r.c(this.postActions, var1.postActions)) {
            return false;
         } else if (!r.c(this.reactions, var1.reactions)) {
            return false;
         } else if (this.canAddNewReactions != var1.canAddNewReactions) {
            return false;
         } else if (!r.c(this.addNewReactionAccessibilityLabel, var1.addNewReactionAccessibilityLabel)) {
            return false;
         } else {
            return r.c(this.reactionsTheme, var1.reactionsTheme);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = MessageId.hashCode-impl(this.getMessageId-3Eiw7ao());
      val var6: Int = this.postActions.hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.reactions == null) {
         var1 = 0;
      } else {
         var1 = this.reactions.hashCode();
      }

      var var2: Byte = this.canAddNewReactions;
      if (this.canAddNewReactions != 0) {
         var2 = 1;
      }

      val var8: Int = this.addNewReactionAccessibilityLabel.hashCode();
      if (this.reactionsTheme != null) {
         var3 = this.reactionsTheme.hashCode();
      }

      return ((((var5 * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var8) * 31 + var3;
   }

   public override fun toString(): String {
      val var5: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var4: ForumPostActions = this.postActions;
      val var7: java.util.List = this.reactions;
      val var1: Boolean = this.canAddNewReactions;
      val var3: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var6: ReactionsTheme = this.reactionsTheme;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ForumPostActionBar(messageId=");
      var2.append(var5);
      var2.append(", postActions=");
      var2.append(var4);
      var2.append(", reactions=");
      var2.append(var7);
      var2.append(", canAddNewReactions=");
      var2.append(var1);
      var2.append(", addNewReactionAccessibilityLabel=");
      var2.append(var3);
      var2.append(", reactionsTheme=");
      var2.append(var6);
      var2.append(")");
      return var2.toString();
   }
}
