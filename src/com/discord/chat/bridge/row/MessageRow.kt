package com.discord.chat.bridge.row

import com.discord.chat.bridge.BackgroundHighlight
import com.discord.chat.bridge.ChangeType
import com.discord.chat.bridge.MessageBase
import com.discord.chat.bridge.SwipeActionsType
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.chat.bridge.truncation.Truncation
import com.discord.chat.presentation.root.MessageContextType
import kotlinx.serialization.KSerializer
import mb.g

@g
public data class MessageRow(index: Int,
   changeType: ChangeType,
   jumped: Boolean? = null,
   message: MessageBase,
   canAddNewReactions: Boolean? = null,
   addReactionLabel: String? = null,
   addNewReactionAccessibilityLabel: String? = null,
   reactionsTheme: ReactionsTheme? = null,
   renderContentOnly: Boolean = false,
   messageFrame: MessageFrame? = null,
   reactTag: Int? = null,
   truncation: Truncation? = null,
   backgroundHighlight: BackgroundHighlight? = null,
   swipeActions: SwipeActionsType = SwipeActionsType.NONE,
   contextType: MessageContextType? = null
) : Row() {
   public open val index: Int
   public open val changeType: ChangeType
   public final val jumped: Boolean?

   @g(
      with = MessageSerializer.class
   )
   public final val message: MessageBase

   public final val canAddNewReactions: Boolean?
   public final val addReactionLabel: String?
   public final val addNewReactionAccessibilityLabel: String?
   public final val reactionsTheme: ReactionsTheme?
   public final val renderContentOnly: Boolean
   public final val messageFrame: MessageFrame?
   public final val reactTag: Int?
   public final val truncation: Truncation?
   public final val backgroundHighlight: BackgroundHighlight?
   public final val swipeActions: SwipeActionsType
   public final val contextType: MessageContextType?

   init {
      this.index = var1;
      this.changeType = var2;
      this.jumped = var3;
      this.message = var4;
      this.canAddNewReactions = var5;
      this.addReactionLabel = var6;
      this.addNewReactionAccessibilityLabel = var7;
      this.reactionsTheme = var8;
      this.renderContentOnly = var9;
      this.messageFrame = var10;
      this.reactTag = var11;
      this.truncation = var12;
      this.backgroundHighlight = var13;
      this.swipeActions = var14;
      this.contextType = var15;
   }

   public operator fun component1(): Int {
      return this.index;
   }

   public operator fun component10(): MessageFrame? {
      return this.messageFrame;
   }

   public operator fun component11(): Int? {
      return this.reactTag;
   }

   public operator fun component12(): Truncation? {
      return this.truncation;
   }

   public operator fun component13(): BackgroundHighlight? {
      return this.backgroundHighlight;
   }

   public operator fun component14(): SwipeActionsType {
      return this.swipeActions;
   }

   public operator fun component15(): MessageContextType? {
      return this.contextType;
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

   public operator fun component8(): ReactionsTheme? {
      return this.reactionsTheme;
   }

   public operator fun component9(): Boolean {
      return this.renderContentOnly;
   }

   public fun copy(
      index: Int = var0.index,
      changeType: ChangeType = var0.changeType,
      jumped: Boolean? = var0.jumped,
      message: MessageBase = var0.message,
      canAddNewReactions: Boolean? = var0.canAddNewReactions,
      addReactionLabel: String? = var0.addReactionLabel,
      addNewReactionAccessibilityLabel: String? = var0.addNewReactionAccessibilityLabel,
      reactionsTheme: ReactionsTheme? = var0.reactionsTheme,
      renderContentOnly: Boolean = var0.renderContentOnly,
      messageFrame: MessageFrame? = var0.messageFrame,
      reactTag: Int? = var0.reactTag,
      truncation: Truncation? = var0.truncation,
      backgroundHighlight: BackgroundHighlight? = var0.backgroundHighlight,
      swipeActions: SwipeActionsType = var0.swipeActions,
      contextType: MessageContextType? = var0.contextType
   ): MessageRow {
      return new MessageRow(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
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
         } else if (!(this.jumped == var1.jumped)) {
            return false;
         } else if (!(this.message == var1.message)) {
            return false;
         } else if (!(this.canAddNewReactions == var1.canAddNewReactions)) {
            return false;
         } else if (!(this.addReactionLabel == var1.addReactionLabel)) {
            return false;
         } else if (!(this.addNewReactionAccessibilityLabel == var1.addNewReactionAccessibilityLabel)) {
            return false;
         } else if (!(this.reactionsTheme == var1.reactionsTheme)) {
            return false;
         } else if (this.renderContentOnly != var1.renderContentOnly) {
            return false;
         } else if (!(this.messageFrame == var1.messageFrame)) {
            return false;
         } else if (!(this.reactTag == var1.reactTag)) {
            return false;
         } else if (!(this.truncation == var1.truncation)) {
            return false;
         } else if (!(this.backgroundHighlight == var1.backgroundHighlight)) {
            return false;
         } else if (this.swipeActions != var1.swipeActions) {
            return false;
         } else {
            return this.contextType === var1.contextType;
         }
      }
   }

   public override fun hashCode(): Int {
      val var12: Int = Integer.hashCode(this.index);
      val var11: Int = this.changeType.hashCode();
      var var10: Int = 0;
      val var1: Int;
      if (this.jumped == null) {
         var1 = 0;
      } else {
         var1 = this.jumped.hashCode();
      }

      val var13: Int = this.message.hashCode();
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
      if (this.reactionsTheme == null) {
         var5 = 0;
      } else {
         var5 = this.reactionsTheme.hashCode();
      }

      val var14: Int = java.lang.Boolean.hashCode(this.renderContentOnly);
      val var6: Int;
      if (this.messageFrame == null) {
         var6 = 0;
      } else {
         var6 = this.messageFrame.hashCode();
      }

      val var7: Int;
      if (this.reactTag == null) {
         var7 = 0;
      } else {
         var7 = this.reactTag.hashCode();
      }

      val var8: Int;
      if (this.truncation == null) {
         var8 = 0;
      } else {
         var8 = this.truncation.hashCode();
      }

      val var9: Int;
      if (this.backgroundHighlight == null) {
         var9 = 0;
      } else {
         var9 = this.backgroundHighlight.hashCode();
      }

      val var15: Int = this.swipeActions.hashCode();
      if (this.contextType != null) {
         var10 = this.contextType.hashCode();
      }

      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     ((((((var12 * 31 + var11) * 31 + var1) * 31 + var13) * 31 + var2) * 31 + var3) * 31 + var4)
                                                                           * 31
                                                                        + var5
                                                                  )
                                                                  * 31
                                                               + var14
                                                         )
                                                         * 31
                                                      + var6
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
                  + var15
            )
            * 31
         + var10;
   }

   public override fun toString(): String {
      val var1: Int = this.index;
      val var6: ChangeType = this.changeType;
      val var15: java.lang.Boolean = this.jumped;
      val var5: MessageBase = this.message;
      val var12: java.lang.Boolean = this.canAddNewReactions;
      val var4: java.lang.String = this.addReactionLabel;
      val var3: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var8: ReactionsTheme = this.reactionsTheme;
      val var2: Boolean = this.renderContentOnly;
      val var13: MessageFrame = this.messageFrame;
      val var14: Int = this.reactTag;
      val var10: Truncation = this.truncation;
      val var7: BackgroundHighlight = this.backgroundHighlight;
      val var9: SwipeActionsType = this.swipeActions;
      val var11: MessageContextType = this.contextType;
      val var16: StringBuilder = new StringBuilder();
      var16.append("MessageRow(index=");
      var16.append(var1);
      var16.append(", changeType=");
      var16.append(var6);
      var16.append(", jumped=");
      var16.append(var15);
      var16.append(", message=");
      var16.append(var5);
      var16.append(", canAddNewReactions=");
      var16.append(var12);
      var16.append(", addReactionLabel=");
      var16.append(var4);
      var16.append(", addNewReactionAccessibilityLabel=");
      var16.append(var3);
      var16.append(", reactionsTheme=");
      var16.append(var8);
      var16.append(", renderContentOnly=");
      var16.append(var2);
      var16.append(", messageFrame=");
      var16.append(var13);
      var16.append(", reactTag=");
      var16.append(var14);
      var16.append(", truncation=");
      var16.append(var10);
      var16.append(", backgroundHighlight=");
      var16.append(var7);
      var16.append(", swipeActions=");
      var16.append(var9);
      var16.append(", contextType=");
      var16.append(var11);
      var16.append(")");
      return var16.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MessageRow> {
         return MessageRow.$serializer.INSTANCE;
      }
   }
}
