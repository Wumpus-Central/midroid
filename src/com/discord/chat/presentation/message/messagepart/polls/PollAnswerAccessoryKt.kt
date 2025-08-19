@file:SourceDebugExtension(["SMAP\nPollAnswerAccessory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollAnswerAccessory.kt\ncom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessoryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n295#2,2:40\n*S KotlinDebug\n*F\n+ 1 PollAnswerAccessory.kt\ncom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessoryKt\n*L\n36#1:40,2\n*E\n"])

package com.discord.chat.presentation.message.messagepart.polls

import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.attachment.AttachmentType
import kotlin.jvm.internal.SourceDebugExtension

public fun List<Attachment>.getFirstImage(): Attachment? {
   val var1: java.util.Iterator = var0.iterator();

   do {
      if (!var1.hasNext()) {
         var2 = null;
         break;
      }

      var2 = var1.next();
   } while (((Attachment)var2).type() != AttachmentType.Image);

   return var2 as Attachment;
}
