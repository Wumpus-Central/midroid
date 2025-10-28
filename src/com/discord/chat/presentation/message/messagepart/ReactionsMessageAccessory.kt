package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.reaction.MessageReaction
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.primitives.MessageId
import com.discord.theme.DiscordTheme

public data class ReactionsMessageAccessory(messageId: MessageId,
   reactions: List<MessageReaction>,
   canAddNewReactions: Boolean,
   addReactionLabel: String,
   addNewReactionAccessibilityLabel: String,
   reactionsTheme: ReactionsTheme?,
   theme: DiscordTheme? = ...,
   targetKind: String? = ...,
   embedIndex: Int? = ...
) : ReactionsMessageAccessory(var1, var2, var3, var4, var5, var6, var7, var8, var9) {
   public open val messageId: MessageId
   public final val reactions: List<MessageReaction>
   public final val canAddNewReactions: Boolean
   public final val addReactionLabel: String
   public final val addNewReactionAccessibilityLabel: String
   public final val reactionsTheme: ReactionsTheme?
   public final val theme: DiscordTheme?
   public final val targetKind: String?
   public final val embedIndex: Int?

   fun ReactionsMessageAccessory(
      var1: java.lang.String,
      var2: MutableList<MessageReaction>,
      var3: Boolean,
      var4: java.lang.String,
      var5: java.lang.String,
      var6: ReactionsTheme,
      var7: DiscordTheme,
      var8: java.lang.String,
      var9: Int
   ) {
      super(var1, "reactions", false, null);
      this.messageId = var1;
      this.reactions = var2;
      this.canAddNewReactions = var3;
      this.addReactionLabel = var4;
      this.addNewReactionAccessibilityLabel = var5;
      this.reactionsTheme = var6;
      this.theme = var7;
      this.targetKind = var8;
      this.embedIndex = var9;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): List<MessageReaction> {
      return this.reactions;
   }

   public operator fun component3(): Boolean {
      return this.canAddNewReactions;
   }

   public operator fun component4(): String {
      return this.addReactionLabel;
   }

   public operator fun component5(): String {
      return this.addNewReactionAccessibilityLabel;
   }

   public operator fun component6(): ReactionsTheme? {
      return this.reactionsTheme;
   }

   public operator fun component7(): DiscordTheme? {
      return this.theme;
   }

   public operator fun component8(): String? {
      return this.targetKind;
   }

   public operator fun component9(): Int? {
      return this.embedIndex;
   }

   public fun copy(
      messageId: MessageId = ...,
      reactions: List<MessageReaction> = ...,
      canAddNewReactions: Boolean = ...,
      addReactionLabel: String = ...,
      addNewReactionAccessibilityLabel: String = ...,
      reactionsTheme: ReactionsTheme? = ...,
      theme: DiscordTheme? = ...,
      targetKind: String? = ...,
      embedIndex: Int? = ...
   ): ReactionsMessageAccessory {
      return new ReactionsMessageAccessory(var1, var2, var3, var4, var5, var6, var7, var8, var9, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ReactionsMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!(this.reactions == var1.reactions)) {
            return false;
         } else if (this.canAddNewReactions != var1.canAddNewReactions) {
            return false;
         } else if (!(this.addReactionLabel == var1.addReactionLabel)) {
            return false;
         } else if (!(this.addNewReactionAccessibilityLabel == var1.addNewReactionAccessibilityLabel)) {
            return false;
         } else if (!(this.reactionsTheme == var1.reactionsTheme)) {
            return false;
         } else if (this.theme != var1.theme) {
            return false;
         } else if (!(this.targetKind == var1.targetKind)) {
            return false;
         } else {
            return this.embedIndex == var1.embedIndex;
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = MessageId.hashCode-impl(this.messageId);
      val var5: Int = this.reactions.hashCode();
      val var9: Int = java.lang.Boolean.hashCode(this.canAddNewReactions);
      val var8: Int = this.addReactionLabel.hashCode();
      val var6: Int = this.addNewReactionAccessibilityLabel.hashCode();
      var var4: Int = 0;
      val var1: Int;
      if (this.reactionsTheme == null) {
         var1 = 0;
      } else {
         var1 = this.reactionsTheme.hashCode();
      }

      val var2: Int;
      if (this.theme == null) {
         var2 = 0;
      } else {
         var2 = this.theme.hashCode();
      }

      val var3: Int;
      if (this.targetKind == null) {
         var3 = 0;
      } else {
         var3 = this.targetKind.hashCode();
      }

      if (this.embedIndex != null) {
         var4 = this.embedIndex.hashCode();
      }

      return (((((((var7 * 31 + var5) * 31 + var9) * 31 + var8) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.messageId);
      val var3: java.util.List = this.reactions;
      val var1: Boolean = this.canAddNewReactions;
      val var9: java.lang.String = this.addReactionLabel;
      val var4: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var5: ReactionsTheme = this.reactionsTheme;
      val var7: DiscordTheme = this.theme;
      val var8: java.lang.String = this.targetKind;
      val var6: Int = this.embedIndex;
      val var10: StringBuilder = new StringBuilder();
      var10.append("ReactionsMessageAccessory(messageId=");
      var10.append(var2);
      var10.append(", reactions=");
      var10.append(var3);
      var10.append(", canAddNewReactions=");
      var10.append(var1);
      var10.append(", addReactionLabel=");
      var10.append(var9);
      var10.append(", addNewReactionAccessibilityLabel=");
      var10.append(var4);
      var10.append(", reactionsTheme=");
      var10.append(var5);
      var10.append(", theme=");
      var10.append(var7);
      var10.append(", targetKind=");
      var10.append(var8);
      var10.append(", embedIndex=");
      var10.append(var6);
      var10.append(")");
      return var10.toString();
   }
}
