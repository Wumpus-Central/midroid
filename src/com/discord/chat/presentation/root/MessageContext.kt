package com.discord.chat.presentation.root

import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.chat.bridge.truncation.Truncation
import kotlin.jvm.internal.r

public data class MessageContext(showDivider: Boolean = false,
   canAddNewReactions: Boolean = false,
   addReactionLabel: String = "",
   addNewReactionAccessibilityLabel: String = "",
   reactionsTheme: ReactionsTheme? = null,
   usingGradientTheme: Boolean = false,
   truncation: Truncation? = null,
   useAttachmentGridLayout: Boolean = false,
   useAttachmentUploadPreview: Boolean = false,
   enableSwipeToReply: Boolean = false,
   enableSwipeToEdit: Boolean = false,
   obscureLearnMoreLabel: String = "",
   contextType: MessageContextType = MessageContextType.DEFAULT,
   replyAccessibilityLabel: String = "",
   forwardAccessibilityLabel: String = "",
   threadAccessibilityLabel: String = ""
) {
   public final val showDivider: Boolean
   public final val canAddNewReactions: Boolean
   public final val addReactionLabel: String
   public final val addNewReactionAccessibilityLabel: String
   public final val reactionsTheme: ReactionsTheme?
   public final val usingGradientTheme: Boolean
   public final val truncation: Truncation?
   public final val useAttachmentGridLayout: Boolean
   public final val useAttachmentUploadPreview: Boolean
   public final val enableSwipeToReply: Boolean
   public final val enableSwipeToEdit: Boolean
   public final val obscureLearnMoreLabel: String
   public final val contextType: MessageContextType
   public final val replyAccessibilityLabel: String
   public final val forwardAccessibilityLabel: String
   public final val threadAccessibilityLabel: String

   fun MessageContext() {
      this(false, false, null, null, null, false, null, false, false, false, false, null, null, null, null, null, 65535, null);
   }

   init {
      r.h(var3, "addReactionLabel");
      r.h(var4, "addNewReactionAccessibilityLabel");
      r.h(var12, "obscureLearnMoreLabel");
      r.h(var13, "contextType");
      r.h(var14, "replyAccessibilityLabel");
      r.h(var15, "forwardAccessibilityLabel");
      r.h(var16, "threadAccessibilityLabel");
      super();
      this.showDivider = var1;
      this.canAddNewReactions = var2;
      this.addReactionLabel = var3;
      this.addNewReactionAccessibilityLabel = var4;
      this.reactionsTheme = var5;
      this.usingGradientTheme = var6;
      this.truncation = var7;
      this.useAttachmentGridLayout = var8;
      this.useAttachmentUploadPreview = var9;
      this.enableSwipeToReply = var10;
      this.enableSwipeToEdit = var11;
      this.obscureLearnMoreLabel = var12;
      this.contextType = var13;
      this.replyAccessibilityLabel = var14;
      this.forwardAccessibilityLabel = var15;
      this.threadAccessibilityLabel = var16;
   }

   public operator fun component1(): Boolean {
      return this.showDivider;
   }

   public operator fun component10(): Boolean {
      return this.enableSwipeToReply;
   }

   public operator fun component11(): Boolean {
      return this.enableSwipeToEdit;
   }

   public operator fun component12(): String {
      return this.obscureLearnMoreLabel;
   }

   public operator fun component13(): MessageContextType {
      return this.contextType;
   }

   public operator fun component14(): String {
      return this.replyAccessibilityLabel;
   }

   public operator fun component15(): String {
      return this.forwardAccessibilityLabel;
   }

   public operator fun component16(): String {
      return this.threadAccessibilityLabel;
   }

   public operator fun component2(): Boolean {
      return this.canAddNewReactions;
   }

   public operator fun component3(): String {
      return this.addReactionLabel;
   }

   public operator fun component4(): String {
      return this.addNewReactionAccessibilityLabel;
   }

   public operator fun component5(): ReactionsTheme? {
      return this.reactionsTheme;
   }

   public operator fun component6(): Boolean {
      return this.usingGradientTheme;
   }

   public operator fun component7(): Truncation? {
      return this.truncation;
   }

   public operator fun component8(): Boolean {
      return this.useAttachmentGridLayout;
   }

   public operator fun component9(): Boolean {
      return this.useAttachmentUploadPreview;
   }

   public fun copy(
      showDivider: Boolean = var0.showDivider,
      canAddNewReactions: Boolean = var0.canAddNewReactions,
      addReactionLabel: String = var0.addReactionLabel,
      addNewReactionAccessibilityLabel: String = var0.addNewReactionAccessibilityLabel,
      reactionsTheme: ReactionsTheme? = var0.reactionsTheme,
      usingGradientTheme: Boolean = var0.usingGradientTheme,
      truncation: Truncation? = var0.truncation,
      useAttachmentGridLayout: Boolean = var0.useAttachmentGridLayout,
      useAttachmentUploadPreview: Boolean = var0.useAttachmentUploadPreview,
      enableSwipeToReply: Boolean = var0.enableSwipeToReply,
      enableSwipeToEdit: Boolean = var0.enableSwipeToEdit,
      obscureLearnMoreLabel: String = var0.obscureLearnMoreLabel,
      contextType: MessageContextType = var0.contextType,
      replyAccessibilityLabel: String = var0.replyAccessibilityLabel,
      forwardAccessibilityLabel: String = var0.forwardAccessibilityLabel,
      threadAccessibilityLabel: String = var0.threadAccessibilityLabel
   ): MessageContext {
      r.h(var3, "addReactionLabel");
      r.h(var4, "addNewReactionAccessibilityLabel");
      r.h(var12, "obscureLearnMoreLabel");
      r.h(var13, "contextType");
      r.h(var14, "replyAccessibilityLabel");
      r.h(var15, "forwardAccessibilityLabel");
      r.h(var16, "threadAccessibilityLabel");
      return new MessageContext(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageContext) {
         return false;
      } else {
         var1 = var1;
         if (this.showDivider != var1.showDivider) {
            return false;
         } else if (this.canAddNewReactions != var1.canAddNewReactions) {
            return false;
         } else if (!r.c(this.addReactionLabel, var1.addReactionLabel)) {
            return false;
         } else if (!r.c(this.addNewReactionAccessibilityLabel, var1.addNewReactionAccessibilityLabel)) {
            return false;
         } else if (!r.c(this.reactionsTheme, var1.reactionsTheme)) {
            return false;
         } else if (this.usingGradientTheme != var1.usingGradientTheme) {
            return false;
         } else if (!r.c(this.truncation, var1.truncation)) {
            return false;
         } else if (this.useAttachmentGridLayout != var1.useAttachmentGridLayout) {
            return false;
         } else if (this.useAttachmentUploadPreview != var1.useAttachmentUploadPreview) {
            return false;
         } else if (this.enableSwipeToReply != var1.enableSwipeToReply) {
            return false;
         } else if (this.enableSwipeToEdit != var1.enableSwipeToEdit) {
            return false;
         } else if (!r.c(this.obscureLearnMoreLabel, var1.obscureLearnMoreLabel)) {
            return false;
         } else if (this.contextType != var1.contextType) {
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
      val var3: Int = java.lang.Boolean.hashCode(this.showDivider);
      val var5: Int = java.lang.Boolean.hashCode(this.canAddNewReactions);
      val var4: Int = this.addReactionLabel.hashCode();
      val var6: Int = this.addNewReactionAccessibilityLabel.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.reactionsTheme == null) {
         var1 = 0;
      } else {
         var1 = this.reactionsTheme.hashCode();
      }

      val var7: Int = java.lang.Boolean.hashCode(this.usingGradientTheme);
      if (this.truncation != null) {
         var2 = this.truncation.hashCode();
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
                                                                                                ((((var3 * 31 + var5) * 31 + var4) * 31 + var6) * 31 + var1)
                                                                                                      * 31
                                                                                                   + var7
                                                                                             )
                                                                                             * 31
                                                                                          + var2
                                                                                    )
                                                                                    * 31
                                                                                 + java.lang.Boolean.hashCode(this.useAttachmentGridLayout)
                                                                           )
                                                                           * 31
                                                                        + java.lang.Boolean.hashCode(this.useAttachmentUploadPreview)
                                                                  )
                                                                  * 31
                                                               + java.lang.Boolean.hashCode(this.enableSwipeToReply)
                                                         )
                                                         * 31
                                                      + java.lang.Boolean.hashCode(this.enableSwipeToEdit)
                                                )
                                                * 31
                                             + this.obscureLearnMoreLabel.hashCode()
                                       )
                                       * 31
                                    + this.contextType.hashCode()
                              )
                              * 31
                           + this.replyAccessibilityLabel.hashCode()
                     )
                     * 31
                  + this.forwardAccessibilityLabel.hashCode()
            )
            * 31
         + this.threadAccessibilityLabel.hashCode();
   }

   public override fun toString(): String {
      val var6: Boolean = this.showDivider;
      val var1: Boolean = this.canAddNewReactions;
      val var13: java.lang.String = this.addReactionLabel;
      val var8: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var17: ReactionsTheme = this.reactionsTheme;
      val var5: Boolean = this.usingGradientTheme;
      val var11: Truncation = this.truncation;
      val var3: Boolean = this.useAttachmentGridLayout;
      val var7: Boolean = this.useAttachmentUploadPreview;
      val var4: Boolean = this.enableSwipeToReply;
      val var2: Boolean = this.enableSwipeToEdit;
      val var10: java.lang.String = this.obscureLearnMoreLabel;
      val var14: MessageContextType = this.contextType;
      val var9: java.lang.String = this.replyAccessibilityLabel;
      val var12: java.lang.String = this.forwardAccessibilityLabel;
      val var16: java.lang.String = this.threadAccessibilityLabel;
      val var15: StringBuilder = new StringBuilder();
      var15.append("MessageContext(showDivider=");
      var15.append(var6);
      var15.append(", canAddNewReactions=");
      var15.append(var1);
      var15.append(", addReactionLabel=");
      var15.append(var13);
      var15.append(", addNewReactionAccessibilityLabel=");
      var15.append(var8);
      var15.append(", reactionsTheme=");
      var15.append(var17);
      var15.append(", usingGradientTheme=");
      var15.append(var5);
      var15.append(", truncation=");
      var15.append(var11);
      var15.append(", useAttachmentGridLayout=");
      var15.append(var3);
      var15.append(", useAttachmentUploadPreview=");
      var15.append(var7);
      var15.append(", enableSwipeToReply=");
      var15.append(var4);
      var15.append(", enableSwipeToEdit=");
      var15.append(var2);
      var15.append(", obscureLearnMoreLabel=");
      var15.append(var10);
      var15.append(", contextType=");
      var15.append(var14);
      var15.append(", replyAccessibilityLabel=");
      var15.append(var9);
      var15.append(", forwardAccessibilityLabel=");
      var15.append(var12);
      var15.append(", threadAccessibilityLabel=");
      var15.append(var16);
      var15.append(")");
      return var15.toString();
   }
}
