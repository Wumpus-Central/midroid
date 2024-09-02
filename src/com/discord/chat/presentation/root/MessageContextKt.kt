package com.discord.chat.presentation.root

import com.discord.chat.bridge.Message
import com.discord.chat.bridge.SwipeActionsType
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.bridge.messageframe.MessageFrameType
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.chat.bridge.row.MessageRow
import com.discord.chat.bridge.truncation.Truncation
import kotlin.jvm.internal.q

public fun MessageRow.getMessageContext(): MessageContext {
   q.h(var0, "<this>");
   val var9: MessageFrame = var0.getMessageFrame();
   val var17: MessageFrameType;
   if (var9 != null) {
      var17 = var9.getType();
   } else {
      var17 = null;
   }

   val var1: Boolean;
   if (var17 === MessageFrameType.JUMP_MESSAGE_FRAME) {
      var1 = true;
   } else {
      var1 = false;
   }

   val var18: java.lang.Boolean = var0.getCanAddNewReactions();
   val var13: java.lang.Boolean = java.lang.Boolean.TRUE;
   val var8: Boolean = q.c(var18, java.lang.Boolean.TRUE);
   var var10: java.lang.String = var0.getAddReactionLabel();
   var var11: java.lang.String = "";
   var var19: java.lang.String = var10;
   if (var10 == null) {
      var19 = "";
   }

   var var12: java.lang.String = var0.getAddNewReactionAccessibilityLabel();
   var10 = var12;
   if (var12 == null) {
      var10 = "";
   }

   var12 = var0.getAddNewBurstReactionAccessibilityLabel();
   if (var12 != null) {
      var11 = var12;
   }

   val var15: ReactionsTheme = var0.getReactionsTheme();
   val var2: Boolean;
   if (var0.getMessage() is Message && q.c((var0.getMessage() as Message).getUsingGradientTheme(), var13)) {
      var2 = true;
   } else {
      var2 = false;
   }

   val var14: Truncation = var0.getTruncation();
   val var3: Boolean;
   if (var0.getMessage() is Message && q.c((var0.getMessage() as Message).getUseAttachmentGridLayout(), var13)) {
      var3 = true;
   } else {
      var3 = false;
   }

   val var4: Boolean;
   if (var0.getMessage() is Message && q.c((var0.getMessage() as Message).getUseAttachmentUploadPreview(), var13)) {
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

   val var7: Boolean;
   if (var0.getMessage() is Message && q.c((var0.getMessage() as Message).getUseAddBurstReaction(), var13)) {
      var7 = true;
   } else {
      var7 = false;
   }

   val var22: MessageContextType = var0.getContextType();
   var var16: MessageContextType = var22;
   if (var22 == null) {
      var16 = MessageContextType.DEFAULT;
   }

   return new MessageContext(var1, var8, var19, var10, var11, var15, var2, var14, var3, var4, var5, var6, var7, null, var16, 8192, null);
}
