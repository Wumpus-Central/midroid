package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.reaction.MessageReaction
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.primitives.MessageId
import com.discord.theme.DiscordTheme
import kotlin.jvm.internal.q

public data class ReactionsMessageAccessory(messageId: MessageId,
   reactions: List<MessageReaction>,
   canAddNewReactions: Boolean,
   canAddNewBurstReactions: Boolean,
   addReactionLabel: String,
   addNewReactionAccessibilityLabel: String,
   addNewBurstReactionAccessibilityLabel: String,
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
) : ReactionsMessageAccessory(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19) {
   public open val messageId: MessageId
   public final val reactions: List<MessageReaction>
   public final val canAddNewReactions: Boolean
   public final val canAddNewBurstReactions: Boolean
   public final val addReactionLabel: String
   public final val addNewReactionAccessibilityLabel: String
   public final val addNewBurstReactionAccessibilityLabel: String
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
      var4: Boolean,
      var5: java.lang.String,
      var6: java.lang.String,
      var7: java.lang.String,
      var8: ReactionsTheme,
      var9: DiscordTheme,
      var10: Boolean,
      var11: Boolean,
      var12: Boolean,
      var13: Boolean,
      var14: Boolean,
      var15: java.lang.String,
      var16: Int,
      var17: java.lang.String,
      var18: java.lang.String,
      var19: java.lang.String
   ) {
      q.h(var1, "messageId");
      q.h(var2, "reactions");
      q.h(var5, "addReactionLabel");
      q.h(var6, "addNewReactionAccessibilityLabel");
      q.h(var7, "addNewBurstReactionAccessibilityLabel");
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
      this.showReactionShortcut = var10;
      this.showReplyShortcut = var11;
      this.showForwardShortcut = var12;
      this.showThreadShortcut = var13;
      this.shortcutsEnabled = var14;
      this.targetKind = var15;
      this.embedIndex = var16;
      this.replyAccessibilityLabel = var17;
      this.forwardAccessibilityLabel = var18;
      this.threadAccessibilityLabel = var19;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component10(): Boolean {
      return this.showReactionShortcut;
   }

   public operator fun component11(): Boolean {
      return this.showReplyShortcut;
   }

   public operator fun component12(): Boolean {
      return this.showForwardShortcut;
   }

   public operator fun component13(): Boolean {
      return this.showThreadShortcut;
   }

   public operator fun component14(): Boolean {
      return this.shortcutsEnabled;
   }

   public operator fun component15(): String? {
      return this.targetKind;
   }

   public operator fun component16(): Int? {
      return this.embedIndex;
   }

   public operator fun component17(): String? {
      return this.replyAccessibilityLabel;
   }

   public operator fun component18(): String? {
      return this.forwardAccessibilityLabel;
   }

   public operator fun component19(): String? {
      return this.threadAccessibilityLabel;
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
      q.h(var1, "messageId");
      q.h(var2, "reactions");
      q.h(var5, "addReactionLabel");
      q.h(var6, "addNewReactionAccessibilityLabel");
      q.h(var7, "addNewBurstReactionAccessibilityLabel");
      return new ReactionsMessageAccessory(
         var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, null
      );
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
         } else if (!q.c(this.reactions, var1.reactions)) {
            return false;
         } else if (this.canAddNewReactions != var1.canAddNewReactions) {
            return false;
         } else if (this.canAddNewBurstReactions != var1.canAddNewBurstReactions) {
            return false;
         } else if (!q.c(this.addReactionLabel, var1.addReactionLabel)) {
            return false;
         } else if (!q.c(this.addNewReactionAccessibilityLabel, var1.addNewReactionAccessibilityLabel)) {
            return false;
         } else if (!q.c(this.addNewBurstReactionAccessibilityLabel, var1.addNewBurstReactionAccessibilityLabel)) {
            return false;
         } else if (!q.c(this.reactionsTheme, var1.reactionsTheme)) {
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
         } else if (!q.c(this.targetKind, var1.targetKind)) {
            return false;
         } else if (!q.c(this.embedIndex, var1.embedIndex)) {
            return false;
         } else if (!q.c(this.replyAccessibilityLabel, var1.replyAccessibilityLabel)) {
            return false;
         } else if (!q.c(this.forwardAccessibilityLabel, var1.forwardAccessibilityLabel)) {
            return false;
         } else {
            return q.c(this.threadAccessibilityLabel, var1.threadAccessibilityLabel);
         }
      }
   }

   public override fun hashCode(): Int {
      val var8: Int = MessageId.hashCode-impl(this.messageId);
      val var11: Int = this.reactions.hashCode();
      val var12: Int = java.lang.Boolean.hashCode(this.canAddNewReactions);
      val var9: Int = java.lang.Boolean.hashCode(this.canAddNewBurstReactions);
      val var14: Int = this.addReactionLabel.hashCode();
      val var10: Int = this.addNewReactionAccessibilityLabel.hashCode();
      val var13: Int = this.addNewBurstReactionAccessibilityLabel.hashCode();
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

      val var16: Int = java.lang.Boolean.hashCode(this.showReactionShortcut);
      val var15: Int = java.lang.Boolean.hashCode(this.showReplyShortcut);
      val var19: Int = java.lang.Boolean.hashCode(this.showForwardShortcut);
      val var17: Int = java.lang.Boolean.hashCode(this.showThreadShortcut);
      val var18: Int = java.lang.Boolean.hashCode(this.shortcutsEnabled);
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
                                                                                                                           (
                                                                                                                                    (
                                                                                                                                             (
                                                                                                                                                      (
                                                                                                                                                               var8
                                                                                                                                                                     * 31
                                                                                                                                                                  + var11
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var12
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var9
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var14
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var10
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var13
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var1
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var2
                                                                                             )
                                                                                             * 31
                                                                                          + var16
                                                                                    )
                                                                                    * 31
                                                                                 + var15
                                                                           )
                                                                           * 31
                                                                        + var19
                                                                  )
                                                                  * 31
                                                               + var17
                                                         )
                                                         * 31
                                                      + var18
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
      val var14: java.lang.String = MessageId.toString-impl(this.messageId);
      val var9: java.util.List = this.reactions;
      val var7: Boolean = this.canAddNewReactions;
      val var5: Boolean = this.canAddNewBurstReactions;
      val var17: java.lang.String = this.addReactionLabel;
      val var19: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var13: java.lang.String = this.addNewBurstReactionAccessibilityLabel;
      val var12: ReactionsTheme = this.reactionsTheme;
      val var15: DiscordTheme = this.theme;
      val var4: Boolean = this.showReactionShortcut;
      val var1: Boolean = this.showReplyShortcut;
      val var3: Boolean = this.showForwardShortcut;
      val var2: Boolean = this.showThreadShortcut;
      val var6: Boolean = this.shortcutsEnabled;
      val var20: java.lang.String = this.targetKind;
      val var16: Int = this.embedIndex;
      val var10: java.lang.String = this.replyAccessibilityLabel;
      val var11: java.lang.String = this.forwardAccessibilityLabel;
      val var18: java.lang.String = this.threadAccessibilityLabel;
      val var8: StringBuilder = new StringBuilder();
      var8.append("ReactionsMessageAccessory(messageId=");
      var8.append(var14);
      var8.append(", reactions=");
      var8.append(var9);
      var8.append(", canAddNewReactions=");
      var8.append(var7);
      var8.append(", canAddNewBurstReactions=");
      var8.append(var5);
      var8.append(", addReactionLabel=");
      var8.append(var17);
      var8.append(", addNewReactionAccessibilityLabel=");
      var8.append(var19);
      var8.append(", addNewBurstReactionAccessibilityLabel=");
      var8.append(var13);
      var8.append(", reactionsTheme=");
      var8.append(var12);
      var8.append(", theme=");
      var8.append(var15);
      var8.append(", showReactionShortcut=");
      var8.append(var4);
      var8.append(", showReplyShortcut=");
      var8.append(var1);
      var8.append(", showForwardShortcut=");
      var8.append(var3);
      var8.append(", showThreadShortcut=");
      var8.append(var2);
      var8.append(", shortcutsEnabled=");
      var8.append(var6);
      var8.append(", targetKind=");
      var8.append(var20);
      var8.append(", embedIndex=");
      var8.append(var16);
      var8.append(", replyAccessibilityLabel=");
      var8.append(var10);
      var8.append(", forwardAccessibilityLabel=");
      var8.append(var11);
      var8.append(", threadAccessibilityLabel=");
      var8.append(var18);
      var8.append(")");
      return var8.toString();
   }
}
