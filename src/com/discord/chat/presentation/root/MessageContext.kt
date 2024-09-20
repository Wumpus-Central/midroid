package com.discord.chat.presentation.root

import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.chat.bridge.truncation.Truncation
import kotlin.jvm.internal.q

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
   contextType: MessageContextType = MessageContextType.DEFAULT
) {
   public final val addNewBurstReactionAccessibilityLabel: String
   public final val addNewReactionAccessibilityLabel: String
   public final val addReactionLabel: String
   public final val canAddNewReactions: Boolean
   public final val contextType: MessageContextType
   public final val enableSwipeToEdit: Boolean
   public final val enableSwipeToReply: Boolean
   public final val obscureLearnMoreLabel: String
   public final val reactionsTheme: ReactionsTheme?
   public final val showDivider: Boolean
   public final val truncation: Truncation?
   public final val useAddBurstReaction: Boolean
   public final val useAttachmentGridLayout: Boolean
   public final val useAttachmentUploadPreview: Boolean
   public final val usingGradientTheme: Boolean

   fun MessageContext() {
      this(false, false, null, null, null, null, false, null, false, false, false, false, false, null, null, 32767, null);
   }

   init {
      q.h(var3, "addReactionLabel");
      q.h(var4, "addNewReactionAccessibilityLabel");
      q.h(var5, "addNewBurstReactionAccessibilityLabel");
      q.h(var14, "obscureLearnMoreLabel");
      q.h(var15, "contextType");
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
      contextType: MessageContextType = var0.contextType
   ): MessageContext {
      q.h(var3, "addReactionLabel");
      q.h(var4, "addNewReactionAccessibilityLabel");
      q.h(var5, "addNewBurstReactionAccessibilityLabel");
      q.h(var14, "obscureLearnMoreLabel");
      q.h(var15, "contextType");
      return new MessageContext(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
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
         } else if (!q.c(this.addReactionLabel, var1.addReactionLabel)) {
            return false;
         } else if (!q.c(this.addNewReactionAccessibilityLabel, var1.addNewReactionAccessibilityLabel)) {
            return false;
         } else if (!q.c(this.addNewBurstReactionAccessibilityLabel, var1.addNewBurstReactionAccessibilityLabel)) {
            return false;
         } else if (!q.c(this.reactionsTheme, var1.reactionsTheme)) {
            return false;
         } else if (this.usingGradientTheme != var1.usingGradientTheme) {
            return false;
         } else if (!q.c(this.truncation, var1.truncation)) {
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
         } else if (!q.c(this.obscureLearnMoreLabel, var1.obscureLearnMoreLabel)) {
            return false;
         } else {
            return this.contextType === var1.contextType;
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
                                                                     ((((((var5 * 31 + var3) * 31 + var4) * 31 + var6) * 31 + var7) * 31 + var1) * 31 + var8)
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
         + this.contextType.hashCode();
   }

   public override fun toString(): String {
      val var4: Boolean = this.showDivider;
      val var6: Boolean = this.canAddNewReactions;
      val var9: java.lang.String = this.addReactionLabel;
      val var15: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var16: java.lang.String = this.addNewBurstReactionAccessibilityLabel;
      val var14: ReactionsTheme = this.reactionsTheme;
      val var7: Boolean = this.usingGradientTheme;
      val var13: Truncation = this.truncation;
      val var2: Boolean = this.useAttachmentGridLayout;
      val var5: Boolean = this.useAttachmentUploadPreview;
      val var3: Boolean = this.enableSwipeToReply;
      val var8: Boolean = this.enableSwipeToEdit;
      val var1: Boolean = this.useAddBurstReaction;
      val var10: java.lang.String = this.obscureLearnMoreLabel;
      val var11: MessageContextType = this.contextType;
      val var12: StringBuilder = new StringBuilder();
      var12.append("MessageContext(showDivider=");
      var12.append(var4);
      var12.append(", canAddNewReactions=");
      var12.append(var6);
      var12.append(", addReactionLabel=");
      var12.append(var9);
      var12.append(", addNewReactionAccessibilityLabel=");
      var12.append(var15);
      var12.append(", addNewBurstReactionAccessibilityLabel=");
      var12.append(var16);
      var12.append(", reactionsTheme=");
      var12.append(var14);
      var12.append(", usingGradientTheme=");
      var12.append(var7);
      var12.append(", truncation=");
      var12.append(var13);
      var12.append(", useAttachmentGridLayout=");
      var12.append(var2);
      var12.append(", useAttachmentUploadPreview=");
      var12.append(var5);
      var12.append(", enableSwipeToReply=");
      var12.append(var3);
      var12.append(", enableSwipeToEdit=");
      var12.append(var8);
      var12.append(", useAddBurstReaction=");
      var12.append(var1);
      var12.append(", obscureLearnMoreLabel=");
      var12.append(var10);
      var12.append(", contextType=");
      var12.append(var11);
      var12.append(")");
      return var12.toString();
   }
}
