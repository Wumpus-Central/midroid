package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.forums.ForumPostActions
import com.discord.chat.bridge.reaction.MessageReaction
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

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
      q.h(var1, "messageId");
      q.h(var2, "postActions");
      q.h(var5, "addNewReactionAccessibilityLabel");
      super(var1, "post-actions", false, 4, null);
      this.messageId = var1;
      this.postActions = var2;
      this.reactions = var3;
      this.canAddNewReactions = var4;
      this.addNewReactionAccessibilityLabel = var5;
      this.reactionsTheme = var6;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
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
      q.h(var1, "messageId");
      q.h(var2, "postActions");
      q.h(var5, "addNewReactionAccessibilityLabel");
      return new ForumPostActionBar(var1, var2, var3, var4, var5, var6, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ForumPostActionBar) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.postActions, var1.postActions)) {
            return false;
         } else if (!q.c(this.reactions, var1.reactions)) {
            return false;
         } else if (this.canAddNewReactions != var1.canAddNewReactions) {
            return false;
         } else if (!q.c(this.addNewReactionAccessibilityLabel, var1.addNewReactionAccessibilityLabel)) {
            return false;
         } else {
            return q.c(this.reactionsTheme, var1.reactionsTheme);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = MessageId.hashCode-impl(this.messageId);
      val var3: Int = this.postActions.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.reactions == null) {
         var1 = 0;
      } else {
         var1 = this.reactions.hashCode();
      }

      val var5: Int = java.lang.Boolean.hashCode(this.canAddNewReactions);
      val var6: Int = this.addNewReactionAccessibilityLabel.hashCode();
      if (this.reactionsTheme != null) {
         var2 = this.reactionsTheme.hashCode();
      }

      return ((((var4 * 31 + var3) * 31 + var1) * 31 + var5) * 31 + var6) * 31 + var2;
   }

   public override fun toString(): String {
      val var7: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: ForumPostActions = this.postActions;
      val var4: java.util.List = this.reactions;
      val var1: Boolean = this.canAddNewReactions;
      val var6: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var3: ReactionsTheme = this.reactionsTheme;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ForumPostActionBar(messageId=");
      var5.append(var7);
      var5.append(", postActions=");
      var5.append(var2);
      var5.append(", reactions=");
      var5.append(var4);
      var5.append(", canAddNewReactions=");
      var5.append(var1);
      var5.append(", addNewReactionAccessibilityLabel=");
      var5.append(var6);
      var5.append(", reactionsTheme=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }
}
