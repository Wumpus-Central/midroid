package com.discord.chat.presentation.root

import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.chat.bridge.truncation.Truncation
import kotlin.jvm.internal.r

public data class MessageContext(showDivider: Boolean = false,
   canAddNewReactions: Boolean = false,
   addReactionLabel: String = "",
   addNewReactionAccessibilityLabel: String = "",
   addNewBurstReactionAccessibilityLabel: String = "",
   reactionsTheme: ReactionsTheme? = null,
   usingGradientTheme: Boolean = false,
   truncation: Truncation? = null,
   useAttachmentGridLayout: Boolean = false,
   useAttachmentUploadPreview: Boolean = false,
   enableSwipeToReply: Boolean = false,
   enableSwipeToEdit: Boolean = false,
   useAddBurstReaction: Boolean = false,
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
   public final val addNewBurstReactionAccessibilityLabel: String
   public final val reactionsTheme: ReactionsTheme?
   public final val usingGradientTheme: Boolean
   public final val truncation: Truncation?
   public final val useAttachmentGridLayout: Boolean
   public final val useAttachmentUploadPreview: Boolean
   public final val enableSwipeToReply: Boolean
   public final val enableSwipeToEdit: Boolean
   public final val useAddBurstReaction: Boolean
   public final val obscureLearnMoreLabel: String
   public final val contextType: MessageContextType
   public final val replyAccessibilityLabel: String
   public final val forwardAccessibilityLabel: String
   public final val threadAccessibilityLabel: String

   fun MessageContext() {
      this(false, false, null, null, null, null, false, null, false, false, false, false, false, null, null, null, null, null, 262143, null);
   }

   init {
      r.h(var3, "addReactionLabel");
      r.h(var4, "addNewReactionAccessibilityLabel");
      r.h(var5, "addNewBurstReactionAccessibilityLabel");
      r.h(var14, "obscureLearnMoreLabel");
      r.h(var15, "contextType");
      r.h(var16, "replyAccessibilityLabel");
      r.h(var17, "forwardAccessibilityLabel");
      r.h(var18, "threadAccessibilityLabel");
      super();
      this.showDivider = var1;
      this.canAddNewReactions = var2;
      this.addReactionLabel = var3;
      this.addNewReactionAccessibilityLabel = var4;
      this.addNewBurstReactionAccessibilityLabel = var5;
      this.reactionsTheme = var6;
      this.usingGradientTheme = var7;
      this.truncation = var8;
      this.useAttachmentGridLayout = var9;
      this.useAttachmentUploadPreview = var10;
      this.enableSwipeToReply = var11;
      this.enableSwipeToEdit = var12;
      this.useAddBurstReaction = var13;
      this.obscureLearnMoreLabel = var14;
      this.contextType = var15;
      this.replyAccessibilityLabel = var16;
      this.forwardAccessibilityLabel = var17;
      this.threadAccessibilityLabel = var18;
   }

   public operator fun component1(): Boolean {
      return this.showDivider;
   }

   public operator fun component10(): Boolean {
      return this.useAttachmentUploadPreview;
   }

   public operator fun component11(): Boolean {
      return this.enableSwipeToReply;
   }

   public operator fun component12(): Boolean {
      return this.enableSwipeToEdit;
   }

   public operator fun component13(): Boolean {
      return this.useAddBurstReaction;
   }

   public operator fun component14(): String {
      return this.obscureLearnMoreLabel;
   }

   public operator fun component15(): MessageContextType {
      return this.contextType;
   }

   public operator fun component16(): String {
      return this.replyAccessibilityLabel;
   }

   public operator fun component17(): String {
      return this.forwardAccessibilityLabel;
   }

   public operator fun component18(): String {
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

   public operator fun component5(): String {
      return this.addNewBurstReactionAccessibilityLabel;
   }

   public operator fun component6(): ReactionsTheme? {
      return this.reactionsTheme;
   }

   public operator fun component7(): Boolean {
      return this.usingGradientTheme;
   }

   public operator fun component8(): Truncation? {
      return this.truncation;
   }

   public operator fun component9(): Boolean {
      return this.useAttachmentGridLayout;
   }

   public fun copy(
      showDivider: Boolean = var0.showDivider,
      canAddNewReactions: Boolean = var0.canAddNewReactions,
      addReactionLabel: String = var0.addReactionLabel,
      addNewReactionAccessibilityLabel: String = var0.addNewReactionAccessibilityLabel,
      addNewBurstReactionAccessibilityLabel: String = var0.addNewBurstReactionAccessibilityLabel,
      reactionsTheme: ReactionsTheme? = var0.reactionsTheme,
      usingGradientTheme: Boolean = var0.usingGradientTheme,
      truncation: Truncation? = var0.truncation,
      useAttachmentGridLayout: Boolean = var0.useAttachmentGridLayout,
      useAttachmentUploadPreview: Boolean = var0.useAttachmentUploadPreview,
      enableSwipeToReply: Boolean = var0.enableSwipeToReply,
      enableSwipeToEdit: Boolean = var0.enableSwipeToEdit,
      useAddBurstReaction: Boolean = var0.useAddBurstReaction,
      obscureLearnMoreLabel: String = var0.obscureLearnMoreLabel,
      contextType: MessageContextType = var0.contextType,
      replyAccessibilityLabel: String = var0.replyAccessibilityLabel,
      forwardAccessibilityLabel: String = var0.forwardAccessibilityLabel,
      threadAccessibilityLabel: String = var0.threadAccessibilityLabel
   ): MessageContext {
      r.h(var3, "addReactionLabel");
      r.h(var4, "addNewReactionAccessibilityLabel");
      r.h(var5, "addNewBurstReactionAccessibilityLabel");
      r.h(var14, "obscureLearnMoreLabel");
      r.h(var15, "contextType");
      r.h(var16, "replyAccessibilityLabel");
      r.h(var17, "forwardAccessibilityLabel");
      r.h(var18, "threadAccessibilityLabel");
      return new MessageContext(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18);
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
         } else if (!r.c(this.addNewBurstReactionAccessibilityLabel, var1.addNewBurstReactionAccessibilityLabel)) {
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
         } else if (this.useAddBurstReaction != var1.useAddBurstReaction) {
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
      val var5: Int = java.lang.Boolean.hashCode(this.showDivider);
      val var3: Int = java.lang.Boolean.hashCode(this.canAddNewReactions);
      val var4: Int = this.addReactionLabel.hashCode();
      val var6: Int = this.addNewReactionAccessibilityLabel.hashCode();
      val var7: Int = this.addNewBurstReactionAccessibilityLabel.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.reactionsTheme == null) {
         var1 = 0;
      } else {
         var1 = this.reactionsTheme.hashCode();
      }

      val var8: Int = java.lang.Boolean.hashCode(this.usingGradientTheme);
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
                                                                                                (
                                                                                                         (
                                                                                                                  (
                                                                                                                           (
                                                                                                                                    (
                                                                                                                                             (var5 * 31 + var3)
                                                                                                                                                   * 31
                                                                                                                                                + var4
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var6
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var7
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var1
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var8
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
                                                      + java.lang.Boolean.hashCode(this.useAddBurstReaction)
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
      val var1: Boolean = this.showDivider;
      val var3: Boolean = this.canAddNewReactions;
      val var16: java.lang.String = this.addReactionLabel;
      val var13: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var17: java.lang.String = this.addNewBurstReactionAccessibilityLabel;
      val var12: ReactionsTheme = this.reactionsTheme;
      val var4: Boolean = this.usingGradientTheme;
      val var10: Truncation = this.truncation;
      val var8: Boolean = this.useAttachmentGridLayout;
      val var7: Boolean = this.useAttachmentUploadPreview;
      val var6: Boolean = this.enableSwipeToReply;
      val var2: Boolean = this.enableSwipeToEdit;
      val var5: Boolean = this.useAddBurstReaction;
      val var9: java.lang.String = this.obscureLearnMoreLabel;
      val var14: MessageContextType = this.contextType;
      val var11: java.lang.String = this.replyAccessibilityLabel;
      val var19: java.lang.String = this.forwardAccessibilityLabel;
      val var15: java.lang.String = this.threadAccessibilityLabel;
      val var18: StringBuilder = new StringBuilder();
      var18.append("MessageContext(showDivider=");
      var18.append(var1);
      var18.append(", canAddNewReactions=");
      var18.append(var3);
      var18.append(", addReactionLabel=");
      var18.append(var16);
      var18.append(", addNewReactionAccessibilityLabel=");
      var18.append(var13);
      var18.append(", addNewBurstReactionAccessibilityLabel=");
      var18.append(var17);
      var18.append(", reactionsTheme=");
      var18.append(var12);
      var18.append(", usingGradientTheme=");
      var18.append(var4);
      var18.append(", truncation=");
      var18.append(var10);
      var18.append(", useAttachmentGridLayout=");
      var18.append(var8);
      var18.append(", useAttachmentUploadPreview=");
      var18.append(var7);
      var18.append(", enableSwipeToReply=");
      var18.append(var6);
      var18.append(", enableSwipeToEdit=");
      var18.append(var2);
      var18.append(", useAddBurstReaction=");
      var18.append(var5);
      var18.append(", obscureLearnMoreLabel=");
      var18.append(var9);
      var18.append(", contextType=");
      var18.append(var14);
      var18.append(", replyAccessibilityLabel=");
      var18.append(var11);
      var18.append(", forwardAccessibilityLabel=");
      var18.append(var19);
      var18.append(", threadAccessibilityLabel=");
      var18.append(var15);
      var18.append(")");
      return var18.toString();
   }
}
