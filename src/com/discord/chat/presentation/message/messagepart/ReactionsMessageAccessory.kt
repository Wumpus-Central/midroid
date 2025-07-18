package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.reaction.MessageReaction
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.primitives.MessageId
import com.discord.theme.DiscordTheme
import kotlin.jvm.internal.r

public data class ReactionsMessageAccessory(messageId: MessageId,
   reactions: List<MessageReaction>,
   canAddNewReactions: Boolean,
   addReactionLabel: String,
   addNewReactionAccessibilityLabel: String,
   reactionsTheme: ReactionsTheme?,
   theme: DiscordTheme? = ...,
   showReactionShortcut: Boolean = ...,
   showReplyShortcut: Boolean = ...,
   showForwardShortcut: Boolean = ...,
   showThreadShortcut: Boolean = ...,
   shortcutsEnabled: Boolean = ...,
   targetKind: String? = ...,
   embedIndex: Int? = ...,
   replyAccessibilityLabel: String? = ...,
   forwardAccessibilityLabel: String? = ...,
   threadAccessibilityLabel: String? = ...
) : ReactionsMessageAccessory(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17) {
   public open val messageId: MessageId
   public final val reactions: List<MessageReaction>
   public final val canAddNewReactions: Boolean
   public final val addReactionLabel: String
   public final val addNewReactionAccessibilityLabel: String
   public final val reactionsTheme: ReactionsTheme?
   public final val theme: DiscordTheme?
   public final val showReactionShortcut: Boolean
   public final val showReplyShortcut: Boolean
   public final val showForwardShortcut: Boolean
   public final val showThreadShortcut: Boolean
   public final val shortcutsEnabled: Boolean
   public final val targetKind: String?
   public final val embedIndex: Int?
   public final val replyAccessibilityLabel: String?
   public final val forwardAccessibilityLabel: String?

   public final var threadAccessibilityLabel: String?
      internal set

   fun ReactionsMessageAccessory(
      var1: java.lang.String,
      var2: MutableList<MessageReaction>,
      var3: Boolean,
      var4: java.lang.String,
      var5: java.lang.String,
      var6: ReactionsTheme,
      var7: DiscordTheme,
      var8: Boolean,
      var9: Boolean,
      var10: Boolean,
      var11: Boolean,
      var12: Boolean,
      var13: java.lang.String,
      var14: Int,
      var15: java.lang.String,
      var16: java.lang.String,
      var17: java.lang.String
   ) {
      r.h(var1, "messageId");
      r.h(var2, "reactions");
      r.h(var4, "addReactionLabel");
      r.h(var5, "addNewReactionAccessibilityLabel");
      super(var1, "reactions", false, null);
      this.messageId = var1;
      this.reactions = var2;
      this.canAddNewReactions = var3;
      this.addReactionLabel = var4;
      this.addNewReactionAccessibilityLabel = var5;
      this.reactionsTheme = var6;
      this.theme = var7;
      this.showReactionShortcut = var8;
      this.showReplyShortcut = var9;
      this.showForwardShortcut = var10;
      this.showThreadShortcut = var11;
      this.shortcutsEnabled = var12;
      this.targetKind = var13;
      this.embedIndex = var14;
      this.replyAccessibilityLabel = var15;
      this.forwardAccessibilityLabel = var16;
      this.threadAccessibilityLabel = var17;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component10(): Boolean {
      return this.showForwardShortcut;
   }

   public operator fun component11(): Boolean {
      return this.showThreadShortcut;
   }

   public operator fun component12(): Boolean {
      return this.shortcutsEnabled;
   }

   public operator fun component13(): String? {
      return this.targetKind;
   }

   public operator fun component14(): Int? {
      return this.embedIndex;
   }

   public operator fun component15(): String? {
      return this.replyAccessibilityLabel;
   }

   public operator fun component16(): String? {
      return this.forwardAccessibilityLabel;
   }

   public operator fun component17(): String? {
      return this.threadAccessibilityLabel;
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

   public operator fun component8(): Boolean {
      return this.showReactionShortcut;
   }

   public operator fun component9(): Boolean {
      return this.showReplyShortcut;
   }

   public fun copy(
      messageId: MessageId = ...,
      reactions: List<MessageReaction> = ...,
      canAddNewReactions: Boolean = ...,
      addReactionLabel: String = ...,
      addNewReactionAccessibilityLabel: String = ...,
      reactionsTheme: ReactionsTheme? = ...,
      theme: DiscordTheme? = ...,
      showReactionShortcut: Boolean = ...,
      showReplyShortcut: Boolean = ...,
      showForwardShortcut: Boolean = ...,
      showThreadShortcut: Boolean = ...,
      shortcutsEnabled: Boolean = ...,
      targetKind: String? = ...,
      embedIndex: Int? = ...,
      replyAccessibilityLabel: String? = ...,
      forwardAccessibilityLabel: String? = ...,
      threadAccessibilityLabel: String? = ...
   ): ReactionsMessageAccessory {
      r.h(var1, "messageId");
      r.h(var2, "reactions");
      r.h(var4, "addReactionLabel");
      r.h(var5, "addNewReactionAccessibilityLabel");
      return new ReactionsMessageAccessory(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, null);
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
         } else if (!r.c(this.reactions, var1.reactions)) {
            return false;
         } else if (this.canAddNewReactions != var1.canAddNewReactions) {
            return false;
         } else if (!r.c(this.addReactionLabel, var1.addReactionLabel)) {
            return false;
         } else if (!r.c(this.addNewReactionAccessibilityLabel, var1.addNewReactionAccessibilityLabel)) {
            return false;
         } else if (!r.c(this.reactionsTheme, var1.reactionsTheme)) {
            return false;
         } else if (this.theme != var1.theme) {
            return false;
         } else if (this.showReactionShortcut != var1.showReactionShortcut) {
            return false;
         } else if (this.showReplyShortcut != var1.showReplyShortcut) {
            return false;
         } else if (this.showForwardShortcut != var1.showForwardShortcut) {
            return false;
         } else if (this.showThreadShortcut != var1.showThreadShortcut) {
            return false;
         } else if (this.shortcutsEnabled != var1.shortcutsEnabled) {
            return false;
         } else if (!r.c(this.targetKind, var1.targetKind)) {
            return false;
         } else if (!r.c(this.embedIndex, var1.embedIndex)) {
            return false;
         } else if (!r.c(this.replyAccessibilityLabel, var1.replyAccessibilityLabel)) {
            return false;
         } else if (!r.c(this.forwardAccessibilityLabel, var1.forwardAccessibilityLabel)) {
            return false;
         } else {
            return r.c(this.threadAccessibilityLabel, var1.threadAccessibilityLabel);
         }
      }
   }

   public override fun hashCode(): Int {
      val var10: Int = MessageId.hashCode-impl(this.messageId);
      val var9: Int = this.reactions.hashCode();
      val var12: Int = java.lang.Boolean.hashCode(this.canAddNewReactions);
      val var11: Int = this.addReactionLabel.hashCode();
      val var8: Int = this.addNewReactionAccessibilityLabel.hashCode();
      var var7: Int = 0;
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

      val var14: Int = java.lang.Boolean.hashCode(this.showReactionShortcut);
      val var16: Int = java.lang.Boolean.hashCode(this.showReplyShortcut);
      val var17: Int = java.lang.Boolean.hashCode(this.showForwardShortcut);
      val var15: Int = java.lang.Boolean.hashCode(this.showThreadShortcut);
      val var13: Int = java.lang.Boolean.hashCode(this.shortcutsEnabled);
      val var3: Int;
      if (this.targetKind == null) {
         var3 = 0;
      } else {
         var3 = this.targetKind.hashCode();
      }

      val var4: Int;
      if (this.embedIndex == null) {
         var4 = 0;
      } else {
         var4 = this.embedIndex.hashCode();
      }

      val var5: Int;
      if (this.replyAccessibilityLabel == null) {
         var5 = 0;
      } else {
         var5 = this.replyAccessibilityLabel.hashCode();
      }

      val var6: Int;
      if (this.forwardAccessibilityLabel == null) {
         var6 = 0;
      } else {
         var6 = this.forwardAccessibilityLabel.hashCode();
      }

      if (this.threadAccessibilityLabel != null) {
         var7 = this.threadAccessibilityLabel.hashCode();
      }

      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (
                                                                                       (
                                                                                                (
                                                                                                         (
                                                                                                                  (
                                                                                                                           ((var10 * 31 + var9) * 31 + var12)
                                                                                                                                 * 31
                                                                                                                              + var11
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var8
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var1
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var2
                                                                                             )
                                                                                             * 31
                                                                                          + var14
                                                                                    )
                                                                                    * 31
                                                                                 + var16
                                                                           )
                                                                           * 31
                                                                        + var17
                                                                  )
                                                                  * 31
                                                               + var15
                                                         )
                                                         * 31
                                                      + var13
                                                )
                                                * 31
                                             + var3
                                       )
                                       * 31
                                    + var4
                              )
                              * 31
                           + var5
                     )
                     * 31
                  + var6
            )
            * 31
         + var7;
   }

   public override fun toString(): String {
      val var12: java.lang.String = MessageId.toString-impl(this.messageId);
      val var18: java.util.List = this.reactions;
      val var4: Boolean = this.canAddNewReactions;
      val var14: java.lang.String = this.addReactionLabel;
      val var17: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var9: ReactionsTheme = this.reactionsTheme;
      val var7: DiscordTheme = this.theme;
      val var3: Boolean = this.showReactionShortcut;
      val var6: Boolean = this.showReplyShortcut;
      val var5: Boolean = this.showForwardShortcut;
      val var1: Boolean = this.showThreadShortcut;
      val var2: Boolean = this.shortcutsEnabled;
      val var8: java.lang.String = this.targetKind;
      val var16: Int = this.embedIndex;
      val var10: java.lang.String = this.replyAccessibilityLabel;
      val var15: java.lang.String = this.forwardAccessibilityLabel;
      val var13: java.lang.String = this.threadAccessibilityLabel;
      val var11: StringBuilder = new StringBuilder();
      var11.append("ReactionsMessageAccessory(messageId=");
      var11.append(var12);
      var11.append(", reactions=");
      var11.append(var18);
      var11.append(", canAddNewReactions=");
      var11.append(var4);
      var11.append(", addReactionLabel=");
      var11.append(var14);
      var11.append(", addNewReactionAccessibilityLabel=");
      var11.append(var17);
      var11.append(", reactionsTheme=");
      var11.append(var9);
      var11.append(", theme=");
      var11.append(var7);
      var11.append(", showReactionShortcut=");
      var11.append(var3);
      var11.append(", showReplyShortcut=");
      var11.append(var6);
      var11.append(", showForwardShortcut=");
      var11.append(var5);
      var11.append(", showThreadShortcut=");
      var11.append(var1);
      var11.append(", shortcutsEnabled=");
      var11.append(var2);
      var11.append(", targetKind=");
      var11.append(var8);
      var11.append(", embedIndex=");
      var11.append(var16);
      var11.append(", replyAccessibilityLabel=");
      var11.append(var10);
      var11.append(", forwardAccessibilityLabel=");
      var11.append(var15);
      var11.append(", threadAccessibilityLabel=");
      var11.append(var13);
      var11.append(")");
      return var11.toString();
   }
}
