package com.discord.chat.bridge.row

import Za.f
import com.discord.chat.bridge.BackgroundHighlight
import com.discord.chat.bridge.ChangeType
import com.discord.chat.bridge.MessageBase
import com.discord.chat.bridge.SwipeActionsType
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.chat.bridge.truncation.Truncation
import com.discord.chat.presentation.root.MessageContextType
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class MessageRow(index: Int,
      changeType: ChangeType,
      jumped: Boolean? = null,
      message: MessageBase,
      canAddNewReactions: Boolean? = null,
      addReactionLabel: String? = null,
      addNewReactionAccessibilityLabel: String? = null,
      addNewBurstReactionAccessibilityLabel: String? = null,
      reactionsTheme: ReactionsTheme? = null,
      renderContentOnly: Boolean = false,
      messageFrame: MessageFrame? = null,
      reactTag: Int? = null,
      truncation: Truncation? = null,
      backgroundHighlight: BackgroundHighlight? = null,
      swipeActions: SwipeActionsType = SwipeActionsType.NONE,
      contextType: MessageContextType? = ...,
      replyAccessibilityLabel: String? = ...,
      forwardAccessibilityLabel: String? = ...,
      threadAccessibilityLabel: String? = null
   )
   : Row {
   public open val index: Int
   public open val changeType: ChangeType
   public final val jumped: Boolean?

   @f(
      with = MessageSerializer.class
   )
   public final val message: MessageBase

   public final val canAddNewReactions: Boolean?
   public final val addReactionLabel: String?
   public final val addNewReactionAccessibilityLabel: String?
   public final val addNewBurstReactionAccessibilityLabel: String?
   public final val reactionsTheme: ReactionsTheme?
   public final val renderContentOnly: Boolean
   public final val messageFrame: MessageFrame?
   public final val reactTag: Int?
   public final val truncation: Truncation?
   public final val backgroundHighlight: BackgroundHighlight?
   public final val swipeActions: SwipeActionsType
   public final val contextType: MessageContextType?
   public final val replyAccessibilityLabel: String?
   public final val forwardAccessibilityLabel: String?
   public final val threadAccessibilityLabel: String?

   init {
      q.h(var2, "changeType");
      q.h(var4, "message");
      q.h(var15, "swipeActions");
      super(null);
      this.index = var1;
      this.changeType = var2;
      this.jumped = var3;
      this.message = var4;
      this.canAddNewReactions = var5;
      this.addReactionLabel = var6;
      this.addNewReactionAccessibilityLabel = var7;
      this.addNewBurstReactionAccessibilityLabel = var8;
      this.reactionsTheme = var9;
      this.renderContentOnly = var10;
      this.messageFrame = var11;
      this.reactTag = var12;
      this.truncation = var13;
      this.backgroundHighlight = var14;
      this.swipeActions = var15;
      this.contextType = var16;
      this.replyAccessibilityLabel = var17;
      this.forwardAccessibilityLabel = var18;
      this.threadAccessibilityLabel = var19;
   }

   public operator fun component1(): Int {
      return this.index;
   }

   public operator fun component10(): Boolean {
      return this.renderContentOnly;
   }

   public operator fun component11(): MessageFrame? {
      return this.messageFrame;
   }

   public operator fun component12(): Int? {
      return this.reactTag;
   }

   public operator fun component13(): Truncation? {
      return this.truncation;
   }

   public operator fun component14(): BackgroundHighlight? {
      return this.backgroundHighlight;
   }

   public operator fun component15(): SwipeActionsType {
      return this.swipeActions;
   }

   public operator fun component16(): MessageContextType? {
      return this.contextType;
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

   public operator fun component2(): ChangeType {
      return this.changeType;
   }

   public operator fun component3(): Boolean? {
      return this.jumped;
   }

   public operator fun component4(): MessageBase {
      return this.message;
   }

   public operator fun component5(): Boolean? {
      return this.canAddNewReactions;
   }

   public operator fun component6(): String? {
      return this.addReactionLabel;
   }

   public operator fun component7(): String? {
      return this.addNewReactionAccessibilityLabel;
   }

   public operator fun component8(): String? {
      return this.addNewBurstReactionAccessibilityLabel;
   }

   public operator fun component9(): ReactionsTheme? {
      return this.reactionsTheme;
   }

   public fun copy(
      index: Int = var0.index,
      changeType: ChangeType = var0.changeType,
      jumped: Boolean? = var0.jumped,
      message: MessageBase = var0.message,
      canAddNewReactions: Boolean? = var0.canAddNewReactions,
      addReactionLabel: String? = var0.addReactionLabel,
      addNewReactionAccessibilityLabel: String? = var0.addNewReactionAccessibilityLabel,
      addNewBurstReactionAccessibilityLabel: String? = var0.addNewBurstReactionAccessibilityLabel,
      reactionsTheme: ReactionsTheme? = var0.reactionsTheme,
      renderContentOnly: Boolean = var0.renderContentOnly,
      messageFrame: MessageFrame? = var0.messageFrame,
      reactTag: Int? = var0.reactTag,
      truncation: Truncation? = var0.truncation,
      backgroundHighlight: BackgroundHighlight? = var0.backgroundHighlight,
      swipeActions: SwipeActionsType = var0.swipeActions,
      contextType: MessageContextType? = var0.contextType,
      replyAccessibilityLabel: String? = var0.replyAccessibilityLabel,
      forwardAccessibilityLabel: String? = var0.forwardAccessibilityLabel,
      threadAccessibilityLabel: String? = var0.threadAccessibilityLabel
   ): MessageRow {
      q.h(var2, "changeType");
      q.h(var4, "message");
      q.h(var15, "swipeActions");
      return new MessageRow(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageRow) {
         return false;
      } else {
         var1 = var1;
         if (this.index != var1.index) {
            return false;
         } else if (this.changeType != var1.changeType) {
            return false;
         } else if (!q.c(this.jumped, var1.jumped)) {
            return false;
         } else if (!q.c(this.message, var1.message)) {
            return false;
         } else if (!q.c(this.canAddNewReactions, var1.canAddNewReactions)) {
            return false;
         } else if (!q.c(this.addReactionLabel, var1.addReactionLabel)) {
            return false;
         } else if (!q.c(this.addNewReactionAccessibilityLabel, var1.addNewReactionAccessibilityLabel)) {
            return false;
         } else if (!q.c(this.addNewBurstReactionAccessibilityLabel, var1.addNewBurstReactionAccessibilityLabel)) {
            return false;
         } else if (!q.c(this.reactionsTheme, var1.reactionsTheme)) {
            return false;
         } else if (this.renderContentOnly != var1.renderContentOnly) {
            return false;
         } else if (!q.c(this.messageFrame, var1.messageFrame)) {
            return false;
         } else if (!q.c(this.reactTag, var1.reactTag)) {
            return false;
         } else if (!q.c(this.truncation, var1.truncation)) {
            return false;
         } else if (!q.c(this.backgroundHighlight, var1.backgroundHighlight)) {
            return false;
         } else if (this.swipeActions != var1.swipeActions) {
            return false;
         } else if (this.contextType != var1.contextType) {
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
      val var15: Int = Integer.hashCode(this.index);
      val var16: Int = this.changeType.hashCode();
      var var14: Int = 0;
      val var1: Int;
      if (this.jumped == null) {
         var1 = 0;
      } else {
         var1 = this.jumped.hashCode();
      }

      val var17: Int = this.message.hashCode();
      val var2: Int;
      if (this.canAddNewReactions == null) {
         var2 = 0;
      } else {
         var2 = this.canAddNewReactions.hashCode();
      }

      val var3: Int;
      if (this.addReactionLabel == null) {
         var3 = 0;
      } else {
         var3 = this.addReactionLabel.hashCode();
      }

      val var4: Int;
      if (this.addNewReactionAccessibilityLabel == null) {
         var4 = 0;
      } else {
         var4 = this.addNewReactionAccessibilityLabel.hashCode();
      }

      val var5: Int;
      if (this.addNewBurstReactionAccessibilityLabel == null) {
         var5 = 0;
      } else {
         var5 = this.addNewBurstReactionAccessibilityLabel.hashCode();
      }

      val var6: Int;
      if (this.reactionsTheme == null) {
         var6 = 0;
      } else {
         var6 = this.reactionsTheme.hashCode();
      }

      val var18: Int = java.lang.Boolean.hashCode(this.renderContentOnly);
      val var7: Int;
      if (this.messageFrame == null) {
         var7 = 0;
      } else {
         var7 = this.messageFrame.hashCode();
      }

      val var8: Int;
      if (this.reactTag == null) {
         var8 = 0;
      } else {
         var8 = this.reactTag.hashCode();
      }

      val var9: Int;
      if (this.truncation == null) {
         var9 = 0;
      } else {
         var9 = this.truncation.hashCode();
      }

      val var10: Int;
      if (this.backgroundHighlight == null) {
         var10 = 0;
      } else {
         var10 = this.backgroundHighlight.hashCode();
      }

      val var19: Int = this.swipeActions.hashCode();
      val var11: Int;
      if (this.contextType == null) {
         var11 = 0;
      } else {
         var11 = this.contextType.hashCode();
      }

      val var12: Int;
      if (this.replyAccessibilityLabel == null) {
         var12 = 0;
      } else {
         var12 = this.replyAccessibilityLabel.hashCode();
      }

      val var13: Int;
      if (this.forwardAccessibilityLabel == null) {
         var13 = 0;
      } else {
         var13 = this.forwardAccessibilityLabel.hashCode();
      }

      if (this.threadAccessibilityLabel != null) {
         var14 = this.threadAccessibilityLabel.hashCode();
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
                                                                                                                                                               var15
                                                                                                                                                                     * 31
                                                                                                                                                                  + var16
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var1
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var17
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var2
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
                                                                                          + var18
                                                                                    )
                                                                                    * 31
                                                                                 + var7
                                                                           )
                                                                           * 31
                                                                        + var8
                                                                  )
                                                                  * 31
                                                               + var9
                                                         )
                                                         * 31
                                                      + var10
                                                )
                                                * 31
                                             + var19
                                       )
                                       * 31
                                    + var11
                              )
                              * 31
                           + var12
                     )
                     * 31
                  + var13
            )
            * 31
         + var14;
   }

   public override fun toString(): String {
      val var1: Int = this.index;
      val var11: ChangeType = this.changeType;
      val var4: java.lang.Boolean = this.jumped;
      val var5: MessageBase = this.message;
      val var6: java.lang.Boolean = this.canAddNewReactions;
      val var17: java.lang.String = this.addReactionLabel;
      val var8: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var15: java.lang.String = this.addNewBurstReactionAccessibilityLabel;
      val var12: ReactionsTheme = this.reactionsTheme;
      val var2: Boolean = this.renderContentOnly;
      val var3: MessageFrame = this.messageFrame;
      val var10: Int = this.reactTag;
      val var19: Truncation = this.truncation;
      val var9: BackgroundHighlight = this.backgroundHighlight;
      val var13: SwipeActionsType = this.swipeActions;
      val var14: MessageContextType = this.contextType;
      val var16: java.lang.String = this.replyAccessibilityLabel;
      val var18: java.lang.String = this.forwardAccessibilityLabel;
      val var7: java.lang.String = this.threadAccessibilityLabel;
      val var20: StringBuilder = new StringBuilder();
      var20.append("MessageRow(index=");
      var20.append(var1);
      var20.append(", changeType=");
      var20.append(var11);
      var20.append(", jumped=");
      var20.append(var4);
      var20.append(", message=");
      var20.append(var5);
      var20.append(", canAddNewReactions=");
      var20.append(var6);
      var20.append(", addReactionLabel=");
      var20.append(var17);
      var20.append(", addNewReactionAccessibilityLabel=");
      var20.append(var8);
      var20.append(", addNewBurstReactionAccessibilityLabel=");
      var20.append(var15);
      var20.append(", reactionsTheme=");
      var20.append(var12);
      var20.append(", renderContentOnly=");
      var20.append(var2);
      var20.append(", messageFrame=");
      var20.append(var3);
      var20.append(", reactTag=");
      var20.append(var10);
      var20.append(", truncation=");
      var20.append(var19);
      var20.append(", backgroundHighlight=");
      var20.append(var9);
      var20.append(", swipeActions=");
      var20.append(var13);
      var20.append(", contextType=");
      var20.append(var14);
      var20.append(", replyAccessibilityLabel=");
      var20.append(var16);
      var20.append(", forwardAccessibilityLabel=");
      var20.append(var18);
      var20.append(", threadAccessibilityLabel=");
      var20.append(var7);
      var20.append(")");
      return var20.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MessageRow> {
         return MessageRow.$serializer.INSTANCE;
      }
   }
}
