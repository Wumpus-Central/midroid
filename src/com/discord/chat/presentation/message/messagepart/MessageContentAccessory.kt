package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.truncation.Truncation
import com.discord.fonts.DiscordFont
import com.discord.primitives.MessageId
import com.discord.theme.DiscordThemeObject
import kotlin.jvm.internal.r

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
      return this.getMessageId-3Eiw7ao();
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
      r.h(var1, "messageId");
      r.h(var2, "messageContent");
      r.h(var10, "messageFont");
      r.h(var18, "theme");
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
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else if (!r.c(this.messageContent, var1.messageContent)) {
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
         } else if (!r.c(this.editedLabel, var1.editedLabel)) {
            return false;
         } else if (!r.c(this.editedLabelTextColor, var1.editedLabelTextColor)) {
            return false;
         } else if (this.isForwardedContent != var1.isForwardedContent) {
            return false;
         } else if (!r.c(this.truncation, var1.truncation)) {
            return false;
         } else {
            return r.c(this.theme, var1.theme);
         }
      }
   }

   public override fun hashCode(): Int {
      val var11: Int = MessageId.hashCode-impl(this.getMessageId-3Eiw7ao());
      val var12: Int = this.messageContent.hashCode();
      var var8: Byte = 1;
      var var1: Byte = this.shouldAnimateEmoji;
      if (this.shouldAnimateEmoji != 0) {
         var1 = 1;
      }

      var var20: Byte = this.shouldShowLinkDecorations;
      if (this.shouldShowLinkDecorations != 0) {
         var20 = 1;
      }

      var var21: Byte = this.shouldShowRoleDot;
      if (this.shouldShowRoleDot != 0) {
         var21 = 1;
      }

      var var22: Byte = this.shouldShowRoleOnName;
      if (this.shouldShowRoleOnName != 0) {
         var22 = 1;
      }

      val var17: Int = Integer.hashCode(this.bottomSpacingPx);
      val var15: Int = Integer.hashCode(this.linkColor);
      val var13: Int = Integer.hashCode(this.messageTextColor);
      val var14: Int = this.messageFont.hashCode();
      val var16: Int = Integer.hashCode(this.textSizeSp);
      var var23: Byte = this.boldLinkText;
      if (this.boldLinkText != 0) {
         var23 = 1;
      }

      val var18: Int = Integer.hashCode(this.constrainedWidth);
      var var9: Int = 0;
      val var24: Int;
      if (this.editedLabel == null) {
         var24 = 0;
      } else {
         var24 = this.editedLabel.hashCode();
      }

      val var7: Int;
      if (this.editedLabelTextColor == null) {
         var7 = 0;
      } else {
         var7 = this.editedLabelTextColor.hashCode();
      }

      if (this.isForwardedContent == 0) {
         var8 = this.isForwardedContent;
      }

      if (this.truncation != null) {
         var9 = this.truncation.hashCode();
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
                                                                                                                                                      var11
                                                                                                                                                            * 31
                                                                                                                                                         + var12
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var1
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var20
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var21
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var22
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
                                                                                 + var14
                                                                           )
                                                                           * 31
                                                                        + var16
                                                                  )
                                                                  * 31
                                                               + var23
                                                         )
                                                         * 31
                                                      + var18
                                                )
                                                * 31
                                             + var24
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
         + this.theme.hashCode();
   }

   public override fun toString(): String {
      val var17: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var13: StructurableText = this.messageContent;
      val var8: Boolean = this.shouldAnimateEmoji;
      val var6: Boolean = this.shouldShowLinkDecorations;
      val var11: Boolean = this.shouldShowRoleDot;
      val var9: Boolean = this.shouldShowRoleOnName;
      val var3: Int = this.bottomSpacingPx;
      val var2: Int = this.linkColor;
      val var4: Int = this.messageTextColor;
      val var16: DiscordFont = this.messageFont;
      val var1: Int = this.textSizeSp;
      val var7: Boolean = this.boldLinkText;
      val var5: Int = this.constrainedWidth;
      val var14: java.lang.String = this.editedLabel;
      val var12: Int = this.editedLabelTextColor;
      val var10: Boolean = this.isForwardedContent;
      val var15: Truncation = this.truncation;
      val var19: DiscordThemeObject = this.theme;
      val var18: StringBuilder = new StringBuilder();
      var18.append("MessageContentAccessory(messageId=");
      var18.append(var17);
      var18.append(", messageContent=");
      var18.append(var13);
      var18.append(", shouldAnimateEmoji=");
      var18.append(var8);
      var18.append(", shouldShowLinkDecorations=");
      var18.append(var6);
      var18.append(", shouldShowRoleDot=");
      var18.append(var11);
      var18.append(", shouldShowRoleOnName=");
      var18.append(var9);
      var18.append(", bottomSpacingPx=");
      var18.append(var3);
      var18.append(", linkColor=");
      var18.append(var2);
      var18.append(", messageTextColor=");
      var18.append(var4);
      var18.append(", messageFont=");
      var18.append(var16);
      var18.append(", textSizeSp=");
      var18.append(var1);
      var18.append(", boldLinkText=");
      var18.append(var7);
      var18.append(", constrainedWidth=");
      var18.append(var5);
      var18.append(", editedLabel=");
      var18.append(var14);
      var18.append(", editedLabelTextColor=");
      var18.append(var12);
      var18.append(", isForwardedContent=");
      var18.append(var10);
      var18.append(", truncation=");
      var18.append(var15);
      var18.append(", theme=");
      var18.append(var19);
      var18.append(")");
      return var18.toString();
   }
}
