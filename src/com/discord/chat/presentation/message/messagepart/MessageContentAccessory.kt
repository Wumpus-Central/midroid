package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.truncation.Truncation
import com.discord.fonts.DiscordFont
import com.discord.primitives.MessageId
import com.discord.theme.DiscordThemeObject
import kotlin.jvm.internal.q

public data class MessageContentAccessory(messageId: MessageId,
   messageContent: StructurableText,
   shouldAnimateEmoji: Boolean,
   shouldShowLinkDecorations: Boolean,
   shouldShowRoleDot: Boolean,
   shouldShowRoleOnName: Boolean,
   bottomSpacingPx: Int,
   linkColor: Int,
   messageTextColor: Int,
   messageFont: DiscordFont,
   textSizeSp: Int,
   boldLinkText: Boolean,
   constrainedWidth: Int,
   editedLabel: String?,
   editedLabelTextColor: Int?,
   isForwardedContent: Boolean,
   truncation: Truncation? = ...,
   theme: DiscordThemeObject = ...
) : MessageContentAccessory(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18) {
   public final val boldLinkText: Boolean
   public final val bottomSpacingPx: Int
   public final val constrainedWidth: Int
   public final val editedLabel: String?
   public final val editedLabelTextColor: Int?
   public final val isForwardedContent: Boolean
   public final val linkColor: Int
   public final val messageContent: StructurableText
   public final val messageFont: DiscordFont
   public open val messageId: MessageId
   public final val messageTextColor: Int
   public final val shouldAnimateEmoji: Boolean
   public final val shouldShowLinkDecorations: Boolean
   public final val shouldShowRoleDot: Boolean
   public final val shouldShowRoleOnName: Boolean
   public final val textSizeSp: Int
   public final val theme: DiscordThemeObject
   public final val truncation: Truncation?

   fun MessageContentAccessory(
      var1: java.lang.String,
      var2: StructurableText,
      var3: Boolean,
      var4: Boolean,
      var5: Boolean,
      var6: Boolean,
      var7: Int,
      var8: Int,
      var9: Int,
      var10: DiscordFont,
      var11: Int,
      var12: Boolean,
      var13: Int,
      var14: java.lang.String,
      var15: Int,
      var16: Boolean,
      var17: Truncation,
      var18: DiscordThemeObject
   ) {
      q.h(var1, "messageId");
      q.h(var2, "messageContent");
      q.h(var10, "messageFont");
      q.h(var18, "theme");
      super(var1, "message content", false, 4, null);
      this.messageId = var1;
      this.messageContent = var2;
      this.shouldAnimateEmoji = var3;
      this.shouldShowLinkDecorations = var4;
      this.shouldShowRoleDot = var5;
      this.shouldShowRoleOnName = var6;
      this.bottomSpacingPx = var7;
      this.linkColor = var8;
      this.messageTextColor = var9;
      this.messageFont = var10;
      this.textSizeSp = var11;
      this.boldLinkText = var12;
      this.constrainedWidth = var13;
      this.editedLabel = var14;
      this.editedLabelTextColor = var15;
      this.isForwardedContent = var16;
      this.truncation = var17;
      this.theme = var18;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component10(): DiscordFont {
      return this.messageFont;
   }

   public operator fun component11(): Int {
      return this.textSizeSp;
   }

   public operator fun component12(): Boolean {
      return this.boldLinkText;
   }

   public operator fun component13(): Int {
      return this.constrainedWidth;
   }

   public operator fun component14(): String? {
      return this.editedLabel;
   }

   public operator fun component15(): Int? {
      return this.editedLabelTextColor;
   }

   public operator fun component16(): Boolean {
      return this.isForwardedContent;
   }

   public operator fun component17(): Truncation? {
      return this.truncation;
   }

   public operator fun component18(): DiscordThemeObject {
      return this.theme;
   }

   public operator fun component2(): StructurableText {
      return this.messageContent;
   }

   public operator fun component3(): Boolean {
      return this.shouldAnimateEmoji;
   }

   public operator fun component4(): Boolean {
      return this.shouldShowLinkDecorations;
   }

   public operator fun component5(): Boolean {
      return this.shouldShowRoleDot;
   }

   public operator fun component6(): Boolean {
      return this.shouldShowRoleOnName;
   }

   public operator fun component7(): Int {
      return this.bottomSpacingPx;
   }

   public operator fun component8(): Int {
      return this.linkColor;
   }

   public operator fun component9(): Int {
      return this.messageTextColor;
   }

   public fun copy(
      messageId: MessageId = ...,
      messageContent: StructurableText = ...,
      shouldAnimateEmoji: Boolean = ...,
      shouldShowLinkDecorations: Boolean = ...,
      shouldShowRoleDot: Boolean = ...,
      shouldShowRoleOnName: Boolean = ...,
      bottomSpacingPx: Int = ...,
      linkColor: Int = ...,
      messageTextColor: Int = ...,
      messageFont: DiscordFont = ...,
      textSizeSp: Int = ...,
      boldLinkText: Boolean = ...,
      constrainedWidth: Int = ...,
      editedLabel: String? = ...,
      editedLabelTextColor: Int? = ...,
      isForwardedContent: Boolean = ...,
      truncation: Truncation? = ...,
      theme: DiscordThemeObject = ...
   ): MessageContentAccessory {
      q.h(var1, "messageId");
      q.h(var2, "messageContent");
      q.h(var10, "messageFont");
      q.h(var18, "theme");
      return new MessageContentAccessory(
         var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, null
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageContentAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.messageContent, var1.messageContent)) {
            return false;
         } else if (this.shouldAnimateEmoji != var1.shouldAnimateEmoji) {
            return false;
         } else if (this.shouldShowLinkDecorations != var1.shouldShowLinkDecorations) {
            return false;
         } else if (this.shouldShowRoleDot != var1.shouldShowRoleDot) {
            return false;
         } else if (this.shouldShowRoleOnName != var1.shouldShowRoleOnName) {
            return false;
         } else if (this.bottomSpacingPx != var1.bottomSpacingPx) {
            return false;
         } else if (this.linkColor != var1.linkColor) {
            return false;
         } else if (this.messageTextColor != var1.messageTextColor) {
            return false;
         } else if (this.messageFont != var1.messageFont) {
            return false;
         } else if (this.textSizeSp != var1.textSizeSp) {
            return false;
         } else if (this.boldLinkText != var1.boldLinkText) {
            return false;
         } else if (this.constrainedWidth != var1.constrainedWidth) {
            return false;
         } else if (!q.c(this.editedLabel, var1.editedLabel)) {
            return false;
         } else if (!q.c(this.editedLabelTextColor, var1.editedLabelTextColor)) {
            return false;
         } else if (this.isForwardedContent != var1.isForwardedContent) {
            return false;
         } else if (!q.c(this.truncation, var1.truncation)) {
            return false;
         } else {
            return q.c(this.theme, var1.theme);
         }
      }
   }

   public override fun hashCode(): Int {
      val var13: Int = MessageId.hashCode-impl(this.messageId);
      val var4: Int = this.messageContent.hashCode();
      val var11: Int = java.lang.Boolean.hashCode(this.shouldAnimateEmoji);
      val var8: Int = java.lang.Boolean.hashCode(this.shouldShowLinkDecorations);
      val var15: Int = java.lang.Boolean.hashCode(this.shouldShowRoleDot);
      val var9: Int = java.lang.Boolean.hashCode(this.shouldShowRoleOnName);
      val var5: Int = Integer.hashCode(this.bottomSpacingPx);
      val var6: Int = Integer.hashCode(this.linkColor);
      val var16: Int = Integer.hashCode(this.messageTextColor);
      val var14: Int = this.messageFont.hashCode();
      val var7: Int = Integer.hashCode(this.textSizeSp);
      val var10: Int = java.lang.Boolean.hashCode(this.boldLinkText);
      val var12: Int = Integer.hashCode(this.constrainedWidth);
      var var3: Int = 0;
      val var1: Int;
      if (this.editedLabel == null) {
         var1 = 0;
      } else {
         var1 = this.editedLabel.hashCode();
      }

      val var2: Int;
      if (this.editedLabelTextColor == null) {
         var2 = 0;
      } else {
         var2 = this.editedLabelTextColor.hashCode();
      }

      val var17: Int = java.lang.Boolean.hashCode(this.isForwardedContent);
      if (this.truncation != null) {
         var3 = this.truncation.hashCode();
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
                                                                                                                                             (var13 * 31 + var4)
                                                                                                                                                   * 31
                                                                                                                                                + var11
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var8
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var15
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var9
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var5
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var6
                                                                                             )
                                                                                             * 31
                                                                                          + var16
                                                                                    )
                                                                                    * 31
                                                                                 + var14
                                                                           )
                                                                           * 31
                                                                        + var7
                                                                  )
                                                                  * 31
                                                               + var10
                                                         )
                                                         * 31
                                                      + var12
                                                )
                                                * 31
                                             + var1
                                       )
                                       * 31
                                    + var2
                              )
                              * 31
                           + var17
                     )
                     * 31
                  + var3
            )
            * 31
         + this.theme.hashCode();
   }

   public override fun toString(): String {
      val var19: java.lang.String = MessageId.toString-impl(this.messageId);
      val var12: StructurableText = this.messageContent;
      val var6: Boolean = this.shouldAnimateEmoji;
      val var8: Boolean = this.shouldShowLinkDecorations;
      val var10: Boolean = this.shouldShowRoleDot;
      val var11: Boolean = this.shouldShowRoleOnName;
      val var4: Int = this.bottomSpacingPx;
      val var2: Int = this.linkColor;
      val var3: Int = this.messageTextColor;
      val var18: DiscordFont = this.messageFont;
      val var1: Int = this.textSizeSp;
      val var7: Boolean = this.boldLinkText;
      val var5: Int = this.constrainedWidth;
      val var16: java.lang.String = this.editedLabel;
      val var17: Int = this.editedLabelTextColor;
      val var9: Boolean = this.isForwardedContent;
      val var15: Truncation = this.truncation;
      val var14: DiscordThemeObject = this.theme;
      val var13: StringBuilder = new StringBuilder();
      var13.append("MessageContentAccessory(messageId=");
      var13.append(var19);
      var13.append(", messageContent=");
      var13.append(var12);
      var13.append(", shouldAnimateEmoji=");
      var13.append(var6);
      var13.append(", shouldShowLinkDecorations=");
      var13.append(var8);
      var13.append(", shouldShowRoleDot=");
      var13.append(var10);
      var13.append(", shouldShowRoleOnName=");
      var13.append(var11);
      var13.append(", bottomSpacingPx=");
      var13.append(var4);
      var13.append(", linkColor=");
      var13.append(var2);
      var13.append(", messageTextColor=");
      var13.append(var3);
      var13.append(", messageFont=");
      var13.append(var18);
      var13.append(", textSizeSp=");
      var13.append(var1);
      var13.append(", boldLinkText=");
      var13.append(var7);
      var13.append(", constrainedWidth=");
      var13.append(var5);
      var13.append(", editedLabel=");
      var13.append(var16);
      var13.append(", editedLabelTextColor=");
      var13.append(var17);
      var13.append(", isForwardedContent=");
      var13.append(var9);
      var13.append(", truncation=");
      var13.append(var15);
      var13.append(", theme=");
      var13.append(var14);
      var13.append(")");
      return var13.toString();
   }
}
