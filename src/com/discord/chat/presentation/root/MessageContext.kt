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
      r.h(var3, "addReactionLabel");
      r.h(var4, "addNewReactionAccessibilityLabel");
      r.h(var5, "addNewBurstReactionAccessibilityLabel");
      r.h(var14, "obscureLearnMoreLabel");
      r.h(var15, "contextType");
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
      r.h(var3, "addReactionLabel");
      r.h(var4, "addNewReactionAccessibilityLabel");
      r.h(var5, "addNewBurstReactionAccessibilityLabel");
      r.h(var14, "obscureLearnMoreLabel");
      r.h(var15, "contextType");
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
         } else {
            return this.contextType === var1.contextType;
         }
      }
   }

   public override fun hashCode(): Int {
      var var10: Byte = 1;
      var var1: Byte = this.showDivider;
      if (this.showDivider != 0) {
         var1 = 1;
      }

      var var16: Byte = this.canAddNewReactions;
      if (this.canAddNewReactions != 0) {
         var16 = 1;
      }

      val var13: Int = this.addReactionLabel.hashCode();
      val var12: Int = this.addNewReactionAccessibilityLabel.hashCode();
      val var14: Int = this.addNewBurstReactionAccessibilityLabel.hashCode();
      var var5: Int = 0;
      val var17: Int;
      if (this.reactionsTheme == null) {
         var17 = 0;
      } else {
         var17 = this.reactionsTheme.hashCode();
      }

      var var4: Byte = this.usingGradientTheme;
      if (this.usingGradientTheme != 0) {
         var4 = 1;
      }

      if (this.truncation != null) {
         var5 = this.truncation.hashCode();
      }

      var var18: Byte = this.useAttachmentGridLayout;
      if (this.useAttachmentGridLayout != 0) {
         var18 = 1;
      }

      var var19: Byte = this.useAttachmentUploadPreview;
      if (this.useAttachmentUploadPreview != 0) {
         var19 = 1;
      }

      var var20: Byte = this.enableSwipeToReply;
      if (this.enableSwipeToReply != 0) {
         var20 = 1;
      }

      var var21: Byte = this.enableSwipeToEdit;
      if (this.enableSwipeToEdit != 0) {
         var21 = 1;
      }

      if (this.useAddBurstReaction == 0) {
         var10 = this.useAddBurstReaction;
      }

      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (((((var1 * 31 + var16) * 31 + var13) * 31 + var12) * 31 + var14) * 31 + var17)
                                                                                    * 31
                                                                                 + var4
                                                                           )
                                                                           * 31
                                                                        + var5
                                                                  )
                                                                  * 31
                                                               + var18
                                                         )
                                                         * 31
                                                      + var19
                                                )
                                                * 31
                                             + var20
                                       )
                                       * 31
                                    + var21
                              )
                              * 31
                           + var10
                     )
                     * 31
                  + this.obscureLearnMoreLabel.hashCode()
            )
            * 31
         + this.contextType.hashCode();
   }

   public override fun toString(): String {
      val var1: Boolean = this.showDivider;
      val var6: Boolean = this.canAddNewReactions;
      val var11: java.lang.String = this.addReactionLabel;
      val var9: java.lang.String = this.addNewReactionAccessibilityLabel;
      val var13: java.lang.String = this.addNewBurstReactionAccessibilityLabel;
      val var12: ReactionsTheme = this.reactionsTheme;
      val var7: Boolean = this.usingGradientTheme;
      val var10: Truncation = this.truncation;
      val var4: Boolean = this.useAttachmentGridLayout;
      val var5: Boolean = this.useAttachmentUploadPreview;
      val var3: Boolean = this.enableSwipeToReply;
      val var2: Boolean = this.enableSwipeToEdit;
      val var8: Boolean = this.useAddBurstReaction;
      val var15: java.lang.String = this.obscureLearnMoreLabel;
      val var16: MessageContextType = this.contextType;
      val var14: StringBuilder = new StringBuilder();
      var14.append("MessageContext(showDivider=");
      var14.append(var1);
      var14.append(", canAddNewReactions=");
      var14.append(var6);
      var14.append(", addReactionLabel=");
      var14.append(var11);
      var14.append(", addNewReactionAccessibilityLabel=");
      var14.append(var9);
      var14.append(", addNewBurstReactionAccessibilityLabel=");
      var14.append(var13);
      var14.append(", reactionsTheme=");
      var14.append(var12);
      var14.append(", usingGradientTheme=");
      var14.append(var7);
      var14.append(", truncation=");
      var14.append(var10);
      var14.append(", useAttachmentGridLayout=");
      var14.append(var4);
      var14.append(", useAttachmentUploadPreview=");
      var14.append(var5);
      var14.append(", enableSwipeToReply=");
      var14.append(var3);
      var14.append(", enableSwipeToEdit=");
      var14.append(var2);
      var14.append(", useAddBurstReaction=");
      var14.append(var8);
      var14.append(", obscureLearnMoreLabel=");
      var14.append(var15);
      var14.append(", contextType=");
      var14.append(var16);
      var14.append(")");
      return var14.toString();
   }
}
