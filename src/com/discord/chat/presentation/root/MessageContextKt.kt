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
   val var15: MessageFrameType;
   if (var8 != null) {
      var15 = var8.getType();
   } else {
      var15 = null;
   }

   val var1: Boolean;
   if (var15 === MessageFrameType.JUMP_MESSAGE_FRAME) {
      var1 = true;
   } else {
      var1 = false;
   }

   val var16: java.lang.Boolean = var0.getCanAddNewReactions();
   val var11: java.lang.Boolean = java.lang.Boolean.TRUE;
   val var7: Boolean = r.c(var16, java.lang.Boolean.TRUE);
   var var10: java.lang.String = var0.getAddReactionLabel();
   var var9: java.lang.String = "";
   var var17: java.lang.String = var10;
   if (var10 == null) {
      var17 = "";
   }

   var10 = var0.getAddNewReactionAccessibilityLabel();
   if (var10 != null) {
      var9 = var10;
   }

   val var12: ReactionsTheme = var0.getReactionsTheme();
   val var2: Boolean;
   if (var0.getMessage() is Message && r.c((var0.getMessage() as Message).getUsingGradientTheme(), var11)) {
      var2 = true;
   } else {
      var2 = false;
   }

   val var13: Truncation = var0.getTruncation();
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

   val var19: MessageContextType = var0.getContextType();
   var var14: MessageContextType = var19;
   if (var19 == null) {
      var14 = MessageContextType.DEFAULT;
   }

   return new MessageContext(var1, var7, var17, var9, var12, var2, var13, var3, var4, var5, var6, null, var14, 2048, null);
}
