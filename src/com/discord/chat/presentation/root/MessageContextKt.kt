package com.discord.chat.presentation.root

import com.discord.chat.bridge.Message
import com.discord.chat.bridge.SwipeActionsType
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.bridge.messageframe.MessageFrameType
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.chat.bridge.row.MessageRow
import com.discord.chat.bridge.truncation.Truncation
import kotlin.jvm.internal.r

public fun MessageRow.getMessageContext(): MessageContext {
   r.h(var0, "<this>");
   val var8: MessageFrame = var0.getMessageFrame();
   val var16: MessageFrameType;
   if (var8 != null) {
      var16 = var8.getType();
   } else {
      var16 = null;
   }

   val var1: Boolean;
   if (var16 === MessageFrameType.JUMP_MESSAGE_FRAME) {
      var1 = true;
   } else {
      var1 = false;
   }

   val var17: java.lang.Boolean = var0.getCanAddNewReactions();
   val var11: java.lang.Boolean = java.lang.Boolean.TRUE;
   val var7: Boolean = r.c(var17, java.lang.Boolean.TRUE);
   var var9: java.lang.String = var0.getAddReactionLabel();
   var var18: java.lang.String = var9;
   if (var9 == null) {
      var18 = "";
   }

   val var10: java.lang.String = var0.getAddNewReactionAccessibilityLabel();
   var9 = var10;
   if (var10 == null) {
      var9 = "";
   }

   val var13: ReactionsTheme = var0.getReactionsTheme();
   val var2: Boolean;
   if (var0.getMessage() is Message && r.c((var0.getMessage() as Message).getUsingGradientTheme(), var11)) {
      var2 = true;
   } else {
      var2 = false;
   }

   val var14: Truncation = var0.getTruncation();
   val var3: Boolean;
   if (var0.getMessage() is Message && r.c((var0.getMessage() as Message).getUseAttachmentGridLayout(), var11)) {
      var3 = true;
   } else {
      var3 = false;
   }

   val var4: Boolean;
   if (var0.getMessage() is Message && r.c((var0.getMessage() as Message).getUseAttachmentUploadPreview(), var11)) {
      var4 = true;
   } else {
      var4 = false;
   }

   val var5: Boolean;
   if (var0.getSwipeActions() != SwipeActionsType.REPLY && var0.getSwipeActions() != SwipeActionsType.REPLY_EDIT) {
      var5 = false;
   } else {
      var5 = true;
   }

   val var6: Boolean;
   if (var0.getSwipeActions() === SwipeActionsType.REPLY_EDIT) {
      var6 = true;
   } else {
      var6 = false;
   }

   val var21: MessageContextType = var0.getContextType();
   var var20: MessageContextType = var21;
   if (var21 == null) {
      var20 = MessageContextType.DEFAULT;
   }

   var var22: java.lang.String = var0.getReplyAccessibilityLabel();
   if (var22 == null) {
      var22 = "";
   }

   var var12: java.lang.String = var0.getForwardAccessibilityLabel();
   if (var12 == null) {
      var12 = "";
   }

   var var15: java.lang.String = var0.getThreadAccessibilityLabel();
   if (var15 == null) {
      var15 = "";
   }

   return new MessageContext(var1, var7, var18, var9, var13, var2, var14, var3, var4, var5, var6, null, var20, var22, var12, var15, 2048, null);
}
