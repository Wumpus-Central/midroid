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
import eh.p
import kotlin.jvm.internal.r

public fun MessageBase.toChatListMessageItem(
   messageFrame: MessageFrame? = null,
   messageContext: MessageContext,
   allowChildGestures: Boolean = true,
   isHighlight: Boolean = false,
   renderContentOnly: Boolean = false,
   reactTag: Int? = null,
   backgroundHighlight: BackgroundHighlight? = null
): ChatListItem {
   r.h(var0, "<this>");
   r.h(var2, "messageContext");
   val var9: Any;
   if (var0 is Message) {
      val var8: Message = var0 as Message;
      if (MessageKt.isSystemMessage(var0 as Message)) {
         if (MessageKt.isCallMessage(var8)) {
            var9 = new CallSystemMessageItem(var8);
         } else {
            var9 = new SystemMessageItem(var8, var2, var7);
         }
      } else if (MessageKt.isAutomodSystemMessage(var8)) {
         var9 = new AutomodSystemMessageItem(var8, var2, var3);
      } else {
         var9 = new MessageItem(var8, var1, var2, var3, var4, var7, var6, var5);
      }
   } else {
      if (var0 !is ErrorMessage) {
         throw new p();
      }

      var9 = new DeserializationErrorMessageItem(var0 as ErrorMessage);
   }

   return (ChatListItem)var9;
}

public fun MessageRow.toChatListMessageItem(): ChatListItem {
   r.h(var0, "<this>");
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
      var3,
      var4,
      MessageContextKt.getMessageContext(var0),
      var1,
      var0.isHighlight(),
      var0.getRenderContentOnly(),
      var0.getReactTag(),
      var0.getBackgroundHighlight()
   );
}

@JvmSynthetic
fun `toChatListMessageItem$default`(
   var0: MessageBase,
   var1: MessageFrame,
   var2: MessageContext,
   var3: Boolean,
   var4: Boolean,
   var5: Boolean,
   var6: Int,
   var7: BackgroundHighlight,
   var8: Int,
   var9: Any
): ChatListItem {
   if ((var8 and 1) != 0) {
      var1 = null;
   }

   if ((var8 and 4) != 0) {
      var3 = true;
   }

   if ((var8 and 8) != 0) {
      var4 = false;
   }

   if ((var8 and 16) != 0) {
      var5 = false;
   }

   if ((var8 and 32) != 0) {
      var6 = null;
   }

   if ((var8 and 64) != 0) {
      var7 = null;
   }

   return toChatListMessageItem(var0, var1, var2, var3, var4, var5, var6, var7);
}
