package com.discord.chat.bridge.row

import com.discord.chat.bridge.BackgroundHighlight
import com.discord.chat.bridge.ErrorMessage
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageBase
import com.discord.chat.bridge.MessageKt
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.bridge.messageframe.MessageFrameType
import com.discord.chat.presentation.list.item.AutomodSystemMessageItem
import com.discord.chat.presentation.list.item.CallSystemMessageItem
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.DeserializationErrorMessageItem
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.presentation.list.item.SystemMessageItem
import com.discord.chat.presentation.root.MessageContext
import com.discord.chat.presentation.root.MessageContextKt
import f8.p
import kotlin.jvm.internal.q

public fun MessageBase.toChatListMessageItem(
   messageFrame: MessageFrame? = null,
   messageContext: MessageContext,
   allowChildGestures: Boolean = true,
   renderContentOnly: Boolean = false,
   reactTag: Int? = null,
   backgroundHighlight: BackgroundHighlight? = null
): ChatListItem {
   q.h(var0, "<this>");
   q.h(var2, "messageContext");
   val var8: Any;
   if (var0 is Message) {
      val var7: Message = var0 as Message;
      if (MessageKt.isSystemMessage(var0 as Message)) {
         if (MessageKt.isCallMessage(var7)) {
            var8 = new CallSystemMessageItem(var7);
         } else {
            var8 = new SystemMessageItem(var7, var2, var6);
         }
      } else if (MessageKt.isAutomodSystemMessage(var7)) {
         var8 = new AutomodSystemMessageItem(var7, var2, var3);
      } else {
         var8 = new MessageItem(var7, var1, var2, var3, var6, var5, var4);
      }
   } else {
      if (var0 !is ErrorMessage) {
         throw new p();
      }

      var8 = new DeserializationErrorMessageItem(var0 as ErrorMessage, false, 2, null);
   }

   return (ChatListItem)var8;
}

public fun MessageRow.toChatListMessageItem(): ChatListItem {
   q.h(var0, "<this>");
   val var3: MessageBase = var0.getMessage();
   val var4: MessageFrame = var0.getMessageFrame();
   val var2: MessageFrame = var0.getMessageFrame();
   val var5: MessageFrameType;
   if (var2 != null) {
      var5 = var2.getType();
   } else {
      var5 = null;
   }

   val var1: Boolean;
   if (var5 != MessageFrameType.JUMP_MESSAGE_FRAME) {
      var1 = true;
   } else {
      var1 = false;
   }

   return toChatListMessageItem(
      var3, var4, MessageContextKt.getMessageContext(var0), var1, var0.getRenderContentOnly(), var0.getReactTag(), var0.getBackgroundHighlight()
   );
}

@JvmSynthetic
fun `toChatListMessageItem$default`(
   var0: MessageBase, var1: MessageFrame, var2: MessageContext, var3: Boolean, var4: Boolean, var5: Int, var6: BackgroundHighlight, var7: Int, var8: Any
): ChatListItem {
   if ((var7 and 1) != 0) {
      var1 = null;
   }

   if ((var7 and 4) != 0) {
      var3 = true;
   }

   if ((var7 and 8) != 0) {
      var4 = false;
   }

   if ((var7 and 16) != 0) {
      var5 = null;
   }

   if ((var7 and 32) != 0) {
      var6 = null;
   }

   return toChatListMessageItem(var0, var1, var2, var3, var4, var5, var6);
}
